.class public final La/yp10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/zp10;


# direct methods
.method public synthetic constructor <init>(La/zp10;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yp10;->i:B

    iput-object p1, p0, La/yp10;->k:La/zp10;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yp10;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yp10;->k:La/zp10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yp10;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/yp10;-><init>(La/zp10;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/yp10;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/yp10;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/yp10;-><init>(La/zp10;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/yp10;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/yp10;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/gq10;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yp10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yp10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yp10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kq10;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/yp10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/yp10;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/yp10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yp10;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/yp10;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/gq10;

    .line 13
    .line 14
    sget-object v4, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz v1, :cond_6

    .line 20
    .line 21
    instance-of v4, v1, La/eq10;

    .line 22
    .line 23
    iget-object v7, v0, La/yp10;->k:La/zp10;

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    check-cast v1, La/eq10;

    .line 28
    .line 29
    iget-object v0, v1, La/eq10;->a:La/d7a;

    .line 30
    .line 31
    sget-object v1, La/zp10;->U1:La/htz;

    .line 32
    .line 33
    iget-object v1, v7, La/zp10;->N1:La/gl5;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const v1, 0x7f130c83

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 48
    .line 49
    invoke-static {v7, v2, v0, v1}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 55
    .line 56
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v3

    .line 60
    :cond_1
    instance-of v0, v1, La/fq10;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object v5, v7, La/zp10;->P1:La/wdk0;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    new-instance v6, La/xdk0;

    .line 69
    .line 70
    check-cast v1, La/fq10;

    .line 71
    .line 72
    iget-object v9, v1, La/fq10;->b:La/sek0;

    .line 73
    .line 74
    iget-object v10, v1, La/fq10;->a:Ljava/lang/String;

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    const/16 v15, 0x7c

    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v13, 0x0

    .line 82
    move-object v8, v6

    .line 83
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 84
    .line 85
    .line 86
    const/16 v12, 0x3fc

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const-string v0, "snackbarManager"

    .line 96
    .line 97
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v3

    .line 101
    :cond_3
    instance-of v0, v1, La/dq10;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    sget-object v0, La/zp10;->U1:La/htz;

    .line 106
    .line 107
    iget-object v0, v7, La/zp10;->O1:La/ii;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 112
    .line 113
    const v1, 0x7f130162

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    const v1, 0x7f13047e

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    const v1, 0x7f130a86

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const v1, 0x7f13032f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    sget-object v17, La/n12;->a:La/n12;

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v19, 0x5d0

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const-string v14, "INTERRUPT_DIALOG_REQUEST_KEY"

    .line 152
    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_4
    const-string v0, "actionDialogManager"

    .line 171
    .line 172
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v3

    .line 176
    :cond_5
    instance-of v0, v1, La/cq10;

    .line 177
    .line 178
    if-eqz v0, :cond_6

    .line 179
    .line 180
    sget-object v0, La/ox70;->n2:La/mi70;

    .line 181
    .line 182
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object v3, La/jvp0;->b:La/jvp0;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v0, La/ox70;

    .line 195
    .line 196
    invoke-direct {v0}, La/ox70;-><init>()V

    .line 197
    .line 198
    .line 199
    sget-object v4, La/ox70;->o2:[La/iiy;

    .line 200
    .line 201
    aget-object v2, v4, v2

    .line 202
    .line 203
    iget-object v4, v0, La/ox70;->m2:La/yzn0;

    .line 204
    .line 205
    invoke-virtual {v4, v0, v2, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 206
    .line 207
    .line 208
    const-string v2, "OpenTelegramBotBottomSheet"

    .line 209
    .line 210
    invoke-virtual {v0, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 217
    .line 218
    .line 219
    :goto_1
    return-object v3

    .line 220
    :pswitch_0
    iget-object v1, v0, La/yp10;->k:La/zp10;

    .line 221
    .line 222
    iget-object v4, v1, La/zp10;->S1:La/a8z;

    .line 223
    .line 224
    iget-object v0, v0, La/yp10;->j:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, La/kq10;

    .line 227
    .line 228
    sget-object v5, La/wne;->a:La/wne;

    .line 229
    .line 230
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    if-eqz v0, :cond_a

    .line 234
    .line 235
    instance-of v5, v0, La/hq10;

    .line 236
    .line 237
    const/16 v6, 0x8

    .line 238
    .line 239
    if-eqz v5, :cond_7

    .line 240
    .line 241
    sget-object v3, La/zp10;->U1:La/htz;

    .line 242
    .line 243
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    iget-object v3, v3, La/h1r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 248
    .line 249
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    iget-object v3, v3, La/h1r;->d:Landroid/widget/FrameLayout;

    .line 257
    .line 258
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    iget-object v3, v3, La/h1r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 266
    .line 267
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    iget-object v1, v1, La/h1r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 275
    .line 276
    check-cast v0, La/hq10;

    .line 277
    .line 278
    iget-object v0, v0, La/hq10;->a:La/jkm;

    .line 279
    .line 280
    sget v3, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 281
    .line 282
    new-instance v3, La/bmh;

    .line 283
    .line 284
    const/16 v4, 0xc

    .line 285
    .line 286
    invoke-direct {v3, v4}, La/bmh;-><init>(B)V

    .line 287
    .line 288
    .line 289
    const-wide/16 v4, 0x2710

    .line 290
    .line 291
    invoke-virtual {v1, v0, v4, v5, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_7
    instance-of v5, v0, La/iq10;

    .line 299
    .line 300
    if-eqz v5, :cond_8

    .line 301
    .line 302
    sget-object v0, La/zp10;->U1:La/htz;

    .line 303
    .line 304
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v0, v0, La/h1r;->d:Landroid/widget/FrameLayout;

    .line 309
    .line 310
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iget-object v0, v0, La/h1r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 318
    .line 319
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 320
    .line 321
    .line 322
    goto :goto_2

    .line 323
    :cond_8
    instance-of v5, v0, La/jq10;

    .line 324
    .line 325
    if-eqz v5, :cond_a

    .line 326
    .line 327
    sget-object v3, La/zp10;->U1:La/htz;

    .line 328
    .line 329
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    iget-object v3, v3, La/h1r;->d:Landroid/widget/FrameLayout;

    .line 334
    .line 335
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    iget-object v3, v3, La/h1r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 343
    .line 344
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    iget-object v3, v3, La/h1r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 352
    .line 353
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1}, La/zp10;->G0()La/h1r;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    iget-object v1, v1, La/h1r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 361
    .line 362
    check-cast v0, La/jq10;

    .line 363
    .line 364
    iget-boolean v2, v0, La/jq10;->b:Z

    .line 365
    .line 366
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, La/vp10;

    .line 374
    .line 375
    iget-object v2, v0, La/jq10;->a:Ljava/util/List;

    .line 376
    .line 377
    invoke-virtual {v1, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 378
    .line 379
    .line 380
    iget-boolean v0, v0, La/jq10;->c:Z

    .line 381
    .line 382
    if-eqz v0, :cond_9

    .line 383
    .line 384
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    check-cast v0, La/vp10;

    .line 389
    .line 390
    invoke-virtual {v0}, La/yge0;->g()V

    .line 391
    .line 392
    .line 393
    :cond_9
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    goto :goto_3

    .line 396
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 397
    .line 398
    .line 399
    :goto_3
    return-object v3

    .line 400
    nop

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
