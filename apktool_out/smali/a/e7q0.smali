.class public final La/e7q0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/k7q0;


# direct methods
.method public synthetic constructor <init>(La/k7q0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e7q0;->i:B

    iput-object p1, p0, La/e7q0;->k:La/k7q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e7q0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/e7q0;->k:La/k7q0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/e7q0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/e7q0;-><init>(La/k7q0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/e7q0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/e7q0;-><init>(La/k7q0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, La/ne60;

    .line 22
    .line 23
    iget-wide p0, p1, La/ne60;->a:J

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e7q0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/e7q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e7q0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e7q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ne60;

    .line 24
    .line 25
    iget-wide v0, p1, La/ne60;->a:J

    .line 26
    .line 27
    check-cast p2, La/yje;

    .line 28
    .line 29
    new-instance p1, La/e7q0;

    .line 30
    .line 31
    iget-object p0, p0, La/e7q0;->k:La/k7q0;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-direct {p1, p0, p2, v0}, La/e7q0;-><init>(La/k7q0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, La/e7q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e7q0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, v0, La/e7q0;->k:La/k7q0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-byte v7, v0, La/e7q0;->j:B

    .line 17
    .line 18
    if-eqz v7, :cond_2

    .line 19
    .line 20
    if-eq v7, v3, :cond_1

    .line 21
    .line 22
    if-ne v7, v4, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v2, p1

    .line 28
    .line 29
    move-object/from16 v48, v5

    .line 30
    .line 31
    goto/16 :goto_1a

    .line 32
    .line 33
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    goto/16 :goto_1d

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v7, p1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v5, La/k7q0;->h:La/iuc;

    .line 49
    .line 50
    if-eqz v2, :cond_32

    .line 51
    .line 52
    iput-byte v3, v0, La/e7q0;->j:B

    .line 53
    .line 54
    check-cast v2, La/zw2;

    .line 55
    .line 56
    iget-object v2, v2, La/zw2;->a:La/c5k;

    .line 57
    .line 58
    invoke-virtual {v2}, La/c5k;->f()Landroid/content/ClipboardManager;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    new-instance v7, La/huc;

    .line 69
    .line 70
    invoke-direct {v7, v2}, La/huc;-><init>(Landroid/content/ClipData;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v7, 0x0

    .line 75
    :goto_0
    if-ne v7, v1, :cond_4

    .line 76
    .line 77
    goto/16 :goto_19

    .line 78
    .line 79
    :cond_4
    :goto_1
    check-cast v7, La/huc;

    .line 80
    .line 81
    if-eqz v7, :cond_32

    .line 82
    .line 83
    iput-byte v4, v0, La/e7q0;->j:B

    .line 84
    .line 85
    iget-object v0, v7, La/huc;->a:Landroid/content/ClipData;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-virtual {v0, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_2e

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_2e

    .line 99
    .line 100
    instance-of v7, v0, Landroid/text/Spanned;

    .line 101
    .line 102
    if-nez v7, :cond_5

    .line 103
    .line 104
    new-instance v2, La/j83;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v2, v0}, La/j83;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v48, v5

    .line 114
    .line 115
    goto/16 :goto_18

    .line 116
    .line 117
    :cond_5
    move-object v7, v0

    .line 118
    check-cast v7, Landroid/text/Spanned;

    .line 119
    .line 120
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    const-class v9, Landroid/text/Annotation;

    .line 125
    .line 126
    invoke-interface {v7, v2, v8, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    check-cast v8, [Landroid/text/Annotation;

    .line 131
    .line 132
    new-instance v9, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    array-length v10, v8

    .line 141
    sub-int/2addr v10, v3

    .line 142
    if-ltz v10, :cond_2b

    .line 143
    .line 144
    move v11, v2

    .line 145
    :goto_2
    aget-object v12, v8, v11

    .line 146
    .line 147
    invoke-virtual {v12}, Landroid/text/Annotation;->getKey()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    const-string v14, "androidx.compose.text.SpanStyle"

    .line 152
    .line 153
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-nez v13, :cond_6

    .line 158
    .line 159
    move/from16 v47, v2

    .line 160
    .line 161
    move-object/from16 v48, v5

    .line 162
    .line 163
    goto/16 :goto_16

    .line 164
    .line 165
    :cond_6
    invoke-interface {v7, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    invoke-interface {v7, v12}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    invoke-virtual {v12}, Landroid/text/Annotation;->getValue()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    invoke-static {v12, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    array-length v6, v12

    .line 186
    invoke-virtual {v15, v12, v2, v6}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v15, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 190
    .line 191
    .line 192
    sget-wide v16, La/y3d;->g:J

    .line 193
    .line 194
    sget-wide v18, La/daq0;->c:J

    .line 195
    .line 196
    move-wide/from16 v21, v16

    .line 197
    .line 198
    move-wide/from16 v35, v21

    .line 199
    .line 200
    move-wide/from16 v23, v18

    .line 201
    .line 202
    move-wide/from16 v30, v23

    .line 203
    .line 204
    const/16 v25, 0x0

    .line 205
    .line 206
    const/16 v26, 0x0

    .line 207
    .line 208
    const/16 v27, 0x0

    .line 209
    .line 210
    const/16 v29, 0x0

    .line 211
    .line 212
    const/16 v32, 0x0

    .line 213
    .line 214
    const/16 v33, 0x0

    .line 215
    .line 216
    const/16 v37, 0x0

    .line 217
    .line 218
    const/16 v38, 0x0

    .line 219
    .line 220
    :goto_3
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-le v6, v3, :cond_8

    .line 225
    .line 226
    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    const-wide/16 v16, 0x1

    .line 231
    .line 232
    const-wide/16 v18, -0x40

    .line 233
    .line 234
    const-wide/16 v39, 0x10

    .line 235
    .line 236
    const-wide/16 v41, 0x3f

    .line 237
    .line 238
    const/16 v12, 0x8

    .line 239
    .line 240
    if-ne v6, v3, :cond_9

    .line 241
    .line 242
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-lt v6, v12, :cond_8

    .line 247
    .line 248
    sget v6, La/y3d;->h:I

    .line 249
    .line 250
    invoke-virtual {v15}, Landroid/os/Parcel;->readLong()J

    .line 251
    .line 252
    .line 253
    move-result-wide v20

    .line 254
    and-long v41, v20, v41

    .line 255
    .line 256
    cmp-long v6, v41, v39

    .line 257
    .line 258
    if-gez v6, :cond_7

    .line 259
    .line 260
    move-wide/from16 v21, v20

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_7
    and-long v18, v20, v18

    .line 264
    .line 265
    add-long v41, v41, v16

    .line 266
    .line 267
    or-long v16, v18, v41

    .line 268
    .line 269
    move-wide/from16 v21, v16

    .line 270
    .line 271
    :goto_4
    sget-object v6, La/h2t0;->b:La/g2t0;

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_8
    move/from16 v47, v2

    .line 275
    .line 276
    move-object/from16 v48, v5

    .line 277
    .line 278
    move/from16 p0, v13

    .line 279
    .line 280
    goto/16 :goto_15

    .line 281
    .line 282
    :cond_9
    const-wide v43, 0x200000000L

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    const-wide v45, 0x100000000L

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    move/from16 p0, v13

    .line 293
    .line 294
    const-wide/16 v12, 0x0

    .line 295
    .line 296
    move/from16 v47, v2

    .line 297
    .line 298
    const/4 v2, 0x5

    .line 299
    if-ne v6, v4, :cond_f

    .line 300
    .line 301
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-lt v6, v2, :cond_e

    .line 306
    .line 307
    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-ne v2, v3, :cond_a

    .line 312
    .line 313
    move-object/from16 v48, v5

    .line 314
    .line 315
    move-wide/from16 v4, v45

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_a
    if-ne v2, v4, :cond_b

    .line 319
    .line 320
    move-object/from16 v48, v5

    .line 321
    .line 322
    move-wide/from16 v4, v43

    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_b
    move-object/from16 v48, v5

    .line 326
    .line 327
    move-wide v4, v12

    .line 328
    :goto_5
    invoke-static {v4, v5, v12, v13}, La/eaq0;->a(JJ)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_c

    .line 333
    .line 334
    sget-wide v4, La/daq0;->c:J

    .line 335
    .line 336
    :goto_6
    move-wide/from16 v23, v4

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_c
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    invoke-static {v2, v4, v5}, La/idm0;->v(FJ)J

    .line 344
    .line 345
    .line 346
    move-result-wide v4

    .line 347
    goto :goto_6

    .line 348
    :cond_d
    :goto_7
    move/from16 v13, p0

    .line 349
    .line 350
    :goto_8
    move/from16 v2, v47

    .line 351
    .line 352
    move-object/from16 v5, v48

    .line 353
    .line 354
    :goto_9
    const/4 v4, 0x2

    .line 355
    goto/16 :goto_3

    .line 356
    .line 357
    :cond_e
    move-object/from16 v48, v5

    .line 358
    .line 359
    goto/16 :goto_15

    .line 360
    .line 361
    :cond_f
    move-object/from16 v48, v5

    .line 362
    .line 363
    const/4 v4, 0x3

    .line 364
    const/4 v5, 0x4

    .line 365
    if-ne v6, v4, :cond_10

    .line 366
    .line 367
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-lt v2, v5, :cond_2a

    .line 372
    .line 373
    new-instance v2, La/psq;

    .line 374
    .line 375
    invoke-virtual {v15}, Landroid/os/Parcel;->readInt()I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    invoke-direct {v2, v4}, La/psq;-><init>(I)V

    .line 380
    .line 381
    .line 382
    move/from16 v13, p0

    .line 383
    .line 384
    move-object/from16 v25, v2

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_10
    if-ne v6, v5, :cond_13

    .line 388
    .line 389
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-lt v2, v3, :cond_2a

    .line 394
    .line 395
    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-nez v2, :cond_12

    .line 400
    .line 401
    :cond_11
    move/from16 v2, v47

    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_12
    if-ne v2, v3, :cond_11

    .line 405
    .line 406
    move v2, v3

    .line 407
    :goto_a
    new-instance v4, La/lsq;

    .line 408
    .line 409
    invoke-direct {v4, v2}, La/lsq;-><init>(I)V

    .line 410
    .line 411
    .line 412
    move/from16 v13, p0

    .line 413
    .line 414
    move-object/from16 v26, v4

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_13
    if-ne v6, v2, :cond_18

    .line 418
    .line 419
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-lt v2, v3, :cond_2a

    .line 424
    .line 425
    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-nez v2, :cond_15

    .line 430
    .line 431
    :cond_14
    move/from16 v2, v47

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_15
    if-ne v2, v3, :cond_16

    .line 435
    .line 436
    const v2, 0xffff

    .line 437
    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_16
    if-ne v2, v4, :cond_17

    .line 441
    .line 442
    const/4 v2, 0x2

    .line 443
    goto :goto_b

    .line 444
    :cond_17
    const/4 v4, 0x2

    .line 445
    if-ne v2, v4, :cond_14

    .line 446
    .line 447
    move v2, v3

    .line 448
    :goto_b
    new-instance v4, La/msq;

    .line 449
    .line 450
    invoke-direct {v4, v2}, La/msq;-><init>(I)V

    .line 451
    .line 452
    .line 453
    move/from16 v13, p0

    .line 454
    .line 455
    move-object/from16 v27, v4

    .line 456
    .line 457
    goto :goto_8

    .line 458
    :cond_18
    const/4 v4, 0x6

    .line 459
    if-ne v6, v4, :cond_19

    .line 460
    .line 461
    invoke-virtual {v15}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v29

    .line 465
    goto :goto_7

    .line 466
    :cond_19
    const/4 v4, 0x7

    .line 467
    if-ne v6, v4, :cond_1d

    .line 468
    .line 469
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    if-lt v4, v2, :cond_2a

    .line 474
    .line 475
    invoke-virtual {v15}, Landroid/os/Parcel;->readByte()B

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-ne v2, v3, :cond_1a

    .line 480
    .line 481
    move-wide/from16 v4, v45

    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_1a
    const/4 v4, 0x2

    .line 485
    if-ne v2, v4, :cond_1b

    .line 486
    .line 487
    move-wide/from16 v4, v43

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_1b
    move-wide v4, v12

    .line 491
    :goto_c
    invoke-static {v4, v5, v12, v13}, La/eaq0;->a(JJ)Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_1c

    .line 496
    .line 497
    sget-wide v4, La/daq0;->c:J

    .line 498
    .line 499
    :goto_d
    move-wide/from16 v30, v4

    .line 500
    .line 501
    goto/16 :goto_7

    .line 502
    .line 503
    :cond_1c
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    invoke-static {v2, v4, v5}, La/idm0;->v(FJ)J

    .line 508
    .line 509
    .line 510
    move-result-wide v4

    .line 511
    goto :goto_d

    .line 512
    :cond_1d
    const/16 v2, 0x8

    .line 513
    .line 514
    if-ne v6, v2, :cond_1e

    .line 515
    .line 516
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-lt v2, v5, :cond_2a

    .line 521
    .line 522
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    new-instance v4, La/j56;

    .line 527
    .line 528
    invoke-direct {v4, v2}, La/j56;-><init>(F)V

    .line 529
    .line 530
    .line 531
    move/from16 v13, p0

    .line 532
    .line 533
    move-object/from16 v32, v4

    .line 534
    .line 535
    goto/16 :goto_8

    .line 536
    .line 537
    :cond_1e
    const/16 v4, 0x9

    .line 538
    .line 539
    if-ne v6, v4, :cond_1f

    .line 540
    .line 541
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    if-lt v4, v2, :cond_2a

    .line 546
    .line 547
    new-instance v2, La/f8q0;

    .line 548
    .line 549
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    invoke-direct {v2, v4, v5}, La/f8q0;-><init>(FF)V

    .line 558
    .line 559
    .line 560
    move/from16 v13, p0

    .line 561
    .line 562
    move-object/from16 v33, v2

    .line 563
    .line 564
    goto/16 :goto_8

    .line 565
    .line 566
    :cond_1f
    const/16 v4, 0xa

    .line 567
    .line 568
    if-ne v6, v4, :cond_21

    .line 569
    .line 570
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    if-lt v4, v2, :cond_2a

    .line 575
    .line 576
    sget v2, La/y3d;->h:I

    .line 577
    .line 578
    invoke-virtual {v15}, Landroid/os/Parcel;->readLong()J

    .line 579
    .line 580
    .line 581
    move-result-wide v4

    .line 582
    and-long v12, v4, v41

    .line 583
    .line 584
    cmp-long v2, v12, v39

    .line 585
    .line 586
    if-gez v2, :cond_20

    .line 587
    .line 588
    :goto_e
    move-wide/from16 v35, v4

    .line 589
    .line 590
    goto :goto_f

    .line 591
    :cond_20
    and-long v4, v4, v18

    .line 592
    .line 593
    add-long v12, v12, v16

    .line 594
    .line 595
    or-long/2addr v4, v12

    .line 596
    goto :goto_e

    .line 597
    :goto_f
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 598
    .line 599
    goto/16 :goto_7

    .line 600
    .line 601
    :cond_21
    const/16 v2, 0xb

    .line 602
    .line 603
    if-ne v6, v2, :cond_28

    .line 604
    .line 605
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-lt v2, v5, :cond_2a

    .line 610
    .line 611
    invoke-virtual {v15}, Landroid/os/Parcel;->readInt()I

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    and-int/lit8 v4, v2, 0x2

    .line 616
    .line 617
    if-eqz v4, :cond_22

    .line 618
    .line 619
    move v4, v3

    .line 620
    goto :goto_10

    .line 621
    :cond_22
    move/from16 v4, v47

    .line 622
    .line 623
    :goto_10
    and-int/lit8 v2, v2, 0x1

    .line 624
    .line 625
    if-eqz v2, :cond_23

    .line 626
    .line 627
    move v2, v3

    .line 628
    goto :goto_11

    .line 629
    :cond_23
    move/from16 v2, v47

    .line 630
    .line 631
    :goto_11
    sget-object v5, La/k5q0;->d:La/k5q0;

    .line 632
    .line 633
    sget-object v6, La/k5q0;->c:La/k5q0;

    .line 634
    .line 635
    if-eqz v4, :cond_25

    .line 636
    .line 637
    if-eqz v2, :cond_25

    .line 638
    .line 639
    filled-new-array {v5, v6}, [La/k5q0;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    move/from16 v6, v47

    .line 656
    .line 657
    :goto_12
    if-ge v6, v5, :cond_24

    .line 658
    .line 659
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v12

    .line 663
    check-cast v12, La/k5q0;

    .line 664
    .line 665
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    iget v12, v12, La/k5q0;->a:I

    .line 670
    .line 671
    or-int/2addr v4, v12

    .line 672
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    add-int/lit8 v6, v6, 0x1

    .line 677
    .line 678
    goto :goto_12

    .line 679
    :cond_24
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    new-instance v4, La/k5q0;

    .line 684
    .line 685
    invoke-direct {v4, v2}, La/k5q0;-><init>(I)V

    .line 686
    .line 687
    .line 688
    move-object/from16 v37, v4

    .line 689
    .line 690
    goto/16 :goto_7

    .line 691
    .line 692
    :cond_25
    if-eqz v4, :cond_26

    .line 693
    .line 694
    move-object/from16 v37, v5

    .line 695
    .line 696
    goto/16 :goto_7

    .line 697
    .line 698
    :cond_26
    if-eqz v2, :cond_27

    .line 699
    .line 700
    move-object/from16 v37, v6

    .line 701
    .line 702
    goto/16 :goto_7

    .line 703
    .line 704
    :cond_27
    sget-object v2, La/k5q0;->b:La/k5q0;

    .line 705
    .line 706
    move-object/from16 v37, v2

    .line 707
    .line 708
    goto/16 :goto_7

    .line 709
    .line 710
    :cond_28
    const/16 v2, 0xc

    .line 711
    .line 712
    if-ne v6, v2, :cond_d

    .line 713
    .line 714
    invoke-virtual {v15}, Landroid/os/Parcel;->dataAvail()I

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    const/16 v4, 0x14

    .line 719
    .line 720
    if-lt v2, v4, :cond_2a

    .line 721
    .line 722
    new-instance v49, La/ljj0;

    .line 723
    .line 724
    sget v2, La/y3d;->h:I

    .line 725
    .line 726
    invoke-virtual {v15}, Landroid/os/Parcel;->readLong()J

    .line 727
    .line 728
    .line 729
    move-result-wide v4

    .line 730
    and-long v12, v4, v41

    .line 731
    .line 732
    cmp-long v2, v12, v39

    .line 733
    .line 734
    if-gez v2, :cond_29

    .line 735
    .line 736
    :goto_13
    move-wide/from16 v51, v4

    .line 737
    .line 738
    goto :goto_14

    .line 739
    :cond_29
    and-long v4, v4, v18

    .line 740
    .line 741
    add-long v12, v12, v16

    .line 742
    .line 743
    or-long/2addr v4, v12

    .line 744
    goto :goto_13

    .line 745
    :goto_14
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 746
    .line 747
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 756
    .line 757
    .line 758
    move-result v2

    .line 759
    int-to-long v5, v2

    .line 760
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    int-to-long v12, v2

    .line 765
    const/16 v2, 0x20

    .line 766
    .line 767
    shl-long v4, v5, v2

    .line 768
    .line 769
    const-wide v16, 0xffffffffL

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    and-long v12, v12, v16

    .line 775
    .line 776
    or-long v53, v4, v12

    .line 777
    .line 778
    invoke-virtual {v15}, Landroid/os/Parcel;->readFloat()F

    .line 779
    .line 780
    .line 781
    move-result v50

    .line 782
    invoke-direct/range {v49 .. v54}, La/ljj0;-><init>(FJJ)V

    .line 783
    .line 784
    .line 785
    move/from16 v13, p0

    .line 786
    .line 787
    move/from16 v2, v47

    .line 788
    .line 789
    move-object/from16 v5, v48

    .line 790
    .line 791
    move-object/from16 v38, v49

    .line 792
    .line 793
    goto/16 :goto_9

    .line 794
    .line 795
    :cond_2a
    :goto_15
    new-instance v20, La/smk0;

    .line 796
    .line 797
    const/16 v39, 0x0

    .line 798
    .line 799
    const v40, 0xc000

    .line 800
    .line 801
    .line 802
    const/16 v28, 0x0

    .line 803
    .line 804
    const/16 v34, 0x0

    .line 805
    .line 806
    invoke-direct/range {v20 .. v40}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 807
    .line 808
    .line 809
    move-object/from16 v2, v20

    .line 810
    .line 811
    new-instance v4, La/i83;

    .line 812
    .line 813
    move/from16 v5, p0

    .line 814
    .line 815
    invoke-direct {v4, v5, v14, v2}, La/i83;-><init>(IILjava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    :goto_16
    if-eq v11, v10, :cond_2c

    .line 822
    .line 823
    add-int/lit8 v11, v11, 0x1

    .line 824
    .line 825
    move/from16 v2, v47

    .line 826
    .line 827
    move-object/from16 v5, v48

    .line 828
    .line 829
    const/4 v4, 0x2

    .line 830
    goto/16 :goto_2

    .line 831
    .line 832
    :cond_2b
    move-object/from16 v48, v5

    .line 833
    .line 834
    :cond_2c
    new-instance v2, La/j83;

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    sget-object v4, La/iun;->a:La/iun;

    .line 841
    .line 842
    sget-object v5, La/k83;->a:La/j83;

    .line 843
    .line 844
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 845
    .line 846
    .line 847
    move-result v5

    .line 848
    if-eqz v5, :cond_2d

    .line 849
    .line 850
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    const/4 v6, 0x0

    .line 854
    goto :goto_17

    .line 855
    :cond_2d
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    move-object v6, v9

    .line 859
    :goto_17
    invoke-direct {v2, v6, v0}, La/j83;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    goto :goto_18

    .line 863
    :cond_2e
    move-object/from16 v48, v5

    .line 864
    .line 865
    const/4 v2, 0x0

    .line 866
    :goto_18
    if-ne v2, v1, :cond_2f

    .line 867
    .line 868
    :goto_19
    move-object v6, v1

    .line 869
    goto/16 :goto_1d

    .line 870
    .line 871
    :cond_2f
    :goto_1a
    check-cast v2, La/j83;

    .line 872
    .line 873
    if-nez v2, :cond_30

    .line 874
    .line 875
    goto :goto_1c

    .line 876
    :cond_30
    invoke-virtual/range {v48 .. v48}, La/k7q0;->h()Z

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    if-nez v0, :cond_31

    .line 881
    .line 882
    goto :goto_1b

    .line 883
    :cond_31
    invoke-virtual/range {v48 .. v48}, La/k7q0;->l()La/a8q0;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual/range {v48 .. v48}, La/k7q0;->l()La/a8q0;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    iget-object v1, v1, La/a8q0;->a:La/j83;

    .line 892
    .line 893
    iget-object v1, v1, La/j83;->b:Ljava/lang/String;

    .line 894
    .line 895
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 896
    .line 897
    .line 898
    move-result v1

    .line 899
    invoke-static {v0, v1}, La/lvm0;->j(La/a8q0;I)La/j83;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    new-instance v1, La/h83;

    .line 904
    .line 905
    invoke-direct {v1, v0}, La/h83;-><init>(La/j83;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1, v2}, La/h83;->b(La/j83;)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v1}, La/h83;->h()La/j83;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-virtual/range {v48 .. v48}, La/k7q0;->l()La/a8q0;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    invoke-virtual/range {v48 .. v48}, La/k7q0;->l()La/a8q0;

    .line 920
    .line 921
    .line 922
    move-result-object v4

    .line 923
    iget-object v4, v4, La/a8q0;->a:La/j83;

    .line 924
    .line 925
    iget-object v4, v4, La/j83;->b:Ljava/lang/String;

    .line 926
    .line 927
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 928
    .line 929
    .line 930
    move-result v4

    .line 931
    invoke-static {v1, v4}, La/lvm0;->i(La/a8q0;I)La/j83;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    new-instance v4, La/h83;

    .line 936
    .line 937
    invoke-direct {v4, v0}, La/h83;-><init>(La/j83;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v4, v1}, La/h83;->b(La/j83;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v4}, La/h83;->h()La/j83;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    invoke-virtual/range {v48 .. v48}, La/k7q0;->l()La/a8q0;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    iget-wide v4, v1, La/a8q0;->b:J

    .line 952
    .line 953
    invoke-static {v4, v5}, La/o9q0;->f(J)I

    .line 954
    .line 955
    .line 956
    move-result v1

    .line 957
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 958
    .line 959
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 960
    .line 961
    .line 962
    move-result v2

    .line 963
    add-int/2addr v2, v1

    .line 964
    invoke-static {v2, v2}, La/s7n0;->e(II)J

    .line 965
    .line 966
    .line 967
    move-result-wide v1

    .line 968
    invoke-static {v0, v1, v2}, La/k7q0;->b(La/j83;J)La/a8q0;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    move-object/from16 v1, v48

    .line 973
    .line 974
    iget-object v2, v1, La/k7q0;->c:Lkotlin/jvm/functions/Function1;

    .line 975
    .line 976
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    sget-object v0, La/dmv;->a:La/dmv;

    .line 980
    .line 981
    invoke-virtual {v1, v0}, La/k7q0;->r(La/dmv;)V

    .line 982
    .line 983
    .line 984
    iget-object v0, v1, La/k7q0;->a:La/q7t0;

    .line 985
    .line 986
    iput-boolean v3, v0, La/q7t0;->e:Z

    .line 987
    .line 988
    :goto_1b
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 989
    .line 990
    goto :goto_1d

    .line 991
    :cond_32
    :goto_1c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    :goto_1d
    return-object v6

    .line 994
    :pswitch_0
    move-object v1, v5

    .line 995
    sget-object v4, La/wne;->a:La/wne;

    .line 996
    .line 997
    iget-byte v5, v0, La/e7q0;->j:B

    .line 998
    .line 999
    if-eqz v5, :cond_35

    .line 1000
    .line 1001
    if-eq v5, v3, :cond_34

    .line 1002
    .line 1003
    const/4 v3, 0x2

    .line 1004
    if-ne v5, v3, :cond_33

    .line 1005
    .line 1006
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_23

    .line 1010
    :cond_33
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    const/4 v6, 0x0

    .line 1014
    goto :goto_24

    .line 1015
    :cond_34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1016
    .line 1017
    .line 1018
    goto :goto_1e

    .line 1019
    :cond_35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    iput-byte v3, v0, La/e7q0;->j:B

    .line 1023
    .line 1024
    invoke-virtual {v1, v0}, La/k7q0;->t(La/zje;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    if-ne v2, v4, :cond_36

    .line 1029
    .line 1030
    goto :goto_22

    .line 1031
    :cond_36
    :goto_1e
    invoke-virtual {v1}, La/k7q0;->f()Lkotlin/Pair;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2

    .line 1035
    if-eqz v2, :cond_3a

    .line 1036
    .line 1037
    iget-object v3, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1038
    .line 1039
    move-object v10, v3

    .line 1040
    check-cast v10, Ljava/lang/String;

    .line 1041
    .line 1042
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1043
    .line 1044
    check-cast v2, La/o9q0;

    .line 1045
    .line 1046
    iget-wide v6, v2, La/o9q0;->a:J

    .line 1047
    .line 1048
    iget-object v1, v1, La/k7q0;->j:La/hw90;

    .line 1049
    .line 1050
    if-eqz v1, :cond_3a

    .line 1051
    .line 1052
    const/4 v3, 0x2

    .line 1053
    iput-byte v3, v0, La/e7q0;->j:B

    .line 1054
    .line 1055
    move-object v9, v1

    .line 1056
    check-cast v9, La/lw90;

    .line 1057
    .line 1058
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 1059
    .line 1060
    .line 1061
    move-result v1

    .line 1062
    if-nez v1, :cond_37

    .line 1063
    .line 1064
    goto :goto_1f

    .line 1065
    :cond_37
    invoke-static {v6, v7}, La/o9q0;->c(J)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v1

    .line 1069
    if-eqz v1, :cond_38

    .line 1070
    .line 1071
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    goto :goto_20

    .line 1074
    :cond_38
    new-instance v5, La/fl3;

    .line 1075
    .line 1076
    const/4 v8, 0x0

    .line 1077
    invoke-direct/range {v5 .. v10}, La/fl3;-><init>(JLa/yje;La/lw90;Ljava/lang/CharSequence;)V

    .line 1078
    .line 1079
    .line 1080
    iget-object v1, v9, La/lw90;->a:Lkotlin/coroutines/CoroutineContext;

    .line 1081
    .line 1082
    new-instance v2, La/o3s;

    .line 1083
    .line 1084
    const/16 v3, 0x1c

    .line 1085
    .line 1086
    const/4 v6, 0x0

    .line 1087
    invoke-direct {v2, v9, v5, v6, v3}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1088
    .line 1089
    .line 1090
    invoke-static {v1, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    :goto_20
    if-ne v0, v4, :cond_39

    .line 1095
    .line 1096
    goto :goto_21

    .line 1097
    :cond_39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1098
    .line 1099
    :goto_21
    if-ne v0, v4, :cond_3a

    .line 1100
    .line 1101
    :goto_22
    move-object v6, v4

    .line 1102
    goto :goto_24

    .line 1103
    :cond_3a
    :goto_23
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1104
    .line 1105
    :goto_24
    return-object v6

    .line 1106
    nop

    .line 1107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
