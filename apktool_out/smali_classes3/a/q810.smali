.class public final La/q810;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/r810;


# direct methods
.method public synthetic constructor <init>(La/r810;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q810;->i:B

    iput-object p1, p0, La/q810;->k:La/r810;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q810;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q810;->k:La/r810;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q810;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/q810;-><init>(La/r810;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/q810;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/q810;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/q810;-><init>(La/r810;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/q810;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/q810;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/b910;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/q810;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q810;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q810;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/x810;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/q810;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/q810;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/q810;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q810;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/q810;->k:La/r810;

    .line 8
    .line 9
    iget-object v0, v0, La/q810;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, La/b910;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v1, v0, La/y810;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, La/y810;

    .line 29
    .line 30
    iget-object v0, v0, La/y810;->a:La/gx90;

    .line 31
    .line 32
    sget-object v1, La/r810;->P1:[La/iiy;

    .line 33
    .line 34
    invoke-virtual {v4}, La/r810;->H0()La/e1r;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 39
    .line 40
    iget-object v0, v0, La/gx90;->e:Ljava/util/List;

    .line 41
    .line 42
    new-instance v2, La/t010;

    .line 43
    .line 44
    const/16 v3, 0x16

    .line 45
    .line 46
    invoke-direct {v2, v3}, La/t010;-><init>(B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    new-instance v3, La/t010;

    .line 57
    .line 58
    invoke-direct {v3, v2}, La/t010;-><init>(La/t010;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1, v0, v3}, La/sdq0;->c(Ljava/util/List;La/t010;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    instance-of v0, v0, La/a910;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    sget-object v0, La/r810;->P1:[La/iiy;

    .line 70
    .line 71
    invoke-virtual {v4, v3}, La/r810;->G0(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :goto_0
    sget-object v0, La/r810;->P1:[La/iiy;

    .line 76
    .line 77
    invoke-virtual {v4, v2}, La/r810;->G0(Z)V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_0
    check-cast v0, La/x810;

    .line 84
    .line 85
    sget-object v1, La/wne;->a:La/wne;

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz v0, :cond_22

    .line 92
    .line 93
    instance-of v5, v0, La/w810;

    .line 94
    .line 95
    if-eqz v5, :cond_18

    .line 96
    .line 97
    sget-object v0, La/r810;->P1:[La/iiy;

    .line 98
    .line 99
    invoke-virtual {v4}, La/r810;->H0()La/e1r;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v0, v0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 104
    .line 105
    iget-object v4, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a:[La/sdq0;

    .line 106
    .line 107
    iget-object v5, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->f:La/n910;

    .line 108
    .line 109
    sget-object v6, La/n910;->b:La/n910;

    .line 110
    .line 111
    if-ne v5, v6, :cond_4

    .line 112
    .line 113
    goto/16 :goto_f

    .line 114
    .line 115
    :cond_4
    iget-object v5, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->d:Landroid/animation/AnimatorSet;

    .line 116
    .line 117
    if-eqz v5, :cond_5

    .line 118
    .line 119
    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_5

    .line 124
    .line 125
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    .line 126
    .line 127
    .line 128
    :cond_5
    iput-object v6, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->f:La/n910;

    .line 129
    .line 130
    new-instance v5, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    array-length v6, v4

    .line 136
    move v7, v2

    .line 137
    :goto_2
    if-ge v7, v6, :cond_7

    .line 138
    .line 139
    aget-object v8, v4, v7

    .line 140
    .line 141
    iget-object v9, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 142
    .line 143
    if-eq v8, v9, :cond_6

    .line 144
    .line 145
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    new-instance v6, Ljava/util/ArrayList;

    .line 152
    .line 153
    const/16 v7, 0xa

    .line 154
    .line 155
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-eqz v7, :cond_8

    .line 171
    .line 172
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    check-cast v7, La/sdq0;

    .line 177
    .line 178
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    check-cast v7, Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    new-instance v5, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    :cond_9
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-eqz v7, :cond_a

    .line 201
    .line 202
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    move-object v8, v7

    .line 207
    check-cast v8, Landroid/view/View;

    .line 208
    .line 209
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    const/4 v10, 0x4

    .line 214
    if-ne v9, v10, :cond_9

    .line 215
    .line 216
    iget-object v9, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 217
    .line 218
    if-eq v8, v9, :cond_9

    .line 219
    .line 220
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-eqz v6, :cond_b

    .line 233
    .line 234
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    check-cast v6, Landroid/view/View;

    .line 239
    .line 240
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_b
    iget-object v5, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 245
    .line 246
    const/16 v6, 0x8

    .line 247
    .line 248
    if-eqz v5, :cond_e

    .line 249
    .line 250
    invoke-interface {v5}, La/sdq0;->g()Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-nez v5, :cond_e

    .line 255
    .line 256
    iget-object v3, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 257
    .line 258
    if-eqz v3, :cond_c

    .line 259
    .line 260
    invoke-interface {v3}, La/sdq0;->reset()V

    .line 261
    .line 262
    .line 263
    :cond_c
    move v3, v2

    .line 264
    :goto_6
    if-ge v3, v6, :cond_13

    .line 265
    .line 266
    iget-object v5, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 267
    .line 268
    aget-object v7, v4, v3

    .line 269
    .line 270
    if-ne v5, v7, :cond_d

    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    check-cast v5, Landroid/view/View;

    .line 276
    .line 277
    invoke-virtual {v0, v5, v3}, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a(Landroid/view/View;I)V

    .line 278
    .line 279
    .line 280
    iput-object v1, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 281
    .line 282
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_e
    iget v5, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->c:I

    .line 286
    .line 287
    add-int/2addr v5, v3

    .line 288
    iput v5, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->c:I

    .line 289
    .line 290
    iget-object v3, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 291
    .line 292
    if-ne v5, v6, :cond_12

    .line 293
    .line 294
    if-eqz v3, :cond_f

    .line 295
    .line 296
    invoke-interface {v3}, La/sdq0;->reset()V

    .line 297
    .line 298
    .line 299
    :cond_f
    iput-object v1, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 300
    .line 301
    iput v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->c:I

    .line 302
    .line 303
    array-length v3, v4

    .line 304
    move v5, v2

    .line 305
    :goto_7
    if-ge v5, v3, :cond_10

    .line 306
    .line 307
    aget-object v7, v4, v5

    .line 308
    .line 309
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    check-cast v7, Landroid/view/View;

    .line 313
    .line 314
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 315
    .line 316
    .line 317
    add-int/lit8 v5, v5, 0x1

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_10
    move v3, v2

    .line 321
    :goto_8
    if-ge v3, v6, :cond_13

    .line 322
    .line 323
    aget-object v5, v4, v3

    .line 324
    .line 325
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    check-cast v5, Landroid/view/View;

    .line 329
    .line 330
    iget-object v7, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 331
    .line 332
    if-eq v5, v7, :cond_11

    .line 333
    .line 334
    invoke-virtual {v0, v5, v3}, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a(Landroid/view/View;I)V

    .line 335
    .line 336
    .line 337
    :cond_11
    add-int/lit8 v3, v3, 0x1

    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_12
    if-eqz v3, :cond_13

    .line 341
    .line 342
    invoke-interface {v3}, La/sdq0;->g()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-eqz v3, :cond_13

    .line 347
    .line 348
    iget-object v3, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 349
    .line 350
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    check-cast v3, Landroid/view/View;

    .line 354
    .line 355
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 356
    .line 357
    .line 358
    :cond_13
    iget-object v3, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 359
    .line 360
    if-eqz v3, :cond_14

    .line 361
    .line 362
    invoke-interface {v3}, La/sdq0;->reset()V

    .line 363
    .line 364
    .line 365
    :cond_14
    iput-object v1, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 366
    .line 367
    new-instance v1, Ljava/util/ArrayList;

    .line 368
    .line 369
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 370
    .line 371
    .line 372
    array-length v3, v4

    .line 373
    :goto_9
    if-ge v2, v3, :cond_16

    .line 374
    .line 375
    aget-object v5, v4, v2

    .line 376
    .line 377
    iget-object v6, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 378
    .line 379
    if-eq v5, v6, :cond_15

    .line 380
    .line 381
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    :cond_15
    add-int/lit8 v2, v2, 0x1

    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    :cond_17
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_20

    .line 396
    .line 397
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    check-cast v1, La/sdq0;

    .line 402
    .line 403
    if-eqz v1, :cond_17

    .line 404
    .line 405
    invoke-interface {v1}, La/sdq0;->b()V

    .line 406
    .line 407
    .line 408
    goto :goto_a

    .line 409
    :cond_18
    instance-of v5, v0, La/u810;

    .line 410
    .line 411
    if-eqz v5, :cond_19

    .line 412
    .line 413
    check-cast v0, La/u810;

    .line 414
    .line 415
    iget-boolean v0, v0, La/u810;->a:Z

    .line 416
    .line 417
    sget-object v1, La/r810;->P1:[La/iiy;

    .line 418
    .line 419
    invoke-virtual {v4, v0}, La/r810;->G0(Z)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_f

    .line 423
    .line 424
    :cond_19
    instance-of v0, v0, La/v810;

    .line 425
    .line 426
    if-eqz v0, :cond_22

    .line 427
    .line 428
    sget-object v0, La/r810;->P1:[La/iiy;

    .line 429
    .line 430
    invoke-virtual {v4}, La/r810;->H0()La/e1r;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v0, v0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 435
    .line 436
    iget-object v0, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 437
    .line 438
    if-eqz v0, :cond_1a

    .line 439
    .line 440
    invoke-interface {v0}, La/sdq0;->g()Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    goto :goto_b

    .line 445
    :cond_1a
    move v0, v3

    .line 446
    :goto_b
    if-eqz v0, :cond_1d

    .line 447
    .line 448
    invoke-virtual {v4}, La/r810;->H0()La/e1r;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    iget-object v0, v0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 453
    .line 454
    iget-object v0, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a:[La/sdq0;

    .line 455
    .line 456
    array-length v5, v0

    .line 457
    move v6, v2

    .line 458
    :goto_c
    if-ge v6, v5, :cond_1c

    .line 459
    .line 460
    aget-object v7, v0, v6

    .line 461
    .line 462
    if-eqz v7, :cond_1b

    .line 463
    .line 464
    invoke-interface {v7}, La/sdq0;->g()Z

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    if-ne v7, v3, :cond_1b

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_1b
    add-int/lit8 v6, v6, 0x1

    .line 472
    .line 473
    goto :goto_c

    .line 474
    :cond_1c
    invoke-virtual {v4}, La/r810;->I0()La/e910;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iget-object v0, v0, La/e910;->h:La/i1w0;

    .line 479
    .line 480
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    new-instance v3, La/c8d;

    .line 485
    .line 486
    sget-object v4, La/y7d;->a:La/v7d;

    .line 487
    .line 488
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 489
    .line 490
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    :goto_d
    move-object v2, v1

    .line 498
    check-cast v2, La/paw;

    .line 499
    .line 500
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    if-eqz v3, :cond_20

    .line 505
    .line 506
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    check-cast v2, La/oe50;

    .line 511
    .line 512
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 513
    .line 514
    .line 515
    goto :goto_d

    .line 516
    :cond_1d
    :goto_e
    invoke-virtual {v4}, La/r810;->H0()La/e1r;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iget-object v0, v0, La/e1r;->b:Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 521
    .line 522
    iget-object v0, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 523
    .line 524
    instance-of v0, v0, La/rdq0;

    .line 525
    .line 526
    iget-object v2, v4, La/r810;->M1:La/ii;

    .line 527
    .line 528
    const-string v3, "actionDialogManager"

    .line 529
    .line 530
    const v5, 0x7f130e5d

    .line 531
    .line 532
    .line 533
    const v6, 0x7f13092c

    .line 534
    .line 535
    .line 536
    if-eqz v0, :cond_1f

    .line 537
    .line 538
    if-eqz v2, :cond_1e

    .line 539
    .line 540
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 541
    .line 542
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    const v0, 0x7f1311bc

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v10

    .line 557
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    sget-object v16, La/n12;->a:La/n12;

    .line 561
    .line 562
    const/16 v17, 0x0

    .line 563
    .line 564
    const/16 v18, 0x5f8

    .line 565
    .line 566
    const/4 v11, 0x0

    .line 567
    const/4 v12, 0x0

    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 582
    .line 583
    .line 584
    goto :goto_f

    .line 585
    :cond_1e
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw v1

    .line 589
    :cond_1f
    if-eqz v2, :cond_21

    .line 590
    .line 591
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 592
    .line 593
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v9

    .line 597
    const v0, 0x7f1311bb

    .line 598
    .line 599
    .line 600
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v10

    .line 604
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v11

    .line 608
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    sget-object v17, La/n12;->a:La/n12;

    .line 612
    .line 613
    const/16 v18, 0x0

    .line 614
    .line 615
    const/16 v19, 0x5f8

    .line 616
    .line 617
    const/4 v12, 0x0

    .line 618
    const/4 v13, 0x0

    .line 619
    const/4 v14, 0x0

    .line 620
    const/4 v15, 0x0

    .line 621
    const/16 v16, 0x0

    .line 622
    .line 623
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v8, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 634
    .line 635
    .line 636
    :cond_20
    :goto_f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    goto :goto_10

    .line 639
    :cond_21
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    throw v1

    .line 643
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 644
    .line 645
    .line 646
    :goto_10
    return-object v1

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
