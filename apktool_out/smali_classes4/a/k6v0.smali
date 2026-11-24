.class public final La/k6v0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/l6v0;


# direct methods
.method public synthetic constructor <init>(La/l6v0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k6v0;->i:B

    iput-object p1, p0, La/k6v0;->k:La/l6v0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k6v0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k6v0;->k:La/l6v0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k6v0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/k6v0;-><init>(La/l6v0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/k6v0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/k6v0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/k6v0;-><init>(La/l6v0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/k6v0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/k6v0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/k6v0;-><init>(La/l6v0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/k6v0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/k6v0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/u6v0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/k6v0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k6v0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k6v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/b7v0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/k6v0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/k6v0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/k6v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/a7v0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/k6v0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/k6v0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/k6v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/k6v0;->i:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/k6v0;->k:La/l6v0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object p0, p0, La/k6v0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/u6v0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    instance-of p1, p0, La/t6v0;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    check-cast p0, La/t6v0;

    .line 28
    .line 29
    iget-object p0, p0, La/t6v0;->a:La/ra10;

    .line 30
    .line 31
    sget-object p1, La/l6v0;->P1:La/sxs0;

    .line 32
    .line 33
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/k2r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object p0, p0, La/k2r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-object p0, p0, La/k2r;->i:Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p0, p0, La/k2r;->f:Landroid/widget/FrameLayout;

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    instance-of p1, p0, La/s6v0;

    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    sget-object p0, La/l6v0;->P1:La/sxs0;

    .line 75
    .line 76
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iget-object p0, p0, La/k2r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object p0, p0, La/k2r;->i:Landroid/widget/TextView;

    .line 90
    .line 91
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    instance-of p0, p0, La/r6v0;

    .line 96
    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 103
    .line 104
    .line 105
    :goto_1
    return-object v2

    .line 106
    :pswitch_0
    check-cast p0, La/b7v0;

    .line 107
    .line 108
    sget-object v0, La/wne;->a:La/wne;

    .line 109
    .line 110
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    if-eqz p0, :cond_4

    .line 114
    .line 115
    iget-wide v0, p0, La/b7v0;->a:J

    .line 116
    .line 117
    iget p0, p0, La/b7v0;->b:I

    .line 118
    .line 119
    sget-object p1, La/l6v0;->P1:La/sxs0;

    .line 120
    .line 121
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object p1, p1, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 126
    .line 127
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 135
    .line 136
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->O(I)La/xhe0;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, La/rij;

    .line 141
    .line 142
    if-eqz p0, :cond_3

    .line 143
    .line 144
    iget-object p0, p0, La/rij;->w:La/zyx;

    .line 145
    .line 146
    iget-object p0, p0, La/zyx;->g:Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 147
    .line 148
    new-instance p1, Ljava/util/Date;

    .line 149
    .line 150
    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1, v4}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->v(Ljava/util/Date;Z)V

    .line 154
    .line 155
    .line 156
    :cond_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 160
    .line 161
    .line 162
    :goto_2
    return-object v2

    .line 163
    :pswitch_1
    check-cast p0, La/a7v0;

    .line 164
    .line 165
    sget-object v0, La/wne;->a:La/wne;

    .line 166
    .line 167
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    if-eqz p0, :cond_f

    .line 171
    .line 172
    instance-of p1, p0, La/y6v0;

    .line 173
    .line 174
    if-eqz p1, :cond_5

    .line 175
    .line 176
    check-cast p0, La/y6v0;

    .line 177
    .line 178
    iget-object p0, p0, La/y6v0;->a:Ljava/util/ArrayList;

    .line 179
    .line 180
    sget-object p1, La/l6v0;->P1:La/sxs0;

    .line 181
    .line 182
    new-instance p1, La/yr50;

    .line 183
    .line 184
    new-instance v5, La/avs0;

    .line 185
    .line 186
    invoke-virtual {v3}, La/l6v0;->H0()La/d7v0;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    const/4 v11, 0x0

    .line 191
    const/16 v12, 0xa

    .line 192
    .line 193
    const/4 v6, 0x0

    .line 194
    const-class v8, La/d7v0;

    .line 195
    .line 196
    const-string v9, "onPlayClick"

    .line 197
    .line 198
    const-string v10, "onPlayClick()V"

    .line 199
    .line 200
    invoke-direct/range {v5 .. v12}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 201
    .line 202
    .line 203
    new-instance v0, La/g6v0;

    .line 204
    .line 205
    const/4 v1, 0x2

    .line 206
    invoke-direct {v0, v3, v1}, La/g6v0;-><init>(La/l6v0;B)V

    .line 207
    .line 208
    .line 209
    const/4 v1, 0x1

    .line 210
    invoke-direct {p1, v1, v0, v5}, La/yr50;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v0, v0, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 218
    .line 219
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, p0}, La/i26;->G(Ljava/util/List;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    iget-object p0, p0, La/k2r;->b:Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;

    .line 230
    .line 231
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    iget-object p0, p0, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 239
    .line 240
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    add-int/2addr p0, v1

    .line 245
    invoke-virtual {v3, p0}, La/l6v0;->I0(I)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_6

    .line 249
    .line 250
    :cond_5
    instance-of p1, p0, La/x6v0;

    .line 251
    .line 252
    if-eqz p1, :cond_9

    .line 253
    .line 254
    check-cast p0, La/x6v0;

    .line 255
    .line 256
    iget p1, p0, La/x6v0;->a:I

    .line 257
    .line 258
    iget-boolean p0, p0, La/x6v0;->b:Z

    .line 259
    .line 260
    sget-object v0, La/l6v0;->P1:La/sxs0;

    .line 261
    .line 262
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iget-object v0, v0, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 267
    .line 268
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v0, v0, La/k2r;->b:Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;

    .line 276
    .line 277
    :goto_3
    const/4 v1, 0x7

    .line 278
    if-ge v4, v1, :cond_e

    .line 279
    .line 280
    if-lt v4, p1, :cond_8

    .line 281
    .line 282
    if-ne v4, p1, :cond_6

    .line 283
    .line 284
    if-eqz p0, :cond_6

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_6
    if-ne v4, p1, :cond_7

    .line 288
    .line 289
    const v1, 0x7f0803a7

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_7
    const v1, 0x7f080f76

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_8
    :goto_4
    const v1, 0x7f08037a

    .line 298
    .line 299
    .line 300
    :goto_5
    iget-object v2, v0, Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;->a:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    check-cast v2, Landroid/view/View;

    .line 307
    .line 308
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 309
    .line 310
    .line 311
    add-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_9
    instance-of p1, p0, La/w6v0;

    .line 315
    .line 316
    if-eqz p1, :cond_a

    .line 317
    .line 318
    sget-object p0, La/l6v0;->P1:La/sxs0;

    .line 319
    .line 320
    new-instance p0, Landroid/os/Bundle;

    .line 321
    .line 322
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 323
    .line 324
    .line 325
    const-string p1, "CHANGE_TAB_ARG"

    .line 326
    .line 327
    sget-object v0, La/t270;->a:La/t270;

    .line 328
    .line 329
    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 330
    .line 331
    .line 332
    const-string p1, "CHANGE_TAB_REQUEST_KEY"

    .line 333
    .line 334
    invoke-static {p0, v3, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_a
    instance-of p1, p0, La/z6v0;

    .line 339
    .line 340
    if-eqz p1, :cond_d

    .line 341
    .line 342
    check-cast p0, La/z6v0;

    .line 343
    .line 344
    iget-boolean p0, p0, La/z6v0;->a:Z

    .line 345
    .line 346
    sget-object p1, La/l6v0;->P1:La/sxs0;

    .line 347
    .line 348
    if-eqz p0, :cond_b

    .line 349
    .line 350
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    iget-object p1, p1, La/k2r;->e:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 355
    .line 356
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 357
    .line 358
    .line 359
    :cond_b
    invoke-virtual {v3}, La/l6v0;->G0()La/k2r;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    iget-object p1, p1, La/k2r;->f:Landroid/widget/FrameLayout;

    .line 364
    .line 365
    if-eqz p0, :cond_c

    .line 366
    .line 367
    move v1, v4

    .line 368
    :cond_c
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_d
    instance-of p0, p0, La/v6v0;

    .line 373
    .line 374
    if-eqz p0, :cond_f

    .line 375
    .line 376
    :cond_e
    :goto_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 380
    .line 381
    .line 382
    :goto_7
    return-object v2

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
