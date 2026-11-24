.class public final La/gnc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hnc0;


# direct methods
.method public synthetic constructor <init>(La/hnc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gnc0;->i:B

    iput-object p1, p0, La/gnc0;->k:La/hnc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gnc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gnc0;->k:La/hnc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/gnc0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/gnc0;-><init>(La/hnc0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/gnc0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/gnc0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/gnc0;-><init>(La/hnc0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/gnc0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/gnc0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/gnc0;-><init>(La/hnc0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/gnc0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/gnc0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/gnc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gnc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gnc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/onc0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/gnc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/gnc0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/gnc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/gnc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/gnc0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/gnc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gnc0;->i:B

    .line 4
    .line 5
    const v2, 0x3ec28f5c    # 0.38f

    .line 6
    .line 7
    .line 8
    iget-object v3, v0, La/gnc0;->k:La/hnc0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/gnc0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/hnc0;->R1:La/xi70;

    .line 23
    .line 24
    invoke-virtual {v3}, La/hnc0;->G0()La/c3r;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, La/c3r;->d:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    iget-object v1, v0, La/gnc0;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/onc0;

    .line 39
    .line 40
    sget-object v3, La/wne;->a:La/wne;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v3, La/knc0;->a:La/knc0;

    .line 46
    .line 47
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    const-string v5, "snackbarManager"

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    iget-object v9, v0, La/gnc0;->k:La/hnc0;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    sget-object v0, La/hnc0;->R1:La/xi70;

    .line 60
    .line 61
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 62
    .line 63
    instance-of v1, v0, La/ikr0;

    .line 64
    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    check-cast v0, La/ikr0;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v0, v4

    .line 71
    :goto_0
    if-eqz v0, :cond_1

    .line 72
    .line 73
    invoke-virtual {v0, v6}, La/ikr0;->X0(Z)V

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-object v7, v9, La/hnc0;->M1:La/wdk0;

    .line 77
    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    new-instance v8, La/xdk0;

    .line 81
    .line 82
    sget-object v11, La/pek0;->a:La/pek0;

    .line 83
    .line 84
    const v0, 0x7f131632

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    const/16 v17, 0x7c

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    const/4 v15, 0x0

    .line 101
    move-object v10, v8

    .line 102
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 103
    .line 104
    .line 105
    const/16 v14, 0x3fc

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 111
    .line 112
    .line 113
    goto/16 :goto_5

    .line 114
    .line 115
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v4

    .line 119
    :cond_3
    instance-of v0, v1, La/mnc0;

    .line 120
    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    check-cast v1, La/mnc0;

    .line 124
    .line 125
    sget-object v0, La/hnc0;->R1:La/xi70;

    .line 126
    .line 127
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 128
    .line 129
    instance-of v2, v0, La/ikr0;

    .line 130
    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    check-cast v0, La/ikr0;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    move-object v0, v4

    .line 137
    :goto_1
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 140
    .line 141
    .line 142
    :cond_5
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 143
    .line 144
    instance-of v2, v0, La/ikr0;

    .line 145
    .line 146
    if-eqz v2, :cond_6

    .line 147
    .line 148
    check-cast v0, La/ikr0;

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    move-object v0, v4

    .line 152
    :goto_2
    if-eqz v0, :cond_7

    .line 153
    .line 154
    invoke-virtual {v0, v6}, La/ikr0;->X0(Z)V

    .line 155
    .line 156
    .line 157
    :cond_7
    iget-object v7, v9, La/hnc0;->M1:La/wdk0;

    .line 158
    .line 159
    if-eqz v7, :cond_8

    .line 160
    .line 161
    new-instance v8, La/xdk0;

    .line 162
    .line 163
    sget-object v11, La/rek0;->b:La/rek0;

    .line 164
    .line 165
    iget-object v12, v1, La/mnc0;->a:Ljava/lang/String;

    .line 166
    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x7c

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    const/4 v15, 0x0

    .line 174
    move-object v10, v8

    .line 175
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 176
    .line 177
    .line 178
    const/16 v14, 0x3fc

    .line 179
    .line 180
    const/4 v10, 0x0

    .line 181
    const/4 v11, 0x0

    .line 182
    const/4 v12, 0x0

    .line 183
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 184
    .line 185
    .line 186
    goto/16 :goto_5

    .line 187
    .line 188
    :cond_8
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v4

    .line 192
    :cond_9
    instance-of v0, v1, La/lnc0;

    .line 193
    .line 194
    if-eqz v0, :cond_d

    .line 195
    .line 196
    check-cast v1, La/lnc0;

    .line 197
    .line 198
    sget-object v0, La/hnc0;->R1:La/xi70;

    .line 199
    .line 200
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 201
    .line 202
    instance-of v2, v0, La/ikr0;

    .line 203
    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    check-cast v0, La/ikr0;

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_a
    move-object v0, v4

    .line 210
    :goto_3
    if-eqz v0, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0, v6}, La/ikr0;->X0(Z)V

    .line 213
    .line 214
    .line 215
    :cond_b
    iget-object v7, v9, La/hnc0;->M1:La/wdk0;

    .line 216
    .line 217
    if-eqz v7, :cond_c

    .line 218
    .line 219
    iget-object v8, v1, La/lnc0;->a:La/xdk0;

    .line 220
    .line 221
    invoke-virtual {v9}, La/hnc0;->G0()La/c3r;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-object v11, v0, La/c3r;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/16 v14, 0x3f4

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 233
    .line 234
    .line 235
    goto/16 :goto_5

    .line 236
    .line 237
    :cond_c
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v4

    .line 241
    :cond_d
    instance-of v0, v1, La/nnc0;

    .line 242
    .line 243
    if-eqz v0, :cond_12

    .line 244
    .line 245
    check-cast v1, La/nnc0;

    .line 246
    .line 247
    sget-object v0, La/hnc0;->R1:La/xi70;

    .line 248
    .line 249
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 250
    .line 251
    instance-of v2, v0, La/ikr0;

    .line 252
    .line 253
    if-eqz v2, :cond_e

    .line 254
    .line 255
    check-cast v0, La/ikr0;

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_e
    move-object v0, v4

    .line 259
    :goto_4
    if-eqz v0, :cond_f

    .line 260
    .line 261
    invoke-virtual {v0, v6}, La/ikr0;->X0(Z)V

    .line 262
    .line 263
    .line 264
    :cond_f
    iget-object v0, v9, La/hnc0;->N1:La/lgn0;

    .line 265
    .line 266
    if-eqz v0, :cond_11

    .line 267
    .line 268
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 269
    .line 270
    const v3, 0x7f13025d

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-direct {v2, v3, v4, v4, v4}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 284
    .line 285
    const v3, 0x7f131011

    .line 286
    .line 287
    .line 288
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    iget-object v5, v1, La/nnc0;->c:Ljava/lang/String;

    .line 293
    .line 294
    const-string v6, ": "

    .line 295
    .line 296
    invoke-static {v3, v6, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    iget-object v12, v1, La/nnc0;->b:Ljava/lang/String;

    .line 301
    .line 302
    iget-wide v5, v1, La/nnc0;->a:J

    .line 303
    .line 304
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    const-string v15, "TOTO"

    .line 309
    .line 310
    sget-object v16, La/iun;->a:La/iun;

    .line 311
    .line 312
    const-string v13, "REQUEST_SUCCESS_BET_KEY"

    .line 313
    .line 314
    invoke-direct/range {v10 .. v16}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v0, v2, v10, v1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 326
    .line 327
    .line 328
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 329
    .line 330
    instance-of v1, v0, La/ikr0;

    .line 331
    .line 332
    if-eqz v1, :cond_10

    .line 333
    .line 334
    move-object v4, v0

    .line 335
    check-cast v4, La/ikr0;

    .line 336
    .line 337
    :cond_10
    if-eqz v4, :cond_15

    .line 338
    .line 339
    invoke-virtual {v4}, La/yo8;->x0()V

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_11
    const-string v0, "successBetAlertManager"

    .line 344
    .line 345
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v4

    .line 349
    :cond_12
    instance-of v0, v1, La/jnc0;

    .line 350
    .line 351
    if-eqz v0, :cond_16

    .line 352
    .line 353
    iget-object v0, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 354
    .line 355
    instance-of v1, v0, La/ikr0;

    .line 356
    .line 357
    if-eqz v1, :cond_13

    .line 358
    .line 359
    move-object v4, v0

    .line 360
    check-cast v4, La/ikr0;

    .line 361
    .line 362
    :cond_13
    if-eqz v4, :cond_14

    .line 363
    .line 364
    const/4 v0, 0x1

    .line 365
    invoke-virtual {v4, v0}, La/ikr0;->X0(Z)V

    .line 366
    .line 367
    .line 368
    :cond_14
    sget-object v0, La/hnc0;->R1:La/xi70;

    .line 369
    .line 370
    invoke-virtual {v9}, La/hnc0;->G0()La/c3r;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    iget-object v0, v0, La/c3r;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 375
    .line 376
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v9}, La/hnc0;->G0()La/c3r;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v0, v0, La/c3r;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 384
    .line 385
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 386
    .line 387
    .line 388
    :cond_15
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 392
    .line 393
    .line 394
    :goto_6
    return-object v4

    .line 395
    :pswitch_1
    iget-object v0, v0, La/gnc0;->j:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Ljava/lang/String;

    .line 398
    .line 399
    sget-object v1, La/wne;->a:La/wne;

    .line 400
    .line 401
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    xor-int/lit8 v1, v0, 0x1

    .line 409
    .line 410
    sget-object v4, La/hnc0;->R1:La/xi70;

    .line 411
    .line 412
    invoke-virtual {v3}, La/hnc0;->G0()La/c3r;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    iget-object v4, v4, La/c3r;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 417
    .line 418
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, La/hnc0;->G0()La/c3r;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iget-object v1, v1, La/c3r;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 426
    .line 427
    if-nez v0, :cond_17

    .line 428
    .line 429
    const/high16 v2, 0x3f800000    # 1.0f

    .line 430
    .line 431
    :cond_17
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 432
    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
