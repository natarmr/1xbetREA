.class public final La/jf20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/qg20;


# direct methods
.method public synthetic constructor <init>(La/qg20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jf20;->i:B

    iput-object p1, p0, La/jf20;->k:La/qg20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jf20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jf20;->k:La/qg20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/jf20;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/jf20;-><init>(La/qg20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/jf20;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/jf20;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/jf20;-><init>(La/qg20;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/jf20;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/jf20;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/jf20;-><init>(La/qg20;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/jf20;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/jf20;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/jf20;-><init>(La/qg20;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/jf20;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

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
    iget-byte v0, p0, La/jf20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/jf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jf20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ytb0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/jf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/jf20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/jf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/jf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/jf20;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/jf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/jf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/jf20;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/jf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jf20;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, v0, La/jf20;->k:La/qg20;

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/jf20;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Throwable;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, La/qg20;->c0()V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object v1, v0, La/jf20;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, La/ytb0;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v7, v0, La/jf20;->k:La/qg20;

    .line 41
    .line 42
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v5, La/yw10;

    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    const/16 v12, 0x12

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    const-class v8, La/qg20;

    .line 53
    .line 54
    const-string v9, "handleError"

    .line 55
    .line 56
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 57
    .line 58
    invoke-direct/range {v5 .. v12}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 59
    .line 60
    .line 61
    iget-object v4, v7, La/qg20;->d:La/mne;

    .line 62
    .line 63
    iget-object v11, v4, La/mne;->b:La/dvj;

    .line 64
    .line 65
    new-instance v10, La/dd20;

    .line 66
    .line 67
    invoke-direct {v10, v7, v3}, La/dd20;-><init>(La/qg20;B)V

    .line 68
    .line 69
    .line 70
    new-instance v12, La/hf20;

    .line 71
    .line 72
    invoke-direct {v12, v7, v1, v2}, La/hf20;-><init>(La/qg20;La/ytb0;La/yje;)V

    .line 73
    .line 74
    .line 75
    const/16 v13, 0x8

    .line 76
    .line 77
    move-object v8, v0

    .line 78
    move-object v9, v5

    .line 79
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 80
    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_1
    iget-object v1, v0, La/jf20;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Ljava/util/List;

    .line 88
    .line 89
    sget-object v4, La/wne;->a:La/wne;

    .line 90
    .line 91
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v8, v0, La/jf20;->k:La/qg20;

    .line 95
    .line 96
    iget-object v0, v8, La/qg20;->v:La/pru;

    .line 97
    .line 98
    iget-object v4, v8, La/qg20;->d:La/mne;

    .line 99
    .line 100
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 105
    .line 106
    iget-object v0, v0, La/gx7;->a:La/gm7;

    .line 107
    .line 108
    iget-boolean v0, v0, La/gm7;->h:Z

    .line 109
    .line 110
    iget-object v6, v8, La/qg20;->i:La/j9c;

    .line 111
    .line 112
    invoke-virtual {v6}, La/j9c;->a()La/q4f;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    sget-object v6, La/q4f;->c:La/q4f;

    .line 117
    .line 118
    const/4 v7, 0x1

    .line 119
    const/4 v9, 0x0

    .line 120
    if-eq v14, v6, :cond_1

    .line 121
    .line 122
    sget-object v6, La/q4f;->d:La/q4f;

    .line 123
    .line 124
    if-eq v14, v6, :cond_1

    .line 125
    .line 126
    sget-object v6, La/q4f;->m:La/q4f;

    .line 127
    .line 128
    if-ne v14, v6, :cond_0

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_0
    move v6, v9

    .line 132
    goto :goto_1

    .line 133
    :cond_1
    :goto_0
    move v6, v7

    .line 134
    :goto_1
    sget-object v10, La/q4f;->m:La/q4f;

    .line 135
    .line 136
    const/4 v11, 0x3

    .line 137
    if-eq v14, v10, :cond_5

    .line 138
    .line 139
    if-eqz v1, :cond_3

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-eqz v10, :cond_3

    .line 146
    .line 147
    :cond_2
    :goto_2
    move v1, v7

    .line 148
    goto :goto_5

    .line 149
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_2

    .line 158
    .line 159
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    check-cast v10, La/m97;

    .line 164
    .line 165
    iget v10, v10, La/m97;->b:I

    .line 166
    .line 167
    sget-object v12, La/uoy;->b:La/tqt;

    .line 168
    .line 169
    if-ne v10, v11, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    :goto_4
    move v1, v9

    .line 173
    goto :goto_5

    .line 174
    :cond_5
    if-eqz v1, :cond_6

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-eqz v10, :cond_6

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_4

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    check-cast v10, La/m97;

    .line 198
    .line 199
    iget v10, v10, La/m97;->b:I

    .line 200
    .line 201
    sget-object v12, La/uoy;->b:La/tqt;

    .line 202
    .line 203
    if-ne v10, v11, :cond_7

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :goto_5
    iget-object v10, v8, La/qg20;->m1:La/p7m0;

    .line 207
    .line 208
    iget-object v11, v8, La/qg20;->E:La/zlt0;

    .line 209
    .line 210
    invoke-virtual {v11}, La/zlt0;->k()Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-eqz v11, :cond_8

    .line 215
    .line 216
    if-eqz v1, :cond_8

    .line 217
    .line 218
    if-eqz v0, :cond_8

    .line 219
    .line 220
    if-eqz v6, :cond_8

    .line 221
    .line 222
    move v0, v7

    .line 223
    goto :goto_6

    .line 224
    :cond_8
    move v0, v9

    .line 225
    :goto_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v10, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    new-instance v0, La/cd20;

    .line 240
    .line 241
    const/4 v1, 0x5

    .line 242
    invoke-direct {v0, v8, v1}, La/cd20;-><init>(La/qg20;B)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v4, La/mne;->b:La/dvj;

    .line 246
    .line 247
    new-instance v6, La/a9u;

    .line 248
    .line 249
    invoke-direct {v6, v8, v2}, La/a9u;-><init>(La/qg20;La/yje;)V

    .line 250
    .line 251
    .line 252
    const/16 v20, 0xa

    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    move-object/from16 v16, v0

    .line 257
    .line 258
    move-object/from16 v18, v1

    .line 259
    .line 260
    move-object/from16 v19, v6

    .line 261
    .line 262
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 263
    .line 264
    .line 265
    iget-object v0, v8, La/qg20;->Q0:La/c4m0;

    .line 266
    .line 267
    if-eqz v0, :cond_9

    .line 268
    .line 269
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 270
    .line 271
    .line 272
    :cond_9
    iget-object v0, v8, La/qg20;->I:La/pv00;

    .line 273
    .line 274
    iget-object v0, v0, La/pv00;->a:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, La/oif0;

    .line 277
    .line 278
    iget-object v0, v0, La/oif0;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, La/lye;

    .line 281
    .line 282
    iget-object v0, v0, La/lye;->m:La/qoj0;

    .line 283
    .line 284
    new-instance v1, La/uf20;

    .line 285
    .line 286
    invoke-direct {v1, v8, v14, v2, v9}, La/uf20;-><init>(La/qg20;La/q4f;La/yje;B)V

    .line 287
    .line 288
    .line 289
    new-instance v6, La/fnq;

    .line 290
    .line 291
    invoke-direct {v6, v0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    new-instance v0, La/uf20;

    .line 295
    .line 296
    invoke-direct {v0, v8, v14, v2, v7}, La/uf20;-><init>(La/qg20;La/q4f;La/yje;B)V

    .line 297
    .line 298
    .line 299
    new-instance v1, La/fnq;

    .line 300
    .line 301
    invoke-direct {v1, v6, v0, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 302
    .line 303
    .line 304
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v6, v4, La/mne;->b:La/dvj;

    .line 309
    .line 310
    invoke-static {v0, v6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    new-instance v6, La/dm10;

    .line 315
    .line 316
    const/4 v12, 0x4

    .line 317
    const/16 v13, 0x1d

    .line 318
    .line 319
    const/4 v7, 0x2

    .line 320
    const-class v9, La/qg20;

    .line 321
    .line 322
    const-string v10, "handleBetBlockChangeError"

    .line 323
    .line 324
    const-string v11, "handleBetBlockChangeError(Ljava/lang/Throwable;)V"

    .line 325
    .line 326
    invoke-direct/range {v6 .. v13}, La/dm10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 327
    .line 328
    .line 329
    invoke-static {v1, v0, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    iput-object v0, v8, La/qg20;->Q0:La/c4m0;

    .line 334
    .line 335
    iget-object v0, v8, La/qg20;->R0:La/c4m0;

    .line 336
    .line 337
    if-eqz v0, :cond_a

    .line 338
    .line 339
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 340
    .line 341
    .line 342
    :cond_a
    iget-object v0, v8, La/qg20;->J:La/ymv;

    .line 343
    .line 344
    iget-object v0, v0, La/ymv;->a:La/oif0;

    .line 345
    .line 346
    iget-object v0, v0, La/oif0;->b:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, La/lye;

    .line 349
    .line 350
    iget-object v0, v0, La/lye;->l:La/qoj0;

    .line 351
    .line 352
    new-instance v1, La/uf20;

    .line 353
    .line 354
    invoke-direct {v1, v8, v14, v2, v3}, La/uf20;-><init>(La/qg20;La/q4f;La/yje;B)V

    .line 355
    .line 356
    .line 357
    new-instance v2, La/fnq;

    .line 358
    .line 359
    invoke-direct {v2, v0, v1, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 360
    .line 361
    .line 362
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iget-object v1, v4, La/mne;->b:La/dvj;

    .line 367
    .line 368
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    new-instance v6, La/vf20;

    .line 373
    .line 374
    const/4 v12, 0x4

    .line 375
    const/4 v13, 0x0

    .line 376
    const/4 v7, 0x2

    .line 377
    const-string v10, "handleBetBlockChangeError"

    .line 378
    .line 379
    const-string v11, "handleBetBlockChangeError(Ljava/lang/Throwable;)V"

    .line 380
    .line 381
    invoke-direct/range {v6 .. v13}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 382
    .line 383
    .line 384
    invoke-static {v2, v0, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iput-object v0, v8, La/qg20;->R0:La/c4m0;

    .line 389
    .line 390
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_2
    iget-object v0, v0, La/jf20;->j:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Ljava/lang/Throwable;

    .line 396
    .line 397
    sget-object v1, La/wne;->a:La/wne;

    .line 398
    .line 399
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    iget-object v1, v4, La/qg20;->t:La/duj;

    .line 403
    .line 404
    new-instance v2, La/ed20;

    .line 405
    .line 406
    invoke-direct {v2, v4, v5}, La/ed20;-><init>(La/qg20;B)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 410
    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
