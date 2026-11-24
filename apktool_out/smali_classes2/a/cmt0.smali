.class public final La/cmt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ngw0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cmt0;->a:Ljava/lang/Object;

    iput-object p2, p0, La/cmt0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/cmt0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/amt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/amt0;

    .line 7
    .line 8
    iget v1, v0, La/amt0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/amt0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/amt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/amt0;-><init>(La/cmt0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/amt0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/amt0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/ahu;

    .line 60
    .line 61
    iput v4, v0, La/amt0;->k:I

    .line 62
    .line 63
    invoke-static {p1, v0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    check-cast p1, La/ql5;

    .line 71
    .line 72
    iget-object p0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, La/m0u;

    .line 75
    .line 76
    iget-wide v4, p1, La/ql5;->e:J

    .line 77
    .line 78
    iput v3, v0, La/amt0;->k:I

    .line 79
    .line 80
    iget-object p0, p0, La/m0u;->a:La/xr;

    .line 81
    .line 82
    invoke-virtual {p0, v4, v5, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v1, :cond_5

    .line 87
    .line 88
    :goto_2
    return-object v1

    .line 89
    :cond_5
    :goto_3
    check-cast p1, La/xuf;

    .line 90
    .line 91
    iget-wide p0, p1, La/xuf;->i:D

    .line 92
    .line 93
    new-instance v0, Ljava/lang/Double;

    .line 94
    .line 95
    invoke-direct {v0, p0, p1}, Ljava/lang/Double;-><init>(D)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public b(Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 19

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, La/usu0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/usu0;

    .line 9
    .line 10
    iget v2, v1, La/usu0;->t:I

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
    iput v2, v1, La/usu0;->t:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/usu0;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/usu0;-><init>(La/cmt0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, La/usu0;->r:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v1, La/usu0;->t:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v9, :cond_3

    .line 43
    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    iget v2, v1, La/usu0;->q:I

    .line 49
    .line 50
    iget v4, v1, La/usu0;->p:I

    .line 51
    .line 52
    iget v10, v1, La/usu0;->o:I

    .line 53
    .line 54
    iget-wide v11, v1, La/usu0;->n:J

    .line 55
    .line 56
    iget-wide v13, v1, La/usu0;->m:J

    .line 57
    .line 58
    iget-object v15, v1, La/usu0;->l:Ljava/lang/Throwable;

    .line 59
    .line 60
    const/16 p2, 0x0

    .line 61
    .line 62
    iget-object v7, v1, La/usu0;->k:La/usu0;

    .line 63
    .line 64
    iget-object v8, v1, La/usu0;->j:La/cmt0;

    .line 65
    .line 66
    iget-object v5, v1, La/usu0;->i:Ljava/lang/String;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 69
    .line 70
    .line 71
    move v0, v4

    .line 72
    move-object v4, v1

    .line 73
    move-object v1, v5

    .line 74
    move-object v5, v7

    .line 75
    move v7, v0

    .line 76
    move v0, v2

    .line 77
    move-object v2, v8

    .line 78
    move v8, v10

    .line 79
    const/4 v10, 0x3

    .line 80
    goto/16 :goto_b

    .line 81
    .line 82
    :cond_1
    const/16 p2, 0x0

    .line 83
    .line 84
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 85
    .line 86
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object p2

    .line 90
    :cond_2
    const/16 p2, 0x0

    .line 91
    .line 92
    iget v2, v1, La/usu0;->q:I

    .line 93
    .line 94
    iget v4, v1, La/usu0;->p:I

    .line 95
    .line 96
    iget v5, v1, La/usu0;->o:I

    .line 97
    .line 98
    iget-wide v7, v1, La/usu0;->n:J

    .line 99
    .line 100
    iget-wide v10, v1, La/usu0;->m:J

    .line 101
    .line 102
    iget-object v12, v1, La/usu0;->l:Ljava/lang/Throwable;

    .line 103
    .line 104
    iget-object v13, v1, La/usu0;->k:La/usu0;

    .line 105
    .line 106
    iget-object v14, v1, La/usu0;->j:La/cmt0;

    .line 107
    .line 108
    iget-object v15, v1, La/usu0;->i:Ljava/lang/String;

    .line 109
    .line 110
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 111
    .line 112
    .line 113
    move v0, v2

    .line 114
    move v9, v6

    .line 115
    move-object v2, v14

    .line 116
    move/from16 v16, v4

    .line 117
    .line 118
    move-object v4, v1

    .line 119
    move-object v1, v15

    .line 120
    move-wide/from16 v17, v7

    .line 121
    .line 122
    move/from16 v7, v16

    .line 123
    .line 124
    move v8, v5

    .line 125
    move-object v5, v13

    .line 126
    move-wide v13, v10

    .line 127
    move-object v10, v12

    .line 128
    move-wide/from16 v11, v17

    .line 129
    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_3
    const/16 p2, 0x0

    .line 133
    .line 134
    iget v2, v1, La/usu0;->p:I

    .line 135
    .line 136
    iget v4, v1, La/usu0;->o:I

    .line 137
    .line 138
    iget-wide v7, v1, La/usu0;->n:J

    .line 139
    .line 140
    iget-wide v10, v1, La/usu0;->m:J

    .line 141
    .line 142
    iget-object v5, v1, La/usu0;->l:Ljava/lang/Throwable;

    .line 143
    .line 144
    iget-object v12, v1, La/usu0;->k:La/usu0;

    .line 145
    .line 146
    iget-object v13, v1, La/usu0;->j:La/cmt0;

    .line 147
    .line 148
    iget-object v14, v1, La/usu0;->i:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move-object v15, v5

    .line 157
    move-object v5, v12

    .line 158
    move-wide/from16 v16, v10

    .line 159
    .line 160
    move-object v10, v0

    .line 161
    move-wide v11, v7

    .line 162
    move v7, v2

    .line 163
    move v8, v4

    .line 164
    move-object v2, v13

    .line 165
    move-object v4, v1

    .line 166
    move-object v1, v14

    .line 167
    move-wide/from16 v13, v16

    .line 168
    .line 169
    goto/16 :goto_5

    .line 170
    .line 171
    :cond_4
    const/16 p2, 0x0

    .line 172
    .line 173
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 177
    .line 178
    sget-wide v4, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 179
    .line 180
    const-wide/16 v7, 0x3

    .line 181
    .line 182
    move-object/from16 v10, p2

    .line 183
    .line 184
    move-wide v11, v4

    .line 185
    move-wide v13, v7

    .line 186
    move v0, v9

    .line 187
    const/4 v7, 0x0

    .line 188
    const/4 v8, 0x0

    .line 189
    move-object v4, v1

    .line 190
    move-object v5, v4

    .line 191
    move-object/from16 v1, p1

    .line 192
    .line 193
    :goto_1
    if-eqz v0, :cond_11

    .line 194
    .line 195
    :try_start_4
    iget-object v15, v2, La/cmt0;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v15, La/drm0;

    .line 198
    .line 199
    iget-object v6, v2, La/cmt0;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v6, La/knf0;

    .line 202
    .line 203
    invoke-virtual {v6}, La/knf0;->c()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    iput-object v1, v4, La/usu0;->i:Ljava/lang/String;

    .line 208
    .line 209
    iput-object v2, v4, La/usu0;->j:La/cmt0;

    .line 210
    .line 211
    iput-object v5, v4, La/usu0;->k:La/usu0;

    .line 212
    .line 213
    iput-object v10, v4, La/usu0;->l:Ljava/lang/Throwable;

    .line 214
    .line 215
    iput-wide v13, v4, La/usu0;->m:J

    .line 216
    .line 217
    iput-wide v11, v4, La/usu0;->n:J

    .line 218
    .line 219
    iput v8, v4, La/usu0;->o:I

    .line 220
    .line 221
    iput v7, v4, La/usu0;->p:I

    .line 222
    .line 223
    iput v0, v4, La/usu0;->q:I

    .line 224
    .line 225
    iput v9, v4, La/usu0;->t:I

    .line 226
    .line 227
    iget-object v0, v15, La/drm0;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, La/lkr0;

    .line 230
    .line 231
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, La/qsu0;

    .line 236
    .line 237
    invoke-interface {v0, v1, v6, v4}, La/qsu0;->a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 241
    if-ne v0, v3, :cond_5

    .line 242
    .line 243
    goto/16 :goto_a

    .line 244
    .line 245
    :cond_5
    move-wide/from16 v16, v13

    .line 246
    .line 247
    move-object v14, v1

    .line 248
    move-object v13, v2

    .line 249
    move-object v1, v4

    .line 250
    move v2, v7

    .line 251
    move v4, v8

    .line 252
    move-wide v7, v11

    .line 253
    move-object v12, v5

    .line 254
    move-object v5, v10

    .line 255
    move-wide/from16 v10, v16

    .line 256
    .line 257
    :goto_2
    :try_start_5
    check-cast v0, La/dx5;

    .line 258
    .line 259
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Ljava/util/List;

    .line 264
    .line 265
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, La/mtu0;

    .line 270
    .line 271
    if-eqz v0, :cond_6

    .line 272
    .line 273
    iget-object v6, v13, La/cmt0;->a:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v6, La/vby;

    .line 276
    .line 277
    invoke-static {v0, v6}, La/ohm0;->C(La/mtu0;La/vby;)La/lc00;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    goto :goto_3

    .line 282
    :cond_6
    move-object/from16 v0, p2

    .line 283
    .line 284
    :goto_3
    if-nez v0, :cond_7

    .line 285
    .line 286
    sget-object v0, La/iun;->a:La/iun;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 287
    .line 288
    :cond_7
    :try_start_6
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 289
    .line 290
    goto/16 :goto_d

    .line 291
    .line 292
    :goto_4
    move-object v15, v10

    .line 293
    move-object v10, v0

    .line 294
    goto :goto_5

    .line 295
    :catchall_1
    move-exception v0

    .line 296
    goto :goto_4

    .line 297
    :goto_5
    invoke-static {v10}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_c

    .line 302
    .line 303
    if-nez v8, :cond_8

    .line 304
    .line 305
    new-instance v0, La/el50;

    .line 306
    .line 307
    invoke-direct {v0, v10}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    move-object v10, v0

    .line 311
    const/4 v0, 0x0

    .line 312
    const/4 v6, 0x2

    .line 313
    goto :goto_1

    .line 314
    :cond_8
    move-object/from16 p0, v10

    .line 315
    .line 316
    int-to-long v9, v7

    .line 317
    cmp-long v0, v9, v13

    .line 318
    .line 319
    if-gez v0, :cond_9

    .line 320
    .line 321
    const/4 v0, 0x1

    .line 322
    goto :goto_6

    .line 323
    :cond_9
    const/4 v0, 0x0

    .line 324
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 325
    .line 326
    if-eqz v0, :cond_b

    .line 327
    .line 328
    iput-object v1, v4, La/usu0;->i:Ljava/lang/String;

    .line 329
    .line 330
    iput-object v2, v4, La/usu0;->j:La/cmt0;

    .line 331
    .line 332
    iput-object v5, v4, La/usu0;->k:La/usu0;

    .line 333
    .line 334
    iput-object v15, v4, La/usu0;->l:Ljava/lang/Throwable;

    .line 335
    .line 336
    iput-wide v13, v4, La/usu0;->m:J

    .line 337
    .line 338
    iput-wide v11, v4, La/usu0;->n:J

    .line 339
    .line 340
    iput v8, v4, La/usu0;->o:I

    .line 341
    .line 342
    iput v7, v4, La/usu0;->p:I

    .line 343
    .line 344
    iput v0, v4, La/usu0;->q:I

    .line 345
    .line 346
    const/4 v9, 0x2

    .line 347
    iput v9, v4, La/usu0;->t:I

    .line 348
    .line 349
    invoke-static {v11, v12, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    if-ne v10, v3, :cond_a

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :cond_a
    move-object v10, v15

    .line 357
    :goto_7
    move v6, v9

    .line 358
    :goto_8
    const/4 v9, 0x1

    .line 359
    goto/16 :goto_1

    .line 360
    .line 361
    :cond_b
    const/4 v9, 0x2

    .line 362
    new-instance v10, La/el50;

    .line 363
    .line 364
    move-object/from16 v15, p0

    .line 365
    .line 366
    invoke-direct {v10, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_c
    move-object v0, v10

    .line 371
    const/4 v9, 0x2

    .line 372
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    if-eqz v10, :cond_10

    .line 377
    .line 378
    int-to-long v9, v7

    .line 379
    cmp-long v9, v9, v13

    .line 380
    .line 381
    if-gez v9, :cond_d

    .line 382
    .line 383
    const/4 v9, 0x1

    .line 384
    goto :goto_9

    .line 385
    :cond_d
    const/4 v9, 0x0

    .line 386
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 387
    .line 388
    if-eqz v9, :cond_e

    .line 389
    .line 390
    iput-object v1, v4, La/usu0;->i:Ljava/lang/String;

    .line 391
    .line 392
    iput-object v2, v4, La/usu0;->j:La/cmt0;

    .line 393
    .line 394
    iput-object v5, v4, La/usu0;->k:La/usu0;

    .line 395
    .line 396
    iput-object v15, v4, La/usu0;->l:Ljava/lang/Throwable;

    .line 397
    .line 398
    iput-wide v13, v4, La/usu0;->m:J

    .line 399
    .line 400
    iput-wide v11, v4, La/usu0;->n:J

    .line 401
    .line 402
    iput v8, v4, La/usu0;->o:I

    .line 403
    .line 404
    iput v7, v4, La/usu0;->p:I

    .line 405
    .line 406
    iput v9, v4, La/usu0;->q:I

    .line 407
    .line 408
    const/4 v10, 0x3

    .line 409
    iput v10, v4, La/usu0;->t:I

    .line 410
    .line 411
    invoke-static {v11, v12, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-ne v0, v3, :cond_f

    .line 416
    .line 417
    :goto_a
    return-object v3

    .line 418
    :goto_b
    move-object v10, v15

    .line 419
    :goto_c
    const/4 v6, 0x2

    .line 420
    goto :goto_8

    .line 421
    :cond_e
    const/4 v10, 0x3

    .line 422
    new-instance v15, La/dag0;

    .line 423
    .line 424
    invoke-direct {v15, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    :cond_f
    move v0, v9

    .line 428
    goto :goto_b

    .line 429
    :cond_10
    const/4 v10, 0x3

    .line 430
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 431
    .line 432
    .line 433
    move-object v10, v0

    .line 434
    const/4 v0, 0x0

    .line 435
    goto :goto_c

    .line 436
    :cond_11
    if-nez v10, :cond_12

    .line 437
    .line 438
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 439
    .line 440
    const-string v1, "Unexpected error"

    .line 441
    .line 442
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v0

    .line 446
    :cond_12
    throw v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 447
    :catchall_2
    move-exception v0

    .line 448
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 449
    .line 450
    new-instance v1, La/g0g0;

    .line 451
    .line 452
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    move-object v0, v1

    .line 456
    :goto_d
    return-object v0
.end method

.method public c(DLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/bmt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/bmt0;

    .line 7
    .line 8
    iget v1, v0, La/bmt0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/bmt0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/bmt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/bmt0;-><init>(La/cmt0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/bmt0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/bmt0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, La/bmt0;->i:D

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-wide p1, v0, La/bmt0;->i:D

    .line 53
    .line 54
    iput v3, v0, La/bmt0;->l:I

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/cmt0;->a(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    if-ne p3, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    cmpg-double p3, p1, v0

    .line 70
    .line 71
    if-gez p3, :cond_4

    .line 72
    .line 73
    move-wide p1, v0

    .line 74
    :cond_4
    iget-object p0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, La/wpu;

    .line 77
    .line 78
    iget-object p0, p0, La/wpu;->a:La/o470;

    .line 79
    .line 80
    iget-object p0, p0, La/o470;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, La/fnd0;

    .line 83
    .line 84
    iget-object p0, p0, La/fnd0;->a:La/vwb0;

    .line 85
    .line 86
    const-string p3, "sum_string"

    .line 87
    .line 88
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p3, p1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0
.end method

.method public d()La/krw0;
    .locals 4

    .line 1
    iget-object v0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/mrw0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v2, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/rkt0;

    .line 11
    .line 12
    if-eqz v2, :cond_8

    .line 13
    .line 14
    iget v3, v0, La/mrw0;->a:I

    .line 15
    .line 16
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La/icw0;

    .line 19
    .line 20
    iget-object v2, v2, La/icw0;->a:[B

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    if-ne v3, v2, :cond_7

    .line 24
    .line 25
    invoke-virtual {v0}, La/mrw0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 39
    .line 40
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/mrw0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/mrw0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p0, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 62
    .line 63
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    iget-object v0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/mrw0;

    .line 70
    .line 71
    iget-object v0, v0, La/mrw0;->d:La/p50;

    .line 72
    .line 73
    sget-object v2, La/p50;->k:La/p50;

    .line 74
    .line 75
    if-ne v0, v2, :cond_4

    .line 76
    .line 77
    sget-object v0, La/q6x0;->a:La/icw0;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    sget-object v2, La/p50;->j:La/p50;

    .line 81
    .line 82
    if-ne v0, v2, :cond_5

    .line 83
    .line 84
    iget-object v0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, La/q6x0;->a(I)La/icw0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sget-object v2, La/p50;->i:La/p50;

    .line 98
    .line 99
    if-ne v0, v2, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v0}, La/q6x0;->b(I)La/icw0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_2
    new-instance v1, La/krw0;

    .line 114
    .line 115
    iget-object v2, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, La/mrw0;

    .line 118
    .line 119
    iget-object v3, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v3, La/rkt0;

    .line 122
    .line 123
    iget-object p0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-direct {v1, v2, v3, v0, p0}, La/krw0;-><init>(La/mrw0;La/rkt0;La/icw0;Ljava/lang/Integer;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const-string v0, "Unknown AesGcmParameters.Variant: "

    .line 136
    .line 137
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_7
    const-string p0, "Key size mismatch"

    .line 146
    .line 147
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_8
    const-string p0, "Cannot build without parameters and/or key material"

    .line 152
    .line 153
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v1
.end method

.method public e(La/qdw0;Ljava/util/Set;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    sget-object v0, La/gnw0;->b:La/gnw0;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-class v0, La/gnw0;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    sget-object v3, La/gnw0;->b:La/gnw0;

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    new-instance v3, La/gnw0;

    .line 31
    .line 32
    invoke-direct {v3, v2}, La/gnw0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    sput-object v3, La/gnw0;->b:La/gnw0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    goto :goto_2

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p0

    .line 44
    :cond_1
    :goto_2
    sget-object v0, La/gnw0;->b:La/gnw0;

    .line 45
    .line 46
    new-instance v3, La/epw0;

    .line 47
    .line 48
    const/16 v4, 0x1d

    .line 49
    .line 50
    invoke-direct {v3, v4}, La/epw0;-><init>(B)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v0, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p1}, La/qdw0;->m()[B

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    new-instance v3, La/f5x0;

    .line 67
    .line 68
    invoke-direct {v3, p1}, La/f5x0;-><init>([B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p3, v3}, Ljava/util/concurrent/ConcurrentHashMap;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :cond_3
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_b

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/String;

    .line 89
    .line 90
    iget-object v3, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 93
    .line 94
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 95
    .line 96
    new-instance v5, La/h5x0;

    .line 97
    .line 98
    invoke-direct {v5, p3, p1}, La/h5x0;-><init>(Ljava/lang/String;[B)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    :goto_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    instance-of v4, v3, La/h5x0;

    .line 117
    .line 118
    if-eqz v4, :cond_6

    .line 119
    .line 120
    move-object v4, v3

    .line 121
    check-cast v4, La/h5x0;

    .line 122
    .line 123
    iget-object v5, v4, La/h5x0;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_4

    .line 130
    .line 131
    invoke-virtual {v4, p1}, La/h5x0;->a([B)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    new-instance v5, La/h5x0;

    .line 136
    .line 137
    invoke-direct {v5, p3, p1}, La/h5x0;-><init>(Ljava/lang/String;[B)V

    .line 138
    .line 139
    .line 140
    iget-object v6, v4, La/h5x0;->a:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p3, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    const/4 v7, 0x2

    .line 147
    if-gez v6, :cond_5

    .line 148
    .line 149
    new-array v6, v7, [La/h5x0;

    .line 150
    .line 151
    aput-object v5, v6, v2

    .line 152
    .line 153
    aput-object v4, v6, v1

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_5
    new-array v6, v7, [La/h5x0;

    .line 157
    .line 158
    aput-object v4, v6, v2

    .line 159
    .line 160
    aput-object v5, v6, v1

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_6
    move-object v4, v3

    .line 164
    check-cast v4, [La/h5x0;

    .line 165
    .line 166
    invoke-static {v4, p3}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-ltz v5, :cond_7

    .line 171
    .line 172
    aget-object v0, v4, v5

    .line 173
    .line 174
    invoke-virtual {v0, p1}, La/h5x0;->a([B)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    not-int v5, v5

    .line 179
    array-length v6, v4

    .line 180
    add-int/lit8 v7, v6, 0x1

    .line 181
    .line 182
    sub-int/2addr v6, v5

    .line 183
    if-nez v6, :cond_8

    .line 184
    .line 185
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, [La/h5x0;

    .line 190
    .line 191
    move-object v6, v4

    .line 192
    goto :goto_5

    .line 193
    :cond_8
    new-array v7, v7, [La/h5x0;

    .line 194
    .line 195
    invoke-static {v4, v2, v7, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v8, v5, 0x1

    .line 199
    .line 200
    invoke-static {v4, v5, v7, v8, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 201
    .line 202
    .line 203
    move-object v6, v7

    .line 204
    :goto_5
    new-instance v4, La/h5x0;

    .line 205
    .line 206
    invoke-direct {v4, p3, p1}, La/h5x0;-><init>(Ljava/lang/String;[B)V

    .line 207
    .line 208
    .line 209
    aput-object v4, v6, v5

    .line 210
    .line 211
    :cond_9
    :goto_6
    invoke-virtual {v0, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_a

    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :cond_a
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    if-eq v4, v3, :cond_9

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_b
    return-void
.end method

.method public f(La/vgx0;Ljava/lang/Object;La/whx0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/bix0;

    .line 10
    .line 11
    const/16 v0, 0x14

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iget-byte p0, p0, La/bix0;->a:B

    .line 16
    .line 17
    packed-switch p0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-boolean p0, p1, La/vgx0;->d:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    sget-object p0, La/adw0;->b:La/y50;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/adw0;

    .line 31
    .line 32
    iget p0, p0, La/adw0;->a:I

    .line 33
    .line 34
    if-le p0, v0, :cond_0

    .line 35
    .line 36
    iget-object p0, p1, La/vgx0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p3, p2, p0}, La/whx0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1, p2, p3}, La/vgx0;->b(Ljava/lang/Object;La/whx0;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    :pswitch_0
    return-void

    .line 46
    :cond_1
    iget-boolean p0, p1, La/vgx0;->d:Z

    .line 47
    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    sget-object p0, La/adw0;->b:La/y50;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/adw0;

    .line 57
    .line 58
    iget p0, p0, La/adw0;->a:I

    .line 59
    .line 60
    if-le p0, v0, :cond_2

    .line 61
    .line 62
    iget-object p0, p1, La/vgx0;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p3, p2, p0}, La/whx0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p1, p2, p3}, La/vgx0;->b(Ljava/lang/Object;La/whx0;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(La/vgx0;Ljava/util/Iterator;La/whx0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/dix0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, La/dix0;->a(La/vgx0;Ljava/util/Iterator;La/whx0;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/dix0;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v1, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3}, La/dix0;->a(La/vgx0;Ljava/util/Iterator;La/whx0;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0, p1, v0, p3}, La/cmt0;->f(La/vgx0;Ljava/lang/Object;La/whx0;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method

.method public h(La/xfw0;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 2
    .line 3
    iget-object v0, p0, La/cmt0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->o:Z

    .line 9
    .line 10
    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-object p1, p0, La/cmt0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/nmt0;

    .line 20
    .line 21
    iget-object p1, p1, La/nmt0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, La/ywq0;

    .line 24
    .line 25
    new-instance v1, La/l8w0;

    .line 26
    .line 27
    iget-object v2, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, La/hcp0;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v1, La/l8w0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p0, v1, La/l8w0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object p0, v1, La/l8w0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p0, p1, La/ywq0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/rfw0;

    .line 43
    .line 44
    iget-object p1, p1, La/ywq0;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    const-string v2, "/verifyAssertion"

    .line 49
    .line 50
    invoke-virtual {p0, v2, p1}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v2, La/ljw0;

    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/fht0;

    .line 62
    .line 63
    invoke-static {p1, v0, v1, v2, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/cmt0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hcp0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
