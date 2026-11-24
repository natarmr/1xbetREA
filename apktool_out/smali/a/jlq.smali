.class public final La/jlq;
.super La/o0d0;
.source "SourceFile"


# virtual methods
.method public final a(La/oms0;Ljava/lang/String;ILa/fet;I)La/l7m0;
    .locals 10

    .line 1
    const p2, 0x779f4d84

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, p2}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    new-instance p2, La/z30;

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    invoke-direct {p2, p0, p3, v0}, La/z30;-><init>(Ljava/lang/Object;IB)V

    .line 11
    .line 12
    .line 13
    and-int/lit8 p3, p5, 0xe

    .line 14
    .line 15
    shl-int/lit8 p5, p5, 0x3

    .line 16
    .line 17
    and-int/lit16 p5, p5, 0x380

    .line 18
    .line 19
    or-int/2addr p3, p5

    .line 20
    sget-object v4, La/hp4;->j:La/lxs0;

    .line 21
    .line 22
    and-int/lit8 p5, p3, 0xe

    .line 23
    .line 24
    shl-int/lit8 p3, p3, 0x3

    .line 25
    .line 26
    and-int/lit16 p3, p3, 0x1c00

    .line 27
    .line 28
    or-int/2addr p3, p5

    .line 29
    invoke-virtual {p1}, La/oms0;->h()Z

    .line 30
    .line 31
    .line 32
    move-result p5

    .line 33
    iget-object v0, p1, La/oms0;->a:La/p4;

    .line 34
    .line 35
    sget-object v1, La/ukd;->a:La/cl5;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    const/4 v3, 0x4

    .line 39
    const/4 v7, 0x0

    .line 40
    if-nez p5, :cond_6

    .line 41
    .line 42
    const p5, 0x6355e4b0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p4, p5}, La/fet;->e0(I)V

    .line 46
    .line 47
    .line 48
    and-int/lit8 p5, p3, 0xe

    .line 49
    .line 50
    xor-int/lit8 p5, p5, 0x6

    .line 51
    .line 52
    if-le p5, v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p5

    .line 58
    if-nez p5, :cond_1

    .line 59
    .line 60
    :cond_0
    and-int/lit8 p5, p3, 0x6

    .line 61
    .line 62
    if-ne p5, v3, :cond_2

    .line 63
    .line 64
    :cond_1
    move p5, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move p5, v7

    .line 67
    :goto_0
    invoke-virtual {p4}, La/fet;->P()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    if-nez p5, :cond_3

    .line 72
    .line 73
    if-ne v5, v1, :cond_5

    .line 74
    .line 75
    :cond_3
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 76
    .line 77
    .line 78
    move-result-object p5

    .line 79
    if-eqz p5, :cond_4

    .line 80
    .line 81
    invoke-virtual {p5}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    const/4 v5, 0x0

    .line 87
    :goto_1
    invoke-static {p5}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    :try_start_0
    invoke-virtual {v0}, La/p4;->y0()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-static {p5, v6, v5}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p4, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object v5, v0

    .line 102
    :cond_5
    invoke-virtual {p4, v7}, La/fet;->r(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    move-object p0, v0

    .line 108
    invoke-static {p5, v6, v5}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_6
    const p5, 0x6359c50d

    .line 113
    .line 114
    .line 115
    invoke-static {p4, p5, v7, v0}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    :goto_2
    check-cast v5, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result p5

    .line 125
    const v0, -0x67eac224

    .line 126
    .line 127
    .line 128
    invoke-virtual {p4, v0}, La/fet;->e0(I)V

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, La/o0d0;->a:Ljava/util/ArrayList;

    .line 132
    .line 133
    if-eqz p5, :cond_7

    .line 134
    .line 135
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p5

    .line 139
    check-cast p5, La/boq0;

    .line 140
    .line 141
    iget-object p5, p5, La/boq0;->e:La/p0d0;

    .line 142
    .line 143
    check-cast p5, La/t0d0;

    .line 144
    .line 145
    iget-object p5, p5, La/t0d0;->b:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-static {p5}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p5

    .line 151
    check-cast p5, La/dmy;

    .line 152
    .line 153
    iget-object p5, p5, La/dmy;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p5, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {p5}, Ljava/lang/Number;->floatValue()F

    .line 158
    .line 159
    .line 160
    move-result p5

    .line 161
    goto :goto_3

    .line 162
    :cond_7
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p5

    .line 166
    check-cast p5, La/boq0;

    .line 167
    .line 168
    iget-object p5, p5, La/boq0;->e:La/p0d0;

    .line 169
    .line 170
    check-cast p5, La/t0d0;

    .line 171
    .line 172
    iget-object p5, p5, La/t0d0;->b:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-static {p5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p5

    .line 178
    check-cast p5, La/dmy;

    .line 179
    .line 180
    iget-object p5, p5, La/dmy;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p5, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {p5}, Ljava/lang/Number;->floatValue()F

    .line 185
    .line 186
    .line 187
    move-result p5

    .line 188
    :goto_3
    invoke-virtual {p4, v7}, La/fet;->r(Z)V

    .line 189
    .line 190
    .line 191
    invoke-static {p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object p5

    .line 195
    and-int/lit8 v5, p3, 0xe

    .line 196
    .line 197
    xor-int/lit8 v6, v5, 0x6

    .line 198
    .line 199
    if-le v6, v3, :cond_8

    .line 200
    .line 201
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-nez v8, :cond_9

    .line 206
    .line 207
    :cond_8
    and-int/lit8 v8, p3, 0x6

    .line 208
    .line 209
    if-ne v8, v3, :cond_a

    .line 210
    .line 211
    :cond_9
    move v8, v2

    .line 212
    goto :goto_4

    .line 213
    :cond_a
    move v8, v7

    .line 214
    :goto_4
    invoke-virtual {p4}, La/fet;->P()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    if-nez v8, :cond_b

    .line 219
    .line 220
    if-ne v9, v1, :cond_c

    .line 221
    .line 222
    :cond_b
    new-instance v8, La/elb;

    .line 223
    .line 224
    const/16 v9, 0x1a

    .line 225
    .line 226
    invoke-direct {v8, p1, v9}, La/elb;-><init>(La/oms0;B)V

    .line 227
    .line 228
    .line 229
    invoke-static {v8}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-virtual {p4, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_c
    check-cast v9, La/l7m0;

    .line 237
    .line 238
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    check-cast v8, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-virtual {p4, v0}, La/fet;->e0(I)V

    .line 249
    .line 250
    .line 251
    if-eqz v8, :cond_d

    .line 252
    .line 253
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    check-cast p0, La/boq0;

    .line 258
    .line 259
    iget-object p0, p0, La/boq0;->e:La/p0d0;

    .line 260
    .line 261
    check-cast p0, La/t0d0;

    .line 262
    .line 263
    iget-object p0, p0, La/t0d0;->b:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, La/dmy;

    .line 270
    .line 271
    iget-object p0, p0, La/dmy;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p0, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    goto :goto_5

    .line 280
    :cond_d
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    check-cast p0, La/boq0;

    .line 285
    .line 286
    iget-object p0, p0, La/boq0;->e:La/p0d0;

    .line 287
    .line 288
    check-cast p0, La/t0d0;

    .line 289
    .line 290
    iget-object p0, p0, La/t0d0;->b:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    check-cast p0, La/dmy;

    .line 297
    .line 298
    iget-object p0, p0, La/dmy;->b:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast p0, Ljava/lang/Number;

    .line 301
    .line 302
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    :goto_5
    invoke-virtual {p4, v7}, La/fet;->r(Z)V

    .line 307
    .line 308
    .line 309
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    if-le v6, v3, :cond_e

    .line 314
    .line 315
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-nez v0, :cond_10

    .line 320
    .line 321
    :cond_e
    and-int/lit8 v0, p3, 0x6

    .line 322
    .line 323
    if-ne v0, v3, :cond_f

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_f
    move v2, v7

    .line 327
    :cond_10
    :goto_6
    invoke-virtual {p4}, La/fet;->P()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    if-nez v2, :cond_11

    .line 332
    .line 333
    if-ne v0, v1, :cond_12

    .line 334
    .line 335
    :cond_11
    new-instance v0, La/elb;

    .line 336
    .line 337
    const/16 v1, 0x1b

    .line 338
    .line 339
    invoke-direct {v0, p1, v1}, La/elb;-><init>(La/oms0;B)V

    .line 340
    .line 341
    .line 342
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {p4, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :cond_12
    check-cast v0, La/l7m0;

    .line 350
    .line 351
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {p2, v0, p4, v1}, La/z30;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object p2

    .line 363
    move-object v3, p2

    .line 364
    check-cast v3, La/cfq;

    .line 365
    .line 366
    const/high16 p2, 0x70000

    .line 367
    .line 368
    shl-int/lit8 p3, p3, 0x6

    .line 369
    .line 370
    and-int/2addr p2, p3

    .line 371
    or-int v6, v5, p2

    .line 372
    .line 373
    move-object v2, p0

    .line 374
    move-object v0, p1

    .line 375
    move-object v5, p4

    .line 376
    move-object v1, p5

    .line 377
    invoke-static/range {v0 .. v6}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-virtual {v5, v7}, La/fet;->r(Z)V

    .line 382
    .line 383
    .line 384
    return-object p0
.end method
