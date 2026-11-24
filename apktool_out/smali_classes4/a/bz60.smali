.class public final La/bz60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ez60;


# direct methods
.method public synthetic constructor <init>(La/ez60;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bz60;->i:B

    iput-object p1, p0, La/bz60;->k:La/ez60;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bz60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bz60;->k:La/ez60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bz60;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bz60;-><init>(La/ez60;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bz60;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bz60;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bz60;-><init>(La/ez60;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/bz60;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/bz60;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/b370;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bz60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bz60;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bz60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/v570;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bz60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bz60;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bz60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bz60;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/bz60;->k:La/ez60;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/bz60;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/b370;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La/ez60;->S1:[La/iiy;

    .line 21
    .line 22
    invoke-virtual {v2}, La/ez60;->H0()La/g670;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v0, La/b370;->a:La/pat;

    .line 27
    .line 28
    iget-object v0, v0, La/b370;->b:La/pat;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v4, v1, La/g670;->B:La/p7m0;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object v1, v1, La/g670;->C:La/p7m0;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    iget-object v1, v2, La/ez60;->O1:La/kiu0;

    .line 56
    .line 57
    iget-object v0, v0, La/bz60;->j:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, La/v570;

    .line 60
    .line 61
    sget-object v4, La/wne;->a:La/wne;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    if-eqz v0, :cond_e

    .line 67
    .line 68
    instance-of v4, v0, La/t570;

    .line 69
    .line 70
    const-string v5, "actionDialogManager"

    .line 71
    .line 72
    const v6, 0x7f130e5c

    .line 73
    .line 74
    .line 75
    const v7, 0x7f130162

    .line 76
    .line 77
    .line 78
    if-eqz v4, :cond_1

    .line 79
    .line 80
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 81
    .line 82
    iget-object v0, v2, La/ez60;->N1:La/ii;

    .line 83
    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 87
    .line 88
    invoke-virtual {v2, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    const v1, 0x7f1316ef

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object v17, La/n12;->b:La/n12;

    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    const/16 v19, 0x5d8

    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const-string v14, "CHANGE_BALANCE_TO_PRIMARY_KEY"

    .line 115
    .line 116
    const/4 v15, 0x0

    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v3

    .line 138
    :cond_1
    instance-of v4, v0, La/r570;

    .line 139
    .line 140
    if-eqz v4, :cond_7

    .line 141
    .line 142
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 143
    .line 144
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    invoke-static {v0}, La/sj3;->J(Landroid/content/Context;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    goto :goto_0

    .line 155
    :cond_2
    const/4 v0, 0x1

    .line 156
    :goto_0
    if-eqz v0, :cond_5

    .line 157
    .line 158
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 163
    .line 164
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_4

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    instance-of v3, v2, La/u0i;

    .line 187
    .line 188
    if-eqz v3, :cond_3

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_c

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, La/u0i;

    .line 209
    .line 210
    invoke-virtual {v1}, La/sik;->y0()V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    new-instance v6, La/cz60;

    .line 215
    .line 216
    invoke-virtual {v2}, La/ez60;->H0()La/g670;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    const/4 v12, 0x0

    .line 221
    const/4 v13, 0x1

    .line 222
    const/4 v7, 0x0

    .line 223
    const-class v17, La/g670;

    .line 224
    .line 225
    const-string v10, "onNavigationDialogPositiveClick"

    .line 226
    .line 227
    const-string v11, "onNavigationDialogPositiveClick$games_list()V"

    .line 228
    .line 229
    move-object/from16 v9, v17

    .line 230
    .line 231
    invoke-direct/range {v6 .. v13}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 232
    .line 233
    .line 234
    new-instance v14, La/cz60;

    .line 235
    .line 236
    invoke-virtual {v2}, La/ez60;->H0()La/g670;

    .line 237
    .line 238
    .line 239
    move-result-object v16

    .line 240
    const/16 v20, 0x0

    .line 241
    .line 242
    const/16 v21, 0x2

    .line 243
    .line 244
    const/4 v15, 0x0

    .line 245
    const-string v18, "onNavigationDialogNegativeClick"

    .line 246
    .line 247
    const-string v19, "onNavigationDialogNegativeClick$games_list()V"

    .line 248
    .line 249
    invoke-direct/range {v14 .. v21}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 250
    .line 251
    .line 252
    iget-object v1, v2, La/ez60;->N1:La/ii;

    .line 253
    .line 254
    if-eqz v1, :cond_6

    .line 255
    .line 256
    invoke-static {v2, v0, v6, v14, v1}, La/kpb;->w0(Landroidx/fragment/app/Fragment;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ii;)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_3

    .line 260
    .line 261
    :cond_6
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v3

    .line 265
    :cond_7
    instance-of v4, v0, La/u570;

    .line 266
    .line 267
    if-eqz v4, :cond_8

    .line 268
    .line 269
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 270
    .line 271
    new-instance v0, Landroid/content/Intent;

    .line 272
    .line 273
    const-string v1, "android.settings.SETTINGS"

    .line 274
    .line 275
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_8
    instance-of v4, v0, La/p570;

    .line 284
    .line 285
    if-eqz v4, :cond_9

    .line 286
    .line 287
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 288
    .line 289
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, La/k370;

    .line 294
    .line 295
    sget-object v1, La/y270;->a:La/y270;

    .line 296
    .line 297
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_9
    instance-of v4, v0, La/q570;

    .line 302
    .line 303
    if-eqz v4, :cond_a

    .line 304
    .line 305
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 306
    .line 307
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, La/k370;

    .line 312
    .line 313
    new-instance v1, La/z270;

    .line 314
    .line 315
    const/4 v2, 0x0

    .line 316
    invoke-direct {v1, v2}, La/z270;-><init>(Z)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_a
    instance-of v4, v0, La/o570;

    .line 324
    .line 325
    if-eqz v4, :cond_b

    .line 326
    .line 327
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 328
    .line 329
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v0, La/k370;

    .line 334
    .line 335
    sget-object v1, La/x270;->a:La/x270;

    .line 336
    .line 337
    invoke-virtual {v0, v1}, La/k370;->y(La/a370;)V

    .line 338
    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_b
    instance-of v0, v0, La/s570;

    .line 342
    .line 343
    if-eqz v0, :cond_e

    .line 344
    .line 345
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 346
    .line 347
    iget-object v0, v2, La/ez60;->N1:La/ii;

    .line 348
    .line 349
    if-eqz v0, :cond_d

    .line 350
    .line 351
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 352
    .line 353
    invoke-virtual {v2, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    const v1, 0x7f13123b

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    sget-object v17, La/n12;->b:La/n12;

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const/16 v19, 0x5d8

    .line 376
    .line 377
    const/4 v12, 0x0

    .line 378
    const/4 v13, 0x0

    .line 379
    const-string v14, "CHANGE_BALANCE_TO_PRIMARY_KEY"

    .line 380
    .line 381
    const/4 v15, 0x0

    .line 382
    const/16 v16, 0x0

    .line 383
    .line 384
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 395
    .line 396
    .line 397
    :cond_c
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_d
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v3

    .line 404
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 405
    .line 406
    .line 407
    :goto_4
    return-object v3

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
