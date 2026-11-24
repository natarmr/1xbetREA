.class public final synthetic La/wq90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/xcz;

.field public final synthetic b:La/a9q0;

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:La/ar90;

.field public final synthetic g:I

.field public final synthetic h:La/a9q0;

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(La/xcz;La/a9q0;JFFLa/ar90;ILa/a9q0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wq90;->a:La/xcz;

    iput-object p2, p0, La/wq90;->b:La/a9q0;

    iput-wide p3, p0, La/wq90;->c:J

    iput p5, p0, La/wq90;->d:F

    iput p6, p0, La/wq90;->e:F

    iput-object p7, p0, La/wq90;->f:La/ar90;

    iput p8, p0, La/wq90;->g:I

    iput-object p9, p0, La/wq90;->h:La/a9q0;

    iput-wide p10, p0, La/wq90;->i:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wq90;->h:La/a9q0;

    .line 4
    .line 5
    iget-wide v4, v0, La/wq90;->i:J

    .line 6
    .line 7
    move-object/from16 v6, p1

    .line 8
    .line 9
    check-cast v6, La/g7z;

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v6, La/g7z;->a:La/a6a;

    .line 15
    .line 16
    iget-object v3, v0, La/wq90;->a:La/xcz;

    .line 17
    .line 18
    invoke-virtual {v3}, La/xcz;->j()La/mcz;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v7, v3, La/mcz;->l:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    if-eqz v8, :cond_1

    .line 33
    .line 34
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    move-object v9, v8

    .line 39
    check-cast v9, La/ncz;

    .line 40
    .line 41
    iget v9, v9, La/ncz;->a:I

    .line 42
    .line 43
    iget v10, v0, La/wq90;->g:I

    .line 44
    .line 45
    if-ne v9, v10, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v8, 0x0

    .line 49
    :goto_0
    check-cast v8, La/ncz;

    .line 50
    .line 51
    iget-object v7, v0, La/wq90;->b:La/a9q0;

    .line 52
    .line 53
    iget-wide v10, v0, La/wq90;->c:J

    .line 54
    .line 55
    if-eqz v8, :cond_9

    .line 56
    .line 57
    invoke-virtual {v3}, La/mcz;->h()J

    .line 58
    .line 59
    .line 60
    move-result-wide v12

    .line 61
    const-wide v14, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v12, v14

    .line 67
    long-to-int v9, v12

    .line 68
    if-nez v9, :cond_2

    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :cond_2
    invoke-virtual {v3}, La/mcz;->h()J

    .line 73
    .line 74
    .line 75
    move-result-wide v12

    .line 76
    and-long/2addr v12, v14

    .line 77
    long-to-int v3, v12

    .line 78
    int-to-float v3, v3

    .line 79
    iget v9, v0, La/wq90;->d:F

    .line 80
    .line 81
    sub-float/2addr v3, v9

    .line 82
    const/high16 v9, 0x40000000    # 2.0f

    .line 83
    .line 84
    div-float/2addr v3, v9

    .line 85
    iget v9, v0, La/wq90;->e:F

    .line 86
    .line 87
    sub-float v12, v3, v9

    .line 88
    .line 89
    add-float/2addr v3, v9

    .line 90
    iget v9, v8, La/ncz;->p:I

    .line 91
    .line 92
    int-to-float v9, v9

    .line 93
    iget v8, v8, La/ncz;->q:I

    .line 94
    .line 95
    int-to-float v8, v8

    .line 96
    add-float/2addr v8, v9

    .line 97
    invoke-static {v12, v9}, Ljava/lang/Math;->max(FF)F

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    sub-float v20, v12, v9

    .line 102
    .line 103
    invoke-static {v3, v8}, Ljava/lang/Math;->min(FF)F

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    sub-float v23, v3, v9

    .line 108
    .line 109
    iget-object v0, v0, La/wq90;->f:La/ar90;

    .line 110
    .line 111
    instance-of v0, v0, La/yq90;

    .line 112
    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    cmpg-float v0, v23, v20

    .line 116
    .line 117
    if-gtz v0, :cond_3

    .line 118
    .line 119
    goto/16 :goto_6

    .line 120
    .line 121
    :cond_3
    const/4 v0, 0x0

    .line 122
    cmpl-float v3, v20, v0

    .line 123
    .line 124
    const/16 v13, 0x20

    .line 125
    .line 126
    if-lez v3, :cond_4

    .line 127
    .line 128
    invoke-interface {v2}, La/fhl;->d()J

    .line 129
    .line 130
    .line 131
    move-result-wide v8

    .line 132
    shr-long/2addr v8, v13

    .line 133
    long-to-int v3, v8

    .line 134
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 135
    .line 136
    .line 137
    move-result v19

    .line 138
    iget-object v3, v2, La/a6a;->b:La/nr;

    .line 139
    .line 140
    invoke-virtual {v3}, La/nr;->p()J

    .line 141
    .line 142
    .line 143
    move-result-wide v8

    .line 144
    invoke-virtual {v3}, La/nr;->i()La/x5a;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-interface {v12}, La/x5a;->l()V

    .line 149
    .line 150
    .line 151
    :try_start_0
    iget-object v12, v3, La/nr;->b:Ljava/lang/Object;

    .line 152
    .line 153
    move-object/from16 v16, v12

    .line 154
    .line 155
    check-cast v16, La/fvt0;

    .line 156
    .line 157
    const/16 v17, 0x0

    .line 158
    .line 159
    const/16 v18, 0x0

    .line 160
    .line 161
    const/16 v21, 0x1

    .line 162
    .line 163
    invoke-virtual/range {v16 .. v21}, La/fvt0;->k(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 164
    .line 165
    .line 166
    move-wide/from16 v16, v8

    .line 167
    .line 168
    const-wide/16 v8, 0x0

    .line 169
    .line 170
    const/16 v12, 0xfa

    .line 171
    .line 172
    move/from16 p0, v13

    .line 173
    .line 174
    move-wide/from16 v18, v14

    .line 175
    .line 176
    move-wide/from16 v13, v16

    .line 177
    .line 178
    :try_start_1
    invoke-static/range {v6 .. v12}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    invoke-static {v3, v13, v14}, Lc;->g(La/nr;J)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto :goto_1

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    move-wide v13, v8

    .line 189
    :goto_1
    invoke-static {v3, v13, v14}, Lc;->g(La/nr;J)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_4
    move/from16 p0, v13

    .line 194
    .line 195
    move-wide/from16 v18, v14

    .line 196
    .line 197
    :goto_2
    invoke-interface {v2}, La/fhl;->d()J

    .line 198
    .line 199
    .line 200
    move-result-wide v8

    .line 201
    and-long v8, v8, v18

    .line 202
    .line 203
    long-to-int v3, v8

    .line 204
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    cmpg-float v3, v23, v3

    .line 209
    .line 210
    if-gez v3, :cond_5

    .line 211
    .line 212
    invoke-interface {v2}, La/fhl;->d()J

    .line 213
    .line 214
    .line 215
    move-result-wide v8

    .line 216
    shr-long v8, v8, p0

    .line 217
    .line 218
    long-to-int v3, v8

    .line 219
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v24

    .line 223
    invoke-interface {v2}, La/fhl;->d()J

    .line 224
    .line 225
    .line 226
    move-result-wide v8

    .line 227
    and-long v8, v8, v18

    .line 228
    .line 229
    long-to-int v3, v8

    .line 230
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 231
    .line 232
    .line 233
    move-result v25

    .line 234
    iget-object v3, v2, La/a6a;->b:La/nr;

    .line 235
    .line 236
    invoke-virtual {v3}, La/nr;->p()J

    .line 237
    .line 238
    .line 239
    move-result-wide v13

    .line 240
    invoke-virtual {v3}, La/nr;->i()La/x5a;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    invoke-interface {v8}, La/x5a;->l()V

    .line 245
    .line 246
    .line 247
    :try_start_2
    iget-object v8, v3, La/nr;->b:Ljava/lang/Object;

    .line 248
    .line 249
    move-object/from16 v21, v8

    .line 250
    .line 251
    check-cast v21, La/fvt0;

    .line 252
    .line 253
    const/16 v22, 0x0

    .line 254
    .line 255
    const/16 v26, 0x1

    .line 256
    .line 257
    invoke-virtual/range {v21 .. v26}, La/fvt0;->k(FFFFI)V

    .line 258
    .line 259
    .line 260
    const-wide/16 v8, 0x0

    .line 261
    .line 262
    const/16 v12, 0xfa

    .line 263
    .line 264
    invoke-static/range {v6 .. v12}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 265
    .line 266
    .line 267
    invoke-static {v3, v13, v14}, Lc;->g(La/nr;J)V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :catchall_2
    move-exception v0

    .line 272
    invoke-static {v3, v13, v14}, Lc;->g(La/nr;J)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_5
    :goto_3
    cmpg-float v3, v20, v0

    .line 277
    .line 278
    if-gez v3, :cond_6

    .line 279
    .line 280
    move v9, v0

    .line 281
    goto :goto_4

    .line 282
    :cond_6
    move/from16 v9, v20

    .line 283
    .line 284
    :goto_4
    invoke-interface {v2}, La/fhl;->d()J

    .line 285
    .line 286
    .line 287
    move-result-wide v7

    .line 288
    shr-long v7, v7, p0

    .line 289
    .line 290
    long-to-int v0, v7

    .line 291
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    invoke-interface {v2}, La/fhl;->d()J

    .line 296
    .line 297
    .line 298
    move-result-wide v7

    .line 299
    and-long v7, v7, v18

    .line 300
    .line 301
    long-to-int v0, v7

    .line 302
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    cmpl-float v3, v23, v0

    .line 307
    .line 308
    if-lez v3, :cond_7

    .line 309
    .line 310
    move v11, v0

    .line 311
    goto :goto_5

    .line 312
    :cond_7
    move/from16 v11, v23

    .line 313
    .line 314
    :goto_5
    iget-object v13, v2, La/a6a;->b:La/nr;

    .line 315
    .line 316
    invoke-virtual {v13}, La/nr;->p()J

    .line 317
    .line 318
    .line 319
    move-result-wide v14

    .line 320
    invoke-virtual {v13}, La/nr;->i()La/x5a;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-interface {v0}, La/x5a;->l()V

    .line 325
    .line 326
    .line 327
    :try_start_3
    iget-object v0, v13, La/nr;->b:Ljava/lang/Object;

    .line 328
    .line 329
    move-object v7, v0

    .line 330
    check-cast v7, La/fvt0;

    .line 331
    .line 332
    const/4 v8, 0x0

    .line 333
    const/4 v12, 0x1

    .line 334
    invoke-virtual/range {v7 .. v12}, La/fvt0;->k(FFFFI)V

    .line 335
    .line 336
    .line 337
    const-wide/16 v2, 0x0

    .line 338
    .line 339
    move-object v0, v6

    .line 340
    const/16 v6, 0xfa

    .line 341
    .line 342
    invoke-static/range {v0 .. v6}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 343
    .line 344
    .line 345
    invoke-static {v13, v14, v15}, Lc;->g(La/nr;J)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :catchall_3
    move-exception v0

    .line 352
    invoke-static {v13, v14, v15}, Lc;->g(La/nr;J)V

    .line 353
    .line 354
    .line 355
    throw v0

    .line 356
    :cond_8
    :goto_6
    const-wide/16 v8, 0x0

    .line 357
    .line 358
    const/16 v12, 0xfa

    .line 359
    .line 360
    invoke-static/range {v6 .. v12}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 361
    .line 362
    .line 363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :cond_9
    :goto_7
    const-wide/16 v8, 0x0

    .line 367
    .line 368
    const/16 v12, 0xfa

    .line 369
    .line 370
    invoke-static/range {v6 .. v12}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0
.end method
