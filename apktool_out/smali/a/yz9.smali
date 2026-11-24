.class public final La/yz9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ux9;

.field public final b:La/p7d;

.field public final c:La/fhn;

.field public final d:La/i2a;

.field public final e:La/f4w0;

.field public final f:La/nwp0;

.field public final g:La/c1a;

.field public final h:La/l4a;

.field public final i:La/ehf0;

.field public final j:La/vqc;

.field public final k:Landroid/hardware/camera2/params/DynamicRangeProfiles;


# direct methods
.method public constructor <init>(La/ux9;La/p7d;La/fhn;La/i2a;La/f4w0;La/nwp0;La/c1a;La/l4a;La/ehf0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/yz9;->a:La/ux9;

    .line 20
    .line 21
    iput-object p2, p0, La/yz9;->b:La/p7d;

    .line 22
    .line 23
    iput-object p3, p0, La/yz9;->c:La/fhn;

    .line 24
    .line 25
    iput-object p4, p0, La/yz9;->d:La/i2a;

    .line 26
    .line 27
    iput-object p5, p0, La/yz9;->e:La/f4w0;

    .line 28
    .line 29
    iput-object p6, p0, La/yz9;->f:La/nwp0;

    .line 30
    .line 31
    iput-object p7, p0, La/yz9;->g:La/c1a;

    .line 32
    .line 33
    iput-object p8, p0, La/yz9;->h:La/l4a;

    .line 34
    .line 35
    iput-object p9, p0, La/yz9;->i:La/ehf0;

    .line 36
    .line 37
    new-instance p1, La/vqc;

    .line 38
    .line 39
    const/4 p2, 0x4

    .line 40
    invoke-direct {p1, p2}, La/vqc;-><init>(B)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La/yz9;->j:La/vqc;

    .line 44
    .line 45
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    const/16 p3, 0x21

    .line 49
    .line 50
    if-lt p1, p3, :cond_1

    .line 51
    .line 52
    if-eqz p7, :cond_1

    .line 53
    .line 54
    invoke-static {p7}, La/mbc;->T(La/c1a;)La/vqc;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    if-eqz p4, :cond_1

    .line 59
    .line 60
    if-lt p1, p3, :cond_0

    .line 61
    .line 62
    iget-object p1, p4, La/vqc;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, La/dgn;

    .line 65
    .line 66
    invoke-interface {p1}, La/dgn;->b()Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const-string p0, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API "

    .line 72
    .line 73
    const-string p3, " (requires API 33)"

    .line 74
    .line 75
    invoke-static {p1, p0, p3}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/c99;->v(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_1
    :goto_0
    iput-object p2, p0, La/yz9;->k:Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final a(ILa/xii0;ZLa/sev;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)La/xz9;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    sget-object v2, La/m2a;->x:La/m2a;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x2

    .line 21
    if-ne v8, v6, :cond_0

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v7, v3

    .line 26
    :goto_0
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v10, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    move v11, v7

    .line 37
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v12, "CXCP"

    .line 48
    .line 49
    if-eqz v1, :cond_1a

    .line 50
    .line 51
    iget-object v15, v1, La/xii0;->g:La/t7a;

    .line 52
    .line 53
    iget-object v3, v0, La/yz9;->i:La/ehf0;

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    iget-object v5, v3, La/ehf0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, La/x0a;

    .line 60
    .line 61
    iget-object v5, v5, La/x0a;->a:La/c14;

    .line 62
    .line 63
    iget-object v14, v1, La/xii0;->c:Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    iput-object v14, v5, La/c14;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v3, v3, La/ehf0;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, La/chf0;

    .line 77
    .line 78
    iget-object v3, v3, La/chf0;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, La/c14;

    .line 81
    .line 82
    iget-object v5, v1, La/xii0;->d:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iput-object v5, v3, La/c14;->a:Ljava/lang/Object;

    .line 92
    .line 93
    :cond_1
    iget v3, v15, La/t7a;->c:I

    .line 94
    .line 95
    const/4 v5, -0x1

    .line 96
    if-eq v3, v5, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const/4 v3, 0x1

    .line 100
    :goto_1
    iget-object v14, v0, La/yz9;->f:La/nwp0;

    .line 101
    .line 102
    new-instance v5, La/onf0;

    .line 103
    .line 104
    invoke-direct {v5, v3}, La/onf0;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v14, v5}, La/nwp0;->a(La/onf0;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-interface {v7, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 112
    .line 113
    .line 114
    iget-object v5, v15, La/t7a;->b:La/b780;

    .line 115
    .line 116
    invoke-static {v5}, La/s5x0;->U(La/drd;)Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-interface {v7, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 121
    .line 122
    .line 123
    if-ne v8, v6, :cond_3

    .line 124
    .line 125
    sget-object v5, La/n1a;->a:La/dd40;

    .line 126
    .line 127
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-object/from16 v14, p5

    .line 131
    .line 132
    invoke-interface {v7, v5, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_3
    new-instance v5, La/hx9;

    .line 136
    .line 137
    iget-object v5, v1, La/xii0;->g:La/t7a;

    .line 138
    .line 139
    iget-object v5, v5, La/t7a;->b:La/b780;

    .line 140
    .line 141
    sget-object v14, La/hx9;->j:La/u15;

    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    invoke-interface {v5, v14, v15}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    check-cast v5, Ljava/lang/String;

    .line 149
    .line 150
    iget-object v14, v1, La/xii0;->a:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    const/4 v15, 0x0

    .line 157
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v18

    .line 161
    if-eqz v18, :cond_18

    .line 162
    .line 163
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v18

    .line 167
    move-object/from16 v6, v18

    .line 168
    .line 169
    check-cast v6, La/a55;

    .line 170
    .line 171
    move-object/from16 v18, v2

    .line 172
    .line 173
    iget-object v2, v6, La/a55;->a:La/hzj;

    .line 174
    .line 175
    move/from16 v19, v3

    .line 176
    .line 177
    iget v3, v6, La/a55;->d:I

    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-object/from16 p5, v5

    .line 183
    .line 184
    if-nez v5, :cond_4

    .line 185
    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_4
    move-object/from16 v20, p5

    .line 190
    .line 191
    :goto_3
    iget-object v5, v6, La/a55;->e:La/agn;

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget v8, v6, La/a55;->c:I

    .line 197
    .line 198
    move/from16 v21, v11

    .line 199
    .line 200
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    move-object/from16 v22, v14

    .line 203
    .line 204
    const/16 v14, 0x21

    .line 205
    .line 206
    if-lt v11, v14, :cond_7

    .line 207
    .line 208
    new-instance v14, La/hf80;

    .line 209
    .line 210
    move-object/from16 v24, v9

    .line 211
    .line 212
    move-object/from16 v25, v10

    .line 213
    .line 214
    const-wide/16 v9, 0x1

    .line 215
    .line 216
    invoke-direct {v14, v9, v10}, La/hf80;-><init>(J)V

    .line 217
    .line 218
    .line 219
    iget-object v9, v0, La/yz9;->k:Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 220
    .line 221
    if-eqz v9, :cond_6

    .line 222
    .line 223
    invoke-static {v5, v9}, La/bgn;->a(La/agn;Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    if-eqz v9, :cond_5

    .line 228
    .line 229
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 230
    .line 231
    .line 232
    move-result-wide v9

    .line 233
    new-instance v5, La/hf80;

    .line 234
    .line 235
    invoke-direct {v5, v9, v10}, La/hf80;-><init>(J)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v29, v5

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_5
    invoke-static {}, La/l8x;->g0()Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_6

    .line 246
    .line 247
    new-instance v9, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v10, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n "

    .line 250
    .line 251
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-static {v12, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :cond_6
    move-object/from16 v29, v14

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_7
    move-object/from16 v24, v9

    .line 268
    .line 269
    move-object/from16 v25, v10

    .line 270
    .line 271
    const/16 v29, 0x0

    .line 272
    .line 273
    :goto_4
    iget-object v5, v2, La/hzj;->h:Landroid/util/Size;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget v9, v2, La/hzj;->i:I

    .line 279
    .line 280
    if-nez v20, :cond_8

    .line 281
    .line 282
    const/16 v34, 0x0

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_8
    invoke-static/range {v20 .. v20}, La/g0a;->a(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    move-object/from16 v34, v20

    .line 289
    .line 290
    :goto_5
    if-eqz v8, :cond_a

    .line 291
    .line 292
    const/4 v10, 0x1

    .line 293
    if-eq v8, v10, :cond_9

    .line 294
    .line 295
    const/16 v30, 0x0

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_9
    new-instance v8, La/if80;

    .line 299
    .line 300
    const/4 v14, 0x2

    .line 301
    invoke-direct {v8, v14}, La/if80;-><init>(I)V

    .line 302
    .line 303
    .line 304
    :goto_6
    move-object/from16 v30, v8

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_a
    const/4 v10, 0x1

    .line 308
    new-instance v8, La/if80;

    .line 309
    .line 310
    invoke-direct {v8, v10}, La/if80;-><init>(I)V

    .line 311
    .line 312
    .line 313
    goto :goto_6

    .line 314
    :goto_7
    if-eqz p3, :cond_d

    .line 315
    .line 316
    iget-object v8, v6, La/a55;->a:La/hzj;

    .line 317
    .line 318
    iget-object v8, v8, La/hzj;->j:Ljava/lang/Class;

    .line 319
    .line 320
    const-class v10, Landroid/media/MediaCodec;

    .line 321
    .line 322
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    if-eqz v10, :cond_b

    .line 327
    .line 328
    sget-object v8, La/m2a;->B:La/m2a;

    .line 329
    .line 330
    :goto_8
    move-object/from16 v28, v8

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_b
    const-class v10, Landroid/view/SurfaceHolder;

    .line 334
    .line 335
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    if-eqz v10, :cond_c

    .line 340
    .line 341
    sget-object v8, La/m2a;->y:La/m2a;

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_c
    const-class v10, Landroid/graphics/SurfaceTexture;

    .line 345
    .line 346
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    if-eqz v8, :cond_d

    .line 351
    .line 352
    sget-object v8, La/m2a;->z:La/m2a;

    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_d
    move-object/from16 v28, v18

    .line 356
    .line 357
    :goto_9
    if-nez v21, :cond_11

    .line 358
    .line 359
    iget-object v8, v0, La/yz9;->g:La/c1a;

    .line 360
    .line 361
    move-object/from16 v10, p6

    .line 362
    .line 363
    invoke-interface {v10, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    check-cast v14, Ljava/lang/Long;

    .line 368
    .line 369
    move-object/from16 v20, v8

    .line 370
    .line 371
    move/from16 v26, v9

    .line 372
    .line 373
    if-eqz v14, :cond_e

    .line 374
    .line 375
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    .line 376
    .line 377
    .line 378
    move-result-wide v8

    .line 379
    new-instance v14, La/jf80;

    .line 380
    .line 381
    invoke-direct {v14, v8, v9}, La/jf80;-><init>(J)V

    .line 382
    .line 383
    .line 384
    :goto_a
    const/16 v8, 0x21

    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_e
    const/4 v14, 0x0

    .line 388
    goto :goto_a

    .line 389
    :goto_b
    if-lt v11, v8, :cond_f

    .line 390
    .line 391
    if-eqz v14, :cond_f

    .line 392
    .line 393
    if-eqz v20, :cond_f

    .line 394
    .line 395
    invoke-static {}, La/uq6;->e()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-object/from16 v9, v20

    .line 403
    .line 404
    check-cast v9, La/ow9;

    .line 405
    .line 406
    invoke-virtual {v9, v8}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    check-cast v8, [J

    .line 411
    .line 412
    if-eqz v8, :cond_f

    .line 413
    .line 414
    iget-wide v9, v14, La/jf80;->a:J

    .line 415
    .line 416
    invoke-static {v8, v9, v10}, La/tx3;->x([JJ)Z

    .line 417
    .line 418
    .line 419
    move-result v8

    .line 420
    const/4 v10, 0x1

    .line 421
    if-ne v8, v10, :cond_f

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_f
    invoke-static {}, La/l8x;->j0()Z

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    if-eqz v8, :cond_10

    .line 429
    .line 430
    new-instance v8, Ljava/lang/StringBuilder;

    .line 431
    .line 432
    const-string v9, "Expected stream use case for "

    .line 433
    .line 434
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    const-string v9, ", "

    .line 441
    .line 442
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    const-string v9, " cannot be set!"

    .line 449
    .line 450
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v8

    .line 457
    invoke-static {v12, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 458
    .line 459
    .line 460
    :cond_10
    const/4 v14, 0x0

    .line 461
    :goto_c
    move-object/from16 v31, v14

    .line 462
    .line 463
    goto :goto_d

    .line 464
    :cond_11
    move/from16 v26, v9

    .line 465
    .line 466
    const/16 v31, 0x0

    .line 467
    .line 468
    :goto_d
    if-nez v21, :cond_13

    .line 469
    .line 470
    move-object/from16 v8, p7

    .line 471
    .line 472
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v9

    .line 476
    check-cast v9, Ljava/lang/Long;

    .line 477
    .line 478
    if-eqz v9, :cond_12

    .line 479
    .line 480
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 481
    .line 482
    .line 483
    move-result-wide v9

    .line 484
    new-instance v11, La/kf80;

    .line 485
    .line 486
    invoke-direct {v11, v9, v10}, La/kf80;-><init>(J)V

    .line 487
    .line 488
    .line 489
    goto :goto_e

    .line 490
    :cond_12
    const/4 v11, 0x0

    .line 491
    :goto_e
    move-object/from16 v32, v11

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_13
    move-object/from16 v8, p7

    .line 495
    .line 496
    const/16 v32, 0x0

    .line 497
    .line 498
    :goto_f
    const/16 v27, 0x220

    .line 499
    .line 500
    move-object/from16 v33, v5

    .line 501
    .line 502
    invoke-static/range {v26 .. v34}, La/xi70;->d(IILa/m2a;La/hf80;La/if80;La/jf80;La/kf80;Landroid/util/Size;Ljava/lang/String;)La/gf80;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    iget-object v6, v6, La/a55;->b:Ljava/util/List;

    .line 507
    .line 508
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    if-eqz v9, :cond_17

    .line 524
    .line 525
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    check-cast v9, La/hzj;

    .line 530
    .line 531
    new-instance v10, La/e3a;

    .line 532
    .line 533
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v11

    .line 537
    invoke-direct {v10, v11}, La/e3a;-><init>(Ljava/util/List;)V

    .line 538
    .line 539
    .line 540
    invoke-interface {v13, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    const/4 v11, -0x1

    .line 544
    if-eq v3, v11, :cond_15

    .line 545
    .line 546
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v14

    .line 550
    move-object/from16 v11, v24

    .line 551
    .line 552
    invoke-virtual {v11, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v14

    .line 556
    check-cast v14, Ljava/util/List;

    .line 557
    .line 558
    if-nez v14, :cond_14

    .line 559
    .line 560
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object v14

    .line 564
    filled-new-array {v10}, [La/e3a;

    .line 565
    .line 566
    .line 567
    move-result-object v20

    .line 568
    move/from16 v23, v3

    .line 569
    .line 570
    invoke-static/range {v20 .. v20}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-interface {v11, v14, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    goto :goto_11

    .line 578
    :cond_14
    move/from16 v23, v3

    .line 579
    .line 580
    invoke-interface {v14, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    goto :goto_11

    .line 584
    :cond_15
    move/from16 v23, v3

    .line 585
    .line 586
    move-object/from16 v11, v24

    .line 587
    .line 588
    :goto_11
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    if-eqz v3, :cond_16

    .line 593
    .line 594
    iget-object v3, v0, La/yz9;->e:La/f4w0;

    .line 595
    .line 596
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    invoke-interface {v3, v9, v1}, La/f4w0;->g(La/hzj;La/xii0;)Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-eqz v3, :cond_16

    .line 604
    .line 605
    move-object v15, v10

    .line 606
    :cond_16
    move-object/from16 v24, v11

    .line 607
    .line 608
    move/from16 v3, v23

    .line 609
    .line 610
    goto :goto_10

    .line 611
    :cond_17
    move/from16 v8, p1

    .line 612
    .line 613
    move-object/from16 v5, p5

    .line 614
    .line 615
    move-object/from16 v2, v18

    .line 616
    .line 617
    move/from16 v3, v19

    .line 618
    .line 619
    move/from16 v11, v21

    .line 620
    .line 621
    move-object/from16 v14, v22

    .line 622
    .line 623
    move-object/from16 v9, v24

    .line 624
    .line 625
    move-object/from16 v10, v25

    .line 626
    .line 627
    const/4 v6, 0x2

    .line 628
    goto/16 :goto_2

    .line 629
    .line 630
    :cond_18
    move/from16 v19, v3

    .line 631
    .line 632
    move-object/from16 v25, v10

    .line 633
    .line 634
    move/from16 v21, v11

    .line 635
    .line 636
    move-object v11, v9

    .line 637
    iget-object v2, v1, La/xii0;->i:Landroid/hardware/camera2/params/InputConfiguration;

    .line 638
    .line 639
    if-eqz v2, :cond_19

    .line 640
    .line 641
    if-eqz v15, :cond_19

    .line 642
    .line 643
    new-instance v2, La/ffx;

    .line 644
    .line 645
    iget-object v3, v15, La/e3a;->a:Ljava/util/List;

    .line 646
    .line 647
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    check-cast v3, La/gf80;

    .line 652
    .line 653
    iget v3, v3, La/gf80;->b:I

    .line 654
    .line 655
    invoke-direct {v2, v15, v3}, La/ffx;-><init>(La/e3a;I)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v3, v25

    .line 659
    .line 660
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    goto :goto_12

    .line 664
    :cond_19
    move-object/from16 v3, v25

    .line 665
    .line 666
    :goto_12
    move/from16 v6, v19

    .line 667
    .line 668
    goto :goto_13

    .line 669
    :cond_1a
    move-object v3, v10

    .line 670
    move/from16 v21, v11

    .line 671
    .line 672
    move-object v11, v9

    .line 673
    const/4 v6, 0x1

    .line 674
    :goto_13
    iget-object v2, v0, La/yz9;->d:La/i2a;

    .line 675
    .line 676
    invoke-virtual {v2}, La/i2a;->a()La/kpd0;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    const-class v8, Landroidx/camera/camera2/compat/quirk/CaptureSessionStuckQuirk;

    .line 681
    .line 682
    invoke-virtual {v5, v8}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    if-eqz v5, :cond_1b

    .line 687
    .line 688
    invoke-static {v12}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 689
    .line 690
    .line 691
    move-result v5

    .line 692
    if-eqz v5, :cond_1b

    .line 693
    .line 694
    const-string v5, "CameraPipe should be enabling CaptureSessionStuckQuirk by default"

    .line 695
    .line 696
    invoke-static {v12, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 697
    .line 698
    .line 699
    :cond_1b
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 700
    .line 701
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v5, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    const-string v8, "cph"

    .line 719
    .line 720
    const/4 v9, 0x0

    .line 721
    invoke-static {v5, v8, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 722
    .line 723
    .line 724
    move-result v25

    .line 725
    iget-object v5, v0, La/yz9;->j:La/vqc;

    .line 726
    .line 727
    iget-object v5, v5, La/vqc;->b:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v5, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;

    .line 730
    .line 731
    if-eqz v5, :cond_1e

    .line 732
    .line 733
    sget-boolean v5, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->c:Z

    .line 734
    .line 735
    if-nez v5, :cond_1d

    .line 736
    .line 737
    sget-boolean v5, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->e:Z

    .line 738
    .line 739
    if-eqz v5, :cond_1c

    .line 740
    .line 741
    sget-boolean v5, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->a:Z

    .line 742
    .line 743
    if-nez v5, :cond_1c

    .line 744
    .line 745
    sget-boolean v5, Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;->b:Z

    .line 746
    .line 747
    if-nez v5, :cond_1c

    .line 748
    .line 749
    goto :goto_14

    .line 750
    :cond_1c
    const/16 v26, 0x1

    .line 751
    .line 752
    goto :goto_15

    .line 753
    :cond_1d
    :goto_14
    move/from16 v26, v21

    .line 754
    .line 755
    goto :goto_15

    .line 756
    :cond_1e
    const/16 v26, 0x0

    .line 757
    .line 758
    :goto_15
    if-eqz v21, :cond_20

    .line 759
    .line 760
    const-class v5, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopWithSessionProcessorQuirk;

    .line 761
    .line 762
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 763
    .line 764
    .line 765
    move-result-object v8

    .line 766
    invoke-virtual {v8, v5}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 767
    .line 768
    .line 769
    move-result-object v5

    .line 770
    if-eqz v5, :cond_20

    .line 771
    .line 772
    :cond_1f
    :goto_16
    const/16 v23, 0x0

    .line 773
    .line 774
    goto :goto_17

    .line 775
    :cond_20
    const-class v5, Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;

    .line 776
    .line 777
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 778
    .line 779
    .line 780
    move-result-object v8

    .line 781
    invoke-virtual {v8, v5}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    if-eqz v5, :cond_21

    .line 786
    .line 787
    goto :goto_16

    .line 788
    :cond_21
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 789
    .line 790
    const/16 v8, 0x1e

    .line 791
    .line 792
    if-lt v5, v8, :cond_1f

    .line 793
    .line 794
    const/16 v23, 0x1

    .line 795
    .line 796
    :goto_17
    invoke-virtual {v2}, La/i2a;->a()La/kpd0;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    const-class v5, Landroidx/camera/camera2/compat/quirk/QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;

    .line 801
    .line 802
    invoke-virtual {v2, v5}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    new-instance v5, La/x860;

    .line 807
    .line 808
    sget-object v8, La/wz9;->a:La/wz9;

    .line 809
    .line 810
    invoke-direct {v5, v2, v8}, La/x860;-><init>(ILa/wz9;)V

    .line 811
    .line 812
    .line 813
    new-instance v22, La/vz9;

    .line 814
    .line 815
    const/16 v27, 0x9

    .line 816
    .line 817
    move-object/from16 v24, v5

    .line 818
    .line 819
    invoke-direct/range {v22 .. v27}, La/vz9;-><init>(ZLa/x860;IZI)V

    .line 820
    .line 821
    .line 822
    if-eqz v1, :cond_24

    .line 823
    .line 824
    iget-object v2, v1, La/xii0;->g:La/t7a;

    .line 825
    .line 826
    iget-object v5, v2, La/t7a;->b:La/b780;

    .line 827
    .line 828
    sget-object v8, La/fpt0;->O0:La/u15;

    .line 829
    .line 830
    invoke-virtual {v5, v8, v4}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v5

    .line 834
    check-cast v5, Ljava/lang/Integer;

    .line 835
    .line 836
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 840
    .line 841
    .line 842
    move-result v5

    .line 843
    iget-object v2, v2, La/t7a;->b:La/b780;

    .line 844
    .line 845
    sget-object v8, La/fpt0;->P0:La/u15;

    .line 846
    .line 847
    invoke-virtual {v2, v8, v4}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    check-cast v2, Ljava/lang/Integer;

    .line 852
    .line 853
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    const/4 v10, 0x1

    .line 861
    if-eq v5, v10, :cond_25

    .line 862
    .line 863
    if-ne v2, v10, :cond_22

    .line 864
    .line 865
    goto :goto_18

    .line 866
    :cond_22
    const/4 v14, 0x2

    .line 867
    if-ne v5, v14, :cond_23

    .line 868
    .line 869
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    goto :goto_18

    .line 874
    :cond_23
    if-ne v2, v14, :cond_24

    .line 875
    .line 876
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    goto :goto_18

    .line 881
    :cond_24
    const/4 v4, 0x0

    .line 882
    :cond_25
    :goto_18
    if-eqz v1, :cond_26

    .line 883
    .line 884
    iget-object v2, v1, La/xii0;->g:La/t7a;

    .line 885
    .line 886
    invoke-virtual {v2}, La/t7a;->a()Landroid/util/Range;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    goto :goto_19

    .line 891
    :cond_26
    const/4 v2, 0x0

    .line 892
    :goto_19
    sget-object v5, La/h55;->h:Landroid/util/Range;

    .line 893
    .line 894
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v5

    .line 898
    if-nez v5, :cond_27

    .line 899
    .line 900
    goto :goto_1a

    .line 901
    :cond_27
    const/4 v2, 0x0

    .line 902
    :goto_1a
    new-instance v5, La/jo20;

    .line 903
    .line 904
    invoke-direct {v5}, La/jo20;-><init>()V

    .line 905
    .line 906
    .line 907
    if-eqz v21, :cond_28

    .line 908
    .line 909
    sget-object v8, La/n1a;->c:La/dd40;

    .line 910
    .line 911
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 912
    .line 913
    invoke-virtual {v5, v8, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    :cond_28
    if-eqz v4, :cond_29

    .line 917
    .line 918
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 919
    .line 920
    .line 921
    move-result v8

    .line 922
    sget-object v9, Landroid/hardware/camera2/CaptureRequest;->CONTROL_VIDEO_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 923
    .line 924
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 925
    .line 926
    .line 927
    move-result-object v8

    .line 928
    invoke-virtual {v5, v9, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    :cond_29
    sget-object v8, La/n1a;->b:La/dd40;

    .line 932
    .line 933
    const-string v9, "android.hardware.camera2.CaptureRequest.setTag.CX"

    .line 934
    .line 935
    invoke-virtual {v5, v8, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    if-eqz v2, :cond_2a

    .line 939
    .line 940
    sget-object v8, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 941
    .line 942
    invoke-virtual {v5, v8, v2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    :cond_2a
    invoke-virtual {v5}, La/jo20;->b()La/jo20;

    .line 946
    .line 947
    .line 948
    move-result-object v9

    .line 949
    if-eqz v2, :cond_2b

    .line 950
    .line 951
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 952
    .line 953
    invoke-interface {v7, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    :cond_2b
    if-eqz v4, :cond_2c

    .line 957
    .line 958
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_VIDEO_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 959
    .line 960
    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    :cond_2c
    if-eqz v1, :cond_32

    .line 964
    .line 965
    new-instance v2, La/hx9;

    .line 966
    .line 967
    iget-object v2, v1, La/xii0;->g:La/t7a;

    .line 968
    .line 969
    iget-object v2, v2, La/t7a;->b:La/b780;

    .line 970
    .line 971
    sget-object v4, La/hx9;->j:La/u15;

    .line 972
    .line 973
    const/4 v15, 0x0

    .line 974
    invoke-interface {v2, v4, v15}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    move-object v15, v2

    .line 979
    check-cast v15, Ljava/lang/String;

    .line 980
    .line 981
    iget-object v1, v1, La/xii0;->b:La/a55;

    .line 982
    .line 983
    if-eqz v1, :cond_31

    .line 984
    .line 985
    iget-object v2, v1, La/a55;->a:La/hzj;

    .line 986
    .line 987
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    if-nez v15, :cond_2d

    .line 991
    .line 992
    const/4 v15, 0x0

    .line 993
    :cond_2d
    iget v1, v1, La/a55;->c:I

    .line 994
    .line 995
    iget-object v4, v2, La/hzj;->h:Landroid/util/Size;

    .line 996
    .line 997
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    iget v5, v2, La/hzj;->i:I

    .line 1001
    .line 1002
    if-nez v15, :cond_2e

    .line 1003
    .line 1004
    const/16 v31, 0x0

    .line 1005
    .line 1006
    goto :goto_1b

    .line 1007
    :cond_2e
    invoke-static {v15}, La/g0a;->a(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    move-object/from16 v31, v15

    .line 1011
    .line 1012
    :goto_1b
    if-eqz v1, :cond_30

    .line 1013
    .line 1014
    const/4 v10, 0x1

    .line 1015
    if-eq v1, v10, :cond_2f

    .line 1016
    .line 1017
    const/16 v27, 0x0

    .line 1018
    .line 1019
    goto :goto_1d

    .line 1020
    :cond_2f
    new-instance v15, La/if80;

    .line 1021
    .line 1022
    const/4 v14, 0x2

    .line 1023
    invoke-direct {v15, v14}, La/if80;-><init>(I)V

    .line 1024
    .line 1025
    .line 1026
    :goto_1c
    move-object/from16 v27, v15

    .line 1027
    .line 1028
    goto :goto_1d

    .line 1029
    :cond_30
    const/4 v10, 0x1

    .line 1030
    new-instance v15, La/if80;

    .line 1031
    .line 1032
    invoke-direct {v15, v10}, La/if80;-><init>(I)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_1c

    .line 1036
    :goto_1d
    const/16 v29, 0x0

    .line 1037
    .line 1038
    const/16 v24, 0x3e8

    .line 1039
    .line 1040
    const/16 v25, 0x0

    .line 1041
    .line 1042
    const/16 v26, 0x0

    .line 1043
    .line 1044
    const/16 v28, 0x0

    .line 1045
    .line 1046
    move-object/from16 v30, v4

    .line 1047
    .line 1048
    move/from16 v23, v5

    .line 1049
    .line 1050
    invoke-static/range {v23 .. v31}, La/xi70;->d(IILa/m2a;La/hf80;La/if80;La/jf80;La/kf80;Landroid/util/Size;Ljava/lang/String;)La/gf80;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    new-instance v15, La/e3a;

    .line 1055
    .line 1056
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    invoke-direct {v15, v1}, La/e3a;-><init>(Ljava/util/List;)V

    .line 1061
    .line 1062
    .line 1063
    invoke-interface {v13, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    goto :goto_1e

    .line 1067
    :cond_31
    const/4 v15, 0x0

    .line 1068
    :goto_1e
    move-object v5, v15

    .line 1069
    goto :goto_1f

    .line 1070
    :cond_32
    const/4 v5, 0x0

    .line 1071
    :goto_1f
    iget-object v1, v0, La/yz9;->h:La/l4a;

    .line 1072
    .line 1073
    if-eqz v1, :cond_34

    .line 1074
    .line 1075
    sget-object v2, La/sw9;->a:La/u15;

    .line 1076
    .line 1077
    iget-object v1, v1, La/l4a;->a:La/b780;

    .line 1078
    .line 1079
    sget-object v2, La/sw9;->a:La/u15;

    .line 1080
    .line 1081
    const/4 v15, 0x0

    .line 1082
    invoke-virtual {v1, v2, v15}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    if-nez v1, :cond_33

    .line 1087
    .line 1088
    goto :goto_20

    .line 1089
    :cond_33
    invoke-static {}, La/hny;->b()V

    .line 1090
    .line 1091
    .line 1092
    return-object v15

    .line 1093
    :cond_34
    const/4 v15, 0x0

    .line 1094
    :goto_20
    iget-object v1, v0, La/yz9;->c:La/fhn;

    .line 1095
    .line 1096
    iget-object v1, v1, La/fhn;->b:Ljava/lang/String;

    .line 1097
    .line 1098
    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    check-cast v2, Ljava/lang/Iterable;

    .line 1103
    .line 1104
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v4

    .line 1112
    check-cast v4, Ljava/lang/Iterable;

    .line 1113
    .line 1114
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v4

    .line 1118
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v8

    .line 1122
    if-eqz v8, :cond_35

    .line 1123
    .line 1124
    move-object v10, v15

    .line 1125
    goto :goto_21

    .line 1126
    :cond_35
    move-object v10, v3

    .line 1127
    :goto_21
    iget-object v3, v0, La/yz9;->a:La/ux9;

    .line 1128
    .line 1129
    iget-object v0, v0, La/yz9;->b:La/p7d;

    .line 1130
    .line 1131
    const/4 v14, 0x2

    .line 1132
    new-array v8, v14, [La/bmf0;

    .line 1133
    .line 1134
    const/16 v16, 0x0

    .line 1135
    .line 1136
    aput-object v3, v8, v16

    .line 1137
    .line 1138
    const/16 v17, 0x1

    .line 1139
    .line 1140
    aput-object v0, v8, v17

    .line 1141
    .line 1142
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-static/range {p4 .. p4}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v11

    .line 1150
    move-object v3, v4

    .line 1151
    move-object v4, v10

    .line 1152
    move-object v10, v0

    .line 1153
    new-instance v0, La/tz9;

    .line 1154
    .line 1155
    move/from16 v8, p1

    .line 1156
    .line 1157
    move-object/from16 v12, v22

    .line 1158
    .line 1159
    invoke-direct/range {v0 .. v12}, La/tz9;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/e3a;ILjava/util/LinkedHashMap;ILa/jo20;Ljava/util/List;Ljava/util/List;La/vz9;)V

    .line 1160
    .line 1161
    .line 1162
    new-instance v1, La/xz9;

    .line 1163
    .line 1164
    invoke-static {v13}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v2

    .line 1168
    invoke-direct {v1, v0, v2}, La/xz9;-><init>(La/tz9;Ljava/util/Map;)V

    .line 1169
    .line 1170
    .line 1171
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CameraGraphConfigProvider<"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/yz9;->c:La/fhn;

    .line 9
    .line 10
    iget-object p0, p0, La/fhn;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p0}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p0, 0x3e

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
