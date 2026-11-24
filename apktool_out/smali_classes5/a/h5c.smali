.class public final synthetic La/h5c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l5c;


# direct methods
.method public synthetic constructor <init>(La/l5c;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h5c;->a:B

    iput-object p1, p0, La/h5c;->b:La/l5c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h5c;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/h5c;->b:La/l5c;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 13
    .line 14
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, v0, La/v7c;->d:La/d6c;

    .line 19
    .line 20
    if-eqz v1, :cond_f

    .line 21
    .line 22
    instance-of v4, v1, La/o5c;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    sget-object v1, La/it2;->f:La/it2;

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_0
    instance-of v4, v1, La/p5c;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    sget-object v1, La/it2;->f:La/it2;

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_1
    instance-of v4, v1, La/q5c;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    sget-object v1, La/it2;->f:La/it2;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    instance-of v4, v1, La/s5c;

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    sget-object v1, La/it2;->d:La/it2;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    instance-of v4, v1, La/t5c;

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    sget-object v1, La/it2;->e:La/it2;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    instance-of v4, v1, La/u5c;

    .line 60
    .line 61
    if-eqz v4, :cond_5

    .line 62
    .line 63
    sget-object v1, La/it2;->c:La/it2;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    instance-of v4, v1, La/w5c;

    .line 67
    .line 68
    if-eqz v4, :cond_6

    .line 69
    .line 70
    sget-object v1, La/it2;->c:La/it2;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_6
    instance-of v4, v1, La/x5c;

    .line 74
    .line 75
    if-eqz v4, :cond_7

    .line 76
    .line 77
    sget-object v1, La/it2;->b:La/it2;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    instance-of v4, v1, La/z5c;

    .line 81
    .line 82
    if-eqz v4, :cond_8

    .line 83
    .line 84
    sget-object v1, La/it2;->c:La/it2;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    instance-of v4, v1, La/a6c;

    .line 88
    .line 89
    if-eqz v4, :cond_9

    .line 90
    .line 91
    sget-object v1, La/it2;->g:La/it2;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    instance-of v4, v1, La/b6c;

    .line 95
    .line 96
    if-eqz v4, :cond_a

    .line 97
    .line 98
    sget-object v1, La/it2;->d:La/it2;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    instance-of v4, v1, La/c6c;

    .line 102
    .line 103
    if-eqz v4, :cond_f

    .line 104
    .line 105
    check-cast v1, La/c6c;

    .line 106
    .line 107
    iget v1, v1, La/c6c;->c:I

    .line 108
    .line 109
    const/16 v3, 0xc

    .line 110
    .line 111
    if-gt v3, v1, :cond_b

    .line 112
    .line 113
    const/16 v3, 0x11

    .line 114
    .line 115
    if-ge v1, v3, :cond_b

    .line 116
    .line 117
    sget-object v1, La/it2;->f:La/it2;

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_b
    const/16 v3, 0xb

    .line 121
    .line 122
    if-ne v1, v3, :cond_c

    .line 123
    .line 124
    sget-object v1, La/it2;->e:La/it2;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_c
    sget-object v1, La/it2;->b:La/it2;

    .line 128
    .line 129
    :goto_0
    iget-object v3, v0, La/v7c;->M:La/s31;

    .line 130
    .line 131
    invoke-virtual {v3, v1}, La/s31;->b(La/it2;)V

    .line 132
    .line 133
    .line 134
    iget-object v3, v0, La/v7c;->N:La/e41;

    .line 135
    .line 136
    const-string v4, "\u0441hat"

    .line 137
    .line 138
    iget-object v1, v1, La/it2;->a:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v3, v4, v1}, La/e41;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v1, v0, La/v7c;->c:La/i1w0;

    .line 144
    .line 145
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v0, v0, La/v7c;->p:La/usd;

    .line 150
    .line 151
    invoke-virtual {v0}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    instance-of v4, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 156
    .line 157
    if-eqz v4, :cond_d

    .line 158
    .line 159
    new-instance v4, La/e1w0;

    .line 160
    .line 161
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 162
    .line 163
    invoke-direct {v4, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, La/c8d;

    .line 167
    .line 168
    sget-object v5, La/y7d;->a:La/v7d;

    .line 169
    .line 170
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_d
    new-instance v4, La/w0w0;

    .line 178
    .line 179
    invoke-direct {v4, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 180
    .line 181
    .line 182
    new-instance v0, La/c8d;

    .line 183
    .line 184
    sget-object v5, La/y7d;->a:La/v7d;

    .line 185
    .line 186
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    :goto_1
    invoke-static {v1, v3, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_2
    move-object v2, v0

    .line 197
    check-cast v2, La/paw;

    .line 198
    .line 199
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_e

    .line 204
    .line 205
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, La/oe50;

    .line 210
    .line 211
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_e
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 219
    .line 220
    .line 221
    :goto_3
    return-object v3

    .line 222
    :pswitch_0
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 223
    .line 224
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iget-object v1, v0, La/v7c;->c:La/i1w0;

    .line 229
    .line 230
    iget-object v3, v0, La/v7c;->d:La/d6c;

    .line 231
    .line 232
    if-nez v3, :cond_10

    .line 233
    .line 234
    goto/16 :goto_9

    .line 235
    .line 236
    :cond_10
    instance-of v4, v3, La/v5c;

    .line 237
    .line 238
    if-eqz v4, :cond_11

    .line 239
    .line 240
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v3, La/v5c;

    .line 245
    .line 246
    invoke-interface {v3}, La/v5c;->i0()Lorg/xplatform/security/api/navigation/SecurityNavigationScreen;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    new-instance v4, La/q0w0;

    .line 251
    .line 252
    invoke-direct {v4, v3}, La/q0w0;-><init>(La/m7h0;)V

    .line 253
    .line 254
    .line 255
    new-instance v3, La/c8d;

    .line 256
    .line 257
    sget-object v5, La/y7d;->a:La/v7d;

    .line 258
    .line 259
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v3, v1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    :goto_4
    move-object v2, v0

    .line 267
    check-cast v2, La/paw;

    .line 268
    .line 269
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_16

    .line 274
    .line 275
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, La/oe50;

    .line 280
    .line 281
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_11
    instance-of v4, v3, La/z5c;

    .line 286
    .line 287
    if-eqz v4, :cond_12

    .line 288
    .line 289
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v3, La/z5c;

    .line 294
    .line 295
    iget-object v3, v3, La/z5c;->i:Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 296
    .line 297
    new-instance v4, La/d1w0;

    .line 298
    .line 299
    invoke-direct {v4, v3}, La/d1w0;-><init>(La/m7h0;)V

    .line 300
    .line 301
    .line 302
    new-instance v3, La/c8d;

    .line 303
    .line 304
    sget-object v5, La/y7d;->a:La/v7d;

    .line 305
    .line 306
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v3, v1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    :goto_5
    move-object v2, v0

    .line 314
    check-cast v2, La/paw;

    .line 315
    .line 316
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_16

    .line 321
    .line 322
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    check-cast v2, La/oe50;

    .line 327
    .line 328
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_12
    instance-of v4, v3, La/c6c;

    .line 333
    .line 334
    if-eqz v4, :cond_13

    .line 335
    .line 336
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v3, La/c6c;

    .line 341
    .line 342
    iget-object v3, v3, La/c6c;->i:Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 343
    .line 344
    new-instance v4, La/q0w0;

    .line 345
    .line 346
    invoke-direct {v4, v3}, La/q0w0;-><init>(La/m7h0;)V

    .line 347
    .line 348
    .line 349
    new-instance v3, La/c8d;

    .line 350
    .line 351
    sget-object v5, La/y7d;->a:La/v7d;

    .line 352
    .line 353
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v0, v3, v1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    :goto_6
    move-object v2, v0

    .line 361
    check-cast v2, La/paw;

    .line 362
    .line 363
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-eqz v3, :cond_16

    .line 368
    .line 369
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, La/oe50;

    .line 374
    .line 375
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_13
    instance-of v4, v3, La/x5c;

    .line 380
    .line 381
    if-eqz v4, :cond_14

    .line 382
    .line 383
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v3, La/x5c;

    .line 388
    .line 389
    iget-object v3, v3, La/x5c;->g:Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 390
    .line 391
    new-instance v4, La/q0w0;

    .line 392
    .line 393
    invoke-direct {v4, v3}, La/q0w0;-><init>(La/m7h0;)V

    .line 394
    .line 395
    .line 396
    new-instance v3, La/c8d;

    .line 397
    .line 398
    sget-object v5, La/y7d;->a:La/v7d;

    .line 399
    .line 400
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 401
    .line 402
    .line 403
    invoke-static {v0, v3, v1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    :goto_7
    move-object v2, v0

    .line 408
    check-cast v2, La/paw;

    .line 409
    .line 410
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    if-eqz v3, :cond_16

    .line 415
    .line 416
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    check-cast v2, La/oe50;

    .line 421
    .line 422
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_14
    instance-of v4, v3, La/w5c;

    .line 427
    .line 428
    if-eqz v4, :cond_15

    .line 429
    .line 430
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    check-cast v3, La/w5c;

    .line 435
    .line 436
    iget-object v3, v3, La/w5c;->g:Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 437
    .line 438
    new-instance v4, La/d1w0;

    .line 439
    .line 440
    invoke-direct {v4, v3}, La/d1w0;-><init>(La/m7h0;)V

    .line 441
    .line 442
    .line 443
    new-instance v3, La/c8d;

    .line 444
    .line 445
    sget-object v5, La/y7d;->a:La/v7d;

    .line 446
    .line 447
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v0, v3, v1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :goto_8
    move-object v2, v0

    .line 455
    check-cast v2, La/paw;

    .line 456
    .line 457
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_16

    .line 462
    .line 463
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, La/oe50;

    .line 468
    .line 469
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 470
    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_15
    :goto_9
    invoke-virtual {v0}, La/v7c;->w()V

    .line 474
    .line 475
    .line 476
    :cond_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_1
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 480
    .line 481
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sget-object v1, La/wm4;->b:La/wm4;

    .line 486
    .line 487
    sget-object v2, La/o64;->b:La/o64;

    .line 488
    .line 489
    invoke-virtual {v0, v1, v2}, La/v7c;->G(La/wm4;La/o64;)V

    .line 490
    .line 491
    .line 492
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    return-object v0

    .line 495
    :pswitch_2
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 496
    .line 497
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, La/v7c;->w()V

    .line 502
    .line 503
    .line 504
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_3
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 508
    .line 509
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    invoke-virtual {v4}, La/l5c;->H0()La/bzq;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    iget-object v0, v0, La/bzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 518
    .line 519
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    sget-object v1, La/vm4;->b:La/vm4;

    .line 528
    .line 529
    sget-object v2, La/q64;->b:La/q64;

    .line 530
    .line 531
    invoke-virtual {v7, v1, v2}, La/v7c;->H(La/vm4;La/q64;)V

    .line 532
    .line 533
    .line 534
    iget-object v1, v7, La/v7c;->Q:La/p7m0;

    .line 535
    .line 536
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    check-cast v1, La/i7c;

    .line 541
    .line 542
    iget-boolean v1, v1, La/i7c;->m:Z

    .line 543
    .line 544
    if-nez v1, :cond_17

    .line 545
    .line 546
    iget-object v0, v7, La/v7c;->P:La/ol60;

    .line 547
    .line 548
    sget-object v1, La/v6c;->a:La/v6c;

    .line 549
    .line 550
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    goto :goto_a

    .line 554
    :cond_17
    iget-object v1, v7, La/v7c;->h:La/nr;

    .line 555
    .line 556
    iget-object v1, v1, La/nr;->b:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v1, La/kt2;

    .line 559
    .line 560
    const-string v2, "reg_approve_code_done"

    .line 561
    .line 562
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    iget-object v2, v7, La/v7c;->g:La/mne;

    .line 570
    .line 571
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 572
    .line 573
    new-instance v5, La/zhb;

    .line 574
    .line 575
    const/4 v11, 0x0

    .line 576
    const/16 v12, 0xf

    .line 577
    .line 578
    const/4 v6, 0x1

    .line 579
    const-class v8, La/v7c;

    .line 580
    .line 581
    const-string v9, "onValidationFailed"

    .line 582
    .line 583
    const-string v10, "onValidationFailed(Ljava/lang/Throwable;)V"

    .line 584
    .line 585
    invoke-direct/range {v5 .. v12}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 586
    .line 587
    .line 588
    new-instance v4, La/fr9;

    .line 589
    .line 590
    const/4 v6, 0x6

    .line 591
    invoke-direct {v4, v7, v0, v3, v6}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v7, v1, v2, v5, v4}, La/v7c;->F(La/bvc;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 595
    .line 596
    .line 597
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_4
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 601
    .line 602
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v0}, La/v7c;->a()V

    .line 607
    .line 608
    .line 609
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    return-object v0

    .line 612
    :pswitch_5
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 613
    .line 614
    iget-object v0, v4, La/l5c;->R1:La/a8z;

    .line 615
    .line 616
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    check-cast v0, La/lci;

    .line 621
    .line 622
    iget-object v0, v0, La/lci;->K:La/n5d0;

    .line 623
    .line 624
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, La/kci;

    .line 629
    .line 630
    return-object v0

    .line 631
    :pswitch_6
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 632
    .line 633
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    instance-of v1, v0, La/af3;

    .line 645
    .line 646
    if-eqz v1, :cond_18

    .line 647
    .line 648
    check-cast v0, La/af3;

    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_18
    move-object v0, v3

    .line 652
    :goto_b
    const-class v1, La/m5c;

    .line 653
    .line 654
    if-eqz v0, :cond_1b

    .line 655
    .line 656
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    check-cast v0, La/o5d0;

    .line 665
    .line 666
    if-eqz v0, :cond_19

    .line 667
    .line 668
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    check-cast v0, La/ze3;

    .line 673
    .line 674
    goto :goto_c

    .line 675
    :cond_19
    move-object v0, v3

    .line 676
    :goto_c
    instance-of v2, v0, La/m5c;

    .line 677
    .line 678
    if-nez v2, :cond_1a

    .line 679
    .line 680
    move-object v0, v3

    .line 681
    :cond_1a
    check-cast v0, La/m5c;

    .line 682
    .line 683
    if-eqz v0, :cond_1b

    .line 684
    .line 685
    invoke-static {v4}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 686
    .line 687
    .line 688
    move-result-object v16

    .line 689
    iget-object v1, v4, La/l5c;->V1:La/yzn0;

    .line 690
    .line 691
    sget-object v2, La/l5c;->X1:[La/iiy;

    .line 692
    .line 693
    const/4 v3, 0x1

    .line 694
    aget-object v2, v2, v3

    .line 695
    .line 696
    invoke-virtual {v1, v4, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    move-object/from16 v17, v1

    .line 701
    .line 702
    check-cast v17, La/d6c;

    .line 703
    .line 704
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    iget-object v10, v0, La/m5c;->G:La/pv00;

    .line 708
    .line 709
    iget-object v15, v0, La/m5c;->u:La/gst0;

    .line 710
    .line 711
    iget-object v1, v0, La/m5c;->a:La/ctf0;

    .line 712
    .line 713
    iget-object v13, v0, La/m5c;->c:La/pmi0;

    .line 714
    .line 715
    iget-object v2, v0, La/m5c;->b:La/duj;

    .line 716
    .line 717
    iget-object v3, v0, La/m5c;->d:La/mne;

    .line 718
    .line 719
    iget-object v4, v0, La/m5c;->e:La/cyh;

    .line 720
    .line 721
    iget-object v5, v0, La/m5c;->f:La/nr;

    .line 722
    .line 723
    iget-object v6, v0, La/m5c;->g:La/s64;

    .line 724
    .line 725
    iget-object v7, v0, La/m5c;->h:La/yo4;

    .line 726
    .line 727
    iget-object v8, v0, La/m5c;->j:La/uuz;

    .line 728
    .line 729
    iget-object v9, v0, La/m5c;->i:La/qgd;

    .line 730
    .line 731
    iget-object v11, v0, La/m5c;->k:La/jh70;

    .line 732
    .line 733
    iget-object v12, v0, La/m5c;->l:La/eru;

    .line 734
    .line 735
    iget-object v14, v0, La/m5c;->q:La/ii;

    .line 736
    .line 737
    move-object/from16 v18, v1

    .line 738
    .line 739
    iget-object v1, v0, La/m5c;->m:La/rjo;

    .line 740
    .line 741
    move-object/from16 v29, v1

    .line 742
    .line 743
    iget-object v1, v0, La/m5c;->n:La/fsd;

    .line 744
    .line 745
    move-object/from16 v23, v6

    .line 746
    .line 747
    iget-object v6, v0, La/m5c;->o:La/lef0;

    .line 748
    .line 749
    move-object/from16 v19, v1

    .line 750
    .line 751
    iget-object v1, v0, La/m5c;->p:La/usd;

    .line 752
    .line 753
    move-object/from16 v30, v1

    .line 754
    .line 755
    iget-object v1, v0, La/m5c;->r:La/nvu;

    .line 756
    .line 757
    move-object/from16 v31, v1

    .line 758
    .line 759
    iget-object v1, v0, La/m5c;->s:La/pru;

    .line 760
    .line 761
    move-object/from16 v32, v1

    .line 762
    .line 763
    iget-object v1, v0, La/m5c;->t:La/m1e;

    .line 764
    .line 765
    move-object/from16 v33, v1

    .line 766
    .line 767
    iget-object v1, v0, La/m5c;->v:La/wdk0;

    .line 768
    .line 769
    move-object/from16 v34, v1

    .line 770
    .line 771
    iget-object v1, v0, La/m5c;->x:La/vby;

    .line 772
    .line 773
    move-object/from16 v20, v1

    .line 774
    .line 775
    iget-object v1, v0, La/m5c;->w:La/q7d0;

    .line 776
    .line 777
    move-object/from16 v24, v7

    .line 778
    .line 779
    iget-object v7, v0, La/m5c;->y:La/yox;

    .line 780
    .line 781
    move-object/from16 v21, v1

    .line 782
    .line 783
    iget-object v1, v0, La/m5c;->z:La/ouu;

    .line 784
    .line 785
    move-object/from16 v35, v1

    .line 786
    .line 787
    iget-object v1, v0, La/m5c;->A:La/rou;

    .line 788
    .line 789
    move-object/from16 v36, v1

    .line 790
    .line 791
    iget-object v1, v0, La/m5c;->B:La/z4w0;

    .line 792
    .line 793
    move-object/from16 v26, v8

    .line 794
    .line 795
    iget-object v8, v0, La/m5c;->C:La/nr00;

    .line 796
    .line 797
    move-object/from16 v27, v11

    .line 798
    .line 799
    iget-object v11, v0, La/m5c;->D:La/dmt;

    .line 800
    .line 801
    move-object/from16 v28, v12

    .line 802
    .line 803
    iget-object v12, v0, La/m5c;->E:La/lme0;

    .line 804
    .line 805
    move-object/from16 v25, v9

    .line 806
    .line 807
    iget-object v9, v0, La/m5c;->F:La/lp4;

    .line 808
    .line 809
    move-object/from16 v37, v1

    .line 810
    .line 811
    iget-object v1, v0, La/m5c;->H:La/d190;

    .line 812
    .line 813
    move-object/from16 v22, v1

    .line 814
    .line 815
    iget-object v1, v0, La/m5c;->I:La/mi70;

    .line 816
    .line 817
    move-object/from16 v38, v1

    .line 818
    .line 819
    iget-object v1, v0, La/m5c;->J:La/zn00;

    .line 820
    .line 821
    move-object/from16 v39, v1

    .line 822
    .line 823
    iget-object v1, v0, La/m5c;->K:La/qud;

    .line 824
    .line 825
    move-object/from16 v40, v1

    .line 826
    .line 827
    iget-object v1, v0, La/m5c;->L:La/e41;

    .line 828
    .line 829
    iget-object v0, v0, La/m5c;->M:La/s31;

    .line 830
    .line 831
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    move-object/from16 v22, v5

    .line 862
    .line 863
    new-instance v5, La/lci;

    .line 864
    .line 865
    move-object/from16 v42, v0

    .line 866
    .line 867
    move-object/from16 v41, v1

    .line 868
    .line 869
    move-object/from16 v19, v2

    .line 870
    .line 871
    move-object/from16 v20, v3

    .line 872
    .line 873
    move-object/from16 v21, v4

    .line 874
    .line 875
    invoke-direct/range {v5 .. v42}, La/lci;-><init>(La/lef0;La/yox;La/nr00;La/lp4;La/pv00;La/dmt;La/lme0;La/pmi0;La/ii;La/gst0;La/i1w0;La/d6c;La/ctf0;La/duj;La/mne;La/cyh;La/nr;La/s64;La/yo4;La/qgd;La/uuz;La/jh70;La/eru;La/rjo;La/usd;La/nvu;La/pru;La/m1e;La/wdk0;La/ouu;La/rou;La/z4w0;La/mi70;La/zn00;La/qud;La/e41;La/s31;)V

    .line 876
    .line 877
    .line 878
    move-object v3, v5

    .line 879
    goto :goto_d

    .line 880
    :cond_1b
    const-string v0, "Cannot create dependency "

    .line 881
    .line 882
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    :goto_d
    return-object v3

    .line 890
    :pswitch_7
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 891
    .line 892
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v0}, La/v7c;->x()V

    .line 897
    .line 898
    .line 899
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_8
    iget-object v0, v4, La/l5c;->S1:La/ywq;

    .line 903
    .line 904
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 905
    .line 906
    invoke-virtual {v0, v1}, La/ywq;->a(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    return-object v1

    .line 910
    :pswitch_9
    sget-object v1, La/l5c;->W1:La/kl5;

    .line 911
    .line 912
    iget-object v6, v0, La/h5c;->b:La/l5c;

    .line 913
    .line 914
    iget-object v4, v6, La/l5c;->O1:La/wdk0;

    .line 915
    .line 916
    if-eqz v4, :cond_1c

    .line 917
    .line 918
    new-instance v5, La/xdk0;

    .line 919
    .line 920
    sget-object v8, La/rek0;->b:La/rek0;

    .line 921
    .line 922
    const v0, 0x7f130dca

    .line 923
    .line 924
    .line 925
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v9

    .line 929
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    const/4 v13, 0x0

    .line 933
    const/16 v14, 0x7c

    .line 934
    .line 935
    const/4 v10, 0x0

    .line 936
    const/4 v11, 0x0

    .line 937
    const/4 v12, 0x0

    .line 938
    move-object v7, v5

    .line 939
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 940
    .line 941
    .line 942
    const/16 v11, 0x3fc

    .line 943
    .line 944
    const/4 v7, 0x0

    .line 945
    const/4 v8, 0x0

    .line 946
    const/4 v9, 0x0

    .line 947
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 948
    .line 949
    .line 950
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    return-object v0

    .line 953
    :cond_1c
    const-string v0, "snackbarManager"

    .line 954
    .line 955
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    throw v3

    .line 959
    :pswitch_a
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 960
    .line 961
    invoke-virtual {v4}, La/l5c;->I0()La/v7c;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-virtual {v0}, La/v7c;->a()V

    .line 966
    .line 967
    .line 968
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 969
    .line 970
    return-object v0

    .line 971
    :pswitch_data_0
    .packed-switch 0x0
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
