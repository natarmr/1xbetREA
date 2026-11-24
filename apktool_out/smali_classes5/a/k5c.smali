.class public final La/k5c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/l5c;


# direct methods
.method public synthetic constructor <init>(La/l5c;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k5c;->i:B

    iput-object p1, p0, La/k5c;->k:La/l5c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k5c;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k5c;->k:La/l5c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k5c;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/k5c;-><init>(La/l5c;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/k5c;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/k5c;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/k5c;-><init>(La/l5c;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/k5c;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/k5c;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/i7c;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/k5c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k5c;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k5c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/h7c;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/k5c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/k5c;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/k5c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k5c;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/k5c;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/i7c;

    .line 14
    .line 15
    sget-object v5, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v5, La/l5c;->W1:La/kl5;

    .line 21
    .line 22
    iget-object v0, v0, La/k5c;->k:La/l5c;

    .line 23
    .line 24
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iget-object v5, v5, La/bzq;->e:Lcom/google/android/material/textview/MaterialTextView;

    .line 29
    .line 30
    iget-boolean v6, v1, La/i7c;->d:Z

    .line 31
    .line 32
    const/16 v7, 0x8

    .line 33
    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    move v6, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v6, v7

    .line 39
    :goto_0
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v5, v5, La/bzq;->g:Lcom/google/android/material/textview/MaterialTextView;

    .line 47
    .line 48
    iget-boolean v6, v1, La/i7c;->c:Z

    .line 49
    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    move v6, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v6, v7

    .line 55
    :goto_1
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v5, v5, La/bzq;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 63
    .line 64
    iget-object v6, v1, La/i7c;->f:Landroid/text/SpannableStringBuilder;

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    iget-object v5, v5, La/bzq;->c:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 74
    .line 75
    iget v6, v1, La/i7c;->b:I

    .line 76
    .line 77
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-object v5, v5, La/bzq;->d:Landroid/widget/FrameLayout;

    .line 92
    .line 93
    iget-boolean v6, v1, La/i7c;->n:Z

    .line 94
    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    move v6, v2

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move v6, v7

    .line 100
    :goto_2
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    iget-object v5, v1, La/i7c;->j:La/u6c;

    .line 104
    .line 105
    sget-object v6, La/s6c;->a:La/s6c;

    .line 106
    .line 107
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_3

    .line 112
    .line 113
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    iget-object v5, v5, La/bzq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 118
    .line 119
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    instance-of v6, v5, La/t6c;

    .line 124
    .line 125
    if-eqz v6, :cond_7

    .line 126
    .line 127
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    iget-object v6, v6, La/bzq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 132
    .line 133
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    iget-object v6, v6, La/bzq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 141
    .line 142
    check-cast v5, La/t6c;

    .line 143
    .line 144
    iget-object v5, v5, La/t6c;->a:Landroid/text/SpannableStringBuilder;

    .line 145
    .line 146
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    :goto_3
    iget-object v5, v1, La/i7c;->g:La/i6c;

    .line 150
    .line 151
    sget-object v6, La/i6c;->a:La/i6c;

    .line 152
    .line 153
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_6

    .line 158
    .line 159
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    iget-object v5, v5, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 164
    .line 165
    invoke-virtual {v5, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 166
    .line 167
    .line 168
    iget-object v5, v1, La/i7c;->h:La/m6c;

    .line 169
    .line 170
    sget-object v6, La/k6c;->a:La/k6c;

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_4

    .line 177
    .line 178
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    iget-object v4, v4, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 183
    .line 184
    invoke-virtual {v4, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonVisibility(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_4
    instance-of v2, v5, La/l6c;

    .line 189
    .line 190
    if-eqz v2, :cond_5

    .line 191
    .line 192
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonVisibility(Z)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 206
    .line 207
    move-object v4, v5

    .line 208
    check-cast v4, La/l6c;

    .line 209
    .line 210
    iget-boolean v6, v4, La/l6c;->b:Z

    .line 211
    .line 212
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonEnabled(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 220
    .line 221
    const v6, 0x7f140197

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonStyle(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 232
    .line 233
    iget-object v4, v4, La/l6c;->a:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonText(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 243
    .line 244
    new-instance v4, La/yw9;

    .line 245
    .line 246
    const/16 v6, 0xb

    .line 247
    .line 248
    invoke-direct {v4, v0, v5, v6}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 249
    .line 250
    .line 251
    invoke-static {v2, v4}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->v(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 252
    .line 253
    .line 254
    :goto_4
    iget-object v1, v1, La/i7c;->i:La/n6c;

    .line 255
    .line 256
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 261
    .line 262
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonVisibility(Z)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 270
    .line 271
    iget-object v3, v1, La/n6c;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonText(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    iget-object v2, v2, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 281
    .line 282
    iget-boolean v1, v1, La/n6c;->b:Z

    .line 283
    .line 284
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonEnabled(Z)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, La/l5c;->H0()La/bzq;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iget-object v1, v1, La/bzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 292
    .line 293
    new-instance v2, La/h5c;

    .line 294
    .line 295
    const/4 v3, 0x7

    .line 296
    invoke-direct {v2, v0, v3}, La/h5c;-><init>(La/l5c;B)V

    .line 297
    .line 298
    .line 299
    invoke-static {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->w(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 300
    .line 301
    .line 302
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 314
    .line 315
    .line 316
    :goto_5
    return-object v4

    .line 317
    :pswitch_0
    iget-object v1, v0, La/k5c;->j:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, La/h7c;

    .line 320
    .line 321
    sget-object v5, La/wne;->a:La/wne;

    .line 322
    .line 323
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    instance-of v5, v1, La/d7c;

    .line 327
    .line 328
    iget-object v8, v0, La/k5c;->k:La/l5c;

    .line 329
    .line 330
    if-eqz v5, :cond_9

    .line 331
    .line 332
    check-cast v1, La/d7c;

    .line 333
    .line 334
    iget-object v11, v1, La/d7c;->a:Ljava/lang/String;

    .line 335
    .line 336
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 337
    .line 338
    iget-object v6, v8, La/l5c;->O1:La/wdk0;

    .line 339
    .line 340
    if-eqz v6, :cond_8

    .line 341
    .line 342
    new-instance v7, La/xdk0;

    .line 343
    .line 344
    sget-object v10, La/pek0;->a:La/pek0;

    .line 345
    .line 346
    const/4 v15, 0x0

    .line 347
    const/16 v16, 0x7c

    .line 348
    .line 349
    const/4 v12, 0x0

    .line 350
    const/4 v13, 0x0

    .line 351
    const/4 v14, 0x0

    .line 352
    move-object v9, v7

    .line 353
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 354
    .line 355
    .line 356
    const/16 v13, 0x3fc

    .line 357
    .line 358
    const/4 v9, 0x0

    .line 359
    const/4 v10, 0x0

    .line 360
    const/4 v11, 0x0

    .line 361
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 362
    .line 363
    .line 364
    goto/16 :goto_7

    .line 365
    .line 366
    :cond_8
    const-string v0, "snackbarManager"

    .line 367
    .line 368
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v4

    .line 372
    :cond_9
    instance-of v0, v1, La/w6c;

    .line 373
    .line 374
    if-eqz v0, :cond_a

    .line 375
    .line 376
    check-cast v1, La/w6c;

    .line 377
    .line 378
    iget-object v0, v1, La/w6c;->a:Ljava/lang/String;

    .line 379
    .line 380
    sget-object v3, La/l5c;->W1:La/kl5;

    .line 381
    .line 382
    iget-object v1, v1, La/w6c;->b:Ljava/lang/String;

    .line 383
    .line 384
    new-instance v3, Lkotlin/Pair;

    .line 385
    .line 386
    invoke-direct {v3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    invoke-virtual {v3, v1, v0}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8}, La/l5c;->I0()La/v7c;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    iget-object v1, v0, La/v7c;->c:La/i1w0;

    .line 409
    .line 410
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    iget-object v0, v0, La/v7c;->q:La/iw20;

    .line 415
    .line 416
    sget-object v4, La/nqh0;->a:La/nqh0;

    .line 417
    .line 418
    invoke-static {v0, v4}, La/iw20;->f(La/iw20;La/nqh0;)Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    new-instance v4, La/q0w0;

    .line 423
    .line 424
    invoke-direct {v4, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 425
    .line 426
    .line 427
    new-instance v0, La/c8d;

    .line 428
    .line 429
    sget-object v5, La/y7d;->a:La/v7d;

    .line 430
    .line 431
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 432
    .line 433
    .line 434
    invoke-static {v3, v0, v1, v3, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    :goto_6
    move-object v2, v0

    .line 439
    check-cast v2, La/paw;

    .line 440
    .line 441
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    if-eqz v3, :cond_18

    .line 446
    .line 447
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    check-cast v2, La/oe50;

    .line 452
    .line 453
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_a
    instance-of v0, v1, La/a7c;

    .line 458
    .line 459
    if-eqz v0, :cond_d

    .line 460
    .line 461
    check-cast v1, La/a7c;

    .line 462
    .line 463
    iget-object v0, v1, La/a7c;->a:Ljava/lang/String;

    .line 464
    .line 465
    sget-object v1, La/l5c;->W1:La/kl5;

    .line 466
    .line 467
    invoke-virtual {v8}, La/l5c;->H0()La/bzq;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    iget-object v1, v1, La/bzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 472
    .line 473
    if-eqz v0, :cond_b

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    if-nez v4, :cond_c

    .line 480
    .line 481
    :cond_b
    move v2, v3

    .line 482
    :cond_c
    xor-int/2addr v2, v3

    .line 483
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_7

    .line 490
    .line 491
    :cond_d
    instance-of v0, v1, La/f7c;

    .line 492
    .line 493
    const v3, 0x7f130e5d

    .line 494
    .line 495
    .line 496
    const v5, 0x7f1307bb

    .line 497
    .line 498
    .line 499
    if-eqz v0, :cond_e

    .line 500
    .line 501
    check-cast v1, La/f7c;

    .line 502
    .line 503
    iget-object v11, v1, La/f7c;->a:Ljava/lang/String;

    .line 504
    .line 505
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 506
    .line 507
    invoke-virtual {v8}, La/l5c;->G0()La/ii;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 512
    .line 513
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v10

    .line 517
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v12

    .line 521
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    sget-object v18, La/n12;->b:La/n12;

    .line 525
    .line 526
    const/16 v19, 0x0

    .line 527
    .line 528
    const/16 v20, 0x5d8

    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    const/4 v14, 0x0

    .line 532
    const-string v15, "REQUEST_TOKEN_EXPIRED_KEY"

    .line 533
    .line 534
    const/16 v16, 0x0

    .line 535
    .line 536
    const/16 v17, 0x0

    .line 537
    .line 538
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_7

    .line 552
    .line 553
    :cond_e
    instance-of v0, v1, La/c7c;

    .line 554
    .line 555
    const v6, 0x7f130a86

    .line 556
    .line 557
    .line 558
    const v7, 0x7f13032f

    .line 559
    .line 560
    .line 561
    if-eqz v0, :cond_10

    .line 562
    .line 563
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 564
    .line 565
    invoke-virtual {v8}, La/l5c;->G0()La/ii;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    iget-object v1, v8, La/l5c;->M1:La/ux00;

    .line 570
    .line 571
    if-eqz v1, :cond_f

    .line 572
    .line 573
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 574
    .line 575
    const v1, 0x7f130162

    .line 576
    .line 577
    .line 578
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v10

    .line 582
    const v1, 0x7f13047d

    .line 583
    .line 584
    .line 585
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v11

    .line 589
    invoke-virtual {v8, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v12

    .line 593
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v8, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v13

    .line 600
    sget-object v18, La/n12;->a:La/n12;

    .line 601
    .line 602
    const/16 v19, 0x0

    .line 603
    .line 604
    const/16 v20, 0x5f0

    .line 605
    .line 606
    const/4 v14, 0x0

    .line 607
    const/4 v15, 0x0

    .line 608
    const/16 v16, 0x0

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 613
    .line 614
    .line 615
    sget-object v1, La/tx00;->l2:La/evz;

    .line 616
    .line 617
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    invoke-static {v9, v2, v2, v2}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_7

    .line 635
    .line 636
    :cond_f
    const-string v0, "logoutDialogFactory"

    .line 637
    .line 638
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    throw v4

    .line 642
    :cond_10
    instance-of v0, v1, La/x6c;

    .line 643
    .line 644
    if-eqz v0, :cond_11

    .line 645
    .line 646
    check-cast v1, La/x6c;

    .line 647
    .line 648
    iget-object v11, v1, La/x6c;->a:Ljava/lang/String;

    .line 649
    .line 650
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 651
    .line 652
    invoke-virtual {v8}, La/l5c;->G0()La/ii;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 657
    .line 658
    const v1, 0x7f1303fb

    .line 659
    .line 660
    .line 661
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    invoke-virtual {v8, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v12

    .line 669
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v8, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v13

    .line 676
    sget-object v18, La/n12;->a:La/n12;

    .line 677
    .line 678
    const/16 v19, 0x0

    .line 679
    .line 680
    const/16 v20, 0x5d0

    .line 681
    .line 682
    const/4 v14, 0x0

    .line 683
    const-string v15, "REQUEST_PROCESS_INTERRUPTION_KEY"

    .line 684
    .line 685
    const/16 v16, 0x0

    .line 686
    .line 687
    const/16 v17, 0x0

    .line 688
    .line 689
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 700
    .line 701
    .line 702
    goto/16 :goto_7

    .line 703
    .line 704
    :cond_11
    instance-of v0, v1, La/e7c;

    .line 705
    .line 706
    if-eqz v0, :cond_12

    .line 707
    .line 708
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 709
    .line 710
    invoke-virtual {v8}, La/l5c;->G0()La/ii;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 715
    .line 716
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v10

    .line 720
    const v1, 0x7f13115d

    .line 721
    .line 722
    .line 723
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v11

    .line 727
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v12

    .line 731
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    sget-object v18, La/n12;->b:La/n12;

    .line 735
    .line 736
    const/16 v19, 0x0

    .line 737
    .line 738
    const/16 v20, 0x5d8

    .line 739
    .line 740
    const/4 v13, 0x0

    .line 741
    const/4 v14, 0x0

    .line 742
    const-string v15, "REQUEST_REQUEST_ERROR_KEY"

    .line 743
    .line 744
    const/16 v16, 0x0

    .line 745
    .line 746
    const/16 v17, 0x0

    .line 747
    .line 748
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 759
    .line 760
    .line 761
    goto/16 :goto_7

    .line 762
    .line 763
    :cond_12
    instance-of v0, v1, La/v6c;

    .line 764
    .line 765
    if-eqz v0, :cond_13

    .line 766
    .line 767
    invoke-static {v8}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 768
    .line 769
    .line 770
    goto/16 :goto_7

    .line 771
    .line 772
    :cond_13
    instance-of v0, v1, La/y6c;

    .line 773
    .line 774
    if-eqz v0, :cond_14

    .line 775
    .line 776
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 777
    .line 778
    invoke-virtual {v8}, La/l5c;->G0()La/ii;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 783
    .line 784
    const v1, 0x7f1304e4

    .line 785
    .line 786
    .line 787
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v10

    .line 791
    const v1, 0x7f1304e7

    .line 792
    .line 793
    .line 794
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v11

    .line 798
    const v1, 0x7f1304e8

    .line 799
    .line 800
    .line 801
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v12

    .line 805
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v8, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v13

    .line 812
    sget-object v18, La/n12;->a:La/n12;

    .line 813
    .line 814
    const/16 v19, 0x0

    .line 815
    .line 816
    const/16 v20, 0x5d0

    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    const-string v15, "REQUEST_CONSULTANT_KEY"

    .line 820
    .line 821
    const/16 v16, 0x0

    .line 822
    .line 823
    const/16 v17, 0x0

    .line 824
    .line 825
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 836
    .line 837
    .line 838
    goto :goto_7

    .line 839
    :cond_14
    instance-of v0, v1, La/g7c;

    .line 840
    .line 841
    if-eqz v0, :cond_15

    .line 842
    .line 843
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 844
    .line 845
    invoke-virtual {v8}, La/l5c;->H0()La/bzq;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    iget-object v0, v0, La/bzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 850
    .line 851
    check-cast v1, La/g7c;

    .line 852
    .line 853
    iget-object v1, v1, La/g7c;->a:Ljava/lang/String;

    .line 854
    .line 855
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 856
    .line 857
    .line 858
    goto :goto_7

    .line 859
    :cond_15
    instance-of v0, v1, La/z6c;

    .line 860
    .line 861
    if-eqz v0, :cond_17

    .line 862
    .line 863
    iget-object v0, v8, La/l5c;->P1:La/gl5;

    .line 864
    .line 865
    if-eqz v0, :cond_16

    .line 866
    .line 867
    check-cast v1, La/z6c;

    .line 868
    .line 869
    iget-object v0, v1, La/z6c;->a:La/d7a;

    .line 870
    .line 871
    const v1, 0x7f1304dc

    .line 872
    .line 873
    .line 874
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 882
    .line 883
    invoke-static {v8, v2, v0, v1}, La/gl5;->p(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    goto :goto_7

    .line 887
    :cond_16
    const-string v0, "captchaDialogDelegate"

    .line 888
    .line 889
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    throw v4

    .line 893
    :cond_17
    sget-object v0, La/b7c;->a:La/b7c;

    .line 894
    .line 895
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-eqz v0, :cond_19

    .line 900
    .line 901
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 902
    .line 903
    invoke-virtual {v8}, La/l5c;->G0()La/ii;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 908
    .line 909
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v10

    .line 913
    const v1, 0x7f13131f

    .line 914
    .line 915
    .line 916
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v11

    .line 920
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v12

    .line 924
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    sget-object v18, La/n12;->b:La/n12;

    .line 928
    .line 929
    const/16 v19, 0x0

    .line 930
    .line 931
    const/16 v20, 0x5f8

    .line 932
    .line 933
    const/4 v13, 0x0

    .line 934
    const/4 v14, 0x0

    .line 935
    const/4 v15, 0x0

    .line 936
    const/16 v16, 0x0

    .line 937
    .line 938
    const/16 v17, 0x0

    .line 939
    .line 940
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 951
    .line 952
    .line 953
    :cond_18
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 954
    .line 955
    goto :goto_8

    .line 956
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 957
    .line 958
    .line 959
    :goto_8
    return-object v4

    .line 960
    nop

    .line 961
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
