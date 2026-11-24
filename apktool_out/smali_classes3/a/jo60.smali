.class public final La/jo60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/lo60;


# direct methods
.method public synthetic constructor <init>(La/lo60;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jo60;->i:B

    iput-object p1, p0, La/jo60;->k:La/lo60;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jo60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jo60;->k:La/lo60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/jo60;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/jo60;-><init>(La/lo60;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/jo60;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/jo60;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/jo60;-><init>(La/lo60;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/jo60;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/jo60;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/jo60;-><init>(La/lo60;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/jo60;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/jo60;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/cp70;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/jo60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jo60;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jo60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hp70;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/jo60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/jo60;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/jo60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/ip70;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/jo60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/jo60;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/jo60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jo60;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/jo60;->k:La/lo60;

    .line 7
    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/jo60;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/cp70;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    instance-of v0, v0, La/bp70;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object v0, La/lo60;->U1:La/htz;

    .line 27
    .line 28
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, La/sm70;->c:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/facebook/shimmer/ShimmerFrameLayout;->c()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/sm70;->f:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/facebook/shimmer/ShimmerFrameLayout;->c()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, La/sm70;->c:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, La/sm70;->f:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 60
    .line 61
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, La/sm70;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, La/lo60;->H0()La/sp70;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v1, v0, La/sp70;->U:La/p7m0;

    .line 78
    .line 79
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    move-object v3, v2

    .line 84
    check-cast v3, La/ip70;

    .line 85
    .line 86
    iget-boolean v4, v0, La/sp70;->O:Z

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/16 v8, 0xe

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    invoke-static/range {v3 .. v8}, La/ip70;->a(La/ip70;ZZZLa/csr;I)La/ip70;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_0

    .line 102
    .line 103
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_0
    sget-object v2, La/pek0;->a:La/pek0;

    .line 107
    .line 108
    iget-object v1, v0, La/jo60;->j:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, La/hp70;

    .line 111
    .line 112
    sget-object v3, La/wne;->a:La/wne;

    .line 113
    .line 114
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    if-eqz v1, :cond_9

    .line 119
    .line 120
    instance-of v4, v1, La/dp70;

    .line 121
    .line 122
    const-string v5, "snackbarManager"

    .line 123
    .line 124
    iget-object v0, v0, La/jo60;->k:La/lo60;

    .line 125
    .line 126
    if-eqz v4, :cond_3

    .line 127
    .line 128
    sget-object v1, La/lo60;->U1:La/htz;

    .line 129
    .line 130
    iget-object v9, v0, La/lo60;->N1:La/wdk0;

    .line 131
    .line 132
    if-eqz v9, :cond_2

    .line 133
    .line 134
    new-instance v1, La/xdk0;

    .line 135
    .line 136
    const v3, 0x7f1302c0

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/16 v8, 0x7c

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x0

    .line 152
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 153
    .line 154
    .line 155
    const/4 v12, 0x0

    .line 156
    const/16 v13, 0x3fc

    .line 157
    .line 158
    move-object v6, v9

    .line 159
    const/4 v9, 0x0

    .line 160
    const/4 v10, 0x0

    .line 161
    const/4 v11, 0x0

    .line 162
    move-object v8, v0

    .line 163
    move-object v7, v1

    .line 164
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v3

    .line 173
    :cond_3
    instance-of v4, v1, La/fp70;

    .line 174
    .line 175
    if-eqz v4, :cond_5

    .line 176
    .line 177
    sget-object v1, La/lo60;->U1:La/htz;

    .line 178
    .line 179
    iget-object v9, v0, La/lo60;->N1:La/wdk0;

    .line 180
    .line 181
    if-eqz v9, :cond_4

    .line 182
    .line 183
    new-instance v1, La/xdk0;

    .line 184
    .line 185
    const v3, 0x7f1317db

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    const/4 v7, 0x0

    .line 196
    const/16 v8, 0x7c

    .line 197
    .line 198
    const/4 v4, 0x0

    .line 199
    const/4 v5, 0x0

    .line 200
    const/4 v6, 0x0

    .line 201
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 202
    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/16 v13, 0x3fc

    .line 206
    .line 207
    move-object v6, v9

    .line 208
    const/4 v9, 0x0

    .line 209
    const/4 v10, 0x0

    .line 210
    const/4 v11, 0x0

    .line 211
    move-object v8, v0

    .line 212
    move-object v7, v1

    .line 213
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 214
    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_4
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v3

    .line 222
    :cond_5
    move-object v8, v0

    .line 223
    instance-of v0, v1, La/gp70;

    .line 224
    .line 225
    const-string v2, "actionDialogManager"

    .line 226
    .line 227
    if-eqz v0, :cond_7

    .line 228
    .line 229
    sget-object v0, La/lo60;->U1:La/htz;

    .line 230
    .line 231
    iget-object v0, v8, La/lo60;->M1:La/ii;

    .line 232
    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    sget v1, La/xgs;->f2:I

    .line 236
    .line 237
    const v1, 0x7f1316f5

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    const v1, 0x7f130926

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    const v1, 0x7f130927

    .line 252
    .line 253
    .line 254
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    const v1, 0x7f130928

    .line 262
    .line 263
    .line 264
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    const v1, 0x7f130929

    .line 269
    .line 270
    .line 271
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v16

    .line 275
    sget-object v18, La/n12;->a:La/n12;

    .line 276
    .line 277
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 278
    .line 279
    const/16 v19, 0x0

    .line 280
    .line 281
    const/16 v20, 0x590

    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const-string v15, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 289
    .line 290
    .line 291
    new-instance v1, La/xgs;

    .line 292
    .line 293
    invoke-direct {v1}, La/xgs;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v9}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 307
    .line 308
    .line 309
    goto :goto_0

    .line 310
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v3

    .line 314
    :cond_7
    instance-of v0, v1, La/ep70;

    .line 315
    .line 316
    if-eqz v0, :cond_9

    .line 317
    .line 318
    check-cast v1, La/ep70;

    .line 319
    .line 320
    sget-object v0, La/lo60;->U1:La/htz;

    .line 321
    .line 322
    iget-object v0, v8, La/lo60;->M1:La/ii;

    .line 323
    .line 324
    if-eqz v0, :cond_8

    .line 325
    .line 326
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 327
    .line 328
    const v1, 0x7f130162

    .line 329
    .line 330
    .line 331
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    const v1, 0x7f130ea9

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    const v1, 0x7f130e5d

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    sget-object v18, La/n12;->a:La/n12;

    .line 353
    .line 354
    const/16 v19, 0x0

    .line 355
    .line 356
    const/16 v20, 0x5f8

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    const/16 v17, 0x0

    .line 364
    .line 365
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 376
    .line 377
    .line 378
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    goto :goto_1

    .line 381
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v3

    .line 385
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 386
    .line 387
    .line 388
    :goto_1
    return-object v3

    .line 389
    :pswitch_1
    iget-object v0, v0, La/jo60;->j:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, La/ip70;

    .line 392
    .line 393
    sget-object v1, La/wne;->a:La/wne;

    .line 394
    .line 395
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    iget-boolean v1, v0, La/ip70;->b:Z

    .line 399
    .line 400
    sget-object v5, La/lo60;->U1:La/htz;

    .line 401
    .line 402
    invoke-virtual {v3, v1}, La/lo60;->I0(Z)V

    .line 403
    .line 404
    .line 405
    iget-boolean v1, v0, La/ip70;->c:Z

    .line 406
    .line 407
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    iget-object v5, v5, La/sm70;->a:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 412
    .line 413
    invoke-virtual {v5}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    if-eqz v5, :cond_b

    .line 418
    .line 419
    if-eqz v1, :cond_a

    .line 420
    .line 421
    const/16 v1, 0x80

    .line 422
    .line 423
    goto :goto_2

    .line 424
    :cond_a
    const/16 v1, 0xff

    .line 425
    .line 426
    :goto_2
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 427
    .line 428
    .line 429
    :cond_b
    iget-boolean v1, v0, La/ip70;->a:Z

    .line 430
    .line 431
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    iget-object v5, v5, La/sm70;->b:Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;

    .line 436
    .line 437
    if-eqz v1, :cond_c

    .line 438
    .line 439
    goto :goto_3

    .line 440
    :cond_c
    move v2, v4

    .line 441
    :goto_3
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v3}, La/lo60;->G0()La/sm70;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iget-object v1, v1, La/sm70;->b:Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;

    .line 449
    .line 450
    iget-object v0, v0, La/ip70;->d:La/csr;

    .line 451
    .line 452
    invoke-virtual {v1, v0}, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->setBonusSelected(La/csr;)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    nop

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
