.class public final La/xbf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/ocf0;


# direct methods
.method public synthetic constructor <init>(La/ocf0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xbf0;->i:B

    iput-object p1, p0, La/xbf0;->k:La/ocf0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xbf0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xbf0;->k:La/ocf0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xbf0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/xbf0;-><init>(La/ocf0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/xbf0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/xbf0;-><init>(La/ocf0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/xbf0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/xbf0;-><init>(La/ocf0;La/yje;B)V

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
    iget-byte v0, p0, La/xbf0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xbf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xbf0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xbf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xbf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xbf0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xbf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/xbf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/xbf0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/xbf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xbf0;->i:B

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
    iget-object v6, v0, La/xbf0;->k:La/ocf0;

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
    iget-byte v11, v0, La/xbf0;->j:B

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
    sget v5, La/ocf0;->z0:I

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
    check-cast v12, La/mbf0;

    .line 71
    .line 72
    const/16 v34, 0x0

    .line 73
    .line 74
    const v35, 0x3ffffffe    # 1.9999998f

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
    const/16 v33, 0x0

    .line 115
    .line 116
    invoke-static/range {v12 .. v35}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    invoke-virtual {v11, v5, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_4

    .line 125
    .line 126
    iget-object v5, v6, La/ocf0;->U:La/xfu;

    .line 127
    .line 128
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    check-cast v11, La/mbf0;

    .line 133
    .line 134
    iget-object v11, v11, La/mbf0;->g:La/p1f0;

    .line 135
    .line 136
    iget-object v11, v11, La/p1f0;->g:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 137
    .line 138
    if-eqz v11, :cond_5

    .line 139
    .line 140
    iget v2, v11, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;->a:I

    .line 141
    .line 142
    :cond_5
    iput-byte v7, v0, La/xbf0;->j:B

    .line 143
    .line 144
    invoke-virtual {v5, v2, v0}, La/xfu;->e(ILa/zje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    if-ne v2, v1, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 152
    .line 153
    iget-object v5, v6, La/ocf0;->A:La/tkt0;

    .line 154
    .line 155
    new-instance v7, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_7

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, La/qse0;

    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    new-instance v11, La/lq90;

    .line 184
    .line 185
    iget v12, v4, La/qse0;->a:I

    .line 186
    .line 187
    iget-object v4, v4, La/qse0;->b:Ljava/lang/String;

    .line 188
    .line 189
    invoke-direct {v11, v4, v12, v3}, La/lq90;-><init>(Ljava/lang/String;IZ)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_7
    iput-byte v8, v0, La/xbf0;->j:B

    .line 197
    .line 198
    iget-object v2, v5, La/tkt0;->a:La/dq00;

    .line 199
    .line 200
    invoke-virtual {v2, v7}, La/dq00;->k(Ljava/util/List;)V

    .line 201
    .line 202
    .line 203
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    if-ne v2, v1, :cond_8

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_8
    :goto_2
    iget-object v2, v6, La/ocf0;->Z:La/mne;

    .line 209
    .line 210
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 211
    .line 212
    new-instance v3, La/bcf0;

    .line 213
    .line 214
    invoke-direct {v3, v6, v10}, La/bcf0;-><init>(La/ocf0;La/yje;)V

    .line 215
    .line 216
    .line 217
    iput-byte v9, v0, La/xbf0;->j:B

    .line 218
    .line 219
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, v1, :cond_9

    .line 224
    .line 225
    :goto_3
    move-object v10, v1

    .line 226
    goto :goto_5

    .line 227
    :cond_9
    :goto_4
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    :goto_5
    return-object v10

    .line 230
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 231
    .line 232
    iget-byte v2, v0, La/xbf0;->j:B

    .line 233
    .line 234
    if-eqz v2, :cond_d

    .line 235
    .line 236
    if-eq v2, v7, :cond_c

    .line 237
    .line 238
    if-eq v2, v8, :cond_b

    .line 239
    .line 240
    if-ne v2, v9, :cond_a

    .line 241
    .line 242
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_a

    .line 246
    .line 247
    :cond_a
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_b

    .line 251
    .line 252
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_8

    .line 256
    .line 257
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    move-object/from16 v2, p1

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    sget v2, La/ocf0;->z0:I

    .line 267
    .line 268
    iget-object v2, v6, La/i3t0;->i:La/ocj;

    .line 269
    .line 270
    iget-object v11, v2, La/ocj;->a:La/p7m0;

    .line 271
    .line 272
    :cond_e
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-object v12, v2

    .line 280
    check-cast v12, La/mbf0;

    .line 281
    .line 282
    const/16 v34, 0x0

    .line 283
    .line 284
    const v35, 0x3ffffffe    # 1.9999998f

    .line 285
    .line 286
    .line 287
    const/4 v13, 0x1

    .line 288
    const/4 v14, 0x0

    .line 289
    const/4 v15, 0x0

    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/16 v18, 0x0

    .line 295
    .line 296
    const/16 v19, 0x0

    .line 297
    .line 298
    const/16 v20, 0x0

    .line 299
    .line 300
    const/16 v21, 0x0

    .line 301
    .line 302
    const/16 v22, 0x0

    .line 303
    .line 304
    const/16 v23, 0x0

    .line 305
    .line 306
    const/16 v24, 0x0

    .line 307
    .line 308
    const/16 v25, 0x0

    .line 309
    .line 310
    const/16 v26, 0x0

    .line 311
    .line 312
    const/16 v27, 0x0

    .line 313
    .line 314
    const/16 v28, 0x0

    .line 315
    .line 316
    const/16 v29, 0x0

    .line 317
    .line 318
    const/16 v30, 0x0

    .line 319
    .line 320
    const/16 v31, 0x0

    .line 321
    .line 322
    const/16 v32, 0x0

    .line 323
    .line 324
    const/16 v33, 0x0

    .line 325
    .line 326
    invoke-static/range {v12 .. v35}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-virtual {v11, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-eqz v2, :cond_e

    .line 335
    .line 336
    iget-object v2, v6, La/ocf0;->E:La/a7q;

    .line 337
    .line 338
    iput-byte v7, v0, La/xbf0;->j:B

    .line 339
    .line 340
    iget-object v2, v2, La/a7q;->a:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v2, La/xr;

    .line 343
    .line 344
    invoke-virtual {v2, v0}, La/xr;->f(La/zje;)Ljava/io/Serializable;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    if-ne v2, v1, :cond_f

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_f
    :goto_6
    check-cast v2, Ljava/lang/Iterable;

    .line 352
    .line 353
    new-instance v5, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-eqz v4, :cond_10

    .line 371
    .line 372
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    check-cast v4, La/xuf;

    .line 377
    .line 378
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v7, La/vuf;

    .line 382
    .line 383
    iget-wide v11, v4, La/xuf;->a:J

    .line 384
    .line 385
    iget-object v13, v4, La/xuf;->c:Ljava/lang/String;

    .line 386
    .line 387
    iget-object v4, v4, La/xuf;->b:Ljava/lang/String;

    .line 388
    .line 389
    invoke-direct {v7, v11, v12, v13, v4}, La/vuf;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_10
    iget-object v2, v6, La/ocf0;->D:La/h0q0;

    .line 397
    .line 398
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    check-cast v4, La/mbf0;

    .line 403
    .line 404
    iget-object v4, v4, La/mbf0;->g:La/p1f0;

    .line 405
    .line 406
    iget-object v4, v4, La/p1f0;->g:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;

    .line 407
    .line 408
    if-eqz v4, :cond_11

    .line 409
    .line 410
    iget v3, v4, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;->a:I

    .line 411
    .line 412
    :cond_11
    iput-byte v8, v0, La/xbf0;->j:B

    .line 413
    .line 414
    invoke-virtual {v2, v5, v3, v0}, La/h0q0;->w(Ljava/util/ArrayList;ILa/zje;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    if-ne v2, v1, :cond_12

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_12
    :goto_8
    iget-object v2, v6, La/ocf0;->Z:La/mne;

    .line 422
    .line 423
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 424
    .line 425
    new-instance v3, La/zbf0;

    .line 426
    .line 427
    invoke-direct {v3, v6, v10}, La/zbf0;-><init>(La/ocf0;La/yje;)V

    .line 428
    .line 429
    .line 430
    iput-byte v9, v0, La/xbf0;->j:B

    .line 431
    .line 432
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    if-ne v0, v1, :cond_13

    .line 437
    .line 438
    :goto_9
    move-object v10, v1

    .line 439
    goto :goto_b

    .line 440
    :cond_13
    :goto_a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    :goto_b
    return-object v10

    .line 443
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 444
    .line 445
    iget-byte v11, v0, La/xbf0;->j:B

    .line 446
    .line 447
    if-eqz v11, :cond_17

    .line 448
    .line 449
    if-eq v11, v7, :cond_16

    .line 450
    .line 451
    if-eq v11, v8, :cond_15

    .line 452
    .line 453
    if-ne v11, v9, :cond_14

    .line 454
    .line 455
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    goto/16 :goto_10

    .line 459
    .line 460
    :cond_14
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_11

    .line 464
    .line 465
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_e

    .line 469
    .line 470
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    move-object/from16 v2, p1

    .line 474
    .line 475
    goto :goto_c

    .line 476
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    sget v5, La/ocf0;->z0:I

    .line 480
    .line 481
    iget-object v5, v6, La/i3t0;->i:La/ocj;

    .line 482
    .line 483
    iget-object v5, v5, La/ocj;->a:La/p7m0;

    .line 484
    .line 485
    :cond_18
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    move-object v12, v11

    .line 493
    check-cast v12, La/mbf0;

    .line 494
    .line 495
    const/16 v34, 0x0

    .line 496
    .line 497
    const v35, 0x3ffffffe    # 1.9999998f

    .line 498
    .line 499
    .line 500
    const/4 v13, 0x1

    .line 501
    const/4 v14, 0x0

    .line 502
    const/4 v15, 0x0

    .line 503
    const/16 v16, 0x0

    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    .line 507
    const/16 v18, 0x0

    .line 508
    .line 509
    const/16 v19, 0x0

    .line 510
    .line 511
    const/16 v20, 0x0

    .line 512
    .line 513
    const/16 v21, 0x0

    .line 514
    .line 515
    const/16 v22, 0x0

    .line 516
    .line 517
    const/16 v23, 0x0

    .line 518
    .line 519
    const/16 v24, 0x0

    .line 520
    .line 521
    const/16 v25, 0x0

    .line 522
    .line 523
    const/16 v26, 0x0

    .line 524
    .line 525
    const/16 v27, 0x0

    .line 526
    .line 527
    const/16 v28, 0x0

    .line 528
    .line 529
    const/16 v29, 0x0

    .line 530
    .line 531
    const/16 v30, 0x0

    .line 532
    .line 533
    const/16 v31, 0x0

    .line 534
    .line 535
    const/16 v32, 0x0

    .line 536
    .line 537
    const/16 v33, 0x0

    .line 538
    .line 539
    invoke-static/range {v12 .. v35}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 540
    .line 541
    .line 542
    move-result-object v12

    .line 543
    invoke-virtual {v5, v11, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v11

    .line 547
    if-eqz v11, :cond_18

    .line 548
    .line 549
    iget-object v5, v6, La/ocf0;->V:La/cmt;

    .line 550
    .line 551
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    check-cast v11, La/mbf0;

    .line 556
    .line 557
    iget-object v11, v11, La/mbf0;->g:La/p1f0;

    .line 558
    .line 559
    iget-object v11, v11, La/p1f0;->v:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;

    .line 560
    .line 561
    if-eqz v11, :cond_19

    .line 562
    .line 563
    iget v2, v11, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;->a:I

    .line 564
    .line 565
    :cond_19
    iput-byte v7, v0, La/xbf0;->j:B

    .line 566
    .line 567
    invoke-virtual {v5, v2, v0}, La/cmt;->b(ILa/zje;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    if-ne v2, v1, :cond_1a

    .line 572
    .line 573
    goto :goto_f

    .line 574
    :cond_1a
    :goto_c
    check-cast v2, Ljava/util/List;

    .line 575
    .line 576
    iget-object v5, v6, La/ocf0;->B:La/owp0;

    .line 577
    .line 578
    new-instance v7, Ljava/util/ArrayList;

    .line 579
    .line 580
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 585
    .line 586
    .line 587
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    if-eqz v4, :cond_1b

    .line 596
    .line 597
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    check-cast v4, La/skc;

    .line 602
    .line 603
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    new-instance v11, La/fq90;

    .line 607
    .line 608
    iget v12, v4, La/skc;->a:I

    .line 609
    .line 610
    iget-object v4, v4, La/skc;->b:Ljava/lang/String;

    .line 611
    .line 612
    invoke-direct {v11, v4, v12, v3}, La/fq90;-><init>(Ljava/lang/String;IZ)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    goto :goto_d

    .line 619
    :cond_1b
    iput-byte v8, v0, La/xbf0;->j:B

    .line 620
    .line 621
    iget-object v2, v5, La/owp0;->b:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v2, La/dq00;

    .line 624
    .line 625
    invoke-virtual {v2, v7}, La/dq00;->k(Ljava/util/List;)V

    .line 626
    .line 627
    .line 628
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 629
    .line 630
    if-ne v2, v1, :cond_1c

    .line 631
    .line 632
    goto :goto_f

    .line 633
    :cond_1c
    :goto_e
    iget-object v2, v6, La/ocf0;->Z:La/mne;

    .line 634
    .line 635
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 636
    .line 637
    new-instance v3, La/wbf0;

    .line 638
    .line 639
    invoke-direct {v3, v6, v10}, La/wbf0;-><init>(La/ocf0;La/yje;)V

    .line 640
    .line 641
    .line 642
    iput-byte v9, v0, La/xbf0;->j:B

    .line 643
    .line 644
    invoke-static {v2, v3, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    if-ne v0, v1, :cond_1d

    .line 649
    .line 650
    :goto_f
    move-object v10, v1

    .line 651
    goto :goto_11

    .line 652
    :cond_1d
    :goto_10
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 653
    .line 654
    :goto_11
    return-object v10

    .line 655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
