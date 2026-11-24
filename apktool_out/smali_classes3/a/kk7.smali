.class public final synthetic La/kk7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kk7;->a:B

    iput-object p1, p0, La/kk7;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kk7;->a:B

    .line 4
    .line 5
    const-string v2, ":"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/high16 v6, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iget-object v0, v0, La/kk7;->b:La/l7m0;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/kg30;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v5, v0, La/kg30;->a:Ljava/lang/String;

    .line 26
    .line 27
    :cond_0
    if-nez v5, :cond_1

    .line 28
    .line 29
    const-string v5, ""

    .line 30
    .line 31
    :cond_1
    return-object v5

    .line 32
    :pswitch_0
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move v3, v4

    .line 39
    :cond_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :pswitch_1
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    sget-object v7, La/j1t0;->a:La/qrq;

    .line 57
    .line 58
    sget-wide v4, La/qmk;->q:J

    .line 59
    .line 60
    sget-wide v13, La/qmk;->D:J

    .line 61
    .line 62
    new-instance v1, La/y9q0;

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const v15, 0xfdffdd

    .line 66
    .line 67
    .line 68
    const-wide/16 v2, 0x0

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    const-wide/16 v8, 0x0

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 80
    .line 81
    sget-wide v5, La/qmk;->q:J

    .line 82
    .line 83
    sget-wide v14, La/qmk;->D:J

    .line 84
    .line 85
    new-instance v2, La/y9q0;

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v16, 0xfdff9d

    .line 89
    .line 90
    .line 91
    const-wide/16 v3, 0x0

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    const-wide/16 v9, 0x0

    .line 95
    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 99
    .line 100
    .line 101
    move-object v1, v2

    .line 102
    :goto_0
    return-object v1

    .line 103
    :pswitch_2
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    cmpg-float v0, v0, v6

    .line 114
    .line 115
    if-nez v0, :cond_4

    .line 116
    .line 117
    move v3, v4

    .line 118
    :cond_4
    xor-int/lit8 v0, v3, 0x1

    .line 119
    .line 120
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :pswitch_3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    cmpl-float v0, v0, v6

    .line 136
    .line 137
    if-ltz v0, :cond_5

    .line 138
    .line 139
    move v3, v4

    .line 140
    :cond_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :pswitch_4
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/tly;

    .line 150
    .line 151
    iget-boolean v0, v0, La/tly;->a:Z

    .line 152
    .line 153
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_5
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, La/kg30;

    .line 163
    .line 164
    if-eqz v0, :cond_6

    .line 165
    .line 166
    iget-object v5, v0, La/kg30;->d:Ljava/lang/String;

    .line 167
    .line 168
    :cond_6
    return-object v5

    .line 169
    :pswitch_6
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, La/kg30;

    .line 174
    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    iget-object v0, v0, La/kg30;->c:Ljava/lang/String;

    .line 178
    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :cond_7
    return-object v5

    .line 186
    :pswitch_7
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, La/kg30;

    .line 191
    .line 192
    if-eqz v0, :cond_8

    .line 193
    .line 194
    iget-object v0, v0, La/kg30;->b:Ljava/lang/String;

    .line 195
    .line 196
    if-eqz v0, :cond_8

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    :cond_8
    return-object v5

    .line 203
    :pswitch_8
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/kg30;

    .line 208
    .line 209
    if-eqz v0, :cond_9

    .line 210
    .line 211
    iget-object v0, v0, La/kg30;->a:Ljava/lang/String;

    .line 212
    .line 213
    if-eqz v0, :cond_9

    .line 214
    .line 215
    const-string v1, " "

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    :cond_9
    return-object v5

    .line 222
    :pswitch_9
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_a

    .line 227
    .line 228
    move v3, v4

    .line 229
    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    return-object v0

    .line 234
    :pswitch_a
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    return-object v0

    .line 249
    :pswitch_b
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/Number;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    sub-float/2addr v6, v0

    .line 260
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    :pswitch_c
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, Ljava/lang/Number;

    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0

    .line 280
    :pswitch_d
    sget v1, La/l18;->q:F

    .line 281
    .line 282
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Ljava/lang/Number;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    sub-float/2addr v6, v0

    .line 293
    mul-float/2addr v6, v1

    .line 294
    new-instance v0, La/ycl;

    .line 295
    .line 296
    invoke-direct {v0, v6}, La/ycl;-><init>(F)V

    .line 297
    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_e
    sget v1, La/l18;->p:F

    .line 301
    .line 302
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Ljava/lang/Number;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    sub-float/2addr v6, v0

    .line 313
    mul-float/2addr v6, v1

    .line 314
    new-instance v0, La/ycl;

    .line 315
    .line 316
    invoke-direct {v0, v6}, La/ycl;-><init>(F)V

    .line 317
    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_f
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Ljava/lang/Number;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    sub-float/2addr v6, v0

    .line 331
    const v0, 0x416a8f5c    # 14.66f

    .line 332
    .line 333
    .line 334
    mul-float/2addr v6, v0

    .line 335
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    :pswitch_10
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Ljava/lang/Number;

    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    sub-float/2addr v6, v0

    .line 351
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    return-object v0

    .line 356
    :pswitch_11
    sget-object v1, La/au7;->U1:La/yk5;

    .line 357
    .line 358
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, La/qu7;

    .line 363
    .line 364
    iget-object v0, v0, La/qu7;->d:La/le40;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_12
    sget-object v1, La/au7;->U1:La/yk5;

    .line 368
    .line 369
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    check-cast v0, La/qu7;

    .line 374
    .line 375
    iget-object v0, v0, La/qu7;->a:La/imm;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_13
    sget-object v1, La/au7;->U1:La/yk5;

    .line 379
    .line 380
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    check-cast v0, La/qu7;

    .line 385
    .line 386
    iget-object v0, v0, La/qu7;->c:La/qwh0;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_14
    sget-object v1, La/au7;->U1:La/yk5;

    .line 390
    .line 391
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, La/qu7;

    .line 396
    .line 397
    iget v0, v0, La/qu7;->b:I

    .line 398
    .line 399
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    return-object v0

    .line 404
    :pswitch_15
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    check-cast v0, La/yvg0;

    .line 409
    .line 410
    iget-object v0, v0, La/yvg0;->k:La/l7m0;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_16
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, La/yvg0;

    .line 418
    .line 419
    iget-object v0, v0, La/yvg0;->h:La/l7m0;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_17
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, La/yvg0;

    .line 427
    .line 428
    iget-object v0, v0, La/yvg0;->l:La/l7m0;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_18
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, La/yvg0;

    .line 436
    .line 437
    iget-object v0, v0, La/yvg0;->j:La/l7m0;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_19
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, La/yvg0;

    .line 445
    .line 446
    iget-object v0, v0, La/yvg0;->g:La/l7m0;

    .line 447
    .line 448
    return-object v0

    .line 449
    :pswitch_1a
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    check-cast v0, La/yvg0;

    .line 454
    .line 455
    iget-object v0, v0, La/yvg0;->i:La/l7m0;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_1b
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, La/yvg0;

    .line 463
    .line 464
    iget-object v0, v0, La/yvg0;->f:La/l7m0;

    .line 465
    .line 466
    return-object v0

    .line 467
    :pswitch_1c
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    check-cast v0, La/yvg0;

    .line 472
    .line 473
    iget-object v0, v0, La/yvg0;->m:La/l7m0;

    .line 474
    .line 475
    return-object v0

    .line 476
    nop

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
