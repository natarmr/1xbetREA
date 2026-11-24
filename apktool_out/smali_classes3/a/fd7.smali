.class public final La/fd7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/kd7;


# direct methods
.method public synthetic constructor <init>(La/kd7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fd7;->i:B

    iput-object p1, p0, La/fd7;->k:La/kd7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/fd7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fd7;->k:La/kd7;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/fd7;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/fd7;-><init>(La/kd7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/fd7;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/fd7;-><init>(La/kd7;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fd7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fd7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fd7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fd7;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v6, v0, La/fd7;->k:La/kd7;

    .line 14
    .line 15
    iget-object v1, v6, La/kd7;->s:La/ctf0;

    .line 16
    .line 17
    iget-object v12, v6, La/kd7;->o:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v13, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v7, v0, La/fd7;->j:B

    .line 22
    .line 23
    const/4 v14, 0x0

    .line 24
    if-eqz v7, :cond_2

    .line 25
    .line 26
    if-eq v7, v4, :cond_1

    .line 27
    .line 28
    if-ne v7, v5, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v0, p1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v6, La/kd7;->N:La/p37;

    .line 49
    .line 50
    new-instance v8, La/e1k;

    .line 51
    .line 52
    iget-object v2, v6, La/kd7;->o:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v8, v2, v14}, La/e1k;-><init>(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x6

    .line 59
    const/4 v9, 0x0

    .line 60
    invoke-static/range {v6 .. v11}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v6, La/kd7;->C:La/rrc;

    .line 64
    .line 65
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    iput-byte v4, v0, La/fd7;->j:B

    .line 70
    .line 71
    invoke-virtual {v2, v7, v8, v0}, La/rrc;->D(JLa/bnn0;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-ne v2, v13, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    :goto_0
    iget-object v2, v6, La/kd7;->D:La/ocl;

    .line 79
    .line 80
    iput-byte v5, v0, La/fd7;->j:B

    .line 81
    .line 82
    invoke-virtual {v2}, La/ocl;->j()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-ne v0, v13, :cond_4

    .line 87
    .line 88
    :goto_1
    move-object v2, v13

    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_4
    :goto_2
    move-object/from16 v20, v0

    .line 92
    .line 93
    check-cast v20, Ljava/util/List;

    .line 94
    .line 95
    sget-object v0, La/kd7;->m0:Ljava/util/List;

    .line 96
    .line 97
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 98
    .line 99
    iget-object v7, v0, La/ocj;->a:La/p7m0;

    .line 100
    .line 101
    :cond_5
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-object v15, v0

    .line 109
    check-cast v15, La/rc7;

    .line 110
    .line 111
    const-wide/16 v30, 0x0

    .line 112
    .line 113
    const v32, 0xfffff9f

    .line 114
    .line 115
    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    sget-object v19, La/x760;->a:La/x760;

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/16 v23, 0x0

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const-wide/16 v28, 0x0

    .line 139
    .line 140
    invoke-static/range {v15 .. v32}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v7, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_5

    .line 149
    .line 150
    new-instance v0, La/kc7;

    .line 151
    .line 152
    new-instance v15, La/xdk0;

    .line 153
    .line 154
    sget-object v16, La/qek0;->a:La/qek0;

    .line 155
    .line 156
    new-array v2, v14, [Ljava/lang/Object;

    .line 157
    .line 158
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 159
    .line 160
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const v5, 0x7f131080

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v17

    .line 171
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 176
    .line 177
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const v3, 0x7f1309d9

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v18

    .line 188
    new-instance v1, Ljava/lang/Integer;

    .line 189
    .line 190
    const v2, 0x7f080afc

    .line 191
    .line 192
    .line 193
    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 194
    .line 195
    .line 196
    const/16 v22, 0x58

    .line 197
    .line 198
    const/16 v19, 0x0

    .line 199
    .line 200
    const/16 v20, 0x0

    .line 201
    .line 202
    move-object/from16 v21, v1

    .line 203
    .line 204
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 205
    .line 206
    .line 207
    invoke-direct {v0, v15}, La/kc7;-><init>(La/xdk0;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object v7, v6, La/kd7;->N:La/p37;

    .line 214
    .line 215
    iget-object v0, v6, La/kd7;->o:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v8, La/r1k;

    .line 221
    .line 222
    invoke-direct {v8, v0}, La/r1k;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/4 v10, 0x0

    .line 226
    const/4 v11, 0x6

    .line 227
    const/4 v9, 0x0

    .line 228
    invoke-static/range {v6 .. v11}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 229
    .line 230
    .line 231
    iget-object v7, v6, La/kd7;->N:La/p37;

    .line 232
    .line 233
    new-instance v8, La/v0k;

    .line 234
    .line 235
    iget-object v0, v6, La/kd7;->o:Ljava/lang/String;

    .line 236
    .line 237
    const-string v1, ""

    .line 238
    .line 239
    invoke-direct {v8, v0, v14, v1}, La/v0k;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static/range {v6 .. v11}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 243
    .line 244
    .line 245
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    :goto_3
    return-object v2

    .line 248
    :pswitch_0
    iget-object v1, v0, La/fd7;->k:La/kd7;

    .line 249
    .line 250
    iget-object v6, v1, La/kd7;->d0:La/xw30;

    .line 251
    .line 252
    sget-object v7, La/wne;->a:La/wne;

    .line 253
    .line 254
    iget-byte v8, v0, La/fd7;->j:B

    .line 255
    .line 256
    if-eqz v8, :cond_8

    .line 257
    .line 258
    if-eq v8, v4, :cond_7

    .line 259
    .line 260
    if-ne v8, v5, :cond_6

    .line 261
    .line 262
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    iget-object v2, v1, La/kd7;->N:La/p37;

    .line 278
    .line 279
    const/16 v25, 0x0

    .line 280
    .line 281
    const/16 v26, 0x6

    .line 282
    .line 283
    sget-object v23, La/c1k;->a:La/c1k;

    .line 284
    .line 285
    const/16 v24, 0x0

    .line 286
    .line 287
    move-object/from16 v21, v1

    .line 288
    .line 289
    move-object/from16 v22, v2

    .line 290
    .line 291
    invoke-static/range {v21 .. v26}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    check-cast v2, La/rc7;

    .line 299
    .line 300
    iget-object v2, v2, La/rc7;->h:La/ql5;

    .line 301
    .line 302
    if-nez v2, :cond_9

    .line 303
    .line 304
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_9
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    check-cast v3, La/rc7;

    .line 312
    .line 313
    iget-object v3, v3, La/rc7;->d:La/a5w;

    .line 314
    .line 315
    if-nez v3, :cond_a

    .line 316
    .line 317
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_a
    new-instance v8, La/fv30;

    .line 321
    .line 322
    iget-object v1, v1, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 323
    .line 324
    iget-object v1, v1, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 325
    .line 326
    invoke-direct {v8, v3, v2, v1}, La/fv30;-><init>(La/a5w;La/ql5;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 327
    .line 328
    .line 329
    iput-byte v4, v0, La/fd7;->j:B

    .line 330
    .line 331
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6, v8, v0}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    if-ne v1, v7, :cond_b

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_b
    :goto_4
    iput-byte v5, v0, La/fd7;->j:B

    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    sget-object v1, La/hv30;->a:La/hv30;

    .line 347
    .line 348
    invoke-virtual {v6, v1, v0}, La/xw30;->j(La/lv30;La/zje;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-ne v0, v7, :cond_c

    .line 353
    .line 354
    :goto_5
    move-object v2, v7

    .line 355
    goto :goto_7

    .line 356
    :cond_c
    :goto_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    :goto_7
    return-object v2

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
