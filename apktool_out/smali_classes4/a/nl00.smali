.class public final La/nl00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/tzi;

.field public final synthetic k:La/j700;

.field public final synthetic l:La/zmb;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Ljava/util/Set;

.field public final synthetic p:Z

.field public final synthetic q:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(La/tzi;La/j700;La/zmb;Ljava/util/List;Ljava/util/List;Ljava/util/Set;ZLjava/lang/Integer;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nl00;->j:La/tzi;

    .line 2
    .line 3
    iput-object p2, p0, La/nl00;->k:La/j700;

    .line 4
    .line 5
    iput-object p3, p0, La/nl00;->l:La/zmb;

    .line 6
    .line 7
    iput-object p4, p0, La/nl00;->m:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, La/nl00;->n:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, La/nl00;->o:Ljava/util/Set;

    .line 12
    .line 13
    iput-boolean p7, p0, La/nl00;->p:Z

    .line 14
    .line 15
    iput-object p8, p0, La/nl00;->q:Ljava/lang/Integer;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/nl00;

    .line 2
    .line 3
    iget-boolean v7, p0, La/nl00;->p:Z

    .line 4
    .line 5
    iget-object v8, p0, La/nl00;->q:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v1, p0, La/nl00;->j:La/tzi;

    .line 8
    .line 9
    iget-object v2, p0, La/nl00;->k:La/j700;

    .line 10
    .line 11
    iget-object v3, p0, La/nl00;->l:La/zmb;

    .line 12
    .line 13
    iget-object v4, p0, La/nl00;->m:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, p0, La/nl00;->n:Ljava/util/List;

    .line 16
    .line 17
    iget-object v6, p0, La/nl00;->o:Ljava/util/Set;

    .line 18
    .line 19
    move-object v9, p1

    .line 20
    invoke-direct/range {v0 .. v9}, La/nl00;-><init>(La/tzi;La/j700;La/zmb;Ljava/util/List;Ljava/util/List;Ljava/util/Set;ZLjava/lang/Integer;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/nl00;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nl00;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/nl00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/nl00;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v7, v0, La/nl00;->k:La/j700;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, v0, La/nl00;->j:La/tzi;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    if-ne v2, v5, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v2, p1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v4

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v6, La/tzi;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, La/rtu;

    .line 36
    .line 37
    invoke-static {v7}, La/t9x;->J(La/j700;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    iput-boolean v5, v0, La/nl00;->i:Z

    .line 42
    .line 43
    invoke-virtual {v2, v8, v3, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-ne v2, v1, :cond_2

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_2
    :goto_0
    check-cast v2, La/c3c0;

    .line 51
    .line 52
    iget-object v1, v6, La/tzi;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, La/viu;

    .line 55
    .line 56
    invoke-virtual {v1}, La/viu;->a()J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    invoke-static {v8, v9}, La/ynq0;->f(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v12

    .line 64
    iget-object v1, v0, La/nl00;->l:La/zmb;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/4 v8, 0x3

    .line 71
    move-wide v9, v12

    .line 72
    iget-object v12, v0, La/nl00;->o:Ljava/util/Set;

    .line 73
    .line 74
    iget-object v11, v0, La/nl00;->n:Ljava/util/List;

    .line 75
    .line 76
    move-object/from16 v18, v12

    .line 77
    .line 78
    move-wide v12, v9

    .line 79
    iget-object v10, v0, La/nl00;->m:Ljava/util/List;

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    if-ne v1, v5, :cond_4

    .line 84
    .line 85
    iget-object v1, v6, La/tzi;->c:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v14, v1

    .line 88
    check-cast v14, La/nvu;

    .line 89
    .line 90
    iget v15, v2, La/c3c0;->a:I

    .line 91
    .line 92
    move-wide/from16 v16, v12

    .line 93
    .line 94
    iget-boolean v13, v2, La/c3c0;->b:Z

    .line 95
    .line 96
    iget-wide v1, v2, La/c3c0;->c:J

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v6, v14, La/nvu;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, La/lef0;

    .line 113
    .line 114
    invoke-static {v7}, La/t9x;->J(La/j700;)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    iget-boolean v12, v0, La/nl00;->p:Z

    .line 119
    .line 120
    iget-object v0, v0, La/nl00;->q:Ljava/lang/Integer;

    .line 121
    .line 122
    if-eqz v9, :cond_3

    .line 123
    .line 124
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    iget-object v3, v6, La/lef0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, La/m8l0;

    .line 131
    .line 132
    iget-object v3, v3, La/m8l0;->a:La/p7m0;

    .line 133
    .line 134
    new-instance v5, La/ll00;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    move/from16 v16, v12

    .line 138
    .line 139
    move-object/from16 v12, v18

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    move-object/from16 v17, v0

    .line 144
    .line 145
    move-object v8, v14

    .line 146
    move v9, v15

    .line 147
    move-wide v14, v1

    .line 148
    invoke-direct/range {v5 .. v18}, La/ll00;-><init>(La/yje;La/j700;Ljava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v3, v5}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    return-object v0

    .line 156
    :cond_3
    move-object/from16 v23, v0

    .line 157
    .line 158
    move-wide/from16 v20, v1

    .line 159
    .line 160
    move v0, v12

    .line 161
    move/from16 v19, v13

    .line 162
    .line 163
    move-wide/from16 v12, v16

    .line 164
    .line 165
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v17

    .line 169
    invoke-virtual {v6, v0}, La/lef0;->f(Z)La/p7m0;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v6}, La/lef0;->g()La/p6d;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    new-instance v6, La/xu3;

    .line 182
    .line 183
    invoke-direct {v6, v2, v8}, La/xu3;-><init>(La/p6d;B)V

    .line 184
    .line 185
    .line 186
    new-instance v2, La/jl00;

    .line 187
    .line 188
    invoke-direct {v2, v8, v4, v3}, La/jl00;-><init>(ILa/yje;B)V

    .line 189
    .line 190
    .line 191
    new-instance v3, La/p6d;

    .line 192
    .line 193
    invoke-direct {v3, v1, v6, v2, v5}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 194
    .line 195
    .line 196
    move-object/from16 v16, v10

    .line 197
    .line 198
    new-instance v10, La/kl00;

    .line 199
    .line 200
    const/4 v11, 0x0

    .line 201
    const/16 v24, 0x0

    .line 202
    .line 203
    move/from16 v22, v0

    .line 204
    .line 205
    invoke-direct/range {v10 .. v24}, La/kl00;-><init>(La/yje;JLjava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V

    .line 206
    .line 207
    .line 208
    invoke-static {v3, v10}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 214
    .line 215
    .line 216
    return-object v4

    .line 217
    :cond_5
    move-object/from16 v16, v10

    .line 218
    .line 219
    iget-object v1, v6, La/tzi;->b:Ljava/lang/Object;

    .line 220
    .line 221
    move-object v14, v1

    .line 222
    check-cast v14, La/y3v;

    .line 223
    .line 224
    iget v15, v2, La/c3c0;->a:I

    .line 225
    .line 226
    move-wide v9, v12

    .line 227
    iget-boolean v13, v2, La/c3c0;->b:Z

    .line 228
    .line 229
    iget-wide v1, v2, La/c3c0;->c:J

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    iget-object v3, v14, La/y3v;->d:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, La/lef0;

    .line 246
    .line 247
    invoke-static {v7}, La/t9x;->J(La/j700;)Z

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    iget-boolean v12, v0, La/nl00;->p:Z

    .line 252
    .line 253
    iget-object v0, v0, La/nl00;->q:Ljava/lang/Integer;

    .line 254
    .line 255
    if-eqz v6, :cond_6

    .line 256
    .line 257
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    iget-object v3, v3, La/lef0;->a:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v3, La/m8l0;

    .line 264
    .line 265
    iget-object v3, v3, La/m8l0;->a:La/p7m0;

    .line 266
    .line 267
    new-instance v5, La/ll00;

    .line 268
    .line 269
    const/4 v6, 0x0

    .line 270
    move/from16 v22, v12

    .line 271
    .line 272
    move-object/from16 v12, v18

    .line 273
    .line 274
    const/16 v18, 0x1

    .line 275
    .line 276
    move-object/from16 v17, v0

    .line 277
    .line 278
    move-object v8, v14

    .line 279
    move v9, v15

    .line 280
    move-object/from16 v10, v16

    .line 281
    .line 282
    move/from16 v16, v22

    .line 283
    .line 284
    move-wide v14, v1

    .line 285
    invoke-direct/range {v5 .. v18}, La/ll00;-><init>(La/yje;La/j700;Ljava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V

    .line 286
    .line 287
    .line 288
    invoke-static {v3, v5}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    return-object v0

    .line 293
    :cond_6
    move-object/from16 v17, v0

    .line 294
    .line 295
    move-wide/from16 v20, v1

    .line 296
    .line 297
    move v0, v12

    .line 298
    move/from16 v19, v13

    .line 299
    .line 300
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v3, v0}, La/lef0;->f(Z)La/p7m0;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v3}, La/lef0;->g()La/p6d;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    new-instance v6, La/xu3;

    .line 317
    .line 318
    const/4 v7, 0x4

    .line 319
    invoke-direct {v6, v3, v7}, La/xu3;-><init>(La/p6d;B)V

    .line 320
    .line 321
    .line 322
    new-instance v3, La/jl00;

    .line 323
    .line 324
    invoke-direct {v3, v8, v4, v5}, La/jl00;-><init>(ILa/yje;B)V

    .line 325
    .line 326
    .line 327
    new-instance v4, La/p6d;

    .line 328
    .line 329
    invoke-direct {v4, v2, v6, v3, v5}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 330
    .line 331
    .line 332
    move-wide v12, v9

    .line 333
    new-instance v10, La/kl00;

    .line 334
    .line 335
    const/4 v11, 0x0

    .line 336
    const/16 v24, 0x1

    .line 337
    .line 338
    move/from16 v22, v0

    .line 339
    .line 340
    move-object/from16 v23, v17

    .line 341
    .line 342
    move-object/from16 v17, v1

    .line 343
    .line 344
    invoke-direct/range {v10 .. v24}, La/kl00;-><init>(La/yje;JLjava/lang/Object;ILjava/util/List;Ljava/util/List;Ljava/util/Set;ZJZLjava/lang/Integer;B)V

    .line 345
    .line 346
    .line 347
    invoke-static {v4, v10}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    return-object v0
.end method
