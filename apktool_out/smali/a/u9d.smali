.class public final La/u9d;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kie0;La/kie0;Ljava/lang/CharSequence;La/kie0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/u9d;->a:B

    .line 3
    .line 4
    iput-object p1, p0, La/u9d;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/u9d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/u9d;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/u9d;->d:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 17
    iput-byte p5, p0, La/u9d;->a:B

    iput-object p1, p0, La/u9d;->b:Ljava/lang/Object;

    iput-object p2, p0, La/u9d;->c:Ljava/lang/Object;

    iput-object p3, p0, La/u9d;->d:Ljava/lang/Object;

    iput-object p4, p0, La/u9d;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/u9d;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/u9d;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/u9d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La/u9d;->e:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object p0, p0, La/u9d;->d:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, La/azn;

    .line 17
    .line 18
    check-cast p0, La/alo;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    if-eq p1, v5, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    if-ne p1, v1, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 33
    .line 34
    iget-object p0, p0, La/jms0;->d:La/k1h0;

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    iget-wide p0, p0, La/k1h0;->b:J

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    check-cast v4, La/toj0;

    .line 42
    .line 43
    iget-wide p0, v4, La/toj0;->h:J

    .line 44
    .line 45
    :goto_0
    new-instance v0, La/ils0;

    .line 46
    .line 47
    invoke-direct {v0, p0, p1}, La/ils0;-><init>(J)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    move-object v0, v3

    .line 56
    check-cast v0, La/ils0;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    check-cast v2, La/pzn;

    .line 60
    .line 61
    iget-object p1, v2, La/pzn;->a:La/jms0;

    .line 62
    .line 63
    iget-object p1, p1, La/jms0;->d:La/k1h0;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-wide p0, p1, La/k1h0;->b:J

    .line 68
    .line 69
    new-instance v0, La/ils0;

    .line 70
    .line 71
    invoke-direct {v0, p0, p1}, La/ils0;-><init>(J)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 76
    .line 77
    iget-object p0, p0, La/jms0;->d:La/k1h0;

    .line 78
    .line 79
    if-eqz p0, :cond_5

    .line 80
    .line 81
    iget-wide p0, p0, La/k1h0;->b:J

    .line 82
    .line 83
    new-instance v0, La/ils0;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1}, La/ils0;-><init>(J)V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_1
    if-eqz v0, :cond_6

    .line 89
    .line 90
    iget-wide p0, v0, La/ils0;->a:J

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    sget-wide p0, La/ils0;->b:J

    .line 94
    .line 95
    :goto_2
    new-instance v0, La/ils0;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1}, La/ils0;-><init>(J)V

    .line 98
    .line 99
    .line 100
    :goto_3
    return-object v0

    .line 101
    :pswitch_0
    check-cast p1, La/uag0;

    .line 102
    .line 103
    check-cast v3, La/toj0;

    .line 104
    .line 105
    check-cast v2, La/l7m0;

    .line 106
    .line 107
    const/high16 v0, 0x3f800000    # 1.0f

    .line 108
    .line 109
    if-eqz v2, :cond_7

    .line 110
    .line 111
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move v2, v0

    .line 123
    :goto_4
    iget-object v6, v3, La/toj0;->c:La/sd60;

    .line 124
    .line 125
    iget-object v7, v6, La/sd60;->e:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v7, La/agk0;

    .line 128
    .line 129
    invoke-virtual {v3}, La/toj0;->b()Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_8

    .line 134
    .line 135
    iget-object v8, v6, La/sd60;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v8, La/pz40;

    .line 138
    .line 139
    check-cast v8, La/hgk0;

    .line 140
    .line 141
    invoke-virtual {v8}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    check-cast v8, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v8, :cond_8

    .line 152
    .line 153
    iget-object v8, v6, La/sd60;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v8, La/agk0;

    .line 156
    .line 157
    invoke-virtual {v8}, La/agk0;->l()F

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    goto :goto_5

    .line 162
    :cond_8
    move v8, v0

    .line 163
    :goto_5
    mul-float/2addr v2, v8

    .line 164
    invoke-virtual {v3}, La/toj0;->b()Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_9

    .line 169
    .line 170
    iput v2, v3, La/toj0;->f:F

    .line 171
    .line 172
    :cond_9
    invoke-virtual {p1, v2}, La/uag0;->b(F)V

    .line 173
    .line 174
    .line 175
    check-cast p0, La/l7m0;

    .line 176
    .line 177
    if-eqz p0, :cond_a

    .line 178
    .line 179
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    check-cast p0, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    goto :goto_6

    .line 190
    :cond_a
    move p0, v0

    .line 191
    :goto_6
    invoke-virtual {v3}, La/toj0;->b()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_b

    .line 196
    .line 197
    iget-object v2, v6, La/sd60;->d:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v2, La/pz40;

    .line 200
    .line 201
    check-cast v2, La/hgk0;

    .line 202
    .line 203
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_b

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_b
    move v5, v1

    .line 217
    :goto_7
    if-eqz v5, :cond_c

    .line 218
    .line 219
    invoke-virtual {v7}, La/agk0;->l()F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    :cond_c
    mul-float/2addr p0, v0

    .line 224
    invoke-virtual {v3}, La/toj0;->b()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_f

    .line 229
    .line 230
    iput p0, v3, La/toj0;->g:F

    .line 231
    .line 232
    if-eqz v5, :cond_d

    .line 233
    .line 234
    invoke-virtual {v7}, La/agk0;->l()F

    .line 235
    .line 236
    .line 237
    :cond_d
    if-eqz v5, :cond_f

    .line 238
    .line 239
    iget-object v0, v3, La/toj0;->j:La/i6u0;

    .line 240
    .line 241
    if-nez v0, :cond_e

    .line 242
    .line 243
    new-instance v0, La/i6u0;

    .line 244
    .line 245
    invoke-direct {v0, v1}, La/i6u0;-><init>(Z)V

    .line 246
    .line 247
    .line 248
    iput-object v0, v3, La/toj0;->j:La/i6u0;

    .line 249
    .line 250
    :cond_e
    sget-object v1, La/nzj;->a:La/i5d0;

    .line 251
    .line 252
    iget-wide v1, v3, La/toj0;->d:J

    .line 253
    .line 254
    invoke-static {v1, v2}, La/plq0;->b(J)J

    .line 255
    .line 256
    .line 257
    move-result-wide v1

    .line 258
    invoke-static {v1, v2}, La/wen;->e(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v1

    .line 262
    invoke-virtual {v0, p0, v1, v2}, La/i6u0;->a(FJ)V

    .line 263
    .line 264
    .line 265
    :cond_f
    invoke-virtual {p1, p0}, La/uag0;->w(F)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, p0}, La/uag0;->y(F)V

    .line 269
    .line 270
    .line 271
    check-cast v4, La/l7m0;

    .line 272
    .line 273
    if-eqz v4, :cond_10

    .line 274
    .line 275
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    check-cast p0, La/ils0;

    .line 280
    .line 281
    iget-wide v0, p0, La/ils0;->a:J

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_10
    sget-wide v0, La/ils0;->b:J

    .line 285
    .line 286
    :goto_8
    invoke-virtual {v3}, La/toj0;->b()Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_11

    .line 291
    .line 292
    iget-object p0, v6, La/sd60;->f:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p0, La/pz40;

    .line 295
    .line 296
    check-cast p0, La/hgk0;

    .line 297
    .line 298
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    check-cast p0, Ljava/lang/Boolean;

    .line 303
    .line 304
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    if-eqz p0, :cond_11

    .line 309
    .line 310
    iget-object p0, v6, La/sd60;->g:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p0, La/pz40;

    .line 313
    .line 314
    check-cast p0, La/hgk0;

    .line 315
    .line 316
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, La/ils0;

    .line 321
    .line 322
    iget-wide v0, p0, La/ils0;->a:J

    .line 323
    .line 324
    :cond_11
    invoke-virtual {v3}, La/toj0;->b()Z

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    if-eqz p0, :cond_12

    .line 329
    .line 330
    iput-wide v0, v3, La/toj0;->h:J

    .line 331
    .line 332
    :cond_12
    invoke-virtual {p1, v0, v1}, La/uag0;->G(J)V

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    check-cast p0, La/kie0;

    .line 345
    .line 346
    check-cast v4, Ljava/lang/CharSequence;

    .line 347
    .line 348
    check-cast v3, La/kie0;

    .line 349
    .line 350
    iget v0, v3, La/kie0;->a:I

    .line 351
    .line 352
    check-cast v2, La/kie0;

    .line 353
    .line 354
    iget v6, v2, La/kie0;->a:I

    .line 355
    .line 356
    :goto_9
    iget v7, v3, La/kie0;->a:I

    .line 357
    .line 358
    if-ge v7, p1, :cond_14

    .line 359
    .line 360
    iget v7, v2, La/kie0;->a:I

    .line 361
    .line 362
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-ge v7, v8, :cond_14

    .line 367
    .line 368
    iget v7, v2, La/kie0;->a:I

    .line 369
    .line 370
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    const/16 v8, 0x20

    .line 375
    .line 376
    if-ne v7, v8, :cond_13

    .line 377
    .line 378
    move v7, v5

    .line 379
    goto :goto_a

    .line 380
    :cond_13
    const/16 v8, 0x9

    .line 381
    .line 382
    if-ne v7, v8, :cond_14

    .line 383
    .line 384
    iget v7, p0, La/kie0;->a:I

    .line 385
    .line 386
    rem-int/lit8 v7, v7, 0x4

    .line 387
    .line 388
    rsub-int/lit8 v7, v7, 0x4

    .line 389
    .line 390
    :goto_a
    iget v8, v3, La/kie0;->a:I

    .line 391
    .line 392
    add-int/2addr v8, v7

    .line 393
    iput v8, v3, La/kie0;->a:I

    .line 394
    .line 395
    iget v8, p0, La/kie0;->a:I

    .line 396
    .line 397
    add-int/2addr v8, v7

    .line 398
    iput v8, p0, La/kie0;->a:I

    .line 399
    .line 400
    iget v7, v2, La/kie0;->a:I

    .line 401
    .line 402
    add-int/2addr v7, v5

    .line 403
    iput v7, v2, La/kie0;->a:I

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_14
    iget p0, v2, La/kie0;->a:I

    .line 407
    .line 408
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-ne p0, v4, :cond_15

    .line 413
    .line 414
    const p0, 0x7fffffff

    .line 415
    .line 416
    .line 417
    iput p0, v3, La/kie0;->a:I

    .line 418
    .line 419
    :cond_15
    iget p0, v3, La/kie0;->a:I

    .line 420
    .line 421
    if-gt p1, p0, :cond_16

    .line 422
    .line 423
    sub-int/2addr p0, p1

    .line 424
    iput p0, v3, La/kie0;->a:I

    .line 425
    .line 426
    move v1, v5

    .line 427
    goto :goto_b

    .line 428
    :cond_16
    iput v6, v2, La/kie0;->a:I

    .line 429
    .line 430
    iput v0, v3, La/kie0;->a:I

    .line 431
    .line 432
    :goto_b
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    return-object p0

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
