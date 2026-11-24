.class public final La/it6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/kt6;


# direct methods
.method public synthetic constructor <init>(La/kt6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/it6;->i:B

    iput-object p1, p0, La/it6;->k:La/kt6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/it6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/it6;->k:La/kt6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/it6;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/it6;-><init>(La/kt6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/it6;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/it6;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/it6;-><init>(La/kt6;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/it6;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/it6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/t920;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/it6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/it6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/it6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/p920;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/it6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/it6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/it6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/it6;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/it6;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/t920;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v3, La/q920;->a:La/q920;

    .line 19
    .line 20
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_5

    .line 25
    .line 26
    sget-object v3, La/s920;->a:La/s920;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v0, v0, La/it6;->k:La/kt6;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 37
    .line 38
    instance-of v3, v1, La/zp6;

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, La/zp6;

    .line 44
    .line 45
    :cond_0
    if-eqz v2, :cond_1

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v2, v1}, La/sik;->E0(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    sget-object v1, La/kt6;->Q1:La/bj5;

    .line 59
    .line 60
    invoke-virtual {v0}, La/kt6;->G0()La/ouc0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, La/ouc0;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object v3, La/r920;->a:La/r920;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 79
    .line 80
    instance-of v1, v0, La/zp6;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    move-object v2, v0

    .line 85
    check-cast v2, La/zp6;

    .line 86
    .line 87
    :cond_3
    if-eqz v2, :cond_5

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    invoke-virtual {v2, v0}, La/sik;->E0(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    :goto_1
    return-object v2

    .line 108
    :pswitch_0
    iget-object v1, v0, La/it6;->j:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, La/p920;

    .line 111
    .line 112
    sget-object v3, La/wne;->a:La/wne;

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v3, La/l920;->a:La/l920;

    .line 118
    .line 119
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    iget-object v7, v0, La/it6;->k:La/kt6;

    .line 124
    .line 125
    if-nez v4, :cond_f

    .line 126
    .line 127
    instance-of v0, v1, La/n920;

    .line 128
    .line 129
    const-string v4, "snackbarManager"

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iget-object v5, v7, La/kt6;->M1:La/wdk0;

    .line 134
    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    new-instance v6, La/xdk0;

    .line 138
    .line 139
    sget-object v9, La/rek0;->b:La/rek0;

    .line 140
    .line 141
    check-cast v1, La/n920;

    .line 142
    .line 143
    iget-object v10, v1, La/n920;->a:Ljava/lang/String;

    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    const/16 v15, 0x7c

    .line 147
    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x0

    .line 150
    const/4 v13, 0x0

    .line 151
    move-object v8, v6

    .line 152
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7}, La/kt6;->G0()La/ouc0;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v9, v0, La/ouc0;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 160
    .line 161
    const/16 v12, 0x3f4

    .line 162
    .line 163
    const/4 v8, 0x0

    .line 164
    const/4 v10, 0x0

    .line 165
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 166
    .line 167
    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v2

    .line 174
    :cond_7
    instance-of v0, v1, La/o920;

    .line 175
    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    check-cast v1, La/o920;

    .line 179
    .line 180
    sget-object v0, La/kt6;->Q1:La/bj5;

    .line 181
    .line 182
    iget-object v0, v7, La/kt6;->N1:La/lgn0;

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    iget-object v4, v1, La/o920;->d:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 187
    .line 188
    iget-object v9, v1, La/o920;->e:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v10, v1, La/o920;->a:Ljava/lang/String;

    .line 191
    .line 192
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 193
    .line 194
    const v6, 0x7f130494

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object v8, v1, La/o920;->c:Ljava/lang/String;

    .line 205
    .line 206
    invoke-direct {v5, v6, v8}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    iget-wide v5, v1, La/o920;->b:J

    .line 214
    .line 215
    new-instance v8, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 216
    .line 217
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const-string v13, "SIMPLE"

    .line 222
    .line 223
    const-string v11, "REQUEST_SUCCESS_BET_KEY"

    .line 224
    .line 225
    invoke-direct/range {v8 .. v14}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v0, v4, v8, v1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 237
    .line 238
    .line 239
    iget-object v0, v7, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 240
    .line 241
    instance-of v1, v0, La/yo8;

    .line 242
    .line 243
    if-eqz v1, :cond_8

    .line 244
    .line 245
    check-cast v0, La/yo8;

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_8
    move-object v0, v2

    .line 249
    :goto_2
    if-eqz v0, :cond_f

    .line 250
    .line 251
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_9
    const-string v0, "successBetAlertManager"

    .line 256
    .line 257
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v2

    .line 261
    :cond_a
    instance-of v0, v1, La/k920;

    .line 262
    .line 263
    if-eqz v0, :cond_c

    .line 264
    .line 265
    iget-object v0, v7, La/kt6;->L1:La/ii;

    .line 266
    .line 267
    if-eqz v0, :cond_b

    .line 268
    .line 269
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 270
    .line 271
    const v4, 0x7f1307bb

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    check-cast v1, La/k920;

    .line 279
    .line 280
    iget-object v10, v1, La/k920;->a:Ljava/lang/String;

    .line 281
    .line 282
    const v1, 0x7f130e5d

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const v1, 0x7f13032f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    sget-object v17, La/n12;->b:La/n12;

    .line 300
    .line 301
    const/16 v18, 0x0

    .line 302
    .line 303
    const/16 v19, 0x5d0

    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const-string v14, "REQUEST_BET_EXISTS_DIALOG_KEY"

    .line 307
    .line 308
    const/4 v15, 0x0

    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_b
    const-string v0, "actionDialogManager"

    .line 326
    .line 327
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v2

    .line 331
    :cond_c
    instance-of v0, v1, La/m920;

    .line 332
    .line 333
    if-eqz v0, :cond_e

    .line 334
    .line 335
    iget-object v5, v7, La/kt6;->M1:La/wdk0;

    .line 336
    .line 337
    if-eqz v5, :cond_d

    .line 338
    .line 339
    check-cast v1, La/m920;

    .line 340
    .line 341
    iget-object v6, v1, La/m920;->a:La/xdk0;

    .line 342
    .line 343
    invoke-virtual {v7}, La/kt6;->G0()La/ouc0;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iget-object v9, v0, La/ouc0;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 348
    .line 349
    const/4 v11, 0x0

    .line 350
    const/16 v12, 0x3f4

    .line 351
    .line 352
    const/4 v8, 0x0

    .line 353
    const/4 v10, 0x0

    .line 354
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 355
    .line 356
    .line 357
    goto :goto_3

    .line 358
    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v2

    .line 362
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_f
    :goto_3
    sget-object v0, La/kt6;->Q1:La/bj5;

    .line 367
    .line 368
    invoke-virtual {v7}, La/kt6;->H0()La/y920;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-object v0, v0, La/y920;->l:La/p7m0;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v2, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    :goto_4
    return-object v2

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
