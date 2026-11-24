.class public final La/ebi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final a:La/cbi;

.field public final b:La/dbi;

.field public final c:La/qv2;

.field public final d:B


# direct methods
.method public constructor <init>(La/cbi;La/dbi;La/qv2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ebi;->a:La/cbi;

    .line 5
    .line 6
    iput-object p2, p0, La/ebi;->b:La/dbi;

    .line 7
    .line 8
    iput-object p3, p0, La/ebi;->c:La/qv2;

    .line 9
    .line 10
    iput-byte p4, p0, La/ebi;->d:B

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/ebi;->a:La/cbi;

    .line 3
    .line 4
    iget-object v2, p0, La/ebi;->c:La/qv2;

    .line 5
    .line 6
    iget-object v3, p0, La/ebi;->b:La/dbi;

    .line 7
    .line 8
    iget-byte p0, p0, La/ebi;->d:B

    .line 9
    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, La/c99;->h(I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    iget-object p0, v2, La/qv2;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/iot0;

    .line 20
    .line 21
    iget-object p0, p0, La/iot0;->c:La/zii0;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance p0, La/spt0;

    .line 25
    .line 26
    iget-object v0, v3, La/dbi;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/n5d0;

    .line 29
    .line 30
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/tpt0;

    .line 35
    .line 36
    iget-object v1, v1, La/cbi;->a:La/esg0;

    .line 37
    .line 38
    iget-object v1, v1, La/esg0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/m1a;

    .line 41
    .line 42
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, v3, La/dbi;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, La/n5d0;

    .line 48
    .line 49
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, La/i2a;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, La/i2a;->a()La/kpd0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-class v4, Landroidx/camera/camera2/compat/quirk/ConfigureSurfaceToSecondarySessionFailQuirk;

    .line 63
    .line 64
    invoke-virtual {v3, v4}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    const-class v4, Landroidx/camera/camera2/compat/quirk/PreviewOrientationIncorrectQuirk;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_1

    .line 77
    .line 78
    const-class v4, Landroidx/camera/camera2/compat/quirk/TextureViewIsClosedQuirk;

    .line 79
    .line 80
    invoke-virtual {v3, v4}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    sget-object v3, La/jtv;->r:La/jtv;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    :goto_0
    new-instance v3, La/ieu;

    .line 91
    .line 92
    const/16 v4, 0x12

    .line 93
    .line 94
    invoke-direct {v3, v4}, La/ieu;-><init>(B)V

    .line 95
    .line 96
    .line 97
    :goto_1
    iget-object v2, v2, La/qv2;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, La/n5d0;

    .line 100
    .line 101
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, La/zii0;

    .line 106
    .line 107
    invoke-direct {p0, v0, v1, v3, v2}, La/spt0;-><init>(La/tpt0;La/m1a;La/r4x;La/zii0;)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_2
    new-instance p0, La/i9a;

    .line 112
    .line 113
    iget-object v0, v3, La/dbi;->e:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, La/n5d0;

    .line 116
    .line 117
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/l1a;

    .line 122
    .line 123
    iget-object v1, v2, La/qv2;->g:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, La/n5d0;

    .line 126
    .line 127
    iget-object v2, v3, La/dbi;->k:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, La/n5d0;

    .line 130
    .line 131
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/tpt0;

    .line 136
    .line 137
    iget-object v3, v3, La/dbi;->q:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, La/n5d0;

    .line 140
    .line 141
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, La/dgr0;

    .line 146
    .line 147
    invoke-direct {p0, v0, v1, v2, v3}, La/i9a;-><init>(La/l1a;La/o5d0;La/tpt0;La/dgr0;)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_3
    new-instance p0, La/cpt0;

    .line 152
    .line 153
    iget-object v0, v2, La/qv2;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/n5d0;

    .line 156
    .line 157
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, La/kpt0;

    .line 162
    .line 163
    invoke-virtual {v3}, La/dbi;->A()La/nwp0;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {p0, v0, v1}, La/cpt0;-><init>(La/kpt0;La/nwp0;)V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_4
    move-object p0, v2

    .line 172
    new-instance v2, La/v7a;

    .line 173
    .line 174
    iget-object v0, v3, La/dbi;->e:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, La/n5d0;

    .line 177
    .line 178
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, La/l1a;

    .line 183
    .line 184
    iget-object p0, p0, La/qv2;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, La/n5d0;

    .line 187
    .line 188
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    move-object v4, p0

    .line 193
    check-cast v4, La/kpt0;

    .line 194
    .line 195
    iget-object p0, v3, La/dbi;->f:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p0, La/n5d0;

    .line 198
    .line 199
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    move-object v5, p0

    .line 204
    check-cast v5, La/f4w0;

    .line 205
    .line 206
    iget-object p0, v3, La/dbi;->k:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p0, La/n5d0;

    .line 209
    .line 210
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    move-object v6, p0

    .line 215
    check-cast v6, La/tpt0;

    .line 216
    .line 217
    invoke-virtual {v3}, La/dbi;->A()La/nwp0;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    move-object v3, v0

    .line 222
    invoke-direct/range {v2 .. v7}, La/v7a;-><init>(La/l1a;La/kpt0;La/f4w0;La/tpt0;La/nwp0;)V

    .line 223
    .line 224
    .line 225
    return-object v2

    .line 226
    :pswitch_5
    move-object p0, v2

    .line 227
    move-object v2, v3

    .line 228
    new-instance v3, La/g9a;

    .line 229
    .line 230
    iget-object v0, p0, La/qv2;->e:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, La/n5d0;

    .line 233
    .line 234
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    move-object v4, v0

    .line 239
    check-cast v4, La/v7a;

    .line 240
    .line 241
    iget-object v0, v2, La/dbi;->r:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, La/n5d0;

    .line 244
    .line 245
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    move-object v5, v0

    .line 250
    check-cast v5, La/vjq;

    .line 251
    .line 252
    iget-object v0, v2, La/dbi;->q:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, La/n5d0;

    .line 255
    .line 256
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    move-object v6, v0

    .line 261
    check-cast v6, La/dgr0;

    .line 262
    .line 263
    iget-object v0, v2, La/dbi;->u:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, La/n5d0;

    .line 266
    .line 267
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    move-object v7, v0

    .line 272
    check-cast v7, La/ufu0;

    .line 273
    .line 274
    iget-object v0, v2, La/dbi;->k:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, La/n5d0;

    .line 277
    .line 278
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    move-object v8, v0

    .line 283
    check-cast v8, La/tpt0;

    .line 284
    .line 285
    iget-object v0, v2, La/dbi;->m:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, La/n5d0;

    .line 288
    .line 289
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    move-object v9, v0

    .line 294
    check-cast v9, La/p7d;

    .line 295
    .line 296
    iget-object v0, v2, La/dbi;->j:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, La/n5d0;

    .line 299
    .line 300
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, La/i2a;

    .line 305
    .line 306
    iget-object v1, v2, La/dbi;->c:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, La/cbi;

    .line 309
    .line 310
    invoke-virtual {v1}, La/cbi;->a()La/zy9;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v10, v2, La/dbi;->D:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v10, La/n5d0;

    .line 317
    .line 318
    invoke-interface {v10}, La/o5d0;->get()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    check-cast v10, La/jnx;

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, La/i2a;->a()La/kpd0;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    const-class v12, Landroidx/camera/camera2/compat/quirk/UseTorchAsFlashQuirk;

    .line 335
    .line 336
    invoke-virtual {v11, v12}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 337
    .line 338
    .line 339
    move-result v11

    .line 340
    if-eqz v11, :cond_2

    .line 341
    .line 342
    new-instance v11, La/h0q0;

    .line 343
    .line 344
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 345
    .line 346
    .line 347
    iput-object v0, v11, La/h0q0;->a:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v1, v11, La/h0q0;->b:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v10, v11, La/h0q0;->c:Ljava/lang/Object;

    .line 352
    .line 353
    new-instance v0, La/rbt0;

    .line 354
    .line 355
    const/4 v1, 0x3

    .line 356
    invoke-direct {v0, v11, v1}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 357
    .line 358
    .line 359
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    iput-object v0, v11, La/h0q0;->d:Ljava/lang/Object;

    .line 364
    .line 365
    :goto_2
    move-object v10, v11

    .line 366
    goto :goto_3

    .line 367
    :cond_2
    sget-object v11, La/ujn;->x:La/ujn;

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :goto_3
    iget-object v0, v2, La/dbi;->e:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, La/n5d0;

    .line 373
    .line 374
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    move-object v11, v0

    .line 379
    check-cast v11, La/l1a;

    .line 380
    .line 381
    iget-object v0, p0, La/qv2;->f:Ljava/lang/Object;

    .line 382
    .line 383
    move-object v12, v0

    .line 384
    check-cast v12, La/n5d0;

    .line 385
    .line 386
    iget-object p0, p0, La/qv2;->c:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast p0, La/n5d0;

    .line 389
    .line 390
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    move-object v13, p0

    .line 395
    check-cast v13, La/kpt0;

    .line 396
    .line 397
    invoke-direct/range {v3 .. v13}, La/g9a;-><init>(La/v7a;La/vjq;La/dgr0;La/ufu0;La/tpt0;La/p7d;La/dqt0;La/l1a;La/o5d0;La/kpt0;)V

    .line 398
    .line 399
    .line 400
    return-object v3

    .line 401
    :pswitch_6
    move-object p0, v2

    .line 402
    iget-object v0, p0, La/qv2;->g:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, La/n5d0;

    .line 405
    .line 406
    iget-object p0, p0, La/qv2;->h:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p0, La/n5d0;

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    sget-boolean v1, La/i9a;->f:Z

    .line 417
    .line 418
    if-eqz v1, :cond_3

    .line 419
    .line 420
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    check-cast p0, La/f8a;

    .line 428
    .line 429
    return-object p0

    .line 430
    :cond_3
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    check-cast p0, La/f8a;

    .line 438
    .line 439
    return-object p0

    .line 440
    :pswitch_7
    move-object p0, v2

    .line 441
    move-object v2, v3

    .line 442
    new-instance v0, La/xot0;

    .line 443
    .line 444
    iget-object v3, p0, La/qv2;->i:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v3, La/n5d0;

    .line 447
    .line 448
    iget-object v4, p0, La/qv2;->f:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v4, La/n5d0;

    .line 451
    .line 452
    iget-object v5, p0, La/qv2;->c:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v5, La/n5d0;

    .line 455
    .line 456
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    check-cast v5, La/kpt0;

    .line 461
    .line 462
    iget-object p0, p0, La/qv2;->k:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast p0, La/n5d0;

    .line 465
    .line 466
    iget-object v2, v2, La/dbi;->k:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v2, La/n5d0;

    .line 469
    .line 470
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    check-cast v2, La/tpt0;

    .line 475
    .line 476
    iget-object v1, v1, La/cbi;->a:La/esg0;

    .line 477
    .line 478
    iget-object v1, v1, La/esg0;->f:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v6, v1

    .line 481
    check-cast v6, La/l4a;

    .line 482
    .line 483
    move-object v1, v3

    .line 484
    move-object v3, v5

    .line 485
    move-object v5, v2

    .line 486
    move-object v2, v4

    .line 487
    move-object v4, p0

    .line 488
    invoke-direct/range {v0 .. v6}, La/xot0;-><init>(La/o5d0;La/o5d0;La/kpt0;La/o5d0;La/tpt0;La/l4a;)V

    .line 489
    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_8
    move-object p0, v2

    .line 493
    move-object v2, v3

    .line 494
    new-instance v0, La/rzj;

    .line 495
    .line 496
    iget-object p0, p0, La/qv2;->l:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast p0, La/n5d0;

    .line 499
    .line 500
    iget-object v1, v2, La/dbi;->k:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v1, La/n5d0;

    .line 503
    .line 504
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    check-cast v1, La/tpt0;

    .line 509
    .line 510
    invoke-direct {v0, p0, v1}, La/rzj;-><init>(La/o5d0;La/tpt0;)V

    .line 511
    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_9
    move-object p0, v2

    .line 515
    iget-object p0, p0, La/qv2;->b:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p0, La/iot0;

    .line 518
    .line 519
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    return-object v0

    .line 523
    :pswitch_a
    move-object p0, v2

    .line 524
    move-object v2, v3

    .line 525
    iget-object p0, p0, La/qv2;->b:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast p0, La/iot0;

    .line 528
    .line 529
    iget-object v0, v2, La/dbi;->y:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, La/n5d0;

    .line 532
    .line 533
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    check-cast v0, La/r2a;

    .line 538
    .line 539
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    const-string v1, "CXCP"

    .line 546
    .line 547
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    if-eqz v2, :cond_4

    .line 552
    .line 553
    const-string v2, "Prepared UseCaseGraphContext (Deferred)"

    .line 554
    .line 555
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 556
    .line 557
    .line 558
    :cond_4
    new-instance v1, La/got0;

    .line 559
    .line 560
    const/4 v2, 0x0

    .line 561
    invoke-direct {v1, p0, v2}, La/got0;-><init>(Ljava/lang/Object;B)V

    .line 562
    .line 563
    .line 564
    new-instance v2, La/got0;

    .line 565
    .line 566
    const/4 v3, 0x1

    .line 567
    invoke-direct {v2, p0, v3}, La/got0;-><init>(Ljava/lang/Object;B)V

    .line 568
    .line 569
    .line 570
    iget-object p0, p0, La/iot0;->b:La/sev;

    .line 571
    .line 572
    new-instance v3, La/kpt0;

    .line 573
    .line 574
    invoke-direct {v3, v1, v0, p0, v2}, La/kpt0;-><init>(La/got0;La/r2a;La/sev;La/got0;)V

    .line 575
    .line 576
    .line 577
    return-object v3

    .line 578
    :pswitch_b
    move-object p0, v2

    .line 579
    move-object v2, v3

    .line 580
    new-instance v4, La/mot0;

    .line 581
    .line 582
    iget-object v1, p0, La/qv2;->c:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v1, La/n5d0;

    .line 585
    .line 586
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    move-object v5, v1

    .line 591
    check-cast v5, La/kpt0;

    .line 592
    .line 593
    iget-object v1, v2, La/dbi;->k:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v1, La/n5d0;

    .line 596
    .line 597
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    move-object v6, v1

    .line 602
    check-cast v6, La/tpt0;

    .line 603
    .line 604
    iget-object v1, p0, La/qv2;->d:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v1, La/n5d0;

    .line 607
    .line 608
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    if-nez v1, :cond_5

    .line 613
    .line 614
    iget-object v0, p0, La/qv2;->m:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v0, La/n5d0;

    .line 617
    .line 618
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    move-object v7, v0

    .line 623
    check-cast v7, La/pot0;

    .line 624
    .line 625
    iget-object v0, p0, La/qv2;->k:Ljava/lang/Object;

    .line 626
    .line 627
    move-object v8, v0

    .line 628
    check-cast v8, La/n5d0;

    .line 629
    .line 630
    iget-object v0, p0, La/qv2;->j:Ljava/lang/Object;

    .line 631
    .line 632
    move-object v9, v0

    .line 633
    check-cast v9, La/n5d0;

    .line 634
    .line 635
    iget-object p0, p0, La/qv2;->i:Ljava/lang/Object;

    .line 636
    .line 637
    move-object v10, p0

    .line 638
    check-cast v10, La/n5d0;

    .line 639
    .line 640
    invoke-direct/range {v4 .. v10}, La/mot0;-><init>(La/kpt0;La/tpt0;La/pot0;La/o5d0;La/o5d0;La/o5d0;)V

    .line 641
    .line 642
    .line 643
    return-object v4

    .line 644
    :cond_5
    invoke-static {}, La/hny;->b()V

    .line 645
    .line 646
    .line 647
    return-object v0

    .line 648
    nop

    .line 649
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
