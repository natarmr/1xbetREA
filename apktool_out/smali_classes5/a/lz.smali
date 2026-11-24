.class public final La/lz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/mz;


# direct methods
.method public synthetic constructor <init>(La/mz;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lz;->i:B

    iput-object p1, p0, La/lz;->k:La/mz;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lz;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lz;->k:La/mz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/lz;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/lz;-><init>(La/mz;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/lz;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/lz;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/lz;-><init>(La/mz;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/lz;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/lz;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/lz;-><init>(La/mz;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/lz;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/lz;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lz;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/yz;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/lz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/lz;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/lz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/lz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/lz;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/lz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lz;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/lz;->k:La/mz;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/lz;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v2, La/mz;->R1:La/bg5;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    iget-object v0, v0, La/lz;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/yz;

    .line 31
    .line 32
    sget-object v1, La/wne;->a:La/wne;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, La/mz;->V1:La/jdk0;

    .line 38
    .line 39
    sget-object v1, La/qz;->a:La/qz;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const-string v4, "actionDialogManager"

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object v0, v2, La/mz;->M1:La/ii;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 54
    .line 55
    const v1, 0x7f130162

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    const v1, 0x7f13047e

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const v1, 0x7f130a86

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const v1, 0x7f13032f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    sget-object v14, La/n12;->a:La/n12;

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x5d0

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const-string v11, "REQUEST_BACK_DIALOG_KEY"

    .line 93
    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v5, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v3

    .line 115
    :cond_1
    instance-of v1, v0, La/rz;

    .line 116
    .line 117
    const-string v5, "personalScreenFactory"

    .line 118
    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    check-cast v0, La/rz;

    .line 122
    .line 123
    iget v0, v0, La/rz;->a:I

    .line 124
    .line 125
    iget-object v1, v2, La/mz;->K1:La/jh70;

    .line 126
    .line 127
    if-eqz v1, :cond_2

    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v3, La/dqe;

    .line 137
    .line 138
    const-string v4, "COUNTRY_CHOOSE_ITEM_KEY"

    .line 139
    .line 140
    invoke-direct {v3, v4, v0}, La/dqe;-><init>(Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v2, v3}, La/jh70;->l(Landroidx/fragment/app/e;La/dqe;)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v3

    .line 152
    :cond_3
    instance-of v1, v0, La/tz;

    .line 153
    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    check-cast v0, La/tz;

    .line 157
    .line 158
    iget-object v6, v0, La/tz;->a:Ljava/util/Calendar;

    .line 159
    .line 160
    sget-object v3, La/bej;->i2:La/qud;

    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v5, La/un6;

    .line 170
    .line 171
    const/4 v0, 0x5

    .line 172
    invoke-direct {v5, v2, v0}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 176
    .line 177
    .line 178
    move-result-wide v8

    .line 179
    const/4 v10, 0x0

    .line 180
    const/16 v11, 0x50

    .line 181
    .line 182
    const v7, 0x7f1405b0

    .line 183
    .line 184
    .line 185
    invoke-static/range {v3 .. v11}, La/qud;->h(La/qud;Landroidx/fragment/app/e;La/xdr;Ljava/util/Calendar;IJLa/gvb0;I)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_4
    instance-of v1, v0, La/uz;

    .line 191
    .line 192
    const v6, 0x7f130e5d

    .line 193
    .line 194
    .line 195
    const v7, 0x7f1307bb

    .line 196
    .line 197
    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    check-cast v0, La/uz;

    .line 201
    .line 202
    iget-object v10, v0, La/uz;->a:Ljava/lang/String;

    .line 203
    .line 204
    iget-object v0, v2, La/mz;->M1:La/ii;

    .line 205
    .line 206
    if-eqz v0, :cond_5

    .line 207
    .line 208
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 209
    .line 210
    invoke-virtual {v2, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    sget-object v17, La/n12;->a:La/n12;

    .line 222
    .line 223
    const/16 v18, 0x0

    .line 224
    .line 225
    const/16 v19, 0x5d8

    .line 226
    .line 227
    const/4 v12, 0x0

    .line 228
    const/4 v13, 0x0

    .line 229
    const-string v14, "REQUEST_ROTTEN_TOKEN_ERROR_DIALOG_KEY"

    .line 230
    .line 231
    const/4 v15, 0x0

    .line 232
    const/16 v16, 0x0

    .line 233
    .line 234
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v3

    .line 253
    :cond_6
    instance-of v1, v0, La/pz;

    .line 254
    .line 255
    if-eqz v1, :cond_8

    .line 256
    .line 257
    check-cast v0, La/pz;

    .line 258
    .line 259
    iget v1, v0, La/pz;->b:I

    .line 260
    .line 261
    iget v0, v0, La/pz;->a:I

    .line 262
    .line 263
    iget-object v4, v2, La/mz;->K1:La/jh70;

    .line 264
    .line 265
    if-eqz v4, :cond_7

    .line 266
    .line 267
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    new-instance v3, La/ft00;

    .line 275
    .line 276
    new-instance v5, La/st00;

    .line 277
    .line 278
    invoke-direct {v5, v1, v0}, La/st00;-><init>(II)V

    .line 279
    .line 280
    .line 281
    const-string v0, "CITY_CHOOSE_ITEM_KEY"

    .line 282
    .line 283
    invoke-direct {v3, v5, v0}, La/ft00;-><init>(La/ut00;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v2, v3}, La/jh70;->m(Landroidx/fragment/app/e;La/ft00;)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v3

    .line 295
    :cond_8
    instance-of v1, v0, La/vz;

    .line 296
    .line 297
    if-eqz v1, :cond_a

    .line 298
    .line 299
    check-cast v0, La/vz;

    .line 300
    .line 301
    iget v1, v0, La/vz;->b:I

    .line 302
    .line 303
    iget v0, v0, La/vz;->a:I

    .line 304
    .line 305
    iget-object v4, v2, La/mz;->K1:La/jh70;

    .line 306
    .line 307
    if-eqz v4, :cond_9

    .line 308
    .line 309
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    new-instance v3, La/ft00;

    .line 317
    .line 318
    new-instance v5, La/tt00;

    .line 319
    .line 320
    invoke-direct {v5, v1, v0}, La/tt00;-><init>(II)V

    .line 321
    .line 322
    .line 323
    const-string v0, "REGION_CHOOSE_ITEM_KEY"

    .line 324
    .line 325
    invoke-direct {v3, v5, v0}, La/ft00;-><init>(La/ut00;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, v2, v3}, La/jh70;->m(Landroidx/fragment/app/e;La/ft00;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_0

    .line 332
    .line 333
    :cond_9
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v3

    .line 337
    :cond_a
    instance-of v1, v0, La/xz;

    .line 338
    .line 339
    if-eqz v1, :cond_c

    .line 340
    .line 341
    iget-object v0, v2, La/mz;->M1:La/ii;

    .line 342
    .line 343
    if-eqz v0, :cond_b

    .line 344
    .line 345
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 346
    .line 347
    invoke-virtual {v2, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    const v1, 0x7f13115d

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v10

    .line 358
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    sget-object v17, La/n12;->b:La/n12;

    .line 366
    .line 367
    const/16 v18, 0x0

    .line 368
    .line 369
    const/16 v19, 0x5d8

    .line 370
    .line 371
    const/4 v12, 0x0

    .line 372
    const/4 v13, 0x0

    .line 373
    const-string v14, "REQUEST_REQUEST_ERROR_KEY"

    .line 374
    .line 375
    const/4 v15, 0x0

    .line 376
    const/16 v16, 0x0

    .line 377
    .line 378
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 389
    .line 390
    .line 391
    goto :goto_0

    .line 392
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v3

    .line 396
    :cond_c
    instance-of v1, v0, La/wz;

    .line 397
    .line 398
    const-string v4, "pickerDialogFactory"

    .line 399
    .line 400
    const/4 v5, 0x1

    .line 401
    if-eqz v1, :cond_e

    .line 402
    .line 403
    check-cast v0, La/wz;

    .line 404
    .line 405
    iget v0, v0, La/wz;->a:I

    .line 406
    .line 407
    iget-object v1, v2, La/mz;->L1:La/rl70;

    .line 408
    .line 409
    if-eqz v1, :cond_d

    .line 410
    .line 411
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 419
    .line 420
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    const/4 v4, 0x0

    .line 425
    invoke-direct {v3, v0, v4, v5}, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 426
    .line 427
    .line 428
    invoke-static {v1, v2, v3}, La/rl70;->f(La/rl70;Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;)V

    .line 429
    .line 430
    .line 431
    goto :goto_0

    .line 432
    :cond_d
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    throw v3

    .line 436
    :cond_e
    instance-of v1, v0, La/sz;

    .line 437
    .line 438
    if-eqz v1, :cond_10

    .line 439
    .line 440
    check-cast v0, La/sz;

    .line 441
    .line 442
    iget v0, v0, La/sz;->a:I

    .line 443
    .line 444
    iget-object v1, v2, La/mz;->L1:La/rl70;

    .line 445
    .line 446
    if-eqz v1, :cond_f

    .line 447
    .line 448
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 456
    .line 457
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-direct {v3, v0, v5, v5}, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 462
    .line 463
    .line 464
    invoke-static {v1, v2, v3}, La/rl70;->f(La/rl70;Landroidx/fragment/app/e;Lorg/xplatform/picker/api/presentation/PickerParams;)V

    .line 465
    .line 466
    .line 467
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 468
    .line 469
    goto :goto_1

    .line 470
    :cond_f
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw v3

    .line 474
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 475
    .line 476
    .line 477
    :goto_1
    return-object v3

    .line 478
    :pswitch_1
    iget-object v1, v0, La/lz;->j:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v6, v1

    .line 481
    check-cast v6, Ljava/lang/String;

    .line 482
    .line 483
    sget-object v1, La/wne;->a:La/wne;

    .line 484
    .line 485
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    iget-object v0, v0, La/lz;->k:La/mz;

    .line 489
    .line 490
    iget-object v1, v0, La/mz;->N1:La/wdk0;

    .line 491
    .line 492
    if-eqz v1, :cond_11

    .line 493
    .line 494
    new-instance v4, La/xdk0;

    .line 495
    .line 496
    sget-object v5, La/rek0;->b:La/rek0;

    .line 497
    .line 498
    const/4 v10, 0x0

    .line 499
    const/16 v11, 0x7c

    .line 500
    .line 501
    const/4 v7, 0x0

    .line 502
    const/4 v8, 0x0

    .line 503
    const/4 v9, 0x0

    .line 504
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 505
    .line 506
    .line 507
    const/4 v13, 0x0

    .line 508
    const/16 v14, 0x3fc

    .line 509
    .line 510
    const/4 v11, 0x0

    .line 511
    const/4 v12, 0x0

    .line 512
    move-object v9, v0

    .line 513
    move-object v7, v1

    .line 514
    move-object v8, v4

    .line 515
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 516
    .line 517
    .line 518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :cond_11
    const-string v0, "snackbarManager"

    .line 522
    .line 523
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw v3

    .line 527
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
