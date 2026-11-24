.class public final La/ucb0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rcb0;

.field public final b:La/pv00;


# direct methods
.method public constructor <init>(La/rcb0;La/pv00;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ucb0;->a:La/rcb0;

    .line 8
    .line 9
    iput-object p2, p0, La/ucb0;->b:La/pv00;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/tcb0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/tcb0;

    .line 11
    .line 12
    iget v3, v2, La/tcb0;->r:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/tcb0;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/tcb0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/tcb0;-><init>(La/ucb0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/tcb0;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/tcb0;->r:I

    .line 34
    .line 35
    iget-object v5, v1, La/ucb0;->a:La/rcb0;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v10, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v10, :cond_3

    .line 43
    .line 44
    if-eq v4, v7, :cond_2

    .line 45
    .line 46
    if-ne v4, v6, :cond_1

    .line 47
    .line 48
    iget v4, v2, La/tcb0;->o:I

    .line 49
    .line 50
    iget v11, v2, La/tcb0;->n:I

    .line 51
    .line 52
    iget v12, v2, La/tcb0;->m:I

    .line 53
    .line 54
    iget-wide v13, v2, La/tcb0;->l:J

    .line 55
    .line 56
    const/16 p2, 0x0

    .line 57
    .line 58
    iget-wide v8, v2, La/tcb0;->k:J

    .line 59
    .line 60
    iget-object v15, v2, La/tcb0;->j:Ljava/lang/Throwable;

    .line 61
    .line 62
    iget-object v6, v2, La/tcb0;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move v0, v4

    .line 68
    move-object v4, v6

    .line 69
    move v6, v11

    .line 70
    const/4 v7, 0x3

    .line 71
    move-wide/from16 v16, v8

    .line 72
    .line 73
    move v8, v12

    .line 74
    move-wide v11, v13

    .line 75
    move-wide/from16 v13, v16

    .line 76
    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_1
    const/16 p2, 0x0

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_2
    const/16 p2, 0x0

    .line 88
    .line 89
    iget v4, v2, La/tcb0;->o:I

    .line 90
    .line 91
    iget v6, v2, La/tcb0;->n:I

    .line 92
    .line 93
    iget v8, v2, La/tcb0;->m:I

    .line 94
    .line 95
    iget-wide v11, v2, La/tcb0;->l:J

    .line 96
    .line 97
    iget-wide v13, v2, La/tcb0;->k:J

    .line 98
    .line 99
    iget-object v9, v2, La/tcb0;->j:Ljava/lang/Throwable;

    .line 100
    .line 101
    iget-object v15, v2, La/tcb0;->i:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move v0, v4

    .line 107
    move-object v4, v15

    .line 108
    goto :goto_1

    .line 109
    :cond_3
    const/16 p2, 0x0

    .line 110
    .line 111
    iget v4, v2, La/tcb0;->n:I

    .line 112
    .line 113
    iget v6, v2, La/tcb0;->m:I

    .line 114
    .line 115
    iget-wide v8, v2, La/tcb0;->l:J

    .line 116
    .line 117
    iget-wide v11, v2, La/tcb0;->k:J

    .line 118
    .line 119
    iget-object v13, v2, La/tcb0;->j:Ljava/lang/Throwable;

    .line 120
    .line 121
    iget-object v14, v2, La/tcb0;->i:Ljava/lang/String;

    .line 122
    .line 123
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    move-object v15, v13

    .line 129
    move-wide/from16 v16, v8

    .line 130
    .line 131
    move-object v9, v0

    .line 132
    move v8, v6

    .line 133
    move v6, v4

    .line 134
    move-object v4, v14

    .line 135
    move-wide v13, v11

    .line 136
    move-wide/from16 v11, v16

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    const/16 p2, 0x0

    .line 140
    .line 141
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v0, v5, La/rcb0;->a:Ljava/util/LinkedHashMap;

    .line 151
    .line 152
    move-object/from16 v4, p1

    .line 153
    .line 154
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Ljava/util/List;

    .line 159
    .line 160
    if-nez v0, :cond_11

    .line 161
    .line 162
    sget-wide v8, La/cag0;->a:J

    .line 163
    .line 164
    const-wide/16 v11, 0x3

    .line 165
    .line 166
    move v0, v10

    .line 167
    move-wide v13, v11

    .line 168
    const/4 v6, 0x0

    .line 169
    move-wide v11, v8

    .line 170
    const/4 v8, 0x0

    .line 171
    move-object/from16 v9, p2

    .line 172
    .line 173
    :goto_1
    if-eqz v0, :cond_f

    .line 174
    .line 175
    :try_start_1
    iget-object v15, v1, La/ucb0;->b:La/pv00;

    .line 176
    .line 177
    iput-object v4, v2, La/tcb0;->i:Ljava/lang/String;

    .line 178
    .line 179
    iput-object v9, v2, La/tcb0;->j:Ljava/lang/Throwable;

    .line 180
    .line 181
    iput-wide v13, v2, La/tcb0;->k:J

    .line 182
    .line 183
    iput-wide v11, v2, La/tcb0;->l:J

    .line 184
    .line 185
    iput v8, v2, La/tcb0;->m:I

    .line 186
    .line 187
    iput v6, v2, La/tcb0;->n:I

    .line 188
    .line 189
    iput v0, v2, La/tcb0;->o:I

    .line 190
    .line 191
    iput v10, v2, La/tcb0;->r:I

    .line 192
    .line 193
    invoke-virtual {v15, v4, v2}, La/pv00;->e(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 197
    if-ne v0, v3, :cond_5

    .line 198
    .line 199
    goto/16 :goto_6

    .line 200
    .line 201
    :cond_5
    move-wide/from16 v16, v13

    .line 202
    .line 203
    move-object v14, v4

    .line 204
    move v4, v6

    .line 205
    move v6, v8

    .line 206
    move-object v13, v9

    .line 207
    move-wide v8, v11

    .line 208
    move-wide/from16 v11, v16

    .line 209
    .line 210
    :goto_2
    :try_start_2
    check-cast v0, La/xcb0;

    .line 211
    .line 212
    invoke-static {v0}, La/x8x;->E(La/xcb0;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 216
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v1, v5, La/rcb0;->a:Ljava/util/LinkedHashMap;

    .line 226
    .line 227
    invoke-interface {v1, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    move-object v15, v9

    .line 233
    move-object v9, v0

    .line 234
    :goto_3
    invoke-static {v9}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_a

    .line 239
    .line 240
    if-nez v8, :cond_6

    .line 241
    .line 242
    new-instance v0, La/el50;

    .line 243
    .line 244
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    move-object v9, v0

    .line 248
    const/4 v0, 0x0

    .line 249
    goto :goto_1

    .line 250
    :cond_6
    move/from16 p1, v8

    .line 251
    .line 252
    int-to-long v7, v6

    .line 253
    cmp-long v0, v7, v13

    .line 254
    .line 255
    if-gez v0, :cond_7

    .line 256
    .line 257
    move v0, v10

    .line 258
    goto :goto_4

    .line 259
    :cond_7
    const/4 v0, 0x0

    .line 260
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 261
    .line 262
    if-eqz v0, :cond_8

    .line 263
    .line 264
    iput-object v4, v2, La/tcb0;->i:Ljava/lang/String;

    .line 265
    .line 266
    iput-object v15, v2, La/tcb0;->j:Ljava/lang/Throwable;

    .line 267
    .line 268
    iput-wide v13, v2, La/tcb0;->k:J

    .line 269
    .line 270
    iput-wide v11, v2, La/tcb0;->l:J

    .line 271
    .line 272
    move/from16 v8, p1

    .line 273
    .line 274
    iput v8, v2, La/tcb0;->m:I

    .line 275
    .line 276
    iput v6, v2, La/tcb0;->n:I

    .line 277
    .line 278
    iput v0, v2, La/tcb0;->o:I

    .line 279
    .line 280
    const/4 v7, 0x2

    .line 281
    iput v7, v2, La/tcb0;->r:I

    .line 282
    .line 283
    invoke-static {v11, v12, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    if-ne v9, v3, :cond_9

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_8
    move/from16 v8, p1

    .line 291
    .line 292
    const/4 v7, 0x2

    .line 293
    new-instance v15, La/el50;

    .line 294
    .line 295
    invoke-direct {v15, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    :cond_9
    move-object v9, v15

    .line 299
    goto :goto_1

    .line 300
    :cond_a
    invoke-static {v9}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_e

    .line 305
    .line 306
    move/from16 p1, v8

    .line 307
    .line 308
    int-to-long v7, v6

    .line 309
    cmp-long v0, v7, v13

    .line 310
    .line 311
    if-gez v0, :cond_b

    .line 312
    .line 313
    move v0, v10

    .line 314
    goto :goto_5

    .line 315
    :cond_b
    const/4 v0, 0x0

    .line 316
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 317
    .line 318
    if-eqz v0, :cond_c

    .line 319
    .line 320
    iput-object v4, v2, La/tcb0;->i:Ljava/lang/String;

    .line 321
    .line 322
    iput-object v15, v2, La/tcb0;->j:Ljava/lang/Throwable;

    .line 323
    .line 324
    iput-wide v13, v2, La/tcb0;->k:J

    .line 325
    .line 326
    iput-wide v11, v2, La/tcb0;->l:J

    .line 327
    .line 328
    move/from16 v8, p1

    .line 329
    .line 330
    iput v8, v2, La/tcb0;->m:I

    .line 331
    .line 332
    iput v6, v2, La/tcb0;->n:I

    .line 333
    .line 334
    iput v0, v2, La/tcb0;->o:I

    .line 335
    .line 336
    const/4 v7, 0x3

    .line 337
    iput v7, v2, La/tcb0;->r:I

    .line 338
    .line 339
    invoke-static {v11, v12, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    if-ne v9, v3, :cond_d

    .line 344
    .line 345
    :goto_6
    return-object v3

    .line 346
    :goto_7
    const/4 v7, 0x2

    .line 347
    goto/16 :goto_1

    .line 348
    .line 349
    :cond_c
    move/from16 v8, p1

    .line 350
    .line 351
    const/4 v7, 0x3

    .line 352
    new-instance v15, La/dag0;

    .line 353
    .line 354
    invoke-direct {v15, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    :cond_d
    :goto_8
    move-object v9, v15

    .line 358
    goto :goto_7

    .line 359
    :cond_e
    const/4 v7, 0x3

    .line 360
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 361
    .line 362
    .line 363
    const/4 v0, 0x0

    .line 364
    goto :goto_7

    .line 365
    :cond_f
    if-nez v9, :cond_10

    .line 366
    .line 367
    const-string v0, "Unexpected error"

    .line 368
    .line 369
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-object p2

    .line 373
    :cond_10
    throw v9

    .line 374
    :cond_11
    return-object v0
.end method
