.class public final La/yxi;
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
    iput-byte p2, p0, La/yxi;->a:B

    iput-object p1, p0, La/yxi;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yxi;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0x9

    .line 8
    .line 9
    const/16 v4, 0x12

    .line 10
    .line 11
    const/16 v5, 0xe

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x3

    .line 15
    iget-object v8, v0, La/yxi;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v9, La/h2v0;

    .line 21
    .line 22
    check-cast v8, La/izi;

    .line 23
    .line 24
    iget-object v14, v8, La/izi;->a:La/c2v0;

    .line 25
    .line 26
    iget-object v13, v8, La/izi;->b:La/g2v;

    .line 27
    .line 28
    iget-object v12, v8, La/izi;->c:La/pyu;

    .line 29
    .line 30
    iget-object v10, v8, La/izi;->d:La/mne;

    .line 31
    .line 32
    iget-object v11, v8, La/izi;->e:La/ntu;

    .line 33
    .line 34
    invoke-direct/range {v9 .. v14}, La/h2v0;-><init>(La/mne;La/ntu;La/pyu;La/g2v;La/c2v0;)V

    .line 35
    .line 36
    .line 37
    return-object v9

    .line 38
    :pswitch_0
    new-instance v1, La/hzi;

    .line 39
    .line 40
    invoke-direct {v1, v0}, La/hzi;-><init>(La/yxi;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :pswitch_1
    new-instance v2, La/u0v0;

    .line 45
    .line 46
    check-cast v8, La/v9i;

    .line 47
    .line 48
    iget-object v0, v8, La/v9i;->f:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    check-cast v3, La/wxs0;

    .line 52
    .line 53
    iget-object v0, v8, La/v9i;->g:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    check-cast v4, La/oct;

    .line 57
    .line 58
    iget-object v0, v8, La/v9i;->h:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v5, v0

    .line 61
    check-cast v5, La/peg0;

    .line 62
    .line 63
    iget-object v0, v8, La/v9i;->i:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v6, v0

    .line 66
    check-cast v6, La/zx10;

    .line 67
    .line 68
    iget-object v0, v8, La/v9i;->j:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v7, v0

    .line 71
    check-cast v7, La/zg;

    .line 72
    .line 73
    iget-object v0, v8, La/v9i;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/d1p;

    .line 76
    .line 77
    invoke-interface {v0}, La/d1p;->g0()La/je;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v9, v8, La/v9i;->b:La/m1e;

    .line 82
    .line 83
    iget-object v1, v8, La/v9i;->l:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v10, v1

    .line 86
    check-cast v10, La/g2v;

    .line 87
    .line 88
    iget-object v1, v8, La/v9i;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, La/cad;

    .line 91
    .line 92
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, La/psc;

    .line 95
    .line 96
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v8, La/v9i;->q:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v12, v1

    .line 106
    check-cast v12, La/i1w0;

    .line 107
    .line 108
    iget-object v1, v8, La/v9i;->r:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v13, v1

    .line 111
    check-cast v13, La/duj;

    .line 112
    .line 113
    iget-object v1, v8, La/v9i;->m:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v14, v1

    .line 116
    check-cast v14, La/dq00;

    .line 117
    .line 118
    iget-object v1, v8, La/v9i;->n:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v15, v1

    .line 121
    check-cast v15, La/cmt;

    .line 122
    .line 123
    iget-object v1, v8, La/v9i;->o:Ljava/lang/Object;

    .line 124
    .line 125
    move-object/from16 v16, v1

    .line 126
    .line 127
    check-cast v16, La/z220;

    .line 128
    .line 129
    iget-object v1, v8, La/v9i;->p:Ljava/lang/Object;

    .line 130
    .line 131
    move-object/from16 v17, v1

    .line 132
    .line 133
    check-cast v17, La/yqc;

    .line 134
    .line 135
    iget-object v1, v8, La/v9i;->s:Ljava/lang/Object;

    .line 136
    .line 137
    move-object/from16 v18, v1

    .line 138
    .line 139
    check-cast v18, La/psc;

    .line 140
    .line 141
    iget-object v1, v8, La/v9i;->t:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, La/wsf0;

    .line 144
    .line 145
    move-object/from16 p0, v0

    .line 146
    .line 147
    iget-object v0, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, La/g45;

    .line 150
    .line 151
    invoke-virtual {v0}, La/g45;->E()La/nou;

    .line 152
    .line 153
    .line 154
    move-result-object v19

    .line 155
    iget-object v0, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, La/g45;

    .line 158
    .line 159
    invoke-virtual {v0}, La/g45;->F()La/xru;

    .line 160
    .line 161
    .line 162
    move-result-object v20

    .line 163
    iget-object v0, v8, La/v9i;->d:Ljava/lang/Object;

    .line 164
    .line 165
    move-object/from16 v21, v0

    .line 166
    .line 167
    check-cast v21, La/peg0;

    .line 168
    .line 169
    invoke-virtual {v1}, La/wsf0;->b()La/ot;

    .line 170
    .line 171
    .line 172
    move-result-object v22

    .line 173
    invoke-virtual {v1}, La/wsf0;->q()La/jyg0;

    .line 174
    .line 175
    .line 176
    move-result-object v23

    .line 177
    iget-object v0, v8, La/v9i;->u:Ljava/lang/Object;

    .line 178
    .line 179
    move-object/from16 v24, v0

    .line 180
    .line 181
    check-cast v24, La/pru;

    .line 182
    .line 183
    iget-object v0, v8, La/v9i;->v:Ljava/lang/Object;

    .line 184
    .line 185
    move-object/from16 v25, v0

    .line 186
    .line 187
    check-cast v25, La/peu;

    .line 188
    .line 189
    iget-object v0, v8, La/v9i;->w:Ljava/lang/Object;

    .line 190
    .line 191
    move-object/from16 v26, v0

    .line 192
    .line 193
    check-cast v26, La/eqx;

    .line 194
    .line 195
    iget-object v0, v8, La/v9i;->e:La/ctf0;

    .line 196
    .line 197
    iget-object v1, v8, La/v9i;->x:Ljava/lang/Object;

    .line 198
    .line 199
    move-object/from16 v28, v1

    .line 200
    .line 201
    check-cast v28, Ljava/lang/String;

    .line 202
    .line 203
    move-object/from16 v8, p0

    .line 204
    .line 205
    move-object/from16 v27, v0

    .line 206
    .line 207
    invoke-direct/range {v2 .. v28}, La/u0v0;-><init>(La/wxs0;La/oct;La/peg0;La/zx10;La/zg;La/je;La/m1e;La/g2v;La/mne;La/i1w0;La/duj;La/dq00;La/cmt;La/z220;La/yqc;La/psc;La/nou;La/xru;La/peg0;La/ot;La/jyg0;La/pru;La/peu;La/eqx;La/ctf0;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-object v2

    .line 211
    :pswitch_2
    new-instance v1, La/gzi;

    .line 212
    .line 213
    invoke-direct {v1, v0}, La/gzi;-><init>(La/yxi;)V

    .line 214
    .line 215
    .line 216
    return-object v1

    .line 217
    :pswitch_3
    new-instance v0, La/vwu0;

    .line 218
    .line 219
    check-cast v8, La/ali;

    .line 220
    .line 221
    iget-object v1, v8, La/ali;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v1, La/duj;

    .line 224
    .line 225
    iget-object v2, v8, La/ali;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v2, La/cad;

    .line 228
    .line 229
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v2, La/psc;

    .line 232
    .line 233
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v3, v8, La/ali;->c:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v3, La/ctf0;

    .line 243
    .line 244
    invoke-direct {v0, v1, v2, v3}, La/vwu0;-><init>(La/duj;La/mne;La/ctf0;)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_4
    new-instance v0, La/ztu0;

    .line 249
    .line 250
    check-cast v8, La/ru;

    .line 251
    .line 252
    iget-object v1, v8, La/ru;->a:Ljava/lang/Object;

    .line 253
    .line 254
    move-object v5, v1

    .line 255
    check-cast v5, La/i1w0;

    .line 256
    .line 257
    iget-object v1, v8, La/ru;->b:Ljava/lang/Object;

    .line 258
    .line 259
    move-object v6, v1

    .line 260
    check-cast v6, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 261
    .line 262
    iget-object v1, v8, La/ru;->e:Ljava/lang/Object;

    .line 263
    .line 264
    move-object v7, v1

    .line 265
    check-cast v7, La/ctf0;

    .line 266
    .line 267
    iget-object v1, v8, La/ru;->h:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v1, La/m1e;

    .line 270
    .line 271
    iget-object v2, v8, La/ru;->c:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v2, La/cad;

    .line 274
    .line 275
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v2, La/psc;

    .line 278
    .line 279
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iget-object v2, v8, La/ru;->d:Ljava/lang/Object;

    .line 287
    .line 288
    move-object v10, v2

    .line 289
    check-cast v10, La/g2v;

    .line 290
    .line 291
    new-instance v11, La/bzu;

    .line 292
    .line 293
    new-instance v2, La/cmt0;

    .line 294
    .line 295
    iget-object v3, v8, La/ru;->f:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v3, La/vby;

    .line 298
    .line 299
    new-instance v12, La/drm0;

    .line 300
    .line 301
    iget-object v13, v8, La/ru;->g:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v13, La/gii0;

    .line 304
    .line 305
    invoke-direct {v12, v13, v4}, La/drm0;-><init>(La/gii0;B)V

    .line 306
    .line 307
    .line 308
    iget-object v4, v8, La/ru;->i:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v4, La/knf0;

    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 319
    .line 320
    .line 321
    iput-object v3, v2, La/cmt0;->a:Ljava/lang/Object;

    .line 322
    .line 323
    iput-object v12, v2, La/cmt0;->b:Ljava/lang/Object;

    .line 324
    .line 325
    iput-object v4, v2, La/cmt0;->c:Ljava/lang/Object;

    .line 326
    .line 327
    const/16 v3, 0x8

    .line 328
    .line 329
    invoke-direct {v11, v2, v3}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 330
    .line 331
    .line 332
    move-object v4, v0

    .line 333
    move-object v8, v1

    .line 334
    invoke-direct/range {v4 .. v11}, La/ztu0;-><init>(La/i1w0;Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;La/ctf0;La/m1e;La/mne;La/g2v;La/bzu;)V

    .line 335
    .line 336
    .line 337
    return-object v4

    .line 338
    :pswitch_5
    new-instance v5, La/esu0;

    .line 339
    .line 340
    check-cast v8, La/fzi;

    .line 341
    .line 342
    iget-object v0, v8, La/fzi;->b:Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

    .line 343
    .line 344
    iget-object v1, v8, La/fzi;->c:La/cad;

    .line 345
    .line 346
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v1, La/psc;

    .line 349
    .line 350
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    iget-object v1, v8, La/fzi;->a:La/g2v;

    .line 358
    .line 359
    iget-object v2, v8, La/fzi;->d:La/pyg;

    .line 360
    .line 361
    invoke-interface {v2}, La/pyg;->a()La/hzg;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    new-instance v10, La/r2u;

    .line 369
    .line 370
    iget-object v2, v8, La/fzi;->e:La/sjl0;

    .line 371
    .line 372
    invoke-direct {v10, v2, v6}, La/r2u;-><init>(La/sjl0;B)V

    .line 373
    .line 374
    .line 375
    iget-object v11, v8, La/fzi;->f:La/duj;

    .line 376
    .line 377
    iget-object v12, v8, La/fzi;->g:La/ih5;

    .line 378
    .line 379
    iget-object v13, v8, La/fzi;->h:La/zr1;

    .line 380
    .line 381
    iget-object v2, v8, La/fzi;->i:La/xri;

    .line 382
    .line 383
    invoke-virtual {v2}, La/xri;->a()La/svu;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    move-object v6, v0

    .line 391
    move-object v8, v1

    .line 392
    invoke-direct/range {v5 .. v14}, La/esu0;-><init>(Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;La/mne;La/g2v;La/hzg;La/r2u;La/duj;La/ih5;La/zr1;La/svu;)V

    .line 393
    .line 394
    .line 395
    return-object v5

    .line 396
    :pswitch_6
    new-instance v1, La/dzi;

    .line 397
    .line 398
    invoke-direct {v1, v0}, La/dzi;-><init>(La/yxi;)V

    .line 399
    .line 400
    .line 401
    return-object v1

    .line 402
    :pswitch_7
    new-instance v2, La/oou0;

    .line 403
    .line 404
    check-cast v8, La/czi;

    .line 405
    .line 406
    iget-object v0, v8, La/czi;->a:La/pyg;

    .line 407
    .line 408
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    iget-object v4, v8, La/czi;->b:La/g2v;

    .line 416
    .line 417
    iget-object v5, v8, La/czi;->c:La/ctf0;

    .line 418
    .line 419
    iget-object v0, v8, La/czi;->d:La/cad;

    .line 420
    .line 421
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, La/psc;

    .line 424
    .line 425
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    new-instance v7, La/r2u;

    .line 433
    .line 434
    iget-object v1, v8, La/czi;->e:La/sjl0;

    .line 435
    .line 436
    invoke-direct {v7, v1, v6}, La/r2u;-><init>(La/sjl0;B)V

    .line 437
    .line 438
    .line 439
    iget-object v1, v8, La/czi;->f:La/m1e;

    .line 440
    .line 441
    iget-object v9, v8, La/czi;->g:La/duj;

    .line 442
    .line 443
    iget-object v10, v8, La/czi;->h:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 444
    .line 445
    move-object v6, v0

    .line 446
    move-object v8, v1

    .line 447
    invoke-direct/range {v2 .. v10}, La/oou0;-><init>(La/hzg;La/g2v;La/ctf0;La/mne;La/r2u;La/m1e;La/duj;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;)V

    .line 448
    .line 449
    .line 450
    return-object v2

    .line 451
    :pswitch_8
    new-instance v3, La/jru0;

    .line 452
    .line 453
    check-cast v8, La/bzi;

    .line 454
    .line 455
    iget-object v0, v8, La/bzi;->a:La/pyg;

    .line 456
    .line 457
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    iget-object v5, v8, La/bzi;->b:La/g2v;

    .line 465
    .line 466
    iget-object v1, v8, La/bzi;->c:La/ctf0;

    .line 467
    .line 468
    iget-object v2, v8, La/bzi;->d:La/cad;

    .line 469
    .line 470
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v2, La/psc;

    .line 473
    .line 474
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    iget-object v2, v8, La/bzi;->e:La/vqc;

    .line 482
    .line 483
    iget-object v9, v8, La/bzi;->f:La/oeg0;

    .line 484
    .line 485
    invoke-interface {v0}, La/pyg;->i()La/vqc;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    new-instance v11, La/g2v;

    .line 490
    .line 491
    new-instance v0, La/nru0;

    .line 492
    .line 493
    new-instance v12, La/nmt0;

    .line 494
    .line 495
    iget-object v13, v8, La/bzi;->g:La/gii0;

    .line 496
    .line 497
    invoke-direct {v12, v13}, La/nmt0;-><init>(La/gii0;)V

    .line 498
    .line 499
    .line 500
    new-instance v13, La/jmb;

    .line 501
    .line 502
    invoke-direct {v13, v6}, La/jmb;-><init>(B)V

    .line 503
    .line 504
    .line 505
    iget-object v6, v8, La/bzi;->h:La/knf0;

    .line 506
    .line 507
    invoke-direct {v0, v12, v13, v6}, La/nru0;-><init>(La/nmt0;La/jmb;La/knf0;)V

    .line 508
    .line 509
    .line 510
    invoke-direct {v11, v0}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    iget-object v12, v8, La/bzi;->i:La/pmi;

    .line 514
    .line 515
    iget-object v13, v8, La/bzi;->j:La/m1e;

    .line 516
    .line 517
    move-object v6, v1

    .line 518
    move-object v8, v2

    .line 519
    invoke-direct/range {v3 .. v13}, La/jru0;-><init>(La/hzg;La/g2v;La/ctf0;La/mne;La/vqc;La/oeg0;La/vqc;La/g2v;La/pmi;La/m1e;)V

    .line 520
    .line 521
    .line 522
    return-object v3

    .line 523
    :pswitch_9
    new-instance v1, La/azi;

    .line 524
    .line 525
    invoke-direct {v1, v0}, La/azi;-><init>(La/yxi;)V

    .line 526
    .line 527
    .line 528
    return-object v1

    .line 529
    :pswitch_a
    new-instance v1, La/zyi;

    .line 530
    .line 531
    invoke-direct {v1, v0}, La/zyi;-><init>(La/yxi;)V

    .line 532
    .line 533
    .line 534
    return-object v1

    .line 535
    :pswitch_b
    new-instance v1, La/xyi;

    .line 536
    .line 537
    invoke-direct {v1, v0}, La/xyi;-><init>(La/yxi;)V

    .line 538
    .line 539
    .line 540
    return-object v1

    .line 541
    :pswitch_c
    new-instance v1, La/wyi;

    .line 542
    .line 543
    invoke-direct {v1, v0}, La/wyi;-><init>(La/yxi;)V

    .line 544
    .line 545
    .line 546
    return-object v1

    .line 547
    :pswitch_d
    new-instance v1, La/vyi;

    .line 548
    .line 549
    invoke-direct {v1, v0}, La/vyi;-><init>(La/yxi;)V

    .line 550
    .line 551
    .line 552
    return-object v1

    .line 553
    :pswitch_e
    new-instance v1, La/pyi;

    .line 554
    .line 555
    invoke-direct {v1, v0}, La/pyi;-><init>(La/yxi;)V

    .line 556
    .line 557
    .line 558
    return-object v1

    .line 559
    :pswitch_f
    new-instance v2, La/xgt0;

    .line 560
    .line 561
    check-cast v8, La/nc0;

    .line 562
    .line 563
    iget-object v0, v8, La/nc0;->d:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, La/i1w0;

    .line 566
    .line 567
    iget-object v1, v8, La/nc0;->e:Ljava/lang/Object;

    .line 568
    .line 569
    move-object v4, v1

    .line 570
    check-cast v4, Ljava/lang/String;

    .line 571
    .line 572
    new-instance v5, La/xsu;

    .line 573
    .line 574
    new-instance v1, La/fuj0;

    .line 575
    .line 576
    iget-object v6, v8, La/nc0;->f:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v6, La/knf0;

    .line 579
    .line 580
    new-instance v7, La/trm0;

    .line 581
    .line 582
    iget-object v9, v8, La/nc0;->g:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v9, La/gii0;

    .line 585
    .line 586
    invoke-direct {v7, v9, v3}, La/trm0;-><init>(La/gii0;B)V

    .line 587
    .line 588
    .line 589
    invoke-direct {v1, v6, v7}, La/fuj0;-><init>(La/knf0;La/trm0;)V

    .line 590
    .line 591
    .line 592
    invoke-direct {v5, v1}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    iget-object v1, v8, La/nc0;->a:Ljava/lang/Object;

    .line 596
    .line 597
    move-object v6, v1

    .line 598
    check-cast v6, La/duj;

    .line 599
    .line 600
    iget-object v1, v8, La/nc0;->h:Ljava/lang/Object;

    .line 601
    .line 602
    move-object v7, v1

    .line 603
    check-cast v7, La/kki;

    .line 604
    .line 605
    iget-object v1, v8, La/nc0;->i:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v1, La/ocl;

    .line 608
    .line 609
    iget-object v3, v8, La/nc0;->b:Ljava/lang/Object;

    .line 610
    .line 611
    move-object v9, v3

    .line 612
    check-cast v9, La/vjp;

    .line 613
    .line 614
    iget-object v3, v8, La/nc0;->j:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v3, La/cad;

    .line 617
    .line 618
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v3, La/psc;

    .line 621
    .line 622
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    iget-object v3, v8, La/nc0;->k:Ljava/lang/Object;

    .line 630
    .line 631
    move-object v11, v3

    .line 632
    check-cast v11, La/m1e;

    .line 633
    .line 634
    iget-object v3, v8, La/nc0;->l:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v3, Ljava/lang/Long;

    .line 637
    .line 638
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 639
    .line 640
    .line 641
    move-result-wide v12

    .line 642
    iget-object v3, v8, La/nc0;->m:Ljava/lang/Object;

    .line 643
    .line 644
    move-object v14, v3

    .line 645
    check-cast v14, La/r9u;

    .line 646
    .line 647
    iget-object v3, v8, La/nc0;->c:Ljava/lang/Object;

    .line 648
    .line 649
    move-object v15, v3

    .line 650
    check-cast v15, La/ctf0;

    .line 651
    .line 652
    move-object v3, v0

    .line 653
    move-object v8, v1

    .line 654
    invoke-direct/range {v2 .. v15}, La/xgt0;-><init>(La/i1w0;Ljava/lang/String;La/xsu;La/duj;La/kki;La/ocl;La/vjp;La/mne;La/m1e;JLa/r9u;La/ctf0;)V

    .line 655
    .line 656
    .line 657
    return-object v2

    .line 658
    :pswitch_10
    new-instance v3, La/yat0;

    .line 659
    .line 660
    check-cast v8, La/g45;

    .line 661
    .line 662
    iget-object v0, v8, La/g45;->a:Ljava/lang/Object;

    .line 663
    .line 664
    move-object v4, v0

    .line 665
    check-cast v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;

    .line 666
    .line 667
    iget-object v0, v8, La/g45;->b:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, La/cad;

    .line 670
    .line 671
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, La/psc;

    .line 674
    .line 675
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    iget-object v1, v8, La/g45;->c:Ljava/lang/Object;

    .line 683
    .line 684
    move-object v6, v1

    .line 685
    check-cast v6, La/g2v;

    .line 686
    .line 687
    iget-object v1, v8, La/g45;->d:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v1, La/pyg;

    .line 690
    .line 691
    invoke-interface {v1}, La/pyg;->a()La/hzg;

    .line 692
    .line 693
    .line 694
    move-result-object v7

    .line 695
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    iget-object v1, v8, La/g45;->e:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v1, La/m1e;

    .line 701
    .line 702
    new-instance v9, La/rpt;

    .line 703
    .line 704
    new-instance v10, La/khf0;

    .line 705
    .line 706
    new-instance v11, La/xex;

    .line 707
    .line 708
    iget-object v12, v8, La/g45;->f:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v12, La/gii0;

    .line 711
    .line 712
    invoke-direct {v11, v12, v5}, La/xex;-><init>(La/gii0;B)V

    .line 713
    .line 714
    .line 715
    new-instance v5, La/yk50;

    .line 716
    .line 717
    invoke-direct {v5, v2}, La/yk50;-><init>(B)V

    .line 718
    .line 719
    .line 720
    iget-object v2, v8, La/g45;->g:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v2, La/vby;

    .line 723
    .line 724
    invoke-direct {v10, v11, v5, v2}, La/khf0;-><init>(La/xex;La/yk50;La/vby;)V

    .line 725
    .line 726
    .line 727
    invoke-direct {v9, v10}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    iget-object v2, v8, La/g45;->h:Ljava/lang/Object;

    .line 731
    .line 732
    move-object v10, v2

    .line 733
    check-cast v10, La/ctf0;

    .line 734
    .line 735
    move-object v5, v0

    .line 736
    move-object v8, v1

    .line 737
    invoke-direct/range {v3 .. v10}, La/yat0;-><init>(Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;La/mne;La/g2v;La/hzg;La/m1e;La/rpt;La/ctf0;)V

    .line 738
    .line 739
    .line 740
    return-object v3

    .line 741
    :pswitch_11
    new-instance v4, La/dat0;

    .line 742
    .line 743
    check-cast v8, La/pwi;

    .line 744
    .line 745
    iget-object v0, v8, La/pwi;->h:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

    .line 748
    .line 749
    iget-object v1, v8, La/pwi;->f:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v1, La/cad;

    .line 752
    .line 753
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v1, La/psc;

    .line 756
    .line 757
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 758
    .line 759
    .line 760
    move-result-object v6

    .line 761
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    iget-object v1, v8, La/pwi;->c:Ljava/lang/Object;

    .line 765
    .line 766
    move-object v7, v1

    .line 767
    check-cast v7, La/g2v;

    .line 768
    .line 769
    iget-object v1, v8, La/pwi;->e:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v1, La/ctf0;

    .line 772
    .line 773
    iget-object v3, v8, La/pwi;->i:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v3, La/pyg;

    .line 776
    .line 777
    invoke-interface {v3}, La/pyg;->a()La/hzg;

    .line 778
    .line 779
    .line 780
    move-result-object v9

    .line 781
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    iget-object v3, v8, La/pwi;->g:Ljava/lang/Object;

    .line 785
    .line 786
    move-object v10, v3

    .line 787
    check-cast v10, La/m1e;

    .line 788
    .line 789
    new-instance v11, La/rpt;

    .line 790
    .line 791
    new-instance v3, La/khf0;

    .line 792
    .line 793
    new-instance v12, La/xex;

    .line 794
    .line 795
    iget-object v13, v8, La/pwi;->b:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v13, La/gii0;

    .line 798
    .line 799
    invoke-direct {v12, v13, v5}, La/xex;-><init>(La/gii0;B)V

    .line 800
    .line 801
    .line 802
    new-instance v5, La/yk50;

    .line 803
    .line 804
    invoke-direct {v5, v2}, La/yk50;-><init>(B)V

    .line 805
    .line 806
    .line 807
    iget-object v2, v8, La/pwi;->d:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v2, La/vby;

    .line 810
    .line 811
    invoke-direct {v3, v12, v5, v2}, La/khf0;-><init>(La/xex;La/yk50;La/vby;)V

    .line 812
    .line 813
    .line 814
    invoke-direct {v11, v3}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    iget-object v2, v8, La/pwi;->a:Ljava/lang/Object;

    .line 818
    .line 819
    move-object v12, v2

    .line 820
    check-cast v12, La/zr1;

    .line 821
    .line 822
    iget-object v2, v8, La/pwi;->j:Ljava/lang/Object;

    .line 823
    .line 824
    move-object v13, v2

    .line 825
    check-cast v13, La/ih5;

    .line 826
    .line 827
    move-object v5, v0

    .line 828
    move-object v8, v1

    .line 829
    invoke-direct/range {v4 .. v13}, La/dat0;-><init>(Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;La/mne;La/g2v;La/ctf0;La/hzg;La/m1e;La/rpt;La/zr1;La/ih5;)V

    .line 830
    .line 831
    .line 832
    return-object v4

    .line 833
    :pswitch_12
    new-instance v0, La/jvs0;

    .line 834
    .line 835
    check-cast v8, La/lyi;

    .line 836
    .line 837
    iget-object v1, v8, La/lyi;->a:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v2, v8, La/lyi;->b:La/ctf0;

    .line 840
    .line 841
    invoke-direct {v0, v2, v1}, La/jvs0;-><init>(La/ctf0;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    return-object v0

    .line 845
    :pswitch_13
    new-instance v1, La/jyi;

    .line 846
    .line 847
    invoke-direct {v1, v0}, La/jyi;-><init>(La/yxi;)V

    .line 848
    .line 849
    .line 850
    return-object v1

    .line 851
    :pswitch_14
    new-instance v2, La/tts0;

    .line 852
    .line 853
    check-cast v8, La/qv2;

    .line 854
    .line 855
    iget-object v0, v8, La/qv2;->b:Ljava/lang/Object;

    .line 856
    .line 857
    move-object v3, v0

    .line 858
    check-cast v3, La/i1w0;

    .line 859
    .line 860
    iget-object v0, v8, La/qv2;->c:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v0, La/cad;

    .line 863
    .line 864
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v0, La/psc;

    .line 867
    .line 868
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    new-instance v5, La/g2v;

    .line 876
    .line 877
    new-instance v0, La/ouu;

    .line 878
    .line 879
    iget-object v1, v8, La/qv2;->d:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v1, La/knf0;

    .line 882
    .line 883
    iget-object v6, v8, La/qv2;->e:Ljava/lang/Object;

    .line 884
    .line 885
    check-cast v6, La/kuy;

    .line 886
    .line 887
    iget-object v7, v8, La/qv2;->f:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v7, La/gii0;

    .line 890
    .line 891
    invoke-direct {v0, v1, v6, v7}, La/ouu;-><init>(La/knf0;La/kuy;La/gii0;)V

    .line 892
    .line 893
    .line 894
    invoke-direct {v5, v0}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    iget-object v0, v8, La/qv2;->g:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v0, La/wsf0;

    .line 900
    .line 901
    iget-object v1, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v1, La/g45;

    .line 904
    .line 905
    invoke-virtual {v1}, La/g45;->t()La/m0u;

    .line 906
    .line 907
    .line 908
    move-result-object v6

    .line 909
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v0, La/g45;

    .line 912
    .line 913
    invoke-virtual {v0}, La/g45;->y()La/ahu;

    .line 914
    .line 915
    .line 916
    move-result-object v7

    .line 917
    iget-object v0, v8, La/qv2;->h:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, La/bzt;

    .line 920
    .line 921
    iget-object v1, v8, La/qv2;->i:Ljava/lang/Object;

    .line 922
    .line 923
    move-object v9, v1

    .line 924
    check-cast v9, La/gle0;

    .line 925
    .line 926
    iget-object v1, v8, La/qv2;->j:Ljava/lang/Object;

    .line 927
    .line 928
    move-object v10, v1

    .line 929
    check-cast v10, La/m1e;

    .line 930
    .line 931
    iget-object v1, v8, La/qv2;->k:Ljava/lang/Object;

    .line 932
    .line 933
    move-object v11, v1

    .line 934
    check-cast v11, Ljava/lang/String;

    .line 935
    .line 936
    iget-object v1, v8, La/qv2;->l:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v1, Ljava/lang/Boolean;

    .line 939
    .line 940
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 941
    .line 942
    .line 943
    move-result v12

    .line 944
    iget-object v1, v8, La/qv2;->m:Ljava/lang/Object;

    .line 945
    .line 946
    move-object v13, v1

    .line 947
    check-cast v13, La/ctf0;

    .line 948
    .line 949
    move-object v8, v0

    .line 950
    invoke-direct/range {v2 .. v13}, La/tts0;-><init>(La/i1w0;La/mne;La/g2v;La/m0u;La/ahu;La/bzt;La/gle0;La/m1e;Ljava/lang/String;ZLa/ctf0;)V

    .line 951
    .line 952
    .line 953
    return-object v2

    .line 954
    :pswitch_15
    new-instance v0, La/zjs0;

    .line 955
    .line 956
    check-cast v8, La/ru;

    .line 957
    .line 958
    iget-object v1, v8, La/ru;->b:Ljava/lang/Object;

    .line 959
    .line 960
    move-object v4, v1

    .line 961
    check-cast v4, La/duj;

    .line 962
    .line 963
    new-instance v5, La/x4u;

    .line 964
    .line 965
    new-instance v1, La/ywu;

    .line 966
    .line 967
    new-instance v2, La/kd30;

    .line 968
    .line 969
    iget-object v6, v8, La/ru;->a:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v6, La/gii0;

    .line 972
    .line 973
    invoke-direct {v2, v6, v3}, La/kd30;-><init>(La/gii0;B)V

    .line 974
    .line 975
    .line 976
    iget-object v3, v8, La/ru;->c:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v3, La/knf0;

    .line 979
    .line 980
    iget-object v6, v8, La/ru;->d:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v6, La/cad;

    .line 983
    .line 984
    iget-object v7, v6, La/cad;->b:Ljava/lang/Object;

    .line 985
    .line 986
    check-cast v7, La/psc;

    .line 987
    .line 988
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 989
    .line 990
    .line 991
    move-result-object v7

    .line 992
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 993
    .line 994
    .line 995
    invoke-direct {v1, v7, v2, v3}, La/ywu;-><init>(La/mne;La/kd30;La/knf0;)V

    .line 996
    .line 997
    .line 998
    invoke-direct {v5, v1}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    iget-object v1, v8, La/ru;->h:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v1, La/m1e;

    .line 1004
    .line 1005
    iget-object v2, v8, La/ru;->f:Ljava/lang/Object;

    .line 1006
    .line 1007
    move-object v7, v2

    .line 1008
    check-cast v7, La/i1w0;

    .line 1009
    .line 1010
    iget-object v2, v8, La/ru;->g:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v2, La/ocl;

    .line 1013
    .line 1014
    iget-object v3, v8, La/ru;->i:Ljava/lang/Object;

    .line 1015
    .line 1016
    move-object v9, v3

    .line 1017
    check-cast v9, Ljava/lang/String;

    .line 1018
    .line 1019
    iget-object v3, v6, La/cad;->b:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v3, La/psc;

    .line 1022
    .line 1023
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v10

    .line 1027
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    iget-object v3, v8, La/ru;->e:Ljava/lang/Object;

    .line 1031
    .line 1032
    move-object v11, v3

    .line 1033
    check-cast v11, La/ctf0;

    .line 1034
    .line 1035
    move-object v3, v0

    .line 1036
    move-object v6, v1

    .line 1037
    move-object v8, v2

    .line 1038
    invoke-direct/range {v3 .. v11}, La/zjs0;-><init>(La/duj;La/x4u;La/m1e;La/i1w0;La/ocl;Ljava/lang/String;La/mne;La/ctf0;)V

    .line 1039
    .line 1040
    .line 1041
    return-object v3

    .line 1042
    :pswitch_16
    new-instance v4, La/els0;

    .line 1043
    .line 1044
    check-cast v8, La/gyi;

    .line 1045
    .line 1046
    iget-object v5, v8, La/gyi;->a:Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 1047
    .line 1048
    iget-object v0, v8, La/gyi;->b:La/cad;

    .line 1049
    .line 1050
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v0, La/psc;

    .line 1053
    .line 1054
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v6

    .line 1058
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    iget-object v0, v8, La/gyi;->c:La/pyg;

    .line 1062
    .line 1063
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v7

    .line 1067
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v0, La/lbu;

    .line 1071
    .line 1072
    new-instance v1, La/svu;

    .line 1073
    .line 1074
    new-instance v2, La/fuj0;

    .line 1075
    .line 1076
    new-instance v3, La/dpi0;

    .line 1077
    .line 1078
    iget-object v9, v8, La/gyi;->d:La/gii0;

    .line 1079
    .line 1080
    const/16 v10, 0x18

    .line 1081
    .line 1082
    invoke-direct {v3, v9, v10}, La/dpi0;-><init>(La/gii0;B)V

    .line 1083
    .line 1084
    .line 1085
    new-instance v9, La/w4p0;

    .line 1086
    .line 1087
    const/4 v10, 0x5

    .line 1088
    invoke-direct {v9, v10}, La/w4p0;-><init>(B)V

    .line 1089
    .line 1090
    .line 1091
    const/4 v10, 0x0

    .line 1092
    invoke-direct {v2, v3, v9, v10}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 1093
    .line 1094
    .line 1095
    invoke-direct {v1, v2}, La/svu;-><init>(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    iget-object v2, v8, La/gyi;->e:La/m1e;

    .line 1099
    .line 1100
    invoke-direct {v0, v1, v2}, La/lbu;-><init>(La/svu;La/m1e;)V

    .line 1101
    .line 1102
    .line 1103
    iget-object v9, v8, La/gyi;->f:La/ctf0;

    .line 1104
    .line 1105
    iget-object v10, v8, La/gyi;->g:La/g2v;

    .line 1106
    .line 1107
    iget-object v1, v8, La/gyi;->h:La/iip;

    .line 1108
    .line 1109
    invoke-interface {v1}, La/iip;->V()La/j3c;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v11

    .line 1113
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1114
    .line 1115
    .line 1116
    new-instance v12, La/ih5;

    .line 1117
    .line 1118
    iget-object v1, v8, La/gyi;->i:La/kt2;

    .line 1119
    .line 1120
    const/4 v2, 0x1

    .line 1121
    invoke-direct {v12, v1, v2}, La/ih5;-><init>(La/kt2;B)V

    .line 1122
    .line 1123
    .line 1124
    iget-object v13, v8, La/gyi;->j:La/zr1;

    .line 1125
    .line 1126
    move-object v8, v0

    .line 1127
    invoke-direct/range {v4 .. v13}, La/els0;-><init>(Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;La/mne;La/hzg;La/lbu;La/ctf0;La/g2v;La/j3c;La/ih5;La/zr1;)V

    .line 1128
    .line 1129
    .line 1130
    return-object v4

    .line 1131
    :pswitch_17
    new-instance v5, La/vfs0;

    .line 1132
    .line 1133
    check-cast v8, La/daf;

    .line 1134
    .line 1135
    new-instance v6, La/abu;

    .line 1136
    .line 1137
    new-instance v0, La/fck0;

    .line 1138
    .line 1139
    new-instance v1, La/ilp0;

    .line 1140
    .line 1141
    iget-object v2, v8, La/daf;->b:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v2, La/gii0;

    .line 1144
    .line 1145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1146
    .line 1147
    .line 1148
    const-class v3, La/d57;

    .line 1149
    .line 1150
    sget-object v4, La/sre0;->a:La/tre0;

    .line 1151
    .line 1152
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v3

    .line 1156
    invoke-virtual {v2, v3}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    check-cast v2, La/d57;

    .line 1161
    .line 1162
    invoke-direct {v1, v2}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 1163
    .line 1164
    .line 1165
    iget-object v2, v8, La/daf;->c:Ljava/lang/Object;

    .line 1166
    .line 1167
    check-cast v2, La/btt0;

    .line 1168
    .line 1169
    invoke-direct {v0, v1, v2}, La/fck0;-><init>(La/ilp0;La/btt0;)V

    .line 1170
    .line 1171
    .line 1172
    iget-object v1, v8, La/daf;->d:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v1, La/wsf0;

    .line 1175
    .line 1176
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v1, La/g45;

    .line 1179
    .line 1180
    invoke-virtual {v1}, La/g45;->q()La/nrt;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v1

    .line 1184
    const/16 v2, 0xd

    .line 1185
    .line 1186
    invoke-direct {v6, v0, v1, v2}, La/abu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1187
    .line 1188
    .line 1189
    iget-object v0, v8, La/daf;->e:Ljava/lang/Object;

    .line 1190
    .line 1191
    move-object v7, v0

    .line 1192
    check-cast v7, La/duj;

    .line 1193
    .line 1194
    iget-object v0, v8, La/daf;->f:Ljava/lang/Object;

    .line 1195
    .line 1196
    check-cast v0, La/i1w0;

    .line 1197
    .line 1198
    iget-object v1, v8, La/daf;->g:Ljava/lang/Object;

    .line 1199
    .line 1200
    move-object v9, v1

    .line 1201
    check-cast v9, La/sa10;

    .line 1202
    .line 1203
    iget-object v1, v8, La/daf;->h:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v1, La/cad;

    .line 1206
    .line 1207
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v1, La/psc;

    .line 1210
    .line 1211
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v10

    .line 1215
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1216
    .line 1217
    .line 1218
    iget-object v1, v8, La/daf;->i:Ljava/lang/Object;

    .line 1219
    .line 1220
    move-object v11, v1

    .line 1221
    check-cast v11, La/ctf0;

    .line 1222
    .line 1223
    iget-object v1, v8, La/daf;->j:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v1, Ljava/lang/Long;

    .line 1226
    .line 1227
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v12

    .line 1231
    iget-object v1, v8, La/daf;->k:Ljava/lang/Object;

    .line 1232
    .line 1233
    move-object v14, v1

    .line 1234
    check-cast v14, Ljava/lang/String;

    .line 1235
    .line 1236
    iget-object v1, v8, La/daf;->l:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v1, Ljava/lang/Double;

    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v15

    .line 1244
    move-object v8, v0

    .line 1245
    invoke-direct/range {v5 .. v16}, La/vfs0;-><init>(La/abu;La/duj;La/i1w0;La/sa10;La/mne;La/ctf0;JLjava/lang/String;D)V

    .line 1246
    .line 1247
    .line 1248
    return-object v5

    .line 1249
    :pswitch_18
    new-instance v1, La/fyi;

    .line 1250
    .line 1251
    invoke-direct {v1, v0}, La/fyi;-><init>(La/yxi;)V

    .line 1252
    .line 1253
    .line 1254
    return-object v1

    .line 1255
    :pswitch_19
    new-instance v2, La/l7s0;

    .line 1256
    .line 1257
    check-cast v8, La/qv2;

    .line 1258
    .line 1259
    iget-object v0, v8, La/qv2;->b:Ljava/lang/Object;

    .line 1260
    .line 1261
    check-cast v0, La/ehf0;

    .line 1262
    .line 1263
    iget-object v1, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 1264
    .line 1265
    check-cast v1, La/i7i;

    .line 1266
    .line 1267
    invoke-virtual {v1}, La/i7i;->a()La/wdu;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v3

    .line 1271
    iget-object v1, v8, La/qv2;->c:Ljava/lang/Object;

    .line 1272
    .line 1273
    move-object v4, v1

    .line 1274
    check-cast v4, La/ctf0;

    .line 1275
    .line 1276
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 1277
    .line 1278
    check-cast v0, La/i7i;

    .line 1279
    .line 1280
    invoke-virtual {v0}, La/i7i;->s()La/gto0;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v5

    .line 1284
    iget-object v0, v8, La/qv2;->d:Ljava/lang/Object;

    .line 1285
    .line 1286
    move-object v6, v0

    .line 1287
    check-cast v6, La/oeg0;

    .line 1288
    .line 1289
    iget-object v0, v8, La/qv2;->e:Ljava/lang/Object;

    .line 1290
    .line 1291
    check-cast v0, La/cad;

    .line 1292
    .line 1293
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v0, La/psc;

    .line 1296
    .line 1297
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v7

    .line 1301
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1302
    .line 1303
    .line 1304
    iget-object v0, v8, La/qv2;->f:Ljava/lang/Object;

    .line 1305
    .line 1306
    check-cast v0, La/s91;

    .line 1307
    .line 1308
    iget-object v1, v8, La/qv2;->g:Ljava/lang/Object;

    .line 1309
    .line 1310
    move-object v9, v1

    .line 1311
    check-cast v9, La/wiu;

    .line 1312
    .line 1313
    iget-object v1, v8, La/qv2;->h:Ljava/lang/Object;

    .line 1314
    .line 1315
    move-object v10, v1

    .line 1316
    check-cast v10, La/qu;

    .line 1317
    .line 1318
    iget-object v1, v8, La/qv2;->i:Ljava/lang/Object;

    .line 1319
    .line 1320
    move-object v11, v1

    .line 1321
    check-cast v11, La/zr1;

    .line 1322
    .line 1323
    iget-object v1, v8, La/qv2;->j:Ljava/lang/Object;

    .line 1324
    .line 1325
    move-object v12, v1

    .line 1326
    check-cast v12, La/r2v;

    .line 1327
    .line 1328
    iget-object v1, v8, La/qv2;->k:Ljava/lang/Object;

    .line 1329
    .line 1330
    move-object v13, v1

    .line 1331
    check-cast v13, La/bzt;

    .line 1332
    .line 1333
    iget-object v1, v8, La/qv2;->l:Ljava/lang/Object;

    .line 1334
    .line 1335
    move-object v14, v1

    .line 1336
    check-cast v14, La/ytt;

    .line 1337
    .line 1338
    iget-object v1, v8, La/qv2;->m:Ljava/lang/Object;

    .line 1339
    .line 1340
    move-object v15, v1

    .line 1341
    check-cast v15, La/crm0;

    .line 1342
    .line 1343
    move-object v8, v0

    .line 1344
    invoke-direct/range {v2 .. v15}, La/l7s0;-><init>(La/wdu;La/ctf0;La/gto0;La/oeg0;La/mne;La/s91;La/wiu;La/qu;La/zr1;La/r2v;La/bzt;La/ytt;La/crm0;)V

    .line 1345
    .line 1346
    .line 1347
    return-object v2

    .line 1348
    :pswitch_1a
    new-instance v3, La/yrr0;

    .line 1349
    .line 1350
    check-cast v8, La/v7i;

    .line 1351
    .line 1352
    iget-object v0, v8, La/v7i;->h:Ljava/lang/Object;

    .line 1353
    .line 1354
    check-cast v0, La/cad;

    .line 1355
    .line 1356
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v0, La/psc;

    .line 1359
    .line 1360
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v4

    .line 1364
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1365
    .line 1366
    .line 1367
    iget-object v0, v8, La/v7i;->c:Ljava/lang/Object;

    .line 1368
    .line 1369
    check-cast v0, La/ctf0;

    .line 1370
    .line 1371
    iget-object v1, v8, La/v7i;->i:Ljava/lang/Object;

    .line 1372
    .line 1373
    move-object v6, v1

    .line 1374
    check-cast v6, La/i1w0;

    .line 1375
    .line 1376
    new-instance v1, La/lsn;

    .line 1377
    .line 1378
    new-instance v2, La/gxu;

    .line 1379
    .line 1380
    iget-object v9, v8, La/v7i;->e:Ljava/lang/Object;

    .line 1381
    .line 1382
    check-cast v9, La/csr0;

    .line 1383
    .line 1384
    new-instance v10, La/ilp0;

    .line 1385
    .line 1386
    iget-object v11, v8, La/v7i;->f:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v11, La/gii0;

    .line 1389
    .line 1390
    invoke-direct {v10, v11, v7}, La/ilp0;-><init>(La/gii0;B)V

    .line 1391
    .line 1392
    .line 1393
    iget-object v12, v8, La/v7i;->j:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v12, La/knf0;

    .line 1396
    .line 1397
    invoke-direct {v2, v9, v10, v12}, La/gxu;-><init>(La/csr0;La/ilp0;La/knf0;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-direct {v1, v2}, La/lsn;-><init>(Ljava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    iget-object v2, v8, La/v7i;->k:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v2, La/sa10;

    .line 1406
    .line 1407
    iget-object v9, v8, La/v7i;->d:Ljava/lang/Object;

    .line 1408
    .line 1409
    check-cast v9, La/m1e;

    .line 1410
    .line 1411
    iget-object v10, v8, La/v7i;->g:Ljava/lang/Object;

    .line 1412
    .line 1413
    check-cast v10, La/duj;

    .line 1414
    .line 1415
    iget-object v13, v8, La/v7i;->l:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v13, La/pru;

    .line 1418
    .line 1419
    new-instance v14, La/edu;

    .line 1420
    .line 1421
    new-instance v15, La/f4u;

    .line 1422
    .line 1423
    new-instance v7, La/hcp0;

    .line 1424
    .line 1425
    new-instance v5, La/pmi0;

    .line 1426
    .line 1427
    move-object/from16 p0, v0

    .line 1428
    .line 1429
    const/16 v0, 0x1d

    .line 1430
    .line 1431
    invoke-direct {v5, v11, v0}, La/pmi0;-><init>(La/gii0;B)V

    .line 1432
    .line 1433
    .line 1434
    invoke-direct {v7, v12, v5}, La/hcp0;-><init>(La/knf0;La/pmi0;)V

    .line 1435
    .line 1436
    .line 1437
    const/16 v0, 0xe

    .line 1438
    .line 1439
    invoke-direct {v15, v7, v0}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 1440
    .line 1441
    .line 1442
    iget-object v0, v8, La/v7i;->a:Ljava/lang/Object;

    .line 1443
    .line 1444
    check-cast v0, La/wsf0;

    .line 1445
    .line 1446
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v0, La/g45;

    .line 1449
    .line 1450
    invoke-virtual {v0}, La/g45;->G()La/khf0;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    const/4 v5, 0x3

    .line 1455
    invoke-direct {v14, v15, v0, v5}, La/edu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1456
    .line 1457
    .line 1458
    move-object v0, v13

    .line 1459
    new-instance v13, La/prc;

    .line 1460
    .line 1461
    new-instance v17, La/pzu;

    .line 1462
    .line 1463
    iget-object v5, v8, La/v7i;->m:Ljava/lang/Object;

    .line 1464
    .line 1465
    move-object/from16 v18, v5

    .line 1466
    .line 1467
    check-cast v18, La/btt0;

    .line 1468
    .line 1469
    iget-object v5, v8, La/v7i;->b:Ljava/lang/Object;

    .line 1470
    .line 1471
    move-object/from16 v19, v5

    .line 1472
    .line 1473
    check-cast v19, La/hqr0;

    .line 1474
    .line 1475
    iget-object v5, v8, La/v7i;->e:Ljava/lang/Object;

    .line 1476
    .line 1477
    move-object/from16 v20, v5

    .line 1478
    .line 1479
    check-cast v20, La/csr0;

    .line 1480
    .line 1481
    new-instance v5, La/epi0;

    .line 1482
    .line 1483
    const/16 v7, 0x14

    .line 1484
    .line 1485
    invoke-direct {v5, v11, v7}, La/epi0;-><init>(La/gii0;B)V

    .line 1486
    .line 1487
    .line 1488
    iget-object v7, v8, La/v7i;->j:Ljava/lang/Object;

    .line 1489
    .line 1490
    move-object/from16 v22, v7

    .line 1491
    .line 1492
    check-cast v22, La/knf0;

    .line 1493
    .line 1494
    iget-object v7, v8, La/v7i;->n:Ljava/lang/Object;

    .line 1495
    .line 1496
    move-object/from16 v23, v7

    .line 1497
    .line 1498
    check-cast v23, La/tgk;

    .line 1499
    .line 1500
    move-object/from16 v21, v5

    .line 1501
    .line 1502
    invoke-direct/range {v17 .. v23}, La/pzu;-><init>(La/btt0;La/hqr0;La/csr0;La/epi0;La/knf0;La/tgk;)V

    .line 1503
    .line 1504
    .line 1505
    move-object/from16 v5, v17

    .line 1506
    .line 1507
    const/4 v7, 0x3

    .line 1508
    invoke-direct {v13, v5, v7}, La/prc;-><init>(Ljava/lang/Object;B)V

    .line 1509
    .line 1510
    .line 1511
    move-object/from16 v5, p0

    .line 1512
    .line 1513
    move-object v11, v0

    .line 1514
    move-object v7, v1

    .line 1515
    move-object v8, v2

    .line 1516
    move-object v12, v14

    .line 1517
    invoke-direct/range {v3 .. v13}, La/yrr0;-><init>(La/mne;La/ctf0;La/i1w0;La/lsn;La/sa10;La/m1e;La/duj;La/pru;La/edu;La/prc;)V

    .line 1518
    .line 1519
    .line 1520
    return-object v3

    .line 1521
    :pswitch_1b
    new-instance v4, La/zvr0;

    .line 1522
    .line 1523
    check-cast v8, La/v7i;

    .line 1524
    .line 1525
    iget-object v0, v8, La/v7i;->i:Ljava/lang/Object;

    .line 1526
    .line 1527
    move-object v5, v0

    .line 1528
    check-cast v5, La/sa10;

    .line 1529
    .line 1530
    iget-object v0, v8, La/v7i;->d:Ljava/lang/Object;

    .line 1531
    .line 1532
    move-object v6, v0

    .line 1533
    check-cast v6, La/m1e;

    .line 1534
    .line 1535
    iget-object v0, v8, La/v7i;->h:Ljava/lang/Object;

    .line 1536
    .line 1537
    check-cast v0, La/cad;

    .line 1538
    .line 1539
    iget-object v1, v0, La/cad;->b:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v1, La/psc;

    .line 1542
    .line 1543
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v7

    .line 1547
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1548
    .line 1549
    .line 1550
    new-instance v1, La/pyu;

    .line 1551
    .line 1552
    new-instance v2, La/nvu;

    .line 1553
    .line 1554
    iget-object v3, v0, La/cad;->b:Ljava/lang/Object;

    .line 1555
    .line 1556
    check-cast v3, La/psc;

    .line 1557
    .line 1558
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v3

    .line 1562
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1563
    .line 1564
    .line 1565
    iget-object v9, v8, La/v7i;->e:Ljava/lang/Object;

    .line 1566
    .line 1567
    check-cast v9, La/afm0;

    .line 1568
    .line 1569
    iget-object v10, v8, La/v7i;->f:Ljava/lang/Object;

    .line 1570
    .line 1571
    check-cast v10, La/knf0;

    .line 1572
    .line 1573
    invoke-direct {v2, v3, v9, v10}, La/nvu;-><init>(La/mne;La/afm0;La/knf0;)V

    .line 1574
    .line 1575
    .line 1576
    invoke-direct {v1, v2}, La/pyu;-><init>(Ljava/lang/Object;)V

    .line 1577
    .line 1578
    .line 1579
    iget-object v2, v8, La/v7i;->j:Ljava/lang/Object;

    .line 1580
    .line 1581
    check-cast v2, La/wsf0;

    .line 1582
    .line 1583
    iget-object v2, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1584
    .line 1585
    check-cast v2, La/g45;

    .line 1586
    .line 1587
    invoke-virtual {v2}, La/g45;->G()La/khf0;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v2

    .line 1591
    new-instance v3, La/ctu;

    .line 1592
    .line 1593
    invoke-virtual {v8}, La/v7i;->m()La/vkr0;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v11

    .line 1597
    invoke-direct {v3, v11}, La/ctu;-><init>(La/rkr0;)V

    .line 1598
    .line 1599
    .line 1600
    new-instance v11, La/nv20;

    .line 1601
    .line 1602
    new-instance v12, La/nvu;

    .line 1603
    .line 1604
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1605
    .line 1606
    check-cast v0, La/psc;

    .line 1607
    .line 1608
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1613
    .line 1614
    .line 1615
    invoke-direct {v12, v0, v9, v10}, La/nvu;-><init>(La/mne;La/afm0;La/knf0;)V

    .line 1616
    .line 1617
    .line 1618
    invoke-direct {v11, v12}, La/nv20;-><init>(Ljava/lang/Object;)V

    .line 1619
    .line 1620
    .line 1621
    new-instance v12, La/ctu;

    .line 1622
    .line 1623
    invoke-virtual {v8}, La/v7i;->m()La/vkr0;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    invoke-direct {v12, v0}, La/ctu;-><init>(La/rkr0;)V

    .line 1628
    .line 1629
    .line 1630
    new-instance v13, La/usc;

    .line 1631
    .line 1632
    invoke-virtual {v8}, La/v7i;->m()La/vkr0;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    invoke-direct {v13, v0}, La/usc;-><init>(La/rkr0;)V

    .line 1637
    .line 1638
    .line 1639
    new-instance v14, La/zqc;

    .line 1640
    .line 1641
    invoke-virtual {v8}, La/v7i;->m()La/vkr0;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    invoke-direct {v14, v0}, La/zqc;-><init>(La/rkr0;)V

    .line 1646
    .line 1647
    .line 1648
    iget-object v0, v8, La/v7i;->c:Ljava/lang/Object;

    .line 1649
    .line 1650
    move-object v15, v0

    .line 1651
    check-cast v15, La/ctf0;

    .line 1652
    .line 1653
    iget-object v0, v8, La/v7i;->b:Ljava/lang/Object;

    .line 1654
    .line 1655
    move-object/from16 v16, v0

    .line 1656
    .line 1657
    check-cast v16, La/i1w0;

    .line 1658
    .line 1659
    iget-object v0, v8, La/v7i;->g:Ljava/lang/Object;

    .line 1660
    .line 1661
    move-object/from16 v17, v0

    .line 1662
    .line 1663
    check-cast v17, La/duj;

    .line 1664
    .line 1665
    iget-object v0, v8, La/v7i;->n:Ljava/lang/Object;

    .line 1666
    .line 1667
    move-object/from16 v18, v0

    .line 1668
    .line 1669
    check-cast v18, La/wyu;

    .line 1670
    .line 1671
    move-object v8, v1

    .line 1672
    move-object v9, v2

    .line 1673
    move-object v10, v3

    .line 1674
    invoke-direct/range {v4 .. v18}, La/zvr0;-><init>(La/sa10;La/m1e;La/mne;La/pyu;La/khf0;La/ctu;La/nv20;La/ctu;La/usc;La/zqc;La/ctf0;La/i1w0;La/duj;La/wyu;)V

    .line 1675
    .line 1676
    .line 1677
    return-object v4

    .line 1678
    :pswitch_1c
    new-instance v5, La/njr0;

    .line 1679
    .line 1680
    check-cast v8, La/v5i;

    .line 1681
    .line 1682
    iget-object v0, v8, La/v5i;->e:Ljava/lang/Object;

    .line 1683
    .line 1684
    check-cast v0, La/m1e;

    .line 1685
    .line 1686
    iget-object v1, v8, La/v5i;->o:Ljava/lang/Object;

    .line 1687
    .line 1688
    check-cast v1, La/cad;

    .line 1689
    .line 1690
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 1691
    .line 1692
    check-cast v1, La/psc;

    .line 1693
    .line 1694
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v7

    .line 1698
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1699
    .line 1700
    .line 1701
    iget-object v1, v8, La/v5i;->f:Ljava/lang/Object;

    .line 1702
    .line 1703
    check-cast v1, La/i1w0;

    .line 1704
    .line 1705
    iget-object v2, v8, La/v5i;->g:Ljava/lang/Object;

    .line 1706
    .line 1707
    move-object v9, v2

    .line 1708
    check-cast v9, La/sa10;

    .line 1709
    .line 1710
    new-instance v10, La/yk00;

    .line 1711
    .line 1712
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v2

    .line 1716
    invoke-direct {v10, v2}, La/yk00;-><init>(La/rkr0;)V

    .line 1717
    .line 1718
    .line 1719
    iget-object v2, v8, La/v5i;->m:Ljava/lang/Object;

    .line 1720
    .line 1721
    check-cast v2, La/wsf0;

    .line 1722
    .line 1723
    iget-object v3, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1724
    .line 1725
    check-cast v3, La/g45;

    .line 1726
    .line 1727
    invoke-virtual {v3}, La/g45;->G()La/khf0;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v11

    .line 1731
    iget-object v3, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1732
    .line 1733
    check-cast v3, La/g45;

    .line 1734
    .line 1735
    invoke-virtual {v3}, La/g45;->l()La/f6k;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v12

    .line 1739
    new-instance v13, La/yk00;

    .line 1740
    .line 1741
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v3

    .line 1745
    invoke-direct {v13, v3}, La/yk00;-><init>(La/rkr0;)V

    .line 1746
    .line 1747
    .line 1748
    new-instance v14, La/ctu;

    .line 1749
    .line 1750
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v3

    .line 1754
    invoke-direct {v14, v3}, La/ctu;-><init>(La/rkr0;)V

    .line 1755
    .line 1756
    .line 1757
    new-instance v15, La/ctu;

    .line 1758
    .line 1759
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v3

    .line 1763
    invoke-direct {v15, v3}, La/ctu;-><init>(La/rkr0;)V

    .line 1764
    .line 1765
    .line 1766
    new-instance v3, La/g2v;

    .line 1767
    .line 1768
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v4

    .line 1772
    invoke-direct {v3, v4}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 1773
    .line 1774
    .line 1775
    new-instance v4, La/bzu;

    .line 1776
    .line 1777
    new-instance v6, La/g090;

    .line 1778
    .line 1779
    move-object/from16 p0, v0

    .line 1780
    .line 1781
    iget-object v0, v8, La/v5i;->j:Ljava/lang/Object;

    .line 1782
    .line 1783
    check-cast v0, La/gkr0;

    .line 1784
    .line 1785
    move-object/from16 v19, v1

    .line 1786
    .line 1787
    iget-object v1, v8, La/v5i;->k:Ljava/lang/Object;

    .line 1788
    .line 1789
    check-cast v1, La/sd80;

    .line 1790
    .line 1791
    invoke-direct {v6, v0, v1}, La/g090;-><init>(La/gkr0;La/sd80;)V

    .line 1792
    .line 1793
    .line 1794
    move-object/from16 v20, v3

    .line 1795
    .line 1796
    const/4 v3, 0x2

    .line 1797
    invoke-direct {v4, v6, v3}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 1798
    .line 1799
    .line 1800
    iget-object v3, v8, La/v5i;->n:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v3, La/iw20;

    .line 1803
    .line 1804
    iget-object v6, v3, La/iw20;->a:Ljava/lang/Object;

    .line 1805
    .line 1806
    check-cast v6, La/uii;

    .line 1807
    .line 1808
    invoke-virtual {v6}, La/uii;->r()La/pru;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v18

    .line 1812
    new-instance v6, La/xsu;

    .line 1813
    .line 1814
    move-object/from16 v21, v4

    .line 1815
    .line 1816
    new-instance v4, La/g090;

    .line 1817
    .line 1818
    invoke-direct {v4, v0, v1}, La/g090;-><init>(La/gkr0;La/sd80;)V

    .line 1819
    .line 1820
    .line 1821
    invoke-direct {v6, v4}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 1822
    .line 1823
    .line 1824
    new-instance v4, La/reu;

    .line 1825
    .line 1826
    move-object/from16 v22, v5

    .line 1827
    .line 1828
    new-instance v5, La/g090;

    .line 1829
    .line 1830
    invoke-direct {v5, v0, v1}, La/g090;-><init>(La/gkr0;La/sd80;)V

    .line 1831
    .line 1832
    .line 1833
    const/16 v0, 0x15

    .line 1834
    .line 1835
    invoke-direct {v4, v5, v0}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 1836
    .line 1837
    .line 1838
    new-instance v0, La/w4p0;

    .line 1839
    .line 1840
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v1

    .line 1844
    const/16 v5, 0xc

    .line 1845
    .line 1846
    invoke-direct {v0, v1, v5}, La/w4p0;-><init>(Ljava/lang/Object;B)V

    .line 1847
    .line 1848
    .line 1849
    new-instance v1, La/usc;

    .line 1850
    .line 1851
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v5

    .line 1855
    invoke-direct {v1, v5}, La/usc;-><init>(La/rkr0;)V

    .line 1856
    .line 1857
    .line 1858
    new-instance v5, La/zqc;

    .line 1859
    .line 1860
    move-object/from16 v23, v0

    .line 1861
    .line 1862
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v0

    .line 1866
    invoke-direct {v5, v0}, La/zqc;-><init>(La/rkr0;)V

    .line 1867
    .line 1868
    .line 1869
    new-instance v0, La/nhf0;

    .line 1870
    .line 1871
    move-object/from16 v24, v1

    .line 1872
    .line 1873
    new-instance v1, La/usc;

    .line 1874
    .line 1875
    move-object/from16 v25, v4

    .line 1876
    .line 1877
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v4

    .line 1881
    invoke-direct {v1, v4}, La/usc;-><init>(La/rkr0;)V

    .line 1882
    .line 1883
    .line 1884
    new-instance v4, La/tqt;

    .line 1885
    .line 1886
    move-object/from16 v26, v5

    .line 1887
    .line 1888
    new-instance v5, La/bst;

    .line 1889
    .line 1890
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1891
    .line 1892
    .line 1893
    move-object/from16 v27, v6

    .line 1894
    .line 1895
    new-instance v6, La/tqt;

    .line 1896
    .line 1897
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1898
    .line 1899
    .line 1900
    move-object/from16 v28, v7

    .line 1901
    .line 1902
    new-instance v7, La/art;

    .line 1903
    .line 1904
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1905
    .line 1906
    .line 1907
    invoke-direct {v4, v5, v6, v7}, La/tqt;-><init>(La/bst;La/tqt;La/art;)V

    .line 1908
    .line 1909
    .line 1910
    new-instance v5, La/ctu;

    .line 1911
    .line 1912
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v6

    .line 1916
    invoke-direct {v5, v6}, La/ctu;-><init>(La/rkr0;)V

    .line 1917
    .line 1918
    .line 1919
    new-instance v6, La/ctu;

    .line 1920
    .line 1921
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v7

    .line 1925
    invoke-direct {v6, v7}, La/ctu;-><init>(La/rkr0;)V

    .line 1926
    .line 1927
    .line 1928
    invoke-direct {v0, v1, v4, v5, v6}, La/nhf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1929
    .line 1930
    .line 1931
    new-instance v1, La/hru;

    .line 1932
    .line 1933
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v4

    .line 1937
    invoke-direct {v1, v4}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 1938
    .line 1939
    .line 1940
    new-instance v4, La/pyu;

    .line 1941
    .line 1942
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v5

    .line 1946
    invoke-direct {v4, v5}, La/pyu;-><init>(Ljava/lang/Object;)V

    .line 1947
    .line 1948
    .line 1949
    new-instance v5, La/cyu;

    .line 1950
    .line 1951
    new-instance v6, La/usc;

    .line 1952
    .line 1953
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v7

    .line 1957
    invoke-direct {v6, v7}, La/usc;-><init>(La/rkr0;)V

    .line 1958
    .line 1959
    .line 1960
    new-instance v7, La/yfu;

    .line 1961
    .line 1962
    move-object/from16 v29, v0

    .line 1963
    .line 1964
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v0

    .line 1968
    invoke-direct {v7, v0}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 1969
    .line 1970
    .line 1971
    new-instance v0, La/hru;

    .line 1972
    .line 1973
    move-object/from16 v30, v1

    .line 1974
    .line 1975
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v1

    .line 1979
    invoke-direct {v0, v1}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 1980
    .line 1981
    .line 1982
    invoke-direct {v5, v6, v7, v0}, La/cyu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1983
    .line 1984
    .line 1985
    new-instance v0, La/g2v;

    .line 1986
    .line 1987
    iget-object v1, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1988
    .line 1989
    check-cast v1, La/g45;

    .line 1990
    .line 1991
    invoke-virtual {v1}, La/g45;->y()La/ahu;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v1

    .line 1995
    invoke-direct {v0, v1}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 1996
    .line 1997
    .line 1998
    iget-object v1, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1999
    .line 2000
    check-cast v1, La/g45;

    .line 2001
    .line 2002
    invoke-virtual {v1}, La/g45;->E()La/nou;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v1

    .line 2006
    iget-object v6, v8, La/v5i;->p:Ljava/lang/Object;

    .line 2007
    .line 2008
    check-cast v6, La/fvt0;

    .line 2009
    .line 2010
    iget-object v7, v8, La/v5i;->b:Ljava/lang/Object;

    .line 2011
    .line 2012
    move-object/from16 v31, v7

    .line 2013
    .line 2014
    check-cast v31, La/ctf0;

    .line 2015
    .line 2016
    iget-object v7, v8, La/v5i;->c:Ljava/lang/Object;

    .line 2017
    .line 2018
    move-object/from16 v32, v7

    .line 2019
    .line 2020
    check-cast v32, La/duj;

    .line 2021
    .line 2022
    iget-object v7, v8, La/v5i;->q:Ljava/lang/Object;

    .line 2023
    .line 2024
    move-object/from16 v33, v7

    .line 2025
    .line 2026
    check-cast v33, La/ouu;

    .line 2027
    .line 2028
    iget-object v7, v8, La/v5i;->r:Ljava/lang/Object;

    .line 2029
    .line 2030
    check-cast v7, La/poq0;

    .line 2031
    .line 2032
    iget-object v7, v7, La/poq0;->a:La/jxi;

    .line 2033
    .line 2034
    invoke-virtual {v7}, La/jxi;->d()La/r8i;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v34

    .line 2038
    iget-object v2, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 2039
    .line 2040
    check-cast v2, La/g45;

    .line 2041
    .line 2042
    invoke-virtual {v2}, La/g45;->g()La/xex;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v35

    .line 2046
    new-instance v2, La/zpu;

    .line 2047
    .line 2048
    iget-object v7, v8, La/v5i;->s:Ljava/lang/Object;

    .line 2049
    .line 2050
    check-cast v7, La/rou;

    .line 2051
    .line 2052
    move-object/from16 v36, v0

    .line 2053
    .line 2054
    new-instance v0, La/bzu;

    .line 2055
    .line 2056
    move-object/from16 v37, v1

    .line 2057
    .line 2058
    new-instance v1, La/yuu;

    .line 2059
    .line 2060
    move-object/from16 v38, v4

    .line 2061
    .line 2062
    new-instance v4, La/w4p0;

    .line 2063
    .line 2064
    move-object/from16 v39, v5

    .line 2065
    .line 2066
    iget-object v5, v8, La/v5i;->i:Ljava/lang/Object;

    .line 2067
    .line 2068
    check-cast v5, La/gii0;

    .line 2069
    .line 2070
    move-object/from16 v40, v9

    .line 2071
    .line 2072
    const/4 v9, 0x3

    .line 2073
    invoke-direct {v4, v5, v9}, La/w4p0;-><init>(La/gii0;B)V

    .line 2074
    .line 2075
    .line 2076
    iget-object v5, v8, La/v5i;->t:Ljava/lang/Object;

    .line 2077
    .line 2078
    check-cast v5, La/dlr0;

    .line 2079
    .line 2080
    iget-object v9, v8, La/v5i;->l:Ljava/lang/Object;

    .line 2081
    .line 2082
    check-cast v9, La/knf0;

    .line 2083
    .line 2084
    invoke-direct {v1, v4, v5, v9}, La/yuu;-><init>(La/w4p0;La/dlr0;La/knf0;)V

    .line 2085
    .line 2086
    .line 2087
    const/16 v4, 0x19

    .line 2088
    .line 2089
    invoke-direct {v0, v1, v4}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 2090
    .line 2091
    .line 2092
    const/16 v1, 0x12

    .line 2093
    .line 2094
    invoke-direct {v2, v7, v0, v1}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2095
    .line 2096
    .line 2097
    iget-object v0, v6, La/fvt0;->a:Ljava/lang/Object;

    .line 2098
    .line 2099
    check-cast v0, La/o3c;

    .line 2100
    .line 2101
    invoke-virtual {v0}, La/o3c;->w()La/pmi0;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v0

    .line 2105
    new-instance v1, La/zqc;

    .line 2106
    .line 2107
    invoke-virtual {v8}, La/v5i;->n()La/pzu;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v4

    .line 2111
    invoke-direct {v1, v4}, La/zqc;-><init>(La/rkr0;)V

    .line 2112
    .line 2113
    .line 2114
    iget-object v4, v8, La/v5i;->u:Ljava/lang/Object;

    .line 2115
    .line 2116
    check-cast v4, La/wyu;

    .line 2117
    .line 2118
    new-instance v5, La/lk5;

    .line 2119
    .line 2120
    iget-object v3, v3, La/iw20;->a:Ljava/lang/Object;

    .line 2121
    .line 2122
    check-cast v3, La/uii;

    .line 2123
    .line 2124
    invoke-virtual {v3}, La/uii;->r()La/pru;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v3

    .line 2128
    iget-object v7, v8, La/v5i;->d:Ljava/lang/Object;

    .line 2129
    .line 2130
    check-cast v7, La/r9u;

    .line 2131
    .line 2132
    const/4 v9, 0x3

    .line 2133
    invoke-direct {v5, v3, v7, v9}, La/lk5;-><init>(La/pru;La/r9u;B)V

    .line 2134
    .line 2135
    .line 2136
    move-object/from16 v8, v19

    .line 2137
    .line 2138
    move-object/from16 v16, v20

    .line 2139
    .line 2140
    move-object/from16 v17, v21

    .line 2141
    .line 2142
    move-object/from16 v21, v23

    .line 2143
    .line 2144
    move-object/from16 v20, v25

    .line 2145
    .line 2146
    move-object/from16 v23, v26

    .line 2147
    .line 2148
    move-object/from16 v19, v27

    .line 2149
    .line 2150
    move-object/from16 v7, v28

    .line 2151
    .line 2152
    move-object/from16 v25, v30

    .line 2153
    .line 2154
    move-object/from16 v28, v36

    .line 2155
    .line 2156
    move-object/from16 v26, v38

    .line 2157
    .line 2158
    move-object/from16 v27, v39

    .line 2159
    .line 2160
    move-object/from16 v9, v40

    .line 2161
    .line 2162
    move-object/from16 v38, v1

    .line 2163
    .line 2164
    move-object/from16 v36, v2

    .line 2165
    .line 2166
    move-object/from16 v39, v4

    .line 2167
    .line 2168
    move-object/from16 v40, v5

    .line 2169
    .line 2170
    move-object/from16 v30, v6

    .line 2171
    .line 2172
    move-object/from16 v5, v22

    .line 2173
    .line 2174
    move-object/from16 v22, v24

    .line 2175
    .line 2176
    move-object/from16 v24, v29

    .line 2177
    .line 2178
    move-object/from16 v29, v37

    .line 2179
    .line 2180
    move-object/from16 v6, p0

    .line 2181
    .line 2182
    move-object/from16 v37, v0

    .line 2183
    .line 2184
    invoke-direct/range {v5 .. v40}, La/njr0;-><init>(La/m1e;La/mne;La/i1w0;La/sa10;La/yk00;La/khf0;La/f6k;La/yk00;La/ctu;La/ctu;La/g2v;La/bzu;La/pru;La/xsu;La/reu;La/w4p0;La/usc;La/zqc;La/nhf0;La/hru;La/pyu;La/cyu;La/g2v;La/nou;La/fvt0;La/ctf0;La/duj;La/ouu;La/r8i;La/xex;La/zpu;La/pmi0;La/zqc;La/wyu;La/lk5;)V

    .line 2185
    .line 2186
    .line 2187
    return-object v5

    .line 2188
    nop

    .line 2189
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
