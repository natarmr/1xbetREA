.class public final Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Z

.field public final synthetic j:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;


# direct methods
.method public constructor <init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->j:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->j:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    iput-boolean p0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->i:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    check-cast p2, La/yje;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->i:Z

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/e;->j:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 11
    .line 12
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 13
    .line 14
    iget-object v3, v0, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    iget-object v4, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->v:La/mne;

    .line 17
    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    sget-object v1, La/e32;->a:La/e32;

    .line 21
    .line 22
    sget v5, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 23
    .line 24
    iget-object v5, v3, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v6, v3

    .line 34
    check-cast v6, La/n32;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v7, v6, La/n32;->f:La/f32;

    .line 40
    .line 41
    iget v7, v7, La/f32;->b:I

    .line 42
    .line 43
    new-instance v12, La/f32;

    .line 44
    .line 45
    invoke-direct {v12, v1, v7}, La/f32;-><init>(La/e32;I)V

    .line 46
    .line 47
    .line 48
    const/16 v13, 0xdf

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    invoke-static/range {v6 .. v13}, La/n32;->a(La/n32;La/hep0;La/d32;La/c32;La/b32;La/wcb;La/f32;I)La/n32;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    iget-object v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->J:La/bby;

    .line 66
    .line 67
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iget-object v8, v4, La/mne;->a:La/rwj;

    .line 75
    .line 76
    new-instance v6, La/dj1;

    .line 77
    .line 78
    const/16 v1, 0x17

    .line 79
    .line 80
    invoke-direct {v6, v1}, La/dj1;-><init>(B)V

    .line 81
    .line 82
    .line 83
    new-instance v9, La/z32;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-direct {v9, v0, v1, v2}, La/z32;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 88
    .line 89
    .line 90
    const/16 v10, 0xa

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iput-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->J:La/bby;

    .line 98
    .line 99
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->K:La/c4m0;

    .line 100
    .line 101
    const/4 v5, 0x2

    .line 102
    const/4 v6, 0x4

    .line 103
    if-eqz v3, :cond_1

    .line 104
    .line 105
    invoke-virtual {v3}, La/pby;->isActive()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-ne v3, v2, :cond_1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->y:La/e1u;

    .line 113
    .line 114
    invoke-virtual {v3}, La/e1u;->a()La/xp90;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v7, La/e42;

    .line 119
    .line 120
    invoke-direct {v7, v0, v1, v5}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 121
    .line 122
    .line 123
    new-instance v8, La/fnq;

    .line 124
    .line 125
    invoke-direct {v8, v3, v7, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    iget-object v7, v4, La/mne;->a:La/rwj;

    .line 133
    .line 134
    invoke-static {v3, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    new-instance v7, La/e42;

    .line 139
    .line 140
    const/4 v9, 0x3

    .line 141
    invoke-direct {v7, v0, v1, v9}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {v8, v3, v7}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iput-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->K:La/c4m0;

    .line 149
    .line 150
    :goto_0
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->L:La/c4m0;

    .line 151
    .line 152
    if-eqz v3, :cond_2

    .line 153
    .line 154
    invoke-virtual {v3}, La/pby;->isActive()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-ne v3, v2, :cond_2

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_2
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->z:La/n4u;

    .line 162
    .line 163
    invoke-virtual {v3}, La/n4u;->d()La/xp90;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    new-instance v7, La/e42;

    .line 168
    .line 169
    invoke-direct {v7, v0, v1, v2}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 170
    .line 171
    .line 172
    new-instance v8, La/fnq;

    .line 173
    .line 174
    invoke-direct {v8, v3, v7, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    iget-object v7, v4, La/mne;->a:La/rwj;

    .line 182
    .line 183
    invoke-static {v3, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    new-instance v7, La/pd;

    .line 188
    .line 189
    const/16 v9, 0xb

    .line 190
    .line 191
    invoke-direct {v7, v5, v1, v9}, La/pd;-><init>(ILa/yje;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v8, v3, v7}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    iput-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->L:La/c4m0;

    .line 199
    .line 200
    :goto_1
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->M:La/c4m0;

    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    if-eqz v3, :cond_3

    .line 204
    .line 205
    invoke-virtual {v3}, La/pby;->isActive()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-ne v3, v2, :cond_3

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_3
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->A:La/f4u;

    .line 213
    .line 214
    sget-object v8, La/n0w;->a:La/n0w;

    .line 215
    .line 216
    invoke-virtual {v3, v8}, La/f4u;->a(La/n0w;)La/gmq;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    new-instance v8, La/e42;

    .line 221
    .line 222
    invoke-direct {v8, v0, v1, v7}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 223
    .line 224
    .line 225
    new-instance v9, La/fnq;

    .line 226
    .line 227
    invoke-direct {v9, v3, v8, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-object v6, v4, La/mne;->a:La/rwj;

    .line 235
    .line 236
    invoke-static {v3, v6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    new-instance v6, La/pd;

    .line 241
    .line 242
    const/16 v8, 0xa

    .line 243
    .line 244
    invoke-direct {v6, v5, v1, v8}, La/pd;-><init>(ILa/yje;B)V

    .line 245
    .line 246
    .line 247
    invoke-static {v9, v3, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    iput-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->M:La/c4m0;

    .line 252
    .line 253
    :goto_2
    iget-object v3, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->q:Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 254
    .line 255
    instance-of v5, v3, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 256
    .line 257
    if-eqz v5, :cond_7

    .line 258
    .line 259
    check-cast v3, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 260
    .line 261
    iget-object v3, v3, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;->d:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    check-cast v5, La/n32;

    .line 268
    .line 269
    iget-object v5, v5, La/n32;->a:La/hep0;

    .line 270
    .line 271
    instance-of v5, v5, La/gep0;

    .line 272
    .line 273
    if-nez v5, :cond_7

    .line 274
    .line 275
    iget-object v5, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->N:La/bby;

    .line 276
    .line 277
    if-eqz v5, :cond_4

    .line 278
    .line 279
    invoke-interface {v5}, La/bby;->isActive()Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    if-ne v5, v2, :cond_4

    .line 284
    .line 285
    goto/16 :goto_3

    .line 286
    .line 287
    :cond_4
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    const-class v2, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v5, ".loadParticipantStatistic"

    .line 298
    .line 299
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    const-class v2, Ljava/net/SocketTimeoutException;

    .line 304
    .line 305
    const-class v5, Ljava/net/UnknownHostException;

    .line 306
    .line 307
    filled-new-array {v2, v5}, [Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v13

    .line 315
    iget-object v2, v4, La/mne;->a:La/rwj;

    .line 316
    .line 317
    new-instance v15, La/y32;

    .line 318
    .line 319
    invoke-direct {v15, v0, v3, v1, v7}, La/y32;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 320
    .line 321
    .line 322
    new-instance v1, La/s32;

    .line 323
    .line 324
    invoke-direct {v1, v0, v7}, La/s32;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 325
    .line 326
    .line 327
    const/16 v19, 0x0

    .line 328
    .line 329
    const/16 v20, 0x250

    .line 330
    .line 331
    const/4 v10, 0x3

    .line 332
    const-wide/16 v11, 0x3

    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    move-object/from16 v18, v1

    .line 338
    .line 339
    move-object/from16 v17, v2

    .line 340
    .line 341
    invoke-static/range {v8 .. v20}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    iput-object v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->N:La/bby;

    .line 346
    .line 347
    goto :goto_3

    .line 348
    :cond_5
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, La/n32;

    .line 353
    .line 354
    iget-object v4, v1, La/n32;->b:La/d32;

    .line 355
    .line 356
    iget-object v4, v4, La/d32;->a:La/m32;

    .line 357
    .line 358
    sget-object v5, La/m32;->a:La/m32;

    .line 359
    .line 360
    if-ne v4, v5, :cond_7

    .line 361
    .line 362
    iget-object v4, v1, La/n32;->c:La/c32;

    .line 363
    .line 364
    iget-object v4, v4, La/c32;->a:La/m32;

    .line 365
    .line 366
    if-ne v4, v5, :cond_7

    .line 367
    .line 368
    iget-object v1, v1, La/n32;->d:La/b32;

    .line 369
    .line 370
    iget-object v1, v1, La/b32;->a:La/m32;

    .line 371
    .line 372
    if-ne v1, v5, :cond_7

    .line 373
    .line 374
    iget-object v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->N:La/bby;

    .line 375
    .line 376
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 377
    .line 378
    .line 379
    iget-object v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->K:La/c4m0;

    .line 380
    .line 381
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 382
    .line 383
    .line 384
    iget-object v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->L:La/c4m0;

    .line 385
    .line 386
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 387
    .line 388
    .line 389
    iget-object v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->M:La/c4m0;

    .line 390
    .line 391
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 392
    .line 393
    .line 394
    sget-object v0, La/e32;->b:La/e32;

    .line 395
    .line 396
    iget-object v1, v3, La/ocj;->a:La/p7m0;

    .line 397
    .line 398
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-object v4, v3

    .line 406
    check-cast v4, La/n32;

    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    iget-object v5, v4, La/n32;->f:La/f32;

    .line 412
    .line 413
    iget v5, v5, La/f32;->b:I

    .line 414
    .line 415
    new-instance v10, La/f32;

    .line 416
    .line 417
    invoke-direct {v10, v0, v5}, La/f32;-><init>(La/e32;I)V

    .line 418
    .line 419
    .line 420
    const/16 v11, 0xdf

    .line 421
    .line 422
    const/4 v5, 0x0

    .line 423
    const/4 v6, 0x0

    .line 424
    const/4 v7, 0x0

    .line 425
    const/4 v8, 0x0

    .line 426
    const/4 v9, 0x0

    .line 427
    invoke-static/range {v4 .. v11}, La/n32;->a(La/n32;La/hep0;La/d32;La/c32;La/b32;La/wcb;La/f32;I)La/n32;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_6

    .line 436
    .line 437
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0
.end method
