.class public final La/y090;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/b190;


# direct methods
.method public synthetic constructor <init>(La/b190;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y090;->i:B

    iput-object p1, p0, La/y090;->k:La/b190;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y090;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/y090;->k:La/b190;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/y090;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/y090;-><init>(La/b190;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/y090;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/y090;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/y090;-><init>(La/b190;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/y090;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/y090;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/y090;-><init>(La/b190;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/y090;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/y090;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/k190;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/y090;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/y090;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/y090;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/n190;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/y090;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/y090;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/y090;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/l190;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/y090;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/y090;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/y090;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/y090;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/y090;->k:La/b190;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/y090;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/k190;

    .line 15
    .line 16
    sget-object v2, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_6

    .line 22
    .line 23
    instance-of v2, v1, La/j190;

    .line 24
    .line 25
    iget-object v7, v0, La/y090;->k:La/b190;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    check-cast v1, La/j190;

    .line 30
    .line 31
    iget-object v10, v1, La/j190;->a:Ljava/lang/String;

    .line 32
    .line 33
    sget-object v0, La/b190;->V1:La/fl70;

    .line 34
    .line 35
    iget-object v0, v7, La/b190;->N1:La/ii;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 40
    .line 41
    const v1, 0x7f1307bb

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    const v1, 0x7f130e5d

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v17, La/n12;->b:La/n12;

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x5f8

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_0
    const-string v0, "actionDialogManager"

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v4

    .line 91
    :cond_1
    instance-of v0, v1, La/i190;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    check-cast v1, La/i190;

    .line 96
    .line 97
    iget-object v10, v1, La/i190;->a:Ljava/lang/String;

    .line 98
    .line 99
    sget-object v0, La/b190;->V1:La/fl70;

    .line 100
    .line 101
    iget-object v5, v7, La/b190;->O1:La/wdk0;

    .line 102
    .line 103
    if-eqz v5, :cond_2

    .line 104
    .line 105
    new-instance v6, La/xdk0;

    .line 106
    .line 107
    sget-object v9, La/rek0;->b:La/rek0;

    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/16 v15, 0x7c

    .line 111
    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    move-object v8, v6

    .line 116
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 117
    .line 118
    .line 119
    const/16 v12, 0x3dc

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    const-string v0, "snackbarManager"

    .line 129
    .line 130
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v4

    .line 134
    :cond_3
    instance-of v0, v1, La/h190;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    sget-object v0, La/b190;->V1:La/fl70;

    .line 139
    .line 140
    iget-object v0, v7, La/b190;->Q1:La/kiu0;

    .line 141
    .line 142
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, La/f190;

    .line 147
    .line 148
    iget-object v2, v7, La/b190;->S1:La/yzn0;

    .line 149
    .line 150
    sget-object v3, La/b190;->W1:[La/iiy;

    .line 151
    .line 152
    const/4 v4, 0x1

    .line 153
    aget-object v3, v3, v4

    .line 154
    .line 155
    invoke-virtual {v2, v7, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, La/we50;

    .line 160
    .line 161
    check-cast v1, La/h190;

    .line 162
    .line 163
    iget-boolean v1, v1, La/h190;->a:Z

    .line 164
    .line 165
    new-instance v3, La/e190;

    .line 166
    .line 167
    invoke-direct {v3, v2}, La/e190;-><init>(La/we50;)V

    .line 168
    .line 169
    .line 170
    if-eqz v1, :cond_4

    .line 171
    .line 172
    iget-object v0, v0, La/f190;->b:La/ol60;

    .line 173
    .line 174
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_4
    iget-object v0, v0, La/f190;->c:La/ol60;

    .line 179
    .line 180
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :goto_0
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-instance v2, La/t32;

    .line 196
    .line 197
    const/16 v3, 0x1c

    .line 198
    .line 199
    invoke-direct {v2, v3}, La/t32;-><init>(B)V

    .line 200
    .line 201
    .line 202
    if-nez v1, :cond_5

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    new-instance v3, Landroid/os/Handler;

    .line 210
    .line 211
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 216
    .line 217
    .line 218
    new-instance v4, La/b1;

    .line 219
    .line 220
    const/4 v5, 0x2

    .line 221
    invoke-direct {v4, v0, v1, v2, v5}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 222
    .line 223
    .line 224
    const-wide/16 v0, 0x0

    .line 225
    .line 226
    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 227
    .line 228
    .line 229
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 233
    .line 234
    .line 235
    :goto_2
    return-object v4

    .line 236
    :pswitch_0
    iget-object v0, v0, La/y090;->j:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, La/n190;

    .line 239
    .line 240
    sget-object v1, La/wne;->a:La/wne;

    .line 241
    .line 242
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object v1, La/b190;->V1:La/fl70;

    .line 246
    .line 247
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iget-object v1, v1, La/j4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 252
    .line 253
    iget v5, v0, La/n190;->a:I

    .line 254
    .line 255
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget-object v1, v1, La/j4r;->g:Landroidx/viewpager/widget/ViewPager;

    .line 270
    .line 271
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    if-eqz v5, :cond_9

    .line 276
    .line 277
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    iget v7, v0, La/n190;->b:I

    .line 282
    .line 283
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    iput v6, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 288
    .line 289
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 290
    .line 291
    .line 292
    iget-boolean v0, v0, La/n190;->c:Z

    .line 293
    .line 294
    if-eqz v0, :cond_8

    .line 295
    .line 296
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    iget-object v0, v0, La/j4r;->g:Landroidx/viewpager/widget/ViewPager;

    .line 301
    .line 302
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    if-eqz v1, :cond_7

    .line 307
    .line 308
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 309
    .line 310
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 311
    .line 312
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 313
    .line 314
    invoke-virtual {v1, v2, v3, v2, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 318
    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_7
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 322
    .line 323
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_8
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_9
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 331
    .line 332
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :goto_4
    return-object v4

    .line 336
    :pswitch_1
    iget-object v0, v0, La/y090;->j:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, La/l190;

    .line 339
    .line 340
    sget-object v1, La/wne;->a:La/wne;

    .line 341
    .line 342
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    sget-object v1, La/b190;->V1:La/fl70;

    .line 346
    .line 347
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    iget-object v1, v1, La/j4r;->g:Landroidx/viewpager/widget/ViewPager;

    .line 352
    .line 353
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()La/pj80;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    if-nez v1, :cond_d

    .line 358
    .line 359
    iget-object v1, v0, La/l190;->a:Ljava/util/List;

    .line 360
    .line 361
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_a

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_a
    new-instance v1, La/qzf0;

    .line 369
    .line 370
    iget-object v4, v0, La/l190;->a:Ljava/util/List;

    .line 371
    .line 372
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-direct {v1, v5, v4}, La/qzf0;-><init>(Landroidx/fragment/app/e;Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    iget-object v4, v4, La/j4r;->f:Landroidx/compose/ui/platform/ComposeView;

    .line 387
    .line 388
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    iget-object v5, v5, La/j4r;->g:Landroidx/viewpager/widget/ViewPager;

    .line 393
    .line 394
    invoke-virtual {v5, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(La/pj80;)V

    .line 395
    .line 396
    .line 397
    new-instance v6, La/rju0;

    .line 398
    .line 399
    new-instance v7, La/ka70;

    .line 400
    .line 401
    const/16 v8, 0xa

    .line 402
    .line 403
    invoke-direct {v7, v3, v1, v8}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 404
    .line 405
    .line 406
    new-instance v9, La/d4u0;

    .line 407
    .line 408
    invoke-direct {v9, v8}, La/d4u0;-><init>(B)V

    .line 409
    .line 410
    .line 411
    new-instance v8, La/t330;

    .line 412
    .line 413
    const/16 v10, 0x10

    .line 414
    .line 415
    invoke-direct {v8, v10}, La/t330;-><init>(B)V

    .line 416
    .line 417
    .line 418
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 419
    .line 420
    .line 421
    iput-object v9, v6, La/rju0;->a:Lkotlin/jvm/functions/Function1;

    .line 422
    .line 423
    iput-object v8, v6, La/rju0;->b:La/xdr;

    .line 424
    .line 425
    iput-object v7, v6, La/rju0;->c:Lkotlin/jvm/functions/Function1;

    .line 426
    .line 427
    iget-object v7, v5, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 428
    .line 429
    if-nez v7, :cond_b

    .line 430
    .line 431
    new-instance v7, Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 434
    .line 435
    .line 436
    iput-object v7, v5, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 437
    .line 438
    :cond_b
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    iget v6, v3, La/b190;->U1:I

    .line 442
    .line 443
    invoke-virtual {v5, v6}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 444
    .line 445
    .line 446
    iget-boolean v0, v0, La/l190;->b:Z

    .line 447
    .line 448
    if-eqz v0, :cond_c

    .line 449
    .line 450
    goto :goto_5

    .line 451
    :cond_c
    const/16 v2, 0x8

    .line 452
    .line 453
    :goto_5
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3}, La/b190;->G0()La/j4r;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    iget-object v0, v0, La/j4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 461
    .line 462
    new-instance v2, La/qw80;

    .line 463
    .line 464
    const/4 v4, 0x4

    .line 465
    invoke-direct {v2, v3, v1, v4}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 466
    .line 467
    .line 468
    invoke-static {v0, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 469
    .line 470
    .line 471
    :cond_d
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object v0

    .line 474
    nop

    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
