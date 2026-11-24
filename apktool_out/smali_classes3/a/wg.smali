.class public final synthetic La/wg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cp;La/rer;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wg;->a:B

    iput-object p1, p0, La/wg;->b:Ljava/lang/Object;

    iput-object p2, p0, La/wg;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/wg;->a:B

    iput-object p1, p0, La/wg;->c:Ljava/lang/Object;

    iput-object p2, p0, La/wg;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    iget-byte v0, p0, La/wg;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/wg;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/wg;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/zr50;

    .line 13
    .line 14
    check-cast v3, La/ct5;

    .line 15
    .line 16
    iget-object p1, p0, La/zr50;->w:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, La/jt50;

    .line 19
    .line 20
    iget-object p0, p0, La/zr50;->y:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v3, p0}, La/jt50;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, La/p730;

    .line 29
    .line 30
    check-cast v3, La/cp;

    .line 31
    .line 32
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/dx20;

    .line 37
    .line 38
    iget-boolean p1, p1, La/dx20;->d:Z

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/dx20;

    .line 49
    .line 50
    iget-wide v0, v0, La/dx20;->b:J

    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, p1, v0}, La/p730;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_1
    check-cast p0, Landroid/view/View$OnClickListener;

    .line 61
    .line 62
    check-cast v3, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 63
    .line 64
    sget-object p1, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->c:[I

    .line 65
    .line 66
    invoke-interface {p0, v3}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    check-cast p0, La/x6w;

    .line 71
    .line 72
    check-cast v3, La/jk3;

    .line 73
    .line 74
    sget-object p1, La/x6w;->k2:La/art;

    .line 75
    .line 76
    invoke-virtual {p0}, La/x6w;->U0()La/wnm0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object p0, v3, La/jk3;->c:Landroid/view/View;

    .line 81
    .line 82
    check-cast p0, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 83
    .line 84
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->isChecked()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v4, p1, La/wnm0;->h:Ljava/util/ArrayList;

    .line 89
    .line 90
    iget-object v5, p1, La/wnm0;->j:La/p7m0;

    .line 91
    .line 92
    :cond_0
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    move-object v3, p0

    .line 97
    check-cast v3, La/o9h0;

    .line 98
    .line 99
    const/4 v6, 0x2

    .line 100
    invoke-static {v3, v0, v2, v6}, La/o9h0;->a(La/o9h0;ZZI)La/o9h0;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v5, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_0

    .line 109
    .line 110
    new-instance p0, Ljava/util/ArrayList;

    .line 111
    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_1

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 136
    .line 137
    const/4 v6, 0x5

    .line 138
    invoke-static {v5, v0, v2, v6}, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a(Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;ZZI)Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, La/wnm0;->w()V

    .line 153
    .line 154
    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    invoke-virtual {p1}, La/wnm0;->x()V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_4

    .line 170
    .line 171
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    move-object v2, v0

    .line 176
    check-cast v2, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 177
    .line 178
    iget-object v2, v2, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a:La/e4f;

    .line 179
    .line 180
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 185
    .line 186
    iget-object v3, v3, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a:La/e4f;

    .line 187
    .line 188
    if-ne v2, v3, :cond_3

    .line 189
    .line 190
    move-object v1, v0

    .line 191
    :cond_4
    check-cast v1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 192
    .line 193
    if-eqz v1, :cond_5

    .line 194
    .line 195
    invoke-virtual {p1, v1}, La/wnm0;->y(Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    :goto_1
    return-void

    .line 199
    :pswitch_3
    check-cast p0, La/t3t;

    .line 200
    .line 201
    check-cast v3, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 202
    .line 203
    invoke-virtual {p0, v3}, La/t3t;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_4
    check-cast p0, La/t3t;

    .line 208
    .line 209
    check-cast v3, La/cp;

    .line 210
    .line 211
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, La/e4w;

    .line 216
    .line 217
    iget-object p1, p1, La/e4w;->c:La/d4w;

    .line 218
    .line 219
    invoke-virtual {p0, p1}, La/t3t;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_5
    check-cast p0, La/li8;

    .line 224
    .line 225
    check-cast v3, La/cp;

    .line 226
    .line 227
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, La/l8w;

    .line 232
    .line 233
    iget-wide v0, p1, La/l8w;->a:J

    .line 234
    .line 235
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p0, p1}, La/li8;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_6
    check-cast p0, La/vft;

    .line 244
    .line 245
    check-cast v3, La/cp;

    .line 246
    .line 247
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, La/u0w;

    .line 252
    .line 253
    iget-object p1, p1, La/u0w;->a:La/pdj;

    .line 254
    .line 255
    invoke-virtual {p0, p1}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_7
    check-cast p0, La/dxv;

    .line 260
    .line 261
    check-cast v3, La/vlq0;

    .line 262
    .line 263
    iput-object v3, p0, La/dxv;->g2:La/vlq0;

    .line 264
    .line 265
    iget-object p1, p0, La/dxv;->i2:La/ii;

    .line 266
    .line 267
    if-eqz p1, :cond_6

    .line 268
    .line 269
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 270
    .line 271
    const v0, 0x7f1309e2

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    const v0, 0x7f1309c0

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    const v0, 0x7f130e5c

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    const v0, 0x7f13032f

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    sget-object v11, La/n12;->a:La/n12;

    .line 303
    .line 304
    const/4 v12, 0x0

    .line 305
    const/16 v13, 0x5d0

    .line 306
    .line 307
    const/4 v7, 0x0

    .line 308
    const-string v8, "CONFIRM_DIALOG_REQUEST_KEY"

    .line 309
    .line 310
    const/4 v9, 0x0

    .line 311
    const/4 v10, 0x0

    .line 312
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, v2, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_6
    const-string p0, "actionDialogManager"

    .line 327
    .line 328
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v1

    .line 332
    :pswitch_8
    check-cast p0, La/k4p;

    .line 333
    .line 334
    check-cast v3, La/cp;

    .line 335
    .line 336
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-virtual {p0, p1}, La/k4p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_9
    check-cast p0, Landroid/widget/FrameLayout;

    .line 345
    .line 346
    check-cast v3, Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 347
    .line 348
    invoke-static {p0, v3}, Lorg/xplatform/uikit/components/tabs/DsTabs;->d(Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/tabs/DsTabs;)V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :pswitch_a
    check-cast p0, Landroid/view/View$OnClickListener;

    .line 353
    .line 354
    check-cast v3, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 355
    .line 356
    iget-object v0, v3, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    .line 357
    .line 358
    if-eqz p0, :cond_7

    .line 359
    .line 360
    sget v1, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->c:I

    .line 361
    .line 362
    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 363
    .line 364
    .line 365
    :cond_7
    iget-object p0, v0, La/dc3;->c:Landroid/view/View;

    .line 366
    .line 367
    check-cast p0, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 368
    .line 369
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->getExpanded()Z

    .line 370
    .line 371
    .line 372
    move-result p0

    .line 373
    xor-int/lit8 p1, p0, 0x1

    .line 374
    .line 375
    iget-boolean v1, v3, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->b:Z

    .line 376
    .line 377
    if-eqz v1, :cond_9

    .line 378
    .line 379
    iget-object v1, v0, La/dc3;->c:Landroid/view/View;

    .line 380
    .line 381
    check-cast v1, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 382
    .line 383
    invoke-virtual {v1, p1}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 384
    .line 385
    .line 386
    iget-object p1, v0, La/dc3;->d:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast p1, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 389
    .line 390
    if-nez p0, :cond_8

    .line 391
    .line 392
    goto :goto_2

    .line 393
    :cond_8
    const/16 v2, 0x8

    .line 394
    .line 395
    :goto_2
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 396
    .line 397
    .line 398
    :cond_9
    return-void

    .line 399
    :pswitch_b
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 400
    .line 401
    check-cast v3, La/j240;

    .line 402
    .line 403
    iget-object p1, v3, La/j240;->a:La/dfm0;

    .line 404
    .line 405
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_c
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 410
    .line 411
    check-cast v3, La/nz30;

    .line 412
    .line 413
    new-instance p1, La/dz10;

    .line 414
    .line 415
    iget-object v0, v3, La/nz30;->b:La/cz10;

    .line 416
    .line 417
    invoke-direct {p1, v0}, La/dz10;-><init>(La/cz10;)V

    .line 418
    .line 419
    .line 420
    new-instance v0, La/au30;

    .line 421
    .line 422
    invoke-direct {v0, p1}, La/au30;-><init>(La/dz10;)V

    .line 423
    .line 424
    .line 425
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_d
    check-cast p0, Lorg/xplatform/uikit/components/chips/DsChipGroup;

    .line 430
    .line 431
    check-cast v3, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 432
    .line 433
    invoke-static {p0, v3, p1}, Lorg/xplatform/uikit/components/chips/DsChipGroup;->a(Lorg/xplatform/uikit/components/chips/DsChipGroup;Lorg/xplatform/uikit/components/chips/DsChip;Landroid/view/View;)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :pswitch_e
    check-cast p0, Lorg/xplatform/uikit/components/text_field/end/b;

    .line 438
    .line 439
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 440
    .line 441
    iget p1, p0, Lorg/xplatform/uikit/components/text_field/end/b;->f:I

    .line 442
    .line 443
    if-nez p1, :cond_a

    .line 444
    .line 445
    new-instance p1, La/x4i;

    .line 446
    .line 447
    invoke-direct {p1, v3, p0, v2}, La/x4i;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/text_field/end/b;B)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/end/b;->b(Lkotlin/jvm/functions/Function0;)V

    .line 451
    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_a
    new-instance p1, La/x4i;

    .line 455
    .line 456
    const/4 v0, 0x1

    .line 457
    invoke-direct {p1, v3, p0, v0}, La/x4i;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/text_field/end/b;B)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/end/b;->c(Lkotlin/jvm/functions/Function0;)V

    .line 461
    .line 462
    .line 463
    :goto_3
    return-void

    .line 464
    :pswitch_f
    check-cast p0, La/jxh;

    .line 465
    .line 466
    check-cast v3, La/y8b;

    .line 467
    .line 468
    iget-object p0, p0, La/jxh;->m:La/olh;

    .line 469
    .line 470
    check-cast v3, La/vwh;

    .line 471
    .line 472
    iget-object p1, v3, La/vwh;->g:Ljava/lang/String;

    .line 473
    .line 474
    invoke-virtual {p0, p1}, La/olh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    return-void

    .line 478
    :pswitch_10
    check-cast v3, La/cp;

    .line 479
    .line 480
    check-cast p0, La/mhc;

    .line 481
    .line 482
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    iget-object v0, v3, La/cp;->u:La/yfu0;

    .line 486
    .line 487
    check-cast v0, La/k7g;

    .line 488
    .line 489
    iget-object v0, v0, La/k7g;->b:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 490
    .line 491
    iget-boolean v0, v0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->c:Z

    .line 492
    .line 493
    if-nez v0, :cond_b

    .line 494
    .line 495
    const/16 v0, 0x15

    .line 496
    .line 497
    goto :goto_4

    .line 498
    :cond_b
    const/16 v0, 0x16

    .line 499
    .line 500
    :goto_4
    invoke-static {p1, v0}, La/ckb;->Z(Landroid/view/View;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    check-cast p1, La/a7g;

    .line 508
    .line 509
    iget-wide v0, p1, La/a7g;->a:J

    .line 510
    .line 511
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    check-cast v0, La/a7g;

    .line 520
    .line 521
    iget-boolean v0, v0, La/a7g;->d:Z

    .line 522
    .line 523
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {p0, p1, v0}, La/mhc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :pswitch_11
    move-object v1, p0

    .line 532
    check-cast v1, La/xwe;

    .line 533
    .line 534
    check-cast v3, La/cp;

    .line 535
    .line 536
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    check-cast p0, La/vte;

    .line 541
    .line 542
    iget-wide p0, p0, La/vte;->c:J

    .line 543
    .line 544
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    check-cast p0, La/vte;

    .line 553
    .line 554
    iget-wide p0, p0, La/vte;->d:J

    .line 555
    .line 556
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    check-cast p1, La/vte;

    .line 565
    .line 566
    iget-wide v4, p1, La/vte;->e:J

    .line 567
    .line 568
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    check-cast p1, La/vte;

    .line 577
    .line 578
    iget-wide v5, p1, La/vte;->f:J

    .line 579
    .line 580
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    check-cast p1, La/vte;

    .line 589
    .line 590
    iget-boolean p1, p1, La/vte;->h:Z

    .line 591
    .line 592
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 593
    .line 594
    .line 595
    move-result-object v6

    .line 596
    move-object v3, p0

    .line 597
    invoke-virtual/range {v1 .. v6}, La/xwe;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    return-void

    .line 601
    :pswitch_12
    check-cast v3, La/cp;

    .line 602
    .line 603
    check-cast p0, La/z6e;

    .line 604
    .line 605
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    check-cast p1, La/ra8;

    .line 610
    .line 611
    iget-boolean p1, p1, La/ra8;->e:Z

    .line 612
    .line 613
    if-eqz p1, :cond_c

    .line 614
    .line 615
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    check-cast p1, La/ra8;

    .line 620
    .line 621
    iget p1, p1, La/ra8;->a:I

    .line 622
    .line 623
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    invoke-virtual {p0, p1}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    :cond_c
    return-void

    .line 631
    :pswitch_13
    check-cast p0, La/e7e;

    .line 632
    .line 633
    check-cast v3, La/kzq;

    .line 634
    .line 635
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 636
    .line 637
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    iget-object v0, v3, La/kzq;->f:Lcom/google/android/material/textfield/TextInputEditText;

    .line 642
    .line 643
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    new-instance v4, Ljava/util/Date;

    .line 652
    .line 653
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 654
    .line 655
    .line 656
    sget-object v5, La/h8d;->b:La/h8d;

    .line 657
    .line 658
    new-instance v6, La/qei0;

    .line 659
    .line 660
    invoke-direct {v6, v3, v5, v4}, La/qei0;-><init>(Ljava/lang/String;La/h8d;Ljava/util/Date;)V

    .line 661
    .line 662
    .line 663
    iget-object v5, p1, La/fae;->R:La/bby;

    .line 664
    .line 665
    if-eqz v5, :cond_d

    .line 666
    .line 667
    invoke-interface {v5, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 668
    .line 669
    .line 670
    :cond_d
    iget-object v1, p1, La/fae;->A:La/zj2;

    .line 671
    .line 672
    invoke-virtual {v1}, La/zj2;->getValue()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    check-cast v1, La/f9e;

    .line 677
    .line 678
    if-nez v1, :cond_e

    .line 679
    .line 680
    goto :goto_5

    .line 681
    :cond_e
    instance-of v5, v1, La/d9e;

    .line 682
    .line 683
    if-eqz v5, :cond_f

    .line 684
    .line 685
    new-instance v6, La/pei0;

    .line 686
    .line 687
    check-cast v1, La/d9e;

    .line 688
    .line 689
    iget-object v1, v1, La/d9e;->a:Ljava/util/List;

    .line 690
    .line 691
    invoke-direct {v6, v3, v1, v4}, La/pei0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;)V

    .line 692
    .line 693
    .line 694
    goto :goto_5

    .line 695
    :cond_f
    instance-of v5, v1, La/c9e;

    .line 696
    .line 697
    if-eqz v5, :cond_10

    .line 698
    .line 699
    new-instance v6, La/pei0;

    .line 700
    .line 701
    check-cast v1, La/c9e;

    .line 702
    .line 703
    iget-object v1, v1, La/c9e;->a:Ljava/io/File;

    .line 704
    .line 705
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-direct {v6, v3, v1, v4}, La/pei0;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Date;)V

    .line 710
    .line 711
    .line 712
    :cond_10
    :goto_5
    new-instance v1, La/w8e;

    .line 713
    .line 714
    invoke-direct {v1, p1, v2}, La/w8e;-><init>(La/fae;B)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {p1, v6, v1}, La/fae;->D(La/rei0;Lkotlin/jvm/functions/Function0;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {p0}, La/e7e;->H0()La/kzq;

    .line 721
    .line 722
    .line 723
    move-result-object p0

    .line 724
    iget-object p0, p0, La/kzq;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 725
    .line 726
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 727
    .line 728
    .line 729
    move-result p0

    .line 730
    if-nez p0, :cond_11

    .line 731
    .line 732
    const-string p0, ""

    .line 733
    .line 734
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 735
    .line 736
    .line 737
    :cond_11
    return-void

    .line 738
    :pswitch_14
    check-cast p0, La/zac;

    .line 739
    .line 740
    check-cast v3, Lorg/xplatform/uikit/components/chips/Chip;

    .line 741
    .line 742
    invoke-static {p0, v3, p1}, La/zac;->b(La/zac;Lorg/xplatform/uikit/components/chips/Chip;Landroid/view/View;)V

    .line 743
    .line 744
    .line 745
    return-void

    .line 746
    :pswitch_15
    check-cast p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 747
    .line 748
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 749
    .line 750
    iput v2, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->b:I

    .line 751
    .line 752
    invoke-virtual {p0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->b()V

    .line 753
    .line 754
    .line 755
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_16
    check-cast p0, La/w6q0;

    .line 760
    .line 761
    check-cast v3, La/cp;

    .line 762
    .line 763
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object p1

    .line 767
    check-cast p1, La/jp9;

    .line 768
    .line 769
    iget p1, p1, La/jp9;->a:I

    .line 770
    .line 771
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 772
    .line 773
    .line 774
    move-result-object p1

    .line 775
    invoke-virtual {p0, p1}, La/w6q0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    return-void

    .line 779
    :pswitch_17
    check-cast p0, La/p77;

    .line 780
    .line 781
    check-cast v3, La/m77;

    .line 782
    .line 783
    iget-object p0, p0, La/p77;->w:La/wdr;

    .line 784
    .line 785
    check-cast p0, La/ur6;

    .line 786
    .line 787
    invoke-virtual {p0, v3}, La/ur6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    return-void

    .line 791
    :pswitch_18
    check-cast p0, La/z6e;

    .line 792
    .line 793
    check-cast v3, La/cp;

    .line 794
    .line 795
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object p1

    .line 799
    check-cast p1, La/m14;

    .line 800
    .line 801
    iget-object p1, p1, La/m14;->a:Ljava/lang/String;

    .line 802
    .line 803
    invoke-virtual {p0, p1}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    return-void

    .line 807
    :pswitch_19
    check-cast p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 808
    .line 809
    check-cast v3, La/z70;

    .line 810
    .line 811
    iget-object p0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->b:Lkotlin/jvm/functions/Function1;

    .line 812
    .line 813
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    return-void

    .line 817
    :pswitch_1a
    check-cast p0, La/v70;

    .line 818
    .line 819
    check-cast v3, La/t70;

    .line 820
    .line 821
    iget-object p0, p0, La/v70;->v:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast p0, La/i80;

    .line 824
    .line 825
    invoke-virtual {p0, v3}, La/i80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    return-void

    .line 829
    :pswitch_1b
    check-cast p0, La/pf10;

    .line 830
    .line 831
    check-cast v3, La/cp;

    .line 832
    .line 833
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object p1

    .line 837
    invoke-virtual {p0, p1}, La/pf10;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    return-void

    .line 841
    :pswitch_1c
    check-cast p0, La/t0;

    .line 842
    .line 843
    check-cast v3, La/cp;

    .line 844
    .line 845
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    check-cast p1, La/ug;

    .line 850
    .line 851
    iget-wide v0, p1, La/ug;->a:J

    .line 852
    .line 853
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    invoke-virtual {p0, p1}, La/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    return-void

    .line 861
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
