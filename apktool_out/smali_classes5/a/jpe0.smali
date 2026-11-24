.class public final synthetic La/jpe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jpe0;->a:B

    iput-object p1, p0, La/jpe0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-byte p1, p0, La/jpe0;->a:B

    .line 2
    .line 3
    sget-object v0, La/p0w0;->a:La/p0w0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object p0, p0, La/jpe0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/u3v0;

    .line 12
    .line 13
    sget-object p1, La/u3v0;->P1:La/kys0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/u3v0;->H0()La/c4v0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/c4v0;->b:La/i1w0;

    .line 20
    .line 21
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v2, La/c8d;

    .line 26
    .line 27
    sget-object v3, La/y7d;->a:La/v7d;

    .line 28
    .line 29
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v2, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    move-object v0, p1

    .line 37
    check-cast v0, La/paw;

    .line 38
    .line 39
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/oe50;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-void

    .line 56
    :pswitch_0
    check-cast p0, La/w1v0;

    .line 57
    .line 58
    sget-object p1, La/w1v0;->j2:La/bzs0;

    .line 59
    .line 60
    invoke-virtual {p0}, La/w1v0;->S0()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1, v1, v1}, La/sik;->z0(ZZZ)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_1
    check-cast p0, La/mau0;

    .line 76
    .line 77
    sget-object p1, La/mau0;->Q1:La/bzs0;

    .line 78
    .line 79
    invoke-virtual {p0}, La/mau0;->H0()La/abu0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, La/abu0;->A()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_2
    check-cast p0, La/a9u0;

    .line 88
    .line 89
    sget-object p1, La/a9u0;->R1:La/uxs0;

    .line 90
    .line 91
    iget-object p0, p0, La/a9u0;->P1:La/kiu0;

    .line 92
    .line 93
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, La/i9u0;

    .line 98
    .line 99
    iget-object p0, p0, La/i9u0;->b:La/i1w0;

    .line 100
    .line 101
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v2, La/c8d;

    .line 106
    .line 107
    sget-object v3, La/y7d;->a:La/v7d;

    .line 108
    .line 109
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v2, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_1
    move-object v0, p1

    .line 117
    check-cast v0, La/paw;

    .line 118
    .line 119
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_1

    .line 124
    .line 125
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, La/oe50;

    .line 130
    .line 131
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    return-void

    .line 136
    :pswitch_3
    check-cast p0, La/hvs0;

    .line 137
    .line 138
    sget-object p1, La/hvs0;->c2:La/s9m0;

    .line 139
    .line 140
    invoke-virtual {p0, v1, v1, v1}, La/sik;->z0(ZZZ)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_4
    check-cast p0, La/u2s0;

    .line 145
    .line 146
    sget-object p1, La/u2s0;->X1:La/s2m0;

    .line 147
    .line 148
    invoke-virtual {p0}, La/u2s0;->H0()La/o6j;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, La/o6j;->w()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_5
    check-cast p0, La/zdq0;

    .line 157
    .line 158
    iget-object p0, p0, La/zdq0;->h:Lkotlin/jvm/functions/Function0;

    .line 159
    .line 160
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_6
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 165
    .line 166
    sget p1, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->k:I

    .line 167
    .line 168
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_3

    .line 175
    .line 176
    const/4 v0, 0x1

    .line 177
    if-ne p1, v0, :cond_2

    .line 178
    .line 179
    sget-object p1, La/evo0;->a:La/evo0;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_3
    sget-object p1, La/evo0;->b:La/evo0;

    .line 187
    .line 188
    :goto_2
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 189
    .line 190
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->d()V

    .line 191
    .line 192
    .line 193
    :goto_3
    return-void

    .line 194
    :pswitch_7
    check-cast p0, La/whn0;

    .line 195
    .line 196
    sget-object p1, La/whn0;->Y1:La/s2m0;

    .line 197
    .line 198
    invoke-virtual {p0}, La/whn0;->J0()La/fin0;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    iget-object p1, p0, La/fin0;->b:La/i1w0;

    .line 203
    .line 204
    new-instance v0, La/xhn0;

    .line 205
    .line 206
    invoke-direct {v0, p0, v1}, La/xhn0;-><init>(La/fin0;B)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_8
    check-cast p0, La/lhf;

    .line 214
    .line 215
    sget p1, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->r:I

    .line 216
    .line 217
    invoke-virtual {p0}, La/lhf;->invoke()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_9
    check-cast p0, La/wgk0;

    .line 222
    .line 223
    sget-object p1, La/wgk0;->d2:[La/iiy;

    .line 224
    .line 225
    invoke-virtual {p0}, La/wgk0;->S0()V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :pswitch_a
    check-cast p0, La/oyj0;

    .line 230
    .line 231
    iget-object p0, p0, La/oyj0;->R1:La/rd7;

    .line 232
    .line 233
    if-eqz p0, :cond_4

    .line 234
    .line 235
    invoke-virtual {p0}, La/rd7;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    :cond_4
    return-void

    .line 239
    :pswitch_b
    check-cast p0, La/t9i0;

    .line 240
    .line 241
    sget-object p1, La/t9i0;->Q1:[La/iiy;

    .line 242
    .line 243
    invoke-virtual {p0}, La/t9i0;->H0()La/cai0;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    iget-object p0, p0, La/cai0;->c:La/i1w0;

    .line 248
    .line 249
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    new-instance v2, La/c8d;

    .line 254
    .line 255
    sget-object v3, La/y7d;->a:La/v7d;

    .line 256
    .line 257
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 258
    .line 259
    .line 260
    invoke-static {p1, v2, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    :goto_4
    move-object v0, p1

    .line 265
    check-cast v0, La/paw;

    .line 266
    .line 267
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_5

    .line 272
    .line 273
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, La/oe50;

    .line 278
    .line 279
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_5
    return-void

    .line 284
    :pswitch_c
    check-cast p0, La/m9i0;

    .line 285
    .line 286
    sget-object p1, La/m9i0;->S1:La/eke0;

    .line 287
    .line 288
    invoke-virtual {p0}, La/m9i0;->H0()La/jai0;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    iget-object p0, p0, La/jai0;->c:La/i1w0;

    .line 293
    .line 294
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    new-instance v2, La/c8d;

    .line 299
    .line 300
    sget-object v3, La/y7d;->a:La/v7d;

    .line 301
    .line 302
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 303
    .line 304
    .line 305
    invoke-static {p1, v2, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    :goto_5
    move-object v0, p1

    .line 310
    check-cast v0, La/paw;

    .line 311
    .line 312
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_6

    .line 317
    .line 318
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, La/oe50;

    .line 323
    .line 324
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_6
    return-void

    .line 329
    :pswitch_d
    check-cast p0, La/mug0;

    .line 330
    .line 331
    sget-object p1, La/mug0;->m2:La/lme0;

    .line 332
    .line 333
    iget-object p0, p0, La/mug0;->l2:La/kiu0;

    .line 334
    .line 335
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    check-cast p0, La/rug0;

    .line 340
    .line 341
    iget-boolean p1, p0, La/rug0;->e:Z

    .line 342
    .line 343
    if-eqz p1, :cond_7

    .line 344
    .line 345
    iget-object p1, p0, La/rug0;->d:La/qoj0;

    .line 346
    .line 347
    new-instance v0, La/pug0;

    .line 348
    .line 349
    iget-object p0, p0, La/rug0;->b:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 350
    .line 351
    invoke-direct {v0, p0}, La/pug0;-><init>(Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    :cond_7
    return-void

    .line 358
    :pswitch_e
    check-cast p0, La/o470;

    .line 359
    .line 360
    iget-object p0, p0, La/o470;->a:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p0, La/woe0;

    .line 363
    .line 364
    sget-object p1, La/woe0;->S1:La/gne0;

    .line 365
    .line 366
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    const-string p1, "rules_link"

    .line 371
    .line 372
    invoke-virtual {p0, p1}, La/zoe0;->w(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    :pswitch_f
    check-cast p0, La/ayf0;

    .line 377
    .line 378
    sget-object p1, La/ayf0;->S1:La/eke0;

    .line 379
    .line 380
    invoke-virtual {p0}, La/ayf0;->H0()La/nyf0;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iget-object p1, p0, La/nyf0;->q:La/mne;

    .line 389
    .line 390
    iget-object v3, p1, La/mne;->a:La/rwj;

    .line 391
    .line 392
    new-instance v1, La/cyf0;

    .line 393
    .line 394
    const/4 p1, 0x3

    .line 395
    invoke-direct {v1, p0, p1}, La/cyf0;-><init>(La/nyf0;B)V

    .line 396
    .line 397
    .line 398
    new-instance v4, La/k6d0;

    .line 399
    .line 400
    const/4 p1, 0x0

    .line 401
    const/16 v2, 0x10

    .line 402
    .line 403
    invoke-direct {v4, p0, p1, v2}, La/k6d0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 404
    .line 405
    .line 406
    const/16 v5, 0xa

    .line 407
    .line 408
    const/4 v2, 0x0

    .line 409
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :pswitch_10
    check-cast p0, La/dwf0;

    .line 414
    .line 415
    sget-object p1, La/dwf0;->O1:La/cge0;

    .line 416
    .line 417
    iget-object p0, p0, La/dwf0;->L1:La/kiu0;

    .line 418
    .line 419
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    check-cast p0, La/jwf0;

    .line 424
    .line 425
    iget-object p0, p0, La/jwf0;->g:La/i1w0;

    .line 426
    .line 427
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    new-instance v2, La/c8d;

    .line 432
    .line 433
    sget-object v3, La/y7d;->a:La/v7d;

    .line 434
    .line 435
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 436
    .line 437
    .line 438
    invoke-static {p1, v2, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    :goto_6
    move-object v0, p1

    .line 443
    check-cast v0, La/paw;

    .line 444
    .line 445
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-eqz v1, :cond_8

    .line 450
    .line 451
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, La/oe50;

    .line 456
    .line 457
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 458
    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_8
    return-void

    .line 462
    :pswitch_11
    check-cast p0, La/iuf0;

    .line 463
    .line 464
    sget-object p1, La/iuf0;->R1:[La/iiy;

    .line 465
    .line 466
    invoke-virtual {p0}, La/iuf0;->H0()La/wuf0;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-virtual {p0}, La/wuf0;->x()V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :pswitch_12
    check-cast p0, La/ppe0;

    .line 475
    .line 476
    sget-object p1, La/ppe0;->S1:La/zie0;

    .line 477
    .line 478
    invoke-virtual {p0}, La/ppe0;->H0()La/tpe0;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    iget-object p0, p0, La/tpe0;->f:La/pzu;

    .line 483
    .line 484
    invoke-virtual {p0}, La/pzu;->B()V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    nop

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
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
