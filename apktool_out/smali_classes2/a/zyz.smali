.class public final La/zyz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/bzz;


# direct methods
.method public synthetic constructor <init>(La/bzz;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zyz;->i:B

    iput-object p1, p0, La/zyz;->k:La/bzz;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zyz;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zyz;->k:La/bzz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/zyz;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/zyz;-><init>(La/bzz;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/zyz;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/zyz;-><init>(La/bzz;La/yje;B)V

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
    iput-boolean p0, v0, La/zyz;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/zyz;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/zyz;-><init>(La/bzz;La/yje;B)V

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
    iget-byte v0, p0, La/zyz;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zyz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zyz;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zyz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/zyz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/zyz;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/zyz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/zyz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/zyz;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/zyz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/zyz;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v4, v5, La/zyz;->k:La/bzz;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v5, La/zyz;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

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
    sget v1, La/bzz;->w:I

    .line 37
    .line 38
    iget-object v1, v4, La/i3t0;->i:La/ocj;

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
    move-object v6, v2

    .line 50
    check-cast v6, La/ryz;

    .line 51
    .line 52
    const/4 v13, 0x0

    .line 53
    const/16 v14, 0x7e7

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x1

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v12, 0x0

    .line 61
    invoke-static/range {v6 .. v14}, La/ryz;->a(La/ryz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/rn40;Ljava/lang/String;I)La/ryz;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v1, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    iput-boolean v3, v5, La/zyz;->j:Z

    .line 72
    .line 73
    invoke-virtual {v4, v5}, La/bzz;->M(La/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-ne v1, v0, :cond_3

    .line 78
    .line 79
    move-object v1, v0

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object v0, v4, La/bzz;->q:La/i1w0;

    .line 90
    .line 91
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, Lorg/xplatform/limits_kenya/impl/presentation/LimitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 101
    .line 102
    if-eqz v3, :cond_4

    .line 103
    .line 104
    new-instance v3, La/e1w0;

    .line 105
    .line 106
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 107
    .line 108
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 109
    .line 110
    .line 111
    new-instance v2, La/c8d;

    .line 112
    .line 113
    sget-object v4, La/y7d;->a:La/v7d;

    .line 114
    .line 115
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    new-instance v3, La/w0w0;

    .line 123
    .line 124
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 125
    .line 126
    .line 127
    new-instance v2, La/c8d;

    .line 128
    .line 129
    sget-object v4, La/y7d;->a:La/v7d;

    .line 130
    .line 131
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :goto_1
    const/4 v2, 0x0

    .line 138
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :goto_2
    move-object v2, v1

    .line 143
    check-cast v2, La/paw;

    .line 144
    .line 145
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_5

    .line 150
    .line 151
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, La/oe50;

    .line 156
    .line 157
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    :goto_3
    return-object v1

    .line 164
    :pswitch_0
    iget-boolean v0, v5, La/zyz;->j:Z

    .line 165
    .line 166
    sget-object v1, La/wne;->a:La/wne;

    .line 167
    .line 168
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    if-eqz v0, :cond_6

    .line 172
    .line 173
    sget v0, La/bzz;->w:I

    .line 174
    .line 175
    invoke-virtual {v4}, La/bzz;->N()V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_6
    sget v0, La/bzz;->w:I

    .line 180
    .line 181
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 182
    .line 183
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 184
    .line 185
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-object v2, v1

    .line 193
    check-cast v2, La/ryz;

    .line 194
    .line 195
    const/4 v9, 0x0

    .line 196
    const/16 v10, 0x7ef

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    const/4 v5, 0x0

    .line 201
    const/4 v6, 0x0

    .line 202
    const/4 v7, 0x1

    .line 203
    const/4 v8, 0x0

    .line 204
    invoke-static/range {v2 .. v10}, La/ryz;->a(La/ryz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/rn40;Ljava/lang/String;I)La/ryz;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_7

    .line 213
    .line 214
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_1
    iget-object v6, v4, La/i3t0;->i:La/ocj;

    .line 218
    .line 219
    sget-object v7, La/wne;->a:La/wne;

    .line 220
    .line 221
    iget-boolean v0, v5, La/zyz;->j:Z

    .line 222
    .line 223
    if-eqz v0, :cond_9

    .line 224
    .line 225
    if-ne v0, v3, :cond_8

    .line 226
    .line 227
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    move-object/from16 v0, p1

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    sget v0, La/bzz;->w:I

    .line 241
    .line 242
    iget-object v0, v6, La/ocj;->a:La/p7m0;

    .line 243
    .line 244
    :goto_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-object v8, v1

    .line 252
    check-cast v8, La/ryz;

    .line 253
    .line 254
    const/4 v15, 0x0

    .line 255
    const/16 v16, 0x7f7

    .line 256
    .line 257
    const/4 v9, 0x0

    .line 258
    const/4 v10, 0x0

    .line 259
    const/4 v11, 0x0

    .line 260
    const/4 v12, 0x1

    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    invoke-static/range {v8 .. v16}, La/ryz;->a(La/ryz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/rn40;Ljava/lang/String;I)La/ryz;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_c

    .line 272
    .line 273
    iget-object v0, v4, La/bzz;->o:La/aiu;

    .line 274
    .line 275
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, La/ryz;

    .line 280
    .line 281
    iget-boolean v2, v1, La/ryz;->f:Z

    .line 282
    .line 283
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, La/ryz;

    .line 288
    .line 289
    iget-boolean v1, v1, La/ryz;->g:Z

    .line 290
    .line 291
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, La/ryz;

    .line 296
    .line 297
    iget-boolean v4, v4, La/ryz;->h:Z

    .line 298
    .line 299
    iput-boolean v3, v5, La/zyz;->j:Z

    .line 300
    .line 301
    move v3, v1

    .line 302
    const/4 v1, 0x1

    .line 303
    invoke-virtual/range {v0 .. v5}, La/aiu;->a(ZZZZLa/zje;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-ne v0, v7, :cond_a

    .line 308
    .line 309
    move-object v1, v7

    .line 310
    goto :goto_7

    .line 311
    :cond_a
    :goto_6
    move-object v1, v0

    .line 312
    check-cast v1, La/izz;

    .line 313
    .line 314
    sget v0, La/bzz;->w:I

    .line 315
    .line 316
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 317
    .line 318
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-object v3, v0

    .line 326
    check-cast v3, La/ryz;

    .line 327
    .line 328
    iget-object v4, v1, La/izz;->a:Ljava/util/LinkedHashMap;

    .line 329
    .line 330
    iget-object v5, v1, La/izz;->b:Ljava/util/LinkedHashMap;

    .line 331
    .line 332
    const/4 v10, 0x0

    .line 333
    const/16 v11, 0x7ec

    .line 334
    .line 335
    const/4 v6, 0x0

    .line 336
    const/4 v7, 0x0

    .line 337
    const/4 v8, 0x0

    .line 338
    const/4 v9, 0x0

    .line 339
    invoke-static/range {v3 .. v11}, La/ryz;->a(La/ryz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/rn40;Ljava/lang/String;I)La/ryz;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_b

    .line 348
    .line 349
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    :goto_7
    return-object v1

    .line 352
    :cond_c
    move-object/from16 v5, p0

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
