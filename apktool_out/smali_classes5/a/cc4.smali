.class public final La/cc4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/kc4;


# direct methods
.method public synthetic constructor <init>(La/kc4;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cc4;->i:B

    iput-object p1, p0, La/cc4;->l:La/kc4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cc4;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cc4;->l:La/kc4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/cc4;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/cc4;-><init>(La/kc4;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/cc4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/cc4;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/cc4;-><init>(La/kc4;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/cc4;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cc4;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/mm4;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/cc4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cc4;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/fd4;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/cc4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/cc4;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/cc4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cc4;->i:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/cc4;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/mm4;

    .line 17
    .line 18
    sget-object v7, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v8, v0, La/cc4;->j:Z

    .line 21
    .line 22
    iget-object v9, v0, La/cc4;->l:La/kc4;

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    if-ne v8, v5, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, v9, La/kc4;->p:La/im4;

    .line 40
    .line 41
    iput-object v1, v0, La/cc4;->k:Ljava/lang/Object;

    .line 42
    .line 43
    iput-boolean v5, v0, La/cc4;->j:Z

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v5, La/jl4;->a:La/jl4;

    .line 49
    .line 50
    invoke-virtual {v4, v5, v0}, La/im4;->j(La/xl4;La/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-ne v0, v7, :cond_2

    .line 55
    .line 56
    move-object v6, v7

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    :goto_0
    if-eqz v1, :cond_5

    .line 59
    .line 60
    instance-of v0, v1, La/lm4;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    sget v0, La/kc4;->Y:I

    .line 65
    .line 66
    iget-object v0, v9, La/kc4;->s:La/mne;

    .line 67
    .line 68
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 69
    .line 70
    new-instance v1, La/sb4;

    .line 71
    .line 72
    invoke-direct {v1, v9, v3}, La/sb4;-><init>(La/kc4;B)V

    .line 73
    .line 74
    .line 75
    new-instance v3, La/bu;

    .line 76
    .line 77
    invoke-direct {v3, v9, v6, v2}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v0, v1, v3}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    instance-of v0, v1, La/km4;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, v9, La/kc4;->J:La/kd4;

    .line 89
    .line 90
    iget-object v1, v0, La/kd4;->a:La/i1w0;

    .line 91
    .line 92
    new-instance v2, La/b33;

    .line 93
    .line 94
    const/16 v3, 0x10

    .line 95
    .line 96
    invoke-direct {v2, v0, v3}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    instance-of v0, v1, La/jm4;

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    new-instance v0, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 108
    .line 109
    check-cast v1, La/jm4;

    .line 110
    .line 111
    iget-object v2, v1, La/jm4;->a:Ljava/lang/Throwable;

    .line 112
    .line 113
    iget-object v1, v1, La/jm4;->b:La/uu4;

    .line 114
    .line 115
    invoke-static {v1}, La/sc4;->a(La/uu4;)Lorg/xplatform/login/core/presentation/model/AuthDataModel;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v0, v2, v1}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 120
    .line 121
    .line 122
    sget v1, La/kc4;->Y:I

    .line 123
    .line 124
    invoke-virtual {v9, v0}, La/kc4;->O(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 131
    .line 132
    .line 133
    :goto_2
    return-object v6

    .line 134
    :pswitch_0
    iget-object v1, v0, La/cc4;->l:La/kc4;

    .line 135
    .line 136
    iget-object v7, v1, La/kc4;->x:La/ctf0;

    .line 137
    .line 138
    iget-object v8, v1, La/i3t0;->f:La/oyg0;

    .line 139
    .line 140
    iget-object v9, v1, La/i3t0;->i:La/ocj;

    .line 141
    .line 142
    iget-object v10, v0, La/cc4;->k:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v10, La/fd4;

    .line 145
    .line 146
    sget-object v11, La/wne;->a:La/wne;

    .line 147
    .line 148
    iget-boolean v12, v0, La/cc4;->j:Z

    .line 149
    .line 150
    if-eqz v12, :cond_7

    .line 151
    .line 152
    if-ne v12, v5, :cond_6

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_a

    .line 162
    .line 163
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object v4, v1, La/kc4;->q:La/rc4;

    .line 167
    .line 168
    iput-object v10, v0, La/cc4;->k:Ljava/lang/Object;

    .line 169
    .line 170
    iput-boolean v5, v0, La/cc4;->j:Z

    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    sget-object v12, La/oc4;->a:La/oc4;

    .line 176
    .line 177
    invoke-virtual {v4, v12, v0}, La/rc4;->i(La/pc4;La/zje;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-ne v0, v11, :cond_8

    .line 182
    .line 183
    move-object v6, v11

    .line 184
    goto/16 :goto_a

    .line 185
    .line 186
    :cond_8
    :goto_3
    sget v0, La/kc4;->Y:I

    .line 187
    .line 188
    iget-object v0, v1, La/kc4;->I:La/cmt;

    .line 189
    .line 190
    iget-object v4, v1, La/kc4;->J:La/kd4;

    .line 191
    .line 192
    sget-object v11, La/cd4;->a:La/cd4;

    .line 193
    .line 194
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    const/4 v12, 0x0

    .line 199
    if-eqz v11, :cond_a

    .line 200
    .line 201
    new-instance v0, La/gb4;

    .line 202
    .line 203
    new-array v2, v12, [Ljava/lang/Object;

    .line 204
    .line 205
    iget-object v3, v7, La/ctf0;->b:La/lsm0;

    .line 206
    .line 207
    invoke-static {v2, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const v4, 0x7f130dca

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    new-array v3, v12, [Ljava/lang/Object;

    .line 219
    .line 220
    iget-object v4, v7, La/ctf0;->b:La/lsm0;

    .line 221
    .line 222
    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    const v5, 0x7f130437

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-direct {v0, v2, v3, v12}, La/gb4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, La/kc4;->M()V

    .line 240
    .line 241
    .line 242
    iget-object v11, v9, La/ocj;->a:La/p7m0;

    .line 243
    .line 244
    :cond_9
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-object v12, v0

    .line 252
    check-cast v12, La/mb4;

    .line 253
    .line 254
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    const/16 v23, 0x0

    .line 258
    .line 259
    const/16 v24, 0x3ff7

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    .line 268
    const/16 v18, 0x0

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const/16 v22, 0x0

    .line 277
    .line 278
    invoke-static/range {v12 .. v24}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v11, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_9

    .line 287
    .line 288
    goto/16 :goto_9

    .line 289
    .line 290
    :cond_a
    sget-object v11, La/tc4;->a:La/tc4;

    .line 291
    .line 292
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    if-eqz v11, :cond_c

    .line 297
    .line 298
    invoke-virtual {v1}, La/kc4;->R()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, La/kc4;->M()V

    .line 302
    .line 303
    .line 304
    iget-object v11, v9, La/ocj;->a:La/p7m0;

    .line 305
    .line 306
    :cond_b
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-object v12, v0

    .line 314
    check-cast v12, La/mb4;

    .line 315
    .line 316
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    const/16 v23, 0x0

    .line 320
    .line 321
    const/16 v24, 0x3ff7

    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const/4 v14, 0x0

    .line 325
    const/4 v15, 0x0

    .line 326
    const/16 v16, 0x0

    .line 327
    .line 328
    const/16 v17, 0x0

    .line 329
    .line 330
    const/16 v18, 0x0

    .line 331
    .line 332
    const/16 v19, 0x0

    .line 333
    .line 334
    const/16 v20, 0x0

    .line 335
    .line 336
    const/16 v21, 0x0

    .line 337
    .line 338
    const/16 v22, 0x0

    .line 339
    .line 340
    invoke-static/range {v12 .. v24}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v11, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_b

    .line 349
    .line 350
    goto/16 :goto_9

    .line 351
    .line 352
    :cond_c
    sget-object v11, La/ad4;->a:La/ad4;

    .line 353
    .line 354
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-eqz v11, :cond_10

    .line 359
    .line 360
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iget-object v0, v4, La/kd4;->a:La/i1w0;

    .line 364
    .line 365
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 368
    .line 369
    .line 370
    new-instance v2, Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1;

    .line 371
    .line 372
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 373
    .line 374
    .line 375
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 376
    .line 377
    if-eqz v3, :cond_d

    .line 378
    .line 379
    new-instance v3, La/e1w0;

    .line 380
    .line 381
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 382
    .line 383
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 384
    .line 385
    .line 386
    new-instance v2, La/c8d;

    .line 387
    .line 388
    sget-object v4, La/y7d;->a:La/v7d;

    .line 389
    .line 390
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_d
    new-instance v3, La/w0w0;

    .line 398
    .line 399
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 400
    .line 401
    .line 402
    new-instance v2, La/c8d;

    .line 403
    .line 404
    sget-object v4, La/y7d;->a:La/v7d;

    .line 405
    .line 406
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    :goto_4
    invoke-static {v0, v1, v12}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    :goto_5
    move-object v2, v1

    .line 417
    check-cast v2, La/paw;

    .line 418
    .line 419
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-eqz v3, :cond_e

    .line 424
    .line 425
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    check-cast v2, La/oe50;

    .line 430
    .line 431
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 432
    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_e
    iget-object v11, v9, La/ocj;->a:La/p7m0;

    .line 436
    .line 437
    :cond_f
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-object v12, v0

    .line 445
    check-cast v12, La/mb4;

    .line 446
    .line 447
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    const/16 v23, 0x0

    .line 451
    .line 452
    const/16 v24, 0x3ff7

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const/4 v14, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    const/16 v16, 0x0

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const/16 v18, 0x0

    .line 462
    .line 463
    const/16 v19, 0x0

    .line 464
    .line 465
    const/16 v20, 0x0

    .line 466
    .line 467
    const/16 v21, 0x0

    .line 468
    .line 469
    const/16 v22, 0x0

    .line 470
    .line 471
    invoke-static/range {v12 .. v24}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v11, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_f

    .line 480
    .line 481
    goto/16 :goto_9

    .line 482
    .line 483
    :cond_10
    instance-of v11, v10, La/zc4;

    .line 484
    .line 485
    if-eqz v11, :cond_11

    .line 486
    .line 487
    check-cast v10, La/zc4;

    .line 488
    .line 489
    iget-object v0, v10, La/zc4;->a:Lorg/xplatform/login/core/presentation/model/AuthDataModel;

    .line 490
    .line 491
    invoke-static {v0}, La/vu4;->a(Lorg/xplatform/login/core/presentation/model/AuthDataModel;)La/uu4;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    new-instance v7, La/p6a;

    .line 496
    .line 497
    invoke-static {v4}, La/atm0;->m(La/uu4;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    invoke-direct {v7, v8, v2}, La/p6a;-><init>(Ljava/lang/String;B)V

    .line 502
    .line 503
    .line 504
    new-instance v2, La/ac4;

    .line 505
    .line 506
    invoke-direct {v2, v1, v4, v6, v5}, La/ac4;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 507
    .line 508
    .line 509
    new-instance v4, La/sb4;

    .line 510
    .line 511
    invoke-direct {v4, v1, v12}, La/sb4;-><init>(La/kc4;B)V

    .line 512
    .line 513
    .line 514
    new-instance v15, La/tb4;

    .line 515
    .line 516
    invoke-direct {v15, v1, v0, v12}, La/tb4;-><init>(La/kc4;Lorg/xplatform/login/core/presentation/model/AuthDataModel;B)V

    .line 517
    .line 518
    .line 519
    iget-object v0, v1, La/kc4;->z:La/cyh;

    .line 520
    .line 521
    invoke-virtual {v0, v7}, La/cyh;->a(La/v0;)La/p5a;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    new-instance v5, La/wa;

    .line 526
    .line 527
    const/16 v7, 0xb

    .line 528
    .line 529
    invoke-direct {v5, v1, v6, v7}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 530
    .line 531
    .line 532
    new-instance v7, La/fnq;

    .line 533
    .line 534
    invoke-direct {v7, v0, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 535
    .line 536
    .line 537
    new-instance v0, La/ac4;

    .line 538
    .line 539
    invoke-direct {v0, v2, v4, v6, v12}, La/ac4;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 540
    .line 541
    .line 542
    new-instance v2, La/fnq;

    .line 543
    .line 544
    const/4 v4, 0x4

    .line 545
    invoke-direct {v2, v7, v0, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 546
    .line 547
    .line 548
    new-instance v0, La/e00;

    .line 549
    .line 550
    invoke-direct {v0, v1, v6, v3}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 551
    .line 552
    .line 553
    new-instance v3, La/dnq;

    .line 554
    .line 555
    invoke-direct {v3, v2, v0, v12}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 556
    .line 557
    .line 558
    new-instance v4, La/j94;

    .line 559
    .line 560
    new-instance v6, La/j94;

    .line 561
    .line 562
    const/16 v19, 0x0

    .line 563
    .line 564
    const/16 v20, 0x3

    .line 565
    .line 566
    const/4 v14, 0x1

    .line 567
    const-class v16, Lkotlin/jvm/functions/Function1;

    .line 568
    .line 569
    const-string v17, "invoke"

    .line 570
    .line 571
    const-string v18, "invoke(Ljava/lang/Object;)Ljava/lang/Object;"

    .line 572
    .line 573
    move-object v13, v6

    .line 574
    invoke-direct/range {v13 .. v20}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 575
    .line 576
    .line 577
    const/4 v10, 0x0

    .line 578
    const/4 v11, 0x4

    .line 579
    const/4 v5, 0x1

    .line 580
    const-class v7, La/jhy;

    .line 581
    .line 582
    const-string v8, "invoke"

    .line 583
    .line 584
    const-string v9, "invoke(Ljava/lang/Object;)Ljava/lang/Object;"

    .line 585
    .line 586
    invoke-direct/range {v4 .. v11}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 587
    .line 588
    .line 589
    iget-object v0, v1, La/kc4;->s:La/mne;

    .line 590
    .line 591
    iget-object v0, v0, La/mne;->c:La/vs10;

    .line 592
    .line 593
    invoke-virtual {v1, v3, v0, v4}, La/i3t0;->J(La/gmq;La/lne;Lkotlin/jvm/functions/Function1;)La/c4m0;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    iput-object v0, v1, La/kc4;->U:La/c4m0;

    .line 598
    .line 599
    goto/16 :goto_9

    .line 600
    .line 601
    :cond_11
    instance-of v2, v10, La/xc4;

    .line 602
    .line 603
    if-eqz v2, :cond_17

    .line 604
    .line 605
    check-cast v10, La/xc4;

    .line 606
    .line 607
    iget-object v0, v10, La/xc4;->a:La/fn50;

    .line 608
    .line 609
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    iget-object v1, v0, La/fn50;->b:Ljava/lang/String;

    .line 613
    .line 614
    iget-object v2, v0, La/fn50;->f:Ljava/lang/String;

    .line 615
    .line 616
    iget-boolean v3, v0, La/fn50;->d:Z

    .line 617
    .line 618
    const-string v5, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 619
    .line 620
    if-eqz v3, :cond_12

    .line 621
    .line 622
    new-instance v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 623
    .line 624
    iget-object v0, v0, La/fn50;->c:Ljava/lang/String;

    .line 625
    .line 626
    invoke-direct {v3, v1, v5, v2, v0}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    goto :goto_6

    .line 630
    :cond_12
    iget-boolean v3, v0, La/fn50;->e:Z

    .line 631
    .line 632
    if-eqz v3, :cond_13

    .line 633
    .line 634
    new-instance v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;

    .line 635
    .line 636
    sget-object v0, Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$None;->a:Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$None;

    .line 637
    .line 638
    invoke-direct {v3, v1, v5, v2, v0}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;)V

    .line 639
    .line 640
    .line 641
    goto :goto_6

    .line 642
    :cond_13
    new-instance v3, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;

    .line 643
    .line 644
    iget-boolean v0, v0, La/fn50;->g:Z

    .line 645
    .line 646
    invoke-direct {v3, v1, v5, v2, v0}, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 647
    .line 648
    .line 649
    :goto_6
    iget-object v0, v4, La/kd4;->a:La/i1w0;

    .line 650
    .line 651
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 652
    .line 653
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 654
    .line 655
    .line 656
    new-instance v2, Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;

    .line 657
    .line 658
    invoke-direct {v2, v3}, Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;-><init>(Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;)V

    .line 659
    .line 660
    .line 661
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 662
    .line 663
    if-eqz v3, :cond_14

    .line 664
    .line 665
    new-instance v3, La/e1w0;

    .line 666
    .line 667
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 668
    .line 669
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 670
    .line 671
    .line 672
    new-instance v2, La/c8d;

    .line 673
    .line 674
    sget-object v4, La/y7d;->a:La/v7d;

    .line 675
    .line 676
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    goto :goto_7

    .line 683
    :cond_14
    new-instance v3, La/w0w0;

    .line 684
    .line 685
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 686
    .line 687
    .line 688
    new-instance v2, La/c8d;

    .line 689
    .line 690
    sget-object v4, La/y7d;->a:La/v7d;

    .line 691
    .line 692
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    :goto_7
    invoke-static {v0, v1, v12}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    :goto_8
    move-object v2, v1

    .line 703
    check-cast v2, La/paw;

    .line 704
    .line 705
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    if-eqz v3, :cond_15

    .line 710
    .line 711
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    check-cast v2, La/oe50;

    .line 716
    .line 717
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 718
    .line 719
    .line 720
    goto :goto_8

    .line 721
    :cond_15
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 722
    .line 723
    :cond_16
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    move-object v9, v0

    .line 731
    check-cast v9, La/mb4;

    .line 732
    .line 733
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    const/16 v20, 0x0

    .line 737
    .line 738
    const/16 v21, 0x3ff7

    .line 739
    .line 740
    const/4 v10, 0x0

    .line 741
    const/4 v11, 0x0

    .line 742
    const/4 v12, 0x0

    .line 743
    const/4 v13, 0x0

    .line 744
    const/4 v14, 0x0

    .line 745
    const/4 v15, 0x0

    .line 746
    const/16 v16, 0x0

    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    const/16 v18, 0x0

    .line 751
    .line 752
    const/16 v19, 0x0

    .line 753
    .line 754
    invoke-static/range {v9 .. v21}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-eqz v0, :cond_16

    .line 763
    .line 764
    goto/16 :goto_9

    .line 765
    .line 766
    :cond_17
    instance-of v2, v10, La/yc4;

    .line 767
    .line 768
    const v3, 0x7f1301a0

    .line 769
    .line 770
    .line 771
    if-eqz v2, :cond_1a

    .line 772
    .line 773
    check-cast v10, La/yc4;

    .line 774
    .line 775
    iget-object v0, v10, La/yc4;->a:Ljava/lang/Integer;

    .line 776
    .line 777
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    iget-object v2, v10, La/yc4;->b:Ljava/lang/String;

    .line 782
    .line 783
    iget-object v4, v1, La/kc4;->H:La/f7u;

    .line 784
    .line 785
    iget-object v5, v4, La/f7u;->b:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v5, La/y3v;

    .line 788
    .line 789
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    invoke-virtual {v5, v6}, La/y3v;->s(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    iget-object v4, v4, La/f7u;->c:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v4, La/s64;

    .line 799
    .line 800
    invoke-virtual {v4, v0}, La/s64;->h(I)V

    .line 801
    .line 802
    .line 803
    new-array v4, v12, [Ljava/lang/Object;

    .line 804
    .line 805
    iget-object v5, v7, La/ctf0;->b:La/lsm0;

    .line 806
    .line 807
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    invoke-virtual {v5, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    new-instance v4, La/gb4;

    .line 816
    .line 817
    const/16 v5, 0x88

    .line 818
    .line 819
    if-ne v0, v5, :cond_18

    .line 820
    .line 821
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    check-cast v0, La/mb4;

    .line 826
    .line 827
    iget-object v0, v0, La/mb4;->m:La/cb4;

    .line 828
    .line 829
    iget-boolean v12, v0, La/cb4;->f:Z

    .line 830
    .line 831
    :cond_18
    invoke-direct {v4, v3, v2, v12}, La/gb4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v1, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 838
    .line 839
    :cond_19
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    move-object v9, v0

    .line 847
    check-cast v9, La/mb4;

    .line 848
    .line 849
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    const/16 v20, 0x0

    .line 853
    .line 854
    const/16 v21, 0x3ff7

    .line 855
    .line 856
    const/4 v10, 0x0

    .line 857
    const/4 v11, 0x0

    .line 858
    const/4 v12, 0x0

    .line 859
    const/4 v13, 0x0

    .line 860
    const/4 v14, 0x0

    .line 861
    const/4 v15, 0x0

    .line 862
    const/16 v16, 0x0

    .line 863
    .line 864
    const/16 v17, 0x0

    .line 865
    .line 866
    const/16 v18, 0x0

    .line 867
    .line 868
    const/16 v19, 0x0

    .line 869
    .line 870
    invoke-static/range {v9 .. v21}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    if-eqz v0, :cond_19

    .line 879
    .line 880
    invoke-virtual {v1}, La/kc4;->M()V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_9

    .line 884
    .line 885
    :cond_1a
    instance-of v2, v10, La/bd4;

    .line 886
    .line 887
    if-eqz v2, :cond_1c

    .line 888
    .line 889
    check-cast v10, La/bd4;

    .line 890
    .line 891
    iget-object v0, v10, La/bd4;->a:Ljava/lang/String;

    .line 892
    .line 893
    new-instance v2, La/gb4;

    .line 894
    .line 895
    new-array v4, v12, [Ljava/lang/Object;

    .line 896
    .line 897
    iget-object v5, v7, La/ctf0;->b:La/lsm0;

    .line 898
    .line 899
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    invoke-virtual {v5, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-direct {v2, v3, v0, v12}, La/gb4;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v1}, La/kc4;->M()V

    .line 914
    .line 915
    .line 916
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 917
    .line 918
    :cond_1b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    move-object v9, v0

    .line 926
    check-cast v9, La/mb4;

    .line 927
    .line 928
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    const/16 v20, 0x0

    .line 932
    .line 933
    const/16 v21, 0x3ff7

    .line 934
    .line 935
    const/4 v10, 0x0

    .line 936
    const/4 v11, 0x0

    .line 937
    const/4 v12, 0x0

    .line 938
    const/4 v13, 0x0

    .line 939
    const/4 v14, 0x0

    .line 940
    const/4 v15, 0x0

    .line 941
    const/16 v16, 0x0

    .line 942
    .line 943
    const/16 v17, 0x0

    .line 944
    .line 945
    const/16 v18, 0x0

    .line 946
    .line 947
    const/16 v19, 0x0

    .line 948
    .line 949
    invoke-static/range {v9 .. v21}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    if-eqz v0, :cond_1b

    .line 958
    .line 959
    goto/16 :goto_9

    .line 960
    .line 961
    :cond_1c
    instance-of v2, v10, La/ed4;

    .line 962
    .line 963
    if-eqz v2, :cond_1e

    .line 964
    .line 965
    invoke-virtual {v1}, La/kc4;->R()V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1}, La/kc4;->M()V

    .line 969
    .line 970
    .line 971
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 972
    .line 973
    :cond_1d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    move-object v9, v0

    .line 981
    check-cast v9, La/mb4;

    .line 982
    .line 983
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    const/16 v20, 0x0

    .line 987
    .line 988
    const/16 v21, 0x3ff7

    .line 989
    .line 990
    const/4 v10, 0x0

    .line 991
    const/4 v11, 0x0

    .line 992
    const/4 v12, 0x0

    .line 993
    const/4 v13, 0x0

    .line 994
    const/4 v14, 0x0

    .line 995
    const/4 v15, 0x0

    .line 996
    const/16 v16, 0x0

    .line 997
    .line 998
    const/16 v17, 0x0

    .line 999
    .line 1000
    const/16 v18, 0x0

    .line 1001
    .line 1002
    const/16 v19, 0x0

    .line 1003
    .line 1004
    invoke-static/range {v9 .. v21}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-eqz v0, :cond_1d

    .line 1013
    .line 1014
    goto/16 :goto_9

    .line 1015
    .line 1016
    :cond_1e
    instance-of v2, v10, La/wc4;

    .line 1017
    .line 1018
    if-eqz v2, :cond_1f

    .line 1019
    .line 1020
    check-cast v10, La/wc4;

    .line 1021
    .line 1022
    iget-object v2, v10, La/wc4;->a:Ljava/lang/String;

    .line 1023
    .line 1024
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v3

    .line 1028
    check-cast v3, La/mb4;

    .line 1029
    .line 1030
    iget-object v3, v3, La/mb4;->l:Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 1031
    .line 1032
    if-eqz v3, :cond_24

    .line 1033
    .line 1034
    iget-object v3, v3, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;->b:Lorg/xplatform/login/core/presentation/model/AuthDataModel;

    .line 1035
    .line 1036
    if-eqz v3, :cond_24

    .line 1037
    .line 1038
    move-object v4, v0

    .line 1039
    move-object v0, v1

    .line 1040
    iget-object v1, v0, La/kc4;->p:La/im4;

    .line 1041
    .line 1042
    new-instance v5, La/ol4;

    .line 1043
    .line 1044
    invoke-static {v3}, La/vu4;->a(Lorg/xplatform/login/core/presentation/model/AuthDataModel;)La/uu4;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    invoke-virtual {v4}, La/cmt;->g()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    invoke-direct {v5, v3, v2, v4}, La/ol4;-><init>(La/uu4;Ljava/lang/String;Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    const/4 v4, 0x0

    .line 1056
    move-object v2, v5

    .line 1057
    const/4 v5, 0x6

    .line 1058
    const/4 v3, 0x0

    .line 1059
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1060
    .line 1061
    .line 1062
    goto/16 :goto_9

    .line 1063
    .line 1064
    :cond_1f
    move-object v4, v0

    .line 1065
    move-object v0, v1

    .line 1066
    sget-object v1, La/vc4;->a:La/vc4;

    .line 1067
    .line 1068
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v1

    .line 1072
    if-eqz v1, :cond_21

    .line 1073
    .line 1074
    invoke-virtual {v0}, La/kc4;->R()V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v0}, La/kc4;->M()V

    .line 1078
    .line 1079
    .line 1080
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 1081
    .line 1082
    :cond_20
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1087
    .line 1088
    .line 1089
    move-object v9, v0

    .line 1090
    check-cast v9, La/mb4;

    .line 1091
    .line 1092
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    const/16 v20, 0x0

    .line 1096
    .line 1097
    const/16 v21, 0x3ff7

    .line 1098
    .line 1099
    const/4 v10, 0x0

    .line 1100
    const/4 v11, 0x0

    .line 1101
    const/4 v12, 0x0

    .line 1102
    const/4 v13, 0x0

    .line 1103
    const/4 v14, 0x0

    .line 1104
    const/4 v15, 0x0

    .line 1105
    const/16 v16, 0x0

    .line 1106
    .line 1107
    const/16 v17, 0x0

    .line 1108
    .line 1109
    const/16 v18, 0x0

    .line 1110
    .line 1111
    const/16 v19, 0x0

    .line 1112
    .line 1113
    invoke-static/range {v9 .. v21}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    if-eqz v0, :cond_20

    .line 1122
    .line 1123
    goto :goto_9

    .line 1124
    :cond_21
    sget-object v1, La/uc4;->a:La/uc4;

    .line 1125
    .line 1126
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-eqz v1, :cond_23

    .line 1131
    .line 1132
    invoke-virtual {v0}, La/kc4;->M()V

    .line 1133
    .line 1134
    .line 1135
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 1136
    .line 1137
    :cond_22
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    move-object v9, v0

    .line 1145
    check-cast v9, La/mb4;

    .line 1146
    .line 1147
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    const/16 v20, 0x0

    .line 1151
    .line 1152
    const/16 v21, 0x3ff7

    .line 1153
    .line 1154
    const/4 v10, 0x0

    .line 1155
    const/4 v11, 0x0

    .line 1156
    const/4 v12, 0x0

    .line 1157
    const/4 v13, 0x0

    .line 1158
    const/4 v14, 0x0

    .line 1159
    const/4 v15, 0x0

    .line 1160
    const/16 v16, 0x0

    .line 1161
    .line 1162
    const/16 v17, 0x0

    .line 1163
    .line 1164
    const/16 v18, 0x0

    .line 1165
    .line 1166
    const/16 v19, 0x0

    .line 1167
    .line 1168
    invoke-static/range {v9 .. v21}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v2

    .line 1172
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v0

    .line 1176
    if-eqz v0, :cond_22

    .line 1177
    .line 1178
    goto :goto_9

    .line 1179
    :cond_23
    instance-of v1, v10, La/dd4;

    .line 1180
    .line 1181
    if-eqz v1, :cond_25

    .line 1182
    .line 1183
    iget-object v1, v0, La/kc4;->p:La/im4;

    .line 1184
    .line 1185
    new-instance v2, La/vl4;

    .line 1186
    .line 1187
    check-cast v10, La/dd4;

    .line 1188
    .line 1189
    iget-object v3, v10, La/dd4;->a:La/uu4;

    .line 1190
    .line 1191
    invoke-virtual {v4}, La/cmt;->g()Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v4

    .line 1195
    invoke-direct {v2, v3, v4}, La/vl4;-><init>(La/uu4;Ljava/lang/String;)V

    .line 1196
    .line 1197
    .line 1198
    const/4 v4, 0x0

    .line 1199
    const/4 v5, 0x6

    .line 1200
    const/4 v3, 0x0

    .line 1201
    invoke-static/range {v0 .. v5}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1202
    .line 1203
    .line 1204
    :cond_24
    :goto_9
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    goto :goto_a

    .line 1207
    :cond_25
    invoke-static {}, La/t9f;->b()V

    .line 1208
    .line 1209
    .line 1210
    :goto_a
    return-object v6

    .line 1211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
