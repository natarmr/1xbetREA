.class public final La/ybh;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/sff0;

.field public k:B

.field public final synthetic l:La/dch;

.field public final synthetic m:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;


# direct methods
.method public synthetic constructor <init>(La/dch;Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ybh;->i:B

    iput-object p1, p0, La/ybh;->l:La/dch;

    iput-object p2, p0, La/ybh;->m:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/ybh;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/ybh;->m:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 4
    .line 5
    iget-object p0, p0, La/ybh;->l:La/dch;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/ybh;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/ybh;-><init>(La/dch;Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/ybh;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/ybh;-><init>(La/dch;Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ybh;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ybh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ybh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ybh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ybh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ybh;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ybh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ybh;->i:B

    .line 4
    .line 5
    const-string v2, "whence"

    .line 6
    .line 7
    const-string v4, "userId"

    .line 8
    .line 9
    const-string v5, "ref"

    .line 10
    .line 11
    const-string v6, "lng"

    .line 12
    .line 13
    const-string v7, "gr"

    .line 14
    .line 15
    const-string v9, "fcountry"

    .line 16
    .line 17
    const-string v10, "country"

    .line 18
    .line 19
    const-string v11, "cfView"

    .line 20
    .line 21
    const-string v15, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    const/16 v16, 0x54d

    .line 24
    .line 25
    iget-object v8, v0, La/ybh;->l:La/dch;

    .line 26
    .line 27
    const-wide/16 v17, 0x0

    .line 28
    .line 29
    iget-object v12, v0, La/ybh;->m:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 30
    .line 31
    const/4 v13, 0x2

    .line 32
    const/4 v3, 0x1

    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    sget-object v1, La/wne;->a:La/wne;

    .line 37
    .line 38
    iget-byte v14, v0, La/ybh;->k:B

    .line 39
    .line 40
    if-eqz v14, :cond_2

    .line 41
    .line 42
    if-eq v14, v3, :cond_1

    .line 43
    .line 44
    if-ne v14, v13, :cond_0

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_0
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    iget-object v14, v0, La/ybh;->j:La/sff0;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v13, p1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v14, v8, La/dch;->v:La/pru;

    .line 69
    .line 70
    invoke-virtual {v14}, La/pru;->a()La/sff0;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    iget-object v15, v8, La/dch;->u:La/rtu;

    .line 75
    .line 76
    iput-object v14, v0, La/ybh;->j:La/sff0;

    .line 77
    .line 78
    iput-byte v3, v0, La/ybh;->k:B

    .line 79
    .line 80
    const/4 v13, 0x0

    .line 81
    invoke-virtual {v15, v3, v13, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    if-ne v13, v1, :cond_3

    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :cond_3
    :goto_0
    check-cast v13, La/c3c0;

    .line 90
    .line 91
    iget-object v15, v8, La/dch;->s:La/dgu;

    .line 92
    .line 93
    move/from16 v20, v3

    .line 94
    .line 95
    iget v3, v13, La/c3c0;->a:I

    .line 96
    .line 97
    move/from16 v19, v3

    .line 98
    .line 99
    iget-boolean v3, v13, La/c3c0;->b:Z

    .line 100
    .line 101
    move-object/from16 v21, v1

    .line 102
    .line 103
    iget-wide v0, v13, La/c3c0;->c:J

    .line 104
    .line 105
    move-wide/from16 v22, v0

    .line 106
    .line 107
    iget-wide v0, v12, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;->e:J

    .line 108
    .line 109
    move-wide/from16 v24, v0

    .line 110
    .line 111
    iget-wide v0, v12, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;->f:J

    .line 112
    .line 113
    move-wide/from16 v26, v0

    .line 114
    .line 115
    iget-wide v0, v12, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;->c:J

    .line 116
    .line 117
    move-wide/from16 v28, v0

    .line 118
    .line 119
    iget-wide v0, v12, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;->b:J

    .line 120
    .line 121
    iget-boolean v13, v14, La/sff0;->J1:Z

    .line 122
    .line 123
    iget-object v14, v15, La/dgu;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v14, La/x4u;

    .line 126
    .line 127
    move-wide/from16 v30, v0

    .line 128
    .line 129
    iget-object v0, v15, La/dgu;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, La/rpt;

    .line 132
    .line 133
    iget-object v0, v0, La/rpt;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/xyt;

    .line 136
    .line 137
    invoke-virtual {v0}, La/xyt;->a()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    iget-object v1, v14, La/x4u;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, La/fx7;

    .line 144
    .line 145
    iget-object v14, v1, La/fx7;->a:La/knf0;

    .line 146
    .line 147
    invoke-virtual {v14}, La/knf0;->d()La/lnf0;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    move/from16 p1, v0

    .line 152
    .line 153
    new-instance v0, La/jo20;

    .line 154
    .line 155
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 156
    .line 157
    .line 158
    move/from16 v32, v3

    .line 159
    .line 160
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v0, v11, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    const-string v3, "champId"

    .line 168
    .line 169
    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    invoke-virtual {v0, v3, v11}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    if-lez v19, :cond_4

    .line 177
    .line 178
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v0, v10, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_4
    iget v3, v14, La/lnf0;->b:I

    .line 186
    .line 187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v0, v9, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    const-string v3, "gameId"

    .line 195
    .line 196
    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-virtual {v0, v3, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v0, v7, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    iget-object v3, v14, La/lnf0;->a:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0, v6, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v0, v5, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    const-string v3, "sportId"

    .line 223
    .line 224
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v0, v3, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    cmp-long v3, v26, v17

    .line 232
    .line 233
    if-lez v3, :cond_5

    .line 234
    .line 235
    const-string v3, "subSport"

    .line 236
    .line 237
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v0, v3, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    :cond_5
    if-eqz v32, :cond_6

    .line 245
    .line 246
    cmp-long v3, v22, v17

    .line 247
    .line 248
    if-lez v3, :cond_6

    .line 249
    .line 250
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {v0, v4, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    :cond_6
    const/16 v3, 0x16

    .line 258
    .line 259
    invoke-static {v3, v0, v2}, La/w6x;->j(ILa/jo20;Ljava/lang/String;)La/jo20;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v2, v1, La/fx7;->c:La/ief0;

    .line 264
    .line 265
    iget-object v2, v2, La/ief0;->a:La/or30;

    .line 266
    .line 267
    sget-object v3, La/sip;->c:La/sip;

    .line 268
    .line 269
    invoke-static {v3}, La/kpb;->v(La/sip;)J

    .line 270
    .line 271
    .line 272
    move-result-wide v23

    .line 273
    new-instance v3, La/za;

    .line 274
    .line 275
    const/16 v4, 0x1b

    .line 276
    .line 277
    const/4 v5, 0x0

    .line 278
    invoke-direct {v3, v1, v0, v5, v4}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 279
    .line 280
    .line 281
    const/16 v27, 0xfc

    .line 282
    .line 283
    const/16 v25, 0x0

    .line 284
    .line 285
    move-object/from16 v22, v2

    .line 286
    .line 287
    move-object/from16 v26, v3

    .line 288
    .line 289
    invoke-static/range {v22 .. v27}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    new-instance v1, La/xpp;

    .line 294
    .line 295
    const/4 v2, 0x4

    .line 296
    invoke-direct {v1, v5, v15, v13, v2}, La/xpp;-><init>(La/yje;Ljava/lang/Object;ZB)V

    .line 297
    .line 298
    .line 299
    invoke-static {v0, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v1, La/rj;

    .line 304
    .line 305
    const/16 v2, 0x12

    .line 306
    .line 307
    invoke-direct {v1, v8, v12, v5, v2}, La/rj;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 308
    .line 309
    .line 310
    new-instance v2, La/dnq;

    .line 311
    .line 312
    move/from16 v3, v20

    .line 313
    .line 314
    invoke-direct {v2, v0, v1, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 315
    .line 316
    .line 317
    new-instance v0, La/na;

    .line 318
    .line 319
    invoke-direct {v0, v8, v12, v4}, La/na;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v1, p0

    .line 323
    .line 324
    iput-object v5, v1, La/ybh;->j:La/sff0;

    .line 325
    .line 326
    const/4 v3, 0x2

    .line 327
    iput-byte v3, v1, La/ybh;->k:B

    .line 328
    .line 329
    invoke-virtual {v2, v0, v1}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    move-object/from16 v1, v21

    .line 334
    .line 335
    if-ne v0, v1, :cond_7

    .line 336
    .line 337
    :goto_1
    move-object v3, v1

    .line 338
    goto :goto_3

    .line 339
    :cond_7
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    :goto_3
    return-object v3

    .line 342
    :pswitch_0
    move-object v1, v0

    .line 343
    sget-object v0, La/wne;->a:La/wne;

    .line 344
    .line 345
    iget-byte v3, v1, La/ybh;->k:B

    .line 346
    .line 347
    if-eqz v3, :cond_a

    .line 348
    .line 349
    const/4 v13, 0x1

    .line 350
    if-eq v3, v13, :cond_9

    .line 351
    .line 352
    const/4 v13, 0x2

    .line 353
    if-ne v3, v13, :cond_8

    .line 354
    .line 355
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_6

    .line 359
    .line 360
    :cond_8
    invoke-static {v15}, La/jf4;->n(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const/4 v3, 0x0

    .line 364
    goto/16 :goto_7

    .line 365
    .line 366
    :cond_9
    iget-object v3, v1, La/ybh;->j:La/sff0;

    .line 367
    .line 368
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v13, p1

    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    iget-object v3, v8, La/dch;->v:La/pru;

    .line 378
    .line 379
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    iget-object v13, v8, La/dch;->u:La/rtu;

    .line 384
    .line 385
    iput-object v3, v1, La/ybh;->j:La/sff0;

    .line 386
    .line 387
    const/4 v14, 0x1

    .line 388
    iput-byte v14, v1, La/ybh;->k:B

    .line 389
    .line 390
    const/4 v14, 0x0

    .line 391
    invoke-virtual {v13, v14, v14, v1}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v13

    .line 395
    if-ne v13, v0, :cond_b

    .line 396
    .line 397
    move-object v15, v0

    .line 398
    goto/16 :goto_5

    .line 399
    .line 400
    :cond_b
    :goto_4
    check-cast v13, La/c3c0;

    .line 401
    .line 402
    iget-object v14, v8, La/dch;->t:La/f7u;

    .line 403
    .line 404
    move-object v15, v0

    .line 405
    iget-wide v0, v12, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;->c:J

    .line 406
    .line 407
    iget v0, v13, La/c3c0;->a:I

    .line 408
    .line 409
    iget-boolean v1, v13, La/c3c0;->b:Z

    .line 410
    .line 411
    iget-wide v12, v13, La/c3c0;->c:J

    .line 412
    .line 413
    iget-boolean v3, v3, La/sff0;->J1:Z

    .line 414
    .line 415
    move/from16 v19, v0

    .line 416
    .line 417
    iget-object v0, v14, La/f7u;->b:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, La/p4u;

    .line 420
    .line 421
    move/from16 v21, v1

    .line 422
    .line 423
    iget-object v1, v14, La/f7u;->d:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v1, La/rpt;

    .line 426
    .line 427
    iget-object v1, v1, La/rpt;->a:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v1, La/xyt;

    .line 430
    .line 431
    invoke-virtual {v1}, La/xyt;->a()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    iget-object v0, v0, La/p4u;->a:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, La/fx7;

    .line 438
    .line 439
    move/from16 p1, v1

    .line 440
    .line 441
    iget-object v1, v0, La/fx7;->a:La/knf0;

    .line 442
    .line 443
    invoke-virtual {v1}, La/knf0;->d()La/lnf0;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    move-wide/from16 v22, v12

    .line 448
    .line 449
    new-instance v12, La/jo20;

    .line 450
    .line 451
    invoke-direct {v12}, La/jo20;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v13

    .line 458
    invoke-virtual {v12, v11, v13}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    if-lez v19, :cond_c

    .line 462
    .line 463
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v11

    .line 467
    invoke-virtual {v12, v10, v11}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    :cond_c
    iget v10, v1, La/lnf0;->b:I

    .line 471
    .line 472
    if-lez v10, :cond_d

    .line 473
    .line 474
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v10

    .line 478
    invoke-virtual {v12, v9, v10}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    :cond_d
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    invoke-virtual {v12, v7, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    iget-object v1, v1, La/lnf0;->a:Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v12, v6, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    const/16 v20, 0x1

    .line 494
    .line 495
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v12, v5, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    if-eqz v21, :cond_e

    .line 503
    .line 504
    cmp-long v1, v22, v17

    .line 505
    .line 506
    if-lez v1, :cond_e

    .line 507
    .line 508
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    invoke-virtual {v12, v4, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    :cond_e
    const/16 v1, 0x16

    .line 516
    .line 517
    invoke-static {v1, v12, v2}, La/w6x;->j(ILa/jo20;Ljava/lang/String;)La/jo20;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    new-instance v2, Ljava/util/TreeMap;

    .line 522
    .line 523
    invoke-direct {v2, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 524
    .line 525
    .line 526
    iget-object v1, v0, La/fx7;->c:La/ief0;

    .line 527
    .line 528
    iget-object v1, v1, La/ief0;->b:La/or30;

    .line 529
    .line 530
    sget-object v4, La/sip;->b:La/sip;

    .line 531
    .line 532
    invoke-static {v4}, La/kpb;->v(La/sip;)J

    .line 533
    .line 534
    .line 535
    move-result-wide v22

    .line 536
    new-instance v4, La/za;

    .line 537
    .line 538
    const/16 v5, 0x1a

    .line 539
    .line 540
    const/4 v6, 0x0

    .line 541
    invoke-direct {v4, v0, v2, v6, v5}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 542
    .line 543
    .line 544
    const/16 v26, 0xfc

    .line 545
    .line 546
    const/16 v24, 0x0

    .line 547
    .line 548
    move-object/from16 v21, v1

    .line 549
    .line 550
    move-object/from16 v25, v4

    .line 551
    .line 552
    invoke-static/range {v21 .. v26}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    new-instance v1, La/xpp;

    .line 557
    .line 558
    const/4 v2, 0x5

    .line 559
    invoke-direct {v1, v6, v14, v3, v2}, La/xpp;-><init>(La/yje;Ljava/lang/Object;ZB)V

    .line 560
    .line 561
    .line 562
    invoke-static {v0, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    new-instance v1, La/rj;

    .line 567
    .line 568
    const/16 v2, 0x11

    .line 569
    .line 570
    invoke-direct {v1, v8, v6, v2}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 571
    .line 572
    .line 573
    new-instance v2, La/dnq;

    .line 574
    .line 575
    const/4 v14, 0x1

    .line 576
    invoke-direct {v2, v0, v1, v14}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 577
    .line 578
    .line 579
    new-instance v0, La/b5h;

    .line 580
    .line 581
    invoke-direct {v0, v8, v14}, La/b5h;-><init>(Ljava/lang/Object;B)V

    .line 582
    .line 583
    .line 584
    move-object/from16 v1, p0

    .line 585
    .line 586
    iput-object v6, v1, La/ybh;->j:La/sff0;

    .line 587
    .line 588
    const/4 v3, 0x2

    .line 589
    iput-byte v3, v1, La/ybh;->k:B

    .line 590
    .line 591
    invoke-virtual {v2, v0, v1}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    if-ne v0, v15, :cond_f

    .line 596
    .line 597
    :goto_5
    move-object v3, v15

    .line 598
    goto :goto_7

    .line 599
    :cond_f
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    :goto_7
    return-object v3

    .line 602
    nop

    .line 603
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
