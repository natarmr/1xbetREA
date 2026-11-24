.class public final synthetic La/j3b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/j3b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/j3b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte p0, p0, La/j3b0;->a:B

    .line 2
    .line 3
    const v0, 0x7f0a0ba8

    .line 4
    .line 5
    .line 6
    const-string v1, "Missing required view with ID: "

    .line 7
    .line 8
    const-string v2, "rootView"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    packed-switch p0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    check-cast p2, La/m4c0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Landroid/view/LayoutInflater;

    .line 30
    .line 31
    check-cast p2, Landroid/view/ViewGroup;

    .line 32
    .line 33
    const p0, 0x7f0d0115

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const p1, 0x7f0a06e3

    .line 41
    .line 42
    .line 43
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    check-cast p2, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    new-instance v4, La/j2k;

    .line 60
    .line 61
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 62
    .line 63
    invoke-direct {v4, p0, p1}, La/j2k;-><init>(Landroidx/cardview/widget/CardView;Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v0, p1

    .line 68
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    return-object v4

    .line 84
    :pswitch_1
    check-cast p1, Landroid/view/LayoutInflater;

    .line 85
    .line 86
    check-cast p2, Landroid/view/ViewGroup;

    .line 87
    .line 88
    const p0, 0x7f0d0116

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;

    .line 100
    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    new-instance v4, La/k2k;

    .line 104
    .line 105
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 106
    .line 107
    invoke-direct {v4, p0, p1}, La/k2k;-><init>(Landroidx/cardview/widget/CardView;Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    return-object v4

    .line 127
    :pswitch_2
    check-cast p1, La/fet;

    .line 128
    .line 129
    check-cast p2, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, La/x8x;->L(I)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-static {p0, p1}, La/rsr0;->z(ILa/fet;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_3
    check-cast p1, La/fet;

    .line 145
    .line 146
    check-cast p2, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {v3}, La/x8x;->L(I)I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0, p1}, La/bsr0;->t(ILa/fet;)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 162
    .line 163
    check-cast p2, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 175
    .line 176
    check-cast p2, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_7
    check-cast p1, La/fet;

    .line 201
    .line 202
    check-cast p2, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {v3}, La/x8x;->L(I)I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    invoke-static {p0, p1}, La/e1c0;->c(ILa/fet;)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_8
    check-cast p1, Landroid/view/LayoutInflater;

    .line 218
    .line 219
    check-cast p2, Landroid/view/ViewGroup;

    .line 220
    .line 221
    const p0, 0x7f0d0404

    .line 222
    .line 223
    .line 224
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-eqz p0, :cond_3

    .line 229
    .line 230
    check-cast p0, Landroid/widget/TextView;

    .line 231
    .line 232
    new-instance v4, La/xwx;

    .line 233
    .line 234
    invoke-direct {v4, p0, p0}, La/xwx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_3
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :goto_2
    return-object v4

    .line 242
    :pswitch_9
    check-cast p1, Landroid/view/LayoutInflater;

    .line 243
    .line 244
    check-cast p2, Landroid/view/ViewGroup;

    .line 245
    .line 246
    const p0, 0x7f0d0402

    .line 247
    .line 248
    .line 249
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    if-eqz p0, :cond_4

    .line 254
    .line 255
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 256
    .line 257
    new-instance v4, La/vwx;

    .line 258
    .line 259
    invoke-direct {v4, p0, p0}, La/vwx;-><init>(Lorg/xplatform/uikit/components/text_field/DsTextField;Lorg/xplatform/uikit/components/text_field/DsTextField;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_4
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :goto_3
    return-object v4

    .line 267
    :pswitch_a
    check-cast p1, Landroid/view/LayoutInflater;

    .line 268
    .line 269
    check-cast p2, Landroid/view/ViewGroup;

    .line 270
    .line 271
    const p0, 0x7f0d0403

    .line 272
    .line 273
    .line 274
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    if-eqz p0, :cond_5

    .line 279
    .line 280
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 281
    .line 282
    new-instance v4, La/wwx;

    .line 283
    .line 284
    invoke-direct {v4, p0, p0}, La/wwx;-><init>(Lorg/xplatform/uikit/components/text_field/DsTextField;Lorg/xplatform/uikit/components/text_field/DsTextField;)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_5
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :goto_4
    return-object v4

    .line 292
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 293
    .line 294
    check-cast p2, Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 306
    .line 307
    check-cast p2, Ljava/lang/String;

    .line 308
    .line 309
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 313
    .line 314
    check-cast p2, Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object p0

    .line 325
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 326
    .line 327
    check-cast p2, Ljava/lang/String;

    .line 328
    .line 329
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_f
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 336
    .line 337
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    new-instance p0, La/peb0;

    .line 346
    .line 347
    const/16 v0, 0x11

    .line 348
    .line 349
    invoke-direct {p0, v0}, La/peb0;-><init>(B)V

    .line 350
    .line 351
    .line 352
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    new-instance p0, La/npa0;

    .line 356
    .line 357
    invoke-direct {p0, v0}, La/npa0;-><init>(B)V

    .line 358
    .line 359
    .line 360
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object p0

    .line 366
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 367
    .line 368
    check-cast p2, Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object p0

    .line 379
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 380
    .line 381
    check-cast p2, Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object p0

    .line 392
    :pswitch_12
    check-cast p1, La/fet;

    .line 393
    .line 394
    check-cast p2, Ljava/lang/Integer;

    .line 395
    .line 396
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-static {v3}, La/x8x;->L(I)I

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    invoke-static {p0, p1}, La/ffb0;->A(ILa/fet;)V

    .line 404
    .line 405
    .line 406
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object p0

    .line 409
    :pswitch_13
    check-cast p1, La/fet;

    .line 410
    .line 411
    check-cast p2, Ljava/lang/Integer;

    .line 412
    .line 413
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {v3}, La/x8x;->L(I)I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    invoke-static {p0, p1}, La/oja0;->K(ILa/fet;)V

    .line 421
    .line 422
    .line 423
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object p0

    .line 426
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 429
    .line 430
    .line 431
    check-cast p2, La/oza0;

    .line 432
    .line 433
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    new-instance p2, Lkotlin/Pair;

    .line 441
    .line 442
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    return-object p2

    .line 446
    :pswitch_15
    check-cast p1, Ljava/lang/Throwable;

    .line 447
    .line 448
    check-cast p2, Ljava/lang/String;

    .line 449
    .line 450
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object p0

    .line 453
    :pswitch_16
    check-cast p1, Ljava/lang/Throwable;

    .line 454
    .line 455
    check-cast p2, Ljava/lang/String;

    .line 456
    .line 457
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object p0

    .line 466
    :pswitch_17
    check-cast p1, Ljava/lang/Throwable;

    .line 467
    .line 468
    check-cast p2, Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object p0

    .line 479
    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    .line 480
    .line 481
    check-cast p2, Ljava/lang/String;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    return-object p0

    .line 492
    :pswitch_19
    check-cast p1, Landroid/view/LayoutInflater;

    .line 493
    .line 494
    check-cast p2, Landroid/view/ViewGroup;

    .line 495
    .line 496
    const p0, 0x7f0d0514

    .line 497
    .line 498
    .line 499
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    const p1, 0x7f0a00f8

    .line 504
    .line 505
    .line 506
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 507
    .line 508
    .line 509
    move-result-object p2

    .line 510
    move-object v7, p2

    .line 511
    check-cast v7, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 512
    .line 513
    if-eqz v7, :cond_6

    .line 514
    .line 515
    const p1, 0x7f0a05f4

    .line 516
    .line 517
    .line 518
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 519
    .line 520
    .line 521
    move-result-object p2

    .line 522
    move-object v8, p2

    .line 523
    check-cast v8, Landroid/widget/FrameLayout;

    .line 524
    .line 525
    if-eqz v8, :cond_6

    .line 526
    .line 527
    const p1, 0x7f0a1236

    .line 528
    .line 529
    .line 530
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 531
    .line 532
    .line 533
    move-result-object p2

    .line 534
    move-object v9, p2

    .line 535
    check-cast v9, Landroid/widget/TextView;

    .line 536
    .line 537
    if-eqz v9, :cond_6

    .line 538
    .line 539
    const p1, 0x7f0a1260

    .line 540
    .line 541
    .line 542
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 543
    .line 544
    .line 545
    move-result-object p2

    .line 546
    move-object v10, p2

    .line 547
    check-cast v10, Landroid/widget/TextView;

    .line 548
    .line 549
    if-eqz v10, :cond_6

    .line 550
    .line 551
    new-instance v5, La/p7b0;

    .line 552
    .line 553
    move-object v6, p0

    .line 554
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 555
    .line 556
    invoke-direct/range {v5 .. v10}, La/p7b0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 557
    .line 558
    .line 559
    move-object v4, v5

    .line 560
    goto :goto_5

    .line 561
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object p0

    .line 569
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    :goto_5
    return-object v4

    .line 577
    :pswitch_1a
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 578
    .line 579
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 580
    .line 581
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    sget-object p0, La/h6b0;->a:La/h6b0;

    .line 588
    .line 589
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    new-instance p0, La/npa0;

    .line 593
    .line 594
    const/16 p1, 0x9

    .line 595
    .line 596
    invoke-direct {p0, p1}, La/npa0;-><init>(B)V

    .line 597
    .line 598
    .line 599
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    return-object p0

    .line 605
    :pswitch_1b
    check-cast p1, Landroid/view/LayoutInflater;

    .line 606
    .line 607
    check-cast p2, Landroid/view/ViewGroup;

    .line 608
    .line 609
    const p0, 0x7f0d0114

    .line 610
    .line 611
    .line 612
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    if-eqz p0, :cond_7

    .line 617
    .line 618
    check-cast p0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 619
    .line 620
    new-instance v4, La/i2k;

    .line 621
    .line 622
    invoke-direct {v4, p0, p0}, La/i2k;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 623
    .line 624
    .line 625
    goto :goto_6

    .line 626
    :cond_7
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    :goto_6
    return-object v4

    .line 630
    :pswitch_1c
    check-cast p1, La/oyg0;

    .line 631
    .line 632
    move-object v0, p2

    .line 633
    check-cast v0, La/u2b0;

    .line 634
    .line 635
    iget-object p0, v0, La/u2b0;->l:Ljava/util/List;

    .line 636
    .line 637
    new-instance v7, Ljava/util/ArrayList;

    .line 638
    .line 639
    const/16 p1, 0xa

    .line 640
    .line 641
    invoke-static {p0, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 642
    .line 643
    .line 644
    move-result p1

    .line 645
    invoke-direct {v7, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 646
    .line 647
    .line 648
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 649
    .line 650
    .line 651
    move-result-object p0

    .line 652
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result p1

    .line 656
    if-eqz p1, :cond_9

    .line 657
    .line 658
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object p1

    .line 662
    check-cast p1, La/df40;

    .line 663
    .line 664
    instance-of p2, p1, La/ve40;

    .line 665
    .line 666
    if-eqz p2, :cond_8

    .line 667
    .line 668
    new-instance p1, La/ve40;

    .line 669
    .line 670
    sget-object p2, La/eyx;->a:La/eyx;

    .line 671
    .line 672
    invoke-direct {p1, p2}, La/ve40;-><init>(La/fyx;)V

    .line 673
    .line 674
    .line 675
    :cond_8
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    goto :goto_7

    .line 679
    :cond_9
    const/16 v8, 0x7ff

    .line 680
    .line 681
    const/4 v1, 0x0

    .line 682
    const/4 v2, 0x0

    .line 683
    const/4 v3, 0x0

    .line 684
    const/4 v4, 0x0

    .line 685
    const/4 v5, 0x0

    .line 686
    const/4 v6, 0x0

    .line 687
    invoke-static/range {v0 .. v8}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 688
    .line 689
    .line 690
    move-result-object p0

    .line 691
    return-object p0

    .line 692
    nop

    .line 693
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
