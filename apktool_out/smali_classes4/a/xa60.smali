.class public final La/xa60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:[Ljava/lang/Object;

.field public k:La/kmq;

.field public l:[Ljava/lang/Object;

.field public m:Z

.field public n:B

.field public synthetic o:La/kmq;

.field public synthetic p:Ljava/util/List;

.field public final synthetic q:Z

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xa60;->i:B

    iput-object p1, p0, La/xa60;->r:Ljava/lang/Object;

    iput-boolean p2, p0, La/xa60;->q:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/xa60;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/xa60;->q:Z

    .line 4
    .line 5
    iget-object p0, p0, La/xa60;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, La/kmq;

    .line 8
    .line 9
    check-cast p2, Ljava/util/List;

    .line 10
    .line 11
    check-cast p3, La/yje;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance v0, La/xa60;

    .line 17
    .line 18
    check-cast p0, La/qv2;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v0, p0, v1, p3, v2}, La/xa60;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, La/xa60;->o:La/kmq;

    .line 25
    .line 26
    iput-object p2, v0, La/xa60;->p:Ljava/util/List;

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, La/xa60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    new-instance v0, La/xa60;

    .line 36
    .line 37
    check-cast p0, La/nc0;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v0, p0, v1, p3, v2}, La/xa60;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v0, La/xa60;->o:La/kmq;

    .line 44
    .line 45
    iput-object p2, v0, La/xa60;->p:Ljava/util/List;

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, La/xa60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xa60;->i:B

    .line 4
    .line 5
    iget-boolean v4, v0, La/xa60;->q:Z

    .line 6
    .line 7
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v6, 0x2

    .line 10
    const/4 v7, 0x3

    .line 11
    iget-object v8, v0, La/xa60;->r:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 v9, 0x1d

    .line 14
    .line 15
    const/16 v10, 0x16

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v8, La/qv2;

    .line 24
    .line 25
    iget-object v1, v0, La/xa60;->o:La/kmq;

    .line 26
    .line 27
    iget-object v14, v0, La/xa60;->p:Ljava/util/List;

    .line 28
    .line 29
    sget-object v15, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget-byte v2, v0, La/xa60;->n:B

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v13, :cond_2

    .line 36
    .line 37
    if-eq v2, v6, :cond_1

    .line 38
    .line 39
    if-ne v2, v7, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    iget-boolean v1, v0, La/xa60;->m:Z

    .line 48
    .line 49
    iget-object v2, v0, La/xa60;->l:[Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, [La/gmq;

    .line 52
    .line 53
    iget-object v3, v0, La/xa60;->k:La/kmq;

    .line 54
    .line 55
    iget-object v4, v0, La/xa60;->j:[Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, [La/gmq;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v5, v2

    .line 63
    move v2, v1

    .line 64
    move-object v1, v3

    .line 65
    move-object v3, v5

    .line 66
    move-object v5, v4

    .line 67
    move-object/from16 v4, p1

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_2
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    sget-object v2, La/iun;->a:La/iun;

    .line 86
    .line 87
    iput-object v12, v0, La/xa60;->o:La/kmq;

    .line 88
    .line 89
    iput-object v12, v0, La/xa60;->p:Ljava/util/List;

    .line 90
    .line 91
    iput-byte v13, v0, La/xa60;->n:B

    .line 92
    .line 93
    invoke-interface {v1, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v15, :cond_6

    .line 98
    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :cond_4
    new-array v2, v6, [La/gmq;

    .line 102
    .line 103
    iget-object v5, v8, La/qv2;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, La/w8u;

    .line 106
    .line 107
    invoke-virtual {v5, v13}, La/w8u;->a(Z)La/gmq;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    new-instance v3, La/i89;

    .line 112
    .line 113
    invoke-direct {v3, v5, v10}, La/i89;-><init>(La/gmq;B)V

    .line 114
    .line 115
    .line 116
    new-instance v5, La/ab60;

    .line 117
    .line 118
    invoke-direct {v5, v8, v12, v11}, La/ab60;-><init>(La/qv2;La/yje;B)V

    .line 119
    .line 120
    .line 121
    move/from16 v17, v11

    .line 122
    .line 123
    new-instance v11, La/oz0;

    .line 124
    .line 125
    invoke-direct {v11, v7, v12, v9}, La/oz0;-><init>(ILa/yje;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {v3, v5, v11}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    aput-object v3, v2, v17

    .line 133
    .line 134
    iput-object v12, v0, La/xa60;->o:La/kmq;

    .line 135
    .line 136
    iput-object v12, v0, La/xa60;->p:Ljava/util/List;

    .line 137
    .line 138
    iput-object v2, v0, La/xa60;->j:[Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v1, v0, La/xa60;->k:La/kmq;

    .line 141
    .line 142
    iput-object v2, v0, La/xa60;->l:[Ljava/lang/Object;

    .line 143
    .line 144
    iput-boolean v13, v0, La/xa60;->m:Z

    .line 145
    .line 146
    iput-byte v6, v0, La/xa60;->n:B

    .line 147
    .line 148
    new-instance v3, La/hie0;

    .line 149
    .line 150
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-boolean v4, v3, La/hie0;->a:Z

    .line 154
    .line 155
    new-instance v4, La/db60;

    .line 156
    .line 157
    invoke-direct {v4, v8, v14, v12}, La/db60;-><init>(La/qv2;Ljava/util/List;La/yje;)V

    .line 158
    .line 159
    .line 160
    new-instance v5, La/vsg0;

    .line 161
    .line 162
    invoke-direct {v5, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    new-instance v4, La/qqu;

    .line 166
    .line 167
    const/16 v6, 0xf

    .line 168
    .line 169
    invoke-direct {v4, v5, v3, v6}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 170
    .line 171
    .line 172
    new-instance v5, La/h0v;

    .line 173
    .line 174
    const/4 v6, 0x5

    .line 175
    invoke-direct {v5, v8, v12, v6}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 176
    .line 177
    .line 178
    new-instance v6, La/a1g;

    .line 179
    .line 180
    const/16 v11, 0x14

    .line 181
    .line 182
    invoke-direct {v6, v4, v5, v11}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    new-instance v4, La/lqu;

    .line 186
    .line 187
    const/16 v5, 0x10

    .line 188
    .line 189
    invoke-direct {v4, v3, v5}, La/lqu;-><init>(La/hie0;B)V

    .line 190
    .line 191
    .line 192
    new-instance v3, La/ab60;

    .line 193
    .line 194
    invoke-direct {v3, v8, v12, v13}, La/ab60;-><init>(La/qv2;La/yje;B)V

    .line 195
    .line 196
    .line 197
    new-instance v5, La/ko0;

    .line 198
    .line 199
    invoke-direct {v5, v8, v12, v9}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 200
    .line 201
    .line 202
    const/16 v22, 0x0

    .line 203
    .line 204
    const/16 v23, 0x28

    .line 205
    .line 206
    const-wide/16 v18, 0x8

    .line 207
    .line 208
    move-object/from16 v20, v3

    .line 209
    .line 210
    move-object/from16 v17, v4

    .line 211
    .line 212
    move-object/from16 v21, v5

    .line 213
    .line 214
    move-object/from16 v16, v6

    .line 215
    .line 216
    invoke-static/range {v16 .. v23}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    new-instance v4, La/i89;

    .line 221
    .line 222
    invoke-direct {v4, v3, v10}, La/i89;-><init>(La/gmq;B)V

    .line 223
    .line 224
    .line 225
    if-ne v4, v15, :cond_5

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_5
    move-object v3, v2

    .line 229
    move-object v5, v3

    .line 230
    move v2, v13

    .line 231
    :goto_1
    aput-object v4, v3, v2

    .line 232
    .line 233
    invoke-static {v5}, La/aoq;->b([La/gmq;)La/ltb;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    new-instance v3, La/za60;

    .line 238
    .line 239
    invoke-direct {v3, v12, v8, v13}, La/za60;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 240
    .line 241
    .line 242
    invoke-static {v2, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iput-object v12, v0, La/xa60;->o:La/kmq;

    .line 247
    .line 248
    iput-object v12, v0, La/xa60;->p:Ljava/util/List;

    .line 249
    .line 250
    iput-object v12, v0, La/xa60;->j:[Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v12, v0, La/xa60;->k:La/kmq;

    .line 253
    .line 254
    iput-object v12, v0, La/xa60;->l:[Ljava/lang/Object;

    .line 255
    .line 256
    iput-byte v7, v0, La/xa60;->n:B

    .line 257
    .line 258
    invoke-static {v1, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-ne v0, v15, :cond_6

    .line 263
    .line 264
    :goto_2
    move-object v12, v15

    .line 265
    goto :goto_4

    .line 266
    :cond_6
    :goto_3
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    :goto_4
    return-object v12

    .line 269
    :pswitch_0
    move/from16 v17, v11

    .line 270
    .line 271
    check-cast v8, La/nc0;

    .line 272
    .line 273
    iget-object v1, v0, La/xa60;->o:La/kmq;

    .line 274
    .line 275
    iget-object v2, v0, La/xa60;->p:Ljava/util/List;

    .line 276
    .line 277
    sget-object v3, La/wne;->a:La/wne;

    .line 278
    .line 279
    iget-byte v11, v0, La/xa60;->n:B

    .line 280
    .line 281
    if-eqz v11, :cond_a

    .line 282
    .line 283
    if-eq v11, v13, :cond_9

    .line 284
    .line 285
    if-eq v11, v6, :cond_8

    .line 286
    .line 287
    if-ne v11, v7, :cond_7

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_7
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_9

    .line 294
    .line 295
    :cond_8
    iget-boolean v13, v0, La/xa60;->m:Z

    .line 296
    .line 297
    iget-object v1, v0, La/xa60;->l:[Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v1, [La/gmq;

    .line 300
    .line 301
    iget-object v2, v0, La/xa60;->k:La/kmq;

    .line 302
    .line 303
    iget-object v4, v0, La/xa60;->j:[Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v4, [La/gmq;

    .line 306
    .line 307
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    move-object v5, v1

    .line 311
    move-object v1, v2

    .line 312
    move-object v2, v4

    .line 313
    move-object/from16 v4, p1

    .line 314
    .line 315
    goto/16 :goto_6

    .line 316
    .line 317
    :cond_9
    :goto_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_8

    .line 321
    .line 322
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_b

    .line 330
    .line 331
    sget-object v2, La/iun;->a:La/iun;

    .line 332
    .line 333
    iput-object v12, v0, La/xa60;->o:La/kmq;

    .line 334
    .line 335
    iput-object v12, v0, La/xa60;->p:Ljava/util/List;

    .line 336
    .line 337
    iput-byte v13, v0, La/xa60;->n:B

    .line 338
    .line 339
    invoke-interface {v1, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-ne v0, v3, :cond_d

    .line 344
    .line 345
    goto/16 :goto_7

    .line 346
    .line 347
    :cond_b
    new-array v5, v6, [La/gmq;

    .line 348
    .line 349
    iget-object v11, v8, La/nc0;->h:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v11, La/w8u;

    .line 352
    .line 353
    move/from16 v14, v17

    .line 354
    .line 355
    invoke-virtual {v11, v14}, La/w8u;->a(Z)La/gmq;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    new-instance v15, La/i89;

    .line 360
    .line 361
    invoke-direct {v15, v11, v10}, La/i89;-><init>(La/gmq;B)V

    .line 362
    .line 363
    .line 364
    new-instance v11, La/ta60;

    .line 365
    .line 366
    invoke-direct {v11, v8, v12, v14}, La/ta60;-><init>(La/nc0;La/yje;B)V

    .line 367
    .line 368
    .line 369
    new-instance v14, La/oz0;

    .line 370
    .line 371
    const/16 v9, 0x1c

    .line 372
    .line 373
    invoke-direct {v14, v7, v12, v9}, La/oz0;-><init>(ILa/yje;B)V

    .line 374
    .line 375
    .line 376
    invoke-static {v15, v11, v14}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    aput-object v11, v5, v17

    .line 381
    .line 382
    iput-object v12, v0, La/xa60;->o:La/kmq;

    .line 383
    .line 384
    iput-object v12, v0, La/xa60;->p:Ljava/util/List;

    .line 385
    .line 386
    iput-object v5, v0, La/xa60;->j:[Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v1, v0, La/xa60;->k:La/kmq;

    .line 389
    .line 390
    iput-object v5, v0, La/xa60;->l:[Ljava/lang/Object;

    .line 391
    .line 392
    iput-boolean v13, v0, La/xa60;->m:Z

    .line 393
    .line 394
    iput-byte v6, v0, La/xa60;->n:B

    .line 395
    .line 396
    new-instance v6, La/hie0;

    .line 397
    .line 398
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 399
    .line 400
    .line 401
    iput-boolean v4, v6, La/hie0;->a:Z

    .line 402
    .line 403
    new-instance v4, La/wa60;

    .line 404
    .line 405
    invoke-direct {v4, v8, v2, v12}, La/wa60;-><init>(La/nc0;Ljava/util/List;La/yje;)V

    .line 406
    .line 407
    .line 408
    new-instance v2, La/vsg0;

    .line 409
    .line 410
    invoke-direct {v2, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 411
    .line 412
    .line 413
    new-instance v4, La/qqu;

    .line 414
    .line 415
    const/16 v11, 0xe

    .line 416
    .line 417
    invoke-direct {v4, v2, v6, v11}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 418
    .line 419
    .line 420
    new-instance v2, La/h0v;

    .line 421
    .line 422
    const/4 v11, 0x4

    .line 423
    invoke-direct {v2, v8, v12, v11}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 424
    .line 425
    .line 426
    new-instance v11, La/a1g;

    .line 427
    .line 428
    const/16 v14, 0x14

    .line 429
    .line 430
    invoke-direct {v11, v4, v2, v14}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 431
    .line 432
    .line 433
    new-instance v2, La/lqu;

    .line 434
    .line 435
    const/16 v4, 0xf

    .line 436
    .line 437
    invoke-direct {v2, v6, v4}, La/lqu;-><init>(La/hie0;B)V

    .line 438
    .line 439
    .line 440
    new-instance v4, La/ta60;

    .line 441
    .line 442
    invoke-direct {v4, v8, v12, v13}, La/ta60;-><init>(La/nc0;La/yje;B)V

    .line 443
    .line 444
    .line 445
    new-instance v6, La/ko0;

    .line 446
    .line 447
    invoke-direct {v6, v8, v12, v9}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 448
    .line 449
    .line 450
    const/16 v25, 0x0

    .line 451
    .line 452
    const/16 v26, 0x28

    .line 453
    .line 454
    const-wide/16 v21, 0x1e

    .line 455
    .line 456
    move-object/from16 v20, v2

    .line 457
    .line 458
    move-object/from16 v23, v4

    .line 459
    .line 460
    move-object/from16 v24, v6

    .line 461
    .line 462
    move-object/from16 v19, v11

    .line 463
    .line 464
    invoke-static/range {v19 .. v26}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    new-instance v4, La/i89;

    .line 469
    .line 470
    invoke-direct {v4, v2, v10}, La/i89;-><init>(La/gmq;B)V

    .line 471
    .line 472
    .line 473
    if-ne v4, v3, :cond_c

    .line 474
    .line 475
    goto :goto_7

    .line 476
    :cond_c
    move-object v2, v5

    .line 477
    :goto_6
    aput-object v4, v5, v13

    .line 478
    .line 479
    invoke-static {v2}, La/aoq;->b([La/gmq;)La/ltb;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    new-instance v4, La/sot;

    .line 484
    .line 485
    const/16 v5, 0x1d

    .line 486
    .line 487
    invoke-direct {v4, v12, v8, v5}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 488
    .line 489
    .line 490
    invoke-static {v2, v4}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    iput-object v12, v0, La/xa60;->o:La/kmq;

    .line 495
    .line 496
    iput-object v12, v0, La/xa60;->p:Ljava/util/List;

    .line 497
    .line 498
    iput-object v12, v0, La/xa60;->j:[Ljava/lang/Object;

    .line 499
    .line 500
    iput-object v12, v0, La/xa60;->k:La/kmq;

    .line 501
    .line 502
    iput-object v12, v0, La/xa60;->l:[Ljava/lang/Object;

    .line 503
    .line 504
    iput-byte v7, v0, La/xa60;->n:B

    .line 505
    .line 506
    invoke-static {v1, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    if-ne v0, v3, :cond_d

    .line 511
    .line 512
    :goto_7
    move-object v12, v3

    .line 513
    goto :goto_9

    .line 514
    :cond_d
    :goto_8
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 515
    .line 516
    :goto_9
    return-object v12

    .line 517
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
