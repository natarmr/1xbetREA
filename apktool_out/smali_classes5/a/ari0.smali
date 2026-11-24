.class public final La/ari0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bri0;


# direct methods
.method public synthetic constructor <init>(La/bri0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ari0;->i:B

    iput-object p1, p0, La/ari0;->k:La/bri0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ari0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ari0;->k:La/bri0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ari0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ari0;-><init>(La/bri0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ari0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ari0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ari0;-><init>(La/bri0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ari0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ari0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ori0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ari0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ari0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ari0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/rri0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ari0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ari0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ari0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/ari0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/ari0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/ori0;

    .line 13
    .line 14
    sget-object v4, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v4, La/dri0;->a:La/dri0;

    .line 20
    .line 21
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget-object v7, v0, La/ari0;->k:La/bri0;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 30
    .line 31
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, La/r4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, La/r4r;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/r4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, La/r4r;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_0
    sget-object v0, La/iri0;->a:La/iri0;

    .line 72
    .line 73
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const-string v2, "actionDialogManager"

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 82
    .line 83
    iget-object v0, v7, La/bri0;->N1:La/ii;

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 88
    .line 89
    const v1, 0x7f130162

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    const v1, 0x7f13047e

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    const v1, 0x7f130a86

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const v1, 0x7f13032f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    sget-object v17, La/n12;->a:La/n12;

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const/16 v19, 0x5d0

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const-string v14, "REQUEST_BACK_DIALOG_KEY"

    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v3

    .line 151
    :cond_2
    sget-object v0, La/lri0;->a:La/lri0;

    .line 152
    .line 153
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    const-string v4, "snackbarManager"

    .line 158
    .line 159
    const v5, 0x7f130f10

    .line 160
    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 165
    .line 166
    iget-object v0, v7, La/bri0;->O1:La/wdk0;

    .line 167
    .line 168
    if-eqz v0, :cond_3

    .line 169
    .line 170
    new-instance v6, La/xdk0;

    .line 171
    .line 172
    sget-object v9, La/qek0;->a:La/qek0;

    .line 173
    .line 174
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    const/4 v14, 0x0

    .line 182
    const/16 v15, 0x7c

    .line 183
    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x0

    .line 187
    move-object v8, v6

    .line 188
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 189
    .line 190
    .line 191
    const/16 v12, 0x3fc

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    const/4 v9, 0x0

    .line 195
    const/4 v10, 0x0

    .line 196
    move-object v5, v0

    .line 197
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v3

    .line 206
    :cond_4
    sget-object v0, La/mri0;->a:La/mri0;

    .line 207
    .line 208
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_6

    .line 213
    .line 214
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 215
    .line 216
    iget-object v0, v7, La/bri0;->N1:La/ii;

    .line 217
    .line 218
    if-eqz v0, :cond_5

    .line 219
    .line 220
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 221
    .line 222
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    const v1, 0x7f130f11

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    const v1, 0x7f130c92

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    sget-object v17, La/n12;->a:La/n12;

    .line 244
    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    const/16 v19, 0x1d8

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    const/4 v13, 0x0

    .line 251
    const-string v14, "REQUEST_PASSWORD_CHANGED_AUTH_DIALOG_KEY"

    .line 252
    .line 253
    const/4 v15, 0x0

    .line 254
    const/16 v16, 0x0

    .line 255
    .line 256
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v3

    .line 275
    :cond_6
    sget-object v0, La/fri0;->a:La/fri0;

    .line 276
    .line 277
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    const/4 v5, 0x1

    .line 282
    if-eqz v0, :cond_7

    .line 283
    .line 284
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 285
    .line 286
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iget-object v0, v0, La/r4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 291
    .line 292
    const v1, 0x7f130f0e

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v0, v0, La/r4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 307
    .line 308
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_7
    sget-object v0, La/gri0;->a:La/gri0;

    .line 314
    .line 315
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_8

    .line 320
    .line 321
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 322
    .line 323
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iget-object v0, v0, La/r4r;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 328
    .line 329
    const v1, 0x7f130f18

    .line 330
    .line 331
    .line 332
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v7}, La/bri0;->G0()La/r4r;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iget-object v0, v0, La/r4r;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 344
    .line 345
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :cond_8
    instance-of v0, v1, La/kri0;

    .line 351
    .line 352
    if-eqz v0, :cond_a

    .line 353
    .line 354
    iget-object v5, v7, La/bri0;->O1:La/wdk0;

    .line 355
    .line 356
    if-eqz v5, :cond_9

    .line 357
    .line 358
    new-instance v6, La/xdk0;

    .line 359
    .line 360
    sget-object v9, La/rek0;->b:La/rek0;

    .line 361
    .line 362
    check-cast v1, La/kri0;

    .line 363
    .line 364
    iget-object v10, v1, La/kri0;->a:Ljava/lang/String;

    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const/16 v15, 0x7c

    .line 368
    .line 369
    const/4 v11, 0x0

    .line 370
    const/4 v12, 0x0

    .line 371
    const/4 v13, 0x0

    .line 372
    move-object v8, v6

    .line 373
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 374
    .line 375
    .line 376
    const/16 v12, 0x3fc

    .line 377
    .line 378
    const/4 v8, 0x0

    .line 379
    const/4 v9, 0x0

    .line 380
    const/4 v10, 0x0

    .line 381
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 382
    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v3

    .line 390
    :cond_a
    instance-of v0, v1, La/jri0;

    .line 391
    .line 392
    const v4, 0x7f130e5d

    .line 393
    .line 394
    .line 395
    const v5, 0x7f1307bb

    .line 396
    .line 397
    .line 398
    if-eqz v0, :cond_c

    .line 399
    .line 400
    check-cast v1, La/jri0;

    .line 401
    .line 402
    iget-object v10, v1, La/jri0;->a:Ljava/lang/String;

    .line 403
    .line 404
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 405
    .line 406
    iget-object v0, v7, La/bri0;->N1:La/ii;

    .line 407
    .line 408
    if-eqz v0, :cond_b

    .line 409
    .line 410
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 411
    .line 412
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    invoke-virtual {v7, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v11

    .line 420
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    sget-object v17, La/n12;->b:La/n12;

    .line 424
    .line 425
    const/16 v18, 0x0

    .line 426
    .line 427
    const/16 v19, 0x5d8

    .line 428
    .line 429
    const/4 v12, 0x0

    .line 430
    const/4 v13, 0x0

    .line 431
    const-string v14, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY"

    .line 432
    .line 433
    const/4 v15, 0x0

    .line 434
    const/16 v16, 0x0

    .line 435
    .line 436
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 447
    .line 448
    .line 449
    goto :goto_0

    .line 450
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    throw v3

    .line 454
    :cond_c
    instance-of v0, v1, La/nri0;

    .line 455
    .line 456
    if-eqz v0, :cond_e

    .line 457
    .line 458
    sget-object v0, La/bri0;->V1:La/lme0;

    .line 459
    .line 460
    iget-object v0, v7, La/bri0;->N1:La/ii;

    .line 461
    .line 462
    if-eqz v0, :cond_d

    .line 463
    .line 464
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 465
    .line 466
    invoke-virtual {v7, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    const v1, 0x7f13115d

    .line 471
    .line 472
    .line 473
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    invoke-virtual {v7, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v11

    .line 481
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    sget-object v17, La/n12;->b:La/n12;

    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    const/16 v19, 0x5d8

    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    const/4 v13, 0x0

    .line 492
    const-string v14, "REQUEST_REQUEST_ERROR_KEY"

    .line 493
    .line 494
    const/4 v15, 0x0

    .line 495
    const/16 v16, 0x0

    .line 496
    .line 497
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 508
    .line 509
    .line 510
    goto :goto_0

    .line 511
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v3

    .line 515
    :cond_e
    instance-of v0, v1, La/eri0;

    .line 516
    .line 517
    if-eqz v0, :cond_f

    .line 518
    .line 519
    invoke-static {v7}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 520
    .line 521
    .line 522
    goto :goto_0

    .line 523
    :cond_f
    instance-of v0, v1, La/hri0;

    .line 524
    .line 525
    if-eqz v0, :cond_10

    .line 526
    .line 527
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 532
    .line 533
    new-instance v2, Lkotlin/Pair;

    .line 534
    .line 535
    const-string v3, "SHOW_AUTHORIZATION"

    .line 536
    .line 537
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-static {v0, v1}, La/j120;->g0(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 549
    .line 550
    .line 551
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    goto :goto_1

    .line 554
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 555
    .line 556
    .line 557
    :goto_1
    return-object v3

    .line 558
    :pswitch_0
    iget-object v1, v0, La/ari0;->j:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v1, La/rri0;

    .line 561
    .line 562
    sget-object v4, La/wne;->a:La/wne;

    .line 563
    .line 564
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    if-eqz v1, :cond_13

    .line 568
    .line 569
    instance-of v4, v1, La/qri0;

    .line 570
    .line 571
    iget-object v0, v0, La/ari0;->k:La/bri0;

    .line 572
    .line 573
    if-eqz v4, :cond_11

    .line 574
    .line 575
    sget-object v1, La/bri0;->V1:La/lme0;

    .line 576
    .line 577
    invoke-virtual {v0}, La/bri0;->G0()La/r4r;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    iget-object v0, v0, La/r4r;->g:Landroid/widget/FrameLayout;

    .line 582
    .line 583
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 584
    .line 585
    .line 586
    goto :goto_3

    .line 587
    :cond_11
    instance-of v4, v1, La/pri0;

    .line 588
    .line 589
    if-eqz v4, :cond_13

    .line 590
    .line 591
    sget-object v3, La/bri0;->V1:La/lme0;

    .line 592
    .line 593
    invoke-virtual {v0}, La/bri0;->G0()La/r4r;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    iget-object v3, v3, La/r4r;->g:Landroid/widget/FrameLayout;

    .line 598
    .line 599
    const/16 v4, 0x8

    .line 600
    .line 601
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v0}, La/bri0;->G0()La/r4r;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    iget-object v3, v3, La/r4r;->f:Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 609
    .line 610
    check-cast v1, La/pri0;

    .line 611
    .line 612
    iget-boolean v5, v1, La/pri0;->a:Z

    .line 613
    .line 614
    if-eqz v5, :cond_12

    .line 615
    .line 616
    goto :goto_2

    .line 617
    :cond_12
    move v2, v4

    .line 618
    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0}, La/bri0;->G0()La/r4r;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    iget-object v0, v0, La/r4r;->f:Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 626
    .line 627
    iget-object v1, v1, La/pri0;->b:Ljava/util/List;

    .line 628
    .line 629
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->setRequirements(Ljava/util/List;)V

    .line 630
    .line 631
    .line 632
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    goto :goto_4

    .line 635
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 636
    .line 637
    .line 638
    :goto_4
    return-object v3

    .line 639
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
