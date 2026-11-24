.class public final La/vq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/yzn0;

.field public final b:La/ctf0;

.field public final c:La/x20;

.field public final d:La/mii0;

.field public final e:La/ouu;

.field public final f:La/wdk0;

.field public final g:La/j9c;

.field public final h:La/vqc;

.field public final i:La/r9u;

.field public final j:Ljava/util/List;


# direct methods
.method public constructor <init>(La/yzn0;La/ctf0;La/x20;La/mii0;La/ouu;La/wdk0;La/j9c;La/vqc;La/r9u;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/vq;->a:La/yzn0;

    .line 14
    .line 15
    iput-object p2, p0, La/vq;->b:La/ctf0;

    .line 16
    .line 17
    iput-object p3, p0, La/vq;->c:La/x20;

    .line 18
    .line 19
    iput-object p4, p0, La/vq;->d:La/mii0;

    .line 20
    .line 21
    iput-object p5, p0, La/vq;->e:La/ouu;

    .line 22
    .line 23
    iput-object p6, p0, La/vq;->f:La/wdk0;

    .line 24
    .line 25
    iput-object p7, p0, La/vq;->g:La/j9c;

    .line 26
    .line 27
    iput-object p8, p0, La/vq;->h:La/vqc;

    .line 28
    .line 29
    iput-object p9, p0, La/vq;->i:La/r9u;

    .line 30
    .line 31
    sget-object p1, La/q4f;->c:La/q4f;

    .line 32
    .line 33
    sget-object p2, La/q4f;->d:La/q4f;

    .line 34
    .line 35
    sget-object p3, La/q4f;->e:La/q4f;

    .line 36
    .line 37
    sget-object p4, La/q4f;->i:La/q4f;

    .line 38
    .line 39
    sget-object p5, La/q4f;->b:La/q4f;

    .line 40
    .line 41
    filled-new-array {p1, p2, p3, p4, p5}, [La/q4f;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, La/vq;->j:Ljava/util/List;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/Fragment;La/aud;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ctc;ZLa/ms2;JLjava/lang/String;)La/yq;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v9, p4

    .line 6
    .line 7
    move-object/from16 v10, p6

    .line 8
    .line 9
    iget-object v11, v0, La/vq;->a:La/yzn0;

    .line 10
    .line 11
    iget-object v2, v11, La/yzn0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/ii;

    .line 14
    .line 15
    iget-object v3, v11, La/yzn0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/ctf0;

    .line 18
    .line 19
    sget-object v12, La/qek0;->a:La/qek0;

    .line 20
    .line 21
    sget-object v13, La/jtv;->a:La/jtv;

    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    instance-of v4, v1, La/ttd;

    .line 39
    .line 40
    iget-object v14, v0, La/vq;->g:La/j9c;

    .line 41
    .line 42
    iget-object v15, v0, La/vq;->j:Ljava/util/List;

    .line 43
    .line 44
    iget-object v5, v0, La/vq;->b:La/ctf0;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    move-object v13, v1

    .line 50
    check-cast v13, La/ttd;

    .line 51
    .line 52
    if-eqz p7, :cond_0

    .line 53
    .line 54
    iget-wide v1, v13, La/ttd;->a:J

    .line 55
    .line 56
    iget-wide v3, v13, La/ttd;->b:J

    .line 57
    .line 58
    move-object/from16 v7, p8

    .line 59
    .line 60
    move-object/from16 v8, p11

    .line 61
    .line 62
    move-object/from16 v16, v11

    .line 63
    .line 64
    move-object/from16 v17, v12

    .line 65
    .line 66
    move-object v11, v5

    .line 67
    move v12, v6

    .line 68
    move-wide/from16 v5, p9

    .line 69
    .line 70
    invoke-virtual/range {v0 .. v8}, La/vq;->c(JJJLa/ms2;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    move-object/from16 v16, v11

    .line 75
    .line 76
    move-object/from16 v17, v12

    .line 77
    .line 78
    move-object v11, v5

    .line 79
    move v12, v6

    .line 80
    :goto_0
    invoke-virtual {v14}, La/j9c;->a()La/q4f;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {v15, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-wide v2, v13, La/ttd;->c:J

    .line 89
    .line 90
    iget-object v4, v13, La/ttd;->d:Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v18

    .line 98
    iget-object v1, v13, La/ttd;->e:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v2, v13, La/ttd;->f:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, v13, La/ttd;->g:Ljava/lang/String;

    .line 103
    .line 104
    sget-object v5, La/jvn;->a:La/pek;

    .line 105
    .line 106
    iget-byte v6, v13, La/ttd;->i:B

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {v6}, La/pek;->k(I)La/jvn;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget-wide v6, v13, La/ttd;->h:D

    .line 116
    .line 117
    sget-object v8, La/p3u0;->e:La/p3u0;

    .line 118
    .line 119
    invoke-static {v5, v6, v7, v8}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v23

    .line 123
    move-object/from16 v20, v1

    .line 124
    .line 125
    move-object/from16 v21, v2

    .line 126
    .line 127
    move-object/from16 v22, v3

    .line 128
    .line 129
    move-object/from16 v19, v4

    .line 130
    .line 131
    filled-new-array/range {v18 .. v23}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const v2, 0x7f130066

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :goto_1
    move-object v5, v1

    .line 143
    goto :goto_2

    .line 144
    :cond_1
    move-object v1, v4

    .line 145
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    iget-object v3, v13, La/ttd;->e:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v4, v13, La/ttd;->f:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v5, v13, La/ttd;->g:Ljava/lang/String;

    .line 154
    .line 155
    filled-new-array {v2, v1, v3, v4, v5}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const v2, 0x7f130067

    .line 160
    .line 161
    .line 162
    invoke-virtual {v11, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    goto :goto_1

    .line 167
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    new-instance v6, La/sq;

    .line 172
    .line 173
    invoke-direct {v6, v0, v9, v12}, La/sq;-><init>(La/vq;Lkotlin/jvm/functions/Function0;B)V

    .line 174
    .line 175
    .line 176
    new-instance v7, La/tq;

    .line 177
    .line 178
    move-object/from16 v1, p5

    .line 179
    .line 180
    invoke-direct {v7, v1, v12}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 181
    .line 182
    .line 183
    iget-object v2, v0, La/vq;->f:La/wdk0;

    .line 184
    .line 185
    move-object/from16 v1, p3

    .line 186
    .line 187
    move-object/from16 v0, v16

    .line 188
    .line 189
    move-object/from16 v4, v17

    .line 190
    .line 191
    invoke-virtual/range {v0 .. v7}, La/yzn0;->v(Landroid/view/ViewGroup;La/wdk0;La/kxq;La/sek0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    sget-object v1, La/ctc;->a:La/ctc;

    .line 196
    .line 197
    if-ne v10, v1, :cond_2

    .line 198
    .line 199
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, La/gfk0;->l(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    :cond_2
    new-instance v1, La/xq;

    .line 207
    .line 208
    invoke-direct {v1, v0}, La/xq;-><init>(La/rrm;)V

    .line 209
    .line 210
    .line 211
    return-object v1

    .line 212
    :cond_3
    move-object/from16 v16, v11

    .line 213
    .line 214
    move-object/from16 v17, v12

    .line 215
    .line 216
    move-object v11, v5

    .line 217
    move v12, v6

    .line 218
    instance-of v4, v1, La/utd;

    .line 219
    .line 220
    const/4 v7, 0x1

    .line 221
    const/4 v5, 0x2

    .line 222
    const v8, 0x7f13032f

    .line 223
    .line 224
    .line 225
    if-eqz v4, :cond_7

    .line 226
    .line 227
    check-cast v1, La/utd;

    .line 228
    .line 229
    iget-object v4, v1, La/utd;->a:La/m0k0;

    .line 230
    .line 231
    iget-object v1, v1, La/utd;->b:La/zxj0;

    .line 232
    .line 233
    sget-object v9, La/ygp;->l:La/ygp;

    .line 234
    .line 235
    iget-object v0, v0, La/vq;->i:La/r9u;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 246
    .line 247
    invoke-virtual {v0, v9}, La/m1q0;->d(La/ygp;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    if-eqz v0, :cond_4

    .line 262
    .line 263
    const v10, 0x7f130538

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_4
    const v10, 0x7f130537

    .line 268
    .line 269
    .line 270
    :goto_3
    sget-object v11, La/ure;->i2:La/usd;

    .line 271
    .line 272
    new-array v14, v12, [Ljava/lang/Object;

    .line 273
    .line 274
    const v15, 0x7f130535

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v15, v14}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v14

    .line 281
    new-array v15, v12, [Ljava/lang/Object;

    .line 282
    .line 283
    invoke-virtual {v3, v10, v15}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    const v15, 0x7f130536

    .line 288
    .line 289
    .line 290
    const/16 p5, 0x0

    .line 291
    .line 292
    new-array v6, v12, [Ljava/lang/Object;

    .line 293
    .line 294
    invoke-virtual {v3, v15, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    if-nez v0, :cond_5

    .line 299
    .line 300
    const v0, 0x7f13005b

    .line 301
    .line 302
    .line 303
    new-array v15, v12, [Ljava/lang/Object;

    .line 304
    .line 305
    invoke-virtual {v3, v0, v15}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    goto :goto_4

    .line 310
    :cond_5
    move-object/from16 v0, p5

    .line 311
    .line 312
    :goto_4
    new-array v15, v12, [Ljava/lang/Object;

    .line 313
    .line 314
    invoke-virtual {v3, v8, v15}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    sget-object v8, La/n12;->a:La/n12;

    .line 319
    .line 320
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 321
    .line 322
    const/16 v16, 0x0

    .line 323
    .line 324
    const/16 v17, 0x5c0

    .line 325
    .line 326
    const-string v18, "REQUEST_ALREADY_COUPON_DIALOG_KEY"

    .line 327
    .line 328
    const/16 v19, 0x0

    .line 329
    .line 330
    const/16 v20, 0x0

    .line 331
    .line 332
    move-object/from16 p5, v0

    .line 333
    .line 334
    move-object/from16 p4, v3

    .line 335
    .line 336
    move-object/from16 p3, v6

    .line 337
    .line 338
    move-object/from16 p9, v8

    .line 339
    .line 340
    move-object/from16 p2, v10

    .line 341
    .line 342
    move-object/from16 p1, v14

    .line 343
    .line 344
    move-object/from16 p0, v15

    .line 345
    .line 346
    move/from16 p10, v16

    .line 347
    .line 348
    move/from16 p11, v17

    .line 349
    .line 350
    move-object/from16 p6, v18

    .line 351
    .line 352
    move-object/from16 p7, v19

    .line 353
    .line 354
    move-object/from16 p8, v20

    .line 355
    .line 356
    invoke-direct/range {p0 .. p11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 357
    .line 358
    .line 359
    move-object/from16 v0, p0

    .line 360
    .line 361
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    new-instance v3, La/ure;

    .line 365
    .line 366
    invoke-direct {v3}, La/ure;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3, v0}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, v0, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 373
    .line 374
    if-nez v0, :cond_6

    .line 375
    .line 376
    const-string v0, ""

    .line 377
    .line 378
    :cond_6
    sget-object v6, La/ure;->j2:[La/iiy;

    .line 379
    .line 380
    aget-object v8, v6, v12

    .line 381
    .line 382
    iget-object v10, v3, La/ure;->f2:La/phf0;

    .line 383
    .line 384
    invoke-virtual {v10, v3, v8, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v0, v3, La/ure;->h2:La/yzn0;

    .line 388
    .line 389
    aget-object v5, v6, v5

    .line 390
    .line 391
    invoke-virtual {v0, v3, v5, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 392
    .line 393
    .line 394
    iget-object v0, v3, La/ure;->g2:La/yzn0;

    .line 395
    .line 396
    aget-object v1, v6, v7

    .line 397
    .line 398
    invoke-virtual {v0, v3, v1, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v3, v9}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 402
    .line 403
    .line 404
    return-object v13

    .line 405
    :cond_7
    const/16 p5, 0x0

    .line 406
    .line 407
    instance-of v4, v1, La/wtd;

    .line 408
    .line 409
    if-eqz v4, :cond_a

    .line 410
    .line 411
    check-cast v1, La/wtd;

    .line 412
    .line 413
    if-eqz p7, :cond_8

    .line 414
    .line 415
    iget-wide v2, v1, La/wtd;->b:J

    .line 416
    .line 417
    iget-wide v4, v1, La/wtd;->c:J

    .line 418
    .line 419
    const/4 v6, 0x0

    .line 420
    move-wide v1, v2

    .line 421
    move-wide v3, v4

    .line 422
    move-object/from16 v5, p8

    .line 423
    .line 424
    invoke-virtual/range {v0 .. v6}, La/vq;->d(JJLa/ms2;Z)V

    .line 425
    .line 426
    .line 427
    :cond_8
    new-array v1, v12, [Ljava/lang/Object;

    .line 428
    .line 429
    const v2, 0x7f130243

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    new-instance v6, La/sq;

    .line 441
    .line 442
    invoke-direct {v6, v0, v9, v7}, La/sq;-><init>(La/vq;Lkotlin/jvm/functions/Function0;B)V

    .line 443
    .line 444
    .line 445
    new-instance v7, La/q8;

    .line 446
    .line 447
    const/16 v1, 0xc

    .line 448
    .line 449
    invoke-direct {v7, v1}, La/q8;-><init>(B)V

    .line 450
    .line 451
    .line 452
    iget-object v2, v0, La/vq;->f:La/wdk0;

    .line 453
    .line 454
    move-object/from16 v1, p3

    .line 455
    .line 456
    move-object/from16 v0, v16

    .line 457
    .line 458
    move-object/from16 v4, v17

    .line 459
    .line 460
    invoke-virtual/range {v0 .. v7}, La/yzn0;->v(Landroid/view/ViewGroup;La/wdk0;La/kxq;La/sek0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    sget-object v1, La/ctc;->a:La/ctc;

    .line 465
    .line 466
    if-ne v10, v1, :cond_9

    .line 467
    .line 468
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-static {v1}, La/gfk0;->l(Landroid/content/Context;)V

    .line 473
    .line 474
    .line 475
    :cond_9
    new-instance v1, La/xq;

    .line 476
    .line 477
    invoke-direct {v1, v0}, La/xq;-><init>(La/rrm;)V

    .line 478
    .line 479
    .line 480
    return-object v1

    .line 481
    :cond_a
    instance-of v4, v1, La/ytd;

    .line 482
    .line 483
    const v6, 0x7f130162

    .line 484
    .line 485
    .line 486
    if-eqz v4, :cond_c

    .line 487
    .line 488
    move-object v0, v1

    .line 489
    check-cast v0, La/ytd;

    .line 490
    .line 491
    iget-object v1, v0, La/ytd;->b:La/q4f;

    .line 492
    .line 493
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    iget v0, v0, La/ytd;->a:I

    .line 501
    .line 502
    sget-object v5, La/q4f;->b:La/q4f;

    .line 503
    .line 504
    if-eq v1, v5, :cond_b

    .line 505
    .line 506
    invoke-static {v1}, La/lgb;->V(La/q4f;)I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    new-array v5, v12, [Ljava/lang/Object;

    .line 511
    .line 512
    invoke-virtual {v3, v1, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    goto :goto_5

    .line 517
    :cond_b
    sget-object v1, La/q4f;->d:La/q4f;

    .line 518
    .line 519
    invoke-static {v1}, La/lgb;->V(La/q4f;)I

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    new-array v5, v12, [Ljava/lang/Object;

    .line 524
    .line 525
    invoke-virtual {v3, v1, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    const v1, 0x7f13052c

    .line 538
    .line 539
    .line 540
    invoke-virtual {v3, v1, v0}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 545
    .line 546
    new-array v5, v12, [Ljava/lang/Object;

    .line 547
    .line 548
    invoke-virtual {v3, v6, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    const v6, 0x7f130e5c

    .line 553
    .line 554
    .line 555
    new-array v7, v12, [Ljava/lang/Object;

    .line 556
    .line 557
    invoke-virtual {v3, v6, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    sget-object v6, La/n12;->a:La/n12;

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/16 v8, 0x5f8

    .line 565
    .line 566
    const/4 v9, 0x0

    .line 567
    const/4 v10, 0x0

    .line 568
    const/4 v11, 0x0

    .line 569
    const/4 v12, 0x0

    .line 570
    const/4 v14, 0x0

    .line 571
    move-object/from16 p2, v0

    .line 572
    .line 573
    move-object/from16 p0, v1

    .line 574
    .line 575
    move-object/from16 p3, v3

    .line 576
    .line 577
    move-object/from16 p1, v5

    .line 578
    .line 579
    move-object/from16 p9, v6

    .line 580
    .line 581
    move/from16 p10, v7

    .line 582
    .line 583
    move/from16 p11, v8

    .line 584
    .line 585
    move-object/from16 p4, v9

    .line 586
    .line 587
    move-object/from16 p5, v10

    .line 588
    .line 589
    move-object/from16 p6, v11

    .line 590
    .line 591
    move-object/from16 p7, v12

    .line 592
    .line 593
    move-object/from16 p8, v14

    .line 594
    .line 595
    invoke-direct/range {p0 .. p11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 596
    .line 597
    .line 598
    move-object/from16 v0, p0

    .line 599
    .line 600
    invoke-virtual {v2, v0, v4}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 601
    .line 602
    .line 603
    return-object v13

    .line 604
    :cond_c
    sget-object v4, La/ztd;->a:La/ztd;

    .line 605
    .line 606
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    if-eqz v4, :cond_d

    .line 611
    .line 612
    new-array v1, v12, [Ljava/lang/Object;

    .line 613
    .line 614
    const v2, 0x7f130e22

    .line 615
    .line 616
    .line 617
    invoke-virtual {v11, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    sget-object v3, La/pek0;->a:La/pek0;

    .line 626
    .line 627
    new-instance v4, La/sq;

    .line 628
    .line 629
    invoke-direct {v4, v0, v9, v5}, La/sq;-><init>(La/vq;Lkotlin/jvm/functions/Function0;B)V

    .line 630
    .line 631
    .line 632
    new-instance v5, La/q8;

    .line 633
    .line 634
    const/16 v6, 0xd

    .line 635
    .line 636
    invoke-direct {v5, v6}, La/q8;-><init>(B)V

    .line 637
    .line 638
    .line 639
    iget-object v0, v0, La/vq;->f:La/wdk0;

    .line 640
    .line 641
    move-object/from16 p5, p3

    .line 642
    .line 643
    move-object/from16 p6, v0

    .line 644
    .line 645
    move-object/from16 p9, v1

    .line 646
    .line 647
    move-object/from16 p7, v2

    .line 648
    .line 649
    move-object/from16 p8, v3

    .line 650
    .line 651
    move-object/from16 p10, v4

    .line 652
    .line 653
    move-object/from16 p11, v5

    .line 654
    .line 655
    move-object/from16 p4, v16

    .line 656
    .line 657
    invoke-virtual/range {p4 .. p11}, La/yzn0;->v(Landroid/view/ViewGroup;La/wdk0;La/kxq;La/sek0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 658
    .line 659
    .line 660
    return-object v13

    .line 661
    :cond_d
    instance-of v4, v1, La/vtd;

    .line 662
    .line 663
    if-eqz v4, :cond_10

    .line 664
    .line 665
    move-object v10, v1

    .line 666
    check-cast v10, La/vtd;

    .line 667
    .line 668
    iget-object v12, v10, La/vtd;->f:Ljava/lang/String;

    .line 669
    .line 670
    iget-object v1, v10, La/vtd;->e:Ljava/lang/String;

    .line 671
    .line 672
    iget-object v2, v10, La/vtd;->d:Ljava/lang/String;

    .line 673
    .line 674
    if-eqz p7, :cond_e

    .line 675
    .line 676
    move-object v3, v1

    .line 677
    move-object v4, v2

    .line 678
    iget-wide v1, v10, La/vtd;->a:J

    .line 679
    .line 680
    move-object v5, v3

    .line 681
    move-object v6, v4

    .line 682
    iget-wide v3, v10, La/vtd;->b:J

    .line 683
    .line 684
    move-object/from16 v7, p8

    .line 685
    .line 686
    move-object/from16 v8, p11

    .line 687
    .line 688
    move-object/from16 v18, v13

    .line 689
    .line 690
    move-object/from16 v19, v14

    .line 691
    .line 692
    move-object v13, v5

    .line 693
    move-object v14, v6

    .line 694
    move-wide/from16 v5, p9

    .line 695
    .line 696
    invoke-virtual/range {v0 .. v8}, La/vq;->c(JJJLa/ms2;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    goto :goto_6

    .line 700
    :cond_e
    move-object/from16 v18, v13

    .line 701
    .line 702
    move-object/from16 v19, v14

    .line 703
    .line 704
    move-object v13, v1

    .line 705
    move-object v14, v2

    .line 706
    :goto_6
    invoke-virtual/range {v19 .. v19}, La/j9c;->a()La/q4f;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    invoke-interface {v15, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    iget-object v2, v10, La/vtd;->c:Ljava/lang/String;

    .line 715
    .line 716
    if-eqz v1, :cond_f

    .line 717
    .line 718
    sget-object v1, La/jvn;->a:La/pek;

    .line 719
    .line 720
    iget-byte v3, v10, La/vtd;->h:B

    .line 721
    .line 722
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-static {v3}, La/pek;->k(I)La/jvn;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    iget-wide v3, v10, La/vtd;->g:D

    .line 730
    .line 731
    sget-object v5, La/p3u0;->e:La/p3u0;

    .line 732
    .line 733
    invoke-static {v1, v3, v4, v5}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    filled-new-array {v2, v14, v13, v12, v1}, [Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    const v2, 0x7f130411

    .line 742
    .line 743
    .line 744
    invoke-virtual {v11, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    goto :goto_7

    .line 749
    :cond_f
    filled-new-array {v2, v14, v13, v12}, [Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    const v2, 0x7f130412

    .line 754
    .line 755
    .line 756
    invoke-virtual {v11, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    new-instance v3, La/sq;

    .line 765
    .line 766
    const/4 v4, 0x3

    .line 767
    invoke-direct {v3, v0, v9, v4}, La/sq;-><init>(La/vq;Lkotlin/jvm/functions/Function0;B)V

    .line 768
    .line 769
    .line 770
    new-instance v4, La/q8;

    .line 771
    .line 772
    const/16 v5, 0xe

    .line 773
    .line 774
    invoke-direct {v4, v5}, La/q8;-><init>(B)V

    .line 775
    .line 776
    .line 777
    iget-object v0, v0, La/vq;->f:La/wdk0;

    .line 778
    .line 779
    move-object/from16 p5, p3

    .line 780
    .line 781
    move-object/from16 p6, v0

    .line 782
    .line 783
    move-object/from16 p9, v1

    .line 784
    .line 785
    move-object/from16 p7, v2

    .line 786
    .line 787
    move-object/from16 p10, v3

    .line 788
    .line 789
    move-object/from16 p11, v4

    .line 790
    .line 791
    move-object/from16 p4, v16

    .line 792
    .line 793
    move-object/from16 p8, v17

    .line 794
    .line 795
    invoke-virtual/range {p4 .. p11}, La/yzn0;->v(Landroid/view/ViewGroup;La/wdk0;La/kxq;La/sek0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 796
    .line 797
    .line 798
    return-object v18

    .line 799
    :cond_10
    move-object/from16 v18, v13

    .line 800
    .line 801
    instance-of v0, v1, La/xtd;

    .line 802
    .line 803
    if-eqz v0, :cond_12

    .line 804
    .line 805
    move-object v0, v1

    .line 806
    check-cast v0, La/xtd;

    .line 807
    .line 808
    iget-boolean v0, v0, La/xtd;->a:Z

    .line 809
    .line 810
    invoke-virtual/range {p1 .. p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    if-eqz v0, :cond_11

    .line 818
    .line 819
    const v0, 0x7f1309a8

    .line 820
    .line 821
    .line 822
    goto :goto_8

    .line 823
    :cond_11
    const v0, 0x7f1309a7

    .line 824
    .line 825
    .line 826
    :goto_8
    new-array v4, v12, [Ljava/lang/Object;

    .line 827
    .line 828
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    .line 829
    .line 830
    iget-object v7, v3, La/ctf0;->b:La/lsm0;

    .line 831
    .line 832
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    invoke-virtual {v5, v0, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    new-array v4, v12, [Ljava/lang/Object;

    .line 841
    .line 842
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-virtual {v7, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    new-array v5, v12, [Ljava/lang/Object;

    .line 851
    .line 852
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v5

    .line 856
    const v6, 0x7f13046c

    .line 857
    .line 858
    .line 859
    invoke-virtual {v7, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v5

    .line 863
    new-array v6, v12, [Ljava/lang/Object;

    .line 864
    .line 865
    invoke-virtual {v3, v8, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    sget-object v6, La/n12;->a:La/n12;

    .line 870
    .line 871
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 872
    .line 873
    const/4 v8, 0x0

    .line 874
    const/16 v9, 0x5d0

    .line 875
    .line 876
    const/4 v10, 0x0

    .line 877
    const-string v11, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEY"

    .line 878
    .line 879
    const/4 v12, 0x0

    .line 880
    const/4 v13, 0x0

    .line 881
    move-object/from16 p2, v0

    .line 882
    .line 883
    move-object/from16 p4, v3

    .line 884
    .line 885
    move-object/from16 p1, v4

    .line 886
    .line 887
    move-object/from16 p3, v5

    .line 888
    .line 889
    move-object/from16 p9, v6

    .line 890
    .line 891
    move-object/from16 p0, v7

    .line 892
    .line 893
    move/from16 p10, v8

    .line 894
    .line 895
    move/from16 p11, v9

    .line 896
    .line 897
    move-object/from16 p5, v10

    .line 898
    .line 899
    move-object/from16 p6, v11

    .line 900
    .line 901
    move-object/from16 p7, v12

    .line 902
    .line 903
    move-object/from16 p8, v13

    .line 904
    .line 905
    invoke-direct/range {p0 .. p11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 906
    .line 907
    .line 908
    move-object/from16 v0, p0

    .line 909
    .line 910
    invoke-virtual {v2, v0, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 911
    .line 912
    .line 913
    return-object v18

    .line 914
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 915
    .line 916
    .line 917
    return-object p5
.end method

.method public final b(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)La/xq;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La/vq;->b:La/ctf0;

    .line 8
    .line 9
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v1, 0x7f130545

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    sget-object v7, La/pek0;->a:La/pek0;

    .line 27
    .line 28
    new-instance v9, La/sq;

    .line 29
    .line 30
    const/4 p1, 0x4

    .line 31
    invoke-direct {v9, p0, p3, p1}, La/sq;-><init>(La/vq;Lkotlin/jvm/functions/Function0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v10, La/q8;

    .line 35
    .line 36
    const/16 p1, 0xf

    .line 37
    .line 38
    invoke-direct {v10, p1}, La/q8;-><init>(B)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, La/vq;->a:La/yzn0;

    .line 42
    .line 43
    iget-object v5, p0, La/vq;->f:La/wdk0;

    .line 44
    .line 45
    move-object v4, p2

    .line 46
    invoke-virtual/range {v3 .. v10}, La/yzn0;->v(Landroid/view/ViewGroup;La/wdk0;La/kxq;La/sek0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, La/xq;

    .line 51
    .line 52
    invoke-direct {p1, p0}, La/xq;-><init>(La/rrm;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public final c(JJJLa/ms2;Ljava/lang/String;)V
    .locals 7

    .line 1
    const/4 v6, 0x1

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move-object v5, p7

    .line 6
    invoke-virtual/range {v0 .. v6}, La/vq;->d(JJLa/ms2;Z)V

    .line 7
    .line 8
    .line 9
    if-nez p7, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    instance-of p0, p7, La/mq2;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of p0, p7, La/nq2;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    instance-of p0, p7, La/lq2;

    .line 23
    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    :goto_0
    new-instance p0, La/h0s;

    .line 27
    .line 28
    invoke-direct/range {p0 .. p8}, La/h0s;-><init>(JJJLa/ms2;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object p1, v0, La/vq;->h:La/vqc;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/vqc;->k(La/m1g;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    :goto_1
    return-void
.end method

.method public final d(JJLa/ms2;Z)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p5, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    instance-of v1, p5, La/lr2;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    instance-of v1, p5, La/kr2;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_2
    instance-of v1, p5, La/jr2;

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_3
    instance-of v1, p5, La/ks2;

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    :goto_0
    invoke-static {p5}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    goto :goto_2

    .line 29
    :cond_4
    :goto_1
    move-object p5, v0

    .line 30
    :goto_2
    const-wide/16 v1, 0x28

    .line 31
    .line 32
    cmp-long v1, p1, v1

    .line 33
    .line 34
    if-nez v1, :cond_5

    .line 35
    .line 36
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_5
    iget-object p3, p0, La/vq;->c:La/x20;

    .line 41
    .line 42
    iget-object p3, p3, La/x20;->a:La/s1p;

    .line 43
    .line 44
    new-instance p4, La/i1p;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {p4, v1, p1, p2}, La/i1p;-><init>(BJ)V

    .line 48
    .line 49
    .line 50
    new-instance v2, La/i1p;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v2, p6, v3}, La/i1p;-><init>(IB)V

    .line 54
    .line 55
    .line 56
    new-array v1, v1, [La/k1p;

    .line 57
    .line 58
    aput-object p4, v1, v3

    .line 59
    .line 60
    const/4 p4, 0x1

    .line 61
    aput-object v2, v1, p4

    .line 62
    .line 63
    invoke-static {v1}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz p5, :cond_6

    .line 68
    .line 69
    new-instance v2, La/j1p;

    .line 70
    .line 71
    invoke-direct {v2, p5, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :cond_6
    if-eqz v0, :cond_7

    .line 78
    .line 79
    new-instance v2, La/i1p;

    .line 80
    .line 81
    invoke-direct {v2, v0, p4}, La/i1p;-><init>(Ljava/io/Serializable;B)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_7
    const-wide/16 v2, 0xbf2

    .line 88
    .line 89
    invoke-virtual {p3, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 90
    .line 91
    .line 92
    if-eqz p6, :cond_8

    .line 93
    .line 94
    const-string p3, "1"

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_8
    const-string p3, "0"

    .line 98
    .line 99
    :goto_3
    iget-object p0, p0, La/vq;->d:La/mii0;

    .line 100
    .line 101
    iget-object p0, p0, La/mii0;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, La/kt2;

    .line 104
    .line 105
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance p2, Lkotlin/Pair;

    .line 110
    .line 111
    const-string p4, "sport_id"

    .line 112
    .line 113
    invoke-direct {p2, p4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Lkotlin/Pair;

    .line 117
    .line 118
    const-string p4, "action"

    .line 119
    .line 120
    invoke-direct {p1, p4, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    filled-new-array {p2, p1}, [Lkotlin/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-eqz p5, :cond_9

    .line 132
    .line 133
    const-string p2, "screen"

    .line 134
    .line 135
    invoke-interface {p1, p2, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_9
    if-eqz v0, :cond_a

    .line 139
    .line 140
    const-string p2, "sub_sport_id"

    .line 141
    .line 142
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_a
    const-string p2, "bet_long_click"

    .line 146
    .line 147
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final e(Landroidx/fragment/app/Fragment;La/ms2;La/xdr;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/on;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2, p3}, La/on;-><init>(La/vq;Landroidx/fragment/app/Fragment;La/ms2;La/xdr;)V

    .line 10
    .line 11
    .line 12
    const-string p3, "REQUEST_ALREADY_COUPON_DIALOG_KEY"

    .line 13
    .line 14
    invoke-static {p1, p3, v0}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    new-instance v0, La/uq;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p2}, La/uq;-><init>(La/vq;Landroidx/fragment/app/Fragment;La/ms2;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "REQUEST_ALREADY_COUPON_DIALOG_KEYSECOND"

    .line 27
    .line 28
    invoke-virtual {p3, p0, p1, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final f(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/tq;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p3, v1}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 11
    .line 12
    .line 13
    const-string p3, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEY"

    .line 14
    .line 15
    invoke-static {p1, p3, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, La/mc;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, p2}, La/mc;-><init>(La/vq;Landroidx/fragment/app/Fragment;La/ms2;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p3, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final g(La/ms2;La/aao;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/nr2;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    new-instance v0, La/ar2;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    instance-of v0, p1, La/is2;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    new-instance v0, La/er2;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    instance-of v0, p1, La/wq2;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    new-instance v0, La/bq2;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    :goto_0
    move-object v0, p1

    .line 35
    :goto_1
    instance-of v1, p1, La/ds2;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    check-cast p1, La/ds2;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    const/4 p1, 0x0

    .line 43
    :goto_2
    if-eqz p1, :cond_5

    .line 44
    .line 45
    invoke-static {p1}, La/g1x;->v(La/ds2;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_3

    .line 50
    :cond_5
    invoke-static {v0}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v1, 0x2

    .line 59
    const/4 v2, 0x1

    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    if-eq v0, v2, :cond_7

    .line 63
    .line 64
    if-ne v0, v1, :cond_6

    .line 65
    .line 66
    sget-object v0, La/b1p;->d:La/b1p;

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_7
    sget-object v0, La/b1p;->c:La/b1p;

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_8
    sget-object v0, La/b1p;->b:La/b1p;

    .line 77
    .line 78
    :goto_4
    iget-object v3, p0, La/vq;->c:La/x20;

    .line 79
    .line 80
    iget-object v3, v3, La/x20;->a:La/s1p;

    .line 81
    .line 82
    new-instance v4, La/j1p;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-direct {v4, p1, v5}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 86
    .line 87
    .line 88
    new-instance v6, La/j1p;

    .line 89
    .line 90
    iget-object v0, v0, La/b1p;->a:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {v6, v0, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 93
    .line 94
    .line 95
    new-array v0, v1, [La/k1p;

    .line 96
    .line 97
    aput-object v4, v0, v5

    .line 98
    .line 99
    aput-object v6, v0, v2

    .line 100
    .line 101
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-wide/16 v4, 0x2c6a

    .line 106
    .line 107
    invoke-virtual {v3, v0, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_b

    .line 115
    .line 116
    if-eq p2, v2, :cond_a

    .line 117
    .line 118
    if-ne p2, v1, :cond_9

    .line 119
    .line 120
    sget-object p2, La/du6;->d:La/du6;

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_a
    sget-object p2, La/du6;->c:La/du6;

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_b
    sget-object p2, La/du6;->b:La/du6;

    .line 131
    .line 132
    :goto_5
    iget-object p2, p2, La/du6;->a:Ljava/lang/String;

    .line 133
    .line 134
    new-instance v0, Lkotlin/Pair;

    .line 135
    .line 136
    const-string v1, "action"

    .line 137
    .line 138
    invoke-direct {v0, v1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    new-instance p2, Lkotlin/Pair;

    .line 142
    .line 143
    const-string v1, "screen"

    .line 144
    .line 145
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    filled-new-array {v0, p2}, [Lkotlin/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p0, p0, La/vq;->d:La/mii0;

    .line 157
    .line 158
    iget-object p0, p0, La/mii0;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, La/kt2;

    .line 161
    .line 162
    const-string p2, "event_added"

    .line 163
    .line 164
    invoke-interface {p0, p2, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final h(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    new-instance p1, La/xa50;

    .line 7
    .line 8
    invoke-direct {p1}, La/xa50;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x4

    .line 13
    iget-object p0, p0, La/vq;->e:La/ouu;

    .line 14
    .line 15
    invoke-static {p0, p1, v0, v1}, La/ouu;->o(La/ouu;La/cb50;Lkotlin/jvm/functions/Function1;I)V

    .line 16
    .line 17
    .line 18
    new-instance p1, La/xa50;

    .line 19
    .line 20
    invoke-direct {p1}, La/xa50;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/ouu;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/qe50;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, p1, v0}, La/qe50;->a(La/cb50;Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
