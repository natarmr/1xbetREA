.class public final synthetic La/c48;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/c48;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c48;->h:B

    .line 4
    .line 5
    const/16 v2, 0x1b

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const-string v4, "snackbarManager"

    .line 9
    .line 10
    const/16 v5, 0x8

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v0, v0, La/xo;->a:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/s9e;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, La/yje;

    .line 27
    .line 28
    check-cast v0, La/e7e;

    .line 29
    .line 30
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    instance-of v2, v1, La/q9e;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, La/kzq;->j:Landroid/widget/ImageView;

    .line 46
    .line 47
    const v3, 0x3f19999a    # 0.6f

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v0, v0, La/kzq;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 58
    .line 59
    check-cast v1, La/q9e;

    .line 60
    .line 61
    iget v1, v1, La/q9e;->a:I

    .line 62
    .line 63
    invoke-virtual {v0, v1}, La/t06;->setProgress(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    instance-of v1, v1, La/r9e;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/kzq;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 76
    .line 77
    invoke-virtual {v1, v7}, La/t06;->setProgress(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v1, v1, La/kzq;->f:Lcom/google/android/material/textfield/TextInputEditText;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v1, v1, La/kzq;->j:Landroid/widget/ImageView;

    .line 104
    .line 105
    const/high16 v2, 0x3f800000    # 1.0f

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 108
    .line 109
    .line 110
    :cond_2
    :goto_0
    iget-object v0, v0, La/e7e;->Q1:La/ndk0;

    .line 111
    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_1
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 121
    .line 122
    .line 123
    :goto_2
    return-object v8

    .line 124
    :pswitch_0
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, La/a0e;

    .line 127
    .line 128
    move-object/from16 v2, p2

    .line 129
    .line 130
    check-cast v2, La/yje;

    .line 131
    .line 132
    check-cast v0, La/uzd;

    .line 133
    .line 134
    sget-object v2, La/uzd;->S1:La/qud;

    .line 135
    .line 136
    instance-of v2, v1, La/xzd;

    .line 137
    .line 138
    if-nez v2, :cond_7

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    sget-object v2, La/yzd;->a:La/yzd;

    .line 144
    .line 145
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    instance-of v2, v1, La/zzd;

    .line 153
    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-virtual {v0}, La/uzd;->H0()La/jzq;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v2, v2, La/jzq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 161
    .line 162
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, La/uzd;->H0()La/jzq;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v0, v0, La/jzq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 170
    .line 171
    check-cast v1, La/zzd;

    .line 172
    .line 173
    iget-object v1, v1, La/zzd;->a:Landroid/text/SpannableStringBuilder;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_7
    :goto_3
    invoke-virtual {v0}, La/uzd;->H0()La/jzq;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iget-object v0, v0, La/jzq;->i:Lcom/google/android/material/textview/MaterialTextView;

    .line 188
    .line 189
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    :goto_5
    return-object v8

    .line 195
    :pswitch_1
    move-object/from16 v1, p1

    .line 196
    .line 197
    check-cast v1, La/r0e;

    .line 198
    .line 199
    move-object/from16 v2, p2

    .line 200
    .line 201
    check-cast v2, La/yje;

    .line 202
    .line 203
    check-cast v0, La/uzd;

    .line 204
    .line 205
    sget-object v2, La/uzd;->S1:La/qud;

    .line 206
    .line 207
    invoke-virtual {v0}, La/uzd;->H0()La/jzq;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v2, v0, La/jzq;->e:Landroid/widget/FrameLayout;

    .line 212
    .line 213
    iget-object v3, v0, La/jzq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 214
    .line 215
    iget-boolean v4, v1, La/r0e;->a:Z

    .line 216
    .line 217
    if-eqz v4, :cond_8

    .line 218
    .line 219
    move v4, v7

    .line 220
    goto :goto_6

    .line 221
    :cond_8
    move v4, v5

    .line 222
    :goto_6
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 223
    .line 224
    .line 225
    iget-object v2, v0, La/jzq;->h:Lcom/google/android/material/textview/MaterialTextView;

    .line 226
    .line 227
    iget-object v4, v1, La/r0e;->b:Landroid/text/SpannableStringBuilder;

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    iget-object v2, v0, La/jzq;->f:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 233
    .line 234
    iget-boolean v4, v1, La/r0e;->f:Z

    .line 235
    .line 236
    if-eqz v4, :cond_9

    .line 237
    .line 238
    move v4, v7

    .line 239
    goto :goto_7

    .line 240
    :cond_9
    move v4, v5

    .line 241
    :goto_7
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    iget-object v2, v1, La/r0e;->c:La/wzd;

    .line 245
    .line 246
    iget-boolean v4, v2, La/wzd;->b:Z

    .line 247
    .line 248
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonVisibility(Z)V

    .line 249
    .line 250
    .line 251
    iget-object v4, v2, La/wzd;->a:Ljava/lang/CharSequence;

    .line 252
    .line 253
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonText(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    iget-boolean v2, v2, La/wzd;->c:Z

    .line 257
    .line 258
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 259
    .line 260
    .line 261
    const v2, 0x7f140197

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonStyle(I)V

    .line 265
    .line 266
    .line 267
    iget-object v4, v1, La/r0e;->d:La/wzd;

    .line 268
    .line 269
    iget-boolean v6, v4, La/wzd;->b:Z

    .line 270
    .line 271
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonVisibility(Z)V

    .line 272
    .line 273
    .line 274
    iget-object v6, v4, La/wzd;->a:Ljava/lang/CharSequence;

    .line 275
    .line 276
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonText(Ljava/lang/CharSequence;)V

    .line 277
    .line 278
    .line 279
    iget-boolean v4, v4, La/wzd;->c:Z

    .line 280
    .line 281
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonEnabled(Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonStyle(I)V

    .line 285
    .line 286
    .line 287
    iget-object v4, v1, La/r0e;->e:La/wzd;

    .line 288
    .line 289
    iget-boolean v6, v4, La/wzd;->b:Z

    .line 290
    .line 291
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonVisibility(Z)V

    .line 292
    .line 293
    .line 294
    iget-object v6, v4, La/wzd;->a:Ljava/lang/CharSequence;

    .line 295
    .line 296
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonText(Ljava/lang/CharSequence;)V

    .line 297
    .line 298
    .line 299
    iget-boolean v4, v4, La/wzd;->c:Z

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonEnabled(Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setThirdButtonStyle(I)V

    .line 305
    .line 306
    .line 307
    iget-object v2, v0, La/jzq;->g:Lcom/google/android/material/textview/MaterialTextView;

    .line 308
    .line 309
    iget-boolean v3, v1, La/r0e;->h:Z

    .line 310
    .line 311
    if-eqz v3, :cond_a

    .line 312
    .line 313
    move v3, v7

    .line 314
    goto :goto_8

    .line 315
    :cond_a
    move v3, v5

    .line 316
    :goto_8
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 317
    .line 318
    .line 319
    iget-object v2, v0, La/jzq;->c:Landroidx/constraintlayout/widget/Group;

    .line 320
    .line 321
    iget-boolean v3, v1, La/r0e;->g:Z

    .line 322
    .line 323
    if-eqz v3, :cond_b

    .line 324
    .line 325
    move v5, v7

    .line 326
    :cond_b
    invoke-virtual {v2, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 327
    .line 328
    .line 329
    iget-object v0, v0, La/jzq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 330
    .line 331
    iget-object v1, v1, La/r0e;->i:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_2
    move-object/from16 v1, p1

    .line 340
    .line 341
    check-cast v1, La/fet;

    .line 342
    .line 343
    move-object/from16 v2, p2

    .line 344
    .line 345
    check-cast v2, Ljava/lang/Number;

    .line 346
    .line 347
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    check-cast v0, La/ugd;

    .line 352
    .line 353
    invoke-virtual {v0, v2, v1}, La/ugd;->a(ILa/fet;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_3
    move-object/from16 v1, p1

    .line 360
    .line 361
    check-cast v1, La/utc;

    .line 362
    .line 363
    move-object/from16 v2, p2

    .line 364
    .line 365
    check-cast v2, La/yje;

    .line 366
    .line 367
    move-object v9, v0

    .line 368
    check-cast v9, La/stc;

    .line 369
    .line 370
    sget-object v0, La/stc;->Q1:[La/iiy;

    .line 371
    .line 372
    iget-object v10, v9, La/stc;->M1:La/wdk0;

    .line 373
    .line 374
    if-eqz v10, :cond_c

    .line 375
    .line 376
    iget-object v11, v1, La/utc;->a:Ljava/lang/String;

    .line 377
    .line 378
    iget-object v13, v1, La/utc;->b:Ljava/lang/String;

    .line 379
    .line 380
    const/16 v16, 0x0

    .line 381
    .line 382
    const/16 v17, 0x70

    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const/4 v15, 0x0

    .line 386
    move-object v12, v11

    .line 387
    invoke-static/range {v9 .. v17}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 388
    .line 389
    .line 390
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object v0

    .line 393
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v8

    .line 397
    :pswitch_4
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, Ljava/util/List;

    .line 400
    .line 401
    move-object/from16 v2, p2

    .line 402
    .line 403
    check-cast v2, La/yje;

    .line 404
    .line 405
    check-cast v0, La/k1q0;

    .line 406
    .line 407
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 408
    .line 409
    .line 410
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_5
    move-object/from16 v1, p1

    .line 414
    .line 415
    check-cast v1, Ljava/lang/Throwable;

    .line 416
    .line 417
    move-object/from16 v2, p2

    .line 418
    .line 419
    check-cast v2, La/yje;

    .line 420
    .line 421
    check-cast v0, La/hrb;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    new-instance v3, La/fob;

    .line 431
    .line 432
    const/4 v4, 0x5

    .line 433
    invoke-direct {v3, v0, v1, v8, v4}, La/fob;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 434
    .line 435
    .line 436
    new-instance v1, La/lya;

    .line 437
    .line 438
    const/16 v4, 0xd

    .line 439
    .line 440
    invoke-direct {v1, v0, v4}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 441
    .line 442
    .line 443
    iget-object v0, v0, La/hrb;->c:La/mne;

    .line 444
    .line 445
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 446
    .line 447
    invoke-static {v2, v1, v8, v0, v3}, La/sac;->R(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 448
    .line 449
    .line 450
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object v0

    .line 453
    :pswitch_6
    move-object/from16 v1, p1

    .line 454
    .line 455
    check-cast v1, La/d7a;

    .line 456
    .line 457
    move-object/from16 v2, p2

    .line 458
    .line 459
    check-cast v2, La/yje;

    .line 460
    .line 461
    check-cast v0, La/xpb;

    .line 462
    .line 463
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 464
    .line 465
    iget-object v2, v0, La/xpb;->N1:La/gl5;

    .line 466
    .line 467
    if-eqz v2, :cond_d

    .line 468
    .line 469
    const v2, 0x7f130b59

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    const-string v3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 480
    .line 481
    invoke-static {v0, v3, v1, v2}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object v0

    .line 487
    :cond_d
    const-string v0, "captchaDialogDelegate"

    .line 488
    .line 489
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    throw v8

    .line 493
    :pswitch_7
    move-object/from16 v1, p1

    .line 494
    .line 495
    check-cast v1, Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    move-object/from16 v2, p2

    .line 502
    .line 503
    check-cast v2, La/yje;

    .line 504
    .line 505
    check-cast v0, La/xpb;

    .line 506
    .line 507
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 508
    .line 509
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iget-object v0, v0, La/yyq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 514
    .line 515
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 516
    .line 517
    .line 518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_8
    move-object/from16 v1, p1

    .line 522
    .line 523
    check-cast v1, Ljava/lang/String;

    .line 524
    .line 525
    move-object/from16 v2, p2

    .line 526
    .line 527
    check-cast v2, La/yje;

    .line 528
    .line 529
    check-cast v0, La/xpb;

    .line 530
    .line 531
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 532
    .line 533
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    iget-object v0, v0, La/yyq;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 538
    .line 539
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 540
    .line 541
    .line 542
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 543
    .line 544
    return-object v0

    .line 545
    :pswitch_9
    move-object/from16 v1, p1

    .line 546
    .line 547
    check-cast v1, Ljava/lang/Boolean;

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    move-object/from16 v2, p2

    .line 554
    .line 555
    check-cast v2, La/yje;

    .line 556
    .line 557
    check-cast v0, La/xpb;

    .line 558
    .line 559
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 560
    .line 561
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    iget-object v0, v0, La/yyq;->d:Landroid/widget/FrameLayout;

    .line 566
    .line 567
    if-eqz v1, :cond_e

    .line 568
    .line 569
    move v5, v7

    .line 570
    :cond_e
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 571
    .line 572
    .line 573
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_a
    move-object/from16 v1, p1

    .line 577
    .line 578
    check-cast v1, Ljava/lang/String;

    .line 579
    .line 580
    move-object/from16 v2, p2

    .line 581
    .line 582
    check-cast v2, La/yje;

    .line 583
    .line 584
    check-cast v0, La/xpb;

    .line 585
    .line 586
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 587
    .line 588
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    iget-object v0, v0, La/yyq;->f:Landroid/widget/TextView;

    .line 593
    .line 594
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 595
    .line 596
    .line 597
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_b
    move-object/from16 v1, p1

    .line 601
    .line 602
    check-cast v1, Ljava/lang/String;

    .line 603
    .line 604
    move-object/from16 v2, p2

    .line 605
    .line 606
    check-cast v2, La/yje;

    .line 607
    .line 608
    check-cast v0, La/xpb;

    .line 609
    .line 610
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 611
    .line 612
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    iget-object v2, v2, La/yyq;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 617
    .line 618
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-lez v3, :cond_f

    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_f
    move v6, v7

    .line 626
    :goto_9
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    iget-object v0, v0, La/yyq;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 634
    .line 635
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 636
    .line 637
    .line 638
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    return-object v0

    .line 641
    :pswitch_c
    move-object/from16 v1, p1

    .line 642
    .line 643
    check-cast v1, Ljava/lang/String;

    .line 644
    .line 645
    move-object/from16 v2, p2

    .line 646
    .line 647
    check-cast v2, La/yje;

    .line 648
    .line 649
    check-cast v0, La/xpb;

    .line 650
    .line 651
    sget-object v2, La/xpb;->S1:La/gl5;

    .line 652
    .line 653
    invoke-virtual {v0}, La/xpb;->G0()La/yyq;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    iget-object v0, v0, La/yyq;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 658
    .line 659
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 660
    .line 661
    .line 662
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 663
    .line 664
    return-object v0

    .line 665
    :pswitch_d
    move-object/from16 v3, p1

    .line 666
    .line 667
    check-cast v3, Ljava/lang/String;

    .line 668
    .line 669
    move-object/from16 v1, p2

    .line 670
    .line 671
    check-cast v1, La/yje;

    .line 672
    .line 673
    move-object v11, v0

    .line 674
    check-cast v11, La/aya;

    .line 675
    .line 676
    sget-object v0, La/aya;->S1:La/bj5;

    .line 677
    .line 678
    iget-object v9, v11, La/aya;->N1:La/wdk0;

    .line 679
    .line 680
    if-eqz v9, :cond_10

    .line 681
    .line 682
    new-instance v1, La/xdk0;

    .line 683
    .line 684
    sget-object v2, La/rek0;->b:La/rek0;

    .line 685
    .line 686
    const/4 v7, 0x0

    .line 687
    const/16 v8, 0x7c

    .line 688
    .line 689
    const/4 v4, 0x0

    .line 690
    const/4 v5, 0x0

    .line 691
    const/4 v6, 0x0

    .line 692
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 693
    .line 694
    .line 695
    const/4 v15, 0x0

    .line 696
    const/16 v16, 0x3fc

    .line 697
    .line 698
    const/4 v12, 0x0

    .line 699
    const/4 v13, 0x0

    .line 700
    const/4 v14, 0x0

    .line 701
    move-object v10, v1

    .line 702
    invoke-static/range {v9 .. v16}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 703
    .line 704
    .line 705
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 706
    .line 707
    return-object v0

    .line 708
    :cond_10
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v8

    .line 712
    :pswitch_e
    move-object/from16 v1, p1

    .line 713
    .line 714
    check-cast v1, Ljava/lang/String;

    .line 715
    .line 716
    move-object/from16 v2, p2

    .line 717
    .line 718
    check-cast v2, La/yje;

    .line 719
    .line 720
    check-cast v0, La/aya;

    .line 721
    .line 722
    sget-object v2, La/aya;->S1:La/bj5;

    .line 723
    .line 724
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    sget-object v2, La/mym0;->a:Landroid/widget/Toast;

    .line 732
    .line 733
    if-eqz v2, :cond_11

    .line 734
    .line 735
    invoke-virtual {v2}, Landroid/widget/Toast;->cancel()V

    .line 736
    .line 737
    .line 738
    :cond_11
    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    sput-object v0, La/mym0;->a:Landroid/widget/Toast;

    .line 743
    .line 744
    if-eqz v0, :cond_12

    .line 745
    .line 746
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 747
    .line 748
    .line 749
    :cond_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 750
    .line 751
    return-object v0

    .line 752
    :pswitch_f
    move-object/from16 v1, p1

    .line 753
    .line 754
    check-cast v1, Ljava/lang/Boolean;

    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 757
    .line 758
    .line 759
    move-result v1

    .line 760
    move-object/from16 v2, p2

    .line 761
    .line 762
    check-cast v2, La/yje;

    .line 763
    .line 764
    check-cast v0, La/aya;

    .line 765
    .line 766
    sget-object v2, La/aya;->S1:La/bj5;

    .line 767
    .line 768
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    iget-object v2, v2, La/m0b;->d:Landroid/widget/FrameLayout;

    .line 773
    .line 774
    if-eqz v1, :cond_13

    .line 775
    .line 776
    move v5, v7

    .line 777
    :cond_13
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    iget-object v2, v2, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 785
    .line 786
    const/4 v3, 0x4

    .line 787
    if-eqz v1, :cond_14

    .line 788
    .line 789
    move v4, v3

    .line 790
    goto :goto_a

    .line 791
    :cond_14
    move v4, v7

    .line 792
    :goto_a
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    iget-object v0, v0, La/m0b;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 800
    .line 801
    if-eqz v1, :cond_15

    .line 802
    .line 803
    move v7, v3

    .line 804
    :cond_15
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 805
    .line 806
    .line 807
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_10
    move-object/from16 v1, p1

    .line 811
    .line 812
    check-cast v1, La/ra10;

    .line 813
    .line 814
    move-object/from16 v2, p2

    .line 815
    .line 816
    check-cast v2, La/yje;

    .line 817
    .line 818
    check-cast v0, La/aya;

    .line 819
    .line 820
    sget-object v2, La/aya;->S1:La/bj5;

    .line 821
    .line 822
    if-eqz v1, :cond_16

    .line 823
    .line 824
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    iget-object v2, v2, La/m0b;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 829
    .line 830
    invoke-virtual {v2, v7}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    iget-object v2, v2, La/m0b;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 838
    .line 839
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 843
    .line 844
    .line 845
    move-result-object v1

    .line 846
    iget-object v1, v1, La/m0b;->d:Landroid/widget/FrameLayout;

    .line 847
    .line 848
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0, v7}, La/aya;->J0(Z)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    iget-object v0, v0, La/m0b;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 859
    .line 860
    iput-byte v3, v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->a:B

    .line 861
    .line 862
    iput v7, v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->b:I

    .line 863
    .line 864
    invoke-virtual {v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->b()V

    .line 865
    .line 866
    .line 867
    goto :goto_b

    .line 868
    :cond_16
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    iget-object v1, v1, La/m0b;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 873
    .line 874
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v0, v6}, La/aya;->J0(Z)V

    .line 878
    .line 879
    .line 880
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 881
    .line 882
    return-object v0

    .line 883
    :pswitch_11
    move-object/from16 v1, p1

    .line 884
    .line 885
    check-cast v1, La/wya;

    .line 886
    .line 887
    move-object/from16 v2, p2

    .line 888
    .line 889
    check-cast v2, La/yje;

    .line 890
    .line 891
    check-cast v0, La/aya;

    .line 892
    .line 893
    sget-object v2, La/aya;->S1:La/bj5;

    .line 894
    .line 895
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    iget-object v4, v0, La/aya;->R1:La/n0o0;

    .line 900
    .line 901
    iget-object v2, v2, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 902
    .line 903
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    if-nez v2, :cond_17

    .line 908
    .line 909
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    iget-object v2, v2, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 914
    .line 915
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v5

    .line 919
    check-cast v5, La/lza;

    .line 920
    .line 921
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 922
    .line 923
    .line 924
    :cond_17
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    check-cast v2, La/lza;

    .line 929
    .line 930
    iget-object v4, v1, La/wya;->a:Ljava/util/List;

    .line 931
    .line 932
    invoke-virtual {v2, v4}, La/lza;->A(Ljava/util/List;)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    iget-object v2, v2, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 940
    .line 941
    invoke-static {v2}, La/bdx;->j0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v0}, La/aya;->H0()La/m0b;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    iget-object v0, v0, La/m0b;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 949
    .line 950
    iget v1, v1, La/wya;->b:I

    .line 951
    .line 952
    iput-byte v3, v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->a:B

    .line 953
    .line 954
    iput v1, v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->b:I

    .line 955
    .line 956
    invoke-virtual {v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->b()V

    .line 957
    .line 958
    .line 959
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_12
    move-object/from16 v1, p1

    .line 963
    .line 964
    check-cast v1, Ljava/lang/Throwable;

    .line 965
    .line 966
    move-object/from16 v3, p2

    .line 967
    .line 968
    check-cast v3, La/yje;

    .line 969
    .line 970
    move-object v3, v0

    .line 971
    check-cast v3, La/wsa;

    .line 972
    .line 973
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 974
    .line 975
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 976
    .line 977
    :cond_18
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    iget-object v5, v3, La/i3t0;->f:La/oyg0;

    .line 985
    .line 986
    move-object v6, v0

    .line 987
    check-cast v6, La/gsa;

    .line 988
    .line 989
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    sget-object v10, La/iun;->a:La/iun;

    .line 993
    .line 994
    const/16 v16, 0x0

    .line 995
    .line 996
    const/16 v17, 0xfe3

    .line 997
    .line 998
    const/4 v7, 0x0

    .line 999
    const/4 v8, 0x0

    .line 1000
    const/4 v9, 0x1

    .line 1001
    const/4 v11, 0x0

    .line 1002
    const/4 v12, 0x0

    .line 1003
    const/4 v13, 0x0

    .line 1004
    const/4 v14, 0x0

    .line 1005
    const/4 v15, 0x0

    .line 1006
    invoke-static/range {v6 .. v17}, La/gsa;->a(La/gsa;La/rra;La/om5;ZLjava/util/List;IILa/dta;ZZLjava/lang/String;I)La/gsa;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v5

    .line 1010
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    if-eqz v0, :cond_18

    .line 1015
    .line 1016
    iget-object v0, v3, La/wsa;->E:La/duj;

    .line 1017
    .line 1018
    new-instance v3, La/im8;

    .line 1019
    .line 1020
    invoke-direct {v3, v2}, La/im8;-><init>(B)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1024
    .line 1025
    .line 1026
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_13
    move-object/from16 v1, p1

    .line 1030
    .line 1031
    check-cast v1, Ljava/lang/Throwable;

    .line 1032
    .line 1033
    move-object/from16 v3, p2

    .line 1034
    .line 1035
    check-cast v3, La/yje;

    .line 1036
    .line 1037
    move-object v3, v0

    .line 1038
    check-cast v3, La/wsa;

    .line 1039
    .line 1040
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 1041
    .line 1042
    iget-object v5, v0, La/ocj;->a:La/p7m0;

    .line 1043
    .line 1044
    :cond_19
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    iget-object v4, v3, La/i3t0;->f:La/oyg0;

    .line 1052
    .line 1053
    move-object v6, v0

    .line 1054
    check-cast v6, La/gsa;

    .line 1055
    .line 1056
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    sget-object v10, La/iun;->a:La/iun;

    .line 1060
    .line 1061
    const/16 v16, 0x0

    .line 1062
    .line 1063
    const/16 v17, 0xfe3

    .line 1064
    .line 1065
    const/4 v7, 0x0

    .line 1066
    const/4 v8, 0x0

    .line 1067
    const/4 v9, 0x1

    .line 1068
    const/4 v11, 0x0

    .line 1069
    const/4 v12, 0x0

    .line 1070
    const/4 v13, 0x0

    .line 1071
    const/4 v14, 0x0

    .line 1072
    const/4 v15, 0x0

    .line 1073
    invoke-static/range {v6 .. v17}, La/gsa;->a(La/gsa;La/rra;La/om5;ZLjava/util/List;IILa/dta;ZZLjava/lang/String;I)La/gsa;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v4

    .line 1077
    invoke-virtual {v5, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_19

    .line 1082
    .line 1083
    iget-object v0, v3, La/wsa;->E:La/duj;

    .line 1084
    .line 1085
    new-instance v3, La/im8;

    .line 1086
    .line 1087
    invoke-direct {v3, v2}, La/im8;-><init>(B)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1091
    .line 1092
    .line 1093
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1094
    .line 1095
    return-object v0

    .line 1096
    :pswitch_14
    move-object/from16 v1, p1

    .line 1097
    .line 1098
    check-cast v1, La/tq9;

    .line 1099
    .line 1100
    move-object/from16 v2, p2

    .line 1101
    .line 1102
    check-cast v2, La/yje;

    .line 1103
    .line 1104
    move-object v11, v0

    .line 1105
    check-cast v11, La/br9;

    .line 1106
    .line 1107
    sget-object v0, La/br9;->S1:La/kl5;

    .line 1108
    .line 1109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    sget-object v0, La/pq9;->a:La/pq9;

    .line 1113
    .line 1114
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v2

    .line 1118
    if-eqz v2, :cond_1a

    .line 1119
    .line 1120
    goto/16 :goto_d

    .line 1121
    .line 1122
    :cond_1a
    sget-object v2, La/qq9;->a:La/qq9;

    .line 1123
    .line 1124
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    if-eqz v2, :cond_1c

    .line 1129
    .line 1130
    iget-object v1, v11, La/br9;->L1:La/ii;

    .line 1131
    .line 1132
    if-eqz v1, :cond_1b

    .line 1133
    .line 1134
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1135
    .line 1136
    const v2, 0x7f13142c

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v13

    .line 1143
    const v2, 0x7f13143d

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v14

    .line 1150
    const v2, 0x7f131843

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v15

    .line 1157
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    const v2, 0x7f130e07

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v16

    .line 1167
    sget-object v21, La/n12;->a:La/n12;

    .line 1168
    .line 1169
    const/16 v22, 0x0

    .line 1170
    .line 1171
    const/16 v23, 0x5d0

    .line 1172
    .line 1173
    const/16 v17, 0x0

    .line 1174
    .line 1175
    const-string v18, "CANCEL_REQUEST_DIALOG_KEY"

    .line 1176
    .line 1177
    const/16 v19, 0x0

    .line 1178
    .line 1179
    const/16 v20, 0x0

    .line 1180
    .line 1181
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v1, v12, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1192
    .line 1193
    .line 1194
    goto :goto_c

    .line 1195
    :cond_1b
    const-string v0, "actionDialogManager"

    .line 1196
    .line 1197
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    throw v8

    .line 1201
    :cond_1c
    instance-of v2, v1, La/sq9;

    .line 1202
    .line 1203
    if-eqz v2, :cond_1e

    .line 1204
    .line 1205
    check-cast v1, La/sq9;

    .line 1206
    .line 1207
    iget-object v14, v1, La/sq9;->a:Ljava/lang/String;

    .line 1208
    .line 1209
    iget-object v9, v11, La/br9;->M1:La/wdk0;

    .line 1210
    .line 1211
    if-eqz v9, :cond_1d

    .line 1212
    .line 1213
    new-instance v10, La/xdk0;

    .line 1214
    .line 1215
    sget-object v13, La/pek0;->a:La/pek0;

    .line 1216
    .line 1217
    const/16 v18, 0x0

    .line 1218
    .line 1219
    const/16 v19, 0x7c

    .line 1220
    .line 1221
    const/4 v15, 0x0

    .line 1222
    const/16 v16, 0x0

    .line 1223
    .line 1224
    const/16 v17, 0x0

    .line 1225
    .line 1226
    move-object v12, v10

    .line 1227
    invoke-direct/range {v12 .. v19}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1228
    .line 1229
    .line 1230
    const/16 v16, 0x3fc

    .line 1231
    .line 1232
    const/4 v12, 0x0

    .line 1233
    const/4 v13, 0x0

    .line 1234
    const/4 v14, 0x0

    .line 1235
    invoke-static/range {v9 .. v16}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1236
    .line 1237
    .line 1238
    goto :goto_c

    .line 1239
    :cond_1d
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    throw v8

    .line 1243
    :cond_1e
    sget-object v2, La/rq9;->a:La/rq9;

    .line 1244
    .line 1245
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v1

    .line 1249
    if-eqz v1, :cond_20

    .line 1250
    .line 1251
    iget-object v9, v11, La/br9;->M1:La/wdk0;

    .line 1252
    .line 1253
    if-eqz v9, :cond_1f

    .line 1254
    .line 1255
    new-instance v10, La/xdk0;

    .line 1256
    .line 1257
    sget-object v13, La/rek0;->b:La/rek0;

    .line 1258
    .line 1259
    const v1, 0x7f1307d0

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v14

    .line 1266
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    const/16 v18, 0x0

    .line 1270
    .line 1271
    const/16 v19, 0x7c

    .line 1272
    .line 1273
    const/4 v15, 0x0

    .line 1274
    const/16 v16, 0x0

    .line 1275
    .line 1276
    const/16 v17, 0x0

    .line 1277
    .line 1278
    move-object v12, v10

    .line 1279
    invoke-direct/range {v12 .. v19}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1280
    .line 1281
    .line 1282
    const/16 v16, 0x3fc

    .line 1283
    .line 1284
    const/4 v12, 0x0

    .line 1285
    const/4 v13, 0x0

    .line 1286
    const/4 v14, 0x0

    .line 1287
    invoke-static/range {v9 .. v16}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1288
    .line 1289
    .line 1290
    :goto_c
    invoke-virtual {v11}, La/br9;->H0()La/mr9;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    iget-object v1, v1, La/mr9;->n:La/p7m0;

    .line 1295
    .line 1296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v1, v8, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    :goto_d
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1303
    .line 1304
    goto :goto_e

    .line 1305
    :cond_1f
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    throw v8

    .line 1309
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 1310
    .line 1311
    .line 1312
    :goto_e
    return-object v8

    .line 1313
    :pswitch_15
    move-object/from16 v1, p1

    .line 1314
    .line 1315
    check-cast v1, La/us9;

    .line 1316
    .line 1317
    move-object/from16 v2, p2

    .line 1318
    .line 1319
    check-cast v2, La/yje;

    .line 1320
    .line 1321
    check-cast v0, La/br9;

    .line 1322
    .line 1323
    sget-object v2, La/br9;->S1:La/kl5;

    .line 1324
    .line 1325
    instance-of v2, v1, La/ms9;

    .line 1326
    .line 1327
    if-eqz v2, :cond_22

    .line 1328
    .line 1329
    check-cast v1, La/ms9;

    .line 1330
    .line 1331
    invoke-virtual {v0}, La/br9;->G0()La/wyq;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v2

    .line 1335
    iget-object v3, v0, La/br9;->R1:La/n0o0;

    .line 1336
    .line 1337
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    check-cast v3, La/cyv;

    .line 1342
    .line 1343
    iget-object v4, v1, La/ms9;->a:Ljava/util/List;

    .line 1344
    .line 1345
    invoke-virtual {v3, v4}, La/zz3;->A(Ljava/util/List;)V

    .line 1346
    .line 1347
    .line 1348
    iget-object v3, v2, La/wyq;->c:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 1349
    .line 1350
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1351
    .line 1352
    .line 1353
    iget-object v3, v2, La/wyq;->e:Landroid/widget/TextView;

    .line 1354
    .line 1355
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1356
    .line 1357
    .line 1358
    iget-object v3, v2, La/wyq;->d:La/vr9;

    .line 1359
    .line 1360
    iget-object v3, v3, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 1361
    .line 1362
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1363
    .line 1364
    .line 1365
    invoke-static {v3}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 1366
    .line 1367
    .line 1368
    iget-object v2, v2, La/wyq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1369
    .line 1370
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1371
    .line 1372
    .line 1373
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 1374
    .line 1375
    instance-of v2, v0, La/yr10;

    .line 1376
    .line 1377
    if-eqz v2, :cond_21

    .line 1378
    .line 1379
    move-object v8, v0

    .line 1380
    check-cast v8, La/yr10;

    .line 1381
    .line 1382
    :cond_21
    if-eqz v8, :cond_28

    .line 1383
    .line 1384
    iget-boolean v0, v1, La/ms9;->b:Z

    .line 1385
    .line 1386
    invoke-virtual {v8, v0}, La/yr10;->H0(Z)V

    .line 1387
    .line 1388
    .line 1389
    goto/16 :goto_f

    .line 1390
    .line 1391
    :cond_22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1392
    .line 1393
    .line 1394
    sget-object v2, La/os9;->a:La/os9;

    .line 1395
    .line 1396
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1397
    .line 1398
    .line 1399
    move-result v2

    .line 1400
    if-eqz v2, :cond_24

    .line 1401
    .line 1402
    invoke-virtual {v0}, La/br9;->G0()La/wyq;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v1

    .line 1406
    iget-object v2, v1, La/wyq;->c:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 1407
    .line 1408
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1409
    .line 1410
    .line 1411
    iget-object v2, v1, La/wyq;->e:Landroid/widget/TextView;

    .line 1412
    .line 1413
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1414
    .line 1415
    .line 1416
    iget-object v2, v1, La/wyq;->d:La/vr9;

    .line 1417
    .line 1418
    iget-object v2, v2, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 1419
    .line 1420
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1421
    .line 1422
    .line 1423
    invoke-static {v2}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 1424
    .line 1425
    .line 1426
    iget-object v1, v1, La/wyq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1427
    .line 1428
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1429
    .line 1430
    .line 1431
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 1432
    .line 1433
    instance-of v1, v0, La/yr10;

    .line 1434
    .line 1435
    if-eqz v1, :cond_23

    .line 1436
    .line 1437
    move-object v8, v0

    .line 1438
    check-cast v8, La/yr10;

    .line 1439
    .line 1440
    :cond_23
    if-eqz v8, :cond_28

    .line 1441
    .line 1442
    invoke-virtual {v8, v7}, La/yr10;->H0(Z)V

    .line 1443
    .line 1444
    .line 1445
    goto :goto_f

    .line 1446
    :cond_24
    sget-object v2, La/ss9;->a:La/ss9;

    .line 1447
    .line 1448
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v2

    .line 1452
    if-eqz v2, :cond_26

    .line 1453
    .line 1454
    invoke-virtual {v0}, La/br9;->G0()La/wyq;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    iget-object v2, v1, La/wyq;->c:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 1459
    .line 1460
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1461
    .line 1462
    .line 1463
    iget-object v2, v1, La/wyq;->e:Landroid/widget/TextView;

    .line 1464
    .line 1465
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1466
    .line 1467
    .line 1468
    iget-object v2, v1, La/wyq;->d:La/vr9;

    .line 1469
    .line 1470
    iget-object v2, v2, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 1471
    .line 1472
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1473
    .line 1474
    .line 1475
    invoke-static {v2}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 1476
    .line 1477
    .line 1478
    iget-object v1, v1, La/wyq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1479
    .line 1480
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1481
    .line 1482
    .line 1483
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 1484
    .line 1485
    instance-of v1, v0, La/yr10;

    .line 1486
    .line 1487
    if-eqz v1, :cond_25

    .line 1488
    .line 1489
    move-object v8, v0

    .line 1490
    check-cast v8, La/yr10;

    .line 1491
    .line 1492
    :cond_25
    if-eqz v8, :cond_28

    .line 1493
    .line 1494
    invoke-virtual {v8, v7}, La/yr10;->H0(Z)V

    .line 1495
    .line 1496
    .line 1497
    goto :goto_f

    .line 1498
    :cond_26
    instance-of v2, v1, La/qs9;

    .line 1499
    .line 1500
    if-eqz v2, :cond_29

    .line 1501
    .line 1502
    check-cast v1, La/qs9;

    .line 1503
    .line 1504
    invoke-virtual {v0}, La/br9;->G0()La/wyq;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v2

    .line 1508
    iget-object v3, v2, La/wyq;->c:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 1509
    .line 1510
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1511
    .line 1512
    .line 1513
    iget-object v3, v2, La/wyq;->e:Landroid/widget/TextView;

    .line 1514
    .line 1515
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1516
    .line 1517
    .line 1518
    iget-object v3, v2, La/wyq;->d:La/vr9;

    .line 1519
    .line 1520
    iget-object v3, v3, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 1521
    .line 1522
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1523
    .line 1524
    .line 1525
    invoke-static {v3}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 1526
    .line 1527
    .line 1528
    iget-object v2, v2, La/wyq;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1529
    .line 1530
    iget-object v1, v1, La/qs9;->a:La/ra10;

    .line 1531
    .line 1532
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->w(La/ra10;)V

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v2, v7}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1536
    .line 1537
    .line 1538
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 1539
    .line 1540
    instance-of v1, v0, La/yr10;

    .line 1541
    .line 1542
    if-eqz v1, :cond_27

    .line 1543
    .line 1544
    move-object v8, v0

    .line 1545
    check-cast v8, La/yr10;

    .line 1546
    .line 1547
    :cond_27
    if-eqz v8, :cond_28

    .line 1548
    .line 1549
    invoke-virtual {v8, v7}, La/yr10;->H0(Z)V

    .line 1550
    .line 1551
    .line 1552
    :cond_28
    :goto_f
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1553
    .line 1554
    goto :goto_10

    .line 1555
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1556
    .line 1557
    .line 1558
    :goto_10
    return-object v8

    .line 1559
    :pswitch_16
    sget-object v1, La/t79;->a:La/t79;

    .line 1560
    .line 1561
    move-object/from16 v2, p1

    .line 1562
    .line 1563
    check-cast v2, La/w79;

    .line 1564
    .line 1565
    move-object/from16 v3, p2

    .line 1566
    .line 1567
    check-cast v3, La/yje;

    .line 1568
    .line 1569
    check-cast v0, La/z79;

    .line 1570
    .line 1571
    sget-object v3, La/z79;->O1:La/bj5;

    .line 1572
    .line 1573
    instance-of v3, v2, La/u79;

    .line 1574
    .line 1575
    if-eqz v3, :cond_2a

    .line 1576
    .line 1577
    sget-object v2, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Fullscreen;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Fullscreen;

    .line 1578
    .line 1579
    invoke-virtual {v0, v2}, La/z79;->J0(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    iget-object v0, v0, La/p89;->m:La/p7m0;

    .line 1587
    .line 1588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1592
    .line 1593
    .line 1594
    goto/16 :goto_12

    .line 1595
    .line 1596
    :cond_2a
    instance-of v3, v2, La/v79;

    .line 1597
    .line 1598
    if-eqz v3, :cond_2d

    .line 1599
    .line 1600
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v3

    .line 1604
    invoke-static {v3}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v3

    .line 1608
    if-eqz v3, :cond_2b

    .line 1609
    .line 1610
    sget-object v3, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Windowed;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Windowed;

    .line 1611
    .line 1612
    invoke-virtual {v0, v3}, La/z79;->J0(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;)V

    .line 1613
    .line 1614
    .line 1615
    check-cast v2, La/v79;

    .line 1616
    .line 1617
    iget-object v2, v2, La/v79;->a:La/vb8;

    .line 1618
    .line 1619
    invoke-virtual {v2}, La/vb8;->invoke()Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    goto :goto_11

    .line 1623
    :cond_2b
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v2

    .line 1627
    new-instance v3, Landroid/content/Intent;

    .line 1628
    .line 1629
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v4

    .line 1633
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1634
    .line 1635
    const-string v6, "package:"

    .line 1636
    .line 1637
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v4

    .line 1647
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v4

    .line 1651
    const-string v5, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 1652
    .line 1653
    invoke-direct {v3, v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1654
    .line 1655
    .line 1656
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v4

    .line 1660
    invoke-virtual {v4, v3, v7}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v4

    .line 1664
    if-eqz v4, :cond_2c

    .line 1665
    .line 1666
    const/high16 v4, 0x10000000

    .line 1667
    .line 1668
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1669
    .line 1670
    .line 1671
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1672
    .line 1673
    .line 1674
    :cond_2c
    :goto_11
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    iget-object v0, v0, La/p89;->m:La/p7m0;

    .line 1679
    .line 1680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    goto :goto_12

    .line 1687
    :cond_2d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1688
    .line 1689
    .line 1690
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v3

    .line 1694
    if-nez v3, :cond_2f

    .line 1695
    .line 1696
    sget-object v3, La/t79;->b:La/t79;

    .line 1697
    .line 1698
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v2

    .line 1702
    if-eqz v2, :cond_2e

    .line 1703
    .line 1704
    sget-object v2, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Stop;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Stop;

    .line 1705
    .line 1706
    invoke-virtual {v0, v2}, La/z79;->J0(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;)V

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v0}, La/z79;->H0()La/p89;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v0

    .line 1713
    iget-object v0, v0, La/p89;->m:La/p7m0;

    .line 1714
    .line 1715
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1719
    .line 1720
    .line 1721
    goto :goto_12

    .line 1722
    :cond_2e
    invoke-static {}, La/t9f;->b()V

    .line 1723
    .line 1724
    .line 1725
    goto :goto_13

    .line 1726
    :cond_2f
    :goto_12
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1727
    .line 1728
    :goto_13
    return-object v8

    .line 1729
    :pswitch_17
    move-object/from16 v1, p1

    .line 1730
    .line 1731
    check-cast v1, La/f89;

    .line 1732
    .line 1733
    move-object/from16 v2, p2

    .line 1734
    .line 1735
    check-cast v2, La/yje;

    .line 1736
    .line 1737
    check-cast v0, La/z79;

    .line 1738
    .line 1739
    sget-object v2, La/z79;->O1:La/bj5;

    .line 1740
    .line 1741
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1742
    .line 1743
    .line 1744
    if-eqz v1, :cond_33

    .line 1745
    .line 1746
    instance-of v2, v1, La/c89;

    .line 1747
    .line 1748
    if-eqz v2, :cond_30

    .line 1749
    .line 1750
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v2

    .line 1754
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1755
    .line 1756
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1757
    .line 1758
    .line 1759
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v2

    .line 1763
    iget-object v2, v2, La/f0r;->c:Landroid/widget/TextView;

    .line 1764
    .line 1765
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1766
    .line 1767
    .line 1768
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v2

    .line 1772
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1773
    .line 1774
    invoke-virtual {v2, v7}, La/ctr;->setProgressVisible(Z)V

    .line 1775
    .line 1776
    .line 1777
    check-cast v1, La/c89;

    .line 1778
    .line 1779
    iget-boolean v1, v1, La/c89;->a:Z

    .line 1780
    .line 1781
    invoke-virtual {v0, v1}, La/z79;->I0(Z)V

    .line 1782
    .line 1783
    .line 1784
    goto/16 :goto_15

    .line 1785
    .line 1786
    :cond_30
    instance-of v2, v1, La/e89;

    .line 1787
    .line 1788
    if-eqz v2, :cond_31

    .line 1789
    .line 1790
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v2

    .line 1794
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1795
    .line 1796
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v2

    .line 1803
    iget-object v2, v2, La/f0r;->c:Landroid/widget/TextView;

    .line 1804
    .line 1805
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1813
    .line 1814
    check-cast v1, La/e89;

    .line 1815
    .line 1816
    iget-object v3, v1, La/e89;->a:Ljava/lang/String;

    .line 1817
    .line 1818
    invoke-virtual {v2, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setBroadcastingUrl(Ljava/lang/String;)V

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v2

    .line 1825
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1826
    .line 1827
    invoke-virtual {v2, v6}, La/ctr;->setProgressVisible(Z)V

    .line 1828
    .line 1829
    .line 1830
    iget-boolean v1, v1, La/e89;->b:Z

    .line 1831
    .line 1832
    invoke-virtual {v0, v1}, La/z79;->I0(Z)V

    .line 1833
    .line 1834
    .line 1835
    goto :goto_15

    .line 1836
    :cond_31
    instance-of v2, v1, La/d89;

    .line 1837
    .line 1838
    if-eqz v2, :cond_33

    .line 1839
    .line 1840
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v2

    .line 1844
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1845
    .line 1846
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v2

    .line 1853
    iget-object v2, v2, La/f0r;->c:Landroid/widget/TextView;

    .line 1854
    .line 1855
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v2

    .line 1862
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1863
    .line 1864
    invoke-virtual {v2, v7}, La/ctr;->setProgressVisible(Z)V

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v2

    .line 1871
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1872
    .line 1873
    check-cast v1, La/d89;

    .line 1874
    .line 1875
    iget-boolean v3, v1, La/d89;->c:Z

    .line 1876
    .line 1877
    iget-object v4, v1, La/d89;->e:La/w3w0;

    .line 1878
    .line 1879
    iget-boolean v5, v1, La/d89;->f:Z

    .line 1880
    .line 1881
    invoke-virtual {v2, v5}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setZoneFormatIsVisible(Z)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v2

    .line 1888
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1889
    .line 1890
    invoke-virtual {v2, v4}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setZoneFormatDrawable(La/w3w0;)V

    .line 1891
    .line 1892
    .line 1893
    iget-boolean v2, v1, La/d89;->d:Z

    .line 1894
    .line 1895
    invoke-virtual {v0, v2}, La/z79;->I0(Z)V

    .line 1896
    .line 1897
    .line 1898
    if-eqz v3, :cond_32

    .line 1899
    .line 1900
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v2

    .line 1904
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1905
    .line 1906
    iget-object v5, v1, La/d89;->a:Ljava/lang/String;

    .line 1907
    .line 1908
    invoke-virtual {v2, v5}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setPlayZoneCommand(Ljava/lang/String;)V

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v2

    .line 1915
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1916
    .line 1917
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->f()V

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v2

    .line 1924
    iget-object v2, v2, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1925
    .line 1926
    iget-object v1, v1, La/d89;->b:Ljava/lang/String;

    .line 1927
    .line 1928
    invoke-virtual {v2, v1, v4}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g(Ljava/lang/String;La/w3w0;)V

    .line 1929
    .line 1930
    .line 1931
    goto :goto_14

    .line 1932
    :cond_32
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v1

    .line 1936
    iget-object v1, v1, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1937
    .line 1938
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->e()V

    .line 1939
    .line 1940
    .line 1941
    :goto_14
    invoke-virtual {v0}, La/z79;->G0()La/f0r;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v0

    .line 1945
    iget-object v0, v0, La/f0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1946
    .line 1947
    invoke-virtual {v0, v3}, La/ctr;->setPlayDrawable(Z)V

    .line 1948
    .line 1949
    .line 1950
    :goto_15
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1951
    .line 1952
    goto :goto_16

    .line 1953
    :cond_33
    invoke-static {}, La/t9f;->b()V

    .line 1954
    .line 1955
    .line 1956
    :goto_16
    return-object v8

    .line 1957
    :pswitch_18
    move-object/from16 v1, p1

    .line 1958
    .line 1959
    check-cast v1, La/cm80;

    .line 1960
    .line 1961
    move-object/from16 v2, p2

    .line 1962
    .line 1963
    check-cast v2, La/yje;

    .line 1964
    .line 1965
    check-cast v0, La/s29;

    .line 1966
    .line 1967
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1968
    .line 1969
    .line 1970
    instance-of v2, v1, La/zl80;

    .line 1971
    .line 1972
    if-eqz v2, :cond_34

    .line 1973
    .line 1974
    move-object v2, v1

    .line 1975
    check-cast v2, La/zl80;

    .line 1976
    .line 1977
    iget-boolean v2, v2, La/zl80;->b:Z

    .line 1978
    .line 1979
    if-eqz v2, :cond_34

    .line 1980
    .line 1981
    move v7, v6

    .line 1982
    :cond_34
    new-instance v2, La/b85;

    .line 1983
    .line 1984
    invoke-direct {v2, v1, v7, v6}, La/b85;-><init>(La/cm80;ZB)V

    .line 1985
    .line 1986
    .line 1987
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1988
    .line 1989
    .line 1990
    if-eqz v7, :cond_35

    .line 1991
    .line 1992
    sget-object v1, La/r19;->a:La/r19;

    .line 1993
    .line 1994
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1995
    .line 1996
    .line 1997
    :cond_35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1998
    .line 1999
    return-object v0

    .line 2000
    :pswitch_19
    move-object/from16 v1, p1

    .line 2001
    .line 2002
    check-cast v1, La/cm80;

    .line 2003
    .line 2004
    move-object/from16 v2, p2

    .line 2005
    .line 2006
    check-cast v2, La/yje;

    .line 2007
    .line 2008
    check-cast v0, La/ty8;

    .line 2009
    .line 2010
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2011
    .line 2012
    .line 2013
    instance-of v2, v1, La/zl80;

    .line 2014
    .line 2015
    if-eqz v2, :cond_36

    .line 2016
    .line 2017
    move-object v2, v1

    .line 2018
    check-cast v2, La/zl80;

    .line 2019
    .line 2020
    iget-boolean v2, v2, La/zl80;->b:Z

    .line 2021
    .line 2022
    if-eqz v2, :cond_36

    .line 2023
    .line 2024
    move v7, v6

    .line 2025
    :cond_36
    new-instance v2, La/uj1;

    .line 2026
    .line 2027
    invoke-direct {v2, v1, v6}, La/uj1;-><init>(La/cm80;B)V

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 2031
    .line 2032
    .line 2033
    if-eqz v7, :cond_37

    .line 2034
    .line 2035
    sget-object v1, La/mx8;->a:La/mx8;

    .line 2036
    .line 2037
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2038
    .line 2039
    .line 2040
    :cond_37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2041
    .line 2042
    return-object v0

    .line 2043
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2044
    .line 2045
    check-cast v1, La/i68;

    .line 2046
    .line 2047
    move-object/from16 v2, p2

    .line 2048
    .line 2049
    check-cast v2, La/yje;

    .line 2050
    .line 2051
    check-cast v0, La/e68;

    .line 2052
    .line 2053
    sget-object v2, La/e68;->N1:La/cl5;

    .line 2054
    .line 2055
    instance-of v2, v1, La/g68;

    .line 2056
    .line 2057
    if-eqz v2, :cond_39

    .line 2058
    .line 2059
    invoke-virtual {v0}, La/e68;->G0()La/qyq;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v2

    .line 2063
    iget-object v2, v2, La/qyq;->d:Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;

    .line 2064
    .line 2065
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d()V

    .line 2066
    .line 2067
    .line 2068
    check-cast v1, La/g68;

    .line 2069
    .line 2070
    iget-boolean v1, v1, La/g68;->a:Z

    .line 2071
    .line 2072
    if-eqz v1, :cond_38

    .line 2073
    .line 2074
    invoke-virtual {v0}, La/e68;->H0()La/j68;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v0

    .line 2078
    sget-object v1, La/m2a;->e:La/m2a;

    .line 2079
    .line 2080
    invoke-virtual {v0, v1}, La/j68;->w(La/w58;)V

    .line 2081
    .line 2082
    .line 2083
    goto/16 :goto_20

    .line 2084
    .line 2085
    :cond_38
    invoke-virtual {v0}, La/e68;->G0()La/qyq;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v1

    .line 2089
    iget-object v1, v1, La/qyq;->c:Landroid/widget/TextView;

    .line 2090
    .line 2091
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v2

    .line 2095
    const v3, 0x7f0606d0

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v2, v3}, Landroid/content/Context;->getColor(I)I

    .line 2099
    .line 2100
    .line 2101
    move-result v2

    .line 2102
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2103
    .line 2104
    .line 2105
    const v2, 0x7f1308d2

    .line 2106
    .line 2107
    .line 2108
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 2109
    .line 2110
    .line 2111
    new-instance v1, La/nvu;

    .line 2112
    .line 2113
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v2

    .line 2117
    invoke-direct {v1, v2}, La/nvu;-><init>(Landroid/content/Context;)V

    .line 2118
    .line 2119
    .line 2120
    invoke-virtual {v1}, La/nvu;->Z()V

    .line 2121
    .line 2122
    .line 2123
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v1

    .line 2127
    const v2, 0x7f01005c

    .line 2128
    .line 2129
    .line 2130
    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v1

    .line 2134
    invoke-virtual {v0}, La/e68;->G0()La/qyq;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v0

    .line 2138
    iget-object v0, v0, La/qyq;->c:Landroid/widget/TextView;

    .line 2139
    .line 2140
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2141
    .line 2142
    .line 2143
    goto/16 :goto_20

    .line 2144
    .line 2145
    :cond_39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2146
    .line 2147
    .line 2148
    sget-object v2, La/h68;->a:La/h68;

    .line 2149
    .line 2150
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2151
    .line 2152
    .line 2153
    move-result v1

    .line 2154
    if-eqz v1, :cond_4d

    .line 2155
    .line 2156
    new-instance v1, La/d68;

    .line 2157
    .line 2158
    invoke-direct {v1, v0}, La/d68;-><init>(La/e68;)V

    .line 2159
    .line 2160
    .line 2161
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v2

    .line 2165
    invoke-static {v2}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v2

    .line 2169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2170
    .line 2171
    .line 2172
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v3

    .line 2176
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->g()La/piu0;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v4

    .line 2180
    invoke-static {v0}, La/u4n0;->p(La/riu0;)La/miu0;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v5

    .line 2184
    invoke-static {v0}, La/u4n0;->o(La/riu0;)La/wbf;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v9

    .line 2188
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2189
    .line 2190
    .line 2191
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2192
    .line 2193
    .line 2194
    new-instance v10, La/h0q0;

    .line 2195
    .line 2196
    invoke-direct {v10, v4, v5, v9}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 2197
    .line 2198
    .line 2199
    sget-object v4, La/sre0;->a:La/tre0;

    .line 2200
    .line 2201
    const-class v5, La/t58;

    .line 2202
    .line 2203
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v9

    .line 2207
    invoke-interface {v9}, La/sgy;->v()Ljava/lang/String;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v11

    .line 2211
    const-string v12, "Local and anonymous classes can not be ViewModels"

    .line 2212
    .line 2213
    if-eqz v11, :cond_4c

    .line 2214
    .line 2215
    const-string v13, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 2216
    .line 2217
    invoke-virtual {v13, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v11

    .line 2221
    invoke-virtual {v10, v9, v11}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v9

    .line 2225
    check-cast v9, La/t58;

    .line 2226
    .line 2227
    iget-object v10, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 2228
    .line 2229
    new-instance v11, La/r58;

    .line 2230
    .line 2231
    invoke-direct {v11, v9}, La/r58;-><init>(La/t58;)V

    .line 2232
    .line 2233
    .line 2234
    invoke-virtual {v10, v11}, La/glz;->a(La/blz;)V

    .line 2235
    .line 2236
    .line 2237
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->g()La/piu0;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v9

    .line 2241
    invoke-static {v0}, La/u4n0;->p(La/riu0;)La/miu0;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v10

    .line 2245
    invoke-static {v0}, La/u4n0;->o(La/riu0;)La/wbf;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v11

    .line 2249
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2250
    .line 2251
    .line 2252
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2253
    .line 2254
    .line 2255
    new-instance v14, La/h0q0;

    .line 2256
    .line 2257
    invoke-direct {v14, v9, v10, v11}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 2258
    .line 2259
    .line 2260
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 2261
    .line 2262
    .line 2263
    move-result-object v4

    .line 2264
    invoke-interface {v4}, La/sgy;->v()Ljava/lang/String;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v5

    .line 2268
    if-eqz v5, :cond_4b

    .line 2269
    .line 2270
    invoke-virtual {v13, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v5

    .line 2274
    invoke-virtual {v14, v4, v5}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v4

    .line 2278
    check-cast v4, La/t58;

    .line 2279
    .line 2280
    iput-object v2, v4, La/t58;->b:Ljava/util/concurrent/Executor;

    .line 2281
    .line 2282
    iput-object v1, v4, La/t58;->c:La/nnw0;

    .line 2283
    .line 2284
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v1

    .line 2288
    const v2, 0x7f1302a8

    .line 2289
    .line 2290
    .line 2291
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v1

    .line 2295
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    const v2, 0x7f13032f

    .line 2300
    .line 2301
    .line 2302
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v0

    .line 2306
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2307
    .line 2308
    .line 2309
    move-result v2

    .line 2310
    if-nez v2, :cond_4a

    .line 2311
    .line 2312
    invoke-static {v7}, La/hmw0;->a0(I)Z

    .line 2313
    .line 2314
    .line 2315
    move-result v2

    .line 2316
    if-eqz v2, :cond_49

    .line 2317
    .line 2318
    new-instance v2, La/yzn0;

    .line 2319
    .line 2320
    invoke-direct {v2, v1, v0}, La/yzn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2321
    .line 2322
    .line 2323
    const-string v0, "BiometricPromptCompat"

    .line 2324
    .line 2325
    if-nez v3, :cond_3a

    .line 2326
    .line 2327
    const-string v1, "Unable to start authentication. Client fragment manager was null."

    .line 2328
    .line 2329
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2330
    .line 2331
    .line 2332
    goto/16 :goto_20

    .line 2333
    .line 2334
    :cond_3a
    invoke-virtual {v3}, Landroidx/fragment/app/e;->a0()Z

    .line 2335
    .line 2336
    .line 2337
    move-result v1

    .line 2338
    if-eqz v1, :cond_3b

    .line 2339
    .line 2340
    const-string v1, "Unable to start authentication. Called after onSaveInstanceState()."

    .line 2341
    .line 2342
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2343
    .line 2344
    .line 2345
    goto/16 :goto_20

    .line 2346
    .line 2347
    :cond_3b
    const-string v0, "androidx.biometric.internal.BiometricFragment"

    .line 2348
    .line 2349
    invoke-virtual {v3, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v1

    .line 2353
    check-cast v1, La/l58;

    .line 2354
    .line 2355
    if-nez v1, :cond_3c

    .line 2356
    .line 2357
    new-instance v1, La/l58;

    .line 2358
    .line 2359
    invoke-direct {v1}, La/l58;-><init>()V

    .line 2360
    .line 2361
    .line 2362
    new-instance v4, Landroid/os/Bundle;

    .line 2363
    .line 2364
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 2365
    .line 2366
    .line 2367
    const-string v5, "host_activity"

    .line 2368
    .line 2369
    invoke-virtual {v4, v5, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 2370
    .line 2371
    .line 2372
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 2373
    .line 2374
    .line 2375
    new-instance v4, La/zb5;

    .line 2376
    .line 2377
    invoke-direct {v4, v3}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 2378
    .line 2379
    .line 2380
    invoke-virtual {v4, v7, v1, v0, v6}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 2381
    .line 2382
    .line 2383
    invoke-virtual {v4, v6, v6}, La/zb5;->g(ZZ)I

    .line 2384
    .line 2385
    .line 2386
    invoke-virtual {v3}, Landroidx/fragment/app/e;->F()V

    .line 2387
    .line 2388
    .line 2389
    :cond_3c
    iget-object v0, v1, La/l58;->H1:La/t58;

    .line 2390
    .line 2391
    iput-object v2, v0, La/t58;->d:La/yzn0;

    .line 2392
    .line 2393
    invoke-virtual {v0}, La/t58;->y()V

    .line 2394
    .line 2395
    .line 2396
    iget-object v0, v1, La/l58;->H1:La/t58;

    .line 2397
    .line 2398
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v2

    .line 2402
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v2

    .line 2406
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2407
    .line 2408
    const/16 v4, 0x1d

    .line 2409
    .line 2410
    if-lt v3, v4, :cond_3d

    .line 2411
    .line 2412
    invoke-static {v2}, La/m58;->b(Landroid/content/Context;)Landroid/hardware/biometrics/BiometricManager;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v2

    .line 2416
    goto :goto_17

    .line 2417
    :cond_3d
    move-object v2, v8

    .line 2418
    :goto_17
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2419
    .line 2420
    const/16 v5, 0x23

    .line 2421
    .line 2422
    if-lt v3, v5, :cond_3f

    .line 2423
    .line 2424
    if-nez v2, :cond_3e

    .line 2425
    .line 2426
    goto :goto_18

    .line 2427
    :cond_3e
    const/high16 v3, 0x10000

    .line 2428
    .line 2429
    :try_start_0
    invoke-static {v2, v3}, La/n58;->a(Landroid/hardware/biometrics/BiometricManager;I)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2430
    .line 2431
    .line 2432
    :catch_0
    :cond_3f
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2433
    .line 2434
    .line 2435
    invoke-virtual {v0}, La/t58;->y()V

    .line 2436
    .line 2437
    .line 2438
    iget-object v0, v1, La/l58;->H1:La/t58;

    .line 2439
    .line 2440
    iput-object v8, v0, La/t58;->e:La/q58;

    .line 2441
    .line 2442
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2443
    .line 2444
    const/16 v3, 0x1e

    .line 2445
    .line 2446
    if-ge v2, v3, :cond_41

    .line 2447
    .line 2448
    iget-object v2, v0, La/t58;->d:La/yzn0;

    .line 2449
    .line 2450
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2451
    .line 2452
    .line 2453
    move v2, v6

    .line 2454
    :goto_19
    const/16 v3, 0xf

    .line 2455
    .line 2456
    if-gt v2, v3, :cond_41

    .line 2457
    .line 2458
    if-nez v2, :cond_40

    .line 2459
    .line 2460
    invoke-static {}, La/wwb;->B()La/q58;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v2

    .line 2464
    iput-object v2, v0, La/t58;->e:La/q58;

    .line 2465
    .line 2466
    goto :goto_1a

    .line 2467
    :cond_40
    shl-int/lit8 v2, v2, 0x1

    .line 2468
    .line 2469
    or-int/2addr v2, v6

    .line 2470
    goto :goto_19

    .line 2471
    :cond_41
    :goto_1a
    invoke-virtual {v0}, La/t58;->y()V

    .line 2472
    .line 2473
    .line 2474
    invoke-virtual {v1}, La/l58;->A0()Z

    .line 2475
    .line 2476
    .line 2477
    move-result v0

    .line 2478
    iget-object v2, v1, La/l58;->H1:La/t58;

    .line 2479
    .line 2480
    if-eqz v0, :cond_42

    .line 2481
    .line 2482
    const v0, 0x7f1304d9

    .line 2483
    .line 2484
    .line 2485
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v0

    .line 2489
    iput-object v0, v2, La/t58;->j:Ljava/lang/String;

    .line 2490
    .line 2491
    goto :goto_1b

    .line 2492
    :cond_42
    iput-object v8, v2, La/t58;->j:Ljava/lang/String;

    .line 2493
    .line 2494
    :goto_1b
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v0

    .line 2498
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2499
    .line 2500
    if-ne v2, v4, :cond_46

    .line 2501
    .line 2502
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 2503
    .line 2504
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v5

    .line 2508
    if-eqz v5, :cond_43

    .line 2509
    .line 2510
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v8

    .line 2514
    if-eqz v8, :cond_43

    .line 2515
    .line 2516
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2517
    .line 2518
    .line 2519
    move-result-object v5

    .line 2520
    const-string v8, "android.hardware.fingerprint"

    .line 2521
    .line 2522
    invoke-virtual {v5, v8}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 2523
    .line 2524
    .line 2525
    move-result v5

    .line 2526
    if-eqz v5, :cond_43

    .line 2527
    .line 2528
    move v5, v6

    .line 2529
    goto :goto_1c

    .line 2530
    :cond_43
    move v5, v7

    .line 2531
    :goto_1c
    const-string v8, "has_fingerprint"

    .line 2532
    .line 2533
    invoke-virtual {v3, v8, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2534
    .line 2535
    .line 2536
    move-result v3

    .line 2537
    if-nez v3, :cond_46

    .line 2538
    .line 2539
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 2540
    .line 2541
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v5

    .line 2545
    if-lt v2, v4, :cond_44

    .line 2546
    .line 2547
    if-eqz v5, :cond_44

    .line 2548
    .line 2549
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v8

    .line 2553
    if-eqz v8, :cond_44

    .line 2554
    .line 2555
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v5

    .line 2559
    const-string v8, "android.hardware.biometrics.face"

    .line 2560
    .line 2561
    invoke-virtual {v5, v8}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 2562
    .line 2563
    .line 2564
    move-result v5

    .line 2565
    if-eqz v5, :cond_44

    .line 2566
    .line 2567
    move v5, v6

    .line 2568
    goto :goto_1d

    .line 2569
    :cond_44
    move v5, v7

    .line 2570
    :goto_1d
    const-string v8, "has_face"

    .line 2571
    .line 2572
    invoke-virtual {v3, v8, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2573
    .line 2574
    .line 2575
    move-result v3

    .line 2576
    if-nez v3, :cond_46

    .line 2577
    .line 2578
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 2579
    .line 2580
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v5

    .line 2584
    if-lt v2, v4, :cond_45

    .line 2585
    .line 2586
    if-eqz v5, :cond_45

    .line 2587
    .line 2588
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v2

    .line 2592
    if-eqz v2, :cond_45

    .line 2593
    .line 2594
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v2

    .line 2598
    const-string v4, "android.hardware.biometrics.iris"

    .line 2599
    .line 2600
    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 2601
    .line 2602
    .line 2603
    move-result v2

    .line 2604
    if-eqz v2, :cond_45

    .line 2605
    .line 2606
    move v2, v6

    .line 2607
    goto :goto_1e

    .line 2608
    :cond_45
    move v2, v7

    .line 2609
    :goto_1e
    const-string v4, "has_iris"

    .line 2610
    .line 2611
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2612
    .line 2613
    .line 2614
    move-result v2

    .line 2615
    if-nez v2, :cond_46

    .line 2616
    .line 2617
    goto :goto_1f

    .line 2618
    :cond_46
    invoke-virtual {v1}, La/l58;->A0()Z

    .line 2619
    .line 2620
    .line 2621
    move-result v2

    .line 2622
    if-eqz v2, :cond_47

    .line 2623
    .line 2624
    new-instance v2, La/nhf0;

    .line 2625
    .line 2626
    new-instance v3, La/o58;

    .line 2627
    .line 2628
    invoke-direct {v3, v0, v7}, La/o58;-><init>(Landroid/content/Context;B)V

    .line 2629
    .line 2630
    .line 2631
    invoke-direct {v2, v3}, La/nhf0;-><init>(La/o58;)V

    .line 2632
    .line 2633
    .line 2634
    const/16 v0, 0xff

    .line 2635
    .line 2636
    invoke-virtual {v2, v0}, La/nhf0;->d(I)I

    .line 2637
    .line 2638
    .line 2639
    move-result v0

    .line 2640
    if-eqz v0, :cond_47

    .line 2641
    .line 2642
    :goto_1f
    iget-object v0, v1, La/l58;->H1:La/t58;

    .line 2643
    .line 2644
    iput-boolean v6, v0, La/t58;->m:Z

    .line 2645
    .line 2646
    invoke-virtual {v1}, La/l58;->C0()V

    .line 2647
    .line 2648
    .line 2649
    goto :goto_20

    .line 2650
    :cond_47
    iget-object v0, v1, La/l58;->H1:La/t58;

    .line 2651
    .line 2652
    iget-boolean v0, v0, La/t58;->o:Z

    .line 2653
    .line 2654
    if-eqz v0, :cond_48

    .line 2655
    .line 2656
    iget-object v0, v1, La/l58;->I1:Landroid/os/Handler;

    .line 2657
    .line 2658
    new-instance v2, La/k58;

    .line 2659
    .line 2660
    invoke-direct {v2, v1}, La/k58;-><init>(La/l58;)V

    .line 2661
    .line 2662
    .line 2663
    const-wide/16 v3, 0x258

    .line 2664
    .line 2665
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2666
    .line 2667
    .line 2668
    goto :goto_20

    .line 2669
    :cond_48
    invoke-virtual {v1}, La/l58;->H0()V

    .line 2670
    .line 2671
    .line 2672
    :goto_20
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2673
    .line 2674
    goto :goto_21

    .line 2675
    :cond_49
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2676
    .line 2677
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2678
    .line 2679
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2680
    .line 2681
    .line 2682
    move-result-object v2

    .line 2683
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2684
    .line 2685
    const-string v4, "Authenticator combination is unsupported on API "

    .line 2686
    .line 2687
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2688
    .line 2689
    .line 2690
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2691
    .line 2692
    .line 2693
    const-string v1, ": "

    .line 2694
    .line 2695
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2696
    .line 2697
    .line 2698
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2699
    .line 2700
    .line 2701
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2702
    .line 2703
    .line 2704
    move-result-object v1

    .line 2705
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2706
    .line 2707
    .line 2708
    throw v0

    .line 2709
    :cond_4a
    const-string v0, "Title must be set and non-empty."

    .line 2710
    .line 2711
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 2712
    .line 2713
    .line 2714
    goto :goto_21

    .line 2715
    :cond_4b
    invoke-static {v12}, La/jf4;->o(Ljava/lang/String;)V

    .line 2716
    .line 2717
    .line 2718
    goto :goto_21

    .line 2719
    :cond_4c
    invoke-static {v12}, La/jf4;->o(Ljava/lang/String;)V

    .line 2720
    .line 2721
    .line 2722
    goto :goto_21

    .line 2723
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 2724
    .line 2725
    .line 2726
    :goto_21
    return-object v8

    .line 2727
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2728
    .line 2729
    check-cast v1, La/x58;

    .line 2730
    .line 2731
    move-object/from16 v2, p2

    .line 2732
    .line 2733
    check-cast v2, La/yje;

    .line 2734
    .line 2735
    check-cast v0, La/e68;

    .line 2736
    .line 2737
    sget-object v2, La/e68;->N1:La/cl5;

    .line 2738
    .line 2739
    invoke-virtual {v0}, La/e68;->G0()La/qyq;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v0

    .line 2743
    iget-object v0, v0, La/qyq;->b:Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 2744
    .line 2745
    iget-boolean v1, v1, La/x58;->a:Z

    .line 2746
    .line 2747
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;->a(Z)V

    .line 2748
    .line 2749
    .line 2750
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2751
    .line 2752
    return-object v0

    .line 2753
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2754
    .line 2755
    check-cast v1, Ljava/lang/Throwable;

    .line 2756
    .line 2757
    move-object/from16 v2, p2

    .line 2758
    .line 2759
    check-cast v2, La/yje;

    .line 2760
    .line 2761
    check-cast v0, La/d48;

    .line 2762
    .line 2763
    invoke-virtual {v0, v1}, La/d48;->z(Ljava/lang/Throwable;)V

    .line 2764
    .line 2765
    .line 2766
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2767
    .line 2768
    return-object v0

    .line 2769
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
