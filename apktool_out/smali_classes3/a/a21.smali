.class public final synthetic La/a21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(BJ)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/a21;->a:B

    iput-wide p2, p0, La/a21;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(J)V
    .locals 1

    .line 1
    const/16 v0, 0x12

    iput-byte v0, p0, La/a21;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/a21;->b:J

    return-void
.end method

.method public synthetic constructor <init>(JIB)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/a21;->a:B

    iput-wide p1, p0, La/a21;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a21;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-wide v7, v0, La/a21;->b:J

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, La/fet;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v6}, La/x8x;->L(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v7, v8, v0, v1}, La/x9x;->t(JLa/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, La/oyg0;

    .line 40
    .line 41
    move-object/from16 v2, p2

    .line 42
    .line 43
    check-cast v2, La/v020;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v3, v2, La/v020;->o:La/na00;

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    const/16 v14, 0xcf

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const-wide/16 v6, 0x0

    .line 59
    .line 60
    const-wide/16 v8, 0x0

    .line 61
    .line 62
    const/4 v10, 0x1

    .line 63
    iget-wide v12, v0, La/a21;->b:J

    .line 64
    .line 65
    invoke-static/range {v3 .. v14}, La/na00;->a(La/na00;La/l800;IJJZZJI)La/na00;

    .line 66
    .line 67
    .line 68
    move-result-object v16

    .line 69
    const/16 v23, 0x0

    .line 70
    .line 71
    const v24, 0x7fbfff

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v4, 0x0

    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    const/4 v11, 0x0

    .line 83
    const/4 v12, 0x0

    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v14, 0x0

    .line 86
    const/4 v15, 0x0

    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    const/16 v18, 0x0

    .line 90
    .line 91
    const/16 v19, 0x0

    .line 92
    .line 93
    const/16 v20, 0x0

    .line 94
    .line 95
    const/16 v21, 0x0

    .line 96
    .line 97
    const/16 v22, 0x0

    .line 98
    .line 99
    invoke-static/range {v2 .. v24}, La/v020;->a(La/v020;ZZJZILa/xqj0;La/ixs0;La/zdm0;La/nc5;Ljava/util/Set;La/ehm0;La/ehm0;La/na00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/uaq0;I)La/v020;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_1
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, La/oyg0;

    .line 107
    .line 108
    move-object/from16 v2, p2

    .line 109
    .line 110
    check-cast v2, La/v020;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v3, v2, La/v020;->o:La/na00;

    .line 119
    .line 120
    const/4 v11, 0x0

    .line 121
    const/16 v14, 0xcf

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const-wide/16 v6, 0x0

    .line 126
    .line 127
    const-wide/16 v8, 0x0

    .line 128
    .line 129
    const/4 v10, 0x1

    .line 130
    iget-wide v12, v0, La/a21;->b:J

    .line 131
    .line 132
    invoke-static/range {v3 .. v14}, La/na00;->a(La/na00;La/l800;IJJZZJI)La/na00;

    .line 133
    .line 134
    .line 135
    move-result-object v16

    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    const v24, 0x7fbfff

    .line 139
    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    const/4 v4, 0x0

    .line 143
    const-wide/16 v5, 0x0

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    const/4 v11, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v14, 0x0

    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    const/16 v18, 0x0

    .line 157
    .line 158
    const/16 v19, 0x0

    .line 159
    .line 160
    const/16 v20, 0x0

    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    invoke-static/range {v2 .. v24}, La/v020;->a(La/v020;ZZJZILa/xqj0;La/ixs0;La/zdm0;La/nc5;Ljava/util/Set;La/ehm0;La/ehm0;La/na00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/uaq0;I)La/v020;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0

    .line 171
    :pswitch_2
    move-object/from16 v1, p1

    .line 172
    .line 173
    check-cast v1, La/oyg0;

    .line 174
    .line 175
    move-object/from16 v2, p2

    .line 176
    .line 177
    check-cast v2, La/v020;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v3, v2, La/v020;->o:La/na00;

    .line 186
    .line 187
    const-wide/16 v12, 0x0

    .line 188
    .line 189
    const/16 v14, 0x1f7

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v5, 0x0

    .line 193
    const-wide/16 v6, 0x0

    .line 194
    .line 195
    iget-wide v8, v0, La/a21;->b:J

    .line 196
    .line 197
    const/4 v10, 0x0

    .line 198
    const/4 v11, 0x0

    .line 199
    invoke-static/range {v3 .. v14}, La/na00;->a(La/na00;La/l800;IJJZZJI)La/na00;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    const/16 v23, 0x0

    .line 204
    .line 205
    const v24, 0x7fbfff

    .line 206
    .line 207
    .line 208
    const/4 v3, 0x0

    .line 209
    const/4 v4, 0x0

    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    const/16 v19, 0x0

    .line 226
    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    const/16 v21, 0x0

    .line 230
    .line 231
    const/16 v22, 0x0

    .line 232
    .line 233
    invoke-static/range {v2 .. v24}, La/v020;->a(La/v020;ZZJZILa/xqj0;La/ixs0;La/zdm0;La/nc5;Ljava/util/Set;La/ehm0;La/ehm0;La/na00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/uaq0;I)La/v020;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :pswitch_3
    move-object/from16 v1, p1

    .line 239
    .line 240
    check-cast v1, La/oyg0;

    .line 241
    .line 242
    move-object/from16 v2, p2

    .line 243
    .line 244
    check-cast v2, La/v020;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget-object v3, v2, La/v020;->o:La/na00;

    .line 253
    .line 254
    const-wide/16 v12, 0x0

    .line 255
    .line 256
    const/16 v14, 0x1fb

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    const/4 v5, 0x0

    .line 260
    iget-wide v6, v0, La/a21;->b:J

    .line 261
    .line 262
    const-wide/16 v8, 0x0

    .line 263
    .line 264
    const/4 v10, 0x0

    .line 265
    const/4 v11, 0x0

    .line 266
    invoke-static/range {v3 .. v14}, La/na00;->a(La/na00;La/l800;IJJZZJI)La/na00;

    .line 267
    .line 268
    .line 269
    move-result-object v16

    .line 270
    const/16 v23, 0x0

    .line 271
    .line 272
    const v24, 0x7fbfff

    .line 273
    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    const/4 v4, 0x0

    .line 277
    const-wide/16 v5, 0x0

    .line 278
    .line 279
    const/4 v7, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    const/4 v9, 0x0

    .line 282
    const/4 v10, 0x0

    .line 283
    const/4 v11, 0x0

    .line 284
    const/4 v12, 0x0

    .line 285
    const/4 v13, 0x0

    .line 286
    const/4 v14, 0x0

    .line 287
    const/4 v15, 0x0

    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const/16 v18, 0x0

    .line 291
    .line 292
    const/16 v19, 0x0

    .line 293
    .line 294
    const/16 v20, 0x0

    .line 295
    .line 296
    const/16 v21, 0x0

    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    invoke-static/range {v2 .. v24}, La/v020;->a(La/v020;ZZJZILa/xqj0;La/ixs0;La/zdm0;La/nc5;Ljava/util/Set;La/ehm0;La/ehm0;La/na00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/uaq0;I)La/v020;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    return-object v0

    .line 305
    :pswitch_4
    move-object/from16 v1, p1

    .line 306
    .line 307
    check-cast v1, La/oyg0;

    .line 308
    .line 309
    move-object/from16 v2, p2

    .line 310
    .line 311
    check-cast v2, La/m310;

    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iget-object v3, v2, La/m310;->j:La/g310;

    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    const/16 v15, 0xdf

    .line 323
    .line 324
    const-wide/16 v4, 0x0

    .line 325
    .line 326
    const-wide/16 v6, 0x0

    .line 327
    .line 328
    const/4 v8, 0x0

    .line 329
    const-wide/16 v9, 0x0

    .line 330
    .line 331
    const/4 v11, 0x0

    .line 332
    iget-wide v12, v0, La/a21;->b:J

    .line 333
    .line 334
    invoke-static/range {v3 .. v15}, La/g310;->a(La/g310;JJLa/o4i0;JLjava/util/ArrayList;JZI)La/g310;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    const v19, 0x1fffdff

    .line 341
    .line 342
    .line 343
    const/4 v3, 0x0

    .line 344
    const/4 v4, 0x0

    .line 345
    const/4 v5, 0x0

    .line 346
    const/4 v6, 0x0

    .line 347
    const/4 v7, 0x0

    .line 348
    const/4 v9, 0x0

    .line 349
    const/4 v12, 0x0

    .line 350
    const/4 v13, 0x0

    .line 351
    const/4 v14, 0x0

    .line 352
    const/4 v15, 0x0

    .line 353
    const/16 v16, 0x0

    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    invoke-static/range {v2 .. v19}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0

    .line 362
    :pswitch_5
    move-object/from16 v1, p1

    .line 363
    .line 364
    check-cast v1, La/oyg0;

    .line 365
    .line 366
    move-object/from16 v2, p2

    .line 367
    .line 368
    check-cast v2, La/m310;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    iget-object v3, v2, La/m310;->j:La/g310;

    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    const/16 v15, 0xf7

    .line 380
    .line 381
    const-wide/16 v4, 0x0

    .line 382
    .line 383
    const-wide/16 v6, 0x0

    .line 384
    .line 385
    const/4 v8, 0x0

    .line 386
    iget-wide v9, v0, La/a21;->b:J

    .line 387
    .line 388
    const/4 v11, 0x0

    .line 389
    const-wide/16 v12, 0x0

    .line 390
    .line 391
    invoke-static/range {v3 .. v15}, La/g310;->a(La/g310;JJLa/o4i0;JLjava/util/ArrayList;JZI)La/g310;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    const/16 v18, 0x0

    .line 396
    .line 397
    const v19, 0x1fffdff

    .line 398
    .line 399
    .line 400
    const/4 v3, 0x0

    .line 401
    const/4 v4, 0x0

    .line 402
    const/4 v5, 0x0

    .line 403
    const/4 v6, 0x0

    .line 404
    const/4 v7, 0x0

    .line 405
    const/4 v9, 0x0

    .line 406
    const/4 v12, 0x0

    .line 407
    const/4 v13, 0x0

    .line 408
    const/4 v14, 0x0

    .line 409
    const/4 v15, 0x0

    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    const/16 v17, 0x0

    .line 413
    .line 414
    invoke-static/range {v2 .. v19}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    return-object v0

    .line 419
    :pswitch_6
    move-object/from16 v1, p1

    .line 420
    .line 421
    check-cast v1, La/oyg0;

    .line 422
    .line 423
    move-object/from16 v2, p2

    .line 424
    .line 425
    check-cast v2, La/m310;

    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iget-object v3, v2, La/m310;->j:La/g310;

    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    const/16 v15, 0xfe

    .line 437
    .line 438
    iget-wide v4, v0, La/a21;->b:J

    .line 439
    .line 440
    const-wide/16 v6, 0x0

    .line 441
    .line 442
    const/4 v8, 0x0

    .line 443
    const-wide/16 v9, 0x0

    .line 444
    .line 445
    const/4 v11, 0x0

    .line 446
    const-wide/16 v12, 0x0

    .line 447
    .line 448
    invoke-static/range {v3 .. v15}, La/g310;->a(La/g310;JJLa/o4i0;JLjava/util/ArrayList;JZI)La/g310;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    const/16 v18, 0x0

    .line 453
    .line 454
    const v19, 0x1fffdff

    .line 455
    .line 456
    .line 457
    const/4 v3, 0x0

    .line 458
    const/4 v4, 0x0

    .line 459
    const/4 v5, 0x0

    .line 460
    const/4 v6, 0x0

    .line 461
    const/4 v7, 0x0

    .line 462
    const/4 v9, 0x0

    .line 463
    const/4 v12, 0x0

    .line 464
    const/4 v13, 0x0

    .line 465
    const/4 v14, 0x0

    .line 466
    const/4 v15, 0x0

    .line 467
    const/16 v16, 0x0

    .line 468
    .line 469
    const/16 v17, 0x0

    .line 470
    .line 471
    invoke-static/range {v2 .. v19}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    return-object v0

    .line 476
    :pswitch_7
    move-object/from16 v1, p1

    .line 477
    .line 478
    check-cast v1, La/oyg0;

    .line 479
    .line 480
    move-object/from16 v2, p2

    .line 481
    .line 482
    check-cast v2, La/m310;

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    iget-object v3, v2, La/m310;->j:La/g310;

    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    const/16 v15, 0xfd

    .line 494
    .line 495
    const-wide/16 v4, 0x0

    .line 496
    .line 497
    iget-wide v6, v0, La/a21;->b:J

    .line 498
    .line 499
    const/4 v8, 0x0

    .line 500
    const-wide/16 v9, 0x0

    .line 501
    .line 502
    const/4 v11, 0x0

    .line 503
    const-wide/16 v12, 0x0

    .line 504
    .line 505
    invoke-static/range {v3 .. v15}, La/g310;->a(La/g310;JJLa/o4i0;JLjava/util/ArrayList;JZI)La/g310;

    .line 506
    .line 507
    .line 508
    move-result-object v10

    .line 509
    const/16 v18, 0x0

    .line 510
    .line 511
    const v19, 0x1fffdff

    .line 512
    .line 513
    .line 514
    const/4 v3, 0x0

    .line 515
    const/4 v4, 0x0

    .line 516
    const/4 v5, 0x0

    .line 517
    const/4 v6, 0x0

    .line 518
    const/4 v7, 0x0

    .line 519
    const/4 v9, 0x0

    .line 520
    const/4 v12, 0x0

    .line 521
    const/4 v13, 0x0

    .line 522
    const/4 v14, 0x0

    .line 523
    const/4 v15, 0x0

    .line 524
    const/16 v16, 0x0

    .line 525
    .line 526
    const/16 v17, 0x0

    .line 527
    .line 528
    invoke-static/range {v2 .. v19}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    return-object v0

    .line 533
    :pswitch_8
    move-object/from16 v0, p1

    .line 534
    .line 535
    check-cast v0, La/oyg0;

    .line 536
    .line 537
    move-object/from16 v9, p2

    .line 538
    .line 539
    check-cast v9, La/zjw;

    .line 540
    .line 541
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    iget-object v0, v9, La/zjw;->n:Ljava/util/Map;

    .line 548
    .line 549
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 550
    .line 551
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 552
    .line 553
    .line 554
    iget-object v0, v9, La/zjw;->g:La/ekw;

    .line 555
    .line 556
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 557
    .line 558
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    const/16 v21, 0x0

    .line 566
    .line 567
    const v22, 0x7dfff

    .line 568
    .line 569
    .line 570
    const/4 v10, 0x0

    .line 571
    const/4 v11, 0x0

    .line 572
    const/4 v12, 0x0

    .line 573
    const/4 v13, 0x0

    .line 574
    const/4 v14, 0x0

    .line 575
    const/4 v15, 0x0

    .line 576
    const/16 v16, 0x0

    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    const/16 v19, 0x0

    .line 581
    .line 582
    const/16 v20, 0x0

    .line 583
    .line 584
    move-object/from16 v18, v1

    .line 585
    .line 586
    invoke-static/range {v9 .. v22}, La/zjw;->a(La/zjw;Ljava/util/List;La/ekw;Ljava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)La/zjw;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    return-object v0

    .line 591
    :pswitch_9
    move-object/from16 v0, p1

    .line 592
    .line 593
    check-cast v0, La/oyg0;

    .line 594
    .line 595
    move-object/from16 v9, p2

    .line 596
    .line 597
    check-cast v9, La/zjw;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    iget-object v0, v9, La/zjw;->m:Ljava/util/Map;

    .line 606
    .line 607
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 608
    .line 609
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 610
    .line 611
    .line 612
    iget-object v0, v9, La/zjw;->g:La/ekw;

    .line 613
    .line 614
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 615
    .line 616
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    const/16 v21, 0x0

    .line 624
    .line 625
    const v22, 0x7efff

    .line 626
    .line 627
    .line 628
    const/4 v10, 0x0

    .line 629
    const/4 v11, 0x0

    .line 630
    const/4 v12, 0x0

    .line 631
    const/4 v13, 0x0

    .line 632
    const/4 v14, 0x0

    .line 633
    const/4 v15, 0x0

    .line 634
    const/16 v16, 0x0

    .line 635
    .line 636
    const/16 v18, 0x0

    .line 637
    .line 638
    const/16 v19, 0x0

    .line 639
    .line 640
    const/16 v20, 0x0

    .line 641
    .line 642
    move-object/from16 v17, v1

    .line 643
    .line 644
    invoke-static/range {v9 .. v22}, La/zjw;->a(La/zjw;Ljava/util/List;La/ekw;Ljava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)La/zjw;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    return-object v0

    .line 649
    :pswitch_a
    move-object/from16 v0, p1

    .line 650
    .line 651
    check-cast v0, La/fet;

    .line 652
    .line 653
    move-object/from16 v1, p2

    .line 654
    .line 655
    check-cast v1, Ljava/lang/Integer;

    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    and-int/lit8 v2, v1, 0x3

    .line 662
    .line 663
    if-eq v2, v4, :cond_0

    .line 664
    .line 665
    move v2, v6

    .line 666
    goto :goto_0

    .line 667
    :cond_0
    move v2, v5

    .line 668
    :goto_0
    and-int/2addr v1, v6

    .line 669
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    if-eqz v1, :cond_2

    .line 674
    .line 675
    const/high16 v1, 0x3f800000    # 1.0f

    .line 676
    .line 677
    sget-object v2, La/jm40;->b:La/jm40;

    .line 678
    .line 679
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    sget-object v3, La/qmk;->a:La/zcl;

    .line 684
    .line 685
    const/high16 v3, 0x41800000    # 16.0f

    .line 686
    .line 687
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 692
    .line 693
    invoke-static {v3, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    iget-wide v9, v0, La/fet;->T:J

    .line 698
    .line 699
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 700
    .line 701
    .line 702
    move-result v9

    .line 703
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 704
    .line 705
    .line 706
    move-result-object v10

    .line 707
    invoke-static {v0, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 712
    .line 713
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0}, La/fet;->i0()V

    .line 717
    .line 718
    .line 719
    iget-boolean v11, v0, La/fet;->S:Z

    .line 720
    .line 721
    if-eqz v11, :cond_1

    .line 722
    .line 723
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 724
    .line 725
    invoke-virtual {v0, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 726
    .line 727
    .line 728
    goto :goto_1

    .line 729
    :cond_1
    invoke-virtual {v0}, La/fet;->r0()V

    .line 730
    .line 731
    .line 732
    :goto_1
    sget-object v11, La/gqw0;->x:La/shd;

    .line 733
    .line 734
    invoke-static {v0, v3, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 735
    .line 736
    .line 737
    sget-object v3, La/gqw0;->w:La/shd;

    .line 738
    .line 739
    invoke-static {v0, v10, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 740
    .line 741
    .line 742
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    sget-object v9, La/gqw0;->y:La/shd;

    .line 747
    .line 748
    invoke-static {v0, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 749
    .line 750
    .line 751
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 752
    .line 753
    .line 754
    sget-object v3, La/gqw0;->v:La/shd;

    .line 755
    .line 756
    invoke-static {v0, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 757
    .line 758
    .line 759
    sget-object v1, La/gqw0;->d:La/zx7;

    .line 760
    .line 761
    sget-object v3, La/jr8;->a:La/jr8;

    .line 762
    .line 763
    invoke-virtual {v3, v2, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-static {v5, v7, v8, v0, v1}, La/gkb;->q(IJLa/fet;La/mm40;)V

    .line 768
    .line 769
    .line 770
    sget-object v1, La/gqw0;->f:La/zx7;

    .line 771
    .line 772
    invoke-virtual {v3, v2, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    invoke-static {v5, v7, v8, v0, v1}, La/gkb;->r(IJLa/fet;La/mm40;)V

    .line 777
    .line 778
    .line 779
    const/high16 v1, 0x41400000    # 12.0f

    .line 780
    .line 781
    const/4 v3, 0x0

    .line 782
    invoke-static {v2, v1, v3, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    invoke-static {v5, v7, v8, v0, v1}, La/gkb;->g(IJLa/fet;La/mm40;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v6}, La/fet;->r(Z)V

    .line 790
    .line 791
    .line 792
    goto :goto_2

    .line 793
    :cond_2
    invoke-virtual {v0}, La/fet;->X()V

    .line 794
    .line 795
    .line 796
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 797
    .line 798
    return-object v0

    .line 799
    :pswitch_b
    move-object/from16 v0, p1

    .line 800
    .line 801
    check-cast v0, La/fet;

    .line 802
    .line 803
    move-object/from16 v1, p2

    .line 804
    .line 805
    check-cast v1, Ljava/lang/Integer;

    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    invoke-static {v6}, La/x8x;->L(I)I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    invoke-static {v7, v8, v0, v1}, La/epv0;->F(JLa/fet;I)V

    .line 815
    .line 816
    .line 817
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 818
    .line 819
    return-object v0

    .line 820
    :pswitch_c
    move-object/from16 v0, p1

    .line 821
    .line 822
    check-cast v0, La/fet;

    .line 823
    .line 824
    move-object/from16 v1, p2

    .line 825
    .line 826
    check-cast v1, Ljava/lang/Integer;

    .line 827
    .line 828
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    invoke-static {v6}, La/x8x;->L(I)I

    .line 832
    .line 833
    .line 834
    move-result v1

    .line 835
    invoke-static {v7, v8, v0, v1}, La/plc;->u(JLa/fet;I)V

    .line 836
    .line 837
    .line 838
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 839
    .line 840
    return-object v0

    .line 841
    :pswitch_d
    move-object/from16 v0, p1

    .line 842
    .line 843
    check-cast v0, La/fet;

    .line 844
    .line 845
    move-object/from16 v1, p2

    .line 846
    .line 847
    check-cast v1, Ljava/lang/Integer;

    .line 848
    .line 849
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    const/16 v1, 0x31

    .line 853
    .line 854
    invoke-static {v1}, La/x8x;->L(I)I

    .line 855
    .line 856
    .line 857
    move-result v1

    .line 858
    invoke-static {v7, v8, v0, v1}, La/agc;->H(JLa/fet;I)V

    .line 859
    .line 860
    .line 861
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_e
    move-object/from16 v0, p1

    .line 865
    .line 866
    check-cast v0, Ljava/lang/String;

    .line 867
    .line 868
    move-object/from16 v1, p2

    .line 869
    .line 870
    check-cast v1, La/das;

    .line 871
    .line 872
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    if-nez v1, :cond_3

    .line 876
    .line 877
    goto :goto_3

    .line 878
    :cond_3
    iget-object v0, v1, La/das;->a:Ljava/util/Map;

    .line 879
    .line 880
    new-instance v2, La/bds;

    .line 881
    .line 882
    invoke-direct {v2, v7, v8}, La/bds;-><init>(J)V

    .line 883
    .line 884
    .line 885
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    check-cast v2, La/w9s;

    .line 890
    .line 891
    if-eqz v2, :cond_4

    .line 892
    .line 893
    sget-object v10, La/lun;->a:La/lun;

    .line 894
    .line 895
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    iget-boolean v11, v2, La/w9s;->b:Z

    .line 899
    .line 900
    iget-object v12, v2, La/w9s;->c:Ljava/lang/String;

    .line 901
    .line 902
    iget-object v13, v2, La/w9s;->d:Ljava/util/List;

    .line 903
    .line 904
    iget-object v14, v2, La/w9s;->e:Ljava/lang/String;

    .line 905
    .line 906
    iget-object v15, v2, La/w9s;->f:La/kts;

    .line 907
    .line 908
    iget-object v2, v2, La/w9s;->g:La/ubr;

    .line 909
    .line 910
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    new-instance v9, La/w9s;

    .line 914
    .line 915
    move-object/from16 v16, v2

    .line 916
    .line 917
    invoke-direct/range {v9 .. v16}, La/w9s;-><init>(Ljava/util/Map;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;La/kts;La/ubr;)V

    .line 918
    .line 919
    .line 920
    new-instance v2, La/bds;

    .line 921
    .line 922
    invoke-direct {v2, v7, v8}, La/bds;-><init>(J)V

    .line 923
    .line 924
    .line 925
    new-instance v4, Lkotlin/Pair;

    .line 926
    .line 927
    invoke-direct {v4, v2, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    invoke-static {v0, v4}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    const/4 v2, 0x6

    .line 935
    invoke-static {v1, v0, v3, v3, v2}, La/das;->a(La/das;Ljava/util/Map;Ljava/util/Map;La/pas;I)La/das;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    goto :goto_3

    .line 940
    :cond_4
    move-object v3, v1

    .line 941
    :goto_3
    return-object v3

    .line 942
    :pswitch_f
    move-object/from16 v0, p1

    .line 943
    .line 944
    check-cast v0, La/oyg0;

    .line 945
    .line 946
    move-object/from16 v1, p2

    .line 947
    .line 948
    check-cast v1, La/ipn;

    .line 949
    .line 950
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    iget-object v0, v1, La/ipn;->d:La/oon;

    .line 957
    .line 958
    instance-of v2, v0, La/jon;

    .line 959
    .line 960
    if-eqz v2, :cond_6

    .line 961
    .line 962
    check-cast v0, La/jon;

    .line 963
    .line 964
    iget-object v2, v0, La/jon;->a:Ljava/util/Map;

    .line 965
    .line 966
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 967
    .line 968
    invoke-direct {v9, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 969
    .line 970
    .line 971
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 972
    .line 973
    .line 974
    move-result-object v10

    .line 975
    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v2

    .line 979
    check-cast v2, Ljava/lang/Boolean;

    .line 980
    .line 981
    if-eqz v2, :cond_5

    .line 982
    .line 983
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 984
    .line 985
    .line 986
    move-result v5

    .line 987
    :cond_5
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    xor-int/2addr v5, v6

    .line 992
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 993
    .line 994
    .line 995
    move-result-object v5

    .line 996
    invoke-interface {v9, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    invoke-static {v0, v9, v3, v4}, La/jon;->a(La/jon;Ljava/util/LinkedHashMap;La/ion;I)La/jon;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-static {v1, v0}, La/ipn;->a(La/ipn;La/oon;)La/ipn;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    :cond_6
    return-object v1

    .line 1008
    :pswitch_10
    move-object/from16 v1, p1

    .line 1009
    .line 1010
    check-cast v1, La/oyg0;

    .line 1011
    .line 1012
    move-object/from16 v2, p2

    .line 1013
    .line 1014
    check-cast v2, La/f9l;

    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    iget-object v3, v2, La/f9l;->j:La/z6l;

    .line 1023
    .line 1024
    const/4 v14, 0x0

    .line 1025
    const/16 v15, 0x5f

    .line 1026
    .line 1027
    const-wide/16 v4, 0x0

    .line 1028
    .line 1029
    const-wide/16 v6, 0x0

    .line 1030
    .line 1031
    const/4 v8, 0x0

    .line 1032
    const/4 v9, 0x0

    .line 1033
    const-wide/16 v10, 0x0

    .line 1034
    .line 1035
    iget-wide v12, v0, La/a21;->b:J

    .line 1036
    .line 1037
    invoke-static/range {v3 .. v15}, La/z6l;->a(La/z6l;JJLa/o4i0;Ljava/util/ArrayList;JJZI)La/z6l;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v10

    .line 1041
    const/16 v19, 0x0

    .line 1042
    .line 1043
    const v20, 0x3fffdff

    .line 1044
    .line 1045
    .line 1046
    const/4 v3, 0x0

    .line 1047
    const/4 v4, 0x0

    .line 1048
    const/4 v5, 0x0

    .line 1049
    const/4 v6, 0x0

    .line 1050
    const/4 v7, 0x0

    .line 1051
    const/4 v9, 0x0

    .line 1052
    const/4 v11, 0x0

    .line 1053
    const/4 v12, 0x0

    .line 1054
    const/4 v13, 0x0

    .line 1055
    const/4 v15, 0x0

    .line 1056
    const/16 v16, 0x0

    .line 1057
    .line 1058
    const/16 v17, 0x0

    .line 1059
    .line 1060
    const/16 v18, 0x0

    .line 1061
    .line 1062
    invoke-static/range {v2 .. v20}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    return-object v0

    .line 1067
    :pswitch_11
    move-object/from16 v1, p1

    .line 1068
    .line 1069
    check-cast v1, La/oyg0;

    .line 1070
    .line 1071
    move-object/from16 v2, p2

    .line 1072
    .line 1073
    check-cast v2, La/f9l;

    .line 1074
    .line 1075
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    iget-object v3, v2, La/f9l;->j:La/z6l;

    .line 1082
    .line 1083
    const/4 v14, 0x0

    .line 1084
    const/16 v15, 0x6f

    .line 1085
    .line 1086
    const-wide/16 v4, 0x0

    .line 1087
    .line 1088
    const-wide/16 v6, 0x0

    .line 1089
    .line 1090
    const/4 v8, 0x0

    .line 1091
    const/4 v9, 0x0

    .line 1092
    iget-wide v10, v0, La/a21;->b:J

    .line 1093
    .line 1094
    const-wide/16 v12, 0x0

    .line 1095
    .line 1096
    invoke-static/range {v3 .. v15}, La/z6l;->a(La/z6l;JJLa/o4i0;Ljava/util/ArrayList;JJZI)La/z6l;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v10

    .line 1100
    const/16 v19, 0x0

    .line 1101
    .line 1102
    const v20, 0x3fffdff

    .line 1103
    .line 1104
    .line 1105
    const/4 v3, 0x0

    .line 1106
    const/4 v4, 0x0

    .line 1107
    const/4 v5, 0x0

    .line 1108
    const/4 v6, 0x0

    .line 1109
    const/4 v7, 0x0

    .line 1110
    const/4 v9, 0x0

    .line 1111
    const/4 v11, 0x0

    .line 1112
    const/4 v12, 0x0

    .line 1113
    const/4 v13, 0x0

    .line 1114
    const/4 v15, 0x0

    .line 1115
    const/16 v16, 0x0

    .line 1116
    .line 1117
    const/16 v17, 0x0

    .line 1118
    .line 1119
    const/16 v18, 0x0

    .line 1120
    .line 1121
    invoke-static/range {v2 .. v20}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    return-object v0

    .line 1126
    :pswitch_12
    move-object/from16 v1, p1

    .line 1127
    .line 1128
    check-cast v1, La/oyg0;

    .line 1129
    .line 1130
    move-object/from16 v2, p2

    .line 1131
    .line 1132
    check-cast v2, La/f9l;

    .line 1133
    .line 1134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    iget-object v3, v2, La/f9l;->j:La/z6l;

    .line 1141
    .line 1142
    const/4 v14, 0x0

    .line 1143
    const/16 v15, 0x7e

    .line 1144
    .line 1145
    iget-wide v4, v0, La/a21;->b:J

    .line 1146
    .line 1147
    const-wide/16 v6, 0x0

    .line 1148
    .line 1149
    const/4 v8, 0x0

    .line 1150
    const/4 v9, 0x0

    .line 1151
    const-wide/16 v10, 0x0

    .line 1152
    .line 1153
    const-wide/16 v12, 0x0

    .line 1154
    .line 1155
    invoke-static/range {v3 .. v15}, La/z6l;->a(La/z6l;JJLa/o4i0;Ljava/util/ArrayList;JJZI)La/z6l;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v10

    .line 1159
    const/16 v19, 0x0

    .line 1160
    .line 1161
    const v20, 0x3fffdff

    .line 1162
    .line 1163
    .line 1164
    const/4 v3, 0x0

    .line 1165
    const/4 v4, 0x0

    .line 1166
    const/4 v5, 0x0

    .line 1167
    const/4 v6, 0x0

    .line 1168
    const/4 v7, 0x0

    .line 1169
    const/4 v9, 0x0

    .line 1170
    const/4 v11, 0x0

    .line 1171
    const/4 v12, 0x0

    .line 1172
    const/4 v13, 0x0

    .line 1173
    const/4 v15, 0x0

    .line 1174
    const/16 v16, 0x0

    .line 1175
    .line 1176
    const/16 v17, 0x0

    .line 1177
    .line 1178
    const/16 v18, 0x0

    .line 1179
    .line 1180
    invoke-static/range {v2 .. v20}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    return-object v0

    .line 1185
    :pswitch_13
    move-object/from16 v1, p1

    .line 1186
    .line 1187
    check-cast v1, La/oyg0;

    .line 1188
    .line 1189
    move-object/from16 v2, p2

    .line 1190
    .line 1191
    check-cast v2, La/f9l;

    .line 1192
    .line 1193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    iget-object v3, v2, La/f9l;->j:La/z6l;

    .line 1200
    .line 1201
    const/4 v14, 0x0

    .line 1202
    const/16 v15, 0x7d

    .line 1203
    .line 1204
    const-wide/16 v4, 0x0

    .line 1205
    .line 1206
    iget-wide v6, v0, La/a21;->b:J

    .line 1207
    .line 1208
    const/4 v8, 0x0

    .line 1209
    const/4 v9, 0x0

    .line 1210
    const-wide/16 v10, 0x0

    .line 1211
    .line 1212
    const-wide/16 v12, 0x0

    .line 1213
    .line 1214
    invoke-static/range {v3 .. v15}, La/z6l;->a(La/z6l;JJLa/o4i0;Ljava/util/ArrayList;JJZI)La/z6l;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v10

    .line 1218
    const/16 v19, 0x0

    .line 1219
    .line 1220
    const v20, 0x3fffdff

    .line 1221
    .line 1222
    .line 1223
    const/4 v3, 0x0

    .line 1224
    const/4 v4, 0x0

    .line 1225
    const/4 v5, 0x0

    .line 1226
    const/4 v6, 0x0

    .line 1227
    const/4 v7, 0x0

    .line 1228
    const/4 v9, 0x0

    .line 1229
    const/4 v11, 0x0

    .line 1230
    const/4 v12, 0x0

    .line 1231
    const/4 v13, 0x0

    .line 1232
    const/4 v15, 0x0

    .line 1233
    const/16 v16, 0x0

    .line 1234
    .line 1235
    const/16 v17, 0x0

    .line 1236
    .line 1237
    const/16 v18, 0x0

    .line 1238
    .line 1239
    invoke-static/range {v2 .. v20}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    return-object v0

    .line 1244
    :pswitch_14
    move-object/from16 v1, p1

    .line 1245
    .line 1246
    check-cast v1, La/oyg0;

    .line 1247
    .line 1248
    move-object/from16 v2, p2

    .line 1249
    .line 1250
    check-cast v2, La/wmf;

    .line 1251
    .line 1252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    iget-object v3, v2, La/wmf;->u:La/qmf;

    .line 1259
    .line 1260
    const/4 v9, 0x0

    .line 1261
    const/16 v12, 0xf

    .line 1262
    .line 1263
    const-wide/16 v4, 0x0

    .line 1264
    .line 1265
    const-wide/16 v6, 0x0

    .line 1266
    .line 1267
    const/4 v8, 0x0

    .line 1268
    iget-wide v10, v0, La/a21;->b:J

    .line 1269
    .line 1270
    invoke-static/range {v3 .. v12}, La/qmf;->a(La/qmf;JJZLa/o4i0;JI)La/qmf;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v15

    .line 1274
    const/16 v17, 0x0

    .line 1275
    .line 1276
    const v18, 0xefffff

    .line 1277
    .line 1278
    .line 1279
    const/4 v3, 0x0

    .line 1280
    const/4 v4, 0x0

    .line 1281
    const/4 v5, 0x0

    .line 1282
    const/4 v6, 0x0

    .line 1283
    const/4 v7, 0x0

    .line 1284
    const/4 v8, 0x0

    .line 1285
    const/4 v9, 0x0

    .line 1286
    const/4 v10, 0x0

    .line 1287
    const/4 v11, 0x0

    .line 1288
    const/4 v12, 0x0

    .line 1289
    const/4 v13, 0x0

    .line 1290
    const/4 v14, 0x0

    .line 1291
    const/16 v16, 0x0

    .line 1292
    .line 1293
    invoke-static/range {v2 .. v18}, La/wmf;->a(La/wmf;La/jlr;La/bqr;ZLa/mrf;Ljava/util/List;La/ypl0;ZZLjava/util/ArrayList;ZLa/xus;La/gps;La/qmf;La/yws;La/szj0;I)La/wmf;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    return-object v0

    .line 1298
    :pswitch_15
    move-object/from16 v1, p1

    .line 1299
    .line 1300
    check-cast v1, La/oyg0;

    .line 1301
    .line 1302
    move-object/from16 v2, p2

    .line 1303
    .line 1304
    check-cast v2, La/wmf;

    .line 1305
    .line 1306
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1310
    .line 1311
    .line 1312
    iget-object v3, v2, La/wmf;->u:La/qmf;

    .line 1313
    .line 1314
    const-wide/16 v10, 0x0

    .line 1315
    .line 1316
    const/16 v12, 0x1d

    .line 1317
    .line 1318
    const-wide/16 v4, 0x0

    .line 1319
    .line 1320
    iget-wide v6, v0, La/a21;->b:J

    .line 1321
    .line 1322
    const/4 v8, 0x0

    .line 1323
    const/4 v9, 0x0

    .line 1324
    invoke-static/range {v3 .. v12}, La/qmf;->a(La/qmf;JJZLa/o4i0;JI)La/qmf;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v15

    .line 1328
    const/16 v17, 0x0

    .line 1329
    .line 1330
    const v18, 0xefffff

    .line 1331
    .line 1332
    .line 1333
    const/4 v3, 0x0

    .line 1334
    const/4 v4, 0x0

    .line 1335
    const/4 v5, 0x0

    .line 1336
    const/4 v6, 0x0

    .line 1337
    const/4 v7, 0x0

    .line 1338
    const/4 v8, 0x0

    .line 1339
    const/4 v9, 0x0

    .line 1340
    const/4 v10, 0x0

    .line 1341
    const/4 v11, 0x0

    .line 1342
    const/4 v12, 0x0

    .line 1343
    const/4 v13, 0x0

    .line 1344
    const/4 v14, 0x0

    .line 1345
    const/16 v16, 0x0

    .line 1346
    .line 1347
    invoke-static/range {v2 .. v18}, La/wmf;->a(La/wmf;La/jlr;La/bqr;ZLa/mrf;Ljava/util/List;La/ypl0;ZZLjava/util/ArrayList;ZLa/xus;La/gps;La/qmf;La/yws;La/szj0;I)La/wmf;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    return-object v0

    .line 1352
    :pswitch_16
    move-object/from16 v1, p1

    .line 1353
    .line 1354
    check-cast v1, La/oyg0;

    .line 1355
    .line 1356
    move-object/from16 v2, p2

    .line 1357
    .line 1358
    check-cast v2, La/wmf;

    .line 1359
    .line 1360
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1364
    .line 1365
    .line 1366
    iget-object v3, v2, La/wmf;->u:La/qmf;

    .line 1367
    .line 1368
    const-wide/16 v10, 0x0

    .line 1369
    .line 1370
    const/16 v12, 0x1e

    .line 1371
    .line 1372
    iget-wide v4, v0, La/a21;->b:J

    .line 1373
    .line 1374
    const-wide/16 v6, 0x0

    .line 1375
    .line 1376
    const/4 v8, 0x0

    .line 1377
    const/4 v9, 0x0

    .line 1378
    invoke-static/range {v3 .. v12}, La/qmf;->a(La/qmf;JJZLa/o4i0;JI)La/qmf;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v15

    .line 1382
    const/16 v17, 0x0

    .line 1383
    .line 1384
    const v18, 0xefffff

    .line 1385
    .line 1386
    .line 1387
    const/4 v3, 0x0

    .line 1388
    const/4 v4, 0x0

    .line 1389
    const/4 v5, 0x0

    .line 1390
    const/4 v6, 0x0

    .line 1391
    const/4 v7, 0x0

    .line 1392
    const/4 v8, 0x0

    .line 1393
    const/4 v9, 0x0

    .line 1394
    const/4 v10, 0x0

    .line 1395
    const/4 v11, 0x0

    .line 1396
    const/4 v12, 0x0

    .line 1397
    const/4 v13, 0x0

    .line 1398
    const/4 v14, 0x0

    .line 1399
    const/16 v16, 0x0

    .line 1400
    .line 1401
    invoke-static/range {v2 .. v18}, La/wmf;->a(La/wmf;La/jlr;La/bqr;ZLa/mrf;Ljava/util/List;La/ypl0;ZZLjava/util/ArrayList;ZLa/xus;La/gps;La/qmf;La/yws;La/szj0;I)La/wmf;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    return-object v0

    .line 1406
    :pswitch_17
    move-object/from16 v1, p1

    .line 1407
    .line 1408
    check-cast v1, La/oyg0;

    .line 1409
    .line 1410
    move-object/from16 v7, p2

    .line 1411
    .line 1412
    check-cast v7, La/whc;

    .line 1413
    .line 1414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1418
    .line 1419
    .line 1420
    iget-object v1, v7, La/whc;->e:Ljava/util/List;

    .line 1421
    .line 1422
    new-instance v11, Ljava/util/ArrayList;

    .line 1423
    .line 1424
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1425
    .line 1426
    .line 1427
    move-result v2

    .line 1428
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1429
    .line 1430
    .line 1431
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v2

    .line 1439
    iget-wide v8, v0, La/a21;->b:J

    .line 1440
    .line 1441
    if-eqz v2, :cond_8

    .line 1442
    .line 1443
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v2

    .line 1447
    check-cast v2, La/u95;

    .line 1448
    .line 1449
    iget-wide v2, v2, La/u95;->a:J

    .line 1450
    .line 1451
    cmp-long v4, v8, v2

    .line 1452
    .line 1453
    if-nez v4, :cond_7

    .line 1454
    .line 1455
    move v4, v6

    .line 1456
    goto :goto_5

    .line 1457
    :cond_7
    move v4, v5

    .line 1458
    :goto_5
    new-instance v8, La/u95;

    .line 1459
    .line 1460
    invoke-direct {v8, v4, v2, v3}, La/u95;-><init>(ZJ)V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1464
    .line 1465
    .line 1466
    goto :goto_4

    .line 1467
    :cond_8
    const/4 v12, 0x0

    .line 1468
    const/16 v13, 0xe3

    .line 1469
    .line 1470
    const-string v10, ""

    .line 1471
    .line 1472
    invoke-static/range {v7 .. v13}, La/whc;->a(La/whc;JLjava/lang/String;Ljava/util/ArrayList;ZI)La/whc;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    return-object v0

    .line 1477
    :pswitch_18
    move-object/from16 v0, p1

    .line 1478
    .line 1479
    check-cast v0, La/oyg0;

    .line 1480
    .line 1481
    move-object/from16 v9, p2

    .line 1482
    .line 1483
    check-cast v9, La/cs9;

    .line 1484
    .line 1485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1489
    .line 1490
    .line 1491
    iget-object v0, v9, La/cs9;->a:Ljava/util/List;

    .line 1492
    .line 1493
    new-instance v1, Ljava/util/ArrayList;

    .line 1494
    .line 1495
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1496
    .line 1497
    .line 1498
    move-result v2

    .line 1499
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1500
    .line 1501
    .line 1502
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1507
    .line 1508
    .line 1509
    move-result v2

    .line 1510
    if-eqz v2, :cond_9

    .line 1511
    .line 1512
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2

    .line 1516
    check-cast v2, La/xq9;

    .line 1517
    .line 1518
    iget-object v2, v2, La/xq9;->b:Ljava/util/List;

    .line 1519
    .line 1520
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1521
    .line 1522
    .line 1523
    goto :goto_6

    .line 1524
    :cond_9
    invoke-static {v1}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v1

    .line 1536
    if-eqz v1, :cond_b

    .line 1537
    .line 1538
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v1

    .line 1542
    move-object v2, v1

    .line 1543
    check-cast v2, La/it9;

    .line 1544
    .line 1545
    iget-wide v4, v2, La/it9;->a:J

    .line 1546
    .line 1547
    cmp-long v2, v4, v7

    .line 1548
    .line 1549
    if-nez v2, :cond_a

    .line 1550
    .line 1551
    goto :goto_7

    .line 1552
    :cond_b
    move-object v1, v3

    .line 1553
    :goto_7
    check-cast v1, La/it9;

    .line 1554
    .line 1555
    new-instance v13, La/sp9;

    .line 1556
    .line 1557
    if-eqz v1, :cond_c

    .line 1558
    .line 1559
    iget-wide v7, v1, La/it9;->a:J

    .line 1560
    .line 1561
    :cond_c
    if-eqz v1, :cond_d

    .line 1562
    .line 1563
    iget-object v3, v1, La/it9;->e:Ljava/lang/String;

    .line 1564
    .line 1565
    :cond_d
    invoke-direct {v13, v7, v8, v3}, La/sp9;-><init>(JLjava/lang/String;)V

    .line 1566
    .line 1567
    .line 1568
    const/16 v14, 0xf

    .line 1569
    .line 1570
    const/4 v10, 0x0

    .line 1571
    const/4 v11, 0x0

    .line 1572
    const/4 v12, 0x0

    .line 1573
    invoke-static/range {v9 .. v14}, La/cs9;->a(La/cs9;Ljava/util/List;La/bs9;ZLa/sp9;I)La/cs9;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v0

    .line 1577
    return-object v0

    .line 1578
    :pswitch_19
    move-object/from16 v0, p1

    .line 1579
    .line 1580
    check-cast v0, La/oyg0;

    .line 1581
    .line 1582
    move-object/from16 v9, p2

    .line 1583
    .line 1584
    check-cast v9, La/i77;

    .line 1585
    .line 1586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    new-instance v0, La/tdj;

    .line 1593
    .line 1594
    invoke-direct {v0, v7, v8}, La/tdj;-><init>(J)V

    .line 1595
    .line 1596
    .line 1597
    const v37, -0x1000802

    .line 1598
    .line 1599
    .line 1600
    const/16 v38, 0x7ff

    .line 1601
    .line 1602
    const/4 v10, 0x1

    .line 1603
    const/4 v11, 0x0

    .line 1604
    const/4 v12, 0x0

    .line 1605
    const/4 v13, 0x0

    .line 1606
    const/4 v14, 0x0

    .line 1607
    const/4 v15, 0x0

    .line 1608
    const/16 v16, 0x0

    .line 1609
    .line 1610
    const/16 v17, 0x0

    .line 1611
    .line 1612
    const/16 v19, 0x0

    .line 1613
    .line 1614
    const/16 v20, 0x0

    .line 1615
    .line 1616
    const/16 v21, 0x0

    .line 1617
    .line 1618
    const/16 v22, 0x0

    .line 1619
    .line 1620
    const/16 v23, 0x0

    .line 1621
    .line 1622
    const/16 v24, 0x0

    .line 1623
    .line 1624
    const/16 v25, 0x0

    .line 1625
    .line 1626
    const/16 v26, 0x0

    .line 1627
    .line 1628
    const/16 v27, 0x0

    .line 1629
    .line 1630
    const/16 v28, 0x0

    .line 1631
    .line 1632
    const/16 v29, 0x1

    .line 1633
    .line 1634
    const/16 v30, 0x0

    .line 1635
    .line 1636
    const/16 v31, 0x0

    .line 1637
    .line 1638
    const/16 v32, 0x0

    .line 1639
    .line 1640
    const/16 v33, 0x0

    .line 1641
    .line 1642
    const/16 v34, 0x0

    .line 1643
    .line 1644
    const/16 v35, 0x0

    .line 1645
    .line 1646
    const/16 v36, 0x0

    .line 1647
    .line 1648
    move-object/from16 v18, v0

    .line 1649
    .line 1650
    invoke-static/range {v9 .. v38}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v0

    .line 1654
    return-object v0

    .line 1655
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1656
    .line 1657
    check-cast v0, La/oyg0;

    .line 1658
    .line 1659
    move-object/from16 v9, p2

    .line 1660
    .line 1661
    check-cast v9, La/g72;

    .line 1662
    .line 1663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1667
    .line 1668
    .line 1669
    iget-object v1, v9, La/g72;->r:Ljava/util/Set;

    .line 1670
    .line 1671
    check-cast v1, Ljava/lang/Iterable;

    .line 1672
    .line 1673
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v2

    .line 1681
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    move-result v2

    .line 1685
    if-eqz v2, :cond_e

    .line 1686
    .line 1687
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v2

    .line 1691
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1692
    .line 1693
    .line 1694
    goto :goto_8

    .line 1695
    :cond_e
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v2

    .line 1699
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1700
    .line 1701
    .line 1702
    :goto_8
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v1

    .line 1706
    const-string v2, "KEY_EXPANDED_IDS"

    .line 1707
    .line 1708
    invoke-static {v0, v1, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1709
    .line 1710
    .line 1711
    move-object/from16 v21, v1

    .line 1712
    .line 1713
    check-cast v21, Ljava/util/Set;

    .line 1714
    .line 1715
    const v22, 0x3ffff

    .line 1716
    .line 1717
    .line 1718
    const/4 v10, 0x0

    .line 1719
    const/4 v11, 0x0

    .line 1720
    const/4 v12, 0x0

    .line 1721
    const/4 v13, 0x0

    .line 1722
    const/4 v14, 0x0

    .line 1723
    const/4 v15, 0x0

    .line 1724
    const/16 v16, 0x0

    .line 1725
    .line 1726
    const/16 v17, 0x0

    .line 1727
    .line 1728
    const/16 v18, 0x0

    .line 1729
    .line 1730
    const/16 v19, 0x0

    .line 1731
    .line 1732
    const/16 v20, 0x0

    .line 1733
    .line 1734
    invoke-static/range {v9 .. v22}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    return-object v0

    .line 1739
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1740
    .line 1741
    check-cast v0, La/oyg0;

    .line 1742
    .line 1743
    move-object/from16 v9, p2

    .line 1744
    .line 1745
    check-cast v9, La/g72;

    .line 1746
    .line 1747
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1751
    .line 1752
    .line 1753
    iget-object v1, v9, La/g72;->p:Ljava/util/Set;

    .line 1754
    .line 1755
    check-cast v1, Ljava/lang/Iterable;

    .line 1756
    .line 1757
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v1

    .line 1761
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v3

    .line 1765
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1766
    .line 1767
    .line 1768
    move-result v3

    .line 1769
    if-eqz v3, :cond_f

    .line 1770
    .line 1771
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v2

    .line 1775
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1776
    .line 1777
    .line 1778
    goto :goto_9

    .line 1779
    :cond_f
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 1780
    .line 1781
    .line 1782
    move-result v3

    .line 1783
    if-ge v3, v2, :cond_10

    .line 1784
    .line 1785
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v2

    .line 1789
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1790
    .line 1791
    .line 1792
    :cond_10
    :goto_9
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    const-string v2, "KEY_SELECTED_IDS"

    .line 1797
    .line 1798
    invoke-static {v0, v1, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1799
    .line 1800
    .line 1801
    move-object/from16 v19, v1

    .line 1802
    .line 1803
    check-cast v19, Ljava/util/Set;

    .line 1804
    .line 1805
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1806
    .line 1807
    const-string v2, "KEY_SELECTION_ENABLE"

    .line 1808
    .line 1809
    invoke-static {v0, v1, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1810
    .line 1811
    .line 1812
    const/16 v21, 0x0

    .line 1813
    .line 1814
    const v22, 0x67fff

    .line 1815
    .line 1816
    .line 1817
    const/4 v10, 0x0

    .line 1818
    const/4 v11, 0x0

    .line 1819
    const/4 v12, 0x0

    .line 1820
    const/4 v13, 0x0

    .line 1821
    const/4 v14, 0x0

    .line 1822
    const/4 v15, 0x0

    .line 1823
    const/16 v16, 0x0

    .line 1824
    .line 1825
    const/16 v17, 0x0

    .line 1826
    .line 1827
    const/16 v18, 0x1

    .line 1828
    .line 1829
    const/16 v20, 0x0

    .line 1830
    .line 1831
    invoke-static/range {v9 .. v22}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v0

    .line 1835
    return-object v0

    .line 1836
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1837
    .line 1838
    check-cast v0, La/oyg0;

    .line 1839
    .line 1840
    move-object/from16 v9, p2

    .line 1841
    .line 1842
    check-cast v9, La/q11;

    .line 1843
    .line 1844
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1845
    .line 1846
    .line 1847
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1848
    .line 1849
    .line 1850
    sget-object v0, La/d7v;->a:La/art;

    .line 1851
    .line 1852
    long-to-int v1, v7

    .line 1853
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1854
    .line 1855
    .line 1856
    if-eq v1, v6, :cond_12

    .line 1857
    .line 1858
    if-eq v1, v4, :cond_11

    .line 1859
    .line 1860
    sget-object v0, La/d7v;->b:La/d7v;

    .line 1861
    .line 1862
    :goto_a
    move-object v12, v0

    .line 1863
    goto :goto_b

    .line 1864
    :cond_11
    sget-object v0, La/d7v;->d:La/d7v;

    .line 1865
    .line 1866
    goto :goto_a

    .line 1867
    :cond_12
    sget-object v0, La/d7v;->c:La/d7v;

    .line 1868
    .line 1869
    goto :goto_a

    .line 1870
    :goto_b
    const/16 v27, 0x0

    .line 1871
    .line 1872
    const v28, 0x1ffffffd

    .line 1873
    .line 1874
    .line 1875
    const-wide/16 v10, 0x0

    .line 1876
    .line 1877
    const/4 v13, 0x0

    .line 1878
    const/4 v14, 0x0

    .line 1879
    const/4 v15, 0x0

    .line 1880
    const/16 v16, 0x0

    .line 1881
    .line 1882
    const/16 v17, 0x0

    .line 1883
    .line 1884
    const/16 v18, 0x0

    .line 1885
    .line 1886
    const/16 v19, 0x0

    .line 1887
    .line 1888
    const/16 v20, 0x0

    .line 1889
    .line 1890
    const/16 v21, 0x0

    .line 1891
    .line 1892
    const/16 v22, 0x0

    .line 1893
    .line 1894
    const/16 v23, 0x0

    .line 1895
    .line 1896
    const/16 v24, 0x0

    .line 1897
    .line 1898
    const/16 v25, 0x0

    .line 1899
    .line 1900
    const/16 v26, 0x0

    .line 1901
    .line 1902
    invoke-static/range {v9 .. v28}, La/q11;->a(La/q11;JLa/d7v;Ljava/lang/Integer;La/b7v;La/m7v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/LinkedHashMap;ZZZLa/g7v;ZLa/ql5;Ljava/util/ArrayList;Ljava/util/Set;I)La/q11;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v0

    .line 1906
    return-object v0

    .line 1907
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
