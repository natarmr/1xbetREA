.class public final synthetic La/a8u0;
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
    iput-byte p2, p0, La/a8u0;->a:B

    iput-object p1, p0, La/a8u0;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/a8u0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/a8u0;->b:La/cp;

    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/e240;

    .line 19
    .line 20
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    check-cast p0, La/bzx;

    .line 23
    .line 24
    iget-object v0, p0, La/bzx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 25
    .line 26
    iget v2, p1, La/e240;->d:I

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, La/bzx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 32
    .line 33
    iget-boolean v2, p1, La/e240;->a:Z

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La/bzx;->f:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 39
    .line 40
    iget-object v2, p1, La/e240;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p1, La/e240;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/bzx;->c:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 51
    .line 52
    iget-object p1, p1, La/e240;->g:Ljava/util/List;

    .line 53
    .line 54
    sget v0, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast p0, La/o4s;

    .line 64
    .line 65
    invoke-virtual {p0, p1, v1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 75
    .line 76
    move-object v0, p1

    .line 77
    check-cast v0, La/azx;

    .line 78
    .line 79
    iget-object v0, v0, La/azx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 80
    .line 81
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, La/e240;

    .line 86
    .line 87
    iget v2, v2, La/e240;->d:I

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 90
    .line 91
    .line 92
    check-cast p1, La/azx;

    .line 93
    .line 94
    iget-object v0, p1, La/azx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 95
    .line 96
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, La/e240;

    .line 101
    .line 102
    iget-boolean v2, v2, La/e240;->a:Z

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p1, La/azx;->f:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 108
    .line 109
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, La/e240;

    .line 114
    .line 115
    iget-object v2, v2, La/e240;->e:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, La/e240;

    .line 125
    .line 126
    iget-object v2, v2, La/e240;->f:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p1, La/azx;->c:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 132
    .line 133
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, La/e240;

    .line 138
    .line 139
    iget-object p0, p0, La/e240;->g:Ljava/util/List;

    .line 140
    .line 141
    sget v0, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 142
    .line 143
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    check-cast p1, La/o4s;

    .line 151
    .line 152
    invoke-virtual {p1, p0, v1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 162
    .line 163
    move-object v0, p1

    .line 164
    check-cast v0, La/q3w;

    .line 165
    .line 166
    iget-object v0, v0, La/q3w;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 167
    .line 168
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, La/pgv0;

    .line 173
    .line 174
    iget-object v1, v1, La/pgv0;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, La/pgv0;

    .line 184
    .line 185
    iget-object v1, v1, La/pgv0;->b:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    check-cast p1, La/q3w;

    .line 191
    .line 192
    iget-object v1, p1, La/q3w;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const v2, 0x7f0606da

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleTextColor(I)V

    .line 206
    .line 207
    .line 208
    iget-object v1, p1, La/q3w;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    const v3, 0x7f0606e2

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v3}, Landroid/content/Context;->getColor(I)I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleTextColor(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, La/pgv0;

    .line 232
    .line 233
    iget-object v0, v0, La/pgv0;->d:Landroid/content/res/ColorStateList;

    .line 234
    .line 235
    invoke-static {v1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 236
    .line 237
    .line 238
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 239
    .line 240
    iget-object v1, p1, La/q3w;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 241
    .line 242
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, La/pgv0;

    .line 247
    .line 248
    iget-object v2, p0, La/pgv0;->c:Ljava/lang/String;

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    const/16 v8, 0x1fe

    .line 252
    .line 253
    const/4 v3, 0x0

    .line 254
    const/4 v4, 0x0

    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 267
    .line 268
    move-object v0, p1

    .line 269
    check-cast v0, La/mev0;

    .line 270
    .line 271
    iget-object v0, v0, La/mev0;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 272
    .line 273
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    check-cast v1, La/lev0;

    .line 278
    .line 279
    iget-object v1, v1, La/lev0;->b:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    check-cast p1, La/mev0;

    .line 285
    .line 286
    iget-object v0, p1, La/mev0;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 287
    .line 288
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, La/lev0;

    .line 293
    .line 294
    iget-boolean v1, v1, La/lev0;->d:Z

    .line 295
    .line 296
    invoke-virtual {v0, v1}, La/tw5;->setFirst(Z)V

    .line 297
    .line 298
    .line 299
    iget-object v0, p1, La/mev0;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 300
    .line 301
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, La/lev0;

    .line 306
    .line 307
    iget-boolean v1, v1, La/lev0;->e:Z

    .line 308
    .line 309
    invoke-virtual {v0, v1}, La/tw5;->setLast(Z)V

    .line 310
    .line 311
    .line 312
    iget-object p1, p1, La/mev0;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 313
    .line 314
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    check-cast p0, La/lev0;

    .line 319
    .line 320
    iget p0, p0, La/lev0;->c:I

    .line 321
    .line 322
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 323
    .line 324
    .line 325
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object p0

    .line 328
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 332
    .line 333
    check-cast p1, La/cqv;

    .line 334
    .line 335
    iget-object p1, p1, La/cqv;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 336
    .line 337
    new-instance v0, La/nrv;

    .line 338
    .line 339
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    check-cast p0, La/dev0;

    .line 344
    .line 345
    iget-object v1, p0, La/dev0;->a:Ljava/lang/String;

    .line 346
    .line 347
    const/4 v7, 0x0

    .line 348
    const/16 v8, 0xfe

    .line 349
    .line 350
    const/4 v2, 0x0

    .line 351
    const/4 v3, 0x0

    .line 352
    const/4 v4, 0x0

    .line 353
    const/4 v5, 0x0

    .line 354
    const/4 v6, 0x0

    .line 355
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 359
    .line 360
    .line 361
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object p0

    .line 364
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 368
    .line 369
    move-object v0, p1

    .line 370
    check-cast v0, La/jtx;

    .line 371
    .line 372
    iget-object v0, v0, La/jtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 373
    .line 374
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    check-cast v1, La/d240;

    .line 379
    .line 380
    iget-object v1, v1, La/d240;->g:Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    check-cast p1, La/jtx;

    .line 386
    .line 387
    iget-object v0, p1, La/jtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 388
    .line 389
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    check-cast v1, La/d240;

    .line 394
    .line 395
    iget-object v1, v1, La/d240;->f:Ljava/lang/String;

    .line 396
    .line 397
    const v2, 0x7f0806ec

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->v(ILjava/lang/String;)V

    .line 401
    .line 402
    .line 403
    iget-object p1, p1, La/jtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 404
    .line 405
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    check-cast p0, La/d240;

    .line 410
    .line 411
    iget-boolean p0, p0, La/d240;->a:Z

    .line 412
    .line 413
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 414
    .line 415
    .line 416
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    return-object p0

    .line 419
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 423
    .line 424
    move-object v0, p1

    .line 425
    check-cast v0, La/yyx;

    .line 426
    .line 427
    iget-object v0, v0, La/yyx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 428
    .line 429
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    check-cast v2, La/d240;

    .line 434
    .line 435
    iget-object v2, v2, La/d240;->f:Ljava/lang/String;

    .line 436
    .line 437
    const v3, 0x7f0809b3

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v3, v1, v1, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    check-cast p1, La/yyx;

    .line 444
    .line 445
    iget-object v0, p1, La/yyx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 446
    .line 447
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    check-cast v1, La/d240;

    .line 452
    .line 453
    iget-boolean v1, v1, La/d240;->a:Z

    .line 454
    .line 455
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 456
    .line 457
    .line 458
    iget-object p1, p1, La/yyx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 459
    .line 460
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    check-cast p0, La/d240;

    .line 465
    .line 466
    iget-object p0, p0, La/d240;->g:Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 469
    .line 470
    .line 471
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 478
    .line 479
    move-object v0, p1

    .line 480
    check-cast v0, La/ztx;

    .line 481
    .line 482
    iget-object v0, v0, La/ztx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 483
    .line 484
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    check-cast v1, La/m140;

    .line 489
    .line 490
    iget v1, v1, La/m140;->d:I

    .line 491
    .line 492
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 493
    .line 494
    .line 495
    check-cast p1, La/ztx;

    .line 496
    .line 497
    iget-object v0, p1, La/ztx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 498
    .line 499
    iget-object v1, p0, La/cp;->w:Landroid/content/Context;

    .line 500
    .line 501
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    check-cast v2, La/m140;

    .line 506
    .line 507
    iget v2, v2, La/m140;->f:I

    .line 508
    .line 509
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 518
    .line 519
    .line 520
    iget-object p1, p1, La/ztx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 521
    .line 522
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    check-cast v0, La/m140;

    .line 527
    .line 528
    iget v0, v0, La/m140;->j:I

    .line 529
    .line 530
    invoke-static {v0, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-static {p1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    check-cast v0, La/m140;

    .line 546
    .line 547
    iget-object v0, v0, La/m140;->g:Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    check-cast v0, La/m140;

    .line 557
    .line 558
    iget-object v0, v0, La/m140;->h:Ljava/lang/String;

    .line 559
    .line 560
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    check-cast p0, La/m140;

    .line 568
    .line 569
    iget-boolean p0, p0, La/m140;->b:Z

    .line 570
    .line 571
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 572
    .line 573
    .line 574
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object p0

    .line 577
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 581
    .line 582
    move-object v0, p1

    .line 583
    check-cast v0, La/aux;

    .line 584
    .line 585
    iget-object v0, v0, La/aux;->b:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 586
    .line 587
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    iget-object v1, p0, La/cp;->w:Landroid/content/Context;

    .line 591
    .line 592
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    check-cast v2, La/m140;

    .line 597
    .line 598
    iget v2, v2, La/m140;->j:I

    .line 599
    .line 600
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static {v0, v2}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 609
    .line 610
    .line 611
    check-cast p1, La/aux;

    .line 612
    .line 613
    iget-object v0, p1, La/aux;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 614
    .line 615
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    check-cast v2, La/m140;

    .line 620
    .line 621
    iget v2, v2, La/m140;->d:I

    .line 622
    .line 623
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 624
    .line 625
    .line 626
    iget-object v0, p1, La/aux;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 627
    .line 628
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    check-cast v2, La/m140;

    .line 633
    .line 634
    iget v2, v2, La/m140;->e:I

    .line 635
    .line 636
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    check-cast v1, La/m140;

    .line 652
    .line 653
    iget v1, v1, La/m140;->f:I

    .line 654
    .line 655
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconBackgroundTint(I)V

    .line 656
    .line 657
    .line 658
    iget-object v1, p1, La/aux;->e:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 659
    .line 660
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    check-cast v2, La/m140;

    .line 665
    .line 666
    iget-object v2, v2, La/m140;->g:Ljava/lang/String;

    .line 667
    .line 668
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    check-cast v2, La/m140;

    .line 676
    .line 677
    iget-object v2, v2, La/m140;->h:Ljava/lang/String;

    .line 678
    .line 679
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 680
    .line 681
    .line 682
    iget-object p1, p1, La/aux;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 683
    .line 684
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    check-cast v1, La/m140;

    .line 689
    .line 690
    iget v1, v1, La/m140;->i:I

    .line 691
    .line 692
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p0

    .line 699
    check-cast p0, La/m140;

    .line 700
    .line 701
    iget-boolean p0, p0, La/m140;->b:Z

    .line 702
    .line 703
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 704
    .line 705
    .line 706
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    return-object p0

    .line 709
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object p1

    .line 716
    check-cast p1, La/m140;

    .line 717
    .line 718
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 719
    .line 720
    check-cast p0, La/zvx;

    .line 721
    .line 722
    iget-object v0, p0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 723
    .line 724
    iget v1, p1, La/m140;->d:I

    .line 725
    .line 726
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 727
    .line 728
    .line 729
    iget-object v0, p0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 730
    .line 731
    iget-boolean v1, p1, La/m140;->b:Z

    .line 732
    .line 733
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 734
    .line 735
    .line 736
    iget-object p0, p0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 737
    .line 738
    iget-object v0, p1, La/m140;->g:Ljava/lang/String;

    .line 739
    .line 740
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 741
    .line 742
    .line 743
    iget-object p1, p1, La/m140;->h:Ljava/lang/String;

    .line 744
    .line 745
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 746
    .line 747
    .line 748
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 749
    .line 750
    return-object p0

    .line 751
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 755
    .line 756
    move-object v0, p1

    .line 757
    check-cast v0, La/b8u0;

    .line 758
    .line 759
    iget-object v0, v0, La/b8u0;->e:Landroid/widget/TextView;

    .line 760
    .line 761
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    check-cast v2, La/g8u0;

    .line 766
    .line 767
    iget-object v2, v2, La/g8u0;->b:Ljava/lang/String;

    .line 768
    .line 769
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 770
    .line 771
    .line 772
    check-cast p1, La/b8u0;

    .line 773
    .line 774
    iget-object v0, p1, La/b8u0;->f:Landroid/widget/TextView;

    .line 775
    .line 776
    iget-object v2, p1, La/b8u0;->d:Landroid/widget/ImageView;

    .line 777
    .line 778
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    check-cast v3, La/g8u0;

    .line 783
    .line 784
    iget-object v3, v3, La/g8u0;->c:Ljava/lang/String;

    .line 785
    .line 786
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 787
    .line 788
    .line 789
    iget-object p1, p1, La/b8u0;->b:Landroid/widget/TextView;

    .line 790
    .line 791
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    check-cast v0, La/g8u0;

    .line 796
    .line 797
    iget-object v0, v0, La/g8u0;->f:Ljava/lang/String;

    .line 798
    .line 799
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object p1

    .line 806
    check-cast p1, La/g8u0;

    .line 807
    .line 808
    iget-object p1, p1, La/g8u0;->d:Ljava/lang/String;

    .line 809
    .line 810
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 811
    .line 812
    .line 813
    move-result p1

    .line 814
    if-lez p1, :cond_0

    .line 815
    .line 816
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 817
    .line 818
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    check-cast p1, La/g8u0;

    .line 823
    .line 824
    iget-object v3, p1, La/g8u0;->d:Ljava/lang/String;

    .line 825
    .line 826
    const/4 v8, 0x0

    .line 827
    const/16 v9, 0x1fc

    .line 828
    .line 829
    const v4, 0x7f080f81

    .line 830
    .line 831
    .line 832
    const/4 v5, 0x0

    .line 833
    const/4 v6, 0x0

    .line 834
    const/4 v7, 0x0

    .line 835
    invoke-static/range {v2 .. v9}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 836
    .line 837
    .line 838
    :cond_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object p0

    .line 842
    check-cast p0, La/g8u0;

    .line 843
    .line 844
    iget-boolean p0, p0, La/g8u0;->e:Z

    .line 845
    .line 846
    if-eqz p0, :cond_1

    .line 847
    .line 848
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 849
    .line 850
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 851
    .line 852
    .line 853
    move-result-object p0

    .line 854
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    const p1, 0x7f040b0b

    .line 858
    .line 859
    .line 860
    const/4 v0, 0x0

    .line 861
    invoke-static {p0, p1, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 862
    .line 863
    .line 864
    move-result p0

    .line 865
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 866
    .line 867
    .line 868
    move-result-object p0

    .line 869
    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 870
    .line 871
    .line 872
    goto :goto_0

    .line 873
    :cond_1
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 874
    .line 875
    .line 876
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 877
    .line 878
    return-object p0

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
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
