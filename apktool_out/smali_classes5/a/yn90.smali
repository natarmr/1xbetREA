.class public final synthetic La/yn90;
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
    iput-byte p7, p0, La/yn90;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/yn90;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, La/yje;

    .line 7
    .line 8
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p2, La/yje;

    .line 19
    .line 20
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    check-cast p2, La/yje;

    .line 31
    .line 32
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    check-cast p2, La/yje;

    .line 43
    .line 44
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 47
    .line 48
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_3
    check-cast p2, La/yje;

    .line 55
    .line 56
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 59
    .line 60
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    check-cast p2, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, La/sld0;

    .line 81
    .line 82
    iget-object p0, p0, La/sld0;->m:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/p6t0;

    .line 89
    .line 90
    invoke-static {p2, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, La/p6t0;

    .line 95
    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    instance-of v0, v0, La/dev0;

    .line 99
    .line 100
    if-nez v0, :cond_0

    .line 101
    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    instance-of v0, v1, La/dev0;

    .line 105
    .line 106
    if-nez v0, :cond_0

    .line 107
    .line 108
    invoke-static {p0, p2, p1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 109
    .line 110
    .line 111
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_5
    check-cast p2, La/yje;

    .line 115
    .line 116
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 119
    .line 120
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_6
    check-cast p2, La/yje;

    .line 127
    .line 128
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 131
    .line 132
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_7
    check-cast p2, La/yje;

    .line 139
    .line 140
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 143
    .line 144
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_8
    check-cast p2, La/yje;

    .line 151
    .line 152
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_9
    check-cast p2, La/yje;

    .line 163
    .line 164
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 167
    .line 168
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_a
    check-cast p2, La/yje;

    .line 175
    .line 176
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 179
    .line 180
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_b
    check-cast p1, La/w2c0;

    .line 187
    .line 188
    check-cast p2, Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 197
    .line 198
    move-object v2, p0

    .line 199
    check-cast v2, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {p2}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    iget-object p2, v2, Lorg/xplatform/personal/impl/presentation/edit/n;->u:Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, La/bby;

    .line 219
    .line 220
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    iget-object v0, v2, Lorg/xplatform/personal/impl/presentation/edit/n;->k:La/mne;

    .line 228
    .line 229
    iget-object v9, v0, La/mne;->a:La/rwj;

    .line 230
    .line 231
    new-instance v0, La/e9b0;

    .line 232
    .line 233
    const/4 v6, 0x0

    .line 234
    const/16 v7, 0x1a

    .line 235
    .line 236
    const/4 v1, 0x1

    .line 237
    const-class v3, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 238
    .line 239
    const-string v4, "handleError"

    .line 240
    .line 241
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 242
    .line 243
    invoke-direct/range {v0 .. v7}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 244
    .line 245
    .line 246
    new-instance v7, Lorg/xplatform/personal/impl/presentation/edit/m;

    .line 247
    .line 248
    const/4 v1, 0x0

    .line 249
    invoke-direct {v7, v2, p1, p0, v1}, Lorg/xplatform/personal/impl/presentation/edit/m;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/w2c0;Ljava/lang/String;La/yje;)V

    .line 250
    .line 251
    .line 252
    move-object v3, v8

    .line 253
    const/16 v8, 0xa

    .line 254
    .line 255
    const/4 v5, 0x0

    .line 256
    move-object v4, v0

    .line 257
    move-object v6, v9

    .line 258
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_c
    check-cast p2, La/yje;

    .line 269
    .line 270
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 273
    .line 274
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_d
    check-cast p2, La/yje;

    .line 281
    .line 282
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 285
    .line 286
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_e
    check-cast p2, La/yje;

    .line 293
    .line 294
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 297
    .line 298
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_f
    check-cast p2, La/yje;

    .line 305
    .line 306
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 309
    .line 310
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object p0

    .line 316
    :pswitch_10
    check-cast p2, La/yje;

    .line 317
    .line 318
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 321
    .line 322
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object p0

    .line 328
    :pswitch_11
    check-cast p2, La/yje;

    .line 329
    .line 330
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 333
    .line 334
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    return-object p0

    .line 340
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 341
    .line 342
    check-cast p2, La/yje;

    .line 343
    .line 344
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p0, La/xcc;

    .line 347
    .line 348
    invoke-virtual {p0, p1, p2}, La/xcc;->a(Ljava/lang/Throwable;La/yje;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    sget-object p1, La/wne;->a:La/wne;

    .line 353
    .line 354
    if-ne p0, p1, :cond_1

    .line 355
    .line 356
    goto :goto_0

    .line 357
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    :goto_0
    return-object p0

    .line 360
    :pswitch_13
    check-cast p1, Ljava/lang/Throwable;

    .line 361
    .line 362
    check-cast p2, La/yje;

    .line 363
    .line 364
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast p0, La/xcc;

    .line 367
    .line 368
    invoke-virtual {p0, p1, p2}, La/xcc;->a(Ljava/lang/Throwable;La/yje;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    sget-object p1, La/wne;->a:La/wne;

    .line 373
    .line 374
    if-ne p0, p1, :cond_2

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    :goto_1
    return-object p0

    .line 380
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 381
    .line 382
    check-cast p2, La/yje;

    .line 383
    .line 384
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast p0, La/xcc;

    .line 387
    .line 388
    invoke-virtual {p0, p1, p2}, La/xcc;->a(Ljava/lang/Throwable;La/yje;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    sget-object p1, La/wne;->a:La/wne;

    .line 393
    .line 394
    if-ne p0, p1, :cond_3

    .line 395
    .line 396
    goto :goto_2

    .line 397
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    :goto_2
    return-object p0

    .line 400
    :pswitch_15
    check-cast p2, La/yje;

    .line 401
    .line 402
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 405
    .line 406
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object p0

    .line 412
    :pswitch_16
    check-cast p2, La/yje;

    .line 413
    .line 414
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 417
    .line 418
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object p0

    .line 424
    :pswitch_17
    check-cast p2, La/yje;

    .line 425
    .line 426
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 429
    .line 430
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object p0

    .line 436
    :pswitch_18
    check-cast p2, La/yje;

    .line 437
    .line 438
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 441
    .line 442
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 446
    .line 447
    return-object p0

    .line 448
    :pswitch_19
    check-cast p2, La/yje;

    .line 449
    .line 450
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 453
    .line 454
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object p0

    .line 460
    :pswitch_1a
    check-cast p2, La/yje;

    .line 461
    .line 462
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 465
    .line 466
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object p0

    .line 472
    :pswitch_1b
    check-cast p2, La/yje;

    .line 473
    .line 474
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 477
    .line 478
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object p0

    .line 484
    :pswitch_1c
    check-cast p2, La/yje;

    .line 485
    .line 486
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 489
    .line 490
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object p0

    .line 496
    nop

    .line 497
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
