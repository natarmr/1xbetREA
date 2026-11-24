.class public final La/wyd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xyd;


# direct methods
.method public synthetic constructor <init>(La/xyd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wyd;->i:B

    iput-object p1, p0, La/wyd;->k:La/xyd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wyd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wyd;->k:La/xyd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wyd;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wyd;-><init>(La/xyd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wyd;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wyd;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wyd;-><init>(La/xyd;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wyd;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/wyd;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/dzd;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wyd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wyd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wyd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ezd;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wyd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wyd;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wyd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/wyd;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/wyd;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/dzd;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_9

    .line 19
    .line 20
    instance-of v3, v1, La/yyd;

    .line 21
    .line 22
    iget-object v6, v0, La/wyd;->k:La/xyd;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    iget-object v0, v6, La/xyd;->M1:La/gl5;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    check-cast v1, La/yyd;

    .line 31
    .line 32
    iget-object v0, v1, La/yyd;->a:La/d7a;

    .line 33
    .line 34
    iget-object v1, v1, La/yyd;->b:Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 37
    .line 38
    invoke-static {v6, v2, v0, v1}, La/gl5;->p(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v2

    .line 49
    :cond_1
    instance-of v0, v1, La/zyd;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v4, v6, La/xyd;->O1:La/wdk0;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    new-instance v5, La/xdk0;

    .line 58
    .line 59
    sget-object v8, La/rek0;->b:La/rek0;

    .line 60
    .line 61
    check-cast v1, La/zyd;

    .line 62
    .line 63
    iget-object v9, v1, La/zyd;->a:Ljava/lang/String;

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    const/16 v14, 0x7c

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    move-object v7, v5

    .line 72
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 73
    .line 74
    .line 75
    new-instance v10, Ljava/lang/Integer;

    .line 76
    .line 77
    const v0, 0x7f0706f8

    .line 78
    .line 79
    .line 80
    invoke-direct {v10, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 81
    .line 82
    .line 83
    const/16 v11, 0x1fc

    .line 84
    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 89
    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_2
    const-string v0, "snackbarManager"

    .line 94
    .line 95
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v2

    .line 99
    :cond_3
    instance-of v0, v1, La/czd;

    .line 100
    .line 101
    const-string v3, "actionDialogManager"

    .line 102
    .line 103
    const v4, 0x7f130e5d

    .line 104
    .line 105
    .line 106
    const v5, 0x7f1307bb

    .line 107
    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    check-cast v1, La/czd;

    .line 112
    .line 113
    iget-object v9, v1, La/czd;->a:Ljava/lang/String;

    .line 114
    .line 115
    sget-object v0, La/xyd;->U1:La/kud;

    .line 116
    .line 117
    iget-object v0, v6, La/xyd;->N1:La/ii;

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 122
    .line 123
    invoke-virtual {v6, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    sget-object v16, La/n12;->a:La/n12;

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x5d8

    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const-string v13, "TOKEN_EXPIRED_ERROR_KEY"

    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v2

    .line 165
    :cond_5
    instance-of v0, v1, La/azd;

    .line 166
    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    sget-object v0, La/xyd;->U1:La/kud;

    .line 170
    .line 171
    iget-object v0, v6, La/xyd;->N1:La/ii;

    .line 172
    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 176
    .line 177
    const v1, 0x7f130162

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    const v1, 0x7f13047e

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    const v1, 0x7f13032f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    const v1, 0x7f130a86

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    sget-object v16, La/n12;->a:La/n12;

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const/16 v18, 0x5d0

    .line 213
    .line 214
    const/4 v12, 0x0

    .line 215
    const-string v13, "REQUEST_BACK_DIALOG_KEY"

    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 230
    .line 231
    .line 232
    goto :goto_0

    .line 233
    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v2

    .line 237
    :cond_7
    instance-of v0, v1, La/bzd;

    .line 238
    .line 239
    if-eqz v0, :cond_9

    .line 240
    .line 241
    sget-object v0, La/xyd;->U1:La/kud;

    .line 242
    .line 243
    iget-object v0, v6, La/xyd;->N1:La/ii;

    .line 244
    .line 245
    if-eqz v0, :cond_8

    .line 246
    .line 247
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 248
    .line 249
    invoke-virtual {v6, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    const v1, 0x7f13115d

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    sget-object v16, La/n12;->b:La/n12;

    .line 268
    .line 269
    const/16 v17, 0x0

    .line 270
    .line 271
    const/16 v18, 0x5d8

    .line 272
    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v12, 0x0

    .line 275
    const-string v13, "REQUEST_REQUEST_ERROR_KEY"

    .line 276
    .line 277
    const/4 v14, 0x0

    .line 278
    const/4 v15, 0x0

    .line 279
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 290
    .line 291
    .line 292
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v2

    .line 299
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 300
    .line 301
    .line 302
    :goto_1
    return-object v2

    .line 303
    :pswitch_0
    iget-object v1, v0, La/wyd;->j:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v1, La/ezd;

    .line 306
    .line 307
    sget-object v2, La/wne;->a:La/wne;

    .line 308
    .line 309
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    sget-object v2, La/xyd;->U1:La/kud;

    .line 313
    .line 314
    iget-object v0, v0, La/wyd;->k:La/xyd;

    .line 315
    .line 316
    invoke-virtual {v0}, La/xyd;->G0()La/q4r;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    iget-object v2, v2, La/q4r;->d:Lcom/google/android/material/textview/MaterialTextView;

    .line 321
    .line 322
    iget-object v3, v1, La/ezd;->a:Ljava/lang/String;

    .line 323
    .line 324
    const v4, 0x7f130302

    .line 325
    .line 326
    .line 327
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v0, v4, v5}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-static {v3, v4}, La/z1x;->G(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, La/xyd;->G0()La/q4r;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    iget-object v0, v0, La/q4r;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 350
    .line 351
    iget-object v1, v1, La/ezd;->c:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 354
    .line 355
    .line 356
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
