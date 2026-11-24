.class public final synthetic La/ka6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/mtv;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    iput-byte p1, p0, La/ka6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/ka6;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ka6;->a:B

    iput-object p1, p0, La/ka6;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 80

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ka6;->a:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    iget-object v0, v0, La/ka6;->b:Ljava/lang/String;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/qpg0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v2, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 23
    .line 24
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :try_start_0
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {v1, v6}, La/xpg0;->getBlob(I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget-object v3, La/maj;->b:La/maj;

    .line 47
    .line 48
    invoke-static {v2}, La/nkb;->B([B)La/maj;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :pswitch_0
    move-object/from16 v1, p1

    .line 67
    .line 68
    check-cast v1, La/qpg0;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v2, "UPDATE workspec SET period_count=period_count+1 WHERE id=?"

    .line 74
    .line 75
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :try_start_1
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    .line 84
    .line 85
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :pswitch_1
    move-object/from16 v1, p1

    .line 97
    .line 98
    check-cast v1, La/qpg0;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const-string v2, "UPDATE workspec SET run_attempt_count=0 WHERE id=?"

    .line 104
    .line 105
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :try_start_2
    invoke-interface {v2, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v2}, La/xpg0;->W0()Z

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, La/s0x;->R(La/qpg0;)I

    .line 116
    .line 117
    .line 118
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 119
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :catchall_2
    move-exception v0

    .line 128
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :pswitch_2
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, La/qpg0;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const-string v2, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 140
    .line 141
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :try_start_3
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    :goto_2
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_1

    .line 158
    .line 159
    invoke-interface {v1, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-interface {v1, v7}, La/xpg0;->getLong(I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    long-to-int v3, v3

    .line 168
    invoke-static {v3}, La/dqm0;->v(I)La/zov0;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    new-instance v4, La/npv0;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object v2, v4, La/npv0;->a:Ljava/lang/String;

    .line 181
    .line 182
    iput-object v3, v4, La/npv0;->b:La/zov0;

    .line 183
    .line 184
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catchall_3
    move-exception v0

    .line 189
    goto :goto_3

    .line 190
    :cond_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 191
    .line 192
    .line 193
    return-object v0

    .line 194
    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :pswitch_3
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/qpg0;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    const-string v2, "DELETE FROM workspec WHERE id=?"

    .line 206
    .line 207
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    :try_start_4
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 215
    .line 216
    .line 217
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :catchall_4
    move-exception v0

    .line 224
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :pswitch_4
    move-object/from16 v1, p1

    .line 229
    .line 230
    check-cast v1, La/qpg0;

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 236
    .line 237
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    :try_start_5
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    new-instance v0, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    :goto_4
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_2

    .line 254
    .line 255
    invoke-interface {v1, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :catchall_5
    move-exception v0

    .line 264
    goto :goto_5

    .line 265
    :cond_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :goto_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :pswitch_5
    move-object/from16 v1, p1

    .line 274
    .line 275
    check-cast v1, La/qpg0;

    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    const-string v2, "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1"

    .line 281
    .line 282
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    :try_start_6
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_3

    .line 294
    .line 295
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 296
    .line 297
    .line 298
    move-result-wide v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 299
    long-to-int v0, v2

    .line 300
    if-eqz v0, :cond_3

    .line 301
    .line 302
    move v6, v7

    .line 303
    goto :goto_6

    .line 304
    :catchall_6
    move-exception v0

    .line 305
    goto :goto_7

    .line 306
    :cond_3
    :goto_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 307
    .line 308
    .line 309
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :goto_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :pswitch_6
    move-object/from16 v1, p1

    .line 319
    .line 320
    check-cast v1, La/qpg0;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    const-string v2, "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?"

    .line 326
    .line 327
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    :try_start_7
    invoke-interface {v2, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v2}, La/xpg0;->W0()Z

    .line 335
    .line 336
    .line 337
    invoke-static {v1}, La/s0x;->R(La/qpg0;)I

    .line 338
    .line 339
    .line 340
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 341
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 342
    .line 343
    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :catchall_7
    move-exception v0

    .line 350
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :pswitch_7
    move-object/from16 v1, p1

    .line 355
    .line 356
    check-cast v1, La/qpg0;

    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    const-string v2, "SELECT state FROM workspec WHERE id=?"

    .line 362
    .line 363
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    :try_start_8
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_5

    .line 375
    .line 376
    invoke-interface {v1, v6}, La/xpg0;->isNull(I)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_4

    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    goto :goto_8

    .line 384
    :cond_4
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 385
    .line 386
    .line 387
    move-result-wide v2

    .line 388
    long-to-int v0, v2

    .line 389
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    :goto_8
    if-nez v0, :cond_6

    .line 394
    .line 395
    :cond_5
    const/4 v5, 0x0

    .line 396
    goto :goto_9

    .line 397
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    invoke-static {v0}, La/dqm0;->v(I)La/zov0;

    .line 402
    .line 403
    .line 404
    move-result-object v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 405
    goto :goto_9

    .line 406
    :catchall_8
    move-exception v0

    .line 407
    goto :goto_a

    .line 408
    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 409
    .line 410
    .line 411
    return-object v5

    .line 412
    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 413
    .line 414
    .line 415
    throw v0

    .line 416
    :pswitch_8
    move-object/from16 v1, p1

    .line 417
    .line 418
    check-cast v1, La/qpg0;

    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    const-string v2, "SELECT * FROM workspec WHERE id=?"

    .line 424
    .line 425
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    :try_start_9
    invoke-interface {v1, v7, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 430
    .line 431
    .line 432
    const-string v0, "id"

    .line 433
    .line 434
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    const-string v2, "state"

    .line 439
    .line 440
    invoke-static {v1, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    const-string v3, "worker_class_name"

    .line 445
    .line 446
    invoke-static {v1, v3}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    const-string v4, "input_merger_class_name"

    .line 451
    .line 452
    invoke-static {v1, v4}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    const-string v8, "input"

    .line 457
    .line 458
    invoke-static {v1, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    const-string v9, "output"

    .line 463
    .line 464
    invoke-static {v1, v9}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 465
    .line 466
    .line 467
    move-result v9

    .line 468
    const-string v10, "initial_delay"

    .line 469
    .line 470
    invoke-static {v1, v10}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    const-string v11, "interval_duration"

    .line 475
    .line 476
    invoke-static {v1, v11}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    const-string v12, "flex_duration"

    .line 481
    .line 482
    invoke-static {v1, v12}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 483
    .line 484
    .line 485
    move-result v12

    .line 486
    const-string v13, "run_attempt_count"

    .line 487
    .line 488
    invoke-static {v1, v13}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    move-result v13

    .line 492
    const-string v14, "backoff_policy"

    .line 493
    .line 494
    invoke-static {v1, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    const-string v15, "backoff_delay_duration"

    .line 499
    .line 500
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 501
    .line 502
    .line 503
    move-result v15

    .line 504
    const-string v5, "last_enqueue_time"

    .line 505
    .line 506
    invoke-static {v1, v5}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    const-string v6, "minimum_retention_duration"

    .line 511
    .line 512
    invoke-static {v1, v6}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 513
    .line 514
    .line 515
    move-result v6

    .line 516
    const-string v7, "schedule_requested_at"

    .line 517
    .line 518
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    move/from16 p0, v7

    .line 523
    .line 524
    const-string v7, "run_in_foreground"

    .line 525
    .line 526
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 527
    .line 528
    .line 529
    move-result v7

    .line 530
    move/from16 p1, v7

    .line 531
    .line 532
    const-string v7, "out_of_quota_policy"

    .line 533
    .line 534
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 535
    .line 536
    .line 537
    move-result v7

    .line 538
    move/from16 v17, v7

    .line 539
    .line 540
    const-string v7, "period_count"

    .line 541
    .line 542
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 543
    .line 544
    .line 545
    move-result v7

    .line 546
    move/from16 v18, v7

    .line 547
    .line 548
    const-string v7, "generation"

    .line 549
    .line 550
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 551
    .line 552
    .line 553
    move-result v7

    .line 554
    move/from16 v19, v7

    .line 555
    .line 556
    const-string v7, "next_schedule_time_override"

    .line 557
    .line 558
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    move/from16 v20, v7

    .line 563
    .line 564
    const-string v7, "next_schedule_time_override_generation"

    .line 565
    .line 566
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    move/from16 v21, v7

    .line 571
    .line 572
    const-string v7, "stop_reason"

    .line 573
    .line 574
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    move/from16 v22, v7

    .line 579
    .line 580
    const-string v7, "trace_tag"

    .line 581
    .line 582
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 583
    .line 584
    .line 585
    move-result v7

    .line 586
    move/from16 v23, v7

    .line 587
    .line 588
    const-string v7, "backoff_on_system_interruptions"

    .line 589
    .line 590
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    move/from16 v24, v7

    .line 595
    .line 596
    const-string v7, "required_network_type"

    .line 597
    .line 598
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 599
    .line 600
    .line 601
    move-result v7

    .line 602
    move/from16 v25, v7

    .line 603
    .line 604
    const-string v7, "required_network_request"

    .line 605
    .line 606
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    move/from16 v26, v7

    .line 611
    .line 612
    const-string v7, "requires_charging"

    .line 613
    .line 614
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    move/from16 v27, v7

    .line 619
    .line 620
    const-string v7, "requires_device_idle"

    .line 621
    .line 622
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    move/from16 v28, v7

    .line 627
    .line 628
    const-string v7, "requires_battery_not_low"

    .line 629
    .line 630
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 631
    .line 632
    .line 633
    move-result v7

    .line 634
    move/from16 v29, v7

    .line 635
    .line 636
    const-string v7, "requires_storage_not_low"

    .line 637
    .line 638
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 639
    .line 640
    .line 641
    move-result v7

    .line 642
    move/from16 v30, v7

    .line 643
    .line 644
    const-string v7, "trigger_content_update_delay"

    .line 645
    .line 646
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    move/from16 v31, v7

    .line 651
    .line 652
    const-string v7, "trigger_max_content_delay"

    .line 653
    .line 654
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 655
    .line 656
    .line 657
    move-result v7

    .line 658
    move/from16 v32, v7

    .line 659
    .line 660
    const-string v7, "content_uri_triggers"

    .line 661
    .line 662
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 663
    .line 664
    .line 665
    move-result v7

    .line 666
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 667
    .line 668
    .line 669
    move-result v33

    .line 670
    if-eqz v33, :cond_10

    .line 671
    .line 672
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v35

    .line 676
    move v0, v6

    .line 677
    move/from16 v33, v7

    .line 678
    .line 679
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 680
    .line 681
    .line 682
    move-result-wide v6

    .line 683
    long-to-int v2, v6

    .line 684
    invoke-static {v2}, La/dqm0;->v(I)La/zov0;

    .line 685
    .line 686
    .line 687
    move-result-object v36

    .line 688
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v37

    .line 692
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v38

    .line 696
    invoke-interface {v1, v8}, La/xpg0;->getBlob(I)[B

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    sget-object v3, La/maj;->b:La/maj;

    .line 701
    .line 702
    invoke-static {v2}, La/nkb;->B([B)La/maj;

    .line 703
    .line 704
    .line 705
    move-result-object v39

    .line 706
    invoke-interface {v1, v9}, La/xpg0;->getBlob(I)[B

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-static {v2}, La/nkb;->B([B)La/maj;

    .line 711
    .line 712
    .line 713
    move-result-object v40

    .line 714
    invoke-interface {v1, v10}, La/xpg0;->getLong(I)J

    .line 715
    .line 716
    .line 717
    move-result-wide v41

    .line 718
    invoke-interface {v1, v11}, La/xpg0;->getLong(I)J

    .line 719
    .line 720
    .line 721
    move-result-wide v43

    .line 722
    invoke-interface {v1, v12}, La/xpg0;->getLong(I)J

    .line 723
    .line 724
    .line 725
    move-result-wide v45

    .line 726
    invoke-interface {v1, v13}, La/xpg0;->getLong(I)J

    .line 727
    .line 728
    .line 729
    move-result-wide v2

    .line 730
    long-to-int v2, v2

    .line 731
    invoke-interface {v1, v14}, La/xpg0;->getLong(I)J

    .line 732
    .line 733
    .line 734
    move-result-wide v3

    .line 735
    long-to-int v3, v3

    .line 736
    invoke-static {v3}, La/dqm0;->s(I)La/af5;

    .line 737
    .line 738
    .line 739
    move-result-object v49

    .line 740
    invoke-interface {v1, v15}, La/xpg0;->getLong(I)J

    .line 741
    .line 742
    .line 743
    move-result-wide v50

    .line 744
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 745
    .line 746
    .line 747
    move-result-wide v52

    .line 748
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 749
    .line 750
    .line 751
    move-result-wide v54

    .line 752
    move/from16 v0, p0

    .line 753
    .line 754
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 755
    .line 756
    .line 757
    move-result-wide v56

    .line 758
    move/from16 v0, p1

    .line 759
    .line 760
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 761
    .line 762
    .line 763
    move-result-wide v3

    .line 764
    long-to-int v0, v3

    .line 765
    if-eqz v0, :cond_7

    .line 766
    .line 767
    const/16 v58, 0x1

    .line 768
    .line 769
    :goto_b
    move/from16 v0, v17

    .line 770
    .line 771
    goto :goto_c

    .line 772
    :cond_7
    const/16 v58, 0x0

    .line 773
    .line 774
    goto :goto_b

    .line 775
    :goto_c
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 776
    .line 777
    .line 778
    move-result-wide v3

    .line 779
    long-to-int v0, v3

    .line 780
    invoke-static {v0}, La/dqm0;->u(I)La/od80;

    .line 781
    .line 782
    .line 783
    move-result-object v59

    .line 784
    move/from16 v0, v18

    .line 785
    .line 786
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 787
    .line 788
    .line 789
    move-result-wide v3

    .line 790
    long-to-int v0, v3

    .line 791
    move/from16 v3, v19

    .line 792
    .line 793
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 794
    .line 795
    .line 796
    move-result-wide v3

    .line 797
    long-to-int v3, v3

    .line 798
    move/from16 v4, v20

    .line 799
    .line 800
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 801
    .line 802
    .line 803
    move-result-wide v62

    .line 804
    move/from16 v4, v21

    .line 805
    .line 806
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 807
    .line 808
    .line 809
    move-result-wide v4

    .line 810
    long-to-int v4, v4

    .line 811
    move/from16 v5, v22

    .line 812
    .line 813
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 814
    .line 815
    .line 816
    move-result-wide v5

    .line 817
    long-to-int v5, v5

    .line 818
    move/from16 v6, v23

    .line 819
    .line 820
    invoke-interface {v1, v6}, La/xpg0;->isNull(I)Z

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    if-eqz v7, :cond_8

    .line 825
    .line 826
    const/16 v66, 0x0

    .line 827
    .line 828
    :goto_d
    move/from16 v6, v24

    .line 829
    .line 830
    goto :goto_e

    .line 831
    :cond_8
    invoke-interface {v1, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v6

    .line 835
    move-object/from16 v66, v6

    .line 836
    .line 837
    goto :goto_d

    .line 838
    :goto_e
    invoke-interface {v1, v6}, La/xpg0;->isNull(I)Z

    .line 839
    .line 840
    .line 841
    move-result v7

    .line 842
    if-eqz v7, :cond_9

    .line 843
    .line 844
    const/4 v6, 0x0

    .line 845
    goto :goto_f

    .line 846
    :cond_9
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 847
    .line 848
    .line 849
    move-result-wide v6

    .line 850
    long-to-int v6, v6

    .line 851
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 852
    .line 853
    .line 854
    move-result-object v6

    .line 855
    :goto_f
    if-eqz v6, :cond_b

    .line 856
    .line 857
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 858
    .line 859
    .line 860
    move-result v6

    .line 861
    if-eqz v6, :cond_a

    .line 862
    .line 863
    const/4 v6, 0x1

    .line 864
    goto :goto_10

    .line 865
    :cond_a
    const/4 v6, 0x0

    .line 866
    :goto_10
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 867
    .line 868
    .line 869
    move-result-object v6

    .line 870
    move-object/from16 v67, v6

    .line 871
    .line 872
    :goto_11
    move/from16 v6, v25

    .line 873
    .line 874
    goto :goto_12

    .line 875
    :catchall_9
    move-exception v0

    .line 876
    goto/16 :goto_1c

    .line 877
    .line 878
    :cond_b
    const/16 v67, 0x0

    .line 879
    .line 880
    goto :goto_11

    .line 881
    :goto_12
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 882
    .line 883
    .line 884
    move-result-wide v6

    .line 885
    long-to-int v6, v6

    .line 886
    invoke-static {v6}, La/dqm0;->t(I)La/sl50;

    .line 887
    .line 888
    .line 889
    move-result-object v70

    .line 890
    move/from16 v6, v26

    .line 891
    .line 892
    invoke-interface {v1, v6}, La/xpg0;->getBlob(I)[B

    .line 893
    .line 894
    .line 895
    move-result-object v6

    .line 896
    invoke-static {v6}, La/dqm0;->A([B)La/hl50;

    .line 897
    .line 898
    .line 899
    move-result-object v69

    .line 900
    move/from16 v6, v27

    .line 901
    .line 902
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 903
    .line 904
    .line 905
    move-result-wide v6

    .line 906
    long-to-int v6, v6

    .line 907
    if-eqz v6, :cond_c

    .line 908
    .line 909
    const/16 v71, 0x1

    .line 910
    .line 911
    :goto_13
    move/from16 v6, v28

    .line 912
    .line 913
    goto :goto_14

    .line 914
    :cond_c
    const/16 v71, 0x0

    .line 915
    .line 916
    goto :goto_13

    .line 917
    :goto_14
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 918
    .line 919
    .line 920
    move-result-wide v6

    .line 921
    long-to-int v6, v6

    .line 922
    if-eqz v6, :cond_d

    .line 923
    .line 924
    const/16 v72, 0x1

    .line 925
    .line 926
    :goto_15
    move/from16 v6, v29

    .line 927
    .line 928
    goto :goto_16

    .line 929
    :cond_d
    const/16 v72, 0x0

    .line 930
    .line 931
    goto :goto_15

    .line 932
    :goto_16
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 933
    .line 934
    .line 935
    move-result-wide v6

    .line 936
    long-to-int v6, v6

    .line 937
    if-eqz v6, :cond_e

    .line 938
    .line 939
    const/16 v73, 0x1

    .line 940
    .line 941
    :goto_17
    move/from16 v6, v30

    .line 942
    .line 943
    goto :goto_18

    .line 944
    :cond_e
    const/16 v73, 0x0

    .line 945
    .line 946
    goto :goto_17

    .line 947
    :goto_18
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 948
    .line 949
    .line 950
    move-result-wide v6

    .line 951
    long-to-int v6, v6

    .line 952
    if-eqz v6, :cond_f

    .line 953
    .line 954
    const/16 v74, 0x1

    .line 955
    .line 956
    :goto_19
    move/from16 v6, v31

    .line 957
    .line 958
    goto :goto_1a

    .line 959
    :cond_f
    const/16 v74, 0x0

    .line 960
    .line 961
    goto :goto_19

    .line 962
    :goto_1a
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 963
    .line 964
    .line 965
    move-result-wide v75

    .line 966
    move/from16 v6, v32

    .line 967
    .line 968
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 969
    .line 970
    .line 971
    move-result-wide v77

    .line 972
    move/from16 v6, v33

    .line 973
    .line 974
    invoke-interface {v1, v6}, La/xpg0;->getBlob(I)[B

    .line 975
    .line 976
    .line 977
    move-result-object v6

    .line 978
    invoke-static {v6}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 979
    .line 980
    .line 981
    move-result-object v79

    .line 982
    new-instance v47, La/o4e;

    .line 983
    .line 984
    move-object/from16 v68, v47

    .line 985
    .line 986
    invoke-direct/range {v68 .. v79}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 987
    .line 988
    .line 989
    move-object/from16 v47, v68

    .line 990
    .line 991
    new-instance v34, La/ppv0;

    .line 992
    .line 993
    move/from16 v60, v0

    .line 994
    .line 995
    move/from16 v48, v2

    .line 996
    .line 997
    move/from16 v61, v3

    .line 998
    .line 999
    move/from16 v64, v4

    .line 1000
    .line 1001
    move/from16 v65, v5

    .line 1002
    .line 1003
    invoke-direct/range {v34 .. v67}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IIJIILjava/lang/String;Ljava/lang/Boolean;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1004
    .line 1005
    .line 1006
    move-object/from16 v5, v34

    .line 1007
    .line 1008
    goto :goto_1b

    .line 1009
    :cond_10
    const/4 v5, 0x0

    .line 1010
    :goto_1b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1011
    .line 1012
    .line 1013
    return-object v5

    .line 1014
    :goto_1c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1015
    .line 1016
    .line 1017
    throw v0

    .line 1018
    :pswitch_9
    move-object/from16 v1, p1

    .line 1019
    .line 1020
    check-cast v1, La/qpg0;

    .line 1021
    .line 1022
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1023
    .line 1024
    .line 1025
    const-string v2, "DELETE from WorkProgress where work_spec_id=?"

    .line 1026
    .line 1027
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    const/4 v2, 0x1

    .line 1032
    :try_start_a
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1036
    .line 1037
    .line 1038
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1039
    .line 1040
    .line 1041
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1042
    .line 1043
    return-object v0

    .line 1044
    :catchall_a
    move-exception v0

    .line 1045
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1046
    .line 1047
    .line 1048
    throw v0

    .line 1049
    :pswitch_a
    move-object/from16 v1, p1

    .line 1050
    .line 1051
    check-cast v1, La/qpg0;

    .line 1052
    .line 1053
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    const-string v2, "SELECT name FROM workname WHERE work_spec_id=?"

    .line 1057
    .line 1058
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    const/4 v2, 0x1

    .line 1063
    :try_start_b
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    new-instance v0, Ljava/util/ArrayList;

    .line 1067
    .line 1068
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1069
    .line 1070
    .line 1071
    :goto_1d
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    if-eqz v2, :cond_11

    .line 1076
    .line 1077
    const/4 v2, 0x0

    .line 1078
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v3

    .line 1082
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1083
    .line 1084
    .line 1085
    goto :goto_1d

    .line 1086
    :catchall_b
    move-exception v0

    .line 1087
    goto :goto_1e

    .line 1088
    :cond_11
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1089
    .line 1090
    .line 1091
    return-object v0

    .line 1092
    :goto_1e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1093
    .line 1094
    .line 1095
    throw v0

    .line 1096
    :pswitch_b
    move-object/from16 v1, p1

    .line 1097
    .line 1098
    check-cast v1, La/cp;

    .line 1099
    .line 1100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    new-instance v2, La/b8q0;

    .line 1104
    .line 1105
    invoke-direct {v2, v1, v0}, La/b8q0;-><init>(La/cp;Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1109
    .line 1110
    .line 1111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1112
    .line 1113
    return-object v0

    .line 1114
    :pswitch_c
    move-object/from16 v1, p1

    .line 1115
    .line 1116
    check-cast v1, La/qpg0;

    .line 1117
    .line 1118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    const-string v2, "DELETE FROM SystemIdInfo where work_spec_id=?"

    .line 1122
    .line 1123
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    const/4 v2, 0x1

    .line 1128
    :try_start_c
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1132
    .line 1133
    .line 1134
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1135
    .line 1136
    .line 1137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1138
    .line 1139
    return-object v0

    .line 1140
    :catchall_c
    move-exception v0

    .line 1141
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1142
    .line 1143
    .line 1144
    throw v0

    .line 1145
    :pswitch_d
    move-object/from16 v1, p1

    .line 1146
    .line 1147
    check-cast v1, Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v2

    .line 1156
    if-eqz v2, :cond_13

    .line 1157
    .line 1158
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1159
    .line 1160
    .line 1161
    move-result v2

    .line 1162
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1163
    .line 1164
    .line 1165
    move-result v3

    .line 1166
    if-ge v2, v3, :cond_12

    .line 1167
    .line 1168
    goto :goto_1f

    .line 1169
    :cond_12
    move-object v0, v1

    .line 1170
    goto :goto_1f

    .line 1171
    :cond_13
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    :goto_1f
    return-object v0

    .line 1176
    :pswitch_e
    move-object/from16 v1, p1

    .line 1177
    .line 1178
    check-cast v1, La/abi0;

    .line 1179
    .line 1180
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 1181
    .line 1182
    sget-object v2, La/xai0;->k:La/zai0;

    .line 1183
    .line 1184
    sget-object v5, La/yai0;->a:[La/iiy;

    .line 1185
    .line 1186
    aget-object v3, v5, v3

    .line 1187
    .line 1188
    new-instance v3, La/dk00;

    .line 1189
    .line 1190
    const/4 v6, 0x0

    .line 1191
    invoke-direct {v3, v6}, La/dk00;-><init>(I)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    invoke-interface {v1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1198
    .line 1199
    .line 1200
    new-instance v2, La/hwi0;

    .line 1201
    .line 1202
    const/16 v3, 0x1d

    .line 1203
    .line 1204
    invoke-direct {v2, v3}, La/hwi0;-><init>(B)V

    .line 1205
    .line 1206
    .line 1207
    sget-object v3, La/mai0;->v:La/zai0;

    .line 1208
    .line 1209
    new-instance v6, La/m6;

    .line 1210
    .line 1211
    const/4 v7, 0x0

    .line 1212
    invoke-direct {v6, v7, v2}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 1213
    .line 1214
    .line 1215
    invoke-interface {v1, v3, v6}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1216
    .line 1217
    .line 1218
    sget-object v2, La/xai0;->d:La/zai0;

    .line 1219
    .line 1220
    aget-object v3, v5, v4

    .line 1221
    .line 1222
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1226
    .line 1227
    .line 1228
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1229
    .line 1230
    return-object v0

    .line 1231
    :pswitch_f
    move-object/from16 v1, p1

    .line 1232
    .line 1233
    check-cast v1, La/abi0;

    .line 1234
    .line 1235
    invoke-static {v1, v0}, La/yai0;->b(La/abi0;Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1239
    .line 1240
    return-object v0

    .line 1241
    :pswitch_10
    move-object/from16 v1, p1

    .line 1242
    .line 1243
    check-cast v1, La/qpg0;

    .line 1244
    .line 1245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    const-string v2, "SELECT long_value FROM Preference where `key`=?"

    .line 1249
    .line 1250
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    const/4 v2, 0x1

    .line 1255
    :try_start_d
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    if-eqz v0, :cond_14

    .line 1263
    .line 1264
    const/4 v2, 0x0

    .line 1265
    invoke-interface {v1, v2}, La/xpg0;->isNull(I)Z

    .line 1266
    .line 1267
    .line 1268
    move-result v0

    .line 1269
    if-eqz v0, :cond_15

    .line 1270
    .line 1271
    :cond_14
    const/4 v5, 0x0

    .line 1272
    goto :goto_20

    .line 1273
    :cond_15
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 1274
    .line 1275
    .line 1276
    move-result-wide v2

    .line 1277
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1281
    goto :goto_20

    .line 1282
    :catchall_d
    move-exception v0

    .line 1283
    goto :goto_21

    .line 1284
    :goto_20
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1285
    .line 1286
    .line 1287
    return-object v5

    .line 1288
    :goto_21
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1289
    .line 1290
    .line 1291
    throw v0

    .line 1292
    :pswitch_11
    move-object/from16 v1, p1

    .line 1293
    .line 1294
    check-cast v1, La/lf50;

    .line 1295
    .line 1296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    iget-object v2, v1, La/lf50;->a:Ljava/util/List;

    .line 1303
    .line 1304
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1305
    .line 1306
    .line 1307
    move-result v3

    .line 1308
    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v3

    .line 1312
    :cond_16
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1313
    .line 1314
    .line 1315
    move-result v4

    .line 1316
    const/4 v5, -0x1

    .line 1317
    if-eqz v4, :cond_1d

    .line 1318
    .line 1319
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v4

    .line 1323
    check-cast v4, La/ve50;

    .line 1324
    .line 1325
    if-eqz v4, :cond_1c

    .line 1326
    .line 1327
    instance-of v6, v4, La/ue50;

    .line 1328
    .line 1329
    if-eqz v6, :cond_17

    .line 1330
    .line 1331
    check-cast v4, La/ue50;

    .line 1332
    .line 1333
    iget-object v4, v4, La/ue50;->a:La/wul0;

    .line 1334
    .line 1335
    invoke-static {v4, v0}, La/qxw;->J(La/wul0;Ljava/lang/String;)Z

    .line 1336
    .line 1337
    .line 1338
    move-result v4

    .line 1339
    goto :goto_23

    .line 1340
    :cond_17
    instance-of v6, v4, La/se50;

    .line 1341
    .line 1342
    if-eqz v6, :cond_1b

    .line 1343
    .line 1344
    check-cast v4, La/se50;

    .line 1345
    .line 1346
    iget-object v4, v4, La/se50;->b:Ljava/util/List;

    .line 1347
    .line 1348
    if-eqz v4, :cond_19

    .line 1349
    .line 1350
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1351
    .line 1352
    .line 1353
    move-result v6

    .line 1354
    if-eqz v6, :cond_19

    .line 1355
    .line 1356
    :cond_18
    :goto_22
    const/4 v4, 0x0

    .line 1357
    goto :goto_23

    .line 1358
    :cond_19
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v4

    .line 1362
    :cond_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1363
    .line 1364
    .line 1365
    move-result v6

    .line 1366
    if-eqz v6, :cond_18

    .line 1367
    .line 1368
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v6

    .line 1372
    check-cast v6, La/wul0;

    .line 1373
    .line 1374
    invoke-static {v6, v0}, La/qxw;->J(La/wul0;Ljava/lang/String;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v6

    .line 1378
    if-eqz v6, :cond_1a

    .line 1379
    .line 1380
    const/4 v4, 0x1

    .line 1381
    goto :goto_23

    .line 1382
    :cond_1b
    instance-of v4, v4, La/re50;

    .line 1383
    .line 1384
    if-eqz v4, :cond_1c

    .line 1385
    .line 1386
    goto :goto_22

    .line 1387
    :goto_23
    if-eqz v4, :cond_16

    .line 1388
    .line 1389
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    .line 1390
    .line 1391
    .line 1392
    move-result v3

    .line 1393
    goto :goto_25

    .line 1394
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1395
    .line 1396
    .line 1397
    :goto_24
    const/4 v5, 0x0

    .line 1398
    goto/16 :goto_28

    .line 1399
    .line 1400
    :cond_1d
    move v3, v5

    .line 1401
    :goto_25
    if-gez v3, :cond_1e

    .line 1402
    .line 1403
    move-object v5, v1

    .line 1404
    goto/16 :goto_28

    .line 1405
    .line 1406
    :cond_1e
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v4

    .line 1410
    check-cast v4, La/ve50;

    .line 1411
    .line 1412
    if-eqz v4, :cond_24

    .line 1413
    .line 1414
    instance-of v6, v4, La/ue50;

    .line 1415
    .line 1416
    if-eqz v6, :cond_1f

    .line 1417
    .line 1418
    const/4 v0, 0x0

    .line 1419
    const/4 v4, 0x0

    .line 1420
    :goto_26
    const/4 v8, 0x1

    .line 1421
    goto :goto_27

    .line 1422
    :cond_1f
    instance-of v6, v4, La/se50;

    .line 1423
    .line 1424
    if-eqz v6, :cond_23

    .line 1425
    .line 1426
    check-cast v4, La/se50;

    .line 1427
    .line 1428
    iget-object v6, v4, La/se50;->b:Ljava/util/List;

    .line 1429
    .line 1430
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1431
    .line 1432
    .line 1433
    move-result v7

    .line 1434
    invoke-interface {v6, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v7

    .line 1438
    :cond_20
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v8

    .line 1442
    if-eqz v8, :cond_21

    .line 1443
    .line 1444
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v8

    .line 1448
    check-cast v8, La/wul0;

    .line 1449
    .line 1450
    invoke-static {v8, v0}, La/qxw;->J(La/wul0;Ljava/lang/String;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v8

    .line 1454
    if-eqz v8, :cond_20

    .line 1455
    .line 1456
    invoke-interface {v7}, Ljava/util/ListIterator;->nextIndex()I

    .line 1457
    .line 1458
    .line 1459
    move-result v5

    .line 1460
    :cond_21
    if-gez v5, :cond_22

    .line 1461
    .line 1462
    const/4 v0, 0x0

    .line 1463
    goto :goto_26

    .line 1464
    :cond_22
    const/4 v0, 0x0

    .line 1465
    invoke-interface {v6, v0, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v7

    .line 1469
    const/4 v8, 0x1

    .line 1470
    add-int/2addr v5, v8

    .line 1471
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1472
    .line 1473
    .line 1474
    move-result v9

    .line 1475
    invoke-interface {v6, v5, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v5

    .line 1479
    invoke-static {v7, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v5

    .line 1483
    const/4 v7, 0x0

    .line 1484
    invoke-static {v4, v7, v5, v8}, La/se50;->d(La/se50;La/wul0;Ljava/util/List;I)La/se50;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v4

    .line 1488
    goto :goto_27

    .line 1489
    :cond_23
    const/4 v0, 0x0

    .line 1490
    const/4 v8, 0x1

    .line 1491
    instance-of v5, v4, La/re50;

    .line 1492
    .line 1493
    if-eqz v5, :cond_24

    .line 1494
    .line 1495
    :goto_27
    invoke-interface {v2, v0, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    invoke-static {v4}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v4

    .line 1503
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    add-int/2addr v3, v8

    .line 1508
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1509
    .line 1510
    .line 1511
    move-result v4

    .line 1512
    invoke-interface {v2, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2

    .line 1516
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    const/4 v2, 0x6

    .line 1521
    const/4 v7, 0x0

    .line 1522
    invoke-static {v1, v0, v7, v7, v2}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v5

    .line 1526
    goto :goto_28

    .line 1527
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1528
    .line 1529
    .line 1530
    goto/16 :goto_24

    .line 1531
    .line 1532
    :goto_28
    return-object v5

    .line 1533
    :pswitch_12
    move-object/from16 v1, p1

    .line 1534
    .line 1535
    check-cast v1, La/abi0;

    .line 1536
    .line 1537
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 1538
    .line 1539
    sget-object v2, La/xai0;->d:La/zai0;

    .line 1540
    .line 1541
    sget-object v3, La/yai0;->a:[La/iiy;

    .line 1542
    .line 1543
    aget-object v4, v3, v4

    .line 1544
    .line 1545
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1549
    .line 1550
    .line 1551
    sget-object v0, La/xai0;->u:La/zai0;

    .line 1552
    .line 1553
    const/16 v2, 0xb

    .line 1554
    .line 1555
    aget-object v2, v3, v2

    .line 1556
    .line 1557
    const/4 v2, 0x0

    .line 1558
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v2

    .line 1562
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1563
    .line 1564
    .line 1565
    invoke-interface {v1, v0, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1566
    .line 1567
    .line 1568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1569
    .line 1570
    return-object v0

    .line 1571
    :pswitch_13
    move-object/from16 v1, p1

    .line 1572
    .line 1573
    check-cast v1, La/abi0;

    .line 1574
    .line 1575
    invoke-static {v1, v0}, La/yai0;->b(La/abi0;Ljava/lang/String;)V

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v1, v2}, La/yai0;->e(La/abi0;I)V

    .line 1579
    .line 1580
    .line 1581
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1582
    .line 1583
    return-object v0

    .line 1584
    :pswitch_14
    move-object/from16 v1, p1

    .line 1585
    .line 1586
    check-cast v1, La/abi0;

    .line 1587
    .line 1588
    invoke-static {v1, v0}, La/yai0;->b(La/abi0;Ljava/lang/String;)V

    .line 1589
    .line 1590
    .line 1591
    invoke-static {v1, v2}, La/yai0;->e(La/abi0;I)V

    .line 1592
    .line 1593
    .line 1594
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1595
    .line 1596
    return-object v0

    .line 1597
    :pswitch_15
    move-object/from16 v1, p1

    .line 1598
    .line 1599
    check-cast v1, La/x5w;

    .line 1600
    .line 1601
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1602
    .line 1603
    .line 1604
    iget-object v1, v1, La/x5w;->d:La/s5w;

    .line 1605
    .line 1606
    invoke-virtual {v1, v0}, La/s5w;->b(Ljava/lang/String;)V

    .line 1607
    .line 1608
    .line 1609
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1610
    .line 1611
    return-object v0

    .line 1612
    :pswitch_16
    move-object/from16 v1, p1

    .line 1613
    .line 1614
    check-cast v1, La/az40;

    .line 1615
    .line 1616
    sget-object v2, La/mtv;->d:La/zsb0;

    .line 1617
    .line 1618
    invoke-virtual {v1, v2, v0}, La/az40;->c(La/zsb0;Ljava/lang/Object;)V

    .line 1619
    .line 1620
    .line 1621
    invoke-static {v1, v0}, La/mtv;->d(La/az40;Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    const/16 v16, 0x0

    .line 1625
    .line 1626
    return-object v16

    .line 1627
    :pswitch_17
    move-object/from16 v1, p1

    .line 1628
    .line 1629
    check-cast v1, La/qpg0;

    .line 1630
    .line 1631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1632
    .line 1633
    .line 1634
    const-string v2, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    .line 1635
    .line 1636
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v1

    .line 1640
    const/4 v2, 0x1

    .line 1641
    :try_start_e
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1642
    .line 1643
    .line 1644
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 1645
    .line 1646
    .line 1647
    move-result v0

    .line 1648
    if-eqz v0, :cond_25

    .line 1649
    .line 1650
    const/4 v2, 0x0

    .line 1651
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 1652
    .line 1653
    .line 1654
    move-result-wide v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1655
    long-to-int v0, v3

    .line 1656
    if-eqz v0, :cond_25

    .line 1657
    .line 1658
    const/4 v6, 0x1

    .line 1659
    goto :goto_29

    .line 1660
    :catchall_e
    move-exception v0

    .line 1661
    goto :goto_2a

    .line 1662
    :cond_25
    const/4 v6, 0x0

    .line 1663
    :goto_29
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1664
    .line 1665
    .line 1666
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    return-object v0

    .line 1671
    :goto_2a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1672
    .line 1673
    .line 1674
    throw v0

    .line 1675
    :pswitch_18
    move-object/from16 v1, p1

    .line 1676
    .line 1677
    check-cast v1, La/qpg0;

    .line 1678
    .line 1679
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1680
    .line 1681
    .line 1682
    const-string v2, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    .line 1683
    .line 1684
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v1

    .line 1688
    const/4 v2, 0x1

    .line 1689
    :try_start_f
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1690
    .line 1691
    .line 1692
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 1693
    .line 1694
    .line 1695
    move-result v0

    .line 1696
    if-eqz v0, :cond_26

    .line 1697
    .line 1698
    const/4 v2, 0x0

    .line 1699
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 1700
    .line 1701
    .line 1702
    move-result-wide v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1703
    long-to-int v0, v3

    .line 1704
    if-eqz v0, :cond_26

    .line 1705
    .line 1706
    const/4 v6, 0x1

    .line 1707
    goto :goto_2b

    .line 1708
    :catchall_f
    move-exception v0

    .line 1709
    goto :goto_2c

    .line 1710
    :cond_26
    const/4 v6, 0x0

    .line 1711
    :goto_2b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1712
    .line 1713
    .line 1714
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    return-object v0

    .line 1719
    :goto_2c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1720
    .line 1721
    .line 1722
    throw v0

    .line 1723
    :pswitch_19
    move-object/from16 v1, p1

    .line 1724
    .line 1725
    check-cast v1, La/qpg0;

    .line 1726
    .line 1727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1728
    .line 1729
    .line 1730
    const-string v2, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"

    .line 1731
    .line 1732
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v1

    .line 1736
    const/4 v2, 0x1

    .line 1737
    :try_start_10
    invoke-interface {v1, v2, v0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 1738
    .line 1739
    .line 1740
    new-instance v0, Ljava/util/ArrayList;

    .line 1741
    .line 1742
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1743
    .line 1744
    .line 1745
    :goto_2d
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 1746
    .line 1747
    .line 1748
    move-result v2

    .line 1749
    if-eqz v2, :cond_27

    .line 1750
    .line 1751
    const/4 v2, 0x0

    .line 1752
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v3

    .line 1756
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1757
    .line 1758
    .line 1759
    goto :goto_2d

    .line 1760
    :catchall_10
    move-exception v0

    .line 1761
    goto :goto_2e

    .line 1762
    :cond_27
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1763
    .line 1764
    .line 1765
    return-object v0

    .line 1766
    :goto_2e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1767
    .line 1768
    .line 1769
    throw v0

    .line 1770
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1771
    .line 1772
    check-cast v1, La/abi0;

    .line 1773
    .line 1774
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1775
    .line 1776
    .line 1777
    invoke-static {v1, v0}, La/cbi0;->e(La/abi0;Ljava/lang/String;)V

    .line 1778
    .line 1779
    .line 1780
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1781
    .line 1782
    return-object v0

    .line 1783
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1784
    .line 1785
    check-cast v1, La/abi0;

    .line 1786
    .line 1787
    invoke-static {v1, v0}, La/yai0;->b(La/abi0;Ljava/lang/String;)V

    .line 1788
    .line 1789
    .line 1790
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1791
    .line 1792
    return-object v0

    .line 1793
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1794
    .line 1795
    check-cast v1, La/abi0;

    .line 1796
    .line 1797
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 1798
    .line 1799
    sget-object v2, La/xai0;->k:La/zai0;

    .line 1800
    .line 1801
    sget-object v5, La/yai0;->a:[La/iiy;

    .line 1802
    .line 1803
    aget-object v3, v5, v3

    .line 1804
    .line 1805
    new-instance v3, La/dk00;

    .line 1806
    .line 1807
    const/4 v8, 0x1

    .line 1808
    invoke-direct {v3, v8}, La/dk00;-><init>(I)V

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1812
    .line 1813
    .line 1814
    invoke-interface {v1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1815
    .line 1816
    .line 1817
    sget-object v2, La/xai0;->d:La/zai0;

    .line 1818
    .line 1819
    aget-object v3, v5, v4

    .line 1820
    .line 1821
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1822
    .line 1823
    .line 1824
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1825
    .line 1826
    .line 1827
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1828
    .line 1829
    return-object v0

    .line 1830
    nop

    .line 1831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
