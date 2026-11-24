.class public final La/dym0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/eym0;


# direct methods
.method public synthetic constructor <init>(La/eym0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dym0;->i:B

    iput-object p1, p0, La/dym0;->k:La/eym0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/dym0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/dym0;->k:La/eym0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/dym0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/dym0;-><init>(La/eym0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/dym0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/dym0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/dym0;-><init>(La/eym0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/dym0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/dym0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/dym0;-><init>(La/eym0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/dym0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/dym0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/wwm0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/dym0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/dym0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/dym0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/dym0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/dym0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/dym0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/owm0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/dym0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/dym0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/dym0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dym0;->i:B

    .line 4
    .line 5
    const-string v2, "subGamesFragmentDelegate"

    .line 6
    .line 7
    iget-object v3, v0, La/dym0;->k:La/eym0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v0, v0, La/dym0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/wwm0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/vwm0;->a:La/vwm0;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sget-object v2, La/uwm0;->a:La/uwm0;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    sget-object v0, La/eym0;->S1:La/g9m0;

    .line 33
    .line 34
    iget-object v0, v3, La/eym0;->M1:La/j6m0;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v1, La/hvm0;->j2:La/y2m0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v1, "SUB_GAME_FILTERS_DIALOG_TAG"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v5, La/hvm0;

    .line 60
    .line 61
    invoke-direct {v5}, La/hvm0;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {v3}, La/eym0;->H0()La/dzm0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, La/dzm0;->o:La/p7m0;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const-string v0, "subGameFiltersDialogFactory"

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v4

    .line 86
    :cond_2
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 96
    .line 97
    .line 98
    :goto_2
    return-object v4

    .line 99
    :pswitch_0
    check-cast v0, Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;

    .line 100
    .line 101
    sget-object v1, La/wne;->a:La/wne;

    .line 102
    .line 103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, v3, La/eym0;->N1:La/gym0;

    .line 107
    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-virtual {v3}, La/eym0;->G0()La/l5r;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v4, La/cym0;

    .line 115
    .line 116
    invoke-virtual {v3}, La/eym0;->H0()La/dzm0;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x1

    .line 122
    const/4 v5, 0x0

    .line 123
    const-class v7, La/dzm0;

    .line 124
    .line 125
    const-string v8, "onTabScrollHandled"

    .line 126
    .line 127
    const-string v9, "onTabScrollHandled()V"

    .line 128
    .line 129
    invoke-direct/range {v4 .. v11}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v2, v0, v4}, La/gym0;->a(La/l5r;Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;Lkotlin/jvm/functions/Function0;)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v4

    .line 142
    :pswitch_1
    check-cast v0, La/owm0;

    .line 143
    .line 144
    sget-object v1, La/wne;->a:La/wne;

    .line 145
    .line 146
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, v3, La/eym0;->N1:La/gym0;

    .line 150
    .line 151
    if-eqz v1, :cond_b

    .line 152
    .line 153
    invoke-virtual {v3}, La/eym0;->G0()La/l5r;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6}, La/n6r;->b()V

    .line 169
    .line 170
    .line 171
    iget-object v6, v6, La/n6r;->c:La/glz;

    .line 172
    .line 173
    new-instance v7, La/cym0;

    .line 174
    .line 175
    invoke-virtual {v3}, La/eym0;->H0()La/dzm0;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    const/4 v13, 0x0

    .line 180
    const/4 v14, 0x0

    .line 181
    const/4 v8, 0x0

    .line 182
    const-class v10, La/dzm0;

    .line 183
    .line 184
    const-string v11, "onTabScrollHandled"

    .line 185
    .line 186
    const-string v12, "onTabScrollHandled()V"

    .line 187
    .line 188
    invoke-direct/range {v7 .. v14}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 189
    .line 190
    .line 191
    new-instance v8, La/j1l0;

    .line 192
    .line 193
    const/16 v9, 0x11

    .line 194
    .line 195
    invoke-direct {v8, v3, v9}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 196
    .line 197
    .line 198
    iget-object v3, v2, La/l5r;->b:La/vd7;

    .line 199
    .line 200
    iget-object v9, v3, La/vd7;->c:Landroid/view/View;

    .line 201
    .line 202
    check-cast v9, Landroidx/compose/ui/platform/ComposeView;

    .line 203
    .line 204
    iget-object v10, v3, La/vd7;->b:Landroid/view/ViewGroup;

    .line 205
    .line 206
    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 207
    .line 208
    iget-object v11, v2, La/l5r;->c:La/uk5;

    .line 209
    .line 210
    iget-object v12, v11, La/uk5;->b:Landroid/view/ViewGroup;

    .line 211
    .line 212
    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 213
    .line 214
    iget-object v13, v11, La/uk5;->e:Landroid/view/View;

    .line 215
    .line 216
    check-cast v13, Lorg/xplatform/ui_core/viewcomponents/tabs/TabLayoutChips;

    .line 217
    .line 218
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    instance-of v14, v0, La/mwm0;

    .line 225
    .line 226
    if-eqz v14, :cond_9

    .line 227
    .line 228
    check-cast v0, La/mwm0;

    .line 229
    .line 230
    iget-object v3, v0, La/mwm0;->c:Ljava/util/List;

    .line 231
    .line 232
    iput-object v3, v1, La/gym0;->e:Ljava/util/List;

    .line 233
    .line 234
    iget-object v3, v11, La/uk5;->f:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 237
    .line 238
    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    if-nez v14, :cond_5

    .line 243
    .line 244
    new-instance v14, La/ex7;

    .line 245
    .line 246
    iget-object v15, v1, La/gym0;->a:La/a530;

    .line 247
    .line 248
    iget-object v4, v1, La/gym0;->f:La/ms2;

    .line 249
    .line 250
    invoke-direct {v14, v5, v6, v15, v4}, La/ex7;-><init>(Landroidx/fragment/app/e;La/glz;La/a530;La/ms2;)V

    .line 251
    .line 252
    .line 253
    iget-object v4, v1, La/gym0;->e:Ljava/util/List;

    .line 254
    .line 255
    iget-object v5, v14, La/zx5;->n:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v5, La/yz3;

    .line 258
    .line 259
    const/4 v6, 0x0

    .line 260
    invoke-virtual {v5, v4, v6}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 261
    .line 262
    .line 263
    iput-object v14, v1, La/gym0;->c:La/ex7;

    .line 264
    .line 265
    invoke-virtual {v3, v14}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 266
    .line 267
    .line 268
    iget-object v4, v2, La/l5r;->a:Landroid/widget/FrameLayout;

    .line 269
    .line 270
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    const v5, 0x7f070717

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    new-instance v5, La/hhk;

    .line 282
    .line 283
    new-instance v6, La/xn30;

    .line 284
    .line 285
    invoke-direct {v6, v1, v4, v2, v8}, La/xn30;-><init>(La/gym0;ILa/l5r;La/j1l0;)V

    .line 286
    .line 287
    .line 288
    invoke-direct {v5, v13, v3, v6}, La/hhk;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;La/ybo0;)V

    .line 289
    .line 290
    .line 291
    iput-object v5, v1, La/gym0;->d:La/hhk;

    .line 292
    .line 293
    invoke-virtual {v5}, La/hhk;->a()V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_5
    iget-object v3, v1, La/gym0;->c:La/ex7;

    .line 298
    .line 299
    if-eqz v3, :cond_6

    .line 300
    .line 301
    iget-object v4, v1, La/gym0;->e:Ljava/util/List;

    .line 302
    .line 303
    iget-object v3, v3, La/zx5;->n:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v3, La/yz3;

    .line 306
    .line 307
    const/4 v6, 0x0

    .line 308
    invoke-virtual {v3, v4, v6}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 309
    .line 310
    .line 311
    :cond_6
    :goto_3
    iget-object v3, v0, La/mwm0;->d:Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;

    .line 312
    .line 313
    invoke-virtual {v1, v2, v3, v7}, La/gym0;->a(La/l5r;Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;Lkotlin/jvm/functions/Function0;)V

    .line 314
    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    invoke-virtual {v12, v1}, Landroid/view/View;->setVisibility(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v13, v1}, Landroid/view/View;->setVisibility(I)V

    .line 321
    .line 322
    .line 323
    iget-object v1, v11, La/uk5;->g:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v1, Landroid/widget/ImageView;

    .line 326
    .line 327
    iget-boolean v2, v0, La/mwm0;->a:Z

    .line 328
    .line 329
    if-eqz v2, :cond_7

    .line 330
    .line 331
    const/4 v2, 0x0

    .line 332
    goto :goto_4

    .line 333
    :cond_7
    const/16 v2, 0x8

    .line 334
    .line 335
    :goto_4
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 336
    .line 337
    .line 338
    iget-object v1, v11, La/uk5;->d:Landroid/view/View;

    .line 339
    .line 340
    check-cast v1, Landroid/widget/ImageView;

    .line 341
    .line 342
    iget-boolean v0, v0, La/mwm0;->b:Z

    .line 343
    .line 344
    if-eqz v0, :cond_8

    .line 345
    .line 346
    const/4 v15, 0x0

    .line 347
    goto :goto_5

    .line 348
    :cond_8
    const/16 v15, 0x8

    .line 349
    .line 350
    :goto_5
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 351
    .line 352
    .line 353
    const/16 v2, 0x8

    .line 354
    .line 355
    invoke-virtual {v10, v2}, Landroid/view/View;->setVisibility(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v9}, La/x1;->e()V

    .line 362
    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_9
    const/16 v2, 0x8

    .line 366
    .line 367
    sget-object v4, La/nwm0;->a:La/nwm0;

    .line 368
    .line 369
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_a

    .line 374
    .line 375
    const/4 v0, 0x4

    .line 376
    invoke-virtual {v12, v0}, Landroid/view/View;->setVisibility(I)V

    .line 377
    .line 378
    .line 379
    const/4 v0, 0x0

    .line 380
    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 381
    .line 382
    .line 383
    iget-object v3, v3, La/vd7;->d:Landroid/view/View;

    .line 384
    .line 385
    check-cast v3, Landroid/widget/TextView;

    .line 386
    .line 387
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 391
    .line 392
    .line 393
    new-instance v0, La/edk0;

    .line 394
    .line 395
    const/16 v2, 0x1c

    .line 396
    .line 397
    invoke-direct {v0, v1, v2}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 398
    .line 399
    .line 400
    new-instance v1, La/ugd;

    .line 401
    .line 402
    const v2, -0x797caf15

    .line 403
    .line 404
    .line 405
    const/4 v3, 0x1

    .line 406
    invoke-direct {v1, v2, v3, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v9, v1}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 410
    .line 411
    .line 412
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 416
    .line 417
    .line 418
    const/4 v4, 0x0

    .line 419
    :goto_7
    return-object v4

    .line 420
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    const/16 v16, 0x0

    .line 424
    .line 425
    throw v16

    .line 426
    nop

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
