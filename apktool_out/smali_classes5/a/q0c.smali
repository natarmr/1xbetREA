.class public final La/q0c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/r0c;


# direct methods
.method public synthetic constructor <init>(La/r0c;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q0c;->i:B

    iput-object p1, p0, La/q0c;->k:La/r0c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q0c;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q0c;->k:La/r0c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q0c;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/q0c;-><init>(La/r0c;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/q0c;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/q0c;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/q0c;-><init>(La/r0c;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/q0c;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/q0c;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/q0c;-><init>(La/r0c;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/q0c;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/q0c;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/f1c;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/q0c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q0c;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q0c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/w0c;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/q0c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/q0c;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/q0c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/e1c;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/q0c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/q0c;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/q0c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/q0c;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/q0c;->k:La/r0c;

    .line 7
    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/q0c;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/f1c;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/r0c;->S1:La/cl5;

    .line 25
    .line 26
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, v1, La/o4r;->g:Lcom/google/android/material/textview/MaterialTextView;

    .line 31
    .line 32
    iget-object v5, v0, La/f1c;->a:Ljava/lang/String;

    .line 33
    .line 34
    const v7, 0x7f1304cf

    .line 35
    .line 36
    .line 37
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v3, v7, v8}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v5, v3}, La/z1x;->G(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v1, La/o4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 56
    .line 57
    iget-boolean v3, v0, La/f1c;->c:Z

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonEnabled(Z)V

    .line 60
    .line 61
    .line 62
    iget-object v3, v1, La/o4r;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 63
    .line 64
    iget-object v5, v0, La/f1c;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v3, v0, La/f1c;->f:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v1, La/o4r;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 75
    .line 76
    iget-boolean v3, v0, La/f1c;->g:Z

    .line 77
    .line 78
    if-eqz v3, :cond_0

    .line 79
    .line 80
    move v3, v6

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    move v3, v4

    .line 83
    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v1, La/o4r;->d:Landroid/widget/FrameLayout;

    .line 87
    .line 88
    iget-boolean v0, v0, La/f1c;->h:Z

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    move v4, v6

    .line 93
    :cond_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    iget-object v0, v0, La/q0c;->j:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, La/w0c;

    .line 102
    .line 103
    sget-object v1, La/wne;->a:La/wne;

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    instance-of v1, v0, La/u0c;

    .line 111
    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    sget-object v1, La/r0c;->S1:La/cl5;

    .line 115
    .line 116
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v1, v1, La/o4r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 121
    .line 122
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-object v1, v1, La/o4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 130
    .line 131
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 132
    .line 133
    .line 134
    check-cast v0, La/u0c;

    .line 135
    .line 136
    iget-wide v0, v0, La/u0c;->a:J

    .line 137
    .line 138
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 139
    .line 140
    const-wide/16 v7, 0x3c

    .line 141
    .line 142
    div-long v9, v0, v7

    .line 143
    .line 144
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    rem-long/2addr v0, v7

    .line 149
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const/4 v1, 0x2

    .line 158
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v1, "%02d:%02d"

    .line 163
    .line 164
    invoke-static {v4, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget-object v1, v1, La/o4r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 173
    .line 174
    const v4, 0x7f13118b

    .line 175
    .line 176
    .line 177
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v3, v4, v5}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance v4, Landroid/text/SpannableStringBuilder;

    .line 189
    .line 190
    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const/4 v5, 0x6

    .line 194
    invoke-static {v3, v0, v6, v6, v5}, Lkotlin/text/StringsKt;->V(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    add-int/2addr v0, v5

    .line 203
    invoke-virtual {v4, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 208
    .line 209
    invoke-direct {v6, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 210
    .line 211
    .line 212
    const/16 v2, 0x21

    .line 213
    .line 214
    invoke-virtual {v3, v6, v5, v0, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_2
    instance-of v1, v0, La/v0c;

    .line 222
    .line 223
    if-eqz v1, :cond_3

    .line 224
    .line 225
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 226
    .line 227
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v0, v0, La/o4r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 232
    .line 233
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v0, v0, La/o4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 241
    .line 242
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_3
    instance-of v0, v0, La/t0c;

    .line 247
    .line 248
    if-eqz v0, :cond_4

    .line 249
    .line 250
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 251
    .line 252
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v0, v0, La/o4r;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 257
    .line 258
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, La/r0c;->G0()La/o4r;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iget-object v0, v0, La/o4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 266
    .line 267
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 268
    .line 269
    .line 270
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 274
    .line 275
    .line 276
    :goto_2
    return-object v5

    .line 277
    :pswitch_1
    iget-object v1, v0, La/q0c;->j:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, La/e1c;

    .line 280
    .line 281
    sget-object v3, La/wne;->a:La/wne;

    .line 282
    .line 283
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    if-eqz v1, :cond_10

    .line 287
    .line 288
    instance-of v3, v1, La/d1c;

    .line 289
    .line 290
    const-string v4, "snackbarManager"

    .line 291
    .line 292
    iget-object v9, v0, La/q0c;->k:La/r0c;

    .line 293
    .line 294
    if-eqz v3, :cond_6

    .line 295
    .line 296
    iget-object v7, v9, La/r0c;->N1:La/wdk0;

    .line 297
    .line 298
    if-eqz v7, :cond_5

    .line 299
    .line 300
    new-instance v8, La/xdk0;

    .line 301
    .line 302
    sget-object v11, La/qek0;->a:La/qek0;

    .line 303
    .line 304
    const v0, 0x7f130778

    .line 305
    .line 306
    .line 307
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    const/16 v17, 0x7c

    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    const/4 v14, 0x0

    .line 320
    const/4 v15, 0x0

    .line 321
    move-object v10, v8

    .line 322
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 323
    .line 324
    .line 325
    const/16 v14, 0x3fc

    .line 326
    .line 327
    const/4 v10, 0x0

    .line 328
    const/4 v11, 0x0

    .line 329
    const/4 v12, 0x0

    .line 330
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 331
    .line 332
    .line 333
    goto/16 :goto_4

    .line 334
    .line 335
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v5

    .line 339
    :cond_6
    instance-of v0, v1, La/a1c;

    .line 340
    .line 341
    if-eqz v0, :cond_8

    .line 342
    .line 343
    iget-object v7, v9, La/r0c;->N1:La/wdk0;

    .line 344
    .line 345
    if-eqz v7, :cond_7

    .line 346
    .line 347
    new-instance v8, La/xdk0;

    .line 348
    .line 349
    sget-object v11, La/rek0;->b:La/rek0;

    .line 350
    .line 351
    const v0, 0x7f1315cd

    .line 352
    .line 353
    .line 354
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v12

    .line 358
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    const/16 v17, 0x7c

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    move-object v10, v8

    .line 369
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 370
    .line 371
    .line 372
    new-instance v13, Ljava/lang/Integer;

    .line 373
    .line 374
    const v0, 0x7f0706f8

    .line 375
    .line 376
    .line 377
    invoke-direct {v13, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 378
    .line 379
    .line 380
    const/16 v14, 0x1fc

    .line 381
    .line 382
    const/4 v10, 0x0

    .line 383
    const/4 v11, 0x0

    .line 384
    const/4 v12, 0x0

    .line 385
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 386
    .line 387
    .line 388
    goto/16 :goto_4

    .line 389
    .line 390
    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v5

    .line 394
    :cond_8
    instance-of v0, v1, La/z0c;

    .line 395
    .line 396
    if-eqz v0, :cond_a

    .line 397
    .line 398
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 399
    .line 400
    invoke-virtual {v9}, La/r0c;->G0()La/o4r;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    iget-object v0, v0, La/o4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 405
    .line 406
    check-cast v1, La/z0c;

    .line 407
    .line 408
    iget-object v1, v1, La/z0c;->a:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9}, La/r0c;->G0()La/o4r;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    iget-object v0, v0, La/o4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-lez v1, :cond_9

    .line 424
    .line 425
    goto :goto_3

    .line 426
    :cond_9
    move v2, v6

    .line 427
    :goto_3
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 428
    .line 429
    .line 430
    goto/16 :goto_4

    .line 431
    .line 432
    :cond_a
    instance-of v0, v1, La/c1c;

    .line 433
    .line 434
    const-string v2, "actionDialogManager"

    .line 435
    .line 436
    const v3, 0x7f130e5d

    .line 437
    .line 438
    .line 439
    const v4, 0x7f1307bb

    .line 440
    .line 441
    .line 442
    if-eqz v0, :cond_c

    .line 443
    .line 444
    check-cast v1, La/c1c;

    .line 445
    .line 446
    iget-object v12, v1, La/c1c;->a:Ljava/lang/String;

    .line 447
    .line 448
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 449
    .line 450
    iget-object v0, v9, La/r0c;->M1:La/ii;

    .line 451
    .line 452
    if-eqz v0, :cond_b

    .line 453
    .line 454
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 455
    .line 456
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v11

    .line 460
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v13

    .line 464
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    sget-object v19, La/n12;->a:La/n12;

    .line 468
    .line 469
    const/16 v20, 0x0

    .line 470
    .line 471
    const/16 v21, 0x5d8

    .line 472
    .line 473
    const/4 v14, 0x0

    .line 474
    const/4 v15, 0x0

    .line 475
    const-string v16, "TOKEN_EXPIRED_ERROR_KEY"

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 492
    .line 493
    .line 494
    goto :goto_4

    .line 495
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    throw v5

    .line 499
    :cond_c
    instance-of v0, v1, La/x0c;

    .line 500
    .line 501
    if-eqz v0, :cond_d

    .line 502
    .line 503
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 504
    .line 505
    invoke-virtual {v9}, La/r0c;->G0()La/o4r;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    iget-object v0, v0, La/o4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 510
    .line 511
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v9}, La/r0c;->G0()La/o4r;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    iget-object v0, v0, La/o4r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 519
    .line 520
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 521
    .line 522
    .line 523
    goto :goto_4

    .line 524
    :cond_d
    instance-of v0, v1, La/b1c;

    .line 525
    .line 526
    if-eqz v0, :cond_f

    .line 527
    .line 528
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 529
    .line 530
    iget-object v0, v9, La/r0c;->M1:La/ii;

    .line 531
    .line 532
    if-eqz v0, :cond_e

    .line 533
    .line 534
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 535
    .line 536
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v11

    .line 540
    const v1, 0x7f13115d

    .line 541
    .line 542
    .line 543
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v12

    .line 547
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v13

    .line 551
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    sget-object v19, La/n12;->a:La/n12;

    .line 555
    .line 556
    const/16 v20, 0x0

    .line 557
    .line 558
    const/16 v21, 0x5d8

    .line 559
    .line 560
    const/4 v14, 0x0

    .line 561
    const/4 v15, 0x0

    .line 562
    const-string v16, "REQUEST_REQUEST_ERROR_KEY"

    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const/16 v18, 0x0

    .line 567
    .line 568
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 579
    .line 580
    .line 581
    goto :goto_4

    .line 582
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw v5

    .line 586
    :cond_f
    instance-of v0, v1, La/y0c;

    .line 587
    .line 588
    if-eqz v0, :cond_10

    .line 589
    .line 590
    invoke-static {v9}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 591
    .line 592
    .line 593
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 594
    .line 595
    goto :goto_5

    .line 596
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 597
    .line 598
    .line 599
    :goto_5
    return-object v5

    .line 600
    nop

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
