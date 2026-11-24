.class public final synthetic La/cgc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/igc0;


# direct methods
.method public synthetic constructor <init>(La/igc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cgc0;->a:B

    iput-object p1, p0, La/cgc0;->b:La/igc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/igc0;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/cgc0;->a:B

    iput-object p1, p0, La/cgc0;->b:La/igc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cgc0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, v0, La/cgc0;->b:La/igc0;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p1

    .line 14
    .line 15
    check-cast v0, La/fet;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sget-object v6, La/igc0;->V1:La/fl70;

    .line 26
    .line 27
    and-int/lit8 v6, v1, 0x3

    .line 28
    .line 29
    if-eq v6, v3, :cond_0

    .line 30
    .line 31
    move v3, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v2

    .line 34
    :goto_0
    and-int/2addr v1, v5

    .line 35
    invoke-virtual {v0, v1, v3}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v4, v2, v0}, La/igc0;->G0(ILa/fet;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0}, La/fet;->X()V

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    move-object/from16 v0, p1

    .line 52
    .line 53
    check-cast v0, La/fet;

    .line 54
    .line 55
    move-object/from16 v1, p2

    .line 56
    .line 57
    check-cast v1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sget-object v6, La/igc0;->V1:La/fl70;

    .line 64
    .line 65
    and-int/lit8 v6, v1, 0x3

    .line 66
    .line 67
    if-eq v6, v3, :cond_2

    .line 68
    .line 69
    move v3, v5

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v3, v2

    .line 72
    :goto_2
    and-int/2addr v1, v5

    .line 73
    invoke-virtual {v0, v1, v3}, La/fet;->U(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v4, v2, v0}, La/igc0;->H0(ILa/fet;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v0}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_1
    iget-object v6, v0, La/cgc0;->b:La/igc0;

    .line 90
    .line 91
    iget-object v0, v6, La/igc0;->S1:La/a8z;

    .line 92
    .line 93
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, La/fet;

    .line 96
    .line 97
    move-object/from16 v4, p2

    .line 98
    .line 99
    check-cast v4, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    sget-object v7, La/igc0;->V1:La/fl70;

    .line 106
    .line 107
    and-int/lit8 v7, v4, 0x3

    .line 108
    .line 109
    if-eq v7, v3, :cond_4

    .line 110
    .line 111
    move v2, v5

    .line 112
    :cond_4
    and-int/2addr v4, v5

    .line 113
    invoke-virtual {v1, v4, v2}, La/fet;->U(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_c

    .line 118
    .line 119
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, La/k3t0;

    .line 124
    .line 125
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    sget-object v12, La/ukd;->a:La/cl5;

    .line 130
    .line 131
    if-ne v4, v12, :cond_5

    .line 132
    .line 133
    sget-object v4, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 134
    .line 135
    invoke-static {v4, v1}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    move-object v13, v4

    .line 143
    check-cast v13, La/vne;

    .line 144
    .line 145
    invoke-virtual {v1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    if-nez v4, :cond_6

    .line 154
    .line 155
    if-ne v5, v12, :cond_7

    .line 156
    .line 157
    :cond_6
    new-instance v4, La/l8c0;

    .line 158
    .line 159
    const/4 v10, 0x0

    .line 160
    const/16 v11, 0x12

    .line 161
    .line 162
    const/4 v5, 0x1

    .line 163
    const-class v7, La/igc0;

    .line 164
    .line 165
    const-string v8, "handleSideEffect"

    .line 166
    .line 167
    const-string v9, "handleSideEffect(Lorg/xplatform/promo/impl/promocodes/presentation/models/PromoCodesScreenSideEffect;)V"

    .line 168
    .line 169
    invoke-direct/range {v4 .. v11}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    move-object v5, v4

    .line 176
    :cond_7
    check-cast v5, La/jhy;

    .line 177
    .line 178
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 179
    .line 180
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    invoke-virtual {v1, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    or-int/2addr v7, v8

    .line 191
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    or-int/2addr v7, v8

    .line 196
    const/4 v8, 0x0

    .line 197
    invoke-virtual {v1, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    or-int/2addr v7, v8

    .line 202
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    if-nez v7, :cond_8

    .line 207
    .line 208
    if-ne v8, v12, :cond_9

    .line 209
    .line 210
    :cond_8
    new-instance v8, La/ggc0;

    .line 211
    .line 212
    invoke-direct {v8, v13, v2, v5, v3}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 219
    .line 220
    invoke-static {v4, v8, v1}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, La/k3t0;

    .line 228
    .line 229
    check-cast v2, La/i3t0;

    .line 230
    .line 231
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    move-object v15, v0

    .line 240
    check-cast v15, La/k3t0;

    .line 241
    .line 242
    invoke-virtual {v1, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    if-nez v0, :cond_a

    .line 251
    .line 252
    if-ne v2, v12, :cond_b

    .line 253
    .line 254
    :cond_a
    new-instance v13, La/l8c0;

    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    const/16 v20, 0x13

    .line 259
    .line 260
    const/4 v14, 0x1

    .line 261
    const-class v16, La/k3t0;

    .line 262
    .line 263
    const-string v17, "onAction"

    .line 264
    .line 265
    const-string v18, "onAction(Ljava/lang/Object;)V"

    .line 266
    .line 267
    invoke-direct/range {v13 .. v20}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    move-object v2, v13

    .line 274
    :cond_b
    check-cast v2, La/jhy;

    .line 275
    .line 276
    move-object v8, v2

    .line 277
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 278
    .line 279
    new-instance v0, La/cgc0;

    .line 280
    .line 281
    const/4 v2, 0x3

    .line 282
    invoke-direct {v0, v6, v2}, La/cgc0;-><init>(La/igc0;B)V

    .line 283
    .line 284
    .line 285
    const v2, 0x7fabfa0

    .line 286
    .line 287
    .line 288
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    new-instance v0, La/cgc0;

    .line 293
    .line 294
    const/4 v2, 0x4

    .line 295
    invoke-direct {v0, v6, v2}, La/cgc0;-><init>(La/igc0;B)V

    .line 296
    .line 297
    .line 298
    const v2, -0x117cdec1

    .line 299
    .line 300
    .line 301
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    const/16 v12, 0xd80

    .line 306
    .line 307
    move-object v11, v1

    .line 308
    invoke-static/range {v7 .. v12}, La/epv0;->B(La/l7m0;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/fet;I)V

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_c
    move-object v11, v1

    .line 313
    invoke-virtual {v11}, La/fet;->X()V

    .line 314
    .line 315
    .line 316
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_2
    move-object/from16 v0, p1

    .line 320
    .line 321
    check-cast v0, La/fet;

    .line 322
    .line 323
    move-object/from16 v1, p2

    .line 324
    .line 325
    check-cast v1, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    sget-object v1, La/igc0;->V1:La/fl70;

    .line 331
    .line 332
    invoke-static {v5}, La/x8x;->L(I)I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    invoke-virtual {v4, v1, v0}, La/igc0;->G0(ILa/fet;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_3
    move-object/from16 v0, p1

    .line 343
    .line 344
    check-cast v0, La/fet;

    .line 345
    .line 346
    move-object/from16 v1, p2

    .line 347
    .line 348
    check-cast v1, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    sget-object v1, La/igc0;->V1:La/fl70;

    .line 354
    .line 355
    invoke-static {v5}, La/x8x;->L(I)I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-virtual {v4, v1, v0}, La/igc0;->H0(ILa/fet;)V

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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
