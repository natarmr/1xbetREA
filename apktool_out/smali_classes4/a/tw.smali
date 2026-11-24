.class public final La/tw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:I

.field public k:B

.field public final synthetic l:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;La/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/tw;->i:B

    iput-object p1, p0, La/tw;->l:La/diu0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/fir0;ILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/tw;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/tw;->l:La/diu0;

    .line 5
    .line 6
    iput p2, p0, La/tw;->j:I

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tw;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/tw;->l:La/diu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tw;

    .line 9
    .line 10
    check-cast v1, La/fir0;

    .line 11
    .line 12
    iget p0, p0, La/tw;->j:I

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p1}, La/tw;-><init>(La/fir0;ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance p0, La/tw;

    .line 19
    .line 20
    check-cast v1, La/k370;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p0, v1, p1, v0}, La/tw;-><init>(La/diu0;La/yje;B)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    new-instance p0, La/tw;

    .line 28
    .line 29
    check-cast v1, La/a3f;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p0, v1, p1, v0}, La/tw;-><init>(La/diu0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_2
    new-instance p0, La/tw;

    .line 37
    .line 38
    check-cast v1, La/ww;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, v1, p1, v0}, La/tw;-><init>(La/diu0;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tw;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/tw;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/tw;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/tw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/tw;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/tw;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/tw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/tw;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/tw;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/tw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/tw;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/tw;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/tw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/tw;->i:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v5, v0, La/tw;->l:La/diu0;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v1, v5

    .line 18
    check-cast v1, La/fir0;

    .line 19
    .line 20
    sget-object v9, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v2, v0, La/tw;->k:B

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    if-eq v2, v6, :cond_1

    .line 27
    .line 28
    if-ne v2, v8, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget v2, La/fir0;->X:I

    .line 46
    .line 47
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 48
    .line 49
    iget-object v10, v2, La/ocj;->a:La/p7m0;

    .line 50
    .line 51
    :cond_3
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-object v11, v2

    .line 59
    check-cast v11, La/yhr0;

    .line 60
    .line 61
    const/16 v21, 0x0

    .line 62
    .line 63
    const/16 v22, 0x1df

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    const/4 v15, 0x0

    .line 69
    const/16 v16, 0x1

    .line 70
    .line 71
    const-wide/16 v17, 0x0

    .line 72
    .line 73
    const-wide/16 v19, 0x0

    .line 74
    .line 75
    invoke-static/range {v11 .. v22}, La/yhr0;->a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v10, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    iget-object v2, v1, La/fir0;->A:La/usc;

    .line 86
    .line 87
    iput-byte v6, v0, La/tw;->k:B

    .line 88
    .line 89
    invoke-virtual {v2, v0}, La/usc;->a(La/bnn0;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-ne v2, v9, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    :goto_0
    iget-object v2, v1, La/fir0;->u:La/ctu;

    .line 97
    .line 98
    iget v3, v0, La/tw;->j:I

    .line 99
    .line 100
    iput-byte v8, v0, La/tw;->k:B

    .line 101
    .line 102
    invoke-virtual {v2, v3, v0}, La/ctu;->a(ILa/bnn0;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v9, :cond_5

    .line 107
    .line 108
    :goto_1
    move-object v7, v9

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_2
    sget v0, La/fir0;->X:I

    .line 111
    .line 112
    invoke-virtual {v1, v6}, La/fir0;->N(Z)V

    .line 113
    .line 114
    .line 115
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_3
    return-object v7

    .line 118
    :pswitch_0
    check-cast v5, La/k370;

    .line 119
    .line 120
    sget-object v1, La/wne;->a:La/wne;

    .line 121
    .line 122
    iget-byte v9, v0, La/tw;->k:B

    .line 123
    .line 124
    if-eqz v9, :cond_9

    .line 125
    .line 126
    if-eq v9, v6, :cond_8

    .line 127
    .line 128
    if-eq v9, v8, :cond_7

    .line 129
    .line 130
    if-ne v9, v2, :cond_6

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_a

    .line 136
    .line 137
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_b

    .line 141
    .line 142
    :cond_7
    iget v3, v0, La/tw;->j:I

    .line 143
    .line 144
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v4, p1

    .line 148
    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5}, La/k370;->C()V

    .line 159
    .line 160
    .line 161
    iget-object v4, v5, La/k370;->f:La/n4u;

    .line 162
    .line 163
    invoke-virtual {v4}, La/n4u;->f()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-eqz v4, :cond_a

    .line 168
    .line 169
    invoke-virtual {v5}, La/k370;->E()V

    .line 170
    .line 171
    .line 172
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    goto/16 :goto_b

    .line 175
    .line 176
    :cond_a
    iget-object v4, v5, La/k370;->l:La/nw20;

    .line 177
    .line 178
    iget-object v7, v4, La/nw20;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v7, La/kqc;

    .line 181
    .line 182
    invoke-virtual {v7}, La/kqc;->a()La/sub0;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    sget-object v9, La/sub0;->d:La/sub0;

    .line 187
    .line 188
    if-ne v7, v9, :cond_b

    .line 189
    .line 190
    move v9, v6

    .line 191
    goto :goto_4

    .line 192
    :cond_b
    move v9, v3

    .line 193
    :goto_4
    sget-object v10, La/sub0;->f:La/sub0;

    .line 194
    .line 195
    if-ne v7, v10, :cond_c

    .line 196
    .line 197
    move v7, v6

    .line 198
    goto :goto_5

    .line 199
    :cond_c
    move v7, v3

    .line 200
    :goto_5
    iget-object v4, v4, La/nw20;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v4, La/jqc;

    .line 203
    .line 204
    invoke-virtual {v4}, La/jqc;->b()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v9, :cond_e

    .line 209
    .line 210
    if-eqz v4, :cond_d

    .line 211
    .line 212
    if-eqz v7, :cond_e

    .line 213
    .line 214
    :cond_d
    iget-object v4, v5, La/k370;->c:La/jdu;

    .line 215
    .line 216
    iput-byte v6, v0, La/tw;->k:B

    .line 217
    .line 218
    invoke-virtual {v4, v6, v0}, La/jdu;->c(ZLa/zje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    if-ne v4, v1, :cond_e

    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_e
    :goto_6
    invoke-virtual {v5}, La/k370;->D()V

    .line 226
    .line 227
    .line 228
    iget-object v4, v5, La/k370;->g:La/kqc;

    .line 229
    .line 230
    invoke-virtual {v4}, La/kqc;->a()La/sub0;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    sget-object v7, La/sub0;->d:La/sub0;

    .line 235
    .line 236
    if-ne v4, v7, :cond_f

    .line 237
    .line 238
    move v3, v6

    .line 239
    :cond_f
    iget-object v4, v5, La/k370;->j:La/jqc;

    .line 240
    .line 241
    iput v3, v0, La/tw;->j:I

    .line 242
    .line 243
    iput-byte v8, v0, La/tw;->k:B

    .line 244
    .line 245
    invoke-virtual {v4, v0}, La/jqc;->a(La/zje;)Ljava/io/Serializable;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    if-ne v4, v1, :cond_10

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_10
    :goto_7
    check-cast v4, Ljava/lang/Boolean;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v3, :cond_12

    .line 259
    .line 260
    if-eqz v4, :cond_11

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_11
    invoke-virtual {v5}, La/k370;->G()V

    .line 264
    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_12
    :goto_8
    iput v3, v0, La/tw;->j:I

    .line 268
    .line 269
    iput-byte v2, v0, La/tw;->k:B

    .line 270
    .line 271
    invoke-virtual {v5, v0}, La/k370;->L(La/zje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-ne v0, v1, :cond_13

    .line 276
    .line 277
    :goto_9
    move-object v7, v1

    .line 278
    goto :goto_b

    .line 279
    :cond_13
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_b
    return-object v7

    .line 282
    :pswitch_1
    move-object v1, v5

    .line 283
    check-cast v1, La/a3f;

    .line 284
    .line 285
    sget-object v2, La/wne;->a:La/wne;

    .line 286
    .line 287
    iget-byte v5, v0, La/tw;->k:B

    .line 288
    .line 289
    if-eqz v5, :cond_16

    .line 290
    .line 291
    if-eq v5, v6, :cond_15

    .line 292
    .line 293
    if-ne v5, v8, :cond_14

    .line 294
    .line 295
    iget v0, v0, La/tw;->j:I

    .line 296
    .line 297
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    move v3, v0

    .line 301
    move-object/from16 v0, p1

    .line 302
    .line 303
    goto/16 :goto_f

    .line 304
    .line 305
    :cond_14
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_13

    .line 309
    .line 310
    :cond_15
    iget v0, v0, La/tw;->j:I

    .line 311
    .line 312
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    move v3, v0

    .line 316
    move-object/from16 v0, p1

    .line 317
    .line 318
    goto :goto_c

    .line 319
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    iget-object v4, v1, La/a3f;->G:La/bby;

    .line 323
    .line 324
    if-eqz v4, :cond_17

    .line 325
    .line 326
    invoke-static {v4}, La/v3c;->N(La/bby;)V

    .line 327
    .line 328
    .line 329
    :cond_17
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    new-instance v14, La/u2f;

    .line 334
    .line 335
    invoke-direct {v14, v1, v8}, La/u2f;-><init>(La/a3f;B)V

    .line 336
    .line 337
    .line 338
    new-instance v15, La/w2f;

    .line 339
    .line 340
    invoke-direct {v15, v1, v7, v3}, La/w2f;-><init>(La/a3f;La/yje;B)V

    .line 341
    .line 342
    .line 343
    const/16 v16, 0x24

    .line 344
    .line 345
    const-wide/16 v10, 0x258

    .line 346
    .line 347
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    invoke-static/range {v9 .. v16}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    iput-object v3, v1, La/a3f;->G:La/bby;

    .line 355
    .line 356
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    check-cast v3, La/l2f;

    .line 361
    .line 362
    iget-object v3, v3, La/l2f;->f:Ljava/util/List;

    .line 363
    .line 364
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    check-cast v4, La/l2f;

    .line 369
    .line 370
    iget v4, v4, La/l2f;->g:I

    .line 371
    .line 372
    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    check-cast v3, La/k2f;

    .line 377
    .line 378
    instance-of v3, v3, La/j2f;

    .line 379
    .line 380
    if-eqz v3, :cond_19

    .line 381
    .line 382
    iput v3, v0, La/tw;->j:I

    .line 383
    .line 384
    iput-byte v6, v0, La/tw;->k:B

    .line 385
    .line 386
    invoke-virtual {v1, v0}, La/a3f;->P(La/zje;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-ne v0, v2, :cond_18

    .line 391
    .line 392
    goto :goto_e

    .line 393
    :cond_18
    :goto_c
    check-cast v0, Ljava/lang/Number;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 396
    .line 397
    .line 398
    move-result-wide v4

    .line 399
    :goto_d
    move v9, v3

    .line 400
    move-wide v3, v4

    .line 401
    goto :goto_10

    .line 402
    :cond_19
    iput v3, v0, La/tw;->j:I

    .line 403
    .line 404
    iput-byte v8, v0, La/tw;->k:B

    .line 405
    .line 406
    invoke-virtual {v1, v0}, La/a3f;->M(La/zje;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-ne v0, v2, :cond_1a

    .line 411
    .line 412
    :goto_e
    move-object v7, v2

    .line 413
    goto :goto_13

    .line 414
    :cond_1a
    :goto_f
    check-cast v0, Ljava/lang/Number;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 417
    .line 418
    .line 419
    move-result-wide v4

    .line 420
    goto :goto_d

    .line 421
    :goto_10
    iget-object v0, v1, La/a3f;->G:La/bby;

    .line 422
    .line 423
    if-eqz v0, :cond_1b

    .line 424
    .line 425
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 426
    .line 427
    .line 428
    :cond_1b
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 429
    .line 430
    iget-object v10, v0, La/ocj;->a:La/p7m0;

    .line 431
    .line 432
    :cond_1c
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    move-object v11, v0

    .line 440
    check-cast v11, La/l2f;

    .line 441
    .line 442
    const/16 v16, 0x0

    .line 443
    .line 444
    const/16 v17, 0x3ed

    .line 445
    .line 446
    const/4 v12, 0x0

    .line 447
    const/4 v13, 0x0

    .line 448
    const/4 v14, 0x0

    .line 449
    const/4 v15, 0x0

    .line 450
    invoke-static/range {v11 .. v17}, La/l2f;->a(La/l2f;Ljava/lang/String;ZZLjava/lang/String;II)La/l2f;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {v10, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_1c

    .line 459
    .line 460
    if-eqz v9, :cond_1d

    .line 461
    .line 462
    sget-object v0, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 463
    .line 464
    :goto_11
    move-object v2, v0

    .line 465
    goto :goto_12

    .line 466
    :cond_1d
    sget-object v0, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 467
    .line 468
    goto :goto_11

    .line 469
    :goto_12
    iget-object v6, v1, La/a3f;->p:La/i1w0;

    .line 470
    .line 471
    new-instance v0, La/mz0;

    .line 472
    .line 473
    const/16 v5, 0x9

    .line 474
    .line 475
    invoke-direct/range {v0 .. v5}, La/mz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v6, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 479
    .line 480
    .line 481
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    :goto_13
    return-object v7

    .line 484
    :pswitch_2
    check-cast v5, La/ww;

    .line 485
    .line 486
    sget-object v1, La/wne;->a:La/wne;

    .line 487
    .line 488
    iget-byte v9, v0, La/tw;->k:B

    .line 489
    .line 490
    if-eqz v9, :cond_21

    .line 491
    .line 492
    if-eq v9, v6, :cond_20

    .line 493
    .line 494
    if-eq v9, v8, :cond_1f

    .line 495
    .line 496
    if-ne v9, v2, :cond_1e

    .line 497
    .line 498
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    goto/16 :goto_18

    .line 502
    .line 503
    :cond_1e
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_19

    .line 507
    .line 508
    :cond_1f
    iget v3, v0, La/tw;->j:I

    .line 509
    .line 510
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    move-object/from16 v4, p1

    .line 514
    .line 515
    goto :goto_15

    .line 516
    :cond_20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v3, p1

    .line 520
    .line 521
    goto :goto_14

    .line 522
    :cond_21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    iget-object v4, v5, La/ww;->q:La/rou;

    .line 526
    .line 527
    iput-byte v6, v0, La/tw;->k:B

    .line 528
    .line 529
    invoke-virtual {v4, v3, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    if-ne v3, v1, :cond_22

    .line 534
    .line 535
    goto :goto_17

    .line 536
    :cond_22
    :goto_14
    check-cast v3, La/m2c0;

    .line 537
    .line 538
    iget-object v3, v3, La/m2c0;->c:Ljava/lang/String;

    .line 539
    .line 540
    invoke-static {v3}, La/wvb;->X(Ljava/lang/String;)I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    iget-object v4, v5, La/ww;->v:La/a7q;

    .line 545
    .line 546
    iput v3, v0, La/tw;->j:I

    .line 547
    .line 548
    iput-byte v8, v0, La/tw;->k:B

    .line 549
    .line 550
    iget-object v4, v4, La/a7q;->a:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v4, La/xr;

    .line 553
    .line 554
    invoke-virtual {v4, v0}, La/xr;->f(La/zje;)Ljava/io/Serializable;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    if-ne v4, v1, :cond_23

    .line 559
    .line 560
    goto :goto_17

    .line 561
    :cond_23
    :goto_15
    check-cast v4, Ljava/lang/Iterable;

    .line 562
    .line 563
    new-instance v6, Ljava/util/ArrayList;

    .line 564
    .line 565
    const/16 v7, 0xa

    .line 566
    .line 567
    invoke-static {v4, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 568
    .line 569
    .line 570
    move-result v7

    .line 571
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 572
    .line 573
    .line 574
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 579
    .line 580
    .line 581
    move-result v7

    .line 582
    if-eqz v7, :cond_24

    .line 583
    .line 584
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v7

    .line 588
    check-cast v7, La/xuf;

    .line 589
    .line 590
    new-instance v8, La/vuf;

    .line 591
    .line 592
    iget-wide v9, v7, La/xuf;->a:J

    .line 593
    .line 594
    iget-object v11, v7, La/xuf;->c:Ljava/lang/String;

    .line 595
    .line 596
    iget-object v7, v7, La/xuf;->b:Ljava/lang/String;

    .line 597
    .line 598
    invoke-direct {v8, v9, v10, v11, v7}, La/vuf;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    goto :goto_16

    .line 605
    :cond_24
    iget-object v4, v5, La/ww;->u:La/h0q0;

    .line 606
    .line 607
    iput v3, v0, La/tw;->j:I

    .line 608
    .line 609
    iput-byte v2, v0, La/tw;->k:B

    .line 610
    .line 611
    invoke-virtual {v4, v6, v3, v0}, La/h0q0;->w(Ljava/util/ArrayList;ILa/zje;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    if-ne v0, v1, :cond_25

    .line 616
    .line 617
    :goto_17
    move-object v7, v1

    .line 618
    goto :goto_19

    .line 619
    :cond_25
    :goto_18
    new-instance v0, La/jw;

    .line 620
    .line 621
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    check-cast v1, La/lw;

    .line 626
    .line 627
    iget-object v1, v1, La/lw;->b:La/xuf;

    .line 628
    .line 629
    iget-wide v1, v1, La/xuf;->a:J

    .line 630
    .line 631
    long-to-int v1, v1

    .line 632
    invoke-direct {v0, v1}, La/jw;-><init>(I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v5, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    :goto_19
    return-object v7

    .line 641
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
