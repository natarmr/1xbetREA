.class public abstract La/mqw0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, La/qgx0;->a:I

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, La/mqw0;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v1
.end method

.method public static a()V
    .locals 14

    .line 1
    sget-object v0, La/n6x0;->b:La/n6x0;

    .line 2
    .line 3
    sget-object v1, La/rqw0;->b:La/rqw0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/n6x0;->b(La/rqw0;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/rqw0;->c:La/h7x0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, La/r8x0;->a()V

    .line 14
    .line 15
    .line 16
    sget v1, La/wqw0;->e:I

    .line 17
    .line 18
    invoke-static {v1}, La/esw0;->a(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_8

    .line 23
    .line 24
    sget-object v2, La/k6x0;->b:La/k6x0;

    .line 25
    .line 26
    sget-object v3, La/ruw0;->a:La/y6x0;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, La/k6x0;->f(La/y6x0;)V

    .line 29
    .line 30
    .line 31
    sget-object v3, La/ruw0;->b:La/u6x0;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, La/k6x0;->e(La/u6x0;)V

    .line 34
    .line 35
    .line 36
    sget-object v3, La/ruw0;->c:La/j5x0;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, La/k6x0;->d(La/j5x0;)V

    .line 39
    .line 40
    .line 41
    sget-object v3, La/ruw0;->d:La/e5x0;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, La/k6x0;->c(La/e5x0;)V

    .line 44
    .line 45
    .line 46
    sget-object v3, La/wqw0;->a:La/h7x0;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, La/n6x0;->c(La/h7x0;)V

    .line 49
    .line 50
    .line 51
    sget-object v3, La/i6x0;->b:La/i6x0;

    .line 52
    .line 53
    new-instance v4, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v5, "AES128_CTR_HMAC_SHA256"

    .line 59
    .line 60
    sget-object v6, La/ysw0;->e:La/brw0;

    .line 61
    .line 62
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-static {}, La/brw0;->b()La/zcw0;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/16 v6, 0x10

    .line 70
    .line 71
    invoke-virtual {v5, v6}, La/zcw0;->d(I)V

    .line 72
    .line 73
    .line 74
    const/16 v7, 0x20

    .line 75
    .line 76
    invoke-virtual {v5, v7}, La/zcw0;->f(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v6}, La/zcw0;->m(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v6}, La/zcw0;->j(I)V

    .line 83
    .line 84
    .line 85
    sget-object v8, La/fhn;->g:La/fhn;

    .line 86
    .line 87
    iput-object v8, v5, La/zcw0;->e:Ljava/lang/Object;

    .line 88
    .line 89
    sget-object v9, La/arw0;->e:La/arw0;

    .line 90
    .line 91
    iput-object v9, v5, La/zcw0;->f:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v5}, La/zcw0;->a()La/brw0;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const-string v10, "AES128_CTR_HMAC_SHA256_RAW"

    .line 98
    .line 99
    invoke-virtual {v4, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    const-string v5, "AES256_CTR_HMAC_SHA256"

    .line 103
    .line 104
    sget-object v10, La/ysw0;->f:La/brw0;

    .line 105
    .line 106
    invoke-virtual {v4, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-static {}, La/brw0;->b()La/zcw0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5, v7}, La/zcw0;->d(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v7}, La/zcw0;->f(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v7}, La/zcw0;->m(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v6}, La/zcw0;->j(I)V

    .line 123
    .line 124
    .line 125
    iput-object v8, v5, La/zcw0;->e:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v9, v5, La/zcw0;->f:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {v5}, La/zcw0;->a()La/brw0;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    const-string v8, "AES256_CTR_HMAC_SHA256_RAW"

    .line 134
    .line 135
    invoke-virtual {v4, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v3, v4}, La/i6x0;->b(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    sget-object v4, La/e6x0;->b:La/e6x0;

    .line 146
    .line 147
    sget-object v5, La/wqw0;->c:La/zqw0;

    .line 148
    .line 149
    const-class v8, La/brw0;

    .line 150
    .line 151
    invoke-virtual {v4, v5, v8}, La/e6x0;->a(La/zqw0;Ljava/lang/Class;)V

    .line 152
    .line 153
    .line 154
    sget-object v5, La/b6x0;->b:La/b6x0;

    .line 155
    .line 156
    sget-object v9, La/wqw0;->d:La/yqw0;

    .line 157
    .line 158
    invoke-virtual {v5, v9, v8}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 159
    .line 160
    .line 161
    sget-object v8, La/a5x0;->d:La/a5x0;

    .line 162
    .line 163
    sget-object v9, La/wqw0;->b:La/l5x0;

    .line 164
    .line 165
    const/4 v10, 0x1

    .line 166
    invoke-virtual {v8, v9, v1, v10}, La/a5x0;->b(La/l5x0;IZ)V

    .line 167
    .line 168
    .line 169
    sget v1, La/lrw0;->e:I

    .line 170
    .line 171
    invoke-static {v1}, La/esw0;->a(I)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v9, :cond_7

    .line 176
    .line 177
    sget-object v9, La/pvw0;->a:La/y6x0;

    .line 178
    .line 179
    invoke-virtual {v2, v9}, La/k6x0;->f(La/y6x0;)V

    .line 180
    .line 181
    .line 182
    sget-object v9, La/pvw0;->b:La/u6x0;

    .line 183
    .line 184
    invoke-virtual {v2, v9}, La/k6x0;->e(La/u6x0;)V

    .line 185
    .line 186
    .line 187
    sget-object v9, La/pvw0;->c:La/j5x0;

    .line 188
    .line 189
    invoke-virtual {v2, v9}, La/k6x0;->d(La/j5x0;)V

    .line 190
    .line 191
    .line 192
    sget-object v9, La/pvw0;->d:La/e5x0;

    .line 193
    .line 194
    invoke-virtual {v2, v9}, La/k6x0;->c(La/e5x0;)V

    .line 195
    .line 196
    .line 197
    sget-object v9, La/lrw0;->a:La/h7x0;

    .line 198
    .line 199
    invoke-virtual {v0, v9}, La/n6x0;->c(La/h7x0;)V

    .line 200
    .line 201
    .line 202
    new-instance v9, Ljava/util/HashMap;

    .line 203
    .line 204
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 205
    .line 206
    .line 207
    const-string v11, "AES128_GCM"

    .line 208
    .line 209
    sget-object v12, La/ysw0;->a:La/mrw0;

    .line 210
    .line 211
    invoke-virtual {v9, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-static {}, La/mrw0;->b()La/h0q0;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-virtual {v11}, La/h0q0;->G()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v6}, La/h0q0;->I(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11}, La/h0q0;->K()V

    .line 225
    .line 226
    .line 227
    sget-object v12, La/p50;->k:La/p50;

    .line 228
    .line 229
    iput-object v12, v11, La/h0q0;->d:Ljava/lang/Object;

    .line 230
    .line 231
    invoke-virtual {v11}, La/h0q0;->D()La/mrw0;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    const-string v13, "AES128_GCM_RAW"

    .line 236
    .line 237
    invoke-virtual {v9, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    const-string v11, "AES256_GCM"

    .line 241
    .line 242
    sget-object v13, La/ysw0;->b:La/mrw0;

    .line 243
    .line 244
    invoke-virtual {v9, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    invoke-static {}, La/mrw0;->b()La/h0q0;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-virtual {v11}, La/h0q0;->G()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v11, v7}, La/h0q0;->I(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v11}, La/h0q0;->K()V

    .line 258
    .line 259
    .line 260
    iput-object v12, v11, La/h0q0;->d:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-virtual {v11}, La/h0q0;->D()La/mrw0;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    const-string v12, "AES256_GCM_RAW"

    .line 267
    .line 268
    invoke-virtual {v9, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-virtual {v3, v9}, La/i6x0;->b(Ljava/util/Map;)V

    .line 276
    .line 277
    .line 278
    sget-object v9, La/lrw0;->c:La/zqw0;

    .line 279
    .line 280
    const-class v11, La/mrw0;

    .line 281
    .line 282
    invoke-virtual {v4, v9, v11}, La/e6x0;->a(La/zqw0;Ljava/lang/Class;)V

    .line 283
    .line 284
    .line 285
    sget-object v9, La/lrw0;->d:La/yqw0;

    .line 286
    .line 287
    invoke-virtual {v5, v9, v11}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 288
    .line 289
    .line 290
    sget-object v9, La/lrw0;->b:La/l5x0;

    .line 291
    .line 292
    invoke-virtual {v8, v9, v1, v10}, La/a5x0;->b(La/l5x0;IZ)V

    .line 293
    .line 294
    .line 295
    invoke-static {}, La/pyw0;->a()Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-eqz v1, :cond_0

    .line 300
    .line 301
    return-void

    .line 302
    :cond_0
    sget-object v1, La/irw0;->a:La/h7x0;

    .line 303
    .line 304
    invoke-static {v10}, La/esw0;->d(I)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_6

    .line 309
    .line 310
    sget-object v1, La/dvw0;->a:La/y6x0;

    .line 311
    .line 312
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 313
    .line 314
    .line 315
    sget-object v1, La/dvw0;->b:La/u6x0;

    .line 316
    .line 317
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 318
    .line 319
    .line 320
    sget-object v1, La/dvw0;->c:La/j5x0;

    .line 321
    .line 322
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 323
    .line 324
    .line 325
    sget-object v1, La/dvw0;->d:La/e5x0;

    .line 326
    .line 327
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 328
    .line 329
    .line 330
    sget-object v1, La/irw0;->a:La/h7x0;

    .line 331
    .line 332
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 333
    .line 334
    .line 335
    new-instance v1, Ljava/util/HashMap;

    .line 336
    .line 337
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 338
    .line 339
    .line 340
    const-string v9, "AES128_EAX"

    .line 341
    .line 342
    sget-object v11, La/ysw0;->c:La/jrw0;

    .line 343
    .line 344
    invoke-virtual {v1, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    invoke-static {}, La/jrw0;->b()La/fht0;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    invoke-virtual {v9, v6}, La/fht0;->u(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v9, v6}, La/fht0;->x(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v9}, La/fht0;->A()V

    .line 358
    .line 359
    .line 360
    sget-object v11, La/drq;->g:La/drq;

    .line 361
    .line 362
    iput-object v11, v9, La/fht0;->d:Ljava/lang/Object;

    .line 363
    .line 364
    invoke-virtual {v9}, La/fht0;->r()La/jrw0;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    const-string v12, "AES128_EAX_RAW"

    .line 369
    .line 370
    invoke-virtual {v1, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    const-string v9, "AES256_EAX"

    .line 374
    .line 375
    sget-object v12, La/ysw0;->d:La/jrw0;

    .line 376
    .line 377
    invoke-virtual {v1, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    invoke-static {}, La/jrw0;->b()La/fht0;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    invoke-virtual {v9, v6}, La/fht0;->u(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v9, v7}, La/fht0;->x(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9}, La/fht0;->A()V

    .line 391
    .line 392
    .line 393
    iput-object v11, v9, La/fht0;->d:Ljava/lang/Object;

    .line 394
    .line 395
    invoke-virtual {v9}, La/fht0;->r()La/jrw0;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    const-string v11, "AES256_EAX_RAW"

    .line 400
    .line 401
    invoke-virtual {v1, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v3, v1}, La/i6x0;->b(Ljava/util/Map;)V

    .line 409
    .line 410
    .line 411
    sget-object v1, La/irw0;->c:La/yqw0;

    .line 412
    .line 413
    const-class v9, La/jrw0;

    .line 414
    .line 415
    invoke-virtual {v5, v1, v9}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 416
    .line 417
    .line 418
    sget-object v1, La/irw0;->b:La/l5x0;

    .line 419
    .line 420
    invoke-virtual {v8, v1, v10}, La/a5x0;->c(La/l5x0;Z)V

    .line 421
    .line 422
    .line 423
    sget-object v1, La/prw0;->a:La/h7x0;

    .line 424
    .line 425
    invoke-static {v10}, La/esw0;->d(I)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_5

    .line 430
    .line 431
    sget-object v1, La/fww0;->a:La/y6x0;

    .line 432
    .line 433
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 434
    .line 435
    .line 436
    sget-object v1, La/fww0;->b:La/u6x0;

    .line 437
    .line 438
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 439
    .line 440
    .line 441
    sget-object v1, La/fww0;->c:La/j5x0;

    .line 442
    .line 443
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 444
    .line 445
    .line 446
    sget-object v1, La/fww0;->d:La/e5x0;

    .line 447
    .line 448
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 449
    .line 450
    .line 451
    new-instance v1, Ljava/util/HashMap;

    .line 452
    .line 453
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-static {}, La/srw0;->b()La/okt0;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    invoke-virtual {v9, v6}, La/okt0;->p(I)V

    .line 461
    .line 462
    .line 463
    sget-object v11, La/m60;->h:La/m60;

    .line 464
    .line 465
    iput-object v11, v9, La/okt0;->b:Ljava/lang/Object;

    .line 466
    .line 467
    invoke-virtual {v9}, La/okt0;->m()La/srw0;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    const-string v12, "AES128_GCM_SIV"

    .line 472
    .line 473
    invoke-virtual {v1, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    invoke-static {}, La/srw0;->b()La/okt0;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    invoke-virtual {v9, v6}, La/okt0;->p(I)V

    .line 481
    .line 482
    .line 483
    sget-object v6, La/m60;->j:La/m60;

    .line 484
    .line 485
    iput-object v6, v9, La/okt0;->b:Ljava/lang/Object;

    .line 486
    .line 487
    invoke-virtual {v9}, La/okt0;->m()La/srw0;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    const-string v12, "AES128_GCM_SIV_RAW"

    .line 492
    .line 493
    invoke-virtual {v1, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    invoke-static {}, La/srw0;->b()La/okt0;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    invoke-virtual {v9, v7}, La/okt0;->p(I)V

    .line 501
    .line 502
    .line 503
    iput-object v11, v9, La/okt0;->b:Ljava/lang/Object;

    .line 504
    .line 505
    invoke-virtual {v9}, La/okt0;->m()La/srw0;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    const-string v11, "AES256_GCM_SIV"

    .line 510
    .line 511
    invoke-virtual {v1, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    invoke-static {}, La/srw0;->b()La/okt0;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-virtual {v9, v7}, La/okt0;->p(I)V

    .line 519
    .line 520
    .line 521
    iput-object v6, v9, La/okt0;->b:Ljava/lang/Object;

    .line 522
    .line 523
    invoke-virtual {v9}, La/okt0;->m()La/srw0;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    const-string v7, "AES256_GCM_SIV_RAW"

    .line 528
    .line 529
    invoke-virtual {v1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v3, v1}, La/i6x0;->b(Ljava/util/Map;)V

    .line 537
    .line 538
    .line 539
    sget-object v1, La/prw0;->c:La/zqw0;

    .line 540
    .line 541
    const-class v6, La/srw0;

    .line 542
    .line 543
    invoke-virtual {v4, v1, v6}, La/e6x0;->a(La/zqw0;Ljava/lang/Class;)V

    .line 544
    .line 545
    .line 546
    sget-object v1, La/prw0;->b:La/yqw0;

    .line 547
    .line 548
    invoke-virtual {v5, v1, v6}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 549
    .line 550
    .line 551
    sget-object v1, La/prw0;->a:La/h7x0;

    .line 552
    .line 553
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 554
    .line 555
    .line 556
    sget-object v1, La/prw0;->d:La/l5x0;

    .line 557
    .line 558
    invoke-virtual {v8, v1, v10}, La/a5x0;->c(La/l5x0;Z)V

    .line 559
    .line 560
    .line 561
    sget-object v1, La/urw0;->a:La/h7x0;

    .line 562
    .line 563
    invoke-static {v10}, La/esw0;->d(I)Z

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    if-eqz v1, :cond_4

    .line 568
    .line 569
    sget-object v1, La/rww0;->a:La/y6x0;

    .line 570
    .line 571
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 572
    .line 573
    .line 574
    sget-object v1, La/rww0;->b:La/u6x0;

    .line 575
    .line 576
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 577
    .line 578
    .line 579
    sget-object v1, La/rww0;->c:La/j5x0;

    .line 580
    .line 581
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 582
    .line 583
    .line 584
    sget-object v1, La/rww0;->d:La/e5x0;

    .line 585
    .line 586
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 587
    .line 588
    .line 589
    sget-object v1, La/urw0;->a:La/h7x0;

    .line 590
    .line 591
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 592
    .line 593
    .line 594
    sget-object v1, La/urw0;->b:La/yqw0;

    .line 595
    .line 596
    const-class v6, La/vrw0;

    .line 597
    .line 598
    invoke-virtual {v5, v1, v6}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 599
    .line 600
    .line 601
    new-instance v1, Ljava/util/HashMap;

    .line 602
    .line 603
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 604
    .line 605
    .line 606
    sget-object v6, La/y60;->k:La/y60;

    .line 607
    .line 608
    new-instance v7, La/vrw0;

    .line 609
    .line 610
    invoke-direct {v7, v6}, La/vrw0;-><init>(La/y60;)V

    .line 611
    .line 612
    .line 613
    const-string v6, "CHACHA20_POLY1305"

    .line 614
    .line 615
    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    sget-object v6, La/y60;->m:La/y60;

    .line 619
    .line 620
    new-instance v7, La/vrw0;

    .line 621
    .line 622
    invoke-direct {v7, v6}, La/vrw0;-><init>(La/y60;)V

    .line 623
    .line 624
    .line 625
    const-string v6, "CHACHA20_POLY1305_RAW"

    .line 626
    .line 627
    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    invoke-virtual {v3, v1}, La/i6x0;->b(Ljava/util/Map;)V

    .line 635
    .line 636
    .line 637
    sget-object v1, La/urw0;->c:La/l5x0;

    .line 638
    .line 639
    invoke-virtual {v8, v1, v10}, La/a5x0;->c(La/l5x0;Z)V

    .line 640
    .line 641
    .line 642
    sget-object v1, La/bsw0;->a:La/h7x0;

    .line 643
    .line 644
    invoke-static {v10}, La/esw0;->d(I)Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    if-eqz v1, :cond_3

    .line 649
    .line 650
    sget-object v1, La/psw0;->a:La/y6x0;

    .line 651
    .line 652
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 653
    .line 654
    .line 655
    sget-object v1, La/psw0;->b:La/u6x0;

    .line 656
    .line 657
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 658
    .line 659
    .line 660
    sget-object v1, La/psw0;->c:La/j5x0;

    .line 661
    .line 662
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 663
    .line 664
    .line 665
    sget-object v1, La/psw0;->d:La/e5x0;

    .line 666
    .line 667
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 668
    .line 669
    .line 670
    sget-object v1, La/bsw0;->a:La/h7x0;

    .line 671
    .line 672
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 673
    .line 674
    .line 675
    sget-object v1, La/bsw0;->c:La/yqw0;

    .line 676
    .line 677
    const-class v6, La/msw0;

    .line 678
    .line 679
    invoke-virtual {v5, v1, v6}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 680
    .line 681
    .line 682
    sget-object v1, La/bsw0;->b:La/l5x0;

    .line 683
    .line 684
    invoke-virtual {v8, v1, v10}, La/a5x0;->c(La/l5x0;Z)V

    .line 685
    .line 686
    .line 687
    sget-object v1, La/gsw0;->a:La/l5x0;

    .line 688
    .line 689
    invoke-static {v10}, La/esw0;->d(I)Z

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    if-eqz v1, :cond_2

    .line 694
    .line 695
    sget-object v1, La/wsw0;->a:La/y6x0;

    .line 696
    .line 697
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 698
    .line 699
    .line 700
    sget-object v1, La/wsw0;->b:La/u6x0;

    .line 701
    .line 702
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 703
    .line 704
    .line 705
    sget-object v1, La/wsw0;->c:La/j5x0;

    .line 706
    .line 707
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 708
    .line 709
    .line 710
    sget-object v1, La/wsw0;->d:La/e5x0;

    .line 711
    .line 712
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 713
    .line 714
    .line 715
    sget-object v1, La/gsw0;->b:La/yqw0;

    .line 716
    .line 717
    const-class v6, La/tsw0;

    .line 718
    .line 719
    invoke-virtual {v5, v1, v6}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 720
    .line 721
    .line 722
    sget-object v1, La/gsw0;->c:La/h7x0;

    .line 723
    .line 724
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 725
    .line 726
    .line 727
    sget-object v1, La/gsw0;->a:La/l5x0;

    .line 728
    .line 729
    invoke-virtual {v8, v1, v10}, La/a5x0;->c(La/l5x0;Z)V

    .line 730
    .line 731
    .line 732
    sget-object v1, La/guw0;->a:La/h7x0;

    .line 733
    .line 734
    invoke-static {v10}, La/esw0;->d(I)Z

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    if-eqz v1, :cond_1

    .line 739
    .line 740
    sget-object v1, La/ayw0;->a:La/y6x0;

    .line 741
    .line 742
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 743
    .line 744
    .line 745
    sget-object v1, La/ayw0;->b:La/u6x0;

    .line 746
    .line 747
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 748
    .line 749
    .line 750
    sget-object v1, La/ayw0;->c:La/j5x0;

    .line 751
    .line 752
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 753
    .line 754
    .line 755
    sget-object v1, La/ayw0;->d:La/e5x0;

    .line 756
    .line 757
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 758
    .line 759
    .line 760
    sget-object v1, La/guw0;->a:La/h7x0;

    .line 761
    .line 762
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 763
    .line 764
    .line 765
    new-instance v1, Ljava/util/HashMap;

    .line 766
    .line 767
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 768
    .line 769
    .line 770
    sget-object v6, La/fhn;->j:La/fhn;

    .line 771
    .line 772
    new-instance v7, La/muw0;

    .line 773
    .line 774
    invoke-direct {v7, v6}, La/muw0;-><init>(La/fhn;)V

    .line 775
    .line 776
    .line 777
    const-string v6, "XCHACHA20_POLY1305"

    .line 778
    .line 779
    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    sget-object v6, La/fhn;->l:La/fhn;

    .line 783
    .line 784
    new-instance v7, La/muw0;

    .line 785
    .line 786
    invoke-direct {v7, v6}, La/muw0;-><init>(La/fhn;)V

    .line 787
    .line 788
    .line 789
    const-string v6, "XCHACHA20_POLY1305_RAW"

    .line 790
    .line 791
    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-virtual {v3, v1}, La/i6x0;->b(Ljava/util/Map;)V

    .line 799
    .line 800
    .line 801
    sget-object v1, La/guw0;->d:La/yqw0;

    .line 802
    .line 803
    const-class v6, La/muw0;

    .line 804
    .line 805
    invoke-virtual {v5, v1, v6}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 806
    .line 807
    .line 808
    sget-object v1, La/guw0;->c:La/zqw0;

    .line 809
    .line 810
    invoke-virtual {v4, v1, v6}, La/e6x0;->a(La/zqw0;Ljava/lang/Class;)V

    .line 811
    .line 812
    .line 813
    sget-object v1, La/guw0;->b:La/l5x0;

    .line 814
    .line 815
    invoke-virtual {v8, v1, v10}, La/a5x0;->c(La/l5x0;Z)V

    .line 816
    .line 817
    .line 818
    sget-object v1, La/yxw0;->a:La/y6x0;

    .line 819
    .line 820
    invoke-virtual {v2, v1}, La/k6x0;->f(La/y6x0;)V

    .line 821
    .line 822
    .line 823
    sget-object v1, La/yxw0;->b:La/u6x0;

    .line 824
    .line 825
    invoke-virtual {v2, v1}, La/k6x0;->e(La/u6x0;)V

    .line 826
    .line 827
    .line 828
    sget-object v1, La/yxw0;->c:La/j5x0;

    .line 829
    .line 830
    invoke-virtual {v2, v1}, La/k6x0;->d(La/j5x0;)V

    .line 831
    .line 832
    .line 833
    sget-object v1, La/yxw0;->d:La/e5x0;

    .line 834
    .line 835
    invoke-virtual {v2, v1}, La/k6x0;->c(La/e5x0;)V

    .line 836
    .line 837
    .line 838
    new-instance v1, Ljava/util/HashMap;

    .line 839
    .line 840
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 841
    .line 842
    .line 843
    const-string v2, "XAES_256_GCM_192_BIT_NONCE"

    .line 844
    .line 845
    sget-object v4, La/ysw0;->g:La/xtw0;

    .line 846
    .line 847
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    const-string v2, "XAES_256_GCM_192_BIT_NONCE_NO_PREFIX"

    .line 851
    .line 852
    sget-object v4, La/ysw0;->h:La/xtw0;

    .line 853
    .line 854
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    const-string v2, "XAES_256_GCM_160_BIT_NONCE_NO_PREFIX"

    .line 858
    .line 859
    sget-object v4, La/ysw0;->i:La/xtw0;

    .line 860
    .line 861
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    const-string v2, "X_AES_GCM_8_BYTE_SALT_NO_PREFIX"

    .line 865
    .line 866
    sget-object v4, La/ysw0;->j:La/xtw0;

    .line 867
    .line 868
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    invoke-virtual {v3, v1}, La/i6x0;->b(Ljava/util/Map;)V

    .line 876
    .line 877
    .line 878
    sget-object v1, La/wtw0;->b:La/h7x0;

    .line 879
    .line 880
    invoke-virtual {v0, v1}, La/n6x0;->c(La/h7x0;)V

    .line 881
    .line 882
    .line 883
    sget-object v0, La/wtw0;->a:La/yqw0;

    .line 884
    .line 885
    const-class v1, La/xtw0;

    .line 886
    .line 887
    invoke-virtual {v5, v0, v1}, La/b6x0;->a(La/yqw0;Ljava/lang/Class;)V

    .line 888
    .line 889
    .line 890
    return-void

    .line 891
    :cond_1
    const-string v0, "Registering XChaCha20Poly1305 is not supported in FIPS mode"

    .line 892
    .line 893
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    return-void

    .line 897
    :cond_2
    const-string v0, "Registering KMS Envelope AEAD is not supported in FIPS mode"

    .line 898
    .line 899
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    return-void

    .line 903
    :cond_3
    const-string v0, "Registering KMS AEAD is not supported in FIPS mode"

    .line 904
    .line 905
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    return-void

    .line 909
    :cond_4
    const-string v0, "Registering ChaCha20Poly1305 is not supported in FIPS mode"

    .line 910
    .line 911
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    return-void

    .line 915
    :cond_5
    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    .line 916
    .line 917
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    return-void

    .line 921
    :cond_6
    const-string v0, "Registering AES EAX is not supported in FIPS mode"

    .line 922
    .line 923
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    return-void

    .line 927
    :cond_7
    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    .line 928
    .line 929
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    return-void

    .line 933
    :cond_8
    const-string v0, "Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available."

    .line 934
    .line 935
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    return-void
.end method
