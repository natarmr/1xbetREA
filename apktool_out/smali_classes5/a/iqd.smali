.class public final synthetic La/iqd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/koa0;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/koa0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/iqd;->a:B

    iput-object p1, p0, La/iqd;->b:La/mm40;

    iput-object p2, p0, La/iqd;->c:La/koa0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iqd;->a:B

    .line 4
    .line 5
    const v2, 0x30030

    .line 6
    .line 7
    .line 8
    const/16 v3, 0x12

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x4

    .line 12
    const/16 v6, 0x10

    .line 13
    .line 14
    iget-object v7, v0, La/iqd;->b:La/mm40;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    iget-object v9, v0, La/iqd;->c:La/koa0;

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, La/y5d;

    .line 26
    .line 27
    move-object/from16 v14, p2

    .line 28
    .line 29
    check-cast v14, La/fet;

    .line 30
    .line 31
    move-object/from16 v1, p3

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    and-int/lit8 v0, v1, 0x11

    .line 43
    .line 44
    if-eq v0, v6, :cond_0

    .line 45
    .line 46
    move v8, v10

    .line 47
    :cond_0
    and-int/lit8 v0, v1, 0x1

    .line 48
    .line 49
    invoke-virtual {v14, v0, v8}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    sget-object v0, La/qmk;->a:La/zcl;

    .line 56
    .line 57
    const/high16 v0, 0x41b00000    # 22.0f

    .line 58
    .line 59
    invoke-static {v7, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    iget-object v0, v9, La/koa0;->c:Ljava/lang/String;

    .line 64
    .line 65
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 66
    .line 67
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, La/g1t0;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 77
    .line 78
    .line 79
    move-result-object v16

    .line 80
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 81
    .line 82
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 87
    .line 88
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v12

    .line 92
    const/4 v11, 0x0

    .line 93
    move-object/from16 v17, v0

    .line 94
    .line 95
    invoke-static/range {v11 .. v17}, La/sj3;->u(IJLa/fet;La/mm40;La/y9q0;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v14}, La/fet;->X()V

    .line 100
    .line 101
    .line 102
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_0
    move-object/from16 v1, p1

    .line 106
    .line 107
    check-cast v1, La/y5d;

    .line 108
    .line 109
    move-object/from16 v7, p2

    .line 110
    .line 111
    check-cast v7, La/fet;

    .line 112
    .line 113
    move-object/from16 v6, p3

    .line 114
    .line 115
    check-cast v6, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    and-int/lit8 v11, v6, 0x6

    .line 125
    .line 126
    if-nez v11, :cond_3

    .line 127
    .line 128
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-eqz v11, :cond_2

    .line 133
    .line 134
    move v4, v5

    .line 135
    :cond_2
    or-int/2addr v6, v4

    .line 136
    :cond_3
    and-int/lit8 v4, v6, 0x13

    .line 137
    .line 138
    if-eq v4, v3, :cond_4

    .line 139
    .line 140
    move v8, v10

    .line 141
    :cond_4
    and-int/lit8 v3, v6, 0x1

    .line 142
    .line 143
    invoke-virtual {v7, v3, v8}, La/fet;->U(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    iget-object v3, v9, La/koa0;->a:La/j83;

    .line 150
    .line 151
    iget-object v4, v9, La/koa0;->b:La/j83;

    .line 152
    .line 153
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 154
    .line 155
    invoke-virtual {v7, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, La/g1t0;

    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    new-instance v8, La/iqd;

    .line 169
    .line 170
    const/4 v10, 0x3

    .line 171
    move v11, v2

    .line 172
    iget-object v2, v0, La/iqd;->b:La/mm40;

    .line 173
    .line 174
    invoke-direct {v8, v2, v9, v10}, La/iqd;-><init>(La/mm40;La/koa0;B)V

    .line 175
    .line 176
    .line 177
    const v0, 0x78db6e76

    .line 178
    .line 179
    .line 180
    invoke-static {v0, v8, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    and-int/lit8 v6, v6, 0xe

    .line 185
    .line 186
    or-int v8, v6, v11

    .line 187
    .line 188
    move-object v6, v0

    .line 189
    invoke-static/range {v1 .. v8}, La/ufx;->q(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_5
    invoke-virtual {v7}, La/fet;->X()V

    .line 194
    .line 195
    .line 196
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_1
    move-object/from16 v0, p1

    .line 200
    .line 201
    check-cast v0, La/y5d;

    .line 202
    .line 203
    move-object/from16 v14, p2

    .line 204
    .line 205
    check-cast v14, La/fet;

    .line 206
    .line 207
    move-object/from16 v1, p3

    .line 208
    .line 209
    check-cast v1, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    and-int/lit8 v0, v1, 0x11

    .line 219
    .line 220
    if-eq v0, v6, :cond_6

    .line 221
    .line 222
    move v8, v10

    .line 223
    :cond_6
    and-int/lit8 v0, v1, 0x1

    .line 224
    .line 225
    invoke-virtual {v14, v0, v8}, La/fet;->U(IZ)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    sget-object v0, La/qmk;->a:La/zcl;

    .line 232
    .line 233
    const/high16 v0, 0x41900000    # 18.0f

    .line 234
    .line 235
    invoke-static {v7, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    iget-object v0, v9, La/koa0;->c:Ljava/lang/String;

    .line 240
    .line 241
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 242
    .line 243
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, La/g1t0;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 253
    .line 254
    .line 255
    move-result-object v16

    .line 256
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 257
    .line 258
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 263
    .line 264
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v12

    .line 268
    const/4 v11, 0x0

    .line 269
    move-object/from16 v17, v0

    .line 270
    .line 271
    invoke-static/range {v11 .. v17}, La/sj3;->u(IJLa/fet;La/mm40;La/y9q0;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_7
    invoke-virtual {v14}, La/fet;->X()V

    .line 276
    .line 277
    .line 278
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_2
    move v11, v2

    .line 282
    move-object/from16 v1, p1

    .line 283
    .line 284
    check-cast v1, La/y5d;

    .line 285
    .line 286
    move-object/from16 v7, p2

    .line 287
    .line 288
    check-cast v7, La/fet;

    .line 289
    .line 290
    move-object/from16 v2, p3

    .line 291
    .line 292
    check-cast v2, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    and-int/lit8 v6, v2, 0x6

    .line 302
    .line 303
    if-nez v6, :cond_9

    .line 304
    .line 305
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-eqz v6, :cond_8

    .line 310
    .line 311
    move v4, v5

    .line 312
    :cond_8
    or-int/2addr v2, v4

    .line 313
    :cond_9
    and-int/lit8 v4, v2, 0x13

    .line 314
    .line 315
    if-eq v4, v3, :cond_a

    .line 316
    .line 317
    move v8, v10

    .line 318
    :cond_a
    and-int/lit8 v3, v2, 0x1

    .line 319
    .line 320
    invoke-virtual {v7, v3, v8}, La/fet;->U(IZ)Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-eqz v3, :cond_b

    .line 325
    .line 326
    iget-object v3, v9, La/koa0;->a:La/j83;

    .line 327
    .line 328
    iget-object v4, v9, La/koa0;->b:La/j83;

    .line 329
    .line 330
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 331
    .line 332
    invoke-virtual {v7, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    check-cast v5, La/g1t0;

    .line 337
    .line 338
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    new-instance v6, La/iqd;

    .line 346
    .line 347
    iget-object v0, v0, La/iqd;->b:La/mm40;

    .line 348
    .line 349
    invoke-direct {v6, v0, v9, v10}, La/iqd;-><init>(La/mm40;La/koa0;B)V

    .line 350
    .line 351
    .line 352
    const v8, -0x5d277f5

    .line 353
    .line 354
    .line 355
    invoke-static {v8, v6, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    and-int/lit8 v2, v2, 0xe

    .line 360
    .line 361
    or-int v8, v2, v11

    .line 362
    .line 363
    move-object v2, v0

    .line 364
    invoke-static/range {v1 .. v8}, La/uvw;->n(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_b
    invoke-virtual {v7}, La/fet;->X()V

    .line 369
    .line 370
    .line 371
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object v0

    .line 374
    nop

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
