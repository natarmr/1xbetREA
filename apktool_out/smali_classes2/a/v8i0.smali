.class public final La/v8i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i4;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/i4;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v8i0;->a:B

    iput-object p1, p0, La/v8i0;->b:La/i4;

    iput-object p2, p0, La/v8i0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/v8i0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/v8i0;->b:La/i4;

    .line 9
    .line 10
    const/16 v5, 0x92

    .line 11
    .line 12
    const/16 v6, 0x10

    .line 13
    .line 14
    const/16 v7, 0x20

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x2

    .line 19
    iget-object v0, v0, La/v8i0;->c:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    const/4 v11, 0x4

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/g9z;

    .line 28
    .line 29
    move-object/from16 v12, p2

    .line 30
    .line 31
    check-cast v12, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    move-object/from16 v13, p3

    .line 38
    .line 39
    check-cast v13, La/fet;

    .line 40
    .line 41
    move-object/from16 v14, p4

    .line 42
    .line 43
    check-cast v14, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v14

    .line 49
    and-int/lit8 v15, v14, 0x6

    .line 50
    .line 51
    if-nez v15, :cond_1

    .line 52
    .line 53
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    move v10, v11

    .line 60
    :cond_0
    or-int v1, v14, v10

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move v1, v14

    .line 64
    :goto_0
    and-int/lit8 v10, v14, 0x30

    .line 65
    .line 66
    if-nez v10, :cond_3

    .line 67
    .line 68
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    move v6, v7

    .line 75
    :cond_2
    or-int/2addr v1, v6

    .line 76
    :cond_3
    and-int/lit16 v6, v1, 0x93

    .line 77
    .line 78
    if-eq v6, v5, :cond_4

    .line 79
    .line 80
    move v5, v8

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move v5, v9

    .line 83
    :goto_1
    and-int/lit8 v6, v1, 0x1

    .line 84
    .line 85
    invoke-virtual {v13, v6, v5}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_a

    .line 90
    .line 91
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, La/ljq0;

    .line 96
    .line 97
    const v5, 0x56c651da

    .line 98
    .line 99
    .line 100
    invoke-virtual {v13, v5}, La/fet;->e0(I)V

    .line 101
    .line 102
    .line 103
    new-instance v14, La/rqm;

    .line 104
    .line 105
    new-instance v15, La/tui0;

    .line 106
    .line 107
    iget-object v5, v4, La/ljq0;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v15, v5, v3}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 110
    .line 111
    .line 112
    new-instance v3, La/nvi0;

    .line 113
    .line 114
    iget-boolean v5, v4, La/ljq0;->c:Z

    .line 115
    .line 116
    invoke-direct {v3, v5}, La/nvi0;-><init>(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v4, v4, La/ljq0;->d:La/wui0;

    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const/16 v23, 0x1ba

    .line 124
    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    move-object/from16 v17, v3

    .line 134
    .line 135
    move-object/from16 v20, v4

    .line 136
    .line 137
    invoke-direct/range {v14 .. v23}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    and-int/lit8 v4, v1, 0x70

    .line 145
    .line 146
    xor-int/lit8 v4, v4, 0x30

    .line 147
    .line 148
    if-le v4, v7, :cond_5

    .line 149
    .line 150
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_7

    .line 155
    .line 156
    :cond_5
    and-int/lit8 v1, v1, 0x30

    .line 157
    .line 158
    if-ne v1, v7, :cond_6

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_6
    move v8, v9

    .line 162
    :cond_7
    :goto_2
    or-int v1, v3, v8

    .line 163
    .line 164
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-nez v1, :cond_8

    .line 169
    .line 170
    if-ne v3, v2, :cond_9

    .line 171
    .line 172
    :cond_8
    new-instance v3, La/bp40;

    .line 173
    .line 174
    invoke-direct {v3, v0, v12, v11}, La/bp40;-><init>(Lkotlin/jvm/functions/Function1;IB)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    move-object/from16 v17, v3

    .line 181
    .line 182
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 183
    .line 184
    const/16 v22, 0x0

    .line 185
    .line 186
    const/16 v23, 0xed

    .line 187
    .line 188
    move-object/from16 v21, v13

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v15, 0x0

    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    const/16 v19, 0x0

    .line 197
    .line 198
    const/16 v20, 0x0

    .line 199
    .line 200
    invoke-static/range {v13 .. v23}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 201
    .line 202
    .line 203
    move-object/from16 v0, v21

    .line 204
    .line 205
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_a
    move-object v0, v13

    .line 210
    invoke-virtual {v0}, La/fet;->X()V

    .line 211
    .line 212
    .line 213
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_0
    move-object/from16 v1, p1

    .line 217
    .line 218
    check-cast v1, La/g9z;

    .line 219
    .line 220
    move-object/from16 v12, p2

    .line 221
    .line 222
    check-cast v12, Ljava/lang/Number;

    .line 223
    .line 224
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    move-object/from16 v13, p3

    .line 229
    .line 230
    check-cast v13, La/fet;

    .line 231
    .line 232
    move-object/from16 v14, p4

    .line 233
    .line 234
    check-cast v14, Ljava/lang/Number;

    .line 235
    .line 236
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    and-int/lit8 v15, v14, 0x6

    .line 241
    .line 242
    if-nez v15, :cond_c

    .line 243
    .line 244
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    move v10, v11

    .line 251
    :cond_b
    or-int v1, v14, v10

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_c
    move v1, v14

    .line 255
    :goto_4
    and-int/lit8 v10, v14, 0x30

    .line 256
    .line 257
    if-nez v10, :cond_e

    .line 258
    .line 259
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-eqz v10, :cond_d

    .line 264
    .line 265
    move v6, v7

    .line 266
    :cond_d
    or-int/2addr v1, v6

    .line 267
    :cond_e
    and-int/lit16 v6, v1, 0x93

    .line 268
    .line 269
    if-eq v6, v5, :cond_f

    .line 270
    .line 271
    move v5, v8

    .line 272
    goto :goto_5

    .line 273
    :cond_f
    move v5, v9

    .line 274
    :goto_5
    and-int/lit8 v6, v1, 0x1

    .line 275
    .line 276
    invoke-virtual {v13, v6, v5}, La/fet;->U(IZ)Z

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    if-eqz v5, :cond_15

    .line 281
    .line 282
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, La/e9i0;

    .line 287
    .line 288
    const v5, 0x206166d6

    .line 289
    .line 290
    .line 291
    invoke-virtual {v13, v5}, La/fet;->e0(I)V

    .line 292
    .line 293
    .line 294
    new-instance v14, La/rqm;

    .line 295
    .line 296
    new-instance v15, La/tui0;

    .line 297
    .line 298
    iget-object v5, v4, La/e9i0;->a:Ljava/lang/String;

    .line 299
    .line 300
    invoke-direct {v15, v5, v3}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 301
    .line 302
    .line 303
    new-instance v3, La/nvi0;

    .line 304
    .line 305
    iget-boolean v5, v4, La/e9i0;->b:Z

    .line 306
    .line 307
    invoke-direct {v3, v5}, La/nvi0;-><init>(Z)V

    .line 308
    .line 309
    .line 310
    iget-object v4, v4, La/e9i0;->c:La/wui0;

    .line 311
    .line 312
    const/16 v22, 0x0

    .line 313
    .line 314
    const/16 v23, 0x1ba

    .line 315
    .line 316
    const/16 v16, 0x0

    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    move-object/from16 v17, v3

    .line 325
    .line 326
    move-object/from16 v20, v4

    .line 327
    .line 328
    invoke-direct/range {v14 .. v23}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    and-int/lit8 v4, v1, 0x70

    .line 336
    .line 337
    xor-int/lit8 v4, v4, 0x30

    .line 338
    .line 339
    if-le v4, v7, :cond_10

    .line 340
    .line 341
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-nez v4, :cond_12

    .line 346
    .line 347
    :cond_10
    and-int/lit8 v1, v1, 0x30

    .line 348
    .line 349
    if-ne v1, v7, :cond_11

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_11
    move v8, v9

    .line 353
    :cond_12
    :goto_6
    or-int v1, v3, v8

    .line 354
    .line 355
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    if-nez v1, :cond_13

    .line 360
    .line 361
    if-ne v3, v2, :cond_14

    .line 362
    .line 363
    :cond_13
    new-instance v3, La/bp40;

    .line 364
    .line 365
    const/4 v1, 0x3

    .line 366
    invoke-direct {v3, v0, v12, v1}, La/bp40;-><init>(Lkotlin/jvm/functions/Function1;IB)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_14
    move-object/from16 v17, v3

    .line 373
    .line 374
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    const/16 v23, 0xed

    .line 379
    .line 380
    move-object/from16 v21, v13

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v15, 0x0

    .line 384
    const/16 v16, 0x0

    .line 385
    .line 386
    const/16 v18, 0x0

    .line 387
    .line 388
    const/16 v19, 0x0

    .line 389
    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    invoke-static/range {v13 .. v23}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 393
    .line 394
    .line 395
    move-object/from16 v0, v21

    .line 396
    .line 397
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 398
    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_15
    move-object v0, v13

    .line 402
    invoke-virtual {v0}, La/fet;->X()V

    .line 403
    .line 404
    .line 405
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object v0

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
