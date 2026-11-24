.class public final synthetic La/bgc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/igc0;


# direct methods
.method public synthetic constructor <init>(La/igc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bgc0;->a:B

    iput-object p1, p0, La/bgc0;->b:La/igc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bgc0;->a:B

    .line 4
    .line 5
    const-string v2, "Cannot create dependency "

    .line 6
    .line 7
    iget-object v0, v0, La/bgc0;->b:La/igc0;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/igc0;->V1:La/fl70;

    .line 14
    .line 15
    new-instance v1, La/q0h0;

    .line 16
    .line 17
    iget-object v0, v0, La/igc0;->P1:La/a8z;

    .line 18
    .line 19
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/upi;

    .line 24
    .line 25
    iget-object v0, v0, La/upi;->l:La/n5d0;

    .line 26
    .line 27
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/tpi;

    .line 32
    .line 33
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    sget-object v1, La/igc0;->V1:La/fl70;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    instance-of v4, v1, La/af3;

    .line 51
    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    check-cast v1, La/af3;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v1, v3

    .line 58
    :goto_0
    const-class v4, La/xdc0;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, La/o5d0;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, La/ze3;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v1, v3

    .line 82
    :goto_1
    instance-of v5, v1, La/xdc0;

    .line 83
    .line 84
    if-nez v5, :cond_2

    .line 85
    .line 86
    move-object v1, v3

    .line 87
    :cond_2
    check-cast v1, La/xdc0;

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v9, v1, La/xdc0;->p:La/ntu;

    .line 99
    .line 100
    iget-object v10, v1, La/xdc0;->o:La/gii0;

    .line 101
    .line 102
    iget-object v11, v1, La/xdc0;->n:La/knf0;

    .line 103
    .line 104
    iget-object v12, v1, La/xdc0;->l:La/btt0;

    .line 105
    .line 106
    iget-object v13, v1, La/xdc0;->k:La/gst0;

    .line 107
    .line 108
    iget-object v14, v1, La/xdc0;->j:La/xyt;

    .line 109
    .line 110
    iget-object v0, v1, La/xdc0;->i:La/ii;

    .line 111
    .line 112
    iget-object v2, v1, La/xdc0;->a:La/m1e;

    .line 113
    .line 114
    iget-object v3, v1, La/xdc0;->b:La/ctf0;

    .line 115
    .line 116
    iget-object v8, v1, La/xdc0;->m:La/wsf0;

    .line 117
    .line 118
    iget-object v4, v1, La/xdc0;->c:La/pru;

    .line 119
    .line 120
    iget-object v5, v1, La/xdc0;->d:La/b4j;

    .line 121
    .line 122
    iget-object v6, v1, La/xdc0;->e:La/x20;

    .line 123
    .line 124
    iget-object v7, v1, La/xdc0;->f:La/g2v;

    .line 125
    .line 126
    move-object/from16 v16, v0

    .line 127
    .line 128
    iget-object v0, v1, La/xdc0;->g:La/duj;

    .line 129
    .line 130
    move-object/from16 v21, v7

    .line 131
    .line 132
    iget-object v7, v1, La/xdc0;->h:La/cad;

    .line 133
    .line 134
    move-object/from16 v22, v0

    .line 135
    .line 136
    iget-object v0, v1, La/xdc0;->q:La/wdk0;

    .line 137
    .line 138
    move-object/from16 v17, v0

    .line 139
    .line 140
    iget-object v0, v1, La/xdc0;->r:La/rou;

    .line 141
    .line 142
    move-object/from16 v23, v0

    .line 143
    .line 144
    iget-object v0, v1, La/xdc0;->s:La/cdu;

    .line 145
    .line 146
    iget-object v1, v1, La/xdc0;->t:La/fhj;

    .line 147
    .line 148
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-object/from16 v19, v5

    .line 173
    .line 174
    new-instance v5, La/spi;

    .line 175
    .line 176
    move-object/from16 v20, v6

    .line 177
    .line 178
    new-instance v6, La/std;

    .line 179
    .line 180
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    move-object/from16 v24, v0

    .line 184
    .line 185
    move-object/from16 v25, v1

    .line 186
    .line 187
    move-object/from16 v16, v2

    .line 188
    .line 189
    move-object/from16 v17, v3

    .line 190
    .line 191
    move-object/from16 v18, v4

    .line 192
    .line 193
    invoke-direct/range {v5 .. v25}, La/spi;-><init>(La/std;La/cad;La/wsf0;La/ntu;La/gii0;La/knf0;La/btt0;La/gst0;La/xyt;La/i1w0;La/m1e;La/ctf0;La/pru;La/b4j;La/x20;La/g2v;La/duj;La/rou;La/cdu;La/fhj;)V

    .line 194
    .line 195
    .line 196
    move-object v3, v5

    .line 197
    goto :goto_2

    .line 198
    :cond_3
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_2
    return-object v3

    .line 206
    :pswitch_1
    sget-object v1, La/igc0;->V1:La/fl70;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    instance-of v1, v0, La/af3;

    .line 220
    .line 221
    if-eqz v1, :cond_4

    .line 222
    .line 223
    check-cast v0, La/af3;

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    move-object v0, v3

    .line 227
    :goto_3
    const-class v1, La/eqc0;

    .line 228
    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, La/o5d0;

    .line 240
    .line 241
    if-eqz v0, :cond_5

    .line 242
    .line 243
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, La/ze3;

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_5
    move-object v0, v3

    .line 251
    :goto_4
    instance-of v4, v0, La/eqc0;

    .line 252
    .line 253
    if-nez v4, :cond_6

    .line 254
    .line 255
    move-object v0, v3

    .line 256
    :cond_6
    check-cast v0, La/eqc0;

    .line 257
    .line 258
    if-eqz v0, :cond_7

    .line 259
    .line 260
    iget-object v8, v0, La/eqc0;->q:La/ntu;

    .line 261
    .line 262
    iget-object v9, v0, La/eqc0;->p:La/gii0;

    .line 263
    .line 264
    iget-object v10, v0, La/eqc0;->o:La/knf0;

    .line 265
    .line 266
    iget-object v11, v0, La/eqc0;->m:La/btt0;

    .line 267
    .line 268
    iget-object v12, v0, La/eqc0;->k:La/gst0;

    .line 269
    .line 270
    iget-object v13, v0, La/eqc0;->j:La/xyt;

    .line 271
    .line 272
    iget-object v14, v0, La/eqc0;->a:La/ctf0;

    .line 273
    .line 274
    iget-object v15, v0, La/eqc0;->b:La/m1e;

    .line 275
    .line 276
    iget-object v1, v0, La/eqc0;->n:La/ii;

    .line 277
    .line 278
    iget-object v2, v0, La/eqc0;->c:La/pru;

    .line 279
    .line 280
    iget-object v7, v0, La/eqc0;->l:La/wsf0;

    .line 281
    .line 282
    iget-object v3, v0, La/eqc0;->d:La/b4j;

    .line 283
    .line 284
    iget-object v4, v0, La/eqc0;->e:La/x20;

    .line 285
    .line 286
    iget-object v5, v0, La/eqc0;->f:La/g2v;

    .line 287
    .line 288
    iget-object v6, v0, La/eqc0;->g:La/oeg0;

    .line 289
    .line 290
    move-object/from16 v16, v1

    .line 291
    .line 292
    iget-object v1, v0, La/eqc0;->h:La/duj;

    .line 293
    .line 294
    move-object/from16 v20, v6

    .line 295
    .line 296
    iget-object v6, v0, La/eqc0;->i:La/cad;

    .line 297
    .line 298
    move-object/from16 v21, v1

    .line 299
    .line 300
    iget-object v1, v0, La/eqc0;->r:La/wdk0;

    .line 301
    .line 302
    move-object/from16 v17, v1

    .line 303
    .line 304
    iget-object v1, v0, La/eqc0;->s:La/rou;

    .line 305
    .line 306
    move-object/from16 v22, v1

    .line 307
    .line 308
    iget-object v1, v0, La/eqc0;->t:La/cdu;

    .line 309
    .line 310
    iget-object v0, v0, La/eqc0;->u:La/fhj;

    .line 311
    .line 312
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-object/from16 v18, v4

    .line 340
    .line 341
    new-instance v4, La/eqi;

    .line 342
    .line 343
    move-object/from16 v19, v5

    .line 344
    .line 345
    new-instance v5, La/std;

    .line 346
    .line 347
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 348
    .line 349
    .line 350
    move-object/from16 v24, v0

    .line 351
    .line 352
    move-object/from16 v23, v1

    .line 353
    .line 354
    move-object/from16 v16, v2

    .line 355
    .line 356
    move-object/from16 v17, v3

    .line 357
    .line 358
    invoke-direct/range {v4 .. v24}, La/eqi;-><init>(La/std;La/cad;La/wsf0;La/ntu;La/gii0;La/knf0;La/btt0;La/gst0;La/xyt;La/ctf0;La/m1e;La/pru;La/b4j;La/x20;La/g2v;La/oeg0;La/duj;La/rou;La/cdu;La/fhj;)V

    .line 359
    .line 360
    .line 361
    move-object v3, v4

    .line 362
    goto :goto_5

    .line 363
    :cond_7
    invoke-static {v1, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    :goto_5
    return-object v3

    .line 371
    :pswitch_2
    iget-object v1, v0, La/igc0;->M1:La/cgx0;

    .line 372
    .line 373
    sget-object v4, La/igc0;->W1:[La/iiy;

    .line 374
    .line 375
    const/4 v5, 0x0

    .line 376
    aget-object v4, v4, v5

    .line 377
    .line 378
    invoke-virtual {v1, v0, v4}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_8

    .line 387
    .line 388
    sget-object v1, La/vgc0;->d:La/vgc0;

    .line 389
    .line 390
    :goto_6
    move-object v13, v1

    .line 391
    goto :goto_7

    .line 392
    :cond_8
    sget-object v1, La/vgc0;->c:La/vgc0;

    .line 393
    .line 394
    goto :goto_6

    .line 395
    :goto_7
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    instance-of v1, v0, La/af3;

    .line 407
    .line 408
    if-eqz v1, :cond_9

    .line 409
    .line 410
    check-cast v0, La/af3;

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_9
    move-object v0, v3

    .line 414
    :goto_8
    const-class v1, La/zfc0;

    .line 415
    .line 416
    if-eqz v0, :cond_c

    .line 417
    .line 418
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, La/o5d0;

    .line 427
    .line 428
    if-eqz v0, :cond_a

    .line 429
    .line 430
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    check-cast v0, La/ze3;

    .line 435
    .line 436
    goto :goto_9

    .line 437
    :cond_a
    move-object v0, v3

    .line 438
    :goto_9
    instance-of v4, v0, La/zfc0;

    .line 439
    .line 440
    if-nez v4, :cond_b

    .line 441
    .line 442
    move-object v0, v3

    .line 443
    :cond_b
    check-cast v0, La/zfc0;

    .line 444
    .line 445
    if-eqz v0, :cond_c

    .line 446
    .line 447
    iget-object v5, v0, La/zfc0;->a:La/cad;

    .line 448
    .line 449
    iget-object v6, v0, La/zfc0;->b:La/wsf0;

    .line 450
    .line 451
    iget-object v7, v0, La/zfc0;->c:La/uf3;

    .line 452
    .line 453
    iget-object v8, v0, La/zfc0;->d:La/b4j;

    .line 454
    .line 455
    iget-object v10, v0, La/zfc0;->g:La/ii;

    .line 456
    .line 457
    iget-object v11, v0, La/zfc0;->h:La/wdk0;

    .line 458
    .line 459
    iget-object v9, v0, La/zfc0;->e:La/pru;

    .line 460
    .line 461
    iget-object v12, v0, La/zfc0;->f:La/oeg0;

    .line 462
    .line 463
    iget-object v14, v0, La/zfc0;->i:La/x20;

    .line 464
    .line 465
    iget-object v15, v0, La/zfc0;->j:La/ctf0;

    .line 466
    .line 467
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    new-instance v4, La/upi;

    .line 480
    .line 481
    invoke-direct/range {v4 .. v15}, La/upi;-><init>(La/cad;La/wsf0;La/uf3;La/b4j;La/pru;La/ii;La/wdk0;La/oeg0;La/vgc0;La/x20;La/ctf0;)V

    .line 482
    .line 483
    .line 484
    move-object v3, v4

    .line 485
    goto :goto_a

    .line 486
    :cond_c
    invoke-static {v1, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    :goto_a
    return-object v3

    .line 494
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
