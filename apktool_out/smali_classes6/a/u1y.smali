.class public final synthetic La/u1y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wyu;

.field public final synthetic c:La/hrc;

.field public final synthetic d:La/ctf0;


# direct methods
.method public synthetic constructor <init>(La/wyu;La/hrc;La/ctf0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/u1y;->a:B

    iput-object p1, p0, La/u1y;->b:La/wyu;

    iput-object p2, p0, La/u1y;->c:La/hrc;

    iput-object p3, p0, La/u1y;->d:La/ctf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u1y;->a:B

    .line 4
    .line 5
    const v2, 0x7f130edc

    .line 6
    .line 7
    .line 8
    const v3, 0x7f131627

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x6

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const-string v7, ""

    .line 15
    .line 16
    const v8, 0x7f131629

    .line 17
    .line 18
    .line 19
    const v9, 0x7f080d08

    .line 20
    .line 21
    .line 22
    const v10, 0x7f080d07

    .line 23
    .line 24
    .line 25
    const-string v11, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-l.png"

    .line 26
    .line 27
    const-string v12, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-d.png"

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    iget-object v14, v0, La/u1y;->d:La/ctf0;

    .line 31
    .line 32
    iget-object v15, v0, La/u1y;->c:La/hrc;

    .line 33
    .line 34
    iget-object v0, v0, La/u1y;->b:La/wyu;

    .line 35
    .line 36
    packed-switch v1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 40
    .line 41
    invoke-static {v0, v1}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    new-instance v16, La/zzx;

    .line 46
    .line 47
    new-instance v17, La/az6;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v12}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_0
    move-object/from16 v19, v1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v11}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    goto :goto_0

    .line 67
    :goto_1
    if-nez v0, :cond_1

    .line 68
    .line 69
    move/from16 v18, v10

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    move/from16 v18, v9

    .line 73
    .line 74
    :goto_2
    invoke-virtual {v15}, La/hrc;->a()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v20

    .line 82
    new-array v0, v13, [Ljava/lang/Object;

    .line 83
    .line 84
    iget-object v1, v14, La/ctf0;->b:La/lsm0;

    .line 85
    .line 86
    iget-object v9, v14, La/ctf0;->b:La/lsm0;

    .line 87
    .line 88
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v1, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v21

    .line 96
    new-array v0, v13, [Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v9, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v22

    .line 106
    invoke-direct/range {v17 .. v22}, La/az6;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v18, La/um5;

    .line 110
    .line 111
    const-string v24, ""

    .line 112
    .line 113
    const/16 v25, 0x0

    .line 114
    .line 115
    const-wide/16 v19, 0x0

    .line 116
    .line 117
    const-wide/16 v21, -0x1

    .line 118
    .line 119
    const-string v23, ""

    .line 120
    .line 121
    invoke-direct/range {v18 .. v25}, La/um5;-><init>(JJLjava/lang/String;Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    new-instance v0, La/yw6;

    .line 125
    .line 126
    new-instance v1, La/a8q0;

    .line 127
    .line 128
    invoke-direct {v1, v7, v5, v6, v4}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v19, La/epm0;

    .line 136
    .line 137
    const-string v28, ""

    .line 138
    .line 139
    const/16 v29, 0x1

    .line 140
    .line 141
    const-wide/high16 v20, -0x4010000000000000L    # -1.0

    .line 142
    .line 143
    const-wide/16 v22, 0x0

    .line 144
    .line 145
    const-wide/high16 v24, -0x4010000000000000L    # -1.0

    .line 146
    .line 147
    const-wide/high16 v26, -0x4010000000000000L    # -1.0

    .line 148
    .line 149
    invoke-direct/range {v19 .. v29}, La/epm0;-><init>(DDDDLjava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v2, v19

    .line 153
    .line 154
    invoke-direct {v0, v1, v2}, La/yw6;-><init>(La/pz40;La/epm0;)V

    .line 155
    .line 156
    .line 157
    new-array v1, v13, [Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {v1, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v9, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v20

    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    move-object/from16 v19, v0

    .line 170
    .line 171
    invoke-direct/range {v16 .. v21}, La/zzx;-><init>(La/az6;La/um5;La/yw6;Ljava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    return-object v16

    .line 175
    :pswitch_0
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 176
    .line 177
    invoke-static {v0, v1}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    new-instance v16, La/x3y;

    .line 182
    .line 183
    new-instance v17, La/zy6;

    .line 184
    .line 185
    if-nez v0, :cond_2

    .line 186
    .line 187
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v1, v12}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :goto_3
    move-object/from16 v19, v1

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_2
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v1, v11}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    goto :goto_3

    .line 203
    :goto_4
    if-nez v0, :cond_3

    .line 204
    .line 205
    move/from16 v18, v10

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_3
    move/from16 v18, v9

    .line 209
    .line 210
    :goto_5
    invoke-virtual {v15}, La/hrc;->a()J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v20

    .line 218
    new-array v0, v13, [Ljava/lang/Object;

    .line 219
    .line 220
    iget-object v1, v14, La/ctf0;->b:La/lsm0;

    .line 221
    .line 222
    iget-object v9, v14, La/ctf0;->b:La/lsm0;

    .line 223
    .line 224
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v1, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v21

    .line 232
    new-array v0, v13, [Ljava/lang/Object;

    .line 233
    .line 234
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v9, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v22

    .line 242
    invoke-direct/range {v17 .. v22}, La/zy6;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    new-instance v18, La/tm5;

    .line 246
    .line 247
    const-string v24, ""

    .line 248
    .line 249
    const/16 v25, 0x0

    .line 250
    .line 251
    const-wide/16 v19, 0x0

    .line 252
    .line 253
    const-wide/16 v21, -0x1

    .line 254
    .line 255
    const-string v23, ""

    .line 256
    .line 257
    invoke-direct/range {v18 .. v25}, La/tm5;-><init>(JJLjava/lang/String;Ljava/lang/String;Z)V

    .line 258
    .line 259
    .line 260
    new-instance v0, La/xw6;

    .line 261
    .line 262
    new-instance v1, La/a8q0;

    .line 263
    .line 264
    invoke-direct {v1, v7, v5, v6, v4}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 265
    .line 266
    .line 267
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    new-instance v19, La/dpm0;

    .line 272
    .line 273
    const-string v28, ""

    .line 274
    .line 275
    const/16 v29, 0x1

    .line 276
    .line 277
    const-wide/high16 v20, -0x4010000000000000L    # -1.0

    .line 278
    .line 279
    const-wide/16 v22, 0x0

    .line 280
    .line 281
    const-wide/high16 v24, -0x4010000000000000L    # -1.0

    .line 282
    .line 283
    const-wide/high16 v26, -0x4010000000000000L    # -1.0

    .line 284
    .line 285
    invoke-direct/range {v19 .. v29}, La/dpm0;-><init>(DDDDLjava/lang/String;Z)V

    .line 286
    .line 287
    .line 288
    move-object/from16 v2, v19

    .line 289
    .line 290
    invoke-direct {v0, v1, v2}, La/xw6;-><init>(La/pz40;La/dpm0;)V

    .line 291
    .line 292
    .line 293
    new-array v1, v13, [Ljava/lang/Object;

    .line 294
    .line 295
    invoke-static {v1, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v9, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v20

    .line 303
    const/16 v21, 0x0

    .line 304
    .line 305
    move-object/from16 v19, v0

    .line 306
    .line 307
    invoke-direct/range {v16 .. v21}, La/x3y;-><init>(La/zy6;La/tm5;La/xw6;Ljava/lang/String;Z)V

    .line 308
    .line 309
    .line 310
    return-object v16

    .line 311
    :pswitch_1
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 312
    .line 313
    invoke-static {v0, v1}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    invoke-virtual {v15}, La/hrc;->a()J

    .line 318
    .line 319
    .line 320
    move-result-wide v1

    .line 321
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v17

    .line 325
    new-instance v18, La/sm5;

    .line 326
    .line 327
    const/16 v25, 0x0

    .line 328
    .line 329
    const/16 v26, 0x0

    .line 330
    .line 331
    const-wide/16 v19, 0x0

    .line 332
    .line 333
    const-wide/16 v21, -0x1

    .line 334
    .line 335
    const-string v23, ""

    .line 336
    .line 337
    const-string v24, ""

    .line 338
    .line 339
    invoke-direct/range {v18 .. v26}, La/sm5;-><init>(JJLjava/lang/String;Ljava/lang/String;ZZ)V

    .line 340
    .line 341
    .line 342
    new-instance v19, La/ax6;

    .line 343
    .line 344
    new-instance v1, La/a8q0;

    .line 345
    .line 346
    invoke-direct {v1, v7, v5, v6, v4}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 347
    .line 348
    .line 349
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 350
    .line 351
    .line 352
    move-result-object v20

    .line 353
    const-wide/high16 v23, -0x4010000000000000L    # -1.0

    .line 354
    .line 355
    const-wide/high16 v25, -0x4010000000000000L    # -1.0

    .line 356
    .line 357
    const-wide/high16 v21, -0x4010000000000000L    # -1.0

    .line 358
    .line 359
    invoke-direct/range {v19 .. v26}, La/ax6;-><init>(La/pz40;DDD)V

    .line 360
    .line 361
    .line 362
    new-array v1, v13, [Ljava/lang/Object;

    .line 363
    .line 364
    iget-object v2, v14, La/ctf0;->b:La/lsm0;

    .line 365
    .line 366
    invoke-static {v1, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v20

    .line 374
    new-instance v1, La/bz6;

    .line 375
    .line 376
    if-nez v0, :cond_4

    .line 377
    .line 378
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 379
    .line 380
    invoke-static {v2, v12}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    goto :goto_6

    .line 385
    :cond_4
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {v2, v11}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    :goto_6
    if-nez v0, :cond_5

    .line 392
    .line 393
    move v9, v10

    .line 394
    :cond_5
    new-array v0, v13, [Ljava/lang/Object;

    .line 395
    .line 396
    iget-object v3, v14, La/ctf0;->b:La/lsm0;

    .line 397
    .line 398
    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-virtual {v3, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-direct {v1, v2, v9, v0}, La/bz6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 407
    .line 408
    .line 409
    new-instance v15, La/s1y;

    .line 410
    .line 411
    const/16 v21, 0x0

    .line 412
    .line 413
    const/16 v22, 0x0

    .line 414
    .line 415
    move-object/from16 v16, v1

    .line 416
    .line 417
    invoke-direct/range {v15 .. v22}, La/s1y;-><init>(La/bz6;Ljava/lang/String;La/sm5;La/ax6;Ljava/lang/String;ZZ)V

    .line 418
    .line 419
    .line 420
    return-object v15

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
