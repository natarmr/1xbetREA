.class public final synthetic La/ui80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ui80;->a:B

    iput-object p1, p0, La/ui80;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ui80;->a:B

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const v2, 0x7f130f7a

    .line 6
    .line 7
    .line 8
    const v3, 0x7f1309bb

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const v5, 0x7f130c9e

    .line 13
    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    const/16 v7, 0x8

    .line 17
    .line 18
    const/4 v8, 0x1

    .line 19
    const/4 v9, 0x0

    .line 20
    iget-object p0, p0, La/ui80;->b:La/cp;

    .line 21
    .line 22
    check-cast p1, Ljava/util/List;

    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 31
    .line 32
    check-cast p1, La/fxx;

    .line 33
    .line 34
    iget-object p1, p1, La/fxx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/lang/ClassCastException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 49
    .line 50
    check-cast p1, La/gxx;

    .line 51
    .line 52
    iget-object p1, p1, La/gxx;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 53
    .line 54
    new-instance v0, La/nrv;

    .line 55
    .line 56
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/zvi0;

    .line 61
    .line 62
    iget-object v1, p0, La/zvi0;->a:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    const/16 v8, 0xfe

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 85
    .line 86
    check-cast p1, La/mux;

    .line 87
    .line 88
    iget-object p1, p1, La/mux;->b:Landroid/widget/TextView;

    .line 89
    .line 90
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/yvi0;

    .line 97
    .line 98
    iget-object p0, p0, La/yvi0;->a:La/dw20;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    if-eq p0, v8, :cond_1

    .line 107
    .line 108
    if-ne p0, v6, :cond_0

    .line 109
    .line 110
    move v2, v5

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    move v2, v3

    .line 117
    :cond_2
    :goto_0
    invoke-virtual {v0, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_1
    return-object v4

    .line 127
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 131
    .line 132
    check-cast p1, La/lux;

    .line 133
    .line 134
    iget-object p1, p1, La/lux;->b:Landroid/widget/TextView;

    .line 135
    .line 136
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 137
    .line 138
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/xvi0;

    .line 143
    .line 144
    iget-object p0, p0, La/xvi0;->a:La/cw20;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_5

    .line 151
    .line 152
    if-eq p0, v8, :cond_4

    .line 153
    .line 154
    if-ne p0, v6, :cond_3

    .line 155
    .line 156
    move v2, v5

    .line 157
    goto :goto_2

    .line 158
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    move v2, v3

    .line 163
    :cond_5
    :goto_2
    invoke-virtual {v0, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    .line 169
    .line 170
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    :goto_3
    return-object v4

    .line 173
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 177
    .line 178
    move-object v0, p1

    .line 179
    check-cast v0, La/djj0;

    .line 180
    .line 181
    iget-object v0, v0, La/djj0;->c:Landroid/widget/TextView;

    .line 182
    .line 183
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, La/qki0;

    .line 188
    .line 189
    iget-object v1, v1, La/qki0;->b:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    check-cast p1, La/djj0;

    .line 195
    .line 196
    iget-object p1, p1, La/djj0;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 197
    .line 198
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, La/qki0;

    .line 203
    .line 204
    iget-boolean p0, p0, La/qki0;->c:Z

    .line 205
    .line 206
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 207
    .line 208
    .line 209
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 216
    .line 217
    move-object v0, p1

    .line 218
    check-cast v0, La/vku0;

    .line 219
    .line 220
    iget-object v0, v0, La/vku0;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 221
    .line 222
    iget-object v1, p0, La/xhe0;->a:Landroid/view/View;

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, La/wsh0;

    .line 233
    .line 234
    iget v2, v2, La/wsh0;->c:I

    .line 235
    .line 236
    invoke-static {v2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 241
    .line 242
    .line 243
    check-cast p1, La/vku0;

    .line 244
    .line 245
    iget-object v0, p1, La/vku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 246
    .line 247
    iget-object v1, p1, La/vku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 248
    .line 249
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    check-cast v2, La/wsh0;

    .line 254
    .line 255
    iget-object v2, v2, La/wsh0;->d:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, p1, La/vku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 261
    .line 262
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, La/wsh0;

    .line 267
    .line 268
    iget-object v2, v2, La/wsh0;->e:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, La/wsh0;

    .line 278
    .line 279
    iget-object v2, v2, La/wsh0;->f:La/i8m0;

    .line 280
    .line 281
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setStatus(La/i8m0;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p1, La/vku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 288
    .line 289
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, La/wsh0;

    .line 294
    .line 295
    iget-boolean v0, v0, La/wsh0;->g:Z

    .line 296
    .line 297
    if-eqz v0, :cond_6

    .line 298
    .line 299
    move v7, v9

    .line 300
    :cond_6
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    check-cast p1, La/wsh0;

    .line 308
    .line 309
    invoke-virtual {v1, v9}, La/tw5;->setFirst(Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    check-cast p0, La/wsh0;

    .line 317
    .line 318
    invoke-virtual {v1, v9}, La/tw5;->setLast(Z)V

    .line 319
    .line 320
    .line 321
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object p0

    .line 324
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 328
    .line 329
    check-cast p1, La/tku0;

    .line 330
    .line 331
    iget-object v0, p1, La/tku0;->c:Landroid/widget/TextView;

    .line 332
    .line 333
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    check-cast v1, La/vsh0;

    .line 338
    .line 339
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 340
    .line 341
    .line 342
    iget-object v0, p1, La/tku0;->c:Landroid/widget/TextView;

    .line 343
    .line 344
    iget-object v1, p1, La/tku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 345
    .line 346
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, La/vsh0;

    .line 351
    .line 352
    iget-object v2, v2, La/vsh0;->b:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    .line 356
    .line 357
    iget-object v0, p1, La/tku0;->f:Landroid/widget/TextView;

    .line 358
    .line 359
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    check-cast v2, La/vsh0;

    .line 364
    .line 365
    iget-object v2, v2, La/vsh0;->a:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 368
    .line 369
    .line 370
    iget-object v0, p1, La/tku0;->e:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 371
    .line 372
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, La/vsh0;

    .line 377
    .line 378
    iget v2, v2, La/vsh0;->c:I

    .line 379
    .line 380
    invoke-virtual {v0, v2}, La/t06;->setProgress(I)V

    .line 381
    .line 382
    .line 383
    iget-object p1, p1, La/tku0;->d:Landroidx/constraintlayout/widget/Group;

    .line 384
    .line 385
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, La/vsh0;

    .line 390
    .line 391
    iget-boolean v0, v0, La/vsh0;->f:Z

    .line 392
    .line 393
    if-eqz v0, :cond_7

    .line 394
    .line 395
    move v7, v9

    .line 396
    :cond_7
    invoke-virtual {p1, v7}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    check-cast p1, La/vsh0;

    .line 404
    .line 405
    invoke-virtual {v1, v8}, La/tw5;->setFirst(Z)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    check-cast p0, La/vsh0;

    .line 413
    .line 414
    invoke-virtual {v1, v9}, La/tw5;->setLast(Z)V

    .line 415
    .line 416
    .line 417
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    return-object p0

    .line 420
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 424
    .line 425
    move-object v0, p1

    .line 426
    check-cast v0, La/yju0;

    .line 427
    .line 428
    iget-object v0, v0, La/yju0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 429
    .line 430
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    check-cast v1, La/jth0;

    .line 435
    .line 436
    invoke-virtual {v0, v8}, La/tw5;->setLast(Z)V

    .line 437
    .line 438
    .line 439
    check-cast p1, La/yju0;

    .line 440
    .line 441
    iget-object p1, p1, La/yju0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 442
    .line 443
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    check-cast p0, La/jth0;

    .line 448
    .line 449
    invoke-virtual {p1, v8}, La/tw5;->setFirst(Z)V

    .line 450
    .line 451
    .line 452
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    return-object p0

    .line 455
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 459
    .line 460
    move-object v0, p1

    .line 461
    check-cast v0, La/vhu0;

    .line 462
    .line 463
    iget-object v0, v0, La/vhu0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 464
    .line 465
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, La/ith0;

    .line 470
    .line 471
    invoke-virtual {v0, v9}, La/tw5;->setLast(Z)V

    .line 472
    .line 473
    .line 474
    check-cast p1, La/vhu0;

    .line 475
    .line 476
    iget-object p1, p1, La/vhu0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 477
    .line 478
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    check-cast p0, La/ith0;

    .line 483
    .line 484
    invoke-virtual {p1, v8}, La/tw5;->setFirst(Z)V

    .line 485
    .line 486
    .line 487
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    return-object p0

    .line 490
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 494
    .line 495
    move-object v0, p1

    .line 496
    check-cast v0, La/wku0;

    .line 497
    .line 498
    iget-object v0, v0, La/wku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 499
    .line 500
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, La/ush0;

    .line 505
    .line 506
    iget v1, v1, La/ush0;->a:I

    .line 507
    .line 508
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 509
    .line 510
    .line 511
    check-cast p1, La/wku0;

    .line 512
    .line 513
    iget-object v0, p1, La/wku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 514
    .line 515
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    check-cast v1, La/ush0;

    .line 520
    .line 521
    const v1, 0x7f1311ff

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(I)V

    .line 525
    .line 526
    .line 527
    iget-object v0, p1, La/wku0;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 528
    .line 529
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    check-cast v1, La/ush0;

    .line 534
    .line 535
    iget v1, v1, La/ush0;->b:I

    .line 536
    .line 537
    invoke-static {v0, v1}, La/vcc;->e0(Landroid/widget/ImageView;I)V

    .line 538
    .line 539
    .line 540
    iget-object v0, p1, La/wku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 541
    .line 542
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    check-cast v1, La/ush0;

    .line 547
    .line 548
    iget-boolean v1, v1, La/ush0;->c:Z

    .line 549
    .line 550
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 551
    .line 552
    .line 553
    iget-object p1, p1, La/wku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 554
    .line 555
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    check-cast v0, La/ush0;

    .line 560
    .line 561
    invoke-virtual {p1, v8}, La/tw5;->setFirst(Z)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    check-cast p0, La/ush0;

    .line 569
    .line 570
    invoke-virtual {p1, v8}, La/tw5;->setLast(Z)V

    .line 571
    .line 572
    .line 573
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 574
    .line 575
    return-object p0

    .line 576
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 580
    .line 581
    check-cast p1, La/uku0;

    .line 582
    .line 583
    iget-object p1, p1, La/uku0;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 584
    .line 585
    new-instance v0, La/nrv;

    .line 586
    .line 587
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    check-cast v1, La/eth0;

    .line 592
    .line 593
    const v1, 0x7f13128b

    .line 594
    .line 595
    .line 596
    invoke-virtual {p0, v1}, La/cp;->v(I)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    const/4 v7, 0x0

    .line 601
    const/16 v8, 0xfe

    .line 602
    .line 603
    const/4 v2, 0x0

    .line 604
    const/4 v3, 0x0

    .line 605
    const/4 v4, 0x0

    .line 606
    const/4 v5, 0x0

    .line 607
    const/4 v6, 0x0

    .line 608
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 612
    .line 613
    .line 614
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object p0

    .line 617
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 621
    .line 622
    move-object v0, p1

    .line 623
    check-cast v0, La/cgu0;

    .line 624
    .line 625
    iget-object v0, v0, La/cgu0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 626
    .line 627
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    check-cast v1, La/gth0;

    .line 632
    .line 633
    invoke-virtual {v0, v9}, La/tw5;->setFirst(Z)V

    .line 634
    .line 635
    .line 636
    check-cast p1, La/cgu0;

    .line 637
    .line 638
    iget-object v0, p1, La/cgu0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 639
    .line 640
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    check-cast v1, La/gth0;

    .line 645
    .line 646
    iget-boolean v1, v1, La/gth0;->a:Z

    .line 647
    .line 648
    invoke-virtual {v0, v1}, La/tw5;->setLast(Z)V

    .line 649
    .line 650
    .line 651
    iget-object p1, p1, La/cgu0;->b:Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 652
    .line 653
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    check-cast v0, La/gth0;

    .line 658
    .line 659
    invoke-virtual {p1, v9}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setFirst(Z)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object p0

    .line 666
    check-cast p0, La/gth0;

    .line 667
    .line 668
    iget-boolean p0, p0, La/gth0;->a:Z

    .line 669
    .line 670
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setLast(Z)V

    .line 671
    .line 672
    .line 673
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 674
    .line 675
    return-object p0

    .line 676
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 680
    .line 681
    check-cast p1, La/u7z;

    .line 682
    .line 683
    iget-object p1, p1, La/u7z;->b:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 684
    .line 685
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    check-cast p0, La/rlg0;

    .line 690
    .line 691
    iget-boolean p0, p0, La/rlg0;->a:Z

    .line 692
    .line 693
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setChecked(Z)V

    .line 694
    .line 695
    .line 696
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 697
    .line 698
    return-object p0

    .line 699
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 703
    .line 704
    check-cast p1, La/dxx;

    .line 705
    .line 706
    iget-object v0, p1, La/dxx;->c:Landroid/widget/TextView;

    .line 707
    .line 708
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    check-cast v1, La/yvf0;

    .line 713
    .line 714
    iget-object v1, v1, La/yvf0;->a:Ljava/lang/String;

    .line 715
    .line 716
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 717
    .line 718
    .line 719
    move-result v1

    .line 720
    if-lez v1, :cond_8

    .line 721
    .line 722
    move v1, v9

    .line 723
    goto :goto_4

    .line 724
    :cond_8
    move v1, v7

    .line 725
    :goto_4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 726
    .line 727
    .line 728
    iget-object v0, p1, La/dxx;->c:Landroid/widget/TextView;

    .line 729
    .line 730
    iget-object p1, p1, La/dxx;->b:Landroid/widget/TextView;

    .line 731
    .line 732
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    check-cast v1, La/yvf0;

    .line 737
    .line 738
    iget-object v1, v1, La/yvf0;->a:Ljava/lang/String;

    .line 739
    .line 740
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    check-cast v0, La/yvf0;

    .line 748
    .line 749
    iget-object v0, v0, La/yvf0;->b:Ljava/lang/String;

    .line 750
    .line 751
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-lez v0, :cond_9

    .line 756
    .line 757
    move v7, v9

    .line 758
    :cond_9
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object p0

    .line 765
    check-cast p0, La/yvf0;

    .line 766
    .line 767
    iget-object p0, p0, La/yvf0;->b:Ljava/lang/String;

    .line 768
    .line 769
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 770
    .line 771
    .line 772
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 773
    .line 774
    return-object p0

    .line 775
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 779
    .line 780
    check-cast p1, La/z2k;

    .line 781
    .line 782
    iget-object p1, p1, La/z2k;->a:Landroid/view/View;

    .line 783
    .line 784
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 789
    .line 790
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object p0

    .line 798
    check-cast p0, La/omk0;

    .line 799
    .line 800
    sget-object p0, La/nmk0;->a:La/nmk0;

    .line 801
    .line 802
    const p0, 0x7f07072d

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 806
    .line 807
    .line 808
    move-result p0

    .line 809
    iput p0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 810
    .line 811
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 812
    .line 813
    return-object p0

    .line 814
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 818
    .line 819
    move-object v0, p1

    .line 820
    check-cast v0, La/xtx;

    .line 821
    .line 822
    iget-object v0, v0, La/xtx;->b:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    iget-object v1, p0, La/cp;->w:Landroid/content/Context;

    .line 828
    .line 829
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    check-cast v2, La/l140;

    .line 834
    .line 835
    const v2, 0x7f040afc

    .line 836
    .line 837
    .line 838
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-static {v0, v3}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 847
    .line 848
    .line 849
    check-cast p1, La/xtx;

    .line 850
    .line 851
    iget-object v0, p1, La/xtx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 852
    .line 853
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    check-cast v3, La/l140;

    .line 858
    .line 859
    iget v3, v3, La/l140;->d:I

    .line 860
    .line 861
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 862
    .line 863
    .line 864
    iget-object v0, p1, La/xtx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 865
    .line 866
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    check-cast v3, La/l140;

    .line 871
    .line 872
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v1

    .line 883
    check-cast v1, La/l140;

    .line 884
    .line 885
    const v1, 0x7f040b5f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconBackgroundTint(I)V

    .line 889
    .line 890
    .line 891
    iget-object v1, p1, La/xtx;->e:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 892
    .line 893
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    check-cast v2, La/l140;

    .line 898
    .line 899
    iget-object v2, v2, La/l140;->e:Ljava/lang/String;

    .line 900
    .line 901
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    check-cast v2, La/l140;

    .line 909
    .line 910
    iget-object v2, v2, La/l140;->f:Ljava/lang/String;

    .line 911
    .line 912
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 913
    .line 914
    .line 915
    iget-object p1, p1, La/xtx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 916
    .line 917
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    check-cast v1, La/l140;

    .line 922
    .line 923
    iget v1, v1, La/l140;->g:I

    .line 924
    .line 925
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object p0

    .line 932
    check-cast p0, La/l140;

    .line 933
    .line 934
    iget-boolean p0, p0, La/l140;->b:Z

    .line 935
    .line 936
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 937
    .line 938
    .line 939
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 940
    .line 941
    return-object p0

    .line 942
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 946
    .line 947
    move-object v0, p1

    .line 948
    check-cast v0, La/ywx;

    .line 949
    .line 950
    iget-object v0, v0, La/ywx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 951
    .line 952
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    check-cast v1, La/sfc0;

    .line 957
    .line 958
    iget-object v1, v1, La/sfc0;->a:Ljava/lang/String;

    .line 959
    .line 960
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 961
    .line 962
    .line 963
    check-cast p1, La/ywx;

    .line 964
    .line 965
    iget-object v0, p1, La/ywx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 966
    .line 967
    const/4 v1, 0x5

    .line 968
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleMaxLines(I)V

    .line 969
    .line 970
    .line 971
    iget-object p1, p1, La/ywx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 972
    .line 973
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object p0

    .line 977
    check-cast p0, La/sfc0;

    .line 978
    .line 979
    iget-object p0, p0, La/sfc0;->b:Ljava/lang/String;

    .line 980
    .line 981
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 982
    .line 983
    .line 984
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 985
    .line 986
    return-object p0

    .line 987
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object p1

    .line 994
    check-cast p1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;

    .line 995
    .line 996
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 997
    .line 998
    check-cast p0, La/xwx;

    .line 999
    .line 1000
    iget-object p0, p0, La/xwx;->b:Landroid/widget/TextView;

    .line 1001
    .line 1002
    iget p1, p1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;->a:I

    .line 1003
    .line 1004
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1005
    .line 1006
    .line 1007
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object p0

    .line 1010
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1014
    .line 1015
    check-cast p1, La/p7b0;

    .line 1016
    .line 1017
    iget-object v0, p1, La/p7b0;->c:Landroid/widget/FrameLayout;

    .line 1018
    .line 1019
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    check-cast v1, La/jm60;

    .line 1024
    .line 1025
    iget-boolean v1, v1, La/jm60;->e:Z

    .line 1026
    .line 1027
    if-eqz v1, :cond_a

    .line 1028
    .line 1029
    move v7, v9

    .line 1030
    :cond_a
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1031
    .line 1032
    .line 1033
    iget-object v0, p1, La/p7b0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1034
    .line 1035
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    check-cast v1, La/jm60;

    .line 1040
    .line 1041
    iget-boolean v1, v1, La/jm60;->e:Z

    .line 1042
    .line 1043
    xor-int/2addr v1, v8

    .line 1044
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v0, p1, La/p7b0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1048
    .line 1049
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    check-cast v1, La/jm60;

    .line 1054
    .line 1055
    iget v1, v1, La/jm60;->d:I

    .line 1056
    .line 1057
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1058
    .line 1059
    .line 1060
    iget-object v0, p1, La/p7b0;->e:Landroid/widget/TextView;

    .line 1061
    .line 1062
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    check-cast v1, La/jm60;

    .line 1067
    .line 1068
    iget-object v1, v1, La/jm60;->b:Ljava/lang/String;

    .line 1069
    .line 1070
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1071
    .line 1072
    .line 1073
    iget-object p1, p1, La/p7b0;->d:Landroid/widget/TextView;

    .line 1074
    .line 1075
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object p0

    .line 1079
    check-cast p0, La/jm60;

    .line 1080
    .line 1081
    iget-object p0, p0, La/jm60;->c:Ljava/lang/String;

    .line 1082
    .line 1083
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1084
    .line 1085
    .line 1086
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1087
    .line 1088
    return-object p0

    .line 1089
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1090
    .line 1091
    .line 1092
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1093
    .line 1094
    check-cast p1, La/i2k;

    .line 1095
    .line 1096
    iget-object p1, p1, La/i2k;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1097
    .line 1098
    new-instance v0, La/nrv;

    .line 1099
    .line 1100
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    check-cast v1, La/ghj;

    .line 1105
    .line 1106
    iget-object v1, v1, La/ghj;->a:Ljava/lang/String;

    .line 1107
    .line 1108
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v2

    .line 1112
    check-cast v2, La/ghj;

    .line 1113
    .line 1114
    iget-boolean v2, v2, La/ghj;->b:Z

    .line 1115
    .line 1116
    const v3, 0x7f1308af

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {p0, v3}, La/cp;->v(I)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v4

    .line 1123
    const/4 v7, 0x0

    .line 1124
    const/16 v8, 0xf4

    .line 1125
    .line 1126
    const/4 v3, 0x0

    .line 1127
    const/4 v5, 0x0

    .line 1128
    const/4 v6, 0x0

    .line 1129
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 1133
    .line 1134
    .line 1135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1136
    .line 1137
    return-object p0

    .line 1138
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object p1

    .line 1145
    check-cast p1, La/v140;

    .line 1146
    .line 1147
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 1148
    .line 1149
    check-cast p0, La/dux;

    .line 1150
    .line 1151
    iget-object v0, p0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1152
    .line 1153
    iget v2, p1, La/v140;->d:I

    .line 1154
    .line 1155
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1156
    .line 1157
    .line 1158
    iget-object v0, p0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1159
    .line 1160
    iget-boolean v2, p1, La/v140;->b:Z

    .line 1161
    .line 1162
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1163
    .line 1164
    .line 1165
    iget-object v0, p0, La/dux;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1166
    .line 1167
    iget-object v2, p1, La/v140;->e:Ljava/lang/String;

    .line 1168
    .line 1169
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1170
    .line 1171
    .line 1172
    iget-object v2, p1, La/v140;->f:Ljava/lang/String;

    .line 1173
    .line 1174
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1175
    .line 1176
    .line 1177
    iget-object p0, p0, La/dux;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1178
    .line 1179
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 1180
    .line 1181
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    iget-object v3, p1, La/v140;->g:Ljava/lang/String;

    .line 1189
    .line 1190
    new-instance v7, La/k9;

    .line 1191
    .line 1192
    invoke-direct {v7, p0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1193
    .line 1194
    .line 1195
    new-instance v8, La/k9;

    .line 1196
    .line 1197
    const/16 p1, 0xd

    .line 1198
    .line 1199
    invoke-direct {v8, p0, p1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1200
    .line 1201
    .line 1202
    const/16 v9, 0xe

    .line 1203
    .line 1204
    const/4 v4, 0x0

    .line 1205
    const/4 v5, 0x0

    .line 1206
    const/4 v6, 0x0

    .line 1207
    invoke-static/range {v2 .. v9}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1208
    .line 1209
    .line 1210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1211
    .line 1212
    return-object p0

    .line 1213
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object p1

    .line 1220
    check-cast p1, La/v140;

    .line 1221
    .line 1222
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 1223
    .line 1224
    check-cast p0, La/zvx;

    .line 1225
    .line 1226
    iget-object v0, p0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1227
    .line 1228
    iget v1, p1, La/v140;->d:I

    .line 1229
    .line 1230
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1231
    .line 1232
    .line 1233
    iget-object v0, p0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1234
    .line 1235
    iget-boolean v1, p1, La/v140;->b:Z

    .line 1236
    .line 1237
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1238
    .line 1239
    .line 1240
    iget-object p0, p0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1241
    .line 1242
    iget-object v0, p1, La/v140;->e:Ljava/lang/String;

    .line 1243
    .line 1244
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1245
    .line 1246
    .line 1247
    iget-object p1, p1, La/v140;->f:Ljava/lang/String;

    .line 1248
    .line 1249
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1250
    .line 1251
    .line 1252
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1253
    .line 1254
    return-object p0

    .line 1255
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1259
    .line 1260
    move-object v0, p1

    .line 1261
    check-cast v0, La/twx;

    .line 1262
    .line 1263
    iget-object v0, v0, La/twx;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1264
    .line 1265
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    check-cast v1, La/rq90;

    .line 1270
    .line 1271
    iget-boolean v1, v1, La/rq90;->c:Z

    .line 1272
    .line 1273
    invoke-virtual {v0, v1}, La/tw5;->setSelected(Z)V

    .line 1274
    .line 1275
    .line 1276
    check-cast p1, La/twx;

    .line 1277
    .line 1278
    iget-object v0, p1, La/twx;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1279
    .line 1280
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    check-cast v1, La/rq90;

    .line 1285
    .line 1286
    iget-object v1, v1, La/rq90;->a:Ljava/lang/String;

    .line 1287
    .line 1288
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1289
    .line 1290
    .line 1291
    iget-object p1, p1, La/twx;->d:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1292
    .line 1293
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object p0

    .line 1297
    check-cast p0, La/rq90;

    .line 1298
    .line 1299
    iget-boolean p0, p0, La/rq90;->b:Z

    .line 1300
    .line 1301
    if-nez p0, :cond_b

    .line 1302
    .line 1303
    move v7, v9

    .line 1304
    :cond_b
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1305
    .line 1306
    .line 1307
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1308
    .line 1309
    return-object p0

    .line 1310
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1314
    .line 1315
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 1316
    .line 1317
    move-object v2, p1

    .line 1318
    check-cast v2, La/qwx;

    .line 1319
    .line 1320
    iget-object v2, v2, La/qwx;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1321
    .line 1322
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v3

    .line 1326
    check-cast v3, La/qq90;

    .line 1327
    .line 1328
    iget-boolean v3, v3, La/qq90;->d:Z

    .line 1329
    .line 1330
    invoke-virtual {v2, v3}, La/tw5;->setSelected(Z)V

    .line 1331
    .line 1332
    .line 1333
    check-cast p1, La/qwx;

    .line 1334
    .line 1335
    iget-object v2, p1, La/qwx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1336
    .line 1337
    iget-object v3, p1, La/qwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1338
    .line 1339
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v4

    .line 1343
    check-cast v4, La/qq90;

    .line 1344
    .line 1345
    iget-object v4, v4, La/qq90;->a:Ljava/lang/String;

    .line 1346
    .line 1347
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1348
    .line 1349
    .line 1350
    iget-object p1, p1, La/qwx;->e:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1351
    .line 1352
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v2

    .line 1356
    check-cast v2, La/qq90;

    .line 1357
    .line 1358
    iget-boolean v2, v2, La/qq90;->b:Z

    .line 1359
    .line 1360
    if-nez v2, :cond_c

    .line 1361
    .line 1362
    move v7, v9

    .line 1363
    :cond_c
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1364
    .line 1365
    .line 1366
    const p1, 0x7f08096d

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1370
    .line 1371
    .line 1372
    move-result-object p1

    .line 1373
    const v2, 0x7f040b10

    .line 1374
    .line 1375
    .line 1376
    invoke-static {p1, v0, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v3, p1}, Lorg/xplatform/uikit/components/views/LoadableImageView;->setPlaceholder(Landroid/graphics/drawable/Drawable;)V

    .line 1380
    .line 1381
    .line 1382
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1383
    .line 1384
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 1385
    .line 1386
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object p0

    .line 1393
    check-cast p0, La/qq90;

    .line 1394
    .line 1395
    iget-object p0, p0, La/qq90;->c:Ljava/lang/String;

    .line 1396
    .line 1397
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 1398
    .line 1399
    .line 1400
    move-result v2

    .line 1401
    if-nez v2, :cond_d

    .line 1402
    .line 1403
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1404
    .line 1405
    .line 1406
    goto :goto_6

    .line 1407
    :cond_d
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 1408
    .line 1409
    invoke-static {p0, v2, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v2

    .line 1413
    if-nez v2, :cond_10

    .line 1414
    .line 1415
    const-string v2, "https://"

    .line 1416
    .line 1417
    invoke-static {p0, v2, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v2

    .line 1421
    if-eqz v2, :cond_e

    .line 1422
    .line 1423
    goto :goto_5

    .line 1424
    :cond_e
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1425
    .line 1426
    .line 1427
    move-result v2

    .line 1428
    const/16 v4, 0x2f

    .line 1429
    .line 1430
    if-lez v2, :cond_f

    .line 1431
    .line 1432
    const-string v2, "/"

    .line 1433
    .line 1434
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v2

    .line 1438
    if-nez v2, :cond_f

    .line 1439
    .line 1440
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    .line 1443
    :cond_f
    new-array v2, v8, [C

    .line 1444
    .line 1445
    aput-char v4, v2, v9

    .line 1446
    .line 1447
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object p0

    .line 1451
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    .line 1454
    goto :goto_6

    .line 1455
    :cond_10
    :goto_5
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1459
    .line 1460
    .line 1461
    :goto_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object p0

    .line 1465
    invoke-static {v3, p0, p1, v1}, Lorg/xplatform/uikit/components/views/LoadableImageView;->h(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 1466
    .line 1467
    .line 1468
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1469
    .line 1470
    return-object p0

    .line 1471
    :pswitch_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1475
    .line 1476
    check-cast p1, La/swx;

    .line 1477
    .line 1478
    iget-object p1, p1, La/swx;->b:Lorg/xplatform/uikit/components/header/Header;

    .line 1479
    .line 1480
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1481
    .line 1482
    .line 1483
    move-result-object p0

    .line 1484
    check-cast p0, La/dr90;

    .line 1485
    .line 1486
    iget-object p0, p0, La/dr90;->a:Ljava/lang/String;

    .line 1487
    .line 1488
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/header/Header;->setTitle(Ljava/lang/CharSequence;)V

    .line 1489
    .line 1490
    .line 1491
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1492
    .line 1493
    return-object p0

    .line 1494
    :pswitch_18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1498
    .line 1499
    move-object v0, p1

    .line 1500
    check-cast v0, La/rwx;

    .line 1501
    .line 1502
    iget-object v0, v0, La/rwx;->c:Landroid/widget/TextView;

    .line 1503
    .line 1504
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v1

    .line 1508
    check-cast v1, La/pq90;

    .line 1509
    .line 1510
    iget-object v1, v1, La/pq90;->a:Ljava/lang/String;

    .line 1511
    .line 1512
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1513
    .line 1514
    .line 1515
    check-cast p1, La/rwx;

    .line 1516
    .line 1517
    iget-object v0, p1, La/rwx;->c:Landroid/widget/TextView;

    .line 1518
    .line 1519
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 1520
    .line 1521
    iget-object v1, p0, La/xhe0;->a:Landroid/view/View;

    .line 1522
    .line 1523
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v2

    .line 1534
    check-cast v2, La/pq90;

    .line 1535
    .line 1536
    iget v2, v2, La/pq90;->e:I

    .line 1537
    .line 1538
    invoke-static {v1, v2, v9}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1539
    .line 1540
    .line 1541
    move-result v1

    .line 1542
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1543
    .line 1544
    .line 1545
    iget-object p1, p1, La/rwx;->b:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1546
    .line 1547
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1548
    .line 1549
    .line 1550
    move-result-object p0

    .line 1551
    check-cast p0, La/pq90;

    .line 1552
    .line 1553
    iget-boolean p0, p0, La/pq90;->b:Z

    .line 1554
    .line 1555
    if-nez p0, :cond_11

    .line 1556
    .line 1557
    move v7, v9

    .line 1558
    :cond_11
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1559
    .line 1560
    .line 1561
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1562
    .line 1563
    return-object p0

    .line 1564
    :pswitch_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1565
    .line 1566
    .line 1567
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1568
    .line 1569
    move-object v0, p1

    .line 1570
    check-cast v0, La/pwx;

    .line 1571
    .line 1572
    iget-object v0, v0, La/pwx;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1573
    .line 1574
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v1

    .line 1578
    check-cast v1, La/oq90;

    .line 1579
    .line 1580
    iget-boolean v1, v1, La/oq90;->c:Z

    .line 1581
    .line 1582
    invoke-virtual {v0, v1}, La/tw5;->setSelected(Z)V

    .line 1583
    .line 1584
    .line 1585
    check-cast p1, La/pwx;

    .line 1586
    .line 1587
    iget-object v0, p1, La/pwx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1588
    .line 1589
    iget-object v1, p1, La/pwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1590
    .line 1591
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v2

    .line 1595
    check-cast v2, La/oq90;

    .line 1596
    .line 1597
    iget-object v2, v2, La/oq90;->a:Ljava/lang/String;

    .line 1598
    .line 1599
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1600
    .line 1601
    .line 1602
    iget-object p1, p1, La/pwx;->e:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1603
    .line 1604
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    check-cast v0, La/oq90;

    .line 1609
    .line 1610
    iget-boolean v0, v0, La/oq90;->b:Z

    .line 1611
    .line 1612
    if-nez v0, :cond_12

    .line 1613
    .line 1614
    move v7, v9

    .line 1615
    :cond_12
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1616
    .line 1617
    .line 1618
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 1619
    .line 1620
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1621
    .line 1622
    .line 1623
    move-result-object p1

    .line 1624
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    check-cast v0, La/oq90;

    .line 1632
    .line 1633
    iget v0, v0, La/oq90;->e:I

    .line 1634
    .line 1635
    invoke-static {p1, v0, v9}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1636
    .line 1637
    .line 1638
    move-result p1

    .line 1639
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object p0

    .line 1643
    check-cast p0, La/oq90;

    .line 1644
    .line 1645
    iget p0, p0, La/oq90;->d:I

    .line 1646
    .line 1647
    int-to-long v2, p0

    .line 1648
    const-string p0, "android"

    .line 1649
    .line 1650
    const-string v0, "icons_currency"

    .line 1651
    .line 1652
    const-string v4, "static"

    .line 1653
    .line 1654
    const-string v5, "img"

    .line 1655
    .line 1656
    invoke-static {v4, v5, p0, v0}, La/rz4;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 1657
    .line 1658
    .line 1659
    move-result-object p0

    .line 1660
    const-string v0, ".svg"

    .line 1661
    .line 1662
    invoke-static {v2, v3, v0, p0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 1663
    .line 1664
    .line 1665
    iget-object p0, p0, La/bzu;->b:Ljava/lang/Object;

    .line 1666
    .line 1667
    check-cast p0, Ljava/lang/StringBuilder;

    .line 1668
    .line 1669
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1670
    .line 1671
    .line 1672
    move-result-object p0

    .line 1673
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v0

    .line 1677
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1678
    .line 1679
    .line 1680
    move-result-object p1

    .line 1681
    const v2, 0x7f080863

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v1, v2, v0, p1, p0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1685
    .line 1686
    .line 1687
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1688
    .line 1689
    return-object p0

    .line 1690
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1691
    .line 1692
    .line 1693
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1694
    .line 1695
    move-object v0, p1

    .line 1696
    check-cast v0, La/gj90;

    .line 1697
    .line 1698
    iget-object v0, v0, La/gj90;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1699
    .line 1700
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v1

    .line 1704
    check-cast v1, La/lje;

    .line 1705
    .line 1706
    iget-object v1, v1, La/lje;->a:Ljava/lang/String;

    .line 1707
    .line 1708
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1709
    .line 1710
    .line 1711
    check-cast p1, La/gj90;

    .line 1712
    .line 1713
    iget-object v0, p1, La/gj90;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 1714
    .line 1715
    iget-object v1, p1, La/gj90;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1716
    .line 1717
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    check-cast v2, La/lje;

    .line 1722
    .line 1723
    iget-boolean v2, v2, La/lje;->c:Z

    .line 1724
    .line 1725
    if-eqz v2, :cond_13

    .line 1726
    .line 1727
    move v7, v9

    .line 1728
    :cond_13
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1729
    .line 1730
    .line 1731
    iget-object p1, p1, La/gj90;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 1732
    .line 1733
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    check-cast v0, La/lje;

    .line 1738
    .line 1739
    iget-object v0, v0, La/lje;->b:Ljava/lang/String;

    .line 1740
    .line 1741
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(Ljava/lang/CharSequence;)V

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object p1

    .line 1748
    check-cast p1, La/lje;

    .line 1749
    .line 1750
    iget-object p1, p1, La/lje;->d:La/dj90;

    .line 1751
    .line 1752
    sget-object v0, La/dj90;->a:La/dj90;

    .line 1753
    .line 1754
    if-ne p1, v0, :cond_14

    .line 1755
    .line 1756
    move p1, v8

    .line 1757
    goto :goto_7

    .line 1758
    :cond_14
    move p1, v9

    .line 1759
    :goto_7
    invoke-virtual {v1, p1}, La/tw5;->setFirst(Z)V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1763
    .line 1764
    .line 1765
    move-result-object p0

    .line 1766
    check-cast p0, La/lje;

    .line 1767
    .line 1768
    iget-object p0, p0, La/lje;->d:La/dj90;

    .line 1769
    .line 1770
    sget-object p1, La/dj90;->b:La/dj90;

    .line 1771
    .line 1772
    if-ne p0, p1, :cond_15

    .line 1773
    .line 1774
    goto :goto_8

    .line 1775
    :cond_15
    move v8, v9

    .line 1776
    :goto_8
    invoke-virtual {v1, v8}, La/tw5;->setLast(Z)V

    .line 1777
    .line 1778
    .line 1779
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1780
    .line 1781
    return-object p0

    .line 1782
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1783
    .line 1784
    .line 1785
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1786
    .line 1787
    check-cast p1, La/cj90;

    .line 1788
    .line 1789
    iget-object p1, p1, La/cj90;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1790
    .line 1791
    new-instance v0, La/nrv;

    .line 1792
    .line 1793
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1794
    .line 1795
    .line 1796
    move-result-object p0

    .line 1797
    check-cast p0, La/kie;

    .line 1798
    .line 1799
    iget-object v1, p0, La/kie;->a:Ljava/lang/String;

    .line 1800
    .line 1801
    const/4 v7, 0x0

    .line 1802
    const/16 v8, 0xfe

    .line 1803
    .line 1804
    const/4 v2, 0x0

    .line 1805
    const/4 v3, 0x0

    .line 1806
    const/4 v4, 0x0

    .line 1807
    const/4 v5, 0x0

    .line 1808
    const/4 v6, 0x0

    .line 1809
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 1813
    .line 1814
    .line 1815
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1816
    .line 1817
    return-object p0

    .line 1818
    :pswitch_1c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1819
    .line 1820
    .line 1821
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1822
    .line 1823
    check-cast p1, La/vi80;

    .line 1824
    .line 1825
    iget-object p1, p1, La/vi80;->a:Lorg/xplatform/uikit/components/views/AppCompatView;

    .line 1826
    .line 1827
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 1828
    .line 1829
    .line 1830
    move-result-object p1

    .line 1831
    if-eqz p1, :cond_16

    .line 1832
    .line 1833
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object p0

    .line 1837
    check-cast p0, La/wi80;

    .line 1838
    .line 1839
    iget p0, p0, La/wi80;->c:I

    .line 1840
    .line 1841
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1842
    .line 1843
    .line 1844
    move-result-object p0

    .line 1845
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 1846
    .line 1847
    .line 1848
    :cond_16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1849
    .line 1850
    return-object p0

    .line 1851
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
