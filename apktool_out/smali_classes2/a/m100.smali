.class public final La/m100;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/p100;


# direct methods
.method public synthetic constructor <init>(La/p100;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m100;->i:B

    iput-object p1, p0, La/m100;->k:La/p100;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/m100;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/m100;->k:La/p100;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/m100;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/m100;-><init>(La/p100;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/m100;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/m100;-><init>(La/p100;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/m100;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/m100;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/m100;-><init>(La/p100;La/yje;B)V

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
    iget-byte v0, p0, La/m100;->i:B

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
    invoke-virtual {p0, p1, p2}, La/m100;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/m100;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/m100;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/m100;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/m100;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/m100;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/m100;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/m100;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/m100;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/m100;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v7, v6, La/m100;->k:La/p100;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v4, v6, La/m100;->j:Z

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    if-ne v4, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget v1, La/p100;->A:I

    .line 37
    .line 38
    iget-object v1, v7, La/i3t0;->i:La/ocj;

    .line 39
    .line 40
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 41
    .line 42
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-object v8, v2

    .line 50
    check-cast v8, La/e100;

    .line 51
    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    const/16 v17, 0xfe7

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x1

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    invoke-static/range {v8 .. v17}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    iput-boolean v3, v6, La/m100;->j:Z

    .line 74
    .line 75
    invoke-virtual {v7, v6}, La/p100;->M(La/zje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, v0, :cond_3

    .line 80
    .line 81
    move-object v1, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    iget-object v0, v7, La/p100;->r:La/i1w0;

    .line 92
    .line 93
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v2, Lorg/xplatform/limits_ne/impl/presentation/LimitsNeScreens$ChoiceNewLimitNeFragmentScreen;

    .line 98
    .line 99
    sget-object v3, La/g8i0;->a:La/g8i0;

    .line 100
    .line 101
    const/16 v3, 0x1e

    .line 102
    .line 103
    invoke-direct {v2, v3}, Lorg/xplatform/limits_ne/impl/presentation/LimitsNeScreens$ChoiceNewLimitNeFragmentScreen;-><init>(I)V

    .line 104
    .line 105
    .line 106
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 107
    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    new-instance v3, La/e1w0;

    .line 111
    .line 112
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 113
    .line 114
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 115
    .line 116
    .line 117
    new-instance v2, La/c8d;

    .line 118
    .line 119
    sget-object v4, La/y7d;->a:La/v7d;

    .line 120
    .line 121
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    new-instance v3, La/w0w0;

    .line 129
    .line 130
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 131
    .line 132
    .line 133
    new-instance v2, La/c8d;

    .line 134
    .line 135
    sget-object v4, La/y7d;->a:La/v7d;

    .line 136
    .line 137
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :goto_1
    const/4 v2, 0x0

    .line 144
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :goto_2
    move-object v2, v1

    .line 149
    check-cast v2, La/paw;

    .line 150
    .line 151
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, La/oe50;

    .line 162
    .line 163
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    :goto_3
    return-object v1

    .line 170
    :pswitch_0
    iget-boolean v0, v6, La/m100;->j:Z

    .line 171
    .line 172
    sget-object v1, La/wne;->a:La/wne;

    .line 173
    .line 174
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    sget v0, La/p100;->A:I

    .line 180
    .line 181
    invoke-virtual {v7}, La/p100;->N()V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_6
    sget v0, La/p100;->A:I

    .line 186
    .line 187
    iget-object v0, v7, La/i3t0;->i:La/ocj;

    .line 188
    .line 189
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 190
    .line 191
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-object v2, v1

    .line 199
    check-cast v2, La/e100;

    .line 200
    .line 201
    const/4 v10, 0x0

    .line 202
    const/16 v11, 0xfef

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    const/4 v4, 0x0

    .line 206
    const/4 v5, 0x0

    .line 207
    const/4 v6, 0x0

    .line 208
    const/4 v7, 0x1

    .line 209
    const/4 v8, 0x0

    .line 210
    const/4 v9, 0x0

    .line 211
    invoke-static/range {v2 .. v11}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_7

    .line 220
    .line 221
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_1
    iget-object v8, v7, La/i3t0;->i:La/ocj;

    .line 225
    .line 226
    sget-object v9, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget-boolean v0, v6, La/m100;->j:Z

    .line 229
    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    if-ne v0, v3, :cond_8

    .line 233
    .line 234
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object/from16 v0, p1

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_7

    .line 244
    .line 245
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    sget v0, La/p100;->A:I

    .line 249
    .line 250
    iget-object v0, v8, La/ocj;->a:La/p7m0;

    .line 251
    .line 252
    :goto_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-object v10, v1

    .line 260
    check-cast v10, La/e100;

    .line 261
    .line 262
    const/16 v18, 0x0

    .line 263
    .line 264
    const/16 v19, 0xff7

    .line 265
    .line 266
    const/4 v11, 0x0

    .line 267
    const/4 v12, 0x0

    .line 268
    const/4 v13, 0x0

    .line 269
    const/4 v14, 0x1

    .line 270
    const/4 v15, 0x0

    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    invoke-static/range {v10 .. v19}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_c

    .line 284
    .line 285
    iget-object v0, v7, La/p100;->o:La/biu;

    .line 286
    .line 287
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, La/e100;

    .line 292
    .line 293
    iget-boolean v2, v1, La/e100;->f:Z

    .line 294
    .line 295
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    check-cast v1, La/e100;

    .line 300
    .line 301
    iget-boolean v1, v1, La/e100;->g:Z

    .line 302
    .line 303
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    check-cast v4, La/e100;

    .line 308
    .line 309
    iget-boolean v4, v4, La/e100;->h:Z

    .line 310
    .line 311
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    check-cast v5, La/e100;

    .line 316
    .line 317
    iget-boolean v5, v5, La/e100;->i:Z

    .line 318
    .line 319
    iput-boolean v3, v6, La/m100;->j:Z

    .line 320
    .line 321
    move v3, v1

    .line 322
    const/4 v1, 0x1

    .line 323
    invoke-virtual/range {v0 .. v6}, La/biu;->a(ZZZZZLa/zje;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    if-ne v0, v9, :cond_a

    .line 328
    .line 329
    move-object v1, v9

    .line 330
    goto :goto_7

    .line 331
    :cond_a
    :goto_6
    move-object v1, v0

    .line 332
    check-cast v1, La/jzz;

    .line 333
    .line 334
    iget-object v0, v7, La/p100;->u:La/rot;

    .line 335
    .line 336
    iget-object v0, v0, La/rot;->a:La/r200;

    .line 337
    .line 338
    iget-object v0, v0, La/r200;->b:La/ieu;

    .line 339
    .line 340
    iget-object v0, v0, La/ieu;->b:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 343
    .line 344
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 345
    .line 346
    .line 347
    move-result-object v16

    .line 348
    iget-object v2, v8, La/ocj;->a:La/p7m0;

    .line 349
    .line 350
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move-object v9, v0

    .line 358
    check-cast v9, La/e100;

    .line 359
    .line 360
    iget-object v10, v1, La/jzz;->a:Ljava/util/LinkedHashMap;

    .line 361
    .line 362
    iget-object v11, v1, La/jzz;->b:Ljava/util/LinkedHashMap;

    .line 363
    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const/16 v18, 0xbe4

    .line 367
    .line 368
    const/4 v12, 0x0

    .line 369
    const/4 v13, 0x0

    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    invoke-static/range {v9 .. v18}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_b

    .line 381
    .line 382
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    :goto_7
    return-object v1

    .line 385
    :cond_c
    move-object/from16 v6, p0

    .line 386
    .line 387
    goto/16 :goto_5

    .line 388
    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
