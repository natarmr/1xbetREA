.class public final La/tpg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/upg;


# direct methods
.method public synthetic constructor <init>(La/upg;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tpg;->i:B

    iput-object p1, p0, La/tpg;->k:La/upg;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tpg;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tpg;->k:La/upg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tpg;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tpg;-><init>(La/upg;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/tpg;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/tpg;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/tpg;-><init>(La/upg;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/tpg;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/tpg;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/tpg;-><init>(La/upg;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/tpg;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/tpg;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qqg;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/tpg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tpg;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tpg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/cqr;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/tpg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/tpg;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/tpg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/och;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/tpg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/tpg;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/tpg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tpg;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/tpg;->k:La/upg;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La/tpg;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/qqg;

    .line 16
    .line 17
    sget-object v2, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, La/nqg;

    .line 23
    .line 24
    iget-object v8, v0, La/tpg;->k:La/upg;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v1, La/nqg;

    .line 29
    .line 30
    iget-object v0, v1, La/nqg;->a:La/s4v0;

    .line 31
    .line 32
    sget-object v1, La/upg;->X1:La/kwd;

    .line 33
    .line 34
    iget-object v1, v0, La/s4v0;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget v0, v0, La/s4v0;->b:I

    .line 37
    .line 38
    invoke-virtual {v8}, La/upg;->H0()La/vqg;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v2, v2, La/vqg;->d:La/hzg;

    .line 43
    .line 44
    check-cast v2, La/uzg;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, La/uzg;->j(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    instance-of v0, v1, La/pqg;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v1, La/pqg;

    .line 59
    .line 60
    iget v1, v1, La/pqg;->a:I

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v6, v8, La/upg;->M1:La/wdk0;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    new-instance v7, La/xdk0;

    .line 74
    .line 75
    sget-object v10, La/rek0;->b:La/rek0;

    .line 76
    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x7c

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v13, 0x0

    .line 82
    const/4 v14, 0x0

    .line 83
    move-object v9, v7

    .line 84
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 85
    .line 86
    .line 87
    const/16 v13, 0x3fc

    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const-string v0, "snackbarManager"

    .line 97
    .line 98
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v5

    .line 102
    :cond_2
    sget-object v0, La/oqg;->a:La/oqg;

    .line 103
    .line 104
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    iget-object v0, v8, La/upg;->N1:La/cgx0;

    .line 111
    .line 112
    iput-boolean v4, v0, La/cgx0;->b:Z

    .line 113
    .line 114
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 118
    .line 119
    .line 120
    :goto_1
    return-object v5

    .line 121
    :pswitch_0
    iget-object v0, v0, La/tpg;->j:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/cqr;

    .line 124
    .line 125
    sget-object v1, La/wne;->a:La/wne;

    .line 126
    .line 127
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v1, v3, La/upg;->P1:La/qud;

    .line 131
    .line 132
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    iget-object v6, v5, La/rth;->c:Lorg/xplatform/cyber/game/core/game_background/presentation/view/TopCropFillImageView;

    .line 137
    .line 138
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    iget-object v5, v5, La/rth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 143
    .line 144
    new-instance v7, La/hfg;

    .line 145
    .line 146
    const/16 v8, 0x9

    .line 147
    .line 148
    invoke-direct {v7, v3, v8}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 158
    .line 159
    iget-object v1, v0, La/cqr;->a:Ljava/lang/String;

    .line 160
    .line 161
    new-instance v11, La/bpg;

    .line 162
    .line 163
    invoke-direct {v11, v6, v7, v2}, La/bpg;-><init>(Landroid/widget/ImageView;La/hfg;B)V

    .line 164
    .line 165
    .line 166
    new-instance v12, La/bpg;

    .line 167
    .line 168
    invoke-direct {v12, v6, v7, v4}, La/bpg;-><init>(Landroid/widget/ImageView;La/hfg;B)V

    .line 169
    .line 170
    .line 171
    const/16 v13, 0x7e

    .line 172
    .line 173
    const/4 v8, 0x0

    .line 174
    const/4 v9, 0x0

    .line 175
    const/4 v10, 0x0

    .line 176
    move-object v7, v1

    .line 177
    invoke-static/range {v6 .. v13}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget v0, v0, La/cqr;->b:I

    .line 188
    .line 189
    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_1
    iget-object v1, v3, La/upg;->N1:La/cgx0;

    .line 200
    .line 201
    iget-object v0, v0, La/tpg;->j:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, La/och;

    .line 204
    .line 205
    sget-object v6, La/wne;->a:La/wne;

    .line 206
    .line 207
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    if-eqz v0, :cond_10

    .line 211
    .line 212
    instance-of v6, v0, La/nch;

    .line 213
    .line 214
    if-eqz v6, :cond_5

    .line 215
    .line 216
    sget-object v0, La/upg;->X1:La/kwd;

    .line 217
    .line 218
    sget-object v0, La/iun;->a:La/iun;

    .line 219
    .line 220
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    iget-object v6, v6, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 225
    .line 226
    invoke-virtual {v1, v0, v6}, La/cgx0;->u(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, v3, La/upg;->S1:La/khf0;

    .line 230
    .line 231
    sget-object v1, La/upg;->Y1:[La/iiy;

    .line 232
    .line 233
    aget-object v1, v1, v4

    .line 234
    .line 235
    invoke-virtual {v0, v3, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 240
    .line 241
    iget-wide v0, v0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 242
    .line 243
    invoke-static {v0, v1}, La/ozb;->K(J)La/pb10;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v0, v0, La/rth;->d:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iget-object v0, v0, La/rth;->d:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 261
    .line 262
    iget-object v6, v3, La/upg;->L1:La/g2v;

    .line 263
    .line 264
    if-eqz v6, :cond_4

    .line 265
    .line 266
    sget-object v9, La/ikm;->b:La/ikm;

    .line 267
    .line 268
    const/4 v12, 0x0

    .line 269
    const/16 v13, 0x1fa

    .line 270
    .line 271
    const/4 v8, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    invoke-static/range {v6 .. v13}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->d(La/jkm;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_8

    .line 282
    .line 283
    :cond_4
    const-string v0, "lottieEmptyConfigurator"

    .line 284
    .line 285
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v5

    .line 289
    :cond_5
    instance-of v6, v0, La/mch;

    .line 290
    .line 291
    if-eqz v6, :cond_6

    .line 292
    .line 293
    check-cast v0, La/mch;

    .line 294
    .line 295
    sget-object v4, La/upg;->X1:La/kwd;

    .line 296
    .line 297
    sget-object v4, La/iun;->a:La/iun;

    .line 298
    .line 299
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    iget-object v5, v5, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 304
    .line 305
    invoke-virtual {v1, v4, v5}, La/cgx0;->u(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    iget-object v1, v1, La/rth;->d:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    iget-object v1, v1, La/rth;->d:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 322
    .line 323
    iget-object v2, v0, La/mch;->a:La/jkm;

    .line 324
    .line 325
    iget-short v0, v0, La/mch;->b:S

    .line 326
    .line 327
    int-to-long v4, v0

    .line 328
    new-instance v6, La/oye;

    .line 329
    .line 330
    invoke-virtual {v3}, La/upg;->H0()La/vqg;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    const/4 v12, 0x0

    .line 335
    const/16 v13, 0x16

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    const-class v17, La/vqg;

    .line 339
    .line 340
    const-string v10, "setEndTimeState"

    .line 341
    .line 342
    const-string v11, "setEndTimeState()V"

    .line 343
    .line 344
    move-object/from16 v9, v17

    .line 345
    .line 346
    invoke-direct/range {v6 .. v13}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, v2, v4, v5, v6}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->e(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    iget-object v0, v0, La/rth;->d:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 357
    .line 358
    new-instance v14, La/oye;

    .line 359
    .line 360
    invoke-virtual {v3}, La/upg;->H0()La/vqg;

    .line 361
    .line 362
    .line 363
    move-result-object v16

    .line 364
    const/16 v20, 0x0

    .line 365
    .line 366
    const/16 v21, 0x17

    .line 367
    .line 368
    const/4 v15, 0x0

    .line 369
    const-string v18, "onRefreshClick"

    .line 370
    .line 371
    const-string v19, "onRefreshClick()V"

    .line 372
    .line 373
    invoke-direct/range {v14 .. v21}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v14}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_8

    .line 380
    .line 381
    :cond_6
    instance-of v6, v0, La/lch;

    .line 382
    .line 383
    if-eqz v6, :cond_10

    .line 384
    .line 385
    check-cast v0, La/lch;

    .line 386
    .line 387
    iget-object v0, v0, La/lch;->a:Ljava/util/List;

    .line 388
    .line 389
    sget-object v6, La/upg;->X1:La/kwd;

    .line 390
    .line 391
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    iget-object v6, v6, La/rth;->d:Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 396
    .line 397
    const/16 v7, 0x8

    .line 398
    .line 399
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 400
    .line 401
    .line 402
    new-instance v6, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    :cond_7
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-eqz v9, :cond_8

    .line 416
    .line 417
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    instance-of v10, v9, La/zog;

    .line 422
    .line 423
    if-eqz v10, :cond_7

    .line 424
    .line 425
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    goto :goto_2

    .line 429
    :cond_8
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    check-cast v6, La/zog;

    .line 434
    .line 435
    if-eqz v6, :cond_9

    .line 436
    .line 437
    iget-object v8, v6, La/zog;->b:La/m5m;

    .line 438
    .line 439
    goto :goto_3

    .line 440
    :cond_9
    move-object v8, v5

    .line 441
    :goto_3
    if-eqz v8, :cond_a

    .line 442
    .line 443
    goto :goto_4

    .line 444
    :cond_a
    move-object v8, v5

    .line 445
    :goto_4
    if-eqz v8, :cond_b

    .line 446
    .line 447
    iget-object v8, v8, La/m5m;->a:La/h6m;

    .line 448
    .line 449
    iget-object v8, v8, La/h6m;->i:La/b6m;

    .line 450
    .line 451
    goto :goto_5

    .line 452
    :cond_b
    move-object v8, v5

    .line 453
    :goto_5
    if-eqz v8, :cond_f

    .line 454
    .line 455
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    iget-object v7, v7, La/rth;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 460
    .line 461
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    iget-object v2, v2, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 469
    .line 470
    iget-object v7, v3, La/upg;->U1:La/h5m;

    .line 471
    .line 472
    if-eqz v7, :cond_c

    .line 473
    .line 474
    iget-object v7, v7, La/h5m;->e:La/c3d;

    .line 475
    .line 476
    goto :goto_6

    .line 477
    :cond_c
    move-object v7, v5

    .line 478
    :goto_6
    invoke-virtual {v2, v7}, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->setNestedScrollConnection(La/vj50;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    iget-object v2, v2, La/rth;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 486
    .line 487
    new-instance v7, La/owp0;

    .line 488
    .line 489
    invoke-direct {v7, v3}, La/owp0;-><init>(La/clz;)V

    .line 490
    .line 491
    .line 492
    new-instance v8, La/eod;

    .line 493
    .line 494
    const/16 v9, 0x18

    .line 495
    .line 496
    invoke-direct {v8, v6, v3, v9}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 497
    .line 498
    .line 499
    new-instance v6, La/ugd;

    .line 500
    .line 501
    const v9, -0x1f92f051

    .line 502
    .line 503
    .line 504
    invoke-direct {v6, v9, v4, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    invoke-static {v2, v7, v5, v6}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 508
    .line 509
    .line 510
    new-instance v2, Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 513
    .line 514
    .line 515
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    :cond_d
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-eqz v4, :cond_e

    .line 524
    .line 525
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    move-object v5, v4

    .line 530
    check-cast v5, La/p6t0;

    .line 531
    .line 532
    instance-of v5, v5, La/zog;

    .line 533
    .line 534
    if-nez v5, :cond_d

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    goto :goto_7

    .line 540
    :cond_e
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    iget-object v0, v0, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 545
    .line 546
    invoke-virtual {v1, v2, v0}, La/cgx0;->u(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 547
    .line 548
    .line 549
    goto :goto_8

    .line 550
    :cond_f
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    iget-object v2, v2, La/rth;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 555
    .line 556
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    iget-object v2, v2, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 564
    .line 565
    invoke-virtual {v2, v5}, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->setNestedScrollConnection(La/vj50;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v3}, La/upg;->G0()La/rth;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    iget-object v2, v2, La/rth;->f:Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;

    .line 573
    .line 574
    invoke-virtual {v1, v0, v2}, La/cgx0;->u(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 575
    .line 576
    .line 577
    :goto_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 581
    .line 582
    .line 583
    :goto_9
    return-object v5

    .line 584
    nop

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
