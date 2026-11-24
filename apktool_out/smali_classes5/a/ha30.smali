.class public final La/ha30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ha30;->a:B

    iput-object p1, p0, La/ha30;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ha30;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ha30;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "Missing required view with ID: "

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/ha30;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, La/ha30;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    check-cast v5, La/h6i0;

    .line 19
    .line 20
    iget-object v1, v5, La/h6i0;->a:La/i6i0;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    new-instance v1, La/gpc0;

    .line 31
    .line 32
    check-cast v5, La/yrc0;

    .line 33
    .line 34
    invoke-direct {v1, v5}, La/gpc0;-><init>(La/yrc0;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    new-instance v1, La/amc0;

    .line 46
    .line 47
    check-cast v5, La/rnc0;

    .line 48
    .line 49
    invoke-direct {v1, v5}, La/amc0;-><init>(La/rnc0;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_2
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSendClock;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSendClock;

    .line 72
    .line 73
    const v1, 0x7f0d0536

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    const v1, 0x7f0a095e

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    const v1, 0x7f0a095f

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    const v1, 0x7f0a0960

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 113
    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    const v1, 0x7f0a0961

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 124
    .line 125
    if-eqz v2, :cond_1

    .line 126
    .line 127
    const v1, 0x7f0a0962

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 135
    .line 136
    if-eqz v2, :cond_1

    .line 137
    .line 138
    const v1, 0x7f0a0963

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 146
    .line 147
    if-eqz v2, :cond_1

    .line 148
    .line 149
    const v1, 0x7f0a0964

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 157
    .line 158
    if-eqz v2, :cond_1

    .line 159
    .line 160
    const v1, 0x7f0a0965

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 168
    .line 169
    if-eqz v2, :cond_1

    .line 170
    .line 171
    move-object v1, v0

    .line 172
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 173
    .line 174
    const v2, 0x7f0a13ba

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-eqz v5, :cond_0

    .line 182
    .line 183
    const v2, 0x7f0a13bb

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    if-eqz v6, :cond_0

    .line 191
    .line 192
    new-instance v4, La/r3c0;

    .line 193
    .line 194
    invoke-direct {v4, v1, v1, v5, v6}, La/r3c0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_0
    move v1, v2

    .line 199
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :goto_0
    return-object v4

    .line 215
    :pswitch_3
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;

    .line 229
    .line 230
    const v1, 0x7f0d0535

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    const v0, 0x7f0a0895

    .line 237
    .line 238
    .line 239
    invoke-static {v5, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Landroid/widget/ImageView;

    .line 244
    .line 245
    if-eqz v1, :cond_2

    .line 246
    .line 247
    const v0, 0x7f0a089d

    .line 248
    .line 249
    .line 250
    invoke-static {v5, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Landroid/widget/ImageView;

    .line 255
    .line 256
    if-eqz v2, :cond_2

    .line 257
    .line 258
    const v0, 0x7f0a09bc

    .line 259
    .line 260
    .line 261
    invoke-static {v5, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    check-cast v6, Landroid/widget/FrameLayout;

    .line 266
    .line 267
    if-eqz v6, :cond_2

    .line 268
    .line 269
    new-instance v4, La/h3c0;

    .line 270
    .line 271
    invoke-direct {v4, v5, v1, v2}, La/h3c0;-><init>(Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 272
    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    :goto_1
    return-object v4

    .line 291
    :pswitch_4
    check-cast v5, La/a8z;

    .line 292
    .line 293
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, La/riu0;

    .line 298
    .line 299
    instance-of v2, v1, La/wmv;

    .line 300
    .line 301
    if-eqz v2, :cond_3

    .line 302
    .line 303
    move-object v4, v1

    .line 304
    check-cast v4, La/wmv;

    .line 305
    .line 306
    :cond_3
    if-eqz v4, :cond_4

    .line 307
    .line 308
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-nez v1, :cond_5

    .line 313
    .line 314
    :cond_4
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    :cond_5
    return-object v1

    .line 321
    :pswitch_5
    check-cast v5, La/a8z;

    .line 322
    .line 323
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    check-cast v1, La/riu0;

    .line 328
    .line 329
    instance-of v2, v1, La/wmv;

    .line 330
    .line 331
    if-eqz v2, :cond_6

    .line 332
    .line 333
    move-object v4, v1

    .line 334
    check-cast v4, La/wmv;

    .line 335
    .line 336
    :cond_6
    if-eqz v4, :cond_7

    .line 337
    .line 338
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-nez v1, :cond_8

    .line 343
    .line 344
    :cond_7
    check-cast v0, La/w4b0;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    :cond_8
    return-object v1

    .line 351
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 352
    .line 353
    new-instance v1, La/u1b0;

    .line 354
    .line 355
    check-cast v5, La/cvl;

    .line 356
    .line 357
    iget v2, v5, La/cvl;->a:I

    .line 358
    .line 359
    int-to-long v2, v2

    .line 360
    invoke-direct {v1, v2, v3}, La/u1b0;-><init>(J)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_7
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 370
    .line 371
    new-instance v1, La/lha0;

    .line 372
    .line 373
    check-cast v5, La/jz30;

    .line 374
    .line 375
    iget-object v2, v5, La/jz30;->b:La/jnw;

    .line 376
    .line 377
    invoke-direct {v1, v2}, La/lha0;-><init>(La/jnw;)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 387
    .line 388
    check-cast v5, La/au90;

    .line 389
    .line 390
    invoke-interface {v0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object v0

    .line 396
    :pswitch_9
    check-cast v5, La/a8z;

    .line 397
    .line 398
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    check-cast v1, La/riu0;

    .line 403
    .line 404
    instance-of v2, v1, La/wmv;

    .line 405
    .line 406
    if-eqz v2, :cond_9

    .line 407
    .line 408
    move-object v4, v1

    .line 409
    check-cast v4, La/wmv;

    .line 410
    .line 411
    :cond_9
    if-eqz v4, :cond_a

    .line 412
    .line 413
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    if-nez v1, :cond_b

    .line 418
    .line 419
    :cond_a
    check-cast v0, La/b190;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    :cond_b
    return-object v1

    .line 426
    :pswitch_a
    check-cast v5, La/a8z;

    .line 427
    .line 428
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, La/riu0;

    .line 433
    .line 434
    instance-of v2, v1, La/wmv;

    .line 435
    .line 436
    if-eqz v2, :cond_c

    .line 437
    .line 438
    move-object v4, v1

    .line 439
    check-cast v4, La/wmv;

    .line 440
    .line 441
    :cond_c
    if-eqz v4, :cond_d

    .line 442
    .line 443
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    if-nez v1, :cond_e

    .line 448
    .line 449
    :cond_d
    check-cast v0, La/xc80;

    .line 450
    .line 451
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    :cond_e
    return-object v1

    .line 456
    :pswitch_b
    check-cast v5, La/a8z;

    .line 457
    .line 458
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    check-cast v1, La/riu0;

    .line 463
    .line 464
    instance-of v2, v1, La/wmv;

    .line 465
    .line 466
    if-eqz v2, :cond_f

    .line 467
    .line 468
    move-object v4, v1

    .line 469
    check-cast v4, La/wmv;

    .line 470
    .line 471
    :cond_f
    if-eqz v4, :cond_10

    .line 472
    .line 473
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    if-nez v1, :cond_11

    .line 478
    .line 479
    :cond_10
    check-cast v0, La/kc80;

    .line 480
    .line 481
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    :cond_11
    return-object v1

    .line 486
    :pswitch_c
    check-cast v5, La/a8z;

    .line 487
    .line 488
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    check-cast v1, La/riu0;

    .line 493
    .line 494
    instance-of v2, v1, La/wmv;

    .line 495
    .line 496
    if-eqz v2, :cond_12

    .line 497
    .line 498
    move-object v4, v1

    .line 499
    check-cast v4, La/wmv;

    .line 500
    .line 501
    :cond_12
    if-eqz v4, :cond_13

    .line 502
    .line 503
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    if-nez v1, :cond_14

    .line 508
    .line 509
    :cond_13
    check-cast v0, La/p170;

    .line 510
    .line 511
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    :cond_14
    return-object v1

    .line 516
    :pswitch_d
    check-cast v5, La/a8z;

    .line 517
    .line 518
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    check-cast v1, La/riu0;

    .line 523
    .line 524
    instance-of v2, v1, La/wmv;

    .line 525
    .line 526
    if-eqz v2, :cond_15

    .line 527
    .line 528
    move-object v4, v1

    .line 529
    check-cast v4, La/wmv;

    .line 530
    .line 531
    :cond_15
    if-eqz v4, :cond_16

    .line 532
    .line 533
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-nez v1, :cond_17

    .line 538
    .line 539
    :cond_16
    check-cast v0, La/gx60;

    .line 540
    .line 541
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    :cond_17
    return-object v1

    .line 546
    :pswitch_e
    check-cast v5, La/a8z;

    .line 547
    .line 548
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    check-cast v1, La/riu0;

    .line 553
    .line 554
    instance-of v2, v1, La/wmv;

    .line 555
    .line 556
    if-eqz v2, :cond_18

    .line 557
    .line 558
    move-object v4, v1

    .line 559
    check-cast v4, La/wmv;

    .line 560
    .line 561
    :cond_18
    if-eqz v4, :cond_19

    .line 562
    .line 563
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    if-nez v1, :cond_1a

    .line 568
    .line 569
    :cond_19
    check-cast v0, La/cu60;

    .line 570
    .line 571
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    :cond_1a
    return-object v1

    .line 576
    :pswitch_f
    check-cast v5, La/a8z;

    .line 577
    .line 578
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    check-cast v1, La/riu0;

    .line 583
    .line 584
    instance-of v2, v1, La/wmv;

    .line 585
    .line 586
    if-eqz v2, :cond_1b

    .line 587
    .line 588
    move-object v4, v1

    .line 589
    check-cast v4, La/wmv;

    .line 590
    .line 591
    :cond_1b
    if-eqz v4, :cond_1c

    .line 592
    .line 593
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    if-nez v1, :cond_1d

    .line 598
    .line 599
    :cond_1c
    check-cast v0, La/xt60;

    .line 600
    .line 601
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    :cond_1d
    return-object v1

    .line 606
    :pswitch_10
    check-cast v5, La/a8z;

    .line 607
    .line 608
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    check-cast v1, La/riu0;

    .line 613
    .line 614
    instance-of v2, v1, La/wmv;

    .line 615
    .line 616
    if-eqz v2, :cond_1e

    .line 617
    .line 618
    move-object v4, v1

    .line 619
    check-cast v4, La/wmv;

    .line 620
    .line 621
    :cond_1e
    if-eqz v4, :cond_1f

    .line 622
    .line 623
    invoke-interface {v4}, La/wmv;->n()La/miu0;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    if-nez v1, :cond_20

    .line 628
    .line 629
    :cond_1f
    check-cast v0, La/gs60;

    .line 630
    .line 631
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    :cond_20
    return-object v1

    .line 636
    :pswitch_11
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 637
    .line 638
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 650
    .line 651
    const v1, 0x7f0d04f8

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0, v1, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 659
    .line 660
    .line 661
    const v1, 0x7f0a04a8

    .line 662
    .line 663
    .line 664
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    move-object v7, v2

    .line 669
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 670
    .line 671
    if-eqz v7, :cond_21

    .line 672
    .line 673
    const v1, 0x7f0a04d9

    .line 674
    .line 675
    .line 676
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    move-object v8, v2

    .line 681
    check-cast v8, Landroid/widget/ImageView;

    .line 682
    .line 683
    if-eqz v8, :cond_21

    .line 684
    .line 685
    const v1, 0x7f0a055f

    .line 686
    .line 687
    .line 688
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    move-object v9, v2

    .line 693
    check-cast v9, Landroid/widget/FrameLayout;

    .line 694
    .line 695
    if-eqz v9, :cond_21

    .line 696
    .line 697
    const v1, 0x7f0a05bf

    .line 698
    .line 699
    .line 700
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    move-object v10, v2

    .line 705
    check-cast v10, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 706
    .line 707
    if-eqz v10, :cond_21

    .line 708
    .line 709
    const v1, 0x7f0a0606

    .line 710
    .line 711
    .line 712
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    move-object v11, v2

    .line 717
    check-cast v11, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 718
    .line 719
    if-eqz v11, :cond_21

    .line 720
    .line 721
    const v1, 0x7f0a0a9e

    .line 722
    .line 723
    .line 724
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    move-object v12, v2

    .line 729
    check-cast v12, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 730
    .line 731
    if-eqz v12, :cond_21

    .line 732
    .line 733
    const v1, 0x7f0a0acd

    .line 734
    .line 735
    .line 736
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    move-object v13, v2

    .line 741
    check-cast v13, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 742
    .line 743
    if-eqz v13, :cond_21

    .line 744
    .line 745
    const v1, 0x7f0a0d9f

    .line 746
    .line 747
    .line 748
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    move-object v14, v2

    .line 753
    check-cast v14, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 754
    .line 755
    if-eqz v14, :cond_21

    .line 756
    .line 757
    const v1, 0x7f0a0e1d

    .line 758
    .line 759
    .line 760
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    move-object v15, v2

    .line 765
    check-cast v15, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 766
    .line 767
    if-eqz v15, :cond_21

    .line 768
    .line 769
    const v1, 0x7f0a0fa6

    .line 770
    .line 771
    .line 772
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    move-object/from16 v16, v2

    .line 777
    .line 778
    check-cast v16, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 779
    .line 780
    if-eqz v16, :cond_21

    .line 781
    .line 782
    const v1, 0x7f0a12f2

    .line 783
    .line 784
    .line 785
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    move-object/from16 v17, v2

    .line 790
    .line 791
    check-cast v17, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 792
    .line 793
    if-eqz v17, :cond_21

    .line 794
    .line 795
    const v1, 0x7f0a1476

    .line 796
    .line 797
    .line 798
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    move-object/from16 v18, v2

    .line 803
    .line 804
    check-cast v18, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 805
    .line 806
    if-eqz v18, :cond_21

    .line 807
    .line 808
    new-instance v5, La/w860;

    .line 809
    .line 810
    move-object v6, v0

    .line 811
    check-cast v6, Landroid/widget/LinearLayout;

    .line 812
    .line 813
    invoke-direct/range {v5 .. v18}, La/w860;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;)V

    .line 814
    .line 815
    .line 816
    move-object v4, v5

    .line 817
    goto :goto_2

    .line 818
    :cond_21
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    :goto_2
    return-object v4

    .line 834
    :pswitch_12
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 835
    .line 836
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 848
    .line 849
    const v1, 0x7f0d04f7

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v1, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 857
    .line 858
    .line 859
    const v1, 0x7f0a0447

    .line 860
    .line 861
    .line 862
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    check-cast v2, Landroid/widget/TextView;

    .line 867
    .line 868
    if-eqz v2, :cond_22

    .line 869
    .line 870
    const v1, 0x7f0a0938

    .line 871
    .line 872
    .line 873
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 874
    .line 875
    .line 876
    move-result-object v5

    .line 877
    check-cast v5, Landroid/widget/TextView;

    .line 878
    .line 879
    if-eqz v5, :cond_22

    .line 880
    .line 881
    new-instance v4, La/u860;

    .line 882
    .line 883
    check-cast v0, Landroid/widget/LinearLayout;

    .line 884
    .line 885
    invoke-direct {v4, v0, v2, v5}, La/u860;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 886
    .line 887
    .line 888
    goto :goto_3

    .line 889
    :cond_22
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    :goto_3
    return-object v4

    .line 905
    :pswitch_13
    check-cast v0, La/zl50;

    .line 906
    .line 907
    check-cast v5, La/cty;

    .line 908
    .line 909
    iget-object v0, v0, La/zl50;->e:La/a8z;

    .line 910
    .line 911
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    check-cast v0, Ljava/util/List;

    .line 916
    .line 917
    if-nez v0, :cond_23

    .line 918
    .line 919
    sget-object v0, La/iun;->a:La/iun;

    .line 920
    .line 921
    :cond_23
    new-instance v1, Ljava/util/ArrayList;

    .line 922
    .line 923
    const/16 v2, 0xa

    .line 924
    .line 925
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 930
    .line 931
    .line 932
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 937
    .line 938
    .line 939
    move-result v2

    .line 940
    if-eqz v2, :cond_24

    .line 941
    .line 942
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    check-cast v2, La/tft0;

    .line 947
    .line 948
    invoke-virtual {v2, v5}, La/tft0;->l0(La/cty;)La/tft0;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    goto :goto_4

    .line 956
    :cond_24
    return-object v1

    .line 957
    :pswitch_14
    check-cast v0, La/zv40;

    .line 958
    .line 959
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    check-cast v5, La/zv40;

    .line 971
    .line 972
    const v1, 0x7f0d06cc

    .line 973
    .line 974
    .line 975
    invoke-virtual {v0, v1, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 980
    .line 981
    .line 982
    const v1, 0x7f0a0747

    .line 983
    .line 984
    .line 985
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    check-cast v2, Landroid/widget/ImageView;

    .line 990
    .line 991
    if-eqz v2, :cond_25

    .line 992
    .line 993
    const v1, 0x7f0a0fce

    .line 994
    .line 995
    .line 996
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 997
    .line 998
    .line 999
    move-result-object v5

    .line 1000
    check-cast v5, Landroid/widget/TextView;

    .line 1001
    .line 1002
    if-eqz v5, :cond_25

    .line 1003
    .line 1004
    new-instance v4, La/qku0;

    .line 1005
    .line 1006
    check-cast v0, Landroid/widget/FrameLayout;

    .line 1007
    .line 1008
    invoke-direct {v4, v0, v2, v5}, La/qku0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_5

    .line 1012
    :cond_25
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    :goto_5
    return-object v4

    .line 1028
    :pswitch_15
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1029
    .line 1030
    check-cast v5, La/y3r0;

    .line 1031
    .line 1032
    iget v1, v5, La/y3r0;->a:I

    .line 1033
    .line 1034
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    iget-object v2, v5, La/y3r0;->b:Ljava/lang/String;

    .line 1039
    .line 1040
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    :pswitch_16
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1047
    .line 1048
    check-cast v5, La/qa40;

    .line 1049
    .line 1050
    iget-wide v1, v5, La/qa40;->a:J

    .line 1051
    .line 1052
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1060
    .line 1061
    return-object v0

    .line 1062
    :pswitch_17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1063
    .line 1064
    check-cast v5, La/q2k0;

    .line 1065
    .line 1066
    iget-object v1, v5, La/q2k0;->a:La/yi5;

    .line 1067
    .line 1068
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    return-object v0

    .line 1074
    :pswitch_18
    check-cast v0, La/gt30;

    .line 1075
    .line 1076
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    check-cast v5, La/gt30;

    .line 1088
    .line 1089
    const v1, 0x7f0d06b5

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v0, v1, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1097
    .line 1098
    .line 1099
    const v1, 0x7f0a07fd

    .line 1100
    .line 1101
    .line 1102
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    check-cast v2, Landroid/widget/ImageView;

    .line 1107
    .line 1108
    if-eqz v2, :cond_26

    .line 1109
    .line 1110
    const v1, 0x7f0a083a

    .line 1111
    .line 1112
    .line 1113
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v5

    .line 1117
    check-cast v5, Lorg/xplatform/bonus_games/impl/core/presentation/views/ForegroundImageView;

    .line 1118
    .line 1119
    if-eqz v5, :cond_26

    .line 1120
    .line 1121
    new-instance v4, La/ciu0;

    .line 1122
    .line 1123
    check-cast v0, Landroid/widget/FrameLayout;

    .line 1124
    .line 1125
    invoke-direct {v4, v0, v2, v5}, La/ciu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Lorg/xplatform/bonus_games/impl/core/presentation/views/ForegroundImageView;)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_6

    .line 1129
    :cond_26
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    :goto_6
    return-object v4

    .line 1145
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1146
    .line 1147
    new-instance v1, La/og30;

    .line 1148
    .line 1149
    check-cast v5, La/mg30;

    .line 1150
    .line 1151
    iget-object v2, v5, La/mg30;->a:La/lg30;

    .line 1152
    .line 1153
    invoke-direct {v1, v2}, La/og30;-><init>(La/lg30;)V

    .line 1154
    .line 1155
    .line 1156
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1160
    .line 1161
    return-object v0

    .line 1162
    :pswitch_1a
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 1163
    .line 1164
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    move-object v7, v5

    .line 1176
    check-cast v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 1177
    .line 1178
    const v1, 0x7f0d06b4

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1182
    .line 1183
    .line 1184
    const v0, 0x7f0a0536

    .line 1185
    .line 1186
    .line 1187
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    move-object v8, v1

    .line 1192
    check-cast v8, Landroidx/constraintlayout/helper/widget/Flow;

    .line 1193
    .line 1194
    if-eqz v8, :cond_27

    .line 1195
    .line 1196
    const v0, 0x7f0a067c

    .line 1197
    .line 1198
    .line 1199
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v1

    .line 1203
    move-object v9, v1

    .line 1204
    check-cast v9, Landroidx/constraintlayout/widget/Group;

    .line 1205
    .line 1206
    if-eqz v9, :cond_27

    .line 1207
    .line 1208
    const v0, 0x7f0a10af

    .line 1209
    .line 1210
    .line 1211
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    check-cast v1, Landroid/widget/TextView;

    .line 1216
    .line 1217
    if-eqz v1, :cond_27

    .line 1218
    .line 1219
    const v0, 0x7f0a10b0

    .line 1220
    .line 1221
    .line 1222
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v1

    .line 1226
    check-cast v1, Landroid/widget/TextView;

    .line 1227
    .line 1228
    if-eqz v1, :cond_27

    .line 1229
    .line 1230
    const v0, 0x7f0a1158

    .line 1231
    .line 1232
    .line 1233
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v1

    .line 1237
    move-object v10, v1

    .line 1238
    check-cast v10, Landroid/widget/TextView;

    .line 1239
    .line 1240
    if-eqz v10, :cond_27

    .line 1241
    .line 1242
    const v0, 0x7f0a117c

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    move-object v11, v1

    .line 1250
    check-cast v11, Landroid/widget/TextView;

    .line 1251
    .line 1252
    if-eqz v11, :cond_27

    .line 1253
    .line 1254
    const v0, 0x7f0a1216

    .line 1255
    .line 1256
    .line 1257
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    move-object v12, v1

    .line 1262
    check-cast v12, Landroid/widget/TextView;

    .line 1263
    .line 1264
    if-eqz v12, :cond_27

    .line 1265
    .line 1266
    const v0, 0x7f0a125d

    .line 1267
    .line 1268
    .line 1269
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    move-object v13, v1

    .line 1274
    check-cast v13, Landroid/widget/TextView;

    .line 1275
    .line 1276
    if-eqz v13, :cond_27

    .line 1277
    .line 1278
    new-instance v6, La/biu0;

    .line 1279
    .line 1280
    invoke-direct/range {v6 .. v13}, La/biu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1281
    .line 1282
    .line 1283
    move-object v4, v6

    .line 1284
    goto :goto_7

    .line 1285
    :cond_27
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v1

    .line 1289
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1298
    .line 1299
    .line 1300
    :goto_7
    return-object v4

    .line 1301
    :pswitch_1b
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 1302
    .line 1303
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    check-cast v5, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 1315
    .line 1316
    const v1, 0x7f0d06b3

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1320
    .line 1321
    .line 1322
    const v0, 0x7f0a1089

    .line 1323
    .line 1324
    .line 1325
    invoke-static {v5, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    check-cast v1, Landroid/widget/TextView;

    .line 1330
    .line 1331
    if-eqz v1, :cond_28

    .line 1332
    .line 1333
    const v0, 0x7f0a1162

    .line 1334
    .line 1335
    .line 1336
    invoke-static {v5, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    check-cast v2, Landroid/widget/TextView;

    .line 1341
    .line 1342
    if-eqz v2, :cond_28

    .line 1343
    .line 1344
    new-instance v4, La/aiu0;

    .line 1345
    .line 1346
    invoke-direct {v4, v5, v1, v2}, La/aiu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1347
    .line 1348
    .line 1349
    goto :goto_8

    .line 1350
    :cond_28
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v1

    .line 1354
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    :goto_8
    return-object v4

    .line 1366
    :pswitch_1c
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1367
    .line 1368
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v0

    .line 1372
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v0

    .line 1376
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1377
    .line 1378
    .line 1379
    move-object v7, v5

    .line 1380
    check-cast v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 1381
    .line 1382
    const v1, 0x7f0d06b2

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1386
    .line 1387
    .line 1388
    const v0, 0x7f0a0234

    .line 1389
    .line 1390
    .line 1391
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v1

    .line 1395
    move-object v8, v1

    .line 1396
    check-cast v8, Landroidx/compose/ui/platform/ComposeView;

    .line 1397
    .line 1398
    if-eqz v8, :cond_29

    .line 1399
    .line 1400
    const v0, 0x7f0a02fa

    .line 1401
    .line 1402
    .line 1403
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v1

    .line 1407
    move-object v9, v1

    .line 1408
    check-cast v9, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 1409
    .line 1410
    if-eqz v9, :cond_29

    .line 1411
    .line 1412
    const v0, 0x7f0a02fb

    .line 1413
    .line 1414
    .line 1415
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    move-object v10, v1

    .line 1420
    check-cast v10, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 1421
    .line 1422
    if-eqz v10, :cond_29

    .line 1423
    .line 1424
    const v0, 0x7f0a0531

    .line 1425
    .line 1426
    .line 1427
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v1

    .line 1431
    move-object v11, v1

    .line 1432
    check-cast v11, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1433
    .line 1434
    if-eqz v11, :cond_29

    .line 1435
    .line 1436
    const v0, 0x7f0a0534

    .line 1437
    .line 1438
    .line 1439
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v1

    .line 1443
    move-object v12, v1

    .line 1444
    check-cast v12, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 1445
    .line 1446
    if-eqz v12, :cond_29

    .line 1447
    .line 1448
    const v0, 0x7f0a07fe

    .line 1449
    .line 1450
    .line 1451
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v1

    .line 1455
    move-object v13, v1

    .line 1456
    check-cast v13, Landroid/widget/ImageView;

    .line 1457
    .line 1458
    if-eqz v13, :cond_29

    .line 1459
    .line 1460
    const v0, 0x7f0a0c7e

    .line 1461
    .line 1462
    .line 1463
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    move-object v14, v1

    .line 1468
    check-cast v14, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 1469
    .line 1470
    if-eqz v14, :cond_29

    .line 1471
    .line 1472
    const v0, 0x7f0a0c8e

    .line 1473
    .line 1474
    .line 1475
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v1

    .line 1479
    move-object v15, v1

    .line 1480
    check-cast v15, Landroidx/recyclerview/widget/RecyclerView;

    .line 1481
    .line 1482
    if-eqz v15, :cond_29

    .line 1483
    .line 1484
    const v0, 0x7f0a13ee

    .line 1485
    .line 1486
    .line 1487
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v1

    .line 1491
    move-object/from16 v16, v1

    .line 1492
    .line 1493
    check-cast v16, Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 1494
    .line 1495
    if-eqz v16, :cond_29

    .line 1496
    .line 1497
    const v0, 0x7f0a142d

    .line 1498
    .line 1499
    .line 1500
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v1

    .line 1504
    move-object/from16 v17, v1

    .line 1505
    .line 1506
    check-cast v17, Landroidx/viewpager2/widget/ViewPager2;

    .line 1507
    .line 1508
    if-eqz v17, :cond_29

    .line 1509
    .line 1510
    new-instance v6, La/zhu0;

    .line 1511
    .line 1512
    invoke-direct/range {v6 .. v17}, La/zhu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;Landroidx/compose/ui/platform/ComposeView;Lorg/xplatform/ui_core/circleindicator/CircleIndicator;Lorg/xplatform/ui_core/circleindicator/CircleIndicator;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;Landroid/widget/ImageView;Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;Landroidx/recyclerview/widget/RecyclerView;Lcom/facebook/shimmer/ShimmerFrameLayout;Landroidx/viewpager2/widget/ViewPager2;)V

    .line 1513
    .line 1514
    .line 1515
    move-object v4, v6

    .line 1516
    goto :goto_9

    .line 1517
    :cond_29
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1530
    .line 1531
    .line 1532
    :goto_9
    return-object v4

    .line 1533
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
