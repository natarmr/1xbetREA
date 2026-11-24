.class public abstract La/n2z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j2z;

    .line 2
    .line 3
    const-wide/16 v1, 0x7

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, La/l2z;-><init>(J)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/i2z;

    .line 9
    .line 10
    const-wide/16 v2, 0x8

    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, La/l2z;-><init>(J)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/k2z;

    .line 16
    .line 17
    const-wide/16 v3, 0x9

    .line 18
    .line 19
    invoke-direct {v2, v3, v4}, La/l2z;-><init>(J)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    new-array v3, v3, [La/l2z;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aput-object v0, v3, v4

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    aput-object v1, v3, v0

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v2, v3, v0

    .line 33
    .line 34
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, La/n2z;->a:Ljava/util/List;

    .line 39
    .line 40
    return-void
.end method

.method public static final a(La/ljg;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ljg;->d:La/v1h;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_4

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La/l2z;

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    instance-of v3, v2, La/j2z;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    iget-object v3, v0, La/v1h;->d:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of v3, v2, La/i2z;

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    iget-object v3, v0, La/v1h;->e:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_0

    .line 59
    .line 60
    iget-object v3, p0, La/ljg;->b:La/f2h;

    .line 61
    .line 62
    iget-object v3, v3, La/f2h;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-lez v3, :cond_0

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    instance-of v3, v2, La/k2z;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    iget-object v3, v0, La/v1h;->f:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_0

    .line 85
    .line 86
    iget-object v3, p0, La/ljg;->c:La/f2h;

    .line 87
    .line 88
    iget-object v3, v3, La/f2h;->c:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-lez v3, :cond_0

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    return-object p0

    .line 105
    :cond_4
    return-object v1
.end method

.method public static final b(Ljava/lang/String;La/ljg;La/l2z;ZLa/ctf0;ZZZLkotlin/jvm/functions/Function1;)La/m2z;
    .locals 30

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move/from16 v2, p6

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v3, v0, La/j2z;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object/from16 v4, p1

    .line 18
    .line 19
    move-object/from16 v5, p8

    .line 20
    .line 21
    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, La/ljg;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object/from16 v4, p1

    .line 29
    .line 30
    :goto_0
    instance-of v5, v0, La/i2z;

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    iget-object v8, v4, La/ljg;->b:La/f2h;

    .line 36
    .line 37
    invoke-static {v8}, La/yum0;->d(La/f2h;)La/e2z;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    :goto_1
    move-object v11, v8

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    if-eqz v3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v9, La/d2z;

    .line 50
    .line 51
    iget-object v8, v4, La/ljg;->b:La/f2h;

    .line 52
    .line 53
    iget-object v8, v8, La/f2h;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v8}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    iget-object v8, v4, La/ljg;->d:La/v1h;

    .line 60
    .line 61
    iget v11, v8, La/v1h;->a:I

    .line 62
    .line 63
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    iget-object v12, v1, La/ctf0;->b:La/lsm0;

    .line 72
    .line 73
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    const v13, 0x7f130621

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    iget-object v14, v4, La/ljg;->c:La/f2h;

    .line 85
    .line 86
    iget-object v14, v14, La/f2h;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v14}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    iget v15, v8, La/v1h;->b:I

    .line 93
    .line 94
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v15

    .line 98
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    invoke-virtual {v12, v13, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    if-eqz p5, :cond_2

    .line 111
    .line 112
    iget v8, v8, La/v1h;->c:I

    .line 113
    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    const v15, 0x7f130592

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v15, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    :goto_2
    move-object v12, v14

    .line 136
    move-object v14, v8

    .line 137
    goto :goto_3

    .line 138
    :cond_2
    const-string v8, ""

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :goto_3
    invoke-direct/range {v9 .. v14}, La/d2z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    move-object v11, v9

    .line 145
    goto :goto_4

    .line 146
    :cond_3
    instance-of v8, v0, La/k2z;

    .line 147
    .line 148
    if-eqz v8, :cond_11

    .line 149
    .line 150
    iget-object v8, v4, La/ljg;->c:La/f2h;

    .line 151
    .line 152
    invoke-static {v8}, La/yum0;->d(La/f2h;)La/e2z;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    goto :goto_1

    .line 157
    :goto_4
    iget-object v8, v4, La/ljg;->a:Ljava/util/List;

    .line 158
    .line 159
    iget-object v9, v4, La/ljg;->d:La/v1h;

    .line 160
    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v12, 0x5

    .line 163
    if-eqz v5, :cond_4

    .line 164
    .line 165
    iget-object v0, v9, La/v1h;->e:Ljava/util/List;

    .line 166
    .line 167
    invoke-static {v8, v0}, La/ltt0;->l(Ljava/util/List;Ljava/util/List;)La/lc00;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move/from16 p1, v7

    .line 172
    .line 173
    goto/16 :goto_9

    .line 174
    .line 175
    :cond_4
    if-eqz v3, :cond_c

    .line 176
    .line 177
    iget-object v0, v4, La/ljg;->b:La/f2h;

    .line 178
    .line 179
    iget-object v3, v4, La/ljg;->c:La/f2h;

    .line 180
    .line 181
    iget-object v4, v9, La/v1h;->d:Ljava/util/List;

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-instance v8, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    move v13, v10

    .line 200
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-eqz v14, :cond_b

    .line 205
    .line 206
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    add-int/lit8 v15, v13, 0x1

    .line 211
    .line 212
    if-ltz v13, :cond_a

    .line 213
    .line 214
    check-cast v14, La/q1h;

    .line 215
    .line 216
    move/from16 p1, v7

    .line 217
    .line 218
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-gt v7, v12, :cond_5

    .line 223
    .line 224
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    add-int/lit8 v7, v7, -0x1

    .line 229
    .line 230
    if-ne v13, v7, :cond_5

    .line 231
    .line 232
    move/from16 v27, p1

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_5
    move/from16 v27, v10

    .line 236
    .line 237
    :goto_6
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-instance v16, La/w1z;

    .line 241
    .line 242
    iget-object v7, v14, La/q1h;->a:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v13, v0, La/f2h;->d:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {v13}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v18

    .line 250
    iget v13, v14, La/q1h;->d:I

    .line 251
    .line 252
    iget v12, v14, La/q1h;->e:I

    .line 253
    .line 254
    const v17, 0x7f13073d

    .line 255
    .line 256
    .line 257
    const v19, 0x7f130ff9

    .line 258
    .line 259
    .line 260
    const v20, 0x7f130ffa

    .line 261
    .line 262
    .line 263
    if-le v13, v12, :cond_6

    .line 264
    .line 265
    move-object/from16 p2, v0

    .line 266
    .line 267
    move/from16 v6, v20

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_6
    if-ge v13, v12, :cond_7

    .line 271
    .line 272
    move-object/from16 p2, v0

    .line 273
    .line 274
    move/from16 v6, v19

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_7
    move-object/from16 p2, v0

    .line 278
    .line 279
    move/from16 v6, v17

    .line 280
    .line 281
    :goto_7
    new-array v0, v10, [Ljava/lang/Object;

    .line 282
    .line 283
    move-object/from16 v28, v4

    .line 284
    .line 285
    iget-object v4, v1, La/ctf0;->b:La/lsm0;

    .line 286
    .line 287
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v4, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    move/from16 v6, v20

    .line 296
    .line 297
    invoke-static {v13, v12, v2}, La/pvm0;->t(IIZ)J

    .line 298
    .line 299
    .line 300
    move-result-wide v20

    .line 301
    iget-object v6, v3, La/f2h;->d:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v6}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    if-le v12, v13, :cond_8

    .line 308
    .line 309
    move-object/from16 v19, v0

    .line 310
    .line 311
    const v0, 0x7f130ffa

    .line 312
    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_8
    if-ge v12, v13, :cond_9

    .line 316
    .line 317
    move/from16 v29, v19

    .line 318
    .line 319
    move-object/from16 v19, v0

    .line 320
    .line 321
    move/from16 v0, v29

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_9
    move-object/from16 v19, v0

    .line 325
    .line 326
    move/from16 v0, v17

    .line 327
    .line 328
    :goto_8
    new-array v1, v10, [Ljava/lang/Object;

    .line 329
    .line 330
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v4, v0, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v23

    .line 338
    invoke-static {v12, v13, v2}, La/pvm0;->t(IIZ)J

    .line 339
    .line 340
    .line 341
    move-result-wide v24

    .line 342
    new-instance v0, La/ib30;

    .line 343
    .line 344
    iget-object v1, v14, La/q1h;->g:Ljava/lang/String;

    .line 345
    .line 346
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    sget-object v13, La/rdj;->a:La/rdj;

    .line 355
    .line 356
    iget-wide v13, v14, La/q1h;->f:J

    .line 357
    .line 358
    new-instance v10, La/znq0;

    .line 359
    .line 360
    invoke-direct {v10, v13, v14}, La/znq0;-><init>(J)V

    .line 361
    .line 362
    .line 363
    sget-object v13, La/sdj;->b:La/sdj;

    .line 364
    .line 365
    const/16 v14, 0x3c

    .line 366
    .line 367
    const/4 v2, 0x0

    .line 368
    invoke-static {v10, v13, v2, v14}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    invoke-direct {v0, v1, v4, v12, v10}, La/ib30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v26, v0

    .line 376
    .line 377
    move-object/from16 v22, v6

    .line 378
    .line 379
    move-object/from16 v17, v7

    .line 380
    .line 381
    invoke-direct/range {v16 .. v27}, La/w1z;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLa/ib30;Z)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v0, v16

    .line 385
    .line 386
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move/from16 v7, p1

    .line 390
    .line 391
    move-object/from16 v0, p2

    .line 392
    .line 393
    move-object/from16 v1, p4

    .line 394
    .line 395
    move/from16 v2, p6

    .line 396
    .line 397
    move v13, v15

    .line 398
    move-object/from16 v4, v28

    .line 399
    .line 400
    const/4 v10, 0x0

    .line 401
    const/4 v12, 0x5

    .line 402
    goto/16 :goto_5

    .line 403
    .line 404
    :cond_a
    const/4 v2, 0x0

    .line 405
    invoke-static {}, La/q3d;->p()V

    .line 406
    .line 407
    .line 408
    throw v2

    .line 409
    :cond_b
    move/from16 p1, v7

    .line 410
    .line 411
    invoke-virtual {v5, v8}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 412
    .line 413
    .line 414
    invoke-static {v5}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    goto :goto_9

    .line 419
    :cond_c
    move/from16 p1, v7

    .line 420
    .line 421
    instance-of v0, v0, La/k2z;

    .line 422
    .line 423
    if-eqz v0, :cond_10

    .line 424
    .line 425
    iget-object v0, v9, La/v1h;->f:Ljava/util/List;

    .line 426
    .line 427
    invoke-static {v8, v0}, La/ltt0;->l(Ljava/util/List;Ljava/util/List;)La/lc00;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    :goto_9
    if-eqz p3, :cond_d

    .line 432
    .line 433
    const/4 v1, 0x5

    .line 434
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    :goto_a
    move-object v12, v2

    .line 443
    goto :goto_b

    .line 444
    :cond_d
    const/4 v1, 0x5

    .line 445
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    goto :goto_a

    .line 450
    :goto_b
    if-eqz p3, :cond_e

    .line 451
    .line 452
    const v2, 0x7f080815

    .line 453
    .line 454
    .line 455
    :goto_c
    move v14, v2

    .line 456
    goto :goto_d

    .line 457
    :cond_e
    const v2, 0x7f08081e

    .line 458
    .line 459
    .line 460
    goto :goto_c

    .line 461
    :goto_d
    invoke-virtual {v0}, La/e4;->b()I

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-le v0, v1, :cond_f

    .line 466
    .line 467
    move/from16 v13, p1

    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_f
    const/4 v13, 0x0

    .line 471
    :goto_e
    new-instance v9, La/m2z;

    .line 472
    .line 473
    move-object/from16 v10, p0

    .line 474
    .line 475
    move/from16 v15, p7

    .line 476
    .line 477
    invoke-direct/range {v9 .. v15}, La/m2z;-><init>(Ljava/lang/String;La/f2z;La/i4;ZIZ)V

    .line 478
    .line 479
    .line 480
    return-object v9

    .line 481
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 482
    .line 483
    .line 484
    const/4 v2, 0x0

    .line 485
    return-object v2

    .line 486
    :cond_11
    const/4 v2, 0x0

    .line 487
    invoke-static {}, La/t9f;->b()V

    .line 488
    .line 489
    .line 490
    return-object v2
.end method

.method public static synthetic c(La/ljg;La/l2z;ZLa/ctf0;ZZZ)La/m2z;
    .locals 9

    .line 1
    new-instance v8, La/adw;

    .line 2
    .line 3
    const/16 v0, 0x19

    .line 4
    .line 5
    invoke-direct {v8, p0, v0}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    const-string v0, "LAST_MATCHES"

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move v5, p4

    .line 15
    move v6, p5

    .line 16
    move v7, p6

    .line 17
    invoke-static/range {v0 .. v8}, La/n2z;->b(Ljava/lang/String;La/ljg;La/l2z;ZLa/ctf0;ZZZLkotlin/jvm/functions/Function1;)La/m2z;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final d(JLjava/util/ArrayList;)La/l2z;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, La/l2z;

    .line 17
    .line 18
    iget-byte v2, v2, La/l2z;->a:B

    .line 19
    .line 20
    int-to-long v2, v2

    .line 21
    cmp-long v2, v2, p0

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_0
    check-cast v1, La/l2z;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/l2z;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    return-object v1
.end method
