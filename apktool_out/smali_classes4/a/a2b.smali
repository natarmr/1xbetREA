.class public final La/a2b;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/h2b;


# direct methods
.method public synthetic constructor <init>(La/h2b;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a2b;->i:B

    iput-object p1, p0, La/a2b;->k:La/h2b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a2b;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a2b;->k:La/h2b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/a2b;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/a2b;-><init>(La/h2b;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/a2b;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/a2b;-><init>(La/h2b;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/a2b;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/a2b;-><init>(La/h2b;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/a2b;->j:Z

    .line 35
    .line 36
    return-object v0

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
    iget-byte v0, p0, La/a2b;->i:B

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
    invoke-virtual {p0, p1, p2}, La/a2b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a2b;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a2b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/a2b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/a2b;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/a2b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/a2b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/a2b;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/a2b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a2b;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/a2b;->k:La/h2b;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/a2b;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v4, La/h2b;->f:La/o470;

    .line 34
    .line 35
    iput-boolean v5, v0, La/a2b;->j:Z

    .line 36
    .line 37
    iget-object v2, v2, La/o470;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La/d0b;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, La/d0b;->e(La/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    move-object v3, v1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    iget-object v0, v4, La/h2b;->i:La/u58;

    .line 50
    .line 51
    iget-object v0, v0, La/u58;->a:La/kt2;

    .line 52
    .line 53
    const-string v1, "games_cashback_withdraw_done"

    .line 54
    .line 55
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v4, La/h2b;->D:La/ix0;

    .line 59
    .line 60
    iget-object v0, v0, La/ix0;->a:La/s1p;

    .line 61
    .line 62
    const-wide/16 v1, 0xd09

    .line 63
    .line 64
    sget-object v3, La/xun;->a:La/xun;

    .line 65
    .line 66
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 67
    .line 68
    .line 69
    sget-object v0, La/s1b;->a:La/s1b;

    .line 70
    .line 71
    invoke-virtual {v4, v0}, La/h2b;->A(La/y1b;)V

    .line 72
    .line 73
    .line 74
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_1
    return-object v3

    .line 77
    :pswitch_0
    iget-object v1, v4, La/h2b;->y:La/wsf0;

    .line 78
    .line 79
    sget-object v6, La/wne;->a:La/wne;

    .line 80
    .line 81
    iget-boolean v7, v0, La/a2b;->j:Z

    .line 82
    .line 83
    if-eqz v7, :cond_4

    .line 84
    .line 85
    if-ne v7, v5, :cond_3

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 v0, p1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, La/g45;

    .line 103
    .line 104
    invoke-virtual {v2}, La/g45;->G()La/khf0;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    sget-object v3, La/bm5;->d:La/bm5;

    .line 109
    .line 110
    iput-boolean v5, v0, La/a2b;->j:Z

    .line 111
    .line 112
    sget-object v7, La/tl5;->c:La/tl5;

    .line 113
    .line 114
    invoke-virtual {v2, v3, v7, v0}, La/khf0;->A(La/bm5;La/tl5;La/yje;)Ljava/io/Serializable;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-ne v0, v6, :cond_5

    .line 119
    .line 120
    move-object v3, v6

    .line 121
    goto :goto_3

    .line 122
    :cond_5
    :goto_2
    check-cast v0, La/ql5;

    .line 123
    .line 124
    invoke-virtual {v1}, La/wsf0;->s()La/trm0;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    sget-object v2, La/bm5;->d:La/bm5;

    .line 129
    .line 130
    invoke-virtual {v1, v2, v0}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v4, La/h2b;->q:La/v88;

    .line 134
    .line 135
    iget-object v2, v4, La/h2b;->b:La/i1w0;

    .line 136
    .line 137
    iget-wide v3, v0, La/ql5;->a:J

    .line 138
    .line 139
    invoke-virtual {v1, v2, v5, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 140
    .line 141
    .line 142
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    :goto_3
    return-object v3

    .line 145
    :pswitch_1
    iget-boolean v0, v0, La/a2b;->j:Z

    .line 146
    .line 147
    sget-object v1, La/wne;->a:La/wne;

    .line 148
    .line 149
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    if-eqz v0, :cond_7

    .line 154
    .line 155
    iget-boolean v2, v4, La/h2b;->Q:Z

    .line 156
    .line 157
    if-nez v2, :cond_7

    .line 158
    .line 159
    iget-object v2, v4, La/h2b;->V:La/p7m0;

    .line 160
    .line 161
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    move-object v6, v3

    .line 166
    check-cast v6, La/q1b;

    .line 167
    .line 168
    new-instance v7, La/p1b;

    .line 169
    .line 170
    new-instance v8, La/jza;

    .line 171
    .line 172
    sget-object v9, La/a570;->Companion:La/t470;

    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const-wide/16 v9, -0x1

    .line 178
    .line 179
    invoke-static {v1, v9, v10}, La/t470;->a(ZJ)La/a570;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    sget-object v10, La/iun;->a:La/iun;

    .line 184
    .line 185
    const-wide/16 v23, 0x0

    .line 186
    .line 187
    const-wide/16 v25, 0x0

    .line 188
    .line 189
    const-wide/16 v11, 0x0

    .line 190
    .line 191
    const-string v13, ""

    .line 192
    .line 193
    const-wide/16 v14, 0x0

    .line 194
    .line 195
    const-wide/16 v17, 0x0

    .line 196
    .line 197
    const-wide/16 v19, 0x0

    .line 198
    .line 199
    const-wide/16 v21, 0x0

    .line 200
    .line 201
    move-object/from16 v16, v10

    .line 202
    .line 203
    invoke-direct/range {v8 .. v26}, La/jza;-><init>(La/a570;Ljava/util/List;DLjava/lang/String;DLjava/util/List;DDDDJ)V

    .line 204
    .line 205
    .line 206
    const-string v12, ""

    .line 207
    .line 208
    const/4 v13, 0x1

    .line 209
    const-string v9, ""

    .line 210
    .line 211
    const/4 v10, 0x0

    .line 212
    const-string v11, ""

    .line 213
    .line 214
    invoke-direct/range {v7 .. v13}, La/p1b;-><init>(La/jza;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 215
    .line 216
    .line 217
    const/4 v11, 0x7

    .line 218
    move-object v10, v7

    .line 219
    const/4 v7, 0x0

    .line 220
    const/4 v8, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    invoke-static/range {v6 .. v11}, La/q1b;->a(La/q1b;La/o1b;La/o1b;La/o1b;La/p1b;I)La/q1b;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_6

    .line 231
    .line 232
    invoke-virtual {v4, v5}, La/h2b;->D(Z)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :cond_7
    if-nez v0, :cond_e

    .line 238
    .line 239
    iget-object v2, v4, La/h2b;->Y:La/p7m0;

    .line 240
    .line 241
    iget-object v6, v4, La/h2b;->S:La/p7m0;

    .line 242
    .line 243
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    check-cast v6, La/pat;

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    instance-of v6, v6, La/oat;

    .line 253
    .line 254
    if-nez v6, :cond_9

    .line 255
    .line 256
    iget-object v6, v4, La/h2b;->T:La/p7m0;

    .line 257
    .line 258
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    check-cast v6, La/pat;

    .line 263
    .line 264
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    instance-of v6, v6, La/oat;

    .line 268
    .line 269
    if-eqz v6, :cond_8

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_8
    move v5, v1

    .line 273
    :cond_9
    :goto_4
    iget-boolean v1, v4, La/h2b;->Q:Z

    .line 274
    .line 275
    if-eqz v1, :cond_a

    .line 276
    .line 277
    if-eqz v5, :cond_a

    .line 278
    .line 279
    invoke-virtual {v4}, La/h2b;->B()V

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_a
    if-nez v1, :cond_c

    .line 284
    .line 285
    if-eqz v5, :cond_c

    .line 286
    .line 287
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    move-object v5, v1

    .line 292
    check-cast v5, La/r1b;

    .line 293
    .line 294
    invoke-virtual {v4}, La/h2b;->w()La/ra10;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    new-instance v5, La/r1b;

    .line 302
    .line 303
    invoke-direct {v5, v6, v3}, La/r1b;-><init>(La/ra10;La/jkm;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-eqz v1, :cond_b

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    move-object v5, v1

    .line 318
    check-cast v5, La/r1b;

    .line 319
    .line 320
    iget-boolean v6, v4, La/h2b;->P:Z

    .line 321
    .line 322
    if-eqz v6, :cond_d

    .line 323
    .line 324
    move-object v6, v3

    .line 325
    goto :goto_5

    .line 326
    :cond_d
    iget-object v6, v4, La/h2b;->M:La/c4m0;

    .line 327
    .line 328
    invoke-static {v6}, La/v3c;->N(La/bby;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4}, La/h2b;->w()La/ra10;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    :goto_5
    iget-object v5, v5, La/r1b;->b:La/jkm;

    .line 336
    .line 337
    new-instance v7, La/r1b;

    .line 338
    .line 339
    invoke-direct {v7, v6, v5}, La/r1b;-><init>(La/ra10;La/jkm;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v1, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-eqz v1, :cond_c

    .line 347
    .line 348
    :cond_e
    :goto_6
    iput-boolean v0, v4, La/h2b;->Q:Z

    .line 349
    .line 350
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object v0

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
