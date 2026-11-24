.class public final La/jnr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jnr;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, La/jnr;->b:La/l7m0;

    .line 7
    .line 8
    iput-object p3, p0, La/jnr;->c:La/l7m0;

    .line 9
    .line 10
    iput p4, p0, La/jnr;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, v0, La/jnr;->a:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, v0, La/jnr;->b:La/l7m0;

    .line 29
    .line 30
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    add-int/2addr v4, v2

    .line 41
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    sget-object v6, La/qmk;->a:La/zcl;

    .line 46
    .line 47
    const/high16 v6, 0x42600000    # 56.0f

    .line 48
    .line 49
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const/high16 v7, 0x40000000    # 2.0f

    .line 54
    .line 55
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    const-string v10, "SIMULATION"

    .line 68
    .line 69
    if-eqz v9, :cond_3

    .line 70
    .line 71
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    move-object v12, v9

    .line 76
    check-cast v12, La/pj30;

    .line 77
    .line 78
    invoke-interface {v12}, La/pj30;->n()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    instance-of v13, v12, La/s40;

    .line 83
    .line 84
    if-eqz v13, :cond_1

    .line 85
    .line 86
    check-cast v12, La/s40;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v12, 0x0

    .line 90
    :goto_0
    if-eqz v12, :cond_2

    .line 91
    .line 92
    iget-object v12, v12, La/s40;->b:Ljava/lang/String;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    const/4 v12, 0x0

    .line 96
    :goto_1
    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_0

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    const/4 v9, 0x0

    .line 104
    :goto_2
    check-cast v9, La/pj30;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    if-eqz v9, :cond_4

    .line 108
    .line 109
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    invoke-static {v5, v5, v8, v12}, La/p4e;->a(IIII)J

    .line 114
    .line 115
    .line 116
    move-result-wide v12

    .line 117
    invoke-interface {v9, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    const/4 v9, 0x0

    .line 123
    :goto_3
    if-eqz v9, :cond_5

    .line 124
    .line 125
    iget v12, v9, La/pu90;->b:I

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move v12, v8

    .line 129
    :goto_4
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    sub-int/2addr v13, v6

    .line 134
    sub-int/2addr v13, v4

    .line 135
    iget-object v14, v0, La/jnr;->c:La/l7m0;

    .line 136
    .line 137
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    check-cast v15, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    sub-int/2addr v13, v15

    .line 148
    iget v0, v0, La/jnr;->d:I

    .line 149
    .line 150
    sub-int/2addr v13, v0

    .line 151
    sub-int/2addr v13, v12

    .line 152
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    sget-object v13, La/qmk;->a:La/zcl;

    .line 157
    .line 158
    const/high16 v13, 0x42400000    # 48.0f

    .line 159
    .line 160
    invoke-interface {v1, v13}, La/w6k;->T(F)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    const/high16 v15, 0x42200000    # 40.0f

    .line 165
    .line 166
    invoke-interface {v1, v15}, La/w6k;->T(F)I

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    add-int/2addr v15, v13

    .line 171
    add-int v13, v0, v6

    .line 172
    .line 173
    add-int/2addr v13, v4

    .line 174
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    add-int/2addr v4, v13

    .line 185
    add-int/2addr v4, v15

    .line 186
    add-int/2addr v4, v12

    .line 187
    new-instance v12, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    if-eqz v15, :cond_11

    .line 201
    .line 202
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    check-cast v15, La/pj30;

    .line 207
    .line 208
    invoke-interface {v15}, La/pj30;->n()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    move-object/from16 v16, v3

    .line 213
    .line 214
    instance-of v3, v11, La/s40;

    .line 215
    .line 216
    if-eqz v3, :cond_6

    .line 217
    .line 218
    check-cast v11, La/s40;

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_6
    const/4 v11, 0x0

    .line 222
    :goto_6
    if-eqz v11, :cond_7

    .line 223
    .line 224
    iget-object v3, v11, La/s40;->b:Ljava/lang/String;

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_7
    const/4 v3, 0x0

    .line 228
    :goto_7
    if-eqz v3, :cond_8

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    sparse-switch v11, :sswitch_data_0

    .line 235
    .line 236
    .line 237
    :cond_8
    :goto_8
    move v11, v0

    .line 238
    goto/16 :goto_9

    .line 239
    .line 240
    :sswitch_0
    const-string v11, "BACKGROUND_ID"

    .line 241
    .line 242
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_9

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_9
    move v11, v0

    .line 250
    invoke-static {v5, v5, v4, v4}, La/p4e;->a(IIII)J

    .line 251
    .line 252
    .line 253
    move-result-wide v0

    .line 254
    invoke-interface {v15, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    goto/16 :goto_a

    .line 259
    .line 260
    :sswitch_1
    move v11, v0

    .line 261
    const-string v0, "CARDS_ID"

    .line 262
    .line 263
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_a

    .line 268
    .line 269
    goto/16 :goto_9

    .line 270
    .line 271
    :cond_a
    invoke-static {v5, v5, v2, v2}, La/p4e;->a(IIII)J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    invoke-interface {v15, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    goto/16 :goto_a

    .line 280
    .line 281
    :sswitch_2
    move v11, v0

    .line 282
    const-string v0, "TOOLBAR_ID"

    .line 283
    .line 284
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_b

    .line 289
    .line 290
    goto/16 :goto_9

    .line 291
    .line 292
    :cond_b
    invoke-static {v5, v5, v6, v6}, La/p4e;->a(IIII)J

    .line 293
    .line 294
    .line 295
    move-result-wide v0

    .line 296
    invoke-interface {v15, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    goto :goto_a

    .line 301
    :sswitch_3
    move v11, v0

    .line 302
    const-string v0, "INDICATOR_ID"

    .line 303
    .line 304
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-nez v0, :cond_c

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_c
    invoke-static {v5, v5, v7, v7}, La/p4e;->a(IIII)J

    .line 312
    .line 313
    .line 314
    move-result-wide v0

    .line 315
    invoke-interface {v15, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto :goto_a

    .line 320
    :sswitch_4
    move v11, v0

    .line 321
    const-string v0, "BETTING_ID"

    .line 322
    .line 323
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-nez v0, :cond_d

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_d
    invoke-static {v5, v5, v8, v8}, La/p4e;->a(IIII)J

    .line 331
    .line 332
    .line 333
    move-result-wide v0

    .line 334
    invoke-interface {v15, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    goto :goto_a

    .line 339
    :sswitch_5
    move v11, v0

    .line 340
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_e

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_e
    move-object v0, v9

    .line 348
    goto :goto_a

    .line 349
    :sswitch_6
    move v11, v0

    .line 350
    const-string v0, "COMPRESSED_CARD_ID"

    .line 351
    .line 352
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_f

    .line 357
    .line 358
    goto :goto_9

    .line 359
    :cond_f
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    check-cast v0, Ljava/lang/Number;

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    invoke-interface/range {v16 .. v16}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, Ljava/lang/Number;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    invoke-static {v5, v5, v0, v1}, La/p4e;->a(IIII)J

    .line 380
    .line 381
    .line 382
    move-result-wide v0

    .line 383
    invoke-interface {v15, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    goto :goto_a

    .line 388
    :goto_9
    const/4 v0, 0x0

    .line 389
    :goto_a
    if-eqz v0, :cond_10

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    :cond_10
    move-object/from16 v1, p1

    .line 395
    .line 396
    move v0, v11

    .line 397
    move-object/from16 v3, v16

    .line 398
    .line 399
    goto/16 :goto_5

    .line 400
    .line 401
    :cond_11
    move v11, v0

    .line 402
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    new-instance v2, La/inr;

    .line 411
    .line 412
    invoke-direct {v2, v11, v12, v14}, La/inr;-><init>(ILjava/util/ArrayList;La/l7m0;)V

    .line 413
    .line 414
    .line 415
    move-object/from16 v3, p1

    .line 416
    .line 417
    invoke-static {v3, v0, v1, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    return-object v0

    .line 422
    nop

    .line 423
    :sswitch_data_0
    .sparse-switch
        -0x42827614 -> :sswitch_6
        -0x3014edf9 -> :sswitch_5
        -0x1c321d85 -> :sswitch_4
        -0x1368da95 -> :sswitch_3
        0x2068547f -> :sswitch_2
        0x2e369397 -> :sswitch_1
        0x48e075cc -> :sswitch_0
    .end sparse-switch
.end method
