.class public final La/sam0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/tam0;


# direct methods
.method public synthetic constructor <init>(La/tam0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sam0;->i:B

    iput-object p1, p0, La/sam0;->j:La/tam0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/sam0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sam0;->j:La/tam0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/sam0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/sam0;-><init>(La/tam0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/sam0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/sam0;-><init>(La/tam0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/sam0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/sam0;-><init>(La/tam0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sam0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sam0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sam0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sam0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/sam0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/sam0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/sam0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/sam0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/sam0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/sam0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/sam0;->i:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object p0, p0, La/sam0;->j:La/tam0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v0, p0, La/tam0;->f:La/zsi0;

    .line 20
    .line 21
    invoke-static {p1}, La/tam0;->w(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v1, p0, La/tam0;->c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 26
    .line 27
    iget-object v1, v1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/zsi0;->a:La/ram0;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, La/ram0;->a:La/qam0;

    .line 41
    .line 42
    iget-object v4, v0, La/qam0;->c:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-nez v5, :cond_0

    .line 49
    .line 50
    sget-object v5, La/xun;->a:La/xun;

    .line 51
    .line 52
    invoke-static {v5}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-interface {v4, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_0
    check-cast v5, La/qz40;

    .line 60
    .line 61
    check-cast v5, La/p7m0;

    .line 62
    .line 63
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    new-instance v6, La/uy2;

    .line 74
    .line 75
    const/16 v7, 0x12

    .line 76
    .line 77
    invoke-direct {v6, p1, v7}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v6, v2}, La/w3d;->x(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Z)Z

    .line 81
    .line 82
    .line 83
    invoke-interface {v4, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v3, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget-object p1, v0, La/qam0;->a:La/q7d0;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    if-ne v1, v2, :cond_1

    .line 98
    .line 99
    const-string v1, "POST_GAME_"

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const-string v1, "GAME_"

    .line 107
    .line 108
    :goto_0
    const-string v2, "STATISTIC_BLOCKS_PREF_KEY"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v0, v0, La/qam0;->b:La/vby;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v2, La/zw3;

    .line 120
    .line 121
    sget-object v3, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->Companion:La/z9m0;

    .line 122
    .line 123
    invoke-virtual {v3}, La/z9m0;->serializer()La/jiy;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const/4 v5, 0x2

    .line 128
    invoke-direct {v2, v3, v5}, La/zw3;-><init>(La/jiy;B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v2, v4}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p1, v1, v0}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-static {p1}, La/sj3;->y0(Ljava/util/List;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, La/tam0;->o:Ljava/util/List;

    .line 145
    .line 146
    iget-object p1, p0, La/tam0;->l:La/ol60;

    .line 147
    .line 148
    sget-object v0, La/l9m0;->a:La/l9m0;

    .line 149
    .line 150
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, La/tam0;->z()V

    .line 154
    .line 155
    .line 156
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    :goto_1
    return-object v3

    .line 159
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 160
    .line 161
    invoke-static {p1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v4, p0, La/tam0;->j:La/p7m0;

    .line 166
    .line 167
    iget-object p1, p0, La/tam0;->p:Ljava/util/LinkedHashSet;

    .line 168
    .line 169
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 170
    .line 171
    .line 172
    iget-object v5, p0, La/tam0;->c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 173
    .line 174
    iget-object v6, v5, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {p1, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 177
    .line 178
    .line 179
    iget-object v6, v5, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    iget-object v7, v5, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v8, v5, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 192
    .line 193
    iget-object v9, p0, La/tam0;->g:La/ctf0;

    .line 194
    .line 195
    invoke-static {v6, p1, v7, v8, v9}, La/gfx;->y(IILjava/lang/String;La/dam0;La/ctf0;)La/bsv;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget-object v6, p0, La/tam0;->m:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v7, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-static {v6, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-eqz v6, :cond_3

    .line 228
    .line 229
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    check-cast v6, La/t9m0;

    .line 234
    .line 235
    new-instance v8, La/iam0;

    .line 236
    .line 237
    iget-object v10, v5, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->a:La/sip;

    .line 238
    .line 239
    invoke-static {v10, v6, v9}, La/gfx;->H(La/sip;La/t9m0;La/ctf0;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    iget-object v11, v5, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->g:Ljava/util/List;

    .line 244
    .line 245
    iget-short v12, v6, La/t9m0;->a:S

    .line 246
    .line 247
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    invoke-interface {v11, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    invoke-direct {v8, v6, v10, v2, v11}, La/iam0;-><init>(La/t9m0;Ljava/lang/String;ZZ)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 265
    .line 266
    .line 267
    iput-object v1, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    instance-of v1, p1, La/aam0;

    .line 280
    .line 281
    if-eqz v1, :cond_4

    .line 282
    .line 283
    move-object v3, p1

    .line 284
    check-cast v3, La/aam0;

    .line 285
    .line 286
    :cond_4
    if-nez v3, :cond_5

    .line 287
    .line 288
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_5
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    move-object v1, p1

    .line 296
    check-cast v1, La/cam0;

    .line 297
    .line 298
    iget-object v1, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 299
    .line 300
    iget-object v3, p0, La/tam0;->o:Ljava/util/List;

    .line 301
    .line 302
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    xor-int/2addr v1, v2

    .line 307
    new-instance v3, La/aam0;

    .line 308
    .line 309
    invoke-direct {v3, v0, v1, v2}, La/aam0;-><init>(Ljava/util/List;ZZ)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_5

    .line 317
    .line 318
    invoke-virtual {p0}, La/tam0;->A()V

    .line 319
    .line 320
    .line 321
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    :goto_3
    return-object p0

    .line 324
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 325
    .line 326
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iget-object p1, p0, La/tam0;->p:Ljava/util/LinkedHashSet;

    .line 330
    .line 331
    iget-object v0, p0, La/tam0;->g:La/ctf0;

    .line 332
    .line 333
    iget-object v4, p0, La/tam0;->e:La/ewu;

    .line 334
    .line 335
    iget-object v5, p0, La/tam0;->m:Ljava/util/ArrayList;

    .line 336
    .line 337
    iget-object v6, p0, La/tam0;->c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 338
    .line 339
    iget-object v7, v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 340
    .line 341
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget-object v4, v4, La/ewu;->a:La/ram0;

    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iget-object v4, v4, La/ram0;->a:La/qam0;

    .line 356
    .line 357
    invoke-virtual {v4, v7}, La/qam0;->b(La/dam0;)Ljava/util/Set;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    new-instance v7, Ljava/util/ArrayList;

    .line 362
    .line 363
    invoke-static {v5, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eqz v5, :cond_9

    .line 379
    .line 380
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    check-cast v5, La/t9m0;

    .line 385
    .line 386
    move-object v8, v4

    .line 387
    check-cast v8, Ljava/lang/Iterable;

    .line 388
    .line 389
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    if-eqz v9, :cond_7

    .line 398
    .line 399
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    move-object v10, v9

    .line 404
    check-cast v10, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 405
    .line 406
    iget-object v10, v10, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 407
    .line 408
    if-ne v10, v5, :cond_6

    .line 409
    .line 410
    goto :goto_5

    .line 411
    :cond_7
    move-object v9, v3

    .line 412
    :goto_5
    check-cast v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 413
    .line 414
    if-nez v9, :cond_8

    .line 415
    .line 416
    new-instance v9, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 417
    .line 418
    const v8, 0x7fffffff

    .line 419
    .line 420
    .line 421
    invoke-direct {v9, v5, v8, v2}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;-><init>(La/t9m0;IZ)V

    .line 422
    .line 423
    .line 424
    :cond_8
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_9
    new-instance v1, La/vvt;

    .line 429
    .line 430
    const/16 v4, 0x19

    .line 431
    .line 432
    invoke-direct {v1, v4}, La/vvt;-><init>(B)V

    .line 433
    .line 434
    .line 435
    invoke-static {v7, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    iget-object v4, p0, La/tam0;->b:La/vzg0;

    .line 440
    .line 441
    const-string v5, "statistic_items_key"

    .line 442
    .line 443
    invoke-virtual {v4, v5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    check-cast v4, Ljava/util/List;

    .line 448
    .line 449
    if-eqz v4, :cond_b

    .line 450
    .line 451
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    if-eqz v5, :cond_a

    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_a
    move-object v5, v4

    .line 459
    goto :goto_7

    .line 460
    :cond_b
    :goto_6
    move-object v5, v1

    .line 461
    :goto_7
    new-instance v7, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    :cond_c
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    if-eqz v8, :cond_e

    .line 475
    .line 476
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v8

    .line 480
    check-cast v8, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 481
    .line 482
    iget-boolean v9, v8, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 483
    .line 484
    if-eqz v9, :cond_d

    .line 485
    .line 486
    iget-object v8, v8, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 487
    .line 488
    iget-short v8, v8, La/t9m0;->a:S

    .line 489
    .line 490
    new-instance v9, Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-direct {v9, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_d
    move-object v9, v3

    .line 497
    :goto_9
    if-eqz v9, :cond_c

    .line 498
    .line 499
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    goto :goto_8

    .line 503
    :cond_e
    invoke-interface {p1, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 504
    .line 505
    .line 506
    iget-object v5, v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 507
    .line 508
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 509
    .line 510
    .line 511
    move-result v5

    .line 512
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 513
    .line 514
    .line 515
    move-result p1

    .line 516
    iget-object v7, v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->e:Ljava/lang/String;

    .line 517
    .line 518
    iget-object v8, v6, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->b:La/dam0;

    .line 519
    .line 520
    invoke-static {v5, p1, v7, v8, v0}, La/gfx;->y(IILjava/lang/String;La/dam0;La/ctf0;)La/bsv;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    invoke-static {v6, v1, v0}, La/gfx;->z(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;Ljava/util/List;La/ctf0;)Ljava/util/ArrayList;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    if-eqz v4, :cond_f

    .line 529
    .line 530
    invoke-static {v6, v4, v0}, La/gfx;->z(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;Ljava/util/List;La/ctf0;)Ljava/util/ArrayList;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    :cond_f
    if-eqz v3, :cond_11

    .line 535
    .line 536
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-eqz v0, :cond_10

    .line 541
    .line 542
    goto :goto_a

    .line 543
    :cond_10
    new-instance v0, Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 546
    .line 547
    .line 548
    goto :goto_b

    .line 549
    :cond_11
    :goto_a
    new-instance v0, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 552
    .line 553
    .line 554
    :goto_b
    iput-object v0, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-static {v1}, La/sj3;->y0(Ljava/util/List;)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    iput-object v0, p0, La/tam0;->o:Ljava/util/List;

    .line 561
    .line 562
    new-instance v0, Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    if-eqz v3, :cond_13

    .line 571
    .line 572
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result p1

    .line 576
    if-eqz p1, :cond_12

    .line 577
    .line 578
    goto :goto_c

    .line 579
    :cond_12
    move-object v1, v3

    .line 580
    :cond_13
    :goto_c
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 581
    .line 582
    .line 583
    iget-object p1, p0, La/tam0;->j:La/p7m0;

    .line 584
    .line 585
    :cond_14
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    move-object v3, v1

    .line 590
    check-cast v3, La/cam0;

    .line 591
    .line 592
    new-instance v3, La/aam0;

    .line 593
    .line 594
    iget-object v4, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 595
    .line 596
    iget-object v5, p0, La/tam0;->o:Ljava/util/List;

    .line 597
    .line 598
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    xor-int/2addr v4, v2

    .line 603
    invoke-direct {v3, v0, v4, v2}, La/aam0;-><init>(Ljava/util/List;ZZ)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {p1, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    if-eqz v1, :cond_14

    .line 611
    .line 612
    invoke-virtual {p0}, La/tam0;->A()V

    .line 613
    .line 614
    .line 615
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 616
    .line 617
    return-object p0

    .line 618
    nop

    .line 619
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
