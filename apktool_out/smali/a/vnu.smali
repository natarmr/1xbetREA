.class public final La/vnu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Z

.field public l:La/kmq;

.field public m:Ljava/lang/Object;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/qg20;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/vnu;->i:B

    .line 13
    iput-object p1, p0, La/vnu;->o:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/wdu;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/vnu;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/vnu;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p3, p0, La/vnu;->k:Z

    .line 7
    .line 8
    const/4 p2, 0x3

    .line 9
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vnu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/vnu;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ql5;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    check-cast p3, La/yje;

    .line 17
    .line 18
    new-instance p2, La/vnu;

    .line 19
    .line 20
    check-cast v1, La/qg20;

    .line 21
    .line 22
    invoke-direct {p2, v1, p3}, La/vnu;-><init>(La/qg20;La/yje;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p2, La/vnu;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iput-boolean p0, p2, La/vnu;->k:Z

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p2, p0}, La/vnu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, La/kmq;

    .line 37
    .line 38
    check-cast p3, La/yje;

    .line 39
    .line 40
    new-instance v0, La/vnu;

    .line 41
    .line 42
    check-cast v1, La/wdu;

    .line 43
    .line 44
    iget-boolean p0, p0, La/vnu;->k:Z

    .line 45
    .line 46
    invoke-direct {v0, p3, v1, p0}, La/vnu;-><init>(La/yje;La/wdu;Z)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v0, La/vnu;->m:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p2, v0, La/vnu;->n:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, La/vnu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
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
    iget-byte v1, v0, La/vnu;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/vnu;->o:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v9, v3

    .line 16
    check-cast v9, La/qg20;

    .line 17
    .line 18
    iget-object v1, v9, La/qg20;->d:La/mne;

    .line 19
    .line 20
    iget-object v3, v9, La/qg20;->V0:La/p7m0;

    .line 21
    .line 22
    iget-object v7, v0, La/vnu;->n:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v15, v7

    .line 25
    check-cast v15, La/ql5;

    .line 26
    .line 27
    iget-boolean v7, v0, La/vnu;->k:Z

    .line 28
    .line 29
    sget-object v8, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget-byte v10, v0, La/vnu;->j:B

    .line 32
    .line 33
    if-eqz v10, :cond_2

    .line 34
    .line 35
    if-eq v10, v4, :cond_1

    .line 36
    .line 37
    if-ne v10, v5, :cond_0

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_1
    iget-object v2, v0, La/vnu;->m:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, La/ke;

    .line 52
    .line 53
    iget-object v4, v0, La/vnu;->l:La/kmq;

    .line 54
    .line 55
    check-cast v4, La/p7m0;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v10, v4

    .line 61
    move-object/from16 v4, p1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v9, La/qg20;->U0:La/p7m0;

    .line 68
    .line 69
    new-instance v10, La/ke;

    .line 70
    .line 71
    sget-object v11, La/pn40;->a:La/pn40;

    .line 72
    .line 73
    iget-wide v11, v15, La/ql5;->b:D

    .line 74
    .line 75
    sget-object v13, La/p3u0;->c:La/p3u0;

    .line 76
    .line 77
    invoke-static {v11, v12, v13}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    iget-object v12, v15, La/ql5;->f:Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct {v10, v11, v12}, La/ke;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v11, v9, La/qg20;->T:La/u4a;

    .line 87
    .line 88
    iput-object v15, v0, La/vnu;->n:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v2, v0, La/vnu;->l:La/kmq;

    .line 91
    .line 92
    iput-object v10, v0, La/vnu;->m:Ljava/lang/Object;

    .line 93
    .line 94
    iput-boolean v7, v0, La/vnu;->k:Z

    .line 95
    .line 96
    iput-byte v4, v0, La/vnu;->j:B

    .line 97
    .line 98
    invoke-virtual {v11, v0}, La/u4a;->a(La/yje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-ne v4, v8, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    move-object/from16 v28, v10

    .line 106
    .line 107
    move-object v10, v2

    .line 108
    move-object/from16 v2, v28

    .line 109
    .line 110
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    new-instance v11, La/nm5;

    .line 117
    .line 118
    invoke-direct {v11, v2, v15, v4}, La/nm5;-><init>(La/ke;La/ql5;Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10, v6, v11}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v10

    .line 137
    iget-wide v12, v15, La/ql5;->a:J

    .line 138
    .line 139
    cmp-long v2, v10, v12

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    const-wide/16 v12, 0x0

    .line 144
    .line 145
    cmp-long v2, v10, v12

    .line 146
    .line 147
    if-eqz v2, :cond_4

    .line 148
    .line 149
    iget-object v2, v9, La/qg20;->j1:La/qoj0;

    .line 150
    .line 151
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    iput-object v15, v0, La/vnu;->n:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v6, v0, La/vnu;->l:La/kmq;

    .line 156
    .line 157
    iput-object v6, v0, La/vnu;->m:Ljava/lang/Object;

    .line 158
    .line 159
    iput-boolean v7, v0, La/vnu;->k:Z

    .line 160
    .line 161
    iput-byte v5, v0, La/vnu;->j:B

    .line 162
    .line 163
    invoke-virtual {v2, v4, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v8, :cond_4

    .line 168
    .line 169
    :goto_1
    move-object v6, v8

    .line 170
    goto/16 :goto_4

    .line 171
    .line 172
    :cond_4
    :goto_2
    iget-wide v4, v15, La/ql5;->a:J

    .line 173
    .line 174
    new-instance v0, Ljava/lang/Long;

    .line 175
    .line 176
    invoke-direct {v0, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v6, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 186
    .line 187
    .line 188
    move-result-object v16

    .line 189
    iget-object v0, v1, La/mne;->a:La/rwj;

    .line 190
    .line 191
    sget-object v17, La/gg20;->a:La/gg20;

    .line 192
    .line 193
    new-instance v2, La/ff20;

    .line 194
    .line 195
    const/4 v3, 0x6

    .line 196
    invoke-direct {v2, v9, v6, v3}, La/ff20;-><init>(La/qg20;La/yje;B)V

    .line 197
    .line 198
    .line 199
    const/16 v21, 0xa

    .line 200
    .line 201
    const/16 v18, 0x0

    .line 202
    .line 203
    move-object/from16 v19, v0

    .line 204
    .line 205
    move-object/from16 v20, v2

    .line 206
    .line 207
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 208
    .line 209
    .line 210
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 211
    .line 212
    .line 213
    move-result-object v22

    .line 214
    iget-object v0, v1, La/mne;->b:La/dvj;

    .line 215
    .line 216
    new-instance v24, La/o0t;

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const/16 v14, 0x14

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    const-class v10, La/qg20;

    .line 223
    .line 224
    const-string v11, "observeCouponUpdate"

    .line 225
    .line 226
    const-string v12, "observeCouponUpdate()V"

    .line 227
    .line 228
    move v1, v7

    .line 229
    move-object/from16 v7, v24

    .line 230
    .line 231
    invoke-direct/range {v7 .. v14}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 232
    .line 233
    .line 234
    new-instance v2, La/cd20;

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    invoke-direct {v2, v9, v3}, La/cd20;-><init>(La/qg20;B)V

    .line 238
    .line 239
    .line 240
    new-instance v3, La/xr10;

    .line 241
    .line 242
    const/4 v4, 0x7

    .line 243
    invoke-direct {v3, v9, v15, v6, v4}, La/xr10;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 244
    .line 245
    .line 246
    const/16 v27, 0x8

    .line 247
    .line 248
    move-object/from16 v25, v0

    .line 249
    .line 250
    move-object/from16 v23, v2

    .line 251
    .line 252
    move-object/from16 v26, v3

    .line 253
    .line 254
    invoke-static/range {v22 .. v27}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9}, La/qg20;->S()V

    .line 258
    .line 259
    .line 260
    iget-object v0, v9, La/qg20;->Z0:La/p7m0;

    .line 261
    .line 262
    new-instance v2, La/a40;

    .line 263
    .line 264
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 265
    .line 266
    const-string v5, ""

    .line 267
    .line 268
    invoke-direct {v2, v5, v3, v4}, La/a40;-><init>(Ljava/lang/String;D)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    iget-object v0, v9, La/qg20;->M0:La/bby;

    .line 278
    .line 279
    if-eqz v0, :cond_5

    .line 280
    .line 281
    invoke-interface {v0, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 282
    .line 283
    .line 284
    :cond_5
    invoke-virtual {v9, v1}, La/qg20;->Q(Z)V

    .line 285
    .line 286
    .line 287
    iget-object v0, v9, La/qg20;->h1:La/p7m0;

    .line 288
    .line 289
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    instance-of v0, v0, La/inb0;

    .line 294
    .line 295
    if-eqz v0, :cond_6

    .line 296
    .line 297
    invoke-virtual {v9}, La/qg20;->z()La/inb0;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    goto :goto_3

    .line 302
    :cond_6
    sget-object v0, La/hnb0;->a:La/hnb0;

    .line 303
    .line 304
    :goto_3
    invoke-virtual {v9, v0}, La/qg20;->e0(La/jnb0;)V

    .line 305
    .line 306
    .line 307
    :cond_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    :goto_4
    return-object v6

    .line 310
    :pswitch_0
    iget-object v1, v0, La/vnu;->m:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v1, La/kmq;

    .line 313
    .line 314
    iget-object v7, v0, La/vnu;->n:Ljava/lang/Object;

    .line 315
    .line 316
    sget-object v8, La/wne;->a:La/wne;

    .line 317
    .line 318
    iget-byte v9, v0, La/vnu;->j:B

    .line 319
    .line 320
    if-eqz v9, :cond_a

    .line 321
    .line 322
    if-eq v9, v4, :cond_9

    .line 323
    .line 324
    if-ne v9, v5, :cond_8

    .line 325
    .line 326
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_9
    iget-object v1, v0, La/vnu;->l:La/kmq;

    .line 335
    .line 336
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    check-cast v7, Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    check-cast v3, La/wdu;

    .line 350
    .line 351
    if-eqz v2, :cond_b

    .line 352
    .line 353
    iget-object v2, v3, La/wdu;->e:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v2, La/jtj;

    .line 356
    .line 357
    iget-object v3, v3, La/wdu;->i:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v3, La/ntu;

    .line 360
    .line 361
    invoke-virtual {v3}, La/ntu;->a()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iget-boolean v7, v0, La/vnu;->k:Z

    .line 366
    .line 367
    invoke-virtual {v2, v3, v4, v7}, La/jtj;->i(Ljava/lang/String;ZZ)La/gmq;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    new-instance v3, La/a1t;

    .line 372
    .line 373
    const/16 v4, 0x12

    .line 374
    .line 375
    invoke-direct {v3, v2, v4}, La/a1t;-><init>(La/gmq;B)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_b
    iget-object v2, v3, La/wdu;->f:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v2, La/wsf0;

    .line 382
    .line 383
    iput-object v6, v0, La/vnu;->m:Ljava/lang/Object;

    .line 384
    .line 385
    iput-object v6, v0, La/vnu;->n:Ljava/lang/Object;

    .line 386
    .line 387
    iput-object v1, v0, La/vnu;->l:La/kmq;

    .line 388
    .line 389
    iput-byte v4, v0, La/vnu;->j:B

    .line 390
    .line 391
    invoke-virtual {v2, v0}, La/wsf0;->o(La/zje;)Lkotlin/Unit;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    if-ne v2, v8, :cond_c

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_c
    :goto_5
    new-instance v2, La/fot;

    .line 399
    .line 400
    const/4 v3, 0x3

    .line 401
    invoke-direct {v2, v5, v6, v3}, La/fot;-><init>(ILa/yje;B)V

    .line 402
    .line 403
    .line 404
    new-instance v3, La/vsg0;

    .line 405
    .line 406
    invoke-direct {v3, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 407
    .line 408
    .line 409
    :goto_6
    iput-object v6, v0, La/vnu;->m:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v6, v0, La/vnu;->n:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v6, v0, La/vnu;->l:La/kmq;

    .line 414
    .line 415
    iput-byte v5, v0, La/vnu;->j:B

    .line 416
    .line 417
    invoke-static {v1, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    if-ne v0, v8, :cond_d

    .line 422
    .line 423
    :goto_7
    move-object v6, v8

    .line 424
    goto :goto_9

    .line 425
    :cond_d
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    :goto_9
    return-object v6

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
