.class public final La/pqe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/uqe;


# direct methods
.method public synthetic constructor <init>(La/uqe;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pqe;->i:B

    iput-object p1, p0, La/pqe;->k:La/uqe;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/pqe;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pqe;->k:La/uqe;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/pqe;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/pqe;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/pqe;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/pqe;-><init>(La/uqe;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/pqe;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/pqe;-><init>(La/uqe;La/yje;B)V

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
    iget-byte v0, p0, La/pqe;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pqe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pqe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/pqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/pqe;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/pqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/pqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/pqe;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/pqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/pqe;->i:B

    .line 2
    .line 3
    const/16 v8, 0xa

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    iget-object v10, p0, La/pqe;->k:La/uqe;

    .line 7
    .line 8
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v11, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v3, p0, La/pqe;->j:Z

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    if-ne v3, v2, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v1, p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v10, La/uqe;->a:La/xqe;

    .line 36
    .line 37
    iput-boolean v2, p0, La/pqe;->j:Z

    .line 38
    .line 39
    invoke-virtual {v1}, La/xqe;->c()La/nqe;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v1, v1, La/nqe;->a:La/zdg0;

    .line 44
    .line 45
    new-instance v3, La/f1e;

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    const/4 v6, 0x5

    .line 49
    invoke-direct {v3, v4, v11, v6}, La/f1e;-><init>(ILa/yje;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v1, v3, v2, v9}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-ne v1, v0, :cond_2

    .line 57
    .line 58
    move-object v11, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    check-cast v1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    const-wide/16 v3, 0x0

    .line 67
    .line 68
    cmp-long v0, v0, v3

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    move v9, v2

    .line 73
    :cond_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    :goto_1
    return-object v11

    .line 78
    :pswitch_0
    iget-object v0, v10, La/uqe;->d:La/knf0;

    .line 79
    .line 80
    sget-object v6, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v3, p0, La/pqe;->j:Z

    .line 83
    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    if-ne v3, v2, :cond_4

    .line 87
    .line 88
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v0, p1

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v10, La/uqe;->c:La/lsn;

    .line 102
    .line 103
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iput-boolean v2, p0, La/pqe;->j:Z

    .line 117
    .line 118
    iget-object v0, v1, La/lsn;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/wgn;

    .line 121
    .line 122
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/qlt;

    .line 127
    .line 128
    const/4 v2, 0x1

    .line 129
    move-object v1, v3

    .line 130
    const/16 v3, 0x54d

    .line 131
    .line 132
    const/16 v4, 0x16

    .line 133
    .line 134
    move-object v5, p0

    .line 135
    invoke-interface/range {v0 .. v5}, La/qlt;->b(Ljava/lang/String;IIILa/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v0, v6, :cond_6

    .line 140
    .line 141
    move-object v11, v6

    .line 142
    goto :goto_6

    .line 143
    :cond_6
    :goto_2
    check-cast v0, La/q16;

    .line 144
    .line 145
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Ljava/lang/Iterable;

    .line 150
    .line 151
    new-instance v1, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_b

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, La/gm90;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v3, La/cm90;

    .line 180
    .line 181
    iget-object v4, v2, La/gm90;->a:Ljava/lang/Integer;

    .line 182
    .line 183
    if-eqz v4, :cond_a

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    iget-object v5, v2, La/gm90;->b:Ljava/lang/Integer;

    .line 190
    .line 191
    if-eqz v5, :cond_7

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    goto :goto_4

    .line 198
    :cond_7
    move v5, v9

    .line 199
    :goto_4
    iget-object v6, v2, La/gm90;->c:Ljava/lang/Integer;

    .line 200
    .line 201
    if-eqz v6, :cond_8

    .line 202
    .line 203
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    goto :goto_5

    .line 208
    :cond_8
    move v6, v9

    .line 209
    :goto_5
    iget-object v2, v2, La/gm90;->d:Ljava/lang/String;

    .line 210
    .line 211
    if-eqz v2, :cond_9

    .line 212
    .line 213
    invoke-direct {v3, v4, v5, v6, v2}, La/cm90;-><init>(IIILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_9
    invoke-static {v11}, La/jf4;->k(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_a
    invoke-static {v11}, La/jf4;->k(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_b
    move-object v11, v1

    .line 229
    :goto_6
    return-object v11

    .line 230
    :pswitch_1
    iget-object v0, v10, La/uqe;->d:La/knf0;

    .line 231
    .line 232
    sget-object v12, La/wne;->a:La/wne;

    .line 233
    .line 234
    iget-boolean v3, p0, La/pqe;->j:Z

    .line 235
    .line 236
    if-eqz v3, :cond_d

    .line 237
    .line 238
    if-ne v3, v2, :cond_c

    .line 239
    .line 240
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    move-object v0, p1

    .line 244
    goto :goto_7

    .line 245
    :cond_c
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_c

    .line 249
    .line 250
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    iget-object v1, v10, La/uqe;->c:La/lsn;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, La/knf0;->b()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    iput-boolean v2, p0, La/pqe;->j:Z

    .line 273
    .line 274
    iget-object v0, v1, La/lsn;->a:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, La/wgn;

    .line 277
    .line 278
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, La/qlt;

    .line 283
    .line 284
    const-string v1, "application/vnd.xenvelop+json"

    .line 285
    .line 286
    const/4 v2, 0x1

    .line 287
    move v5, v3

    .line 288
    const/16 v3, 0x54d

    .line 289
    .line 290
    const/16 v4, 0x16

    .line 291
    .line 292
    move-object v7, p0

    .line 293
    invoke-interface/range {v0 .. v7}, La/qlt;->c(Ljava/lang/String;IIIILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-ne v0, v12, :cond_e

    .line 298
    .line 299
    move-object v11, v12

    .line 300
    goto/16 :goto_c

    .line 301
    .line 302
    :cond_e
    :goto_7
    check-cast v0, La/dx5;

    .line 303
    .line 304
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Ljava/util/Collection;

    .line 309
    .line 310
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-nez v1, :cond_15

    .line 315
    .line 316
    check-cast v0, Ljava/lang/Iterable;

    .line 317
    .line 318
    new-instance v11, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_14

    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, La/s52;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    new-instance v2, La/p52;

    .line 347
    .line 348
    iget-object v3, v1, La/s52;->a:Ljava/lang/Integer;

    .line 349
    .line 350
    const/4 v4, -0x1

    .line 351
    if-eqz v3, :cond_f

    .line 352
    .line 353
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    goto :goto_9

    .line 358
    :cond_f
    move v3, v4

    .line 359
    :goto_9
    iget-object v5, v1, La/s52;->b:Ljava/lang/String;

    .line 360
    .line 361
    if-nez v5, :cond_10

    .line 362
    .line 363
    const-string v5, ""

    .line 364
    .line 365
    :cond_10
    iget-object v6, v1, La/s52;->c:Ljava/lang/Integer;

    .line 366
    .line 367
    if-eqz v6, :cond_11

    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    goto :goto_a

    .line 374
    :cond_11
    move v6, v4

    .line 375
    :goto_a
    iget-object v7, v1, La/s52;->d:Ljava/lang/Integer;

    .line 376
    .line 377
    if-eqz v7, :cond_12

    .line 378
    .line 379
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    :cond_12
    iget-object v1, v1, La/s52;->e:Ljava/lang/Boolean;

    .line 384
    .line 385
    if-eqz v1, :cond_13

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    move v7, v6

    .line 392
    move v6, v4

    .line 393
    move-object v4, v5

    .line 394
    move v5, v7

    .line 395
    move v7, v1

    .line 396
    goto :goto_b

    .line 397
    :cond_13
    move v7, v6

    .line 398
    move v6, v4

    .line 399
    move-object v4, v5

    .line 400
    move v5, v7

    .line 401
    move v7, v9

    .line 402
    :goto_b
    invoke-direct/range {v2 .. v7}, La/p52;-><init>(ILjava/lang/String;IIZ)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    goto :goto_8

    .line 409
    :cond_14
    iget-object v0, v10, La/uqe;->b:La/ukt;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object v0, v0, La/ukt;->c:Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_c

    .line 420
    :cond_15
    invoke-static {v11}, La/jf4;->k(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    :goto_c
    return-object v11

    .line 424
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 425
    .line 426
    iget-boolean v3, p0, La/pqe;->j:Z

    .line 427
    .line 428
    if-eqz v3, :cond_17

    .line 429
    .line 430
    if-ne v3, v2, :cond_16

    .line 431
    .line 432
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    move-object v0, p1

    .line 436
    goto :goto_d

    .line 437
    :cond_16
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    move-object v0, v11

    .line 441
    goto :goto_d

    .line 442
    :cond_17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    iget-object v1, v10, La/uqe;->a:La/xqe;

    .line 446
    .line 447
    iput-boolean v2, p0, La/pqe;->j:Z

    .line 448
    .line 449
    invoke-virtual {v1, p0}, La/xqe;->a(La/zje;)Ljava/io/Serializable;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    if-ne v1, v0, :cond_18

    .line 454
    .line 455
    goto :goto_d

    .line 456
    :cond_18
    move-object v0, v1

    .line 457
    :goto_d
    return-object v0

    .line 458
    nop

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
