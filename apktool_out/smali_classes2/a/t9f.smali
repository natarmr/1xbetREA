.class public final synthetic La/t9f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/u9f;
.implements La/ols0;
.implements La/sg00;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/t9f;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/ft2;IIZ)V
    .locals 0

    .line 1
    const/16 p1, 0xf

    iput-byte p1, p0, La/t9f;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b()V
    .locals 1

    .line 1
    new-instance v0, La/m460;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method


# virtual methods
.method public a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/t9f;->a:B

    .line 4
    .line 5
    const-string v1, "Missing required properties:"

    .line 6
    .line 7
    const-string v2, " name"

    .line 8
    .line 9
    const-string v3, "Null name"

    .line 10
    .line 11
    const-string v4, "name"

    .line 12
    .line 13
    const/4 v5, -0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x2

    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/v9f;->f(Landroid/util/JsonReader;)La/w25;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 27
    .line 28
    .line 29
    const-wide/16 v10, 0x0

    .line 30
    .line 31
    move v0, v6

    .line 32
    move-object/from16 v17, v9

    .line 33
    .line 34
    move-object/from16 v18, v17

    .line 35
    .line 36
    move-wide v13, v10

    .line 37
    move-wide v15, v13

    .line 38
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    const/4 v11, 0x3

    .line 43
    if-eqz v10, :cond_5

    .line 44
    .line 45
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    sparse-switch v12, :sswitch_data_0

    .line 57
    .line 58
    .line 59
    :goto_1
    move v11, v5

    .line 60
    goto :goto_2

    .line 61
    :sswitch_0
    const-string v12, "baseAddress"

    .line 62
    .line 63
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-nez v10, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :sswitch_1
    const-string v11, "uuid"

    .line 71
    .line 72
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    move v11, v7

    .line 80
    goto :goto_2

    .line 81
    :sswitch_2
    const-string v11, "size"

    .line 82
    .line 83
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v10, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v11, v8

    .line 91
    goto :goto_2

    .line 92
    :sswitch_3
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move v11, v6

    .line 100
    :cond_3
    :goto_2
    packed-switch v11, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextLong()J

    .line 108
    .line 109
    .line 110
    move-result-wide v10

    .line 111
    or-int/lit8 v0, v0, 0x1

    .line 112
    .line 113
    int-to-byte v0, v0

    .line 114
    move-wide v13, v10

    .line 115
    goto :goto_0

    .line 116
    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-static {v10, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    new-instance v11, Ljava/lang/String;

    .line 125
    .line 126
    sget-object v12, La/r9f;->a:Ljava/nio/charset/Charset;

    .line 127
    .line 128
    invoke-direct {v11, v10, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 129
    .line 130
    .line 131
    move-object/from16 v18, v11

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextLong()J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    or-int/lit8 v0, v0, 0x2

    .line 139
    .line 140
    int-to-byte v0, v0

    .line 141
    move-wide v15, v10

    .line 142
    goto :goto_0

    .line 143
    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v17

    .line 147
    if-eqz v17, :cond_4

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_4
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->endObject()V

    .line 155
    .line 156
    .line 157
    if-ne v0, v11, :cond_7

    .line 158
    .line 159
    if-nez v17, :cond_6

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    new-instance v12, La/r25;

    .line 163
    .line 164
    invoke-direct/range {v12 .. v18}, La/r25;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move-object v9, v12

    .line 168
    goto :goto_4

    .line 169
    :cond_7
    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    and-int/lit8 v4, v0, 0x1

    .line 175
    .line 176
    if-nez v4, :cond_8

    .line 177
    .line 178
    const-string v4, " baseAddress"

    .line 179
    .line 180
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    :cond_8
    and-int/2addr v0, v7

    .line 184
    if-nez v0, :cond_9

    .line 185
    .line 186
    const-string v0, " size"

    .line 187
    .line 188
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    :cond_9
    if-nez v17, :cond_a

    .line 192
    .line 193
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    :cond_a
    invoke-static {v1, v3}, La/vqd;->o(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :goto_4
    return-object v9

    .line 204
    :pswitch_5
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->beginObject()V

    .line 205
    .line 206
    .line 207
    move v0, v6

    .line 208
    move v12, v0

    .line 209
    move-object v10, v9

    .line 210
    move-object v11, v10

    .line 211
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    if-eqz v13, :cond_10

    .line 216
    .line 217
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    sparse-switch v14, :sswitch_data_1

    .line 229
    .line 230
    .line 231
    :goto_6
    move v13, v5

    .line 232
    goto :goto_7

    .line 233
    :sswitch_4
    const-string v14, "importance"

    .line 234
    .line 235
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-nez v13, :cond_b

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_b
    move v13, v7

    .line 243
    goto :goto_7

    .line 244
    :sswitch_5
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    if-nez v13, :cond_c

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_c
    move v13, v8

    .line 252
    goto :goto_7

    .line 253
    :sswitch_6
    const-string v14, "frames"

    .line 254
    .line 255
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-nez v13, :cond_d

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_d
    move v13, v6

    .line 263
    :goto_7
    packed-switch v13, :pswitch_data_2

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->skipValue()V

    .line 267
    .line 268
    .line 269
    :goto_8
    move-object/from16 v13, p1

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextInt()I

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    or-int/lit8 v0, v0, 0x1

    .line 277
    .line 278
    int-to-byte v0, v0

    .line 279
    goto :goto_8

    .line 280
    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    if-eqz v10, :cond_e

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_e
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_a

    .line 291
    :pswitch_8
    new-instance v11, La/t9f;

    .line 292
    .line 293
    invoke-direct {v11, v7}, La/t9f;-><init>(B)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v13, p1

    .line 297
    .line 298
    invoke-static {v13, v11}, La/v9f;->b(Landroid/util/JsonReader;La/u9f;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    if-eqz v11, :cond_f

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_f
    const-string v0, "Null frames"

    .line 306
    .line 307
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_10
    move-object/from16 v13, p1

    .line 312
    .line 313
    invoke-virtual {v13}, Landroid/util/JsonReader;->endObject()V

    .line 314
    .line 315
    .line 316
    if-ne v0, v8, :cond_12

    .line 317
    .line 318
    if-eqz v10, :cond_12

    .line 319
    .line 320
    if-nez v11, :cond_11

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_11
    new-instance v9, La/u25;

    .line 324
    .line 325
    invoke-direct {v9, v10, v11, v12}, La/u25;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 326
    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_12
    :goto_9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    if-nez v10, :cond_13

    .line 335
    .line 336
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    :cond_13
    and-int/2addr v0, v8

    .line 340
    if-nez v0, :cond_14

    .line 341
    .line 342
    const-string v0, " importance"

    .line 343
    .line 344
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    :cond_14
    if-nez v11, :cond_15

    .line 348
    .line 349
    const-string v0, " frames"

    .line 350
    .line 351
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    :cond_15
    invoke-static {v1, v3}, La/vqd;->o(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    :goto_a
    return-object v9

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
    .end packed-switch

    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    :sswitch_data_0
    .sparse-switch
        0x337a8b -> :sswitch_3
        0x35e001 -> :sswitch_2
        0x36f3bb -> :sswitch_1
        0x44c50fe3 -> :sswitch_0
    .end sparse-switch

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    :sswitch_data_1
    .sparse-switch
        -0x4b7d7b5a -> :sswitch_6
        0x337a8b -> :sswitch_5
        0x7eb2da74 -> :sswitch_4
    .end sparse-switch

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/r9f;

    .line 2
    .line 3
    sget-object p0, La/pcj;->b:La/v9f;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p0, La/v9f;->a:La/g2v;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/g2v;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string p1, "UTF-8"

    .line 15
    .line 16
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/t9f;->a:B

    .line 2
    .line 3
    check-cast p1, La/gt2;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x6
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
