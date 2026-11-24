.class public final La/twu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/twu;->i:B

    iput-object p1, p0, La/twu;->m:Ljava/lang/Object;

    iput-object p2, p0, La/twu;->n:Ljava/lang/Object;

    iput-boolean p3, p0, La/twu;->o:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/twu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/twu;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/twu;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, La/kmq;

    .line 8
    .line 9
    move-object v7, p3

    .line 10
    check-cast v7, La/yje;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v3, La/twu;

    .line 16
    .line 17
    move-object v4, v2

    .line 18
    check-cast v4, La/tzi;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, La/sgs;

    .line 22
    .line 23
    iget-boolean v6, p0, La/twu;->o:Z

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    invoke-direct/range {v3 .. v8}, La/twu;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v3, La/twu;->k:La/kmq;

    .line 30
    .line 31
    iput-object p2, v3, La/twu;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {v3, p0}, La/twu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    new-instance v3, La/twu;

    .line 41
    .line 42
    move-object v4, v2

    .line 43
    check-cast v4, La/yhi;

    .line 44
    .line 45
    move-object v5, v1

    .line 46
    check-cast v5, La/hie0;

    .line 47
    .line 48
    iget-boolean v6, p0, La/twu;->o:Z

    .line 49
    .line 50
    const/4 v8, 0x1

    .line 51
    invoke-direct/range {v3 .. v8}, La/twu;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v3, La/twu;->k:La/kmq;

    .line 55
    .line 56
    iput-object p2, v3, La/twu;->l:Ljava/lang/Object;

    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {v3, p0}, La/twu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_1
    new-instance v3, La/twu;

    .line 66
    .line 67
    move-object v4, v2

    .line 68
    check-cast v4, La/yhi;

    .line 69
    .line 70
    move-object v5, v1

    .line 71
    check-cast v5, La/hie0;

    .line 72
    .line 73
    iget-boolean v6, p0, La/twu;->o:Z

    .line 74
    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-direct/range {v3 .. v8}, La/twu;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v3, La/twu;->k:La/kmq;

    .line 80
    .line 81
    iput-object p2, v3, La/twu;->l:Ljava/lang/Object;

    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    invoke-virtual {v3, p0}, La/twu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/twu;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x3

    .line 7
    iget-object v4, v0, La/twu;->n:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v6, v0, La/twu;->m:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 v7, 0xc

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v6, La/tzi;

    .line 21
    .line 22
    sget-object v1, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v10, v0, La/twu;->j:Z

    .line 25
    .line 26
    if-eqz v10, :cond_1

    .line 27
    .line 28
    if-ne v10, v9, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, La/twu;->k:La/kmq;

    .line 44
    .line 45
    iget-object v10, v0, La/twu;->l:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v10, La/gps;

    .line 48
    .line 49
    if-eqz v10, :cond_a

    .line 50
    .line 51
    instance-of v11, v10, La/zos;

    .line 52
    .line 53
    const/4 v12, 0x4

    .line 54
    const/16 v13, 0x14

    .line 55
    .line 56
    const/16 v19, 0x0

    .line 57
    .line 58
    if-eqz v11, :cond_4

    .line 59
    .line 60
    iget-object v2, v6, La/tzi;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, La/pmi;

    .line 63
    .line 64
    move-object/from16 v17, v10

    .line 65
    .line 66
    check-cast v17, La/zos;

    .line 67
    .line 68
    move-object/from16 v18, v4

    .line 69
    .line 70
    check-cast v18, La/sgs;

    .line 71
    .line 72
    iget-object v3, v6, La/tzi;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, La/yiu;

    .line 75
    .line 76
    invoke-virtual {v3}, La/yiu;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    iget-object v3, v6, La/tzi;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, La/pru;

    .line 85
    .line 86
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iget-boolean v3, v3, La/sff0;->O1:Z

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/16 v26, 0x0

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    :goto_0
    move/from16 v26, v9

    .line 99
    .line 100
    :goto_1
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v3, v2, La/pmi;->e:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, La/cmt;

    .line 106
    .line 107
    invoke-virtual {v3}, La/cmt;->a()La/p7m0;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    new-instance v4, La/i89;

    .line 112
    .line 113
    invoke-direct {v4, v3, v13}, La/i89;-><init>(La/gmq;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, La/i120;->W(La/gmq;)La/gmq;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-instance v20, La/npp;

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const/16 v27, 0x0

    .line 125
    .line 126
    iget-boolean v4, v0, La/twu;->o:Z

    .line 127
    .line 128
    move-object/from16 v22, v2

    .line 129
    .line 130
    move/from16 v25, v4

    .line 131
    .line 132
    move-object/from16 v23, v17

    .line 133
    .line 134
    move-object/from16 v24, v18

    .line 135
    .line 136
    invoke-direct/range {v20 .. v27}, La/npp;-><init>(La/yje;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;ZZB)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v2, v20

    .line 140
    .line 141
    move-object/from16 v16, v22

    .line 142
    .line 143
    invoke-static {v3, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    new-instance v15, La/ic1;

    .line 148
    .line 149
    const/16 v20, 0x1c

    .line 150
    .line 151
    invoke-direct/range {v15 .. v20}, La/ic1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v10, v17

    .line 155
    .line 156
    move-object/from16 v4, v19

    .line 157
    .line 158
    new-instance v3, La/fnq;

    .line 159
    .line 160
    invoke-direct {v3, v2, v15, v12}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 161
    .line 162
    .line 163
    new-instance v2, La/a1g;

    .line 164
    .line 165
    const/16 v6, 0x12

    .line 166
    .line 167
    invoke-direct {v2, v3, v10, v6}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 168
    .line 169
    .line 170
    new-instance v3, La/zo1;

    .line 171
    .line 172
    const/16 v6, 0x15

    .line 173
    .line 174
    invoke-direct {v3, v10, v4, v6}, La/zo1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    new-instance v6, La/dnq;

    .line 178
    .line 179
    invoke-direct {v6, v2, v3, v9}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_3

    .line 183
    .line 184
    :cond_4
    move-object/from16 v4, v19

    .line 185
    .line 186
    instance-of v11, v10, La/cps;

    .line 187
    .line 188
    if-eqz v11, :cond_5

    .line 189
    .line 190
    iget-object v2, v6, La/tzi;->f:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, La/ndq;

    .line 193
    .line 194
    check-cast v10, La/cps;

    .line 195
    .line 196
    iget-object v2, v2, La/ndq;->a:La/ros;

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v2, v2, La/ros;->a:La/nmo;

    .line 202
    .line 203
    iget-wide v6, v10, La/cps;->a:J

    .line 204
    .line 205
    new-instance v15, La/n1;

    .line 206
    .line 207
    const/16 v20, 0x9

    .line 208
    .line 209
    move-object/from16 v16, v2

    .line 210
    .line 211
    move-object/from16 v19, v4

    .line 212
    .line 213
    move-wide/from16 v17, v6

    .line 214
    .line 215
    invoke-direct/range {v15 .. v20}, La/n1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 216
    .line 217
    .line 218
    new-instance v2, La/cbq;

    .line 219
    .line 220
    invoke-direct {v2, v15, v4, v3}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 221
    .line 222
    .line 223
    new-instance v6, La/vsg0;

    .line 224
    .line 225
    invoke-direct {v6, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    new-instance v2, La/pos;

    .line 229
    .line 230
    invoke-direct {v2, v12, v4}, La/bnn0;-><init>(ILa/yje;)V

    .line 231
    .line 232
    .line 233
    new-instance v7, La/a1g;

    .line 234
    .line 235
    invoke-direct {v7, v6, v2, v13}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 236
    .line 237
    .line 238
    sget v2, La/hps;->b:I

    .line 239
    .line 240
    sget-object v2, La/wen;->b:La/uen;

    .line 241
    .line 242
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 243
    .line 244
    .line 245
    move-result-wide v11

    .line 246
    sget-object v2, La/bfn;->d:La/bfn;

    .line 247
    .line 248
    invoke-static {v11, v12, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 249
    .line 250
    .line 251
    move-result-wide v11

    .line 252
    iget-wide v14, v10, La/cps;->d:J

    .line 253
    .line 254
    invoke-static {v14, v15, v11, v12}, La/wen;->j(JJ)J

    .line 255
    .line 256
    .line 257
    move-result-wide v11

    .line 258
    new-instance v2, La/anq;

    .line 259
    .line 260
    invoke-direct {v2, v11, v12, v7, v4}, La/anq;-><init>(JLa/gmq;La/yje;)V

    .line 261
    .line 262
    .line 263
    new-instance v6, La/eu4;

    .line 264
    .line 265
    const/16 v7, 0x9

    .line 266
    .line 267
    invoke-direct {v6, v2, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 268
    .line 269
    .line 270
    new-instance v2, La/le0;

    .line 271
    .line 272
    invoke-direct {v2, v6, v3}, La/le0;-><init>(La/eu4;B)V

    .line 273
    .line 274
    .line 275
    new-instance v3, La/qos;

    .line 276
    .line 277
    const/4 v6, 0x0

    .line 278
    invoke-direct {v3, v10, v4, v6}, La/qos;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 279
    .line 280
    .line 281
    new-instance v7, La/dnq;

    .line 282
    .line 283
    invoke-direct {v7, v2, v3, v9}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 284
    .line 285
    .line 286
    new-instance v2, La/mdq;

    .line 287
    .line 288
    invoke-direct {v2, v7, v6}, La/mdq;-><init>(La/dnq;B)V

    .line 289
    .line 290
    .line 291
    new-instance v3, La/zo1;

    .line 292
    .line 293
    const/16 v6, 0x1a

    .line 294
    .line 295
    invoke-direct {v3, v10, v4, v6}, La/zo1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 296
    .line 297
    .line 298
    new-instance v6, La/dnq;

    .line 299
    .line 300
    invoke-direct {v6, v2, v3, v9}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 301
    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_5
    instance-of v3, v10, La/fps;

    .line 305
    .line 306
    if-eqz v3, :cond_a

    .line 307
    .line 308
    check-cast v10, La/fps;

    .line 309
    .line 310
    iget-object v3, v10, La/fps;->d:La/sos;

    .line 311
    .line 312
    iget-wide v10, v10, La/fps;->a:J

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_8

    .line 319
    .line 320
    if-eq v3, v9, :cond_7

    .line 321
    .line 322
    if-ne v3, v2, :cond_6

    .line 323
    .line 324
    iget-object v2, v6, La/tzi;->g:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v2, La/b8u;

    .line 327
    .line 328
    invoke-virtual {v2}, La/b8u;->d()La/p7m0;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    new-instance v3, La/i89;

    .line 333
    .line 334
    const/16 v6, 0x16

    .line 335
    .line 336
    invoke-direct {v3, v2, v6}, La/i89;-><init>(La/gmq;B)V

    .line 337
    .line 338
    .line 339
    :goto_2
    move-object v6, v3

    .line 340
    goto :goto_3

    .line 341
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_7
    new-instance v2, La/elr;

    .line 346
    .line 347
    invoke-direct {v2, v10, v11}, La/elr;-><init>(J)V

    .line 348
    .line 349
    .line 350
    new-instance v3, La/eu4;

    .line 351
    .line 352
    invoke-direct {v3, v2, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 353
    .line 354
    .line 355
    goto :goto_2

    .line 356
    :cond_8
    new-instance v2, La/clr;

    .line 357
    .line 358
    invoke-direct {v2, v10, v11}, La/clr;-><init>(J)V

    .line 359
    .line 360
    .line 361
    new-instance v3, La/eu4;

    .line 362
    .line 363
    invoke-direct {v3, v2, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 364
    .line 365
    .line 366
    goto :goto_2

    .line 367
    :goto_3
    iput-object v4, v0, La/twu;->k:La/kmq;

    .line 368
    .line 369
    iput-object v4, v0, La/twu;->l:Ljava/lang/Object;

    .line 370
    .line 371
    iput-boolean v9, v0, La/twu;->j:Z

    .line 372
    .line 373
    invoke-static {v5, v6, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-ne v0, v1, :cond_9

    .line 378
    .line 379
    move-object v8, v1

    .line 380
    goto :goto_5

    .line 381
    :cond_9
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 385
    .line 386
    .line 387
    :goto_5
    return-object v8

    .line 388
    :pswitch_0
    check-cast v4, La/hie0;

    .line 389
    .line 390
    move-object v11, v6

    .line 391
    check-cast v11, La/yhi;

    .line 392
    .line 393
    sget-object v1, La/wne;->a:La/wne;

    .line 394
    .line 395
    iget-boolean v6, v0, La/twu;->j:Z

    .line 396
    .line 397
    if-eqz v6, :cond_c

    .line 398
    .line 399
    if-ne v6, v9, :cond_b

    .line 400
    .line 401
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_b
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    iget-object v5, v0, La/twu;->k:La/kmq;

    .line 413
    .line 414
    iget-object v6, v0, La/twu;->l:Ljava/lang/Object;

    .line 415
    .line 416
    move-object v12, v6

    .line 417
    check-cast v12, Ljava/lang/String;

    .line 418
    .line 419
    iget-object v6, v11, La/yhi;->n:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v6, La/rpt;

    .line 422
    .line 423
    invoke-virtual {v6}, La/rpt;->a()I

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    new-instance v14, La/xvu;

    .line 428
    .line 429
    invoke-direct {v14, v4, v9}, La/xvu;-><init>(La/hie0;B)V

    .line 430
    .line 431
    .line 432
    new-instance v10, La/fs;

    .line 433
    .line 434
    const/4 v15, 0x0

    .line 435
    const/16 v16, 0x7

    .line 436
    .line 437
    invoke-direct/range {v10 .. v16}, La/fs;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILjava/lang/Object;La/yje;B)V

    .line 438
    .line 439
    .line 440
    const-wide/16 v6, 0x8

    .line 441
    .line 442
    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 443
    .line 444
    invoke-static {v6, v7, v14, v10}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    move-object v7, v14

    .line 449
    new-instance v14, La/xvu;

    .line 450
    .line 451
    invoke-direct {v14, v4, v2}, La/xvu;-><init>(La/hie0;B)V

    .line 452
    .line 453
    .line 454
    new-instance v10, La/fs;

    .line 455
    .line 456
    const/16 v16, 0x6

    .line 457
    .line 458
    invoke-direct/range {v10 .. v16}, La/fs;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILjava/lang/Object;La/yje;B)V

    .line 459
    .line 460
    .line 461
    const-wide/16 v12, 0x1e

    .line 462
    .line 463
    invoke-static {v12, v13, v7, v10}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    new-instance v4, La/y8p;

    .line 468
    .line 469
    const/4 v7, 0x7

    .line 470
    invoke-direct {v4, v3, v8, v7}, La/y8p;-><init>(ILa/yje;B)V

    .line 471
    .line 472
    .line 473
    new-instance v3, La/p6d;

    .line 474
    .line 475
    invoke-direct {v3, v6, v2, v4, v9}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 476
    .line 477
    .line 478
    new-instance v2, La/qwu;

    .line 479
    .line 480
    iget-boolean v4, v0, La/twu;->o:Z

    .line 481
    .line 482
    invoke-direct {v2, v8, v11, v4, v9}, La/qwu;-><init>(La/yje;La/yhi;ZB)V

    .line 483
    .line 484
    .line 485
    invoke-static {v3, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    iput-object v8, v0, La/twu;->k:La/kmq;

    .line 490
    .line 491
    iput-object v8, v0, La/twu;->l:Ljava/lang/Object;

    .line 492
    .line 493
    iput-boolean v9, v0, La/twu;->j:Z

    .line 494
    .line 495
    invoke-static {v5, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    if-ne v0, v1, :cond_d

    .line 500
    .line 501
    move-object v8, v1

    .line 502
    goto :goto_7

    .line 503
    :cond_d
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    :goto_7
    return-object v8

    .line 506
    :pswitch_1
    move-object v2, v6

    .line 507
    check-cast v2, La/yhi;

    .line 508
    .line 509
    sget-object v10, La/wne;->a:La/wne;

    .line 510
    .line 511
    iget-boolean v1, v0, La/twu;->j:Z

    .line 512
    .line 513
    if-eqz v1, :cond_f

    .line 514
    .line 515
    if-ne v1, v9, :cond_e

    .line 516
    .line 517
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    goto :goto_9

    .line 521
    :cond_e
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    goto :goto_a

    .line 525
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    iget-object v8, v0, La/twu;->k:La/kmq;

    .line 529
    .line 530
    iget-object v1, v0, La/twu;->l:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v1, Ljava/util/Set;

    .line 533
    .line 534
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    const/4 v5, 0x0

    .line 539
    if-eqz v1, :cond_10

    .line 540
    .line 541
    sget-object v1, La/iun;->a:La/iun;

    .line 542
    .line 543
    new-instance v2, La/eu4;

    .line 544
    .line 545
    invoke-direct {v2, v1, v7}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 546
    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_10
    new-instance v1, La/fhq;

    .line 550
    .line 551
    invoke-direct {v1, v2, v5, v7}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 552
    .line 553
    .line 554
    new-instance v3, La/vsg0;

    .line 555
    .line 556
    invoke-direct {v3, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 557
    .line 558
    .line 559
    const-string v1, "GetSubscriptionsGamesScenario.loadGames"

    .line 560
    .line 561
    const/16 v6, 0x38

    .line 562
    .line 563
    invoke-static {v3, v1, v5, v6}, La/bkb;->j0(La/gmq;Ljava/lang/String;Ljava/util/List;I)La/a1g;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    new-instance v1, La/twu;

    .line 568
    .line 569
    move-object v3, v4

    .line 570
    check-cast v3, La/hie0;

    .line 571
    .line 572
    iget-boolean v4, v0, La/twu;->o:Z

    .line 573
    .line 574
    const/4 v6, 0x1

    .line 575
    invoke-direct/range {v1 .. v6}, La/twu;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 576
    .line 577
    .line 578
    invoke-static {v7, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    :goto_8
    iput-object v5, v0, La/twu;->k:La/kmq;

    .line 583
    .line 584
    iput-object v5, v0, La/twu;->l:Ljava/lang/Object;

    .line 585
    .line 586
    iput-boolean v9, v0, La/twu;->j:Z

    .line 587
    .line 588
    invoke-static {v8, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    if-ne v0, v10, :cond_11

    .line 593
    .line 594
    move-object v8, v10

    .line 595
    goto :goto_a

    .line 596
    :cond_11
    :goto_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    :goto_a
    return-object v8

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
