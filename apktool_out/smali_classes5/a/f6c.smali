.class public final synthetic La/f6c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v7c;


# direct methods
.method public synthetic constructor <init>(La/v7c;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f6c;->a:B

    iput-object p1, p0, La/f6c;->b:La/v7c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f6c;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/f6c;->b:La/v7c;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/k0w0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/v7c;->r:La/mi70;

    .line 18
    .line 19
    iget-object v3, v0, La/v7c;->d:La/d6c;

    .line 20
    .line 21
    if-eqz v3, :cond_b

    .line 22
    .line 23
    instance-of v4, v3, La/o5c;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    check-cast v3, La/o5c;

    .line 28
    .line 29
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v5, v3, La/o5c;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v7, v3, La/o5c;->d:Ljava/util/List;

    .line 39
    .line 40
    iget-object v10, v3, La/o5c;->h:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v11, v3, La/o5c;->i:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v4, La/sbi0;

    .line 45
    .line 46
    const/4 v9, 0x1

    .line 47
    move-object v8, v7

    .line 48
    invoke-direct/range {v4 .. v11}, La/sbi0;-><init>(Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_0
    instance-of v4, v3, La/p5c;

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    check-cast v3, La/p5c;

    .line 59
    .line 60
    new-instance v4, La/ubi0;

    .line 61
    .line 62
    iget-object v0, v3, La/p5c;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v4, v0, v5}, La/ubi0;-><init>(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_1
    instance-of v4, v3, La/s5c;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    check-cast v3, La/s5c;

    .line 74
    .line 75
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v5, v3, La/s5c;->a:Ljava/lang/String;

    .line 83
    .line 84
    iget v7, v3, La/s5c;->c:I

    .line 85
    .line 86
    iget-object v8, v3, La/s5c;->e:Ljava/util/List;

    .line 87
    .line 88
    iget-boolean v11, v3, La/s5c;->k:Z

    .line 89
    .line 90
    iget-object v12, v3, La/s5c;->i:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v13, v3, La/s5c;->j:La/we50;

    .line 93
    .line 94
    new-instance v4, La/vbi0;

    .line 95
    .line 96
    const/4 v10, 0x1

    .line 97
    move-object v9, v8

    .line 98
    invoke-direct/range {v4 .. v13}, La/vbi0;-><init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ZZLjava/lang/String;La/we50;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :cond_2
    instance-of v4, v3, La/t5c;

    .line 104
    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    check-cast v3, La/t5c;

    .line 108
    .line 109
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v5, v3, La/t5c;->a:Ljava/lang/String;

    .line 117
    .line 118
    iget v7, v3, La/t5c;->c:I

    .line 119
    .line 120
    iget-object v8, v3, La/t5c;->e:Ljava/util/List;

    .line 121
    .line 122
    iget-object v11, v3, La/t5c;->j:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v12, v3, La/t5c;->h:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 125
    .line 126
    new-instance v4, La/wbi0;

    .line 127
    .line 128
    const/4 v10, 0x1

    .line 129
    move-object v9, v8

    .line 130
    invoke-direct/range {v4 .. v12}, La/wbi0;-><init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_3
    instance-of v4, v3, La/z5c;

    .line 136
    .line 137
    if-eqz v4, :cond_4

    .line 138
    .line 139
    check-cast v3, La/z5c;

    .line 140
    .line 141
    new-instance v4, La/xbi0;

    .line 142
    .line 143
    iget-object v0, v3, La/z5c;->a:Ljava/lang/String;

    .line 144
    .line 145
    iget-byte v3, v3, La/z5c;->c:B

    .line 146
    .line 147
    invoke-direct {v4, v0, v3, v5}, La/xbi0;-><init>(Ljava/lang/String;IZ)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_4
    instance-of v4, v3, La/a6c;

    .line 153
    .line 154
    if-eqz v4, :cond_5

    .line 155
    .line 156
    check-cast v3, La/a6c;

    .line 157
    .line 158
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object v5, v3, La/a6c;->a:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v7, v3, La/a6c;->d:Ljava/util/ArrayList;

    .line 168
    .line 169
    iget-object v10, v3, La/a6c;->g:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v11, v3, La/a6c;->h:Ljava/lang/String;

    .line 172
    .line 173
    iget v12, v3, La/a6c;->i:I

    .line 174
    .line 175
    iget-wide v13, v3, La/a6c;->j:J

    .line 176
    .line 177
    iget-object v15, v3, La/a6c;->k:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v0, v3, La/a6c;->l:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v4, v3, La/a6c;->m:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v8, v3, La/a6c;->n:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v9, v3, La/a6c;->o:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v3, v3, La/a6c;->p:Ljava/lang/String;

    .line 188
    .line 189
    move-object/from16 v17, v4

    .line 190
    .line 191
    new-instance v4, La/zbi0;

    .line 192
    .line 193
    move-object/from16 v19, v9

    .line 194
    .line 195
    const/4 v9, 0x1

    .line 196
    move-object/from16 v18, v8

    .line 197
    .line 198
    move-object v8, v7

    .line 199
    move-object/from16 v16, v0

    .line 200
    .line 201
    move-object/from16 v20, v3

    .line 202
    .line 203
    invoke-direct/range {v4 .. v20}, La/zbi0;-><init>(Ljava/lang/String;La/swp0;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_5
    instance-of v4, v3, La/b6c;

    .line 209
    .line 210
    if-eqz v4, :cond_6

    .line 211
    .line 212
    check-cast v3, La/b6c;

    .line 213
    .line 214
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object v5, v3, La/b6c;->a:Ljava/lang/String;

    .line 222
    .line 223
    iget-object v13, v3, La/b6c;->h:La/we50;

    .line 224
    .line 225
    iget-object v10, v3, La/b6c;->i:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v11, v3, La/b6c;->j:Ljava/lang/String;

    .line 228
    .line 229
    iget-boolean v12, v3, La/b6c;->k:Z

    .line 230
    .line 231
    iget-object v7, v3, La/b6c;->d:Ljava/util/List;

    .line 232
    .line 233
    new-instance v4, La/aci0;

    .line 234
    .line 235
    const/4 v9, 0x1

    .line 236
    move-object v8, v7

    .line 237
    invoke-direct/range {v4 .. v13}, La/aci0;-><init>(Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLa/we50;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_6
    instance-of v4, v3, La/c6c;

    .line 243
    .line 244
    if-eqz v4, :cond_7

    .line 245
    .line 246
    check-cast v3, La/c6c;

    .line 247
    .line 248
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v5, v3, La/c6c;->a:Ljava/lang/String;

    .line 256
    .line 257
    iget v7, v3, La/c6c;->c:I

    .line 258
    .line 259
    iget-object v8, v3, La/c6c;->e:Ljava/util/List;

    .line 260
    .line 261
    iget-object v11, v3, La/c6c;->i:Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 262
    .line 263
    new-instance v4, La/bci0;

    .line 264
    .line 265
    const/4 v10, 0x1

    .line 266
    move-object v9, v8

    .line 267
    invoke-direct/range {v4 .. v11}, La/bci0;-><init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ZLorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;)V

    .line 268
    .line 269
    .line 270
    goto :goto_0

    .line 271
    :cond_7
    instance-of v4, v3, La/q5c;

    .line 272
    .line 273
    if-eqz v4, :cond_8

    .line 274
    .line 275
    check-cast v3, La/q5c;

    .line 276
    .line 277
    new-instance v4, La/ubi0;

    .line 278
    .line 279
    iget-object v0, v3, La/q5c;->a:Ljava/lang/String;

    .line 280
    .line 281
    invoke-direct {v4, v0, v5}, La/ubi0;-><init>(Ljava/lang/String;Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_0

    .line 285
    :cond_8
    instance-of v4, v3, La/u5c;

    .line 286
    .line 287
    if-eqz v4, :cond_9

    .line 288
    .line 289
    check-cast v3, La/u5c;

    .line 290
    .line 291
    iget-object v5, v3, La/u5c;->a:Ljava/lang/String;

    .line 292
    .line 293
    iget-object v6, v3, La/u5c;->b:La/swp0;

    .line 294
    .line 295
    iget v7, v3, La/u5c;->c:I

    .line 296
    .line 297
    iget-object v8, v3, La/u5c;->e:Ljava/util/List;

    .line 298
    .line 299
    iget-object v12, v3, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 300
    .line 301
    new-instance v4, La/wbi0;

    .line 302
    .line 303
    const/4 v10, 0x1

    .line 304
    move-object v9, v8

    .line 305
    move-object v11, v5

    .line 306
    invoke-direct/range {v4 .. v12}, La/wbi0;-><init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;)V

    .line 307
    .line 308
    .line 309
    goto :goto_0

    .line 310
    :cond_9
    instance-of v4, v3, La/x5c;

    .line 311
    .line 312
    if-eqz v4, :cond_a

    .line 313
    .line 314
    check-cast v3, La/x5c;

    .line 315
    .line 316
    invoke-virtual {v0}, La/v7c;->E()La/swp0;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v5, v3, La/x5c;->a:Ljava/lang/String;

    .line 324
    .line 325
    iget-object v7, v3, La/x5c;->d:Ljava/util/List;

    .line 326
    .line 327
    iget-object v10, v3, La/x5c;->g:Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 328
    .line 329
    new-instance v4, La/cci0;

    .line 330
    .line 331
    const/4 v9, 0x1

    .line 332
    move-object v8, v7

    .line 333
    invoke-direct/range {v4 .. v10}, La/cci0;-><init>(Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;ZLorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;)V

    .line 334
    .line 335
    .line 336
    goto :goto_0

    .line 337
    :cond_a
    instance-of v0, v3, La/w5c;

    .line 338
    .line 339
    if-eqz v0, :cond_b

    .line 340
    .line 341
    check-cast v3, La/w5c;

    .line 342
    .line 343
    new-instance v4, La/ybi0;

    .line 344
    .line 345
    iget-object v0, v3, La/w5c;->a:Ljava/lang/String;

    .line 346
    .line 347
    invoke-direct {v4, v0, v5}, La/ybi0;-><init>(Ljava/lang/String;Z)V

    .line 348
    .line 349
    .line 350
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    new-instance v0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 354
    .line 355
    invoke-direct {v0, v4}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    goto :goto_1

    .line 364
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 365
    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    :goto_1
    return-object v0

    .line 369
    :pswitch_0
    move-object/from16 v1, p1

    .line 370
    .line 371
    check-cast v1, La/k0w0;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    iget-object v2, v0, La/v7c;->o:La/zn00;

    .line 377
    .line 378
    iget-object v0, v0, La/v7c;->d:La/d6c;

    .line 379
    .line 380
    if-nez v0, :cond_c

    .line 381
    .line 382
    goto :goto_2

    .line 383
    :cond_c
    instance-of v3, v0, La/s5c;

    .line 384
    .line 385
    if-eqz v3, :cond_d

    .line 386
    .line 387
    check-cast v0, La/s5c;

    .line 388
    .line 389
    iget-object v0, v0, La/s5c;->j:La/we50;

    .line 390
    .line 391
    goto :goto_3

    .line 392
    :cond_d
    instance-of v3, v0, La/b6c;

    .line 393
    .line 394
    if-eqz v3, :cond_e

    .line 395
    .line 396
    check-cast v0, La/b6c;

    .line 397
    .line 398
    iget-object v0, v0, La/b6c;->h:La/we50;

    .line 399
    .line 400
    goto :goto_3

    .line 401
    :cond_e
    :goto_2
    sget-object v0, La/we50;->d:La/we50;

    .line 402
    .line 403
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    new-instance v3, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;

    .line 410
    .line 411
    invoke-direct {v3, v2, v0}, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;-><init>(La/zn00;La/we50;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 415
    .line 416
    .line 417
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    return-object v0

    .line 420
    :pswitch_1
    move-object/from16 v1, p1

    .line 421
    .line 422
    check-cast v1, La/k0w0;

    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    iget-object v2, v0, La/v7c;->o:La/zn00;

    .line 428
    .line 429
    iget-object v0, v0, La/v7c;->d:La/d6c;

    .line 430
    .line 431
    if-nez v0, :cond_f

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :cond_f
    instance-of v3, v0, La/s5c;

    .line 435
    .line 436
    if-eqz v3, :cond_10

    .line 437
    .line 438
    check-cast v0, La/s5c;

    .line 439
    .line 440
    iget-object v0, v0, La/s5c;->j:La/we50;

    .line 441
    .line 442
    goto :goto_5

    .line 443
    :cond_10
    instance-of v3, v0, La/b6c;

    .line 444
    .line 445
    if-eqz v3, :cond_11

    .line 446
    .line 447
    check-cast v0, La/b6c;

    .line 448
    .line 449
    iget-object v0, v0, La/b6c;->h:La/we50;

    .line 450
    .line 451
    goto :goto_5

    .line 452
    :cond_11
    :goto_4
    sget-object v0, La/we50;->d:La/we50;

    .line 453
    .line 454
    :goto_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    new-instance v3, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;

    .line 461
    .line 462
    invoke-direct {v3, v2, v0}, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;-><init>(La/zn00;La/we50;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v3}, La/k0w0;->c(La/m7h0;)V

    .line 466
    .line 467
    .line 468
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 469
    .line 470
    return-object v0

    .line 471
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
