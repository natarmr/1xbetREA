.class public final La/kf20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/qg20;


# direct methods
.method public synthetic constructor <init>(La/qg20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kf20;->i:B

    iput-object p1, p0, La/kf20;->l:La/qg20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kf20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kf20;->l:La/qg20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/kf20;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/kf20;-><init>(La/qg20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/kf20;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/kf20;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/kf20;-><init>(La/qg20;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/kf20;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/kf20;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/kf20;-><init>(La/qg20;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/kf20;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/kf20;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/kf20;-><init>(La/qg20;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/kf20;->k:Ljava/lang/Object;

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
    iget-byte v0, p0, La/kf20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/lit0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/kf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kf20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/q4f;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/kf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kf20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/kf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/kf20;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/kf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/q4f;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/kf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/kf20;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/kf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kf20;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, v0, La/kf20;->l:La/qg20;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v4, La/qg20;->d1:La/p7m0;

    .line 16
    .line 17
    iget-object v7, v4, La/qg20;->l1:La/p7m0;

    .line 18
    .line 19
    iget-object v8, v0, La/kf20;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v8, La/lit0;

    .line 22
    .line 23
    sget-object v9, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-boolean v10, v0, La/kf20;->j:Z

    .line 26
    .line 27
    const/16 v11, 0xbf

    .line 28
    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    if-ne v10, v5, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object v3, La/jit0;->a:La/jit0;

    .line 47
    .line 48
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v3, v0

    .line 59
    check-cast v3, La/fxo;

    .line 60
    .line 61
    invoke-static {v3, v2, v2, v2, v11}, La/fxo;->a(La/fxo;ZZZI)La/fxo;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v7, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v7, v0

    .line 76
    check-cast v7, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 77
    .line 78
    const/16 v28, 0x0

    .line 79
    .line 80
    const v29, 0x2ffff

    .line 81
    .line 82
    .line 83
    const-wide/16 v8, 0x0

    .line 84
    .line 85
    const-wide/16 v10, 0x0

    .line 86
    .line 87
    const-wide/16 v12, 0x0

    .line 88
    .line 89
    const-wide/16 v14, 0x0

    .line 90
    .line 91
    const-wide/16 v16, 0x0

    .line 92
    .line 93
    const/16 v18, 0x0

    .line 94
    .line 95
    const/16 v19, 0x0

    .line 96
    .line 97
    const/16 v20, 0x0

    .line 98
    .line 99
    const/16 v21, 0x0

    .line 100
    .line 101
    const/16 v22, 0x0

    .line 102
    .line 103
    const/16 v23, 0x0

    .line 104
    .line 105
    const/16 v24, 0x0

    .line 106
    .line 107
    const/16 v25, 0x0

    .line 108
    .line 109
    const/16 v26, 0x0

    .line 110
    .line 111
    const/16 v27, 0x0

    .line 112
    .line 113
    invoke-static/range {v7 .. v29}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    iget-object v0, v4, La/qg20;->d:La/mne;

    .line 128
    .line 129
    iget-object v10, v0, La/mne;->a:La/rwj;

    .line 130
    .line 131
    sget-object v8, La/kg20;->a:La/kg20;

    .line 132
    .line 133
    new-instance v11, La/mq10;

    .line 134
    .line 135
    const/4 v0, 0x6

    .line 136
    invoke-direct {v11, v4, v6, v0}, La/mq10;-><init>(La/diu0;La/yje;B)V

    .line 137
    .line 138
    .line 139
    const/16 v12, 0xa

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    sget-object v3, La/kit0;->a:La/kit0;

    .line 147
    .line 148
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    sget-object v3, La/wen;->b:La/uen;

    .line 155
    .line 156
    const-wide/16 v12, 0x1f4

    .line 157
    .line 158
    sget-object v3, La/bfn;->d:La/bfn;

    .line 159
    .line 160
    invoke-static {v12, v13, v3}, La/ibc;->w0(JLa/bfn;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v12

    .line 164
    iput-object v6, v0, La/kf20;->k:Ljava/lang/Object;

    .line 165
    .line 166
    iput-boolean v5, v0, La/kf20;->j:Z

    .line 167
    .line 168
    invoke-static {v12, v13, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v9, :cond_5

    .line 173
    .line 174
    move-object v6, v9

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    :goto_0
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    move-object v3, v0

    .line 181
    check-cast v3, La/fxo;

    .line 182
    .line 183
    invoke-static {v3, v2, v5, v2, v11}, La/fxo;->a(La/fxo;ZZZI)La/fxo;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v7, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_5

    .line 192
    .line 193
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move-object v7, v0

    .line 198
    check-cast v7, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 199
    .line 200
    const/16 v28, 0x0

    .line 201
    .line 202
    const v29, 0x2ffff

    .line 203
    .line 204
    .line 205
    const-wide/16 v8, 0x0

    .line 206
    .line 207
    const-wide/16 v10, 0x0

    .line 208
    .line 209
    const-wide/16 v12, 0x0

    .line 210
    .line 211
    const-wide/16 v14, 0x0

    .line 212
    .line 213
    const-wide/16 v16, 0x0

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    const/16 v20, 0x0

    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const/16 v23, 0x0

    .line 226
    .line 227
    const/16 v24, 0x0

    .line 228
    .line 229
    const/16 v25, 0x0

    .line 230
    .line 231
    const/16 v26, 0x0

    .line 232
    .line 233
    const/16 v27, 0x1

    .line 234
    .line 235
    invoke-static/range {v7 .. v29}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_6

    .line 244
    .line 245
    invoke-virtual {v4}, La/qg20;->z()La/inb0;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v4, v0}, La/qg20;->e0(La/jnb0;)V

    .line 250
    .line 251
    .line 252
    iget-object v0, v4, La/qg20;->Y0:La/p7m0;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    sget-object v1, La/l40;->a:La/l40;

    .line 258
    .line 259
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :goto_1
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 266
    .line 267
    .line 268
    :goto_2
    return-object v6

    .line 269
    :pswitch_0
    iget-object v1, v4, La/qg20;->d1:La/p7m0;

    .line 270
    .line 271
    iget-object v7, v0, La/kf20;->k:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v7, La/q4f;

    .line 274
    .line 275
    sget-object v8, La/wne;->a:La/wne;

    .line 276
    .line 277
    iget-boolean v9, v0, La/kf20;->j:Z

    .line 278
    .line 279
    if-eqz v9, :cond_9

    .line 280
    .line 281
    if-ne v9, v5, :cond_8

    .line 282
    .line 283
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_6

    .line 287
    .line 288
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_7

    .line 292
    .line 293
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    sget-object v3, La/q4f;->h:La/q4f;

    .line 297
    .line 298
    if-ne v7, v3, :cond_a

    .line 299
    .line 300
    move v9, v5

    .line 301
    goto :goto_3

    .line 302
    :cond_a
    move v9, v2

    .line 303
    :goto_3
    iget-object v3, v4, La/qg20;->T0:La/nwo0;

    .line 304
    .line 305
    iget-boolean v10, v3, La/nwo0;->a:Z

    .line 306
    .line 307
    sget-object v3, La/q4f;->m:La/q4f;

    .line 308
    .line 309
    if-ne v7, v3, :cond_b

    .line 310
    .line 311
    move v7, v5

    .line 312
    goto :goto_4

    .line 313
    :cond_b
    move v7, v2

    .line 314
    :cond_c
    :goto_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    move-object v11, v3

    .line 319
    check-cast v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 320
    .line 321
    xor-int/lit8 v26, v9, 0x1

    .line 322
    .line 323
    const/16 v32, 0x0

    .line 324
    .line 325
    const v33, 0x3fdff

    .line 326
    .line 327
    .line 328
    const-wide/16 v12, 0x0

    .line 329
    .line 330
    const-wide/16 v14, 0x0

    .line 331
    .line 332
    const-wide/16 v16, 0x0

    .line 333
    .line 334
    const-wide/16 v18, 0x0

    .line 335
    .line 336
    const-wide/16 v20, 0x0

    .line 337
    .line 338
    const/16 v22, 0x0

    .line 339
    .line 340
    const/16 v23, 0x0

    .line 341
    .line 342
    const/16 v24, 0x0

    .line 343
    .line 344
    const/16 v25, 0x0

    .line 345
    .line 346
    const/16 v27, 0x0

    .line 347
    .line 348
    const/16 v28, 0x0

    .line 349
    .line 350
    const/16 v29, 0x0

    .line 351
    .line 352
    const/16 v30, 0x0

    .line 353
    .line 354
    const/16 v31, 0x0

    .line 355
    .line 356
    invoke-static/range {v11 .. v33}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    invoke-virtual {v1, v3, v11}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-eqz v3, :cond_c

    .line 365
    .line 366
    iget-object v3, v4, La/qg20;->n1:La/p7m0;

    .line 367
    .line 368
    :cond_d
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    move-object v12, v11

    .line 373
    check-cast v12, La/rn20;

    .line 374
    .line 375
    invoke-static {v12, v2, v9, v10, v5}, La/rn20;->a(La/rn20;ZZZI)La/rn20;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    invoke-virtual {v3, v11, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    if-eqz v11, :cond_d

    .line 384
    .line 385
    if-eqz v9, :cond_e

    .line 386
    .line 387
    invoke-virtual {v4}, La/qg20;->d0()V

    .line 388
    .line 389
    .line 390
    iget-object v2, v4, La/qg20;->h1:La/p7m0;

    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    sget-object v3, La/hnb0;->a:La/hnb0;

    .line 396
    .line 397
    invoke-virtual {v2, v6, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_e
    if-eqz v7, :cond_10

    .line 402
    .line 403
    invoke-virtual {v4}, La/qg20;->d0()V

    .line 404
    .line 405
    .line 406
    :cond_f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    move-object v9, v2

    .line 411
    check-cast v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 412
    .line 413
    iget-wide v10, v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b:D

    .line 414
    .line 415
    const/16 v30, 0x0

    .line 416
    .line 417
    const v31, 0x3effe

    .line 418
    .line 419
    .line 420
    const-wide/16 v12, 0x0

    .line 421
    .line 422
    const-wide/16 v14, 0x0

    .line 423
    .line 424
    const-wide/16 v16, 0x0

    .line 425
    .line 426
    const-wide/16 v18, 0x0

    .line 427
    .line 428
    const/16 v20, 0x0

    .line 429
    .line 430
    const/16 v21, 0x0

    .line 431
    .line 432
    const/16 v22, 0x0

    .line 433
    .line 434
    const/16 v23, 0x0

    .line 435
    .line 436
    const/16 v24, 0x0

    .line 437
    .line 438
    const/16 v25, 0x0

    .line 439
    .line 440
    const/16 v26, 0x0

    .line 441
    .line 442
    const/16 v27, 0x0

    .line 443
    .line 444
    const/16 v28, 0x0

    .line 445
    .line 446
    const/16 v29, 0x0

    .line 447
    .line 448
    invoke-static/range {v9 .. v31}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_f

    .line 457
    .line 458
    goto :goto_5

    .line 459
    :cond_10
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    move-object v9, v2

    .line 464
    check-cast v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 465
    .line 466
    const/16 v30, 0x0

    .line 467
    .line 468
    const v31, 0x3f3ff

    .line 469
    .line 470
    .line 471
    const-wide/16 v10, 0x0

    .line 472
    .line 473
    const-wide/16 v12, 0x0

    .line 474
    .line 475
    const-wide/16 v14, 0x0

    .line 476
    .line 477
    const-wide/16 v16, 0x0

    .line 478
    .line 479
    const-wide/16 v18, 0x0

    .line 480
    .line 481
    const/16 v20, 0x0

    .line 482
    .line 483
    const/16 v21, 0x0

    .line 484
    .line 485
    const/16 v22, 0x0

    .line 486
    .line 487
    const/16 v23, 0x0

    .line 488
    .line 489
    const/16 v24, 0x0

    .line 490
    .line 491
    const/16 v25, 0x1

    .line 492
    .line 493
    const/16 v26, 0x0

    .line 494
    .line 495
    const/16 v27, 0x0

    .line 496
    .line 497
    const/16 v28, 0x0

    .line 498
    .line 499
    const/16 v29, 0x0

    .line 500
    .line 501
    invoke-static/range {v9 .. v31}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_10

    .line 510
    .line 511
    invoke-virtual {v4}, La/qg20;->S()V

    .line 512
    .line 513
    .line 514
    :goto_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    check-cast v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 519
    .line 520
    iget-boolean v1, v1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->m:Z

    .line 521
    .line 522
    if-nez v1, :cond_11

    .line 523
    .line 524
    iget-object v1, v4, La/qg20;->k1:La/qoj0;

    .line 525
    .line 526
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 527
    .line 528
    iput-object v6, v0, La/kf20;->k:Ljava/lang/Object;

    .line 529
    .line 530
    iput-boolean v5, v0, La/kf20;->j:Z

    .line 531
    .line 532
    invoke-virtual {v1, v2, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    if-ne v0, v8, :cond_11

    .line 537
    .line 538
    move-object v6, v8

    .line 539
    goto :goto_7

    .line 540
    :cond_11
    :goto_6
    iget-object v0, v4, La/qg20;->M0:La/bby;

    .line 541
    .line 542
    if-eqz v0, :cond_12

    .line 543
    .line 544
    invoke-interface {v0, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 545
    .line 546
    .line 547
    :cond_12
    invoke-virtual {v4, v5}, La/qg20;->Q(Z)V

    .line 548
    .line 549
    .line 550
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    :goto_7
    return-object v6

    .line 553
    :pswitch_1
    iget-object v1, v0, La/kf20;->k:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v1, La/vne;

    .line 556
    .line 557
    sget-object v7, La/wne;->a:La/wne;

    .line 558
    .line 559
    iget-boolean v8, v0, La/kf20;->j:Z

    .line 560
    .line 561
    if-eqz v8, :cond_14

    .line 562
    .line 563
    if-ne v8, v5, :cond_13

    .line 564
    .line 565
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    goto :goto_9

    .line 569
    :cond_13
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    goto :goto_a

    .line 573
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    iget-object v3, v4, La/qg20;->l0:La/u0u;

    .line 577
    .line 578
    iget-object v3, v3, La/u0u;->a:La/khf0;

    .line 579
    .line 580
    iget-object v3, v3, La/khf0;->b:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v3, La/lye;

    .line 583
    .line 584
    iget-object v3, v3, La/lye;->p:La/qoj0;

    .line 585
    .line 586
    iget-object v8, v4, La/qg20;->q1:La/qoj0;

    .line 587
    .line 588
    new-instance v9, La/yf20;

    .line 589
    .line 590
    const/4 v10, 0x3

    .line 591
    invoke-direct {v9, v10, v6}, La/bnn0;-><init>(ILa/yje;)V

    .line 592
    .line 593
    .line 594
    new-instance v10, La/clu;

    .line 595
    .line 596
    const/16 v11, 0xd

    .line 597
    .line 598
    invoke-direct {v10, v4, v1, v11}, La/clu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 599
    .line 600
    .line 601
    iput-object v6, v0, La/kf20;->k:Ljava/lang/Object;

    .line 602
    .line 603
    iput-boolean v5, v0, La/kf20;->j:Z

    .line 604
    .line 605
    const/4 v1, 0x2

    .line 606
    new-array v1, v1, [La/gmq;

    .line 607
    .line 608
    aput-object v3, v1, v2

    .line 609
    .line 610
    aput-object v8, v1, v5

    .line 611
    .line 612
    sget-object v2, La/pul;->j:La/pul;

    .line 613
    .line 614
    new-instance v3, La/kh1;

    .line 615
    .line 616
    const/16 v4, 0x9

    .line 617
    .line 618
    invoke-direct {v3, v9, v6, v4}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 619
    .line 620
    .line 621
    invoke-static {v0, v10, v3, v2, v1}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    if-ne v0, v7, :cond_15

    .line 626
    .line 627
    goto :goto_8

    .line 628
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 629
    .line 630
    :goto_8
    if-ne v0, v7, :cond_16

    .line 631
    .line 632
    move-object v6, v7

    .line 633
    goto :goto_a

    .line 634
    :cond_16
    :goto_9
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    :goto_a
    return-object v6

    .line 637
    :pswitch_2
    iget-object v1, v0, La/kf20;->k:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v1, La/q4f;

    .line 640
    .line 641
    sget-object v2, La/wne;->a:La/wne;

    .line 642
    .line 643
    iget-boolean v7, v0, La/kf20;->j:Z

    .line 644
    .line 645
    if-eqz v7, :cond_18

    .line 646
    .line 647
    if-ne v7, v5, :cond_17

    .line 648
    .line 649
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    goto :goto_b

    .line 653
    :cond_17
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    goto :goto_c

    .line 657
    :cond_18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    iget-object v3, v4, La/qg20;->i1:La/qoj0;

    .line 661
    .line 662
    iput-object v6, v0, La/kf20;->k:Ljava/lang/Object;

    .line 663
    .line 664
    iput-boolean v5, v0, La/kf20;->j:Z

    .line 665
    .line 666
    invoke-virtual {v3, v1, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    if-ne v0, v2, :cond_19

    .line 671
    .line 672
    move-object v6, v2

    .line 673
    goto :goto_c

    .line 674
    :cond_19
    :goto_b
    iget-object v0, v4, La/qg20;->M0:La/bby;

    .line 675
    .line 676
    if-eqz v0, :cond_1a

    .line 677
    .line 678
    invoke-interface {v0, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 679
    .line 680
    .line 681
    :cond_1a
    invoke-virtual {v4, v5}, La/qg20;->Q(Z)V

    .line 682
    .line 683
    .line 684
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    :goto_c
    return-object v6

    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
