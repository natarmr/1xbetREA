.class public final synthetic La/h260;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v360;


# direct methods
.method public synthetic constructor <init>(La/v360;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h260;->a:B

    iput-object p1, p0, La/h260;->b:La/v360;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h260;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, La/h260;->b:La/v360;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/k0w0;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/v360;->m0:La/peg0;

    .line 20
    .line 21
    new-instance v2, La/hr1;

    .line 22
    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    invoke-direct {v2, v3, v4, v5}, La/hr1;-><init>(JI)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    move-object/from16 v1, p1

    .line 40
    .line 41
    check-cast v1, La/k0w0;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v4, v0, La/v360;->l0:La/vjp;

    .line 47
    .line 48
    sget-object v5, La/j700;->b:La/j700;

    .line 49
    .line 50
    new-instance v6, La/d8h0;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-direct {v6, v0, v3}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 54
    .line 55
    .line 56
    sget-object v7, La/xun;->a:La/xun;

    .line 57
    .line 58
    const-string v10, ""

    .line 59
    .line 60
    const-wide/16 v8, -0x1

    .line 61
    .line 62
    invoke-virtual/range {v4 .. v10}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_1
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iget-object v3, v0, La/v360;->W:La/m1e;

    .line 81
    .line 82
    invoke-interface {v3}, La/m1e;->c()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_0

    .line 87
    .line 88
    new-instance v3, La/x160;

    .line 89
    .line 90
    iget-object v4, v0, La/v360;->u:La/ctf0;

    .line 91
    .line 92
    new-array v5, v2, [Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 95
    .line 96
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v4, v1, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v3, v1}, La/x160;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 112
    .line 113
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 114
    .line 115
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 123
    .line 124
    move-object v4, v2

    .line 125
    check-cast v4, La/c260;

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, 0x3fdf7

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, 0x1

    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    invoke-static/range {v4 .. v15}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_1

    .line 152
    .line 153
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_2
    move-object/from16 v1, p1

    .line 157
    .line 158
    check-cast v1, La/k0w0;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v0, v0, La/v360;->k0:La/rrc;

    .line 164
    .line 165
    sget-object v2, La/m7r0;->a:La/m7r0;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v3, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

    .line 171
    .line 172
    invoke-direct {v3, v0, v2}, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;-><init>(La/rrc;La/m7r0;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 176
    .line 177
    .line 178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_3
    move-object/from16 v1, p1

    .line 182
    .line 183
    check-cast v1, La/k0w0;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v2, v0, La/v360;->b0:La/oct;

    .line 189
    .line 190
    sget-object v7, La/t270;->d:La/t270;

    .line 191
    .line 192
    const/4 v8, 0x0

    .line 193
    const/16 v9, 0x17

    .line 194
    .line 195
    const-wide/16 v3, 0x0

    .line 196
    .line 197
    const/4 v5, 0x0

    .line 198
    const/4 v6, 0x0

    .line 199
    invoke-static/range {v2 .. v9}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 204
    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_4
    move-object/from16 v1, p1

    .line 210
    .line 211
    check-cast v1, La/k0w0;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v2, v0, La/v360;->b0:La/oct;

    .line 217
    .line 218
    sget-object v7, La/t270;->a:La/t270;

    .line 219
    .line 220
    const/4 v8, 0x0

    .line 221
    const/16 v9, 0x17

    .line 222
    .line 223
    const-wide/16 v3, 0x0

    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    const/4 v6, 0x0

    .line 227
    invoke-static/range {v2 .. v9}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 232
    .line 233
    .line 234
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0

    .line 237
    :pswitch_5
    move-object/from16 v1, p1

    .line 238
    .line 239
    check-cast v1, Ljava/lang/Throwable;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 245
    .line 246
    iget-object v4, v2, La/ocj;->a:La/p7m0;

    .line 247
    .line 248
    :cond_2
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 256
    .line 257
    move-object v5, v2

    .line 258
    check-cast v5, La/c260;

    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    new-instance v13, La/pz50;

    .line 264
    .line 265
    invoke-direct {v13, v1}, La/pz50;-><init>(Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    const/4 v15, 0x0

    .line 269
    const v16, 0x3f5f7

    .line 270
    .line 271
    .line 272
    const/4 v6, 0x0

    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v8, 0x0

    .line 275
    const/4 v9, 0x0

    .line 276
    const/4 v10, 0x0

    .line 277
    const/4 v11, 0x1

    .line 278
    const/4 v12, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    invoke-static/range {v5 .. v16}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v4, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_2

    .line 289
    .line 290
    invoke-virtual {v0, v1}, La/v360;->b0(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_6
    move-object/from16 v1, p1

    .line 297
    .line 298
    check-cast v1, La/k0w0;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    iget-object v4, v0, La/v360;->m0:La/peg0;

    .line 304
    .line 305
    new-instance v5, La/fr1;

    .line 306
    .line 307
    iget-object v0, v0, La/v360;->u:La/ctf0;

    .line 308
    .line 309
    new-array v6, v2, [Ljava/lang/Object;

    .line 310
    .line 311
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 312
    .line 313
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const v6, 0x7f13015a

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    const-wide/16 v6, 0x11

    .line 325
    .line 326
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    sget-object v0, La/nw80;->b:La/nw80;

    .line 335
    .line 336
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 337
    .line 338
    .line 339
    move-result-wide v9

    .line 340
    new-instance v7, La/fs80;

    .line 341
    .line 342
    const/4 v15, 0x0

    .line 343
    const/16 v16, 0x78

    .line 344
    .line 345
    const/4 v12, 0x0

    .line 346
    const-wide/16 v13, 0x0

    .line 347
    .line 348
    invoke-direct/range {v7 .. v16}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 349
    .line 350
    .line 351
    const/4 v0, 0x2

    .line 352
    invoke-direct {v5, v7, v3, v0}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v5}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 360
    .line 361
    .line 362
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
