.class public final La/g6c0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/h6c0;


# direct methods
.method public synthetic constructor <init>(La/h6c0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g6c0;->i:B

    iput-object p1, p0, La/g6c0;->k:La/h6c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/g6c0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g6c0;->k:La/h6c0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/g6c0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/g6c0;-><init>(La/h6c0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/g6c0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/g6c0;-><init>(La/h6c0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/g6c0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/g6c0;-><init>(La/h6c0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/g6c0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/g6c0;-><init>(La/h6c0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g6c0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/r6c0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/g6c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g6c0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g6c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/g6c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/g6c0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/g6c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/wq00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/g6c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/g6c0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/g6c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/ffe;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/g6c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/g6c0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/g6c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g6c0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/g6c0;->k:La/h6c0;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/r6c0;

    .line 16
    .line 17
    sget-object v2, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    if-eqz v1, :cond_9

    .line 23
    .line 24
    instance-of v2, v1, La/k6c0;

    .line 25
    .line 26
    const-string v3, "snackbarManager"

    .line 27
    .line 28
    iget-object v8, v0, La/g6c0;->k:La/h6c0;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object v6, v8, La/h6c0;->M1:La/wdk0;

    .line 33
    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    new-instance v7, La/xdk0;

    .line 37
    .line 38
    sget-object v10, La/rek0;->b:La/rek0;

    .line 39
    .line 40
    check-cast v1, La/k6c0;

    .line 41
    .line 42
    iget-object v11, v1, La/k6c0;->a:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v15, 0x0

    .line 45
    const/16 v16, 0x7c

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    move-object v9, v7

    .line 51
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v8}, La/h6c0;->G0(Landroidx/fragment/app/Fragment;)La/a720;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, La/a720;->V0()La/s720;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v10, v0, La/s720;->r:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 63
    .line 64
    const/16 v13, 0x3f4

    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 69
    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v5

    .line 77
    :cond_1
    instance-of v0, v1, La/p6c0;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    check-cast v1, La/p6c0;

    .line 82
    .line 83
    sget-object v0, La/h6c0;->W1:La/nh70;

    .line 84
    .line 85
    iget-object v0, v8, La/h6c0;->O1:La/lgn0;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 90
    .line 91
    const v3, 0x7f13025d

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v4, v1, La/p6c0;->d:Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {v2, v3, v5, v4, v5}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const v3, 0x7f131011

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    const v4, 0x7f1312d7

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-string v6, ": "

    .line 121
    .line 122
    invoke-static {v3, v6, v4}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    iget-object v11, v1, La/p6c0;->c:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v3, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 129
    .line 130
    const v4, 0x7f130494

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v6, v1, La/p6c0;->b:Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {v3, v4, v6}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    iget-wide v3, v1, La/p6c0;->a:J

    .line 150
    .line 151
    new-instance v9, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 152
    .line 153
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    const-string v14, "PROMO"

    .line 158
    .line 159
    const-string v12, "REQUEST_SUCCESS_BET_KEY"

    .line 160
    .line 161
    invoke-direct/range {v9 .. v15}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v8}, La/h6c0;->G0(Landroidx/fragment/app/Fragment;)La/a720;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v2, v9, v1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v8}, La/h6c0;->G0(Landroidx/fragment/app/Fragment;)La/a720;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8}, La/h6c0;->H0()La/h920;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v0, v0, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 187
    .line 188
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_2
    const-string v0, "successBetAlertManager"

    .line 194
    .line 195
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v5

    .line 199
    :cond_3
    instance-of v0, v1, La/i6c0;

    .line 200
    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    iget-object v0, v8, La/h6c0;->N1:La/ii;

    .line 204
    .line 205
    if-eqz v0, :cond_4

    .line 206
    .line 207
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 208
    .line 209
    const v2, 0x7f1307bb

    .line 210
    .line 211
    .line 212
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    check-cast v1, La/i6c0;

    .line 217
    .line 218
    iget-object v11, v1, La/i6c0;->a:Ljava/lang/String;

    .line 219
    .line 220
    const v1, 0x7f130e5d

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    const v1, 0x7f13032f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    sget-object v18, La/n12;->b:La/n12;

    .line 238
    .line 239
    const/16 v19, 0x0

    .line 240
    .line 241
    const/16 v20, 0x5d0

    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const-string v15, "REQUEST_BET_EXISTS_DIALOG_KEY"

    .line 245
    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 261
    .line 262
    .line 263
    goto :goto_0

    .line 264
    :cond_4
    const-string v0, "actionDialogManager"

    .line 265
    .line 266
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v5

    .line 270
    :cond_5
    instance-of v0, v1, La/o6c0;

    .line 271
    .line 272
    if-eqz v0, :cond_7

    .line 273
    .line 274
    iget-object v0, v8, La/h6c0;->P1:La/iw20;

    .line 275
    .line 276
    if-eqz v0, :cond_6

    .line 277
    .line 278
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    check-cast v1, La/o6c0;

    .line 286
    .line 287
    iget-object v1, v1, La/o6c0;->a:La/ngc0;

    .line 288
    .line 289
    invoke-virtual {v0, v2, v1}, La/iw20;->j(Landroidx/fragment/app/e;La/ngc0;)V

    .line 290
    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_6
    const-string v0, "promoCodesNavigator"

    .line 294
    .line 295
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v5

    .line 299
    :cond_7
    instance-of v0, v1, La/m6c0;

    .line 300
    .line 301
    if-eqz v0, :cond_9

    .line 302
    .line 303
    iget-object v6, v8, La/h6c0;->M1:La/wdk0;

    .line 304
    .line 305
    if-eqz v6, :cond_8

    .line 306
    .line 307
    check-cast v1, La/m6c0;

    .line 308
    .line 309
    iget-object v7, v1, La/m6c0;->a:La/xdk0;

    .line 310
    .line 311
    invoke-static {v8}, La/h6c0;->G0(Landroidx/fragment/app/Fragment;)La/a720;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v0}, La/a720;->V0()La/s720;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iget-object v10, v0, La/s720;->r:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 320
    .line 321
    const/4 v12, 0x0

    .line 322
    const/16 v13, 0x3f4

    .line 323
    .line 324
    const/4 v9, 0x0

    .line 325
    const/4 v11, 0x0

    .line 326
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 327
    .line 328
    .line 329
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    goto :goto_1

    .line 332
    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v5

    .line 336
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 337
    .line 338
    .line 339
    :goto_1
    return-object v5

    .line 340
    :pswitch_0
    iget-object v0, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, Ljava/lang/String;

    .line 343
    .line 344
    sget-object v1, La/wne;->a:La/wne;

    .line 345
    .line 346
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    iget-object v1, v4, La/h6c0;->V1:La/n0o0;

    .line 350
    .line 351
    sget-object v5, La/h6c0;->W1:La/nh70;

    .line 352
    .line 353
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    iget-object v5, v5, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 358
    .line 359
    invoke-virtual {v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-nez v5, :cond_a

    .line 372
    .line 373
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    iget-object v5, v5, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 378
    .line 379
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    check-cast v6, Landroid/text/TextWatcher;

    .line 384
    .line 385
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    iget-object v5, v5, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 393
    .line 394
    invoke-virtual {v5, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    iget-object v5, v5, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 402
    .line 403
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, Landroid/text/TextWatcher;

    .line 408
    .line 409
    invoke-virtual {v5, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 410
    .line 411
    .line 412
    :cond_a
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    iget-object v1, v1, La/h920;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-lez v0, :cond_b

    .line 423
    .line 424
    move v2, v3

    .line 425
    :cond_b
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 426
    .line 427
    .line 428
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_1
    iget-object v0, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v0, La/wq00;

    .line 434
    .line 435
    sget-object v1, La/wne;->a:La/wne;

    .line 436
    .line 437
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    sget-object v1, La/vq00;->a:La/vq00;

    .line 441
    .line 442
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_c

    .line 447
    .line 448
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 453
    .line 454
    .line 455
    goto :goto_2

    .line 456
    :cond_c
    sget-object v1, La/uq00;->a:La/uq00;

    .line 457
    .line 458
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_d

    .line 463
    .line 464
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 469
    .line 470
    .line 471
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    goto :goto_3

    .line 474
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 475
    .line 476
    .line 477
    :goto_3
    return-object v5

    .line 478
    :pswitch_2
    iget-object v1, v4, La/h6c0;->V1:La/n0o0;

    .line 479
    .line 480
    iget-object v0, v0, La/g6c0;->j:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, La/ffe;

    .line 483
    .line 484
    sget-object v6, La/wne;->a:La/wne;

    .line 485
    .line 486
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    sget-object v6, La/cfe;->a:La/cfe;

    .line 490
    .line 491
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v6

    .line 495
    if-eqz v6, :cond_e

    .line 496
    .line 497
    sget-object v0, La/h6c0;->W1:La/nh70;

    .line 498
    .line 499
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    iget-object v0, v0, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 504
    .line 505
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v4}, La/h6c0;->I0()La/g7c0;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    iget-object v2, v2, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 517
    .line 518
    invoke-virtual {v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    iget-object v0, v0, La/g7c0;->D:La/p7m0;

    .line 527
    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0, v5, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    iget-object v0, v0, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 539
    .line 540
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, Landroid/text/TextWatcher;

    .line 545
    .line 546
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 547
    .line 548
    .line 549
    goto :goto_4

    .line 550
    :cond_e
    sget-object v3, La/efe;->a:La/efe;

    .line 551
    .line 552
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-eqz v0, :cond_f

    .line 557
    .line 558
    sget-object v0, La/h6c0;->W1:La/nh70;

    .line 559
    .line 560
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    iget-object v0, v0, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 565
    .line 566
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    iget-object v0, v0, La/h920;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 574
    .line 575
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v4}, La/h6c0;->H0()La/h920;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    iget-object v0, v0, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 583
    .line 584
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    check-cast v1, Landroid/text/TextWatcher;

    .line 589
    .line 590
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 591
    .line 592
    .line 593
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 594
    .line 595
    goto :goto_5

    .line 596
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 597
    .line 598
    .line 599
    :goto_5
    return-object v5

    .line 600
    nop

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
