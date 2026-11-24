.class public final La/tvn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/vvn0;


# direct methods
.method public synthetic constructor <init>(La/vvn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tvn0;->i:B

    iput-object p1, p0, La/tvn0;->k:La/vvn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tvn0;->k:La/vvn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tvn0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tvn0;-><init>(La/vvn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/tvn0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/tvn0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/tvn0;-><init>(La/vvn0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/tvn0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/tvn0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/wxn0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/tvn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tvn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tvn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/uxn0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/tvn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/tvn0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/tvn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tvn0;->i:B

    .line 4
    .line 5
    const-string v2, " "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/tvn0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/wxn0;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, La/tvn0;->k:La/vvn0;

    .line 24
    .line 25
    iget-object v6, v0, La/vvn0;->U1:La/a8z;

    .line 26
    .line 27
    sget-object v7, La/vvn0;->W1:La/j6m0;

    .line 28
    .line 29
    iget-object v7, v1, La/wxn0;->a:La/a4x;

    .line 30
    .line 31
    iget-boolean v8, v1, La/wxn0;->h:Z

    .line 32
    .line 33
    iget-boolean v9, v1, La/wxn0;->c:Z

    .line 34
    .line 35
    invoke-virtual {v0}, La/vvn0;->H0()Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    iget-object v10, v10, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 40
    .line 41
    iget-object v10, v10, La/xna;->a:La/wna;

    .line 42
    .line 43
    invoke-virtual {v10}, La/wna;->a()Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_0

    .line 48
    .line 49
    if-eqz v9, :cond_2

    .line 50
    .line 51
    :cond_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    invoke-virtual {v0}, La/vvn0;->H0()Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    iget-object v10, v10, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 60
    .line 61
    iget v10, v10, La/xna;->f:I

    .line 62
    .line 63
    add-int/2addr v9, v10

    .line 64
    invoke-virtual {v0}, La/vvn0;->H0()Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-virtual {v10}, Landroidx/recyclerview/widget/b;->S()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    sub-int/2addr v9, v10

    .line 73
    if-ne v9, v5, :cond_1

    .line 74
    .line 75
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    check-cast v9, La/ssn0;

    .line 80
    .line 81
    iget-object v9, v9, La/zz3;->e:La/yz3;

    .line 82
    .line 83
    iget-object v9, v9, La/yz3;->f:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-nez v9, :cond_1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {v0}, La/vvn0;->H0()Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    check-cast v6, La/ssn0;

    .line 104
    .line 105
    new-instance v10, La/apj0;

    .line 106
    .line 107
    const/16 v11, 0x9

    .line 108
    .line 109
    invoke-direct {v10, v9, v11}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v7, v10}, La/zz3;->B(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_0
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    iget-object v6, v6, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 120
    .line 121
    if-nez v8, :cond_3

    .line 122
    .line 123
    move v7, v3

    .line 124
    goto :goto_1

    .line 125
    :cond_3
    move v7, v4

    .line 126
    :goto_1
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    iget-object v6, v6, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 134
    .line 135
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-nez v6, :cond_4

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    iget-object v6, v6, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 147
    .line 148
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    iget-object v6, v6, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 156
    .line 157
    sget-object v7, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 158
    .line 159
    invoke-virtual {v6}, Landroid/view/View;->isLaidOut()Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-eqz v7, :cond_5

    .line 164
    .line 165
    invoke-virtual {v6}, Landroid/view/View;->isLayoutRequested()Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-nez v7, :cond_5

    .line 170
    .line 171
    invoke-virtual {v0}, La/vvn0;->G0()V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    new-instance v7, La/w23;

    .line 176
    .line 177
    const/16 v9, 0x11

    .line 178
    .line 179
    invoke-direct {v7, v0, v9}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v7}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    iget-object v6, v1, La/wxn0;->m:La/ksn0;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    const v9, 0x7f0807ca

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v9}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    iget-object v9, v9, La/wvn0;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 203
    .line 204
    invoke-virtual {v9, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    iget-object v7, v7, La/wvn0;->c:Landroid/widget/TextView;

    .line 212
    .line 213
    iget-object v9, v6, La/ksn0;->a:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v6, v6, La/ksn0;->c:Ljava/lang/String;

    .line 216
    .line 217
    new-instance v10, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    iget-object v2, v1, La/wxn0;->b:La/a4x;

    .line 239
    .line 240
    iget-boolean v6, v1, La/wxn0;->e:Z

    .line 241
    .line 242
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    iget-object v7, v7, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 247
    .line 248
    invoke-virtual {v7, v2}, Lorg/xplatform/uikit/components/chips/DsChips;->setChips(Ljava/util/List;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    iget-object v7, v7, La/wvn0;->m:Landroidx/constraintlayout/widget/Group;

    .line 256
    .line 257
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_7

    .line 262
    .line 263
    if-eqz v6, :cond_6

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_6
    move v2, v4

    .line 267
    goto :goto_4

    .line 268
    :cond_7
    :goto_3
    move v2, v3

    .line 269
    :goto_4
    invoke-virtual {v7, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    iget-object v2, v2, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 277
    .line 278
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/chips/DsChips;->setLoading(Z)V

    .line 279
    .line 280
    .line 281
    iget-boolean v2, v1, La/wxn0;->d:Z

    .line 282
    .line 283
    if-eqz v2, :cond_8

    .line 284
    .line 285
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    iget-object v2, v2, La/wvn0;->g:Landroid/widget/FrameLayout;

    .line 290
    .line 291
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    iget-object v2, v2, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 299
    .line 300
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    iget-object v2, v2, La/wvn0;->j:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 308
    .line 309
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    iget-object v2, v2, La/wvn0;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 317
    .line 318
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    iget-object v2, v2, La/wvn0;->b:Landroid/widget/TextView;

    .line 326
    .line 327
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    iget-object v2, v2, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 335
    .line 336
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    iget-object v2, v2, La/wvn0;->n:Landroidx/appcompat/widget/AppCompatImageView;

    .line 344
    .line 345
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    iget-object v2, v2, La/wvn0;->k:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 355
    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_8
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    iget-object v2, v2, La/wvn0;->j:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 363
    .line 364
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    iget-object v2, v2, La/wvn0;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 372
    .line 373
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    iget-object v2, v2, La/wvn0;->b:Landroid/widget/TextView;

    .line 381
    .line 382
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    iget-object v2, v2, La/wvn0;->k:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 390
    .line 391
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    iget-object v2, v2, La/wvn0;->g:Landroid/widget/FrameLayout;

    .line 399
    .line 400
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    iget-object v2, v2, La/wvn0;->l:Landroid/view/View;

    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    iget-object v2, v2, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 417
    .line 418
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iget-object v2, v2, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 426
    .line 427
    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    iget-object v2, v2, La/wvn0;->n:Landroidx/appcompat/widget/AppCompatImageView;

    .line 435
    .line 436
    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 437
    .line 438
    .line 439
    :goto_5
    iget-boolean v2, v1, La/wxn0;->f:Z

    .line 440
    .line 441
    if-eqz v2, :cond_9

    .line 442
    .line 443
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    iget-object v1, v1, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 448
    .line 449
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    iget-object v1, v1, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 457
    .line 458
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    iget-object v1, v1, La/wvn0;->l:Landroid/view/View;

    .line 466
    .line 467
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    iget-object v1, v1, La/wvn0;->g:Landroid/widget/FrameLayout;

    .line 475
    .line 476
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    iget-object v1, v1, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 484
    .line 485
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iget-object v0, v0, La/wvn0;->n:Landroidx/appcompat/widget/AppCompatImageView;

    .line 493
    .line 494
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 495
    .line 496
    .line 497
    goto :goto_6

    .line 498
    :cond_9
    iget-boolean v1, v1, La/wxn0;->g:Z

    .line 499
    .line 500
    if-eqz v1, :cond_a

    .line 501
    .line 502
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    iget-object v1, v1, La/wvn0;->g:Landroid/widget/FrameLayout;

    .line 507
    .line 508
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iget-object v1, v1, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 516
    .line 517
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    iget-object v1, v1, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 525
    .line 526
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    iget-object v0, v0, La/wvn0;->k:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 534
    .line 535
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 536
    .line 537
    .line 538
    goto :goto_6

    .line 539
    :cond_a
    if-eqz v8, :cond_b

    .line 540
    .line 541
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    iget-object v1, v1, La/wvn0;->g:Landroid/widget/FrameLayout;

    .line 546
    .line 547
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    iget-object v1, v1, La/wvn0;->k:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 555
    .line 556
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    iget-object v1, v1, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 564
    .line 565
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0}, La/vvn0;->J0()La/wvn0;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    iget-object v0, v0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 573
    .line 574
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 575
    .line 576
    .line 577
    :cond_b
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_0
    move-object v1, v2

    .line 581
    sget-object v2, La/rek0;->b:La/rek0;

    .line 582
    .line 583
    iget-object v6, v0, La/tvn0;->j:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v6, La/uxn0;

    .line 586
    .line 587
    sget-object v7, La/wne;->a:La/wne;

    .line 588
    .line 589
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    sget-object v7, La/exn0;->a:La/exn0;

    .line 593
    .line 594
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    iget-object v10, v0, La/tvn0;->k:La/vvn0;

    .line 599
    .line 600
    if-eqz v7, :cond_c

    .line 601
    .line 602
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 603
    .line 604
    iget-object v0, v10, La/vvn0;->U1:La/a8z;

    .line 605
    .line 606
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    check-cast v0, La/ssn0;

    .line 611
    .line 612
    sget-object v1, La/iun;->a:La/iun;

    .line 613
    .line 614
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 615
    .line 616
    .line 617
    goto/16 :goto_8

    .line 618
    .line 619
    :cond_c
    instance-of v0, v6, La/fxn0;

    .line 620
    .line 621
    if-eqz v0, :cond_e

    .line 622
    .line 623
    sget-object v0, La/bun0;->g2:La/s2m0;

    .line 624
    .line 625
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    const-string v0, "SwipexChangeBetSumDialogBottomSheetFragment"

    .line 636
    .line 637
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    if-eqz v2, :cond_d

    .line 642
    .line 643
    goto/16 :goto_8

    .line 644
    .line 645
    :cond_d
    new-instance v2, La/bun0;

    .line 646
    .line 647
    invoke-direct {v2}, La/bun0;-><init>()V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2, v1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    goto/16 :goto_8

    .line 654
    .line 655
    :cond_e
    sget-object v0, La/hxn0;->a:La/hxn0;

    .line 656
    .line 657
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    const/4 v7, 0x0

    .line 662
    if-eqz v0, :cond_11

    .line 663
    .line 664
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 665
    .line 666
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    iget-object v0, v0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 671
    .line 672
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    instance-of v2, v1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 677
    .line 678
    if-eqz v2, :cond_f

    .line 679
    .line 680
    move-object v7, v1

    .line 681
    check-cast v7, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 682
    .line 683
    :cond_f
    if-nez v7, :cond_10

    .line 684
    .line 685
    goto/16 :goto_8

    .line 686
    .line 687
    :cond_10
    new-instance v1, La/ron0;

    .line 688
    .line 689
    sget-object v2, La/zj;->a:La/zj;

    .line 690
    .line 691
    sget-object v2, La/ven;->b:La/pek;

    .line 692
    .line 693
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 694
    .line 695
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 696
    .line 697
    .line 698
    const/4 v3, 0x4

    .line 699
    invoke-direct {v1, v2, v3}, La/ron0;-><init>(Landroid/view/animation/DecelerateInterpolator;I)V

    .line 700
    .line 701
    .line 702
    iput-object v1, v7, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->s:La/ron0;

    .line 703
    .line 704
    iget-object v1, v7, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 705
    .line 706
    iget v1, v1, La/xna;->f:I

    .line 707
    .line 708
    sub-int/2addr v1, v5

    .line 709
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 710
    .line 711
    .line 712
    goto/16 :goto_8

    .line 713
    .line 714
    :cond_11
    instance-of v0, v6, La/ixn0;

    .line 715
    .line 716
    const-string v8, "snackbarManager"

    .line 717
    .line 718
    if-eqz v0, :cond_13

    .line 719
    .line 720
    iget-object v0, v10, La/vvn0;->O1:La/wdk0;

    .line 721
    .line 722
    if-eqz v0, :cond_12

    .line 723
    .line 724
    new-instance v1, La/xdk0;

    .line 725
    .line 726
    check-cast v6, La/ixn0;

    .line 727
    .line 728
    iget-object v3, v6, La/ixn0;->a:Ljava/lang/String;

    .line 729
    .line 730
    const/4 v7, 0x0

    .line 731
    const/16 v8, 0x7c

    .line 732
    .line 733
    const/4 v4, 0x0

    .line 734
    const/4 v5, 0x0

    .line 735
    const/4 v6, 0x0

    .line 736
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 737
    .line 738
    .line 739
    const/4 v14, 0x0

    .line 740
    const/16 v15, 0x3fc

    .line 741
    .line 742
    const/4 v11, 0x0

    .line 743
    const/4 v12, 0x0

    .line 744
    const/4 v13, 0x0

    .line 745
    move-object v8, v0

    .line 746
    move-object v9, v1

    .line 747
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 748
    .line 749
    .line 750
    goto/16 :goto_8

    .line 751
    .line 752
    :cond_12
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    throw v7

    .line 756
    :cond_13
    instance-of v0, v6, La/jxn0;

    .line 757
    .line 758
    if-eqz v0, :cond_15

    .line 759
    .line 760
    iget-object v0, v10, La/vvn0;->O1:La/wdk0;

    .line 761
    .line 762
    if-eqz v0, :cond_14

    .line 763
    .line 764
    new-instance v1, La/xdk0;

    .line 765
    .line 766
    check-cast v6, La/jxn0;

    .line 767
    .line 768
    iget-object v3, v6, La/jxn0;->a:Ljava/lang/String;

    .line 769
    .line 770
    iget v4, v6, La/jxn0;->b:I

    .line 771
    .line 772
    new-instance v7, Ljava/lang/Integer;

    .line 773
    .line 774
    invoke-direct {v7, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 775
    .line 776
    .line 777
    const/16 v8, 0x5c

    .line 778
    .line 779
    const/4 v4, 0x0

    .line 780
    const/4 v5, 0x0

    .line 781
    const/4 v6, 0x0

    .line 782
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 783
    .line 784
    .line 785
    const/4 v14, 0x0

    .line 786
    const/16 v15, 0x3fc

    .line 787
    .line 788
    const/4 v11, 0x0

    .line 789
    const/4 v12, 0x0

    .line 790
    const/4 v13, 0x0

    .line 791
    move-object v8, v0

    .line 792
    move-object v9, v1

    .line 793
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 794
    .line 795
    .line 796
    goto/16 :goto_8

    .line 797
    .line 798
    :cond_14
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    throw v7

    .line 802
    :cond_15
    sget-object v0, La/kxn0;->a:La/kxn0;

    .line 803
    .line 804
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    const-string v2, "actionDialogManager"

    .line 809
    .line 810
    const v9, 0x7f13032f

    .line 811
    .line 812
    .line 813
    if-eqz v0, :cond_17

    .line 814
    .line 815
    iget-object v0, v10, La/vvn0;->N1:La/ii;

    .line 816
    .line 817
    if-eqz v0, :cond_16

    .line 818
    .line 819
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 820
    .line 821
    const v1, 0x7f131417

    .line 822
    .line 823
    .line 824
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v12

    .line 828
    const v1, 0x7f13144c

    .line 829
    .line 830
    .line 831
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v13

    .line 835
    const v1, 0x7f130986

    .line 836
    .line 837
    .line 838
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v14

    .line 842
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v10, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v15

    .line 849
    sget-object v20, La/n12;->a:La/n12;

    .line 850
    .line 851
    const/16 v21, 0x0

    .line 852
    .line 853
    const/16 v22, 0x5d0

    .line 854
    .line 855
    const/16 v16, 0x0

    .line 856
    .line 857
    const-string v17, "CHANGE_FILTERS_KEY"

    .line 858
    .line 859
    const/16 v18, 0x0

    .line 860
    .line 861
    const/16 v19, 0x0

    .line 862
    .line 863
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 874
    .line 875
    .line 876
    goto/16 :goto_8

    .line 877
    .line 878
    :cond_16
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    throw v7

    .line 882
    :cond_17
    sget-object v0, La/mxn0;->a:La/mxn0;

    .line 883
    .line 884
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-result v0

    .line 888
    if-eqz v0, :cond_19

    .line 889
    .line 890
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 891
    .line 892
    iget-object v0, v10, La/vvn0;->N1:La/ii;

    .line 893
    .line 894
    if-eqz v0, :cond_18

    .line 895
    .line 896
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 897
    .line 898
    const v1, 0x7f1307bb

    .line 899
    .line 900
    .line 901
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v12

    .line 905
    const v1, 0x7f130e2f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v13

    .line 912
    const v1, 0x7f13115a

    .line 913
    .line 914
    .line 915
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v14

    .line 919
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-virtual {v10, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v15

    .line 926
    sget-object v20, La/n12;->b:La/n12;

    .line 927
    .line 928
    const/16 v21, 0x0

    .line 929
    .line 930
    const/16 v22, 0x5d0

    .line 931
    .line 932
    const/16 v16, 0x0

    .line 933
    .line 934
    const-string v17, "REQUEST_TOP_UP"

    .line 935
    .line 936
    const/16 v18, 0x0

    .line 937
    .line 938
    const/16 v19, 0x0

    .line 939
    .line 940
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 951
    .line 952
    .line 953
    goto/16 :goto_8

    .line 954
    .line 955
    :cond_18
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    throw v7

    .line 959
    :cond_19
    instance-of v0, v6, La/nxn0;

    .line 960
    .line 961
    if-eqz v0, :cond_1b

    .line 962
    .line 963
    check-cast v6, La/nxn0;

    .line 964
    .line 965
    iget-object v0, v6, La/nxn0;->a:La/ra10;

    .line 966
    .line 967
    iget-boolean v1, v6, La/nxn0;->b:Z

    .line 968
    .line 969
    if-eqz v1, :cond_1a

    .line 970
    .line 971
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 972
    .line 973
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    iget-object v1, v1, La/wvn0;->k:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 978
    .line 979
    new-instance v2, La/qvn0;

    .line 980
    .line 981
    const/4 v3, 0x7

    .line 982
    invoke-direct {v2, v10, v3}, La/qvn0;-><init>(La/vvn0;B)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v1, v0, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->x(La/ra10;Lkotlin/jvm/functions/Function0;)V

    .line 986
    .line 987
    .line 988
    goto/16 :goto_8

    .line 989
    .line 990
    :cond_1a
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 991
    .line 992
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    iget-object v1, v1, La/wvn0;->k:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 997
    .line 998
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 999
    .line 1000
    .line 1001
    goto/16 :goto_8

    .line 1002
    .line 1003
    :cond_1b
    sget-object v0, La/oxn0;->a:La/oxn0;

    .line 1004
    .line 1005
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    if-eqz v0, :cond_1d

    .line 1010
    .line 1011
    sget-object v0, La/npn0;->j2:La/g9m0;

    .line 1012
    .line 1013
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1021
    .line 1022
    .line 1023
    const-string v0, "SwipeXOnboardingBottomS"

    .line 1024
    .line 1025
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    if-nez v2, :cond_1c

    .line 1030
    .line 1031
    new-instance v2, La/npn0;

    .line 1032
    .line 1033
    invoke-direct {v2}, La/npn0;-><init>()V

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v2, v1, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    :cond_1c
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    iget-object v0, v0, La/wvn0;->l:Landroid/view/View;

    .line 1044
    .line 1045
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    iget-object v0, v0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 1053
    .line 1054
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1055
    .line 1056
    .line 1057
    goto/16 :goto_8

    .line 1058
    .line 1059
    :cond_1d
    instance-of v0, v6, La/qxn0;

    .line 1060
    .line 1061
    if-eqz v0, :cond_20

    .line 1062
    .line 1063
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1064
    .line 1065
    const/16 v2, 0x1e

    .line 1066
    .line 1067
    if-lt v0, v2, :cond_1e

    .line 1068
    .line 1069
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1070
    .line 1071
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    iget-object v0, v0, La/wvn0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1076
    .line 1077
    const/16 v2, 0x10

    .line 1078
    .line 1079
    invoke-static {v0, v2}, La/ckb;->Z(Landroid/view/View;I)V

    .line 1080
    .line 1081
    .line 1082
    :cond_1e
    move-object v0, v8

    .line 1083
    iget-object v8, v10, La/vvn0;->O1:La/wdk0;

    .line 1084
    .line 1085
    if-eqz v8, :cond_1f

    .line 1086
    .line 1087
    new-instance v9, La/xdk0;

    .line 1088
    .line 1089
    sget-object v12, La/qek0;->a:La/qek0;

    .line 1090
    .line 1091
    check-cast v6, La/qxn0;

    .line 1092
    .line 1093
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1096
    .line 1097
    .line 1098
    const v2, 0x7f13025d

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v10, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    const-string v2, "\n"

    .line 1109
    .line 1110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    iget-object v3, v6, La/qxn0;->a:Ljava/lang/String;

    .line 1114
    .line 1115
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v3

    .line 1119
    const v4, 0x7f130a9e

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v10, v4, v3}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v3

    .line 1126
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    .line 1132
    const v2, 0x7f1309cc

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v10, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    iget-object v1, v6, La/qxn0;->b:Ljava/lang/String;

    .line 1146
    .line 1147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v13

    .line 1154
    const/16 v17, 0x0

    .line 1155
    .line 1156
    const/16 v18, 0x7c

    .line 1157
    .line 1158
    const/4 v14, 0x0

    .line 1159
    const/4 v15, 0x0

    .line 1160
    const/16 v16, 0x0

    .line 1161
    .line 1162
    move-object v11, v9

    .line 1163
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1164
    .line 1165
    .line 1166
    const/16 v15, 0x3fc

    .line 1167
    .line 1168
    const/4 v11, 0x0

    .line 1169
    const/4 v12, 0x0

    .line 1170
    const/4 v13, 0x0

    .line 1171
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1172
    .line 1173
    .line 1174
    goto/16 :goto_8

    .line 1175
    .line 1176
    :cond_1f
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1177
    .line 1178
    .line 1179
    throw v7

    .line 1180
    :cond_20
    sget-object v0, La/sxn0;->a:La/sxn0;

    .line 1181
    .line 1182
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v0

    .line 1186
    if-eqz v0, :cond_21

    .line 1187
    .line 1188
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 1193
    .line 1194
    .line 1195
    goto/16 :goto_8

    .line 1196
    .line 1197
    :cond_21
    sget-object v0, La/txn0;->a:La/txn0;

    .line 1198
    .line 1199
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v0

    .line 1203
    if-eqz v0, :cond_27

    .line 1204
    .line 1205
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 1210
    .line 1211
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    if-eqz v0, :cond_26

    .line 1216
    .line 1217
    new-instance v1, Ljava/util/ArrayList;

    .line 1218
    .line 1219
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    :cond_22
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1227
    .line 1228
    .line 1229
    move-result v2

    .line 1230
    if-eqz v2, :cond_23

    .line 1231
    .line 1232
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    move-object v4, v2

    .line 1237
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 1238
    .line 1239
    iget-object v4, v4, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 1240
    .line 1241
    const-string v6, "mvu0"

    .line 1242
    .line 1243
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v4

    .line 1247
    if-eqz v4, :cond_22

    .line 1248
    .line 1249
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    goto :goto_7

    .line 1253
    :cond_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1258
    .line 1259
    .line 1260
    move-result v1

    .line 1261
    if-eqz v1, :cond_26

    .line 1262
    .line 1263
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 1268
    .line 1269
    instance-of v1, v0, La/mvu0;

    .line 1270
    .line 1271
    if-eqz v1, :cond_24

    .line 1272
    .line 1273
    move-object v7, v0

    .line 1274
    check-cast v7, La/mvu0;

    .line 1275
    .line 1276
    :cond_24
    if-eqz v7, :cond_25

    .line 1277
    .line 1278
    invoke-virtual {v7}, La/sik;->y0()V

    .line 1279
    .line 1280
    .line 1281
    :cond_25
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1282
    .line 1283
    invoke-virtual {v10}, La/vvn0;->K0()La/k3t0;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    new-instance v1, La/nrn0;

    .line 1288
    .line 1289
    invoke-direct {v1, v5}, La/nrn0;-><init>(Z)V

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1293
    .line 1294
    .line 1295
    goto/16 :goto_8

    .line 1296
    .line 1297
    :cond_26
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1298
    .line 1299
    invoke-virtual {v10}, La/vvn0;->K0()La/k3t0;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    new-instance v1, La/nrn0;

    .line 1304
    .line 1305
    invoke-direct {v1, v3}, La/nrn0;-><init>(Z)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_8

    .line 1312
    :cond_27
    sget-object v0, La/pxn0;->a:La/pxn0;

    .line 1313
    .line 1314
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v0

    .line 1318
    if-eqz v0, :cond_28

    .line 1319
    .line 1320
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1321
    .line 1322
    invoke-virtual {v10, v5}, La/vvn0;->L0(Z)V

    .line 1323
    .line 1324
    .line 1325
    goto :goto_8

    .line 1326
    :cond_28
    sget-object v0, La/lxn0;->a:La/lxn0;

    .line 1327
    .line 1328
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1329
    .line 1330
    .line 1331
    move-result v0

    .line 1332
    if-eqz v0, :cond_29

    .line 1333
    .line 1334
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1335
    .line 1336
    invoke-virtual {v10, v3}, La/vvn0;->L0(Z)V

    .line 1337
    .line 1338
    .line 1339
    goto :goto_8

    .line 1340
    :cond_29
    sget-object v0, La/rxn0;->a:La/rxn0;

    .line 1341
    .line 1342
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v0

    .line 1346
    if-eqz v0, :cond_2b

    .line 1347
    .line 1348
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1349
    .line 1350
    sget-object v0, La/don0;->n2:La/m6m0;

    .line 1351
    .line 1352
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v1

    .line 1356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1357
    .line 1358
    .line 1359
    new-instance v2, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 1360
    .line 1361
    const-string v4, "REQUEST_CONFIRM_BET"

    .line 1362
    .line 1363
    const-string v5, "SWIPE_ACTION_CONFIRMED_RESULT_KEY"

    .line 1364
    .line 1365
    invoke-direct {v2, v4, v5}, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1369
    .line 1370
    .line 1371
    const-string v0, "SwipeActionConfirmationBottomSheet"

    .line 1372
    .line 1373
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v4

    .line 1377
    if-eqz v4, :cond_2a

    .line 1378
    .line 1379
    goto :goto_8

    .line 1380
    :cond_2a
    new-instance v4, La/don0;

    .line 1381
    .line 1382
    invoke-direct {v4}, La/don0;-><init>()V

    .line 1383
    .line 1384
    .line 1385
    sget-object v5, La/don0;->o2:[La/iiy;

    .line 1386
    .line 1387
    aget-object v3, v5, v3

    .line 1388
    .line 1389
    iget-object v5, v4, La/don0;->k2:La/khf0;

    .line 1390
    .line 1391
    invoke-virtual {v5, v4, v3, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v4, v1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_8

    .line 1398
    :cond_2b
    sget-object v0, La/gxn0;->a:La/gxn0;

    .line 1399
    .line 1400
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v0

    .line 1404
    if-eqz v0, :cond_2c

    .line 1405
    .line 1406
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1407
    .line 1408
    invoke-virtual {v10}, La/vvn0;->J0()La/wvn0;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    iget-object v0, v0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 1413
    .line 1414
    invoke-virtual {v0}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;->H0()V

    .line 1415
    .line 1416
    .line 1417
    :goto_8
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 1418
    .line 1419
    invoke-virtual {v10}, La/vvn0;->K0()La/k3t0;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    sget-object v1, La/orn0;->a:La/orn0;

    .line 1424
    .line 1425
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1429
    .line 1430
    goto :goto_9

    .line 1431
    :cond_2c
    invoke-static {}, La/t9f;->b()V

    .line 1432
    .line 1433
    .line 1434
    :goto_9
    return-object v7

    .line 1435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
