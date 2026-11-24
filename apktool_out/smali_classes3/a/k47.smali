.class public final synthetic La/k47;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q47;


# direct methods
.method public synthetic constructor <init>(La/q47;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k47;->a:B

    iput-object p1, p0, La/k47;->b:La/q47;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/k47;->a:B

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "BUNDLE_RESULT_END_TIME_SEC"

    .line 6
    .line 7
    const-string v3, "BUNDLE_RESULT_START_TIME_SEC"

    .line 8
    .line 9
    const-string v4, "BUNDLE_RESULT_CANCELED"

    .line 10
    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const/16 v7, 0x21

    .line 14
    .line 15
    iget-object p0, p0, La/k47;->b:La/q47;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, La/q47;->U1:La/gl5;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string p2, "BET_INFO_FRAGMENT_REQUEST_KEY"

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance p2, La/o27;

    .line 44
    .line 45
    invoke-direct {p2, p1}, La/o27;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    :pswitch_0
    sget-object v0, La/q47;->U1:La/gl5;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v0, "REQUEST_ALL_FILTERS_DIALOG_KEY"

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    if-gt p2, v7, :cond_2

    .line 69
    .line 70
    const-string p2, "REQUEST_HISTORY_KEY"

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-static {p1}, La/uq6;->A(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Landroid/os/Parcelable;

    .line 82
    .line 83
    :goto_0
    check-cast p2, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 84
    .line 85
    const-string v0, "SELECTED_DATE_KEY"

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p2, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance p1, La/n17;

    .line 99
    .line 100
    invoke-direct {p1, p2}, La/n17;-><init>(Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    if-eqz p1, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    sget-object p1, La/m27;->a:La/m27;

    .line 114
    .line 115
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    :goto_1
    return-void

    .line 119
    :pswitch_1
    sget-object v0, La/q47;->U1:La/gl5;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const-string v0, "REQUEST_BET_HISTORY_STATUS_FILTER_KEY"

    .line 125
    .line 126
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    const-string p2, "HISTORY_STATUS_UPDATE_FILTER_REQUEST"

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    sget-object p1, La/h37;->a:La/h37;

    .line 152
    .line 153
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_6
    :goto_2
    return-void

    .line 157
    :pswitch_2
    sget-object v0, La/q47;->U1:La/gl5;

    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const-string v0, "HISTORY_DATE_PICKER_MAIL_KEY"

    .line 163
    .line 164
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-nez p2, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_8

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_8
    invoke-virtual {p1, v3, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    invoke-virtual {p1, v2, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 183
    .line 184
    .line 185
    move-result-wide p1

    .line 186
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    new-instance v2, La/p17;

    .line 191
    .line 192
    invoke-direct {v2, v0, v1, p1, p2}, La/p17;-><init>(JJ)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :goto_3
    return-void

    .line 199
    :pswitch_3
    sget-object v0, La/q47;->U1:La/gl5;

    .line 200
    .line 201
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    const-string v0, "HISTORY_DATE_PICKER_KEY"

    .line 205
    .line 206
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-nez p2, :cond_9

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_9
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-eqz p2, :cond_a

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_a
    invoke-virtual {p1, v3, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    invoke-virtual {p1, v2, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 225
    .line 226
    .line 227
    move-result-wide p1

    .line 228
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    new-instance v2, La/o17;

    .line 233
    .line 234
    invoke-direct {v2, v0, v1, p1, p2}, La/o17;-><init>(JJ)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :goto_4
    return-void

    .line 241
    :pswitch_4
    sget-object v0, La/q47;->U1:La/gl5;

    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    const-string v0, "REQUEST_BET_HISTORY_MENU_KEY"

    .line 247
    .line 248
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    if-nez p2, :cond_b

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_b
    const-string p2, "HISTORY_MENU_ITEM_RESULT"

    .line 256
    .line 257
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_e

    .line 262
    .line 263
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 264
    .line 265
    if-gt v0, v7, :cond_c

    .line 266
    .line 267
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    goto :goto_5

    .line 272
    :cond_c
    invoke-static {p1}, La/uq6;->C(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    check-cast p2, Landroid/os/Parcelable;

    .line 277
    .line 278
    :goto_5
    check-cast p2, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 279
    .line 280
    if-nez p2, :cond_d

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_d
    const-string v0, "HISTORY_MENU_BET_ID_RESULT"

    .line 284
    .line 285
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    new-instance v0, La/t27;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-direct {v0, p2, p1}, La/t27;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_e
    :goto_6
    return-void

    .line 305
    :pswitch_5
    sget-object v0, La/q47;->U1:La/gl5;

    .line 306
    .line 307
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    const-string v0, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 311
    .line 312
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p2

    .line 316
    if-nez p2, :cond_f

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_f
    const-string p2, "BET_SALE_CONFIRM_REQUEST"

    .line 320
    .line 321
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_10

    .line 326
    .line 327
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {p1, p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    new-instance p2, La/z27;

    .line 339
    .line 340
    invoke-direct {p2, p1}, La/z27;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    :cond_10
    :goto_7
    return-void

    .line 347
    :pswitch_6
    sget-object v0, La/q47;->U1:La/gl5;

    .line 348
    .line 349
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    const-string v0, "REQUEST_BET_HISTORY_TYPE_KEY"

    .line 353
    .line 354
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result p2

    .line 358
    if-nez p2, :cond_11

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_11
    const-string p2, "RESULT_BET_HISTORY_CLICK"

    .line 362
    .line 363
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_14

    .line 368
    .line 369
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 370
    .line 371
    if-gt v0, v7, :cond_12

    .line 372
    .line 373
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    goto :goto_8

    .line 378
    :cond_12
    invoke-static {p1}, La/uq6;->k(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    check-cast p1, Landroid/os/Parcelable;

    .line 383
    .line 384
    :goto_8
    check-cast p1, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 385
    .line 386
    if-nez p1, :cond_13

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_13
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    new-instance p2, La/l27;

    .line 394
    .line 395
    invoke-direct {p2, p1}, La/l27;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_14
    const-string p2, "RESULT_HIDE_BET_HISTORY_CLICK"

    .line 403
    .line 404
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    if-eqz p1, :cond_15

    .line 409
    .line 410
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    sget-object p1, La/j27;->a:La/j27;

    .line 415
    .line 416
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    :cond_15
    :goto_9
    return-void

    .line 420
    :pswitch_7
    sget-object v0, La/q47;->U1:La/gl5;

    .line 421
    .line 422
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    const-string v0, "HISTORY_DATE_FILTER_REQUEST_KEY"

    .line 426
    .line 427
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result p2

    .line 431
    if-nez p2, :cond_16

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_16
    const-string p2, "HISTORY_DATE_FILTER_REQUEST"

    .line 435
    .line 436
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_19

    .line 441
    .line 442
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 443
    .line 444
    if-gt v0, v7, :cond_17

    .line 445
    .line 446
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    goto :goto_a

    .line 451
    :cond_17
    invoke-static {p1}, La/uq6;->w(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    check-cast p1, Landroid/os/Parcelable;

    .line 456
    .line 457
    :goto_a
    check-cast p1, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 458
    .line 459
    if-nez p1, :cond_18

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_18
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    new-instance p2, La/n17;

    .line 467
    .line 468
    invoke-direct {p2, p1}, La/n17;-><init>(Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_19
    :goto_b
    return-void

    .line 475
    :pswitch_8
    sget-object v0, La/q47;->U1:La/gl5;

    .line 476
    .line 477
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    const-string v0, "REQUEST_BET_HISTORY_HIDE_TYME_KEY"

    .line 481
    .line 482
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result p2

    .line 486
    if-nez p2, :cond_1a

    .line 487
    .line 488
    goto :goto_d

    .line 489
    :cond_1a
    const-string p2, "TIME_MODEL_RESULT"

    .line 490
    .line 491
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-eqz v0, :cond_1d

    .line 496
    .line 497
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 498
    .line 499
    if-gt v0, v7, :cond_1b

    .line 500
    .line 501
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    goto :goto_c

    .line 506
    :cond_1b
    invoke-static {p1}, La/uq6;->s(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    check-cast p1, Landroid/os/Parcelable;

    .line 511
    .line 512
    :goto_c
    check-cast p1, Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;

    .line 513
    .line 514
    if-nez p1, :cond_1c

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_1c
    invoke-virtual {p0}, La/q47;->I0()La/k3t0;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    new-instance p2, La/k27;

    .line 522
    .line 523
    invoke-direct {p2, p1}, La/k27;-><init>(Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    :cond_1d
    :goto_d
    return-void

    .line 530
    nop

    .line 531
    :pswitch_data_0
    .packed-switch 0x0
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
