.class public final synthetic La/eka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eka;->a:B

    iput-object p1, p0, La/eka;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/eka;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, La/eka;->b:La/l7m0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/kmh;

    .line 18
    .line 19
    iget-object p0, p0, La/kmh;->a:La/imm;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/k7h;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of v0, p0, La/pss;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    check-cast p0, La/pss;

    .line 38
    .line 39
    iget-object v2, p0, La/pss;->a:La/l7m0;

    .line 40
    .line 41
    :cond_0
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, La/a4x;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/p6t0;

    .line 73
    .line 74
    instance-of v0, v0, La/s0h;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    move v3, v4

    .line 79
    :cond_3
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    instance-of v0, p0, La/pss;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    check-cast p0, La/pss;

    .line 93
    .line 94
    iget-object p0, p0, La/pss;->a:La/l7m0;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    move-object p0, v2

    .line 98
    :goto_1
    if-eqz p0, :cond_5

    .line 99
    .line 100
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    move-object v2, p0

    .line 105
    check-cast v2, La/a4x;

    .line 106
    .line 107
    :cond_5
    if-eqz v2, :cond_8

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eqz p0, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/p6t0;

    .line 131
    .line 132
    instance-of v0, v0, La/kxs;

    .line 133
    .line 134
    if-nez v0, :cond_7

    .line 135
    .line 136
    move v3, v4

    .line 137
    :cond_8
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    instance-of v0, v0, La/nss;

    .line 147
    .line 148
    if-nez v0, :cond_9

    .line 149
    .line 150
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    instance-of p0, p0, La/lss;

    .line 155
    .line 156
    if-nez p0, :cond_9

    .line 157
    .line 158
    move v3, v4

    .line 159
    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_4
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    instance-of p0, p0, La/gts;

    .line 169
    .line 170
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_5
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    check-cast p0, La/hjw;

    .line 180
    .line 181
    iget-object p0, p0, La/hjw;->a:La/yiw;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_6
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, La/hjw;

    .line 189
    .line 190
    iget-boolean p0, p0, La/hjw;->c:Z

    .line 191
    .line 192
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_7
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/hjw;

    .line 202
    .line 203
    iget-object p0, p0, La/hjw;->b:La/a4x;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_8
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    check-cast p0, La/fgg;

    .line 211
    .line 212
    iget-boolean p0, p0, La/fgg;->d:Z

    .line 213
    .line 214
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, La/fgg;

    .line 224
    .line 225
    iget-object p0, p0, La/fgg;->c:La/a4x;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    check-cast p0, La/fgg;

    .line 233
    .line 234
    iget-object p0, p0, La/fgg;->b:La/wfg;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, La/fgg;

    .line 242
    .line 243
    iget-object p0, p0, La/fgg;->a:La/tfg;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    check-cast p0, La/efg;

    .line 251
    .line 252
    iget-boolean p0, p0, La/efg;->c:Z

    .line 253
    .line 254
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :pswitch_d
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, La/efg;

    .line 264
    .line 265
    iget-object p0, p0, La/efg;->b:La/a4x;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_e
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, La/efg;

    .line 273
    .line 274
    iget-object p0, p0, La/efg;->a:La/xeg;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_f
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    check-cast p0, Ljava/lang/Number;

    .line 282
    .line 283
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    const/4 v0, 0x0

    .line 288
    cmpl-float p0, p0, v0

    .line 289
    .line 290
    if-lez p0, :cond_a

    .line 291
    .line 292
    move v3, v4

    .line 293
    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :pswitch_10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    check-cast p0, Ljava/lang/Number;

    .line 303
    .line 304
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    return-object p0

    .line 313
    :pswitch_11
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    check-cast p0, Ljava/lang/Float;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_12
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    check-cast p0, Ljava/lang/Number;

    .line 325
    .line 326
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_13
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    check-cast p0, Ljava/lang/Number;

    .line 340
    .line 341
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    sub-float/2addr v1, p0

    .line 346
    const/high16 p0, 0x41800000    # 16.0f

    .line 347
    .line 348
    mul-float/2addr v1, p0

    .line 349
    new-instance p0, La/ycl;

    .line 350
    .line 351
    invoke-direct {p0, v1}, La/ycl;-><init>(F)V

    .line 352
    .line 353
    .line 354
    return-object p0

    .line 355
    :pswitch_14
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    check-cast p0, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    cmpg-float p0, p0, v1

    .line 366
    .line 367
    if-nez p0, :cond_b

    .line 368
    .line 369
    move v3, v4

    .line 370
    :cond_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    return-object p0

    .line 375
    :pswitch_15
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    check-cast p0, La/klb;

    .line 380
    .line 381
    iget-object p0, p0, La/klb;->b:La/tkb;

    .line 382
    .line 383
    iget-object p0, p0, La/tkb;->b:La/a4x;

    .line 384
    .line 385
    return-object p0

    .line 386
    :pswitch_16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    check-cast p0, La/klb;

    .line 391
    .line 392
    iget-object p0, p0, La/klb;->b:La/tkb;

    .line 393
    .line 394
    iget-object p0, p0, La/tkb;->a:La/qkb;

    .line 395
    .line 396
    return-object p0

    .line 397
    :pswitch_17
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    check-cast p0, Ljava/lang/Boolean;

    .line 402
    .line 403
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    return-object p0

    .line 407
    :pswitch_18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    check-cast p0, Ljava/lang/Boolean;

    .line 412
    .line 413
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    return-object p0

    .line 417
    :pswitch_19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    check-cast p0, La/unr;

    .line 422
    .line 423
    iget-boolean p0, p0, La/unr;->g:Z

    .line 424
    .line 425
    xor-int/2addr p0, v4

    .line 426
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    return-object p0

    .line 431
    :pswitch_1a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    check-cast p0, La/kg30;

    .line 436
    .line 437
    if-eqz p0, :cond_c

    .line 438
    .line 439
    iget-object v2, p0, La/kg30;->d:Ljava/lang/String;

    .line 440
    .line 441
    :cond_c
    return-object v2

    .line 442
    :pswitch_1b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    check-cast p0, La/kg30;

    .line 447
    .line 448
    if-eqz p0, :cond_d

    .line 449
    .line 450
    iget-object v2, p0, La/kg30;->c:Ljava/lang/String;

    .line 451
    .line 452
    :cond_d
    return-object v2

    .line 453
    :pswitch_1c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    check-cast p0, La/kg30;

    .line 458
    .line 459
    if-eqz p0, :cond_e

    .line 460
    .line 461
    iget-object v2, p0, La/kg30;->b:Ljava/lang/String;

    .line 462
    .line 463
    :cond_e
    return-object v2

    .line 464
    nop

    .line 465
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
