.class public final La/ywk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/yhi;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:La/hie0;

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(La/yje;La/yhi;IILa/hie0;ZB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/ywk0;->i:B

    iput-object p2, p0, La/ywk0;->m:La/yhi;

    iput p3, p0, La/ywk0;->n:I

    iput p4, p0, La/ywk0;->o:I

    iput-object p5, p0, La/ywk0;->p:La/hie0;

    iput-boolean p6, p0, La/ywk0;->q:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ywk0;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    move-object v1, p3

    .line 6
    check-cast v1, La/yje;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, La/ywk0;

    .line 12
    .line 13
    iget-boolean v6, p0, La/ywk0;->q:Z

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    iget-object v2, p0, La/ywk0;->m:La/yhi;

    .line 17
    .line 18
    iget v3, p0, La/ywk0;->n:I

    .line 19
    .line 20
    iget v4, p0, La/ywk0;->o:I

    .line 21
    .line 22
    iget-object v5, p0, La/ywk0;->p:La/hie0;

    .line 23
    .line 24
    invoke-direct/range {v0 .. v7}, La/ywk0;-><init>(La/yje;La/yhi;IILa/hie0;ZB)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, La/ywk0;->k:La/kmq;

    .line 28
    .line 29
    iput-object p2, v0, La/ywk0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, La/ywk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    new-instance v0, La/ywk0;

    .line 39
    .line 40
    iget-boolean v6, p0, La/ywk0;->q:Z

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    iget-object v2, p0, La/ywk0;->m:La/yhi;

    .line 44
    .line 45
    iget v3, p0, La/ywk0;->n:I

    .line 46
    .line 47
    iget v4, p0, La/ywk0;->o:I

    .line 48
    .line 49
    iget-object v5, p0, La/ywk0;->p:La/hie0;

    .line 50
    .line 51
    invoke-direct/range {v0 .. v7}, La/ywk0;-><init>(La/yje;La/yhi;IILa/hie0;ZB)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v0, La/ywk0;->k:La/kmq;

    .line 55
    .line 56
    iput-object p2, v0, La/ywk0;->l:Ljava/lang/Object;

    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, La/ywk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
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
    iget-byte v1, v0, La/ywk0;->i:B

    .line 4
    .line 5
    iget-boolean v3, v0, La/ywk0;->q:Z

    .line 6
    .line 7
    const/16 v4, 0x14

    .line 8
    .line 9
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v7, v0, La/ywk0;->p:La/hie0;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, La/ywk0;->k:La/kmq;

    .line 21
    .line 22
    iget-object v11, v0, La/ywk0;->l:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object v12, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-boolean v13, v0, La/ywk0;->j:Z

    .line 27
    .line 28
    if-eqz v13, :cond_1

    .line 29
    .line 30
    if-ne v13, v10, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v17, v11

    .line 46
    .line 47
    check-cast v17, La/jvn;

    .line 48
    .line 49
    iget-object v6, v0, La/ywk0;->m:La/yhi;

    .line 50
    .line 51
    iget-object v11, v6, La/yhi;->f:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v15, v11

    .line 54
    check-cast v15, La/lbu;

    .line 55
    .line 56
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v14, La/ydu;

    .line 60
    .line 61
    const/16 v19, 0x0

    .line 62
    .line 63
    iget v11, v0, La/ywk0;->n:I

    .line 64
    .line 65
    iget v13, v0, La/ywk0;->o:I

    .line 66
    .line 67
    move/from16 v16, v11

    .line 68
    .line 69
    move/from16 v18, v13

    .line 70
    .line 71
    invoke-direct/range {v14 .. v19}, La/ydu;-><init>(La/lbu;ILa/jvn;ILa/yje;)V

    .line 72
    .line 73
    .line 74
    move v13, v3

    .line 75
    const-wide/16 v2, 0x8

    .line 76
    .line 77
    invoke-static {v2, v3, v5, v14}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    new-instance v14, La/vls;

    .line 82
    .line 83
    const/16 v11, 0x1d

    .line 84
    .line 85
    invoke-direct {v14, v11}, La/vls;-><init>(B)V

    .line 86
    .line 87
    .line 88
    new-instance v11, La/jcs;

    .line 89
    .line 90
    const/16 v8, 0x17

    .line 91
    .line 92
    invoke-direct {v11, v15, v8}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v5, v2, v3, v14, v11}, La/ebc;->i0(La/vsg0;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)La/a1g;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v3, La/xvu;

    .line 100
    .line 101
    const/4 v5, 0x6

    .line 102
    invoke-direct {v3, v7, v5}, La/xvu;-><init>(La/hie0;B)V

    .line 103
    .line 104
    .line 105
    new-instance v5, La/wwk0;

    .line 106
    .line 107
    const/4 v8, 0x3

    .line 108
    invoke-direct {v5, v6, v9, v8}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 109
    .line 110
    .line 111
    new-instance v18, La/bxk0;

    .line 112
    .line 113
    const/16 v24, 0x0

    .line 114
    .line 115
    const-wide/16 v22, 0x8

    .line 116
    .line 117
    move-object/from16 v20, v3

    .line 118
    .line 119
    move-object/from16 v21, v5

    .line 120
    .line 121
    move-object/from16 v19, v6

    .line 122
    .line 123
    invoke-direct/range {v18 .. v24}, La/bxk0;-><init>(La/yhi;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;JLa/yje;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 v3, v18

    .line 127
    .line 128
    move-object/from16 v5, v19

    .line 129
    .line 130
    new-instance v6, La/a1g;

    .line 131
    .line 132
    invoke-direct {v6, v2, v3, v4}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    new-instance v2, La/axk0;

    .line 136
    .line 137
    invoke-direct {v2, v9, v5, v13, v10}, La/axk0;-><init>(La/yje;La/yhi;ZB)V

    .line 138
    .line 139
    .line 140
    invoke-static {v6, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    new-instance v3, La/xwk0;

    .line 145
    .line 146
    const/4 v4, 0x2

    .line 147
    invoke-direct {v3, v5, v9, v4}, La/xwk0;-><init>(La/yhi;La/yje;B)V

    .line 148
    .line 149
    .line 150
    new-instance v5, La/dnq;

    .line 151
    .line 152
    invoke-direct {v5, v2, v3, v10}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 153
    .line 154
    .line 155
    new-instance v2, La/uwu;

    .line 156
    .line 157
    const/4 v11, 0x5

    .line 158
    invoke-direct {v2, v7, v9, v11}, La/uwu;-><init>(La/hie0;La/yje;B)V

    .line 159
    .line 160
    .line 161
    iput-object v9, v0, La/ywk0;->k:La/kmq;

    .line 162
    .line 163
    iput-object v9, v0, La/ywk0;->l:Ljava/lang/Object;

    .line 164
    .line 165
    iput-boolean v10, v0, La/ywk0;->j:Z

    .line 166
    .line 167
    invoke-static {v1}, La/f7k;->J(La/kmq;)V

    .line 168
    .line 169
    .line 170
    new-instance v3, La/vnq;

    .line 171
    .line 172
    invoke-direct {v3, v1, v2, v4}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v3, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v12, :cond_2

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    :goto_0
    if-ne v0, v12, :cond_3

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_1
    if-ne v0, v12, :cond_4

    .line 190
    .line 191
    move-object v9, v12

    .line 192
    goto :goto_3

    .line 193
    :cond_4
    :goto_2
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    :goto_3
    return-object v9

    .line 196
    :pswitch_0
    move v13, v3

    .line 197
    iget-object v1, v0, La/ywk0;->k:La/kmq;

    .line 198
    .line 199
    iget-object v2, v0, La/ywk0;->l:Ljava/lang/Object;

    .line 200
    .line 201
    sget-object v3, La/wne;->a:La/wne;

    .line 202
    .line 203
    iget-boolean v8, v0, La/ywk0;->j:Z

    .line 204
    .line 205
    if-eqz v8, :cond_6

    .line 206
    .line 207
    if-ne v8, v10, :cond_5

    .line 208
    .line 209
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_6

    .line 213
    .line 214
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_7

    .line 218
    .line 219
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    move-object/from16 v21, v2

    .line 223
    .line 224
    check-cast v21, La/jvn;

    .line 225
    .line 226
    iget-object v2, v0, La/ywk0;->m:La/yhi;

    .line 227
    .line 228
    iget-object v6, v2, La/yhi;->e:Ljava/lang/Object;

    .line 229
    .line 230
    move-object/from16 v18, v6

    .line 231
    .line 232
    check-cast v18, La/khf0;

    .line 233
    .line 234
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance v17, La/ydu;

    .line 238
    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    iget v6, v0, La/ywk0;->n:I

    .line 242
    .line 243
    iget v8, v0, La/ywk0;->o:I

    .line 244
    .line 245
    move/from16 v19, v6

    .line 246
    .line 247
    move/from16 v20, v8

    .line 248
    .line 249
    invoke-direct/range {v17 .. v22}, La/ydu;-><init>(La/khf0;IILa/jvn;La/yje;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v8, v17

    .line 253
    .line 254
    move-object/from16 v6, v18

    .line 255
    .line 256
    const-wide/16 v14, 0x1e

    .line 257
    .line 258
    invoke-static {v14, v15, v5, v8}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    new-instance v8, La/vls;

    .line 263
    .line 264
    const/16 v12, 0x1c

    .line 265
    .line 266
    invoke-direct {v8, v12}, La/vls;-><init>(B)V

    .line 267
    .line 268
    .line 269
    new-instance v12, La/jcs;

    .line 270
    .line 271
    const/16 v11, 0x16

    .line 272
    .line 273
    invoke-direct {v12, v6, v11}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 274
    .line 275
    .line 276
    invoke-static {v5, v14, v15, v8, v12}, La/ebc;->i0(La/vsg0;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)La/a1g;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    new-instance v6, La/xvu;

    .line 281
    .line 282
    const/4 v11, 0x5

    .line 283
    invoke-direct {v6, v7, v11}, La/xvu;-><init>(La/hie0;B)V

    .line 284
    .line 285
    .line 286
    new-instance v8, La/wwk0;

    .line 287
    .line 288
    invoke-direct {v8, v2, v9, v10}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 289
    .line 290
    .line 291
    new-instance v22, La/bxk0;

    .line 292
    .line 293
    const/16 v28, 0x0

    .line 294
    .line 295
    const-wide/16 v26, 0x1e

    .line 296
    .line 297
    move-object/from16 v23, v2

    .line 298
    .line 299
    move-object/from16 v24, v6

    .line 300
    .line 301
    move-object/from16 v25, v8

    .line 302
    .line 303
    invoke-direct/range {v22 .. v28}, La/bxk0;-><init>(La/yhi;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;JLa/yje;)V

    .line 304
    .line 305
    .line 306
    move-object/from16 v2, v22

    .line 307
    .line 308
    move-object/from16 v6, v23

    .line 309
    .line 310
    new-instance v8, La/a1g;

    .line 311
    .line 312
    invoke-direct {v8, v5, v2, v4}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 313
    .line 314
    .line 315
    new-instance v2, La/axk0;

    .line 316
    .line 317
    const/4 v4, 0x0

    .line 318
    invoke-direct {v2, v9, v6, v13, v4}, La/axk0;-><init>(La/yje;La/yhi;ZB)V

    .line 319
    .line 320
    .line 321
    invoke-static {v8, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    new-instance v4, La/xwk0;

    .line 326
    .line 327
    invoke-direct {v4, v6, v9, v10}, La/xwk0;-><init>(La/yhi;La/yje;B)V

    .line 328
    .line 329
    .line 330
    new-instance v5, La/dnq;

    .line 331
    .line 332
    invoke-direct {v5, v2, v4, v10}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 333
    .line 334
    .line 335
    new-instance v2, La/uwu;

    .line 336
    .line 337
    const/4 v4, 0x4

    .line 338
    invoke-direct {v2, v7, v9, v4}, La/uwu;-><init>(La/hie0;La/yje;B)V

    .line 339
    .line 340
    .line 341
    iput-object v9, v0, La/ywk0;->k:La/kmq;

    .line 342
    .line 343
    iput-object v9, v0, La/ywk0;->l:Ljava/lang/Object;

    .line 344
    .line 345
    iput-boolean v10, v0, La/ywk0;->j:Z

    .line 346
    .line 347
    invoke-static {v1}, La/f7k;->J(La/kmq;)V

    .line 348
    .line 349
    .line 350
    new-instance v4, La/vnq;

    .line 351
    .line 352
    const/4 v6, 0x2

    .line 353
    invoke-direct {v4, v1, v2, v6}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5, v4, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    if-ne v0, v3, :cond_7

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    :goto_4
    if-ne v0, v3, :cond_8

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    :goto_5
    if-ne v0, v3, :cond_9

    .line 371
    .line 372
    move-object v9, v3

    .line 373
    goto :goto_7

    .line 374
    :cond_9
    :goto_6
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    :goto_7
    return-object v9

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
