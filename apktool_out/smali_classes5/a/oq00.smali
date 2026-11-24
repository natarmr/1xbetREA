.class public final synthetic La/oq00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;

.field public final synthetic d:J

.field public final synthetic e:La/pu90;

.field public final synthetic f:I

.field public final synthetic g:La/pu90;

.field public final synthetic h:La/pu90;


# direct methods
.method public synthetic constructor <init>(La/pu90;La/pu90;JILa/pu90;La/pu90;La/pu90;B)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/oq00;->a:B

    iput-object p1, p0, La/oq00;->b:La/pu90;

    iput-object p2, p0, La/oq00;->c:La/pu90;

    iput-wide p3, p0, La/oq00;->d:J

    iput p5, p0, La/oq00;->f:I

    iput-object p6, p0, La/oq00;->e:La/pu90;

    iput-object p7, p0, La/oq00;->g:La/pu90;

    iput-object p8, p0, La/oq00;->h:La/pu90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;La/pu90;JLa/pu90;ILa/pu90;La/pu90;B)V
    .locals 0

    .line 2
    iput-byte p9, p0, La/oq00;->a:B

    iput-object p1, p0, La/oq00;->b:La/pu90;

    iput-object p2, p0, La/oq00;->c:La/pu90;

    iput-wide p3, p0, La/oq00;->d:J

    iput-object p5, p0, La/oq00;->e:La/pu90;

    iput p6, p0, La/oq00;->f:I

    iput-object p7, p0, La/oq00;->g:La/pu90;

    iput-object p8, p0, La/oq00;->h:La/pu90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/oq00;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x42900000    # 72.0f

    .line 4
    .line 5
    iget-object v2, p0, La/oq00;->h:La/pu90;

    .line 6
    .line 7
    iget-object v3, p0, La/oq00;->g:La/pu90;

    .line 8
    .line 9
    iget-object v4, p0, La/oq00;->e:La/pu90;

    .line 10
    .line 11
    iget v5, p0, La/oq00;->f:I

    .line 12
    .line 13
    iget-wide v6, p0, La/oq00;->d:J

    .line 14
    .line 15
    iget-object v8, p0, La/oq00;->c:La/pu90;

    .line 16
    .line 17
    iget-object p0, p0, La/oq00;->b:La/pu90;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    check-cast p1, La/ou90;

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, p0, v10, v10, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 32
    .line 33
    .line 34
    :cond_0
    if-eqz v8, :cond_1

    .line 35
    .line 36
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    iget v0, v8, La/pu90;->a:I

    .line 41
    .line 42
    sub-int/2addr p0, v0

    .line 43
    div-int/lit8 p0, p0, 0x2

    .line 44
    .line 45
    iget v0, v8, La/pu90;->b:I

    .line 46
    .line 47
    sub-int v0, v5, v0

    .line 48
    .line 49
    div-int/lit8 v0, v0, 0x2

    .line 50
    .line 51
    invoke-virtual {p1, v8, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 52
    .line 53
    .line 54
    :cond_1
    if-eqz v4, :cond_3

    .line 55
    .line 56
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    iget v0, v4, La/pu90;->a:I

    .line 61
    .line 62
    sub-int/2addr p0, v0

    .line 63
    div-int/lit8 p0, p0, 0x2

    .line 64
    .line 65
    iget v0, v4, La/pu90;->b:I

    .line 66
    .line 67
    sub-int v0, v5, v0

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    iget v8, v3, La/pu90;->b:I

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    move v8, v10

    .line 75
    :goto_0
    sub-int/2addr v0, v8

    .line 76
    invoke-virtual {p1, v4, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 77
    .line 78
    .line 79
    :cond_3
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    iget v0, v2, La/pu90;->a:I

    .line 86
    .line 87
    sub-int/2addr p0, v0

    .line 88
    div-int/lit8 p0, p0, 0x2

    .line 89
    .line 90
    sget-object v0, La/qmk;->a:La/zcl;

    .line 91
    .line 92
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p1, v2, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 97
    .line 98
    .line 99
    :cond_4
    if-eqz v3, :cond_5

    .line 100
    .line 101
    iget p0, v3, La/pu90;->b:I

    .line 102
    .line 103
    sub-int/2addr v5, p0

    .line 104
    invoke-virtual {p1, v3, v10, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 105
    .line 106
    .line 107
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    if-eqz p0, :cond_6

    .line 114
    .line 115
    invoke-virtual {p1, p0, v10, v10, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 116
    .line 117
    .line 118
    :cond_6
    if-eqz v8, :cond_7

    .line 119
    .line 120
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    iget v0, v8, La/pu90;->a:I

    .line 125
    .line 126
    sub-int/2addr p0, v0

    .line 127
    div-int/lit8 p0, p0, 0x2

    .line 128
    .line 129
    div-int/lit8 v0, v5, 0x2

    .line 130
    .line 131
    iget v1, v8, La/pu90;->b:I

    .line 132
    .line 133
    sub-int/2addr v0, v1

    .line 134
    invoke-virtual {p1, v8, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 135
    .line 136
    .line 137
    :cond_7
    if-eqz v4, :cond_9

    .line 138
    .line 139
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    iget v0, v4, La/pu90;->a:I

    .line 144
    .line 145
    sub-int/2addr p0, v0

    .line 146
    div-int/lit8 p0, p0, 0x2

    .line 147
    .line 148
    iget v0, v4, La/pu90;->b:I

    .line 149
    .line 150
    sub-int v0, v5, v0

    .line 151
    .line 152
    if-eqz v3, :cond_8

    .line 153
    .line 154
    iget v1, v3, La/pu90;->b:I

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_8
    move v1, v10

    .line 158
    :goto_1
    sub-int/2addr v0, v1

    .line 159
    invoke-virtual {p1, v4, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 160
    .line 161
    .line 162
    :cond_9
    if-eqz v2, :cond_a

    .line 163
    .line 164
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    iget v0, v2, La/pu90;->a:I

    .line 169
    .line 170
    sub-int/2addr p0, v0

    .line 171
    div-int/lit8 p0, p0, 0x2

    .line 172
    .line 173
    div-int/lit8 v0, v5, 0x2

    .line 174
    .line 175
    invoke-virtual {p1, v2, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 176
    .line 177
    .line 178
    :cond_a
    if-eqz v3, :cond_b

    .line 179
    .line 180
    iget p0, v3, La/pu90;->b:I

    .line 181
    .line 182
    sub-int/2addr v5, p0

    .line 183
    invoke-virtual {p1, v3, v10, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 184
    .line 185
    .line 186
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    if-eqz p0, :cond_c

    .line 193
    .line 194
    invoke-virtual {p1, p0, v10, v10, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 195
    .line 196
    .line 197
    :cond_c
    if-eqz v8, :cond_d

    .line 198
    .line 199
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    iget v0, v8, La/pu90;->a:I

    .line 204
    .line 205
    sub-int/2addr p0, v0

    .line 206
    div-int/lit8 p0, p0, 0x2

    .line 207
    .line 208
    sget-object v0, La/qmk;->a:La/zcl;

    .line 209
    .line 210
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    invoke-virtual {p1, v8, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 215
    .line 216
    .line 217
    :cond_d
    if-eqz v4, :cond_f

    .line 218
    .line 219
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    iget v0, v4, La/pu90;->a:I

    .line 224
    .line 225
    sub-int/2addr p0, v0

    .line 226
    div-int/lit8 p0, p0, 0x2

    .line 227
    .line 228
    iget v0, v4, La/pu90;->b:I

    .line 229
    .line 230
    sub-int v0, v5, v0

    .line 231
    .line 232
    if-eqz v3, :cond_e

    .line 233
    .line 234
    iget v1, v3, La/pu90;->b:I

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_e
    move v1, v10

    .line 238
    :goto_2
    sub-int/2addr v0, v1

    .line 239
    invoke-virtual {p1, v4, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 240
    .line 241
    .line 242
    :cond_f
    if-eqz v2, :cond_12

    .line 243
    .line 244
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    iget v0, v2, La/pu90;->a:I

    .line 249
    .line 250
    sub-int/2addr p0, v0

    .line 251
    div-int/lit8 p0, p0, 0x2

    .line 252
    .line 253
    if-eqz v4, :cond_11

    .line 254
    .line 255
    if-eqz v3, :cond_10

    .line 256
    .line 257
    iget v0, v3, La/pu90;->b:I

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_10
    move v0, v10

    .line 261
    :goto_3
    sub-int v0, v5, v0

    .line 262
    .line 263
    iget v1, v4, La/pu90;->b:I

    .line 264
    .line 265
    sub-int/2addr v0, v1

    .line 266
    iget v1, v2, La/pu90;->b:I

    .line 267
    .line 268
    sub-int/2addr v0, v1

    .line 269
    goto :goto_4

    .line 270
    :cond_11
    invoke-static {v6, v7}, La/p4e;->h(J)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    iget v1, v2, La/pu90;->b:I

    .line 275
    .line 276
    sub-int/2addr v0, v1

    .line 277
    int-to-float v0, v0

    .line 278
    const v1, 0x3f59999a    # 0.85f

    .line 279
    .line 280
    .line 281
    mul-float/2addr v0, v1

    .line 282
    float-to-int v0, v0

    .line 283
    :goto_4
    invoke-virtual {p1, v2, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 284
    .line 285
    .line 286
    :cond_12
    if-eqz v3, :cond_13

    .line 287
    .line 288
    iget p0, v3, La/pu90;->b:I

    .line 289
    .line 290
    sub-int/2addr v5, p0

    .line 291
    invoke-virtual {p1, v3, v10, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 292
    .line 293
    .line 294
    :cond_13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    if-eqz p0, :cond_14

    .line 301
    .line 302
    invoke-virtual {p1, p0, v10, v10, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 303
    .line 304
    .line 305
    :cond_14
    if-eqz v8, :cond_15

    .line 306
    .line 307
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    iget v0, v8, La/pu90;->a:I

    .line 312
    .line 313
    sub-int/2addr p0, v0

    .line 314
    div-int/lit8 p0, p0, 0x2

    .line 315
    .line 316
    sget-object v0, La/qmk;->a:La/zcl;

    .line 317
    .line 318
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    invoke-virtual {p1, v8, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 323
    .line 324
    .line 325
    :cond_15
    if-eqz v4, :cond_18

    .line 326
    .line 327
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    iget v0, v4, La/pu90;->a:I

    .line 332
    .line 333
    sub-int/2addr p0, v0

    .line 334
    div-int/lit8 p0, p0, 0x2

    .line 335
    .line 336
    iget v0, v4, La/pu90;->b:I

    .line 337
    .line 338
    sub-int v0, v5, v0

    .line 339
    .line 340
    if-eqz v3, :cond_16

    .line 341
    .line 342
    iget v1, v3, La/pu90;->b:I

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_16
    move v1, v10

    .line 346
    :goto_5
    sub-int/2addr v0, v1

    .line 347
    if-eqz v2, :cond_17

    .line 348
    .line 349
    iget v1, v2, La/pu90;->b:I

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_17
    move v1, v10

    .line 353
    :goto_6
    sub-int/2addr v0, v1

    .line 354
    invoke-virtual {p1, v4, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 355
    .line 356
    .line 357
    :cond_18
    if-eqz v2, :cond_1a

    .line 358
    .line 359
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 360
    .line 361
    .line 362
    move-result p0

    .line 363
    iget v0, v2, La/pu90;->a:I

    .line 364
    .line 365
    sub-int/2addr p0, v0

    .line 366
    div-int/lit8 p0, p0, 0x2

    .line 367
    .line 368
    iget v0, v2, La/pu90;->b:I

    .line 369
    .line 370
    sub-int v0, v5, v0

    .line 371
    .line 372
    if-eqz v3, :cond_19

    .line 373
    .line 374
    iget v1, v3, La/pu90;->b:I

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_19
    move v1, v10

    .line 378
    :goto_7
    sub-int/2addr v0, v1

    .line 379
    invoke-virtual {p1, v2, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 380
    .line 381
    .line 382
    :cond_1a
    if-eqz v3, :cond_1b

    .line 383
    .line 384
    iget p0, v3, La/pu90;->b:I

    .line 385
    .line 386
    sub-int/2addr v5, p0

    .line 387
    invoke-virtual {p1, v3, v10, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 388
    .line 389
    .line 390
    :cond_1b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object p0

    .line 393
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    if-eqz p0, :cond_1c

    .line 397
    .line 398
    invoke-virtual {p1, p0, v10, v10, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 399
    .line 400
    .line 401
    :cond_1c
    if-eqz v8, :cond_1d

    .line 402
    .line 403
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    iget v0, v8, La/pu90;->a:I

    .line 408
    .line 409
    sub-int/2addr p0, v0

    .line 410
    div-int/lit8 p0, p0, 0x2

    .line 411
    .line 412
    iget v0, v8, La/pu90;->b:I

    .line 413
    .line 414
    sub-int v0, v5, v0

    .line 415
    .line 416
    div-int/lit8 v0, v0, 0x2

    .line 417
    .line 418
    invoke-virtual {p1, v8, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 419
    .line 420
    .line 421
    :cond_1d
    if-eqz v4, :cond_20

    .line 422
    .line 423
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 424
    .line 425
    .line 426
    move-result p0

    .line 427
    iget v0, v4, La/pu90;->a:I

    .line 428
    .line 429
    sub-int/2addr p0, v0

    .line 430
    div-int/lit8 p0, p0, 0x2

    .line 431
    .line 432
    iget v0, v4, La/pu90;->b:I

    .line 433
    .line 434
    sub-int v0, v5, v0

    .line 435
    .line 436
    if-eqz v3, :cond_1e

    .line 437
    .line 438
    iget v1, v3, La/pu90;->b:I

    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_1e
    move v1, v10

    .line 442
    :goto_8
    sub-int/2addr v0, v1

    .line 443
    if-eqz v2, :cond_1f

    .line 444
    .line 445
    iget v1, v2, La/pu90;->b:I

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_1f
    move v1, v10

    .line 449
    :goto_9
    sub-int/2addr v0, v1

    .line 450
    invoke-virtual {p1, v4, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 451
    .line 452
    .line 453
    :cond_20
    if-eqz v3, :cond_22

    .line 454
    .line 455
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 456
    .line 457
    .line 458
    move-result p0

    .line 459
    iget v0, v3, La/pu90;->a:I

    .line 460
    .line 461
    sub-int/2addr p0, v0

    .line 462
    div-int/lit8 p0, p0, 0x2

    .line 463
    .line 464
    iget v0, v3, La/pu90;->b:I

    .line 465
    .line 466
    sub-int v0, v5, v0

    .line 467
    .line 468
    if-eqz v2, :cond_21

    .line 469
    .line 470
    iget v1, v2, La/pu90;->b:I

    .line 471
    .line 472
    goto :goto_a

    .line 473
    :cond_21
    move v1, v10

    .line 474
    :goto_a
    sub-int/2addr v0, v1

    .line 475
    invoke-virtual {p1, v3, p0, v0, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 476
    .line 477
    .line 478
    :cond_22
    if-eqz v2, :cond_23

    .line 479
    .line 480
    iget p0, v2, La/pu90;->b:I

    .line 481
    .line 482
    sub-int/2addr v5, p0

    .line 483
    invoke-virtual {p1, v2, v10, v5, v9}, La/ou90;->m(La/pu90;IIF)V

    .line 484
    .line 485
    .line 486
    :cond_23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 487
    .line 488
    return-object p0

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
