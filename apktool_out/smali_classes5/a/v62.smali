.class public final La/v62;
.super La/eg60;
.source "SourceFile"


# instance fields
.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v62;->d:B

    iput-object p1, p0, La/v62;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/eg60;-><init>(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;BZ)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/v62;->d:B

    iput-object p1, p0, La/v62;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/eg60;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/v62;->d:B

    .line 2
    .line 3
    iget-object p0, p0, La/v62;->e:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :sswitch_0
    check-cast p0, Landroidx/fragment/app/e;

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "FragmentManager"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/e;->d()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_1
    check-cast p0, La/c2;

    .line 42
    .line 43
    invoke-virtual {p0}, La/c2;->x()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method public final b()V
    .locals 10

    .line 1
    iget-byte v0, p0, La/v62;->d:B

    .line 2
    .line 3
    sget-object v1, La/kzl0;->a:La/kzl0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/v62;->e:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, La/mvr0;

    .line 12
    .line 13
    sget-object p0, La/mvr0;->W1:La/g9m0;

    .line 14
    .line 15
    invoke-virtual {v3}, La/mvr0;->G0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, La/xur0;->a:La/xur0;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    check-cast v3, La/pir0;

    .line 26
    .line 27
    sget-object p0, La/pir0;->W1:La/j6m0;

    .line 28
    .line 29
    invoke-virtual {v3}, La/pir0;->G0()La/njr0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, La/njr0;->x()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast v3, La/phr0;

    .line 38
    .line 39
    sget-object p0, La/phr0;->W1:La/y2m0;

    .line 40
    .line 41
    invoke-virtual {v3}, La/phr0;->G0()La/fir0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v0, La/tgr0;->a:La/tgr0;

    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/fir0;->O(La/ghr0;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    check-cast v3, La/zqp0;

    .line 52
    .line 53
    sget-object p0, La/zqp0;->V1:La/y2m0;

    .line 54
    .line 55
    invoke-virtual {v3}, La/zqp0;->H0()La/urp0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, La/urp0;->a()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_3
    check-cast v3, La/ypn0;

    .line 64
    .line 65
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 66
    .line 67
    invoke-virtual {v3}, La/ypn0;->N0()La/arn0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object v0, p0, La/arn0;->b:La/i1w0;

    .line 72
    .line 73
    new-instance v1, La/j1l0;

    .line 74
    .line 75
    const/16 v2, 0x1b

    .line 76
    .line 77
    invoke-direct {v1, p0, v2}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_4
    check-cast v3, La/npn0;

    .line 85
    .line 86
    sget-object p0, La/npn0;->j2:La/g9m0;

    .line 87
    .line 88
    invoke-virtual {v3}, La/npn0;->U0()La/tpn0;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget-object v0, p0, La/tpn0;->e:La/i1w0;

    .line 93
    .line 94
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object p0, p0, La/tpn0;->h:La/zx10;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    sget-object v3, La/r040;->k:La/r040;

    .line 104
    .line 105
    const/4 v4, 0x2

    .line 106
    invoke-static {p0, v3, v2, v4}, La/zx10;->k(La/zx10;La/r040;ZI)Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    new-instance v3, La/q0w0;

    .line 111
    .line 112
    invoke-direct {v3, p0}, La/q0w0;-><init>(La/m7h0;)V

    .line 113
    .line 114
    .line 115
    new-instance p0, La/c8d;

    .line 116
    .line 117
    sget-object v4, La/y7d;->a:La/v7d;

    .line 118
    .line 119
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1, p0, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :goto_0
    move-object v1, p0

    .line 127
    check-cast v1, La/paw;

    .line 128
    .line 129
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_0

    .line 134
    .line 135
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, La/oe50;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_0
    return-void

    .line 146
    :pswitch_5
    check-cast v3, La/t0m0;

    .line 147
    .line 148
    sget-object v0, La/t0m0;->Z1:La/gne0;

    .line 149
    .line 150
    iget-boolean v0, v3, La/t0m0;->Q1:Z

    .line 151
    .line 152
    if-eqz v0, :cond_1

    .line 153
    .line 154
    invoke-virtual {v3}, La/t0m0;->G0()La/k3t0;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    invoke-virtual {p0}, La/eg60;->e()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p0}, La/agd;->k()La/jg60;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p0}, La/ef50;->a()V

    .line 178
    .line 179
    .line 180
    :goto_1
    return-void

    .line 181
    :pswitch_6
    check-cast v3, La/syl0;

    .line 182
    .line 183
    iget-boolean v0, v3, La/syl0;->R1:Z

    .line 184
    .line 185
    if-nez v0, :cond_2

    .line 186
    .line 187
    iget-boolean v0, v3, La/syl0;->Q1:Z

    .line 188
    .line 189
    if-eqz v0, :cond_2

    .line 190
    .line 191
    invoke-virtual {v3}, La/syl0;->H0()La/k3t0;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    invoke-virtual {p0}, La/eg60;->e()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p0}, La/agd;->k()La/jg60;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-virtual {p0}, La/ef50;->a()V

    .line 215
    .line 216
    .line 217
    :goto_2
    return-void

    .line 218
    :pswitch_7
    check-cast v3, La/ddl0;

    .line 219
    .line 220
    sget-object p0, La/ddl0;->V1:La/cge0;

    .line 221
    .line 222
    invoke-virtual {v3}, La/ddl0;->J0()La/ndl0;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p0}, La/ndl0;->a()V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_8
    check-cast v3, La/gs70;

    .line 231
    .line 232
    sget-object p0, La/gs70;->r2:La/nh70;

    .line 233
    .line 234
    invoke-virtual {v3}, La/gs70;->P0()La/k3t0;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    sget-object v0, La/xr70;->a:La/xr70;

    .line 239
    .line 240
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 245
    .line 246
    invoke-interface {v3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_a
    check-cast v3, La/rs50;

    .line 251
    .line 252
    sget-object p0, La/rs50;->R1:La/atz;

    .line 253
    .line 254
    invoke-virtual {v3}, La/rs50;->G0()La/k3t0;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    sget-object v0, La/ds50;->a:La/ds50;

    .line 259
    .line 260
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :pswitch_b
    check-cast v3, La/cr50;

    .line 265
    .line 266
    sget-object p0, La/cr50;->R1:La/evz;

    .line 267
    .line 268
    iget-object p0, v3, La/cr50;->L1:La/a8z;

    .line 269
    .line 270
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    check-cast p0, La/k3t0;

    .line 275
    .line 276
    sget-object v0, La/tq50;->a:La/tq50;

    .line 277
    .line 278
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_c
    check-cast v3, La/lp50;

    .line 283
    .line 284
    sget-object p0, La/lp50;->R1:La/uuz;

    .line 285
    .line 286
    iget-object p0, v3, La/lp50;->L1:La/a8z;

    .line 287
    .line 288
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    check-cast p0, La/k3t0;

    .line 293
    .line 294
    sget-object v0, La/wt50;->a:La/wt50;

    .line 295
    .line 296
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_d
    check-cast v3, La/po50;

    .line 301
    .line 302
    sget-object p0, La/po50;->S1:La/htz;

    .line 303
    .line 304
    invoke-virtual {v3}, La/po50;->G0()La/k3t0;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    sget-object v0, La/xn50;->a:La/xn50;

    .line 309
    .line 310
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_e
    check-cast v3, La/ik30;

    .line 315
    .line 316
    sget-object p0, La/ik30;->W1:La/atz;

    .line 317
    .line 318
    invoke-virtual {v3}, La/ik30;->H0()La/zk30;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-virtual {p0}, La/zk30;->x()V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_f
    check-cast v3, La/lkv;

    .line 327
    .line 328
    sget-object p0, La/lkv;->Q1:La/rqt;

    .line 329
    .line 330
    iget-object p0, v3, La/lkv;->M1:La/kiu0;

    .line 331
    .line 332
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    check-cast p0, La/xkv;

    .line 337
    .line 338
    invoke-virtual {p0}, La/xkv;->w()V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_10
    check-cast v3, Landroidx/fragment/app/e;

    .line 343
    .line 344
    const/4 p0, 0x3

    .line 345
    invoke-static {p0}, Landroidx/fragment/app/e;->V(I)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    const-string v1, "FragmentManager"

    .line 350
    .line 351
    if-eqz v0, :cond_3

    .line 352
    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v4, "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "

    .line 356
    .line 357
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 368
    .line 369
    .line 370
    :cond_3
    iget-object v0, v3, Landroidx/fragment/app/e;->j:La/v62;

    .line 371
    .line 372
    iget-object v4, v3, Landroidx/fragment/app/e;->o:Ljava/util/ArrayList;

    .line 373
    .line 374
    const/4 v5, 0x1

    .line 375
    iput-boolean v5, v3, Landroidx/fragment/app/e;->i:Z

    .line 376
    .line 377
    invoke-virtual {v3, v5}, Landroidx/fragment/app/e;->C(Z)Z

    .line 378
    .line 379
    .line 380
    iput-boolean v2, v3, Landroidx/fragment/app/e;->i:Z

    .line 381
    .line 382
    iget-object v6, v3, Landroidx/fragment/app/e;->h:La/zb5;

    .line 383
    .line 384
    if-eqz v6, :cond_d

    .line 385
    .line 386
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    const/4 v7, 0x0

    .line 391
    if-nez v6, :cond_6

    .line 392
    .line 393
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 394
    .line 395
    iget-object v8, v3, Landroidx/fragment/app/e;->h:La/zb5;

    .line 396
    .line 397
    invoke-static {v8}, Landroidx/fragment/app/e;->N(La/zb5;)Ljava/util/HashSet;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    invoke-direct {v6, v8}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    if-eqz v8, :cond_6

    .line 413
    .line 414
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    if-nez v8, :cond_5

    .line 419
    .line 420
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    if-nez v9, :cond_4

    .line 429
    .line 430
    goto :goto_3

    .line 431
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 436
    .line 437
    throw v7

    .line 438
    :cond_5
    invoke-static {}, La/hny;->b()V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_7

    .line 442
    .line 443
    :cond_6
    iget-object v4, v3, Landroidx/fragment/app/e;->h:La/zb5;

    .line 444
    .line 445
    iget-object v4, v4, La/zb5;->a:Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    if-eqz v6, :cond_8

    .line 456
    .line 457
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    check-cast v6, La/h6r;

    .line 462
    .line 463
    iget-object v6, v6, La/h6r;->b:Landroidx/fragment/app/Fragment;

    .line 464
    .line 465
    if-eqz v6, :cond_7

    .line 466
    .line 467
    iput-boolean v2, v6, Landroidx/fragment/app/Fragment;->n:Z

    .line 468
    .line 469
    goto :goto_4

    .line 470
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 471
    .line 472
    iget-object v6, v3, Landroidx/fragment/app/e;->h:La/zb5;

    .line 473
    .line 474
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v3, v4, v2, v5}, Landroidx/fragment/app/e;->i(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    if-eqz v4, :cond_a

    .line 494
    .line 495
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    check-cast v4, La/nxj;

    .line 500
    .line 501
    iget-object v5, v4, La/nxj;->c:Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-static {p0}, Landroidx/fragment/app/e;->V(I)Z

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    if-eqz v6, :cond_9

    .line 508
    .line 509
    const-string v6, "SpecialEffectsController: Completing Back "

    .line 510
    .line 511
    invoke-static {v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 512
    .line 513
    .line 514
    :cond_9
    invoke-virtual {v4, v5}, La/nxj;->k(Ljava/util/ArrayList;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v4, v5}, La/nxj;->c(Ljava/util/ArrayList;)V

    .line 518
    .line 519
    .line 520
    goto :goto_5

    .line 521
    :cond_a
    iget-object v2, v3, Landroidx/fragment/app/e;->h:La/zb5;

    .line 522
    .line 523
    iget-object v2, v2, La/zb5;->a:Ljava/util/ArrayList;

    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    :cond_b
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_c

    .line 534
    .line 535
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, La/h6r;

    .line 540
    .line 541
    iget-object v4, v4, La/h6r;->b:Landroidx/fragment/app/Fragment;

    .line 542
    .line 543
    if-eqz v4, :cond_b

    .line 544
    .line 545
    iget-object v5, v4, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 546
    .line 547
    if-nez v5, :cond_b

    .line 548
    .line 549
    invoke-virtual {v3, v4}, Landroidx/fragment/app/e;->j(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/f;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-virtual {v4}, Landroidx/fragment/app/f;->k()V

    .line 554
    .line 555
    .line 556
    goto :goto_6

    .line 557
    :cond_c
    iput-object v7, v3, Landroidx/fragment/app/e;->h:La/zb5;

    .line 558
    .line 559
    invoke-virtual {v3}, Landroidx/fragment/app/e;->C0()V

    .line 560
    .line 561
    .line 562
    invoke-static {p0}, Landroidx/fragment/app/e;->V(I)Z

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    if-eqz p0, :cond_11

    .line 567
    .line 568
    const-string p0, "Op is being set to null"

    .line 569
    .line 570
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 571
    .line 572
    .line 573
    new-instance p0, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    const-string v2, "OnBackPressedCallback enabled="

    .line 576
    .line 577
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    iget-boolean v0, v0, La/eg60;->b:Z

    .line 581
    .line 582
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    const-string v0, " for  FragmentManager "

    .line 586
    .line 587
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 598
    .line 599
    .line 600
    goto :goto_7

    .line 601
    :cond_d
    iget-boolean v0, v0, La/eg60;->b:Z

    .line 602
    .line 603
    if-eqz v0, :cond_f

    .line 604
    .line 605
    invoke-static {p0}, Landroidx/fragment/app/e;->V(I)Z

    .line 606
    .line 607
    .line 608
    move-result p0

    .line 609
    if-eqz p0, :cond_e

    .line 610
    .line 611
    const-string p0, "Calling popBackStackImmediate via onBackPressed callback"

    .line 612
    .line 613
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 614
    .line 615
    .line 616
    :cond_e
    invoke-virtual {v3}, Landroidx/fragment/app/e;->g0()Z

    .line 617
    .line 618
    .line 619
    goto :goto_7

    .line 620
    :cond_f
    invoke-static {p0}, Landroidx/fragment/app/e;->V(I)Z

    .line 621
    .line 622
    .line 623
    move-result p0

    .line 624
    if-eqz p0, :cond_10

    .line 625
    .line 626
    const-string p0, "Calling onBackPressed via onBackPressed callback"

    .line 627
    .line 628
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 629
    .line 630
    .line 631
    :cond_10
    iget-object p0, v3, Landroidx/fragment/app/e;->g:La/jg60;

    .line 632
    .line 633
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    invoke-virtual {p0}, La/ef50;->a()V

    .line 638
    .line 639
    .line 640
    :cond_11
    :goto_7
    return-void

    .line 641
    :pswitch_11
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 642
    .line 643
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    return-void

    .line 647
    :pswitch_12
    iget-boolean v0, p0, La/eg60;->b:Z

    .line 648
    .line 649
    if-eqz v0, :cond_12

    .line 650
    .line 651
    check-cast v3, La/ayn;

    .line 652
    .line 653
    sget-object v0, La/ayn;->c2:La/sek;

    .line 654
    .line 655
    invoke-virtual {v3}, La/ayn;->I0()La/k3t0;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    sget-object v1, La/uxn;->a:La/uxn;

    .line 660
    .line 661
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {p0, v2}, La/eg60;->f(Z)V

    .line 665
    .line 666
    .line 667
    :cond_12
    return-void

    .line 668
    :pswitch_13
    check-cast v3, La/jdc;

    .line 669
    .line 670
    sget-object p0, La/jdc;->Q1:La/cl5;

    .line 671
    .line 672
    invoke-virtual {v3}, La/jdc;->G0()La/k3t0;

    .line 673
    .line 674
    .line 675
    move-result-object p0

    .line 676
    sget-object v0, La/zcc;->a:La/zcc;

    .line 677
    .line 678
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    return-void

    .line 682
    :pswitch_14
    check-cast v3, La/hgb;

    .line 683
    .line 684
    iget-object v0, v3, La/hgb;->X1:La/jk3;

    .line 685
    .line 686
    if-eqz v0, :cond_13

    .line 687
    .line 688
    iget-object v0, v0, La/jk3;->e:Landroid/view/View;

    .line 689
    .line 690
    check-cast v0, Landroid/widget/FrameLayout;

    .line 691
    .line 692
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    if-nez v0, :cond_13

    .line 697
    .line 698
    goto :goto_8

    .line 699
    :cond_13
    invoke-virtual {v3}, La/hgb;->G0()La/xyq;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    iget-object v0, v0, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 704
    .line 705
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 706
    .line 707
    iget-object v0, v0, La/wf40;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 708
    .line 709
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-nez v0, :cond_14

    .line 714
    .line 715
    invoke-virtual {v3}, La/hgb;->H0()La/jgb;

    .line 716
    .line 717
    .line 718
    move-result-object p0

    .line 719
    invoke-virtual {p0}, La/jgb;->z()V

    .line 720
    .line 721
    .line 722
    goto :goto_9

    .line 723
    :cond_14
    :goto_8
    invoke-virtual {p0}, La/eg60;->e()V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 727
    .line 728
    .line 729
    move-result-object p0

    .line 730
    invoke-virtual {p0}, La/agd;->k()La/jg60;

    .line 731
    .line 732
    .line 733
    move-result-object p0

    .line 734
    invoke-virtual {p0}, La/jg60;->c()La/hg60;

    .line 735
    .line 736
    .line 737
    move-result-object p0

    .line 738
    invoke-virtual {p0}, La/ef50;->a()V

    .line 739
    .line 740
    .line 741
    :goto_9
    return-void

    .line 742
    :pswitch_15
    check-cast v3, La/ut9;

    .line 743
    .line 744
    sget-object p0, La/ut9;->s2:La/bj5;

    .line 745
    .line 746
    invoke-virtual {v3}, La/ut9;->P0()La/k3t0;

    .line 747
    .line 748
    .line 749
    move-result-object p0

    .line 750
    sget-object v0, La/lt9;->a:La/lt9;

    .line 751
    .line 752
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    return-void

    .line 756
    :pswitch_16
    check-cast v3, La/c2;

    .line 757
    .line 758
    invoke-virtual {v3}, La/c2;->y()V

    .line 759
    .line 760
    .line 761
    return-void

    .line 762
    :pswitch_17
    check-cast v3, La/ef2;

    .line 763
    .line 764
    sget-object p0, La/ef2;->V1:La/hfk0;

    .line 765
    .line 766
    invoke-virtual {v3}, La/ef2;->L0()La/k3t0;

    .line 767
    .line 768
    .line 769
    move-result-object p0

    .line 770
    sget-object v0, La/pe2;->a:La/pe2;

    .line 771
    .line 772
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    return-void

    .line 776
    :pswitch_18
    check-cast v3, La/vd2;

    .line 777
    .line 778
    sget-object p0, La/vd2;->R1:La/gfk0;

    .line 779
    .line 780
    iget-object p0, v3, La/vd2;->N1:La/a8z;

    .line 781
    .line 782
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object p0

    .line 786
    check-cast p0, La/k3t0;

    .line 787
    .line 788
    sget-object v0, La/md2;->a:La/md2;

    .line 789
    .line 790
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    return-void

    .line 794
    :pswitch_19
    check-cast v3, La/ia2;

    .line 795
    .line 796
    sget-object p0, La/ia2;->Q1:La/rek0;

    .line 797
    .line 798
    invoke-virtual {v3}, La/ia2;->G0()La/k3t0;

    .line 799
    .line 800
    .line 801
    move-result-object p0

    .line 802
    sget-object v0, La/u92;->a:La/u92;

    .line 803
    .line 804
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    return-void

    .line 808
    :pswitch_1a
    check-cast v3, La/w62;

    .line 809
    .line 810
    sget-object p0, La/w62;->Q1:La/pek0;

    .line 811
    .line 812
    invoke-virtual {v3}, La/w62;->G0()La/k3t0;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    sget-object v0, La/e62;->a:La/e62;

    .line 817
    .line 818
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 819
    .line 820
    .line 821
    return-void

    .line 822
    nop

    .line 823
    :pswitch_data_0
    .packed-switch 0x0
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

.method public c(La/pb5;)V
    .locals 10

    .line 1
    iget-byte v0, p0, La/v62;->d:B

    .line 2
    .line 3
    iget-object p0, p0, La/v62;->e:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :sswitch_0
    check-cast p0, Landroidx/fragment/app/e;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "FragmentManager"

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "

    .line 23
    .line 24
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/e;->h:La/zb5;

    .line 38
    .line 39
    if-eqz v1, :cond_6

    .line 40
    .line 41
    new-instance v1, Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v3, p0, Landroidx/fragment/app/e;->h:La/zb5;

    .line 44
    .line 45
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x1

    .line 54
    invoke-virtual {p0, v1, v3, v4}, Landroidx/fragment/app/e;->i(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, La/nxj;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    iget v5, p1, La/pb5;->c:F

    .line 84
    .line 85
    new-instance v6, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v7, "SpecialEffectsController: Processing Progress "

    .line 88
    .line 89
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object v5, v4, La/nxj;->c:Ljava/util/ArrayList;

    .line 103
    .line 104
    new-instance v6, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_3

    .line 118
    .line 119
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, La/rnk0;

    .line 124
    .line 125
    iget-object v7, v7, La/rnk0;->k:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-static {v6, v7}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Ljava/lang/Iterable;

    .line 136
    .line 137
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    move v7, v3

    .line 146
    :goto_1
    if-ge v7, v6, :cond_1

    .line 147
    .line 148
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, La/qnk0;

    .line 153
    .line 154
    iget-object v9, v4, La/nxj;->a:Landroid/view/ViewGroup;

    .line 155
    .line 156
    invoke-virtual {v8, p1, v9}, La/qnk0;->c(La/pb5;Landroid/view/ViewGroup;)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v7, v7, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    iget-object p0, p0, Landroidx/fragment/app/e;->o:Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_5

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    invoke-static {p0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    throw p0

    .line 180
    :cond_6
    :goto_2
    return-void

    .line 181
    :sswitch_1
    check-cast p0, La/c2;

    .line 182
    .line 183
    invoke-virtual {p0, p1}, La/c2;->z(La/pb5;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method public d(La/pb5;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/v62;->d:B

    .line 2
    .line 3
    iget-object p0, p0, La/v62;->e:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch p1, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :sswitch_0
    check-cast p0, Landroidx/fragment/app/e;

    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {p1}, Landroidx/fragment/app/e;->V(I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "FragmentManager"

    .line 33
    .line 34
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/e;->z()V

    .line 38
    .line 39
    .line 40
    new-instance p1, La/u1r;

    .line 41
    .line 42
    invoke-direct {p1, p0}, La/u1r;-><init>(Landroidx/fragment/app/e;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/e;->A(La/s1r;Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :sswitch_1
    check-cast p0, La/c2;

    .line 51
    .line 52
    invoke-virtual {p0}, La/c2;->A()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method
