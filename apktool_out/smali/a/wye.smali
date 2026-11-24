.class public final La/wye;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xye;


# direct methods
.method public synthetic constructor <init>(La/xye;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wye;->i:B

    iput-object p1, p0, La/wye;->k:La/xye;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wye;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wye;->k:La/xye;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wye;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wye;-><init>(La/xye;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wye;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wye;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wye;-><init>(La/xye;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wye;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/wye;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/wye;-><init>(La/xye;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/wye;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/wye;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/s6c0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wye;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wye;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wye;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wye;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wye;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wye;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/br00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/wye;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/wye;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/wye;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wye;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/wye;->k:La/xye;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/wye;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/s6c0;

    .line 14
    .line 15
    sget-object v2, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    if-eqz v1, :cond_7

    .line 21
    .line 22
    instance-of v2, v1, La/l6c0;

    .line 23
    .line 24
    iget-object v6, v0, La/wye;->k:La/xye;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-object v4, v6, La/xye;->M1:La/wdk0;

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    check-cast v1, La/l6c0;

    .line 33
    .line 34
    iget-object v5, v1, La/l6c0;->a:La/xdk0;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    const/16 v11, 0x3fc

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 43
    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_0
    const-string v0, "snackbarManager"

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v3

    .line 53
    :cond_1
    instance-of v0, v1, La/q6c0;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    check-cast v1, La/q6c0;

    .line 58
    .line 59
    sget-object v0, La/xye;->U1:La/nwd;

    .line 60
    .line 61
    iget-object v0, v6, La/xye;->N1:La/lgn0;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 66
    .line 67
    const v4, 0x7f13025d

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v5, v1, La/q6c0;->e:Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {v2, v4, v3, v5, v3}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const v3, 0x7f131011

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v4, v1, La/q6c0;->d:La/q4f;

    .line 90
    .line 91
    invoke-static {v4}, La/lgb;->V(La/q4f;)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const-string v5, ": "

    .line 100
    .line 101
    invoke-static {v3, v5, v4}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    iget-object v9, v1, La/q6c0;->c:Ljava/lang/String;

    .line 106
    .line 107
    new-instance v3, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 108
    .line 109
    const v4, 0x7f130494

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v5, v1, La/q6c0;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-direct {v3, v4, v5}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    iget-wide v3, v1, La/q6c0;->a:J

    .line 129
    .line 130
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 131
    .line 132
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    const-string v12, "PROMO"

    .line 137
    .line 138
    const-string v10, "REQUEST_SUCCESS_BET_KEY"

    .line 139
    .line 140
    invoke-direct/range {v7 .. v13}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v6}, La/acb;->P(Landroidx/fragment/app/Fragment;)La/axe;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0, v2, v7, v1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6}, La/xye;->G0()La/w0f;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v0, v0, La/w0f;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 155
    .line 156
    const-string v1, ""

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_2
    const-string v0, "successBetAlertManager"

    .line 163
    .line 164
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v3

    .line 168
    :cond_3
    instance-of v0, v1, La/n6c0;

    .line 169
    .line 170
    if-eqz v0, :cond_5

    .line 171
    .line 172
    iget-object v0, v6, La/xye;->O1:La/iw20;

    .line 173
    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    check-cast v1, La/n6c0;

    .line 184
    .line 185
    iget-object v1, v1, La/n6c0;->a:La/ngc0;

    .line 186
    .line 187
    invoke-virtual {v0, v2, v1}, La/iw20;->j(Landroidx/fragment/app/e;La/ngc0;)V

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_4
    const-string v0, "promoCodesNavigator"

    .line 192
    .line 193
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v3

    .line 197
    :cond_5
    instance-of v0, v1, La/j6c0;

    .line 198
    .line 199
    if-eqz v0, :cond_7

    .line 200
    .line 201
    iget-object v0, v6, La/xye;->L1:La/ii;

    .line 202
    .line 203
    if-eqz v0, :cond_6

    .line 204
    .line 205
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 206
    .line 207
    const v2, 0x7f1307bb

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    check-cast v1, La/j6c0;

    .line 215
    .line 216
    iget-object v9, v1, La/j6c0;->a:Ljava/lang/String;

    .line 217
    .line 218
    const v1, 0x7f130e5d

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const v1, 0x7f13032f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    sget-object v16, La/n12;->b:La/n12;

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/16 v18, 0x5d0

    .line 240
    .line 241
    const/4 v12, 0x0

    .line 242
    const-string v13, "REQUEST_BET_EXISTS_DIALOG_KEY"

    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const/4 v15, 0x0

    .line 246
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 257
    .line 258
    .line 259
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_6
    const-string v0, "actionDialogManager"

    .line 263
    .line 264
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v3

    .line 268
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 269
    .line 270
    .line 271
    :goto_1
    return-object v3

    .line 272
    :pswitch_0
    iget-object v0, v0, La/wye;->j:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Ljava/lang/String;

    .line 275
    .line 276
    sget-object v1, La/wne;->a:La/wne;

    .line 277
    .line 278
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    iget-object v1, v2, La/xye;->S1:La/n0o0;

    .line 282
    .line 283
    sget-object v3, La/xye;->U1:La/nwd;

    .line 284
    .line 285
    invoke-virtual {v2}, La/xye;->G0()La/w0f;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    iget-object v3, v3, La/w0f;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 290
    .line 291
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-nez v3, :cond_8

    .line 304
    .line 305
    invoke-virtual {v2}, La/xye;->G0()La/w0f;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    iget-object v3, v3, La/w0f;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 310
    .line 311
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    check-cast v4, Landroid/text/TextWatcher;

    .line 316
    .line 317
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, La/xye;->G0()La/w0f;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    iget-object v3, v3, La/w0f;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 325
    .line 326
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, La/xye;->G0()La/w0f;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    iget-object v3, v3, La/w0f;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 334
    .line 335
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, Landroid/text/TextWatcher;

    .line 340
    .line 341
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 342
    .line 343
    .line 344
    :cond_8
    invoke-virtual {v2}, La/xye;->G0()La/w0f;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v1, v1, La/w0f;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-lez v0, :cond_9

    .line 355
    .line 356
    const/4 v0, 0x1

    .line 357
    goto :goto_2

    .line 358
    :cond_9
    const/4 v0, 0x0

    .line 359
    :goto_2
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 360
    .line 361
    .line 362
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_1
    iget-object v0, v0, La/wye;->j:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, La/br00;

    .line 368
    .line 369
    sget-object v1, La/wne;->a:La/wne;

    .line 370
    .line 371
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    sget-object v1, La/ar00;->a:La/ar00;

    .line 375
    .line 376
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-eqz v1, :cond_a

    .line 381
    .line 382
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 387
    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_a
    sget-object v1, La/zq00;->a:La/zq00;

    .line 391
    .line 392
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_b

    .line 397
    .line 398
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 403
    .line 404
    .line 405
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 409
    .line 410
    .line 411
    :goto_4
    return-object v3

    .line 412
    nop

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
