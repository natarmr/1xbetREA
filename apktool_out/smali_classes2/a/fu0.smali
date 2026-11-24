.class public final La/fu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rg90;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qog0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:La/yx5;


# direct methods
.method public synthetic constructor <init>(La/qog0;Ljava/lang/String;La/yx5;Ljava/lang/String;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/fu0;->a:B

    iput-object p1, p0, La/fu0;->b:La/qog0;

    iput-object p2, p0, La/fu0;->c:Ljava/lang/String;

    iput-object p3, p0, La/fu0;->f:La/yx5;

    iput-object p4, p0, La/fu0;->d:Ljava/lang/String;

    iput-object p5, p0, La/fu0;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/ArrayList;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fu0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/fu0;->b:La/qog0;

    .line 6
    .line 7
    const v6, 0x7f1304dc

    .line 8
    .line 9
    .line 10
    const-string v7, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 11
    .line 12
    const v8, 0x7f130736

    .line 13
    .line 14
    .line 15
    const v9, 0x7f130735

    .line 16
    .line 17
    .line 18
    const-string v10, "download"

    .line 19
    .line 20
    const/4 v11, 0x1

    .line 21
    const-string v12, "User-Agent"

    .line 22
    .line 23
    iget-object v13, v0, La/fu0;->e:Ljava/lang/String;

    .line 24
    .line 25
    const-string v14, "Cookie"

    .line 26
    .line 27
    iget-object v15, v0, La/fu0;->d:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, v0, La/fu0;->c:Ljava/lang/String;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    iget-object v5, v0, La/fu0;->f:La/yx5;

    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    sget-object v23, La/jdk0;->a:La/jdk0;

    .line 38
    .line 39
    move-object v1, v5

    .line 40
    check-cast v1, La/m71;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 43
    .line 44
    .line 45
    move-result v18

    .line 46
    if-eqz v18, :cond_5

    .line 47
    .line 48
    :try_start_0
    new-instance v6, Landroid/app/DownloadManager$Request;

    .line 49
    .line 50
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-direct {v6, v7}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v15, v4}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v6, v7}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 65
    .line 66
    .line 67
    move-result-object v15

    .line 68
    invoke-virtual {v15, v3}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {v6, v14, v3}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 75
    .line 76
    .line 77
    :cond_0
    if-eqz v13, :cond_1

    .line 78
    .line 79
    invoke-virtual {v6, v12, v13}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v6, v11}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 83
    .line 84
    .line 85
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v6, v3, v7}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v3, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object v3, v4

    .line 102
    :goto_0
    instance-of v7, v3, Landroid/app/DownloadManager;

    .line 103
    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    move-object v4, v3

    .line 107
    check-cast v4, Landroid/app/DownloadManager;

    .line 108
    .line 109
    :cond_3
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-virtual {v4, v6}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-virtual {v1}, La/m71;->I0()La/wdk0;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    new-instance v18, La/xdk0;

    .line 119
    .line 120
    sget-object v19, La/pek0;->a:La/pek0;

    .line 121
    .line 122
    invoke-virtual {v1, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v20

    .line 126
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    const/16 v24, 0x0

    .line 130
    .line 131
    const/16 v25, 0x6c

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    invoke-direct/range {v18 .. v25}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 138
    .line 139
    .line 140
    move-object v12, v5

    .line 141
    check-cast v12, La/m71;

    .line 142
    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x3fc

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    move-object/from16 v11, v18

    .line 151
    .line 152
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :catchall_0
    invoke-virtual {v1}, La/m71;->I0()La/wdk0;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    new-instance v18, La/xdk0;

    .line 162
    .line 163
    sget-object v19, La/rek0;->b:La/rek0;

    .line 164
    .line 165
    invoke-virtual {v1, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v20

    .line 169
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    const/16 v24, 0x0

    .line 173
    .line 174
    const/16 v25, 0x6c

    .line 175
    .line 176
    const/16 v21, 0x0

    .line 177
    .line 178
    const/16 v22, 0x0

    .line 179
    .line 180
    invoke-direct/range {v18 .. v25}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 181
    .line 182
    .line 183
    move-object/from16 v26, v5

    .line 184
    .line 185
    check-cast v26, La/m71;

    .line 186
    .line 187
    const/16 v30, 0x0

    .line 188
    .line 189
    const/16 v31, 0x3fc

    .line 190
    .line 191
    const/16 v27, 0x0

    .line 192
    .line 193
    const/16 v28, 0x0

    .line 194
    .line 195
    const/16 v29, 0x0

    .line 196
    .line 197
    move-object/from16 v24, v3

    .line 198
    .line 199
    move-object/from16 v25, v18

    .line 200
    .line 201
    invoke-static/range {v24 .. v31}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_5
    sget-object v3, La/m71;->e2:La/rek0;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    new-instance v3, La/k71;

    .line 211
    .line 212
    const/4 v4, 0x0

    .line 213
    invoke-direct {v3, v1, v4}, La/k71;-><init>(La/m71;B)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v7, v3}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, La/m71;->H0()La/ii;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v1, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v19

    .line 227
    const v4, 0x7f130f3a

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v20

    .line 234
    sget-object v27, La/n12;->b:La/n12;

    .line 235
    .line 236
    const v4, 0x7f130f35

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v21

    .line 243
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    const v4, 0x7f13032f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v22

    .line 253
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 254
    .line 255
    const/16 v28, 0x0

    .line 256
    .line 257
    const/16 v29, 0x5d0

    .line 258
    .line 259
    const/16 v23, 0x0

    .line 260
    .line 261
    const-string v24, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 262
    .line 263
    const/16 v25, 0x0

    .line 264
    .line 265
    const/16 v26, 0x0

    .line 266
    .line 267
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 268
    .line 269
    .line 270
    move-object/from16 v4, v18

    .line 271
    .line 272
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 280
    .line 281
    .line 282
    :goto_1
    iget-object v1, v2, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 283
    .line 284
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_0
    const-string v1, "snackBarManager"

    .line 289
    .line 290
    sget-object v23, La/jdk0;->a:La/jdk0;

    .line 291
    .line 292
    move-object v6, v5

    .line 293
    check-cast v6, La/hu0;

    .line 294
    .line 295
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 296
    .line 297
    .line 298
    move-result v19

    .line 299
    if-eqz v19, :cond_d

    .line 300
    .line 301
    :try_start_1
    new-instance v7, Landroid/app/DownloadManager$Request;

    .line 302
    .line 303
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-direct {v7, v8}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v3, v15, v4}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    invoke-virtual {v7, v8}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 318
    .line 319
    .line 320
    move-result-object v15

    .line 321
    invoke-virtual {v15, v3}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    if-eqz v3, :cond_6

    .line 326
    .line 327
    invoke-virtual {v7, v14, v3}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 328
    .line 329
    .line 330
    :cond_6
    if-eqz v13, :cond_7

    .line 331
    .line 332
    invoke-virtual {v7, v12, v13}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 333
    .line 334
    .line 335
    :cond_7
    invoke-virtual {v7, v11}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 336
    .line 337
    .line 338
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {v7, v3, v8}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    if-eqz v3, :cond_8

    .line 348
    .line 349
    invoke-virtual {v3, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    goto :goto_2

    .line 354
    :cond_8
    move-object v3, v4

    .line 355
    :goto_2
    instance-of v8, v3, Landroid/app/DownloadManager;

    .line 356
    .line 357
    if-eqz v8, :cond_9

    .line 358
    .line 359
    check-cast v3, Landroid/app/DownloadManager;

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_9
    move-object v3, v4

    .line 363
    :goto_3
    if-eqz v3, :cond_a

    .line 364
    .line 365
    invoke-virtual {v3, v7}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 366
    .line 367
    .line 368
    :cond_a
    iget-object v10, v6, La/hu0;->W1:La/wdk0;

    .line 369
    .line 370
    if-eqz v10, :cond_b

    .line 371
    .line 372
    new-instance v18, La/xdk0;

    .line 373
    .line 374
    sget-object v19, La/pek0;->a:La/pek0;

    .line 375
    .line 376
    invoke-virtual {v6, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v20

    .line 380
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    const/16 v24, 0x0

    .line 384
    .line 385
    const/16 v25, 0x6c

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    invoke-direct/range {v18 .. v25}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 392
    .line 393
    .line 394
    move-object v12, v5

    .line 395
    check-cast v12, La/hu0;

    .line 396
    .line 397
    const/16 v16, 0x0

    .line 398
    .line 399
    const/16 v17, 0x3fc

    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const/4 v14, 0x0

    .line 403
    const/4 v15, 0x0

    .line 404
    move-object/from16 v11, v18

    .line 405
    .line 406
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 407
    .line 408
    .line 409
    goto/16 :goto_4

    .line 410
    .line 411
    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 415
    :catchall_1
    iget-object v3, v6, La/hu0;->W1:La/wdk0;

    .line 416
    .line 417
    if-eqz v3, :cond_c

    .line 418
    .line 419
    new-instance v18, La/xdk0;

    .line 420
    .line 421
    sget-object v19, La/rek0;->b:La/rek0;

    .line 422
    .line 423
    const v1, 0x7f130736

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v20

    .line 430
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    const/16 v24, 0x0

    .line 434
    .line 435
    const/16 v25, 0x6c

    .line 436
    .line 437
    const/16 v21, 0x0

    .line 438
    .line 439
    const/16 v22, 0x0

    .line 440
    .line 441
    invoke-direct/range {v18 .. v25}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 442
    .line 443
    .line 444
    move-object/from16 v29, v5

    .line 445
    .line 446
    check-cast v29, La/hu0;

    .line 447
    .line 448
    const/16 v33, 0x0

    .line 449
    .line 450
    const/16 v34, 0x3fc

    .line 451
    .line 452
    const/16 v30, 0x0

    .line 453
    .line 454
    const/16 v31, 0x0

    .line 455
    .line 456
    const/16 v32, 0x0

    .line 457
    .line 458
    move-object/from16 v27, v3

    .line 459
    .line 460
    move-object/from16 v28, v18

    .line 461
    .line 462
    invoke-static/range {v27 .. v34}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 463
    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_c
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw v4

    .line 470
    :cond_d
    sget-object v1, La/hu0;->Y1:La/rek0;

    .line 471
    .line 472
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    new-instance v1, La/eu0;

    .line 476
    .line 477
    const/4 v3, 0x2

    .line 478
    invoke-direct {v1, v6, v3}, La/eu0;-><init>(La/hu0;B)V

    .line 479
    .line 480
    .line 481
    invoke-static {v6, v7, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 482
    .line 483
    .line 484
    iget-object v1, v6, La/hu0;->V1:La/ii;

    .line 485
    .line 486
    if-eqz v1, :cond_e

    .line 487
    .line 488
    const v3, 0x7f1304dc

    .line 489
    .line 490
    .line 491
    invoke-virtual {v6, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v19

    .line 495
    const v4, 0x7f130f3a

    .line 496
    .line 497
    .line 498
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v20

    .line 502
    sget-object v27, La/n12;->b:La/n12;

    .line 503
    .line 504
    const v4, 0x7f130f35

    .line 505
    .line 506
    .line 507
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v21

    .line 511
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    const v4, 0x7f13032f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v22

    .line 521
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 522
    .line 523
    const/16 v28, 0x0

    .line 524
    .line 525
    const/16 v29, 0x5d0

    .line 526
    .line 527
    const/16 v23, 0x0

    .line 528
    .line 529
    const-string v24, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 530
    .line 531
    const/16 v25, 0x0

    .line 532
    .line 533
    const/16 v26, 0x0

    .line 534
    .line 535
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 536
    .line 537
    .line 538
    move-object/from16 v3, v18

    .line 539
    .line 540
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v3, v4}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 548
    .line 549
    .line 550
    :goto_4
    iget-object v1, v2, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 551
    .line 552
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    return-void

    .line 556
    :cond_e
    const-string v0, "actionDialogManager"

    .line 557
    .line 558
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    throw v4

    .line 562
    nop

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
