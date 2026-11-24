.class public final synthetic La/uwe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/axe;


# direct methods
.method public synthetic constructor <init>(La/axe;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uwe;->a:B

    iput-object p1, p0, La/uwe;->b:La/axe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uwe;->a:B

    .line 4
    .line 5
    const-string v2, "RESULT_POSITION"

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const-string v4, "coupon_start"

    .line 9
    .line 10
    const-string v5, "screen"

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object v0, v0, La/uwe;->b:La/axe;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Landroid/view/View;

    .line 24
    .line 25
    sget-object v2, La/axe;->e2:La/kud;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, La/r7f;->u0()V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, Landroid/view/View;

    .line 43
    .line 44
    sget-object v2, La/axe;->e2:La/kud;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v0, La/r7f;->Y0:La/mne;

    .line 58
    .line 59
    iget-object v4, v2, La/mne;->b:La/dvj;

    .line 60
    .line 61
    sget-object v2, La/n5f;->a:La/n5f;

    .line 62
    .line 63
    new-instance v5, La/d5f;

    .line 64
    .line 65
    invoke-direct {v5, v0, v8, v7}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 66
    .line 67
    .line 68
    const/16 v6, 0xa

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_1
    move-object/from16 v1, p1

    .line 78
    .line 79
    check-cast v1, Landroid/view/View;

    .line 80
    .line 81
    sget-object v2, La/axe;->e2:La/kud;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v1, v0, La/r7f;->K0:La/x20;

    .line 91
    .line 92
    sget-object v2, La/ptn;->a:La/ptn;

    .line 93
    .line 94
    invoke-virtual {v1, v2}, La/x20;->o(La/ptn;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 98
    .line 99
    sget-object v2, La/koc;->a:La/koc;

    .line 100
    .line 101
    invoke-virtual {v1, v2}, La/qu;->c(La/koc;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v0, La/r7f;->V0:La/i1w0;

    .line 105
    .line 106
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v0, v0, La/r7f;->G0:La/std;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v0, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;

    .line 116
    .line 117
    invoke-direct {v0, v7}, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;-><init>(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 121
    .line 122
    .line 123
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 124
    .line 125
    invoke-static {v1, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :goto_0
    move-object v2, v0

    .line 130
    check-cast v2, La/paw;

    .line 131
    .line 132
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_0

    .line 137
    .line 138
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, La/oe50;

    .line 143
    .line 144
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_2
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, Landroid/view/View;

    .line 154
    .line 155
    sget-object v2, La/axe;->e2:La/kud;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, v0, La/r7f;->V0:La/i1w0;

    .line 165
    .line 166
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v3, v0, La/r7f;->F0:La/eke0;

    .line 171
    .line 172
    sget-object v4, La/bhh0;->b:La/bhh0;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v3, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

    .line 178
    .line 179
    invoke-direct {v3, v4}, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;-><init>(La/bhh0;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 183
    .line 184
    .line 185
    iget-object v2, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 186
    .line 187
    invoke-static {v1, v2, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    :goto_1
    move-object v3, v2

    .line 192
    check-cast v3, La/paw;

    .line 193
    .line 194
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_1

    .line 199
    .line 200
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    check-cast v3, La/oe50;

    .line 205
    .line 206
    invoke-virtual {v1, v3}, La/i1w0;->a(La/oe50;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_1
    iget-object v1, v0, La/r7f;->M0:La/s31;

    .line 211
    .line 212
    sget-object v2, La/wgh0;->v:La/wgh0;

    .line 213
    .line 214
    invoke-virtual {v1, v2}, La/s31;->g(La/wgh0;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, v0, La/r7f;->R0:La/cyu;

    .line 218
    .line 219
    const-string v1, "coupon_search"

    .line 220
    .line 221
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_3
    move-object/from16 v1, p1

    .line 228
    .line 229
    check-cast v1, Landroid/view/View;

    .line 230
    .line 231
    sget-object v2, La/axe;->e2:La/kud;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v1, v0, La/r7f;->N0:La/ih5;

    .line 241
    .line 242
    sget-object v2, La/k7k;->r1:La/k7k;

    .line 243
    .line 244
    invoke-virtual {v1, v2}, La/ih5;->f(La/k7k;)V

    .line 245
    .line 246
    .line 247
    iget-object v1, v0, La/r7f;->Q0:La/l7k;

    .line 248
    .line 249
    sget-object v2, La/y1p;->b:La/y1p;

    .line 250
    .line 251
    iget-object v2, v0, La/r7f;->P0:La/cmt;

    .line 252
    .line 253
    invoke-virtual {v2}, La/cmt;->g()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    const-string v3, "empty_coupon"

    .line 258
    .line 259
    invoke-virtual {v1, v3, v2}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iget-object v1, v0, La/r7f;->V0:La/i1w0;

    .line 263
    .line 264
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    new-instance v3, La/s4f;

    .line 269
    .line 270
    invoke-direct {v3, v0, v6}, La/s4f;-><init>(La/r7f;B)V

    .line 271
    .line 272
    .line 273
    new-instance v0, La/a1w0;

    .line 274
    .line 275
    invoke-direct {v0, v3}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 276
    .line 277
    .line 278
    new-instance v3, La/c8d;

    .line 279
    .line 280
    sget-object v4, La/y7d;->a:La/v7d;

    .line 281
    .line 282
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v2, v3, v1, v2, v9}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    :goto_2
    move-object v2, v0

    .line 290
    check-cast v2, La/paw;

    .line 291
    .line 292
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_2

    .line 297
    .line 298
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, La/oe50;

    .line 303
    .line 304
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 305
    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_4
    move-object/from16 v1, p1

    .line 312
    .line 313
    check-cast v1, Landroid/view/View;

    .line 314
    .line 315
    sget-object v2, La/axe;->e2:La/kud;

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 325
    .line 326
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 327
    .line 328
    const-string v2, "reg_page_call"

    .line 329
    .line 330
    invoke-static {v5, v4, v1, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iget-object v1, v0, La/r7f;->O0:La/s64;

    .line 334
    .line 335
    sget-object v2, La/y1p;->j:La/y1p;

    .line 336
    .line 337
    iget-object v3, v0, La/r7f;->P0:La/cmt;

    .line 338
    .line 339
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v1, v2, v3}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 351
    .line 352
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 353
    .line 354
    new-instance v11, La/t4f;

    .line 355
    .line 356
    invoke-direct {v11, v0, v9}, La/t4f;-><init>(La/r7f;B)V

    .line 357
    .line 358
    .line 359
    new-instance v14, La/d5f;

    .line 360
    .line 361
    invoke-direct {v14, v0, v8, v6}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 362
    .line 363
    .line 364
    const/16 v15, 0xa

    .line 365
    .line 366
    const/4 v12, 0x0

    .line 367
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_5
    move-object/from16 v1, p1

    .line 374
    .line 375
    check-cast v1, Landroid/view/View;

    .line 376
    .line 377
    sget-object v2, La/axe;->e2:La/kud;

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 387
    .line 388
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 389
    .line 390
    const-string v2, "login_page_call"

    .line 391
    .line 392
    invoke-static {v5, v4, v1, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    iget-object v1, v0, La/r7f;->O0:La/s64;

    .line 396
    .line 397
    sget-object v2, La/y1p;->b:La/y1p;

    .line 398
    .line 399
    invoke-virtual {v1, v4}, La/s64;->c(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    iget-object v0, v0, La/r7f;->V0:La/i1w0;

    .line 403
    .line 404
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    new-instance v2, La/c8d;

    .line 409
    .line 410
    sget-object v3, La/y7d;->a:La/v7d;

    .line 411
    .line 412
    sget-object v4, La/n0w0;->a:La/n0w0;

    .line 413
    .line 414
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 415
    .line 416
    .line 417
    invoke-static {v1, v2}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    sget-object v3, La/wez;->b:La/wez;

    .line 422
    .line 423
    invoke-static {v3, v2, v0, v1, v9}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    :goto_3
    move-object v2, v1

    .line 428
    check-cast v2, La/paw;

    .line 429
    .line 430
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_3

    .line 435
    .line 436
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    check-cast v2, La/oe50;

    .line 441
    .line 442
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 443
    .line 444
    .line 445
    goto :goto_3

    .line 446
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    return-object v0

    .line 449
    :pswitch_6
    move-object/from16 v1, p1

    .line 450
    .line 451
    check-cast v1, La/xhe0;

    .line 452
    .line 453
    sget-object v2, La/axe;->e2:La/kud;

    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    iget-object v0, v0, La/axe;->X1:La/vyx;

    .line 459
    .line 460
    if-eqz v0, :cond_4

    .line 461
    .line 462
    invoke-virtual {v0, v1}, La/vyx;->s(La/xhe0;)V

    .line 463
    .line 464
    .line 465
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_7
    move-object/from16 v1, p1

    .line 469
    .line 470
    check-cast v1, La/oc9;

    .line 471
    .line 472
    sget-object v2, La/axe;->e2:La/kud;

    .line 473
    .line 474
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    instance-of v2, v1, La/lc9;

    .line 478
    .line 479
    if-eqz v2, :cond_5

    .line 480
    .line 481
    invoke-virtual {v0}, La/axe;->O0()V

    .line 482
    .line 483
    .line 484
    goto :goto_4

    .line 485
    :cond_5
    instance-of v2, v1, La/mc9;

    .line 486
    .line 487
    const/4 v13, 0x0

    .line 488
    if-eqz v2, :cond_6

    .line 489
    .line 490
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    check-cast v1, La/mc9;

    .line 495
    .line 496
    iget-wide v11, v1, La/mc9;->a:J

    .line 497
    .line 498
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    iget-object v1, v10, La/r7f;->Y0:La/mne;

    .line 503
    .line 504
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 505
    .line 506
    sget-object v1, La/o6f;->a:La/o6f;

    .line 507
    .line 508
    new-instance v4, La/qe5;

    .line 509
    .line 510
    const/4 v14, 0x2

    .line 511
    move-object v9, v4

    .line 512
    invoke-direct/range {v9 .. v14}, La/qe5;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 513
    .line 514
    .line 515
    const/16 v5, 0xa

    .line 516
    .line 517
    const/4 v2, 0x0

    .line 518
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 519
    .line 520
    .line 521
    goto :goto_4

    .line 522
    :cond_6
    instance-of v2, v1, La/nc9;

    .line 523
    .line 524
    if-eqz v2, :cond_7

    .line 525
    .line 526
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 527
    .line 528
    .line 529
    move-result-object v10

    .line 530
    check-cast v1, La/nc9;

    .line 531
    .line 532
    iget-wide v11, v1, La/nc9;->a:J

    .line 533
    .line 534
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    iget-object v1, v10, La/r7f;->Y0:La/mne;

    .line 539
    .line 540
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 541
    .line 542
    new-instance v4, La/i5f;

    .line 543
    .line 544
    const/4 v14, 0x3

    .line 545
    move-object v9, v4

    .line 546
    invoke-direct/range {v9 .. v14}, La/i5f;-><init>(La/r7f;JLa/yje;B)V

    .line 547
    .line 548
    .line 549
    const/16 v5, 0xb

    .line 550
    .line 551
    const/4 v1, 0x0

    .line 552
    const/4 v2, 0x0

    .line 553
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 554
    .line 555
    .line 556
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    goto :goto_5

    .line 559
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 560
    .line 561
    .line 562
    :goto_5
    return-object v8

    .line 563
    :pswitch_8
    move-object/from16 v1, p1

    .line 564
    .line 565
    check-cast v1, Landroid/os/Bundle;

    .line 566
    .line 567
    sget-object v2, La/axe;->e2:La/kud;

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    new-instance v2, La/de3;

    .line 581
    .line 582
    invoke-direct {v2, v0, v3}, La/de3;-><init>(Ljava/lang/Object;B)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 586
    .line 587
    .line 588
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 589
    .line 590
    return-object v0

    .line 591
    :pswitch_9
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, Landroid/os/Bundle;

    .line 594
    .line 595
    sget-object v3, La/axe;->e2:La/kud;

    .line 596
    .line 597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    sget-object v3, La/g6f;->a:La/g6f;

    .line 613
    .line 614
    iget-object v4, v0, La/r7f;->Y0:La/mne;

    .line 615
    .line 616
    iget-object v5, v4, La/mne;->b:La/dvj;

    .line 617
    .line 618
    new-instance v6, La/bh0;

    .line 619
    .line 620
    const/16 v4, 0x9

    .line 621
    .line 622
    invoke-direct {v6, v0, v1, v8, v4}, La/bh0;-><init>(La/diu0;ILa/yje;B)V

    .line 623
    .line 624
    .line 625
    const/16 v7, 0xa

    .line 626
    .line 627
    const/4 v4, 0x0

    .line 628
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 629
    .line 630
    .line 631
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object v0

    .line 634
    :pswitch_a
    move-object/from16 v1, p1

    .line 635
    .line 636
    check-cast v1, Landroid/os/Bundle;

    .line 637
    .line 638
    sget-object v2, La/axe;->e2:La/kud;

    .line 639
    .line 640
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    const-string v2, "RESULT_ACTION"

    .line 644
    .line 645
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    instance-of v2, v1, La/ore;

    .line 650
    .line 651
    if-eqz v2, :cond_8

    .line 652
    .line 653
    check-cast v1, La/ore;

    .line 654
    .line 655
    goto :goto_6

    .line 656
    :cond_8
    move-object v1, v8

    .line 657
    :goto_6
    if-eqz v1, :cond_e

    .line 658
    .line 659
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    if-eqz v1, :cond_d

    .line 668
    .line 669
    if-eq v1, v7, :cond_c

    .line 670
    .line 671
    const/4 v2, 0x2

    .line 672
    if-eq v1, v2, :cond_b

    .line 673
    .line 674
    if-eq v1, v3, :cond_a

    .line 675
    .line 676
    if-ne v1, v6, :cond_9

    .line 677
    .line 678
    invoke-virtual {v0, v7}, La/r7f;->V(Z)V

    .line 679
    .line 680
    .line 681
    goto :goto_7

    .line 682
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 683
    .line 684
    .line 685
    goto :goto_8

    .line 686
    :cond_a
    sget-object v1, La/m3f;->a:La/m3f;

    .line 687
    .line 688
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 689
    .line 690
    .line 691
    goto :goto_7

    .line 692
    :cond_b
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 697
    .line 698
    iget-object v5, v1, La/mne;->b:La/dvj;

    .line 699
    .line 700
    sget-object v3, La/n5f;->a:La/n5f;

    .line 701
    .line 702
    new-instance v6, La/d5f;

    .line 703
    .line 704
    invoke-direct {v6, v0, v8, v7}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 705
    .line 706
    .line 707
    const/16 v7, 0xa

    .line 708
    .line 709
    const/4 v4, 0x0

    .line 710
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 711
    .line 712
    .line 713
    goto :goto_7

    .line 714
    :cond_c
    invoke-virtual {v0}, La/r7f;->u0()V

    .line 715
    .line 716
    .line 717
    goto :goto_7

    .line 718
    :cond_d
    invoke-virtual {v0, v9}, La/r7f;->V(Z)V

    .line 719
    .line 720
    .line 721
    :cond_e
    :goto_7
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    :goto_8
    return-object v8

    .line 724
    :pswitch_b
    move-object/from16 v1, p1

    .line 725
    .line 726
    check-cast v1, Landroid/os/Bundle;

    .line 727
    .line 728
    sget-object v2, La/axe;->e2:La/kud;

    .line 729
    .line 730
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    const-string v2, "RESULT_BLOCK_ID"

    .line 734
    .line 735
    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    iget-object v3, v0, La/r7f;->Y0:La/mne;

    .line 748
    .line 749
    iget-object v5, v3, La/mne;->b:La/dvj;

    .line 750
    .line 751
    sget-object v3, La/l5f;->a:La/l5f;

    .line 752
    .line 753
    new-instance v6, La/m5f;

    .line 754
    .line 755
    invoke-direct {v6, v0, v1, v8, v9}, La/m5f;-><init>(La/r7f;ILa/yje;B)V

    .line 756
    .line 757
    .line 758
    const/16 v7, 0xa

    .line 759
    .line 760
    const/4 v4, 0x0

    .line 761
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 762
    .line 763
    .line 764
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 765
    .line 766
    return-object v0

    .line 767
    :pswitch_c
    move-object/from16 v1, p1

    .line 768
    .line 769
    check-cast v1, Ljava/lang/Boolean;

    .line 770
    .line 771
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 772
    .line 773
    .line 774
    move-result v1

    .line 775
    sget-object v2, La/axe;->e2:La/kud;

    .line 776
    .line 777
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    if-eqz v1, :cond_f

    .line 782
    .line 783
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 784
    .line 785
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 786
    .line 787
    const-string v2, "coupon_download_done"

    .line 788
    .line 789
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    iget-object v1, v0, La/r7f;->K0:La/x20;

    .line 793
    .line 794
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 795
    .line 796
    const-wide/16 v2, 0xc8f

    .line 797
    .line 798
    sget-object v4, La/xun;->a:La/xun;

    .line 799
    .line 800
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0}, La/r7f;->c0()V

    .line 804
    .line 805
    .line 806
    new-instance v1, La/yld;

    .line 807
    .line 808
    const/16 v2, 0x1a

    .line 809
    .line 810
    invoke-direct {v1, v2}, La/yld;-><init>(B)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0, v9, v7, v1}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 814
    .line 815
    .line 816
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 817
    .line 818
    return-object v0

    .line 819
    :pswitch_d
    move-object/from16 v1, p1

    .line 820
    .line 821
    check-cast v1, Landroid/os/Bundle;

    .line 822
    .line 823
    sget-object v3, La/axe;->e2:La/kud;

    .line 824
    .line 825
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 829
    .line 830
    .line 831
    move-result v1

    .line 832
    invoke-virtual {v0}, La/axe;->M0()La/r7f;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-virtual {v0, v1, v9}, La/r7f;->q0(IZ)V

    .line 837
    .line 838
    .line 839
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 840
    .line 841
    return-object v0

    .line 842
    nop

    .line 843
    :pswitch_data_0
    .packed-switch 0x0
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
