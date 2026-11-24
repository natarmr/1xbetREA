.class public final La/q5f0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/x5f0;


# direct methods
.method public synthetic constructor <init>(La/x5f0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q5f0;->i:B

    iput-object p1, p0, La/q5f0;->k:La/x5f0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q5f0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q5f0;->k:La/x5f0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q5f0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/q5f0;-><init>(La/x5f0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/q5f0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/q5f0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/q5f0;-><init>(La/x5f0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/q5f0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/q5f0;-><init>(La/x5f0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/q5f0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/q5f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/q5f0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/q5f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/q5f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/q5f0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/q5f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/q5f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/q5f0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/q5f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q5f0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/q5f0;->k:La/x5f0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v0, La/q5f0;->j:Z

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v1, La/x5f0;->z0:I

    .line 22
    .line 23
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v6, v2

    .line 35
    check-cast v6, La/u4f0;

    .line 36
    .line 37
    const/16 v28, 0x0

    .line 38
    .line 39
    const v29, 0x3ffeffff

    .line 40
    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    const/16 v18, 0x0

    .line 56
    .line 57
    const/16 v19, 0x0

    .line 58
    .line 59
    const/16 v21, 0x0

    .line 60
    .line 61
    const/16 v22, 0x0

    .line 62
    .line 63
    const/16 v23, 0x0

    .line 64
    .line 65
    const/16 v24, 0x0

    .line 66
    .line 67
    const/16 v25, 0x0

    .line 68
    .line 69
    const/16 v26, 0x0

    .line 70
    .line 71
    const/16 v27, 0x0

    .line 72
    .line 73
    move/from16 v20, v0

    .line 74
    .line 75
    invoke-static/range {v6 .. v29}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_0
    move/from16 v0, v20

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 92
    .line 93
    iget-boolean v6, v0, La/q5f0;->j:Z

    .line 94
    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    if-ne v6, v4, :cond_1

    .line 98
    .line 99
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object/from16 v0, p1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v5, La/x5f0;->l0:La/jru;

    .line 114
    .line 115
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, La/u4f0;

    .line 120
    .line 121
    iget-object v3, v3, La/u4f0;->m:La/sff0;

    .line 122
    .line 123
    iget-object v3, v3, La/sff0;->k:La/f3c0;

    .line 124
    .line 125
    iget-boolean v3, v3, La/f3c0;->h:Z

    .line 126
    .line 127
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, La/u4f0;

    .line 132
    .line 133
    iget-object v6, v6, La/u4f0;->m:La/sff0;

    .line 134
    .line 135
    iget-object v6, v6, La/sff0;->N:La/co4;

    .line 136
    .line 137
    iget-object v6, v6, La/co4;->r:Ljava/util/List;

    .line 138
    .line 139
    iput-boolean v4, v0, La/q5f0;->j:Z

    .line 140
    .line 141
    invoke-virtual {v2, v0, v6, v3}, La/jru;->d(La/zje;Ljava/util/List;Z)Ljava/io/Serializable;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-ne v0, v1, :cond_3

    .line 146
    .line 147
    move-object v2, v1

    .line 148
    goto :goto_3

    .line 149
    :cond_3
    :goto_1
    move-object/from16 v17, v0

    .line 150
    .line 151
    check-cast v17, Ljava/util/List;

    .line 152
    .line 153
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, La/u4f0;

    .line 158
    .line 159
    iget-object v0, v0, La/u4f0;->j:La/q7f0;

    .line 160
    .line 161
    if-nez v0, :cond_4

    .line 162
    .line 163
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, La/q7f0;

    .line 168
    .line 169
    :cond_4
    move-object/from16 v16, v0

    .line 170
    .line 171
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 172
    .line 173
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 174
    .line 175
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-object v6, v0

    .line 183
    check-cast v6, La/u4f0;

    .line 184
    .line 185
    const/16 v28, 0x0

    .line 186
    .line 187
    const v29, 0x3fffebff    # 1.9993895f

    .line 188
    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v10, 0x0

    .line 194
    const/4 v11, 0x0

    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    const/4 v15, 0x0

    .line 199
    const/16 v18, 0x0

    .line 200
    .line 201
    const/16 v19, 0x0

    .line 202
    .line 203
    const/16 v20, 0x0

    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const/16 v22, 0x0

    .line 208
    .line 209
    const/16 v23, 0x0

    .line 210
    .line 211
    const/16 v24, 0x0

    .line 212
    .line 213
    const/16 v25, 0x0

    .line 214
    .line 215
    const/16 v26, 0x0

    .line 216
    .line 217
    const/16 v27, 0x0

    .line 218
    .line 219
    invoke-static/range {v6 .. v29}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    move-object/from16 v6, v16

    .line 224
    .line 225
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_5

    .line 230
    .line 231
    iget-object v0, v5, La/x5f0;->x0:La/p7m0;

    .line 232
    .line 233
    invoke-virtual {v0, v6}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_3
    return-object v2

    .line 239
    :cond_5
    move-object/from16 v16, v6

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 243
    .line 244
    iget-boolean v6, v0, La/q5f0;->j:Z

    .line 245
    .line 246
    if-eqz v6, :cond_7

    .line 247
    .line 248
    if-ne v6, v4, :cond_6

    .line 249
    .line 250
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v0, p1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object v2, v5, La/x5f0;->r:La/b8u;

    .line 264
    .line 265
    iput-boolean v4, v0, La/q5f0;->j:Z

    .line 266
    .line 267
    iget-object v2, v2, La/b8u;->a:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v2, La/t090;

    .line 270
    .line 271
    invoke-virtual {v2, v0}, La/t090;->a(La/zje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-ne v0, v1, :cond_8

    .line 276
    .line 277
    move-object v2, v1

    .line 278
    goto :goto_5

    .line 279
    :cond_8
    :goto_4
    move-object v9, v0

    .line 280
    check-cast v9, Ljava/util/List;

    .line 281
    .line 282
    sget v0, La/x5f0;->z0:I

    .line 283
    .line 284
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 285
    .line 286
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 287
    .line 288
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-object v6, v1

    .line 296
    check-cast v6, La/u4f0;

    .line 297
    .line 298
    const/16 v28, 0x0

    .line 299
    .line 300
    const v29, 0x3ffffffb    # 1.9999994f

    .line 301
    .line 302
    .line 303
    const/4 v7, 0x0

    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v10, 0x0

    .line 306
    const/4 v11, 0x0

    .line 307
    const/4 v12, 0x0

    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const/16 v19, 0x0

    .line 318
    .line 319
    const/16 v20, 0x0

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const/16 v23, 0x0

    .line 326
    .line 327
    const/16 v24, 0x0

    .line 328
    .line 329
    const/16 v25, 0x0

    .line 330
    .line 331
    const/16 v26, 0x0

    .line 332
    .line 333
    const/16 v27, 0x0

    .line 334
    .line 335
    invoke-static/range {v6 .. v29}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_9

    .line 344
    .line 345
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    :goto_5
    return-object v2

    .line 348
    nop

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
