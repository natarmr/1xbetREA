.class public final synthetic La/r620;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/r620;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/r620;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/make_bet/impl/databinding/MakeBetBottomsheetFragmentBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/s720;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/r620;->a:La/r620;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0d04ae

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0a013f

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    const v1, 0x7f0a01d1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v7, v2

    .line 34
    check-cast v7, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 35
    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    const v1, 0x7f0a01e0

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v8, v2

    .line 46
    check-cast v8, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 47
    .line 48
    if-eqz v8, :cond_0

    .line 49
    .line 50
    const v1, 0x7f0a01ed

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v9, v2

    .line 58
    check-cast v9, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 59
    .line 60
    if-eqz v9, :cond_0

    .line 61
    .line 62
    const v1, 0x7f0a035a

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v10, v2

    .line 70
    check-cast v10, Landroidx/constraintlayout/widget/Group;

    .line 71
    .line 72
    if-eqz v10, :cond_0

    .line 73
    .line 74
    const v1, 0x7f0a035d

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move-object v11, v2

    .line 82
    check-cast v11, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 83
    .line 84
    if-eqz v11, :cond_0

    .line 85
    .line 86
    const v1, 0x7f0a035e

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v12, v2

    .line 94
    check-cast v12, Landroidx/constraintlayout/widget/Group;

    .line 95
    .line 96
    if-eqz v12, :cond_0

    .line 97
    .line 98
    const v1, 0x7f0a0691

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    move-object v13, v2

    .line 106
    check-cast v13, Landroidx/constraintlayout/widget/Group;

    .line 107
    .line 108
    if-eqz v13, :cond_0

    .line 109
    .line 110
    const v1, 0x7f0a0692

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v14, v2

    .line 118
    check-cast v14, Landroidx/constraintlayout/widget/Group;

    .line 119
    .line 120
    if-eqz v14, :cond_0

    .line 121
    .line 122
    const v1, 0x7f0a069b

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Landroidx/constraintlayout/widget/Group;

    .line 130
    .line 131
    if-eqz v2, :cond_0

    .line 132
    .line 133
    const v1, 0x7f0a07fc

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Landroid/widget/ImageView;

    .line 141
    .line 142
    if-eqz v2, :cond_0

    .line 143
    .line 144
    const v1, 0x7f0a0924

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    move-object v15, v2

    .line 152
    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 153
    .line 154
    if-eqz v15, :cond_0

    .line 155
    .line 156
    const v1, 0x7f0a0982

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    move-object/from16 v16, v2

    .line 164
    .line 165
    check-cast v16, Landroid/widget/LinearLayout;

    .line 166
    .line 167
    if-eqz v16, :cond_0

    .line 168
    .line 169
    const v1, 0x7f0a0984

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Landroid/widget/LinearLayout;

    .line 177
    .line 178
    if-eqz v2, :cond_0

    .line 179
    .line 180
    const v1, 0x7f0a0a20

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 188
    .line 189
    if-eqz v2, :cond_0

    .line 190
    .line 191
    const v1, 0x7f0a0a21

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object/from16 v17, v2

    .line 199
    .line 200
    check-cast v17, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 201
    .line 202
    if-eqz v17, :cond_0

    .line 203
    .line 204
    const v1, 0x7f0a0af0

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    move-object/from16 v18, v2

    .line 212
    .line 213
    check-cast v18, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 214
    .line 215
    if-eqz v18, :cond_0

    .line 216
    .line 217
    const v1, 0x7f0a0af1

    .line 218
    .line 219
    .line 220
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 225
    .line 226
    if-eqz v2, :cond_0

    .line 227
    .line 228
    const v1, 0x7f0a0af2

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    move-object/from16 v19, v2

    .line 236
    .line 237
    check-cast v19, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 238
    .line 239
    if-eqz v19, :cond_0

    .line 240
    .line 241
    const v1, 0x7f0a0af7

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    move-object/from16 v20, v2

    .line 249
    .line 250
    check-cast v20, Lorg/xplatform/make_bet/impl/presentation/view/OptionBetLabelView;

    .line 251
    .line 252
    if-eqz v20, :cond_0

    .line 253
    .line 254
    const v1, 0x7f0a0af8

    .line 255
    .line 256
    .line 257
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    move-object/from16 v21, v2

    .line 262
    .line 263
    check-cast v21, Landroid/widget/Space;

    .line 264
    .line 265
    if-eqz v21, :cond_0

    .line 266
    .line 267
    const v1, 0x7f0a0e2c

    .line 268
    .line 269
    .line 270
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    move-object/from16 v22, v2

    .line 275
    .line 276
    check-cast v22, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 277
    .line 278
    if-eqz v22, :cond_0

    .line 279
    .line 280
    const v1, 0x7f0a0e3c

    .line 281
    .line 282
    .line 283
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    check-cast v2, Landroid/widget/Space;

    .line 288
    .line 289
    if-eqz v2, :cond_0

    .line 290
    .line 291
    const v1, 0x7f0a0ed2

    .line 292
    .line 293
    .line 294
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    move-object/from16 v23, v2

    .line 299
    .line 300
    check-cast v23, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 301
    .line 302
    if-eqz v23, :cond_0

    .line 303
    .line 304
    const v1, 0x7f0a105b

    .line 305
    .line 306
    .line 307
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Landroid/widget/TextView;

    .line 312
    .line 313
    if-eqz v2, :cond_0

    .line 314
    .line 315
    const v1, 0x7f0a1070

    .line 316
    .line 317
    .line 318
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    move-object/from16 v24, v2

    .line 323
    .line 324
    check-cast v24, Landroid/widget/TextView;

    .line 325
    .line 326
    if-eqz v24, :cond_0

    .line 327
    .line 328
    const v1, 0x7f0a109e

    .line 329
    .line 330
    .line 331
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    move-object/from16 v25, v2

    .line 336
    .line 337
    check-cast v25, Landroid/widget/TextView;

    .line 338
    .line 339
    if-eqz v25, :cond_0

    .line 340
    .line 341
    const v1, 0x7f0a10a0

    .line 342
    .line 343
    .line 344
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    check-cast v2, Landroid/widget/TextView;

    .line 349
    .line 350
    if-eqz v2, :cond_0

    .line 351
    .line 352
    const v1, 0x7f0a116f

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    check-cast v2, Landroid/widget/TextView;

    .line 360
    .line 361
    if-eqz v2, :cond_0

    .line 362
    .line 363
    const v1, 0x7f0a1178

    .line 364
    .line 365
    .line 366
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, Landroid/widget/TextView;

    .line 371
    .line 372
    if-eqz v2, :cond_0

    .line 373
    .line 374
    const v1, 0x7f0a1199

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    check-cast v2, Landroid/widget/TextView;

    .line 382
    .line 383
    if-eqz v2, :cond_0

    .line 384
    .line 385
    const v1, 0x7f0a1233

    .line 386
    .line 387
    .line 388
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    move-object/from16 v26, v2

    .line 393
    .line 394
    check-cast v26, Landroid/widget/TextView;

    .line 395
    .line 396
    if-eqz v26, :cond_0

    .line 397
    .line 398
    const v1, 0x7f0a124a

    .line 399
    .line 400
    .line 401
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    move-object/from16 v27, v2

    .line 406
    .line 407
    check-cast v27, Landroid/widget/TextView;

    .line 408
    .line 409
    if-eqz v27, :cond_0

    .line 410
    .line 411
    const v1, 0x7f0a140f

    .line 412
    .line 413
    .line 414
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 415
    .line 416
    .line 417
    move-result-object v28

    .line 418
    if-eqz v28, :cond_0

    .line 419
    .line 420
    const v1, 0x7f0a142e

    .line 421
    .line 422
    .line 423
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    move-object/from16 v29, v2

    .line 428
    .line 429
    check-cast v29, Landroidx/viewpager2/widget/ViewPager2;

    .line 430
    .line 431
    if-eqz v29, :cond_0

    .line 432
    .line 433
    new-instance v4, La/s720;

    .line 434
    .line 435
    move-object v5, v0

    .line 436
    check-cast v5, Landroidx/core/widget/NestedScrollView;

    .line 437
    .line 438
    invoke-direct/range {v4 .. v29}, La/s720;-><init>(Landroidx/core/widget/NestedScrollView;Landroid/view/View;Lorg/xplatform/uikit/components/buttons/DsButton;Lorg/xplatform/uikit/components/buttons/DsButton;Lorg/xplatform/uikit/components/buttons/DsButton;Landroidx/constraintlayout/widget/Group;Lorg/xplatform/ui_core/AnimatedCoefficientView;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/widget/Group;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Lorg/xplatform/make_bet/impl/presentation/view/OptionBetLabelView;Landroid/widget/Space;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroidx/viewpager2/widget/ViewPager2;)V

    .line 439
    .line 440
    .line 441
    return-object v4

    .line 442
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-string v1, "Missing required view with ID: "

    .line 451
    .line 452
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    return-object v3
.end method
