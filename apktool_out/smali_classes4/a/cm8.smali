.class public final La/cm8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/jm8;


# direct methods
.method public synthetic constructor <init>(La/jm8;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cm8;->i:B

    iput-object p1, p0, La/cm8;->k:La/jm8;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cm8;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cm8;->k:La/jm8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/cm8;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/cm8;-><init>(La/jm8;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/cm8;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/cm8;-><init>(La/jm8;La/yje;B)V

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
    iput-boolean p0, v0, La/cm8;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/cm8;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/cm8;-><init>(La/jm8;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/cm8;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/cm8;-><init>(La/jm8;La/yje;B)V

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
    iget-byte v0, p0, La/cm8;->i:B

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
    invoke-virtual {p0, p1, p2}, La/cm8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cm8;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cm8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cm8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/cm8;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/cm8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cm8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/cm8;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/cm8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cm8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/cm8;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/cm8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cm8;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/cm8;->k:La/jm8;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v2, v0, La/cm8;->j:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v6, La/jm8;->s:La/ahu;

    .line 37
    .line 38
    sget-object v3, La/bm5;->d:La/bm5;

    .line 39
    .line 40
    iput-boolean v5, v0, La/cm8;->j:Z

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    move-object v3, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    check-cast v0, La/ql5;

    .line 51
    .line 52
    iget-object v1, v6, La/jm8;->C:La/trm0;

    .line 53
    .line 54
    sget-object v2, La/bm5;->d:La/bm5;

    .line 55
    .line 56
    invoke-virtual {v1, v2, v0}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v6, La/jm8;->F:La/v88;

    .line 60
    .line 61
    iget-object v2, v6, La/jm8;->P:La/i1w0;

    .line 62
    .line 63
    iget-wide v3, v0, La/ql5;->a:J

    .line 64
    .line 65
    invoke-virtual {v1, v2, v5, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 66
    .line 67
    .line 68
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_1
    return-object v3

    .line 71
    :pswitch_0
    iget-boolean v0, v0, La/cm8;->j:Z

    .line 72
    .line 73
    sget-object v1, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    sget v3, La/jm8;->V:I

    .line 83
    .line 84
    invoke-virtual {v6, v5, v2}, La/jm8;->Q(ZZ)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    sget v2, La/jm8;->V:I

    .line 89
    .line 90
    iget-object v7, v1, La/ocj;->a:La/p7m0;

    .line 91
    .line 92
    :cond_4
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-object v8, v2

    .line 100
    check-cast v8, La/kl8;

    .line 101
    .line 102
    const/16 v21, 0x1

    .line 103
    .line 104
    const v22, 0xbf9f

    .line 105
    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    invoke-static/range {v8 .. v22}, La/kl8;->a(La/kl8;ZLa/w3t;La/je8;La/csr;ZZLjava/util/List;Ljava/util/ArrayList;ZLjava/util/List;La/ql5;ZZI)La/kl8;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v7, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_4

    .line 133
    .line 134
    :goto_2
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 135
    .line 136
    :goto_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-object v4, v1

    .line 144
    check-cast v4, La/kl8;

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const v18, 0xfffd

    .line 149
    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x0

    .line 155
    const/4 v10, 0x0

    .line 156
    const/4 v11, 0x0

    .line 157
    const/4 v12, 0x0

    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    move v5, v0

    .line 164
    invoke-static/range {v4 .. v18}, La/kl8;->a(La/kl8;ZLa/w3t;La/je8;La/csr;ZZLjava/util/List;Ljava/util/ArrayList;ZLjava/util/List;La/ql5;ZZI)La/kl8;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move v8, v5

    .line 169
    invoke-virtual {v2, v1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_5
    move v0, v8

    .line 179
    goto :goto_3

    .line 180
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 181
    .line 182
    iget-boolean v7, v0, La/cm8;->j:Z

    .line 183
    .line 184
    if-eqz v7, :cond_7

    .line 185
    .line 186
    if-ne v7, v5, :cond_6

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, La/kl8;

    .line 204
    .line 205
    iget-object v3, v3, La/kl8;->d:La/je8;

    .line 206
    .line 207
    iput-boolean v5, v0, La/cm8;->j:Z

    .line 208
    .line 209
    invoke-virtual {v6, v3, v2, v0}, La/jm8;->P(La/je8;ZLa/zje;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-ne v0, v1, :cond_8

    .line 214
    .line 215
    move-object v3, v1

    .line 216
    goto :goto_5

    .line 217
    :cond_8
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    :goto_5
    return-object v3

    .line 220
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 221
    .line 222
    iget-boolean v7, v0, La/cm8;->j:Z

    .line 223
    .line 224
    if-eqz v7, :cond_a

    .line 225
    .line 226
    if-ne v7, v5, :cond_9

    .line 227
    .line 228
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_a

    .line 236
    .line 237
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v3, v6, La/jm8;->q:La/ls;

    .line 241
    .line 242
    sget-object v4, La/s470;->p:La/s470;

    .line 243
    .line 244
    invoke-virtual {v4}, La/s470;->a()J

    .line 245
    .line 246
    .line 247
    move-result-wide v7

    .line 248
    iput-boolean v5, v0, La/cm8;->j:Z

    .line 249
    .line 250
    invoke-virtual {v3, v7, v8, v0}, La/ls;->b(JLa/yje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-ne v0, v1, :cond_b

    .line 255
    .line 256
    move-object v3, v1

    .line 257
    goto :goto_a

    .line 258
    :cond_b
    :goto_6
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, La/kl8;

    .line 263
    .line 264
    iget-object v0, v0, La/kl8;->c:La/w3t;

    .line 265
    .line 266
    instance-of v0, v0, La/v3t;

    .line 267
    .line 268
    iget-object v1, v6, La/jm8;->P:La/i1w0;

    .line 269
    .line 270
    if-eqz v0, :cond_c

    .line 271
    .line 272
    new-instance v0, La/d38;

    .line 273
    .line 274
    const/16 v2, 0xa

    .line 275
    .line 276
    invoke-direct {v0, v6, v2}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_c
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iget-object v3, v6, La/jm8;->E:La/oct;

    .line 288
    .line 289
    invoke-virtual {v3}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    instance-of v4, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 294
    .line 295
    if-eqz v4, :cond_d

    .line 296
    .line 297
    new-instance v4, La/e1w0;

    .line 298
    .line 299
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 300
    .line 301
    invoke-direct {v4, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 302
    .line 303
    .line 304
    new-instance v3, La/c8d;

    .line 305
    .line 306
    sget-object v5, La/y7d;->a:La/v7d;

    .line 307
    .line 308
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_d
    new-instance v4, La/w0w0;

    .line 316
    .line 317
    invoke-direct {v4, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 318
    .line 319
    .line 320
    new-instance v3, La/c8d;

    .line 321
    .line 322
    sget-object v5, La/y7d;->a:La/v7d;

    .line 323
    .line 324
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :goto_7
    invoke-static {v1, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_8
    move-object v2, v0

    .line 335
    check-cast v2, La/paw;

    .line 336
    .line 337
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_e

    .line 342
    .line 343
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, La/oe50;

    .line 348
    .line 349
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_e
    :goto_9
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    :goto_a
    return-object v3

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
