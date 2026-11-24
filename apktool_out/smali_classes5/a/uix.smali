.class public final La/uix;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:J

.field public k:I

.field public l:I

.field public m:I

.field public n:La/ywu;

.field public o:Ljava/lang/Throwable;

.field public p:B

.field public final synthetic q:La/ywu;


# direct methods
.method public constructor <init>(La/ywu;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uix;->q:La/ywu;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/uix;

    .line 2
    .line 3
    iget-object p0, p0, La/uix;->q:La/ywu;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/uix;-><init>(La/ywu;La/yje;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, La/uix;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uix;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/uix;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/uix;->p:B

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v6, :cond_2

    .line 14
    .line 15
    if-eq v0, v4, :cond_1

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    iget v0, v1, La/uix;->m:I

    .line 20
    .line 21
    iget v8, v1, La/uix;->l:I

    .line 22
    .line 23
    iget v9, v1, La/uix;->k:I

    .line 24
    .line 25
    iget-wide v10, v1, La/uix;->j:J

    .line 26
    .line 27
    iget-wide v12, v1, La/uix;->i:J

    .line 28
    .line 29
    iget-object v14, v1, La/uix;->o:Ljava/lang/Throwable;

    .line 30
    .line 31
    iget-object v15, v1, La/uix;->n:La/ywu;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v16, v5

    .line 37
    .line 38
    move v5, v3

    .line 39
    goto/16 :goto_b

    .line 40
    .line 41
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v5

    .line 47
    :cond_1
    iget v0, v1, La/uix;->m:I

    .line 48
    .line 49
    iget v8, v1, La/uix;->l:I

    .line 50
    .line 51
    iget v9, v1, La/uix;->k:I

    .line 52
    .line 53
    iget-wide v10, v1, La/uix;->j:J

    .line 54
    .line 55
    iget-wide v12, v1, La/uix;->i:J

    .line 56
    .line 57
    iget-object v14, v1, La/uix;->o:Ljava/lang/Throwable;

    .line 58
    .line 59
    iget-object v15, v1, La/uix;->n:La/ywu;

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v16, v5

    .line 65
    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :cond_2
    iget v8, v1, La/uix;->l:I

    .line 69
    .line 70
    iget v9, v1, La/uix;->k:I

    .line 71
    .line 72
    iget-wide v10, v1, La/uix;->j:J

    .line 73
    .line 74
    iget-wide v12, v1, La/uix;->i:J

    .line 75
    .line 76
    iget-object v14, v1, La/uix;->o:Ljava/lang/Throwable;

    .line 77
    .line 78
    iget-object v15, v1, La/uix;->n:La/ywu;

    .line 79
    .line 80
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    move-object/from16 v0, p1

    .line 84
    .line 85
    move-object/from16 v16, v5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object/from16 v16, v14

    .line 90
    .line 91
    move-object v14, v0

    .line 92
    move-object/from16 v0, v16

    .line 93
    .line 94
    move-object/from16 v16, v5

    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-wide v8, La/cag0;->a:J

    .line 102
    .line 103
    iget-object v0, v1, La/uix;->q:La/ywu;

    .line 104
    .line 105
    const-wide/16 v10, 0x3

    .line 106
    .line 107
    move-object v15, v0

    .line 108
    move-object v14, v5

    .line 109
    move v0, v6

    .line 110
    move-wide v12, v10

    .line 111
    move-wide v10, v8

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    :goto_0
    if-eqz v0, :cond_11

    .line 115
    .line 116
    move-object/from16 v16, v5

    .line 117
    .line 118
    :try_start_1
    iget-object v5, v15, La/ywu;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v5, La/tpv;

    .line 121
    .line 122
    invoke-virtual {v5}, La/tpv;->invoke()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, La/l6d;

    .line 127
    .line 128
    iget-object v7, v15, La/ywu;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v7, La/btt0;

    .line 131
    .line 132
    invoke-virtual {v7}, La/btt0;->a()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    iput-object v15, v1, La/uix;->n:La/ywu;

    .line 137
    .line 138
    iput-object v14, v1, La/uix;->o:Ljava/lang/Throwable;

    .line 139
    .line 140
    iput-wide v12, v1, La/uix;->i:J

    .line 141
    .line 142
    iput-wide v10, v1, La/uix;->j:J

    .line 143
    .line 144
    iput v9, v1, La/uix;->k:I

    .line 145
    .line 146
    iput v8, v1, La/uix;->l:I

    .line 147
    .line 148
    iput v0, v1, La/uix;->m:I

    .line 149
    .line 150
    iput-byte v6, v1, La/uix;->p:B

    .line 151
    .line 152
    invoke-interface {v5, v7, v1}, La/l6d;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v2, :cond_4

    .line 157
    .line 158
    goto/16 :goto_a

    .line 159
    .line 160
    :cond_4
    :goto_1
    check-cast v0, La/dx5;

    .line 161
    .line 162
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/lang/Iterable;

    .line 167
    .line 168
    new-instance v5, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v7, 0xa

    .line 171
    .line 172
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-eqz v7, :cond_7

    .line 188
    .line 189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    check-cast v7, La/ff3;

    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v6, La/cf3;

    .line 199
    .line 200
    iget-object v3, v7, La/ff3;->a:Ljava/lang/Integer;

    .line 201
    .line 202
    if-eqz v3, :cond_5

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    goto :goto_3

    .line 209
    :cond_5
    const/4 v3, 0x0

    .line 210
    :goto_3
    iget-object v7, v7, La/ff3;->b:Ljava/lang/String;

    .line 211
    .line 212
    if-nez v7, :cond_6

    .line 213
    .line 214
    const-string v7, ""

    .line 215
    .line 216
    :cond_6
    invoke-direct {v6, v3, v7}, La/cf3;-><init>(ILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    .line 221
    .line 222
    const/4 v3, 0x3

    .line 223
    const/4 v6, 0x1

    .line 224
    goto :goto_2

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    move-object/from16 v17, v14

    .line 227
    .line 228
    move-object v14, v0

    .line 229
    move-object/from16 v0, v17

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_7
    return-object v5

    .line 233
    :goto_4
    invoke-static {v14}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_c

    .line 238
    .line 239
    if-nez v9, :cond_8

    .line 240
    .line 241
    new-instance v0, La/el50;

    .line 242
    .line 243
    invoke-direct {v0, v14}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    move-object v14, v0

    .line 247
    move-object/from16 v5, v16

    .line 248
    .line 249
    const/4 v0, 0x0

    .line 250
    :goto_5
    const/4 v3, 0x3

    .line 251
    :goto_6
    const/4 v6, 0x1

    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_8
    int-to-long v5, v8

    .line 255
    cmp-long v3, v5, v12

    .line 256
    .line 257
    if-gez v3, :cond_9

    .line 258
    .line 259
    const/4 v3, 0x1

    .line 260
    goto :goto_7

    .line 261
    :cond_9
    const/4 v3, 0x0

    .line 262
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 263
    .line 264
    if-eqz v3, :cond_a

    .line 265
    .line 266
    iput-object v15, v1, La/uix;->n:La/ywu;

    .line 267
    .line 268
    iput-object v0, v1, La/uix;->o:Ljava/lang/Throwable;

    .line 269
    .line 270
    iput-wide v12, v1, La/uix;->i:J

    .line 271
    .line 272
    iput-wide v10, v1, La/uix;->j:J

    .line 273
    .line 274
    iput v9, v1, La/uix;->k:I

    .line 275
    .line 276
    iput v8, v1, La/uix;->l:I

    .line 277
    .line 278
    iput v3, v1, La/uix;->m:I

    .line 279
    .line 280
    iput-byte v4, v1, La/uix;->p:B

    .line 281
    .line 282
    invoke-static {v10, v11, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    if-ne v5, v2, :cond_b

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :goto_8
    move-object/from16 v5, v16

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_a
    new-instance v0, La/el50;

    .line 293
    .line 294
    invoke-direct {v0, v14}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    :cond_b
    move-object v14, v0

    .line 298
    move v0, v3

    .line 299
    goto :goto_8

    .line 300
    :cond_c
    invoke-static {v14}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_10

    .line 305
    .line 306
    int-to-long v5, v8

    .line 307
    cmp-long v3, v5, v12

    .line 308
    .line 309
    if-gez v3, :cond_d

    .line 310
    .line 311
    const/4 v3, 0x1

    .line 312
    goto :goto_9

    .line 313
    :cond_d
    const/4 v3, 0x0

    .line 314
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 315
    .line 316
    if-eqz v3, :cond_e

    .line 317
    .line 318
    iput-object v15, v1, La/uix;->n:La/ywu;

    .line 319
    .line 320
    iput-object v0, v1, La/uix;->o:Ljava/lang/Throwable;

    .line 321
    .line 322
    iput-wide v12, v1, La/uix;->i:J

    .line 323
    .line 324
    iput-wide v10, v1, La/uix;->j:J

    .line 325
    .line 326
    iput v9, v1, La/uix;->k:I

    .line 327
    .line 328
    iput v8, v1, La/uix;->l:I

    .line 329
    .line 330
    iput v3, v1, La/uix;->m:I

    .line 331
    .line 332
    const/4 v5, 0x3

    .line 333
    iput-byte v5, v1, La/uix;->p:B

    .line 334
    .line 335
    invoke-static {v10, v11, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    if-ne v6, v2, :cond_f

    .line 340
    .line 341
    :goto_a
    return-object v2

    .line 342
    :goto_b
    move v3, v5

    .line 343
    move-object/from16 v5, v16

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_e
    const/4 v5, 0x3

    .line 347
    new-instance v0, La/dag0;

    .line 348
    .line 349
    invoke-direct {v0, v14}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 350
    .line 351
    .line 352
    :cond_f
    move-object v14, v0

    .line 353
    move v0, v3

    .line 354
    goto :goto_b

    .line 355
    :cond_10
    const/4 v5, 0x3

    .line 356
    invoke-static {v14}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 357
    .line 358
    .line 359
    move v3, v5

    .line 360
    move-object/from16 v5, v16

    .line 361
    .line 362
    const/4 v0, 0x0

    .line 363
    goto :goto_6

    .line 364
    :cond_11
    move-object/from16 v16, v5

    .line 365
    .line 366
    if-nez v14, :cond_12

    .line 367
    .line 368
    const-string v0, "Unexpected error"

    .line 369
    .line 370
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-object v16

    .line 374
    :cond_12
    throw v14
.end method
