.class public final La/v060;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/x060;


# direct methods
.method public synthetic constructor <init>(La/x060;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v060;->i:B

    iput-object p1, p0, La/v060;->j:La/x060;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v060;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/v060;->j:La/x060;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/v060;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/v060;-><init>(La/x060;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/v060;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/v060;-><init>(La/x060;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/v060;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/v060;-><init>(La/x060;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v060;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/v060;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/v060;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/v060;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/v060;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/v060;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/v060;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/v060;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/v060;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/v060;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/v060;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/v060;->j:La/x060;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/q060;

    .line 19
    .line 20
    iget-object v3, p1, La/q060;->g:Ljava/util/List;

    .line 21
    .line 22
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v7, p0, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v0, p0

    .line 34
    check-cast v0, La/q060;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v6, 0x7ef

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v0 .. v6}, La/q060;->a(La/q060;La/e060;La/j060;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;I)La/q060;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v7, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, La/x060;->v:La/o470;

    .line 61
    .line 62
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/q060;

    .line 67
    .line 68
    iget-object v0, v0, La/q060;->e:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, La/o470;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, La/rrc;

    .line 79
    .line 80
    iget-object p1, p1, La/rrc;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, La/xep;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v2, Ljava/util/ArrayList;

    .line 88
    .line 89
    const/16 v3, 0xa

    .line 90
    .line 91
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_1

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, La/k460;

    .line 113
    .line 114
    iget-byte v4, v4, La/k460;->a:B

    .line 115
    .line 116
    int-to-long v4, v4

    .line 117
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    iget-object v8, p1, La/xep;->a:La/q7d0;

    .line 126
    .line 127
    new-instance v6, La/e4p;

    .line 128
    .line 129
    const/16 v3, 0x16

    .line 130
    .line 131
    invoke-direct {v6, v3}, La/e4p;-><init>(B)V

    .line 132
    .line 133
    .line 134
    const/16 v7, 0x1e

    .line 135
    .line 136
    const-string v3, ","

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v5, 0x0

    .line 140
    invoke-static/range {v2 .. v7}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const-string v3, "DASHBOARD_ORDER"

    .line 145
    .line 146
    invoke-virtual {v8, v3, v2}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, p1, La/xep;->b:La/p7m0;

    .line 150
    .line 151
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    move-object v3, p1

    .line 156
    check-cast v3, Ljava/util/List;

    .line 157
    .line 158
    invoke-virtual {v2, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_2

    .line 163
    .line 164
    iget-object p0, p0, La/x060;->p:La/i1w0;

    .line 165
    .line 166
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v0, La/c8d;

    .line 171
    .line 172
    sget-object v2, La/y7d;->a:La/v7d;

    .line 173
    .line 174
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 175
    .line 176
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_1
    move-object v0, p1

    .line 184
    check-cast v0, La/paw;

    .line 185
    .line 186
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/oe50;

    .line 197
    .line 198
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 206
    .line 207
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, La/x060;->s:La/pru;

    .line 211
    .line 212
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iget-object v0, p1, La/sff0;->d:La/q1w0;

    .line 217
    .line 218
    iget-object v2, v0, La/q1w0;->a:La/dyv0;

    .line 219
    .line 220
    iget-object v2, v2, La/dyv0;->b:Ljava/lang/String;

    .line 221
    .line 222
    iget-object p1, p1, La/sff0;->b:La/hl1;

    .line 223
    .line 224
    iget-object p1, p1, La/hl1;->a:La/f61;

    .line 225
    .line 226
    iget-boolean v3, p1, La/f61;->a:Z

    .line 227
    .line 228
    iget-boolean v0, v0, La/q1w0;->b:Z

    .line 229
    .line 230
    iget-boolean p1, p1, La/f61;->b:Z

    .line 231
    .line 232
    new-instance v5, La/e060;

    .line 233
    .line 234
    invoke-direct {v5, v2, v0, v3, p1}, La/e060;-><init>(Ljava/lang/String;ZZZ)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, La/x060;->u:La/fhj;

    .line 238
    .line 239
    iget-object v0, p1, La/fhj;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, La/pru;

    .line 242
    .line 243
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget-object p1, p1, La/fhj;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, La/f4u;

    .line 250
    .line 251
    iget-object p1, p1, La/f4u;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p1, La/rrc;

    .line 254
    .line 255
    iget-object p1, p1, La/rrc;->b:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p1, La/xep;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    sget-object p1, La/k460;->e:La/c0o;

    .line 263
    .line 264
    iget-object v2, v0, La/sff0;->b:La/hl1;

    .line 265
    .line 266
    iget-object v2, v2, La/hl1;->a:La/f61;

    .line 267
    .line 268
    iget-boolean v3, v2, La/f61;->a:Z

    .line 269
    .line 270
    const/4 v4, 0x1

    .line 271
    if-nez v3, :cond_5

    .line 272
    .line 273
    iget-boolean v2, v2, La/f61;->b:Z

    .line 274
    .line 275
    if-eqz v2, :cond_4

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_4
    move v2, v1

    .line 279
    goto :goto_3

    .line 280
    :cond_5
    :goto_2
    move v2, v4

    .line 281
    :goto_3
    new-instance v3, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, La/b3;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    :cond_6
    :goto_4
    move-object v6, p1

    .line 291
    check-cast v6, La/y2;

    .line 292
    .line 293
    invoke-virtual {v6}, La/y2;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    if-eqz v7, :cond_8

    .line 298
    .line 299
    invoke-virtual {v6}, La/y2;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    move-object v7, v6

    .line 304
    check-cast v7, La/k460;

    .line 305
    .line 306
    if-nez v2, :cond_7

    .line 307
    .line 308
    sget-object v8, La/k460;->c:La/k460;

    .line 309
    .line 310
    if-eq v7, v8, :cond_6

    .line 311
    .line 312
    :cond_7
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_8
    iget-object p1, v0, La/sff0;->d:La/q1w0;

    .line 317
    .line 318
    iget-boolean p1, p1, La/q1w0;->b:Z

    .line 319
    .line 320
    new-instance v9, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    :cond_9
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-eqz v2, :cond_b

    .line 334
    .line 335
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    move-object v3, v2

    .line 340
    check-cast v3, La/k460;

    .line 341
    .line 342
    if-nez p1, :cond_a

    .line 343
    .line 344
    sget-object v6, La/k460;->b:La/k460;

    .line 345
    .line 346
    if-eq v3, v6, :cond_9

    .line 347
    .line 348
    :cond_a
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_b
    iget-object p1, p0, La/x060;->t:La/jtj;

    .line 353
    .line 354
    iget-object v0, p1, La/jtj;->c:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, La/pru;

    .line 357
    .line 358
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    iget-object v2, v0, La/sff0;->d:La/q1w0;

    .line 363
    .line 364
    iget-boolean v2, v2, La/q1w0;->b:Z

    .line 365
    .line 366
    iget-object p1, p1, La/jtj;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast p1, La/a7q;

    .line 369
    .line 370
    iget-object p1, p1, La/a7q;->a:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast p1, La/rrc;

    .line 373
    .line 374
    iget-object p1, p1, La/rrc;->b:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast p1, La/xep;

    .line 377
    .line 378
    invoke-virtual {p1}, La/xep;->a()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 383
    .line 384
    iget-object v0, v0, La/hl1;->a:La/f61;

    .line 385
    .line 386
    iget-boolean v3, v0, La/f61;->a:Z

    .line 387
    .line 388
    if-nez v3, :cond_d

    .line 389
    .line 390
    iget-boolean v3, v0, La/f61;->b:Z

    .line 391
    .line 392
    if-eqz v3, :cond_c

    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_c
    move v3, v1

    .line 396
    goto :goto_7

    .line 397
    :cond_d
    :goto_6
    move v3, v4

    .line 398
    :goto_7
    new-instance v6, Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    :cond_e
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    if-eqz v7, :cond_10

    .line 412
    .line 413
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    move-object v8, v7

    .line 418
    check-cast v8, La/k460;

    .line 419
    .line 420
    if-nez v3, :cond_f

    .line 421
    .line 422
    sget-object v10, La/k460;->c:La/k460;

    .line 423
    .line 424
    if-eq v8, v10, :cond_e

    .line 425
    .line 426
    :cond_f
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_10
    new-instance p1, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    :cond_11
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    if-eqz v6, :cond_13

    .line 444
    .line 445
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    move-object v7, v6

    .line 450
    check-cast v7, La/k460;

    .line 451
    .line 452
    if-nez v2, :cond_12

    .line 453
    .line 454
    sget-object v8, La/k460;->b:La/k460;

    .line 455
    .line 456
    if-eq v7, v8, :cond_11

    .line 457
    .line 458
    :cond_12
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_13
    iget-boolean v3, v0, La/f61;->a:Z

    .line 463
    .line 464
    if-nez v3, :cond_14

    .line 465
    .line 466
    iget-boolean v0, v0, La/f61;->b:Z

    .line 467
    .line 468
    if-eqz v0, :cond_15

    .line 469
    .line 470
    :cond_14
    move v1, v4

    .line 471
    :cond_15
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sget-object v3, La/k460;->b:La/k460;

    .line 476
    .line 477
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    if-nez v4, :cond_16

    .line 482
    .line 483
    if-eqz v2, :cond_16

    .line 484
    .line 485
    invoke-virtual {v0, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    :cond_16
    sget-object v2, La/k460;->c:La/k460;

    .line 489
    .line 490
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    if-nez v3, :cond_17

    .line 495
    .line 496
    if-eqz v1, :cond_17

    .line 497
    .line 498
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    :cond_17
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    iget-object p1, p0, La/x060;->o:La/vzg0;

    .line 518
    .line 519
    const-string v0, "CURRENT_ORDER_KEY"

    .line 520
    .line 521
    invoke-virtual {p1, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    check-cast p1, [J

    .line 526
    .line 527
    if-eqz p1, :cond_1e

    .line 528
    .line 529
    invoke-static {p1}, La/tx3;->f0([J)Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object p1

    .line 533
    if-eqz p1, :cond_1e

    .line 534
    .line 535
    new-instance v0, Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 538
    .line 539
    .line 540
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    :cond_18
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    if-eqz v1, :cond_1b

    .line 549
    .line 550
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, Ljava/lang/Number;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 557
    .line 558
    .line 559
    move-result-wide v1

    .line 560
    sget-object v3, La/k460;->e:La/c0o;

    .line 561
    .line 562
    invoke-static {v3, v3}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    :cond_19
    invoke-virtual {v3}, La/y2;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v4

    .line 570
    if-eqz v4, :cond_1a

    .line 571
    .line 572
    invoke-virtual {v3}, La/y2;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    move-object v6, v4

    .line 577
    check-cast v6, La/k460;

    .line 578
    .line 579
    iget-byte v6, v6, La/k460;->a:B

    .line 580
    .line 581
    int-to-long v6, v6

    .line 582
    cmp-long v6, v6, v1

    .line 583
    .line 584
    if-nez v6, :cond_19

    .line 585
    .line 586
    goto :goto_b

    .line 587
    :cond_1a
    const/4 v4, 0x0

    .line 588
    :goto_b
    check-cast v4, La/k460;

    .line 589
    .line 590
    if-eqz v4, :cond_18

    .line 591
    .line 592
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    goto :goto_a

    .line 596
    :cond_1b
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 597
    .line 598
    .line 599
    move-result p1

    .line 600
    if-eqz p1, :cond_1c

    .line 601
    .line 602
    move-object v0, v8

    .line 603
    :cond_1c
    if-nez v0, :cond_1d

    .line 604
    .line 605
    goto :goto_c

    .line 606
    :cond_1d
    move-object v7, v0

    .line 607
    goto :goto_d

    .line 608
    :cond_1e
    :goto_c
    move-object v7, v8

    .line 609
    :goto_d
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 610
    .line 611
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 612
    .line 613
    :cond_1f
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object p1

    .line 617
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    move-object v4, p1

    .line 621
    check-cast v4, La/q060;

    .line 622
    .line 623
    const/4 v6, 0x0

    .line 624
    const/16 v10, 0x78b

    .line 625
    .line 626
    invoke-static/range {v4 .. v10}, La/q060;->a(La/q060;La/e060;La/j060;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;I)La/q060;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result p1

    .line 634
    if-eqz p1, :cond_1f

    .line 635
    .line 636
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object p0

    .line 639
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
