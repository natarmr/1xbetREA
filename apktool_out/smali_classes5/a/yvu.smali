.class public final La/yvu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:B

.field public synthetic n:Ljava/lang/Throwable;

.field public synthetic o:J

.field public final synthetic p:La/pwi;

.field public final synthetic q:La/xvu;

.field public final synthetic r:La/u5u;

.field public final synthetic s:Z


# direct methods
.method public constructor <init>(La/pwi;La/xvu;La/u5u;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/yvu;->p:La/pwi;

    .line 2
    .line 3
    iput-object p2, p0, La/yvu;->q:La/xvu;

    .line 4
    .line 5
    iput-object p3, p0, La/yvu;->r:La/u5u;

    .line 6
    .line 7
    iput-boolean p4, p0, La/yvu;->s:Z

    .line 8
    .line 9
    const/4 p1, 0x4

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/yvu;->n:Ljava/lang/Throwable;

    .line 4
    .line 5
    iget-wide v2, v0, La/yvu;->o:J

    .line 6
    .line 7
    sget-object v4, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v5, v0, La/yvu;->m:B

    .line 10
    .line 11
    const/4 v8, 0x5

    .line 12
    const/4 v9, 0x4

    .line 13
    const/4 v10, 0x3

    .line 14
    const/4 v11, 0x2

    .line 15
    const/4 v12, 0x1

    .line 16
    const/4 v13, 0x0

    .line 17
    if-eqz v5, :cond_4

    .line 18
    .line 19
    if-eq v5, v12, :cond_3

    .line 20
    .line 21
    if-eq v5, v11, :cond_2

    .line 22
    .line 23
    if-eq v5, v10, :cond_3

    .line 24
    .line 25
    if-eq v5, v9, :cond_1

    .line 26
    .line 27
    if-ne v5, v8, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v13

    .line 36
    :cond_1
    iget-boolean v1, v0, La/yvu;->l:Z

    .line 37
    .line 38
    iget v5, v0, La/yvu;->k:I

    .line 39
    .line 40
    iget v9, v0, La/yvu;->j:I

    .line 41
    .line 42
    iget v10, v0, La/yvu;->i:I

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_2
    iget-boolean v1, v0, La/yvu;->l:Z

    .line 50
    .line 51
    iget v5, v0, La/yvu;->k:I

    .line 52
    .line 53
    iget v8, v0, La/yvu;->j:I

    .line 54
    .line 55
    iget v9, v0, La/yvu;->i:I

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_3
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_8

    .line 66
    .line 67
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const-class v5, Ljava/net/SocketTimeoutException;

    .line 71
    .line 72
    const-class v14, Ljava/net/UnknownHostException;

    .line 73
    .line 74
    filled-new-array {v5, v14}, [Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    if-eqz v14, :cond_6

    .line 91
    .line 92
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    move-object v15, v14

    .line 97
    check-cast v15, Ljava/lang/Class;

    .line 98
    .line 99
    invoke-virtual {v15, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v15

    .line 103
    if-eqz v15, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    move-object v14, v13

    .line 107
    :goto_1
    check-cast v14, Ljava/lang/Class;

    .line 108
    .line 109
    if-eqz v14, :cond_7

    .line 110
    .line 111
    invoke-virtual {v14, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    const/4 v14, 0x0

    .line 117
    :goto_2
    xor-int/lit8 v15, v14, 0x1

    .line 118
    .line 119
    instance-of v5, v1, La/zhi0;

    .line 120
    .line 121
    if-eqz v5, :cond_8

    .line 122
    .line 123
    move-object v5, v1

    .line 124
    check-cast v5, La/zhi0;

    .line 125
    .line 126
    iget-boolean v5, v5, La/zhi0;->e:Z

    .line 127
    .line 128
    if-nez v5, :cond_9

    .line 129
    .line 130
    :cond_8
    if-eqz v14, :cond_a

    .line 131
    .line 132
    :cond_9
    move v5, v12

    .line 133
    goto :goto_3

    .line 134
    :cond_a
    const/4 v5, 0x0

    .line 135
    :goto_3
    if-eqz v5, :cond_b

    .line 136
    .line 137
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 138
    .line 139
    return-object v0

    .line 140
    :cond_b
    const-wide/16 v8, 0x3

    .line 141
    .line 142
    cmp-long v16, v2, v8

    .line 143
    .line 144
    if-gez v16, :cond_c

    .line 145
    .line 146
    move v14, v12

    .line 147
    goto :goto_4

    .line 148
    :cond_c
    const/4 v14, 0x0

    .line 149
    :goto_4
    iget-object v10, v0, La/yvu;->p:La/pwi;

    .line 150
    .line 151
    iget-object v6, v10, La/pwi;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v6, La/yox;

    .line 154
    .line 155
    iget-object v6, v6, La/yox;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v6, La/r2m0;

    .line 158
    .line 159
    iget-object v6, v6, La/r2m0;->c:La/m2m0;

    .line 160
    .line 161
    iget-object v6, v6, La/m2m0;->a:La/ouu;

    .line 162
    .line 163
    invoke-virtual {v6}, La/ouu;->I()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    iget-object v7, v0, La/yvu;->q:La/xvu;

    .line 168
    .line 169
    invoke-virtual {v7}, La/xvu;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_d

    .line 180
    .line 181
    if-eqz v14, :cond_d

    .line 182
    .line 183
    sget-object v1, La/wen;->b:La/uen;

    .line 184
    .line 185
    sget-object v1, La/bfn;->e:La/bfn;

    .line 186
    .line 187
    invoke-static {v8, v9, v1}, La/ibc;->w0(JLa/bfn;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v7

    .line 191
    iput-object v13, v0, La/yvu;->n:Ljava/lang/Throwable;

    .line 192
    .line 193
    iput-wide v2, v0, La/yvu;->o:J

    .line 194
    .line 195
    iput v15, v0, La/yvu;->i:I

    .line 196
    .line 197
    iput v5, v0, La/yvu;->j:I

    .line 198
    .line 199
    iput v14, v0, La/yvu;->k:I

    .line 200
    .line 201
    iput-boolean v6, v0, La/yvu;->l:Z

    .line 202
    .line 203
    iput-byte v12, v0, La/yvu;->m:B

    .line 204
    .line 205
    invoke-static {v7, v8, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-ne v0, v4, :cond_13

    .line 210
    .line 211
    goto/16 :goto_7

    .line 212
    .line 213
    :cond_d
    iget-object v7, v0, La/yvu;->r:La/u5u;

    .line 214
    .line 215
    if-nez v6, :cond_f

    .line 216
    .line 217
    iput-object v13, v0, La/yvu;->n:Ljava/lang/Throwable;

    .line 218
    .line 219
    iput-wide v2, v0, La/yvu;->o:J

    .line 220
    .line 221
    iput v15, v0, La/yvu;->i:I

    .line 222
    .line 223
    iput v5, v0, La/yvu;->j:I

    .line 224
    .line 225
    iput v14, v0, La/yvu;->k:I

    .line 226
    .line 227
    iput-boolean v6, v0, La/yvu;->l:Z

    .line 228
    .line 229
    iput-byte v11, v0, La/yvu;->m:B

    .line 230
    .line 231
    invoke-virtual {v7, v1, v0}, La/u5u;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-ne v1, v4, :cond_e

    .line 236
    .line 237
    goto/16 :goto_7

    .line 238
    .line 239
    :cond_e
    move v8, v5

    .line 240
    move v1, v6

    .line 241
    move v5, v14

    .line 242
    move v9, v15

    .line 243
    :goto_5
    sget-object v6, La/wen;->b:La/uen;

    .line 244
    .line 245
    sget-object v6, La/bfn;->e:La/bfn;

    .line 246
    .line 247
    const-wide/16 v10, 0x1e

    .line 248
    .line 249
    invoke-static {v10, v11, v6}, La/ibc;->w0(JLa/bfn;)J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    iput-object v13, v0, La/yvu;->n:Ljava/lang/Throwable;

    .line 254
    .line 255
    iput-wide v2, v0, La/yvu;->o:J

    .line 256
    .line 257
    iput v9, v0, La/yvu;->i:I

    .line 258
    .line 259
    iput v8, v0, La/yvu;->j:I

    .line 260
    .line 261
    iput v5, v0, La/yvu;->k:I

    .line 262
    .line 263
    iput-boolean v1, v0, La/yvu;->l:Z

    .line 264
    .line 265
    const/4 v1, 0x3

    .line 266
    iput-byte v1, v0, La/yvu;->m:B

    .line 267
    .line 268
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-ne v0, v4, :cond_13

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_f
    iget-boolean v8, v0, La/yvu;->s:Z

    .line 276
    .line 277
    if-eqz v8, :cond_12

    .line 278
    .line 279
    iget-object v8, v10, La/pwi;->j:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v8, La/cyu;

    .line 282
    .line 283
    iget-object v9, v8, La/cyu;->a:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v9, La/u6t;

    .line 286
    .line 287
    iget-object v9, v9, La/u6t;->b:La/s6t;

    .line 288
    .line 289
    iget-object v9, v9, La/s6t;->a:La/ouu;

    .line 290
    .line 291
    invoke-virtual {v9}, La/ouu;->I()Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_10

    .line 296
    .line 297
    iget-object v9, v8, La/cyu;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v9, La/p6t;

    .line 300
    .line 301
    iget-object v9, v9, La/p6t;->b:La/n6t;

    .line 302
    .line 303
    iget-object v9, v9, La/n6t;->a:La/ouu;

    .line 304
    .line 305
    invoke-virtual {v9}, La/ouu;->I()Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_10

    .line 310
    .line 311
    iget-object v8, v8, La/cyu;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v8, La/b6t;

    .line 314
    .line 315
    iget-object v8, v8, La/b6t;->b:La/v5t;

    .line 316
    .line 317
    iget-object v8, v8, La/v5t;->a:La/ouu;

    .line 318
    .line 319
    invoke-virtual {v8}, La/ouu;->I()Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    if-nez v8, :cond_12

    .line 324
    .line 325
    :cond_10
    iput-object v13, v0, La/yvu;->n:Ljava/lang/Throwable;

    .line 326
    .line 327
    iput-wide v2, v0, La/yvu;->o:J

    .line 328
    .line 329
    iput v15, v0, La/yvu;->i:I

    .line 330
    .line 331
    iput v5, v0, La/yvu;->j:I

    .line 332
    .line 333
    iput v14, v0, La/yvu;->k:I

    .line 334
    .line 335
    iput-boolean v6, v0, La/yvu;->l:Z

    .line 336
    .line 337
    const/4 v8, 0x4

    .line 338
    iput-byte v8, v0, La/yvu;->m:B

    .line 339
    .line 340
    invoke-virtual {v7, v1, v0}, La/u5u;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    if-ne v1, v4, :cond_11

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_11
    move v9, v5

    .line 348
    move v1, v6

    .line 349
    move v5, v14

    .line 350
    move v10, v15

    .line 351
    :goto_6
    sget-object v6, La/wen;->b:La/uen;

    .line 352
    .line 353
    sget-object v6, La/bfn;->e:La/bfn;

    .line 354
    .line 355
    const-wide/16 v7, 0x1e

    .line 356
    .line 357
    invoke-static {v7, v8, v6}, La/ibc;->w0(JLa/bfn;)J

    .line 358
    .line 359
    .line 360
    move-result-wide v6

    .line 361
    iput-object v13, v0, La/yvu;->n:Ljava/lang/Throwable;

    .line 362
    .line 363
    iput-wide v2, v0, La/yvu;->o:J

    .line 364
    .line 365
    iput v10, v0, La/yvu;->i:I

    .line 366
    .line 367
    iput v9, v0, La/yvu;->j:I

    .line 368
    .line 369
    iput v5, v0, La/yvu;->k:I

    .line 370
    .line 371
    iput-boolean v1, v0, La/yvu;->l:Z

    .line 372
    .line 373
    const/4 v1, 0x5

    .line 374
    iput-byte v1, v0, La/yvu;->m:B

    .line 375
    .line 376
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-ne v0, v4, :cond_13

    .line 381
    .line 382
    :goto_7
    return-object v4

    .line 383
    :cond_12
    const/4 v12, 0x0

    .line 384
    :cond_13
    :goto_8
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    return-object v0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    move-object v7, p4

    .line 12
    check-cast v7, La/yje;

    .line 13
    .line 14
    new-instance v2, La/yvu;

    .line 15
    .line 16
    iget-object v5, p0, La/yvu;->r:La/u5u;

    .line 17
    .line 18
    iget-boolean v6, p0, La/yvu;->s:Z

    .line 19
    .line 20
    iget-object v3, p0, La/yvu;->p:La/pwi;

    .line 21
    .line 22
    iget-object v4, p0, La/yvu;->q:La/xvu;

    .line 23
    .line 24
    invoke-direct/range {v2 .. v7}, La/yvu;-><init>(La/pwi;La/xvu;La/u5u;ZLa/yje;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v2, La/yvu;->n:Ljava/lang/Throwable;

    .line 28
    .line 29
    iput-wide v0, v2, La/yvu;->o:J

    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {v2, p0}, La/yvu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
