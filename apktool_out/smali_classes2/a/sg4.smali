.class public final synthetic La/sg4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/fh4;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/fh4;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sg4;->a:B

    iput-object p1, p0, La/sg4;->b:Ljava/lang/String;

    iput-object p2, p0, La/sg4;->c:La/fh4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sg4;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/sg4;->c:La/fh4;

    .line 6
    .line 7
    iget-object v0, v0, La/sg4;->b:Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v3, p2

    .line 17
    .line 18
    check-cast v3, La/zf4;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v4, v3, La/zf4;->g:La/id4;

    .line 27
    .line 28
    const-string v5, "KEY_PHONE"

    .line 29
    .line 30
    invoke-static {v1, v0, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v4, v0}, La/id4;->b(La/id4;Ljava/lang/String;)La/id4;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/zf4;

    .line 42
    .line 43
    iget-object v0, v0, La/zf4;->g:La/id4;

    .line 44
    .line 45
    iget-object v0, v0, La/id4;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, La/zf4;

    .line 59
    .line 60
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 61
    .line 62
    sget-object v1, La/ih4;->a:La/ih4;

    .line 63
    .line 64
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sget-object v4, La/kh4;->a:La/kh4;

    .line 69
    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/zf4;

    .line 77
    .line 78
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/zf4;

    .line 91
    .line 92
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 93
    .line 94
    move-object v12, v0

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/zf4;

    .line 101
    .line 102
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 103
    .line 104
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_3

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    move-object v6, v5

    .line 124
    check-cast v6, La/lh4;

    .line 125
    .line 126
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-nez v7, :cond_2

    .line 131
    .line 132
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-nez v6, :cond_2

    .line 137
    .line 138
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    move-object v12, v2

    .line 143
    :goto_2
    const/4 v15, 0x0

    .line 144
    const/16 v16, 0x7dbf

    .line 145
    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v5, 0x0

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v10, 0x0

    .line 152
    const/4 v11, 0x0

    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v14, 0x0

    .line 155
    invoke-static/range {v3 .. v16}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :pswitch_0
    move-object/from16 v1, p1

    .line 161
    .line 162
    check-cast v1, La/oyg0;

    .line 163
    .line 164
    move-object/from16 v3, p2

    .line 165
    .line 166
    check-cast v3, La/zf4;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v4, "KEY_LOGIN"

    .line 179
    .line 180
    invoke-static {v1, v0, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, La/gd4;->a(Ljava/lang/String;)La/gd4;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, La/zf4;

    .line 192
    .line 193
    iget-object v0, v0, La/zf4;->e:La/gd4;

    .line 194
    .line 195
    iget-object v0, v0, La/gd4;->a:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_4

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_4
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, La/zf4;

    .line 209
    .line 210
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 211
    .line 212
    sget-object v1, La/gh4;->a:La/gh4;

    .line 213
    .line 214
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_5

    .line 219
    .line 220
    :goto_3
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, La/zf4;

    .line 225
    .line 226
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 227
    .line 228
    move-object v12, v0

    .line 229
    goto :goto_5

    .line 230
    :cond_5
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, La/zf4;

    .line 235
    .line 236
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 237
    .line 238
    new-instance v2, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_7

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    move-object v5, v4

    .line 258
    check-cast v5, La/lh4;

    .line 259
    .line 260
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v5, :cond_6

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_7
    move-object v12, v2

    .line 271
    :goto_5
    const/4 v15, 0x0

    .line 272
    const/16 v16, 0x7def

    .line 273
    .line 274
    const/4 v4, 0x0

    .line 275
    const/4 v5, 0x0

    .line 276
    const/4 v6, 0x0

    .line 277
    const/4 v8, 0x0

    .line 278
    const/4 v9, 0x0

    .line 279
    const/4 v10, 0x0

    .line 280
    const/4 v11, 0x0

    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    invoke-static/range {v3 .. v16}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    return-object v0

    .line 288
    :pswitch_1
    move-object/from16 v1, p1

    .line 289
    .line 290
    check-cast v1, La/oyg0;

    .line 291
    .line 292
    move-object/from16 v3, p2

    .line 293
    .line 294
    check-cast v3, La/zf4;

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-boolean v4, v3, La/zf4;->n:Z

    .line 303
    .line 304
    const/4 v5, 0x0

    .line 305
    if-nez v4, :cond_8

    .line 306
    .line 307
    :goto_6
    move v14, v5

    .line 308
    goto :goto_7

    .line 309
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-nez v4, :cond_9

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_9
    const/4 v5, 0x1

    .line 317
    goto :goto_6

    .line 318
    :goto_7
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    const-string v5, "KEY_PASSWORD_RECOVER"

    .line 323
    .line 324
    invoke-static {v1, v4, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    const-string v4, "KEY_PASSWORD"

    .line 332
    .line 333
    invoke-static {v1, v0, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-static {v0}, La/hd4;->a(Ljava/lang/String;)La/hd4;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, La/zf4;

    .line 345
    .line 346
    iget-object v0, v0, La/zf4;->f:La/hd4;

    .line 347
    .line 348
    iget-object v0, v0, La/hd4;->a:Ljava/lang/String;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-nez v0, :cond_a

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_a
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, La/zf4;

    .line 362
    .line 363
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 364
    .line 365
    sget-object v1, La/hh4;->a:La/hh4;

    .line 366
    .line 367
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-nez v0, :cond_b

    .line 372
    .line 373
    :goto_8
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, La/zf4;

    .line 378
    .line 379
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 380
    .line 381
    move-object v12, v0

    .line 382
    goto :goto_a

    .line 383
    :cond_b
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, La/zf4;

    .line 388
    .line 389
    iget-object v0, v0, La/zf4;->j:Ljava/util/List;

    .line 390
    .line 391
    new-instance v2, Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    :cond_c
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    if-eqz v4, :cond_d

    .line 405
    .line 406
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    move-object v5, v4

    .line 411
    check-cast v5, La/lh4;

    .line 412
    .line 413
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-nez v5, :cond_c

    .line 418
    .line 419
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_d
    move-object v12, v2

    .line 424
    :goto_a
    const/4 v15, 0x0

    .line 425
    const/16 v16, 0x5ddf

    .line 426
    .line 427
    const/4 v4, 0x0

    .line 428
    const/4 v5, 0x0

    .line 429
    const/4 v6, 0x0

    .line 430
    const/4 v7, 0x0

    .line 431
    const/4 v9, 0x0

    .line 432
    const/4 v10, 0x0

    .line 433
    const/4 v11, 0x0

    .line 434
    const/4 v13, 0x0

    .line 435
    invoke-static/range {v3 .. v16}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    return-object v0

    .line 440
    nop

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
