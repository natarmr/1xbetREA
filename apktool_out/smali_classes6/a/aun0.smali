.class public final La/aun0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bun0;


# direct methods
.method public synthetic constructor <init>(La/bun0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aun0;->i:B

    iput-object p1, p0, La/aun0;->k:La/bun0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/aun0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/aun0;->k:La/bun0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/aun0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/aun0;-><init>(La/bun0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/aun0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/aun0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/aun0;-><init>(La/bun0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/aun0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/aun0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/aun0;-><init>(La/bun0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/aun0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/aun0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/aun0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/aun0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/aun0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/nun0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/aun0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/aun0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/aun0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/iun0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/aun0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/aun0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/aun0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/aun0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/aun0;->k:La/bun0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, La/aun0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v1, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->c:Z

    .line 22
    .line 23
    iget-boolean v4, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->j:Z

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 32
    .line 33
    iget-object v5, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 34
    .line 35
    iget-object v6, v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->a:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object v6, La/pn40;->a:La/pn40;

    .line 47
    .line 48
    iget-wide v5, v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 49
    .line 50
    const/4 v7, 0x6

    .line 51
    invoke-static {v5, v6, v7}, La/pn40;->n(DI)D

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    sget-object v7, La/p3u0;->g:La/p3u0;

    .line 56
    .line 57
    invoke-static {v5, v6, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    const-string v5, ""

    .line 63
    .line 64
    :goto_1
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 72
    .line 73
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object v5, v5, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 78
    .line 79
    invoke-virtual {v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :cond_2
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setSelection(I)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 97
    .line 98
    iget-boolean v2, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->h:Z

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setMinusButtonEnabled(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 108
    .line 109
    iget-boolean v2, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->i:Z

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlusButtonEnabled(Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 119
    .line 120
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setMinusButtonVisible(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 128
    .line 129
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlusButtonVisible(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iget-object v1, v1, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 137
    .line 138
    iget-object v2, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->m:Ljava/lang/CharSequence;

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setHelperText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    iget-wide v1, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->d:D

    .line 144
    .line 145
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 146
    .line 147
    mul-double/2addr v4, v1

    .line 148
    const-wide/high16 v6, 0x4014000000000000L    # 5.0

    .line 149
    .line 150
    mul-double/2addr v6, v1

    .line 151
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    .line 152
    .line 153
    mul-double/2addr v8, v1

    .line 154
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    iget-object v10, v10, La/cun0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 159
    .line 160
    sget-object v11, La/pn40;->a:La/pn40;

    .line 161
    .line 162
    sget-object v11, La/p3u0;->c:La/p3u0;

    .line 163
    .line 164
    invoke-static {v1, v2, v11}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v10, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iget-object v1, v1, La/cun0;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 176
    .line 177
    invoke-static {v4, v5, v11}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget-object v1, v1, La/cun0;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 189
    .line 190
    invoke-static {v6, v7, v11}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    iget-object v1, v1, La/cun0;->g:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 202
    .line 203
    invoke-static {v8, v9, v11}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iget-object v1, v1, La/cun0;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 215
    .line 216
    iget-boolean v0, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->k:Z

    .line 217
    .line 218
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 219
    .line 220
    .line 221
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_0
    iget-object v1, v0, La/aun0;->j:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v1, La/nun0;

    .line 227
    .line 228
    sget-object v2, La/wne;->a:La/wne;

    .line 229
    .line 230
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    if-eqz v1, :cond_9

    .line 234
    .line 235
    instance-of v2, v1, La/mun0;

    .line 236
    .line 237
    iget-object v7, v0, La/aun0;->k:La/bun0;

    .line 238
    .line 239
    if-eqz v2, :cond_5

    .line 240
    .line 241
    iget-object v8, v7, La/bun0;->e2:La/ynb;

    .line 242
    .line 243
    if-eqz v8, :cond_4

    .line 244
    .line 245
    sget-object v9, La/bm5;->j:La/bm5;

    .line 246
    .line 247
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    const-string v13, "CHANGE_BALANCE_REQUEST_KEY"

    .line 255
    .line 256
    const/16 v14, 0x18e

    .line 257
    .line 258
    const/4 v10, 0x0

    .line 259
    const/4 v12, 0x0

    .line 260
    invoke-static/range {v8 .. v14}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_4
    const-string v0, "changeBalanceDialogProvider"

    .line 265
    .line 266
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v4

    .line 270
    :cond_5
    instance-of v0, v1, La/jun0;

    .line 271
    .line 272
    if-eqz v0, :cond_7

    .line 273
    .line 274
    iget-object v5, v7, La/bun0;->c2:La/wdk0;

    .line 275
    .line 276
    if-eqz v5, :cond_6

    .line 277
    .line 278
    new-instance v6, La/xdk0;

    .line 279
    .line 280
    sget-object v9, La/rek0;->b:La/rek0;

    .line 281
    .line 282
    check-cast v1, La/jun0;

    .line 283
    .line 284
    iget-object v10, v1, La/jun0;->a:Ljava/lang/String;

    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const/16 v15, 0x7c

    .line 288
    .line 289
    const/4 v11, 0x0

    .line 290
    const/4 v12, 0x0

    .line 291
    const/4 v13, 0x0

    .line 292
    move-object v8, v6

    .line 293
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7}, La/bun0;->Q0()La/cun0;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    iget-object v9, v0, La/cun0;->a:Landroidx/core/widget/NestedScrollView;

    .line 301
    .line 302
    const/16 v12, 0x3f4

    .line 303
    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v10, 0x0

    .line 306
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_6
    const-string v0, "snackbarManager"

    .line 311
    .line 312
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v4

    .line 316
    :cond_7
    instance-of v0, v1, La/lun0;

    .line 317
    .line 318
    if-eqz v0, :cond_8

    .line 319
    .line 320
    invoke-virtual {v7}, La/bun0;->Q0()La/cun0;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iget-object v0, v0, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 325
    .line 326
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 327
    .line 328
    .line 329
    goto :goto_2

    .line 330
    :cond_8
    instance-of v0, v1, La/kun0;

    .line 331
    .line 332
    if-eqz v0, :cond_9

    .line 333
    .line 334
    invoke-virtual {v7}, La/yo8;->x0()V

    .line 335
    .line 336
    .line 337
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 341
    .line 342
    .line 343
    :goto_3
    return-object v4

    .line 344
    :pswitch_1
    iget-object v0, v0, La/aun0;->j:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, La/iun0;

    .line 347
    .line 348
    sget-object v1, La/wne;->a:La/wne;

    .line 349
    .line 350
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    instance-of v1, v0, La/hun0;

    .line 354
    .line 355
    if-eqz v1, :cond_a

    .line 356
    .line 357
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iget-object v1, v1, La/cun0;->c:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 362
    .line 363
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 364
    .line 365
    .line 366
    check-cast v0, La/hun0;

    .line 367
    .line 368
    iget-object v2, v0, La/hun0;->d:Ljava/lang/CharSequence;

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountTitle(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    iget-object v2, v0, La/hun0;->a:Ljava/lang/CharSequence;

    .line 374
    .line 375
    iget-object v0, v0, La/hun0;->b:Ljava/lang/CharSequence;

    .line 376
    .line 377
    invoke-virtual {v1, v2, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-object v0, v0, La/cun0;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 385
    .line 386
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :cond_a
    sget-object v1, La/fun0;->a:La/fun0;

    .line 391
    .line 392
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-eqz v1, :cond_b

    .line 397
    .line 398
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iget-object v0, v0, La/cun0;->c:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 403
    .line 404
    const/16 v1, 0x8

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_b
    sget-object v1, La/gun0;->a:La/gun0;

    .line 411
    .line 412
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_c

    .line 417
    .line 418
    invoke-virtual {v3}, La/bun0;->Q0()La/cun0;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    iget-object v0, v0, La/cun0;->c:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 423
    .line 424
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 425
    .line 426
    .line 427
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 431
    .line 432
    .line 433
    :goto_5
    return-object v4

    .line 434
    nop

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
