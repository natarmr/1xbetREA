.class public final La/dgb0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/kgb0;


# direct methods
.method public synthetic constructor <init>(La/kgb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dgb0;->i:B

    iput-object p1, p0, La/dgb0;->k:La/kgb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/dgb0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/dgb0;->k:La/kgb0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/dgb0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/dgb0;-><init>(La/kgb0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/dgb0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/dgb0;-><init>(La/kgb0;La/yje;B)V

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
    iget-byte v0, p0, La/dgb0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/dgb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/dgb0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/dgb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/dgb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/dgb0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/dgb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dgb0;->i:B

    .line 4
    .line 5
    sget-object v2, La/wee;->a:La/wee;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v0, La/dgb0;->k:La/kgb0;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    sget-object v8, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, v0, La/dgb0;->j:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v6, :cond_1

    .line 26
    .line 27
    if-ne v9, v7, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v3, p1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v5, La/kgb0;->F:La/yuu;

    .line 50
    .line 51
    iput-byte v6, v0, La/dgb0;->j:B

    .line 52
    .line 53
    invoke-virtual {v3, v0}, La/yuu;->r(La/zje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-ne v3, v8, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    check-cast v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_7

    .line 67
    .line 68
    iget-object v3, v5, La/kgb0;->G:La/eot;

    .line 69
    .line 70
    iput-byte v7, v0, La/dgb0;->j:B

    .line 71
    .line 72
    invoke-virtual {v3, v0}, La/eot;->a(La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v8, :cond_4

    .line 77
    .line 78
    :goto_1
    move-object v3, v8

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    :goto_2
    check-cast v0, La/cfb0;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    new-instance v2, La/bfe;

    .line 85
    .line 86
    invoke-direct {v2, v0}, La/bfe;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    move-object v14, v2

    .line 90
    sget v0, La/kgb0;->k0:I

    .line 91
    .line 92
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 93
    .line 94
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-object v3, v1

    .line 102
    check-cast v3, La/ufb0;

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const/16 v15, 0x7ff

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    const/4 v5, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    invoke-static/range {v3 .. v15}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    sget v0, La/kgb0;->k0:I

    .line 128
    .line 129
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 130
    .line 131
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-object v2, v0

    .line 139
    check-cast v2, La/ufb0;

    .line 140
    .line 141
    sget-object v13, La/zee;->a:La/zee;

    .line 142
    .line 143
    const/16 v14, 0x7ff

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v5, 0x0

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    const/4 v11, 0x0

    .line 154
    const/4 v12, 0x0

    .line 155
    invoke-static/range {v2 .. v14}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_8

    .line 164
    .line 165
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    :goto_4
    return-object v3

    .line 168
    :pswitch_0
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 169
    .line 170
    sget-object v8, La/wne;->a:La/wne;

    .line 171
    .line 172
    iget-byte v9, v0, La/dgb0;->j:B

    .line 173
    .line 174
    const/16 v10, 0xa

    .line 175
    .line 176
    if-eqz v9, :cond_b

    .line 177
    .line 178
    if-eq v9, v6, :cond_a

    .line 179
    .line 180
    if-ne v9, v7, :cond_9

    .line 181
    .line 182
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v0, p1

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_c

    .line 192
    .line 193
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v0, p1

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, La/ufb0;

    .line 207
    .line 208
    iget-boolean v3, v3, La/ufb0;->e:Z

    .line 209
    .line 210
    if-eqz v3, :cond_12

    .line 211
    .line 212
    iget-object v3, v5, La/kgb0;->Z:La/sff0;

    .line 213
    .line 214
    iget-boolean v3, v3, La/sff0;->O0:Z

    .line 215
    .line 216
    if-eqz v3, :cond_d

    .line 217
    .line 218
    iget-object v3, v5, La/kgb0;->y:La/lyt;

    .line 219
    .line 220
    sget-object v4, La/mvc;->k:La/mvc;

    .line 221
    .line 222
    iput-byte v6, v0, La/dgb0;->j:B

    .line 223
    .line 224
    invoke-virtual {v3, v4, v0}, La/lyt;->b(La/mvc;La/zje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-ne v0, v8, :cond_c

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_c
    :goto_5
    check-cast v0, Ljava/lang/Iterable;

    .line 232
    .line 233
    new-instance v3, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-static {v0, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_f

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, La/uvc;

    .line 257
    .line 258
    invoke-static {v4}, La/hew0;->W(La/uvc;)La/lr5;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_d
    iget-object v3, v5, La/kgb0;->z:La/fmt;

    .line 267
    .line 268
    iput-byte v7, v0, La/dgb0;->j:B

    .line 269
    .line 270
    invoke-virtual {v3, v0}, La/fmt;->a(La/zje;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-ne v0, v8, :cond_e

    .line 275
    .line 276
    :goto_7
    move-object v3, v8

    .line 277
    goto/16 :goto_c

    .line 278
    .line 279
    :cond_e
    :goto_8
    check-cast v0, Ljava/lang/Iterable;

    .line 280
    .line 281
    new-instance v3, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-static {v0, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-eqz v4, :cond_f

    .line 299
    .line 300
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    check-cast v4, La/kr5;

    .line 305
    .line 306
    invoke-static {v4}, La/hew0;->V(La/kr5;)La/lr5;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_f
    sget v0, La/kgb0;->k0:I

    .line 315
    .line 316
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 317
    .line 318
    :cond_10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-object v4, v1

    .line 326
    check-cast v4, La/ufb0;

    .line 327
    .line 328
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-nez v5, :cond_11

    .line 333
    .line 334
    new-instance v5, La/bfe;

    .line 335
    .line 336
    new-instance v6, La/deb0;

    .line 337
    .line 338
    invoke-direct {v6, v3}, La/deb0;-><init>(Ljava/util/ArrayList;)V

    .line 339
    .line 340
    .line 341
    invoke-direct {v5, v6}, La/bfe;-><init>(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    move-object v12, v5

    .line 345
    goto :goto_a

    .line 346
    :cond_11
    move-object v12, v2

    .line 347
    :goto_a
    const/4 v15, 0x0

    .line 348
    const/16 v16, 0xeff

    .line 349
    .line 350
    const/4 v5, 0x0

    .line 351
    const/4 v6, 0x0

    .line 352
    const/4 v7, 0x0

    .line 353
    const/4 v8, 0x0

    .line 354
    const/4 v9, 0x0

    .line 355
    const/4 v10, 0x0

    .line 356
    const/4 v11, 0x0

    .line 357
    const/4 v13, 0x0

    .line 358
    const/4 v14, 0x0

    .line 359
    invoke-static/range {v4 .. v16}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-virtual {v0, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_10

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_12
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 371
    .line 372
    :cond_13
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-object v2, v1

    .line 380
    check-cast v2, La/ufb0;

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/16 v14, 0xeff

    .line 384
    .line 385
    const/4 v3, 0x0

    .line 386
    const/4 v4, 0x0

    .line 387
    const/4 v5, 0x0

    .line 388
    const/4 v6, 0x0

    .line 389
    const/4 v7, 0x0

    .line 390
    const/4 v8, 0x0

    .line 391
    const/4 v9, 0x0

    .line 392
    sget-object v10, La/zee;->a:La/zee;

    .line 393
    .line 394
    const/4 v11, 0x0

    .line 395
    const/4 v12, 0x0

    .line 396
    invoke-static/range {v2 .. v14}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_13

    .line 405
    .line 406
    :goto_b
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    :goto_c
    return-object v3

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
