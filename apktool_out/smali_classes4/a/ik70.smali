.class public final La/ik70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public j:Z

.field public k:Z

.field public l:La/qz40;

.field public m:La/ly5;

.field public n:La/jk70;

.field public o:Ljava/lang/Object;

.field public p:La/ck70;

.field public q:Ljava/lang/String;

.field public r:D

.field public s:D

.field public t:I

.field public u:B

.field public final synthetic v:La/jk70;

.field public final synthetic w:La/ly5;


# direct methods
.method public constructor <init>(La/jk70;La/ly5;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ik70;->v:La/jk70;

    .line 2
    .line 3
    iput-object p2, p0, La/ik70;->w:La/ly5;

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
    .locals 1

    .line 1
    new-instance p1, La/ik70;

    .line 2
    .line 3
    iget-object v0, p0, La/ik70;->v:La/jk70;

    .line 4
    .line 5
    iget-object p0, p0, La/ik70;->w:La/ly5;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/ik70;-><init>(La/jk70;La/ly5;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/ik70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ik70;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ik70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/ik70;->u:B

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v8, 0x1

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    if-eq v2, v8, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    iget-boolean v2, v0, La/ik70;->k:Z

    .line 16
    .line 17
    iget-boolean v9, v0, La/ik70;->j:Z

    .line 18
    .line 19
    iget-wide v10, v0, La/ik70;->s:D

    .line 20
    .line 21
    iget v12, v0, La/ik70;->t:I

    .line 22
    .line 23
    iget-wide v13, v0, La/ik70;->r:D

    .line 24
    .line 25
    iget-boolean v15, v0, La/ik70;->i:Z

    .line 26
    .line 27
    const-wide/16 v16, 0x0

    .line 28
    .line 29
    iget-object v5, v0, La/ik70;->q:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v6, v0, La/ik70;->p:La/ck70;

    .line 32
    .line 33
    iget-object v7, v0, La/ik70;->o:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v8, v0, La/ik70;->n:La/jk70;

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    iget-object v3, v0, La/ik70;->m:La/ly5;

    .line 40
    .line 41
    iget-object v4, v0, La/ik70;->l:La/qz40;

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move/from16 v24, v2

    .line 47
    .line 48
    move-wide/from16 v26, v10

    .line 49
    .line 50
    move-wide/from16 v21, v13

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    move-object/from16 v11, p1

    .line 54
    .line 55
    :goto_0
    move-object/from16 v23, v5

    .line 56
    .line 57
    move-object/from16 v19, v6

    .line 58
    .line 59
    move/from16 v25, v9

    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_0
    const/16 v18, 0x0

    .line 64
    .line 65
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v18

    .line 71
    :cond_1
    const-wide/16 v16, 0x0

    .line 72
    .line 73
    const/16 v18, 0x0

    .line 74
    .line 75
    iget v2, v0, La/ik70;->t:I

    .line 76
    .line 77
    iget-wide v3, v0, La/ik70;->r:D

    .line 78
    .line 79
    iget-boolean v5, v0, La/ik70;->i:Z

    .line 80
    .line 81
    iget-object v6, v0, La/ik70;->p:La/ck70;

    .line 82
    .line 83
    iget-object v7, v0, La/ik70;->o:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v8, v0, La/ik70;->n:La/jk70;

    .line 86
    .line 87
    iget-object v9, v0, La/ik70;->m:La/ly5;

    .line 88
    .line 89
    iget-object v10, v0, La/ik70;->l:La/qz40;

    .line 90
    .line 91
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v11, p1

    .line 95
    .line 96
    move-wide v13, v3

    .line 97
    move-object v3, v9

    .line 98
    move-object v4, v10

    .line 99
    move-object/from16 v12, v18

    .line 100
    .line 101
    move v10, v2

    .line 102
    move v2, v5

    .line 103
    goto/16 :goto_5

    .line 104
    .line 105
    :cond_2
    const-wide/16 v16, 0x0

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, La/ik70;->v:La/jk70;

    .line 113
    .line 114
    iget-object v3, v2, La/jk70;->i:La/itt;

    .line 115
    .line 116
    invoke-virtual {v3}, La/itt;->a()D

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    cmpg-double v3, v3, v16

    .line 121
    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    iget-object v3, v2, La/jk70;->l:La/lg60;

    .line 125
    .line 126
    iget-object v4, v2, La/jk70;->k:La/l1u;

    .line 127
    .line 128
    invoke-virtual {v4}, La/l1u;->a()D

    .line 129
    .line 130
    .line 131
    move-result-wide v4

    .line 132
    invoke-virtual {v3, v4, v5}, La/lg60;->a(D)V

    .line 133
    .line 134
    .line 135
    :cond_3
    iget-object v3, v0, La/ik70;->w:La/ly5;

    .line 136
    .line 137
    iget-object v4, v3, La/ly5;->f:La/esr;

    .line 138
    .line 139
    iget-wide v5, v3, La/ly5;->a:D

    .line 140
    .line 141
    sget-object v7, La/esr;->e:La/esr;

    .line 142
    .line 143
    if-ne v4, v7, :cond_5

    .line 144
    .line 145
    cmpg-double v8, v5, v16

    .line 146
    .line 147
    if-gtz v8, :cond_5

    .line 148
    .line 149
    :cond_4
    :goto_1
    const/4 v4, 0x1

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    if-ne v4, v7, :cond_6

    .line 152
    .line 153
    cmpl-double v4, v5, v16

    .line 154
    .line 155
    if-lez v4, :cond_6

    .line 156
    .line 157
    iget-object v4, v3, La/ly5;->b:La/lnm0;

    .line 158
    .line 159
    sget-object v7, La/lnm0;->e:La/lnm0;

    .line 160
    .line 161
    if-eq v4, v7, :cond_4

    .line 162
    .line 163
    sget-object v7, La/lnm0;->b:La/lnm0;

    .line 164
    .line 165
    if-ne v4, v7, :cond_6

    .line 166
    .line 167
    iget-object v4, v2, La/jk70;->i:La/itt;

    .line 168
    .line 169
    invoke-virtual {v4}, La/itt;->a()D

    .line 170
    .line 171
    .line 172
    move-result-wide v7

    .line 173
    new-instance v4, Ljava/math/BigDecimal;

    .line 174
    .line 175
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-direct {v4, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    new-instance v5, Ljava/math/BigDecimal;

    .line 183
    .line 184
    const/4 v6, 0x2

    .line 185
    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v5}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4}, Ljava/math/BigDecimal;->doubleValue()D

    .line 193
    .line 194
    .line 195
    move-result-wide v4

    .line 196
    cmpg-double v4, v7, v4

    .line 197
    .line 198
    if-nez v4, :cond_6

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_6
    const/4 v4, 0x0

    .line 202
    :goto_2
    iget-object v5, v2, La/jk70;->z:La/p7m0;

    .line 203
    .line 204
    :goto_3
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    move-object v7, v6

    .line 209
    check-cast v7, La/ck70;

    .line 210
    .line 211
    iget-wide v8, v3, La/ly5;->a:D

    .line 212
    .line 213
    cmpl-double v10, v8, v16

    .line 214
    .line 215
    if-lez v10, :cond_7

    .line 216
    .line 217
    const/4 v10, 0x1

    .line 218
    goto :goto_4

    .line 219
    :cond_7
    const/4 v10, 0x0

    .line 220
    :goto_4
    if-eqz v4, :cond_8

    .line 221
    .line 222
    cmpg-double v11, v8, v16

    .line 223
    .line 224
    if-gtz v11, :cond_8

    .line 225
    .line 226
    iget-object v8, v2, La/jk70;->i:La/itt;

    .line 227
    .line 228
    invoke-virtual {v8}, La/itt;->a()D

    .line 229
    .line 230
    .line 231
    move-result-wide v8

    .line 232
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 233
    .line 234
    div-double/2addr v8, v11

    .line 235
    :cond_8
    iget-object v11, v2, La/jk70;->t:La/t0u;

    .line 236
    .line 237
    iput-object v5, v0, La/ik70;->l:La/qz40;

    .line 238
    .line 239
    iput-object v3, v0, La/ik70;->m:La/ly5;

    .line 240
    .line 241
    iput-object v2, v0, La/ik70;->n:La/jk70;

    .line 242
    .line 243
    iput-object v6, v0, La/ik70;->o:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v7, v0, La/ik70;->p:La/ck70;

    .line 246
    .line 247
    move-object/from16 v12, v18

    .line 248
    .line 249
    iput-object v12, v0, La/ik70;->q:Ljava/lang/String;

    .line 250
    .line 251
    iput-boolean v4, v0, La/ik70;->i:Z

    .line 252
    .line 253
    iput-wide v8, v0, La/ik70;->r:D

    .line 254
    .line 255
    iput v10, v0, La/ik70;->t:I

    .line 256
    .line 257
    const/4 v13, 0x1

    .line 258
    iput-byte v13, v0, La/ik70;->u:B

    .line 259
    .line 260
    invoke-virtual {v11, v0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    if-ne v11, v1, :cond_9

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_9
    move-object v13, v7

    .line 268
    move-object v7, v6

    .line 269
    move-object v6, v13

    .line 270
    move-wide v13, v8

    .line 271
    move-object v8, v2

    .line 272
    move v2, v4

    .line 273
    move-object v4, v5

    .line 274
    :goto_5
    move-object v5, v11

    .line 275
    check-cast v5, Ljava/lang/String;

    .line 276
    .line 277
    iget-boolean v9, v3, La/ly5;->c:Z

    .line 278
    .line 279
    iget-object v11, v8, La/jk70;->i:La/itt;

    .line 280
    .line 281
    move-wide/from16 v20, v13

    .line 282
    .line 283
    invoke-virtual {v11}, La/itt;->a()D

    .line 284
    .line 285
    .line 286
    move-result-wide v12

    .line 287
    iget-object v11, v8, La/jk70;->x:La/g1u;

    .line 288
    .line 289
    iput-object v4, v0, La/ik70;->l:La/qz40;

    .line 290
    .line 291
    iput-object v3, v0, La/ik70;->m:La/ly5;

    .line 292
    .line 293
    iput-object v8, v0, La/ik70;->n:La/jk70;

    .line 294
    .line 295
    iput-object v7, v0, La/ik70;->o:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v6, v0, La/ik70;->p:La/ck70;

    .line 298
    .line 299
    iput-object v5, v0, La/ik70;->q:Ljava/lang/String;

    .line 300
    .line 301
    iput-boolean v2, v0, La/ik70;->i:Z

    .line 302
    .line 303
    move-wide/from16 v14, v20

    .line 304
    .line 305
    iput-wide v14, v0, La/ik70;->r:D

    .line 306
    .line 307
    iput v10, v0, La/ik70;->t:I

    .line 308
    .line 309
    iput-wide v12, v0, La/ik70;->s:D

    .line 310
    .line 311
    iput-boolean v9, v0, La/ik70;->j:Z

    .line 312
    .line 313
    iput-boolean v2, v0, La/ik70;->k:Z

    .line 314
    .line 315
    move/from16 v20, v2

    .line 316
    .line 317
    const/4 v2, 0x2

    .line 318
    iput-byte v2, v0, La/ik70;->u:B

    .line 319
    .line 320
    invoke-virtual {v11}, La/g1u;->a()La/n0l;

    .line 321
    .line 322
    .line 323
    move-result-object v11

    .line 324
    if-ne v11, v1, :cond_a

    .line 325
    .line 326
    :goto_6
    return-object v1

    .line 327
    :cond_a
    move-wide/from16 v26, v12

    .line 328
    .line 329
    move-wide/from16 v21, v14

    .line 330
    .line 331
    move/from16 v15, v20

    .line 332
    .line 333
    move/from16 v24, v15

    .line 334
    .line 335
    move v12, v10

    .line 336
    goto/16 :goto_0

    .line 337
    .line 338
    :goto_7
    if-eqz v12, :cond_b

    .line 339
    .line 340
    const/16 v20, 0x1

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_b
    const/16 v20, 0x0

    .line 344
    .line 345
    :goto_8
    check-cast v11, La/n0l;

    .line 346
    .line 347
    iget v5, v11, La/n0l;->f:I

    .line 348
    .line 349
    const/4 v13, 0x1

    .line 350
    if-ne v5, v13, :cond_c

    .line 351
    .line 352
    move/from16 v29, v13

    .line 353
    .line 354
    goto :goto_9

    .line 355
    :cond_c
    const/16 v29, 0x0

    .line 356
    .line 357
    :goto_9
    const/16 v30, 0x40

    .line 358
    .line 359
    const/16 v28, 0x0

    .line 360
    .line 361
    invoke-static/range {v19 .. v30}, La/ck70;->a(La/ck70;ZDLjava/lang/String;ZZDZZI)La/ck70;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v4, La/p7m0;

    .line 366
    .line 367
    invoke-virtual {v4, v7, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_d

    .line 372
    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0

    .line 376
    :cond_d
    move-object v5, v4

    .line 377
    move-object v2, v8

    .line 378
    move v4, v15

    .line 379
    const/16 v18, 0x0

    .line 380
    .line 381
    goto/16 :goto_3
.end method
