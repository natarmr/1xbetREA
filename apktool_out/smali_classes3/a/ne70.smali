.class public final La/ne70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/oe70;


# direct methods
.method public synthetic constructor <init>(La/oe70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ne70;->i:B

    iput-object p1, p0, La/ne70;->k:La/oe70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ne70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ne70;->k:La/oe70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ne70;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ne70;-><init>(La/oe70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ne70;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ne70;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ne70;-><init>(La/oe70;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ne70;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ne70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/we70;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ne70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ne70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ne70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qe70;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ne70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ne70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ne70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/ne70;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ne70;->k:La/oe70;

    .line 6
    .line 7
    iget-object v0, v0, La/ne70;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/we70;

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
    if-eqz v0, :cond_9

    .line 21
    .line 22
    instance-of v3, v0, La/ue70;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v0, La/ue70;

    .line 27
    .line 28
    iget-boolean v7, v0, La/ue70;->a:Z

    .line 29
    .line 30
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 31
    .line 32
    iget-object v0, v2, La/oe70;->N1:La/peg0;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/yzn0;

    .line 39
    .line 40
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sget-object v4, La/bm5;->d:La/bm5;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-string v8, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 54
    .line 55
    const/16 v9, 0xce

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-static/range {v3 .. v9}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_0
    const-string v0, "changeBalanceFeature"

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_1
    instance-of v3, v0, La/re70;

    .line 70
    .line 71
    const-string v4, "actionDialogManager"

    .line 72
    .line 73
    const v5, 0x7f130e5c

    .line 74
    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 79
    .line 80
    iget-object v0, v2, La/oe70;->M1:La/ii;

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 85
    .line 86
    const v1, 0x7f13040a

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const v3, 0x7f130e2e

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    sget-object v15, La/n12;->b:La/n12;

    .line 112
    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x5d0

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    const-string v12, "CHANGE_ACCOUNT_REQUEST_KEY"

    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const/4 v14, 0x0

    .line 122
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :cond_3
    instance-of v3, v0, La/se70;

    .line 142
    .line 143
    const v6, 0x7f130162

    .line 144
    .line 145
    .line 146
    if-eqz v3, :cond_5

    .line 147
    .line 148
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 149
    .line 150
    iget-object v0, v2, La/oe70;->M1:La/ii;

    .line 151
    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 155
    .line 156
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const v1, 0x7f13092f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    const v1, 0x7f130e5d

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v16, La/n12;->b:La/n12;

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v18, 0x5f8

    .line 182
    .line 183
    const/4 v11, 0x0

    .line 184
    const/4 v12, 0x0

    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :cond_5
    instance-of v3, v0, La/te70;

    .line 208
    .line 209
    if-eqz v3, :cond_7

    .line 210
    .line 211
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 212
    .line 213
    iget-object v0, v2, La/oe70;->M1:La/ii;

    .line 214
    .line 215
    if-eqz v0, :cond_6

    .line 216
    .line 217
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 218
    .line 219
    const v1, 0x7f130e2d

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    const v1, 0x7f130a7f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    sget-object v15, La/n12;->b:La/n12;

    .line 241
    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/16 v17, 0x5f8

    .line 245
    .line 246
    const/4 v10, 0x0

    .line 247
    const/4 v11, 0x0

    .line 248
    const/4 v12, 0x0

    .line 249
    const/4 v13, 0x0

    .line 250
    const/4 v14, 0x0

    .line 251
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 262
    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v1

    .line 269
    :cond_7
    instance-of v0, v0, La/ve70;

    .line 270
    .line 271
    if-eqz v0, :cond_9

    .line 272
    .line 273
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 274
    .line 275
    iget-object v0, v2, La/oe70;->M1:La/ii;

    .line 276
    .line 277
    if-eqz v0, :cond_8

    .line 278
    .line 279
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 280
    .line 281
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    const v1, 0x7f13123b

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    sget-object v16, La/n12;->b:La/n12;

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/16 v18, 0x5d8

    .line 304
    .line 305
    const/4 v11, 0x0

    .line 306
    const/4 v12, 0x0

    .line 307
    const-string v13, "SECTION_BALANCE_EXPIRED_DIALOG"

    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 322
    .line 323
    .line 324
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    goto :goto_1

    .line 327
    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v1

    .line 331
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 332
    .line 333
    .line 334
    :goto_1
    return-object v1

    .line 335
    :pswitch_0
    check-cast v0, La/qe70;

    .line 336
    .line 337
    sget-object v1, La/wne;->a:La/wne;

    .line 338
    .line 339
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    iget-boolean v1, v0, La/qe70;->a:Z

    .line 343
    .line 344
    sget-object v3, La/oe70;->Q1:[La/iiy;

    .line 345
    .line 346
    if-eqz v1, :cond_a

    .line 347
    .line 348
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    iget-object v3, v3, La/pe70;->b:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 353
    .line 354
    invoke-virtual {v3}, Lcom/facebook/shimmer/ShimmerFrameLayout;->b()V

    .line 355
    .line 356
    .line 357
    goto :goto_2

    .line 358
    :cond_a
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    iget-object v3, v3, La/pe70;->b:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 363
    .line 364
    invoke-virtual {v3}, Lcom/facebook/shimmer/ShimmerFrameLayout;->c()V

    .line 365
    .line 366
    .line 367
    :goto_2
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    iget-object v3, v3, La/pe70;->b:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 372
    .line 373
    const/16 v4, 0x8

    .line 374
    .line 375
    const/4 v5, 0x0

    .line 376
    if-eqz v1, :cond_b

    .line 377
    .line 378
    move v6, v5

    .line 379
    goto :goto_3

    .line 380
    :cond_b
    move v6, v4

    .line 381
    :goto_3
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    iget-object v3, v3, La/pe70;->c:Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;

    .line 389
    .line 390
    if-nez v1, :cond_c

    .line 391
    .line 392
    move v4, v5

    .line 393
    :cond_c
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 394
    .line 395
    .line 396
    iget-object v1, v0, La/qe70;->b:La/ql5;

    .line 397
    .line 398
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    iget-object v3, v3, La/pe70;->c:Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;

    .line 403
    .line 404
    invoke-virtual {v3, v1}, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->setBalance(La/ql5;)V

    .line 405
    .line 406
    .line 407
    iget-boolean v1, v0, La/qe70;->c:Z

    .line 408
    .line 409
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    iget-object v3, v3, La/pe70;->c:Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;

    .line 414
    .line 415
    invoke-virtual {v3, v1}, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->setEnabled(Z)V

    .line 416
    .line 417
    .line 418
    iget-boolean v0, v0, La/qe70;->d:Z

    .line 419
    .line 420
    invoke-virtual {v2}, La/oe70;->G0()La/pe70;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iget-object v1, v1, La/pe70;->c:Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;

    .line 425
    .line 426
    invoke-virtual {v1, v0}, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->setChevronVisible(Z)V

    .line 427
    .line 428
    .line 429
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    return-object v0

    .line 432
    nop

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
