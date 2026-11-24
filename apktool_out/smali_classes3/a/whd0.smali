.class public final La/whd0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xhd0;


# direct methods
.method public synthetic constructor <init>(La/xhd0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/whd0;->i:B

    iput-object p1, p0, La/whd0;->k:La/xhd0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/whd0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/whd0;->k:La/xhd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/whd0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/whd0;-><init>(La/xhd0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/whd0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/whd0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/whd0;-><init>(La/xhd0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/whd0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/whd0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/hid0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/whd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/whd0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/whd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/iid0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/whd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/whd0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/whd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/whd0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/whd0;->k:La/xhd0;

    .line 6
    .line 7
    iget-object v0, v0, La/whd0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/hid0;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_c

    .line 21
    .line 22
    instance-of v3, v0, La/zhd0;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    sget-object v0, La/xhd0;->S1:La/fl70;

    .line 28
    .line 29
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/m3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 34
    .line 35
    const-string v1, ""

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La/m3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 45
    .line 46
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_0
    instance-of v3, v0, La/fid0;

    .line 52
    .line 53
    const-string v5, "actionDialogManager"

    .line 54
    .line 55
    const v6, 0x7f130e5d

    .line 56
    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    sget-object v0, La/xhd0;->S1:La/fl70;

    .line 61
    .line 62
    iget-object v0, v2, La/xhd0;->L1:La/ii;

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 67
    .line 68
    const v1, 0x7f130162

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    const v1, 0x7f13108b

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v16, La/n12;->a:La/n12;

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/16 v18, 0x5d8

    .line 94
    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    const-string v13, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY"

    .line 98
    .line 99
    const/4 v14, 0x0

    .line 100
    const/4 v15, 0x0

    .line 101
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v1

    .line 120
    :cond_2
    instance-of v3, v0, La/aid0;

    .line 121
    .line 122
    if-eqz v3, :cond_3

    .line 123
    .line 124
    invoke-static {v2}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :cond_3
    instance-of v3, v0, La/bid0;

    .line 130
    .line 131
    if-eqz v3, :cond_5

    .line 132
    .line 133
    check-cast v0, La/bid0;

    .line 134
    .line 135
    iget-boolean v0, v0, La/bid0;->a:Z

    .line 136
    .line 137
    sget-object v1, La/xhd0;->S1:La/fl70;

    .line 138
    .line 139
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v1, v1, La/m3r;->d:Landroidx/core/widget/ContentLoadingProgressBar;

    .line 144
    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_4
    const/16 v4, 0x8

    .line 149
    .line 150
    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_1

    .line 154
    .line 155
    :cond_5
    instance-of v3, v0, La/gid0;

    .line 156
    .line 157
    if-eqz v3, :cond_6

    .line 158
    .line 159
    check-cast v0, La/gid0;

    .line 160
    .line 161
    iget-object v0, v0, La/gid0;->a:Ljava/lang/String;

    .line 162
    .line 163
    sget-object v1, La/xhd0;->S1:La/fl70;

    .line 164
    .line 165
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iget-object v1, v1, La/m3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v0, v0, La/m3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_1

    .line 185
    .line 186
    :cond_6
    instance-of v3, v0, La/eid0;

    .line 187
    .line 188
    if-eqz v3, :cond_8

    .line 189
    .line 190
    check-cast v0, La/eid0;

    .line 191
    .line 192
    iget-object v9, v0, La/eid0;->a:Ljava/lang/String;

    .line 193
    .line 194
    sget-object v0, La/xhd0;->S1:La/fl70;

    .line 195
    .line 196
    iget-object v0, v2, La/xhd0;->L1:La/ii;

    .line 197
    .line 198
    if-eqz v0, :cond_7

    .line 199
    .line 200
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 201
    .line 202
    const v1, 0x7f1307bb

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object v16, La/n12;->a:La/n12;

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/16 v18, 0x5d8

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    const/4 v12, 0x0

    .line 224
    const-string v13, "TOKEN_EXPIRED_ERROR_KEY"

    .line 225
    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_1

    .line 242
    .line 243
    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v1

    .line 247
    :cond_8
    instance-of v3, v0, La/cid0;

    .line 248
    .line 249
    if-eqz v3, :cond_a

    .line 250
    .line 251
    sget-object v0, La/xhd0;->S1:La/fl70;

    .line 252
    .line 253
    iget-object v0, v2, La/xhd0;->L1:La/ii;

    .line 254
    .line 255
    if-eqz v0, :cond_9

    .line 256
    .line 257
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 258
    .line 259
    const v1, 0x7f130dca

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    const v1, 0x7f130437

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    sget-object v16, La/n12;->b:La/n12;

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const/16 v18, 0x5f8

    .line 285
    .line 286
    const/4 v11, 0x0

    .line 287
    const/4 v12, 0x0

    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    const/4 v15, 0x0

    .line 291
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 302
    .line 303
    .line 304
    goto :goto_1

    .line 305
    :cond_9
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v1

    .line 309
    :cond_a
    instance-of v0, v0, La/did0;

    .line 310
    .line 311
    if-eqz v0, :cond_c

    .line 312
    .line 313
    sget-object v0, La/xhd0;->S1:La/fl70;

    .line 314
    .line 315
    iget-object v0, v2, La/xhd0;->L1:La/ii;

    .line 316
    .line 317
    if-eqz v0, :cond_b

    .line 318
    .line 319
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 320
    .line 321
    const v1, 0x7f1303fb

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    const v1, 0x7f13047e

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    const v1, 0x7f130a86

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    const v1, 0x7f13032f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v10

    .line 352
    sget-object v15, La/n12;->b:La/n12;

    .line 353
    .line 354
    const/16 v16, 0x0

    .line 355
    .line 356
    const/16 v17, 0x5d0

    .line 357
    .line 358
    const/4 v11, 0x0

    .line 359
    const-string v12, "REQUEST_PROCESS_INTERRUPTION_KEY"

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const/4 v14, 0x0

    .line 363
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 374
    .line 375
    .line 376
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_b
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v1

    .line 383
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 384
    .line 385
    .line 386
    :goto_2
    return-object v1

    .line 387
    :pswitch_0
    check-cast v0, La/iid0;

    .line 388
    .line 389
    sget-object v1, La/wne;->a:La/wne;

    .line 390
    .line 391
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    sget-object v1, La/xhd0;->S1:La/fl70;

    .line 395
    .line 396
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    iget-object v1, v1, La/m3r;->f:Lcom/google/android/material/textview/MaterialTextView;

    .line 401
    .line 402
    iget-object v3, v0, La/iid0;->a:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, La/xhd0;->G0()La/m3r;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    iget-object v1, v1, La/m3r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 412
    .line 413
    iget-boolean v0, v0, La/iid0;->c:Z

    .line 414
    .line 415
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 416
    .line 417
    .line 418
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
