.class public final synthetic La/ai2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:F

.field public final synthetic e:La/bch0;

.field public final synthetic f:La/pz40;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZFLa/bch0;La/pz40;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/ai2;->a:B

    iput-object p1, p0, La/ai2;->b:La/mm40;

    iput-boolean p2, p0, La/ai2;->c:Z

    iput p3, p0, La/ai2;->d:F

    iput-object p4, p0, La/ai2;->e:La/bch0;

    iput-object p5, p0, La/ai2;->f:La/pz40;

    iput-object p6, p0, La/ai2;->g:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ai2;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41c00000    # 24.0f

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    iget-object v5, v0, La/ai2;->g:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v6, v0, La/ai2;->f:La/pz40;

    .line 14
    .line 15
    iget-object v7, v0, La/ai2;->e:La/bch0;

    .line 16
    .line 17
    iget v8, v0, La/ai2;->d:F

    .line 18
    .line 19
    iget-boolean v9, v0, La/ai2;->c:Z

    .line 20
    .line 21
    iget-object v0, v0, La/ai2;->b:La/mm40;

    .line 22
    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v11, 0x0

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object v14, v7

    .line 29
    check-cast v14, La/d9z;

    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, La/ir8;

    .line 34
    .line 35
    move-object/from16 v7, p2

    .line 36
    .line 37
    check-cast v7, La/fet;

    .line 38
    .line 39
    move-object/from16 v12, p3

    .line 40
    .line 41
    check-cast v12, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    and-int/lit8 v1, v12, 0x11

    .line 51
    .line 52
    if-eq v1, v4, :cond_0

    .line 53
    .line 54
    move v1, v10

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v1, v11

    .line 57
    :goto_0
    and-int/lit8 v4, v12, 0x1

    .line 58
    .line 59
    invoke-virtual {v7, v4, v1}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 66
    .line 67
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    xor-int/lit8 v19, v9, 0x1

    .line 72
    .line 73
    new-instance v12, La/ngv;

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    invoke-direct {v12, v0}, La/ngv;-><init>(I)V

    .line 77
    .line 78
    .line 79
    sget-object v0, La/qmk;->a:La/zcl;

    .line 80
    .line 81
    new-instance v0, La/qw3;

    .line 82
    .line 83
    new-instance v1, La/jf4;

    .line 84
    .line 85
    const/16 v4, 0xe

    .line 86
    .line 87
    invoke-direct {v1, v4}, La/jf4;-><init>(B)V

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41000000    # 8.0f

    .line 91
    .line 92
    invoke-direct {v0, v4, v10, v1}, La/qw3;-><init>(FZLa/rw3;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v7}, La/xfn;->a(La/fet;)La/wfn;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget v1, v1, La/wfn;->d:F

    .line 100
    .line 101
    invoke-static {v7}, La/xfn;->a(La/fet;)La/wfn;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget v4, v4, La/wfn;->d:F

    .line 106
    .line 107
    invoke-static {v1, v8, v4, v3, v7}, La/h97;->f(FFFFLa/fet;)La/ch80;

    .line 108
    .line 109
    .line 110
    move-result-object v15

    .line 111
    invoke-virtual {v7, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {v7, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    or-int/2addr v1, v3

    .line 120
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-nez v1, :cond_1

    .line 125
    .line 126
    if-ne v3, v2, :cond_2

    .line 127
    .line 128
    :cond_1
    new-instance v3, La/jg2;

    .line 129
    .line 130
    invoke-direct {v3, v6, v5, v11}, La/jg2;-><init>(La/pz40;Lkotlin/jvm/functions/Function1;B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    move-object/from16 v21, v3

    .line 137
    .line 138
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    const/16 v23, 0x0

    .line 141
    .line 142
    const/16 v24, 0x2b0

    .line 143
    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v20, 0x0

    .line 149
    .line 150
    move-object/from16 v17, v0

    .line 151
    .line 152
    move-object/from16 v22, v7

    .line 153
    .line 154
    invoke-static/range {v12 .. v24}, La/g8x;->i(La/ngv;La/mm40;La/d9z;La/hh80;La/sw3;La/ow3;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    move-object/from16 v22, v7

    .line 159
    .line 160
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 161
    .line 162
    .line 163
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_0
    check-cast v7, La/xcz;

    .line 167
    .line 168
    move-object/from16 v1, p1

    .line 169
    .line 170
    check-cast v1, La/ir8;

    .line 171
    .line 172
    move v12, v10

    .line 173
    move-object/from16 v10, p2

    .line 174
    .line 175
    check-cast v10, La/fet;

    .line 176
    .line 177
    move-object/from16 v13, p3

    .line 178
    .line 179
    check-cast v13, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    and-int/lit8 v1, v13, 0x11

    .line 189
    .line 190
    if-eq v1, v4, :cond_4

    .line 191
    .line 192
    move v11, v12

    .line 193
    :cond_4
    and-int/lit8 v1, v13, 0x1

    .line 194
    .line 195
    invoke-virtual {v10, v1, v11}, La/fet;->U(IZ)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 202
    .line 203
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    move-object v0, v7

    .line 208
    xor-int/lit8 v7, v9, 0x1

    .line 209
    .line 210
    sget-object v4, La/qmk;->a:La/zcl;

    .line 211
    .line 212
    invoke-static {v10}, La/xfn;->a(La/fet;)La/wfn;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    iget v4, v4, La/wfn;->d:F

    .line 217
    .line 218
    invoke-static {v10}, La/xfn;->a(La/fet;)La/wfn;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    iget v9, v9, La/wfn;->d:F

    .line 223
    .line 224
    invoke-static {v4, v8, v9, v3, v10}, La/h97;->f(FFFFLa/fet;)La/ch80;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v10, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    or-int/2addr v4, v8

    .line 237
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    if-nez v4, :cond_5

    .line 242
    .line 243
    if-ne v8, v2, :cond_6

    .line 244
    .line 245
    :cond_5
    new-instance v8, La/jg2;

    .line 246
    .line 247
    const/4 v2, 0x3

    .line 248
    invoke-direct {v8, v6, v5, v2}, La/jg2;-><init>(La/pz40;Lkotlin/jvm/functions/Function1;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_6
    move-object v9, v8

    .line 255
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    const/16 v12, 0x178

    .line 259
    .line 260
    const/4 v4, 0x0

    .line 261
    const/4 v5, 0x0

    .line 262
    const/4 v6, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    move-object v2, v0

    .line 265
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_7
    invoke-virtual {v10}, La/fet;->X()V

    .line 270
    .line 271
    .line 272
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_1
    move v12, v10

    .line 276
    check-cast v7, La/xcz;

    .line 277
    .line 278
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, La/ir8;

    .line 281
    .line 282
    move-object/from16 v10, p2

    .line 283
    .line 284
    check-cast v10, La/fet;

    .line 285
    .line 286
    move-object/from16 v13, p3

    .line 287
    .line 288
    check-cast v13, Ljava/lang/Integer;

    .line 289
    .line 290
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 291
    .line 292
    .line 293
    move-result v13

    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    and-int/lit8 v1, v13, 0x11

    .line 298
    .line 299
    if-eq v1, v4, :cond_8

    .line 300
    .line 301
    move v11, v12

    .line 302
    :cond_8
    and-int/lit8 v1, v13, 0x1

    .line 303
    .line 304
    invoke-virtual {v10, v1, v11}, La/fet;->U(IZ)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_b

    .line 309
    .line 310
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 311
    .line 312
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    const-string v1, "ALT_FAVORITE_SPORT_TEAMS_LAZY_ROW"

    .line 317
    .line 318
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    xor-int/lit8 v0, v9, 0x1

    .line 323
    .line 324
    sget-object v4, La/qmk;->a:La/zcl;

    .line 325
    .line 326
    invoke-static {v10}, La/xfn;->a(La/fet;)La/wfn;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    iget v4, v4, La/wfn;->d:F

    .line 331
    .line 332
    invoke-static {v10}, La/xfn;->a(La/fet;)La/wfn;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    iget v9, v9, La/wfn;->d:F

    .line 337
    .line 338
    invoke-static {v4, v8, v9, v3, v10}, La/h97;->f(FFFFLa/fet;)La/ch80;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v10, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    or-int/2addr v4, v8

    .line 351
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    if-nez v4, :cond_9

    .line 356
    .line 357
    if-ne v8, v2, :cond_a

    .line 358
    .line 359
    :cond_9
    new-instance v8, La/jg2;

    .line 360
    .line 361
    invoke-direct {v8, v6, v5, v12}, La/jg2;-><init>(La/pz40;Lkotlin/jvm/functions/Function1;B)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    :cond_a
    move-object v9, v8

    .line 368
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 369
    .line 370
    const/4 v11, 0x0

    .line 371
    const/16 v12, 0x178

    .line 372
    .line 373
    const/4 v4, 0x0

    .line 374
    const/4 v5, 0x0

    .line 375
    const/4 v6, 0x0

    .line 376
    const/4 v8, 0x0

    .line 377
    move-object v2, v7

    .line 378
    move v7, v0

    .line 379
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 380
    .line 381
    .line 382
    goto :goto_3

    .line 383
    :cond_b
    invoke-virtual {v10}, La/fet;->X()V

    .line 384
    .line 385
    .line 386
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
