.class public final synthetic La/nfj0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/nfj0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/nfj0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    check-cast p2, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/urp0;

    .line 23
    .line 24
    iget-object v0, p0, La/urp0;->s:La/xae0;

    .line 25
    .line 26
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 27
    .line 28
    invoke-interface {v0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/erp0;

    .line 33
    .line 34
    instance-of v1, v0, La/crp0;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    check-cast v0, La/crp0;

    .line 39
    .line 40
    iget-object v0, v0, La/crp0;->a:Ljava/util/Set;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->J0(Ljava/lang/Iterable;)Ljava/util/HashSet;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/16 v2, 0xa

    .line 55
    .line 56
    if-lt v1, v2, :cond_0

    .line 57
    .line 58
    sget-object p1, La/krp0;->a:La/krp0;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/urp0;->D(La/lrp0;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    if-eqz p2, :cond_1

    .line 65
    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :goto_0
    new-instance p1, La/crp0;

    .line 82
    .line 83
    invoke-direct {p1, v0}, La/crp0;-><init>(Ljava/util/Set;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/urp0;->b:La/vzg0;

    .line 87
    .line 88
    const-string p2, "SELECTED_IDS"

    .line 89
    .line 90
    invoke-virtual {p0, p2, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_0
    check-cast p2, La/yje;

    .line 97
    .line 98
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 101
    .line 102
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    check-cast p2, La/yje;

    .line 109
    .line 110
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 113
    .line 114
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_2
    check-cast p2, La/yje;

    .line 121
    .line 122
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 125
    .line 126
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_3
    check-cast p2, La/yje;

    .line 133
    .line 134
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 137
    .line 138
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_4
    check-cast p2, La/yje;

    .line 145
    .line 146
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_5
    check-cast p2, La/yje;

    .line 157
    .line 158
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 161
    .line 162
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_6
    check-cast p2, La/yje;

    .line 169
    .line 170
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 173
    .line 174
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_7
    check-cast p2, La/yje;

    .line 181
    .line 182
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 185
    .line 186
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_8
    check-cast p2, La/yje;

    .line 193
    .line 194
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_9
    check-cast p2, La/yje;

    .line 205
    .line 206
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 209
    .line 210
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_a
    check-cast p2, La/yje;

    .line 217
    .line 218
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 221
    .line 222
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_b
    check-cast p2, La/yje;

    .line 229
    .line 230
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 233
    .line 234
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_c
    check-cast p2, La/yje;

    .line 241
    .line 242
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 245
    .line 246
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_d
    check-cast p2, La/yje;

    .line 253
    .line 254
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 257
    .line 258
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_e
    check-cast p2, La/yje;

    .line 265
    .line 266
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 269
    .line 270
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_f
    check-cast p2, La/yje;

    .line 277
    .line 278
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 281
    .line 282
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_10
    check-cast p2, La/yje;

    .line 289
    .line 290
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 293
    .line 294
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object p0

    .line 300
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 303
    .line 304
    .line 305
    move-result-wide v0

    .line 306
    check-cast p2, Ljava/lang/Number;

    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 313
    .line 314
    move-object v4, p0

    .line 315
    check-cast v4, La/dzm0;

    .line 316
    .line 317
    iget-object p0, v4, La/dzm0;->b:La/vzg0;

    .line 318
    .line 319
    const-string p1, "selected_sub_game_id_key"

    .line 320
    .line 321
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-virtual {p0, p1, p2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    iget-object v5, v4, La/dzm0;->n:La/p7m0;

    .line 329
    .line 330
    :cond_3
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    move-object p1, p0

    .line 335
    check-cast p1, La/owm0;

    .line 336
    .line 337
    instance-of p2, p1, La/mwm0;

    .line 338
    .line 339
    if-eqz p2, :cond_4

    .line 340
    .line 341
    check-cast p1, La/mwm0;

    .line 342
    .line 343
    new-instance v10, Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$Position;

    .line 344
    .line 345
    invoke-direct {v10, v3}, Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$Position;-><init>(I)V

    .line 346
    .line 347
    .line 348
    iget-boolean v7, p1, La/mwm0;->a:Z

    .line 349
    .line 350
    iget-boolean v8, p1, La/mwm0;->b:Z

    .line 351
    .line 352
    iget-object v9, p1, La/mwm0;->c:Ljava/util/List;

    .line 353
    .line 354
    iget-boolean v11, p1, La/mwm0;->e:Z

    .line 355
    .line 356
    new-instance v6, La/mwm0;

    .line 357
    .line 358
    invoke-direct/range {v6 .. v11}, La/mwm0;-><init>(ZZLjava/util/List;Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;Z)V

    .line 359
    .line 360
    .line 361
    move-object p1, v6

    .line 362
    :cond_4
    invoke-virtual {v5, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    if-eqz p0, :cond_3

    .line 367
    .line 368
    iget-object p0, v4, La/dzm0;->p:Ljava/util/List;

    .line 369
    .line 370
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    .line 376
    .line 377
    move-result p1

    .line 378
    if-eqz p1, :cond_6

    .line 379
    .line 380
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    move-object p2, p1

    .line 385
    check-cast p2, La/xvm0;

    .line 386
    .line 387
    invoke-interface {p2}, La/xvm0;->getId()J

    .line 388
    .line 389
    .line 390
    move-result-wide v5

    .line 391
    cmp-long p2, v5, v0

    .line 392
    .line 393
    if-nez p2, :cond_5

    .line 394
    .line 395
    move-object v2, p1

    .line 396
    :cond_6
    check-cast v2, La/xvm0;

    .line 397
    .line 398
    if-eqz v2, :cond_7

    .line 399
    .line 400
    iget-object p0, v4, La/dzm0;->h:La/s1u;

    .line 401
    .line 402
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    iget-object p0, p0, La/s1u;->a:La/kym0;

    .line 406
    .line 407
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-object p0, p0, La/kym0;->b:La/yvf;

    .line 411
    .line 412
    invoke-virtual {p0, v2}, La/yvf;->b(La/xvm0;)V

    .line 413
    .line 414
    .line 415
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    return-object p0

    .line 418
    :pswitch_12
    check-cast p2, La/yje;

    .line 419
    .line 420
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 423
    .line 424
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object p0

    .line 430
    :pswitch_13
    check-cast p2, La/yje;

    .line 431
    .line 432
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 435
    .line 436
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    return-object p0

    .line 442
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    check-cast p2, Ljava/lang/Boolean;

    .line 449
    .line 450
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 451
    .line 452
    .line 453
    move-result p2

    .line 454
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast p0, La/tam0;

    .line 457
    .line 458
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    iget-object v0, p0, La/tam0;->d:La/mne;

    .line 466
    .line 467
    iget-object v6, v0, La/mne;->a:La/rwj;

    .line 468
    .line 469
    new-instance v4, La/q9m0;

    .line 470
    .line 471
    invoke-direct {v4, p0, v1}, La/q9m0;-><init>(La/tam0;B)V

    .line 472
    .line 473
    .line 474
    new-instance v7, La/u52;

    .line 475
    .line 476
    invoke-direct {v7, p0, p1, p2, v2}, La/u52;-><init>(La/tam0;IZLa/yje;)V

    .line 477
    .line 478
    .line 479
    const/16 v8, 0xa

    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 483
    .line 484
    .line 485
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object p0

    .line 488
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 489
    .line 490
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 491
    .line 492
    .line 493
    move-result p1

    .line 494
    check-cast p2, Ljava/lang/Number;

    .line 495
    .line 496
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 497
    .line 498
    .line 499
    move-result p2

    .line 500
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast p0, La/tam0;

    .line 503
    .line 504
    iget-object v0, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 505
    .line 506
    sub-int/2addr p2, v1

    .line 507
    invoke-interface {v0, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object p2

    .line 511
    check-cast p2, La/iam0;

    .line 512
    .line 513
    iget-object v0, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 514
    .line 515
    sub-int/2addr p1, v1

    .line 516
    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {p0}, La/tam0;->A()V

    .line 520
    .line 521
    .line 522
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 523
    .line 524
    return-object p0

    .line 525
    :pswitch_16
    check-cast p2, La/yje;

    .line 526
    .line 527
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 530
    .line 531
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 535
    .line 536
    return-object p0

    .line 537
    :pswitch_17
    check-cast p2, La/yje;

    .line 538
    .line 539
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 542
    .line 543
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object p0

    .line 549
    :pswitch_18
    check-cast p2, La/yje;

    .line 550
    .line 551
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 554
    .line 555
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    return-object p0

    .line 561
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 562
    .line 563
    move-object v5, p2

    .line 564
    check-cast v5, Ljava/lang/String;

    .line 565
    .line 566
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast p0, La/xxj0;

    .line 575
    .line 576
    iget-object p2, p0, La/xxj0;->v0:La/p7m0;

    .line 577
    .line 578
    new-instance v0, La/a40;

    .line 579
    .line 580
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 581
    .line 582
    const-string v1, ""

    .line 583
    .line 584
    invoke-direct {v0, v1, v3, v4}, La/a40;-><init>(Ljava/lang/String;D)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-virtual {p2, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    instance-of p2, p1, La/zhi0;

    .line 594
    .line 595
    if-eqz p2, :cond_9

    .line 596
    .line 597
    check-cast p1, La/zhi0;

    .line 598
    .line 599
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 600
    .line 601
    sget-object p2, La/i2o;->n:La/i2o;

    .line 602
    .line 603
    if-eq p1, p2, :cond_8

    .line 604
    .line 605
    sget-object p2, La/i2o;->A:La/i2o;

    .line 606
    .line 607
    if-eq p1, p2, :cond_8

    .line 608
    .line 609
    sget-object p2, La/i2o;->B:La/i2o;

    .line 610
    .line 611
    if-ne p1, p2, :cond_9

    .line 612
    .line 613
    :cond_8
    iget-object p0, p0, La/xxj0;->q0:La/ol60;

    .line 614
    .line 615
    new-instance p1, La/tuj0;

    .line 616
    .line 617
    new-instance v3, La/xdk0;

    .line 618
    .line 619
    sget-object v4, La/pek0;->a:La/pek0;

    .line 620
    .line 621
    const/4 v9, 0x0

    .line 622
    const/16 v10, 0x7c

    .line 623
    .line 624
    const/4 v6, 0x0

    .line 625
    const/4 v7, 0x0

    .line 626
    const/4 v8, 0x0

    .line 627
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 628
    .line 629
    .line 630
    invoke-direct {p1, v3}, La/tuj0;-><init>(La/xdk0;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object p0

    .line 639
    :pswitch_1a
    check-cast p2, La/yje;

    .line 640
    .line 641
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 644
    .line 645
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 649
    .line 650
    return-object p0

    .line 651
    :pswitch_1b
    check-cast p2, La/yje;

    .line 652
    .line 653
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 656
    .line 657
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 661
    .line 662
    return-object p0

    .line 663
    :pswitch_1c
    check-cast p2, La/yje;

    .line 664
    .line 665
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 668
    .line 669
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 673
    .line 674
    return-object p0

    .line 675
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
