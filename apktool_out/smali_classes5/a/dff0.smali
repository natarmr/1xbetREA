.class public final synthetic La/dff0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pu90;La/p4e;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput-byte v0, p0, La/dff0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dff0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/dff0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/dff0;->a:B

    iput-object p1, p0, La/dff0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/dff0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/dff0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x7

    .line 7
    const v4, 0x799532c4

    .line 8
    .line 9
    .line 10
    const/16 v5, 0x13

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    iget-object v11, p0, La/dff0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p0, p0, La/dff0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast p0, La/gwg0;

    .line 25
    .line 26
    check-cast v11, La/cp;

    .line 27
    .line 28
    check-cast p1, Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, La/gwg0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast p0, La/irh0;

    .line 44
    .line 45
    check-cast v11, La/hqh0;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-boolean v0, p0, La/irh0;->H:Z

    .line 53
    .line 54
    invoke-virtual {p0, v11, v0}, La/irh0;->z(La/hqh0;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, La/irh0;->t:La/duj;

    .line 58
    .line 59
    new-instance v1, La/qqh0;

    .line 60
    .line 61
    invoke-direct {v1, p0, v10}, La/qqh0;-><init>(La/irh0;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    check-cast v11, La/fqh0;

    .line 73
    .line 74
    check-cast p1, Landroid/view/View;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_2
    check-cast p0, La/iph0;

    .line 86
    .line 87
    check-cast v11, La/noh0;

    .line 88
    .line 89
    check-cast p1, Ljava/lang/Throwable;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-boolean v0, p0, La/iph0;->I:Z

    .line 95
    .line 96
    invoke-virtual {p0, v11, v0}, La/iph0;->y(La/noh0;Z)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, La/iph0;->u:La/duj;

    .line 100
    .line 101
    new-instance v1, La/poh0;

    .line 102
    .line 103
    invoke-direct {v1, p0, v8}, La/poh0;-><init>(La/iph0;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_3
    check-cast p0, La/ctf0;

    .line 113
    .line 114
    check-cast v11, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 115
    .line 116
    check-cast p1, La/elh0;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget v0, v11, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;->b:I

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v1, La/flh0;

    .line 127
    .line 128
    new-instance v2, La/alh0;

    .line 129
    .line 130
    iget-object v3, p1, La/elh0;->a:Ljava/lang/String;

    .line 131
    .line 132
    iget-object p1, p1, La/elh0;->b:La/a4x;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v4, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 138
    .line 139
    new-array v5, v8, [Ljava/lang/Object;

    .line 140
    .line 141
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 142
    .line 143
    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const v6, 0x7f13015c

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {v4, v8, p0}, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;-><init>(ILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v4}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance p1, Ljava/util/ArrayList;

    .line 162
    .line 163
    const/16 v4, 0xa

    .line 164
    .line 165
    invoke-static {p0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_1

    .line 181
    .line 182
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    check-cast v5, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iget v6, v5, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;->a:I

    .line 192
    .line 193
    if-ne v6, v0, :cond_0

    .line 194
    .line 195
    move v7, v10

    .line 196
    goto :goto_1

    .line 197
    :cond_0
    move v7, v8

    .line 198
    :goto_1
    new-instance v9, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;

    .line 199
    .line 200
    iget-object v5, v5, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;->b:Ljava/lang/String;

    .line 201
    .line 202
    invoke-direct {v9, v5, v6, v7}, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;-><init>(Ljava/lang/String;IZ)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-static {p1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_2

    .line 227
    .line 228
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;

    .line 233
    .line 234
    new-instance v4, La/zkh0;

    .line 235
    .line 236
    iget v5, v0, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;->a:I

    .line 237
    .line 238
    iget-object v6, v0, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;->b:Ljava/lang/String;

    .line 239
    .line 240
    iget-boolean v0, v0, Lorg/xplatform/security/impl/presentation/secret_question/models/SecretQuestionUiModel;->c:Z

    .line 241
    .line 242
    invoke-direct {v4, v6, v5, v0}, La/zkh0;-><init>(Ljava/lang/String;IZ)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_2
    invoke-static {p0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-direct {v2, p0, v3}, La/alh0;-><init>(La/a4x;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-direct {v1, v2}, La/flh0;-><init>(La/alh0;)V

    .line 257
    .line 258
    .line 259
    return-object v1

    .line 260
    :pswitch_4
    check-cast p0, La/qjh0;

    .line 261
    .line 262
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 263
    .line 264
    check-cast p1, La/hcz;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget-object p0, p0, La/qjh0;->a:La/a4x;

    .line 270
    .line 271
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    new-instance v1, La/d1c0;

    .line 276
    .line 277
    invoke-direct {v1, p0, v5}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 278
    .line 279
    .line 280
    new-instance v2, La/njh0;

    .line 281
    .line 282
    invoke-direct {v2, p0, v11, v8}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 283
    .line 284
    .line 285
    new-instance p0, La/ugd;

    .line 286
    .line 287
    invoke-direct {p0, v4, v10, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, v0, v9, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 291
    .line 292
    .line 293
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_5
    check-cast p0, La/ybh0;

    .line 297
    .line 298
    check-cast v11, La/e1a0;

    .line 299
    .line 300
    check-cast p1, Landroid/view/View;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    instance-of v0, p1, Landroid/view/View;

    .line 310
    .line 311
    if-eqz v0, :cond_3

    .line 312
    .line 313
    move-object v9, p1

    .line 314
    check-cast v9, Landroid/view/View;

    .line 315
    .line 316
    :cond_3
    if-eqz v9, :cond_4

    .line 317
    .line 318
    invoke-virtual {v9}, Landroid/view/View;->isClickable()Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-nez p1, :cond_4

    .line 323
    .line 324
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_4
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    invoke-virtual {v11}, La/e1a0;->z()I

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-eq p0, p1, :cond_5

    .line 336
    .line 337
    iget-object v0, v11, La/e1a0;->g:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, La/yz3;

    .line 340
    .line 341
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, Ljava/util/Calendar;

    .line 351
    .line 352
    if-eqz v0, :cond_5

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object v2, v11, La/e1a0;->h:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v2, Ljava/util/Calendar;

    .line 364
    .line 365
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v11, p1}, La/yge0;->h(I)V

    .line 369
    .line 370
    .line 371
    iget-object p1, v11, La/e1a0;->f:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v11, p0}, La/yge0;->h(I)V

    .line 386
    .line 387
    .line 388
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    :goto_3
    return-object p0

    .line 391
    :pswitch_6
    check-cast p0, La/rch0;

    .line 392
    .line 393
    check-cast v11, La/sch0;

    .line 394
    .line 395
    check-cast p1, La/odl;

    .line 396
    .line 397
    iget-boolean v0, p1, La/odl;->b:Z

    .line 398
    .line 399
    if-eqz v0, :cond_6

    .line 400
    .line 401
    const/high16 v0, -0x40800000    # -1.0f

    .line 402
    .line 403
    goto :goto_4

    .line 404
    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 405
    .line 406
    :goto_4
    iget-wide v1, p1, La/odl;->a:J

    .line 407
    .line 408
    iget-object p1, v11, La/sch0;->d:La/ma80;

    .line 409
    .line 410
    sget-object v3, La/ma80;->b:La/ma80;

    .line 411
    .line 412
    if-ne p1, v3, :cond_7

    .line 413
    .line 414
    invoke-static {v1, v2, v7, v7, v10}, La/ne60;->a(JFFI)J

    .line 415
    .line 416
    .line 417
    move-result-wide v1

    .line 418
    goto :goto_5

    .line 419
    :cond_7
    invoke-static {v1, v2, v7, v7, v6}, La/ne60;->a(JFFI)J

    .line 420
    .line 421
    .line 422
    move-result-wide v1

    .line 423
    :goto_5
    invoke-static {v0, v1, v2}, La/ne60;->g(FJ)J

    .line 424
    .line 425
    .line 426
    move-result-wide v0

    .line 427
    invoke-virtual {p0, v10, v0, v1}, La/rch0;->a(IJ)J

    .line 428
    .line 429
    .line 430
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    return-object p0

    .line 433
    :pswitch_7
    check-cast p0, La/zz40;

    .line 434
    .line 435
    check-cast v11, La/vhv0;

    .line 436
    .line 437
    check-cast p1, La/vhv0;

    .line 438
    .line 439
    new-instance v0, La/ujo;

    .line 440
    .line 441
    invoke-direct {v0, v11, p1}, La/ujo;-><init>(La/vhv0;La/vhv0;)V

    .line 442
    .line 443
    .line 444
    iget-object p0, p0, La/zz40;->a:La/pz40;

    .line 445
    .line 446
    check-cast p0, La/hgk0;

    .line 447
    .line 448
    invoke-virtual {p0, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object p0

    .line 454
    :pswitch_8
    check-cast p0, La/mog0;

    .line 455
    .line 456
    check-cast v11, Ljava/lang/String;

    .line 457
    .line 458
    check-cast p1, La/k0w0;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    iget-object p0, p0, La/mog0;->d:La/nv20;

    .line 464
    .line 465
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast p0, La/h6i;

    .line 468
    .line 469
    invoke-virtual {p0}, La/h6i;->c()La/yox;

    .line 470
    .line 471
    .line 472
    new-instance p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 473
    .line 474
    invoke-direct {p0, v11}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 478
    .line 479
    .line 480
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object p0

    .line 483
    :pswitch_9
    check-cast p0, La/aog0;

    .line 484
    .line 485
    check-cast v11, Ljava/lang/String;

    .line 486
    .line 487
    check-cast p1, La/k0w0;

    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    iget-object p0, p0, La/aog0;->p:La/nv20;

    .line 493
    .line 494
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast p0, La/h6i;

    .line 497
    .line 498
    invoke-virtual {p0}, La/h6i;->c()La/yox;

    .line 499
    .line 500
    .line 501
    new-instance p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 502
    .line 503
    invoke-direct {p0, v11}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 507
    .line 508
    .line 509
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    return-object p0

    .line 512
    :pswitch_a
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 513
    .line 514
    check-cast v11, La/elg0;

    .line 515
    .line 516
    check-cast p1, La/ne60;

    .line 517
    .line 518
    iget-object p1, v11, La/elg0;->c:Ljava/lang/String;

    .line 519
    .line 520
    iget-boolean v0, v11, La/elg0;->d:Z

    .line 521
    .line 522
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_b
    check-cast p0, La/aig0;

    .line 533
    .line 534
    check-cast v11, La/l6e0;

    .line 535
    .line 536
    check-cast p1, Landroid/view/View;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    iget-object p0, p0, La/aig0;->v:Lkotlin/jvm/functions/Function2;

    .line 542
    .line 543
    iget p1, v11, La/l6e0;->d:I

    .line 544
    .line 545
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    iget-object v0, v11, La/l6e0;->m:Lkotlin/ranges/IntRange;

    .line 550
    .line 551
    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object p0

    .line 557
    :pswitch_c
    check-cast p0, La/qgg0;

    .line 558
    .line 559
    check-cast v11, La/cp;

    .line 560
    .line 561
    check-cast p1, Ljava/util/List;

    .line 562
    .line 563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    check-cast p1, La/drf;

    .line 571
    .line 572
    iget-object p1, p1, La/drf;->a:Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-virtual {p0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 575
    .line 576
    .line 577
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object p0

    .line 580
    :pswitch_d
    check-cast p0, La/uie;

    .line 581
    .line 582
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 583
    .line 584
    check-cast p1, La/hcz;

    .line 585
    .line 586
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    iget-object v0, p0, La/uie;->a:La/a4x;

    .line 590
    .line 591
    new-instance v1, La/wtf0;

    .line 592
    .line 593
    invoke-direct {v1, v3}, La/wtf0;-><init>(B)V

    .line 594
    .line 595
    .line 596
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    new-instance v3, La/pwe0;

    .line 601
    .line 602
    const/16 v4, 0x9

    .line 603
    .line 604
    invoke-direct {v3, v1, v0, v4}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 605
    .line 606
    .line 607
    new-instance v1, La/ubn;

    .line 608
    .line 609
    const/16 v4, 0x1a

    .line 610
    .line 611
    invoke-direct {v1, v0, v4}, La/ubn;-><init>(La/a4x;B)V

    .line 612
    .line 613
    .line 614
    new-instance v4, La/h8w;

    .line 615
    .line 616
    const/16 v5, 0x14

    .line 617
    .line 618
    invoke-direct {v4, v0, p0, v11, v5}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 619
    .line 620
    .line 621
    new-instance p0, La/ugd;

    .line 622
    .line 623
    const v0, 0x2fd4df92

    .line 624
    .line 625
    .line 626
    invoke-direct {p0, v0, v10, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {p1, v2, v3, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 630
    .line 631
    .line 632
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object p0

    .line 635
    :pswitch_e
    check-cast p0, La/s7g0;

    .line 636
    .line 637
    check-cast v11, La/q6g0;

    .line 638
    .line 639
    check-cast p1, Landroid/view/View;

    .line 640
    .line 641
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    iget-object p0, p0, La/s7g0;->v:Lkotlin/jvm/functions/Function1;

    .line 645
    .line 646
    iget-object p1, v11, La/q6g0;->h:Ljava/lang/String;

    .line 647
    .line 648
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 652
    .line 653
    return-object p0

    .line 654
    :pswitch_f
    check-cast p0, La/b5g0;

    .line 655
    .line 656
    check-cast v11, La/n7g0;

    .line 657
    .line 658
    check-cast p1, La/hcz;

    .line 659
    .line 660
    sget-object v0, La/n7g0;->p2:La/cge0;

    .line 661
    .line 662
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    iget-object v0, p0, La/b5g0;->a:La/a4x;

    .line 666
    .line 667
    new-instance v3, La/vtf0;

    .line 668
    .line 669
    invoke-direct {v3, v2}, La/vtf0;-><init>(B)V

    .line 670
    .line 671
    .line 672
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    new-instance v6, La/pwe0;

    .line 677
    .line 678
    invoke-direct {v6, v3, v0, v1}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 679
    .line 680
    .line 681
    new-instance v1, La/d1c0;

    .line 682
    .line 683
    const/16 v3, 0xe

    .line 684
    .line 685
    invoke-direct {v1, v0, v3}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 686
    .line 687
    .line 688
    new-instance v3, La/h8w;

    .line 689
    .line 690
    invoke-direct {v3, v0, p0, v11, v5}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 691
    .line 692
    .line 693
    new-instance p0, La/ugd;

    .line 694
    .line 695
    invoke-direct {p0, v4, v10, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {p1, v2, v6, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 699
    .line 700
    .line 701
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 702
    .line 703
    return-object p0

    .line 704
    :pswitch_10
    check-cast p0, La/wuf0;

    .line 705
    .line 706
    check-cast v11, Ljava/lang/String;

    .line 707
    .line 708
    check-cast p1, La/k0w0;

    .line 709
    .line 710
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    iget-object p0, p0, La/wuf0;->e:La/uf3;

    .line 714
    .line 715
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    iget-object p0, p0, La/uf3;->c:La/nv20;

    .line 719
    .line 720
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast p0, La/h6i;

    .line 723
    .line 724
    invoke-virtual {p0}, La/h6i;->c()La/yox;

    .line 725
    .line 726
    .line 727
    new-instance p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 728
    .line 729
    invoke-direct {p0, v11}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;-><init>(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 733
    .line 734
    .line 735
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object p0

    .line 738
    :pswitch_11
    check-cast p0, La/aif0;

    .line 739
    .line 740
    check-cast v11, La/buf0;

    .line 741
    .line 742
    check-cast p1, Landroid/view/View;

    .line 743
    .line 744
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    iget-object p1, v11, La/buf0;->c:Ljava/lang/String;

    .line 748
    .line 749
    invoke-virtual {p0, p1}, La/aif0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 753
    .line 754
    return-object p0

    .line 755
    :pswitch_12
    check-cast p0, La/cp;

    .line 756
    .line 757
    check-cast v11, La/aif0;

    .line 758
    .line 759
    check-cast p1, Ljava/util/List;

    .line 760
    .line 761
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 765
    .line 766
    check-cast p1, La/bxx;

    .line 767
    .line 768
    iget-object v0, p1, La/bxx;->b:Landroid/widget/TextView;

    .line 769
    .line 770
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    check-cast v2, La/buf0;

    .line 775
    .line 776
    iget-object v2, v2, La/buf0;->b:Ljava/lang/String;

    .line 777
    .line 778
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    if-lez v2, :cond_8

    .line 783
    .line 784
    move v2, v8

    .line 785
    goto :goto_6

    .line 786
    :cond_8
    move v2, v1

    .line 787
    :goto_6
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 788
    .line 789
    .line 790
    iget-object v0, p1, La/bxx;->b:Landroid/widget/TextView;

    .line 791
    .line 792
    iget-object p1, p1, La/bxx;->c:Landroid/widget/TextView;

    .line 793
    .line 794
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    check-cast v2, La/buf0;

    .line 799
    .line 800
    iget-object v2, v2, La/buf0;->b:Ljava/lang/String;

    .line 801
    .line 802
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    check-cast v0, La/buf0;

    .line 810
    .line 811
    iget-object v0, v0, La/buf0;->a:Ljava/lang/String;

    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 814
    .line 815
    .line 816
    move-result v0

    .line 817
    if-lez v0, :cond_9

    .line 818
    .line 819
    move v1, v8

    .line 820
    :cond_9
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object p0

    .line 827
    check-cast p0, La/buf0;

    .line 828
    .line 829
    iget-object v0, p0, La/buf0;->c:Ljava/lang/String;

    .line 830
    .line 831
    iget-object v1, p0, La/buf0;->a:Ljava/lang/String;

    .line 832
    .line 833
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    if-lez v2, :cond_a

    .line 838
    .line 839
    goto :goto_7

    .line 840
    :cond_a
    iget-object v2, p0, La/buf0;->b:Ljava/lang/String;

    .line 841
    .line 842
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    if-lez v2, :cond_b

    .line 847
    .line 848
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 849
    .line 850
    const-string v3, "<a>"

    .line 851
    .line 852
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    const-string v1, "</a>"

    .line 859
    .line 860
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    invoke-static {v1, v8}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 875
    .line 876
    .line 877
    sget-object v1, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    .line 878
    .line 879
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-nez v0, :cond_c

    .line 888
    .line 889
    sget-object v0, La/ymx;->e:La/ymx;

    .line 890
    .line 891
    new-instance v1, La/dff0;

    .line 892
    .line 893
    const/16 v2, 0xb

    .line 894
    .line 895
    invoke-direct {v1, v11, p0, v2}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 896
    .line 897
    .line 898
    invoke-static {p1, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 899
    .line 900
    .line 901
    goto :goto_8

    .line 902
    :cond_b
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 903
    .line 904
    .line 905
    sget-object p0, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    .line 906
    .line 907
    invoke-virtual {p0, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 908
    .line 909
    .line 910
    move-result-object p0

    .line 911
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 912
    .line 913
    .line 914
    move-result p0

    .line 915
    if-nez p0, :cond_c

    .line 916
    .line 917
    invoke-virtual {p1, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 918
    .line 919
    .line 920
    :cond_c
    :goto_8
    invoke-static {p1}, La/sj3;->x0(Landroid/widget/TextView;)V

    .line 921
    .line 922
    .line 923
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 924
    .line 925
    return-object p0

    .line 926
    :pswitch_13
    check-cast p0, La/psf0;

    .line 927
    .line 928
    move-object v0, v11

    .line 929
    check-cast v0, La/vne;

    .line 930
    .line 931
    check-cast p1, Ljava/lang/Throwable;

    .line 932
    .line 933
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    iget-object v1, p0, La/psf0;->u:La/p7m0;

    .line 940
    .line 941
    sget-object v2, La/i8d;->a:La/i8d;

    .line 942
    .line 943
    invoke-virtual {v1, v9, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    sget-object v1, La/osf0;->a:La/osf0;

    .line 947
    .line 948
    new-instance v4, La/w7f0;

    .line 949
    .line 950
    invoke-direct {v4, p0, v9}, La/w7f0;-><init>(La/psf0;La/yje;)V

    .line 951
    .line 952
    .line 953
    const/16 v5, 0xe

    .line 954
    .line 955
    const/4 v2, 0x0

    .line 956
    const/4 v3, 0x0

    .line 957
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 958
    .line 959
    .line 960
    invoke-virtual {p0, p1, v0}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 961
    .line 962
    .line 963
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 964
    .line 965
    return-object p0

    .line 966
    :pswitch_14
    check-cast v11, La/pu90;

    .line 967
    .line 968
    check-cast p0, La/p4e;

    .line 969
    .line 970
    check-cast p1, La/ou90;

    .line 971
    .line 972
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    iget-wide v0, p0, La/p4e;->a:J

    .line 976
    .line 977
    invoke-static {v0, v1}, La/p4e;->i(J)I

    .line 978
    .line 979
    .line 980
    move-result p0

    .line 981
    iget v2, v11, La/pu90;->a:I

    .line 982
    .line 983
    sub-int/2addr p0, v2

    .line 984
    div-int/2addr p0, v6

    .line 985
    invoke-static {v0, v1}, La/p4e;->h(J)I

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    iget v1, v11, La/pu90;->b:I

    .line 990
    .line 991
    sub-int/2addr v0, v1

    .line 992
    div-int/2addr v0, v6

    .line 993
    invoke-virtual {p1, v11, p0, v0, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 994
    .line 995
    .line 996
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 997
    .line 998
    return-object p0

    .line 999
    :pswitch_15
    check-cast p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 1000
    .line 1001
    check-cast v11, Ljava/util/List;

    .line 1002
    .line 1003
    check-cast p1, La/mrf0;

    .line 1004
    .line 1005
    sget v0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->m:I

    .line 1006
    .line 1007
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    iget v1, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->d:I

    .line 1015
    .line 1016
    add-int/2addr v1, v10

    .line 1017
    iput v1, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->d:I

    .line 1018
    .line 1019
    if-lt v1, v0, :cond_d

    .line 1020
    .line 1021
    iget-object p0, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->c:Lkotlin/jvm/functions/Function1;

    .line 1022
    .line 1023
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1027
    .line 1028
    return-object p0

    .line 1029
    :pswitch_16
    check-cast p0, La/rnf0;

    .line 1030
    .line 1031
    check-cast v11, La/vne;

    .line 1032
    .line 1033
    check-cast p1, Ljava/lang/Throwable;

    .line 1034
    .line 1035
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1036
    .line 1037
    .line 1038
    iget-object v0, p0, La/rnf0;->g:La/p7m0;

    .line 1039
    .line 1040
    sget-object v1, La/i8d;->c:La/i8d;

    .line 1041
    .line 1042
    invoke-virtual {v0, v9, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {p0, p1, v11}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 1046
    .line 1047
    .line 1048
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1049
    .line 1050
    return-object p0

    .line 1051
    :pswitch_17
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1052
    .line 1053
    check-cast v11, La/hif0;

    .line 1054
    .line 1055
    check-cast p1, La/au90;

    .line 1056
    .line 1057
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    new-instance v0, La/vhf0;

    .line 1061
    .line 1062
    iget-object v1, v11, La/hif0;->b:La/du90;

    .line 1063
    .line 1064
    iget-object v1, v1, La/du90;->e:Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-direct {v0, v1, p1}, La/vhf0;-><init>(Ljava/lang/String;La/au90;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1073
    .line 1074
    return-object p0

    .line 1075
    :pswitch_18
    check-cast p0, La/nff0;

    .line 1076
    .line 1077
    check-cast v11, La/vne;

    .line 1078
    .line 1079
    check-cast p1, Ljava/lang/Throwable;

    .line 1080
    .line 1081
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {p0, p1, v11}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 1088
    .line 1089
    .line 1090
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1091
    .line 1092
    return-object p0

    .line 1093
    :pswitch_19
    check-cast p0, La/xiu0;

    .line 1094
    .line 1095
    check-cast v11, La/glz;

    .line 1096
    .line 1097
    check-cast p1, La/lwk;

    .line 1098
    .line 1099
    sget-object p1, La/rek0;->h:La/rek0;

    .line 1100
    .line 1101
    invoke-virtual {p0}, La/xiu0;->a()La/wiu0;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    iget-object v0, v0, La/wiu0;->b:La/hz40;

    .line 1106
    .line 1107
    invoke-virtual {v0, p1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    if-nez v1, :cond_e

    .line 1112
    .line 1113
    new-instance v1, La/viu0;

    .line 1114
    .line 1115
    invoke-direct {v1, p1}, La/viu0;-><init>(Ljava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v0, p1, v1}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1119
    .line 1120
    .line 1121
    :cond_e
    check-cast v1, La/viu0;

    .line 1122
    .line 1123
    iget v0, v1, La/viu0;->c:I

    .line 1124
    .line 1125
    add-int/2addr v0, v10

    .line 1126
    iput v0, v1, La/viu0;->c:I

    .line 1127
    .line 1128
    new-instance v0, La/uiu0;

    .line 1129
    .line 1130
    invoke-direct {v0, v1, p0, p1}, La/uiu0;-><init>(La/viu0;La/xiu0;Ljava/lang/Object;)V

    .line 1131
    .line 1132
    .line 1133
    new-instance p1, La/u43;

    .line 1134
    .line 1135
    invoke-direct {p1, v0, v11, p0, v3}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1136
    .line 1137
    .line 1138
    return-object p1

    .line 1139
    :pswitch_1a
    check-cast p0, La/xiu0;

    .line 1140
    .line 1141
    check-cast p1, La/lwk;

    .line 1142
    .line 1143
    invoke-virtual {p0}, La/xiu0;->a()La/wiu0;

    .line 1144
    .line 1145
    .line 1146
    move-result-object p1

    .line 1147
    iget-object p1, p1, La/wiu0;->b:La/hz40;

    .line 1148
    .line 1149
    invoke-virtual {p1, v11}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    if-nez v0, :cond_f

    .line 1154
    .line 1155
    new-instance v0, La/viu0;

    .line 1156
    .line 1157
    invoke-direct {v0, v11}, La/viu0;-><init>(Ljava/lang/Object;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {p1, v11, v0}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1161
    .line 1162
    .line 1163
    :cond_f
    check-cast v0, La/viu0;

    .line 1164
    .line 1165
    iget p1, v0, La/viu0;->c:I

    .line 1166
    .line 1167
    add-int/2addr p1, v10

    .line 1168
    iput p1, v0, La/viu0;->c:I

    .line 1169
    .line 1170
    new-instance p1, La/uiu0;

    .line 1171
    .line 1172
    invoke-direct {p1, v0, p0, v11}, La/uiu0;-><init>(La/viu0;La/xiu0;Ljava/lang/Object;)V

    .line 1173
    .line 1174
    .line 1175
    new-instance p0, La/ty2;

    .line 1176
    .line 1177
    const/16 v0, 0x16

    .line 1178
    .line 1179
    invoke-direct {p0, p1, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 1180
    .line 1181
    .line 1182
    return-object p0

    .line 1183
    :pswitch_1b
    check-cast p0, La/clz;

    .line 1184
    .line 1185
    check-cast v11, La/wjd;

    .line 1186
    .line 1187
    check-cast p1, La/lwk;

    .line 1188
    .line 1189
    new-instance p1, La/g02;

    .line 1190
    .line 1191
    invoke-direct {p1, v11, v6}, La/g02;-><init>(Ljava/lang/Object;B)V

    .line 1192
    .line 1193
    .line 1194
    if-eqz p0, :cond_10

    .line 1195
    .line 1196
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    if-eqz v0, :cond_10

    .line 1201
    .line 1202
    invoke-virtual {v0, p1}, La/glz;->a(La/blz;)V

    .line 1203
    .line 1204
    .line 1205
    :cond_10
    if-nez p0, :cond_11

    .line 1206
    .line 1207
    sget-object v0, La/kkz;->ON_RESUME:La/kkz;

    .line 1208
    .line 1209
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v0}, La/kkz;->a()La/lkz;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    iput-object v0, v11, La/wjd;->b:La/lkz;

    .line 1217
    .line 1218
    invoke-virtual {v11}, La/wjd;->a()V

    .line 1219
    .line 1220
    .line 1221
    :cond_11
    new-instance v0, La/u43;

    .line 1222
    .line 1223
    invoke-direct {v0, p0, p1, v11, v2}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1224
    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :pswitch_1c
    check-cast p0, La/eff0;

    .line 1228
    .line 1229
    check-cast v11, La/pu90;

    .line 1230
    .line 1231
    check-cast p1, La/ou90;

    .line 1232
    .line 1233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1234
    .line 1235
    .line 1236
    iget-boolean v0, p0, La/eff0;->q:Z

    .line 1237
    .line 1238
    iget v1, p0, La/eff0;->o:F

    .line 1239
    .line 1240
    if-eqz v0, :cond_12

    .line 1241
    .line 1242
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    iget v1, v11, La/pu90;->a:I

    .line 1247
    .line 1248
    sub-int/2addr v0, v1

    .line 1249
    iget p0, p0, La/eff0;->p:F

    .line 1250
    .line 1251
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 1252
    .line 1253
    .line 1254
    move-result p0

    .line 1255
    invoke-virtual {p1, v11, v0, p0, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_9

    .line 1259
    :cond_12
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 1260
    .line 1261
    .line 1262
    move-result v0

    .line 1263
    iget p0, p0, La/eff0;->p:F

    .line 1264
    .line 1265
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 1266
    .line 1267
    .line 1268
    move-result p0

    .line 1269
    invoke-virtual {p1, v11, v0, p0, v7}, La/ou90;->g(La/pu90;IIF)V

    .line 1270
    .line 1271
    .line 1272
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1273
    .line 1274
    return-object p0

    .line 1275
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
