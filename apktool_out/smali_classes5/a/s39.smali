.class public final synthetic La/s39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xk80;


# direct methods
.method public synthetic constructor <init>(La/xk80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s39;->a:B

    iput-object p1, p0, La/s39;->b:La/xk80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/s39;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s39;->b:La/xk80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/xk80;->k:La/ywj;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-virtual {p0}, La/xk80;->n()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    iget-object v0, p0, La/xk80;->k:La/ywj;

    .line 29
    .line 30
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, La/xk80;->q:La/cgk0;

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, La/xk80;->k()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v2, -0x1

    .line 48
    if-eq v0, v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, La/xk80;->l()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v1, p0, La/xk80;->n:La/w6k;

    .line 64
    .line 65
    sget-object v2, La/zk80;->a:La/yk80;

    .line 66
    .line 67
    const/high16 v2, 0x42600000    # 56.0f

    .line 68
    .line 69
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p0}, La/xk80;->o()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    int-to-float v2, v2

    .line 78
    const/high16 v3, 0x40000000    # 2.0f

    .line 79
    .line 80
    div-float/2addr v2, v3

    .line 81
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {p0}, La/xk80;->o()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    int-to-float v2, v2

    .line 90
    div-float/2addr v1, v2

    .line 91
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    cmpl-float v0, v0, v1

    .line 96
    .line 97
    if-ltz v0, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, La/xk80;->F:La/pz40;

    .line 100
    .line 101
    check-cast v0, La/hgk0;

    .line 102
    .line 103
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iget v1, p0, La/xk80;->e:I

    .line 114
    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    add-int/lit8 v0, v1, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    move v0, v1

    .line 121
    goto :goto_0

    .line 122
    :cond_3
    invoke-virtual {p0}, La/xk80;->k()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    :goto_0
    invoke-virtual {p0, v0}, La/xk80;->j(I)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_2
    iget-object v0, p0, La/xk80;->k:La/ywj;

    .line 136
    .line 137
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    iget-object p0, p0, La/xk80;->r:La/cgk0;

    .line 144
    .line 145
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    invoke-virtual {p0}, La/xk80;->k()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_3
    invoke-virtual {p0}, La/xk80;->k()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :pswitch_4
    invoke-virtual {p0}, La/xk80;->k()I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_5
    invoke-virtual {p0}, La/xk80;->k()I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :pswitch_6
    invoke-virtual {p0}, La/xk80;->k()I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_7
    invoke-virtual {p0}, La/xk80;->k()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    int-to-float v0, v0

    .line 200
    invoke-virtual {p0}, La/xk80;->l()F

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    add-float/2addr p0, v0

    .line 205
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_8
    invoke-virtual {p0}, La/xk80;->k()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    int-to-float v0, v0

    .line 215
    invoke-virtual {p0}, La/xk80;->l()F

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    add-float/2addr p0, v0

    .line 220
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_9
    invoke-virtual {p0}, La/xk80;->k()I

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :pswitch_a
    invoke-virtual {p0}, La/xk80;->k()I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_b
    invoke-virtual {p0}, La/xk80;->k()I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0

    .line 252
    :pswitch_c
    invoke-virtual {p0}, La/xk80;->k()I

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_d
    invoke-virtual {p0}, La/xk80;->k()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    return-object p0

    .line 270
    :pswitch_e
    invoke-virtual {p0}, La/xk80;->k()I

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0

    .line 279
    :pswitch_f
    invoke-virtual {p0}, La/xk80;->k()I

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    :pswitch_10
    invoke-virtual {p0}, La/xk80;->n()I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    return-object p0

    .line 297
    :pswitch_11
    invoke-virtual {p0}, La/xk80;->n()I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    return-object p0

    .line 306
    :pswitch_12
    invoke-virtual {p0}, La/xk80;->k()I

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :pswitch_13
    iget-object p0, p0, La/xk80;->k:La/ywj;

    .line 316
    .line 317
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :pswitch_14
    invoke-virtual {p0}, La/xk80;->k()I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_15
    invoke-virtual {p0}, La/xk80;->k()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {p0}, La/xk80;->r()I

    .line 344
    .line 345
    .line 346
    move-result p0

    .line 347
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    new-instance v1, Lkotlin/Pair;

    .line 352
    .line 353
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    return-object v1

    .line 357
    :pswitch_16
    invoke-virtual {p0}, La/xk80;->k()I

    .line 358
    .line 359
    .line 360
    move-result p0

    .line 361
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    return-object p0

    .line 366
    :pswitch_17
    invoke-virtual {p0}, La/xk80;->k()I

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    return-object p0

    .line 375
    :pswitch_18
    invoke-virtual {p0}, La/xk80;->k()I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    invoke-virtual {p0}, La/xk80;->l()F

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    invoke-virtual {p0}, La/xk80;->n()I

    .line 384
    .line 385
    .line 386
    move-result p0

    .line 387
    add-int/lit8 p0, p0, -0x1

    .line 388
    .line 389
    const v2, 0x3ecccccd    # 0.4f

    .line 390
    .line 391
    .line 392
    cmpl-float v2, v1, v2

    .line 393
    .line 394
    if-lez v2, :cond_5

    .line 395
    .line 396
    if-ge v0, p0, :cond_5

    .line 397
    .line 398
    add-int/lit8 v0, v0, 0x1

    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_5
    const p0, -0x41333333    # -0.4f

    .line 402
    .line 403
    .line 404
    cmpg-float p0, v1, p0

    .line 405
    .line 406
    if-gez p0, :cond_6

    .line 407
    .line 408
    if-lez v0, :cond_6

    .line 409
    .line 410
    add-int/lit8 v0, v0, -0x1

    .line 411
    .line 412
    :cond_6
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    return-object p0

    .line 417
    :pswitch_19
    invoke-virtual {p0}, La/xk80;->n()I

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    const/16 v0, 0x9

    .line 422
    .line 423
    if-le p0, v0, :cond_7

    .line 424
    .line 425
    move p0, v0

    .line 426
    :cond_7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    return-object p0

    .line 431
    :pswitch_1a
    iget-object p0, p0, La/xk80;->k:La/ywj;

    .line 432
    .line 433
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    return-object p0

    .line 442
    :pswitch_1b
    invoke-virtual {p0}, La/xk80;->k()I

    .line 443
    .line 444
    .line 445
    move-result p0

    .line 446
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    return-object p0

    .line 451
    :pswitch_1c
    invoke-virtual {p0}, La/xk80;->k()I

    .line 452
    .line 453
    .line 454
    move-result p0

    .line 455
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    return-object p0

    .line 460
    nop

    .line 461
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
