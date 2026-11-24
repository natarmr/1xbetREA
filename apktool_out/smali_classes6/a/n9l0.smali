.class public final synthetic La/n9l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/i3n;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/i3n;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/n9l0;->a:B

    iput-object p1, p0, La/n9l0;->b:La/mm40;

    iput-object p2, p0, La/n9l0;->c:La/i3n;

    iput-object p3, p0, La/n9l0;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n9l0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/n9l0;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iget-object v5, v0, La/n9l0;->c:La/i3n;

    .line 10
    .line 11
    iget-object v0, v0, La/n9l0;->b:La/mm40;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v12, p1

    .line 18
    .line 19
    check-cast v12, La/fet;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v7, v1, 0x3

    .line 30
    .line 31
    if-eq v7, v2, :cond_0

    .line 32
    .line 33
    move v2, v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v3

    .line 36
    :goto_0
    and-int/2addr v1, v6

    .line 37
    invoke-virtual {v12, v1, v2}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_5

    .line 42
    .line 43
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 44
    .line 45
    sget-object v2, La/uc9;->a:La/lw3;

    .line 46
    .line 47
    const/16 v7, 0x30

    .line 48
    .line 49
    invoke-static {v2, v1, v12, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-wide v8, v12, La/fet;->T:J

    .line 54
    .line 55
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-static {v12, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v12}, La/fet;->i0()V

    .line 73
    .line 74
    .line 75
    iget-boolean v9, v12, La/fet;->S:Z

    .line 76
    .line 77
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 78
    .line 79
    if-eqz v9, :cond_1

    .line 80
    .line 81
    invoke-virtual {v12, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v12}, La/fet;->r0()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v9, La/gqw0;->x:La/shd;

    .line 89
    .line 90
    invoke-static {v12, v1, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    sget-object v1, La/gqw0;->w:La/shd;

    .line 94
    .line 95
    invoke-static {v12, v8, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    sget-object v8, La/gqw0;->y:La/shd;

    .line 103
    .line 104
    invoke-static {v12, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 108
    .line 109
    .line 110
    sget-object v2, La/gqw0;->v:La/shd;

    .line 111
    .line 112
    invoke-static {v12, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v11, La/ukd;->a:La/cl5;

    .line 120
    .line 121
    if-ne v0, v11, :cond_2

    .line 122
    .line 123
    new-instance v0, La/x7z;

    .line 124
    .line 125
    const/high16 v11, 0x3f800000    # 1.0f

    .line 126
    .line 127
    invoke-direct {v0, v11, v6}, La/x7z;-><init>(FZ)V

    .line 128
    .line 129
    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v13, 0x3

    .line 132
    invoke-static {v0, v11, v3, v13}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v12, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    check-cast v0, La/mm40;

    .line 140
    .line 141
    iget-object v11, v5, La/i3n;->d:La/nal0;

    .line 142
    .line 143
    const/4 v14, 0x6

    .line 144
    invoke-static {v0, v11, v4, v12, v14}, La/k7x;->u(La/mm40;La/oal0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 145
    .line 146
    .line 147
    sget-object v11, La/qmk;->a:La/zcl;

    .line 148
    .line 149
    new-instance v11, La/qw3;

    .line 150
    .line 151
    new-instance v13, La/jf4;

    .line 152
    .line 153
    const/16 v15, 0xe

    .line 154
    .line 155
    invoke-direct {v13, v15}, La/jf4;-><init>(B)V

    .line 156
    .line 157
    .line 158
    const/high16 v15, 0x41000000    # 8.0f

    .line 159
    .line 160
    invoke-direct {v11, v15, v6, v13}, La/qw3;-><init>(FZLa/rw3;)V

    .line 161
    .line 162
    .line 163
    sget-object v13, La/gqw0;->n:La/xx7;

    .line 164
    .line 165
    invoke-static {v11, v13, v12, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    move-object/from16 v16, v4

    .line 170
    .line 171
    iget-wide v3, v12, La/fet;->T:J

    .line 172
    .line 173
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-static {v12, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-virtual {v12}, La/fet;->i0()V

    .line 186
    .line 187
    .line 188
    iget-boolean v13, v12, La/fet;->S:Z

    .line 189
    .line 190
    if-eqz v13, :cond_3

    .line 191
    .line 192
    invoke-virtual {v12, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_3
    invoke-virtual {v12}, La/fet;->r0()V

    .line 197
    .line 198
    .line 199
    :goto_2
    invoke-static {v12, v7, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v12, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v3, v12, v8, v12}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v12, v11, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    iget-object v1, v5, La/i3n;->f:La/x9l0;

    .line 212
    .line 213
    invoke-static {v1, v12, v14}, La/g1x;->m(La/x9l0;La/fet;I)V

    .line 214
    .line 215
    .line 216
    iget-object v1, v5, La/i3n;->b:La/qal0;

    .line 217
    .line 218
    if-nez v1, :cond_4

    .line 219
    .line 220
    const v1, -0x1cce7de3

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 224
    .line 225
    .line 226
    const/4 v15, 0x0

    .line 227
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_4
    const v2, -0x1cce7de2

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v2}, La/fet;->e0(I)V

    .line 235
    .line 236
    .line 237
    new-instance v2, La/ygd;

    .line 238
    .line 239
    const/4 v3, 0x4

    .line 240
    invoke-direct {v2, v1, v3}, La/ygd;-><init>(La/qal0;B)V

    .line 241
    .line 242
    .line 243
    const v3, 0x13b66219    # 4.603999E-27f

    .line 244
    .line 245
    .line 246
    invoke-static {v3, v2, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    new-instance v2, La/ygd;

    .line 251
    .line 252
    const/4 v3, 0x5

    .line 253
    invoke-direct {v2, v1, v3}, La/ygd;-><init>(La/qal0;B)V

    .line 254
    .line 255
    .line 256
    const v3, 0x7b7d37a0

    .line 257
    .line 258
    .line 259
    invoke-static {v3, v2, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    new-instance v2, La/ygd;

    .line 264
    .line 265
    invoke-direct {v2, v1, v14}, La/ygd;-><init>(La/qal0;B)V

    .line 266
    .line 267
    .line 268
    const v3, 0x1683aa3f

    .line 269
    .line 270
    .line 271
    invoke-static {v3, v2, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    new-instance v2, La/ygd;

    .line 276
    .line 277
    const/4 v3, 0x7

    .line 278
    invoke-direct {v2, v1, v3}, La/ygd;-><init>(La/qal0;B)V

    .line 279
    .line 280
    .line 281
    const v1, -0x4e75e322

    .line 282
    .line 283
    .line 284
    invoke-static {v1, v2, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    const/16 v13, 0x6db0

    .line 289
    .line 290
    const/4 v7, 0x0

    .line 291
    invoke-static/range {v7 .. v13}, La/c3x;->n(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 292
    .line 293
    .line 294
    const/4 v15, 0x0

    .line 295
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 296
    .line 297
    .line 298
    :goto_3
    invoke-virtual {v12, v6}, La/fet;->r(Z)V

    .line 299
    .line 300
    .line 301
    iget-object v1, v5, La/i3n;->e:La/nal0;

    .line 302
    .line 303
    move-object/from16 v3, v16

    .line 304
    .line 305
    invoke-static {v0, v1, v3, v12, v14}, La/k7x;->u(La/mm40;La/oal0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v6}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 313
    .line 314
    .line 315
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_0
    move v15, v3

    .line 319
    move-object v3, v4

    .line 320
    move-object/from16 v1, p1

    .line 321
    .line 322
    check-cast v1, La/fet;

    .line 323
    .line 324
    move-object/from16 v4, p2

    .line 325
    .line 326
    check-cast v4, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    and-int/lit8 v7, v4, 0x3

    .line 333
    .line 334
    if-eq v7, v2, :cond_6

    .line 335
    .line 336
    move v15, v6

    .line 337
    :cond_6
    and-int/lit8 v2, v4, 0x1

    .line 338
    .line 339
    invoke-virtual {v1, v2, v15}, La/fet;->U(IZ)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_7

    .line 344
    .line 345
    sget-object v2, La/gap;->a:La/zfn;

    .line 346
    .line 347
    sget-object v4, La/bmd;->n:La/zfn;

    .line 348
    .line 349
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    invoke-virtual {v2, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    new-instance v4, La/n9l0;

    .line 358
    .line 359
    invoke-direct {v4, v0, v5, v3, v6}, La/n9l0;-><init>(La/mm40;La/i3n;Lkotlin/jvm/functions/Function2;B)V

    .line 360
    .line 361
    .line 362
    const v0, 0x1a2a5a0b

    .line 363
    .line 364
    .line 365
    invoke-static {v0, v4, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    const/16 v3, 0x38

    .line 370
    .line 371
    invoke-static {v2, v0, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 376
    .line 377
    .line 378
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
