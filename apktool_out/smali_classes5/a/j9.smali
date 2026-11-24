.class public final synthetic La/j9;
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

    .line 2
    iput-byte p2, p0, La/j9;->a:B

    iput-object p1, p0, La/j9;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/cp;La/mo2;)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    iput-byte p2, p0, La/j9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j9;->b:La/cp;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j9;->a:B

    .line 4
    .line 5
    const v2, 0x7f040b72

    .line 6
    .line 7
    .line 8
    const v6, 0x7f131167

    .line 9
    .line 10
    .line 11
    const v7, 0x7f0606d0

    .line 12
    .line 13
    .line 14
    const/high16 v8, 0x41000000    # 8.0f

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v11, 0x4

    .line 18
    const v12, 0x7f040b5f

    .line 19
    .line 20
    .line 21
    const/4 v13, 0x5

    .line 22
    const v14, 0x7f040afc

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    iget-object v0, v0, La/j9;->b:La/cp;

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 41
    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, La/esx;

    .line 44
    .line 45
    iget-object v2, v2, La/esx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 46
    .line 47
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, La/h140;

    .line 52
    .line 53
    iget-boolean v3, v3, La/h140;->a:Z

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 56
    .line 57
    .line 58
    check-cast v1, La/esx;

    .line 59
    .line 60
    iget-object v2, v1, La/esx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 61
    .line 62
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, La/h140;

    .line 67
    .line 68
    iget-object v3, v3, La/h140;->d:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, La/h140;

    .line 75
    .line 76
    iget v5, v5, La/h140;->e:I

    .line 77
    .line 78
    sget-object v6, La/j5d;->a:Landroid/util/TypedValue;

    .line 79
    .line 80
    iget-object v6, v0, La/cp;->w:Landroid/content/Context;

    .line 81
    .line 82
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, La/h140;

    .line 87
    .line 88
    invoke-static {v6, v12, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, La/h140;

    .line 101
    .line 102
    invoke-static {v6, v12, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v2, v5, v7, v4, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v1, La/esx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 114
    .line 115
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, La/h140;

    .line 120
    .line 121
    iget-object v2, v2, La/h140;->f:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/h140;

    .line 131
    .line 132
    iget-object v0, v0, La/h140;->g:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0

    .line 140
    :pswitch_0
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, Ljava/util/List;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 148
    .line 149
    move-object v2, v1

    .line 150
    check-cast v2, La/fsx;

    .line 151
    .line 152
    iget-object v2, v2, La/fsx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 153
    .line 154
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, La/h140;

    .line 159
    .line 160
    iget-boolean v3, v3, La/h140;->a:Z

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 163
    .line 164
    .line 165
    check-cast v1, La/fsx;

    .line 166
    .line 167
    iget-object v2, v1, La/fsx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 168
    .line 169
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    check-cast v3, La/h140;

    .line 174
    .line 175
    iget-object v3, v3, La/h140;->d:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, La/h140;

    .line 182
    .line 183
    iget v4, v4, La/h140;->e:I

    .line 184
    .line 185
    invoke-virtual {v2, v4, v5, v5, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v1, La/fsx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 189
    .line 190
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, La/h140;

    .line 195
    .line 196
    iget-object v2, v2, La/h140;->f:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/h140;

    .line 206
    .line 207
    iget-object v0, v0, La/h140;->g:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_1
    move-object/from16 v1, p1

    .line 216
    .line 217
    check-cast v1, Ljava/util/List;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 223
    .line 224
    move-object v2, v1

    .line 225
    check-cast v2, La/csx;

    .line 226
    .line 227
    iget-object v2, v2, La/csx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 228
    .line 229
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    check-cast v3, La/h140;

    .line 234
    .line 235
    iget-boolean v3, v3, La/h140;->a:Z

    .line 236
    .line 237
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 238
    .line 239
    .line 240
    check-cast v1, La/csx;

    .line 241
    .line 242
    iget-object v2, v1, La/csx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 243
    .line 244
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    check-cast v3, La/h140;

    .line 249
    .line 250
    iget-object v3, v3, La/h140;->d:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, La/h140;

    .line 257
    .line 258
    iget v4, v4, La/h140;->e:I

    .line 259
    .line 260
    invoke-virtual {v2, v4, v5, v5, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-object v1, v1, La/csx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 264
    .line 265
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, La/h140;

    .line 270
    .line 271
    iget-object v2, v2, La/h140;->f:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, La/h140;

    .line 281
    .line 282
    iget-object v0, v0, La/h140;->g:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 285
    .line 286
    .line 287
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_2
    move-object/from16 v1, p1

    .line 291
    .line 292
    check-cast v1, Ljava/util/List;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, La/g140;

    .line 302
    .line 303
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 304
    .line 305
    check-cast v2, La/bwx;

    .line 306
    .line 307
    iget-object v3, v2, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 308
    .line 309
    iget v4, v1, La/g140;->d:I

    .line 310
    .line 311
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 312
    .line 313
    .line 314
    iget-object v3, v2, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 315
    .line 316
    iget-boolean v4, v1, La/g140;->b:Z

    .line 317
    .line 318
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 319
    .line 320
    .line 321
    iget-object v2, v2, La/bwx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 322
    .line 323
    iget-object v3, v1, La/g140;->e:Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    .line 328
    iget-boolean v3, v1, La/g140;->h:Z

    .line 329
    .line 330
    if-eqz v3, :cond_0

    .line 331
    .line 332
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 333
    .line 334
    invoke-static {v2, v0, v1}, La/idx;->R(Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Landroid/content/Context;La/g140;)V

    .line 335
    .line 336
    .line 337
    goto :goto_0

    .line 338
    :cond_0
    iget-object v0, v1, La/g140;->f:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 341
    .line 342
    .line 343
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_3
    move-object/from16 v1, p1

    .line 347
    .line 348
    check-cast v1, Ljava/util/List;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, La/g140;

    .line 358
    .line 359
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 360
    .line 361
    check-cast v2, La/zvx;

    .line 362
    .line 363
    iget-object v3, v2, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 364
    .line 365
    iget v4, v1, La/g140;->d:I

    .line 366
    .line 367
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 368
    .line 369
    .line 370
    iget-object v3, v2, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 371
    .line 372
    iget-boolean v4, v1, La/g140;->b:Z

    .line 373
    .line 374
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 375
    .line 376
    .line 377
    iget-object v2, v2, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 378
    .line 379
    iget-object v3, v1, La/g140;->e:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    iget-boolean v3, v1, La/g140;->h:Z

    .line 385
    .line 386
    if-eqz v3, :cond_1

    .line 387
    .line 388
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 389
    .line 390
    invoke-static {v2, v0, v1}, La/idx;->R(Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Landroid/content/Context;La/g140;)V

    .line 391
    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_1
    iget-object v0, v1, La/g140;->f:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 397
    .line 398
    .line 399
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_4
    move-object/from16 v1, p1

    .line 403
    .line 404
    check-cast v1, Ljava/util/List;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 410
    .line 411
    check-cast v1, La/bwx;

    .line 412
    .line 413
    iget-object v1, v1, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 414
    .line 415
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    new-instance v0, Ljava/lang/ClassCastException;

    .line 419
    .line 420
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 421
    .line 422
    .line 423
    throw v0

    .line 424
    :pswitch_5
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, Ljava/util/List;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 432
    .line 433
    move-object v2, v1

    .line 434
    check-cast v2, La/itx;

    .line 435
    .line 436
    iget-object v2, v2, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 437
    .line 438
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    check-cast v3, La/g140;

    .line 443
    .line 444
    iget v3, v3, La/g140;->d:I

    .line 445
    .line 446
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 447
    .line 448
    .line 449
    check-cast v1, La/itx;

    .line 450
    .line 451
    iget-object v2, v1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 452
    .line 453
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    check-cast v3, La/g140;

    .line 458
    .line 459
    iget-object v3, v3, La/g140;->e:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    iget-object v1, v1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 465
    .line 466
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, La/g140;

    .line 471
    .line 472
    iget-boolean v0, v0, La/g140;->b:Z

    .line 473
    .line 474
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 475
    .line 476
    .line 477
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_6
    move-object/from16 v1, p1

    .line 481
    .line 482
    check-cast v1, Ljava/util/List;

    .line 483
    .line 484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 488
    .line 489
    move-object v2, v1

    .line 490
    check-cast v2, La/gtx;

    .line 491
    .line 492
    iget-object v2, v2, La/gtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 493
    .line 494
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    check-cast v5, La/g140;

    .line 499
    .line 500
    iget v5, v5, La/g140;->d:I

    .line 501
    .line 502
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 503
    .line 504
    .line 505
    check-cast v1, La/gtx;

    .line 506
    .line 507
    iget-object v2, v1, La/gtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 508
    .line 509
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    check-cast v5, La/g140;

    .line 514
    .line 515
    iget-object v5, v5, La/g140;->e:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    iget-object v1, v1, La/gtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 521
    .line 522
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    check-cast v2, La/g140;

    .line 527
    .line 528
    iget-boolean v2, v2, La/g140;->b:Z

    .line 529
    .line 530
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    check-cast v2, La/g140;

    .line 538
    .line 539
    iget-boolean v2, v2, La/g140;->h:Z

    .line 540
    .line 541
    if-eqz v2, :cond_4

    .line 542
    .line 543
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 544
    .line 545
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    check-cast v0, La/g140;

    .line 550
    .line 551
    iget v5, v0, La/g140;->g:I

    .line 552
    .line 553
    invoke-virtual {v2, v5}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    const v6, 0x7f0706f1

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-eqz v5, :cond_2

    .line 569
    .line 570
    invoke-virtual {v5, v4, v4, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 571
    .line 572
    .line 573
    :cond_2
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 574
    .line 575
    const-string v6, " "

    .line 576
    .line 577
    invoke-direct {v2, v6}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 578
    .line 579
    .line 580
    if-eqz v5, :cond_3

    .line 581
    .line 582
    new-instance v7, La/abb;

    .line 583
    .line 584
    invoke-direct {v7, v5}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 585
    .line 586
    .line 587
    const/16 v5, 0x11

    .line 588
    .line 589
    invoke-virtual {v2, v7, v4, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 590
    .line 591
    .line 592
    :cond_3
    invoke-virtual {v2, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 593
    .line 594
    .line 595
    iget-object v0, v0, La/g140;->f:Ljava/lang/String;

    .line 596
    .line 597
    invoke-virtual {v2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 601
    .line 602
    .line 603
    goto :goto_2

    .line 604
    :cond_4
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    check-cast v0, La/g140;

    .line 609
    .line 610
    iget-object v0, v0, La/g140;->f:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 613
    .line 614
    .line 615
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 616
    .line 617
    return-object v0

    .line 618
    :pswitch_7
    move-object/from16 v1, p1

    .line 619
    .line 620
    check-cast v1, Ljava/util/List;

    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, La/g140;

    .line 630
    .line 631
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 632
    .line 633
    check-cast v2, La/lrx;

    .line 634
    .line 635
    iget-object v3, v2, La/lrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 636
    .line 637
    iget v4, v1, La/g140;->d:I

    .line 638
    .line 639
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 640
    .line 641
    .line 642
    iget-object v3, v2, La/lrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 643
    .line 644
    iget-boolean v4, v1, La/g140;->b:Z

    .line 645
    .line 646
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 647
    .line 648
    .line 649
    iget-object v2, v2, La/lrx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 650
    .line 651
    iget-object v3, v1, La/g140;->e:Ljava/lang/String;

    .line 652
    .line 653
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 654
    .line 655
    .line 656
    iget-boolean v3, v1, La/g140;->h:Z

    .line 657
    .line 658
    if-eqz v3, :cond_5

    .line 659
    .line 660
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 661
    .line 662
    invoke-static {v2, v0, v1}, La/idx;->R(Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Landroid/content/Context;La/g140;)V

    .line 663
    .line 664
    .line 665
    goto :goto_3

    .line 666
    :cond_5
    iget-object v0, v1, La/g140;->f:Ljava/lang/String;

    .line 667
    .line 668
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 669
    .line 670
    .line 671
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_8
    move-object/from16 v1, p1

    .line 675
    .line 676
    check-cast v1, Ljava/util/List;

    .line 677
    .line 678
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 682
    .line 683
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 684
    .line 685
    move-object v3, v1

    .line 686
    check-cast v3, La/bsx;

    .line 687
    .line 688
    iget-object v3, v3, La/bsx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 689
    .line 690
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    check-cast v5, La/v54;

    .line 695
    .line 696
    iget v5, v5, La/v54;->c:I

    .line 697
    .line 698
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 699
    .line 700
    .line 701
    check-cast v1, La/bsx;

    .line 702
    .line 703
    iget-object v3, v1, La/bsx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 704
    .line 705
    iget-object v5, v1, La/bsx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 706
    .line 707
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    check-cast v6, La/v54;

    .line 712
    .line 713
    iget-object v6, v6, La/v54;->a:Ljava/lang/String;

    .line 714
    .line 715
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    check-cast v3, La/v54;

    .line 723
    .line 724
    iget v3, v3, La/v54;->d:I

    .line 725
    .line 726
    const/16 v6, 0x30

    .line 727
    .line 728
    if-ne v3, v6, :cond_6

    .line 729
    .line 730
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    const v6, 0x7f070717

    .line 735
    .line 736
    .line 737
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    const v6, 0x7f080350

    .line 742
    .line 743
    .line 744
    invoke-virtual {v2, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 749
    .line 750
    .line 751
    invoke-static {v14, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    invoke-static {v5, v2}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v5, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 763
    .line 764
    .line 765
    goto :goto_4

    .line 766
    :cond_6
    const v3, 0x7f040b5d

    .line 767
    .line 768
    .line 769
    invoke-static {v3, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    invoke-static {v5, v2}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v5, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 781
    .line 782
    .line 783
    :goto_4
    iget-object v1, v1, La/bsx;->e:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 784
    .line 785
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    check-cast v0, La/v54;

    .line 790
    .line 791
    iget-boolean v0, v0, La/v54;->b:Z

    .line 792
    .line 793
    if-nez v0, :cond_7

    .line 794
    .line 795
    move v15, v4

    .line 796
    goto :goto_5

    .line 797
    :cond_7
    const/16 v15, 0x8

    .line 798
    .line 799
    :goto_5
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 800
    .line 801
    .line 802
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 803
    .line 804
    return-object v0

    .line 805
    :pswitch_9
    move-object/from16 v1, p1

    .line 806
    .line 807
    check-cast v1, Ljava/util/List;

    .line 808
    .line 809
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 813
    .line 814
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 815
    .line 816
    check-cast v1, La/zzj;

    .line 817
    .line 818
    iget-object v1, v1, La/zzj;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 819
    .line 820
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    check-cast v0, La/m14;

    .line 825
    .line 826
    iget-object v0, v0, La/m14;->a:Ljava/lang/String;

    .line 827
    .line 828
    sget-object v2, La/g2x;->a:La/g2x;

    .line 829
    .line 830
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    invoke-static {v1, v0, v2, v5, v11}, La/u0d;->g(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    .line 835
    .line 836
    .line 837
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 838
    .line 839
    return-object v0

    .line 840
    :pswitch_a
    move-object/from16 v1, p1

    .line 841
    .line 842
    check-cast v1, Ljava/util/List;

    .line 843
    .line 844
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 848
    .line 849
    check-cast v1, La/asx;

    .line 850
    .line 851
    iget-object v1, v1, La/asx;->b:Landroid/widget/TextView;

    .line 852
    .line 853
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    check-cast v0, La/ho3;

    .line 858
    .line 859
    iget-object v0, v0, La/ho3;->a:Ljava/lang/String;

    .line 860
    .line 861
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 862
    .line 863
    .line 864
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 865
    .line 866
    return-object v0

    .line 867
    :pswitch_b
    move-object/from16 v1, p1

    .line 868
    .line 869
    check-cast v1, Ljava/util/List;

    .line 870
    .line 871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 875
    .line 876
    check-cast v1, La/myx;

    .line 877
    .line 878
    iget-object v1, v1, La/myx;->b:Landroid/widget/TextView;

    .line 879
    .line 880
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    new-instance v0, Ljava/lang/ClassCastException;

    .line 884
    .line 885
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 886
    .line 887
    .line 888
    throw v0

    .line 889
    :pswitch_c
    move-object/from16 v1, p1

    .line 890
    .line 891
    check-cast v1, Ljava/util/List;

    .line 892
    .line 893
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 901
    .line 902
    check-cast v1, La/ap2;

    .line 903
    .line 904
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 905
    .line 906
    iget-object v5, v0, La/cp;->u:La/yfu0;

    .line 907
    .line 908
    check-cast v5, La/xyv;

    .line 909
    .line 910
    iget-object v6, v5, La/xyv;->d:Landroid/widget/ImageView;

    .line 911
    .line 912
    iget-object v7, v5, La/xyv;->c:Landroid/widget/FrameLayout;

    .line 913
    .line 914
    iget-object v8, v5, La/xyv;->b:Landroid/widget/FrameLayout;

    .line 915
    .line 916
    iget-object v9, v5, La/xyv;->l:Landroid/widget/TextView;

    .line 917
    .line 918
    iget-object v11, v5, La/xyv;->h:Landroid/widget/TextView;

    .line 919
    .line 920
    iget-object v12, v5, La/xyv;->m:Landroid/widget/TextView;

    .line 921
    .line 922
    iget-object v13, v5, La/xyv;->g:Landroid/widget/TextView;

    .line 923
    .line 924
    iget-wide v3, v1, La/ap2;->a:J

    .line 925
    .line 926
    iget v14, v1, La/ap2;->r:I

    .line 927
    .line 928
    const-wide/16 v16, 0x0

    .line 929
    .line 930
    cmp-long v16, v3, v16

    .line 931
    .line 932
    const-string v17, ""

    .line 933
    .line 934
    if-eqz v16, :cond_8

    .line 935
    .line 936
    const-string v15, "svg"

    .line 937
    .line 938
    const-string v10, "sports_v2"

    .line 939
    .line 940
    move-object/from16 p0, v0

    .line 941
    .line 942
    const-string v0, "static"

    .line 943
    .line 944
    invoke-static {v0, v15, v10}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    const-string v10, ".svg"

    .line 949
    .line 950
    invoke-static {v3, v4, v10, v0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 951
    .line 952
    .line 953
    iget-object v0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v0, Ljava/lang/StringBuilder;

    .line 956
    .line 957
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    goto :goto_6

    .line 962
    :cond_8
    move-object/from16 p0, v0

    .line 963
    .line 964
    move-object/from16 v0, v17

    .line 965
    .line 966
    :goto_6
    invoke-static {v6, v0}, La/u0d;->k(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    iget-object v0, v1, La/ap2;->e:Ljava/lang/String;

    .line 970
    .line 971
    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual/range {p0 .. p0}, La/cp;->u()Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    check-cast v0, La/ap2;

    .line 979
    .line 980
    iget-boolean v0, v0, La/ap2;->n:Z

    .line 981
    .line 982
    if-eqz v0, :cond_a

    .line 983
    .line 984
    iget-object v0, v5, La/xyv;->k:Landroid/widget/TextView;

    .line 985
    .line 986
    invoke-virtual/range {p0 .. p0}, La/cp;->u()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    check-cast v3, La/ap2;

    .line 991
    .line 992
    iget-object v3, v3, La/ap2;->o:Ljava/lang/String;

    .line 993
    .line 994
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual/range {p0 .. p0}, La/cp;->u()Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    check-cast v0, La/ap2;

    .line 1002
    .line 1003
    iget-object v0, v0, La/ap2;->p:Ljava/lang/String;

    .line 1004
    .line 1005
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual/range {p0 .. p0}, La/cp;->u()Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    check-cast v0, La/ap2;

    .line 1013
    .line 1014
    iget-boolean v0, v0, La/ap2;->q:Z

    .line 1015
    .line 1016
    if-eqz v0, :cond_9

    .line 1017
    .line 1018
    const/4 v0, 0x0

    .line 1019
    goto :goto_7

    .line 1020
    :cond_9
    const/16 v0, 0x8

    .line 1021
    .line 1022
    :goto_7
    invoke-virtual {v12, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1023
    .line 1024
    .line 1025
    :cond_a
    iget-object v0, v1, La/ap2;->h:Ljava/lang/String;

    .line 1026
    .line 1027
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1028
    .line 1029
    .line 1030
    iget-object v0, v1, La/ap2;->k:Ljava/lang/String;

    .line 1031
    .line 1032
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1033
    .line 1034
    .line 1035
    iget-object v0, v5, La/xyv;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1036
    .line 1037
    iget-object v3, v1, La/ap2;->i:Ljava/lang/String;

    .line 1038
    .line 1039
    const/16 v4, 0xb

    .line 1040
    .line 1041
    const/4 v6, 0x0

    .line 1042
    invoke-static {v0, v3, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1043
    .line 1044
    .line 1045
    iget-object v0, v5, La/xyv;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1046
    .line 1047
    iget-object v3, v1, La/ap2;->l:Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-static {v0, v3, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1050
    .line 1051
    .line 1052
    iget v0, v1, La/ap2;->s:I

    .line 1053
    .line 1054
    const/4 v1, 0x1

    .line 1055
    if-eq v0, v1, :cond_c

    .line 1056
    .line 1057
    const/4 v3, 0x2

    .line 1058
    if-eq v0, v3, :cond_b

    .line 1059
    .line 1060
    goto :goto_8

    .line 1061
    :cond_b
    move v0, v3

    .line 1062
    goto :goto_8

    .line 1063
    :cond_c
    const/4 v3, 0x2

    .line 1064
    move v0, v1

    .line 1065
    :goto_8
    const v4, 0x7f1314c6

    .line 1066
    .line 1067
    .line 1068
    const v6, 0x7f1314cb

    .line 1069
    .line 1070
    .line 1071
    if-eq v0, v1, :cond_10

    .line 1072
    .line 1073
    if-eq v0, v3, :cond_d

    .line 1074
    .line 1075
    goto :goto_d

    .line 1076
    :cond_d
    const/16 v0, 0x8

    .line 1077
    .line 1078
    invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1079
    .line 1080
    .line 1081
    const/4 v0, 0x0

    .line 1082
    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1083
    .line 1084
    .line 1085
    iget-object v0, v5, La/xyv;->j:Landroid/widget/TextView;

    .line 1086
    .line 1087
    if-eq v14, v1, :cond_f

    .line 1088
    .line 1089
    if-eq v14, v3, :cond_e

    .line 1090
    .line 1091
    :goto_9
    move-object/from16 v1, v17

    .line 1092
    .line 1093
    goto :goto_a

    .line 1094
    :cond_e
    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v17

    .line 1098
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1099
    .line 1100
    .line 1101
    goto :goto_9

    .line 1102
    :cond_f
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v17

    .line 1106
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    goto :goto_9

    .line 1110
    :goto_a
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1111
    .line 1112
    .line 1113
    goto :goto_d

    .line 1114
    :cond_10
    const/4 v0, 0x0

    .line 1115
    invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1116
    .line 1117
    .line 1118
    const/16 v0, 0x8

    .line 1119
    .line 1120
    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1121
    .line 1122
    .line 1123
    iget-object v0, v5, La/xyv;->i:Landroid/widget/TextView;

    .line 1124
    .line 1125
    const/4 v1, 0x1

    .line 1126
    if-eq v14, v1, :cond_12

    .line 1127
    .line 1128
    const/4 v3, 0x2

    .line 1129
    if-eq v14, v3, :cond_11

    .line 1130
    .line 1131
    :goto_b
    move-object/from16 v1, v17

    .line 1132
    .line 1133
    goto :goto_c

    .line 1134
    :cond_11
    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v17

    .line 1138
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    goto :goto_b

    .line 1142
    :cond_12
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v17

    .line 1146
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    goto :goto_b

    .line 1150
    :goto_c
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1151
    .line 1152
    .line 1153
    :goto_d
    invoke-static {}, La/cy7;->c()Z

    .line 1154
    .line 1155
    .line 1156
    move-result v0

    .line 1157
    if-eqz v0, :cond_13

    .line 1158
    .line 1159
    const v0, 0x800003

    .line 1160
    .line 1161
    .line 1162
    const v1, 0x800005

    .line 1163
    .line 1164
    .line 1165
    invoke-static {v13, v0, v1}, La/cy7;->b(Landroid/widget/TextView;II)V

    .line 1166
    .line 1167
    .line 1168
    invoke-static {v11, v0, v1}, La/cy7;->b(Landroid/widget/TextView;II)V

    .line 1169
    .line 1170
    .line 1171
    invoke-static {v9, v1, v0}, La/cy7;->b(Landroid/widget/TextView;II)V

    .line 1172
    .line 1173
    .line 1174
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1175
    .line 1176
    return-object v0

    .line 1177
    :pswitch_d
    move-object/from16 p0, v0

    .line 1178
    .line 1179
    move-object/from16 v0, p1

    .line 1180
    .line 1181
    check-cast v0, Ljava/util/List;

    .line 1182
    .line 1183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1184
    .line 1185
    .line 1186
    move-object/from16 v0, p0

    .line 1187
    .line 1188
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1189
    .line 1190
    move-object v2, v1

    .line 1191
    check-cast v2, La/wrx;

    .line 1192
    .line 1193
    iget-object v2, v2, La/wrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1194
    .line 1195
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v3

    .line 1199
    check-cast v3, La/c240;

    .line 1200
    .line 1201
    iget-object v3, v3, La/c240;->g:Ljava/lang/String;

    .line 1202
    .line 1203
    invoke-virtual {v2, v3}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->setTitle(Ljava/lang/String;)V

    .line 1204
    .line 1205
    .line 1206
    check-cast v1, La/wrx;

    .line 1207
    .line 1208
    iget-object v2, v1, La/wrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1209
    .line 1210
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    check-cast v3, La/c240;

    .line 1215
    .line 1216
    iget-object v3, v3, La/c240;->h:Ljava/lang/String;

    .line 1217
    .line 1218
    invoke-virtual {v2, v3}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->setSubtitle(Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    iget-object v1, v1, La/wrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1222
    .line 1223
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    check-cast v0, La/c240;

    .line 1228
    .line 1229
    iget-object v0, v0, La/c240;->f:Ljava/lang/String;

    .line 1230
    .line 1231
    invoke-virtual {v1, v0}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->setImageUrl(Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1235
    .line 1236
    return-object v0

    .line 1237
    :pswitch_e
    move-object/from16 v1, p1

    .line 1238
    .line 1239
    check-cast v1, Ljava/util/List;

    .line 1240
    .line 1241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1245
    .line 1246
    move-object v2, v1

    .line 1247
    check-cast v2, La/vrx;

    .line 1248
    .line 1249
    iget-object v2, v2, La/vrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1250
    .line 1251
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v3

    .line 1255
    check-cast v3, La/c240;

    .line 1256
    .line 1257
    iget-object v3, v3, La/c240;->g:Ljava/lang/String;

    .line 1258
    .line 1259
    invoke-virtual {v2, v3}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->setTitle(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    check-cast v1, La/vrx;

    .line 1263
    .line 1264
    iget-object v1, v1, La/vrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1265
    .line 1266
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    check-cast v0, La/c240;

    .line 1271
    .line 1272
    iget-object v0, v0, La/c240;->f:Ljava/lang/String;

    .line 1273
    .line 1274
    invoke-virtual {v1, v0}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->setImageUrl(Ljava/lang/String;)V

    .line 1275
    .line 1276
    .line 1277
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1278
    .line 1279
    return-object v0

    .line 1280
    :pswitch_f
    move-object/from16 v1, p1

    .line 1281
    .line 1282
    check-cast v1, Ljava/util/List;

    .line 1283
    .line 1284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1288
    .line 1289
    move-object v2, v1

    .line 1290
    check-cast v2, La/yt;

    .line 1291
    .line 1292
    iget-object v2, v2, La/yt;->c:Landroid/widget/TextView;

    .line 1293
    .line 1294
    iget-object v3, v0, La/cp;->w:Landroid/content/Context;

    .line 1295
    .line 1296
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v4

    .line 1300
    check-cast v4, La/xt;

    .line 1301
    .line 1302
    iget v4, v4, La/xt;->b:I

    .line 1303
    .line 1304
    invoke-virtual {v3, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v4

    .line 1308
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1309
    .line 1310
    .line 1311
    check-cast v1, La/yt;

    .line 1312
    .line 1313
    iget-object v1, v1, La/yt;->b:Landroid/widget/ImageView;

    .line 1314
    .line 1315
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    check-cast v0, La/xt;

    .line 1320
    .line 1321
    iget v0, v0, La/xt;->c:I

    .line 1322
    .line 1323
    invoke-static {v0, v3}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1328
    .line 1329
    .line 1330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1331
    .line 1332
    return-object v0

    .line 1333
    :pswitch_10
    move-object/from16 v1, p1

    .line 1334
    .line 1335
    check-cast v1, Ljava/util/List;

    .line 1336
    .line 1337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1338
    .line 1339
    .line 1340
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1341
    .line 1342
    check-cast v1, La/tp10;

    .line 1343
    .line 1344
    iget-object v2, v1, La/tp10;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1345
    .line 1346
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v3

    .line 1350
    check-cast v3, La/fl;

    .line 1351
    .line 1352
    iget v3, v3, La/fl;->e:I

    .line 1353
    .line 1354
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1355
    .line 1356
    .line 1357
    iget-object v2, v1, La/tp10;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1358
    .line 1359
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v3

    .line 1363
    check-cast v3, La/fl;

    .line 1364
    .line 1365
    iget-object v3, v3, La/fl;->c:Ljava/lang/String;

    .line 1366
    .line 1367
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    check-cast v0, La/fl;

    .line 1375
    .line 1376
    iget-object v0, v0, La/fl;->d:Ljava/lang/String;

    .line 1377
    .line 1378
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1379
    .line 1380
    .line 1381
    iget-object v0, v1, La/tp10;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1382
    .line 1383
    const/4 v1, 0x1

    .line 1384
    invoke-virtual {v0, v1}, La/tw5;->setFirst(Z)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v0, v1}, La/tw5;->setLast(Z)V

    .line 1388
    .line 1389
    .line 1390
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1391
    .line 1392
    return-object v0

    .line 1393
    :pswitch_11
    move-object/from16 v1, p1

    .line 1394
    .line 1395
    check-cast v1, Ljava/util/List;

    .line 1396
    .line 1397
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v3

    .line 1401
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v4

    .line 1405
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1406
    .line 1407
    .line 1408
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1409
    .line 1410
    check-cast v1, La/gux;

    .line 1411
    .line 1412
    iget-object v8, v1, La/gux;->c:Landroid/widget/TextView;

    .line 1413
    .line 1414
    iget-object v9, v1, La/gux;->d:Landroid/view/View;

    .line 1415
    .line 1416
    iget-object v10, v1, La/gux;->b:Landroid/widget/ImageView;

    .line 1417
    .line 1418
    iget-object v11, v0, La/cp;->w:Landroid/content/Context;

    .line 1419
    .line 1420
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v12

    .line 1424
    check-cast v12, La/mi;

    .line 1425
    .line 1426
    iget-object v12, v12, La/mi;->a:La/iui0;

    .line 1427
    .line 1428
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 1429
    .line 1430
    .line 1431
    move-result v12

    .line 1432
    if-eqz v12, :cond_15

    .line 1433
    .line 1434
    const/4 v15, 0x1

    .line 1435
    if-ne v12, v15, :cond_14

    .line 1436
    .line 1437
    goto :goto_e

    .line 1438
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 1439
    .line 1440
    .line 1441
    goto/16 :goto_11

    .line 1442
    .line 1443
    :cond_15
    const v6, 0x7f1312c4

    .line 1444
    .line 1445
    .line 1446
    :goto_e
    invoke-virtual {v11, v6}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v6

    .line 1450
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v6

    .line 1457
    check-cast v6, La/mi;

    .line 1458
    .line 1459
    iget-object v6, v6, La/mi;->a:La/iui0;

    .line 1460
    .line 1461
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 1462
    .line 1463
    .line 1464
    move-result v6

    .line 1465
    if-eqz v6, :cond_17

    .line 1466
    .line 1467
    const/4 v15, 0x1

    .line 1468
    if-ne v6, v15, :cond_16

    .line 1469
    .line 1470
    const v6, 0x7f080b67

    .line 1471
    .line 1472
    .line 1473
    goto :goto_f

    .line 1474
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 1475
    .line 1476
    .line 1477
    goto :goto_11

    .line 1478
    :cond_17
    const/4 v15, 0x1

    .line 1479
    const v6, 0x7f080b1b

    .line 1480
    .line 1481
    .line 1482
    :goto_f
    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v0

    .line 1489
    check-cast v0, La/mi;

    .line 1490
    .line 1491
    iget-object v0, v0, La/mi;->a:La/iui0;

    .line 1492
    .line 1493
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1494
    .line 1495
    .line 1496
    move-result v0

    .line 1497
    if-eqz v0, :cond_19

    .line 1498
    .line 1499
    if-ne v0, v15, :cond_18

    .line 1500
    .line 1501
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1502
    .line 1503
    invoke-virtual {v11, v7}, Landroid/content/Context;->getColor(I)I

    .line 1504
    .line 1505
    .line 1506
    move-result v0

    .line 1507
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v11, v7}, Landroid/content/Context;->getColor(I)I

    .line 1511
    .line 1512
    .line 1513
    move-result v0

    .line 1514
    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1515
    .line 1516
    .line 1517
    const/16 v0, 0x8

    .line 1518
    .line 1519
    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1520
    .line 1521
    .line 1522
    iget-object v0, v1, La/gux;->a:Landroid/widget/LinearLayout;

    .line 1523
    .line 1524
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1525
    .line 1526
    .line 1527
    invoke-static {v0, v4, v4, v13}, La/sj3;->M0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;I)V

    .line 1528
    .line 1529
    .line 1530
    goto :goto_10

    .line 1531
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 1532
    .line 1533
    .line 1534
    goto :goto_11

    .line 1535
    :cond_19
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1536
    .line 1537
    const/4 v0, 0x0

    .line 1538
    invoke-static {v11, v2, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1539
    .line 1540
    .line 1541
    move-result v2

    .line 1542
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1543
    .line 1544
    .line 1545
    invoke-static {v11, v14, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1546
    .line 1547
    .line 1548
    move-result v2

    .line 1549
    invoke-virtual {v10, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1553
    .line 1554
    .line 1555
    iget-object v0, v1, La/gux;->a:Landroid/widget/LinearLayout;

    .line 1556
    .line 1557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1558
    .line 1559
    .line 1560
    invoke-static {v0, v3, v3, v13}, La/sj3;->M0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;I)V

    .line 1561
    .line 1562
    .line 1563
    :goto_10
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1564
    .line 1565
    :goto_11
    return-object v5

    .line 1566
    :pswitch_12
    move-object/from16 v1, p1

    .line 1567
    .line 1568
    check-cast v1, Ljava/util/List;

    .line 1569
    .line 1570
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v3

    .line 1574
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v4

    .line 1578
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1579
    .line 1580
    .line 1581
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1582
    .line 1583
    check-cast v1, La/fux;

    .line 1584
    .line 1585
    iget-object v8, v1, La/fux;->c:Landroid/widget/TextView;

    .line 1586
    .line 1587
    iget-object v9, v1, La/fux;->d:Landroid/view/View;

    .line 1588
    .line 1589
    iget-object v10, v1, La/fux;->b:Landroid/widget/ImageView;

    .line 1590
    .line 1591
    iget-object v11, v0, La/cp;->w:Landroid/content/Context;

    .line 1592
    .line 1593
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v12

    .line 1597
    check-cast v12, La/li;

    .line 1598
    .line 1599
    iget-object v12, v12, La/li;->a:La/hui0;

    .line 1600
    .line 1601
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 1602
    .line 1603
    .line 1604
    move-result v12

    .line 1605
    if-eqz v12, :cond_1b

    .line 1606
    .line 1607
    const/4 v15, 0x1

    .line 1608
    if-ne v12, v15, :cond_1a

    .line 1609
    .line 1610
    goto :goto_12

    .line 1611
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 1612
    .line 1613
    .line 1614
    goto/16 :goto_15

    .line 1615
    .line 1616
    :cond_1b
    const v6, 0x7f1312c4

    .line 1617
    .line 1618
    .line 1619
    :goto_12
    invoke-virtual {v11, v6}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v6

    .line 1623
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v6

    .line 1630
    check-cast v6, La/li;

    .line 1631
    .line 1632
    iget-object v6, v6, La/li;->a:La/hui0;

    .line 1633
    .line 1634
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 1635
    .line 1636
    .line 1637
    move-result v6

    .line 1638
    if-eqz v6, :cond_1d

    .line 1639
    .line 1640
    const/4 v15, 0x1

    .line 1641
    if-ne v6, v15, :cond_1c

    .line 1642
    .line 1643
    const v6, 0x7f080b67

    .line 1644
    .line 1645
    .line 1646
    goto :goto_13

    .line 1647
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1648
    .line 1649
    .line 1650
    goto :goto_15

    .line 1651
    :cond_1d
    const/4 v15, 0x1

    .line 1652
    const v6, 0x7f080b1b

    .line 1653
    .line 1654
    .line 1655
    :goto_13
    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v0

    .line 1662
    check-cast v0, La/li;

    .line 1663
    .line 1664
    iget-object v0, v0, La/li;->a:La/hui0;

    .line 1665
    .line 1666
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1667
    .line 1668
    .line 1669
    move-result v0

    .line 1670
    if-eqz v0, :cond_1f

    .line 1671
    .line 1672
    if-ne v0, v15, :cond_1e

    .line 1673
    .line 1674
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1675
    .line 1676
    invoke-virtual {v11, v7}, Landroid/content/Context;->getColor(I)I

    .line 1677
    .line 1678
    .line 1679
    move-result v0

    .line 1680
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v11, v7}, Landroid/content/Context;->getColor(I)I

    .line 1684
    .line 1685
    .line 1686
    move-result v0

    .line 1687
    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1688
    .line 1689
    .line 1690
    const/16 v0, 0x8

    .line 1691
    .line 1692
    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1693
    .line 1694
    .line 1695
    iget-object v0, v1, La/fux;->a:Landroid/widget/LinearLayout;

    .line 1696
    .line 1697
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    invoke-static {v0, v4, v4, v13}, La/sj3;->M0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;I)V

    .line 1701
    .line 1702
    .line 1703
    goto :goto_14

    .line 1704
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 1705
    .line 1706
    .line 1707
    goto :goto_15

    .line 1708
    :cond_1f
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1709
    .line 1710
    const/4 v0, 0x0

    .line 1711
    invoke-static {v11, v2, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1712
    .line 1713
    .line 1714
    move-result v2

    .line 1715
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1716
    .line 1717
    .line 1718
    invoke-static {v11, v14, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1719
    .line 1720
    .line 1721
    move-result v2

    .line 1722
    invoke-virtual {v10, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1726
    .line 1727
    .line 1728
    iget-object v0, v1, La/fux;->a:Landroid/widget/LinearLayout;

    .line 1729
    .line 1730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1731
    .line 1732
    .line 1733
    invoke-static {v0, v3, v3, v13}, La/sj3;->M0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;I)V

    .line 1734
    .line 1735
    .line 1736
    :goto_14
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1737
    .line 1738
    :goto_15
    return-object v5

    .line 1739
    :pswitch_13
    move-object/from16 v1, p1

    .line 1740
    .line 1741
    check-cast v1, Ljava/util/List;

    .line 1742
    .line 1743
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1744
    .line 1745
    .line 1746
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v1

    .line 1750
    check-cast v1, La/cc;

    .line 1751
    .line 1752
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1753
    .line 1754
    check-cast v0, La/krx;

    .line 1755
    .line 1756
    iget-object v2, v0, La/krx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1757
    .line 1758
    iget v3, v1, La/cc;->b:I

    .line 1759
    .line 1760
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1761
    .line 1762
    .line 1763
    iget-object v2, v0, La/krx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1764
    .line 1765
    iget-object v3, v1, La/cc;->c:Ljava/lang/String;

    .line 1766
    .line 1767
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1768
    .line 1769
    .line 1770
    iget-object v0, v0, La/krx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightAccordion;

    .line 1771
    .line 1772
    iget-boolean v1, v1, La/cc;->d:Z

    .line 1773
    .line 1774
    sget v2, Lorg/xplatform/uikit/components/accordion/DsAccordion;->c:I

    .line 1775
    .line 1776
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 1777
    .line 1778
    .line 1779
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1780
    .line 1781
    return-object v0

    .line 1782
    :pswitch_14
    move-object/from16 v1, p1

    .line 1783
    .line 1784
    check-cast v1, Ljava/util/List;

    .line 1785
    .line 1786
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1787
    .line 1788
    .line 1789
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1790
    .line 1791
    move-object v2, v1

    .line 1792
    check-cast v2, La/rrx;

    .line 1793
    .line 1794
    iget-object v2, v2, La/rrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1795
    .line 1796
    invoke-static {v2}, La/hxm0;->w(Landroid/widget/ImageView;)V

    .line 1797
    .line 1798
    .line 1799
    check-cast v1, La/rrx;

    .line 1800
    .line 1801
    iget-object v2, v1, La/rrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1802
    .line 1803
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v3

    .line 1807
    check-cast v3, La/d240;

    .line 1808
    .line 1809
    iget-object v3, v3, La/d240;->f:Ljava/lang/String;

    .line 1810
    .line 1811
    const v4, 0x7f0809b3

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v2, v4, v5, v5, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1815
    .line 1816
    .line 1817
    iget-object v2, v1, La/rrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1818
    .line 1819
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v3

    .line 1823
    check-cast v3, La/d240;

    .line 1824
    .line 1825
    iget-boolean v3, v3, La/d240;->a:Z

    .line 1826
    .line 1827
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1828
    .line 1829
    .line 1830
    iget-object v1, v1, La/rrx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1831
    .line 1832
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v0

    .line 1836
    check-cast v0, La/d240;

    .line 1837
    .line 1838
    iget-object v0, v0, La/d240;->g:Ljava/lang/String;

    .line 1839
    .line 1840
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1841
    .line 1842
    .line 1843
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1844
    .line 1845
    return-object v0

    .line 1846
    :pswitch_15
    move-object/from16 v1, p1

    .line 1847
    .line 1848
    check-cast v1, Ljava/util/List;

    .line 1849
    .line 1850
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1851
    .line 1852
    .line 1853
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v1

    .line 1857
    check-cast v1, La/b240;

    .line 1858
    .line 1859
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1860
    .line 1861
    check-cast v0, La/nrx;

    .line 1862
    .line 1863
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1864
    .line 1865
    iget v3, v1, La/b240;->d:I

    .line 1866
    .line 1867
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1868
    .line 1869
    .line 1870
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1871
    .line 1872
    iget-boolean v3, v1, La/b240;->b:Z

    .line 1873
    .line 1874
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1875
    .line 1876
    .line 1877
    iget-object v2, v0, La/nrx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1878
    .line 1879
    iget-object v3, v1, La/b240;->e:Ljava/lang/String;

    .line 1880
    .line 1881
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1882
    .line 1883
    .line 1884
    iget-object v3, v1, La/b240;->f:Ljava/lang/String;

    .line 1885
    .line 1886
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1887
    .line 1888
    .line 1889
    iget-object v0, v0, La/nrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1890
    .line 1891
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1892
    .line 1893
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v3

    .line 1897
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1898
    .line 1899
    .line 1900
    iget-object v4, v1, La/b240;->g:Ljava/lang/String;

    .line 1901
    .line 1902
    new-instance v8, La/k9;

    .line 1903
    .line 1904
    const/4 v1, 0x6

    .line 1905
    invoke-direct {v8, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1906
    .line 1907
    .line 1908
    new-instance v9, La/k9;

    .line 1909
    .line 1910
    const/4 v1, 0x7

    .line 1911
    invoke-direct {v9, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1912
    .line 1913
    .line 1914
    const/16 v10, 0xe

    .line 1915
    .line 1916
    const/4 v5, 0x0

    .line 1917
    const/4 v6, 0x0

    .line 1918
    const/4 v7, 0x0

    .line 1919
    invoke-static/range {v3 .. v10}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1920
    .line 1921
    .line 1922
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1923
    .line 1924
    return-object v0

    .line 1925
    :pswitch_16
    move-object/from16 v1, p1

    .line 1926
    .line 1927
    check-cast v1, Ljava/util/List;

    .line 1928
    .line 1929
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v1

    .line 1936
    check-cast v1, La/a240;

    .line 1937
    .line 1938
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1939
    .line 1940
    check-cast v0, La/qrx;

    .line 1941
    .line 1942
    iget-object v2, v0, La/qrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1943
    .line 1944
    iget v3, v1, La/a240;->d:I

    .line 1945
    .line 1946
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1947
    .line 1948
    .line 1949
    iget-object v2, v0, La/qrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1950
    .line 1951
    iget-boolean v3, v1, La/a240;->b:Z

    .line 1952
    .line 1953
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1954
    .line 1955
    .line 1956
    iget-object v2, v0, La/qrx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1957
    .line 1958
    iget-object v3, v1, La/a240;->e:Ljava/lang/String;

    .line 1959
    .line 1960
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1961
    .line 1962
    .line 1963
    iget-object v3, v1, La/a240;->f:Ljava/lang/String;

    .line 1964
    .line 1965
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1966
    .line 1967
    .line 1968
    iget-object v0, v0, La/qrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 1969
    .line 1970
    iget v1, v1, La/a240;->g:I

    .line 1971
    .line 1972
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v1

    .line 1976
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCount(Ljava/lang/Integer;)V

    .line 1977
    .line 1978
    .line 1979
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1980
    .line 1981
    return-object v0

    .line 1982
    :pswitch_17
    move-object/from16 v1, p1

    .line 1983
    .line 1984
    check-cast v1, Ljava/util/List;

    .line 1985
    .line 1986
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1987
    .line 1988
    .line 1989
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v1

    .line 1993
    check-cast v1, La/x140;

    .line 1994
    .line 1995
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 1996
    .line 1997
    check-cast v2, La/prx;

    .line 1998
    .line 1999
    iget-object v3, v2, La/prx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2000
    .line 2001
    sget-object v4, La/j5d;->a:Landroid/util/TypedValue;

    .line 2002
    .line 2003
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 2004
    .line 2005
    const v4, 0x7f040b0b

    .line 2006
    .line 2007
    .line 2008
    const/4 v6, 0x0

    .line 2009
    invoke-static {v0, v4, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2010
    .line 2011
    .line 2012
    move-result v7

    .line 2013
    invoke-virtual {v3, v7}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 2014
    .line 2015
    .line 2016
    iget-object v14, v2, La/prx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2017
    .line 2018
    const v3, 0x7f080f06

    .line 2019
    .line 2020
    .line 2021
    invoke-virtual {v14, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2022
    .line 2023
    .line 2024
    iget-object v15, v1, La/x140;->f:Ljava/lang/String;

    .line 2025
    .line 2026
    iget-object v7, v1, La/x140;->e:Ljava/lang/String;

    .line 2027
    .line 2028
    invoke-static {v0, v12, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2029
    .line 2030
    .line 2031
    move-result v8

    .line 2032
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v17

    .line 2036
    const v8, 0x7f040ae1

    .line 2037
    .line 2038
    .line 2039
    invoke-static {v0, v8, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2040
    .line 2041
    .line 2042
    move-result v8

    .line 2043
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v18

    .line 2047
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v19

    .line 2051
    invoke-static {v0, v4, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2052
    .line 2053
    .line 2054
    move-result v0

    .line 2055
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v20

    .line 2059
    move-object/from16 v16, v7

    .line 2060
    .line 2061
    invoke-virtual/range {v14 .. v20}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 2062
    .line 2063
    .line 2064
    iget-boolean v0, v1, La/x140;->a:Z

    .line 2065
    .line 2066
    invoke-virtual {v14, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 2067
    .line 2068
    .line 2069
    iget-object v0, v2, La/prx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2070
    .line 2071
    iget-object v3, v1, La/x140;->g:Ljava/lang/String;

    .line 2072
    .line 2073
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2074
    .line 2075
    .line 2076
    iget-object v3, v1, La/x140;->h:Ljava/lang/String;

    .line 2077
    .line 2078
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2079
    .line 2080
    .line 2081
    iget-object v0, v2, La/prx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 2082
    .line 2083
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2084
    .line 2085
    .line 2086
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 2087
    .line 2088
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v3

    .line 2092
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    .line 2094
    .line 2095
    iget-object v4, v1, La/x140;->i:Ljava/lang/String;

    .line 2096
    .line 2097
    new-instance v8, La/k9;

    .line 2098
    .line 2099
    invoke-direct {v8, v0, v11}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 2100
    .line 2101
    .line 2102
    new-instance v9, La/k9;

    .line 2103
    .line 2104
    invoke-direct {v9, v0, v13}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 2105
    .line 2106
    .line 2107
    const/16 v10, 0xe

    .line 2108
    .line 2109
    const/4 v5, 0x0

    .line 2110
    const/4 v6, 0x0

    .line 2111
    const/4 v7, 0x0

    .line 2112
    invoke-static/range {v3 .. v10}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 2113
    .line 2114
    .line 2115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2116
    .line 2117
    return-object v0

    .line 2118
    :pswitch_18
    move-object/from16 v1, p1

    .line 2119
    .line 2120
    check-cast v1, Ljava/util/List;

    .line 2121
    .line 2122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2123
    .line 2124
    .line 2125
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v1

    .line 2129
    check-cast v1, La/v140;

    .line 2130
    .line 2131
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2132
    .line 2133
    check-cast v0, La/nrx;

    .line 2134
    .line 2135
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2136
    .line 2137
    iget v3, v1, La/v140;->d:I

    .line 2138
    .line 2139
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2140
    .line 2141
    .line 2142
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2143
    .line 2144
    iget-boolean v3, v1, La/v140;->b:Z

    .line 2145
    .line 2146
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 2147
    .line 2148
    .line 2149
    iget-object v2, v0, La/nrx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2150
    .line 2151
    iget-object v3, v1, La/v140;->e:Ljava/lang/String;

    .line 2152
    .line 2153
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2154
    .line 2155
    .line 2156
    iget-object v3, v1, La/v140;->f:Ljava/lang/String;

    .line 2157
    .line 2158
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2159
    .line 2160
    .line 2161
    iget-object v0, v0, La/nrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 2162
    .line 2163
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 2164
    .line 2165
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v3

    .line 2169
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2170
    .line 2171
    .line 2172
    iget-object v4, v1, La/v140;->g:Ljava/lang/String;

    .line 2173
    .line 2174
    new-instance v8, La/k9;

    .line 2175
    .line 2176
    const/4 v1, 0x2

    .line 2177
    invoke-direct {v8, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 2178
    .line 2179
    .line 2180
    new-instance v9, La/k9;

    .line 2181
    .line 2182
    const/4 v1, 0x3

    .line 2183
    invoke-direct {v9, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 2184
    .line 2185
    .line 2186
    const/16 v10, 0xe

    .line 2187
    .line 2188
    const/4 v5, 0x0

    .line 2189
    const/4 v6, 0x0

    .line 2190
    const/4 v7, 0x0

    .line 2191
    invoke-static/range {v3 .. v10}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 2192
    .line 2193
    .line 2194
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2195
    .line 2196
    return-object v0

    .line 2197
    :pswitch_19
    move-object/from16 v1, p1

    .line 2198
    .line 2199
    check-cast v1, Ljava/util/List;

    .line 2200
    .line 2201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2202
    .line 2203
    .line 2204
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v1

    .line 2208
    check-cast v1, La/w140;

    .line 2209
    .line 2210
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2211
    .line 2212
    check-cast v0, La/orx;

    .line 2213
    .line 2214
    iget-object v2, v0, La/orx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2215
    .line 2216
    iget v3, v1, La/w140;->d:I

    .line 2217
    .line 2218
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2219
    .line 2220
    .line 2221
    iget-object v2, v0, La/orx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2222
    .line 2223
    iget-boolean v3, v1, La/w140;->b:Z

    .line 2224
    .line 2225
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 2226
    .line 2227
    .line 2228
    iget-object v0, v0, La/orx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2229
    .line 2230
    iget-object v2, v1, La/w140;->e:Ljava/lang/String;

    .line 2231
    .line 2232
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2233
    .line 2234
    .line 2235
    iget-object v1, v1, La/w140;->f:Ljava/lang/String;

    .line 2236
    .line 2237
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2238
    .line 2239
    .line 2240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2241
    .line 2242
    return-object v0

    .line 2243
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2244
    .line 2245
    check-cast v1, Ljava/util/List;

    .line 2246
    .line 2247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2248
    .line 2249
    .line 2250
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v1

    .line 2254
    check-cast v1, La/n140;

    .line 2255
    .line 2256
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2257
    .line 2258
    check-cast v0, La/nrx;

    .line 2259
    .line 2260
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2261
    .line 2262
    iget v3, v1, La/n140;->d:I

    .line 2263
    .line 2264
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2265
    .line 2266
    .line 2267
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2268
    .line 2269
    iget-boolean v3, v1, La/n140;->b:Z

    .line 2270
    .line 2271
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 2272
    .line 2273
    .line 2274
    iget-object v2, v0, La/nrx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2275
    .line 2276
    iget-object v3, v1, La/n140;->e:Ljava/lang/String;

    .line 2277
    .line 2278
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2279
    .line 2280
    .line 2281
    iget-object v3, v1, La/n140;->f:Ljava/lang/String;

    .line 2282
    .line 2283
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2284
    .line 2285
    .line 2286
    iget-object v0, v0, La/nrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 2287
    .line 2288
    iget v1, v1, La/n140;->g:I

    .line 2289
    .line 2290
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 2291
    .line 2292
    .line 2293
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2294
    .line 2295
    return-object v0

    .line 2296
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2297
    .line 2298
    check-cast v1, Ljava/util/List;

    .line 2299
    .line 2300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2301
    .line 2302
    .line 2303
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v1

    .line 2307
    check-cast v1, La/k140;

    .line 2308
    .line 2309
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2310
    .line 2311
    check-cast v0, La/mrx;

    .line 2312
    .line 2313
    iget-object v2, v0, La/mrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2314
    .line 2315
    iget v3, v1, La/k140;->f:I

    .line 2316
    .line 2317
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2318
    .line 2319
    .line 2320
    iget-object v2, v0, La/mrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2321
    .line 2322
    iget-boolean v3, v1, La/k140;->b:Z

    .line 2323
    .line 2324
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 2325
    .line 2326
    .line 2327
    iget v3, v1, La/k140;->d:I

    .line 2328
    .line 2329
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeBackgroundTint(I)V

    .line 2330
    .line 2331
    .line 2332
    iget v3, v1, La/k140;->h:I

    .line 2333
    .line 2334
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconBackgroundTint(I)V

    .line 2335
    .line 2336
    .line 2337
    iget-object v2, v0, La/mrx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2338
    .line 2339
    iget-object v3, v1, La/k140;->i:Ljava/lang/String;

    .line 2340
    .line 2341
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2342
    .line 2343
    .line 2344
    iget-object v3, v1, La/k140;->j:Ljava/lang/String;

    .line 2345
    .line 2346
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2347
    .line 2348
    .line 2349
    iget-object v2, v0, La/mrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 2350
    .line 2351
    iget v3, v1, La/k140;->k:I

    .line 2352
    .line 2353
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 2354
    .line 2355
    .line 2356
    iget-object v3, v1, La/k140;->n:Landroid/graphics/ColorFilter;

    .line 2357
    .line 2358
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 2359
    .line 2360
    .line 2361
    iget-object v0, v0, La/mrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 2362
    .line 2363
    iget v1, v1, La/k140;->l:I

    .line 2364
    .line 2365
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2366
    .line 2367
    .line 2368
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2369
    .line 2370
    return-object v0

    .line 2371
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2372
    .line 2373
    check-cast v1, Ljava/util/List;

    .line 2374
    .line 2375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2376
    .line 2377
    .line 2378
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v1

    .line 2382
    check-cast v1, La/j140;

    .line 2383
    .line 2384
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2385
    .line 2386
    check-cast v0, La/nrx;

    .line 2387
    .line 2388
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2389
    .line 2390
    iget v3, v1, La/j140;->d:I

    .line 2391
    .line 2392
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2393
    .line 2394
    .line 2395
    iget-object v2, v0, La/nrx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2396
    .line 2397
    iget-boolean v3, v1, La/j140;->b:Z

    .line 2398
    .line 2399
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 2400
    .line 2401
    .line 2402
    iget-object v2, v0, La/nrx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2403
    .line 2404
    iget-object v3, v1, La/j140;->e:Ljava/lang/String;

    .line 2405
    .line 2406
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2407
    .line 2408
    .line 2409
    iget-object v3, v1, La/j140;->f:Ljava/lang/String;

    .line 2410
    .line 2411
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2412
    .line 2413
    .line 2414
    iget-object v0, v0, La/nrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 2415
    .line 2416
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 2417
    .line 2418
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v3

    .line 2422
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2423
    .line 2424
    .line 2425
    iget-object v4, v1, La/j140;->g:Ljava/lang/String;

    .line 2426
    .line 2427
    new-instance v8, La/k9;

    .line 2428
    .line 2429
    const/4 v6, 0x0

    .line 2430
    invoke-direct {v8, v0, v6}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 2431
    .line 2432
    .line 2433
    new-instance v9, La/k9;

    .line 2434
    .line 2435
    const/4 v15, 0x1

    .line 2436
    invoke-direct {v9, v0, v15}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 2437
    .line 2438
    .line 2439
    const/16 v10, 0xe

    .line 2440
    .line 2441
    const/4 v5, 0x0

    .line 2442
    const/4 v6, 0x0

    .line 2443
    const/4 v7, 0x0

    .line 2444
    invoke-static/range {v3 .. v10}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 2445
    .line 2446
    .line 2447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2448
    .line 2449
    return-object v0

    .line 2450
    nop

    .line 2451
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
