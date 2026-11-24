.class public final La/hd70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wir;

.field public final synthetic l:La/xd70;


# direct methods
.method public synthetic constructor <init>(La/wir;La/xd70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/hd70;->i:B

    iput-object p1, p0, La/hd70;->k:La/wir;

    iput-object p2, p0, La/hd70;->l:La/xd70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/hd70;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/hd70;->l:La/xd70;

    .line 4
    .line 5
    iget-object p0, p0, La/hd70;->k:La/wir;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/hd70;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/hd70;-><init>(La/wir;La/xd70;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/hd70;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/hd70;-><init>(La/wir;La/xd70;La/yje;B)V

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
    iget-byte v0, p0, La/hd70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/hd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hd70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hd70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hd70;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/hd70;->k:La/wir;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/hd70;->l:La/xd70;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, v0, La/hd70;->j:Z

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    if-eqz v7, :cond_1

    .line 22
    .line 23
    if-ne v7, v5, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v4, La/wir;->a:Ljava/lang/Integer;

    .line 40
    .line 41
    iget-object v3, v4, La/wir;->c:La/pir;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    int-to-long v9, v2

    .line 48
    new-instance v11, La/csr;

    .line 49
    .line 50
    new-instance v12, La/bsr;

    .line 51
    .line 52
    sget-object v2, La/esr;->b:La/nek;

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    iget v4, v3, La/pir;->a:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move v4, v8

    .line 60
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v4}, La/nek;->f(I)La/esr;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    iget-object v2, v3, La/pir;->b:Ljava/lang/Long;

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v14

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    sget-object v2, La/s470;->b:La/s470;

    .line 79
    .line 80
    invoke-virtual {v2}, La/s470;->a()J

    .line 81
    .line 82
    .line 83
    move-result-wide v14

    .line 84
    :goto_1
    if-eqz v3, :cond_4

    .line 85
    .line 86
    iget-object v2, v3, La/pir;->c:Ljava/lang/Double;

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    :goto_2
    move-wide/from16 v16, v2

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    const-wide/16 v2, 0x0

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :goto_3
    invoke-direct/range {v12 .. v17}, La/bsr;-><init>(La/esr;JD)V

    .line 101
    .line 102
    .line 103
    sget-object v2, La/dsr;->a:La/bek;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v14, La/dsr;->c:La/dsr;

    .line 109
    .line 110
    const-wide/16 v15, 0x1

    .line 111
    .line 112
    const-string v13, ""

    .line 113
    .line 114
    invoke-direct/range {v11 .. v16}, La/csr;-><init>(La/bsr;Ljava/lang/String;La/dsr;J)V

    .line 115
    .line 116
    .line 117
    iput-boolean v5, v0, La/hd70;->j:Z

    .line 118
    .line 119
    sget v2, La/xd70;->B0:I

    .line 120
    .line 121
    invoke-virtual {v6, v9, v10, v0, v11}, La/xd70;->Q(JLa/zje;La/csr;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v1, :cond_5

    .line 126
    .line 127
    move-object v2, v1

    .line 128
    goto :goto_6

    .line 129
    :cond_5
    :goto_4
    check-cast v0, La/m7h0;

    .line 130
    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    sget v1, La/xd70;->B0:I

    .line 134
    .line 135
    invoke-virtual {v6}, La/xd70;->l0()V

    .line 136
    .line 137
    .line 138
    iget-object v1, v6, La/xd70;->q:La/i1w0;

    .line 139
    .line 140
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, La/c8d;

    .line 151
    .line 152
    sget-object v3, La/cfx0;->o:La/bjk;

    .line 153
    .line 154
    new-instance v4, La/v7d;

    .line 155
    .line 156
    invoke-direct {v4, v5, v3, v3}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 157
    .line 158
    .line 159
    iput-object v4, v0, La/c8d;->a:La/w7d;

    .line 160
    .line 161
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 162
    .line 163
    invoke-static {v1, v0, v8}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_5
    move-object v2, v0

    .line 168
    check-cast v2, La/paw;

    .line 169
    .line 170
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_6

    .line 175
    .line 176
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, La/oe50;

    .line 181
    .line 182
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_6
    return-object v2

    .line 189
    :pswitch_0
    iget-object v1, v6, La/xd70;->q:La/i1w0;

    .line 190
    .line 191
    sget-object v7, La/wne;->a:La/wne;

    .line 192
    .line 193
    iget-boolean v8, v0, La/hd70;->j:Z

    .line 194
    .line 195
    if-eqz v8, :cond_8

    .line 196
    .line 197
    if-ne v8, v5, :cond_7

    .line 198
    .line 199
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_a

    .line 203
    .line 204
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_b

    .line 208
    .line 209
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    const-wide/16 v2, 0x0

    .line 213
    .line 214
    if-eqz v4, :cond_b

    .line 215
    .line 216
    iget-object v8, v4, La/wir;->a:Ljava/lang/Integer;

    .line 217
    .line 218
    if-eqz v8, :cond_b

    .line 219
    .line 220
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    int-to-long v8, v8

    .line 225
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    check-cast v10, La/xb70;

    .line 230
    .line 231
    iget-object v10, v10, La/xb70;->n:La/fa70;

    .line 232
    .line 233
    iget-wide v10, v10, La/fa70;->e:J

    .line 234
    .line 235
    cmp-long v8, v8, v10

    .line 236
    .line 237
    if-nez v8, :cond_b

    .line 238
    .line 239
    iget-object v4, v4, La/wir;->c:La/pir;

    .line 240
    .line 241
    if-eqz v4, :cond_a

    .line 242
    .line 243
    sget-object v1, La/esr;->b:La/nek;

    .line 244
    .line 245
    iget v4, v4, La/pir;->a:I

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {v4}, La/nek;->f(I)La/esr;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    invoke-virtual {v9}, La/esr;->b()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_9

    .line 259
    .line 260
    :goto_7
    move-wide v10, v2

    .line 261
    goto :goto_8

    .line 262
    :cond_9
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, La/xb70;

    .line 267
    .line 268
    iget-object v1, v1, La/xb70;->n:La/fa70;

    .line 269
    .line 270
    iget-wide v2, v1, La/fa70;->e:J

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :goto_8
    new-instance v1, La/csr;

    .line 274
    .line 275
    new-instance v8, La/bsr;

    .line 276
    .line 277
    const-wide/16 v12, 0x0

    .line 278
    .line 279
    invoke-direct/range {v8 .. v13}, La/bsr;-><init>(La/esr;JD)V

    .line 280
    .line 281
    .line 282
    sget-object v15, La/dsr;->b:La/dsr;

    .line 283
    .line 284
    const-wide/16 v16, 0x0

    .line 285
    .line 286
    const-string v14, ""

    .line 287
    .line 288
    move-object v12, v1

    .line 289
    move-object v13, v8

    .line 290
    invoke-direct/range {v12 .. v17}, La/csr;-><init>(La/bsr;Ljava/lang/String;La/dsr;J)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, La/xb70;

    .line 298
    .line 299
    iget-object v1, v1, La/xb70;->q:La/z870;

    .line 300
    .line 301
    iget-object v1, v1, La/z870;->e:La/ql5;

    .line 302
    .line 303
    iput-boolean v5, v0, La/hd70;->j:Z

    .line 304
    .line 305
    invoke-virtual {v6, v12, v1, v0}, La/xd70;->u0(La/csr;La/ql5;La/zje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-ne v0, v7, :cond_e

    .line 310
    .line 311
    move-object v2, v7

    .line 312
    goto :goto_b

    .line 313
    :cond_a
    sget v0, La/xd70;->B0:I

    .line 314
    .line 315
    invoke-virtual {v6}, La/xd70;->l0()V

    .line 316
    .line 317
    .line 318
    new-instance v0, La/wc70;

    .line 319
    .line 320
    const/4 v2, 0x2

    .line 321
    invoke-direct {v0, v6, v2}, La/wc70;-><init>(La/xd70;B)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 325
    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_b
    sget-object v0, La/a570;->Companion:La/t470;

    .line 329
    .line 330
    if-eqz v4, :cond_c

    .line 331
    .line 332
    iget-object v4, v4, La/wir;->a:Ljava/lang/Integer;

    .line 333
    .line 334
    if-eqz v4, :cond_c

    .line 335
    .line 336
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    int-to-long v4, v4

    .line 341
    goto :goto_9

    .line 342
    :cond_c
    const-wide/16 v4, -0x1

    .line 343
    .line 344
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    cmp-long v0, v4, v2

    .line 348
    .line 349
    if-lez v0, :cond_d

    .line 350
    .line 351
    sget v0, La/xd70;->B0:I

    .line 352
    .line 353
    invoke-virtual {v6}, La/xd70;->l0()V

    .line 354
    .line 355
    .line 356
    new-instance v0, La/wc70;

    .line 357
    .line 358
    const/4 v2, 0x3

    .line 359
    invoke-direct {v0, v6, v2}, La/wc70;-><init>(La/xd70;B)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 363
    .line 364
    .line 365
    goto :goto_a

    .line 366
    :cond_d
    sget v0, La/xd70;->B0:I

    .line 367
    .line 368
    invoke-virtual {v6}, La/xd70;->l0()V

    .line 369
    .line 370
    .line 371
    new-instance v0, La/wc70;

    .line 372
    .line 373
    const/4 v2, 0x4

    .line 374
    invoke-direct {v0, v6, v2}, La/wc70;-><init>(La/xd70;B)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 378
    .line 379
    .line 380
    :cond_e
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    :goto_b
    return-object v2

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
