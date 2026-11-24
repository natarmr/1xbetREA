.class public final La/z7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/p6t0;


# direct methods
.method public constructor <init>(La/p6t0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iput-byte v0, p0, La/z7;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/z7;->c:La/p6t0;

    .line 9
    .line 10
    iput-object p2, p0, La/z7;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/z7;->a:B

    iput-object p1, p0, La/z7;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/z7;->c:La/p6t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/z7;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/z7;->c:La/p6t0;

    .line 4
    .line 5
    iget-object p0, p0, La/z7;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/iu30;

    .line 11
    .line 12
    check-cast v1, La/pqv;

    .line 13
    .line 14
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    new-instance v0, La/iu30;

    .line 28
    .line 29
    check-cast v1, La/pqv;

    .line 30
    .line 31
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    new-instance v0, La/ufl0;

    .line 45
    .line 46
    check-cast v1, La/gpp;

    .line 47
    .line 48
    iget-wide v1, v1, La/gpp;->a:J

    .line 49
    .line 50
    invoke-direct {v0, v1, v2}, La/ufl0;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_2
    new-instance v0, La/agl0;

    .line 60
    .line 61
    check-cast v1, La/gpp;

    .line 62
    .line 63
    iget-wide v1, v1, La/gpp;->a:J

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, La/agl0;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_3
    new-instance v0, La/ufl0;

    .line 75
    .line 76
    check-cast v1, La/gpp;

    .line 77
    .line 78
    iget-wide v1, v1, La/gpp;->a:J

    .line 79
    .line 80
    invoke-direct {v0, v1, v2}, La/ufl0;-><init>(J)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_4
    new-instance v0, La/agl0;

    .line 90
    .line 91
    check-cast v1, La/gpp;

    .line 92
    .line 93
    iget-wide v1, v1, La/gpp;->a:J

    .line 94
    .line 95
    invoke-direct {v0, v1, v2}, La/agl0;-><init>(J)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_5
    new-instance v0, La/ufl0;

    .line 105
    .line 106
    check-cast v1, La/gpp;

    .line 107
    .line 108
    iget-wide v1, v1, La/gpp;->a:J

    .line 109
    .line 110
    invoke-direct {v0, v1, v2}, La/ufl0;-><init>(J)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_6
    new-instance v0, La/agl0;

    .line 120
    .line 121
    check-cast v1, La/gpp;

    .line 122
    .line 123
    iget-wide v1, v1, La/gpp;->a:J

    .line 124
    .line 125
    invoke-direct {v0, v1, v2}, La/agl0;-><init>(J)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_7
    new-instance v0, La/ufl0;

    .line 135
    .line 136
    check-cast v1, La/gpp;

    .line 137
    .line 138
    iget-wide v1, v1, La/gpp;->a:J

    .line 139
    .line 140
    invoke-direct {v0, v1, v2}, La/ufl0;-><init>(J)V

    .line 141
    .line 142
    .line 143
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_8
    new-instance v0, La/agl0;

    .line 150
    .line 151
    check-cast v1, La/gpp;

    .line 152
    .line 153
    iget-wide v1, v1, La/gpp;->a:J

    .line 154
    .line 155
    invoke-direct {v0, v1, v2}, La/agl0;-><init>(J)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_9
    new-instance v0, La/bzh0;

    .line 165
    .line 166
    check-cast v1, La/ua5;

    .line 167
    .line 168
    iget-object v1, v1, La/ua5;->a:Ljava/lang/String;

    .line 169
    .line 170
    invoke-direct {v0, v1}, La/bzh0;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_a
    new-instance v0, La/woc0;

    .line 180
    .line 181
    check-cast v1, La/ssc0;

    .line 182
    .line 183
    invoke-direct {v0, v1}, La/woc0;-><init>(La/ssc0;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_b
    new-instance v0, La/iu30;

    .line 193
    .line 194
    check-cast v1, La/pqv;

    .line 195
    .line 196
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 201
    .line 202
    .line 203
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_c
    new-instance v0, La/db80;

    .line 210
    .line 211
    check-cast v1, La/rc80;

    .line 212
    .line 213
    iget-object v1, v1, La/rc80;->b:La/qc80;

    .line 214
    .line 215
    invoke-direct {v0, v1}, La/db80;-><init>(La/qc80;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_d
    new-instance v0, La/dy50;

    .line 225
    .line 226
    check-cast v1, La/a460;

    .line 227
    .line 228
    iget-object v1, v1, La/a460;->b:La/j460;

    .line 229
    .line 230
    invoke-direct {v0, v1}, La/dy50;-><init>(La/j460;)V

    .line 231
    .line 232
    .line 233
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_e
    new-instance v0, La/aqo;

    .line 240
    .line 241
    check-cast v1, La/hia;

    .line 242
    .line 243
    iget-wide v1, v1, La/hia;->a:J

    .line 244
    .line 245
    invoke-direct {v0, v1, v2}, La/aqo;-><init>(J)V

    .line 246
    .line 247
    .line 248
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_f
    new-instance v0, La/wpo;

    .line 255
    .line 256
    check-cast v1, La/hia;

    .line 257
    .line 258
    iget-wide v1, v1, La/hia;->a:J

    .line 259
    .line 260
    invoke-direct {v0, v1, v2}, La/wpo;-><init>(J)V

    .line 261
    .line 262
    .line 263
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_10
    new-instance v0, La/zpo;

    .line 270
    .line 271
    check-cast v1, La/fja;

    .line 272
    .line 273
    iget-object v1, v1, La/fja;->b:La/qhj;

    .line 274
    .line 275
    invoke-direct {v0, v1}, La/zpo;-><init>(La/qhj;)V

    .line 276
    .line 277
    .line 278
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_11
    new-instance v0, La/ypo;

    .line 285
    .line 286
    check-cast v1, La/tmo;

    .line 287
    .line 288
    iget-wide v1, v1, La/tmo;->a:J

    .line 289
    .line 290
    invoke-direct {v0, v1, v2}, La/ypo;-><init>(J)V

    .line 291
    .line 292
    .line 293
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_12
    check-cast v1, La/urk;

    .line 300
    .line 301
    iget-object v0, v1, La/urk;->a:Ljava/lang/String;

    .line 302
    .line 303
    const-string v1, "LIVE_GAMES"

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_0

    .line 310
    .line 311
    const-string v0, "HEADER_LIVE_GAMES"

    .line 312
    .line 313
    goto :goto_0

    .line 314
    :cond_0
    const-string v1, "LINE_GAMES"

    .line 315
    .line 316
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_1

    .line 321
    .line 322
    const-string v0, "HEADER_LINE_GAMES"

    .line 323
    .line 324
    goto :goto_0

    .line 325
    :cond_1
    const-string v0, ""

    .line 326
    .line 327
    :goto_0
    new-instance v1, La/yok;

    .line 328
    .line 329
    invoke-direct {v1, v0}, La/yok;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_13
    new-instance v0, La/yok;

    .line 339
    .line 340
    check-cast v1, La/nuj;

    .line 341
    .line 342
    iget-object v1, v1, La/nuj;->a:Ljava/lang/String;

    .line 343
    .line 344
    invoke-direct {v0, v1}, La/yok;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_14
    new-instance v0, La/uh2;

    .line 354
    .line 355
    check-cast v1, La/vnp0;

    .line 356
    .line 357
    iget-wide v2, v1, La/vnp0;->a:J

    .line 358
    .line 359
    iget-boolean v1, v1, La/vnp0;->c:Z

    .line 360
    .line 361
    invoke-direct {v0, v1, v2, v3}, La/uh2;-><init>(ZJ)V

    .line 362
    .line 363
    .line 364
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    return-object p0

    .line 370
    :pswitch_15
    check-cast v1, La/sbs0;

    .line 371
    .line 372
    iget-object v0, v1, La/sbs0;->a:La/qbs0;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    new-instance v1, La/tk2;

    .line 378
    .line 379
    invoke-direct {v1, v0}, La/tk2;-><init>(La/qbs0;)V

    .line 380
    .line 381
    .line 382
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object p0

    .line 388
    :pswitch_16
    check-cast v1, La/sbs0;

    .line 389
    .line 390
    iget-object v0, v1, La/sbs0;->a:La/qbs0;

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    new-instance v1, La/mk2;

    .line 396
    .line 397
    invoke-direct {v1, v0}, La/mk2;-><init>(La/qbs0;)V

    .line 398
    .line 399
    .line 400
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    return-object p0

    .line 406
    :pswitch_17
    check-cast v1, La/sbs0;

    .line 407
    .line 408
    iget-object v0, v1, La/sbs0;->a:La/qbs0;

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    new-instance v1, La/nk2;

    .line 414
    .line 415
    invoke-direct {v1, v0}, La/nk2;-><init>(La/qbs0;)V

    .line 416
    .line 417
    .line 418
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object p0

    .line 424
    :pswitch_18
    new-instance v0, La/cj2;

    .line 425
    .line 426
    check-cast v1, La/o8s0;

    .line 427
    .line 428
    iget-wide v2, v1, La/o8s0;->a:J

    .line 429
    .line 430
    iget-boolean v1, v1, La/o8s0;->c:Z

    .line 431
    .line 432
    invoke-direct {v0, v1, v2, v3}, La/cj2;-><init>(ZJ)V

    .line 433
    .line 434
    .line 435
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object p0

    .line 441
    :pswitch_19
    new-instance v0, La/cj2;

    .line 442
    .line 443
    check-cast v1, La/o8s0;

    .line 444
    .line 445
    iget-wide v2, v1, La/o8s0;->a:J

    .line 446
    .line 447
    iget-boolean v1, v1, La/o8s0;->c:Z

    .line 448
    .line 449
    invoke-direct {v0, v1, v2, v3}, La/cj2;-><init>(ZJ)V

    .line 450
    .line 451
    .line 452
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object p0

    .line 458
    :pswitch_1a
    new-instance v0, La/uh2;

    .line 459
    .line 460
    check-cast v1, La/vnp0;

    .line 461
    .line 462
    iget-wide v2, v1, La/vnp0;->a:J

    .line 463
    .line 464
    iget-boolean v1, v1, La/vnp0;->c:Z

    .line 465
    .line 466
    invoke-direct {v0, v1, v2, v3}, La/uh2;-><init>(ZJ)V

    .line 467
    .line 468
    .line 469
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object p0

    .line 475
    :pswitch_1b
    new-instance v0, La/iu30;

    .line 476
    .line 477
    check-cast v1, La/pqv;

    .line 478
    .line 479
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 484
    .line 485
    .line 486
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    return-object p0

    .line 492
    :pswitch_1c
    new-instance v0, La/iu30;

    .line 493
    .line 494
    check-cast v1, La/pqv;

    .line 495
    .line 496
    invoke-interface {v1}, La/pqv;->n()La/r040;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    invoke-direct {v0, v1}, La/iu30;-><init>(La/r040;)V

    .line 501
    .line 502
    .line 503
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    return-object p0

    .line 509
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
