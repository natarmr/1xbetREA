.class public final La/wx60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dy60;


# direct methods
.method public synthetic constructor <init>(La/dy60;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wx60;->i:B

    iput-object p1, p0, La/wx60;->k:La/dy60;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wx60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wx60;->k:La/dy60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wx60;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wx60;-><init>(La/dy60;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/wx60;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/wx60;-><init>(La/dy60;La/yje;B)V

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
    iput-boolean p0, v0, La/wx60;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/wx60;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/wx60;-><init>(La/dy60;La/yje;B)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    iput-boolean p0, v0, La/wx60;->j:Z

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wx60;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wx60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wx60;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wx60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wx60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/wx60;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/wx60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    check-cast p2, La/yje;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, La/wx60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/wx60;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/wx60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wx60;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/wx60;->k:La/dy60;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v4, La/dy60;->q:La/wsf0;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/wx60;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, La/g45;

    .line 40
    .line 41
    invoke-virtual {v2}, La/g45;->y()La/ahu;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v6, La/bm5;->d:La/bm5;

    .line 46
    .line 47
    iput-boolean v3, v0, La/wx60;->j:Z

    .line 48
    .line 49
    invoke-virtual {v2, v6, v0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-ne v0, v5, :cond_2

    .line 54
    .line 55
    move-object v2, v5

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    check-cast v0, La/ql5;

    .line 58
    .line 59
    invoke-virtual {v1}, La/wsf0;->s()La/trm0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v2, La/bm5;->d:La/bm5;

    .line 64
    .line 65
    invoke-virtual {v1, v2, v0}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v4, La/dy60;->x:La/v88;

    .line 69
    .line 70
    iget-object v2, v4, La/dy60;->o:La/i1w0;

    .line 71
    .line 72
    iget-wide v4, v0, La/ql5;->a:J

    .line 73
    .line 74
    invoke-virtual {v1, v2, v3, v4, v5}, La/v88;->a(La/i1w0;ZJ)V

    .line 75
    .line 76
    .line 77
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_1
    return-object v2

    .line 80
    :pswitch_0
    iget-boolean v8, v0, La/wx60;->j:Z

    .line 81
    .line 82
    sget-object v0, La/wne;->a:La/wne;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v4, La/i3t0;->f:La/oyg0;

    .line 88
    .line 89
    iget-object v13, v4, La/i3t0;->i:La/ocj;

    .line 90
    .line 91
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/qx60;

    .line 96
    .line 97
    iget-boolean v9, v0, La/qx60;->d:Z

    .line 98
    .line 99
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/qx60;

    .line 104
    .line 105
    iget-object v0, v0, La/qx60;->c:La/cfp;

    .line 106
    .line 107
    iget-object v0, v0, La/cfp;->a:Ljava/util/List;

    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    move v15, v3

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    move v15, v14

    .line 115
    :goto_2
    iget-object v0, v4, La/dy60;->B:La/foi0;

    .line 116
    .line 117
    invoke-virtual {v0, v8}, La/foi0;->a(Z)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v13, La/ocj;->a:La/p7m0;

    .line 121
    .line 122
    :goto_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-object v6, v5

    .line 130
    move-object v5, v6

    .line 131
    check-cast v5, La/qx60;

    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    const/16 v12, 0xe7

    .line 135
    .line 136
    move-object v7, v6

    .line 137
    const/4 v6, 0x0

    .line 138
    move-object v10, v7

    .line 139
    const/4 v7, 0x0

    .line 140
    move-object/from16 v16, v10

    .line 141
    .line 142
    const/4 v10, 0x0

    .line 143
    move-object/from16 v3, v16

    .line 144
    .line 145
    invoke-static/range {v5 .. v12}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v0, v3, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_12

    .line 154
    .line 155
    if-nez v8, :cond_d

    .line 156
    .line 157
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, La/qx60;

    .line 162
    .line 163
    iget-object v0, v0, La/qx60;->c:La/cfp;

    .line 164
    .line 165
    iget-object v0, v0, La/cfp;->a:Ljava/util/List;

    .line 166
    .line 167
    iget-object v2, v4, La/dy60;->K:La/p7m0;

    .line 168
    .line 169
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, La/pat;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    instance-of v2, v2, La/oat;

    .line 179
    .line 180
    if-nez v2, :cond_5

    .line 181
    .line 182
    iget-object v2, v4, La/dy60;->L:La/p7m0;

    .line 183
    .line 184
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, La/pat;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    instance-of v2, v2, La/oat;

    .line 194
    .line 195
    if-eqz v2, :cond_4

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_4
    move v3, v14

    .line 199
    goto :goto_5

    .line 200
    :cond_5
    :goto_4
    const/4 v3, 0x1

    .line 201
    :goto_5
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    check-cast v2, La/qx60;

    .line 206
    .line 207
    iget-object v2, v2, La/qx60;->h:Ljava/lang/Throwable;

    .line 208
    .line 209
    instance-of v2, v2, La/sq60;

    .line 210
    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    goto/16 :goto_8

    .line 214
    .line 215
    :cond_6
    if-eqz v0, :cond_a

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_7

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_7
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, La/qx60;

    .line 229
    .line 230
    iget-boolean v0, v0, La/qx60;->e:Z

    .line 231
    .line 232
    if-eqz v0, :cond_9

    .line 233
    .line 234
    if-eqz v3, :cond_9

    .line 235
    .line 236
    new-instance v11, La/sq60;

    .line 237
    .line 238
    invoke-direct {v11}, Ljava/io/IOException;-><init>()V

    .line 239
    .line 240
    .line 241
    iget-object v0, v13, La/ocj;->a:La/p7m0;

    .line 242
    .line 243
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-object v5, v2

    .line 251
    check-cast v5, La/qx60;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    const/4 v10, 0x0

    .line 257
    const/16 v12, 0x7f

    .line 258
    .line 259
    const/4 v6, 0x0

    .line 260
    const/4 v7, 0x0

    .line 261
    const/4 v8, 0x0

    .line 262
    const/4 v9, 0x0

    .line 263
    invoke-static/range {v5 .. v12}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_8

    .line 272
    .line 273
    goto/16 :goto_8

    .line 274
    .line 275
    :cond_9
    iget-object v0, v4, La/dy60;->N:La/c4m0;

    .line 276
    .line 277
    if-eqz v0, :cond_11

    .line 278
    .line 279
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_8

    .line 283
    .line 284
    :cond_a
    :goto_6
    iget-object v0, v4, La/dy60;->N:La/c4m0;

    .line 285
    .line 286
    if-eqz v0, :cond_b

    .line 287
    .line 288
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 289
    .line 290
    .line 291
    :cond_b
    new-instance v8, Ljava/net/SocketTimeoutException;

    .line 292
    .line 293
    invoke-direct {v8}, Ljava/net/SocketTimeoutException;-><init>()V

    .line 294
    .line 295
    .line 296
    iget-object v0, v13, La/ocj;->a:La/p7m0;

    .line 297
    .line 298
    :goto_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-object v2, v10

    .line 306
    check-cast v2, La/qx60;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const/16 v9, 0x7f

    .line 313
    .line 314
    const/4 v3, 0x0

    .line 315
    const/4 v4, 0x0

    .line 316
    const/4 v5, 0x0

    .line 317
    const/4 v6, 0x0

    .line 318
    invoke-static/range {v2 .. v9}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    move-object v3, v8

    .line 323
    invoke-virtual {v0, v10, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_c

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_c
    move-object v8, v3

    .line 331
    goto :goto_7

    .line 332
    :cond_d
    if-eqz v8, :cond_10

    .line 333
    .line 334
    if-nez v15, :cond_e

    .line 335
    .line 336
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, La/qx60;

    .line 341
    .line 342
    iget-object v0, v0, La/qx60;->h:Ljava/lang/Throwable;

    .line 343
    .line 344
    if-eqz v0, :cond_10

    .line 345
    .line 346
    :cond_e
    iget-object v0, v13, La/ocj;->a:La/p7m0;

    .line 347
    .line 348
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-object v5, v1

    .line 356
    check-cast v5, La/qx60;

    .line 357
    .line 358
    iget-object v3, v5, La/qx60;->c:La/cfp;

    .line 359
    .line 360
    iget-object v3, v3, La/cfp;->b:Ljava/util/List;

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    new-instance v7, La/cfp;

    .line 366
    .line 367
    invoke-direct {v7, v2, v3}, La/cfp;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 368
    .line 369
    .line 370
    const/4 v11, 0x0

    .line 371
    const/16 v12, 0x7b

    .line 372
    .line 373
    const/4 v6, 0x0

    .line 374
    const/4 v8, 0x0

    .line 375
    const/4 v9, 0x0

    .line 376
    const/4 v10, 0x0

    .line 377
    invoke-static/range {v5 .. v12}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_f

    .line 386
    .line 387
    invoke-virtual {v4}, La/dy60;->N()V

    .line 388
    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_10
    if-eqz v8, :cond_11

    .line 392
    .line 393
    invoke-virtual {v4}, La/dy60;->N()V

    .line 394
    .line 395
    .line 396
    :cond_11
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :cond_12
    const/4 v3, 0x1

    .line 400
    goto/16 :goto_3

    .line 401
    .line 402
    :pswitch_1
    iget-boolean v0, v0, La/wx60;->j:Z

    .line 403
    .line 404
    sget-object v1, La/wne;->a:La/wne;

    .line 405
    .line 406
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    sget v1, La/dy60;->S:I

    .line 410
    .line 411
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 412
    .line 413
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 414
    .line 415
    :goto_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    move-object v3, v2

    .line 423
    check-cast v3, La/qx60;

    .line 424
    .line 425
    iget-object v5, v3, La/qx60;->b:La/gep;

    .line 426
    .line 427
    xor-int/lit8 v9, v0, 0x1

    .line 428
    .line 429
    const/4 v10, 0x7

    .line 430
    const/4 v6, 0x0

    .line 431
    const/4 v7, 0x0

    .line 432
    const/4 v8, 0x0

    .line 433
    invoke-static/range {v5 .. v10}, La/gep;->a(La/gep;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)La/gep;

    .line 434
    .line 435
    .line 436
    move-result-object v18

    .line 437
    const/16 v23, 0x0

    .line 438
    .line 439
    const/16 v24, 0xdd

    .line 440
    .line 441
    const/16 v19, 0x0

    .line 442
    .line 443
    const/16 v20, 0x0

    .line 444
    .line 445
    const/16 v21, 0x0

    .line 446
    .line 447
    move/from16 v22, v0

    .line 448
    .line 449
    move-object/from16 v17, v3

    .line 450
    .line 451
    invoke-static/range {v17 .. v24}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-eqz v0, :cond_14

    .line 460
    .line 461
    if-eqz v22, :cond_13

    .line 462
    .line 463
    invoke-virtual {v4}, La/dy60;->Q()V

    .line 464
    .line 465
    .line 466
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object v0

    .line 469
    :cond_14
    move/from16 v0, v22

    .line 470
    .line 471
    goto :goto_9

    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
