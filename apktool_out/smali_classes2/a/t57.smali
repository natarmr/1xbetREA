.class public final synthetic La/t57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fqj0;


# direct methods
.method public synthetic constructor <init>(La/fqj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t57;->a:B

    iput-object p1, p0, La/t57;->b:La/fqj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t57;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, v0, La/t57;->b:La/fqj0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/g9z;

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    check-cast v7, La/fet;

    .line 25
    .line 26
    move-object/from16 v8, p3

    .line 27
    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v1, v8, 0x11

    .line 38
    .line 39
    if-eq v1, v4, :cond_0

    .line 40
    .line 41
    move v6, v5

    .line 42
    :cond_0
    and-int/lit8 v1, v8, 0x1

    .line 43
    .line 44
    invoke-virtual {v7, v1, v6}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 55
    .line 56
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 61
    .line 62
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    sget-object v4, La/jd8;->n:La/ljc;

    .line 67
    .line 68
    invoke-static {v1, v2, v3, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    sget-object v1, La/qmk;->a:La/zcl;

    .line 73
    .line 74
    invoke-static {v7}, La/xfn;->a(La/fet;)La/wfn;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget v9, v1, La/wfn;->e:F

    .line 79
    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v13, 0x4

    .line 82
    const/high16 v10, 0x41000000    # 8.0f

    .line 83
    .line 84
    const/high16 v12, 0x41000000    # 8.0f

    .line 85
    .line 86
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    if-nez v2, :cond_1

    .line 99
    .line 100
    sget-object v2, La/ukd;->a:La/cl5;

    .line 101
    .line 102
    if-ne v3, v2, :cond_2

    .line 103
    .line 104
    :cond_1
    new-instance v3, La/yq5;

    .line 105
    .line 106
    const/4 v2, 0x5

    .line 107
    invoke-direct {v3, v0, v2}, La/yq5;-><init>(La/fqj0;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    move-object/from16 v16, v3

    .line 114
    .line 115
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    const/high16 v18, 0xc00000

    .line 118
    .line 119
    const/16 v19, 0x17e

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v11, 0x0

    .line 125
    const/4 v12, 0x0

    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    move-object/from16 v17, v7

    .line 130
    .line 131
    move-object v7, v1

    .line 132
    invoke-static/range {v7 .. v19}, La/b8k0;->f(La/mm40;La/xcz;La/hh80;ZLa/ow3;La/yx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_3
    move-object/from16 v17, v7

    .line 137
    .line 138
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 139
    .line 140
    .line 141
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_0
    move-object/from16 v1, p1

    .line 145
    .line 146
    check-cast v1, La/g9z;

    .line 147
    .line 148
    move-object/from16 v2, p2

    .line 149
    .line 150
    check-cast v2, La/fet;

    .line 151
    .line 152
    move-object/from16 v3, p3

    .line 153
    .line 154
    check-cast v3, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    and-int/lit8 v1, v3, 0x11

    .line 164
    .line 165
    if-eq v1, v4, :cond_4

    .line 166
    .line 167
    move v1, v5

    .line 168
    goto :goto_1

    .line 169
    :cond_4
    move v1, v6

    .line 170
    :goto_1
    and-int/2addr v3, v5

    .line 171
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_5

    .line 176
    .line 177
    invoke-static {v0, v2, v6}, La/x8x;->a(La/fqj0;La/fet;I)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    invoke-virtual {v2}, La/fet;->X()V

    .line 182
    .line 183
    .line 184
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_1
    move-object/from16 v1, p1

    .line 188
    .line 189
    check-cast v1, La/g9z;

    .line 190
    .line 191
    move-object/from16 v2, p2

    .line 192
    .line 193
    check-cast v2, La/fet;

    .line 194
    .line 195
    move-object/from16 v3, p3

    .line 196
    .line 197
    check-cast v3, Ljava/lang/Integer;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    and-int/lit8 v1, v3, 0x11

    .line 207
    .line 208
    if-eq v1, v4, :cond_6

    .line 209
    .line 210
    move v1, v5

    .line 211
    goto :goto_3

    .line 212
    :cond_6
    move v1, v6

    .line 213
    :goto_3
    and-int/2addr v3, v5

    .line 214
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_7

    .line 219
    .line 220
    invoke-static {v0, v2, v6}, La/m8x;->e(La/fqj0;La/fet;I)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 225
    .line 226
    .line 227
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_2
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, La/g9z;

    .line 233
    .line 234
    move-object/from16 v10, p2

    .line 235
    .line 236
    check-cast v10, La/fet;

    .line 237
    .line 238
    move-object/from16 v2, p3

    .line 239
    .line 240
    check-cast v2, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    and-int/lit8 v1, v2, 0x11

    .line 250
    .line 251
    if-eq v1, v4, :cond_8

    .line 252
    .line 253
    move v1, v5

    .line 254
    goto :goto_5

    .line 255
    :cond_8
    move v1, v6

    .line 256
    :goto_5
    and-int/2addr v2, v5

    .line 257
    invoke-virtual {v10, v2, v1}, La/fet;->U(IZ)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_9

    .line 262
    .line 263
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 264
    .line 265
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 270
    .line 271
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v1

    .line 275
    invoke-static {v1, v2, v0, v10, v6}, La/pzw;->r(JLa/fqj0;La/fet;I)V

    .line 276
    .line 277
    .line 278
    const/4 v11, 0x6

    .line 279
    const/4 v12, 0x6

    .line 280
    sget-object v7, La/zfi0;->a:La/zfi0;

    .line 281
    .line 282
    const/4 v8, 0x0

    .line 283
    const/4 v9, 0x0

    .line 284
    invoke-static/range {v7 .. v12}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 285
    .line 286
    .line 287
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 292
    .line 293
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 294
    .line 295
    .line 296
    move-result-wide v1

    .line 297
    invoke-static {v1, v2, v0, v10, v6}, La/pzw;->r(JLa/fqj0;La/fet;I)V

    .line 298
    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_9
    invoke-virtual {v10}, La/fet;->X()V

    .line 302
    .line 303
    .line 304
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_3
    move-object/from16 v1, p1

    .line 308
    .line 309
    check-cast v1, La/g9z;

    .line 310
    .line 311
    move-object/from16 v7, p2

    .line 312
    .line 313
    check-cast v7, La/fet;

    .line 314
    .line 315
    move-object/from16 v8, p3

    .line 316
    .line 317
    check-cast v8, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    and-int/lit8 v1, v8, 0x11

    .line 327
    .line 328
    if-eq v1, v4, :cond_a

    .line 329
    .line 330
    move v1, v5

    .line 331
    goto :goto_7

    .line 332
    :cond_a
    move v1, v6

    .line 333
    :goto_7
    and-int/lit8 v4, v8, 0x1

    .line 334
    .line 335
    invoke-virtual {v7, v4, v1}, La/fet;->U(IZ)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_b

    .line 340
    .line 341
    invoke-static {v7}, La/xfn;->a(La/fet;)La/wfn;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    iget v1, v1, La/wfn;->d:F

    .line 346
    .line 347
    sget-object v4, La/qmk;->a:La/zcl;

    .line 348
    .line 349
    const/high16 v4, 0x40800000    # 4.0f

    .line 350
    .line 351
    invoke-static {v3, v1, v4}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    const/high16 v2, 0x42500000    # 52.0f

    .line 360
    .line 361
    invoke-static {v1, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    sget-object v2, La/qmk;->i:La/zcl;

    .line 366
    .line 367
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 368
    .line 369
    invoke-static {v2, v2, v2, v2, v1}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v6, v7, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 378
    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_b
    invoke-virtual {v7}, La/fet;->X()V

    .line 382
    .line 383
    .line 384
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object v0

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
