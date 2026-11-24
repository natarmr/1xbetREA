.class public final La/gfk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ifk0;
.implements La/tlu0;
.implements La/l7w0;


# static fields
.field public static final b:La/gfk0;

.field public static final c:La/gfk0;

.field public static final d:La/gfk0;

.field public static final e:La/gfk0;

.field public static final f:La/uuu0;

.field public static final g:La/gfk0;

.field public static final h:La/gfk0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/gfk0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/gfk0;->b:La/gfk0;

    .line 8
    .line 9
    new-instance v0, La/gfk0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/gfk0;->c:La/gfk0;

    .line 16
    .line 17
    new-instance v0, La/gfk0;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/gfk0;->d:La/gfk0;

    .line 24
    .line 25
    new-instance v0, La/gfk0;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 29
    .line 30
    .line 31
    sput-object v0, La/gfk0;->e:La/gfk0;

    .line 32
    .line 33
    new-instance v0, La/uuu0;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/gfk0;->f:La/uuu0;

    .line 39
    .line 40
    new-instance v0, La/gfk0;

    .line 41
    .line 42
    const/4 v1, 0x7

    .line 43
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/gfk0;->g:La/gfk0;

    .line 47
    .line 48
    new-instance v0, La/gfk0;

    .line 49
    .line 50
    const/16 v1, 0x8

    .line 51
    .line 52
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    sput-object v0, La/gfk0;->h:La/gfk0;

    .line 56
    .line 57
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/gfk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(JJ)La/n05;
    .locals 9

    .line 1
    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    .line 2
    .line 3
    invoke-static {v0, v1}, La/idm0;->s(D)J

    .line 4
    .line 5
    .line 6
    move-result-wide v7

    .line 7
    new-instance v2, La/n05;

    .line 8
    .line 9
    move-wide v3, p0

    .line 10
    move-wide v5, p2

    .line 11
    invoke-direct/range {v2 .. v8}, La/n05;-><init>(JJJ)V

    .line 12
    .line 13
    .line 14
    return-object v2
.end method

