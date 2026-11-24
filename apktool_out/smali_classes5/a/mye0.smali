.class public final La/mye0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/eze0;


# direct methods
.method public synthetic constructor <init>(La/eze0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mye0;->i:B

    iput-object p1, p0, La/mye0;->k:La/eze0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/mye0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mye0;->k:La/eze0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mye0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mye0;-><init>(La/eze0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mye0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mye0;-><init>(La/eze0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/mye0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/mye0;-><init>(La/eze0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mye0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mye0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mye0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mye0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/mye0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/mye0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/mye0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/mye0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/mye0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/mye0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mye0;->i:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v6, v0, La/mye0;->k:La/eze0;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x3

    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v1, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v11, v0, La/mye0;->j:B

    .line 23
    .line 24
    if-eqz v11, :cond_3

    .line 25
    .line 26
    if-eq v11, v7, :cond_2

    .line 27
    .line 28
    if-eq v11, v8, :cond_1

    .line 29
    .line 30
    if-ne v11, v9, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v2, p1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget v5, La/eze0;->y0:I

    .line 57
    .line 58
    iget-object v5, v6, La/i3t0;->i:La/ocj;

    .line 59
    .line 60
    iget-object v11, v5, La/ocj;->a:La/p7m0;

    .line 61
    .line 62
    :cond_4
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-object v12, v5

    .line 70
    check-cast v12, La/aye0;

    .line 71
    .line 72
    const/16 v33, 0x0

    .line 73
    .line 74
    const v34, 0x7ffffffe

    .line 75
    .line 76
    .line 77
    const/4 v13, 0x1

    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    const/16 v19, 0x0

    .line 87
    .line 88
    const/16 v20, 0x0

    .line 89
    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    const/16 v22, 0x0

    .line 93
    .line 94
    const/16 v23, 0x0

    .line 95
    .line 96
    const/16 v24, 0x0

    .line 97
    .line 98
    const/16 v25, 0x0

    .line 99
    .line 100
    const/16 v26, 0x0

    .line 101
    .line 102
    const/16 v27, 0x0

    .line 103
    .line 104
    const/16 v28, 0x0

    .line 105
    .line 106
    const/16 v29, 0x0

    .line 107
    .line 108
    const/16 v30, 0x0

    .line 109
    .line 110
    const/16 v31, 0x0

    .line 111
    .line 112
    const/16 v32, 0x0

    .line 113
    .line 114
    invoke-static/range {v12 .. v34}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-virtual {v11, v5, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_4

    .line 123
    .line 124
    iget-object v5, v6, La/eze0;->V:La/xfu;

    .line 125
    .line 126
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    check-cast v11, La/aye0;

    .line 131
    .line 132
    iget-object v11, v11, La/aye0;->h:La/q1f0;

    .line 133
    .line 134
    iget-object v11, v11, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 135
    .line 136
    if-eqz v11, :cond_5

    .line 137
    .line 138
    iget v2, v11, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->a:I

    .line 139
    .line 140
    :cond_5
    iput-byte v7, v0, La/mye0;->j:B

    .line 141
    .line 142
    invoke-virtual {v5, v2, v0}, La/xfu;->e(ILa/zje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    if-ne v2, v1, :cond_6

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 150
    .line 151
    iget-object v5, v6, La/eze0;->B:La/tkt0;

    .line 152
    .line 153
    new-instance v7, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_7

    .line 171
    .line 172
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    check-cast v4, La/qse0;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v11, La/lq90;

    .line 182
    .line 183
    iget v12, v4, La/qse0;->a:I

    .line 184
    .line 185
    iget-object v4, v4, La/qse0;->b:Ljava/lang/String;

    .line 186
    .line 187
    invoke-direct {v11, v4, v12, v3}, La/lq90;-><init>(Ljava/lang/String;IZ)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_7
    iput-byte v8, v0, La/mye0;->j:B

    .line 195
    .line 196
    iget-object v2, v5, La/tkt0;->a:La/dq00;

    .line 197
    .line 198
    invoke-virtual {v2, v7}, La/dq00;->k(Ljava/util/List;)V

    .line 199
    .line 200
    .line 201
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    if-ne v2, v1, :cond_8

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_8
    :goto_2
    iget-object v2, v6, La/eze0;->a0:La/mne;

    .line 207
    .line 208
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 209
    .line 210
    new-instance v3, La/rye0;

    .line 211
    .line 212
    invoke-direct {v3, v6, v10}, La/rye0;-><init>(La/eze0;La/yje;)V

    .line 213
    .line 214
    .line 215
    iput-byte v9, v0, La/mye0;->j:B

    .line 216
    .line 217
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-ne v0, v1, :cond_9

    .line 222
    .line 223
    :goto_3
    move-object v10, v1

    .line 224
    goto :goto_5

    .line 225
    :cond_9
    :goto_4
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    :goto_5
    return-object v10

    .line 228
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 229
    .line 230
    iget-byte v2, v0, La/mye0;->j:B

    .line 231
    .line 232
    if-eqz v2, :cond_d

    .line 233
    .line 234
    if-eq v2, v7, :cond_c

    .line 235
    .line 236
    if-eq v2, v8, :cond_b

    .line 237
    .line 238
    if-ne v2, v9, :cond_a

    .line 239
    .line 240
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_a

    .line 244
    .line 245
    :cond_a
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_b

    .line 249
    .line 250
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_8

    .line 254
    .line 255
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move-object/from16 v2, p1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sget v2, La/eze0;->y0:I

    .line 265
    .line 266
    iget-object v2, v6, La/i3t0;->i:La/ocj;

    .line 267
    .line 268
    iget-object v11, v2, La/ocj;->a:La/p7m0;

    .line 269
    .line 270
    :cond_e
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-object v12, v2

    .line 278
    check-cast v12, La/aye0;

    .line 279
    .line 280
    const/16 v33, 0x0

    .line 281
    .line 282
    const v34, 0x7ffffffe

    .line 283
    .line 284
    .line 285
    const/4 v13, 0x1

    .line 286
    const/4 v14, 0x0

    .line 287
    const/4 v15, 0x0

    .line 288
    const/16 v16, 0x0

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/16 v18, 0x0

    .line 293
    .line 294
    const/16 v19, 0x0

    .line 295
    .line 296
    const/16 v20, 0x0

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    const/16 v22, 0x0

    .line 301
    .line 302
    const/16 v23, 0x0

    .line 303
    .line 304
    const/16 v24, 0x0

    .line 305
    .line 306
    const/16 v25, 0x0

    .line 307
    .line 308
    const/16 v26, 0x0

    .line 309
    .line 310
    const/16 v27, 0x0

    .line 311
    .line 312
    const/16 v28, 0x0

    .line 313
    .line 314
    const/16 v29, 0x0

    .line 315
    .line 316
    const/16 v30, 0x0

    .line 317
    .line 318
    const/16 v31, 0x0

    .line 319
    .line 320
    const/16 v32, 0x0

    .line 321
    .line 322
    invoke-static/range {v12 .. v34}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {v11, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_e

    .line 331
    .line 332
    iget-object v2, v6, La/eze0;->F:La/a7q;

    .line 333
    .line 334
    iput-byte v7, v0, La/mye0;->j:B

    .line 335
    .line 336
    iget-object v2, v2, La/a7q;->a:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v2, La/xr;

    .line 339
    .line 340
    invoke-virtual {v2, v0}, La/xr;->f(La/zje;)Ljava/io/Serializable;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    if-ne v2, v1, :cond_f

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_f
    :goto_6
    check-cast v2, Ljava/lang/Iterable;

    .line 348
    .line 349
    new-instance v5, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_10

    .line 367
    .line 368
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, La/xuf;

    .line 373
    .line 374
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    new-instance v7, La/vuf;

    .line 378
    .line 379
    iget-wide v11, v4, La/xuf;->a:J

    .line 380
    .line 381
    iget-object v13, v4, La/xuf;->c:Ljava/lang/String;

    .line 382
    .line 383
    iget-object v4, v4, La/xuf;->b:Ljava/lang/String;

    .line 384
    .line 385
    invoke-direct {v7, v11, v12, v13, v4}, La/vuf;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_10
    iget-object v2, v6, La/eze0;->E:La/h0q0;

    .line 393
    .line 394
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    check-cast v4, La/aye0;

    .line 399
    .line 400
    iget-object v4, v4, La/aye0;->h:La/q1f0;

    .line 401
    .line 402
    iget-object v4, v4, La/q1f0;->g:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;

    .line 403
    .line 404
    if-eqz v4, :cond_11

    .line 405
    .line 406
    iget v3, v4, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;->a:I

    .line 407
    .line 408
    :cond_11
    iput-byte v8, v0, La/mye0;->j:B

    .line 409
    .line 410
    invoke-virtual {v2, v5, v3, v0}, La/h0q0;->w(Ljava/util/ArrayList;ILa/zje;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-ne v2, v1, :cond_12

    .line 415
    .line 416
    goto :goto_9

    .line 417
    :cond_12
    :goto_8
    iget-object v2, v6, La/eze0;->a0:La/mne;

    .line 418
    .line 419
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 420
    .line 421
    new-instance v3, La/oye0;

    .line 422
    .line 423
    invoke-direct {v3, v6, v10}, La/oye0;-><init>(La/eze0;La/yje;)V

    .line 424
    .line 425
    .line 426
    iput-byte v9, v0, La/mye0;->j:B

    .line 427
    .line 428
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    if-ne v0, v1, :cond_13

    .line 433
    .line 434
    :goto_9
    move-object v10, v1

    .line 435
    goto :goto_b

    .line 436
    :cond_13
    :goto_a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 437
    .line 438
    :goto_b
    return-object v10

    .line 439
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 440
    .line 441
    iget-byte v11, v0, La/mye0;->j:B

    .line 442
    .line 443
    if-eqz v11, :cond_17

    .line 444
    .line 445
    if-eq v11, v7, :cond_16

    .line 446
    .line 447
    if-eq v11, v8, :cond_15

    .line 448
    .line 449
    if-ne v11, v9, :cond_14

    .line 450
    .line 451
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_10

    .line 455
    .line 456
    :cond_14
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    goto/16 :goto_11

    .line 460
    .line 461
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_e

    .line 465
    .line 466
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    move-object/from16 v2, p1

    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    sget v5, La/eze0;->y0:I

    .line 476
    .line 477
    iget-object v5, v6, La/i3t0;->i:La/ocj;

    .line 478
    .line 479
    iget-object v5, v5, La/ocj;->a:La/p7m0;

    .line 480
    .line 481
    :cond_18
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v11

    .line 485
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-object v12, v11

    .line 489
    check-cast v12, La/aye0;

    .line 490
    .line 491
    const/16 v33, 0x0

    .line 492
    .line 493
    const v34, 0x7ffffffe

    .line 494
    .line 495
    .line 496
    const/4 v13, 0x1

    .line 497
    const/4 v14, 0x0

    .line 498
    const/4 v15, 0x0

    .line 499
    const/16 v16, 0x0

    .line 500
    .line 501
    const/16 v17, 0x0

    .line 502
    .line 503
    const/16 v18, 0x0

    .line 504
    .line 505
    const/16 v19, 0x0

    .line 506
    .line 507
    const/16 v20, 0x0

    .line 508
    .line 509
    const/16 v21, 0x0

    .line 510
    .line 511
    const/16 v22, 0x0

    .line 512
    .line 513
    const/16 v23, 0x0

    .line 514
    .line 515
    const/16 v24, 0x0

    .line 516
    .line 517
    const/16 v25, 0x0

    .line 518
    .line 519
    const/16 v26, 0x0

    .line 520
    .line 521
    const/16 v27, 0x0

    .line 522
    .line 523
    const/16 v28, 0x0

    .line 524
    .line 525
    const/16 v29, 0x0

    .line 526
    .line 527
    const/16 v30, 0x0

    .line 528
    .line 529
    const/16 v31, 0x0

    .line 530
    .line 531
    const/16 v32, 0x0

    .line 532
    .line 533
    invoke-static/range {v12 .. v34}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 534
    .line 535
    .line 536
    move-result-object v12

    .line 537
    invoke-virtual {v5, v11, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-eqz v11, :cond_18

    .line 542
    .line 543
    iget-object v5, v6, La/eze0;->W:La/cmt;

    .line 544
    .line 545
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v11

    .line 549
    check-cast v11, La/aye0;

    .line 550
    .line 551
    iget-object v11, v11, La/aye0;->h:La/q1f0;

    .line 552
    .line 553
    iget-object v11, v11, La/q1f0;->v:Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;

    .line 554
    .line 555
    if-eqz v11, :cond_19

    .line 556
    .line 557
    iget v2, v11, Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;->a:I

    .line 558
    .line 559
    :cond_19
    iput-byte v7, v0, La/mye0;->j:B

    .line 560
    .line 561
    invoke-virtual {v5, v2, v0}, La/cmt;->b(ILa/zje;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    if-ne v2, v1, :cond_1a

    .line 566
    .line 567
    goto :goto_f

    .line 568
    :cond_1a
    :goto_c
    check-cast v2, Ljava/util/List;

    .line 569
    .line 570
    iget-object v5, v6, La/eze0;->C:La/owp0;

    .line 571
    .line 572
    new-instance v7, Ljava/util/ArrayList;

    .line 573
    .line 574
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 579
    .line 580
    .line 581
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v4

    .line 589
    if-eqz v4, :cond_1b

    .line 590
    .line 591
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    check-cast v4, La/skc;

    .line 596
    .line 597
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    new-instance v11, La/fq90;

    .line 601
    .line 602
    iget v12, v4, La/skc;->a:I

    .line 603
    .line 604
    iget-object v4, v4, La/skc;->b:Ljava/lang/String;

    .line 605
    .line 606
    invoke-direct {v11, v4, v12, v3}, La/fq90;-><init>(Ljava/lang/String;IZ)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    goto :goto_d

    .line 613
    :cond_1b
    iput-byte v8, v0, La/mye0;->j:B

    .line 614
    .line 615
    iget-object v2, v5, La/owp0;->b:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v2, La/dq00;

    .line 618
    .line 619
    invoke-virtual {v2, v7}, La/dq00;->k(Ljava/util/List;)V

    .line 620
    .line 621
    .line 622
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 623
    .line 624
    if-ne v2, v1, :cond_1c

    .line 625
    .line 626
    goto :goto_f

    .line 627
    :cond_1c
    :goto_e
    iget-object v2, v6, La/eze0;->a0:La/mne;

    .line 628
    .line 629
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 630
    .line 631
    new-instance v3, La/lye0;

    .line 632
    .line 633
    invoke-direct {v3, v6, v10}, La/lye0;-><init>(La/eze0;La/yje;)V

    .line 634
    .line 635
    .line 636
    iput-byte v9, v0, La/mye0;->j:B

    .line 637
    .line 638
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    if-ne v0, v1, :cond_1d

    .line 643
    .line 644
    :goto_f
    move-object v10, v1

    .line 645
    goto :goto_11

    .line 646
    :cond_1d
    :goto_10
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    :goto_11
    return-object v10

    .line 649
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
