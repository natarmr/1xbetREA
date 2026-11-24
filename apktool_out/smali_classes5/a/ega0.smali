.class public final La/ega0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:I

.field public m:I

.field public n:I

.field public o:La/fga0;

.field public p:Ljava/lang/Throwable;

.field public q:Z

.field public r:B

.field public final synthetic s:La/fga0;

.field public final synthetic t:Z

.field public final synthetic u:J


# direct methods
.method public constructor <init>(La/fga0;ZJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ega0;->s:La/fga0;

    .line 2
    .line 3
    iput-boolean p2, p0, La/ega0;->t:Z

    .line 4
    .line 5
    iput-wide p3, p0, La/ega0;->u:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/ega0;

    .line 2
    .line 3
    iget-boolean v2, p0, La/ega0;->t:Z

    .line 4
    .line 5
    iget-wide v3, p0, La/ega0;->u:J

    .line 6
    .line 7
    iget-object v1, p0, La/ega0;->s:La/fga0;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/ega0;-><init>(La/fga0;ZJLa/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/ega0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ega0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ega0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/ega0;->r:B

    .line 6
    .line 7
    iget-object v3, v1, La/ega0;->s:La/fga0;

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v8, 0x1

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    if-eq v0, v8, :cond_2

    .line 15
    .line 16
    if-eq v0, v5, :cond_1

    .line 17
    .line 18
    if-ne v0, v4, :cond_0

    .line 19
    .line 20
    iget v0, v1, La/ega0;->n:I

    .line 21
    .line 22
    iget v9, v1, La/ega0;->m:I

    .line 23
    .line 24
    iget-wide v10, v1, La/ega0;->k:J

    .line 25
    .line 26
    iget-boolean v12, v1, La/ega0;->q:Z

    .line 27
    .line 28
    iget v13, v1, La/ega0;->l:I

    .line 29
    .line 30
    iget-wide v14, v1, La/ega0;->j:J

    .line 31
    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    iget-wide v6, v1, La/ega0;->i:J

    .line 35
    .line 36
    iget-object v4, v1, La/ega0;->p:Ljava/lang/Throwable;

    .line 37
    .line 38
    iget-object v5, v1, La/ega0;->o:La/fga0;

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v8, v2

    .line 44
    move-object/from16 v18, v3

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    move-wide/from16 v19, v14

    .line 48
    .line 49
    move-object v14, v4

    .line 50
    move-object v15, v5

    .line 51
    move v4, v9

    .line 52
    move v9, v13

    .line 53
    move-wide/from16 v21, v6

    .line 54
    .line 55
    move v7, v12

    .line 56
    move-wide/from16 v12, v21

    .line 57
    .line 58
    move-wide v5, v10

    .line 59
    move-wide/from16 v10, v19

    .line 60
    .line 61
    goto/16 :goto_9

    .line 62
    .line 63
    :cond_0
    const/16 v16, 0x0

    .line 64
    .line 65
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v16

    .line 71
    :cond_1
    const/16 v16, 0x0

    .line 72
    .line 73
    iget v0, v1, La/ega0;->n:I

    .line 74
    .line 75
    iget v4, v1, La/ega0;->m:I

    .line 76
    .line 77
    iget-wide v5, v1, La/ega0;->k:J

    .line 78
    .line 79
    iget-boolean v7, v1, La/ega0;->q:Z

    .line 80
    .line 81
    iget v9, v1, La/ega0;->l:I

    .line 82
    .line 83
    iget-wide v10, v1, La/ega0;->j:J

    .line 84
    .line 85
    iget-wide v12, v1, La/ega0;->i:J

    .line 86
    .line 87
    iget-object v14, v1, La/ega0;->p:Ljava/lang/Throwable;

    .line 88
    .line 89
    iget-object v15, v1, La/ega0;->o:La/fga0;

    .line 90
    .line 91
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v18, v3

    .line 95
    .line 96
    const/4 v3, 0x2

    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :cond_2
    const/16 v16, 0x0

    .line 100
    .line 101
    iget v4, v1, La/ega0;->m:I

    .line 102
    .line 103
    iget-wide v5, v1, La/ega0;->k:J

    .line 104
    .line 105
    iget-boolean v7, v1, La/ega0;->q:Z

    .line 106
    .line 107
    iget v9, v1, La/ega0;->l:I

    .line 108
    .line 109
    iget-wide v10, v1, La/ega0;->j:J

    .line 110
    .line 111
    iget-wide v12, v1, La/ega0;->i:J

    .line 112
    .line 113
    iget-object v14, v1, La/ega0;->p:Ljava/lang/Throwable;

    .line 114
    .line 115
    iget-object v15, v1, La/ega0;->o:La/fga0;

    .line 116
    .line 117
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    move-object/from16 v0, p1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_3

    .line 125
    :cond_3
    const/16 v16, 0x0

    .line 126
    .line 127
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-wide v4, La/cag0;->a:J

    .line 131
    .line 132
    iget-boolean v0, v1, La/ega0;->t:Z

    .line 133
    .line 134
    iget-wide v6, v1, La/ega0;->u:J

    .line 135
    .line 136
    const-wide/16 v9, 0x3

    .line 137
    .line 138
    move-object v15, v3

    .line 139
    move-wide v12, v9

    .line 140
    move-object/from16 v14, v16

    .line 141
    .line 142
    const/4 v9, 0x0

    .line 143
    move-wide v10, v4

    .line 144
    move-wide v5, v6

    .line 145
    const/4 v4, 0x0

    .line 146
    move v7, v0

    .line 147
    move v0, v8

    .line 148
    :goto_0
    if-eqz v0, :cond_e

    .line 149
    .line 150
    :try_start_1
    iput-object v15, v1, La/ega0;->o:La/fga0;

    .line 151
    .line 152
    iput-object v14, v1, La/ega0;->p:Ljava/lang/Throwable;

    .line 153
    .line 154
    iput-wide v12, v1, La/ega0;->i:J

    .line 155
    .line 156
    iput-wide v10, v1, La/ega0;->j:J

    .line 157
    .line 158
    iput v9, v1, La/ega0;->l:I

    .line 159
    .line 160
    iput-boolean v7, v1, La/ega0;->q:Z

    .line 161
    .line 162
    iput-wide v5, v1, La/ega0;->k:J

    .line 163
    .line 164
    iput v4, v1, La/ega0;->m:I

    .line 165
    .line 166
    iput v0, v1, La/ega0;->n:I

    .line 167
    .line 168
    iput-byte v8, v1, La/ega0;->r:B

    .line 169
    .line 170
    invoke-virtual {v15, v5, v6, v1, v7}, La/fga0;->a(JLa/zje;Z)Ljava/io/Serializable;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-ne v0, v2, :cond_4

    .line 175
    .line 176
    :goto_1
    move-object v8, v2

    .line 177
    goto/16 :goto_8

    .line 178
    .line 179
    :cond_4
    :goto_2
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    .line 181
    iget-object v1, v3, La/fga0;->d:La/rfa0;

    .line 182
    .line 183
    iget-object v1, v1, La/rfa0;->a:La/or30;

    .line 184
    .line 185
    invoke-virtual {v1, v0}, La/or30;->d(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 190
    .line 191
    .line 192
    move-result v17

    .line 193
    if-eqz v17, :cond_9

    .line 194
    .line 195
    if-nez v9, :cond_5

    .line 196
    .line 197
    new-instance v14, La/el50;

    .line 198
    .line 199
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    const/4 v0, 0x0

    .line 203
    goto :goto_0

    .line 204
    :cond_5
    move/from16 p1, v9

    .line 205
    .line 206
    int-to-long v8, v4

    .line 207
    cmp-long v8, v8, v12

    .line 208
    .line 209
    if-gez v8, :cond_6

    .line 210
    .line 211
    const/4 v8, 0x1

    .line 212
    goto :goto_4

    .line 213
    :cond_6
    const/4 v8, 0x0

    .line 214
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 215
    .line 216
    if-eqz v8, :cond_7

    .line 217
    .line 218
    iput-object v15, v1, La/ega0;->o:La/fga0;

    .line 219
    .line 220
    iput-object v14, v1, La/ega0;->p:Ljava/lang/Throwable;

    .line 221
    .line 222
    iput-wide v12, v1, La/ega0;->i:J

    .line 223
    .line 224
    iput-wide v10, v1, La/ega0;->j:J

    .line 225
    .line 226
    move/from16 v9, p1

    .line 227
    .line 228
    iput v9, v1, La/ega0;->l:I

    .line 229
    .line 230
    iput-boolean v7, v1, La/ega0;->q:Z

    .line 231
    .line 232
    iput-wide v5, v1, La/ega0;->k:J

    .line 233
    .line 234
    iput v4, v1, La/ega0;->m:I

    .line 235
    .line 236
    iput v8, v1, La/ega0;->n:I

    .line 237
    .line 238
    move-object/from16 v18, v3

    .line 239
    .line 240
    const/4 v3, 0x2

    .line 241
    iput-byte v3, v1, La/ega0;->r:B

    .line 242
    .line 243
    invoke-static {v10, v11, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-ne v0, v2, :cond_8

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :goto_5
    move-object/from16 v3, v18

    .line 251
    .line 252
    :goto_6
    const/4 v8, 0x1

    .line 253
    goto :goto_0

    .line 254
    :cond_7
    move/from16 v9, p1

    .line 255
    .line 256
    move-object/from16 v18, v3

    .line 257
    .line 258
    const/4 v3, 0x2

    .line 259
    new-instance v14, La/el50;

    .line 260
    .line 261
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    :cond_8
    move v0, v8

    .line 265
    goto :goto_5

    .line 266
    :cond_9
    move-object/from16 v18, v3

    .line 267
    .line 268
    const/4 v3, 0x2

    .line 269
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    if-eqz v8, :cond_d

    .line 274
    .line 275
    move-object v8, v2

    .line 276
    int-to-long v2, v4

    .line 277
    cmp-long v2, v2, v12

    .line 278
    .line 279
    if-gez v2, :cond_a

    .line 280
    .line 281
    const/4 v2, 0x1

    .line 282
    goto :goto_7

    .line 283
    :cond_a
    const/4 v2, 0x0

    .line 284
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 285
    .line 286
    if-eqz v2, :cond_b

    .line 287
    .line 288
    iput-object v15, v1, La/ega0;->o:La/fga0;

    .line 289
    .line 290
    iput-object v14, v1, La/ega0;->p:Ljava/lang/Throwable;

    .line 291
    .line 292
    iput-wide v12, v1, La/ega0;->i:J

    .line 293
    .line 294
    iput-wide v10, v1, La/ega0;->j:J

    .line 295
    .line 296
    iput v9, v1, La/ega0;->l:I

    .line 297
    .line 298
    iput-boolean v7, v1, La/ega0;->q:Z

    .line 299
    .line 300
    iput-wide v5, v1, La/ega0;->k:J

    .line 301
    .line 302
    iput v4, v1, La/ega0;->m:I

    .line 303
    .line 304
    iput v2, v1, La/ega0;->n:I

    .line 305
    .line 306
    const/4 v3, 0x3

    .line 307
    iput-byte v3, v1, La/ega0;->r:B

    .line 308
    .line 309
    invoke-static {v10, v11, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-ne v0, v8, :cond_c

    .line 314
    .line 315
    :goto_8
    return-object v8

    .line 316
    :goto_9
    move-object v2, v8

    .line 317
    goto :goto_5

    .line 318
    :cond_b
    const/4 v3, 0x3

    .line 319
    new-instance v14, La/dag0;

    .line 320
    .line 321
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    :cond_c
    move v0, v2

    .line 325
    goto :goto_9

    .line 326
    :cond_d
    move-object v8, v2

    .line 327
    const/4 v3, 0x3

    .line 328
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 329
    .line 330
    .line 331
    move-object v14, v0

    .line 332
    move-object/from16 v3, v18

    .line 333
    .line 334
    const/4 v0, 0x0

    .line 335
    goto :goto_6

    .line 336
    :cond_e
    if-nez v14, :cond_f

    .line 337
    .line 338
    const-string v0, "Unexpected error"

    .line 339
    .line 340
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-object v16

    .line 344
    :cond_f
    throw v14
.end method
