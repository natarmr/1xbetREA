.class public final La/lpn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Z

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:La/i3t0;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/dza;La/hv60;Ljava/lang/String;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/lpn;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/lpn;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/lpn;->n:La/i3t0;

    .line 7
    .line 8
    iput-object p3, p0, La/lpn;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, La/lpn;->k:Z

    .line 11
    .line 12
    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/mpn;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/lpn;->i:B

    .line 16
    iput-object p1, p0, La/lpn;->o:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/lpn;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/lpn;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/lpn;

    .line 9
    .line 10
    iget-object v0, p0, La/lpn;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, La/dza;

    .line 14
    .line 15
    iget-object v0, p0, La/lpn;->n:La/i3t0;

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, La/hv60;

    .line 19
    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v6, p0, La/lpn;->k:Z

    .line 24
    .line 25
    move-object v7, p1

    .line 26
    invoke-direct/range {v2 .. v7}, La/lpn;-><init>(La/dza;La/hv60;Ljava/lang/String;ZLa/yje;)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    move-object v7, p1

    .line 31
    new-instance p0, La/lpn;

    .line 32
    .line 33
    check-cast v1, La/mpn;

    .line 34
    .line 35
    invoke-direct {p0, v1, v7}, La/lpn;-><init>(La/mpn;La/yje;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lpn;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/lpn;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/lpn;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/lpn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/lpn;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/lpn;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/lpn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-byte v0, v8, La/lpn;->i:B

    .line 4
    .line 5
    iget-object v1, v8, La/lpn;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v10, 0x4

    .line 12
    const/4 v11, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, v8, La/lpn;->k:Z

    .line 17
    .line 18
    iget-object v5, v8, La/lpn;->n:La/i3t0;

    .line 19
    .line 20
    check-cast v5, La/hv60;

    .line 21
    .line 22
    iget-object v6, v8, La/lpn;->m:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, La/dza;

    .line 25
    .line 26
    sget-object v7, La/wne;->a:La/wne;

    .line 27
    .line 28
    iget-byte v13, v8, La/lpn;->j:B

    .line 29
    .line 30
    const/4 v14, 0x0

    .line 31
    if-eqz v13, :cond_4

    .line 32
    .line 33
    if-eq v13, v11, :cond_3

    .line 34
    .line 35
    if-eq v13, v3, :cond_2

    .line 36
    .line 37
    if-eq v13, v4, :cond_1

    .line 38
    .line 39
    if-ne v13, v10, :cond_0

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v0, p1

    .line 45
    .line 46
    move/from16 v21, v11

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v12, 0x0

    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :cond_2
    iget-object v0, v8, La/lpn;->l:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/lang/String;

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move/from16 v21, v11

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_3
    iget-object v2, v8, La/lpn;->l:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v13, p1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-boolean v2, v6, La/dza;->h:Z

    .line 87
    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    goto :goto_0

    .line 99
    :cond_5
    const-string v2, ""

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v13, v5, La/hv60;->x:La/lbu;

    .line 105
    .line 106
    iput-object v2, v8, La/lpn;->l:Ljava/lang/Object;

    .line 107
    .line 108
    iput-byte v11, v8, La/lpn;->j:B

    .line 109
    .line 110
    invoke-static {v13, v14, v8, v4}, La/lbu;->k(La/lbu;ILa/yje;I)Ljava/io/Serializable;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    if-ne v13, v7, :cond_6

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_6
    :goto_1
    check-cast v13, Ljava/lang/Iterable;

    .line 119
    .line 120
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    if-eqz v15, :cond_8

    .line 129
    .line 130
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    move/from16 v21, v11

    .line 135
    .line 136
    move-object v11, v15

    .line 137
    check-cast v11, La/pbv;

    .line 138
    .line 139
    iget-object v11, v11, La/pbv;->e:La/a570;

    .line 140
    .line 141
    invoke-static {v11}, La/x1x;->D(La/a570;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v16

    .line 145
    move-object/from16 p1, v15

    .line 146
    .line 147
    iget-wide v14, v6, La/dza;->a:J

    .line 148
    .line 149
    cmp-long v14, v16, v14

    .line 150
    .line 151
    if-nez v14, :cond_7

    .line 152
    .line 153
    move-object/from16 v15, p1

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    move/from16 v11, v21

    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    goto :goto_2

    .line 160
    :cond_8
    move/from16 v21, v11

    .line 161
    .line 162
    const/4 v15, 0x0

    .line 163
    :goto_3
    check-cast v15, La/pbv;

    .line 164
    .line 165
    if-eqz v15, :cond_9

    .line 166
    .line 167
    iget-object v13, v15, La/pbv;->n:La/hds;

    .line 168
    .line 169
    if-eqz v13, :cond_9

    .line 170
    .line 171
    check-cast v1, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v13, v1}, La/hds;->a(Ljava/lang/String;)La/lz60;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-eqz v1, :cond_9

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    sget-object v1, La/jz60;->a:La/jz60;

    .line 181
    .line 182
    :goto_4
    iget-object v13, v5, La/hv60;->P:La/u58;

    .line 183
    .line 184
    iget-wide v9, v6, La/dza;->a:J

    .line 185
    .line 186
    iget-wide v11, v6, La/dza;->a:J

    .line 187
    .line 188
    invoke-virtual {v13, v2, v9, v10, v0}, La/u58;->o(Ljava/lang/String;JZ)V

    .line 189
    .line 190
    .line 191
    iget-object v9, v5, La/hv60;->V:La/ix0;

    .line 192
    .line 193
    long-to-int v10, v11

    .line 194
    invoke-virtual {v9, v2, v10, v0}, La/ix0;->f(Ljava/lang/String;IZ)V

    .line 195
    .line 196
    .line 197
    iget-object v0, v5, La/hv60;->W:La/gw60;

    .line 198
    .line 199
    long-to-int v9, v11

    .line 200
    sget-object v10, La/y1p;->e:La/y1p;

    .line 201
    .line 202
    invoke-virtual {v0, v9, v10, v2, v1}, La/gw60;->d(ILa/y1p;Ljava/lang/String;La/lz60;)V

    .line 203
    .line 204
    .line 205
    if-nez v15, :cond_a

    .line 206
    .line 207
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    goto/16 :goto_a

    .line 210
    .line 211
    :cond_a
    iget-object v15, v5, La/hv60;->S:La/hs60;

    .line 212
    .line 213
    iget-wide v9, v6, La/dza;->a:J

    .line 214
    .line 215
    sget-object v18, La/zn60;->g:La/zn60;

    .line 216
    .line 217
    move-object/from16 v20, v1

    .line 218
    .line 219
    move-object/from16 v19, v2

    .line 220
    .line 221
    move-wide/from16 v16, v9

    .line 222
    .line 223
    invoke-virtual/range {v15 .. v20}, La/hs60;->d(JLa/zn60;Ljava/lang/String;La/lz60;)V

    .line 224
    .line 225
    .line 226
    move-object/from16 v0, v19

    .line 227
    .line 228
    iget-object v1, v5, La/hv60;->C:La/ls;

    .line 229
    .line 230
    iput-object v0, v8, La/lpn;->l:Ljava/lang/Object;

    .line 231
    .line 232
    iput-byte v3, v8, La/lpn;->j:B

    .line 233
    .line 234
    invoke-virtual {v1, v11, v12, v8}, La/ls;->b(JLa/yje;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-ne v1, v7, :cond_b

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_b
    :goto_5
    iget-boolean v1, v6, La/dza;->h:Z

    .line 242
    .line 243
    iget-wide v2, v6, La/dza;->a:J

    .line 244
    .line 245
    if-eqz v1, :cond_c

    .line 246
    .line 247
    const/4 v1, 0x0

    .line 248
    iput-object v1, v8, La/lpn;->l:Ljava/lang/Object;

    .line 249
    .line 250
    iput-byte v4, v8, La/lpn;->j:B

    .line 251
    .line 252
    sget v1, La/hv60;->i0:I

    .line 253
    .line 254
    invoke-virtual {v5, v2, v3, v8, v0}, La/hv60;->T(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v7, :cond_e

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_c
    const/4 v1, 0x0

    .line 262
    iget-object v0, v5, La/hv60;->B:La/z4u;

    .line 263
    .line 264
    iput-object v1, v8, La/lpn;->l:Ljava/lang/Object;

    .line 265
    .line 266
    const/4 v4, 0x4

    .line 267
    iput-byte v4, v8, La/lpn;->j:B

    .line 268
    .line 269
    invoke-virtual {v0, v2, v3, v8}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    if-ne v0, v7, :cond_d

    .line 274
    .line 275
    :goto_6
    move-object v12, v7

    .line 276
    goto :goto_a

    .line 277
    :cond_d
    :goto_7
    check-cast v0, Ljava/lang/Boolean;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    xor-int/lit8 v0, v0, 0x1

    .line 284
    .line 285
    iget-wide v2, v6, La/dza;->a:J

    .line 286
    .line 287
    const/4 v14, 0x6

    .line 288
    invoke-static {v14, v2, v3, v1}, La/jtv;->M0(IJLa/csr;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-eqz v1, :cond_e

    .line 293
    .line 294
    iget-object v2, v5, La/hv60;->o:La/i1w0;

    .line 295
    .line 296
    invoke-static {v2, v2}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-virtual {v3, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iget-object v1, v1, La/ikt0;->a:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, La/c8d;

    .line 307
    .line 308
    sget-object v4, La/cfx0;->o:La/bjk;

    .line 309
    .line 310
    new-instance v5, La/v7d;

    .line 311
    .line 312
    invoke-direct {v5, v0, v4, v4}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 313
    .line 314
    .line 315
    iput-object v5, v1, La/c8d;->a:La/w7d;

    .line 316
    .line 317
    iget-object v0, v3, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 318
    .line 319
    const/4 v11, 0x0

    .line 320
    invoke-static {v2, v0, v11}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    :goto_8
    move-object v1, v0

    .line 325
    check-cast v1, La/paw;

    .line 326
    .line 327
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_e

    .line 332
    .line 333
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    check-cast v1, La/oe50;

    .line 338
    .line 339
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 340
    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_e
    :goto_9
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    :goto_a
    return-object v12

    .line 346
    :pswitch_0
    move/from16 v21, v11

    .line 347
    .line 348
    move-object v9, v1

    .line 349
    check-cast v9, La/mpn;

    .line 350
    .line 351
    sget-object v10, La/wne;->a:La/wne;

    .line 352
    .line 353
    iget-byte v0, v8, La/lpn;->j:B

    .line 354
    .line 355
    if-eqz v0, :cond_12

    .line 356
    .line 357
    move/from16 v1, v21

    .line 358
    .line 359
    if-eq v0, v1, :cond_11

    .line 360
    .line 361
    if-eq v0, v3, :cond_10

    .line 362
    .line 363
    if-ne v0, v4, :cond_f

    .line 364
    .line 365
    iget-object v0, v8, La/lpn;->n:La/i3t0;

    .line 366
    .line 367
    check-cast v0, La/mpn;

    .line 368
    .line 369
    iget-object v1, v8, La/lpn;->m:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v1, La/mpn;

    .line 372
    .line 373
    iget-object v2, v8, La/lpn;->l:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, La/rtu;

    .line 376
    .line 377
    check-cast v2, La/c3c0;

    .line 378
    .line 379
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    move-object v8, v0

    .line 383
    move-object v10, v1

    .line 384
    const/4 v11, 0x0

    .line 385
    move-object/from16 v0, p1

    .line 386
    .line 387
    goto/16 :goto_e

    .line 388
    .line 389
    :cond_f
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    const/4 v12, 0x0

    .line 393
    goto/16 :goto_f

    .line 394
    .line 395
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    move-object/from16 v0, p1

    .line 399
    .line 400
    const/4 v11, 0x0

    .line 401
    goto :goto_c

    .line 402
    :cond_11
    iget-boolean v0, v8, La/lpn;->k:Z

    .line 403
    .line 404
    iget-object v1, v8, La/lpn;->l:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v1, La/rtu;

    .line 407
    .line 408
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    move-object/from16 v2, p1

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    iget-object v1, v9, La/mpn;->t:La/rtu;

    .line 418
    .line 419
    iget-boolean v0, v9, La/mpn;->p:Z

    .line 420
    .line 421
    iget-object v2, v9, La/mpn;->u:La/ieu;

    .line 422
    .line 423
    iput-object v1, v8, La/lpn;->l:Ljava/lang/Object;

    .line 424
    .line 425
    iput-boolean v0, v8, La/lpn;->k:Z

    .line 426
    .line 427
    const/4 v5, 0x1

    .line 428
    iput-byte v5, v8, La/lpn;->j:B

    .line 429
    .line 430
    invoke-virtual {v2, v8}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    if-ne v2, v10, :cond_13

    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_13
    :goto_b
    check-cast v2, La/elt;

    .line 438
    .line 439
    iget v2, v2, La/elt;->e:I

    .line 440
    .line 441
    const/4 v11, 0x0

    .line 442
    iput-object v11, v8, La/lpn;->l:Ljava/lang/Object;

    .line 443
    .line 444
    iput-byte v3, v8, La/lpn;->j:B

    .line 445
    .line 446
    invoke-virtual {v1, v0, v2, v8}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    if-ne v0, v10, :cond_14

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_14
    :goto_c
    check-cast v0, La/c3c0;

    .line 454
    .line 455
    iget-object v1, v9, La/mpn;->H:La/c4m0;

    .line 456
    .line 457
    if-eqz v1, :cond_15

    .line 458
    .line 459
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 460
    .line 461
    .line 462
    :cond_15
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, La/ipn;

    .line 467
    .line 468
    iget-object v1, v1, La/ipn;->d:La/oon;

    .line 469
    .line 470
    instance-of v1, v1, La/jon;

    .line 471
    .line 472
    if-nez v1, :cond_17

    .line 473
    .line 474
    iget-object v1, v9, La/mpn;->J:La/bby;

    .line 475
    .line 476
    if-eqz v1, :cond_16

    .line 477
    .line 478
    invoke-interface {v1, v11}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 479
    .line 480
    .line 481
    :cond_16
    new-instance v1, La/kpn;

    .line 482
    .line 483
    const/4 v5, 0x1

    .line 484
    invoke-direct {v1, v9, v11, v5}, La/kpn;-><init>(La/mpn;La/yje;B)V

    .line 485
    .line 486
    .line 487
    invoke-static {v9, v11, v11, v1, v4}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    iput-object v1, v9, La/mpn;->J:La/bby;

    .line 492
    .line 493
    :cond_17
    iget-object v1, v9, La/mpn;->v:La/g45;

    .line 494
    .line 495
    move-object v3, v1

    .line 496
    iget-wide v1, v9, La/mpn;->o:J

    .line 497
    .line 498
    move-object v5, v3

    .line 499
    iget-boolean v3, v9, La/mpn;->p:Z

    .line 500
    .line 501
    move-object v7, v5

    .line 502
    iget-wide v5, v0, La/c3c0;->c:J

    .line 503
    .line 504
    move-object v12, v7

    .line 505
    iget-boolean v7, v0, La/c3c0;->b:Z

    .line 506
    .line 507
    iget v0, v0, La/c3c0;->a:I

    .line 508
    .line 509
    iput-object v11, v8, La/lpn;->l:Ljava/lang/Object;

    .line 510
    .line 511
    iput-object v9, v8, La/lpn;->m:Ljava/lang/Object;

    .line 512
    .line 513
    iput-object v9, v8, La/lpn;->n:La/i3t0;

    .line 514
    .line 515
    iput-byte v4, v8, La/lpn;->j:B

    .line 516
    .line 517
    move v4, v0

    .line 518
    move-object v0, v12

    .line 519
    invoke-virtual/range {v0 .. v8}, La/g45;->T(JZIJZLa/zje;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    if-ne v0, v10, :cond_18

    .line 524
    .line 525
    :goto_d
    move-object v12, v10

    .line 526
    goto :goto_f

    .line 527
    :cond_18
    move-object v8, v9

    .line 528
    move-object v10, v8

    .line 529
    :goto_e
    check-cast v0, La/gmq;

    .line 530
    .line 531
    new-instance v1, La/sxk;

    .line 532
    .line 533
    const/4 v14, 0x6

    .line 534
    invoke-direct {v1, v9, v11, v14}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 535
    .line 536
    .line 537
    new-instance v12, La/fnq;

    .line 538
    .line 539
    const/4 v4, 0x4

    .line 540
    invoke-direct {v12, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 541
    .line 542
    .line 543
    new-instance v0, La/hin;

    .line 544
    .line 545
    const/4 v6, 0x0

    .line 546
    const/16 v7, 0x9

    .line 547
    .line 548
    const/4 v1, 0x1

    .line 549
    const-class v3, La/mpn;

    .line 550
    .line 551
    const-string v4, "handleError"

    .line 552
    .line 553
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 554
    .line 555
    move-object v2, v9

    .line 556
    invoke-direct/range {v0 .. v7}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 557
    .line 558
    .line 559
    const/4 v5, 0x1

    .line 560
    invoke-static {v8, v12, v11, v0, v5}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    iput-object v0, v10, La/mpn;->H:La/c4m0;

    .line 565
    .line 566
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    :goto_f
    return-object v12

    .line 569
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
