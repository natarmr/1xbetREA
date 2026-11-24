.class public final La/rsu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n660;


# direct methods
.method public synthetic constructor <init>(La/n660;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rsu;->a:La/n660;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/io/Serializable;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/qsu;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/qsu;

    .line 11
    .line 12
    iget v3, v2, La/qsu;->q:I

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
    iput v3, v2, La/qsu;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/qsu;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/qsu;-><init>(La/rsu;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/qsu;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/qsu;->q:I

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
    iget v4, v2, La/qsu;->m:I

    .line 47
    .line 48
    iget v10, v2, La/qsu;->l:I

    .line 49
    .line 50
    iget v11, v2, La/qsu;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/qsu;->j:J

    .line 53
    .line 54
    iget-wide v14, v2, La/qsu;->i:J

    .line 55
    .line 56
    const/16 p1, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/qsu;->n:Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move v0, v4

    .line 64
    move v8, v5

    .line 65
    move v4, v10

    .line 66
    move-wide/from16 v17, v14

    .line 67
    .line 68
    move-object v14, v7

    .line 69
    move v7, v11

    .line 70
    move-wide v10, v12

    .line 71
    move-wide/from16 v12, v17

    .line 72
    .line 73
    goto/16 :goto_a

    .line 74
    .line 75
    :cond_1
    const/16 p1, 0x0

    .line 76
    .line 77
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_2
    const/16 p1, 0x0

    .line 84
    .line 85
    iget v4, v2, La/qsu;->m:I

    .line 86
    .line 87
    iget v7, v2, La/qsu;->l:I

    .line 88
    .line 89
    iget v10, v2, La/qsu;->k:I

    .line 90
    .line 91
    iget-wide v11, v2, La/qsu;->j:J

    .line 92
    .line 93
    iget-wide v13, v2, La/qsu;->i:J

    .line 94
    .line 95
    iget-object v15, v2, La/qsu;->n:Ljava/lang/Throwable;

    .line 96
    .line 97
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move v0, v4

    .line 101
    move v4, v7

    .line 102
    move v7, v10

    .line 103
    move-wide v10, v11

    .line 104
    move-wide v12, v13

    .line 105
    move-object v14, v15

    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_3
    const/16 p1, 0x0

    .line 109
    .line 110
    iget v4, v2, La/qsu;->l:I

    .line 111
    .line 112
    iget v7, v2, La/qsu;->k:I

    .line 113
    .line 114
    iget-wide v10, v2, La/qsu;->j:J

    .line 115
    .line 116
    iget-wide v12, v2, La/qsu;->i:J

    .line 117
    .line 118
    iget-object v14, v2, La/qsu;->n:Ljava/lang/Throwable;

    .line 119
    .line 120
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_0
    move-exception v0

    .line 125
    goto :goto_4

    .line 126
    :cond_4
    const/16 p1, 0x0

    .line 127
    .line 128
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-wide v10, La/cag0;->a:J

    .line 132
    .line 133
    const-wide/16 v12, 0x3

    .line 134
    .line 135
    move-object/from16 v14, p1

    .line 136
    .line 137
    move v0, v9

    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v7, 0x0

    .line 140
    :goto_1
    if-eqz v0, :cond_12

    .line 141
    .line 142
    :try_start_1
    iget-object v15, v1, La/rsu;->a:La/n660;

    .line 143
    .line 144
    iput-object v14, v2, La/qsu;->n:Ljava/lang/Throwable;

    .line 145
    .line 146
    iput-wide v12, v2, La/qsu;->i:J

    .line 147
    .line 148
    iput-wide v10, v2, La/qsu;->j:J

    .line 149
    .line 150
    iput v7, v2, La/qsu;->k:I

    .line 151
    .line 152
    iput v4, v2, La/qsu;->l:I

    .line 153
    .line 154
    iput v0, v2, La/qsu;->m:I

    .line 155
    .line 156
    iput v9, v2, La/qsu;->q:I

    .line 157
    .line 158
    invoke-virtual {v15, v2}, La/n660;->v(La/zje;)Ljava/io/Serializable;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-ne v0, v3, :cond_5

    .line 163
    .line 164
    goto/16 :goto_9

    .line 165
    .line 166
    :cond_5
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 167
    .line 168
    new-instance v15, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v16

    .line 181
    if-eqz v16, :cond_7

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    move-object v9, v8

    .line 188
    check-cast v9, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 189
    .line 190
    iget v5, v9, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;->a:I

    .line 191
    .line 192
    if-lez v5, :cond_6

    .line 193
    .line 194
    iget-object v5, v9, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;->b:Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-nez v5, :cond_6

    .line 201
    .line 202
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_6
    const/4 v5, 0x3

    .line 206
    const/4 v9, 0x1

    .line 207
    goto :goto_3

    .line 208
    :cond_7
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_8

    .line 213
    .line 214
    return-object v15

    .line 215
    :cond_8
    new-instance v0, La/uun;

    .line 216
    .line 217
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 218
    .line 219
    .line 220
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    :goto_4
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_d

    .line 226
    .line 227
    if-nez v7, :cond_9

    .line 228
    .line 229
    new-instance v14, La/el50;

    .line 230
    .line 231
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    :goto_5
    const/4 v5, 0x3

    .line 236
    :goto_6
    const/4 v9, 0x1

    .line 237
    goto :goto_1

    .line 238
    :cond_9
    int-to-long v8, v4

    .line 239
    cmp-long v5, v8, v12

    .line 240
    .line 241
    if-gez v5, :cond_a

    .line 242
    .line 243
    const/4 v5, 0x1

    .line 244
    goto :goto_7

    .line 245
    :cond_a
    const/4 v5, 0x0

    .line 246
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 247
    .line 248
    if-eqz v5, :cond_b

    .line 249
    .line 250
    iput-object v14, v2, La/qsu;->n:Ljava/lang/Throwable;

    .line 251
    .line 252
    iput-wide v12, v2, La/qsu;->i:J

    .line 253
    .line 254
    iput-wide v10, v2, La/qsu;->j:J

    .line 255
    .line 256
    iput v7, v2, La/qsu;->k:I

    .line 257
    .line 258
    iput v4, v2, La/qsu;->l:I

    .line 259
    .line 260
    iput v5, v2, La/qsu;->m:I

    .line 261
    .line 262
    iput v6, v2, La/qsu;->q:I

    .line 263
    .line 264
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-ne v0, v3, :cond_c

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_b
    new-instance v14, La/el50;

    .line 272
    .line 273
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    :cond_c
    move v0, v5

    .line 277
    goto :goto_5

    .line 278
    :cond_d
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-eqz v5, :cond_11

    .line 283
    .line 284
    int-to-long v8, v4

    .line 285
    cmp-long v5, v8, v12

    .line 286
    .line 287
    if-gez v5, :cond_e

    .line 288
    .line 289
    const/4 v5, 0x1

    .line 290
    goto :goto_8

    .line 291
    :cond_e
    const/4 v5, 0x0

    .line 292
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 293
    .line 294
    if-eqz v5, :cond_f

    .line 295
    .line 296
    iput-object v14, v2, La/qsu;->n:Ljava/lang/Throwable;

    .line 297
    .line 298
    iput-wide v12, v2, La/qsu;->i:J

    .line 299
    .line 300
    iput-wide v10, v2, La/qsu;->j:J

    .line 301
    .line 302
    iput v7, v2, La/qsu;->k:I

    .line 303
    .line 304
    iput v4, v2, La/qsu;->l:I

    .line 305
    .line 306
    iput v5, v2, La/qsu;->m:I

    .line 307
    .line 308
    const/4 v8, 0x3

    .line 309
    iput v8, v2, La/qsu;->q:I

    .line 310
    .line 311
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v3, :cond_10

    .line 316
    .line 317
    :goto_9
    return-object v3

    .line 318
    :goto_a
    move v5, v8

    .line 319
    goto :goto_6

    .line 320
    :cond_f
    const/4 v8, 0x3

    .line 321
    new-instance v14, La/dag0;

    .line 322
    .line 323
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :cond_10
    move v0, v5

    .line 327
    goto :goto_a

    .line 328
    :cond_11
    const/4 v8, 0x3

    .line 329
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 330
    .line 331
    .line 332
    move-object v14, v0

    .line 333
    move v5, v8

    .line 334
    const/4 v0, 0x0

    .line 335
    goto :goto_6

    .line 336
    :cond_12
    if-nez v14, :cond_13

    .line 337
    .line 338
    const-string v0, "Unexpected error"

    .line 339
    .line 340
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-object p1

    .line 344
    :cond_13
    throw v14
.end method
