.class public final La/nyi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final synthetic a:B

.field public final b:B

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nyi;->a:B

    iput-object p1, p0, La/nyi;->c:Ljava/lang/Object;

    iput-byte p2, p0, La/nyi;->b:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/nyi;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-byte v5, p0, La/nyi;->b:B

    .line 8
    .line 9
    iget-object v6, p0, La/nyi;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v6, La/ozi;

    .line 15
    .line 16
    packed-switch v5, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    invoke-static {v5}, La/c99;->h(I)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :pswitch_0
    iget-object p0, v6, La/ozi;->a:La/cad;

    .line 25
    .line 26
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, La/psc;

    .line 29
    .line 30
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, La/t5t;

    .line 38
    .line 39
    invoke-direct {v4}, La/t5t;-><init>()V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :pswitch_1
    iget-object p0, v6, La/ozi;->a:La/cad;

    .line 45
    .line 46
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, La/psc;

    .line 49
    .line 50
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, La/v5t;

    .line 58
    .line 59
    invoke-direct {v4, p0}, La/v5t;-><init>(La/mne;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :pswitch_2
    new-instance v5, La/b6t;

    .line 65
    .line 66
    move-object p0, v6

    .line 67
    new-instance v6, La/uyn;

    .line 68
    .line 69
    iget-object v0, p0, La/ozi;->b:La/gii0;

    .line 70
    .line 71
    const/16 v1, 0x8

    .line 72
    .line 73
    invoke-direct {v6, v0, v1}, La/uyn;-><init>(La/gii0;B)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, La/ozi;->F:La/n5d0;

    .line 77
    .line 78
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v7, v0

    .line 83
    check-cast v7, La/v5t;

    .line 84
    .line 85
    iget-object v0, p0, La/ozi;->G:La/n5d0;

    .line 86
    .line 87
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v8, v0

    .line 92
    check-cast v8, La/t5t;

    .line 93
    .line 94
    iget-object v9, p0, La/ozi;->c:La/knf0;

    .line 95
    .line 96
    iget-object p0, p0, La/ozi;->a:La/cad;

    .line 97
    .line 98
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, La/psc;

    .line 101
    .line 102
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-direct/range {v5 .. v10}, La/b6t;-><init>(La/uyn;La/v5t;La/t5t;La/knf0;La/mne;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    move-object v4, v5

    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :pswitch_3
    move-object p0, v6

    .line 116
    iget-object p0, p0, La/ozi;->a:La/cad;

    .line 117
    .line 118
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, La/psc;

    .line 121
    .line 122
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v4, La/n6t;

    .line 130
    .line 131
    invoke-direct {v4, p0}, La/n6t;-><init>(La/mne;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_1

    .line 135
    .line 136
    :pswitch_4
    move-object p0, v6

    .line 137
    new-instance v4, La/p6t;

    .line 138
    .line 139
    new-instance v0, La/a1d;

    .line 140
    .line 141
    iget-object v1, p0, La/ozi;->b:La/gii0;

    .line 142
    .line 143
    const/16 v2, 0x1c

    .line 144
    .line 145
    invoke-direct {v0, v1, v2}, La/a1d;-><init>(La/gii0;B)V

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, La/ozi;->D:La/n5d0;

    .line 149
    .line 150
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, La/n6t;

    .line 155
    .line 156
    iget-object v2, p0, La/ozi;->c:La/knf0;

    .line 157
    .line 158
    iget-object p0, p0, La/ozi;->a:La/cad;

    .line 159
    .line 160
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, La/psc;

    .line 163
    .line 164
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-direct {v4, v0, v1, v2, p0}, La/p6t;-><init>(La/a1d;La/n6t;La/knf0;La/mne;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :pswitch_5
    move-object p0, v6

    .line 177
    iget-object p0, p0, La/ozi;->a:La/cad;

    .line 178
    .line 179
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, La/psc;

    .line 182
    .line 183
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    new-instance v4, La/s6t;

    .line 191
    .line 192
    invoke-direct {v4, p0}, La/s6t;-><init>(La/mne;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :pswitch_6
    move-object p0, v6

    .line 198
    new-instance v4, La/u6t;

    .line 199
    .line 200
    new-instance v0, La/ivn;

    .line 201
    .line 202
    iget-object v1, p0, La/ozi;->b:La/gii0;

    .line 203
    .line 204
    invoke-direct {v0, v1}, La/ivn;-><init>(La/gii0;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, p0, La/ozi;->B:La/n5d0;

    .line 208
    .line 209
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    check-cast v1, La/s6t;

    .line 214
    .line 215
    iget-object v2, p0, La/ozi;->c:La/knf0;

    .line 216
    .line 217
    iget-object p0, p0, La/ozi;->a:La/cad;

    .line 218
    .line 219
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, La/psc;

    .line 222
    .line 223
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-direct {v4, v0, v1, v2, p0}, La/u6t;-><init>(La/ivn;La/s6t;La/knf0;La/mne;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :pswitch_7
    new-instance v4, La/z9g0;

    .line 236
    .line 237
    invoke-direct {v4}, La/z9g0;-><init>()V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :pswitch_8
    move-object p0, v6

    .line 243
    new-instance v4, La/aag0;

    .line 244
    .line 245
    iget-object p0, p0, La/ozi;->z:La/n5d0;

    .line 246
    .line 247
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    check-cast p0, La/z9g0;

    .line 252
    .line 253
    invoke-direct {v4, p0}, La/aag0;-><init>(La/z9g0;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :pswitch_9
    new-instance v4, La/gcv0;

    .line 259
    .line 260
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :pswitch_a
    move-object p0, v6

    .line 266
    new-instance v4, La/awu;

    .line 267
    .line 268
    iget-object v0, p0, La/ozi;->w:La/n5d0;

    .line 269
    .line 270
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    check-cast v0, La/uvu;

    .line 275
    .line 276
    iget-object v1, p0, La/ozi;->h:La/clc;

    .line 277
    .line 278
    iget-object v1, v1, La/clc;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, La/xzp;

    .line 281
    .line 282
    invoke-virtual {v1}, La/xzp;->E()La/bzu;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    iget-object p0, p0, La/ozi;->i:La/sue;

    .line 287
    .line 288
    invoke-interface {p0}, La/sue;->f()La/h9c;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v4, v0, v1, p0}, La/awu;-><init>(La/uvu;La/bzu;La/h9c;)V

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :pswitch_b
    new-instance v4, La/rzf;

    .line 300
    .line 301
    invoke-direct {v4}, La/rzf;-><init>()V

    .line 302
    .line 303
    .line 304
    goto :goto_1

    .line 305
    :pswitch_c
    move-object p0, v6

    .line 306
    iget-object p0, p0, La/ozi;->a:La/cad;

    .line 307
    .line 308
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p0, La/psc;

    .line 311
    .line 312
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    new-instance v4, La/m2m0;

    .line 320
    .line 321
    invoke-direct {v4, p0}, La/m2m0;-><init>(La/mne;)V

    .line 322
    .line 323
    .line 324
    goto :goto_1

    .line 325
    :pswitch_d
    move-object p0, v6

    .line 326
    new-instance v5, La/r2m0;

    .line 327
    .line 328
    iget-object v0, p0, La/ozi;->a:La/cad;

    .line 329
    .line 330
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, La/psc;

    .line 333
    .line 334
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    new-instance v7, La/ljf0;

    .line 342
    .line 343
    iget-object v0, p0, La/ozi;->b:La/gii0;

    .line 344
    .line 345
    const/16 v1, 0x1b

    .line 346
    .line 347
    invoke-direct {v7, v0, v1}, La/ljf0;-><init>(La/gii0;B)V

    .line 348
    .line 349
    .line 350
    iget-object v0, p0, La/ozi;->t:La/n5d0;

    .line 351
    .line 352
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    move-object v8, v0

    .line 357
    check-cast v8, La/m2m0;

    .line 358
    .line 359
    iget-object v9, p0, La/ozi;->c:La/knf0;

    .line 360
    .line 361
    iget-object p0, p0, La/ozi;->u:La/n5d0;

    .line 362
    .line 363
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    move-object v10, p0

    .line 368
    check-cast v10, La/rzf;

    .line 369
    .line 370
    invoke-direct/range {v5 .. v10}, La/r2m0;-><init>(La/mne;La/ljf0;La/m2m0;La/knf0;La/rzf;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_0

    .line 374
    .line 375
    :pswitch_e
    move-object p0, v6

    .line 376
    new-instance v4, La/uvu;

    .line 377
    .line 378
    iget-object p0, p0, La/ozi;->v:La/n5d0;

    .line 379
    .line 380
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    check-cast p0, La/r2m0;

    .line 385
    .line 386
    invoke-direct {v4, p0}, La/uvu;-><init>(La/r2m0;)V

    .line 387
    .line 388
    .line 389
    :goto_1
    return-object v4

    .line 390
    :pswitch_f
    check-cast v6, La/nc0;

    .line 391
    .line 392
    if-eqz v5, :cond_3

    .line 393
    .line 394
    if-eq v5, v3, :cond_2

    .line 395
    .line 396
    if-eq v5, v2, :cond_1

    .line 397
    .line 398
    if-ne v5, v1, :cond_0

    .line 399
    .line 400
    iget-object p0, v6, La/nc0;->g:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast p0, La/gii0;

    .line 403
    .line 404
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    new-instance v4, La/x8v0;

    .line 408
    .line 409
    invoke-direct {v4, p0}, La/x8v0;-><init>(La/gii0;)V

    .line 410
    .line 411
    .line 412
    goto :goto_2

    .line 413
    :cond_0
    invoke-static {v5}, La/c99;->h(I)V

    .line 414
    .line 415
    .line 416
    goto :goto_2

    .line 417
    :cond_1
    iget-object p0, v6, La/nc0;->f:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast p0, La/btt0;

    .line 420
    .line 421
    iget-object v0, v6, La/nc0;->k:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, La/n5d0;

    .line 424
    .line 425
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, La/x8v0;

    .line 430
    .line 431
    iget-object v1, v6, La/nc0;->h:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v1, La/knf0;

    .line 434
    .line 435
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    new-instance v4, La/z8v0;

    .line 445
    .line 446
    invoke-direct {v4, p0, v0, v1}, La/z8v0;-><init>(La/btt0;La/x8v0;La/knf0;)V

    .line 447
    .line 448
    .line 449
    goto :goto_2

    .line 450
    :cond_2
    iget-object p0, v6, La/nc0;->l:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast p0, La/n5d0;

    .line 453
    .line 454
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    check-cast p0, La/z8v0;

    .line 459
    .line 460
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    new-instance v4, La/m4v;

    .line 464
    .line 465
    invoke-direct {v4, p0}, La/m4v;-><init>(La/z8v0;)V

    .line 466
    .line 467
    .line 468
    goto :goto_2

    .line 469
    :cond_3
    new-instance v5, La/j9v0;

    .line 470
    .line 471
    iget-object p0, v6, La/nc0;->d:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast p0, La/rou;

    .line 474
    .line 475
    iget-object v0, v6, La/nc0;->e:Ljava/lang/Object;

    .line 476
    .line 477
    move-object v7, v0

    .line 478
    check-cast v7, La/ytt;

    .line 479
    .line 480
    iget-object v0, v6, La/nc0;->m:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, La/n5d0;

    .line 483
    .line 484
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    move-object v8, v0

    .line 489
    check-cast v8, La/m4v;

    .line 490
    .line 491
    iget-object v0, v6, La/nc0;->i:Ljava/lang/Object;

    .line 492
    .line 493
    move-object v9, v0

    .line 494
    check-cast v9, La/gsb;

    .line 495
    .line 496
    iget-object v0, v6, La/nc0;->b:Ljava/lang/Object;

    .line 497
    .line 498
    move-object v10, v0

    .line 499
    check-cast v10, La/i1w0;

    .line 500
    .line 501
    iget-object v0, v6, La/nc0;->j:Ljava/lang/Object;

    .line 502
    .line 503
    move-object v11, v0

    .line 504
    check-cast v11, La/duj;

    .line 505
    .line 506
    iget-object v0, v6, La/nc0;->a:Ljava/lang/Object;

    .line 507
    .line 508
    move-object v12, v0

    .line 509
    check-cast v12, La/mne;

    .line 510
    .line 511
    iget-object v0, v6, La/nc0;->c:Ljava/lang/Object;

    .line 512
    .line 513
    move-object v13, v0

    .line 514
    check-cast v13, La/ctf0;

    .line 515
    .line 516
    move-object v6, p0

    .line 517
    invoke-direct/range {v5 .. v13}, La/j9v0;-><init>(La/rou;La/ytt;La/m4v;La/gsb;La/i1w0;La/duj;La/mne;La/ctf0;)V

    .line 518
    .line 519
    .line 520
    move-object v4, v5

    .line 521
    :goto_2
    return-object v4

    .line 522
    :pswitch_10
    check-cast v6, La/kki;

    .line 523
    .line 524
    iget-object v0, v6, La/kki;->e:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v0, La/g8i;

    .line 527
    .line 528
    if-eqz v5, :cond_7

    .line 529
    .line 530
    if-eq v5, v3, :cond_6

    .line 531
    .line 532
    if-eq v5, v2, :cond_5

    .line 533
    .line 534
    if-ne v5, v1, :cond_4

    .line 535
    .line 536
    invoke-virtual {v0}, La/g8i;->j9()La/gii0;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    new-instance v4, La/m6v0;

    .line 544
    .line 545
    invoke-direct {v4, p0}, La/m6v0;-><init>(La/gii0;)V

    .line 546
    .line 547
    .line 548
    goto :goto_3

    .line 549
    :cond_4
    invoke-static {v5}, La/c99;->h(I)V

    .line 550
    .line 551
    .line 552
    goto :goto_3

    .line 553
    :cond_5
    new-instance v4, La/tij;

    .line 554
    .line 555
    iget-object p0, v6, La/kki;->b:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast p0, La/n5d0;

    .line 558
    .line 559
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    check-cast p0, La/m6v0;

    .line 564
    .line 565
    invoke-virtual {v0}, La/g8i;->J8()La/knf0;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0}, La/g8i;->o8()La/btt0;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    invoke-direct {v4, p0, v1, v0}, La/tij;-><init>(La/m6v0;La/knf0;La/btt0;)V

    .line 580
    .line 581
    .line 582
    goto :goto_3

    .line 583
    :cond_6
    iget-object p0, v6, La/kki;->c:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast p0, La/n5d0;

    .line 586
    .line 587
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    check-cast p0, La/tij;

    .line 592
    .line 593
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    new-instance v4, La/p6v;

    .line 597
    .line 598
    invoke-direct {v4, p0}, La/p6v;-><init>(La/tij;)V

    .line 599
    .line 600
    .line 601
    goto :goto_3

    .line 602
    :cond_7
    new-instance v4, La/mzi;

    .line 603
    .line 604
    invoke-direct {v4, p0}, La/mzi;-><init>(La/nyi;)V

    .line 605
    .line 606
    .line 607
    :goto_3
    return-object v4

    .line 608
    :pswitch_11
    check-cast v6, La/nc0;

    .line 609
    .line 610
    if-eqz v5, :cond_a

    .line 611
    .line 612
    if-eq v5, v3, :cond_9

    .line 613
    .line 614
    if-ne v5, v2, :cond_8

    .line 615
    .line 616
    new-instance v4, La/h32;

    .line 617
    .line 618
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 619
    .line 620
    .line 621
    goto :goto_4

    .line 622
    :cond_8
    invoke-static {v5}, La/c99;->h(I)V

    .line 623
    .line 624
    .line 625
    goto :goto_4

    .line 626
    :cond_9
    new-instance v4, La/ggm0;

    .line 627
    .line 628
    iget-object p0, v6, La/nc0;->e:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast p0, La/cad;

    .line 631
    .line 632
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast p0, La/psc;

    .line 635
    .line 636
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    new-instance v0, La/fuj0;

    .line 644
    .line 645
    iget-object v2, v6, La/nc0;->f:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v2, La/gii0;

    .line 648
    .line 649
    invoke-direct {v0, v2, v1}, La/fuj0;-><init>(La/gii0;B)V

    .line 650
    .line 651
    .line 652
    iget-object v1, v6, La/nc0;->g:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v1, La/knf0;

    .line 655
    .line 656
    iget-object v2, v6, La/nc0;->a:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v2, La/igm0;

    .line 659
    .line 660
    invoke-direct {v4, p0, v0, v1, v2}, La/ggm0;-><init>(La/mne;La/fuj0;La/knf0;La/igm0;)V

    .line 661
    .line 662
    .line 663
    goto :goto_4

    .line 664
    :cond_a
    new-instance v4, La/tyi;

    .line 665
    .line 666
    invoke-direct {v4, p0}, La/tyi;-><init>(La/nyi;)V

    .line 667
    .line 668
    .line 669
    :goto_4
    return-object v4

    .line 670
    :pswitch_12
    check-cast v6, La/oyi;

    .line 671
    .line 672
    iget-object v0, v6, La/oyi;->o:La/knf0;

    .line 673
    .line 674
    iget-object v7, v6, La/oyi;->n:La/gii0;

    .line 675
    .line 676
    if-eqz v5, :cond_f

    .line 677
    .line 678
    if-eq v5, v3, :cond_e

    .line 679
    .line 680
    if-eq v5, v2, :cond_d

    .line 681
    .line 682
    if-eq v5, v1, :cond_c

    .line 683
    .line 684
    const/4 p0, 0x4

    .line 685
    if-ne v5, p0, :cond_b

    .line 686
    .line 687
    new-instance v4, La/nov;

    .line 688
    .line 689
    new-instance p0, La/u8u;

    .line 690
    .line 691
    const/16 v1, 0x14

    .line 692
    .line 693
    invoke-direct {p0, v7, v1}, La/u8u;-><init>(La/gii0;B)V

    .line 694
    .line 695
    .line 696
    new-instance v1, La/pyu;

    .line 697
    .line 698
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 699
    .line 700
    .line 701
    invoke-direct {v4, v0, p0, v1}, La/nov;-><init>(La/knf0;La/u8u;La/pyu;)V

    .line 702
    .line 703
    .line 704
    goto :goto_5

    .line 705
    :cond_b
    invoke-static {v5}, La/c99;->h(I)V

    .line 706
    .line 707
    .line 708
    goto :goto_5

    .line 709
    :cond_c
    new-instance p0, La/iqi;

    .line 710
    .line 711
    const/16 v0, 0xc

    .line 712
    .line 713
    invoke-direct {p0, v7, v0}, La/iqi;-><init>(La/gii0;B)V

    .line 714
    .line 715
    .line 716
    new-instance v0, La/jtj;

    .line 717
    .line 718
    invoke-direct {v0, v7}, La/jtj;-><init>(La/gii0;)V

    .line 719
    .line 720
    .line 721
    new-instance v4, La/d4t0;

    .line 722
    .line 723
    invoke-direct {v4, p0, v0}, La/d4t0;-><init>(La/iqi;La/jtj;)V

    .line 724
    .line 725
    .line 726
    goto :goto_5

    .line 727
    :cond_d
    new-instance v4, La/wqj0;

    .line 728
    .line 729
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 730
    .line 731
    .line 732
    goto :goto_5

    .line 733
    :cond_e
    new-instance v4, La/p5t0;

    .line 734
    .line 735
    iget-object p0, v6, La/oyi;->s:La/n5d0;

    .line 736
    .line 737
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    check-cast p0, La/wqj0;

    .line 742
    .line 743
    new-instance v1, La/kd30;

    .line 744
    .line 745
    const/16 v2, 0x17

    .line 746
    .line 747
    invoke-direct {v1, v7, v2}, La/kd30;-><init>(La/gii0;B)V

    .line 748
    .line 749
    .line 750
    invoke-direct {v4, p0, v1, v0}, La/p5t0;-><init>(La/wqj0;La/kd30;La/knf0;)V

    .line 751
    .line 752
    .line 753
    goto :goto_5

    .line 754
    :cond_f
    new-instance v4, La/myi;

    .line 755
    .line 756
    invoke-direct {v4, p0}, La/myi;-><init>(La/nyi;)V

    .line 757
    .line 758
    .line 759
    :goto_5
    return-object v4

    .line 760
    nop

    .line 761
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    :pswitch_data_1
    .packed-switch 0x0
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
