.class public final La/a4u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/d4u;

.field public final synthetic m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic n:Z

.field public o:La/kmq;

.field public p:La/gmq;

.field public q:La/gmq;

.field public r:La/gmq;

.field public s:La/gmq;

.field public t:La/gmq;

.field public u:La/gmq;

.field public v:La/gmq;

.field public w:La/gmq;

.field public x:I


# direct methods
.method public constructor <init>(La/yje;La/d4u;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, La/a4u;->l:La/d4u;

    .line 2
    .line 3
    iput-object p3, p0, La/a4u;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 4
    .line 5
    iput-boolean p4, p0, La/a4u;->n:Z

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p3, La/yje;

    .line 4
    .line 5
    new-instance v0, La/a4u;

    .line 6
    .line 7
    iget-object v1, p0, La/a4u;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 8
    .line 9
    iget-boolean v2, p0, La/a4u;->n:Z

    .line 10
    .line 11
    iget-object p0, p0, La/a4u;->l:La/d4u;

    .line 12
    .line 13
    invoke-direct {v0, p3, p0, v1, v2}, La/a4u;-><init>(La/yje;La/d4u;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/a4u;->j:La/kmq;

    .line 17
    .line 18
    iput-object p2, v0, La/a4u;->k:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/a4u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/a4u;->i:B

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v10, 0x1

    .line 9
    const/16 v11, 0xc

    .line 10
    .line 11
    iget-object v12, v0, La/a4u;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 12
    .line 13
    iget-object v13, v0, La/a4u;->l:La/d4u;

    .line 14
    .line 15
    const/4 v14, 0x0

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v14

    .line 25
    :pswitch_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_c

    .line 29
    .line 30
    :pswitch_1
    iget-object v2, v0, La/a4u;->w:La/gmq;

    .line 31
    .line 32
    check-cast v2, La/gmq;

    .line 33
    .line 34
    iget-object v11, v0, La/a4u;->v:La/gmq;

    .line 35
    .line 36
    check-cast v11, La/gmq;

    .line 37
    .line 38
    iget-object v12, v0, La/a4u;->u:La/gmq;

    .line 39
    .line 40
    check-cast v12, La/gmq;

    .line 41
    .line 42
    iget-object v13, v0, La/a4u;->t:La/gmq;

    .line 43
    .line 44
    check-cast v13, La/gmq;

    .line 45
    .line 46
    iget-object v15, v0, La/a4u;->s:La/gmq;

    .line 47
    .line 48
    check-cast v15, La/gmq;

    .line 49
    .line 50
    iget-object v3, v0, La/a4u;->r:La/gmq;

    .line 51
    .line 52
    check-cast v3, La/gmq;

    .line 53
    .line 54
    iget-object v4, v0, La/a4u;->q:La/gmq;

    .line 55
    .line 56
    check-cast v4, La/gmq;

    .line 57
    .line 58
    iget-object v5, v0, La/a4u;->p:La/gmq;

    .line 59
    .line 60
    check-cast v5, La/gmq;

    .line 61
    .line 62
    iget-object v6, v0, La/a4u;->o:La/kmq;

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move/from16 v22, v9

    .line 68
    .line 69
    move-object v9, v15

    .line 70
    move-object v15, v2

    .line 71
    move-object/from16 v2, p1

    .line 72
    .line 73
    goto/16 :goto_a

    .line 74
    .line 75
    :pswitch_2
    iget v2, v0, La/a4u;->x:I

    .line 76
    .line 77
    iget-object v3, v0, La/a4u;->v:La/gmq;

    .line 78
    .line 79
    check-cast v3, La/gmq;

    .line 80
    .line 81
    iget-object v4, v0, La/a4u;->u:La/gmq;

    .line 82
    .line 83
    check-cast v4, La/gmq;

    .line 84
    .line 85
    iget-object v5, v0, La/a4u;->t:La/gmq;

    .line 86
    .line 87
    check-cast v5, La/gmq;

    .line 88
    .line 89
    iget-object v6, v0, La/a4u;->s:La/gmq;

    .line 90
    .line 91
    check-cast v6, La/gmq;

    .line 92
    .line 93
    iget-object v11, v0, La/a4u;->r:La/gmq;

    .line 94
    .line 95
    check-cast v11, La/gmq;

    .line 96
    .line 97
    iget-object v15, v0, La/a4u;->q:La/gmq;

    .line 98
    .line 99
    check-cast v15, La/gmq;

    .line 100
    .line 101
    iget-object v7, v0, La/a4u;->p:La/gmq;

    .line 102
    .line 103
    check-cast v7, La/gmq;

    .line 104
    .line 105
    iget-object v8, v0, La/a4u;->o:La/kmq;

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v22, v11

    .line 111
    .line 112
    move-object v11, v3

    .line 113
    move-object/from16 v3, v22

    .line 114
    .line 115
    move/from16 v22, v9

    .line 116
    .line 117
    move-object v9, v6

    .line 118
    move-object v6, v8

    .line 119
    move-object v8, v5

    .line 120
    move-object v5, v7

    .line 121
    move-object v7, v4

    .line 122
    move-object v4, v15

    .line 123
    move-object/from16 v15, p1

    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :pswitch_3
    iget v2, v0, La/a4u;->x:I

    .line 128
    .line 129
    iget-object v3, v0, La/a4u;->u:La/gmq;

    .line 130
    .line 131
    check-cast v3, La/gmq;

    .line 132
    .line 133
    iget-object v4, v0, La/a4u;->t:La/gmq;

    .line 134
    .line 135
    check-cast v4, La/gmq;

    .line 136
    .line 137
    iget-object v5, v0, La/a4u;->s:La/gmq;

    .line 138
    .line 139
    check-cast v5, La/gmq;

    .line 140
    .line 141
    iget-object v6, v0, La/a4u;->r:La/gmq;

    .line 142
    .line 143
    check-cast v6, La/gmq;

    .line 144
    .line 145
    iget-object v7, v0, La/a4u;->q:La/gmq;

    .line 146
    .line 147
    check-cast v7, La/gmq;

    .line 148
    .line 149
    iget-object v8, v0, La/a4u;->p:La/gmq;

    .line 150
    .line 151
    check-cast v8, La/gmq;

    .line 152
    .line 153
    iget-object v11, v0, La/a4u;->o:La/kmq;

    .line 154
    .line 155
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move/from16 v22, v9

    .line 159
    .line 160
    move-object/from16 v9, p1

    .line 161
    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :pswitch_4
    iget v2, v0, La/a4u;->x:I

    .line 165
    .line 166
    iget-object v3, v0, La/a4u;->t:La/gmq;

    .line 167
    .line 168
    check-cast v3, La/gmq;

    .line 169
    .line 170
    iget-object v4, v0, La/a4u;->s:La/gmq;

    .line 171
    .line 172
    check-cast v4, La/gmq;

    .line 173
    .line 174
    iget-object v5, v0, La/a4u;->r:La/gmq;

    .line 175
    .line 176
    check-cast v5, La/gmq;

    .line 177
    .line 178
    iget-object v6, v0, La/a4u;->q:La/gmq;

    .line 179
    .line 180
    check-cast v6, La/gmq;

    .line 181
    .line 182
    iget-object v7, v0, La/a4u;->p:La/gmq;

    .line 183
    .line 184
    check-cast v7, La/gmq;

    .line 185
    .line 186
    iget-object v8, v0, La/a4u;->o:La/kmq;

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-object v11, v4

    .line 192
    move-object v4, v3

    .line 193
    move-object v3, v7

    .line 194
    move-object v7, v6

    .line 195
    move-object v6, v5

    .line 196
    move-object v5, v11

    .line 197
    move-object v11, v8

    .line 198
    move-object/from16 v8, p1

    .line 199
    .line 200
    goto/16 :goto_7

    .line 201
    .line 202
    :pswitch_5
    iget v2, v0, La/a4u;->x:I

    .line 203
    .line 204
    iget-object v3, v0, La/a4u;->r:La/gmq;

    .line 205
    .line 206
    check-cast v3, La/gmq;

    .line 207
    .line 208
    iget-object v4, v0, La/a4u;->q:La/gmq;

    .line 209
    .line 210
    check-cast v4, La/gmq;

    .line 211
    .line 212
    iget-object v5, v0, La/a4u;->p:La/gmq;

    .line 213
    .line 214
    check-cast v5, La/gmq;

    .line 215
    .line 216
    iget-object v6, v0, La/a4u;->o:La/kmq;

    .line 217
    .line 218
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move-object/from16 v7, p1

    .line 222
    .line 223
    goto/16 :goto_4

    .line 224
    .line 225
    :pswitch_6
    iget v2, v0, La/a4u;->x:I

    .line 226
    .line 227
    iget-object v3, v0, La/a4u;->q:La/gmq;

    .line 228
    .line 229
    check-cast v3, La/gmq;

    .line 230
    .line 231
    iget-object v4, v0, La/a4u;->p:La/gmq;

    .line 232
    .line 233
    check-cast v4, La/gmq;

    .line 234
    .line 235
    iget-object v5, v0, La/a4u;->o:La/kmq;

    .line 236
    .line 237
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    move-object v6, v4

    .line 241
    move-object v4, v3

    .line 242
    move-object v3, v5

    .line 243
    move-object v5, v6

    .line 244
    move-object/from16 v6, p1

    .line 245
    .line 246
    goto/16 :goto_3

    .line 247
    .line 248
    :pswitch_7
    iget v2, v0, La/a4u;->x:I

    .line 249
    .line 250
    iget-object v3, v0, La/a4u;->p:La/gmq;

    .line 251
    .line 252
    check-cast v3, La/gmq;

    .line 253
    .line 254
    iget-object v4, v0, La/a4u;->o:La/kmq;

    .line 255
    .line 256
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    move-object/from16 v5, p1

    .line 260
    .line 261
    goto/16 :goto_2

    .line 262
    .line 263
    :pswitch_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iget-object v4, v0, La/a4u;->j:La/kmq;

    .line 267
    .line 268
    iget-object v2, v0, La/a4u;->k:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v2, Ljava/lang/Number;

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    invoke-virtual {v13}, La/d4u;->b()La/sff0;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 281
    .line 282
    iget-object v3, v3, La/mum0;->l:La/rhb0;

    .line 283
    .line 284
    sget-object v5, La/rhb0;->b:La/rhb0;

    .line 285
    .line 286
    iget-boolean v6, v0, La/a4u;->n:Z

    .line 287
    .line 288
    if-ne v3, v5, :cond_0

    .line 289
    .line 290
    if-nez v6, :cond_0

    .line 291
    .line 292
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 293
    .line 294
    sget-object v3, La/iun;->a:La/iun;

    .line 295
    .line 296
    new-instance v5, La/j0g0;

    .line 297
    .line 298
    invoke-direct {v5, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    new-instance v3, La/eu4;

    .line 302
    .line 303
    invoke-direct {v3, v5, v11}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_0
    invoke-virtual {v13}, La/d4u;->b()La/sff0;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    iget-boolean v3, v3, La/sff0;->X0:Z

    .line 312
    .line 313
    if-nez v3, :cond_1

    .line 314
    .line 315
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 316
    .line 317
    sget-object v3, La/iun;->a:La/iun;

    .line 318
    .line 319
    new-instance v5, La/j0g0;

    .line 320
    .line 321
    invoke-direct {v5, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    new-instance v3, La/eu4;

    .line 325
    .line 326
    invoke-direct {v3, v5, v11}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_1
    invoke-virtual {v13}, La/d4u;->b()La/sff0;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    iget-boolean v3, v3, La/sff0;->O0:Z

    .line 335
    .line 336
    if-eqz v3, :cond_2

    .line 337
    .line 338
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 339
    .line 340
    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-eqz v3, :cond_2

    .line 345
    .line 346
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 347
    .line 348
    sget-object v3, La/iun;->a:La/iun;

    .line 349
    .line 350
    new-instance v5, La/j0g0;

    .line 351
    .line 352
    invoke-direct {v5, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    new-instance v3, La/eu4;

    .line 356
    .line 357
    invoke-direct {v3, v5, v11}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 358
    .line 359
    .line 360
    goto :goto_1

    .line 361
    :cond_2
    invoke-virtual {v13}, La/d4u;->b()La/sff0;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iget-boolean v3, v3, La/sff0;->O0:Z

    .line 366
    .line 367
    if-eqz v3, :cond_3

    .line 368
    .line 369
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 370
    .line 371
    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-nez v3, :cond_3

    .line 376
    .line 377
    new-instance v3, La/n3u;

    .line 378
    .line 379
    invoke-direct {v3, v13, v14, v9}, La/n3u;-><init>(La/d4u;La/yje;B)V

    .line 380
    .line 381
    .line 382
    new-instance v5, La/vsg0;

    .line 383
    .line 384
    invoke-direct {v5, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 385
    .line 386
    .line 387
    :goto_0
    move-object v3, v5

    .line 388
    goto :goto_1

    .line 389
    :cond_3
    new-instance v3, La/j3u;

    .line 390
    .line 391
    invoke-direct {v3, v14, v13, v12, v6}, La/j3u;-><init>(La/yje;La/d4u;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V

    .line 392
    .line 393
    .line 394
    new-instance v5, La/vsg0;

    .line 395
    .line 396
    invoke-direct {v5, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 397
    .line 398
    .line 399
    new-instance v3, La/cbq;

    .line 400
    .line 401
    const/16 v6, 0x1c

    .line 402
    .line 403
    invoke-direct {v3, v5, v14, v6}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 404
    .line 405
    .line 406
    new-instance v5, La/vsg0;

    .line 407
    .line 408
    invoke-direct {v5, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 409
    .line 410
    .line 411
    goto :goto_0

    .line 412
    :goto_1
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 413
    .line 414
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 415
    .line 416
    iput-object v4, v0, La/a4u;->o:La/kmq;

    .line 417
    .line 418
    move-object v5, v3

    .line 419
    check-cast v5, La/gmq;

    .line 420
    .line 421
    iput-object v5, v0, La/a4u;->p:La/gmq;

    .line 422
    .line 423
    iput v2, v0, La/a4u;->x:I

    .line 424
    .line 425
    iput-byte v10, v0, La/a4u;->i:B

    .line 426
    .line 427
    invoke-virtual {v13, v2, v0, v12}, La/d4u;->d(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    if-ne v5, v1, :cond_4

    .line 432
    .line 433
    goto/16 :goto_b

    .line 434
    .line 435
    :cond_4
    :goto_2
    check-cast v5, La/gmq;

    .line 436
    .line 437
    sget-object v6, La/sip;->c:La/sip;

    .line 438
    .line 439
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 440
    .line 441
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v4, v0, La/a4u;->o:La/kmq;

    .line 444
    .line 445
    move-object v7, v3

    .line 446
    check-cast v7, La/gmq;

    .line 447
    .line 448
    iput-object v7, v0, La/a4u;->p:La/gmq;

    .line 449
    .line 450
    move-object v7, v5

    .line 451
    check-cast v7, La/gmq;

    .line 452
    .line 453
    iput-object v7, v0, La/a4u;->q:La/gmq;

    .line 454
    .line 455
    iput v2, v0, La/a4u;->x:I

    .line 456
    .line 457
    const/4 v7, 0x2

    .line 458
    iput-byte v7, v0, La/a4u;->i:B

    .line 459
    .line 460
    invoke-virtual {v13, v6, v12, v0}, La/d4u;->e(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zje;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    if-ne v6, v1, :cond_5

    .line 465
    .line 466
    goto/16 :goto_b

    .line 467
    .line 468
    :cond_5
    move-object/from16 v23, v5

    .line 469
    .line 470
    move-object v5, v3

    .line 471
    move-object v3, v4

    .line 472
    move-object/from16 v4, v23

    .line 473
    .line 474
    :goto_3
    check-cast v6, La/gmq;

    .line 475
    .line 476
    sget-object v7, La/sip;->b:La/sip;

    .line 477
    .line 478
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 479
    .line 480
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 481
    .line 482
    iput-object v3, v0, La/a4u;->o:La/kmq;

    .line 483
    .line 484
    move-object v8, v5

    .line 485
    check-cast v8, La/gmq;

    .line 486
    .line 487
    iput-object v8, v0, La/a4u;->p:La/gmq;

    .line 488
    .line 489
    move-object v8, v4

    .line 490
    check-cast v8, La/gmq;

    .line 491
    .line 492
    iput-object v8, v0, La/a4u;->q:La/gmq;

    .line 493
    .line 494
    move-object v8, v6

    .line 495
    check-cast v8, La/gmq;

    .line 496
    .line 497
    iput-object v8, v0, La/a4u;->r:La/gmq;

    .line 498
    .line 499
    iput v2, v0, La/a4u;->x:I

    .line 500
    .line 501
    const/4 v8, 0x3

    .line 502
    iput-byte v8, v0, La/a4u;->i:B

    .line 503
    .line 504
    invoke-virtual {v13, v7, v12, v0}, La/d4u;->e(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zje;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v7

    .line 508
    if-ne v7, v1, :cond_6

    .line 509
    .line 510
    goto/16 :goto_b

    .line 511
    .line 512
    :cond_6
    move-object/from16 v23, v6

    .line 513
    .line 514
    move-object v6, v3

    .line 515
    move-object/from16 v3, v23

    .line 516
    .line 517
    :goto_4
    check-cast v7, La/gmq;

    .line 518
    .line 519
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    sget-object v8, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 523
    .line 524
    invoke-static {v12, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v8

    .line 528
    if-eqz v8, :cond_8

    .line 529
    .line 530
    iget-object v8, v13, La/d4u;->a:La/lbu;

    .line 531
    .line 532
    invoke-virtual {v8}, La/lbu;->j()Z

    .line 533
    .line 534
    .line 535
    move-result v8

    .line 536
    if-eqz v8, :cond_7

    .line 537
    .line 538
    goto :goto_5

    .line 539
    :cond_7
    new-instance v8, La/oed;

    .line 540
    .line 541
    invoke-direct {v8, v13, v14}, La/oed;-><init>(La/d4u;La/yje;)V

    .line 542
    .line 543
    .line 544
    new-instance v11, La/vsg0;

    .line 545
    .line 546
    invoke-direct {v11, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 547
    .line 548
    .line 549
    goto :goto_6

    .line 550
    :cond_8
    :goto_5
    sget-object v8, La/j0g0;->b:La/e0g0;

    .line 551
    .line 552
    sget-object v8, La/iun;->a:La/iun;

    .line 553
    .line 554
    new-instance v15, La/j0g0;

    .line 555
    .line 556
    invoke-direct {v15, v8}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    new-instance v8, La/eu4;

    .line 560
    .line 561
    invoke-direct {v8, v15, v11}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 562
    .line 563
    .line 564
    move-object v11, v8

    .line 565
    :goto_6
    sget-object v8, La/sip;->c:La/sip;

    .line 566
    .line 567
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 568
    .line 569
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 570
    .line 571
    iput-object v6, v0, La/a4u;->o:La/kmq;

    .line 572
    .line 573
    move-object v15, v5

    .line 574
    check-cast v15, La/gmq;

    .line 575
    .line 576
    iput-object v15, v0, La/a4u;->p:La/gmq;

    .line 577
    .line 578
    move-object v15, v4

    .line 579
    check-cast v15, La/gmq;

    .line 580
    .line 581
    iput-object v15, v0, La/a4u;->q:La/gmq;

    .line 582
    .line 583
    move-object v15, v3

    .line 584
    check-cast v15, La/gmq;

    .line 585
    .line 586
    iput-object v15, v0, La/a4u;->r:La/gmq;

    .line 587
    .line 588
    move-object v15, v7

    .line 589
    check-cast v15, La/gmq;

    .line 590
    .line 591
    iput-object v15, v0, La/a4u;->s:La/gmq;

    .line 592
    .line 593
    move-object v15, v11

    .line 594
    check-cast v15, La/gmq;

    .line 595
    .line 596
    iput-object v15, v0, La/a4u;->t:La/gmq;

    .line 597
    .line 598
    iput v2, v0, La/a4u;->x:I

    .line 599
    .line 600
    const/4 v15, 0x4

    .line 601
    iput-byte v15, v0, La/a4u;->i:B

    .line 602
    .line 603
    invoke-virtual {v13, v8, v12, v2, v0}, La/d4u;->c(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ILa/zje;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    if-ne v8, v1, :cond_9

    .line 608
    .line 609
    goto/16 :goto_b

    .line 610
    .line 611
    :cond_9
    move-object/from16 v23, v6

    .line 612
    .line 613
    move-object v6, v3

    .line 614
    move-object v3, v5

    .line 615
    move-object v5, v7

    .line 616
    move-object v7, v4

    .line 617
    move-object v4, v11

    .line 618
    move-object/from16 v11, v23

    .line 619
    .line 620
    :goto_7
    check-cast v8, La/gmq;

    .line 621
    .line 622
    sget-object v15, La/sip;->b:La/sip;

    .line 623
    .line 624
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 625
    .line 626
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 627
    .line 628
    iput-object v11, v0, La/a4u;->o:La/kmq;

    .line 629
    .line 630
    move/from16 v22, v9

    .line 631
    .line 632
    move-object v9, v3

    .line 633
    check-cast v9, La/gmq;

    .line 634
    .line 635
    iput-object v9, v0, La/a4u;->p:La/gmq;

    .line 636
    .line 637
    move-object v9, v7

    .line 638
    check-cast v9, La/gmq;

    .line 639
    .line 640
    iput-object v9, v0, La/a4u;->q:La/gmq;

    .line 641
    .line 642
    move-object v9, v6

    .line 643
    check-cast v9, La/gmq;

    .line 644
    .line 645
    iput-object v9, v0, La/a4u;->r:La/gmq;

    .line 646
    .line 647
    move-object v9, v5

    .line 648
    check-cast v9, La/gmq;

    .line 649
    .line 650
    iput-object v9, v0, La/a4u;->s:La/gmq;

    .line 651
    .line 652
    move-object v9, v4

    .line 653
    check-cast v9, La/gmq;

    .line 654
    .line 655
    iput-object v9, v0, La/a4u;->t:La/gmq;

    .line 656
    .line 657
    move-object v9, v8

    .line 658
    check-cast v9, La/gmq;

    .line 659
    .line 660
    iput-object v9, v0, La/a4u;->u:La/gmq;

    .line 661
    .line 662
    iput v2, v0, La/a4u;->x:I

    .line 663
    .line 664
    const/4 v9, 0x5

    .line 665
    iput-byte v9, v0, La/a4u;->i:B

    .line 666
    .line 667
    invoke-virtual {v13, v15, v12, v2, v0}, La/d4u;->c(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ILa/zje;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    if-ne v9, v1, :cond_a

    .line 672
    .line 673
    goto/16 :goto_b

    .line 674
    .line 675
    :cond_a
    move-object/from16 v23, v8

    .line 676
    .line 677
    move-object v8, v3

    .line 678
    move-object/from16 v3, v23

    .line 679
    .line 680
    :goto_8
    check-cast v9, La/gmq;

    .line 681
    .line 682
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 683
    .line 684
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 685
    .line 686
    iput-object v11, v0, La/a4u;->o:La/kmq;

    .line 687
    .line 688
    move-object v15, v8

    .line 689
    check-cast v15, La/gmq;

    .line 690
    .line 691
    iput-object v15, v0, La/a4u;->p:La/gmq;

    .line 692
    .line 693
    move-object v15, v7

    .line 694
    check-cast v15, La/gmq;

    .line 695
    .line 696
    iput-object v15, v0, La/a4u;->q:La/gmq;

    .line 697
    .line 698
    move-object v15, v6

    .line 699
    check-cast v15, La/gmq;

    .line 700
    .line 701
    iput-object v15, v0, La/a4u;->r:La/gmq;

    .line 702
    .line 703
    move-object v15, v5

    .line 704
    check-cast v15, La/gmq;

    .line 705
    .line 706
    iput-object v15, v0, La/a4u;->s:La/gmq;

    .line 707
    .line 708
    move-object v15, v4

    .line 709
    check-cast v15, La/gmq;

    .line 710
    .line 711
    iput-object v15, v0, La/a4u;->t:La/gmq;

    .line 712
    .line 713
    move-object v15, v3

    .line 714
    check-cast v15, La/gmq;

    .line 715
    .line 716
    iput-object v15, v0, La/a4u;->u:La/gmq;

    .line 717
    .line 718
    move-object v15, v9

    .line 719
    check-cast v15, La/gmq;

    .line 720
    .line 721
    iput-object v15, v0, La/a4u;->v:La/gmq;

    .line 722
    .line 723
    iput v2, v0, La/a4u;->x:I

    .line 724
    .line 725
    const/4 v15, 0x6

    .line 726
    iput-byte v15, v0, La/a4u;->i:B

    .line 727
    .line 728
    invoke-virtual {v13, v2, v0, v12}, La/d4u;->f(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v15

    .line 732
    if-ne v15, v1, :cond_b

    .line 733
    .line 734
    goto/16 :goto_b

    .line 735
    .line 736
    :cond_b
    move-object/from16 v23, v7

    .line 737
    .line 738
    move-object v7, v3

    .line 739
    move-object v3, v6

    .line 740
    move-object v6, v11

    .line 741
    move-object v11, v9

    .line 742
    move-object v9, v5

    .line 743
    move-object v5, v8

    .line 744
    move-object v8, v4

    .line 745
    move-object/from16 v4, v23

    .line 746
    .line 747
    :goto_9
    check-cast v15, La/gmq;

    .line 748
    .line 749
    iput-object v14, v0, La/a4u;->j:La/kmq;

    .line 750
    .line 751
    iput-object v14, v0, La/a4u;->k:Ljava/lang/Object;

    .line 752
    .line 753
    iput-object v6, v0, La/a4u;->o:La/kmq;

    .line 754
    .line 755
    move-object v14, v5

    .line 756
    check-cast v14, La/gmq;

    .line 757
    .line 758
    iput-object v14, v0, La/a4u;->p:La/gmq;

    .line 759
    .line 760
    move-object v14, v4

    .line 761
    check-cast v14, La/gmq;

    .line 762
    .line 763
    iput-object v14, v0, La/a4u;->q:La/gmq;

    .line 764
    .line 765
    move-object v14, v3

    .line 766
    check-cast v14, La/gmq;

    .line 767
    .line 768
    iput-object v14, v0, La/a4u;->r:La/gmq;

    .line 769
    .line 770
    move-object v14, v9

    .line 771
    check-cast v14, La/gmq;

    .line 772
    .line 773
    iput-object v14, v0, La/a4u;->s:La/gmq;

    .line 774
    .line 775
    move-object v14, v8

    .line 776
    check-cast v14, La/gmq;

    .line 777
    .line 778
    iput-object v14, v0, La/a4u;->t:La/gmq;

    .line 779
    .line 780
    move-object v14, v7

    .line 781
    check-cast v14, La/gmq;

    .line 782
    .line 783
    iput-object v14, v0, La/a4u;->u:La/gmq;

    .line 784
    .line 785
    move-object v14, v11

    .line 786
    check-cast v14, La/gmq;

    .line 787
    .line 788
    iput-object v14, v0, La/a4u;->v:La/gmq;

    .line 789
    .line 790
    move-object v14, v15

    .line 791
    check-cast v14, La/gmq;

    .line 792
    .line 793
    iput-object v14, v0, La/a4u;->w:La/gmq;

    .line 794
    .line 795
    iput v2, v0, La/a4u;->x:I

    .line 796
    .line 797
    const/4 v14, 0x7

    .line 798
    iput-byte v14, v0, La/a4u;->i:B

    .line 799
    .line 800
    invoke-virtual {v13, v2, v0, v12}, La/d4u;->a(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    if-ne v2, v1, :cond_c

    .line 805
    .line 806
    goto :goto_b

    .line 807
    :cond_c
    move-object v12, v7

    .line 808
    move-object v13, v8

    .line 809
    :goto_a
    check-cast v2, La/gmq;

    .line 810
    .line 811
    const/16 v7, 0x9

    .line 812
    .line 813
    new-array v7, v7, [La/gmq;

    .line 814
    .line 815
    aput-object v5, v7, v22

    .line 816
    .line 817
    aput-object v4, v7, v10

    .line 818
    .line 819
    const/16 v21, 0x2

    .line 820
    .line 821
    aput-object v3, v7, v21

    .line 822
    .line 823
    const/16 v20, 0x3

    .line 824
    .line 825
    aput-object v9, v7, v20

    .line 826
    .line 827
    const/16 v19, 0x4

    .line 828
    .line 829
    aput-object v13, v7, v19

    .line 830
    .line 831
    const/16 v18, 0x5

    .line 832
    .line 833
    aput-object v12, v7, v18

    .line 834
    .line 835
    const/16 v17, 0x6

    .line 836
    .line 837
    aput-object v11, v7, v17

    .line 838
    .line 839
    const/16 v16, 0x7

    .line 840
    .line 841
    aput-object v15, v7, v16

    .line 842
    .line 843
    const/16 v3, 0x8

    .line 844
    .line 845
    aput-object v2, v7, v3

    .line 846
    .line 847
    new-instance v2, La/pxt;

    .line 848
    .line 849
    invoke-direct {v2, v7, v10}, La/pxt;-><init>([La/gmq;B)V

    .line 850
    .line 851
    .line 852
    const/4 v4, 0x0

    .line 853
    iput-object v4, v0, La/a4u;->j:La/kmq;

    .line 854
    .line 855
    iput-object v4, v0, La/a4u;->k:Ljava/lang/Object;

    .line 856
    .line 857
    iput-object v4, v0, La/a4u;->o:La/kmq;

    .line 858
    .line 859
    iput-object v4, v0, La/a4u;->p:La/gmq;

    .line 860
    .line 861
    iput-object v4, v0, La/a4u;->q:La/gmq;

    .line 862
    .line 863
    iput-object v4, v0, La/a4u;->r:La/gmq;

    .line 864
    .line 865
    iput-object v4, v0, La/a4u;->s:La/gmq;

    .line 866
    .line 867
    iput-object v4, v0, La/a4u;->t:La/gmq;

    .line 868
    .line 869
    iput-object v4, v0, La/a4u;->u:La/gmq;

    .line 870
    .line 871
    iput-object v4, v0, La/a4u;->v:La/gmq;

    .line 872
    .line 873
    iput-object v4, v0, La/a4u;->w:La/gmq;

    .line 874
    .line 875
    iput-byte v3, v0, La/a4u;->i:B

    .line 876
    .line 877
    invoke-static {v6, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    if-ne v0, v1, :cond_d

    .line 882
    .line 883
    :goto_b
    return-object v1

    .line 884
    :cond_d
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 885
    .line 886
    return-object v0

    .line 887
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
