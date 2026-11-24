.class public interface abstract La/t760;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/t760;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;ILjava/util/List;I)V
    .locals 17

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object/from16 v1, p5

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v3, v0, 0x20

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    move-object v3, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object/from16 v3, p6

    .line 18
    .line 19
    :goto_1
    and-int/lit8 v4, v0, 0x40

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    const-string v4, ""

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move-object/from16 v4, p7

    .line 27
    .line 28
    :goto_2
    and-int/lit16 v5, v0, 0x80

    .line 29
    .line 30
    if-eqz v5, :cond_3

    .line 31
    .line 32
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    goto :goto_3

    .line 37
    :cond_3
    move/from16 v5, p8

    .line 38
    .line 39
    :goto_3
    and-int/lit16 v6, v0, 0x100

    .line 40
    .line 41
    if-eqz v6, :cond_4

    .line 42
    .line 43
    sget-object v6, La/iun;->a:La/iun;

    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move-object/from16 v6, p9

    .line 47
    .line 48
    :goto_4
    and-int/lit16 v0, v0, 0x200

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    const/4 v8, 0x0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    move v9, v8

    .line 55
    goto :goto_5

    .line 56
    :cond_5
    move v9, v7

    .line 57
    :goto_5
    move-object/from16 v10, p0

    .line 58
    .line 59
    check-cast v10, La/u760;

    .line 60
    .line 61
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 80
    .line 81
    .line 82
    move-result-wide v11

    .line 83
    const-wide v13, 0xffffffffL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v11, v13

    .line 89
    long-to-int v0, v11

    .line 90
    iget-object v11, v10, La/u760;->a:La/us00;

    .line 91
    .line 92
    invoke-static/range {p4 .. p4}, La/rsr0;->e0(I)I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    move-object/from16 v13, p1

    .line 97
    .line 98
    invoke-static {v11, v0, v13, v12}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    if-nez v3, :cond_6

    .line 106
    .line 107
    move-object v3, v1

    .line 108
    :cond_6
    new-instance v12, La/g760;

    .line 109
    .line 110
    invoke-virtual {v10}, La/u760;->e()La/p760;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    iget-object v13, v13, La/p760;->b:Ljava/lang/String;

    .line 115
    .line 116
    invoke-direct {v12, v11, v13}, La/g760;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v13

    .line 123
    iget-object v15, v12, La/g760;->s:Landroid/app/Notification;

    .line 124
    .line 125
    iput-wide v13, v15, Landroid/app/Notification;->when:J

    .line 126
    .line 127
    const v13, 0x7f080afa

    .line 128
    .line 129
    .line 130
    iput v13, v15, Landroid/app/Notification;->icon:I

    .line 131
    .line 132
    const v13, 0x7f130113

    .line 133
    .line 134
    .line 135
    invoke-virtual {v11, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-object/from16 v14, p2

    .line 143
    .line 144
    invoke-static {v14, v13}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    invoke-static {v13}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    iput-object v13, v12, La/g760;->e:Ljava/lang/CharSequence;

    .line 153
    .line 154
    invoke-static/range {p3 .. p3}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    iput-object v13, v15, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 159
    .line 160
    invoke-static/range {p3 .. p3}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    iput-object v13, v12, La/g760;->f:Ljava/lang/CharSequence;

    .line 165
    .line 166
    iput-object v0, v12, La/g760;->g:Landroid/app/PendingIntent;

    .line 167
    .line 168
    invoke-virtual {v12, v7}, La/g760;->c(Z)V

    .line 169
    .line 170
    .line 171
    new-instance v0, La/f760;

    .line 172
    .line 173
    const/4 v13, 0x7

    .line 174
    invoke-direct {v0, v13, v8}, La/p4;-><init>(BZ)V

    .line 175
    .line 176
    .line 177
    invoke-static/range {p3 .. p3}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    iput-object v14, v0, La/f760;->c:Ljava/lang/CharSequence;

    .line 182
    .line 183
    invoke-virtual {v12, v0}, La/g760;->f(La/p4;)V

    .line 184
    .line 185
    .line 186
    :try_start_0
    invoke-virtual {v10}, La/u760;->d()Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v12, v0}, La/g760;->e(Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    .line 192
    .line 193
    const/16 v16, 0x0

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :catch_0
    move-exception v0

    .line 197
    const-string v14, "NotificationServiceImpl"

    .line 198
    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    const-string v2, "Failed to set notification sound, using default"

    .line 202
    .line 203
    invoke-static {v14, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 204
    .line 205
    .line 206
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 207
    .line 208
    invoke-virtual {v12, v0}, La/g760;->e(Landroid/net/Uri;)V

    .line 209
    .line 210
    .line 211
    :goto_6
    const/4 v0, 0x2

    .line 212
    iput v0, v15, Landroid/app/Notification;->defaults:I

    .line 213
    .line 214
    iget v0, v10, La/u760;->f:I

    .line 215
    .line 216
    iput v0, v12, La/g760;->o:I

    .line 217
    .line 218
    if-eqz v9, :cond_7

    .line 219
    .line 220
    iput v7, v12, La/g760;->j:I

    .line 221
    .line 222
    :cond_7
    invoke-virtual {v10}, La/u760;->e()La/p760;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-boolean v0, v0, La/p760;->c:Z

    .line 227
    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    const v0, -0xffff01

    .line 231
    .line 232
    .line 233
    iput v0, v15, Landroid/app/Notification;->ledARGB:I

    .line 234
    .line 235
    const/16 v0, 0x1f4

    .line 236
    .line 237
    iput v0, v15, Landroid/app/Notification;->ledOnMS:I

    .line 238
    .line 239
    iput v0, v15, Landroid/app/Notification;->ledOffMS:I

    .line 240
    .line 241
    iget v0, v15, Landroid/app/Notification;->flags:I

    .line 242
    .line 243
    and-int/lit8 v0, v0, -0x2

    .line 244
    .line 245
    or-int/2addr v0, v7

    .line 246
    iput v0, v15, Landroid/app/Notification;->flags:I

    .line 247
    .line 248
    :cond_8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 249
    .line 250
    const/16 v2, 0x1a

    .line 251
    .line 252
    if-lt v0, v2, :cond_9

    .line 253
    .line 254
    invoke-virtual {v10}, La/u760;->h()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v10}, La/u760;->e()La/p760;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object v0, v0, La/p760;->b:Ljava/lang/String;

    .line 262
    .line 263
    iput-object v0, v12, La/g760;->q:Ljava/lang/String;

    .line 264
    .line 265
    :cond_9
    if-eqz v1, :cond_b

    .line 266
    .line 267
    invoke-virtual {v12, v1}, La/g760;->d(Landroid/graphics/Bitmap;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, La/e760;

    .line 271
    .line 272
    invoke-direct {v0, v13, v8}, La/p4;-><init>(BZ)V

    .line 273
    .line 274
    .line 275
    if-nez v3, :cond_a

    .line 276
    .line 277
    move-object/from16 v1, v16

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_a
    new-instance v1, Landroidx/core/graphics/drawable/IconCompat;

    .line 281
    .line 282
    invoke-direct {v1, v7}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 283
    .line 284
    .line 285
    iput-object v3, v1, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 286
    .line 287
    :goto_7
    iput-object v1, v0, La/e760;->c:Landroidx/core/graphics/drawable/IconCompat;

    .line 288
    .line 289
    invoke-virtual {v12, v0}, La/g760;->f(La/p4;)V

    .line 290
    .line 291
    .line 292
    :cond_b
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    move v1, v8

    .line 297
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_f

    .line 302
    .line 303
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    add-int/lit8 v3, v1, 0x1

    .line 308
    .line 309
    if-ltz v1, :cond_e

    .line 310
    .line 311
    check-cast v2, La/y660;

    .line 312
    .line 313
    iget-object v6, v2, La/y660;->a:Ljava/lang/String;

    .line 314
    .line 315
    iget-object v9, v2, La/y660;->c:La/klx;

    .line 316
    .line 317
    iget-object v2, v2, La/y660;->b:Landroid/content/Intent;

    .line 318
    .line 319
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-eqz v9, :cond_d

    .line 324
    .line 325
    if-ne v9, v7, :cond_c

    .line 326
    .line 327
    invoke-static/range {p4 .. p4}, La/rsr0;->e0(I)I

    .line 328
    .line 329
    .line 330
    move-result v9

    .line 331
    invoke-static {v11, v1, v2, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_d
    invoke-static/range {p4 .. p4}, La/rsr0;->e0(I)I

    .line 344
    .line 345
    .line 346
    move-result v9

    .line 347
    invoke-static {v11, v1, v2, v9}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    :goto_9
    new-instance v2, La/c760;

    .line 355
    .line 356
    invoke-direct {v2, v8, v6, v1}, La/c760;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 357
    .line 358
    .line 359
    iget-object v1, v12, La/g760;->b:Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move v1, v3

    .line 365
    goto :goto_8

    .line 366
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 367
    .line 368
    .line 369
    throw v16

    .line 370
    :cond_f
    invoke-virtual {v10}, La/u760;->c()Landroid/app/NotificationManager;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    if-eqz v0, :cond_11

    .line 375
    .line 376
    invoke-virtual {v12}, La/g760;->a()Landroid/app/Notification;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-nez v2, :cond_10

    .line 388
    .line 389
    invoke-virtual {v0, v5, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 390
    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_10
    invoke-virtual {v0, v4, v5, v1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 394
    .line 395
    .line 396
    :cond_11
    :goto_a
    return-void
.end method
