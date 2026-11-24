.class public final synthetic La/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bb;->a:B

    iput-object p1, p0, La/bb;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/bb;->b:La/cp;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, La/wxx;

    .line 13
    .line 14
    iget-object v0, v0, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 15
    .line 16
    iget-object v2, v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v2}, La/iwk;->a()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object v1, v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 24
    .line 25
    check-cast p0, La/wxx;

    .line 26
    .line 27
    iget-object p0, p0, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 28
    .line 29
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, La/iwk;->a()V

    .line 34
    .line 35
    .line 36
    :cond_1
    iput-object v1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 42
    .line 43
    check-cast p0, La/exk0;

    .line 44
    .line 45
    iget-object p0, p0, La/exk0;->b:Landroid/widget/FrameLayout;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 57
    .line 58
    check-cast p0, La/exk0;

    .line 59
    .line 60
    iget-object p0, p0, La/exk0;->b:Landroid/widget/FrameLayout;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_2
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/yrj0;

    .line 76
    .line 77
    iget-boolean v0, v0, La/yrj0;->f:Z

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 82
    .line 83
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 84
    .line 85
    invoke-static {v0, p0}, La/wvb;->b0(La/yfu0;Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_3
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 92
    .line 93
    check-cast p0, La/vhu0;

    .line 94
    .line 95
    iget-object p0, p0, La/vhu0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_4
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 107
    .line 108
    check-cast p0, La/vhu0;

    .line 109
    .line 110
    iget-object p0, p0, La/vhu0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_5
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 122
    .line 123
    move-object v2, v0

    .line 124
    check-cast v2, La/ywx;

    .line 125
    .line 126
    iget-object v2, v2, La/ywx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 127
    .line 128
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 129
    .line 130
    const v3, 0x7f080b4e

    .line 131
    .line 132
    .line 133
    invoke-static {v3, p0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {v2, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 138
    .line 139
    .line 140
    check-cast v0, La/ywx;

    .line 141
    .line 142
    iget-object p0, v0, La/ywx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 143
    .line 144
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_6
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 151
    .line 152
    check-cast p0, La/vwx;

    .line 153
    .line 154
    iget-object p0, p0, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 155
    .line 156
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    if-eqz p0, :cond_3

    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 167
    .line 168
    .line 169
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_7
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 173
    .line 174
    move-object v0, p0

    .line 175
    check-cast v0, La/cfx;

    .line 176
    .line 177
    iget-object v0, v0, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 178
    .line 179
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->d()V

    .line 180
    .line 181
    .line 182
    check-cast p0, La/cfx;

    .line 183
    .line 184
    iget-object p0, p0, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 185
    .line 186
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->c()V

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_8
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/yf30;

    .line 197
    .line 198
    iget-boolean v0, v0, La/yf30;->b:Z

    .line 199
    .line 200
    if-eqz v0, :cond_4

    .line 201
    .line 202
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 203
    .line 204
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 205
    .line 206
    invoke-static {v0, p0}, La/wvb;->b0(La/yfu0;Landroid/content/Context;)V

    .line 207
    .line 208
    .line 209
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_9
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, La/a800;

    .line 217
    .line 218
    iget-boolean v0, v0, La/a800;->c:Z

    .line 219
    .line 220
    if-eqz v0, :cond_5

    .line 221
    .line 222
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 223
    .line 224
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 225
    .line 226
    invoke-static {v0, p0}, La/wvb;->b0(La/yfu0;Landroid/content/Context;)V

    .line 227
    .line 228
    .line 229
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_a
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 233
    .line 234
    move-object v0, p0

    .line 235
    check-cast v0, La/wxx;

    .line 236
    .line 237
    iget-object v0, v0, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 238
    .line 239
    iget-object v2, v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 240
    .line 241
    if-eqz v2, :cond_6

    .line 242
    .line 243
    invoke-interface {v2}, La/iwk;->a()V

    .line 244
    .line 245
    .line 246
    :cond_6
    iput-object v1, v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 247
    .line 248
    check-cast p0, La/wxx;

    .line 249
    .line 250
    iget-object p0, p0, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 251
    .line 252
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 253
    .line 254
    if-eqz v0, :cond_7

    .line 255
    .line 256
    invoke-interface {v0}, La/iwk;->a()V

    .line 257
    .line 258
    .line 259
    :cond_7
    iput-object v1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 260
    .line 261
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_b
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, La/yrw;

    .line 269
    .line 270
    iget-boolean v0, v0, La/yrw;->d:Z

    .line 271
    .line 272
    if-eqz v0, :cond_8

    .line 273
    .line 274
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 275
    .line 276
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 277
    .line 278
    invoke-static {v0, p0}, La/wvb;->b0(La/yfu0;Landroid/content/Context;)V

    .line 279
    .line 280
    .line 281
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_c
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 285
    .line 286
    move-object v0, p0

    .line 287
    check-cast v0, La/i8b0;

    .line 288
    .line 289
    iget-object v0, v0, La/i8b0;->a:Landroid/widget/LinearLayout;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 295
    .line 296
    .line 297
    check-cast p0, La/i8b0;

    .line 298
    .line 299
    iget-object v0, p0, La/i8b0;->j:La/vd7;

    .line 300
    .line 301
    iget-object v0, v0, La/vd7;->c:Landroid/view/View;

    .line 302
    .line 303
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesShimmerCollection;

    .line 304
    .line 305
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 306
    .line 307
    .line 308
    iget-object v0, p0, La/i8b0;->b:La/auh;

    .line 309
    .line 310
    iget-object v0, v0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 311
    .line 312
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 313
    .line 314
    .line 315
    iget-object v0, p0, La/i8b0;->c:La/auh;

    .line 316
    .line 317
    iget-object v0, v0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 318
    .line 319
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 320
    .line 321
    .line 322
    iget-object v0, p0, La/i8b0;->f:La/nq8;

    .line 323
    .line 324
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 325
    .line 326
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 327
    .line 328
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, p0, La/i8b0;->i:La/nq8;

    .line 332
    .line 333
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 334
    .line 335
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 336
    .line 337
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 338
    .line 339
    .line 340
    iget-object v0, p0, La/i8b0;->h:La/nq8;

    .line 341
    .line 342
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 343
    .line 344
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 345
    .line 346
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 347
    .line 348
    .line 349
    iget-object v0, p0, La/i8b0;->e:La/nq8;

    .line 350
    .line 351
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 352
    .line 353
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 354
    .line 355
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 356
    .line 357
    .line 358
    iget-object v0, p0, La/i8b0;->d:La/nq8;

    .line 359
    .line 360
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 361
    .line 362
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 363
    .line 364
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 365
    .line 366
    .line 367
    iget-object p0, p0, La/i8b0;->g:La/nq8;

    .line 368
    .line 369
    iget-object p0, p0, La/nq8;->b:Landroid/view/View;

    .line 370
    .line 371
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 372
    .line 373
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 374
    .line 375
    .line 376
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object p0

    .line 379
    :pswitch_d
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 380
    .line 381
    move-object v0, p0

    .line 382
    check-cast v0, La/i8b0;

    .line 383
    .line 384
    iget-object v0, v0, La/i8b0;->a:Landroid/widget/LinearLayout;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 390
    .line 391
    .line 392
    check-cast p0, La/i8b0;

    .line 393
    .line 394
    iget-object v0, p0, La/i8b0;->j:La/vd7;

    .line 395
    .line 396
    iget-object v0, v0, La/vd7;->c:Landroid/view/View;

    .line 397
    .line 398
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesShimmerCollection;

    .line 399
    .line 400
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 401
    .line 402
    .line 403
    iget-object v0, p0, La/i8b0;->b:La/auh;

    .line 404
    .line 405
    iget-object v0, v0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 406
    .line 407
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 408
    .line 409
    .line 410
    iget-object v0, p0, La/i8b0;->c:La/auh;

    .line 411
    .line 412
    iget-object v0, v0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 413
    .line 414
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 415
    .line 416
    .line 417
    iget-object v0, p0, La/i8b0;->f:La/nq8;

    .line 418
    .line 419
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 420
    .line 421
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 422
    .line 423
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 424
    .line 425
    .line 426
    iget-object v0, p0, La/i8b0;->i:La/nq8;

    .line 427
    .line 428
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 429
    .line 430
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 431
    .line 432
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 433
    .line 434
    .line 435
    iget-object v0, p0, La/i8b0;->h:La/nq8;

    .line 436
    .line 437
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 438
    .line 439
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 440
    .line 441
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 442
    .line 443
    .line 444
    iget-object v0, p0, La/i8b0;->e:La/nq8;

    .line 445
    .line 446
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 447
    .line 448
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 449
    .line 450
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 451
    .line 452
    .line 453
    iget-object v0, p0, La/i8b0;->d:La/nq8;

    .line 454
    .line 455
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 456
    .line 457
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 458
    .line 459
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 460
    .line 461
    .line 462
    iget-object p0, p0, La/i8b0;->g:La/nq8;

    .line 463
    .line 464
    iget-object p0, p0, La/nq8;->b:Landroid/view/View;

    .line 465
    .line 466
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 467
    .line 468
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 469
    .line 470
    .line 471
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_e
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 475
    .line 476
    check-cast p0, La/g2k;

    .line 477
    .line 478
    iget-object p0, p0, La/g2k;->a:Landroid/widget/LinearLayout;

    .line 479
    .line 480
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 481
    .line 482
    .line 483
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object p0

    .line 486
    :pswitch_f
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 487
    .line 488
    check-cast p0, La/g2k;

    .line 489
    .line 490
    iget-object p0, p0, La/g2k;->a:Landroid/widget/LinearLayout;

    .line 491
    .line 492
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 493
    .line 494
    .line 495
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 496
    .line 497
    return-object p0

    .line 498
    :pswitch_10
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 499
    .line 500
    check-cast p0, La/y1k;

    .line 501
    .line 502
    iget-object p0, p0, La/y1k;->b:Landroid/widget/LinearLayout;

    .line 503
    .line 504
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 505
    .line 506
    .line 507
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    return-object p0

    .line 510
    :pswitch_11
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 511
    .line 512
    check-cast p0, La/y1k;

    .line 513
    .line 514
    iget-object p0, p0, La/y1k;->b:Landroid/widget/LinearLayout;

    .line 515
    .line 516
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 517
    .line 518
    .line 519
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object p0

    .line 522
    :pswitch_12
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 523
    .line 524
    move-object v0, p0

    .line 525
    check-cast v0, La/l2l;

    .line 526
    .line 527
    iget-object v0, v0, La/l2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 528
    .line 529
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->a()V

    .line 530
    .line 531
    .line 532
    check-cast p0, La/l2l;

    .line 533
    .line 534
    iget-object p0, p0, La/l2l;->c:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 535
    .line 536
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->a()V

    .line 537
    .line 538
    .line 539
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object p0

    .line 542
    :pswitch_13
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 543
    .line 544
    move-object v0, p0

    .line 545
    check-cast v0, La/prx;

    .line 546
    .line 547
    iget-object v0, v0, La/prx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 548
    .line 549
    iget-object v2, v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 550
    .line 551
    if-eqz v2, :cond_9

    .line 552
    .line 553
    invoke-interface {v2}, La/iwk;->a()V

    .line 554
    .line 555
    .line 556
    :cond_9
    iput-object v1, v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 557
    .line 558
    check-cast p0, La/prx;

    .line 559
    .line 560
    iget-object p0, p0, La/prx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 561
    .line 562
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 563
    .line 564
    if-eqz v0, :cond_a

    .line 565
    .line 566
    invoke-interface {v0}, La/iwk;->a()V

    .line 567
    .line 568
    .line 569
    :cond_a
    iput-object v1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 570
    .line 571
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 572
    .line 573
    return-object p0

    .line 574
    nop

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
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
