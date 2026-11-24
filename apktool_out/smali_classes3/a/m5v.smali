.class public final La/m5v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kmq;

.field public j:La/abu;

.field public k:Ljava/lang/String;

.field public l:La/qmu0;

.field public m:I

.field public n:I

.field public o:Z

.field public p:B

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/abu;

.field public final synthetic s:La/qmu0;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Z


# direct methods
.method public constructor <init>(La/abu;La/qmu0;Ljava/lang/String;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m5v;->r:La/abu;

    .line 2
    .line 3
    iput-object p2, p0, La/m5v;->s:La/qmu0;

    .line 4
    .line 5
    iput-object p3, p0, La/m5v;->t:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p4, p0, La/m5v;->u:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/m5v;

    .line 2
    .line 3
    iget-object v3, p0, La/m5v;->t:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v4, p0, La/m5v;->u:Z

    .line 6
    .line 7
    iget-object v1, p0, La/m5v;->r:La/abu;

    .line 8
    .line 9
    iget-object v2, p0, La/m5v;->s:La/qmu0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/m5v;-><init>(La/abu;La/qmu0;Ljava/lang/String;ZLa/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/m5v;->q:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/m5v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/m5v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/m5v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/m5v;->q:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v6, v0

    .line 6
    check-cast v6, La/kmq;

    .line 7
    .line 8
    sget-object v7, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v5, La/m5v;->p:B

    .line 11
    .line 12
    iget-object v8, v5, La/m5v;->s:La/qmu0;

    .line 13
    .line 14
    const/4 v9, 0x2

    .line 15
    const/4 v10, 0x3

    .line 16
    const/4 v12, 0x1

    .line 17
    const/4 v13, 0x0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    if-eq v0, v12, :cond_2

    .line 21
    .line 22
    if-eq v0, v9, :cond_1

    .line 23
    .line 24
    if-ne v0, v10, :cond_0

    .line 25
    .line 26
    iget-object v0, v5, La/m5v;->i:La/kmq;

    .line 27
    .line 28
    check-cast v0, Ljava/util/List;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_d

    .line 34
    .line 35
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v13

    .line 41
    :cond_1
    iget v0, v5, La/m5v;->n:I

    .line 42
    .line 43
    iget-boolean v1, v5, La/m5v;->o:Z

    .line 44
    .line 45
    iget v2, v5, La/m5v;->m:I

    .line 46
    .line 47
    iget-object v3, v5, La/m5v;->l:La/qmu0;

    .line 48
    .line 49
    iget-object v4, v5, La/m5v;->k:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v14, v5, La/m5v;->j:La/abu;

    .line 52
    .line 53
    iget-object v15, v5, La/m5v;->i:La/kmq;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v11, v4

    .line 59
    move v4, v1

    .line 60
    move-object v1, v14

    .line 61
    move v14, v2

    .line 62
    move-object v2, v11

    .line 63
    move v11, v0

    .line 64
    move/from16 v16, v12

    .line 65
    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_2
    iget v1, v5, La/m5v;->n:I

    .line 69
    .line 70
    iget-boolean v2, v5, La/m5v;->o:Z

    .line 71
    .line 72
    iget v3, v5, La/m5v;->m:I

    .line 73
    .line 74
    iget-object v4, v5, La/m5v;->l:La/qmu0;

    .line 75
    .line 76
    iget-object v14, v5, La/m5v;->k:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v15, v5, La/m5v;->j:La/abu;

    .line 79
    .line 80
    iget-object v11, v5, La/m5v;->i:La/kmq;

    .line 81
    .line 82
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    move-object/from16 v0, p1

    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object v13, v4

    .line 91
    move v4, v2

    .line 92
    move v2, v3

    .line 93
    move-object v3, v13

    .line 94
    move-object v13, v15

    .line 95
    move-object v15, v11

    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v5, La/m5v;->r:La/abu;

    .line 102
    .line 103
    iget-object v1, v5, La/m5v;->t:Ljava/lang/String;

    .line 104
    .line 105
    iget-boolean v2, v5, La/m5v;->u:Z

    .line 106
    .line 107
    move v4, v2

    .line 108
    move-object v15, v6

    .line 109
    move-object v3, v8

    .line 110
    const/4 v11, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    move-object v2, v1

    .line 113
    move-object v1, v0

    .line 114
    :goto_0
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 115
    .line 116
    iget-object v0, v1, La/abu;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, La/xx0;

    .line 119
    .line 120
    iget-object v13, v1, La/abu;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v13, La/j1q0;

    .line 123
    .line 124
    iget-object v13, v13, La/j1q0;->a:La/m1q0;

    .line 125
    .line 126
    invoke-virtual {v13}, La/m1q0;->a()Z

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    iput-object v6, v5, La/m5v;->q:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v15, v5, La/m5v;->i:La/kmq;

    .line 133
    .line 134
    iput-object v1, v5, La/m5v;->j:La/abu;

    .line 135
    .line 136
    iput-object v2, v5, La/m5v;->k:Ljava/lang/String;

    .line 137
    .line 138
    iput-object v3, v5, La/m5v;->l:La/qmu0;

    .line 139
    .line 140
    iput v14, v5, La/m5v;->m:I

    .line 141
    .line 142
    iput-boolean v4, v5, La/m5v;->o:Z

    .line 143
    .line 144
    iput v11, v5, La/m5v;->n:I

    .line 145
    .line 146
    iput-byte v12, v5, La/m5v;->p:B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 147
    .line 148
    move/from16 v17, v13

    .line 149
    .line 150
    move-object v13, v1

    .line 151
    move/from16 v1, v17

    .line 152
    .line 153
    :try_start_2
    invoke-virtual/range {v0 .. v5}, La/xx0;->a(ZLjava/lang/String;La/qmu0;ZLa/zje;)Ljava/io/Serializable;

    .line 154
    .line 155
    .line 156
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 157
    if-ne v0, v7, :cond_4

    .line 158
    .line 159
    goto/16 :goto_c

    .line 160
    .line 161
    :cond_4
    move v1, v14

    .line 162
    move-object v14, v2

    .line 163
    move v2, v4

    .line 164
    move-object v4, v3

    .line 165
    move v3, v1

    .line 166
    move v1, v11

    .line 167
    move-object v11, v15

    .line 168
    move-object v15, v13

    .line 169
    :goto_1
    :try_start_3
    check-cast v0, Ljava/util/List;

    .line 170
    .line 171
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    .line 173
    goto/16 :goto_9

    .line 174
    .line 175
    :catchall_1
    move-exception v0

    .line 176
    :goto_2
    move v1, v14

    .line 177
    move-object v14, v2

    .line 178
    move v2, v1

    .line 179
    move v1, v11

    .line 180
    goto :goto_3

    .line 181
    :catchall_2
    move-exception v0

    .line 182
    move-object v13, v1

    .line 183
    goto :goto_2

    .line 184
    :goto_3
    if-eqz v2, :cond_5

    .line 185
    .line 186
    instance-of v11, v0, La/zhi0;

    .line 187
    .line 188
    if-eqz v11, :cond_5

    .line 189
    .line 190
    move-object v11, v0

    .line 191
    check-cast v11, La/zhi0;

    .line 192
    .line 193
    iget-boolean v11, v11, La/zhi0;->e:Z

    .line 194
    .line 195
    if-eqz v11, :cond_5

    .line 196
    .line 197
    move v11, v12

    .line 198
    move/from16 v16, v11

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_5
    move/from16 v16, v12

    .line 202
    .line 203
    const/4 v11, 0x0

    .line 204
    :goto_4
    instance-of v12, v0, Ljava/util/concurrent/CancellationException;

    .line 205
    .line 206
    if-nez v12, :cond_10

    .line 207
    .line 208
    instance-of v12, v0, Ljava/net/ConnectException;

    .line 209
    .line 210
    if-nez v12, :cond_10

    .line 211
    .line 212
    if-nez v11, :cond_10

    .line 213
    .line 214
    instance-of v11, v0, La/zhi0;

    .line 215
    .line 216
    if-eqz v11, :cond_8

    .line 217
    .line 218
    move-object v11, v0

    .line 219
    check-cast v11, La/zhi0;

    .line 220
    .line 221
    iget-boolean v12, v11, La/zhi0;->f:Z

    .line 222
    .line 223
    if-nez v12, :cond_7

    .line 224
    .line 225
    iget-boolean v11, v11, La/zhi0;->e:Z

    .line 226
    .line 227
    if-eqz v11, :cond_6

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_6
    const/4 v11, 0x0

    .line 231
    goto :goto_6

    .line 232
    :cond_7
    :goto_5
    move/from16 v11, v16

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_8
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    if-nez v11, :cond_6

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 243
    .line 244
    if-gt v1, v10, :cond_b

    .line 245
    .line 246
    if-eqz v11, :cond_9

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_9
    const-string v11, "error ("

    .line 250
    .line 251
    const-string v12, "): "

    .line 252
    .line 253
    invoke-static {v1, v11, v12, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 258
    .line 259
    invoke-virtual {v11, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iput-object v6, v5, La/m5v;->q:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v15, v5, La/m5v;->i:La/kmq;

    .line 265
    .line 266
    iput-object v13, v5, La/m5v;->j:La/abu;

    .line 267
    .line 268
    iput-object v14, v5, La/m5v;->k:Ljava/lang/String;

    .line 269
    .line 270
    iput-object v3, v5, La/m5v;->l:La/qmu0;

    .line 271
    .line 272
    iput v2, v5, La/m5v;->m:I

    .line 273
    .line 274
    iput-boolean v4, v5, La/m5v;->o:Z

    .line 275
    .line 276
    iput v1, v5, La/m5v;->n:I

    .line 277
    .line 278
    iput-byte v9, v5, La/m5v;->p:B

    .line 279
    .line 280
    const-wide/16 v11, 0xbb8

    .line 281
    .line 282
    invoke-static {v11, v12, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-ne v0, v7, :cond_a

    .line 287
    .line 288
    goto :goto_c

    .line 289
    :cond_a
    move-object v11, v14

    .line 290
    move v14, v2

    .line 291
    move-object v2, v11

    .line 292
    move v11, v1

    .line 293
    move-object v1, v13

    .line 294
    :goto_7
    move/from16 v12, v16

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_b
    :goto_8
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 300
    .line 301
    new-instance v1, La/g0g0;

    .line 302
    .line 303
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    move-object v0, v1

    .line 307
    :goto_9
    nop

    .line 308
    instance-of v1, v0, La/g0g0;

    .line 309
    .line 310
    if-eqz v1, :cond_c

    .line 311
    .line 312
    const/4 v0, 0x0

    .line 313
    :cond_c
    check-cast v0, Ljava/util/List;

    .line 314
    .line 315
    if-nez v0, :cond_e

    .line 316
    .line 317
    sget-object v0, La/iun;->a:La/iun;

    .line 318
    .line 319
    :cond_d
    :goto_a
    const/4 v1, 0x0

    .line 320
    goto :goto_b

    .line 321
    :cond_e
    instance-of v1, v8, La/omu0;

    .line 322
    .line 323
    if-eqz v1, :cond_d

    .line 324
    .line 325
    check-cast v8, La/omu0;

    .line 326
    .line 327
    iget-byte v1, v8, La/omu0;->a:B

    .line 328
    .line 329
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    goto :goto_a

    .line 334
    :goto_b
    iput-object v1, v5, La/m5v;->q:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v1, v5, La/m5v;->i:La/kmq;

    .line 337
    .line 338
    iput-object v1, v5, La/m5v;->j:La/abu;

    .line 339
    .line 340
    iput-object v1, v5, La/m5v;->k:Ljava/lang/String;

    .line 341
    .line 342
    iput-object v1, v5, La/m5v;->l:La/qmu0;

    .line 343
    .line 344
    iput-byte v10, v5, La/m5v;->p:B

    .line 345
    .line 346
    invoke-interface {v6, v0, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-ne v0, v7, :cond_f

    .line 351
    .line 352
    :goto_c
    return-object v7

    .line 353
    :cond_f
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object v0

    .line 356
    :cond_10
    throw v0
.end method
