.class public final La/wk20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:B

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/io/Serializable;

.field public p:Ljava/lang/Object;

.field public final synthetic q:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;La/yje;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/wk20;->i:B

    iput-object p1, p0, La/wk20;->q:La/diu0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/pun0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/wk20;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/wk20;->j:Z

    .line 5
    .line 6
    iput-object p2, p0, La/wk20;->q:La/diu0;

    .line 7
    .line 8
    invoke-direct {p0, v0, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wk20;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/wk20;->q:La/diu0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wk20;

    .line 9
    .line 10
    iget-boolean p0, p0, La/wk20;->j:Z

    .line 11
    .line 12
    check-cast v0, La/pun0;

    .line 13
    .line 14
    invoke-direct {p1, p0, v0, p2}, La/wk20;-><init>(ZLa/pun0;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p0, La/wk20;

    .line 19
    .line 20
    check-cast v0, La/xd70;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-direct {p0, v0, p2, p1}, La/wk20;-><init>(La/diu0;La/yje;B)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    new-instance p0, La/wk20;

    .line 28
    .line 29
    check-cast v0, La/mn20;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-direct {p0, v0, p2, p1}, La/wk20;-><init>(La/diu0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    nop

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
    iget-byte v0, p0, La/wk20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wk20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wk20;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wk20;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 49

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/wk20;->i:B

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    const/4 v2, 0x4

    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v4, v5, La/wk20;->q:La/diu0;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x3

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-boolean v0, v5, La/wk20;->j:Z

    .line 20
    .line 21
    check-cast v4, La/pun0;

    .line 22
    .line 23
    iget-object v1, v4, La/pun0;->v:La/xae0;

    .line 24
    .line 25
    sget-object v2, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-byte v11, v5, La/wk20;->k:B

    .line 28
    .line 29
    if-eqz v11, :cond_3

    .line 30
    .line 31
    if-eq v11, v6, :cond_2

    .line 32
    .line 33
    if-eq v11, v8, :cond_1

    .line 34
    .line 35
    if-ne v11, v9, :cond_0

    .line 36
    .line 37
    iget-object v2, v5, La/wk20;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La/ql5;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v5, p1

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_e

    .line 52
    .line 53
    :cond_1
    iget-object v3, v5, La/wk20;->p:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, La/p7m0;

    .line 56
    .line 57
    iget-object v8, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 58
    .line 59
    check-cast v8, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v11, v5, La/wk20;->n:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v11, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v12, v5, La/wk20;->m:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v12, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v13, v5, La/wk20;->l:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v13, La/ql5;

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object v14, v11

    .line 77
    move-object v11, v3

    .line 78
    move-object v3, v13

    .line 79
    move-object v13, v14

    .line 80
    move-object v14, v8

    .line 81
    move-object/from16 v8, p1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object/from16 v3, p1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    iget-object v3, v4, La/pun0;->l:La/rrc;

    .line 96
    .line 97
    invoke-virtual {v3}, La/rrc;->E()V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-object v3, v4, La/pun0;->m:La/khf0;

    .line 101
    .line 102
    sget-object v11, La/bm5;->j:La/bm5;

    .line 103
    .line 104
    iput-byte v6, v5, La/wk20;->k:B

    .line 105
    .line 106
    invoke-static {v3, v11, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-ne v3, v2, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    :goto_0
    check-cast v3, La/ql5;

    .line 114
    .line 115
    iget-object v11, v4, La/pun0;->n:La/ot;

    .line 116
    .line 117
    sget-object v12, La/bm5;->j:La/bm5;

    .line 118
    .line 119
    invoke-virtual {v11, v12, v3}, La/ot;->a(La/bm5;La/ql5;)V

    .line 120
    .line 121
    .line 122
    iget-object v11, v4, La/pun0;->x:La/p7m0;

    .line 123
    .line 124
    sget-object v12, La/pn40;->a:La/pn40;

    .line 125
    .line 126
    iget-wide v12, v3, La/ql5;->b:D

    .line 127
    .line 128
    sget-object v14, La/p3u0;->c:La/p3u0;

    .line 129
    .line 130
    invoke-static {v12, v13, v14}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    iget-object v13, v3, La/ql5;->f:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v14, v3, La/ql5;->k:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v15, v4, La/pun0;->b:La/mrt;

    .line 139
    .line 140
    iput-object v3, v5, La/wk20;->l:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v12, v5, La/wk20;->m:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v13, v5, La/wk20;->n:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v14, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 147
    .line 148
    iput-object v11, v5, La/wk20;->p:Ljava/lang/Object;

    .line 149
    .line 150
    iput-byte v8, v5, La/wk20;->k:B

    .line 151
    .line 152
    invoke-virtual {v15, v5}, La/mrt;->a(La/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    if-ne v8, v2, :cond_6

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    :goto_1
    check-cast v8, Ljava/lang/Boolean;

    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_7

    .line 166
    .line 167
    iget-object v8, v4, La/pun0;->g:La/eqx;

    .line 168
    .line 169
    iget-object v8, v8, La/eqx;->a:La/b3c0;

    .line 170
    .line 171
    invoke-virtual {v8}, La/b3c0;->c()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_7

    .line 176
    .line 177
    move v8, v6

    .line 178
    goto :goto_2

    .line 179
    :cond_7
    move v8, v7

    .line 180
    :goto_2
    new-instance v15, La/hun0;

    .line 181
    .line 182
    invoke-direct {v15, v12, v13, v14, v8}, La/hun0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11, v10, v15}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    iget-object v8, v4, La/pun0;->o:La/m0u;

    .line 192
    .line 193
    iget-wide v11, v3, La/ql5;->e:J

    .line 194
    .line 195
    iput-object v3, v5, La/wk20;->l:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v10, v5, La/wk20;->m:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v10, v5, La/wk20;->n:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v10, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 202
    .line 203
    iput-object v10, v5, La/wk20;->p:Ljava/lang/Object;

    .line 204
    .line 205
    iput-byte v9, v5, La/wk20;->k:B

    .line 206
    .line 207
    iget-object v8, v8, La/m0u;->a:La/xr;

    .line 208
    .line 209
    invoke-virtual {v8, v11, v12, v5}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    if-ne v5, v2, :cond_8

    .line 214
    .line 215
    :goto_3
    move-object v10, v2

    .line 216
    goto/16 :goto_e

    .line 217
    .line 218
    :cond_8
    move-object v2, v3

    .line 219
    :goto_4
    check-cast v5, La/xuf;

    .line 220
    .line 221
    iget-object v3, v4, La/pun0;->f:La/rqt;

    .line 222
    .line 223
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {v5}, La/rqt;->e(La/xuf;)La/tg20;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    iget-wide v8, v5, La/xuf;->i:D

    .line 231
    .line 232
    iget-wide v11, v3, La/tg20;->a:D

    .line 233
    .line 234
    iget-wide v13, v3, La/tg20;->b:D

    .line 235
    .line 236
    iget-object v5, v1, La/xae0;->a:La/n7m0;

    .line 237
    .line 238
    invoke-interface {v5}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 243
    .line 244
    iget-object v5, v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 245
    .line 246
    iget-object v5, v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->a:Ljava/lang/String;

    .line 247
    .line 248
    if-eqz v5, :cond_9

    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-nez v5, :cond_9

    .line 255
    .line 256
    move v5, v6

    .line 257
    goto :goto_5

    .line 258
    :cond_9
    move v5, v7

    .line 259
    :goto_5
    if-nez v0, :cond_a

    .line 260
    .line 261
    iget-object v15, v1, La/xae0;->a:La/n7m0;

    .line 262
    .line 263
    invoke-interface {v15}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v15

    .line 267
    check-cast v15, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 268
    .line 269
    iget-object v15, v15, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 270
    .line 271
    iget-object v15, v15, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->a:Ljava/lang/String;

    .line 272
    .line 273
    if-eqz v15, :cond_a

    .line 274
    .line 275
    iget-object v1, v1, La/xae0;->a:La/n7m0;

    .line 276
    .line 277
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 282
    .line 283
    iget-object v1, v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 284
    .line 285
    move-wide/from16 v16, v11

    .line 286
    .line 287
    iget-wide v10, v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_a
    move-wide/from16 v16, v11

    .line 291
    .line 292
    iget-object v1, v4, La/pun0;->k:La/xsu;

    .line 293
    .line 294
    iget-object v1, v1, La/xsu;->a:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v1, La/dpi0;

    .line 297
    .line 298
    iget-object v1, v1, La/dpi0;->a:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v1, La/xxn0;

    .line 301
    .line 302
    iget-object v1, v1, La/xxn0;->a:La/p7m0;

    .line 303
    .line 304
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, La/jsn0;

    .line 309
    .line 310
    iget-wide v10, v1, La/jsn0;->a:D

    .line 311
    .line 312
    :goto_6
    if-eqz v0, :cond_b

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_b
    const-wide/16 v18, 0x0

    .line 316
    .line 317
    cmpg-double v1, v10, v18

    .line 318
    .line 319
    if-gtz v1, :cond_c

    .line 320
    .line 321
    :goto_7
    move-wide/from16 v10, v16

    .line 322
    .line 323
    :cond_c
    cmpl-double v1, v10, v8

    .line 324
    .line 325
    if-lez v1, :cond_d

    .line 326
    .line 327
    move/from16 v23, v6

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_d
    move/from16 v23, v7

    .line 331
    .line 332
    :goto_8
    iget-boolean v12, v3, La/tg20;->c:Z

    .line 333
    .line 334
    iget-object v15, v4, La/pun0;->i:La/vzg0;

    .line 335
    .line 336
    move-wide/from16 v18, v10

    .line 337
    .line 338
    new-instance v11, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 339
    .line 340
    move/from16 v25, v12

    .line 341
    .line 342
    move-wide/from16 v20, v18

    .line 343
    .line 344
    move-wide/from16 v18, v13

    .line 345
    .line 346
    iget-wide v12, v2, La/ql5;->a:J

    .line 347
    .line 348
    new-instance v14, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 349
    .line 350
    if-eqz v5, :cond_e

    .line 351
    .line 352
    const-string v5, ""

    .line 353
    .line 354
    goto :goto_9

    .line 355
    :cond_e
    invoke-static/range {v20 .. v21}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    :goto_9
    invoke-direct {v14, v5}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    iget-object v5, v2, La/ql5;->f:Ljava/lang/String;

    .line 363
    .line 364
    const-wide v26, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    cmpg-double v10, v20, v26

    .line 370
    .line 371
    if-gez v10, :cond_f

    .line 372
    .line 373
    move/from16 v24, v6

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_f
    move/from16 v24, v7

    .line 377
    .line 378
    :goto_a
    if-ltz v1, :cond_10

    .line 379
    .line 380
    move/from16 v26, v6

    .line 381
    .line 382
    goto :goto_b

    .line 383
    :cond_10
    move/from16 v26, v7

    .line 384
    .line 385
    :goto_b
    iget-boolean v1, v3, La/tg20;->d:Z

    .line 386
    .line 387
    iget-object v3, v4, La/pun0;->u:La/ctf0;

    .line 388
    .line 389
    sget-object v10, La/pn40;->a:La/pn40;

    .line 390
    .line 391
    sget-object v10, La/p3u0;->c:La/p3u0;

    .line 392
    .line 393
    invoke-static {v8, v9, v5, v10}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v10

    .line 397
    invoke-static {}, La/cy7;->c()Z

    .line 398
    .line 399
    .line 400
    move-result v22

    .line 401
    if-eqz v22, :cond_11

    .line 402
    .line 403
    new-instance v6, Landroid/text/SpannableStringBuilder;

    .line 404
    .line 405
    invoke-direct {v6}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    move/from16 v29, v0

    .line 409
    .line 410
    sget-object v0, La/by7;->e:La/by7;

    .line 411
    .line 412
    invoke-virtual {v0, v10}, La/by7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    new-array v10, v7, [Ljava/lang/Object;

    .line 417
    .line 418
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 419
    .line 420
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    const v10, 0x7f130d1e

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-virtual {v6, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v6, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 435
    .line 436
    .line 437
    :goto_c
    move-object/from16 v28, v6

    .line 438
    .line 439
    move-object v0, v15

    .line 440
    goto :goto_d

    .line 441
    :cond_11
    move/from16 v29, v0

    .line 442
    .line 443
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 448
    .line 449
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    const v6, 0x7f13052f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    goto :goto_c

    .line 461
    :goto_d
    const/4 v15, 0x0

    .line 462
    move-object v3, v0

    .line 463
    move/from16 v27, v1

    .line 464
    .line 465
    move-object/from16 v22, v5

    .line 466
    .line 467
    move-wide/from16 v0, v20

    .line 468
    .line 469
    move-wide/from16 v20, v8

    .line 470
    .line 471
    invoke-direct/range {v11 .. v28}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;-><init>(JLorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;ZDDDLjava/lang/String;ZZZZZLjava/lang/CharSequence;)V

    .line 472
    .line 473
    .line 474
    const-string v5, "UI_STATE_KEY"

    .line 475
    .line 476
    invoke-virtual {v3, v5, v11}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    if-eqz v29, :cond_12

    .line 480
    .line 481
    iget-object v3, v4, La/pun0;->j:La/epi0;

    .line 482
    .line 483
    iget-wide v4, v2, La/ql5;->a:J

    .line 484
    .line 485
    iget-object v2, v3, La/epi0;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v2, La/dpi0;

    .line 488
    .line 489
    iget-object v2, v2, La/dpi0;->a:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v2, La/xxn0;

    .line 492
    .line 493
    iget-object v2, v2, La/xxn0;->a:La/p7m0;

    .line 494
    .line 495
    new-instance v3, La/jsn0;

    .line 496
    .line 497
    invoke-direct {v3, v0, v1, v4, v5}, La/jsn0;-><init>(DJ)V

    .line 498
    .line 499
    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-virtual {v2, v0, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    :cond_12
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    :goto_e
    return-object v10

    .line 507
    :pswitch_0
    move-object v10, v4

    .line 508
    check-cast v10, La/xd70;

    .line 509
    .line 510
    iget-object v11, v10, La/i3t0;->i:La/ocj;

    .line 511
    .line 512
    sget-object v12, La/wne;->a:La/wne;

    .line 513
    .line 514
    iget-byte v0, v5, La/wk20;->k:B

    .line 515
    .line 516
    packed-switch v0, :pswitch_data_1

    .line 517
    .line 518
    .line 519
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    const/4 v10, 0x0

    .line 523
    goto/16 :goto_1e

    .line 524
    .line 525
    :pswitch_1
    iget-object v0, v5, La/wk20;->n:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v0, La/c5v0;

    .line 528
    .line 529
    iget-object v1, v5, La/wk20;->m:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v1, La/xd70;

    .line 532
    .line 533
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    move-object v2, v1

    .line 537
    move-object/from16 v1, p1

    .line 538
    .line 539
    goto/16 :goto_1c

    .line 540
    .line 541
    :pswitch_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    goto/16 :goto_1d

    .line 545
    .line 546
    :pswitch_3
    iget-boolean v0, v5, La/wk20;->j:Z

    .line 547
    .line 548
    iget-object v1, v5, La/wk20;->l:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v1, La/ql5;

    .line 551
    .line 552
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    move v3, v0

    .line 556
    move-object v13, v1

    .line 557
    move-object/from16 v0, p1

    .line 558
    .line 559
    goto/16 :goto_17

    .line 560
    .line 561
    :pswitch_4
    iget-boolean v0, v5, La/wk20;->j:Z

    .line 562
    .line 563
    iget-object v2, v5, La/wk20;->p:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v2, La/e5c;

    .line 566
    .line 567
    iget-object v3, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 568
    .line 569
    check-cast v3, La/csr;

    .line 570
    .line 571
    iget-object v4, v5, La/wk20;->n:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v4, La/ql5;

    .line 574
    .line 575
    iget-object v8, v5, La/wk20;->m:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v8, La/l6v;

    .line 578
    .line 579
    iget-object v9, v5, La/wk20;->l:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v9, La/ql5;

    .line 582
    .line 583
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    move-object v13, v9

    .line 587
    move-object v9, v8

    .line 588
    move-object v8, v4

    .line 589
    move-object v4, v3

    .line 590
    move-object v3, v2

    .line 591
    move-object/from16 v2, p1

    .line 592
    .line 593
    goto/16 :goto_13

    .line 594
    .line 595
    :pswitch_5
    iget-boolean v0, v5, La/wk20;->j:Z

    .line 596
    .line 597
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    move v14, v0

    .line 601
    move-object/from16 v0, p1

    .line 602
    .line 603
    goto/16 :goto_12

    .line 604
    .line 605
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    move-object/from16 v0, p1

    .line 609
    .line 610
    goto :goto_10

    .line 611
    :pswitch_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    goto :goto_f

    .line 615
    :pswitch_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    iget-object v0, v10, La/xd70;->z0:La/bby;

    .line 619
    .line 620
    if-eqz v0, :cond_13

    .line 621
    .line 622
    iput-byte v6, v5, La/wk20;->k:B

    .line 623
    .line 624
    invoke-interface {v0, v5}, La/bby;->join(La/yje;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    if-ne v0, v12, :cond_13

    .line 629
    .line 630
    goto/16 :goto_1b

    .line 631
    .line 632
    :cond_13
    :goto_f
    iget-object v0, v10, La/xd70;->S:La/z7z;

    .line 633
    .line 634
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    check-cast v0, La/z4u;

    .line 639
    .line 640
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    check-cast v3, La/xb70;

    .line 645
    .line 646
    iget-object v3, v3, La/xb70;->n:La/fa70;

    .line 647
    .line 648
    iget-wide v3, v3, La/fa70;->e:J

    .line 649
    .line 650
    iput-byte v8, v5, La/wk20;->k:B

    .line 651
    .line 652
    invoke-virtual {v0, v3, v4, v5}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    if-ne v0, v12, :cond_14

    .line 657
    .line 658
    goto/16 :goto_1b

    .line 659
    .line 660
    :cond_14
    :goto_10
    check-cast v0, Ljava/lang/Boolean;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 663
    .line 664
    .line 665
    move-result v14

    .line 666
    sget v0, La/xd70;->B0:I

    .line 667
    .line 668
    iget-object v0, v11, La/ocj;->a:La/p7m0;

    .line 669
    .line 670
    :cond_15
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    move-object v4, v3

    .line 678
    check-cast v4, La/xb70;

    .line 679
    .line 680
    iget-object v13, v4, La/xb70;->o:La/f970;

    .line 681
    .line 682
    const/16 v21, 0x0

    .line 683
    .line 684
    const/16 v22, 0x7e

    .line 685
    .line 686
    const/4 v15, 0x0

    .line 687
    const/16 v16, 0x0

    .line 688
    .line 689
    const-wide/16 v17, 0x0

    .line 690
    .line 691
    const/16 v19, 0x0

    .line 692
    .line 693
    const/16 v20, 0x0

    .line 694
    .line 695
    invoke-static/range {v13 .. v22}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 696
    .line 697
    .line 698
    move-result-object v44

    .line 699
    const/16 v46, 0x0

    .line 700
    .line 701
    const v47, 0x1bfff

    .line 702
    .line 703
    .line 704
    const/16 v30, 0x0

    .line 705
    .line 706
    const/16 v31, 0x0

    .line 707
    .line 708
    const/16 v32, 0x0

    .line 709
    .line 710
    const/16 v33, 0x0

    .line 711
    .line 712
    const/16 v34, 0x0

    .line 713
    .line 714
    const/16 v35, 0x0

    .line 715
    .line 716
    const/16 v36, 0x0

    .line 717
    .line 718
    const/16 v37, 0x0

    .line 719
    .line 720
    const/16 v38, 0x0

    .line 721
    .line 722
    const/16 v39, 0x0

    .line 723
    .line 724
    const/16 v40, 0x0

    .line 725
    .line 726
    const/16 v41, 0x0

    .line 727
    .line 728
    const/16 v42, 0x0

    .line 729
    .line 730
    const/16 v43, 0x0

    .line 731
    .line 732
    const/16 v45, 0x0

    .line 733
    .line 734
    move-object/from16 v29, v4

    .line 735
    .line 736
    invoke-static/range {v29 .. v47}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    invoke-virtual {v0, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v3

    .line 744
    if-eqz v3, :cond_15

    .line 745
    .line 746
    iput-boolean v14, v5, La/wk20;->j:Z

    .line 747
    .line 748
    iput-byte v9, v5, La/wk20;->k:B

    .line 749
    .line 750
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    check-cast v0, La/xb70;

    .line 755
    .line 756
    iget-object v0, v0, La/xb70;->q:La/z870;

    .line 757
    .line 758
    iget-object v0, v0, La/z870;->e:La/ql5;

    .line 759
    .line 760
    iget-wide v3, v0, La/ql5;->a:J

    .line 761
    .line 762
    const-wide/16 v8, -0x2

    .line 763
    .line 764
    cmp-long v0, v3, v8

    .line 765
    .line 766
    if-nez v0, :cond_16

    .line 767
    .line 768
    iget-object v0, v10, La/xd70;->H:La/z7z;

    .line 769
    .line 770
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    check-cast v0, La/ahu;

    .line 775
    .line 776
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    check-cast v3, La/xb70;

    .line 781
    .line 782
    iget-object v3, v3, La/xb70;->q:La/z870;

    .line 783
    .line 784
    iget-object v3, v3, La/z870;->b:La/bm5;

    .line 785
    .line 786
    invoke-virtual {v0, v3, v5}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    goto :goto_11

    .line 791
    :cond_16
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    check-cast v0, La/xb70;

    .line 796
    .line 797
    iget-object v0, v0, La/xb70;->q:La/z870;

    .line 798
    .line 799
    iget-object v0, v0, La/z870;->e:La/ql5;

    .line 800
    .line 801
    :goto_11
    if-ne v0, v12, :cond_17

    .line 802
    .line 803
    goto/16 :goto_1b

    .line 804
    .line 805
    :cond_17
    :goto_12
    move-object v4, v0

    .line 806
    check-cast v4, La/ql5;

    .line 807
    .line 808
    iget-object v0, v10, La/xd70;->T:La/z7z;

    .line 809
    .line 810
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    move-object v8, v0

    .line 815
    check-cast v8, La/l6v;

    .line 816
    .line 817
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    check-cast v0, La/xb70;

    .line 822
    .line 823
    iget-object v0, v0, La/xb70;->p:La/c970;

    .line 824
    .line 825
    iget-object v3, v0, La/c970;->b:La/csr;

    .line 826
    .line 827
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    check-cast v0, La/xb70;

    .line 832
    .line 833
    iget-boolean v0, v0, La/xb70;->h:Z

    .line 834
    .line 835
    if-eqz v0, :cond_1a

    .line 836
    .line 837
    iget-object v0, v10, La/xd70;->U:La/z7z;

    .line 838
    .line 839
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    check-cast v0, La/e5c;

    .line 844
    .line 845
    iget-object v9, v10, La/xd70;->N:La/z7z;

    .line 846
    .line 847
    invoke-interface {v9}, La/z7z;->get()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v9

    .line 851
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    check-cast v9, La/urt;

    .line 855
    .line 856
    iput-object v4, v5, La/wk20;->l:Ljava/lang/Object;

    .line 857
    .line 858
    iput-object v8, v5, La/wk20;->m:Ljava/lang/Object;

    .line 859
    .line 860
    iput-object v4, v5, La/wk20;->n:Ljava/lang/Object;

    .line 861
    .line 862
    iput-object v3, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 863
    .line 864
    iput-object v0, v5, La/wk20;->p:Ljava/lang/Object;

    .line 865
    .line 866
    iput-boolean v14, v5, La/wk20;->j:Z

    .line 867
    .line 868
    iput-byte v2, v5, La/wk20;->k:B

    .line 869
    .line 870
    invoke-static {v9, v5}, La/urt;->a(La/urt;La/zje;)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    if-ne v2, v12, :cond_18

    .line 875
    .line 876
    goto/16 :goto_1b

    .line 877
    .line 878
    :cond_18
    move-object v13, v4

    .line 879
    move-object v9, v8

    .line 880
    move-object v4, v3

    .line 881
    move-object v8, v13

    .line 882
    move-object v3, v0

    .line 883
    move v0, v14

    .line 884
    :goto_13
    check-cast v2, Ljava/util/List;

    .line 885
    .line 886
    invoke-virtual {v3, v2}, La/e5c;->a(Ljava/util/List;)Z

    .line 887
    .line 888
    .line 889
    move-result v2

    .line 890
    move v14, v0

    .line 891
    if-eqz v2, :cond_19

    .line 892
    .line 893
    move-object v2, v4

    .line 894
    move v4, v6

    .line 895
    :goto_14
    move-object v0, v9

    .line 896
    goto :goto_16

    .line 897
    :cond_19
    move-object v3, v4

    .line 898
    move-object v4, v13

    .line 899
    goto :goto_15

    .line 900
    :cond_1a
    move-object v9, v8

    .line 901
    move-object v8, v4

    .line 902
    :goto_15
    move-object v2, v3

    .line 903
    move-object v13, v4

    .line 904
    move v4, v7

    .line 905
    goto :goto_14

    .line 906
    :goto_16
    iput-object v13, v5, La/wk20;->l:Ljava/lang/Object;

    .line 907
    .line 908
    const/4 v3, 0x0

    .line 909
    iput-object v3, v5, La/wk20;->m:Ljava/lang/Object;

    .line 910
    .line 911
    iput-object v3, v5, La/wk20;->n:Ljava/lang/Object;

    .line 912
    .line 913
    iput-object v3, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 914
    .line 915
    iput-object v3, v5, La/wk20;->p:Ljava/lang/Object;

    .line 916
    .line 917
    iput-boolean v14, v5, La/wk20;->j:Z

    .line 918
    .line 919
    iput-byte v1, v5, La/wk20;->k:B

    .line 920
    .line 921
    const/4 v3, 0x0

    .line 922
    move-object v1, v8

    .line 923
    invoke-virtual/range {v0 .. v5}, La/l6v;->a(La/ql5;La/csr;ZZLa/zje;)Ljava/lang/Enum;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    if-ne v0, v12, :cond_1b

    .line 928
    .line 929
    goto/16 :goto_1b

    .line 930
    .line 931
    :cond_1b
    move v3, v14

    .line 932
    :goto_17
    check-cast v0, La/w870;

    .line 933
    .line 934
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    sget-object v1, La/w870;->h:La/w870;

    .line 938
    .line 939
    if-ne v0, v1, :cond_1c

    .line 940
    .line 941
    move v0, v6

    .line 942
    goto :goto_18

    .line 943
    :cond_1c
    move v0, v7

    .line 944
    :goto_18
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    check-cast v1, La/xb70;

    .line 949
    .line 950
    iget-boolean v1, v1, La/xb70;->d:Z

    .line 951
    .line 952
    if-nez v1, :cond_1d

    .line 953
    .line 954
    sget-object v0, La/ua70;->a:La/ua70;

    .line 955
    .line 956
    invoke-virtual {v10, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_1d

    .line 960
    .line 961
    :cond_1d
    if-nez v0, :cond_1e

    .line 962
    .line 963
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    check-cast v0, La/xb70;

    .line 968
    .line 969
    iget-object v0, v0, La/xb70;->p:La/c970;

    .line 970
    .line 971
    iget-object v0, v0, La/c970;->b:La/csr;

    .line 972
    .line 973
    const/4 v1, 0x0

    .line 974
    iput-object v1, v5, La/wk20;->l:Ljava/lang/Object;

    .line 975
    .line 976
    iput-boolean v3, v5, La/wk20;->j:Z

    .line 977
    .line 978
    const/4 v1, 0x6

    .line 979
    iput-byte v1, v5, La/wk20;->k:B

    .line 980
    .line 981
    invoke-virtual {v10, v0, v13, v5}, La/xd70;->u0(La/csr;La/ql5;La/zje;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    if-ne v0, v12, :cond_23

    .line 986
    .line 987
    goto/16 :goto_1b

    .line 988
    .line 989
    :cond_1e
    iget-object v4, v11, La/ocj;->a:La/p7m0;

    .line 990
    .line 991
    :cond_1f
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    move-object v1, v0

    .line 999
    check-cast v1, La/xb70;

    .line 1000
    .line 1001
    iget v2, v1, La/xb70;->l:I

    .line 1002
    .line 1003
    add-int/lit8 v41, v2, 0x1

    .line 1004
    .line 1005
    const/16 v46, 0x0

    .line 1006
    .line 1007
    const v47, 0x1f7ff

    .line 1008
    .line 1009
    .line 1010
    const/16 v30, 0x0

    .line 1011
    .line 1012
    const/16 v31, 0x0

    .line 1013
    .line 1014
    const/16 v32, 0x0

    .line 1015
    .line 1016
    const/16 v33, 0x0

    .line 1017
    .line 1018
    const/16 v34, 0x0

    .line 1019
    .line 1020
    const/16 v35, 0x0

    .line 1021
    .line 1022
    const/16 v36, 0x0

    .line 1023
    .line 1024
    const/16 v37, 0x0

    .line 1025
    .line 1026
    const/16 v38, 0x0

    .line 1027
    .line 1028
    const/16 v39, 0x0

    .line 1029
    .line 1030
    const/16 v40, 0x0

    .line 1031
    .line 1032
    const/16 v42, 0x0

    .line 1033
    .line 1034
    const/16 v43, 0x0

    .line 1035
    .line 1036
    const/16 v44, 0x0

    .line 1037
    .line 1038
    const/16 v45, 0x0

    .line 1039
    .line 1040
    move-object/from16 v29, v1

    .line 1041
    .line 1042
    invoke-static/range {v29 .. v47}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    if-eqz v0, :cond_1f

    .line 1051
    .line 1052
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    check-cast v0, La/xb70;

    .line 1057
    .line 1058
    iget-object v0, v0, La/xb70;->c:La/c5v0;

    .line 1059
    .line 1060
    iget-object v1, v10, La/xd70;->P:La/z7z;

    .line 1061
    .line 1062
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    check-cast v1, La/m6v;

    .line 1067
    .line 1068
    iget-wide v8, v13, La/ql5;->a:J

    .line 1069
    .line 1070
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    check-cast v2, La/xb70;

    .line 1075
    .line 1076
    iget-object v2, v2, La/xb70;->p:La/c970;

    .line 1077
    .line 1078
    iget-object v2, v2, La/c970;->b:La/csr;

    .line 1079
    .line 1080
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v4

    .line 1084
    check-cast v4, La/xb70;

    .line 1085
    .line 1086
    iget-object v4, v4, La/xb70;->b:Ljava/lang/String;

    .line 1087
    .line 1088
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v11

    .line 1092
    check-cast v11, La/xb70;

    .line 1093
    .line 1094
    iget-object v11, v11, La/xb70;->o:La/f970;

    .line 1095
    .line 1096
    iget-boolean v11, v11, La/f970;->b:Z

    .line 1097
    .line 1098
    const/4 v13, 0x0

    .line 1099
    iput-object v13, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1100
    .line 1101
    iput-object v10, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1102
    .line 1103
    iput-object v0, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1104
    .line 1105
    iput-boolean v3, v5, La/wk20;->j:Z

    .line 1106
    .line 1107
    const/4 v3, 0x7

    .line 1108
    iput-byte v3, v5, La/wk20;->k:B

    .line 1109
    .line 1110
    iget-object v3, v1, La/m6v;->a:La/bzu;

    .line 1111
    .line 1112
    if-nez v11, :cond_21

    .line 1113
    .line 1114
    iget-object v11, v1, La/m6v;->c:La/k9c;

    .line 1115
    .line 1116
    invoke-virtual {v11}, La/k9c;->a()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v11

    .line 1120
    if-nez v11, :cond_20

    .line 1121
    .line 1122
    goto :goto_19

    .line 1123
    :cond_20
    move/from16 v20, v7

    .line 1124
    .line 1125
    goto :goto_1a

    .line 1126
    :cond_21
    :goto_19
    move/from16 v20, v6

    .line 1127
    .line 1128
    :goto_1a
    iget-object v1, v1, La/m6v;->b:La/ntu;

    .line 1129
    .line 1130
    invoke-virtual {v1}, La/ntu;->a()Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v21

    .line 1134
    iget-object v1, v3, La/bzu;->b:Ljava/lang/Object;

    .line 1135
    .line 1136
    move-object v15, v1

    .line 1137
    check-cast v15, La/h3v0;

    .line 1138
    .line 1139
    iget-object v1, v15, La/h3v0;->b:La/s2v0;

    .line 1140
    .line 1141
    iget-wide v13, v1, La/s2v0;->a:J

    .line 1142
    .line 1143
    iget-object v1, v15, La/h3v0;->c:La/mne;

    .line 1144
    .line 1145
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 1146
    .line 1147
    move-wide/from16 v16, v13

    .line 1148
    .line 1149
    new-instance v14, La/eh1;

    .line 1150
    .line 1151
    const/16 v24, 0x0

    .line 1152
    .line 1153
    move-object/from16 v22, v2

    .line 1154
    .line 1155
    move-object/from16 v23, v4

    .line 1156
    .line 1157
    move-wide/from16 v18, v8

    .line 1158
    .line 1159
    invoke-direct/range {v14 .. v24}, La/eh1;-><init>(La/h3v0;JJZLjava/lang/String;La/csr;Ljava/lang/String;La/yje;)V

    .line 1160
    .line 1161
    .line 1162
    invoke-static {v1, v14, v5}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    if-ne v1, v12, :cond_22

    .line 1167
    .line 1168
    :goto_1b
    move-object v10, v12

    .line 1169
    goto/16 :goto_1e

    .line 1170
    .line 1171
    :cond_22
    move-object v2, v10

    .line 1172
    :goto_1c
    check-cast v1, Ljava/lang/String;

    .line 1173
    .line 1174
    iget-object v3, v10, La/xd70;->Q:La/z7z;

    .line 1175
    .line 1176
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v3

    .line 1180
    check-cast v3, La/n6v;

    .line 1181
    .line 1182
    iget-object v3, v3, La/n6v;->a:La/h3v0;

    .line 1183
    .line 1184
    iget-object v4, v3, La/h3v0;->e:La/knf0;

    .line 1185
    .line 1186
    invoke-virtual {v4}, La/knf0;->a()Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v5

    .line 1190
    new-instance v7, Lkotlin/Pair;

    .line 1191
    .line 1192
    const-string v8, "AppGuid"

    .line 1193
    .line 1194
    invoke-direct {v7, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    const/16 v5, 0x16

    .line 1198
    .line 1199
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v5

    .line 1203
    new-instance v8, Lkotlin/Pair;

    .line 1204
    .line 1205
    const-string v9, "X-Whence"

    .line 1206
    .line 1207
    invoke-direct {v8, v9, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v5

    .line 1214
    new-instance v9, Lkotlin/Pair;

    .line 1215
    .line 1216
    const-string v6, "X-Referral"

    .line 1217
    .line 1218
    invoke-direct {v9, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v5

    .line 1225
    new-instance v10, Lkotlin/Pair;

    .line 1226
    .line 1227
    const-string v6, "X-Language"

    .line 1228
    .line 1229
    invoke-direct {v10, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    const/16 v5, 0x54d

    .line 1233
    .line 1234
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v5

    .line 1238
    new-instance v11, Lkotlin/Pair;

    .line 1239
    .line 1240
    const-string v6, "X-Group"

    .line 1241
    .line 1242
    invoke-direct {v11, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    iget-object v5, v3, La/h3v0;->f:La/us3;

    .line 1246
    .line 1247
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    new-instance v12, Lkotlin/Pair;

    .line 1251
    .line 1252
    const-string v5, "X-BundleId"

    .line 1253
    .line 1254
    const-string v6, "org.xbet.client1"

    .line 1255
    .line 1256
    invoke-direct {v12, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v4}, La/knf0;->b()I

    .line 1260
    .line 1261
    .line 1262
    move-result v4

    .line 1263
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v4

    .line 1267
    new-instance v13, Lkotlin/Pair;

    .line 1268
    .line 1269
    const-string v5, "X-FCountry"

    .line 1270
    .line 1271
    invoke-direct {v13, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1272
    .line 1273
    .line 1274
    iget-object v3, v3, La/h3v0;->g:La/tgk;

    .line 1275
    .line 1276
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1277
    .line 1278
    .line 1279
    invoke-static {}, La/tgk;->c()Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v3

    .line 1283
    new-instance v14, Lkotlin/Pair;

    .line 1284
    .line 1285
    const-string v4, "X-DeviceModel"

    .line 1286
    .line 1287
    invoke-direct {v14, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1288
    .line 1289
    .line 1290
    filled-new-array/range {v7 .. v14}, [Lkotlin/Pair;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v3

    .line 1294
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v3

    .line 1298
    new-instance v4, La/tb70;

    .line 1299
    .line 1300
    invoke-direct {v4, v0, v1, v3}, La/tb70;-><init>(La/c5v0;Ljava/lang/String;Ljava/util/Map;)V

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v2, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1304
    .line 1305
    .line 1306
    :cond_23
    :goto_1d
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1307
    .line 1308
    :goto_1e
    return-object v10

    .line 1309
    :pswitch_9
    check-cast v4, La/mn20;

    .line 1310
    .line 1311
    sget-object v0, La/wne;->a:La/wne;

    .line 1312
    .line 1313
    iget-byte v10, v5, La/wk20;->k:B

    .line 1314
    .line 1315
    if-eqz v10, :cond_29

    .line 1316
    .line 1317
    if-eq v10, v6, :cond_28

    .line 1318
    .line 1319
    if-eq v10, v8, :cond_27

    .line 1320
    .line 1321
    if-eq v10, v9, :cond_26

    .line 1322
    .line 1323
    if-eq v10, v2, :cond_25

    .line 1324
    .line 1325
    if-ne v10, v1, :cond_24

    .line 1326
    .line 1327
    iget-boolean v0, v5, La/wk20;->j:Z

    .line 1328
    .line 1329
    iget-object v1, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 1330
    .line 1331
    check-cast v1, Ljava/lang/String;

    .line 1332
    .line 1333
    iget-object v2, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1334
    .line 1335
    check-cast v2, Ljava/lang/String;

    .line 1336
    .line 1337
    iget-object v3, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1338
    .line 1339
    check-cast v3, Ljava/lang/String;

    .line 1340
    .line 1341
    iget-object v5, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v5, La/qz40;

    .line 1344
    .line 1345
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1346
    .line 1347
    .line 1348
    move v9, v0

    .line 1349
    move-object v8, v1

    .line 1350
    move-object v7, v2

    .line 1351
    move-object v6, v3

    .line 1352
    move-object v0, v5

    .line 1353
    move-object/from16 v1, p1

    .line 1354
    .line 1355
    goto/16 :goto_25

    .line 1356
    .line 1357
    :cond_24
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 1358
    .line 1359
    .line 1360
    const/4 v10, 0x0

    .line 1361
    goto/16 :goto_26

    .line 1362
    .line 1363
    :cond_25
    iget-boolean v2, v5, La/wk20;->j:Z

    .line 1364
    .line 1365
    iget-object v3, v5, La/wk20;->p:Ljava/lang/Object;

    .line 1366
    .line 1367
    check-cast v3, La/z7u;

    .line 1368
    .line 1369
    iget-object v6, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 1370
    .line 1371
    check-cast v6, Ljava/lang/String;

    .line 1372
    .line 1373
    iget-object v7, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v7, Ljava/lang/String;

    .line 1376
    .line 1377
    iget-object v8, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v8, Ljava/lang/String;

    .line 1380
    .line 1381
    iget-object v9, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v9, La/qz40;

    .line 1384
    .line 1385
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    move-object v10, v3

    .line 1389
    move-object v3, v6

    .line 1390
    move-object v6, v7

    .line 1391
    move-object v7, v8

    .line 1392
    move-object v8, v9

    .line 1393
    move v9, v2

    .line 1394
    move-object/from16 v2, p1

    .line 1395
    .line 1396
    goto/16 :goto_23

    .line 1397
    .line 1398
    :cond_26
    iget-object v3, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 1399
    .line 1400
    check-cast v3, Ljava/lang/String;

    .line 1401
    .line 1402
    iget-object v6, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v6, Ljava/lang/String;

    .line 1405
    .line 1406
    iget-object v7, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v7, Ljava/lang/String;

    .line 1409
    .line 1410
    iget-object v8, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1411
    .line 1412
    check-cast v8, La/qz40;

    .line 1413
    .line 1414
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1415
    .line 1416
    .line 1417
    move-object/from16 v9, p1

    .line 1418
    .line 1419
    goto/16 :goto_22

    .line 1420
    .line 1421
    :cond_27
    iget-object v3, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1422
    .line 1423
    check-cast v3, Ljava/lang/String;

    .line 1424
    .line 1425
    iget-object v6, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1426
    .line 1427
    check-cast v6, La/qz40;

    .line 1428
    .line 1429
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1430
    .line 1431
    .line 1432
    move-object/from16 v8, p1

    .line 1433
    .line 1434
    goto :goto_20

    .line 1435
    :cond_28
    iget-object v3, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1436
    .line 1437
    check-cast v3, La/qz40;

    .line 1438
    .line 1439
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1440
    .line 1441
    .line 1442
    move-object/from16 v6, p1

    .line 1443
    .line 1444
    goto :goto_1f

    .line 1445
    :cond_29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1446
    .line 1447
    .line 1448
    iget-object v3, v4, La/mn20;->M:La/p7m0;

    .line 1449
    .line 1450
    iput-object v3, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1451
    .line 1452
    iput-byte v6, v5, La/wk20;->k:B

    .line 1453
    .line 1454
    invoke-virtual {v4, v5}, La/mn20;->z(La/zje;)Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v6

    .line 1458
    if-ne v6, v0, :cond_2a

    .line 1459
    .line 1460
    goto/16 :goto_24

    .line 1461
    .line 1462
    :cond_2a
    :goto_1f
    check-cast v6, Ljava/lang/String;

    .line 1463
    .line 1464
    iput-object v3, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1465
    .line 1466
    iput-object v6, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1467
    .line 1468
    iput-byte v8, v5, La/wk20;->k:B

    .line 1469
    .line 1470
    invoke-virtual {v4, v5}, La/mn20;->B(La/zje;)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v8

    .line 1474
    if-ne v8, v0, :cond_2b

    .line 1475
    .line 1476
    goto/16 :goto_24

    .line 1477
    .line 1478
    :cond_2b
    move-object/from16 v48, v6

    .line 1479
    .line 1480
    move-object v6, v3

    .line 1481
    move-object/from16 v3, v48

    .line 1482
    .line 1483
    :goto_20
    check-cast v8, Ljava/lang/String;

    .line 1484
    .line 1485
    iget-object v10, v4, La/mn20;->b:La/m0k0;

    .line 1486
    .line 1487
    iget-object v10, v10, La/m0k0;->t:Ljava/lang/String;

    .line 1488
    .line 1489
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 1490
    .line 1491
    .line 1492
    move-result v11

    .line 1493
    if-nez v11, :cond_2c

    .line 1494
    .line 1495
    iget-object v10, v4, La/mn20;->d:La/ctf0;

    .line 1496
    .line 1497
    new-array v11, v7, [Ljava/lang/Object;

    .line 1498
    .line 1499
    iget-object v10, v10, La/ctf0;->b:La/lsm0;

    .line 1500
    .line 1501
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v7

    .line 1505
    const v11, 0x7f130c89

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v10, v11, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v7

    .line 1512
    goto :goto_21

    .line 1513
    :cond_2c
    move-object v7, v10

    .line 1514
    :goto_21
    iput-object v6, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1515
    .line 1516
    iput-object v3, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1517
    .line 1518
    iput-object v8, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1519
    .line 1520
    iput-object v7, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 1521
    .line 1522
    iput-byte v9, v5, La/wk20;->k:B

    .line 1523
    .line 1524
    invoke-virtual {v4, v5}, La/mn20;->x(La/zje;)Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v9

    .line 1528
    if-ne v9, v0, :cond_2d

    .line 1529
    .line 1530
    goto :goto_24

    .line 1531
    :cond_2d
    move-object/from16 v48, v7

    .line 1532
    .line 1533
    move-object v7, v3

    .line 1534
    move-object/from16 v3, v48

    .line 1535
    .line 1536
    move-object/from16 v48, v8

    .line 1537
    .line 1538
    move-object v8, v6

    .line 1539
    move-object/from16 v6, v48

    .line 1540
    .line 1541
    :goto_22
    check-cast v9, Ljava/lang/Boolean;

    .line 1542
    .line 1543
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1544
    .line 1545
    .line 1546
    move-result v9

    .line 1547
    iget-object v10, v4, La/mn20;->J:La/z7u;

    .line 1548
    .line 1549
    iget-object v11, v4, La/mn20;->n:La/f3c;

    .line 1550
    .line 1551
    iput-object v8, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1552
    .line 1553
    iput-object v7, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1554
    .line 1555
    iput-object v6, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1556
    .line 1557
    iput-object v3, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 1558
    .line 1559
    iput-object v10, v5, La/wk20;->p:Ljava/lang/Object;

    .line 1560
    .line 1561
    iput-boolean v9, v5, La/wk20;->j:Z

    .line 1562
    .line 1563
    iput-byte v2, v5, La/wk20;->k:B

    .line 1564
    .line 1565
    invoke-virtual {v11, v5}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v2

    .line 1569
    if-ne v2, v0, :cond_2e

    .line 1570
    .line 1571
    goto :goto_24

    .line 1572
    :cond_2e
    :goto_23
    check-cast v2, La/m97;

    .line 1573
    .line 1574
    iget-wide v11, v2, La/m97;->i:J

    .line 1575
    .line 1576
    iput-object v8, v5, La/wk20;->l:Ljava/lang/Object;

    .line 1577
    .line 1578
    iput-object v7, v5, La/wk20;->m:Ljava/lang/Object;

    .line 1579
    .line 1580
    iput-object v6, v5, La/wk20;->n:Ljava/lang/Object;

    .line 1581
    .line 1582
    iput-object v3, v5, La/wk20;->o:Ljava/io/Serializable;

    .line 1583
    .line 1584
    const/4 v13, 0x0

    .line 1585
    iput-object v13, v5, La/wk20;->p:Ljava/lang/Object;

    .line 1586
    .line 1587
    iput-boolean v9, v5, La/wk20;->j:Z

    .line 1588
    .line 1589
    iput-byte v1, v5, La/wk20;->k:B

    .line 1590
    .line 1591
    invoke-virtual {v10, v11, v12, v5}, La/z7u;->c(JLa/zje;)Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    if-ne v1, v0, :cond_2f

    .line 1596
    .line 1597
    :goto_24
    move-object v10, v0

    .line 1598
    goto :goto_26

    .line 1599
    :cond_2f
    move-object v0, v7

    .line 1600
    move-object v7, v6

    .line 1601
    move-object v6, v0

    .line 1602
    move-object v0, v8

    .line 1603
    move-object v8, v3

    .line 1604
    :goto_25
    check-cast v1, Ljava/lang/Boolean;

    .line 1605
    .line 1606
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1607
    .line 1608
    .line 1609
    move-result v10

    .line 1610
    new-instance v5, Lorg/xplatform/make_bet/impl/presentation/model/BetDetailsUiModel;

    .line 1611
    .line 1612
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/make_bet/impl/presentation/model/BetDetailsUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 1613
    .line 1614
    .line 1615
    iget-object v1, v4, La/mn20;->y:La/vzg0;

    .line 1616
    .line 1617
    const-string v2, "BET_DETAILS_SAVED_STATE_KEY"

    .line 1618
    .line 1619
    invoke-virtual {v1, v2, v5}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1620
    .line 1621
    .line 1622
    check-cast v0, La/p7m0;

    .line 1623
    .line 1624
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1625
    .line 1626
    .line 1627
    const/4 v13, 0x0

    .line 1628
    invoke-virtual {v0, v13, v5}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1629
    .line 1630
    .line 1631
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1632
    .line 1633
    :goto_26
    return-object v10

    .line 1634
    nop

    .line 1635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_0
    .end packed-switch

    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
