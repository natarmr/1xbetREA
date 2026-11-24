.class public final synthetic La/xb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/kc4;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/kc4;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xb4;->a:B

    iput-object p1, p0, La/xb4;->b:Ljava/lang/String;

    iput-object p2, p0, La/xb4;->c:La/kc4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xb4;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/xb4;->c:La/kc4;

    .line 6
    .line 7
    iget-object v0, v0, La/xb4;->b:Ljava/lang/String;

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
    check-cast v3, La/mb4;

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
    iget-boolean v4, v3, La/mb4;->n:Z

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    :goto_0
    move v14, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v5, 0x1

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, "KEY_PASSWORD_RECOVER"

    .line 47
    .line 48
    invoke-static {v1, v4, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v4, "KEY_PASSWORD"

    .line 56
    .line 57
    invoke-static {v1, v0, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, La/hd4;->a(Ljava/lang/String;)La/hd4;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, La/mb4;

    .line 69
    .line 70
    iget-object v0, v0, La/mb4;->f:La/hd4;

    .line 71
    .line 72
    iget-object v0, v0, La/hd4;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/mb4;

    .line 86
    .line 87
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 88
    .line 89
    sget-object v1, La/hh4;->a:La/hh4;

    .line 90
    .line 91
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_3

    .line 96
    .line 97
    :goto_2
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, La/mb4;

    .line 102
    .line 103
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 104
    .line 105
    move-object v12, v0

    .line 106
    goto :goto_4

    .line 107
    :cond_3
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, La/mb4;

    .line 112
    .line 113
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 114
    .line 115
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    move-object v5, v4

    .line 135
    check-cast v5, La/lh4;

    .line 136
    .line 137
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-nez v5, :cond_4

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    move-object v12, v2

    .line 148
    :goto_4
    const/4 v13, 0x0

    .line 149
    const/16 v15, 0x1ddf

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    const/4 v6, 0x0

    .line 154
    const/4 v7, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    invoke-static/range {v3 .. v15}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :pswitch_0
    move-object/from16 v1, p1

    .line 164
    .line 165
    check-cast v1, La/oyg0;

    .line 166
    .line 167
    move-object/from16 v3, p2

    .line 168
    .line 169
    check-cast v3, La/mb4;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v4, v3, La/mb4;->g:La/id4;

    .line 178
    .line 179
    const-string v5, "KEY_PHONE"

    .line 180
    .line 181
    invoke-static {v1, v0, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v4, v0}, La/id4;->b(La/id4;Ljava/lang/String;)La/id4;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, La/mb4;

    .line 193
    .line 194
    iget-object v0, v0, La/mb4;->g:La/id4;

    .line 195
    .line 196
    iget-object v0, v0, La/id4;->a:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-nez v0, :cond_6

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_6
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/mb4;

    .line 210
    .line 211
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 212
    .line 213
    sget-object v1, La/ih4;->a:La/ih4;

    .line 214
    .line 215
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    sget-object v4, La/kh4;->a:La/kh4;

    .line 220
    .line 221
    if-nez v0, :cond_7

    .line 222
    .line 223
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, La/mb4;

    .line 228
    .line 229
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-nez v0, :cond_7

    .line 236
    .line 237
    :goto_5
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, La/mb4;

    .line 242
    .line 243
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 244
    .line 245
    move-object v12, v0

    .line 246
    goto :goto_7

    .line 247
    :cond_7
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, La/mb4;

    .line 252
    .line 253
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 254
    .line 255
    new-instance v2, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    :cond_8
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_9

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    move-object v6, v5

    .line 275
    check-cast v6, La/lh4;

    .line 276
    .line 277
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_8

    .line 282
    .line 283
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-nez v6, :cond_8

    .line 288
    .line 289
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_9
    move-object v12, v2

    .line 294
    :goto_7
    const/4 v14, 0x0

    .line 295
    const/16 v15, 0x3dbf

    .line 296
    .line 297
    const/4 v4, 0x0

    .line 298
    const/4 v5, 0x0

    .line 299
    const/4 v6, 0x0

    .line 300
    const/4 v7, 0x0

    .line 301
    const/4 v8, 0x0

    .line 302
    const/4 v10, 0x0

    .line 303
    const/4 v11, 0x0

    .line 304
    const/4 v13, 0x0

    .line 305
    invoke-static/range {v3 .. v15}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    return-object v0

    .line 310
    :pswitch_1
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, La/oyg0;

    .line 313
    .line 314
    move-object/from16 v3, p2

    .line 315
    .line 316
    check-cast v3, La/mb4;

    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const-string v4, "KEY_LOGIN"

    .line 329
    .line 330
    invoke-static {v1, v0, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-static {v0}, La/gd4;->a(Ljava/lang/String;)La/gd4;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, La/mb4;

    .line 342
    .line 343
    iget-object v0, v0, La/mb4;->e:La/gd4;

    .line 344
    .line 345
    iget-object v0, v0, La/gd4;->a:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_a

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_a
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, La/mb4;

    .line 359
    .line 360
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 361
    .line 362
    sget-object v1, La/gh4;->a:La/gh4;

    .line 363
    .line 364
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_b

    .line 369
    .line 370
    :goto_8
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    check-cast v0, La/mb4;

    .line 375
    .line 376
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 377
    .line 378
    move-object v12, v0

    .line 379
    goto :goto_a

    .line 380
    :cond_b
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    check-cast v0, La/mb4;

    .line 385
    .line 386
    iget-object v0, v0, La/mb4;->j:Ljava/util/List;

    .line 387
    .line 388
    new-instance v2, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    :cond_c
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-eqz v4, :cond_d

    .line 402
    .line 403
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    move-object v5, v4

    .line 408
    check-cast v5, La/lh4;

    .line 409
    .line 410
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-nez v5, :cond_c

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_9

    .line 420
    :cond_d
    move-object v12, v2

    .line 421
    :goto_a
    const/4 v14, 0x0

    .line 422
    const/16 v15, 0x3def

    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    const/4 v5, 0x0

    .line 426
    const/4 v6, 0x0

    .line 427
    const/4 v8, 0x0

    .line 428
    const/4 v9, 0x0

    .line 429
    const/4 v10, 0x0

    .line 430
    const/4 v11, 0x0

    .line 431
    const/4 v13, 0x0

    .line 432
    invoke-static/range {v3 .. v15}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
