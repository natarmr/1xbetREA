.class public final synthetic La/blb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(FILjava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput-byte p2, p0, La/blb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/blb;->c:Ljava/lang/String;

    iput p1, p0, La/blb;->b:F

    return-void
.end method

.method public synthetic constructor <init>(FLjava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/blb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/blb;->b:F

    iput-object p2, p0, La/blb;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;F)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput-byte v0, p0, La/blb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/blb;->c:Ljava/lang/String;

    iput p2, p0, La/blb;->b:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/blb;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/high16 v6, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    iget v8, v0, La/blb;->b:F

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/fet;

    .line 21
    .line 22
    move-object/from16 v2, p2

    .line 23
    .line 24
    check-cast v2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v7}, La/x8x;->L(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v0, v0, La/blb;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v8, v1, v2}, La/m8x;->x(Ljava/lang/String;FLa/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, La/fet;

    .line 44
    .line 45
    move-object/from16 v9, p2

    .line 46
    .line 47
    check-cast v9, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    and-int/lit8 v10, v9, 0x3

    .line 54
    .line 55
    if-eq v10, v3, :cond_0

    .line 56
    .line 57
    move v3, v7

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v3, v5

    .line 60
    :goto_0
    and-int/2addr v7, v9

    .line 61
    invoke-virtual {v1, v7, v3}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    cmpg-float v3, v8, v6

    .line 68
    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    const v3, 0x669a173c

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    sget-object v2, La/qmk;->a:La/zcl;

    .line 82
    .line 83
    const/4 v11, 0x0

    .line 84
    const/16 v12, 0xb

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    const/high16 v10, 0x42600000    # 56.0f

    .line 89
    .line 90
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 95
    .line 96
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 97
    .line 98
    .line 99
    move-result-wide v8

    .line 100
    new-instance v2, La/f2q0;

    .line 101
    .line 102
    invoke-direct {v2, v4}, La/f2q0;-><init>(I)V

    .line 103
    .line 104
    .line 105
    sget-object v16, La/j1t0;->b:La/qrq;

    .line 106
    .line 107
    sget-wide v13, La/qmk;->u:J

    .line 108
    .line 109
    sget-wide v22, La/qmk;->H:J

    .line 110
    .line 111
    new-instance v10, La/y9q0;

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const v24, 0xfdffdd

    .line 116
    .line 117
    .line 118
    const-wide/16 v11, 0x0

    .line 119
    .line 120
    const/4 v15, 0x0

    .line 121
    const-wide/16 v17, 0x0

    .line 122
    .line 123
    const/16 v19, 0x0

    .line 124
    .line 125
    const/16 v20, 0x0

    .line 126
    .line 127
    invoke-direct/range {v10 .. v24}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 128
    .line 129
    .line 130
    const/16 v29, 0x6180

    .line 131
    .line 132
    const v30, 0x1abf8

    .line 133
    .line 134
    .line 135
    iget-object v6, v0, La/blb;->c:Ljava/lang/String;

    .line 136
    .line 137
    move-object/from16 v26, v10

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const-wide/16 v16, 0x0

    .line 143
    .line 144
    const-wide/16 v19, 0x0

    .line 145
    .line 146
    const/16 v21, 0x2

    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const/16 v23, 0x2

    .line 151
    .line 152
    const/16 v24, 0x0

    .line 153
    .line 154
    const/16 v25, 0x0

    .line 155
    .line 156
    const/16 v28, 0x0

    .line 157
    .line 158
    move-object/from16 v27, v1

    .line 159
    .line 160
    move-object/from16 v18, v2

    .line 161
    .line 162
    invoke-static/range {v6 .. v30}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v0, v27

    .line 166
    .line 167
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_1
    move-object v0, v1

    .line 172
    const v1, 0x66a0e50c

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_2
    move-object v0, v1

    .line 183
    invoke-virtual {v0}, La/fet;->X()V

    .line 184
    .line 185
    .line 186
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_1
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, La/fet;

    .line 192
    .line 193
    move-object/from16 v9, p2

    .line 194
    .line 195
    check-cast v9, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    and-int/lit8 v10, v9, 0x3

    .line 202
    .line 203
    if-eq v10, v3, :cond_3

    .line 204
    .line 205
    move v5, v7

    .line 206
    :cond_3
    and-int/lit8 v3, v9, 0x1

    .line 207
    .line 208
    invoke-virtual {v1, v3, v5}, La/fet;->U(IZ)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_6

    .line 213
    .line 214
    invoke-virtual {v1, v8}, La/fet;->d(F)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    if-nez v3, :cond_4

    .line 223
    .line 224
    sget-object v3, La/ukd;->a:La/cl5;

    .line 225
    .line 226
    if-ne v5, v3, :cond_5

    .line 227
    .line 228
    :cond_4
    new-instance v5, La/f54;

    .line 229
    .line 230
    const/4 v3, 0x5

    .line 231
    invoke-direct {v5, v8, v3}, La/f54;-><init>(FB)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 238
    .line 239
    invoke-static {v2, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {v2, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    sget-object v2, La/qmk;->a:La/zcl;

    .line 248
    .line 249
    const/4 v11, 0x0

    .line 250
    const/16 v12, 0xb

    .line 251
    .line 252
    const/4 v8, 0x0

    .line 253
    const/4 v9, 0x0

    .line 254
    const/high16 v10, 0x42600000    # 56.0f

    .line 255
    .line 256
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 261
    .line 262
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 267
    .line 268
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 269
    .line 270
    .line 271
    move-result-wide v5

    .line 272
    new-instance v13, La/f2q0;

    .line 273
    .line 274
    invoke-direct {v13, v4}, La/f2q0;-><init>(I)V

    .line 275
    .line 276
    .line 277
    sget-object v20, La/j1t0;->b:La/qrq;

    .line 278
    .line 279
    sget-wide v17, La/qmk;->u:J

    .line 280
    .line 281
    sget-wide v26, La/qmk;->H:J

    .line 282
    .line 283
    new-instance v14, La/y9q0;

    .line 284
    .line 285
    const/16 v25, 0x0

    .line 286
    .line 287
    const v28, 0xfdffdd

    .line 288
    .line 289
    .line 290
    const-wide/16 v15, 0x0

    .line 291
    .line 292
    const/16 v19, 0x0

    .line 293
    .line 294
    const-wide/16 v21, 0x0

    .line 295
    .line 296
    const/16 v23, 0x0

    .line 297
    .line 298
    const/16 v24, 0x0

    .line 299
    .line 300
    invoke-direct/range {v14 .. v28}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 301
    .line 302
    .line 303
    const/16 v24, 0x6180

    .line 304
    .line 305
    const v25, 0x1abf8

    .line 306
    .line 307
    .line 308
    iget-object v0, v0, La/blb;->c:Ljava/lang/String;

    .line 309
    .line 310
    move-wide v3, v5

    .line 311
    const/4 v5, 0x0

    .line 312
    const-wide/16 v6, 0x0

    .line 313
    .line 314
    const/4 v8, 0x0

    .line 315
    const/4 v9, 0x0

    .line 316
    const/4 v10, 0x0

    .line 317
    const-wide/16 v11, 0x0

    .line 318
    .line 319
    move-object/from16 v21, v14

    .line 320
    .line 321
    const-wide/16 v14, 0x0

    .line 322
    .line 323
    const/16 v16, 0x2

    .line 324
    .line 325
    const/16 v17, 0x0

    .line 326
    .line 327
    const/16 v18, 0x2

    .line 328
    .line 329
    const/16 v19, 0x0

    .line 330
    .line 331
    const/16 v20, 0x0

    .line 332
    .line 333
    const/16 v23, 0x0

    .line 334
    .line 335
    move-object/from16 v22, v1

    .line 336
    .line 337
    move-object v1, v0

    .line 338
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_6
    move-object/from16 v22, v1

    .line 343
    .line 344
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 345
    .line 346
    .line 347
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object v0

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
