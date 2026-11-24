.class public final synthetic La/du20;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/du20;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/du20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/cv30;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/k3t0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/c140;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v9, v0

    .line 40
    check-cast v9, La/bz30;

    .line 41
    .line 42
    sget-object v0, La/bz30;->P1:La/wsz;

    .line 43
    .line 44
    instance-of v0, v1, La/w040;

    .line 45
    .line 46
    const v2, 0x7f130e5d

    .line 47
    .line 48
    .line 49
    const v3, 0x7f130162

    .line 50
    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    check-cast v1, La/w040;

    .line 55
    .line 56
    invoke-virtual {v9}, La/bz30;->G0()La/pli;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, La/pli;->v0:La/peg0;

    .line 61
    .line 62
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, La/yzn0;

    .line 65
    .line 66
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v12, v1, La/w040;->a:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const v0, 0x7f13032f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v15

    .line 103
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v0, v1, La/w040;->b:La/ql5;

    .line 107
    .line 108
    move-object/from16 v16, v0

    .line 109
    .line 110
    invoke-virtual/range {v10 .. v16}, La/ynb;->a(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;La/ql5;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :cond_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    sget-object v0, La/x040;->a:La/x040;

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_1

    .line 125
    .line 126
    invoke-virtual {v9}, La/bz30;->G0()La/pli;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v0, v0, La/pli;->v0:La/peg0;

    .line 131
    .line 132
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, La/yzn0;

    .line 135
    .line 136
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v2, La/bm5;->g:La/bm5;

    .line 144
    .line 145
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const-string v6, "SELECT_BALANCE_REQUEST_KEY"

    .line 153
    .line 154
    const/16 v7, 0x1ae

    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    invoke-static/range {v1 .. v7}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_1
    sget-object v0, La/a140;->a:La/a140;

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_2

    .line 170
    .line 171
    invoke-virtual {v9}, La/bz30;->G0()La/pli;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iget-object v0, v0, La/pli;->x0:La/nr00;

    .line 176
    .line 177
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    sget-object v1, La/jvp0;->a:La/jvp0;

    .line 185
    .line 186
    invoke-static {v0}, La/s9m0;->m(Landroidx/fragment/app/e;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_2
    sget-object v0, La/z040;->a:La/z040;

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_3

    .line 198
    .line 199
    invoke-virtual {v9}, La/bz30;->G0()La/pli;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v0, v0, La/pli;->w0:La/ii;

    .line 204
    .line 205
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 206
    .line 207
    const v1, 0x7f1300e2

    .line 208
    .line 209
    .line 210
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    const v1, 0x7f1300e1

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const v1, 0x7f130f00

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const v1, 0x7f130abf

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v14

    .line 238
    sget-object v19, La/n12;->a:La/n12;

    .line 239
    .line 240
    const/16 v20, 0x0

    .line 241
    .line 242
    const/16 v21, 0x1d0

    .line 243
    .line 244
    const/4 v15, 0x0

    .line 245
    const-string v16, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY"

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_3
    instance-of v0, v1, La/y040;

    .line 267
    .line 268
    if-eqz v0, :cond_4

    .line 269
    .line 270
    invoke-virtual {v9}, La/bz30;->G0()La/pli;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v7, v0, La/pli;->u0:La/wdk0;

    .line 275
    .line 276
    new-instance v8, La/xdk0;

    .line 277
    .line 278
    sget-object v11, La/rek0;->b:La/rek0;

    .line 279
    .line 280
    check-cast v1, La/y040;

    .line 281
    .line 282
    iget-object v12, v1, La/y040;->a:Ljava/lang/String;

    .line 283
    .line 284
    const/16 v16, 0x0

    .line 285
    .line 286
    const/16 v17, 0x7c

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    const/4 v15, 0x0

    .line 291
    move-object v10, v8

    .line 292
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 293
    .line 294
    .line 295
    const/16 v14, 0x3fc

    .line 296
    .line 297
    const/4 v10, 0x0

    .line 298
    const/4 v11, 0x0

    .line 299
    const/4 v12, 0x0

    .line 300
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 301
    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_4
    sget-object v0, La/u040;->a:La/u040;

    .line 306
    .line 307
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_5

    .line 312
    .line 313
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 318
    .line 319
    new-instance v2, Lkotlin/Pair;

    .line 320
    .line 321
    const-string v3, "UPDATED_BALANCE_KEY"

    .line 322
    .line 323
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_5
    sget-object v0, La/v040;->a:La/v040;

    .line 340
    .line 341
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_6

    .line 346
    .line 347
    invoke-virtual {v9}, La/bz30;->G0()La/pli;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v0, v0, La/pli;->w0:La/ii;

    .line 352
    .line 353
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 354
    .line 355
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    const v1, 0x7f130508

    .line 360
    .line 361
    .line 362
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v12

    .line 366
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    sget-object v19, La/n12;->b:La/n12;

    .line 374
    .line 375
    const/16 v20, 0x0

    .line 376
    .line 377
    const/16 v21, 0x5f8

    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const/4 v15, 0x0

    .line 381
    const/16 v16, 0x0

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const/16 v18, 0x0

    .line 386
    .line 387
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_0

    .line 401
    .line 402
    :cond_6
    instance-of v0, v1, La/t040;

    .line 403
    .line 404
    if-eqz v0, :cond_7

    .line 405
    .line 406
    check-cast v1, La/t040;

    .line 407
    .line 408
    iget-object v0, v1, La/t040;->a:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 415
    .line 416
    new-instance v2, Landroid/content/Intent;

    .line 417
    .line 418
    const-string v3, "android.intent.action.VIEW"

    .line 419
    .line 420
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    const/high16 v3, 0x10000000

    .line 424
    .line 425
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 426
    .line 427
    .line 428
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 436
    .line 437
    .line 438
    goto :goto_0

    .line 439
    :catchall_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 440
    .line 441
    goto :goto_0

    .line 442
    :cond_7
    instance-of v0, v1, La/b140;

    .line 443
    .line 444
    if-eqz v0, :cond_8

    .line 445
    .line 446
    check-cast v1, La/b140;

    .line 447
    .line 448
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    new-instance v2, Landroid/content/Intent;

    .line 453
    .line 454
    iget-object v3, v1, La/b140;->b:Ljava/lang/String;

    .line 455
    .line 456
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    new-instance v3, Landroid/content/ComponentName;

    .line 460
    .line 461
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    iget-object v1, v1, La/b140;->a:Ljava/lang/String;

    .line 466
    .line 467
    invoke-direct {v3, v4, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 475
    .line 476
    .line 477
    goto :goto_0

    .line 478
    :cond_8
    sget-object v0, La/s040;->a:La/s040;

    .line 479
    .line 480
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_a

    .line 485
    .line 486
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    if-eqz v0, :cond_9

    .line 491
    .line 492
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_9

    .line 501
    .line 502
    invoke-virtual {v9}, La/bz30;->H0()La/k3t0;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    new-instance v1, La/xu30;

    .line 507
    .line 508
    const-class v2, La/bz30;

    .line 509
    .line 510
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-direct {v1, v2}, La/xu30;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    :cond_9
    :goto_0
    invoke-virtual {v9}, La/bz30;->H0()La/k3t0;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    sget-object v1, La/ut30;->a:La/ut30;

    .line 525
    .line 526
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    goto :goto_1

    .line 532
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 533
    .line 534
    .line 535
    :goto_1
    return-object v6

    .line 536
    :pswitch_1
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, La/pg30;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, La/k3t0;

    .line 546
    .line 547
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_2
    move-object/from16 v1, p1

    .line 554
    .line 555
    check-cast v1, La/sg30;

    .line 556
    .line 557
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, La/qg30;

    .line 563
    .line 564
    sget-object v2, La/qg30;->o2:La/evz;

    .line 565
    .line 566
    iget-object v2, v0, La/qg30;->m2:La/phf0;

    .line 567
    .line 568
    sget-object v3, La/qg30;->p2:[La/iiy;

    .line 569
    .line 570
    aget-object v3, v3, v4

    .line 571
    .line 572
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    iget-object v1, v1, La/sg30;->a:La/lg30;

    .line 577
    .line 578
    new-instance v3, Lkotlin/Pair;

    .line 579
    .line 580
    const-string v4, "RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY"

    .line 581
    .line 582
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    iget-object v1, v0, La/qg30;->l2:La/a8z;

    .line 597
    .line 598
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, La/k3t0;

    .line 603
    .line 604
    sget-object v2, La/ng30;->a:La/ng30;

    .line 605
    .line 606
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 610
    .line 611
    .line 612
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    return-object v0

    .line 615
    :pswitch_3
    move-object/from16 v1, p1

    .line 616
    .line 617
    check-cast v1, La/pb30;

    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, La/k3t0;

    .line 625
    .line 626
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 630
    .line 631
    return-object v0

    .line 632
    :pswitch_4
    move-object/from16 v1, p1

    .line 633
    .line 634
    check-cast v1, La/ub30;

    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v0, La/k3t0;

    .line 642
    .line 643
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    return-object v0

    .line 649
    :pswitch_5
    move-object/from16 v1, p1

    .line 650
    .line 651
    check-cast v1, La/d0k0;

    .line 652
    .line 653
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v0, La/ea30;

    .line 659
    .line 660
    check-cast v0, La/ncl0;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 666
    .line 667
    .line 668
    move-result-object v7

    .line 669
    iget-object v2, v0, La/ncl0;->o:La/mne;

    .line 670
    .line 671
    iget-object v10, v2, La/mne;->a:La/rwj;

    .line 672
    .line 673
    new-instance v11, La/lcl0;

    .line 674
    .line 675
    invoke-direct {v11, v0, v1, v6, v4}, La/lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 676
    .line 677
    .line 678
    const/16 v12, 0xb

    .line 679
    .line 680
    const/4 v8, 0x0

    .line 681
    const/4 v9, 0x0

    .line 682
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 683
    .line 684
    .line 685
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 686
    .line 687
    return-object v0

    .line 688
    :pswitch_6
    move-object/from16 v1, p1

    .line 689
    .line 690
    check-cast v1, Ljava/lang/Number;

    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v0, La/ca30;

    .line 699
    .line 700
    check-cast v0, La/ncl0;

    .line 701
    .line 702
    iget-object v2, v0, La/ncl0;->N:La/p7m0;

    .line 703
    .line 704
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    check-cast v3, La/wqs;

    .line 709
    .line 710
    iget v3, v3, La/wqs;->b:I

    .line 711
    .line 712
    if-ne v3, v1, :cond_b

    .line 713
    .line 714
    goto :goto_2

    .line 715
    :cond_b
    iget-object v3, v0, La/ncl0;->y:La/lhf0;

    .line 716
    .line 717
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 718
    .line 719
    .line 720
    move-result-object v4

    .line 721
    check-cast v4, La/p7m0;

    .line 722
    .line 723
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    check-cast v4, La/zqs;

    .line 728
    .line 729
    iget-wide v4, v4, La/zqs;->c:J

    .line 730
    .line 731
    invoke-virtual {v3, v4, v5}, La/lhf0;->O(J)V

    .line 732
    .line 733
    .line 734
    iget-object v0, v0, La/ncl0;->c:La/vzg0;

    .line 735
    .line 736
    const-string v3, "KEY_BROADCAST_POSITION"

    .line 737
    .line 738
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    invoke-virtual {v0, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    :cond_c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    move-object v3, v0

    .line 750
    check-cast v3, La/wqs;

    .line 751
    .line 752
    const/4 v4, 0x5

    .line 753
    invoke-static {v3, v6, v1, v6, v4}, La/wqs;->a(La/wqs;La/xqs;ILorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;I)La/wqs;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    if-eqz v0, :cond_c

    .line 762
    .line 763
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 764
    .line 765
    return-object v0

    .line 766
    :pswitch_7
    move-object/from16 v1, p1

    .line 767
    .line 768
    check-cast v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 769
    .line 770
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v0, La/ca30;

    .line 776
    .line 777
    check-cast v0, La/ncl0;

    .line 778
    .line 779
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    iget-object v2, v0, La/ncl0;->y:La/lhf0;

    .line 783
    .line 784
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 785
    .line 786
    .line 787
    move-result-object v5

    .line 788
    check-cast v5, La/p7m0;

    .line 789
    .line 790
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    check-cast v5, La/zqs;

    .line 795
    .line 796
    iget-wide v7, v5, La/zqs;->c:J

    .line 797
    .line 798
    invoke-virtual {v2, v7, v8}, La/lhf0;->O(J)V

    .line 799
    .line 800
    .line 801
    iget-object v2, v0, La/ncl0;->c:La/vzg0;

    .line 802
    .line 803
    const-string v5, "KEY_INFO_CARD_IDENTITY"

    .line 804
    .line 805
    invoke-virtual {v2, v5, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    iget-object v2, v0, La/ncl0;->N:La/p7m0;

    .line 809
    .line 810
    :cond_d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    move-object v5, v0

    .line 815
    check-cast v5, La/wqs;

    .line 816
    .line 817
    invoke-static {v5, v6, v4, v1, v3}, La/wqs;->a(La/wqs;La/xqs;ILorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;I)La/wqs;

    .line 818
    .line 819
    .line 820
    move-result-object v5

    .line 821
    invoke-virtual {v2, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    if-eqz v0, :cond_d

    .line 826
    .line 827
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 828
    .line 829
    return-object v0

    .line 830
    :pswitch_8
    move-object/from16 v1, p1

    .line 831
    .line 832
    check-cast v1, Ljava/lang/Throwable;

    .line 833
    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v0, La/duj;

    .line 840
    .line 841
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 842
    .line 843
    .line 844
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_9
    move-object/from16 v1, p1

    .line 848
    .line 849
    check-cast v1, Ljava/lang/Throwable;

    .line 850
    .line 851
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v0, La/duj;

    .line 857
    .line 858
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 859
    .line 860
    .line 861
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_a
    move-object/from16 v1, p1

    .line 865
    .line 866
    check-cast v1, Ljava/lang/Throwable;

    .line 867
    .line 868
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v0, La/duj;

    .line 874
    .line 875
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 876
    .line 877
    .line 878
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 879
    .line 880
    return-object v0

    .line 881
    :pswitch_b
    move-object/from16 v1, p1

    .line 882
    .line 883
    check-cast v1, Ljava/lang/Throwable;

    .line 884
    .line 885
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v0, La/duj;

    .line 891
    .line 892
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 893
    .line 894
    .line 895
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 896
    .line 897
    return-object v0

    .line 898
    :pswitch_c
    move-object/from16 v1, p1

    .line 899
    .line 900
    check-cast v1, Ljava/lang/Throwable;

    .line 901
    .line 902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, La/duj;

    .line 908
    .line 909
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 910
    .line 911
    .line 912
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 913
    .line 914
    return-object v0

    .line 915
    :pswitch_d
    move-object/from16 v1, p1

    .line 916
    .line 917
    check-cast v1, Ljava/lang/Throwable;

    .line 918
    .line 919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v0, La/duj;

    .line 925
    .line 926
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 927
    .line 928
    .line 929
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 930
    .line 931
    return-object v0

    .line 932
    :pswitch_e
    move-object/from16 v1, p1

    .line 933
    .line 934
    check-cast v1, Ljava/lang/Throwable;

    .line 935
    .line 936
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v0, La/duj;

    .line 942
    .line 943
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 944
    .line 945
    .line 946
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 947
    .line 948
    return-object v0

    .line 949
    :pswitch_f
    move-object/from16 v1, p1

    .line 950
    .line 951
    check-cast v1, Ljava/lang/Throwable;

    .line 952
    .line 953
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v0, La/duj;

    .line 959
    .line 960
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 961
    .line 962
    .line 963
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 964
    .line 965
    return-object v0

    .line 966
    :pswitch_10
    move-object/from16 v1, p1

    .line 967
    .line 968
    check-cast v1, Ljava/lang/Throwable;

    .line 969
    .line 970
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v0, La/duj;

    .line 976
    .line 977
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 978
    .line 979
    .line 980
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 981
    .line 982
    return-object v0

    .line 983
    :pswitch_11
    move-object/from16 v1, p1

    .line 984
    .line 985
    check-cast v1, Ljava/lang/Throwable;

    .line 986
    .line 987
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v0, La/duj;

    .line 993
    .line 994
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 995
    .line 996
    .line 997
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 998
    .line 999
    return-object v0

    .line 1000
    :pswitch_12
    move-object/from16 v1, p1

    .line 1001
    .line 1002
    check-cast v1, Ljava/lang/Boolean;

    .line 1003
    .line 1004
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v1

    .line 1008
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v0, La/i630;

    .line 1011
    .line 1012
    sget-object v2, La/i630;->k2:La/evz;

    .line 1013
    .line 1014
    invoke-virtual {v0, v1}, La/i630;->R0(Z)V

    .line 1015
    .line 1016
    .line 1017
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1018
    .line 1019
    return-object v0

    .line 1020
    :pswitch_13
    move-object/from16 v1, p1

    .line 1021
    .line 1022
    check-cast v1, La/hw20;

    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    iget-object v8, v1, La/hw20;->a:Ljava/lang/String;

    .line 1028
    .line 1029
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v0, La/f730;

    .line 1032
    .line 1033
    iget-object v0, v0, La/f730;->s:La/ol60;

    .line 1034
    .line 1035
    iget-object v3, v1, La/hw20;->c:La/dw20;

    .line 1036
    .line 1037
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1038
    .line 1039
    .line 1040
    move-result v3

    .line 1041
    if-eqz v3, :cond_10

    .line 1042
    .line 1043
    if-eq v3, v5, :cond_f

    .line 1044
    .line 1045
    if-ne v3, v2, :cond_e

    .line 1046
    .line 1047
    new-instance v2, La/t630;

    .line 1048
    .line 1049
    new-instance v7, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;

    .line 1050
    .line 1051
    iget-wide v9, v1, La/hw20;->b:J

    .line 1052
    .line 1053
    sget-object v11, La/ki;->c:La/ki;

    .line 1054
    .line 1055
    sget-object v12, La/ki;->f:La/ki;

    .line 1056
    .line 1057
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ki;La/ki;)V

    .line 1058
    .line 1059
    .line 1060
    invoke-direct {v2, v7}, La/t630;-><init>(Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_3

    .line 1067
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 1068
    .line 1069
    .line 1070
    goto :goto_4

    .line 1071
    :cond_f
    new-instance v2, La/t630;

    .line 1072
    .line 1073
    new-instance v7, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;

    .line 1074
    .line 1075
    iget-wide v9, v1, La/hw20;->b:J

    .line 1076
    .line 1077
    sget-object v11, La/ki;->c:La/ki;

    .line 1078
    .line 1079
    sget-object v12, La/ki;->e:La/ki;

    .line 1080
    .line 1081
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ki;La/ki;)V

    .line 1082
    .line 1083
    .line 1084
    invoke-direct {v2, v7}, La/t630;-><init>(Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1088
    .line 1089
    .line 1090
    goto :goto_3

    .line 1091
    :cond_10
    new-instance v2, La/t630;

    .line 1092
    .line 1093
    new-instance v7, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;

    .line 1094
    .line 1095
    iget-wide v9, v1, La/hw20;->b:J

    .line 1096
    .line 1097
    sget-object v11, La/ki;->d:La/ki;

    .line 1098
    .line 1099
    sget-object v12, La/ki;->f:La/ki;

    .line 1100
    .line 1101
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ki;La/ki;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-direct {v2, v7}, La/t630;-><init>(Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1108
    .line 1109
    .line 1110
    :goto_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1111
    .line 1112
    :goto_4
    return-object v6

    .line 1113
    :pswitch_14
    move-object/from16 v1, p1

    .line 1114
    .line 1115
    check-cast v1, La/iui0;

    .line 1116
    .line 1117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1118
    .line 1119
    .line 1120
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v0, La/f730;

    .line 1123
    .line 1124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1128
    .line 1129
    .line 1130
    move-result v1

    .line 1131
    if-eqz v1, :cond_12

    .line 1132
    .line 1133
    if-ne v1, v5, :cond_11

    .line 1134
    .line 1135
    iget-object v0, v0, La/f730;->s:La/ol60;

    .line 1136
    .line 1137
    sget-object v1, La/v630;->a:La/v630;

    .line 1138
    .line 1139
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_5

    .line 1143
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 1144
    .line 1145
    .line 1146
    goto :goto_6

    .line 1147
    :cond_12
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    new-instance v7, La/du20;

    .line 1152
    .line 1153
    iget-object v9, v0, La/f730;->j:La/duj;

    .line 1154
    .line 1155
    const/4 v13, 0x0

    .line 1156
    const/16 v14, 0x14

    .line 1157
    .line 1158
    const/4 v8, 0x1

    .line 1159
    const-class v10, La/duj;

    .line 1160
    .line 1161
    const-string v11, "handleError"

    .line 1162
    .line 1163
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 1164
    .line 1165
    invoke-direct/range {v7 .. v14}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1166
    .line 1167
    .line 1168
    new-instance v1, La/b730;

    .line 1169
    .line 1170
    invoke-direct {v1, v0, v6, v3}, La/b730;-><init>(La/f730;La/yje;B)V

    .line 1171
    .line 1172
    .line 1173
    move-object v3, v7

    .line 1174
    const/16 v7, 0xe

    .line 1175
    .line 1176
    const/4 v4, 0x0

    .line 1177
    const/4 v5, 0x0

    .line 1178
    move-object v6, v1

    .line 1179
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1180
    .line 1181
    .line 1182
    :goto_5
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1183
    .line 1184
    :goto_6
    return-object v6

    .line 1185
    :pswitch_15
    move-object/from16 v1, p1

    .line 1186
    .line 1187
    check-cast v1, Ljava/lang/Boolean;

    .line 1188
    .line 1189
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v1

    .line 1193
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v0, La/b630;

    .line 1196
    .line 1197
    sget-object v2, La/b630;->m2:La/htz;

    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, La/b630;->R0(Z)V

    .line 1200
    .line 1201
    .line 1202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    return-object v0

    .line 1205
    :pswitch_16
    move-object/from16 v1, p1

    .line 1206
    .line 1207
    check-cast v1, La/gw20;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v0, La/e730;

    .line 1215
    .line 1216
    iget-object v0, v0, La/e730;->r:La/qoj0;

    .line 1217
    .line 1218
    iget-object v3, v1, La/gw20;->c:La/cw20;

    .line 1219
    .line 1220
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1221
    .line 1222
    .line 1223
    move-result v3

    .line 1224
    if-eqz v3, :cond_15

    .line 1225
    .line 1226
    if-eq v3, v5, :cond_14

    .line 1227
    .line 1228
    if-ne v3, v2, :cond_13

    .line 1229
    .line 1230
    new-instance v2, La/s630;

    .line 1231
    .line 1232
    new-instance v3, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 1233
    .line 1234
    iget-object v4, v1, La/gw20;->a:Ljava/lang/String;

    .line 1235
    .line 1236
    iget-wide v5, v1, La/gw20;->b:J

    .line 1237
    .line 1238
    sget-object v7, La/ji;->c:La/ji;

    .line 1239
    .line 1240
    sget-object v8, La/ji;->f:La/ji;

    .line 1241
    .line 1242
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ji;La/ji;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-direct {v2, v3}, La/s630;-><init>(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;)V

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v0, v2}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    goto :goto_7

    .line 1252
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 1253
    .line 1254
    .line 1255
    goto :goto_8

    .line 1256
    :cond_14
    new-instance v2, La/s630;

    .line 1257
    .line 1258
    new-instance v3, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 1259
    .line 1260
    iget-object v4, v1, La/gw20;->a:Ljava/lang/String;

    .line 1261
    .line 1262
    iget-wide v5, v1, La/gw20;->b:J

    .line 1263
    .line 1264
    sget-object v7, La/ji;->c:La/ji;

    .line 1265
    .line 1266
    sget-object v8, La/ji;->e:La/ji;

    .line 1267
    .line 1268
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ji;La/ji;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-direct {v2, v3}, La/s630;-><init>(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v0, v2}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    goto :goto_7

    .line 1278
    :cond_15
    new-instance v2, La/s630;

    .line 1279
    .line 1280
    new-instance v3, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;

    .line 1281
    .line 1282
    iget-object v4, v1, La/gw20;->a:Ljava/lang/String;

    .line 1283
    .line 1284
    iget-wide v5, v1, La/gw20;->b:J

    .line 1285
    .line 1286
    sget-object v7, La/ji;->d:La/ji;

    .line 1287
    .line 1288
    sget-object v8, La/ji;->f:La/ji;

    .line 1289
    .line 1290
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;-><init>(Ljava/lang/String;JLa/ji;La/ji;)V

    .line 1291
    .line 1292
    .line 1293
    invoke-direct {v2, v3}, La/s630;-><init>(Lorg/xplatform/sportgame/markets/settings/impl/presentation/models/FilterActionDialogUiModel;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v0, v2}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    :goto_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1300
    .line 1301
    :goto_8
    return-object v6

    .line 1302
    :pswitch_17
    move-object/from16 v1, p1

    .line 1303
    .line 1304
    check-cast v1, La/hui0;

    .line 1305
    .line 1306
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v0, La/e730;

    .line 1312
    .line 1313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1317
    .line 1318
    .line 1319
    move-result v1

    .line 1320
    if-eqz v1, :cond_17

    .line 1321
    .line 1322
    if-ne v1, v5, :cond_16

    .line 1323
    .line 1324
    iget-object v0, v0, La/e730;->r:La/qoj0;

    .line 1325
    .line 1326
    sget-object v1, La/u630;->a:La/u630;

    .line 1327
    .line 1328
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 1329
    .line 1330
    .line 1331
    goto :goto_9

    .line 1332
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_a

    .line 1336
    :cond_17
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    new-instance v7, La/du20;

    .line 1341
    .line 1342
    iget-object v9, v0, La/e730;->j:La/duj;

    .line 1343
    .line 1344
    const/4 v13, 0x0

    .line 1345
    const/16 v14, 0x13

    .line 1346
    .line 1347
    const/4 v8, 0x1

    .line 1348
    const-class v10, La/duj;

    .line 1349
    .line 1350
    const-string v11, "handleError"

    .line 1351
    .line 1352
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 1353
    .line 1354
    invoke-direct/range {v7 .. v14}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1355
    .line 1356
    .line 1357
    new-instance v1, La/a730;

    .line 1358
    .line 1359
    invoke-direct {v1, v0, v6, v3}, La/a730;-><init>(La/e730;La/yje;B)V

    .line 1360
    .line 1361
    .line 1362
    move-object v3, v7

    .line 1363
    const/16 v7, 0xe

    .line 1364
    .line 1365
    const/4 v4, 0x0

    .line 1366
    const/4 v5, 0x0

    .line 1367
    move-object v6, v1

    .line 1368
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1369
    .line 1370
    .line 1371
    :goto_9
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1372
    .line 1373
    :goto_a
    return-object v6

    .line 1374
    :pswitch_18
    move-object/from16 v1, p1

    .line 1375
    .line 1376
    check-cast v1, La/ny20;

    .line 1377
    .line 1378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1379
    .line 1380
    .line 1381
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v0, La/k3t0;

    .line 1384
    .line 1385
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1389
    .line 1390
    return-object v0

    .line 1391
    :pswitch_19
    move-object/from16 v1, p1

    .line 1392
    .line 1393
    check-cast v1, La/x330;

    .line 1394
    .line 1395
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1396
    .line 1397
    .line 1398
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1399
    .line 1400
    check-cast v0, La/v330;

    .line 1401
    .line 1402
    sget-object v2, La/v330;->Q1:La/xuz;

    .line 1403
    .line 1404
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1405
    .line 1406
    .line 1407
    sget-object v2, La/x330;->a:La/x330;

    .line 1408
    .line 1409
    invoke-virtual {v1, v2}, La/x330;->equals(Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v1

    .line 1413
    if-eqz v1, :cond_19

    .line 1414
    .line 1415
    iget-object v1, v0, La/v330;->N1:La/ii;

    .line 1416
    .line 1417
    if-eqz v1, :cond_18

    .line 1418
    .line 1419
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1420
    .line 1421
    const v2, 0x7f1303fb

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v8

    .line 1428
    const v2, 0x7f13014d

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v9

    .line 1435
    const v2, 0x7f131843

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v10

    .line 1442
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1443
    .line 1444
    .line 1445
    const v2, 0x7f130e07

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v11

    .line 1452
    sget-object v16, La/n12;->a:La/n12;

    .line 1453
    .line 1454
    const/16 v17, 0x0

    .line 1455
    .line 1456
    const/16 v18, 0x5d0

    .line 1457
    .line 1458
    const/4 v12, 0x0

    .line 1459
    const-string v13, "REQUEST_SAVE_SETTINGS_DIALOG_KEY"

    .line 1460
    .line 1461
    const/4 v14, 0x0

    .line 1462
    const/4 v15, 0x0

    .line 1463
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1474
    .line 1475
    .line 1476
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1477
    .line 1478
    goto :goto_b

    .line 1479
    :cond_18
    const-string v0, "actionDialogManager"

    .line 1480
    .line 1481
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1482
    .line 1483
    .line 1484
    throw v6

    .line 1485
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 1486
    .line 1487
    .line 1488
    :goto_b
    return-object v6

    .line 1489
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1490
    .line 1491
    check-cast v1, La/xgl0;

    .line 1492
    .line 1493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1494
    .line 1495
    .line 1496
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1497
    .line 1498
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1499
    .line 1500
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1504
    .line 1505
    return-object v0

    .line 1506
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1507
    .line 1508
    check-cast v1, La/wgl0;

    .line 1509
    .line 1510
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1511
    .line 1512
    .line 1513
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1514
    .line 1515
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1516
    .line 1517
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1521
    .line 1522
    return-object v0

    .line 1523
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1524
    .line 1525
    check-cast v1, La/xgl0;

    .line 1526
    .line 1527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1533
    .line 1534
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1538
    .line 1539
    return-object v0

    .line 1540
    nop

    .line 1541
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