.method public static f(Landroid/view/Surface;Ljava/lang/Integer;La/m2a;La/if80;La/hf80;La/jf80;Ljava/util/List;Landroid/util/Size;ZILjava/lang/String;I)La/o03;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move-object/from16 v5, p10

    .line 12
    .line 13
    move/from16 v6, p11

    .line 14
    .line 15
    sget-object v7, La/m2a;->x:La/m2a;

    .line 16
    .line 17
    and-int/lit8 v8, v6, 0x2

    .line 18
    .line 19
    if-eqz v8, :cond_0

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object/from16 v8, p1

    .line 24
    .line 25
    :goto_0
    and-int/lit8 v10, v6, 0x4

    .line 26
    .line 27
    if-eqz v10, :cond_1

    .line 28
    .line 29
    move-object v10, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v10, p2

    .line 32
    .line 33
    :goto_1
    and-int/lit16 v11, v6, 0x200

    .line 34
    .line 35
    if-eqz v11, :cond_2

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move/from16 v11, p8

    .line 40
    .line 41
    :goto_2
    and-int/lit16 v6, v6, 0x400

    .line 42
    .line 43
    const/4 v12, -0x1

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    move v6, v12

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move/from16 v6, p9

    .line 49
    .line 50
    :goto_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget-object v13, La/m2a;->A:La/m2a;

    .line 54
    .line 55
    const/16 v14, 0x1a

    .line 56
    .line 57
    const/16 v15, 0x23

    .line 58
    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    const-string v9, "CXCP"

    .line 62
    .line 63
    if-eq v10, v13, :cond_4

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    if-lt v13, v15, :cond_7

    .line 69
    .line 70
    const-string v1, "Required value was null."

    .line 71
    .line 72
    if-eqz v8, :cond_6

    .line 73
    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {v1, v4}, La/oa3;->f(ILandroid/util/Size;)Landroid/hardware/camera2/params/OutputConfiguration;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v16

    .line 90
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object v16

    .line 94
    :cond_7
    :goto_4
    if-eq v10, v7, :cond_10

    .line 95
    .line 96
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    if-lt v1, v14, :cond_f

    .line 99
    .line 100
    if-eqz v4, :cond_e

    .line 101
    .line 102
    sget-object v6, La/m2a;->z:La/m2a;

    .line 103
    .line 104
    if-eq v10, v6, :cond_d

    .line 105
    .line 106
    sget-object v6, La/m2a;->y:La/m2a;

    .line 107
    .line 108
    if-eq v10, v6, :cond_c

    .line 109
    .line 110
    sget-object v6, La/m2a;->B:La/m2a;

    .line 111
    .line 112
    if-eq v10, v6, :cond_a

    .line 113
    .line 114
    sget-object v6, La/m2a;->Y:La/m2a;

    .line 115
    .line 116
    if-ne v10, v6, :cond_9

    .line 117
    .line 118
    if-lt v1, v15, :cond_8

    .line 119
    .line 120
    const-class v1, Landroid/media/MediaRecorder;

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_8
    const-string v0, "OutputType.MEDIA_RECORDER requires API 35 or higher."

    .line 124
    .line 125
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v16

    .line 129
    :cond_9
    const-string v0, "Unsupported OutputType: "

    .line 130
    .line 131
    invoke-static {v10, v0}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v16

    .line 135
    :cond_a
    if-lt v1, v15, :cond_b

    .line 136
    .line 137
    const-class v1, Landroid/media/MediaCodec;

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_b
    const-string v0, "OutputType.MEDIA_CODEC requires API 35 or higher."

    .line 141
    .line 142
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v16

    .line 146
    :cond_c
    const-class v1, Landroid/view/SurfaceHolder;

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_d
    const-class v1, Landroid/graphics/SurfaceTexture;

    .line 150
    .line 151
    :goto_5
    invoke-static {v4, v1}, La/y6;->f(Landroid/util/Size;Ljava/lang/Class;)Landroid/hardware/camera2/params/OutputConfiguration;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    goto :goto_7

    .line 156
    :cond_e
    const-string v0, "Size must defined when creating a deferred OutputConfiguration."

    .line 157
    .line 158
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v16

    .line 162
    :cond_f
    const-string v0, "Deferred OutputConfigurations are not supported on API "

    .line 163
    .line 164
    const-string v2, " (requires API 26)"

    .line 165
    .line 166
    invoke-static {v1, v0, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object v16

    .line 174
    :cond_10
    if-eqz v1, :cond_20

    .line 175
    .line 176
    if-eq v6, v12, :cond_11

    .line 177
    .line 178
    :try_start_0
    new-instance v4, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 179
    .line 180
    invoke-direct {v4, v6, v1}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    .line 181
    .line 182
    .line 183
    :goto_6
    move-object v1, v4

    .line 184
    goto :goto_7

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto/16 :goto_c

    .line 187
    .line 188
    :cond_11
    new-instance v4, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 189
    .line 190
    invoke-direct {v4, v1}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(Landroid/view/Surface;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :goto_7
    if-eqz v11, :cond_12

    .line 195
    .line 196
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 197
    .line 198
    if-lt v4, v14, :cond_12

    .line 199
    .line 200
    invoke-static {v1}, La/y6;->n(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 201
    .line 202
    .line 203
    :cond_12
    const/16 v4, 0x1c

    .line 204
    .line 205
    if-eqz v5, :cond_14

    .line 206
    .line 207
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 208
    .line 209
    if-lt v6, v4, :cond_13

    .line 210
    .line 211
    if-lt v6, v4, :cond_14

    .line 212
    .line 213
    invoke-static {v1, v5}, La/x6;->s(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_13
    const-string v0, "physicalCameraId is not supported on API "

    .line 218
    .line 219
    const-string v1, " (requires API 28)"

    .line 220
    .line 221
    invoke-static {v6, v0, v1}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0}, La/c99;->v(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    return-object v16

    .line 229
    :cond_14
    :goto_8
    const-string v5, ". This may result in unexpected behavior. Requested "

    .line 230
    .line 231
    if-eqz v0, :cond_17

    .line 232
    .line 233
    iget-byte v0, v0, La/if80;->a:B

    .line 234
    .line 235
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 236
    .line 237
    const/16 v7, 0x21

    .line 238
    .line 239
    if-lt v6, v7, :cond_15

    .line 240
    .line 241
    invoke-static {v1, v0}, La/c7;->l(Landroid/hardware/camera2/params/OutputConfiguration;I)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_15
    if-nez v0, :cond_16

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_16
    const-string v7, "Cannot set mirrorMode to a non-default value on API "

    .line 249
    .line 250
    invoke-static {v6, v7, v5}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-static {v0}, La/if80;->a(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    :cond_17
    :goto_9
    if-eqz v2, :cond_1a

    .line 269
    .line 270
    iget-wide v6, v2, La/hf80;->a:J

    .line 271
    .line 272
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 273
    .line 274
    const/16 v2, 0x21

    .line 275
    .line 276
    if-lt v0, v2, :cond_18

    .line 277
    .line 278
    invoke-static {v1, v6, v7}, La/c7;->m(Landroid/hardware/camera2/params/OutputConfiguration;J)V

    .line 279
    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_18
    const-wide/16 v10, 0x1

    .line 283
    .line 284
    cmp-long v2, v6, v10

    .line 285
    .line 286
    if-nez v2, :cond_19

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_19
    const-string v2, "Cannot set dynamicRangeProfile to a non-default value on API "

    .line 290
    .line 291
    invoke-static {v0, v2, v5}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v6, v7}, La/hf80;->a(J)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    :cond_1a
    :goto_a
    if-eqz v3, :cond_1b

    .line 310
    .line 311
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 312
    .line 313
    const/16 v7, 0x21

    .line 314
    .line 315
    if-lt v0, v7, :cond_1b

    .line 316
    .line 317
    iget-wide v2, v3, La/jf80;->a:J

    .line 318
    .line 319
    invoke-static {v1, v2, v3}, La/c7;->u(Landroid/hardware/camera2/params/OutputConfiguration;J)V

    .line 320
    .line 321
    .line 322
    :cond_1b
    invoke-interface/range {p6 .. p6}, Ljava/util/Collection;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-nez v0, :cond_1e

    .line 327
    .line 328
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 329
    .line 330
    const/16 v2, 0x1f

    .line 331
    .line 332
    if-lt v0, v2, :cond_1d

    .line 333
    .line 334
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-nez v2, :cond_1c

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_1c
    invoke-static {v0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    throw v0

    .line 350
    :cond_1d
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v3, "Cannot add sensorPixelModeUsed value on API "

    .line 353
    .line 354
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    move-object/from16 v0, p6

    .line 364
    .line 365
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    :cond_1e
    :goto_b
    new-instance v0, La/o03;

    .line 376
    .line 377
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 378
    .line 379
    if-lt v2, v4, :cond_1f

    .line 380
    .line 381
    invoke-static {v1}, La/x6;->a(Landroid/hardware/camera2/params/OutputConfiguration;)I

    .line 382
    .line 383
    .line 384
    :cond_1f
    invoke-direct {v0, v1}, La/o03;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 385
    .line 386
    .line 387
    return-object v0

    .line 388
    :goto_c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    const-string v3, "Failed to create an OutputConfiguration for "

    .line 391
    .line 392
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    const/16 v7, 0x21

    .line 399
    .line 400
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-static {v9, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 408
    .line 409
    .line 410
    return-object v16

    .line 411
    :cond_20
    const-string v0, "non-null surface!"

    .line 412
    .line 413
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    return-object v16
.end method

.method public static g(JLjava/lang/String;)La/cl1;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/cl1;

    .line 5
    .line 6
    invoke-direct {v0}, La/cl1;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/cl1;->p2:[La/iiy;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget-object v2, v1, v2

    .line 13
    .line 14
    iget-object v3, v0, La/cl1;->k2:La/r34;

    .line 15
    .line 16
    invoke-virtual {v3, v0, v2, p0, p1}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    aget-object p0, v1, p0

    .line 21
    .line 22
    iget-object p1, v0, La/cl1;->l2:La/phf0;

    .line 23
    .line 24
    invoke-virtual {p1, v0, p0, p2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static h(Landroidx/fragment/app/e;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/pi;->l2:La/rek0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v0, "ACTION_MENU_DIALOG_TAG"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, La/pi;

    .line 19
    .line 20
    invoke-direct {v1}, La/pi;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/pi;->m2:[La/iiy;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    aget-object v2, v2, v3

    .line 27
    .line 28
    iget-object v3, v1, La/pi;->j2:La/khf0;

    .line 29
    .line 30
    invoke-virtual {v3, v1, v2, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static l(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const-string v0, "vibrator_manager"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, La/tl50;->q(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, La/tl50;->p(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, La/jw90;->e()Landroid/os/VibrationEffect;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p0, v0}, La/um30;->p(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string v1, "vibrator"

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast p0, Landroid/os/Vibrator;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/os/Vibrator;->hasVibrator()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const/16 v1, 0x1a

    .line 56
    .line 57
    if-lt v0, v1, :cond_1

    .line 58
    .line 59
    invoke-static {}, La/jw90;->e()Landroid/os/VibrationEffect;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {p0, v0}, La/jw90;->t(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    const-wide/16 v0, 0x64

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method public static n(La/gfk0;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "SecretKeyAccess is required"

    .line 5
    .line 6
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 9
    const p0, 0x7f130eac

    return p0
.end method

.method public a(IIII)I
    .locals 0

    .line 1
    sub-int/2addr p1, p3

    .line 2
    sub-int/2addr p1, p4

    .line 3
    div-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    div-int/lit8 p2, p2, 0x2

    .line 6
    .line 7
    sub-int/2addr p1, p2

    .line 8
    return p1
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 15
    const-string p0, "yW3mrTgpoL4/KRJQ0jFDJpDJso="

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "OdEeB7/NHtslqGjArd"

    .line 2
    .line 3
    return-object p0
.end method

.method public d()I
    .locals 0

    .line 1
    const p0, 0x7f130eab

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public e(Landroid/view/View;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, Landroid/widget/TextView;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    move-object p0, p1

    .line 12
    check-cast p0, Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const v1, 0x101014f

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p2, v1}, La/tlu0;->d(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const v2, 0x1010150

    .line 36
    .line 37
    .line 38
    invoke-static {v1, p2, v2}, La/tlu0;->d(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-lez v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    if-lez p2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setHint(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-object p1
.end method

.method public e()Ljava/lang/String;
    .locals 0

    .line 53
    const-string p0, "Rs1IG0T3vGjub/jvTEUTyQwiLTJ"

    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 0

    .line 417
    const-string p0, "vPHH9PpTZzp"

    return-object p0
.end method

.method public i()I
    .locals 0

    .line 1
    const p0, 0x7f130eaa

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public j()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "MBYGo6kbu/8IzM8"

    .line 2
    .line 3
    return-object p0
.end method

.method public k()I
    .locals 0

    .line 1
    const p0, 0x7f130ea7

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public m()I
    .locals 0

    .line 1
    const p0, 0x7f130ea8

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gfk0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string p0, "Center"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
