.class public final La/apu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:J

.field public l:I

.field public m:B

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:J

.field public p:I

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/yje;La/edu;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/apu;->i:B

    .line 15
    iput-object p4, p0, La/apu;->s:Ljava/lang/Object;

    iput-wide p1, p0, La/apu;->o:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/wdu;JILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/apu;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/apu;->s:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/apu;->o:J

    .line 7
    .line 8
    iput p4, p0, La/apu;->p:I

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/apu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/apu;->s:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/apu;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/wdu;

    .line 12
    .line 13
    iget-wide v4, p0, La/apu;->o:J

    .line 14
    .line 15
    iget v6, p0, La/apu;->p:I

    .line 16
    .line 17
    move-object v7, p2

    .line 18
    invoke-direct/range {v2 .. v7}, La/apu;-><init>(La/wdu;JILa/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v2, La/apu;->n:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v2

    .line 24
    :pswitch_0
    move-object v7, p2

    .line 25
    new-instance p2, La/apu;

    .line 26
    .line 27
    check-cast v1, La/edu;

    .line 28
    .line 29
    iget-wide v2, p0, La/apu;->o:J

    .line 30
    .line 31
    invoke-direct {p2, v2, v3, v7, v1}, La/apu;-><init>(JLa/yje;La/edu;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p2, La/apu;->n:Ljava/lang/Object;

    .line 35
    .line 36
    return-object p2

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/apu;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/apu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/apu;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/apu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/apu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/apu;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/apu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/apu;->i:B

    .line 4
    .line 5
    iget-wide v1, v5, La/apu;->o:J

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x3

    .line 12
    iget-object v8, v5, La/apu;->s:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v8, La/wdu;

    .line 19
    .line 20
    iget-object v0, v5, La/apu;->n:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/kmq;

    .line 23
    .line 24
    sget-object v10, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-byte v11, v5, La/apu;->m:B

    .line 27
    .line 28
    const/4 v12, 0x4

    .line 29
    if-eqz v11, :cond_4

    .line 30
    .line 31
    if-eq v11, v4, :cond_3

    .line 32
    .line 33
    if-eq v11, v6, :cond_2

    .line 34
    .line 35
    if-eq v11, v7, :cond_1

    .line 36
    .line 37
    if-ne v11, v12, :cond_0

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_1
    iget-boolean v0, v5, La/apu;->j:Z

    .line 50
    .line 51
    iget-object v1, v5, La/apu;->q:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, La/kmq;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move v8, v0

    .line 59
    move-object/from16 v0, p1

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_2
    iget v0, v5, La/apu;->l:I

    .line 64
    .line 65
    iget-wide v1, v5, La/apu;->k:J

    .line 66
    .line 67
    iget-boolean v3, v5, La/apu;->j:Z

    .line 68
    .line 69
    iget-object v4, v5, La/apu;->r:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, La/u8u;

    .line 72
    .line 73
    iget-object v6, v5, La/apu;->q:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, La/kmq;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v8, v4

    .line 81
    move v4, v3

    .line 82
    move-wide v2, v1

    .line 83
    move-object v1, v6

    .line 84
    move-object/from16 v6, p1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 v3, p1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v3, v8, La/wdu;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, La/kc60;

    .line 99
    .line 100
    invoke-virtual {v3}, La/kc60;->a()La/p7m0;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iput-object v0, v5, La/apu;->n:Ljava/lang/Object;

    .line 105
    .line 106
    iput-byte v4, v5, La/apu;->m:B

    .line 107
    .line 108
    invoke-static {v3, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-ne v3, v10, :cond_5

    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_5
    :goto_0
    check-cast v3, La/sw00;

    .line 117
    .line 118
    iget-boolean v3, v3, La/sw00;->a:Z

    .line 119
    .line 120
    iget-object v4, v8, La/wdu;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v4, La/u8u;

    .line 123
    .line 124
    iget v11, v5, La/apu;->p:I

    .line 125
    .line 126
    if-eqz v3, :cond_7

    .line 127
    .line 128
    iget-object v8, v8, La/wdu;->g:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v8, La/nou;

    .line 131
    .line 132
    iput-object v9, v5, La/apu;->n:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v0, v5, La/apu;->q:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v4, v5, La/apu;->r:Ljava/lang/Object;

    .line 137
    .line 138
    iput-boolean v3, v5, La/apu;->j:Z

    .line 139
    .line 140
    iput-wide v1, v5, La/apu;->k:J

    .line 141
    .line 142
    iput v11, v5, La/apu;->l:I

    .line 143
    .line 144
    iput-byte v6, v5, La/apu;->m:B

    .line 145
    .line 146
    invoke-static {v8, v5}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    if-ne v6, v10, :cond_6

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    move-object v8, v4

    .line 154
    move v4, v3

    .line 155
    move-wide v2, v1

    .line 156
    move-object v1, v0

    .line 157
    move v0, v11

    .line 158
    :goto_1
    check-cast v6, La/ql5;

    .line 159
    .line 160
    iget-wide v13, v6, La/ql5;->e:J

    .line 161
    .line 162
    long-to-int v6, v13

    .line 163
    new-instance v11, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-direct {v11, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 166
    .line 167
    .line 168
    move-object v6, v1

    .line 169
    move-wide v1, v2

    .line 170
    move v3, v0

    .line 171
    move-object v0, v8

    .line 172
    move v8, v4

    .line 173
    move-object v4, v11

    .line 174
    goto :goto_2

    .line 175
    :cond_7
    move-object v6, v0

    .line 176
    move v8, v3

    .line 177
    move-object v0, v4

    .line 178
    move-object v4, v9

    .line 179
    move v3, v11

    .line 180
    :goto_2
    iput-object v9, v5, La/apu;->n:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v6, v5, La/apu;->q:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v9, v5, La/apu;->r:Ljava/lang/Object;

    .line 185
    .line 186
    iput-boolean v8, v5, La/apu;->j:Z

    .line 187
    .line 188
    iput-byte v7, v5, La/apu;->m:B

    .line 189
    .line 190
    invoke-virtual/range {v0 .. v5}, La/u8u;->t(JILjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-ne v0, v10, :cond_8

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    move-object v1, v6

    .line 198
    :goto_3
    iput-object v9, v5, La/apu;->n:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v9, v5, La/apu;->q:Ljava/lang/Object;

    .line 201
    .line 202
    iput-boolean v8, v5, La/apu;->j:Z

    .line 203
    .line 204
    iput-byte v12, v5, La/apu;->m:B

    .line 205
    .line 206
    invoke-interface {v1, v0, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-ne v0, v10, :cond_9

    .line 211
    .line 212
    :goto_4
    move-object v9, v10

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    :goto_5
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    :goto_6
    return-object v9

    .line 217
    :pswitch_0
    iget-object v0, v5, La/apu;->n:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, La/vne;

    .line 220
    .line 221
    sget-object v10, La/wne;->a:La/wne;

    .line 222
    .line 223
    iget-byte v11, v5, La/apu;->m:B

    .line 224
    .line 225
    if-eqz v11, :cond_c

    .line 226
    .line 227
    if-eq v11, v4, :cond_b

    .line 228
    .line 229
    if-ne v11, v6, :cond_a

    .line 230
    .line 231
    iget v0, v5, La/apu;->p:I

    .line 232
    .line 233
    iget-boolean v1, v5, La/apu;->j:Z

    .line 234
    .line 235
    iget-wide v2, v5, La/apu;->k:J

    .line 236
    .line 237
    iget v8, v5, La/apu;->l:I

    .line 238
    .line 239
    iget-object v11, v5, La/apu;->r:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v11, La/edu;

    .line 242
    .line 243
    iget-object v13, v5, La/apu;->q:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v13, La/vne;

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    move v12, v8

    .line 251
    move v8, v0

    .line 252
    move v0, v12

    .line 253
    move-object v14, v11

    .line 254
    move v11, v1

    .line 255
    move-object v1, v13

    .line 256
    move-wide v12, v2

    .line 257
    goto/16 :goto_f

    .line 258
    .line 259
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_12

    .line 263
    .line 264
    :cond_b
    iget v1, v5, La/apu;->p:I

    .line 265
    .line 266
    iget-boolean v2, v5, La/apu;->j:Z

    .line 267
    .line 268
    iget-wide v13, v5, La/apu;->k:J

    .line 269
    .line 270
    iget v3, v5, La/apu;->l:I

    .line 271
    .line 272
    iget-object v0, v5, La/apu;->r:Ljava/lang/Object;

    .line 273
    .line 274
    move-object v8, v0

    .line 275
    check-cast v8, La/edu;

    .line 276
    .line 277
    iget-object v0, v5, La/apu;->q:Ljava/lang/Object;

    .line 278
    .line 279
    move-object v11, v0

    .line 280
    check-cast v11, La/vne;

    .line 281
    .line 282
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 283
    .line 284
    .line 285
    move-object/from16 v0, p1

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :catchall_0
    move-exception v0

    .line 289
    move-object v12, v11

    .line 290
    move v11, v2

    .line 291
    move-object v2, v12

    .line 292
    move-wide v12, v13

    .line 293
    move-object v14, v8

    .line 294
    move v8, v3

    .line 295
    goto :goto_a

    .line 296
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    check-cast v8, La/edu;

    .line 300
    .line 301
    move-wide v2, v1

    .line 302
    move v11, v4

    .line 303
    move-object v14, v8

    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v13, 0x0

    .line 306
    move-object v1, v0

    .line 307
    :goto_7
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 308
    .line 309
    iput-object v9, v5, La/apu;->n:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v1, v5, La/apu;->q:Ljava/lang/Object;

    .line 312
    .line 313
    iput-object v14, v5, La/apu;->r:Ljava/lang/Object;

    .line 314
    .line 315
    iput v13, v5, La/apu;->l:I

    .line 316
    .line 317
    iput-wide v2, v5, La/apu;->k:J

    .line 318
    .line 319
    iput-boolean v11, v5, La/apu;->j:Z

    .line 320
    .line 321
    iput v8, v5, La/apu;->p:I

    .line 322
    .line 323
    iput-byte v4, v5, La/apu;->m:B

    .line 324
    .line 325
    iget-object v0, v14, La/edu;->c:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, La/qgd;

    .line 328
    .line 329
    invoke-virtual {v0, v2, v3, v5, v11}, La/qgd;->A(JLa/zje;Z)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 333
    if-ne v0, v10, :cond_d

    .line 334
    .line 335
    goto/16 :goto_e

    .line 336
    .line 337
    :cond_d
    move/from16 v16, v11

    .line 338
    .line 339
    move-object v11, v1

    .line 340
    move v1, v8

    .line 341
    move-object v8, v14

    .line 342
    move-wide/from16 v17, v2

    .line 343
    .line 344
    move/from16 v2, v16

    .line 345
    .line 346
    move v3, v13

    .line 347
    move-wide/from16 v13, v17

    .line 348
    .line 349
    :goto_8
    :try_start_2
    check-cast v0, La/toe;

    .line 350
    .line 351
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 352
    .line 353
    move-object v9, v0

    .line 354
    goto/16 :goto_11

    .line 355
    .line 356
    :goto_9
    move-wide/from16 v16, v2

    .line 357
    .line 358
    move-object v2, v1

    .line 359
    move v1, v8

    .line 360
    move v8, v13

    .line 361
    move-wide/from16 v12, v16

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :catchall_1
    move-exception v0

    .line 365
    goto :goto_9

    .line 366
    :goto_a
    if-eqz v8, :cond_e

    .line 367
    .line 368
    instance-of v15, v0, La/zhi0;

    .line 369
    .line 370
    if-eqz v15, :cond_e

    .line 371
    .line 372
    move-object v15, v0

    .line 373
    check-cast v15, La/zhi0;

    .line 374
    .line 375
    iget-boolean v15, v15, La/zhi0;->e:Z

    .line 376
    .line 377
    if-eqz v15, :cond_e

    .line 378
    .line 379
    move v15, v4

    .line 380
    goto :goto_b

    .line 381
    :cond_e
    const/4 v15, 0x0

    .line 382
    :goto_b
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 383
    .line 384
    if-nez v3, :cond_15

    .line 385
    .line 386
    instance-of v3, v0, Ljava/net/ConnectException;

    .line 387
    .line 388
    if-nez v3, :cond_15

    .line 389
    .line 390
    if-nez v15, :cond_15

    .line 391
    .line 392
    instance-of v3, v0, La/zhi0;

    .line 393
    .line 394
    if-eqz v3, :cond_11

    .line 395
    .line 396
    move-object v3, v0

    .line 397
    check-cast v3, La/zhi0;

    .line 398
    .line 399
    iget-boolean v15, v3, La/zhi0;->f:Z

    .line 400
    .line 401
    if-nez v15, :cond_10

    .line 402
    .line 403
    iget-boolean v3, v3, La/zhi0;->e:Z

    .line 404
    .line 405
    if-eqz v3, :cond_f

    .line 406
    .line 407
    goto :goto_c

    .line 408
    :cond_f
    const/4 v3, 0x0

    .line 409
    goto :goto_d

    .line 410
    :cond_10
    :goto_c
    move v3, v4

    .line 411
    goto :goto_d

    .line 412
    :cond_11
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    if-nez v3, :cond_f

    .line 417
    .line 418
    goto :goto_c

    .line 419
    :goto_d
    add-int/2addr v1, v4

    .line 420
    if-gt v1, v7, :cond_14

    .line 421
    .line 422
    if-eqz v3, :cond_12

    .line 423
    .line 424
    goto :goto_10

    .line 425
    :cond_12
    const-string v3, "error ("

    .line 426
    .line 427
    const-string v15, "): "

    .line 428
    .line 429
    invoke-static {v1, v3, v15, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 434
    .line 435
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    iput-object v9, v5, La/apu;->n:Ljava/lang/Object;

    .line 439
    .line 440
    iput-object v2, v5, La/apu;->q:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v14, v5, La/apu;->r:Ljava/lang/Object;

    .line 443
    .line 444
    iput v8, v5, La/apu;->l:I

    .line 445
    .line 446
    iput-wide v12, v5, La/apu;->k:J

    .line 447
    .line 448
    iput-boolean v11, v5, La/apu;->j:Z

    .line 449
    .line 450
    iput v1, v5, La/apu;->p:I

    .line 451
    .line 452
    iput-byte v6, v5, La/apu;->m:B

    .line 453
    .line 454
    const-wide/16 v6, 0xbb8

    .line 455
    .line 456
    invoke-static {v6, v7, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    if-ne v0, v10, :cond_13

    .line 461
    .line 462
    :goto_e
    move-object v9, v10

    .line 463
    goto :goto_12

    .line 464
    :cond_13
    move v0, v8

    .line 465
    move v8, v1

    .line 466
    move-object v1, v2

    .line 467
    :goto_f
    move-wide v2, v12

    .line 468
    const/4 v6, 0x2

    .line 469
    const/4 v7, 0x3

    .line 470
    move v13, v0

    .line 471
    goto/16 :goto_7

    .line 472
    .line 473
    :cond_14
    :goto_10
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 474
    .line 475
    new-instance v1, La/g0g0;

    .line 476
    .line 477
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 478
    .line 479
    .line 480
    move-object v9, v1

    .line 481
    :goto_11
    invoke-static {v9}, La/z1x;->P(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :goto_12
    return-object v9

    .line 485
    :cond_15
    throw v0

    .line 486
    nop

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
