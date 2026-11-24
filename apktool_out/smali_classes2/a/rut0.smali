.class public final La/rut0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/rut0;

.field public static final b:La/ewb0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/rut0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/rut0;->a:La/rut0;

    .line 7
    .line 8
    new-instance v0, La/ewb0;

    .line 9
    .line 10
    const-string v1, "kotlin.uuid.Uuid"

    .line 11
    .line 12
    sget-object v2, La/zvb0;->j:La/zvb0;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/ewb0;-><init>(Ljava/lang/String;La/zvb0;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/rut0;->b:La/ewb0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 24

    .line 1
    sget-object v0, La/nut0;->c:La/mut0;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, La/rkj;->z()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    const-string v6, "a hexadecimal digit"

    .line 23
    .line 24
    const/4 v7, 0x4

    .line 25
    const/4 v8, 0x0

    .line 26
    const/16 v9, 0x20

    .line 27
    .line 28
    if-eq v0, v9, :cond_11

    .line 29
    .line 30
    const/16 v10, 0x24

    .line 31
    .line 32
    if-eq v0, v10, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \""

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/16 v4, 0x40

    .line 48
    .line 49
    if-gt v3, v4, :cond_0

    .line 50
    .line 51
    move-object v3, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v1, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "..."

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v3, "\" of length "

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_1
    move-wide v11, v4

    .line 87
    :goto_1
    const/16 v0, 0x8

    .line 88
    .line 89
    if-ge v8, v0, :cond_3

    .line 90
    .line 91
    shl-long/2addr v11, v7

    .line 92
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    ushr-int/lit8 v13, v0, 0x8

    .line 97
    .line 98
    if-nez v13, :cond_2

    .line 99
    .line 100
    sget-object v13, La/zvv;->d:[J

    .line 101
    .line 102
    aget-wide v14, v13, v0

    .line 103
    .line 104
    cmp-long v0, v14, v4

    .line 105
    .line 106
    if-ltz v0, :cond_2

    .line 107
    .line 108
    or-long/2addr v11, v14

    .line 109
    add-int/lit8 v8, v8, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-static {v8, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v2

    .line 116
    :cond_3
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    const-string v13, "\'-\' (hyphen)"

    .line 121
    .line 122
    const/16 v14, 0x2d

    .line 123
    .line 124
    if-ne v8, v14, :cond_10

    .line 125
    .line 126
    const/16 v0, 0x9

    .line 127
    .line 128
    move-wide v15, v4

    .line 129
    :goto_2
    const/16 v8, 0xd

    .line 130
    .line 131
    if-ge v0, v8, :cond_5

    .line 132
    .line 133
    shl-long/2addr v15, v7

    .line 134
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    ushr-int/lit8 v17, v8, 0x8

    .line 139
    .line 140
    if-nez v17, :cond_4

    .line 141
    .line 142
    sget-object v17, La/zvv;->d:[J

    .line 143
    .line 144
    aget-wide v18, v17, v8

    .line 145
    .line 146
    cmp-long v8, v18, v4

    .line 147
    .line 148
    if-ltz v8, :cond_4

    .line 149
    .line 150
    or-long v15, v15, v18

    .line 151
    .line 152
    add-int/lit8 v0, v0, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    invoke-static {v0, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v2

    .line 159
    :cond_5
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-ne v0, v14, :cond_f

    .line 164
    .line 165
    const/16 v0, 0xe

    .line 166
    .line 167
    move-wide/from16 v17, v4

    .line 168
    .line 169
    :goto_3
    const/16 v8, 0x12

    .line 170
    .line 171
    if-ge v0, v8, :cond_7

    .line 172
    .line 173
    shl-long v17, v17, v7

    .line 174
    .line 175
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    ushr-int/lit8 v19, v8, 0x8

    .line 180
    .line 181
    if-nez v19, :cond_6

    .line 182
    .line 183
    sget-object v19, La/zvv;->d:[J

    .line 184
    .line 185
    aget-wide v20, v19, v8

    .line 186
    .line 187
    cmp-long v8, v20, v4

    .line 188
    .line 189
    if-ltz v8, :cond_6

    .line 190
    .line 191
    or-long v17, v17, v20

    .line 192
    .line 193
    add-int/lit8 v0, v0, 0x1

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_6
    invoke-static {v0, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v2

    .line 200
    :cond_7
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-ne v0, v14, :cond_e

    .line 205
    .line 206
    const/16 v0, 0x13

    .line 207
    .line 208
    move-wide/from16 v19, v4

    .line 209
    .line 210
    :goto_4
    const/16 v8, 0x17

    .line 211
    .line 212
    if-ge v0, v8, :cond_9

    .line 213
    .line 214
    shl-long v19, v19, v7

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    ushr-int/lit8 v21, v8, 0x8

    .line 221
    .line 222
    if-nez v21, :cond_8

    .line 223
    .line 224
    sget-object v21, La/zvv;->d:[J

    .line 225
    .line 226
    aget-wide v22, v21, v8

    .line 227
    .line 228
    cmp-long v8, v22, v4

    .line 229
    .line 230
    if-ltz v8, :cond_8

    .line 231
    .line 232
    or-long v19, v19, v22

    .line 233
    .line 234
    add-int/lit8 v0, v0, 0x1

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_8
    invoke-static {v0, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v2

    .line 241
    :cond_9
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-ne v0, v14, :cond_d

    .line 246
    .line 247
    const/16 v0, 0x18

    .line 248
    .line 249
    move-wide v13, v4

    .line 250
    :goto_5
    if-ge v0, v10, :cond_b

    .line 251
    .line 252
    shl-long/2addr v13, v7

    .line 253
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    ushr-int/lit8 v21, v8, 0x8

    .line 258
    .line 259
    if-nez v21, :cond_a

    .line 260
    .line 261
    sget-object v21, La/zvv;->d:[J

    .line 262
    .line 263
    aget-wide v22, v21, v8

    .line 264
    .line 265
    cmp-long v8, v22, v4

    .line 266
    .line 267
    if-ltz v8, :cond_a

    .line 268
    .line 269
    or-long v13, v13, v22

    .line 270
    .line 271
    add-int/lit8 v0, v0, 0x1

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_a
    invoke-static {v0, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v2

    .line 278
    :cond_b
    shl-long v0, v11, v9

    .line 279
    .line 280
    shl-long v2, v15, v3

    .line 281
    .line 282
    or-long/2addr v0, v2

    .line 283
    or-long v0, v0, v17

    .line 284
    .line 285
    const/16 v2, 0x30

    .line 286
    .line 287
    shl-long v2, v19, v2

    .line 288
    .line 289
    or-long/2addr v2, v13

    .line 290
    sget-object v6, La/nut0;->c:La/mut0;

    .line 291
    .line 292
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    cmp-long v6, v0, v4

    .line 296
    .line 297
    if-nez v6, :cond_c

    .line 298
    .line 299
    cmp-long v4, v2, v4

    .line 300
    .line 301
    if-nez v4, :cond_c

    .line 302
    .line 303
    sget-object v0, La/nut0;->d:La/nut0;

    .line 304
    .line 305
    return-object v0

    .line 306
    :cond_c
    new-instance v4, La/nut0;

    .line 307
    .line 308
    invoke-direct {v4, v0, v1, v2, v3}, La/nut0;-><init>(JJ)V

    .line 309
    .line 310
    .line 311
    return-object v4

    .line 312
    :cond_d
    invoke-static {v8, v1, v13}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v2

    .line 316
    :cond_e
    invoke-static {v8, v1, v13}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v2

    .line 320
    :cond_f
    invoke-static {v8, v1, v13}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v2

    .line 324
    :cond_10
    invoke-static {v0, v1, v13}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v2

    .line 328
    :cond_11
    move-wide v10, v4

    .line 329
    :goto_6
    if-ge v8, v3, :cond_13

    .line 330
    .line 331
    shl-long/2addr v10, v7

    .line 332
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    ushr-int/lit8 v12, v0, 0x8

    .line 337
    .line 338
    if-nez v12, :cond_12

    .line 339
    .line 340
    sget-object v12, La/zvv;->d:[J

    .line 341
    .line 342
    aget-wide v13, v12, v0

    .line 343
    .line 344
    cmp-long v0, v13, v4

    .line 345
    .line 346
    if-ltz v0, :cond_12

    .line 347
    .line 348
    or-long/2addr v10, v13

    .line 349
    add-int/lit8 v8, v8, 0x1

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_12
    invoke-static {v8, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v2

    .line 356
    :cond_13
    move-wide v12, v4

    .line 357
    :goto_7
    if-ge v3, v9, :cond_15

    .line 358
    .line 359
    shl-long/2addr v12, v7

    .line 360
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    ushr-int/lit8 v8, v0, 0x8

    .line 365
    .line 366
    if-nez v8, :cond_14

    .line 367
    .line 368
    sget-object v8, La/zvv;->d:[J

    .line 369
    .line 370
    aget-wide v14, v8, v0

    .line 371
    .line 372
    cmp-long v0, v14, v4

    .line 373
    .line 374
    if-ltz v0, :cond_14

    .line 375
    .line 376
    or-long/2addr v12, v14

    .line 377
    add-int/lit8 v3, v3, 0x1

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_14
    invoke-static {v3, v1, v6}, La/qut0;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw v2

    .line 384
    :cond_15
    sget-object v0, La/nut0;->c:La/mut0;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    cmp-long v0, v10, v4

    .line 390
    .line 391
    if-nez v0, :cond_16

    .line 392
    .line 393
    cmp-long v0, v12, v4

    .line 394
    .line 395
    if-nez v0, :cond_16

    .line 396
    .line 397
    sget-object v0, La/nut0;->d:La/nut0;

    .line 398
    .line 399
    return-object v0

    .line 400
    :cond_16
    new-instance v0, La/nut0;

    .line 401
    .line 402
    invoke-direct {v0, v10, v11, v12, v13}, La/nut0;-><init>(JJ)V

    .line 403
    .line 404
    .line 405
    return-object v0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/rut0;->b:La/ewb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/nut0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, La/nut0;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, La/bwn;->E(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
