.class public final La/exf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hxf0;


# direct methods
.method public synthetic constructor <init>(La/hxf0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/exf0;->i:B

    iput-object p1, p0, La/exf0;->k:La/hxf0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/exf0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/exf0;->k:La/hxf0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/exf0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/exf0;-><init>(La/hxf0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/exf0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/exf0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/exf0;-><init>(La/hxf0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/exf0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/exf0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/pxf0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/exf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/exf0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/exf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/e190;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/exf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/exf0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/exf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/exf0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/exf0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/pxf0;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    if-eqz v1, :cond_7

    .line 19
    .line 20
    instance-of v3, v1, La/mxf0;

    .line 21
    .line 22
    iget-object v6, v0, La/exf0;->k:La/hxf0;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v1, La/mxf0;

    .line 27
    .line 28
    iget-object v0, v1, La/mxf0;->a:La/d7a;

    .line 29
    .line 30
    sget-object v1, La/hxf0;->V1:La/zie0;

    .line 31
    .line 32
    iget-object v1, v6, La/hxf0;->M1:La/gl5;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const v1, 0x7f13117d

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 47
    .line 48
    invoke-static {v6, v2, v0, v1}, La/gl5;->p(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v2

    .line 59
    :cond_1
    instance-of v0, v1, La/nxf0;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    check-cast v1, La/nxf0;

    .line 64
    .line 65
    iget-object v9, v1, La/nxf0;->a:Ljava/lang/String;

    .line 66
    .line 67
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 68
    .line 69
    iget-object v4, v6, La/hxf0;->O1:La/wdk0;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    new-instance v5, La/xdk0;

    .line 74
    .line 75
    sget-object v8, La/rek0;->b:La/rek0;

    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    const/16 v14, 0x7c

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    move-object v7, v5

    .line 84
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 85
    .line 86
    .line 87
    const/16 v11, 0x3dc

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 93
    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_2
    const-string v0, "snackbarManager"

    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v2

    .line 103
    :cond_3
    instance-of v0, v1, La/kxf0;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 108
    .line 109
    invoke-virtual {v6}, La/hxf0;->G0()La/h4r;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v0, v0, La/h4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 114
    .line 115
    const/16 v2, 0x8

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, La/hxf0;->G0()La/h4r;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v0, v0, La/h4r;->e:Landroid/widget/TextView;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6}, La/hxf0;->G0()La/h4r;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v0, v0, La/h4r;->b:Landroid/widget/TextView;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, La/hxf0;->G0()La/h4r;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v0, v0, La/h4r;->c:Landroid/widget/TextView;

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, La/hxf0;->G0()La/h4r;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v0, v0, La/h4r;->c:Landroid/widget/TextView;

    .line 153
    .line 154
    check-cast v1, La/kxf0;

    .line 155
    .line 156
    iget-object v2, v1, La/kxf0;->b:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v1, v1, La/kxf0;->a:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v2, v1}, La/z1x;->G(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_4
    instance-of v0, v1, La/oxf0;

    .line 169
    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 173
    .line 174
    iget-object v0, v6, La/hxf0;->N1:La/ii;

    .line 175
    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 179
    .line 180
    const v1, 0x7f1307bb

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    const v1, 0x7f13115d

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    const v1, 0x7f130e5d

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    sget-object v16, La/n12;->b:La/n12;

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const/16 v18, 0x5d8

    .line 209
    .line 210
    const/4 v11, 0x0

    .line 211
    const/4 v12, 0x0

    .line 212
    const-string v13, "REQUEST_REQUEST_ERROR_KEY"

    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const/4 v15, 0x0

    .line 216
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_5
    const-string v0, "actionDialogManager"

    .line 231
    .line 232
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v2

    .line 236
    :cond_6
    instance-of v0, v1, La/lxf0;

    .line 237
    .line 238
    if-eqz v0, :cond_7

    .line 239
    .line 240
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 241
    .line 242
    invoke-virtual {v6}, La/hxf0;->G0()La/h4r;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iget-object v0, v0, La/h4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 247
    .line 248
    check-cast v1, La/lxf0;

    .line 249
    .line 250
    iget-object v1, v1, La/lxf0;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 259
    .line 260
    .line 261
    :goto_1
    return-object v2

    .line 262
    :pswitch_0
    iget-object v1, v0, La/exf0;->j:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, La/e190;

    .line 265
    .line 266
    sget-object v3, La/wne;->a:La/wne;

    .line 267
    .line 268
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    if-eqz v1, :cond_9

    .line 272
    .line 273
    sget-object v3, La/hxf0;->V1:La/zie0;

    .line 274
    .line 275
    iget-object v0, v0, La/exf0;->k:La/hxf0;

    .line 276
    .line 277
    invoke-virtual {v0}, La/hxf0;->H0()La/sxf0;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v0}, La/hxf0;->G0()La/h4r;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iget-object v0, v0, La/h4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 286
    .line 287
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iget-object v1, v1, La/e190;->a:La/we50;

    .line 296
    .line 297
    iget-object v4, v3, La/sxf0;->v:La/bby;

    .line 298
    .line 299
    const/4 v5, 0x1

    .line 300
    if-eqz v4, :cond_8

    .line 301
    .line 302
    invoke-interface {v4}, La/bby;->isActive()Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-ne v4, v5, :cond_8

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_8
    iget-object v4, v3, La/sxf0;->s:La/p7m0;

    .line 310
    .line 311
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v2, v6}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    iget-object v4, v3, La/sxf0;->l:La/mne;

    .line 324
    .line 325
    iget-object v10, v4, La/mne;->b:La/dvj;

    .line 326
    .line 327
    new-instance v8, La/ixf0;

    .line 328
    .line 329
    invoke-direct {v8, v3, v5}, La/ixf0;-><init>(La/sxf0;B)V

    .line 330
    .line 331
    .line 332
    new-instance v9, La/tie0;

    .line 333
    .line 334
    const/16 v4, 0x1a

    .line 335
    .line 336
    invoke-direct {v9, v3, v4}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 337
    .line 338
    .line 339
    new-instance v11, La/rxf0;

    .line 340
    .line 341
    invoke-direct {v11, v3, v0, v1, v2}, La/rxf0;-><init>(La/sxf0;Ljava/lang/String;La/we50;La/yje;)V

    .line 342
    .line 343
    .line 344
    const/16 v12, 0x8

    .line 345
    .line 346
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iput-object v0, v3, La/sxf0;->v:La/bby;

    .line 351
    .line 352
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 356
    .line 357
    .line 358
    :goto_3
    return-object v2

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
