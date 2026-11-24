.class public final La/suv;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/vuv;


# direct methods
.method public synthetic constructor <init>(La/vuv;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/suv;->i:B

    iput-object p1, p0, La/suv;->k:La/vuv;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/suv;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/suv;->k:La/vuv;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/suv;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/suv;-><init>(La/vuv;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/suv;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/suv;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/suv;-><init>(La/vuv;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/suv;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/suv;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/suv;-><init>(La/vuv;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/suv;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/suv;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/suv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/suv;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/suv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/suv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/suv;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/suv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/hdm0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/suv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/suv;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/suv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/suv;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/suv;->k:La/vuv;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, La/suv;->j:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v8, v0

    .line 15
    check-cast v8, La/uaq0;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, v3, La/vuv;->x:La/fhj;

    .line 23
    .line 24
    iget-object v5, v3, La/vuv;->o:Ljava/lang/String;

    .line 25
    .line 26
    iget-wide v6, v3, La/vuv;->p:J

    .line 27
    .line 28
    const-wide/16 v9, 0x0

    .line 29
    .line 30
    invoke-virtual/range {v4 .. v10}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 31
    .line 32
    .line 33
    move-result-object v16

    .line 34
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 35
    .line 36
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-object v11, v0

    .line 46
    check-cast v11, La/guv;

    .line 47
    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v17, 0x1f

    .line 50
    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    invoke-static/range {v11 .. v17}, La/guv;->a(La/guv;ZZLjava/util/ArrayList;La/zdm0;La/nc5;I)La/guv;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_0
    iget-object v0, v0, La/suv;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/util/List;

    .line 70
    .line 71
    sget-object v1, La/wne;->a:La/wne;

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v6, 0xa

    .line 79
    .line 80
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_d

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    add-int/lit8 v8, v2, 0x1

    .line 102
    .line 103
    if-ltz v2, :cond_c

    .line 104
    .line 105
    check-cast v7, La/mep0;

    .line 106
    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    if-eq v2, v4, :cond_1

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    goto :goto_1

    .line 113
    :cond_1
    sget-object v2, La/lgp0;->b:La/lgp0;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    sget-object v2, La/lgp0;->a:La/lgp0;

    .line 117
    .line 118
    :goto_1
    if-eqz v2, :cond_b

    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v9, v7, La/mep0;->a:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v7, v7, La/mep0;->f:Ljava/util/ArrayList;

    .line 126
    .line 127
    new-instance v10, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-static {v7, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    if-eqz v11, :cond_9

    .line 145
    .line 146
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    check-cast v11, La/y3a0;

    .line 151
    .line 152
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v14, v11, La/y3a0;->b:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v13, v11, La/y3a0;->a:Ljava/lang/String;

    .line 158
    .line 159
    iget v15, v11, La/y3a0;->c:I

    .line 160
    .line 161
    iget v12, v11, La/y3a0;->d:I

    .line 162
    .line 163
    const/16 v23, 0x0

    .line 164
    .line 165
    iget-object v5, v11, La/y3a0;->e:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v4, v11, La/y3a0;->f:La/bre;

    .line 168
    .line 169
    iget-object v6, v11, La/y3a0;->g:Ljava/lang/String;

    .line 170
    .line 171
    move-object/from16 p1, v0

    .line 172
    .line 173
    iget-object v0, v11, La/y3a0;->h:Ljava/util/List;

    .line 174
    .line 175
    move-object/from16 v18, v4

    .line 176
    .line 177
    new-instance v4, Ljava/util/ArrayList;

    .line 178
    .line 179
    move-object/from16 v17, v5

    .line 180
    .line 181
    move-object/from16 v19, v6

    .line 182
    .line 183
    const/16 v5, 0xa

    .line 184
    .line 185
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    if-eqz v6, :cond_7

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, La/noa0;

    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-object/from16 v24, v7

    .line 212
    .line 213
    move/from16 p0, v8

    .line 214
    .line 215
    iget-wide v7, v6, La/noa0;->b:D

    .line 216
    .line 217
    iget-wide v5, v6, La/noa0;->a:D

    .line 218
    .line 219
    move-object/from16 v16, v0

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    const-wide/high16 v20, 0x4059000000000000L    # 100.0

    .line 226
    .line 227
    if-eqz v0, :cond_4

    .line 228
    .line 229
    move-wide/from16 v25, v5

    .line 230
    .line 231
    const/4 v5, 0x1

    .line 232
    if-ne v0, v5, :cond_3

    .line 233
    .line 234
    sub-double v5, v20, v25

    .line 235
    .line 236
    div-double v5, v5, v20

    .line 237
    .line 238
    :goto_4
    div-double v7, v7, v20

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_3
    const-string v0, "undefined team"

    .line 242
    .line 243
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    move-object/from16 v5, v23

    .line 247
    .line 248
    goto/16 :goto_b

    .line 249
    .line 250
    :cond_4
    move-wide/from16 v25, v5

    .line 251
    .line 252
    div-double v5, v25, v20

    .line 253
    .line 254
    sub-double v7, v20, v7

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :goto_6
    const-wide/16 v20, 0x0

    .line 258
    .line 259
    cmpg-double v0, v20, v5

    .line 260
    .line 261
    const-string v22, "Value should be within a range 0.0 to 1.0"

    .line 262
    .line 263
    if-gtz v0, :cond_6

    .line 264
    .line 265
    const-wide/high16 v25, 0x3ff0000000000000L    # 1.0

    .line 266
    .line 267
    cmpg-double v0, v5, v25

    .line 268
    .line 269
    if-gtz v0, :cond_6

    .line 270
    .line 271
    cmpg-double v0, v20, v7

    .line 272
    .line 273
    if-gtz v0, :cond_5

    .line 274
    .line 275
    cmpg-double v0, v7, v25

    .line 276
    .line 277
    if-gtz v0, :cond_5

    .line 278
    .line 279
    new-instance v0, La/abj;

    .line 280
    .line 281
    double-to-float v5, v5

    .line 282
    double-to-float v6, v7

    .line 283
    invoke-direct {v0, v5, v6}, La/abj;-><init>(FF)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move/from16 v8, p0

    .line 290
    .line 291
    move-object/from16 v0, v16

    .line 292
    .line 293
    move-object/from16 v7, v24

    .line 294
    .line 295
    const/16 v5, 0xa

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_5
    invoke-static/range {v22 .. v22}, La/jf4;->o(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_6
    invoke-static/range {v22 .. v22}, La/jf4;->o(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_7
    move-object/from16 v24, v7

    .line 307
    .line 308
    move/from16 p0, v8

    .line 309
    .line 310
    iget v0, v11, La/y3a0;->d:I

    .line 311
    .line 312
    if-eqz v0, :cond_8

    .line 313
    .line 314
    const-string v5, ". "

    .line 315
    .line 316
    invoke-static {v0, v5, v14}, La/dw9;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    move-object/from16 v22, v0

    .line 321
    .line 322
    :goto_7
    move/from16 v16, v12

    .line 323
    .line 324
    goto :goto_8

    .line 325
    :cond_8
    move-object/from16 v22, v14

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :goto_8
    new-instance v12, La/z3a0;

    .line 329
    .line 330
    const/16 v21, 0x1

    .line 331
    .line 332
    move-object/from16 v20, v4

    .line 333
    .line 334
    invoke-direct/range {v12 .. v22}, La/z3a0;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;La/bre;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move/from16 v8, p0

    .line 341
    .line 342
    move-object/from16 v0, p1

    .line 343
    .line 344
    move-object/from16 v7, v24

    .line 345
    .line 346
    const/4 v4, 0x1

    .line 347
    const/16 v6, 0xa

    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :cond_9
    move-object/from16 p1, v0

    .line 352
    .line 353
    move/from16 p0, v8

    .line 354
    .line 355
    const/16 v23, 0x0

    .line 356
    .line 357
    invoke-static {v10}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sget-object v4, La/oep0;->a:[I

    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    aget v4, v4, v5

    .line 368
    .line 369
    const/4 v5, 0x1

    .line 370
    if-ne v4, v5, :cond_a

    .line 371
    .line 372
    const v4, 0x7f080642

    .line 373
    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_a
    const v4, 0x7f080641

    .line 377
    .line 378
    .line 379
    :goto_9
    new-instance v5, La/nep0;

    .line 380
    .line 381
    invoke-direct {v5, v4, v0, v9}, La/nep0;-><init>(ILa/a4x;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v0}, La/vuv;->M(Ljava/util/List;)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    new-instance v4, La/ztv;

    .line 389
    .line 390
    invoke-direct {v4, v5, v2, v0}, La/ztv;-><init>(La/nep0;La/lgp0;I)V

    .line 391
    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_b
    move-object/from16 p1, v0

    .line 395
    .line 396
    move/from16 p0, v8

    .line 397
    .line 398
    const/16 v23, 0x0

    .line 399
    .line 400
    move-object/from16 v4, v23

    .line 401
    .line 402
    :goto_a
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move/from16 v2, p0

    .line 406
    .line 407
    move-object/from16 v0, p1

    .line 408
    .line 409
    const/4 v4, 0x1

    .line 410
    const/16 v6, 0xa

    .line 411
    .line 412
    goto/16 :goto_0

    .line 413
    .line 414
    :cond_c
    const/16 v23, 0x0

    .line 415
    .line 416
    invoke-static {}, La/q3d;->p()V

    .line 417
    .line 418
    .line 419
    throw v23

    .line 420
    :cond_d
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    sget v0, La/vuv;->E:I

    .line 425
    .line 426
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 427
    .line 428
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 429
    .line 430
    :cond_e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-object v5, v0

    .line 438
    check-cast v5, La/guv;

    .line 439
    .line 440
    const/4 v10, 0x0

    .line 441
    const/16 v11, 0x31

    .line 442
    .line 443
    const/4 v6, 0x0

    .line 444
    const/4 v7, 0x0

    .line 445
    const/4 v9, 0x0

    .line 446
    invoke-static/range {v5 .. v11}, La/guv;->a(La/guv;ZZLjava/util/ArrayList;La/zdm0;La/nc5;I)La/guv;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-eqz v0, :cond_e

    .line 455
    .line 456
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    :goto_b
    return-object v5

    .line 459
    :pswitch_1
    const/16 v23, 0x0

    .line 460
    .line 461
    iget-object v8, v0, La/suv;->k:La/vuv;

    .line 462
    .line 463
    iget-object v1, v8, La/i3t0;->i:La/ocj;

    .line 464
    .line 465
    iget-object v3, v8, La/vuv;->r:La/mne;

    .line 466
    .line 467
    iget-object v0, v0, La/suv;->j:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, La/hdm0;

    .line 470
    .line 471
    sget-object v4, La/wne;->a:La/wne;

    .line 472
    .line 473
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    instance-of v4, v0, La/gdm0;

    .line 477
    .line 478
    if-eqz v4, :cond_f

    .line 479
    .line 480
    move-object v5, v0

    .line 481
    check-cast v5, La/gdm0;

    .line 482
    .line 483
    iget-object v5, v5, La/gdm0;->b:La/odm0;

    .line 484
    .line 485
    invoke-interface {v5}, La/odm0;->a()La/bom0;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    instance-of v5, v5, La/znm0;

    .line 490
    .line 491
    if-nez v5, :cond_f

    .line 492
    .line 493
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 494
    .line 495
    .line 496
    move-result-object v9

    .line 497
    iget-object v13, v3, La/mne;->b:La/dvj;

    .line 498
    .line 499
    new-instance v15, La/quv;

    .line 500
    .line 501
    move-object/from16 v6, v23

    .line 502
    .line 503
    const/4 v5, 0x1

    .line 504
    invoke-direct {v15, v8, v6, v5}, La/quv;-><init>(La/vuv;La/yje;B)V

    .line 505
    .line 506
    .line 507
    const/16 v16, 0x28

    .line 508
    .line 509
    const-wide/16 v10, 0x1e

    .line 510
    .line 511
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 512
    .line 513
    const/4 v14, 0x0

    .line 514
    invoke-static/range {v9 .. v16}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 515
    .line 516
    .line 517
    :cond_f
    if-eqz v4, :cond_15

    .line 518
    .line 519
    iget-object v4, v8, La/vuv;->w:La/qzt;

    .line 520
    .line 521
    invoke-virtual {v4}, La/qzt;->a()La/eme;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    iget-object v5, v8, La/vuv;->q:La/ctf0;

    .line 526
    .line 527
    invoke-static {v0, v4, v5}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 528
    .line 529
    .line 530
    move-result-object v13

    .line 531
    move-object v4, v0

    .line 532
    check-cast v4, La/gdm0;

    .line 533
    .line 534
    iget-object v4, v4, La/gdm0;->b:La/odm0;

    .line 535
    .line 536
    iget-object v5, v1, La/ocj;->a:La/p7m0;

    .line 537
    .line 538
    :cond_10
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    move-object v9, v6

    .line 546
    check-cast v9, La/guv;

    .line 547
    .line 548
    invoke-interface {v4}, La/odm0;->a()La/bom0;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    instance-of v10, v7, La/znm0;

    .line 553
    .line 554
    const/4 v14, 0x0

    .line 555
    const/16 v15, 0x2e

    .line 556
    .line 557
    const/4 v11, 0x0

    .line 558
    const/4 v12, 0x0

    .line 559
    invoke-static/range {v9 .. v15}, La/guv;->a(La/guv;ZZLjava/util/ArrayList;La/zdm0;La/nc5;I)La/guv;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    invoke-virtual {v5, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    if-eqz v6, :cond_10

    .line 568
    .line 569
    instance-of v5, v4, La/mdm0;

    .line 570
    .line 571
    if-eqz v5, :cond_15

    .line 572
    .line 573
    check-cast v4, La/mdm0;

    .line 574
    .line 575
    iget-object v5, v4, La/mdm0;->c:La/vfp0;

    .line 576
    .line 577
    iget-object v5, v5, La/vfp0;->a:Ljava/lang/String;

    .line 578
    .line 579
    iget-object v4, v4, La/mdm0;->g:La/bom0;

    .line 580
    .line 581
    instance-of v4, v4, La/znm0;

    .line 582
    .line 583
    iget-object v6, v8, La/vuv;->D:La/bby;

    .line 584
    .line 585
    if-eqz v4, :cond_12

    .line 586
    .line 587
    if-eqz v6, :cond_11

    .line 588
    .line 589
    invoke-interface {v6}, La/bby;->isActive()Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    const/4 v6, 0x1

    .line 594
    if-ne v4, v6, :cond_11

    .line 595
    .line 596
    goto/16 :goto_c

    .line 597
    .line 598
    :cond_11
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    const-wide/16 v6, 0x5a

    .line 603
    .line 604
    sget-object v9, La/bfn;->e:La/bfn;

    .line 605
    .line 606
    invoke-static {v6, v7, v9}, La/ibc;->w0(JLa/bfn;)J

    .line 607
    .line 608
    .line 609
    move-result-wide v14

    .line 610
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 611
    .line 612
    new-instance v6, La/vft;

    .line 613
    .line 614
    const/4 v12, 0x0

    .line 615
    const/16 v13, 0xe

    .line 616
    .line 617
    const/4 v7, 0x1

    .line 618
    const-class v9, La/vuv;

    .line 619
    .line 620
    const-string v10, "handleError"

    .line 621
    .line 622
    const-string v11, "handleError(Ljava/lang/Throwable;)V"

    .line 623
    .line 624
    invoke-direct/range {v6 .. v13}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 625
    .line 626
    .line 627
    move-wide v10, v14

    .line 628
    new-instance v14, La/puv;

    .line 629
    .line 630
    const/4 v7, 0x0

    .line 631
    invoke-direct {v14, v8, v5, v7, v2}, La/puv;-><init>(La/vuv;Ljava/lang/String;La/yje;B)V

    .line 632
    .line 633
    .line 634
    move-object v12, v3

    .line 635
    move-object v9, v4

    .line 636
    move-object v13, v6

    .line 637
    invoke-static/range {v9 .. v14}, La/sac;->Z(La/vne;JLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    iput-object v2, v8, La/vuv;->D:La/bby;

    .line 642
    .line 643
    goto :goto_c

    .line 644
    :cond_12
    const/4 v7, 0x0

    .line 645
    if-eqz v6, :cond_13

    .line 646
    .line 647
    invoke-interface {v6, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 648
    .line 649
    .line 650
    :cond_13
    iget-object v2, v8, La/vuv;->z:La/xeu;

    .line 651
    .line 652
    iget-object v2, v2, La/xeu;->a:La/dgu;

    .line 653
    .line 654
    iget-object v2, v2, La/dgu;->b:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v2, La/auv;

    .line 657
    .line 658
    iget-object v2, v2, La/auv;->a:La/qoj0;

    .line 659
    .line 660
    invoke-virtual {v2}, La/qoj0;->d()Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    if-eqz v2, :cond_15

    .line 669
    .line 670
    iget-object v2, v8, La/vuv;->D:La/bby;

    .line 671
    .line 672
    if-eqz v2, :cond_14

    .line 673
    .line 674
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    const/4 v6, 0x1

    .line 679
    if-ne v2, v6, :cond_14

    .line 680
    .line 681
    goto :goto_c

    .line 682
    :cond_14
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    iget-object v3, v3, La/mne;->a:La/rwj;

    .line 687
    .line 688
    new-instance v6, La/vft;

    .line 689
    .line 690
    const/4 v12, 0x0

    .line 691
    const/16 v13, 0xf

    .line 692
    .line 693
    const/4 v7, 0x1

    .line 694
    const-class v9, La/vuv;

    .line 695
    .line 696
    const-string v10, "handleError"

    .line 697
    .line 698
    const-string v11, "handleError(Ljava/lang/Throwable;)V"

    .line 699
    .line 700
    invoke-direct/range {v6 .. v13}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 701
    .line 702
    .line 703
    new-instance v13, La/puv;

    .line 704
    .line 705
    const/4 v7, 0x1

    .line 706
    const/4 v9, 0x0

    .line 707
    invoke-direct {v13, v8, v5, v9, v7}, La/puv;-><init>(La/vuv;Ljava/lang/String;La/yje;B)V

    .line 708
    .line 709
    .line 710
    const/16 v14, 0xa

    .line 711
    .line 712
    const/4 v11, 0x0

    .line 713
    move-object v9, v2

    .line 714
    move-object v12, v3

    .line 715
    move-object v10, v6

    .line 716
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    iput-object v2, v8, La/vuv;->D:La/bby;

    .line 721
    .line 722
    :cond_15
    :goto_c
    instance-of v0, v0, La/fdm0;

    .line 723
    .line 724
    if-eqz v0, :cond_17

    .line 725
    .line 726
    sget v0, La/vuv;->E:I

    .line 727
    .line 728
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 729
    .line 730
    :cond_16
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    move-object v2, v1

    .line 738
    check-cast v2, La/guv;

    .line 739
    .line 740
    const/4 v7, 0x0

    .line 741
    const/16 v8, 0x39

    .line 742
    .line 743
    const/4 v3, 0x0

    .line 744
    const/4 v4, 0x1

    .line 745
    const/4 v5, 0x0

    .line 746
    const/4 v6, 0x0

    .line 747
    invoke-static/range {v2 .. v8}, La/guv;->a(La/guv;ZZLjava/util/ArrayList;La/zdm0;La/nc5;I)La/guv;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    if-eqz v1, :cond_16

    .line 756
    .line 757
    :cond_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 758
    .line 759
    return-object v0

    .line 760
    nop

    .line 761
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
