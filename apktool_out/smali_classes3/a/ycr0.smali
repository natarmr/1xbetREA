.class public final synthetic La/ycr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b09;


# direct methods
.method public synthetic constructor <init>(La/b09;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ycr0;->a:B

    iput-object p1, p0, La/ycr0;->b:La/b09;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ycr0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/ycr0;->b:La/b09;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v5, La/imm;

    .line 22
    .line 23
    new-instance v6, La/ilm;

    .line 24
    .line 25
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 26
    .line 27
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 32
    .line 33
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 34
    .line 35
    .line 36
    move-result-wide v7

    .line 37
    invoke-direct {v6, v7, v8}, La/ilm;-><init>(J)V

    .line 38
    .line 39
    .line 40
    iget-boolean v7, v1, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->a:Z

    .line 41
    .line 42
    iget-object v8, v0, La/b09;->b:La/ctf0;

    .line 43
    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    new-instance v9, La/nlm;

    .line 47
    .line 48
    new-array v10, v4, [Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 51
    .line 52
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    const v11, 0x7f1311bf

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    iget-object v1, v1, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->b:Ljava/lang/String;

    .line 64
    .line 65
    new-instance v10, La/hmm;

    .line 66
    .line 67
    invoke-direct {v10, v3, v1, v8, v4}, La/hmm;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v9, v10}, La/nlm;-><init>(La/hmm;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    new-instance v9, La/plm;

    .line 75
    .line 76
    new-array v1, v4, [Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, v8, La/ctf0;->b:La/lsm0;

    .line 79
    .line 80
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const v4, 0x7f1313e4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 96
    .line 97
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 98
    .line 99
    .line 100
    move-result-wide v3

    .line 101
    sget-object v8, La/fa50;->a:La/fa50;

    .line 102
    .line 103
    invoke-direct {v9, v1, v3, v4, v8}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object v14, La/ra50;->a:La/ra50;

    .line 107
    .line 108
    if-nez v7, :cond_2

    .line 109
    .line 110
    iget-object v1, v0, La/b09;->c:La/n0o0;

    .line 111
    .line 112
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/fee;

    .line 117
    .line 118
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v3, La/par0;->a:La/par0;

    .line 123
    .line 124
    if-eq v1, v3, :cond_1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_1
    new-instance v1, La/dmm;

    .line 128
    .line 129
    new-instance v3, La/va50;

    .line 130
    .line 131
    new-instance v10, La/wkm;

    .line 132
    .line 133
    iget-object v0, v0, La/b09;->d:La/n0o0;

    .line 134
    .line 135
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, La/fee;

    .line 140
    .line 141
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    xor-int/lit8 v13, v0, 0x1

    .line 152
    .line 153
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 158
    .line 159
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 160
    .line 161
    .line 162
    move-result-wide v15

    .line 163
    const/4 v11, 0x1

    .line 164
    const v12, 0x7f0809ee

    .line 165
    .line 166
    .line 167
    invoke-direct/range {v10 .. v16}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 168
    .line 169
    .line 170
    move-object v0, v10

    .line 171
    new-instance v10, La/wkm;

    .line 172
    .line 173
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 178
    .line 179
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v15

    .line 183
    const/4 v11, 0x2

    .line 184
    const v12, 0x7f080965

    .line 185
    .line 186
    .line 187
    const/4 v13, 0x1

    .line 188
    invoke-direct/range {v10 .. v16}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v3, v0, v10}, La/va50;-><init>(La/wkm;La/wkm;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v1, v3}, La/dmm;-><init>(La/wa50;)V

    .line 195
    .line 196
    .line 197
    :goto_1
    move-object v8, v1

    .line 198
    goto :goto_3

    .line 199
    :cond_2
    :goto_2
    new-instance v1, La/dmm;

    .line 200
    .line 201
    new-instance v0, La/ta50;

    .line 202
    .line 203
    new-instance v10, La/wkm;

    .line 204
    .line 205
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 210
    .line 211
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v15

    .line 215
    const/4 v11, 0x2

    .line 216
    const v12, 0x7f080965

    .line 217
    .line 218
    .line 219
    const/4 v13, 0x1

    .line 220
    invoke-direct/range {v10 .. v16}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v0, v10}, La/ta50;-><init>(La/wkm;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {v1, v0}, La/dmm;-><init>(La/wa50;)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :goto_3
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 235
    .line 236
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 237
    .line 238
    .line 239
    move-result-wide v0

    .line 240
    const/4 v11, 0x0

    .line 241
    const/4 v12, 0x0

    .line 242
    move-object v7, v9

    .line 243
    move-wide v9, v0

    .line 244
    invoke-direct/range {v5 .. v12}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 245
    .line 246
    .line 247
    return-object v5

    .line 248
    :pswitch_0
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, La/wcr0;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v5, v1, La/wcr0;->b:Ljava/util/List;

    .line 256
    .line 257
    iget-object v6, v0, La/b09;->d:La/n0o0;

    .line 258
    .line 259
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    check-cast v7, La/fee;

    .line 264
    .line 265
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, Ljava/lang/Boolean;

    .line 270
    .line 271
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    const/4 v8, 0x0

    .line 276
    if-nez v7, :cond_3

    .line 277
    .line 278
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    if-nez v7, :cond_a

    .line 283
    .line 284
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-ne v7, v2, :cond_3

    .line 289
    .line 290
    goto/16 :goto_a

    .line 291
    .line 292
    :cond_3
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, La/fee;

    .line 297
    .line 298
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, Ljava/lang/Boolean;

    .line 303
    .line 304
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    iget-object v0, v0, La/b09;->b:La/ctf0;

    .line 309
    .line 310
    iget v1, v1, La/wcr0;->a:I

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_4

    .line 320
    .line 321
    const/high16 v0, 0x42000000    # 32.0f

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_4
    const/high16 v0, 0x41000000    # 8.0f

    .line 325
    .line 326
    :goto_4
    if-eqz v2, :cond_5

    .line 327
    .line 328
    move v6, v4

    .line 329
    goto :goto_5

    .line 330
    :cond_5
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    :goto_5
    if-eqz v2, :cond_6

    .line 335
    .line 336
    new-instance v0, La/gyl;

    .line 337
    .line 338
    const/4 v2, 0x3

    .line 339
    invoke-direct {v0, v8, v8, v2}, La/gyl;-><init>(La/syl;La/lh80;I)V

    .line 340
    .line 341
    .line 342
    goto :goto_9

    .line 343
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-static {v5, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-eqz v5, :cond_9

    .line 361
    .line 362
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    add-int/lit8 v7, v4, 0x1

    .line 367
    .line 368
    if-ltz v4, :cond_8

    .line 369
    .line 370
    check-cast v5, La/tcr0;

    .line 371
    .line 372
    new-instance v9, La/lxl;

    .line 373
    .line 374
    int-to-long v10, v4

    .line 375
    new-instance v12, La/xxl;

    .line 376
    .line 377
    iget-object v5, v5, La/tcr0;->a:Ljava/lang/String;

    .line 378
    .line 379
    invoke-direct {v12, v5}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    if-ne v4, v1, :cond_7

    .line 383
    .line 384
    sget-object v4, La/uxl;->b:La/uxl;

    .line 385
    .line 386
    :goto_7
    move-object v14, v4

    .line 387
    goto :goto_8

    .line 388
    :cond_7
    sget-object v4, La/uxl;->a:La/uxl;

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :goto_8
    const/4 v15, 0x0

    .line 392
    const/16 v16, 0x68

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    invoke-direct/range {v9 .. v16}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move v4, v7

    .line 402
    goto :goto_6

    .line 403
    :cond_8
    invoke-static {}, La/q3d;->p()V

    .line 404
    .line 405
    .line 406
    throw v8

    .line 407
    :cond_9
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 408
    .line 409
    .line 410
    move-result-object v11

    .line 411
    const/4 v2, 0x0

    .line 412
    const/4 v3, 0x2

    .line 413
    invoke-static {v0, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 414
    .line 415
    .line 416
    move-result-object v14

    .line 417
    new-instance v10, La/fyl;

    .line 418
    .line 419
    const/4 v12, 0x0

    .line 420
    const/4 v13, 0x0

    .line 421
    const/4 v15, 0x0

    .line 422
    const/16 v16, 0x16

    .line 423
    .line 424
    invoke-direct/range {v10 .. v16}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 425
    .line 426
    .line 427
    move-object v0, v10

    .line 428
    :goto_9
    new-instance v8, La/xcr0;

    .line 429
    .line 430
    invoke-direct {v8, v1, v6, v0}, La/xcr0;-><init>(IILa/hyl;)V

    .line 431
    .line 432
    .line 433
    :cond_a
    :goto_a
    return-object v8

    .line 434
    nop

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
