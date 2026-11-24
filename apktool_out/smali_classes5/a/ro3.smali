.class public final La/ro3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/to3;


# direct methods
.method public synthetic constructor <init>(La/to3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ro3;->i:B

    iput-object p1, p0, La/ro3;->k:La/to3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ro3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ro3;->k:La/to3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ro3;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ro3;-><init>(La/to3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ro3;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ro3;-><init>(La/to3;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/ro3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/ro3;-><init>(La/to3;La/yje;B)V

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
    iget-byte v0, p0, La/ro3;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ro3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ro3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ro3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ro3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ro3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ro3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ro3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ro3;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ro3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/ro3;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/ro3;->k:La/to3;

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v3, La/to3;->s:La/qoj0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v8, p0, La/ro3;->j:B

    .line 20
    .line 21
    if-eqz v8, :cond_3

    .line 22
    .line 23
    if-eq v8, v7, :cond_2

    .line 24
    .line 25
    if-eq v8, v6, :cond_1

    .line 26
    .line 27
    if-ne v8, v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_5

    .line 34
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v3, La/to3;->r:Ljava/lang/Long;

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v10

    .line 60
    const-wide/16 v12, 0x3a98

    .line 61
    .line 62
    sub-long/2addr v10, v12

    .line 63
    cmp-long p1, v8, v10

    .line 64
    .line 65
    if-gez p1, :cond_5

    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    new-instance v0, Ljava/lang/Long;

    .line 72
    .line 73
    invoke-direct {v0, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 74
    .line 75
    .line 76
    iput-object v0, v3, La/to3;->r:Ljava/lang/Long;

    .line 77
    .line 78
    invoke-virtual {v3}, La/to3;->g()V

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    iput-byte v7, p0, La/ro3;->j:B

    .line 83
    .line 84
    const-wide/16 v2, 0x5dc

    .line 85
    .line 86
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_6

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    :goto_2
    invoke-virtual {v0}, La/qoj0;->d()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, La/f56;

    .line 102
    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    iput-byte v6, p0, La/ro3;->j:B

    .line 106
    .line 107
    invoke-virtual {v0, p1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, v1, :cond_8

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    iput-byte v4, p0, La/ro3;->j:B

    .line 115
    .line 116
    sget-object p1, La/c56;->a:La/c56;

    .line 117
    .line 118
    invoke-virtual {v0, p1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-ne p0, v1, :cond_8

    .line 123
    .line 124
    :goto_3
    move-object v5, v1

    .line 125
    goto :goto_5

    .line 126
    :cond_8
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    :goto_5
    return-object v5

    .line 129
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 130
    .line 131
    iget-byte v8, p0, La/ro3;->j:B

    .line 132
    .line 133
    const/4 v9, 0x5

    .line 134
    const/4 v10, 0x4

    .line 135
    if-eqz v8, :cond_d

    .line 136
    .line 137
    if-eq v8, v7, :cond_c

    .line 138
    .line 139
    if-eq v8, v6, :cond_b

    .line 140
    .line 141
    if-eq v8, v4, :cond_a

    .line 142
    .line 143
    if-eq v8, v10, :cond_a

    .line 144
    .line 145
    if-ne v8, v9, :cond_9

    .line 146
    .line 147
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_b

    .line 151
    .line 152
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_c

    .line 156
    .line 157
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_9

    .line 161
    .line 162
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, v3, La/to3;->b:La/h0q0;

    .line 174
    .line 175
    iget-object v2, v3, La/to3;->j:La/n0o0;

    .line 176
    .line 177
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, La/sff0;

    .line 182
    .line 183
    iget-boolean v2, v2, La/sff0;->J1:Z

    .line 184
    .line 185
    iput-byte v7, p0, La/ro3;->j:B

    .line 186
    .line 187
    invoke-virtual {p1, v7, v2, p0}, La/h0q0;->x(ZZLa/zje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    if-ne p1, v0, :cond_e

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_e
    :goto_6
    check-cast p1, La/gmq;

    .line 195
    .line 196
    new-instance v2, La/no3;

    .line 197
    .line 198
    invoke-direct {v2, v3, v5, v7}, La/no3;-><init>(La/to3;La/yje;B)V

    .line 199
    .line 200
    .line 201
    new-instance v5, La/dnq;

    .line 202
    .line 203
    invoke-direct {v5, p1, v2, v7}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 204
    .line 205
    .line 206
    iput-byte v6, p0, La/ro3;->j:B

    .line 207
    .line 208
    invoke-static {v5, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-ne p1, v0, :cond_f

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_f
    :goto_7
    check-cast p1, Ljava/lang/Iterable;

    .line 216
    .line 217
    new-instance v2, Ljava/util/ArrayList;

    .line 218
    .line 219
    const/16 v5, 0xa

    .line 220
    .line 221
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-eqz v5, :cond_10

    .line 237
    .line 238
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, La/d0t;

    .line 243
    .line 244
    invoke-static {v5}, La/mym0;->r(La/d0t;)La/xdv0;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_11

    .line 257
    .line 258
    iput-byte v4, p0, La/ro3;->j:B

    .line 259
    .line 260
    invoke-virtual {v3, v2, p0}, La/to3;->f(Ljava/util/List;La/bnn0;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    if-ne p1, v0, :cond_12

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_11
    new-array p1, v6, [La/pev0;

    .line 268
    .line 269
    sget-object v4, La/cun;->a:La/cun;

    .line 270
    .line 271
    aput-object v4, p1, v1

    .line 272
    .line 273
    sget-object v1, La/yde0;->a:La/yde0;

    .line 274
    .line 275
    aput-object v1, p1, v7

    .line 276
    .line 277
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    iput-byte v10, p0, La/ro3;->j:B

    .line 286
    .line 287
    invoke-virtual {v3, p1, p0}, La/to3;->f(Ljava/util/List;La/bnn0;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    if-ne p1, v0, :cond_12

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_12
    :goto_9
    iput-byte v9, p0, La/ro3;->j:B

    .line 295
    .line 296
    const-wide/16 v1, 0x7530

    .line 297
    .line 298
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    if-ne p0, v0, :cond_13

    .line 303
    .line 304
    :goto_a
    move-object v5, v0

    .line 305
    goto :goto_c

    .line 306
    :cond_13
    :goto_b
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    :goto_c
    return-object v5

    .line 309
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 310
    .line 311
    iget-byte v8, p0, La/ro3;->j:B

    .line 312
    .line 313
    if-eqz v8, :cond_17

    .line 314
    .line 315
    if-eq v8, v7, :cond_16

    .line 316
    .line 317
    if-eq v8, v6, :cond_15

    .line 318
    .line 319
    if-ne v8, v4, :cond_14

    .line 320
    .line 321
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto :goto_12

    .line 325
    :cond_14
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto :goto_13

    .line 329
    :cond_15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    goto :goto_e

    .line 333
    :cond_16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto :goto_d

    .line 337
    :cond_17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    iput-byte v7, p0, La/ro3;->j:B

    .line 341
    .line 342
    invoke-virtual {v3, p0}, La/to3;->e(La/zje;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    if-ne p1, v0, :cond_18

    .line 347
    .line 348
    goto :goto_11

    .line 349
    :cond_18
    :goto_d
    iget-object p1, v3, La/to3;->a:La/vkr0;

    .line 350
    .line 351
    iput-byte v6, p0, La/ro3;->j:B

    .line 352
    .line 353
    invoke-virtual {p1, p0}, La/vkr0;->t(La/zje;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    if-ne p1, v0, :cond_19

    .line 358
    .line 359
    goto :goto_11

    .line 360
    :cond_19
    :goto_e
    check-cast p1, La/gmq;

    .line 361
    .line 362
    new-instance v2, La/lr;

    .line 363
    .line 364
    const/16 v8, 0x13

    .line 365
    .line 366
    invoke-direct {v2, p1, v8}, La/lr;-><init>(La/gmq;B)V

    .line 367
    .line 368
    .line 369
    new-instance p1, La/no3;

    .line 370
    .line 371
    invoke-direct {p1, v3, v5, v1}, La/no3;-><init>(La/to3;La/yje;B)V

    .line 372
    .line 373
    .line 374
    new-instance v1, La/dnq;

    .line 375
    .line 376
    invoke-direct {v1, v2, p1, v7}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 377
    .line 378
    .line 379
    new-instance p1, La/oa;

    .line 380
    .line 381
    const/16 v2, 0x10

    .line 382
    .line 383
    invoke-direct {p1, v3, v5, v2}, La/oa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 384
    .line 385
    .line 386
    iput-byte v4, p0, La/ro3;->j:B

    .line 387
    .line 388
    new-instance v2, La/vnq;

    .line 389
    .line 390
    sget-object v3, La/h660;->a:La/h660;

    .line 391
    .line 392
    invoke-direct {v2, v3, p1, v6}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v2, p0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    if-ne p0, v0, :cond_1a

    .line 400
    .line 401
    goto :goto_f

    .line 402
    :cond_1a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    :goto_f
    if-ne p0, v0, :cond_1b

    .line 405
    .line 406
    goto :goto_10

    .line 407
    :cond_1b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    :goto_10
    if-ne p0, v0, :cond_1c

    .line 410
    .line 411
    :goto_11
    move-object v5, v0

    .line 412
    goto :goto_13

    .line 413
    :cond_1c
    :goto_12
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    :goto_13
    return-object v5

    .line 416
    nop

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
