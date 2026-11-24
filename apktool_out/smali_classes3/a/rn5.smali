.class public final synthetic La/rn5;
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
    iput-byte p2, p0, La/rn5;->a:B

    iput-object p1, p0, La/rn5;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/rn5;->a:B

    .line 2
    .line 3
    const v1, 0x7f040b5f

    .line 4
    .line 5
    .line 6
    const v2, 0x7f040afc

    .line 7
    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    iget-object p0, p0, La/rn5;->b:La/cp;

    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 22
    .line 23
    check-cast p1, La/vjd;

    .line 24
    .line 25
    iget-object p1, p1, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 26
    .line 27
    new-instance v0, La/kja;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-direct {v0, p0, v1}, La/kja;-><init>(La/cp;B)V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/ugd;

    .line 34
    .line 35
    const v1, 0x3b2fce61

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 52
    .line 53
    move-object v0, p1

    .line 54
    check-cast v0, La/mth;

    .line 55
    .line 56
    iget-object v0, v0, La/mth;->b:Landroid/widget/ImageView;

    .line 57
    .line 58
    iget-object v1, p0, La/cp;->w:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/b2z;

    .line 65
    .line 66
    iget v2, v2, La/b2z;->b:I

    .line 67
    .line 68
    invoke-static {v2, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    check-cast p1, La/mth;

    .line 76
    .line 77
    iget-object p1, p1, La/mth;->a:Landroid/widget/FrameLayout;

    .line 78
    .line 79
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, La/b2z;

    .line 84
    .line 85
    iget p0, p0, La/b2z;->c:I

    .line 86
    .line 87
    invoke-virtual {v1, p0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, La/j140;

    .line 105
    .line 106
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 107
    .line 108
    check-cast p0, La/dux;

    .line 109
    .line 110
    iget-object v0, p0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 111
    .line 112
    iget v1, p1, La/j140;->d:I

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 118
    .line 119
    iget-boolean v1, p1, La/j140;->b:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, La/dux;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 125
    .line 126
    iget-object v1, p1, La/j140;->e:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p1, La/j140;->f:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    iget-object p0, p0, La/dux;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 137
    .line 138
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v5, p1, La/j140;->g:Ljava/lang/String;

    .line 148
    .line 149
    new-instance v9, La/k9;

    .line 150
    .line 151
    invoke-direct {v9, p0, v3}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 152
    .line 153
    .line 154
    new-instance v10, La/k9;

    .line 155
    .line 156
    const/16 p1, 0x9

    .line 157
    .line 158
    invoke-direct {v10, p0, p1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 159
    .line 160
    .line 161
    const/16 v11, 0xe

    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v8, 0x0

    .line 166
    invoke-static/range {v4 .. v11}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, La/j140;

    .line 180
    .line 181
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 182
    .line 183
    check-cast p0, La/zvx;

    .line 184
    .line 185
    iget-object v0, p0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 186
    .line 187
    iget v1, p1, La/j140;->d:I

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 193
    .line 194
    iget-boolean v1, p1, La/j140;->b:Z

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 197
    .line 198
    .line 199
    iget-object p0, p0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 200
    .line 201
    iget-object v0, p1, La/j140;->e:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    iget-object p1, p1, La/j140;->f:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 218
    .line 219
    check-cast p1, La/wsh;

    .line 220
    .line 221
    iget-object p1, p1, La/wsh;->b:Landroid/widget/TextView;

    .line 222
    .line 223
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, La/ulf;

    .line 228
    .line 229
    iget-object v0, v0, La/ulf;->a:La/ank0;

    .line 230
    .line 231
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 232
    .line 233
    invoke-virtual {v0, p0}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 247
    .line 248
    move-object v0, p1

    .line 249
    check-cast v0, La/ysh;

    .line 250
    .line 251
    iget-object v0, v0, La/ysh;->b:Landroid/widget/TextView;

    .line 252
    .line 253
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, La/tlf;

    .line 258
    .line 259
    iget-object v1, v1, La/tlf;->a:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    .line 263
    .line 264
    check-cast p1, La/ysh;

    .line 265
    .line 266
    iget-object v0, p1, La/ysh;->c:Landroid/widget/TextView;

    .line 267
    .line 268
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, La/tlf;

    .line 273
    .line 274
    iget-object v1, v1, La/tlf;->b:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    .line 278
    .line 279
    iget-object p1, p1, La/ysh;->c:Landroid/widget/TextView;

    .line 280
    .line 281
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 282
    .line 283
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    check-cast p0, La/tlf;

    .line 288
    .line 289
    iget p0, p0, La/tlf;->c:I

    .line 290
    .line 291
    invoke-static {p0, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 296
    .line 297
    .line 298
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 305
    .line 306
    move-object v0, p1

    .line 307
    check-cast v0, La/vsh;

    .line 308
    .line 309
    iget-object v0, v0, La/vsh;->e:Landroid/widget/TextView;

    .line 310
    .line 311
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, La/glf;

    .line 316
    .line 317
    iget-object v1, v1, La/glf;->a:La/ank0;

    .line 318
    .line 319
    iget-object v2, p0, La/cp;->w:Landroid/content/Context;

    .line 320
    .line 321
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    .line 328
    check-cast p1, La/vsh;

    .line 329
    .line 330
    iget-object v0, p1, La/vsh;->j:Landroid/widget/TextView;

    .line 331
    .line 332
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, La/glf;

    .line 337
    .line 338
    iget-object v1, v1, La/glf;->b:La/ank0;

    .line 339
    .line 340
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    check-cast v0, La/glf;

    .line 352
    .line 353
    iget-object v0, v0, La/glf;->c:Ljava/lang/String;

    .line 354
    .line 355
    iget-object v1, p1, La/vsh;->k:Landroid/widget/ImageView;

    .line 356
    .line 357
    invoke-static {v1, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, La/glf;

    .line 365
    .line 366
    iget-object v0, v0, La/glf;->h:Ljava/lang/String;

    .line 367
    .line 368
    iget-object v1, p1, La/vsh;->d:Landroid/widget/ImageView;

    .line 369
    .line 370
    invoke-static {v1, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, La/glf;

    .line 378
    .line 379
    iget-object v0, v0, La/glf;->d:Ljava/lang/String;

    .line 380
    .line 381
    iget-object v3, p1, La/vsh;->b:Landroid/widget/ImageView;

    .line 382
    .line 383
    invoke-static {v3, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, La/glf;

    .line 391
    .line 392
    iget-object v0, v0, La/glf;->e:Ljava/lang/String;

    .line 393
    .line 394
    iget-object v3, p1, La/vsh;->g:Landroid/widget/ImageView;

    .line 395
    .line 396
    invoke-static {v3, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, La/glf;

    .line 404
    .line 405
    iget-object v0, v0, La/glf;->f:Ljava/lang/String;

    .line 406
    .line 407
    iget-object v3, p1, La/vsh;->h:Landroid/widget/ImageView;

    .line 408
    .line 409
    invoke-static {v3, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, La/glf;

    .line 417
    .line 418
    iget-object v0, v0, La/glf;->g:Ljava/lang/String;

    .line 419
    .line 420
    iget-object v3, p1, La/vsh;->f:Landroid/widget/ImageView;

    .line 421
    .line 422
    invoke-static {v3, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, La/glf;

    .line 430
    .line 431
    iget-object v0, v0, La/glf;->h:Ljava/lang/String;

    .line 432
    .line 433
    invoke-static {v1, v0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    iget-object v0, p1, La/vsh;->i:Landroid/widget/TextView;

    .line 437
    .line 438
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    check-cast v1, La/glf;

    .line 443
    .line 444
    iget-object v1, v1, La/glf;->i:La/ank0;

    .line 445
    .line 446
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    check-cast p0, La/glf;

    .line 458
    .line 459
    iget-object p0, p0, La/glf;->j:Ljava/lang/String;

    .line 460
    .line 461
    iget-object p1, p1, La/vsh;->c:Landroid/widget/ImageView;

    .line 462
    .line 463
    invoke-static {p1, p0}, La/d5c;->T(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object p0

    .line 469
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 473
    .line 474
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 475
    .line 476
    move-object v0, p1

    .line 477
    check-cast v0, La/tsh;

    .line 478
    .line 479
    iget-object v1, v0, La/tsh;->b:Landroid/widget/ImageView;

    .line 480
    .line 481
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, La/flf;

    .line 486
    .line 487
    iget-object v2, v0, La/flf;->b:Ljava/lang/String;

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const/16 v8, 0x1fe

    .line 491
    .line 492
    const/4 v3, 0x0

    .line 493
    const/4 v4, 0x0

    .line 494
    const/4 v5, 0x0

    .line 495
    const/4 v6, 0x0

    .line 496
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 497
    .line 498
    .line 499
    check-cast p1, La/tsh;

    .line 500
    .line 501
    iget-object v0, p1, La/tsh;->d:Landroid/widget/TextView;

    .line 502
    .line 503
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, La/flf;

    .line 508
    .line 509
    iget-object v1, v1, La/flf;->a:La/ank0;

    .line 510
    .line 511
    iget-object v2, p0, La/cp;->w:Landroid/content/Context;

    .line 512
    .line 513
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 518
    .line 519
    .line 520
    iget-object p1, p1, La/tsh;->c:Landroid/widget/TextView;

    .line 521
    .line 522
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    check-cast p0, La/flf;

    .line 527
    .line 528
    iget-object p0, p0, La/flf;->c:La/ank0;

    .line 529
    .line 530
    invoke-virtual {p0, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 535
    .line 536
    .line 537
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 538
    .line 539
    return-object p0

    .line 540
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 544
    .line 545
    move-object v0, p1

    .line 546
    check-cast v0, La/btx;

    .line 547
    .line 548
    iget-object v0, v0, La/btx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 549
    .line 550
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, La/lob;

    .line 555
    .line 556
    iget-object v1, v1, La/lob;->b:Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 559
    .line 560
    .line 561
    check-cast p1, La/btx;

    .line 562
    .line 563
    iget-object v0, p1, La/btx;->c:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 564
    .line 565
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    check-cast v1, La/lob;

    .line 570
    .line 571
    iget-boolean v1, v1, La/lob;->d:Z

    .line 572
    .line 573
    if-nez v1, :cond_0

    .line 574
    .line 575
    const/4 v3, 0x0

    .line 576
    :cond_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 577
    .line 578
    .line 579
    iget-object p1, p1, La/btx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 580
    .line 581
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    check-cast p0, La/lob;

    .line 586
    .line 587
    iget-boolean p0, p0, La/lob;->c:Z

    .line 588
    .line 589
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 590
    .line 591
    .line 592
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object p0

    .line 595
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 599
    .line 600
    move-object v0, p1

    .line 601
    check-cast v0, La/itx;

    .line 602
    .line 603
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 604
    .line 605
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    check-cast v1, La/b240;

    .line 610
    .line 611
    iget v1, v1, La/b240;->d:I

    .line 612
    .line 613
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 614
    .line 615
    .line 616
    check-cast p1, La/itx;

    .line 617
    .line 618
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 619
    .line 620
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    check-cast v1, La/b240;

    .line 625
    .line 626
    iget-object v1, v1, La/b240;->e:Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 632
    .line 633
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    check-cast p0, La/b240;

    .line 638
    .line 639
    iget-boolean p0, p0, La/b240;->b:Z

    .line 640
    .line 641
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 642
    .line 643
    .line 644
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 645
    .line 646
    return-object p0

    .line 647
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 651
    .line 652
    move-object v0, p1

    .line 653
    check-cast v0, La/itx;

    .line 654
    .line 655
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 656
    .line 657
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    check-cast v1, La/v140;

    .line 662
    .line 663
    iget v1, v1, La/v140;->d:I

    .line 664
    .line 665
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 666
    .line 667
    .line 668
    check-cast p1, La/itx;

    .line 669
    .line 670
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 671
    .line 672
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    check-cast v1, La/v140;

    .line 677
    .line 678
    iget-object v1, v1, La/v140;->e:Ljava/lang/String;

    .line 679
    .line 680
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 684
    .line 685
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    check-cast p0, La/v140;

    .line 690
    .line 691
    iget-boolean p0, p0, La/v140;->b:Z

    .line 692
    .line 693
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 694
    .line 695
    .line 696
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 697
    .line 698
    return-object p0

    .line 699
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 703
    .line 704
    move-object v0, p1

    .line 705
    check-cast v0, La/itx;

    .line 706
    .line 707
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 708
    .line 709
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    check-cast v1, La/n140;

    .line 714
    .line 715
    iget v1, v1, La/n140;->d:I

    .line 716
    .line 717
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 718
    .line 719
    .line 720
    check-cast p1, La/itx;

    .line 721
    .line 722
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 723
    .line 724
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    check-cast v1, La/n140;

    .line 729
    .line 730
    iget-object v1, v1, La/n140;->e:Ljava/lang/String;

    .line 731
    .line 732
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 736
    .line 737
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    check-cast p0, La/n140;

    .line 742
    .line 743
    iget-boolean p0, p0, La/n140;->b:Z

    .line 744
    .line 745
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 746
    .line 747
    .line 748
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 749
    .line 750
    return-object p0

    .line 751
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 755
    .line 756
    move-object v0, p1

    .line 757
    check-cast v0, La/htx;

    .line 758
    .line 759
    iget-object v0, v0, La/htx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 760
    .line 761
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 762
    .line 763
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    check-cast v4, La/l140;

    .line 768
    .line 769
    invoke-static {v2, v3}, La/m5d;->b(ILandroid/content/Context;)I

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
    invoke-static {v0, v2}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 778
    .line 779
    .line 780
    check-cast p1, La/htx;

    .line 781
    .line 782
    iget-object v0, p1, La/htx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 783
    .line 784
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    check-cast v2, La/l140;

    .line 789
    .line 790
    iget v2, v2, La/l140;->d:I

    .line 791
    .line 792
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 793
    .line 794
    .line 795
    iget-object p1, p1, La/htx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 796
    .line 797
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    check-cast v0, La/l140;

    .line 802
    .line 803
    invoke-static {v1, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 804
    .line 805
    .line 806
    move-result v0

    .line 807
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    check-cast v0, La/l140;

    .line 819
    .line 820
    iget-object v0, v0, La/l140;->e:Ljava/lang/String;

    .line 821
    .line 822
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object p0

    .line 829
    check-cast p0, La/l140;

    .line 830
    .line 831
    iget-boolean p0, p0, La/l140;->b:Z

    .line 832
    .line 833
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 834
    .line 835
    .line 836
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 837
    .line 838
    return-object p0

    .line 839
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 843
    .line 844
    move-object v0, p1

    .line 845
    check-cast v0, La/htx;

    .line 846
    .line 847
    iget-object v0, v0, La/htx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 848
    .line 849
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    check-cast v1, La/k140;

    .line 854
    .line 855
    iget v1, v1, La/k140;->f:I

    .line 856
    .line 857
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 858
    .line 859
    .line 860
    check-cast p1, La/htx;

    .line 861
    .line 862
    iget-object v0, p1, La/htx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 863
    .line 864
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    check-cast v1, La/k140;

    .line 869
    .line 870
    iget-object v1, v1, La/k140;->i:Ljava/lang/String;

    .line 871
    .line 872
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    iget-object p1, p1, La/htx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 876
    .line 877
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    check-cast v0, La/k140;

    .line 882
    .line 883
    iget-boolean v0, v0, La/k140;->b:Z

    .line 884
    .line 885
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    check-cast v0, La/k140;

    .line 893
    .line 894
    iget v0, v0, La/k140;->d:I

    .line 895
    .line 896
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeBackgroundTint(I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object p0

    .line 903
    check-cast p0, La/k140;

    .line 904
    .line 905
    iget p0, p0, La/k140;->l:I

    .line 906
    .line 907
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 908
    .line 909
    .line 910
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 911
    .line 912
    return-object p0

    .line 913
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 917
    .line 918
    move-object v0, p1

    .line 919
    check-cast v0, La/itx;

    .line 920
    .line 921
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 922
    .line 923
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    check-cast v1, La/j140;

    .line 928
    .line 929
    iget v1, v1, La/j140;->d:I

    .line 930
    .line 931
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 932
    .line 933
    .line 934
    check-cast p1, La/itx;

    .line 935
    .line 936
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 937
    .line 938
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    check-cast v1, La/j140;

    .line 943
    .line 944
    iget-object v1, v1, La/j140;->e:Ljava/lang/String;

    .line 945
    .line 946
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 950
    .line 951
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object p0

    .line 955
    check-cast p0, La/j140;

    .line 956
    .line 957
    iget-boolean p0, p0, La/j140;->b:Z

    .line 958
    .line 959
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 960
    .line 961
    .line 962
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 963
    .line 964
    return-object p0

    .line 965
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 969
    .line 970
    move-object v0, p1

    .line 971
    check-cast v0, La/itx;

    .line 972
    .line 973
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 974
    .line 975
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    check-cast v1, La/h140;

    .line 980
    .line 981
    iget-object v1, v1, La/h140;->d:Ljava/lang/String;

    .line 982
    .line 983
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    check-cast v2, La/h140;

    .line 988
    .line 989
    iget v2, v2, La/h140;->e:I

    .line 990
    .line 991
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->v(ILjava/lang/String;)V

    .line 992
    .line 993
    .line 994
    check-cast p1, La/itx;

    .line 995
    .line 996
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 997
    .line 998
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    check-cast v1, La/h140;

    .line 1003
    .line 1004
    iget-object v1, v1, La/h140;->f:Ljava/lang/String;

    .line 1005
    .line 1006
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1010
    .line 1011
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object p0

    .line 1015
    check-cast p0, La/h140;

    .line 1016
    .line 1017
    iget-boolean p0, p0, La/h140;->a:Z

    .line 1018
    .line 1019
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1020
    .line 1021
    .line 1022
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1023
    .line 1024
    return-object p0

    .line 1025
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1026
    .line 1027
    .line 1028
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1029
    .line 1030
    move-object v0, p1

    .line 1031
    check-cast v0, La/gtx;

    .line 1032
    .line 1033
    iget-object v0, v0, La/gtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1034
    .line 1035
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    check-cast v1, La/w140;

    .line 1040
    .line 1041
    iget v1, v1, La/w140;->d:I

    .line 1042
    .line 1043
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1044
    .line 1045
    .line 1046
    check-cast p1, La/gtx;

    .line 1047
    .line 1048
    iget-object v0, p1, La/gtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1049
    .line 1050
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    check-cast v1, La/w140;

    .line 1055
    .line 1056
    iget-object v1, v1, La/w140;->e:Ljava/lang/String;

    .line 1057
    .line 1058
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    iget-object p1, p1, La/gtx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1062
    .line 1063
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    check-cast v0, La/w140;

    .line 1068
    .line 1069
    iget-object v0, v0, La/w140;->f:Ljava/lang/String;

    .line 1070
    .line 1071
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p0

    .line 1078
    check-cast p0, La/w140;

    .line 1079
    .line 1080
    iget-boolean p0, p0, La/w140;->b:Z

    .line 1081
    .line 1082
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1083
    .line 1084
    .line 1085
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1086
    .line 1087
    return-object p0

    .line 1088
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1092
    .line 1093
    move-object v0, p1

    .line 1094
    check-cast v0, La/ftx;

    .line 1095
    .line 1096
    iget-object v0, v0, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1097
    .line 1098
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    check-cast v1, La/b240;

    .line 1103
    .line 1104
    iget v1, v1, La/b240;->d:I

    .line 1105
    .line 1106
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1107
    .line 1108
    .line 1109
    check-cast p1, La/ftx;

    .line 1110
    .line 1111
    iget-object v0, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1112
    .line 1113
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v1

    .line 1117
    check-cast v1, La/b240;

    .line 1118
    .line 1119
    iget-object v1, v1, La/b240;->e:Ljava/lang/String;

    .line 1120
    .line 1121
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    iget-object p1, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1125
    .line 1126
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    check-cast v0, La/b240;

    .line 1131
    .line 1132
    iget-object v0, v0, La/b240;->f:Ljava/lang/String;

    .line 1133
    .line 1134
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object p0

    .line 1141
    check-cast p0, La/b240;

    .line 1142
    .line 1143
    iget-boolean p0, p0, La/b240;->b:Z

    .line 1144
    .line 1145
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1146
    .line 1147
    .line 1148
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1149
    .line 1150
    return-object p0

    .line 1151
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1155
    .line 1156
    move-object v0, p1

    .line 1157
    check-cast v0, La/itx;

    .line 1158
    .line 1159
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1160
    .line 1161
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    check-cast v1, La/a240;

    .line 1166
    .line 1167
    iget v1, v1, La/a240;->d:I

    .line 1168
    .line 1169
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1170
    .line 1171
    .line 1172
    check-cast p1, La/itx;

    .line 1173
    .line 1174
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1175
    .line 1176
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v1

    .line 1180
    check-cast v1, La/a240;

    .line 1181
    .line 1182
    iget-object v1, v1, La/a240;->e:Ljava/lang/String;

    .line 1183
    .line 1184
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1188
    .line 1189
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    check-cast v0, La/a240;

    .line 1194
    .line 1195
    iget-boolean v0, v0, La/a240;->b:Z

    .line 1196
    .line 1197
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    check-cast v0, La/a240;

    .line 1205
    .line 1206
    iget v0, v0, La/a240;->g:I

    .line 1207
    .line 1208
    if-lez v0, :cond_1

    .line 1209
    .line 1210
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object p0

    .line 1214
    check-cast p0, La/a240;

    .line 1215
    .line 1216
    iget p0, p0, La/a240;->g:I

    .line 1217
    .line 1218
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1219
    .line 1220
    .line 1221
    move-result-object p0

    .line 1222
    goto :goto_0

    .line 1223
    :cond_1
    const/4 p0, 0x0

    .line 1224
    :goto_0
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setCounter(Ljava/lang/Integer;)V

    .line 1225
    .line 1226
    .line 1227
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1228
    .line 1229
    return-object p0

    .line 1230
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1231
    .line 1232
    .line 1233
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1234
    .line 1235
    move-object v0, p1

    .line 1236
    check-cast v0, La/ftx;

    .line 1237
    .line 1238
    iget-object v0, v0, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1239
    .line 1240
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    check-cast v1, La/v140;

    .line 1245
    .line 1246
    iget v1, v1, La/v140;->d:I

    .line 1247
    .line 1248
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1249
    .line 1250
    .line 1251
    check-cast p1, La/ftx;

    .line 1252
    .line 1253
    iget-object v0, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1254
    .line 1255
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v1

    .line 1259
    check-cast v1, La/v140;

    .line 1260
    .line 1261
    iget-object v1, v1, La/v140;->e:Ljava/lang/String;

    .line 1262
    .line 1263
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    iget-object p1, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1267
    .line 1268
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    check-cast v0, La/v140;

    .line 1273
    .line 1274
    iget-object v0, v0, La/v140;->f:Ljava/lang/String;

    .line 1275
    .line 1276
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object p0

    .line 1283
    check-cast p0, La/v140;

    .line 1284
    .line 1285
    iget-boolean p0, p0, La/v140;->b:Z

    .line 1286
    .line 1287
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1288
    .line 1289
    .line 1290
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1291
    .line 1292
    return-object p0

    .line 1293
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    .line 1295
    .line 1296
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1297
    .line 1298
    move-object v0, p1

    .line 1299
    check-cast v0, La/itx;

    .line 1300
    .line 1301
    iget-object v0, v0, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1302
    .line 1303
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v1

    .line 1307
    check-cast v1, La/w140;

    .line 1308
    .line 1309
    iget v1, v1, La/w140;->d:I

    .line 1310
    .line 1311
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1312
    .line 1313
    .line 1314
    check-cast p1, La/itx;

    .line 1315
    .line 1316
    iget-object v0, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1317
    .line 1318
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    check-cast v1, La/w140;

    .line 1323
    .line 1324
    iget-object v1, v1, La/w140;->e:Ljava/lang/String;

    .line 1325
    .line 1326
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    iget-object p1, p1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1330
    .line 1331
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object p0

    .line 1335
    check-cast p0, La/w140;

    .line 1336
    .line 1337
    iget-boolean p0, p0, La/w140;->b:Z

    .line 1338
    .line 1339
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1340
    .line 1341
    .line 1342
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1343
    .line 1344
    return-object p0

    .line 1345
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1346
    .line 1347
    .line 1348
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1349
    .line 1350
    move-object v0, p1

    .line 1351
    check-cast v0, La/ftx;

    .line 1352
    .line 1353
    iget-object v0, v0, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1354
    .line 1355
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v1

    .line 1359
    check-cast v1, La/n140;

    .line 1360
    .line 1361
    iget v1, v1, La/n140;->d:I

    .line 1362
    .line 1363
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1364
    .line 1365
    .line 1366
    check-cast p1, La/ftx;

    .line 1367
    .line 1368
    iget-object v0, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1369
    .line 1370
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    check-cast v1, La/n140;

    .line 1375
    .line 1376
    iget-object v1, v1, La/n140;->e:Ljava/lang/String;

    .line 1377
    .line 1378
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1379
    .line 1380
    .line 1381
    iget-object p1, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1382
    .line 1383
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    check-cast v0, La/n140;

    .line 1388
    .line 1389
    iget-object v0, v0, La/n140;->f:Ljava/lang/String;

    .line 1390
    .line 1391
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object p0

    .line 1398
    check-cast p0, La/n140;

    .line 1399
    .line 1400
    iget-boolean p0, p0, La/n140;->b:Z

    .line 1401
    .line 1402
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1403
    .line 1404
    .line 1405
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1406
    .line 1407
    return-object p0

    .line 1408
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1412
    .line 1413
    move-object v0, p1

    .line 1414
    check-cast v0, La/etx;

    .line 1415
    .line 1416
    iget-object v0, v0, La/etx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1417
    .line 1418
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v3

    .line 1422
    check-cast v3, La/l140;

    .line 1423
    .line 1424
    iget v3, v3, La/l140;->d:I

    .line 1425
    .line 1426
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1427
    .line 1428
    .line 1429
    check-cast p1, La/etx;

    .line 1430
    .line 1431
    iget-object v0, p1, La/etx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1432
    .line 1433
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 1434
    .line 1435
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v4

    .line 1439
    check-cast v4, La/l140;

    .line 1440
    .line 1441
    invoke-static {v1, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1442
    .line 1443
    .line 1444
    move-result v1

    .line 1445
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v1

    .line 1449
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 1450
    .line 1451
    .line 1452
    iget-object p1, p1, La/etx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1453
    .line 1454
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v0

    .line 1458
    check-cast v0, La/l140;

    .line 1459
    .line 1460
    invoke-static {v2, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1461
    .line 1462
    .line 1463
    move-result v0

    .line 1464
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    invoke-static {p1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v0

    .line 1475
    check-cast v0, La/l140;

    .line 1476
    .line 1477
    iget-object v0, v0, La/l140;->e:Ljava/lang/String;

    .line 1478
    .line 1479
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    check-cast v0, La/l140;

    .line 1487
    .line 1488
    iget-object v0, v0, La/l140;->f:Ljava/lang/String;

    .line 1489
    .line 1490
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object p0

    .line 1497
    check-cast p0, La/l140;

    .line 1498
    .line 1499
    iget-boolean p0, p0, La/l140;->b:Z

    .line 1500
    .line 1501
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1502
    .line 1503
    .line 1504
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1505
    .line 1506
    return-object p0

    .line 1507
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1511
    .line 1512
    move-object v0, p1

    .line 1513
    check-cast v0, La/etx;

    .line 1514
    .line 1515
    iget-object v0, v0, La/etx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1516
    .line 1517
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    check-cast v1, La/k140;

    .line 1522
    .line 1523
    iget v1, v1, La/k140;->f:I

    .line 1524
    .line 1525
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1526
    .line 1527
    .line 1528
    check-cast p1, La/etx;

    .line 1529
    .line 1530
    iget-object v0, p1, La/etx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1531
    .line 1532
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v1

    .line 1536
    check-cast v1, La/k140;

    .line 1537
    .line 1538
    iget-object v1, v1, La/k140;->i:Ljava/lang/String;

    .line 1539
    .line 1540
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1541
    .line 1542
    .line 1543
    iget-object v0, p1, La/etx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1544
    .line 1545
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    check-cast v1, La/k140;

    .line 1550
    .line 1551
    iget-object v1, v1, La/k140;->j:Ljava/lang/String;

    .line 1552
    .line 1553
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    check-cast v1, La/k140;

    .line 1561
    .line 1562
    iget-boolean v1, v1, La/k140;->b:Z

    .line 1563
    .line 1564
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v1

    .line 1571
    check-cast v1, La/k140;

    .line 1572
    .line 1573
    iget v1, v1, La/k140;->d:I

    .line 1574
    .line 1575
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeBackgroundTint(I)V

    .line 1576
    .line 1577
    .line 1578
    iget-object p1, p1, La/etx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1579
    .line 1580
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object p0

    .line 1584
    check-cast p0, La/k140;

    .line 1585
    .line 1586
    iget p0, p0, La/k140;->l:I

    .line 1587
    .line 1588
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1589
    .line 1590
    .line 1591
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1592
    .line 1593
    return-object p0

    .line 1594
    :pswitch_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1595
    .line 1596
    .line 1597
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1598
    .line 1599
    move-object v0, p1

    .line 1600
    check-cast v0, La/ftx;

    .line 1601
    .line 1602
    iget-object v0, v0, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1603
    .line 1604
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v1

    .line 1608
    check-cast v1, La/j140;

    .line 1609
    .line 1610
    iget v1, v1, La/j140;->d:I

    .line 1611
    .line 1612
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1613
    .line 1614
    .line 1615
    check-cast p1, La/ftx;

    .line 1616
    .line 1617
    iget-object v0, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1618
    .line 1619
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v1

    .line 1623
    check-cast v1, La/j140;

    .line 1624
    .line 1625
    iget-object v1, v1, La/j140;->e:Ljava/lang/String;

    .line 1626
    .line 1627
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1628
    .line 1629
    .line 1630
    iget-object p1, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1631
    .line 1632
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    check-cast v0, La/j140;

    .line 1637
    .line 1638
    iget-object v0, v0, La/j140;->f:Ljava/lang/String;

    .line 1639
    .line 1640
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1644
    .line 1645
    .line 1646
    move-result-object p0

    .line 1647
    check-cast p0, La/j140;

    .line 1648
    .line 1649
    iget-boolean p0, p0, La/j140;->b:Z

    .line 1650
    .line 1651
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1652
    .line 1653
    .line 1654
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1655
    .line 1656
    return-object p0

    .line 1657
    :pswitch_18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1658
    .line 1659
    .line 1660
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1661
    .line 1662
    move-object v0, p1

    .line 1663
    check-cast v0, La/ftx;

    .line 1664
    .line 1665
    iget-object v0, v0, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1666
    .line 1667
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v1

    .line 1671
    check-cast v1, La/h140;

    .line 1672
    .line 1673
    iget-object v1, v1, La/h140;->d:Ljava/lang/String;

    .line 1674
    .line 1675
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v2

    .line 1679
    check-cast v2, La/h140;

    .line 1680
    .line 1681
    iget v2, v2, La/h140;->e:I

    .line 1682
    .line 1683
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->v(ILjava/lang/String;)V

    .line 1684
    .line 1685
    .line 1686
    check-cast p1, La/ftx;

    .line 1687
    .line 1688
    iget-object v0, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1689
    .line 1690
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v1

    .line 1694
    check-cast v1, La/h140;

    .line 1695
    .line 1696
    iget-object v1, v1, La/h140;->f:Ljava/lang/String;

    .line 1697
    .line 1698
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1699
    .line 1700
    .line 1701
    iget-object p1, p1, La/ftx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1702
    .line 1703
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    check-cast v0, La/h140;

    .line 1708
    .line 1709
    iget-object v0, v0, La/h140;->g:Ljava/lang/String;

    .line 1710
    .line 1711
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1715
    .line 1716
    .line 1717
    move-result-object p0

    .line 1718
    check-cast p0, La/h140;

    .line 1719
    .line 1720
    iget-boolean p0, p0, La/h140;->a:Z

    .line 1721
    .line 1722
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1723
    .line 1724
    .line 1725
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1726
    .line 1727
    return-object p0

    .line 1728
    :pswitch_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1729
    .line 1730
    .line 1731
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1732
    .line 1733
    move-object v0, p1

    .line 1734
    check-cast v0, La/etc;

    .line 1735
    .line 1736
    iget-object v0, v0, La/etc;->c:Landroid/view/View;

    .line 1737
    .line 1738
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v1

    .line 1742
    check-cast v1, La/itc;

    .line 1743
    .line 1744
    iget-boolean v1, v1, La/itc;->b:Z

    .line 1745
    .line 1746
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 1747
    .line 1748
    .line 1749
    check-cast p1, La/etc;

    .line 1750
    .line 1751
    iget-object v0, p1, La/etc;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1752
    .line 1753
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v1

    .line 1757
    check-cast v1, La/itc;

    .line 1758
    .line 1759
    iget-object v1, v1, La/itc;->d:Ljava/lang/String;

    .line 1760
    .line 1761
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 1762
    .line 1763
    .line 1764
    iget-object p1, p1, La/etc;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1765
    .line 1766
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1767
    .line 1768
    .line 1769
    move-result-object p0

    .line 1770
    check-cast p0, La/itc;

    .line 1771
    .line 1772
    iget-object p0, p0, La/itc;->e:Ljava/lang/String;

    .line 1773
    .line 1774
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setLabelText(Ljava/lang/CharSequence;)V

    .line 1775
    .line 1776
    .line 1777
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1778
    .line 1779
    return-object p0

    .line 1780
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1781
    .line 1782
    .line 1783
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1784
    .line 1785
    check-cast p1, La/ksx;

    .line 1786
    .line 1787
    iget-object v0, p1, La/ksx;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1788
    .line 1789
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v1

    .line 1793
    check-cast v1, La/jp9;

    .line 1794
    .line 1795
    iget-object v1, v1, La/jp9;->b:Ljava/lang/String;

    .line 1796
    .line 1797
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1798
    .line 1799
    .line 1800
    iget-object p1, p1, La/ksx;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1801
    .line 1802
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object p0

    .line 1806
    check-cast p0, La/jp9;

    .line 1807
    .line 1808
    iget-boolean p0, p0, La/jp9;->c:Z

    .line 1809
    .line 1810
    invoke-virtual {p1, p0}, La/tw5;->setLast(Z)V

    .line 1811
    .line 1812
    .line 1813
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1814
    .line 1815
    return-object p0

    .line 1816
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1817
    .line 1818
    .line 1819
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1820
    .line 1821
    check-cast p1, La/isx;

    .line 1822
    .line 1823
    iget-object p1, p1, La/isx;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 1824
    .line 1825
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1826
    .line 1827
    .line 1828
    move-result-object p0

    .line 1829
    check-cast p0, La/ff9;

    .line 1830
    .line 1831
    invoke-virtual {p0}, La/ff9;->getTitle()Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object p0

    .line 1835
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 1836
    .line 1837
    .line 1838
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1839
    .line 1840
    return-object p0

    .line 1841
    :pswitch_1c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1842
    .line 1843
    .line 1844
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 1845
    .line 1846
    move-object v0, p1

    .line 1847
    check-cast v0, La/gsx;

    .line 1848
    .line 1849
    iget-object v0, v0, La/gsx;->b:Landroid/widget/TextView;

    .line 1850
    .line 1851
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v1

    .line 1855
    check-cast v1, La/rg5;

    .line 1856
    .line 1857
    iget-object v1, v1, La/rg5;->c:Ljava/lang/String;

    .line 1858
    .line 1859
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1860
    .line 1861
    .line 1862
    check-cast p1, La/gsx;

    .line 1863
    .line 1864
    iget-object p1, p1, La/gsx;->c:Landroid/widget/TextView;

    .line 1865
    .line 1866
    sget-object v0, La/pn40;->a:La/pn40;

    .line 1867
    .line 1868
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v0

    .line 1872
    check-cast v0, La/rg5;

    .line 1873
    .line 1874
    iget-wide v0, v0, La/rg5;->b:D

    .line 1875
    .line 1876
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1877
    .line 1878
    .line 1879
    move-result-object p0

    .line 1880
    check-cast p0, La/rg5;

    .line 1881
    .line 1882
    iget-object p0, p0, La/rg5;->d:Ljava/lang/String;

    .line 1883
    .line 1884
    sget-object v2, La/p3u0;->c:La/p3u0;

    .line 1885
    .line 1886
    invoke-static {v0, v1, p0, v2}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object p0

    .line 1890
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1891
    .line 1892
    .line 1893
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1894
    .line 1895
    return-object p0

    .line 1896
    nop

    .line 1897
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
