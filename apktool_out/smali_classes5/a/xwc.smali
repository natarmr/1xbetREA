.class public final La/xwc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ywc;


# direct methods
.method public synthetic constructor <init>(La/ywc;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xwc;->i:B

    iput-object p1, p0, La/xwc;->k:La/ywc;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xwc;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xwc;->k:La/ywc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/xwc;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/xwc;-><init>(La/ywc;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/xwc;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/xwc;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/xwc;-><init>(La/ywc;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/xwc;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/xwc;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/xwc;-><init>(La/ywc;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/xwc;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/xwc;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/exc;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xwc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kxc;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/xwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/xwc;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/xwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/xwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/xwc;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/xwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xwc;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/xwc;->k:La/ywc;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, La/xwc;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/exc;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-eqz v0, :cond_9

    .line 22
    .line 23
    instance-of v1, v0, La/cxc;

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    const/4 v6, 0x0

    .line 27
    const/16 v7, 0x8

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    check-cast v0, La/cxc;

    .line 32
    .line 33
    sget-object v1, La/ywc;->W1:La/kl5;

    .line 34
    .line 35
    invoke-virtual {v3}, La/ywc;->G0()La/dzq;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, v1, La/dzq;->e:La/nq8;

    .line 40
    .line 41
    iget-object v4, v1, La/dzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 42
    .line 43
    iget-object v2, v2, La/nq8;->c:Landroid/view/View;

    .line 44
    .line 45
    check-cast v2, Landroid/widget/ProgressBar;

    .line 46
    .line 47
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v1, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 51
    .line 52
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v1, La/dzq;->c:Lcom/google/android/material/tabs/TabLayout;

    .line 56
    .line 57
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, La/cxc;->a:La/jkm;

    .line 61
    .line 62
    iget-wide v7, v0, La/cxc;->b:J

    .line 63
    .line 64
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 65
    .line 66
    new-instance v0, La/bmh;

    .line 67
    .line 68
    const/16 v2, 0xc

    .line 69
    .line 70
    invoke-direct {v0, v2}, La/bmh;-><init>(B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v1, v7, v8, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, La/vwc;

    .line 77
    .line 78
    invoke-direct {v0, v3, v5}, La/vwc;-><init>(La/ywc;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_0
    instance-of v1, v0, La/dxc;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    sget-object v0, La/ywc;->W1:La/kl5;

    .line 94
    .line 95
    invoke-virtual {v3}, La/ywc;->G0()La/dzq;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v1, v0, La/dzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 100
    .line 101
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v0, La/dzq;->e:La/nq8;

    .line 105
    .line 106
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 107
    .line 108
    check-cast v1, Landroid/widget/ProgressBar;

    .line 109
    .line 110
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 114
    .line 115
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :cond_1
    instance-of v1, v0, La/bxc;

    .line 121
    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    check-cast v0, La/bxc;

    .line 125
    .line 126
    iget-object v0, v0, La/bxc;->a:Ljava/util/List;

    .line 127
    .line 128
    sget-object v1, La/ywc;->W1:La/kl5;

    .line 129
    .line 130
    invoke-virtual {v3}, La/ywc;->G0()La/dzq;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v1, v1, La/dzq;->e:La/nq8;

    .line 135
    .line 136
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 137
    .line 138
    check-cast v1, Landroid/widget/ProgressBar;

    .line 139
    .line 140
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, La/ywc;->G0()La/dzq;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget-object v1, v1, La/dzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 148
    .line 149
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v3, La/ywc;->S1:La/gxc;

    .line 153
    .line 154
    if-eqz v1, :cond_2

    .line 155
    .line 156
    invoke-virtual {v1, v0}, La/gxc;->G(Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {v3}, La/ywc;->G0()La/dzq;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    iget-object v8, v8, La/dzq;->c:Lcom/google/android/material/tabs/TabLayout;

    .line 168
    .line 169
    if-le v1, v2, :cond_3

    .line 170
    .line 171
    move v7, v6

    .line 172
    :cond_3
    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, La/ywc;->H0()La/qxc;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iget-object v2, v3, La/ywc;->M1:La/zz2;

    .line 180
    .line 181
    sget-object v7, La/ywc;->X1:[La/iiy;

    .line 182
    .line 183
    aget-object v8, v7, v6

    .line 184
    .line 185
    invoke-virtual {v2, v3, v8}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    iget-object v8, v3, La/ywc;->O1:La/zz2;

    .line 194
    .line 195
    aget-object v5, v7, v5

    .line 196
    .line 197
    invoke-virtual {v8, v3, v5}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    iget-object v5, v1, La/qxc;->m:La/p7m0;

    .line 206
    .line 207
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    check-cast v7, La/yvc;

    .line 212
    .line 213
    iget v7, v7, La/yvc;->c:I

    .line 214
    .line 215
    iget-object v1, v1, La/qxc;->l:La/ol60;

    .line 216
    .line 217
    const/4 v8, -0x1

    .line 218
    if-ne v7, v8, :cond_8

    .line 219
    .line 220
    new-instance v5, La/ixc;

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-eqz v7, :cond_5

    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    check-cast v7, La/uvc;

    .line 237
    .line 238
    iget v7, v7, La/uvc;->a:I

    .line 239
    .line 240
    if-ne v7, v2, :cond_4

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_5
    move v6, v8

    .line 247
    :goto_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-eq v6, v8, :cond_6

    .line 252
    .line 253
    move-object v4, v0

    .line 254
    :cond_6
    if-eqz v4, :cond_7

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    :cond_7
    invoke-direct {v5, v3}, La/ixc;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v5}, La/ol60;->f(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_8
    new-instance v0, La/jxc;

    .line 268
    .line 269
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    check-cast v2, La/yvc;

    .line 274
    .line 275
    iget v2, v2, La/yvc;->c:I

    .line 276
    .line 277
    invoke-direct {v0, v2}, La/jxc;-><init>(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 287
    .line 288
    .line 289
    :goto_3
    return-object v4

    .line 290
    :pswitch_0
    iget-object v1, v0, La/xwc;->j:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v1, La/kxc;

    .line 293
    .line 294
    sget-object v3, La/wne;->a:La/wne;

    .line 295
    .line 296
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    if-eqz v1, :cond_d

    .line 300
    .line 301
    instance-of v3, v1, La/ixc;

    .line 302
    .line 303
    iget-object v7, v0, La/xwc;->k:La/ywc;

    .line 304
    .line 305
    if-eqz v3, :cond_a

    .line 306
    .line 307
    check-cast v1, La/ixc;

    .line 308
    .line 309
    iget v0, v1, La/ixc;->a:I

    .line 310
    .line 311
    sget-object v1, La/ywc;->W1:La/kl5;

    .line 312
    .line 313
    invoke-virtual {v7}, La/ywc;->G0()La/dzq;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    iget-object v1, v1, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 318
    .line 319
    invoke-virtual {v1, v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_a
    instance-of v0, v1, La/jxc;

    .line 324
    .line 325
    if-eqz v0, :cond_b

    .line 326
    .line 327
    check-cast v1, La/jxc;

    .line 328
    .line 329
    iget v0, v1, La/jxc;->a:I

    .line 330
    .line 331
    sget-object v1, La/ywc;->W1:La/kl5;

    .line 332
    .line 333
    invoke-virtual {v7}, La/ywc;->G0()La/dzq;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    iget-object v1, v1, La/dzq;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 338
    .line 339
    invoke-virtual {v1, v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 340
    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_b
    instance-of v0, v1, La/hxc;

    .line 344
    .line 345
    if-eqz v0, :cond_d

    .line 346
    .line 347
    check-cast v1, La/hxc;

    .line 348
    .line 349
    iget-object v0, v1, La/hxc;->a:Ljava/lang/String;

    .line 350
    .line 351
    sget-object v1, La/ywc;->W1:La/kl5;

    .line 352
    .line 353
    new-instance v1, Landroid/content/Intent;

    .line 354
    .line 355
    const-string v2, "android.intent.action.VIEW"

    .line 356
    .line 357
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 362
    .line 363
    .line 364
    :try_start_0
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :catch_0
    iget-object v5, v7, La/ywc;->L1:La/wdk0;

    .line 369
    .line 370
    if-eqz v5, :cond_c

    .line 371
    .line 372
    new-instance v6, La/xdk0;

    .line 373
    .line 374
    sget-object v9, La/rek0;->b:La/rek0;

    .line 375
    .line 376
    const v0, 0x7f130a82

    .line 377
    .line 378
    .line 379
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const/16 v15, 0x7c

    .line 388
    .line 389
    const/4 v11, 0x0

    .line 390
    const/4 v12, 0x0

    .line 391
    const/4 v13, 0x0

    .line 392
    move-object v8, v6

    .line 393
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 394
    .line 395
    .line 396
    const/16 v12, 0x3fc

    .line 397
    .line 398
    const/4 v8, 0x0

    .line 399
    const/4 v9, 0x0

    .line 400
    const/4 v10, 0x0

    .line 401
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 402
    .line 403
    .line 404
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_c
    const-string v0, "snackbarManager"

    .line 408
    .line 409
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v4

    .line 413
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 414
    .line 415
    .line 416
    :goto_5
    return-object v4

    .line 417
    :pswitch_1
    iget-object v0, v0, La/xwc;->j:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Ljava/lang/String;

    .line 420
    .line 421
    sget-object v1, La/wne;->a:La/wne;

    .line 422
    .line 423
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    iget-object v1, v3, La/ywc;->S1:La/gxc;

    .line 427
    .line 428
    if-eqz v1, :cond_e

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iput-object v0, v1, La/gxc;->k:Ljava/lang/String;

    .line 434
    .line 435
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    return-object v0

    .line 438
    nop

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
