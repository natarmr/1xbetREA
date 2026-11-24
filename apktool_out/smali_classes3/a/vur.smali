.class public final synthetic La/vur;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/etr;


# direct methods
.method public synthetic constructor <init>(La/etr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vur;->a:B

    iput-object p1, p0, La/vur;->b:La/etr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vur;->a:B

    .line 4
    .line 5
    const/16 v5, 0x19

    .line 6
    .line 7
    const/16 v6, 0x8

    .line 8
    .line 9
    const/16 v10, 0xb

    .line 10
    .line 11
    const/16 v11, 0xa

    .line 12
    .line 13
    const/16 v12, 0x9

    .line 14
    .line 15
    const/4 v13, 0x7

    .line 16
    const/16 v14, 0x10

    .line 17
    .line 18
    const/16 v15, 0xf

    .line 19
    .line 20
    const/16 v2, 0xe

    .line 21
    .line 22
    const/16 v3, 0xd

    .line 23
    .line 24
    const/16 v7, 0xc

    .line 25
    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v4, 0x3

    .line 28
    const/4 v8, 0x2

    .line 29
    iget-object v0, v0, La/vur;->b:La/etr;

    .line 30
    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/cp;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v6, v1, La/cp;->u:La/yfu0;

    .line 42
    .line 43
    check-cast v6, La/hvx;

    .line 44
    .line 45
    iget-object v9, v6, La/hvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 46
    .line 47
    new-instance v10, La/bzr;

    .line 48
    .line 49
    invoke-direct {v10, v0, v1, v7}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    iget-object v7, v6, La/hvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 56
    .line 57
    new-instance v9, La/bzr;

    .line 58
    .line 59
    invoke-direct {v9, v0, v1, v3}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v9}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    iget-object v3, v6, La/hvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 66
    .line 67
    new-instance v7, La/bzr;

    .line 68
    .line 69
    invoke-direct {v7, v0, v1, v2}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v7}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, La/bzr;

    .line 76
    .line 77
    invoke-direct {v2, v0, v1, v15}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    new-instance v2, La/bzr;

    .line 84
    .line 85
    invoke-direct {v2, v0, v1, v14}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v6, La/hvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 92
    .line 93
    new-instance v3, La/tzr;

    .line 94
    .line 95
    invoke-direct {v3, v0, v1, v8}, La/tzr;-><init>(La/etr;La/cp;B)V

    .line 96
    .line 97
    .line 98
    new-instance v6, La/tzr;

    .line 99
    .line 100
    invoke-direct {v6, v0, v1, v4}, La/tzr;-><init>(La/etr;La/cp;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3, v6}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    new-instance v3, La/yur;

    .line 107
    .line 108
    invoke-direct {v3, v0, v1, v14}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, La/k2l;

    .line 115
    .line 116
    invoke-direct {v0, v1, v1, v5}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, La/cp;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 133
    .line 134
    check-cast v2, La/gvx;

    .line 135
    .line 136
    iget-object v3, v2, La/gvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v4, La/ovr;

    .line 142
    .line 143
    invoke-direct {v4, v0, v1, v13}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v4}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 147
    .line 148
    .line 149
    iget-object v3, v2, La/gvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 150
    .line 151
    new-instance v4, La/bzr;

    .line 152
    .line 153
    invoke-direct {v4, v0, v1, v6}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    .line 158
    .line 159
    iget-object v3, v2, La/gvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 160
    .line 161
    new-instance v4, La/bzr;

    .line 162
    .line 163
    invoke-direct {v4, v0, v1, v12}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    .line 168
    .line 169
    new-instance v4, La/bzr;

    .line 170
    .line 171
    invoke-direct {v4, v0, v1, v11}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    .line 176
    .line 177
    new-instance v4, La/bzr;

    .line 178
    .line 179
    invoke-direct {v4, v0, v1, v10}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    .line 184
    .line 185
    iget-object v2, v2, La/gvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 186
    .line 187
    new-instance v3, La/tzr;

    .line 188
    .line 189
    invoke-direct {v3, v0, v1, v9}, La/tzr;-><init>(La/etr;La/cp;B)V

    .line 190
    .line 191
    .line 192
    new-instance v4, La/tzr;

    .line 193
    .line 194
    const/4 v5, 0x1

    .line 195
    invoke-direct {v4, v0, v1, v5}, La/tzr;-><init>(La/etr;La/cp;B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    new-instance v3, La/yur;

    .line 202
    .line 203
    invoke-direct {v3, v0, v1, v15}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 207
    .line 208
    .line 209
    new-instance v0, La/k2l;

    .line 210
    .line 211
    const/16 v2, 0x18

    .line 212
    .line 213
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_1
    move-object/from16 v1, p1

    .line 223
    .line 224
    check-cast v1, La/cp;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 230
    .line 231
    check-cast v3, La/fvx;

    .line 232
    .line 233
    iget-object v5, v3, La/fvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 234
    .line 235
    new-instance v6, La/bzr;

    .line 236
    .line 237
    invoke-direct {v6, v0, v1, v4}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    .line 242
    .line 243
    iget-object v4, v3, La/fvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 244
    .line 245
    new-instance v5, La/bzr;

    .line 246
    .line 247
    const/4 v6, 0x4

    .line 248
    invoke-direct {v5, v0, v1, v6}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    .line 253
    .line 254
    iget-object v4, v3, La/fvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 255
    .line 256
    new-instance v5, La/bzr;

    .line 257
    .line 258
    const/4 v6, 0x5

    .line 259
    invoke-direct {v5, v0, v1, v6}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    .line 264
    .line 265
    new-instance v5, La/bzr;

    .line 266
    .line 267
    const/4 v6, 0x6

    .line 268
    invoke-direct {v5, v0, v1, v6}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    .line 273
    .line 274
    new-instance v5, La/bzr;

    .line 275
    .line 276
    invoke-direct {v5, v0, v1, v13}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    .line 281
    .line 282
    iget-object v3, v3, La/fvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 283
    .line 284
    new-instance v4, La/xur;

    .line 285
    .line 286
    const/16 v5, 0x1c

    .line 287
    .line 288
    invoke-direct {v4, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 289
    .line 290
    .line 291
    new-instance v5, La/xur;

    .line 292
    .line 293
    const/16 v6, 0x1d

    .line 294
    .line 295
    invoke-direct {v5, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v4, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 299
    .line 300
    .line 301
    new-instance v4, La/yur;

    .line 302
    .line 303
    invoke-direct {v4, v0, v1, v2}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, La/k2l;

    .line 310
    .line 311
    const/16 v2, 0x17

    .line 312
    .line 313
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_2
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, La/cp;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 330
    .line 331
    check-cast v2, La/evx;

    .line 332
    .line 333
    iget-object v4, v2, La/evx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 334
    .line 335
    new-instance v5, La/wwr;

    .line 336
    .line 337
    const/16 v6, 0x1c

    .line 338
    .line 339
    invoke-direct {v5, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    .line 344
    .line 345
    iget-object v4, v2, La/evx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 346
    .line 347
    new-instance v5, La/wwr;

    .line 348
    .line 349
    const/16 v6, 0x1d

    .line 350
    .line 351
    invoke-direct {v5, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 355
    .line 356
    .line 357
    iget-object v4, v2, La/evx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 358
    .line 359
    new-instance v5, La/bzr;

    .line 360
    .line 361
    invoke-direct {v5, v0, v1, v9}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    .line 366
    .line 367
    new-instance v5, La/bzr;

    .line 368
    .line 369
    const/4 v6, 0x1

    .line 370
    invoke-direct {v5, v0, v1, v6}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    .line 375
    .line 376
    new-instance v5, La/bzr;

    .line 377
    .line 378
    invoke-direct {v5, v0, v1, v8}, La/bzr;-><init>(La/etr;La/cp;B)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    .line 383
    .line 384
    iget-object v2, v2, La/evx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 385
    .line 386
    new-instance v4, La/xur;

    .line 387
    .line 388
    const/16 v5, 0x1a

    .line 389
    .line 390
    invoke-direct {v4, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 391
    .line 392
    .line 393
    new-instance v5, La/xur;

    .line 394
    .line 395
    const/16 v6, 0x1b

    .line 396
    .line 397
    invoke-direct {v5, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v4, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 401
    .line 402
    .line 403
    new-instance v4, La/yur;

    .line 404
    .line 405
    invoke-direct {v4, v0, v1, v3}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 409
    .line 410
    .line 411
    new-instance v0, La/k2l;

    .line 412
    .line 413
    const/16 v2, 0x16

    .line 414
    .line 415
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 419
    .line 420
    .line 421
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object v0

    .line 424
    :pswitch_3
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, La/cp;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 432
    .line 433
    check-cast v2, La/dvx;

    .line 434
    .line 435
    iget-object v3, v2, La/dvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 436
    .line 437
    new-instance v4, La/wwr;

    .line 438
    .line 439
    const/16 v6, 0x17

    .line 440
    .line 441
    invoke-direct {v4, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 445
    .line 446
    .line 447
    iget-object v3, v2, La/dvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 448
    .line 449
    new-instance v4, La/wwr;

    .line 450
    .line 451
    const/16 v6, 0x18

    .line 452
    .line 453
    invoke-direct {v4, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 457
    .line 458
    .line 459
    iget-object v3, v2, La/dvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 460
    .line 461
    new-instance v4, La/wwr;

    .line 462
    .line 463
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 467
    .line 468
    .line 469
    new-instance v4, La/wwr;

    .line 470
    .line 471
    const/16 v6, 0x1a

    .line 472
    .line 473
    invoke-direct {v4, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 477
    .line 478
    .line 479
    new-instance v4, La/wwr;

    .line 480
    .line 481
    const/16 v6, 0x1b

    .line 482
    .line 483
    invoke-direct {v4, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 487
    .line 488
    .line 489
    iget-object v2, v2, La/dvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 490
    .line 491
    new-instance v3, La/xur;

    .line 492
    .line 493
    const/16 v6, 0x18

    .line 494
    .line 495
    invoke-direct {v3, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 496
    .line 497
    .line 498
    new-instance v4, La/xur;

    .line 499
    .line 500
    invoke-direct {v4, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 504
    .line 505
    .line 506
    new-instance v3, La/yur;

    .line 507
    .line 508
    invoke-direct {v3, v0, v1, v7}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 512
    .line 513
    .line 514
    new-instance v0, La/k2l;

    .line 515
    .line 516
    const/16 v2, 0x15

    .line 517
    .line 518
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 522
    .line 523
    .line 524
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_4
    move-object/from16 v1, p1

    .line 528
    .line 529
    check-cast v1, La/cp;

    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 535
    .line 536
    check-cast v2, La/cvx;

    .line 537
    .line 538
    iget-object v3, v2, La/cvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 539
    .line 540
    new-instance v4, La/wwr;

    .line 541
    .line 542
    const/16 v5, 0x12

    .line 543
    .line 544
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 548
    .line 549
    .line 550
    iget-object v3, v2, La/cvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 551
    .line 552
    new-instance v4, La/wwr;

    .line 553
    .line 554
    const/16 v5, 0x13

    .line 555
    .line 556
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 560
    .line 561
    .line 562
    iget-object v3, v2, La/cvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 563
    .line 564
    new-instance v4, La/wwr;

    .line 565
    .line 566
    const/16 v5, 0x14

    .line 567
    .line 568
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 572
    .line 573
    .line 574
    new-instance v4, La/wwr;

    .line 575
    .line 576
    const/16 v5, 0x15

    .line 577
    .line 578
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 582
    .line 583
    .line 584
    new-instance v4, La/wwr;

    .line 585
    .line 586
    const/16 v5, 0x16

    .line 587
    .line 588
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 592
    .line 593
    .line 594
    iget-object v2, v2, La/cvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 595
    .line 596
    new-instance v3, La/xur;

    .line 597
    .line 598
    invoke-direct {v3, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 599
    .line 600
    .line 601
    new-instance v4, La/xur;

    .line 602
    .line 603
    const/16 v6, 0x17

    .line 604
    .line 605
    invoke-direct {v4, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 609
    .line 610
    .line 611
    new-instance v3, La/yur;

    .line 612
    .line 613
    invoke-direct {v3, v0, v1, v10}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 617
    .line 618
    .line 619
    new-instance v0, La/k2l;

    .line 620
    .line 621
    const/16 v2, 0x14

    .line 622
    .line 623
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 627
    .line 628
    .line 629
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 630
    .line 631
    return-object v0

    .line 632
    :pswitch_5
    move-object/from16 v1, p1

    .line 633
    .line 634
    check-cast v1, La/cp;

    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 640
    .line 641
    check-cast v3, La/bvx;

    .line 642
    .line 643
    iget-object v4, v3, La/bvx;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 644
    .line 645
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    new-instance v5, La/ovr;

    .line 649
    .line 650
    const/4 v6, 0x6

    .line 651
    invoke-direct {v5, v0, v1, v6}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 652
    .line 653
    .line 654
    invoke-static {v4, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 655
    .line 656
    .line 657
    iget-object v4, v3, La/bvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 658
    .line 659
    new-instance v5, La/wwr;

    .line 660
    .line 661
    invoke-direct {v5, v0, v1, v2}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 665
    .line 666
    .line 667
    iget-object v2, v3, La/bvx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 668
    .line 669
    new-instance v4, La/wwr;

    .line 670
    .line 671
    invoke-direct {v4, v0, v1, v15}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 675
    .line 676
    .line 677
    new-instance v4, La/wwr;

    .line 678
    .line 679
    invoke-direct {v4, v0, v1, v14}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 683
    .line 684
    .line 685
    new-instance v4, La/wwr;

    .line 686
    .line 687
    const/16 v5, 0x11

    .line 688
    .line 689
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 693
    .line 694
    .line 695
    iget-object v2, v3, La/bvx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 696
    .line 697
    new-instance v3, La/xur;

    .line 698
    .line 699
    const/16 v4, 0x14

    .line 700
    .line 701
    invoke-direct {v3, v0, v1, v4}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 702
    .line 703
    .line 704
    new-instance v4, La/xur;

    .line 705
    .line 706
    const/16 v5, 0x15

    .line 707
    .line 708
    invoke-direct {v4, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 712
    .line 713
    .line 714
    new-instance v3, La/yur;

    .line 715
    .line 716
    invoke-direct {v3, v0, v1, v11}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 720
    .line 721
    .line 722
    new-instance v0, La/k2l;

    .line 723
    .line 724
    const/16 v2, 0x13

    .line 725
    .line 726
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 730
    .line 731
    .line 732
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 733
    .line 734
    return-object v0

    .line 735
    :pswitch_6
    move-object/from16 v1, p1

    .line 736
    .line 737
    check-cast v1, La/cp;

    .line 738
    .line 739
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 743
    .line 744
    check-cast v2, La/avx;

    .line 745
    .line 746
    iget-object v4, v2, La/avx;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 747
    .line 748
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    new-instance v5, La/ovr;

    .line 752
    .line 753
    const/4 v6, 0x5

    .line 754
    invoke-direct {v5, v0, v1, v6}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 755
    .line 756
    .line 757
    invoke-static {v4, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 758
    .line 759
    .line 760
    iget-object v4, v2, La/avx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 761
    .line 762
    new-instance v5, La/wwr;

    .line 763
    .line 764
    invoke-direct {v5, v0, v1, v11}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 768
    .line 769
    .line 770
    iget-object v4, v2, La/avx;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 771
    .line 772
    new-instance v5, La/wwr;

    .line 773
    .line 774
    invoke-direct {v5, v0, v1, v10}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 778
    .line 779
    .line 780
    new-instance v5, La/wwr;

    .line 781
    .line 782
    invoke-direct {v5, v0, v1, v7}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 786
    .line 787
    .line 788
    new-instance v5, La/wwr;

    .line 789
    .line 790
    invoke-direct {v5, v0, v1, v3}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 794
    .line 795
    .line 796
    iget-object v2, v2, La/avx;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 797
    .line 798
    new-instance v3, La/xur;

    .line 799
    .line 800
    const/16 v4, 0x12

    .line 801
    .line 802
    invoke-direct {v3, v0, v1, v4}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 803
    .line 804
    .line 805
    new-instance v4, La/xur;

    .line 806
    .line 807
    const/16 v5, 0x13

    .line 808
    .line 809
    invoke-direct {v4, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 813
    .line 814
    .line 815
    new-instance v3, La/yur;

    .line 816
    .line 817
    invoke-direct {v3, v0, v1, v12}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 821
    .line 822
    .line 823
    new-instance v0, La/k2l;

    .line 824
    .line 825
    const/16 v2, 0x12

    .line 826
    .line 827
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 831
    .line 832
    .line 833
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 834
    .line 835
    return-object v0

    .line 836
    :pswitch_7
    move-object/from16 v1, p1

    .line 837
    .line 838
    check-cast v1, La/cp;

    .line 839
    .line 840
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 844
    .line 845
    check-cast v2, La/zux;

    .line 846
    .line 847
    iget-object v3, v2, La/zux;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 848
    .line 849
    new-instance v4, La/wwr;

    .line 850
    .line 851
    const/4 v5, 0x5

    .line 852
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 856
    .line 857
    .line 858
    iget-object v3, v2, La/zux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 859
    .line 860
    new-instance v4, La/wwr;

    .line 861
    .line 862
    const/4 v5, 0x6

    .line 863
    invoke-direct {v4, v0, v1, v5}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 867
    .line 868
    .line 869
    iget-object v3, v2, La/zux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 870
    .line 871
    new-instance v4, La/wwr;

    .line 872
    .line 873
    invoke-direct {v4, v0, v1, v13}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 877
    .line 878
    .line 879
    new-instance v4, La/wwr;

    .line 880
    .line 881
    invoke-direct {v4, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 885
    .line 886
    .line 887
    new-instance v4, La/wwr;

    .line 888
    .line 889
    invoke-direct {v4, v0, v1, v12}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 893
    .line 894
    .line 895
    iget-object v2, v2, La/zux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 896
    .line 897
    new-instance v3, La/xur;

    .line 898
    .line 899
    invoke-direct {v3, v0, v1, v14}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 900
    .line 901
    .line 902
    new-instance v4, La/xur;

    .line 903
    .line 904
    const/16 v5, 0x11

    .line 905
    .line 906
    invoke-direct {v4, v0, v1, v5}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 910
    .line 911
    .line 912
    new-instance v3, La/yur;

    .line 913
    .line 914
    invoke-direct {v3, v0, v1, v6}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 918
    .line 919
    .line 920
    new-instance v0, La/k2l;

    .line 921
    .line 922
    const/16 v2, 0x11

    .line 923
    .line 924
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 928
    .line 929
    .line 930
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 931
    .line 932
    return-object v0

    .line 933
    :pswitch_8
    move-object/from16 v1, p1

    .line 934
    .line 935
    check-cast v1, La/cp;

    .line 936
    .line 937
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    .line 939
    .line 940
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 941
    .line 942
    check-cast v3, La/yux;

    .line 943
    .line 944
    iget-object v5, v3, La/yux;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 945
    .line 946
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    new-instance v6, La/ovr;

    .line 950
    .line 951
    const/4 v7, 0x4

    .line 952
    invoke-direct {v6, v0, v1, v7}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 953
    .line 954
    .line 955
    invoke-static {v5, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 956
    .line 957
    .line 958
    iget-object v5, v3, La/yux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 959
    .line 960
    new-instance v6, La/wwr;

    .line 961
    .line 962
    const/4 v7, 0x1

    .line 963
    invoke-direct {v6, v0, v1, v7}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 967
    .line 968
    .line 969
    iget-object v5, v3, La/yux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 970
    .line 971
    new-instance v6, La/wwr;

    .line 972
    .line 973
    invoke-direct {v6, v0, v1, v8}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 977
    .line 978
    .line 979
    new-instance v6, La/wwr;

    .line 980
    .line 981
    invoke-direct {v6, v0, v1, v4}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 985
    .line 986
    .line 987
    new-instance v4, La/wwr;

    .line 988
    .line 989
    const/4 v6, 0x4

    .line 990
    invoke-direct {v4, v0, v1, v6}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v5, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 994
    .line 995
    .line 996
    iget-object v3, v3, La/yux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 997
    .line 998
    new-instance v4, La/xur;

    .line 999
    .line 1000
    invoke-direct {v4, v0, v1, v2}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1001
    .line 1002
    .line 1003
    new-instance v2, La/xur;

    .line 1004
    .line 1005
    invoke-direct {v2, v0, v1, v15}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v3, v4, v2}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1009
    .line 1010
    .line 1011
    new-instance v2, La/yur;

    .line 1012
    .line 1013
    invoke-direct {v2, v0, v1, v13}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1017
    .line 1018
    .line 1019
    new-instance v0, La/k2l;

    .line 1020
    .line 1021
    invoke-direct {v0, v1, v1, v14}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1025
    .line 1026
    .line 1027
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1028
    .line 1029
    return-object v0

    .line 1030
    :pswitch_9
    move-object/from16 v1, p1

    .line 1031
    .line 1032
    check-cast v1, La/cp;

    .line 1033
    .line 1034
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1035
    .line 1036
    .line 1037
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1038
    .line 1039
    check-cast v2, La/xux;

    .line 1040
    .line 1041
    iget-object v5, v2, La/xux;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 1042
    .line 1043
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    new-instance v6, La/ovr;

    .line 1047
    .line 1048
    invoke-direct {v6, v0, v1, v4}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v5, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1052
    .line 1053
    .line 1054
    iget-object v4, v2, La/xux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1055
    .line 1056
    new-instance v5, La/wur;

    .line 1057
    .line 1058
    const/16 v6, 0x1b

    .line 1059
    .line 1060
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1064
    .line 1065
    .line 1066
    iget-object v4, v2, La/xux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1067
    .line 1068
    new-instance v5, La/wur;

    .line 1069
    .line 1070
    const/16 v6, 0x1c

    .line 1071
    .line 1072
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v5, La/wur;

    .line 1079
    .line 1080
    const/16 v6, 0x1d

    .line 1081
    .line 1082
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1086
    .line 1087
    .line 1088
    new-instance v5, La/wwr;

    .line 1089
    .line 1090
    invoke-direct {v5, v0, v1, v9}, La/wwr;-><init>(La/etr;La/cp;B)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1094
    .line 1095
    .line 1096
    iget-object v2, v2, La/xux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1097
    .line 1098
    new-instance v4, La/xur;

    .line 1099
    .line 1100
    invoke-direct {v4, v0, v1, v7}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1101
    .line 1102
    .line 1103
    new-instance v5, La/xur;

    .line 1104
    .line 1105
    invoke-direct {v5, v0, v1, v3}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v2, v4, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1109
    .line 1110
    .line 1111
    new-instance v3, La/yur;

    .line 1112
    .line 1113
    const/4 v6, 0x6

    .line 1114
    invoke-direct {v3, v0, v1, v6}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1118
    .line 1119
    .line 1120
    new-instance v0, La/k2l;

    .line 1121
    .line 1122
    invoke-direct {v0, v1, v1, v15}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1129
    .line 1130
    return-object v0

    .line 1131
    :pswitch_a
    move-object/from16 v1, p1

    .line 1132
    .line 1133
    check-cast v1, La/cp;

    .line 1134
    .line 1135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 1139
    .line 1140
    check-cast v3, La/wux;

    .line 1141
    .line 1142
    iget-object v4, v3, La/wux;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 1143
    .line 1144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    new-instance v6, La/ovr;

    .line 1148
    .line 1149
    invoke-direct {v6, v0, v1, v8}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 1150
    .line 1151
    .line 1152
    invoke-static {v4, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1153
    .line 1154
    .line 1155
    iget-object v4, v3, La/wux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1156
    .line 1157
    new-instance v6, La/wur;

    .line 1158
    .line 1159
    const/16 v7, 0x17

    .line 1160
    .line 1161
    invoke-direct {v6, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v4, v6}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1165
    .line 1166
    .line 1167
    iget-object v4, v3, La/wux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1168
    .line 1169
    new-instance v6, La/wur;

    .line 1170
    .line 1171
    const/16 v7, 0x18

    .line 1172
    .line 1173
    invoke-direct {v6, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v4, v6}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1177
    .line 1178
    .line 1179
    new-instance v6, La/wur;

    .line 1180
    .line 1181
    invoke-direct {v6, v0, v1, v5}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v4, v6}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1185
    .line 1186
    .line 1187
    new-instance v5, La/wur;

    .line 1188
    .line 1189
    const/16 v6, 0x1a

    .line 1190
    .line 1191
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1195
    .line 1196
    .line 1197
    iget-object v3, v3, La/wux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1198
    .line 1199
    new-instance v4, La/xur;

    .line 1200
    .line 1201
    invoke-direct {v4, v0, v1, v11}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1202
    .line 1203
    .line 1204
    new-instance v5, La/xur;

    .line 1205
    .line 1206
    invoke-direct {v5, v0, v1, v10}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v3, v4, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1210
    .line 1211
    .line 1212
    new-instance v4, La/yur;

    .line 1213
    .line 1214
    const/4 v6, 0x5

    .line 1215
    invoke-direct {v4, v0, v1, v6}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1219
    .line 1220
    .line 1221
    new-instance v0, La/k2l;

    .line 1222
    .line 1223
    invoke-direct {v0, v1, v1, v2}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1227
    .line 1228
    .line 1229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1230
    .line 1231
    return-object v0

    .line 1232
    :pswitch_b
    move-object/from16 v1, p1

    .line 1233
    .line 1234
    check-cast v1, La/cp;

    .line 1235
    .line 1236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1240
    .line 1241
    check-cast v2, La/vux;

    .line 1242
    .line 1243
    iget-object v4, v2, La/vux;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 1244
    .line 1245
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    new-instance v5, La/ovr;

    .line 1249
    .line 1250
    const/4 v7, 0x1

    .line 1251
    invoke-direct {v5, v0, v1, v7}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 1252
    .line 1253
    .line 1254
    invoke-static {v4, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1255
    .line 1256
    .line 1257
    iget-object v4, v2, La/vux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1258
    .line 1259
    new-instance v5, La/wur;

    .line 1260
    .line 1261
    const/16 v7, 0x13

    .line 1262
    .line 1263
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1267
    .line 1268
    .line 1269
    iget-object v4, v2, La/vux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1270
    .line 1271
    new-instance v5, La/wur;

    .line 1272
    .line 1273
    const/16 v7, 0x14

    .line 1274
    .line 1275
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1279
    .line 1280
    .line 1281
    new-instance v5, La/wur;

    .line 1282
    .line 1283
    const/16 v7, 0x15

    .line 1284
    .line 1285
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1289
    .line 1290
    .line 1291
    new-instance v5, La/wur;

    .line 1292
    .line 1293
    const/16 v7, 0x16

    .line 1294
    .line 1295
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1299
    .line 1300
    .line 1301
    iget-object v2, v2, La/vux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1302
    .line 1303
    new-instance v4, La/xur;

    .line 1304
    .line 1305
    invoke-direct {v4, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1306
    .line 1307
    .line 1308
    new-instance v5, La/xur;

    .line 1309
    .line 1310
    invoke-direct {v5, v0, v1, v12}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v2, v4, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1314
    .line 1315
    .line 1316
    new-instance v4, La/yur;

    .line 1317
    .line 1318
    const/4 v6, 0x4

    .line 1319
    invoke-direct {v4, v0, v1, v6}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1323
    .line 1324
    .line 1325
    new-instance v0, La/k2l;

    .line 1326
    .line 1327
    invoke-direct {v0, v1, v1, v3}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1331
    .line 1332
    .line 1333
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1334
    .line 1335
    return-object v0

    .line 1336
    :pswitch_c
    move-object/from16 v1, p1

    .line 1337
    .line 1338
    check-cast v1, La/cp;

    .line 1339
    .line 1340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 1344
    .line 1345
    check-cast v3, La/uux;

    .line 1346
    .line 1347
    iget-object v5, v3, La/uux;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 1348
    .line 1349
    new-instance v6, La/wur;

    .line 1350
    .line 1351
    invoke-direct {v6, v0, v1, v2}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1355
    .line 1356
    .line 1357
    iget-object v2, v3, La/uux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1358
    .line 1359
    new-instance v5, La/wur;

    .line 1360
    .line 1361
    invoke-direct {v5, v0, v1, v15}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1365
    .line 1366
    .line 1367
    iget-object v2, v3, La/uux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1368
    .line 1369
    new-instance v5, La/wur;

    .line 1370
    .line 1371
    invoke-direct {v5, v0, v1, v14}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1375
    .line 1376
    .line 1377
    new-instance v5, La/wur;

    .line 1378
    .line 1379
    const/16 v6, 0x11

    .line 1380
    .line 1381
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1385
    .line 1386
    .line 1387
    new-instance v5, La/wur;

    .line 1388
    .line 1389
    const/16 v6, 0x12

    .line 1390
    .line 1391
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1395
    .line 1396
    .line 1397
    iget-object v2, v3, La/uux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1398
    .line 1399
    new-instance v3, La/xur;

    .line 1400
    .line 1401
    const/4 v6, 0x6

    .line 1402
    invoke-direct {v3, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1403
    .line 1404
    .line 1405
    new-instance v5, La/xur;

    .line 1406
    .line 1407
    invoke-direct {v5, v0, v1, v13}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v2, v3, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1411
    .line 1412
    .line 1413
    new-instance v3, La/yur;

    .line 1414
    .line 1415
    invoke-direct {v3, v0, v1, v4}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v0, La/k2l;

    .line 1422
    .line 1423
    invoke-direct {v0, v1, v1, v7}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1427
    .line 1428
    .line 1429
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1430
    .line 1431
    return-object v0

    .line 1432
    :pswitch_d
    move-object/from16 v1, p1

    .line 1433
    .line 1434
    check-cast v1, La/cp;

    .line 1435
    .line 1436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1437
    .line 1438
    .line 1439
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1440
    .line 1441
    check-cast v2, La/tux;

    .line 1442
    .line 1443
    iget-object v4, v2, La/tux;->a:Lorg/xplatform/uikit_sport/eventcard/container/SyntheticsEventCard;

    .line 1444
    .line 1445
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1446
    .line 1447
    .line 1448
    new-instance v5, La/ovr;

    .line 1449
    .line 1450
    invoke-direct {v5, v0, v1, v9}, La/ovr;-><init>(La/etr;La/cp;B)V

    .line 1451
    .line 1452
    .line 1453
    invoke-static {v4, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1454
    .line 1455
    .line 1456
    iget-object v4, v2, La/tux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1457
    .line 1458
    new-instance v5, La/wur;

    .line 1459
    .line 1460
    invoke-direct {v5, v0, v1, v11}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1464
    .line 1465
    .line 1466
    iget-object v4, v2, La/tux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1467
    .line 1468
    new-instance v5, La/wur;

    .line 1469
    .line 1470
    invoke-direct {v5, v0, v1, v10}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1474
    .line 1475
    .line 1476
    new-instance v5, La/wur;

    .line 1477
    .line 1478
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1482
    .line 1483
    .line 1484
    new-instance v5, La/wur;

    .line 1485
    .line 1486
    invoke-direct {v5, v0, v1, v3}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1490
    .line 1491
    .line 1492
    iget-object v2, v2, La/tux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1493
    .line 1494
    new-instance v3, La/xur;

    .line 1495
    .line 1496
    const/4 v6, 0x4

    .line 1497
    invoke-direct {v3, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1498
    .line 1499
    .line 1500
    new-instance v4, La/xur;

    .line 1501
    .line 1502
    const/4 v6, 0x5

    .line 1503
    invoke-direct {v4, v0, v1, v6}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1507
    .line 1508
    .line 1509
    new-instance v3, La/yur;

    .line 1510
    .line 1511
    invoke-direct {v3, v0, v1, v8}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1515
    .line 1516
    .line 1517
    new-instance v0, La/k2l;

    .line 1518
    .line 1519
    invoke-direct {v0, v1, v1, v10}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1523
    .line 1524
    .line 1525
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1526
    .line 1527
    return-object v0

    .line 1528
    :pswitch_e
    move-object/from16 v1, p1

    .line 1529
    .line 1530
    check-cast v1, La/cp;

    .line 1531
    .line 1532
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1533
    .line 1534
    .line 1535
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1536
    .line 1537
    check-cast v2, La/sux;

    .line 1538
    .line 1539
    iget-object v3, v2, La/sux;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 1540
    .line 1541
    new-instance v5, La/wur;

    .line 1542
    .line 1543
    const/4 v7, 0x5

    .line 1544
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1548
    .line 1549
    .line 1550
    iget-object v3, v2, La/sux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1551
    .line 1552
    new-instance v5, La/wur;

    .line 1553
    .line 1554
    const/4 v7, 0x6

    .line 1555
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1559
    .line 1560
    .line 1561
    iget-object v3, v2, La/sux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1562
    .line 1563
    new-instance v5, La/wur;

    .line 1564
    .line 1565
    invoke-direct {v5, v0, v1, v13}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1566
    .line 1567
    .line 1568
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1569
    .line 1570
    .line 1571
    new-instance v5, La/wur;

    .line 1572
    .line 1573
    invoke-direct {v5, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1577
    .line 1578
    .line 1579
    new-instance v5, La/wur;

    .line 1580
    .line 1581
    invoke-direct {v5, v0, v1, v12}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1585
    .line 1586
    .line 1587
    iget-object v2, v2, La/sux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1588
    .line 1589
    new-instance v3, La/xur;

    .line 1590
    .line 1591
    invoke-direct {v3, v0, v1, v8}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1592
    .line 1593
    .line 1594
    new-instance v5, La/xur;

    .line 1595
    .line 1596
    invoke-direct {v5, v0, v1, v4}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v2, v3, v5}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1600
    .line 1601
    .line 1602
    new-instance v3, La/yur;

    .line 1603
    .line 1604
    const/4 v7, 0x1

    .line 1605
    invoke-direct {v3, v0, v1, v7}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1609
    .line 1610
    .line 1611
    new-instance v0, La/thd;

    .line 1612
    .line 1613
    invoke-direct {v0, v1}, La/thd;-><init>(La/cp;)V

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setExpandedListener(La/xdr;)V

    .line 1617
    .line 1618
    .line 1619
    new-instance v0, La/k2l;

    .line 1620
    .line 1621
    invoke-direct {v0, v1, v1, v11}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1625
    .line 1626
    .line 1627
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1628
    .line 1629
    return-object v0

    .line 1630
    :pswitch_f
    move-object/from16 v1, p1

    .line 1631
    .line 1632
    check-cast v1, La/cp;

    .line 1633
    .line 1634
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1635
    .line 1636
    .line 1637
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1638
    .line 1639
    check-cast v2, La/rux;

    .line 1640
    .line 1641
    iget-object v3, v2, La/rux;->a:Lorg/xplatform/uikit_sport/eventcard/container/BasicEventCard;

    .line 1642
    .line 1643
    new-instance v5, La/wur;

    .line 1644
    .line 1645
    invoke-direct {v5, v0, v1, v9}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1649
    .line 1650
    .line 1651
    iget-object v3, v2, La/rux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1652
    .line 1653
    new-instance v5, La/wur;

    .line 1654
    .line 1655
    const/4 v7, 0x1

    .line 1656
    invoke-direct {v5, v0, v1, v7}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1657
    .line 1658
    .line 1659
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setStreamButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1660
    .line 1661
    .line 1662
    iget-object v3, v2, La/rux;->c:Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;

    .line 1663
    .line 1664
    new-instance v5, La/wur;

    .line 1665
    .line 1666
    invoke-direct {v5, v0, v1, v8}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1667
    .line 1668
    .line 1669
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setZoneButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1670
    .line 1671
    .line 1672
    new-instance v5, La/wur;

    .line 1673
    .line 1674
    invoke-direct {v5, v0, v1, v4}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setNotificationButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1678
    .line 1679
    .line 1680
    new-instance v4, La/wur;

    .line 1681
    .line 1682
    const/4 v6, 0x4

    .line 1683
    invoke-direct {v4, v0, v1, v6}, La/wur;-><init>(La/etr;La/cp;B)V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->setFavoriteButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 1687
    .line 1688
    .line 1689
    iget-object v2, v2, La/rux;->b:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 1690
    .line 1691
    new-instance v3, La/xur;

    .line 1692
    .line 1693
    invoke-direct {v3, v0, v1, v9}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1694
    .line 1695
    .line 1696
    new-instance v4, La/xur;

    .line 1697
    .line 1698
    const/4 v7, 0x1

    .line 1699
    invoke-direct {v4, v0, v1, v7}, La/xur;-><init>(La/etr;La/cp;B)V

    .line 1700
    .line 1701
    .line 1702
    invoke-virtual {v2, v3, v4}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 1703
    .line 1704
    .line 1705
    new-instance v3, La/yur;

    .line 1706
    .line 1707
    invoke-direct {v3, v0, v1, v9}, La/yur;-><init>(La/etr;La/cp;B)V

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V

    .line 1711
    .line 1712
    .line 1713
    new-instance v0, La/k2l;

    .line 1714
    .line 1715
    invoke-direct {v0, v1, v1, v12}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1719
    .line 1720
    .line 1721
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1722
    .line 1723
    return-object v0

    .line 1724
    nop

    .line 1725
    :pswitch_data_0
    .packed-switch 0x0
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
