.class public final La/p270;
.super La/rs3;
.source "SourceFile"


# instance fields
.field public final synthetic f:B

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kxq;Landroidx/fragment/app/e;La/i1w0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/p270;->f:B

    .line 3
    .line 4
    invoke-virtual {p2}, Landroidx/fragment/app/e;->S()La/m1r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v1, 0x7f0a0adb

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, v1, p2, v0}, La/rs3;-><init>(La/kxq;ILandroidx/fragment/app/e;La/m1r;)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, La/p270;->g:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(La/sao0;La/kxq;Landroidx/fragment/app/e;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/p270;->f:B

    iput-object p1, p0, La/p270;->g:Ljava/lang/Object;

    .line 26
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x8

    const v0, 0x7f0a0388

    invoke-direct {p0, p2, v0, p3, p1}, La/rs3;-><init>(La/kxq;ILandroidx/fragment/app/e;I)V

    return-void
.end method


# virtual methods
.method public a(La/t7d;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/p270;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/rs3;->a(La/t7d;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, La/p270;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/sao0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v1, p1, La/dwq;

    .line 18
    .line 19
    const-string v2, "rootRouterHolder"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    check-cast v1, La/dwq;

    .line 27
    .line 28
    iget-object v1, v1, La/dwq;->a:La/m7h0;

    .line 29
    .line 30
    instance-of v5, v1, La/tn;

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    iget-object p0, v0, La/sao0;->M1:La/oeg0;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, La/oeg0;->b()La/i1w0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    instance-of v0, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    new-instance v0, La/e1w0;

    .line 58
    .line 59
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 60
    .line 61
    invoke-direct {v0, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, La/c8d;

    .line 65
    .line 66
    sget-object v2, La/y7d;->a:La/v7d;

    .line 67
    .line 68
    invoke-direct {v1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance v0, La/w0w0;

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/c8d;

    .line 81
    .line 82
    sget-object v2, La/y7d;->a:La/v7d;

    .line 83
    .line 84
    invoke-direct {v1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-static {p0, p1, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_1
    move-object v0, p1

    .line 95
    check-cast v0, La/paw;

    .line 96
    .line 97
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_11

    .line 102
    .line 103
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/oe50;

    .line 108
    .line 109
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v3

    .line 117
    :cond_2
    instance-of v1, p1, La/xkf0;

    .line 118
    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    move-object v5, p1

    .line 122
    check-cast v5, La/xkf0;

    .line 123
    .line 124
    iget-object v5, v5, La/xkf0;->a:La/m7h0;

    .line 125
    .line 126
    instance-of v6, v5, La/tn;

    .line 127
    .line 128
    if-eqz v6, :cond_4

    .line 129
    .line 130
    iget-object p0, v0, La/sao0;->M1:La/oeg0;

    .line 131
    .line 132
    if-eqz p0, :cond_3

    .line 133
    .line 134
    invoke-virtual {p0}, La/oeg0;->b()La/i1w0;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 142
    .line 143
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v0, La/d1w0;

    .line 150
    .line 151
    invoke-direct {v0, v5}, La/d1w0;-><init>(La/m7h0;)V

    .line 152
    .line 153
    .line 154
    new-instance v1, La/c8d;

    .line 155
    .line 156
    sget-object v2, La/y7d;->a:La/v7d;

    .line 157
    .line 158
    invoke-direct {v1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v1, p0, p1, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    :goto_2
    move-object v0, p1

    .line 166
    check-cast v0, La/paw;

    .line 167
    .line 168
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_11

    .line 173
    .line 174
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/oe50;

    .line 179
    .line 180
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v3

    .line 188
    :cond_4
    if-eqz v1, :cond_e

    .line 189
    .line 190
    check-cast p1, La/xkf0;

    .line 191
    .line 192
    iget-object v1, p1, La/xkf0;->a:La/m7h0;

    .line 193
    .line 194
    iget-object v2, v0, La/sao0;->N1:La/gle0;

    .line 195
    .line 196
    if-eqz v2, :cond_d

    .line 197
    .line 198
    invoke-virtual {v0}, La/sao0;->H0()La/cb50;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    instance-of v3, v2, La/bb50;

    .line 209
    .line 210
    if-eqz v3, :cond_5

    .line 211
    .line 212
    const-class v2, Lorg/xplatform/client1/providers/PopularScreen;

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_5
    instance-of v3, v2, La/ya50;

    .line 216
    .line 217
    if-eqz v3, :cond_6

    .line 218
    .line 219
    const-class v2, Lorg/xplatform/favorites/impl/di/FavoritesScreen;

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_6
    instance-of v3, v2, La/xa50;

    .line 223
    .line 224
    if-eqz v3, :cond_7

    .line 225
    .line 226
    const-class v2, Lorg/xplatform/coupon/impl/coupon/presentation/CouponScreen;

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_7
    instance-of v3, v2, La/za50;

    .line 230
    .line 231
    if-eqz v3, :cond_8

    .line 232
    .line 233
    const-class v2, Lorg/xplatform/bet_history/history/presentation/BetHistoryScreen;

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    instance-of v2, v2, La/ab50;

    .line 237
    .line 238
    if-eqz v2, :cond_c

    .line 239
    .line 240
    const-class v2, Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;

    .line 241
    .line 242
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_9

    .line 251
    .line 252
    invoke-super {p0, p1}, La/rs3;->a(La/t7d;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_6

    .line 256
    .line 257
    :cond_9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v2}, Landroidx/fragment/app/e;->P()I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-lez v2, :cond_a

    .line 266
    .line 267
    invoke-super {p0, p1}, La/rs3;->a(La/t7d;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_a
    invoke-virtual {v0}, La/sao0;->G0()La/ejc;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 276
    .line 277
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 278
    .line 279
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    instance-of v0, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 283
    .line 284
    if-eqz v0, :cond_b

    .line 285
    .line 286
    new-instance v0, La/e1w0;

    .line 287
    .line 288
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 289
    .line 290
    invoke-direct {v0, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 291
    .line 292
    .line 293
    new-instance v1, La/c8d;

    .line 294
    .line 295
    sget-object v2, La/y7d;->a:La/v7d;

    .line 296
    .line 297
    invoke-direct {v1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_b
    new-instance v0, La/w0w0;

    .line 305
    .line 306
    invoke-direct {v0, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 307
    .line 308
    .line 309
    new-instance v1, La/c8d;

    .line 310
    .line 311
    sget-object v2, La/y7d;->a:La/v7d;

    .line 312
    .line 313
    invoke-direct {v1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :goto_4
    invoke-static {p0, p1, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    :goto_5
    move-object v0, p1

    .line 324
    check-cast v0, La/paw;

    .line 325
    .line 326
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_11

    .line 331
    .line 332
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    check-cast v0, La/oe50;

    .line 337
    .line 338
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 339
    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 343
    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_d
    const-string p0, "rootScreenChecker"

    .line 347
    .line 348
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v3

    .line 352
    :cond_e
    instance-of v1, p1, La/nb5;

    .line 353
    .line 354
    if-eqz v1, :cond_10

    .line 355
    .line 356
    sget-object v1, La/sao0;->V1:La/m6m0;

    .line 357
    .line 358
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    const v1, 0x7f0a0388

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_f

    .line 370
    .line 371
    invoke-static {v0}, La/sj3;->T(Landroidx/fragment/app/Fragment;)V

    .line 372
    .line 373
    .line 374
    :cond_f
    invoke-super {p0, p1}, La/rs3;->a(La/t7d;)V

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_10
    invoke-super {p0, p1}, La/rs3;->a(La/t7d;)V

    .line 379
    .line 380
    .line 381
    :cond_11
    :goto_6
    return-void

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/p270;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, La/rs3;->c()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/p270;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/i1w0;

    .line 26
    .line 27
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, La/c8d;

    .line 32
    .line 33
    sget-object v2, La/y7d;->a:La/v7d;

    .line 34
    .line 35
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    move-object v1, v0

    .line 46
    check-cast v1, La/paw;

    .line 47
    .line 48
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, La/oe50;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-super {p0}, La/rs3;->c()V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(La/m7h0;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/p270;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/rs3;->d(La/m7h0;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v0, p1, Lorg/xplatform/sportgame/classic/api/navigation/SportGameClassicScreenFactory$SportGameClassicScreen;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p1, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenFactory$SportGameAdvancedScreen;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    instance-of v0, p1, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenFactory$SportGameLiteScreen;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    instance-of v0, p1, Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenFactory$SportGameDashboardScreen;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    instance-of v0, p1, Lorg/xplatform/cyber/game/counterstrike/api/navigation/CyberGameCs2ScreenFactory$CyberGameCs2Screen;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    instance-of v0, p1, Lorg/xplatform/cyber/game/lol/api/navigation/CyberGameLolScreenFactory$CyberGameLolScreen;

    .line 39
    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    instance-of v0, p1, Lorg/xplatform/cyber/game/valorant/api/navigation/game/ValorantGameScreenFactory$ValorantGameScreen;

    .line 44
    .line 45
    if-eqz v0, :cond_6

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_6
    instance-of v0, p1, Lorg/xplatform/cyber/game/mlbb/api/navigation/MlbbGameScreenFactory$MlbbGameScreen;

    .line 49
    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_7
    instance-of v0, p1, Lorg/xplatform/cyber/game/universal/api/navigation/CyberUniversalScreenFactory$CyberUniversalScreen;

    .line 54
    .line 55
    if-eqz v0, :cond_8

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_8
    instance-of v0, p1, Lorg/xplatform/cyber/game/dota/api/navigation/GameDotaScreenFactory$GameDotaScreen;

    .line 59
    .line 60
    if-eqz v0, :cond_9

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_9
    instance-of v0, p1, Lorg/xplatform/ufc/api/navigation/UfcScreensFactory$UfcGameScreen;

    .line 64
    .line 65
    if-eqz v0, :cond_b

    .line 66
    .line 67
    :goto_0
    iget-object p0, p0, La/p270;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/sao0;

    .line 70
    .line 71
    invoke-virtual {p0}, La/sao0;->G0()La/ejc;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 76
    .line 77
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    instance-of v1, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 83
    .line 84
    if-eqz v1, :cond_a

    .line 85
    .line 86
    new-instance v1, La/e1w0;

    .line 87
    .line 88
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 89
    .line 90
    invoke-direct {v1, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, La/c8d;

    .line 94
    .line 95
    sget-object v2, La/y7d;->a:La/v7d;

    .line 96
    .line 97
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_a
    new-instance v1, La/w0w0;

    .line 105
    .line 106
    invoke-direct {v1, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, La/c8d;

    .line 110
    .line 111
    sget-object v2, La/y7d;->a:La/v7d;

    .line 112
    .line 113
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :goto_1
    const/4 p1, 0x0

    .line 120
    invoke-static {p0, v0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_2
    move-object v0, p1

    .line 125
    check-cast v0, La/paw;

    .line 126
    .line 127
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_c

    .line 132
    .line 133
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, La/oe50;

    .line 138
    .line 139
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_b
    invoke-super {p0, p1}, La/rs3;->d(La/m7h0;)V

    .line 144
    .line 145
    .line 146
    :cond_c
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public h(La/xkf0;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/p270;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/rs3;->h(La/xkf0;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p1, La/xkf0;->a:La/m7h0;

    .line 11
    .line 12
    instance-of v1, v0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 13
    .line 14
    if-eqz v1, :cond_b

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v4, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    move-object v5, v3

    .line 71
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 72
    .line 73
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-nez v5, :cond_2

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    :cond_4
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iget-object v3, p0, La/rs3;->d:La/m1r;

    .line 105
    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    move-object p1, v0

    .line 109
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 110
    .line 111
    invoke-interface {p1, v3}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    goto :goto_2

    .line 116
    :cond_5
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v4, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-nez p1, :cond_6

    .line 125
    .line 126
    move-object p1, v0

    .line 127
    check-cast p1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 128
    .line 129
    invoke-interface {p1, v3}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_6
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v3, La/zb5;

    .line 137
    .line 138
    invoke-direct {v3, v4}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 139
    .line 140
    .line 141
    iget-object v5, v4, Landroidx/fragment/app/e;->c:La/pmi;

    .line 142
    .line 143
    invoke-virtual {v5}, La/pmi;->p()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 155
    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    move-object v6, v0

    .line 159
    check-cast v6, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 160
    .line 161
    invoke-virtual {p0, v6, v3, v5, p1}, La/p270;->i(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;La/zb5;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V

    .line 162
    .line 163
    .line 164
    :cond_7
    if-eqz v2, :cond_8

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_8

    .line 175
    .line 176
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 181
    .line 182
    invoke-virtual {v3, v5}, La/zb5;->j(Landroidx/fragment/app/Fragment;)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    iget v2, p1, Landroidx/fragment/app/Fragment;->z:I

    .line 187
    .line 188
    invoke-virtual {v4, v2}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-nez v2, :cond_9

    .line 193
    .line 194
    iget p0, p0, La/rs3;->b:I

    .line 195
    .line 196
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/4 v4, 0x1

    .line 201
    invoke-virtual {v3, p0, p1, v2, v4}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_9
    new-instance p0, La/h6r;

    .line 206
    .line 207
    const/4 v2, 0x7

    .line 208
    invoke-direct {p0, v2, p1}, La/h6r;-><init>(ILandroidx/fragment/app/Fragment;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, p0}, La/zb5;->b(La/h6r;)V

    .line 212
    .line 213
    .line 214
    const/4 v4, 0x0

    .line 215
    :goto_4
    invoke-virtual {v3}, La/zb5;->f()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    const/4 p1, 0x2

    .line 223
    if-lt p0, p1, :cond_a

    .line 224
    .line 225
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_a
    if-eqz v4, :cond_c

    .line 241
    .line 242
    invoke-interface {v0}, La/m7h0;->b()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_b
    invoke-super {p0, p1}, La/rs3;->h(La/xkf0;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    :goto_5
    return-void

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;La/zb5;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    iget-byte p3, p0, La/p270;->f:B

    .line 2
    .line 3
    const v0, 0x7f010033

    .line 4
    .line 5
    .line 6
    const v1, 0x7f010030

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch p3, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    instance-of p3, p1, Lorg/xplatform/cyber/game/counterstrike/api/navigation/CyberGameCs2ScreenFactory$CyberGameCs2Screen;

    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of p3, p1, Lorg/xplatform/cyber/game/lol/api/navigation/CyberGameLolScreenFactory$CyberGameLolScreen;

    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    instance-of p3, p1, Lorg/xplatform/cyber/game/valorant/api/navigation/game/ValorantGameScreenFactory$ValorantGameScreen;

    .line 30
    .line 31
    if-eqz p3, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    instance-of p3, p1, Lorg/xplatform/cyber/game/mlbb/api/navigation/MlbbGameScreenFactory$MlbbGameScreen;

    .line 35
    .line 36
    if-eqz p3, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    instance-of p3, p1, Lorg/xplatform/cyber/game/universal/api/navigation/CyberUniversalScreenFactory$CyberUniversalScreen;

    .line 40
    .line 41
    if-eqz p3, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    instance-of p3, p1, Lorg/xplatform/cyber/game/dota/api/navigation/GameDotaScreenFactory$GameDotaScreen;

    .line 45
    .line 46
    if-eqz p3, :cond_5

    .line 47
    .line 48
    :goto_0
    const p3, 0x7f01002e

    .line 49
    .line 50
    .line 51
    const p4, 0x7f010031

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p3, p4, v2, v2}, La/zb5;->p(IIII)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    invoke-virtual {p2, v1, v0, v2, v2}, La/zb5;->p(IIII)V

    .line 59
    .line 60
    .line 61
    :goto_1
    iget-object p0, p0, La/p270;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/sao0;

    .line 64
    .line 65
    iget-object p0, p0, La/sao0;->L1:La/kt2;

    .line 66
    .line 67
    if-eqz p0, :cond_6

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p0, p1}, La/kt2;->f(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    const-string p0, "analyticsTracker"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    throw p0

    .line 88
    :pswitch_0
    invoke-virtual {p2, v1, v0, v2, v2}, La/zb5;->p(IIII)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
