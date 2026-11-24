.class public final La/m5f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/r7f;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(La/r7f;ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/m5f;->i:B

    iput-object p1, p0, La/m5f;->k:La/r7f;

    iput p2, p0, La/m5f;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/m5f;->i:B

    .line 2
    .line 3
    iget v1, p0, La/m5f;->l:I

    .line 4
    .line 5
    iget-object p0, p0, La/m5f;->k:La/r7f;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/m5f;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p1, p0, v1, p2, v0}, La/m5f;-><init>(La/r7f;ILa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance v0, La/m5f;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, p0, v1, p2, v2}, La/m5f;-><init>(La/r7f;ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iput-boolean p0, v0, La/m5f;->j:Z

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance p1, La/m5f;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p1, p0, v1, p2, v0}, La/m5f;-><init>(La/r7f;ILa/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/m5f;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/m5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/m5f;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/m5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/m5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/m5f;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/m5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/m5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/m5f;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/m5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m5f;->i:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x2

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget v5, v0, La/m5f;->l:I

    .line 10
    .line 11
    iget-object v6, v0, La/m5f;->k:La/r7f;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v1, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v9, v0, La/m5f;->j:Z

    .line 21
    .line 22
    if-eqz v9, :cond_1

    .line 23
    .line 24
    if-ne v9, v7, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, v6, La/r7f;->c2:La/p7m0;

    .line 38
    .line 39
    new-instance v9, La/b04;

    .line 40
    .line 41
    invoke-direct {v9, v3, v8, v2}, La/b04;-><init>(ILa/yje;B)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La/fnq;

    .line 45
    .line 46
    invoke-direct {v2, v4, v9, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 47
    .line 48
    .line 49
    new-instance v3, La/m5f;

    .line 50
    .line 51
    invoke-direct {v3, v6, v5, v8, v7}, La/m5f;-><init>(La/r7f;ILa/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-boolean v7, v0, La/m5f;->j:Z

    .line 55
    .line 56
    invoke-static {v2, v3, v0}, La/ntb;->L(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v1, :cond_2

    .line 61
    .line 62
    move-object v8, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v8

    .line 67
    :pswitch_0
    iget-boolean v0, v0, La/m5f;->j:Z

    .line 68
    .line 69
    sget-object v1, La/wne;->a:La/wne;

    .line 70
    .line 71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v1, v6, La/r7f;->d2:La/ol60;

    .line 77
    .line 78
    new-instance v2, La/t3f;

    .line 79
    .line 80
    invoke-direct {v2, v5}, La/t3f;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_1
    iget-object v1, v6, La/r7f;->d2:La/ol60;

    .line 92
    .line 93
    sget-object v9, La/wne;->a:La/wne;

    .line 94
    .line 95
    iget-boolean v10, v0, La/m5f;->j:Z

    .line 96
    .line 97
    const/4 v11, 0x0

    .line 98
    if-eqz v10, :cond_5

    .line 99
    .line 100
    if-ne v10, v7, :cond_4

    .line 101
    .line 102
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_9

    .line 111
    .line 112
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v4, v6, La/r7f;->F:La/u8u;

    .line 116
    .line 117
    iget-object v10, v4, La/u8u;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v10, La/oif0;

    .line 120
    .line 121
    iget-object v4, v4, La/u8u;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v4, La/g45;

    .line 124
    .line 125
    iget-object v12, v4, La/g45;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v12, La/ave;

    .line 128
    .line 129
    iget-object v12, v12, La/ave;->a:La/q4f;

    .line 130
    .line 131
    sget-object v13, La/q4f;->g:La/q4f;

    .line 132
    .line 133
    sget-object v14, La/q4f;->h:La/q4f;

    .line 134
    .line 135
    filled-new-array {v13, v14}, [La/q4f;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    invoke-static {v15}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    invoke-interface {v15, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    const/4 v8, 0x3

    .line 148
    if-nez v15, :cond_6

    .line 149
    .line 150
    sget-object v4, La/pu40;->b:La/pu40;

    .line 151
    .line 152
    goto/16 :goto_6

    .line 153
    .line 154
    :cond_6
    const-wide/16 v16, -0x1

    .line 155
    .line 156
    if-ne v12, v13, :cond_d

    .line 157
    .line 158
    invoke-virtual {v4}, La/g45;->C()Lkotlin/Pair;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iget-object v12, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v12, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 167
    .line 168
    .line 169
    move-result-wide v12

    .line 170
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v4, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    cmp-long v12, v12, v16

    .line 179
    .line 180
    if-nez v12, :cond_7

    .line 181
    .line 182
    sget-object v4, La/pu40;->e:La/pu40;

    .line 183
    .line 184
    goto/16 :goto_6

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v10}, La/oif0;->n()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    invoke-static {v4, v5, v10}, La/u8u;->n(IILjava/util/List;)Ljava/util/LinkedHashMap;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    if-ne v4, v5, :cond_8

    .line 195
    .line 196
    sget-object v4, La/pu40;->a:La/pu40;

    .line 197
    .line 198
    goto/16 :goto_6

    .line 199
    .line 200
    :cond_8
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_9

    .line 205
    .line 206
    move v10, v11

    .line 207
    goto :goto_3

    .line 208
    :cond_9
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    move v10, v11

    .line 217
    :cond_a
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-eqz v12, :cond_b

    .line 222
    .line 223
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    check-cast v12, Ljava/util/Map$Entry;

    .line 228
    .line 229
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    check-cast v12, Ljava/lang/Number;

    .line 234
    .line 235
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    if-lez v12, :cond_a

    .line 240
    .line 241
    add-int/lit8 v10, v10, 0x1

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_b
    :goto_3
    if-lt v10, v8, :cond_c

    .line 245
    .line 246
    sget-object v4, La/pu40;->b:La/pu40;

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_c
    sget-object v4, La/pu40;->c:La/pu40;

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_d
    if-ne v12, v14, :cond_14

    .line 253
    .line 254
    invoke-virtual {v4}, La/g45;->C()Lkotlin/Pair;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    iget-object v12, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v12, Ljava/lang/Number;

    .line 261
    .line 262
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 263
    .line 264
    .line 265
    move-result-wide v12

    .line 266
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v4, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    cmp-long v12, v12, v16

    .line 275
    .line 276
    if-nez v12, :cond_e

    .line 277
    .line 278
    sget-object v4, La/pu40;->e:La/pu40;

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_e
    invoke-virtual {v10}, La/oif0;->n()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    invoke-static {v4, v5, v10}, La/u8u;->n(IILjava/util/List;)Ljava/util/LinkedHashMap;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    if-ne v4, v5, :cond_f

    .line 290
    .line 291
    sget-object v4, La/pu40;->a:La/pu40;

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_f
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-eqz v4, :cond_10

    .line 299
    .line 300
    move v10, v11

    .line 301
    goto :goto_5

    .line 302
    :cond_10
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    move v10, v11

    .line 311
    :cond_11
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    if-eqz v12, :cond_12

    .line 316
    .line 317
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    check-cast v12, Ljava/util/Map$Entry;

    .line 322
    .line 323
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    check-cast v12, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result v12

    .line 333
    if-lez v12, :cond_11

    .line 334
    .line 335
    add-int/lit8 v10, v10, 0x1

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_12
    :goto_5
    if-lt v10, v3, :cond_13

    .line 339
    .line 340
    sget-object v4, La/pu40;->b:La/pu40;

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_13
    sget-object v4, La/pu40;->d:La/pu40;

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_14
    sget-object v4, La/pu40;->e:La/pu40;

    .line 347
    .line 348
    :goto_6
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_1a

    .line 353
    .line 354
    if-eq v4, v7, :cond_18

    .line 355
    .line 356
    if-eq v4, v3, :cond_17

    .line 357
    .line 358
    if-eq v4, v8, :cond_16

    .line 359
    .line 360
    if-ne v4, v2, :cond_15

    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 364
    .line 365
    .line 366
    const/4 v8, 0x0

    .line 367
    goto :goto_9

    .line 368
    :cond_16
    sget-object v0, La/v3f;->a:La/v3f;

    .line 369
    .line 370
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_17
    new-instance v0, La/u3f;

    .line 375
    .line 376
    const-wide/16 v2, 0x0

    .line 377
    .line 378
    invoke-direct {v0, v11, v2, v3, v11}, La/u3f;-><init>(IJZ)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_18
    iget-object v1, v6, La/r7f;->G:La/z220;

    .line 386
    .line 387
    iput-boolean v7, v0, La/m5f;->j:Z

    .line 388
    .line 389
    invoke-virtual {v1, v5, v0}, La/z220;->A(ILa/zje;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    if-ne v0, v9, :cond_19

    .line 394
    .line 395
    move-object v8, v9

    .line 396
    goto :goto_9

    .line 397
    :cond_19
    :goto_7
    new-instance v0, La/s4f;

    .line 398
    .line 399
    const/16 v1, 0xa

    .line 400
    .line 401
    invoke-direct {v0, v6, v1}, La/s4f;-><init>(La/r7f;B)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v6, v11, v11, v0}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 405
    .line 406
    .line 407
    :cond_1a
    :goto_8
    iget-object v0, v6, La/r7f;->b0:La/ni9;

    .line 408
    .line 409
    invoke-virtual {v0}, La/ni9;->b()V

    .line 410
    .line 411
    .line 412
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    :goto_9
    return-object v8

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
