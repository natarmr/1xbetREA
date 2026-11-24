.class public final La/a1z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/cgk0;


# direct methods
.method public synthetic constructor <init>(BLa/a4x;La/cgk0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/a1z;->a:B

    iput-object p2, p0, La/a1z;->b:La/a4x;

    iput-object p4, p0, La/a1z;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/a1z;->d:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a1z;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/a1z;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v5, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    iget-object v6, v0, La/a1z;->b:La/a4x;

    .line 13
    .line 14
    const/16 v7, 0x92

    .line 15
    .line 16
    const/16 v8, 0x10

    .line 17
    .line 18
    const/16 v9, 0x20

    .line 19
    .line 20
    const/4 v10, 0x2

    .line 21
    const/4 v11, 0x4

    .line 22
    iget-object v0, v0, La/a1z;->d:La/cgk0;

    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    const/4 v13, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/g9z;

    .line 32
    .line 33
    move-object/from16 v14, p2

    .line 34
    .line 35
    check-cast v14, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v14

    .line 41
    move-object/from16 v15, p3

    .line 42
    .line 43
    check-cast v15, La/fet;

    .line 44
    .line 45
    move-object/from16 v16, p4

    .line 46
    .line 47
    check-cast v16, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    and-int/lit8 v17, v16, 0x6

    .line 54
    .line 55
    if-nez v17, :cond_1

    .line 56
    .line 57
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    move v10, v11

    .line 64
    :cond_0
    or-int v1, v16, v10

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move/from16 v1, v16

    .line 68
    .line 69
    :goto_0
    and-int/lit8 v10, v16, 0x30

    .line 70
    .line 71
    if-nez v10, :cond_3

    .line 72
    .line 73
    invoke-virtual {v15, v14}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-eqz v10, :cond_2

    .line 78
    .line 79
    move v8, v9

    .line 80
    :cond_2
    or-int/2addr v1, v8

    .line 81
    :cond_3
    and-int/lit16 v8, v1, 0x93

    .line 82
    .line 83
    if-eq v8, v7, :cond_4

    .line 84
    .line 85
    move v7, v12

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    move v7, v13

    .line 88
    :goto_1
    and-int/2addr v1, v12

    .line 89
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_9

    .line 94
    .line 95
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, La/fzy;

    .line 100
    .line 101
    const v6, -0x8a54dbb

    .line 102
    .line 103
    .line 104
    invoke-virtual {v15, v6}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-ne v6, v5, :cond_5

    .line 112
    .line 113
    invoke-static {v4}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v15, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    check-cast v6, La/agk0;

    .line 121
    .line 122
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-ne v4, v5, :cond_6

    .line 127
    .line 128
    new-instance v4, La/z0z;

    .line 129
    .line 130
    invoke-direct {v4, v6, v0, v12}, La/z0z;-><init>(La/agk0;La/cgk0;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {v4}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v15, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    check-cast v4, La/l7m0;

    .line 141
    .line 142
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    if-ne v7, v5, :cond_7

    .line 147
    .line 148
    new-instance v7, La/x0z;

    .line 149
    .line 150
    invoke-direct {v7, v6, v12}, La/x0z;-><init>(La/agk0;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 157
    .line 158
    invoke-static {v3, v7}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    if-ne v7, v5, :cond_8

    .line 167
    .line 168
    new-instance v7, La/y0z;

    .line 169
    .line 170
    invoke-direct {v7, v4, v0, v6, v12}, La/y0z;-><init>(La/l7m0;La/cgk0;La/agk0;B)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v15, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 177
    .line 178
    invoke-static {v3, v7}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 179
    .line 180
    .line 181
    move-result-object v16

    .line 182
    sget-object v0, La/qmk;->a:La/zcl;

    .line 183
    .line 184
    const/high16 v20, 0x40000000    # 2.0f

    .line 185
    .line 186
    const/16 v21, 0x7

    .line 187
    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0, v1, v2, v15, v13}, La/qxw;->d(La/mm40;La/fzy;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v15, v13}, La/fet;->r(Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_9
    invoke-virtual {v15}, La/fet;->X()V

    .line 206
    .line 207
    .line 208
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_0
    move-object/from16 v1, p1

    .line 212
    .line 213
    check-cast v1, La/g9z;

    .line 214
    .line 215
    move-object/from16 v14, p2

    .line 216
    .line 217
    check-cast v14, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    move-object/from16 v15, p3

    .line 224
    .line 225
    check-cast v15, La/fet;

    .line 226
    .line 227
    move-object/from16 v16, p4

    .line 228
    .line 229
    check-cast v16, Ljava/lang/Number;

    .line 230
    .line 231
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v16

    .line 235
    and-int/lit8 v17, v16, 0x6

    .line 236
    .line 237
    if-nez v17, :cond_b

    .line 238
    .line 239
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_a

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_a
    move v11, v10

    .line 247
    :goto_3
    or-int v1, v16, v11

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_b
    move/from16 v1, v16

    .line 251
    .line 252
    :goto_4
    and-int/lit8 v11, v16, 0x30

    .line 253
    .line 254
    if-nez v11, :cond_d

    .line 255
    .line 256
    invoke-virtual {v15, v14}, La/fet;->e(I)Z

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    if-eqz v11, :cond_c

    .line 261
    .line 262
    move v8, v9

    .line 263
    :cond_c
    or-int/2addr v1, v8

    .line 264
    :cond_d
    and-int/lit16 v8, v1, 0x93

    .line 265
    .line 266
    if-eq v8, v7, :cond_e

    .line 267
    .line 268
    move v7, v12

    .line 269
    goto :goto_5

    .line 270
    :cond_e
    move v7, v13

    .line 271
    :goto_5
    and-int/2addr v1, v12

    .line 272
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_13

    .line 277
    .line 278
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    check-cast v1, La/ezy;

    .line 283
    .line 284
    const v6, 0x17a71d98

    .line 285
    .line 286
    .line 287
    invoke-virtual {v15, v6}, La/fet;->e0(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    if-ne v6, v5, :cond_f

    .line 295
    .line 296
    invoke-static {v4}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v15, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_f
    check-cast v6, La/agk0;

    .line 304
    .line 305
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    if-ne v7, v5, :cond_10

    .line 310
    .line 311
    new-instance v7, La/z0z;

    .line 312
    .line 313
    invoke-direct {v7, v6, v0, v13}, La/z0z;-><init>(La/agk0;La/cgk0;B)V

    .line 314
    .line 315
    .line 316
    invoke-static {v7}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    invoke-virtual {v15, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_10
    check-cast v7, La/l7m0;

    .line 324
    .line 325
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    if-ne v8, v5, :cond_11

    .line 330
    .line 331
    new-instance v8, La/x0z;

    .line 332
    .line 333
    invoke-direct {v8, v6, v13}, La/x0z;-><init>(La/agk0;B)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v15, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_11
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 340
    .line 341
    invoke-static {v3, v8}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    if-ne v8, v5, :cond_12

    .line 350
    .line 351
    new-instance v8, La/y0z;

    .line 352
    .line 353
    invoke-direct {v8, v7, v0, v6, v13}, La/y0z;-><init>(La/l7m0;La/cgk0;La/agk0;B)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v15, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    :cond_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 360
    .line 361
    invoke-static {v3, v8}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sget-object v3, La/qmk;->a:La/zcl;

    .line 366
    .line 367
    const/high16 v3, 0x41000000    # 8.0f

    .line 368
    .line 369
    invoke-static {v0, v3, v4, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-static {v0, v1, v2, v15, v13}, La/xww;->e(La/mm40;La/ezy;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v15, v13}, La/fet;->r(Z)V

    .line 377
    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_13
    invoke-virtual {v15}, La/fet;->X()V

    .line 381
    .line 382
    .line 383
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object v0

    .line 386
    nop

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
