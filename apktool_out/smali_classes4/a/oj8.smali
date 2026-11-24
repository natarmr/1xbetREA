.class public final synthetic La/oj8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qj8;


# direct methods
.method public synthetic constructor <init>(La/qj8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oj8;->a:B

    iput-object p1, p0, La/oj8;->b:La/qj8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oj8;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41000000    # 8.0f

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0x10

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v0, v0, La/oj8;->b:La/qj8;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/g9z;

    .line 23
    .line 24
    move-object/from16 v14, p2

    .line 25
    .line 26
    check-cast v14, La/fet;

    .line 27
    .line 28
    move-object/from16 v8, p3

    .line 29
    .line 30
    check-cast v8, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v8, 0x11

    .line 40
    .line 41
    if-eq v1, v6, :cond_0

    .line 42
    .line 43
    move v5, v7

    .line 44
    :cond_0
    and-int/lit8 v1, v8, 0x1

    .line 45
    .line 46
    invoke-virtual {v14, v1, v5}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v3, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-static {v1, v2, v4, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    iget-object v9, v0, La/qj8;->d:La/jjm;

    .line 65
    .line 66
    sget-object v10, La/kjm;->a:La/kjm;

    .line 67
    .line 68
    const/16 v15, 0x180

    .line 69
    .line 70
    const/16 v16, 0x38

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    invoke-static/range {v8 .. v16}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v14}, La/fet;->X()V

    .line 80
    .line 81
    .line 82
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_0
    move-object/from16 v1, p1

    .line 86
    .line 87
    check-cast v1, La/g9z;

    .line 88
    .line 89
    move-object/from16 v8, p2

    .line 90
    .line 91
    check-cast v8, La/fet;

    .line 92
    .line 93
    move-object/from16 v9, p3

    .line 94
    .line 95
    check-cast v9, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    and-int/lit8 v1, v9, 0x11

    .line 105
    .line 106
    if-eq v1, v6, :cond_2

    .line 107
    .line 108
    move v1, v7

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move v1, v5

    .line 111
    :goto_1
    and-int/lit8 v6, v9, 0x1

    .line 112
    .line 113
    invoke-virtual {v8, v6, v1}, La/fet;->U(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    sget-object v1, La/uc9;->c:La/mw3;

    .line 120
    .line 121
    sget-object v6, La/gqw0;->m:La/xx7;

    .line 122
    .line 123
    invoke-static {v1, v6, v8, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-wide v9, v8, La/fet;->T:J

    .line 128
    .line 129
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-static {v8, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 142
    .line 143
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, La/fet;->i0()V

    .line 147
    .line 148
    .line 149
    iget-boolean v11, v8, La/fet;->S:Z

    .line 150
    .line 151
    if-eqz v11, :cond_3

    .line 152
    .line 153
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 154
    .line 155
    invoke-virtual {v8, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    invoke-virtual {v8}, La/fet;->r0()V

    .line 160
    .line 161
    .line 162
    :goto_2
    sget-object v11, La/gqw0;->x:La/shd;

    .line 163
    .line 164
    invoke-static {v8, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    sget-object v1, La/gqw0;->w:La/shd;

    .line 168
    .line 169
    invoke-static {v8, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    sget-object v6, La/gqw0;->y:La/shd;

    .line 177
    .line 178
    invoke-static {v8, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 182
    .line 183
    .line 184
    sget-object v1, La/gqw0;->v:La/shd;

    .line 185
    .line 186
    invoke-static {v8, v10, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    iget-boolean v1, v0, La/qj8;->b:Z

    .line 190
    .line 191
    if-eqz v1, :cond_4

    .line 192
    .line 193
    const v0, -0x763da0c4

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v1, La/qmk;->a:La/zcl;

    .line 204
    .line 205
    const/high16 v1, 0x42840000    # 66.0f

    .line 206
    .line 207
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, La/qmk;->i:La/zcl;

    .line 212
    .line 213
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 214
    .line 215
    invoke-static {v1, v1, v1, v1, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const/4 v1, 0x0

    .line 220
    invoke-static {v1, v8, v5, v7}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v0, v1}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v5, v8, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v4, v2, v8, v5}, La/rz4;->t(La/jm40;FLa/fet;Z)V

    .line 232
    .line 233
    .line 234
    move-object v0, v8

    .line 235
    goto/16 :goto_3

    .line 236
    .line 237
    :cond_4
    iget-object v1, v0, La/qj8;->c:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-lez v1, :cond_5

    .line 244
    .line 245
    const v1, -0x7636427d

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 249
    .line 250
    .line 251
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 256
    .line 257
    invoke-virtual {v8, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 262
    .line 263
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 264
    .line 265
    .line 266
    move-result-wide v9

    .line 267
    sget-object v6, La/qmk;->i:La/zcl;

    .line 268
    .line 269
    sget-object v11, La/vgg0;->a:La/ugg0;

    .line 270
    .line 271
    new-instance v11, La/ugg0;

    .line 272
    .line 273
    invoke-direct {v11, v6, v6, v6, v6}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v1, v9, v10, v11}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    const/high16 v6, 0x41400000    # 12.0f

    .line 281
    .line 282
    invoke-static {v1, v6}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    iget-object v0, v0, La/qj8;->c:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v8, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 293
    .line 294
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 295
    .line 296
    .line 297
    move-result-wide v10

    .line 298
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 299
    .line 300
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    check-cast v1, La/g1t0;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 310
    .line 311
    .line 312
    move-result-object v28

    .line 313
    const/16 v31, 0x0

    .line 314
    .line 315
    const v32, 0x1fff8

    .line 316
    .line 317
    .line 318
    const/4 v12, 0x0

    .line 319
    const-wide/16 v13, 0x0

    .line 320
    .line 321
    const/4 v15, 0x0

    .line 322
    const/16 v16, 0x0

    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    const-wide/16 v18, 0x0

    .line 327
    .line 328
    const/16 v20, 0x0

    .line 329
    .line 330
    const-wide/16 v21, 0x0

    .line 331
    .line 332
    const/16 v23, 0x0

    .line 333
    .line 334
    const/16 v24, 0x0

    .line 335
    .line 336
    const/16 v25, 0x0

    .line 337
    .line 338
    const/16 v26, 0x0

    .line 339
    .line 340
    const/16 v27, 0x0

    .line 341
    .line 342
    const/16 v30, 0x0

    .line 343
    .line 344
    move-object/from16 v29, v8

    .line 345
    .line 346
    move-object v8, v0

    .line 347
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 348
    .line 349
    .line 350
    move-object/from16 v0, v29

    .line 351
    .line 352
    invoke-static {v4, v2, v0, v5}, La/rz4;->t(La/jm40;FLa/fet;Z)V

    .line 353
    .line 354
    .line 355
    goto :goto_3

    .line 356
    :cond_5
    move-object v0, v8

    .line 357
    const v1, -0x762b2e1c

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 364
    .line 365
    .line 366
    :goto_3
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 367
    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_6
    move-object v0, v8

    .line 371
    invoke-virtual {v0}, La/fet;->X()V

    .line 372
    .line 373
    .line 374
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
