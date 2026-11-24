.class public final La/mph0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/oph0;


# direct methods
.method public synthetic constructor <init>(La/oph0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mph0;->i:B

    iput-object p1, p0, La/mph0;->k:La/oph0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mph0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mph0;->k:La/oph0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/mph0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/mph0;-><init>(La/oph0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/mph0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/mph0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/mph0;-><init>(La/oph0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/mph0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/mph0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/tuh0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mph0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mph0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mph0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/puh0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mph0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mph0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mph0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mph0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/mph0;->k:La/oph0;

    .line 11
    .line 12
    iget-object v4, v1, La/oph0;->P1:La/a8z;

    .line 13
    .line 14
    iget-object v0, v0, La/mph0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/tuh0;

    .line 17
    .line 18
    sget-object v5, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_b

    .line 24
    .line 25
    instance-of v5, v0, La/quh0;

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    if-eqz v5, :cond_8

    .line 31
    .line 32
    check-cast v0, La/quh0;

    .line 33
    .line 34
    iget-boolean v2, v0, La/quh0;->a:Z

    .line 35
    .line 36
    sget-object v5, La/oph0;->Q1:La/gle0;

    .line 37
    .line 38
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v5, v5, La/n4r;->g:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 43
    .line 44
    const/4 v8, 0x1

    .line 45
    invoke-virtual {v5, v8}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v5, v5, La/n4r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v5, v5, La/n4r;->e:Landroid/widget/LinearLayout;

    .line 62
    .line 63
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-object v5, v5, La/n4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 71
    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    move v6, v7

    .line 75
    :cond_0
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    if-nez v9, :cond_1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    const v5, 0x7f040ae3

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v1}, La/etm0;->j(ILandroidx/fragment/app/Fragment;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    :goto_0
    move v12, v5

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    const v5, 0x7f040ae1

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :goto_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, La/qem0;->r(Landroid/content/Context;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    xor-int/lit8 v13, v2, 0x1

    .line 118
    .line 119
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2}, La/qem0;->r(Landroid/content/Context;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    xor-int/lit8 v14, v2, 0x1

    .line 128
    .line 129
    const v11, 0x7f040ae3

    .line 130
    .line 131
    .line 132
    invoke-static/range {v9 .. v14}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_2
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    check-cast v2, La/xnh0;

    .line 140
    .line 141
    iget-object v0, v0, La/quh0;->b:Ljava/util/List;

    .line 142
    .line 143
    invoke-virtual {v2, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 147
    .line 148
    const-string v2, "KEY_SETTINGS_EVENT"

    .line 149
    .line 150
    if-eqz v0, :cond_4

    .line 151
    .line 152
    invoke-virtual {v0, v2, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    sget-object v0, La/fsh0;->a:La/fsh0;

    .line 158
    .line 159
    :goto_3
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 160
    .line 161
    if-eqz v0, :cond_5

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    invoke-virtual {v1}, La/oph0;->I0()La/zuh0;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    sget-object v1, La/fsh0;->d:La/c0o;

    .line 171
    .line 172
    invoke-virtual {v1, v7}, La/c0o;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, La/fsh0;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, La/zuh0;->H:La/p7m0;

    .line 182
    .line 183
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, La/tuh0;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eq v1, v8, :cond_7

    .line 194
    .line 195
    if-eq v1, v3, :cond_6

    .line 196
    .line 197
    goto/16 :goto_4

    .line 198
    .line 199
    :cond_6
    invoke-virtual {v0}, La/zuh0;->A()V

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_7
    instance-of v1, v2, La/quh0;

    .line 204
    .line 205
    if-eqz v1, :cond_a

    .line 206
    .line 207
    check-cast v2, La/quh0;

    .line 208
    .line 209
    iget-object v1, v2, La/quh0;->c:Ljava/lang/Boolean;

    .line 210
    .line 211
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-virtual {v0, v1}, La/zuh0;->z(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_8
    instance-of v3, v0, La/ruh0;

    .line 222
    .line 223
    if-eqz v3, :cond_9

    .line 224
    .line 225
    check-cast v0, La/ruh0;

    .line 226
    .line 227
    sget-object v2, La/oph0;->Q1:La/gle0;

    .line 228
    .line 229
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    iget-object v2, v2, La/n4r;->g:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 234
    .line 235
    invoke-virtual {v2, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    iget-object v2, v2, La/n4r;->e:Landroid/widget/LinearLayout;

    .line 243
    .line 244
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iget-object v1, v1, La/n4r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 252
    .line 253
    iget-object v0, v0, La/ruh0;->a:La/jkm;

    .line 254
    .line 255
    sget v2, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 256
    .line 257
    new-instance v2, La/bmh;

    .line 258
    .line 259
    const/16 v3, 0xc

    .line 260
    .line 261
    invoke-direct {v2, v3}, La/bmh;-><init>(B)V

    .line 262
    .line 263
    .line 264
    const-wide/16 v3, 0x2710

    .line 265
    .line 266
    invoke-virtual {v1, v0, v3, v4, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_9
    instance-of v3, v0, La/suh0;

    .line 274
    .line 275
    if-eqz v3, :cond_b

    .line 276
    .line 277
    check-cast v0, La/suh0;

    .line 278
    .line 279
    sget-object v2, La/oph0;->Q1:La/gle0;

    .line 280
    .line 281
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    iget-object v2, v2, La/n4r;->g:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 286
    .line 287
    invoke-virtual {v2, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    iget-object v2, v2, La/n4r;->e:Landroid/widget/LinearLayout;

    .line 295
    .line 296
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, La/oph0;->H0()La/n4r;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iget-object v1, v1, La/n4r;->g:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 304
    .line 305
    invoke-virtual {v1, v7}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    check-cast v1, La/xnh0;

    .line 313
    .line 314
    iget-object v0, v0, La/suh0;->a:Ljava/util/List;

    .line 315
    .line 316
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 317
    .line 318
    .line 319
    :cond_a
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 323
    .line 324
    .line 325
    :goto_5
    return-object v2

    .line 326
    :pswitch_0
    iget-object v1, v0, La/mph0;->j:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, La/puh0;

    .line 329
    .line 330
    sget-object v4, La/wne;->a:La/wne;

    .line 331
    .line 332
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    if-eqz v1, :cond_16

    .line 336
    .line 337
    instance-of v4, v1, La/iuh0;

    .line 338
    .line 339
    const v5, 0x7f13032f

    .line 340
    .line 341
    .line 342
    const v6, 0x7f1303fb

    .line 343
    .line 344
    .line 345
    iget-object v9, v0, La/mph0;->k:La/oph0;

    .line 346
    .line 347
    if-eqz v4, :cond_c

    .line 348
    .line 349
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 350
    .line 351
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v0}, La/zsi;->a()La/ii;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 360
    .line 361
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    const v1, 0x7f1306cf

    .line 366
    .line 367
    .line 368
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    const v1, 0x7f13029a

    .line 373
    .line 374
    .line 375
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v13

    .line 379
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v14

    .line 386
    sget-object v19, La/n12;->a:La/n12;

    .line 387
    .line 388
    const/16 v20, 0x0

    .line 389
    .line 390
    const/16 v21, 0x5d0

    .line 391
    .line 392
    const/4 v15, 0x0

    .line 393
    const-string v16, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY"

    .line 394
    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    const/16 v18, 0x0

    .line 398
    .line 399
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_7

    .line 413
    .line 414
    :cond_c
    instance-of v0, v1, La/luh0;

    .line 415
    .line 416
    if-eqz v0, :cond_d

    .line 417
    .line 418
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 419
    .line 420
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, La/zsi;->a()La/ii;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 429
    .line 430
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    const v1, 0x7f13029c

    .line 435
    .line 436
    .line 437
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v12

    .line 441
    const v1, 0x7f130298

    .line 442
    .line 443
    .line 444
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v13

    .line 448
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v14

    .line 455
    sget-object v19, La/n12;->a:La/n12;

    .line 456
    .line 457
    const/16 v20, 0x0

    .line 458
    .line 459
    const/16 v21, 0x5d0

    .line 460
    .line 461
    const/4 v15, 0x0

    .line 462
    const-string v16, "REQUEST_BIND_PHONE_DIALOG_KEY"

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    const/16 v18, 0x0

    .line 467
    .line 468
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_7

    .line 482
    .line 483
    :cond_d
    instance-of v0, v1, La/juh0;

    .line 484
    .line 485
    if-eqz v0, :cond_e

    .line 486
    .line 487
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 488
    .line 489
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0}, La/zsi;->a()La/ii;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 498
    .line 499
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    const v1, 0x7f13004f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    const v1, 0x7f130042

    .line 511
    .line 512
    .line 513
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v13

    .line 517
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v14

    .line 524
    sget-object v19, La/n12;->a:La/n12;

    .line 525
    .line 526
    const/16 v20, 0x0

    .line 527
    .line 528
    const/16 v21, 0x5d0

    .line 529
    .line 530
    const/4 v15, 0x0

    .line 531
    const-string v16, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY"

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/16 v18, 0x0

    .line 536
    .line 537
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_7

    .line 551
    .line 552
    :cond_e
    instance-of v0, v1, La/muh0;

    .line 553
    .line 554
    if-eqz v0, :cond_f

    .line 555
    .line 556
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 557
    .line 558
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v0}, La/zsi;->b()La/wdk0;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    new-instance v8, La/xdk0;

    .line 567
    .line 568
    sget-object v11, La/rek0;->b:La/rek0;

    .line 569
    .line 570
    check-cast v1, La/muh0;

    .line 571
    .line 572
    iget-object v12, v1, La/muh0;->a:Ljava/lang/String;

    .line 573
    .line 574
    const/16 v16, 0x0

    .line 575
    .line 576
    const/16 v17, 0x7c

    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const/4 v14, 0x0

    .line 580
    const/4 v15, 0x0

    .line 581
    move-object v10, v8

    .line 582
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 583
    .line 584
    .line 585
    const/16 v14, 0x3fc

    .line 586
    .line 587
    const/4 v10, 0x0

    .line 588
    const/4 v11, 0x0

    .line 589
    const/4 v12, 0x0

    .line 590
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 591
    .line 592
    .line 593
    goto/16 :goto_7

    .line 594
    .line 595
    :cond_f
    instance-of v0, v1, La/nuh0;

    .line 596
    .line 597
    const v4, 0x7f130e5c

    .line 598
    .line 599
    .line 600
    if-eqz v0, :cond_10

    .line 601
    .line 602
    check-cast v1, La/nuh0;

    .line 603
    .line 604
    iget-object v12, v1, La/nuh0;->a:Ljava/lang/String;

    .line 605
    .line 606
    sget-object v0, La/oph0;->Q1:La/gle0;

    .line 607
    .line 608
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-virtual {v0}, La/zsi;->a()La/ii;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 617
    .line 618
    const v1, 0x7f1304e0

    .line 619
    .line 620
    .line 621
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v11

    .line 625
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v13

    .line 629
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    const v1, 0x7f131038

    .line 633
    .line 634
    .line 635
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v14

    .line 639
    sget-object v19, La/n12;->c:La/n12;

    .line 640
    .line 641
    const/16 v20, 0x0

    .line 642
    .line 643
    const/16 v21, 0x5d0

    .line 644
    .line 645
    const/4 v15, 0x0

    .line 646
    const-string v16, "REQUEST_GIFT_DIALOG_KEY"

    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    const/16 v18, 0x0

    .line 651
    .line 652
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 663
    .line 664
    .line 665
    goto/16 :goto_7

    .line 666
    .line 667
    :cond_10
    instance-of v0, v1, La/kuh0;

    .line 668
    .line 669
    if-eqz v0, :cond_12

    .line 670
    .line 671
    check-cast v1, La/kuh0;

    .line 672
    .line 673
    iget-object v0, v1, La/kuh0;->a:Landroid/text/SpannableString;

    .line 674
    .line 675
    iget-object v1, v1, La/kuh0;->b:Ljava/lang/String;

    .line 676
    .line 677
    sget-object v2, La/oph0;->Q1:La/gle0;

    .line 678
    .line 679
    iget-object v2, v9, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 680
    .line 681
    const-string v3, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 682
    .line 683
    if-eqz v2, :cond_11

    .line 684
    .line 685
    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    goto :goto_6

    .line 689
    :cond_11
    new-instance v2, Lkotlin/Pair;

    .line 690
    .line 691
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 703
    .line 704
    .line 705
    :goto_6
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-virtual {v1}, La/zsi;->a()La/ii;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 714
    .line 715
    const v2, 0x7f130162

    .line 716
    .line 717
    .line 718
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v11

    .line 722
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v12

    .line 726
    const v0, 0x7f1304ff

    .line 727
    .line 728
    .line 729
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v13

    .line 733
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v14

    .line 740
    sget-object v19, La/n12;->a:La/n12;

    .line 741
    .line 742
    const/16 v20, 0x0

    .line 743
    .line 744
    const/16 v21, 0x5d0

    .line 745
    .line 746
    const/4 v15, 0x0

    .line 747
    const-string v16, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 748
    .line 749
    const/16 v17, 0x0

    .line 750
    .line 751
    const/16 v18, 0x0

    .line 752
    .line 753
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1, v10, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 764
    .line 765
    .line 766
    goto :goto_7

    .line 767
    :cond_12
    instance-of v0, v1, La/ouh0;

    .line 768
    .line 769
    if-eqz v0, :cond_16

    .line 770
    .line 771
    check-cast v1, La/ouh0;

    .line 772
    .line 773
    iget-object v0, v1, La/ouh0;->a:La/d7a;

    .line 774
    .line 775
    sget-object v1, La/oph0;->Q1:La/gle0;

    .line 776
    .line 777
    invoke-virtual {v9}, La/oph0;->G0()La/zsi;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    const v1, 0x7f13121b

    .line 785
    .line 786
    .line 787
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v14

    .line 791
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    iget-object v12, v0, La/d7a;->a:La/i7a;

    .line 798
    .line 799
    iget-object v1, v12, La/i7a;->d:La/m7a;

    .line 800
    .line 801
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    const-string v11, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 806
    .line 807
    if-eqz v1, :cond_15

    .line 808
    .line 809
    if-eq v1, v3, :cond_14

    .line 810
    .line 811
    const/4 v0, 0x3

    .line 812
    if-eq v1, v0, :cond_13

    .line 813
    .line 814
    goto :goto_7

    .line 815
    :cond_13
    sget-object v0, La/sdd0;->i2:La/xi70;

    .line 816
    .line 817
    iget-object v1, v12, La/i7a;->b:Ljava/lang/String;

    .line 818
    .line 819
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    invoke-static {v2, v1, v11, v12}, La/xi70;->g(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;La/i7a;)V

    .line 827
    .line 828
    .line 829
    goto :goto_7

    .line 830
    :cond_14
    sget-object v1, La/a2v0;->g2:La/svs0;

    .line 831
    .line 832
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    new-instance v10, La/c2v0;

    .line 837
    .line 838
    iget-object v13, v0, La/d7a;->b:Ljava/lang/String;

    .line 839
    .line 840
    const-string v15, ""

    .line 841
    .line 842
    invoke-direct/range {v10 .. v15}, La/c2v0;-><init>(Ljava/lang/String;La/i7a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    invoke-static {v2, v10}, La/svs0;->d(Landroidx/fragment/app/e;La/c2v0;)V

    .line 849
    .line 850
    .line 851
    goto :goto_7

    .line 852
    :cond_15
    sget-object v0, La/et90;->j2:La/mi70;

    .line 853
    .line 854
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    invoke-static {v12, v11, v1}, La/mi70;->c(La/i7a;Ljava/lang/String;Landroidx/fragment/app/e;)V

    .line 862
    .line 863
    .line 864
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 865
    .line 866
    goto :goto_8

    .line 867
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 868
    .line 869
    .line 870
    :goto_8
    return-object v2

    .line 871
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
