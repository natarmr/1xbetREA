.class public final La/zz90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/dq00;

.field public final c:La/sbx0;

.field public final d:La/knf0;


# direct methods
.method public constructor <init>(La/mne;La/dq00;La/sbx0;La/knf0;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zz90;->a:La/mne;

    .line 8
    .line 9
    iput-object p2, p0, La/zz90;->b:La/dq00;

    .line 10
    .line 11
    iput-object p3, p0, La/zz90;->c:La/sbx0;

    .line 12
    .line 13
    iput-object p4, p0, La/zz90;->d:La/knf0;

    .line 14
    .line 15
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
    instance-of v2, v0, La/yz90;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/yz90;

    .line 11
    .line 12
    iget v3, v2, La/yz90;->r:I

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
    iput v3, v2, La/yz90;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/yz90;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/yz90;-><init>(La/zz90;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/yz90;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/yz90;->r:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v9, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget v4, v2, La/yz90;->o:I

    .line 48
    .line 49
    iget v10, v2, La/yz90;->n:I

    .line 50
    .line 51
    iget v11, v2, La/yz90;->m:I

    .line 52
    .line 53
    iget-wide v12, v2, La/yz90;->l:J

    .line 54
    .line 55
    iget-wide v14, v2, La/yz90;->k:J

    .line 56
    .line 57
    iget-object v8, v2, La/yz90;->j:Ljava/lang/Throwable;

    .line 58
    .line 59
    iget-object v5, v2, La/yz90;->i:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move v0, v4

    .line 65
    move-object/from16 p1, v7

    .line 66
    .line 67
    const/4 v7, 0x3

    .line 68
    move-object v4, v2

    .line 69
    move-object v2, v5

    .line 70
    move v5, v10

    .line 71
    move-object v10, v8

    .line 72
    move v8, v11

    .line 73
    move-wide v11, v12

    .line 74
    move-wide v13, v14

    .line 75
    move v15, v6

    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v7

    .line 84
    :cond_2
    iget v4, v2, La/yz90;->o:I

    .line 85
    .line 86
    iget v5, v2, La/yz90;->n:I

    .line 87
    .line 88
    iget v8, v2, La/yz90;->m:I

    .line 89
    .line 90
    iget-wide v10, v2, La/yz90;->l:J

    .line 91
    .line 92
    iget-wide v12, v2, La/yz90;->k:J

    .line 93
    .line 94
    iget-object v14, v2, La/yz90;->j:Ljava/lang/Throwable;

    .line 95
    .line 96
    iget-object v15, v2, La/yz90;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-wide/from16 v16, v10

    .line 102
    .line 103
    move-object v10, v14

    .line 104
    move-wide v13, v12

    .line 105
    move-wide/from16 v11, v16

    .line 106
    .line 107
    move v0, v4

    .line 108
    move-object v4, v2

    .line 109
    move-object v2, v15

    .line 110
    move v15, v6

    .line 111
    move-object v6, v7

    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_3
    iget v4, v2, La/yz90;->n:I

    .line 115
    .line 116
    iget v5, v2, La/yz90;->m:I

    .line 117
    .line 118
    iget-wide v10, v2, La/yz90;->l:J

    .line 119
    .line 120
    iget-wide v12, v2, La/yz90;->k:J

    .line 121
    .line 122
    iget-object v8, v2, La/yz90;->j:Ljava/lang/Throwable;

    .line 123
    .line 124
    iget-object v14, v2, La/yz90;->i:Ljava/lang/String;

    .line 125
    .line 126
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    move/from16 v16, v4

    .line 132
    .line 133
    move-object v4, v2

    .line 134
    move-object v2, v14

    .line 135
    move-wide v13, v12

    .line 136
    move-wide v11, v10

    .line 137
    move-object v10, v8

    .line 138
    move v8, v5

    .line 139
    move/from16 v5, v16

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-wide v4, La/cag0;->a:J

    .line 146
    .line 147
    const-wide/16 v10, 0x3

    .line 148
    .line 149
    move v0, v9

    .line 150
    move v8, v0

    .line 151
    move-wide v13, v10

    .line 152
    move-wide v11, v4

    .line 153
    move-object v10, v7

    .line 154
    const/4 v5, 0x0

    .line 155
    move-object v4, v2

    .line 156
    move-object/from16 v2, p1

    .line 157
    .line 158
    :goto_1
    if-eqz v0, :cond_f

    .line 159
    .line 160
    :try_start_1
    iget-object v15, v1, La/zz90;->a:La/mne;

    .line 161
    .line 162
    iget-object v15, v15, La/mne;->b:La/dvj;

    .line 163
    .line 164
    new-instance v6, La/o690;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    .line 166
    const/4 v9, 0x7

    .line 167
    :try_start_2
    invoke-direct {v6, v1, v2, v7, v9}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 168
    .line 169
    .line 170
    iput-object v2, v4, La/yz90;->i:Ljava/lang/String;

    .line 171
    .line 172
    iput-object v10, v4, La/yz90;->j:Ljava/lang/Throwable;

    .line 173
    .line 174
    iput-wide v13, v4, La/yz90;->k:J

    .line 175
    .line 176
    iput-wide v11, v4, La/yz90;->l:J

    .line 177
    .line 178
    iput v8, v4, La/yz90;->m:I

    .line 179
    .line 180
    iput v5, v4, La/yz90;->n:I

    .line 181
    .line 182
    iput v0, v4, La/yz90;->o:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 183
    .line 184
    const/4 v9, 0x1

    .line 185
    :try_start_3
    iput v9, v4, La/yz90;->r:I

    .line 186
    .line 187
    invoke-static {v15, v6, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    if-ne v0, v3, :cond_5

    .line 192
    .line 193
    goto/16 :goto_8

    .line 194
    .line 195
    :cond_5
    move-wide/from16 v16, v13

    .line 196
    .line 197
    move-object v14, v2

    .line 198
    move-object v2, v4

    .line 199
    move v4, v5

    .line 200
    move v5, v8

    .line 201
    move-object v8, v10

    .line 202
    move-wide v10, v11

    .line 203
    move-wide/from16 v12, v16

    .line 204
    .line 205
    :goto_2
    :try_start_4
    check-cast v0, Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 206
    .line 207
    return-object v0

    .line 208
    :catchall_1
    move-exception v0

    .line 209
    goto :goto_3

    .line 210
    :catchall_2
    move-exception v0

    .line 211
    const/4 v9, 0x1

    .line 212
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-eqz v6, :cond_a

    .line 217
    .line 218
    if-nez v8, :cond_6

    .line 219
    .line 220
    new-instance v10, La/el50;

    .line 221
    .line 222
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    const/4 v0, 0x0

    .line 226
    const/4 v6, 0x2

    .line 227
    goto :goto_1

    .line 228
    :cond_6
    move-object v6, v7

    .line 229
    move/from16 p1, v8

    .line 230
    .line 231
    int-to-long v7, v5

    .line 232
    cmp-long v7, v7, v13

    .line 233
    .line 234
    if-gez v7, :cond_7

    .line 235
    .line 236
    move v7, v9

    .line 237
    goto :goto_4

    .line 238
    :cond_7
    const/4 v7, 0x0

    .line 239
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 240
    .line 241
    if-eqz v7, :cond_8

    .line 242
    .line 243
    iput-object v2, v4, La/yz90;->i:Ljava/lang/String;

    .line 244
    .line 245
    iput-object v10, v4, La/yz90;->j:Ljava/lang/Throwable;

    .line 246
    .line 247
    iput-wide v13, v4, La/yz90;->k:J

    .line 248
    .line 249
    iput-wide v11, v4, La/yz90;->l:J

    .line 250
    .line 251
    move/from16 v8, p1

    .line 252
    .line 253
    iput v8, v4, La/yz90;->m:I

    .line 254
    .line 255
    iput v5, v4, La/yz90;->n:I

    .line 256
    .line 257
    iput v7, v4, La/yz90;->o:I

    .line 258
    .line 259
    const/4 v15, 0x2

    .line 260
    iput v15, v4, La/yz90;->r:I

    .line 261
    .line 262
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-ne v0, v3, :cond_9

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :goto_5
    move-object v7, v6

    .line 270
    :goto_6
    move v6, v15

    .line 271
    goto :goto_1

    .line 272
    :cond_8
    move/from16 v8, p1

    .line 273
    .line 274
    const/4 v15, 0x2

    .line 275
    new-instance v10, La/el50;

    .line 276
    .line 277
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    :cond_9
    move v0, v7

    .line 281
    goto :goto_5

    .line 282
    :cond_a
    move-object v6, v7

    .line 283
    const/4 v15, 0x2

    .line 284
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-eqz v7, :cond_e

    .line 289
    .line 290
    move-object/from16 p1, v6

    .line 291
    .line 292
    int-to-long v6, v5

    .line 293
    cmp-long v6, v6, v13

    .line 294
    .line 295
    if-gez v6, :cond_b

    .line 296
    .line 297
    move v6, v9

    .line 298
    goto :goto_7

    .line 299
    :cond_b
    const/4 v6, 0x0

    .line 300
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 301
    .line 302
    if-eqz v6, :cond_d

    .line 303
    .line 304
    iput-object v2, v4, La/yz90;->i:Ljava/lang/String;

    .line 305
    .line 306
    iput-object v10, v4, La/yz90;->j:Ljava/lang/Throwable;

    .line 307
    .line 308
    iput-wide v13, v4, La/yz90;->k:J

    .line 309
    .line 310
    iput-wide v11, v4, La/yz90;->l:J

    .line 311
    .line 312
    iput v8, v4, La/yz90;->m:I

    .line 313
    .line 314
    iput v5, v4, La/yz90;->n:I

    .line 315
    .line 316
    iput v6, v4, La/yz90;->o:I

    .line 317
    .line 318
    const/4 v7, 0x3

    .line 319
    iput v7, v4, La/yz90;->r:I

    .line 320
    .line 321
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-ne v0, v3, :cond_c

    .line 326
    .line 327
    :goto_8
    return-object v3

    .line 328
    :cond_c
    move v0, v6

    .line 329
    :goto_9
    move-object/from16 v7, p1

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_d
    const/4 v7, 0x3

    .line 333
    new-instance v10, La/dag0;

    .line 334
    .line 335
    invoke-direct {v10, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v7, p1

    .line 339
    .line 340
    move v0, v6

    .line 341
    goto :goto_6

    .line 342
    :cond_e
    move-object/from16 p1, v6

    .line 343
    .line 344
    const/4 v7, 0x3

    .line 345
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 346
    .line 347
    .line 348
    move-object/from16 v7, p1

    .line 349
    .line 350
    move-object v10, v0

    .line 351
    move v6, v15

    .line 352
    const/4 v0, 0x0

    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :cond_f
    move-object/from16 p1, v7

    .line 356
    .line 357
    if-nez v10, :cond_10

    .line 358
    .line 359
    const-string v0, "Unexpected error"

    .line 360
    .line 361
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    return-object p1

    .line 365
    :cond_10
    throw v10
.end method
