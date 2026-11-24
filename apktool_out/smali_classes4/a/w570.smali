.class public final La/w570;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/g670;


# direct methods
.method public synthetic constructor <init>(La/g670;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w570;->i:B

    iput-object p1, p0, La/w570;->k:La/g670;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/w570;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/w570;->k:La/g670;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/w570;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/w570;-><init>(La/g670;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/w570;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/w570;-><init>(La/g670;La/yje;B)V

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
    iget-byte v0, p0, La/w570;->i:B

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
    invoke-virtual {p0, p1, p2}, La/w570;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w570;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w570;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/w570;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/w570;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/w570;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w570;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/w570;->k:La/g670;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v3, La/g670;->u:La/wsf0;

    .line 17
    .line 18
    sget-object v8, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v9, v0, La/w570;->j:B

    .line 21
    .line 22
    if-eqz v9, :cond_2

    .line 23
    .line 24
    if-eq v9, v4, :cond_1

    .line 25
    .line 26
    if-ne v9, v5, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v2, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, La/g45;

    .line 51
    .line 52
    invoke-virtual {v2}, La/g45;->y()La/ahu;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v9, La/bm5;->d:La/bm5;

    .line 57
    .line 58
    iput-byte v4, v0, La/w570;->j:B

    .line 59
    .line 60
    invoke-virtual {v2, v9, v0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-ne v2, v8, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    :goto_0
    move-object v4, v2

    .line 68
    check-cast v4, La/ql5;

    .line 69
    .line 70
    iget-object v4, v4, La/ql5;->i:La/txs0;

    .line 71
    .line 72
    invoke-virtual {v4}, La/txs0;->f()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    move-object v2, v7

    .line 80
    :goto_1
    check-cast v2, La/ql5;

    .line 81
    .line 82
    if-nez v2, :cond_6

    .line 83
    .line 84
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, La/g45;

    .line 87
    .line 88
    invoke-virtual {v2}, La/g45;->E()La/nou;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iput-byte v5, v0, La/w570;->j:B

    .line 93
    .line 94
    invoke-static {v2, v0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-ne v0, v8, :cond_5

    .line 99
    .line 100
    :goto_2
    move-object v7, v8

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    :goto_3
    move-object v2, v0

    .line 103
    check-cast v2, La/ql5;

    .line 104
    .line 105
    :cond_6
    invoke-virtual {v1}, La/wsf0;->s()La/trm0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, La/bm5;->d:La/bm5;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, v3, La/g670;->k:La/kyg0;

    .line 115
    .line 116
    iget-wide v1, v2, La/ql5;->a:J

    .line 117
    .line 118
    invoke-virtual {v0, v1, v2}, La/kyg0;->a(J)V

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iget-object v0, v3, La/g670;->m:La/mne;

    .line 126
    .line 127
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 128
    .line 129
    new-instance v9, La/m570;

    .line 130
    .line 131
    invoke-direct {v9, v3, v6}, La/m570;-><init>(La/g670;B)V

    .line 132
    .line 133
    .line 134
    new-instance v12, La/w570;

    .line 135
    .line 136
    invoke-direct {v12, v3, v7, v6}, La/w570;-><init>(La/g670;La/yje;B)V

    .line 137
    .line 138
    .line 139
    const/16 v13, 0xa

    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 143
    .line 144
    .line 145
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_4
    return-object v7

    .line 148
    :pswitch_0
    iget-object v1, v3, La/g670;->A:La/p7m0;

    .line 149
    .line 150
    sget-object v8, La/wne;->a:La/wne;

    .line 151
    .line 152
    iget-byte v9, v0, La/w570;->j:B

    .line 153
    .line 154
    const/4 v10, 0x4

    .line 155
    const/4 v11, 0x3

    .line 156
    if-eqz v9, :cond_b

    .line 157
    .line 158
    if-eq v9, v4, :cond_a

    .line 159
    .line 160
    if-eq v9, v5, :cond_9

    .line 161
    .line 162
    if-eq v9, v11, :cond_8

    .line 163
    .line 164
    if-ne v9, v10, :cond_7

    .line 165
    .line 166
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_b

    .line 170
    .line 171
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_c

    .line 175
    .line 176
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v2, p1

    .line 180
    .line 181
    goto/16 :goto_9

    .line 182
    .line 183
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v2, p1

    .line 187
    .line 188
    goto/16 :goto_8

    .line 189
    .line 190
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 198
    .line 199
    iput-byte v4, v0, La/w570;->j:B

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    if-ne v2, v8, :cond_c

    .line 210
    .line 211
    goto/16 :goto_a

    .line 212
    .line 213
    :cond_c
    :goto_5
    iget-object v2, v3, La/g670;->r:La/m73;

    .line 214
    .line 215
    iget-object v2, v2, La/m73;->a:La/us00;

    .line 216
    .line 217
    invoke-static {v2}, La/sj3;->J(Landroid/content/Context;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    iget-object v4, v3, La/g670;->E:La/p7m0;

    .line 222
    .line 223
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    check-cast v9, La/gz60;

    .line 228
    .line 229
    iget-boolean v9, v9, La/gz60;->i:Z

    .line 230
    .line 231
    iget-object v12, v3, La/g670;->t:La/j1q0;

    .line 232
    .line 233
    iget-object v12, v12, La/j1q0;->a:La/m1q0;

    .line 234
    .line 235
    iget-object v12, v12, La/m1q0;->a:La/q7d0;

    .line 236
    .line 237
    const-string v13, "WEBVIEW_ANIMATION_ENABLE"

    .line 238
    .line 239
    invoke-virtual {v12}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    invoke-interface {v12, v13, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    sget-object v12, La/r570;->a:La/r570;

    .line 248
    .line 249
    if-nez v2, :cond_e

    .line 250
    .line 251
    if-nez v9, :cond_e

    .line 252
    .line 253
    if-nez v6, :cond_e

    .line 254
    .line 255
    :cond_d
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    move-object v13, v0

    .line 260
    check-cast v13, La/gz60;

    .line 261
    .line 262
    const/16 v19, 0x1

    .line 263
    .line 264
    const/16 v20, 0xff

    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    const/4 v15, 0x0

    .line 268
    const/16 v16, 0x0

    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const/16 v18, 0x0

    .line 273
    .line 274
    invoke-static/range {v13 .. v20}, La/gz60;->a(La/gz60;Ljava/lang/String;ZZZZZI)La/gz60;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    invoke-virtual {v3, v12}, La/g670;->C(La/v570;)V

    .line 285
    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_e
    if-nez v2, :cond_f

    .line 289
    .line 290
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    goto/16 :goto_c

    .line 293
    .line 294
    :cond_f
    if-eqz v9, :cond_11

    .line 295
    .line 296
    if-nez v6, :cond_11

    .line 297
    .line 298
    :cond_10
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    move-object v13, v2

    .line 303
    check-cast v13, La/gz60;

    .line 304
    .line 305
    const/16 v19, 0x0

    .line 306
    .line 307
    const/16 v20, 0xff

    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    invoke-static/range {v13 .. v20}, La/gz60;->a(La/gz60;Ljava/lang/String;ZZZZZI)La/gz60;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-virtual {v4, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-eqz v2, :cond_10

    .line 326
    .line 327
    invoke-virtual {v3, v12}, La/g670;->C(La/v570;)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_11
    if-eqz v9, :cond_13

    .line 332
    .line 333
    :cond_12
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object v12, v2

    .line 338
    check-cast v12, La/gz60;

    .line 339
    .line 340
    const/16 v18, 0x0

    .line 341
    .line 342
    const/16 v19, 0xff

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const/4 v14, 0x0

    .line 346
    const/4 v15, 0x0

    .line 347
    const/16 v16, 0x0

    .line 348
    .line 349
    const/16 v17, 0x0

    .line 350
    .line 351
    invoke-static/range {v12 .. v19}, La/gz60;->a(La/gz60;Ljava/lang/String;ZZZZZI)La/gz60;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-virtual {v4, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_12

    .line 360
    .line 361
    :cond_13
    :goto_7
    iput-byte v5, v0, La/w570;->j:B

    .line 362
    .line 363
    invoke-virtual {v3, v0}, La/g670;->z(La/zje;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    if-ne v2, v8, :cond_14

    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_14
    :goto_8
    check-cast v2, Ljava/lang/Boolean;

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-nez v2, :cond_15

    .line 377
    .line 378
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    goto :goto_c

    .line 381
    :cond_15
    iput-byte v11, v0, La/w570;->j:B

    .line 382
    .line 383
    invoke-virtual {v3, v0}, La/g670;->A(La/zje;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    if-ne v2, v8, :cond_16

    .line 388
    .line 389
    goto :goto_a

    .line 390
    :cond_16
    :goto_9
    check-cast v2, Ljava/lang/Boolean;

    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-nez v2, :cond_17

    .line 397
    .line 398
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_17
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 402
    .line 403
    iput-byte v10, v0, La/w570;->j:B

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    if-ne v0, v8, :cond_18

    .line 414
    .line 415
    :goto_a
    move-object v7, v8

    .line 416
    goto :goto_c

    .line 417
    :cond_18
    :goto_b
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    :goto_c
    return-object v7

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
