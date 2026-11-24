.class public final synthetic La/rb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qkt;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/qkt;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rb4;->a:B

    iput-object p1, p0, La/rb4;->b:La/qkt;

    iput-boolean p2, p0, La/rb4;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rb4;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_COUNTRY_ALLOWED"

    .line 6
    .line 7
    const-string v3, "KEY_PHONE_MASK_MAX_LENGTH"

    .line 8
    .line 9
    const-string v4, "KEY_PHONE_MASK"

    .line 10
    .line 11
    const-string v5, "KEY_CODE_COUNTRY_IMAGE"

    .line 12
    .line 13
    const-string v6, "KEY_PHONE"

    .line 14
    .line 15
    const-string v7, ""

    .line 16
    .line 17
    const-string v8, "KEY_PHONE_CODE"

    .line 18
    .line 19
    const-string v9, "KEY_SELECTED_COUNTRY_ID"

    .line 20
    .line 21
    iget-object v10, v0, La/rb4;->b:La/qkt;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/oyg0;

    .line 29
    .line 30
    move-object/from16 v11, p2

    .line 31
    .line 32
    check-cast v11, La/y780;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget v1, v10, La/qkt;->a:I

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v10, La/qkt;->f:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/4 v5, 0x0

    .line 59
    if-nez v4, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    const-string v4, "https://"

    .line 74
    .line 75
    invoke-static {v3, v4, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    const/16 v6, 0x2f

    .line 87
    .line 88
    if-lez v4, :cond_2

    .line 89
    .line 90
    const-string v4, "/"

    .line 91
    .line 92
    invoke-static {v2, v4}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_2

    .line 97
    .line 98
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_2
    const/4 v4, 0x1

    .line 102
    new-array v4, v4, [C

    .line 103
    .line 104
    aput-char v6, v4, v5

    .line 105
    .line 106
    invoke-static {v3, v4}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    :goto_0
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    :goto_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v18

    .line 124
    iget-object v2, v10, La/qkt;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v3, v10, La/qkt;->h:La/cm90;

    .line 127
    .line 128
    iget v13, v3, La/cm90;->c:I

    .line 129
    .line 130
    iget-object v3, v3, La/cm90;->d:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v17

    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const v28, 0x3f03c

    .line 139
    .line 140
    .line 141
    const-string v12, ""

    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    iget-boolean v0, v0, La/rb4;->c:Z

    .line 148
    .line 149
    const/16 v23, 0x0

    .line 150
    .line 151
    const/16 v24, 0x0

    .line 152
    .line 153
    const/16 v25, 0x0

    .line 154
    .line 155
    const/16 v26, 0x0

    .line 156
    .line 157
    move-object/from16 v21, v3

    .line 158
    .line 159
    move/from16 v22, v0

    .line 160
    .line 161
    move-object/from16 v19, v2

    .line 162
    .line 163
    move-object/from16 v20, v3

    .line 164
    .line 165
    invoke-static/range {v11 .. v28}, La/y780;->a(La/y780;Ljava/lang/String;ILjava/util/List;La/bt9;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZI)La/y780;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    :pswitch_0
    move-object/from16 v1, p1

    .line 171
    .line 172
    check-cast v1, La/oyg0;

    .line 173
    .line 174
    move-object/from16 v11, p2

    .line 175
    .line 176
    check-cast v11, La/tj4;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget v12, v10, La/qkt;->a:I

    .line 185
    .line 186
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    invoke-static {v1, v13, v9}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v9, v10, La/qkt;->c:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v1, v9, v8}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v7, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iget-object v6, v10, La/qkt;->f:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v1, v6, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-object v5, v10, La/qkt;->h:La/cm90;

    .line 207
    .line 208
    iget-object v8, v5, La/cm90;->d:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v1, v8, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget v4, v5, La/cm90;->c:I

    .line 214
    .line 215
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v1, v5, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v4, v7, v8, v9, v6}, La/id4;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/id4;

    .line 223
    .line 224
    .line 225
    move-result-object v17

    .line 226
    iget-boolean v0, v0, La/rb4;->c:Z

    .line 227
    .line 228
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {v1, v3, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const v23, 0xfe37

    .line 238
    .line 239
    .line 240
    move/from16 v18, v12

    .line 241
    .line 242
    const/4 v12, 0x0

    .line 243
    const/4 v13, 0x0

    .line 244
    const/4 v14, 0x0

    .line 245
    const/4 v15, 0x0

    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    const/16 v20, 0x0

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    move/from16 v19, v0

    .line 253
    .line 254
    invoke-static/range {v11 .. v23}, La/tj4;->a(La/tj4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/tj4;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0

    .line 259
    :pswitch_1
    move-object/from16 v1, p1

    .line 260
    .line 261
    check-cast v1, La/oyg0;

    .line 262
    .line 263
    move-object/from16 v11, p2

    .line 264
    .line 265
    check-cast v11, La/zf4;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget v12, v10, La/qkt;->a:I

    .line 274
    .line 275
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-static {v1, v13, v9}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iget-object v9, v10, La/qkt;->c:Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {v1, v9, v8}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v1, v7, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v6, v10, La/qkt;->f:Ljava/lang/String;

    .line 291
    .line 292
    invoke-static {v1, v6, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v5, v10, La/qkt;->h:La/cm90;

    .line 296
    .line 297
    iget-object v8, v5, La/cm90;->d:Ljava/lang/String;

    .line 298
    .line 299
    invoke-static {v1, v8, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget v4, v5, La/cm90;->c:I

    .line 303
    .line 304
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-static {v1, v5, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4, v7, v8, v9, v6}, La/id4;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/id4;

    .line 312
    .line 313
    .line 314
    move-result-object v17

    .line 315
    iget-boolean v0, v0, La/rb4;->c:Z

    .line 316
    .line 317
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v1, v3, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    const/16 v23, 0x0

    .line 325
    .line 326
    const/16 v24, 0x7e37

    .line 327
    .line 328
    move/from16 v18, v12

    .line 329
    .line 330
    const/4 v12, 0x0

    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    const/16 v20, 0x0

    .line 337
    .line 338
    const/16 v21, 0x0

    .line 339
    .line 340
    const/16 v22, 0x0

    .line 341
    .line 342
    move/from16 v19, v0

    .line 343
    .line 344
    invoke-static/range {v11 .. v24}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :pswitch_2
    move-object/from16 v1, p1

    .line 350
    .line 351
    check-cast v1, La/oyg0;

    .line 352
    .line 353
    move-object/from16 v11, p2

    .line 354
    .line 355
    check-cast v11, La/mb4;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iget v12, v10, La/qkt;->a:I

    .line 364
    .line 365
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    invoke-static {v1, v13, v9}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object v9, v10, La/qkt;->c:Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v1, v9, v8}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v1, v7, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    iget-object v6, v10, La/qkt;->f:Ljava/lang/String;

    .line 381
    .line 382
    invoke-static {v1, v6, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    iget-object v5, v10, La/qkt;->h:La/cm90;

    .line 386
    .line 387
    iget-object v8, v5, La/cm90;->d:Ljava/lang/String;

    .line 388
    .line 389
    invoke-static {v1, v8, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    iget v4, v5, La/cm90;->c:I

    .line 393
    .line 394
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-static {v1, v5, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v4, v7, v8, v9, v6}, La/id4;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/id4;

    .line 402
    .line 403
    .line 404
    move-result-object v17

    .line 405
    iget-boolean v0, v0, La/rb4;->c:Z

    .line 406
    .line 407
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-static {v1, v3, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    const/16 v22, 0x0

    .line 415
    .line 416
    const/16 v23, 0x3e37

    .line 417
    .line 418
    move/from16 v18, v12

    .line 419
    .line 420
    const/4 v12, 0x0

    .line 421
    const/4 v13, 0x0

    .line 422
    const/4 v14, 0x0

    .line 423
    const/4 v15, 0x0

    .line 424
    const/16 v16, 0x0

    .line 425
    .line 426
    const/16 v20, 0x0

    .line 427
    .line 428
    const/16 v21, 0x0

    .line 429
    .line 430
    move/from16 v19, v0

    .line 431
    .line 432
    invoke-static/range {v11 .. v23}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
