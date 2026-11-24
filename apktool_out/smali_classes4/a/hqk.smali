.class public abstract La/hqk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/y78;La/btk;La/sff0;La/ctf0;La/v5l0;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZZZ)Ljava/util/List;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/btk;->a:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    sget-object v0, La/iun;->a:La/iun;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v2, La/gqk;

    .line 24
    .line 25
    if-eqz p8, :cond_1

    .line 26
    .line 27
    const-string v3, "LIVE_GAMES"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v3, "LINE_GAMES"

    .line 31
    .line 32
    :goto_0
    if-eqz p8, :cond_2

    .line 33
    .line 34
    const v4, 0x7f130609

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const v4, 0x7f130b2c

    .line 39
    .line 40
    .line 41
    :goto_1
    new-instance v5, La/v7m;

    .line 42
    .line 43
    new-instance v6, La/c8m;

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    new-array v8, v7, [Ljava/lang/Object;

    .line 47
    .line 48
    move-object/from16 v10, p3

    .line 49
    .line 50
    iget-object v9, v10, La/ctf0;->b:La/lsm0;

    .line 51
    .line 52
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {v9, v4, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sget-object v8, La/rv00;->m:La/rv00;

    .line 61
    .line 62
    invoke-direct {v6, v4, v8}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v5, v6}, La/v7m;-><init>(La/c8m;)V

    .line 66
    .line 67
    .line 68
    sget-object v4, La/q0s;->a:La/q0s;

    .line 69
    .line 70
    const/4 v6, 0x3

    .line 71
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v6, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/16 v8, 0xa

    .line 78
    .line 79
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_f

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    check-cast v9, La/d0t;

    .line 101
    .line 102
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    :cond_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    const/4 v13, 0x0

    .line 111
    if-eqz v12, :cond_4

    .line 112
    .line 113
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    move-object v14, v12

    .line 118
    check-cast v14, La/lok0;

    .line 119
    .line 120
    iget v14, v14, La/lok0;->a:I

    .line 121
    .line 122
    iget v15, v9, La/d0t;->O:I

    .line 123
    .line 124
    if-ne v14, v15, :cond_3

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move-object v12, v13

    .line 128
    :goto_3
    check-cast v12, La/lok0;

    .line 129
    .line 130
    move-object/from16 v11, p2

    .line 131
    .line 132
    move-object v14, v13

    .line 133
    iget-boolean v13, v11, La/sff0;->J:Z

    .line 134
    .line 135
    move-object v15, v14

    .line 136
    iget-object v14, v0, La/btk;->b:Ljava/lang/String;

    .line 137
    .line 138
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 139
    .line 140
    move-object/from16 v8, p6

    .line 141
    .line 142
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    new-instance v15, Ljava/util/ArrayList;

    .line 147
    .line 148
    move-object/from16 v0, p5

    .line 149
    .line 150
    move-object/from16 v24, v1

    .line 151
    .line 152
    move/from16 v17, v7

    .line 153
    .line 154
    const/16 v1, 0xa

    .line 155
    .line 156
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    invoke-direct {v15, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v18

    .line 171
    if-eqz v18, :cond_5

    .line 172
    .line 173
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v18

    .line 177
    move-object/from16 v1, v18

    .line 178
    .line 179
    check-cast v1, La/lok0;

    .line 180
    .line 181
    iget v1, v1, La/lok0;->a:I

    .line 182
    .line 183
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    const/16 v1, 0xa

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_5
    if-eqz v12, :cond_6

    .line 194
    .line 195
    iget-boolean v1, v12, La/lok0;->n:Z

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_6
    const/4 v1, 0x0

    .line 199
    :goto_5
    if-eqz v12, :cond_7

    .line 200
    .line 201
    iget-boolean v7, v12, La/lok0;->p:Z

    .line 202
    .line 203
    move/from16 v18, v7

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_7
    const/16 v18, 0x0

    .line 207
    .line 208
    :goto_6
    iget-object v7, v9, La/d0t;->K:Ljava/util/List;

    .line 209
    .line 210
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_b

    .line 215
    .line 216
    iget-object v7, v9, La/d0t;->k:Ljava/util/List;

    .line 217
    .line 218
    if-eqz v7, :cond_8

    .line 219
    .line 220
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v19

    .line 224
    if-eqz v19, :cond_8

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_8
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v19

    .line 235
    if-eqz v19, :cond_a

    .line 236
    .line 237
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v19

    .line 241
    move-object/from16 v0, v19

    .line 242
    .line 243
    check-cast v0, La/d0t;

    .line 244
    .line 245
    iget-object v0, v0, La/d0t;->K:Ljava/util/List;

    .line 246
    .line 247
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_9

    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_9
    move-object/from16 v0, p5

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_a
    :goto_8
    sget-object v0, La/i5l0;->a:La/i5l0;

    .line 258
    .line 259
    :goto_9
    move-object/from16 v21, v0

    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_b
    :goto_a
    if-eqz p9, :cond_c

    .line 263
    .line 264
    sget-object v0, La/k5l0;->a:La/k5l0;

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_c
    sget-object v0, La/l5l0;->a:La/l5l0;

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :goto_b
    if-eqz v12, :cond_d

    .line 271
    .line 272
    iget-object v0, v12, La/lok0;->u:Ljava/lang/String;

    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_d
    const/4 v0, 0x0

    .line 276
    :goto_c
    if-nez v0, :cond_e

    .line 277
    .line 278
    const-string v0, ""

    .line 279
    .line 280
    :cond_e
    move-object/from16 v22, v0

    .line 281
    .line 282
    const/16 v19, 0x0

    .line 283
    .line 284
    move-object/from16 v11, p0

    .line 285
    .line 286
    move-object/from16 v20, p4

    .line 287
    .line 288
    move/from16 v12, p7

    .line 289
    .line 290
    move/from16 v23, p10

    .line 291
    .line 292
    move-object/from16 v16, v15

    .line 293
    .line 294
    move/from16 v15, v17

    .line 295
    .line 296
    move/from16 v17, v1

    .line 297
    .line 298
    invoke-static/range {v9 .. v23}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-object/from16 v0, p1

    .line 306
    .line 307
    move-object/from16 v10, p3

    .line 308
    .line 309
    move-object/from16 v1, v24

    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const/16 v8, 0xa

    .line 313
    .line 314
    goto/16 :goto_2

    .line 315
    .line 316
    :cond_f
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-instance v1, La/vb90;

    .line 321
    .line 322
    const/4 v6, 0x1

    .line 323
    move/from16 v7, p10

    .line 324
    .line 325
    invoke-direct {v1, v4, v0, v6, v7}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 326
    .line 327
    .line 328
    sget-object v0, La/k3g;->a:La/k3g;

    .line 329
    .line 330
    invoke-direct {v2, v3, v5, v1, v0}, La/gqk;-><init>(Ljava/lang/String;La/b8m;La/vb90;La/m3g;)V

    .line 331
    .line 332
    .line 333
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0
.end method
