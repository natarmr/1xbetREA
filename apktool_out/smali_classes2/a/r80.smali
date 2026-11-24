.class public final La/r80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gii0;

.field public final b:La/pek0;

.field public final c:La/d80;

.field public final d:La/btt0;

.field public final e:La/knf0;

.field public final f:La/nc;


# direct methods
.method public constructor <init>(La/gii0;La/pek0;La/gfk0;La/d80;La/btt0;La/knf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/r80;->a:La/gii0;

    .line 5
    .line 6
    iput-object p2, p0, La/r80;->b:La/pek0;

    .line 7
    .line 8
    iput-object p4, p0, La/r80;->c:La/d80;

    .line 9
    .line 10
    iput-object p5, p0, La/r80;->d:La/btt0;

    .line 11
    .line 12
    iput-object p6, p0, La/r80;->e:La/knf0;

    .line 13
    .line 14
    new-instance p1, La/nc;

    .line 15
    .line 16
    const/16 p2, 0x9

    .line 17
    .line 18
    invoke-direct {p1, p0, p2}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/r80;->f:La/nc;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;JLa/csr;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, La/q80;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/q80;

    .line 11
    .line 12
    iget v3, v2, La/q80;->l:I

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
    iput v3, v2, La/q80;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/q80;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/q80;-><init>(La/r80;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/q80;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/q80;->l:I

    .line 34
    .line 35
    const/16 v5, 0xa

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v7, :cond_1

    .line 42
    .line 43
    iget-object v0, v2, La/q80;->i:La/pek0;

    .line 44
    .line 45
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, La/r80;->f:La/nc;

    .line 59
    .line 60
    invoke-virtual {v1}, La/nc;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/s70;

    .line 65
    .line 66
    iget-object v4, v0, La/r80;->d:La/btt0;

    .line 67
    .line 68
    invoke-virtual {v4}, La/btt0;->a()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v9, Ljava/util/ArrayList;

    .line 73
    .line 74
    move-object/from16 v8, p1

    .line 75
    .line 76
    invoke-static {v8, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-eqz v10, :cond_3

    .line 92
    .line 93
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    check-cast v10, La/t70;

    .line 98
    .line 99
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v11, La/y70;

    .line 103
    .line 104
    iget-wide v12, v10, La/t70;->a:D

    .line 105
    .line 106
    iget-object v10, v10, La/t70;->b:La/z70;

    .line 107
    .line 108
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-static {v10}, La/b80;->valueOf(Ljava/lang/String;)La/b80;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-direct {v11, v12, v13, v10}, La/y70;-><init>(DLa/b80;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    sget-object v8, La/bg8;->Companion:La/ag8;

    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static/range {p4 .. p4}, La/ag8;->a(La/csr;)La/bg8;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    iget-object v8, v0, La/r80;->e:La/knf0;

    .line 133
    .line 134
    invoke-virtual {v8}, La/knf0;->c()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    new-instance v8, La/u80;

    .line 139
    .line 140
    move-wide/from16 v11, p2

    .line 141
    .line 142
    invoke-direct/range {v8 .. v13}, La/u80;-><init>(Ljava/util/ArrayList;La/bg8;JLjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v0, La/r80;->b:La/pek0;

    .line 146
    .line 147
    iput-object v0, v2, La/q80;->i:La/pek0;

    .line 148
    .line 149
    iput v7, v2, La/q80;->l:I

    .line 150
    .line 151
    invoke-interface {v1, v4, v8, v2}, La/s70;->a(Ljava/lang/String;La/u80;La/yje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-ne v1, v3, :cond_4

    .line 156
    .line 157
    return-object v3

    .line 158
    :cond_4
    :goto_2
    check-cast v1, La/u2t;

    .line 159
    .line 160
    invoke-virtual {v1}, La/u2t;->a()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, La/x80;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v0, v1, La/x80;->f:Ljava/lang/Long;

    .line 170
    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v2

    .line 177
    :goto_3
    move-wide v8, v2

    .line 178
    goto :goto_4

    .line 179
    :cond_5
    const-wide/16 v2, 0x0

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :goto_4
    iget-object v0, v1, La/x80;->d:Ljava/lang/Double;

    .line 183
    .line 184
    const-wide/16 v2, 0x0

    .line 185
    .line 186
    if-eqz v0, :cond_6

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v10

    .line 192
    goto :goto_5

    .line 193
    :cond_6
    move-wide v10, v2

    .line 194
    :goto_5
    iget-object v0, v1, La/x80;->g:Ljava/lang/Double;

    .line 195
    .line 196
    if-eqz v0, :cond_7

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 199
    .line 200
    .line 201
    move-result-wide v12

    .line 202
    goto :goto_6

    .line 203
    :cond_7
    move-wide v12, v2

    .line 204
    :goto_6
    iget-object v0, v1, La/x80;->a:Ljava/lang/Integer;

    .line 205
    .line 206
    if-eqz v0, :cond_8

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    int-to-double v2, v0

    .line 213
    :cond_8
    move-wide v14, v2

    .line 214
    iget-object v0, v1, La/x80;->b:Ljava/util/List;

    .line 215
    .line 216
    if-eqz v0, :cond_12

    .line 217
    .line 218
    sget-object v2, La/yeg0;->a:La/lme0;

    .line 219
    .line 220
    const/4 v3, 0x0

    .line 221
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Ljava/lang/Integer;

    .line 226
    .line 227
    if-eqz v0, :cond_11

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {}, La/yeg0;->values()[La/yeg0;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    array-length v4, v2

    .line 241
    move v7, v3

    .line 242
    :goto_7
    if-ge v7, v4, :cond_a

    .line 243
    .line 244
    aget-object v16, v2, v7

    .line 245
    .line 246
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-ne v3, v0, :cond_9

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 254
    .line 255
    const/4 v3, 0x0

    .line 256
    goto :goto_7

    .line 257
    :cond_a
    move-object/from16 v16, v6

    .line 258
    .line 259
    :goto_8
    if-eqz v16, :cond_10

    .line 260
    .line 261
    iget-object v0, v1, La/x80;->e:Ljava/util/List;

    .line 262
    .line 263
    if-eqz v0, :cond_f

    .line 264
    .line 265
    new-instance v1, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_e

    .line 283
    .line 284
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    check-cast v2, Ljava/lang/Number;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    sget-object v3, La/z70;->a:La/hfk0;

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {}, La/z70;->values()[La/z70;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    array-length v4, v3

    .line 304
    const/4 v5, 0x0

    .line 305
    :goto_a
    if-ge v5, v4, :cond_c

    .line 306
    .line 307
    aget-object v7, v3, v5

    .line 308
    .line 309
    move-object/from16 p5, v6

    .line 310
    .line 311
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    if-ne v6, v2, :cond_b

    .line 316
    .line 317
    goto :goto_b

    .line 318
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 319
    .line 320
    move-object/from16 v6, p5

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_c
    move-object/from16 p5, v6

    .line 324
    .line 325
    move-object/from16 v7, p5

    .line 326
    .line 327
    :goto_b
    if-eqz v7, :cond_d

    .line 328
    .line 329
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-object/from16 v6, p5

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_d
    invoke-static/range {p5 .. p5}, La/jf4;->k(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-object p5

    .line 339
    :cond_e
    new-instance v7, La/o80;

    .line 340
    .line 341
    const/16 v18, 0x40

    .line 342
    .line 343
    move-object/from16 v17, v1

    .line 344
    .line 345
    invoke-direct/range {v7 .. v18}, La/o80;-><init>(JDDDLa/yeg0;Ljava/util/ArrayList;I)V

    .line 346
    .line 347
    .line 348
    return-object v7

    .line 349
    :cond_f
    move-object/from16 p5, v6

    .line 350
    .line 351
    invoke-static/range {p5 .. p5}, La/jf4;->k(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    return-object p5

    .line 355
    :cond_10
    move-object/from16 p5, v6

    .line 356
    .line 357
    invoke-static/range {p5 .. p5}, La/jf4;->k(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    return-object p5

    .line 361
    :cond_11
    move-object/from16 p5, v6

    .line 362
    .line 363
    invoke-static/range {p5 .. p5}, La/jf4;->k(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    return-object p5

    .line 367
    :cond_12
    move-object/from16 p5, v6

    .line 368
    .line 369
    invoke-static/range {p5 .. p5}, La/jf4;->k(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-object p5
.end method
