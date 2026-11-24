.class public final La/a9u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:J

.field public k:I

.field public l:Z

.field public m:B

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ali;ZILjava/util/List;La/jvn;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/a9u;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/a9u;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, La/a9u;->l:Z

    .line 7
    .line 8
    iput p3, p0, La/a9u;->k:I

    .line 9
    .line 10
    iput-object p4, p0, La/a9u;->o:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/a9u;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iput-wide p6, p0, La/a9u;->j:J

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/qg20;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/a9u;->i:B

    .line 21
    iput-object p1, p0, La/a9u;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte p1, p0, La/a9u;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/a9u;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/a9u;

    .line 9
    .line 10
    check-cast v0, La/qg20;

    .line 11
    .line 12
    invoke-direct {p0, v0, p2}, La/a9u;-><init>(La/qg20;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance v1, La/a9u;

    .line 17
    .line 18
    iget-object p1, p0, La/a9u;->n:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v2, p1

    .line 21
    check-cast v2, La/ali;

    .line 22
    .line 23
    iget-boolean v3, p0, La/a9u;->l:Z

    .line 24
    .line 25
    iget v4, p0, La/a9u;->k:I

    .line 26
    .line 27
    iget-object p1, p0, La/a9u;->o:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    check-cast v5, Ljava/util/List;

    .line 31
    .line 32
    move-object v6, v0

    .line 33
    check-cast v6, La/jvn;

    .line 34
    .line 35
    iget-wide v7, p0, La/a9u;->j:J

    .line 36
    .line 37
    move-object v9, p2

    .line 38
    invoke-direct/range {v1 .. v9}, La/a9u;-><init>(La/ali;ZILjava/util/List;La/jvn;JLa/yje;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a9u;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/a9u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a9u;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a9u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/a9u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/a9u;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/a9u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-byte v0, v11, La/a9u;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    iget-object v4, v11, La/a9u;->p:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v4, La/qg20;

    .line 16
    .line 17
    iget-object v0, v4, La/qg20;->d1:La/p7m0;

    .line 18
    .line 19
    sget-object v6, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v7, v11, La/a9u;->m:B

    .line 22
    .line 23
    const/4 v8, 0x5

    .line 24
    const/4 v9, 0x4

    .line 25
    const/4 v10, 0x3

    .line 26
    if-eqz v7, :cond_5

    .line 27
    .line 28
    if-eq v7, v2, :cond_4

    .line 29
    .line 30
    if-eq v7, v3, :cond_3

    .line 31
    .line 32
    if-eq v7, v10, :cond_2

    .line 33
    .line 34
    if-eq v7, v9, :cond_1

    .line 35
    .line 36
    if-ne v7, v8, :cond_0

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_11

    .line 42
    .line 43
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_12

    .line 47
    .line 48
    :cond_1
    iget-boolean v1, v11, La/a9u;->l:Z

    .line 49
    .line 50
    iget v3, v11, La/a9u;->k:I

    .line 51
    .line 52
    iget-wide v9, v11, La/a9u;->j:J

    .line 53
    .line 54
    iget-object v7, v11, La/a9u;->o:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, La/vf7;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move v15, v1

    .line 62
    move/from16 v17, v2

    .line 63
    .line 64
    const-wide/16 v18, 0x0

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_2
    iget-boolean v1, v11, La/a9u;->l:Z

    .line 71
    .line 72
    iget v3, v11, La/a9u;->k:I

    .line 73
    .line 74
    iget-wide v9, v11, La/a9u;->j:J

    .line 75
    .line 76
    iget-object v7, v11, La/a9u;->o:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, La/vf7;

    .line 79
    .line 80
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move v15, v1

    .line 84
    move/from16 v17, v2

    .line 85
    .line 86
    const-wide/16 v18, 0x0

    .line 87
    .line 88
    move-object/from16 v1, p1

    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_3
    const-wide/16 v15, 0x0

    .line 93
    .line 94
    iget-wide v12, v11, La/a9u;->j:J

    .line 95
    .line 96
    iget-object v1, v11, La/a9u;->n:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, La/ql5;

    .line 99
    .line 100
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v3, p1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    const-wide/16 v15, 0x0

    .line 107
    .line 108
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object/from16 v1, p1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    const-wide/16 v15, 0x0

    .line 115
    .line 116
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v4, La/qg20;->c:La/khf0;

    .line 120
    .line 121
    sget-object v7, La/bm5;->i:La/bm5;

    .line 122
    .line 123
    iput-byte v2, v11, La/a9u;->m:B

    .line 124
    .line 125
    invoke-static {v1, v7, v11}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-ne v1, v6, :cond_6

    .line 130
    .line 131
    goto/16 :goto_10

    .line 132
    .line 133
    :cond_6
    :goto_0
    check-cast v1, La/ql5;

    .line 134
    .line 135
    iget-object v7, v4, La/qg20;->v0:La/ot;

    .line 136
    .line 137
    sget-object v12, La/bm5;->i:La/bm5;

    .line 138
    .line 139
    invoke-virtual {v7, v12, v1}, La/ot;->a(La/bm5;La/ql5;)V

    .line 140
    .line 141
    .line 142
    iget-wide v12, v1, La/ql5;->e:J

    .line 143
    .line 144
    iget-object v7, v4, La/qg20;->h:La/a6u;

    .line 145
    .line 146
    iput-object v1, v11, La/a9u;->n:Ljava/lang/Object;

    .line 147
    .line 148
    iput-wide v12, v11, La/a9u;->j:J

    .line 149
    .line 150
    iput-byte v3, v11, La/a9u;->m:B

    .line 151
    .line 152
    invoke-virtual {v7, v12, v13, v11}, La/a6u;->z(JLa/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-ne v3, v6, :cond_7

    .line 157
    .line 158
    goto/16 :goto_10

    .line 159
    .line 160
    :cond_7
    :goto_1
    move-object v7, v3

    .line 161
    check-cast v7, La/vf7;

    .line 162
    .line 163
    move/from16 v17, v2

    .line 164
    .line 165
    iget-wide v2, v7, La/vf7;->d:D

    .line 166
    .line 167
    cmpg-double v2, v2, v15

    .line 168
    .line 169
    if-nez v2, :cond_8

    .line 170
    .line 171
    move/from16 v2, v17

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_8
    const/4 v2, 0x0

    .line 175
    :goto_2
    xor-int/lit8 v3, v2, 0x1

    .line 176
    .line 177
    move-wide/from16 v18, v15

    .line 178
    .line 179
    iget-object v15, v4, La/qg20;->Y:La/pyu;

    .line 180
    .line 181
    invoke-virtual {v15}, La/pyu;->k()Z

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    if-eqz v15, :cond_a

    .line 186
    .line 187
    iget-object v2, v4, La/qg20;->Z:La/q4u;

    .line 188
    .line 189
    iput-object v5, v11, La/a9u;->n:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v7, v11, La/a9u;->o:Ljava/lang/Object;

    .line 192
    .line 193
    iput-wide v12, v11, La/a9u;->j:J

    .line 194
    .line 195
    iput v3, v11, La/a9u;->k:I

    .line 196
    .line 197
    iput-boolean v15, v11, La/a9u;->l:Z

    .line 198
    .line 199
    iput-byte v10, v11, La/a9u;->m:B

    .line 200
    .line 201
    iget-object v2, v2, La/q4u;->a:La/etj;

    .line 202
    .line 203
    invoke-virtual {v2, v1, v11}, La/etj;->a(La/ql5;La/yje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-ne v1, v6, :cond_9

    .line 208
    .line 209
    goto/16 :goto_10

    .line 210
    .line 211
    :cond_9
    move-wide v9, v12

    .line 212
    :goto_3
    check-cast v1, La/c3j0;

    .line 213
    .line 214
    iget-wide v1, v1, La/c3j0;->b:D

    .line 215
    .line 216
    :goto_4
    move-wide/from16 v23, v1

    .line 217
    .line 218
    move-wide v12, v9

    .line 219
    goto :goto_6

    .line 220
    :cond_a
    if-nez v2, :cond_b

    .line 221
    .line 222
    iget-wide v1, v7, La/vf7;->d:D

    .line 223
    .line 224
    move-wide/from16 v23, v1

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_b
    iget-object v1, v4, La/qg20;->E0:La/m0u;

    .line 228
    .line 229
    iput-object v5, v11, La/a9u;->n:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v7, v11, La/a9u;->o:Ljava/lang/Object;

    .line 232
    .line 233
    iput-wide v12, v11, La/a9u;->j:J

    .line 234
    .line 235
    iput v3, v11, La/a9u;->k:I

    .line 236
    .line 237
    iput-boolean v15, v11, La/a9u;->l:Z

    .line 238
    .line 239
    iput-byte v9, v11, La/a9u;->m:B

    .line 240
    .line 241
    iget-object v1, v1, La/m0u;->a:La/xr;

    .line 242
    .line 243
    invoke-virtual {v1, v12, v13, v11}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-ne v1, v6, :cond_c

    .line 248
    .line 249
    goto/16 :goto_10

    .line 250
    .line 251
    :cond_c
    move-wide v9, v12

    .line 252
    :goto_5
    check-cast v1, La/xuf;

    .line 253
    .line 254
    iget-wide v1, v1, La/xuf;->i:D

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :goto_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 262
    .line 263
    iget-wide v1, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b:D

    .line 264
    .line 265
    cmpg-double v1, v1, v23

    .line 266
    .line 267
    if-nez v1, :cond_d

    .line 268
    .line 269
    move/from16 v1, v17

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_d
    const/4 v1, 0x0

    .line 273
    :goto_7
    xor-int/lit8 v2, v1, 0x1

    .line 274
    .line 275
    iget-wide v9, v7, La/vf7;->a:J

    .line 276
    .line 277
    move-wide/from16 v20, v9

    .line 278
    .line 279
    iget-wide v8, v7, La/vf7;->b:D

    .line 280
    .line 281
    iget-object v10, v4, La/qg20;->V0:La/p7m0;

    .line 282
    .line 283
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    check-cast v10, Ljava/lang/Number;

    .line 288
    .line 289
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 290
    .line 291
    .line 292
    move-result-wide v25

    .line 293
    cmp-long v10, v20, v25

    .line 294
    .line 295
    if-nez v10, :cond_18

    .line 296
    .line 297
    cmpl-double v10, v8, v18

    .line 298
    .line 299
    if-gtz v10, :cond_e

    .line 300
    .line 301
    iget-boolean v10, v7, La/vf7;->h:Z

    .line 302
    .line 303
    if-eqz v10, :cond_18

    .line 304
    .line 305
    :cond_e
    iget-object v10, v4, La/qg20;->i:La/j9c;

    .line 306
    .line 307
    invoke-virtual {v10}, La/j9c;->a()La/q4f;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    :goto_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    move-object v14, v5

    .line 316
    check-cast v14, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 317
    .line 318
    if-nez v1, :cond_f

    .line 319
    .line 320
    move/from16 p1, v1

    .line 321
    .line 322
    move/from16 v43, v2

    .line 323
    .line 324
    move-wide/from16 v21, v23

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_f
    move/from16 p1, v1

    .line 328
    .line 329
    move/from16 v43, v2

    .line 330
    .line 331
    iget-wide v1, v14, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 332
    .line 333
    move-wide/from16 v21, v1

    .line 334
    .line 335
    :goto_9
    iget-wide v1, v7, La/vf7;->e:D

    .line 336
    .line 337
    cmpg-double v20, v1, v18

    .line 338
    .line 339
    if-nez v20, :cond_10

    .line 340
    .line 341
    move/from16 v20, v17

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_10
    const/16 v20, 0x0

    .line 345
    .line 346
    :goto_a
    xor-int/lit8 v38, v20, 0x1

    .line 347
    .line 348
    move-wide/from16 v25, v1

    .line 349
    .line 350
    iget-wide v1, v7, La/vf7;->c:D

    .line 351
    .line 352
    move-wide/from16 v27, v1

    .line 353
    .line 354
    iget-boolean v1, v7, La/vf7;->h:Z

    .line 355
    .line 356
    if-eqz v1, :cond_11

    .line 357
    .line 358
    const-wide v29, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_11
    move-wide/from16 v29, v8

    .line 365
    .line 366
    :goto_b
    new-instance v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 367
    .line 368
    move/from16 v32, v1

    .line 369
    .line 370
    iget-boolean v1, v7, La/vf7;->g:Z

    .line 371
    .line 372
    invoke-direct {v2, v8, v9, v1}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 373
    .line 374
    .line 375
    sget-object v1, La/q4f;->h:La/q4f;

    .line 376
    .line 377
    if-eq v10, v1, :cond_12

    .line 378
    .line 379
    move/from16 v35, v17

    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_12
    const/16 v35, 0x0

    .line 383
    .line 384
    :goto_c
    if-nez p1, :cond_13

    .line 385
    .line 386
    const/16 v37, 0x0

    .line 387
    .line 388
    goto :goto_d

    .line 389
    :cond_13
    iget-boolean v1, v14, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->m:Z

    .line 390
    .line 391
    move/from16 v37, v1

    .line 392
    .line 393
    :goto_d
    iget-object v1, v4, La/qg20;->U:La/j9c;

    .line 394
    .line 395
    invoke-virtual {v1}, La/j9c;->c()La/cit0;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    iget-boolean v1, v1, La/cit0;->f0:Z

    .line 400
    .line 401
    if-eqz v1, :cond_14

    .line 402
    .line 403
    sget-object v1, La/q4f;->c:La/q4f;

    .line 404
    .line 405
    if-ne v10, v1, :cond_14

    .line 406
    .line 407
    move/from16 v41, v17

    .line 408
    .line 409
    goto :goto_e

    .line 410
    :cond_14
    const/16 v41, 0x0

    .line 411
    .line 412
    :goto_e
    if-eqz v3, :cond_15

    .line 413
    .line 414
    move/from16 v33, v17

    .line 415
    .line 416
    goto :goto_f

    .line 417
    :cond_15
    const/16 v33, 0x0

    .line 418
    .line 419
    :goto_f
    const/16 v40, 0x0

    .line 420
    .line 421
    const v42, 0xcc20

    .line 422
    .line 423
    .line 424
    const/16 v31, 0x0

    .line 425
    .line 426
    const/16 v36, 0x0

    .line 427
    .line 428
    const/16 v39, 0x0

    .line 429
    .line 430
    move-object/from16 v34, v2

    .line 431
    .line 432
    move-object/from16 v20, v14

    .line 433
    .line 434
    invoke-static/range {v20 .. v42}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    move-object v2, v7

    .line 439
    move-wide/from16 v20, v8

    .line 440
    .line 441
    move-wide/from16 v7, v23

    .line 442
    .line 443
    invoke-virtual {v0, v5, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-eqz v1, :cond_17

    .line 448
    .line 449
    iget-object v1, v4, La/qg20;->l1:La/p7m0;

    .line 450
    .line 451
    :cond_16
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    move-object v2, v0

    .line 456
    check-cast v2, La/fxo;

    .line 457
    .line 458
    const/16 v5, 0xbf

    .line 459
    .line 460
    const/4 v9, 0x0

    .line 461
    invoke-static {v2, v9, v9, v9, v5}, La/fxo;->a(La/fxo;ZZZI)La/fxo;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_16

    .line 470
    .line 471
    const/4 v5, 0x0

    .line 472
    iput-object v5, v11, La/a9u;->n:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v5, v11, La/a9u;->o:Ljava/lang/Object;

    .line 475
    .line 476
    iput-wide v12, v11, La/a9u;->j:J

    .line 477
    .line 478
    iput v3, v11, La/a9u;->k:I

    .line 479
    .line 480
    iput-boolean v15, v11, La/a9u;->l:Z

    .line 481
    .line 482
    const/4 v14, 0x5

    .line 483
    iput-byte v14, v11, La/a9u;->m:B

    .line 484
    .line 485
    move/from16 v0, v43

    .line 486
    .line 487
    invoke-virtual {v4, v7, v8, v11, v0}, La/qg20;->k0(DLa/zje;Z)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    if-ne v0, v6, :cond_18

    .line 492
    .line 493
    :goto_10
    move-object v5, v6

    .line 494
    goto :goto_12

    .line 495
    :cond_17
    move/from16 v1, p1

    .line 496
    .line 497
    move-wide/from16 v23, v7

    .line 498
    .line 499
    move-wide/from16 v8, v20

    .line 500
    .line 501
    move-object v7, v2

    .line 502
    move/from16 v2, v43

    .line 503
    .line 504
    goto/16 :goto_8

    .line 505
    .line 506
    :cond_18
    :goto_11
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    :goto_12
    return-object v5

    .line 509
    :pswitch_0
    move/from16 v17, v2

    .line 510
    .line 511
    iget-object v0, v11, La/a9u;->o:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, Ljava/util/List;

    .line 514
    .line 515
    iget-object v2, v11, La/a9u;->n:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v2, La/ali;

    .line 518
    .line 519
    sget-object v13, La/wne;->a:La/wne;

    .line 520
    .line 521
    iget-byte v6, v11, La/a9u;->m:B

    .line 522
    .line 523
    if-eqz v6, :cond_1b

    .line 524
    .line 525
    move/from16 v7, v17

    .line 526
    .line 527
    if-eq v6, v7, :cond_1a

    .line 528
    .line 529
    if-ne v6, v3, :cond_19

    .line 530
    .line 531
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    move-object/from16 v0, p1

    .line 535
    .line 536
    goto/16 :goto_15

    .line 537
    .line 538
    :cond_19
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_16

    .line 542
    .line 543
    :cond_1a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    move-object/from16 v0, p1

    .line 547
    .line 548
    goto :goto_13

    .line 549
    :cond_1b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    iget-object v1, v2, La/ali;->b:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v1, La/ort;

    .line 555
    .line 556
    iget-object v1, v1, La/ort;->a:La/gst0;

    .line 557
    .line 558
    iget-object v1, v1, La/gst0;->a:La/rrt0;

    .line 559
    .line 560
    invoke-virtual {v1}, La/rrt0;->a()La/krt0;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    iget-boolean v5, v11, La/a9u;->l:Z

    .line 565
    .line 566
    iget-object v2, v2, La/ali;->c:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v2, La/wdu;

    .line 569
    .line 570
    if-eqz v5, :cond_1d

    .line 571
    .line 572
    move-object v5, v0

    .line 573
    move-object v0, v2

    .line 574
    sget-object v2, La/j700;->b:La/j700;

    .line 575
    .line 576
    iget v3, v11, La/a9u;->k:I

    .line 577
    .line 578
    move-object v6, v4

    .line 579
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    move-object v5, v6

    .line 584
    check-cast v5, La/jvn;

    .line 585
    .line 586
    iget-boolean v6, v1, La/krt0;->c:Z

    .line 587
    .line 588
    iget-wide v7, v1, La/krt0;->a:J

    .line 589
    .line 590
    sget-object v9, La/xun;->a:La/xun;

    .line 591
    .line 592
    const/4 v1, 0x1

    .line 593
    iput-byte v1, v11, La/a9u;->m:B

    .line 594
    .line 595
    const/4 v1, 0x0

    .line 596
    const/4 v10, 0x1

    .line 597
    invoke-virtual/range {v0 .. v11}, La/wdu;->k(ZLa/j700;ILjava/util/Set;La/jvn;ZJLjava/util/Set;ZLa/zje;)Ljava/io/Serializable;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    if-ne v0, v13, :cond_1c

    .line 602
    .line 603
    goto :goto_14

    .line 604
    :cond_1c
    :goto_13
    move-object v5, v0

    .line 605
    check-cast v5, Ljava/util/List;

    .line 606
    .line 607
    goto :goto_16

    .line 608
    :cond_1d
    move-object v5, v0

    .line 609
    move-object v0, v2

    .line 610
    move-object v6, v4

    .line 611
    sget-object v2, La/ygq0;->c:La/ygq0;

    .line 612
    .line 613
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    iget-boolean v5, v1, La/krt0;->b:Z

    .line 618
    .line 619
    iget-wide v7, v1, La/krt0;->a:J

    .line 620
    .line 621
    move-object v1, v6

    .line 622
    move-wide v6, v7

    .line 623
    sget-object v8, La/xun;->a:La/xun;

    .line 624
    .line 625
    new-instance v9, Ljava/lang/Long;

    .line 626
    .line 627
    const-wide/16 v14, 0x0

    .line 628
    .line 629
    invoke-direct {v9, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 630
    .line 631
    .line 632
    new-instance v10, Ljava/lang/Long;

    .line 633
    .line 634
    invoke-direct {v10, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 635
    .line 636
    .line 637
    new-instance v12, Lkotlin/Pair;

    .line 638
    .line 639
    invoke-direct {v12, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    move-object v9, v1

    .line 643
    move-object v1, v2

    .line 644
    iget v2, v11, La/a9u;->k:I

    .line 645
    .line 646
    check-cast v9, La/jvn;

    .line 647
    .line 648
    move-object v14, v4

    .line 649
    move-object v4, v9

    .line 650
    iget-wide v9, v11, La/a9u;->j:J

    .line 651
    .line 652
    iput-byte v3, v11, La/a9u;->m:B

    .line 653
    .line 654
    move-object v3, v12

    .line 655
    move-object v12, v11

    .line 656
    move-object v11, v3

    .line 657
    move-object v3, v14

    .line 658
    invoke-virtual/range {v0 .. v12}, La/wdu;->i(La/ygq0;ILjava/util/Set;La/jvn;ZJLjava/util/Set;JLkotlin/Pair;La/zje;)Ljava/io/Serializable;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    if-ne v0, v13, :cond_1e

    .line 663
    .line 664
    :goto_14
    move-object v5, v13

    .line 665
    goto :goto_16

    .line 666
    :cond_1e
    :goto_15
    move-object v5, v0

    .line 667
    check-cast v5, Ljava/util/List;

    .line 668
    .line 669
    :goto_16
    return-object v5

    .line 670
    nop

    .line 671
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
