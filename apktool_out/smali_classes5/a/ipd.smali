.class public final synthetic La/ipd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kpd;


# direct methods
.method public synthetic constructor <init>(La/kpd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ipd;->a:B

    iput-object p1, p0, La/ipd;->b:La/kpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ipd;->a:B

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/16 v4, 0x12

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x2

    .line 12
    iget-object v0, v0, La/ipd;->b:La/kpd;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/mm40;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, La/fet;

    .line 27
    .line 28
    move-object/from16 v11, p3

    .line 29
    .line 30
    check-cast v11, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v12, v11, 0x6

    .line 40
    .line 41
    if-nez v12, :cond_1

    .line 42
    .line 43
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    if-eqz v12, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v5, v6

    .line 51
    :goto_0
    or-int/2addr v11, v5

    .line 52
    :cond_1
    and-int/lit8 v5, v11, 0x13

    .line 53
    .line 54
    if-eq v5, v4, :cond_2

    .line 55
    .line 56
    move v4, v9

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v4, v8

    .line 59
    :goto_1
    and-int/lit8 v5, v11, 0x1

    .line 60
    .line 61
    invoke-virtual {v10, v5, v4}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_5

    .line 66
    .line 67
    sget-object v4, La/cn80;->b:La/zfn;

    .line 68
    .line 69
    iget-object v5, v0, La/kpd;->a:La/udp0;

    .line 70
    .line 71
    instance-of v6, v5, La/ycp0;

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    sget-object v5, La/w6n;->k:La/w6n;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    instance-of v5, v5, La/sdp0;

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    sget-object v5, La/w6n;->f:La/w6n;

    .line 83
    .line 84
    :goto_2
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    sget-object v4, La/egp0;->a:La/zfn;

    .line 89
    .line 90
    sget-object v5, La/gqw0;->d:La/zx7;

    .line 91
    .line 92
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    sget-object v4, La/egp0;->c:La/zfn;

    .line 97
    .line 98
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 99
    .line 100
    invoke-virtual {v10, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, La/g1t0;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    sget-object v4, La/egp0;->b:La/zfn;

    .line 118
    .line 119
    const/4 v5, 0x5

    .line 120
    invoke-static {v5, v4}, La/dw9;->k(ILa/zfn;)La/l5d0;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    sget-object v4, La/cn80;->a:La/zfn;

    .line 125
    .line 126
    sget-object v5, La/bmd;->n:La/zfn;

    .line 127
    .line 128
    invoke-virtual {v10, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    sget-object v4, La/kcp0;->c:La/zfn;

    .line 137
    .line 138
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    sget-object v4, La/kcp0;->a:La/zfn;

    .line 145
    .line 146
    invoke-virtual {v4, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 147
    .line 148
    .line 149
    move-result-object v17

    .line 150
    sget-object v4, La/egp0;->d:La/zfn;

    .line 151
    .line 152
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v4, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 157
    .line 158
    .line 159
    move-result-object v18

    .line 160
    filled-new-array/range {v11 .. v18}, [La/l5d0;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    new-instance v4, La/jpd;

    .line 165
    .line 166
    invoke-direct {v4, v1, v0, v8}, La/jpd;-><init>(La/mm40;La/kpd;B)V

    .line 167
    .line 168
    .line 169
    const v0, -0x5db43bf3

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v4, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v3, v0, v10, v2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 185
    .line 186
    .line 187
    :goto_3
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_4
    return-object v7

    .line 190
    :pswitch_0
    move-object/from16 v1, p1

    .line 191
    .line 192
    check-cast v1, La/mm40;

    .line 193
    .line 194
    move-object/from16 v2, p2

    .line 195
    .line 196
    check-cast v2, La/fet;

    .line 197
    .line 198
    move-object/from16 v3, p3

    .line 199
    .line 200
    check-cast v3, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    and-int/lit8 v1, v3, 0x11

    .line 210
    .line 211
    const/16 v4, 0x10

    .line 212
    .line 213
    if-eq v1, v4, :cond_6

    .line 214
    .line 215
    move v1, v9

    .line 216
    goto :goto_5

    .line 217
    :cond_6
    move v1, v8

    .line 218
    :goto_5
    and-int/2addr v3, v9

    .line 219
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_7

    .line 224
    .line 225
    sget-object v1, La/qmk;->a:La/zcl;

    .line 226
    .line 227
    const/high16 v1, 0x41000000    # 8.0f

    .line 228
    .line 229
    const/4 v3, 0x0

    .line 230
    sget-object v4, La/jm40;->b:La/jm40;

    .line 231
    .line 232
    invoke-static {v4, v1, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    iget-object v0, v0, La/kpd;->d:La/mpm;

    .line 237
    .line 238
    sget-object v3, La/kr00;->a:La/zfn;

    .line 239
    .line 240
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-static {v1, v0, v3, v2, v8}, La/n4c;->l(La/mm40;La/mpm;ZLa/fet;I)V

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 255
    .line 256
    .line 257
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_1
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/mm40;

    .line 263
    .line 264
    move-object/from16 v10, p2

    .line 265
    .line 266
    check-cast v10, La/fet;

    .line 267
    .line 268
    move-object/from16 v11, p3

    .line 269
    .line 270
    check-cast v11, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    and-int/lit8 v12, v11, 0x6

    .line 280
    .line 281
    if-nez v12, :cond_9

    .line 282
    .line 283
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    if-eqz v12, :cond_8

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_8
    move v5, v6

    .line 291
    :goto_7
    or-int/2addr v11, v5

    .line 292
    :cond_9
    and-int/lit8 v5, v11, 0x13

    .line 293
    .line 294
    if-eq v5, v4, :cond_a

    .line 295
    .line 296
    move v8, v9

    .line 297
    :cond_a
    and-int/lit8 v4, v11, 0x1

    .line 298
    .line 299
    invoke-virtual {v10, v4, v8}, La/fet;->U(IZ)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_d

    .line 304
    .line 305
    sget-object v4, La/cn80;->b:La/zfn;

    .line 306
    .line 307
    iget-object v5, v0, La/kpd;->a:La/udp0;

    .line 308
    .line 309
    instance-of v6, v5, La/ycp0;

    .line 310
    .line 311
    if-eqz v6, :cond_b

    .line 312
    .line 313
    sget-object v5, La/w6n;->k:La/w6n;

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_b
    instance-of v5, v5, La/sdp0;

    .line 317
    .line 318
    if-eqz v5, :cond_c

    .line 319
    .line 320
    sget-object v5, La/w6n;->f:La/w6n;

    .line 321
    .line 322
    :goto_8
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    sget-object v4, La/egp0;->a:La/zfn;

    .line 327
    .line 328
    sget-object v5, La/gqw0;->f:La/zx7;

    .line 329
    .line 330
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    sget-object v4, La/egp0;->c:La/zfn;

    .line 335
    .line 336
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 337
    .line 338
    invoke-virtual {v10, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, La/g1t0;

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    sget-object v4, La/egp0;->b:La/zfn;

    .line 356
    .line 357
    const/4 v5, 0x6

    .line 358
    invoke-static {v5, v4}, La/dw9;->k(ILa/zfn;)La/l5d0;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    sget-object v4, La/cn80;->a:La/zfn;

    .line 363
    .line 364
    sget-object v5, La/bmd;->n:La/zfn;

    .line 365
    .line 366
    invoke-virtual {v10, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    sget-object v4, La/kcp0;->c:La/zfn;

    .line 375
    .line 376
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 377
    .line 378
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 379
    .line 380
    .line 381
    move-result-object v16

    .line 382
    sget-object v4, La/kcp0;->a:La/zfn;

    .line 383
    .line 384
    invoke-virtual {v4, v7}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 385
    .line 386
    .line 387
    move-result-object v17

    .line 388
    sget-object v4, La/egp0;->d:La/zfn;

    .line 389
    .line 390
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-virtual {v4, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 395
    .line 396
    .line 397
    move-result-object v18

    .line 398
    filled-new-array/range {v11 .. v18}, [La/l5d0;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    new-instance v4, La/jpd;

    .line 403
    .line 404
    invoke-direct {v4, v1, v0, v9}, La/jpd;-><init>(La/mm40;La/kpd;B)V

    .line 405
    .line 406
    .line 407
    const v0, -0x4222a7f5

    .line 408
    .line 409
    .line 410
    invoke-static {v0, v4, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {v3, v0, v10, v2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 415
    .line 416
    .line 417
    goto :goto_9

    .line 418
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 419
    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_d
    invoke-virtual {v10}, La/fet;->X()V

    .line 423
    .line 424
    .line 425
    :goto_9
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    :goto_a
    return-object v7

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
