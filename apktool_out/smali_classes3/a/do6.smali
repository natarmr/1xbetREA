.class public final La/do6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/fo6;


# direct methods
.method public synthetic constructor <init>(La/fo6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/do6;->i:B

    iput-object p1, p0, La/do6;->k:La/fo6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/do6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/do6;->k:La/fo6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/do6;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/do6;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/do6;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/do6;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/do6;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/do6;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/do6;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/do6;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/do6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/plt0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/do6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/do6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/do6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/dv7;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/do6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/do6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/do6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/xn20;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/do6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/do6;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/do6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/zv7;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/do6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/do6;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/do6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/do6;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/do6;->k:La/fo6;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/do6;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/plt0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    instance-of v1, v0, La/olt0;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v0, La/olt0;

    .line 31
    .line 32
    iget-object v0, v0, La/olt0;->a:La/il60;

    .line 33
    .line 34
    iget v2, v0, La/il60;->a:I

    .line 35
    .line 36
    invoke-static {v2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget v0, v0, La/il60;->b:I

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, La/xn6;->c:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    move v1, v2

    .line 62
    sget-object v2, La/rek0;->b:La/rek0;

    .line 63
    .line 64
    iget-object v3, v0, La/do6;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, La/dv7;

    .line 67
    .line 68
    sget-object v6, La/wne;->a:La/wne;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    if-eqz v3, :cond_16

    .line 74
    .line 75
    instance-of v6, v3, La/vu7;

    .line 76
    .line 77
    const-string v7, "snackbarManager"

    .line 78
    .line 79
    iget-object v10, v0, La/do6;->k:La/fo6;

    .line 80
    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    check-cast v3, La/vu7;

    .line 84
    .line 85
    iget-object v3, v3, La/vu7;->a:Ljava/lang/String;

    .line 86
    .line 87
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 88
    .line 89
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const v1, 0x7f01005a

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, v10, La/fo6;->V1:La/a8z;

    .line 101
    .line 102
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/xv6;

    .line 107
    .line 108
    iget-object v1, v1, La/zz3;->e:La/yz3;

    .line 109
    .line 110
    iget-object v1, v1, La/yz3;->f:Ljava/util/List;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_3

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    add-int/lit8 v8, v4, 0x1

    .line 130
    .line 131
    if-ltz v4, :cond_2

    .line 132
    .line 133
    check-cast v6, La/p6t0;

    .line 134
    .line 135
    instance-of v6, v6, La/wnp0;

    .line 136
    .line 137
    if-eqz v6, :cond_1

    .line 138
    .line 139
    invoke-virtual {v10}, La/fo6;->G0()La/xn6;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    iget-object v6, v6, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 144
    .line 145
    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/RecyclerView;->O(I)La/xhe0;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    if-eqz v4, :cond_1

    .line 150
    .line 151
    iget-object v4, v4, La/xhe0;->a:Landroid/view/View;

    .line 152
    .line 153
    if-eqz v4, :cond_1

    .line 154
    .line 155
    invoke-virtual {v4, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 156
    .line 157
    .line 158
    :cond_1
    move v4, v8

    .line 159
    goto :goto_0

    .line 160
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 161
    .line 162
    .line 163
    throw v5

    .line 164
    :cond_3
    iget-object v0, v10, La/fo6;->S1:La/wdk0;

    .line 165
    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    new-instance v1, La/xdk0;

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    const/16 v8, 0x7c

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    const/4 v5, 0x0

    .line 175
    const/4 v6, 0x0

    .line 176
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const/16 v15, 0x3fc

    .line 181
    .line 182
    const/4 v11, 0x0

    .line 183
    const/4 v12, 0x0

    .line 184
    const/4 v13, 0x0

    .line 185
    move-object v8, v0

    .line 186
    move-object v9, v1

    .line 187
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 188
    .line 189
    .line 190
    goto/16 :goto_1

    .line 191
    .line 192
    :cond_4
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v5

    .line 196
    :cond_5
    instance-of v0, v3, La/wu7;

    .line 197
    .line 198
    const-string v4, "actionDialogManager"

    .line 199
    .line 200
    const v6, 0x7f13032f

    .line 201
    .line 202
    .line 203
    const v8, 0x7f1307bb

    .line 204
    .line 205
    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    check-cast v3, La/wu7;

    .line 209
    .line 210
    iget-object v13, v3, La/wu7;->a:Ljava/lang/String;

    .line 211
    .line 212
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 213
    .line 214
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->S()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_14

    .line 219
    .line 220
    iget-object v0, v10, La/fo6;->L1:La/ii;

    .line 221
    .line 222
    if-eqz v0, :cond_6

    .line 223
    .line 224
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 225
    .line 226
    invoke-virtual {v10, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    const v1, 0x7f13115a

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v10, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    sget-object v20, La/n12;->b:La/n12;

    .line 245
    .line 246
    const/16 v21, 0x0

    .line 247
    .line 248
    const/16 v22, 0x5d0

    .line 249
    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    const-string v17, "REQUEST_BALANCE_ERROR_DIALOG_KEY"

    .line 253
    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v5

    .line 277
    :cond_7
    instance-of v0, v3, La/xu7;

    .line 278
    .line 279
    const v9, 0x7f130e5d

    .line 280
    .line 281
    .line 282
    if-eqz v0, :cond_9

    .line 283
    .line 284
    check-cast v3, La/xu7;

    .line 285
    .line 286
    iget-object v12, v3, La/xu7;->a:Ljava/lang/String;

    .line 287
    .line 288
    iget-object v13, v3, La/xu7;->b:Ljava/lang/String;

    .line 289
    .line 290
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 291
    .line 292
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->S()Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_14

    .line 297
    .line 298
    iget-object v0, v10, La/fo6;->L1:La/ii;

    .line 299
    .line 300
    if-eqz v0, :cond_8

    .line 301
    .line 302
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 303
    .line 304
    invoke-virtual {v10, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object v20, La/n12;->b:La/n12;

    .line 312
    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    const/16 v22, 0x5f8

    .line 316
    .line 317
    const/4 v15, 0x0

    .line 318
    const/16 v16, 0x0

    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const/16 v18, 0x0

    .line 323
    .line 324
    const/16 v19, 0x0

    .line 325
    .line 326
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v5

    .line 345
    :cond_9
    instance-of v0, v3, La/yu7;

    .line 346
    .line 347
    if-eqz v0, :cond_b

    .line 348
    .line 349
    check-cast v3, La/yu7;

    .line 350
    .line 351
    iget-boolean v0, v3, La/yu7;->a:Z

    .line 352
    .line 353
    sget-object v1, La/fo6;->W1:La/kj5;

    .line 354
    .line 355
    if-eqz v0, :cond_a

    .line 356
    .line 357
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :cond_a
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :cond_b
    instance-of v0, v3, La/zu7;

    .line 376
    .line 377
    if-eqz v0, :cond_d

    .line 378
    .line 379
    check-cast v3, La/zu7;

    .line 380
    .line 381
    iget-boolean v0, v3, La/zu7;->a:Z

    .line 382
    .line 383
    iget-boolean v2, v3, La/zu7;->b:Z

    .line 384
    .line 385
    sget-object v3, La/fo6;->W1:La/kj5;

    .line 386
    .line 387
    if-eqz v0, :cond_c

    .line 388
    .line 389
    new-instance v0, La/is6;

    .line 390
    .line 391
    invoke-direct {v0}, La/is6;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-static {v0, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_1

    .line 405
    .line 406
    :cond_c
    sget-object v0, La/zp6;->m2:La/yk5;

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    new-instance v0, La/zp6;

    .line 412
    .line 413
    invoke-direct {v0}, La/zp6;-><init>()V

    .line 414
    .line 415
    .line 416
    sget-object v3, La/zp6;->n2:[La/iiy;

    .line 417
    .line 418
    aget-object v1, v3, v1

    .line 419
    .line 420
    iget-object v3, v0, La/zp6;->k2:La/cgx0;

    .line 421
    .line 422
    invoke-virtual {v3, v0, v1, v2}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-static {v0, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_1

    .line 436
    .line 437
    :cond_d
    instance-of v0, v3, La/av7;

    .line 438
    .line 439
    if-eqz v0, :cond_f

    .line 440
    .line 441
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 442
    .line 443
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    if-eqz v0, :cond_14

    .line 448
    .line 449
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    iget-object v1, v10, La/fo6;->R1:La/xi70;

    .line 454
    .line 455
    if-eqz v1, :cond_e

    .line 456
    .line 457
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :cond_e
    const-string v0, "quickBetDialogNavigator"

    .line 463
    .line 464
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    throw v5

    .line 468
    :cond_f
    instance-of v0, v3, La/bv7;

    .line 469
    .line 470
    if-eqz v0, :cond_11

    .line 471
    .line 472
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 473
    .line 474
    iget-object v8, v10, La/fo6;->S1:La/wdk0;

    .line 475
    .line 476
    if-eqz v8, :cond_10

    .line 477
    .line 478
    new-instance v9, La/xdk0;

    .line 479
    .line 480
    sget-object v12, La/qek0;->a:La/qek0;

    .line 481
    .line 482
    const v0, 0x7f130e86

    .line 483
    .line 484
    .line 485
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v13

    .line 489
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/16 v18, 0x7c

    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const/4 v15, 0x0

    .line 498
    const/16 v16, 0x0

    .line 499
    .line 500
    move-object v11, v9

    .line 501
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 502
    .line 503
    .line 504
    const/16 v15, 0x3fc

    .line 505
    .line 506
    const/4 v11, 0x0

    .line 507
    const/4 v12, 0x0

    .line 508
    const/4 v13, 0x0

    .line 509
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 510
    .line 511
    .line 512
    goto :goto_1

    .line 513
    :cond_10
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    throw v5

    .line 517
    :cond_11
    instance-of v0, v3, La/uu7;

    .line 518
    .line 519
    if-eqz v0, :cond_13

    .line 520
    .line 521
    check-cast v3, La/uu7;

    .line 522
    .line 523
    iget-object v13, v3, La/uu7;->a:Ljava/lang/String;

    .line 524
    .line 525
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 526
    .line 527
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->S()Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_14

    .line 532
    .line 533
    iget-object v0, v10, La/fo6;->L1:La/ii;

    .line 534
    .line 535
    if-eqz v0, :cond_12

    .line 536
    .line 537
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 538
    .line 539
    invoke-virtual {v10, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v12

    .line 543
    invoke-virtual {v10, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v14

    .line 547
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v10, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    sget-object v20, La/n12;->b:La/n12;

    .line 555
    .line 556
    const/16 v21, 0x0

    .line 557
    .line 558
    const/16 v22, 0x5d0

    .line 559
    .line 560
    const/16 v16, 0x0

    .line 561
    .line 562
    const-string v17, "REQUEST_BET_EXISTS_DIALOG_KEY"

    .line 563
    .line 564
    const/16 v18, 0x0

    .line 565
    .line 566
    const/16 v19, 0x0

    .line 567
    .line 568
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 579
    .line 580
    .line 581
    goto :goto_1

    .line 582
    :cond_12
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw v5

    .line 586
    :cond_13
    instance-of v0, v3, La/cv7;

    .line 587
    .line 588
    if-eqz v0, :cond_16

    .line 589
    .line 590
    iget-object v0, v10, La/fo6;->S1:La/wdk0;

    .line 591
    .line 592
    if-eqz v0, :cond_15

    .line 593
    .line 594
    new-instance v1, La/xdk0;

    .line 595
    .line 596
    check-cast v3, La/cv7;

    .line 597
    .line 598
    iget-object v3, v3, La/cv7;->a:Ljava/lang/String;

    .line 599
    .line 600
    const/4 v7, 0x0

    .line 601
    const/16 v8, 0x7c

    .line 602
    .line 603
    const/4 v4, 0x0

    .line 604
    const/4 v5, 0x0

    .line 605
    const/4 v6, 0x0

    .line 606
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 607
    .line 608
    .line 609
    const/4 v14, 0x0

    .line 610
    const/16 v15, 0x3fc

    .line 611
    .line 612
    const/4 v11, 0x0

    .line 613
    const/4 v12, 0x0

    .line 614
    const/4 v13, 0x0

    .line 615
    move-object v8, v0

    .line 616
    move-object v9, v1

    .line 617
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 618
    .line 619
    .line 620
    :cond_14
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    goto :goto_2

    .line 623
    :cond_15
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    throw v5

    .line 627
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 628
    .line 629
    .line 630
    :goto_2
    return-object v5

    .line 631
    :pswitch_1
    iget-object v0, v0, La/do6;->j:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v0, La/xn20;

    .line 634
    .line 635
    sget-object v1, La/wne;->a:La/wne;

    .line 636
    .line 637
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    instance-of v1, v0, La/wn20;

    .line 641
    .line 642
    if-eqz v1, :cond_19

    .line 643
    .line 644
    sget-object v1, La/fo6;->W1:La/kj5;

    .line 645
    .line 646
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-static {v1}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 651
    .line 652
    .line 653
    check-cast v0, La/wn20;

    .line 654
    .line 655
    iget-object v1, v3, La/fo6;->Q1:La/lgn0;

    .line 656
    .line 657
    if-eqz v1, :cond_18

    .line 658
    .line 659
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 660
    .line 661
    const v6, 0x7f13025d

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v6

    .line 668
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    invoke-direct {v2, v6, v5, v5, v5}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    const v6, 0x7f130105

    .line 675
    .line 676
    .line 677
    invoke-virtual {v3, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v8

    .line 681
    iget-object v9, v0, La/wn20;->a:Ljava/lang/String;

    .line 682
    .line 683
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 684
    .line 685
    .line 686
    move-result-object v6

    .line 687
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 688
    .line 689
    const v10, 0x7f130494

    .line 690
    .line 691
    .line 692
    invoke-virtual {v3, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v10

    .line 696
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object v11, v0, La/wn20;->d:Ljava/lang/String;

    .line 700
    .line 701
    invoke-direct {v7, v10, v11}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    new-instance v12, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 708
    .line 709
    const v7, 0x7f130270

    .line 710
    .line 711
    .line 712
    invoke-virtual {v3, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v14

    .line 716
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    sget-object v7, La/pn40;->a:La/pn40;

    .line 720
    .line 721
    iget-wide v10, v0, La/wn20;->c:D

    .line 722
    .line 723
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 724
    .line 725
    invoke-static {v10, v11, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v15

    .line 729
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    const v10, 0x7f040b72

    .line 734
    .line 735
    .line 736
    invoke-static {v10, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 737
    .line 738
    .line 739
    move-result v13

    .line 740
    iget-object v7, v0, La/wn20;->f:Ljava/lang/String;

    .line 741
    .line 742
    const/16 v17, 0x1

    .line 743
    .line 744
    move-object/from16 v16, v7

    .line 745
    .line 746
    invoke-direct/range {v12 .. v17}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v6, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    iget-boolean v7, v0, La/wn20;->g:Z

    .line 753
    .line 754
    if-nez v7, :cond_17

    .line 755
    .line 756
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 757
    .line 758
    const v7, 0x7f1309eb

    .line 759
    .line 760
    .line 761
    invoke-virtual {v3, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v7

    .line 765
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    const-string v11, ":"

    .line 769
    .line 770
    const-string v12, ""

    .line 771
    .line 772
    invoke-static {v7, v11, v12, v4}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v4

    .line 776
    invoke-static {v4}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 777
    .line 778
    .line 779
    move-result-object v4

    .line 780
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v12

    .line 784
    iget-wide v13, v0, La/wn20;->e:D

    .line 785
    .line 786
    invoke-static {v13, v14}, La/pn40;->o(D)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v13

    .line 790
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    const v7, 0x7f040aeb

    .line 795
    .line 796
    .line 797
    invoke-static {v7, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 798
    .line 799
    .line 800
    move-result v11

    .line 801
    iget-object v14, v0, La/wn20;->f:Ljava/lang/String;

    .line 802
    .line 803
    const/4 v15, 0x0

    .line 804
    invoke-direct/range {v10 .. v15}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v6, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    :cond_17
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 811
    .line 812
    .line 813
    move-result-object v13

    .line 814
    iget-wide v6, v0, La/wn20;->b:J

    .line 815
    .line 816
    move-wide v10, v6

    .line 817
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 818
    .line 819
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 820
    .line 821
    .line 822
    move-result-object v11

    .line 823
    const-string v12, "SIMPLE"

    .line 824
    .line 825
    const-string v10, "REQUEST_SUCCESS_BET_KEY"

    .line 826
    .line 827
    invoke-direct/range {v7 .. v13}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v1, v2, v7, v3}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v3}, La/fo6;->H0()La/po6;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    iget-object v0, v0, La/po6;->S:La/p7m0;

    .line 838
    .line 839
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    sget-object v1, La/vn20;->a:La/vn20;

    .line 843
    .line 844
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    goto :goto_3

    .line 848
    :cond_18
    const-string v0, "successBetAlertManager"

    .line 849
    .line 850
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    throw v5

    .line 854
    :cond_19
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 855
    .line 856
    return-object v0

    .line 857
    :pswitch_2
    move v1, v2

    .line 858
    iget-object v0, v0, La/do6;->j:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, La/zv7;

    .line 861
    .line 862
    sget-object v2, La/wne;->a:La/wne;

    .line 863
    .line 864
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    if-nez v0, :cond_1a

    .line 868
    .line 869
    goto/16 :goto_5

    .line 870
    .line 871
    :cond_1a
    instance-of v2, v0, La/uv7;

    .line 872
    .line 873
    const/16 v6, 0x8

    .line 874
    .line 875
    if-eqz v2, :cond_1b

    .line 876
    .line 877
    sget-object v1, La/fo6;->W1:La/kj5;

    .line 878
    .line 879
    invoke-virtual {v3, v4}, La/fo6;->I0(Z)V

    .line 880
    .line 881
    .line 882
    check-cast v0, La/uv7;

    .line 883
    .line 884
    iget-object v0, v0, La/uv7;->a:La/ra10;

    .line 885
    .line 886
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    iget-object v1, v1, La/xn6;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 891
    .line 892
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    iget-object v0, v0, La/xn6;->c:Landroid/widget/ImageView;

    .line 903
    .line 904
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 905
    .line 906
    .line 907
    goto/16 :goto_5

    .line 908
    .line 909
    :cond_1b
    instance-of v2, v0, La/vv7;

    .line 910
    .line 911
    if-eqz v2, :cond_1c

    .line 912
    .line 913
    sget-object v1, La/fo6;->W1:La/kj5;

    .line 914
    .line 915
    invoke-virtual {v3, v4}, La/fo6;->I0(Z)V

    .line 916
    .line 917
    .line 918
    check-cast v0, La/vv7;

    .line 919
    .line 920
    iget-object v0, v0, La/vv7;->a:La/ra10;

    .line 921
    .line 922
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    iget-object v1, v1, La/xn6;->d:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 927
    .line 928
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    iget-object v0, v0, La/xn6;->c:Landroid/widget/ImageView;

    .line 939
    .line 940
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_5

    .line 944
    .line 945
    :cond_1c
    instance-of v2, v0, La/xv7;

    .line 946
    .line 947
    if-eqz v2, :cond_1d

    .line 948
    .line 949
    check-cast v0, La/xv7;

    .line 950
    .line 951
    iget-boolean v0, v0, La/xv7;->a:Z

    .line 952
    .line 953
    sget-object v1, La/fo6;->W1:La/kj5;

    .line 954
    .line 955
    invoke-virtual {v3, v0}, La/fo6;->I0(Z)V

    .line 956
    .line 957
    .line 958
    goto :goto_5

    .line 959
    :cond_1d
    instance-of v2, v0, La/yv7;

    .line 960
    .line 961
    if-eqz v2, :cond_20

    .line 962
    .line 963
    sget-object v2, La/fo6;->W1:La/kj5;

    .line 964
    .line 965
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    iget-object v2, v2, La/xn6;->c:Landroid/widget/ImageView;

    .line 970
    .line 971
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v3, v4}, La/fo6;->I0(Z)V

    .line 975
    .line 976
    .line 977
    iget-object v2, v3, La/fo6;->V1:La/a8z;

    .line 978
    .line 979
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    check-cast v2, La/xv6;

    .line 984
    .line 985
    check-cast v0, La/yv7;

    .line 986
    .line 987
    iget-boolean v7, v0, La/yv7;->b:Z

    .line 988
    .line 989
    iget-object v0, v0, La/yv7;->a:Ljava/util/ArrayList;

    .line 990
    .line 991
    invoke-virtual {v2, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    iget-object v0, v0, La/xn6;->h:Landroid/widget/TextView;

    .line 999
    .line 1000
    if-eqz v7, :cond_1e

    .line 1001
    .line 1002
    move v2, v4

    .line 1003
    goto :goto_4

    .line 1004
    :cond_1e
    move v2, v6

    .line 1005
    :goto_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1006
    .line 1007
    .line 1008
    if-eqz v7, :cond_1f

    .line 1009
    .line 1010
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    iget-object v0, v0, La/xn6;->f:Landroidx/compose/ui/platform/ComposeView;

    .line 1015
    .line 1016
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    iget-object v0, v0, La/xn6;->f:Landroidx/compose/ui/platform/ComposeView;

    .line 1024
    .line 1025
    new-instance v2, La/bo6;

    .line 1026
    .line 1027
    invoke-direct {v2, v3, v4}, La/bo6;-><init>(La/fo6;B)V

    .line 1028
    .line 1029
    .line 1030
    new-instance v3, La/ugd;

    .line 1031
    .line 1032
    const v4, -0x1814a6ad

    .line 1033
    .line 1034
    .line 1035
    invoke-direct {v3, v4, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-static {v0, v5, v3}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_5

    .line 1042
    :cond_1f
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    iget-object v0, v0, La/xn6;->f:Landroidx/compose/ui/platform/ComposeView;

    .line 1047
    .line 1048
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v3}, La/fo6;->G0()La/xn6;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    iget-object v0, v0, La/xn6;->f:Landroidx/compose/ui/platform/ComposeView;

    .line 1056
    .line 1057
    invoke-virtual {v0}, La/x1;->e()V

    .line 1058
    .line 1059
    .line 1060
    :cond_20
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
