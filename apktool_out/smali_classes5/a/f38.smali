.class public final La/f38;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/h38;


# direct methods
.method public synthetic constructor <init>(La/h38;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/f38;->i:B

    iput-object p1, p0, La/f38;->k:La/h38;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/f38;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/f38;->k:La/h38;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/f38;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/f38;-><init>(La/h38;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/f38;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/f38;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/f38;-><init>(La/h38;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/f38;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/f38;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/u38;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/f38;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/f38;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/f38;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/v38;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/f38;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/f38;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/f38;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/f38;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/f38;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/u38;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_e

    .line 20
    .line 21
    instance-of v4, v1, La/p38;

    .line 22
    .line 23
    iget-object v7, v0, La/f38;->k:La/h38;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    check-cast v1, La/p38;

    .line 28
    .line 29
    iget v0, v1, La/p38;->a:I

    .line 30
    .line 31
    sget-object v1, La/h38;->V1:La/yk5;

    .line 32
    .line 33
    iget-object v1, v7, La/h38;->Q1:La/a8z;

    .line 34
    .line 35
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/iai;

    .line 40
    .line 41
    iget-object v1, v1, La/iai;->a:La/rl70;

    .line 42
    .line 43
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v3, v0, v4, v4}, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2, v3}, La/rl70;->f(La/rl70;Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_0
    instance-of v0, v1, La/m38;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    sget-object v0, La/h38;->V1:La/yk5;

    .line 70
    .line 71
    invoke-virtual {v7}, La/h38;->G0()La/pyq;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v0, v0, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_1
    instance-of v0, v1, La/o38;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    check-cast v1, La/o38;

    .line 87
    .line 88
    iget-object v0, v1, La/o38;->a:La/d7a;

    .line 89
    .line 90
    iget-object v1, v1, La/o38;->b:Ljava/lang/String;

    .line 91
    .line 92
    sget-object v2, La/h38;->V1:La/yk5;

    .line 93
    .line 94
    iget-object v2, v7, La/h38;->N1:La/gl5;

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 99
    .line 100
    invoke-static {v7, v2, v0, v1}, La/gl5;->p(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_2
    const-string v0, "captchaDialogDelegate"

    .line 106
    .line 107
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v3

    .line 111
    :cond_3
    instance-of v0, v1, La/q38;

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    iget-object v5, v7, La/h38;->P1:La/wdk0;

    .line 116
    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    new-instance v6, La/xdk0;

    .line 120
    .line 121
    sget-object v9, La/rek0;->b:La/rek0;

    .line 122
    .line 123
    check-cast v1, La/q38;

    .line 124
    .line 125
    iget-object v10, v1, La/q38;->a:Ljava/lang/String;

    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/16 v15, 0x7c

    .line 129
    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v12, 0x0

    .line 132
    const/4 v13, 0x0

    .line 133
    move-object v8, v6

    .line 134
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 135
    .line 136
    .line 137
    const/16 v12, 0x3ec

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v9, 0x0

    .line 141
    const/4 v10, 0x1

    .line 142
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_4
    const-string v0, "snackbarManager"

    .line 148
    .line 149
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v3

    .line 153
    :cond_5
    instance-of v0, v1, La/r38;

    .line 154
    .line 155
    const-string v4, "actionDialogManager"

    .line 156
    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    sget-object v0, La/h38;->V1:La/yk5;

    .line 160
    .line 161
    iget-object v0, v7, La/h38;->O1:La/ii;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    iget-object v1, v7, La/h38;->M1:La/ux00;

    .line 166
    .line 167
    if-eqz v1, :cond_6

    .line 168
    .line 169
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 170
    .line 171
    const v1, 0x7f130162

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    const v1, 0x7f13047d

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    const v1, 0x7f130a86

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    const v1, 0x7f13032f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    sget-object v17, La/n12;->a:La/n12;

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    const/16 v19, 0x5f0

    .line 207
    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 214
    .line 215
    .line 216
    sget-object v1, La/tx00;->l2:La/evz;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v8, v2, v2, v2}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_6
    const-string v0, "logoutDialogFactory"

    .line 238
    .line 239
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v3

    .line 243
    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v3

    .line 247
    :cond_8
    instance-of v0, v1, La/s38;

    .line 248
    .line 249
    const v2, 0x7f130e5d

    .line 250
    .line 251
    .line 252
    if-eqz v0, :cond_a

    .line 253
    .line 254
    sget-object v0, La/h38;->V1:La/yk5;

    .line 255
    .line 256
    iget-object v0, v7, La/h38;->O1:La/ii;

    .line 257
    .line 258
    if-eqz v0, :cond_9

    .line 259
    .line 260
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 261
    .line 262
    const v1, 0x7f1307bb

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    const v1, 0x7f13115d

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-virtual {v7, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    sget-object v17, La/n12;->b:La/n12;

    .line 284
    .line 285
    const/16 v18, 0x0

    .line 286
    .line 287
    const/16 v19, 0x5d8

    .line 288
    .line 289
    const/4 v12, 0x0

    .line 290
    const/4 v13, 0x0

    .line 291
    const-string v14, "REQUEST_REQUEST_ERROR_KEY"

    .line 292
    .line 293
    const/4 v15, 0x0

    .line 294
    const/16 v16, 0x0

    .line 295
    .line 296
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 307
    .line 308
    .line 309
    goto :goto_0

    .line 310
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v3

    .line 314
    :cond_a
    instance-of v0, v1, La/n38;

    .line 315
    .line 316
    if-eqz v0, :cond_b

    .line 317
    .line 318
    invoke-static {v7}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 319
    .line 320
    .line 321
    goto :goto_0

    .line 322
    :cond_b
    instance-of v0, v1, La/t38;

    .line 323
    .line 324
    if-eqz v0, :cond_e

    .line 325
    .line 326
    sget-object v0, La/h38;->V1:La/yk5;

    .line 327
    .line 328
    iget-object v0, v7, La/h38;->O1:La/ii;

    .line 329
    .line 330
    if-eqz v0, :cond_d

    .line 331
    .line 332
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 333
    .line 334
    invoke-virtual {v7}, La/h38;->G0()La/pyq;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    iget-object v1, v1, La/pyq;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 339
    .line 340
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->getTitle()Ljava/lang/CharSequence;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    if-nez v1, :cond_c

    .line 345
    .line 346
    const v1, 0x7f13029e

    .line 347
    .line 348
    .line 349
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    :cond_c
    move-object v9, v1

    .line 357
    const v1, 0x7f1307c9

    .line 358
    .line 359
    .line 360
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-virtual {v7, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    sget-object v17, La/n12;->b:La/n12;

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const/16 v19, 0x5f8

    .line 376
    .line 377
    const/4 v12, 0x0

    .line 378
    const/4 v13, 0x0

    .line 379
    const/4 v14, 0x0

    .line 380
    const/4 v15, 0x0

    .line 381
    const/16 v16, 0x0

    .line 382
    .line 383
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 394
    .line 395
    .line 396
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    goto :goto_1

    .line 399
    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v3

    .line 403
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 404
    .line 405
    .line 406
    :goto_1
    return-object v3

    .line 407
    :pswitch_0
    iget-object v1, v0, La/f38;->j:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, La/v38;

    .line 410
    .line 411
    sget-object v3, La/wne;->a:La/wne;

    .line 412
    .line 413
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    sget-object v3, La/h38;->V1:La/yk5;

    .line 417
    .line 418
    iget-object v0, v0, La/f38;->k:La/h38;

    .line 419
    .line 420
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    iget-object v3, v3, La/pyq;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 425
    .line 426
    iget-boolean v4, v1, La/v38;->f:Z

    .line 427
    .line 428
    iget-object v5, v1, La/v38;->b:Ljava/lang/String;

    .line 429
    .line 430
    iget-object v6, v1, La/v38;->a:La/kbn;

    .line 431
    .line 432
    iget-object v7, v6, La/kbn;->e:La/cm90;

    .line 433
    .line 434
    iget-object v8, v6, La/kbn;->d:Ljava/lang/String;

    .line 435
    .line 436
    const/16 v9, 0x8

    .line 437
    .line 438
    if-eqz v4, :cond_f

    .line 439
    .line 440
    move v4, v2

    .line 441
    goto :goto_2

    .line 442
    :cond_f
    move v4, v9

    .line 443
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    iget-object v3, v3, La/pyq;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 451
    .line 452
    iget-object v4, v1, La/v38;->g:Landroid/text/SpannableStringBuilder;

    .line 453
    .line 454
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    iget-object v3, v3, La/pyq;->f:Lcom/google/android/material/textview/MaterialTextView;

    .line 462
    .line 463
    const v4, 0x7f13005d

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    if-lez v3, :cond_10

    .line 478
    .line 479
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 484
    .line 485
    new-instance v4, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v10, "+"

    .line 488
    .line 489
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeText(Ljava/lang/CharSequence;)V

    .line 500
    .line 501
    .line 502
    :cond_10
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 507
    .line 508
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhone()Ljava/lang/CharSequence;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    if-eqz v3, :cond_11

    .line 513
    .line 514
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    if-nez v3, :cond_12

    .line 519
    .line 520
    :cond_11
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    if-lez v3, :cond_12

    .line 525
    .line 526
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 531
    .line 532
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneText(Ljava/lang/CharSequence;)V

    .line 533
    .line 534
    .line 535
    :cond_12
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 540
    .line 541
    iget-object v4, v7, La/cm90;->d:Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhonePlaceholder(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 551
    .line 552
    iget-object v4, v7, La/cm90;->d:Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneMask(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    iget-boolean v3, v6, La/kbn;->f:Z

    .line 558
    .line 559
    if-eqz v3, :cond_13

    .line 560
    .line 561
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 566
    .line 567
    iget-object v4, v6, La/kbn;->c:Ljava/lang/String;

    .line 568
    .line 569
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    goto :goto_3

    .line 573
    :cond_13
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    iget-object v3, v3, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 578
    .line 579
    const-string v4, ""

    .line 580
    .line 581
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    :goto_3
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    iget-object v3, v3, La/pyq;->d:Landroidx/core/widget/ContentLoadingProgressBar;

    .line 589
    .line 590
    iget-boolean v4, v1, La/v38;->c:Z

    .line 591
    .line 592
    if-eqz v4, :cond_14

    .line 593
    .line 594
    move v4, v2

    .line 595
    goto :goto_4

    .line 596
    :cond_14
    move v4, v9

    .line 597
    :goto_4
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    iget-object v3, v3, La/pyq;->g:Lcom/google/android/material/textview/MaterialTextView;

    .line 605
    .line 606
    iget-boolean v4, v1, La/v38;->e:Z

    .line 607
    .line 608
    if-eqz v4, :cond_15

    .line 609
    .line 610
    goto :goto_5

    .line 611
    :cond_15
    move v2, v9

    .line 612
    :goto_5
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    iget-object v2, v2, La/pyq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 620
    .line 621
    iget-boolean v3, v1, La/v38;->d:Z

    .line 622
    .line 623
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0}, La/h38;->G0()La/pyq;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    iget-object v0, v0, La/pyq;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 631
    .line 632
    iget-object v1, v1, La/v38;->h:Ljava/lang/String;

    .line 633
    .line 634
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 635
    .line 636
    .line 637
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 638
    .line 639
    return-object v0

    .line 640
    nop

    .line 641
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
