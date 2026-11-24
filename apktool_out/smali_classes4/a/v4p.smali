.class public final La/v4p;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:Lorg/xplatform/favorites/impl/presentation/category/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v4p;->i:B

    iput-object p1, p0, La/v4p;->k:Lorg/xplatform/favorites/impl/presentation/category/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v4p;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/v4p;->k:Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/v4p;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/v4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/v4p;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/v4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v4p;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/v4p;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/v4p;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/v4p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/v4p;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/v4p;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/v4p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/v4p;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/v4p;->k:Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->E:La/n0o0;

    .line 16
    .line 17
    iget-object v7, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->v:Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 18
    .line 19
    sget-object v8, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, v0, La/v4p;->j:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v6, :cond_1

    .line 26
    .line 27
    if-ne v9, v4, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_7

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v2, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->u:La/j3c;

    .line 49
    .line 50
    iput-byte v6, v0, La/v4p;->j:B

    .line 51
    .line 52
    invoke-virtual {v2, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-ne v2, v8, :cond_3

    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_3
    :goto_0
    move-object v14, v2

    .line 61
    check-cast v14, La/wcb;

    .line 62
    .line 63
    iget-object v2, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->s:La/luu;

    .line 64
    .line 65
    iget-object v2, v2, La/luu;->a:La/nok0;

    .line 66
    .line 67
    invoke-virtual {v2}, La/nok0;->a()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    iget-boolean v2, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->K:Z

    .line 72
    .line 73
    invoke-virtual {v7}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;->b()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    check-cast v9, La/sff0;

    .line 82
    .line 83
    iget-boolean v9, v9, La/sff0;->J:Z

    .line 84
    .line 85
    iget-object v11, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->C:La/svu;

    .line 86
    .line 87
    invoke-virtual {v11}, La/svu;->l()Z

    .line 88
    .line 89
    .line 90
    move-result v21

    .line 91
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, La/sff0;

    .line 96
    .line 97
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 98
    .line 99
    iget-object v1, v1, La/mum0;->y:La/v5l0;

    .line 100
    .line 101
    invoke-static {v7}, Lorg/xplatform/favorites/impl/presentation/category/b;->a(Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)La/d5p;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_5

    .line 110
    .line 111
    if-ne v11, v6, :cond_4

    .line 112
    .line 113
    new-instance v11, La/aq2;

    .line 114
    .line 115
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_7

    .line 123
    .line 124
    :cond_5
    new-instance v11, La/cq2;

    .line 125
    .line 126
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    :goto_1
    invoke-static {v7}, Lorg/xplatform/favorites/impl/presentation/category/b;->a(Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)La/d5p;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_7

    .line 138
    .line 139
    if-ne v7, v6, :cond_6

    .line 140
    .line 141
    const-string v5, "favorite_championship"

    .line 142
    .line 143
    :goto_2
    move-object v7, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 146
    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_7
    const-string v5, "favorite_team"

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :goto_3
    iget-object v5, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->D:La/r9u;

    .line 153
    .line 154
    sget-object v6, La/ygp;->t:La/ygp;

    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v5, v5, La/r9u;->a:La/j1q0;

    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v5, v5, La/j1q0;->a:La/m1q0;

    .line 165
    .line 166
    invoke-virtual {v5, v6}, La/m1q0;->d(La/ygp;)Z

    .line 167
    .line 168
    .line 169
    move-result v22

    .line 170
    iget-object v5, v3, La/i3t0;->i:La/ocj;

    .line 171
    .line 172
    iget-object v5, v5, La/ocj;->a:La/p7m0;

    .line 173
    .line 174
    :goto_4
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move/from16 v18, v9

    .line 182
    .line 183
    move-object v9, v6

    .line 184
    check-cast v9, La/x4p;

    .line 185
    .line 186
    const/16 v19, 0x0

    .line 187
    .line 188
    const/16 v23, 0x52e

    .line 189
    .line 190
    move-object v12, v11

    .line 191
    const/4 v11, 0x0

    .line 192
    move-object v13, v12

    .line 193
    const/4 v12, 0x0

    .line 194
    move-object/from16 v16, v13

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    move-object/from16 v20, v1

    .line 200
    .line 201
    move-object/from16 v1, v16

    .line 202
    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    invoke-static/range {v9 .. v23}, La/x4p;->a(La/x4p;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;Ljava/util/List;ZZZZLa/v5l0;ZZI)La/x4p;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v5, v6, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_9

    .line 214
    .line 215
    iget-object v2, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->q:La/hjd;

    .line 216
    .line 217
    new-instance v3, La/cid;

    .line 218
    .line 219
    invoke-direct {v3, v7, v1}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 220
    .line 221
    .line 222
    iput-byte v4, v0, La/v4p;->j:B

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v3, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-ne v0, v8, :cond_8

    .line 232
    .line 233
    :goto_5
    move-object v5, v8

    .line 234
    goto :goto_7

    .line 235
    :cond_8
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    :goto_7
    return-object v5

    .line 238
    :cond_9
    move-object v11, v1

    .line 239
    move/from16 v2, v16

    .line 240
    .line 241
    move/from16 v9, v18

    .line 242
    .line 243
    move-object/from16 v1, v20

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :pswitch_0
    iget-object v1, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->v:Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 247
    .line 248
    sget-object v7, La/wne;->a:La/wne;

    .line 249
    .line 250
    iget-byte v8, v0, La/v4p;->j:B

    .line 251
    .line 252
    if-eqz v8, :cond_c

    .line 253
    .line 254
    if-eq v8, v6, :cond_b

    .line 255
    .line 256
    if-ne v8, v4, :cond_a

    .line 257
    .line 258
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move-object/from16 v1, p1

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    iget-object v2, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->p:La/a6u;

    .line 276
    .line 277
    invoke-virtual {v1}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;->a()J

    .line 278
    .line 279
    .line 280
    move-result-wide v8

    .line 281
    invoke-static {v1}, Lorg/xplatform/favorites/impl/presentation/category/b;->a(Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)La/d5p;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    iput-byte v6, v0, La/v4p;->j:B

    .line 286
    .line 287
    invoke-virtual {v2, v8, v9, v1, v0}, La/a6u;->A(JLa/d5p;La/zje;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-ne v1, v7, :cond_d

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_d
    :goto_8
    check-cast v1, La/gmq;

    .line 295
    .line 296
    new-instance v2, La/a1g;

    .line 297
    .line 298
    const/16 v8, 0xd

    .line 299
    .line 300
    invoke-direct {v2, v1, v3, v8}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 301
    .line 302
    .line 303
    iget-object v1, v3, Lorg/xplatform/favorites/impl/presentation/category/a;->F:La/qz40;

    .line 304
    .line 305
    const-wide/16 v8, 0x1f4

    .line 306
    .line 307
    invoke-static {v1, v8, v9}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    new-instance v8, La/wx4;

    .line 312
    .line 313
    const/4 v9, 0x6

    .line 314
    invoke-direct {v8, v3, v5, v9}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 315
    .line 316
    .line 317
    new-instance v9, La/p6d;

    .line 318
    .line 319
    invoke-direct {v9, v2, v1, v8, v6}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 320
    .line 321
    .line 322
    new-instance v1, La/s4p;

    .line 323
    .line 324
    const/4 v2, 0x0

    .line 325
    invoke-direct {v1, v3, v5, v2}, La/s4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V

    .line 326
    .line 327
    .line 328
    new-instance v2, La/dnq;

    .line 329
    .line 330
    invoke-direct {v2, v9, v1, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 331
    .line 332
    .line 333
    new-instance v1, La/l4p;

    .line 334
    .line 335
    invoke-direct {v1, v3, v6}, La/l4p;-><init>(Ljava/lang/Object;B)V

    .line 336
    .line 337
    .line 338
    iput-byte v4, v0, La/v4p;->j:B

    .line 339
    .line 340
    invoke-virtual {v2, v1, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-ne v0, v7, :cond_e

    .line 345
    .line 346
    :goto_9
    move-object v5, v7

    .line 347
    goto :goto_b

    .line 348
    :cond_e
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    :goto_b
    return-object v5

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
