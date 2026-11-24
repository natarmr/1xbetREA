.class public final La/arb0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/crb0;


# direct methods
.method public synthetic constructor <init>(La/crb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/arb0;->i:B

    iput-object p1, p0, La/arb0;->k:La/crb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/arb0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/arb0;->k:La/crb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/arb0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/arb0;-><init>(La/crb0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/arb0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/arb0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/arb0;-><init>(La/crb0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/arb0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/arb0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/nrb0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/arb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/arb0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/arb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/pa20;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/arb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/arb0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/arb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/arb0;->i:B

    .line 4
    .line 5
    const v2, 0x7f130fea

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/arb0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/nrb0;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-eqz v1, :cond_a

    .line 24
    .line 25
    instance-of v6, v1, La/lrb0;

    .line 26
    .line 27
    iget-object v0, v0, La/arb0;->k:La/crb0;

    .line 28
    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    check-cast v1, La/lrb0;

    .line 32
    .line 33
    iget-boolean v1, v1, La/lrb0;->a:Z

    .line 34
    .line 35
    sget-object v2, La/crb0;->S1:La/jh70;

    .line 36
    .line 37
    invoke-virtual {v0, v4, v1, v3}, La/crb0;->K0(ZZZ)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    instance-of v6, v1, La/mrb0;

    .line 43
    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    sget-object v2, La/crb0;->S1:La/jh70;

    .line 47
    .line 48
    invoke-virtual {v0, v3, v4, v3}, La/crb0;->K0(ZZZ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, La/crb0;->G0()La/a3r;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v1, La/mrb0;

    .line 56
    .line 57
    iget-object v1, v1, La/mrb0;->a:La/hrb0;

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, La/crb0;->I0(La/a3r;La/hrb0;)V

    .line 60
    .line 61
    .line 62
    iget-object v3, v2, La/a3r;->b:Landroid/widget/Button;

    .line 63
    .line 64
    invoke-static {v2, v1}, La/crb0;->J0(La/a3r;La/hrb0;)V

    .line 65
    .line 66
    .line 67
    iget-object v5, v1, La/hrb0;->k:La/frb0;

    .line 68
    .line 69
    iget-object v6, v2, La/a3r;->s:Landroid/widget/TextView;

    .line 70
    .line 71
    iget-object v7, v5, La/frb0;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget-object v6, v2, La/a3r;->j:Landroid/widget/TextView;

    .line 77
    .line 78
    iget-object v7, v5, La/frb0;->b:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    iget-object v6, v2, La/a3r;->u:Landroid/widget/TextView;

    .line 84
    .line 85
    sget-object v7, La/pn40;->a:La/pn40;

    .line 86
    .line 87
    iget-wide v7, v5, La/frb0;->c:D

    .line 88
    .line 89
    iget-object v9, v1, La/hrb0;->i:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v10, La/p3u0;->c:La/p3u0;

    .line 92
    .line 93
    invoke-static {v7, v8, v9, v10}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v2, La/a3r;->p:Landroid/widget/TextView;

    .line 101
    .line 102
    iget-wide v5, v5, La/frb0;->d:D

    .line 103
    .line 104
    invoke-static {v5, v6, v9, v10}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    iget-object v2, v1, La/hrb0;->k:La/frb0;

    .line 112
    .line 113
    iget-wide v5, v2, La/frb0;->d:D

    .line 114
    .line 115
    iget-object v1, v1, La/hrb0;->i:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v5, v6, v1, v10}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const v2, 0x7f1309ec

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :cond_1
    instance-of v6, v1, La/krb0;

    .line 141
    .line 142
    if-eqz v6, :cond_9

    .line 143
    .line 144
    check-cast v1, La/krb0;

    .line 145
    .line 146
    iget-object v6, v1, La/krb0;->a:La/hrb0;

    .line 147
    .line 148
    iget-object v7, v6, La/hrb0;->k:La/frb0;

    .line 149
    .line 150
    iget-boolean v1, v1, La/krb0;->b:Z

    .line 151
    .line 152
    sget-object v8, La/crb0;->S1:La/jh70;

    .line 153
    .line 154
    const v8, 0x7f1307d0

    .line 155
    .line 156
    .line 157
    if-eqz v1, :cond_4

    .line 158
    .line 159
    invoke-virtual {v0, v3, v3, v3}, La/crb0;->K0(ZZZ)V

    .line 160
    .line 161
    .line 162
    iget-object v1, v0, La/crb0;->P1:La/ii;

    .line 163
    .line 164
    if-eqz v1, :cond_3

    .line 165
    .line 166
    const v2, 0x7f1307bb

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    iget-object v2, v7, La/frb0;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-nez v3, :cond_2

    .line 180
    .line 181
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    :cond_2
    move-object v11, v2

    .line 189
    const v2, 0x7f130e5c

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    sget-object v18, La/n12;->b:La/n12;

    .line 200
    .line 201
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const-string v15, "ERROR_DIALOG_REQUEST_KEY"

    .line 206
    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const/16 v19, 0x0

    .line 212
    .line 213
    const/16 v20, 0x5d8

    .line 214
    .line 215
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v9, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_3

    .line 229
    .line 230
    :cond_3
    const-string v0, "actionDialogManager"

    .line 231
    .line 232
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v5

    .line 236
    :cond_4
    invoke-virtual {v0}, La/crb0;->G0()La/a3r;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v0, v3, v4, v3}, La/crb0;->K0(ZZZ)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1, v6}, La/crb0;->I0(La/a3r;La/hrb0;)V

    .line 244
    .line 245
    .line 246
    iget-object v4, v1, La/a3r;->b:Landroid/widget/Button;

    .line 247
    .line 248
    invoke-static {v1, v6}, La/crb0;->J0(La/a3r;La/hrb0;)V

    .line 249
    .line 250
    .line 251
    iget-object v5, v1, La/a3r;->s:Landroid/widget/TextView;

    .line 252
    .line 253
    iget-object v6, v7, La/frb0;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    if-nez v7, :cond_5

    .line 260
    .line 261
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    goto :goto_0

    .line 269
    :cond_5
    move-object v7, v6

    .line 270
    :goto_0
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    iget-object v5, v1, La/a3r;->j:Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    if-nez v7, :cond_6

    .line 280
    .line 281
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    goto :goto_1

    .line 289
    :cond_6
    move-object v7, v6

    .line 290
    :goto_1
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    iget-object v5, v1, La/a3r;->u:Landroid/widget/TextView;

    .line 294
    .line 295
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    if-nez v7, :cond_7

    .line 300
    .line 301
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_7
    move-object v7, v6

    .line 310
    :goto_2
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    .line 312
    .line 313
    iget-object v1, v1, La/a3r;->p:Landroid/widget/TextView;

    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-nez v5, :cond_8

    .line 320
    .line 321
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    :cond_8
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    .line 340
    .line 341
    goto :goto_3

    .line 342
    :cond_9
    instance-of v2, v1, La/jrb0;

    .line 343
    .line 344
    if-eqz v2, :cond_a

    .line 345
    .line 346
    check-cast v1, La/jrb0;

    .line 347
    .line 348
    iget-object v1, v1, La/jrb0;->a:La/ra10;

    .line 349
    .line 350
    sget-object v2, La/crb0;->S1:La/jh70;

    .line 351
    .line 352
    invoke-virtual {v0}, La/crb0;->G0()La/a3r;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    iget-object v2, v2, La/a3r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 357
    .line 358
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v3, v3, v4}, La/crb0;->K0(ZZZ)V

    .line 362
    .line 363
    .line 364
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 368
    .line 369
    .line 370
    :goto_4
    return-object v5

    .line 371
    :pswitch_0
    iget-object v1, v0, La/arb0;->j:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, La/pa20;

    .line 374
    .line 375
    sget-object v6, La/wne;->a:La/wne;

    .line 376
    .line 377
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    if-eqz v1, :cond_e

    .line 381
    .line 382
    instance-of v6, v1, La/na20;

    .line 383
    .line 384
    const-string v7, "snackbarManager"

    .line 385
    .line 386
    iget-object v10, v0, La/arb0;->k:La/crb0;

    .line 387
    .line 388
    if-eqz v6, :cond_c

    .line 389
    .line 390
    sget-object v0, La/crb0;->S1:La/jh70;

    .line 391
    .line 392
    invoke-virtual {v10}, La/crb0;->H0()La/orb0;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    iget-object v6, v0, La/orb0;->o:La/p7m0;

    .line 397
    .line 398
    new-instance v8, La/lrb0;

    .line 399
    .line 400
    invoke-direct {v8, v4}, La/lrb0;-><init>(Z)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v6, v5, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0}, La/orb0;->w()V

    .line 410
    .line 411
    .line 412
    iget-object v8, v10, La/crb0;->Q1:La/wdk0;

    .line 413
    .line 414
    if-eqz v8, :cond_b

    .line 415
    .line 416
    new-instance v9, La/xdk0;

    .line 417
    .line 418
    sget-object v12, La/rek0;->b:La/rek0;

    .line 419
    .line 420
    check-cast v1, La/na20;

    .line 421
    .line 422
    iget-object v13, v1, La/na20;->c:Ljava/lang/String;

    .line 423
    .line 424
    const/16 v17, 0x0

    .line 425
    .line 426
    const/16 v18, 0x7c

    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const/4 v15, 0x0

    .line 430
    const/16 v16, 0x0

    .line 431
    .line 432
    move-object v11, v9

    .line 433
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 434
    .line 435
    .line 436
    const/16 v15, 0x3fc

    .line 437
    .line 438
    const/4 v11, 0x0

    .line 439
    const/4 v12, 0x0

    .line 440
    const/4 v13, 0x0

    .line 441
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v10}, La/crb0;->G0()La/a3r;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    iget-object v0, v0, La/a3r;->b:Landroid/widget/Button;

    .line 449
    .line 450
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v10, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_b
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v5

    .line 465
    :cond_c
    instance-of v0, v1, La/oa20;

    .line 466
    .line 467
    if-eqz v0, :cond_e

    .line 468
    .line 469
    iget-object v8, v10, La/crb0;->Q1:La/wdk0;

    .line 470
    .line 471
    if-eqz v8, :cond_d

    .line 472
    .line 473
    new-instance v9, La/xdk0;

    .line 474
    .line 475
    sget-object v12, La/qek0;->a:La/qek0;

    .line 476
    .line 477
    const v0, 0x7f13140e

    .line 478
    .line 479
    .line 480
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v13

    .line 484
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    const/16 v17, 0x0

    .line 488
    .line 489
    const/16 v18, 0x7c

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const/16 v16, 0x0

    .line 494
    .line 495
    move-object v11, v9

    .line 496
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 497
    .line 498
    .line 499
    const/16 v15, 0x3fc

    .line 500
    .line 501
    const/4 v11, 0x0

    .line 502
    const/4 v12, 0x0

    .line 503
    const/4 v13, 0x0

    .line 504
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v10}, La/crb0;->H0()La/orb0;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    iget-object v1, v0, La/orb0;->m:La/pmi0;

    .line 512
    .line 513
    invoke-static {v1}, La/pmi0;->i(La/pmi0;)V

    .line 514
    .line 515
    .line 516
    iget-object v1, v0, La/orb0;->d:La/i1w0;

    .line 517
    .line 518
    new-instance v2, La/irb0;

    .line 519
    .line 520
    invoke-direct {v2, v0, v4}, La/irb0;-><init>(La/orb0;B)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 524
    .line 525
    .line 526
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 527
    .line 528
    goto :goto_6

    .line 529
    :cond_d
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    throw v5

    .line 533
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 534
    .line 535
    .line 536
    :goto_6
    return-object v5

    .line 537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
