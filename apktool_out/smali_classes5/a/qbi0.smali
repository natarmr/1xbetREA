.class public final La/qbi0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/rbi0;


# direct methods
.method public synthetic constructor <init>(La/rbi0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qbi0;->i:B

    iput-object p1, p0, La/qbi0;->k:La/rbi0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qbi0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qbi0;->k:La/rbi0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qbi0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qbi0;-><init>(La/rbi0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/qbi0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/qbi0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/qbi0;-><init>(La/rbi0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/qbi0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/qbi0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/tci0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qbi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qbi0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qbi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/uci0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/qbi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/qbi0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/qbi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/qbi0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/qbi0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/tci0;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of v3, v1, La/kci0;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    iget-object v7, v0, La/qbi0;->k:La/rbi0;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-object v0, v7, La/rbi0;->L1:La/gl5;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    check-cast v1, La/kci0;

    .line 30
    .line 31
    iget-object v0, v1, La/kci0;->b:La/d7a;

    .line 32
    .line 33
    iget-object v1, v1, La/kci0;->a:Ljava/lang/String;

    .line 34
    .line 35
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 36
    .line 37
    invoke-static {v7, v2, v0, v1}, La/gl5;->p(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v4

    .line 48
    :cond_1
    instance-of v0, v1, La/jci0;

    .line 49
    .line 50
    const v3, 0x7f1307bb

    .line 51
    .line 52
    .line 53
    const v5, 0x7f130e5d

    .line 54
    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    check-cast v1, La/jci0;

    .line 59
    .line 60
    iget-object v10, v1, La/jci0;->a:Ljava/lang/String;

    .line 61
    .line 62
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 63
    .line 64
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 69
    .line 70
    invoke-virtual {v7, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v17, La/n12;->b:La/n12;

    .line 82
    .line 83
    const/16 v18, 0x0

    .line 84
    .line 85
    const/16 v19, 0x5d8

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const-string v14, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY"

    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_2
    instance-of v0, v1, La/qci0;

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    check-cast v1, La/qci0;

    .line 114
    .line 115
    iget-object v10, v1, La/qci0;->a:Ljava/lang/String;

    .line 116
    .line 117
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 118
    .line 119
    iget-object v5, v7, La/rbi0;->O1:La/wdk0;

    .line 120
    .line 121
    if-eqz v5, :cond_3

    .line 122
    .line 123
    new-instance v6, La/xdk0;

    .line 124
    .line 125
    sget-object v9, La/rek0;->b:La/rek0;

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
    :cond_3
    const-string v0, "snackbarManager"

    .line 148
    .line 149
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v4

    .line 153
    :cond_4
    instance-of v0, v1, La/sci0;

    .line 154
    .line 155
    const v6, 0x7f1303fb

    .line 156
    .line 157
    .line 158
    const v8, 0x7f13032f

    .line 159
    .line 160
    .line 161
    if-eqz v0, :cond_5

    .line 162
    .line 163
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 164
    .line 165
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 170
    .line 171
    invoke-virtual {v7, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    const v1, 0x7f1317d1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    sget-object v18, La/n12;->a:La/n12;

    .line 194
    .line 195
    const/16 v19, 0x0

    .line 196
    .line 197
    const/16 v20, 0x5d0

    .line 198
    .line 199
    const/4 v14, 0x0

    .line 200
    const-string v15, "REQUEST_VOICE_SMS_CONFIRMATION_KEY"

    .line 201
    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_5
    instance-of v0, v1, La/nci0;

    .line 222
    .line 223
    const v9, 0x7f130162

    .line 224
    .line 225
    .line 226
    const v10, 0x7f130a86

    .line 227
    .line 228
    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 232
    .line 233
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-object v1, v7, La/rbi0;->N1:La/ux00;

    .line 238
    .line 239
    if-eqz v1, :cond_6

    .line 240
    .line 241
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 242
    .line 243
    invoke-virtual {v7, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    const v1, 0x7f13047d

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-virtual {v7, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v15

    .line 265
    sget-object v20, La/n12;->a:La/n12;

    .line 266
    .line 267
    const/16 v21, 0x0

    .line 268
    .line 269
    const/16 v22, 0x5f0

    .line 270
    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    const/16 v18, 0x0

    .line 276
    .line 277
    const/16 v19, 0x0

    .line 278
    .line 279
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 280
    .line 281
    .line 282
    sget-object v1, La/tx00;->l2:La/evz;

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-static {v11, v2, v2, v2}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_6
    const-string v0, "logoutDialogFactory"

    .line 304
    .line 305
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v4

    .line 309
    :cond_7
    instance-of v0, v1, La/pci0;

    .line 310
    .line 311
    if-eqz v0, :cond_8

    .line 312
    .line 313
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 314
    .line 315
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 320
    .line 321
    invoke-virtual {v7, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    const v1, 0x7f13115d

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    sget-object v17, La/n12;->b:La/n12;

    .line 340
    .line 341
    const/16 v18, 0x0

    .line 342
    .line 343
    const/16 v19, 0x5d8

    .line 344
    .line 345
    const/4 v12, 0x0

    .line 346
    const/4 v13, 0x0

    .line 347
    const-string v14, "REQUEST_REQUEST_ERROR_KEY"

    .line 348
    .line 349
    const/4 v15, 0x0

    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_0

    .line 366
    .line 367
    :cond_8
    instance-of v0, v1, La/oci0;

    .line 368
    .line 369
    if-eqz v0, :cond_9

    .line 370
    .line 371
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 372
    .line 373
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 378
    .line 379
    invoke-virtual {v7, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    const v1, 0x7f13047e

    .line 384
    .line 385
    .line 386
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v13

    .line 390
    invoke-virtual {v7, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v14

    .line 394
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v15

    .line 401
    sget-object v20, La/n12;->a:La/n12;

    .line 402
    .line 403
    const/16 v21, 0x0

    .line 404
    .line 405
    const/16 v22, 0x5d0

    .line 406
    .line 407
    const/16 v16, 0x0

    .line 408
    .line 409
    const-string v17, "REQUEST_BACK_DIALOG_KEY"

    .line 410
    .line 411
    const/16 v18, 0x0

    .line 412
    .line 413
    const/16 v19, 0x0

    .line 414
    .line 415
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_0

    .line 429
    .line 430
    :cond_9
    sget-object v0, La/mci0;->a:La/mci0;

    .line 431
    .line 432
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_a

    .line 437
    .line 438
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 439
    .line 440
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 445
    .line 446
    invoke-virtual {v7, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v12

    .line 450
    const v1, 0x7f130a87

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v13

    .line 457
    invoke-virtual {v7, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v14

    .line 461
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v7, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v15

    .line 468
    sget-object v20, La/n12;->a:La/n12;

    .line 469
    .line 470
    const/16 v21, 0x0

    .line 471
    .line 472
    const/16 v22, 0x5d0

    .line 473
    .line 474
    const/16 v16, 0x0

    .line 475
    .line 476
    const-string v17, "REQUEST_PROCESS_INTERRUPT_KEY"

    .line 477
    .line 478
    const/16 v18, 0x0

    .line 479
    .line 480
    const/16 v19, 0x0

    .line 481
    .line 482
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_0

    .line 496
    .line 497
    :cond_a
    sget-object v0, La/rci0;->a:La/rci0;

    .line 498
    .line 499
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_b

    .line 504
    .line 505
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 506
    .line 507
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 512
    .line 513
    invoke-virtual {v7, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v10

    .line 517
    const v1, 0x7f1306d4

    .line 518
    .line 519
    .line 520
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v11

    .line 524
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v12

    .line 528
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v7, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v13

    .line 535
    sget-object v18, La/n12;->a:La/n12;

    .line 536
    .line 537
    const/16 v19, 0x0

    .line 538
    .line 539
    const/16 v20, 0x5d0

    .line 540
    .line 541
    const/4 v14, 0x0

    .line 542
    const-string v15, "REQUEST_TELEGRAM_CONFIRMATION_KEY"

    .line 543
    .line 544
    const/16 v16, 0x0

    .line 545
    .line 546
    const/16 v17, 0x0

    .line 547
    .line 548
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 559
    .line 560
    .line 561
    goto :goto_0

    .line 562
    :cond_b
    sget-object v0, La/lci0;->a:La/lci0;

    .line 563
    .line 564
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_c

    .line 569
    .line 570
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 571
    .line 572
    invoke-virtual {v7}, La/rbi0;->G0()La/ii;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 577
    .line 578
    invoke-virtual {v7, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v10

    .line 582
    const v1, 0x7f1306d3

    .line 583
    .line 584
    .line 585
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v11

    .line 589
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v12

    .line 593
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v7, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v13

    .line 600
    sget-object v18, La/n12;->a:La/n12;

    .line 601
    .line 602
    const/16 v19, 0x0

    .line 603
    .line 604
    const/16 v20, 0x5d0

    .line 605
    .line 606
    const/4 v14, 0x0

    .line 607
    const-string v15, "REQUEST_FLASH_CALL_CONFIRMATION_KEY"

    .line 608
    .line 609
    const/16 v16, 0x0

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 624
    .line 625
    .line 626
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 627
    .line 628
    goto :goto_1

    .line 629
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 630
    .line 631
    .line 632
    :goto_1
    return-object v4

    .line 633
    :pswitch_0
    iget-object v1, v0, La/qbi0;->j:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v1, La/uci0;

    .line 636
    .line 637
    sget-object v3, La/wne;->a:La/wne;

    .line 638
    .line 639
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    sget-object v3, La/rbi0;->U1:La/gle0;

    .line 643
    .line 644
    iget-object v0, v0, La/qbi0;->k:La/rbi0;

    .line 645
    .line 646
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    iget-object v3, v3, La/p4r;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 651
    .line 652
    iget-object v4, v1, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 653
    .line 654
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    iget-object v3, v3, La/p4r;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 662
    .line 663
    iget v4, v1, La/uci0;->f:I

    .line 664
    .line 665
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 676
    .line 677
    .line 678
    move-result-object v3

    .line 679
    iget-object v3, v3, La/p4r;->j:Lcom/google/android/material/textview/MaterialTextView;

    .line 680
    .line 681
    iget-boolean v4, v1, La/uci0;->j:Z

    .line 682
    .line 683
    const/16 v5, 0x8

    .line 684
    .line 685
    if-eqz v4, :cond_d

    .line 686
    .line 687
    move v4, v2

    .line 688
    goto :goto_2

    .line 689
    :cond_d
    move v4, v5

    .line 690
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    iget-object v3, v3, La/p4r;->k:Lcom/google/android/material/textview/MaterialTextView;

    .line 698
    .line 699
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    iget-object v3, v3, La/p4r;->h:Landroid/widget/FrameLayout;

    .line 707
    .line 708
    iget-boolean v4, v1, La/uci0;->k:Z

    .line 709
    .line 710
    if-eqz v4, :cond_e

    .line 711
    .line 712
    move v4, v2

    .line 713
    goto :goto_3

    .line 714
    :cond_e
    move v4, v5

    .line 715
    :goto_3
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    iget-object v3, v3, La/p4r;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 723
    .line 724
    iget-boolean v4, v1, La/uci0;->b:Z

    .line 725
    .line 726
    if-eqz v4, :cond_f

    .line 727
    .line 728
    move v4, v2

    .line 729
    goto :goto_4

    .line 730
    :cond_f
    move v4, v5

    .line 731
    :goto_4
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    iget-object v3, v3, La/p4r;->f:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 739
    .line 740
    iget-boolean v4, v1, La/uci0;->c:Z

    .line 741
    .line 742
    if-eqz v4, :cond_10

    .line 743
    .line 744
    move v4, v2

    .line 745
    goto :goto_5

    .line 746
    :cond_10
    move v4, v5

    .line 747
    :goto_5
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    iget-object v3, v3, La/p4r;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 755
    .line 756
    iget-boolean v4, v1, La/uci0;->d:Z

    .line 757
    .line 758
    if-eqz v4, :cond_11

    .line 759
    .line 760
    move v4, v2

    .line 761
    goto :goto_6

    .line 762
    :cond_11
    move v4, v5

    .line 763
    :goto_6
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    iget-object v3, v3, La/p4r;->c:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 771
    .line 772
    iget-boolean v4, v1, La/uci0;->e:Z

    .line 773
    .line 774
    if-eqz v4, :cond_12

    .line 775
    .line 776
    move v4, v2

    .line 777
    goto :goto_7

    .line 778
    :cond_12
    move v4, v5

    .line 779
    :goto_7
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v0}, La/rbi0;->H0()La/p4r;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    iget-object v0, v0, La/p4r;->b:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 787
    .line 788
    iget-boolean v1, v1, La/uci0;->a:Z

    .line 789
    .line 790
    if-eqz v1, :cond_13

    .line 791
    .line 792
    goto :goto_8

    .line 793
    :cond_13
    move v2, v5

    .line 794
    :goto_8
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 795
    .line 796
    .line 797
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 798
    .line 799
    return-object v0

    .line 800
    nop

    .line 801
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
