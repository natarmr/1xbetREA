.class public abstract La/trk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/y78;La/btk;La/sff0;La/ctf0;La/v5l0;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZZZ)Ljava/util/List;
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, La/btk;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    sget-object v0, La/iun;->a:La/iun;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v3, La/urk;

    .line 26
    .line 27
    if-eqz p8, :cond_1

    .line 28
    .line 29
    const-string v4, "LIVE_GAMES"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string v4, "LINE_GAMES"

    .line 33
    .line 34
    :goto_0
    new-instance v5, La/v7m;

    .line 35
    .line 36
    new-instance v6, La/c8m;

    .line 37
    .line 38
    if-eqz p8, :cond_2

    .line 39
    .line 40
    const v7, 0x7f130b3d

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const v7, 0x7f130b2c

    .line 45
    .line 46
    .line 47
    :goto_1
    const/4 v8, 0x0

    .line 48
    new-array v9, v8, [Ljava/lang/Object;

    .line 49
    .line 50
    move-object/from16 v11, p3

    .line 51
    .line 52
    iget-object v10, v11, La/ctf0;->b:La/lsm0;

    .line 53
    .line 54
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v10, v7, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    sget-object v9, La/n7m;->a:La/n7m;

    .line 63
    .line 64
    invoke-direct {v6, v7, v9}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v5, v6}, La/v7m;-><init>(La/c8m;)V

    .line 68
    .line 69
    .line 70
    sget-object v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 71
    .line 72
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_3

    .line 77
    .line 78
    sget-object v6, La/q0s;->b:La/q0s;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    sget-object v6, La/q0s;->a:La/q0s;

    .line 82
    .line 83
    :goto_2
    new-instance v7, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v9, 0xa

    .line 86
    .line 87
    invoke-static {v2, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_10

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, La/d0t;

    .line 109
    .line 110
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    const/4 v14, 0x0

    .line 119
    if-eqz v13, :cond_5

    .line 120
    .line 121
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    move-object v15, v13

    .line 126
    check-cast v15, La/lok0;

    .line 127
    .line 128
    iget v15, v15, La/lok0;->a:I

    .line 129
    .line 130
    iget v8, v10, La/d0t;->O:I

    .line 131
    .line 132
    if-ne v15, v8, :cond_4

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_4
    const/4 v8, 0x0

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object v13, v14

    .line 138
    :goto_5
    check-cast v13, La/lok0;

    .line 139
    .line 140
    move-object/from16 v8, p2

    .line 141
    .line 142
    move-object v12, v14

    .line 143
    iget-boolean v14, v8, La/sff0;->J:Z

    .line 144
    .line 145
    iget-object v15, v0, La/btk;->b:Ljava/lang/String;

    .line 146
    .line 147
    sget-object v12, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 148
    .line 149
    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    .line 154
    .line 155
    move-object/from16 v1, p5

    .line 156
    .line 157
    move-object/from16 v25, v2

    .line 158
    .line 159
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v17

    .line 174
    if-eqz v17, :cond_6

    .line 175
    .line 176
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v17

    .line 180
    move-object/from16 v9, v17

    .line 181
    .line 182
    check-cast v9, La/lok0;

    .line 183
    .line 184
    iget v9, v9, La/lok0;->a:I

    .line 185
    .line 186
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    const/16 v9, 0xa

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_6
    if-eqz v13, :cond_7

    .line 197
    .line 198
    iget-boolean v2, v13, La/lok0;->n:Z

    .line 199
    .line 200
    move/from16 v18, v2

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_7
    const/16 v18, 0x0

    .line 204
    .line 205
    :goto_7
    if-eqz v13, :cond_8

    .line 206
    .line 207
    iget-boolean v2, v13, La/lok0;->p:Z

    .line 208
    .line 209
    move/from16 v19, v2

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_8
    const/16 v19, 0x0

    .line 213
    .line 214
    :goto_8
    iget-object v2, v10, La/d0t;->K:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_c

    .line 221
    .line 222
    iget-object v2, v10, La/d0t;->k:Ljava/util/List;

    .line 223
    .line 224
    if-eqz v2, :cond_9

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    if-eqz v9, :cond_9

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_9
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-eqz v9, :cond_b

    .line 242
    .line 243
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    check-cast v9, La/d0t;

    .line 248
    .line 249
    iget-object v9, v9, La/d0t;->K:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-nez v9, :cond_a

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_b
    :goto_9
    sget-object v2, La/i5l0;->a:La/i5l0;

    .line 259
    .line 260
    :goto_a
    move-object/from16 v22, v2

    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_c
    :goto_b
    if-eqz p9, :cond_d

    .line 264
    .line 265
    sget-object v2, La/k5l0;->a:La/k5l0;

    .line 266
    .line 267
    goto :goto_a

    .line 268
    :cond_d
    sget-object v2, La/l5l0;->a:La/l5l0;

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :goto_c
    if-eqz v13, :cond_e

    .line 272
    .line 273
    iget-object v2, v13, La/lok0;->u:Ljava/lang/String;

    .line 274
    .line 275
    move-object/from16 v16, v2

    .line 276
    .line 277
    goto :goto_d

    .line 278
    :cond_e
    const/16 v16, 0x0

    .line 279
    .line 280
    :goto_d
    if-nez v16, :cond_f

    .line 281
    .line 282
    const-string v16, ""

    .line 283
    .line 284
    :cond_f
    move-object/from16 v23, v16

    .line 285
    .line 286
    const/16 v20, 0x0

    .line 287
    .line 288
    move-object/from16 v21, p4

    .line 289
    .line 290
    move/from16 v13, p7

    .line 291
    .line 292
    move/from16 v24, p10

    .line 293
    .line 294
    move-object/from16 v17, v0

    .line 295
    .line 296
    move/from16 v16, v12

    .line 297
    .line 298
    move-object/from16 v12, p0

    .line 299
    .line 300
    invoke-static/range {v10 .. v24}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-object/from16 v0, p1

    .line 308
    .line 309
    move-object/from16 v11, p3

    .line 310
    .line 311
    move-object/from16 v1, p6

    .line 312
    .line 313
    move-object/from16 v2, v25

    .line 314
    .line 315
    const/4 v8, 0x0

    .line 316
    const/16 v9, 0xa

    .line 317
    .line 318
    goto/16 :goto_3

    .line 319
    .line 320
    :cond_10
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    new-instance v1, La/vb90;

    .line 325
    .line 326
    const/4 v2, 0x1

    .line 327
    move/from16 v7, p10

    .line 328
    .line 329
    invoke-direct {v1, v6, v0, v2, v7}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 330
    .line 331
    .line 332
    invoke-direct {v3, v4, v5, v1}, La/urk;-><init>(Ljava/lang/String;La/b8m;La/vb90;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0
.end method
