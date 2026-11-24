.class public final synthetic La/xtn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bun0;


# direct methods
.method public synthetic constructor <init>(La/bun0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xtn0;->a:B

    iput-object p1, p0, La/xtn0;->b:La/bun0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xtn0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/xtn0;->b:La/bun0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, La/pun0;->v:La/xae0;

    .line 20
    .line 21
    iget-object v2, v1, La/xae0;->a:La/n7m0;

    .line 22
    .line 23
    invoke-interface {v2}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 28
    .line 29
    iget-object v2, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 30
    .line 31
    iget-wide v4, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 32
    .line 33
    iget-object v1, v1, La/xae0;->a:La/n7m0;

    .line 34
    .line 35
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 40
    .line 41
    iget-boolean v2, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->l:Z

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 50
    .line 51
    iget-wide v6, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->d:D

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 59
    .line 60
    iget-wide v6, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->d:D

    .line 61
    .line 62
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 67
    .line 68
    iget-wide v8, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->e:D

    .line 69
    .line 70
    add-double/2addr v6, v8

    .line 71
    :goto_0
    const-wide/16 v8, 0x0

    .line 72
    .line 73
    cmpg-double v2, v4, v8

    .line 74
    .line 75
    if-nez v2, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 83
    .line 84
    iget-wide v1, v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->e:D

    .line 85
    .line 86
    add-double/2addr v4, v1

    .line 87
    const-wide v1, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->min(DD)D

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    :goto_1
    new-instance v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 97
    .line 98
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-direct {v1, v2}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v3}, La/pun0;->w(Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;Z)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_0
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 112
    .line 113
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, v0, La/pun0;->v:La/xae0;

    .line 118
    .line 119
    iget-object v2, v1, La/xae0;->a:La/n7m0;

    .line 120
    .line 121
    invoke-interface {v2}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 126
    .line 127
    iget-wide v4, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->f:D

    .line 128
    .line 129
    iget-object v1, v1, La/xae0;->a:La/n7m0;

    .line 130
    .line 131
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 136
    .line 137
    iget-object v2, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 138
    .line 139
    iget-wide v6, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 140
    .line 141
    cmpg-double v2, v6, v4

    .line 142
    .line 143
    if-gtz v2, :cond_2

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 151
    .line 152
    iget-wide v1, v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->e:D

    .line 153
    .line 154
    sub-double/2addr v6, v1

    .line 155
    cmpl-double v1, v6, v4

    .line 156
    .line 157
    if-lez v1, :cond_3

    .line 158
    .line 159
    move-wide v4, v6

    .line 160
    :cond_3
    new-instance v1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 161
    .line 162
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-direct {v1, v2}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1, v3}, La/pun0;->w(Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;Z)V

    .line 170
    .line 171
    .line 172
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_1
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 176
    .line 177
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    iget-object v1, v0, La/pun0;->d:La/mne;

    .line 186
    .line 187
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 188
    .line 189
    new-instance v6, La/dun0;

    .line 190
    .line 191
    invoke-direct {v6, v0, v2}, La/dun0;-><init>(La/pun0;B)V

    .line 192
    .line 193
    .line 194
    new-instance v9, La/agn0;

    .line 195
    .line 196
    const/16 v1, 0x11

    .line 197
    .line 198
    invoke-direct {v9, v0, v4, v1}, La/agn0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 199
    .line 200
    .line 201
    const/16 v10, 0xa

    .line 202
    .line 203
    const/4 v7, 0x0

    .line 204
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 205
    .line 206
    .line 207
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object v0

    .line 210
    :pswitch_2
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 211
    .line 212
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget-object v1, v0, La/pun0;->i:La/vzg0;

    .line 217
    .line 218
    const-string v5, "SUM_STEPPER_FIRST_FOCUS_KEY"

    .line 219
    .line 220
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v1, v5, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v0, La/pun0;->l:La/rrc;

    .line 226
    .line 227
    invoke-virtual {v1}, La/rrc;->E()V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    iget-object v1, v0, La/pun0;->d:La/mne;

    .line 235
    .line 236
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 237
    .line 238
    new-instance v6, La/dun0;

    .line 239
    .line 240
    invoke-direct {v6, v0, v3}, La/dun0;-><init>(La/pun0;B)V

    .line 241
    .line 242
    .line 243
    new-instance v9, La/wk20;

    .line 244
    .line 245
    invoke-direct {v9, v2, v0, v4}, La/wk20;-><init>(ZLa/pun0;La/yje;)V

    .line 246
    .line 247
    .line 248
    const/16 v10, 0xa

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_3
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 258
    .line 259
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v1, v0, La/pun0;->r:La/ih5;

    .line 264
    .line 265
    const-string v2, "swipex"

    .line 266
    .line 267
    invoke-virtual {v1, v2}, La/ih5;->c(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v0, La/pun0;->q:La/gg5;

    .line 271
    .line 272
    invoke-virtual {v1, v2}, La/gg5;->i(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    iget-object v1, v0, La/pun0;->d:La/mne;

    .line 280
    .line 281
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 282
    .line 283
    new-instance v6, La/ndn0;

    .line 284
    .line 285
    iget-object v11, v0, La/pun0;->e:La/duj;

    .line 286
    .line 287
    const/4 v15, 0x0

    .line 288
    const/16 v16, 0x13

    .line 289
    .line 290
    const/4 v10, 0x1

    .line 291
    const-class v12, La/duj;

    .line 292
    .line 293
    const-string v13, "handleError"

    .line 294
    .line 295
    const-string v14, "handleError(Ljava/lang/Throwable;)V"

    .line 296
    .line 297
    move-object v9, v6

    .line 298
    invoke-direct/range {v9 .. v16}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 299
    .line 300
    .line 301
    new-instance v9, La/oun0;

    .line 302
    .line 303
    const/4 v1, 0x2

    .line 304
    invoke-direct {v9, v0, v4, v1}, La/oun0;-><init>(La/pun0;La/yje;B)V

    .line 305
    .line 306
    .line 307
    const/16 v10, 0xa

    .line 308
    .line 309
    const/4 v7, 0x0

    .line 310
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 311
    .line 312
    .line 313
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_4
    iget-object v0, v0, La/bun0;->d2:La/tvi;

    .line 317
    .line 318
    if-eqz v0, :cond_4

    .line 319
    .line 320
    return-object v0

    .line 321
    :cond_4
    const-string v0, "viewModelFactory"

    .line 322
    .line 323
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v4

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
