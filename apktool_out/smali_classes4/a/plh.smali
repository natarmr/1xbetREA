.class public final synthetic La/plh;
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
    iput-byte p2, p0, La/plh;->a:B

    iput-object p1, p0, La/plh;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/plh;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/plh;->b:La/l7m0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/qyp;

    .line 17
    .line 18
    iget-object p0, p0, La/qyp;->b:La/gxp;

    .line 19
    .line 20
    iget-object p0, p0, La/gxp;->a:La/fxp;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/rop;->a2:La/nek;

    .line 24
    .line 25
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/qnp;

    .line 30
    .line 31
    iget-object v0, v0, La/qnp;->a:La/ysv;

    .line 32
    .line 33
    instance-of v1, v0, La/usv;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, La/usv;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v0, v4

    .line 42
    :goto_0
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, v0, La/usv;->a:La/h8l0;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v0, v4

    .line 48
    :goto_1
    sget-object v1, La/h8l0;->d:La/h8l0;

    .line 49
    .line 50
    if-eq v0, v1, :cond_5

    .line 51
    .line 52
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/qnp;

    .line 57
    .line 58
    iget-object p0, p0, La/qnp;->a:La/ysv;

    .line 59
    .line 60
    instance-of v0, p0, La/usv;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    check-cast p0, La/usv;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move-object p0, v4

    .line 68
    :goto_2
    if-eqz p0, :cond_3

    .line 69
    .line 70
    iget-object v4, p0, La/usv;->a:La/h8l0;

    .line 71
    .line 72
    :cond_3
    sget-object p0, La/h8l0;->c:La/h8l0;

    .line 73
    .line 74
    if-ne v4, p0, :cond_4

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move v2, v3

    .line 78
    :cond_5
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/qnp;

    .line 88
    .line 89
    iget-boolean p0, p0, La/qnp;->d:Z

    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, La/tly;

    .line 101
    .line 102
    iget-boolean p0, p0, La/tly;->a:Z

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, La/y4p;

    .line 114
    .line 115
    iget-boolean p0, p0, La/y4p;->b:Z

    .line 116
    .line 117
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :pswitch_4
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, La/y4p;

    .line 127
    .line 128
    iget-object p0, p0, La/y4p;->c:La/d4p;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_5
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/4 v1, 0x0

    .line 142
    cmpg-float v0, v0, v1

    .line 143
    .line 144
    if-gez v0, :cond_6

    .line 145
    .line 146
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Ljava/lang/Number;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    float-to-int p0, p0

    .line 157
    neg-int v3, p0

    .line 158
    :cond_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_6
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    cmpg-float p0, p0, v1

    .line 174
    .line 175
    if-nez p0, :cond_7

    .line 176
    .line 177
    move v3, v2

    .line 178
    :cond_7
    xor-int/lit8 p0, v3, 0x1

    .line 179
    .line 180
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :pswitch_7
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    check-cast p0, La/g9o;

    .line 190
    .line 191
    iget-object p0, p0, La/g9o;->b:La/t8o;

    .line 192
    .line 193
    iget-object p0, p0, La/t8o;->b:La/a4x;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_8
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast p0, La/g9o;

    .line 201
    .line 202
    iget-object p0, p0, La/g9o;->b:La/t8o;

    .line 203
    .line 204
    iget-object p0, p0, La/t8o;->a:La/z7o;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    check-cast p0, La/z3o;

    .line 212
    .line 213
    iget-object p0, p0, La/z3o;->c:La/e4o;

    .line 214
    .line 215
    iget-boolean p0, p0, La/e4o;->c:Z

    .line 216
    .line 217
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    return-object p0

    .line 222
    :pswitch_a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    check-cast p0, Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, La/z3o;

    .line 237
    .line 238
    iget-object p0, p0, La/z3o;->c:La/e4o;

    .line 239
    .line 240
    iget-object p0, p0, La/e4o;->a:La/p3o;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    check-cast p0, Ljava/lang/Number;

    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0

    .line 258
    :pswitch_d
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    check-cast p0, La/tsk;

    .line 263
    .line 264
    iget-object p0, p0, La/tsk;->a:La/n2o;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_e
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    check-cast p0, La/tsk;

    .line 272
    .line 273
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 274
    .line 275
    iget-boolean p0, p0, La/gsk;->c:Z

    .line 276
    .line 277
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    return-object p0

    .line 282
    :pswitch_f
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p0, La/tsk;

    .line 287
    .line 288
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 289
    .line 290
    iget-object p0, p0, La/gsk;->b:La/a4x;

    .line 291
    .line 292
    return-object p0

    .line 293
    :pswitch_10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    check-cast p0, La/tsk;

    .line 298
    .line 299
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 300
    .line 301
    iget-object p0, p0, La/gsk;->a:La/lpk;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_11
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    check-cast p0, La/tsk;

    .line 309
    .line 310
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 311
    .line 312
    iget-boolean p0, p0, La/gsk;->c:Z

    .line 313
    .line 314
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    return-object p0

    .line 319
    :pswitch_12
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    check-cast p0, La/tsk;

    .line 324
    .line 325
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 326
    .line 327
    iget-object p0, p0, La/gsk;->b:La/a4x;

    .line 328
    .line 329
    return-object p0

    .line 330
    :pswitch_13
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    check-cast p0, La/tsk;

    .line 335
    .line 336
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 337
    .line 338
    iget-object p0, p0, La/gsk;->a:La/lpk;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_14
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    check-cast p0, La/tsk;

    .line 346
    .line 347
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 348
    .line 349
    iget-boolean p0, p0, La/gsk;->c:Z

    .line 350
    .line 351
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    return-object p0

    .line 356
    :pswitch_15
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    check-cast p0, La/tsk;

    .line 361
    .line 362
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 363
    .line 364
    iget-object p0, p0, La/gsk;->b:La/a4x;

    .line 365
    .line 366
    return-object p0

    .line 367
    :pswitch_16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    check-cast p0, La/tsk;

    .line 372
    .line 373
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 374
    .line 375
    iget-object p0, p0, La/gsk;->a:La/lpk;

    .line 376
    .line 377
    return-object p0

    .line 378
    :pswitch_17
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    check-cast p0, Ljava/lang/Number;

    .line 383
    .line 384
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 385
    .line 386
    .line 387
    move-result p0

    .line 388
    cmpg-float p0, p0, v1

    .line 389
    .line 390
    if-nez p0, :cond_8

    .line 391
    .line 392
    move v3, v2

    .line 393
    :cond_8
    xor-int/lit8 p0, v3, 0x1

    .line 394
    .line 395
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    return-object p0

    .line 400
    :pswitch_18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    check-cast p0, La/tsk;

    .line 405
    .line 406
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 407
    .line 408
    iget-boolean p0, p0, La/gsk;->c:Z

    .line 409
    .line 410
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    return-object p0

    .line 415
    :pswitch_19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast p0, La/tsk;

    .line 420
    .line 421
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 422
    .line 423
    iget-object p0, p0, La/gsk;->b:La/a4x;

    .line 424
    .line 425
    return-object p0

    .line 426
    :pswitch_1a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    check-cast p0, La/tsk;

    .line 431
    .line 432
    iget-object p0, p0, La/tsk;->c:La/gsk;

    .line 433
    .line 434
    iget-object p0, p0, La/gsk;->a:La/lpk;

    .line 435
    .line 436
    return-object p0

    .line 437
    :pswitch_1b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    check-cast p0, La/kmh;

    .line 442
    .line 443
    iget-object p0, p0, La/kmh;->b:La/l7m0;

    .line 444
    .line 445
    return-object p0

    .line 446
    :pswitch_1c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    check-cast p0, La/kmh;

    .line 451
    .line 452
    iget-object p0, p0, La/kmh;->c:La/jjh;

    .line 453
    .line 454
    return-object p0

    .line 455
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
