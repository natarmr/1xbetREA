.class public final synthetic La/ynr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lok0;


# direct methods
.method public synthetic constructor <init>(La/lok0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ynr;->a:B

    iput-object p1, p0, La/ynr;->b:La/lok0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ynr;->a:B

    .line 4
    .line 5
    const-string v2, "Game_Screen.png"

    .line 6
    .line 7
    const-string v3, "backgrounds"

    .line 8
    .line 9
    const-string v4, "TopChamps"

    .line 10
    .line 11
    const-string v5, "android"

    .line 12
    .line 13
    const-string v6, "img"

    .line 14
    .line 15
    const-string v7, "static"

    .line 16
    .line 17
    const/16 v8, 0x17

    .line 18
    .line 19
    iget-object v0, v0, La/ynr;->b:La/lok0;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/oyg0;

    .line 27
    .line 28
    move-object/from16 v9, p2

    .line 29
    .line 30
    check-cast v9, La/r7s;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget v1, v0, La/lok0;->a:I

    .line 39
    .line 40
    iget-object v0, v0, La/lok0;->u:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v10, La/bzu;

    .line 46
    .line 47
    invoke-direct {v10, v8}, La/bzu;-><init>(B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v10, v7}, La/bzu;->g(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v10, v6}, La/bzu;->g(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v10, v5}, La/bzu;->g(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v10, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_0

    .line 67
    .line 68
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_0
    invoke-static {v10, v0, v3, v2}, La/axq;->u(La/bzu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v10, La/bzu;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v46

    .line 83
    const/16 v60, -0x1

    .line 84
    .line 85
    const v61, 0xffff7

    .line 86
    .line 87
    .line 88
    const-wide/16 v10, 0x0

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    const/4 v13, 0x0

    .line 92
    const/4 v14, 0x0

    .line 93
    const-wide/16 v15, 0x0

    .line 94
    .line 95
    const-wide/16 v17, 0x0

    .line 96
    .line 97
    const/16 v19, 0x0

    .line 98
    .line 99
    const/16 v20, 0x0

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const/16 v22, 0x0

    .line 104
    .line 105
    const/16 v23, 0x0

    .line 106
    .line 107
    const/16 v24, 0x0

    .line 108
    .line 109
    const/16 v25, 0x0

    .line 110
    .line 111
    const/16 v26, 0x0

    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    const/16 v28, 0x0

    .line 116
    .line 117
    const/16 v29, 0x0

    .line 118
    .line 119
    const/16 v30, 0x0

    .line 120
    .line 121
    const/16 v31, 0x0

    .line 122
    .line 123
    const/16 v32, 0x0

    .line 124
    .line 125
    const/16 v33, 0x0

    .line 126
    .line 127
    const/16 v34, 0x0

    .line 128
    .line 129
    const/16 v35, 0x0

    .line 130
    .line 131
    const/16 v36, 0x0

    .line 132
    .line 133
    const/16 v37, 0x0

    .line 134
    .line 135
    const/16 v38, 0x0

    .line 136
    .line 137
    const/16 v39, 0x0

    .line 138
    .line 139
    const/16 v40, 0x0

    .line 140
    .line 141
    const/16 v41, 0x0

    .line 142
    .line 143
    const/16 v42, 0x0

    .line 144
    .line 145
    const/16 v43, 0x0

    .line 146
    .line 147
    const/16 v44, 0x0

    .line 148
    .line 149
    const/16 v45, 0x0

    .line 150
    .line 151
    const/16 v47, 0x0

    .line 152
    .line 153
    const/16 v48, 0x0

    .line 154
    .line 155
    const/16 v49, 0x0

    .line 156
    .line 157
    const/16 v50, 0x0

    .line 158
    .line 159
    const/16 v51, 0x0

    .line 160
    .line 161
    const/16 v52, 0x0

    .line 162
    .line 163
    const/16 v53, 0x0

    .line 164
    .line 165
    const/16 v54, 0x0

    .line 166
    .line 167
    const/16 v55, 0x0

    .line 168
    .line 169
    const/16 v56, 0x0

    .line 170
    .line 171
    const/16 v57, 0x0

    .line 172
    .line 173
    const/16 v58, 0x0

    .line 174
    .line 175
    const/16 v59, 0x0

    .line 176
    .line 177
    invoke-static/range {v9 .. v61}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :pswitch_0
    move-object/from16 v1, p1

    .line 183
    .line 184
    check-cast v1, La/oyg0;

    .line 185
    .line 186
    move-object/from16 v9, p2

    .line 187
    .line 188
    check-cast v9, La/z2s;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget v1, v0, La/lok0;->a:I

    .line 197
    .line 198
    iget-object v0, v0, La/lok0;->u:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance v10, La/bzu;

    .line 204
    .line 205
    invoke-direct {v10, v8}, La/bzu;-><init>(B)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10, v7}, La/bzu;->g(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v10, v6}, La/bzu;->g(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v5}, La/bzu;->g(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-nez v4, :cond_1

    .line 225
    .line 226
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :cond_1
    invoke-static {v10, v0, v3, v2}, La/axq;->u(La/bzu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    iget-object v0, v10, La/bzu;->b:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v36

    .line 241
    const v53, -0x10000001

    .line 242
    .line 243
    .line 244
    const v54, 0xffff

    .line 245
    .line 246
    .line 247
    const-wide/16 v10, 0x0

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    const/4 v13, 0x0

    .line 251
    const/4 v14, 0x0

    .line 252
    const-wide/16 v15, 0x0

    .line 253
    .line 254
    const-wide/16 v17, 0x0

    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    const/16 v20, 0x0

    .line 259
    .line 260
    const/16 v21, 0x0

    .line 261
    .line 262
    const/16 v22, 0x0

    .line 263
    .line 264
    const/16 v23, 0x0

    .line 265
    .line 266
    const/16 v24, 0x0

    .line 267
    .line 268
    const/16 v25, 0x0

    .line 269
    .line 270
    const/16 v26, 0x0

    .line 271
    .line 272
    const/16 v27, 0x0

    .line 273
    .line 274
    const/16 v28, 0x0

    .line 275
    .line 276
    const/16 v29, 0x0

    .line 277
    .line 278
    const/16 v30, 0x0

    .line 279
    .line 280
    const/16 v31, 0x0

    .line 281
    .line 282
    const/16 v32, 0x0

    .line 283
    .line 284
    const/16 v33, 0x0

    .line 285
    .line 286
    const/16 v34, 0x0

    .line 287
    .line 288
    const/16 v35, 0x0

    .line 289
    .line 290
    const/16 v37, 0x0

    .line 291
    .line 292
    const/16 v38, 0x0

    .line 293
    .line 294
    const/16 v39, 0x0

    .line 295
    .line 296
    const/16 v40, 0x0

    .line 297
    .line 298
    const/16 v41, 0x0

    .line 299
    .line 300
    const/16 v42, 0x0

    .line 301
    .line 302
    const/16 v43, 0x0

    .line 303
    .line 304
    const/16 v44, 0x0

    .line 305
    .line 306
    const/16 v45, 0x0

    .line 307
    .line 308
    const/16 v46, 0x0

    .line 309
    .line 310
    const/16 v47, 0x0

    .line 311
    .line 312
    const/16 v48, 0x0

    .line 313
    .line 314
    const/16 v49, 0x0

    .line 315
    .line 316
    const/16 v50, 0x0

    .line 317
    .line 318
    const/16 v51, 0x0

    .line 319
    .line 320
    const/16 v52, 0x0

    .line 321
    .line 322
    invoke-static/range {v9 .. v54}, La/z2s;->a(La/z2s;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/irs;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;II)La/z2s;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :pswitch_1
    move-object/from16 v1, p1

    .line 328
    .line 329
    check-cast v1, La/oyg0;

    .line 330
    .line 331
    move-object/from16 v9, p2

    .line 332
    .line 333
    check-cast v9, La/qnr;

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget v1, v0, La/lok0;->a:I

    .line 342
    .line 343
    iget-object v0, v0, La/lok0;->u:Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    new-instance v10, La/bzu;

    .line 349
    .line 350
    invoke-direct {v10, v8}, La/bzu;-><init>(B)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v10, v7}, La/bzu;->g(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v6}, La/bzu;->g(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v10, v5}, La/bzu;->g(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v10, v4}, La/bzu;->g(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-nez v4, :cond_2

    .line 370
    .line 371
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    :cond_2
    invoke-static {v10, v0, v3, v2}, La/axq;->u(La/bzu;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v10, La/bzu;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v42

    .line 386
    const/16 v58, -0x1

    .line 387
    .line 388
    const v59, 0x7fffe

    .line 389
    .line 390
    .line 391
    const-wide/16 v10, 0x0

    .line 392
    .line 393
    const/4 v12, 0x0

    .line 394
    const/4 v13, 0x0

    .line 395
    const/4 v14, 0x0

    .line 396
    const-wide/16 v15, 0x0

    .line 397
    .line 398
    const-wide/16 v17, 0x0

    .line 399
    .line 400
    const/16 v19, 0x0

    .line 401
    .line 402
    const/16 v20, 0x0

    .line 403
    .line 404
    const/16 v21, 0x0

    .line 405
    .line 406
    const/16 v22, 0x0

    .line 407
    .line 408
    const/16 v23, 0x0

    .line 409
    .line 410
    const/16 v24, 0x0

    .line 411
    .line 412
    const/16 v25, 0x0

    .line 413
    .line 414
    const/16 v26, 0x0

    .line 415
    .line 416
    const/16 v27, 0x0

    .line 417
    .line 418
    const/16 v28, 0x0

    .line 419
    .line 420
    const/16 v29, 0x0

    .line 421
    .line 422
    const/16 v30, 0x0

    .line 423
    .line 424
    const/16 v31, 0x0

    .line 425
    .line 426
    const/16 v32, 0x0

    .line 427
    .line 428
    const/16 v33, 0x0

    .line 429
    .line 430
    const/16 v34, 0x0

    .line 431
    .line 432
    const/16 v35, 0x0

    .line 433
    .line 434
    const/16 v36, 0x0

    .line 435
    .line 436
    const/16 v37, 0x0

    .line 437
    .line 438
    const/16 v38, 0x0

    .line 439
    .line 440
    const/16 v39, 0x0

    .line 441
    .line 442
    const/16 v40, 0x0

    .line 443
    .line 444
    const/16 v41, 0x0

    .line 445
    .line 446
    const/16 v43, 0x0

    .line 447
    .line 448
    const/16 v44, 0x0

    .line 449
    .line 450
    const/16 v45, 0x0

    .line 451
    .line 452
    const/16 v46, 0x0

    .line 453
    .line 454
    const/16 v47, 0x0

    .line 455
    .line 456
    const/16 v48, 0x0

    .line 457
    .line 458
    const/16 v49, 0x0

    .line 459
    .line 460
    const/16 v50, 0x0

    .line 461
    .line 462
    const/16 v51, 0x0

    .line 463
    .line 464
    const/16 v52, 0x0

    .line 465
    .line 466
    const/16 v53, 0x0

    .line 467
    .line 468
    const/16 v54, 0x0

    .line 469
    .line 470
    const/16 v55, 0x0

    .line 471
    .line 472
    const/16 v56, 0x0

    .line 473
    .line 474
    const/16 v57, 0x0

    .line 475
    .line 476
    invoke-static/range {v9 .. v59}, La/qnr;->a(La/qnr;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;ZII)La/qnr;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    return-object v0

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
