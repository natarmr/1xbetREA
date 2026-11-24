.class public final La/ysa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ata0;


# direct methods
.method public synthetic constructor <init>(La/ata0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ysa0;->a:B

    iput-object p1, p0, La/ysa0;->b:La/ata0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ysa0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/ysa0;->b:La/ata0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v9

    .line 18
    sget v0, La/ata0;->S:I

    .line 19
    .line 20
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 32
    .line 33
    move-object v4, v3

    .line 34
    move-object v3, v1

    .line 35
    check-cast v3, La/nsa0;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0x37f

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    invoke-static/range {v3 .. v11}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    move-object/from16 v0, p1

    .line 62
    .line 63
    check-cast v0, Ljava/util/List;

    .line 64
    .line 65
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 66
    .line 67
    iget-object v3, v2, La/i3t0;->i:La/ocj;

    .line 68
    .line 69
    new-instance v4, Ljava/util/ArrayList;

    .line 70
    .line 71
    const/16 v5, 0xa

    .line 72
    .line 73
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_1

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, La/hao;

    .line 95
    .line 96
    iget-wide v7, v7, La/hao;->v:J

    .line 97
    .line 98
    invoke-static {v7, v8, v4}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    sget v6, La/ata0;->S:I

    .line 103
    .line 104
    iget-object v6, v2, La/ata0;->Q:La/bby;

    .line 105
    .line 106
    if-eqz v6, :cond_2

    .line 107
    .line 108
    invoke-interface {v6}, La/bby;->isActive()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    const/4 v7, 0x1

    .line 113
    if-ne v6, v7, :cond_2

    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_2
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, La/nsa0;

    .line 122
    .line 123
    iget-object v6, v6, La/nsa0;->e:La/pn00;

    .line 124
    .line 125
    instance-of v7, v6, La/in00;

    .line 126
    .line 127
    const/4 v8, 0x0

    .line 128
    if-eqz v7, :cond_3

    .line 129
    .line 130
    check-cast v6, La/in00;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move-object v6, v8

    .line 134
    :goto_1
    if-eqz v6, :cond_4

    .line 135
    .line 136
    iget-object v6, v6, La/in00;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Ljava/util/List;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    move-object v6, v8

    .line 142
    :goto_2
    if-eqz v6, :cond_6

    .line 143
    .line 144
    new-instance v7, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v6, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_5

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, La/kta0;

    .line 168
    .line 169
    iget-wide v9, v6, La/kta0;->a:J

    .line 170
    .line 171
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_5
    invoke-interface {v7, v4}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_6

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    iget-object v5, v3, La/ocj;->a:La/p7m0;

    .line 187
    .line 188
    :cond_7
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-object v9, v6

    .line 196
    check-cast v9, La/nsa0;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v12, La/mn00;

    .line 202
    .line 203
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 204
    .line 205
    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x3ef

    .line 209
    .line 210
    const/4 v10, 0x0

    .line 211
    const/4 v11, 0x0

    .line 212
    const/4 v13, 0x0

    .line 213
    const/4 v14, 0x0

    .line 214
    const/4 v15, 0x0

    .line 215
    invoke-static/range {v9 .. v17}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-virtual {v5, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-eqz v6, :cond_7

    .line 224
    .line 225
    iget-object v5, v2, La/ata0;->q:La/mne;

    .line 226
    .line 227
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 228
    .line 229
    new-instance v6, La/tsa0;

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    invoke-direct {v6, v2, v7}, La/tsa0;-><init>(La/ata0;B)V

    .line 233
    .line 234
    .line 235
    new-instance v7, La/gv60;

    .line 236
    .line 237
    const/4 v9, 0x3

    .line 238
    invoke-direct {v7, v2, v4, v8, v9}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v5, v6, v7}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    iput-object v4, v2, La/ata0;->Q:La/bby;

    .line 246
    .line 247
    :goto_4
    iget-object v6, v3, La/ocj;->a:La/p7m0;

    .line 248
    .line 249
    :cond_8
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-object v7, v2

    .line 257
    check-cast v7, La/nsa0;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance v9, La/in00;

    .line 263
    .line 264
    invoke-direct {v9, v0}, La/in00;-><init>(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    const/16 v15, 0x3fb

    .line 269
    .line 270
    const/4 v8, 0x0

    .line 271
    const/4 v10, 0x0

    .line 272
    const/4 v11, 0x0

    .line 273
    const/4 v12, 0x0

    .line 274
    const/4 v13, 0x0

    .line 275
    invoke-static/range {v7 .. v15}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v6, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_8

    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_1
    move-object/from16 v0, p1

    .line 289
    .line 290
    check-cast v0, La/l9s;

    .line 291
    .line 292
    sget v1, La/ata0;->S:I

    .line 293
    .line 294
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 295
    .line 296
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 297
    .line 298
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    iget-object v4, v2, La/i3t0;->f:La/oyg0;

    .line 306
    .line 307
    move-object v5, v3

    .line 308
    check-cast v5, La/nsa0;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance v6, La/in00;

    .line 314
    .line 315
    invoke-direct {v6, v0}, La/in00;-><init>(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    const/4 v12, 0x0

    .line 319
    const/16 v13, 0x3fd

    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const/4 v8, 0x0

    .line 323
    const/4 v9, 0x0

    .line 324
    const/4 v10, 0x0

    .line 325
    const/4 v11, 0x0

    .line 326
    invoke-static/range {v5 .. v13}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-eqz v3, :cond_9

    .line 335
    .line 336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_2
    move-object/from16 v10, p1

    .line 340
    .line 341
    check-cast v10, Ljava/util/List;

    .line 342
    .line 343
    sget v0, La/ata0;->S:I

    .line 344
    .line 345
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 346
    .line 347
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 348
    .line 349
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 357
    .line 358
    move-object v4, v3

    .line 359
    move-object v3, v0

    .line 360
    check-cast v3, La/nsa0;

    .line 361
    .line 362
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    const/4 v9, 0x0

    .line 366
    const/16 v11, 0x2ff

    .line 367
    .line 368
    const/4 v4, 0x0

    .line 369
    const/4 v5, 0x0

    .line 370
    const/4 v6, 0x0

    .line 371
    const/4 v7, 0x0

    .line 372
    const/4 v8, 0x0

    .line 373
    invoke-static/range {v3 .. v11}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eqz v0, :cond_a

    .line 382
    .line 383
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_3
    move-object/from16 v1, p1

    .line 387
    .line 388
    check-cast v1, La/g4z;

    .line 389
    .line 390
    move-object/from16 v2, p2

    .line 391
    .line 392
    invoke-virtual {v0, v1, v2}, La/ysa0;->b(La/g4z;La/yje;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(La/g4z;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/xsa0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/xsa0;

    .line 7
    .line 8
    iget v1, v0, La/xsa0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/xsa0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xsa0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/xsa0;-><init>(La/ysa0;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/xsa0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xsa0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_2
    iget-object p1, v0, La/xsa0;->j:La/g4z;

    .line 51
    .line 52
    iget-object p0, v0, La/xsa0;->i:La/daf;

    .line 53
    .line 54
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, La/ysa0;->b:La/ata0;

    .line 62
    .line 63
    iget-object p2, p0, La/ata0;->s:La/daf;

    .line 64
    .line 65
    iget-object p0, p0, La/ata0;->u:La/owp0;

    .line 66
    .line 67
    iput-object p2, v0, La/xsa0;->i:La/daf;

    .line 68
    .line 69
    iput-object p1, v0, La/xsa0;->j:La/g4z;

    .line 70
    .line 71
    iput v4, v0, La/xsa0;->m:I

    .line 72
    .line 73
    invoke-virtual {p0, v0}, La/owp0;->e(La/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move-object v6, p2

    .line 81
    move-object p2, p0

    .line 82
    move-object p0, v6

    .line 83
    :goto_1
    check-cast p2, La/o3w0;

    .line 84
    .line 85
    iput-object v5, v0, La/xsa0;->i:La/daf;

    .line 86
    .line 87
    iput-object v5, v0, La/xsa0;->j:La/g4z;

    .line 88
    .line 89
    iput v3, v0, La/xsa0;->m:I

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2, v0}, La/daf;->G(La/g4z;La/o3w0;La/zje;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, v1, :cond_5

    .line 96
    .line 97
    :goto_2
    return-object v1

    .line 98
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method
