.class public final La/ci2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ci2;->a:B

    iput-object p1, p0, La/ci2;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ci2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ci2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/nk7;

    .line 17
    .line 18
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, La/nk7;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/nk7;

    .line 40
    .line 41
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, La/nk7;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    new-instance v1, La/stg0;

    .line 65
    .line 66
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/f8k0;

    .line 69
    .line 70
    iget-object p0, p0, La/f8k0;->c:La/h8k0;

    .line 71
    .line 72
    invoke-direct {v1, p1, p0}, La/stg0;-><init>(FLa/h8k0;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/o8w;

    .line 96
    .line 97
    if-ne p1, v2, :cond_0

    .line 98
    .line 99
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, La/z77;

    .line 102
    .line 103
    check-cast p0, La/x77;

    .line 104
    .line 105
    iget-object p0, p0, La/x77;->i:La/qgv0;

    .line 106
    .line 107
    if-eqz p0, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    sget-object p1, La/sre0;->a:La/tre0;

    .line 115
    .line 116
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    :goto_0
    return-object p0

    .line 121
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La/os6;

    .line 130
    .line 131
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {v0, v1, p0}, La/os6;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, La/h26;

    .line 157
    .line 158
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {v0, p0}, La/h26;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, La/h26;

    .line 180
    .line 181
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {v0, p0}, La/h26;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0

    .line 194
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, La/h26;

    .line 203
    .line 204
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p0, Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {v0, p0}, La/h26;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0

    .line 217
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, La/h26;

    .line 226
    .line 227
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p0, Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {v0, p0}, La/h26;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0

    .line 240
    :pswitch_8
    check-cast p1, La/gky;

    .line 241
    .line 242
    iget-object p1, p1, La/gky;->a:Landroid/view/KeyEvent;

    .line 243
    .line 244
    iget-object p1, p0, La/ci2;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p1, La/pz40;

    .line 247
    .line 248
    iget-object p0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, La/bxq0;

    .line 251
    .line 252
    invoke-virtual {p0}, La/bxq0;->b()Z

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    if-nez p0, :cond_1

    .line 257
    .line 258
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-interface {p1, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, La/ij4;

    .line 275
    .line 276
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-virtual {v0, p0}, La/ij4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    return-object p0

    .line 289
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, La/ij4;

    .line 298
    .line 299
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p0, Ljava/util/List;

    .line 302
    .line 303
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-virtual {v0, p0}, La/ij4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, La/ij4;

    .line 321
    .line 322
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast p0, La/a4x;

    .line 325
    .line 326
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-virtual {v0, p0}, La/ij4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, La/o33;

    .line 344
    .line 345
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast p0, La/a4x;

    .line 352
    .line 353
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    invoke-virtual {v0, v1, p0}, La/o33;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    return-object p0

    .line 362
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, La/or3;

    .line 371
    .line 372
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast p0, Ljava/util/List;

    .line 375
    .line 376
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-virtual {v0, p0}, La/or3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    return-object p0

    .line 385
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, La/o33;

    .line 394
    .line 395
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast p0, Ljava/util/List;

    .line 402
    .line 403
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    invoke-virtual {v0, v1, p0}, La/o33;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    return-object p0

    .line 412
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 413
    .line 414
    iget-object p1, p0, La/ci2;->c:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast p1, La/t23;

    .line 417
    .line 418
    iget-object p1, p1, La/t23;->a:Landroid/view/Choreographer;

    .line 419
    .line 420
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast p0, La/s23;

    .line 423
    .line 424
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 425
    .line 426
    .line 427
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object p0

    .line 430
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 431
    .line 432
    iget-object p1, p0, La/ci2;->c:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast p1, La/r23;

    .line 435
    .line 436
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast p0, La/s23;

    .line 439
    .line 440
    iget-object v0, p1, La/r23;->e:Ljava/lang/Object;

    .line 441
    .line 442
    monitor-enter v0

    .line 443
    :try_start_0
    iget-object p1, p1, La/r23;->g:Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    .line 447
    .line 448
    monitor-exit v0

    .line 449
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object p0

    .line 452
    :catchall_0
    move-exception p0

    .line 453
    monitor-exit v0

    .line 454
    throw p0

    .line 455
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 456
    .line 457
    iget-object p1, p0, La/ci2;->c:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast p1, La/yex;

    .line 460
    .line 461
    iget-object v0, p1, La/yex;->c:Ljava/lang/Object;

    .line 462
    .line 463
    monitor-enter v0

    .line 464
    :try_start_1
    iput-boolean v2, p1, La/yex;->e:Z

    .line 465
    .line 466
    iget-object v2, p1, La/yex;->d:La/xz40;

    .line 467
    .line 468
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 469
    .line 470
    iget v2, v2, La/xz40;->c:I

    .line 471
    .line 472
    const/4 v4, 0x0

    .line 473
    :goto_1
    if-ge v4, v2, :cond_3

    .line 474
    .line 475
    aget-object v5, v3, v4

    .line 476
    .line 477
    check-cast v5, La/g1v0;

    .line 478
    .line 479
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    check-cast v5, La/q860;

    .line 484
    .line 485
    if-eqz v5, :cond_2

    .line 486
    .line 487
    iget-object v6, v5, La/q860;->b:La/hge0;

    .line 488
    .line 489
    if-eqz v6, :cond_2

    .line 490
    .line 491
    invoke-virtual {v6}, La/hge0;->closeConnection()V

    .line 492
    .line 493
    .line 494
    iput-object v1, v5, La/q860;->b:La/hge0;

    .line 495
    .line 496
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 497
    .line 498
    goto :goto_1

    .line 499
    :catchall_1
    move-exception p0

    .line 500
    goto :goto_2

    .line 501
    :cond_3
    iget-object p1, p1, La/yex;->d:La/xz40;

    .line 502
    .line 503
    invoke-virtual {p1}, La/xz40;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 504
    .line 505
    .line 506
    monitor-exit v0

    .line 507
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast p0, La/c13;

    .line 510
    .line 511
    iget-object p0, p0, La/c13;->b:La/o8q0;

    .line 512
    .line 513
    iget-object p1, p0, La/o8q0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 514
    .line 515
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    iget-object p0, p0, La/o8q0;->a:La/qw90;

    .line 519
    .line 520
    invoke-interface {p0}, La/qw90;->b()V

    .line 521
    .line 522
    .line 523
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 524
    .line 525
    return-object p0

    .line 526
    :goto_2
    monitor-exit v0

    .line 527
    throw p0

    .line 528
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 529
    .line 530
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, La/xd2;

    .line 537
    .line 538
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast p0, Ljava/util/List;

    .line 541
    .line 542
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object p0

    .line 546
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    return-object p0

    .line 551
    :pswitch_13
    check-cast p1, Ljava/lang/String;

    .line 552
    .line 553
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v0, La/on2;

    .line 556
    .line 557
    check-cast v0, La/nn2;

    .line 558
    .line 559
    iget-object v0, v0, La/nn2;->b:La/vm2;

    .line 560
    .line 561
    instance-of v2, v0, La/um2;

    .line 562
    .line 563
    if-eqz v2, :cond_4

    .line 564
    .line 565
    move-object v1, v0

    .line 566
    check-cast v1, La/um2;

    .line 567
    .line 568
    :cond_4
    if-eqz v1, :cond_5

    .line 569
    .line 570
    iget-object v0, v1, La/um2;->a:La/nxy;

    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    new-instance v1, La/um2;

    .line 576
    .line 577
    invoke-direct {v1, v0, p1}, La/um2;-><init>(La/nxy;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    move-object v0, v1

    .line 581
    :cond_5
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 584
    .line 585
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 589
    .line 590
    return-object p0

    .line 591
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 592
    .line 593
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 594
    .line 595
    .line 596
    move-result p1

    .line 597
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, La/xd2;

    .line 600
    .line 601
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast p0, La/a4x;

    .line 604
    .line 605
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    return-object p0

    .line 614
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 615
    .line 616
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v0, La/xd2;

    .line 623
    .line 624
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast p0, La/a4x;

    .line 627
    .line 628
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    return-object p0

    .line 637
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 638
    .line 639
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 640
    .line 641
    .line 642
    move-result p1

    .line 643
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v0, La/ma2;

    .line 646
    .line 647
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast p0, La/a4x;

    .line 654
    .line 655
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object p0

    .line 659
    invoke-virtual {v0, v1, p0}, La/ma2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    return-object p0

    .line 664
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 665
    .line 666
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 667
    .line 668
    .line 669
    move-result p1

    .line 670
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, La/xd2;

    .line 673
    .line 674
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast p0, La/a4x;

    .line 677
    .line 678
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    return-object p0

    .line 687
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 688
    .line 689
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 690
    .line 691
    .line 692
    move-result p1

    .line 693
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v0, La/xd2;

    .line 696
    .line 697
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast p0, La/a4x;

    .line 700
    .line 701
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object p0

    .line 705
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object p0

    .line 709
    return-object p0

    .line 710
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 711
    .line 712
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 713
    .line 714
    .line 715
    move-result p1

    .line 716
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v0, La/xd2;

    .line 719
    .line 720
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast p0, La/a4x;

    .line 723
    .line 724
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object p0

    .line 728
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object p0

    .line 732
    return-object p0

    .line 733
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 734
    .line 735
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 736
    .line 737
    .line 738
    move-result p1

    .line 739
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v0, La/xd2;

    .line 742
    .line 743
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast p0, La/a4x;

    .line 746
    .line 747
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object p0

    .line 751
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object p0

    .line 755
    return-object p0

    .line 756
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 757
    .line 758
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 759
    .line 760
    .line 761
    move-result p1

    .line 762
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, La/xd2;

    .line 765
    .line 766
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast p0, La/a4x;

    .line 769
    .line 770
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object p0

    .line 774
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object p0

    .line 778
    return-object p0

    .line 779
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 780
    .line 781
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 782
    .line 783
    .line 784
    move-result p1

    .line 785
    iget-object v0, p0, La/ci2;->c:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v0, La/xd2;

    .line 788
    .line 789
    iget-object p0, p0, La/ci2;->b:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast p0, La/a4x;

    .line 792
    .line 793
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object p0

    .line 797
    invoke-virtual {v0, p0}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object p0

    .line 801
    return-object p0

    .line 802
    nop

    .line 803
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
