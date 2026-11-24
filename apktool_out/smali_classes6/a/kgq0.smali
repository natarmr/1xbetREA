.class public final La/kgq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/g090;

.field public final c:La/beq0;

.field public final d:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/g090;La/beq0;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/kgq0;->a:La/knf0;

    .line 8
    .line 9
    iput-object p2, p0, La/kgq0;->b:La/g090;

    .line 10
    .line 11
    iput-object p3, p0, La/kgq0;->c:La/beq0;

    .line 12
    .line 13
    iput-object p4, p0, La/kgq0;->d:La/btt0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/s470;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/ggq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ggq0;

    .line 7
    .line 8
    iget v1, v0, La/ggq0;->k:I

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
    iput v1, v0, La/ggq0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ggq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ggq0;-><init>(La/kgq0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ggq0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ggq0;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/16 p2, 0xf

    .line 62
    .line 63
    iget-object v2, p0, La/kgq0;->b:La/g090;

    .line 64
    .line 65
    iget-object p0, p0, La/kgq0;->d:La/btt0;

    .line 66
    .line 67
    if-eq p1, p2, :cond_6

    .line 68
    .line 69
    const/16 p2, 0x10

    .line 70
    .line 71
    if-ne p1, p2, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iput v4, v0, La/ggq0;->k:I

    .line 78
    .line 79
    invoke-virtual {v2, p0, v0}, La/g090;->h(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-ne p2, v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    check-cast p2, La/o9r;

    .line 87
    .line 88
    invoke-static {p2}, La/qim0;->s(La/o9r;)La/xfq0;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_5
    new-instance p0, Ljava/lang/EnumConstantNotPresentException;

    .line 94
    .line 95
    const-class p1, La/s470;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-direct {p0, p1, p2}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_6
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iput v3, v0, La/ggq0;->k:I

    .line 110
    .line 111
    invoke-virtual {v2, p0, v0}, La/g090;->j(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    if-ne p2, v1, :cond_7

    .line 116
    .line 117
    :goto_2
    return-object v1

    .line 118
    :cond_7
    :goto_3
    check-cast p2, La/mft;

    .line 119
    .line 120
    invoke-static {p2}, La/qim0;->t(La/mft;)La/xfq0;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method

.method public final b(La/s470;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/hgq0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/hgq0;

    .line 11
    .line 12
    iget v3, v2, La/hgq0;->k:I

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
    iput v3, v2, La/hgq0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/hgq0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/hgq0;-><init>(La/kgq0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/hgq0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/hgq0;->k:I

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v9, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v8, :cond_2

    .line 43
    .line 44
    if-ne v4, v7, :cond_1

    .line 45
    .line 46
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_8

    .line 50
    .line 51
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v9

    .line 57
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/16 v4, 0xf

    .line 69
    .line 70
    iget-object v10, v0, La/kgq0;->d:La/btt0;

    .line 71
    .line 72
    iget-object v0, v0, La/kgq0;->b:La/g090;

    .line 73
    .line 74
    if-eq v1, v4, :cond_c

    .line 75
    .line 76
    const/16 v4, 0x10

    .line 77
    .line 78
    if-ne v1, v4, :cond_b

    .line 79
    .line 80
    invoke-virtual {v10}, La/btt0;->a()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput v8, v2, La/hgq0;->k:I

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, La/g090;->i(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-ne v1, v3, :cond_4

    .line 91
    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_4
    :goto_1
    check-cast v1, La/i9r;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v7, La/aeq0;

    .line 100
    .line 101
    sget-object v8, La/lgq0;->a:La/lgq0;

    .line 102
    .line 103
    iget-object v0, v1, La/i9r;->a:La/f9r;

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    iget-object v1, v0, La/f9r;->a:Ljava/lang/Double;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 112
    .line 113
    .line 114
    move-result-wide v1

    .line 115
    move-wide v9, v1

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    move-wide v9, v5

    .line 118
    :goto_2
    const/4 v11, 0x0

    .line 119
    const/4 v12, 0x0

    .line 120
    invoke-direct/range {v7 .. v12}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 121
    .line 122
    .line 123
    new-instance v8, La/aeq0;

    .line 124
    .line 125
    sget-object v9, La/lgq0;->b:La/lgq0;

    .line 126
    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    iget-object v1, v0, La/f9r;->b:Ljava/lang/Double;

    .line 130
    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 134
    .line 135
    .line 136
    move-result-wide v1

    .line 137
    move-wide v10, v1

    .line 138
    goto :goto_3

    .line 139
    :cond_6
    move-wide v10, v5

    .line 140
    :goto_3
    const/4 v12, 0x0

    .line 141
    const/4 v13, 0x0

    .line 142
    invoke-direct/range {v8 .. v13}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 143
    .line 144
    .line 145
    new-instance v9, La/aeq0;

    .line 146
    .line 147
    sget-object v10, La/lgq0;->c:La/lgq0;

    .line 148
    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    iget-object v1, v0, La/f9r;->c:Ljava/lang/Double;

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 156
    .line 157
    .line 158
    move-result-wide v1

    .line 159
    move-wide v11, v1

    .line 160
    goto :goto_4

    .line 161
    :cond_7
    move-wide v11, v5

    .line 162
    :goto_4
    const/4 v13, 0x0

    .line 163
    const/4 v14, 0x0

    .line 164
    invoke-direct/range {v9 .. v14}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 165
    .line 166
    .line 167
    new-instance v10, La/aeq0;

    .line 168
    .line 169
    sget-object v11, La/lgq0;->d:La/lgq0;

    .line 170
    .line 171
    if-eqz v0, :cond_8

    .line 172
    .line 173
    iget-object v1, v0, La/f9r;->d:Ljava/lang/Double;

    .line 174
    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 178
    .line 179
    .line 180
    move-result-wide v1

    .line 181
    move-wide v12, v1

    .line 182
    goto :goto_5

    .line 183
    :cond_8
    move-wide v12, v5

    .line 184
    :goto_5
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    invoke-direct/range {v10 .. v15}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 187
    .line 188
    .line 189
    new-instance v11, La/aeq0;

    .line 190
    .line 191
    sget-object v12, La/lgq0;->e:La/lgq0;

    .line 192
    .line 193
    if-eqz v0, :cond_9

    .line 194
    .line 195
    iget-object v1, v0, La/f9r;->e:Ljava/lang/Double;

    .line 196
    .line 197
    if-eqz v1, :cond_9

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    move-wide v13, v1

    .line 204
    goto :goto_6

    .line 205
    :cond_9
    move-wide v13, v5

    .line 206
    :goto_6
    const/4 v15, 0x0

    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    invoke-direct/range {v11 .. v16}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 210
    .line 211
    .line 212
    new-instance v12, La/aeq0;

    .line 213
    .line 214
    sget-object v13, La/lgq0;->f:La/lgq0;

    .line 215
    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    iget-object v0, v0, La/f9r;->f:Ljava/lang/Double;

    .line 219
    .line 220
    if-eqz v0, :cond_a

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 223
    .line 224
    .line 225
    move-result-wide v5

    .line 226
    :cond_a
    move-wide v14, v5

    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    invoke-direct/range {v12 .. v17}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 232
    .line 233
    .line 234
    filled-new-array/range {v7 .. v12}, [La/aeq0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0

    .line 243
    :cond_b
    new-instance v0, Ljava/lang/EnumConstantNotPresentException;

    .line 244
    .line 245
    const-class v1, La/s470;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-direct {v0, v1, v2}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :cond_c
    invoke-virtual {v10}, La/btt0;->a()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iput v7, v2, La/hgq0;->k:I

    .line 260
    .line 261
    invoke-virtual {v0, v1, v2}, La/g090;->k(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    if-ne v1, v3, :cond_d

    .line 266
    .line 267
    :goto_7
    return-object v3

    .line 268
    :cond_d
    :goto_8
    check-cast v1, La/aft;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v0, v1, La/aft;->a:Ljava/util/List;

    .line 274
    .line 275
    if-eqz v0, :cond_10

    .line 276
    .line 277
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-eqz v0, :cond_10

    .line 282
    .line 283
    new-instance v9, Ljava/util/ArrayList;

    .line 284
    .line 285
    const/16 v1, 0xa

    .line 286
    .line 287
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_10

    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, La/gft;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance v10, La/aeq0;

    .line 314
    .line 315
    iget-object v2, v1, La/gft;->a:Ljava/lang/String;

    .line 316
    .line 317
    if-eqz v2, :cond_e

    .line 318
    .line 319
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-eqz v2, :cond_e

    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    invoke-static {v2}, La/gnm0;->x(I)La/lgq0;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    :goto_a
    move-object v11, v2

    .line 334
    goto :goto_b

    .line 335
    :cond_e
    sget-object v2, La/lgq0;->a:La/lgq0;

    .line 336
    .line 337
    goto :goto_a

    .line 338
    :goto_b
    iget-object v1, v1, La/gft;->b:Ljava/lang/Double;

    .line 339
    .line 340
    if-eqz v1, :cond_f

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 343
    .line 344
    .line 345
    move-result-wide v1

    .line 346
    move-wide v12, v1

    .line 347
    goto :goto_c

    .line 348
    :cond_f
    move-wide v12, v5

    .line 349
    :goto_c
    const/4 v14, 0x0

    .line 350
    const/4 v15, 0x0

    .line 351
    invoke-direct/range {v10 .. v15}, La/aeq0;-><init>(La/lgq0;DII)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_10
    if-nez v9, :cond_11

    .line 359
    .line 360
    sget-object v0, La/iun;->a:La/iun;

    .line 361
    .line 362
    return-object v0

    .line 363
    :cond_11
    return-object v9
.end method

.method public final c(JIIILa/s470;JLa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    instance-of v1, v0, La/igq0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/igq0;

    .line 9
    .line 10
    iget v2, v1, La/igq0;->k:I

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
    iput v2, v1, La/igq0;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/igq0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/igq0;-><init>(La/kgq0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/igq0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/igq0;->k:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    if-eq v3, v5, :cond_2

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v3, 0xf

    .line 65
    .line 66
    iget-object v6, p0, La/kgq0;->b:La/g090;

    .line 67
    .line 68
    iget-object v7, p0, La/kgq0;->d:La/btt0;

    .line 69
    .line 70
    if-eq v0, v3, :cond_6

    .line 71
    .line 72
    const/16 p0, 0x10

    .line 73
    .line 74
    if-ne v0, p0, :cond_5

    .line 75
    .line 76
    invoke-virtual {v7}, La/btt0;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iput v5, v1, La/igq0;->k:I

    .line 81
    .line 82
    new-instance v7, La/x8r;

    .line 83
    .line 84
    move-wide v11, p1

    .line 85
    move/from16 v8, p3

    .line 86
    .line 87
    move/from16 v9, p4

    .line 88
    .line 89
    move/from16 v10, p5

    .line 90
    .line 91
    invoke-direct/range {v7 .. v12}, La/x8r;-><init>(IIIJ)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, p0, v7, v1}, La/g090;->t(Ljava/lang/String;La/x8r;La/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-ne v0, v2, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    :goto_1
    check-cast v0, La/o9r;

    .line 102
    .line 103
    invoke-static {v0}, La/qim0;->s(La/o9r;)La/xfq0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_5
    new-instance p0, Ljava/lang/EnumConstantNotPresentException;

    .line 109
    .line 110
    const-class v0, La/s470;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {p0, v0, v1}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0

    .line 120
    :cond_6
    invoke-virtual {v7}, La/btt0;->a()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v3, Ljava/lang/Integer;

    .line 125
    .line 126
    move/from16 v9, p4

    .line 127
    .line 128
    invoke-direct {v3, v9}, Ljava/lang/Integer;-><init>(I)V

    .line 129
    .line 130
    .line 131
    new-instance v5, Ljava/lang/Integer;

    .line 132
    .line 133
    move/from16 v10, p5

    .line 134
    .line 135
    invoke-direct {v5, v10}, Ljava/lang/Integer;-><init>(I)V

    .line 136
    .line 137
    .line 138
    filled-new-array {v3, v5}, [Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    iput v4, v1, La/igq0;->k:I

    .line 147
    .line 148
    iget-object p0, p0, La/kgq0;->a:La/knf0;

    .line 149
    .line 150
    invoke-virtual {p0}, La/knf0;->c()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    new-instance v7, La/wet;

    .line 155
    .line 156
    move/from16 v8, p3

    .line 157
    .line 158
    move-wide/from16 v9, p7

    .line 159
    .line 160
    invoke-direct/range {v7 .. v12}, La/wet;-><init>(IJLjava/lang/String;Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v0, v7, v1}, La/g090;->u(Ljava/lang/String;La/wet;La/zje;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v2, :cond_7

    .line 168
    .line 169
    :goto_2
    return-object v2

    .line 170
    :cond_7
    :goto_3
    check-cast v0, La/mft;

    .line 171
    .line 172
    invoke-static {v0}, La/qim0;->t(La/mft;)La/xfq0;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0
.end method

.method public final d(La/csr;DJLa/s470;JLa/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v4, p9

    .line 8
    .line 9
    instance-of v5, v4, La/jgq0;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, La/jgq0;

    .line 15
    .line 16
    iget v6, v5, La/jgq0;->k:I

    .line 17
    .line 18
    const/high16 v7, -0x80000000

    .line 19
    .line 20
    and-int v8, v6, v7

    .line 21
    .line 22
    if-eqz v8, :cond_0

    .line 23
    .line 24
    sub-int/2addr v6, v7

    .line 25
    iput v6, v5, La/jgq0;->k:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v5, La/jgq0;

    .line 29
    .line 30
    invoke-direct {v5, v0, v4}, La/jgq0;-><init>(La/kgq0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v4, v5, La/jgq0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v6, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v7, v5, La/jgq0;->k:I

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v7, :cond_3

    .line 43
    .line 44
    if-eq v7, v9, :cond_2

    .line 45
    .line 46
    if-ne v7, v8, :cond_1

    .line 47
    .line 48
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v10

    .line 59
    :cond_2
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/16 v7, 0xf

    .line 71
    .line 72
    iget-object v11, v0, La/kgq0;->b:La/g090;

    .line 73
    .line 74
    iget-object v12, v0, La/kgq0;->d:La/btt0;

    .line 75
    .line 76
    if-eq v4, v7, :cond_7

    .line 77
    .line 78
    const/16 v0, 0x10

    .line 79
    .line 80
    if-ne v4, v0, :cond_6

    .line 81
    .line 82
    invoke-virtual {v12}, La/btt0;->a()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput v9, v5, La/jgq0;->k:I

    .line 87
    .line 88
    new-instance v4, Ljava/lang/Double;

    .line 89
    .line 90
    invoke-direct {v4, v2, v3}, Ljava/lang/Double;-><init>(D)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v1, La/csr;->a:La/bsr;

    .line 94
    .line 95
    iget-object v2, v2, La/bsr;->a:La/esr;

    .line 96
    .line 97
    invoke-virtual {v2}, La/esr;->a()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_4

    .line 102
    .line 103
    move-object v10, v4

    .line 104
    :cond_4
    sget-object v2, La/bg8;->Companion:La/ag8;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, La/ag8;->a(La/csr;)La/bg8;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v2, La/l9r;

    .line 114
    .line 115
    move-wide/from16 v13, p4

    .line 116
    .line 117
    invoke-direct {v2, v13, v14, v1, v10}, La/l9r;-><init>(JLa/bg8;Ljava/lang/Double;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11, v0, v2, v5}, La/g090;->r(Ljava/lang/String;La/l9r;La/zje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-ne v4, v6, :cond_5

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    :goto_1
    check-cast v4, La/o9r;

    .line 128
    .line 129
    invoke-static {v4}, La/qim0;->s(La/o9r;)La/xfq0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :cond_6
    new-instance v0, Ljava/lang/EnumConstantNotPresentException;

    .line 135
    .line 136
    const-class v1, La/s470;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {v0, v1, v2}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :cond_7
    move-wide/from16 v13, p4

    .line 147
    .line 148
    invoke-virtual {v12}, La/btt0;->a()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    iput v8, v5, La/jgq0;->k:I

    .line 153
    .line 154
    sget-object v7, La/bg8;->Companion:La/ag8;

    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v1}, La/ag8;->a(La/csr;)La/bg8;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    new-instance v7, Ljava/lang/Double;

    .line 164
    .line 165
    invoke-direct {v7, v2, v3}, Ljava/lang/Double;-><init>(D)V

    .line 166
    .line 167
    .line 168
    iget-object v1, v1, La/csr;->a:La/bsr;

    .line 169
    .line 170
    iget-object v1, v1, La/bsr;->a:La/esr;

    .line 171
    .line 172
    invoke-virtual {v1}, La/esr;->a()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_8

    .line 177
    .line 178
    move-object/from16 v16, v7

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_8
    move-object/from16 v16, v10

    .line 182
    .line 183
    :goto_2
    iget-object v0, v0, La/kgq0;->a:La/knf0;

    .line 184
    .line 185
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v19

    .line 189
    new-instance v12, La/jft;

    .line 190
    .line 191
    move-wide/from16 v17, v13

    .line 192
    .line 193
    move-wide/from16 v13, p7

    .line 194
    .line 195
    invoke-direct/range {v12 .. v19}, La/jft;-><init>(JLa/bg8;Ljava/lang/Double;JLjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v11, v4, v12, v5}, La/g090;->s(Ljava/lang/String;La/jft;La/zje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    if-ne v4, v6, :cond_9

    .line 203
    .line 204
    :goto_3
    return-object v6

    .line 205
    :cond_9
    :goto_4
    check-cast v4, La/mft;

    .line 206
    .line 207
    invoke-static {v4}, La/qim0;->t(La/mft;)La/xfq0;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0
.end method

.method public final e(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/kgq0;->c:La/beq0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/beq0;->a:La/xfq0;

    .line 10
    .line 11
    iget-object p0, p0, La/xfq0;->b:La/xeq0;

    .line 12
    .line 13
    iput-object p1, p0, La/xeq0;->b:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public final f(La/xfq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/kgq0;->c:La/beq0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/beq0;->a:La/xfq0;

    .line 13
    .line 14
    return-void
.end method
