.class public final synthetic La/gej;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

.field public final synthetic e:Ljava/util/Locale;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/util/Calendar;

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Ljava/lang/Long;

.field public final synthetic k:Ljava/lang/Long;

.field public final synthetic l:J

.field public final synthetic m:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;JJLorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;Ljava/util/Locale;ZLjava/util/Calendar;ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gej;->a:Ljava/util/List;

    iput-wide p2, p0, La/gej;->b:J

    iput-wide p4, p0, La/gej;->c:J

    iput-object p6, p0, La/gej;->d:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    iput-object p7, p0, La/gej;->e:Ljava/util/Locale;

    iput-boolean p8, p0, La/gej;->f:Z

    iput-object p9, p0, La/gej;->g:Ljava/util/Calendar;

    iput p10, p0, La/gej;->h:I

    iput-object p11, p0, La/gej;->i:Ljava/lang/Integer;

    iput-object p12, p0, La/gej;->j:Ljava/lang/Long;

    iput-object p13, p0, La/gej;->k:Ljava/lang/Long;

    iput-wide p14, p0, La/gej;->l:J

    move-object/from16 p1, p16

    iput-object p1, p0, La/gej;->m:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/gej;->d:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 4
    .line 5
    iget-object v2, v1, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    check-cast v4, La/mm40;

    .line 18
    .line 19
    move-object/from16 v9, p3

    .line 20
    .line 21
    check-cast v9, La/fet;

    .line 22
    .line 23
    move-object/from16 v5, p4

    .line 24
    .line 25
    check-cast v5, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 v6, v5, 0x6

    .line 35
    .line 36
    const/4 v7, 0x2

    .line 37
    if-nez v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v9, v3}, La/fet;->e(I)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v6, v7

    .line 48
    :goto_0
    or-int/2addr v6, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v6, v5

    .line 51
    :goto_1
    and-int/lit8 v5, v5, 0x30

    .line 52
    .line 53
    if-nez v5, :cond_3

    .line 54
    .line 55
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    const/16 v5, 0x20

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/16 v5, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v6, v5

    .line 67
    :cond_3
    and-int/lit16 v5, v6, 0x93

    .line 68
    .line 69
    const/16 v8, 0x92

    .line 70
    .line 71
    const/4 v10, 0x1

    .line 72
    if-eq v5, v8, :cond_4

    .line 73
    .line 74
    move v5, v10

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    const/4 v5, 0x0

    .line 77
    :goto_3
    and-int/2addr v6, v10

    .line 78
    invoke-virtual {v9, v6, v5}, La/fet;->U(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_1b

    .line 83
    .line 84
    iget-object v5, v0, La/gej;->a:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, La/yk9;

    .line 91
    .line 92
    iget-wide v5, v3, La/yk9;->a:J

    .line 93
    .line 94
    iget-boolean v8, v3, La/yk9;->c:Z

    .line 95
    .line 96
    iget-wide v12, v0, La/gej;->b:J

    .line 97
    .line 98
    cmp-long v12, v12, v5

    .line 99
    .line 100
    if-gtz v12, :cond_5

    .line 101
    .line 102
    iget-wide v12, v0, La/gej;->c:J

    .line 103
    .line 104
    cmp-long v12, v5, v12

    .line 105
    .line 106
    if-gtz v12, :cond_5

    .line 107
    .line 108
    move v12, v10

    .line 109
    goto :goto_4

    .line 110
    :cond_5
    const/4 v12, 0x0

    .line 111
    :goto_4
    if-eqz v2, :cond_7

    .line 112
    .line 113
    iget-object v1, v1, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 114
    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_6
    const/4 v1, 0x0

    .line 119
    goto :goto_6

    .line 120
    :cond_7
    :goto_5
    move v1, v10

    .line 121
    :goto_6
    invoke-virtual {v9, v5, v6}, La/fet;->f(J)Z

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    iget-object v14, v0, La/gej;->e:Ljava/util/Locale;

    .line 126
    .line 127
    invoke-virtual {v9, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    or-int/2addr v13, v15

    .line 132
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    sget-object v11, La/ukd;->a:La/cl5;

    .line 137
    .line 138
    if-nez v13, :cond_9

    .line 139
    .line 140
    if-ne v15, v11, :cond_8

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_8
    move/from16 p2, v10

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_9
    :goto_7
    invoke-static {v14}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-virtual {v13, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 151
    .line 152
    .line 153
    new-instance v15, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 154
    .line 155
    invoke-virtual {v13, v10}, Ljava/util/Calendar;->get(I)I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    invoke-virtual {v13, v7}, Ljava/util/Calendar;->get(I)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    add-int/2addr v7, v10

    .line 164
    move/from16 p2, v10

    .line 165
    .line 166
    const/4 v10, 0x5

    .line 167
    invoke-virtual {v13, v10}, Ljava/util/Calendar;->get(I)I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-direct {v15, v14, v7, v10}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :goto_8
    check-cast v15, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 178
    .line 179
    if-nez v8, :cond_b

    .line 180
    .line 181
    :cond_a
    :goto_9
    const/4 v13, 0x0

    .line 182
    goto :goto_b

    .line 183
    :cond_b
    iget-boolean v7, v0, La/gej;->f:Z

    .line 184
    .line 185
    if-nez v7, :cond_c

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_c
    if-nez v12, :cond_d

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_d
    if-eqz v1, :cond_e

    .line 192
    .line 193
    :goto_a
    move/from16 v13, p2

    .line 194
    .line 195
    goto :goto_b

    .line 196
    :cond_e
    invoke-static {v15, v2}, La/bsr0;->W(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-gtz v1, :cond_f

    .line 201
    .line 202
    goto :goto_a

    .line 203
    :cond_f
    iget-object v1, v0, La/gej;->g:Ljava/util/Calendar;

    .line 204
    .line 205
    invoke-static {v2, v15, v1}, La/sj3;->R(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    add-int/lit8 v1, v1, 0x1

    .line 210
    .line 211
    iget v2, v0, La/gej;->h:I

    .line 212
    .line 213
    if-lt v1, v2, :cond_a

    .line 214
    .line 215
    iget-object v2, v0, La/gej;->i:Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-gt v1, v2, :cond_a

    .line 222
    .line 223
    goto :goto_a

    .line 224
    :goto_b
    iget-object v1, v0, La/gej;->j:Ljava/lang/Long;

    .line 225
    .line 226
    if-nez v1, :cond_10

    .line 227
    .line 228
    goto :goto_c

    .line 229
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 230
    .line 231
    .line 232
    move-result-wide v1

    .line 233
    cmp-long v1, v1, v5

    .line 234
    .line 235
    if-eqz v1, :cond_13

    .line 236
    .line 237
    :goto_c
    iget-object v1, v0, La/gej;->k:Ljava/lang/Long;

    .line 238
    .line 239
    if-nez v1, :cond_11

    .line 240
    .line 241
    goto :goto_d

    .line 242
    :cond_11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v1

    .line 246
    cmp-long v1, v1, v5

    .line 247
    .line 248
    if-nez v1, :cond_12

    .line 249
    .line 250
    goto :goto_e

    .line 251
    :cond_12
    :goto_d
    const/4 v1, 0x0

    .line 252
    goto :goto_f

    .line 253
    :cond_13
    :goto_e
    move/from16 v1, p2

    .line 254
    .line 255
    :goto_f
    iget-wide v14, v0, La/gej;->l:J

    .line 256
    .line 257
    invoke-static {v14, v15, v5, v6}, La/bsr0;->e0(JJ)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-nez v13, :cond_14

    .line 262
    .line 263
    sget-object v1, La/tk9;->a:La/tk9;

    .line 264
    .line 265
    goto :goto_10

    .line 266
    :cond_14
    if-eqz v1, :cond_15

    .line 267
    .line 268
    sget-object v1, La/uk9;->a:La/uk9;

    .line 269
    .line 270
    goto :goto_10

    .line 271
    :cond_15
    if-eqz v2, :cond_16

    .line 272
    .line 273
    sget-object v1, La/rk9;->a:La/rk9;

    .line 274
    .line 275
    goto :goto_10

    .line 276
    :cond_16
    sget-object v1, La/sk9;->a:La/sk9;

    .line 277
    .line 278
    :goto_10
    if-eqz v8, :cond_17

    .line 279
    .line 280
    iget v2, v3, La/yk9;->b:I

    .line 281
    .line 282
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    goto :goto_11

    .line 287
    :cond_17
    const-string v2, ""

    .line 288
    .line 289
    :goto_11
    const/high16 v7, 0x40000000    # 2.0f

    .line 290
    .line 291
    const/4 v10, 0x0

    .line 292
    if-nez v8, :cond_18

    .line 293
    .line 294
    const v0, 0x6c31adb5

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 298
    .line 299
    .line 300
    sget-object v0, La/qmk;->a:La/zcl;

    .line 301
    .line 302
    move/from16 v8, p2

    .line 303
    .line 304
    invoke-static {v4, v10, v7, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v9, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 309
    .line 310
    .line 311
    const/4 v0, 0x0

    .line 312
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 313
    .line 314
    .line 315
    goto :goto_14

    .line 316
    :cond_18
    move/from16 v8, p2

    .line 317
    .line 318
    const v12, 0x6c341290

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9, v12}, La/fet;->e0(I)V

    .line 322
    .line 323
    .line 324
    new-instance v12, La/qk9;

    .line 325
    .line 326
    invoke-direct {v12, v2, v1}, La/qk9;-><init>(Ljava/lang/String;La/vk9;)V

    .line 327
    .line 328
    .line 329
    sget-object v1, La/qmk;->a:La/zcl;

    .line 330
    .line 331
    invoke-static {v4, v10, v7, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v9, v13}, La/fet;->h(Z)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    iget-object v14, v0, La/gej;->m:Lkotlin/jvm/functions/Function2;

    .line 340
    .line 341
    invoke-virtual {v9, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    or-int/2addr v0, v2

    .line 346
    invoke-virtual {v9, v5, v6}, La/fet;->f(J)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    or-int/2addr v0, v2

    .line 351
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    or-int/2addr v0, v2

    .line 356
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    if-nez v0, :cond_19

    .line 361
    .line 362
    if-ne v2, v11, :cond_1a

    .line 363
    .line 364
    :cond_19
    move-object v0, v12

    .line 365
    goto :goto_12

    .line 366
    :cond_1a
    move-object v0, v12

    .line 367
    goto :goto_13

    .line 368
    :goto_12
    new-instance v12, La/q71;

    .line 369
    .line 370
    move-object/from16 v17, v3

    .line 371
    .line 372
    move-wide v15, v5

    .line 373
    invoke-direct/range {v12 .. v17}, La/q71;-><init>(ZLkotlin/jvm/functions/Function2;JLa/yk9;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v9, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    move-object v2, v12

    .line 380
    :goto_13
    move-object v8, v2

    .line 381
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 382
    .line 383
    const/16 v10, 0x40

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    move-object v6, v0

    .line 387
    move-object v5, v1

    .line 388
    invoke-static/range {v5 .. v10}, La/x4d0;->l(La/mm40;La/qk9;La/gy40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 389
    .line 390
    .line 391
    const/4 v0, 0x0

    .line 392
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 393
    .line 394
    .line 395
    goto :goto_14

    .line 396
    :cond_1b
    invoke-virtual {v9}, La/fet;->X()V

    .line 397
    .line 398
    .line 399
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0
.end method
