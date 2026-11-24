.class public final La/kgu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic A:J

.field public final synthetic B:Ljava/util/List;

.field public final synthetic Y:Ljava/util/List;

.field public final synthetic Z:Ljava/lang/String;

.field public final synthetic f1:Ljava/lang/String;

.field public final synthetic g1:Ljava/lang/String;

.field public final synthetic h1:Z

.field public i:I

.field public final synthetic i1:I

.field public j:I

.field public final synthetic j1:La/sff0;

.field public k:I

.field public l:J

.field public m:J

.field public n:J

.field public o:Ljava/lang/Object;

.field public p:Ljava/util/List;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:La/sff0;

.field public u:La/dgu;

.field public v:La/kgu;

.field public w:Z

.field public x:B

.field public synthetic y:I

.field public final synthetic z:La/dgu;


# direct methods
.method public constructor <init>(La/dgu;JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/sff0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/kgu;->z:La/dgu;

    .line 2
    .line 3
    iput-wide p2, p0, La/kgu;->A:J

    .line 4
    .line 5
    iput-object p4, p0, La/kgu;->B:Ljava/util/List;

    .line 6
    .line 7
    iput-object p5, p0, La/kgu;->Y:Ljava/util/List;

    .line 8
    .line 9
    iput-object p6, p0, La/kgu;->Z:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p7, p0, La/kgu;->f1:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p8, p0, La/kgu;->g1:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p9, p0, La/kgu;->h1:Z

    .line 16
    .line 17
    iput p10, p0, La/kgu;->i1:I

    .line 18
    .line 19
    iput-object p11, p0, La/kgu;->j1:La/sff0;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/kgu;

    .line 2
    .line 3
    iget v10, p0, La/kgu;->i1:I

    .line 4
    .line 5
    iget-object v11, p0, La/kgu;->j1:La/sff0;

    .line 6
    .line 7
    iget-object v1, p0, La/kgu;->z:La/dgu;

    .line 8
    .line 9
    iget-wide v2, p0, La/kgu;->A:J

    .line 10
    .line 11
    iget-object v4, p0, La/kgu;->B:Ljava/util/List;

    .line 12
    .line 13
    iget-object v5, p0, La/kgu;->Y:Ljava/util/List;

    .line 14
    .line 15
    iget-object v6, p0, La/kgu;->Z:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v7, p0, La/kgu;->f1:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v8, p0, La/kgu;->g1:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v9, p0, La/kgu;->h1:Z

    .line 22
    .line 23
    move-object v12, p2

    .line 24
    invoke-direct/range {v0 .. v12}, La/kgu;-><init>(La/dgu;JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILa/sff0;La/yje;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    iput p0, v0, La/kgu;->y:I

    .line 34
    .line 35
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/kgu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/kgu;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/kgu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v14, v1, La/kgu;->y:I

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v0, v1, La/kgu;->x:B

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x3

    .line 12
    const/16 v18, 0x0

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    if-eq v0, v6, :cond_3

    .line 19
    .line 20
    if-eq v0, v4, :cond_2

    .line 21
    .line 22
    if-eq v0, v5, :cond_1

    .line 23
    .line 24
    if-eq v0, v3, :cond_0

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_0
    iget-object v0, v1, La/kgu;->o:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1d

    .line 40
    .line 41
    :cond_1
    iget-object v0, v1, La/kgu;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_18

    .line 49
    .line 50
    :cond_2
    iget v0, v1, La/kgu;->k:I

    .line 51
    .line 52
    iget v8, v1, La/kgu;->j:I

    .line 53
    .line 54
    iget-wide v9, v1, La/kgu;->n:J

    .line 55
    .line 56
    iget v11, v1, La/kgu;->i:I

    .line 57
    .line 58
    iget-boolean v12, v1, La/kgu;->w:Z

    .line 59
    .line 60
    iget-wide v3, v1, La/kgu;->m:J

    .line 61
    .line 62
    move/from16 v17, v8

    .line 63
    .line 64
    iget-wide v7, v1, La/kgu;->l:J

    .line 65
    .line 66
    iget-object v5, v1, La/kgu;->v:La/kgu;

    .line 67
    .line 68
    iget-object v13, v1, La/kgu;->u:La/dgu;

    .line 69
    .line 70
    iget-object v15, v1, La/kgu;->t:La/sff0;

    .line 71
    .line 72
    move/from16 v22, v6

    .line 73
    .line 74
    iget-object v6, v1, La/kgu;->s:Ljava/lang/String;

    .line 75
    .line 76
    move/from16 v23, v0

    .line 77
    .line 78
    iget-object v0, v1, La/kgu;->r:Ljava/lang/String;

    .line 79
    .line 80
    move-object/from16 v24, v0

    .line 81
    .line 82
    iget-object v0, v1, La/kgu;->q:Ljava/lang/String;

    .line 83
    .line 84
    move-object/from16 v25, v0

    .line 85
    .line 86
    iget-object v0, v1, La/kgu;->p:Ljava/util/List;

    .line 87
    .line 88
    move-object/from16 v26, v0

    .line 89
    .line 90
    iget-object v0, v1, La/kgu;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ljava/util/List;

    .line 93
    .line 94
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    move-object/from16 v16, v13

    .line 98
    .line 99
    move-object v13, v6

    .line 100
    move-object/from16 v6, v16

    .line 101
    .line 102
    move/from16 v28, v11

    .line 103
    .line 104
    move/from16 v20, v12

    .line 105
    .line 106
    move-wide v11, v3

    .line 107
    move-object v3, v2

    .line 108
    move-object v2, v15

    .line 109
    move/from16 v15, v23

    .line 110
    .line 111
    move/from16 v23, v17

    .line 112
    .line 113
    move-wide/from16 v16, v9

    .line 114
    .line 115
    move-object/from16 v10, v26

    .line 116
    .line 117
    move-object v9, v1

    .line 118
    goto/16 :goto_13

    .line 119
    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object v3, v2

    .line 122
    move-wide v5, v9

    .line 123
    const/4 v4, 0x0

    .line 124
    move-object v9, v1

    .line 125
    goto/16 :goto_1b

    .line 126
    .line 127
    :cond_3
    move/from16 v22, v6

    .line 128
    .line 129
    iget v3, v1, La/kgu;->k:I

    .line 130
    .line 131
    iget v4, v1, La/kgu;->j:I

    .line 132
    .line 133
    iget-wide v5, v1, La/kgu;->n:J

    .line 134
    .line 135
    iget v7, v1, La/kgu;->i:I

    .line 136
    .line 137
    iget-boolean v8, v1, La/kgu;->w:Z

    .line 138
    .line 139
    iget-wide v9, v1, La/kgu;->m:J

    .line 140
    .line 141
    iget-wide v11, v1, La/kgu;->l:J

    .line 142
    .line 143
    iget-object v13, v1, La/kgu;->v:La/kgu;

    .line 144
    .line 145
    iget-object v15, v1, La/kgu;->u:La/dgu;

    .line 146
    .line 147
    move-object/from16 v17, v2

    .line 148
    .line 149
    iget-object v2, v1, La/kgu;->t:La/sff0;

    .line 150
    .line 151
    move-object/from16 v23, v2

    .line 152
    .line 153
    iget-object v2, v1, La/kgu;->s:Ljava/lang/String;

    .line 154
    .line 155
    move-object/from16 v24, v2

    .line 156
    .line 157
    iget-object v2, v1, La/kgu;->r:Ljava/lang/String;

    .line 158
    .line 159
    move-object/from16 v25, v2

    .line 160
    .line 161
    iget-object v2, v1, La/kgu;->q:Ljava/lang/String;

    .line 162
    .line 163
    move-object/from16 v26, v2

    .line 164
    .line 165
    iget-object v2, v1, La/kgu;->p:Ljava/util/List;

    .line 166
    .line 167
    iget-object v0, v1, La/kgu;->o:Ljava/lang/Object;

    .line 168
    .line 169
    move-object/from16 v27, v0

    .line 170
    .line 171
    check-cast v27, Ljava/util/List;

    .line 172
    .line 173
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    .line 175
    .line 176
    move-object/from16 v0, p1

    .line 177
    .line 178
    move/from16 v30, v8

    .line 179
    .line 180
    move-wide/from16 v31, v11

    .line 181
    .line 182
    move-object/from16 v8, v25

    .line 183
    .line 184
    move-wide v11, v9

    .line 185
    move-object v9, v1

    .line 186
    move v10, v7

    .line 187
    move-object/from16 v1, v17

    .line 188
    .line 189
    move-object/from16 v7, v26

    .line 190
    .line 191
    goto/16 :goto_2

    .line 192
    .line 193
    :catchall_1
    move-exception v0

    .line 194
    move/from16 p1, v3

    .line 195
    .line 196
    move/from16 v16, v4

    .line 197
    .line 198
    move-wide/from16 v33, v5

    .line 199
    .line 200
    move/from16 v19, v7

    .line 201
    .line 202
    move-object v4, v15

    .line 203
    move-object/from16 v7, v26

    .line 204
    .line 205
    move-object/from16 v5, v27

    .line 206
    .line 207
    move-object v6, v2

    .line 208
    move v15, v8

    .line 209
    move-wide v2, v11

    .line 210
    move-object/from16 v8, v25

    .line 211
    .line 212
    move-wide v11, v9

    .line 213
    move-object/from16 v10, v24

    .line 214
    .line 215
    move-object v9, v1

    .line 216
    move-object v1, v13

    .line 217
    move-object/from16 v13, v23

    .line 218
    .line 219
    goto/16 :goto_e

    .line 220
    .line 221
    :cond_4
    move-object/from16 v17, v2

    .line 222
    .line 223
    move/from16 v22, v6

    .line 224
    .line 225
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    if-nez v14, :cond_5

    .line 229
    .line 230
    const-wide/16 v2, 0x3e8

    .line 231
    .line 232
    goto :goto_0

    .line 233
    :cond_5
    const-wide/16 v2, 0x0

    .line 234
    .line 235
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 236
    .line 237
    .line 238
    move-result-wide v4

    .line 239
    iget-object v0, v1, La/kgu;->z:La/dgu;

    .line 240
    .line 241
    iget-wide v6, v1, La/kgu;->A:J

    .line 242
    .line 243
    iget-object v8, v1, La/kgu;->B:Ljava/util/List;

    .line 244
    .line 245
    iget-object v9, v1, La/kgu;->Y:Ljava/util/List;

    .line 246
    .line 247
    iget-object v10, v1, La/kgu;->Z:Ljava/lang/String;

    .line 248
    .line 249
    iget-object v11, v1, La/kgu;->f1:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v12, v1, La/kgu;->g1:Ljava/lang/String;

    .line 252
    .line 253
    iget-boolean v13, v1, La/kgu;->h1:Z

    .line 254
    .line 255
    iget v15, v1, La/kgu;->i1:I

    .line 256
    .line 257
    move-object/from16 v23, v0

    .line 258
    .line 259
    iget-object v0, v1, La/kgu;->j1:La/sff0;

    .line 260
    .line 261
    move-wide/from16 v24, v4

    .line 262
    .line 263
    move/from16 v28, v15

    .line 264
    .line 265
    move/from16 p1, v18

    .line 266
    .line 267
    move-object v5, v1

    .line 268
    move-wide v3, v2

    .line 269
    move v15, v13

    .line 270
    move-object v2, v0

    .line 271
    move-object v13, v12

    .line 272
    move-object v12, v11

    .line 273
    move-object v11, v10

    .line 274
    move-object v10, v9

    .line 275
    move-object v9, v8

    .line 276
    move-wide v7, v6

    .line 277
    move-object/from16 v6, v23

    .line 278
    .line 279
    move/from16 v23, p1

    .line 280
    .line 281
    :goto_1
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 282
    .line 283
    :try_start_3
    iget-object v0, v6, La/dgu;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, La/lbu;

    .line 286
    .line 287
    move-object/from16 v26, v0

    .line 288
    .line 289
    iget-object v0, v6, La/dgu;->b:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, La/ntu;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_d

    .line 292
    .line 293
    :try_start_4
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_c

    .line 297
    move-object/from16 v27, v0

    .line 298
    .line 299
    :try_start_5
    iget-object v0, v6, La/dgu;->a:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, La/xoc;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    .line 302
    .line 303
    :try_start_6
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v29
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    .line 307
    move/from16 v30, v15

    .line 308
    .line 309
    xor-int/lit8 v15, v29, 0x1

    .line 310
    .line 311
    :try_start_7
    invoke-virtual {v0, v15}, La/xoc;->a(Z)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    iget-object v15, v2, La/sff0;->b:La/hl1;

    .line 316
    .line 317
    iget-boolean v15, v15, La/hl1;->N:Z

    .line 318
    .line 319
    iput-object v9, v1, La/kgu;->o:Ljava/lang/Object;

    .line 320
    .line 321
    iput-object v10, v1, La/kgu;->p:Ljava/util/List;

    .line 322
    .line 323
    iput-object v11, v1, La/kgu;->q:Ljava/lang/String;

    .line 324
    .line 325
    iput-object v12, v1, La/kgu;->r:Ljava/lang/String;

    .line 326
    .line 327
    iput-object v13, v1, La/kgu;->s:Ljava/lang/String;

    .line 328
    .line 329
    iput-object v2, v1, La/kgu;->t:La/sff0;

    .line 330
    .line 331
    iput-object v6, v1, La/kgu;->u:La/dgu;

    .line 332
    .line 333
    iput-object v5, v1, La/kgu;->v:La/kgu;

    .line 334
    .line 335
    iput v14, v1, La/kgu;->y:I

    .line 336
    .line 337
    iput-wide v3, v1, La/kgu;->l:J

    .line 338
    .line 339
    iput-wide v7, v1, La/kgu;->m:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    .line 340
    .line 341
    move-object/from16 v29, v2

    .line 342
    .line 343
    move/from16 v2, v30

    .line 344
    .line 345
    :try_start_8
    iput-boolean v2, v1, La/kgu;->w:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    .line 346
    .line 347
    move/from16 v30, v2

    .line 348
    .line 349
    move/from16 v2, v28

    .line 350
    .line 351
    :try_start_9
    iput v2, v1, La/kgu;->i:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 352
    .line 353
    move-wide/from16 v31, v3

    .line 354
    .line 355
    move v4, v2

    .line 356
    move-wide/from16 v2, v24

    .line 357
    .line 358
    :try_start_a
    iput-wide v2, v1, La/kgu;->n:J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 359
    .line 360
    move-wide/from16 v24, v2

    .line 361
    .line 362
    move/from16 v2, v23

    .line 363
    .line 364
    :try_start_b
    iput v2, v1, La/kgu;->j:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 365
    .line 366
    move/from16 v3, p1

    .line 367
    .line 368
    :try_start_c
    iput v3, v1, La/kgu;->k:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 369
    .line 370
    move/from16 v23, v2

    .line 371
    .line 372
    move/from16 v2, v22

    .line 373
    .line 374
    :try_start_d
    iput-byte v2, v1, La/kgu;->x:B
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 375
    .line 376
    move-object/from16 p1, v0

    .line 377
    .line 378
    move-object/from16 v2, v26

    .line 379
    .line 380
    :try_start_e
    iget-object v0, v2, La/lbu;->c:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, La/n31;

    .line 383
    .line 384
    iget-object v2, v2, La/lbu;->b:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v2, La/j1q0;

    .line 387
    .line 388
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 389
    .line 390
    invoke-virtual {v2}, La/m1q0;->a()Z

    .line 391
    .line 392
    .line 393
    move-result v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 394
    move-object/from16 v16, v17

    .line 395
    .line 396
    move-object/from16 v17, v1

    .line 397
    .line 398
    move-object/from16 v1, v16

    .line 399
    .line 400
    move/from16 v21, v3

    .line 401
    .line 402
    move-object/from16 v19, v5

    .line 403
    .line 404
    move-object v5, v9

    .line 405
    move/from16 v16, v15

    .line 406
    .line 407
    move/from16 v20, v23

    .line 408
    .line 409
    move/from16 v15, v30

    .line 410
    .line 411
    const/16 v22, 0x1

    .line 412
    .line 413
    move v9, v2

    .line 414
    move-object/from16 v23, v6

    .line 415
    .line 416
    move-object v6, v10

    .line 417
    move-object v10, v13

    .line 418
    move-object v2, v0

    .line 419
    move v13, v4

    .line 420
    move-wide v3, v7

    .line 421
    move-object v7, v11

    .line 422
    move-object v8, v12

    .line 423
    move-object/from16 v12, v27

    .line 424
    .line 425
    move-object/from16 v11, p1

    .line 426
    .line 427
    :try_start_f
    invoke-virtual/range {v2 .. v17}, La/n31;->a(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLa/zje;)Ljava/io/Serializable;

    .line 428
    .line 429
    .line 430
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 431
    move v2, v13

    .line 432
    move/from16 v30, v15

    .line 433
    .line 434
    move-object/from16 v9, v17

    .line 435
    .line 436
    if-ne v0, v1, :cond_6

    .line 437
    .line 438
    move-object v3, v1

    .line 439
    goto/16 :goto_1c

    .line 440
    .line 441
    :cond_6
    move-wide v11, v3

    .line 442
    move-object/from16 v27, v5

    .line 443
    .line 444
    move-object/from16 v13, v19

    .line 445
    .line 446
    move/from16 v4, v20

    .line 447
    .line 448
    move/from16 v3, v21

    .line 449
    .line 450
    move-object/from16 v15, v23

    .line 451
    .line 452
    move-object/from16 v23, v29

    .line 453
    .line 454
    move-object/from16 v35, v10

    .line 455
    .line 456
    move v10, v2

    .line 457
    move-object v2, v6

    .line 458
    move-wide/from16 v5, v24

    .line 459
    .line 460
    move-object/from16 v24, v35

    .line 461
    .line 462
    :goto_2
    :try_start_10
    check-cast v0, Ljava/util/List;

    .line 463
    .line 464
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 465
    .line 466
    move-object v3, v1

    .line 467
    move-wide/from16 v7, v31

    .line 468
    .line 469
    goto/16 :goto_17

    .line 470
    .line 471
    :catchall_2
    move-exception v0

    .line 472
    move-object/from16 v17, v1

    .line 473
    .line 474
    move/from16 p1, v3

    .line 475
    .line 476
    move/from16 v16, v4

    .line 477
    .line 478
    move-wide/from16 v33, v5

    .line 479
    .line 480
    move/from16 v19, v10

    .line 481
    .line 482
    move-object v1, v13

    .line 483
    move-object v4, v15

    .line 484
    move-object/from16 v13, v23

    .line 485
    .line 486
    move-object/from16 v10, v24

    .line 487
    .line 488
    move-object/from16 v5, v27

    .line 489
    .line 490
    move/from16 v15, v30

    .line 491
    .line 492
    move-object v6, v2

    .line 493
    :goto_3
    move-wide/from16 v2, v31

    .line 494
    .line 495
    goto/16 :goto_e

    .line 496
    .line 497
    :catchall_3
    move-exception v0

    .line 498
    move v2, v13

    .line 499
    move/from16 v30, v15

    .line 500
    .line 501
    move-object/from16 v9, v17

    .line 502
    .line 503
    goto :goto_5

    .line 504
    :catchall_4
    move-exception v0

    .line 505
    move/from16 v21, v3

    .line 506
    .line 507
    move v2, v4

    .line 508
    move-object/from16 v19, v5

    .line 509
    .line 510
    move-wide v3, v7

    .line 511
    move-object v5, v9

    .line 512
    move-object v7, v11

    .line 513
    move-object v8, v12

    .line 514
    move/from16 v20, v23

    .line 515
    .line 516
    const/16 v22, 0x1

    .line 517
    .line 518
    :goto_4
    move-object v9, v1

    .line 519
    move-object/from16 v23, v6

    .line 520
    .line 521
    move-object v6, v10

    .line 522
    move-object v10, v13

    .line 523
    move-object/from16 v1, v17

    .line 524
    .line 525
    :goto_5
    move-object/from16 v17, v1

    .line 526
    .line 527
    :goto_6
    move-wide v11, v3

    .line 528
    move-object/from16 v1, v19

    .line 529
    .line 530
    move/from16 v16, v20

    .line 531
    .line 532
    move/from16 p1, v21

    .line 533
    .line 534
    :goto_7
    move-object/from16 v4, v23

    .line 535
    .line 536
    move-wide/from16 v33, v24

    .line 537
    .line 538
    move-object/from16 v13, v29

    .line 539
    .line 540
    move/from16 v15, v30

    .line 541
    .line 542
    :goto_8
    move/from16 v19, v2

    .line 543
    .line 544
    goto :goto_3

    .line 545
    :catchall_5
    move-exception v0

    .line 546
    move/from16 v22, v2

    .line 547
    .line 548
    move/from16 v21, v3

    .line 549
    .line 550
    move v2, v4

    .line 551
    move-object/from16 v19, v5

    .line 552
    .line 553
    move-wide v3, v7

    .line 554
    move-object v5, v9

    .line 555
    move-object v7, v11

    .line 556
    move-object v8, v12

    .line 557
    move/from16 v20, v23

    .line 558
    .line 559
    move-object v9, v1

    .line 560
    move-object/from16 v23, v6

    .line 561
    .line 562
    move-object v6, v10

    .line 563
    move-object v10, v13

    .line 564
    :goto_9
    move-object/from16 v1, v17

    .line 565
    .line 566
    goto :goto_6

    .line 567
    :catchall_6
    move-exception v0

    .line 568
    move/from16 v20, v2

    .line 569
    .line 570
    move/from16 v21, v3

    .line 571
    .line 572
    move v2, v4

    .line 573
    move-object/from16 v19, v5

    .line 574
    .line 575
    move-object/from16 v23, v6

    .line 576
    .line 577
    move-wide v3, v7

    .line 578
    move-object v5, v9

    .line 579
    move-object v6, v10

    .line 580
    move-object v7, v11

    .line 581
    move-object v8, v12

    .line 582
    move-object v10, v13

    .line 583
    move-object v9, v1

    .line 584
    goto :goto_9

    .line 585
    :catchall_7
    move-exception v0

    .line 586
    move/from16 v21, p1

    .line 587
    .line 588
    move/from16 v20, v2

    .line 589
    .line 590
    move v2, v4

    .line 591
    move-object/from16 v19, v5

    .line 592
    .line 593
    move-object/from16 v23, v6

    .line 594
    .line 595
    move-wide v3, v7

    .line 596
    move-object v5, v9

    .line 597
    move-object v6, v10

    .line 598
    move-object v7, v11

    .line 599
    move-object v8, v12

    .line 600
    move-object v10, v13

    .line 601
    move-object v9, v1

    .line 602
    :goto_a
    move-object/from16 v1, v17

    .line 603
    .line 604
    move-wide v11, v3

    .line 605
    move-object/from16 v1, v19

    .line 606
    .line 607
    move/from16 v16, v20

    .line 608
    .line 609
    goto :goto_7

    .line 610
    :catchall_8
    move-exception v0

    .line 611
    move/from16 v21, p1

    .line 612
    .line 613
    move-wide/from16 v24, v2

    .line 614
    .line 615
    move v2, v4

    .line 616
    :goto_b
    move-object/from16 v19, v5

    .line 617
    .line 618
    move-wide v3, v7

    .line 619
    move-object v5, v9

    .line 620
    move-object v7, v11

    .line 621
    move-object v8, v12

    .line 622
    move/from16 v20, v23

    .line 623
    .line 624
    :goto_c
    move-object v9, v1

    .line 625
    move-object/from16 v23, v6

    .line 626
    .line 627
    move-object v6, v10

    .line 628
    move-object v10, v13

    .line 629
    goto :goto_a

    .line 630
    :catchall_9
    move-exception v0

    .line 631
    move/from16 v21, p1

    .line 632
    .line 633
    move-wide/from16 v31, v3

    .line 634
    .line 635
    goto :goto_b

    .line 636
    :catchall_a
    move-exception v0

    .line 637
    move/from16 v21, p1

    .line 638
    .line 639
    move/from16 v30, v2

    .line 640
    .line 641
    :goto_d
    move-wide/from16 v31, v3

    .line 642
    .line 643
    move-object/from16 v19, v5

    .line 644
    .line 645
    move-wide v3, v7

    .line 646
    move-object v5, v9

    .line 647
    move-object v7, v11

    .line 648
    move-object v8, v12

    .line 649
    move/from16 v20, v23

    .line 650
    .line 651
    move/from16 v2, v28

    .line 652
    .line 653
    goto :goto_c

    .line 654
    :catchall_b
    move-exception v0

    .line 655
    move/from16 v21, p1

    .line 656
    .line 657
    move-object/from16 v29, v2

    .line 658
    .line 659
    goto :goto_d

    .line 660
    :catchall_c
    move-exception v0

    .line 661
    move/from16 v21, p1

    .line 662
    .line 663
    move-object/from16 v29, v2

    .line 664
    .line 665
    move-wide/from16 v31, v3

    .line 666
    .line 667
    move-object/from16 v19, v5

    .line 668
    .line 669
    move-wide v3, v7

    .line 670
    move-object v5, v9

    .line 671
    move-object v7, v11

    .line 672
    move-object v8, v12

    .line 673
    move/from16 v30, v15

    .line 674
    .line 675
    move/from16 v20, v23

    .line 676
    .line 677
    move/from16 v2, v28

    .line 678
    .line 679
    move-object v9, v1

    .line 680
    move-object/from16 v23, v6

    .line 681
    .line 682
    move-object v6, v10

    .line 683
    move-object v10, v13

    .line 684
    move-object/from16 v1, v17

    .line 685
    .line 686
    move-wide v11, v3

    .line 687
    move-object/from16 v1, v19

    .line 688
    .line 689
    move/from16 v16, v20

    .line 690
    .line 691
    move-object/from16 v4, v23

    .line 692
    .line 693
    move-wide/from16 v33, v24

    .line 694
    .line 695
    move-object/from16 v13, v29

    .line 696
    .line 697
    goto/16 :goto_8

    .line 698
    .line 699
    :catchall_d
    move-exception v0

    .line 700
    move/from16 v21, p1

    .line 701
    .line 702
    move-object/from16 v29, v2

    .line 703
    .line 704
    move-wide/from16 v31, v3

    .line 705
    .line 706
    move-object/from16 v19, v5

    .line 707
    .line 708
    move-wide v3, v7

    .line 709
    move-object v5, v9

    .line 710
    move-object v7, v11

    .line 711
    move-object v8, v12

    .line 712
    move/from16 v30, v15

    .line 713
    .line 714
    move/from16 v20, v23

    .line 715
    .line 716
    move/from16 v2, v28

    .line 717
    .line 718
    goto/16 :goto_4

    .line 719
    .line 720
    :goto_e
    if-eqz v16, :cond_7

    .line 721
    .line 722
    move/from16 v20, v15

    .line 723
    .line 724
    :try_start_11
    instance-of v15, v0, La/zhi0;

    .line 725
    .line 726
    if-eqz v15, :cond_8

    .line 727
    .line 728
    move-object v15, v0

    .line 729
    check-cast v15, La/zhi0;

    .line 730
    .line 731
    iget-boolean v15, v15, La/zhi0;->e:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 732
    .line 733
    if-eqz v15, :cond_8

    .line 734
    .line 735
    move/from16 v21, v22

    .line 736
    .line 737
    goto :goto_10

    .line 738
    :catchall_e
    move-exception v0

    .line 739
    move-wide v7, v2

    .line 740
    move-object/from16 v3, v17

    .line 741
    .line 742
    move-wide/from16 v5, v33

    .line 743
    .line 744
    :goto_f
    const/4 v4, 0x0

    .line 745
    goto/16 :goto_1b

    .line 746
    .line 747
    :cond_7
    move/from16 v20, v15

    .line 748
    .line 749
    :cond_8
    move/from16 v21, v18

    .line 750
    .line 751
    :goto_10
    :try_start_12
    instance-of v15, v0, Ljava/util/concurrent/CancellationException;

    .line 752
    .line 753
    if-nez v15, :cond_10

    .line 754
    .line 755
    instance-of v15, v0, Ljava/net/ConnectException;

    .line 756
    .line 757
    if-nez v15, :cond_10

    .line 758
    .line 759
    if-nez v21, :cond_10

    .line 760
    .line 761
    instance-of v15, v0, La/zhi0;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_15

    .line 762
    .line 763
    if-eqz v15, :cond_b

    .line 764
    .line 765
    :try_start_13
    move-object v15, v0

    .line 766
    check-cast v15, La/zhi0;

    .line 767
    .line 768
    iget-boolean v15, v15, La/zhi0;->f:Z

    .line 769
    .line 770
    if-nez v15, :cond_a

    .line 771
    .line 772
    move-object v15, v0

    .line 773
    check-cast v15, La/zhi0;

    .line 774
    .line 775
    iget-boolean v15, v15, La/zhi0;->e:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 776
    .line 777
    if-eqz v15, :cond_9

    .line 778
    .line 779
    goto :goto_11

    .line 780
    :cond_9
    move/from16 v21, v18

    .line 781
    .line 782
    goto :goto_12

    .line 783
    :cond_a
    :goto_11
    move/from16 v21, v22

    .line 784
    .line 785
    goto :goto_12

    .line 786
    :cond_b
    :try_start_14
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 787
    .line 788
    .line 789
    move-result v15
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_15

    .line 790
    if-nez v15, :cond_9

    .line 791
    .line 792
    goto :goto_11

    .line 793
    :goto_12
    add-int/lit8 v15, p1, 0x1

    .line 794
    .line 795
    move-wide/from16 v23, v11

    .line 796
    .line 797
    const/4 v11, 0x3

    .line 798
    if-gt v15, v11, :cond_c

    .line 799
    .line 800
    if-eqz v21, :cond_d

    .line 801
    .line 802
    :cond_c
    move-wide/from16 v23, v2

    .line 803
    .line 804
    move-object/from16 v3, v17

    .line 805
    .line 806
    move-wide/from16 v25, v33

    .line 807
    .line 808
    goto/16 :goto_16

    .line 809
    .line 810
    :cond_d
    :try_start_15
    new-instance v12, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 813
    .line 814
    .line 815
    const-string v11, "error ("

    .line 816
    .line 817
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    const-string v11, "): "

    .line 824
    .line 825
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 836
    .line 837
    invoke-virtual {v11, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    iput-object v5, v9, La/kgu;->o:Ljava/lang/Object;

    .line 841
    .line 842
    iput-object v6, v9, La/kgu;->p:Ljava/util/List;

    .line 843
    .line 844
    iput-object v7, v9, La/kgu;->q:Ljava/lang/String;

    .line 845
    .line 846
    iput-object v8, v9, La/kgu;->r:Ljava/lang/String;

    .line 847
    .line 848
    iput-object v10, v9, La/kgu;->s:Ljava/lang/String;

    .line 849
    .line 850
    iput-object v13, v9, La/kgu;->t:La/sff0;

    .line 851
    .line 852
    iput-object v4, v9, La/kgu;->u:La/dgu;

    .line 853
    .line 854
    iput-object v1, v9, La/kgu;->v:La/kgu;

    .line 855
    .line 856
    iput v14, v9, La/kgu;->y:I

    .line 857
    .line 858
    iput-wide v2, v9, La/kgu;->l:J

    .line 859
    .line 860
    move-wide/from16 v11, v23

    .line 861
    .line 862
    iput-wide v11, v9, La/kgu;->m:J

    .line 863
    .line 864
    move/from16 v0, v20

    .line 865
    .line 866
    iput-boolean v0, v9, La/kgu;->w:Z

    .line 867
    .line 868
    move/from16 v20, v0

    .line 869
    .line 870
    move/from16 v0, v19

    .line 871
    .line 872
    iput v0, v9, La/kgu;->i:I
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_11

    .line 873
    .line 874
    move-wide/from16 v23, v2

    .line 875
    .line 876
    move-wide/from16 v2, v33

    .line 877
    .line 878
    :try_start_16
    iput-wide v2, v9, La/kgu;->n:J

    .line 879
    .line 880
    move/from16 v19, v0

    .line 881
    .line 882
    move/from16 v0, v16

    .line 883
    .line 884
    iput v0, v9, La/kgu;->j:I

    .line 885
    .line 886
    iput v15, v9, La/kgu;->k:I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 887
    .line 888
    move-wide/from16 v25, v2

    .line 889
    .line 890
    const/4 v2, 0x2

    .line 891
    :try_start_17
    iput-byte v2, v9, La/kgu;->x:B

    .line 892
    .line 893
    const-wide/16 v2, 0xbb8

    .line 894
    .line 895
    invoke-static {v2, v3, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_f

    .line 899
    move-object/from16 v3, v17

    .line 900
    .line 901
    if-ne v2, v3, :cond_e

    .line 902
    .line 903
    goto/16 :goto_1c

    .line 904
    .line 905
    :cond_e
    move-object v2, v13

    .line 906
    move/from16 v28, v19

    .line 907
    .line 908
    move-wide/from16 v16, v25

    .line 909
    .line 910
    move-object/from16 v25, v7

    .line 911
    .line 912
    move-object v13, v10

    .line 913
    move-object v10, v6

    .line 914
    move-object v6, v4

    .line 915
    move-wide/from16 v35, v23

    .line 916
    .line 917
    move/from16 v23, v0

    .line 918
    .line 919
    move-object v0, v5

    .line 920
    move-object/from16 v24, v8

    .line 921
    .line 922
    move-wide/from16 v7, v35

    .line 923
    .line 924
    move-object v5, v1

    .line 925
    :goto_13
    move-object v1, v9

    .line 926
    move/from16 p1, v15

    .line 927
    .line 928
    move/from16 v15, v20

    .line 929
    .line 930
    move-object v9, v0

    .line 931
    move-wide/from16 v35, v16

    .line 932
    .line 933
    move-object/from16 v17, v3

    .line 934
    .line 935
    move-wide v3, v7

    .line 936
    move-wide v7, v11

    .line 937
    move-object/from16 v12, v24

    .line 938
    .line 939
    move-object/from16 v11, v25

    .line 940
    .line 941
    move-wide/from16 v24, v35

    .line 942
    .line 943
    goto/16 :goto_1

    .line 944
    .line 945
    :catchall_f
    move-exception v0

    .line 946
    :goto_14
    move-object/from16 v3, v17

    .line 947
    .line 948
    :goto_15
    move-wide/from16 v7, v23

    .line 949
    .line 950
    move-wide/from16 v5, v25

    .line 951
    .line 952
    goto/16 :goto_f

    .line 953
    .line 954
    :catchall_10
    move-exception v0

    .line 955
    move-wide/from16 v25, v2

    .line 956
    .line 957
    goto :goto_14

    .line 958
    :catchall_11
    move-exception v0

    .line 959
    move-wide/from16 v23, v2

    .line 960
    .line 961
    move-object/from16 v3, v17

    .line 962
    .line 963
    move-wide/from16 v25, v33

    .line 964
    .line 965
    goto :goto_15

    .line 966
    :goto_16
    :try_start_18
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_14

    .line 967
    .line 968
    :try_start_19
    new-instance v1, La/g0g0;

    .line 969
    .line 970
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_13

    .line 971
    .line 972
    .line 973
    move-object v0, v1

    .line 974
    move-wide/from16 v7, v23

    .line 975
    .line 976
    move-wide/from16 v5, v25

    .line 977
    .line 978
    :goto_17
    :try_start_1a
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    check-cast v0, Ljava/util/List;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_12

    .line 982
    .line 983
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 984
    .line 985
    .line 986
    move-result-wide v1

    .line 987
    sub-long v10, v1, v5

    .line 988
    .line 989
    cmp-long v4, v10, v7

    .line 990
    .line 991
    if-gez v4, :cond_f

    .line 992
    .line 993
    sub-long v10, v7, v10

    .line 994
    .line 995
    iput-object v0, v9, La/kgu;->o:Ljava/lang/Object;

    .line 996
    .line 997
    const/4 v4, 0x0

    .line 998
    iput-object v4, v9, La/kgu;->p:Ljava/util/List;

    .line 999
    .line 1000
    iput-object v4, v9, La/kgu;->q:Ljava/lang/String;

    .line 1001
    .line 1002
    iput-object v4, v9, La/kgu;->r:Ljava/lang/String;

    .line 1003
    .line 1004
    iput-object v4, v9, La/kgu;->s:Ljava/lang/String;

    .line 1005
    .line 1006
    iput-object v4, v9, La/kgu;->t:La/sff0;

    .line 1007
    .line 1008
    iput-object v4, v9, La/kgu;->u:La/dgu;

    .line 1009
    .line 1010
    iput-object v4, v9, La/kgu;->v:La/kgu;

    .line 1011
    .line 1012
    iput v14, v9, La/kgu;->y:I

    .line 1013
    .line 1014
    iput-wide v7, v9, La/kgu;->l:J

    .line 1015
    .line 1016
    iput-wide v5, v9, La/kgu;->m:J

    .line 1017
    .line 1018
    iput-wide v1, v9, La/kgu;->n:J

    .line 1019
    .line 1020
    const/4 v1, 0x3

    .line 1021
    iput-byte v1, v9, La/kgu;->x:B

    .line 1022
    .line 1023
    invoke-static {v10, v11, v9}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    if-ne v1, v3, :cond_f

    .line 1028
    .line 1029
    goto :goto_1c

    .line 1030
    :cond_f
    :goto_18
    return-object v0

    .line 1031
    :catchall_12
    move-exception v0

    .line 1032
    goto/16 :goto_f

    .line 1033
    .line 1034
    :catchall_13
    move-exception v0

    .line 1035
    goto :goto_1a

    .line 1036
    :goto_19
    move-wide/from16 v7, v23

    .line 1037
    .line 1038
    move-wide/from16 v5, v25

    .line 1039
    .line 1040
    goto :goto_1b

    .line 1041
    :catchall_14
    move-exception v0

    .line 1042
    :goto_1a
    const/4 v4, 0x0

    .line 1043
    goto :goto_19

    .line 1044
    :catchall_15
    move-exception v0

    .line 1045
    move-wide/from16 v23, v2

    .line 1046
    .line 1047
    move-object/from16 v3, v17

    .line 1048
    .line 1049
    move-wide/from16 v25, v33

    .line 1050
    .line 1051
    goto :goto_1a

    .line 1052
    :cond_10
    move-wide/from16 v23, v2

    .line 1053
    .line 1054
    move-object/from16 v3, v17

    .line 1055
    .line 1056
    move-wide/from16 v25, v33

    .line 1057
    .line 1058
    const/4 v4, 0x0

    .line 1059
    :try_start_1b
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_16

    .line 1060
    :catchall_16
    move-exception v0

    .line 1061
    goto :goto_19

    .line 1062
    :goto_1b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1063
    .line 1064
    .line 1065
    move-result-wide v1

    .line 1066
    sub-long v10, v1, v5

    .line 1067
    .line 1068
    cmp-long v12, v10, v7

    .line 1069
    .line 1070
    if-gez v12, :cond_11

    .line 1071
    .line 1072
    sub-long v10, v7, v10

    .line 1073
    .line 1074
    iput-object v0, v9, La/kgu;->o:Ljava/lang/Object;

    .line 1075
    .line 1076
    iput-object v4, v9, La/kgu;->p:Ljava/util/List;

    .line 1077
    .line 1078
    iput-object v4, v9, La/kgu;->q:Ljava/lang/String;

    .line 1079
    .line 1080
    iput-object v4, v9, La/kgu;->r:Ljava/lang/String;

    .line 1081
    .line 1082
    iput-object v4, v9, La/kgu;->s:Ljava/lang/String;

    .line 1083
    .line 1084
    iput-object v4, v9, La/kgu;->t:La/sff0;

    .line 1085
    .line 1086
    iput-object v4, v9, La/kgu;->u:La/dgu;

    .line 1087
    .line 1088
    iput-object v4, v9, La/kgu;->v:La/kgu;

    .line 1089
    .line 1090
    iput v14, v9, La/kgu;->y:I

    .line 1091
    .line 1092
    iput-wide v7, v9, La/kgu;->l:J

    .line 1093
    .line 1094
    iput-wide v5, v9, La/kgu;->m:J

    .line 1095
    .line 1096
    iput-wide v1, v9, La/kgu;->n:J

    .line 1097
    .line 1098
    const/4 v13, 0x4

    .line 1099
    iput-byte v13, v9, La/kgu;->x:B

    .line 1100
    .line 1101
    invoke-static {v10, v11, v9}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v1

    .line 1105
    if-ne v1, v3, :cond_11

    .line 1106
    .line 1107
    :goto_1c
    return-object v3

    .line 1108
    :cond_11
    :goto_1d
    throw v0
.end method
