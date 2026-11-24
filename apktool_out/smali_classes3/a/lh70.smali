.class public final La/lh70;
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
    iput-byte p2, p0, La/lh70;->a:B

    iput-object p1, p0, La/lh70;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lh70;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/lh70;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/wh80;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lh70;->b(La/wh80;La/yje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast v1, La/hi70;

    .line 16
    .line 17
    invoke-virtual {v1, p1, p2}, La/hi70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, La/wne;->a:La/wne;

    .line 22
    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    :goto_0
    return-object p0

    .line 29
    :pswitch_1
    check-cast v1, La/hi70;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, La/hi70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/wne;->a:La/wne;

    .line 36
    .line 37
    if-ne p0, p1, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    :goto_1
    return-object p0

    .line 43
    :pswitch_2
    check-cast v1, La/hi70;

    .line 44
    .line 45
    invoke-virtual {v1, p1, p2}, La/hi70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object p1, La/wne;->a:La/wne;

    .line 50
    .line 51
    if-ne p0, p1, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_2
    return-object p0

    .line 57
    :pswitch_3
    check-cast v1, La/hi70;

    .line 58
    .line 59
    invoke-virtual {v1, p1, p2}, La/hi70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object p1, La/wne;->a:La/wne;

    .line 64
    .line 65
    if-ne p0, p1, :cond_3

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_3
    return-object p0

    .line 71
    :pswitch_4
    check-cast v1, La/gq50;

    .line 72
    .line 73
    invoke-virtual {v1, p1, p2}, La/gq50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    sget-object p1, La/wne;->a:La/wne;

    .line 78
    .line 79
    if-ne p0, p1, :cond_4

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_4
    return-object p0

    .line 85
    :pswitch_5
    check-cast p1, La/fr70;

    .line 86
    .line 87
    check-cast v1, La/rt70;

    .line 88
    .line 89
    iget-object p0, v1, La/rt70;->s:La/wri0;

    .line 90
    .line 91
    if-eqz p1, :cond_a

    .line 92
    .line 93
    instance-of p2, p1, La/cr70;

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_5
    instance-of p2, p1, La/zq70;

    .line 99
    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    instance-of p2, p1, La/br70;

    .line 104
    .line 105
    if-eqz p2, :cond_7

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_7
    instance-of p2, p1, La/er70;

    .line 109
    .line 110
    if-eqz p2, :cond_8

    .line 111
    .line 112
    :goto_5
    const/4 p1, 0x0

    .line 113
    invoke-virtual {p0, p1}, La/wri0;->a(Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_8
    instance-of p2, p1, La/ar70;

    .line 118
    .line 119
    if-eqz p2, :cond_9

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_9
    instance-of p1, p1, La/dr70;

    .line 123
    .line 124
    if-eqz p1, :cond_a

    .line 125
    .line 126
    :goto_6
    const/4 p1, 0x1

    .line 127
    invoke-virtual {p0, p1}, La/wri0;->a(Z)V

    .line 128
    .line 129
    .line 130
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    const/4 p0, 0x0

    .line 137
    :goto_8
    return-object p0

    .line 138
    :pswitch_6
    check-cast v1, La/gq50;

    .line 139
    .line 140
    invoke-virtual {v1, p1, p2}, La/gq50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object p1, La/wne;->a:La/wne;

    .line 145
    .line 146
    if-ne p0, p1, :cond_b

    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    :goto_9
    return-object p0

    .line 152
    :pswitch_7
    check-cast v1, La/gq50;

    .line 153
    .line 154
    invoke-virtual {v1, p1, p2}, La/gq50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    sget-object p1, La/wne;->a:La/wne;

    .line 159
    .line 160
    if-ne p0, p1, :cond_c

    .line 161
    .line 162
    goto :goto_a

    .line 163
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_a
    return-object p0

    .line 166
    :pswitch_8
    check-cast v1, La/gq50;

    .line 167
    .line 168
    invoke-virtual {v1, p1, p2}, La/gq50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    sget-object p1, La/wne;->a:La/wne;

    .line 173
    .line 174
    if-ne p0, p1, :cond_d

    .line 175
    .line 176
    goto :goto_b

    .line 177
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_b
    return-object p0

    .line 180
    :pswitch_9
    check-cast v1, La/an70;

    .line 181
    .line 182
    invoke-virtual {v1, p1, p2}, La/an70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    sget-object p1, La/wne;->a:La/wne;

    .line 187
    .line 188
    if-ne p0, p1, :cond_e

    .line 189
    .line 190
    goto :goto_c

    .line 191
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    :goto_c
    return-object p0

    .line 194
    :pswitch_a
    check-cast v1, La/an70;

    .line 195
    .line 196
    invoke-virtual {v1, p1, p2}, La/an70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    sget-object p1, La/wne;->a:La/wne;

    .line 201
    .line 202
    if-ne p0, p1, :cond_f

    .line 203
    .line 204
    goto :goto_d

    .line 205
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_d
    return-object p0

    .line 208
    :pswitch_b
    check-cast v1, La/an70;

    .line 209
    .line 210
    invoke-virtual {v1, p1, p2}, La/an70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    sget-object p1, La/wne;->a:La/wne;

    .line 215
    .line 216
    if-ne p0, p1, :cond_10

    .line 217
    .line 218
    goto :goto_e

    .line 219
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    :goto_e
    return-object p0

    .line 222
    :pswitch_c
    check-cast v1, La/an70;

    .line 223
    .line 224
    invoke-virtual {v1, p1, p2}, La/an70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    sget-object p1, La/wne;->a:La/wne;

    .line 229
    .line 230
    if-ne p0, p1, :cond_11

    .line 231
    .line 232
    goto :goto_f

    .line 233
    :cond_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    :goto_f
    return-object p0

    .line 236
    :pswitch_d
    check-cast v1, La/an70;

    .line 237
    .line 238
    invoke-virtual {v1, p1, p2}, La/an70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    sget-object p1, La/wne;->a:La/wne;

    .line 243
    .line 244
    if-ne p0, p1, :cond_12

    .line 245
    .line 246
    goto :goto_10

    .line 247
    :cond_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    :goto_10
    return-object p0

    .line 250
    :pswitch_e
    check-cast v1, La/an70;

    .line 251
    .line 252
    invoke-virtual {v1, p1, p2}, La/an70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    sget-object p1, La/wne;->a:La/wne;

    .line 257
    .line 258
    if-ne p0, p1, :cond_13

    .line 259
    .line 260
    goto :goto_11

    .line 261
    :cond_13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_11
    return-object p0

    .line 264
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    check-cast v1, La/nm70;

    .line 271
    .line 272
    new-instance p1, La/am70;

    .line 273
    .line 274
    invoke-direct {p1, p0}, La/am70;-><init>(Z)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, p1}, La/nm70;->B(La/im70;)V

    .line 278
    .line 279
    .line 280
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object p0

    .line 283
    :pswitch_10
    check-cast v1, La/tl70;

    .line 284
    .line 285
    invoke-virtual {v1, p1, p2}, La/tl70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    sget-object p1, La/wne;->a:La/wne;

    .line 290
    .line 291
    if-ne p0, p1, :cond_14

    .line 292
    .line 293
    goto :goto_12

    .line 294
    :cond_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    :goto_12
    return-object p0

    .line 297
    :pswitch_11
    check-cast v1, La/tl70;

    .line 298
    .line 299
    invoke-virtual {v1, p1, p2}, La/tl70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    sget-object p1, La/wne;->a:La/wne;

    .line 304
    .line 305
    if-ne p0, p1, :cond_15

    .line 306
    .line 307
    goto :goto_13

    .line 308
    :cond_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    :goto_13
    return-object p0

    .line 311
    :pswitch_12
    check-cast v1, La/nf60;

    .line 312
    .line 313
    invoke-virtual {v1, p1, p2}, La/nf60;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    sget-object p1, La/wne;->a:La/wne;

    .line 318
    .line 319
    if-ne p0, p1, :cond_16

    .line 320
    .line 321
    goto :goto_14

    .line 322
    :cond_16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    :goto_14
    return-object p0

    .line 325
    :pswitch_13
    check-cast v1, La/nk70;

    .line 326
    .line 327
    invoke-virtual {v1, p1, p2}, La/nk70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    sget-object p1, La/wne;->a:La/wne;

    .line 332
    .line 333
    if-ne p0, p1, :cond_17

    .line 334
    .line 335
    goto :goto_15

    .line 336
    :cond_17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    :goto_15
    return-object p0

    .line 339
    :pswitch_14
    check-cast v1, La/nk70;

    .line 340
    .line 341
    invoke-virtual {v1, p1, p2}, La/nk70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    sget-object p1, La/wne;->a:La/wne;

    .line 346
    .line 347
    if-ne p0, p1, :cond_18

    .line 348
    .line 349
    goto :goto_16

    .line 350
    :cond_18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    :goto_16
    return-object p0

    .line 353
    :pswitch_15
    check-cast v1, La/xj70;

    .line 354
    .line 355
    invoke-virtual {v1, p1, p2}, La/xj70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    sget-object p1, La/wne;->a:La/wne;

    .line 360
    .line 361
    if-ne p0, p1, :cond_19

    .line 362
    .line 363
    goto :goto_17

    .line 364
    :cond_19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    :goto_17
    return-object p0

    .line 367
    :pswitch_16
    check-cast v1, La/xj70;

    .line 368
    .line 369
    invoke-virtual {v1, p1, p2}, La/xj70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    sget-object p1, La/wne;->a:La/wne;

    .line 374
    .line 375
    if-ne p0, p1, :cond_1a

    .line 376
    .line 377
    goto :goto_18

    .line 378
    :cond_1a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    :goto_18
    return-object p0

    .line 381
    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result p0

    .line 387
    check-cast v1, La/tj70;

    .line 388
    .line 389
    new-instance p1, La/gj70;

    .line 390
    .line 391
    invoke-direct {p1, p0}, La/gj70;-><init>(Z)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, p1}, La/tj70;->A(La/oj70;)V

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_18
    check-cast v1, La/zi70;

    .line 401
    .line 402
    invoke-virtual {v1, p1, p2}, La/zi70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    sget-object p1, La/wne;->a:La/wne;

    .line 407
    .line 408
    if-ne p0, p1, :cond_1b

    .line 409
    .line 410
    goto :goto_19

    .line 411
    :cond_1b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    :goto_19
    return-object p0

    .line 414
    :pswitch_19
    check-cast v1, La/zi70;

    .line 415
    .line 416
    invoke-virtual {v1, p1, p2}, La/zi70;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    sget-object p1, La/wne;->a:La/wne;

    .line 421
    .line 422
    if-ne p0, p1, :cond_1c

    .line 423
    .line 424
    goto :goto_1a

    .line 425
    :cond_1c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    :goto_1a
    return-object p0

    .line 428
    :pswitch_1a
    check-cast v1, La/nf60;

    .line 429
    .line 430
    invoke-virtual {v1, p1, p2}, La/nf60;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    sget-object p1, La/wne;->a:La/wne;

    .line 435
    .line 436
    if-ne p0, p1, :cond_1d

    .line 437
    .line 438
    goto :goto_1b

    .line 439
    :cond_1d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    :goto_1b
    return-object p0

    .line 442
    :pswitch_1b
    check-cast v1, La/nf60;

    .line 443
    .line 444
    invoke-virtual {v1, p1, p2}, La/nf60;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    sget-object p1, La/wne;->a:La/wne;

    .line 449
    .line 450
    if-ne p0, p1, :cond_1e

    .line 451
    .line 452
    goto :goto_1c

    .line 453
    :cond_1e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    :goto_1c
    return-object p0

    .line 456
    :pswitch_1c
    check-cast v1, La/nf60;

    .line 457
    .line 458
    invoke-virtual {v1, p1, p2}, La/nf60;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    sget-object p1, La/wne;->a:La/wne;

    .line 463
    .line 464
    if-ne p0, p1, :cond_1f

    .line 465
    .line 466
    goto :goto_1d

    .line 467
    :cond_1f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 468
    .line 469
    :goto_1d
    return-object p0

    .line 470
    nop

    .line 471
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

.method public b(La/wh80;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/li80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/li80;

    .line 7
    .line 8
    iget v1, v0, La/li80;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/li80;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/li80;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/li80;-><init>(La/lh70;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/li80;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/li80;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/gvc; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    iget-object p0, p0, La/lh70;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/yyj0;

    .line 53
    .line 54
    iput v3, v0, La/li80;->k:I

    .line 55
    .line 56
    iget-object p0, p0, La/yyj0;->b:La/q99;

    .line 57
    .line 58
    invoke-interface {p0, v0, p1}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_1
    .catch La/gvc; {:try_start_1 .. :try_end_1} :catch_0

    .line 62
    if-ne p0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
