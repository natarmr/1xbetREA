.class public final synthetic La/mc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/vq;Landroidx/fragment/app/Fragment;La/ms2;)V
    .locals 0

    .line 1
    const/4 p2, 0x3

    iput-byte p2, p0, La/mc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mc;->b:Ljava/lang/Object;

    iput-object p3, p0, La/mc;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/mc;->a:B

    iput-object p1, p0, La/mc;->b:Ljava/lang/Object;

    iput-object p2, p0, La/mc;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mc;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "SELECT_DATE_TIME_REQUEST_KEY"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/mc;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/mc;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, La/l7m0;

    .line 18
    .line 19
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    check-cast v6, La/ra4;

    .line 42
    .line 43
    iget v1, v6, La/ra4;->b:I

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_1
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 56
    .line 57
    check-cast v6, Ljava/lang/String;

    .line 58
    .line 59
    sget v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 60
    .line 61
    const-string v1, "clipboard"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    instance-of v2, v1, Landroid/content/ClipboardManager;

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    move-object v5, v1

    .line 72
    check-cast v5, Landroid/content/ClipboardManager;

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const v1, 0x7f131085

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0, v6}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    invoke-virtual {v5, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_2
    check-cast v0, La/ij3;

    .line 98
    .line 99
    check-cast v6, La/g8d;

    .line 100
    .line 101
    invoke-virtual {v0, v6, v5}, La/ij3;->z(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_3
    check-cast v0, La/htb;

    .line 108
    .line 109
    invoke-interface {v0, v6}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_4
    check-cast v0, La/mie0;

    .line 116
    .line 117
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 118
    .line 119
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_5
    check-cast v0, La/pah0;

    .line 129
    .line 130
    check-cast v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 131
    .line 132
    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->o1:Landroidx/collection/MutableIntList;

    .line 133
    .line 134
    iget-object v1, v0, La/pah0;->e:La/t9h0;

    .line 135
    .line 136
    iget-object v2, v0, La/pah0;->f:La/t9h0;

    .line 137
    .line 138
    iget-object v3, v0, La/pah0;->c:Ljava/lang/Float;

    .line 139
    .line 140
    iget-object v4, v0, La/pah0;->d:Ljava/lang/Float;

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    if-eqz v3, :cond_3

    .line 146
    .line 147
    iget-object v7, v1, La/t9h0;->a:Lkotlin/jvm/functions/Function0;

    .line 148
    .line 149
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    check-cast v7, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    sub-float/2addr v7, v3

    .line 164
    goto :goto_0

    .line 165
    :cond_3
    move v7, v5

    .line 166
    :goto_0
    if-eqz v2, :cond_4

    .line 167
    .line 168
    if-eqz v4, :cond_4

    .line 169
    .line 170
    iget-object v3, v2, La/t9h0;->a:Lkotlin/jvm/functions/Function0;

    .line 171
    .line 172
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    sub-float/2addr v3, v4

    .line 187
    goto :goto_1

    .line 188
    :cond_4
    move v3, v5

    .line 189
    :goto_1
    cmpg-float v4, v7, v5

    .line 190
    .line 191
    if-nez v4, :cond_5

    .line 192
    .line 193
    cmpg-float v3, v3, v5

    .line 194
    .line 195
    if-nez v3, :cond_5

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    iget v3, v0, La/pah0;->a:I

    .line 199
    .line 200
    invoke-virtual {v6, v3}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->A(I)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->s()La/gkx;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    iget v5, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->k:I

    .line 209
    .line 210
    invoke-virtual {v4, v5}, La/gkx;->b(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, La/vai0;

    .line 215
    .line 216
    if-eqz v4, :cond_6

    .line 217
    .line 218
    :try_start_0
    iget-object v5, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->m:La/k7;

    .line 219
    .line 220
    if-eqz v5, :cond_6

    .line 221
    .line 222
    invoke-virtual {v6, v4}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->k(La/vai0;)Landroid/graphics/Rect;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v5, v4}, La/k7;->i(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    .line 228
    .line 229
    :catch_0
    :cond_6
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->s()La/gkx;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    iget v5, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->l:I

    .line 234
    .line 235
    invoke-virtual {v4, v5}, La/gkx;->b(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, La/vai0;

    .line 240
    .line 241
    if-eqz v4, :cond_7

    .line 242
    .line 243
    :try_start_1
    iget-object v5, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->n:La/k7;

    .line 244
    .line 245
    if-eqz v5, :cond_7

    .line 246
    .line 247
    invoke-virtual {v6, v4}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->k(La/vai0;)Landroid/graphics/Rect;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-virtual {v5, v4}, La/k7;->i(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 252
    .line 253
    .line 254
    :catch_1
    :cond_7
    iget-object v4, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 255
    .line 256
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->s()La/gkx;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-virtual {v4, v3}, La/gkx;->b(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    check-cast v4, La/vai0;

    .line 268
    .line 269
    if-eqz v4, :cond_a

    .line 270
    .line 271
    iget-object v4, v4, La/vai0;->a:La/tai0;

    .line 272
    .line 273
    if-eqz v4, :cond_a

    .line 274
    .line 275
    iget-object v4, v4, La/tai0;->c:La/e7z;

    .line 276
    .line 277
    if-eqz v4, :cond_a

    .line 278
    .line 279
    if-eqz v1, :cond_8

    .line 280
    .line 281
    iget-object v5, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->p:La/ey40;

    .line 282
    .line 283
    invoke-virtual {v5, v3, v1}, La/ey40;->j(ILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_8
    if-eqz v2, :cond_9

    .line 287
    .line 288
    iget-object v5, v6, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->q:La/ey40;

    .line 289
    .line 290
    invoke-virtual {v5, v3, v2}, La/ey40;->j(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_9
    invoke-virtual {v6, v4}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->w(La/e7z;)V

    .line 294
    .line 295
    .line 296
    :cond_a
    :goto_2
    if-eqz v1, :cond_b

    .line 297
    .line 298
    iget-object v1, v1, La/t9h0;->a:Lkotlin/jvm/functions/Function0;

    .line 299
    .line 300
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    check-cast v1, Ljava/lang/Float;

    .line 305
    .line 306
    iput-object v1, v0, La/pah0;->c:Ljava/lang/Float;

    .line 307
    .line 308
    :cond_b
    if-eqz v2, :cond_c

    .line 309
    .line 310
    iget-object v1, v2, La/t9h0;->a:Lkotlin/jvm/functions/Function0;

    .line 311
    .line 312
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Ljava/lang/Float;

    .line 317
    .line 318
    iput-object v1, v0, La/pah0;->d:Ljava/lang/Float;

    .line 319
    .line 320
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_6
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 324
    .line 325
    check-cast v6, Landroid/view/KeyEvent;

    .line 326
    .line 327
    invoke-static {v0, v6}, Landroidx/compose/ui/platform/AndroidComposeView;->g(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    return-object v0

    .line 336
    :pswitch_7
    move-object v1, v0

    .line 337
    check-cast v1, La/g2v;

    .line 338
    .line 339
    move-object v0, v6

    .line 340
    check-cast v0, La/svu;

    .line 341
    .line 342
    sget-object v15, La/iun;->a:La/iun;

    .line 343
    .line 344
    sget-object v2, La/pb10;->g:La/pb10;

    .line 345
    .line 346
    const-wide/16 v12, 0x0

    .line 347
    .line 348
    const/16 v14, 0x25e

    .line 349
    .line 350
    const/4 v3, 0x0

    .line 351
    const/4 v4, 0x0

    .line 352
    const/4 v5, 0x0

    .line 353
    const/4 v6, 0x0

    .line 354
    const v7, 0x7f130677

    .line 355
    .line 356
    .line 357
    const/4 v8, 0x0

    .line 358
    const v9, 0x7f131690

    .line 359
    .line 360
    .line 361
    const-wide/16 v10, 0x2710

    .line 362
    .line 363
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 364
    .line 365
    .line 366
    move-result-object v16

    .line 367
    sget-object v3, La/pdm;->b:La/pdm;

    .line 368
    .line 369
    const/16 v14, 0x3c4

    .line 370
    .line 371
    const v5, 0x7f080822

    .line 372
    .line 373
    .line 374
    const v6, 0x7f13179d

    .line 375
    .line 376
    .line 377
    const v7, 0x7f13179c

    .line 378
    .line 379
    .line 380
    const/4 v9, 0x0

    .line 381
    const-wide/16 v10, 0x0

    .line 382
    .line 383
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 384
    .line 385
    .line 386
    move-result-object v17

    .line 387
    const/16 v14, 0x3d4

    .line 388
    .line 389
    const/4 v6, 0x0

    .line 390
    const v7, 0x7f130677

    .line 391
    .line 392
    .line 393
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    invoke-virtual {v0}, La/svu;->l()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    new-instance v2, La/xm2;

    .line 402
    .line 403
    const/16 v18, 0x0

    .line 404
    .line 405
    const/16 v19, 0x0

    .line 406
    .line 407
    const/4 v3, 0x1

    .line 408
    const/4 v4, 0x0

    .line 409
    const/4 v5, 0x0

    .line 410
    const/4 v12, 0x0

    .line 411
    const/4 v13, 0x1

    .line 412
    const/4 v14, 0x1

    .line 413
    move-object/from16 v9, v16

    .line 414
    .line 415
    const/16 v16, 0x0

    .line 416
    .line 417
    move-object/from16 v10, v17

    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    move-object v7, v15

    .line 422
    move-object v8, v15

    .line 423
    move-object v6, v15

    .line 424
    move v15, v0

    .line 425
    invoke-direct/range {v2 .. v19}, La/xm2;-><init>(ZZZLjava/util/List;Ljava/util/List;Ljava/util/List;La/mdm;La/mdm;La/mdm;La/ym2;ZZZZZZZ)V

    .line 426
    .line 427
    .line 428
    return-object v2

    .line 429
    :pswitch_8
    check-cast v0, La/ef2;

    .line 430
    .line 431
    check-cast v6, Ljava/util/Date;

    .line 432
    .line 433
    sget-object v1, La/ef2;->V1:La/hfk0;

    .line 434
    .line 435
    sget-object v1, La/x1i0;->n2:La/zie0;

    .line 436
    .line 437
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    new-instance v2, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 445
    .line 446
    invoke-direct {v2, v6, v4}, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;-><init>(Ljava/util/Date;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-static {v0, v2}, La/zie0;->g(Landroidx/fragment/app/e;Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_9
    check-cast v0, La/ia2;

    .line 459
    .line 460
    check-cast v6, La/va2;

    .line 461
    .line 462
    sget-object v1, La/ia2;->Q1:La/rek0;

    .line 463
    .line 464
    sget-object v1, La/x1i0;->n2:La/zie0;

    .line 465
    .line 466
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    new-instance v2, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 474
    .line 475
    check-cast v6, La/ua2;

    .line 476
    .line 477
    iget-object v3, v6, La/ua2;->a:Ljava/util/Date;

    .line 478
    .line 479
    invoke-direct {v2, v3, v4}, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;-><init>(Ljava/util/Date;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-static {v0, v2}, La/zie0;->g(Landroidx/fragment/app/e;Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;)V

    .line 486
    .line 487
    .line 488
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object v0

    .line 491
    :pswitch_a
    check-cast v0, La/w62;

    .line 492
    .line 493
    check-cast v6, La/b72;

    .line 494
    .line 495
    sget-object v1, La/w62;->Q1:La/pek0;

    .line 496
    .line 497
    sget-object v1, La/x1i0;->n2:La/zie0;

    .line 498
    .line 499
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    new-instance v2, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 507
    .line 508
    check-cast v6, La/z62;

    .line 509
    .line 510
    iget-object v3, v6, La/z62;->a:Ljava/util/Date;

    .line 511
    .line 512
    invoke-direct {v2, v3, v4}, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;-><init>(Ljava/util/Date;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    invoke-static {v0, v2}, La/zie0;->g(Landroidx/fragment/app/e;Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;)V

    .line 519
    .line 520
    .line 521
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    return-object v0

    .line 524
    :pswitch_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 525
    .line 526
    check-cast v6, La/r02;

    .line 527
    .line 528
    iget-object v1, v6, La/r02;->a:Ljava/lang/String;

    .line 529
    .line 530
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_c
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 537
    .line 538
    check-cast v6, La/tr1;

    .line 539
    .line 540
    iget-wide v1, v6, La/tr1;->a:J

    .line 541
    .line 542
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    iget-object v2, v6, La/tr1;->b:Ljava/lang/String;

    .line 547
    .line 548
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    return-object v0

    .line 554
    :pswitch_d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 555
    .line 556
    check-cast v6, La/gn1;

    .line 557
    .line 558
    new-instance v1, La/ym1;

    .line 559
    .line 560
    iget-object v2, v6, La/gn1;->e:La/j8b;

    .line 561
    .line 562
    invoke-direct {v1, v2}, La/ym1;-><init>(La/j8b;)V

    .line 563
    .line 564
    .line 565
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_e
    check-cast v0, La/mh1;

    .line 572
    .line 573
    check-cast v6, La/d7v;

    .line 574
    .line 575
    iget-object v1, v0, La/mh1;->D:La/erc;

    .line 576
    .line 577
    invoke-virtual {v1, v3}, La/erc;->a(Z)V

    .line 578
    .line 579
    .line 580
    iget-object v1, v0, La/mh1;->C:La/s91;

    .line 581
    .line 582
    new-instance v7, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 583
    .line 584
    new-instance v12, La/dm1;

    .line 585
    .line 586
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    check-cast v4, La/pf1;

    .line 591
    .line 592
    iget v4, v4, La/pf1;->p:I

    .line 593
    .line 594
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    check-cast v8, La/pf1;

    .line 599
    .line 600
    iget v8, v8, La/pf1;->q:I

    .line 601
    .line 602
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 603
    .line 604
    .line 605
    move-result v6

    .line 606
    if-eqz v6, :cond_f

    .line 607
    .line 608
    if-eq v6, v2, :cond_e

    .line 609
    .line 610
    const/4 v3, 0x2

    .line 611
    if-ne v6, v3, :cond_d

    .line 612
    .line 613
    goto :goto_3

    .line 614
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 615
    .line 616
    .line 617
    goto :goto_4

    .line 618
    :cond_e
    move v3, v2

    .line 619
    :cond_f
    :goto_3
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    check-cast v0, La/pf1;

    .line 624
    .line 625
    iget-boolean v0, v0, La/pf1;->r:Z

    .line 626
    .line 627
    xor-int/2addr v0, v2

    .line 628
    invoke-direct {v12, v4, v8, v3, v0}, La/dm1;-><init>(IIIZ)V

    .line 629
    .line 630
    .line 631
    const/16 v19, 0x0

    .line 632
    .line 633
    const/16 v20, 0x1f7

    .line 634
    .line 635
    const/4 v8, 0x0

    .line 636
    const/4 v9, 0x0

    .line 637
    const-wide/16 v10, 0x0

    .line 638
    .line 639
    const/4 v13, 0x0

    .line 640
    const-wide/16 v14, 0x0

    .line 641
    .line 642
    const-wide/16 v16, 0x0

    .line 643
    .line 644
    const/16 v18, 0x0

    .line 645
    .line 646
    invoke-direct/range {v7 .. v20}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1, v7}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 650
    .line 651
    .line 652
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 653
    .line 654
    :goto_4
    return-object v5

    .line 655
    :pswitch_f
    check-cast v0, Ljava/lang/String;

    .line 656
    .line 657
    check-cast v6, La/cb1;

    .line 658
    .line 659
    sget-object v1, La/cb1;->e2:La/rek0;

    .line 660
    .line 661
    sget-object v1, La/uu0;->o2:La/gfk0;

    .line 662
    .line 663
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 664
    .line 665
    .line 666
    move-result-object v4

    .line 667
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    const-string v1, "AggregatorSelectGameModeDialog"

    .line 677
    .line 678
    invoke-virtual {v4, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    if-nez v5, :cond_10

    .line 683
    .line 684
    new-instance v5, La/uu0;

    .line 685
    .line 686
    invoke-direct {v5}, La/uu0;-><init>()V

    .line 687
    .line 688
    .line 689
    sget-object v6, La/uu0;->p2:[La/iiy;

    .line 690
    .line 691
    aget-object v3, v6, v3

    .line 692
    .line 693
    iget-object v7, v5, La/uu0;->k2:La/phf0;

    .line 694
    .line 695
    invoke-virtual {v7, v5, v3, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    iget-object v0, v5, La/uu0;->l2:La/phf0;

    .line 699
    .line 700
    aget-object v2, v6, v2

    .line 701
    .line 702
    const-string v3, "SELECT_GAME_MODE_REQUEST_KEY"

    .line 703
    .line 704
    invoke-virtual {v0, v5, v2, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v5, v4, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 711
    .line 712
    return-object v0

    .line 713
    :pswitch_10
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 714
    .line 715
    check-cast v6, La/ayq0;

    .line 716
    .line 717
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 721
    .line 722
    return-object v0

    .line 723
    :pswitch_11
    check-cast v0, La/ctf0;

    .line 724
    .line 725
    check-cast v6, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

    .line 726
    .line 727
    new-instance v7, La/b41;

    .line 728
    .line 729
    new-array v1, v3, [Ljava/lang/Object;

    .line 730
    .line 731
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 732
    .line 733
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    const v4, 0x7f1300d2

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    iget-object v1, v6, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;->a:Ljava/lang/String;

    .line 745
    .line 746
    const-string v2, "\u20ac "

    .line 747
    .line 748
    invoke-static {v2, v1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    new-array v1, v3, [Ljava/lang/Object;

    .line 753
    .line 754
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 755
    .line 756
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    const v2, 0x7f1300d1

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v10

    .line 767
    new-array v1, v3, [Ljava/lang/Object;

    .line 768
    .line 769
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    const v2, 0x7f13148a

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v11

    .line 780
    new-array v1, v3, [Ljava/lang/Object;

    .line 781
    .line 782
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    const v2, 0x7f130abf

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v12

    .line 793
    new-instance v13, La/n0x;

    .line 794
    .line 795
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 796
    .line 797
    const-string v0, "/static/img/android/casino/jackpot/jackpot_bottom.webp"

    .line 798
    .line 799
    invoke-static {v0}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-direct {v13, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    invoke-direct/range {v7 .. v13}, La/b41;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/n0x;)V

    .line 807
    .line 808
    .line 809
    return-object v7

    .line 810
    :pswitch_12
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 811
    .line 812
    check-cast v6, La/ly0;

    .line 813
    .line 814
    new-instance v1, La/ey0;

    .line 815
    .line 816
    iget-object v2, v6, La/ly0;->d:La/j8b;

    .line 817
    .line 818
    invoke-direct {v1, v2}, La/ey0;-><init>(La/j8b;)V

    .line 819
    .line 820
    .line 821
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 825
    .line 826
    return-object v0

    .line 827
    :pswitch_13
    check-cast v0, Ljava/lang/String;

    .line 828
    .line 829
    check-cast v6, La/iqt;

    .line 830
    .line 831
    new-instance v1, La/wu0;

    .line 832
    .line 833
    iget-object v2, v6, La/iqt;->a:La/gst0;

    .line 834
    .line 835
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    sget-object v3, La/av0;->d:La/c0o;

    .line 840
    .line 841
    invoke-direct {v1, v0, v3, v2}, La/wu0;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 842
    .line 843
    .line 844
    return-object v1

    .line 845
    :pswitch_14
    check-cast v0, La/uu0;

    .line 846
    .line 847
    check-cast v6, La/pu0;

    .line 848
    .line 849
    sget-object v1, La/uu0;->o2:La/gfk0;

    .line 850
    .line 851
    iget-object v0, v0, La/uu0;->n2:La/a8z;

    .line 852
    .line 853
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    check-cast v0, La/k3t0;

    .line 858
    .line 859
    new-instance v1, La/ru0;

    .line 860
    .line 861
    iget-object v2, v6, La/pu0;->b:La/av0;

    .line 862
    .line 863
    invoke-direct {v1, v2}, La/ru0;-><init>(La/av0;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 870
    .line 871
    return-object v0

    .line 872
    :pswitch_15
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 873
    .line 874
    check-cast v6, La/xl0;

    .line 875
    .line 876
    new-instance v1, La/el0;

    .line 877
    .line 878
    iget-object v2, v6, La/xl0;->c:La/j8b;

    .line 879
    .line 880
    invoke-direct {v1, v2}, La/el0;-><init>(La/j8b;)V

    .line 881
    .line 882
    .line 883
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 887
    .line 888
    return-object v0

    .line 889
    :pswitch_16
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 890
    .line 891
    check-cast v6, La/fc0;

    .line 892
    .line 893
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 897
    .line 898
    return-object v0

    .line 899
    :pswitch_17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 900
    .line 901
    check-cast v6, La/rx;

    .line 902
    .line 903
    iget-object v1, v6, La/rx;->d:La/ox;

    .line 904
    .line 905
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :pswitch_18
    check-cast v0, La/es;

    .line 912
    .line 913
    move-object v10, v6

    .line 914
    check-cast v10, La/tnp0;

    .line 915
    .line 916
    iget-object v0, v0, La/es;->a:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast v0, La/m0o0;

    .line 919
    .line 920
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    new-instance v7, La/xcp;

    .line 924
    .line 925
    invoke-interface {v10}, La/tnp0;->a()J

    .line 926
    .line 927
    .line 928
    move-result-wide v8

    .line 929
    sget-object v15, La/iun;->a:La/iun;

    .line 930
    .line 931
    const/16 v17, 0x0

    .line 932
    .line 933
    const-string v18, ""

    .line 934
    .line 935
    const-string v11, ""

    .line 936
    .line 937
    const-string v12, ""

    .line 938
    .line 939
    const-wide/16 v13, 0x0

    .line 940
    .line 941
    const/16 v16, 0x0

    .line 942
    .line 943
    invoke-direct/range {v7 .. v18}, La/xcp;-><init>(JLa/tnp0;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;IZLjava/lang/String;)V

    .line 944
    .line 945
    .line 946
    iget-object v0, v0, La/m0o0;->b:La/abp;

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    iget-object v1, v0, La/abp;->c:La/p7m0;

    .line 952
    .line 953
    :cond_11
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    move-object v2, v0

    .line 958
    check-cast v2, La/kap;

    .line 959
    .line 960
    new-instance v3, La/iap;

    .line 961
    .line 962
    invoke-static {v2}, La/abp;->e(La/kap;)Ljava/util/List;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    invoke-direct {v3, v2}, La/iap;-><init>(Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v0

    .line 977
    if-eqz v0, :cond_11

    .line 978
    .line 979
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 980
    .line 981
    return-object v0

    .line 982
    :pswitch_19
    check-cast v0, La/vq;

    .line 983
    .line 984
    check-cast v6, La/ms2;

    .line 985
    .line 986
    sget-object v1, La/aao;->c:La/aao;

    .line 987
    .line 988
    invoke-virtual {v0, v6, v1}, La/vq;->g(La/ms2;La/aao;)V

    .line 989
    .line 990
    .line 991
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    return-object v0

    .line 994
    :pswitch_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 995
    .line 996
    check-cast v6, La/hm;

    .line 997
    .line 998
    check-cast v6, La/fm;

    .line 999
    .line 1000
    iget-object v1, v6, La/fm;->b:La/zrm;

    .line 1001
    .line 1002
    iget-object v1, v1, La/zrm;->a:La/f2l0;

    .line 1003
    .line 1004
    invoke-interface {v1}, La/f2l0;->a()Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1012
    .line 1013
    return-object v0

    .line 1014
    :pswitch_1b
    check-cast v0, La/v6d0;

    .line 1015
    .line 1016
    check-cast v6, La/rl;

    .line 1017
    .line 1018
    invoke-virtual {v0, v6}, La/v6d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1022
    .line 1023
    return-object v0

    .line 1024
    :pswitch_1c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1025
    .line 1026
    check-cast v6, La/gc;

    .line 1027
    .line 1028
    new-instance v1, La/jc;

    .line 1029
    .line 1030
    iget-object v2, v6, La/gc;->a:La/hc;

    .line 1031
    .line 1032
    invoke-direct {v1, v2}, La/jc;-><init>(La/hc;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1039
    .line 1040
    return-object v0

    .line 1041
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
