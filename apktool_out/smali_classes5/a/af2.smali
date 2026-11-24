.class public final synthetic La/af2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ef2;


# direct methods
.method public synthetic constructor <init>(La/ef2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/af2;->a:B

    iput-object p1, p0, La/af2;->b:La/ef2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/af2;->a:B

    .line 4
    .line 5
    const-string v2, "Cannot create dependency "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/af2;->b:La/ef2;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 14
    .line 15
    new-instance v1, La/q0h0;

    .line 16
    .line 17
    iget-object v0, v0, La/ef2;->O1:La/n0o0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/e8i;

    .line 24
    .line 25
    iget-object v0, v0, La/e8i;->k:La/n5d0;

    .line 26
    .line 27
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/d8i;

    .line 32
    .line 33
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 38
    .line 39
    new-instance v1, La/q0h0;

    .line 40
    .line 41
    iget-object v0, v0, La/ef2;->O1:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/e8i;

    .line 48
    .line 49
    iget-object v0, v0, La/e8i;->j:La/n5d0;

    .line 50
    .line 51
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/c8i;

    .line 56
    .line 57
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_1
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 62
    .line 63
    new-instance v1, La/q0h0;

    .line 64
    .line 65
    iget-object v0, v0, La/ef2;->N1:La/a8z;

    .line 66
    .line 67
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/ksi;

    .line 72
    .line 73
    iget-object v0, v0, La/ksi;->q:La/n5d0;

    .line 74
    .line 75
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/jsi;

    .line 80
    .line 81
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :pswitch_2
    new-instance v1, La/q0h0;

    .line 86
    .line 87
    iget-object v0, v0, La/ef2;->M1:La/a8z;

    .line 88
    .line 89
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, La/isi;

    .line 94
    .line 95
    iget-object v0, v0, La/isi;->h:La/n5d0;

    .line 96
    .line 97
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, La/gsi;

    .line 102
    .line 103
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :pswitch_3
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 108
    .line 109
    sget-object v1, La/qx40;->a:La/chf0;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const-class v4, La/hd2;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-class v5, La/zb2;

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-static {v4}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-static {v1, v4}, La/qx40;->b(Landroid/app/Application;Ljava/util/Set;)La/chf0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v1, v1, La/chf0;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, La/n5d0;

    .line 149
    .line 150
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    move-object v9, v1

    .line 155
    check-cast v9, La/sx40;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    instance-of v4, v1, La/af3;

    .line 169
    .line 170
    if-eqz v4, :cond_0

    .line 171
    .line 172
    check-cast v1, La/af3;

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_0
    move-object v1, v3

    .line 176
    :goto_0
    const-class v4, La/if2;

    .line 177
    .line 178
    if-eqz v1, :cond_3

    .line 179
    .line 180
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, La/o5d0;

    .line 189
    .line 190
    if-eqz v1, :cond_1

    .line 191
    .line 192
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, La/ze3;

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_1
    move-object v1, v3

    .line 200
    :goto_1
    instance-of v5, v1, La/if2;

    .line 201
    .line 202
    if-nez v5, :cond_2

    .line 203
    .line 204
    move-object v1, v3

    .line 205
    :cond_2
    check-cast v1, La/if2;

    .line 206
    .line 207
    if-eqz v1, :cond_3

    .line 208
    .line 209
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v6, v1, La/if2;->a:La/zx10;

    .line 220
    .line 221
    iget-object v8, v1, La/if2;->b:La/u5g0;

    .line 222
    .line 223
    iget-object v5, v1, La/if2;->g:La/esg0;

    .line 224
    .line 225
    iget-object v10, v1, La/if2;->e:La/mne;

    .line 226
    .line 227
    iget-object v11, v1, La/if2;->c:La/knf0;

    .line 228
    .line 229
    iget-object v12, v1, La/if2;->d:La/gii0;

    .line 230
    .line 231
    iget-object v13, v1, La/if2;->f:La/sjl0;

    .line 232
    .line 233
    iget-object v14, v1, La/if2;->h:La/pru;

    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v4, La/e8i;

    .line 248
    .line 249
    invoke-direct/range {v4 .. v14}, La/e8i;-><init>(La/esg0;La/zx10;La/i1w0;La/u5g0;La/sx40;La/mne;La/knf0;La/gii0;La/sjl0;La/pru;)V

    .line 250
    .line 251
    .line 252
    move-object v3, v4

    .line 253
    goto :goto_2

    .line 254
    :cond_3
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :goto_2
    return-object v3

    .line 262
    :pswitch_4
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    instance-of v4, v1, La/af3;

    .line 276
    .line 277
    if-eqz v4, :cond_4

    .line 278
    .line 279
    check-cast v1, La/af3;

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_4
    move-object v1, v3

    .line 283
    :goto_3
    const-class v4, La/c9g0;

    .line 284
    .line 285
    if-eqz v1, :cond_7

    .line 286
    .line 287
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, La/o5d0;

    .line 296
    .line 297
    if-eqz v1, :cond_5

    .line 298
    .line 299
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, La/ze3;

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_5
    move-object v1, v3

    .line 307
    :goto_4
    instance-of v5, v1, La/c9g0;

    .line 308
    .line 309
    if-nez v5, :cond_6

    .line 310
    .line 311
    move-object v1, v3

    .line 312
    :cond_6
    check-cast v1, La/c9g0;

    .line 313
    .line 314
    if-eqz v1, :cond_7

    .line 315
    .line 316
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v6, v1, La/c9g0;->a:La/epi0;

    .line 324
    .line 325
    iget-object v3, v1, La/c9g0;->c:La/bwl;

    .line 326
    .line 327
    iget-object v4, v1, La/c9g0;->d:La/iip;

    .line 328
    .line 329
    iget-object v0, v1, La/c9g0;->e:La/xri;

    .line 330
    .line 331
    iget-object v5, v1, La/c9g0;->b:La/ugf0;

    .line 332
    .line 333
    iget-object v10, v1, La/c9g0;->k:La/ctf0;

    .line 334
    .line 335
    iget-object v11, v1, La/c9g0;->i:La/m1e;

    .line 336
    .line 337
    iget-object v9, v1, La/c9g0;->g:La/gii0;

    .line 338
    .line 339
    iget-object v7, v1, La/c9g0;->h:La/cyu;

    .line 340
    .line 341
    iget-object v8, v1, La/c9g0;->f:La/knf0;

    .line 342
    .line 343
    iget-object v12, v1, La/c9g0;->j:La/s31;

    .line 344
    .line 345
    iget-object v13, v1, La/c9g0;->l:La/mne;

    .line 346
    .line 347
    iget-object v14, v1, La/c9g0;->m:La/cyu;

    .line 348
    .line 349
    iget-object v15, v1, La/c9g0;->n:La/reu;

    .line 350
    .line 351
    iget-object v2, v1, La/c9g0;->o:La/pru;

    .line 352
    .line 353
    iget-object v1, v1, La/c9g0;->p:La/bzt;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-object/from16 v16, v2

    .line 374
    .line 375
    new-instance v2, La/ksi;

    .line 376
    .line 377
    move-object/from16 v17, v1

    .line 378
    .line 379
    invoke-direct/range {v2 .. v17}, La/ksi;-><init>(La/bwl;La/iip;La/ugf0;La/epi0;La/cyu;La/knf0;La/gii0;La/ctf0;La/m1e;La/s31;La/mne;La/cyu;La/reu;La/pru;La/bzt;)V

    .line 380
    .line 381
    .line 382
    move-object v3, v2

    .line 383
    goto :goto_5

    .line 384
    :cond_7
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    :goto_5
    return-object v3

    .line 392
    :pswitch_5
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 393
    .line 394
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    instance-of v4, v1, La/af3;

    .line 406
    .line 407
    if-eqz v4, :cond_8

    .line 408
    .line 409
    check-cast v1, La/af3;

    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_8
    move-object v1, v3

    .line 413
    :goto_6
    const-class v4, La/a6g0;

    .line 414
    .line 415
    if-eqz v1, :cond_b

    .line 416
    .line 417
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, La/o5d0;

    .line 426
    .line 427
    if-eqz v1, :cond_9

    .line 428
    .line 429
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v1, La/ze3;

    .line 434
    .line 435
    goto :goto_7

    .line 436
    :cond_9
    move-object v1, v3

    .line 437
    :goto_7
    instance-of v5, v1, La/a6g0;

    .line 438
    .line 439
    if-nez v5, :cond_a

    .line 440
    .line 441
    move-object v1, v3

    .line 442
    :cond_a
    check-cast v1, La/a6g0;

    .line 443
    .line 444
    if-eqz v1, :cond_b

    .line 445
    .line 446
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    iget-object v7, v1, La/a6g0;->a:La/iw20;

    .line 454
    .line 455
    iget-object v6, v1, La/a6g0;->g:La/mne;

    .line 456
    .line 457
    iget-object v8, v1, La/a6g0;->f:La/ctf0;

    .line 458
    .line 459
    iget-object v9, v1, La/a6g0;->b:La/kt2;

    .line 460
    .line 461
    iget-object v0, v1, La/a6g0;->d:La/m1e;

    .line 462
    .line 463
    iget-object v12, v1, La/a6g0;->c:La/u5g0;

    .line 464
    .line 465
    iget-object v11, v1, La/a6g0;->e:La/cyu;

    .line 466
    .line 467
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    new-instance v5, La/isi;

    .line 480
    .line 481
    invoke-direct/range {v5 .. v12}, La/isi;-><init>(La/mne;La/iw20;La/ctf0;La/kt2;La/i1w0;La/cyu;La/u5g0;)V

    .line 482
    .line 483
    .line 484
    move-object v3, v5

    .line 485
    goto :goto_8

    .line 486
    :cond_b
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    :goto_8
    return-object v3

    .line 494
    :pswitch_6
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 495
    .line 496
    invoke-virtual {v0}, La/ef2;->K0()La/k3t0;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    sget-object v1, La/lc2;->a:La/lc2;

    .line 501
    .line 502
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 506
    .line 507
    return-object v0

    .line 508
    :pswitch_7
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 509
    .line 510
    invoke-virtual {v0}, La/ef2;->K0()La/k3t0;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    sget-object v1, La/kc2;->a:La/kc2;

    .line 515
    .line 516
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_8
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 523
    .line 524
    invoke-virtual {v0}, La/ef2;->J0()La/k3t0;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sget-object v1, La/kb2;->a:La/kb2;

    .line 529
    .line 530
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_9
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 537
    .line 538
    invoke-virtual {v0}, La/ef2;->J0()La/k3t0;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    sget-object v1, La/jb2;->a:La/jb2;

    .line 543
    .line 544
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_a
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 551
    .line 552
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    sget-object v1, La/oe2;->a:La/oe2;

    .line 557
    .line 558
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 562
    .line 563
    return-object v0

    .line 564
    :pswitch_b
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 565
    .line 566
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    sget-object v1, La/ne2;->a:La/ne2;

    .line 571
    .line 572
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object v0

    .line 578
    nop

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
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
