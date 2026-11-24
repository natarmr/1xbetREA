.class public final synthetic La/lh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/on20;


# direct methods
.method public synthetic constructor <init>(La/on20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lh20;->a:B

    iput-object p1, p0, La/lh20;->b:La/on20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v0, v0, La/lh20;->b:La/on20;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/oyg0;

    .line 18
    .line 19
    move-object/from16 v7, p2

    .line 20
    .line 21
    check-cast v7, La/a820;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 30
    .line 31
    iget-object v1, v8, La/pvj0;->b:La/knb0;

    .line 32
    .line 33
    invoke-virtual {v0}, La/on20;->r0()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v1, v0, v6, v5}, La/knb0;->b(La/knb0;ZLjava/lang/String;I)La/knb0;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    const/4 v14, 0x0

    .line 42
    const/16 v15, 0x3d

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, 0x0

    .line 48
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    const/16 v23, 0x0

    .line 53
    .line 54
    const v24, 0x3ffef

    .line 55
    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const/16 v22, 0x0

    .line 74
    .line 75
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :pswitch_0
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, Ljava/lang/Throwable;

    .line 83
    .line 84
    move-object/from16 v2, p2

    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 95
    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    .line 103
    .line 104
    new-instance v1, La/ei20;

    .line 105
    .line 106
    invoke-direct {v1, v3}, La/ei20;-><init>(B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_0
    return-object v0

    .line 115
    :pswitch_1
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, La/oyg0;

    .line 118
    .line 119
    move-object/from16 v2, p2

    .line 120
    .line 121
    check-cast v2, La/a820;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v3, v2, La/a820;->d:La/xm5;

    .line 130
    .line 131
    iget-object v0, v0, La/on20;->v:La/pru;

    .line 132
    .line 133
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 138
    .line 139
    iget-object v0, v0, La/gx7;->a:La/gm7;

    .line 140
    .line 141
    iget-boolean v0, v0, La/gm7;->b:Z

    .line 142
    .line 143
    if-eqz v0, :cond_1

    .line 144
    .line 145
    sget-object v0, La/f40;->b:La/f40;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    sget-object v0, La/f40;->a:La/f40;

    .line 149
    .line 150
    :goto_1
    new-instance v7, La/h40;

    .line 151
    .line 152
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 153
    .line 154
    invoke-direct {v7, v4, v5, v0}, La/h40;-><init>(DLa/f40;)V

    .line 155
    .line 156
    .line 157
    const/4 v8, 0x7

    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v6, 0x0

    .line 161
    invoke-static/range {v3 .. v8}, La/xm5;->a(La/xm5;La/ke;ZLa/ql5;La/h40;I)La/xm5;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    const/16 v18, 0x0

    .line 166
    .line 167
    const v19, 0x3fff7

    .line 168
    .line 169
    .line 170
    const/4 v3, 0x0

    .line 171
    const/4 v7, 0x0

    .line 172
    const/4 v8, 0x0

    .line 173
    const/4 v9, 0x0

    .line 174
    const/4 v10, 0x0

    .line 175
    const/4 v11, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    const/4 v13, 0x0

    .line 178
    const/4 v14, 0x0

    .line 179
    const/4 v15, 0x0

    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    invoke-static/range {v2 .. v19}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :pswitch_2
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, La/oyg0;

    .line 192
    .line 193
    move-object/from16 v7, p2

    .line 194
    .line 195
    check-cast v7, La/a820;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v8, v7, La/a820;->b:La/txe;

    .line 204
    .line 205
    iget-object v1, v8, La/txe;->d:La/m0d;

    .line 206
    .line 207
    iget-object v9, v0, La/on20;->V:La/ivn;

    .line 208
    .line 209
    const-wide/16 v12, 0x0

    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const-wide/16 v10, 0x0

    .line 213
    .line 214
    invoke-virtual/range {v9 .. v14}, La/ivn;->g(DDZ)La/azc;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    sget-object v2, La/azc;->a:La/azc;

    .line 219
    .line 220
    const/16 v2, 0x43

    .line 221
    .line 222
    invoke-static {v1, v0, v6, v2}, La/m0d;->a(La/m0d;La/azc;La/o0d;I)La/m0d;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    const/16 v17, 0x77

    .line 229
    .line 230
    const-wide/16 v9, 0x0

    .line 231
    .line 232
    const/4 v11, 0x0

    .line 233
    const/4 v12, 0x0

    .line 234
    const/4 v14, 0x0

    .line 235
    const/4 v15, 0x0

    .line 236
    invoke-static/range {v8 .. v17}, La/txe;->a(La/txe;JILa/gao0;La/m0d;Ljava/lang/String;ZLa/h680;I)La/txe;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    const/16 v23, 0x0

    .line 241
    .line 242
    const v24, 0x3fffd

    .line 243
    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    const/4 v10, 0x0

    .line 247
    const/4 v11, 0x0

    .line 248
    const/4 v13, 0x0

    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    const/16 v18, 0x0

    .line 252
    .line 253
    const/16 v19, 0x0

    .line 254
    .line 255
    const/16 v20, 0x0

    .line 256
    .line 257
    const/16 v21, 0x0

    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    return-object v0

    .line 266
    :pswitch_3
    move-object/from16 v1, p1

    .line 267
    .line 268
    check-cast v1, La/oyg0;

    .line 269
    .line 270
    move-object/from16 v7, p2

    .line 271
    .line 272
    check-cast v7, La/a820;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 281
    .line 282
    iget-object v1, v8, La/pvj0;->b:La/knb0;

    .line 283
    .line 284
    iget-object v3, v8, La/pvj0;->a:La/bx6;

    .line 285
    .line 286
    iget-object v3, v3, La/bx6;->b:La/tw6;

    .line 287
    .line 288
    iget-boolean v3, v3, La/tw6;->p:Z

    .line 289
    .line 290
    invoke-virtual {v0, v3, v6}, La/on20;->h0(ZLjava/lang/Double;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-static {v1, v4, v3, v2}, La/knb0;->b(La/knb0;ZLjava/lang/String;I)La/knb0;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    const/4 v14, 0x0

    .line 299
    const/16 v15, 0x3d

    .line 300
    .line 301
    const/4 v9, 0x0

    .line 302
    const/4 v11, 0x0

    .line 303
    const/4 v12, 0x0

    .line 304
    const/4 v13, 0x0

    .line 305
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    iget-object v12, v7, La/a820;->g:La/hx4;

    .line 310
    .line 311
    iget-object v1, v12, La/hx4;->e:La/knb0;

    .line 312
    .line 313
    invoke-virtual {v0, v4, v6}, La/on20;->h0(ZLjava/lang/Double;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v1, v4, v0, v2}, La/knb0;->b(La/knb0;ZLjava/lang/String;I)La/knb0;

    .line 318
    .line 319
    .line 320
    move-result-object v17

    .line 321
    const/16 v18, 0x0

    .line 322
    .line 323
    const/16 v19, 0x2f

    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const/4 v15, 0x0

    .line 327
    const/16 v16, 0x0

    .line 328
    .line 329
    invoke-static/range {v12 .. v19}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    const/16 v23, 0x0

    .line 334
    .line 335
    const v24, 0x3ffaf

    .line 336
    .line 337
    .line 338
    const/4 v8, 0x0

    .line 339
    const/4 v10, 0x0

    .line 340
    const/4 v12, 0x0

    .line 341
    const/4 v15, 0x0

    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const/16 v19, 0x0

    .line 345
    .line 346
    const/16 v20, 0x0

    .line 347
    .line 348
    const/16 v21, 0x0

    .line 349
    .line 350
    const/16 v22, 0x0

    .line 351
    .line 352
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    return-object v0

    .line 357
    :pswitch_4
    move-object/from16 v1, p1

    .line 358
    .line 359
    check-cast v1, Ljava/lang/Throwable;

    .line 360
    .line 361
    move-object/from16 v4, p2

    .line 362
    .line 363
    check-cast v4, Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 372
    .line 373
    .line 374
    new-instance v1, La/pc20;

    .line 375
    .line 376
    new-instance v2, La/xdk0;

    .line 377
    .line 378
    sget-object v3, La/rek0;->b:La/rek0;

    .line 379
    .line 380
    const/4 v8, 0x0

    .line 381
    const/16 v9, 0x7c

    .line 382
    .line 383
    const/4 v5, 0x0

    .line 384
    const/4 v6, 0x0

    .line 385
    const/4 v7, 0x0

    .line 386
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 387
    .line 388
    .line 389
    invoke-direct {v1, v2}, La/pc20;-><init>(La/xdk0;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_5
    move-object/from16 v1, p1

    .line 399
    .line 400
    check-cast v1, Ljava/lang/Throwable;

    .line 401
    .line 402
    move-object/from16 v2, p2

    .line 403
    .line 404
    check-cast v2, Ljava/lang/String;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 413
    .line 414
    if-eqz v2, :cond_2

    .line 415
    .line 416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    goto :goto_2

    .line 419
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 420
    .line 421
    .line 422
    new-instance v1, La/lh20;

    .line 423
    .line 424
    const/16 v2, 0xa

    .line 425
    .line 426
    invoke-direct {v1, v0, v2}, La/lh20;-><init>(La/on20;B)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 430
    .line 431
    .line 432
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    :goto_2
    return-object v0

    .line 435
    :pswitch_6
    move-object/from16 v1, p1

    .line 436
    .line 437
    check-cast v1, Ljava/lang/Throwable;

    .line 438
    .line 439
    move-object/from16 v2, p2

    .line 440
    .line 441
    check-cast v2, Ljava/lang/String;

    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    new-instance v1, La/ei20;

    .line 450
    .line 451
    invoke-direct {v1, v5}, La/ei20;-><init>(B)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 455
    .line 456
    .line 457
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    :pswitch_7
    move-object/from16 v1, p1

    .line 461
    .line 462
    check-cast v1, La/oyg0;

    .line 463
    .line 464
    move-object/from16 v7, p2

    .line 465
    .line 466
    check-cast v7, La/a820;

    .line 467
    .line 468
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    iget-object v8, v7, La/a820;->b:La/txe;

    .line 475
    .line 476
    iget-object v1, v0, La/on20;->D:La/ctf0;

    .line 477
    .line 478
    iget-object v0, v0, La/on20;->O:La/vyt;

    .line 479
    .line 480
    invoke-virtual {v0}, La/vyt;->a()La/ezc;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_5

    .line 489
    .line 490
    if-eq v0, v2, :cond_4

    .line 491
    .line 492
    if-ne v0, v5, :cond_3

    .line 493
    .line 494
    const v0, 0x7f1315cf

    .line 495
    .line 496
    .line 497
    goto :goto_3

    .line 498
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 499
    .line 500
    .line 501
    goto :goto_4

    .line 502
    :cond_4
    const v0, 0x7f1315c7

    .line 503
    .line 504
    .line 505
    goto :goto_3

    .line 506
    :cond_5
    const v0, 0x7f1315ca

    .line 507
    .line 508
    .line 509
    :goto_3
    new-array v2, v4, [Ljava/lang/Object;

    .line 510
    .line 511
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 512
    .line 513
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v1, v0, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v14

    .line 521
    const/16 v16, 0x0

    .line 522
    .line 523
    const/16 v17, 0x6f

    .line 524
    .line 525
    const-wide/16 v9, 0x0

    .line 526
    .line 527
    const/4 v11, 0x0

    .line 528
    const/4 v12, 0x0

    .line 529
    const/4 v13, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    invoke-static/range {v8 .. v17}, La/txe;->a(La/txe;JILa/gao0;La/m0d;Ljava/lang/String;ZLa/h680;I)La/txe;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    const/16 v23, 0x0

    .line 536
    .line 537
    const v24, 0x3fffd

    .line 538
    .line 539
    .line 540
    const/4 v9, 0x0

    .line 541
    const/4 v10, 0x0

    .line 542
    const/4 v11, 0x0

    .line 543
    const/4 v14, 0x0

    .line 544
    const/16 v17, 0x0

    .line 545
    .line 546
    const/16 v18, 0x0

    .line 547
    .line 548
    const/16 v19, 0x0

    .line 549
    .line 550
    const/16 v20, 0x0

    .line 551
    .line 552
    const/16 v21, 0x0

    .line 553
    .line 554
    const/16 v22, 0x0

    .line 555
    .line 556
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 557
    .line 558
    .line 559
    move-result-object v6

    .line 560
    :goto_4
    return-object v6

    .line 561
    :pswitch_8
    move-object/from16 v1, p1

    .line 562
    .line 563
    check-cast v1, La/oyg0;

    .line 564
    .line 565
    move-object/from16 v2, p2

    .line 566
    .line 567
    check-cast v2, La/a820;

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    iget-object v3, v2, La/a820;->e:La/pvj0;

    .line 576
    .line 577
    iget-object v4, v3, La/pvj0;->c:La/iwo0;

    .line 578
    .line 579
    invoke-virtual {v0}, La/on20;->U()Z

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    sget-object v9, La/iun;->a:La/iun;

    .line 584
    .line 585
    const-wide/16 v7, 0x0

    .line 586
    .line 587
    const/16 v10, 0x14

    .line 588
    .line 589
    const/4 v6, 0x0

    .line 590
    invoke-static/range {v4 .. v10}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    const/4 v9, 0x0

    .line 595
    const/16 v10, 0x3b

    .line 596
    .line 597
    const/4 v4, 0x0

    .line 598
    const/4 v5, 0x0

    .line 599
    const/4 v7, 0x0

    .line 600
    const/4 v8, 0x0

    .line 601
    invoke-static/range {v3 .. v10}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    const/16 v18, 0x0

    .line 606
    .line 607
    const v19, 0x3ffef

    .line 608
    .line 609
    .line 610
    const/4 v3, 0x0

    .line 611
    const/4 v9, 0x0

    .line 612
    const/4 v10, 0x0

    .line 613
    const/4 v11, 0x0

    .line 614
    const/4 v12, 0x0

    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v14, 0x0

    .line 617
    const/4 v15, 0x0

    .line 618
    const/16 v16, 0x0

    .line 619
    .line 620
    const/16 v17, 0x0

    .line 621
    .line 622
    invoke-static/range {v2 .. v19}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    return-object v0

    .line 627
    :pswitch_9
    move-object/from16 v1, p1

    .line 628
    .line 629
    check-cast v1, Ljava/lang/Throwable;

    .line 630
    .line 631
    move-object/from16 v9, p2

    .line 632
    .line 633
    check-cast v9, Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v9, v1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 636
    .line 637
    .line 638
    instance-of v2, v1, La/zhi0;

    .line 639
    .line 640
    if-eqz v2, :cond_6

    .line 641
    .line 642
    new-instance v2, La/ffd;

    .line 643
    .line 644
    const/16 v5, 0x16

    .line 645
    .line 646
    invoke-direct {v2, v0, v1, v6, v5}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 647
    .line 648
    .line 649
    invoke-static {v0, v6, v6, v2, v3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 650
    .line 651
    .line 652
    check-cast v1, La/zhi0;

    .line 653
    .line 654
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 655
    .line 656
    invoke-virtual {v0, v1, v9, v4}, La/on20;->m0(La/kuw;Ljava/lang/String;Z)V

    .line 657
    .line 658
    .line 659
    goto :goto_5

    .line 660
    :cond_6
    invoke-static {v1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    if-eqz v1, :cond_7

    .line 665
    .line 666
    invoke-virtual {v0}, La/on20;->C0()V

    .line 667
    .line 668
    .line 669
    goto :goto_5

    .line 670
    :cond_7
    new-instance v1, La/pc20;

    .line 671
    .line 672
    new-instance v7, La/xdk0;

    .line 673
    .line 674
    sget-object v8, La/rek0;->b:La/rek0;

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const/16 v14, 0x7c

    .line 678
    .line 679
    const/4 v10, 0x0

    .line 680
    const/4 v11, 0x0

    .line 681
    const/4 v12, 0x0

    .line 682
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 683
    .line 684
    .line 685
    invoke-direct {v1, v7}, La/pc20;-><init>(La/xdk0;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    return-object v0

    .line 694
    nop

    .line 695
    :pswitch_data_0
    .packed-switch 0x0
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
