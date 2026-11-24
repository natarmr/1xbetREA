.class public final synthetic La/sd9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tdr;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/sd9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/sd9;->a:B

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    const/16 v7, 0xb

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, La/ccs0;

    .line 17
    .line 18
    iget v0, v0, La/ccs0;->c:I

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, La/mn30;

    .line 28
    .line 29
    invoke-interface {v0}, La/mn30;->p()La/dcs0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/dcs0;->b:La/rcf0;

    .line 34
    .line 35
    new-instance v1, La/sd9;

    .line 36
    .line 37
    invoke-direct {v1, v7}, La/sd9;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, La/x0x;->j0(Ljava/util/List;La/tdr;)Ljava/util/AbstractList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_1
    move-object/from16 v0, p1

    .line 50
    .line 51
    check-cast v0, La/ftf;

    .line 52
    .line 53
    iget-wide v0, v0, La/ftf;->c:J

    .line 54
    .line 55
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :pswitch_2
    move-object/from16 v0, p1

    .line 61
    .line 62
    check-cast v0, La/ftf;

    .line 63
    .line 64
    iget-wide v0, v0, La/ftf;->b:J

    .line 65
    .line 66
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :pswitch_3
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, La/ybw;

    .line 74
    .line 75
    invoke-virtual {v0}, La/ybw;->x()V

    .line 76
    .line 77
    .line 78
    iget-object v0, v0, La/ybw;->j1:La/dcs0;

    .line 79
    .line 80
    iget-object v0, v0, La/dcs0;->b:La/rcf0;

    .line 81
    .line 82
    new-instance v1, La/sd9;

    .line 83
    .line 84
    invoke-direct {v1, v7}, La/sd9;-><init>(B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, La/x0x;->j0(Ljava/util/List;La/tdr;)Ljava/util/AbstractList;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0

    .line 96
    :pswitch_4
    move-object/from16 v0, p1

    .line 97
    .line 98
    check-cast v0, La/uty;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    iget-object v2, v0, La/uty;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v2, ": "

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, La/uty;->b:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :pswitch_5
    new-instance v0, La/fsj;

    .line 126
    .line 127
    move-object/from16 v1, p1

    .line 128
    .line 129
    check-cast v1, La/l9o0;

    .line 130
    .line 131
    invoke-direct {v0, v1}, La/fsj;-><init>(La/l9o0;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_6
    move-object/from16 v0, p1

    .line 136
    .line 137
    check-cast v0, La/ftf;

    .line 138
    .line 139
    iget-wide v0, v0, La/ftf;->b:J

    .line 140
    .line 141
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    cmp-long v2, v0, v2

    .line 147
    .line 148
    if-nez v2, :cond_0

    .line 149
    .line 150
    const-wide/16 v0, 0x0

    .line 151
    .line 152
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_7
    move-object/from16 v0, p1

    .line 158
    .line 159
    check-cast v0, La/ctf;

    .line 160
    .line 161
    iget v0, v0, La/ctf;->r:I

    .line 162
    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :pswitch_8
    move-object/from16 v0, p1

    .line 169
    .line 170
    check-cast v0, La/ctf;

    .line 171
    .line 172
    iget-object v7, v0, La/ctf;->d:Landroid/graphics/Bitmap;

    .line 173
    .line 174
    new-instance v8, Landroid/os/Bundle;

    .line 175
    .line 176
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 177
    .line 178
    .line 179
    iget-object v9, v0, La/ctf;->a:Ljava/lang/CharSequence;

    .line 180
    .line 181
    if-eqz v9, :cond_5

    .line 182
    .line 183
    sget-object v10, La/ctf;->s:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 186
    .line 187
    .line 188
    instance-of v10, v9, Landroid/text/Spanned;

    .line 189
    .line 190
    if-eqz v10, :cond_5

    .line 191
    .line 192
    check-cast v9, Landroid/text/Spanned;

    .line 193
    .line 194
    sget-object v10, La/cyf;->a:Ljava/lang/String;

    .line 195
    .line 196
    new-instance v10, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    const-class v12, La/wkg0;

    .line 206
    .line 207
    invoke-interface {v9, v6, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, [La/wkg0;

    .line 212
    .line 213
    array-length v12, v11

    .line 214
    move v13, v6

    .line 215
    :goto_0
    if-ge v13, v12, :cond_1

    .line 216
    .line 217
    aget-object v14, v11, v13

    .line 218
    .line 219
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    new-instance v15, Landroid/os/Bundle;

    .line 223
    .line 224
    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 225
    .line 226
    .line 227
    sget-object v1, La/wkg0;->c:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v2, v14, La/wkg0;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v15, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    sget-object v1, La/wkg0;->d:Ljava/lang/String;

    .line 235
    .line 236
    iget v2, v14, La/wkg0;->b:I

    .line 237
    .line 238
    invoke-virtual {v15, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    invoke-static {v9, v14, v5, v15}, La/cyf;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    add-int/lit8 v13, v13, 0x1

    .line 249
    .line 250
    goto :goto_0

    .line 251
    :cond_1
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    const-class v2, La/t5q0;

    .line 256
    .line 257
    invoke-interface {v9, v6, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, [La/t5q0;

    .line 262
    .line 263
    array-length v2, v1

    .line 264
    move v5, v6

    .line 265
    :goto_1
    if-ge v5, v2, :cond_2

    .line 266
    .line 267
    aget-object v11, v1, v5

    .line 268
    .line 269
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    new-instance v12, Landroid/os/Bundle;

    .line 273
    .line 274
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 275
    .line 276
    .line 277
    sget-object v13, La/t5q0;->d:Ljava/lang/String;

    .line 278
    .line 279
    iget v14, v11, La/t5q0;->a:I

    .line 280
    .line 281
    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    sget-object v13, La/t5q0;->e:Ljava/lang/String;

    .line 285
    .line 286
    iget v14, v11, La/t5q0;->b:I

    .line 287
    .line 288
    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 289
    .line 290
    .line 291
    sget-object v13, La/t5q0;->f:Ljava/lang/String;

    .line 292
    .line 293
    iget v14, v11, La/t5q0;->c:I

    .line 294
    .line 295
    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 296
    .line 297
    .line 298
    invoke-static {v9, v11, v4, v12}, La/cyf;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    add-int/lit8 v5, v5, 0x1

    .line 306
    .line 307
    goto :goto_1

    .line 308
    :cond_2
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    const-class v2, La/bmw;

    .line 313
    .line 314
    invoke-interface {v9, v6, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, [La/bmw;

    .line 319
    .line 320
    array-length v2, v1

    .line 321
    move v4, v6

    .line 322
    :goto_2
    if-ge v4, v2, :cond_3

    .line 323
    .line 324
    aget-object v5, v1, v4

    .line 325
    .line 326
    const/4 v11, 0x0

    .line 327
    invoke-static {v9, v5, v3, v11}, La/cyf;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    add-int/lit8 v4, v4, 0x1

    .line 335
    .line 336
    goto :goto_2

    .line 337
    :cond_3
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    const-class v2, La/dvu0;

    .line 342
    .line 343
    invoke-interface {v9, v6, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, [La/dvu0;

    .line 348
    .line 349
    array-length v2, v1

    .line 350
    move v3, v6

    .line 351
    :goto_3
    if-ge v3, v2, :cond_4

    .line 352
    .line 353
    aget-object v4, v1, v3

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    new-instance v5, Landroid/os/Bundle;

    .line 359
    .line 360
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 361
    .line 362
    .line 363
    sget-object v11, La/dvu0;->b:Ljava/lang/String;

    .line 364
    .line 365
    iget-object v12, v4, La/dvu0;->a:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v5, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    const/4 v11, 0x4

    .line 371
    invoke-static {v9, v4, v11, v5}, La/cyf;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    add-int/lit8 v3, v3, 0x1

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-nez v1, :cond_5

    .line 386
    .line 387
    sget-object v1, La/ctf;->t:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v8, v1, v10}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 390
    .line 391
    .line 392
    :cond_5
    sget-object v1, La/ctf;->u:Ljava/lang/String;

    .line 393
    .line 394
    iget-object v2, v0, La/ctf;->b:Landroid/text/Layout$Alignment;

    .line 395
    .line 396
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 397
    .line 398
    .line 399
    sget-object v1, La/ctf;->v:Ljava/lang/String;

    .line 400
    .line 401
    iget-object v2, v0, La/ctf;->c:Landroid/text/Layout$Alignment;

    .line 402
    .line 403
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 404
    .line 405
    .line 406
    sget-object v1, La/ctf;->y:Ljava/lang/String;

    .line 407
    .line 408
    iget v2, v0, La/ctf;->e:F

    .line 409
    .line 410
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 411
    .line 412
    .line 413
    sget-object v1, La/ctf;->z:Ljava/lang/String;

    .line 414
    .line 415
    iget v2, v0, La/ctf;->f:I

    .line 416
    .line 417
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 418
    .line 419
    .line 420
    sget-object v1, La/ctf;->A:Ljava/lang/String;

    .line 421
    .line 422
    iget v2, v0, La/ctf;->g:I

    .line 423
    .line 424
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 425
    .line 426
    .line 427
    sget-object v1, La/ctf;->B:Ljava/lang/String;

    .line 428
    .line 429
    iget v2, v0, La/ctf;->h:F

    .line 430
    .line 431
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 432
    .line 433
    .line 434
    sget-object v1, La/ctf;->C:Ljava/lang/String;

    .line 435
    .line 436
    iget v2, v0, La/ctf;->i:I

    .line 437
    .line 438
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 439
    .line 440
    .line 441
    sget-object v1, La/ctf;->D:Ljava/lang/String;

    .line 442
    .line 443
    iget v2, v0, La/ctf;->n:I

    .line 444
    .line 445
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 446
    .line 447
    .line 448
    sget-object v1, La/ctf;->E:Ljava/lang/String;

    .line 449
    .line 450
    iget v2, v0, La/ctf;->o:F

    .line 451
    .line 452
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 453
    .line 454
    .line 455
    sget-object v1, La/ctf;->F:Ljava/lang/String;

    .line 456
    .line 457
    iget v2, v0, La/ctf;->j:F

    .line 458
    .line 459
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 460
    .line 461
    .line 462
    sget-object v1, La/ctf;->G:Ljava/lang/String;

    .line 463
    .line 464
    iget v2, v0, La/ctf;->k:F

    .line 465
    .line 466
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 467
    .line 468
    .line 469
    sget-object v1, La/ctf;->I:Ljava/lang/String;

    .line 470
    .line 471
    iget-boolean v2, v0, La/ctf;->l:Z

    .line 472
    .line 473
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 474
    .line 475
    .line 476
    sget-object v1, La/ctf;->H:Ljava/lang/String;

    .line 477
    .line 478
    iget v2, v0, La/ctf;->m:I

    .line 479
    .line 480
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 481
    .line 482
    .line 483
    sget-object v1, La/ctf;->J:Ljava/lang/String;

    .line 484
    .line 485
    iget v2, v0, La/ctf;->p:I

    .line 486
    .line 487
    invoke-virtual {v8, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 488
    .line 489
    .line 490
    sget-object v1, La/ctf;->K:Ljava/lang/String;

    .line 491
    .line 492
    iget v2, v0, La/ctf;->q:F

    .line 493
    .line 494
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 495
    .line 496
    .line 497
    sget-object v1, La/ctf;->L:Ljava/lang/String;

    .line 498
    .line 499
    iget v0, v0, La/ctf;->r:I

    .line 500
    .line 501
    invoke-virtual {v8, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 502
    .line 503
    .line 504
    if-eqz v7, :cond_6

    .line 505
    .line 506
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 507
    .line 508
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 509
    .line 510
    .line 511
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 512
    .line 513
    invoke-virtual {v7, v1, v6, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 518
    .line 519
    .line 520
    sget-object v1, La/ctf;->x:Ljava/lang/String;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v8, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 527
    .line 528
    .line 529
    :cond_6
    return-object v8

    .line 530
    :pswitch_9
    const/4 v11, 0x0

    .line 531
    move-object/from16 v0, p1

    .line 532
    .line 533
    check-cast v0, Landroid/os/Bundle;

    .line 534
    .line 535
    sget-object v1, La/ctf;->s:Ljava/lang/String;

    .line 536
    .line 537
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    if-eqz v1, :cond_b

    .line 542
    .line 543
    sget-object v2, La/ctf;->t:Ljava/lang/String;

    .line 544
    .line 545
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    if-eqz v2, :cond_c

    .line 550
    .line 551
    invoke-static {v1}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    if-eqz v7, :cond_c

    .line 564
    .line 565
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    check-cast v7, Landroid/os/Bundle;

    .line 570
    .line 571
    sget-object v8, La/cyf;->a:Ljava/lang/String;

    .line 572
    .line 573
    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 574
    .line 575
    .line 576
    move-result v8

    .line 577
    sget-object v9, La/cyf;->b:Ljava/lang/String;

    .line 578
    .line 579
    invoke-virtual {v7, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 580
    .line 581
    .line 582
    move-result v9

    .line 583
    sget-object v10, La/cyf;->c:Ljava/lang/String;

    .line 584
    .line 585
    invoke-virtual {v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 586
    .line 587
    .line 588
    move-result v10

    .line 589
    sget-object v12, La/cyf;->d:Ljava/lang/String;

    .line 590
    .line 591
    const/4 v13, -0x1

    .line 592
    invoke-virtual {v7, v12, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 593
    .line 594
    .line 595
    move-result v12

    .line 596
    sget-object v13, La/cyf;->e:Ljava/lang/String;

    .line 597
    .line 598
    invoke-virtual {v7, v13}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    if-eq v12, v5, :cond_a

    .line 603
    .line 604
    if-eq v12, v4, :cond_9

    .line 605
    .line 606
    if-eq v12, v3, :cond_8

    .line 607
    .line 608
    const/4 v13, 0x4

    .line 609
    if-eq v12, v13, :cond_7

    .line 610
    .line 611
    goto :goto_5

    .line 612
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    new-instance v12, La/dvu0;

    .line 616
    .line 617
    sget-object v14, La/dvu0;->b:Ljava/lang/String;

    .line 618
    .line 619
    invoke-virtual {v7, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v7

    .line 623
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    invoke-direct {v12, v7}, La/dvu0;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-interface {v1, v12, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 630
    .line 631
    .line 632
    goto :goto_5

    .line 633
    :cond_8
    const/4 v13, 0x4

    .line 634
    new-instance v7, La/bmw;

    .line 635
    .line 636
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 637
    .line 638
    .line 639
    invoke-interface {v1, v7, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 640
    .line 641
    .line 642
    goto :goto_5

    .line 643
    :cond_9
    const/4 v13, 0x4

    .line 644
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    new-instance v12, La/t5q0;

    .line 648
    .line 649
    sget-object v14, La/t5q0;->d:Ljava/lang/String;

    .line 650
    .line 651
    invoke-virtual {v7, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 652
    .line 653
    .line 654
    move-result v14

    .line 655
    sget-object v15, La/t5q0;->e:Ljava/lang/String;

    .line 656
    .line 657
    invoke-virtual {v7, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 658
    .line 659
    .line 660
    move-result v15

    .line 661
    sget-object v3, La/t5q0;->f:Ljava/lang/String;

    .line 662
    .line 663
    invoke-virtual {v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    invoke-direct {v12, v14, v15, v3}, La/t5q0;-><init>(III)V

    .line 668
    .line 669
    .line 670
    invoke-interface {v1, v12, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 671
    .line 672
    .line 673
    goto :goto_5

    .line 674
    :cond_a
    const/4 v13, 0x4

    .line 675
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    new-instance v3, La/wkg0;

    .line 679
    .line 680
    sget-object v12, La/wkg0;->c:Ljava/lang/String;

    .line 681
    .line 682
    invoke-virtual {v7, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v12

    .line 686
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    sget-object v14, La/wkg0;->d:Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v7, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    invoke-direct {v3, v12, v7}, La/wkg0;-><init>(Ljava/lang/String;I)V

    .line 696
    .line 697
    .line 698
    invoke-interface {v1, v3, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 699
    .line 700
    .line 701
    :goto_5
    const/4 v3, 0x3

    .line 702
    goto/16 :goto_4

    .line 703
    .line 704
    :cond_b
    move-object v1, v11

    .line 705
    :cond_c
    sget-object v2, La/ctf;->u:Ljava/lang/String;

    .line 706
    .line 707
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    check-cast v2, Landroid/text/Layout$Alignment;

    .line 712
    .line 713
    if-eqz v2, :cond_d

    .line 714
    .line 715
    move-object v14, v2

    .line 716
    goto :goto_6

    .line 717
    :cond_d
    move-object v14, v11

    .line 718
    :goto_6
    sget-object v2, La/ctf;->v:Ljava/lang/String;

    .line 719
    .line 720
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    check-cast v2, Landroid/text/Layout$Alignment;

    .line 725
    .line 726
    if-eqz v2, :cond_e

    .line 727
    .line 728
    move-object v15, v2

    .line 729
    goto :goto_7

    .line 730
    :cond_e
    move-object v15, v11

    .line 731
    :goto_7
    sget-object v2, La/ctf;->w:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    check-cast v2, Landroid/graphics/Bitmap;

    .line 738
    .line 739
    if-eqz v2, :cond_f

    .line 740
    .line 741
    move-object/from16 v16, v2

    .line 742
    .line 743
    :goto_8
    move-object v13, v11

    .line 744
    goto :goto_9

    .line 745
    :cond_f
    sget-object v2, La/ctf;->x:Ljava/lang/String;

    .line 746
    .line 747
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    if-eqz v2, :cond_10

    .line 752
    .line 753
    array-length v1, v2

    .line 754
    invoke-static {v2, v6, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    move-object/from16 v16, v1

    .line 759
    .line 760
    goto :goto_8

    .line 761
    :cond_10
    move-object v13, v1

    .line 762
    move-object/from16 v16, v11

    .line 763
    .line 764
    :goto_9
    sget-object v1, La/ctf;->y:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    const v3, -0x800001

    .line 771
    .line 772
    .line 773
    const/high16 v4, -0x80000000

    .line 774
    .line 775
    if-eqz v2, :cond_11

    .line 776
    .line 777
    sget-object v2, La/ctf;->z:Ljava/lang/String;

    .line 778
    .line 779
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 780
    .line 781
    .line 782
    move-result v7

    .line 783
    if-eqz v7, :cond_11

    .line 784
    .line 785
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    move/from16 v17, v1

    .line 794
    .line 795
    move/from16 v18, v2

    .line 796
    .line 797
    goto :goto_a

    .line 798
    :cond_11
    move/from16 v17, v3

    .line 799
    .line 800
    move/from16 v18, v4

    .line 801
    .line 802
    :goto_a
    sget-object v1, La/ctf;->A:Ljava/lang/String;

    .line 803
    .line 804
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 805
    .line 806
    .line 807
    move-result v2

    .line 808
    if-eqz v2, :cond_12

    .line 809
    .line 810
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    move/from16 v19, v1

    .line 815
    .line 816
    goto :goto_b

    .line 817
    :cond_12
    move/from16 v19, v4

    .line 818
    .line 819
    :goto_b
    sget-object v1, La/ctf;->B:Ljava/lang/String;

    .line 820
    .line 821
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_13

    .line 826
    .line 827
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 828
    .line 829
    .line 830
    move-result v1

    .line 831
    move/from16 v20, v1

    .line 832
    .line 833
    goto :goto_c

    .line 834
    :cond_13
    move/from16 v20, v3

    .line 835
    .line 836
    :goto_c
    sget-object v1, La/ctf;->C:Ljava/lang/String;

    .line 837
    .line 838
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 839
    .line 840
    .line 841
    move-result v2

    .line 842
    if-eqz v2, :cond_14

    .line 843
    .line 844
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 845
    .line 846
    .line 847
    move-result v1

    .line 848
    move/from16 v21, v1

    .line 849
    .line 850
    goto :goto_d

    .line 851
    :cond_14
    move/from16 v21, v4

    .line 852
    .line 853
    :goto_d
    sget-object v1, La/ctf;->E:Ljava/lang/String;

    .line 854
    .line 855
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    if-eqz v2, :cond_15

    .line 860
    .line 861
    sget-object v2, La/ctf;->D:Ljava/lang/String;

    .line 862
    .line 863
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 864
    .line 865
    .line 866
    move-result v7

    .line 867
    if-eqz v7, :cond_15

    .line 868
    .line 869
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    move/from16 v23, v1

    .line 878
    .line 879
    move/from16 v22, v2

    .line 880
    .line 881
    goto :goto_e

    .line 882
    :cond_15
    move/from16 v23, v3

    .line 883
    .line 884
    move/from16 v22, v4

    .line 885
    .line 886
    :goto_e
    sget-object v1, La/ctf;->F:Ljava/lang/String;

    .line 887
    .line 888
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-eqz v2, :cond_16

    .line 893
    .line 894
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    move/from16 v24, v1

    .line 899
    .line 900
    goto :goto_f

    .line 901
    :cond_16
    move/from16 v24, v3

    .line 902
    .line 903
    :goto_f
    sget-object v1, La/ctf;->G:Ljava/lang/String;

    .line 904
    .line 905
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 906
    .line 907
    .line 908
    move-result v2

    .line 909
    if-eqz v2, :cond_17

    .line 910
    .line 911
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 912
    .line 913
    .line 914
    move-result v3

    .line 915
    :cond_17
    move/from16 v25, v3

    .line 916
    .line 917
    sget-object v1, La/ctf;->H:Ljava/lang/String;

    .line 918
    .line 919
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 920
    .line 921
    .line 922
    move-result v2

    .line 923
    if-eqz v2, :cond_18

    .line 924
    .line 925
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 926
    .line 927
    .line 928
    move-result v1

    .line 929
    :goto_10
    move/from16 v27, v1

    .line 930
    .line 931
    goto :goto_11

    .line 932
    :cond_18
    const/high16 v1, -0x1000000

    .line 933
    .line 934
    move v5, v6

    .line 935
    goto :goto_10

    .line 936
    :goto_11
    sget-object v1, La/ctf;->I:Ljava/lang/String;

    .line 937
    .line 938
    invoke-virtual {v0, v1, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 939
    .line 940
    .line 941
    move-result v1

    .line 942
    if-nez v1, :cond_19

    .line 943
    .line 944
    move/from16 v26, v6

    .line 945
    .line 946
    goto :goto_12

    .line 947
    :cond_19
    move/from16 v26, v5

    .line 948
    .line 949
    :goto_12
    sget-object v1, La/ctf;->J:Ljava/lang/String;

    .line 950
    .line 951
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    if-eqz v2, :cond_1a

    .line 956
    .line 957
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 958
    .line 959
    .line 960
    move-result v4

    .line 961
    :cond_1a
    move/from16 v28, v4

    .line 962
    .line 963
    sget-object v1, La/ctf;->K:Ljava/lang/String;

    .line 964
    .line 965
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-eqz v2, :cond_1b

    .line 970
    .line 971
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 972
    .line 973
    .line 974
    move-result v1

    .line 975
    :goto_13
    move/from16 v29, v1

    .line 976
    .line 977
    goto :goto_14

    .line 978
    :cond_1b
    const/4 v1, 0x0

    .line 979
    goto :goto_13

    .line 980
    :goto_14
    sget-object v1, La/ctf;->L:Ljava/lang/String;

    .line 981
    .line 982
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    if-eqz v2, :cond_1c

    .line 987
    .line 988
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 989
    .line 990
    .line 991
    move-result v6

    .line 992
    :cond_1c
    move/from16 v30, v6

    .line 993
    .line 994
    new-instance v12, La/ctf;

    .line 995
    .line 996
    invoke-direct/range {v12 .. v30}, La/ctf;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFI)V

    .line 997
    .line 998
    .line 999
    return-object v12

    .line 1000
    :pswitch_a
    move-object/from16 v0, p1

    .line 1001
    .line 1002
    check-cast v0, La/fuo;

    .line 1003
    .line 1004
    invoke-interface {v0}, La/fuo;->d()La/fuo;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    return-object v0

    .line 1017
    :pswitch_data_0
    .packed-switch 0x0
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
