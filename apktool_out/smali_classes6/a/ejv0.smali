.class public final synthetic La/ejv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ejv0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/x7w0;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ejv0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 84

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/qpg0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))"

    .line 9
    .line 10
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-wide/16 v2, 0x14

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, La/xpg0;->o(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "id"

    .line 21
    .line 22
    invoke-static {v1, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "state"

    .line 27
    .line 28
    invoke-static {v1, v3}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "worker_class_name"

    .line 33
    .line 34
    invoke-static {v1, v4}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "input_merger_class_name"

    .line 39
    .line 40
    invoke-static {v1, v5}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "input"

    .line 45
    .line 46
    invoke-static {v1, v6}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "output"

    .line 51
    .line 52
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "initial_delay"

    .line 57
    .line 58
    invoke-static {v1, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "interval_duration"

    .line 63
    .line 64
    invoke-static {v1, v9}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "flex_duration"

    .line 69
    .line 70
    invoke-static {v1, v10}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "run_attempt_count"

    .line 75
    .line 76
    invoke-static {v1, v11}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "backoff_policy"

    .line 81
    .line 82
    invoke-static {v1, v12}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "backoff_delay_duration"

    .line 87
    .line 88
    invoke-static {v1, v13}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "last_enqueue_time"

    .line 93
    .line 94
    invoke-static {v1, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "minimum_retention_duration"

    .line 99
    .line 100
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "schedule_requested_at"

    .line 105
    .line 106
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "run_in_foreground"

    .line 113
    .line 114
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 v16, v0

    .line 119
    .line 120
    const-string v0, "out_of_quota_policy"

    .line 121
    .line 122
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 v17, v0

    .line 127
    .line 128
    const-string v0, "period_count"

    .line 129
    .line 130
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v18, v0

    .line 135
    .line 136
    const-string v0, "generation"

    .line 137
    .line 138
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v19, v0

    .line 143
    .line 144
    const-string v0, "next_schedule_time_override"

    .line 145
    .line 146
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    move/from16 v20, v0

    .line 151
    .line 152
    const-string v0, "next_schedule_time_override_generation"

    .line 153
    .line 154
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    move/from16 v21, v0

    .line 159
    .line 160
    const-string v0, "stop_reason"

    .line 161
    .line 162
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    move/from16 v22, v0

    .line 167
    .line 168
    const-string v0, "trace_tag"

    .line 169
    .line 170
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    move/from16 v23, v0

    .line 175
    .line 176
    const-string v0, "backoff_on_system_interruptions"

    .line 177
    .line 178
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    move/from16 v24, v0

    .line 183
    .line 184
    const-string v0, "required_network_type"

    .line 185
    .line 186
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    move/from16 v25, v0

    .line 191
    .line 192
    const-string v0, "required_network_request"

    .line 193
    .line 194
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    move/from16 v26, v0

    .line 199
    .line 200
    const-string v0, "requires_charging"

    .line 201
    .line 202
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    move/from16 v27, v0

    .line 207
    .line 208
    const-string v0, "requires_device_idle"

    .line 209
    .line 210
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    move/from16 v28, v0

    .line 215
    .line 216
    const-string v0, "requires_battery_not_low"

    .line 217
    .line 218
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    move/from16 v29, v0

    .line 223
    .line 224
    const-string v0, "requires_storage_not_low"

    .line 225
    .line 226
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    move/from16 v30, v0

    .line 231
    .line 232
    const-string v0, "trigger_content_update_delay"

    .line 233
    .line 234
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    move/from16 v31, v0

    .line 239
    .line 240
    const-string v0, "trigger_max_content_delay"

    .line 241
    .line 242
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    move/from16 v32, v0

    .line 247
    .line 248
    const-string v0, "content_uri_triggers"

    .line 249
    .line 250
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    move/from16 v33, v0

    .line 255
    .line 256
    new-instance v0, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    :goto_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 262
    .line 263
    .line 264
    move-result v34

    .line 265
    if-eqz v34, :cond_9

    .line 266
    .line 267
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v36

    .line 271
    move/from16 v34, v14

    .line 272
    .line 273
    move/from16 v69, v15

    .line 274
    .line 275
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 276
    .line 277
    .line 278
    move-result-wide v14

    .line 279
    long-to-int v14, v14

    .line 280
    invoke-static {v14}, La/dqm0;->v(I)La/zov0;

    .line 281
    .line 282
    .line 283
    move-result-object v37

    .line 284
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v38

    .line 288
    invoke-interface {v1, v5}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v39

    .line 292
    invoke-interface {v1, v6}, La/xpg0;->getBlob(I)[B

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    sget-object v15, La/maj;->b:La/maj;

    .line 297
    .line 298
    invoke-static {v14}, La/nkb;->B([B)La/maj;

    .line 299
    .line 300
    .line 301
    move-result-object v40

    .line 302
    invoke-interface {v1, v7}, La/xpg0;->getBlob(I)[B

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    invoke-static {v14}, La/nkb;->B([B)La/maj;

    .line 307
    .line 308
    .line 309
    move-result-object v41

    .line 310
    invoke-interface {v1, v8}, La/xpg0;->getLong(I)J

    .line 311
    .line 312
    .line 313
    move-result-wide v42

    .line 314
    invoke-interface {v1, v9}, La/xpg0;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v44

    .line 318
    invoke-interface {v1, v10}, La/xpg0;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v46

    .line 322
    invoke-interface {v1, v11}, La/xpg0;->getLong(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v14

    .line 326
    long-to-int v14, v14

    .line 327
    move v15, v2

    .line 328
    move/from16 v70, v3

    .line 329
    .line 330
    invoke-interface {v1, v12}, La/xpg0;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    long-to-int v2, v2

    .line 335
    invoke-static {v2}, La/dqm0;->s(I)La/af5;

    .line 336
    .line 337
    .line 338
    move-result-object v50

    .line 339
    invoke-interface {v1, v13}, La/xpg0;->getLong(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v51

    .line 343
    move/from16 v2, v34

    .line 344
    .line 345
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v53

    .line 349
    move/from16 v3, v69

    .line 350
    .line 351
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 352
    .line 353
    .line 354
    move-result-wide v55

    .line 355
    move/from16 v34, v2

    .line 356
    .line 357
    move/from16 v2, p1

    .line 358
    .line 359
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 360
    .line 361
    .line 362
    move-result-wide v57

    .line 363
    move/from16 p1, v2

    .line 364
    .line 365
    move/from16 v69, v3

    .line 366
    .line 367
    move/from16 v2, v16

    .line 368
    .line 369
    move/from16 v16, v4

    .line 370
    .line 371
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    long-to-int v3, v3

    .line 376
    if-eqz v3, :cond_0

    .line 377
    .line 378
    const/16 v59, 0x1

    .line 379
    .line 380
    :goto_1
    move/from16 v3, v17

    .line 381
    .line 382
    move/from16 v17, v5

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :cond_0
    const/16 v59, 0x0

    .line 386
    .line 387
    goto :goto_1

    .line 388
    :goto_2
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    long-to-int v4, v4

    .line 393
    invoke-static {v4}, La/dqm0;->u(I)La/od80;

    .line 394
    .line 395
    .line 396
    move-result-object v60

    .line 397
    move v5, v2

    .line 398
    move/from16 v4, v18

    .line 399
    .line 400
    move/from16 v18, v3

    .line 401
    .line 402
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v2

    .line 406
    long-to-int v2, v2

    .line 407
    move/from16 v71, v5

    .line 408
    .line 409
    move/from16 v3, v19

    .line 410
    .line 411
    move/from16 v19, v4

    .line 412
    .line 413
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 414
    .line 415
    .line 416
    move-result-wide v4

    .line 417
    long-to-int v4, v4

    .line 418
    move/from16 v5, v20

    .line 419
    .line 420
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 421
    .line 422
    .line 423
    move-result-wide v63

    .line 424
    move/from16 v61, v2

    .line 425
    .line 426
    move/from16 v20, v3

    .line 427
    .line 428
    move/from16 v62, v4

    .line 429
    .line 430
    move/from16 v2, v21

    .line 431
    .line 432
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 433
    .line 434
    .line 435
    move-result-wide v3

    .line 436
    long-to-int v3, v3

    .line 437
    move/from16 v21, v2

    .line 438
    .line 439
    move/from16 v65, v3

    .line 440
    .line 441
    move/from16 v4, v22

    .line 442
    .line 443
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 444
    .line 445
    .line 446
    move-result-wide v2

    .line 447
    long-to-int v2, v2

    .line 448
    move/from16 v3, v23

    .line 449
    .line 450
    invoke-interface {v1, v3}, La/xpg0;->isNull(I)Z

    .line 451
    .line 452
    .line 453
    move-result v22

    .line 454
    const/16 v23, 0x0

    .line 455
    .line 456
    if-eqz v22, :cond_1

    .line 457
    .line 458
    move-object/from16 v67, v23

    .line 459
    .line 460
    :goto_3
    move/from16 v66, v2

    .line 461
    .line 462
    move/from16 v2, v24

    .line 463
    .line 464
    goto :goto_4

    .line 465
    :cond_1
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v22

    .line 469
    move-object/from16 v67, v22

    .line 470
    .line 471
    goto :goto_3

    .line 472
    :goto_4
    invoke-interface {v1, v2}, La/xpg0;->isNull(I)Z

    .line 473
    .line 474
    .line 475
    move-result v22

    .line 476
    if-eqz v22, :cond_2

    .line 477
    .line 478
    move/from16 v24, v3

    .line 479
    .line 480
    move/from16 v22, v4

    .line 481
    .line 482
    move-object/from16 v3, v23

    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_2
    move/from16 v24, v3

    .line 486
    .line 487
    move/from16 v22, v4

    .line 488
    .line 489
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 490
    .line 491
    .line 492
    move-result-wide v3

    .line 493
    long-to-int v3, v3

    .line 494
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    :goto_5
    if-eqz v3, :cond_4

    .line 499
    .line 500
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    if-eqz v3, :cond_3

    .line 505
    .line 506
    const/4 v3, 0x1

    .line 507
    goto :goto_6

    .line 508
    :cond_3
    const/4 v3, 0x0

    .line 509
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 510
    .line 511
    .line 512
    move-result-object v23

    .line 513
    :cond_4
    move-object/from16 v68, v23

    .line 514
    .line 515
    move/from16 v3, v25

    .line 516
    .line 517
    move/from16 v23, v5

    .line 518
    .line 519
    goto :goto_7

    .line 520
    :catchall_0
    move-exception v0

    .line 521
    goto/16 :goto_10

    .line 522
    .line 523
    :goto_7
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 524
    .line 525
    .line 526
    move-result-wide v4

    .line 527
    long-to-int v4, v4

    .line 528
    invoke-static {v4}, La/dqm0;->t(I)La/sl50;

    .line 529
    .line 530
    .line 531
    move-result-object v74

    .line 532
    move/from16 v4, v26

    .line 533
    .line 534
    invoke-interface {v1, v4}, La/xpg0;->getBlob(I)[B

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-static {v5}, La/dqm0;->A([B)La/hl50;

    .line 539
    .line 540
    .line 541
    move-result-object v73

    .line 542
    move/from16 v25, v2

    .line 543
    .line 544
    move/from16 v26, v3

    .line 545
    .line 546
    move/from16 v5, v27

    .line 547
    .line 548
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 549
    .line 550
    .line 551
    move-result-wide v2

    .line 552
    long-to-int v2, v2

    .line 553
    if-eqz v2, :cond_5

    .line 554
    .line 555
    const/16 v75, 0x1

    .line 556
    .line 557
    :goto_8
    move/from16 v27, v4

    .line 558
    .line 559
    move/from16 v2, v28

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :cond_5
    const/16 v75, 0x0

    .line 563
    .line 564
    goto :goto_8

    .line 565
    :goto_9
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 566
    .line 567
    .line 568
    move-result-wide v3

    .line 569
    long-to-int v3, v3

    .line 570
    if-eqz v3, :cond_6

    .line 571
    .line 572
    const/16 v76, 0x1

    .line 573
    .line 574
    :goto_a
    move/from16 v28, v5

    .line 575
    .line 576
    move/from16 v3, v29

    .line 577
    .line 578
    goto :goto_b

    .line 579
    :cond_6
    const/16 v76, 0x0

    .line 580
    .line 581
    goto :goto_a

    .line 582
    :goto_b
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v4

    .line 586
    long-to-int v4, v4

    .line 587
    if-eqz v4, :cond_7

    .line 588
    .line 589
    const/16 v77, 0x1

    .line 590
    .line 591
    :goto_c
    move v5, v2

    .line 592
    move/from16 v29, v3

    .line 593
    .line 594
    move/from16 v4, v30

    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_7
    const/16 v77, 0x0

    .line 598
    .line 599
    goto :goto_c

    .line 600
    :goto_d
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 601
    .line 602
    .line 603
    move-result-wide v2

    .line 604
    long-to-int v2, v2

    .line 605
    if-eqz v2, :cond_8

    .line 606
    .line 607
    const/16 v78, 0x1

    .line 608
    .line 609
    :goto_e
    move/from16 v2, v31

    .line 610
    .line 611
    goto :goto_f

    .line 612
    :cond_8
    const/16 v78, 0x0

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :goto_f
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 616
    .line 617
    .line 618
    move-result-wide v79

    .line 619
    move/from16 v3, v32

    .line 620
    .line 621
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 622
    .line 623
    .line 624
    move-result-wide v81

    .line 625
    move/from16 v31, v2

    .line 626
    .line 627
    move/from16 v2, v33

    .line 628
    .line 629
    invoke-interface {v1, v2}, La/xpg0;->getBlob(I)[B

    .line 630
    .line 631
    .line 632
    move-result-object v30

    .line 633
    invoke-static/range {v30 .. v30}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 634
    .line 635
    .line 636
    move-result-object v83

    .line 637
    new-instance v48, La/o4e;

    .line 638
    .line 639
    move-object/from16 v72, v48

    .line 640
    .line 641
    invoke-direct/range {v72 .. v83}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 642
    .line 643
    .line 644
    move-object/from16 v48, v72

    .line 645
    .line 646
    new-instance v35, La/ppv0;

    .line 647
    .line 648
    move/from16 v49, v14

    .line 649
    .line 650
    invoke-direct/range {v35 .. v68}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v14, v35

    .line 654
    .line 655
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 656
    .line 657
    .line 658
    move/from16 v14, v28

    .line 659
    .line 660
    move/from16 v28, v5

    .line 661
    .line 662
    move/from16 v5, v17

    .line 663
    .line 664
    move/from16 v17, v18

    .line 665
    .line 666
    move/from16 v18, v19

    .line 667
    .line 668
    move/from16 v19, v20

    .line 669
    .line 670
    move/from16 v20, v23

    .line 671
    .line 672
    move/from16 v23, v24

    .line 673
    .line 674
    move/from16 v24, v25

    .line 675
    .line 676
    move/from16 v25, v26

    .line 677
    .line 678
    move/from16 v26, v27

    .line 679
    .line 680
    move/from16 v27, v14

    .line 681
    .line 682
    move/from16 v33, v2

    .line 683
    .line 684
    move/from16 v32, v3

    .line 685
    .line 686
    move/from16 v30, v4

    .line 687
    .line 688
    move v2, v15

    .line 689
    move/from16 v4, v16

    .line 690
    .line 691
    move/from16 v14, v34

    .line 692
    .line 693
    move/from16 v15, v69

    .line 694
    .line 695
    move/from16 v3, v70

    .line 696
    .line 697
    move/from16 v16, v71

    .line 698
    .line 699
    goto/16 :goto_0

    .line 700
    .line 701
    :cond_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 702
    .line 703
    .line 704
    return-object v0

    .line 705
    :goto_10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 706
    .line 707
    .line 708
    throw v0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 83

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/qpg0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "SELECT * FROM workspec WHERE state=1"

    .line 9
    .line 10
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    const-string v0, "id"

    .line 15
    .line 16
    invoke-static {v1, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v2, "state"

    .line 21
    .line 22
    invoke-static {v1, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "worker_class_name"

    .line 27
    .line 28
    invoke-static {v1, v3}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "input_merger_class_name"

    .line 33
    .line 34
    invoke-static {v1, v4}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "input"

    .line 39
    .line 40
    invoke-static {v1, v5}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "output"

    .line 45
    .line 46
    invoke-static {v1, v6}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "initial_delay"

    .line 51
    .line 52
    invoke-static {v1, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "interval_duration"

    .line 57
    .line 58
    invoke-static {v1, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "flex_duration"

    .line 63
    .line 64
    invoke-static {v1, v9}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "run_attempt_count"

    .line 69
    .line 70
    invoke-static {v1, v10}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "backoff_policy"

    .line 75
    .line 76
    invoke-static {v1, v11}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "backoff_delay_duration"

    .line 81
    .line 82
    invoke-static {v1, v12}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "last_enqueue_time"

    .line 87
    .line 88
    invoke-static {v1, v13}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "minimum_retention_duration"

    .line 93
    .line 94
    invoke-static {v1, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "schedule_requested_at"

    .line 99
    .line 100
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    move/from16 p0, v15

    .line 105
    .line 106
    const-string v15, "run_in_foreground"

    .line 107
    .line 108
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    move/from16 p1, v15

    .line 113
    .line 114
    const-string v15, "out_of_quota_policy"

    .line 115
    .line 116
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    move/from16 v16, v15

    .line 121
    .line 122
    const-string v15, "period_count"

    .line 123
    .line 124
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    move/from16 v17, v15

    .line 129
    .line 130
    const-string v15, "generation"

    .line 131
    .line 132
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    move/from16 v18, v15

    .line 137
    .line 138
    const-string v15, "next_schedule_time_override"

    .line 139
    .line 140
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    move/from16 v19, v15

    .line 145
    .line 146
    const-string v15, "next_schedule_time_override_generation"

    .line 147
    .line 148
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    move/from16 v20, v15

    .line 153
    .line 154
    const-string v15, "stop_reason"

    .line 155
    .line 156
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    move/from16 v21, v15

    .line 161
    .line 162
    const-string v15, "trace_tag"

    .line 163
    .line 164
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    move/from16 v22, v15

    .line 169
    .line 170
    const-string v15, "backoff_on_system_interruptions"

    .line 171
    .line 172
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    move/from16 v23, v15

    .line 177
    .line 178
    const-string v15, "required_network_type"

    .line 179
    .line 180
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    move/from16 v24, v15

    .line 185
    .line 186
    const-string v15, "required_network_request"

    .line 187
    .line 188
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    move/from16 v25, v15

    .line 193
    .line 194
    const-string v15, "requires_charging"

    .line 195
    .line 196
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    move/from16 v26, v15

    .line 201
    .line 202
    const-string v15, "requires_device_idle"

    .line 203
    .line 204
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v15

    .line 208
    move/from16 v27, v15

    .line 209
    .line 210
    const-string v15, "requires_battery_not_low"

    .line 211
    .line 212
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    move/from16 v28, v15

    .line 217
    .line 218
    const-string v15, "requires_storage_not_low"

    .line 219
    .line 220
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v15

    .line 224
    move/from16 v29, v15

    .line 225
    .line 226
    const-string v15, "trigger_content_update_delay"

    .line 227
    .line 228
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    move/from16 v30, v15

    .line 233
    .line 234
    const-string v15, "trigger_max_content_delay"

    .line 235
    .line 236
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    move/from16 v31, v15

    .line 241
    .line 242
    const-string v15, "content_uri_triggers"

    .line 243
    .line 244
    invoke-static {v1, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    move/from16 v32, v15

    .line 249
    .line 250
    new-instance v15, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    :goto_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 256
    .line 257
    .line 258
    move-result v33

    .line 259
    if-eqz v33, :cond_9

    .line 260
    .line 261
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v35

    .line 265
    move/from16 v33, v14

    .line 266
    .line 267
    move-object/from16 v68, v15

    .line 268
    .line 269
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 270
    .line 271
    .line 272
    move-result-wide v14

    .line 273
    long-to-int v14, v14

    .line 274
    invoke-static {v14}, La/dqm0;->v(I)La/zov0;

    .line 275
    .line 276
    .line 277
    move-result-object v36

    .line 278
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v37

    .line 282
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v38

    .line 286
    invoke-interface {v1, v5}, La/xpg0;->getBlob(I)[B

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    sget-object v15, La/maj;->b:La/maj;

    .line 291
    .line 292
    invoke-static {v14}, La/nkb;->B([B)La/maj;

    .line 293
    .line 294
    .line 295
    move-result-object v39

    .line 296
    invoke-interface {v1, v6}, La/xpg0;->getBlob(I)[B

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-static {v14}, La/nkb;->B([B)La/maj;

    .line 301
    .line 302
    .line 303
    move-result-object v40

    .line 304
    invoke-interface {v1, v7}, La/xpg0;->getLong(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v41

    .line 308
    invoke-interface {v1, v8}, La/xpg0;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v43

    .line 312
    invoke-interface {v1, v9}, La/xpg0;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v45

    .line 316
    invoke-interface {v1, v10}, La/xpg0;->getLong(I)J

    .line 317
    .line 318
    .line 319
    move-result-wide v14

    .line 320
    long-to-int v14, v14

    .line 321
    move v15, v2

    .line 322
    move/from16 v69, v3

    .line 323
    .line 324
    invoke-interface {v1, v11}, La/xpg0;->getLong(I)J

    .line 325
    .line 326
    .line 327
    move-result-wide v2

    .line 328
    long-to-int v2, v2

    .line 329
    invoke-static {v2}, La/dqm0;->s(I)La/af5;

    .line 330
    .line 331
    .line 332
    move-result-object v49

    .line 333
    invoke-interface {v1, v12}, La/xpg0;->getLong(I)J

    .line 334
    .line 335
    .line 336
    move-result-wide v50

    .line 337
    invoke-interface {v1, v13}, La/xpg0;->getLong(I)J

    .line 338
    .line 339
    .line 340
    move-result-wide v52

    .line 341
    move/from16 v2, v33

    .line 342
    .line 343
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 344
    .line 345
    .line 346
    move-result-wide v54

    .line 347
    move/from16 v3, p0

    .line 348
    .line 349
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v56

    .line 353
    move/from16 p0, v0

    .line 354
    .line 355
    move/from16 v33, v2

    .line 356
    .line 357
    move/from16 v0, p1

    .line 358
    .line 359
    move/from16 p1, v3

    .line 360
    .line 361
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v2

    .line 365
    long-to-int v2, v2

    .line 366
    const/16 v34, 0x1

    .line 367
    .line 368
    if-eqz v2, :cond_0

    .line 369
    .line 370
    move/from16 v58, v34

    .line 371
    .line 372
    :goto_1
    move/from16 v2, v16

    .line 373
    .line 374
    move/from16 v16, v4

    .line 375
    .line 376
    goto :goto_2

    .line 377
    :cond_0
    const/16 v58, 0x0

    .line 378
    .line 379
    goto :goto_1

    .line 380
    :goto_2
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v3

    .line 384
    long-to-int v3, v3

    .line 385
    invoke-static {v3}, La/dqm0;->u(I)La/od80;

    .line 386
    .line 387
    .line 388
    move-result-object v59

    .line 389
    move/from16 v3, v17

    .line 390
    .line 391
    move/from16 v17, v5

    .line 392
    .line 393
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 394
    .line 395
    .line 396
    move-result-wide v4

    .line 397
    long-to-int v4, v4

    .line 398
    move/from16 v70, v3

    .line 399
    .line 400
    move/from16 v5, v18

    .line 401
    .line 402
    move/from16 v18, v2

    .line 403
    .line 404
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 405
    .line 406
    .line 407
    move-result-wide v2

    .line 408
    long-to-int v2, v2

    .line 409
    move/from16 v3, v19

    .line 410
    .line 411
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 412
    .line 413
    .line 414
    move-result-wide v62

    .line 415
    move/from16 v19, v0

    .line 416
    .line 417
    move/from16 v61, v2

    .line 418
    .line 419
    move/from16 v0, v20

    .line 420
    .line 421
    move/from16 v20, v3

    .line 422
    .line 423
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 424
    .line 425
    .line 426
    move-result-wide v2

    .line 427
    long-to-int v2, v2

    .line 428
    move/from16 v60, v4

    .line 429
    .line 430
    move/from16 v3, v21

    .line 431
    .line 432
    move/from16 v21, v5

    .line 433
    .line 434
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 435
    .line 436
    .line 437
    move-result-wide v4

    .line 438
    long-to-int v4, v4

    .line 439
    move/from16 v5, v22

    .line 440
    .line 441
    invoke-interface {v1, v5}, La/xpg0;->isNull(I)Z

    .line 442
    .line 443
    .line 444
    move-result v22

    .line 445
    const/16 v48, 0x0

    .line 446
    .line 447
    if-eqz v22, :cond_1

    .line 448
    .line 449
    move-object/from16 v66, v48

    .line 450
    .line 451
    :goto_3
    move/from16 v22, v0

    .line 452
    .line 453
    move/from16 v0, v23

    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_1
    invoke-interface {v1, v5}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v22

    .line 460
    move-object/from16 v66, v22

    .line 461
    .line 462
    goto :goto_3

    .line 463
    :goto_4
    invoke-interface {v1, v0}, La/xpg0;->isNull(I)Z

    .line 464
    .line 465
    .line 466
    move-result v23

    .line 467
    if-eqz v23, :cond_2

    .line 468
    .line 469
    move/from16 v64, v2

    .line 470
    .line 471
    move/from16 v23, v3

    .line 472
    .line 473
    move-object/from16 v2, v48

    .line 474
    .line 475
    goto :goto_5

    .line 476
    :cond_2
    move/from16 v64, v2

    .line 477
    .line 478
    move/from16 v23, v3

    .line 479
    .line 480
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 481
    .line 482
    .line 483
    move-result-wide v2

    .line 484
    long-to-int v2, v2

    .line 485
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    :goto_5
    if-eqz v2, :cond_4

    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_3

    .line 496
    .line 497
    move/from16 v2, v34

    .line 498
    .line 499
    goto :goto_6

    .line 500
    :cond_3
    const/4 v2, 0x0

    .line 501
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object v48

    .line 505
    :cond_4
    move/from16 v65, v4

    .line 506
    .line 507
    move/from16 v2, v24

    .line 508
    .line 509
    move-object/from16 v67, v48

    .line 510
    .line 511
    goto :goto_7

    .line 512
    :catchall_0
    move-exception v0

    .line 513
    goto/16 :goto_10

    .line 514
    .line 515
    :goto_7
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 516
    .line 517
    .line 518
    move-result-wide v3

    .line 519
    long-to-int v3, v3

    .line 520
    invoke-static {v3}, La/dqm0;->t(I)La/sl50;

    .line 521
    .line 522
    .line 523
    move-result-object v73

    .line 524
    move/from16 v3, v25

    .line 525
    .line 526
    invoke-interface {v1, v3}, La/xpg0;->getBlob(I)[B

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    invoke-static {v4}, La/dqm0;->A([B)La/hl50;

    .line 531
    .line 532
    .line 533
    move-result-object v72

    .line 534
    move/from16 v24, v2

    .line 535
    .line 536
    move/from16 v25, v3

    .line 537
    .line 538
    move/from16 v4, v26

    .line 539
    .line 540
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v2

    .line 544
    long-to-int v2, v2

    .line 545
    if-eqz v2, :cond_5

    .line 546
    .line 547
    move/from16 v74, v34

    .line 548
    .line 549
    :goto_8
    move/from16 v26, v4

    .line 550
    .line 551
    move/from16 v2, v27

    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_5
    const/16 v74, 0x0

    .line 555
    .line 556
    goto :goto_8

    .line 557
    :goto_9
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 558
    .line 559
    .line 560
    move-result-wide v3

    .line 561
    long-to-int v3, v3

    .line 562
    if-eqz v3, :cond_6

    .line 563
    .line 564
    move/from16 v75, v34

    .line 565
    .line 566
    :goto_a
    move/from16 v27, v5

    .line 567
    .line 568
    move/from16 v3, v28

    .line 569
    .line 570
    goto :goto_b

    .line 571
    :cond_6
    const/16 v75, 0x0

    .line 572
    .line 573
    goto :goto_a

    .line 574
    :goto_b
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 575
    .line 576
    .line 577
    move-result-wide v4

    .line 578
    long-to-int v4, v4

    .line 579
    if-eqz v4, :cond_7

    .line 580
    .line 581
    move/from16 v76, v34

    .line 582
    .line 583
    :goto_c
    move v5, v2

    .line 584
    move/from16 v28, v3

    .line 585
    .line 586
    move/from16 v4, v29

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_7
    const/16 v76, 0x0

    .line 590
    .line 591
    goto :goto_c

    .line 592
    :goto_d
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 593
    .line 594
    .line 595
    move-result-wide v2

    .line 596
    long-to-int v2, v2

    .line 597
    if-eqz v2, :cond_8

    .line 598
    .line 599
    move/from16 v77, v34

    .line 600
    .line 601
    :goto_e
    move/from16 v2, v30

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_8
    const/16 v77, 0x0

    .line 605
    .line 606
    goto :goto_e

    .line 607
    :goto_f
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 608
    .line 609
    .line 610
    move-result-wide v78

    .line 611
    move/from16 v3, v31

    .line 612
    .line 613
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 614
    .line 615
    .line 616
    move-result-wide v80

    .line 617
    move/from16 v29, v0

    .line 618
    .line 619
    move/from16 v0, v32

    .line 620
    .line 621
    invoke-interface {v1, v0}, La/xpg0;->getBlob(I)[B

    .line 622
    .line 623
    .line 624
    move-result-object v30

    .line 625
    invoke-static/range {v30 .. v30}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 626
    .line 627
    .line 628
    move-result-object v82

    .line 629
    new-instance v47, La/o4e;

    .line 630
    .line 631
    move-object/from16 v71, v47

    .line 632
    .line 633
    invoke-direct/range {v71 .. v82}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 634
    .line 635
    .line 636
    move-object/from16 v47, v71

    .line 637
    .line 638
    new-instance v34, La/ppv0;

    .line 639
    .line 640
    move/from16 v48, v14

    .line 641
    .line 642
    invoke-direct/range {v34 .. v67}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 643
    .line 644
    .line 645
    move-object/from16 v14, v34

    .line 646
    .line 647
    move/from16 v32, v0

    .line 648
    .line 649
    move-object/from16 v0, v68

    .line 650
    .line 651
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 652
    .line 653
    .line 654
    move/from16 v14, v29

    .line 655
    .line 656
    move/from16 v29, v4

    .line 657
    .line 658
    move/from16 v4, v16

    .line 659
    .line 660
    move/from16 v16, v18

    .line 661
    .line 662
    move/from16 v18, v21

    .line 663
    .line 664
    move/from16 v21, v23

    .line 665
    .line 666
    move/from16 v23, v14

    .line 667
    .line 668
    move/from16 v30, v2

    .line 669
    .line 670
    move/from16 v31, v3

    .line 671
    .line 672
    move v2, v15

    .line 673
    move/from16 v14, v33

    .line 674
    .line 675
    move/from16 v3, v69

    .line 676
    .line 677
    move-object v15, v0

    .line 678
    move/from16 v0, p0

    .line 679
    .line 680
    move/from16 p0, p1

    .line 681
    .line 682
    move/from16 p1, v19

    .line 683
    .line 684
    move/from16 v19, v20

    .line 685
    .line 686
    move/from16 v20, v22

    .line 687
    .line 688
    move/from16 v22, v27

    .line 689
    .line 690
    move/from16 v27, v5

    .line 691
    .line 692
    move/from16 v5, v17

    .line 693
    .line 694
    move/from16 v17, v70

    .line 695
    .line 696
    goto/16 :goto_0

    .line 697
    .line 698
    :cond_9
    move-object v0, v15

    .line 699
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 700
    .line 701
    .line 702
    return-object v0

    .line 703
    :goto_10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 704
    .line 705
    .line 706
    throw v0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La/g1a;

    .line 9
    .line 10
    invoke-direct {v1, v0}, La/g1a;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "KEY_ANCHOR_MODEL"

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "|"

    .line 22
    .line 23
    filled-new-array {v2}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x6

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v0, v2, v4, v3}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v5, "REST:"

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v7, v3

    .line 50
    check-cast v7, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v7, v5, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v3, 0x0

    .line 60
    :goto_0
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    sget-object v2, La/csv0;->a:La/csv0;

    .line 63
    .line 64
    const-string v7, "CONTENT"

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-static {v5, v3}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    move-object v3, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-static {v3}, Lkotlin/text/b;->j(Ljava/lang/String;)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-static {v3}, La/msm0;->a(F)La/dsv0;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    const/4 v3, 0x0

    .line 96
    :goto_1
    if-eqz v3, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    const v3, 0x3f19999a    # 0.6f

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, La/msm0;->a(F)La/dsv0;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    const-string v8, "EXPAND:"

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    move-object v9, v5

    .line 123
    check-cast v9, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v9, v8, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_5

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    const/4 v5, 0x0

    .line 133
    :goto_3
    check-cast v5, Ljava/lang/String;

    .line 134
    .line 135
    const-string v0, "NONE"

    .line 136
    .line 137
    if-eqz v5, :cond_9

    .line 138
    .line 139
    invoke-static {v8, v5}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_7

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_7
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_8

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_8
    invoke-static {v5}, Lkotlin/text/b;->j(Ljava/lang/String;)Ljava/lang/Float;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-eqz v2, :cond_9

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-static {v2}, La/msm0;->a(F)La/dsv0;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    goto :goto_5

    .line 172
    :cond_9
    :goto_4
    const/4 v2, 0x0

    .line 173
    :goto_5
    new-instance v5, La/bsv0;

    .line 174
    .line 175
    invoke-direct {v5, v3, v2}, La/bsv0;-><init>(La/esv0;La/esv0;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, La/msv0;

    .line 179
    .line 180
    sget-object v3, La/qmk;->a:La/zcl;

    .line 181
    .line 182
    const/high16 v3, 0x42f00000    # 120.0f

    .line 183
    .line 184
    const-string v7, "KEY_MAX_BOUNCE_DISTANCE"

    .line 185
    .line 186
    invoke-virtual {v1, v3, v7}, La/g1a;->a(FLjava/lang/String;)F

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    invoke-direct {v2, v3}, La/msv0;-><init>(F)V

    .line 191
    .line 192
    .line 193
    const-string v3, "KEY_DRAG_MODE"

    .line 194
    .line 195
    const-string v7, "FREE"

    .line 196
    .line 197
    invoke-virtual {v1, v3, v7}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    const-string v7, "ANCHORS_ONLY"

    .line 202
    .line 203
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_a

    .line 208
    .line 209
    sget-object v3, La/stv0;->b:La/stv0;

    .line 210
    .line 211
    :goto_6
    move-object v14, v3

    .line 212
    goto :goto_7

    .line 213
    :cond_a
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_b

    .line 218
    .line 219
    sget-object v3, La/stv0;->c:La/stv0;

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_b
    sget-object v3, La/stv0;->a:La/stv0;

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :goto_7
    new-instance v7, La/bxv0;

    .line 226
    .line 227
    new-instance v8, La/cxv0;

    .line 228
    .line 229
    sget-wide v9, La/y3d;->g:J

    .line 230
    .line 231
    const-string v3, "KEY_SHEET_BACKGROUND_COLOR"

    .line 232
    .line 233
    invoke-virtual {v1, v9, v10, v3}, La/g1a;->b(JLjava/lang/String;)J

    .line 234
    .line 235
    .line 236
    move-result-wide v11

    .line 237
    sget-object v3, La/h2t0;->b:La/g2t0;

    .line 238
    .line 239
    const-string v3, "KEY_SHEET_CORNER_RADIUS"

    .line 240
    .line 241
    const/high16 v13, 0x41a00000    # 20.0f

    .line 242
    .line 243
    invoke-virtual {v1, v13, v3}, La/g1a;->a(FLjava/lang/String;)F

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    invoke-direct {v8, v3, v11, v12}, La/cxv0;-><init>(FJ)V

    .line 248
    .line 249
    .line 250
    new-instance v15, La/jtv0;

    .line 251
    .line 252
    const-string v3, "KEY_DRAG_HANDLE_STYLE"

    .line 253
    .line 254
    const-string v11, "THEME"

    .line 255
    .line 256
    invoke-virtual {v1, v3, v11}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    if-eqz v11, :cond_c

    .line 265
    .line 266
    new-instance v3, La/ptv0;

    .line 267
    .line 268
    invoke-direct {v3, v9, v10}, La/ptv0;-><init>(J)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v16, v3

    .line 272
    .line 273
    move-object/from16 p1, v7

    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_c
    const-string v11, "THEME:"

    .line 277
    .line 278
    invoke-static {v3, v11, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 279
    .line 280
    .line 281
    move-result v12

    .line 282
    if-eqz v12, :cond_e

    .line 283
    .line 284
    new-instance v12, La/ptv0;

    .line 285
    .line 286
    invoke-static {v11, v3}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-static {v3}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    if-eqz v3, :cond_d

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide v16

    .line 300
    move-object/from16 p1, v7

    .line 301
    .line 302
    move-wide/from16 v6, v16

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_d
    move-object/from16 p1, v7

    .line 306
    .line 307
    move-wide v6, v9

    .line 308
    :goto_8
    invoke-direct {v12, v6, v7}, La/ptv0;-><init>(J)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v16, v12

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_e
    move-object/from16 p1, v7

    .line 315
    .line 316
    const-string v6, "STATIC"

    .line 317
    .line 318
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    if-eqz v6, :cond_f

    .line 323
    .line 324
    sget-object v3, La/otv0;->a:La/otv0;

    .line 325
    .line 326
    :goto_9
    move-object/from16 v16, v3

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_f
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_10

    .line 334
    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    goto :goto_a

    .line 338
    :cond_10
    new-instance v3, La/ptv0;

    .line 339
    .line 340
    invoke-direct {v3, v9, v10}, La/ptv0;-><init>(J)V

    .line 341
    .line 342
    .line 343
    goto :goto_9

    .line 344
    :goto_a
    const-string v3, "KEY_DRAG_HANDLE_BACKGROUND_COLOR"

    .line 345
    .line 346
    invoke-virtual {v1, v9, v10, v3}, La/g1a;->b(JLjava/lang/String;)J

    .line 347
    .line 348
    .line 349
    move-result-wide v17

    .line 350
    const-string v3, "KEY_DRAG_HANDLE_PLACEMENT"

    .line 351
    .line 352
    const-string v6, "STACKED"

    .line 353
    .line 354
    invoke-virtual {v1, v3, v6}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    const-string v6, "OVERLAY"

    .line 359
    .line 360
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-eqz v3, :cond_11

    .line 365
    .line 366
    sget-object v3, La/ltv0;->a:La/ltv0;

    .line 367
    .line 368
    :goto_b
    move-object/from16 v19, v3

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_11
    sget-object v3, La/mtv0;->a:La/mtv0;

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :goto_c
    const-string v3, "KEY_DRAG_HANDLE_ZONE_HEIGHT"

    .line 375
    .line 376
    invoke-virtual {v1, v13, v3}, La/g1a;->a(FLjava/lang/String;)F

    .line 377
    .line 378
    .line 379
    move-result v20

    .line 380
    const-string v3, "KEY_DRAG_HANDLE_SIZE_WIDTH"

    .line 381
    .line 382
    const/high16 v6, 0x42100000    # 36.0f

    .line 383
    .line 384
    invoke-virtual {v1, v6, v3}, La/g1a;->a(FLjava/lang/String;)F

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    const-string v6, "KEY_DRAG_HANDLE_SIZE_HEIGHT"

    .line 389
    .line 390
    const/high16 v7, 0x40800000    # 4.0f

    .line 391
    .line 392
    invoke-virtual {v1, v7, v6}, La/g1a;->a(FLjava/lang/String;)F

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    invoke-static {v3, v6}, La/qbc;->i(FF)J

    .line 397
    .line 398
    .line 399
    move-result-wide v21

    .line 400
    invoke-direct/range {v15 .. v22}, La/jtv0;-><init>(La/qtv0;JLa/ntv0;FJ)V

    .line 401
    .line 402
    .line 403
    const-string v3, "KEY_BACKDROP"

    .line 404
    .line 405
    const-string v6, "DIM_BEHIND_DISMISS_TRUE"

    .line 406
    .line 407
    invoke-virtual {v1, v3, v6}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    const v7, 0x24a738

    .line 416
    .line 417
    .line 418
    if-eq v6, v7, :cond_16

    .line 419
    .line 420
    const v0, 0x24a2d820

    .line 421
    .line 422
    .line 423
    if-eq v6, v0, :cond_14

    .line 424
    .line 425
    const v0, 0x24df976b

    .line 426
    .line 427
    .line 428
    if-eq v6, v0, :cond_12

    .line 429
    .line 430
    goto :goto_d

    .line 431
    :cond_12
    const-string v0, "SHADOW_ONLY"

    .line 432
    .line 433
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-nez v0, :cond_13

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_13
    sget-object v0, La/ksv0;->a:La/ksv0;

    .line 441
    .line 442
    goto :goto_e

    .line 443
    :cond_14
    const-string v0, "DIM_BEHIND_DISMISS_FALSE"

    .line 444
    .line 445
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-nez v0, :cond_15

    .line 450
    .line 451
    goto :goto_d

    .line 452
    :cond_15
    new-instance v0, La/isv0;

    .line 453
    .line 454
    invoke-direct {v0, v4}, La/isv0;-><init>(Z)V

    .line 455
    .line 456
    .line 457
    goto :goto_e

    .line 458
    :cond_16
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_17

    .line 463
    .line 464
    :goto_d
    new-instance v0, La/isv0;

    .line 465
    .line 466
    const/4 v3, 0x1

    .line 467
    invoke-direct {v0, v3}, La/isv0;-><init>(Z)V

    .line 468
    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_17
    sget-object v0, La/jsv0;->a:La/jsv0;

    .line 472
    .line 473
    :goto_e
    const-string v3, "KEY_SCRIM_COLOR"

    .line 474
    .line 475
    invoke-virtual {v1, v9, v10, v3}, La/g1a;->b(JLjava/lang/String;)J

    .line 476
    .line 477
    .line 478
    move-result-wide v11

    .line 479
    const-string v3, "KEY_HORIZONTAL_SWIPE_ENABLED"

    .line 480
    .line 481
    iget-object v6, v1, La/g1a;->a:Ljava/util/Map;

    .line 482
    .line 483
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    instance-of v6, v3, Ljava/lang/Boolean;

    .line 488
    .line 489
    if-eqz v6, :cond_18

    .line 490
    .line 491
    move-object v6, v3

    .line 492
    check-cast v6, Ljava/lang/Boolean;

    .line 493
    .line 494
    goto :goto_f

    .line 495
    :cond_18
    const/4 v6, 0x0

    .line 496
    :goto_f
    if-eqz v6, :cond_19

    .line 497
    .line 498
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 499
    .line 500
    .line 501
    move-result v4

    .line 502
    :cond_19
    move-object/from16 v7, p1

    .line 503
    .line 504
    move-object v10, v0

    .line 505
    move v13, v4

    .line 506
    move-object v9, v15

    .line 507
    invoke-direct/range {v7 .. v14}, La/bxv0;-><init>(La/cxv0;La/jtv0;La/lsv0;JZLa/stv0;)V

    .line 508
    .line 509
    .line 510
    const-string v0, "KEY_CURRENT_VALUE"

    .line 511
    .line 512
    const-string v3, "SHEET_VALUE_HIDDEN_TAG"

    .line 513
    .line 514
    invoke-virtual {v1, v0, v3}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    const v6, -0x45042ded

    .line 523
    .line 524
    .line 525
    sget-object v8, La/jxv0;->a:La/jxv0;

    .line 526
    .line 527
    if-eq v4, v6, :cond_1e

    .line 528
    .line 529
    const v3, -0x2333e4fd

    .line 530
    .line 531
    .line 532
    if-eq v4, v3, :cond_1c

    .line 533
    .line 534
    const v3, 0x270842bd

    .line 535
    .line 536
    .line 537
    if-eq v4, v3, :cond_1a

    .line 538
    .line 539
    goto :goto_10

    .line 540
    :cond_1a
    const-string v3, "SHEET_VALUE_REST_TAG"

    .line 541
    .line 542
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-nez v0, :cond_1b

    .line 547
    .line 548
    goto :goto_10

    .line 549
    :cond_1b
    sget-object v8, La/kxv0;->a:La/kxv0;

    .line 550
    .line 551
    goto :goto_10

    .line 552
    :cond_1c
    const-string v3, "SHEET_VALUE_EXPAND_TAG"

    .line 553
    .line 554
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-nez v0, :cond_1d

    .line 559
    .line 560
    goto :goto_10

    .line 561
    :cond_1d
    sget-object v8, La/ixv0;->a:La/ixv0;

    .line 562
    .line 563
    goto :goto_10

    .line 564
    :cond_1e
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    :goto_10
    new-instance v0, La/ywv0;

    .line 569
    .line 570
    const-string v3, "KEY_BOTTOM_KEYBOARD_PLACEMENT"

    .line 571
    .line 572
    const-string v4, "STAY_UNDER_KEYBOARD"

    .line 573
    .line 574
    invoke-virtual {v1, v3, v4}, La/g1a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    const-string v3, "LIFT"

    .line 579
    .line 580
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-eqz v1, :cond_1f

    .line 585
    .line 586
    sget-object v1, La/ssv0;->a:La/ssv0;

    .line 587
    .line 588
    goto :goto_11

    .line 589
    :cond_1f
    sget-object v1, La/ssv0;->b:La/ssv0;

    .line 590
    .line 591
    :goto_11
    invoke-direct {v0, v5, v2, v1, v7}, La/ywv0;-><init>(La/bsv0;La/msv0;La/ssv0;La/bxv0;)V

    .line 592
    .line 593
    .line 594
    iget-object v1, v0, La/ywv0;->d:La/glt0;

    .line 595
    .line 596
    iget-object v1, v1, La/glt0;->d:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v1, La/pz40;

    .line 599
    .line 600
    check-cast v1, La/hgk0;

    .line 601
    .line 602
    invoke-virtual {v1, v8}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    return-object v0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/n7w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 7
    .line 8
    new-instance p0, La/l8w0;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 14
    .line 15
    iput-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 18
    .line 19
    iput-object v0, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 22
    .line 23
    iput-object v0, p0, La/l8w0;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p0}, La/l8w0;->a()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, La/wxs0;->c()I

    .line 29
    .line 30
    .line 31
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x2710

    .line 36
    .line 37
    invoke-static {v0}, La/wxs0;->a(I)D

    .line 38
    .line 39
    .line 40
    const v0, 0xc350

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, La/wxs0;->a(I)D

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    const v0, 0x1e8480

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, La/wxs0;->a(I)D

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    const-wide/16 v7, 0x0

    .line 55
    .line 56
    cmpg-double v0, v3, v7

    .line 57
    .line 58
    if-gtz v0, :cond_0

    .line 59
    .line 60
    sget-object v0, La/z7w0;->d:La/z7w0;

    .line 61
    .line 62
    :goto_0
    move-object v7, v0

    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    div-double v7, v5, v3

    .line 67
    .line 68
    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    .line 69
    .line 70
    cmpg-double v0, v7, v9

    .line 71
    .line 72
    if-gez v0, :cond_1

    .line 73
    .line 74
    const-wide/high16 v9, 0x4014000000000000L    # 5.0

    .line 75
    .line 76
    cmpg-double v0, v5, v9

    .line 77
    .line 78
    if-gez v0, :cond_1

    .line 79
    .line 80
    sget-object v0, La/z7w0;->b:La/z7w0;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const-wide/high16 v9, 0x4024000000000000L    # 10.0

    .line 84
    .line 85
    cmpl-double v0, v7, v9

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    sget-object v0, La/z7w0;->c:La/z7w0;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sget-object v0, La/z7w0;->a:La/z7w0;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :goto_1
    new-instance v2, La/a8w0;

    .line 96
    .line 97
    invoke-direct/range {v2 .. v7}, La/a8w0;-><init>(DDLa/z7w0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    .line 99
    .line 100
    :try_start_3
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 101
    .line 102
    .line 103
    :try_start_4
    invoke-virtual {p0}, La/l8w0;->b()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move-object p0, v0

    .line 109
    goto :goto_4

    .line 110
    :catchall_2
    move-exception v0

    .line 111
    goto :goto_3

    .line 112
    :goto_2
    :try_start_5
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 113
    .line 114
    .line 115
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 116
    :goto_3
    :try_start_6
    invoke-virtual {p0}, La/l8w0;->b()V

    .line 117
    .line 118
    .line 119
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 120
    :goto_4
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 121
    .line 122
    new-instance v2, La/g0g0;

    .line 123
    .line 124
    invoke-direct {v2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :goto_5
    instance-of p0, v2, La/g0g0;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    if-eqz p0, :cond_3

    .line 131
    .line 132
    move-object v2, v0

    .line 133
    :cond_3
    check-cast v2, La/a8w0;

    .line 134
    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    iget-wide v3, v2, La/a8w0;->a:D

    .line 138
    .line 139
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    goto :goto_6

    .line 144
    :cond_4
    move-object p0, v0

    .line 145
    :goto_6
    const-string v1, "baselineTimeMs"

    .line 146
    .line 147
    invoke-virtual {p1, p0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    if-eqz v2, :cond_5

    .line 151
    .line 152
    iget-wide v3, v2, La/a8w0;->b:D

    .line 153
    .line 154
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    goto :goto_7

    .line 159
    :cond_5
    move-object p0, v0

    .line 160
    :goto_7
    const-string v1, "heavyLoadTimeMs"

    .line 161
    .line 162
    invoke-virtual {p1, p0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    iget-object v0, v2, La/a8w0;->c:La/z7w0;

    .line 168
    .line 169
    :cond_6
    const-string p0, "suspectedArchitecture"

    .line 170
    .line 171
    invoke-virtual {p1, v0, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, La/n7w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    const/16 v0, 0xc8

    .line 9
    .line 10
    invoke-static {v0, v0, p0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :try_start_0
    new-instance v2, Landroid/graphics/Canvas;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 29
    .line 30
    .line 31
    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 32
    .line 33
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 34
    .line 35
    .line 36
    const/high16 v5, 0x40000000    # 2.0f

    .line 37
    .line 38
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Landroid/graphics/LinearGradient;

    .line 42
    .line 43
    const/high16 v5, -0x10000

    .line 44
    .line 45
    const v7, -0xffff01

    .line 46
    .line 47
    .line 48
    filled-new-array {v5, v7}, [I

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/high16 v9, 0x43480000    # 200.0f

    .line 57
    .line 58
    const/high16 v10, 0x43480000    # 200.0f

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 65
    .line 66
    .line 67
    const/high16 v5, 0x42480000    # 50.0f

    .line 68
    .line 69
    const/high16 v6, 0x42c80000    # 100.0f

    .line 70
    .line 71
    invoke-virtual {v2, v6, v6, v5, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 76
    .line 77
    .line 78
    const v5, -0xff0100

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    .line 83
    .line 84
    new-instance v6, Landroid/graphics/Path;

    .line 85
    .line 86
    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 87
    .line 88
    .line 89
    const/high16 v5, 0x41200000    # 10.0f

    .line 90
    .line 91
    invoke-virtual {v6, v5, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 92
    .line 93
    .line 94
    const/high16 v11, 0x433e0000    # 190.0f

    .line 95
    .line 96
    const/high16 v12, 0x433e0000    # 190.0f

    .line 97
    .line 98
    const/high16 v7, 0x42480000    # 50.0f

    .line 99
    .line 100
    const/high16 v8, 0x43160000    # 150.0f

    .line 101
    .line 102
    const/high16 v9, 0x43160000    # 150.0f

    .line 103
    .line 104
    const/high16 v10, 0x42480000    # 50.0f

    .line 105
    .line 106
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v6, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 113
    .line 114
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 115
    .line 116
    .line 117
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 118
    .line 119
    const/16 v6, 0x64

    .line 120
    .line 121
    invoke-virtual {v1, v3, v6, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const/4 v7, 0x2

    .line 129
    invoke-static {v2, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 137
    .line 138
    .line 139
    const-string v1, "Geometry"

    .line 140
    .line 141
    invoke-virtual {p1, v2, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const/16 v1, 0x32

    .line 145
    .line 146
    invoke-static {v0, v1, p0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    :try_start_1
    new-instance v0, Landroid/graphics/Canvas;

    .line 154
    .line 155
    invoke-direct {v0, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Landroid/graphics/Paint;

    .line 159
    .line 160
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 161
    .line 162
    .line 163
    const/high16 v2, -0x1000000

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 166
    .line 167
    .line 168
    const/high16 v2, 0x41f00000    # 30.0f

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 174
    .line 175
    .line 176
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 177
    .line 178
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 179
    .line 180
    .line 181
    const-string v2, "Fingerprint_Test_123!@#"

    .line 182
    .line 183
    const/high16 v4, 0x420c0000    # 35.0f

    .line 184
    .line 185
    invoke-virtual {v0, v2, v5, v4, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v3, v6, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 208
    .line 209
    .line 210
    const-string p0, "Canvas"

    .line 211
    .line 212
    invoke-virtual {p1, v0, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    :catchall_0
    move-exception v0

    .line 219
    move-object p1, v0

    .line 220
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 221
    .line 222
    .line 223
    throw p1

    .line 224
    :catchall_1
    move-exception v0

    .line 225
    move-object p0, v0

    .line 226
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 227
    .line 228
    .line 229
    throw p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 85

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ejv0;->a:B

    .line 4
    .line 5
    const-string v2, "generation"

    .line 6
    .line 7
    const-string v3, "period_count"

    .line 8
    .line 9
    const-string v4, "out_of_quota_policy"

    .line 10
    .line 11
    const-string v5, "run_in_foreground"

    .line 12
    .line 13
    const-string v6, "schedule_requested_at"

    .line 14
    .line 15
    const-string v7, "minimum_retention_duration"

    .line 16
    .line 17
    const-string v8, "last_enqueue_time"

    .line 18
    .line 19
    const-string v9, "backoff_delay_duration"

    .line 20
    .line 21
    const-string v10, "backoff_policy"

    .line 22
    .line 23
    const-string v11, "run_attempt_count"

    .line 24
    .line 25
    const-string v12, "flex_duration"

    .line 26
    .line 27
    const-string v13, "interval_duration"

    .line 28
    .line 29
    const-string v14, "initial_delay"

    .line 30
    .line 31
    const-string v15, "output"

    .line 32
    .line 33
    const-string v0, "input"

    .line 34
    .line 35
    move/from16 v16, v1

    .line 36
    .line 37
    const-string v1, "input_merger_class_name"

    .line 38
    .line 39
    move-object/from16 v17, v2

    .line 40
    .line 41
    const-string v2, "worker_class_name"

    .line 42
    .line 43
    move-object/from16 v18, v3

    .line 44
    .line 45
    const-string v3, "state"

    .line 46
    .line 47
    move-object/from16 v19, v4

    .line 48
    .line 49
    const-string v4, "id"

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    move-object/from16 v21, v5

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    packed-switch v16, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    move-object/from16 v0, p1

    .line 60
    .line 61
    check-cast v0, La/n7w0;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    array-length v2, v1

    .line 78
    const/16 v3, 0x14

    .line 79
    .line 80
    if-lt v3, v2, :cond_0

    .line 81
    .line 82
    invoke-static {v1}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-static {v1, v5, v3}, La/qx3;->k([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, La/qx3;->c([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 96
    .line 97
    const/16 v3, 0xa

    .line 98
    .line 99
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_1

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/lang/StackTraceElement;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    const-string v1, "text"

    .line 131
    .line 132
    invoke-virtual {v0, v2, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/ejv0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0

    .line 143
    :pswitch_1
    move-object/from16 v0, p1

    .line 144
    .line 145
    check-cast v0, La/n7w0;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Landroid/view/InputDevice;->getDeviceIds()[I

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v2, Ljava/util/ArrayList;

    .line 158
    .line 159
    array-length v3, v1

    .line 160
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    array-length v3, v1

    .line 164
    :goto_2
    if-ge v5, v3, :cond_3

    .line 165
    .line 166
    aget v4, v1, v5

    .line 167
    .line 168
    invoke-static {v4}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    if-eqz v4, :cond_2

    .line 173
    .line 174
    invoke-virtual {v4}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    goto :goto_3

    .line 179
    :cond_2
    move-object/from16 v4, v20

    .line 180
    .line 181
    :goto_3
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    add-int/lit8 v5, v5, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_3
    const-string v1, "devices"

    .line 192
    .line 193
    invoke-virtual {v0, v2, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_2
    move-object/from16 v0, p1

    .line 200
    .line 201
    check-cast v0, La/n7w0;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    new-instance v1, Landroid/media/MediaCodecList;

    .line 207
    .line 208
    const/4 v2, 0x1

    .line 209
    invoke-direct {v1, v2}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v2, Ljava/util/ArrayList;

    .line 220
    .line 221
    array-length v3, v1

    .line 222
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 223
    .line 224
    .line 225
    array-length v3, v1

    .line 226
    :goto_4
    if-ge v5, v3, :cond_4

    .line 227
    .line 228
    aget-object v4, v1, v5

    .line 229
    .line 230
    new-instance v6, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const/16 v7, 0x3a

    .line 243
    .line 244
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    add-int/lit8 v5, v5, 0x1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_4
    const-string v1, "Codecs"

    .line 265
    .line 266
    invoke-virtual {v0, v2, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/ejv0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    return-object v0

    .line 277
    :pswitch_4
    move-object/from16 v0, p1

    .line 278
    .line 279
    check-cast v0, Ljava/lang/Byte;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 282
    .line 283
    .line 284
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const/4 v2, 0x1

    .line 289
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const-string v1, "%02x"

    .line 294
    .line 295
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0

    .line 300
    :pswitch_5
    move-object/from16 v0, p1

    .line 301
    .line 302
    check-cast v0, La/d3w0;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_6
    move-object/from16 v0, p1

    .line 311
    .line 312
    check-cast v0, La/tn60;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    new-instance v1, La/yyv0;

    .line 318
    .line 319
    invoke-direct {v1, v0}, La/yyv0;-><init>(La/tn60;)V

    .line 320
    .line 321
    .line 322
    return-object v1

    .line 323
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/ejv0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    return-object v0

    .line 328
    :pswitch_8
    move-object/from16 v0, p1

    .line 329
    .line 330
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_9
    move-object/from16 v0, p1

    .line 339
    .line 340
    check-cast v0, La/ou90;

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_a
    move-object/from16 v0, p1

    .line 349
    .line 350
    check-cast v0, La/ou90;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_b
    move-object/from16 v0, p1

    .line 359
    .line 360
    check-cast v0, La/ne60;

    .line 361
    .line 362
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_c
    move-object/from16 v0, p1

    .line 366
    .line 367
    check-cast v0, La/rb50;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    new-instance v1, La/ob50;

    .line 373
    .line 374
    sget-object v2, La/cy2;->u:La/ugd;

    .line 375
    .line 376
    invoke-direct {v1, v0, v2}, La/ob50;-><init>(La/rb50;La/ugd;)V

    .line 377
    .line 378
    .line 379
    return-object v1

    .line 380
    :pswitch_d
    invoke-direct/range {p0 .. p1}, La/ejv0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    return-object v0

    .line 385
    :pswitch_e
    invoke-direct/range {p0 .. p1}, La/ejv0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    return-object v0

    .line 390
    :pswitch_f
    move-object/from16 v0, p1

    .line 391
    .line 392
    check-cast v0, La/qpg0;

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    const-string v1, "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)"

    .line 398
    .line 399
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    :try_start_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 404
    .line 405
    .line 406
    invoke-static {v0}, La/s0x;->R(La/qpg0;)I

    .line 407
    .line 408
    .line 409
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 411
    .line 412
    .line 413
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    return-object v0

    .line 418
    :catchall_0
    move-exception v0

    .line 419
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 420
    .line 421
    .line 422
    throw v0

    .line 423
    :pswitch_10
    move-object/from16 v5, p1

    .line 424
    .line 425
    check-cast v5, La/qpg0;

    .line 426
    .line 427
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    move-object/from16 v22, v6

    .line 431
    .line 432
    const-string v6, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?"

    .line 433
    .line 434
    invoke-interface {v5, v6}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    move-object/from16 v23, v7

    .line 439
    .line 440
    const-wide/16 v6, 0xc8

    .line 441
    .line 442
    move-object/from16 v24, v8

    .line 443
    .line 444
    const/4 v8, 0x1

    .line 445
    :try_start_1
    invoke-interface {v5, v8, v6, v7}, La/xpg0;->o(IJ)V

    .line 446
    .line 447
    .line 448
    invoke-static {v5, v4}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    invoke-static {v5, v3}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    invoke-static {v5, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    invoke-static {v5, v1}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-static {v5, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    invoke-static {v5, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    invoke-static {v5, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 473
    .line 474
    .line 475
    move-result v7

    .line 476
    invoke-static {v5, v13}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 477
    .line 478
    .line 479
    move-result v13

    .line 480
    invoke-static {v5, v12}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 481
    .line 482
    .line 483
    move-result v12

    .line 484
    invoke-static {v5, v11}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    move-result v11

    .line 488
    invoke-static {v5, v10}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    move-result v10

    .line 492
    invoke-static {v5, v9}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 493
    .line 494
    .line 495
    move-result v9

    .line 496
    move-object/from16 v14, v24

    .line 497
    .line 498
    invoke-static {v5, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 499
    .line 500
    .line 501
    move-result v14

    .line 502
    move-object/from16 v15, v23

    .line 503
    .line 504
    invoke-static {v5, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    move-result v15

    .line 508
    move-object/from16 v8, v22

    .line 509
    .line 510
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 511
    .line 512
    .line 513
    move-result v8

    .line 514
    move/from16 p0, v8

    .line 515
    .line 516
    move-object/from16 v8, v21

    .line 517
    .line 518
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    move/from16 p1, v8

    .line 523
    .line 524
    move-object/from16 v8, v19

    .line 525
    .line 526
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 527
    .line 528
    .line 529
    move-result v8

    .line 530
    move/from16 v19, v8

    .line 531
    .line 532
    move-object/from16 v8, v18

    .line 533
    .line 534
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 535
    .line 536
    .line 537
    move-result v8

    .line 538
    move/from16 v18, v8

    .line 539
    .line 540
    move-object/from16 v8, v17

    .line 541
    .line 542
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 543
    .line 544
    .line 545
    move-result v8

    .line 546
    move/from16 v17, v8

    .line 547
    .line 548
    const-string v8, "next_schedule_time_override"

    .line 549
    .line 550
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    move/from16 v21, v8

    .line 555
    .line 556
    const-string v8, "next_schedule_time_override_generation"

    .line 557
    .line 558
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    move/from16 v22, v8

    .line 563
    .line 564
    const-string v8, "stop_reason"

    .line 565
    .line 566
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v8

    .line 570
    move/from16 v23, v8

    .line 571
    .line 572
    const-string v8, "trace_tag"

    .line 573
    .line 574
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 575
    .line 576
    .line 577
    move-result v8

    .line 578
    move/from16 v24, v8

    .line 579
    .line 580
    const-string v8, "backoff_on_system_interruptions"

    .line 581
    .line 582
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    move/from16 v25, v8

    .line 587
    .line 588
    const-string v8, "required_network_type"

    .line 589
    .line 590
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result v8

    .line 594
    move/from16 v26, v8

    .line 595
    .line 596
    const-string v8, "required_network_request"

    .line 597
    .line 598
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 599
    .line 600
    .line 601
    move-result v8

    .line 602
    move/from16 v27, v8

    .line 603
    .line 604
    const-string v8, "requires_charging"

    .line 605
    .line 606
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 607
    .line 608
    .line 609
    move-result v8

    .line 610
    move/from16 v28, v8

    .line 611
    .line 612
    const-string v8, "requires_device_idle"

    .line 613
    .line 614
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 615
    .line 616
    .line 617
    move-result v8

    .line 618
    move/from16 v29, v8

    .line 619
    .line 620
    const-string v8, "requires_battery_not_low"

    .line 621
    .line 622
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 623
    .line 624
    .line 625
    move-result v8

    .line 626
    move/from16 v30, v8

    .line 627
    .line 628
    const-string v8, "requires_storage_not_low"

    .line 629
    .line 630
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 631
    .line 632
    .line 633
    move-result v8

    .line 634
    move/from16 v31, v8

    .line 635
    .line 636
    const-string v8, "trigger_content_update_delay"

    .line 637
    .line 638
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 639
    .line 640
    .line 641
    move-result v8

    .line 642
    move/from16 v32, v8

    .line 643
    .line 644
    const-string v8, "trigger_max_content_delay"

    .line 645
    .line 646
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 647
    .line 648
    .line 649
    move-result v8

    .line 650
    move/from16 v33, v8

    .line 651
    .line 652
    const-string v8, "content_uri_triggers"

    .line 653
    .line 654
    invoke-static {v5, v8}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 655
    .line 656
    .line 657
    move-result v8

    .line 658
    move/from16 v34, v8

    .line 659
    .line 660
    new-instance v8, Ljava/util/ArrayList;

    .line 661
    .line 662
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 663
    .line 664
    .line 665
    :goto_5
    invoke-interface {v5}, La/xpg0;->W0()Z

    .line 666
    .line 667
    .line 668
    move-result v35

    .line 669
    if-eqz v35, :cond_e

    .line 670
    .line 671
    invoke-interface {v5, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v37

    .line 675
    move/from16 v35, v14

    .line 676
    .line 677
    move/from16 v70, v15

    .line 678
    .line 679
    invoke-interface {v5, v3}, La/xpg0;->getLong(I)J

    .line 680
    .line 681
    .line 682
    move-result-wide v14

    .line 683
    long-to-int v14, v14

    .line 684
    invoke-static {v14}, La/dqm0;->v(I)La/zov0;

    .line 685
    .line 686
    .line 687
    move-result-object v38

    .line 688
    invoke-interface {v5, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v39

    .line 692
    invoke-interface {v5, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v40

    .line 696
    invoke-interface {v5, v0}, La/xpg0;->getBlob(I)[B

    .line 697
    .line 698
    .line 699
    move-result-object v14

    .line 700
    sget-object v15, La/maj;->b:La/maj;

    .line 701
    .line 702
    invoke-static {v14}, La/nkb;->B([B)La/maj;

    .line 703
    .line 704
    .line 705
    move-result-object v41

    .line 706
    invoke-interface {v5, v6}, La/xpg0;->getBlob(I)[B

    .line 707
    .line 708
    .line 709
    move-result-object v14

    .line 710
    invoke-static {v14}, La/nkb;->B([B)La/maj;

    .line 711
    .line 712
    .line 713
    move-result-object v42

    .line 714
    invoke-interface {v5, v7}, La/xpg0;->getLong(I)J

    .line 715
    .line 716
    .line 717
    move-result-wide v43

    .line 718
    invoke-interface {v5, v13}, La/xpg0;->getLong(I)J

    .line 719
    .line 720
    .line 721
    move-result-wide v45

    .line 722
    invoke-interface {v5, v12}, La/xpg0;->getLong(I)J

    .line 723
    .line 724
    .line 725
    move-result-wide v47

    .line 726
    invoke-interface {v5, v11}, La/xpg0;->getLong(I)J

    .line 727
    .line 728
    .line 729
    move-result-wide v14

    .line 730
    long-to-int v14, v14

    .line 731
    move/from16 v72, v0

    .line 732
    .line 733
    move/from16 v71, v1

    .line 734
    .line 735
    invoke-interface {v5, v10}, La/xpg0;->getLong(I)J

    .line 736
    .line 737
    .line 738
    move-result-wide v0

    .line 739
    long-to-int v0, v0

    .line 740
    invoke-static {v0}, La/dqm0;->s(I)La/af5;

    .line 741
    .line 742
    .line 743
    move-result-object v51

    .line 744
    invoke-interface {v5, v9}, La/xpg0;->getLong(I)J

    .line 745
    .line 746
    .line 747
    move-result-wide v52

    .line 748
    move/from16 v0, v35

    .line 749
    .line 750
    invoke-interface {v5, v0}, La/xpg0;->getLong(I)J

    .line 751
    .line 752
    .line 753
    move-result-wide v54

    .line 754
    move/from16 v1, v70

    .line 755
    .line 756
    invoke-interface {v5, v1}, La/xpg0;->getLong(I)J

    .line 757
    .line 758
    .line 759
    move-result-wide v56

    .line 760
    move/from16 v15, p0

    .line 761
    .line 762
    invoke-interface {v5, v15}, La/xpg0;->getLong(I)J

    .line 763
    .line 764
    .line 765
    move-result-wide v58

    .line 766
    move/from16 v35, v0

    .line 767
    .line 768
    move/from16 v70, v1

    .line 769
    .line 770
    move/from16 p0, v2

    .line 771
    .line 772
    move/from16 v0, p1

    .line 773
    .line 774
    invoke-interface {v5, v0}, La/xpg0;->getLong(I)J

    .line 775
    .line 776
    .line 777
    move-result-wide v1

    .line 778
    long-to-int v1, v1

    .line 779
    if-eqz v1, :cond_5

    .line 780
    .line 781
    const/16 v60, 0x1

    .line 782
    .line 783
    :goto_6
    move/from16 p1, v3

    .line 784
    .line 785
    move/from16 v1, v19

    .line 786
    .line 787
    goto :goto_7

    .line 788
    :cond_5
    const/16 v60, 0x0

    .line 789
    .line 790
    goto :goto_6

    .line 791
    :goto_7
    invoke-interface {v5, v1}, La/xpg0;->getLong(I)J

    .line 792
    .line 793
    .line 794
    move-result-wide v2

    .line 795
    long-to-int v2, v2

    .line 796
    invoke-static {v2}, La/dqm0;->u(I)La/od80;

    .line 797
    .line 798
    .line 799
    move-result-object v61

    .line 800
    move v3, v0

    .line 801
    move/from16 v19, v1

    .line 802
    .line 803
    move/from16 v2, v18

    .line 804
    .line 805
    invoke-interface {v5, v2}, La/xpg0;->getLong(I)J

    .line 806
    .line 807
    .line 808
    move-result-wide v0

    .line 809
    long-to-int v0, v0

    .line 810
    move/from16 v18, v2

    .line 811
    .line 812
    move/from16 v1, v17

    .line 813
    .line 814
    move/from16 v17, v3

    .line 815
    .line 816
    invoke-interface {v5, v1}, La/xpg0;->getLong(I)J

    .line 817
    .line 818
    .line 819
    move-result-wide v2

    .line 820
    long-to-int v2, v2

    .line 821
    move/from16 v3, v21

    .line 822
    .line 823
    invoke-interface {v5, v3}, La/xpg0;->getLong(I)J

    .line 824
    .line 825
    .line 826
    move-result-wide v64

    .line 827
    move/from16 v62, v0

    .line 828
    .line 829
    move/from16 v21, v1

    .line 830
    .line 831
    move/from16 v63, v2

    .line 832
    .line 833
    move/from16 v0, v22

    .line 834
    .line 835
    invoke-interface {v5, v0}, La/xpg0;->getLong(I)J

    .line 836
    .line 837
    .line 838
    move-result-wide v1

    .line 839
    long-to-int v1, v1

    .line 840
    move/from16 v22, v0

    .line 841
    .line 842
    move/from16 v66, v1

    .line 843
    .line 844
    move/from16 v2, v23

    .line 845
    .line 846
    invoke-interface {v5, v2}, La/xpg0;->getLong(I)J

    .line 847
    .line 848
    .line 849
    move-result-wide v0

    .line 850
    long-to-int v0, v0

    .line 851
    move/from16 v1, v24

    .line 852
    .line 853
    invoke-interface {v5, v1}, La/xpg0;->isNull(I)Z

    .line 854
    .line 855
    .line 856
    move-result v23

    .line 857
    if-eqz v23, :cond_6

    .line 858
    .line 859
    move-object/from16 v68, v20

    .line 860
    .line 861
    :goto_8
    move/from16 v67, v0

    .line 862
    .line 863
    move/from16 v0, v25

    .line 864
    .line 865
    goto :goto_9

    .line 866
    :cond_6
    invoke-interface {v5, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v23

    .line 870
    move-object/from16 v68, v23

    .line 871
    .line 872
    goto :goto_8

    .line 873
    :goto_9
    invoke-interface {v5, v0}, La/xpg0;->isNull(I)Z

    .line 874
    .line 875
    .line 876
    move-result v23

    .line 877
    if-eqz v23, :cond_7

    .line 878
    .line 879
    move/from16 v24, v1

    .line 880
    .line 881
    move/from16 v23, v2

    .line 882
    .line 883
    move-object/from16 v1, v20

    .line 884
    .line 885
    goto :goto_a

    .line 886
    :cond_7
    move/from16 v24, v1

    .line 887
    .line 888
    move/from16 v23, v2

    .line 889
    .line 890
    invoke-interface {v5, v0}, La/xpg0;->getLong(I)J

    .line 891
    .line 892
    .line 893
    move-result-wide v1

    .line 894
    long-to-int v1, v1

    .line 895
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    :goto_a
    if-eqz v1, :cond_9

    .line 900
    .line 901
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    if-eqz v1, :cond_8

    .line 906
    .line 907
    const/4 v2, 0x1

    .line 908
    goto :goto_b

    .line 909
    :cond_8
    const/4 v2, 0x0

    .line 910
    :goto_b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    move-object/from16 v69, v1

    .line 915
    .line 916
    :goto_c
    move/from16 v25, v3

    .line 917
    .line 918
    move/from16 v1, v26

    .line 919
    .line 920
    goto :goto_d

    .line 921
    :catchall_1
    move-exception v0

    .line 922
    goto/16 :goto_16

    .line 923
    .line 924
    :cond_9
    move-object/from16 v69, v20

    .line 925
    .line 926
    goto :goto_c

    .line 927
    :goto_d
    invoke-interface {v5, v1}, La/xpg0;->getLong(I)J

    .line 928
    .line 929
    .line 930
    move-result-wide v2

    .line 931
    long-to-int v2, v2

    .line 932
    invoke-static {v2}, La/dqm0;->t(I)La/sl50;

    .line 933
    .line 934
    .line 935
    move-result-object v75

    .line 936
    move/from16 v2, v27

    .line 937
    .line 938
    invoke-interface {v5, v2}, La/xpg0;->getBlob(I)[B

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    invoke-static {v3}, La/dqm0;->A([B)La/hl50;

    .line 943
    .line 944
    .line 945
    move-result-object v74

    .line 946
    move/from16 v26, v0

    .line 947
    .line 948
    move/from16 v27, v1

    .line 949
    .line 950
    move/from16 v3, v28

    .line 951
    .line 952
    invoke-interface {v5, v3}, La/xpg0;->getLong(I)J

    .line 953
    .line 954
    .line 955
    move-result-wide v0

    .line 956
    long-to-int v0, v0

    .line 957
    if-eqz v0, :cond_a

    .line 958
    .line 959
    const/16 v76, 0x1

    .line 960
    .line 961
    :goto_e
    move/from16 v28, v2

    .line 962
    .line 963
    move/from16 v0, v29

    .line 964
    .line 965
    goto :goto_f

    .line 966
    :cond_a
    const/16 v76, 0x0

    .line 967
    .line 968
    goto :goto_e

    .line 969
    :goto_f
    invoke-interface {v5, v0}, La/xpg0;->getLong(I)J

    .line 970
    .line 971
    .line 972
    move-result-wide v1

    .line 973
    long-to-int v1, v1

    .line 974
    if-eqz v1, :cond_b

    .line 975
    .line 976
    const/16 v77, 0x1

    .line 977
    .line 978
    :goto_10
    move/from16 v29, v3

    .line 979
    .line 980
    move/from16 v1, v30

    .line 981
    .line 982
    goto :goto_11

    .line 983
    :cond_b
    const/16 v77, 0x0

    .line 984
    .line 985
    goto :goto_10

    .line 986
    :goto_11
    invoke-interface {v5, v1}, La/xpg0;->getLong(I)J

    .line 987
    .line 988
    .line 989
    move-result-wide v2

    .line 990
    long-to-int v2, v2

    .line 991
    if-eqz v2, :cond_c

    .line 992
    .line 993
    const/16 v78, 0x1

    .line 994
    .line 995
    :goto_12
    move v3, v0

    .line 996
    move/from16 v30, v1

    .line 997
    .line 998
    move/from16 v2, v31

    .line 999
    .line 1000
    goto :goto_13

    .line 1001
    :cond_c
    const/16 v78, 0x0

    .line 1002
    .line 1003
    goto :goto_12

    .line 1004
    :goto_13
    invoke-interface {v5, v2}, La/xpg0;->getLong(I)J

    .line 1005
    .line 1006
    .line 1007
    move-result-wide v0

    .line 1008
    long-to-int v0, v0

    .line 1009
    if-eqz v0, :cond_d

    .line 1010
    .line 1011
    const/16 v79, 0x1

    .line 1012
    .line 1013
    :goto_14
    move/from16 v0, v32

    .line 1014
    .line 1015
    goto :goto_15

    .line 1016
    :cond_d
    const/16 v79, 0x0

    .line 1017
    .line 1018
    goto :goto_14

    .line 1019
    :goto_15
    invoke-interface {v5, v0}, La/xpg0;->getLong(I)J

    .line 1020
    .line 1021
    .line 1022
    move-result-wide v80

    .line 1023
    move/from16 v1, v33

    .line 1024
    .line 1025
    invoke-interface {v5, v1}, La/xpg0;->getLong(I)J

    .line 1026
    .line 1027
    .line 1028
    move-result-wide v82

    .line 1029
    move/from16 v32, v0

    .line 1030
    .line 1031
    move/from16 v0, v34

    .line 1032
    .line 1033
    invoke-interface {v5, v0}, La/xpg0;->getBlob(I)[B

    .line 1034
    .line 1035
    .line 1036
    move-result-object v31

    .line 1037
    invoke-static/range {v31 .. v31}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v84

    .line 1041
    new-instance v49, La/o4e;

    .line 1042
    .line 1043
    move-object/from16 v73, v49

    .line 1044
    .line 1045
    invoke-direct/range {v73 .. v84}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 1046
    .line 1047
    .line 1048
    move-object/from16 v49, v73

    .line 1049
    .line 1050
    new-instance v36, La/ppv0;

    .line 1051
    .line 1052
    move/from16 v50, v14

    .line 1053
    .line 1054
    invoke-direct/range {v36 .. v69}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 1055
    .line 1056
    .line 1057
    move-object/from16 v14, v36

    .line 1058
    .line 1059
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1060
    .line 1061
    .line 1062
    move v14, v3

    .line 1063
    move/from16 v3, p1

    .line 1064
    .line 1065
    move/from16 p1, v17

    .line 1066
    .line 1067
    move/from16 v17, v21

    .line 1068
    .line 1069
    move/from16 v21, v25

    .line 1070
    .line 1071
    move/from16 v25, v26

    .line 1072
    .line 1073
    move/from16 v26, v27

    .line 1074
    .line 1075
    move/from16 v27, v28

    .line 1076
    .line 1077
    move/from16 v28, v29

    .line 1078
    .line 1079
    move/from16 v29, v14

    .line 1080
    .line 1081
    move/from16 v34, v0

    .line 1082
    .line 1083
    move/from16 v33, v1

    .line 1084
    .line 1085
    move/from16 v31, v2

    .line 1086
    .line 1087
    move/from16 v14, v35

    .line 1088
    .line 1089
    move/from16 v1, v71

    .line 1090
    .line 1091
    move/from16 v0, v72

    .line 1092
    .line 1093
    move/from16 v2, p0

    .line 1094
    .line 1095
    move/from16 p0, v15

    .line 1096
    .line 1097
    move/from16 v15, v70

    .line 1098
    .line 1099
    goto/16 :goto_5

    .line 1100
    .line 1101
    :cond_e
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    .line 1102
    .line 1103
    .line 1104
    return-object v8

    .line 1105
    :goto_16
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    .line 1106
    .line 1107
    .line 1108
    throw v0

    .line 1109
    :pswitch_11
    move-object/from16 v0, p1

    .line 1110
    .line 1111
    check-cast v0, La/qpg0;

    .line 1112
    .line 1113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1114
    .line 1115
    .line 1116
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 1117
    .line 1118
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    :try_start_2
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    if-eqz v0, :cond_f

    .line 1127
    .line 1128
    const/4 v0, 0x0

    .line 1129
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 1130
    .line 1131
    .line 1132
    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1133
    long-to-int v0, v2

    .line 1134
    if-eqz v0, :cond_f

    .line 1135
    .line 1136
    const/4 v5, 0x1

    .line 1137
    goto :goto_17

    .line 1138
    :catchall_2
    move-exception v0

    .line 1139
    goto :goto_18

    .line 1140
    :cond_f
    const/4 v5, 0x0

    .line 1141
    :goto_17
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v0

    .line 1148
    return-object v0

    .line 1149
    :goto_18
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1150
    .line 1151
    .line 1152
    throw v0

    .line 1153
    :pswitch_12
    move-object v5, v8

    .line 1154
    move-object v8, v6

    .line 1155
    move-object v6, v5

    .line 1156
    move-object v5, v7

    .line 1157
    move-object/from16 v7, p1

    .line 1158
    .line 1159
    check-cast v7, La/qpg0;

    .line 1160
    .line 1161
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1162
    .line 1163
    .line 1164
    move-object/from16 v22, v8

    .line 1165
    .line 1166
    const-string v8, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1"

    .line 1167
    .line 1168
    invoke-interface {v7, v8}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v7

    .line 1172
    :try_start_3
    invoke-static {v7, v4}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1173
    .line 1174
    .line 1175
    move-result v4

    .line 1176
    invoke-static {v7, v3}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1177
    .line 1178
    .line 1179
    move-result v3

    .line 1180
    invoke-static {v7, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    invoke-static {v7, v1}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1185
    .line 1186
    .line 1187
    move-result v1

    .line 1188
    invoke-static {v7, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1189
    .line 1190
    .line 1191
    move-result v0

    .line 1192
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1193
    .line 1194
    .line 1195
    move-result v8

    .line 1196
    invoke-static {v7, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1197
    .line 1198
    .line 1199
    move-result v14

    .line 1200
    invoke-static {v7, v13}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1201
    .line 1202
    .line 1203
    move-result v13

    .line 1204
    invoke-static {v7, v12}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1205
    .line 1206
    .line 1207
    move-result v12

    .line 1208
    invoke-static {v7, v11}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1209
    .line 1210
    .line 1211
    move-result v11

    .line 1212
    invoke-static {v7, v10}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1213
    .line 1214
    .line 1215
    move-result v10

    .line 1216
    invoke-static {v7, v9}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1217
    .line 1218
    .line 1219
    move-result v9

    .line 1220
    invoke-static {v7, v6}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1221
    .line 1222
    .line 1223
    move-result v6

    .line 1224
    invoke-static {v7, v5}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1225
    .line 1226
    .line 1227
    move-result v5

    .line 1228
    move-object/from16 v15, v22

    .line 1229
    .line 1230
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1231
    .line 1232
    .line 1233
    move-result v15

    .line 1234
    move/from16 p0, v15

    .line 1235
    .line 1236
    move-object/from16 v15, v21

    .line 1237
    .line 1238
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1239
    .line 1240
    .line 1241
    move-result v15

    .line 1242
    move/from16 p1, v15

    .line 1243
    .line 1244
    move-object/from16 v15, v19

    .line 1245
    .line 1246
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1247
    .line 1248
    .line 1249
    move-result v15

    .line 1250
    move/from16 v19, v15

    .line 1251
    .line 1252
    move-object/from16 v15, v18

    .line 1253
    .line 1254
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1255
    .line 1256
    .line 1257
    move-result v15

    .line 1258
    move/from16 v18, v15

    .line 1259
    .line 1260
    move-object/from16 v15, v17

    .line 1261
    .line 1262
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1263
    .line 1264
    .line 1265
    move-result v15

    .line 1266
    move/from16 v17, v15

    .line 1267
    .line 1268
    const-string v15, "next_schedule_time_override"

    .line 1269
    .line 1270
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1271
    .line 1272
    .line 1273
    move-result v15

    .line 1274
    move/from16 v21, v15

    .line 1275
    .line 1276
    const-string v15, "next_schedule_time_override_generation"

    .line 1277
    .line 1278
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1279
    .line 1280
    .line 1281
    move-result v15

    .line 1282
    move/from16 v22, v15

    .line 1283
    .line 1284
    const-string v15, "stop_reason"

    .line 1285
    .line 1286
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1287
    .line 1288
    .line 1289
    move-result v15

    .line 1290
    move/from16 v23, v15

    .line 1291
    .line 1292
    const-string v15, "trace_tag"

    .line 1293
    .line 1294
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1295
    .line 1296
    .line 1297
    move-result v15

    .line 1298
    move/from16 v24, v15

    .line 1299
    .line 1300
    const-string v15, "backoff_on_system_interruptions"

    .line 1301
    .line 1302
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1303
    .line 1304
    .line 1305
    move-result v15

    .line 1306
    move/from16 v25, v15

    .line 1307
    .line 1308
    const-string v15, "required_network_type"

    .line 1309
    .line 1310
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1311
    .line 1312
    .line 1313
    move-result v15

    .line 1314
    move/from16 v26, v15

    .line 1315
    .line 1316
    const-string v15, "required_network_request"

    .line 1317
    .line 1318
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1319
    .line 1320
    .line 1321
    move-result v15

    .line 1322
    move/from16 v27, v15

    .line 1323
    .line 1324
    const-string v15, "requires_charging"

    .line 1325
    .line 1326
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1327
    .line 1328
    .line 1329
    move-result v15

    .line 1330
    move/from16 v28, v15

    .line 1331
    .line 1332
    const-string v15, "requires_device_idle"

    .line 1333
    .line 1334
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1335
    .line 1336
    .line 1337
    move-result v15

    .line 1338
    move/from16 v29, v15

    .line 1339
    .line 1340
    const-string v15, "requires_battery_not_low"

    .line 1341
    .line 1342
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1343
    .line 1344
    .line 1345
    move-result v15

    .line 1346
    move/from16 v30, v15

    .line 1347
    .line 1348
    const-string v15, "requires_storage_not_low"

    .line 1349
    .line 1350
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1351
    .line 1352
    .line 1353
    move-result v15

    .line 1354
    move/from16 v31, v15

    .line 1355
    .line 1356
    const-string v15, "trigger_content_update_delay"

    .line 1357
    .line 1358
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1359
    .line 1360
    .line 1361
    move-result v15

    .line 1362
    move/from16 v32, v15

    .line 1363
    .line 1364
    const-string v15, "trigger_max_content_delay"

    .line 1365
    .line 1366
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1367
    .line 1368
    .line 1369
    move-result v15

    .line 1370
    move/from16 v33, v15

    .line 1371
    .line 1372
    const-string v15, "content_uri_triggers"

    .line 1373
    .line 1374
    invoke-static {v7, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1375
    .line 1376
    .line 1377
    move-result v15

    .line 1378
    move/from16 v34, v15

    .line 1379
    .line 1380
    new-instance v15, Ljava/util/ArrayList;

    .line 1381
    .line 1382
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1383
    .line 1384
    .line 1385
    :goto_19
    invoke-interface {v7}, La/xpg0;->W0()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v35

    .line 1389
    if-eqz v35, :cond_19

    .line 1390
    .line 1391
    invoke-interface {v7, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v37

    .line 1395
    move/from16 v35, v4

    .line 1396
    .line 1397
    move/from16 v70, v5

    .line 1398
    .line 1399
    invoke-interface {v7, v3}, La/xpg0;->getLong(I)J

    .line 1400
    .line 1401
    .line 1402
    move-result-wide v4

    .line 1403
    long-to-int v4, v4

    .line 1404
    invoke-static {v4}, La/dqm0;->v(I)La/zov0;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v38

    .line 1408
    invoke-interface {v7, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v39

    .line 1412
    invoke-interface {v7, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v40

    .line 1416
    invoke-interface {v7, v0}, La/xpg0;->getBlob(I)[B

    .line 1417
    .line 1418
    .line 1419
    move-result-object v4

    .line 1420
    sget-object v5, La/maj;->b:La/maj;

    .line 1421
    .line 1422
    invoke-static {v4}, La/nkb;->B([B)La/maj;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v41

    .line 1426
    invoke-interface {v7, v8}, La/xpg0;->getBlob(I)[B

    .line 1427
    .line 1428
    .line 1429
    move-result-object v4

    .line 1430
    invoke-static {v4}, La/nkb;->B([B)La/maj;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v42

    .line 1434
    invoke-interface {v7, v14}, La/xpg0;->getLong(I)J

    .line 1435
    .line 1436
    .line 1437
    move-result-wide v43

    .line 1438
    invoke-interface {v7, v13}, La/xpg0;->getLong(I)J

    .line 1439
    .line 1440
    .line 1441
    move-result-wide v45

    .line 1442
    invoke-interface {v7, v12}, La/xpg0;->getLong(I)J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v47

    .line 1446
    invoke-interface {v7, v11}, La/xpg0;->getLong(I)J

    .line 1447
    .line 1448
    .line 1449
    move-result-wide v4

    .line 1450
    long-to-int v4, v4

    .line 1451
    move/from16 v72, v0

    .line 1452
    .line 1453
    move/from16 v71, v1

    .line 1454
    .line 1455
    invoke-interface {v7, v10}, La/xpg0;->getLong(I)J

    .line 1456
    .line 1457
    .line 1458
    move-result-wide v0

    .line 1459
    long-to-int v0, v0

    .line 1460
    invoke-static {v0}, La/dqm0;->s(I)La/af5;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v51

    .line 1464
    invoke-interface {v7, v9}, La/xpg0;->getLong(I)J

    .line 1465
    .line 1466
    .line 1467
    move-result-wide v52

    .line 1468
    invoke-interface {v7, v6}, La/xpg0;->getLong(I)J

    .line 1469
    .line 1470
    .line 1471
    move-result-wide v54

    .line 1472
    move/from16 v0, v70

    .line 1473
    .line 1474
    invoke-interface {v7, v0}, La/xpg0;->getLong(I)J

    .line 1475
    .line 1476
    .line 1477
    move-result-wide v56

    .line 1478
    move/from16 v1, p0

    .line 1479
    .line 1480
    invoke-interface {v7, v1}, La/xpg0;->getLong(I)J

    .line 1481
    .line 1482
    .line 1483
    move-result-wide v58

    .line 1484
    move/from16 v5, p1

    .line 1485
    .line 1486
    move/from16 v70, v0

    .line 1487
    .line 1488
    move/from16 p0, v1

    .line 1489
    .line 1490
    invoke-interface {v7, v5}, La/xpg0;->getLong(I)J

    .line 1491
    .line 1492
    .line 1493
    move-result-wide v0

    .line 1494
    long-to-int v0, v0

    .line 1495
    if-eqz v0, :cond_10

    .line 1496
    .line 1497
    const/16 v60, 0x1

    .line 1498
    .line 1499
    :goto_1a
    move/from16 p1, v2

    .line 1500
    .line 1501
    move/from16 v0, v19

    .line 1502
    .line 1503
    goto :goto_1b

    .line 1504
    :cond_10
    const/16 v60, 0x0

    .line 1505
    .line 1506
    goto :goto_1a

    .line 1507
    :goto_1b
    invoke-interface {v7, v0}, La/xpg0;->getLong(I)J

    .line 1508
    .line 1509
    .line 1510
    move-result-wide v1

    .line 1511
    long-to-int v1, v1

    .line 1512
    invoke-static {v1}, La/dqm0;->u(I)La/od80;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v61

    .line 1516
    move/from16 v1, v18

    .line 1517
    .line 1518
    move/from16 v18, v3

    .line 1519
    .line 1520
    invoke-interface {v7, v1}, La/xpg0;->getLong(I)J

    .line 1521
    .line 1522
    .line 1523
    move-result-wide v2

    .line 1524
    long-to-int v2, v2

    .line 1525
    move/from16 v19, v0

    .line 1526
    .line 1527
    move/from16 v3, v17

    .line 1528
    .line 1529
    move/from16 v17, v1

    .line 1530
    .line 1531
    invoke-interface {v7, v3}, La/xpg0;->getLong(I)J

    .line 1532
    .line 1533
    .line 1534
    move-result-wide v0

    .line 1535
    long-to-int v0, v0

    .line 1536
    move/from16 v1, v21

    .line 1537
    .line 1538
    invoke-interface {v7, v1}, La/xpg0;->getLong(I)J

    .line 1539
    .line 1540
    .line 1541
    move-result-wide v64

    .line 1542
    move/from16 v63, v0

    .line 1543
    .line 1544
    move/from16 v62, v2

    .line 1545
    .line 1546
    move/from16 v0, v22

    .line 1547
    .line 1548
    invoke-interface {v7, v0}, La/xpg0;->getLong(I)J

    .line 1549
    .line 1550
    .line 1551
    move-result-wide v1

    .line 1552
    long-to-int v1, v1

    .line 1553
    move/from16 v22, v0

    .line 1554
    .line 1555
    move/from16 v66, v1

    .line 1556
    .line 1557
    move/from16 v2, v23

    .line 1558
    .line 1559
    invoke-interface {v7, v2}, La/xpg0;->getLong(I)J

    .line 1560
    .line 1561
    .line 1562
    move-result-wide v0

    .line 1563
    long-to-int v0, v0

    .line 1564
    move/from16 v1, v24

    .line 1565
    .line 1566
    invoke-interface {v7, v1}, La/xpg0;->isNull(I)Z

    .line 1567
    .line 1568
    .line 1569
    move-result v23

    .line 1570
    if-eqz v23, :cond_11

    .line 1571
    .line 1572
    move-object/from16 v68, v20

    .line 1573
    .line 1574
    :goto_1c
    move/from16 v67, v0

    .line 1575
    .line 1576
    move/from16 v0, v25

    .line 1577
    .line 1578
    goto :goto_1d

    .line 1579
    :cond_11
    invoke-interface {v7, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v23

    .line 1583
    move-object/from16 v68, v23

    .line 1584
    .line 1585
    goto :goto_1c

    .line 1586
    :goto_1d
    invoke-interface {v7, v0}, La/xpg0;->isNull(I)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v23

    .line 1590
    if-eqz v23, :cond_12

    .line 1591
    .line 1592
    move/from16 v24, v1

    .line 1593
    .line 1594
    move/from16 v23, v2

    .line 1595
    .line 1596
    move-object/from16 v1, v20

    .line 1597
    .line 1598
    goto :goto_1e

    .line 1599
    :cond_12
    move/from16 v24, v1

    .line 1600
    .line 1601
    move/from16 v23, v2

    .line 1602
    .line 1603
    invoke-interface {v7, v0}, La/xpg0;->getLong(I)J

    .line 1604
    .line 1605
    .line 1606
    move-result-wide v1

    .line 1607
    long-to-int v1, v1

    .line 1608
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v1

    .line 1612
    :goto_1e
    if-eqz v1, :cond_14

    .line 1613
    .line 1614
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1615
    .line 1616
    .line 1617
    move-result v1

    .line 1618
    if-eqz v1, :cond_13

    .line 1619
    .line 1620
    const/4 v2, 0x1

    .line 1621
    goto :goto_1f

    .line 1622
    :cond_13
    const/4 v2, 0x0

    .line 1623
    :goto_1f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v1

    .line 1627
    move-object/from16 v69, v1

    .line 1628
    .line 1629
    :goto_20
    move/from16 v25, v3

    .line 1630
    .line 1631
    move/from16 v1, v26

    .line 1632
    .line 1633
    goto :goto_21

    .line 1634
    :catchall_3
    move-exception v0

    .line 1635
    goto/16 :goto_2a

    .line 1636
    .line 1637
    :cond_14
    move-object/from16 v69, v20

    .line 1638
    .line 1639
    goto :goto_20

    .line 1640
    :goto_21
    invoke-interface {v7, v1}, La/xpg0;->getLong(I)J

    .line 1641
    .line 1642
    .line 1643
    move-result-wide v2

    .line 1644
    long-to-int v2, v2

    .line 1645
    invoke-static {v2}, La/dqm0;->t(I)La/sl50;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v75

    .line 1649
    move/from16 v2, v27

    .line 1650
    .line 1651
    invoke-interface {v7, v2}, La/xpg0;->getBlob(I)[B

    .line 1652
    .line 1653
    .line 1654
    move-result-object v3

    .line 1655
    invoke-static {v3}, La/dqm0;->A([B)La/hl50;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v74

    .line 1659
    move/from16 v26, v0

    .line 1660
    .line 1661
    move/from16 v27, v1

    .line 1662
    .line 1663
    move/from16 v3, v28

    .line 1664
    .line 1665
    invoke-interface {v7, v3}, La/xpg0;->getLong(I)J

    .line 1666
    .line 1667
    .line 1668
    move-result-wide v0

    .line 1669
    long-to-int v0, v0

    .line 1670
    if-eqz v0, :cond_15

    .line 1671
    .line 1672
    const/16 v76, 0x1

    .line 1673
    .line 1674
    :goto_22
    move/from16 v28, v2

    .line 1675
    .line 1676
    move/from16 v0, v29

    .line 1677
    .line 1678
    goto :goto_23

    .line 1679
    :cond_15
    const/16 v76, 0x0

    .line 1680
    .line 1681
    goto :goto_22

    .line 1682
    :goto_23
    invoke-interface {v7, v0}, La/xpg0;->getLong(I)J

    .line 1683
    .line 1684
    .line 1685
    move-result-wide v1

    .line 1686
    long-to-int v1, v1

    .line 1687
    if-eqz v1, :cond_16

    .line 1688
    .line 1689
    const/16 v77, 0x1

    .line 1690
    .line 1691
    :goto_24
    move/from16 v29, v3

    .line 1692
    .line 1693
    move/from16 v1, v30

    .line 1694
    .line 1695
    goto :goto_25

    .line 1696
    :cond_16
    const/16 v77, 0x0

    .line 1697
    .line 1698
    goto :goto_24

    .line 1699
    :goto_25
    invoke-interface {v7, v1}, La/xpg0;->getLong(I)J

    .line 1700
    .line 1701
    .line 1702
    move-result-wide v2

    .line 1703
    long-to-int v2, v2

    .line 1704
    if-eqz v2, :cond_17

    .line 1705
    .line 1706
    const/16 v78, 0x1

    .line 1707
    .line 1708
    :goto_26
    move v3, v0

    .line 1709
    move/from16 v30, v1

    .line 1710
    .line 1711
    move/from16 v2, v31

    .line 1712
    .line 1713
    goto :goto_27

    .line 1714
    :cond_17
    const/16 v78, 0x0

    .line 1715
    .line 1716
    goto :goto_26

    .line 1717
    :goto_27
    invoke-interface {v7, v2}, La/xpg0;->getLong(I)J

    .line 1718
    .line 1719
    .line 1720
    move-result-wide v0

    .line 1721
    long-to-int v0, v0

    .line 1722
    if-eqz v0, :cond_18

    .line 1723
    .line 1724
    const/16 v79, 0x1

    .line 1725
    .line 1726
    :goto_28
    move/from16 v0, v32

    .line 1727
    .line 1728
    goto :goto_29

    .line 1729
    :cond_18
    const/16 v79, 0x0

    .line 1730
    .line 1731
    goto :goto_28

    .line 1732
    :goto_29
    invoke-interface {v7, v0}, La/xpg0;->getLong(I)J

    .line 1733
    .line 1734
    .line 1735
    move-result-wide v80

    .line 1736
    move/from16 v1, v33

    .line 1737
    .line 1738
    invoke-interface {v7, v1}, La/xpg0;->getLong(I)J

    .line 1739
    .line 1740
    .line 1741
    move-result-wide v82

    .line 1742
    move/from16 v32, v0

    .line 1743
    .line 1744
    move/from16 v0, v34

    .line 1745
    .line 1746
    invoke-interface {v7, v0}, La/xpg0;->getBlob(I)[B

    .line 1747
    .line 1748
    .line 1749
    move-result-object v31

    .line 1750
    invoke-static/range {v31 .. v31}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v84

    .line 1754
    new-instance v49, La/o4e;

    .line 1755
    .line 1756
    move-object/from16 v73, v49

    .line 1757
    .line 1758
    invoke-direct/range {v73 .. v84}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 1759
    .line 1760
    .line 1761
    move-object/from16 v49, v73

    .line 1762
    .line 1763
    new-instance v36, La/ppv0;

    .line 1764
    .line 1765
    move/from16 v50, v4

    .line 1766
    .line 1767
    invoke-direct/range {v36 .. v69}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 1768
    .line 1769
    .line 1770
    move-object/from16 v4, v36

    .line 1771
    .line 1772
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1773
    .line 1774
    .line 1775
    move/from16 v4, v29

    .line 1776
    .line 1777
    move/from16 v29, v3

    .line 1778
    .line 1779
    move/from16 v3, v18

    .line 1780
    .line 1781
    move/from16 v18, v17

    .line 1782
    .line 1783
    move/from16 v17, v25

    .line 1784
    .line 1785
    move/from16 v25, v26

    .line 1786
    .line 1787
    move/from16 v26, v27

    .line 1788
    .line 1789
    move/from16 v27, v28

    .line 1790
    .line 1791
    move/from16 v28, v4

    .line 1792
    .line 1793
    move/from16 v34, v0

    .line 1794
    .line 1795
    move/from16 v33, v1

    .line 1796
    .line 1797
    move/from16 v31, v2

    .line 1798
    .line 1799
    move/from16 v4, v35

    .line 1800
    .line 1801
    move/from16 v1, v71

    .line 1802
    .line 1803
    move/from16 v0, v72

    .line 1804
    .line 1805
    move/from16 v2, p1

    .line 1806
    .line 1807
    move/from16 p1, v5

    .line 1808
    .line 1809
    move/from16 v5, v70

    .line 1810
    .line 1811
    goto/16 :goto_19

    .line 1812
    .line 1813
    :cond_19
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V

    .line 1814
    .line 1815
    .line 1816
    return-object v15

    .line 1817
    :goto_2a
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V

    .line 1818
    .line 1819
    .line 1820
    throw v0

    .line 1821
    :pswitch_13
    move-object v5, v8

    .line 1822
    move-object v8, v6

    .line 1823
    move-object v6, v5

    .line 1824
    move-object v5, v7

    .line 1825
    move-object v7, v15

    .line 1826
    move-object/from16 v15, p1

    .line 1827
    .line 1828
    check-cast v15, La/qpg0;

    .line 1829
    .line 1830
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1831
    .line 1832
    .line 1833
    move-object/from16 v22, v8

    .line 1834
    .line 1835
    const-string v8, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time"

    .line 1836
    .line 1837
    invoke-interface {v15, v8}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v8

    .line 1841
    :try_start_4
    invoke-static {v8, v4}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1842
    .line 1843
    .line 1844
    move-result v4

    .line 1845
    invoke-static {v8, v3}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1846
    .line 1847
    .line 1848
    move-result v3

    .line 1849
    invoke-static {v8, v2}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1850
    .line 1851
    .line 1852
    move-result v2

    .line 1853
    invoke-static {v8, v1}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1854
    .line 1855
    .line 1856
    move-result v1

    .line 1857
    invoke-static {v8, v0}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1858
    .line 1859
    .line 1860
    move-result v0

    .line 1861
    invoke-static {v8, v7}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1862
    .line 1863
    .line 1864
    move-result v7

    .line 1865
    invoke-static {v8, v14}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1866
    .line 1867
    .line 1868
    move-result v14

    .line 1869
    invoke-static {v8, v13}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1870
    .line 1871
    .line 1872
    move-result v13

    .line 1873
    invoke-static {v8, v12}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1874
    .line 1875
    .line 1876
    move-result v12

    .line 1877
    invoke-static {v8, v11}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1878
    .line 1879
    .line 1880
    move-result v11

    .line 1881
    invoke-static {v8, v10}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1882
    .line 1883
    .line 1884
    move-result v10

    .line 1885
    invoke-static {v8, v9}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1886
    .line 1887
    .line 1888
    move-result v9

    .line 1889
    invoke-static {v8, v6}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1890
    .line 1891
    .line 1892
    move-result v6

    .line 1893
    invoke-static {v8, v5}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1894
    .line 1895
    .line 1896
    move-result v5

    .line 1897
    move-object/from16 v15, v22

    .line 1898
    .line 1899
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1900
    .line 1901
    .line 1902
    move-result v15

    .line 1903
    move/from16 p0, v15

    .line 1904
    .line 1905
    move-object/from16 v15, v21

    .line 1906
    .line 1907
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1908
    .line 1909
    .line 1910
    move-result v15

    .line 1911
    move/from16 p1, v15

    .line 1912
    .line 1913
    move-object/from16 v15, v19

    .line 1914
    .line 1915
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1916
    .line 1917
    .line 1918
    move-result v15

    .line 1919
    move/from16 v19, v15

    .line 1920
    .line 1921
    move-object/from16 v15, v18

    .line 1922
    .line 1923
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1924
    .line 1925
    .line 1926
    move-result v15

    .line 1927
    move/from16 v18, v15

    .line 1928
    .line 1929
    move-object/from16 v15, v17

    .line 1930
    .line 1931
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1932
    .line 1933
    .line 1934
    move-result v15

    .line 1935
    move/from16 v17, v15

    .line 1936
    .line 1937
    const-string v15, "next_schedule_time_override"

    .line 1938
    .line 1939
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1940
    .line 1941
    .line 1942
    move-result v15

    .line 1943
    move/from16 v21, v15

    .line 1944
    .line 1945
    const-string v15, "next_schedule_time_override_generation"

    .line 1946
    .line 1947
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1948
    .line 1949
    .line 1950
    move-result v15

    .line 1951
    move/from16 v22, v15

    .line 1952
    .line 1953
    const-string v15, "stop_reason"

    .line 1954
    .line 1955
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1956
    .line 1957
    .line 1958
    move-result v15

    .line 1959
    move/from16 v23, v15

    .line 1960
    .line 1961
    const-string v15, "trace_tag"

    .line 1962
    .line 1963
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1964
    .line 1965
    .line 1966
    move-result v15

    .line 1967
    move/from16 v24, v15

    .line 1968
    .line 1969
    const-string v15, "backoff_on_system_interruptions"

    .line 1970
    .line 1971
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1972
    .line 1973
    .line 1974
    move-result v15

    .line 1975
    move/from16 v25, v15

    .line 1976
    .line 1977
    const-string v15, "required_network_type"

    .line 1978
    .line 1979
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1980
    .line 1981
    .line 1982
    move-result v15

    .line 1983
    move/from16 v26, v15

    .line 1984
    .line 1985
    const-string v15, "required_network_request"

    .line 1986
    .line 1987
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1988
    .line 1989
    .line 1990
    move-result v15

    .line 1991
    move/from16 v27, v15

    .line 1992
    .line 1993
    const-string v15, "requires_charging"

    .line 1994
    .line 1995
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 1996
    .line 1997
    .line 1998
    move-result v15

    .line 1999
    move/from16 v28, v15

    .line 2000
    .line 2001
    const-string v15, "requires_device_idle"

    .line 2002
    .line 2003
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 2004
    .line 2005
    .line 2006
    move-result v15

    .line 2007
    move/from16 v29, v15

    .line 2008
    .line 2009
    const-string v15, "requires_battery_not_low"

    .line 2010
    .line 2011
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 2012
    .line 2013
    .line 2014
    move-result v15

    .line 2015
    move/from16 v30, v15

    .line 2016
    .line 2017
    const-string v15, "requires_storage_not_low"

    .line 2018
    .line 2019
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 2020
    .line 2021
    .line 2022
    move-result v15

    .line 2023
    move/from16 v31, v15

    .line 2024
    .line 2025
    const-string v15, "trigger_content_update_delay"

    .line 2026
    .line 2027
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 2028
    .line 2029
    .line 2030
    move-result v15

    .line 2031
    move/from16 v32, v15

    .line 2032
    .line 2033
    const-string v15, "trigger_max_content_delay"

    .line 2034
    .line 2035
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 2036
    .line 2037
    .line 2038
    move-result v15

    .line 2039
    move/from16 v33, v15

    .line 2040
    .line 2041
    const-string v15, "content_uri_triggers"

    .line 2042
    .line 2043
    invoke-static {v8, v15}, La/g1x;->t(La/xpg0;Ljava/lang/String;)I

    .line 2044
    .line 2045
    .line 2046
    move-result v15

    .line 2047
    move/from16 v34, v15

    .line 2048
    .line 2049
    new-instance v15, Ljava/util/ArrayList;

    .line 2050
    .line 2051
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 2052
    .line 2053
    .line 2054
    :goto_2b
    invoke-interface {v8}, La/xpg0;->W0()Z

    .line 2055
    .line 2056
    .line 2057
    move-result v35

    .line 2058
    if-eqz v35, :cond_23

    .line 2059
    .line 2060
    invoke-interface {v8, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v37

    .line 2064
    move/from16 v35, v4

    .line 2065
    .line 2066
    move/from16 v70, v5

    .line 2067
    .line 2068
    invoke-interface {v8, v3}, La/xpg0;->getLong(I)J

    .line 2069
    .line 2070
    .line 2071
    move-result-wide v4

    .line 2072
    long-to-int v4, v4

    .line 2073
    invoke-static {v4}, La/dqm0;->v(I)La/zov0;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v38

    .line 2077
    invoke-interface {v8, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v39

    .line 2081
    invoke-interface {v8, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v40

    .line 2085
    invoke-interface {v8, v0}, La/xpg0;->getBlob(I)[B

    .line 2086
    .line 2087
    .line 2088
    move-result-object v4

    .line 2089
    sget-object v5, La/maj;->b:La/maj;

    .line 2090
    .line 2091
    invoke-static {v4}, La/nkb;->B([B)La/maj;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v41

    .line 2095
    invoke-interface {v8, v7}, La/xpg0;->getBlob(I)[B

    .line 2096
    .line 2097
    .line 2098
    move-result-object v4

    .line 2099
    invoke-static {v4}, La/nkb;->B([B)La/maj;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v42

    .line 2103
    invoke-interface {v8, v14}, La/xpg0;->getLong(I)J

    .line 2104
    .line 2105
    .line 2106
    move-result-wide v43

    .line 2107
    invoke-interface {v8, v13}, La/xpg0;->getLong(I)J

    .line 2108
    .line 2109
    .line 2110
    move-result-wide v45

    .line 2111
    invoke-interface {v8, v12}, La/xpg0;->getLong(I)J

    .line 2112
    .line 2113
    .line 2114
    move-result-wide v47

    .line 2115
    invoke-interface {v8, v11}, La/xpg0;->getLong(I)J

    .line 2116
    .line 2117
    .line 2118
    move-result-wide v4

    .line 2119
    long-to-int v4, v4

    .line 2120
    move/from16 v71, v0

    .line 2121
    .line 2122
    move v5, v1

    .line 2123
    invoke-interface {v8, v10}, La/xpg0;->getLong(I)J

    .line 2124
    .line 2125
    .line 2126
    move-result-wide v0

    .line 2127
    long-to-int v0, v0

    .line 2128
    invoke-static {v0}, La/dqm0;->s(I)La/af5;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v51

    .line 2132
    invoke-interface {v8, v9}, La/xpg0;->getLong(I)J

    .line 2133
    .line 2134
    .line 2135
    move-result-wide v52

    .line 2136
    invoke-interface {v8, v6}, La/xpg0;->getLong(I)J

    .line 2137
    .line 2138
    .line 2139
    move-result-wide v54

    .line 2140
    move/from16 v0, v70

    .line 2141
    .line 2142
    invoke-interface {v8, v0}, La/xpg0;->getLong(I)J

    .line 2143
    .line 2144
    .line 2145
    move-result-wide v56

    .line 2146
    move/from16 v1, p0

    .line 2147
    .line 2148
    invoke-interface {v8, v1}, La/xpg0;->getLong(I)J

    .line 2149
    .line 2150
    .line 2151
    move-result-wide v58

    .line 2152
    move/from16 v70, v0

    .line 2153
    .line 2154
    move/from16 v72, v1

    .line 2155
    .line 2156
    move/from16 p0, v2

    .line 2157
    .line 2158
    move/from16 v0, p1

    .line 2159
    .line 2160
    invoke-interface {v8, v0}, La/xpg0;->getLong(I)J

    .line 2161
    .line 2162
    .line 2163
    move-result-wide v1

    .line 2164
    long-to-int v1, v1

    .line 2165
    if-eqz v1, :cond_1a

    .line 2166
    .line 2167
    const/16 v60, 0x1

    .line 2168
    .line 2169
    :goto_2c
    move/from16 p1, v3

    .line 2170
    .line 2171
    move/from16 v1, v19

    .line 2172
    .line 2173
    goto :goto_2d

    .line 2174
    :cond_1a
    const/16 v60, 0x0

    .line 2175
    .line 2176
    goto :goto_2c

    .line 2177
    :goto_2d
    invoke-interface {v8, v1}, La/xpg0;->getLong(I)J

    .line 2178
    .line 2179
    .line 2180
    move-result-wide v2

    .line 2181
    long-to-int v2, v2

    .line 2182
    invoke-static {v2}, La/dqm0;->u(I)La/od80;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v61

    .line 2186
    move v3, v0

    .line 2187
    move/from16 v19, v1

    .line 2188
    .line 2189
    move/from16 v2, v18

    .line 2190
    .line 2191
    invoke-interface {v8, v2}, La/xpg0;->getLong(I)J

    .line 2192
    .line 2193
    .line 2194
    move-result-wide v0

    .line 2195
    long-to-int v0, v0

    .line 2196
    move/from16 v18, v2

    .line 2197
    .line 2198
    move/from16 v1, v17

    .line 2199
    .line 2200
    move/from16 v17, v3

    .line 2201
    .line 2202
    invoke-interface {v8, v1}, La/xpg0;->getLong(I)J

    .line 2203
    .line 2204
    .line 2205
    move-result-wide v2

    .line 2206
    long-to-int v2, v2

    .line 2207
    move/from16 v3, v21

    .line 2208
    .line 2209
    invoke-interface {v8, v3}, La/xpg0;->getLong(I)J

    .line 2210
    .line 2211
    .line 2212
    move-result-wide v64

    .line 2213
    move/from16 v62, v0

    .line 2214
    .line 2215
    move/from16 v21, v1

    .line 2216
    .line 2217
    move/from16 v63, v2

    .line 2218
    .line 2219
    move/from16 v0, v22

    .line 2220
    .line 2221
    invoke-interface {v8, v0}, La/xpg0;->getLong(I)J

    .line 2222
    .line 2223
    .line 2224
    move-result-wide v1

    .line 2225
    long-to-int v1, v1

    .line 2226
    move/from16 v22, v0

    .line 2227
    .line 2228
    move/from16 v66, v1

    .line 2229
    .line 2230
    move/from16 v2, v23

    .line 2231
    .line 2232
    invoke-interface {v8, v2}, La/xpg0;->getLong(I)J

    .line 2233
    .line 2234
    .line 2235
    move-result-wide v0

    .line 2236
    long-to-int v0, v0

    .line 2237
    move/from16 v1, v24

    .line 2238
    .line 2239
    invoke-interface {v8, v1}, La/xpg0;->isNull(I)Z

    .line 2240
    .line 2241
    .line 2242
    move-result v23

    .line 2243
    if-eqz v23, :cond_1b

    .line 2244
    .line 2245
    move-object/from16 v68, v20

    .line 2246
    .line 2247
    :goto_2e
    move/from16 v67, v0

    .line 2248
    .line 2249
    move/from16 v0, v25

    .line 2250
    .line 2251
    goto :goto_2f

    .line 2252
    :cond_1b
    invoke-interface {v8, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v23

    .line 2256
    move-object/from16 v68, v23

    .line 2257
    .line 2258
    goto :goto_2e

    .line 2259
    :goto_2f
    invoke-interface {v8, v0}, La/xpg0;->isNull(I)Z

    .line 2260
    .line 2261
    .line 2262
    move-result v23

    .line 2263
    if-eqz v23, :cond_1c

    .line 2264
    .line 2265
    move/from16 v24, v1

    .line 2266
    .line 2267
    move/from16 v23, v2

    .line 2268
    .line 2269
    move-object/from16 v1, v20

    .line 2270
    .line 2271
    goto :goto_30

    .line 2272
    :cond_1c
    move/from16 v24, v1

    .line 2273
    .line 2274
    move/from16 v23, v2

    .line 2275
    .line 2276
    invoke-interface {v8, v0}, La/xpg0;->getLong(I)J

    .line 2277
    .line 2278
    .line 2279
    move-result-wide v1

    .line 2280
    long-to-int v1, v1

    .line 2281
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v1

    .line 2285
    :goto_30
    if-eqz v1, :cond_1e

    .line 2286
    .line 2287
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2288
    .line 2289
    .line 2290
    move-result v1

    .line 2291
    if-eqz v1, :cond_1d

    .line 2292
    .line 2293
    const/4 v2, 0x1

    .line 2294
    goto :goto_31

    .line 2295
    :cond_1d
    const/4 v2, 0x0

    .line 2296
    :goto_31
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v1

    .line 2300
    move-object/from16 v69, v1

    .line 2301
    .line 2302
    :goto_32
    move/from16 v25, v3

    .line 2303
    .line 2304
    move/from16 v1, v26

    .line 2305
    .line 2306
    goto :goto_33

    .line 2307
    :catchall_4
    move-exception v0

    .line 2308
    goto/16 :goto_3c

    .line 2309
    .line 2310
    :cond_1e
    move-object/from16 v69, v20

    .line 2311
    .line 2312
    goto :goto_32

    .line 2313
    :goto_33
    invoke-interface {v8, v1}, La/xpg0;->getLong(I)J

    .line 2314
    .line 2315
    .line 2316
    move-result-wide v2

    .line 2317
    long-to-int v2, v2

    .line 2318
    invoke-static {v2}, La/dqm0;->t(I)La/sl50;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v75

    .line 2322
    move/from16 v2, v27

    .line 2323
    .line 2324
    invoke-interface {v8, v2}, La/xpg0;->getBlob(I)[B

    .line 2325
    .line 2326
    .line 2327
    move-result-object v3

    .line 2328
    invoke-static {v3}, La/dqm0;->A([B)La/hl50;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v74

    .line 2332
    move/from16 v26, v0

    .line 2333
    .line 2334
    move/from16 v27, v1

    .line 2335
    .line 2336
    move/from16 v3, v28

    .line 2337
    .line 2338
    invoke-interface {v8, v3}, La/xpg0;->getLong(I)J

    .line 2339
    .line 2340
    .line 2341
    move-result-wide v0

    .line 2342
    long-to-int v0, v0

    .line 2343
    if-eqz v0, :cond_1f

    .line 2344
    .line 2345
    const/16 v76, 0x1

    .line 2346
    .line 2347
    :goto_34
    move/from16 v28, v2

    .line 2348
    .line 2349
    move/from16 v0, v29

    .line 2350
    .line 2351
    goto :goto_35

    .line 2352
    :cond_1f
    const/16 v76, 0x0

    .line 2353
    .line 2354
    goto :goto_34

    .line 2355
    :goto_35
    invoke-interface {v8, v0}, La/xpg0;->getLong(I)J

    .line 2356
    .line 2357
    .line 2358
    move-result-wide v1

    .line 2359
    long-to-int v1, v1

    .line 2360
    if-eqz v1, :cond_20

    .line 2361
    .line 2362
    const/16 v77, 0x1

    .line 2363
    .line 2364
    :goto_36
    move/from16 v29, v3

    .line 2365
    .line 2366
    move/from16 v1, v30

    .line 2367
    .line 2368
    goto :goto_37

    .line 2369
    :cond_20
    const/16 v77, 0x0

    .line 2370
    .line 2371
    goto :goto_36

    .line 2372
    :goto_37
    invoke-interface {v8, v1}, La/xpg0;->getLong(I)J

    .line 2373
    .line 2374
    .line 2375
    move-result-wide v2

    .line 2376
    long-to-int v2, v2

    .line 2377
    if-eqz v2, :cond_21

    .line 2378
    .line 2379
    const/16 v78, 0x1

    .line 2380
    .line 2381
    :goto_38
    move v3, v0

    .line 2382
    move/from16 v30, v1

    .line 2383
    .line 2384
    move/from16 v2, v31

    .line 2385
    .line 2386
    goto :goto_39

    .line 2387
    :cond_21
    const/16 v78, 0x0

    .line 2388
    .line 2389
    goto :goto_38

    .line 2390
    :goto_39
    invoke-interface {v8, v2}, La/xpg0;->getLong(I)J

    .line 2391
    .line 2392
    .line 2393
    move-result-wide v0

    .line 2394
    long-to-int v0, v0

    .line 2395
    if-eqz v0, :cond_22

    .line 2396
    .line 2397
    const/16 v79, 0x1

    .line 2398
    .line 2399
    :goto_3a
    move/from16 v0, v32

    .line 2400
    .line 2401
    goto :goto_3b

    .line 2402
    :cond_22
    const/16 v79, 0x0

    .line 2403
    .line 2404
    goto :goto_3a

    .line 2405
    :goto_3b
    invoke-interface {v8, v0}, La/xpg0;->getLong(I)J

    .line 2406
    .line 2407
    .line 2408
    move-result-wide v80

    .line 2409
    move/from16 v1, v33

    .line 2410
    .line 2411
    invoke-interface {v8, v1}, La/xpg0;->getLong(I)J

    .line 2412
    .line 2413
    .line 2414
    move-result-wide v82

    .line 2415
    move/from16 v32, v0

    .line 2416
    .line 2417
    move/from16 v0, v34

    .line 2418
    .line 2419
    invoke-interface {v8, v0}, La/xpg0;->getBlob(I)[B

    .line 2420
    .line 2421
    .line 2422
    move-result-object v31

    .line 2423
    invoke-static/range {v31 .. v31}, La/dqm0;->n([B)Ljava/util/LinkedHashSet;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v84

    .line 2427
    new-instance v49, La/o4e;

    .line 2428
    .line 2429
    move-object/from16 v73, v49

    .line 2430
    .line 2431
    invoke-direct/range {v73 .. v84}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 2432
    .line 2433
    .line 2434
    move-object/from16 v49, v73

    .line 2435
    .line 2436
    new-instance v36, La/ppv0;

    .line 2437
    .line 2438
    move/from16 v50, v4

    .line 2439
    .line 2440
    invoke-direct/range {v36 .. v69}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 2441
    .line 2442
    .line 2443
    move-object/from16 v4, v36

    .line 2444
    .line 2445
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 2446
    .line 2447
    .line 2448
    move v4, v3

    .line 2449
    move/from16 v3, p1

    .line 2450
    .line 2451
    move/from16 p1, v17

    .line 2452
    .line 2453
    move/from16 v17, v21

    .line 2454
    .line 2455
    move/from16 v21, v25

    .line 2456
    .line 2457
    move/from16 v25, v26

    .line 2458
    .line 2459
    move/from16 v26, v27

    .line 2460
    .line 2461
    move/from16 v27, v28

    .line 2462
    .line 2463
    move/from16 v28, v29

    .line 2464
    .line 2465
    move/from16 v29, v4

    .line 2466
    .line 2467
    move/from16 v34, v0

    .line 2468
    .line 2469
    move/from16 v33, v1

    .line 2470
    .line 2471
    move/from16 v31, v2

    .line 2472
    .line 2473
    move v1, v5

    .line 2474
    move/from16 v4, v35

    .line 2475
    .line 2476
    move/from16 v5, v70

    .line 2477
    .line 2478
    move/from16 v0, v71

    .line 2479
    .line 2480
    move/from16 v2, p0

    .line 2481
    .line 2482
    move/from16 p0, v72

    .line 2483
    .line 2484
    goto/16 :goto_2b

    .line 2485
    .line 2486
    :cond_23
    invoke-interface {v8}, Ljava/lang/AutoCloseable;->close()V

    .line 2487
    .line 2488
    .line 2489
    return-object v15

    .line 2490
    :goto_3c
    invoke-interface {v8}, Ljava/lang/AutoCloseable;->close()V

    .line 2491
    .line 2492
    .line 2493
    throw v0

    .line 2494
    :pswitch_14
    move-object/from16 v0, p1

    .line 2495
    .line 2496
    check-cast v0, La/qpg0;

    .line 2497
    .line 2498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2499
    .line 2500
    .line 2501
    const-string v1, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)"

    .line 2502
    .line 2503
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 2504
    .line 2505
    .line 2506
    move-result-object v1

    .line 2507
    :try_start_5
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 2508
    .line 2509
    .line 2510
    move-result v0

    .line 2511
    if-eqz v0, :cond_24

    .line 2512
    .line 2513
    const/4 v0, 0x0

    .line 2514
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 2515
    .line 2516
    .line 2517
    move-result-wide v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 2518
    long-to-int v5, v2

    .line 2519
    goto :goto_3d

    .line 2520
    :catchall_5
    move-exception v0

    .line 2521
    goto :goto_3e

    .line 2522
    :cond_24
    const/4 v0, 0x0

    .line 2523
    move v5, v0

    .line 2524
    :goto_3d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2525
    .line 2526
    .line 2527
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v0

    .line 2531
    return-object v0

    .line 2532
    :goto_3e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2533
    .line 2534
    .line 2535
    throw v0

    .line 2536
    :pswitch_15
    move-object/from16 v0, p1

    .line 2537
    .line 2538
    check-cast v0, La/qpg0;

    .line 2539
    .line 2540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2541
    .line 2542
    .line 2543
    const-string v1, "DELETE FROM WorkProgress"

    .line 2544
    .line 2545
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v1

    .line 2549
    :try_start_6
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 2550
    .line 2551
    .line 2552
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2553
    .line 2554
    .line 2555
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2556
    .line 2557
    return-object v0

    .line 2558
    :catchall_6
    move-exception v0

    .line 2559
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 2560
    .line 2561
    .line 2562
    throw v0

    .line 2563
    :pswitch_16
    move-object/from16 v0, p1

    .line 2564
    .line 2565
    check-cast v0, La/y2e;

    .line 2566
    .line 2567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2568
    .line 2569
    .line 2570
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v0

    .line 2574
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v0

    .line 2578
    return-object v0

    .line 2579
    :pswitch_17
    move-object/from16 v0, p1

    .line 2580
    .line 2581
    check-cast v0, La/mjv0;

    .line 2582
    .line 2583
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2584
    .line 2585
    .line 2586
    return-object v0

    .line 2587
    :pswitch_18
    move-object/from16 v0, p1

    .line 2588
    .line 2589
    check-cast v0, La/djv0;

    .line 2590
    .line 2591
    iget-object v0, v0, La/djv0;->e:La/q33;

    .line 2592
    .line 2593
    return-object v0

    .line 2594
    :pswitch_19
    move-object/from16 v0, p1

    .line 2595
    .line 2596
    check-cast v0, La/djv0;

    .line 2597
    .line 2598
    iget-object v0, v0, La/djv0;->c:La/q33;

    .line 2599
    .line 2600
    return-object v0

    .line 2601
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2602
    .line 2603
    check-cast v0, La/djv0;

    .line 2604
    .line 2605
    iget-object v0, v0, La/djv0;->f:La/q33;

    .line 2606
    .line 2607
    return-object v0

    .line 2608
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2609
    .line 2610
    check-cast v0, La/djv0;

    .line 2611
    .line 2612
    iget-object v0, v0, La/djv0;->g:La/q33;

    .line 2613
    .line 2614
    return-object v0

    .line 2615
    :pswitch_data_0
    .packed-switch 0x0
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
