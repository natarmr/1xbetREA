.class public final synthetic La/jb;
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
    iput-byte p2, p0, La/jb;->a:B

    iput-object p1, p0, La/jb;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/jb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/high16 v3, 0x40000000    # 2.0f

    .line 6
    .line 7
    const/high16 v4, 0x3f000000    # 0.5f

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/high16 v6, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iget-object p0, p0, La/jb;->b:La/l7m0;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 18
    .line 19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/ng4;

    .line 24
    .line 25
    iget-object p0, p0, La/ng4;->e:La/s6q0;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 29
    .line 30
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ng4;

    .line 35
    .line 36
    iget-object p0, p0, La/ng4;->d:La/s6q0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 40
    .line 41
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/ng4;

    .line 46
    .line 47
    iget-object p0, p0, La/ng4;->h:La/wul;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 51
    .line 52
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/ng4;

    .line 57
    .line 58
    iget-boolean p0, p0, La/ng4;->b:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_3
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 66
    .line 67
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    xor-int/2addr p0, v5

    .line 78
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_4
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 84
    .line 85
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/ng4;

    .line 90
    .line 91
    iget-object p0, p0, La/ng4;->c:Ljava/util/List;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_5
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 95
    .line 96
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, La/ng4;

    .line 101
    .line 102
    iget-object p0, p0, La/ng4;->l:La/ne4;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_6
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, La/t9f0;

    .line 110
    .line 111
    iget-object p0, p0, La/t9f0;->c:Ljava/lang/String;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_7
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    cmpg-float p0, p0, v6

    .line 125
    .line 126
    if-nez p0, :cond_0

    .line 127
    .line 128
    move v1, v5

    .line 129
    :cond_0
    xor-int/lit8 p0, v1, 0x1

    .line 130
    .line 131
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_8
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    sub-float/2addr v6, p0

    .line 147
    const/high16 p0, 0x41800000    # 16.0f

    .line 148
    .line 149
    mul-float/2addr v6, p0

    .line 150
    new-instance p0, La/ycl;

    .line 151
    .line 152
    invoke-direct {p0, v6}, La/ycl;-><init>(F)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, La/f92;

    .line 181
    .line 182
    iget-object p0, p0, La/f92;->e:La/q4i0;

    .line 183
    .line 184
    iget p0, p0, La/q4i0;->a:I

    .line 185
    .line 186
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    :pswitch_c
    sget-object v0, La/y82;->V1:La/qek0;

    .line 192
    .line 193
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    check-cast p0, La/f92;

    .line 198
    .line 199
    iget-boolean p0, p0, La/f92;->f:Z

    .line 200
    .line 201
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_d
    sget-object v0, La/y82;->V1:La/qek0;

    .line 207
    .line 208
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    check-cast p0, La/f92;

    .line 213
    .line 214
    iget-object p0, p0, La/f92;->d:La/hyl;

    .line 215
    .line 216
    if-nez p0, :cond_1

    .line 217
    .line 218
    move v1, v5

    .line 219
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    return-object p0

    .line 224
    :pswitch_e
    sget-object v0, La/y82;->V1:La/qek0;

    .line 225
    .line 226
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    check-cast p0, La/f92;

    .line 231
    .line 232
    iget-object p0, p0, La/f92;->d:La/hyl;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_f
    sget-object v0, La/y82;->V1:La/qek0;

    .line 236
    .line 237
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, La/f92;

    .line 242
    .line 243
    iget-object p0, p0, La/f92;->a:La/e92;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_10
    sget-object v0, La/y82;->V1:La/qek0;

    .line 247
    .line 248
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, La/f92;

    .line 253
    .line 254
    iget-object p0, p0, La/f92;->b:La/z82;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_11
    sget-object v0, La/y82;->V1:La/qek0;

    .line 258
    .line 259
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, La/f92;

    .line 264
    .line 265
    iget-object p0, p0, La/f92;->e:La/q4i0;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_12
    sget-object v0, La/y82;->V1:La/qek0;

    .line 269
    .line 270
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    instance-of p0, p0, La/v72;

    .line 275
    .line 276
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_13
    sget-object v0, La/y82;->V1:La/qek0;

    .line 282
    .line 283
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    check-cast p0, La/y72;

    .line 288
    .line 289
    instance-of v0, p0, La/x72;

    .line 290
    .line 291
    if-eqz v0, :cond_2

    .line 292
    .line 293
    check-cast p0, La/x72;

    .line 294
    .line 295
    iget-object p0, p0, La/x72;->a:La/n3n;

    .line 296
    .line 297
    instance-of p0, p0, La/j3n;

    .line 298
    .line 299
    if-eqz p0, :cond_2

    .line 300
    .line 301
    move v1, v5

    .line 302
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    :pswitch_14
    sget-object v0, La/y82;->V1:La/qek0;

    .line 308
    .line 309
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    check-cast p0, La/f92;

    .line 314
    .line 315
    iget-object p0, p0, La/f92;->c:La/y72;

    .line 316
    .line 317
    return-object p0

    .line 318
    :pswitch_15
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, Ljava/lang/Number;

    .line 323
    .line 324
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    sub-float/2addr p0, v4

    .line 329
    mul-float/2addr p0, v3

    .line 330
    invoke-static {p0, v2, v6}, La/l1e0;->c(FFF)F

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    return-object p0

    .line 339
    :pswitch_16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    check-cast p0, Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 346
    .line 347
    .line 348
    move-result p0

    .line 349
    sub-float/2addr p0, v4

    .line 350
    mul-float/2addr p0, v3

    .line 351
    invoke-static {p0, v2, v6}, La/l1e0;->c(FFF)F

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    return-object p0

    .line 360
    :pswitch_17
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    check-cast p0, Ljava/lang/Number;

    .line 365
    .line 366
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    sub-float/2addr p0, v4

    .line 371
    mul-float/2addr p0, v3

    .line 372
    invoke-static {p0, v2, v6}, La/l1e0;->c(FFF)F

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    return-object p0

    .line 381
    :pswitch_18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    check-cast p0, Ljava/lang/Number;

    .line 386
    .line 387
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 388
    .line 389
    .line 390
    move-result p0

    .line 391
    sub-float/2addr p0, v4

    .line 392
    mul-float/2addr p0, v3

    .line 393
    invoke-static {p0, v2, v6}, La/l1e0;->c(FFF)F

    .line 394
    .line 395
    .line 396
    move-result p0

    .line 397
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :pswitch_19
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    check-cast p0, La/nn;

    .line 407
    .line 408
    iget-object p0, p0, La/nn;->c:La/a4x;

    .line 409
    .line 410
    return-object p0

    .line 411
    :pswitch_1a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    check-cast p0, La/nn;

    .line 416
    .line 417
    iget-object p0, p0, La/nn;->b:La/vm;

    .line 418
    .line 419
    return-object p0

    .line 420
    :pswitch_1b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    check-cast p0, Ljava/lang/Boolean;

    .line 425
    .line 426
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    return-object p0

    .line 430
    :pswitch_1c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    check-cast p0, Ljava/lang/Boolean;

    .line 435
    .line 436
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    return-object p0

    .line 440
    nop

    .line 441
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
