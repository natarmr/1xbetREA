.class public final La/kfr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/ofr0;


# direct methods
.method public synthetic constructor <init>(La/ofr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kfr0;->i:B

    iput-object p1, p0, La/kfr0;->k:La/ofr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/kfr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kfr0;->k:La/ofr0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/kfr0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/kfr0;-><init>(La/ofr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/kfr0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/kfr0;-><init>(La/ofr0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/kfr0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/kfr0;-><init>(La/ofr0;La/yje;B)V

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
    iget-byte v0, p0, La/kfr0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kfr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/kfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/kfr0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/kfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/kfr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/kfr0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/kfr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/kfr0;->i:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    sget-object v2, La/g1r0;->a:La/g1r0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v4, p0, La/kfr0;->k:La/ofr0;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    sget-object v7, La/f1r0;->a:La/f1r0;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v0, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, p0, La/kfr0;->j:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v5, :cond_1

    .line 26
    .line 27
    if-ne v9, v6, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-byte v5, p0, La/kfr0;->j:B

    .line 46
    .line 47
    sget p1, La/ofr0;->U0:I

    .line 48
    .line 49
    invoke-virtual {v4, p0}, La/ofr0;->O(La/zje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_0
    iget-object p1, v4, La/ofr0;->K:La/lbu;

    .line 57
    .line 58
    iput-byte v6, p0, La/kfr0;->j:B

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v6, 0x3

    .line 62
    invoke-static {p1, v3, p0, v6}, La/lbu;->k(La/lbu;ILa/yje;I)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v0, :cond_4

    .line 67
    .line 68
    :goto_1
    move-object v8, v0

    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_4
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 72
    .line 73
    iget-object p0, v4, La/ofr0;->W:La/o470;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v0, La/mz60;->g:La/mz60;

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz p1, :cond_8

    .line 85
    .line 86
    new-instance v3, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, La/pbv;

    .line 110
    .line 111
    new-instance v9, La/mz60;

    .line 112
    .line 113
    iget-object v10, p0, La/o470;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v10, La/ntu;

    .line 116
    .line 117
    invoke-virtual {v10}, La/ntu;->a()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-direct {v9, v8, v10}, La/mz60;-><init>(La/pbv;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    move-object v8, v6

    .line 148
    check-cast v8, La/mz60;

    .line 149
    .line 150
    iget-object v9, v8, La/mz60;->b:La/a570;

    .line 151
    .line 152
    invoke-static {v9}, La/x1x;->D(La/a570;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v9

    .line 156
    sget-object v11, La/s470;->p:La/s470;

    .line 157
    .line 158
    invoke-virtual {v11}, La/s470;->a()J

    .line 159
    .line 160
    .line 161
    move-result-wide v11

    .line 162
    cmp-long v9, v9, v11

    .line 163
    .line 164
    if-eqz v9, :cond_6

    .line 165
    .line 166
    iget-boolean v9, v8, La/mz60;->f:Z

    .line 167
    .line 168
    if-eqz v9, :cond_6

    .line 169
    .line 170
    iget-boolean v8, v8, La/mz60;->e:Z

    .line 171
    .line 172
    if-nez v8, :cond_6

    .line 173
    .line 174
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    const/16 v3, 0xf

    .line 179
    .line 180
    invoke-static {p0, v3}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    :cond_8
    if-nez v8, :cond_9

    .line 185
    .line 186
    sget-object v8, La/iun;->a:La/iun;

    .line 187
    .line 188
    :cond_9
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-eqz p1, :cond_a

    .line 193
    .line 194
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_f

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, La/pbv;

    .line 216
    .line 217
    iget-boolean v3, v3, La/pbv;->p:Z

    .line 218
    .line 219
    if-eqz v3, :cond_b

    .line 220
    .line 221
    new-instance v0, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_d

    .line 235
    .line 236
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    move-object v3, v2

    .line 241
    check-cast v3, La/pbv;

    .line 242
    .line 243
    iget-boolean v3, v3, La/pbv;->p:Z

    .line 244
    .line 245
    if-eqz v3, :cond_c

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_d
    new-instance p1, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_e

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, La/pbv;

    .line 275
    .line 276
    iget-wide v1, v1, La/pbv;->a:J

    .line 277
    .line 278
    invoke-static {v1, v2, p1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 279
    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_e
    invoke-virtual {v4, p1}, La/ofr0;->a0(Ljava/util/ArrayList;)V

    .line 283
    .line 284
    .line 285
    new-instance p1, La/t0r0;

    .line 286
    .line 287
    invoke-direct {p1, v7, p0}, La/t0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_f
    :goto_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-le p1, v5, :cond_10

    .line 296
    .line 297
    new-instance p1, La/t0r0;

    .line 298
    .line 299
    invoke-direct {p1, v7, p0}, La/t0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 300
    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_10
    new-instance p1, La/t0r0;

    .line 304
    .line 305
    sget-object p0, La/iun;->a:La/iun;

    .line 306
    .line 307
    invoke-direct {p1, v2, p0}, La/t0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 308
    .line 309
    .line 310
    :goto_8
    invoke-virtual {v4, p1}, La/ofr0;->V(La/a1r0;)V

    .line 311
    .line 312
    .line 313
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    :goto_9
    return-object v8

    .line 316
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 317
    .line 318
    iget-byte v9, p0, La/kfr0;->j:B

    .line 319
    .line 320
    if-eqz v9, :cond_13

    .line 321
    .line 322
    if-eq v9, v5, :cond_12

    .line 323
    .line 324
    if-ne v9, v6, :cond_11

    .line 325
    .line 326
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_11
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_15

    .line 334
    .line 335
    :cond_12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    iput-byte v5, p0, La/kfr0;->j:B

    .line 343
    .line 344
    sget p1, La/ofr0;->U0:I

    .line 345
    .line 346
    invoke-virtual {v4, p0}, La/ofr0;->O(La/zje;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    if-ne p1, v0, :cond_14

    .line 351
    .line 352
    goto :goto_b

    .line 353
    :cond_14
    :goto_a
    iget-object p1, v4, La/ofr0;->w:La/phf0;

    .line 354
    .line 355
    iput-byte v6, p0, La/kfr0;->j:B

    .line 356
    .line 357
    invoke-virtual {p1, p0}, La/phf0;->o(La/zje;)Ljava/io/Serializable;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    if-ne p1, v0, :cond_15

    .line 362
    .line 363
    :goto_b
    move-object v8, v0

    .line 364
    goto/16 :goto_15

    .line 365
    .line 366
    :cond_15
    :goto_c
    check-cast p1, Ljava/lang/Iterable;

    .line 367
    .line 368
    new-instance p0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    :cond_16
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eqz v0, :cond_17

    .line 382
    .line 383
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    instance-of v3, v0, La/a4b;

    .line 388
    .line 389
    if-eqz v3, :cond_16

    .line 390
    .line 391
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    goto :goto_d

    .line 395
    :cond_17
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    if-eqz p1, :cond_18

    .line 400
    .line 401
    goto/16 :goto_13

    .line 402
    .line 403
    :cond_18
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    :cond_19
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_21

    .line 412
    .line 413
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, La/a4b;

    .line 418
    .line 419
    iget-object v0, v0, La/a4b;->k:Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    if-eqz v3, :cond_1a

    .line 426
    .line 427
    goto :goto_e

    .line 428
    :cond_1a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    :cond_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eqz v3, :cond_19

    .line 437
    .line 438
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    check-cast v3, La/mz60;

    .line 443
    .line 444
    iget-boolean v3, v3, La/mz60;->e:Z

    .line 445
    .line 446
    if-eqz v3, :cond_1b

    .line 447
    .line 448
    new-instance p1, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-eqz v2, :cond_1c

    .line 462
    .line 463
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, La/a4b;

    .line 468
    .line 469
    iget-object v2, v2, La/a4b;->k:Ljava/util/ArrayList;

    .line 470
    .line 471
    invoke-static {p1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 472
    .line 473
    .line 474
    goto :goto_f

    .line 475
    :cond_1c
    new-instance v0, Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    :cond_1d
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_1e

    .line 489
    .line 490
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    move-object v3, v2

    .line 495
    check-cast v3, La/mz60;

    .line 496
    .line 497
    iget-boolean v3, v3, La/mz60;->e:Z

    .line 498
    .line 499
    if-eqz v3, :cond_1d

    .line 500
    .line 501
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    goto :goto_10

    .line 505
    :cond_1e
    new-instance p1, Ljava/util/ArrayList;

    .line 506
    .line 507
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-eqz v2, :cond_1f

    .line 523
    .line 524
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    check-cast v2, La/mz60;

    .line 529
    .line 530
    iget-object v2, v2, La/mz60;->b:La/a570;

    .line 531
    .line 532
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_11

    .line 536
    :cond_1f
    new-instance v0, Ljava/util/ArrayList;

    .line 537
    .line 538
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    if-eqz v1, :cond_20

    .line 554
    .line 555
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, La/a570;

    .line 560
    .line 561
    invoke-static {v1}, La/x1x;->D(La/a570;)J

    .line 562
    .line 563
    .line 564
    move-result-wide v1

    .line 565
    invoke-static {v1, v2, v0}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 566
    .line 567
    .line 568
    goto :goto_12

    .line 569
    :cond_20
    sget p1, La/ofr0;->U0:I

    .line 570
    .line 571
    invoke-virtual {v4, v0}, La/ofr0;->a0(Ljava/util/ArrayList;)V

    .line 572
    .line 573
    .line 574
    new-instance p1, La/s0r0;

    .line 575
    .line 576
    invoke-direct {p1, v7, p0}, La/s0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 577
    .line 578
    .line 579
    goto :goto_14

    .line 580
    :cond_21
    :goto_13
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    if-nez p1, :cond_22

    .line 585
    .line 586
    new-instance p1, La/s0r0;

    .line 587
    .line 588
    invoke-direct {p1, v7, p0}, La/s0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 589
    .line 590
    .line 591
    goto :goto_14

    .line 592
    :cond_22
    new-instance p1, La/s0r0;

    .line 593
    .line 594
    sget-object p0, La/iun;->a:La/iun;

    .line 595
    .line 596
    invoke-direct {p1, v2, p0}, La/s0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 597
    .line 598
    .line 599
    :goto_14
    sget p0, La/ofr0;->U0:I

    .line 600
    .line 601
    invoke-virtual {v4, p1}, La/ofr0;->V(La/a1r0;)V

    .line 602
    .line 603
    .line 604
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 605
    .line 606
    :goto_15
    return-object v8

    .line 607
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 608
    .line 609
    iget-byte v1, p0, La/kfr0;->j:B

    .line 610
    .line 611
    if-eqz v1, :cond_25

    .line 612
    .line 613
    if-eq v1, v5, :cond_24

    .line 614
    .line 615
    if-ne v1, v6, :cond_23

    .line 616
    .line 617
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    goto :goto_18

    .line 621
    :cond_23
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    goto :goto_1b

    .line 625
    :cond_24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    goto :goto_16

    .line 629
    :cond_25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    iput-byte v5, p0, La/kfr0;->j:B

    .line 633
    .line 634
    sget p1, La/ofr0;->U0:I

    .line 635
    .line 636
    invoke-virtual {v4, p0}, La/ofr0;->O(La/zje;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object p1

    .line 640
    if-ne p1, v0, :cond_26

    .line 641
    .line 642
    goto :goto_17

    .line 643
    :cond_26
    :goto_16
    iget-object p1, v4, La/ofr0;->w:La/phf0;

    .line 644
    .line 645
    iput-byte v6, p0, La/kfr0;->j:B

    .line 646
    .line 647
    invoke-virtual {p1, p0}, La/phf0;->o(La/zje;)Ljava/io/Serializable;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    if-ne p1, v0, :cond_27

    .line 652
    .line 653
    :goto_17
    move-object v8, v0

    .line 654
    goto :goto_1b

    .line 655
    :cond_27
    :goto_18
    check-cast p1, Ljava/lang/Iterable;

    .line 656
    .line 657
    new-instance p0, Ljava/util/ArrayList;

    .line 658
    .line 659
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 660
    .line 661
    .line 662
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    :cond_28
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    if-eqz v0, :cond_29

    .line 671
    .line 672
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    instance-of v1, v0, La/b4b;

    .line 677
    .line 678
    if-eqz v1, :cond_28

    .line 679
    .line 680
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    goto :goto_19

    .line 684
    :cond_29
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 685
    .line 686
    .line 687
    move-result p1

    .line 688
    if-nez p1, :cond_2a

    .line 689
    .line 690
    new-instance p1, La/r0r0;

    .line 691
    .line 692
    invoke-direct {p1, v7, p0}, La/r0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 693
    .line 694
    .line 695
    goto :goto_1a

    .line 696
    :cond_2a
    new-instance p1, La/r0r0;

    .line 697
    .line 698
    sget-object p0, La/iun;->a:La/iun;

    .line 699
    .line 700
    invoke-direct {p1, v2, p0}, La/r0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 701
    .line 702
    .line 703
    :goto_1a
    sget p0, La/ofr0;->U0:I

    .line 704
    .line 705
    invoke-virtual {v4, p1}, La/ofr0;->V(La/a1r0;)V

    .line 706
    .line 707
    .line 708
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    :goto_1b
    return-object v8

    .line 711
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
