.class public final synthetic La/q71;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJLjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/q71;->a:B

    iput-object p4, p0, La/q71;->d:Ljava/lang/Object;

    iput-object p5, p0, La/q71;->e:Ljava/lang/Object;

    iput-boolean p6, p0, La/q71;->b:Z

    iput-wide p2, p0, La/q71;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/f47;JZLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput-byte v0, p0, La/q71;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q71;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/q71;->c:J

    iput-boolean p4, p0, La/q71;->b:Z

    iput-object p5, p0, La/q71;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/jbm;ZJLkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/q71;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q71;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/q71;->b:Z

    iput-wide p3, p0, La/q71;->c:J

    iput-object p5, p0, La/q71;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/nnp;La/ygs;JZ)V
    .locals 1

    .line 4
    const/4 v0, 0x3

    iput-byte v0, p0, La/q71;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q71;->d:Ljava/lang/Object;

    iput-object p2, p0, La/q71;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/q71;->c:J

    iput-boolean p5, p0, La/q71;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function2;JLa/yk9;)V
    .locals 1

    .line 5
    const/4 v0, 0x1

    iput-byte v0, p0, La/q71;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/q71;->b:Z

    iput-object p2, p0, La/q71;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/q71;->c:J

    iput-object p5, p0, La/q71;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q71;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-boolean v4, v0, La/q71;->b:Z

    .line 8
    .line 9
    iget-wide v5, v0, La/q71;->c:J

    .line 10
    .line 11
    iget-object v7, v0, La/q71;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v0, La/q71;->d:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v8, La/rua0;

    .line 19
    .line 20
    check-cast v7, La/ygs;

    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/k0w0;

    .line 25
    .line 26
    iget-object v2, v8, La/rua0;->t:La/qv2;

    .line 27
    .line 28
    sget-object v21, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 29
    .line 30
    sget-object v22, La/grs;->b:La/grs;

    .line 31
    .line 32
    sget-object v25, La/ors;->a:La/ors;

    .line 33
    .line 34
    sget-object v28, La/k1g;->h:La/k1g;

    .line 35
    .line 36
    iget-wide v9, v7, La/ygs;->a:J

    .line 37
    .line 38
    iget-wide v13, v7, La/ygs;->d:J

    .line 39
    .line 40
    iget-wide v3, v7, La/ygs;->B:J

    .line 41
    .line 42
    iget-wide v11, v7, La/ygs;->f:J

    .line 43
    .line 44
    iget-boolean v8, v7, La/ygs;->c:Z

    .line 45
    .line 46
    iget-object v7, v7, La/ygs;->e:Ljava/lang/String;

    .line 47
    .line 48
    long-to-int v5, v5

    .line 49
    move/from16 v20, v8

    .line 50
    .line 51
    new-instance v8, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 52
    .line 53
    iget-boolean v0, v0, La/q71;->b:Z

    .line 54
    .line 55
    const-string v23, "main_screen"

    .line 56
    .line 57
    const/16 v27, 0x0

    .line 58
    .line 59
    move-wide/from16 v18, v11

    .line 60
    .line 61
    move-wide v11, v9

    .line 62
    move/from16 v17, v0

    .line 63
    .line 64
    move-wide v15, v3

    .line 65
    move/from16 v26, v5

    .line 66
    .line 67
    move-object/from16 v24, v7

    .line 68
    .line 69
    invoke-direct/range {v8 .. v28}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v8}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 77
    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_0
    check-cast v8, La/f47;

    .line 83
    .line 84
    move-object v5, v7

    .line 85
    check-cast v5, Ljava/lang/String;

    .line 86
    .line 87
    move-object/from16 v7, p1

    .line 88
    .line 89
    check-cast v7, La/k0w0;

    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v1, v8, La/f47;->s:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, La/uxs0;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    const/4 v6, 0x6

    .line 100
    move-object v4, v1

    .line 101
    iget-wide v1, v0, La/q71;->c:J

    .line 102
    .line 103
    move-object v8, v4

    .line 104
    iget-boolean v4, v0, La/q71;->b:Z

    .line 105
    .line 106
    move-object v0, v8

    .line 107
    invoke-static/range {v0 .. v6}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v7, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 112
    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_1
    check-cast v8, La/v8d;

    .line 118
    .line 119
    check-cast v7, La/sff0;

    .line 120
    .line 121
    move-object/from16 v0, p1

    .line 122
    .line 123
    check-cast v0, La/iz30;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget-object v1, La/iz30;->w:La/iz30;

    .line 129
    .line 130
    if-ne v0, v1, :cond_1

    .line 131
    .line 132
    iget-boolean v1, v8, La/v8d;->D:Z

    .line 133
    .line 134
    if-nez v1, :cond_1

    .line 135
    .line 136
    :cond_0
    :goto_0
    move v2, v3

    .line 137
    goto :goto_1

    .line 138
    :cond_1
    sget-object v1, La/iz30;->p:La/iz30;

    .line 139
    .line 140
    if-ne v0, v1, :cond_2

    .line 141
    .line 142
    iget-boolean v1, v8, La/v8d;->E:Z

    .line 143
    .line 144
    if-nez v1, :cond_2

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    sget-object v1, La/iz30;->j:La/iz30;

    .line 148
    .line 149
    if-ne v0, v1, :cond_3

    .line 150
    .line 151
    iget-object v1, v7, La/sff0;->l:La/toc0;

    .line 152
    .line 153
    iget-boolean v1, v1, La/toc0;->s:Z

    .line 154
    .line 155
    if-nez v1, :cond_3

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_3
    sget-object v1, La/iz30;->r:La/iz30;

    .line 159
    .line 160
    if-ne v0, v1, :cond_4

    .line 161
    .line 162
    iget-object v1, v7, La/sff0;->l:La/toc0;

    .line 163
    .line 164
    iget-boolean v1, v1, La/toc0;->t:Z

    .line 165
    .line 166
    if-nez v1, :cond_4

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_4
    sget-object v1, La/iz30;->s:La/iz30;

    .line 170
    .line 171
    if-ne v0, v1, :cond_5

    .line 172
    .line 173
    iget-boolean v0, v8, La/v8d;->F:Z

    .line 174
    .line 175
    if-eqz v0, :cond_0

    .line 176
    .line 177
    if-nez v4, :cond_0

    .line 178
    .line 179
    const-wide/16 v0, 0x0

    .line 180
    .line 181
    cmp-long v0, v5, v0

    .line 182
    .line 183
    if-nez v0, :cond_5

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_5
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_2
    check-cast v8, La/nnp;

    .line 192
    .line 193
    check-cast v7, La/ygs;

    .line 194
    .line 195
    move-object/from16 v1, p1

    .line 196
    .line 197
    check-cast v1, La/k0w0;

    .line 198
    .line 199
    long-to-int v2, v5

    .line 200
    sget v3, La/nnp;->a0:I

    .line 201
    .line 202
    iget-object v3, v8, La/nnp;->y:La/qv2;

    .line 203
    .line 204
    sget-object v22, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 205
    .line 206
    sget-object v23, La/grs;->b:La/grs;

    .line 207
    .line 208
    sget-object v26, La/ors;->a:La/ors;

    .line 209
    .line 210
    sget-object v4, La/k1g;->b:La/k1g;

    .line 211
    .line 212
    iget-wide v10, v7, La/ygs;->a:J

    .line 213
    .line 214
    iget-wide v14, v7, La/ygs;->d:J

    .line 215
    .line 216
    iget-wide v4, v7, La/ygs;->B:J

    .line 217
    .line 218
    iget-wide v8, v7, La/ygs;->f:J

    .line 219
    .line 220
    iget-boolean v6, v7, La/ygs;->c:Z

    .line 221
    .line 222
    iget-object v7, v7, La/ygs;->e:Ljava/lang/String;

    .line 223
    .line 224
    sget-object v29, La/k1g;->b:La/k1g;

    .line 225
    .line 226
    move-wide/from16 v19, v8

    .line 227
    .line 228
    new-instance v9, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 229
    .line 230
    iget-boolean v0, v0, La/q71;->b:Z

    .line 231
    .line 232
    const-string v24, "main_screen"

    .line 233
    .line 234
    const/16 v28, 0x0

    .line 235
    .line 236
    move-wide v12, v10

    .line 237
    move/from16 v18, v0

    .line 238
    .line 239
    move/from16 v27, v2

    .line 240
    .line 241
    move-wide/from16 v16, v4

    .line 242
    .line 243
    move/from16 v21, v6

    .line 244
    .line 245
    move-object/from16 v25, v7

    .line 246
    .line 247
    invoke-direct/range {v9 .. v29}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v9}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_3
    move-object v9, v8

    .line 261
    check-cast v9, La/jbm;

    .line 262
    .line 263
    move-object v8, v7

    .line 264
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 265
    .line 266
    move-object/from16 v1, p1

    .line 267
    .line 268
    check-cast v1, La/hcz;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v4, v9, La/jbm;->c:La/a4x;

    .line 274
    .line 275
    new-instance v3, La/xjl;

    .line 276
    .line 277
    const/16 v5, 0x1a

    .line 278
    .line 279
    invoke-direct {v3, v5}, La/xjl;-><init>(B)V

    .line 280
    .line 281
    .line 282
    new-instance v5, La/xjl;

    .line 283
    .line 284
    const/16 v6, 0x1b

    .line 285
    .line 286
    invoke-direct {v5, v6}, La/xjl;-><init>(B)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    new-instance v11, La/ctl;

    .line 294
    .line 295
    const/16 v6, 0xc

    .line 296
    .line 297
    invoke-direct {v11, v3, v4, v6}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 298
    .line 299
    .line 300
    new-instance v12, La/ctl;

    .line 301
    .line 302
    const/16 v3, 0xd

    .line 303
    .line 304
    invoke-direct {v12, v5, v4, v3}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 305
    .line 306
    .line 307
    new-instance v3, La/ebm;

    .line 308
    .line 309
    iget-boolean v5, v0, La/q71;->b:Z

    .line 310
    .line 311
    iget-wide v6, v0, La/q71;->c:J

    .line 312
    .line 313
    invoke-direct/range {v3 .. v9}, La/ebm;-><init>(Ljava/util/List;ZJLkotlin/jvm/functions/Function2;La/jbm;)V

    .line 314
    .line 315
    .line 316
    new-instance v0, La/ugd;

    .line 317
    .line 318
    const v4, 0x2fd4df92

    .line 319
    .line 320
    .line 321
    invoke-direct {v0, v4, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v10, v11, v12, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 325
    .line 326
    .line 327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_4
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 331
    .line 332
    check-cast v7, La/yk9;

    .line 333
    .line 334
    move-object/from16 v0, p1

    .line 335
    .line 336
    check-cast v0, La/qk9;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    if-eqz v4, :cond_6

    .line 342
    .line 343
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-interface {v8, v0, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object v0

    .line 353
    :pswitch_5
    check-cast v8, La/pu90;

    .line 354
    .line 355
    check-cast v7, La/pu90;

    .line 356
    .line 357
    move-object/from16 v0, p1

    .line 358
    .line 359
    check-cast v0, La/ou90;

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    const/4 v1, 0x0

    .line 365
    if-eqz v8, :cond_7

    .line 366
    .line 367
    invoke-virtual {v0, v8, v3, v3, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 368
    .line 369
    .line 370
    :cond_7
    if-eqz v7, :cond_b

    .line 371
    .line 372
    if-eqz v4, :cond_9

    .line 373
    .line 374
    if-eqz v8, :cond_8

    .line 375
    .line 376
    iget v3, v8, La/pu90;->a:I

    .line 377
    .line 378
    :cond_8
    invoke-static {v5, v6}, La/p4e;->h(J)I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    div-int/lit8 v2, v2, 0x2

    .line 383
    .line 384
    iget v4, v7, La/pu90;->a:I

    .line 385
    .line 386
    div-int/lit8 v4, v4, 0x2

    .line 387
    .line 388
    sub-int/2addr v2, v4

    .line 389
    invoke-virtual {v0, v7, v3, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 390
    .line 391
    .line 392
    goto :goto_2

    .line 393
    :cond_9
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    div-int/lit8 v2, v2, 0x2

    .line 398
    .line 399
    iget v4, v7, La/pu90;->a:I

    .line 400
    .line 401
    div-int/lit8 v4, v4, 0x2

    .line 402
    .line 403
    sub-int/2addr v2, v4

    .line 404
    if-eqz v8, :cond_a

    .line 405
    .line 406
    iget v3, v8, La/pu90;->b:I

    .line 407
    .line 408
    :cond_a
    invoke-virtual {v0, v7, v2, v3, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 409
    .line 410
    .line 411
    :cond_b
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    nop

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
