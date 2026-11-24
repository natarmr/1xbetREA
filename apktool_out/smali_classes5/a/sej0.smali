.class public final La/sej0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Lorg/xplatform/settings/impl/presentation/a;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/sej0;->i:B

    iput-object p1, p0, La/sej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    iput-object p2, p0, La/sej0;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/sej0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/sej0;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/sej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/sej0;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/sej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/sej0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/sej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/sej0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/sej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sej0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sej0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/sej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/sej0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/sej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/sej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/sej0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/sej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sej0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/sej0;->l:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, La/sej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, v0, La/sej0;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, Lorg/xplatform/settings/impl/presentation/a;->a0:La/nv20;

    .line 36
    .line 37
    iget-object v3, v3, Lorg/xplatform/settings/impl/presentation/a;->x:La/x4u;

    .line 38
    .line 39
    iget-object v3, v3, La/x4u;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, La/okt0;

    .line 42
    .line 43
    iget-object v3, v3, La/okt0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, La/btt0;

    .line 46
    .line 47
    iget-object v3, v3, La/btt0;->a:La/vwb0;

    .line 48
    .line 49
    const-string v5, "refresh_token"

    .line 50
    .line 51
    invoke-static {v3, v5}, La/vwb0;->d(La/vwb0;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-boolean v6, v0, La/sej0;->j:Z

    .line 56
    .line 57
    invoke-virtual {v4, v2, v3, v0}, La/nv20;->e(Ljava/lang/String;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v1, :cond_2

    .line 62
    .line 63
    move-object v4, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_1
    return-object v4

    .line 68
    :pswitch_0
    iget-object v1, v3, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 69
    .line 70
    sget-object v7, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v8, v0, La/sej0;->j:Z

    .line 73
    .line 74
    if-eqz v8, :cond_4

    .line 75
    .line 76
    if-ne v8, v6, :cond_3

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    move-object v8, v4

    .line 95
    check-cast v8, La/caj0;

    .line 96
    .line 97
    const/16 v30, 0x0

    .line 98
    .line 99
    const v31, 0x1fffffe

    .line 100
    .line 101
    .line 102
    const/4 v9, 0x1

    .line 103
    const/4 v10, 0x0

    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v12, 0x0

    .line 106
    const/4 v13, 0x0

    .line 107
    const/4 v14, 0x0

    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    const/16 v20, 0x0

    .line 118
    .line 119
    const/16 v21, 0x0

    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    .line 125
    const/16 v24, 0x0

    .line 126
    .line 127
    const/16 v25, 0x0

    .line 128
    .line 129
    const/16 v26, 0x0

    .line 130
    .line 131
    const/16 v27, 0x0

    .line 132
    .line 133
    const/16 v28, 0x0

    .line 134
    .line 135
    const/16 v29, 0x0

    .line 136
    .line 137
    invoke-static/range {v8 .. v31}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_5

    .line 146
    .line 147
    iget-object v3, v3, Lorg/xplatform/settings/impl/presentation/a;->m0:La/im4;

    .line 148
    .line 149
    new-instance v4, La/tl4;

    .line 150
    .line 151
    new-instance v5, La/ru4;

    .line 152
    .line 153
    invoke-direct {v5, v2}, La/ru4;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v4, v5}, La/tl4;-><init>(La/ru4;)V

    .line 157
    .line 158
    .line 159
    iput-boolean v6, v0, La/sej0;->j:Z

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v4, v0}, La/im4;->j(La/xl4;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-ne v0, v7, :cond_6

    .line 169
    .line 170
    move-object v4, v7

    .line 171
    goto :goto_3

    .line 172
    :cond_6
    :goto_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    move-object v2, v0

    .line 177
    check-cast v2, La/caj0;

    .line 178
    .line 179
    const/16 v24, 0x0

    .line 180
    .line 181
    const v25, 0x1fffffe

    .line 182
    .line 183
    .line 184
    const/4 v3, 0x0

    .line 185
    const/4 v4, 0x0

    .line 186
    const/4 v5, 0x0

    .line 187
    const/4 v6, 0x0

    .line 188
    const/4 v7, 0x0

    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x0

    .line 191
    const/4 v10, 0x0

    .line 192
    const/4 v11, 0x0

    .line 193
    const/4 v12, 0x0

    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const/16 v16, 0x0

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const/16 v18, 0x0

    .line 202
    .line 203
    const/16 v19, 0x0

    .line 204
    .line 205
    const/16 v20, 0x0

    .line 206
    .line 207
    const/16 v21, 0x0

    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const/16 v23, 0x0

    .line 212
    .line 213
    invoke-static/range {v2 .. v25}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_6

    .line 222
    .line 223
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    :goto_3
    return-object v4

    .line 226
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget-boolean v7, v0, La/sej0;->j:Z

    .line 229
    .line 230
    if-eqz v7, :cond_8

    .line 231
    .line 232
    if-ne v7, v6, :cond_7

    .line 233
    .line 234
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object/from16 v0, p1

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_7
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object v4, v3, Lorg/xplatform/settings/impl/presentation/a;->X:La/bbw0;

    .line 248
    .line 249
    iput-boolean v6, v0, La/sej0;->j:Z

    .line 250
    .line 251
    invoke-virtual {v4, v2, v0}, La/bbw0;->q(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-ne v0, v1, :cond_9

    .line 256
    .line 257
    move-object v4, v1

    .line 258
    goto :goto_7

    .line 259
    :cond_9
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_b

    .line 266
    .line 267
    iget-object v0, v3, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 268
    .line 269
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    iget-object v2, v3, Lorg/xplatform/settings/impl/presentation/a;->S:La/s9m0;

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    new-instance v2, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$TestSectionScreen;

    .line 279
    .line 280
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 281
    .line 282
    .line 283
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 284
    .line 285
    if-eqz v3, :cond_a

    .line 286
    .line 287
    new-instance v3, La/e1w0;

    .line 288
    .line 289
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 290
    .line 291
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 292
    .line 293
    .line 294
    new-instance v2, La/c8d;

    .line 295
    .line 296
    sget-object v4, La/y7d;->a:La/v7d;

    .line 297
    .line 298
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_a
    new-instance v3, La/w0w0;

    .line 306
    .line 307
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 308
    .line 309
    .line 310
    new-instance v2, La/c8d;

    .line 311
    .line 312
    sget-object v4, La/y7d;->a:La/v7d;

    .line 313
    .line 314
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    :goto_5
    const/4 v2, 0x0

    .line 321
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    :goto_6
    move-object v2, v1

    .line 326
    check-cast v2, La/paw;

    .line 327
    .line 328
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_b

    .line 333
    .line 334
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    check-cast v2, La/oe50;

    .line 339
    .line 340
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 341
    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_7
    return-object v4

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
