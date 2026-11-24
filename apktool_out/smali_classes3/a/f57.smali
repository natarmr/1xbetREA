.class public final synthetic La/f57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xcz;

.field public final synthetic c:La/z77;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BLa/z77;La/xcz;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/f57;->a:B

    iput-object p3, p0, La/f57;->b:La/xcz;

    iput-object p2, p0, La/f57;->c:La/z77;

    iput-object p4, p0, La/f57;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f57;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x42000000    # 32.0f

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/16 v4, 0xe

    .line 10
    .line 11
    const/high16 v5, 0x41000000    # 8.0f

    .line 12
    .line 13
    const/high16 v6, 0x41400000    # 12.0f

    .line 14
    .line 15
    const/high16 v7, 0x3f800000    # 1.0f

    .line 16
    .line 17
    sget-object v8, La/jm40;->b:La/jm40;

    .line 18
    .line 19
    const/4 v9, 0x2

    .line 20
    iget-object v10, v0, La/f57;->d:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    iget-object v11, v0, La/f57;->c:La/z77;

    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    const/4 v13, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/fet;

    .line 32
    .line 33
    move-object/from16 v14, p2

    .line 34
    .line 35
    check-cast v14, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v14

    .line 41
    and-int/lit8 v15, v14, 0x3

    .line 42
    .line 43
    if-eq v15, v9, :cond_0

    .line 44
    .line 45
    move v13, v12

    .line 46
    :cond_0
    and-int/lit8 v9, v14, 0x1

    .line 47
    .line 48
    invoke-virtual {v1, v9, v13}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_3

    .line 53
    .line 54
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v14

    .line 58
    sget-object v7, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    iget v7, v7, La/wfn;->d:F

    .line 65
    .line 66
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    iget v8, v8, La/wfn;->d:F

    .line 71
    .line 72
    new-instance v9, La/lh80;

    .line 73
    .line 74
    invoke-direct {v9, v7, v6, v8, v2}, La/lh80;-><init>(FFFF)V

    .line 75
    .line 76
    .line 77
    new-instance v2, La/qw3;

    .line 78
    .line 79
    new-instance v6, La/jf4;

    .line 80
    .line 81
    invoke-direct {v6, v4}, La/jf4;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v5, v12, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    or-int/2addr v4, v5

    .line 96
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-nez v4, :cond_1

    .line 101
    .line 102
    if-ne v5, v3, :cond_2

    .line 103
    .line 104
    :cond_1
    new-instance v5, La/g57;

    .line 105
    .line 106
    const/4 v3, 0x3

    .line 107
    invoke-direct {v5, v11, v10, v3}, La/g57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    move-object/from16 v22, v5

    .line 114
    .line 115
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    const/16 v24, 0x6

    .line 118
    .line 119
    const/16 v25, 0x1e8

    .line 120
    .line 121
    iget-object v15, v0, La/f57;->b:La/xcz;

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    move-object/from16 v23, v1

    .line 132
    .line 133
    move-object/from16 v17, v2

    .line 134
    .line 135
    move-object/from16 v16, v9

    .line 136
    .line 137
    invoke-static/range {v14 .. v25}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_3
    move-object/from16 v23, v1

    .line 142
    .line 143
    invoke-virtual/range {v23 .. v23}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_0
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, La/fet;

    .line 152
    .line 153
    move-object/from16 v2, p2

    .line 154
    .line 155
    check-cast v2, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    and-int/lit8 v14, v2, 0x3

    .line 162
    .line 163
    if-eq v14, v9, :cond_4

    .line 164
    .line 165
    move v13, v12

    .line 166
    :cond_4
    and-int/2addr v2, v12

    .line 167
    invoke-virtual {v1, v2, v13}, La/fet;->U(IZ)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_7

    .line 172
    .line 173
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    sget-object v7, La/qmk;->a:La/zcl;

    .line 178
    .line 179
    invoke-static {v1}, La/qmk;->a(La/fet;)La/wfn;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    iget v7, v7, La/wfn;->d:F

    .line 184
    .line 185
    invoke-static {v1}, La/qmk;->a(La/fet;)La/wfn;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    iget v8, v8, La/wfn;->d:F

    .line 190
    .line 191
    new-instance v9, La/lh80;

    .line 192
    .line 193
    const/high16 v13, 0x41c00000    # 24.0f

    .line 194
    .line 195
    invoke-direct {v9, v7, v6, v8, v13}, La/lh80;-><init>(FFFF)V

    .line 196
    .line 197
    .line 198
    new-instance v6, La/qw3;

    .line 199
    .line 200
    new-instance v7, La/jf4;

    .line 201
    .line 202
    invoke-direct {v7, v4}, La/jf4;-><init>(B)V

    .line 203
    .line 204
    .line 205
    invoke-direct {v6, v5, v12, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    or-int/2addr v4, v5

    .line 217
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    if-nez v4, :cond_5

    .line 222
    .line 223
    if-ne v5, v3, :cond_6

    .line 224
    .line 225
    :cond_5
    new-instance v5, La/g57;

    .line 226
    .line 227
    invoke-direct {v5, v11, v10, v12}, La/g57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 234
    .line 235
    const/4 v11, 0x6

    .line 236
    const/16 v12, 0x1e8

    .line 237
    .line 238
    move-object v10, v1

    .line 239
    move-object v1, v2

    .line 240
    iget-object v2, v0, La/f57;->b:La/xcz;

    .line 241
    .line 242
    move-object v3, v9

    .line 243
    move-object v9, v5

    .line 244
    const/4 v5, 0x0

    .line 245
    move-object v4, v6

    .line 246
    const/4 v6, 0x0

    .line 247
    const/4 v7, 0x0

    .line 248
    const/4 v8, 0x0

    .line 249
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 250
    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_7
    move-object v10, v1

    .line 254
    invoke-virtual {v10}, La/fet;->X()V

    .line 255
    .line 256
    .line 257
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_1
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/fet;

    .line 263
    .line 264
    move-object/from16 v14, p2

    .line 265
    .line 266
    check-cast v14, Ljava/lang/Integer;

    .line 267
    .line 268
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v14

    .line 272
    and-int/lit8 v15, v14, 0x3

    .line 273
    .line 274
    if-eq v15, v9, :cond_8

    .line 275
    .line 276
    move v9, v12

    .line 277
    goto :goto_2

    .line 278
    :cond_8
    move v9, v13

    .line 279
    :goto_2
    and-int/2addr v14, v12

    .line 280
    invoke-virtual {v1, v14, v9}, La/fet;->U(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-eqz v9, :cond_b

    .line 285
    .line 286
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    sget-object v8, La/qmk;->a:La/zcl;

    .line 291
    .line 292
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    iget v8, v8, La/wfn;->d:F

    .line 297
    .line 298
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    iget v9, v9, La/wfn;->d:F

    .line 303
    .line 304
    new-instance v14, La/lh80;

    .line 305
    .line 306
    invoke-direct {v14, v8, v6, v9, v2}, La/lh80;-><init>(FFFF)V

    .line 307
    .line 308
    .line 309
    new-instance v2, La/qw3;

    .line 310
    .line 311
    new-instance v6, La/jf4;

    .line 312
    .line 313
    invoke-direct {v6, v4}, La/jf4;-><init>(B)V

    .line 314
    .line 315
    .line 316
    invoke-direct {v2, v5, v12, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    or-int/2addr v4, v5

    .line 328
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    if-nez v4, :cond_9

    .line 333
    .line 334
    if-ne v5, v3, :cond_a

    .line 335
    .line 336
    :cond_9
    new-instance v5, La/g57;

    .line 337
    .line 338
    invoke-direct {v5, v11, v10, v13}, La/g57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_a
    move-object v9, v5

    .line 345
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 346
    .line 347
    const/4 v11, 0x6

    .line 348
    const/16 v12, 0x1e8

    .line 349
    .line 350
    iget-object v0, v0, La/f57;->b:La/xcz;

    .line 351
    .line 352
    const/4 v5, 0x0

    .line 353
    const/4 v6, 0x0

    .line 354
    move-object v10, v1

    .line 355
    move-object v1, v7

    .line 356
    const/4 v7, 0x0

    .line 357
    const/4 v8, 0x0

    .line 358
    move-object v4, v2

    .line 359
    move-object v3, v14

    .line 360
    move-object v2, v0

    .line 361
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 362
    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_b
    move-object v10, v1

    .line 366
    invoke-virtual {v10}, La/fet;->X()V

    .line 367
    .line 368
    .line 369
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
