.class public final La/orc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qrc0;


# direct methods
.method public synthetic constructor <init>(La/qrc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/orc0;->i:B

    iput-object p1, p0, La/orc0;->k:La/qrc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/orc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/orc0;->k:La/qrc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/orc0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/orc0;-><init>(La/qrc0;La/yje;B)V

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
    iput-boolean p0, v0, La/orc0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/orc0;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/orc0;-><init>(La/qrc0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/orc0;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/orc0;-><init>(La/qrc0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/orc0;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/orc0;-><init>(La/qrc0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/orc0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/orc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/orc0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/orc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/orc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/orc0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/orc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/orc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/orc0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/orc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/orc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/orc0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/orc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/orc0;->i:B

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v7, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v8, v5, La/orc0;->k:La/qrc0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-boolean v0, v5, La/orc0;->j:Z

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/zqc0;

    .line 27
    .line 28
    iget-boolean v1, v1, La/zqc0;->a:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/zqc0;

    .line 37
    .line 38
    iget-boolean v1, v1, La/zqc0;->b:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    :cond_0
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v8}, La/qrc0;->M()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, La/qrc0;->N()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/zqc0;

    .line 58
    .line 59
    iget-boolean v0, v0, La/zqc0;->a:Z

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 64
    .line 65
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-object v2, v1

    .line 75
    check-cast v2, La/zqc0;

    .line 76
    .line 77
    const/4 v15, 0x0

    .line 78
    const v16, 0xfffc

    .line 79
    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v4, 0x1

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    const-wide/16 v10, 0x0

    .line 89
    .line 90
    const-wide/16 v12, 0x0

    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    invoke-static/range {v2 .. v16}, La/zqc0;->a(La/zqc0;ZZLjava/util/List;Ljava/lang/String;IIIJDLa/esr;ZI)La/zqc0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    :cond_3
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 107
    .line 108
    iget-boolean v3, v5, La/orc0;->j:Z

    .line 109
    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    if-ne v3, v7, :cond_4

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v1, p1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v8, La/qrc0;->D:La/b4j;

    .line 129
    .line 130
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, La/zqc0;

    .line 135
    .line 136
    iget-wide v3, v3, La/zqc0;->m:J

    .line 137
    .line 138
    const-string v9, "bonus_game_buy_popup"

    .line 139
    .line 140
    invoke-virtual {v1, v3, v4, v9}, La/b4j;->l(JLjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v1, v8, La/qrc0;->C:La/x20;

    .line 144
    .line 145
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, La/zqc0;

    .line 150
    .line 151
    iget-wide v3, v3, La/zqc0;->m:J

    .line 152
    .line 153
    invoke-virtual {v1, v3, v4, v9}, La/x20;->s(JLjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v8, La/qrc0;->w:La/dcu;

    .line 157
    .line 158
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, La/zqc0;

    .line 163
    .line 164
    iget-wide v3, v3, La/zqc0;->m:J

    .line 165
    .line 166
    iput-boolean v7, v5, La/orc0;->j:Z

    .line 167
    .line 168
    invoke-virtual {v1, v3, v4, v5}, La/dcu;->a(JLa/zje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    if-ne v1, v0, :cond_6

    .line 173
    .line 174
    move-object v2, v0

    .line 175
    goto/16 :goto_4

    .line 176
    .line 177
    :cond_6
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    sget-object v0, La/a570;->Companion:La/t470;

    .line 184
    .line 185
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, La/zqc0;

    .line 190
    .line 191
    iget-wide v3, v1, La/zqc0;->m:J

    .line 192
    .line 193
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    check-cast v1, La/zqc0;

    .line 198
    .line 199
    iget-boolean v1, v1, La/zqc0;->p:Z

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {v1, v3, v4}, La/t470;->a(ZJ)La/a570;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, La/zqc0;

    .line 213
    .line 214
    iget-object v0, v0, La/zqc0;->e:La/vrc0;

    .line 215
    .line 216
    invoke-interface {v0}, La/vrc0;->getType()La/xg8;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sget-object v1, La/xg8;->e:La/xg8;

    .line 221
    .line 222
    if-ne v0, v1, :cond_8

    .line 223
    .line 224
    iget-object v0, v8, La/qrc0;->A:La/uf3;

    .line 225
    .line 226
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, La/zqc0;

    .line 231
    .line 232
    iget-wide v10, v1, La/zqc0;->m:J

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object v0, v0, La/uf3;->e:La/fvt0;

    .line 238
    .line 239
    iget-object v0, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, La/esg0;

    .line 242
    .line 243
    invoke-virtual {v0}, La/esg0;->S()La/bbw0;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    const-string v13, ""

    .line 248
    .line 249
    invoke-virtual/range {v9 .. v14}, La/bbw0;->f(JLa/a570;Ljava/lang/String;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iget-object v1, v8, La/qrc0;->z:La/oeg0;

    .line 254
    .line 255
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 264
    .line 265
    if-eqz v3, :cond_7

    .line 266
    .line 267
    new-instance v3, La/e1w0;

    .line 268
    .line 269
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 270
    .line 271
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 272
    .line 273
    .line 274
    new-instance v0, La/c8d;

    .line 275
    .line 276
    sget-object v4, La/y7d;->a:La/v7d;

    .line 277
    .line 278
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_7
    new-instance v3, La/w0w0;

    .line 286
    .line 287
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 288
    .line 289
    .line 290
    new-instance v0, La/c8d;

    .line 291
    .line 292
    sget-object v4, La/y7d;->a:La/v7d;

    .line 293
    .line 294
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :goto_2
    invoke-static {v1, v2, v6}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    :goto_3
    move-object v2, v0

    .line 305
    check-cast v2, La/paw;

    .line 306
    .line 307
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_9

    .line 312
    .line 313
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, La/oe50;

    .line 318
    .line 319
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_8
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 324
    .line 325
    .line 326
    move-result-object v15

    .line 327
    iget-object v0, v8, La/qrc0;->y:La/mne;

    .line 328
    .line 329
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 330
    .line 331
    new-instance v1, La/lrc0;

    .line 332
    .line 333
    invoke-direct {v1, v8, v12, v14, v6}, La/lrc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 334
    .line 335
    .line 336
    new-instance v3, La/o690;

    .line 337
    .line 338
    invoke-direct {v3, v8, v12, v14, v2}, La/o690;-><init>(La/qrc0;La/a570;ZLa/yje;)V

    .line 339
    .line 340
    .line 341
    const/16 v20, 0xa

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    move-object/from16 v18, v0

    .line 346
    .line 347
    move-object/from16 v16, v1

    .line 348
    .line 349
    move-object/from16 v19, v3

    .line 350
    .line 351
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 352
    .line 353
    .line 354
    :cond_9
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    :goto_4
    return-object v2

    .line 357
    :pswitch_1
    sget-object v6, La/wne;->a:La/wne;

    .line 358
    .line 359
    iget-boolean v0, v5, La/orc0;->j:Z

    .line 360
    .line 361
    if-eqz v0, :cond_b

    .line 362
    .line 363
    if-ne v0, v7, :cond_a

    .line 364
    .line 365
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v0, p1

    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v8, La/qrc0;->s:La/gpu;

    .line 379
    .line 380
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, La/zqc0;

    .line 385
    .line 386
    iget-object v1, v1, La/zqc0;->f:La/src0;

    .line 387
    .line 388
    invoke-virtual {v1}, La/src0;->getId()J

    .line 389
    .line 390
    .line 391
    move-result-wide v1

    .line 392
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, La/zqc0;

    .line 397
    .line 398
    iget-object v3, v3, La/zqc0;->e:La/vrc0;

    .line 399
    .line 400
    invoke-interface {v3}, La/vrc0;->getId()J

    .line 401
    .line 402
    .line 403
    move-result-wide v3

    .line 404
    iput-boolean v7, v5, La/orc0;->j:Z

    .line 405
    .line 406
    invoke-virtual/range {v0 .. v5}, La/gpu;->a(JJLa/zje;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-ne v0, v6, :cond_c

    .line 411
    .line 412
    move-object v2, v6

    .line 413
    goto :goto_6

    .line 414
    :cond_c
    :goto_5
    move-object v12, v0

    .line 415
    check-cast v12, Ljava/util/List;

    .line 416
    .line 417
    sget v0, La/qrc0;->K:I

    .line 418
    .line 419
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 420
    .line 421
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 422
    .line 423
    :cond_d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    move-object v9, v1

    .line 431
    check-cast v9, La/zqc0;

    .line 432
    .line 433
    const/16 v22, 0x0

    .line 434
    .line 435
    const v23, 0xfff7

    .line 436
    .line 437
    .line 438
    const/4 v10, 0x0

    .line 439
    const/4 v11, 0x0

    .line 440
    const/4 v13, 0x0

    .line 441
    const/4 v14, 0x0

    .line 442
    const/4 v15, 0x0

    .line 443
    const/16 v16, 0x0

    .line 444
    .line 445
    const-wide/16 v17, 0x0

    .line 446
    .line 447
    const-wide/16 v19, 0x0

    .line 448
    .line 449
    const/16 v21, 0x0

    .line 450
    .line 451
    invoke-static/range {v9 .. v23}, La/zqc0;->a(La/zqc0;ZZLjava/util/List;Ljava/lang/String;IIIJDLa/esr;ZI)La/zqc0;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eqz v1, :cond_d

    .line 460
    .line 461
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    :goto_6
    return-object v2

    .line 464
    :pswitch_2
    iget-object v9, v8, La/qrc0;->o:La/vzg0;

    .line 465
    .line 466
    sget-object v10, La/wne;->a:La/wne;

    .line 467
    .line 468
    iget-boolean v0, v5, La/orc0;->j:Z

    .line 469
    .line 470
    if-eqz v0, :cond_f

    .line 471
    .line 472
    if-ne v0, v7, :cond_e

    .line 473
    .line 474
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    move-object/from16 v0, p1

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_e
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_a

    .line 484
    .line 485
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    iget-object v0, v8, La/qrc0;->D:La/b4j;

    .line 489
    .line 490
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    check-cast v1, La/zqc0;

    .line 495
    .line 496
    iget-object v1, v1, La/zqc0;->e:La/vrc0;

    .line 497
    .line 498
    invoke-interface {v1}, La/vrc0;->getId()J

    .line 499
    .line 500
    .line 501
    move-result-wide v1

    .line 502
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    check-cast v3, La/zqc0;

    .line 507
    .line 508
    iget-object v3, v3, La/zqc0;->k:Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 517
    .line 518
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    new-instance v2, Lkotlin/Pair;

    .line 523
    .line 524
    const-string v4, "promo_id"

    .line 525
    .line 526
    invoke-direct {v2, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    new-instance v1, Lkotlin/Pair;

    .line 530
    .line 531
    const-string v4, "screen"

    .line 532
    .line 533
    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    filled-new-array {v2, v1}, [Lkotlin/Pair;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-static {v1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    const-string v2, "promo_buy"

    .line 545
    .line 546
    invoke-interface {v0, v2, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 547
    .line 548
    .line 549
    iget-object v0, v8, La/qrc0;->x:La/rrd;

    .line 550
    .line 551
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    check-cast v1, La/zqc0;

    .line 556
    .line 557
    iget v1, v1, La/zqc0;->h:I

    .line 558
    .line 559
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    check-cast v2, La/zqc0;

    .line 564
    .line 565
    iget-object v2, v2, La/zqc0;->e:La/vrc0;

    .line 566
    .line 567
    invoke-interface {v2}, La/vrc0;->getId()J

    .line 568
    .line 569
    .line 570
    move-result-wide v2

    .line 571
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    check-cast v4, La/zqc0;

    .line 576
    .line 577
    iget-object v4, v4, La/zqc0;->e:La/vrc0;

    .line 578
    .line 579
    invoke-interface {v4}, La/vrc0;->getType()La/xg8;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    iput-boolean v7, v5, La/orc0;->j:Z

    .line 584
    .line 585
    invoke-virtual/range {v0 .. v5}, La/rrd;->w(IJLa/xg8;La/zje;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    if-ne v0, v10, :cond_10

    .line 590
    .line 591
    move-object v2, v10

    .line 592
    goto/16 :goto_a

    .line 593
    .line 594
    :cond_10
    :goto_7
    check-cast v0, La/f8c0;

    .line 595
    .line 596
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    check-cast v1, La/zqc0;

    .line 601
    .line 602
    iget-object v1, v1, La/zqc0;->e:La/vrc0;

    .line 603
    .line 604
    invoke-interface {v1}, La/vrc0;->h0()I

    .line 605
    .line 606
    .line 607
    move-result v15

    .line 608
    new-instance v1, Ljava/lang/Integer;

    .line 609
    .line 610
    invoke-direct {v1, v15}, Ljava/lang/Integer;-><init>(I)V

    .line 611
    .line 612
    .line 613
    const-string v2, "AMOUNT_KEY"

    .line 614
    .line 615
    invoke-virtual {v9, v2, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    new-instance v1, Ljava/lang/Integer;

    .line 619
    .line 620
    invoke-direct {v1, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 621
    .line 622
    .line 623
    const-string v2, "GAME_COUNT_KEY"

    .line 624
    .line 625
    invoke-virtual {v9, v2, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    iget-object v1, v8, La/i3t0;->i:La/ocj;

    .line 629
    .line 630
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 631
    .line 632
    :cond_11
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    move-object v10, v2

    .line 640
    check-cast v10, La/zqc0;

    .line 641
    .line 642
    iget v3, v0, La/f8c0;->c:I

    .line 643
    .line 644
    iget-wide v4, v0, La/f8c0;->g:J

    .line 645
    .line 646
    iget-object v9, v0, La/f8c0;->f:La/esr;

    .line 647
    .line 648
    iget-wide v11, v0, La/f8c0;->i:D

    .line 649
    .line 650
    iget-boolean v13, v0, La/f8c0;->h:Z

    .line 651
    .line 652
    const/4 v14, 0x0

    .line 653
    const/16 v24, 0xc7f

    .line 654
    .line 655
    move-wide/from16 v20, v11

    .line 656
    .line 657
    const/4 v11, 0x0

    .line 658
    const/4 v12, 0x0

    .line 659
    move/from16 v23, v13

    .line 660
    .line 661
    const/4 v13, 0x0

    .line 662
    const/16 v16, 0x1

    .line 663
    .line 664
    move/from16 v17, v3

    .line 665
    .line 666
    move-wide/from16 v18, v4

    .line 667
    .line 668
    move-object/from16 v22, v9

    .line 669
    .line 670
    invoke-static/range {v10 .. v24}, La/zqc0;->a(La/zqc0;ZZLjava/util/List;Ljava/lang/String;IIIJDLa/esr;ZI)La/zqc0;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    if-eqz v2, :cond_11

    .line 679
    .line 680
    iget-object v1, v8, La/qrc0;->C:La/x20;

    .line 681
    .line 682
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    check-cast v2, La/zqc0;

    .line 687
    .line 688
    iget-object v2, v2, La/zqc0;->e:La/vrc0;

    .line 689
    .line 690
    invoke-interface {v2}, La/vrc0;->getId()J

    .line 691
    .line 692
    .line 693
    move-result-wide v2

    .line 694
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 695
    .line 696
    const-wide/16 v4, 0xceb

    .line 697
    .line 698
    invoke-static {v2, v3, v1, v4, v5}, La/h97;->r(JLa/s1p;J)V

    .line 699
    .line 700
    .line 701
    iget-object v1, v0, La/f8c0;->b:Ljava/lang/String;

    .line 702
    .line 703
    iget-object v11, v0, La/f8c0;->b:Ljava/lang/String;

    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    if-lez v1, :cond_15

    .line 710
    .line 711
    iget-object v1, v8, La/qrc0;->F:La/ctf0;

    .line 712
    .line 713
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    check-cast v2, La/zqc0;

    .line 718
    .line 719
    iget-boolean v2, v2, La/zqc0;->l:Z

    .line 720
    .line 721
    const v3, 0x7f130e5c

    .line 722
    .line 723
    .line 724
    const v4, 0x7f13140e

    .line 725
    .line 726
    .line 727
    if-eqz v2, :cond_12

    .line 728
    .line 729
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    check-cast v2, La/zqc0;

    .line 734
    .line 735
    iget-object v2, v2, La/zqc0;->f:La/src0;

    .line 736
    .line 737
    sget-object v5, La/src0;->d:La/src0;

    .line 738
    .line 739
    if-ne v2, v5, :cond_12

    .line 740
    .line 741
    new-instance v0, La/vqc0;

    .line 742
    .line 743
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 744
    .line 745
    new-array v2, v6, [Ljava/lang/Object;

    .line 746
    .line 747
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 748
    .line 749
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 750
    .line 751
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    invoke-virtual {v5, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v10

    .line 759
    new-array v2, v6, [Ljava/lang/Object;

    .line 760
    .line 761
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v12

    .line 769
    new-array v2, v6, [Ljava/lang/Object;

    .line 770
    .line 771
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const v3, 0x7f131048

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v13

    .line 782
    sget-object v18, La/n12;->c:La/n12;

    .line 783
    .line 784
    const/16 v19, 0x0

    .line 785
    .line 786
    const/16 v20, 0x5d0

    .line 787
    .line 788
    const/4 v14, 0x0

    .line 789
    const-string v15, "OPEN_GAME_REQUEST_KEY"

    .line 790
    .line 791
    const/16 v16, 0x0

    .line 792
    .line 793
    const/16 v17, 0x0

    .line 794
    .line 795
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 796
    .line 797
    .line 798
    invoke-direct {v0, v9}, La/vqc0;-><init>(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v8, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    goto/16 :goto_9

    .line 805
    .line 806
    :cond_12
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    check-cast v2, La/zqc0;

    .line 811
    .line 812
    iget-object v2, v2, La/zqc0;->f:La/src0;

    .line 813
    .line 814
    sget-object v5, La/src0;->d:La/src0;

    .line 815
    .line 816
    if-eq v2, v5, :cond_14

    .line 817
    .line 818
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    check-cast v2, La/zqc0;

    .line 823
    .line 824
    iget-object v2, v2, La/zqc0;->f:La/src0;

    .line 825
    .line 826
    sget-object v5, La/src0;->f:La/src0;

    .line 827
    .line 828
    if-ne v2, v5, :cond_13

    .line 829
    .line 830
    goto :goto_8

    .line 831
    :cond_13
    new-array v2, v6, [Ljava/lang/Object;

    .line 832
    .line 833
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 834
    .line 835
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 836
    .line 837
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    invoke-virtual {v5, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    iget-object v0, v0, La/f8c0;->d:Ljava/lang/String;

    .line 846
    .line 847
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v4

    .line 851
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    const v5, 0x7f13104d

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    new-array v5, v6, [Ljava/lang/Object;

    .line 863
    .line 864
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v5

    .line 868
    invoke-virtual {v1, v3, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    new-instance v3, La/xqc0;

    .line 873
    .line 874
    invoke-direct {v3, v0, v4, v2, v1}, La/xqc0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v8, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    goto :goto_9

    .line 881
    :cond_14
    :goto_8
    new-instance v0, La/wqc0;

    .line 882
    .line 883
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 884
    .line 885
    new-array v2, v6, [Ljava/lang/Object;

    .line 886
    .line 887
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 888
    .line 889
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    invoke-virtual {v5, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v10

    .line 897
    new-array v2, v6, [Ljava/lang/Object;

    .line 898
    .line 899
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 900
    .line 901
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v12

    .line 909
    sget-object v18, La/n12;->c:La/n12;

    .line 910
    .line 911
    const/16 v19, 0x0

    .line 912
    .line 913
    const/16 v20, 0x5f8

    .line 914
    .line 915
    const/4 v13, 0x0

    .line 916
    const/4 v14, 0x0

    .line 917
    const/4 v15, 0x0

    .line 918
    const/16 v16, 0x0

    .line 919
    .line 920
    const/16 v17, 0x0

    .line 921
    .line 922
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 923
    .line 924
    .line 925
    invoke-direct {v0, v9}, La/wqc0;-><init>(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v8, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    :cond_15
    :goto_9
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 932
    .line 933
    :goto_a
    return-object v2

    .line 934
    nop

    .line 935
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
