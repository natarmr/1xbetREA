.class public final La/ffv0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "La/ffv0;",
        "La/iw5;",
        "<init>",
        "()V",
        "",
        "imageUrl",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic k2:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    const v1, 0x7c224f    # 1.1399909E-38f

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v1, La/mr00;->a:La/zfn;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v4, v2}, La/fet;->c0(La/l5d0;)V

    .line 18
    .line 19
    .line 20
    const v2, -0xe7020e7

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 31
    .line 32
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v7, La/ukd;->a:La/cl5;

    .line 37
    .line 38
    if-ne v2, v7, :cond_0

    .line 39
    .line 40
    invoke-static {v1}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    check-cast v2, La/i1w0;

    .line 48
    .line 49
    const-class v1, La/szi;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v3, La/dy2;->b:La/zfn;

    .line 56
    .line 57
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Landroid/content/Context;

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    instance-of v5, v3, Landroid/app/Application;

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    check-cast v3, Landroid/app/Application;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v3, v8

    .line 76
    :goto_0
    const/4 v9, 0x0

    .line 77
    if-eqz v3, :cond_10

    .line 78
    .line 79
    invoke-static {v4}, La/ms00;->a(La/fet;)La/riu0;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-eqz v5, :cond_f

    .line 84
    .line 85
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-ne v6, v7, :cond_2

    .line 90
    .line 91
    new-instance v6, La/rlb0;

    .line 92
    .line 93
    const/4 v10, 0x4

    .line 94
    invoke-direct {v6, v3, v2, v10}, La/rlb0;-><init>(Landroid/app/Application;La/i1w0;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 101
    .line 102
    invoke-virtual {v4, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    or-int/2addr v2, v3

    .line 111
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const/4 v10, 0x1

    .line 116
    if-nez v2, :cond_3

    .line 117
    .line 118
    if-ne v3, v7, :cond_4

    .line 119
    .line 120
    :cond_3
    new-instance v2, La/ojg;

    .line 121
    .line 122
    invoke-direct {v2, v10}, La/ojg;-><init>(B)V

    .line 123
    .line 124
    .line 125
    new-instance v3, La/zfc;

    .line 126
    .line 127
    const/16 v11, 0xb

    .line 128
    .line 129
    invoke-direct {v3, v6, v11}, La/zfc;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 130
    .line 131
    .line 132
    sget-object v6, La/sre0;->a:La/tre0;

    .line 133
    .line 134
    const-class v11, La/kgd;

    .line 135
    .line 136
    invoke-virtual {v6, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    invoke-virtual {v2, v12, v3}, La/ojg;->a(La/sgy;Lkotlin/jvm/functions/Function1;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, La/ojg;->b()La/qbx;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-interface {v5}, La/riu0;->g()La/piu0;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    sget-object v5, La/vbf;->b:La/vbf;

    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    new-instance v12, La/h0q0;

    .line 160
    .line 161
    invoke-direct {v12, v3, v2, v5}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v12, v2, v1}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    move-object v3, v1

    .line 173
    check-cast v3, La/kgd;

    .line 174
    .line 175
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    check-cast v3, La/kgd;

    .line 179
    .line 180
    iget-object v1, v3, La/kgd;->b:Ljava/lang/Object;

    .line 181
    .line 182
    if-eqz v1, :cond_e

    .line 183
    .line 184
    check-cast v1, La/szi;

    .line 185
    .line 186
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-ne v2, v7, :cond_5

    .line 191
    .line 192
    invoke-virtual {v1}, La/szi;->a()La/fiu0;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_5
    check-cast v2, La/fiu0;

    .line 200
    .line 201
    const-class v1, La/kfv0;

    .line 202
    .line 203
    sget-object v3, La/sre0;->a:La/tre0;

    .line 204
    .line 205
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const/16 v3, 0xe

    .line 210
    .line 211
    invoke-static {v1, v8, v2, v4, v3}, La/n4c;->Y(La/sgy;Ljava/lang/String;La/fiu0;La/fet;I)La/k3t0;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-virtual {v4, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-nez v1, :cond_6

    .line 224
    .line 225
    if-ne v2, v7, :cond_7

    .line 226
    .line 227
    :cond_6
    new-instance v2, La/s9r0;

    .line 228
    .line 229
    const/16 v1, 0xa

    .line 230
    .line 231
    invoke-direct {v2, v11, v1}, La/s9r0;-><init>(La/k3t0;B)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_7
    move-object v1, v2

    .line 238
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 239
    .line 240
    const/4 v5, 0x0

    .line 241
    const/4 v6, 0x6

    .line 242
    const/4 v2, 0x0

    .line 243
    const/4 v3, 0x0

    .line 244
    invoke-static/range {v1 .. v6}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    if-ne v1, v7, :cond_8

    .line 252
    .line 253
    sget-object v1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 254
    .line 255
    invoke-static {v1, v4}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_8
    check-cast v1, La/vne;

    .line 263
    .line 264
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    invoke-virtual {v4, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    or-int/2addr v2, v3

    .line 273
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    if-nez v2, :cond_9

    .line 278
    .line 279
    if-ne v3, v7, :cond_a

    .line 280
    .line 281
    :cond_9
    new-instance v3, La/xis0;

    .line 282
    .line 283
    const/16 v2, 0x1d

    .line 284
    .line 285
    invoke-direct {v3, v0, v11, v2}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 292
    .line 293
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    invoke-virtual {v4, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-virtual {v4, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    or-int/2addr v2, v5

    .line 304
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    or-int/2addr v2, v5

    .line 309
    invoke-virtual {v4, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    or-int/2addr v2, v5

    .line 314
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    if-nez v2, :cond_b

    .line 319
    .line 320
    if-ne v5, v7, :cond_c

    .line 321
    .line 322
    :cond_b
    new-instance v5, La/ggc0;

    .line 323
    .line 324
    const/16 v2, 0x10

    .line 325
    .line 326
    invoke-direct {v5, v1, v11, v3, v2}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 333
    .line 334
    invoke-static {v0, v5, v4}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 335
    .line 336
    .line 337
    check-cast v11, La/i3t0;

    .line 338
    .line 339
    invoke-virtual {v11, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, La/ifv0;

    .line 348
    .line 349
    new-instance v12, La/bw5;

    .line 350
    .line 351
    invoke-static {v10, v4}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    new-instance v1, La/wis0;

    .line 356
    .line 357
    const/4 v2, 0x5

    .line 358
    invoke-direct {v1, v0, v11, v2}, La/wis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 359
    .line 360
    .line 361
    const v0, 0x7bb4390a

    .line 362
    .line 363
    .line 364
    invoke-static {v0, v1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 365
    .line 366
    .line 367
    move-result-object v16

    .line 368
    const/16 v17, 0xe

    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/4 v15, 0x0

    .line 372
    invoke-direct/range {v12 .. v17}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 373
    .line 374
    .line 375
    invoke-static {v4, v9, v9, v9}, La/ohs0;->x(La/fet;ZZZ)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v4, La/fet;->x:La/skx;

    .line 379
    .line 380
    invoke-virtual {v0}, La/skx;->b()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_d

    .line 385
    .line 386
    goto :goto_1

    .line 387
    :cond_d
    move v10, v9

    .line 388
    :goto_1
    iput-boolean v10, v4, La/fet;->w:Z

    .line 389
    .line 390
    iput-object v8, v4, La/fet;->K:La/bh90;

    .line 391
    .line 392
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 393
    .line 394
    .line 395
    return-object v12

    .line 396
    :cond_e
    const-string v0, "null cannot be cast to non-null type org.xplatform.wild_free_bet.impl.di.WildFreeBetComponent"

    .line 397
    .line 398
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-object v8

    .line 402
    :cond_f
    new-instance v0, La/tiu0;

    .line 403
    .line 404
    invoke-direct {v0}, La/tiu0;-><init>()V

    .line 405
    .line 406
    .line 407
    throw v0

    .line 408
    :cond_10
    new-instance v0, La/ss3;

    .line 409
    .line 410
    invoke-direct {v0, v9}, La/ss3;-><init>(B)V

    .line 411
    .line 412
    .line 413
    throw v0
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
