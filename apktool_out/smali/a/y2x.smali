.class public final synthetic La/y2x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y2x;->a:B

    iput-object p1, p0, La/y2x;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/y2x;->a:B

    .line 2
    .line 3
    const-string v1, "input_method"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "viewModelFactory"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object p0, p0, La/y2x;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/dbz;

    .line 16
    .line 17
    iget-object p0, p0, La/dbz;->j:La/hwk;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p0, La/k7z;

    .line 28
    .line 29
    iget-object v0, p0, La/k7z;->g:La/pz40;

    .line 30
    .line 31
    check-cast v0, La/hgk0;

    .line 32
    .line 33
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-object p0, p0, La/k7z;->c:La/tld;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, La/tld;->r()V

    .line 50
    .line 51
    .line 52
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p0, La/e7z;

    .line 56
    .line 57
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 58
    .line 59
    iget-object v0, p0, La/i7z;->p:La/sj30;

    .line 60
    .line 61
    iput-boolean v2, v0, La/sj30;->A:Z

    .line 62
    .line 63
    iget-object p0, p0, La/i7z;->q:La/i810;

    .line 64
    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    iput-boolean v2, p0, La/i810;->u:Z

    .line 68
    .line 69
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_2
    check-cast p0, La/k4z;

    .line 73
    .line 74
    new-instance v0, La/d4z;

    .line 75
    .line 76
    iget-object p0, p0, La/k4z;->a:La/h4z;

    .line 77
    .line 78
    iget-wide v1, p0, La/h4z;->a:J

    .line 79
    .line 80
    invoke-direct {v0, v1, v2}, La/d4z;-><init>(J)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_3
    check-cast p0, La/i4z;

    .line 85
    .line 86
    new-instance v0, La/v3z;

    .line 87
    .line 88
    iget-object p0, p0, La/i4z;->a:La/h4z;

    .line 89
    .line 90
    iget-wide v1, p0, La/h4z;->a:J

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, La/v3z;-><init>(J)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_4
    check-cast p0, La/l1z;

    .line 97
    .line 98
    iget-object p0, p0, La/l1z;->f:La/a4x;

    .line 99
    .line 100
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_5
    check-cast p0, La/s0z;

    .line 110
    .line 111
    sget-object v0, La/s0z;->U1:La/bst;

    .line 112
    .line 113
    iget-object p0, p0, La/s0z;->M1:La/fiu0;

    .line 114
    .line 115
    if-eqz p0, :cond_3

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v5

    .line 122
    :pswitch_6
    check-cast p0, La/u8u;

    .line 123
    .line 124
    iget-object p0, p0, La/u8u;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, La/gii0;

    .line 127
    .line 128
    const-class v0, La/syy;

    .line 129
    .line 130
    sget-object v1, La/sre0;->a:La/tre0;

    .line 131
    .line 132
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, La/syy;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_7
    check-cast p0, La/pzy;

    .line 144
    .line 145
    sget-object v0, La/pzy;->Q1:La/sqt;

    .line 146
    .line 147
    iget-object p0, p0, La/pzy;->K1:La/fiu0;

    .line 148
    .line 149
    if-eqz p0, :cond_4

    .line 150
    .line 151
    return-object p0

    .line 152
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v5

    .line 156
    :pswitch_8
    check-cast p0, La/lbu;

    .line 157
    .line 158
    iget-object p0, p0, La/lbu;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, La/gii0;

    .line 161
    .line 162
    const-class v0, La/xuy;

    .line 163
    .line 164
    sget-object v1, La/sre0;->a:La/tre0;

    .line 165
    .line 166
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, La/xuy;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_9
    check-cast p0, La/rny;

    .line 178
    .line 179
    new-instance v0, La/m9d;

    .line 180
    .line 181
    iget-object v1, p0, La/rny;->d:La/knf0;

    .line 182
    .line 183
    invoke-virtual {v1}, La/knf0;->a()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    iget-object v1, p0, La/rny;->b:La/tgk;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-static {}, La/tgk;->i()V

    .line 193
    .line 194
    .line 195
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {}, La/tgk;->h()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iget-object v3, p0, La/rny;->j:La/z7z;

    .line 202
    .line 203
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    check-cast v3, Ljava/lang/String;

    .line 211
    .line 212
    iget-object p0, p0, La/rny;->h:La/us3;

    .line 213
    .line 214
    invoke-virtual {p0}, La/us3;->c()La/go3;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p0}, La/go3;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {}, La/tgk;->c()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    const-string p0, "os.arch"

    .line 232
    .line 233
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    const-string v6, ""

    .line 238
    .line 239
    if-nez p0, :cond_5

    .line 240
    .line 241
    move-object p0, v6

    .line 242
    :cond_5
    sget-object v7, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v7}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    check-cast v7, Ljava/lang/String;

    .line 252
    .line 253
    if-nez v7, :cond_6

    .line 254
    .line 255
    move-object v7, v6

    .line 256
    :cond_6
    move-object v6, p0

    .line 257
    invoke-direct/range {v0 .. v7}, La/m9d;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_a
    check-cast p0, La/iha;

    .line 262
    .line 263
    iget-object p0, p0, La/iha;->c:Landroid/view/KeyEvent$Callback;

    .line 264
    .line 265
    check-cast p0, La/kxq;

    .line 266
    .line 267
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 276
    .line 277
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    return-object p0

    .line 282
    :pswitch_b
    check-cast p0, La/miy;

    .line 283
    .line 284
    iget-object p0, p0, La/miy;->a:Ljava/lang/Object;

    .line 285
    .line 286
    instance-of v0, p0, La/kry;

    .line 287
    .line 288
    if-eqz v0, :cond_7

    .line 289
    .line 290
    check-cast p0, La/kry;

    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_7
    move-object p0, v5

    .line 294
    :goto_0
    if-eqz p0, :cond_8

    .line 295
    .line 296
    invoke-interface {p0}, La/kry;->findJavaDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    :cond_8
    return-object v5

    .line 301
    :pswitch_c
    move-object v0, p0

    .line 302
    check-cast v0, La/f8y;

    .line 303
    .line 304
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 305
    .line 306
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 307
    .line 308
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 316
    .line 317
    move-object v3, p0

    .line 318
    check-cast v3, La/u7y;

    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    const/4 v8, 0x0

    .line 324
    const/16 v9, 0x16

    .line 325
    .line 326
    sget-object v4, La/n7y;->a:La/n7y;

    .line 327
    .line 328
    const/4 v5, 0x0

    .line 329
    const-wide/16 v6, 0x0

    .line 330
    .line 331
    invoke-static/range {v3 .. v9}, La/u7y;->a(La/u7y;La/o7y;Ljava/util/List;JZI)La/u7y;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    if-eqz p0, :cond_9

    .line 340
    .line 341
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object p0

    .line 344
    :pswitch_d
    check-cast p0, La/n4u;

    .line 345
    .line 346
    invoke-virtual {p0}, La/n4u;->c()La/t2y;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    new-instance v0, La/u7y;

    .line 351
    .line 352
    sget-object v3, La/iun;->a:La/iun;

    .line 353
    .line 354
    const-wide/16 v4, 0x0

    .line 355
    .line 356
    const/4 v6, 0x0

    .line 357
    sget-object v1, La/n7y;->a:La/n7y;

    .line 358
    .line 359
    invoke-direct/range {v0 .. v6}, La/u7y;-><init>(La/o7y;La/t2y;Ljava/util/List;JZ)V

    .line 360
    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_e
    check-cast p0, La/ieu;

    .line 364
    .line 365
    iget-object p0, p0, La/ieu;->b:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast p0, La/gii0;

    .line 368
    .line 369
    const-class v0, La/qzx;

    .line 370
    .line 371
    sget-object v1, La/sre0;->a:La/tre0;

    .line 372
    .line 373
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    check-cast p0, La/qzx;

    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_f
    check-cast p0, La/e6y;

    .line 385
    .line 386
    sget-object v0, La/q5y;->a:La/q5y;

    .line 387
    .line 388
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_10
    check-cast p0, La/c5y;

    .line 395
    .line 396
    sget-object v0, La/r4y;->a:La/r4y;

    .line 397
    .line 398
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    return-object p0

    .line 404
    :pswitch_11
    check-cast p0, La/d4y;

    .line 405
    .line 406
    sget-object v0, La/q3y;->a:La/q3y;

    .line 407
    .line 408
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object p0

    .line 414
    :pswitch_12
    check-cast p0, La/a2y;

    .line 415
    .line 416
    sget-object v0, La/l1y;->a:La/l1y;

    .line 417
    .line 418
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object p0

    .line 424
    :pswitch_13
    check-cast p0, La/mox;

    .line 425
    .line 426
    iget-object p0, p0, La/mox;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 427
    .line 428
    invoke-virtual {p0}, La/aeg0;->k()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_b

    .line 433
    .line 434
    invoke-virtual {p0}, La/aeg0;->n()Z

    .line 435
    .line 436
    .line 437
    move-result p0

    .line 438
    if-eqz p0, :cond_a

    .line 439
    .line 440
    goto :goto_1

    .line 441
    :cond_a
    move v2, v3

    .line 442
    :cond_b
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    return-object p0

    .line 447
    :pswitch_14
    check-cast p0, Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;

    .line 448
    .line 449
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;->B:La/fiu0;

    .line 450
    .line 451
    if-eqz p0, :cond_c

    .line 452
    .line 453
    return-object p0

    .line 454
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v5

    .line 458
    :pswitch_15
    check-cast p0, La/rix;

    .line 459
    .line 460
    iget-object p0, p0, La/rix;->a:La/us00;

    .line 461
    .line 462
    invoke-static {p0}, Lcom/android/installreferrer/api/InstallReferrerClient;->newBuilder(Landroid/content/Context;)Lcom/android/installreferrer/api/InstallReferrerClient$Builder;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    invoke-virtual {p0}, Lcom/android/installreferrer/api/InstallReferrerClient$Builder;->build()Lcom/android/installreferrer/api/InstallReferrerClient;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    return-object p0

    .line 471
    :pswitch_16
    check-cast p0, La/xex;

    .line 472
    .line 473
    iget-object p0, p0, La/xex;->a:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast p0, Landroid/view/View;

    .line 476
    .line 477
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_17
    check-cast p0, La/y3v;

    .line 492
    .line 493
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast p0, Landroid/view/View;

    .line 496
    .line 497
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 509
    .line 510
    return-object p0

    .line 511
    :pswitch_18
    check-cast p0, La/abu;

    .line 512
    .line 513
    iget-object p0, p0, La/abu;->b:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast p0, La/gii0;

    .line 516
    .line 517
    const-class v0, La/icx;

    .line 518
    .line 519
    sget-object v1, La/sre0;->a:La/tre0;

    .line 520
    .line 521
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    check-cast p0, La/icx;

    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_19
    check-cast p0, La/wbx;

    .line 533
    .line 534
    sget-object v0, La/wbx;->P1:La/bst;

    .line 535
    .line 536
    iget-object p0, p0, La/wbx;->K1:La/fiu0;

    .line 537
    .line 538
    if-eqz p0, :cond_d

    .line 539
    .line 540
    return-object p0

    .line 541
    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v5

    .line 545
    :pswitch_1a
    check-cast p0, La/tax;

    .line 546
    .line 547
    iput-boolean v3, p0, La/tax;->C:Z

    .line 548
    .line 549
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object p0

    .line 552
    :pswitch_1b
    check-cast p0, La/vne;

    .line 553
    .line 554
    invoke-interface {p0}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    invoke-static {p0}, La/hhm0;->v(Lkotlin/coroutines/CoroutineContext;)F

    .line 559
    .line 560
    .line 561
    move-result p0

    .line 562
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    return-object p0

    .line 567
    :pswitch_1c
    check-cast p0, La/a3x;

    .line 568
    .line 569
    sget-object v0, La/a3x;->a2:La/bst;

    .line 570
    .line 571
    invoke-virtual {p0, v3, v3, v3}, La/sik;->z0(ZZZ)V

    .line 572
    .line 573
    .line 574
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object p0

    .line 577
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
