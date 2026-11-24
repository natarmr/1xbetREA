.class public final La/g850;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/p850;


# direct methods
.method public synthetic constructor <init>(La/p850;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g850;->i:B

    iput-object p1, p0, La/g850;->k:La/p850;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g850;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g850;->k:La/p850;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/g850;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/g850;-><init>(La/p850;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/g850;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/g850;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, p0, p2, v1}, La/g850;-><init>(La/p850;La/yje;B)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v0, La/g850;->j:Z

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    new-instance p1, La/g850;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p1, p0, p2, v0}, La/g850;-><init>(La/p850;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

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
    iget-byte v0, p0, La/g850;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/g850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/g850;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/g850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    check-cast p2, La/yje;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, La/g850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, La/g850;

    .line 38
    .line 39
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/g850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, La/vne;

    .line 47
    .line 48
    check-cast p2, La/yje;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, La/g850;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/g850;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/g850;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g850;->i:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v3, v0, La/g850;->k:La/p850;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v10, v0, La/g850;->j:Z

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/f650;->b:La/f650;

    .line 22
    .line 23
    sget v2, La/p850;->p0:I

    .line 24
    .line 25
    iget-object v13, v0, La/g850;->k:La/p850;

    .line 26
    .line 27
    invoke-virtual {v13, v1}, La/p850;->Q(La/g650;)La/bby;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, v13, La/p850;->n0:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, La/bby;

    .line 63
    .line 64
    invoke-static {v2}, La/e3c;->n(La/bby;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/p650;

    .line 76
    .line 77
    iget-object v0, v0, La/p650;->q:La/q250;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    sget-object v1, La/f650;->a:La/f650;

    .line 82
    .line 83
    invoke-virtual {v13, v1}, La/p850;->Q(La/g650;)La/bby;

    .line 84
    .line 85
    .line 86
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v3, v13, La/p850;->p:La/mne;

    .line 91
    .line 92
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 93
    .line 94
    new-instance v15, La/f340;

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/16 v18, 0x1b

    .line 99
    .line 100
    const/4 v12, 0x1

    .line 101
    const-class v14, La/p850;

    .line 102
    .line 103
    move-object v11, v15

    .line 104
    const-string v15, "handleError"

    .line 105
    .line 106
    const-string v16, "handleError(Ljava/lang/Throwable;)V"

    .line 107
    .line 108
    invoke-direct/range {v11 .. v18}, La/f340;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 109
    .line 110
    .line 111
    new-instance v6, La/y650;

    .line 112
    .line 113
    invoke-direct {v6, v13, v4}, La/y650;-><init>(La/p850;B)V

    .line 114
    .line 115
    .line 116
    new-instance v4, La/j940;

    .line 117
    .line 118
    const/4 v7, 0x7

    .line 119
    invoke-direct {v4, v13, v0, v5, v7}, La/j940;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 120
    .line 121
    .line 122
    const/16 v19, 0x8

    .line 123
    .line 124
    move-object v14, v2

    .line 125
    move-object/from16 v17, v3

    .line 126
    .line 127
    move-object/from16 v18, v4

    .line 128
    .line 129
    move-object/from16 v16, v6

    .line 130
    .line 131
    move-object v15, v11

    .line 132
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v13, v1, v0}, La/p850;->N(La/g650;La/bby;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    iget-object v0, v13, La/p850;->s:La/zri;

    .line 140
    .line 141
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, La/p650;

    .line 146
    .line 147
    iget-object v1, v1, La/p650;->a:La/mi0;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, La/zri;->p(La/mi0;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v0, v13, La/i3t0;->i:La/ocj;

    .line 154
    .line 155
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 156
    .line 157
    :cond_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-object v6, v0

    .line 165
    check-cast v6, La/p650;

    .line 166
    .line 167
    invoke-static {v1}, La/thb;->v(Ljava/util/List;)Ljava/util/ArrayList;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    const/4 v9, 0x0

    .line 172
    const v11, 0x3df7f

    .line 173
    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    invoke-static/range {v6 .. v11}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v4, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_3

    .line 185
    .line 186
    invoke-virtual {v13}, La/p850;->W()V

    .line 187
    .line 188
    .line 189
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_0
    iget-boolean v0, v0, La/g850;->j:Z

    .line 193
    .line 194
    sget-object v1, La/wne;->a:La/wne;

    .line 195
    .line 196
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    if-eqz v0, :cond_15

    .line 200
    .line 201
    sget v0, La/p850;->p0:I

    .line 202
    .line 203
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/p650;

    .line 208
    .line 209
    iget-object v0, v0, La/p650;->h:Ljava/util/List;

    .line 210
    .line 211
    new-instance v8, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_13

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, La/jge;

    .line 235
    .line 236
    invoke-interface {v1}, La/jge;->a()La/ha8;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    instance-of v4, v2, La/ba8;

    .line 244
    .line 245
    if-nez v4, :cond_5

    .line 246
    .line 247
    instance-of v2, v2, La/y98;

    .line 248
    .line 249
    if-eqz v2, :cond_4

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_4
    invoke-interface {v1}, La/jge;->a()La/ha8;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    instance-of v4, v2, La/ba8;

    .line 260
    .line 261
    if-nez v4, :cond_5

    .line 262
    .line 263
    instance-of v4, v2, La/y98;

    .line 264
    .line 265
    if-nez v4, :cond_5

    .line 266
    .line 267
    instance-of v4, v2, La/da8;

    .line 268
    .line 269
    if-eqz v4, :cond_11

    .line 270
    .line 271
    check-cast v2, La/da8;

    .line 272
    .line 273
    iget-boolean v2, v2, La/da8;->c:Z

    .line 274
    .line 275
    if-eqz v2, :cond_11

    .line 276
    .line 277
    :cond_5
    :goto_2
    invoke-interface {v1}, La/jge;->getKey()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v3, v2}, La/p850;->R(Ljava/lang/String;)La/bby;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    if-eqz v2, :cond_6

    .line 286
    .line 287
    invoke-interface {v2, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 288
    .line 289
    .line 290
    :cond_6
    invoke-interface {v1}, La/jge;->getKey()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v3, v2}, La/p850;->b0(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    instance-of v2, v1, La/yfe;

    .line 298
    .line 299
    if-eqz v2, :cond_7

    .line 300
    .line 301
    check-cast v1, La/yfe;

    .line 302
    .line 303
    new-instance v2, La/ea8;

    .line 304
    .line 305
    iget-object v1, v1, La/yfe;->a:La/ha8;

    .line 306
    .line 307
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    new-instance v1, La/yfe;

    .line 315
    .line 316
    invoke-direct {v1, v2}, La/yfe;-><init>(La/ha8;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_3

    .line 320
    .line 321
    :cond_7
    instance-of v2, v1, La/zfe;

    .line 322
    .line 323
    if-eqz v2, :cond_8

    .line 324
    .line 325
    check-cast v1, La/zfe;

    .line 326
    .line 327
    new-instance v2, La/ea8;

    .line 328
    .line 329
    iget-object v1, v1, La/zfe;->a:La/ha8;

    .line 330
    .line 331
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    new-instance v1, La/zfe;

    .line 339
    .line 340
    invoke-direct {v1, v2}, La/zfe;-><init>(La/ha8;)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_3

    .line 344
    .line 345
    :cond_8
    instance-of v2, v1, La/age;

    .line 346
    .line 347
    if-eqz v2, :cond_9

    .line 348
    .line 349
    check-cast v1, La/age;

    .line 350
    .line 351
    new-instance v2, La/ea8;

    .line 352
    .line 353
    iget-object v1, v1, La/age;->a:La/ha8;

    .line 354
    .line 355
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    new-instance v1, La/age;

    .line 363
    .line 364
    invoke-direct {v1, v2}, La/age;-><init>(La/ha8;)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_3

    .line 368
    .line 369
    :cond_9
    instance-of v2, v1, La/bge;

    .line 370
    .line 371
    if-eqz v2, :cond_a

    .line 372
    .line 373
    check-cast v1, La/bge;

    .line 374
    .line 375
    new-instance v2, La/ea8;

    .line 376
    .line 377
    iget-object v1, v1, La/bge;->a:La/ha8;

    .line 378
    .line 379
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    new-instance v1, La/bge;

    .line 387
    .line 388
    invoke-direct {v1, v2}, La/bge;-><init>(La/ha8;)V

    .line 389
    .line 390
    .line 391
    goto/16 :goto_3

    .line 392
    .line 393
    :cond_a
    instance-of v2, v1, La/cge;

    .line 394
    .line 395
    if-eqz v2, :cond_b

    .line 396
    .line 397
    check-cast v1, La/cge;

    .line 398
    .line 399
    new-instance v2, La/ea8;

    .line 400
    .line 401
    iget-object v1, v1, La/cge;->a:La/ha8;

    .line 402
    .line 403
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    new-instance v1, La/cge;

    .line 411
    .line 412
    invoke-direct {v1, v2}, La/cge;-><init>(La/ha8;)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_3

    .line 416
    .line 417
    :cond_b
    instance-of v2, v1, La/dge;

    .line 418
    .line 419
    if-eqz v2, :cond_c

    .line 420
    .line 421
    check-cast v1, La/dge;

    .line 422
    .line 423
    new-instance v2, La/ea8;

    .line 424
    .line 425
    iget-object v1, v1, La/dge;->a:La/ha8;

    .line 426
    .line 427
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    new-instance v1, La/dge;

    .line 435
    .line 436
    invoke-direct {v1, v2}, La/dge;-><init>(La/ha8;)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_3

    .line 440
    .line 441
    :cond_c
    instance-of v2, v1, La/ege;

    .line 442
    .line 443
    if-eqz v2, :cond_d

    .line 444
    .line 445
    check-cast v1, La/ege;

    .line 446
    .line 447
    new-instance v2, La/ea8;

    .line 448
    .line 449
    iget-object v1, v1, La/ege;->a:La/ha8;

    .line 450
    .line 451
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    new-instance v1, La/ege;

    .line 459
    .line 460
    invoke-direct {v1, v2}, La/ege;-><init>(La/ha8;)V

    .line 461
    .line 462
    .line 463
    goto :goto_3

    .line 464
    :cond_d
    instance-of v2, v1, La/fge;

    .line 465
    .line 466
    if-eqz v2, :cond_e

    .line 467
    .line 468
    check-cast v1, La/fge;

    .line 469
    .line 470
    new-instance v2, La/ea8;

    .line 471
    .line 472
    iget-object v1, v1, La/fge;->a:La/ha8;

    .line 473
    .line 474
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    new-instance v1, La/fge;

    .line 482
    .line 483
    invoke-direct {v1, v2}, La/fge;-><init>(La/ha8;)V

    .line 484
    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_e
    instance-of v2, v1, La/gge;

    .line 488
    .line 489
    if-eqz v2, :cond_f

    .line 490
    .line 491
    check-cast v1, La/gge;

    .line 492
    .line 493
    new-instance v2, La/ea8;

    .line 494
    .line 495
    iget-object v1, v1, La/gge;->a:La/ha8;

    .line 496
    .line 497
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    new-instance v1, La/gge;

    .line 505
    .line 506
    invoke-direct {v1, v2}, La/gge;-><init>(La/ha8;)V

    .line 507
    .line 508
    .line 509
    goto :goto_3

    .line 510
    :cond_f
    instance-of v2, v1, La/hge;

    .line 511
    .line 512
    if-eqz v2, :cond_10

    .line 513
    .line 514
    check-cast v1, La/hge;

    .line 515
    .line 516
    new-instance v2, La/ea8;

    .line 517
    .line 518
    iget-object v1, v1, La/hge;->a:La/ha8;

    .line 519
    .line 520
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    new-instance v1, La/hge;

    .line 528
    .line 529
    invoke-direct {v1, v2}, La/hge;-><init>(La/ha8;)V

    .line 530
    .line 531
    .line 532
    goto :goto_3

    .line 533
    :cond_10
    instance-of v2, v1, La/ige;

    .line 534
    .line 535
    if-eqz v2, :cond_12

    .line 536
    .line 537
    check-cast v1, La/ige;

    .line 538
    .line 539
    new-instance v2, La/ea8;

    .line 540
    .line 541
    iget-object v1, v1, La/ige;->a:La/ha8;

    .line 542
    .line 543
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-direct {v2, v1}, La/ea8;-><init>(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    new-instance v1, La/ige;

    .line 551
    .line 552
    invoke-direct {v1, v2}, La/ige;-><init>(La/ha8;)V

    .line 553
    .line 554
    .line 555
    :cond_11
    :goto_3
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    goto/16 :goto_1

    .line 559
    .line 560
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 561
    .line 562
    .line 563
    goto :goto_4

    .line 564
    :cond_13
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 565
    .line 566
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 567
    .line 568
    :cond_14
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    iget-object v2, v3, La/i3t0;->f:La/oyg0;

    .line 576
    .line 577
    move-object v6, v1

    .line 578
    check-cast v6, La/p650;

    .line 579
    .line 580
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    const/4 v10, 0x0

    .line 584
    const v11, 0x3ff7f

    .line 585
    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const/4 v9, 0x0

    .line 589
    invoke-static/range {v6 .. v11}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-eqz v1, :cond_14

    .line 598
    .line 599
    invoke-virtual {v3}, La/p850;->X()V

    .line 600
    .line 601
    .line 602
    :cond_15
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    :goto_4
    return-object v5

    .line 605
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 606
    .line 607
    iget-boolean v6, v0, La/g850;->j:Z

    .line 608
    .line 609
    if-eqz v6, :cond_17

    .line 610
    .line 611
    if-ne v6, v4, :cond_16

    .line 612
    .line 613
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    move-object/from16 v0, p1

    .line 617
    .line 618
    goto :goto_5

    .line 619
    :cond_16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 620
    .line 621
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    goto/16 :goto_8

    .line 625
    .line 626
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    iget-object v5, v3, La/p850;->w:La/hsj;

    .line 630
    .line 631
    const/4 v6, 0x0

    .line 632
    new-array v6, v6, [La/z7b;

    .line 633
    .line 634
    iput-boolean v4, v0, La/g850;->j:Z

    .line 635
    .line 636
    invoke-virtual {v5, v6, v0}, La/hsj;->r([La/z7b;La/zje;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    if-ne v0, v1, :cond_18

    .line 641
    .line 642
    move-object v5, v1

    .line 643
    goto/16 :goto_8

    .line 644
    .line 645
    :cond_18
    :goto_5
    check-cast v0, La/a3b;

    .line 646
    .line 647
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-object v0, v0, La/a3b;->a:Ljava/util/ArrayList;

    .line 651
    .line 652
    new-instance v1, Ljava/util/ArrayList;

    .line 653
    .line 654
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    :cond_19
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 662
    .line 663
    .line 664
    move-result v4

    .line 665
    if-eqz v4, :cond_1b

    .line 666
    .line 667
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    move-object v5, v4

    .line 672
    check-cast v5, La/vh0;

    .line 673
    .line 674
    iget-wide v5, v5, La/vh0;->f:J

    .line 675
    .line 676
    const-wide/16 v7, 0x2

    .line 677
    .line 678
    cmp-long v7, v5, v7

    .line 679
    .line 680
    if-eqz v7, :cond_1a

    .line 681
    .line 682
    const-wide/16 v7, 0x0

    .line 683
    .line 684
    cmp-long v5, v5, v7

    .line 685
    .line 686
    if-nez v5, :cond_19

    .line 687
    .line 688
    :cond_1a
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    goto :goto_6

    .line 692
    :cond_1b
    new-instance v0, Ljava/util/ArrayList;

    .line 693
    .line 694
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    if-eqz v2, :cond_1c

    .line 710
    .line 711
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    check-cast v2, La/vh0;

    .line 716
    .line 717
    new-instance v4, La/age;

    .line 718
    .line 719
    new-instance v5, La/ca8;

    .line 720
    .line 721
    new-instance v6, La/xi0;

    .line 722
    .line 723
    iget-wide v7, v2, La/vh0;->a:J

    .line 724
    .line 725
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    new-instance v8, La/si0;

    .line 730
    .line 731
    iget-object v9, v2, La/vh0;->b:Ljava/lang/String;

    .line 732
    .line 733
    invoke-direct {v8, v9}, La/si0;-><init>(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    sget-object v13, La/pc0;->c:La/pc0;

    .line 737
    .line 738
    iget-wide v9, v2, La/vh0;->a:J

    .line 739
    .line 740
    long-to-int v2, v9

    .line 741
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v14

    .line 745
    const/4 v9, 0x0

    .line 746
    const/16 v10, 0x8

    .line 747
    .line 748
    const-string v11, ""

    .line 749
    .line 750
    const/4 v12, 0x0

    .line 751
    invoke-direct/range {v6 .. v14}, La/xi0;-><init>(Ljava/lang/String;La/ti0;Ljava/lang/Integer;ILjava/lang/String;ZLa/pc0;Ljava/lang/Integer;)V

    .line 752
    .line 753
    .line 754
    invoke-direct {v5, v6}, La/ca8;-><init>(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    invoke-direct {v4, v5}, La/age;-><init>(La/ha8;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    goto :goto_7

    .line 764
    :cond_1c
    new-instance v1, La/mo1;

    .line 765
    .line 766
    const/4 v2, 0x2

    .line 767
    invoke-direct {v1, v0, v2}, La/mo1;-><init>(Ljava/util/ArrayList;B)V

    .line 768
    .line 769
    .line 770
    sget v0, La/p850;->p0:I

    .line 771
    .line 772
    invoke-virtual {v3, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v3}, La/p850;->X()V

    .line 776
    .line 777
    .line 778
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 779
    .line 780
    :goto_8
    return-object v5

    .line 781
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
