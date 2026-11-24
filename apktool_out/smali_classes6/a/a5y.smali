.class public final La/a5y;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/ql5;

.field public k:B

.field public final synthetic l:La/c5y;


# direct methods
.method public synthetic constructor <init>(La/c5y;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a5y;->i:B

    iput-object p1, p0, La/a5y;->l:La/c5y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/a5y;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a5y;->l:La/c5y;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/a5y;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/a5y;-><init>(La/c5y;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/a5y;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/a5y;-><init>(La/c5y;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a5y;->i:B

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
    invoke-virtual {p0, p1, p2}, La/a5y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a5y;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a5y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/a5y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/a5y;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/a5y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/a5y;->i:B

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v7, v5, La/a5y;->l:La/c5y;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v8, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v0, v5, La/a5y;->k:B

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-eq v0, v4, :cond_1

    .line 23
    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    iget-object v0, v5, La/a5y;->j:La/ql5;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v8, v0

    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v0, p1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget v0, La/c5y;->F:I

    .line 50
    .line 51
    sget-object v0, La/u4y;->a:La/u4y;

    .line 52
    .line 53
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v7, La/c5y;->r:La/khf0;

    .line 57
    .line 58
    sget-object v1, La/bm5;->m:La/bm5;

    .line 59
    .line 60
    iput-byte v4, v5, La/a5y;->k:B

    .line 61
    .line 62
    invoke-static {v0, v1, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-ne v0, v8, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    :goto_0
    move-object v9, v0

    .line 70
    check-cast v9, La/ql5;

    .line 71
    .line 72
    iget-object v0, v7, La/c5y;->w:La/w5z;

    .line 73
    .line 74
    iget-wide v3, v9, La/ql5;->a:J

    .line 75
    .line 76
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/zzx;

    .line 81
    .line 82
    iget-object v1, v1, La/zzx;->c:La/yw6;

    .line 83
    .line 84
    iget-object v1, v1, La/yw6;->b:La/epm0;

    .line 85
    .line 86
    iget-wide v10, v1, La/epm0;->a:D

    .line 87
    .line 88
    iput-object v9, v5, La/a5y;->j:La/ql5;

    .line 89
    .line 90
    iput-byte v2, v5, La/a5y;->k:B

    .line 91
    .line 92
    move-wide v1, v10

    .line 93
    invoke-virtual/range {v0 .. v5}, La/w5z;->Q(DJLa/zje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v8, :cond_4

    .line 98
    .line 99
    :goto_1
    move-object v3, v8

    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move-object v8, v9

    .line 102
    :goto_2
    check-cast v0, La/npr0;

    .line 103
    .line 104
    iget-object v1, v7, La/c5y;->x:La/ilt0;

    .line 105
    .line 106
    iget-wide v2, v8, La/ql5;->a:J

    .line 107
    .line 108
    iget-wide v4, v0, La/npr0;->c:D

    .line 109
    .line 110
    invoke-virtual {v1, v4, v5, v2, v3}, La/ilt0;->a(DJ)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v7, La/c5y;->t:La/ot;

    .line 114
    .line 115
    sget-object v2, La/bm5;->m:La/bm5;

    .line 116
    .line 117
    iget-wide v9, v0, La/npr0;->c:D

    .line 118
    .line 119
    const/4 v12, 0x0

    .line 120
    const/16 v13, 0x1ffd

    .line 121
    .line 122
    const/4 v11, 0x0

    .line 123
    invoke-static/range {v8 .. v13}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v1, v2, v3}, La/ot;->a(La/bm5;La/ql5;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, La/zzx;

    .line 135
    .line 136
    iget-object v1, v1, La/zzx;->c:La/yw6;

    .line 137
    .line 138
    iget-object v1, v1, La/yw6;->b:La/epm0;

    .line 139
    .line 140
    iget-wide v14, v1, La/epm0;->a:D

    .line 141
    .line 142
    iget-object v10, v0, La/npr0;->a:Ljava/lang/String;

    .line 143
    .line 144
    iget-wide v11, v8, La/ql5;->a:J

    .line 145
    .line 146
    iget-object v13, v0, La/npr0;->b:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v0, v8, La/ql5;->f:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v1, v7, La/c5y;->B:La/ctf0;

    .line 151
    .line 152
    new-array v2, v6, [Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 155
    .line 156
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const v3, 0x7f131629

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v16

    .line 167
    new-instance v9, La/w4y;

    .line 168
    .line 169
    move-object/from16 v17, v0

    .line 170
    .line 171
    invoke-direct/range {v9 .. v17}, La/w4y;-><init>(Ljava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v9}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_3
    return-object v3

    .line 180
    :pswitch_0
    iget-object v0, v7, La/c5y;->A:La/mne;

    .line 181
    .line 182
    sget-object v8, La/wne;->a:La/wne;

    .line 183
    .line 184
    iget-byte v9, v5, La/a5y;->k:B

    .line 185
    .line 186
    if-eqz v9, :cond_7

    .line 187
    .line 188
    if-eq v9, v4, :cond_6

    .line 189
    .line 190
    if-ne v9, v2, :cond_5

    .line 191
    .line 192
    iget-object v1, v5, La/a5y;->j:La/ql5;

    .line 193
    .line 194
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_7

    .line 198
    .line 199
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_8

    .line 203
    .line 204
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v1, p1

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object v1, v7, La/c5y;->r:La/khf0;

    .line 214
    .line 215
    sget-object v9, La/bm5;->m:La/bm5;

    .line 216
    .line 217
    iput-byte v4, v5, La/a5y;->k:B

    .line 218
    .line 219
    invoke-static {v1, v9, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-ne v1, v8, :cond_8

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    :goto_4
    check-cast v1, La/ql5;

    .line 227
    .line 228
    iget-object v9, v7, La/c5y;->v:La/rou;

    .line 229
    .line 230
    iget-object v9, v9, La/rou;->a:La/b3c0;

    .line 231
    .line 232
    invoke-virtual {v9}, La/b3c0;->c()Z

    .line 233
    .line 234
    .line 235
    move-result v17

    .line 236
    iget-object v9, v7, La/i3t0;->i:La/ocj;

    .line 237
    .line 238
    iget-object v9, v9, La/ocj;->a:La/p7m0;

    .line 239
    .line 240
    :goto_5
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget-object v11, v7, La/i3t0;->f:La/oyg0;

    .line 248
    .line 249
    move-object v12, v10

    .line 250
    check-cast v12, La/zzx;

    .line 251
    .line 252
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-object v13, v12

    .line 256
    iget-wide v11, v1, La/ql5;->a:J

    .line 257
    .line 258
    iget-wide v14, v1, La/ql5;->b:D

    .line 259
    .line 260
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v15

    .line 264
    iget-object v14, v1, La/ql5;->f:Ljava/lang/String;

    .line 265
    .line 266
    move-object/from16 v16, v13

    .line 267
    .line 268
    move-object/from16 v18, v14

    .line 269
    .line 270
    iget-wide v13, v1, La/ql5;->e:J

    .line 271
    .line 272
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-object/from16 v19, v10

    .line 279
    .line 280
    new-instance v10, La/um5;

    .line 281
    .line 282
    move-object/from16 v2, v16

    .line 283
    .line 284
    move-object/from16 v16, v18

    .line 285
    .line 286
    move-object/from16 v4, v19

    .line 287
    .line 288
    invoke-direct/range {v10 .. v17}, La/um5;-><init>(JJLjava/lang/String;Ljava/lang/String;Z)V

    .line 289
    .line 290
    .line 291
    const/16 v11, 0x1d

    .line 292
    .line 293
    invoke-static {v2, v10, v3, v6, v11}, La/zzx;->a(La/zzx;La/um5;La/yw6;ZI)La/zzx;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v9, v4, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_a

    .line 302
    .line 303
    iget-object v2, v7, La/c5y;->D:La/ivn;

    .line 304
    .line 305
    iget-object v2, v2, La/ivn;->a:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v2, La/pzu;

    .line 308
    .line 309
    invoke-virtual {v2}, La/pzu;->G()La/krr0;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    iget-wide v9, v2, La/krr0;->b:J

    .line 314
    .line 315
    iget-wide v11, v1, La/ql5;->a:J

    .line 316
    .line 317
    cmp-long v2, v9, v11

    .line 318
    .line 319
    if-eqz v2, :cond_9

    .line 320
    .line 321
    iget-object v2, v7, La/c5y;->q:La/ngu;

    .line 322
    .line 323
    iput-object v1, v5, La/a5y;->j:La/ql5;

    .line 324
    .line 325
    const/4 v4, 0x2

    .line 326
    iput-byte v4, v5, La/a5y;->k:B

    .line 327
    .line 328
    invoke-virtual {v2, v1, v5}, La/ngu;->a(La/ql5;La/zje;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    if-ne v2, v8, :cond_9

    .line 333
    .line 334
    :goto_6
    move-object v3, v8

    .line 335
    goto :goto_8

    .line 336
    :cond_9
    :goto_7
    sget v2, La/c5y;->F:I

    .line 337
    .line 338
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    iget-object v11, v0, La/mne;->a:La/rwj;

    .line 343
    .line 344
    sget-object v9, La/b5y;->a:La/b5y;

    .line 345
    .line 346
    new-instance v12, La/r1w;

    .line 347
    .line 348
    const/16 v2, 0x1c

    .line 349
    .line 350
    invoke-direct {v12, v7, v1, v3, v2}, La/r1w;-><init>(La/i3t0;La/ql5;La/yje;B)V

    .line 351
    .line 352
    .line 353
    const/16 v13, 0xa

    .line 354
    .line 355
    const/4 v10, 0x0

    .line 356
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 357
    .line 358
    .line 359
    iget-object v1, v7, La/c5y;->u:La/b8u;

    .line 360
    .line 361
    sget-object v2, La/bm5;->m:La/bm5;

    .line 362
    .line 363
    invoke-virtual {v1, v2}, La/b8u;->a(La/bm5;)La/i89;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    new-instance v2, La/z4y;

    .line 368
    .line 369
    const/4 v4, 0x1

    .line 370
    invoke-direct {v2, v7, v4}, La/z4y;-><init>(La/c5y;B)V

    .line 371
    .line 372
    .line 373
    sget-object v4, La/i120;->f:La/eoh0;

    .line 374
    .line 375
    const/4 v10, 0x2

    .line 376
    invoke-static {v10, v2}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    invoke-static {v1, v4, v2}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    new-instance v2, La/u5u;

    .line 384
    .line 385
    const/16 v4, 0x19

    .line 386
    .line 387
    invoke-direct {v2, v7, v3, v4}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 388
    .line 389
    .line 390
    new-instance v4, La/fnq;

    .line 391
    .line 392
    const/4 v5, 0x4

    .line 393
    invoke-direct {v4, v1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 394
    .line 395
    .line 396
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 401
    .line 402
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    new-instance v1, La/kaw;

    .line 407
    .line 408
    const/16 v2, 0xd

    .line 409
    .line 410
    invoke-direct {v1, v7, v3, v2}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 411
    .line 412
    .line 413
    invoke-static {v4, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 414
    .line 415
    .line 416
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    :goto_8
    return-object v3

    .line 419
    :cond_a
    const/4 v2, 0x2

    .line 420
    const/4 v4, 0x1

    .line 421
    goto/16 :goto_5

    .line 422
    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
