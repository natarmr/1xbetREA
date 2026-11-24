.class public final synthetic La/iz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kz20;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/kz20;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/iz20;->a:B

    iput-object p1, p0, La/iz20;->b:La/kz20;

    iput-object p2, p0, La/iz20;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iz20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x92

    .line 7
    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/16 v5, 0x20

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x4

    .line 14
    const/16 v8, 0x40

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v10, v0, La/iz20;->b:La/kz20;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v11, p1

    .line 23
    .line 24
    check-cast v11, La/mm40;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, La/qym0;

    .line 29
    .line 30
    move-object/from16 v12, p3

    .line 31
    .line 32
    check-cast v12, La/fet;

    .line 33
    .line 34
    move-object/from16 v13, p4

    .line 35
    .line 36
    check-cast v13, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    and-int/lit8 v14, v13, 0x6

    .line 49
    .line 50
    if-nez v14, :cond_1

    .line 51
    .line 52
    invoke-virtual {v12, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v14

    .line 56
    if-eqz v14, :cond_0

    .line 57
    .line 58
    move v6, v7

    .line 59
    :cond_0
    or-int/2addr v6, v13

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v6, v13

    .line 62
    :goto_0
    and-int/lit8 v7, v13, 0x30

    .line 63
    .line 64
    if-nez v7, :cond_4

    .line 65
    .line 66
    and-int/lit8 v7, v13, 0x40

    .line 67
    .line 68
    if-nez v7, :cond_2

    .line 69
    .line 70
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v12, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    :goto_1
    if-eqz v7, :cond_3

    .line 80
    .line 81
    move v4, v5

    .line 82
    :cond_3
    or-int/2addr v6, v4

    .line 83
    :cond_4
    and-int/lit16 v4, v6, 0x93

    .line 84
    .line 85
    if-eq v4, v3, :cond_5

    .line 86
    .line 87
    move v2, v9

    .line 88
    :cond_5
    and-int/lit8 v3, v6, 0x1

    .line 89
    .line 90
    invoke-virtual {v12, v3, v2}, La/fet;->U(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    sget-object v2, La/qmk;->a:La/zcl;

    .line 97
    .line 98
    const/4 v15, 0x0

    .line 99
    const/16 v16, 0xe

    .line 100
    .line 101
    move-object/from16 v20, v12

    .line 102
    .line 103
    const/high16 v12, 0x41000000    # 8.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 112
    .line 113
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 118
    .line 119
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 120
    .line 121
    .line 122
    move-result-wide v14

    .line 123
    iget-boolean v2, v10, La/kz20;->k:Z

    .line 124
    .line 125
    and-int/lit8 v3, v6, 0x70

    .line 126
    .line 127
    or-int v21, v8, v3

    .line 128
    .line 129
    const/16 v22, 0x30

    .line 130
    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    iget-object v0, v0, La/iz20;->c:Lkotlin/jvm/functions/Function1;

    .line 136
    .line 137
    move-object/from16 v19, v0

    .line 138
    .line 139
    move-object v13, v1

    .line 140
    move/from16 v16, v2

    .line 141
    .line 142
    invoke-static/range {v12 .. v22}, La/iym0;->b(La/mm40;La/qym0;JZZZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    move-object/from16 v20, v12

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 149
    .line 150
    .line 151
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_0
    move-object/from16 v1, p1

    .line 155
    .line 156
    check-cast v1, La/mm40;

    .line 157
    .line 158
    move-object/from16 v12, p2

    .line 159
    .line 160
    check-cast v12, La/qym0;

    .line 161
    .line 162
    move-object/from16 v11, p3

    .line 163
    .line 164
    check-cast v11, La/fet;

    .line 165
    .line 166
    move-object/from16 v13, p4

    .line 167
    .line 168
    check-cast v13, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    and-int/lit8 v14, v13, 0x6

    .line 181
    .line 182
    if-nez v14, :cond_8

    .line 183
    .line 184
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    if-eqz v14, :cond_7

    .line 189
    .line 190
    move v6, v7

    .line 191
    :cond_7
    or-int/2addr v6, v13

    .line 192
    goto :goto_3

    .line 193
    :cond_8
    move v6, v13

    .line 194
    :goto_3
    and-int/lit8 v7, v13, 0x30

    .line 195
    .line 196
    if-nez v7, :cond_b

    .line 197
    .line 198
    and-int/lit8 v7, v13, 0x40

    .line 199
    .line 200
    if-nez v7, :cond_9

    .line 201
    .line 202
    invoke-virtual {v11, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    goto :goto_4

    .line 207
    :cond_9
    invoke-virtual {v11, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    :goto_4
    if-eqz v7, :cond_a

    .line 212
    .line 213
    move v4, v5

    .line 214
    :cond_a
    or-int/2addr v6, v4

    .line 215
    :cond_b
    move v7, v6

    .line 216
    and-int/lit16 v4, v7, 0x93

    .line 217
    .line 218
    if-eq v4, v3, :cond_c

    .line 219
    .line 220
    move v2, v9

    .line 221
    :cond_c
    and-int/lit8 v3, v7, 0x1

    .line 222
    .line 223
    invoke-virtual {v11, v3, v2}, La/fet;->U(IZ)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_d

    .line 228
    .line 229
    sget-object v2, La/qmk;->a:La/zcl;

    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    const/16 v6, 0xe

    .line 233
    .line 234
    const/high16 v2, 0x41000000    # 8.0f

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    const/4 v4, 0x0

    .line 238
    invoke-static/range {v1 .. v6}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 243
    .line 244
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 249
    .line 250
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 251
    .line 252
    .line 253
    move-result-wide v13

    .line 254
    iget-boolean v15, v10, La/kz20;->k:Z

    .line 255
    .line 256
    and-int/lit8 v2, v7, 0x70

    .line 257
    .line 258
    or-int v20, v8, v2

    .line 259
    .line 260
    const/16 v21, 0x30

    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    iget-object v0, v0, La/iz20;->c:Lkotlin/jvm/functions/Function1;

    .line 267
    .line 268
    move-object/from16 v18, v0

    .line 269
    .line 270
    move-object/from16 v19, v11

    .line 271
    .line 272
    move-object v11, v1

    .line 273
    invoke-static/range {v11 .. v21}, La/iym0;->b(La/mm40;La/qym0;JZZZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_d
    move-object/from16 v19, v11

    .line 278
    .line 279
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 280
    .line 281
    .line 282
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_1
    move-object/from16 v1, p1

    .line 286
    .line 287
    check-cast v1, La/mm40;

    .line 288
    .line 289
    move-object/from16 v11, p2

    .line 290
    .line 291
    check-cast v11, La/qym0;

    .line 292
    .line 293
    move-object/from16 v12, p3

    .line 294
    .line 295
    check-cast v12, La/fet;

    .line 296
    .line 297
    move-object/from16 v13, p4

    .line 298
    .line 299
    check-cast v13, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 302
    .line 303
    .line 304
    move-result v13

    .line 305
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    and-int/lit8 v14, v13, 0x6

    .line 312
    .line 313
    if-nez v14, :cond_f

    .line 314
    .line 315
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v14

    .line 319
    if-eqz v14, :cond_e

    .line 320
    .line 321
    move v6, v7

    .line 322
    :cond_e
    or-int/2addr v6, v13

    .line 323
    goto :goto_6

    .line 324
    :cond_f
    move v6, v13

    .line 325
    :goto_6
    and-int/lit8 v7, v13, 0x30

    .line 326
    .line 327
    if-nez v7, :cond_12

    .line 328
    .line 329
    and-int/lit8 v7, v13, 0x40

    .line 330
    .line 331
    if-nez v7, :cond_10

    .line 332
    .line 333
    invoke-virtual {v12, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    goto :goto_7

    .line 338
    :cond_10
    invoke-virtual {v12, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    :goto_7
    if-eqz v7, :cond_11

    .line 343
    .line 344
    move v4, v5

    .line 345
    :cond_11
    or-int/2addr v6, v4

    .line 346
    :cond_12
    and-int/lit16 v4, v6, 0x93

    .line 347
    .line 348
    if-eq v4, v3, :cond_13

    .line 349
    .line 350
    move v2, v9

    .line 351
    :cond_13
    and-int/lit8 v3, v6, 0x1

    .line 352
    .line 353
    invoke-virtual {v12, v3, v2}, La/fet;->U(IZ)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_14

    .line 358
    .line 359
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 360
    .line 361
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 362
    .line 363
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 364
    .line 365
    .line 366
    move-result-wide v3

    .line 367
    iget-boolean v5, v10, La/kz20;->k:Z

    .line 368
    .line 369
    move v2, v6

    .line 370
    iget-boolean v6, v10, La/kz20;->l:Z

    .line 371
    .line 372
    iget-boolean v7, v10, La/kz20;->h:Z

    .line 373
    .line 374
    and-int/lit8 v9, v2, 0xe

    .line 375
    .line 376
    or-int/2addr v8, v9

    .line 377
    and-int/lit8 v2, v2, 0x70

    .line 378
    .line 379
    or-int v10, v8, v2

    .line 380
    .line 381
    move-object v2, v11

    .line 382
    const/4 v11, 0x0

    .line 383
    iget-object v8, v0, La/iz20;->c:Lkotlin/jvm/functions/Function1;

    .line 384
    .line 385
    move-object v9, v12

    .line 386
    invoke-static/range {v1 .. v11}, La/iym0;->b(La/mm40;La/qym0;JZZZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 387
    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_14
    move-object v9, v12

    .line 391
    invoke-virtual {v9}, La/fet;->X()V

    .line 392
    .line 393
    .line 394
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
