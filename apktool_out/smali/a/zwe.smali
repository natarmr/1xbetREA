.class public final synthetic La/zwe;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/zwe;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/zwe;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/coupon/impl/databinding/FragmentCouponBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/pzq;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/zwe;->a:La/zwe;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0a0048

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    move-object v5, v2

    .line 16
    check-cast v5, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    const v1, 0x7f0a00cb

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v6, v2

    .line 28
    check-cast v6, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    const v1, 0x7f0a031f

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v7, v2

    .line 40
    check-cast v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 41
    .line 42
    if-eqz v7, :cond_0

    .line 43
    .line 44
    const v1, 0x7f0a037b

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v8, v2

    .line 52
    check-cast v8, Landroidx/compose/ui/platform/ComposeView;

    .line 53
    .line 54
    if-eqz v8, :cond_0

    .line 55
    .line 56
    const v1, 0x7f0a03c7

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Landroid/widget/ProgressBar;

    .line 64
    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    const v1, 0x7f0a03c8

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    move-object v9, v2

    .line 75
    check-cast v9, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 76
    .line 77
    if-eqz v9, :cond_0

    .line 78
    .line 79
    const v1, 0x7f0a03c9

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 87
    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    const v1, 0x7f0a03ca

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 98
    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    const v1, 0x7f0a040a

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v10, v2

    .line 109
    check-cast v10, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 110
    .line 111
    if-eqz v10, :cond_0

    .line 112
    .line 113
    const v1, 0x7f0a040c

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 121
    .line 122
    if-eqz v2, :cond_0

    .line 123
    .line 124
    const v1, 0x7f0a040e

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 132
    .line 133
    if-eqz v2, :cond_0

    .line 134
    .line 135
    const v1, 0x7f0a048c

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    move-object v11, v2

    .line 143
    check-cast v11, Landroidx/compose/ui/platform/ComposeView;

    .line 144
    .line 145
    if-eqz v11, :cond_0

    .line 146
    .line 147
    const v1, 0x7f0a05cb

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    move-object v12, v2

    .line 155
    check-cast v12, Landroid/widget/FrameLayout;

    .line 156
    .line 157
    if-eqz v12, :cond_0

    .line 158
    .line 159
    const v1, 0x7f0a05e4

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object v13, v2

    .line 167
    check-cast v13, Landroid/widget/FrameLayout;

    .line 168
    .line 169
    if-eqz v13, :cond_0

    .line 170
    .line 171
    const v1, 0x7f0a066a

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    move-object v14, v2

    .line 179
    check-cast v14, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 180
    .line 181
    if-eqz v14, :cond_0

    .line 182
    .line 183
    const v1, 0x7f0a066b

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 191
    .line 192
    if-eqz v2, :cond_0

    .line 193
    .line 194
    const v1, 0x7f0a066c

    .line 195
    .line 196
    .line 197
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 202
    .line 203
    if-eqz v2, :cond_0

    .line 204
    .line 205
    const v1, 0x7f0a098a

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, Landroid/widget/LinearLayout;

    .line 213
    .line 214
    if-eqz v2, :cond_0

    .line 215
    .line 216
    const v1, 0x7f0a0a7f

    .line 217
    .line 218
    .line 219
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    move-object v15, v2

    .line 224
    check-cast v15, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 225
    .line 226
    if-eqz v15, :cond_0

    .line 227
    .line 228
    const v1, 0x7f0a0ab7

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    move-object/from16 v16, v2

    .line 236
    .line 237
    check-cast v16, Landroidx/core/widget/NestedScrollView;

    .line 238
    .line 239
    if-eqz v16, :cond_0

    .line 240
    .line 241
    const v1, 0x7f0a0c05

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    move-object/from16 v17, v2

    .line 249
    .line 250
    check-cast v17, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 251
    .line 252
    if-eqz v17, :cond_0

    .line 253
    .line 254
    const v1, 0x7f0a0c06

    .line 255
    .line 256
    .line 257
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    move-object/from16 v18, v2

    .line 262
    .line 263
    check-cast v18, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 264
    .line 265
    if-eqz v18, :cond_0

    .line 266
    .line 267
    const v1, 0x7f0a0c07

    .line 268
    .line 269
    .line 270
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    move-object/from16 v19, v2

    .line 275
    .line 276
    check-cast v19, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 277
    .line 278
    if-eqz v19, :cond_0

    .line 279
    .line 280
    const v1, 0x7f0a0c80

    .line 281
    .line 282
    .line 283
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    move-object/from16 v20, v2

    .line 288
    .line 289
    check-cast v20, Landroidx/recyclerview/widget/RecyclerView;

    .line 290
    .line 291
    if-eqz v20, :cond_0

    .line 292
    .line 293
    const v1, 0x7f0a0ce7

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 301
    .line 302
    if-eqz v2, :cond_0

    .line 303
    .line 304
    const v1, 0x7f0a0de9

    .line 305
    .line 306
    .line 307
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ShimmerListView;

    .line 312
    .line 313
    if-eqz v2, :cond_0

    .line 314
    .line 315
    const v1, 0x7f0a1001

    .line 316
    .line 317
    .line 318
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Landroid/widget/LinearLayout;

    .line 323
    .line 324
    if-eqz v2, :cond_0

    .line 325
    .line 326
    const v1, 0x7f0a10ef

    .line 327
    .line 328
    .line 329
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    check-cast v2, Landroid/widget/TextView;

    .line 334
    .line 335
    if-eqz v2, :cond_0

    .line 336
    .line 337
    const v1, 0x7f0a10f0

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    check-cast v2, Landroid/widget/TextView;

    .line 345
    .line 346
    if-eqz v2, :cond_0

    .line 347
    .line 348
    const v1, 0x7f0a131f

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    move-object/from16 v21, v2

    .line 356
    .line 357
    check-cast v21, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 358
    .line 359
    if-eqz v21, :cond_0

    .line 360
    .line 361
    const v1, 0x7f0a1320

    .line 362
    .line 363
    .line 364
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 369
    .line 370
    if-eqz v2, :cond_0

    .line 371
    .line 372
    const v1, 0x7f0a1321

    .line 373
    .line 374
    .line 375
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 380
    .line 381
    if-eqz v2, :cond_0

    .line 382
    .line 383
    new-instance v3, La/pzq;

    .line 384
    .line 385
    move-object v4, v0

    .line 386
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 387
    .line 388
    invoke-direct/range {v3 .. v21}, La/pzq;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/compose/ui/platform/ComposeView;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/DsMenuCell;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;Landroidx/core/widget/NestedScrollView;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/uikit/components/cells/DsMenuCell;)V

    .line 389
    .line 390
    .line 391
    return-object v3

    .line 392
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    const-string v1, "Missing required view with ID: "

    .line 401
    .line 402
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    const/4 v0, 0x0

    .line 410
    return-object v0
.end method
