.class public final synthetic La/etq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:J

.field public final synthetic h:F


# direct methods
.method public synthetic constructor <init>(JFFFFJFB)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/etq;->a:B

    iput-wide p1, p0, La/etq;->b:J

    iput p3, p0, La/etq;->c:F

    iput p4, p0, La/etq;->d:F

    iput p5, p0, La/etq;->e:F

    iput p6, p0, La/etq;->f:F

    iput-wide p7, p0, La/etq;->g:J

    iput p9, p0, La/etq;->h:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/etq;->a:B

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    iget v5, v0, La/etq;->h:F

    .line 13
    .line 14
    iget v6, v0, La/etq;->f:F

    .line 15
    .line 16
    iget v7, v0, La/etq;->e:F

    .line 17
    .line 18
    iget v8, v0, La/etq;->d:F

    .line 19
    .line 20
    iget v9, v0, La/etq;->c:F

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v10, p1

    .line 26
    .line 27
    check-cast v10, La/g7z;

    .line 28
    .line 29
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    int-to-long v11, v1

    .line 37
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    int-to-long v13, v1

    .line 42
    shl-long/2addr v11, v4

    .line 43
    and-long/2addr v13, v2

    .line 44
    or-long/2addr v13, v11

    .line 45
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-long v11, v1

    .line 50
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    move-wide/from16 v21, v2

    .line 55
    .line 56
    int-to-long v2, v1

    .line 57
    shl-long/2addr v11, v4

    .line 58
    and-long v1, v2, v21

    .line 59
    .line 60
    or-long v15, v11, v1

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/16 v20, 0xf0

    .line 65
    .line 66
    iget-wide v11, v0, La/etq;->b:J

    .line 67
    .line 68
    iget-wide v0, v0, La/etq;->g:J

    .line 69
    .line 70
    move-wide/from16 v17, v0

    .line 71
    .line 72
    invoke-static/range {v10 .. v20}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    int-to-long v0, v0

    .line 80
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    int-to-long v2, v2

    .line 85
    shl-long/2addr v0, v4

    .line 86
    and-long v2, v2, v21

    .line 87
    .line 88
    or-long v13, v0, v2

    .line 89
    .line 90
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    int-to-long v0, v0

    .line 95
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    int-to-long v2, v2

    .line 100
    shl-long/2addr v0, v4

    .line 101
    and-long v2, v2, v21

    .line 102
    .line 103
    or-long v15, v0, v2

    .line 104
    .line 105
    invoke-static/range {v10 .. v20}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10}, La/g7z;->a()V

    .line 109
    .line 110
    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_0
    move-wide/from16 v21, v2

    .line 115
    .line 116
    move-object/from16 v1, p1

    .line 117
    .line 118
    check-cast v1, La/g7z;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    int-to-long v2, v2

    .line 128
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    int-to-long v10, v8

    .line 133
    shl-long/2addr v2, v4

    .line 134
    and-long v10, v10, v21

    .line 135
    .line 136
    or-long v13, v2, v10

    .line 137
    .line 138
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    int-to-long v2, v2

    .line 143
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    int-to-long v10, v8

    .line 148
    shl-long/2addr v2, v4

    .line 149
    and-long v10, v10, v21

    .line 150
    .line 151
    or-long v15, v2, v10

    .line 152
    .line 153
    const/16 v19, 0x0

    .line 154
    .line 155
    const/16 v20, 0xf0

    .line 156
    .line 157
    iget-wide v2, v0, La/etq;->b:J

    .line 158
    .line 159
    iget-wide v10, v0, La/etq;->g:J

    .line 160
    .line 161
    move-wide/from16 v17, v10

    .line 162
    .line 163
    move-object v10, v1

    .line 164
    move-wide v11, v2

    .line 165
    invoke-static/range {v10 .. v20}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    int-to-long v8, v0

    .line 173
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    int-to-long v10, v0

    .line 178
    shl-long/2addr v8, v4

    .line 179
    and-long v10, v10, v21

    .line 180
    .line 181
    or-long/2addr v8, v10

    .line 182
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    int-to-long v10, v0

    .line 187
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    int-to-long v5, v0

    .line 192
    shl-long/2addr v10, v4

    .line 193
    and-long v4, v5, v21

    .line 194
    .line 195
    or-long v6, v10, v4

    .line 196
    .line 197
    const/4 v10, 0x0

    .line 198
    const/16 v11, 0xf0

    .line 199
    .line 200
    move-wide v4, v8

    .line 201
    move-wide/from16 v8, v17

    .line 202
    .line 203
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, La/g7z;->a()V

    .line 207
    .line 208
    .line 209
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_1
    move-wide/from16 v21, v2

    .line 213
    .line 214
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, La/g7z;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    int-to-long v2, v2

    .line 226
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    int-to-long v10, v8

    .line 231
    shl-long/2addr v2, v4

    .line 232
    and-long v10, v10, v21

    .line 233
    .line 234
    or-long v13, v2, v10

    .line 235
    .line 236
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    int-to-long v2, v2

    .line 241
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    int-to-long v10, v8

    .line 246
    shl-long/2addr v2, v4

    .line 247
    and-long v10, v10, v21

    .line 248
    .line 249
    or-long v15, v2, v10

    .line 250
    .line 251
    const/16 v19, 0x0

    .line 252
    .line 253
    const/16 v20, 0xf0

    .line 254
    .line 255
    iget-wide v2, v0, La/etq;->b:J

    .line 256
    .line 257
    iget-wide v10, v0, La/etq;->g:J

    .line 258
    .line 259
    move-wide/from16 v17, v10

    .line 260
    .line 261
    move-object v10, v1

    .line 262
    move-wide v11, v2

    .line 263
    invoke-static/range {v10 .. v20}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    int-to-long v8, v0

    .line 271
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    int-to-long v10, v0

    .line 276
    shl-long/2addr v8, v4

    .line 277
    and-long v10, v10, v21

    .line 278
    .line 279
    or-long/2addr v8, v10

    .line 280
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    int-to-long v10, v0

    .line 285
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    int-to-long v5, v0

    .line 290
    shl-long/2addr v10, v4

    .line 291
    and-long v4, v5, v21

    .line 292
    .line 293
    or-long v6, v10, v4

    .line 294
    .line 295
    const/4 v10, 0x0

    .line 296
    const/16 v11, 0xf0

    .line 297
    .line 298
    move-wide v4, v8

    .line 299
    move-wide/from16 v8, v17

    .line 300
    .line 301
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, La/g7z;->a()V

    .line 305
    .line 306
    .line 307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_2
    move-wide/from16 v21, v2

    .line 311
    .line 312
    move-object/from16 v1, p1

    .line 313
    .line 314
    check-cast v1, La/g7z;

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    int-to-long v2, v2

    .line 324
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    int-to-long v10, v8

    .line 329
    shl-long/2addr v2, v4

    .line 330
    and-long v10, v10, v21

    .line 331
    .line 332
    or-long v13, v2, v10

    .line 333
    .line 334
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    int-to-long v2, v2

    .line 339
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    int-to-long v10, v8

    .line 344
    shl-long/2addr v2, v4

    .line 345
    and-long v10, v10, v21

    .line 346
    .line 347
    or-long v15, v2, v10

    .line 348
    .line 349
    const/16 v19, 0x0

    .line 350
    .line 351
    const/16 v20, 0xf0

    .line 352
    .line 353
    iget-wide v2, v0, La/etq;->b:J

    .line 354
    .line 355
    iget-wide v10, v0, La/etq;->g:J

    .line 356
    .line 357
    move-wide/from16 v17, v10

    .line 358
    .line 359
    move-object v10, v1

    .line 360
    move-wide v11, v2

    .line 361
    invoke-static/range {v10 .. v20}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 362
    .line 363
    .line 364
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    int-to-long v8, v0

    .line 369
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    int-to-long v10, v0

    .line 374
    shl-long/2addr v8, v4

    .line 375
    and-long v10, v10, v21

    .line 376
    .line 377
    or-long/2addr v8, v10

    .line 378
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    int-to-long v10, v0

    .line 383
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    int-to-long v5, v0

    .line 388
    shl-long/2addr v10, v4

    .line 389
    and-long v4, v5, v21

    .line 390
    .line 391
    or-long v6, v10, v4

    .line 392
    .line 393
    const/4 v10, 0x0

    .line 394
    const/16 v11, 0xf0

    .line 395
    .line 396
    move-wide v4, v8

    .line 397
    move-wide/from16 v8, v17

    .line 398
    .line 399
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1}, La/g7z;->a()V

    .line 403
    .line 404
    .line 405
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object v0

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
