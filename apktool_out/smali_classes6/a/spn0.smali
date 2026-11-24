.class public final La/spn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/tpn0;


# direct methods
.method public synthetic constructor <init>(La/tpn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/spn0;->i:B

    iput-object p1, p0, La/spn0;->k:La/tpn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/spn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/spn0;->k:La/tpn0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/spn0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/spn0;-><init>(La/tpn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/spn0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/spn0;-><init>(La/tpn0;La/yje;B)V

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
    iget-byte v0, p0, La/spn0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/spn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/spn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/spn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/spn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/spn0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/spn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/spn0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/spn0;->k:La/tpn0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v2, La/tpn0;->n:La/p7m0;

    .line 14
    .line 15
    sget-object v6, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v7, p0, La/spn0;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-boolean v5, p0, La/spn0;->j:Z

    .line 36
    .line 37
    iget-object p0, v2, La/tpn0;->o:La/ol60;

    .line 38
    .line 39
    sget-object p1, La/qpn0;->a:La/qpn0;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, v2, La/tpn0;->e:La/i1w0;

    .line 45
    .line 46
    invoke-static {p0, p0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v1, La/t0w0;->a:La/t0w0;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 53
    .line 54
    .line 55
    iget-object v1, v2, La/tpn0;->f:La/m6m0;

    .line 56
    .line 57
    invoke-static {v1}, La/m6m0;->i(La/m6m0;)Lorg/xplatform/swipex/impl/navigation/SwipexInternalScreenFactory$getSwipexFilterScreen$1;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 65
    .line 66
    invoke-static {p0, p1, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_0
    move-object v1, p1

    .line 71
    check-cast v1, La/paw;

    .line 72
    .line 73
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/oe50;

    .line 84
    .line 85
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    if-ne p0, v6, :cond_3

    .line 92
    .line 93
    move-object v3, v6

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_1
    iget-object p0, v2, La/tpn0;->g:La/s31;

    .line 96
    .line 97
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, La/rpn0;

    .line 102
    .line 103
    iget p1, p1, La/rpn0;->d:I

    .line 104
    .line 105
    add-int/2addr p1, v5

    .line 106
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 107
    .line 108
    const-string v1, "onboard"

    .line 109
    .line 110
    invoke-static {p1, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v3, Lkotlin/Pair;

    .line 115
    .line 116
    const-string v6, "option"

    .line 117
    .line 118
    invoke-direct {v3, v6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, Lkotlin/Pair;

    .line 122
    .line 123
    const-string v6, "action"

    .line 124
    .line 125
    const-string v7, "miss"

    .line 126
    .line 127
    invoke-direct {p1, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    filled-new-array {v3, p1}, [Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v3, "swipex_onboard_action"

    .line 139
    .line 140
    invoke-interface {p0, v3, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 141
    .line 142
    .line 143
    iget-object p0, v2, La/tpn0;->i:La/e41;

    .line 144
    .line 145
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, La/rpn0;

    .line 150
    .line 151
    iget p1, p1, La/rpn0;->d:I

    .line 152
    .line 153
    add-int/2addr p1, v5

    .line 154
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 155
    .line 156
    new-instance v0, La/j1p;

    .line 157
    .line 158
    invoke-static {p1, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-direct {v0, p1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 163
    .line 164
    .line 165
    new-instance p1, La/j1p;

    .line 166
    .line 167
    invoke-direct {p1, v7, v5}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 168
    .line 169
    .line 170
    const/4 v1, 0x2

    .line 171
    new-array v1, v1, [La/k1p;

    .line 172
    .line 173
    aput-object v0, v1, v4

    .line 174
    .line 175
    aput-object p1, v1, v5

    .line 176
    .line 177
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const-wide/16 v0, 0xc34

    .line 182
    .line 183
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 184
    .line 185
    .line 186
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_2
    return-object v3

    .line 189
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 190
    .line 191
    iget-boolean v6, p0, La/spn0;->j:Z

    .line 192
    .line 193
    if-eqz v6, :cond_5

    .line 194
    .line 195
    if-ne v6, v5, :cond_4

    .line 196
    .line 197
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_a

    .line 205
    .line 206
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, v2, La/tpn0;->b:La/ywu;

    .line 210
    .line 211
    iput-boolean v5, p0, La/spn0;->j:Z

    .line 212
    .line 213
    iget-object p0, p1, La/ywu;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p0, La/zwu;

    .line 216
    .line 217
    iget-object v1, p1, La/ywu;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, La/wyu;

    .line 220
    .line 221
    invoke-virtual {v1}, La/wyu;->a()La/uaq0;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iget-object p1, p1, La/ywu;->d:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p1, La/wgu;

    .line 228
    .line 229
    invoke-virtual {p1}, La/wgu;->a()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p0, v1, p1}, La/zwu;->a(La/uaq0;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-ne p1, v0, :cond_6

    .line 238
    .line 239
    move-object v3, v0

    .line 240
    goto/16 :goto_a

    .line 241
    .line 242
    :cond_6
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 243
    .line 244
    new-instance p0, Ljava/util/ArrayList;

    .line 245
    .line 246
    const/16 v0, 0xa

    .line 247
    .line 248
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    move v0, v4

    .line 260
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_b

    .line 265
    .line 266
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    add-int/lit8 v5, v0, 0x1

    .line 271
    .line 272
    if-ltz v0, :cond_a

    .line 273
    .line 274
    check-cast v1, Ljava/lang/String;

    .line 275
    .line 276
    new-instance v6, La/uk60;

    .line 277
    .line 278
    sget-object v7, La/uaq0;->a:La/s9m0;

    .line 279
    .line 280
    iget-object v8, v2, La/tpn0;->k:La/wyu;

    .line 281
    .line 282
    invoke-static {v8, v7}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_7

    .line 287
    .line 288
    const v7, 0x7f040ae8

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_7
    const v7, 0x7f040b5d

    .line 293
    .line 294
    .line 295
    :goto_5
    iget-object v8, v2, La/tpn0;->l:Ljava/util/List;

    .line 296
    .line 297
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    check-cast v8, Ljava/lang/Integer;

    .line 302
    .line 303
    if-eqz v8, :cond_8

    .line 304
    .line 305
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    goto :goto_6

    .line 310
    :cond_8
    move v8, v4

    .line 311
    :goto_6
    iget-object v9, v2, La/tpn0;->m:Ljava/util/List;

    .line 312
    .line 313
    invoke-static {v0, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, Ljava/lang/Integer;

    .line 318
    .line 319
    if-eqz v0, :cond_9

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    goto :goto_7

    .line 326
    :cond_9
    move v0, v4

    .line 327
    :goto_7
    invoke-direct {v6, v7, v8, v0, v1}, La/uk60;-><init>(IIILjava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move v0, v5

    .line 334
    goto :goto_4

    .line 335
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 336
    .line 337
    .line 338
    throw v3

    .line 339
    :cond_b
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    iput-object p0, v2, La/tpn0;->p:Ljava/util/List;

    .line 348
    .line 349
    iget-object p0, v2, La/tpn0;->n:La/p7m0;

    .line 350
    .line 351
    :cond_c
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    move-object v3, p1

    .line 356
    check-cast v3, La/rpn0;

    .line 357
    .line 358
    iget-object v5, v2, La/tpn0;->p:Ljava/util/List;

    .line 359
    .line 360
    iget-object v0, v2, La/tpn0;->j:La/ctf0;

    .line 361
    .line 362
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_d

    .line 367
    .line 368
    const v0, 0x3f4ccccd    # 0.8f

    .line 369
    .line 370
    .line 371
    :goto_8
    move v9, v0

    .line 372
    goto :goto_9

    .line 373
    :cond_d
    const/high16 v0, 0x3f800000    # 1.0f

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :goto_9
    const/16 v10, 0x3d

    .line 377
    .line 378
    const/4 v4, 0x0

    .line 379
    const/4 v6, 0x0

    .line 380
    const/4 v7, 0x0

    .line 381
    const/4 v8, 0x0

    .line 382
    invoke-static/range {v3 .. v10}, La/rpn0;->a(La/rpn0;ILjava/util/List;IIIFI)La/rpn0;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    if-eqz p1, :cond_c

    .line 391
    .line 392
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    :goto_a
    return-object v3

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
