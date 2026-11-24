.class public final La/q8u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j2u;

.field public final b:La/pmi;

.field public final c:La/o8u;

.field public final d:La/o8u;

.field public final e:La/epc;

.field public final f:La/kqc;

.field public final g:La/pru;


# direct methods
.method public constructor <init>(La/j2u;La/pmi;La/o8u;La/o8u;La/epc;La/kqc;La/pru;)V
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
    iput-object p1, p0, La/q8u;->a:La/j2u;

    .line 8
    .line 9
    iput-object p2, p0, La/q8u;->b:La/pmi;

    .line 10
    .line 11
    iput-object p3, p0, La/q8u;->c:La/o8u;

    .line 12
    .line 13
    iput-object p4, p0, La/q8u;->d:La/o8u;

    .line 14
    .line 15
    iput-object p5, p0, La/q8u;->e:La/epc;

    .line 16
    .line 17
    iput-object p6, p0, La/q8u;->f:La/kqc;

    .line 18
    .line 19
    iput-object p7, p0, La/q8u;->g:La/pru;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;ZJLa/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p5

    .line 6
    .line 7
    instance-of v3, v0, La/p8u;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, La/p8u;

    .line 13
    .line 14
    iget v4, v3, La/p8u;->p:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/p8u;->p:I

    .line 24
    .line 25
    :goto_0
    move-object v10, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, La/p8u;

    .line 28
    .line 29
    invoke-direct {v3, v1, v0}, La/p8u;-><init>(La/q8u;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v10, La/p8u;->n:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v4, v10, La/p8u;->p:I

    .line 38
    .line 39
    const/4 v11, 0x3

    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x1

    .line 42
    const/4 v12, 0x0

    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    if-eq v4, v6, :cond_3

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    if-ne v4, v11, :cond_1

    .line 50
    .line 51
    iget-wide v2, v10, La/p8u;->m:J

    .line 52
    .line 53
    iget-object v4, v10, La/p8u;->i:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v12

    .line 66
    :cond_2
    iget-wide v4, v10, La/p8u;->m:J

    .line 67
    .line 68
    iget-boolean v2, v10, La/p8u;->l:Z

    .line 69
    .line 70
    iget-object v6, v10, La/p8u;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, La/q8u;

    .line 73
    .line 74
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    move-wide v13, v4

    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-wide v13, v4

    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_3
    iget-wide v6, v10, La/p8u;->m:J

    .line 85
    .line 86
    iget-boolean v2, v10, La/p8u;->l:Z

    .line 87
    .line 88
    iget-object v4, v10, La/p8u;->k:La/j2u;

    .line 89
    .line 90
    iget-object v8, v10, La/p8u;->j:Ljava/util/List;

    .line 91
    .line 92
    iget-object v9, v10, La/p8u;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v9, La/q8u;

    .line 95
    .line 96
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    .line 99
    move-wide v13, v6

    .line 100
    move-object v7, v8

    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    move-wide v13, v6

    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    if-nez v2, :cond_5

    .line 110
    .line 111
    sget-object v0, La/iun;->a:La/iun;

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_5
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 115
    .line 116
    iget-object v4, v1, La/q8u;->a:La/j2u;

    .line 117
    .line 118
    iget-object v0, v1, La/q8u;->b:La/pmi;

    .line 119
    .line 120
    iput-object v1, v10, La/p8u;->i:Ljava/lang/Object;

    .line 121
    .line 122
    move-object/from16 v7, p1

    .line 123
    .line 124
    iput-object v7, v10, La/p8u;->j:Ljava/util/List;

    .line 125
    .line 126
    iput-object v4, v10, La/p8u;->k:La/j2u;

    .line 127
    .line 128
    iput-boolean v2, v10, La/p8u;->l:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 129
    .line 130
    move-wide/from16 v8, p3

    .line 131
    .line 132
    :try_start_3
    iput-wide v8, v10, La/p8u;->m:J

    .line 133
    .line 134
    iput v6, v10, La/p8u;->p:I

    .line 135
    .line 136
    invoke-virtual {v0, v10}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 137
    .line 138
    .line 139
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 140
    if-ne v0, v3, :cond_6

    .line 141
    .line 142
    goto/16 :goto_7

    .line 143
    .line 144
    :cond_6
    move-wide v13, v8

    .line 145
    move-object v9, v1

    .line 146
    :goto_2
    :try_start_4
    check-cast v0, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    iget-object v0, v9, La/q8u;->e:La/epc;

    .line 153
    .line 154
    invoke-virtual {v0}, La/epc;->a()La/hr4;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-boolean v0, v0, La/hr4;->a:Z

    .line 159
    .line 160
    sget-object v8, La/sub0;->b:La/nh70;

    .line 161
    .line 162
    iget-object v15, v9, La/q8u;->f:La/kqc;

    .line 163
    .line 164
    invoke-virtual {v15}, La/kqc;->a()La/sub0;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {v15}, La/nh70;->j(La/sub0;)Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    iget-object v9, v9, La/q8u;->g:La/pru;

    .line 176
    .line 177
    invoke-virtual {v9}, La/pru;->a()La/sff0;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    iget-object v9, v9, La/sff0;->d:La/q1w0;

    .line 182
    .line 183
    iget-boolean v9, v9, La/q1w0;->b:Z

    .line 184
    .line 185
    iput-object v12, v10, La/p8u;->i:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v12, v10, La/p8u;->j:Ljava/util/List;

    .line 188
    .line 189
    iput-object v12, v10, La/p8u;->k:La/j2u;

    .line 190
    .line 191
    iput-boolean v2, v10, La/p8u;->l:Z

    .line 192
    .line 193
    iput-wide v13, v10, La/p8u;->m:J

    .line 194
    .line 195
    iput v5, v10, La/p8u;->p:I

    .line 196
    .line 197
    move-object v5, v7

    .line 198
    move v7, v0

    .line 199
    invoke-virtual/range {v4 .. v10}, La/j2u;->a(Ljava/util/List;IZZZLa/zje;)Ljava/io/Serializable;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-ne v0, v3, :cond_7

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_7
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 207
    .line 208
    sget-object v4, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 209
    .line 210
    move-object v4, v0

    .line 211
    goto :goto_6

    .line 212
    :catchall_2
    move-exception v0

    .line 213
    goto :goto_5

    .line 214
    :catchall_3
    move-exception v0

    .line 215
    :goto_4
    move-wide v13, v8

    .line 216
    goto :goto_5

    .line 217
    :catchall_4
    move-exception v0

    .line 218
    move-wide/from16 v8, p3

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :goto_5
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 222
    .line 223
    new-instance v4, La/g0g0;

    .line 224
    .line 225
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    :goto_6
    instance-of v0, v4, La/g0g0;

    .line 229
    .line 230
    if-nez v0, :cond_9

    .line 231
    .line 232
    move-object v0, v4

    .line 233
    check-cast v0, Ljava/util/List;

    .line 234
    .line 235
    iput-object v4, v10, La/p8u;->i:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v12, v10, La/p8u;->j:Ljava/util/List;

    .line 238
    .line 239
    iput-object v12, v10, La/p8u;->k:La/j2u;

    .line 240
    .line 241
    iput-boolean v2, v10, La/p8u;->l:Z

    .line 242
    .line 243
    iput-wide v13, v10, La/p8u;->m:J

    .line 244
    .line 245
    iput v11, v10, La/p8u;->p:I

    .line 246
    .line 247
    iget-object v2, v1, La/q8u;->c:La/o8u;

    .line 248
    .line 249
    iget-object v2, v2, La/o8u;->a:La/b2g;

    .line 250
    .line 251
    iget-object v2, v2, La/b2g;->a:La/ehf0;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v2, v2, La/ehf0;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v2, La/or30;

    .line 259
    .line 260
    invoke-virtual {v2, v0}, La/or30;->d(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    sget-object v2, La/wne;->a:La/wne;

    .line 266
    .line 267
    if-ne v0, v3, :cond_8

    .line 268
    .line 269
    :goto_7
    return-object v3

    .line 270
    :cond_8
    move-wide v2, v13

    .line 271
    :goto_8
    move-wide v13, v2

    .line 272
    :cond_9
    invoke-static {v4}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    if-nez v0, :cond_a

    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_a
    iget-object v0, v1, La/q8u;->d:La/o8u;

    .line 280
    .line 281
    :try_start_5
    iget-object v0, v0, La/o8u;->a:La/b2g;

    .line 282
    .line 283
    iget-object v0, v0, La/b2g;->a:La/ehf0;

    .line 284
    .line 285
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, La/or30;

    .line 288
    .line 289
    invoke-virtual {v0, v13, v14}, La/or30;->c(J)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :catchall_5
    move-exception v0

    .line 297
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 298
    .line 299
    new-instance v1, La/g0g0;

    .line 300
    .line 301
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    move-object v0, v1

    .line 305
    :goto_9
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    if-nez v1, :cond_b

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_b
    sget-object v0, La/iun;->a:La/iun;

    .line 313
    .line 314
    :goto_a
    move-object v4, v0

    .line 315
    check-cast v4, Ljava/util/List;

    .line 316
    .line 317
    :goto_b
    check-cast v4, Ljava/util/List;

    .line 318
    .line 319
    return-object v4
.end method
