.class public final La/bc1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/kc1;


# direct methods
.method public synthetic constructor <init>(La/kc1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bc1;->i:B

    iput-object p1, p0, La/bc1;->k:La/kc1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/bc1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bc1;->k:La/kc1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/bc1;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/bc1;-><init>(La/kc1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/bc1;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/bc1;-><init>(La/kc1;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/bc1;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/bc1;-><init>(La/kc1;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/bc1;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/bc1;-><init>(La/kc1;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
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
    iget-byte v0, p0, La/bc1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/bc1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bc1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bc1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/bc1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/bc1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/bc1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/bc1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/bc1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/bc1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/bc1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/bc1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/bc1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bc1;->i:B

    .line 4
    .line 5
    sget-object v2, La/gb1;->a:La/gb1;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v0, La/bc1;->k:La/kc1;

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
    iget-boolean v2, v0, La/bc1;->j:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    if-ne v2, v6, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v5, La/kc1;->L:La/es;

    .line 38
    .line 39
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, La/xb1;

    .line 44
    .line 45
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 46
    .line 47
    iget-wide v3, v3, La/db1;->a:J

    .line 48
    .line 49
    iput-boolean v6, v0, La/bc1;->j:Z

    .line 50
    .line 51
    invoke-virtual {v2, v3, v4, v0}, La/es;->r(JLa/bnn0;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-ne v0, v1, :cond_2

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    check-cast v0, La/mlr;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    new-instance v1, La/o00;

    .line 64
    .line 65
    const/16 v2, 0xf

    .line 66
    .line 67
    invoke-direct {v1, v0, v2}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    sget-object v2, La/kc1;->P:Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 73
    .line 74
    .line 75
    iget-wide v1, v0, La/mlr;->c:J

    .line 76
    .line 77
    invoke-virtual {v5, v1, v2}, La/kc1;->U(J)V

    .line 78
    .line 79
    .line 80
    iget-wide v12, v0, La/mlr;->b:J

    .line 81
    .line 82
    sget-object v0, La/kc1;->P:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/xb1;

    .line 89
    .line 90
    iget-wide v1, v1, La/xb1;->f:J

    .line 91
    .line 92
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 103
    .line 104
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 105
    .line 106
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v2, v5, La/i3t0;->f:La/oyg0;

    .line 114
    .line 115
    move-object v6, v1

    .line 116
    check-cast v6, La/xb1;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v17, 0x7df

    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    const-wide/16 v10, 0x0

    .line 129
    .line 130
    const-wide/16 v14, 0x0

    .line 131
    .line 132
    invoke-static/range {v6 .. v17}, La/xb1;->a(La/xb1;La/db1;La/f02;ZJJJZI)La/xb1;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_3

    .line 141
    .line 142
    :cond_4
    sget-object v0, La/kc1;->P:Ljava/util/List;

    .line 143
    .line 144
    invoke-virtual {v5}, La/kc1;->M()V

    .line 145
    .line 146
    .line 147
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_1
    return-object v3

    .line 150
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 151
    .line 152
    iget-boolean v7, v0, La/bc1;->j:Z

    .line 153
    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    if-ne v7, v6, :cond_5

    .line 157
    .line 158
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    move-object/from16 v0, p1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v3, v5, La/kc1;->H:La/nrt;

    .line 172
    .line 173
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, La/xb1;

    .line 178
    .line 179
    iget-wide v7, v4, La/xb1;->g:J

    .line 180
    .line 181
    iput-boolean v6, v0, La/bc1;->j:Z

    .line 182
    .line 183
    invoke-static {v3, v7, v8, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-ne v0, v1, :cond_7

    .line 188
    .line 189
    move-object v3, v1

    .line 190
    goto :goto_4

    .line 191
    :cond_7
    :goto_2
    check-cast v0, La/ql5;

    .line 192
    .line 193
    iget-object v0, v0, La/ql5;->i:La/txs0;

    .line 194
    .line 195
    invoke-virtual {v0}, La/txs0;->a()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_8

    .line 200
    .line 201
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, La/xb1;

    .line 206
    .line 207
    iget-object v1, v1, La/xb1;->a:La/db1;

    .line 208
    .line 209
    iget-boolean v1, v1, La/db1;->f:Z

    .line 210
    .line 211
    if-eqz v1, :cond_8

    .line 212
    .line 213
    sget-object v0, La/vb1;->a:La/vb1;

    .line 214
    .line 215
    invoke-virtual {v5, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_8
    if-eqz v0, :cond_9

    .line 220
    .line 221
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, La/xb1;

    .line 226
    .line 227
    iget-object v0, v0, La/xb1;->a:La/db1;

    .line 228
    .line 229
    iget-boolean v0, v0, La/db1;->e:Z

    .line 230
    .line 231
    if-eqz v0, :cond_9

    .line 232
    .line 233
    invoke-virtual {v5, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_9
    sget-object v0, La/kc1;->P:Ljava/util/List;

    .line 238
    .line 239
    invoke-virtual {v5}, La/kc1;->T()V

    .line 240
    .line 241
    .line 242
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    :goto_4
    return-object v3

    .line 245
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 246
    .line 247
    iget-boolean v7, v0, La/bc1;->j:Z

    .line 248
    .line 249
    if-eqz v7, :cond_b

    .line 250
    .line 251
    if-ne v7, v6, :cond_a

    .line 252
    .line 253
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    move-object/from16 v0, p1

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iget-object v3, v5, La/kc1;->H:La/nrt;

    .line 267
    .line 268
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    check-cast v4, La/xb1;

    .line 273
    .line 274
    iget-wide v7, v4, La/xb1;->g:J

    .line 275
    .line 276
    iput-boolean v6, v0, La/bc1;->j:Z

    .line 277
    .line 278
    invoke-static {v3, v7, v8, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-ne v0, v1, :cond_c

    .line 283
    .line 284
    move-object v3, v1

    .line 285
    goto :goto_7

    .line 286
    :cond_c
    :goto_5
    check-cast v0, La/ql5;

    .line 287
    .line 288
    iget-object v0, v0, La/ql5;->i:La/txs0;

    .line 289
    .line 290
    invoke-virtual {v0}, La/txs0;->a()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_d

    .line 295
    .line 296
    sget-object v0, La/kc1;->P:Ljava/util/List;

    .line 297
    .line 298
    invoke-virtual {v5, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_d
    sget-object v0, La/kc1;->P:Ljava/util/List;

    .line 303
    .line 304
    invoke-virtual {v5}, La/kc1;->R()V

    .line 305
    .line 306
    .line 307
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    :goto_7
    return-object v3

    .line 310
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 311
    .line 312
    iget-boolean v2, v0, La/bc1;->j:Z

    .line 313
    .line 314
    if-eqz v2, :cond_f

    .line 315
    .line 316
    if-ne v2, v6, :cond_e

    .line 317
    .line 318
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v0, p1

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_e
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    iget-object v2, v5, La/kc1;->F:La/nou;

    .line 332
    .line 333
    iput-boolean v6, v0, La/bc1;->j:Z

    .line 334
    .line 335
    invoke-static {v2, v0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-ne v0, v1, :cond_10

    .line 340
    .line 341
    move-object v3, v1

    .line 342
    goto :goto_9

    .line 343
    :cond_10
    :goto_8
    check-cast v0, La/ql5;

    .line 344
    .line 345
    iget-object v1, v5, La/kc1;->E:La/trm0;

    .line 346
    .line 347
    sget-object v2, La/bm5;->e:La/bm5;

    .line 348
    .line 349
    invoke-virtual {v1, v2, v0}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 350
    .line 351
    .line 352
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 353
    .line 354
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 355
    .line 356
    :cond_11
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-object v6, v2

    .line 364
    check-cast v6, La/xb1;

    .line 365
    .line 366
    iget-wide v14, v0, La/ql5;->a:J

    .line 367
    .line 368
    const/16 v16, 0x0

    .line 369
    .line 370
    const/16 v17, 0x7bf

    .line 371
    .line 372
    const/4 v7, 0x0

    .line 373
    const/4 v8, 0x0

    .line 374
    const/4 v9, 0x0

    .line 375
    const-wide/16 v10, 0x0

    .line 376
    .line 377
    const-wide/16 v12, 0x0

    .line 378
    .line 379
    invoke-static/range {v6 .. v17}, La/xb1;->a(La/xb1;La/db1;La/f02;ZJJJZI)La/xb1;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_11

    .line 388
    .line 389
    invoke-virtual {v5}, La/kc1;->T()V

    .line 390
    .line 391
    .line 392
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    :goto_9
    return-object v3

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
