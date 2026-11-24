.class public final synthetic La/zom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lla;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/lla;ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zom;->a:B

    iput-object p1, p0, La/zom;->b:La/lla;

    iput-boolean p2, p0, La/zom;->c:Z

    iput-object p3, p0, La/zom;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zom;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/zom;->b:La/lla;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v10, p1

    .line 14
    .line 15
    check-cast v10, La/fet;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/lit8 v6, v1, 0x3

    .line 26
    .line 27
    if-eq v6, v2, :cond_0

    .line 28
    .line 29
    move v2, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v3

    .line 32
    :goto_0
    and-int/2addr v1, v4

    .line 33
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    invoke-interface {v5}, La/lla;->c()La/hem;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    if-nez v7, :cond_1

    .line 44
    .line 45
    const v0, -0x3242af9

    .line 46
    .line 47
    .line 48
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    const v1, -0x3242af8

    .line 56
    .line 57
    .line 58
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 59
    .line 60
    .line 61
    iget-boolean v8, v0, La/zom;->c:Z

    .line 62
    .line 63
    if-nez v8, :cond_2

    .line 64
    .line 65
    const v1, -0x440bd21

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const v1, -0x10a73e07

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 79
    .line 80
    .line 81
    sget-object v1, La/bmd;->n:La/zfn;

    .line 82
    .line 83
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v2, La/k6z;->a:La/k6z;

    .line 88
    .line 89
    if-ne v1, v2, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move v4, v3

    .line 93
    goto :goto_1

    .line 94
    :goto_2
    if-eqz v4, :cond_4

    .line 95
    .line 96
    const v1, -0x43f9ce2

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 100
    .line 101
    .line 102
    const/4 v11, 0x0

    .line 103
    const/4 v12, 0x1

    .line 104
    const/4 v6, 0x0

    .line 105
    iget-object v9, v0, La/zom;->d:Lkotlin/jvm/functions/Function1;

    .line 106
    .line 107
    invoke-static/range {v6 .. v12}, La/rcb;->z(La/mm40;La/nem;ZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    const v0, -0x43c57c3

    .line 115
    .line 116
    .line 117
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 121
    .line 122
    .line 123
    :goto_3
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 128
    .line 129
    .line 130
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_0
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, La/fet;

    .line 136
    .line 137
    move-object/from16 v6, p2

    .line 138
    .line 139
    check-cast v6, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    and-int/lit8 v7, v6, 0x3

    .line 146
    .line 147
    if-eq v7, v2, :cond_6

    .line 148
    .line 149
    move v2, v4

    .line 150
    goto :goto_5

    .line 151
    :cond_6
    move v2, v3

    .line 152
    :goto_5
    and-int/2addr v6, v4

    .line 153
    invoke-virtual {v1, v6, v2}, La/fet;->U(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_19

    .line 158
    .line 159
    instance-of v2, v5, La/gla;

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    if-eqz v2, :cond_7

    .line 163
    .line 164
    move-object v2, v5

    .line 165
    check-cast v2, La/gla;

    .line 166
    .line 167
    iget-object v2, v2, La/gla;->a:La/tma;

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    instance-of v2, v5, La/hla;

    .line 171
    .line 172
    if-eqz v2, :cond_8

    .line 173
    .line 174
    move-object v2, v5

    .line 175
    check-cast v2, La/hla;

    .line 176
    .line 177
    iget-object v2, v2, La/hla;->a:La/uma;

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_8
    instance-of v2, v5, La/ila;

    .line 181
    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    move-object v2, v5

    .line 185
    check-cast v2, La/ila;

    .line 186
    .line 187
    iget-object v2, v2, La/ila;->c:La/vma;

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    instance-of v2, v5, La/jla;

    .line 191
    .line 192
    if-eqz v2, :cond_a

    .line 193
    .line 194
    move-object v2, v5

    .line 195
    check-cast v2, La/jla;

    .line 196
    .line 197
    iget-object v2, v2, La/jla;->a:La/wma;

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_a
    instance-of v2, v5, La/kla;

    .line 201
    .line 202
    if-eqz v2, :cond_18

    .line 203
    .line 204
    move-object v2, v5

    .line 205
    check-cast v2, La/kla;

    .line 206
    .line 207
    iget-object v2, v2, La/kla;->a:La/xma;

    .line 208
    .line 209
    :goto_6
    sget-object v7, La/bmd;->n:La/zfn;

    .line 210
    .line 211
    invoke-virtual {v1, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    sget-object v8, La/k6z;->b:La/k6z;

    .line 216
    .line 217
    if-ne v7, v8, :cond_b

    .line 218
    .line 219
    iget-boolean v7, v0, La/zom;->c:Z

    .line 220
    .line 221
    if-eqz v7, :cond_b

    .line 222
    .line 223
    move v3, v4

    .line 224
    :cond_b
    instance-of v4, v2, La/tma;

    .line 225
    .line 226
    sget-object v7, La/t3i;->a:La/t3i;

    .line 227
    .line 228
    if-eqz v4, :cond_d

    .line 229
    .line 230
    new-instance v8, La/i4i;

    .line 231
    .line 232
    check-cast v2, La/tma;

    .line 233
    .line 234
    iget-object v10, v2, La/tma;->a:La/c4i;

    .line 235
    .line 236
    iget-object v11, v2, La/tma;->b:La/b4i;

    .line 237
    .line 238
    iget-object v14, v2, La/tma;->c:La/u3i;

    .line 239
    .line 240
    if-eqz v3, :cond_c

    .line 241
    .line 242
    :goto_7
    move-object v15, v7

    .line 243
    goto :goto_8

    .line 244
    :cond_c
    iget-object v7, v2, La/tma;->d:La/u3i;

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :goto_8
    const/16 v16, 0x18

    .line 248
    .line 249
    const/4 v9, 0x0

    .line 250
    const/4 v12, 0x0

    .line 251
    const/4 v13, 0x0

    .line 252
    invoke-direct/range {v8 .. v16}, La/i4i;-><init>(ZLa/c4i;La/b4i;La/u3i;La/u3i;La/u3i;La/u3i;I)V

    .line 253
    .line 254
    .line 255
    :goto_9
    move-object v2, v8

    .line 256
    goto/16 :goto_12

    .line 257
    .line 258
    :cond_d
    instance-of v4, v2, La/uma;

    .line 259
    .line 260
    if-eqz v4, :cond_f

    .line 261
    .line 262
    new-instance v8, La/k4i;

    .line 263
    .line 264
    check-cast v2, La/uma;

    .line 265
    .line 266
    iget-object v9, v2, La/uma;->a:La/c4i;

    .line 267
    .line 268
    iget-object v10, v2, La/uma;->b:La/b4i;

    .line 269
    .line 270
    iget-object v13, v2, La/uma;->c:La/u3i;

    .line 271
    .line 272
    if-eqz v3, :cond_e

    .line 273
    .line 274
    :goto_a
    move-object v14, v7

    .line 275
    goto :goto_b

    .line 276
    :cond_e
    iget-object v7, v2, La/uma;->d:La/u3i;

    .line 277
    .line 278
    goto :goto_a

    .line 279
    :goto_b
    const/16 v15, 0x18

    .line 280
    .line 281
    const/4 v11, 0x0

    .line 282
    const/4 v12, 0x0

    .line 283
    invoke-direct/range {v8 .. v15}, La/k4i;-><init>(La/c4i;La/b4i;La/u3i;La/u3i;La/u3i;La/u3i;I)V

    .line 284
    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_f
    instance-of v4, v2, La/vma;

    .line 288
    .line 289
    if-eqz v4, :cond_11

    .line 290
    .line 291
    new-instance v8, La/l4i;

    .line 292
    .line 293
    check-cast v2, La/vma;

    .line 294
    .line 295
    iget-object v10, v2, La/vma;->a:La/c4i;

    .line 296
    .line 297
    iget-object v11, v2, La/vma;->b:La/b4i;

    .line 298
    .line 299
    iget-object v14, v2, La/vma;->c:La/u3i;

    .line 300
    .line 301
    if-eqz v3, :cond_10

    .line 302
    .line 303
    :goto_c
    move-object v15, v7

    .line 304
    goto :goto_d

    .line 305
    :cond_10
    iget-object v7, v2, La/vma;->d:La/u3i;

    .line 306
    .line 307
    goto :goto_c

    .line 308
    :goto_d
    const/16 v16, 0x18

    .line 309
    .line 310
    const-string v9, ""

    .line 311
    .line 312
    const/4 v12, 0x0

    .line 313
    const/4 v13, 0x0

    .line 314
    invoke-direct/range {v8 .. v16}, La/l4i;-><init>(Ljava/lang/String;La/c4i;La/b4i;La/u3i;La/u3i;La/u3i;La/u3i;I)V

    .line 315
    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_11
    instance-of v4, v2, La/wma;

    .line 319
    .line 320
    if-eqz v4, :cond_13

    .line 321
    .line 322
    new-instance v8, La/k4i;

    .line 323
    .line 324
    check-cast v2, La/wma;

    .line 325
    .line 326
    iget-object v9, v2, La/wma;->a:La/c4i;

    .line 327
    .line 328
    iget-object v10, v2, La/wma;->b:La/b4i;

    .line 329
    .line 330
    iget-object v13, v2, La/wma;->c:La/u3i;

    .line 331
    .line 332
    if-eqz v3, :cond_12

    .line 333
    .line 334
    :goto_e
    move-object v14, v7

    .line 335
    goto :goto_f

    .line 336
    :cond_12
    iget-object v7, v2, La/wma;->d:La/u3i;

    .line 337
    .line 338
    goto :goto_e

    .line 339
    :goto_f
    const/16 v15, 0x18

    .line 340
    .line 341
    const/4 v11, 0x0

    .line 342
    const/4 v12, 0x0

    .line 343
    invoke-direct/range {v8 .. v15}, La/k4i;-><init>(La/c4i;La/b4i;La/u3i;La/u3i;La/u3i;La/u3i;I)V

    .line 344
    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_13
    instance-of v4, v2, La/xma;

    .line 348
    .line 349
    if-eqz v4, :cond_17

    .line 350
    .line 351
    new-instance v8, La/j4i;

    .line 352
    .line 353
    check-cast v2, La/xma;

    .line 354
    .line 355
    iget-object v9, v2, La/xma;->a:La/c4i;

    .line 356
    .line 357
    iget-object v10, v2, La/xma;->b:La/b4i;

    .line 358
    .line 359
    iget-object v12, v2, La/xma;->c:La/u3i;

    .line 360
    .line 361
    if-eqz v3, :cond_14

    .line 362
    .line 363
    :goto_10
    move-object v13, v7

    .line 364
    goto :goto_11

    .line 365
    :cond_14
    iget-object v7, v2, La/xma;->d:La/u3i;

    .line 366
    .line 367
    goto :goto_10

    .line 368
    :goto_11
    const/16 v14, 0x18

    .line 369
    .line 370
    const/4 v11, 0x0

    .line 371
    invoke-direct/range {v8 .. v14}, La/j4i;-><init>(La/c4i;La/b4i;La/u3i;La/u3i;La/u3i;I)V

    .line 372
    .line 373
    .line 374
    goto :goto_9

    .line 375
    :goto_12
    iget-object v0, v0, La/zom;->d:Lkotlin/jvm/functions/Function1;

    .line 376
    .line 377
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    or-int/2addr v3, v4

    .line 386
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    if-nez v3, :cond_15

    .line 391
    .line 392
    sget-object v3, La/ukd;->a:La/cl5;

    .line 393
    .line 394
    if-ne v4, v3, :cond_16

    .line 395
    .line 396
    :cond_15
    new-instance v4, La/dpl;

    .line 397
    .line 398
    const/16 v3, 0x11

    .line 399
    .line 400
    invoke-direct {v4, v3, v5, v0}, La/dpl;-><init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_16
    move-object v3, v4

    .line 407
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 408
    .line 409
    const/4 v5, 0x0

    .line 410
    const/4 v6, 0x1

    .line 411
    move-object v4, v1

    .line 412
    const/4 v1, 0x0

    .line 413
    invoke-static/range {v1 .. v6}, La/aac;->i(La/mm40;La/m4i;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 414
    .line 415
    .line 416
    goto :goto_13

    .line 417
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 418
    .line 419
    .line 420
    goto :goto_14

    .line 421
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 422
    .line 423
    .line 424
    goto :goto_14

    .line 425
    :cond_19
    move-object v4, v1

    .line 426
    invoke-virtual {v4}, La/fet;->X()V

    .line 427
    .line 428
    .line 429
    :goto_13
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    :goto_14
    return-object v6

    .line 432
    nop

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
