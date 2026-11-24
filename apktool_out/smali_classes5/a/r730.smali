.class public final La/r730;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/s730;


# direct methods
.method public synthetic constructor <init>(La/s730;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r730;->i:B

    iput-object p1, p0, La/r730;->k:La/s730;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r730;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r730;->k:La/s730;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r730;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r730;-><init>(La/s730;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r730;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r730;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r730;-><init>(La/s730;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r730;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r730;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ux20;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r730;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r730;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r730;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hx20;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r730;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r730;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r730;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r730;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/r730;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/ux20;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_23

    .line 18
    .line 19
    instance-of v3, v1, La/qx20;

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    iget-object v7, v0, La/r730;->k:La/s730;

    .line 25
    .line 26
    if-eqz v3, :cond_20

    .line 27
    .line 28
    check-cast v1, La/qx20;

    .line 29
    .line 30
    sget-object v0, La/s730;->Q1:La/atz;

    .line 31
    .line 32
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v3, v0, La/z1r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, La/z1r;->g:Landroid/widget/FrameLayout;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iget-object v3, v0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 47
    .line 48
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, La/z1r;->e:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v3, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->a:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/view/View;->postInvalidate()V

    .line 62
    .line 63
    .line 64
    iget-object v0, v3, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->y:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 67
    .line 68
    .line 69
    iget v0, v1, La/qx20;->c:I

    .line 70
    .line 71
    iget-boolean v3, v1, La/qx20;->d:Z

    .line 72
    .line 73
    iget-object v6, v1, La/qx20;->a:La/mx20;

    .line 74
    .line 75
    iget v8, v6, La/mx20;->a:F

    .line 76
    .line 77
    iget-wide v9, v6, La/mx20;->c:J

    .line 78
    .line 79
    iget v11, v6, La/mx20;->b:F

    .line 80
    .line 81
    float-to-double v12, v8

    .line 82
    float-to-double v14, v11

    .line 83
    sub-double v16, v14, v12

    .line 84
    .line 85
    const-wide/high16 v18, 0x4020000000000000L    # 8.0

    .line 86
    .line 87
    div-double v16, v16, v18

    .line 88
    .line 89
    const/16 v8, 0x9

    .line 90
    .line 91
    new-array v5, v8, [Ljava/lang/Double;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    :goto_0
    if-ge v2, v8, :cond_0

    .line 95
    .line 96
    const-wide/16 v19, 0x0

    .line 97
    .line 98
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 99
    .line 100
    .line 101
    move-result-object v19

    .line 102
    aput-object v19, v5, v2

    .line 103
    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    const/4 v2, 0x0

    .line 108
    :goto_1
    if-ge v2, v8, :cond_2

    .line 109
    .line 110
    if-ne v2, v4, :cond_1

    .line 111
    .line 112
    move-object/from16 v20, v5

    .line 113
    .line 114
    move-wide v4, v14

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    move-object/from16 v20, v5

    .line 117
    .line 118
    int-to-double v4, v2

    .line 119
    mul-double v4, v4, v16

    .line 120
    .line 121
    add-double/2addr v4, v12

    .line 122
    :goto_2
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    aput-object v4, v20, v2

    .line 127
    .line 128
    add-int/lit8 v2, v2, 0x1

    .line 129
    .line 130
    move-object/from16 v5, v20

    .line 131
    .line 132
    const/16 v4, 0x8

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    move-object/from16 v20, v5

    .line 136
    .line 137
    new-array v2, v8, [Ljava/lang/String;

    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    :goto_3
    const-string v5, ""

    .line 141
    .line 142
    if-ge v4, v8, :cond_3

    .line 143
    .line 144
    aput-object v5, v2, v4

    .line 145
    .line 146
    add-int/lit8 v4, v4, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_3
    const/4 v4, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    :goto_4
    if-ge v4, v8, :cond_4

    .line 152
    .line 153
    aget-object v13, v20, v4

    .line 154
    .line 155
    add-int/lit8 v14, v12, 0x1

    .line 156
    .line 157
    move-wide v15, v9

    .line 158
    invoke-virtual {v13}, Ljava/lang/Number;->doubleValue()D

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    sget-object v10, La/jvn;->a:La/pek;

    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, La/pek;->k(I)La/jvn;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    sget-object v13, La/p3u0;->c:La/p3u0;

    .line 172
    .line 173
    invoke-static {v10, v8, v9, v13}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    aput-object v8, v2, v12

    .line 178
    .line 179
    add-int/lit8 v4, v4, 0x1

    .line 180
    .line 181
    move v12, v14

    .line 182
    move-wide v9, v15

    .line 183
    const/16 v8, 0x9

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_4
    move-wide v15, v9

    .line 187
    iget-wide v8, v6, La/mx20;->d:J

    .line 188
    .line 189
    sub-long v12, v8, v15

    .line 190
    .line 191
    const-wide/16 v20, 0x7

    .line 192
    .line 193
    div-long v20, v12, v20

    .line 194
    .line 195
    const/16 v0, 0x8

    .line 196
    .line 197
    new-array v4, v0, [Ljava/lang/Long;

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    :goto_5
    if-ge v10, v0, :cond_5

    .line 201
    .line 202
    const-wide/16 v22, 0x0

    .line 203
    .line 204
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    aput-object v14, v4, v10

    .line 209
    .line 210
    add-int/lit8 v10, v10, 0x1

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_5
    const/4 v10, 0x0

    .line 214
    :goto_6
    if-ge v10, v0, :cond_7

    .line 215
    .line 216
    const/4 v0, 0x7

    .line 217
    if-ne v10, v0, :cond_6

    .line 218
    .line 219
    move v0, v3

    .line 220
    move-object v14, v4

    .line 221
    move-wide v3, v8

    .line 222
    goto :goto_7

    .line 223
    :cond_6
    move v0, v3

    .line 224
    move-object v14, v4

    .line 225
    int-to-long v3, v10

    .line 226
    mul-long v3, v3, v20

    .line 227
    .line 228
    add-long/2addr v3, v15

    .line 229
    :goto_7
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    aput-object v3, v14, v10

    .line 234
    .line 235
    add-int/lit8 v10, v10, 0x1

    .line 236
    .line 237
    move v3, v0

    .line 238
    move-object v4, v14

    .line 239
    const/16 v0, 0x8

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_7
    move v14, v3

    .line 243
    move v3, v0

    .line 244
    move v0, v14

    .line 245
    move-object v14, v4

    .line 246
    new-array v4, v3, [Ljava/lang/String;

    .line 247
    .line 248
    const/4 v10, 0x0

    .line 249
    :goto_8
    if-ge v10, v3, :cond_8

    .line 250
    .line 251
    aput-object v5, v4, v10

    .line 252
    .line 253
    add-int/lit8 v10, v10, 0x1

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_8
    const/4 v10, 0x0

    .line 257
    const/16 v17, 0x0

    .line 258
    .line 259
    :goto_9
    if-ge v10, v3, :cond_a

    .line 260
    .line 261
    aget-object v3, v14, v10

    .line 262
    .line 263
    add-int/lit8 v20, v17, 0x1

    .line 264
    .line 265
    move-wide/from16 v21, v8

    .line 266
    .line 267
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 268
    .line 269
    .line 270
    move-result-wide v8

    .line 271
    if-eqz v0, :cond_9

    .line 272
    .line 273
    sget-object v3, La/rdj;->a:La/rdj;

    .line 274
    .line 275
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    move/from16 p0, v0

    .line 284
    .line 285
    sget-object v0, La/ykq0;->c:La/ykq0;

    .line 286
    .line 287
    move/from16 v23, v3

    .line 288
    .line 289
    new-instance v3, La/ynq0;

    .line 290
    .line 291
    invoke-direct {v3, v8, v9}, La/ynq0;-><init>(J)V

    .line 292
    .line 293
    .line 294
    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    const/16 v9, 0xf8

    .line 299
    .line 300
    move-object/from16 v23, v5

    .line 301
    .line 302
    const/4 v5, 0x0

    .line 303
    invoke-static {v3, v0, v8, v5, v9}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    goto :goto_a

    .line 308
    :cond_9
    move/from16 p0, v0

    .line 309
    .line 310
    move-object/from16 v23, v5

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    sget-object v0, La/rdj;->a:La/rdj;

    .line 314
    .line 315
    new-instance v0, La/ynq0;

    .line 316
    .line 317
    invoke-direct {v0, v8, v9}, La/ynq0;-><init>(J)V

    .line 318
    .line 319
    .line 320
    sget-object v3, La/sdj;->c:La/sdj;

    .line 321
    .line 322
    const/16 v8, 0x3c

    .line 323
    .line 324
    invoke-static {v0, v3, v5, v8}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    :goto_a
    aput-object v0, v4, v17

    .line 329
    .line 330
    add-int/lit8 v10, v10, 0x1

    .line 331
    .line 332
    move/from16 v0, p0

    .line 333
    .line 334
    move/from16 v17, v20

    .line 335
    .line 336
    move-wide/from16 v8, v21

    .line 337
    .line 338
    move-object/from16 v5, v23

    .line 339
    .line 340
    const/16 v3, 0x8

    .line 341
    .line 342
    goto :goto_9

    .line 343
    :cond_a
    move-object/from16 v23, v5

    .line 344
    .line 345
    move-wide/from16 v21, v8

    .line 346
    .line 347
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    iget-object v3, v3, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 356
    .line 357
    div-float v5, v11, v11

    .line 358
    .line 359
    iput v5, v3, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->p:F

    .line 360
    .line 361
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iget-object v3, v3, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 366
    .line 367
    invoke-virtual {v3, v2}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->setVerValuesText([Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    iget-object v2, v2, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 375
    .line 376
    invoke-virtual {v2, v4}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->setHorValuesText([Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    iget-object v1, v1, La/qx20;->b:Ljava/util/List;

    .line 380
    .line 381
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-eqz v2, :cond_1f

    .line 390
    .line 391
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    check-cast v2, La/lx20;

    .line 396
    .line 397
    iget-object v4, v2, La/lx20;->d:Ljava/util/ArrayList;

    .line 398
    .line 399
    new-instance v5, Ljava/util/ArrayList;

    .line 400
    .line 401
    const/16 v8, 0xa

    .line 402
    .line 403
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v9

    .line 418
    if-eqz v9, :cond_b

    .line 419
    .line 420
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    check-cast v9, La/jx20;

    .line 425
    .line 426
    new-instance v10, Lkotlin/Pair;

    .line 427
    .line 428
    iget v14, v9, La/jx20;->a:F

    .line 429
    .line 430
    const/16 p0, 0x1

    .line 431
    .line 432
    iget v3, v6, La/mx20;->a:F

    .line 433
    .line 434
    sub-float/2addr v14, v3

    .line 435
    const/high16 v17, 0x42c00000    # 96.0f

    .line 436
    .line 437
    sub-float v3, v11, v3

    .line 438
    .line 439
    div-float v17, v17, v3

    .line 440
    .line 441
    mul-float v17, v17, v14

    .line 442
    .line 443
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    iget-object v9, v9, La/jx20;->c:Ljava/lang/String;

    .line 448
    .line 449
    invoke-direct {v10, v3, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    goto :goto_c

    .line 456
    :cond_b
    const/16 p0, 0x1

    .line 457
    .line 458
    iget-object v3, v2, La/lx20;->d:Ljava/util/ArrayList;

    .line 459
    .line 460
    new-instance v4, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    if-eqz v8, :cond_d

    .line 478
    .line 479
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    check-cast v8, La/jx20;

    .line 484
    .line 485
    iget-wide v8, v8, La/jx20;->b:J

    .line 486
    .line 487
    cmp-long v10, v15, v21

    .line 488
    .line 489
    const/high16 v14, 0x42c40000    # 98.0f

    .line 490
    .line 491
    if-nez v10, :cond_c

    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_c
    sub-long/2addr v8, v15

    .line 495
    long-to-float v8, v8

    .line 496
    long-to-float v9, v12

    .line 497
    div-float/2addr v14, v9

    .line 498
    mul-float/2addr v14, v8

    .line 499
    :goto_e
    const v8, 0x3e99999a    # 0.3f

    .line 500
    .line 501
    .line 502
    add-float/2addr v14, v8

    .line 503
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    goto :goto_d

    .line 511
    :cond_d
    sget-object v3, La/s730;->S1:Ljava/util/List;

    .line 512
    .line 513
    iget v8, v2, La/lx20;->c:I

    .line 514
    .line 515
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 516
    .line 517
    .line 518
    move-result v9

    .line 519
    rem-int/2addr v8, v9

    .line 520
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    check-cast v3, Ljava/lang/Number;

    .line 525
    .line 526
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    new-instance v8, La/j500;

    .line 531
    .line 532
    iget-object v2, v2, La/lx20;->b:Ljava/lang/String;

    .line 533
    .line 534
    invoke-direct {v8, v0, v2}, La/j500;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    iget-object v2, v8, La/j500;->c:La/n0o0;

    .line 538
    .line 539
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    check-cast v2, Landroid/graphics/Paint;

    .line 544
    .line 545
    sget-object v9, La/j5d;->a:Landroid/util/TypedValue;

    .line 546
    .line 547
    invoke-virtual {v0, v3}, Landroid/content/Context;->getColor(I)I

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 563
    .line 564
    const/high16 v9, 0x40a00000    # 5.0f

    .line 565
    .line 566
    mul-float/2addr v2, v9

    .line 567
    float-to-double v9, v2

    .line 568
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 569
    .line 570
    .line 571
    move-result-wide v9

    .line 572
    double-to-float v2, v9

    .line 573
    float-to-int v2, v2

    .line 574
    int-to-float v2, v2

    .line 575
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    const/4 v9, 0x0

    .line 580
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    const/16 v17, 0x0

    .line 585
    .line 586
    iget-object v14, v8, La/j500;->b:Ljava/util/ArrayList;

    .line 587
    .line 588
    if-eqz v10, :cond_16

    .line 589
    .line 590
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    add-int/lit8 v19, v9, 0x1

    .line 595
    .line 596
    if-ltz v9, :cond_15

    .line 597
    .line 598
    check-cast v10, Ljava/lang/Number;

    .line 599
    .line 600
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 601
    .line 602
    .line 603
    move-result v26

    .line 604
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    add-int/lit8 v10, v10, -0x1

    .line 609
    .line 610
    if-le v9, v10, :cond_e

    .line 611
    .line 612
    goto/16 :goto_19

    .line 613
    .line 614
    :cond_e
    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    check-cast v10, Lkotlin/Pair;

    .line 619
    .line 620
    if-eqz v10, :cond_f

    .line 621
    .line 622
    iget-object v10, v10, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v10, Ljava/lang/Number;

    .line 625
    .line 626
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 627
    .line 628
    .line 629
    move-result v10

    .line 630
    const v17, 0x400ccccd    # 2.2f

    .line 631
    .line 632
    .line 633
    add-float v10, v10, v17

    .line 634
    .line 635
    move/from16 v27, v10

    .line 636
    .line 637
    goto :goto_10

    .line 638
    :cond_f
    move/from16 v27, v17

    .line 639
    .line 640
    :goto_10
    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    check-cast v9, Lkotlin/Pair;

    .line 645
    .line 646
    if-eqz v9, :cond_10

    .line 647
    .line 648
    iget-object v9, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v9, Ljava/lang/String;

    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_10
    const/4 v9, 0x0

    .line 654
    :goto_11
    if-nez v9, :cond_11

    .line 655
    .line 656
    move-object/from16 v28, v23

    .line 657
    .line 658
    goto :goto_12

    .line 659
    :cond_11
    move-object/from16 v28, v9

    .line 660
    .line 661
    :goto_12
    new-instance v24, La/o700;

    .line 662
    .line 663
    move-object/from16 v25, v0

    .line 664
    .line 665
    move/from16 v29, v2

    .line 666
    .line 667
    invoke-direct/range {v24 .. v29}, La/o700;-><init>(Landroid/content/Context;FFLjava/lang/String;F)V

    .line 668
    .line 669
    .line 670
    move-object/from16 v2, v24

    .line 671
    .line 672
    invoke-virtual {v2}, La/o700;->a()Landroid/graphics/Paint;

    .line 673
    .line 674
    .line 675
    move-result-object v9

    .line 676
    sget-object v10, La/j5d;->a:Landroid/util/TypedValue;

    .line 677
    .line 678
    invoke-virtual {v0, v3}, Landroid/content/Context;->getColor(I)I

    .line 679
    .line 680
    .line 681
    move-result v10

    .line 682
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2}, La/o700;->a()Landroid/graphics/Paint;

    .line 686
    .line 687
    .line 688
    move-result-object v9

    .line 689
    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 690
    .line 691
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v2}, La/o700;->b()Landroid/graphics/Paint;

    .line 695
    .line 696
    .line 697
    move-result-object v9

    .line 698
    const v10, 0x7f0606d8

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0, v10}, Landroid/content/Context;->getColor(I)I

    .line 702
    .line 703
    .line 704
    move-result v10

    .line 705
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 709
    .line 710
    .line 711
    move-result-object v9

    .line 712
    const/4 v10, 0x0

    .line 713
    :goto_13
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 714
    .line 715
    .line 716
    move-result v17

    .line 717
    if-eqz v17, :cond_14

    .line 718
    .line 719
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v17

    .line 723
    add-int/lit8 v20, v10, 0x1

    .line 724
    .line 725
    if-ltz v10, :cond_13

    .line 726
    .line 727
    move-object/from16 v25, v0

    .line 728
    .line 729
    move-object/from16 v0, v17

    .line 730
    .line 731
    check-cast v0, La/o700;

    .line 732
    .line 733
    move-object/from16 v24, v1

    .line 734
    .line 735
    iget v1, v2, La/o700;->a:F

    .line 736
    .line 737
    iget v0, v0, La/o700;->a:F

    .line 738
    .line 739
    cmpg-float v0, v1, v0

    .line 740
    .line 741
    if-gez v0, :cond_12

    .line 742
    .line 743
    invoke-virtual {v14, v10, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v8}, La/j500;->a()V

    .line 747
    .line 748
    .line 749
    const/16 v18, 0x0

    .line 750
    .line 751
    goto :goto_14

    .line 752
    :cond_12
    move/from16 v10, v20

    .line 753
    .line 754
    move-object/from16 v1, v24

    .line 755
    .line 756
    move-object/from16 v0, v25

    .line 757
    .line 758
    goto :goto_13

    .line 759
    :cond_13
    invoke-static {}, La/q3d;->p()V

    .line 760
    .line 761
    .line 762
    const/16 v18, 0x0

    .line 763
    .line 764
    throw v18

    .line 765
    :cond_14
    move-object/from16 v25, v0

    .line 766
    .line 767
    move-object/from16 v24, v1

    .line 768
    .line 769
    const/16 v18, 0x0

    .line 770
    .line 771
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    invoke-virtual {v8}, La/j500;->a()V

    .line 775
    .line 776
    .line 777
    :goto_14
    move/from16 v9, v19

    .line 778
    .line 779
    move-object/from16 v1, v24

    .line 780
    .line 781
    move-object/from16 v0, v25

    .line 782
    .line 783
    move/from16 v2, v29

    .line 784
    .line 785
    goto/16 :goto_f

    .line 786
    .line 787
    :cond_15
    const/16 v18, 0x0

    .line 788
    .line 789
    invoke-static {}, La/q3d;->p()V

    .line 790
    .line 791
    .line 792
    throw v18

    .line 793
    :cond_16
    move-object/from16 v25, v0

    .line 794
    .line 795
    move-object/from16 v24, v1

    .line 796
    .line 797
    const/16 v18, 0x0

    .line 798
    .line 799
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    iget-object v0, v0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 804
    .line 805
    iget-object v1, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->a:Ljava/util/ArrayList;

    .line 806
    .line 807
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 811
    .line 812
    .line 813
    iget-object v1, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->y:Ljava/util/LinkedHashMap;

    .line 814
    .line 815
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    :cond_17
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    if-eqz v3, :cond_19

    .line 824
    .line 825
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    check-cast v3, La/o700;

    .line 830
    .line 831
    iget v4, v3, La/o700;->a:F

    .line 832
    .line 833
    iget v5, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->n:F

    .line 834
    .line 835
    mul-float/2addr v4, v5

    .line 836
    mul-float v5, v5, v17

    .line 837
    .line 838
    sub-float/2addr v4, v5

    .line 839
    iget v5, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->d:F

    .line 840
    .line 841
    add-float/2addr v4, v5

    .line 842
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 843
    .line 844
    .line 845
    move-result-object v5

    .line 846
    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    iget-object v9, v8, La/j500;->a:Ljava/lang/String;

    .line 851
    .line 852
    if-nez v5, :cond_18

    .line 853
    .line 854
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 855
    .line 856
    .line 857
    move-result-object v4

    .line 858
    new-instance v5, Lkotlin/Pair;

    .line 859
    .line 860
    invoke-direct {v5, v9, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    filled-new-array {v5}, [Lkotlin/Pair;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    invoke-static {v3}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    goto :goto_15

    .line 875
    :cond_18
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v4

    .line 883
    check-cast v4, Ljava/util/List;

    .line 884
    .line 885
    if-eqz v4, :cond_17

    .line 886
    .line 887
    new-instance v5, Lkotlin/Pair;

    .line 888
    .line 889
    invoke-direct {v5, v9, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    goto :goto_15

    .line 896
    :cond_19
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 904
    .line 905
    .line 906
    move-result v2

    .line 907
    if-eqz v2, :cond_1e

    .line 908
    .line 909
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    check-cast v2, La/o700;

    .line 917
    .line 918
    iget v3, v2, La/o700;->a:F

    .line 919
    .line 920
    iget v4, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->r:F

    .line 921
    .line 922
    cmpl-float v5, v3, v4

    .line 923
    .line 924
    if-lez v5, :cond_1a

    .line 925
    .line 926
    move v4, v3

    .line 927
    :cond_1a
    iput v4, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->r:F

    .line 928
    .line 929
    iget v2, v2, La/o700;->b:F

    .line 930
    .line 931
    iget v4, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->s:F

    .line 932
    .line 933
    cmpl-float v5, v2, v4

    .line 934
    .line 935
    if-lez v5, :cond_1b

    .line 936
    .line 937
    move v4, v2

    .line 938
    :cond_1b
    iput v4, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->s:F

    .line 939
    .line 940
    iget v4, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->t:F

    .line 941
    .line 942
    cmpg-float v5, v3, v4

    .line 943
    .line 944
    if-gez v5, :cond_1c

    .line 945
    .line 946
    goto :goto_17

    .line 947
    :cond_1c
    move v3, v4

    .line 948
    :goto_17
    iput v3, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->t:F

    .line 949
    .line 950
    iget v3, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->u:F

    .line 951
    .line 952
    cmpg-float v4, v2, v3

    .line 953
    .line 954
    if-gez v4, :cond_1d

    .line 955
    .line 956
    goto :goto_18

    .line 957
    :cond_1d
    move v2, v3

    .line 958
    :goto_18
    iput v2, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->u:F

    .line 959
    .line 960
    goto :goto_16

    .line 961
    :cond_1e
    move-object/from16 v1, v24

    .line 962
    .line 963
    move-object/from16 v0, v25

    .line 964
    .line 965
    goto/16 :goto_b

    .line 966
    .line 967
    :cond_1f
    const/16 p0, 0x1

    .line 968
    .line 969
    :goto_19
    iget-wide v8, v6, La/mx20;->c:J

    .line 970
    .line 971
    iget-wide v10, v6, La/mx20;->d:J

    .line 972
    .line 973
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    iget-object v0, v0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 978
    .line 979
    new-instance v1, La/p730;

    .line 980
    .line 981
    move/from16 v2, p0

    .line 982
    .line 983
    invoke-direct {v1, v7, v2}, La/p730;-><init>(La/s730;B)V

    .line 984
    .line 985
    .line 986
    new-instance v6, La/qp7;

    .line 987
    .line 988
    const/4 v12, 0x4

    .line 989
    invoke-direct/range {v6 .. v12}, La/qp7;-><init>(Ljava/lang/Object;JJB)V

    .line 990
    .line 991
    .line 992
    new-instance v3, La/o730;

    .line 993
    .line 994
    invoke-direct {v3, v7, v2}, La/o730;-><init>(La/s730;B)V

    .line 995
    .line 996
    .line 997
    iput-object v1, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->z:Lkotlin/jvm/functions/Function2;

    .line 998
    .line 999
    iput-object v6, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->A:Lkotlin/jvm/functions/Function1;

    .line 1000
    .line 1001
    iput-object v3, v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->B:Lkotlin/jvm/functions/Function0;

    .line 1002
    .line 1003
    goto :goto_1a

    .line 1004
    :cond_20
    const/16 v18, 0x0

    .line 1005
    .line 1006
    instance-of v0, v1, La/tx20;

    .line 1007
    .line 1008
    if-eqz v0, :cond_21

    .line 1009
    .line 1010
    sget-object v0, La/s730;->Q1:La/atz;

    .line 1011
    .line 1012
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    iget-object v0, v0, La/z1r;->g:Landroid/widget/FrameLayout;

    .line 1017
    .line 1018
    const/4 v1, 0x0

    .line 1019
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_1a

    .line 1023
    :cond_21
    instance-of v0, v1, La/rx20;

    .line 1024
    .line 1025
    if-eqz v0, :cond_22

    .line 1026
    .line 1027
    check-cast v1, La/rx20;

    .line 1028
    .line 1029
    sget-object v0, La/s730;->Q1:La/atz;

    .line 1030
    .line 1031
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    iget-object v2, v0, La/z1r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1036
    .line 1037
    const/16 v3, 0x8

    .line 1038
    .line 1039
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1040
    .line 1041
    .line 1042
    iget-object v2, v0, La/z1r;->g:Landroid/widget/FrameLayout;

    .line 1043
    .line 1044
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v2, v0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 1048
    .line 1049
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1050
    .line 1051
    .line 1052
    iget-object v0, v0, La/z1r;->e:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 1053
    .line 1054
    const/4 v2, 0x0

    .line 1055
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 1056
    .line 1057
    .line 1058
    iget-object v1, v1, La/rx20;->a:La/jkm;

    .line 1059
    .line 1060
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 1061
    .line 1062
    .line 1063
    goto :goto_1a

    .line 1064
    :cond_22
    instance-of v0, v1, La/sx20;

    .line 1065
    .line 1066
    if-eqz v0, :cond_24

    .line 1067
    .line 1068
    check-cast v1, La/sx20;

    .line 1069
    .line 1070
    sget-object v0, La/s730;->Q1:La/atz;

    .line 1071
    .line 1072
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    iget-object v2, v0, La/z1r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1077
    .line 1078
    iget-object v3, v0, La/z1r;->e:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 1079
    .line 1080
    const/16 v4, 0x8

    .line 1081
    .line 1082
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1083
    .line 1084
    .line 1085
    iget-object v2, v0, La/z1r;->g:Landroid/widget/FrameLayout;

    .line 1086
    .line 1087
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1088
    .line 1089
    .line 1090
    iget-object v0, v0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 1091
    .line 1092
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1093
    .line 1094
    .line 1095
    const/4 v2, 0x0

    .line 1096
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 1097
    .line 1098
    .line 1099
    iget-object v0, v1, La/sx20;->a:La/jkm;

    .line 1100
    .line 1101
    new-instance v1, La/bmh;

    .line 1102
    .line 1103
    const/16 v2, 0xc

    .line 1104
    .line 1105
    invoke-direct {v1, v2}, La/bmh;-><init>(B)V

    .line 1106
    .line 1107
    .line 1108
    const-wide/16 v4, 0x2710

    .line 1109
    .line 1110
    invoke-virtual {v3, v0, v4, v5, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 1111
    .line 1112
    .line 1113
    :goto_1a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1114
    .line 1115
    goto :goto_1b

    .line 1116
    :cond_23
    const/16 v18, 0x0

    .line 1117
    .line 1118
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1119
    .line 1120
    .line 1121
    move-object/from16 v2, v18

    .line 1122
    .line 1123
    :goto_1b
    return-object v2

    .line 1124
    :pswitch_0
    iget-object v1, v0, La/r730;->j:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v1, La/hx20;

    .line 1127
    .line 1128
    sget-object v2, La/wne;->a:La/wne;

    .line 1129
    .line 1130
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1131
    .line 1132
    .line 1133
    instance-of v2, v1, La/fx20;

    .line 1134
    .line 1135
    if-eqz v2, :cond_25

    .line 1136
    .line 1137
    iget-object v0, v0, La/r730;->k:La/s730;

    .line 1138
    .line 1139
    iget-object v0, v0, La/s730;->P1:La/bg5;

    .line 1140
    .line 1141
    check-cast v1, La/fx20;

    .line 1142
    .line 1143
    iget-object v1, v1, La/fx20;->a:Ljava/util/List;

    .line 1144
    .line 1145
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 1146
    .line 1147
    .line 1148
    :cond_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1149
    .line 1150
    return-object v0

    .line 1151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
