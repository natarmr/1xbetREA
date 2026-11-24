.class public final La/uic0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/vic0;


# direct methods
.method public synthetic constructor <init>(La/vic0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uic0;->i:B

    iput-object p1, p0, La/uic0;->k:La/vic0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/uic0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/uic0;->k:La/vic0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/uic0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/uic0;-><init>(La/vic0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/uic0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/uic0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/uic0;-><init>(La/vic0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/uic0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uic0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/zic0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/uic0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/uic0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/uic0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ejc0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/uic0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/uic0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/uic0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/uic0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/uic0;->k:La/vic0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/uic0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/zic0;

    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, La/vic0;->S1:[La/iiy;

    .line 19
    .line 20
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/wic0;->f:Lcom/google/android/material/button/MaterialButton;

    .line 25
    .line 26
    iget-boolean v0, p0, La/zic0;->a:Z

    .line 27
    .line 28
    iget-boolean v3, p0, La/zic0;->d:Z

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/wic0;->f:Lcom/google/android/material/button/MaterialButton;

    .line 38
    .line 39
    iget-boolean v0, p0, La/zic0;->a:Z

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const/high16 v0, 0x3f800000    # 1.0f

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p1, p1, La/wic0;->h:Landroid/widget/TextView;

    .line 56
    .line 57
    iget v0, p0, La/zic0;->b:I

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p1, p1, La/wic0;->c:Landroid/widget/FrameLayout;

    .line 71
    .line 72
    iget-boolean p0, p0, La/zic0;->c:Z

    .line 73
    .line 74
    invoke-virtual {p1, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-object p0, p0, La/wic0;->f:Lcom/google/android/material/button/MaterialButton;

    .line 82
    .line 83
    const/4 p1, 0x4

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    move v0, p1

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move v0, v2

    .line 89
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget-object p0, p0, La/wic0;->c:Landroid/widget/FrameLayout;

    .line 97
    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    move p1, v2

    .line 102
    :goto_2
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object p0, p0, La/wic0;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 110
    .line 111
    const/16 p1, 0x8

    .line 112
    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    move v0, v2

    .line 116
    goto :goto_3

    .line 117
    :cond_3
    move v0, p1

    .line 118
    :goto_3
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    iget-object p0, p0, La/wic0;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 126
    .line 127
    if-eqz v3, :cond_4

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    move v2, p1

    .line 131
    :goto_4
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_0
    check-cast p0, La/ejc0;

    .line 138
    .line 139
    sget-object v0, La/wne;->a:La/wne;

    .line 140
    .line 141
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    if-nez p0, :cond_5

    .line 145
    .line 146
    goto/16 :goto_7

    .line 147
    .line 148
    :cond_5
    instance-of p1, p0, La/bjc0;

    .line 149
    .line 150
    if-eqz p1, :cond_6

    .line 151
    .line 152
    sget-object p0, La/vic0;->S1:[La/iiy;

    .line 153
    .line 154
    iget-object p0, v1, La/vic0;->M1:Landroid/widget/PopupWindow;

    .line 155
    .line 156
    if-eqz p0, :cond_11

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_11

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_7

    .line 168
    .line 169
    :cond_6
    instance-of p1, p0, La/cjc0;

    .line 170
    .line 171
    const/4 v0, 0x1

    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    check-cast p0, La/cjc0;

    .line 175
    .line 176
    iget-object p0, p0, La/cjc0;->a:La/s470;

    .line 177
    .line 178
    sget-object p1, La/vic0;->S1:[La/iiy;

    .line 179
    .line 180
    iget-object p1, v1, La/vic0;->M1:Landroid/widget/PopupWindow;

    .line 181
    .line 182
    if-eqz p1, :cond_7

    .line 183
    .line 184
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 191
    .line 192
    .line 193
    :cond_7
    new-instance p1, Landroid/graphics/Rect;

    .line 194
    .line 195
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    iget-object v2, v2, La/wic0;->e:Landroid/widget/TextView;

    .line 203
    .line 204
    invoke-virtual {v2, p1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 205
    .line 206
    .line 207
    iget-object v2, v1, La/vic0;->N1:Landroid/graphics/Rect;

    .line 208
    .line 209
    invoke-virtual {v2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 210
    .line 211
    .line 212
    sget-object p1, La/hz6;->p2:La/cl5;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance p1, La/hz6;

    .line 221
    .line 222
    invoke-direct {p1}, La/hz6;-><init>()V

    .line 223
    .line 224
    .line 225
    sget-object v3, La/hz6;->q2:[La/iiy;

    .line 226
    .line 227
    aget-object v0, v3, v0

    .line 228
    .line 229
    iget-object v3, p1, La/hz6;->g2:La/phf0;

    .line 230
    .line 231
    const-string v4, "BONUS_BOUGHT_REQUEST_KEY"

    .line 232
    .line 233
    invoke-virtual {v3, p1, v0, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    new-instance v0, Landroid/os/Bundle;

    .line 237
    .line 238
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string v3, "KEY_ONE_X_TYPE"

    .line 242
    .line 243
    invoke-virtual {v0, v3, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 244
    .line 245
    .line 246
    const-string p0, "KEY_FAKE_VIEW_POSITION"

    .line 247
    .line 248
    invoke-virtual {v0, p0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-static {p1, p0}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_7

    .line 265
    .line 266
    :cond_8
    instance-of p1, p0, La/djc0;

    .line 267
    .line 268
    const/4 v3, 0x0

    .line 269
    if-eqz p1, :cond_c

    .line 270
    .line 271
    sget-object p0, La/vic0;->S1:[La/iiy;

    .line 272
    .line 273
    iget-object p0, v1, La/vic0;->M1:Landroid/widget/PopupWindow;

    .line 274
    .line 275
    if-eqz p0, :cond_9

    .line 276
    .line 277
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    if-ne p0, v0, :cond_9

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_9
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    iget-object p0, p0, La/wic0;->c:Landroid/widget/FrameLayout;

    .line 289
    .line 290
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    if-nez p0, :cond_a

    .line 295
    .line 296
    :goto_5
    invoke-virtual {v1}, La/vic0;->H0()La/hjc0;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    iput-boolean v2, p0, La/hjc0;->m:Z

    .line 301
    .line 302
    invoke-virtual {p0}, La/hjc0;->x()V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_7

    .line 306
    .line 307
    :cond_a
    iget-object p0, v1, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 308
    .line 309
    if-nez p0, :cond_b

    .line 310
    .line 311
    invoke-virtual {v1, v3}, Landroidx/fragment/app/Fragment;->b0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 316
    .line 317
    :cond_b
    const p1, 0x7f0d0686

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, p1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    new-instance p1, La/nb8;

    .line 325
    .line 326
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    const v4, 0x7f07072d

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 338
    .line 339
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    const v6, 0x7f040ae3

    .line 347
    .line 348
    .line 349
    invoke-static {v5, v6, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    invoke-direct {p1, v3, v5}, La/nb8;-><init>(FI)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 357
    .line 358
    .line 359
    new-instance p1, La/sic0;

    .line 360
    .line 361
    const/4 v3, 0x2

    .line 362
    invoke-direct {p1, v1, v3}, La/sic0;-><init>(La/vic0;B)V

    .line 363
    .line 364
    .line 365
    invoke-static {p0, p1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    const v5, 0x7f07007b

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    float-to-int p1, p1

    .line 380
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    const v6, 0x7f07007a

    .line 385
    .line 386
    .line 387
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    float-to-int v5, v5

    .line 392
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    float-to-int v4, v4

    .line 401
    new-array v3, v3, [I

    .line 402
    .line 403
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    iget-object v6, v6, La/wic0;->c:Landroid/widget/FrameLayout;

    .line 408
    .line 409
    invoke-virtual {v6, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 410
    .line 411
    .line 412
    new-instance v6, Landroid/widget/PopupWindow;

    .line 413
    .line 414
    invoke-direct {v6, p0, p1, v5}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    const p1, 0x7f070717

    .line 422
    .line 423
    .line 424
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 425
    .line 426
    .line 427
    move-result p0

    .line 428
    invoke-virtual {v6, p0}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1}, La/vic0;->G0()La/wic0;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    iget-object p0, p0, La/wic0;->d:Landroid/view/View;

    .line 436
    .line 437
    aget p1, v3, v2

    .line 438
    .line 439
    aget v2, v3, v0

    .line 440
    .line 441
    sub-int/2addr v2, v5

    .line 442
    sub-int/2addr v2, v4

    .line 443
    const v3, 0x800033

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, p0, v3, p1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 447
    .line 448
    .line 449
    iput-object v6, v1, La/vic0;->M1:Landroid/widget/PopupWindow;

    .line 450
    .line 451
    invoke-virtual {v1}, La/vic0;->H0()La/hjc0;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    iput-boolean v0, p0, La/hjc0;->m:Z

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_c
    instance-of p0, p0, La/ajc0;

    .line 459
    .line 460
    if-eqz p0, :cond_11

    .line 461
    .line 462
    sget-object p0, La/vic0;->S1:[La/iiy;

    .line 463
    .line 464
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    iget-object p0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 469
    .line 470
    invoke-virtual {p0}, La/pmi;->p()Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    :cond_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    if-eqz p1, :cond_e

    .line 486
    .line 487
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    move-object v0, p1

    .line 492
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 493
    .line 494
    instance-of v0, v0, La/hz6;

    .line 495
    .line 496
    if-eqz v0, :cond_d

    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_e
    move-object p1, v3

    .line 500
    :goto_6
    instance-of p0, p1, La/hz6;

    .line 501
    .line 502
    if-eqz p0, :cond_f

    .line 503
    .line 504
    move-object v3, p1

    .line 505
    check-cast v3, La/hz6;

    .line 506
    .line 507
    :cond_f
    if-eqz v3, :cond_10

    .line 508
    .line 509
    invoke-virtual {v3}, La/yo8;->x0()V

    .line 510
    .line 511
    .line 512
    :cond_10
    invoke-virtual {v1}, La/vic0;->H0()La/hjc0;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    invoke-virtual {p0}, La/hjc0;->x()V

    .line 517
    .line 518
    .line 519
    :cond_11
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object p0

    .line 522
    nop

    .line 523
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
