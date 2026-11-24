.class public final synthetic La/eco;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/xk80;

.field public final synthetic e:La/vne;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/pz40;La/xk80;La/vne;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/eco;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/eco;->b:La/l7m0;

    iput-object p2, p0, La/eco;->c:La/pz40;

    iput-object p3, p0, La/eco;->d:La/xk80;

    iput-object p4, p0, La/eco;->e:La/vne;

    iput-object p5, p0, La/eco;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/pz40;La/xk80;La/vne;La/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/eco;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/eco;->c:La/pz40;

    iput-object p2, p0, La/eco;->d:La/xk80;

    iput-object p3, p0, La/eco;->e:La/vne;

    iput-object p4, p0, La/eco;->b:La/l7m0;

    iput-object p5, p0, La/eco;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eco;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const v4, 0x7f08091b

    .line 9
    .line 10
    .line 11
    const v5, 0x7f080c17

    .line 12
    .line 13
    .line 14
    const v6, 0x7f080c1e

    .line 15
    .line 16
    .line 17
    const/16 v7, 0xa

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x2

    .line 21
    const/4 v10, 0x1

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v15, p1

    .line 26
    .line 27
    check-cast v15, La/fet;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    and-int/lit8 v11, v1, 0x3

    .line 38
    .line 39
    if-eq v11, v9, :cond_0

    .line 40
    .line 41
    move v8, v10

    .line 42
    :cond_0
    and-int/2addr v1, v10

    .line 43
    invoke-virtual {v15, v1, v8}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_8

    .line 48
    .line 49
    iget-object v11, v0, La/eco;->b:La/l7m0;

    .line 50
    .line 51
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, La/gkw;

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget-object v1, v1, La/gkw;->b:La/a4x;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    new-instance v8, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_4

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, La/ekw;

    .line 87
    .line 88
    iget-object v7, v7, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 89
    .line 90
    if-eqz v7, :cond_3

    .line 91
    .line 92
    instance-of v9, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 93
    .line 94
    if-eqz v9, :cond_1

    .line 95
    .line 96
    move v7, v6

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    instance-of v9, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 99
    .line 100
    if-eqz v9, :cond_2

    .line 101
    .line 102
    move v7, v5

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    instance-of v7, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 105
    .line 106
    if-eqz v7, :cond_3

    .line 107
    .line 108
    move v7, v4

    .line 109
    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-static {v8}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    sget-object v1, La/lak0;->c:La/lak0;

    .line 129
    .line 130
    :goto_2
    new-instance v3, La/mjw;

    .line 131
    .line 132
    sget-object v4, La/kjw;->a:La/kjw;

    .line 133
    .line 134
    invoke-direct {v3, v4, v1}, La/mjw;-><init>(La/ljw;La/i4;)V

    .line 135
    .line 136
    .line 137
    iget-object v9, v0, La/eco;->d:La/xk80;

    .line 138
    .line 139
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v10, v0, La/eco;->e:La/vne;

    .line 144
    .line 145
    invoke-virtual {v15, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    or-int/2addr v1, v4

    .line 150
    invoke-virtual {v15, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    or-int/2addr v1, v4

    .line 155
    iget-object v12, v0, La/eco;->f:Lkotlin/jvm/functions/Function1;

    .line 156
    .line 157
    invoke-virtual {v15, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    or-int/2addr v1, v4

    .line 162
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    if-nez v1, :cond_6

    .line 167
    .line 168
    if-ne v4, v2, :cond_7

    .line 169
    .line 170
    :cond_6
    new-instance v8, La/cyj;

    .line 171
    .line 172
    const/4 v13, 0x2

    .line 173
    invoke-direct/range {v8 .. v13}, La/cyj;-><init>(La/xk80;La/vne;La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v15, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    move-object v4, v8

    .line 180
    :cond_7
    move-object v14, v4

    .line 181
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/4 v11, 0x0

    .line 186
    iget-object v13, v0, La/eco;->c:La/pz40;

    .line 187
    .line 188
    move-object v12, v3

    .line 189
    invoke-static/range {v11 .. v16}, La/v3c;->x(La/mm40;La/mjw;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    invoke-virtual {v15}, La/fet;->X()V

    .line 194
    .line 195
    .line 196
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    :goto_4
    return-object v3

    .line 199
    :pswitch_0
    move-object/from16 v1, p1

    .line 200
    .line 201
    check-cast v1, La/fet;

    .line 202
    .line 203
    move-object/from16 v11, p2

    .line 204
    .line 205
    check-cast v11, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    and-int/lit8 v12, v11, 0x3

    .line 212
    .line 213
    if-eq v12, v9, :cond_9

    .line 214
    .line 215
    move v8, v10

    .line 216
    :cond_9
    and-int/lit8 v9, v11, 0x1

    .line 217
    .line 218
    invoke-virtual {v1, v9, v8}, La/fet;->U(IZ)Z

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    if-eqz v8, :cond_12

    .line 223
    .line 224
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    iget-object v12, v0, La/eco;->b:La/l7m0;

    .line 229
    .line 230
    if-ne v8, v2, :cond_f

    .line 231
    .line 232
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    check-cast v8, La/gkw;

    .line 237
    .line 238
    if-eqz v8, :cond_e

    .line 239
    .line 240
    iget-object v8, v8, La/gkw;->b:La/a4x;

    .line 241
    .line 242
    if-eqz v8, :cond_e

    .line 243
    .line 244
    new-instance v9, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {v8, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_d

    .line 262
    .line 263
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    check-cast v8, La/ekw;

    .line 268
    .line 269
    iget-object v8, v8, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 270
    .line 271
    if-eqz v8, :cond_c

    .line 272
    .line 273
    instance-of v10, v8, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 274
    .line 275
    if-eqz v10, :cond_a

    .line 276
    .line 277
    move v8, v6

    .line 278
    goto :goto_6

    .line 279
    :cond_a
    instance-of v10, v8, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 280
    .line 281
    if-eqz v10, :cond_b

    .line 282
    .line 283
    move v8, v5

    .line 284
    goto :goto_6

    .line 285
    :cond_b
    instance-of v8, v8, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 286
    .line 287
    if-eqz v8, :cond_c

    .line 288
    .line 289
    move v8, v4

    .line 290
    :goto_6
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 299
    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_d
    invoke-static {v9}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    if-eqz v3, :cond_e

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_e
    sget-object v3, La/lak0;->c:La/lak0;

    .line 310
    .line 311
    :goto_7
    new-instance v8, La/mjw;

    .line 312
    .line 313
    sget-object v4, La/jjw;->a:La/jjw;

    .line 314
    .line 315
    invoke-direct {v8, v4, v3}, La/mjw;-><init>(La/ljw;La/i4;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_f
    move-object v5, v8

    .line 322
    check-cast v5, La/mjw;

    .line 323
    .line 324
    iget-object v10, v0, La/eco;->d:La/xk80;

    .line 325
    .line 326
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    iget-object v11, v0, La/eco;->e:La/vne;

    .line 331
    .line 332
    invoke-virtual {v1, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    or-int/2addr v3, v4

    .line 337
    invoke-virtual {v1, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    or-int/2addr v3, v4

    .line 342
    iget-object v13, v0, La/eco;->f:Lkotlin/jvm/functions/Function1;

    .line 343
    .line 344
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    or-int/2addr v3, v4

    .line 349
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    if-nez v3, :cond_10

    .line 354
    .line 355
    if-ne v4, v2, :cond_11

    .line 356
    .line 357
    :cond_10
    new-instance v9, La/cyj;

    .line 358
    .line 359
    const/4 v14, 0x1

    .line 360
    invoke-direct/range {v9 .. v14}, La/cyj;-><init>(La/xk80;La/vne;La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    move-object v4, v9

    .line 367
    :cond_11
    move-object v7, v4

    .line 368
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 369
    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v4, 0x0

    .line 372
    iget-object v6, v0, La/eco;->c:La/pz40;

    .line 373
    .line 374
    move-object v8, v1

    .line 375
    invoke-static/range {v4 .. v9}, La/v3c;->x(La/mm40;La/mjw;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 376
    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_12
    move-object v8, v1

    .line 380
    invoke-virtual {v8}, La/fet;->X()V

    .line 381
    .line 382
    .line 383
    :goto_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    :goto_9
    return-object v3

    .line 386
    nop

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
