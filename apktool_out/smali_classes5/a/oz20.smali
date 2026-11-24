.class public final La/oz20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/uz20;


# direct methods
.method public synthetic constructor <init>(La/uz20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oz20;->i:B

    iput-object p1, p0, La/oz20;->k:La/uz20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/oz20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oz20;->k:La/uz20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/oz20;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/oz20;-><init>(La/uz20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/oz20;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/oz20;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/oz20;-><init>(La/uz20;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/oz20;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/oz20;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/oz20;-><init>(La/uz20;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/oz20;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/oz20;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/oz20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oz20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oz20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/px7;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/oz20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/oz20;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/oz20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/oz20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/oz20;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/oz20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oz20;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/oz20;->k:La/uz20;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 12
    .line 13
    iget-object v0, v0, La/oz20;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v8, v0

    .line 16
    check-cast v8, Ljava/util/List;

    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    iget-object v0, v3, La/uz20;->w:La/s1u;

    .line 24
    .line 25
    iget-object v0, v0, La/s1u;->a:La/kym0;

    .line 26
    .line 27
    iget-object v0, v0, La/kym0;->b:La/yvf;

    .line 28
    .line 29
    invoke-virtual {v0}, La/yvf;->a()La/xvm0;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catch La/ef5; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-object v0, v2

    .line 35
    :goto_0
    if-nez v0, :cond_4

    .line 36
    .line 37
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    move-object v5, v4

    .line 52
    check-cast v5, La/xvm0;

    .line 53
    .line 54
    invoke-interface {v5}, La/xvm0;->getId()J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, La/dz20;

    .line 63
    .line 64
    iget-object v7, v7, La/dz20;->e:Ljava/lang/Long;

    .line 65
    .line 66
    if-nez v7, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    cmp-long v5, v5, v9

    .line 74
    .line 75
    if-nez v5, :cond_0

    .line 76
    .line 77
    move-object v2, v4

    .line 78
    :cond_2
    check-cast v2, La/xvm0;

    .line 79
    .line 80
    if-nez v2, :cond_3

    .line 81
    .line 82
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v2, v0

    .line 87
    check-cast v2, La/xvm0;

    .line 88
    .line 89
    :cond_3
    :goto_2
    move-object v10, v2

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_6

    .line 100
    .line 101
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v6, v5

    .line 106
    check-cast v6, La/xvm0;

    .line 107
    .line 108
    invoke-interface {v6}, La/xvm0;->getId()J

    .line 109
    .line 110
    .line 111
    move-result-wide v6

    .line 112
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    cmp-long v6, v6, v9

    .line 117
    .line 118
    if-nez v6, :cond_5

    .line 119
    .line 120
    move-object v2, v5

    .line 121
    :cond_6
    check-cast v2, La/xvm0;

    .line 122
    .line 123
    if-nez v2, :cond_3

    .line 124
    .line 125
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move-object v2, v0

    .line 130
    check-cast v2, La/xvm0;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :goto_3
    if-eqz v10, :cond_8

    .line 134
    .line 135
    iget-object v0, v3, La/uz20;->s:La/s1u;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v0, v0, La/s1u;->a:La/kym0;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v0, v0, La/kym0;->b:La/yvf;

    .line 146
    .line 147
    invoke-virtual {v0, v10}, La/yvf;->b(La/xvm0;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 151
    .line 152
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-object v4, v1

    .line 160
    check-cast v4, La/dz20;

    .line 161
    .line 162
    invoke-interface {v10}, La/xvm0;->getId()J

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0xfc7

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v6, 0x0

    .line 175
    const/4 v7, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    invoke-static/range {v4 .. v16}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iget-object v4, v3, La/uz20;->o:La/vzg0;

    .line 185
    .line 186
    const-string v5, "KEY_CURRENT_SUB_GAME_ID"

    .line 187
    .line 188
    iget-object v6, v2, La/dz20;->e:Ljava/lang/Long;

    .line 189
    .line 190
    invoke-virtual {v4, v5, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_7

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    sget v0, La/uz20;->R:I

    .line 201
    .line 202
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 203
    .line 204
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-object v4, v0

    .line 212
    check-cast v4, La/dz20;

    .line 213
    .line 214
    const/4 v15, 0x0

    .line 215
    const/16 v16, 0xff7

    .line 216
    .line 217
    const/4 v5, 0x0

    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v10, 0x0

    .line 222
    const/4 v11, 0x0

    .line 223
    const/4 v12, 0x0

    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    invoke-static/range {v4 .. v16}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_9

    .line 235
    .line 236
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_0
    iget-object v0, v0, La/oz20;->j:Ljava/lang/Object;

    .line 240
    .line 241
    move-object v13, v0

    .line 242
    check-cast v13, La/px7;

    .line 243
    .line 244
    sget-object v0, La/wne;->a:La/wne;

    .line 245
    .line 246
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    sget v0, La/uz20;->R:I

    .line 250
    .line 251
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 252
    .line 253
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 254
    .line 255
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-object v4, v0

    .line 263
    check-cast v4, La/dz20;

    .line 264
    .line 265
    const/4 v15, 0x0

    .line 266
    const/16 v16, 0xdff

    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    const/4 v6, 0x0

    .line 270
    const/4 v7, 0x0

    .line 271
    const/4 v8, 0x0

    .line 272
    const/4 v9, 0x0

    .line 273
    const/4 v10, 0x0

    .line 274
    const/4 v11, 0x0

    .line 275
    const/4 v12, 0x0

    .line 276
    const/4 v14, 0x0

    .line 277
    invoke-static/range {v4 .. v16}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_a

    .line 286
    .line 287
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_1
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 291
    .line 292
    iget-object v0, v0, La/oz20;->j:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v5, v0

    .line 295
    check-cast v5, Ljava/util/List;

    .line 296
    .line 297
    sget-object v0, La/wne;->a:La/wne;

    .line 298
    .line 299
    invoke-static/range {p1 .. p1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-eqz v6, :cond_c

    .line 312
    .line 313
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    move-object v7, v6

    .line 318
    check-cast v7, La/js20;

    .line 319
    .line 320
    instance-of v7, v7, La/hs20;

    .line 321
    .line 322
    if-nez v7, :cond_b

    .line 323
    .line 324
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    :cond_d
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_f

    .line 337
    .line 338
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    move-object v7, v6

    .line 343
    check-cast v7, La/js20;

    .line 344
    .line 345
    invoke-interface {v7}, La/js20;->a()J

    .line 346
    .line 347
    .line 348
    move-result-wide v7

    .line 349
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    check-cast v9, La/dz20;

    .line 354
    .line 355
    iget-object v9, v9, La/dz20;->c:Ljava/lang/Long;

    .line 356
    .line 357
    if-nez v9, :cond_e

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_e
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 361
    .line 362
    .line 363
    move-result-wide v9

    .line 364
    cmp-long v7, v7, v9

    .line 365
    .line 366
    if-nez v7, :cond_d

    .line 367
    .line 368
    move-object v2, v6

    .line 369
    :cond_f
    check-cast v2, La/js20;

    .line 370
    .line 371
    if-nez v2, :cond_10

    .line 372
    .line 373
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    move-object v2, v0

    .line 378
    check-cast v2, La/js20;

    .line 379
    .line 380
    :cond_10
    move-object v6, v2

    .line 381
    if-eqz v6, :cond_12

    .line 382
    .line 383
    iget-object v0, v3, La/uz20;->r:La/j1u;

    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v0, v0, La/j1u;->a:La/as20;

    .line 389
    .line 390
    invoke-virtual {v0, v6}, La/as20;->a(La/js20;)V

    .line 391
    .line 392
    .line 393
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 394
    .line 395
    :cond_11
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-object v4, v1

    .line 403
    check-cast v4, La/dz20;

    .line 404
    .line 405
    invoke-interface {v6}, La/js20;->a()J

    .line 406
    .line 407
    .line 408
    move-result-wide v7

    .line 409
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    const/4 v15, 0x0

    .line 414
    const/16 v16, 0x7f8

    .line 415
    .line 416
    const/4 v8, 0x0

    .line 417
    const/4 v9, 0x0

    .line 418
    const/4 v10, 0x0

    .line 419
    const/4 v11, 0x0

    .line 420
    const/4 v12, 0x0

    .line 421
    const/4 v13, 0x0

    .line 422
    const/4 v14, 0x0

    .line 423
    invoke-static/range {v4 .. v16}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    iget-object v4, v3, La/uz20;->o:La/vzg0;

    .line 428
    .line 429
    const-string v7, "KEY_CURRENT_CATEGORY_ID"

    .line 430
    .line 431
    iget-object v8, v2, La/dz20;->c:Ljava/lang/Long;

    .line 432
    .line 433
    invoke-virtual {v4, v7, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    if-eqz v1, :cond_11

    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_12
    sget v0, La/uz20;->R:I

    .line 444
    .line 445
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 446
    .line 447
    :cond_13
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-object v2, v1

    .line 455
    check-cast v2, La/dz20;

    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const/16 v14, 0x7ff

    .line 459
    .line 460
    const/4 v3, 0x0

    .line 461
    const/4 v4, 0x0

    .line 462
    const/4 v5, 0x0

    .line 463
    const/4 v6, 0x0

    .line 464
    const/4 v7, 0x0

    .line 465
    const/4 v8, 0x0

    .line 466
    const/4 v9, 0x0

    .line 467
    const/4 v10, 0x0

    .line 468
    const/4 v11, 0x0

    .line 469
    const/4 v12, 0x0

    .line 470
    invoke-static/range {v2 .. v14}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_13

    .line 479
    .line 480
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object v0

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
