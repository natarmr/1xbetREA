.class public final La/fa00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:F

.field public final synthetic c:F


# direct methods
.method public constructor <init>(La/a4x;FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fa00;->a:La/a4x;

    .line 5
    .line 6
    iput p2, p0, La/fa00;->b:F

    .line 7
    .line 8
    iput p3, p0, La/fa00;->c:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/fa00;->a:La/a4x;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move-object v4, v2

    .line 22
    check-cast v4, La/ua00;

    .line 23
    .line 24
    instance-of v4, v4, La/ra00;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, v3

    .line 30
    :goto_0
    check-cast v2, La/ua00;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto/16 :goto_d

    .line 36
    .line 37
    :cond_2
    instance-of v4, v2, La/pa00;

    .line 38
    .line 39
    if-eqz v4, :cond_10

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_f

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, La/ua00;

    .line 56
    .line 57
    instance-of v5, v4, La/pa00;

    .line 58
    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    check-cast v4, La/pa00;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move-object v4, v3

    .line 65
    :goto_1
    if-eqz v4, :cond_7

    .line 66
    .line 67
    iget-object v4, v4, La/pa00;->c:La/a4x;

    .line 68
    .line 69
    if-eqz v4, :cond_7

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_4

    .line 80
    .line 81
    move-object v5, v3

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, La/p6m0;

    .line 88
    .line 89
    iget-object v5, v5, La/p6m0;->b:La/a4x;

    .line 90
    .line 91
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_6

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, La/p6m0;

    .line 110
    .line 111
    iget-object v6, v6, La/p6m0;->b:La/a4x;

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v5, v6}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-gez v7, :cond_5

    .line 126
    .line 127
    move-object v5, v6

    .line 128
    goto :goto_2

    .line 129
    :cond_6
    :goto_3
    if-eqz v5, :cond_7

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    goto :goto_4

    .line 136
    :cond_7
    move v4, v1

    .line 137
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_e

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    check-cast v5, La/ua00;

    .line 148
    .line 149
    instance-of v6, v5, La/pa00;

    .line 150
    .line 151
    if-eqz v6, :cond_9

    .line 152
    .line 153
    check-cast v5, La/pa00;

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_9
    move-object v5, v3

    .line 157
    :goto_5
    if-eqz v5, :cond_d

    .line 158
    .line 159
    iget-object v5, v5, La/pa00;->c:La/a4x;

    .line 160
    .line 161
    if-eqz v5, :cond_d

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_a

    .line 172
    .line 173
    move-object v6, v3

    .line 174
    goto :goto_7

    .line 175
    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    check-cast v6, La/p6m0;

    .line 180
    .line 181
    iget-object v6, v6, La/p6m0;->b:La/a4x;

    .line 182
    .line 183
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    :cond_b
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_c

    .line 196
    .line 197
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    check-cast v7, La/p6m0;

    .line 202
    .line 203
    iget-object v7, v7, La/p6m0;->b:La/a4x;

    .line 204
    .line 205
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-virtual {v6, v7}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    if-gez v8, :cond_b

    .line 218
    .line 219
    move-object v6, v7

    .line 220
    goto :goto_6

    .line 221
    :cond_c
    :goto_7
    if-eqz v6, :cond_d

    .line 222
    .line 223
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    goto :goto_8

    .line 228
    :cond_d
    move v5, v1

    .line 229
    :goto_8
    if-ge v4, v5, :cond_8

    .line 230
    .line 231
    move v4, v5

    .line 232
    goto :goto_4

    .line 233
    :cond_e
    move v1, v4

    .line 234
    goto :goto_d

    .line 235
    :cond_f
    invoke-static {}, La/itt0;->a()V

    .line 236
    .line 237
    .line 238
    return-object v3

    .line 239
    :cond_10
    instance-of v4, v2, La/qa00;

    .line 240
    .line 241
    if-eqz v4, :cond_17

    .line 242
    .line 243
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_16

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, La/ua00;

    .line 258
    .line 259
    instance-of v5, v4, La/qa00;

    .line 260
    .line 261
    if-eqz v5, :cond_11

    .line 262
    .line 263
    check-cast v4, La/qa00;

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_11
    move-object v4, v3

    .line 267
    :goto_9
    if-eqz v4, :cond_12

    .line 268
    .line 269
    iget-object v4, v4, La/qa00;->c:La/p6m0;

    .line 270
    .line 271
    iget-object v4, v4, La/p6m0;->b:La/a4x;

    .line 272
    .line 273
    if-eqz v4, :cond_12

    .line 274
    .line 275
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    goto :goto_a

    .line 280
    :cond_12
    move v4, v1

    .line 281
    :cond_13
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_e

    .line 286
    .line 287
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    check-cast v5, La/ua00;

    .line 292
    .line 293
    instance-of v6, v5, La/qa00;

    .line 294
    .line 295
    if-eqz v6, :cond_14

    .line 296
    .line 297
    check-cast v5, La/qa00;

    .line 298
    .line 299
    goto :goto_b

    .line 300
    :cond_14
    move-object v5, v3

    .line 301
    :goto_b
    if-eqz v5, :cond_15

    .line 302
    .line 303
    iget-object v5, v5, La/qa00;->c:La/p6m0;

    .line 304
    .line 305
    iget-object v5, v5, La/p6m0;->b:La/a4x;

    .line 306
    .line 307
    if-eqz v5, :cond_15

    .line 308
    .line 309
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    goto :goto_c

    .line 314
    :cond_15
    move v5, v1

    .line 315
    :goto_c
    if-ge v4, v5, :cond_13

    .line 316
    .line 317
    move v4, v5

    .line 318
    goto :goto_a

    .line 319
    :cond_16
    invoke-static {}, La/itt0;->a()V

    .line 320
    .line 321
    .line 322
    return-object v3

    .line 323
    :cond_17
    :goto_d
    sget-object v0, La/qmk;->a:La/zcl;

    .line 324
    .line 325
    const/high16 v0, 0x42700000    # 60.0f

    .line 326
    .line 327
    invoke-interface {p1, v0}, La/w6k;->w0(F)F

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    const/high16 v4, 0x40800000    # 4.0f

    .line 332
    .line 333
    invoke-interface {p1, v4}, La/w6k;->w0(F)F

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    const/high16 v5, 0x41800000    # 16.0f

    .line 338
    .line 339
    invoke-interface {p1, v5}, La/w6k;->w0(F)F

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    iget v6, p0, La/fa00;->b:F

    .line 344
    .line 345
    invoke-interface {p1, v6}, La/w6k;->w0(F)F

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    add-float/2addr v6, v5

    .line 350
    iget p0, p0, La/fa00;->c:F

    .line 351
    .line 352
    invoke-interface {p1, p0}, La/w6k;->w0(F)F

    .line 353
    .line 354
    .line 355
    move-result p0

    .line 356
    add-float/2addr p0, v6

    .line 357
    instance-of v2, v2, La/qa00;

    .line 358
    .line 359
    if-eqz v2, :cond_18

    .line 360
    .line 361
    const/4 v2, 0x0

    .line 362
    goto :goto_e

    .line 363
    :cond_18
    const/high16 v2, 0x42400000    # 48.0f

    .line 364
    .line 365
    invoke-interface {p1, v2}, La/w6k;->w0(F)F

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    :goto_e
    int-to-float v5, v1

    .line 370
    mul-float/2addr v0, v5

    .line 371
    add-float/2addr v0, p0

    .line 372
    add-int/lit8 v1, v1, -0x1

    .line 373
    .line 374
    int-to-float p0, v1

    .line 375
    mul-float/2addr v4, p0

    .line 376
    add-float/2addr v4, v0

    .line 377
    add-float/2addr v4, v2

    .line 378
    float-to-int p0, v4

    .line 379
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-static {v0, v1, p0, p0}, La/p4e;->a(IIII)J

    .line 388
    .line 389
    .line 390
    move-result-wide v0

    .line 391
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object p2

    .line 395
    :cond_19
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-eqz v2, :cond_1a

    .line 400
    .line 401
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    move-object v4, v2

    .line 406
    check-cast v4, La/pj30;

    .line 407
    .line 408
    invoke-static {v4}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    const-string v5, "COMPACT_ID"

    .line 413
    .line 414
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    if-eqz v4, :cond_19

    .line 419
    .line 420
    goto :goto_f

    .line 421
    :cond_1a
    move-object v2, v3

    .line 422
    :goto_f
    check-cast v2, La/pj30;

    .line 423
    .line 424
    if-eqz v2, :cond_1b

    .line 425
    .line 426
    invoke-interface {v2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    :cond_1b
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 431
    .line 432
    .line 433
    move-result p2

    .line 434
    new-instance p3, La/cam;

    .line 435
    .line 436
    const/16 p4, 0xc

    .line 437
    .line 438
    invoke-direct {p3, v3, p4}, La/cam;-><init>(La/pu90;B)V

    .line 439
    .line 440
    .line 441
    invoke-static {p1, p2, p0, p3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    return-object p0
.end method
