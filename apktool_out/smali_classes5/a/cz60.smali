.class public final synthetic La/cz60;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/cz60;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/cz60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 13
    .line 14
    iget v0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget v1, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 27
    .line 28
    if-eq v0, v1, :cond_0

    .line 29
    .line 30
    sget-object v0, La/h2c0;->a:La/h2c0;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->D(La/k2c0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lorg/xplatform/personal/impl/presentation/edit/n;->C()V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, La/g2c0;

    .line 50
    .line 51
    invoke-direct {v0, v4}, La/g2c0;-><init>(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->D(La/k2c0;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, La/g9b0;

    .line 63
    .line 64
    invoke-virtual {p0}, La/g9b0;->H()V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/g9b0;

    .line 73
    .line 74
    iget-object v0, p0, La/g9b0;->S:La/p7m0;

    .line 75
    .line 76
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v1, La/m8b0;->a:La/m8b0;

    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p0, v0}, La/g9b0;->G(Z)V

    .line 87
    .line 88
    .line 89
    sget-object v0, La/s8b0;->a:La/s8b0;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, La/g9b0;->A(La/s8b0;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_3
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, La/sbb0;

    .line 100
    .line 101
    iget-object v0, p0, La/sbb0;->D0:La/p7m0;

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    move-object v3, p0

    .line 108
    check-cast v3, La/n7b0;

    .line 109
    .line 110
    iget-object v1, v3, La/n7b0;->c:La/oz60;

    .line 111
    .line 112
    sget-object v4, La/pd00;->a:La/pd00;

    .line 113
    .line 114
    const/16 v5, 0x1e

    .line 115
    .line 116
    invoke-static {v1, v4, v2, v2, v5}, La/oz60;->a(La/oz60;La/td00;Ljava/lang/String;Ljava/lang/String;I)La/oz60;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    const/4 v7, 0x0

    .line 121
    const/16 v8, 0xb

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-static/range {v3 .. v8}, La/n7b0;->a(La/n7b0;La/b9l0;La/dr5;La/oz60;La/td00;I)La/n7b0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_1

    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_4
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, La/sbb0;

    .line 141
    .line 142
    iget-object p0, p0, La/sbb0;->s:La/alv;

    .line 143
    .line 144
    iget-object v0, p0, La/alv;->e:La/ouu;

    .line 145
    .line 146
    iget-object v1, p0, La/alv;->n:La/mne;

    .line 147
    .line 148
    iget-object v5, p0, La/alv;->g:La/i1w0;

    .line 149
    .line 150
    iget-object v6, p0, La/alv;->d:La/xfu;

    .line 151
    .line 152
    invoke-virtual {v6}, La/xfu;->b()La/rkv;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    packed-switch v6, :pswitch_data_1

    .line 161
    .line 162
    .line 163
    invoke-static {}, La/t9f;->b()V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    :pswitch_5
    new-instance v0, La/zkv;

    .line 169
    .line 170
    invoke-direct {v0, p0, v4}, La/zkv;-><init>(La/alv;B)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, La/rkv;->h:La/rkv;

    .line 177
    .line 178
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_4

    .line 182
    .line 183
    :pswitch_6
    new-instance v0, La/ykv;

    .line 184
    .line 185
    invoke-direct {v0, p0, v4}, La/ykv;-><init>(La/alv;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    new-instance v5, La/vft;

    .line 197
    .line 198
    iget-object v7, p0, La/alv;->l:La/duj;

    .line 199
    .line 200
    const/4 v11, 0x0

    .line 201
    const/16 v12, 0xc

    .line 202
    .line 203
    const/4 v6, 0x1

    .line 204
    const-class v8, La/duj;

    .line 205
    .line 206
    const-string v9, "handleError"

    .line 207
    .line 208
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 209
    .line 210
    invoke-direct/range {v5 .. v12}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 211
    .line 212
    .line 213
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 214
    .line 215
    new-instance v8, La/u5u;

    .line 216
    .line 217
    const/16 v1, 0xb

    .line 218
    .line 219
    invoke-direct {v8, p0, v0, v2, v1}, La/u5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 220
    .line 221
    .line 222
    const/16 v9, 0xa

    .line 223
    .line 224
    const/4 v6, 0x0

    .line 225
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 226
    .line 227
    .line 228
    goto/16 :goto_4

    .line 229
    .line 230
    :pswitch_7
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    new-instance v7, La/umu;

    .line 239
    .line 240
    const/16 v0, 0x9

    .line 241
    .line 242
    invoke-direct {v7, v0}, La/umu;-><init>(B)V

    .line 243
    .line 244
    .line 245
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 246
    .line 247
    new-instance v10, La/cin;

    .line 248
    .line 249
    const/16 v0, 0x10

    .line 250
    .line 251
    invoke-direct {v10, p0, v2, v0}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 252
    .line 253
    .line 254
    const/16 v11, 0xa

    .line 255
    .line 256
    const/4 v8, 0x0

    .line 257
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 258
    .line 259
    .line 260
    new-instance v0, La/zkv;

    .line 261
    .line 262
    invoke-direct {v0, p0, v3}, La/zkv;-><init>(La/alv;B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 266
    .line 267
    .line 268
    sget-object v0, La/rkv;->f:La/rkv;

    .line 269
    .line 270
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_4

    .line 274
    .line 275
    :pswitch_8
    new-instance v0, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;

    .line 276
    .line 277
    invoke-direct {v0, v4}, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;-><init>(Z)V

    .line 278
    .line 279
    .line 280
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 281
    .line 282
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 283
    .line 284
    .line 285
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 286
    .line 287
    if-eqz v2, :cond_2

    .line 288
    .line 289
    new-instance v2, La/e1w0;

    .line 290
    .line 291
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 292
    .line 293
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, La/c8d;

    .line 297
    .line 298
    sget-object v3, La/y7d;->a:La/v7d;

    .line 299
    .line 300
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_2
    new-instance v2, La/w0w0;

    .line 308
    .line 309
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 310
    .line 311
    .line 312
    new-instance v0, La/c8d;

    .line 313
    .line 314
    sget-object v3, La/y7d;->a:La/v7d;

    .line 315
    .line 316
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    :goto_1
    invoke-static {v5, v1, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :goto_2
    move-object v1, v0

    .line 327
    check-cast v1, La/paw;

    .line 328
    .line 329
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-eqz v2, :cond_3

    .line 334
    .line 335
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, La/oe50;

    .line 340
    .line 341
    invoke-virtual {v5, v1}, La/i1w0;->a(La/oe50;)V

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_3
    sget-object v0, La/rkv;->e:La/rkv;

    .line 346
    .line 347
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :pswitch_9
    new-instance v1, La/ya50;

    .line 352
    .line 353
    invoke-direct {v1, v4}, La/ya50;-><init>(I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v1, v4}, La/ouu;->q(La/cb50;Z)V

    .line 357
    .line 358
    .line 359
    sget-object v0, La/rkv;->d:La/rkv;

    .line 360
    .line 361
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :pswitch_a
    new-instance v4, La/za50;

    .line 366
    .line 367
    const-wide/16 v9, 0x0

    .line 368
    .line 369
    const/4 v6, 0x7

    .line 370
    const/4 v5, 0x0

    .line 371
    const-wide/16 v7, 0x0

    .line 372
    .line 373
    invoke-direct/range {v4 .. v10}, La/za50;-><init>(IIJJ)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v4, v3}, La/ouu;->q(La/cb50;Z)V

    .line 377
    .line 378
    .line 379
    sget-object v0, La/rkv;->c:La/rkv;

    .line 380
    .line 381
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :pswitch_b
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 386
    .line 387
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    new-instance v1, La/ykv;

    .line 391
    .line 392
    invoke-direct {v1, p0, v3}, La/ykv;-><init>(La/alv;B)V

    .line 393
    .line 394
    .line 395
    new-instance v2, La/a1w0;

    .line 396
    .line 397
    invoke-direct {v2, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 398
    .line 399
    .line 400
    new-instance v1, La/c8d;

    .line 401
    .line 402
    sget-object v3, La/y7d;->a:La/v7d;

    .line 403
    .line 404
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v0, v1, v5, v0, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    :goto_3
    move-object v1, v0

    .line 412
    check-cast v1, La/paw;

    .line 413
    .line 414
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-eqz v2, :cond_4

    .line 419
    .line 420
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, La/oe50;

    .line 425
    .line 426
    invoke-virtual {v5, v1}, La/i1w0;->a(La/oe50;)V

    .line 427
    .line 428
    .line 429
    goto :goto_3

    .line 430
    :cond_4
    sget-object v0, La/rkv;->b:La/rkv;

    .line 431
    .line 432
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 433
    .line 434
    .line 435
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    :goto_5
    return-object v2

    .line 438
    :pswitch_c
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast p0, La/kk90;

    .line 441
    .line 442
    iget-object p0, p0, La/kk90;->u:La/ywq0;

    .line 443
    .line 444
    sget-object v0, La/ui90;->b:La/ui90;

    .line 445
    .line 446
    invoke-virtual {p0, v0}, La/ywq0;->F(La/ui90;)V

    .line 447
    .line 448
    .line 449
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object p0

    .line 452
    :pswitch_d
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast p0, La/kk90;

    .line 455
    .line 456
    iget-object v0, p0, La/kk90;->p:La/i1w0;

    .line 457
    .line 458
    iget-object v2, p0, La/kk90;->u:La/ywq0;

    .line 459
    .line 460
    sget-object v3, La/ui90;->c:La/ui90;

    .line 461
    .line 462
    invoke-virtual {v2, v3}, La/ywq0;->F(La/ui90;)V

    .line 463
    .line 464
    .line 465
    iget-object v2, p0, La/kk90;->z:La/sff0;

    .line 466
    .line 467
    iget-boolean v2, v2, La/sff0;->A0:Z

    .line 468
    .line 469
    if-eqz v2, :cond_5

    .line 470
    .line 471
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    iget-object p0, p0, La/kk90;->w:La/gle0;

    .line 476
    .line 477
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    new-instance p0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getContactsFragmentScreen$1;

    .line 481
    .line 482
    invoke-direct {p0, v4}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getContactsFragmentScreen$1;-><init>(Z)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 486
    .line 487
    .line 488
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 489
    .line 490
    invoke-static {v0, p0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    :goto_6
    move-object v1, p0

    .line 495
    check-cast v1, La/paw;

    .line 496
    .line 497
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-eqz v2, :cond_6

    .line 502
    .line 503
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, La/oe50;

    .line 508
    .line 509
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 510
    .line 511
    .line 512
    goto :goto_6

    .line 513
    :cond_5
    iget-object v2, p0, La/kk90;->x:La/yfu;

    .line 514
    .line 515
    invoke-virtual {v2}, La/yfu;->j()V

    .line 516
    .line 517
    .line 518
    new-instance v2, La/hj90;

    .line 519
    .line 520
    invoke-direct {v2, p0, v1}, La/hj90;-><init>(La/kk90;B)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 524
    .line 525
    .line 526
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 527
    .line 528
    return-object p0

    .line 529
    :pswitch_e
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast p0, La/kk90;

    .line 532
    .line 533
    iget-object v0, p0, La/kk90;->u:La/ywq0;

    .line 534
    .line 535
    iget-object v2, v0, La/ywq0;->a:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v2, La/vd1;

    .line 538
    .line 539
    iget-object v2, v2, La/vd1;->a:La/kt2;

    .line 540
    .line 541
    new-instance v5, Lkotlin/Pair;

    .line 542
    .line 543
    const-string v6, "screen"

    .line 544
    .line 545
    const-string v7, "acc_personal"

    .line 546
    .line 547
    invoke-direct {v5, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    new-instance v6, Lkotlin/Pair;

    .line 551
    .line 552
    const-string v8, "element"

    .line 553
    .line 554
    const-string v9, "allert_activate_phone"

    .line 555
    .line 556
    invoke-direct {v6, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    filled-new-array {v5, v6}, [Lkotlin/Pair;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    invoke-static {v5}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    const-string v6, "acc_add_phone_call"

    .line 568
    .line 569
    invoke-interface {v2, v6, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 570
    .line 571
    .line 572
    iget-object v0, v0, La/ywq0;->g:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, La/ik4;

    .line 575
    .line 576
    iget-object v0, v0, La/ik4;->a:La/s1p;

    .line 577
    .line 578
    new-instance v2, La/j1p;

    .line 579
    .line 580
    invoke-direct {v2, v7, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 581
    .line 582
    .line 583
    new-instance v5, La/j1p;

    .line 584
    .line 585
    invoke-direct {v5, v9, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 586
    .line 587
    .line 588
    new-array v1, v1, [La/k1p;

    .line 589
    .line 590
    aput-object v2, v1, v4

    .line 591
    .line 592
    aput-object v5, v1, v3

    .line 593
    .line 594
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    const-wide/16 v2, 0xc9f

    .line 599
    .line 600
    invoke-virtual {v0, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 601
    .line 602
    .line 603
    iget-object v0, p0, La/kk90;->p:La/i1w0;

    .line 604
    .line 605
    new-instance v1, La/hj90;

    .line 606
    .line 607
    const/4 v2, 0x4

    .line 608
    invoke-direct {v1, p0, v2}, La/hj90;-><init>(La/kk90;B)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 612
    .line 613
    .line 614
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object p0

    .line 617
    :pswitch_f
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast p0, La/kk90;

    .line 620
    .line 621
    invoke-virtual {p0}, La/kk90;->E()V

    .line 622
    .line 623
    .line 624
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object p0

    .line 627
    :pswitch_10
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast p0, La/kk90;

    .line 630
    .line 631
    iget-object p0, p0, La/kk90;->u:La/ywq0;

    .line 632
    .line 633
    const-string v0, "cancel"

    .line 634
    .line 635
    invoke-virtual {p0, v0}, La/ywq0;->H(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    return-object p0

    .line 641
    :pswitch_11
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast p0, La/kk90;

    .line 644
    .line 645
    iget-object v0, p0, La/kk90;->u:La/ywq0;

    .line 646
    .line 647
    const-string v1, "bind_phone"

    .line 648
    .line 649
    invoke-virtual {v0, v1}, La/ywq0;->H(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    iget-object v0, p0, La/kk90;->p:La/i1w0;

    .line 653
    .line 654
    new-instance v1, La/hj90;

    .line 655
    .line 656
    const/4 v2, 0x3

    .line 657
    invoke-direct {v1, p0, v2}, La/hj90;-><init>(La/kk90;B)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 661
    .line 662
    .line 663
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 664
    .line 665
    return-object p0

    .line 666
    :pswitch_12
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 667
    .line 668
    move-object v0, p0

    .line 669
    check-cast v0, La/p990;

    .line 670
    .line 671
    iget-object v1, v0, La/p990;->z:La/p7m0;

    .line 672
    .line 673
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object p0

    .line 677
    move-object v2, p0

    .line 678
    check-cast v2, La/d990;

    .line 679
    .line 680
    sget-object v2, La/d990;->a:La/d990;

    .line 681
    .line 682
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result p0

    .line 686
    if-eqz p0, :cond_7

    .line 687
    .line 688
    invoke-virtual {v0}, La/p990;->C()V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0}, La/p990;->B()V

    .line 692
    .line 693
    .line 694
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object p0

    .line 697
    :pswitch_13
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast p0, La/o890;

    .line 700
    .line 701
    sget-object v0, La/o890;->f2:La/jh70;

    .line 702
    .line 703
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    iget-object v0, v0, La/s2r;->f:La/nq8;

    .line 708
    .line 709
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 710
    .line 711
    check-cast v0, Landroid/widget/ProgressBar;

    .line 712
    .line 713
    const/16 v1, 0x8

    .line 714
    .line 715
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    iget-object v0, v0, La/s2r;->e:Landroid/widget/TextView;

    .line 723
    .line 724
    const v2, 0x7f130677

    .line 725
    .line 726
    .line 727
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    iget-object v0, v0, La/s2r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 739
    .line 740
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {p0}, La/o890;->K0()La/s2r;

    .line 744
    .line 745
    .line 746
    move-result-object p0

    .line 747
    iget-object p0, p0, La/s2r;->g:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 748
    .line 749
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 750
    .line 751
    .line 752
    move-result-object p0

    .line 753
    if-eqz p0, :cond_8

    .line 754
    .line 755
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 756
    .line 757
    .line 758
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 759
    .line 760
    return-object p0

    .line 761
    :pswitch_14
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast p0, La/s690;

    .line 764
    .line 765
    iget-object v0, p0, La/s690;->w:La/p7m0;

    .line 766
    .line 767
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    instance-of v0, v0, La/z590;

    .line 772
    .line 773
    if-eqz v0, :cond_9

    .line 774
    .line 775
    goto :goto_7

    .line 776
    :cond_9
    invoke-virtual {p0}, La/s690;->y()V

    .line 777
    .line 778
    .line 779
    iget-object v0, p0, La/s690;->b:Ljava/lang/String;

    .line 780
    .line 781
    invoke-virtual {p0, v0}, La/s690;->x(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 785
    .line 786
    return-object p0

    .line 787
    :pswitch_15
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 790
    .line 791
    new-instance v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;

    .line 792
    .line 793
    iget-object v1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->n:La/xae0;

    .line 794
    .line 795
    iget-object v1, v1, La/xae0;->a:La/n7m0;

    .line 796
    .line 797
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    check-cast v1, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;

    .line 802
    .line 803
    invoke-virtual {v1}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;->a()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-direct {v0, v1}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;-><init>(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->b:La/vzg0;

    .line 811
    .line 812
    const-string v1, "current_password_key"

    .line 813
    .line 814
    invoke-virtual {p0, v1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 818
    .line 819
    return-object p0

    .line 820
    :pswitch_16
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast p0, La/di80;

    .line 823
    .line 824
    iget-object p0, p0, La/di80;->d:La/ehf0;

    .line 825
    .line 826
    new-instance v0, La/yh80;

    .line 827
    .line 828
    sget-object v1, La/zh80;->b:La/zh80;

    .line 829
    .line 830
    invoke-direct {v0, v4, v1}, La/yh80;-><init>(ZLa/b5x;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {p0, v0}, La/ehf0;->u(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 837
    .line 838
    return-object p0

    .line 839
    :pswitch_17
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast p0, La/di80;

    .line 842
    .line 843
    iget-object p0, p0, La/di80;->d:La/ehf0;

    .line 844
    .line 845
    new-instance v0, La/yh80;

    .line 846
    .line 847
    sget-object v1, La/zh80;->b:La/zh80;

    .line 848
    .line 849
    invoke-direct {v0, v4, v1}, La/yh80;-><init>(ZLa/b5x;)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {p0, v0}, La/ehf0;->u(Ljava/lang/Object;)V

    .line 853
    .line 854
    .line 855
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 856
    .line 857
    return-object p0

    .line 858
    :pswitch_18
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast p0, La/xc80;

    .line 861
    .line 862
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 863
    .line 864
    .line 865
    move-result-object p0

    .line 866
    return-object p0

    .line 867
    :pswitch_19
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast p0, La/rio0;

    .line 870
    .line 871
    iget-object v0, p0, La/rio0;->M0:La/ol60;

    .line 872
    .line 873
    new-instance v1, La/vho0;

    .line 874
    .line 875
    iget-object v2, p0, La/rio0;->l0:La/z7z;

    .line 876
    .line 877
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    check-cast v2, La/smu;

    .line 882
    .line 883
    invoke-virtual {v2}, La/smu;->a()Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    iget-object p0, p0, La/rio0;->m0:La/z7z;

    .line 888
    .line 889
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object p0

    .line 893
    check-cast p0, La/rmu;

    .line 894
    .line 895
    invoke-virtual {p0}, La/rmu;->a()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object p0

    .line 899
    invoke-direct {v1, v2, p0}, La/vho0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 906
    .line 907
    return-object p0

    .line 908
    :pswitch_1a
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast p0, La/kc80;

    .line 911
    .line 912
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 913
    .line 914
    .line 915
    move-result-object p0

    .line 916
    return-object p0

    .line 917
    :pswitch_1b
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast p0, La/fho0;

    .line 920
    .line 921
    iget-object v0, p0, La/fho0;->D0:La/ol60;

    .line 922
    .line 923
    new-instance v1, La/dgo0;

    .line 924
    .line 925
    iget-object v2, p0, La/fho0;->a0:La/z7z;

    .line 926
    .line 927
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    check-cast v2, La/smu;

    .line 932
    .line 933
    invoke-virtual {v2}, La/smu;->a()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    iget-object p0, p0, La/fho0;->b0:La/z7z;

    .line 938
    .line 939
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object p0

    .line 943
    check-cast p0, La/rmu;

    .line 944
    .line 945
    invoke-virtual {p0}, La/rmu;->a()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object p0

    .line 949
    invoke-direct {v1, v2, p0}, La/dgo0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 956
    .line 957
    return-object p0

    .line 958
    :pswitch_1c
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast p0, La/aa80;

    .line 961
    .line 962
    iget-object v0, p0, La/aa80;->x:La/bby;

    .line 963
    .line 964
    if-eqz v0, :cond_a

    .line 965
    .line 966
    invoke-interface {v0}, La/bby;->isCancelled()Z

    .line 967
    .line 968
    .line 969
    move-result v0

    .line 970
    if-ne v0, v3, :cond_a

    .line 971
    .line 972
    invoke-virtual {p0}, La/aa80;->w()V

    .line 973
    .line 974
    .line 975
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 976
    .line 977
    return-object p0

    .line 978
    :pswitch_1d
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast p0, La/aa80;

    .line 981
    .line 982
    iget-object p0, p0, La/aa80;->v:La/c4m0;

    .line 983
    .line 984
    if-eqz p0, :cond_b

    .line 985
    .line 986
    invoke-virtual {p0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 987
    .line 988
    .line 989
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 990
    .line 991
    return-object p0

    .line 992
    :pswitch_1e
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 993
    .line 994
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 995
    .line 996
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1000
    .line 1001
    return-object p0

    .line 1002
    :pswitch_1f
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 1003
    .line 1004
    move-object v5, p0

    .line 1005
    check-cast v5, La/to70;

    .line 1006
    .line 1007
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1011
    .line 1012
    .line 1013
    move-result-object p0

    .line 1014
    new-instance v3, La/gk70;

    .line 1015
    .line 1016
    const/4 v9, 0x0

    .line 1017
    const/16 v10, 0xb

    .line 1018
    .line 1019
    const/4 v4, 0x1

    .line 1020
    const-class v6, La/to70;

    .line 1021
    .line 1022
    const-string v7, "handleGameError"

    .line 1023
    .line 1024
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1025
    .line 1026
    invoke-direct/range {v3 .. v10}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1027
    .line 1028
    .line 1029
    iget-object v0, v5, La/to70;->g:La/mne;

    .line 1030
    .line 1031
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 1032
    .line 1033
    new-instance v10, La/gc1;

    .line 1034
    .line 1035
    const/16 v0, 0xc

    .line 1036
    .line 1037
    invoke-direct {v10, v5, v2, v0}, La/gc1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1038
    .line 1039
    .line 1040
    const/16 v11, 0xa

    .line 1041
    .line 1042
    const/4 v8, 0x0

    .line 1043
    move-object v6, p0

    .line 1044
    move-object v7, v3

    .line 1045
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1046
    .line 1047
    .line 1048
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1049
    .line 1050
    return-object p0

    .line 1051
    :pswitch_20
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast p0, La/to70;

    .line 1054
    .line 1055
    invoke-virtual {p0}, La/to70;->A()V

    .line 1056
    .line 1057
    .line 1058
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1059
    .line 1060
    return-object p0

    .line 1061
    :pswitch_21
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast p0, La/g670;

    .line 1064
    .line 1065
    iget-object p0, p0, La/g670;->c:La/i1w0;

    .line 1066
    .line 1067
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    new-instance v1, La/c8d;

    .line 1072
    .line 1073
    sget-object v2, La/y7d;->a:La/v7d;

    .line 1074
    .line 1075
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 1076
    .line 1077
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v0, v1, p0, v0, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    :goto_8
    move-object v1, v0

    .line 1085
    check-cast v1, La/paw;

    .line 1086
    .line 1087
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v2

    .line 1091
    if-eqz v2, :cond_c

    .line 1092
    .line 1093
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    check-cast v1, La/oe50;

    .line 1098
    .line 1099
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_8

    .line 1103
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1104
    .line 1105
    return-object p0

    .line 1106
    :pswitch_22
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 1107
    .line 1108
    check-cast p0, La/g670;

    .line 1109
    .line 1110
    sget-object v0, La/u570;->a:La/u570;

    .line 1111
    .line 1112
    invoke-virtual {p0, v0}, La/g670;->C(La/v570;)V

    .line 1113
    .line 1114
    .line 1115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1116
    .line 1117
    return-object p0

    .line 1118
    :pswitch_23
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast p0, La/g670;

    .line 1121
    .line 1122
    iget-object v0, p0, La/g670;->E:La/p7m0;

    .line 1123
    .line 1124
    :cond_d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    move-object v2, v1

    .line 1129
    check-cast v2, La/gz60;

    .line 1130
    .line 1131
    const/4 v8, 0x0

    .line 1132
    const/16 v9, 0x1fd

    .line 1133
    .line 1134
    const/4 v3, 0x0

    .line 1135
    const/4 v4, 0x1

    .line 1136
    const/4 v5, 0x0

    .line 1137
    const/4 v6, 0x0

    .line 1138
    const/4 v7, 0x0

    .line 1139
    invoke-static/range {v2 .. v9}, La/gz60;->a(La/gz60;Ljava/lang/String;ZZZZZI)La/gz60;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v2

    .line 1143
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v1

    .line 1147
    if-eqz v1, :cond_d

    .line 1148
    .line 1149
    iget-object p0, p0, La/g670;->D:La/ol60;

    .line 1150
    .line 1151
    sget-object v0, La/q570;->a:La/q570;

    .line 1152
    .line 1153
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1154
    .line 1155
    .line 1156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1157
    .line 1158
    return-object p0

    .line 1159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
