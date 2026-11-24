.class public final La/g7s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g7s;->a:B

    iput-object p1, p0, La/g7s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/g7s;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/g7s;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, La/pfl;

    .line 10
    .line 11
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/wne;->a:La/wne;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    :goto_0
    return-object p0

    .line 23
    :pswitch_0
    check-cast v2, La/ens;

    .line 24
    .line 25
    invoke-virtual {v2, p1, p2}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object p1, La/wne;->a:La/wne;

    .line 30
    .line 31
    if-ne p0, p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    :goto_1
    return-object p0

    .line 37
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    check-cast v2, La/u8v;

    .line 40
    .line 41
    sget p0, La/u8v;->x:I

    .line 42
    .line 43
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, La/r8v;

    .line 48
    .line 49
    iget-object p0, p0, La/r8v;->c:La/bfo0;

    .line 50
    .line 51
    sget-object p2, La/bfo0;->d:La/bfo0;

    .line 52
    .line 53
    if-ne p0, p2, :cond_2

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_2
    iget-object p0, v2, La/u8v;->u:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

    .line 57
    .line 58
    invoke-interface {p0}, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;->x0()La/bhh0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 p2, 0x3

    .line 67
    if-eq p0, p2, :cond_4

    .line 68
    .line 69
    const/4 p2, 0x4

    .line 70
    if-eq p0, p2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, La/r8v;

    .line 77
    .line 78
    iget-object p0, p0, La/r8v;->c:La/bfo0;

    .line 79
    .line 80
    invoke-static {p0}, La/n6x;->r0(La/bfo0;)La/wgh0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    sget-object p0, La/wgh0;->d:La/wgh0;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    sget-object p0, La/wgh0;->v:La/wgh0;

    .line 89
    .line 90
    :goto_2
    invoke-static {p1}, Lkotlin/text/StringsKt;->x0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    const/4 v0, 0x1

    .line 103
    if-le p2, v0, :cond_5

    .line 104
    .line 105
    iget-object p2, v2, La/u8v;->s:La/s31;

    .line 106
    .line 107
    invoke-virtual {p2, p0, p1, v1}, La/s31;->h(La/wgh0;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 108
    .line 109
    .line 110
    iget-object p2, v2, La/u8v;->t:La/cyu;

    .line 111
    .line 112
    iget-object p0, p0, La/wgh0;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/text/StringsKt;->x0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p2, p0, p1}, La/cyu;->E(La/cyu;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_2
    check-cast v2, La/j0s;

    .line 129
    .line 130
    invoke-virtual {v2, p1, p2}, La/j0s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    sget-object p1, La/wne;->a:La/wne;

    .line 135
    .line 136
    if-ne p0, p1, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_4
    return-object p0

    .line 142
    :pswitch_3
    check-cast v2, La/j0s;

    .line 143
    .line 144
    invoke-virtual {v2, p1, p2}, La/j0s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    sget-object p1, La/wne;->a:La/wne;

    .line 149
    .line 150
    if-ne p0, p1, :cond_7

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_5
    return-object p0

    .line 156
    :pswitch_4
    check-cast v2, La/ens;

    .line 157
    .line 158
    invoke-virtual {v2, p1, p2}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    sget-object p1, La/wne;->a:La/wne;

    .line 163
    .line 164
    if-ne p0, p1, :cond_8

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    :goto_6
    return-object p0

    .line 170
    :pswitch_5
    check-cast v2, La/ens;

    .line 171
    .line 172
    invoke-virtual {v2, p1, p2}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    sget-object p1, La/wne;->a:La/wne;

    .line 177
    .line 178
    if-ne p0, p1, :cond_9

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    :goto_7
    return-object p0

    .line 184
    :pswitch_6
    check-cast v2, La/a8t;

    .line 185
    .line 186
    invoke-virtual {v2, p1, p2}, La/a8t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    sget-object p1, La/wne;->a:La/wne;

    .line 191
    .line 192
    if-ne p0, p1, :cond_a

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_8
    return-object p0

    .line 198
    :pswitch_7
    check-cast v2, La/a8t;

    .line 199
    .line 200
    invoke-virtual {v2, p1, p2}, La/a8t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    sget-object p1, La/wne;->a:La/wne;

    .line 205
    .line 206
    if-ne p0, p1, :cond_b

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    :goto_9
    return-object p0

    .line 212
    :pswitch_8
    check-cast v2, La/gkr;

    .line 213
    .line 214
    invoke-virtual {v2, p1, p2}, La/gkr;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    sget-object p1, La/wne;->a:La/wne;

    .line 219
    .line 220
    if-ne p0, p1, :cond_c

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    :goto_a
    return-object p0

    .line 226
    :pswitch_9
    check-cast v2, La/a8t;

    .line 227
    .line 228
    invoke-virtual {v2, p1, p2}, La/a8t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    sget-object p1, La/wne;->a:La/wne;

    .line 233
    .line 234
    if-ne p0, p1, :cond_d

    .line 235
    .line 236
    goto :goto_b

    .line 237
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    :goto_b
    return-object p0

    .line 240
    :pswitch_a
    check-cast v2, La/a8t;

    .line 241
    .line 242
    invoke-virtual {v2, p1, p2}, La/a8t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    sget-object p1, La/wne;->a:La/wne;

    .line 247
    .line 248
    if-ne p0, p1, :cond_e

    .line 249
    .line 250
    goto :goto_c

    .line 251
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    :goto_c
    return-object p0

    .line 254
    :pswitch_b
    check-cast v2, La/a8t;

    .line 255
    .line 256
    invoke-virtual {v2, p1, p2}, La/a8t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    sget-object p1, La/wne;->a:La/wne;

    .line 261
    .line 262
    if-ne p0, p1, :cond_f

    .line 263
    .line 264
    goto :goto_d

    .line 265
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_d
    return-object p0

    .line 268
    :pswitch_c
    check-cast v2, La/j0s;

    .line 269
    .line 270
    invoke-virtual {v2, p1, p2}, La/j0s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    sget-object p1, La/wne;->a:La/wne;

    .line 275
    .line 276
    if-ne p0, p1, :cond_10

    .line 277
    .line 278
    goto :goto_e

    .line 279
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_e
    return-object p0

    .line 282
    :pswitch_d
    check-cast v2, La/j0s;

    .line 283
    .line 284
    invoke-virtual {v2, p1, p2}, La/j0s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    sget-object p1, La/wne;->a:La/wne;

    .line 289
    .line 290
    if-ne p0, p1, :cond_11

    .line 291
    .line 292
    goto :goto_f

    .line 293
    :cond_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    :goto_f
    return-object p0

    .line 296
    :pswitch_e
    check-cast v2, La/pfl;

    .line 297
    .line 298
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    sget-object p1, La/wne;->a:La/wne;

    .line 303
    .line 304
    if-ne p0, p1, :cond_12

    .line 305
    .line 306
    goto :goto_10

    .line 307
    :cond_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    :goto_10
    return-object p0

    .line 310
    :pswitch_f
    check-cast v2, La/pfl;

    .line 311
    .line 312
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    sget-object p1, La/wne;->a:La/wne;

    .line 317
    .line 318
    if-ne p0, p1, :cond_13

    .line 319
    .line 320
    goto :goto_11

    .line 321
    :cond_13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    :goto_11
    return-object p0

    .line 324
    :pswitch_10
    check-cast v2, La/pfl;

    .line 325
    .line 326
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    sget-object p1, La/wne;->a:La/wne;

    .line 331
    .line 332
    if-ne p0, p1, :cond_14

    .line 333
    .line 334
    goto :goto_12

    .line 335
    :cond_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    :goto_12
    return-object p0

    .line 338
    :pswitch_11
    check-cast v2, La/gkr;

    .line 339
    .line 340
    invoke-virtual {v2, p1, p2}, La/gkr;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    sget-object p1, La/wne;->a:La/wne;

    .line 345
    .line 346
    if-ne p0, p1, :cond_15

    .line 347
    .line 348
    goto :goto_13

    .line 349
    :cond_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    :goto_13
    return-object p0

    .line 352
    :pswitch_12
    check-cast v2, La/j0s;

    .line 353
    .line 354
    invoke-virtual {v2, p1, p2}, La/j0s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    sget-object p1, La/wne;->a:La/wne;

    .line 359
    .line 360
    if-ne p0, p1, :cond_16

    .line 361
    .line 362
    goto :goto_14

    .line 363
    :cond_16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    :goto_14
    return-object p0

    .line 366
    :pswitch_13
    check-cast v2, La/pfl;

    .line 367
    .line 368
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    sget-object p1, La/wne;->a:La/wne;

    .line 373
    .line 374
    if-ne p0, p1, :cond_17

    .line 375
    .line 376
    goto :goto_15

    .line 377
    :cond_17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    :goto_15
    return-object p0

    .line 380
    :pswitch_14
    check-cast v2, La/pfl;

    .line 381
    .line 382
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    sget-object p1, La/wne;->a:La/wne;

    .line 387
    .line 388
    if-ne p0, p1, :cond_18

    .line 389
    .line 390
    goto :goto_16

    .line 391
    :cond_18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    :goto_16
    return-object p0

    .line 394
    :pswitch_15
    check-cast v2, La/pfl;

    .line 395
    .line 396
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    sget-object p1, La/wne;->a:La/wne;

    .line 401
    .line 402
    if-ne p0, p1, :cond_19

    .line 403
    .line 404
    goto :goto_17

    .line 405
    :cond_19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    :goto_17
    return-object p0

    .line 408
    :pswitch_16
    check-cast v2, La/pfl;

    .line 409
    .line 410
    invoke-virtual {v2, p1, p2}, La/pfl;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    sget-object p1, La/wne;->a:La/wne;

    .line 415
    .line 416
    if-ne p0, p1, :cond_1a

    .line 417
    .line 418
    goto :goto_18

    .line 419
    :cond_1a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    :goto_18
    return-object p0

    .line 422
    :pswitch_17
    check-cast p1, La/u5s;

    .line 423
    .line 424
    check-cast v2, La/nqs;

    .line 425
    .line 426
    instance-of p0, p1, La/l5s;

    .line 427
    .line 428
    if-eqz p0, :cond_1b

    .line 429
    .line 430
    invoke-virtual {v2}, La/nqs;->x()La/mqs;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    check-cast p1, La/l5s;

    .line 435
    .line 436
    iget-wide v4, p1, La/l5s;->a:J

    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    const/4 v8, 0x1

    .line 440
    const/4 v6, 0x0

    .line 441
    invoke-virtual/range {v3 .. v8}, La/mqs;->a(JZZZ)V

    .line 442
    .line 443
    .line 444
    goto :goto_19

    .line 445
    :cond_1b
    instance-of p0, p1, La/n5s;

    .line 446
    .line 447
    if-eqz p0, :cond_1c

    .line 448
    .line 449
    invoke-virtual {v2}, La/nqs;->x()La/mqs;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    check-cast p1, La/n5s;

    .line 454
    .line 455
    iget-wide v4, p1, La/n5s;->a:J

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const/4 v8, 0x0

    .line 459
    const/4 v6, 0x1

    .line 460
    invoke-virtual/range {v3 .. v8}, La/mqs;->a(JZZZ)V

    .line 461
    .line 462
    .line 463
    goto :goto_19

    .line 464
    :cond_1c
    instance-of p0, p1, La/q5s;

    .line 465
    .line 466
    if-eqz p0, :cond_1d

    .line 467
    .line 468
    invoke-virtual {v2}, La/nqs;->x()La/mqs;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    check-cast p1, La/q5s;

    .line 473
    .line 474
    iget-wide v4, p1, La/q5s;->a:J

    .line 475
    .line 476
    const/4 v7, 0x1

    .line 477
    const/4 v8, 0x0

    .line 478
    const/4 v6, 0x0

    .line 479
    invoke-virtual/range {v3 .. v8}, La/mqs;->a(JZZZ)V

    .line 480
    .line 481
    .line 482
    goto :goto_19

    .line 483
    :cond_1d
    instance-of p0, p1, La/r5s;

    .line 484
    .line 485
    if-eqz p0, :cond_1e

    .line 486
    .line 487
    invoke-virtual {v2}, La/nqs;->x()La/mqs;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    check-cast p1, La/r5s;

    .line 492
    .line 493
    iget-wide v4, p1, La/r5s;->a:J

    .line 494
    .line 495
    const/4 v7, 0x1

    .line 496
    const/4 v8, 0x0

    .line 497
    const/4 v6, 0x0

    .line 498
    invoke-virtual/range {v3 .. v8}, La/mqs;->a(JZZZ)V

    .line 499
    .line 500
    .line 501
    goto :goto_19

    .line 502
    :cond_1e
    instance-of p0, p1, La/s5s;

    .line 503
    .line 504
    if-eqz p0, :cond_1f

    .line 505
    .line 506
    invoke-virtual {v2}, La/nqs;->x()La/mqs;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    check-cast p1, La/s5s;

    .line 511
    .line 512
    iget-wide v4, p1, La/s5s;->a:J

    .line 513
    .line 514
    iget-boolean v6, p1, La/s5s;->b:Z

    .line 515
    .line 516
    const/4 v7, 0x0

    .line 517
    const/4 v8, 0x0

    .line 518
    invoke-virtual/range {v3 .. v8}, La/mqs;->a(JZZZ)V

    .line 519
    .line 520
    .line 521
    goto :goto_19

    .line 522
    :cond_1f
    sget-object p0, La/j5s;->a:La/j5s;

    .line 523
    .line 524
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result p0

    .line 528
    if-nez p0, :cond_21

    .line 529
    .line 530
    sget-object p0, La/p5s;->a:La/p5s;

    .line 531
    .line 532
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result p0

    .line 536
    if-eqz p0, :cond_20

    .line 537
    .line 538
    goto :goto_19

    .line 539
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 540
    .line 541
    .line 542
    goto :goto_1a

    .line 543
    :cond_21
    :goto_19
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    :goto_1a
    return-object v1

    .line 546
    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    .line 547
    .line 548
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 549
    .line 550
    .line 551
    move-result p1

    .line 552
    invoke-virtual {p0, p1, p2}, La/g7s;->b(ZLa/yje;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    return-object p0

    .line 557
    :pswitch_19
    check-cast v2, La/ens;

    .line 558
    .line 559
    invoke-virtual {v2, p1, p2}, La/ens;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    sget-object p1, La/wne;->a:La/wne;

    .line 564
    .line 565
    if-ne p0, p1, :cond_22

    .line 566
    .line 567
    goto :goto_1b

    .line 568
    :cond_22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    :goto_1b
    return-object p0

    .line 571
    :pswitch_1a
    check-cast v2, La/brk;

    .line 572
    .line 573
    invoke-virtual {v2, p1, p2}, La/brk;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    sget-object p1, La/wne;->a:La/wne;

    .line 578
    .line 579
    if-ne p0, p1, :cond_23

    .line 580
    .line 581
    goto :goto_1c

    .line 582
    :cond_23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    :goto_1c
    return-object p0

    .line 585
    :pswitch_1b
    check-cast v2, La/brk;

    .line 586
    .line 587
    invoke-virtual {v2, p1, p2}, La/brk;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    sget-object p1, La/wne;->a:La/wne;

    .line 592
    .line 593
    if-ne p0, p1, :cond_24

    .line 594
    .line 595
    goto :goto_1d

    .line 596
    :cond_24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    :goto_1d
    return-object p0

    .line 599
    :pswitch_1c
    check-cast v2, La/brk;

    .line 600
    .line 601
    invoke-virtual {v2, p1, p2}, La/brk;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object p0

    .line 605
    sget-object p1, La/wne;->a:La/wne;

    .line 606
    .line 607
    if-ne p0, p1, :cond_25

    .line 608
    .line 609
    goto :goto_1e

    .line 610
    :cond_25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    :goto_1e
    return-object p0

    .line 613
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

.method public b(ZLa/yje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/g7s;->b:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v5, v2

    .line 8
    check-cast v5, La/zns;

    .line 9
    .line 10
    iget-object v2, v5, La/i3t0;->f:La/oyg0;

    .line 11
    .line 12
    iget-object v3, v5, La/i3t0;->i:La/ocj;

    .line 13
    .line 14
    instance-of v4, v1, La/wns;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    move-object v4, v1

    .line 19
    check-cast v4, La/wns;

    .line 20
    .line 21
    iget v6, v4, La/wns;->k:I

    .line 22
    .line 23
    const/high16 v7, -0x80000000

    .line 24
    .line 25
    and-int v8, v6, v7

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v6, v7

    .line 30
    iput v6, v4, La/wns;->k:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v4, La/wns;

    .line 34
    .line 35
    invoke-direct {v4, v0, v1}, La/wns;-><init>(La/g7s;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, v4, La/wns;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object v1, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v6, v4, La/wns;->k:I

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v7, 0x1

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    if-ne v6, v7, :cond_1

    .line 49
    .line 50
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v11

    .line 60
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget v0, La/zns;->H:I

    .line 64
    .line 65
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-object v12, v6

    .line 75
    check-cast v12, La/qns;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const/16 v18, 0x0

    .line 81
    .line 82
    const/16 v19, 0x1fb

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    move/from16 v14, p1

    .line 91
    .line 92
    invoke-static/range {v12 .. v19}, La/qns;->a(La/qns;ZZZLorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/qns;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v0, v6, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_3

    .line 101
    .line 102
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, La/qns;

    .line 107
    .line 108
    iget-object v0, v0, La/qns;->h:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_4

    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    if-eqz p1, :cond_7

    .line 120
    .line 121
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 122
    .line 123
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-object v12, v3

    .line 131
    check-cast v12, La/qns;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const/16 v19, 0x1f7

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    invoke-static/range {v12 .. v19}, La/qns;->a(La/qns;ZZZLorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/qns;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-virtual {v0, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    iput v7, v4, La/wns;->k:I

    .line 158
    .line 159
    invoke-virtual {v5, v4}, La/zns;->U(La/zje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v1, :cond_6

    .line 164
    .line 165
    return-object v1

    .line 166
    :cond_6
    :goto_1
    sget v0, La/zns;->H:I

    .line 167
    .line 168
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    new-instance v13, La/h2s;

    .line 173
    .line 174
    const/4 v9, 0x0

    .line 175
    const/16 v10, 0x11

    .line 176
    .line 177
    const/4 v4, 0x1

    .line 178
    const-class v6, La/zns;

    .line 179
    .line 180
    const-string v7, "handleThrowable"

    .line 181
    .line 182
    const-string v8, "handleThrowable(Ljava/lang/Throwable;)V"

    .line 183
    .line 184
    move-object v3, v13

    .line 185
    invoke-direct/range {v3 .. v10}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 186
    .line 187
    .line 188
    iget-object v0, v5, La/zns;->D:La/mne;

    .line 189
    .line 190
    iget-object v15, v0, La/mne;->b:La/dvj;

    .line 191
    .line 192
    new-instance v14, La/jcs;

    .line 193
    .line 194
    const/4 v0, 0x4

    .line 195
    invoke-direct {v14, v5, v0}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 196
    .line 197
    .line 198
    new-instance v0, La/vns;

    .line 199
    .line 200
    const/4 v1, 0x0

    .line 201
    invoke-direct {v0, v5, v11, v1}, La/vns;-><init>(La/zns;La/yje;B)V

    .line 202
    .line 203
    .line 204
    const/16 v17, 0x8

    .line 205
    .line 206
    move-object/from16 v16, v0

    .line 207
    .line 208
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    iget-object v6, v3, La/ocj;->a:La/p7m0;

    .line 213
    .line 214
    :cond_8
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-object v7, v0

    .line 222
    check-cast v7, La/qns;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/16 v14, 0x1f7

    .line 229
    .line 230
    const/4 v8, 0x0

    .line 231
    const/4 v9, 0x0

    .line 232
    const/4 v10, 0x1

    .line 233
    const/4 v11, 0x0

    .line 234
    const/4 v12, 0x0

    .line 235
    invoke-static/range {v7 .. v14}, La/qns;->a(La/qns;ZZZLorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/qns;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v6, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_8

    .line 244
    .line 245
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0
.end method
