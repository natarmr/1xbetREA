.class public final synthetic La/b8q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cp;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    iput-byte v0, p0, La/b8q0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b8q0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/b8q0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/e9q0;La/i83;La/vb00;)V
    .locals 0

    .line 2
    const/4 p1, 0x1

    iput-byte p1, p0, La/b8q0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/b8q0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/b8q0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/b8q0;->a:B

    iput-object p1, p0, La/b8q0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/b8q0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b8q0;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const v5, 0x799532c4

    .line 10
    .line 11
    .line 12
    const/4 v6, 0x5

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x1

    .line 18
    const/4 v12, 0x0

    .line 19
    iget-object v13, v0, La/b8q0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, La/b8q0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v0, La/cp;

    .line 27
    .line 28
    check-cast v13, Ljava/lang/String;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 38
    .line 39
    check-cast v1, La/cfs0;

    .line 40
    .line 41
    iget-object v2, v1, La/cfs0;->c:Landroid/widget/TextView;

    .line 42
    .line 43
    sget-object v3, La/rdj;->a:La/rdj;

    .line 44
    .line 45
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, La/m7w;

    .line 50
    .line 51
    iget-boolean v3, v3, La/m7w;->e:Z

    .line 52
    .line 53
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, La/m7w;

    .line 58
    .line 59
    iget-wide v4, v4, La/m7w;->a:J

    .line 60
    .line 61
    sget-object v6, La/efj;->c:La/efj;

    .line 62
    .line 63
    new-instance v7, La/znq0;

    .line 64
    .line 65
    invoke-direct {v7, v4, v5}, La/znq0;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const/16 v4, 0x38

    .line 73
    .line 74
    invoke-static {v7, v6, v3, v10, v4}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v1, La/cfs0;->b:Landroid/widget/TextView;

    .line 82
    .line 83
    sget-object v3, La/pn40;->a:La/pn40;

    .line 84
    .line 85
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, La/m7w;

    .line 90
    .line 91
    iget-wide v3, v3, La/m7w;->c:D

    .line 92
    .line 93
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 94
    .line 95
    invoke-static {v3, v4, v13, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v1, La/cfs0;->d:Landroid/widget/TextView;

    .line 103
    .line 104
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/m7w;

    .line 109
    .line 110
    iget-wide v2, v0, La/m7w;->d:D

    .line 111
    .line 112
    invoke-static {v2, v3, v13, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_0
    check-cast v13, La/bg5;

    .line 123
    .line 124
    check-cast v0, La/cp;

    .line 125
    .line 126
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, La/n8s0;

    .line 138
    .line 139
    iget-object v0, v0, La/n8s0;->a:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v13, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_1
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 148
    .line 149
    check-cast v0, La/f7s0;

    .line 150
    .line 151
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, La/jtl;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v1, La/t6s0;

    .line 159
    .line 160
    iget-object v0, v0, La/f7s0;->c:La/ci;

    .line 161
    .line 162
    iget-object v2, v0, La/ci;->b:La/hqt0;

    .line 163
    .line 164
    iget-object v0, v0, La/ci;->c:La/z1s0;

    .line 165
    .line 166
    invoke-direct {v1, v2, v0}, La/t6s0;-><init>(La/hqt0;La/z1s0;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_2
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 176
    .line 177
    check-cast v0, La/f6s0;

    .line 178
    .line 179
    move-object/from16 v1, p1

    .line 180
    .line 181
    check-cast v1, La/jtl;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v1, La/x5s0;

    .line 187
    .line 188
    iget-object v0, v0, La/f6s0;->c:La/ci;

    .line 189
    .line 190
    iget-object v2, v0, La/ci;->b:La/hqt0;

    .line 191
    .line 192
    iget-object v0, v0, La/ci;->c:La/z1s0;

    .line 193
    .line 194
    invoke-direct {v1, v2, v0}, La/x5s0;-><init>(La/hqt0;La/z1s0;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_3
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 204
    .line 205
    check-cast v0, La/c4s0;

    .line 206
    .line 207
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, La/jtl;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    new-instance v1, La/n3s0;

    .line 215
    .line 216
    iget-object v0, v0, La/c4s0;->g:La/ci;

    .line 217
    .line 218
    iget-object v2, v0, La/ci;->b:La/hqt0;

    .line 219
    .line 220
    iget-object v0, v0, La/ci;->c:La/z1s0;

    .line 221
    .line 222
    invoke-direct {v1, v2, v0}, La/n3s0;-><init>(La/hqt0;La/z1s0;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_4
    check-cast v13, La/vne;

    .line 232
    .line 233
    check-cast v0, La/kwj;

    .line 234
    .line 235
    move-object/from16 v1, p1

    .line 236
    .line 237
    check-cast v1, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    new-instance v2, La/gjg;

    .line 244
    .line 245
    invoke-direct {v2, v0, v1, v12, v7}, La/gjg;-><init>(La/kwj;ILa/yje;B)V

    .line 246
    .line 247
    .line 248
    invoke-static {v13, v12, v12, v2, v7}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_5
    check-cast v13, La/o6s0;

    .line 255
    .line 256
    check-cast v0, La/pz40;

    .line 257
    .line 258
    move-object/from16 v1, p1

    .line 259
    .line 260
    check-cast v1, La/qkx;

    .line 261
    .line 262
    iget-wide v2, v1, La/qkx;->a:J

    .line 263
    .line 264
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v13}, La/o6s0;->a()J

    .line 268
    .line 269
    .line 270
    move-result-wide v0

    .line 271
    invoke-virtual {v13, v0, v1}, La/o6s0;->b(J)V

    .line 272
    .line 273
    .line 274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_6
    check-cast v13, La/pwr0;

    .line 278
    .line 279
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 280
    .line 281
    move-object/from16 v1, p1

    .line 282
    .line 283
    check-cast v1, La/hcz;

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v2, v13, La/pwr0;->c:La/a4x;

    .line 289
    .line 290
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    new-instance v4, La/vdr0;

    .line 295
    .line 296
    invoke-direct {v4, v2, v6}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 297
    .line 298
    .line 299
    new-instance v5, La/njh0;

    .line 300
    .line 301
    const/16 v6, 0x16

    .line 302
    .line 303
    invoke-direct {v5, v2, v0, v6}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 304
    .line 305
    .line 306
    new-instance v0, La/ugd;

    .line 307
    .line 308
    const v2, 0x2fd4df92

    .line 309
    .line 310
    .line 311
    invoke-direct {v0, v2, v11, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v3, v12, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_7
    check-cast v13, La/a050;

    .line 321
    .line 322
    check-cast v0, La/vhv0;

    .line 323
    .line 324
    move-object/from16 v1, p1

    .line 325
    .line 326
    check-cast v1, La/vhv0;

    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    new-instance v2, La/ujo;

    .line 332
    .line 333
    invoke-direct {v2, v0, v1}, La/ujo;-><init>(La/vhv0;La/vhv0;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    iget-object v0, v13, La/a050;->a:La/pz40;

    .line 340
    .line 341
    check-cast v0, La/hgk0;

    .line 342
    .line 343
    invoke-virtual {v0, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_8
    check-cast v13, La/pz40;

    .line 350
    .line 351
    check-cast v0, La/l7m0;

    .line 352
    .line 353
    move-object/from16 v1, p1

    .line 354
    .line 355
    check-cast v1, La/uag0;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, La/asr0;

    .line 365
    .line 366
    iget-object v2, v2, La/asr0;->a:La/irq0;

    .line 367
    .line 368
    instance-of v2, v2, La/grq0;

    .line 369
    .line 370
    if-eqz v2, :cond_0

    .line 371
    .line 372
    const/high16 v0, 0x3f800000    # 1.0f

    .line 373
    .line 374
    goto :goto_0

    .line 375
    :cond_0
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Ljava/lang/Number;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    :goto_0
    invoke-virtual {v1, v0}, La/uag0;->b(F)V

    .line 386
    .line 387
    .line 388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_9
    check-cast v13, La/l7m0;

    .line 392
    .line 393
    check-cast v0, La/amr0;

    .line 394
    .line 395
    move-object/from16 v1, p1

    .line 396
    .line 397
    check-cast v1, La/hcz;

    .line 398
    .line 399
    sget v2, La/amr0;->m2:I

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, La/jq8;

    .line 409
    .line 410
    iget-object v2, v2, La/jq8;->b:Ljava/util/List;

    .line 411
    .line 412
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    new-instance v4, La/vdr0;

    .line 417
    .line 418
    invoke-direct {v4, v2, v9}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 419
    .line 420
    .line 421
    new-instance v6, La/zip0;

    .line 422
    .line 423
    invoke-direct {v6, v2, v0, v13, v8}, La/zip0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 424
    .line 425
    .line 426
    new-instance v0, La/ugd;

    .line 427
    .line 428
    invoke-direct {v0, v5, v11, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1, v3, v12, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 432
    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_a
    check-cast v13, La/l7m0;

    .line 438
    .line 439
    check-cast v0, La/ylr0;

    .line 440
    .line 441
    move-object/from16 v1, p1

    .line 442
    .line 443
    check-cast v1, La/hcz;

    .line 444
    .line 445
    sget v2, La/ylr0;->m2:I

    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    check-cast v2, La/cmr0;

    .line 455
    .line 456
    iget-object v2, v2, La/cmr0;->b:La/a4x;

    .line 457
    .line 458
    new-instance v3, La/efr0;

    .line 459
    .line 460
    invoke-direct {v3, v8}, La/efr0;-><init>(B)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    new-instance v8, La/xlr0;

    .line 468
    .line 469
    invoke-direct {v8, v3, v2, v10}, La/xlr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 470
    .line 471
    .line 472
    new-instance v3, La/e0m0;

    .line 473
    .line 474
    invoke-direct {v3, v2, v6}, La/e0m0;-><init>(La/a4x;B)V

    .line 475
    .line 476
    .line 477
    new-instance v6, La/zip0;

    .line 478
    .line 479
    invoke-direct {v6, v2, v0, v13, v7}, La/zip0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 480
    .line 481
    .line 482
    new-instance v0, La/ugd;

    .line 483
    .line 484
    invoke-direct {v0, v5, v11, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1, v4, v8, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 488
    .line 489
    .line 490
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    return-object v0

    .line 493
    :pswitch_b
    check-cast v13, La/v9r0;

    .line 494
    .line 495
    check-cast v0, La/k3t0;

    .line 496
    .line 497
    move-object/from16 v1, p1

    .line 498
    .line 499
    check-cast v1, La/cbr0;

    .line 500
    .line 501
    sget-object v2, La/v9r0;->O1:La/j6m0;

    .line 502
    .line 503
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    sget-object v2, La/cbr0;->a:La/cbr0;

    .line 507
    .line 508
    invoke-virtual {v1, v2}, La/cbr0;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    if-eqz v1, :cond_2

    .line 513
    .line 514
    sget-object v1, La/y9r0;->m2:Ljava/lang/String;

    .line 515
    .line 516
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    sget-object v2, La/y9r0;->m2:Ljava/lang/String;

    .line 524
    .line 525
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    if-eqz v3, :cond_1

    .line 530
    .line 531
    goto :goto_1

    .line 532
    :cond_1
    new-instance v3, La/y9r0;

    .line 533
    .line 534
    invoke-direct {v3}, La/y9r0;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    :cond_2
    :goto_1
    sget-object v1, La/f9r0;->a:La/f9r0;

    .line 541
    .line 542
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    return-object v0

    .line 548
    :pswitch_c
    check-cast v13, La/g2g0;

    .line 549
    .line 550
    check-cast v0, La/kr5;

    .line 551
    .line 552
    move-object/from16 v1, p1

    .line 553
    .line 554
    check-cast v1, La/k0w0;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object v2, v13, La/g2g0;->j:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v2, La/yox;

    .line 562
    .line 563
    iget-object v0, v0, La/kr5;->w:Ljava/lang/String;

    .line 564
    .line 565
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    new-instance v2, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 569
    .line 570
    invoke-direct {v2, v0}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;-><init>(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 574
    .line 575
    .line 576
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_d
    check-cast v13, La/xtq0;

    .line 580
    .line 581
    check-cast v0, La/gx10;

    .line 582
    .line 583
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, La/k0w0;

    .line 586
    .line 587
    iget-object v2, v13, La/xtq0;->W:La/jdk0;

    .line 588
    .line 589
    iget-object v0, v0, La/gx10;->b:La/vh0;

    .line 590
    .line 591
    iget-wide v12, v0, La/vh0;->g:J

    .line 592
    .line 593
    iget-object v14, v0, La/vh0;->b:Ljava/lang/String;

    .line 594
    .line 595
    iget-boolean v3, v0, La/vh0;->i:Z

    .line 596
    .line 597
    iget-wide v4, v0, La/vh0;->h:J

    .line 598
    .line 599
    iget-boolean v0, v0, La/vh0;->j:Z

    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    const-wide/16 v15, 0x0

    .line 605
    .line 606
    const/16 v21, 0x1

    .line 607
    .line 608
    const/16 v22, 0x0

    .line 609
    .line 610
    const/16 v23, 0x0

    .line 611
    .line 612
    const/16 v24, 0x0

    .line 613
    .line 614
    const/16 v25, 0x0

    .line 615
    .line 616
    const-string v26, ""

    .line 617
    .line 618
    const/16 v27, 0x1

    .line 619
    .line 620
    move/from16 v20, v0

    .line 621
    .line 622
    move/from16 v17, v3

    .line 623
    .line 624
    move-wide/from16 v18, v4

    .line 625
    .line 626
    invoke-static/range {v12 .. v27}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, La/c8d;

    .line 637
    .line 638
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 639
    .line 640
    new-instance v2, La/v7d;

    .line 641
    .line 642
    invoke-direct {v2, v11, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 643
    .line 644
    .line 645
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 646
    .line 647
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_e
    check-cast v13, La/xtq0;

    .line 651
    .line 652
    move-object v6, v0

    .line 653
    check-cast v6, La/t270;

    .line 654
    .line 655
    move-object/from16 v0, p1

    .line 656
    .line 657
    check-cast v0, La/k0w0;

    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    iget-object v1, v13, La/xtq0;->n:La/oct;

    .line 663
    .line 664
    const/4 v7, 0x0

    .line 665
    const/16 v8, 0x17

    .line 666
    .line 667
    const-wide/16 v2, 0x0

    .line 668
    .line 669
    const/4 v4, 0x0

    .line 670
    const/4 v5, 0x0

    .line 671
    invoke-static/range {v1 .. v8}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 676
    .line 677
    .line 678
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 679
    .line 680
    return-object v0

    .line 681
    :pswitch_f
    check-cast v13, La/xtq0;

    .line 682
    .line 683
    check-cast v0, La/c240;

    .line 684
    .line 685
    move-object/from16 v1, p1

    .line 686
    .line 687
    check-cast v1, La/k0w0;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    iget-object v5, v13, La/xtq0;->m:La/peg0;

    .line 693
    .line 694
    iget-object v6, v0, La/c240;->g:Ljava/lang/String;

    .line 695
    .line 696
    iget-wide v7, v0, La/c240;->e:J

    .line 697
    .line 698
    cmp-long v3, v7, v3

    .line 699
    .line 700
    if-gtz v3, :cond_3

    .line 701
    .line 702
    goto :goto_2

    .line 703
    :cond_3
    move-object v6, v12

    .line 704
    :goto_2
    if-nez v6, :cond_4

    .line 705
    .line 706
    move-object v14, v2

    .line 707
    goto :goto_3

    .line 708
    :cond_4
    move-object v14, v6

    .line 709
    :goto_3
    iget-wide v2, v0, La/c240;->d:J

    .line 710
    .line 711
    new-instance v13, La/fs80;

    .line 712
    .line 713
    const/16 v17, 0x0

    .line 714
    .line 715
    const/16 v18, 0x0

    .line 716
    .line 717
    const/16 v21, 0x0

    .line 718
    .line 719
    const/16 v22, 0x6c

    .line 720
    .line 721
    move-wide v15, v2

    .line 722
    move-wide/from16 v19, v7

    .line 723
    .line 724
    invoke-direct/range {v13 .. v22}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 725
    .line 726
    .line 727
    new-instance v0, La/fr1;

    .line 728
    .line 729
    invoke-direct {v0, v13, v12, v9}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v5, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 737
    .line 738
    .line 739
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 740
    .line 741
    return-object v0

    .line 742
    :pswitch_10
    check-cast v13, La/xtq0;

    .line 743
    .line 744
    check-cast v0, La/d240;

    .line 745
    .line 746
    move-object/from16 v1, p1

    .line 747
    .line 748
    check-cast v1, La/k0w0;

    .line 749
    .line 750
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    iget-object v2, v13, La/xtq0;->m:La/peg0;

    .line 754
    .line 755
    new-instance v3, La/fr1;

    .line 756
    .line 757
    new-instance v13, La/fs80;

    .line 758
    .line 759
    iget-object v14, v0, La/d240;->g:Ljava/lang/String;

    .line 760
    .line 761
    iget-wide v4, v0, La/d240;->d:J

    .line 762
    .line 763
    const/16 v21, 0x0

    .line 764
    .line 765
    const/16 v22, 0x7c

    .line 766
    .line 767
    const/16 v17, 0x0

    .line 768
    .line 769
    const/16 v18, 0x0

    .line 770
    .line 771
    const-wide/16 v19, 0x0

    .line 772
    .line 773
    move-wide v15, v4

    .line 774
    invoke-direct/range {v13 .. v22}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 775
    .line 776
    .line 777
    invoke-direct {v3, v13, v12, v9}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2, v3}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 785
    .line 786
    .line 787
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 788
    .line 789
    return-object v0

    .line 790
    :pswitch_11
    check-cast v13, La/usq0;

    .line 791
    .line 792
    check-cast v0, La/cym0;

    .line 793
    .line 794
    move-object/from16 v1, p1

    .line 795
    .line 796
    check-cast v1, La/cp;

    .line 797
    .line 798
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 802
    .line 803
    check-cast v2, La/jsx;

    .line 804
    .line 805
    iget-object v3, v2, La/jsx;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 806
    .line 807
    iget-object v4, v1, La/cp;->w:Landroid/content/Context;

    .line 808
    .line 809
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    const v6, 0x7f0701bb

    .line 814
    .line 815
    .line 816
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 825
    .line 826
    .line 827
    move-result v6

    .line 828
    const/4 v7, 0x0

    .line 829
    const/16 v8, 0xa

    .line 830
    .line 831
    move v4, v5

    .line 832
    const/4 v5, 0x0

    .line 833
    invoke-static/range {v3 .. v8}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 834
    .line 835
    .line 836
    iget-object v2, v2, La/jsx;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 837
    .line 838
    sget-object v3, La/pek0;->g:La/pek0;

    .line 839
    .line 840
    invoke-virtual {v2, v3}, La/x1;->setViewCompositionStrategy(La/vgu0;)V

    .line 841
    .line 842
    .line 843
    new-instance v2, La/nej0;

    .line 844
    .line 845
    const/16 v3, 0x1a

    .line 846
    .line 847
    invoke-direct {v2, v1, v13, v0, v3}, La/nej0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 851
    .line 852
    .line 853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 854
    .line 855
    return-object v0

    .line 856
    :pswitch_12
    check-cast v13, La/qrq0;

    .line 857
    .line 858
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 859
    .line 860
    move-object/from16 v1, p1

    .line 861
    .line 862
    check-cast v1, Landroid/view/View;

    .line 863
    .line 864
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    iget-object v1, v13, La/qrq0;->l:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 868
    .line 869
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 870
    .line 871
    .line 872
    move-result v3

    .line 873
    if-nez v3, :cond_8

    .line 874
    .line 875
    iget-object v0, v13, La/qrq0;->m:La/rsq0;

    .line 876
    .line 877
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-virtual {v3}, Landroid/view/View;->clearFocus()V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 892
    .line 893
    .line 894
    const/16 v2, 0x8

    .line 895
    .line 896
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->c()V

    .line 900
    .line 901
    .line 902
    iget-boolean v1, v13, La/qrq0;->g:Z

    .line 903
    .line 904
    iget-object v3, v13, La/qrq0;->k:Landroid/view/View;

    .line 905
    .line 906
    if-eqz v1, :cond_6

    .line 907
    .line 908
    if-eqz v3, :cond_5

    .line 909
    .line 910
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 911
    .line 912
    .line 913
    :cond_5
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 914
    .line 915
    .line 916
    goto :goto_4

    .line 917
    :cond_6
    if-eqz v3, :cond_7

    .line 918
    .line 919
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 920
    .line 921
    .line 922
    :cond_7
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 923
    .line 924
    .line 925
    :goto_4
    iget-object v0, v13, La/qrq0;->o:La/jc50;

    .line 926
    .line 927
    invoke-virtual {v0}, La/jc50;->a()V

    .line 928
    .line 929
    .line 930
    iget-object v0, v13, La/qrq0;->i:Lkotlin/jvm/functions/Function0;

    .line 931
    .line 932
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    iget-object v0, v13, La/qrq0;->j:Lkotlin/jvm/functions/Function1;

    .line 936
    .line 937
    if-eqz v0, :cond_9

    .line 938
    .line 939
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 940
    .line 941
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    goto :goto_5

    .line 945
    :cond_8
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    :cond_9
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 949
    .line 950
    return-object v0

    .line 951
    :pswitch_13
    check-cast v13, La/qjk;

    .line 952
    .line 953
    check-cast v0, La/noq0;

    .line 954
    .line 955
    move-object/from16 v1, p1

    .line 956
    .line 957
    check-cast v1, Landroid/view/View;

    .line 958
    .line 959
    sget-object v2, La/noq0;->m2:La/y2m0;

    .line 960
    .line 961
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    iget-object v1, v13, La/qjk;->h:Landroidx/viewpager2/widget/ViewPager2;

    .line 965
    .line 966
    invoke-virtual {v0}, La/noq0;->V0()I

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    add-int/2addr v2, v11

    .line 971
    invoke-virtual {v1, v2, v11}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0}, La/noq0;->Y0()La/xoq0;

    .line 975
    .line 976
    .line 977
    move-result-object v12

    .line 978
    invoke-virtual {v0}, La/noq0;->X0()I

    .line 979
    .line 980
    .line 981
    move-result v13

    .line 982
    invoke-virtual {v0}, La/noq0;->V0()I

    .line 983
    .line 984
    .line 985
    move-result v1

    .line 986
    add-int/lit8 v14, v1, 0x1

    .line 987
    .line 988
    invoke-virtual {v0}, La/noq0;->T0()La/ioq0;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    iget-object v1, v1, La/i26;->f:Ljava/lang/Object;

    .line 993
    .line 994
    check-cast v1, Ljava/util/ArrayList;

    .line 995
    .line 996
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 997
    .line 998
    .line 999
    move-result v15

    .line 1000
    iget-object v1, v0, La/noq0;->i2:La/phf0;

    .line 1001
    .line 1002
    sget-object v2, La/noq0;->n2:[La/iiy;

    .line 1003
    .line 1004
    aget-object v2, v2, v8

    .line 1005
    .line 1006
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v16

    .line 1010
    sget-object v17, La/jf3;->b:La/jf3;

    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v17}, La/xoq0;->w(IIILjava/lang/String;La/jf3;)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1016
    .line 1017
    return-object v0

    .line 1018
    :pswitch_14
    check-cast v13, La/anq0;

    .line 1019
    .line 1020
    check-cast v0, La/ctf0;

    .line 1021
    .line 1022
    move-object/from16 v5, p1

    .line 1023
    .line 1024
    check-cast v5, La/bnk0;

    .line 1025
    .line 1026
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    iget-boolean v1, v13, La/anq0;->j:Z

    .line 1030
    .line 1031
    if-eqz v1, :cond_a

    .line 1032
    .line 1033
    iget-wide v1, v13, La/anq0;->e:J

    .line 1034
    .line 1035
    cmp-long v1, v1, v3

    .line 1036
    .line 1037
    if-eqz v1, :cond_c

    .line 1038
    .line 1039
    invoke-static {v13, v0}, La/pzb;->I(La/anq0;La/ctf0;)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v6

    .line 1043
    const/4 v10, 0x0

    .line 1044
    const/16 v11, 0x36

    .line 1045
    .line 1046
    const/4 v7, 0x0

    .line 1047
    const v8, 0x7f0606e1

    .line 1048
    .line 1049
    .line 1050
    const/4 v9, 0x0

    .line 1051
    invoke-static/range {v5 .. v11}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1052
    .line 1053
    .line 1054
    const-string v6, " "

    .line 1055
    .line 1056
    invoke-static/range {v5 .. v11}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1057
    .line 1058
    .line 1059
    invoke-static {v13}, La/pzb;->V(La/anq0;)Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v6

    .line 1063
    invoke-static/range {v5 .. v11}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_6

    .line 1067
    :cond_a
    iget-wide v1, v13, La/anq0;->d:J

    .line 1068
    .line 1069
    cmp-long v1, v1, v3

    .line 1070
    .line 1071
    if-eqz v1, :cond_c

    .line 1072
    .line 1073
    invoke-static {v13, v0}, La/pzb;->H(La/anq0;La/ctf0;)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v6

    .line 1077
    const/4 v10, 0x0

    .line 1078
    const/16 v11, 0x36

    .line 1079
    .line 1080
    const/4 v7, 0x0

    .line 1081
    const v8, 0x7f0606e1

    .line 1082
    .line 1083
    .line 1084
    const/4 v9, 0x0

    .line 1085
    invoke-static/range {v5 .. v11}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1086
    .line 1087
    .line 1088
    iget-object v0, v5, La/bnk0;->a:Ljava/util/ArrayList;

    .line 1089
    .line 1090
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v0

    .line 1094
    if-nez v0, :cond_b

    .line 1095
    .line 1096
    const/4 v10, 0x0

    .line 1097
    const/16 v11, 0x36

    .line 1098
    .line 1099
    const-string v6, " "

    .line 1100
    .line 1101
    const/4 v7, 0x0

    .line 1102
    const v8, 0x7f0606e1

    .line 1103
    .line 1104
    .line 1105
    const/4 v9, 0x0

    .line 1106
    invoke-static/range {v5 .. v11}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1107
    .line 1108
    .line 1109
    :cond_b
    invoke-static {v13}, La/pzb;->U(La/anq0;)Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v6

    .line 1113
    const/4 v10, 0x0

    .line 1114
    const/16 v11, 0x36

    .line 1115
    .line 1116
    const/4 v7, 0x0

    .line 1117
    const v8, 0x7f0606e1

    .line 1118
    .line 1119
    .line 1120
    const/4 v9, 0x0

    .line 1121
    invoke-static/range {v5 .. v11}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1122
    .line 1123
    .line 1124
    :cond_c
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1125
    .line 1126
    return-object v0

    .line 1127
    :pswitch_15
    check-cast v13, La/chq0;

    .line 1128
    .line 1129
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1130
    .line 1131
    move-object/from16 v1, p1

    .line 1132
    .line 1133
    check-cast v1, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 1134
    .line 1135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-interface {v13}, La/chq0;->a()Z

    .line 1139
    .line 1140
    .line 1141
    move-result v2

    .line 1142
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelectedForced(Z)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v1, v12}, Lorg/xplatform/uikit/components/chips/DsChip;->setText(Ljava/lang/CharSequence;)V

    .line 1146
    .line 1147
    .line 1148
    invoke-interface {v13}, La/chq0;->getTitle()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setText(Ljava/lang/CharSequence;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v1, v12}, Lorg/xplatform/uikit/components/chips/DsChip;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v1, v12}, Lorg/xplatform/uikit/components/chips/DsChip;->setCount(Ljava/lang/Integer;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v1, v12}, Lorg/xplatform/uikit/components/chips/DsChip;->setValueText(Ljava/lang/CharSequence;)V

    .line 1162
    .line 1163
    .line 1164
    new-instance v2, La/bs50;

    .line 1165
    .line 1166
    const/16 v3, 0x10

    .line 1167
    .line 1168
    invoke-direct {v2, v0, v13, v3}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1172
    .line 1173
    .line 1174
    instance-of v0, v13, La/ahq0;

    .line 1175
    .line 1176
    if-eqz v0, :cond_d

    .line 1177
    .line 1178
    invoke-virtual {v1, v12}, Lorg/xplatform/uikit/components/chips/DsChip;->setActionIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_7

    .line 1182
    :cond_d
    instance-of v0, v13, La/bhq0;

    .line 1183
    .line 1184
    if-eqz v0, :cond_e

    .line 1185
    .line 1186
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    const v2, 0x7f080815

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v0, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setRightIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    const v2, 0x7f040b0b

    .line 1211
    .line 1212
    .line 1213
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    const v3, 0x7f040b03

    .line 1229
    .line 1230
    .line 1231
    invoke-static {v3, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1232
    .line 1233
    .line 1234
    move-result v2

    .line 1235
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2

    .line 1239
    invoke-static {v0, v2}, La/m5d;->d(Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/content/res/ColorStateList;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 1244
    .line 1245
    .line 1246
    :goto_7
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1247
    .line 1248
    goto :goto_8

    .line 1249
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 1250
    .line 1251
    .line 1252
    :goto_8
    return-object v12

    .line 1253
    :pswitch_16
    check-cast v13, Ljava/lang/String;

    .line 1254
    .line 1255
    check-cast v0, Ljava/lang/String;

    .line 1256
    .line 1257
    move-object/from16 v1, p1

    .line 1258
    .line 1259
    check-cast v1, La/abi0;

    .line 1260
    .line 1261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    invoke-static {v13}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v2

    .line 1272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1273
    .line 1274
    .line 1275
    sget-object v3, La/paq0;->b:La/zai0;

    .line 1276
    .line 1277
    sget-object v4, La/paq0;->a:[La/iiy;

    .line 1278
    .line 1279
    aget-object v5, v4, v10

    .line 1280
    .line 1281
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    invoke-interface {v1, v3, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1285
    .line 1286
    .line 1287
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1296
    .line 1297
    .line 1298
    sget-object v2, La/paq0;->c:La/zai0;

    .line 1299
    .line 1300
    aget-object v3, v4, v11

    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1303
    .line 1304
    .line 1305
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1306
    .line 1307
    .line 1308
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1309
    .line 1310
    return-object v0

    .line 1311
    :pswitch_17
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1312
    .line 1313
    check-cast v0, La/m9q0;

    .line 1314
    .line 1315
    move-object/from16 v1, p1

    .line 1316
    .line 1317
    check-cast v1, La/x5q0;

    .line 1318
    .line 1319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    new-instance v1, La/o3f0;

    .line 1323
    .line 1324
    invoke-direct {v1, v0}, La/o3f0;-><init>(La/m9q0;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1331
    .line 1332
    return-object v0

    .line 1333
    :pswitch_18
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1334
    .line 1335
    check-cast v0, La/l9q0;

    .line 1336
    .line 1337
    move-object/from16 v1, p1

    .line 1338
    .line 1339
    check-cast v1, La/x5q0;

    .line 1340
    .line 1341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    new-instance v1, La/fwe0;

    .line 1345
    .line 1346
    invoke-direct {v1, v0}, La/fwe0;-><init>(La/l9q0;)V

    .line 1347
    .line 1348
    .line 1349
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1353
    .line 1354
    return-object v0

    .line 1355
    :pswitch_19
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1356
    .line 1357
    check-cast v0, La/k9q0;

    .line 1358
    .line 1359
    move-object/from16 v1, p1

    .line 1360
    .line 1361
    check-cast v1, La/x5q0;

    .line 1362
    .line 1363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1364
    .line 1365
    .line 1366
    new-instance v1, La/q9f0;

    .line 1367
    .line 1368
    invoke-direct {v1, v0}, La/q9f0;-><init>(La/k9q0;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1375
    .line 1376
    return-object v0

    .line 1377
    :pswitch_1a
    check-cast v13, La/e9q0;

    .line 1378
    .line 1379
    check-cast v0, La/i83;

    .line 1380
    .line 1381
    move-object/from16 v1, p1

    .line 1382
    .line 1383
    check-cast v1, La/uag0;

    .line 1384
    .line 1385
    iget-object v2, v13, La/e9q0;->b:La/j83;

    .line 1386
    .line 1387
    iget-object v3, v13, La/e9q0;->a:La/pz40;

    .line 1388
    .line 1389
    move-object v4, v3

    .line 1390
    check-cast v4, La/hgk0;

    .line 1391
    .line 1392
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v4

    .line 1396
    check-cast v4, La/a9q0;

    .line 1397
    .line 1398
    if-eqz v4, :cond_f

    .line 1399
    .line 1400
    iget-object v4, v4, La/a9q0;->a:La/z8q0;

    .line 1401
    .line 1402
    if-eqz v4, :cond_f

    .line 1403
    .line 1404
    iget-object v4, v4, La/z8q0;->a:La/j83;

    .line 1405
    .line 1406
    goto :goto_9

    .line 1407
    :cond_f
    move-object v4, v12

    .line 1408
    :goto_9
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    if-nez v2, :cond_11

    .line 1413
    .line 1414
    :cond_10
    :goto_a
    move-object v5, v12

    .line 1415
    goto :goto_c

    .line 1416
    :cond_11
    check-cast v3, La/hgk0;

    .line 1417
    .line 1418
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    check-cast v2, La/a9q0;

    .line 1423
    .line 1424
    if-eqz v2, :cond_10

    .line 1425
    .line 1426
    iget-object v3, v2, La/a9q0;->b:La/bw40;

    .line 1427
    .line 1428
    invoke-static {v0, v2}, La/e9q0;->c(La/i83;La/a9q0;)La/i83;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v0

    .line 1432
    if-nez v0, :cond_12

    .line 1433
    .line 1434
    goto :goto_a

    .line 1435
    :cond_12
    iget v4, v0, La/i83;->c:I

    .line 1436
    .line 1437
    iget v0, v0, La/i83;->b:I

    .line 1438
    .line 1439
    invoke-virtual {v2, v0, v4}, La/a9q0;->k(II)La/w03;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v5

    .line 1443
    invoke-virtual {v2, v0}, La/a9q0;->b(I)La/jge0;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v6

    .line 1447
    sub-int/2addr v4, v11

    .line 1448
    invoke-virtual {v2, v4}, La/a9q0;->b(I)La/jge0;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    invoke-virtual {v3, v0}, La/bw40;->d(I)I

    .line 1453
    .line 1454
    .line 1455
    move-result v0

    .line 1456
    invoke-virtual {v3, v4}, La/bw40;->d(I)I

    .line 1457
    .line 1458
    .line 1459
    move-result v3

    .line 1460
    if-ne v0, v3, :cond_13

    .line 1461
    .line 1462
    iget v0, v2, La/jge0;->a:F

    .line 1463
    .line 1464
    iget v2, v6, La/jge0;->a:F

    .line 1465
    .line 1466
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    .line 1467
    .line 1468
    .line 1469
    move-result v0

    .line 1470
    goto :goto_b

    .line 1471
    :cond_13
    const/4 v0, 0x0

    .line 1472
    :goto_b
    iget v2, v6, La/jge0;->b:F

    .line 1473
    .line 1474
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1475
    .line 1476
    .line 1477
    move-result v0

    .line 1478
    int-to-long v3, v0

    .line 1479
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    int-to-long v6, v0

    .line 1484
    const/16 v0, 0x20

    .line 1485
    .line 1486
    shl-long v2, v3, v0

    .line 1487
    .line 1488
    const-wide v8, 0xffffffffL

    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    and-long/2addr v6, v8

    .line 1494
    or-long/2addr v2, v6

    .line 1495
    const-wide v6, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    xor-long/2addr v2, v6

    .line 1501
    invoke-virtual {v5, v2, v3}, La/w03;->k(J)V

    .line 1502
    .line 1503
    .line 1504
    :goto_c
    if-eqz v5, :cond_14

    .line 1505
    .line 1506
    new-instance v12, La/d9q0;

    .line 1507
    .line 1508
    invoke-direct {v12, v5}, La/d9q0;-><init>(La/w03;)V

    .line 1509
    .line 1510
    .line 1511
    :cond_14
    if-eqz v12, :cond_15

    .line 1512
    .line 1513
    invoke-virtual {v1, v12}, La/uag0;->D(La/yjj0;)V

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v1, v11}, La/uag0;->g(Z)V

    .line 1517
    .line 1518
    .line 1519
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1520
    .line 1521
    return-object v0

    .line 1522
    :pswitch_1b
    check-cast v13, La/i83;

    .line 1523
    .line 1524
    check-cast v0, La/vb00;

    .line 1525
    .line 1526
    iget-object v0, v0, La/vb00;->b:La/cgk0;

    .line 1527
    .line 1528
    move-object/from16 v1, p1

    .line 1529
    .line 1530
    check-cast v1, La/m2q0;

    .line 1531
    .line 1532
    iget-object v2, v13, La/i83;->a:Ljava/lang/Object;

    .line 1533
    .line 1534
    check-cast v2, La/kb00;

    .line 1535
    .line 1536
    invoke-virtual {v2}, La/kb00;->b()La/f9q0;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v3

    .line 1540
    if-eqz v3, :cond_16

    .line 1541
    .line 1542
    iget-object v3, v3, La/f9q0;->a:La/smk0;

    .line 1543
    .line 1544
    goto :goto_d

    .line 1545
    :cond_16
    move-object v3, v12

    .line 1546
    :goto_d
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 1547
    .line 1548
    .line 1549
    move-result v4

    .line 1550
    and-int/2addr v4, v11

    .line 1551
    if-eqz v4, :cond_17

    .line 1552
    .line 1553
    invoke-virtual {v2}, La/kb00;->b()La/f9q0;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v4

    .line 1557
    if-eqz v4, :cond_17

    .line 1558
    .line 1559
    iget-object v4, v4, La/f9q0;->b:La/smk0;

    .line 1560
    .line 1561
    goto :goto_e

    .line 1562
    :cond_17
    move-object v4, v12

    .line 1563
    :goto_e
    if-eqz v3, :cond_18

    .line 1564
    .line 1565
    invoke-virtual {v3, v4}, La/smk0;->d(La/smk0;)La/smk0;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v4

    .line 1569
    :cond_18
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 1570
    .line 1571
    .line 1572
    move-result v3

    .line 1573
    and-int/2addr v3, v9

    .line 1574
    if-eqz v3, :cond_19

    .line 1575
    .line 1576
    invoke-virtual {v2}, La/kb00;->b()La/f9q0;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v3

    .line 1580
    if-eqz v3, :cond_19

    .line 1581
    .line 1582
    iget-object v3, v3, La/f9q0;->c:La/smk0;

    .line 1583
    .line 1584
    goto :goto_f

    .line 1585
    :cond_19
    move-object v3, v12

    .line 1586
    :goto_f
    if-eqz v4, :cond_1a

    .line 1587
    .line 1588
    invoke-virtual {v4, v3}, La/smk0;->d(La/smk0;)La/smk0;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v3

    .line 1592
    :cond_1a
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 1593
    .line 1594
    .line 1595
    move-result v0

    .line 1596
    and-int/2addr v0, v8

    .line 1597
    if-eqz v0, :cond_1b

    .line 1598
    .line 1599
    invoke-virtual {v2}, La/kb00;->b()La/f9q0;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    if-eqz v0, :cond_1b

    .line 1604
    .line 1605
    iget-object v12, v0, La/f9q0;->d:La/smk0;

    .line 1606
    .line 1607
    :cond_1b
    if-eqz v3, :cond_1c

    .line 1608
    .line 1609
    invoke-virtual {v3, v12}, La/smk0;->d(La/smk0;)La/smk0;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v12

    .line 1613
    :cond_1c
    new-instance v0, La/hie0;

    .line 1614
    .line 1615
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1616
    .line 1617
    .line 1618
    iget-object v2, v1, La/m2q0;->a:La/j83;

    .line 1619
    .line 1620
    new-instance v3, La/nej0;

    .line 1621
    .line 1622
    const/16 v4, 0x13

    .line 1623
    .line 1624
    invoke-direct {v3, v0, v13, v12, v4}, La/nej0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v2, v3}, La/j83;->b(Lkotlin/jvm/functions/Function1;)La/j83;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    iput-object v0, v1, La/m2q0;->b:La/j83;

    .line 1632
    .line 1633
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1634
    .line 1635
    return-object v0

    .line 1636
    :pswitch_1c
    check-cast v13, La/hz;

    .line 1637
    .line 1638
    check-cast v0, La/cp;

    .line 1639
    .line 1640
    move-object/from16 v1, p1

    .line 1641
    .line 1642
    check-cast v1, Landroid/text/Editable;

    .line 1643
    .line 1644
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v1

    .line 1651
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v0

    .line 1655
    check-cast v0, La/x7q0;

    .line 1656
    .line 1657
    iget-object v0, v0, La/x7q0;->a:La/vqp;

    .line 1658
    .line 1659
    invoke-virtual {v13, v1, v0}, La/hz;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1660
    .line 1661
    .line 1662
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1663
    .line 1664
    return-object v0

    .line 1665
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
