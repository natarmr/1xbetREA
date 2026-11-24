.class public final synthetic La/mb50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/mb50;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mf50;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/mb50;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, La/mb50;->a:B

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/lk60;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-byte p0, p1, La/lk60;->a:B

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    throw p0

    .line 28
    :pswitch_1
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    throw p0

    .line 33
    :pswitch_2
    check-cast p1, La/ge60;

    .line 34
    .line 35
    invoke-virtual {p1}, La/ge60;->h0()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    iget-object p0, p1, La/ge60;->a:La/fe60;

    .line 42
    .line 43
    invoke-interface {p0}, La/fe60;->R()V

    .line 44
    .line 45
    .line 46
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_4
    check-cast p1, La/p560;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v3, La/q560;

    .line 63
    .line 64
    iget-boolean v6, p1, La/p560;->a:Z

    .line 65
    .line 66
    iget-boolean p0, p1, La/p560;->b:Z

    .line 67
    .line 68
    xor-int/lit8 v7, p0, 0x1

    .line 69
    .line 70
    iget-object v4, p1, La/p560;->c:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v5, p1, La/p560;->d:Ljava/util/Map;

    .line 73
    .line 74
    iget-boolean v8, p1, La/p560;->e:Z

    .line 75
    .line 76
    invoke-direct/range {v3 .. v8}, La/q560;-><init>(Ljava/lang/String;Ljava/util/Map;ZZZ)V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :pswitch_5
    check-cast p1, La/s460;

    .line 81
    .line 82
    iget-object p0, p1, La/s460;->u1:La/bg80;

    .line 83
    .line 84
    if-eqz p0, :cond_1

    .line 85
    .line 86
    check-cast p0, La/gfv;

    .line 87
    .line 88
    invoke-virtual {p0}, La/gfv;->c()V

    .line 89
    .line 90
    .line 91
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_6
    check-cast p1, La/s460;

    .line 95
    .line 96
    iget-object p0, p1, La/s460;->u:La/e7z;

    .line 97
    .line 98
    :try_start_0
    invoke-virtual {p1}, La/s460;->h0()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1, v2}, La/s460;->H1(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    move-object p1, v0

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :goto_1
    invoke-virtual {p0, p1}, La/e7z;->Z(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v3

    .line 118
    :pswitch_7
    check-cast p1, La/o8w;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, La/o8w;->getKey()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_9
    check-cast p1, La/sjd;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance p0, La/s160;

    .line 145
    .line 146
    invoke-direct {p0, p1}, La/s160;-><init>(La/sjd;)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_a
    check-cast p1, La/tn60;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance p0, La/t160;

    .line 156
    .line 157
    invoke-direct {p0, p1}, La/t160;-><init>(La/tn60;)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_b
    check-cast p1, La/jlb;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-interface {p1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_c
    check-cast p1, La/a2n;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-interface {p1}, La/a2n;->getKey()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_d
    check-cast p1, La/sbs0;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object p0, p1, La/sbs0;->b:Ljava/lang/String;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_e
    check-cast p1, La/tdp;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    instance-of p0, p1, La/qdp;

    .line 195
    .line 196
    if-eqz p0, :cond_3

    .line 197
    .line 198
    check-cast p1, La/qdp;

    .line 199
    .line 200
    iget-wide p0, p1, La/qdp;->a:J

    .line 201
    .line 202
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    goto :goto_2

    .line 207
    :cond_3
    instance-of p0, p1, La/sdp;

    .line 208
    .line 209
    if-eqz p0, :cond_4

    .line 210
    .line 211
    check-cast p1, La/sdp;

    .line 212
    .line 213
    iget-wide p0, p1, La/sdp;->a:J

    .line 214
    .line 215
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    goto :goto_2

    .line 220
    :cond_4
    instance-of p0, p1, La/rdp;

    .line 221
    .line 222
    if-eqz p0, :cond_5

    .line 223
    .line 224
    check-cast p1, La/rdp;

    .line 225
    .line 226
    iget-object v3, p1, La/rdp;->a:Ljava/lang/String;

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 230
    .line 231
    .line 232
    :goto_2
    return-object v3

    .line 233
    :pswitch_f
    check-cast p1, La/rbs0;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget-object p0, p1, La/rbs0;->a:Ljava/lang/String;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_10
    check-cast p1, La/hx50;

    .line 242
    .line 243
    iget-object p0, p1, La/hx50;->a:La/rcz;

    .line 244
    .line 245
    if-eqz p0, :cond_6

    .line 246
    .line 247
    invoke-virtual {p0}, La/rcz;->invoke()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_11
    check-cast p1, La/qu50;

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-boolean p0, p1, La/qu50;->b:Z

    .line 259
    .line 260
    if-eqz p0, :cond_7

    .line 261
    .line 262
    sget-object p0, La/tu50;->a:La/tu50;

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_7
    iget-object p0, p1, La/qu50;->c:La/mb10;

    .line 266
    .line 267
    iget-object p0, p0, La/mb10;->b:La/mdm;

    .line 268
    .line 269
    if-eqz p0, :cond_8

    .line 270
    .line 271
    new-instance p1, La/su50;

    .line 272
    .line 273
    invoke-direct {p1, p0}, La/su50;-><init>(La/mdm;)V

    .line 274
    .line 275
    .line 276
    move-object p0, p1

    .line 277
    goto :goto_3

    .line 278
    :cond_8
    new-instance p0, La/ru50;

    .line 279
    .line 280
    iget-object v0, p1, La/qu50;->a:Ljava/util/List;

    .line 281
    .line 282
    iget-object v1, p1, La/qu50;->d:Ljava/util/List;

    .line 283
    .line 284
    iget v2, p1, La/qu50;->e:I

    .line 285
    .line 286
    iget-boolean p1, p1, La/qu50;->f:Z

    .line 287
    .line 288
    invoke-direct {p0, v0, v1, v2, p1}, La/ru50;-><init>(Ljava/util/List;Ljava/util/List;IZ)V

    .line 289
    .line 290
    .line 291
    :goto_3
    return-object p0

    .line 292
    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object p0

    .line 300
    :pswitch_13
    move-object v4, p1

    .line 301
    check-cast v4, La/hcz;

    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object p0, La/eeq;->j:La/ugd;

    .line 307
    .line 308
    invoke-static {v4, v3, v3, p0, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 309
    .line 310
    .line 311
    sget-object v8, La/eeq;->k:La/ugd;

    .line 312
    .line 313
    const/4 v9, 0x6

    .line 314
    const/4 v5, 0x5

    .line 315
    const/4 v6, 0x0

    .line 316
    const/4 v7, 0x0

    .line 317
    invoke-static/range {v4 .. v9}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 318
    .line 319
    .line 320
    sget-object p0, La/eeq;->l:La/ugd;

    .line 321
    .line 322
    invoke-static {v4, v3, v3, p0, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 323
    .line 324
    .line 325
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object p0

    .line 328
    :pswitch_14
    move-object v4, p1

    .line 329
    check-cast v4, La/hcz;

    .line 330
    .line 331
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    sget-object p0, La/qjj;->d:La/ugd;

    .line 335
    .line 336
    invoke-static {v4, v3, v3, p0, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 337
    .line 338
    .line 339
    sget-object v8, La/qjj;->e:La/ugd;

    .line 340
    .line 341
    const/4 v9, 0x6

    .line 342
    const/4 v5, 0x5

    .line 343
    const/4 v6, 0x0

    .line 344
    const/4 v7, 0x0

    .line 345
    invoke-static/range {v4 .. v9}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 346
    .line 347
    .line 348
    sget-object p0, La/qjj;->f:La/ugd;

    .line 349
    .line 350
    invoke-static {v4, v3, v3, p0, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 351
    .line 352
    .line 353
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object p0

    .line 356
    :pswitch_15
    move-object v0, p1

    .line 357
    check-cast v0, La/hcz;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    sget-object v4, La/saj;->d:La/ugd;

    .line 363
    .line 364
    const/4 v5, 0x6

    .line 365
    const/4 v1, 0x5

    .line 366
    const/4 v2, 0x0

    .line 367
    const/4 v3, 0x0

    .line 368
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 369
    .line 370
    .line 371
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_16
    check-cast p1, La/cp;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    return-object p0

    .line 382
    :pswitch_17
    check-cast p1, Ljava/util/List;

    .line 383
    .line 384
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance p0, Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-eqz v0, :cond_9

    .line 405
    .line 406
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    check-cast v0, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;

    .line 411
    .line 412
    new-instance v1, La/jzg0;

    .line 413
    .line 414
    iget-object v2, v0, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;->a:Landroid/os/Parcelable;

    .line 415
    .line 416
    iget v3, v0, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;->b:I

    .line 417
    .line 418
    iget v0, v0, Lorg/xplatform/top/impl/utils/nested_list_scroll_anchor_holder/model/ScrollPosition;->c:I

    .line 419
    .line 420
    invoke-direct {v1, v3, v0, v2}, La/jzg0;-><init>(IILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_9
    new-instance p1, La/qj50;

    .line 428
    .line 429
    invoke-direct {p1, p0}, La/qj50;-><init>(Ljava/util/List;)V

    .line 430
    .line 431
    .line 432
    return-object p1

    .line 433
    :pswitch_18
    check-cast p1, La/m7h0;

    .line 434
    .line 435
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-static {p1}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    return-object p0

    .line 443
    :pswitch_19
    check-cast p1, La/ve50;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    instance-of p0, p1, La/ue50;

    .line 449
    .line 450
    const-string v1, ")"

    .line 451
    .line 452
    if-eqz p0, :cond_a

    .line 453
    .line 454
    check-cast p1, La/ue50;

    .line 455
    .line 456
    iget-object p0, p1, La/ue50;->a:La/wul0;

    .line 457
    .line 458
    invoke-interface {p0}, La/wul0;->a()La/m7h0;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    invoke-static {p0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    const-string p1, "Single("

    .line 467
    .line 468
    invoke-static {p1, p0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    goto/16 :goto_7

    .line 473
    .line 474
    :cond_a
    instance-of p0, p1, La/se50;

    .line 475
    .line 476
    const-string v2, ", screens="

    .line 477
    .line 478
    if-eqz p0, :cond_c

    .line 479
    .line 480
    check-cast p1, La/se50;

    .line 481
    .line 482
    iget-object p0, p1, La/se50;->a:La/wul0;

    .line 483
    .line 484
    invoke-interface {p0}, La/wul0;->a()La/m7h0;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    invoke-static {p0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    iget-object p1, p1, La/se50;->b:Ljava/util/List;

    .line 493
    .line 494
    new-instance v3, Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 501
    .line 502
    .line 503
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-eqz v0, :cond_b

    .line 512
    .line 513
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, La/wul0;

    .line 518
    .line 519
    invoke-interface {v0}, La/wul0;->a()La/m7h0;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    goto :goto_5

    .line 531
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    const-string v0, "Chain.Child(root="

    .line 534
    .line 535
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    goto :goto_7

    .line 555
    :cond_c
    instance-of p0, p1, La/re50;

    .line 556
    .line 557
    if-eqz p0, :cond_e

    .line 558
    .line 559
    check-cast p1, La/re50;

    .line 560
    .line 561
    iget-object p0, p1, La/re50;->a:La/nu4;

    .line 562
    .line 563
    iget-object v3, p1, La/re50;->b:La/wul0;

    .line 564
    .line 565
    invoke-interface {v3}, La/wul0;->a()La/m7h0;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-static {v3}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    iget-object p1, p1, La/re50;->c:Ljava/util/List;

    .line 574
    .line 575
    new-instance v4, Ljava/util/ArrayList;

    .line 576
    .line 577
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 582
    .line 583
    .line 584
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-eqz v0, :cond_d

    .line 593
    .line 594
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    check-cast v0, La/wul0;

    .line 599
    .line 600
    invoke-interface {v0}, La/wul0;->a()La/m7h0;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    goto :goto_6

    .line 612
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    const-string v0, "Chain.Auth(tag="

    .line 615
    .line 616
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    const-string p0, ", root="

    .line 623
    .line 624
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-static {p1, v4, v1}, La/rz4;->n(Ljava/lang/StringBuilder;Ljava/util/ArrayList;Ljava/lang/String;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    goto :goto_7

    .line 638
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 639
    .line 640
    .line 641
    :goto_7
    return-object v3

    .line 642
    :pswitch_1a
    check-cast p1, La/rb50;

    .line 643
    .line 644
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 648
    .line 649
    new-instance v0, Ljava/lang/StringBuilder;

    .line 650
    .line 651
    const-string v1, "Unknown screen "

    .line 652
    .line 653
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    throw p0

    .line 667
    :pswitch_1b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object p0

    .line 670
    :pswitch_1c
    check-cast p1, La/c53;

    .line 671
    .line 672
    new-instance p0, La/lie;

    .line 673
    .line 674
    const/16 p1, 0x2bc

    .line 675
    .line 676
    const/4 v0, 0x0

    .line 677
    const/4 v1, 0x6

    .line 678
    invoke-static {p1, v0, v3, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    const/4 v4, 0x0

    .line 683
    const/4 v5, 0x2

    .line 684
    invoke-static {v2, v4, v5}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-static {p1, v0, v3, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 689
    .line 690
    .line 691
    move-result-object p1

    .line 692
    invoke-static {p1, v5}, La/kzn;->e(La/cfq;I)La/alo;

    .line 693
    .line 694
    .line 695
    move-result-object p1

    .line 696
    const/16 v0, 0xc

    .line 697
    .line 698
    invoke-direct {p0, v2, p1, v3, v0}, La/lie;-><init>(La/pzn;La/alo;La/u7k0;I)V

    .line 699
    .line 700
    .line 701
    return-object p0

    .line 702
    nop

    .line 703
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
