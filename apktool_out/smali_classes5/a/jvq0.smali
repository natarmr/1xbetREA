.class public final La/jvq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/btt0;

.field public final c:La/mne;

.field public final d:La/k050;

.field public final e:La/enj0;


# direct methods
.method public constructor <init>(La/knf0;La/btt0;La/mne;La/gii0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jvq0;->a:La/knf0;

    .line 5
    .line 6
    iput-object p2, p0, La/jvq0;->b:La/btt0;

    .line 7
    .line 8
    iput-object p3, p0, La/jvq0;->c:La/mne;

    .line 9
    .line 10
    new-instance p1, La/k050;

    .line 11
    .line 12
    invoke-direct {p1}, La/k050;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/jvq0;->d:La/k050;

    .line 16
    .line 17
    new-instance p1, La/enj0;

    .line 18
    .line 19
    const/16 p2, 0x18

    .line 20
    .line 21
    invoke-direct {p1, p4, p2}, La/enj0;-><init>(La/gii0;B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/jvq0;->e:La/enj0;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/ivq0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/ivq0;

    .line 11
    .line 12
    iget v3, v2, La/ivq0;->r:I

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
    iput v3, v2, La/ivq0;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/ivq0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/ivq0;-><init>(La/jvq0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/ivq0;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/ivq0;->r:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/ivq0;->o:I

    .line 47
    .line 48
    iget v10, v2, La/ivq0;->n:I

    .line 49
    .line 50
    iget v11, v2, La/ivq0;->m:I

    .line 51
    .line 52
    iget-wide v12, v2, La/ivq0;->l:J

    .line 53
    .line 54
    iget-wide v14, v2, La/ivq0;->k:J

    .line 55
    .line 56
    const/16 p2, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/ivq0;->j:Ljava/lang/Throwable;

    .line 59
    .line 60
    iget-object v8, v2, La/ivq0;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move v0, v4

    .line 66
    move-object v4, v2

    .line 67
    move-object v2, v8

    .line 68
    move v8, v11

    .line 69
    move-wide v11, v12

    .line 70
    move-wide v13, v14

    .line 71
    move-object v15, v7

    .line 72
    move v7, v10

    .line 73
    move v10, v5

    .line 74
    goto/16 :goto_8

    .line 75
    .line 76
    :cond_1
    const/16 p2, 0x0

    .line 77
    .line 78
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p2

    .line 84
    :cond_2
    const/16 p2, 0x0

    .line 85
    .line 86
    iget v4, v2, La/ivq0;->o:I

    .line 87
    .line 88
    iget v7, v2, La/ivq0;->n:I

    .line 89
    .line 90
    iget v8, v2, La/ivq0;->m:I

    .line 91
    .line 92
    iget-wide v10, v2, La/ivq0;->l:J

    .line 93
    .line 94
    iget-wide v12, v2, La/ivq0;->k:J

    .line 95
    .line 96
    iget-object v14, v2, La/ivq0;->j:Ljava/lang/Throwable;

    .line 97
    .line 98
    iget-object v15, v2, La/ivq0;->i:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-wide/from16 v17, v10

    .line 104
    .line 105
    move-object v10, v14

    .line 106
    move-wide v13, v12

    .line 107
    move-wide/from16 v11, v17

    .line 108
    .line 109
    move v0, v4

    .line 110
    move-object v4, v2

    .line 111
    move-object v2, v15

    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_3
    const/16 p2, 0x0

    .line 115
    .line 116
    iget v4, v2, La/ivq0;->n:I

    .line 117
    .line 118
    iget v7, v2, La/ivq0;->m:I

    .line 119
    .line 120
    iget-wide v10, v2, La/ivq0;->l:J

    .line 121
    .line 122
    iget-wide v12, v2, La/ivq0;->k:J

    .line 123
    .line 124
    iget-object v8, v2, La/ivq0;->j:Ljava/lang/Throwable;

    .line 125
    .line 126
    iget-object v14, v2, La/ivq0;->i:Ljava/lang/String;

    .line 127
    .line 128
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move/from16 v17, v4

    .line 135
    .line 136
    move-object v4, v2

    .line 137
    move-object v2, v14

    .line 138
    move-wide v13, v12

    .line 139
    move-wide v11, v10

    .line 140
    move-object v10, v8

    .line 141
    move v8, v7

    .line 142
    move/from16 v7, v17

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    const/16 p2, 0x0

    .line 146
    .line 147
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-wide v7, La/cag0;->a:J

    .line 151
    .line 152
    const-wide/16 v10, 0x3

    .line 153
    .line 154
    move-object v4, v2

    .line 155
    move v0, v9

    .line 156
    move-wide v13, v10

    .line 157
    move-object/from16 v2, p1

    .line 158
    .line 159
    move-object/from16 v10, p2

    .line 160
    .line 161
    move-wide v11, v7

    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v8, 0x0

    .line 164
    :goto_1
    if-eqz v0, :cond_f

    .line 165
    .line 166
    :try_start_1
    iget-object v15, v1, La/jvq0;->e:La/enj0;

    .line 167
    .line 168
    invoke-virtual {v15}, La/enj0;->invoke()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    check-cast v15, La/vvq0;

    .line 173
    .line 174
    new-instance v5, La/cse0;

    .line 175
    .line 176
    iget-object v6, v1, La/jvq0;->a:La/knf0;

    .line 177
    .line 178
    invoke-virtual {v6}, La/knf0;->c()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-direct {v5, v2, v6}, La/cse0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iput-object v2, v4, La/ivq0;->i:Ljava/lang/String;

    .line 186
    .line 187
    iput-object v10, v4, La/ivq0;->j:Ljava/lang/Throwable;

    .line 188
    .line 189
    iput-wide v13, v4, La/ivq0;->k:J

    .line 190
    .line 191
    iput-wide v11, v4, La/ivq0;->l:J

    .line 192
    .line 193
    iput v8, v4, La/ivq0;->m:I

    .line 194
    .line 195
    iput v7, v4, La/ivq0;->n:I

    .line 196
    .line 197
    iput v0, v4, La/ivq0;->o:I

    .line 198
    .line 199
    iput v9, v4, La/ivq0;->r:I

    .line 200
    .line 201
    invoke-interface {v15, v5, v4}, La/vvq0;->a(La/cse0;La/yje;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 205
    if-ne v0, v3, :cond_5

    .line 206
    .line 207
    goto/16 :goto_7

    .line 208
    .line 209
    :cond_5
    move-wide/from16 v17, v13

    .line 210
    .line 211
    move-object v14, v2

    .line 212
    move-object v2, v4

    .line 213
    move v4, v7

    .line 214
    move v7, v8

    .line 215
    move-object v8, v10

    .line 216
    move-wide v10, v11

    .line 217
    move-wide/from16 v12, v17

    .line 218
    .line 219
    :goto_2
    :try_start_2
    check-cast v0, La/q16;

    .line 220
    .line 221
    invoke-static {v0}, La/qxw;->x(La/q16;)La/fse0;

    .line 222
    .line 223
    .line 224
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    return-object v0

    .line 226
    :catchall_1
    move-exception v0

    .line 227
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_a

    .line 232
    .line 233
    if-nez v8, :cond_6

    .line 234
    .line 235
    new-instance v10, La/el50;

    .line 236
    .line 237
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    const/4 v0, 0x0

    .line 241
    const/4 v5, 0x3

    .line 242
    const/4 v6, 0x2

    .line 243
    goto :goto_1

    .line 244
    :cond_6
    int-to-long v5, v7

    .line 245
    cmp-long v5, v5, v13

    .line 246
    .line 247
    if-gez v5, :cond_7

    .line 248
    .line 249
    move v5, v9

    .line 250
    goto :goto_4

    .line 251
    :cond_7
    const/4 v5, 0x0

    .line 252
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 253
    .line 254
    if-eqz v5, :cond_8

    .line 255
    .line 256
    iput-object v2, v4, La/ivq0;->i:Ljava/lang/String;

    .line 257
    .line 258
    iput-object v10, v4, La/ivq0;->j:Ljava/lang/Throwable;

    .line 259
    .line 260
    iput-wide v13, v4, La/ivq0;->k:J

    .line 261
    .line 262
    iput-wide v11, v4, La/ivq0;->l:J

    .line 263
    .line 264
    iput v8, v4, La/ivq0;->m:I

    .line 265
    .line 266
    iput v7, v4, La/ivq0;->n:I

    .line 267
    .line 268
    iput v5, v4, La/ivq0;->o:I

    .line 269
    .line 270
    const/4 v6, 0x2

    .line 271
    iput v6, v4, La/ivq0;->r:I

    .line 272
    .line 273
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-ne v0, v3, :cond_9

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :goto_5
    const/4 v5, 0x3

    .line 281
    goto :goto_1

    .line 282
    :cond_8
    const/4 v6, 0x2

    .line 283
    new-instance v10, La/el50;

    .line 284
    .line 285
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    :cond_9
    move v0, v5

    .line 289
    goto :goto_5

    .line 290
    :cond_a
    const/4 v6, 0x2

    .line 291
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-eqz v5, :cond_e

    .line 296
    .line 297
    move-object v15, v10

    .line 298
    int-to-long v9, v7

    .line 299
    cmp-long v9, v9, v13

    .line 300
    .line 301
    if-gez v9, :cond_b

    .line 302
    .line 303
    const/4 v9, 0x1

    .line 304
    goto :goto_6

    .line 305
    :cond_b
    const/4 v9, 0x0

    .line 306
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 307
    .line 308
    if-eqz v9, :cond_c

    .line 309
    .line 310
    iput-object v2, v4, La/ivq0;->i:Ljava/lang/String;

    .line 311
    .line 312
    iput-object v15, v4, La/ivq0;->j:Ljava/lang/Throwable;

    .line 313
    .line 314
    iput-wide v13, v4, La/ivq0;->k:J

    .line 315
    .line 316
    iput-wide v11, v4, La/ivq0;->l:J

    .line 317
    .line 318
    iput v8, v4, La/ivq0;->m:I

    .line 319
    .line 320
    iput v7, v4, La/ivq0;->n:I

    .line 321
    .line 322
    iput v9, v4, La/ivq0;->o:I

    .line 323
    .line 324
    const/4 v10, 0x3

    .line 325
    iput v10, v4, La/ivq0;->r:I

    .line 326
    .line 327
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    if-ne v0, v3, :cond_d

    .line 332
    .line 333
    :goto_7
    return-object v3

    .line 334
    :goto_8
    move v5, v10

    .line 335
    move-object v10, v15

    .line 336
    const/4 v9, 0x1

    .line 337
    goto/16 :goto_1

    .line 338
    .line 339
    :cond_c
    const/4 v10, 0x3

    .line 340
    new-instance v15, La/dag0;

    .line 341
    .line 342
    invoke-direct {v15, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 343
    .line 344
    .line 345
    :cond_d
    move v0, v9

    .line 346
    goto :goto_8

    .line 347
    :cond_e
    const/4 v10, 0x3

    .line 348
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 349
    .line 350
    .line 351
    move v5, v10

    .line 352
    const/4 v9, 0x1

    .line 353
    move-object v10, v0

    .line 354
    const/4 v0, 0x0

    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :cond_f
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
    return-object p2

    .line 365
    :cond_10
    throw v10
.end method
