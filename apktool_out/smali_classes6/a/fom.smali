.class public final synthetic La/fom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wom;


# direct methods
.method public synthetic constructor <init>(La/wom;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fom;->a:B

    iput-object p1, p0, La/fom;->b:La/wom;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fom;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x92

    .line 9
    .line 10
    const/16 v5, 0x10

    .line 11
    .line 12
    const/16 v6, 0x20

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x4

    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/ir8;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v13

    .line 32
    move-object/from16 v10, p3

    .line 33
    .line 34
    check-cast v10, La/fet;

    .line 35
    .line 36
    move-object/from16 v11, p4

    .line 37
    .line 38
    check-cast v11, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v12, v11, 0x6

    .line 48
    .line 49
    if-nez v12, :cond_1

    .line 50
    .line 51
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    if-eqz v12, :cond_0

    .line 56
    .line 57
    move v7, v8

    .line 58
    :cond_0
    or-int/2addr v7, v11

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v7, v11

    .line 61
    :goto_0
    and-int/lit8 v8, v11, 0x30

    .line 62
    .line 63
    if-nez v8, :cond_3

    .line 64
    .line 65
    invoke-virtual {v10, v13}, La/fet;->h(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_2

    .line 70
    .line 71
    move v5, v6

    .line 72
    :cond_2
    or-int/2addr v7, v5

    .line 73
    :cond_3
    and-int/lit16 v5, v7, 0x93

    .line 74
    .line 75
    if-eq v5, v4, :cond_4

    .line 76
    .line 77
    move v3, v9

    .line 78
    :cond_4
    and-int/lit8 v4, v7, 0x1

    .line 79
    .line 80
    invoke-virtual {v10, v4, v3}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    sget-object v3, La/gqw0;->b:La/zx7;

    .line 87
    .line 88
    invoke-interface {v1, v2, v3}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 93
    .line 94
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 99
    .line 100
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 101
    .line 102
    .line 103
    move-result-wide v14

    .line 104
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 109
    .line 110
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 111
    .line 112
    .line 113
    move-result-wide v16

    .line 114
    shl-int/lit8 v1, v7, 0x3

    .line 115
    .line 116
    and-int/lit16 v1, v1, 0x380

    .line 117
    .line 118
    const/16 v21, 0x20

    .line 119
    .line 120
    iget-object v12, v0, La/fom;->b:La/wom;

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    move/from16 v20, v1

    .line 125
    .line 126
    move-object/from16 v19, v10

    .line 127
    .line 128
    invoke-static/range {v11 .. v21}, La/mom;->b(La/mm40;La/wom;ZJJFLa/fet;II)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    move-object/from16 v19, v10

    .line 133
    .line 134
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 135
    .line 136
    .line 137
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0

    .line 140
    :pswitch_0
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, La/ir8;

    .line 143
    .line 144
    move-object/from16 v10, p2

    .line 145
    .line 146
    check-cast v10, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    move-object/from16 v10, p3

    .line 153
    .line 154
    check-cast v10, La/fet;

    .line 155
    .line 156
    move-object/from16 v11, p4

    .line 157
    .line 158
    check-cast v11, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    and-int/lit8 v12, v11, 0x6

    .line 168
    .line 169
    if-nez v12, :cond_7

    .line 170
    .line 171
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    if-eqz v12, :cond_6

    .line 176
    .line 177
    move v7, v8

    .line 178
    :cond_6
    or-int/2addr v7, v11

    .line 179
    goto :goto_2

    .line 180
    :cond_7
    move v7, v11

    .line 181
    :goto_2
    and-int/lit8 v8, v11, 0x30

    .line 182
    .line 183
    if-nez v8, :cond_9

    .line 184
    .line 185
    invoke-virtual {v10, v13}, La/fet;->h(Z)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_8

    .line 190
    .line 191
    move v5, v6

    .line 192
    :cond_8
    or-int/2addr v7, v5

    .line 193
    :cond_9
    and-int/lit16 v5, v7, 0x93

    .line 194
    .line 195
    if-eq v5, v4, :cond_a

    .line 196
    .line 197
    move v3, v9

    .line 198
    :cond_a
    and-int/lit8 v4, v7, 0x1

    .line 199
    .line 200
    invoke-virtual {v10, v4, v3}, La/fet;->U(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_b

    .line 205
    .line 206
    sget-object v3, La/gqw0;->b:La/zx7;

    .line 207
    .line 208
    invoke-interface {v1, v2, v3}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 213
    .line 214
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 219
    .line 220
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 221
    .line 222
    .line 223
    move-result-wide v14

    .line 224
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 229
    .line 230
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 231
    .line 232
    .line 233
    move-result-wide v16

    .line 234
    shl-int/lit8 v1, v7, 0x3

    .line 235
    .line 236
    and-int/lit16 v1, v1, 0x380

    .line 237
    .line 238
    const/16 v21, 0x20

    .line 239
    .line 240
    iget-object v12, v0, La/fom;->b:La/wom;

    .line 241
    .line 242
    const/16 v18, 0x0

    .line 243
    .line 244
    move/from16 v20, v1

    .line 245
    .line 246
    move-object/from16 v19, v10

    .line 247
    .line 248
    invoke-static/range {v11 .. v21}, La/mom;->b(La/mm40;La/wom;ZJJFLa/fet;II)V

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_b
    move-object/from16 v19, v10

    .line 253
    .line 254
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 255
    .line 256
    .line 257
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_1
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/ir8;

    .line 263
    .line 264
    move-object/from16 v10, p2

    .line 265
    .line 266
    check-cast v10, Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    move-object/from16 v10, p3

    .line 273
    .line 274
    check-cast v10, La/fet;

    .line 275
    .line 276
    move-object/from16 v11, p4

    .line 277
    .line 278
    check-cast v11, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    and-int/lit8 v12, v11, 0x6

    .line 288
    .line 289
    if-nez v12, :cond_d

    .line 290
    .line 291
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    if-eqz v12, :cond_c

    .line 296
    .line 297
    move v7, v8

    .line 298
    :cond_c
    or-int/2addr v7, v11

    .line 299
    goto :goto_4

    .line 300
    :cond_d
    move v7, v11

    .line 301
    :goto_4
    and-int/lit8 v8, v11, 0x30

    .line 302
    .line 303
    if-nez v8, :cond_f

    .line 304
    .line 305
    invoke-virtual {v10, v13}, La/fet;->h(Z)Z

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    if-eqz v8, :cond_e

    .line 310
    .line 311
    move v5, v6

    .line 312
    :cond_e
    or-int/2addr v7, v5

    .line 313
    :cond_f
    and-int/lit16 v5, v7, 0x93

    .line 314
    .line 315
    if-eq v5, v4, :cond_10

    .line 316
    .line 317
    move v3, v9

    .line 318
    :cond_10
    and-int/lit8 v4, v7, 0x1

    .line 319
    .line 320
    invoke-virtual {v10, v4, v3}, La/fet;->U(IZ)Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-eqz v3, :cond_11

    .line 325
    .line 326
    sget-object v3, La/gqw0;->b:La/zx7;

    .line 327
    .line 328
    invoke-interface {v1, v2, v3}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    shl-int/lit8 v1, v7, 0x3

    .line 333
    .line 334
    and-int/lit16 v1, v1, 0x380

    .line 335
    .line 336
    const/16 v21, 0x38

    .line 337
    .line 338
    iget-object v12, v0, La/fom;->b:La/wom;

    .line 339
    .line 340
    const-wide/16 v14, 0x0

    .line 341
    .line 342
    const-wide/16 v16, 0x0

    .line 343
    .line 344
    const/16 v18, 0x0

    .line 345
    .line 346
    move/from16 v20, v1

    .line 347
    .line 348
    move-object/from16 v19, v10

    .line 349
    .line 350
    invoke-static/range {v11 .. v21}, La/mom;->b(La/mm40;La/wom;ZJJFLa/fet;II)V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_11
    move-object/from16 v19, v10

    .line 355
    .line 356
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 357
    .line 358
    .line 359
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object v0

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
