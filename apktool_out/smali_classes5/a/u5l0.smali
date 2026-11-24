.class public final synthetic La/u5l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/u5l0;->a:B

    iput-object p2, p0, La/u5l0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/u5l0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/u5l0;->a:B

    iput-object p1, p0, La/u5l0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/u5l0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u5l0;->a:B

    .line 4
    .line 5
    const/16 v4, 0xd

    .line 6
    .line 7
    const v5, 0x2fd4df92

    .line 8
    .line 9
    .line 10
    const/16 v6, 0x1b

    .line 11
    .line 12
    const/16 v11, 0x12

    .line 13
    .line 14
    const/4 v12, 0x4

    .line 15
    const/16 v15, 0xe

    .line 16
    .line 17
    const/4 v7, 0x2

    .line 18
    const/4 v8, 0x3

    .line 19
    const/16 v13, 0x8

    .line 20
    .line 21
    const/16 v9, 0xb

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const v14, 0x799532c4

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La/tsn0;

    .line 35
    .line 36
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/cp;

    .line 39
    .line 40
    move-object/from16 v2, p1

    .line 41
    .line 42
    check-cast v2, Ljava/lang/Throwable;

    .line 43
    .line 44
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 45
    .line 46
    iget-object v1, v1, La/tsn0;->r:Landroid/widget/ImageView;

    .line 47
    .line 48
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/btn0;

    .line 53
    .line 54
    iget-object v0, v0, La/btn0;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1, v0}, La/u0d;->l(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_0
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, La/l7m0;

    .line 65
    .line 66
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/snn0;

    .line 69
    .line 70
    move-object/from16 v2, p1

    .line 71
    .line 72
    check-cast v2, La/hcz;

    .line 73
    .line 74
    sget-object v4, La/snn0;->n2:La/j6m0;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, La/xnn0;

    .line 84
    .line 85
    iget-object v4, v4, La/xnn0;->a:La/a4x;

    .line 86
    .line 87
    new-instance v5, La/acm0;

    .line 88
    .line 89
    invoke-direct {v5, v9}, La/acm0;-><init>(B)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    new-instance v9, La/zcn0;

    .line 97
    .line 98
    invoke-direct {v9, v5, v4, v7}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    new-instance v5, La/e0m0;

    .line 102
    .line 103
    invoke-direct {v5, v4, v7}, La/e0m0;-><init>(La/a4x;B)V

    .line 104
    .line 105
    .line 106
    new-instance v7, La/h8w;

    .line 107
    .line 108
    invoke-direct {v7, v4, v0, v1, v6}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    new-instance v0, La/ugd;

    .line 112
    .line 113
    invoke-direct {v0, v14, v3, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v8, v9, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_1
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, La/bzt;

    .line 125
    .line 126
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/g2v;

    .line 129
    .line 130
    move-object/from16 v2, p1

    .line 131
    .line 132
    check-cast v2, La/jen0;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v1, v1, La/bzt;->a:La/fsd;

    .line 138
    .line 139
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget v1, v1, La/v8d;->r:I

    .line 144
    .line 145
    new-instance v3, La/ken0;

    .line 146
    .line 147
    invoke-direct {v3, v2, v0, v1}, La/ken0;-><init>(La/jen0;La/g2v;I)V

    .line 148
    .line 149
    .line 150
    return-object v3

    .line 151
    :pswitch_2
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, La/oen0;

    .line 154
    .line 155
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    move-object/from16 v2, p1

    .line 160
    .line 161
    check-cast v2, La/hcz;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v1, v1, La/oen0;->a:La/i4;

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    new-instance v5, La/adn0;

    .line 173
    .line 174
    invoke-direct {v5, v1, v3}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 175
    .line 176
    .line 177
    new-instance v6, La/njh0;

    .line 178
    .line 179
    invoke-direct {v6, v1, v0, v15}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 180
    .line 181
    .line 182
    new-instance v0, La/ugd;

    .line 183
    .line 184
    invoke-direct {v0, v14, v3, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4, v10, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_3
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, La/r4n0;

    .line 196
    .line 197
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 200
    .line 201
    move-object/from16 v3, p1

    .line 202
    .line 203
    check-cast v3, Landroid/view/View;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object v3, v1, La/r4n0;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 209
    .line 210
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-nez v4, :cond_0

    .line 215
    .line 216
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    const-string v4, ""

    .line 231
    .line 232
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v13}, Landroid/view/View;->setVisibility(I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->c()V

    .line 239
    .line 240
    .line 241
    iget-object v0, v1, La/r4n0;->l:La/cfn0;

    .line 242
    .line 243
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 244
    .line 245
    .line 246
    iget-object v0, v1, La/r4n0;->n:La/jc50;

    .line 247
    .line 248
    invoke-virtual {v0}, La/jc50;->a()V

    .line 249
    .line 250
    .line 251
    iget-object v0, v1, La/r4n0;->i:Lkotlin/jvm/functions/Function0;

    .line 252
    .line 253
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    iget-object v0, v1, La/r4n0;->j:Lkotlin/jvm/functions/Function1;

    .line 257
    .line 258
    if-eqz v0, :cond_1

    .line 259
    .line 260
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    goto :goto_0

    .line 266
    :cond_0
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_4
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 275
    .line 276
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, La/e1n0;

    .line 279
    .line 280
    move-object/from16 v2, p1

    .line 281
    .line 282
    check-cast v2, La/x5q0;

    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    instance-of v3, v2, La/w5q0;

    .line 288
    .line 289
    if-eqz v3, :cond_2

    .line 290
    .line 291
    new-instance v3, La/c0n0;

    .line 292
    .line 293
    check-cast v2, La/w5q0;

    .line 294
    .line 295
    iget-object v2, v2, La/w5q0;->a:Ljava/lang/String;

    .line 296
    .line 297
    invoke-direct {v3, v0, v2}, La/c0n0;-><init>(La/e1n0;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    goto :goto_1

    .line 304
    :cond_2
    instance-of v2, v2, La/u5q0;

    .line 305
    .line 306
    if-eqz v2, :cond_3

    .line 307
    .line 308
    new-instance v2, La/zzm0;

    .line 309
    .line 310
    invoke-direct {v2, v0}, La/zzm0;-><init>(La/e1n0;)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_5
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v1, La/u2n0;

    .line 322
    .line 323
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 326
    .line 327
    move-object/from16 v2, p1

    .line 328
    .line 329
    check-cast v2, La/hcz;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    iget-object v1, v1, La/u2n0;->c:La/a4x;

    .line 335
    .line 336
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    new-instance v7, La/y9k0;

    .line 341
    .line 342
    const/16 v8, 0x1c

    .line 343
    .line 344
    invoke-direct {v7, v1, v8}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 345
    .line 346
    .line 347
    new-instance v8, La/njh0;

    .line 348
    .line 349
    invoke-direct {v8, v1, v0, v4}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 350
    .line 351
    .line 352
    new-instance v0, La/ugd;

    .line 353
    .line 354
    invoke-direct {v0, v5, v3, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v6, v10, v7, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 358
    .line 359
    .line 360
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_6
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v1, La/ltm0;

    .line 366
    .line 367
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, La/vne;

    .line 370
    .line 371
    move-object/from16 v2, p1

    .line 372
    .line 373
    check-cast v2, Ljava/lang/Throwable;

    .line 374
    .line 375
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    iget-object v3, v1, La/ltm0;->h:La/p7m0;

    .line 382
    .line 383
    sget-object v4, La/i8d;->e:La/i8d;

    .line 384
    .line 385
    invoke-virtual {v3, v10, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v2, v0}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 389
    .line 390
    .line 391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_7
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v1, Ljava/util/HashMap;

    .line 397
    .line 398
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, La/n0a;

    .line 401
    .line 402
    move-object/from16 v2, p1

    .line 403
    .line 404
    check-cast v2, La/fot0;

    .line 405
    .line 406
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    if-eqz v1, :cond_4

    .line 414
    .line 415
    check-cast v1, La/p3a;

    .line 416
    .line 417
    iget-object v3, v1, La/p3a;->a:La/fpt0;

    .line 418
    .line 419
    iget-object v1, v1, La/p3a;->b:La/fpt0;

    .line 420
    .line 421
    invoke-virtual {v2, v0, v3, v1}, La/fot0;->q(La/n0a;La/fpt0;La/fpt0;)La/fpt0;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    goto :goto_2

    .line 429
    :cond_4
    const-string v0, "Required value was null."

    .line 430
    .line 431
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    :goto_2
    return-object v10

    .line 435
    :pswitch_8
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 438
    .line 439
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v0, La/a0z;

    .line 442
    .line 443
    move-object/from16 v3, p1

    .line 444
    .line 445
    check-cast v3, La/bem;

    .line 446
    .line 447
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    instance-of v3, v3, La/wdm;

    .line 451
    .line 452
    if-eqz v3, :cond_5

    .line 453
    .line 454
    new-instance v3, La/o0k0;

    .line 455
    .line 456
    invoke-direct {v3, v1, v0, v15}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 457
    .line 458
    .line 459
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    new-instance v1, La/bjj;

    .line 465
    .line 466
    invoke-direct {v1, v0, v2, v3}, La/bjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1}, La/bjj;->a()V

    .line 470
    .line 471
    .line 472
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_9
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v1, La/nfj0;

    .line 478
    .line 479
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, La/kcl0;

    .line 482
    .line 483
    move-object/from16 v2, p1

    .line 484
    .line 485
    check-cast v2, La/cp;

    .line 486
    .line 487
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    new-instance v3, La/hie0;

    .line 491
    .line 492
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 493
    .line 494
    .line 495
    iget-object v4, v2, La/cp;->u:La/yfu0;

    .line 496
    .line 497
    check-cast v4, La/v9m0;

    .line 498
    .line 499
    iget-object v5, v4, La/v9m0;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;

    .line 500
    .line 501
    iget-object v6, v2, La/cp;->w:Landroid/content/Context;

    .line 502
    .line 503
    const v7, 0x7f040b0b

    .line 504
    .line 505
    .line 506
    invoke-static {v7, v6}, La/m5d;->b(ILandroid/content/Context;)I

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;->setIconTint(I)V

    .line 511
    .line 512
    .line 513
    iget-object v5, v4, La/v9m0;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;

    .line 514
    .line 515
    invoke-virtual {v5}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    new-instance v6, La/nej0;

    .line 520
    .line 521
    invoke-direct {v6, v3, v1, v2, v9}, La/nej0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 522
    .line 523
    .line 524
    invoke-static {v5, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 525
    .line 526
    .line 527
    iget-object v1, v4, La/v9m0;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;

    .line 528
    .line 529
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDropAndButton;->getDragAndDropView()Landroid/view/View;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    new-instance v4, La/yv5;

    .line 534
    .line 535
    invoke-direct {v4, v0, v2, v8}, La/yv5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 539
    .line 540
    .line 541
    new-instance v0, La/xg;

    .line 542
    .line 543
    invoke-direct {v0, v3, v2, v2}, La/xg;-><init>(La/hie0;La/cp;La/cp;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 547
    .line 548
    .line 549
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_a
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v1, Ljava/util/List;

    .line 555
    .line 556
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, La/i7m0;

    .line 559
    .line 560
    move-object/from16 v2, p1

    .line 561
    .line 562
    check-cast v2, Ljava/lang/Throwable;

    .line 563
    .line 564
    if-eqz v2, :cond_6

    .line 565
    .line 566
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    if-eqz v4, :cond_7

    .line 575
    .line 576
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    check-cast v4, La/ndd;

    .line 581
    .line 582
    check-cast v4, La/odd;

    .line 583
    .line 584
    invoke-virtual {v4, v2}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 585
    .line 586
    .line 587
    goto :goto_3

    .line 588
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-eqz v3, :cond_7

    .line 597
    .line 598
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    check-cast v3, La/ndd;

    .line 603
    .line 604
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 605
    .line 606
    check-cast v3, La/odd;

    .line 607
    .line 608
    invoke-virtual {v3, v4}, La/pby;->N(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    goto :goto_4

    .line 612
    :cond_7
    iget-object v2, v0, La/i7m0;->d:Ljava/lang/Object;

    .line 613
    .line 614
    monitor-enter v2

    .line 615
    :try_start_0
    iget-object v0, v0, La/i7m0;->f:Ljava/util/ArrayList;

    .line 616
    .line 617
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 618
    .line 619
    .line 620
    monitor-exit v2

    .line 621
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    return-object v0

    .line 624
    :catchall_0
    move-exception v0

    .line 625
    monitor-exit v2

    .line 626
    throw v0

    .line 627
    :pswitch_b
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v1, La/wzl0;

    .line 630
    .line 631
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v0, La/w3m0;

    .line 634
    .line 635
    move-object/from16 v2, p1

    .line 636
    .line 637
    check-cast v2, La/k0w0;

    .line 638
    .line 639
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    new-instance v3, La/d0m0;

    .line 643
    .line 644
    check-cast v1, La/szl0;

    .line 645
    .line 646
    iget-object v1, v1, La/szl0;->b:Ljava/lang/String;

    .line 647
    .line 648
    iget-wide v4, v0, La/w3m0;->p:J

    .line 649
    .line 650
    invoke-direct {v3, v1, v4, v5}, La/d0m0;-><init>(Ljava/lang/String;J)V

    .line 651
    .line 652
    .line 653
    new-instance v0, La/c1w0;

    .line 654
    .line 655
    invoke-direct {v0, v3, v10}, La/c1w0;-><init>(La/lwv0;La/onu0;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 659
    .line 660
    .line 661
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_c
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v1, La/dp20;

    .line 667
    .line 668
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v0, La/az00;

    .line 671
    .line 672
    move-object/from16 v2, p1

    .line 673
    .line 674
    check-cast v2, La/w6k;

    .line 675
    .line 676
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0}, La/az00;->a()Lkotlin/Pair;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    iget-object v2, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v2, Ljava/lang/Number;

    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    invoke-virtual {v0}, La/az00;->a()Lkotlin/Pair;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v0, Ljava/lang/Number;

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    invoke-virtual {v1, v2, v0}, La/dp20;->a(FF)J

    .line 704
    .line 705
    .line 706
    move-result-wide v0

    .line 707
    new-instance v2, La/adl;

    .line 708
    .line 709
    invoke-direct {v2, v0, v1}, La/adl;-><init>(J)V

    .line 710
    .line 711
    .line 712
    return-object v2

    .line 713
    :pswitch_d
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v1, La/dp20;

    .line 716
    .line 717
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v0, La/p010;

    .line 720
    .line 721
    move-object/from16 v2, p1

    .line 722
    .line 723
    check-cast v2, La/w6k;

    .line 724
    .line 725
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    iget v2, v0, La/p010;->d:I

    .line 732
    .line 733
    int-to-float v2, v2

    .line 734
    iget v0, v0, La/p010;->e:I

    .line 735
    .line 736
    int-to-float v0, v0

    .line 737
    invoke-virtual {v1, v2, v0}, La/dp20;->a(FF)J

    .line 738
    .line 739
    .line 740
    move-result-wide v2

    .line 741
    invoke-static {v2, v3}, La/adl;->b(J)F

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    iget v1, v1, La/dp20;->e:F

    .line 746
    .line 747
    sub-float/2addr v0, v1

    .line 748
    invoke-static {v2, v3}, La/adl;->a(J)F

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    int-to-long v1, v1

    .line 757
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    int-to-long v3, v0

    .line 762
    const/16 v0, 0x20

    .line 763
    .line 764
    shl-long v0, v1, v0

    .line 765
    .line 766
    const-wide v5, 0xffffffffL

    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    and-long v2, v3, v5

    .line 772
    .line 773
    or-long/2addr v0, v2

    .line 774
    new-instance v2, La/adl;

    .line 775
    .line 776
    invoke-direct {v2, v0, v1}, La/adl;-><init>(J)V

    .line 777
    .line 778
    .line 779
    return-object v2

    .line 780
    :pswitch_e
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v1, Ljava/util/ArrayList;

    .line 783
    .line 784
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v0, La/xcz;

    .line 787
    .line 788
    move-object/from16 v2, p1

    .line 789
    .line 790
    check-cast v2, La/hcz;

    .line 791
    .line 792
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    new-instance v6, La/t9l0;

    .line 800
    .line 801
    invoke-direct {v6, v1, v12}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 802
    .line 803
    .line 804
    new-instance v7, La/xe4;

    .line 805
    .line 806
    invoke-direct {v7, v1, v0, v11}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 807
    .line 808
    .line 809
    new-instance v0, La/ugd;

    .line 810
    .line 811
    invoke-direct {v0, v5, v3, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v2, v4, v10, v6, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 815
    .line 816
    .line 817
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 818
    .line 819
    return-object v0

    .line 820
    :pswitch_f
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v1, La/l7m0;

    .line 823
    .line 824
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v0, La/i3t0;

    .line 827
    .line 828
    move-object/from16 v4, p1

    .line 829
    .line 830
    check-cast v4, La/hcz;

    .line 831
    .line 832
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    check-cast v5, La/h0m0;

    .line 840
    .line 841
    iget-object v5, v5, La/h0m0;->a:La/a4x;

    .line 842
    .line 843
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 844
    .line 845
    .line 846
    move-result v6

    .line 847
    new-instance v7, La/e0m0;

    .line 848
    .line 849
    invoke-direct {v7, v5, v2}, La/e0m0;-><init>(La/a4x;B)V

    .line 850
    .line 851
    .line 852
    new-instance v2, La/h8w;

    .line 853
    .line 854
    const/16 v8, 0x19

    .line 855
    .line 856
    invoke-direct {v2, v5, v1, v0, v8}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 857
    .line 858
    .line 859
    new-instance v0, La/ugd;

    .line 860
    .line 861
    invoke-direct {v0, v14, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v4, v6, v10, v7, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 865
    .line 866
    .line 867
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 868
    .line 869
    return-object v0

    .line 870
    :pswitch_10
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v1, La/rwl0;

    .line 873
    .line 874
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 877
    .line 878
    move-object/from16 v4, p1

    .line 879
    .line 880
    check-cast v4, La/hcz;

    .line 881
    .line 882
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    iget-object v5, v1, La/rwl0;->a:La/a4x;

    .line 886
    .line 887
    iget-object v7, v1, La/rwl0;->c:La/a4x;

    .line 888
    .line 889
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 890
    .line 891
    .line 892
    move-result v5

    .line 893
    if-nez v5, :cond_8

    .line 894
    .line 895
    iget-boolean v5, v1, La/rwl0;->f:Z

    .line 896
    .line 897
    if-nez v5, :cond_8

    .line 898
    .line 899
    move v2, v3

    .line 900
    :cond_8
    if-eqz v2, :cond_9

    .line 901
    .line 902
    new-instance v5, La/nhl0;

    .line 903
    .line 904
    const/4 v9, 0x6

    .line 905
    invoke-direct {v5, v1, v0, v9}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 906
    .line 907
    .line 908
    new-instance v9, La/ugd;

    .line 909
    .line 910
    const v12, 0x3c522257

    .line 911
    .line 912
    .line 913
    invoke-direct {v9, v12, v3, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    invoke-static {v4, v10, v10, v9, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 917
    .line 918
    .line 919
    :cond_9
    iget-object v5, v1, La/rwl0;->b:La/a4x;

    .line 920
    .line 921
    new-instance v9, La/gcl0;

    .line 922
    .line 923
    invoke-direct {v9, v11}, La/gcl0;-><init>(B)V

    .line 924
    .line 925
    .line 926
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 927
    .line 928
    .line 929
    move-result v11

    .line 930
    new-instance v12, La/o3l0;

    .line 931
    .line 932
    const/16 v13, 0x13

    .line 933
    .line 934
    invoke-direct {v12, v9, v5, v13}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 935
    .line 936
    .line 937
    new-instance v9, La/y9k0;

    .line 938
    .line 939
    const/16 v13, 0x15

    .line 940
    .line 941
    invoke-direct {v9, v5, v13}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 942
    .line 943
    .line 944
    new-instance v13, La/gx;

    .line 945
    .line 946
    invoke-direct {v13, v5, v1, v2}, La/gx;-><init>(Ljava/util/List;La/rwl0;Z)V

    .line 947
    .line 948
    .line 949
    new-instance v2, La/ugd;

    .line 950
    .line 951
    invoke-direct {v2, v14, v3, v13}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v4, v11, v12, v9, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 955
    .line 956
    .line 957
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 958
    .line 959
    .line 960
    move-result v2

    .line 961
    if-nez v2, :cond_a

    .line 962
    .line 963
    new-instance v2, La/rqc0;

    .line 964
    .line 965
    invoke-direct {v2, v1, v6}, La/rqc0;-><init>(Ljava/lang/Object;B)V

    .line 966
    .line 967
    .line 968
    new-instance v1, La/ugd;

    .line 969
    .line 970
    const v5, -0x333bcd80

    .line 971
    .line 972
    .line 973
    invoke-direct {v1, v5, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    invoke-static {v4, v10, v10, v1, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 977
    .line 978
    .line 979
    new-instance v1, La/gcl0;

    .line 980
    .line 981
    const/16 v13, 0x13

    .line 982
    .line 983
    invoke-direct {v1, v13}, La/gcl0;-><init>(B)V

    .line 984
    .line 985
    .line 986
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 987
    .line 988
    .line 989
    move-result v2

    .line 990
    new-instance v5, La/o3l0;

    .line 991
    .line 992
    const/16 v6, 0x14

    .line 993
    .line 994
    invoke-direct {v5, v1, v7, v6}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 995
    .line 996
    .line 997
    new-instance v1, La/y9k0;

    .line 998
    .line 999
    const/16 v6, 0x16

    .line 1000
    .line 1001
    invoke-direct {v1, v7, v6}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 1002
    .line 1003
    .line 1004
    new-instance v6, La/njh0;

    .line 1005
    .line 1006
    const/16 v8, 0xc

    .line 1007
    .line 1008
    invoke-direct {v6, v7, v0, v8}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1009
    .line 1010
    .line 1011
    new-instance v0, La/ugd;

    .line 1012
    .line 1013
    invoke-direct {v0, v14, v3, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v4, v2, v5, v1, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1017
    .line 1018
    .line 1019
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1020
    .line 1021
    return-object v0

    .line 1022
    :pswitch_11
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v1, La/zql0;

    .line 1025
    .line 1026
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1027
    .line 1028
    check-cast v0, La/vne;

    .line 1029
    .line 1030
    move-object/from16 v2, p1

    .line 1031
    .line 1032
    check-cast v2, Ljava/lang/Throwable;

    .line 1033
    .line 1034
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    iget-object v3, v1, La/zql0;->h:La/p7m0;

    .line 1041
    .line 1042
    sget-object v4, La/i8d;->e:La/i8d;

    .line 1043
    .line 1044
    invoke-virtual {v3, v10, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v1, v2, v0}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 1048
    .line 1049
    .line 1050
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1051
    .line 1052
    return-object v0

    .line 1053
    :pswitch_12
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1054
    .line 1055
    check-cast v1, La/yql0;

    .line 1056
    .line 1057
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v0, Landroid/view/ContextThemeWrapper;

    .line 1060
    .line 1061
    move-object/from16 v4, p1

    .line 1062
    .line 1063
    check-cast v4, Landroid/content/res/TypedArray;

    .line 1064
    .line 1065
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v4, v13, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1069
    .line 1070
    .line 1071
    move-result v5

    .line 1072
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1073
    .line 1074
    .line 1075
    move-result v6

    .line 1076
    invoke-virtual {v4, v12, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1077
    .line 1078
    .line 1079
    move-result v7

    .line 1080
    const/4 v9, 0x5

    .line 1081
    invoke-virtual {v4, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1082
    .line 1083
    .line 1084
    move-result v9

    .line 1085
    const/4 v10, 0x0

    .line 1086
    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 1087
    .line 1088
    .line 1089
    move-result v4

    .line 1090
    iget-object v8, v1, La/yql0;->m:Landroid/widget/ImageView;

    .line 1091
    .line 1092
    iget v10, v1, La/yql0;->b:I

    .line 1093
    .line 1094
    invoke-virtual {v8, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 1098
    .line 1099
    iget v11, v1, La/yql0;->i:I

    .line 1100
    .line 1101
    invoke-direct {v5, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1102
    .line 1103
    .line 1104
    const v11, 0x800035

    .line 1105
    .line 1106
    .line 1107
    iput v11, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1108
    .line 1109
    iget v11, v1, La/yql0;->g:I

    .line 1110
    .line 1111
    invoke-virtual {v5, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v5, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1115
    .line 1116
    .line 1117
    iget v11, v1, La/yql0;->e:I

    .line 1118
    .line 1119
    iput v11, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1120
    .line 1121
    invoke-virtual {v8, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1122
    .line 1123
    .line 1124
    iget v5, v1, La/yql0;->f:I

    .line 1125
    .line 1126
    invoke-virtual {v8, v5, v5, v5, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 1127
    .line 1128
    .line 1129
    new-instance v5, La/xql0;

    .line 1130
    .line 1131
    invoke-direct {v5, v1, v2}, La/xql0;-><init>(La/yql0;B)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v8, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1135
    .line 1136
    .line 1137
    if-eqz v6, :cond_b

    .line 1138
    .line 1139
    invoke-virtual {v8, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1140
    .line 1141
    .line 1142
    :cond_b
    iget-object v5, v1, La/yql0;->k:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1143
    .line 1144
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 1145
    .line 1146
    const/4 v11, -0x1

    .line 1147
    const/4 v12, -0x2

    .line 1148
    invoke-direct {v6, v11, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v5, v2, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->c(II)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v6

    .line 1161
    iget v6, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1162
    .line 1163
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v8

    .line 1167
    instance-of v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1168
    .line 1169
    if-eqz v11, :cond_c

    .line 1170
    .line 1171
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1172
    .line 1173
    invoke-virtual {v8}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 1174
    .line 1175
    .line 1176
    move-result v8

    .line 1177
    goto :goto_5

    .line 1178
    :cond_c
    move v8, v2

    .line 1179
    :goto_5
    add-int/2addr v6, v8

    .line 1180
    iget v8, v1, La/yql0;->h:I

    .line 1181
    .line 1182
    add-int/2addr v6, v8

    .line 1183
    invoke-static {v5, v10, v2, v6, v2}, La/jmu0;->k(Landroid/view/View;IIII)V

    .line 1184
    .line 1185
    .line 1186
    new-instance v2, La/xql0;

    .line 1187
    .line 1188
    invoke-direct {v2, v1, v3}, La/xql0;-><init>(La/yql0;B)V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1192
    .line 1193
    .line 1194
    iget-object v2, v1, La/yql0;->l:La/nql0;

    .line 1195
    .line 1196
    iget-object v3, v1, La/yql0;->j:Landroid/widget/FrameLayout$LayoutParams;

    .line 1197
    .line 1198
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1199
    .line 1200
    .line 1201
    iget-object v2, v1, La/yql0;->n:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1202
    .line 1203
    invoke-virtual {v2, v13}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1207
    .line 1208
    .line 1209
    move-result v3

    .line 1210
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 1211
    .line 1212
    .line 1213
    move-result v5

    .line 1214
    iget v6, v1, La/yql0;->d:I

    .line 1215
    .line 1216
    invoke-virtual {v2, v10, v3, v5, v6}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 1217
    .line 1218
    .line 1219
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1220
    .line 1221
    invoke-direct {v3, v9, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1222
    .line 1223
    .line 1224
    const v5, 0x800033

    .line 1225
    .line 1226
    .line 1227
    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1228
    .line 1229
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1233
    .line 1234
    .line 1235
    iget v1, v1, La/yql0;->c:I

    .line 1236
    .line 1237
    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1238
    .line 1239
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1240
    .line 1241
    .line 1242
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 1243
    .line 1244
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1248
    .line 1249
    .line 1250
    const v3, 0x7f040b0e

    .line 1251
    .line 1252
    .line 1253
    invoke-static {v3, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1265
    .line 1266
    .line 1267
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1268
    .line 1269
    return-object v0

    .line 1270
    :pswitch_13
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1271
    .line 1272
    check-cast v1, La/tql0;

    .line 1273
    .line 1274
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1275
    .line 1276
    check-cast v0, Landroid/view/ContextThemeWrapper;

    .line 1277
    .line 1278
    move-object/from16 v5, p1

    .line 1279
    .line 1280
    check-cast v5, Landroid/content/res/TypedArray;

    .line 1281
    .line 1282
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v5, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1286
    .line 1287
    .line 1288
    move-result v4

    .line 1289
    const/16 v6, 0xc

    .line 1290
    .line 1291
    invoke-virtual {v5, v6, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1292
    .line 1293
    .line 1294
    move-result v6

    .line 1295
    invoke-virtual {v5, v8, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1296
    .line 1297
    .line 1298
    move-result v10

    .line 1299
    iput v10, v1, La/tql0;->g:I

    .line 1300
    .line 1301
    iget-object v10, v1, La/tql0;->e:Landroid/widget/TextView;

    .line 1302
    .line 1303
    invoke-virtual {v5, v11, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 1304
    .line 1305
    .line 1306
    move-result v11

    .line 1307
    invoke-virtual {v5, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1308
    .line 1309
    .line 1310
    move-result v14

    .line 1311
    invoke-virtual {v5, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1312
    .line 1313
    .line 1314
    move-result v9

    .line 1315
    iput v9, v1, La/tql0;->a:I

    .line 1316
    .line 1317
    const/16 v9, 0x11

    .line 1318
    .line 1319
    invoke-virtual {v5, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1320
    .line 1321
    .line 1322
    move-result v13

    .line 1323
    const/16 v9, 0x13

    .line 1324
    .line 1325
    invoke-virtual {v5, v9, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1326
    .line 1327
    .line 1328
    move-result v9

    .line 1329
    const/16 v8, 0x9

    .line 1330
    .line 1331
    invoke-virtual {v5, v8, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1332
    .line 1333
    .line 1334
    move-result v8

    .line 1335
    invoke-virtual {v5, v7, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1336
    .line 1337
    .line 1338
    move-result v15

    .line 1339
    invoke-virtual {v5, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1340
    .line 1341
    .line 1342
    move-result v7

    .line 1343
    invoke-virtual {v5, v12, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1344
    .line 1345
    .line 1346
    move-result v12

    .line 1347
    const/16 v3, 0xa

    .line 1348
    .line 1349
    invoke-virtual {v5, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1350
    .line 1351
    .line 1352
    move-result v3

    .line 1353
    move/from16 p0, v11

    .line 1354
    .line 1355
    const/16 v11, 0xf

    .line 1356
    .line 1357
    invoke-virtual {v5, v11, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1358
    .line 1359
    .line 1360
    move-result v11

    .line 1361
    const/4 v2, 0x5

    .line 1362
    move/from16 p1, v11

    .line 1363
    .line 1364
    const/4 v11, 0x0

    .line 1365
    invoke-virtual {v5, v2, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 1366
    .line 1367
    .line 1368
    move-result v2

    .line 1369
    const/4 v11, 0x7

    .line 1370
    move/from16 v18, v2

    .line 1371
    .line 1372
    const/4 v2, 0x0

    .line 1373
    invoke-virtual {v5, v11, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1374
    .line 1375
    .line 1376
    move-result v11

    .line 1377
    move/from16 v19, v11

    .line 1378
    .line 1379
    const/4 v11, 0x6

    .line 1380
    invoke-virtual {v5, v11, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1381
    .line 1382
    .line 1383
    move-result v11

    .line 1384
    const/16 v2, 0x14

    .line 1385
    .line 1386
    move/from16 v16, v11

    .line 1387
    .line 1388
    const/4 v11, 0x0

    .line 1389
    invoke-virtual {v5, v2, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 1390
    .line 1391
    .line 1392
    move-result v2

    .line 1393
    const/16 v11, 0x16

    .line 1394
    .line 1395
    move/from16 v17, v2

    .line 1396
    .line 1397
    const/4 v2, 0x0

    .line 1398
    invoke-virtual {v5, v11, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1399
    .line 1400
    .line 1401
    move-result v11

    .line 1402
    move/from16 v20, v11

    .line 1403
    .line 1404
    const/16 v11, 0x15

    .line 1405
    .line 1406
    invoke-virtual {v5, v11, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1407
    .line 1408
    .line 1409
    move-result v11

    .line 1410
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 1411
    .line 1412
    invoke-direct {v2, v15, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1413
    .line 1414
    .line 1415
    const/16 v7, 0x31

    .line 1416
    .line 1417
    iput v7, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1418
    .line 1419
    iput v8, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1420
    .line 1421
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 1422
    .line 1423
    const/4 v8, -0x1

    .line 1424
    const/4 v15, -0x2

    .line 1425
    invoke-direct {v7, v8, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1426
    .line 1427
    .line 1428
    const/16 v8, 0x50

    .line 1429
    .line 1430
    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1431
    .line 1432
    const/4 v8, 0x0

    .line 1433
    invoke-virtual {v7, v9, v8, v9, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 1434
    .line 1435
    .line 1436
    const/16 v8, 0x10

    .line 1437
    .line 1438
    iget v9, v1, La/tql0;->h:I

    .line 1439
    .line 1440
    invoke-virtual {v5, v8, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1441
    .line 1442
    .line 1443
    move-result v8

    .line 1444
    iput v8, v1, La/tql0;->f:I

    .line 1445
    .line 1446
    iget v8, v1, La/tql0;->h:I

    .line 1447
    .line 1448
    const/16 v9, 0xe

    .line 1449
    .line 1450
    invoke-virtual {v5, v9, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1451
    .line 1452
    .line 1453
    move-result v5

    .line 1454
    iput v5, v1, La/tql0;->h:I

    .line 1455
    .line 1456
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 1457
    .line 1458
    invoke-direct {v5, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1462
    .line 1463
    .line 1464
    iget-object v4, v1, La/tql0;->b:Landroid/widget/ImageView;

    .line 1465
    .line 1466
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1467
    .line 1468
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1472
    .line 1473
    .line 1474
    iget v2, v1, La/tql0;->g:I

    .line 1475
    .line 1476
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v4, v12, v3, v12, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1480
    .line 1481
    .line 1482
    if-eqz v14, :cond_d

    .line 1483
    .line 1484
    invoke-virtual {v0, v14}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v2

    .line 1488
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1489
    .line 1490
    .line 1491
    :cond_d
    const v2, 0x7f140469

    .line 1492
    .line 1493
    .line 1494
    invoke-static {v2, v10}, La/cem0;->m(ILandroid/widget/TextView;)V

    .line 1495
    .line 1496
    .line 1497
    const/4 v2, 0x2

    .line 1498
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1499
    .line 1500
    .line 1501
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 1502
    .line 1503
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1504
    .line 1505
    .line 1506
    const/16 v9, 0x11

    .line 1507
    .line 1508
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 1509
    .line 1510
    .line 1511
    const/4 v2, 0x3

    .line 1512
    invoke-virtual {v10, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v10, v2}, Landroid/view/View;->setTextDirection(I)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v10, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1519
    .line 1520
    .line 1521
    move/from16 v2, p0

    .line 1522
    .line 1523
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1524
    .line 1525
    .line 1526
    move/from16 v2, p1

    .line 1527
    .line 1528
    invoke-virtual {v10, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1529
    .line 1530
    .line 1531
    iget v2, v1, La/tql0;->h:I

    .line 1532
    .line 1533
    iget v3, v1, La/tql0;->f:I

    .line 1534
    .line 1535
    if-ne v2, v3, :cond_e

    .line 1536
    .line 1537
    int-to-float v2, v2

    .line 1538
    const/4 v8, 0x0

    .line 1539
    invoke-virtual {v10, v8, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1540
    .line 1541
    .line 1542
    goto :goto_6

    .line 1543
    :cond_e
    const/4 v4, 0x1

    .line 1544
    const/4 v8, 0x0

    .line 1545
    invoke-static {v10, v3, v2, v4, v8}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 1546
    .line 1547
    .line 1548
    :goto_6
    iget-object v2, v1, La/tql0;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1549
    .line 1550
    const/16 v3, 0x8

    .line 1551
    .line 1552
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 1553
    .line 1554
    .line 1555
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1556
    .line 1557
    move/from16 v5, v16

    .line 1558
    .line 1559
    move/from16 v4, v19

    .line 1560
    .line 1561
    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1565
    .line 1566
    .line 1567
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 1568
    .line 1569
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1570
    .line 1571
    .line 1572
    move/from16 v4, v18

    .line 1573
    .line 1574
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1575
    .line 1576
    .line 1577
    const v4, 0x7f040b0e

    .line 1578
    .line 1579
    .line 1580
    invoke-static {v4, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1581
    .line 1582
    .line 1583
    move-result v5

    .line 1584
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v5

    .line 1588
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1592
    .line 1593
    .line 1594
    iget-object v2, v1, La/tql0;->d:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1595
    .line 1596
    const/16 v3, 0x8

    .line 1597
    .line 1598
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 1599
    .line 1600
    .line 1601
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1602
    .line 1603
    move/from16 v5, v20

    .line 1604
    .line 1605
    invoke-direct {v3, v5, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1606
    .line 1607
    .line 1608
    const/16 v5, 0x51

    .line 1609
    .line 1610
    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1611
    .line 1612
    const/4 v8, 0x0

    .line 1613
    invoke-virtual {v3, v8, v8, v8, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1617
    .line 1618
    .line 1619
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 1620
    .line 1621
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1622
    .line 1623
    .line 1624
    move/from16 v5, v17

    .line 1625
    .line 1626
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1627
    .line 1628
    .line 1629
    invoke-static {v4, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1630
    .line 1631
    .line 1632
    move-result v0

    .line 1633
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v0

    .line 1637
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1641
    .line 1642
    .line 1643
    iget v0, v1, La/tql0;->a:I

    .line 1644
    .line 1645
    if-eqz v0, :cond_f

    .line 1646
    .line 1647
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1648
    .line 1649
    .line 1650
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1651
    .line 1652
    return-object v0

    .line 1653
    :pswitch_14
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1654
    .line 1655
    check-cast v1, La/sql0;

    .line 1656
    .line 1657
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1658
    .line 1659
    check-cast v0, La/lql0;

    .line 1660
    .line 1661
    move-object/from16 v2, p1

    .line 1662
    .line 1663
    check-cast v2, Landroid/view/View;

    .line 1664
    .line 1665
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1666
    .line 1667
    .line 1668
    iget-object v1, v1, La/sql0;->f:La/xdr;

    .line 1669
    .line 1670
    if-eqz v1, :cond_10

    .line 1671
    .line 1672
    sget-object v2, La/ae9;->c:La/ae9;

    .line 1673
    .line 1674
    check-cast v0, La/kql0;

    .line 1675
    .line 1676
    iget-object v3, v0, La/kql0;->b:La/vql0;

    .line 1677
    .line 1678
    iget-wide v3, v3, La/vql0;->a:J

    .line 1679
    .line 1680
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v3

    .line 1684
    iget-object v0, v0, La/kql0;->b:La/vql0;

    .line 1685
    .line 1686
    iget-object v0, v0, La/vql0;->b:Ljava/lang/String;

    .line 1687
    .line 1688
    invoke-interface {v1, v2, v3, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1689
    .line 1690
    .line 1691
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1692
    .line 1693
    return-object v0

    .line 1694
    :pswitch_15
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1695
    .line 1696
    check-cast v1, La/wll0;

    .line 1697
    .line 1698
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1699
    .line 1700
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1701
    .line 1702
    move-object/from16 v2, p1

    .line 1703
    .line 1704
    check-cast v2, La/bem;

    .line 1705
    .line 1706
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1707
    .line 1708
    .line 1709
    iget-object v3, v1, La/wll0;->a:La/lla;

    .line 1710
    .line 1711
    iget-object v1, v1, La/wll0;->b:La/vvs;

    .line 1712
    .line 1713
    instance-of v4, v2, La/wdm;

    .line 1714
    .line 1715
    if-eqz v4, :cond_11

    .line 1716
    .line 1717
    new-instance v2, La/lrk0;

    .line 1718
    .line 1719
    new-instance v4, La/hll0;

    .line 1720
    .line 1721
    invoke-interface {v3}, La/lla;->a()J

    .line 1722
    .line 1723
    .line 1724
    move-result-wide v5

    .line 1725
    invoke-direct {v4, v5, v6}, La/hll0;-><init>(J)V

    .line 1726
    .line 1727
    .line 1728
    invoke-direct {v2, v4, v1}, La/lrk0;-><init>(La/ill0;La/vvs;)V

    .line 1729
    .line 1730
    .line 1731
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1732
    .line 1733
    .line 1734
    goto :goto_8

    .line 1735
    :cond_11
    instance-of v4, v2, La/rdm;

    .line 1736
    .line 1737
    if-eqz v4, :cond_12

    .line 1738
    .line 1739
    goto :goto_7

    .line 1740
    :cond_12
    instance-of v2, v2, La/xdm;

    .line 1741
    .line 1742
    if-eqz v2, :cond_13

    .line 1743
    .line 1744
    :goto_7
    new-instance v2, La/lrk0;

    .line 1745
    .line 1746
    new-instance v4, La/gll0;

    .line 1747
    .line 1748
    invoke-interface {v3}, La/lla;->a()J

    .line 1749
    .line 1750
    .line 1751
    move-result-wide v5

    .line 1752
    invoke-direct {v4, v5, v6}, La/gll0;-><init>(J)V

    .line 1753
    .line 1754
    .line 1755
    invoke-direct {v2, v4, v1}, La/lrk0;-><init>(La/ill0;La/vvs;)V

    .line 1756
    .line 1757
    .line 1758
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    :cond_13
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1762
    .line 1763
    return-object v0

    .line 1764
    :pswitch_16
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1765
    .line 1766
    check-cast v1, La/kfl0;

    .line 1767
    .line 1768
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1769
    .line 1770
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1771
    .line 1772
    move-object/from16 v2, p1

    .line 1773
    .line 1774
    check-cast v2, La/hcz;

    .line 1775
    .line 1776
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1777
    .line 1778
    .line 1779
    iget-object v3, v1, La/kfl0;->b:La/a4x;

    .line 1780
    .line 1781
    new-instance v4, La/gcl0;

    .line 1782
    .line 1783
    const/16 v8, 0x9

    .line 1784
    .line 1785
    invoke-direct {v4, v8}, La/gcl0;-><init>(B)V

    .line 1786
    .line 1787
    .line 1788
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1789
    .line 1790
    .line 1791
    move-result v5

    .line 1792
    new-instance v6, La/o3l0;

    .line 1793
    .line 1794
    const/16 v8, 0xc

    .line 1795
    .line 1796
    invoke-direct {v6, v4, v3, v8}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1797
    .line 1798
    .line 1799
    new-instance v4, La/y9k0;

    .line 1800
    .line 1801
    const/16 v7, 0xf

    .line 1802
    .line 1803
    invoke-direct {v4, v3, v7}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 1804
    .line 1805
    .line 1806
    new-instance v7, La/h8w;

    .line 1807
    .line 1808
    const/16 v8, 0x18

    .line 1809
    .line 1810
    invoke-direct {v7, v3, v0, v1, v8}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1811
    .line 1812
    .line 1813
    new-instance v0, La/ugd;

    .line 1814
    .line 1815
    const/4 v1, 0x1

    .line 1816
    invoke-direct {v0, v14, v1, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v2, v5, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1820
    .line 1821
    .line 1822
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1823
    .line 1824
    return-object v0

    .line 1825
    :pswitch_17
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1826
    .line 1827
    check-cast v1, Ljava/util/List;

    .line 1828
    .line 1829
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1830
    .line 1831
    check-cast v0, La/j8l0;

    .line 1832
    .line 1833
    move-object/from16 v2, p1

    .line 1834
    .line 1835
    check-cast v2, La/hcz;

    .line 1836
    .line 1837
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1838
    .line 1839
    .line 1840
    new-instance v3, La/gcl0;

    .line 1841
    .line 1842
    const/4 v9, 0x6

    .line 1843
    invoke-direct {v3, v9}, La/gcl0;-><init>(B)V

    .line 1844
    .line 1845
    .line 1846
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1847
    .line 1848
    .line 1849
    move-result v4

    .line 1850
    new-instance v5, La/o3l0;

    .line 1851
    .line 1852
    const/16 v9, 0xe

    .line 1853
    .line 1854
    invoke-direct {v5, v3, v1, v9}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1855
    .line 1856
    .line 1857
    new-instance v3, La/y9k0;

    .line 1858
    .line 1859
    const/16 v9, 0x11

    .line 1860
    .line 1861
    invoke-direct {v3, v1, v9}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 1862
    .line 1863
    .line 1864
    new-instance v6, La/xe4;

    .line 1865
    .line 1866
    invoke-direct {v6, v1, v0, v9}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 1867
    .line 1868
    .line 1869
    new-instance v0, La/ugd;

    .line 1870
    .line 1871
    const/4 v1, 0x1

    .line 1872
    invoke-direct {v0, v14, v1, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1873
    .line 1874
    .line 1875
    invoke-virtual {v2, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1876
    .line 1877
    .line 1878
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1879
    .line 1880
    return-object v0

    .line 1881
    :pswitch_18
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1882
    .line 1883
    check-cast v1, La/ncl0;

    .line 1884
    .line 1885
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1886
    .line 1887
    check-cast v0, Ljava/lang/String;

    .line 1888
    .line 1889
    move-object/from16 v2, p1

    .line 1890
    .line 1891
    check-cast v2, La/k0w0;

    .line 1892
    .line 1893
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1894
    .line 1895
    .line 1896
    iget-object v3, v1, La/ncl0;->k:La/yfm0;

    .line 1897
    .line 1898
    invoke-virtual {v1}, La/ncl0;->w()La/qz40;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v4

    .line 1902
    check-cast v4, La/p7m0;

    .line 1903
    .line 1904
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v4

    .line 1908
    check-cast v4, La/zqs;

    .line 1909
    .line 1910
    iget-wide v4, v4, La/zqs;->b:J

    .line 1911
    .line 1912
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v4

    .line 1916
    invoke-virtual {v1}, La/ncl0;->w()La/qz40;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v1

    .line 1920
    check-cast v1, La/p7m0;

    .line 1921
    .line 1922
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v1

    .line 1926
    check-cast v1, La/zqs;

    .line 1927
    .line 1928
    iget-wide v5, v1, La/zqs;->c:J

    .line 1929
    .line 1930
    check-cast v3, La/zfm0;

    .line 1931
    .line 1932
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1936
    .line 1937
    .line 1938
    invoke-static {v5, v6, v0, v4}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v0

    .line 1942
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1943
    .line 1944
    .line 1945
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1946
    .line 1947
    return-object v0

    .line 1948
    :pswitch_19
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 1949
    .line 1950
    check-cast v1, La/c3n;

    .line 1951
    .line 1952
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 1953
    .line 1954
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1955
    .line 1956
    move-object/from16 v2, p1

    .line 1957
    .line 1958
    check-cast v2, La/hcz;

    .line 1959
    .line 1960
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1961
    .line 1962
    .line 1963
    iget-object v1, v1, La/c3n;->a:La/a4x;

    .line 1964
    .line 1965
    new-instance v3, La/jak0;

    .line 1966
    .line 1967
    const/16 v8, 0x19

    .line 1968
    .line 1969
    invoke-direct {v3, v8}, La/jak0;-><init>(B)V

    .line 1970
    .line 1971
    .line 1972
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1973
    .line 1974
    .line 1975
    move-result v4

    .line 1976
    new-instance v5, La/o3l0;

    .line 1977
    .line 1978
    const/16 v6, 0x8

    .line 1979
    .line 1980
    invoke-direct {v5, v3, v1, v6}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1981
    .line 1982
    .line 1983
    new-instance v3, La/y9k0;

    .line 1984
    .line 1985
    invoke-direct {v3, v1, v9}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 1986
    .line 1987
    .line 1988
    new-instance v6, La/njh0;

    .line 1989
    .line 1990
    invoke-direct {v6, v1, v0, v9}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1991
    .line 1992
    .line 1993
    new-instance v0, La/ugd;

    .line 1994
    .line 1995
    const/4 v1, 0x1

    .line 1996
    invoke-direct {v0, v14, v1, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1997
    .line 1998
    .line 1999
    invoke-virtual {v2, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2000
    .line 2001
    .line 2002
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2003
    .line 2004
    return-object v0

    .line 2005
    :pswitch_1a
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 2006
    .line 2007
    check-cast v1, La/z2n;

    .line 2008
    .line 2009
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 2010
    .line 2011
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2012
    .line 2013
    move-object/from16 v2, p1

    .line 2014
    .line 2015
    check-cast v2, La/hcz;

    .line 2016
    .line 2017
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2018
    .line 2019
    .line 2020
    iget-object v3, v1, La/z2n;->a:La/a4x;

    .line 2021
    .line 2022
    new-instance v4, La/jak0;

    .line 2023
    .line 2024
    const/16 v5, 0x18

    .line 2025
    .line 2026
    invoke-direct {v4, v5}, La/jak0;-><init>(B)V

    .line 2027
    .line 2028
    .line 2029
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2030
    .line 2031
    .line 2032
    move-result v5

    .line 2033
    new-instance v6, La/o3l0;

    .line 2034
    .line 2035
    const/4 v7, 0x7

    .line 2036
    invoke-direct {v6, v4, v3, v7}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2037
    .line 2038
    .line 2039
    new-instance v4, La/y9k0;

    .line 2040
    .line 2041
    const/16 v7, 0xa

    .line 2042
    .line 2043
    invoke-direct {v4, v3, v7}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 2044
    .line 2045
    .line 2046
    new-instance v7, La/h8w;

    .line 2047
    .line 2048
    const/16 v8, 0x17

    .line 2049
    .line 2050
    invoke-direct {v7, v3, v1, v0, v8}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 2051
    .line 2052
    .line 2053
    new-instance v0, La/ugd;

    .line 2054
    .line 2055
    const/4 v1, 0x1

    .line 2056
    invoke-direct {v0, v14, v1, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2057
    .line 2058
    .line 2059
    invoke-virtual {v2, v5, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2060
    .line 2061
    .line 2062
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2063
    .line 2064
    return-object v0

    .line 2065
    :pswitch_1b
    iget-object v1, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 2066
    .line 2067
    check-cast v1, La/w2n;

    .line 2068
    .line 2069
    iget-object v0, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 2070
    .line 2071
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2072
    .line 2073
    move-object/from16 v2, p1

    .line 2074
    .line 2075
    check-cast v2, La/hcz;

    .line 2076
    .line 2077
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2078
    .line 2079
    .line 2080
    iget-object v1, v1, La/w2n;->a:La/a4x;

    .line 2081
    .line 2082
    new-instance v3, La/jak0;

    .line 2083
    .line 2084
    const/16 v4, 0x17

    .line 2085
    .line 2086
    invoke-direct {v3, v4}, La/jak0;-><init>(B)V

    .line 2087
    .line 2088
    .line 2089
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2090
    .line 2091
    .line 2092
    move-result v4

    .line 2093
    new-instance v5, La/o3l0;

    .line 2094
    .line 2095
    const/4 v9, 0x6

    .line 2096
    invoke-direct {v5, v3, v1, v9}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2097
    .line 2098
    .line 2099
    new-instance v3, La/y9k0;

    .line 2100
    .line 2101
    const/16 v8, 0x9

    .line 2102
    .line 2103
    invoke-direct {v3, v1, v8}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 2104
    .line 2105
    .line 2106
    new-instance v6, La/njh0;

    .line 2107
    .line 2108
    const/16 v7, 0xa

    .line 2109
    .line 2110
    invoke-direct {v6, v1, v0, v7}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 2111
    .line 2112
    .line 2113
    new-instance v0, La/ugd;

    .line 2114
    .line 2115
    const/4 v1, 0x1

    .line 2116
    invoke-direct {v0, v14, v1, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2117
    .line 2118
    .line 2119
    invoke-virtual {v2, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2120
    .line 2121
    .line 2122
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2123
    .line 2124
    return-object v0

    .line 2125
    :pswitch_1c
    iget-object v1, v0, La/u5l0;->b:Ljava/lang/Object;

    .line 2126
    .line 2127
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 2128
    .line 2129
    iget-object v0, v0, La/u5l0;->c:Ljava/lang/Object;

    .line 2130
    .line 2131
    check-cast v0, La/y5l0;

    .line 2132
    .line 2133
    move-object/from16 v2, p1

    .line 2134
    .line 2135
    check-cast v2, La/bem;

    .line 2136
    .line 2137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2138
    .line 2139
    .line 2140
    new-instance v3, La/mqk0;

    .line 2141
    .line 2142
    iget-object v0, v0, La/y5l0;->b:La/vvs;

    .line 2143
    .line 2144
    invoke-direct {v3, v2, v0}, La/mqk0;-><init>(La/bem;La/vvs;)V

    .line 2145
    .line 2146
    .line 2147
    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2148
    .line 2149
    .line 2150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2151
    .line 2152
    return-object v0

    .line 2153
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
