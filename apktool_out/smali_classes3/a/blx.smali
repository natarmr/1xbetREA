.class public abstract La/blx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Intent;)La/k9h0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/blx;->d(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-string v1, "OPEN_SCREEN"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p0, v0

    .line 22
    :goto_0
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_1
    instance-of v1, p0, La/k9h0;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    check-cast p0, La/k9h0;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    instance-of v1, p0, Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 37
    .line 38
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p0}, La/k9h0;->valueOf(Ljava/lang/String;)La/k9h0;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 47
    .line 48
    new-instance v1, La/g0g0;

    .line 49
    .line 50
    invoke-direct {v1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object p0, v1

    .line 54
    :goto_1
    nop

    .line 55
    instance-of v1, p0, La/g0g0;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object v0, p0

    .line 61
    :goto_2
    check-cast v0, La/k9h0;

    .line 62
    .line 63
    :cond_4
    :goto_3
    return-object v0
.end method

.method public static final b(Landroid/content/Intent;)La/pdd0;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/sad0;->a:La/sad0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/blx;->a(Landroid/content/Intent;)La/k9h0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "selected_game_id"

    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v6

    .line 20
    cmp-long v6, v6, v4

    .line 21
    .line 22
    const-string v7, "selected_sub_game_id"

    .line 23
    .line 24
    const-string v8, "is_live"

    .line 25
    .line 26
    const-string v9, "subSportId"

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-eqz v6, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v12

    .line 35
    invoke-virtual {v0, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "sportId"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v16

    .line 44
    invoke-virtual {v0, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v9, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-virtual {v0, v9}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v8, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v20

    .line 58
    invoke-virtual {v0, v8}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v7, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v14

    .line 65
    invoke-virtual {v0, v7}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    cmp-long v0, v12, v4

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    new-instance v11, La/ycd0;

    .line 73
    .line 74
    const-wide/16 v0, 0x28

    .line 75
    .line 76
    cmp-long v0, v16, v0

    .line 77
    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    cmp-long v0, v2, v4

    .line 81
    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    move-wide/from16 v18, v2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    move-wide/from16 v18, v4

    .line 88
    .line 89
    :goto_0
    invoke-direct/range {v11 .. v20}, La/ycd0;-><init>(JJJJZ)V

    .line 90
    .line 91
    .line 92
    return-object v11

    .line 93
    :cond_1
    move-object/from16 v26, v1

    .line 94
    .line 95
    goto/16 :goto_2e

    .line 96
    .line 97
    :cond_2
    const-string v6, "mass_mailing_key"

    .line 98
    .line 99
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    const-string v11, ""

    .line 104
    .line 105
    if-nez v6, :cond_3

    .line 106
    .line 107
    move-object v6, v11

    .line 108
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-lez v6, :cond_4

    .line 113
    .line 114
    sget-object v0, La/sad0;->b:La/sad0;

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_4
    const-string v6, "link_start_key"

    .line 118
    .line 119
    invoke-virtual {v0, v6, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    const/4 v12, 0x0

    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    const-string v1, "link_start_url"

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    new-instance v1, La/ebd0;

    .line 135
    .line 136
    invoke-direct {v1, v0}, La/ebd0;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_5
    return-object v12

    .line 141
    :cond_6
    const-string v6, "SHOW_AUTHORIZATION"

    .line 142
    .line 143
    invoke-virtual {v0, v6, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    if-eqz v13, :cond_7

    .line 148
    .line 149
    invoke-virtual {v0, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v0, La/n9d0;

    .line 153
    .line 154
    invoke-direct {v0, v10}, La/n9d0;-><init>(Z)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_7
    const-string v6, "SHOW_SETTINGS"

    .line 159
    .line 160
    invoke-virtual {v0, v6, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eqz v13, :cond_8

    .line 165
    .line 166
    invoke-virtual {v0, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    sget-object v0, La/vcd0;->a:La/vcd0;

    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_8
    const-string v6, "SHOW_POPULAR"

    .line 173
    .line 174
    invoke-virtual {v0, v6, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-eqz v13, :cond_9

    .line 179
    .line 180
    invoke-virtual {v0, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v0, La/acd0;

    .line 184
    .line 185
    invoke-direct {v0}, La/acd0;-><init>()V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :cond_9
    const-string v6, "SHOW_SUPPORT_CHAT"

    .line 190
    .line 191
    invoke-virtual {v0, v6, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-eqz v13, :cond_a

    .line 196
    .line 197
    invoke-virtual {v0, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, La/sad0;->c:La/sad0;

    .line 201
    .line 202
    return-object v0

    .line 203
    :cond_a
    const-string v6, "limited_blocked_logon"

    .line 204
    .line 205
    invoke-virtual {v0, v6, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    const/4 v14, 0x1

    .line 210
    if-eqz v13, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0, v6}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    new-instance v0, La/n9d0;

    .line 216
    .line 217
    invoke-direct {v0, v14}, La/n9d0;-><init>(Z)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_b
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 222
    .line 223
    .line 224
    move-result-wide v15

    .line 225
    cmp-long v6, v15, v4

    .line 226
    .line 227
    const-string v13, "SPORT_ID"

    .line 228
    .line 229
    if-eqz v6, :cond_c

    .line 230
    .line 231
    invoke-virtual {v0, v13, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 232
    .line 233
    .line 234
    move-result-wide v20

    .line 235
    invoke-virtual {v0, v13}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v16

    .line 242
    invoke-virtual {v0, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v7, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v18

    .line 249
    invoke-virtual {v0, v7}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v9, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 253
    .line 254
    .line 255
    move-result-wide v22

    .line 256
    invoke-virtual {v0, v9}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v8, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 260
    .line 261
    .line 262
    move-result v24

    .line 263
    invoke-virtual {v0, v8}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    new-instance v15, La/xad0;

    .line 267
    .line 268
    invoke-direct/range {v15 .. v24}, La/xad0;-><init>(JJJJZ)V

    .line 269
    .line 270
    .line 271
    return-object v15

    .line 272
    :cond_c
    if-eqz v2, :cond_4b

    .line 273
    .line 274
    const-string v3, "OPEN_SCREEN"

    .line 275
    .line 276
    invoke-virtual {v0, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const-string v3, "IS_PUSH_NOTIFICATION"

    .line 280
    .line 281
    invoke-virtual {v0, v3, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    const-string v8, "REGISTRATION_DEFAULT_BONUS_ID"

    .line 290
    .line 291
    const-string v7, "IS_CYBER"

    .line 292
    .line 293
    const-string v4, "tournament"

    .line 294
    .line 295
    const-string v5, "live"

    .line 296
    .line 297
    const-string v15, "game"

    .line 298
    .line 299
    const-string v12, "subcategory"

    .line 300
    .line 301
    const-string v14, "FILTER_IDS"

    .line 302
    .line 303
    move-object/from16 v22, v11

    .line 304
    .line 305
    const-string v10, "PARAM_URL"

    .line 306
    .line 307
    const-string v11, "CYBER_TYPE"

    .line 308
    .line 309
    move-object/from16 v26, v1

    .line 310
    .line 311
    const-string v1, "PARAM_TYPE"

    .line 312
    .line 313
    move/from16 v27, v3

    .line 314
    .line 315
    const-string v3, "ACTIVITY_RECREATED"

    .line 316
    .line 317
    move/from16 v28, v6

    .line 318
    .line 319
    const-string v6, "PARAM_ID"

    .line 320
    .line 321
    packed-switch v28, :pswitch_data_0

    .line 322
    .line 323
    .line 324
    :pswitch_0
    goto/16 :goto_2e

    .line 325
    .line 326
    :pswitch_1
    const-string v1, "SPECIAL_EVENT_TOP_CHAMP_ID"

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    new-instance v1, La/xcd0;

    .line 334
    .line 335
    invoke-direct {v1, v0}, La/xcd0;-><init>(I)V

    .line 336
    .line 337
    .line 338
    return-object v1

    .line 339
    :pswitch_2
    sget-object v0, La/qad0;->a:La/qad0;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_3
    sget-object v0, La/add0;->a:La/add0;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_4
    const/4 v2, 0x0

    .line 346
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    if-eqz v2, :cond_d

    .line 351
    .line 352
    const-wide/high16 v34, -0x8000000000000000L

    .line 353
    .line 354
    goto :goto_1

    .line 355
    :cond_d
    const-wide/high16 v3, -0x8000000000000000L

    .line 356
    .line 357
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 358
    .line 359
    .line 360
    move-result-wide v10

    .line 361
    move-wide/from16 v34, v10

    .line 362
    .line 363
    :goto_1
    if-eqz v2, :cond_f

    .line 364
    .line 365
    sget-object v2, La/iun;->a:La/iun;

    .line 366
    .line 367
    :cond_e
    :goto_2
    move-object/from16 v32, v2

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_f
    invoke-virtual {v0, v14}, Landroid/content/Intent;->getLongArrayExtra(Ljava/lang/String;)[J

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    if-eqz v2, :cond_10

    .line 375
    .line 376
    invoke-static {v2}, La/tx3;->f0([J)Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    if-nez v2, :cond_e

    .line 381
    .line 382
    :cond_10
    sget-object v2, La/iun;->a:La/iun;

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :goto_3
    if-eqz v27, :cond_11

    .line 386
    .line 387
    sget-object v2, La/q91;->c:La/q91;

    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_11
    sget-object v2, La/q91;->b:La/q91;

    .line 391
    .line 392
    :goto_4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    if-nez v0, :cond_12

    .line 397
    .line 398
    move-object/from16 v11, v22

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_12
    move-object v11, v0

    .line 402
    :goto_5
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_13

    .line 407
    .line 408
    new-instance v0, La/fr1;

    .line 409
    .line 410
    new-instance v28, La/fs80;

    .line 411
    .line 412
    const/16 v36, 0x0

    .line 413
    .line 414
    const/16 v37, 0x79

    .line 415
    .line 416
    const/16 v29, 0x0

    .line 417
    .line 418
    const/16 v33, 0x0

    .line 419
    .line 420
    move-wide/from16 v30, v34

    .line 421
    .line 422
    const-wide/16 v34, 0x0

    .line 423
    .line 424
    invoke-direct/range {v28 .. v37}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 425
    .line 426
    .line 427
    move-object/from16 v1, v28

    .line 428
    .line 429
    invoke-direct {v0, v1, v2}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 430
    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_13
    move-wide/from16 v30, v34

    .line 434
    .line 435
    invoke-virtual {v11, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_14

    .line 440
    .line 441
    new-instance v0, La/fr1;

    .line 442
    .line 443
    new-instance v28, La/fs80;

    .line 444
    .line 445
    const/16 v36, 0x0

    .line 446
    .line 447
    const/16 v37, 0x6f

    .line 448
    .line 449
    const/16 v29, 0x0

    .line 450
    .line 451
    move-wide/from16 v34, v30

    .line 452
    .line 453
    const-wide/16 v30, 0x0

    .line 454
    .line 455
    const/16 v32, 0x0

    .line 456
    .line 457
    const/16 v33, 0x0

    .line 458
    .line 459
    invoke-direct/range {v28 .. v37}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 460
    .line 461
    .line 462
    move-object/from16 v1, v28

    .line 463
    .line 464
    invoke-direct {v0, v1, v2}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 465
    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_14
    new-instance v0, La/fr1;

    .line 469
    .line 470
    const/4 v1, 0x1

    .line 471
    const/4 v3, 0x0

    .line 472
    invoke-direct {v0, v3, v2, v1}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 473
    .line 474
    .line 475
    :goto_6
    new-instance v1, La/ndd0;

    .line 476
    .line 477
    invoke-direct {v1, v0}, La/ndd0;-><init>(La/lr1;)V

    .line 478
    .line 479
    .line 480
    return-object v1

    .line 481
    :pswitch_5
    new-instance v0, La/ndd0;

    .line 482
    .line 483
    new-instance v1, La/hr1;

    .line 484
    .line 485
    const/4 v2, 0x3

    .line 486
    const-wide/16 v3, 0x0

    .line 487
    .line 488
    invoke-direct {v1, v3, v4, v2}, La/hr1;-><init>(JI)V

    .line 489
    .line 490
    .line 491
    invoke-direct {v0, v1}, La/ndd0;-><init>(La/lr1;)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :pswitch_6
    sget-object v0, La/fbd0;->a:La/fbd0;

    .line 496
    .line 497
    return-object v0

    .line 498
    :pswitch_7
    sget-object v0, La/pbd0;->a:La/pbd0;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_8
    sget-object v0, La/obd0;->a:La/obd0;

    .line 502
    .line 503
    return-object v0

    .line 504
    :pswitch_9
    sget-object v0, La/nbd0;->a:La/nbd0;

    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_a
    const-wide/16 v1, -0x1

    .line 508
    .line 509
    invoke-virtual {v0, v6, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 510
    .line 511
    .line 512
    move-result-wide v0

    .line 513
    const-wide/16 v17, 0x0

    .line 514
    .line 515
    cmp-long v2, v0, v17

    .line 516
    .line 517
    if-gez v2, :cond_15

    .line 518
    .line 519
    goto/16 :goto_2e

    .line 520
    .line 521
    :cond_15
    new-instance v2, La/qbd0;

    .line 522
    .line 523
    invoke-direct {v2, v0, v1}, La/qbd0;-><init>(J)V

    .line 524
    .line 525
    .line 526
    return-object v2

    .line 527
    :pswitch_b
    sget-object v0, La/sbd0;->a:La/sbd0;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_c
    const-string v1, "team_name"

    .line 531
    .line 532
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    if-nez v0, :cond_16

    .line 537
    .line 538
    move-object/from16 v11, v22

    .line 539
    .line 540
    goto :goto_7

    .line 541
    :cond_16
    move-object v11, v0

    .line 542
    :goto_7
    new-instance v0, La/mad0;

    .line 543
    .line 544
    const-wide/16 v3, 0x0

    .line 545
    .line 546
    invoke-direct {v0, v11, v3, v4}, La/mad0;-><init>(Ljava/lang/String;J)V

    .line 547
    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_d
    const/4 v2, 0x0

    .line 551
    invoke-virtual {v0, v11, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    new-instance v2, La/pad0;

    .line 560
    .line 561
    invoke-direct {v2, v1, v0}, La/pad0;-><init>(IZ)V

    .line 562
    .line 563
    .line 564
    return-object v2

    .line 565
    :pswitch_e
    const/4 v2, 0x0

    .line 566
    const-wide/16 v3, 0x0

    .line 567
    .line 568
    invoke-virtual {v0, v11, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    const-string v2, "CHAMP_ID"

    .line 573
    .line 574
    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 575
    .line 576
    .line 577
    move-result-wide v5

    .line 578
    invoke-virtual {v0, v13, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 579
    .line 580
    .line 581
    move-result-wide v7

    .line 582
    invoke-virtual {v0, v9, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 583
    .line 584
    .line 585
    move-result-wide v2

    .line 586
    move-wide v9, v2

    .line 587
    new-instance v3, La/had0;

    .line 588
    .line 589
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 590
    .line 591
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 592
    .line 593
    if-ne v1, v0, :cond_17

    .line 594
    .line 595
    move-wide v7, v9

    .line 596
    :cond_17
    move v4, v1

    .line 597
    invoke-direct/range {v3 .. v8}, La/had0;-><init>(IJJ)V

    .line 598
    .line 599
    .line 600
    return-object v3

    .line 601
    :pswitch_f
    const-wide/16 v3, 0x0

    .line 602
    .line 603
    invoke-virtual {v0, v13, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 604
    .line 605
    .line 606
    move-result-wide v1

    .line 607
    invoke-virtual {v0, v9, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 608
    .line 609
    .line 610
    move-result-wide v3

    .line 611
    const/4 v5, 0x0

    .line 612
    invoke-virtual {v0, v11, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    new-instance v6, La/iad0;

    .line 617
    .line 618
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 619
    .line 620
    iget-byte v7, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 621
    .line 622
    if-ne v0, v7, :cond_18

    .line 623
    .line 624
    move-wide v1, v3

    .line 625
    :cond_18
    invoke-direct {v6, v0, v1, v2, v5}, La/iad0;-><init>(IJZ)V

    .line 626
    .line 627
    .line 628
    return-object v6

    .line 629
    :pswitch_10
    const-wide/16 v3, 0x0

    .line 630
    .line 631
    const-string v1, "GAME_ID"

    .line 632
    .line 633
    invoke-virtual {v0, v1, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 634
    .line 635
    .line 636
    move-result-wide v25

    .line 637
    invoke-virtual {v0, v13, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 638
    .line 639
    .line 640
    move-result-wide v27

    .line 641
    invoke-virtual {v0, v9, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 642
    .line 643
    .line 644
    move-result-wide v29

    .line 645
    const-string v1, "GAME_TYPE"

    .line 646
    .line 647
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    new-instance v24, La/kad0;

    .line 652
    .line 653
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-eqz v1, :cond_19

    .line 658
    .line 659
    const/16 v31, 0x1

    .line 660
    .line 661
    goto :goto_8

    .line 662
    :cond_19
    const-string v1, "line"

    .line 663
    .line 664
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    const/16 v31, 0x0

    .line 668
    .line 669
    :goto_8
    invoke-direct/range {v24 .. v31}, La/kad0;-><init>(JJJZ)V

    .line 670
    .line 671
    .line 672
    return-object v24

    .line 673
    :pswitch_11
    sget-object v0, La/l9d0;->a:La/l9d0;

    .line 674
    .line 675
    return-object v0

    .line 676
    :pswitch_12
    new-instance v0, La/j9d0;

    .line 677
    .line 678
    new-instance v1, La/jr1;

    .line 679
    .line 680
    new-instance v2, La/cvc0;

    .line 681
    .line 682
    sget-object v3, La/d7v;->c:La/d7v;

    .line 683
    .line 684
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 685
    .line 686
    .line 687
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 688
    .line 689
    .line 690
    invoke-direct {v0, v1}, La/j9d0;-><init>(La/lr1;)V

    .line 691
    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_13
    new-instance v0, La/j9d0;

    .line 695
    .line 696
    new-instance v1, La/jr1;

    .line 697
    .line 698
    new-instance v2, La/cvc0;

    .line 699
    .line 700
    sget-object v3, La/d7v;->d:La/d7v;

    .line 701
    .line 702
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 703
    .line 704
    .line 705
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 706
    .line 707
    .line 708
    invoke-direct {v0, v1}, La/j9d0;-><init>(La/lr1;)V

    .line 709
    .line 710
    .line 711
    return-object v0

    .line 712
    :pswitch_14
    new-instance v0, La/j9d0;

    .line 713
    .line 714
    new-instance v1, La/jr1;

    .line 715
    .line 716
    new-instance v2, La/cvc0;

    .line 717
    .line 718
    sget-object v3, La/d7v;->b:La/d7v;

    .line 719
    .line 720
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 721
    .line 722
    .line 723
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 724
    .line 725
    .line 726
    invoke-direct {v0, v1}, La/j9d0;-><init>(La/lr1;)V

    .line 727
    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_15
    const/4 v2, 0x0

    .line 731
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    if-eqz v1, :cond_1a

    .line 736
    .line 737
    const-wide/16 v4, 0x0

    .line 738
    .line 739
    goto :goto_9

    .line 740
    :cond_1a
    const-wide/16 v3, 0x0

    .line 741
    .line 742
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 743
    .line 744
    .line 745
    move-result-wide v4

    .line 746
    :goto_9
    const-string v1, "needTransfer"

    .line 747
    .line 748
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    new-instance v1, La/k9d0;

    .line 753
    .line 754
    invoke-direct {v1, v0, v4, v5}, La/k9d0;-><init>(ZJ)V

    .line 755
    .line 756
    .line 757
    return-object v1

    .line 758
    :pswitch_16
    sget-object v0, La/gdd0;->a:La/gdd0;

    .line 759
    .line 760
    return-object v0

    .line 761
    :pswitch_17
    const/4 v2, 0x0

    .line 762
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    if-eqz v1, :cond_1b

    .line 767
    .line 768
    const-wide/16 v4, 0x0

    .line 769
    .line 770
    goto :goto_a

    .line 771
    :cond_1b
    const-wide/16 v3, 0x0

    .line 772
    .line 773
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 774
    .line 775
    .line 776
    move-result-wide v4

    .line 777
    :goto_a
    new-instance v0, La/j9d0;

    .line 778
    .line 779
    new-instance v1, La/jr1;

    .line 780
    .line 781
    new-instance v2, La/dvc0;

    .line 782
    .line 783
    long-to-int v3, v4

    .line 784
    invoke-direct {v2, v3}, La/dvc0;-><init>(I)V

    .line 785
    .line 786
    .line 787
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 788
    .line 789
    .line 790
    invoke-direct {v0, v1}, La/j9d0;-><init>(La/lr1;)V

    .line 791
    .line 792
    .line 793
    return-object v0

    .line 794
    :pswitch_18
    const/4 v2, 0x0

    .line 795
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    if-eqz v3, :cond_1c

    .line 800
    .line 801
    const-wide/16 v5, 0x0

    .line 802
    .line 803
    goto :goto_b

    .line 804
    :cond_1c
    const-wide/16 v2, 0x0

    .line 805
    .line 806
    invoke-virtual {v0, v6, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 807
    .line 808
    .line 809
    move-result-wide v5

    .line 810
    :goto_b
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    if-nez v0, :cond_1d

    .line 815
    .line 816
    move-object/from16 v11, v22

    .line 817
    .line 818
    goto :goto_c

    .line 819
    :cond_1d
    move-object v11, v0

    .line 820
    :goto_c
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    sparse-switch v0, :sswitch_data_0

    .line 825
    .line 826
    .line 827
    goto/16 :goto_d

    .line 828
    .line 829
    :sswitch_0
    const-string v0, "nativetournament"

    .line 830
    .line 831
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    if-nez v0, :cond_1e

    .line 836
    .line 837
    goto/16 :goto_d

    .line 838
    .line 839
    :cond_1e
    new-instance v0, La/jr1;

    .line 840
    .line 841
    new-instance v1, La/evc0;

    .line 842
    .line 843
    const/4 v2, 0x0

    .line 844
    invoke-direct {v1, v2, v5, v6}, La/evc0;-><init>(ZJ)V

    .line 845
    .line 846
    .line 847
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 848
    .line 849
    .line 850
    goto/16 :goto_e

    .line 851
    .line 852
    :sswitch_1
    const-string v0, "bonuses"

    .line 853
    .line 854
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    if-nez v0, :cond_1f

    .line 859
    .line 860
    goto/16 :goto_d

    .line 861
    .line 862
    :cond_1f
    new-instance v0, La/jr1;

    .line 863
    .line 864
    new-instance v1, La/cvc0;

    .line 865
    .line 866
    sget-object v2, La/d7v;->c:La/d7v;

    .line 867
    .line 868
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 869
    .line 870
    .line 871
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 872
    .line 873
    .line 874
    goto/16 :goto_e

    .line 875
    .line 876
    :sswitch_2
    const-string v0, "freespins"

    .line 877
    .line 878
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-nez v0, :cond_20

    .line 883
    .line 884
    goto :goto_d

    .line 885
    :cond_20
    new-instance v0, La/jr1;

    .line 886
    .line 887
    new-instance v1, La/cvc0;

    .line 888
    .line 889
    sget-object v2, La/d7v;->d:La/d7v;

    .line 890
    .line 891
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 892
    .line 893
    .line 894
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 895
    .line 896
    .line 897
    goto :goto_e

    .line 898
    :sswitch_3
    const-string v0, "promocode"

    .line 899
    .line 900
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    if-nez v0, :cond_21

    .line 905
    .line 906
    goto :goto_d

    .line 907
    :cond_21
    new-instance v0, La/jr1;

    .line 908
    .line 909
    new-instance v1, La/dvc0;

    .line 910
    .line 911
    long-to-int v2, v5

    .line 912
    invoke-direct {v1, v2}, La/dvc0;-><init>(I)V

    .line 913
    .line 914
    .line 915
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 916
    .line 917
    .line 918
    goto :goto_e

    .line 919
    :sswitch_4
    const-string v0, "tournaments"

    .line 920
    .line 921
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v0

    .line 925
    if-nez v0, :cond_22

    .line 926
    .line 927
    goto :goto_d

    .line 928
    :cond_22
    new-instance v0, La/jr1;

    .line 929
    .line 930
    new-instance v1, La/evc0;

    .line 931
    .line 932
    const/4 v2, 0x0

    .line 933
    const-wide/16 v3, 0x0

    .line 934
    .line 935
    invoke-direct {v1, v2, v3, v4}, La/evc0;-><init>(ZJ)V

    .line 936
    .line 937
    .line 938
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 939
    .line 940
    .line 941
    goto :goto_e

    .line 942
    :sswitch_5
    const-string v0, "prizes"

    .line 943
    .line 944
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    if-nez v0, :cond_23

    .line 949
    .line 950
    goto :goto_d

    .line 951
    :cond_23
    new-instance v0, La/jr1;

    .line 952
    .line 953
    new-instance v1, La/cvc0;

    .line 954
    .line 955
    sget-object v2, La/d7v;->b:La/d7v;

    .line 956
    .line 957
    invoke-direct {v1, v2}, La/cvc0;-><init>(La/d7v;)V

    .line 958
    .line 959
    .line 960
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 961
    .line 962
    .line 963
    goto :goto_e

    .line 964
    :sswitch_6
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    move-result v0

    .line 968
    if-nez v0, :cond_24

    .line 969
    .line 970
    :goto_d
    new-instance v0, La/jr1;

    .line 971
    .line 972
    invoke-direct {v0}, La/jr1;-><init>()V

    .line 973
    .line 974
    .line 975
    goto :goto_e

    .line 976
    :cond_24
    new-instance v0, La/jr1;

    .line 977
    .line 978
    new-instance v1, La/evc0;

    .line 979
    .line 980
    const/4 v2, 0x0

    .line 981
    invoke-direct {v1, v2, v5, v6}, La/evc0;-><init>(ZJ)V

    .line 982
    .line 983
    .line 984
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 985
    .line 986
    .line 987
    :goto_e
    new-instance v1, La/j9d0;

    .line 988
    .line 989
    invoke-direct {v1, v0}, La/j9d0;-><init>(La/lr1;)V

    .line 990
    .line 991
    .line 992
    return-object v1

    .line 993
    :pswitch_19
    const/4 v2, 0x0

    .line 994
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    if-eqz v3, :cond_25

    .line 999
    .line 1000
    const-wide/16 v5, 0x0

    .line 1001
    .line 1002
    const-wide/16 v7, 0x0

    .line 1003
    .line 1004
    goto :goto_f

    .line 1005
    :cond_25
    const-wide/16 v7, 0x0

    .line 1006
    .line 1007
    invoke-virtual {v0, v6, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v17

    .line 1011
    move-wide/from16 v5, v17

    .line 1012
    .line 1013
    :goto_f
    const-string v3, "OPEN_NATIVE_TOURNAMENT"

    .line 1014
    .line 1015
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    if-eqz v3, :cond_26

    .line 1020
    .line 1021
    const-string v2, "casinoNativeTournamentId"

    .line 1022
    .line 1023
    invoke-virtual {v0, v2, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1024
    .line 1025
    .line 1026
    move-result-wide v2

    .line 1027
    goto :goto_10

    .line 1028
    :cond_26
    const-string v2, "casinoTournamentId"

    .line 1029
    .line 1030
    invoke-virtual {v0, v2, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1031
    .line 1032
    .line 1033
    move-result-wide v2

    .line 1034
    :goto_10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    if-nez v0, :cond_27

    .line 1039
    .line 1040
    move-object/from16 v11, v22

    .line 1041
    .line 1042
    goto :goto_11

    .line 1043
    :cond_27
    move-object v11, v0

    .line 1044
    :goto_11
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1045
    .line 1046
    .line 1047
    move-result v0

    .line 1048
    if-eqz v0, :cond_28

    .line 1049
    .line 1050
    new-instance v0, La/jr1;

    .line 1051
    .line 1052
    new-instance v1, La/evc0;

    .line 1053
    .line 1054
    const/4 v4, 0x0

    .line 1055
    invoke-direct {v1, v4, v5, v6}, La/evc0;-><init>(ZJ)V

    .line 1056
    .line 1057
    .line 1058
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_12

    .line 1062
    :cond_28
    const/4 v4, 0x0

    .line 1063
    new-instance v0, La/jr1;

    .line 1064
    .line 1065
    new-instance v1, La/evc0;

    .line 1066
    .line 1067
    invoke-direct {v1, v4, v2, v3}, La/evc0;-><init>(ZJ)V

    .line 1068
    .line 1069
    .line 1070
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 1071
    .line 1072
    .line 1073
    :goto_12
    new-instance v1, La/j9d0;

    .line 1074
    .line 1075
    invoke-direct {v1, v0}, La/j9d0;-><init>(La/lr1;)V

    .line 1076
    .line 1077
    .line 1078
    return-object v1

    .line 1079
    :pswitch_1a
    const/4 v4, 0x0

    .line 1080
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v2

    .line 1084
    if-eqz v2, :cond_29

    .line 1085
    .line 1086
    const-wide/high16 v10, -0x8000000000000000L

    .line 1087
    .line 1088
    goto :goto_13

    .line 1089
    :cond_29
    const-wide/high16 v3, -0x8000000000000000L

    .line 1090
    .line 1091
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1092
    .line 1093
    .line 1094
    move-result-wide v10

    .line 1095
    :goto_13
    if-eqz v2, :cond_2a

    .line 1096
    .line 1097
    const-wide/16 v30, 0x0

    .line 1098
    .line 1099
    goto :goto_14

    .line 1100
    :cond_2a
    const-string v3, "PARTITION_ID"

    .line 1101
    .line 1102
    const-wide/16 v7, 0x0

    .line 1103
    .line 1104
    invoke-virtual {v0, v3, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v4

    .line 1108
    move-wide/from16 v30, v4

    .line 1109
    .line 1110
    :goto_14
    if-eqz v2, :cond_2c

    .line 1111
    .line 1112
    sget-object v2, La/iun;->a:La/iun;

    .line 1113
    .line 1114
    :cond_2b
    :goto_15
    move-object/from16 v32, v2

    .line 1115
    .line 1116
    goto :goto_16

    .line 1117
    :cond_2c
    invoke-virtual {v0, v14}, Landroid/content/Intent;->getLongArrayExtra(Ljava/lang/String;)[J

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    if-eqz v2, :cond_2d

    .line 1122
    .line 1123
    invoke-static {v2}, La/tx3;->f0([J)Ljava/util/List;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v2

    .line 1127
    if-nez v2, :cond_2b

    .line 1128
    .line 1129
    :cond_2d
    sget-object v2, La/iun;->a:La/iun;

    .line 1130
    .line 1131
    goto :goto_15

    .line 1132
    :goto_16
    if-eqz v27, :cond_2e

    .line 1133
    .line 1134
    sget-object v2, La/q91;->c:La/q91;

    .line 1135
    .line 1136
    goto :goto_17

    .line 1137
    :cond_2e
    sget-object v2, La/q91;->b:La/q91;

    .line 1138
    .line 1139
    :goto_17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    if-nez v0, :cond_2f

    .line 1144
    .line 1145
    move-object/from16 v0, v22

    .line 1146
    .line 1147
    :cond_2f
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1148
    .line 1149
    .line 1150
    move-result v1

    .line 1151
    sparse-switch v1, :sswitch_data_1

    .line 1152
    .line 1153
    .line 1154
    goto/16 :goto_18

    .line 1155
    .line 1156
    :sswitch_7
    const-string v1, "casinoBrandId"

    .line 1157
    .line 1158
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v0

    .line 1162
    if-nez v0, :cond_30

    .line 1163
    .line 1164
    goto :goto_18

    .line 1165
    :cond_30
    new-instance v0, La/er1;

    .line 1166
    .line 1167
    const/4 v1, 0x1

    .line 1168
    invoke-direct {v0, v1, v10, v11}, La/er1;-><init>(ZJ)V

    .line 1169
    .line 1170
    .line 1171
    goto/16 :goto_1b

    .line 1172
    .line 1173
    :sswitch_8
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v0

    .line 1177
    if-nez v0, :cond_31

    .line 1178
    .line 1179
    goto :goto_18

    .line 1180
    :cond_31
    new-instance v0, La/fr1;

    .line 1181
    .line 1182
    new-instance v28, La/fs80;

    .line 1183
    .line 1184
    const/16 v36, 0x0

    .line 1185
    .line 1186
    const/16 v37, 0x79

    .line 1187
    .line 1188
    const/16 v29, 0x0

    .line 1189
    .line 1190
    const/16 v33, 0x0

    .line 1191
    .line 1192
    const-wide/16 v34, 0x0

    .line 1193
    .line 1194
    move-wide/from16 v30, v10

    .line 1195
    .line 1196
    invoke-direct/range {v28 .. v37}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1197
    .line 1198
    .line 1199
    move-object/from16 v1, v28

    .line 1200
    .line 1201
    invoke-direct {v0, v1, v2}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 1202
    .line 1203
    .line 1204
    goto/16 :goto_1b

    .line 1205
    .line 1206
    :sswitch_9
    move-wide/from16 v34, v10

    .line 1207
    .line 1208
    const-string v1, "brand"

    .line 1209
    .line 1210
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    if-nez v0, :cond_33

    .line 1215
    .line 1216
    goto :goto_18

    .line 1217
    :sswitch_a
    move-wide/from16 v34, v10

    .line 1218
    .line 1219
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    if-nez v0, :cond_32

    .line 1224
    .line 1225
    goto :goto_18

    .line 1226
    :cond_32
    new-instance v0, La/fr1;

    .line 1227
    .line 1228
    new-instance v28, La/fs80;

    .line 1229
    .line 1230
    const/16 v36, 0x0

    .line 1231
    .line 1232
    const/16 v37, 0x6f

    .line 1233
    .line 1234
    const/16 v29, 0x0

    .line 1235
    .line 1236
    const-wide/16 v30, 0x0

    .line 1237
    .line 1238
    const/16 v32, 0x0

    .line 1239
    .line 1240
    const/16 v33, 0x0

    .line 1241
    .line 1242
    invoke-direct/range {v28 .. v37}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1243
    .line 1244
    .line 1245
    move-object/from16 v1, v28

    .line 1246
    .line 1247
    invoke-direct {v0, v1, v2}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_1b

    .line 1251
    :sswitch_b
    move-wide/from16 v34, v10

    .line 1252
    .line 1253
    const-string v1, "provider"

    .line 1254
    .line 1255
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    if-nez v0, :cond_33

    .line 1260
    .line 1261
    :goto_18
    new-instance v0, La/fr1;

    .line 1262
    .line 1263
    const/4 v1, 0x1

    .line 1264
    const/4 v3, 0x0

    .line 1265
    invoke-direct {v0, v3, v2, v1}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_1b

    .line 1269
    :cond_33
    new-instance v0, La/fr1;

    .line 1270
    .line 1271
    sget-object v1, La/nw80;->b:La/nw80;

    .line 1272
    .line 1273
    invoke-virtual {v1}, La/nw80;->getId()J

    .line 1274
    .line 1275
    .line 1276
    move-result-wide v3

    .line 1277
    cmp-long v1, v30, v3

    .line 1278
    .line 1279
    if-eqz v1, :cond_35

    .line 1280
    .line 1281
    sget-object v1, La/nw80;->a:La/nw80;

    .line 1282
    .line 1283
    invoke-virtual {v1}, La/nw80;->getId()J

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v3

    .line 1287
    cmp-long v1, v30, v3

    .line 1288
    .line 1289
    if-nez v1, :cond_34

    .line 1290
    .line 1291
    goto :goto_19

    .line 1292
    :cond_34
    new-instance v3, La/fs80;

    .line 1293
    .line 1294
    const/4 v11, 0x0

    .line 1295
    const/16 v12, 0x7f

    .line 1296
    .line 1297
    const/4 v4, 0x0

    .line 1298
    const-wide/16 v5, 0x0

    .line 1299
    .line 1300
    const/4 v7, 0x0

    .line 1301
    const/4 v8, 0x0

    .line 1302
    const-wide/16 v9, 0x0

    .line 1303
    .line 1304
    invoke-direct/range {v3 .. v12}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1305
    .line 1306
    .line 1307
    goto :goto_1a

    .line 1308
    :cond_35
    :goto_19
    new-instance v28, La/fs80;

    .line 1309
    .line 1310
    sget-object v32, La/iun;->a:La/iun;

    .line 1311
    .line 1312
    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v1

    .line 1316
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v33

    .line 1320
    const/16 v36, 0x0

    .line 1321
    .line 1322
    const/16 v37, 0x71

    .line 1323
    .line 1324
    const/16 v29, 0x0

    .line 1325
    .line 1326
    const-wide/16 v34, 0x0

    .line 1327
    .line 1328
    invoke-direct/range {v28 .. v37}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1329
    .line 1330
    .line 1331
    move-object/from16 v3, v28

    .line 1332
    .line 1333
    :goto_1a
    invoke-direct {v0, v3, v2}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 1334
    .line 1335
    .line 1336
    :goto_1b
    new-instance v1, La/j9d0;

    .line 1337
    .line 1338
    invoke-direct {v1, v0}, La/j9d0;-><init>(La/lr1;)V

    .line 1339
    .line 1340
    .line 1341
    return-object v1

    .line 1342
    :pswitch_1b
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    if-nez v0, :cond_36

    .line 1347
    .line 1348
    move-object/from16 v11, v22

    .line 1349
    .line 1350
    goto :goto_1c

    .line 1351
    :cond_36
    move-object v11, v0

    .line 1352
    :goto_1c
    const-string v0, "vipcashback"

    .line 1353
    .line 1354
    invoke-virtual {v11, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v0

    .line 1358
    if-eqz v0, :cond_37

    .line 1359
    .line 1360
    new-instance v0, La/hr1;

    .line 1361
    .line 1362
    const-wide/16 v1, -0xa

    .line 1363
    .line 1364
    const/4 v3, 0x2

    .line 1365
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_1d

    .line 1369
    :cond_37
    new-instance v0, La/hr1;

    .line 1370
    .line 1371
    const/4 v2, 0x3

    .line 1372
    const-wide/16 v3, 0x0

    .line 1373
    .line 1374
    invoke-direct {v0, v3, v4, v2}, La/hr1;-><init>(JI)V

    .line 1375
    .line 1376
    .line 1377
    :goto_1d
    new-instance v1, La/j9d0;

    .line 1378
    .line 1379
    invoke-direct {v1, v0}, La/j9d0;-><init>(La/lr1;)V

    .line 1380
    .line 1381
    .line 1382
    return-object v1

    .line 1383
    :pswitch_1c
    sget-object v0, La/pcd0;->a:La/pcd0;

    .line 1384
    .line 1385
    return-object v0

    .line 1386
    :pswitch_1d
    sget-object v0, La/scd0;->a:La/scd0;

    .line 1387
    .line 1388
    return-object v0

    .line 1389
    :pswitch_1e
    const/4 v2, 0x0

    .line 1390
    invoke-virtual {v0, v11, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1391
    .line 1392
    .line 1393
    move-result v1

    .line 1394
    const-string v3, "IS_EWC"

    .line 1395
    .line 1396
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    new-instance v2, La/gad0;

    .line 1401
    .line 1402
    invoke-direct {v2, v1, v0}, La/gad0;-><init>(IZ)V

    .line 1403
    .line 1404
    .line 1405
    return-object v2

    .line 1406
    :pswitch_1f
    sget-object v0, La/qcd0;->a:La/qcd0;

    .line 1407
    .line 1408
    return-object v0

    .line 1409
    :pswitch_20
    sget-object v0, La/y9d0;->a:La/y9d0;

    .line 1410
    .line 1411
    return-object v0

    .line 1412
    :pswitch_21
    new-instance v1, La/ebd0;

    .line 1413
    .line 1414
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    if-nez v0, :cond_38

    .line 1419
    .line 1420
    move-object/from16 v11, v22

    .line 1421
    .line 1422
    goto :goto_1e

    .line 1423
    :cond_38
    move-object v11, v0

    .line 1424
    :goto_1e
    invoke-direct {v1, v11}, La/ebd0;-><init>(Ljava/lang/String;)V

    .line 1425
    .line 1426
    .line 1427
    return-object v1

    .line 1428
    :pswitch_22
    new-instance v1, La/kcd0;

    .line 1429
    .line 1430
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v0

    .line 1434
    if-nez v0, :cond_39

    .line 1435
    .line 1436
    move-object/from16 v11, v22

    .line 1437
    .line 1438
    goto :goto_1f

    .line 1439
    :cond_39
    move-object v11, v0

    .line 1440
    :goto_1f
    invoke-direct {v1, v11}, La/kcd0;-><init>(Ljava/lang/String;)V

    .line 1441
    .line 1442
    .line 1443
    return-object v1

    .line 1444
    :pswitch_23
    new-instance v1, La/jcd0;

    .line 1445
    .line 1446
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    if-nez v0, :cond_3a

    .line 1451
    .line 1452
    move-object/from16 v11, v22

    .line 1453
    .line 1454
    goto :goto_20

    .line 1455
    :cond_3a
    move-object v11, v0

    .line 1456
    :goto_20
    invoke-direct {v1, v11}, La/jcd0;-><init>(Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    return-object v1

    .line 1460
    :pswitch_24
    const-wide/16 v3, 0x0

    .line 1461
    .line 1462
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1463
    .line 1464
    .line 1465
    move-result-wide v0

    .line 1466
    new-instance v2, La/icd0;

    .line 1467
    .line 1468
    sget-object v3, La/aue0;->c:La/aue0;

    .line 1469
    .line 1470
    invoke-direct {v2, v0, v1, v3}, La/icd0;-><init>(JLa/aue0;)V

    .line 1471
    .line 1472
    .line 1473
    return-object v2

    .line 1474
    :pswitch_25
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    if-nez v0, :cond_3b

    .line 1479
    .line 1480
    move-object/from16 v11, v22

    .line 1481
    .line 1482
    goto :goto_21

    .line 1483
    :cond_3b
    move-object v11, v0

    .line 1484
    :goto_21
    new-instance v0, La/ead0;

    .line 1485
    .line 1486
    const/4 v2, 0x0

    .line 1487
    invoke-direct {v0, v11, v2}, La/ead0;-><init>(Ljava/lang/String;Z)V

    .line 1488
    .line 1489
    .line 1490
    return-object v0

    .line 1491
    :pswitch_26
    sget-object v0, La/edd0;->a:La/edd0;

    .line 1492
    .line 1493
    return-object v0

    .line 1494
    :pswitch_27
    new-instance v1, La/wbd0;

    .line 1495
    .line 1496
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    if-nez v0, :cond_3c

    .line 1501
    .line 1502
    move-object/from16 v11, v22

    .line 1503
    .line 1504
    goto :goto_22

    .line 1505
    :cond_3c
    move-object v11, v0

    .line 1506
    :goto_22
    invoke-direct {v1, v11}, La/wbd0;-><init>(Ljava/lang/String;)V

    .line 1507
    .line 1508
    .line 1509
    return-object v1

    .line 1510
    :pswitch_28
    sget-object v0, La/lcd0;->a:La/lcd0;

    .line 1511
    .line 1512
    return-object v0

    .line 1513
    :pswitch_29
    new-instance v0, La/vbd0;

    .line 1514
    .line 1515
    invoke-direct {v0}, La/vbd0;-><init>()V

    .line 1516
    .line 1517
    .line 1518
    return-object v0

    .line 1519
    :pswitch_2a
    const/4 v3, 0x0

    .line 1520
    const-wide/16 v7, 0x0

    .line 1521
    .line 1522
    invoke-virtual {v0, v6, v7, v8}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1523
    .line 1524
    .line 1525
    move-result-wide v4

    .line 1526
    const-string v2, "PARAM_SCREEN_TYPE"

    .line 1527
    .line 1528
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v2

    .line 1532
    if-nez v2, :cond_3d

    .line 1533
    .line 1534
    move-object/from16 v11, v22

    .line 1535
    .line 1536
    goto :goto_23

    .line 1537
    :cond_3d
    move-object v11, v2

    .line 1538
    :goto_23
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    instance-of v1, v0, La/d270;

    .line 1543
    .line 1544
    if-eqz v1, :cond_3e

    .line 1545
    .line 1546
    move-object v12, v0

    .line 1547
    check-cast v12, La/d270;

    .line 1548
    .line 1549
    goto :goto_24

    .line 1550
    :cond_3e
    move-object v12, v3

    .line 1551
    :goto_24
    if-nez v12, :cond_3f

    .line 1552
    .line 1553
    sget-object v12, La/d270;->j:La/d270;

    .line 1554
    .line 1555
    :cond_3f
    new-instance v0, La/zad0;

    .line 1556
    .line 1557
    invoke-direct {v0, v4, v5, v12, v11}, La/zad0;-><init>(JLa/d270;Ljava/lang/String;)V

    .line 1558
    .line 1559
    .line 1560
    return-object v0

    .line 1561
    :pswitch_2b
    const/4 v3, 0x0

    .line 1562
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v2

    .line 1566
    if-nez v2, :cond_40

    .line 1567
    .line 1568
    move-object/from16 v11, v22

    .line 1569
    .line 1570
    goto :goto_25

    .line 1571
    :cond_40
    move-object v11, v2

    .line 1572
    :goto_25
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    instance-of v1, v0, La/r080;

    .line 1577
    .line 1578
    if-eqz v1, :cond_41

    .line 1579
    .line 1580
    move-object v12, v0

    .line 1581
    check-cast v12, La/r080;

    .line 1582
    .line 1583
    goto :goto_26

    .line 1584
    :cond_41
    move-object v12, v3

    .line 1585
    :goto_26
    if-nez v12, :cond_42

    .line 1586
    .line 1587
    sget-object v12, La/r080;->a:La/r080;

    .line 1588
    .line 1589
    :cond_42
    new-instance v0, La/m9d0;

    .line 1590
    .line 1591
    invoke-direct {v0, v11, v12}, La/m9d0;-><init>(Ljava/lang/String;La/r080;)V

    .line 1592
    .line 1593
    .line 1594
    return-object v0

    .line 1595
    :pswitch_2c
    sget-object v0, La/bcd0;->a:La/bcd0;

    .line 1596
    .line 1597
    return-object v0

    .line 1598
    :pswitch_2d
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v1

    .line 1602
    if-nez v1, :cond_44

    .line 1603
    .line 1604
    const-string v1, "PARAM_DEEPLINK"

    .line 1605
    .line 1606
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v0

    .line 1610
    if-nez v0, :cond_43

    .line 1611
    .line 1612
    move-object/from16 v11, v22

    .line 1613
    .line 1614
    goto :goto_27

    .line 1615
    :cond_43
    move-object v11, v0

    .line 1616
    goto :goto_27

    .line 1617
    :cond_44
    move-object v11, v1

    .line 1618
    :goto_27
    new-instance v0, La/rad0;

    .line 1619
    .line 1620
    invoke-direct {v0, v11}, La/rad0;-><init>(Ljava/lang/String;)V

    .line 1621
    .line 1622
    .line 1623
    return-object v0

    .line 1624
    :pswitch_2e
    const/4 v2, 0x0

    .line 1625
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1626
    .line 1627
    .line 1628
    move-result v1

    .line 1629
    invoke-virtual {v0, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 1630
    .line 1631
    .line 1632
    if-eqz v1, :cond_45

    .line 1633
    .line 1634
    :goto_28
    move-object/from16 v11, v22

    .line 1635
    .line 1636
    goto :goto_29

    .line 1637
    :cond_45
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0

    .line 1641
    if-nez v0, :cond_46

    .line 1642
    .line 1643
    goto :goto_28

    .line 1644
    :cond_46
    move-object v11, v0

    .line 1645
    :goto_29
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1646
    .line 1647
    .line 1648
    move-result v0

    .line 1649
    if-nez v0, :cond_47

    .line 1650
    .line 1651
    sget-object v0, La/jbd0;->a:La/jbd0;

    .line 1652
    .line 1653
    return-object v0

    .line 1654
    :cond_47
    new-instance v0, La/rad0;

    .line 1655
    .line 1656
    invoke-direct {v0, v11}, La/rad0;-><init>(Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    return-object v0

    .line 1660
    :pswitch_2f
    new-instance v0, La/uad0;

    .line 1661
    .line 1662
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1663
    .line 1664
    .line 1665
    return-object v0

    .line 1666
    :pswitch_30
    const/4 v2, 0x0

    .line 1667
    invoke-virtual {v0, v6, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1668
    .line 1669
    .line 1670
    move-result v0

    .line 1671
    new-instance v1, La/ccd0;

    .line 1672
    .line 1673
    invoke-direct {v1, v0}, La/ccd0;-><init>(I)V

    .line 1674
    .line 1675
    .line 1676
    return-object v1

    .line 1677
    :pswitch_31
    const/4 v2, 0x0

    .line 1678
    new-instance v0, La/ccd0;

    .line 1679
    .line 1680
    invoke-direct {v0, v2}, La/ccd0;-><init>(I)V

    .line 1681
    .line 1682
    .line 1683
    return-object v0

    .line 1684
    :pswitch_32
    sget-object v0, La/vad0;->a:La/vad0;

    .line 1685
    .line 1686
    return-object v0

    .line 1687
    :pswitch_33
    sget-object v0, La/zcd0;->a:La/zcd0;

    .line 1688
    .line 1689
    return-object v0

    .line 1690
    :pswitch_34
    const/4 v2, 0x0

    .line 1691
    invoke-static {v0}, La/blx;->c(Landroid/content/Intent;)Lkotlin/Pair;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v1

    .line 1695
    iget-object v3, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1696
    .line 1697
    move-object/from16 v24, v3

    .line 1698
    .line 1699
    check-cast v24, Ljava/util/Set;

    .line 1700
    .line 1701
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1702
    .line 1703
    move-object/from16 v25, v1

    .line 1704
    .line 1705
    check-cast v25, Ljava/util/Set;

    .line 1706
    .line 1707
    invoke-virtual {v0, v11, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1708
    .line 1709
    .line 1710
    move-result v21

    .line 1711
    const-wide/16 v3, 0x0

    .line 1712
    .line 1713
    invoke-virtual {v0, v9, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1714
    .line 1715
    .line 1716
    move-result-wide v22

    .line 1717
    invoke-virtual {v0, v7, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v26

    .line 1721
    new-instance v19, La/gbd0;

    .line 1722
    .line 1723
    sget-object v20, La/j700;->b:La/j700;

    .line 1724
    .line 1725
    invoke-direct/range {v19 .. v26}, La/gbd0;-><init>(La/j700;IJLjava/util/Set;Ljava/util/Set;Z)V

    .line 1726
    .line 1727
    .line 1728
    return-object v19

    .line 1729
    :pswitch_35
    new-instance v0, La/abd0;

    .line 1730
    .line 1731
    sget-object v1, La/j700;->b:La/j700;

    .line 1732
    .line 1733
    invoke-direct {v0, v1}, La/abd0;-><init>(La/j700;)V

    .line 1734
    .line 1735
    .line 1736
    return-object v0

    .line 1737
    :pswitch_36
    const/4 v1, 0x1

    .line 1738
    const-wide/16 v3, 0x0

    .line 1739
    .line 1740
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1741
    .line 1742
    .line 1743
    move-result-wide v5

    .line 1744
    invoke-virtual {v0, v13, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1745
    .line 1746
    .line 1747
    move-result-wide v7

    .line 1748
    invoke-virtual {v0, v9, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1749
    .line 1750
    .line 1751
    move-result-wide v9

    .line 1752
    new-instance v0, La/xad0;

    .line 1753
    .line 1754
    sget-object v3, La/k9h0;->t:La/k9h0;

    .line 1755
    .line 1756
    if-ne v2, v3, :cond_48

    .line 1757
    .line 1758
    move v11, v1

    .line 1759
    :goto_2a
    move-wide v3, v5

    .line 1760
    goto :goto_2b

    .line 1761
    :cond_48
    const/4 v11, 0x0

    .line 1762
    goto :goto_2a

    .line 1763
    :goto_2b
    const-wide/16 v5, 0x0

    .line 1764
    .line 1765
    move-object v2, v0

    .line 1766
    invoke-direct/range {v2 .. v11}, La/xad0;-><init>(JJJJZ)V

    .line 1767
    .line 1768
    .line 1769
    return-object v2

    .line 1770
    :pswitch_37
    invoke-static {v0}, La/blx;->c(Landroid/content/Intent;)Lkotlin/Pair;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v1

    .line 1774
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1775
    .line 1776
    move-object/from16 v29, v2

    .line 1777
    .line 1778
    check-cast v29, Ljava/util/Set;

    .line 1779
    .line 1780
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1781
    .line 1782
    move-object/from16 v30, v1

    .line 1783
    .line 1784
    check-cast v30, Ljava/util/Set;

    .line 1785
    .line 1786
    const/4 v2, 0x0

    .line 1787
    invoke-virtual {v0, v11, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1788
    .line 1789
    .line 1790
    move-result v26

    .line 1791
    const-wide/16 v3, 0x0

    .line 1792
    .line 1793
    invoke-virtual {v0, v9, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1794
    .line 1795
    .line 1796
    move-result-wide v27

    .line 1797
    invoke-virtual {v0, v7, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1798
    .line 1799
    .line 1800
    move-result v31

    .line 1801
    new-instance v24, La/gbd0;

    .line 1802
    .line 1803
    sget-object v25, La/j700;->a:La/j700;

    .line 1804
    .line 1805
    invoke-direct/range {v24 .. v31}, La/gbd0;-><init>(La/j700;IJLjava/util/Set;Ljava/util/Set;Z)V

    .line 1806
    .line 1807
    .line 1808
    return-object v24

    .line 1809
    :pswitch_38
    new-instance v0, La/abd0;

    .line 1810
    .line 1811
    sget-object v1, La/j700;->a:La/j700;

    .line 1812
    .line 1813
    invoke-direct {v0, v1}, La/abd0;-><init>(La/j700;)V

    .line 1814
    .line 1815
    .line 1816
    return-object v0

    .line 1817
    :pswitch_39
    const-wide/16 v3, 0x0

    .line 1818
    .line 1819
    invoke-virtual {v0, v1, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1820
    .line 1821
    .line 1822
    move-result-wide v1

    .line 1823
    invoke-virtual {v0, v6, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1824
    .line 1825
    .line 1826
    move-result-wide v3

    .line 1827
    new-instance v0, La/s9d0;

    .line 1828
    .line 1829
    invoke-direct {v0, v1, v2, v3, v4}, La/s9d0;-><init>(JJ)V

    .line 1830
    .line 1831
    .line 1832
    return-object v0

    .line 1833
    :pswitch_3a
    sget-object v0, La/zbd0;->a:La/zbd0;

    .line 1834
    .line 1835
    return-object v0

    .line 1836
    :pswitch_3b
    new-instance v0, La/acd0;

    .line 1837
    .line 1838
    invoke-direct {v0}, La/acd0;-><init>()V

    .line 1839
    .line 1840
    .line 1841
    return-object v0

    .line 1842
    :pswitch_3c
    const/4 v3, 0x0

    .line 1843
    new-instance v1, La/ncd0;

    .line 1844
    .line 1845
    invoke-virtual {v0, v8}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 1846
    .line 1847
    .line 1848
    move-result v2

    .line 1849
    if-eqz v2, :cond_49

    .line 1850
    .line 1851
    const/4 v2, -0x1

    .line 1852
    invoke-virtual {v0, v8, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1853
    .line 1854
    .line 1855
    move-result v0

    .line 1856
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v12

    .line 1860
    goto :goto_2c

    .line 1861
    :cond_49
    sget-object v0, La/aue0;->b:La/cge0;

    .line 1862
    .line 1863
    move-object v12, v3

    .line 1864
    :goto_2c
    sget-object v0, La/aue0;->b:La/cge0;

    .line 1865
    .line 1866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1867
    .line 1868
    .line 1869
    invoke-static {v12}, La/cge0;->h(Ljava/lang/Integer;)La/aue0;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    invoke-direct {v1, v0}, La/ncd0;-><init>(La/aue0;)V

    .line 1874
    .line 1875
    .line 1876
    return-object v1

    .line 1877
    :pswitch_3d
    const/4 v3, 0x0

    .line 1878
    const-string v1, "AUTH_NOTIFICATION_TYPE"

    .line 1879
    .line 1880
    const/4 v2, 0x0

    .line 1881
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1882
    .line 1883
    .line 1884
    move-result v1

    .line 1885
    new-instance v2, La/hbd0;

    .line 1886
    .line 1887
    invoke-virtual {v0, v8}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 1888
    .line 1889
    .line 1890
    move-result v4

    .line 1891
    if-eqz v4, :cond_4a

    .line 1892
    .line 1893
    const/4 v4, -0x1

    .line 1894
    invoke-virtual {v0, v8, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1895
    .line 1896
    .line 1897
    move-result v0

    .line 1898
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v12

    .line 1902
    goto :goto_2d

    .line 1903
    :cond_4a
    sget-object v0, La/aue0;->b:La/cge0;

    .line 1904
    .line 1905
    move-object v12, v3

    .line 1906
    :goto_2d
    sget-object v0, La/aue0;->b:La/cge0;

    .line 1907
    .line 1908
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1909
    .line 1910
    .line 1911
    invoke-static {v12}, La/cge0;->h(Ljava/lang/Integer;)La/aue0;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v0

    .line 1915
    invoke-direct {v2, v1, v0}, La/hbd0;-><init>(ILa/aue0;)V

    .line 1916
    .line 1917
    .line 1918
    return-object v2

    .line 1919
    :cond_4b
    move-object/from16 v26, v1

    .line 1920
    .line 1921
    const-string v1, "REQUEST_FAVORITES_WIDGET"

    .line 1922
    .line 1923
    const/4 v2, 0x0

    .line 1924
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1925
    .line 1926
    .line 1927
    move-result v1

    .line 1928
    if-eqz v1, :cond_4c

    .line 1929
    .line 1930
    sget-object v0, La/ocd0;->a:La/ocd0;

    .line 1931
    .line 1932
    return-object v0

    .line 1933
    :cond_4c
    const-string v1, "SHOW_FAVORITES"

    .line 1934
    .line 1935
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v1

    .line 1939
    if-eqz v1, :cond_4d

    .line 1940
    .line 1941
    new-instance v0, La/wad0;

    .line 1942
    .line 1943
    sget-object v1, La/frj;->c:La/frj;

    .line 1944
    .line 1945
    invoke-direct {v0, v1}, La/wad0;-><init>(La/frj;)V

    .line 1946
    .line 1947
    .line 1948
    return-object v0

    .line 1949
    :cond_4d
    const-string v1, "OPEN_PAYMENT"

    .line 1950
    .line 1951
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1952
    .line 1953
    .line 1954
    move-result v2

    .line 1955
    if-eqz v2, :cond_4e

    .line 1956
    .line 1957
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 1958
    .line 1959
    .line 1960
    new-instance v0, La/vbd0;

    .line 1961
    .line 1962
    invoke-direct {v0}, La/vbd0;-><init>()V

    .line 1963
    .line 1964
    .line 1965
    return-object v0

    .line 1966
    :cond_4e
    :goto_2e
    return-object v26

    .line 1967
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_39
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_38
        :pswitch_37
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_34
        :pswitch_36
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_0
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_0
        :pswitch_17
        :pswitch_16
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_15
        :pswitch_1b
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
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    :sswitch_data_0
    .sparse-switch
        -0x3b5da617 -> :sswitch_6
        -0x3a69315f -> :sswitch_5
        -0x30571c56 -> :sswitch_4
        -0x2faaa884 -> :sswitch_3
        -0x18bde27b -> :sswitch_2
        0x3d1a10d -> :sswitch_1
        0x33ccb940 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x3adbfa0f -> :sswitch_b
        0x304bf2 -> :sswitch_a
        0x59a4b87 -> :sswitch_9
        0x4d823b3e -> :sswitch_8
        0x674f2d4d -> :sswitch_7
    .end sparse-switch
.end method

.method public static final c(Landroid/content/Intent;)Lkotlin/Pair;
    .locals 7

    .line 1
    const-string v0, "SPORT_ID"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Iterable;

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v5, v4

    .line 45
    check-cast v5, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    cmp-long v5, v5, v2

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    sget-object v0, La/xun;->a:La/xun;

    .line 65
    .line 66
    :goto_1
    const-string v1, "CHAMP_ID"

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Ljava/lang/Iterable;

    .line 87
    .line 88
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    move-object v5, v4

    .line 108
    check-cast v5, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v5

    .line 114
    cmp-long v5, v5, v2

    .line 115
    .line 116
    if-eqz v5, :cond_3

    .line 117
    .line 118
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    sget-object p0, La/xun;->a:La/xun;

    .line 128
    .line 129
    :goto_3
    new-instance v1, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v1
.end method

.method public static final d(Landroid/content/Intent;)V
    .locals 5

    .line 1
    const-string v0, "OPEN_SCREEN"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-class v1, La/k9h0;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0, v2}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    instance-of v4, v1, La/k9h0;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    check-cast v1, La/k9h0;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v3, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 52
    .line 53
    new-instance v3, La/g0g0;

    .line 54
    .line 55
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    instance-of v0, v3, La/g0g0;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object v2, v3

    .line 64
    :goto_1
    check-cast v2, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-virtual {p0, v2}, Landroid/content/Intent;->replaceExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catch_0
    invoke-virtual {p0, v2}, Landroid/content/Intent;->replaceExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 71
    .line 72
    .line 73
    return-void
.end method
