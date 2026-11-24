.class public final La/yeq;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zeq;


# direct methods
.method public synthetic constructor <init>(La/zeq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yeq;->a:B

    iput-object p1, p0, La/yeq;->b:La/zeq;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/yeq;->a:B

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-string v5, ""

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const-wide/16 v7, 0x3e8

    .line 13
    .line 14
    iget-object p0, p0, La/yeq;->b:La/zeq;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance v0, La/ihv0;

    .line 20
    .line 21
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 22
    .line 23
    const-string v1, "window_animation_scale"

    .line 24
    .line 25
    invoke-virtual {p0, v1}, La/eyg0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, La/ihv0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    new-instance v0, La/ims0;

    .line 34
    .line 35
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 36
    .line 37
    const-string v1, "transition_animation_scale"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, La/eyg0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, La/ims0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_1
    new-instance v0, La/ewr0;

    .line 48
    .line 49
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 50
    .line 51
    const-string v1, "touch_exploration_enabled"

    .line 52
    .line 53
    invoke-virtual {p0, v1}, La/eyg0;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v0, p0}, La/ewr0;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_2
    new-instance v0, La/ngr0;

    .line 62
    .line 63
    iget-object p0, p0, La/zeq;->b:La/zpu;

    .line 64
    .line 65
    new-instance v1, La/qq30;

    .line 66
    .line 67
    invoke-direct {v1, p0, v6}, La/qq30;-><init>(La/zpu;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 79
    .line 80
    instance-of v2, p0, La/g0g0;

    .line 81
    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    move-object p0, v1

    .line 85
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    invoke-direct {v0, v1, v2}, La/ngr0;-><init>(J)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_3
    new-instance v0, La/mgr0;

    .line 96
    .line 97
    iget-object p0, p0, La/zeq;->b:La/zpu;

    .line 98
    .line 99
    new-instance v1, La/qq30;

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    invoke-direct {v1, p0, v2}, La/qq30;-><init>(La/zpu;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 114
    .line 115
    instance-of v2, p0, La/g0g0;

    .line 116
    .line 117
    if-eqz v2, :cond_1

    .line 118
    .line 119
    move-object p0, v1

    .line 120
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v1

    .line 126
    invoke-direct {v0, v1, v2}, La/mgr0;-><init>(J)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_4
    new-instance v0, La/ogq0;

    .line 131
    .line 132
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 133
    .line 134
    const-string v1, "time_12_24"

    .line 135
    .line 136
    invoke-virtual {p0, v1}, La/eyg0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-direct {v0, p0}, La/ogq0;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_5
    new-instance v0, La/a3q0;

    .line 145
    .line 146
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 147
    .line 148
    const-string v1, "auto_replace"

    .line 149
    .line 150
    invoke-virtual {p0, v1}, La/eyg0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {v0, p0}, La/a3q0;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_6
    new-instance v0, La/z2q0;

    .line 159
    .line 160
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 161
    .line 162
    const-string v1, "auto_punctuate"

    .line 163
    .line 164
    invoke-virtual {p0, v1}, La/eyg0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-direct {v0, p0}, La/z2q0;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_7
    new-instance v0, La/z8o0;

    .line 173
    .line 174
    iget-object p0, p0, La/zeq;->j:La/iw20;

    .line 175
    .line 176
    new-instance v1, La/rg80;

    .line 177
    .line 178
    invoke-direct {v1, p0, v6}, La/rg80;-><init>(La/iw20;B)V

    .line 179
    .line 180
    .line 181
    const-wide/16 v2, 0xbb8

    .line 182
    .line 183
    invoke-static {v2, v3, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    sget-object v1, La/iun;->a:La/iun;

    .line 188
    .line 189
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 190
    .line 191
    instance-of v2, p0, La/g0g0;

    .line 192
    .line 193
    if-eqz v2, :cond_2

    .line 194
    .line 195
    move-object p0, v1

    .line 196
    :cond_2
    check-cast p0, Ljava/util/List;

    .line 197
    .line 198
    invoke-direct {v0, p0}, La/z8o0;-><init>(Ljava/util/List;)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_8
    new-instance v0, La/ofi0;

    .line 203
    .line 204
    iget-object p0, p0, La/zeq;->c:La/eyg0;

    .line 205
    .line 206
    new-instance v1, La/sz2;

    .line 207
    .line 208
    const/16 v2, 0x14

    .line 209
    .line 210
    invoke-direct {v1, p0, v2}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    sget-object v1, La/iun;->a:La/iun;

    .line 218
    .line 219
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 220
    .line 221
    instance-of v2, p0, La/g0g0;

    .line 222
    .line 223
    if-eqz v2, :cond_3

    .line 224
    .line 225
    move-object p0, v1

    .line 226
    :cond_3
    check-cast p0, Ljava/util/List;

    .line 227
    .line 228
    invoke-direct {v0, p0}, La/ofi0;-><init>(Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_9
    new-instance v0, La/s7h0;

    .line 233
    .line 234
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 235
    .line 236
    const-string v1, "screen_off_timeout"

    .line 237
    .line 238
    invoke-virtual {p0, v1}, La/eyg0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-direct {v0, p0}, La/s7h0;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_a
    new-instance v0, La/vkg0;

    .line 247
    .line 248
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 249
    .line 250
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 251
    .line 252
    const/16 v2, 0x1c

    .line 253
    .line 254
    if-lt v1, v2, :cond_4

    .line 255
    .line 256
    const-string v1, "rtt_calling_mode"

    .line 257
    .line 258
    invoke-virtual {p0, v1}, La/eyg0;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    :cond_4
    invoke-direct {v0, v5}, La/vkg0;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_b
    new-instance v0, La/gcg0;

    .line 267
    .line 268
    iget-object p0, p0, La/zeq;->l:La/nr;

    .line 269
    .line 270
    new-instance v1, La/fhk;

    .line 271
    .line 272
    const/4 v2, 0x2

    .line 273
    invoke-direct {v1, p0, v2}, La/fhk;-><init>(La/nr;B)V

    .line 274
    .line 275
    .line 276
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 281
    .line 282
    instance-of v1, p0, La/g0g0;

    .line 283
    .line 284
    if-eqz v1, :cond_5

    .line 285
    .line 286
    goto :goto_0

    .line 287
    :cond_5
    move-object v5, p0

    .line 288
    :goto_0
    check-cast v5, Ljava/lang/String;

    .line 289
    .line 290
    invoke-direct {v0, v5}, La/gcg0;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_c
    new-instance v0, La/pse0;

    .line 295
    .line 296
    iget-object p0, p0, La/zeq;->l:La/nr;

    .line 297
    .line 298
    new-instance v1, La/fhk;

    .line 299
    .line 300
    invoke-direct {v1, p0, v6}, La/fhk;-><init>(La/nr;B)V

    .line 301
    .line 302
    .line 303
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 308
    .line 309
    instance-of v1, p0, La/g0g0;

    .line 310
    .line 311
    if-eqz v1, :cond_6

    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_6
    move-object v5, p0

    .line 315
    :goto_1
    check-cast v5, Ljava/lang/String;

    .line 316
    .line 317
    invoke-direct {v0, v5}, La/pse0;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_d
    new-instance v0, La/kyb0;

    .line 322
    .line 323
    iget-object p0, p0, La/zeq;->a:La/kud;

    .line 324
    .line 325
    new-instance v1, La/vut0;

    .line 326
    .line 327
    invoke-direct {v1, p0, v2}, La/vut0;-><init>(Ljava/lang/Object;B)V

    .line 328
    .line 329
    .line 330
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    sget-object v1, La/v7f;->c:La/v7f;

    .line 335
    .line 336
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 337
    .line 338
    instance-of v2, p0, La/g0g0;

    .line 339
    .line 340
    if-eqz v2, :cond_7

    .line 341
    .line 342
    move-object p0, v1

    .line 343
    :cond_7
    check-cast p0, La/v7f;

    .line 344
    .line 345
    invoke-direct {v0, p0}, La/kyb0;-><init>(La/v7f;)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_e
    new-instance v0, La/jyb0;

    .line 350
    .line 351
    iget-object p0, p0, La/zeq;->a:La/kud;

    .line 352
    .line 353
    new-instance v1, La/vut0;

    .line 354
    .line 355
    const/16 v2, 0x9

    .line 356
    .line 357
    invoke-direct {v1, p0, v2}, La/vut0;-><init>(Ljava/lang/Object;B)V

    .line 358
    .line 359
    .line 360
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    sget-object v1, La/lun;->a:La/lun;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 370
    .line 371
    instance-of v2, p0, La/g0g0;

    .line 372
    .line 373
    if-eqz v2, :cond_8

    .line 374
    .line 375
    move-object p0, v1

    .line 376
    :cond_8
    check-cast p0, Ljava/util/Map;

    .line 377
    .line 378
    invoke-direct {v0, p0}, La/jyb0;-><init>(Ljava/util/Map;)V

    .line 379
    .line 380
    .line 381
    return-object v0

    .line 382
    :pswitch_f
    new-instance v0, La/mqx;

    .line 383
    .line 384
    iget-object p0, p0, La/zeq;->i:La/jtj;

    .line 385
    .line 386
    new-instance v1, La/nhk;

    .line 387
    .line 388
    invoke-direct {v1, p0, v6}, La/nhk;-><init>(La/jtj;B)V

    .line 389
    .line 390
    .line 391
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 396
    .line 397
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 398
    .line 399
    instance-of v2, p0, La/g0g0;

    .line 400
    .line 401
    if-eqz v2, :cond_9

    .line 402
    .line 403
    move-object p0, v1

    .line 404
    :cond_9
    check-cast p0, Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    invoke-direct {v0, p0}, La/mqx;-><init>(Z)V

    .line 411
    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_10
    new-instance v0, La/rex;

    .line 415
    .line 416
    iget-object p0, p0, La/zeq;->d:La/svu;

    .line 417
    .line 418
    new-instance v2, La/sz2;

    .line 419
    .line 420
    invoke-direct {v2, p0, v1}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 421
    .line 422
    .line 423
    invoke-static {v7, v8, v2}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    sget-object v1, La/iun;->a:La/iun;

    .line 428
    .line 429
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 430
    .line 431
    instance-of v2, p0, La/g0g0;

    .line 432
    .line 433
    if-eqz v2, :cond_a

    .line 434
    .line 435
    move-object p0, v1

    .line 436
    :cond_a
    check-cast p0, Ljava/util/List;

    .line 437
    .line 438
    invoke-direct {v0, p0}, La/rex;-><init>(Ljava/util/List;)V

    .line 439
    .line 440
    .line 441
    return-object v0

    .line 442
    :pswitch_11
    new-instance v0, La/qex;

    .line 443
    .line 444
    iget-object p0, p0, La/zeq;->d:La/svu;

    .line 445
    .line 446
    new-instance v2, La/sz2;

    .line 447
    .line 448
    invoke-direct {v2, p0, v1}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 449
    .line 450
    .line 451
    invoke-static {v7, v8, v2}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    sget-object v1, La/iun;->a:La/iun;

    .line 456
    .line 457
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 458
    .line 459
    instance-of v2, p0, La/g0g0;

    .line 460
    .line 461
    if-eqz v2, :cond_b

    .line 462
    .line 463
    move-object p0, v1

    .line 464
    :cond_b
    check-cast p0, Ljava/util/List;

    .line 465
    .line 466
    invoke-direct {v0, p0}, La/qex;-><init>(Ljava/util/List;)V

    .line 467
    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_12
    new-instance v0, La/stw;

    .line 471
    .line 472
    iget-object p0, p0, La/zeq;->k:La/eyg0;

    .line 473
    .line 474
    const-string v1, "http_proxy"

    .line 475
    .line 476
    invoke-virtual {p0, v1}, La/eyg0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-direct {v0, p0}, La/stw;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_13
    new-instance v0, La/q7v;

    .line 485
    .line 486
    iget-object p0, p0, La/zeq;->g:La/hnu;

    .line 487
    .line 488
    new-instance v1, La/sz2;

    .line 489
    .line 490
    invoke-direct {v1, p0, v2}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 491
    .line 492
    .line 493
    invoke-static {v7, v8, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 498
    .line 499
    instance-of v1, p0, La/g0g0;

    .line 500
    .line 501
    if-eqz v1, :cond_c

    .line 502
    .line 503
    goto :goto_2

    .line 504
    :cond_c
    move-object v5, p0

    .line 505
    :goto_2
    check-cast v5, Ljava/lang/String;

    .line 506
    .line 507
    invoke-direct {v0, v5}, La/q7v;-><init>(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return-object v0

    .line 511
    :pswitch_14
    iget-object p0, p0, La/zeq;->v:La/n0o0;

    .line 512
    .line 513
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    check-cast p0, La/rex;

    .line 518
    .line 519
    return-object p0

    .line 520
    :pswitch_15
    iget-object p0, p0, La/zeq;->u:La/n0o0;

    .line 521
    .line 522
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    check-cast p0, La/qex;

    .line 527
    .line 528
    return-object p0

    .line 529
    :pswitch_16
    iget-object p0, p0, La/zeq;->t:La/n0o0;

    .line 530
    .line 531
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    check-cast p0, La/ofi0;

    .line 536
    .line 537
    return-object p0

    .line 538
    :pswitch_17
    iget-object p0, p0, La/zeq;->s:La/n0o0;

    .line 539
    .line 540
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    check-cast p0, La/kyb0;

    .line 545
    .line 546
    return-object p0

    .line 547
    :pswitch_18
    iget-object p0, p0, La/zeq;->r:La/n0o0;

    .line 548
    .line 549
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    check-cast p0, La/jyb0;

    .line 554
    .line 555
    return-object p0

    .line 556
    :pswitch_19
    iget-object p0, p0, La/zeq;->k0:La/n0o0;

    .line 557
    .line 558
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    check-cast p0, La/eoq0;

    .line 563
    .line 564
    return-object p0

    .line 565
    :pswitch_1a
    iget-object p0, p0, La/zeq;->q:La/n0o0;

    .line 566
    .line 567
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    check-cast p0, La/mgr0;

    .line 572
    .line 573
    return-object p0

    .line 574
    nop

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
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
