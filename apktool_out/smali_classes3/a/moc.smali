.class public final La/moc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dn0;


# direct methods
.method public constructor <init>(La/dn0;)V
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
    iput-object p1, p0, La/moc;->a:La/dn0;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(La/dn0;Z)V
    .locals 0

    .line 10
    iput-object p1, p0, La/moc;->a:La/dn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IJLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, La/iqu;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/iqu;

    .line 9
    .line 10
    iget v2, v1, La/iqu;->r:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/iqu;->r:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/iqu;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/iqu;-><init>(La/moc;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, La/iqu;->p:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v1, La/iqu;->r:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v8, :cond_3

    .line 44
    .line 45
    if-ne v4, v5, :cond_2

    .line 46
    .line 47
    iget v2, v1, La/iqu;->n:I

    .line 48
    .line 49
    iget v4, v1, La/iqu;->m:I

    .line 50
    .line 51
    iget-boolean v9, v1, La/iqu;->o:Z

    .line 52
    .line 53
    iget-byte v10, v1, La/iqu;->l:B

    .line 54
    .line 55
    iget-wide v11, v1, La/iqu;->i:J

    .line 56
    .line 57
    iget-object v13, v1, La/iqu;->k:La/moc;

    .line 58
    .line 59
    iget-object v14, v1, La/iqu;->j:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    move-object/from16 v16, v13

    .line 65
    .line 66
    move v13, v2

    .line 67
    move-object/from16 v2, v16

    .line 68
    .line 69
    move-object/from16 v16, v14

    .line 70
    .line 71
    move v14, v4

    .line 72
    move-object/from16 v4, v16

    .line 73
    .line 74
    move-wide/from16 v16, v11

    .line 75
    .line 76
    move-object v12, v1

    .line 77
    move v11, v9

    .line 78
    move v1, v10

    .line 79
    move-wide/from16 v9, v16

    .line 80
    .line 81
    goto/16 :goto_9

    .line 82
    .line 83
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 84
    .line 85
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v6

    .line 89
    :cond_3
    iget v2, v1, La/iqu;->n:I

    .line 90
    .line 91
    iget v4, v1, La/iqu;->m:I

    .line 92
    .line 93
    iget-boolean v9, v1, La/iqu;->o:Z

    .line 94
    .line 95
    iget-byte v10, v1, La/iqu;->l:B

    .line 96
    .line 97
    iget-wide v11, v1, La/iqu;->i:J

    .line 98
    .line 99
    iget-object v13, v1, La/iqu;->k:La/moc;

    .line 100
    .line 101
    iget-object v14, v1, La/iqu;->j:Ljava/lang/String;

    .line 102
    .line 103
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-wide/from16 v9, p2

    .line 114
    .line 115
    move-object/from16 v4, p5

    .line 116
    .line 117
    move/from16 v11, p6

    .line 118
    .line 119
    move-object v12, v1

    .line 120
    move v13, v7

    .line 121
    move v14, v13

    .line 122
    move/from16 v1, p1

    .line 123
    .line 124
    :goto_1
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 125
    .line 126
    iget-object v0, v2, La/moc;->a:La/dn0;

    .line 127
    .line 128
    iput-object v4, v12, La/iqu;->j:Ljava/lang/String;

    .line 129
    .line 130
    iput-object v2, v12, La/iqu;->k:La/moc;

    .line 131
    .line 132
    iput-wide v9, v12, La/iqu;->i:J

    .line 133
    .line 134
    iput-byte v1, v12, La/iqu;->l:B

    .line 135
    .line 136
    iput-boolean v11, v12, La/iqu;->o:Z

    .line 137
    .line 138
    iput v14, v12, La/iqu;->m:I

    .line 139
    .line 140
    iput v13, v12, La/iqu;->n:I

    .line 141
    .line 142
    iput v8, v12, La/iqu;->r:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 143
    .line 144
    move-object/from16 p0, v0

    .line 145
    .line 146
    move/from16 p1, v1

    .line 147
    .line 148
    move-object/from16 p5, v4

    .line 149
    .line 150
    move-wide/from16 p2, v9

    .line 151
    .line 152
    move/from16 p6, v11

    .line 153
    .line 154
    move-object/from16 p4, v12

    .line 155
    .line 156
    :try_start_2
    invoke-virtual/range {p0 .. p6}, La/dn0;->k(IJLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    move/from16 v10, p1

    .line 161
    .line 162
    move-wide/from16 v11, p2

    .line 163
    .line 164
    move-object/from16 v1, p4

    .line 165
    .line 166
    move-object/from16 v4, p5

    .line 167
    .line 168
    move/from16 v9, p6

    .line 169
    .line 170
    if-ne v0, v3, :cond_5

    .line 171
    .line 172
    goto/16 :goto_8

    .line 173
    .line 174
    :cond_5
    move/from16 v16, v13

    .line 175
    .line 176
    move-object v13, v2

    .line 177
    move/from16 v2, v16

    .line 178
    .line 179
    move/from16 v16, v14

    .line 180
    .line 181
    move-object v14, v4

    .line 182
    move/from16 v4, v16

    .line 183
    .line 184
    :goto_2
    :try_start_3
    check-cast v0, Ljava/util/List;

    .line 185
    .line 186
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 187
    .line 188
    goto/16 :goto_b

    .line 189
    .line 190
    :catchall_1
    move-exception v0

    .line 191
    move/from16 v10, p1

    .line 192
    .line 193
    move-wide/from16 v11, p2

    .line 194
    .line 195
    move-object/from16 v1, p4

    .line 196
    .line 197
    move-object/from16 v4, p5

    .line 198
    .line 199
    move/from16 v9, p6

    .line 200
    .line 201
    :goto_3
    move/from16 v16, v13

    .line 202
    .line 203
    move-object v13, v2

    .line 204
    move/from16 v2, v16

    .line 205
    .line 206
    move/from16 v16, v14

    .line 207
    .line 208
    move-object v14, v4

    .line 209
    move/from16 v4, v16

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :catchall_2
    move-exception v0

    .line 213
    move-wide/from16 v16, v9

    .line 214
    .line 215
    move v10, v1

    .line 216
    move v9, v11

    .line 217
    move-object v1, v12

    .line 218
    move-wide/from16 v11, v16

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :goto_4
    if-eqz v4, :cond_6

    .line 222
    .line 223
    instance-of v15, v0, La/zhi0;

    .line 224
    .line 225
    if-eqz v15, :cond_6

    .line 226
    .line 227
    move-object v15, v0

    .line 228
    check-cast v15, La/zhi0;

    .line 229
    .line 230
    iget-boolean v15, v15, La/zhi0;->e:Z

    .line 231
    .line 232
    if-eqz v15, :cond_6

    .line 233
    .line 234
    move v15, v8

    .line 235
    goto :goto_5

    .line 236
    :cond_6
    move v15, v7

    .line 237
    :goto_5
    instance-of v6, v0, Ljava/util/concurrent/CancellationException;

    .line 238
    .line 239
    if-nez v6, :cond_e

    .line 240
    .line 241
    instance-of v6, v0, Ljava/net/ConnectException;

    .line 242
    .line 243
    if-nez v6, :cond_e

    .line 244
    .line 245
    if-nez v15, :cond_e

    .line 246
    .line 247
    instance-of v6, v0, La/zhi0;

    .line 248
    .line 249
    if-eqz v6, :cond_9

    .line 250
    .line 251
    move-object v6, v0

    .line 252
    check-cast v6, La/zhi0;

    .line 253
    .line 254
    iget-boolean v15, v6, La/zhi0;->f:Z

    .line 255
    .line 256
    if-nez v15, :cond_8

    .line 257
    .line 258
    iget-boolean v6, v6, La/zhi0;->e:Z

    .line 259
    .line 260
    if-eqz v6, :cond_7

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_7
    move v6, v7

    .line 264
    goto :goto_7

    .line 265
    :cond_8
    :goto_6
    move v6, v8

    .line 266
    goto :goto_7

    .line 267
    :cond_9
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-nez v6, :cond_7

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :goto_7
    add-int/2addr v2, v8

    .line 275
    const/4 v15, 0x3

    .line 276
    if-gt v2, v15, :cond_b

    .line 277
    .line 278
    if-eqz v6, :cond_a

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_a
    const-string v6, "error ("

    .line 282
    .line 283
    const-string v15, "): "

    .line 284
    .line 285
    invoke-static {v2, v6, v15, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 290
    .line 291
    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iput-object v14, v1, La/iqu;->j:Ljava/lang/String;

    .line 295
    .line 296
    iput-object v13, v1, La/iqu;->k:La/moc;

    .line 297
    .line 298
    iput-wide v11, v1, La/iqu;->i:J

    .line 299
    .line 300
    iput-byte v10, v1, La/iqu;->l:B

    .line 301
    .line 302
    iput-boolean v9, v1, La/iqu;->o:Z

    .line 303
    .line 304
    iput v4, v1, La/iqu;->m:I

    .line 305
    .line 306
    iput v2, v1, La/iqu;->n:I

    .line 307
    .line 308
    iput v5, v1, La/iqu;->r:I

    .line 309
    .line 310
    const-wide/16 v5, 0xbb8

    .line 311
    .line 312
    invoke-static {v5, v6, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-ne v0, v3, :cond_1

    .line 317
    .line 318
    :goto_8
    return-object v3

    .line 319
    :goto_9
    const/4 v5, 0x2

    .line 320
    const/4 v6, 0x0

    .line 321
    goto/16 :goto_1

    .line 322
    .line 323
    :cond_b
    :goto_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 324
    .line 325
    new-instance v1, La/g0g0;

    .line 326
    .line 327
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 328
    .line 329
    .line 330
    move-object v0, v1

    .line 331
    :goto_b
    nop

    .line 332
    instance-of v1, v0, La/g0g0;

    .line 333
    .line 334
    if-eqz v1, :cond_c

    .line 335
    .line 336
    const/4 v6, 0x0

    .line 337
    goto :goto_c

    .line 338
    :cond_c
    move-object v6, v0

    .line 339
    :goto_c
    check-cast v6, Ljava/util/List;

    .line 340
    .line 341
    if-nez v6, :cond_d

    .line 342
    .line 343
    sget-object v6, La/iun;->a:La/iun;

    .line 344
    .line 345
    :cond_d
    return-object v6

    .line 346
    :cond_e
    throw v0
.end method
