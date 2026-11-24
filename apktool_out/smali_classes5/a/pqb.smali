.class public final La/pqb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/rqb;


# direct methods
.method public synthetic constructor <init>(La/rqb;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pqb;->i:B

    iput-object p1, p0, La/pqb;->k:La/rqb;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pqb;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pqb;->k:La/rqb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pqb;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/pqb;-><init>(La/rqb;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/pqb;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/pqb;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/pqb;-><init>(La/rqb;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/pqb;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/pqb;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/pqb;-><init>(La/rqb;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/pqb;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pqb;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/erb;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/pqb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pqb;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pqb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/yqb;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/pqb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/pqb;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/pqb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/frb;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/pqb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/pqb;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/pqb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pqb;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/pqb;->k:La/rqb;

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const v5, 0x7f13041a

    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/pqb;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/erb;

    .line 20
    .line 21
    sget-object v2, La/wne;->a:La/wne;

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    if-eqz v1, :cond_8

    .line 27
    .line 28
    instance-of v2, v1, La/arb;

    .line 29
    .line 30
    iget-object v9, v0, La/pqb;->k:La/rqb;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    check-cast v1, La/arb;

    .line 35
    .line 36
    iget-object v0, v1, La/arb;->a:La/d7a;

    .line 37
    .line 38
    sget-object v1, La/rqb;->U1:La/bj5;

    .line 39
    .line 40
    iget-object v1, v9, La/rqb;->N1:La/gl5;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 52
    .line 53
    invoke-static {v9, v2, v0, v1}, La/gl5;->p(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 59
    .line 60
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v6

    .line 64
    :cond_1
    instance-of v0, v1, La/brb;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v7, v9, La/rqb;->P1:La/wdk0;

    .line 69
    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    new-instance v8, La/xdk0;

    .line 73
    .line 74
    sget-object v11, La/rek0;->b:La/rek0;

    .line 75
    .line 76
    check-cast v1, La/brb;

    .line 77
    .line 78
    iget-object v12, v1, La/brb;->a:Ljava/lang/String;

    .line 79
    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x7c

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v14, 0x0

    .line 86
    const/4 v15, 0x0

    .line 87
    move-object v10, v8

    .line 88
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 89
    .line 90
    .line 91
    const/16 v14, 0x3cc

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v12, 0x1

    .line 96
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 97
    .line 98
    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :cond_2
    const-string v0, "snackbarManager"

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v6

    .line 107
    :cond_3
    instance-of v0, v1, La/crb;

    .line 108
    .line 109
    const-string v2, "actionDialogManager"

    .line 110
    .line 111
    const v3, 0x7f130e5d

    .line 112
    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    sget-object v0, La/rqb;->U1:La/bj5;

    .line 117
    .line 118
    iget-object v0, v9, La/rqb;->O1:La/ii;

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 123
    .line 124
    const v1, 0x7f1307bb

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    const v1, 0x7f13115d

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sget-object v19, La/n12;->b:La/n12;

    .line 146
    .line 147
    const/16 v20, 0x0

    .line 148
    .line 149
    const/16 v21, 0x5d8

    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const-string v16, "REQUEST_REQUEST_ERROR_KEY"

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v6

    .line 177
    :cond_5
    instance-of v0, v1, La/zqb;

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    invoke-static {v9}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 182
    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_6
    instance-of v0, v1, La/drb;

    .line 186
    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    sget-object v0, La/rqb;->U1:La/bj5;

    .line 190
    .line 191
    iget-object v0, v9, La/rqb;->O1:La/ii;

    .line 192
    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 196
    .line 197
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    const v1, 0x7f1307c9

    .line 202
    .line 203
    .line 204
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    sget-object v19, La/n12;->b:La/n12;

    .line 216
    .line 217
    const/16 v20, 0x0

    .line 218
    .line 219
    const/16 v21, 0x5f8

    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const/16 v18, 0x0

    .line 228
    .line 229
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 240
    .line 241
    .line 242
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v6

    .line 249
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 250
    .line 251
    .line 252
    :goto_1
    return-object v6

    .line 253
    :pswitch_0
    iget-object v0, v0, La/pqb;->j:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, La/yqb;

    .line 256
    .line 257
    sget-object v1, La/wne;->a:La/wne;

    .line 258
    .line 259
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    if-eqz v0, :cond_a

    .line 263
    .line 264
    instance-of v1, v0, La/wqb;

    .line 265
    .line 266
    if-eqz v1, :cond_9

    .line 267
    .line 268
    sget-object v0, La/rqb;->U1:La/bj5;

    .line 269
    .line 270
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v0, v0, La/azq;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 275
    .line 276
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iget-object v0, v0, La/azq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 284
    .line 285
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v0, v0, La/azq;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 293
    .line 294
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_9
    instance-of v1, v0, La/xqb;

    .line 299
    .line 300
    if-eqz v1, :cond_a

    .line 301
    .line 302
    sget-object v1, La/rqb;->U1:La/bj5;

    .line 303
    .line 304
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    iget-object v1, v1, La/azq;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 309
    .line 310
    check-cast v0, La/xqb;

    .line 311
    .line 312
    iget-object v0, v0, La/xqb;->a:La/ra10;

    .line 313
    .line 314
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iget-object v0, v0, La/azq;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 322
    .line 323
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    iget-object v0, v0, La/azq;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 331
    .line 332
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iget-object v0, v0, La/azq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 340
    .line 341
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    iget-object v0, v0, La/azq;->f:Landroidx/core/widget/ContentLoadingProgressBar;

    .line 349
    .line 350
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 351
    .line 352
    .line 353
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    goto :goto_3

    .line 356
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 357
    .line 358
    .line 359
    :goto_3
    return-object v6

    .line 360
    :pswitch_1
    iget-object v0, v0, La/pqb;->j:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, La/frb;

    .line 363
    .line 364
    sget-object v1, La/wne;->a:La/wne;

    .line 365
    .line 366
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    sget-object v1, La/rqb;->U1:La/bj5;

    .line 370
    .line 371
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    iget-object v1, v1, La/azq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 376
    .line 377
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    iget-object v1, v1, La/azq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 385
    .line 386
    iget-object v6, v0, La/frb;->e:Landroid/text/SpannableStringBuilder;

    .line 387
    .line 388
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v1, v1, La/azq;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 396
    .line 397
    const v6, 0x7f1312ff

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v6

    .line 404
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    iget-object v1, v1, La/azq;->g:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 412
    .line 413
    iget-object v6, v0, La/frb;->a:La/kbn;

    .line 414
    .line 415
    iget-object v7, v6, La/kbn;->d:Ljava/lang/String;

    .line 416
    .line 417
    new-instance v8, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v9, "+"

    .line 420
    .line 421
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeText(Ljava/lang/CharSequence;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    iget-object v1, v1, La/azq;->g:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 439
    .line 440
    iget-object v7, v6, La/kbn;->e:La/cm90;

    .line 441
    .line 442
    iget-object v8, v7, La/cm90;->d:Ljava/lang/String;

    .line 443
    .line 444
    invoke-virtual {v1, v8}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhonePlaceholder(Ljava/lang/CharSequence;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    iget-object v1, v1, La/azq;->g:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 452
    .line 453
    iget-object v7, v7, La/cm90;->d:Ljava/lang/String;

    .line 454
    .line 455
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneMask(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    iget-boolean v1, v6, La/kbn;->f:Z

    .line 459
    .line 460
    if-eqz v1, :cond_b

    .line 461
    .line 462
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    iget-object v1, v1, La/azq;->g:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 467
    .line 468
    iget-object v6, v6, La/kbn;->c:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    goto :goto_4

    .line 474
    :cond_b
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    iget-object v1, v1, La/azq;->g:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 479
    .line 480
    const-string v6, ""

    .line 481
    .line 482
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    :goto_4
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    iget-object v1, v1, La/azq;->f:Landroidx/core/widget/ContentLoadingProgressBar;

    .line 490
    .line 491
    iget-boolean v6, v0, La/frb;->b:Z

    .line 492
    .line 493
    if-eqz v6, :cond_c

    .line 494
    .line 495
    move v3, v4

    .line 496
    :cond_c
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    iget-object v1, v1, La/azq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 504
    .line 505
    const v3, 0x7f131261

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonText(I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    iget-object v1, v1, La/azq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 516
    .line 517
    iget-boolean v0, v0, La/frb;->c:Z

    .line 518
    .line 519
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2}, La/rqb;->G0()La/azq;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    iget-object v0, v0, La/azq;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 527
    .line 528
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    nop

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
