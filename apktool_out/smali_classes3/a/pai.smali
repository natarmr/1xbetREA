.class public final La/pai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pai;->a:B

    iput-object p1, p0, La/pai;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pai;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0xf

    .line 7
    .line 8
    const/16 v4, 0x15

    .line 9
    .line 10
    iget-object v5, v0, La/pai;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v6, La/gfd;

    .line 16
    .line 17
    check-cast v5, La/nc0;

    .line 18
    .line 19
    iget-object v0, v5, La/nc0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v7, v0

    .line 22
    check-cast v7, La/duj;

    .line 23
    .line 24
    new-instance v8, La/lsn;

    .line 25
    .line 26
    new-instance v0, La/y3v;

    .line 27
    .line 28
    iget-object v1, v5, La/nc0;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, La/cad;

    .line 31
    .line 32
    iget-object v2, v1, La/cad;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, La/psc;

    .line 35
    .line 36
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/fck0;

    .line 44
    .line 45
    iget-object v4, v5, La/nc0;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, La/gii0;

    .line 48
    .line 49
    const/4 v9, 0x6

    .line 50
    invoke-direct {v3, v4, v9}, La/fck0;-><init>(La/gii0;B)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v5, La/nc0;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, La/knf0;

    .line 56
    .line 57
    invoke-direct {v0, v2, v3, v4}, La/y3v;-><init>(La/mne;La/fck0;La/knf0;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v8, v0}, La/lsn;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v5, La/nc0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v9, v0

    .line 66
    check-cast v9, La/m1e;

    .line 67
    .line 68
    iget-object v0, v5, La/nc0;->h:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v10, v0

    .line 71
    check-cast v10, La/i1w0;

    .line 72
    .line 73
    iget-object v0, v5, La/nc0;->i:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v11, v0

    .line 76
    check-cast v11, La/kki;

    .line 77
    .line 78
    iget-object v0, v5, La/nc0;->b:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v12, v0

    .line 81
    check-cast v12, La/ocl;

    .line 82
    .line 83
    iget-object v0, v5, La/nc0;->c:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v13, v0

    .line 86
    check-cast v13, La/ctf0;

    .line 87
    .line 88
    iget-object v0, v5, La/nc0;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    iget-object v0, v5, La/nc0;->k:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v15, v0

    .line 99
    check-cast v15, La/vjp;

    .line 100
    .line 101
    iget-object v0, v5, La/nc0;->l:Ljava/lang/Object;

    .line 102
    .line 103
    move-object/from16 v16, v0

    .line 104
    .line 105
    check-cast v16, Ljava/lang/String;

    .line 106
    .line 107
    iget-object v0, v5, La/nc0;->m:Ljava/lang/Object;

    .line 108
    .line 109
    move-object/from16 v17, v0

    .line 110
    .line 111
    check-cast v17, La/r9u;

    .line 112
    .line 113
    iget-object v0, v1, La/cad;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, La/psc;

    .line 116
    .line 117
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 118
    .line 119
    .line 120
    move-result-object v18

    .line 121
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-direct/range {v6 .. v18}, La/gfd;-><init>(La/duj;La/lsn;La/m1e;La/i1w0;La/kki;La/ocl;La/ctf0;ZLa/vjp;Ljava/lang/String;La/r9u;La/mne;)V

    .line 125
    .line 126
    .line 127
    return-object v6

    .line 128
    :pswitch_0
    new-instance v7, La/kfd;

    .line 129
    .line 130
    check-cast v5, La/nc0;

    .line 131
    .line 132
    iget-object v0, v5, La/nc0;->d:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v8, v0

    .line 135
    check-cast v8, La/duj;

    .line 136
    .line 137
    new-instance v9, La/bwl;

    .line 138
    .line 139
    new-instance v0, La/lhf0;

    .line 140
    .line 141
    iget-object v1, v5, La/nc0;->e:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, La/cad;

    .line 144
    .line 145
    iget-object v2, v1, La/cad;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, La/psc;

    .line 148
    .line 149
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    new-instance v3, La/ehf0;

    .line 157
    .line 158
    iget-object v6, v5, La/nc0;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v6, La/gii0;

    .line 161
    .line 162
    invoke-direct {v3, v6, v4}, La/ehf0;-><init>(La/gii0;B)V

    .line 163
    .line 164
    .line 165
    iget-object v4, v5, La/nc0;->g:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, La/knf0;

    .line 168
    .line 169
    invoke-direct {v0, v2, v3, v4}, La/lhf0;-><init>(La/mne;La/ehf0;La/knf0;)V

    .line 170
    .line 171
    .line 172
    invoke-direct {v9, v0}, La/bwl;-><init>(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v5, La/nc0;->a:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v10, v0

    .line 178
    check-cast v10, La/m1e;

    .line 179
    .line 180
    iget-object v0, v5, La/nc0;->h:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v11, v0

    .line 183
    check-cast v11, La/i1w0;

    .line 184
    .line 185
    iget-object v0, v5, La/nc0;->c:Ljava/lang/Object;

    .line 186
    .line 187
    move-object v12, v0

    .line 188
    check-cast v12, La/ctf0;

    .line 189
    .line 190
    iget-object v0, v5, La/nc0;->i:Ljava/lang/Object;

    .line 191
    .line 192
    move-object v13, v0

    .line 193
    check-cast v13, La/kki;

    .line 194
    .line 195
    iget-object v0, v5, La/nc0;->b:Ljava/lang/Object;

    .line 196
    .line 197
    move-object v14, v0

    .line 198
    check-cast v14, La/ocl;

    .line 199
    .line 200
    iget-object v0, v5, La/nc0;->j:Ljava/lang/Object;

    .line 201
    .line 202
    move-object v15, v0

    .line 203
    check-cast v15, La/vjp;

    .line 204
    .line 205
    iget-object v0, v5, La/nc0;->k:Ljava/lang/Object;

    .line 206
    .line 207
    move-object/from16 v16, v0

    .line 208
    .line 209
    check-cast v16, Ljava/lang/String;

    .line 210
    .line 211
    iget-object v0, v5, La/nc0;->l:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Ljava/lang/Long;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v17

    .line 219
    iget-object v0, v5, La/nc0;->m:Ljava/lang/Object;

    .line 220
    .line 221
    move-object/from16 v19, v0

    .line 222
    .line 223
    check-cast v19, La/r9u;

    .line 224
    .line 225
    iget-object v0, v1, La/cad;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, La/psc;

    .line 228
    .line 229
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 230
    .line 231
    .line 232
    move-result-object v20

    .line 233
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-direct/range {v7 .. v20}, La/kfd;-><init>(La/duj;La/bwl;La/m1e;La/i1w0;La/ctf0;La/kki;La/ocl;La/vjp;Ljava/lang/String;JLa/r9u;La/mne;)V

    .line 237
    .line 238
    .line 239
    return-object v7

    .line 240
    :pswitch_1
    new-instance v1, La/rci;

    .line 241
    .line 242
    invoke-direct {v1, v0}, La/rci;-><init>(La/pai;)V

    .line 243
    .line 244
    .line 245
    return-object v1

    .line 246
    :pswitch_2
    new-instance v0, La/qj9;

    .line 247
    .line 248
    check-cast v5, La/xzp;

    .line 249
    .line 250
    iget-object v1, v5, La/xzp;->a:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, La/oj9;

    .line 253
    .line 254
    invoke-direct {v0, v1}, La/qj9;-><init>(La/oj9;)V

    .line 255
    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_3
    new-instance v0, La/wtc;

    .line 259
    .line 260
    check-cast v5, La/nhf0;

    .line 261
    .line 262
    iget-object v1, v5, La/nhf0;->a:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, La/fhj;

    .line 265
    .line 266
    iget-object v2, v5, La/nhf0;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v2, La/ctf0;

    .line 269
    .line 270
    iget-object v3, v5, La/nhf0;->c:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v3, La/i1w0;

    .line 273
    .line 274
    invoke-direct {v0, v1, v2, v3}, La/wtc;-><init>(La/fhj;La/ctf0;La/i1w0;)V

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_4
    new-instance v4, La/ksc;

    .line 279
    .line 280
    check-cast v5, La/mii0;

    .line 281
    .line 282
    iget-object v0, v5, La/mii0;->b:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, La/cad;

    .line 285
    .line 286
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, La/psc;

    .line 289
    .line 290
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iget-object v1, v5, La/mii0;->c:Ljava/lang/Object;

    .line 298
    .line 299
    move-object v6, v1

    .line 300
    check-cast v6, La/ctf0;

    .line 301
    .line 302
    new-instance v7, La/hbu;

    .line 303
    .line 304
    iget-object v1, v5, La/mii0;->d:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, La/ioi;

    .line 307
    .line 308
    invoke-virtual {v1}, La/ioi;->b()La/ien;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-direct {v7, v2}, La/hbu;-><init>(La/ien;)V

    .line 316
    .line 317
    .line 318
    new-instance v8, La/reu;

    .line 319
    .line 320
    invoke-virtual {v1}, La/ioi;->b()La/ien;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-direct {v8, v2, v3}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 328
    .line 329
    .line 330
    new-instance v9, La/yk50;

    .line 331
    .line 332
    invoke-virtual {v1}, La/ioi;->b()La/ien;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    const/16 v2, 0x1c

    .line 340
    .line 341
    invoke-direct {v9, v1, v2}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 342
    .line 343
    .line 344
    move-object v5, v0

    .line 345
    invoke-direct/range {v4 .. v9}, La/ksc;-><init>(La/mne;La/ctf0;La/hbu;La/reu;La/yk50;)V

    .line 346
    .line 347
    .line 348
    return-object v4

    .line 349
    :pswitch_5
    new-instance v0, La/h7p;

    .line 350
    .line 351
    check-cast v5, La/qci;

    .line 352
    .line 353
    iget-object v1, v5, La/qci;->a:La/ctf0;

    .line 354
    .line 355
    iget-object v2, v5, La/qci;->b:La/mne;

    .line 356
    .line 357
    new-instance v3, La/a7q;

    .line 358
    .line 359
    new-instance v4, La/rrc;

    .line 360
    .line 361
    iget-object v6, v5, La/qci;->c:La/t6p;

    .line 362
    .line 363
    invoke-direct {v4, v6}, La/rrc;-><init>(La/t6p;)V

    .line 364
    .line 365
    .line 366
    invoke-direct {v3, v4}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    iget-object v4, v5, La/qci;->d:La/wep;

    .line 370
    .line 371
    invoke-direct {v0, v1, v2, v3, v4}, La/h7p;-><init>(La/ctf0;La/mne;La/a7q;La/wep;)V

    .line 372
    .line 373
    .line 374
    return-object v0

    .line 375
    :pswitch_6
    move-object v0, v5

    .line 376
    new-instance v5, La/lic;

    .line 377
    .line 378
    check-cast v0, La/rrd;

    .line 379
    .line 380
    iget-object v1, v0, La/rrd;->b:Ljava/lang/Object;

    .line 381
    .line 382
    move-object v6, v1

    .line 383
    check-cast v6, La/ctf0;

    .line 384
    .line 385
    iget-object v1, v0, La/rrd;->c:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v1, La/cad;

    .line 388
    .line 389
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, La/psc;

    .line 392
    .line 393
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    iget-object v1, v0, La/rrd;->d:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v1, La/pcl0;

    .line 403
    .line 404
    invoke-interface {v1}, La/pcl0;->j()La/ntt;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    new-instance v9, La/eyg0;

    .line 412
    .line 413
    iget-object v3, v0, La/rrd;->e:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v3, La/eai;

    .line 416
    .line 417
    invoke-virtual {v3}, La/eai;->a()La/b8h0;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    const/16 v10, 0x10

    .line 425
    .line 426
    invoke-direct {v9, v4, v10}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 427
    .line 428
    .line 429
    new-instance v4, La/oif0;

    .line 430
    .line 431
    invoke-interface {v1}, La/pcl0;->j()La/ntt;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    new-instance v11, La/hru;

    .line 439
    .line 440
    invoke-virtual {v3}, La/eai;->a()La/b8h0;

    .line 441
    .line 442
    .line 443
    move-result-object v12

    .line 444
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    invoke-direct {v11, v12}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    new-instance v12, La/eyg0;

    .line 451
    .line 452
    invoke-virtual {v3}, La/eai;->a()La/b8h0;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v12, v3, v10}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 460
    .line 461
    .line 462
    const/16 v3, 0x1d

    .line 463
    .line 464
    invoke-direct {v4, v1, v11, v12, v3}, La/oif0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 465
    .line 466
    .line 467
    iget-object v1, v0, La/rrd;->f:Ljava/lang/Object;

    .line 468
    .line 469
    move-object v11, v1

    .line 470
    check-cast v11, La/s64;

    .line 471
    .line 472
    new-instance v12, La/qu;

    .line 473
    .line 474
    iget-object v1, v0, La/rrd;->g:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v1, La/kt2;

    .line 477
    .line 478
    invoke-direct {v12, v1, v2}, La/qu;-><init>(La/kt2;B)V

    .line 479
    .line 480
    .line 481
    iget-object v0, v0, La/rrd;->h:Ljava/lang/Object;

    .line 482
    .line 483
    move-object v13, v0

    .line 484
    check-cast v13, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;

    .line 485
    .line 486
    move-object v10, v4

    .line 487
    invoke-direct/range {v5 .. v13}, La/lic;-><init>(La/ctf0;La/mne;La/ntt;La/eyg0;La/oif0;La/s64;La/qu;Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;)V

    .line 488
    .line 489
    .line 490
    return-object v5

    .line 491
    :pswitch_7
    move-object v0, v5

    .line 492
    new-instance v1, La/xgc;

    .line 493
    .line 494
    move-object v5, v0

    .line 495
    check-cast v5, La/pci;

    .line 496
    .line 497
    iget-object v0, v5, La/pci;->a:La/mne;

    .line 498
    .line 499
    iget-object v2, v5, La/pci;->b:La/m1e;

    .line 500
    .line 501
    iget-object v3, v5, La/pci;->c:La/gr70;

    .line 502
    .line 503
    invoke-interface {v3}, La/gr70;->a()La/tgu;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-direct {v1, v0, v2, v3}, La/xgc;-><init>(La/mne;La/m1e;La/tgu;)V

    .line 511
    .line 512
    .line 513
    return-object v1

    .line 514
    :pswitch_8
    new-instance v1, La/nci;

    .line 515
    .line 516
    invoke-direct {v1, v0}, La/nci;-><init>(La/pai;)V

    .line 517
    .line 518
    .line 519
    return-object v1

    .line 520
    :pswitch_9
    new-instance v1, La/kci;

    .line 521
    .line 522
    invoke-direct {v1, v0}, La/kci;-><init>(La/pai;)V

    .line 523
    .line 524
    .line 525
    return-object v1

    .line 526
    :pswitch_a
    new-instance v1, La/ici;

    .line 527
    .line 528
    invoke-direct {v1, v0}, La/ici;-><init>(La/pai;)V

    .line 529
    .line 530
    .line 531
    return-object v1

    .line 532
    :pswitch_b
    move-object v0, v5

    .line 533
    new-instance v2, La/etb;

    .line 534
    .line 535
    move-object v5, v0

    .line 536
    check-cast v5, La/esg0;

    .line 537
    .line 538
    iget-object v0, v5, La/esg0;->a:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, La/cad;

    .line 541
    .line 542
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, La/psc;

    .line 545
    .line 546
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    iget-object v0, v5, La/esg0;->b:Ljava/lang/Object;

    .line 554
    .line 555
    move-object v4, v0

    .line 556
    check-cast v4, La/ctf0;

    .line 557
    .line 558
    iget-object v0, v5, La/esg0;->c:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, La/iw20;

    .line 561
    .line 562
    iget-object v1, v0, La/iw20;->a:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v1, La/uii;

    .line 565
    .line 566
    new-instance v6, La/vgu;

    .line 567
    .line 568
    iget-object v1, v1, La/uii;->a:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v1, La/vff0;

    .line 571
    .line 572
    const/4 v7, 0x1

    .line 573
    invoke-direct {v6, v1, v7}, La/vgu;-><init>(La/vff0;B)V

    .line 574
    .line 575
    .line 576
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, La/uii;

    .line 579
    .line 580
    invoke-virtual {v0}, La/uii;->w()La/pyu;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    iget-object v1, v5, La/esg0;->d:Ljava/lang/Object;

    .line 585
    .line 586
    move-object v7, v1

    .line 587
    check-cast v7, Ljava/lang/String;

    .line 588
    .line 589
    iget-object v1, v5, La/esg0;->e:Ljava/lang/Object;

    .line 590
    .line 591
    move-object v8, v1

    .line 592
    check-cast v8, La/vby;

    .line 593
    .line 594
    move-object v5, v6

    .line 595
    move-object v6, v0

    .line 596
    invoke-direct/range {v2 .. v8}, La/etb;-><init>(La/mne;La/ctf0;La/vgu;La/pyu;Ljava/lang/String;La/vby;)V

    .line 597
    .line 598
    .line 599
    return-object v2

    .line 600
    :pswitch_c
    new-instance v1, La/gci;

    .line 601
    .line 602
    invoke-direct {v1, v0}, La/gci;-><init>(La/pai;)V

    .line 603
    .line 604
    .line 605
    return-object v1

    .line 606
    :pswitch_d
    new-instance v1, La/fci;

    .line 607
    .line 608
    invoke-direct {v1, v0}, La/fci;-><init>(La/pai;)V

    .line 609
    .line 610
    .line 611
    return-object v1

    .line 612
    :pswitch_e
    move-object v0, v5

    .line 613
    new-instance v2, La/nob;

    .line 614
    .line 615
    move-object v5, v0

    .line 616
    check-cast v5, La/qv2;

    .line 617
    .line 618
    iget-object v0, v5, La/qv2;->b:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v0, Ljava/lang/Integer;

    .line 621
    .line 622
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    iget-object v0, v5, La/qv2;->c:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast v0, Ljava/lang/Long;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 631
    .line 632
    .line 633
    move-result-wide v0

    .line 634
    new-instance v6, La/hst;

    .line 635
    .line 636
    new-instance v4, La/oif0;

    .line 637
    .line 638
    iget-object v7, v5, La/qv2;->d:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v7, La/lye;

    .line 641
    .line 642
    iget-object v8, v5, La/qv2;->e:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v8, La/m0f;

    .line 645
    .line 646
    iget-object v9, v5, La/qv2;->f:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v9, La/ave;

    .line 649
    .line 650
    invoke-direct {v4, v7, v8, v9}, La/oif0;-><init>(La/lye;La/m0f;La/ave;)V

    .line 651
    .line 652
    .line 653
    invoke-direct {v6, v4}, La/hst;-><init>(La/oif0;)V

    .line 654
    .line 655
    .line 656
    new-instance v7, La/o4a;

    .line 657
    .line 658
    new-instance v8, La/g45;

    .line 659
    .line 660
    iget-object v4, v5, La/qv2;->d:Ljava/lang/Object;

    .line 661
    .line 662
    move-object v9, v4

    .line 663
    check-cast v9, La/lye;

    .line 664
    .line 665
    iget-object v4, v5, La/qv2;->e:Ljava/lang/Object;

    .line 666
    .line 667
    move-object v10, v4

    .line 668
    check-cast v10, La/m0f;

    .line 669
    .line 670
    iget-object v4, v5, La/qv2;->f:Ljava/lang/Object;

    .line 671
    .line 672
    move-object v11, v4

    .line 673
    check-cast v11, La/ave;

    .line 674
    .line 675
    new-instance v12, La/ehf0;

    .line 676
    .line 677
    iget-object v4, v5, La/qv2;->g:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v4, La/gii0;

    .line 680
    .line 681
    const/16 v13, 0x17

    .line 682
    .line 683
    invoke-direct {v12, v4, v13}, La/ehf0;-><init>(La/gii0;B)V

    .line 684
    .line 685
    .line 686
    iget-object v4, v5, La/qv2;->h:Ljava/lang/Object;

    .line 687
    .line 688
    move-object v13, v4

    .line 689
    check-cast v13, La/vwb0;

    .line 690
    .line 691
    iget-object v4, v5, La/qv2;->i:Ljava/lang/Object;

    .line 692
    .line 693
    move-object v14, v4

    .line 694
    check-cast v14, La/q7d0;

    .line 695
    .line 696
    iget-object v4, v5, La/qv2;->j:Ljava/lang/Object;

    .line 697
    .line 698
    move-object v15, v4

    .line 699
    check-cast v15, La/us3;

    .line 700
    .line 701
    iget-object v4, v5, La/qv2;->k:Ljava/lang/Object;

    .line 702
    .line 703
    move-object/from16 v16, v4

    .line 704
    .line 705
    check-cast v16, La/knf0;

    .line 706
    .line 707
    iget-object v4, v5, La/qv2;->l:Ljava/lang/Object;

    .line 708
    .line 709
    move-object/from16 v17, v4

    .line 710
    .line 711
    check-cast v17, La/mne;

    .line 712
    .line 713
    invoke-direct/range {v8 .. v17}, La/g45;-><init>(La/lye;La/m0f;La/ave;La/ehf0;La/vwb0;La/q7d0;La/us3;La/knf0;La/mne;)V

    .line 714
    .line 715
    .line 716
    invoke-direct {v7, v8}, La/o4a;-><init>(La/g45;)V

    .line 717
    .line 718
    .line 719
    iget-object v4, v5, La/qv2;->m:Ljava/lang/Object;

    .line 720
    .line 721
    move-object v9, v4

    .line 722
    check-cast v9, La/ctf0;

    .line 723
    .line 724
    move-wide v4, v0

    .line 725
    move-object/from16 v8, v17

    .line 726
    .line 727
    invoke-direct/range {v2 .. v9}, La/nob;-><init>(IJLa/hst;La/o4a;La/mne;La/ctf0;)V

    .line 728
    .line 729
    .line 730
    return-object v2

    .line 731
    :pswitch_f
    move-object v0, v5

    .line 732
    new-instance v1, La/ynb;

    .line 733
    .line 734
    move-object v5, v0

    .line 735
    check-cast v5, La/yzn0;

    .line 736
    .line 737
    iget-object v0, v5, La/yzn0;->a:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, La/ii;

    .line 740
    .line 741
    invoke-direct {v1, v0}, La/ynb;-><init>(La/ii;)V

    .line 742
    .line 743
    .line 744
    return-object v1

    .line 745
    :pswitch_10
    move-object v0, v5

    .line 746
    new-instance v2, La/gob;

    .line 747
    .line 748
    move-object v5, v0

    .line 749
    check-cast v5, La/h6i;

    .line 750
    .line 751
    iget-object v0, v5, La/h6i;->d:Ljava/lang/Object;

    .line 752
    .line 753
    move-object v3, v0

    .line 754
    check-cast v3, La/bm5;

    .line 755
    .line 756
    iget-object v0, v5, La/h6i;->a:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v0, Ljava/lang/Boolean;

    .line 759
    .line 760
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    iget-object v0, v5, La/h6i;->e:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v0, Ljava/lang/Boolean;

    .line 767
    .line 768
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    iget-object v1, v5, La/h6i;->f:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v1, Ljava/lang/Boolean;

    .line 775
    .line 776
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 777
    .line 778
    .line 779
    move-result v6

    .line 780
    iget-object v1, v5, La/h6i;->g:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v1, La/wsf0;

    .line 783
    .line 784
    iget-object v7, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v7, La/g45;

    .line 787
    .line 788
    invoke-virtual {v7}, La/g45;->G()La/khf0;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    invoke-virtual {v1}, La/wsf0;->s()La/trm0;

    .line 793
    .line 794
    .line 795
    move-result-object v8

    .line 796
    new-instance v9, La/bsu;

    .line 797
    .line 798
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 799
    .line 800
    .line 801
    iget-object v10, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v10, La/g45;

    .line 804
    .line 805
    invoke-virtual {v10}, La/g45;->y()La/ahu;

    .line 806
    .line 807
    .line 808
    move-result-object v10

    .line 809
    invoke-virtual {v1}, La/wsf0;->g()La/urt;

    .line 810
    .line 811
    .line 812
    move-result-object v11

    .line 813
    iget-object v1, v5, La/h6i;->h:Ljava/lang/Object;

    .line 814
    .line 815
    move-object v12, v1

    .line 816
    check-cast v12, La/v88;

    .line 817
    .line 818
    iget-object v1, v5, La/h6i;->i:Ljava/lang/Object;

    .line 819
    .line 820
    move-object v13, v1

    .line 821
    check-cast v13, La/ih5;

    .line 822
    .line 823
    iget-object v1, v5, La/h6i;->j:Ljava/lang/Object;

    .line 824
    .line 825
    move-object v14, v1

    .line 826
    check-cast v14, La/zg;

    .line 827
    .line 828
    iget-object v1, v5, La/h6i;->k:Ljava/lang/Object;

    .line 829
    .line 830
    move-object v15, v1

    .line 831
    check-cast v15, La/eqx;

    .line 832
    .line 833
    iget-object v1, v5, La/h6i;->b:Ljava/lang/Object;

    .line 834
    .line 835
    move-object/from16 v16, v1

    .line 836
    .line 837
    check-cast v16, La/mne;

    .line 838
    .line 839
    iget-object v1, v5, La/h6i;->l:Ljava/lang/Object;

    .line 840
    .line 841
    move-object/from16 v17, v1

    .line 842
    .line 843
    check-cast v17, La/g2v;

    .line 844
    .line 845
    iget-object v1, v5, La/h6i;->m:Ljava/lang/Object;

    .line 846
    .line 847
    move-object/from16 v18, v1

    .line 848
    .line 849
    check-cast v18, La/wxs0;

    .line 850
    .line 851
    iget-object v1, v5, La/h6i;->n:Ljava/lang/Object;

    .line 852
    .line 853
    move-object/from16 v19, v1

    .line 854
    .line 855
    check-cast v19, La/i1w0;

    .line 856
    .line 857
    iget-object v1, v5, La/h6i;->o:Ljava/lang/Object;

    .line 858
    .line 859
    move-object/from16 v20, v1

    .line 860
    .line 861
    check-cast v20, La/l7k;

    .line 862
    .line 863
    iget-object v1, v5, La/h6i;->p:Ljava/lang/Object;

    .line 864
    .line 865
    move-object/from16 v21, v1

    .line 866
    .line 867
    check-cast v21, La/cmt;

    .line 868
    .line 869
    move v5, v0

    .line 870
    invoke-direct/range {v2 .. v21}, La/gob;-><init>(La/bm5;ZZZLa/khf0;La/trm0;La/bsu;La/ahu;La/urt;La/v88;La/ih5;La/zg;La/eqx;La/mne;La/g2v;La/wxs0;La/i1w0;La/l7k;La/cmt;)V

    .line 871
    .line 872
    .line 873
    return-object v2

    .line 874
    :pswitch_11
    move-object v0, v5

    .line 875
    new-instance v3, La/ajb;

    .line 876
    .line 877
    move-object v5, v0

    .line 878
    check-cast v5, La/h6i;

    .line 879
    .line 880
    iget-object v0, v5, La/h6i;->d:Ljava/lang/Object;

    .line 881
    .line 882
    move-object v4, v0

    .line 883
    check-cast v4, La/i1w0;

    .line 884
    .line 885
    iget-object v0, v5, La/h6i;->f:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v0, La/g2v;

    .line 888
    .line 889
    iget-object v1, v5, La/h6i;->e:Ljava/lang/Object;

    .line 890
    .line 891
    move-object v6, v1

    .line 892
    check-cast v6, La/m1e;

    .line 893
    .line 894
    iget-object v1, v5, La/h6i;->b:Ljava/lang/Object;

    .line 895
    .line 896
    move-object v7, v1

    .line 897
    check-cast v7, La/mne;

    .line 898
    .line 899
    iget-object v1, v5, La/h6i;->g:Ljava/lang/Object;

    .line 900
    .line 901
    move-object v8, v1

    .line 902
    check-cast v8, La/duj;

    .line 903
    .line 904
    iget-object v1, v5, La/h6i;->h:Ljava/lang/Object;

    .line 905
    .line 906
    move-object v9, v1

    .line 907
    check-cast v9, La/j1q0;

    .line 908
    .line 909
    iget-object v1, v5, La/h6i;->i:Ljava/lang/Object;

    .line 910
    .line 911
    move-object v10, v1

    .line 912
    check-cast v10, La/ntu;

    .line 913
    .line 914
    iget-object v1, v5, La/h6i;->j:Ljava/lang/Object;

    .line 915
    .line 916
    move-object v11, v1

    .line 917
    check-cast v11, La/n4u;

    .line 918
    .line 919
    iget-object v1, v5, La/h6i;->a:Ljava/lang/Object;

    .line 920
    .line 921
    move-object v12, v1

    .line 922
    check-cast v12, La/ctf0;

    .line 923
    .line 924
    iget-object v1, v5, La/h6i;->k:Ljava/lang/Object;

    .line 925
    .line 926
    move-object v13, v1

    .line 927
    check-cast v13, La/wgu;

    .line 928
    .line 929
    iget-object v1, v5, La/h6i;->l:Ljava/lang/Object;

    .line 930
    .line 931
    move-object v14, v1

    .line 932
    check-cast v14, La/hru;

    .line 933
    .line 934
    iget-object v1, v5, La/h6i;->m:Ljava/lang/Object;

    .line 935
    .line 936
    move-object v15, v1

    .line 937
    check-cast v15, La/iqt;

    .line 938
    .line 939
    iget-object v1, v5, La/h6i;->n:Ljava/lang/Object;

    .line 940
    .line 941
    move-object/from16 v16, v1

    .line 942
    .line 943
    check-cast v16, La/jqt;

    .line 944
    .line 945
    iget-object v1, v5, La/h6i;->o:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v1, La/wsf0;

    .line 948
    .line 949
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v2, La/g45;

    .line 952
    .line 953
    invoke-virtual {v2}, La/g45;->y()La/ahu;

    .line 954
    .line 955
    .line 956
    move-result-object v17

    .line 957
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v1, La/g45;

    .line 960
    .line 961
    invoke-virtual {v1}, La/g45;->x()La/phf0;

    .line 962
    .line 963
    .line 964
    move-result-object v18

    .line 965
    iget-object v1, v5, La/h6i;->p:Ljava/lang/Object;

    .line 966
    .line 967
    move-object/from16 v19, v1

    .line 968
    .line 969
    check-cast v19, La/pru;

    .line 970
    .line 971
    move-object v5, v0

    .line 972
    invoke-direct/range {v3 .. v19}, La/ajb;-><init>(La/i1w0;La/g2v;La/m1e;La/mne;La/duj;La/j1q0;La/ntu;La/n4u;La/ctf0;La/wgu;La/hru;La/iqt;La/jqt;La/ahu;La/phf0;La/pru;)V

    .line 973
    .line 974
    .line 975
    return-object v3

    .line 976
    :pswitch_12
    move-object v0, v5

    .line 977
    new-instance v4, La/ybm0;

    .line 978
    .line 979
    move-object v5, v0

    .line 980
    check-cast v5, La/gbi;

    .line 981
    .line 982
    iget-object v0, v5, La/gbi;->a:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v0, La/i1w0;

    .line 985
    .line 986
    new-instance v6, La/bwl;

    .line 987
    .line 988
    new-instance v1, La/lhf0;

    .line 989
    .line 990
    iget-object v2, v5, La/gbi;->b:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v2, La/cad;

    .line 993
    .line 994
    iget-object v3, v2, La/cad;->b:Ljava/lang/Object;

    .line 995
    .line 996
    check-cast v3, La/psc;

    .line 997
    .line 998
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    new-instance v7, La/chf0;

    .line 1006
    .line 1007
    iget-object v8, v5, La/gbi;->c:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast v8, La/gii0;

    .line 1010
    .line 1011
    const/16 v9, 0x11

    .line 1012
    .line 1013
    invoke-direct {v7, v8, v9}, La/chf0;-><init>(La/gii0;B)V

    .line 1014
    .line 1015
    .line 1016
    iget-object v8, v5, La/gbi;->d:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v8, La/knf0;

    .line 1019
    .line 1020
    invoke-direct {v1, v3, v7, v8}, La/lhf0;-><init>(La/mne;La/chf0;La/knf0;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-direct {v6, v1}, La/bwl;-><init>(Ljava/lang/Object;)V

    .line 1024
    .line 1025
    .line 1026
    iget-object v1, v5, La/gbi;->e:Ljava/lang/Object;

    .line 1027
    .line 1028
    move-object v7, v1

    .line 1029
    check-cast v7, Ljava/lang/String;

    .line 1030
    .line 1031
    iget-object v1, v5, La/gbi;->f:Ljava/lang/Object;

    .line 1032
    .line 1033
    check-cast v1, Ljava/lang/Long;

    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v8

    .line 1039
    iget-object v1, v5, La/gbi;->g:Ljava/lang/Object;

    .line 1040
    .line 1041
    move-object v10, v1

    .line 1042
    check-cast v10, La/duj;

    .line 1043
    .line 1044
    iget-object v1, v5, La/gbi;->h:Ljava/lang/Object;

    .line 1045
    .line 1046
    move-object v11, v1

    .line 1047
    check-cast v11, La/u58;

    .line 1048
    .line 1049
    iget-object v1, v5, La/gbi;->i:Ljava/lang/Object;

    .line 1050
    .line 1051
    move-object v12, v1

    .line 1052
    check-cast v12, La/ocl;

    .line 1053
    .line 1054
    iget-object v1, v5, La/gbi;->j:Ljava/lang/Object;

    .line 1055
    .line 1056
    move-object v13, v1

    .line 1057
    check-cast v13, La/nai;

    .line 1058
    .line 1059
    iget-object v1, v5, La/gbi;->k:Ljava/lang/Object;

    .line 1060
    .line 1061
    move-object v14, v1

    .line 1062
    check-cast v14, La/svs0;

    .line 1063
    .line 1064
    iget-object v1, v5, La/gbi;->l:Ljava/lang/Object;

    .line 1065
    .line 1066
    move-object v15, v1

    .line 1067
    check-cast v15, La/kl5;

    .line 1068
    .line 1069
    iget-object v1, v5, La/gbi;->m:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v1, La/pmi0;

    .line 1072
    .line 1073
    iget-object v3, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v3, La/daf;

    .line 1076
    .line 1077
    invoke-virtual {v3}, La/daf;->r()La/fhj;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v16

    .line 1081
    iget-object v3, v5, La/gbi;->n:Ljava/lang/Object;

    .line 1082
    .line 1083
    move-object/from16 v17, v3

    .line 1084
    .line 1085
    check-cast v17, La/uyu;

    .line 1086
    .line 1087
    iget-object v3, v5, La/gbi;->o:Ljava/lang/Object;

    .line 1088
    .line 1089
    move-object/from16 v18, v3

    .line 1090
    .line 1091
    check-cast v18, La/wyu;

    .line 1092
    .line 1093
    iget-object v3, v5, La/gbi;->p:Ljava/lang/Object;

    .line 1094
    .line 1095
    move-object/from16 v19, v3

    .line 1096
    .line 1097
    check-cast v19, La/m1e;

    .line 1098
    .line 1099
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v2, La/psc;

    .line 1102
    .line 1103
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v20

    .line 1107
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1108
    .line 1109
    .line 1110
    new-instance v2, La/qzt;

    .line 1111
    .line 1112
    iget-object v3, v5, La/gbi;->q:Ljava/lang/Object;

    .line 1113
    .line 1114
    check-cast v3, La/pru;

    .line 1115
    .line 1116
    move-object/from16 p0, v0

    .line 1117
    .line 1118
    const/4 v0, 0x0

    .line 1119
    invoke-direct {v2, v3, v0}, La/qzt;-><init>(La/pru;B)V

    .line 1120
    .line 1121
    .line 1122
    iget-object v0, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v0, La/daf;

    .line 1125
    .line 1126
    invoke-virtual {v0}, La/daf;->x()La/r2u;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v22

    .line 1130
    iget-object v0, v5, La/gbi;->r:Ljava/lang/Object;

    .line 1131
    .line 1132
    move-object/from16 v23, v0

    .line 1133
    .line 1134
    check-cast v23, La/r9u;

    .line 1135
    .line 1136
    move-object/from16 v5, p0

    .line 1137
    .line 1138
    move-object/from16 v21, v2

    .line 1139
    .line 1140
    invoke-direct/range {v4 .. v23}, La/ybm0;-><init>(La/i1w0;La/bwl;Ljava/lang/String;JLa/duj;La/u58;La/ocl;La/nai;La/svs0;La/kl5;La/fhj;La/uyu;La/wyu;La/m1e;La/mne;La/qzt;La/r2u;La/r9u;)V

    .line 1141
    .line 1142
    .line 1143
    return-object v4

    .line 1144
    :pswitch_13
    new-instance v1, La/bci;

    .line 1145
    .line 1146
    invoke-direct {v1, v0}, La/bci;-><init>(La/pai;)V

    .line 1147
    .line 1148
    .line 1149
    return-object v1

    .line 1150
    :pswitch_14
    move-object v0, v5

    .line 1151
    new-instance v1, La/g1i0;

    .line 1152
    .line 1153
    move-object v5, v0

    .line 1154
    check-cast v5, La/cr;

    .line 1155
    .line 1156
    iget-object v0, v5, La/cr;->c:Ljava/lang/Object;

    .line 1157
    .line 1158
    move-object v3, v0

    .line 1159
    check-cast v3, La/oeg0;

    .line 1160
    .line 1161
    iget-object v0, v5, La/cr;->d:Ljava/lang/Object;

    .line 1162
    .line 1163
    move-object v4, v0

    .line 1164
    check-cast v4, La/duj;

    .line 1165
    .line 1166
    iget-object v0, v5, La/cr;->e:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v0, La/gle0;

    .line 1169
    .line 1170
    iget-object v6, v5, La/cr;->f:Ljava/lang/Object;

    .line 1171
    .line 1172
    check-cast v6, La/cad;

    .line 1173
    .line 1174
    iget-object v6, v6, La/cad;->b:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v6, La/psc;

    .line 1177
    .line 1178
    invoke-virtual {v6}, La/psc;->h()La/mne;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v6

    .line 1182
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1183
    .line 1184
    .line 1185
    iget-object v7, v5, La/cr;->g:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v7, La/ctf0;

    .line 1188
    .line 1189
    iget-object v8, v5, La/cr;->h:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v8, La/m1e;

    .line 1192
    .line 1193
    iget-object v9, v5, La/cr;->i:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v9, La/ort;

    .line 1196
    .line 1197
    iget-object v10, v5, La/cr;->j:Ljava/lang/Object;

    .line 1198
    .line 1199
    check-cast v10, La/cyh;

    .line 1200
    .line 1201
    iget-object v11, v5, La/cr;->k:Ljava/lang/Object;

    .line 1202
    .line 1203
    check-cast v11, La/z4w0;

    .line 1204
    .line 1205
    iget-object v12, v5, La/cr;->l:Ljava/lang/Object;

    .line 1206
    .line 1207
    check-cast v12, La/rou;

    .line 1208
    .line 1209
    iget-object v13, v5, La/cr;->b:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v13, La/pru;

    .line 1212
    .line 1213
    iget-object v14, v5, La/cr;->m:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v14, La/onv;

    .line 1216
    .line 1217
    iget-object v14, v14, La/onv;->a:Ljava/lang/Object;

    .line 1218
    .line 1219
    check-cast v14, La/pmi;

    .line 1220
    .line 1221
    move-object v15, v14

    .line 1222
    new-instance v14, La/ftb;

    .line 1223
    .line 1224
    invoke-virtual {v15}, La/pmi;->i()La/khf0;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v15

    .line 1228
    invoke-direct {v14, v15}, La/ftb;-><init>(La/khf0;)V

    .line 1229
    .line 1230
    .line 1231
    new-instance v15, La/rou;

    .line 1232
    .line 1233
    move-object/from16 p0, v0

    .line 1234
    .line 1235
    iget-object v0, v5, La/cr;->n:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v0, La/b3c0;

    .line 1238
    .line 1239
    invoke-direct {v15, v0, v2}, La/rou;-><init>(La/b3c0;B)V

    .line 1240
    .line 1241
    .line 1242
    iget-object v0, v5, La/cr;->o:Ljava/lang/Object;

    .line 1243
    .line 1244
    move-object/from16 v16, v0

    .line 1245
    .line 1246
    check-cast v16, La/b4j;

    .line 1247
    .line 1248
    iget-object v0, v5, La/cr;->p:Ljava/lang/Object;

    .line 1249
    .line 1250
    move-object/from16 v17, v0

    .line 1251
    .line 1252
    check-cast v17, La/x20;

    .line 1253
    .line 1254
    iget-object v0, v5, La/cr;->q:Ljava/lang/Object;

    .line 1255
    .line 1256
    move-object/from16 v18, v0

    .line 1257
    .line 1258
    check-cast v18, La/bzt;

    .line 1259
    .line 1260
    move-object/from16 v5, p0

    .line 1261
    .line 1262
    move-object v2, v1

    .line 1263
    invoke-direct/range {v2 .. v18}, La/g1i0;-><init>(La/oeg0;La/duj;La/gle0;La/mne;La/ctf0;La/m1e;La/ort;La/cyh;La/z4w0;La/rou;La/pru;La/ftb;La/rou;La/b4j;La/x20;La/bzt;)V

    .line 1264
    .line 1265
    .line 1266
    return-object v2

    .line 1267
    :pswitch_15
    new-instance v1, La/qbi;

    .line 1268
    .line 1269
    invoke-direct {v1, v0}, La/qbi;-><init>(La/pai;)V

    .line 1270
    .line 1271
    .line 1272
    return-object v1

    .line 1273
    :pswitch_16
    move-object v0, v5

    .line 1274
    move-object v5, v0

    .line 1275
    check-cast v5, La/gr00;

    .line 1276
    .line 1277
    iget-object v0, v5, La/gr00;->a:Ljava/lang/Object;

    .line 1278
    .line 1279
    check-cast v0, La/q7d0;

    .line 1280
    .line 1281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    new-instance v1, La/mta;

    .line 1285
    .line 1286
    invoke-direct {v1, v0}, La/mta;-><init>(La/q7d0;)V

    .line 1287
    .line 1288
    .line 1289
    return-object v1

    .line 1290
    :pswitch_17
    new-instance v1, La/fbi;

    .line 1291
    .line 1292
    invoke-direct {v1, v0}, La/fbi;-><init>(La/pai;)V

    .line 1293
    .line 1294
    .line 1295
    return-object v1

    .line 1296
    :pswitch_18
    move-object v0, v5

    .line 1297
    new-instance v2, La/gu9;

    .line 1298
    .line 1299
    move-object v5, v0

    .line 1300
    check-cast v5, La/esg0;

    .line 1301
    .line 1302
    iget-object v0, v5, La/esg0;->a:Ljava/lang/Object;

    .line 1303
    .line 1304
    move-object v3, v0

    .line 1305
    check-cast v3, La/ctf0;

    .line 1306
    .line 1307
    new-instance v4, La/lef0;

    .line 1308
    .line 1309
    new-instance v0, La/yzn0;

    .line 1310
    .line 1311
    new-instance v1, La/r7v;

    .line 1312
    .line 1313
    iget-object v6, v5, La/esg0;->b:Ljava/lang/Object;

    .line 1314
    .line 1315
    check-cast v6, La/gii0;

    .line 1316
    .line 1317
    const/16 v7, 0x12

    .line 1318
    .line 1319
    invoke-direct {v1, v6, v7}, La/r7v;-><init>(La/gii0;B)V

    .line 1320
    .line 1321
    .line 1322
    iget-object v6, v5, La/esg0;->c:Ljava/lang/Object;

    .line 1323
    .line 1324
    check-cast v6, La/btt0;

    .line 1325
    .line 1326
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1330
    .line 1331
    .line 1332
    iput-object v1, v0, La/yzn0;->a:Ljava/lang/Object;

    .line 1333
    .line 1334
    iput-object v6, v0, La/yzn0;->b:Ljava/lang/Object;

    .line 1335
    .line 1336
    invoke-direct {v4, v0}, La/lef0;-><init>(Ljava/lang/Object;)V

    .line 1337
    .line 1338
    .line 1339
    iget-object v0, v5, La/esg0;->d:Ljava/lang/Object;

    .line 1340
    .line 1341
    check-cast v0, Ljava/lang/Long;

    .line 1342
    .line 1343
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v0

    .line 1347
    iget-object v5, v5, La/esg0;->e:Ljava/lang/Object;

    .line 1348
    .line 1349
    move-object v7, v5

    .line 1350
    check-cast v7, La/mne;

    .line 1351
    .line 1352
    move-wide v5, v0

    .line 1353
    invoke-direct/range {v2 .. v7}, La/gu9;-><init>(La/ctf0;La/lef0;JLa/mne;)V

    .line 1354
    .line 1355
    .line 1356
    return-object v2

    .line 1357
    :pswitch_19
    new-instance v1, La/xai;

    .line 1358
    .line 1359
    invoke-direct {v1, v0}, La/xai;-><init>(La/pai;)V

    .line 1360
    .line 1361
    .line 1362
    return-object v1

    .line 1363
    :pswitch_1a
    move-object v0, v5

    .line 1364
    new-instance v2, La/ab9;

    .line 1365
    .line 1366
    move-object v5, v0

    .line 1367
    check-cast v5, La/g45;

    .line 1368
    .line 1369
    iget-object v0, v5, La/g45;->a:Ljava/lang/Object;

    .line 1370
    .line 1371
    check-cast v0, La/cad;

    .line 1372
    .line 1373
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v0, La/psc;

    .line 1376
    .line 1377
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1382
    .line 1383
    .line 1384
    iget-object v1, v5, La/g45;->b:Ljava/lang/Object;

    .line 1385
    .line 1386
    move-object v4, v1

    .line 1387
    check-cast v4, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;

    .line 1388
    .line 1389
    iget-object v1, v5, La/g45;->c:Ljava/lang/Object;

    .line 1390
    .line 1391
    check-cast v1, La/ctf0;

    .line 1392
    .line 1393
    iget-object v6, v5, La/g45;->d:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v6, La/ocl;

    .line 1396
    .line 1397
    iget-object v7, v5, La/g45;->e:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v7, La/i1w0;

    .line 1400
    .line 1401
    iget-object v8, v5, La/g45;->f:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v8, La/pcl0;

    .line 1404
    .line 1405
    move-object v9, v8

    .line 1406
    invoke-interface {v9}, La/pcl0;->P()La/x4u;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v8

    .line 1410
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1411
    .line 1412
    .line 1413
    move-object v10, v9

    .line 1414
    new-instance v9, La/yfu;

    .line 1415
    .line 1416
    invoke-interface {v10}, La/pcl0;->p()La/kym0;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v10

    .line 1420
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1421
    .line 1422
    .line 1423
    invoke-direct {v9, v10}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    new-instance v10, La/reu;

    .line 1427
    .line 1428
    iget-object v11, v5, La/g45;->g:Ljava/lang/Object;

    .line 1429
    .line 1430
    check-cast v11, La/ioi;

    .line 1431
    .line 1432
    iget-object v12, v11, La/ioi;->e:La/n5d0;

    .line 1433
    .line 1434
    invoke-interface {v12}, La/o5d0;->get()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v12

    .line 1438
    check-cast v12, La/fga0;

    .line 1439
    .line 1440
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1441
    .line 1442
    .line 1443
    const/16 v13, 0x9

    .line 1444
    .line 1445
    invoke-direct {v10, v12, v13}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 1446
    .line 1447
    .line 1448
    move-object v12, v11

    .line 1449
    new-instance v11, La/d1u;

    .line 1450
    .line 1451
    invoke-virtual {v12}, La/ioi;->a()La/vdn;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v13

    .line 1455
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1456
    .line 1457
    .line 1458
    invoke-direct {v11, v13}, La/d1u;-><init>(La/vdn;)V

    .line 1459
    .line 1460
    .line 1461
    move-object v13, v12

    .line 1462
    new-instance v12, La/d1u;

    .line 1463
    .line 1464
    invoke-virtual {v13}, La/ioi;->a()La/vdn;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v14

    .line 1468
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-direct {v12, v14}, La/d1u;-><init>(La/vdn;)V

    .line 1472
    .line 1473
    .line 1474
    move-object v14, v13

    .line 1475
    new-instance v13, La/roi0;

    .line 1476
    .line 1477
    invoke-virtual {v14}, La/ioi;->b()La/ien;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v15

    .line 1481
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1482
    .line 1483
    .line 1484
    invoke-direct {v13, v15}, La/roi0;-><init>(Ljava/lang/Object;)V

    .line 1485
    .line 1486
    .line 1487
    move-object v15, v14

    .line 1488
    new-instance v14, La/hbu;

    .line 1489
    .line 1490
    invoke-virtual {v15}, La/ioi;->b()La/ien;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v3

    .line 1494
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1495
    .line 1496
    .line 1497
    invoke-direct {v14, v3}, La/hbu;-><init>(La/ien;)V

    .line 1498
    .line 1499
    .line 1500
    move-object v3, v15

    .line 1501
    new-instance v15, La/reu;

    .line 1502
    .line 1503
    move-object/from16 p0, v0

    .line 1504
    .line 1505
    invoke-virtual {v3}, La/ioi;->b()La/ien;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1510
    .line 1511
    .line 1512
    move-object/from16 v17, v1

    .line 1513
    .line 1514
    const/16 v1, 0xf

    .line 1515
    .line 1516
    invoke-direct {v15, v0, v1}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 1517
    .line 1518
    .line 1519
    new-instance v0, La/ibu;

    .line 1520
    .line 1521
    invoke-virtual {v3}, La/ioi;->b()La/ien;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v1

    .line 1525
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1526
    .line 1527
    .line 1528
    invoke-direct {v0, v1}, La/ibu;-><init>(La/ien;)V

    .line 1529
    .line 1530
    .line 1531
    new-instance v1, La/r7v;

    .line 1532
    .line 1533
    invoke-virtual {v3}, La/ioi;->b()La/ien;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v3

    .line 1537
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1538
    .line 1539
    .line 1540
    invoke-direct {v1, v3}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 1541
    .line 1542
    .line 1543
    iget-object v3, v5, La/g45;->h:Ljava/lang/Object;

    .line 1544
    .line 1545
    move-object/from16 v18, v3

    .line 1546
    .line 1547
    check-cast v18, La/rl70;

    .line 1548
    .line 1549
    move-object/from16 v3, p0

    .line 1550
    .line 1551
    move-object/from16 v16, v0

    .line 1552
    .line 1553
    move-object/from16 v5, v17

    .line 1554
    .line 1555
    move-object/from16 v17, v1

    .line 1556
    .line 1557
    invoke-direct/range {v2 .. v18}, La/ab9;-><init>(La/mne;Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;La/ctf0;La/ocl;La/i1w0;La/x4u;La/yfu;La/reu;La/d1u;La/d1u;La/roi0;La/hbu;La/reu;La/ibu;La/r7v;La/rl70;)V

    .line 1558
    .line 1559
    .line 1560
    return-object v2

    .line 1561
    :pswitch_1b
    new-instance v1, La/sai;

    .line 1562
    .line 1563
    invoke-direct {v1, v0}, La/sai;-><init>(La/pai;)V

    .line 1564
    .line 1565
    .line 1566
    return-object v1

    .line 1567
    :pswitch_1c
    move-object v0, v5

    .line 1568
    new-instance v1, La/fz8;

    .line 1569
    .line 1570
    move-object v5, v0

    .line 1571
    check-cast v5, La/gr00;

    .line 1572
    .line 1573
    iget-object v0, v5, La/gr00;->a:Ljava/lang/Object;

    .line 1574
    .line 1575
    check-cast v0, Ljava/lang/String;

    .line 1576
    .line 1577
    iget-object v2, v5, La/gr00;->b:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v2, Ljava/lang/String;

    .line 1580
    .line 1581
    iget-object v3, v5, La/gr00;->c:Ljava/lang/Object;

    .line 1582
    .line 1583
    check-cast v3, La/ctf0;

    .line 1584
    .line 1585
    iget-object v5, v5, La/gr00;->d:Ljava/lang/Object;

    .line 1586
    .line 1587
    check-cast v5, La/cad;

    .line 1588
    .line 1589
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 1590
    .line 1591
    check-cast v5, La/psc;

    .line 1592
    .line 1593
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v5

    .line 1597
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    iget-object v6, v5, La/mne;->c:La/vs10;

    .line 1604
    .line 1605
    iget-object v5, v5, La/mne;->a:La/rwj;

    .line 1606
    .line 1607
    invoke-static {v6, v5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    new-instance v6, La/gj4;

    .line 1612
    .line 1613
    invoke-direct {v6, v0, v2, v4}, La/gj4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1614
    .line 1615
    .line 1616
    new-instance v0, La/ep4;

    .line 1617
    .line 1618
    const/16 v2, 0x8

    .line 1619
    .line 1620
    invoke-direct {v0, v3, v2}, La/ep4;-><init>(La/ctf0;B)V

    .line 1621
    .line 1622
    .line 1623
    const/4 v2, 0x0

    .line 1624
    invoke-direct {v1, v6, v5, v0, v2}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 1625
    .line 1626
    .line 1627
    return-object v1

    .line 1628
    nop

    .line 1629
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
