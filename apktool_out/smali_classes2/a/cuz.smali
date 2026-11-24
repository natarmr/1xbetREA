.class public final La/cuz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/euz;


# direct methods
.method public synthetic constructor <init>(La/euz;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cuz;->i:B

    iput-object p1, p0, La/cuz;->k:La/euz;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cuz;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cuz;->k:La/euz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/cuz;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/cuz;-><init>(La/euz;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/cuz;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/cuz;-><init>(La/euz;La/yje;B)V

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
    iput-boolean p0, v0, La/cuz;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/cuz;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/cuz;-><init>(La/euz;La/yje;B)V

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
    iget-byte v0, p0, La/cuz;->i:B

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
    invoke-virtual {p0, p1, p2}, La/cuz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cuz;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cuz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cuz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/cuz;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/cuz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cuz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/cuz;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/cuz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cuz;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/cuz;->k:La/euz;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/cuz;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    sget v2, La/euz;->w:I

    .line 37
    .line 38
    iget-object v2, v5, La/i3t0;->i:La/ocj;

    .line 39
    .line 40
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 41
    .line 42
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-object v6, v3

    .line 50
    check-cast v6, La/ttz;

    .line 51
    .line 52
    const/4 v14, 0x0

    .line 53
    const/16 v15, 0x7e7

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
    const/4 v13, 0x0

    .line 62
    invoke-static/range {v6 .. v15}, La/ttz;->a(La/ttz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZZLa/tn40;Ljava/lang/String;I)La/ttz;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    iput-boolean v4, v0, La/cuz;->j:Z

    .line 73
    .line 74
    invoke-virtual {v5, v0}, La/euz;->M(La/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    move-object v2, v1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    iget-object v0, v5, La/euz;->q:La/i1w0;

    .line 91
    .line 92
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, Lorg/xplatform/limits_africa/impl/presentation/LimitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen;

    .line 97
    .line 98
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 102
    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    new-instance v3, La/e1w0;

    .line 106
    .line 107
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 108
    .line 109
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/c8d;

    .line 113
    .line 114
    sget-object v4, La/y7d;->a:La/v7d;

    .line 115
    .line 116
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    new-instance v3, La/w0w0;

    .line 124
    .line 125
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 126
    .line 127
    .line 128
    new-instance v2, La/c8d;

    .line 129
    .line 130
    sget-object v4, La/y7d;->a:La/v7d;

    .line 131
    .line 132
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :goto_1
    const/4 v2, 0x0

    .line 139
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :goto_2
    move-object v2, v1

    .line 144
    check-cast v2, La/paw;

    .line 145
    .line 146
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_5

    .line 151
    .line 152
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, La/oe50;

    .line 157
    .line 158
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_3
    return-object v2

    .line 165
    :pswitch_0
    iget-boolean v0, v0, La/cuz;->j:Z

    .line 166
    .line 167
    sget-object v1, La/wne;->a:La/wne;

    .line 168
    .line 169
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    sget v0, La/euz;->w:I

    .line 175
    .line 176
    invoke-virtual {v5}, La/euz;->N()V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_6
    sget v0, La/euz;->w:I

    .line 181
    .line 182
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 183
    .line 184
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-object v2, v0

    .line 194
    check-cast v2, La/ttz;

    .line 195
    .line 196
    const/4 v10, 0x0

    .line 197
    const/16 v11, 0x7ef

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    const/4 v4, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    const/4 v6, 0x0

    .line 203
    const/4 v7, 0x1

    .line 204
    const/4 v8, 0x0

    .line 205
    const/4 v9, 0x0

    .line 206
    invoke-static/range {v2 .. v11}, La/ttz;->a(La/ttz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZZLa/tn40;Ljava/lang/String;I)La/ttz;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_7

    .line 215
    .line 216
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_1
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 220
    .line 221
    sget-object v6, La/wne;->a:La/wne;

    .line 222
    .line 223
    iget-boolean v7, v0, La/cuz;->j:Z

    .line 224
    .line 225
    if-eqz v7, :cond_9

    .line 226
    .line 227
    if-ne v7, v4, :cond_8

    .line 228
    .line 229
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    move-object/from16 v0, p1

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget v2, La/euz;->w:I

    .line 243
    .line 244
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 245
    .line 246
    :cond_a
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-object v7, v3

    .line 254
    check-cast v7, La/ttz;

    .line 255
    .line 256
    const/4 v15, 0x0

    .line 257
    const/16 v16, 0x7f7

    .line 258
    .line 259
    const/4 v8, 0x0

    .line 260
    const/4 v9, 0x0

    .line 261
    const/4 v10, 0x0

    .line 262
    const/4 v11, 0x1

    .line 263
    const/4 v12, 0x0

    .line 264
    const/4 v13, 0x0

    .line 265
    const/4 v14, 0x0

    .line 266
    invoke-static/range {v7 .. v16}, La/ttz;->a(La/ttz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZZLa/tn40;Ljava/lang/String;I)La/ttz;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-virtual {v2, v3, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_a

    .line 275
    .line 276
    iget-object v2, v5, La/euz;->o:La/diu;

    .line 277
    .line 278
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, La/ttz;

    .line 283
    .line 284
    iget-boolean v3, v3, La/ttz;->f:Z

    .line 285
    .line 286
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    check-cast v7, La/ttz;

    .line 291
    .line 292
    iget-boolean v7, v7, La/ttz;->g:Z

    .line 293
    .line 294
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    check-cast v5, La/ttz;

    .line 299
    .line 300
    iget-boolean v5, v5, La/ttz;->h:Z

    .line 301
    .line 302
    iput-boolean v4, v0, La/cuz;->j:Z

    .line 303
    .line 304
    invoke-virtual {v2, v3, v7, v5, v0}, La/diu;->a(ZZZLa/zje;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-ne v0, v6, :cond_b

    .line 309
    .line 310
    move-object v2, v6

    .line 311
    goto :goto_6

    .line 312
    :cond_b
    :goto_5
    move-object v3, v0

    .line 313
    check-cast v3, La/gzz;

    .line 314
    .line 315
    sget v0, La/euz;->w:I

    .line 316
    .line 317
    iget-object v7, v1, La/ocj;->a:La/p7m0;

    .line 318
    .line 319
    :cond_c
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-object v8, v0

    .line 327
    check-cast v8, La/ttz;

    .line 328
    .line 329
    iget-object v9, v3, La/gzz;->a:Ljava/util/LinkedHashMap;

    .line 330
    .line 331
    iget-object v10, v3, La/gzz;->b:Ljava/util/LinkedHashMap;

    .line 332
    .line 333
    const/16 v16, 0x0

    .line 334
    .line 335
    const/16 v17, 0x7ec

    .line 336
    .line 337
    const/4 v11, 0x0

    .line 338
    const/4 v12, 0x0

    .line 339
    const/4 v13, 0x0

    .line 340
    const/4 v14, 0x0

    .line 341
    const/4 v15, 0x0

    .line 342
    invoke-static/range {v8 .. v17}, La/ttz;->a(La/ttz;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZZLa/tn40;Ljava/lang/String;I)La/ttz;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v7, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_c

    .line 351
    .line 352
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    :goto_6
    return-object v2

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
