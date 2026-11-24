.class public final La/j750;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/p850;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/p850;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/j750;->i:B

    iput-object p1, p0, La/j750;->j:La/p850;

    iput-object p2, p0, La/j750;->k:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/j750;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/j750;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/j750;->j:La/p850;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/j750;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/j750;-><init>(La/p850;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/j750;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/j750;-><init>(La/p850;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/j750;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/j750;-><init>(La/p850;Ljava/lang/String;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j750;->i:B

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
    invoke-virtual {p0, p1, p2}, La/j750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/j750;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/j750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/j750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/j750;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/j750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/j750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/j750;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/j750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j750;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "finish"

    .line 7
    .line 8
    const-string v4, "progress"

    .line 9
    .line 10
    const-string v5, "start"

    .line 11
    .line 12
    const-string v6, ""

    .line 13
    .line 14
    const-string v7, "my_aggregator"

    .line 15
    .line 16
    iget-object v8, v0, La/j750;->k:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wne;->a:La/wne;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v10, v0, La/j750;->j:La/p850;

    .line 28
    .line 29
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/p650;

    .line 34
    .line 35
    iget-object v0, v0, La/p650;->h:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, La/jge;

    .line 53
    .line 54
    invoke-interface {v2}, La/jge;->getKey()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object v1, v9

    .line 66
    :goto_0
    instance-of v0, v1, La/zfe;

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    move-object v1, v9

    .line 71
    :cond_2
    check-cast v1, La/zfe;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-object v9, v1, La/zfe;->a:La/ha8;

    .line 76
    .line 77
    :cond_3
    if-eqz v9, :cond_8

    .line 78
    .line 79
    instance-of v0, v9, La/da8;

    .line 80
    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    iget-object v11, v10, La/p850;->J:La/g3j;

    .line 84
    .line 85
    new-instance v12, La/r2j;

    .line 86
    .line 87
    check-cast v9, La/da8;

    .line 88
    .line 89
    iget-object v0, v9, La/da8;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, La/d3j;

    .line 92
    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    instance-of v1, v0, La/y2j;

    .line 97
    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    move-object v3, v5

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    instance-of v1, v0, La/x2j;

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    move-object v3, v4

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    instance-of v0, v0, La/z2j;

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    :goto_1
    move-object v3, v6

    .line 114
    :goto_2
    invoke-direct {v12, v7, v3}, La/r2j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x6

    .line 119
    const/4 v13, 0x0

    .line 120
    invoke-static/range {v10 .. v15}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 121
    .line 122
    .line 123
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 127
    .line 128
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v10, v0, La/j750;->j:La/p850;

    .line 132
    .line 133
    invoke-virtual {v10}, La/i3t0;->D()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, La/p650;

    .line 138
    .line 139
    iget-object v0, v0, La/p650;->h:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    move-object v11, v1

    .line 156
    check-cast v11, La/jge;

    .line 157
    .line 158
    invoke-interface {v11}, La/jge;->getKey()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    invoke-static {v11, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    if-eqz v11, :cond_9

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_a
    move-object v1, v9

    .line 170
    :goto_3
    instance-of v0, v1, La/zfe;

    .line 171
    .line 172
    if-nez v0, :cond_b

    .line 173
    .line 174
    move-object v1, v9

    .line 175
    :cond_b
    check-cast v1, La/zfe;

    .line 176
    .line 177
    if-eqz v1, :cond_c

    .line 178
    .line 179
    iget-object v0, v1, La/zfe;->a:La/ha8;

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_c
    move-object v0, v9

    .line 183
    :goto_4
    if-eqz v0, :cond_16

    .line 184
    .line 185
    instance-of v1, v0, La/da8;

    .line 186
    .line 187
    if-eqz v1, :cond_16

    .line 188
    .line 189
    check-cast v0, La/da8;

    .line 190
    .line 191
    iget-object v0, v0, La/da8;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, La/d3j;

    .line 194
    .line 195
    instance-of v1, v0, La/y2j;

    .line 196
    .line 197
    if-eqz v1, :cond_e

    .line 198
    .line 199
    iget-object v11, v10, La/p850;->J:La/g3j;

    .line 200
    .line 201
    new-instance v12, La/o2j;

    .line 202
    .line 203
    check-cast v0, La/y2j;

    .line 204
    .line 205
    iget-object v0, v0, La/y2j;->a:La/n85;

    .line 206
    .line 207
    iget-wide v0, v0, La/n85;->e:J

    .line 208
    .line 209
    invoke-direct {v12, v7, v0, v1}, La/o2j;-><init>(Ljava/lang/String;J)V

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x6

    .line 214
    const/4 v13, 0x0

    .line 215
    invoke-static/range {v10 .. v15}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 216
    .line 217
    .line 218
    new-instance v0, La/mie0;

    .line 219
    .line 220
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    sget-object v1, La/f650;->d:La/f650;

    .line 224
    .line 225
    invoke-virtual {v10, v1}, La/p850;->Q(La/g650;)La/bby;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    iput-object v3, v0, La/mie0;->a:Ljava/lang/Object;

    .line 230
    .line 231
    if-eqz v3, :cond_d

    .line 232
    .line 233
    invoke-interface {v3}, La/bby;->isActive()Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-ne v3, v2, :cond_d

    .line 238
    .line 239
    goto/16 :goto_8

    .line 240
    .line 241
    :cond_d
    iget-object v2, v10, La/p850;->K:La/rpt;

    .line 242
    .line 243
    invoke-virtual {v2}, La/rpt;->f()La/p7m0;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    new-instance v3, La/khx;

    .line 248
    .line 249
    const/16 v4, 0x12

    .line 250
    .line 251
    invoke-direct {v3, v0, v10, v9, v4}, La/khx;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 252
    .line 253
    .line 254
    new-instance v4, La/fnq;

    .line 255
    .line 256
    const/4 v5, 0x4

    .line 257
    invoke-direct {v4, v2, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget-object v3, v10, La/p850;->p:La/mne;

    .line 265
    .line 266
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 267
    .line 268
    invoke-static {v2, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    new-instance v3, La/h750;

    .line 273
    .line 274
    const/4 v5, 0x7

    .line 275
    invoke-direct {v3, v10, v9, v5}, La/h750;-><init>(La/p850;La/yje;B)V

    .line 276
    .line 277
    .line 278
    invoke-static {v4, v2, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    iput-object v2, v0, La/mie0;->a:Ljava/lang/Object;

    .line 283
    .line 284
    invoke-virtual {v10, v1, v2}, La/p850;->N(La/g650;La/bby;)V

    .line 285
    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_e
    instance-of v1, v0, La/x2j;

    .line 289
    .line 290
    if-eqz v1, :cond_11

    .line 291
    .line 292
    move-object v1, v0

    .line 293
    check-cast v1, La/x2j;

    .line 294
    .line 295
    iget-object v1, v1, La/x2j;->a:La/n85;

    .line 296
    .line 297
    iget-object v2, v1, La/n85;->h:La/sba0;

    .line 298
    .line 299
    sget-object v8, La/sba0;->d:La/sba0;

    .line 300
    .line 301
    if-ne v2, v8, :cond_11

    .line 302
    .line 303
    iget-object v11, v10, La/p850;->J:La/g3j;

    .line 304
    .line 305
    new-instance v12, La/p2j;

    .line 306
    .line 307
    iget-wide v2, v1, La/n85;->j:D

    .line 308
    .line 309
    double-to-int v0, v2

    .line 310
    iget-object v1, v1, La/n85;->k:La/huo0;

    .line 311
    .line 312
    instance-of v2, v1, La/aet;

    .line 313
    .line 314
    if-eqz v2, :cond_f

    .line 315
    .line 316
    move-object v9, v1

    .line 317
    check-cast v9, La/aet;

    .line 318
    .line 319
    :cond_f
    if-eqz v9, :cond_10

    .line 320
    .line 321
    invoke-virtual {v9}, La/aet;->a()La/mzb0;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    if-eqz v1, :cond_10

    .line 326
    .line 327
    iget-wide v1, v1, La/mzb0;->a:J

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_10
    const-wide/16 v1, 0x0

    .line 331
    .line 332
    :goto_5
    invoke-direct {v12, v7, v0, v1, v2}, La/p2j;-><init>(Ljava/lang/String;IJ)V

    .line 333
    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    const/4 v15, 0x6

    .line 337
    const/4 v13, 0x0

    .line 338
    invoke-static/range {v10 .. v15}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 339
    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_11
    iget-object v11, v10, La/p850;->J:La/g3j;

    .line 343
    .line 344
    new-instance v12, La/r2j;

    .line 345
    .line 346
    if-nez v0, :cond_12

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_12
    instance-of v1, v0, La/y2j;

    .line 350
    .line 351
    if-eqz v1, :cond_13

    .line 352
    .line 353
    move-object v3, v5

    .line 354
    goto :goto_7

    .line 355
    :cond_13
    instance-of v1, v0, La/x2j;

    .line 356
    .line 357
    if-eqz v1, :cond_14

    .line 358
    .line 359
    move-object v3, v4

    .line 360
    goto :goto_7

    .line 361
    :cond_14
    instance-of v0, v0, La/z2j;

    .line 362
    .line 363
    if-eqz v0, :cond_15

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_15
    :goto_6
    move-object v3, v6

    .line 367
    :goto_7
    invoke-direct {v12, v7, v3}, La/r2j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x6

    .line 372
    const/4 v13, 0x0

    .line 373
    invoke-static/range {v10 .. v15}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 374
    .line 375
    .line 376
    :cond_16
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object v0

    .line 379
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 380
    .line 381
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    iget-object v0, v0, La/j750;->j:La/p850;

    .line 385
    .line 386
    iget-object v1, v0, La/p850;->U:La/u58;

    .line 387
    .line 388
    iget-object v3, v0, La/p850;->Z:La/ix0;

    .line 389
    .line 390
    iget-object v4, v0, La/p850;->W:La/s91;

    .line 391
    .line 392
    const-string v5, "_HEADER"

    .line 393
    .line 394
    const/4 v10, 0x0

    .line 395
    invoke-static {v8, v5, v6, v10}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    sget v6, La/p850;->p0:I

    .line 400
    .line 401
    invoke-virtual {v0, v5}, La/p850;->P(Ljava/lang/String;)La/jge;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    if-nez v5, :cond_17

    .line 406
    .line 407
    goto/16 :goto_f

    .line 408
    .line 409
    :cond_17
    instance-of v6, v5, La/dge;

    .line 410
    .line 411
    const/16 v8, 0xc

    .line 412
    .line 413
    if-eqz v6, :cond_18

    .line 414
    .line 415
    iget-object v0, v0, La/p850;->f0:La/yo4;

    .line 416
    .line 417
    check-cast v5, La/dge;

    .line 418
    .line 419
    iget-object v1, v5, La/dge;->a:La/ha8;

    .line 420
    .line 421
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    check-cast v2, La/aj0;

    .line 426
    .line 427
    iget-object v2, v2, La/aj0;->c:La/nw80;

    .line 428
    .line 429
    invoke-virtual {v2}, La/nw80;->getId()J

    .line 430
    .line 431
    .line 432
    move-result-wide v5

    .line 433
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v0, v2, v7}, La/yo4;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-interface {v1}, La/ha8;->a()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, La/aj0;

    .line 445
    .line 446
    iget-object v0, v0, La/aj0;->c:La/nw80;

    .line 447
    .line 448
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 449
    .line 450
    .line 451
    move-result-wide v0

    .line 452
    long-to-int v0, v0

    .line 453
    sget-object v1, La/y1p;->b:La/y1p;

    .line 454
    .line 455
    invoke-virtual {v3, v0}, La/ix0;->d(I)V

    .line 456
    .line 457
    .line 458
    new-instance v0, La/jr1;

    .line 459
    .line 460
    invoke-direct {v0}, La/jr1;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-static {v4, v0, v10, v10, v8}, La/s91;->d(La/s91;La/lr1;ZZI)V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_f

    .line 467
    .line 468
    :cond_18
    instance-of v6, v5, La/gge;

    .line 469
    .line 470
    const-wide/16 v11, -0x1

    .line 471
    .line 472
    if-eqz v6, :cond_19

    .line 473
    .line 474
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 475
    .line 476
    const-string v2, "tournaments_open"

    .line 477
    .line 478
    const-string v3, "screen"

    .line 479
    .line 480
    invoke-static {v3, v7, v1, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    iget-object v0, v0, La/p850;->X:La/gg5;

    .line 484
    .line 485
    iget-object v0, v0, La/gg5;->a:La/s1p;

    .line 486
    .line 487
    new-instance v1, La/j1p;

    .line 488
    .line 489
    invoke-direct {v1, v7, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 490
    .line 491
    .line 492
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    const-wide/16 v2, 0xd01

    .line 497
    .line 498
    invoke-virtual {v0, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 499
    .line 500
    .line 501
    new-instance v13, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 502
    .line 503
    new-instance v0, La/sm1;

    .line 504
    .line 505
    invoke-direct {v0, v11, v12}, La/sm1;-><init>(J)V

    .line 506
    .line 507
    .line 508
    const/16 v25, 0x0

    .line 509
    .line 510
    const/16 v26, 0x1f7

    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const/4 v15, 0x0

    .line 514
    const-wide/16 v16, 0x0

    .line 515
    .line 516
    const/16 v19, 0x0

    .line 517
    .line 518
    const-wide/16 v20, 0x0

    .line 519
    .line 520
    const-wide/16 v22, 0x0

    .line 521
    .line 522
    const/16 v24, 0x0

    .line 523
    .line 524
    move-object/from16 v18, v0

    .line 525
    .line 526
    invoke-direct/range {v13 .. v26}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v13}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_f

    .line 533
    .line 534
    :cond_19
    instance-of v6, v5, La/hge;

    .line 535
    .line 536
    if-eqz v6, :cond_1a

    .line 537
    .line 538
    new-instance v13, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 539
    .line 540
    new-instance v0, La/sm1;

    .line 541
    .line 542
    invoke-direct {v0, v11, v12}, La/sm1;-><init>(J)V

    .line 543
    .line 544
    .line 545
    const/16 v25, 0x0

    .line 546
    .line 547
    const/16 v26, 0x1f7

    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/4 v15, 0x0

    .line 551
    const-wide/16 v16, 0x0

    .line 552
    .line 553
    const/16 v19, 0x0

    .line 554
    .line 555
    const-wide/16 v20, 0x0

    .line 556
    .line 557
    const-wide/16 v22, 0x0

    .line 558
    .line 559
    const/16 v24, 0x0

    .line 560
    .line 561
    move-object/from16 v18, v0

    .line 562
    .line 563
    invoke-direct/range {v13 .. v26}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v4, v13}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_f

    .line 570
    .line 571
    :cond_1a
    instance-of v6, v5, La/age;

    .line 572
    .line 573
    if-eqz v6, :cond_2a

    .line 574
    .line 575
    check-cast v5, La/age;

    .line 576
    .line 577
    iget-object v5, v5, La/age;->a:La/ha8;

    .line 578
    .line 579
    invoke-interface {v5}, La/ha8;->a()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    check-cast v6, La/xi0;

    .line 584
    .line 585
    iget-object v6, v6, La/xi0;->c:Ljava/lang/Integer;

    .line 586
    .line 587
    if-nez v6, :cond_1b

    .line 588
    .line 589
    invoke-interface {v5}, La/ha8;->a()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    check-cast v6, La/xi0;

    .line 594
    .line 595
    iget-object v6, v6, La/xi0;->h:Ljava/lang/Integer;

    .line 596
    .line 597
    :cond_1b
    if-eqz v6, :cond_1c

    .line 598
    .line 599
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 600
    .line 601
    .line 602
    move-result v6

    .line 603
    int-to-long v11, v6

    .line 604
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 605
    .line 606
    const-string v7, "category_id"

    .line 607
    .line 608
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 609
    .line 610
    .line 611
    move-result-object v11

    .line 612
    const-string v12, "my_aggregator_block_all_call"

    .line 613
    .line 614
    invoke-static {v7, v11, v1, v12}, La/h97;->x(Ljava/lang/String;Ljava/lang/Long;La/kt2;Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    iget-object v1, v3, La/ix0;->a:La/s1p;

    .line 618
    .line 619
    const-wide/16 v11, 0xbee

    .line 620
    .line 621
    invoke-static {v6, v1, v11, v12}, La/b1j;->r(ILa/s1p;J)V

    .line 622
    .line 623
    .line 624
    :cond_1c
    invoke-interface {v5}, La/ha8;->a()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    check-cast v1, La/xi0;

    .line 629
    .line 630
    iget-object v0, v0, La/p850;->e0:La/ctf0;

    .line 631
    .line 632
    iget-object v3, v1, La/xi0;->c:Ljava/lang/Integer;

    .line 633
    .line 634
    iget-object v5, v1, La/xi0;->h:Ljava/lang/Integer;

    .line 635
    .line 636
    if-nez v3, :cond_1d

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_1d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 640
    .line 641
    .line 642
    move-result v6

    .line 643
    const/16 v7, 0x34f

    .line 644
    .line 645
    if-ne v6, v7, :cond_1e

    .line 646
    .line 647
    new-instance v0, La/gr1;

    .line 648
    .line 649
    sget-object v1, La/mdp;->b:La/mdp;

    .line 650
    .line 651
    invoke-direct {v0, v1}, La/gr1;-><init>(La/mdp;)V

    .line 652
    .line 653
    .line 654
    invoke-static {v4, v0, v10, v10, v8}, La/s91;->d(La/s91;La/lr1;ZZI)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_f

    .line 658
    .line 659
    :cond_1e
    :goto_9
    if-nez v3, :cond_1f

    .line 660
    .line 661
    goto :goto_a

    .line 662
    :cond_1f
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 663
    .line 664
    .line 665
    move-result v6

    .line 666
    const/16 v7, 0x339

    .line 667
    .line 668
    if-ne v6, v7, :cond_20

    .line 669
    .line 670
    new-instance v0, La/gr1;

    .line 671
    .line 672
    sget-object v1, La/mdp;->a:La/mdp;

    .line 673
    .line 674
    invoke-direct {v0, v1}, La/gr1;-><init>(La/mdp;)V

    .line 675
    .line 676
    .line 677
    invoke-static {v4, v0, v10, v10, v8}, La/s91;->d(La/s91;La/lr1;ZZI)V

    .line 678
    .line 679
    .line 680
    goto/16 :goto_f

    .line 681
    .line 682
    :cond_20
    :goto_a
    if-nez v3, :cond_21

    .line 683
    .line 684
    goto :goto_b

    .line 685
    :cond_21
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 686
    .line 687
    .line 688
    move-result v6

    .line 689
    const/16 v7, 0x338

    .line 690
    .line 691
    if-ne v6, v7, :cond_22

    .line 692
    .line 693
    new-instance v11, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 694
    .line 695
    new-instance v0, La/lm1;

    .line 696
    .line 697
    sget-object v1, La/nw80;->t:La/nw80;

    .line 698
    .line 699
    invoke-virtual {v1}, La/nw80;->getId()J

    .line 700
    .line 701
    .line 702
    move-result-wide v1

    .line 703
    invoke-direct {v0, v1, v2}, La/lm1;-><init>(J)V

    .line 704
    .line 705
    .line 706
    const/16 v23, 0x0

    .line 707
    .line 708
    const/16 v24, 0x1f7

    .line 709
    .line 710
    const/4 v12, 0x0

    .line 711
    const/4 v13, 0x0

    .line 712
    const-wide/16 v14, 0x0

    .line 713
    .line 714
    const/16 v17, 0x0

    .line 715
    .line 716
    const-wide/16 v18, 0x0

    .line 717
    .line 718
    const-wide/16 v20, 0x0

    .line 719
    .line 720
    const/16 v22, 0x0

    .line 721
    .line 722
    move-object/from16 v16, v0

    .line 723
    .line 724
    invoke-direct/range {v11 .. v24}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v4, v11}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 728
    .line 729
    .line 730
    goto/16 :goto_f

    .line 731
    .line 732
    :cond_22
    :goto_b
    sget-object v6, La/nw80;->a:La/nw80;

    .line 733
    .line 734
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 735
    .line 736
    .line 737
    move-result-wide v7

    .line 738
    long-to-int v7, v7

    .line 739
    const/4 v8, 0x2

    .line 740
    const v11, 0x7f1303d0

    .line 741
    .line 742
    .line 743
    if-nez v5, :cond_23

    .line 744
    .line 745
    goto :goto_c

    .line 746
    :cond_23
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 747
    .line 748
    .line 749
    move-result v12

    .line 750
    if-ne v12, v7, :cond_24

    .line 751
    .line 752
    new-instance v13, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 753
    .line 754
    new-array v1, v10, [Ljava/lang/Object;

    .line 755
    .line 756
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 757
    .line 758
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    const v3, 0x7f130b3c

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v14

    .line 769
    new-array v1, v10, [Ljava/lang/Object;

    .line 770
    .line 771
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 772
    .line 773
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-virtual {v0, v11, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v15

    .line 781
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 782
    .line 783
    .line 784
    move-result-wide v16

    .line 785
    new-instance v0, La/hm1;

    .line 786
    .line 787
    sget-object v1, La/s0s;->b:La/s0s;

    .line 788
    .line 789
    const-wide/16 v1, 0x11

    .line 790
    .line 791
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    invoke-direct {v0, v8, v1, v9}, La/hm1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 800
    .line 801
    .line 802
    const/16 v25, 0x0

    .line 803
    .line 804
    const/16 v26, 0x1f0

    .line 805
    .line 806
    const/16 v19, 0x0

    .line 807
    .line 808
    const-wide/16 v20, 0x0

    .line 809
    .line 810
    const-wide/16 v22, 0x0

    .line 811
    .line 812
    const/16 v24, 0x0

    .line 813
    .line 814
    move-object/from16 v18, v0

    .line 815
    .line 816
    invoke-direct/range {v13 .. v26}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v4, v13}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 820
    .line 821
    .line 822
    goto/16 :goto_f

    .line 823
    .line 824
    :cond_24
    :goto_c
    sget-object v6, La/nw80;->b:La/nw80;

    .line 825
    .line 826
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 827
    .line 828
    .line 829
    move-result-wide v12

    .line 830
    long-to-int v7, v12

    .line 831
    if-nez v5, :cond_25

    .line 832
    .line 833
    goto :goto_d

    .line 834
    :cond_25
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 835
    .line 836
    .line 837
    move-result v12

    .line 838
    if-ne v12, v7, :cond_27

    .line 839
    .line 840
    new-array v1, v10, [Ljava/lang/Object;

    .line 841
    .line 842
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 843
    .line 844
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    const v5, 0x7f13015a

    .line 849
    .line 850
    .line 851
    invoke-virtual {v2, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v13

    .line 855
    new-array v1, v10, [Ljava/lang/Object;

    .line 856
    .line 857
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 858
    .line 859
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    invoke-virtual {v0, v11, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v14

    .line 867
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 868
    .line 869
    .line 870
    move-result-wide v15

    .line 871
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    if-eqz v3, :cond_26

    .line 876
    .line 877
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    int-to-long v1, v1

    .line 882
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    :cond_26
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    new-instance v1, La/hm1;

    .line 894
    .line 895
    invoke-direct {v1, v8, v0, v9}, La/hm1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 896
    .line 897
    .line 898
    new-instance v12, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 899
    .line 900
    const/16 v18, 0x0

    .line 901
    .line 902
    const-wide/16 v19, 0x0

    .line 903
    .line 904
    const-wide/16 v21, 0x0

    .line 905
    .line 906
    const/16 v23, 0x0

    .line 907
    .line 908
    const/16 v24, 0x0

    .line 909
    .line 910
    const/16 v25, 0x1f0

    .line 911
    .line 912
    move-object/from16 v17, v1

    .line 913
    .line 914
    invoke-direct/range {v12 .. v25}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v4, v12}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 918
    .line 919
    .line 920
    goto :goto_f

    .line 921
    :cond_27
    :goto_d
    sget-object v3, La/nw80;->k:La/nw80;

    .line 922
    .line 923
    invoke-virtual {v3}, La/nw80;->getId()J

    .line 924
    .line 925
    .line 926
    move-result-wide v6

    .line 927
    long-to-int v6, v6

    .line 928
    if-nez v5, :cond_28

    .line 929
    .line 930
    goto :goto_e

    .line 931
    :cond_28
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 932
    .line 933
    .line 934
    move-result v7

    .line 935
    if-ne v7, v6, :cond_29

    .line 936
    .line 937
    new-instance v11, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 938
    .line 939
    new-array v1, v10, [Ljava/lang/Object;

    .line 940
    .line 941
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 942
    .line 943
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    const v5, 0x7f130554

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v12

    .line 954
    invoke-virtual {v3}, La/nw80;->getId()J

    .line 955
    .line 956
    .line 957
    move-result-wide v14

    .line 958
    new-instance v0, La/im1;

    .line 959
    .line 960
    invoke-direct {v0, v10, v2}, La/im1;-><init>(ZZ)V

    .line 961
    .line 962
    .line 963
    const/16 v23, 0x0

    .line 964
    .line 965
    const/16 v24, 0x1f2

    .line 966
    .line 967
    const/4 v13, 0x0

    .line 968
    const/16 v17, 0x0

    .line 969
    .line 970
    const-wide/16 v18, 0x0

    .line 971
    .line 972
    const-wide/16 v20, 0x0

    .line 973
    .line 974
    const/16 v22, 0x0

    .line 975
    .line 976
    move-object/from16 v16, v0

    .line 977
    .line 978
    invoke-direct/range {v11 .. v24}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v4, v11}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 982
    .line 983
    .line 984
    goto :goto_f

    .line 985
    :cond_29
    :goto_e
    if-eqz v5, :cond_2a

    .line 986
    .line 987
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    new-instance v11, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 992
    .line 993
    iget-object v1, v1, La/xi0;->b:La/ti0;

    .line 994
    .line 995
    invoke-static {v1, v0}, La/ucx;->Y(La/ti0;La/ctf0;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v12

    .line 999
    int-to-long v14, v3

    .line 1000
    new-instance v0, La/im1;

    .line 1001
    .line 1002
    invoke-direct {v0, v10, v2}, La/im1;-><init>(ZZ)V

    .line 1003
    .line 1004
    .line 1005
    const/16 v23, 0x0

    .line 1006
    .line 1007
    const/16 v24, 0x1f2

    .line 1008
    .line 1009
    const/4 v13, 0x0

    .line 1010
    const/16 v17, 0x0

    .line 1011
    .line 1012
    const-wide/16 v18, 0x0

    .line 1013
    .line 1014
    const-wide/16 v20, 0x0

    .line 1015
    .line 1016
    const/16 v22, 0x0

    .line 1017
    .line 1018
    move-object/from16 v16, v0

    .line 1019
    .line 1020
    invoke-direct/range {v11 .. v24}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v4, v11}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 1024
    .line 1025
    .line 1026
    :cond_2a
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
