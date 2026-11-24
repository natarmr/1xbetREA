.class public final synthetic La/qir0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qir0;->a:B

    iput-object p1, p0, La/qir0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/qir0;->a:B

    .line 2
    .line 3
    sget-object v1, La/fa50;->a:La/fa50;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "viewModelFactory"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/qir0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/rat0;

    .line 15
    .line 16
    iget-object p0, p0, La/rat0;->a:La/mdm;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, La/v9t0;

    .line 20
    .line 21
    iget-object p0, p0, La/v9t0;->a:La/mdm;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    check-cast p0, La/m5t0;

    .line 25
    .line 26
    new-instance v0, La/q0h0;

    .line 27
    .line 28
    iget-object p0, p0, La/m5t0;->K1:La/myi;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v4

    .line 40
    :pswitch_2
    check-cast p0, La/x2t0;

    .line 41
    .line 42
    new-instance v0, La/ntj0;

    .line 43
    .line 44
    iget-object p0, p0, La/x2t0;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v0, p0}, La/ntj0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    check-cast p0, La/bgx;

    .line 51
    .line 52
    invoke-virtual {p0}, La/bgx;->d()F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_4
    check-cast p0, La/dws0;

    .line 62
    .line 63
    iget-object v0, p0, La/dws0;->i:La/p7m0;

    .line 64
    .line 65
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    move-object v1, p0

    .line 70
    check-cast v1, La/bws0;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/16 v8, 0x3e

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-static/range {v1 .. v8}, La/bws0;->a(La/bws0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)La/bws0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_5
    check-cast p0, La/nw8;

    .line 94
    .line 95
    new-instance v3, La/imm;

    .line 96
    .line 97
    new-instance v4, La/ilm;

    .line 98
    .line 99
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 100
    .line 101
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 106
    .line 107
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 112
    .line 113
    .line 114
    new-instance v5, La/plm;

    .line 115
    .line 116
    iget-object p0, p0, La/nw8;->b:La/ctf0;

    .line 117
    .line 118
    new-array v0, v2, [Ljava/lang/Object;

    .line 119
    .line 120
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 121
    .line 122
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const v2, 0x7f131693

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 138
    .line 139
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    invoke-direct {v5, p0, v6, v7, v1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 144
    .line 145
    .line 146
    new-instance v6, La/dmm;

    .line 147
    .line 148
    new-instance p0, La/ta50;

    .line 149
    .line 150
    new-instance v7, La/wkm;

    .line 151
    .line 152
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 157
    .line 158
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 159
    .line 160
    .line 161
    move-result-wide v12

    .line 162
    const/4 v8, 0x0

    .line 163
    const v9, 0x7f080965

    .line 164
    .line 165
    .line 166
    const/4 v10, 0x1

    .line 167
    sget-object v11, La/ra50;->a:La/ra50;

    .line 168
    .line 169
    invoke-direct/range {v7 .. v13}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 170
    .line 171
    .line 172
    invoke-direct {p0, v7}, La/ta50;-><init>(La/wkm;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v6, p0}, La/dmm;-><init>(La/wa50;)V

    .line 176
    .line 177
    .line 178
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 183
    .line 184
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v7

    .line 188
    const/4 v9, 0x0

    .line 189
    const/4 v10, 0x0

    .line 190
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 191
    .line 192
    .line 193
    return-object v3

    .line 194
    :pswitch_6
    check-cast p0, La/qss0;

    .line 195
    .line 196
    sget-object v0, La/qss0;->R1:La/j6m0;

    .line 197
    .line 198
    iget-object p0, p0, La/qss0;->L1:La/fiu0;

    .line 199
    .line 200
    if-eqz p0, :cond_2

    .line 201
    .line 202
    return-object p0

    .line 203
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v4

    .line 207
    :pswitch_7
    check-cast p0, La/g090;

    .line 208
    .line 209
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p0, La/gii0;

    .line 212
    .line 213
    const-class v0, La/kps0;

    .line 214
    .line 215
    sget-object v1, La/sre0;->a:La/tre0;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    check-cast p0, La/kps0;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_8
    check-cast p0, La/nps0;

    .line 229
    .line 230
    sget-object v0, La/nps0;->O1:[La/iiy;

    .line 231
    .line 232
    iget-object p0, p0, La/nps0;->L1:La/fiu0;

    .line 233
    .line 234
    if-eqz p0, :cond_3

    .line 235
    .line 236
    return-object p0

    .line 237
    :cond_3
    const-string p0, "treasureViewModelFactory"

    .line 238
    .line 239
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v4

    .line 243
    :pswitch_9
    check-cast p0, La/hks0;

    .line 244
    .line 245
    iget-object p0, p0, La/hks0;->b:La/mdm;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_a
    check-cast p0, La/ojs0;

    .line 249
    .line 250
    sget-object v0, La/ojs0;->P1:La/m6m0;

    .line 251
    .line 252
    iget-object p0, p0, La/ojs0;->K1:La/fiu0;

    .line 253
    .line 254
    if-eqz p0, :cond_4

    .line 255
    .line 256
    return-object p0

    .line 257
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v4

    .line 261
    :pswitch_b
    check-cast p0, La/trm0;

    .line 262
    .line 263
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast p0, La/gii0;

    .line 266
    .line 267
    const-class v0, La/mes0;

    .line 268
    .line 269
    sget-object v1, La/sre0;->a:La/tre0;

    .line 270
    .line 271
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    check-cast p0, La/mes0;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_c
    move-object v0, p0

    .line 283
    check-cast v0, La/yas0;

    .line 284
    .line 285
    iget-object p0, v0, La/yas0;->x:La/sti0;

    .line 286
    .line 287
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, La/sas0;

    .line 292
    .line 293
    iget-wide v5, v1, La/sas0;->a:J

    .line 294
    .line 295
    invoke-virtual {p0, v2, v5, v6}, La/sti0;->a(ZJ)V

    .line 296
    .line 297
    .line 298
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 299
    .line 300
    iget-object v3, p0, La/ocj;->a:La/p7m0;

    .line 301
    .line 302
    :cond_5
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 310
    .line 311
    move-object v5, p0

    .line 312
    check-cast v5, La/sas0;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v1, v5, La/sas0;->c:La/fas0;

    .line 318
    .line 319
    instance-of v6, v1, La/cas0;

    .line 320
    .line 321
    if-eqz v6, :cond_6

    .line 322
    .line 323
    check-cast v1, La/cas0;

    .line 324
    .line 325
    const/4 v6, 0x1

    .line 326
    invoke-static {v1, v4, v2, v6}, La/cas0;->a(La/cas0;La/gu1;ZI)La/cas0;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    const/16 v6, 0x1b

    .line 331
    .line 332
    invoke-static {v5, v1, v2, v6}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    :cond_6
    invoke-virtual {v3, p0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    if-eqz p0, :cond_5

    .line 341
    .line 342
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_d
    check-cast p0, La/b09;

    .line 346
    .line 347
    new-instance v3, La/imm;

    .line 348
    .line 349
    new-instance v4, La/ilm;

    .line 350
    .line 351
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 352
    .line 353
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 358
    .line 359
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 360
    .line 361
    .line 362
    move-result-wide v5

    .line 363
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 364
    .line 365
    .line 366
    new-instance v5, La/plm;

    .line 367
    .line 368
    iget-object p0, p0, La/b09;->b:La/ctf0;

    .line 369
    .line 370
    new-array v0, v2, [Ljava/lang/Object;

    .line 371
    .line 372
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 373
    .line 374
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const v2, 0x7f131070

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 390
    .line 391
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    invoke-direct {v5, p0, v6, v7, v1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 396
    .line 397
    .line 398
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 403
    .line 404
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 405
    .line 406
    .line 407
    move-result-wide v7

    .line 408
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 413
    .line 414
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator60-0d7_KjU()J

    .line 415
    .line 416
    .line 417
    move-result-wide v0

    .line 418
    new-instance v10, La/y3d;

    .line 419
    .line 420
    invoke-direct {v10, v0, v1}, La/y3d;-><init>(J)V

    .line 421
    .line 422
    .line 423
    sget-object v6, La/fmm;->a:La/fmm;

    .line 424
    .line 425
    const/4 v9, 0x1

    .line 426
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 427
    .line 428
    .line 429
    return-object v3

    .line 430
    :pswitch_e
    check-cast p0, La/mas0;

    .line 431
    .line 432
    sget-object v0, La/mas0;->Q1:La/g9m0;

    .line 433
    .line 434
    iget-object p0, p0, La/mas0;->M1:La/fiu0;

    .line 435
    .line 436
    if-eqz p0, :cond_7

    .line 437
    .line 438
    return-object p0

    .line 439
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v4

    .line 443
    :pswitch_f
    check-cast p0, La/rw;

    .line 444
    .line 445
    new-instance v3, La/imm;

    .line 446
    .line 447
    new-instance v4, La/ilm;

    .line 448
    .line 449
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 450
    .line 451
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 456
    .line 457
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 458
    .line 459
    .line 460
    move-result-wide v5

    .line 461
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 462
    .line 463
    .line 464
    new-instance v5, La/plm;

    .line 465
    .line 466
    iget-object p0, p0, La/rw;->b:La/ctf0;

    .line 467
    .line 468
    new-array v0, v2, [Ljava/lang/Object;

    .line 469
    .line 470
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 471
    .line 472
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    const v2, 0x7f131654

    .line 477
    .line 478
    .line 479
    invoke-virtual {p0, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 488
    .line 489
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    invoke-direct {v5, p0, v6, v7, v1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 494
    .line 495
    .line 496
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 497
    .line 498
    .line 499
    move-result-object p0

    .line 500
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 501
    .line 502
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 503
    .line 504
    .line 505
    move-result-wide v7

    .line 506
    const/4 v9, 0x0

    .line 507
    const/4 v10, 0x0

    .line 508
    sget-object v6, La/fmm;->a:La/fmm;

    .line 509
    .line 510
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 511
    .line 512
    .line 513
    return-object v3

    .line 514
    :pswitch_10
    check-cast p0, La/p92;

    .line 515
    .line 516
    new-instance v2, La/imm;

    .line 517
    .line 518
    new-instance v3, La/ilm;

    .line 519
    .line 520
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 521
    .line 522
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 527
    .line 528
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 529
    .line 530
    .line 531
    move-result-wide v4

    .line 532
    invoke-direct {v3, v4, v5}, La/ilm;-><init>(J)V

    .line 533
    .line 534
    .line 535
    new-instance v4, La/plm;

    .line 536
    .line 537
    iget-object p0, p0, La/p92;->i:La/n0o0;

    .line 538
    .line 539
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object p0

    .line 543
    check-cast p0, La/fee;

    .line 544
    .line 545
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    check-cast p0, Ljava/lang/String;

    .line 550
    .line 551
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 556
    .line 557
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 558
    .line 559
    .line 560
    move-result-wide v5

    .line 561
    invoke-direct {v4, p0, v5, v6, v1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 562
    .line 563
    .line 564
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 569
    .line 570
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 571
    .line 572
    .line 573
    move-result-wide v6

    .line 574
    const/4 v8, 0x0

    .line 575
    const/4 v9, 0x0

    .line 576
    sget-object v5, La/fmm;->a:La/fmm;

    .line 577
    .line 578
    invoke-direct/range {v2 .. v9}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 579
    .line 580
    .line 581
    return-object v2

    .line 582
    :pswitch_11
    check-cast p0, La/a6s0;

    .line 583
    .line 584
    sget-object v0, La/a6s0;->S1:La/j6m0;

    .line 585
    .line 586
    iget-object p0, p0, La/a6s0;->L1:La/fiu0;

    .line 587
    .line 588
    if-eqz p0, :cond_8

    .line 589
    .line 590
    return-object p0

    .line 591
    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    throw v4

    .line 595
    :pswitch_12
    check-cast p0, La/g090;

    .line 596
    .line 597
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast p0, La/gii0;

    .line 600
    .line 601
    const-class v0, La/lwr0;

    .line 602
    .line 603
    sget-object v1, La/sre0;->a:La/tre0;

    .line 604
    .line 605
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    check-cast p0, La/lwr0;

    .line 614
    .line 615
    return-object p0

    .line 616
    :pswitch_13
    check-cast p0, La/ej1;

    .line 617
    .line 618
    new-instance v0, La/b4s0;

    .line 619
    .line 620
    new-instance v1, La/yvh0;

    .line 621
    .line 622
    sget-object v2, La/g3s0;->b:La/g3s0;

    .line 623
    .line 624
    iget-object v3, p0, La/ej1;->b:La/ctf0;

    .line 625
    .line 626
    invoke-static {v2, v3}, La/pvm0;->B(La/g3s0;La/ctf0;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    sget-object v4, La/bwh0;->a:La/bwh0;

    .line 631
    .line 632
    invoke-direct {v1, v2, v4}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 633
    .line 634
    .line 635
    new-instance v2, La/yvh0;

    .line 636
    .line 637
    sget-object v5, La/g3s0;->c:La/g3s0;

    .line 638
    .line 639
    invoke-static {v5, v3}, La/pvm0;->B(La/g3s0;La/ctf0;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v3

    .line 643
    invoke-direct {v2, v3, v4}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 644
    .line 645
    .line 646
    filled-new-array {v1, v2}, [La/yvh0;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    iget-object p0, p0, La/ej1;->s:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast p0, La/a4s0;

    .line 657
    .line 658
    iget-object p0, p0, La/a4s0;->g:La/dxh0;

    .line 659
    .line 660
    invoke-direct {v0, v1, p0}, La/b4s0;-><init>(La/i4;La/dxh0;)V

    .line 661
    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_14
    check-cast p0, La/c4s0;

    .line 665
    .line 666
    iget-object p0, p0, La/c4s0;->e:La/g3s0;

    .line 667
    .line 668
    iget-boolean p0, p0, La/g3s0;->a:Z

    .line 669
    .line 670
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 671
    .line 672
    .line 673
    move-result-object p0

    .line 674
    return-object p0

    .line 675
    :pswitch_15
    check-cast p0, La/ytr0;

    .line 676
    .line 677
    new-instance v0, La/q0h0;

    .line 678
    .line 679
    iget-object p0, p0, La/ytr0;->N1:La/gni;

    .line 680
    .line 681
    if-eqz p0, :cond_9

    .line 682
    .line 683
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 684
    .line 685
    .line 686
    return-object v0

    .line 687
    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    throw v4

    .line 691
    :pswitch_16
    check-cast p0, La/psr0;

    .line 692
    .line 693
    sget-object v0, La/bpr0;->a:La/bpr0;

    .line 694
    .line 695
    invoke-virtual {p0, v0}, La/psr0;->P(La/ipr0;)V

    .line 696
    .line 697
    .line 698
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 699
    .line 700
    return-object p0

    .line 701
    :pswitch_17
    check-cast p0, La/yrr0;

    .line 702
    .line 703
    sget-object v0, La/qrr0;->a:La/qrr0;

    .line 704
    .line 705
    invoke-virtual {p0, v0}, La/yrr0;->N(La/srr0;)V

    .line 706
    .line 707
    .line 708
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object p0

    .line 711
    :pswitch_18
    check-cast p0, La/urr0;

    .line 712
    .line 713
    sget-object v0, La/urr0;->O1:La/j6m0;

    .line 714
    .line 715
    iget-object p0, p0, La/urr0;->M1:La/fiu0;

    .line 716
    .line 717
    if-eqz p0, :cond_a

    .line 718
    .line 719
    return-object p0

    .line 720
    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    throw v4

    .line 724
    :pswitch_19
    check-cast p0, La/fck0;

    .line 725
    .line 726
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast p0, La/gii0;

    .line 729
    .line 730
    const-class v0, La/bor0;

    .line 731
    .line 732
    sget-object v1, La/sre0;->a:La/tre0;

    .line 733
    .line 734
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object p0

    .line 742
    check-cast p0, La/bor0;

    .line 743
    .line 744
    return-object p0

    .line 745
    :pswitch_1a
    check-cast p0, La/amr0;

    .line 746
    .line 747
    iget-object p0, p0, La/amr0;->k2:La/fiu0;

    .line 748
    .line 749
    if-eqz p0, :cond_b

    .line 750
    .line 751
    return-object p0

    .line 752
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    throw v4

    .line 756
    :pswitch_1b
    check-cast p0, La/ylr0;

    .line 757
    .line 758
    sget v0, La/ylr0;->m2:I

    .line 759
    .line 760
    iget-object p0, p0, La/ylr0;->k2:La/fiu0;

    .line 761
    .line 762
    if-eqz p0, :cond_c

    .line 763
    .line 764
    return-object p0

    .line 765
    :cond_c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    throw v4

    .line 769
    :pswitch_1c
    check-cast p0, La/njr0;

    .line 770
    .line 771
    invoke-virtual {p0, v2}, La/njr0;->C(Z)V

    .line 772
    .line 773
    .line 774
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object p0

    .line 777
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
