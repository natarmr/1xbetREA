.class public final La/nsr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/baz;La/sqe0;La/mie0;)V
    .locals 0

    .line 1
    const/16 p2, 0x17

    .line 2
    .line 3
    iput-byte p2, p0, La/nsr;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/nsr;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, La/nsr;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/nsr;->a:B

    iput-object p1, p0, La/nsr;->b:Ljava/lang/Object;

    iput-object p2, p0, La/nsr;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nsr;->a:B

    .line 4
    .line 5
    const v2, 0x7f0a1380

    .line 6
    .line 7
    .line 8
    const v3, 0x7f0a0b99

    .line 9
    .line 10
    .line 11
    const v4, 0x7f0a0394

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    const/4 v6, 0x0

    .line 16
    const-string v7, "Missing required view with ID: "

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    iget-object v9, v0, La/nsr;->c:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, La/nsr;->b:Ljava/lang/Object;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceView;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v9, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceView;

    .line 40
    .line 41
    const v1, 0x7f0d04aa

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v9, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    const v1, 0x7f0a0828

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroid/widget/ImageView;

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    const v1, 0x7f0a0da8

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ShimmerLinearLayout;

    .line 70
    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    const v1, 0x7f0a105d

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    const v1, 0x7f0a1062

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Landroid/widget/TextView;

    .line 92
    .line 93
    if-eqz v3, :cond_0

    .line 94
    .line 95
    const v1, 0x7f0a1098

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Landroid/widget/TextView;

    .line 103
    .line 104
    if-eqz v3, :cond_0

    .line 105
    .line 106
    new-instance v8, La/j620;

    .line 107
    .line 108
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 109
    .line 110
    invoke-direct {v8, v0, v2, v3}, La/j620;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_0
    return-object v8

    .line 130
    :pswitch_0
    check-cast v0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    check-cast v9, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;

    .line 144
    .line 145
    const v1, 0x7f0d06ae

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1, v9, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    const v1, 0x7f0a0166

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    move-object v11, v2

    .line 163
    check-cast v11, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 164
    .line 165
    if-eqz v11, :cond_1

    .line 166
    .line 167
    const v1, 0x7f0a0346

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move-object v12, v2

    .line 175
    check-cast v12, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 176
    .line 177
    if-eqz v12, :cond_1

    .line 178
    .line 179
    const v1, 0x7f0a0444

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    move-object v13, v2

    .line 187
    check-cast v13, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 188
    .line 189
    if-eqz v13, :cond_1

    .line 190
    .line 191
    const v1, 0x7f0a06f5

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object v14, v2

    .line 199
    check-cast v14, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 200
    .line 201
    if-eqz v14, :cond_1

    .line 202
    .line 203
    const v1, 0x7f0a0701

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    move-object v15, v2

    .line 211
    check-cast v15, Landroid/widget/TextView;

    .line 212
    .line 213
    if-eqz v15, :cond_1

    .line 214
    .line 215
    const v1, 0x7f0a0bfa

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-object/from16 v16, v2

    .line 223
    .line 224
    check-cast v16, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 225
    .line 226
    if-eqz v16, :cond_1

    .line 227
    .line 228
    const v1, 0x7f0a0e45

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    move-object/from16 v17, v2

    .line 236
    .line 237
    check-cast v17, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 238
    .line 239
    if-eqz v17, :cond_1

    .line 240
    .line 241
    new-instance v9, La/yhu0;

    .line 242
    .line 243
    move-object v10, v0

    .line 244
    check-cast v10, Landroid/widget/LinearLayout;

    .line 245
    .line 246
    invoke-direct/range {v9 .. v17}, La/yhu0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;Landroid/widget/TextView;Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;)V

    .line 247
    .line 248
    .line 249
    move-object v8, v9

    .line 250
    goto :goto_1

    .line 251
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :goto_1
    return-object v8

    .line 267
    :pswitch_1
    check-cast v0, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 268
    .line 269
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    check-cast v9, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 281
    .line 282
    const v1, 0x7f0d0687

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v1, v9, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    move-object v11, v0

    .line 293
    check-cast v11, Lcom/google/android/material/card/MaterialCardView;

    .line 294
    .line 295
    const v1, 0x7f0a0731

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    move-object v13, v2

    .line 303
    check-cast v13, Landroid/widget/ImageView;

    .line 304
    .line 305
    if-eqz v13, :cond_2

    .line 306
    .line 307
    const v1, 0x7f0a0732

    .line 308
    .line 309
    .line 310
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    move-object v14, v2

    .line 315
    check-cast v14, Landroid/widget/ImageView;

    .line 316
    .line 317
    if-eqz v14, :cond_2

    .line 318
    .line 319
    const v1, 0x7f0a0743

    .line 320
    .line 321
    .line 322
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    move-object v15, v2

    .line 327
    check-cast v15, Landroid/widget/TextView;

    .line 328
    .line 329
    if-eqz v15, :cond_2

    .line 330
    .line 331
    const v1, 0x7f0a0773

    .line 332
    .line 333
    .line 334
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    move-object/from16 v16, v2

    .line 339
    .line 340
    check-cast v16, Landroid/widget/LinearLayout;

    .line 341
    .line 342
    if-eqz v16, :cond_2

    .line 343
    .line 344
    const v1, 0x7f0a0f1d

    .line 345
    .line 346
    .line 347
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    move-object/from16 v17, v2

    .line 352
    .line 353
    check-cast v17, Landroid/widget/TextView;

    .line 354
    .line 355
    if-eqz v17, :cond_2

    .line 356
    .line 357
    new-instance v10, La/agu0;

    .line 358
    .line 359
    move-object v12, v11

    .line 360
    invoke-direct/range {v10 .. v17}, La/agu0;-><init>(Lcom/google/android/material/card/MaterialCardView;Lcom/google/android/material/card/MaterialCardView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 361
    .line 362
    .line 363
    move-object v8, v10

    .line 364
    goto :goto_2

    .line 365
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :goto_2
    return-object v8

    .line 381
    :pswitch_2
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 382
    .line 383
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    check-cast v9, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 395
    .line 396
    const v1, 0x7f0d06a9

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 400
    .line 401
    .line 402
    const v0, 0x7f0a0861

    .line 403
    .line 404
    .line 405
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, Landroid/widget/ImageView;

    .line 410
    .line 411
    if-eqz v1, :cond_3

    .line 412
    .line 413
    const v0, 0x7f0a0895

    .line 414
    .line 415
    .line 416
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    check-cast v2, Landroid/widget/ImageView;

    .line 421
    .line 422
    if-eqz v2, :cond_3

    .line 423
    .line 424
    const v0, 0x7f0a09bc

    .line 425
    .line 426
    .line 427
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    check-cast v3, Landroid/widget/FrameLayout;

    .line 432
    .line 433
    if-eqz v3, :cond_3

    .line 434
    .line 435
    new-instance v8, La/uhu0;

    .line 436
    .line 437
    invoke-direct {v8, v9, v1, v2, v3}, La/uhu0;-><init>(Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;)V

    .line 438
    .line 439
    .line 440
    goto :goto_3

    .line 441
    :cond_3
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    :goto_3
    return-object v8

    .line 457
    :pswitch_3
    check-cast v0, La/oea0;

    .line 458
    .line 459
    iget-object v0, v0, La/oea0;->a:Ljava/lang/String;

    .line 460
    .line 461
    check-cast v9, La/gna0;

    .line 462
    .line 463
    iget-object v1, v9, La/gna0;->a:La/pz40;

    .line 464
    .line 465
    check-cast v1, La/hgk0;

    .line 466
    .line 467
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, Ljava/lang/String;

    .line 472
    .line 473
    iget-object v2, v9, La/gna0;->c:La/agk0;

    .line 474
    .line 475
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-eqz v1, :cond_4

    .line 480
    .line 481
    invoke-virtual {v2}, La/agk0;->l()F

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    goto :goto_4

    .line 490
    :cond_4
    iget-object v1, v9, La/gna0;->b:La/pz40;

    .line 491
    .line 492
    check-cast v1, La/hgk0;

    .line 493
    .line 494
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    check-cast v1, Ljava/lang/String;

    .line 499
    .line 500
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-eqz v0, :cond_5

    .line 505
    .line 506
    const/high16 v0, 0x3f800000    # 1.0f

    .line 507
    .line 508
    invoke-virtual {v2}, La/agk0;->l()F

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    sub-float/2addr v0, v1

    .line 513
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    :cond_5
    :goto_4
    return-object v8

    .line 518
    :pswitch_4
    check-cast v0, Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;

    .line 519
    .line 520
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    check-cast v9, Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;

    .line 532
    .line 533
    const v1, 0x7f0d0479

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v1, v9, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 541
    .line 542
    .line 543
    const v1, 0x7f0a093c

    .line 544
    .line 545
    .line 546
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    check-cast v2, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 551
    .line 552
    if-eqz v2, :cond_6

    .line 553
    .line 554
    const v1, 0x7f0a093d

    .line 555
    .line 556
    .line 557
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    check-cast v3, Landroid/widget/TextView;

    .line 562
    .line 563
    if-eqz v3, :cond_6

    .line 564
    .line 565
    const v1, 0x7f0a093e

    .line 566
    .line 567
    .line 568
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    check-cast v4, Landroid/widget/TextView;

    .line 573
    .line 574
    if-eqz v4, :cond_6

    .line 575
    .line 576
    new-instance v8, La/s6z;

    .line 577
    .line 578
    check-cast v0, Landroid/widget/FrameLayout;

    .line 579
    .line 580
    invoke-direct {v8, v0, v2, v3, v4}, La/s6z;-><init>(Landroid/widget/FrameLayout;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 581
    .line 582
    .line 583
    goto :goto_5

    .line 584
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    :goto_5
    return-object v8

    .line 600
    :pswitch_5
    check-cast v0, La/baz;

    .line 601
    .line 602
    check-cast v9, La/mie0;

    .line 603
    .line 604
    iget-object v0, v0, La/baz;->b:La/f7u;

    .line 605
    .line 606
    iget-object v0, v0, La/f7u;->b:Ljava/lang/Object;

    .line 607
    .line 608
    iget-object v0, v9, La/mie0;->a:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v0, La/d0d0;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    return-object v8

    .line 616
    :pswitch_6
    check-cast v0, La/s9z;

    .line 617
    .line 618
    check-cast v9, La/wqe0;

    .line 619
    .line 620
    new-instance v1, La/r9z;

    .line 621
    .line 622
    iget-object v0, v0, La/s9z;->a:La/f7u;

    .line 623
    .line 624
    invoke-direct {v1, v0, v9}, La/r9z;-><init>(La/f7u;La/wqe0;)V

    .line 625
    .line 626
    .line 627
    return-object v1

    .line 628
    :pswitch_7
    check-cast v0, La/csy;

    .line 629
    .line 630
    check-cast v9, La/nzs0;

    .line 631
    .line 632
    iget-object v1, v0, La/csy;->b:La/jqy;

    .line 633
    .line 634
    iget-object v1, v1, La/jqy;->c:La/fqy;

    .line 635
    .line 636
    if-eqz v1, :cond_7

    .line 637
    .line 638
    iget-object v2, v0, La/csy;->a:La/pry;

    .line 639
    .line 640
    invoke-interface {v2}, La/dre0;->K()La/ihy;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-interface {v2}, La/elc;->j()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    invoke-static {v2}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    new-instance v3, La/aaw;

    .line 653
    .line 654
    const/16 v4, 0x15

    .line 655
    .line 656
    invoke-direct {v3, v0, v4}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 657
    .line 658
    .line 659
    const/4 v0, 0x4

    .line 660
    invoke-static {v1, v2, v9, v3, v0}, La/jwb;->Z(La/fqy;Ljava/lang/ClassLoader;La/nzs0;Lkotlin/jvm/functions/Function0;I)La/v2;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    return-object v0

    .line 665
    :cond_7
    const-string v0, "type"

    .line 666
    .line 667
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v8

    .line 671
    :pswitch_8
    check-cast v0, La/wsy;

    .line 672
    .line 673
    check-cast v9, La/xgy;

    .line 674
    .line 675
    invoke-virtual {v0}, La/wsy;->S()La/iys0;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-interface {v0}, La/iys0;->n()La/foc;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    instance-of v1, v0, La/wm40;

    .line 684
    .line 685
    if-eqz v1, :cond_b

    .line 686
    .line 687
    move-object v1, v0

    .line 688
    check-cast v1, La/wm40;

    .line 689
    .line 690
    invoke-static {v1}, La/xtt0;->q(La/wm40;)Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    if-eqz v1, :cond_a

    .line 695
    .line 696
    iget-object v2, v9, La/xgy;->b:Ljava/lang/Class;

    .line 697
    .line 698
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    if-eqz v3, :cond_8

    .line 707
    .line 708
    invoke-virtual {v2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 709
    .line 710
    .line 711
    move-result-object v8

    .line 712
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    goto :goto_6

    .line 716
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-static {v1, v3}, La/tx3;->H(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    if-ltz v1, :cond_9

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    aget-object v8, v0, v1

    .line 734
    .line 735
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    goto :goto_6

    .line 739
    :cond_9
    const-string v1, "No superclass of "

    .line 740
    .line 741
    const-string v2, " in Java reflection for "

    .line 742
    .line 743
    invoke-static {v1, v9, v2, v0}, La/udk;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    goto :goto_6

    .line 747
    :cond_a
    const-string v1, "Unsupported superclass of "

    .line 748
    .line 749
    const-string v2, ": "

    .line 750
    .line 751
    invoke-static {v1, v9, v2, v0}, La/udk;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    goto :goto_6

    .line 755
    :cond_b
    const-string v1, "Supertype not a class: "

    .line 756
    .line 757
    invoke-static {v0, v1}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    :goto_6
    return-object v8

    .line 761
    :pswitch_9
    check-cast v0, La/l9z;

    .line 762
    .line 763
    check-cast v9, La/wm40;

    .line 764
    .line 765
    new-instance v1, La/l9z;

    .line 766
    .line 767
    iget-object v2, v0, La/l9z;->j:La/f7u;

    .line 768
    .line 769
    iget-object v3, v2, La/f7u;->b:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v3, La/v7i;

    .line 772
    .line 773
    new-instance v10, La/v7i;

    .line 774
    .line 775
    iget-object v4, v3, La/v7i;->i:Ljava/lang/Object;

    .line 776
    .line 777
    move-object v11, v4

    .line 778
    check-cast v11, La/eu00;

    .line 779
    .line 780
    iget-object v4, v3, La/v7i;->g:Ljava/lang/Object;

    .line 781
    .line 782
    move-object v12, v4

    .line 783
    check-cast v12, La/zx10;

    .line 784
    .line 785
    iget-object v4, v3, La/v7i;->e:Ljava/lang/Object;

    .line 786
    .line 787
    move-object v13, v4

    .line 788
    check-cast v13, La/yox;

    .line 789
    .line 790
    iget-object v4, v3, La/v7i;->f:Ljava/lang/Object;

    .line 791
    .line 792
    move-object v14, v4

    .line 793
    check-cast v14, La/jfk;

    .line 794
    .line 795
    iget-object v4, v3, La/v7i;->c:Ljava/lang/Object;

    .line 796
    .line 797
    move-object v15, v4

    .line 798
    check-cast v15, La/zie0;

    .line 799
    .line 800
    iget-object v4, v3, La/v7i;->d:Ljava/lang/Object;

    .line 801
    .line 802
    move-object/from16 v16, v4

    .line 803
    .line 804
    check-cast v16, La/epi0;

    .line 805
    .line 806
    iget-object v4, v3, La/v7i;->h:Ljava/lang/Object;

    .line 807
    .line 808
    move-object/from16 v17, v4

    .line 809
    .line 810
    check-cast v17, La/lwf;

    .line 811
    .line 812
    iget-object v4, v3, La/v7i;->j:Ljava/lang/Object;

    .line 813
    .line 814
    move-object/from16 v18, v4

    .line 815
    .line 816
    check-cast v18, La/zm40;

    .line 817
    .line 818
    iget-object v4, v3, La/v7i;->k:Ljava/lang/Object;

    .line 819
    .line 820
    move-object/from16 v19, v4

    .line 821
    .line 822
    check-cast v19, La/xre0;

    .line 823
    .line 824
    iget-object v4, v3, La/v7i;->l:Ljava/lang/Object;

    .line 825
    .line 826
    move-object/from16 v20, v4

    .line 827
    .line 828
    check-cast v20, La/a93;

    .line 829
    .line 830
    iget-object v4, v3, La/v7i;->a:Ljava/lang/Object;

    .line 831
    .line 832
    move-object/from16 v21, v4

    .line 833
    .line 834
    check-cast v21, La/cge0;

    .line 835
    .line 836
    iget-object v4, v3, La/v7i;->m:Ljava/lang/Object;

    .line 837
    .line 838
    move-object/from16 v22, v4

    .line 839
    .line 840
    check-cast v22, La/km50;

    .line 841
    .line 842
    iget-object v4, v3, La/v7i;->b:Ljava/lang/Object;

    .line 843
    .line 844
    move-object/from16 v23, v4

    .line 845
    .line 846
    check-cast v23, La/cgx0;

    .line 847
    .line 848
    iget-object v3, v3, La/v7i;->n:Ljava/lang/Object;

    .line 849
    .line 850
    move-object/from16 v24, v3

    .line 851
    .line 852
    check-cast v24, La/bek;

    .line 853
    .line 854
    invoke-direct/range {v10 .. v24}, La/v7i;-><init>(La/eu00;La/zx10;La/yox;La/jfk;La/zie0;La/epi0;La/lwf;La/zm40;La/xre0;La/a93;La/cge0;La/km50;La/cgx0;La/bek;)V

    .line 855
    .line 856
    .line 857
    new-instance v3, La/f7u;

    .line 858
    .line 859
    iget-object v4, v2, La/f7u;->c:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v4, La/mzs0;

    .line 862
    .line 863
    iget-object v2, v2, La/f7u;->d:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v2, La/a8z;

    .line 866
    .line 867
    invoke-direct {v3, v10, v4, v2}, La/f7u;-><init>(La/v7i;La/mzs0;La/a8z;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0}, La/jlc;->j()La/vjj;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    iget-object v0, v0, La/l9z;->h:La/mqe0;

    .line 878
    .line 879
    invoke-direct {v1, v3, v2, v0, v9}, La/l9z;-><init>(La/f7u;La/vjj;La/mqe0;La/wm40;)V

    .line 880
    .line 881
    .line 882
    return-object v1

    .line 883
    :pswitch_a
    check-cast v0, La/mey;

    .line 884
    .line 885
    check-cast v9, La/eu00;

    .line 886
    .line 887
    invoke-virtual {v0}, La/mey;->e()La/iey;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    iget-object v1, v1, La/iey;->a:La/zm40;

    .line 892
    .line 893
    sget-object v2, La/fey;->d:La/sqt;

    .line 894
    .line 895
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    sget-object v2, La/fey;->h:La/qlc;

    .line 899
    .line 900
    new-instance v3, La/n660;

    .line 901
    .line 902
    invoke-virtual {v0}, La/mey;->e()La/iey;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    iget-object v0, v0, La/iey;->a:La/zm40;

    .line 907
    .line 908
    invoke-direct {v3, v9, v0}, La/n660;-><init>(La/eu00;La/ym40;)V

    .line 909
    .line 910
    .line 911
    invoke-static {v1, v2, v3}, La/obb;->X(La/ym40;La/qlc;La/n660;)La/wm40;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-virtual {v0}, La/wm40;->I()La/kzj0;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    return-object v0

    .line 920
    :pswitch_b
    check-cast v0, La/jey;

    .line 921
    .line 922
    check-cast v9, La/eu00;

    .line 923
    .line 924
    new-instance v1, La/mey;

    .line 925
    .line 926
    invoke-virtual {v0}, La/ary;->l()La/zm40;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    new-instance v3, La/aaw;

    .line 934
    .line 935
    const/16 v4, 0xf

    .line 936
    .line 937
    invoke-direct {v3, v0, v4}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 938
    .line 939
    .line 940
    invoke-direct {v1, v2, v9, v3}, La/mey;-><init>(La/zm40;La/eu00;La/aaw;)V

    .line 941
    .line 942
    .line 943
    return-object v1

    .line 944
    :pswitch_c
    check-cast v0, La/fey;

    .line 945
    .line 946
    move-object v7, v9

    .line 947
    check-cast v7, La/eu00;

    .line 948
    .line 949
    new-instance v1, La/llc;

    .line 950
    .line 951
    iget-object v2, v0, La/fey;->b:Lkotlin/jvm/functions/Function1;

    .line 952
    .line 953
    iget-object v0, v0, La/fey;->a:La/ym40;

    .line 954
    .line 955
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    check-cast v2, La/vjj;

    .line 960
    .line 961
    sget-object v3, La/fey;->g:La/g950;

    .line 962
    .line 963
    sget-object v4, La/gm40;->e:La/gm40;

    .line 964
    .line 965
    sget-object v5, La/slc;->b:La/slc;

    .line 966
    .line 967
    invoke-interface {v0}, La/ym40;->c()La/ary;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-virtual {v0}, La/ary;->e()La/kzj0;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 976
    .line 977
    .line 978
    move-result-object v6

    .line 979
    invoke-direct/range {v1 .. v7}, La/llc;-><init>(La/vjj;La/g950;La/gm40;La/slc;Ljava/util/List;La/eu00;)V

    .line 980
    .line 981
    .line 982
    new-instance v0, La/tuc;

    .line 983
    .line 984
    invoke-direct {v0, v7, v1}, La/o7v;-><init>(La/eu00;La/h1;)V

    .line 985
    .line 986
    .line 987
    sget-object v2, La/xun;->a:La/xun;

    .line 988
    .line 989
    invoke-virtual {v1, v0, v2, v8}, La/llc;->u0(La/cr30;Ljava/util/Set;La/flc;)V

    .line 990
    .line 991
    .line 992
    return-object v1

    .line 993
    :pswitch_d
    check-cast v0, La/rgy;

    .line 994
    .line 995
    check-cast v9, La/n9y;

    .line 996
    .line 997
    invoke-virtual {v0}, La/rgy;->c()Z

    .line 998
    .line 999
    .line 1000
    move-result v1

    .line 1001
    iget-object v0, v0, La/rgy;->f:Ljava/util/List;

    .line 1002
    .line 1003
    if-eqz v1, :cond_c

    .line 1004
    .line 1005
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    if-ne v1, v5, :cond_c

    .line 1010
    .line 1011
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    check-cast v0, La/dre0;

    .line 1016
    .line 1017
    invoke-interface {v0}, La/qgy;->getReturnType()La/kiy;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    goto :goto_7

    .line 1022
    :cond_c
    invoke-virtual {v9}, La/n9y;->B()Ljava/lang/reflect/Method;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v9}, La/n9y;->u()[Ljava/lang/reflect/TypeVariable;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    invoke-virtual {v9}, La/i9y;->getTypeParameters()Ljava/util/List;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v2

    .line 1041
    invoke-static {v0, v2}, La/tx3;->m0([Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-static {v0}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    iget-object v0, v9, La/e9y;->d:Ljava/lang/reflect/Member;

    .line 1050
    .line 1051
    invoke-static {v0}, La/tke;->W(Ljava/lang/reflect/Member;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v4

    .line 1055
    const/4 v6, 0x0

    .line 1056
    const/16 v7, 0x1a

    .line 1057
    .line 1058
    const/4 v3, 0x0

    .line 1059
    const/4 v5, 0x0

    .line 1060
    invoke-static/range {v1 .. v7}, La/tke;->j0(Ljava/lang/reflect/Type;Ljava/util/Map;La/gzs0;ZZLa/c0t0;I)La/kiy;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    :goto_7
    invoke-static {v9, v0}, La/fre0;->c0(La/dre0;La/kiy;)La/kiy;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    check-cast v0, La/v2;

    .line 1069
    .line 1070
    return-object v0

    .line 1071
    :pswitch_e
    check-cast v0, La/i9y;

    .line 1072
    .line 1073
    check-cast v9, La/ihy;

    .line 1074
    .line 1075
    invoke-interface {v0}, La/dre0;->a()Ljava/util/List;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    invoke-static {v0}, La/fre0;->W(La/dre0;)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v2

    .line 1083
    if-nez v2, :cond_d

    .line 1084
    .line 1085
    goto/16 :goto_9

    .line 1086
    .line 1087
    :cond_d
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v2

    .line 1091
    const/16 v3, 0x2e

    .line 1092
    .line 1093
    if-nez v2, :cond_10

    .line 1094
    .line 1095
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1096
    .line 1097
    .line 1098
    move-result v2

    .line 1099
    sub-int/2addr v2, v5

    .line 1100
    new-instance v4, Ljava/util/ArrayList;

    .line 1101
    .line 1102
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1103
    .line 1104
    .line 1105
    :goto_8
    move v14, v6

    .line 1106
    if-ge v14, v2, :cond_f

    .line 1107
    .line 1108
    add-int/lit8 v6, v14, 0x1

    .line 1109
    .line 1110
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v5

    .line 1114
    check-cast v5, La/hre0;

    .line 1115
    .line 1116
    instance-of v7, v5, La/o9y;

    .line 1117
    .line 1118
    if-eqz v7, :cond_e

    .line 1119
    .line 1120
    new-instance v10, La/o9y;

    .line 1121
    .line 1122
    check-cast v5, La/o9y;

    .line 1123
    .line 1124
    iget-object v11, v5, La/o9y;->a:La/e9y;

    .line 1125
    .line 1126
    iget-object v12, v5, La/o9y;->b:Ljava/lang/String;

    .line 1127
    .line 1128
    iget-object v13, v5, La/o9y;->c:La/kiy;

    .line 1129
    .line 1130
    iget-object v15, v5, La/o9y;->e:La/aiy;

    .line 1131
    .line 1132
    iget-boolean v5, v5, La/o9y;->f:Z

    .line 1133
    .line 1134
    move/from16 v16, v5

    .line 1135
    .line 1136
    invoke-direct/range {v10 .. v16}, La/o9y;-><init>(La/e9y;Ljava/lang/String;La/kiy;ILa/aiy;Z)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    goto :goto_8

    .line 1143
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    const-string v2, "Unexpected parameter type: "

    .line 1146
    .line 1147
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    sget-object v4, La/sre0;->a:La/tre0;

    .line 1155
    .line 1156
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    invoke-interface {v2}, La/sgy;->J()Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v2

    .line 1164
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    .line 1167
    const-string v2, " ("

    .line 1168
    .line 1169
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1173
    .line 1174
    .line 1175
    invoke-interface {v0}, La/qgy;->getName()Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    const/16 v0, 0x29

    .line 1186
    .line 1187
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1195
    .line 1196
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    throw v1

    .line 1204
    :cond_f
    move-object v1, v4

    .line 1205
    :goto_9
    return-object v1

    .line 1206
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    const-string v2, "Bound function reference has no parameters: "

    .line 1209
    .line 1210
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-interface {v0}, La/qgy;->getName()Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    throw v1

    .line 1240
    :pswitch_f
    check-cast v0, La/f7u;

    .line 1241
    .line 1242
    check-cast v9, La/k8y;

    .line 1243
    .line 1244
    iget-object v0, v0, La/f7u;->b:Ljava/lang/Object;

    .line 1245
    .line 1246
    check-cast v0, La/v7i;

    .line 1247
    .line 1248
    iget-object v0, v0, La/v7i;->j:Ljava/lang/Object;

    .line 1249
    .line 1250
    check-cast v0, La/zm40;

    .line 1251
    .line 1252
    iget-object v0, v0, La/zm40;->e:La/ary;

    .line 1253
    .line 1254
    iget-object v1, v9, La/k8y;->a:La/swq;

    .line 1255
    .line 1256
    invoke-virtual {v0, v1}, La/ary;->j(La/swq;)La/wm40;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    invoke-virtual {v0}, La/wm40;->I()La/kzj0;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    return-object v0

    .line 1265
    :pswitch_10
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1266
    .line 1267
    new-instance v1, La/z97;

    .line 1268
    .line 1269
    check-cast v9, La/zdo;

    .line 1270
    .line 1271
    check-cast v9, La/beo;

    .line 1272
    .line 1273
    iget-wide v2, v9, La/beo;->b:J

    .line 1274
    .line 1275
    invoke-direct {v1, v2, v3}, La/z97;-><init>(J)V

    .line 1276
    .line 1277
    .line 1278
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1282
    .line 1283
    return-object v0

    .line 1284
    :pswitch_11
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1285
    .line 1286
    new-instance v1, La/nmw;

    .line 1287
    .line 1288
    check-cast v9, La/zmw;

    .line 1289
    .line 1290
    iget-object v2, v9, La/zmw;->b:La/jnw;

    .line 1291
    .line 1292
    invoke-direct {v1, v2}, La/nmw;-><init>(La/jnw;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1299
    .line 1300
    return-object v0

    .line 1301
    :pswitch_12
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1302
    .line 1303
    check-cast v9, La/xjw;

    .line 1304
    .line 1305
    iget v1, v9, La/xjw;->a:I

    .line 1306
    .line 1307
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    iget-object v2, v9, La/xjw;->b:Ljava/lang/String;

    .line 1312
    .line 1313
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1317
    .line 1318
    return-object v0

    .line 1319
    :pswitch_13
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1320
    .line 1321
    check-cast v9, La/uew;

    .line 1322
    .line 1323
    invoke-interface {v0, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1324
    .line 1325
    .line 1326
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1327
    .line 1328
    return-object v0

    .line 1329
    :pswitch_14
    check-cast v0, La/c4w;

    .line 1330
    .line 1331
    check-cast v9, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;

    .line 1332
    .line 1333
    iget-object v1, v9, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 1334
    .line 1335
    sget-object v2, La/c4w;->n2:La/tqt;

    .line 1336
    .line 1337
    iget-object v2, v0, La/c4w;->k2:La/phf0;

    .line 1338
    .line 1339
    sget-object v3, La/c4w;->o2:[La/iiy;

    .line 1340
    .line 1341
    aget-object v4, v3, v6

    .line 1342
    .line 1343
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    new-instance v4, Lkotlin/Pair;

    .line 1348
    .line 1349
    const-string v6, "HISTORY_MENU_ITEM_RESULT"

    .line 1350
    .line 1351
    invoke-direct {v4, v6, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1352
    .line 1353
    .line 1354
    iget-object v1, v0, La/c4w;->l2:La/phf0;

    .line 1355
    .line 1356
    aget-object v3, v3, v5

    .line 1357
    .line 1358
    invoke-virtual {v1, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v1

    .line 1362
    new-instance v3, Lkotlin/Pair;

    .line 1363
    .line 1364
    const-string v5, "HISTORY_MENU_BET_ID_RESULT"

    .line 1365
    .line 1366
    invoke-direct {v3, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1367
    .line 1368
    .line 1369
    filled-new-array {v4, v3}, [Lkotlin/Pair;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v1

    .line 1373
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v1

    .line 1377
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1381
    .line 1382
    .line 1383
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1384
    .line 1385
    return-object v0

    .line 1386
    :pswitch_15
    check-cast v0, La/vzv;

    .line 1387
    .line 1388
    sget-object v1, La/vzv;->p2:La/sqt;

    .line 1389
    .line 1390
    invoke-virtual {v0}, La/vzv;->P0()La/k3t0;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    check-cast v9, La/g1w;

    .line 1395
    .line 1396
    iget-object v1, v9, La/g1w;->a:La/ato0;

    .line 1397
    .line 1398
    new-instance v2, La/zzv;

    .line 1399
    .line 1400
    invoke-direct {v2, v1}, La/zzv;-><init>(La/ato0;)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1404
    .line 1405
    .line 1406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1407
    .line 1408
    return-object v0

    .line 1409
    :pswitch_16
    check-cast v0, La/axv;

    .line 1410
    .line 1411
    check-cast v9, La/wlq0;

    .line 1412
    .line 1413
    iget-object v1, v9, La/wlq0;->b:Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;

    .line 1414
    .line 1415
    sget-object v2, La/axv;->n2:La/art;

    .line 1416
    .line 1417
    new-instance v2, La/wqv;

    .line 1418
    .line 1419
    const/4 v3, 0x5

    .line 1420
    invoke-direct {v2, v0, v1, v3}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1421
    .line 1422
    .line 1423
    const-string v1, "CONFIRM_DIALOG_REQUEST_KEY"

    .line 1424
    .line 1425
    invoke-static {v0, v1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 1426
    .line 1427
    .line 1428
    iget-object v1, v0, La/axv;->m2:La/ii;

    .line 1429
    .line 1430
    if-eqz v1, :cond_11

    .line 1431
    .line 1432
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1433
    .line 1434
    const v2, 0x7f1303fb

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v10

    .line 1441
    const v2, 0x7f1309bf

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v11

    .line 1448
    const v2, 0x7f130e5c

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v12

    .line 1455
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1456
    .line 1457
    .line 1458
    const v2, 0x7f13032f

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v13

    .line 1465
    sget-object v18, La/n12;->a:La/n12;

    .line 1466
    .line 1467
    const/16 v19, 0x0

    .line 1468
    .line 1469
    const/16 v20, 0x5d0

    .line 1470
    .line 1471
    const/4 v14, 0x0

    .line 1472
    const-string v15, "CONFIRM_DIALOG_REQUEST_KEY"

    .line 1473
    .line 1474
    const/16 v16, 0x0

    .line 1475
    .line 1476
    const/16 v17, 0x0

    .line 1477
    .line 1478
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v0

    .line 1485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v1, v9, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1489
    .line 1490
    .line 1491
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1492
    .line 1493
    return-object v0

    .line 1494
    :cond_11
    const-string v0, "actionDialogManager"

    .line 1495
    .line 1496
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1497
    .line 1498
    .line 1499
    throw v8

    .line 1500
    :pswitch_17
    check-cast v0, La/g8v;

    .line 1501
    .line 1502
    check-cast v9, La/s8v;

    .line 1503
    .line 1504
    iget-object v1, v9, La/s8v;->c:La/bfo0;

    .line 1505
    .line 1506
    sget-object v2, La/g8v;->P1:La/rqt;

    .line 1507
    .line 1508
    invoke-virtual {v0, v1}, La/g8v;->J0(La/bfo0;)V

    .line 1509
    .line 1510
    .line 1511
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1512
    .line 1513
    return-object v0

    .line 1514
    :pswitch_18
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1515
    .line 1516
    new-instance v1, La/rft;

    .line 1517
    .line 1518
    check-cast v9, La/ok90;

    .line 1519
    .line 1520
    invoke-direct {v1, v9}, La/rft;-><init>(La/ok90;)V

    .line 1521
    .line 1522
    .line 1523
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1527
    .line 1528
    return-object v0

    .line 1529
    :pswitch_19
    check-cast v0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1530
    .line 1531
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0

    .line 1539
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1540
    .line 1541
    .line 1542
    move-object v11, v9

    .line 1543
    check-cast v11, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1544
    .line 1545
    const v1, 0x7f0d06a2

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v0, v1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1549
    .line 1550
    .line 1551
    invoke-static {v11, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v12

    .line 1555
    if-eqz v12, :cond_14

    .line 1556
    .line 1557
    invoke-static {v11, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    move-object v13, v0

    .line 1562
    check-cast v13, Landroid/widget/ProgressBar;

    .line 1563
    .line 1564
    if-eqz v13, :cond_13

    .line 1565
    .line 1566
    const v0, 0x7f0a1333

    .line 1567
    .line 1568
    .line 1569
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v1

    .line 1573
    move-object v14, v1

    .line 1574
    check-cast v14, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 1575
    .line 1576
    if-eqz v14, :cond_12

    .line 1577
    .line 1578
    invoke-static {v11, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    move-object v15, v0

    .line 1583
    check-cast v15, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 1584
    .line 1585
    if-eqz v15, :cond_15

    .line 1586
    .line 1587
    new-instance v10, La/ghu0;

    .line 1588
    .line 1589
    invoke-direct/range {v10 .. v15}, La/ghu0;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;Landroid/view/View;Landroid/widget/ProgressBar;Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;)V

    .line 1590
    .line 1591
    .line 1592
    move-object v8, v10

    .line 1593
    goto :goto_b

    .line 1594
    :cond_12
    move v2, v0

    .line 1595
    goto :goto_a

    .line 1596
    :cond_13
    move v2, v3

    .line 1597
    goto :goto_a

    .line 1598
    :cond_14
    move v2, v4

    .line 1599
    :cond_15
    :goto_a
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1612
    .line 1613
    .line 1614
    :goto_b
    return-object v8

    .line 1615
    :pswitch_1a
    check-cast v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1616
    .line 1617
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v0

    .line 1625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1626
    .line 1627
    .line 1628
    move-object v11, v9

    .line 1629
    check-cast v11, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1630
    .line 1631
    const v1, 0x7f0d06a1

    .line 1632
    .line 1633
    .line 1634
    invoke-virtual {v0, v1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1635
    .line 1636
    .line 1637
    const v0, 0x7f0a016e

    .line 1638
    .line 1639
    .line 1640
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v1

    .line 1644
    move-object v12, v1

    .line 1645
    check-cast v12, Landroid/widget/ImageView;

    .line 1646
    .line 1647
    if-eqz v12, :cond_16

    .line 1648
    .line 1649
    invoke-static {v11, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v13

    .line 1653
    if-eqz v13, :cond_18

    .line 1654
    .line 1655
    invoke-static {v11, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v0

    .line 1659
    move-object v14, v0

    .line 1660
    check-cast v14, Landroid/widget/ProgressBar;

    .line 1661
    .line 1662
    if-eqz v14, :cond_17

    .line 1663
    .line 1664
    const v0, 0x7f0a0e3a

    .line 1665
    .line 1666
    .line 1667
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v1

    .line 1671
    move-object v15, v1

    .line 1672
    check-cast v15, Landroid/widget/ImageView;

    .line 1673
    .line 1674
    if-eqz v15, :cond_16

    .line 1675
    .line 1676
    const v0, 0x7f0a1332

    .line 1677
    .line 1678
    .line 1679
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v1

    .line 1683
    move-object/from16 v16, v1

    .line 1684
    .line 1685
    check-cast v16, Landroidx/media3/ui/PlayerView;

    .line 1686
    .line 1687
    if-eqz v16, :cond_16

    .line 1688
    .line 1689
    invoke-static {v11, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    move-object/from16 v17, v0

    .line 1694
    .line 1695
    check-cast v17, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 1696
    .line 1697
    if-eqz v17, :cond_19

    .line 1698
    .line 1699
    new-instance v10, La/fhu0;

    .line 1700
    .line 1701
    invoke-direct/range {v10 .. v17}, La/fhu0;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroidx/media3/ui/PlayerView;Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;)V

    .line 1702
    .line 1703
    .line 1704
    move-object v8, v10

    .line 1705
    goto :goto_d

    .line 1706
    :cond_16
    move v2, v0

    .line 1707
    goto :goto_c

    .line 1708
    :cond_17
    move v2, v3

    .line 1709
    goto :goto_c

    .line 1710
    :cond_18
    move v2, v4

    .line 1711
    :cond_19
    :goto_c
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v0

    .line 1715
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v0

    .line 1719
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v0

    .line 1723
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1724
    .line 1725
    .line 1726
    :goto_d
    return-object v8

    .line 1727
    :pswitch_1b
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;

    .line 1728
    .line 1729
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1738
    .line 1739
    .line 1740
    move-object v2, v9

    .line 1741
    check-cast v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;

    .line 1742
    .line 1743
    const v1, 0x7f0d069f

    .line 1744
    .line 1745
    .line 1746
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1747
    .line 1748
    .line 1749
    const v0, 0x7f0a004e

    .line 1750
    .line 1751
    .line 1752
    invoke-static {v2, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v1

    .line 1756
    move-object v3, v1

    .line 1757
    check-cast v3, Landroid/widget/ImageView;

    .line 1758
    .line 1759
    if-eqz v3, :cond_1a

    .line 1760
    .line 1761
    const v0, 0x7f0a0054

    .line 1762
    .line 1763
    .line 1764
    invoke-static {v2, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v1

    .line 1768
    move-object v4, v1

    .line 1769
    check-cast v4, Landroid/widget/ImageView;

    .line 1770
    .line 1771
    if-eqz v4, :cond_1a

    .line 1772
    .line 1773
    const v0, 0x7f0a0056

    .line 1774
    .line 1775
    .line 1776
    invoke-static {v2, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v1

    .line 1780
    move-object v5, v1

    .line 1781
    check-cast v5, Landroid/widget/ImageView;

    .line 1782
    .line 1783
    if-eqz v5, :cond_1a

    .line 1784
    .line 1785
    const v0, 0x7f0a0ff8

    .line 1786
    .line 1787
    .line 1788
    invoke-static {v2, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v1

    .line 1792
    move-object v6, v1

    .line 1793
    check-cast v6, Landroid/widget/TextView;

    .line 1794
    .line 1795
    if-eqz v6, :cond_1a

    .line 1796
    .line 1797
    new-instance v1, La/ehu0;

    .line 1798
    .line 1799
    invoke-direct/range {v1 .. v6}, La/ehu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 1800
    .line 1801
    .line 1802
    move-object v8, v1

    .line 1803
    goto :goto_e

    .line 1804
    :cond_1a
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v1

    .line 1808
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v0

    .line 1812
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v0

    .line 1816
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1817
    .line 1818
    .line 1819
    :goto_e
    return-object v8

    .line 1820
    :pswitch_1c
    check-cast v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 1821
    .line 1822
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v0

    .line 1826
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v0

    .line 1830
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1831
    .line 1832
    .line 1833
    move-object v11, v9

    .line 1834
    check-cast v11, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 1835
    .line 1836
    const v1, 0x7f0d069e

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v0, v1, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1840
    .line 1841
    .line 1842
    const v0, 0x7f0a0859

    .line 1843
    .line 1844
    .line 1845
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v1

    .line 1849
    move-object v12, v1

    .line 1850
    check-cast v12, Landroid/widget/ImageView;

    .line 1851
    .line 1852
    if-eqz v12, :cond_1b

    .line 1853
    .line 1854
    const v0, 0x7f0a0889

    .line 1855
    .line 1856
    .line 1857
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    move-object v13, v1

    .line 1862
    check-cast v13, Landroid/widget/ImageView;

    .line 1863
    .line 1864
    if-eqz v13, :cond_1b

    .line 1865
    .line 1866
    const v0, 0x7f0a08c3

    .line 1867
    .line 1868
    .line 1869
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v1

    .line 1873
    move-object v14, v1

    .line 1874
    check-cast v14, Landroid/widget/ImageView;

    .line 1875
    .line 1876
    if-eqz v14, :cond_1b

    .line 1877
    .line 1878
    const v0, 0x7f0a08f2

    .line 1879
    .line 1880
    .line 1881
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v1

    .line 1885
    move-object v15, v1

    .line 1886
    check-cast v15, Landroid/widget/ImageView;

    .line 1887
    .line 1888
    if-eqz v15, :cond_1b

    .line 1889
    .line 1890
    const v0, 0x7f0a08f4

    .line 1891
    .line 1892
    .line 1893
    invoke-static {v11, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v1

    .line 1897
    move-object/from16 v16, v1

    .line 1898
    .line 1899
    check-cast v16, Landroid/widget/ImageView;

    .line 1900
    .line 1901
    if-eqz v16, :cond_1b

    .line 1902
    .line 1903
    new-instance v10, La/dhu0;

    .line 1904
    .line 1905
    invoke-direct/range {v10 .. v16}, La/dhu0;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 1906
    .line 1907
    .line 1908
    move-object v8, v10

    .line 1909
    goto :goto_f

    .line 1910
    :cond_1b
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v1

    .line 1914
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v0

    .line 1922
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1923
    .line 1924
    .line 1925
    :goto_f
    return-object v8

    .line 1926
    nop

    .line 1927
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
