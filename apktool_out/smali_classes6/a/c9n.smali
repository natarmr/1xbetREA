.class public final La/c9n;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/rhv0;

.field public j:F

.field public k:I

.field public l:I

.field public m:J

.field public n:B

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:La/d9n;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/d9n;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c9n;->p:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, La/c9n;->q:La/d9n;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/c9n;

    .line 2
    .line 3
    iget-object v1, p0, La/c9n;->p:Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, La/c9n;->q:La/d9n;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/c9n;-><init>(Landroid/content/Context;La/d9n;La/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/c9n;->o:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/c9n;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c9n;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c9n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v7, v5, La/c9n;->q:La/d9n;

    .line 4
    .line 5
    iget-object v8, v7, La/d9n;->q:La/t33;

    .line 6
    .line 7
    iget-object v0, v5, La/c9n;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/vne;

    .line 10
    .line 11
    sget-object v9, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v1, v5, La/c9n;->n:B

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x1

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    iget v1, v5, La/c9n;->k:I

    .line 28
    .line 29
    iget v2, v5, La/c9n;->j:F

    .line 30
    .line 31
    iget-object v3, v5, La/c9n;->i:La/rhv0;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move v13, v1

    .line 37
    move v14, v2

    .line 38
    move-object v2, v3

    .line 39
    :goto_0
    move-object v12, v0

    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :pswitch_1
    iget v1, v5, La/c9n;->k:I

    .line 43
    .line 44
    iget v2, v5, La/c9n;->j:F

    .line 45
    .line 46
    iget-object v3, v5, La/c9n;->i:La/rhv0;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    move-object v12, v0

    .line 52
    move v14, v2

    .line 53
    move-object v2, v3

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :pswitch_2
    iget v1, v5, La/c9n;->l:I

    .line 57
    .line 58
    iget-wide v2, v5, La/c9n;->m:J

    .line 59
    .line 60
    iget v4, v5, La/c9n;->k:I

    .line 61
    .line 62
    iget v6, v5, La/c9n;->j:F

    .line 63
    .line 64
    iget-object v12, v5, La/c9n;->i:La/rhv0;

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-wide v10, v2

    .line 70
    move v2, v6

    .line 71
    move-object v3, v12

    .line 72
    move v12, v1

    .line 73
    move v1, v4

    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :pswitch_3
    iget v1, v5, La/c9n;->k:I

    .line 77
    .line 78
    iget v2, v5, La/c9n;->j:F

    .line 79
    .line 80
    iget-object v3, v5, La/c9n;->i:La/rhv0;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v12, v0

    .line 86
    move v13, v1

    .line 87
    move v14, v2

    .line 88
    move-object v2, v3

    .line 89
    goto :goto_2

    .line 90
    :pswitch_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, La/csj;->b()V

    .line 94
    .line 95
    .line 96
    return-object v2

    .line 97
    :pswitch_5
    iget v0, v5, La/c9n;->j:F

    .line 98
    .line 99
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const/high16 v1, 0x3f800000    # 1.0f

    .line 107
    .line 108
    :try_start_0
    iget-object v3, v5, La/c9n;->p:Landroid/content/Context;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    const-string v4, "animator_duration_scale"

    .line 115
    .line 116
    invoke-static {v3, v4, v1}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 117
    .line 118
    .line 119
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    :catch_0
    const/4 v3, 0x0

    .line 121
    cmpg-float v3, v1, v3

    .line 122
    .line 123
    if-nez v3, :cond_2

    .line 124
    .line 125
    iget-object v0, v7, La/d9n;->p:La/d1v0;

    .line 126
    .line 127
    iget v0, v0, La/d1v0;->a:F

    .line 128
    .line 129
    new-instance v3, Ljava/lang/Float;

    .line 130
    .line 131
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 132
    .line 133
    .line 134
    iput-object v2, v5, La/c9n;->o:Ljava/lang/Object;

    .line 135
    .line 136
    iput v1, v5, La/c9n;->j:F

    .line 137
    .line 138
    iput-byte v11, v5, La/c9n;->n:B

    .line 139
    .line 140
    invoke-virtual {v8, v5, v3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v9, :cond_1

    .line 145
    .line 146
    goto/16 :goto_7

    .line 147
    .line 148
    :cond_1
    move v0, v1

    .line 149
    :goto_1
    iput-object v2, v5, La/c9n;->o:Ljava/lang/Object;

    .line 150
    .line 151
    iput v0, v5, La/c9n;->j:F

    .line 152
    .line 153
    const/4 v0, 0x2

    .line 154
    iput-byte v0, v5, La/c9n;->n:B

    .line 155
    .line 156
    invoke-static {v5}, La/qcc;->G(La/zje;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, La/wne;->a:La/wne;

    .line 160
    .line 161
    return-object v9

    .line 162
    :cond_2
    sget-object v2, La/bmd;->u:La/zfn;

    .line 163
    .line 164
    invoke-static {v7, v2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, La/rhv0;

    .line 169
    .line 170
    move-object v12, v0

    .line 171
    move v14, v1

    .line 172
    move v13, v10

    .line 173
    :goto_2
    iget-object v0, v7, La/d9n;->r:La/c4m0;

    .line 174
    .line 175
    if-eqz v0, :cond_a

    .line 176
    .line 177
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-ne v0, v11, :cond_a

    .line 182
    .line 183
    const/4 v0, 0x3

    .line 184
    if-ge v13, v0, :cond_a

    .line 185
    .line 186
    invoke-static {v12}, La/d5c;->L(La/vne;)V

    .line 187
    .line 188
    .line 189
    move-object v15, v2

    .line 190
    check-cast v15, La/yez;

    .line 191
    .line 192
    invoke-virtual {v15}, La/yez;->c()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_4

    .line 197
    .line 198
    iput-object v12, v5, La/c9n;->o:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v15, v5, La/c9n;->i:La/rhv0;

    .line 201
    .line 202
    iput v14, v5, La/c9n;->j:F

    .line 203
    .line 204
    iput v13, v5, La/c9n;->k:I

    .line 205
    .line 206
    iput-byte v0, v5, La/c9n;->n:B

    .line 207
    .line 208
    const-wide/16 v0, 0x1f4

    .line 209
    .line 210
    invoke-static {v0, v1, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v9, :cond_3

    .line 215
    .line 216
    goto/16 :goto_7

    .line 217
    .line 218
    :cond_3
    move-object v2, v15

    .line 219
    goto :goto_2

    .line 220
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    iget-wide v2, v7, La/d9n;->t:J

    .line 225
    .line 226
    sub-long v2, v0, v2

    .line 227
    .line 228
    move-object/from16 p1, v12

    .line 229
    .line 230
    const-wide/16 v11, 0xc8

    .line 231
    .line 232
    cmp-long v2, v2, v11

    .line 233
    .line 234
    if-gez v2, :cond_5

    .line 235
    .line 236
    const/4 v2, 0x1

    .line 237
    goto :goto_3

    .line 238
    :cond_5
    move v2, v10

    .line 239
    :goto_3
    iget-boolean v3, v7, La/d9n;->s:Z

    .line 240
    .line 241
    if-eqz v3, :cond_7

    .line 242
    .line 243
    if-eqz v2, :cond_7

    .line 244
    .line 245
    iget-object v3, v7, La/d9n;->q:La/t33;

    .line 246
    .line 247
    iget-object v4, v7, La/d9n;->p:La/d1v0;

    .line 248
    .line 249
    iget v4, v4, La/d1v0;->b:F

    .line 250
    .line 251
    new-instance v6, Ljava/lang/Float;

    .line 252
    .line 253
    invoke-direct {v6, v4}, Ljava/lang/Float;-><init>(F)V

    .line 254
    .line 255
    .line 256
    iget-object v4, v7, La/d9n;->p:La/d1v0;

    .line 257
    .line 258
    iget-object v4, v4, La/d1v0;->c:La/ghn;

    .line 259
    .line 260
    new-instance v11, La/uts0;

    .line 261
    .line 262
    const/16 v12, 0xbb8

    .line 263
    .line 264
    invoke-direct {v11, v12, v10, v4}, La/uts0;-><init>(IILa/ghn;)V

    .line 265
    .line 266
    .line 267
    move-object/from16 v12, p1

    .line 268
    .line 269
    iput-object v12, v5, La/c9n;->o:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v15, v5, La/c9n;->i:La/rhv0;

    .line 272
    .line 273
    iput v14, v5, La/c9n;->j:F

    .line 274
    .line 275
    iput v13, v5, La/c9n;->k:I

    .line 276
    .line 277
    iput-wide v0, v5, La/c9n;->m:J

    .line 278
    .line 279
    iput v2, v5, La/c9n;->l:I

    .line 280
    .line 281
    const/4 v4, 0x4

    .line 282
    iput-byte v4, v5, La/c9n;->n:B

    .line 283
    .line 284
    move-wide/from16 v16, v0

    .line 285
    .line 286
    move-object v0, v3

    .line 287
    const/4 v3, 0x0

    .line 288
    const/4 v4, 0x0

    .line 289
    move-object v1, v6

    .line 290
    const/16 v6, 0xc

    .line 291
    .line 292
    move v12, v2

    .line 293
    move-object v2, v11

    .line 294
    move-wide/from16 v10, v16

    .line 295
    .line 296
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-ne v0, v9, :cond_6

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_6
    move-object/from16 v0, p1

    .line 304
    .line 305
    move v1, v13

    .line 306
    move v2, v14

    .line 307
    move-object v3, v15

    .line 308
    :goto_4
    iget-object v4, v7, La/d9n;->p:La/d1v0;

    .line 309
    .line 310
    iget v4, v4, La/d1v0;->a:F

    .line 311
    .line 312
    new-instance v6, Ljava/lang/Float;

    .line 313
    .line 314
    invoke-direct {v6, v4}, Ljava/lang/Float;-><init>(F)V

    .line 315
    .line 316
    .line 317
    iput-object v0, v5, La/c9n;->o:Ljava/lang/Object;

    .line 318
    .line 319
    iput-object v3, v5, La/c9n;->i:La/rhv0;

    .line 320
    .line 321
    iput v2, v5, La/c9n;->j:F

    .line 322
    .line 323
    iput v1, v5, La/c9n;->k:I

    .line 324
    .line 325
    iput-wide v10, v5, La/c9n;->m:J

    .line 326
    .line 327
    iput v12, v5, La/c9n;->l:I

    .line 328
    .line 329
    const/4 v4, 0x5

    .line 330
    iput-byte v4, v5, La/c9n;->n:B

    .line 331
    .line 332
    invoke-virtual {v8, v5, v6}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    if-ne v4, v9, :cond_0

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :goto_5
    add-int/lit8 v13, v1, 0x1

    .line 340
    .line 341
    invoke-static {v1}, La/m0x0;->H(I)V

    .line 342
    .line 343
    .line 344
    :goto_6
    const/4 v10, 0x0

    .line 345
    const/4 v11, 0x1

    .line 346
    goto/16 :goto_2

    .line 347
    .line 348
    :cond_7
    move-wide/from16 v18, v0

    .line 349
    .line 350
    move-object/from16 v0, p1

    .line 351
    .line 352
    move-wide/from16 v20, v11

    .line 353
    .line 354
    move v12, v2

    .line 355
    move-wide/from16 v10, v18

    .line 356
    .line 357
    move-wide/from16 v1, v20

    .line 358
    .line 359
    if-eqz v3, :cond_8

    .line 360
    .line 361
    invoke-static {v7}, La/vfc;->J(La/ehl;)V

    .line 362
    .line 363
    .line 364
    :cond_8
    iput-object v0, v5, La/c9n;->o:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v15, v5, La/c9n;->i:La/rhv0;

    .line 367
    .line 368
    iput v14, v5, La/c9n;->j:F

    .line 369
    .line 370
    iput v13, v5, La/c9n;->k:I

    .line 371
    .line 372
    iput-wide v10, v5, La/c9n;->m:J

    .line 373
    .line 374
    iput v12, v5, La/c9n;->l:I

    .line 375
    .line 376
    const/4 v3, 0x6

    .line 377
    iput-byte v3, v5, La/c9n;->n:B

    .line 378
    .line 379
    invoke-static {v1, v2, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-ne v1, v9, :cond_9

    .line 384
    .line 385
    :goto_7
    return-object v9

    .line 386
    :cond_9
    move-object v2, v15

    .line 387
    goto/16 :goto_0

    .line 388
    .line 389
    :cond_a
    iget-object v0, v7, La/d9n;->o:Lkotlin/jvm/functions/Function0;

    .line 390
    .line 391
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
