.class public final La/nir0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/pir0;


# direct methods
.method public synthetic constructor <init>(La/pir0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nir0;->i:B

    iput-object p1, p0, La/nir0;->k:La/pir0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nir0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nir0;->k:La/pir0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/nir0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/nir0;-><init>(La/pir0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/nir0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/nir0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/nir0;-><init>(La/pir0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/nir0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/nir0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/bjr0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nir0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nir0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nir0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/cjr0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/nir0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/nir0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/nir0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nir0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/nir0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/bjr0;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of v3, v1, La/tir0;

    .line 19
    .line 20
    iget-object v6, v0, La/nir0;->k:La/pir0;

    .line 21
    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    check-cast v1, La/tir0;

    .line 25
    .line 26
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 27
    .line 28
    iget-boolean v0, v1, La/tir0;->d:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget v0, La/usr0;->r2:I

    .line 33
    .line 34
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string v1, "TotoBetMakeBetBottomSheetDialog"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_0
    new-instance v2, La/usr0;

    .line 52
    .line 53
    invoke-direct {v2}, La/usr0;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_1
    sget-object v0, La/ikr0;->l2:La/m6m0;

    .line 62
    .line 63
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v3, v1, La/tir0;->a:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v4, v1, La/tir0;->b:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v1, v1, La/tir0;->c:Z

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v3, v4, v1}, La/m6m0;->m(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :cond_2
    sget-object v0, La/uir0;->a:La/uir0;

    .line 85
    .line 86
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const-string v3, "actionDialogManager"

    .line 91
    .line 92
    const v4, 0x7f13032f

    .line 93
    .line 94
    .line 95
    const v5, 0x7f130e5c

    .line 96
    .line 97
    .line 98
    const v7, 0x7f130162

    .line 99
    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 104
    .line 105
    iget-object v0, v6, La/pir0;->O1:La/ii;

    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 110
    .line 111
    invoke-virtual {v6, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    const v1, 0x7f130c8f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-virtual {v6, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    sget-object v17, La/n12;->b:La/n12;

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    const/16 v19, 0x5d0

    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    const-string v14, "SHOW_CHANGE_BALANCE_ACTION_DIALOG_KEY"

    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v2

    .line 164
    :cond_4
    sget-object v0, La/wir0;->a:La/wir0;

    .line 165
    .line 166
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    const v8, 0x7f130e5d

    .line 171
    .line 172
    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 176
    .line 177
    iget-object v0, v6, La/pir0;->O1:La/ii;

    .line 178
    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 182
    .line 183
    invoke-virtual {v6, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    const v1, 0x7f131619

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-virtual {v6, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    sget-object v18, La/n12;->b:La/n12;

    .line 206
    .line 207
    const/16 v19, 0x0

    .line 208
    .line 209
    const/16 v20, 0x5d0

    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const-string v15, "REQUEST_TOTO_CLEAR_DIALOG_KEY"

    .line 213
    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v2

    .line 237
    :cond_6
    sget-object v0, La/xir0;->a:La/xir0;

    .line 238
    .line 239
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_8

    .line 244
    .line 245
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 246
    .line 247
    iget-object v0, v6, La/pir0;->O1:La/ii;

    .line 248
    .line 249
    if-eqz v0, :cond_7

    .line 250
    .line 251
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 252
    .line 253
    const v1, 0x7f131616

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    const v1, 0x7f13163c

    .line 261
    .line 262
    .line 263
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-virtual {v6, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    sget-object v18, La/n12;->b:La/n12;

    .line 275
    .line 276
    const/16 v19, 0x0

    .line 277
    .line 278
    const/16 v20, 0x5f8

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const/4 v14, 0x0

    .line 282
    const/4 v15, 0x0

    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v2

    .line 306
    :cond_8
    instance-of v0, v1, La/zir0;

    .line 307
    .line 308
    if-eqz v0, :cond_a

    .line 309
    .line 310
    iget-object v4, v6, La/pir0;->P1:La/wdk0;

    .line 311
    .line 312
    if-eqz v4, :cond_9

    .line 313
    .line 314
    new-instance v5, La/xdk0;

    .line 315
    .line 316
    sget-object v8, La/rek0;->b:La/rek0;

    .line 317
    .line 318
    check-cast v1, La/zir0;

    .line 319
    .line 320
    iget-object v9, v1, La/zir0;->a:Ljava/lang/String;

    .line 321
    .line 322
    const/4 v13, 0x0

    .line 323
    const/16 v14, 0x7c

    .line 324
    .line 325
    const/4 v10, 0x0

    .line 326
    const/4 v11, 0x0

    .line 327
    const/4 v12, 0x0

    .line 328
    move-object v7, v5

    .line 329
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 330
    .line 331
    .line 332
    const/16 v11, 0x3fc

    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    const/4 v8, 0x0

    .line 336
    const/4 v9, 0x0

    .line 337
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 338
    .line 339
    .line 340
    goto/16 :goto_0

    .line 341
    .line 342
    :cond_9
    const-string v0, "snackbarManager"

    .line 343
    .line 344
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v2

    .line 348
    :cond_a
    instance-of v0, v1, La/sir0;

    .line 349
    .line 350
    if-eqz v0, :cond_c

    .line 351
    .line 352
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 353
    .line 354
    iget-object v0, v6, La/pir0;->O1:La/ii;

    .line 355
    .line 356
    if-eqz v0, :cond_b

    .line 357
    .line 358
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 359
    .line 360
    invoke-virtual {v6, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    const v1, 0x7f1316ef

    .line 365
    .line 366
    .line 367
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    invoke-virtual {v6, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v11

    .line 375
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    sget-object v17, La/n12;->b:La/n12;

    .line 379
    .line 380
    const/16 v18, 0x0

    .line 381
    .line 382
    const/16 v19, 0x5f8

    .line 383
    .line 384
    const/4 v12, 0x0

    .line 385
    const/4 v13, 0x0

    .line 386
    const/4 v14, 0x0

    .line 387
    const/4 v15, 0x0

    .line 388
    const/16 v16, 0x0

    .line 389
    .line 390
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_0

    .line 404
    .line 405
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v2

    .line 409
    :cond_c
    instance-of v0, v1, La/ajr0;

    .line 410
    .line 411
    if-eqz v0, :cond_e

    .line 412
    .line 413
    check-cast v1, La/ajr0;

    .line 414
    .line 415
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 416
    .line 417
    iget-object v0, v6, La/pir0;->Q1:La/lgn0;

    .line 418
    .line 419
    if-eqz v0, :cond_d

    .line 420
    .line 421
    new-instance v3, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 422
    .line 423
    const v4, 0x7f13025d

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-direct {v3, v4, v2, v2, v2}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 437
    .line 438
    const v2, 0x7f13162b

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    iget-object v4, v1, La/ajr0;->c:Ljava/lang/String;

    .line 446
    .line 447
    const-string v5, ": "

    .line 448
    .line 449
    invoke-static {v2, v5, v4}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    iget-object v9, v1, La/ajr0;->b:Ljava/lang/String;

    .line 454
    .line 455
    iget-wide v1, v1, La/ajr0;->a:J

    .line 456
    .line 457
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 458
    .line 459
    .line 460
    move-result-object v11

    .line 461
    const-string v12, "TOTO"

    .line 462
    .line 463
    sget-object v13, La/iun;->a:La/iun;

    .line 464
    .line 465
    const-string v10, "REQUEST_SUCCESS_BET_KEY"

    .line 466
    .line 467
    invoke-direct/range {v7 .. v13}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0, v3, v7, v6}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 471
    .line 472
    .line 473
    goto :goto_0

    .line 474
    :cond_d
    const-string v0, "successBetAlertManager"

    .line 475
    .line 476
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    throw v2

    .line 480
    :cond_e
    sget-object v0, La/vir0;->a:La/vir0;

    .line 481
    .line 482
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-eqz v0, :cond_11

    .line 487
    .line 488
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 489
    .line 490
    iget-object v0, v6, La/pir0;->S1:La/r9u;

    .line 491
    .line 492
    if-eqz v0, :cond_10

    .line 493
    .line 494
    sget-object v1, La/ygp;->B1:La/ygp;

    .line 495
    .line 496
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 502
    .line 503
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-eqz v0, :cond_f

    .line 508
    .line 509
    sget v0, La/ylr0;->m2:I

    .line 510
    .line 511
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    invoke-static {v0}, La/yum0;->m(Landroidx/fragment/app/e;)V

    .line 519
    .line 520
    .line 521
    goto :goto_0

    .line 522
    :cond_f
    sget v0, La/amr0;->m2:I

    .line 523
    .line 524
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-static {v0}, La/cvm0;->l(Landroidx/fragment/app/e;)V

    .line 532
    .line 533
    .line 534
    goto :goto_0

    .line 535
    :cond_10
    const-string v0, "getFeatureToggleUseCase"

    .line 536
    .line 537
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v2

    .line 541
    :cond_11
    instance-of v0, v1, La/yir0;

    .line 542
    .line 543
    if-eqz v0, :cond_13

    .line 544
    .line 545
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 546
    .line 547
    iget-object v0, v6, La/pir0;->R1:La/roq0;

    .line 548
    .line 549
    if-eqz v0, :cond_12

    .line 550
    .line 551
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    sget-object v2, La/fk60;->b:La/uuz;

    .line 559
    .line 560
    const/16 v2, 0x13

    .line 561
    .line 562
    invoke-static {v0, v1, v2}, La/roq0;->c(La/roq0;Landroidx/fragment/app/e;I)V

    .line 563
    .line 564
    .line 565
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    goto :goto_1

    .line 568
    :cond_12
    const-string v0, "tipsDialogScreenFactory"

    .line 569
    .line 570
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    throw v2

    .line 574
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 575
    .line 576
    .line 577
    :goto_1
    return-object v2

    .line 578
    :pswitch_0
    iget-object v1, v0, La/nir0;->j:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v1, La/cjr0;

    .line 581
    .line 582
    sget-object v3, La/wne;->a:La/wne;

    .line 583
    .line 584
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    iget-object v1, v1, La/cjr0;->b:La/ijr0;

    .line 588
    .line 589
    instance-of v3, v1, La/hjr0;

    .line 590
    .line 591
    if-eqz v3, :cond_14

    .line 592
    .line 593
    move-object v2, v1

    .line 594
    check-cast v2, La/hjr0;

    .line 595
    .line 596
    :cond_14
    if-eqz v2, :cond_15

    .line 597
    .line 598
    iget-boolean v1, v2, La/hjr0;->d:Z

    .line 599
    .line 600
    goto :goto_2

    .line 601
    :cond_15
    const/4 v1, 0x0

    .line 602
    :goto_2
    iget-object v0, v0, La/nir0;->k:La/pir0;

    .line 603
    .line 604
    if-eqz v1, :cond_16

    .line 605
    .line 606
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 611
    .line 612
    .line 613
    goto :goto_3

    .line 614
    :cond_16
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 619
    .line 620
    .line 621
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    return-object v0

    .line 624
    nop

    .line 625
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
