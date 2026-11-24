.class public final La/cd7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/a5w;

.field public k:Ljava/util/List;

.field public l:B

.field public final synthetic m:La/kd7;


# direct methods
.method public synthetic constructor <init>(La/kd7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cd7;->i:B

    iput-object p1, p0, La/cd7;->m:La/kd7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/cd7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cd7;->m:La/kd7;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/cd7;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/cd7;-><init>(La/kd7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/cd7;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/cd7;-><init>(La/kd7;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/cd7;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/cd7;-><init>(La/kd7;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cd7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/cd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cd7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/cd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/cd7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/cd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/cd7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/cd7;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/cd7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget-byte v0, v4, La/cd7;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v6, v4, La/cd7;->m:La/kd7;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v7, 0x3

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v8, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v0, v4, La/cd7;->l:B

    .line 19
    .line 20
    const/4 v9, 0x4

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    if-eq v0, v3, :cond_3

    .line 24
    .line 25
    if-eq v0, v5, :cond_2

    .line 26
    .line 27
    if-eq v0, v7, :cond_1

    .line 28
    .line 29
    if-ne v0, v9, :cond_0

    .line 30
    .line 31
    iget-object v0, v4, La/cd7;->k:Ljava/util/List;

    .line 32
    .line 33
    iget-object v1, v4, La/cd7;->j:La/a5w;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    move-object v15, v0

    .line 41
    move-object v10, v1

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    iget-object v0, v4, La/cd7;->j:La/a5w;

    .line 50
    .line 51
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v1, p1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v0, p1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, La/wen;->b:La/uen;

    .line 71
    .line 72
    const-wide/16 v0, 0x32

    .line 73
    .line 74
    sget-object v2, La/bfn;->d:La/bfn;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iput-byte v3, v4, La/cd7;->l:B

    .line 81
    .line 82
    invoke-static {v0, v1, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-ne v0, v8, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_0
    iget-object v0, v6, La/kd7;->w:La/lsn;

    .line 90
    .line 91
    iget-object v1, v6, La/kd7;->o:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v2, v6, La/kd7;->v:La/k7u;

    .line 94
    .line 95
    iget-object v2, v2, La/k7u;->a:La/uzc;

    .line 96
    .line 97
    invoke-virtual {v2}, La/uzc;->b()La/jvn;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, La/jvn;->getId()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iget-object v3, v6, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 106
    .line 107
    iget-wide v10, v3, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;->b:J

    .line 108
    .line 109
    iput-byte v5, v4, La/cd7;->l:B

    .line 110
    .line 111
    iget-object v0, v0, La/lsn;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, La/nr;

    .line 114
    .line 115
    move-object v5, v1

    .line 116
    move v1, v2

    .line 117
    move-wide v2, v10

    .line 118
    invoke-virtual/range {v0 .. v5}, La/nr;->g(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v8, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    :goto_1
    check-cast v0, La/a5w;

    .line 126
    .line 127
    iget-object v1, v6, La/kd7;->F:La/z7u;

    .line 128
    .line 129
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iput-object v0, v4, La/cd7;->j:La/a5w;

    .line 134
    .line 135
    iput-byte v7, v4, La/cd7;->l:B

    .line 136
    .line 137
    invoke-virtual {v1, v2, v4}, La/z7u;->a(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-ne v1, v8, :cond_7

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 145
    .line 146
    iput-object v0, v4, La/cd7;->j:La/a5w;

    .line 147
    .line 148
    iput-object v1, v4, La/cd7;->k:Ljava/util/List;

    .line 149
    .line 150
    iput-byte v9, v4, La/cd7;->l:B

    .line 151
    .line 152
    sget-object v2, La/kd7;->m0:Ljava/util/List;

    .line 153
    .line 154
    invoke-virtual {v6, v0, v4}, La/kd7;->W(La/a5w;La/zje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-ne v2, v8, :cond_8

    .line 159
    .line 160
    :goto_3
    move-object v1, v8

    .line 161
    goto :goto_5

    .line 162
    :cond_8
    move-object v10, v0

    .line 163
    move-object v15, v1

    .line 164
    :goto_4
    move-object v11, v2

    .line 165
    check-cast v11, La/z760;

    .line 166
    .line 167
    sget-object v0, La/kd7;->m0:Ljava/util/List;

    .line 168
    .line 169
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 170
    .line 171
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 172
    .line 173
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-object v7, v1

    .line 181
    check-cast v7, La/rc7;

    .line 182
    .line 183
    const-wide/16 v22, 0x0

    .line 184
    .line 185
    const v24, 0xff7fdd6

    .line 186
    .line 187
    .line 188
    sget-object v8, La/r9x;->a:La/r9x;

    .line 189
    .line 190
    const/4 v9, 0x0

    .line 191
    const/4 v12, 0x0

    .line 192
    const/4 v13, 0x0

    .line 193
    const/4 v14, 0x0

    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    const/16 v17, 0x0

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const/16 v19, 0x0

    .line 201
    .line 202
    const-wide/16 v20, 0x0

    .line 203
    .line 204
    invoke-static/range {v7 .. v24}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_9

    .line 213
    .line 214
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    :goto_5
    return-object v1

    .line 217
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 218
    .line 219
    iget-byte v8, v4, La/cd7;->l:B

    .line 220
    .line 221
    if-eqz v8, :cond_d

    .line 222
    .line 223
    if-eq v8, v3, :cond_c

    .line 224
    .line 225
    if-eq v8, v5, :cond_b

    .line 226
    .line 227
    if-ne v8, v7, :cond_a

    .line 228
    .line 229
    iget-object v0, v4, La/cd7;->k:Ljava/util/List;

    .line 230
    .line 231
    iget-object v1, v4, La/cd7;->j:La/a5w;

    .line 232
    .line 233
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v3, p1

    .line 237
    .line 238
    move-object v15, v0

    .line 239
    :goto_6
    move-object v10, v1

    .line 240
    goto :goto_a

    .line 241
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_b

    .line 245
    .line 246
    :cond_b
    iget-object v1, v4, La/cd7;->j:La/a5w;

    .line 247
    .line 248
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v2, p1

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v1, p1

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object v1, v6, La/kd7;->u:La/uii;

    .line 264
    .line 265
    iget-object v2, v6, La/kd7;->o:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v8, v6, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 268
    .line 269
    iput-byte v3, v4, La/cd7;->l:B

    .line 270
    .line 271
    invoke-virtual {v1, v2, v8, v4}, La/uii;->B(Ljava/lang/String;Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;La/zje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-ne v1, v0, :cond_e

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_e
    :goto_7
    check-cast v1, La/a5w;

    .line 279
    .line 280
    iget-object v2, v6, La/kd7;->F:La/z7u;

    .line 281
    .line 282
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iput-object v1, v4, La/cd7;->j:La/a5w;

    .line 287
    .line 288
    iput-byte v5, v4, La/cd7;->l:B

    .line 289
    .line 290
    invoke-virtual {v2, v3, v4}, La/z7u;->a(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    if-ne v2, v0, :cond_f

    .line 295
    .line 296
    goto :goto_9

    .line 297
    :cond_f
    :goto_8
    check-cast v2, Ljava/util/List;

    .line 298
    .line 299
    iput-object v1, v4, La/cd7;->j:La/a5w;

    .line 300
    .line 301
    iput-object v2, v4, La/cd7;->k:Ljava/util/List;

    .line 302
    .line 303
    iput-byte v7, v4, La/cd7;->l:B

    .line 304
    .line 305
    sget-object v3, La/kd7;->m0:Ljava/util/List;

    .line 306
    .line 307
    invoke-virtual {v6, v1, v4}, La/kd7;->W(La/a5w;La/zje;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    if-ne v3, v0, :cond_10

    .line 312
    .line 313
    :goto_9
    move-object v1, v0

    .line 314
    goto :goto_b

    .line 315
    :cond_10
    move-object v15, v2

    .line 316
    goto :goto_6

    .line 317
    :goto_a
    move-object v11, v3

    .line 318
    check-cast v11, La/z760;

    .line 319
    .line 320
    sget-object v0, La/kd7;->m0:Ljava/util/List;

    .line 321
    .line 322
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 323
    .line 324
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 325
    .line 326
    :cond_11
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    move-object v7, v1

    .line 334
    check-cast v7, La/rc7;

    .line 335
    .line 336
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 337
    .line 338
    .line 339
    move-result-wide v20

    .line 340
    const-wide/16 v22, 0x0

    .line 341
    .line 342
    const v24, 0xfaffdd6

    .line 343
    .line 344
    .line 345
    sget-object v8, La/r9x;->a:La/r9x;

    .line 346
    .line 347
    const/4 v9, 0x0

    .line 348
    const/4 v12, 0x0

    .line 349
    const/4 v13, 0x0

    .line 350
    const/4 v14, 0x0

    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    const/16 v18, 0x0

    .line 356
    .line 357
    const/16 v19, 0x0

    .line 358
    .line 359
    invoke-static/range {v7 .. v24}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_11

    .line 368
    .line 369
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    :goto_b
    return-object v1

    .line 372
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 373
    .line 374
    iget-byte v8, v4, La/cd7;->l:B

    .line 375
    .line 376
    if-eqz v8, :cond_15

    .line 377
    .line 378
    if-eq v8, v3, :cond_14

    .line 379
    .line 380
    if-eq v8, v5, :cond_13

    .line 381
    .line 382
    if-ne v8, v7, :cond_12

    .line 383
    .line 384
    iget-object v0, v4, La/cd7;->k:Ljava/util/List;

    .line 385
    .line 386
    iget-object v1, v4, La/cd7;->j:La/a5w;

    .line 387
    .line 388
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    move-object/from16 v3, p1

    .line 392
    .line 393
    move-object v15, v0

    .line 394
    :goto_c
    move-object v10, v1

    .line 395
    goto :goto_10

    .line 396
    :cond_12
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    goto/16 :goto_11

    .line 400
    .line 401
    :cond_13
    iget-object v1, v4, La/cd7;->j:La/a5w;

    .line 402
    .line 403
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v2, p1

    .line 407
    .line 408
    goto :goto_e

    .line 409
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v1, p1

    .line 413
    .line 414
    goto :goto_d

    .line 415
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    iget-object v1, v6, La/kd7;->u:La/uii;

    .line 419
    .line 420
    iget-object v2, v6, La/kd7;->o:Ljava/lang/String;

    .line 421
    .line 422
    iget-object v8, v6, La/kd7;->p:Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 423
    .line 424
    iput-byte v3, v4, La/cd7;->l:B

    .line 425
    .line 426
    invoke-virtual {v1, v2, v8, v4}, La/uii;->B(Ljava/lang/String;Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;La/zje;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    if-ne v1, v0, :cond_16

    .line 431
    .line 432
    goto :goto_f

    .line 433
    :cond_16
    :goto_d
    check-cast v1, La/a5w;

    .line 434
    .line 435
    iget-object v2, v6, La/kd7;->F:La/z7u;

    .line 436
    .line 437
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    iput-object v1, v4, La/cd7;->j:La/a5w;

    .line 442
    .line 443
    iput-byte v5, v4, La/cd7;->l:B

    .line 444
    .line 445
    invoke-virtual {v2, v3, v4}, La/z7u;->a(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    if-ne v2, v0, :cond_17

    .line 450
    .line 451
    goto :goto_f

    .line 452
    :cond_17
    :goto_e
    check-cast v2, Ljava/util/List;

    .line 453
    .line 454
    iput-object v1, v4, La/cd7;->j:La/a5w;

    .line 455
    .line 456
    iput-object v2, v4, La/cd7;->k:Ljava/util/List;

    .line 457
    .line 458
    iput-byte v7, v4, La/cd7;->l:B

    .line 459
    .line 460
    sget-object v3, La/kd7;->m0:Ljava/util/List;

    .line 461
    .line 462
    invoke-virtual {v6, v1, v4}, La/kd7;->W(La/a5w;La/zje;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    if-ne v3, v0, :cond_18

    .line 467
    .line 468
    :goto_f
    move-object v1, v0

    .line 469
    goto :goto_11

    .line 470
    :cond_18
    move-object v15, v2

    .line 471
    goto :goto_c

    .line 472
    :goto_10
    move-object v11, v3

    .line 473
    check-cast v11, La/z760;

    .line 474
    .line 475
    sget-object v0, La/kd7;->m0:Ljava/util/List;

    .line 476
    .line 477
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 478
    .line 479
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 480
    .line 481
    :cond_19
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-object v7, v1

    .line 489
    check-cast v7, La/rc7;

    .line 490
    .line 491
    const-wide/16 v22, 0x0

    .line 492
    .line 493
    const v24, 0xffffdd6

    .line 494
    .line 495
    .line 496
    sget-object v8, La/r9x;->a:La/r9x;

    .line 497
    .line 498
    const/4 v9, 0x0

    .line 499
    const/4 v12, 0x0

    .line 500
    const/4 v13, 0x0

    .line 501
    const/4 v14, 0x0

    .line 502
    const/16 v16, 0x0

    .line 503
    .line 504
    const/16 v17, 0x0

    .line 505
    .line 506
    const/16 v18, 0x0

    .line 507
    .line 508
    const/16 v19, 0x0

    .line 509
    .line 510
    const-wide/16 v20, 0x0

    .line 511
    .line 512
    invoke-static/range {v7 .. v24}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-eqz v1, :cond_19

    .line 521
    .line 522
    invoke-virtual {v6}, La/kd7;->M()V

    .line 523
    .line 524
    .line 525
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    :goto_11
    return-object v1

    .line 528
    nop

    .line 529
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
