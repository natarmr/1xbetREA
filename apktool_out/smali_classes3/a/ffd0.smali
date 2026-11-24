.class public final La/ffd0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/gfd0;


# direct methods
.method public synthetic constructor <init>(La/gfd0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ffd0;->i:B

    iput-object p1, p0, La/ffd0;->k:La/gfd0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ffd0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ffd0;->k:La/gfd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ffd0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ffd0;-><init>(La/gfd0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ffd0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ffd0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ffd0;-><init>(La/gfd0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ffd0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ffd0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ffd0;-><init>(La/gfd0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ffd0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ffd0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/yfd0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ffd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ffd0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ffd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/xfd0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ffd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ffd0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ffd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/mfd0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ffd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ffd0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ffd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/ffd0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/ffd0;->k:La/gfd0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x8

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/ffd0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/yfd0;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/gfd0;->S1:La/mi70;

    .line 25
    .line 26
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v1, v1, La/k3r;->g:Lcom/google/android/material/textview/MaterialTextView;

    .line 31
    .line 32
    iget-object v2, v0, La/yfd0;->b:Ljava/lang/String;

    .line 33
    .line 34
    const v4, 0x7f1304cf

    .line 35
    .line 36
    .line 37
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v3, v4, v7}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v4}, La/etm0;->m(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, La/k3r;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 60
    .line 61
    iget-boolean v0, v0, La/yfd0;->c:Z

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    move v5, v6

    .line 66
    :cond_0
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    iget-object v1, v0, La/ffd0;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/xfd0;

    .line 75
    .line 76
    sget-object v3, La/wne;->a:La/wne;

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    if-eqz v1, :cond_d

    .line 82
    .line 83
    instance-of v3, v1, La/nfd0;

    .line 84
    .line 85
    iget-object v9, v0, La/ffd0;->k:La/gfd0;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 90
    .line 91
    invoke-virtual {v9}, La/gfd0;->H0()La/k3r;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v0, v0, La/k3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 96
    .line 97
    const-string v1, ""

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v9}, La/gfd0;->H0()La/k3r;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v0, v0, La/k3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 107
    .line 108
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_1
    instance-of v0, v1, La/ofd0;

    .line 114
    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    invoke-static {v9}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_1

    .line 121
    .line 122
    :cond_2
    instance-of v0, v1, La/vfd0;

    .line 123
    .line 124
    const v3, 0x7f130e5d

    .line 125
    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 130
    .line 131
    invoke-virtual {v9}, La/gfd0;->G0()La/ii;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 136
    .line 137
    const v1, 0x7f130162

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    const v1, 0x7f13108b

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    sget-object v19, La/n12;->a:La/n12;

    .line 159
    .line 160
    const/16 v20, 0x0

    .line 161
    .line 162
    const/16 v21, 0x5d8

    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    const-string v16, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY"

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    const/16 v18, 0x0

    .line 171
    .line 172
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_3
    instance-of v0, v1, La/sfd0;

    .line 188
    .line 189
    if-eqz v0, :cond_4

    .line 190
    .line 191
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 192
    .line 193
    invoke-virtual {v9}, La/gfd0;->G0()La/ii;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 198
    .line 199
    const v1, 0x7f1303fb

    .line 200
    .line 201
    .line 202
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    const v1, 0x7f13047e

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    const v1, 0x7f130a86

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    const v1, 0x7f13032f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    sget-object v19, La/n12;->a:La/n12;

    .line 231
    .line 232
    const/16 v20, 0x0

    .line 233
    .line 234
    const/16 v21, 0x5d0

    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    const-string v16, "REQUEST_PROCESS_INTERRUPTION_KEY"

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :cond_4
    instance-of v0, v1, La/pfd0;

    .line 259
    .line 260
    if-eqz v0, :cond_6

    .line 261
    .line 262
    check-cast v1, La/pfd0;

    .line 263
    .line 264
    iget-boolean v0, v1, La/pfd0;->a:Z

    .line 265
    .line 266
    sget-object v1, La/gfd0;->S1:La/mi70;

    .line 267
    .line 268
    invoke-virtual {v9}, La/gfd0;->H0()La/k3r;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    iget-object v1, v1, La/k3r;->d:Landroidx/core/widget/ContentLoadingProgressBar;

    .line 273
    .line 274
    if-eqz v0, :cond_5

    .line 275
    .line 276
    move v5, v6

    .line 277
    :cond_5
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :cond_6
    instance-of v0, v1, La/tfd0;

    .line 283
    .line 284
    if-eqz v0, :cond_8

    .line 285
    .line 286
    iget-object v7, v9, La/gfd0;->M1:La/wdk0;

    .line 287
    .line 288
    if-eqz v7, :cond_7

    .line 289
    .line 290
    new-instance v8, La/xdk0;

    .line 291
    .line 292
    sget-object v11, La/rek0;->b:La/rek0;

    .line 293
    .line 294
    check-cast v1, La/tfd0;

    .line 295
    .line 296
    iget-object v12, v1, La/tfd0;->a:Ljava/lang/String;

    .line 297
    .line 298
    const/16 v16, 0x0

    .line 299
    .line 300
    const/16 v17, 0x7c

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    move-object v10, v8

    .line 306
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 307
    .line 308
    .line 309
    const/16 v14, 0x3fc

    .line 310
    .line 311
    const/4 v10, 0x0

    .line 312
    const/4 v11, 0x0

    .line 313
    const/4 v12, 0x0

    .line 314
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 315
    .line 316
    .line 317
    goto/16 :goto_1

    .line 318
    .line 319
    :cond_7
    const-string v0, "snackbarManager"

    .line 320
    .line 321
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v4

    .line 325
    :cond_8
    instance-of v0, v1, La/rfd0;

    .line 326
    .line 327
    if-eqz v0, :cond_a

    .line 328
    .line 329
    check-cast v1, La/rfd0;

    .line 330
    .line 331
    iget-object v0, v1, La/rfd0;->a:Ljava/lang/String;

    .line 332
    .line 333
    sget-object v1, La/gfd0;->S1:La/mi70;

    .line 334
    .line 335
    invoke-virtual {v9}, La/gfd0;->H0()La/k3r;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    iget-object v1, v1, La/k3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 340
    .line 341
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v9}, La/gfd0;->H0()La/k3r;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v1, v1, La/k3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

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
    goto :goto_0

    .line 357
    :cond_9
    move v2, v6

    .line 358
    :goto_0
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :cond_a
    instance-of v0, v1, La/qfd0;

    .line 364
    .line 365
    const v2, 0x7f1307bb

    .line 366
    .line 367
    .line 368
    if-eqz v0, :cond_b

    .line 369
    .line 370
    check-cast v1, La/qfd0;

    .line 371
    .line 372
    iget-object v12, v1, La/qfd0;->a:Ljava/lang/String;

    .line 373
    .line 374
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 375
    .line 376
    invoke-virtual {v9}, La/gfd0;->G0()La/ii;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 381
    .line 382
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v13

    .line 390
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    sget-object v19, La/n12;->b:La/n12;

    .line 394
    .line 395
    const/16 v20, 0x0

    .line 396
    .line 397
    const/16 v21, 0x5f8

    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 418
    .line 419
    .line 420
    goto :goto_1

    .line 421
    :cond_b
    instance-of v0, v1, La/wfd0;

    .line 422
    .line 423
    if-eqz v0, :cond_c

    .line 424
    .line 425
    check-cast v1, La/wfd0;

    .line 426
    .line 427
    iget-object v12, v1, La/wfd0;->a:Ljava/lang/String;

    .line 428
    .line 429
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 430
    .line 431
    invoke-virtual {v9}, La/gfd0;->G0()La/ii;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 436
    .line 437
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v11

    .line 441
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v13

    .line 445
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    sget-object v19, La/n12;->b:La/n12;

    .line 449
    .line 450
    const/16 v20, 0x0

    .line 451
    .line 452
    const/16 v21, 0x5d8

    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const/4 v15, 0x0

    .line 456
    const-string v16, "REQUEST_TOKEN_EXPIRED_KEY"

    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    const/16 v18, 0x0

    .line 461
    .line 462
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 473
    .line 474
    .line 475
    goto :goto_1

    .line 476
    :cond_c
    instance-of v0, v1, La/ufd0;

    .line 477
    .line 478
    if-eqz v0, :cond_d

    .line 479
    .line 480
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 481
    .line 482
    invoke-virtual {v9}, La/gfd0;->G0()La/ii;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 487
    .line 488
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    const v1, 0x7f13115d

    .line 493
    .line 494
    .line 495
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    sget-object v19, La/n12;->a:La/n12;

    .line 507
    .line 508
    const/16 v20, 0x0

    .line 509
    .line 510
    const/16 v21, 0x5d8

    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const/4 v15, 0x0

    .line 514
    const-string v16, "REQUEST_REQUEST_ERROR_KEY"

    .line 515
    .line 516
    const/16 v17, 0x0

    .line 517
    .line 518
    const/16 v18, 0x0

    .line 519
    .line 520
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 531
    .line 532
    .line 533
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    goto :goto_2

    .line 536
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 537
    .line 538
    .line 539
    :goto_2
    return-object v4

    .line 540
    :pswitch_1
    iget-object v0, v0, La/ffd0;->j:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v0, La/mfd0;

    .line 543
    .line 544
    sget-object v1, La/wne;->a:La/wne;

    .line 545
    .line 546
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    if-eqz v0, :cond_10

    .line 550
    .line 551
    instance-of v1, v0, La/lfd0;

    .line 552
    .line 553
    if-eqz v1, :cond_e

    .line 554
    .line 555
    sget-object v1, La/gfd0;->S1:La/mi70;

    .line 556
    .line 557
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    iget-object v1, v1, La/k3r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 562
    .line 563
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 564
    .line 565
    .line 566
    check-cast v0, La/lfd0;

    .line 567
    .line 568
    iget-wide v0, v0, La/lfd0;->a:J

    .line 569
    .line 570
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 571
    .line 572
    const-wide/16 v4, 0x3c

    .line 573
    .line 574
    div-long v7, v0, v4

    .line 575
    .line 576
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    rem-long/2addr v0, v4

    .line 581
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    filled-new-array {v7, v0}, [Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    const/4 v1, 0x2

    .line 590
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    const-string v1, "%02d:%02d"

    .line 595
    .line 596
    invoke-static {v2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    const v1, 0x7f13118b

    .line 601
    .line 602
    .line 603
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v3, v1, v2}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    iget-object v2, v2, La/k3r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 619
    .line 620
    invoke-static {v0, v1}, La/etm0;->m(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    iget-object v0, v0, La/k3r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 632
    .line 633
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 634
    .line 635
    .line 636
    goto :goto_3

    .line 637
    :cond_e
    instance-of v1, v0, La/jfd0;

    .line 638
    .line 639
    if-eqz v1, :cond_f

    .line 640
    .line 641
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 642
    .line 643
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    iget-object v0, v0, La/k3r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 648
    .line 649
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    iget-object v0, v0, La/k3r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 657
    .line 658
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 659
    .line 660
    .line 661
    goto :goto_3

    .line 662
    :cond_f
    instance-of v0, v0, La/kfd0;

    .line 663
    .line 664
    if-eqz v0, :cond_10

    .line 665
    .line 666
    sget-object v0, La/gfd0;->S1:La/mi70;

    .line 667
    .line 668
    invoke-virtual {v3}, La/gfd0;->H0()La/k3r;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    iget-object v0, v0, La/k3r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 673
    .line 674
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 675
    .line 676
    .line 677
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 678
    .line 679
    goto :goto_4

    .line 680
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 681
    .line 682
    .line 683
    :goto_4
    return-object v4

    .line 684
    nop

    .line 685
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
