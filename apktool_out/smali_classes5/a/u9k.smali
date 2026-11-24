.class public final La/u9k;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/w9k;


# direct methods
.method public synthetic constructor <init>(La/w9k;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u9k;->i:B

    iput-object p1, p0, La/u9k;->k:La/w9k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u9k;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u9k;->k:La/w9k;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u9k;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/u9k;-><init>(La/w9k;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/u9k;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/u9k;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/u9k;-><init>(La/w9k;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/u9k;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/u9k;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/u9k;-><init>(La/w9k;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/u9k;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/u9k;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/dak;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/u9k;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u9k;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u9k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/z9k;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/u9k;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/u9k;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/u9k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/hak;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/u9k;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/u9k;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/u9k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u9k;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/u9k;->k:La/w9k;

    .line 6
    .line 7
    iget-object v0, v0, La/u9k;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/dak;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    instance-of v1, v0, La/cak;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const-string v4, "actionDialogManager"

    .line 27
    .line 28
    const v5, 0x7f1303fb

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 34
    .line 35
    iget-object v0, v2, La/w9k;->L1:La/ii;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 40
    .line 41
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const v1, 0x7f130b04

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    const v1, 0x7f131843

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const v1, 0x7f13032f

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    sget-object v15, La/n12;->a:La/n12;

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const/16 v17, 0x5d0

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    const-string v12, "SET_LIMIT_REQUEST_KEY"

    .line 77
    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v6, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v3

    .line 99
    :cond_2
    instance-of v1, v0, La/aak;

    .line 100
    .line 101
    const v6, 0x7f130e5d

    .line 102
    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 107
    .line 108
    iget-object v0, v2, La/w9k;->L1:La/ii;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 113
    .line 114
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    const v1, 0x7f13131f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v16, La/n12;->b:La/n12;

    .line 133
    .line 134
    const/16 v17, 0x0

    .line 135
    .line 136
    const/16 v18, 0x5f8

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    const/4 v12, 0x0

    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v3

    .line 161
    :cond_4
    instance-of v1, v0, La/bak;

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    check-cast v0, La/bak;

    .line 166
    .line 167
    iget-object v9, v0, La/bak;->a:Ljava/lang/String;

    .line 168
    .line 169
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 170
    .line 171
    iget-object v0, v2, La/w9k;->L1:La/ii;

    .line 172
    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 176
    .line 177
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    sget-object v16, La/n12;->b:La/n12;

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v18, 0x5f8

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    const/4 v15, 0x0

    .line 199
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v3

    .line 217
    :cond_6
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_0
    check-cast v0, La/z9k;

    .line 221
    .line 222
    sget-object v1, La/wne;->a:La/wne;

    .line 223
    .line 224
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    sget-object v1, La/w9k;->P1:[La/iiy;

    .line 228
    .line 229
    iget-object v1, v2, La/w9k;->N1:La/a8z;

    .line 230
    .line 231
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, La/q9k;

    .line 236
    .line 237
    iget-object v3, v0, La/z9k;->a:Ljava/util/List;

    .line 238
    .line 239
    invoke-virtual {v1, v3}, La/zz3;->A(Ljava/util/List;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iget-object v1, v1, La/a1r;->b:Landroid/widget/Button;

    .line 247
    .line 248
    iget-boolean v0, v0, La/z9k;->b:Z

    .line 249
    .line 250
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 251
    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_1
    check-cast v0, La/hak;

    .line 257
    .line 258
    sget-object v1, La/wne;->a:La/wne;

    .line 259
    .line 260
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    if-nez v0, :cond_7

    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_7
    instance-of v1, v0, La/gak;

    .line 268
    .line 269
    const/4 v3, 0x0

    .line 270
    const/16 v4, 0x8

    .line 271
    .line 272
    if-eqz v1, :cond_8

    .line 273
    .line 274
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 275
    .line 276
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v0, v0, La/a1r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 281
    .line 282
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iget-object v0, v0, La/a1r;->c:Landroid/widget/FrameLayout;

    .line 290
    .line 291
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, La/a1r;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 299
    .line 300
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-object v0, v0, La/a1r;->e:La/nq8;

    .line 308
    .line 309
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 310
    .line 311
    check-cast v0, Landroid/widget/FrameLayout;

    .line 312
    .line 313
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 314
    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_8
    instance-of v1, v0, La/fak;

    .line 318
    .line 319
    if-eqz v1, :cond_9

    .line 320
    .line 321
    check-cast v0, La/fak;

    .line 322
    .line 323
    iget-object v0, v0, La/fak;->a:La/ra10;

    .line 324
    .line 325
    sget-object v1, La/w9k;->P1:[La/iiy;

    .line 326
    .line 327
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    iget-object v1, v1, La/a1r;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iget-object v0, v0, La/a1r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 341
    .line 342
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    iget-object v0, v0, La/a1r;->c:Landroid/widget/FrameLayout;

    .line 350
    .line 351
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v0, v0, La/a1r;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 359
    .line 360
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iget-object v0, v0, La/a1r;->e:La/nq8;

    .line 368
    .line 369
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 370
    .line 371
    check-cast v0, Landroid/widget/FrameLayout;

    .line 372
    .line 373
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 374
    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_9
    instance-of v0, v0, La/eak;

    .line 378
    .line 379
    if-eqz v0, :cond_a

    .line 380
    .line 381
    sget-object v0, La/w9k;->P1:[La/iiy;

    .line 382
    .line 383
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iget-object v0, v0, La/a1r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 388
    .line 389
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    iget-object v0, v0, La/a1r;->c:Landroid/widget/FrameLayout;

    .line 397
    .line 398
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iget-object v0, v0, La/a1r;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 406
    .line 407
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, La/w9k;->G0()La/a1r;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    iget-object v0, v0, La/a1r;->e:La/nq8;

    .line 415
    .line 416
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 417
    .line 418
    check-cast v0, Landroid/widget/FrameLayout;

    .line 419
    .line 420
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 421
    .line 422
    .line 423
    :cond_a
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    nop

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
