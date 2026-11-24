.class public final La/xk70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/p7m0;

.field public k:La/ly5;

.field public l:Ljava/lang/Object;

.field public m:D

.field public n:I

.field public o:Z

.field public final synthetic p:La/ly5;

.field public q:La/w46;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/wm70;La/ly5;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/xk70;->i:B

    .line 13
    iput-object p1, p0, La/xk70;->s:Ljava/lang/Object;

    iput-object p2, p0, La/xk70;->p:La/ly5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yk70;La/ly5;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/xk70;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/xk70;->r:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/xk70;->p:La/ly5;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xk70;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/xk70;->p:La/ly5;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xk70;

    .line 9
    .line 10
    iget-object p0, p0, La/xk70;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/wm70;

    .line 13
    .line 14
    invoke-direct {p1, p0, v0, p2}, La/xk70;-><init>(La/wm70;La/ly5;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, La/xk70;

    .line 19
    .line 20
    iget-object p0, p0, La/xk70;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/yk70;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2}, La/xk70;-><init>(La/yk70;La/ly5;La/yje;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xk70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xk70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xk70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xk70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xk70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xk70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xk70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xk70;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/xk70;->p:La/ly5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/xk70;->s:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/wm70;

    .line 20
    .line 21
    sget-object v9, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v10, v0, La/xk70;->o:Z

    .line 24
    .line 25
    if-eqz v10, :cond_1

    .line 26
    .line 27
    if-ne v10, v5, :cond_0

    .line 28
    .line 29
    iget v1, v0, La/xk70;->n:I

    .line 30
    .line 31
    iget-wide v2, v0, La/xk70;->m:D

    .line 32
    .line 33
    iget-object v4, v0, La/xk70;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, La/um70;

    .line 36
    .line 37
    iget-object v10, v0, La/xk70;->l:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v11, v0, La/xk70;->q:La/w46;

    .line 40
    .line 41
    check-cast v11, La/wm70;

    .line 42
    .line 43
    iget-object v12, v0, La/xk70;->k:La/ly5;

    .line 44
    .line 45
    iget-object v13, v0, La/xk70;->j:La/p7m0;

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v14, p1

    .line 51
    .line 52
    move-wide/from16 v17, v2

    .line 53
    .line 54
    move-object v2, v12

    .line 55
    :goto_0
    move-object v15, v4

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v3, v1, La/wm70;->d:La/itt;

    .line 66
    .line 67
    invoke-virtual {v3}, La/itt;->a()D

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    cmpg-double v3, v3, v6

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-object v3, v1, La/wm70;->g:La/lg60;

    .line 76
    .line 77
    iget-object v4, v1, La/wm70;->f:La/l1u;

    .line 78
    .line 79
    invoke-virtual {v4}, La/l1u;->a()D

    .line 80
    .line 81
    .line 82
    move-result-wide v10

    .line 83
    invoke-virtual {v3, v10, v11}, La/lg60;->a(D)V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object v3, v1, La/wm70;->p:La/p7m0;

    .line 87
    .line 88
    move-object v13, v3

    .line 89
    :goto_1
    invoke-virtual {v13}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    move-object v4, v10

    .line 94
    check-cast v4, La/um70;

    .line 95
    .line 96
    iget-wide v11, v2, La/ly5;->a:D

    .line 97
    .line 98
    cmpl-double v3, v11, v6

    .line 99
    .line 100
    if-lez v3, :cond_3

    .line 101
    .line 102
    move v3, v5

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move v3, v8

    .line 105
    :goto_2
    iget-object v14, v1, La/wm70;->m:La/t0u;

    .line 106
    .line 107
    iput-object v13, v0, La/xk70;->j:La/p7m0;

    .line 108
    .line 109
    iput-object v2, v0, La/xk70;->k:La/ly5;

    .line 110
    .line 111
    iput-object v1, v0, La/xk70;->q:La/w46;

    .line 112
    .line 113
    iput-object v10, v0, La/xk70;->l:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v4, v0, La/xk70;->r:Ljava/lang/Object;

    .line 116
    .line 117
    iput-wide v11, v0, La/xk70;->m:D

    .line 118
    .line 119
    iput v3, v0, La/xk70;->n:I

    .line 120
    .line 121
    iput-boolean v5, v0, La/xk70;->o:Z

    .line 122
    .line 123
    invoke-virtual {v14, v0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    if-ne v14, v9, :cond_4

    .line 128
    .line 129
    move-object v3, v9

    .line 130
    goto :goto_6

    .line 131
    :cond_4
    move-wide/from16 v17, v11

    .line 132
    .line 133
    move-object v11, v1

    .line 134
    move v1, v3

    .line 135
    goto :goto_0

    .line 136
    :goto_3
    if-eqz v1, :cond_5

    .line 137
    .line 138
    move/from16 v16, v5

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    move/from16 v16, v8

    .line 142
    .line 143
    :goto_4
    move-object/from16 v19, v14

    .line 144
    .line 145
    check-cast v19, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v1, v11, La/wm70;->d:La/itt;

    .line 151
    .line 152
    iget-object v3, v2, La/ly5;->f:La/esr;

    .line 153
    .line 154
    move-wide/from16 v27, v6

    .line 155
    .line 156
    iget-wide v6, v2, La/ly5;->a:D

    .line 157
    .line 158
    sget-object v4, La/esr;->e:La/esr;

    .line 159
    .line 160
    if-ne v3, v4, :cond_7

    .line 161
    .line 162
    cmpl-double v3, v6, v27

    .line 163
    .line 164
    if-lez v3, :cond_7

    .line 165
    .line 166
    iget-object v3, v2, La/ly5;->b:La/lnm0;

    .line 167
    .line 168
    sget-object v4, La/lnm0;->e:La/lnm0;

    .line 169
    .line 170
    if-eq v3, v4, :cond_6

    .line 171
    .line 172
    invoke-virtual {v1}, La/itt;->a()D

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    cmpl-double v3, v3, v6

    .line 177
    .line 178
    if-lez v3, :cond_7

    .line 179
    .line 180
    :cond_6
    move/from16 v20, v5

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    move/from16 v20, v8

    .line 184
    .line 185
    :goto_5
    iget-boolean v3, v2, La/ly5;->c:Z

    .line 186
    .line 187
    invoke-virtual {v1}, La/itt;->a()D

    .line 188
    .line 189
    .line 190
    move-result-wide v22

    .line 191
    iget-wide v6, v2, La/ly5;->e:D

    .line 192
    .line 193
    double-to-int v1, v6

    .line 194
    const/16 v25, 0x0

    .line 195
    .line 196
    const/16 v26, 0x80

    .line 197
    .line 198
    move/from16 v24, v1

    .line 199
    .line 200
    move/from16 v21, v3

    .line 201
    .line 202
    invoke-static/range {v15 .. v26}, La/um70;->a(La/um70;ZDLjava/lang/String;ZZDIZI)La/um70;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v13, v10, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_8

    .line 211
    .line 212
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_6
    return-object v3

    .line 215
    :cond_8
    move-object v1, v11

    .line 216
    move-wide/from16 v6, v27

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :pswitch_0
    move-wide/from16 v27, v6

    .line 221
    .line 222
    iget-object v1, v0, La/xk70;->r:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, La/yk70;

    .line 225
    .line 226
    sget-object v6, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget-boolean v7, v0, La/xk70;->o:Z

    .line 229
    .line 230
    if-eqz v7, :cond_a

    .line 231
    .line 232
    if-ne v7, v5, :cond_9

    .line 233
    .line 234
    iget v1, v0, La/xk70;->n:I

    .line 235
    .line 236
    iget-wide v2, v0, La/xk70;->m:D

    .line 237
    .line 238
    iget-object v4, v0, La/xk70;->s:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v4, La/sk70;

    .line 241
    .line 242
    iget-object v7, v0, La/xk70;->l:Ljava/lang/Object;

    .line 243
    .line 244
    iget-object v9, v0, La/xk70;->q:La/w46;

    .line 245
    .line 246
    check-cast v9, La/yk70;

    .line 247
    .line 248
    iget-object v10, v0, La/xk70;->k:La/ly5;

    .line 249
    .line 250
    iget-object v11, v0, La/xk70;->j:La/p7m0;

    .line 251
    .line 252
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v12, p1

    .line 256
    .line 257
    move-wide v15, v2

    .line 258
    move-object v2, v10

    .line 259
    :goto_7
    move-object v13, v4

    .line 260
    goto :goto_a

    .line 261
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_d

    .line 265
    .line 266
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iget-object v3, v1, La/yk70;->i:La/itt;

    .line 270
    .line 271
    invoke-virtual {v3}, La/itt;->a()D

    .line 272
    .line 273
    .line 274
    move-result-wide v3

    .line 275
    cmpg-double v3, v3, v27

    .line 276
    .line 277
    if-nez v3, :cond_b

    .line 278
    .line 279
    iget-object v3, v1, La/yk70;->l:La/lg60;

    .line 280
    .line 281
    iget-object v4, v1, La/yk70;->k:La/l1u;

    .line 282
    .line 283
    invoke-virtual {v4}, La/l1u;->a()D

    .line 284
    .line 285
    .line 286
    move-result-wide v9

    .line 287
    invoke-virtual {v3, v9, v10}, La/lg60;->a(D)V

    .line 288
    .line 289
    .line 290
    :cond_b
    iget-object v3, v1, La/yk70;->y:La/p7m0;

    .line 291
    .line 292
    move-object v11, v3

    .line 293
    :goto_8
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    move-object v4, v7

    .line 298
    check-cast v4, La/sk70;

    .line 299
    .line 300
    iget-wide v9, v2, La/ly5;->a:D

    .line 301
    .line 302
    cmpl-double v3, v9, v27

    .line 303
    .line 304
    if-lez v3, :cond_c

    .line 305
    .line 306
    move v3, v5

    .line 307
    goto :goto_9

    .line 308
    :cond_c
    move v3, v8

    .line 309
    :goto_9
    iget-object v12, v1, La/yk70;->t:La/t0u;

    .line 310
    .line 311
    iput-object v11, v0, La/xk70;->j:La/p7m0;

    .line 312
    .line 313
    iput-object v2, v0, La/xk70;->k:La/ly5;

    .line 314
    .line 315
    iput-object v1, v0, La/xk70;->q:La/w46;

    .line 316
    .line 317
    iput-object v7, v0, La/xk70;->l:Ljava/lang/Object;

    .line 318
    .line 319
    iput-object v4, v0, La/xk70;->s:Ljava/lang/Object;

    .line 320
    .line 321
    iput-wide v9, v0, La/xk70;->m:D

    .line 322
    .line 323
    iput v3, v0, La/xk70;->n:I

    .line 324
    .line 325
    iput-boolean v5, v0, La/xk70;->o:Z

    .line 326
    .line 327
    invoke-virtual {v12, v0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    if-ne v12, v6, :cond_d

    .line 332
    .line 333
    move-object v3, v6

    .line 334
    goto/16 :goto_d

    .line 335
    .line 336
    :cond_d
    move-wide v15, v9

    .line 337
    move-object v9, v1

    .line 338
    move v1, v3

    .line 339
    goto :goto_7

    .line 340
    :goto_a
    if-eqz v1, :cond_e

    .line 341
    .line 342
    move v14, v5

    .line 343
    goto :goto_b

    .line 344
    :cond_e
    move v14, v8

    .line 345
    :goto_b
    move-object/from16 v17, v12

    .line 346
    .line 347
    check-cast v17, Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v1, v9, La/yk70;->i:La/itt;

    .line 353
    .line 354
    iget-object v3, v2, La/ly5;->f:La/esr;

    .line 355
    .line 356
    move-object v10, v6

    .line 357
    iget-wide v5, v2, La/ly5;->a:D

    .line 358
    .line 359
    sget-object v12, La/esr;->e:La/esr;

    .line 360
    .line 361
    if-ne v3, v12, :cond_10

    .line 362
    .line 363
    cmpl-double v3, v5, v27

    .line 364
    .line 365
    if-lez v3, :cond_10

    .line 366
    .line 367
    iget-object v3, v2, La/ly5;->b:La/lnm0;

    .line 368
    .line 369
    sget-object v12, La/lnm0;->e:La/lnm0;

    .line 370
    .line 371
    if-eq v3, v12, :cond_f

    .line 372
    .line 373
    sget-object v12, La/lnm0;->b:La/lnm0;

    .line 374
    .line 375
    if-ne v3, v12, :cond_10

    .line 376
    .line 377
    invoke-virtual {v1}, La/itt;->a()D

    .line 378
    .line 379
    .line 380
    move-result-wide v18

    .line 381
    new-instance v3, Ljava/math/BigDecimal;

    .line 382
    .line 383
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-direct {v3, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    new-instance v5, Ljava/math/BigDecimal;

    .line 391
    .line 392
    const/4 v6, 0x2

    .line 393
    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3, v5}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 401
    .line 402
    .line 403
    move-result-wide v5

    .line 404
    cmpg-double v3, v18, v5

    .line 405
    .line 406
    if-nez v3, :cond_10

    .line 407
    .line 408
    :cond_f
    const/16 v18, 0x1

    .line 409
    .line 410
    goto :goto_c

    .line 411
    :cond_10
    move/from16 v18, v8

    .line 412
    .line 413
    :goto_c
    iget-boolean v3, v2, La/ly5;->c:Z

    .line 414
    .line 415
    invoke-virtual {v1}, La/itt;->a()D

    .line 416
    .line 417
    .line 418
    move-result-wide v20

    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const/16 v23, 0x40

    .line 422
    .line 423
    move/from16 v19, v3

    .line 424
    .line 425
    invoke-static/range {v13 .. v23}, La/sk70;->a(La/sk70;ZDLjava/lang/String;ZZDZI)La/sk70;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-virtual {v11, v7, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_11

    .line 434
    .line 435
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    :goto_d
    return-object v3

    .line 438
    :cond_11
    move-object v1, v9

    .line 439
    move-object v6, v10

    .line 440
    const/4 v5, 0x1

    .line 441
    goto/16 :goto_8

    .line 442
    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
