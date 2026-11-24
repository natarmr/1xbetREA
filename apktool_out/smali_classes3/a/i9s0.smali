.class public final La/i9s0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/j9s0;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:J

.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Long;

.field public final synthetic p:I


# direct methods
.method public constructor <init>(La/j9s0;IZJILjava/lang/Long;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i9s0;->j:La/j9s0;

    .line 2
    .line 3
    iput p2, p0, La/i9s0;->k:I

    .line 4
    .line 5
    iput-boolean p3, p0, La/i9s0;->l:Z

    .line 6
    .line 7
    iput-wide p4, p0, La/i9s0;->m:J

    .line 8
    .line 9
    iput p6, p0, La/i9s0;->n:I

    .line 10
    .line 11
    iput-object p7, p0, La/i9s0;->o:Ljava/lang/Long;

    .line 12
    .line 13
    iput p8, p0, La/i9s0;->p:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/i9s0;

    .line 2
    .line 3
    iget-object v7, p0, La/i9s0;->o:Ljava/lang/Long;

    .line 4
    .line 5
    iget v8, p0, La/i9s0;->p:I

    .line 6
    .line 7
    iget-object v1, p0, La/i9s0;->j:La/j9s0;

    .line 8
    .line 9
    iget v2, p0, La/i9s0;->k:I

    .line 10
    .line 11
    iget-boolean v3, p0, La/i9s0;->l:Z

    .line 12
    .line 13
    iget-wide v4, p0, La/i9s0;->m:J

    .line 14
    .line 15
    iget v6, p0, La/i9s0;->n:I

    .line 16
    .line 17
    move-object v9, p2

    .line 18
    invoke-direct/range {v0 .. v9}, La/i9s0;-><init>(La/j9s0;IZJILjava/lang/Long;ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/i9s0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/i9s0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/i9s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    sget-object v13, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v0, v12, La/i9s0;->i:Z

    .line 6
    .line 7
    const/4 v14, 0x0

    .line 8
    const/4 v15, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    move-object/from16 v17, v15

    .line 20
    .line 21
    move v15, v1

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v15

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v12, La/i9s0;->j:La/j9s0;

    .line 34
    .line 35
    iget-object v2, v0, La/j9s0;->c:La/zas0;

    .line 36
    .line 37
    iget-object v3, v0, La/j9s0;->e:La/knf0;

    .line 38
    .line 39
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 v3, -0x1

    .line 50
    iget v5, v12, La/i9s0;->k:I

    .line 51
    .line 52
    if-ne v5, v3, :cond_2

    .line 53
    .line 54
    move-object v9, v15

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance v3, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-direct {v3, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 59
    .line 60
    .line 61
    move-object v9, v3

    .line 62
    :goto_0
    iget-boolean v3, v12, La/i9s0;->l:Z

    .line 63
    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    iget-object v0, v0, La/j9s0;->b:La/btt0;

    .line 67
    .line 68
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move-object v0, v15

    .line 74
    :goto_1
    iput-boolean v1, v12, La/i9s0;->i:Z

    .line 75
    .line 76
    iget-object v2, v2, La/zas0;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, La/lkr0;

    .line 79
    .line 80
    invoke-virtual {v2}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, La/b9s0;

    .line 85
    .line 86
    new-instance v11, La/fk9;

    .line 87
    .line 88
    invoke-direct {v11, v14}, La/fk9;-><init>(Z)V

    .line 89
    .line 90
    .line 91
    move v5, v1

    .line 92
    move-object v1, v0

    .line 93
    move-object v0, v2

    .line 94
    iget-wide v2, v12, La/i9s0;->m:J

    .line 95
    .line 96
    move v6, v5

    .line 97
    const/16 v5, 0x16

    .line 98
    .line 99
    move v7, v6

    .line 100
    const/4 v6, 0x1

    .line 101
    move v8, v7

    .line 102
    iget v7, v12, La/i9s0;->n:I

    .line 103
    .line 104
    move v10, v8

    .line 105
    iget-object v8, v12, La/i9s0;->o:Ljava/lang/Long;

    .line 106
    .line 107
    move/from16 v16, v10

    .line 108
    .line 109
    iget v10, v12, La/i9s0;->p:I

    .line 110
    .line 111
    move-object/from16 v17, v15

    .line 112
    .line 113
    move/from16 v15, v16

    .line 114
    .line 115
    invoke-interface/range {v0 .. v12}, La/b9s0;->d(Ljava/lang/String;JLjava/lang/String;IIILjava/lang/Long;Ljava/lang/Integer;ILa/fk9;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-ne v0, v13, :cond_4

    .line 120
    .line 121
    return-object v13

    .line 122
    :cond_4
    :goto_2
    check-cast v0, La/dx5;

    .line 123
    .line 124
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/g88;

    .line 129
    .line 130
    iget-object v0, v0, La/g88;->a:Ljava/util/List;

    .line 131
    .line 132
    if-eqz v0, :cond_12

    .line 133
    .line 134
    new-instance v1, Ljava/util/ArrayList;

    .line 135
    .line 136
    const/16 v2, 0xa

    .line 137
    .line 138
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_11

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, La/dhs;

    .line 160
    .line 161
    iget-object v3, v2, La/dhs;->a:Ljava/lang/Long;

    .line 162
    .line 163
    if-eqz v3, :cond_10

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v19

    .line 169
    iget-object v3, v2, La/dhs;->b:Ljava/lang/String;

    .line 170
    .line 171
    const-string v4, ""

    .line 172
    .line 173
    if-nez v3, :cond_5

    .line 174
    .line 175
    move-object/from16 v28, v4

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_5
    move-object/from16 v28, v3

    .line 179
    .line 180
    :goto_4
    iget-object v3, v2, La/dhs;->c:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz v3, :cond_a

    .line 183
    .line 184
    new-instance v5, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 187
    .line 188
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_6

    .line 196
    .line 197
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_6
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v3, v6, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-nez v6, :cond_9

    .line 208
    .line 209
    const-string v6, "https://"

    .line 210
    .line 211
    invoke-static {v3, v6, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_7

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_7
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    const/16 v7, 0x2f

    .line 223
    .line 224
    if-lez v6, :cond_8

    .line 225
    .line 226
    const-string v6, "/"

    .line 227
    .line 228
    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-nez v6, :cond_8

    .line 233
    .line 234
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    :cond_8
    new-array v6, v15, [C

    .line 238
    .line 239
    aput-char v7, v6, v14

    .line 240
    .line 241
    invoke-static {v3, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_9
    :goto_5
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    :goto_6
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    goto :goto_7

    .line 260
    :cond_a
    move-object/from16 v3, v17

    .line 261
    .line 262
    :goto_7
    if-nez v3, :cond_b

    .line 263
    .line 264
    move-object/from16 v29, v4

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_b
    move-object/from16 v29, v3

    .line 268
    .line 269
    :goto_8
    iget-object v3, v2, La/dhs;->d:Ljava/lang/Integer;

    .line 270
    .line 271
    if-eqz v3, :cond_c

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    int-to-long v5, v3

    .line 278
    :goto_9
    move-wide/from16 v21, v5

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_c
    const-wide/16 v5, 0x0

    .line 282
    .line 283
    goto :goto_9

    .line 284
    :goto_a
    iget-object v3, v2, La/dhs;->e:Ljava/lang/String;

    .line 285
    .line 286
    if-nez v3, :cond_d

    .line 287
    .line 288
    move-object/from16 v27, v4

    .line 289
    .line 290
    goto :goto_b

    .line 291
    :cond_d
    move-object/from16 v27, v3

    .line 292
    .line 293
    :goto_b
    iget-object v3, v2, La/dhs;->h:Ljava/lang/Boolean;

    .line 294
    .line 295
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v34

    .line 301
    iget-object v3, v2, La/dhs;->g:Ljava/lang/Boolean;

    .line 302
    .line 303
    if-eqz v3, :cond_e

    .line 304
    .line 305
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    move/from16 v35, v3

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_e
    move/from16 v35, v14

    .line 313
    .line 314
    :goto_c
    iget-object v2, v2, La/dhs;->i:Ljava/lang/Boolean;

    .line 315
    .line 316
    if-eqz v2, :cond_f

    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    move/from16 v36, v2

    .line 323
    .line 324
    goto :goto_d

    .line 325
    :cond_f
    move/from16 v36, v14

    .line 326
    .line 327
    :goto_d
    sget-object v38, La/iun;->a:La/iun;

    .line 328
    .line 329
    new-instance v18, La/mlr;

    .line 330
    .line 331
    const/16 v39, 0x0

    .line 332
    .line 333
    const v40, 0x20080

    .line 334
    .line 335
    .line 336
    const-wide/16 v23, 0x0

    .line 337
    .line 338
    const-wide/16 v25, 0x0

    .line 339
    .line 340
    const/16 v30, 0x0

    .line 341
    .line 342
    const/16 v31, 0x0

    .line 343
    .line 344
    const/16 v32, 0x0

    .line 345
    .line 346
    const/16 v33, 0x0

    .line 347
    .line 348
    const/16 v37, 0x0

    .line 349
    .line 350
    invoke-direct/range {v18 .. v40}, La/mlr;-><init>(JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;ZI)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v2, v18

    .line 354
    .line 355
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto/16 :goto_3

    .line 359
    .line 360
    :cond_10
    invoke-static/range {v17 .. v17}, La/jf4;->k(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    return-object v17

    .line 364
    :cond_11
    move-object v15, v1

    .line 365
    goto :goto_e

    .line 366
    :cond_12
    move-object/from16 v15, v17

    .line 367
    .line 368
    :goto_e
    if-nez v15, :cond_13

    .line 369
    .line 370
    sget-object v15, La/iun;->a:La/iun;

    .line 371
    .line 372
    :cond_13
    new-instance v0, La/d88;

    .line 373
    .line 374
    invoke-direct {v0, v15}, La/d88;-><init>(Ljava/util/List;)V

    .line 375
    .line 376
    .line 377
    return-object v0
.end method
