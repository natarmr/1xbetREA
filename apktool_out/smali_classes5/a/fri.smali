.class public final La/fri;
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
    iput-byte p2, p0, La/fri;->a:B

    iput-object p1, p0, La/fri;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fri;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v1, La/pti;

    .line 11
    .line 12
    invoke-direct {v1, v0}, La/pti;-><init>(La/fri;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    new-instance v1, La/nti;

    .line 17
    .line 18
    invoke-direct {v1, v0}, La/nti;-><init>(La/fri;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_1
    new-instance v1, La/lti;

    .line 23
    .line 24
    invoke-direct {v1, v0}, La/lti;-><init>(La/fri;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_2
    new-instance v1, La/kti;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/kti;-><init>(La/fri;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_3
    new-instance v1, La/iti;

    .line 35
    .line 36
    invoke-direct {v1, v0}, La/iti;-><init>(La/fri;)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_4
    new-instance v1, La/eti;

    .line 41
    .line 42
    invoke-direct {v1, v0}, La/eti;-><init>(La/fri;)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :pswitch_5
    new-instance v1, La/ati;

    .line 47
    .line 48
    invoke-direct {v1, v0}, La/ati;-><init>(La/fri;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :pswitch_6
    move-object v0, v2

    .line 53
    new-instance v2, La/goh0;

    .line 54
    .line 55
    check-cast v0, La/uii;

    .line 56
    .line 57
    iget-object v1, v0, La/uii;->b:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v3, v1

    .line 60
    check-cast v3, La/i1w0;

    .line 61
    .line 62
    iget-object v1, v0, La/uii;->c:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v4, v1

    .line 65
    check-cast v4, La/nqh0;

    .line 66
    .line 67
    iget-object v1, v0, La/uii;->d:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v5, v1

    .line 70
    check-cast v5, La/ctf0;

    .line 71
    .line 72
    iget-object v1, v0, La/uii;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/iw20;

    .line 75
    .line 76
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/uii;

    .line 79
    .line 80
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La/cad;

    .line 87
    .line 88
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/psc;

    .line 91
    .line 92
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-direct/range {v2 .. v7}, La/goh0;-><init>(La/i1w0;La/nqh0;La/ctf0;La/pru;La/mne;)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :pswitch_7
    new-instance v1, La/usi;

    .line 104
    .line 105
    invoke-direct {v1, v0}, La/usi;-><init>(La/fri;)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :pswitch_8
    move-object v0, v2

    .line 110
    new-instance v1, La/hlh0;

    .line 111
    .line 112
    move-object v2, v0

    .line 113
    check-cast v2, La/tsi;

    .line 114
    .line 115
    iget-object v0, v2, La/tsi;->a:Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 116
    .line 117
    iget-object v3, v2, La/tsi;->b:La/ctf0;

    .line 118
    .line 119
    iget-object v4, v2, La/tsi;->c:La/mne;

    .line 120
    .line 121
    iget-object v2, v2, La/tsi;->d:La/lef0;

    .line 122
    .line 123
    iget-object v2, v2, La/lef0;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, La/gbi;

    .line 126
    .line 127
    new-instance v5, La/rsu;

    .line 128
    .line 129
    invoke-virtual {v2}, La/gbi;->J()La/n660;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-direct {v5, v2}, La/rsu;-><init>(La/n660;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v0, v3, v4, v5}, La/hlh0;-><init>(Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;La/ctf0;La/mne;La/rsu;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :pswitch_9
    move-object v0, v2

    .line 141
    new-instance v6, La/cxg0;

    .line 142
    .line 143
    move-object v2, v0

    .line 144
    check-cast v2, La/v5i;

    .line 145
    .line 146
    iget-object v0, v2, La/v5i;->e:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, La/iw20;

    .line 149
    .line 150
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, La/uii;

    .line 153
    .line 154
    invoke-virtual {v0}, La/uii;->r()La/pru;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    new-instance v8, La/cu;

    .line 159
    .line 160
    iget-object v0, v2, La/v5i;->o:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, La/cad;

    .line 163
    .line 164
    iget-object v1, v0, La/cad;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, La/psc;

    .line 167
    .line 168
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    new-instance v3, La/mii0;

    .line 176
    .line 177
    iget-object v4, v0, La/cad;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v4, La/psc;

    .line 180
    .line 181
    invoke-virtual {v4}, La/psc;->h()La/mne;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    new-instance v5, La/ok50;

    .line 189
    .line 190
    iget-object v9, v2, La/v5i;->g:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v9, La/gii0;

    .line 193
    .line 194
    const/16 v10, 0xf

    .line 195
    .line 196
    invoke-direct {v5, v9, v10}, La/ok50;-><init>(La/gii0;B)V

    .line 197
    .line 198
    .line 199
    iget-object v11, v2, La/v5i;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v11, La/knf0;

    .line 202
    .line 203
    iget-object v12, v2, La/v5i;->i:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v12, La/btt0;

    .line 206
    .line 207
    invoke-direct {v3, v4, v5, v11, v12}, La/mii0;-><init>(La/mne;La/ok50;La/knf0;La/btt0;)V

    .line 208
    .line 209
    .line 210
    iget-object v4, v2, La/v5i;->j:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v4, La/gst0;

    .line 213
    .line 214
    invoke-direct {v8, v1, v3, v4}, La/cu;-><init>(La/mne;La/mii0;La/gst0;)V

    .line 215
    .line 216
    .line 217
    new-instance v13, La/z220;

    .line 218
    .line 219
    new-instance v14, La/kd30;

    .line 220
    .line 221
    new-instance v1, La/mii0;

    .line 222
    .line 223
    iget-object v3, v0, La/cad;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v3, La/psc;

    .line 226
    .line 227
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    new-instance v5, La/ok50;

    .line 235
    .line 236
    invoke-direct {v5, v9, v10}, La/ok50;-><init>(La/gii0;B)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v1, v3, v5, v11, v12}, La/mii0;-><init>(La/mne;La/ok50;La/knf0;La/btt0;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v14, v1, v4}, La/kd30;-><init>(La/mii0;La/gst0;)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v2, La/v5i;->k:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, La/wsf0;

    .line 248
    .line 249
    iget-object v3, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v3, La/g45;

    .line 252
    .line 253
    invoke-virtual {v3}, La/g45;->q()La/nrt;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    invoke-virtual {v1}, La/wsf0;->a()La/ilt0;

    .line 258
    .line 259
    .line 260
    move-result-object v16

    .line 261
    invoke-virtual {v1}, La/wsf0;->b()La/ot;

    .line 262
    .line 263
    .line 264
    move-result-object v17

    .line 265
    const/16 v18, 0x13

    .line 266
    .line 267
    invoke-direct/range {v13 .. v18}, La/z220;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 268
    .line 269
    .line 270
    new-instance v10, La/wwv;

    .line 271
    .line 272
    new-instance v14, La/rrd;

    .line 273
    .line 274
    iget-object v1, v0, La/cad;->b:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, La/psc;

    .line 277
    .line 278
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 279
    .line 280
    .line 281
    move-result-object v15

    .line 282
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    new-instance v1, La/pyu;

    .line 286
    .line 287
    const/16 v3, 0xc

    .line 288
    .line 289
    invoke-direct {v1, v9, v3}, La/pyu;-><init>(La/gii0;B)V

    .line 290
    .line 291
    .line 292
    new-instance v3, La/g2v;

    .line 293
    .line 294
    invoke-direct {v3, v9}, La/g2v;-><init>(La/gii0;)V

    .line 295
    .line 296
    .line 297
    new-instance v4, La/dpi0;

    .line 298
    .line 299
    const/16 v5, 0x16

    .line 300
    .line 301
    invoke-direct {v4, v9, v5}, La/dpi0;-><init>(La/gii0;B)V

    .line 302
    .line 303
    .line 304
    iget-object v5, v2, La/v5i;->l:Ljava/lang/Object;

    .line 305
    .line 306
    move-object/from16 v19, v5

    .line 307
    .line 308
    check-cast v19, La/tnm0;

    .line 309
    .line 310
    iget-object v5, v2, La/v5i;->m:Ljava/lang/Object;

    .line 311
    .line 312
    move-object/from16 v20, v5

    .line 313
    .line 314
    check-cast v20, La/m0w;

    .line 315
    .line 316
    new-instance v5, La/y2m0;

    .line 317
    .line 318
    const/16 v9, 0x14

    .line 319
    .line 320
    invoke-direct {v5, v9}, La/y2m0;-><init>(B)V

    .line 321
    .line 322
    .line 323
    iget-object v9, v2, La/v5i;->h:Ljava/lang/Object;

    .line 324
    .line 325
    move-object/from16 v22, v9

    .line 326
    .line 327
    check-cast v22, La/knf0;

    .line 328
    .line 329
    iget-object v9, v2, La/v5i;->i:Ljava/lang/Object;

    .line 330
    .line 331
    move-object/from16 v23, v9

    .line 332
    .line 333
    check-cast v23, La/btt0;

    .line 334
    .line 335
    move-object/from16 v16, v1

    .line 336
    .line 337
    move-object/from16 v17, v3

    .line 338
    .line 339
    move-object/from16 v18, v4

    .line 340
    .line 341
    move-object/from16 v21, v5

    .line 342
    .line 343
    invoke-direct/range {v14 .. v23}, La/rrd;-><init>(La/mne;La/pyu;La/g2v;La/dpi0;La/tnm0;La/m0w;La/y2m0;La/knf0;La/btt0;)V

    .line 344
    .line 345
    .line 346
    invoke-direct {v10, v14}, La/wwv;-><init>(La/rrd;)V

    .line 347
    .line 348
    .line 349
    iget-object v1, v2, La/v5i;->n:Ljava/lang/Object;

    .line 350
    .line 351
    move-object v11, v1

    .line 352
    check-cast v11, La/m1e;

    .line 353
    .line 354
    new-instance v12, La/b4j;

    .line 355
    .line 356
    iget-object v1, v2, La/v5i;->p:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v1, La/kt2;

    .line 359
    .line 360
    const/4 v3, 0x1

    .line 361
    invoke-direct {v12, v1, v3}, La/b4j;-><init>(La/kt2;B)V

    .line 362
    .line 363
    .line 364
    iget-object v4, v2, La/v5i;->q:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v4, La/sa10;

    .line 367
    .line 368
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, La/psc;

    .line 371
    .line 372
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 373
    .line 374
    .line 375
    move-result-object v14

    .line 376
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    iget-object v0, v2, La/v5i;->f:Ljava/lang/Object;

    .line 380
    .line 381
    move-object v15, v0

    .line 382
    check-cast v15, La/i1w0;

    .line 383
    .line 384
    iget-object v0, v2, La/v5i;->c:Ljava/lang/Object;

    .line 385
    .line 386
    move-object/from16 v16, v0

    .line 387
    .line 388
    check-cast v16, La/duj;

    .line 389
    .line 390
    iget-object v0, v2, La/v5i;->b:Ljava/lang/Object;

    .line 391
    .line 392
    move-object/from16 v17, v0

    .line 393
    .line 394
    check-cast v17, La/ctf0;

    .line 395
    .line 396
    new-instance v0, La/nj7;

    .line 397
    .line 398
    new-instance v5, La/b4j;

    .line 399
    .line 400
    invoke-direct {v5, v1, v3}, La/b4j;-><init>(La/kt2;B)V

    .line 401
    .line 402
    .line 403
    iget-object v1, v2, La/v5i;->r:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v1, La/au0;

    .line 406
    .line 407
    iget-object v3, v2, La/v5i;->s:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v3, Ljava/lang/String;

    .line 410
    .line 411
    invoke-direct {v0, v5, v1, v3}, La/nj7;-><init>(La/b4j;La/au0;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    iget-object v1, v2, La/v5i;->t:Ljava/lang/Object;

    .line 415
    .line 416
    move-object/from16 v19, v1

    .line 417
    .line 418
    check-cast v19, La/n3w;

    .line 419
    .line 420
    iget-object v1, v2, La/v5i;->u:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v1, Ljava/lang/Boolean;

    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 425
    .line 426
    .line 427
    move-result v20

    .line 428
    iget-object v1, v2, La/v5i;->d:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, Ljava/lang/Long;

    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 433
    .line 434
    .line 435
    move-result-wide v21

    .line 436
    move-object/from16 v18, v0

    .line 437
    .line 438
    move-object v9, v13

    .line 439
    move-object v13, v4

    .line 440
    invoke-direct/range {v6 .. v22}, La/cxg0;-><init>(La/pru;La/cu;La/z220;La/wwv;La/m1e;La/b4j;La/sa10;La/mne;La/i1w0;La/duj;La/ctf0;La/nj7;La/n3w;ZJ)V

    .line 441
    .line 442
    .line 443
    return-object v6

    .line 444
    :pswitch_a
    move-object v0, v2

    .line 445
    new-instance v7, La/rug0;

    .line 446
    .line 447
    move-object v2, v0

    .line 448
    check-cast v2, La/xzp;

    .line 449
    .line 450
    iget-object v0, v2, La/xzp;->a:Ljava/lang/Object;

    .line 451
    .line 452
    move-object v8, v0

    .line 453
    check-cast v8, La/ctf0;

    .line 454
    .line 455
    iget-object v0, v2, La/xzp;->b:Ljava/lang/Object;

    .line 456
    .line 457
    move-object v9, v0

    .line 458
    check-cast v9, La/n3w;

    .line 459
    .line 460
    iget-object v0, v2, La/xzp;->c:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Ljava/lang/Boolean;

    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    iget-object v0, v2, La/xzp;->d:Ljava/lang/Object;

    .line 469
    .line 470
    move-object v11, v0

    .line 471
    check-cast v11, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 472
    .line 473
    iget-object v0, v2, La/xzp;->e:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v0, Ljava/lang/Double;

    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 478
    .line 479
    .line 480
    move-result-wide v12

    .line 481
    iget-object v0, v2, La/xzp;->f:Ljava/lang/Object;

    .line 482
    .line 483
    move-object v14, v0

    .line 484
    check-cast v14, La/m1e;

    .line 485
    .line 486
    invoke-direct/range {v7 .. v14}, La/rug0;-><init>(La/ctf0;La/n3w;ZLorg/xplatform/bethistory/sale/presentation/SaleDataModel;DLa/m1e;)V

    .line 487
    .line 488
    .line 489
    return-object v7

    .line 490
    :pswitch_b
    new-instance v1, La/osi;

    .line 491
    .line 492
    invoke-direct {v1, v0}, La/osi;-><init>(La/fri;)V

    .line 493
    .line 494
    .line 495
    return-object v1

    .line 496
    :pswitch_c
    move-object v0, v2

    .line 497
    new-instance v2, La/pbg0;

    .line 498
    .line 499
    check-cast v0, La/g45;

    .line 500
    .line 501
    new-instance v3, La/yfu;

    .line 502
    .line 503
    new-instance v1, La/gxu;

    .line 504
    .line 505
    iget-object v4, v0, La/g45;->a:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v4, La/knf0;

    .line 508
    .line 509
    new-instance v5, La/jw20;

    .line 510
    .line 511
    iget-object v6, v0, La/g45;->b:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v6, La/gii0;

    .line 514
    .line 515
    const/16 v7, 0x1b

    .line 516
    .line 517
    invoke-direct {v5, v6, v7}, La/jw20;-><init>(La/gii0;B)V

    .line 518
    .line 519
    .line 520
    iget-object v6, v0, La/g45;->c:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v6, La/btt0;

    .line 523
    .line 524
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 531
    .line 532
    .line 533
    iput-object v4, v1, La/gxu;->a:Ljava/lang/Object;

    .line 534
    .line 535
    iput-object v5, v1, La/gxu;->b:Ljava/lang/Object;

    .line 536
    .line 537
    iput-object v6, v1, La/gxu;->c:Ljava/lang/Object;

    .line 538
    .line 539
    invoke-direct {v3, v1}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, La/g45;->d:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v1, La/cad;

    .line 545
    .line 546
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v1, La/psc;

    .line 549
    .line 550
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    iget-object v1, v0, La/g45;->e:Ljava/lang/Object;

    .line 558
    .line 559
    move-object v5, v1

    .line 560
    check-cast v5, La/i1w0;

    .line 561
    .line 562
    iget-object v1, v0, La/g45;->f:Ljava/lang/Object;

    .line 563
    .line 564
    move-object v6, v1

    .line 565
    check-cast v6, La/j1q0;

    .line 566
    .line 567
    iget-object v1, v0, La/g45;->g:Ljava/lang/Object;

    .line 568
    .line 569
    move-object v7, v1

    .line 570
    check-cast v7, La/duj;

    .line 571
    .line 572
    iget-object v0, v0, La/g45;->h:Ljava/lang/Object;

    .line 573
    .line 574
    move-object v8, v0

    .line 575
    check-cast v8, La/sa10;

    .line 576
    .line 577
    invoke-direct/range {v2 .. v8}, La/pbg0;-><init>(La/yfu;La/mne;La/i1w0;La/j1q0;La/duj;La/sa10;)V

    .line 578
    .line 579
    .line 580
    return-object v2

    .line 581
    :pswitch_d
    new-instance v1, La/gsi;

    .line 582
    .line 583
    invoke-direct {v1, v0}, La/gsi;-><init>(La/fri;)V

    .line 584
    .line 585
    .line 586
    return-object v1

    .line 587
    :pswitch_e
    new-instance v1, La/csi;

    .line 588
    .line 589
    invoke-direct {v1, v0}, La/csi;-><init>(La/fri;)V

    .line 590
    .line 591
    .line 592
    return-object v1

    .line 593
    :pswitch_f
    new-instance v1, La/asi;

    .line 594
    .line 595
    invoke-direct {v1, v0}, La/asi;-><init>(La/fri;)V

    .line 596
    .line 597
    .line 598
    return-object v1

    .line 599
    :pswitch_10
    move-object v0, v2

    .line 600
    new-instance v1, La/cvf0;

    .line 601
    .line 602
    move-object v2, v0

    .line 603
    check-cast v2, La/zri;

    .line 604
    .line 605
    iget-object v0, v2, La/zri;->b:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, La/i1w0;

    .line 608
    .line 609
    invoke-direct {v1, v0}, La/cvf0;-><init>(La/i1w0;)V

    .line 610
    .line 611
    .line 612
    return-object v1

    .line 613
    :pswitch_11
    new-instance v1, La/yri;

    .line 614
    .line 615
    invoke-direct {v1, v0}, La/yri;-><init>(La/fri;)V

    .line 616
    .line 617
    .line 618
    return-object v1

    .line 619
    :pswitch_12
    new-instance v1, La/uri;

    .line 620
    .line 621
    invoke-direct {v1, v0}, La/uri;-><init>(La/fri;)V

    .line 622
    .line 623
    .line 624
    return-object v1

    .line 625
    :pswitch_13
    move-object v0, v2

    .line 626
    new-instance v2, La/rgf0;

    .line 627
    .line 628
    check-cast v0, La/uii;

    .line 629
    .line 630
    iget-object v1, v0, La/uii;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v1, La/cad;

    .line 633
    .line 634
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v1, La/psc;

    .line 637
    .line 638
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    iget-object v1, v0, La/uii;->c:Ljava/lang/Object;

    .line 646
    .line 647
    move-object v4, v1

    .line 648
    check-cast v4, La/ctf0;

    .line 649
    .line 650
    iget-object v1, v0, La/uii;->a:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v1, La/iw20;

    .line 653
    .line 654
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v1, La/uii;

    .line 657
    .line 658
    invoke-virtual {v1}, La/uii;->w()La/pyu;

    .line 659
    .line 660
    .line 661
    move-result-object v5

    .line 662
    iget-object v1, v0, La/uii;->d:Ljava/lang/Object;

    .line 663
    .line 664
    move-object v6, v1

    .line 665
    check-cast v6, La/i1w0;

    .line 666
    .line 667
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, La/epi0;

    .line 670
    .line 671
    iget-object v0, v0, La/epi0;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, La/xzp;

    .line 674
    .line 675
    new-instance v7, La/dot;

    .line 676
    .line 677
    iget-object v0, v0, La/xzp;->a:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v0, La/j1q0;

    .line 680
    .line 681
    const/4 v1, 0x2

    .line 682
    invoke-direct {v7, v0, v1}, La/dot;-><init>(La/j1q0;B)V

    .line 683
    .line 684
    .line 685
    invoke-direct/range {v2 .. v7}, La/rgf0;-><init>(La/mne;La/ctf0;La/pyu;La/i1w0;La/dot;)V

    .line 686
    .line 687
    .line 688
    return-object v2

    .line 689
    :pswitch_14
    move-object v0, v2

    .line 690
    new-instance v1, La/yef0;

    .line 691
    .line 692
    move-object v2, v0

    .line 693
    check-cast v2, La/xr;

    .line 694
    .line 695
    iget-object v0, v2, La/xr;->a:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, La/i1w0;

    .line 698
    .line 699
    invoke-direct {v1, v0}, La/yef0;-><init>(La/i1w0;)V

    .line 700
    .line 701
    .line 702
    return-object v1

    .line 703
    :pswitch_15
    new-instance v1, La/sri;

    .line 704
    .line 705
    invoke-direct {v1, v0}, La/sri;-><init>(La/fri;)V

    .line 706
    .line 707
    .line 708
    return-object v1

    .line 709
    :pswitch_16
    new-instance v1, La/qri;

    .line 710
    .line 711
    invoke-direct {v1, v0}, La/qri;-><init>(La/fri;)V

    .line 712
    .line 713
    .line 714
    return-object v1

    .line 715
    :pswitch_17
    new-instance v1, La/ori;

    .line 716
    .line 717
    invoke-direct {v1, v0}, La/ori;-><init>(La/fri;)V

    .line 718
    .line 719
    .line 720
    return-object v1

    .line 721
    :pswitch_18
    new-instance v1, La/mri;

    .line 722
    .line 723
    invoke-direct {v1, v0}, La/mri;-><init>(La/fri;)V

    .line 724
    .line 725
    .line 726
    return-object v1

    .line 727
    :pswitch_19
    move-object v0, v2

    .line 728
    new-instance v2, La/d7f0;

    .line 729
    .line 730
    check-cast v0, La/lri;

    .line 731
    .line 732
    iget-object v1, v0, La/lri;->a:Ljava/lang/Object;

    .line 733
    .line 734
    move-object v3, v1

    .line 735
    check-cast v3, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 736
    .line 737
    iget-object v1, v0, La/lri;->b:Ljava/lang/Object;

    .line 738
    .line 739
    move-object v4, v1

    .line 740
    check-cast v4, La/xte0;

    .line 741
    .line 742
    iget-object v1, v0, La/lri;->c:Ljava/lang/Object;

    .line 743
    .line 744
    move-object v5, v1

    .line 745
    check-cast v5, La/nr;

    .line 746
    .line 747
    iget-object v1, v0, La/lri;->d:Ljava/lang/Object;

    .line 748
    .line 749
    move-object v6, v1

    .line 750
    check-cast v6, La/je;

    .line 751
    .line 752
    iget-object v1, v0, La/lri;->e:Ljava/lang/Object;

    .line 753
    .line 754
    move-object v7, v1

    .line 755
    check-cast v7, La/ctf0;

    .line 756
    .line 757
    iget-object v1, v0, La/lri;->f:Ljava/lang/Object;

    .line 758
    .line 759
    move-object v8, v1

    .line 760
    check-cast v8, La/rrc;

    .line 761
    .line 762
    iget-object v1, v0, La/lri;->g:Ljava/lang/Object;

    .line 763
    .line 764
    move-object v9, v1

    .line 765
    check-cast v9, La/eru;

    .line 766
    .line 767
    iget-object v1, v0, La/lri;->h:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v1, La/cad;

    .line 770
    .line 771
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v1, La/psc;

    .line 774
    .line 775
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 776
    .line 777
    .line 778
    move-result-object v10

    .line 779
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    iget-object v1, v0, La/lri;->i:Ljava/lang/Object;

    .line 783
    .line 784
    move-object v11, v1

    .line 785
    check-cast v11, La/i1w0;

    .line 786
    .line 787
    iget-object v1, v0, La/lri;->j:Ljava/lang/Object;

    .line 788
    .line 789
    move-object v12, v1

    .line 790
    check-cast v12, La/bk3;

    .line 791
    .line 792
    iget-object v1, v0, La/lri;->k:Ljava/lang/Object;

    .line 793
    .line 794
    move-object v13, v1

    .line 795
    check-cast v13, La/f4u;

    .line 796
    .line 797
    iget-object v1, v0, La/lri;->l:Ljava/lang/Object;

    .line 798
    .line 799
    move-object v14, v1

    .line 800
    check-cast v14, La/lrc;

    .line 801
    .line 802
    iget-object v1, v0, La/lri;->m:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v1, La/ok50;

    .line 805
    .line 806
    iget-object v1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v1, La/v8i;

    .line 809
    .line 810
    invoke-virtual {v1}, La/v8i;->a()La/im4;

    .line 811
    .line 812
    .line 813
    move-result-object v15

    .line 814
    iget-object v1, v0, La/lri;->n:Ljava/lang/Object;

    .line 815
    .line 816
    move-object/from16 v16, v1

    .line 817
    .line 818
    check-cast v16, La/pru;

    .line 819
    .line 820
    iget-object v1, v0, La/lri;->o:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v1, La/hn4;

    .line 823
    .line 824
    invoke-interface {v1}, La/hn4;->c()La/uyn;

    .line 825
    .line 826
    .line 827
    move-result-object v17

    .line 828
    iget-object v1, v0, La/lri;->p:Ljava/lang/Object;

    .line 829
    .line 830
    move-object/from16 v18, v1

    .line 831
    .line 832
    check-cast v18, La/cmt;

    .line 833
    .line 834
    iget-object v1, v0, La/lri;->q:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v1, La/ilp0;

    .line 837
    .line 838
    iget-object v1, v1, La/ilp0;->a:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v1, La/es;

    .line 841
    .line 842
    invoke-virtual {v1}, La/es;->k()La/drm0;

    .line 843
    .line 844
    .line 845
    move-result-object v19

    .line 846
    iget-object v1, v0, La/lri;->r:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v1, La/wsf0;

    .line 849
    .line 850
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v1, La/g45;

    .line 853
    .line 854
    invoke-virtual {v1}, La/g45;->E()La/nou;

    .line 855
    .line 856
    .line 857
    move-result-object v20

    .line 858
    iget-object v1, v0, La/lri;->s:Ljava/lang/Object;

    .line 859
    .line 860
    move-object/from16 v21, v1

    .line 861
    .line 862
    check-cast v21, La/rou;

    .line 863
    .line 864
    iget-object v1, v0, La/lri;->t:Ljava/lang/Object;

    .line 865
    .line 866
    move-object/from16 v22, v1

    .line 867
    .line 868
    check-cast v22, La/cyh;

    .line 869
    .line 870
    iget-object v1, v0, La/lri;->u:Ljava/lang/Object;

    .line 871
    .line 872
    move-object/from16 v23, v1

    .line 873
    .line 874
    check-cast v23, La/z4w0;

    .line 875
    .line 876
    iget-object v1, v0, La/lri;->v:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast v1, La/epi0;

    .line 879
    .line 880
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v1, La/xzp;

    .line 883
    .line 884
    invoke-virtual {v1}, La/xzp;->F()La/ljf0;

    .line 885
    .line 886
    .line 887
    move-result-object v24

    .line 888
    iget-object v1, v0, La/lri;->w:Ljava/lang/Object;

    .line 889
    .line 890
    move-object/from16 v25, v1

    .line 891
    .line 892
    check-cast v25, La/kwd;

    .line 893
    .line 894
    iget-object v1, v0, La/lri;->x:Ljava/lang/Object;

    .line 895
    .line 896
    move-object/from16 v26, v1

    .line 897
    .line 898
    check-cast v26, La/mi70;

    .line 899
    .line 900
    iget-object v0, v0, La/lri;->y:Ljava/lang/Object;

    .line 901
    .line 902
    move-object/from16 v27, v0

    .line 903
    .line 904
    check-cast v27, La/sqx;

    .line 905
    .line 906
    invoke-direct/range {v2 .. v27}, La/d7f0;-><init>(Lorg/xplatform/registration/success/api/RegistrationSuccessParams;La/xte0;La/nr;La/je;La/ctf0;La/rrc;La/eru;La/mne;La/i1w0;La/bk3;La/f4u;La/lrc;La/im4;La/pru;La/uyn;La/cmt;La/drm0;La/nou;La/rou;La/cyh;La/z4w0;La/ljf0;La/kwd;La/mi70;La/sqx;)V

    .line 907
    .line 908
    .line 909
    return-object v2

    .line 910
    :pswitch_1a
    new-instance v1, La/jri;

    .line 911
    .line 912
    invoke-direct {v1, v0}, La/jri;-><init>(La/fri;)V

    .line 913
    .line 914
    .line 915
    return-object v1

    .line 916
    :pswitch_1b
    new-instance v1, La/hri;

    .line 917
    .line 918
    invoke-direct {v1, v0}, La/hri;-><init>(La/fri;)V

    .line 919
    .line 920
    .line 921
    return-object v1

    .line 922
    :pswitch_1c
    move-object v0, v2

    .line 923
    new-instance v2, La/lue0;

    .line 924
    .line 925
    check-cast v0, La/uii;

    .line 926
    .line 927
    iget-object v1, v0, La/uii;->a:Ljava/lang/Object;

    .line 928
    .line 929
    move-object v3, v1

    .line 930
    check-cast v3, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;

    .line 931
    .line 932
    iget-object v1, v0, La/uii;->b:Ljava/lang/Object;

    .line 933
    .line 934
    move-object v4, v1

    .line 935
    check-cast v4, La/ctf0;

    .line 936
    .line 937
    iget-object v1, v0, La/uii;->c:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v1, La/nr00;

    .line 940
    .line 941
    iget-object v1, v1, La/nr00;->a:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v1, La/vqc;

    .line 944
    .line 945
    invoke-virtual {v1}, La/vqc;->a()La/ytt;

    .line 946
    .line 947
    .line 948
    move-result-object v5

    .line 949
    iget-object v1, v0, La/uii;->d:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v1, La/cad;

    .line 952
    .line 953
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v1, La/psc;

    .line 956
    .line 957
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 958
    .line 959
    .line 960
    move-result-object v6

    .line 961
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 962
    .line 963
    .line 964
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 965
    .line 966
    move-object v7, v0

    .line 967
    check-cast v7, La/duj;

    .line 968
    .line 969
    invoke-direct/range {v2 .. v7}, La/lue0;-><init>(Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;La/ctf0;La/ytt;La/mne;La/duj;)V

    .line 970
    .line 971
    .line 972
    return-object v2

    .line 973
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
