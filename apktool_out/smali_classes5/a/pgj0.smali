.class public final La/pgj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pgj0;->a:B

    iput-object p1, p0, La/pgj0;->b:La/cp;

    iput-object p2, p0, La/pgj0;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, v0, La/pgj0;->c:La/cp;

    .line 8
    .line 9
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v4, v2, La/cp;->u:La/yfu0;

    .line 12
    .line 13
    iget-object v0, v0, La/pgj0;->b:La/cp;

    .line 14
    .line 15
    iget-object v5, v0, La/cp;->w:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v6, v0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    const v8, 0x7f1317d3

    .line 27
    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    if-eqz v7, :cond_3

    .line 31
    .line 32
    move-object v1, v6

    .line 33
    check-cast v1, La/zvn0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/gwn0;

    .line 40
    .line 41
    iget-boolean v2, v2, La/gwn0;->u:Z

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    iget-object v2, v1, La/zvn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/zvn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v1, La/zvn0;->i:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, La/zvn0;->o:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 63
    .line 64
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v1, La/zvn0;->q:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v1, La/zvn0;->h:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, La/zvn0;->p:Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    iget-object v2, v1, La/zvn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, La/zvn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v1, La/zvn0;->i:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, La/zvn0;->o:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 101
    .line 102
    .line 103
    iget-object v2, v1, La/zvn0;->q:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, La/zvn0;->h:Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v1, La/zvn0;->p:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 116
    .line 117
    .line 118
    :goto_0
    iget-object v2, v1, La/zvn0;->e:Landroid/widget/TextView;

    .line 119
    .line 120
    iget-object v4, v1, La/zvn0;->f:Landroid/widget/TextView;

    .line 121
    .line 122
    iget-object v7, v1, La/zvn0;->p:Landroid/widget/TextView;

    .line 123
    .line 124
    iget-object v10, v1, La/zvn0;->h:Landroid/widget/TextView;

    .line 125
    .line 126
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    check-cast v11, La/gwn0;

    .line 131
    .line 132
    iget-object v11, v11, La/gwn0;->b:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, v1, La/zvn0;->t:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    check-cast v11, La/gwn0;

    .line 144
    .line 145
    iget-object v11, v11, La/gwn0;->c:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    iget-object v2, v1, La/zvn0;->r:Landroid/widget/ImageView;

    .line 151
    .line 152
    const/16 v11, 0x8

    .line 153
    .line 154
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/gwn0;

    .line 165
    .line 166
    iget-object v2, v2, La/gwn0;->h:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, La/gwn0;

    .line 179
    .line 180
    iget-object v2, v2, La/gwn0;->i:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 186
    .line 187
    iget-object v12, v1, La/zvn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 188
    .line 189
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, La/gwn0;

    .line 194
    .line 195
    iget-object v13, v2, La/gwn0;->d:Ljava/lang/String;

    .line 196
    .line 197
    const/16 v18, 0x0

    .line 198
    .line 199
    const/16 v19, 0x1fc

    .line 200
    .line 201
    const v14, 0x7f080dfe

    .line 202
    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    invoke-static/range {v12 .. v19}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 210
    .line 211
    .line 212
    iget-object v2, v1, La/zvn0;->o:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 213
    .line 214
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    check-cast v7, La/gwn0;

    .line 219
    .line 220
    iget-object v7, v7, La/gwn0;->f:Ljava/lang/String;

    .line 221
    .line 222
    const/16 v26, 0x0

    .line 223
    .line 224
    const/16 v27, 0x1fc

    .line 225
    .line 226
    const v22, 0x7f080dfe

    .line 227
    .line 228
    .line 229
    const/16 v23, 0x0

    .line 230
    .line 231
    const/16 v24, 0x0

    .line 232
    .line 233
    const/16 v25, 0x0

    .line 234
    .line 235
    move-object/from16 v20, v2

    .line 236
    .line 237
    move-object/from16 v21, v7

    .line 238
    .line 239
    invoke-static/range {v20 .. v27}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 240
    .line 241
    .line 242
    iget-object v12, v1, La/zvn0;->i:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 243
    .line 244
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    check-cast v2, La/gwn0;

    .line 249
    .line 250
    iget-object v13, v2, La/gwn0;->e:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static/range {v12 .. v19}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 253
    .line 254
    .line 255
    iget-object v2, v1, La/zvn0;->q:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 256
    .line 257
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, La/gwn0;

    .line 262
    .line 263
    iget-object v7, v7, La/gwn0;->g:Ljava/lang/String;

    .line 264
    .line 265
    move-object/from16 v20, v2

    .line 266
    .line 267
    move-object/from16 v21, v7

    .line 268
    .line 269
    invoke-static/range {v20 .. v27}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 270
    .line 271
    .line 272
    iget-object v2, v1, La/zvn0;->k:Landroid/widget/TextView;

    .line 273
    .line 274
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    check-cast v7, La/gwn0;

    .line 279
    .line 280
    iget-object v7, v7, La/gwn0;->m:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    check-cast v2, La/gwn0;

    .line 290
    .line 291
    iget-object v2, v2, La/gwn0;->n:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    .line 295
    .line 296
    iget-object v1, v1, La/zvn0;->n:Landroid/widget/TextView;

    .line 297
    .line 298
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, La/gwn0;

    .line 303
    .line 304
    iget-object v2, v2, La/gwn0;->o:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    .line 308
    .line 309
    sget-object v1, La/fzc;->a:La/kj5;

    .line 310
    .line 311
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    check-cast v2, La/gwn0;

    .line 316
    .line 317
    iget-object v2, v2, La/gwn0;->t:La/fzc;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {v2, v5}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 327
    .line 328
    .line 329
    move-object v1, v6

    .line 330
    check-cast v1, La/zvn0;

    .line 331
    .line 332
    iget-object v2, v1, La/zvn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 333
    .line 334
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 337
    .line 338
    .line 339
    iget-object v2, v1, La/zvn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 340
    .line 341
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    check-cast v4, La/gwn0;

    .line 346
    .line 347
    iget-object v4, v4, La/gwn0;->p:Ljava/lang/String;

    .line 348
    .line 349
    const/16 v7, 0x3e

    .line 350
    .line 351
    invoke-static {v2, v4, v9, v9, v7}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    check-cast v2, La/gwn0;

    .line 359
    .line 360
    iget-object v2, v2, La/gwn0;->s:Ljava/lang/String;

    .line 361
    .line 362
    move-object v4, v6

    .line 363
    check-cast v4, La/zvn0;

    .line 364
    .line 365
    iget-object v4, v4, La/zvn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    if-nez v7, :cond_1

    .line 372
    .line 373
    invoke-virtual {v5, v8}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    :cond_1
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    check-cast v2, La/gwn0;

    .line 385
    .line 386
    iget-object v2, v2, La/gwn0;->q:La/ewn0;

    .line 387
    .line 388
    invoke-static {v0, v2}, La/xnm0;->g(La/cp;La/ewn0;)V

    .line 389
    .line 390
    .line 391
    iget-object v2, v1, La/zvn0;->l:Landroid/widget/TextView;

    .line 392
    .line 393
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    check-cast v4, La/gwn0;

    .line 398
    .line 399
    iget-object v4, v4, La/gwn0;->j:Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 402
    .line 403
    .line 404
    iget-object v1, v1, La/zvn0;->m:Landroid/widget/TextView;

    .line 405
    .line 406
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    check-cast v2, La/gwn0;

    .line 411
    .line 412
    iget-object v2, v2, La/gwn0;->k:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, La/gwn0;

    .line 422
    .line 423
    iget-object v0, v0, La/gwn0;->r:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-nez v1, :cond_2

    .line 430
    .line 431
    check-cast v6, La/zvn0;

    .line 432
    .line 433
    iget-object v0, v6, La/zvn0;->j:Landroid/widget/TextView;

    .line 434
    .line 435
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_3

    .line 439
    .line 440
    :cond_2
    check-cast v6, La/zvn0;

    .line 441
    .line 442
    iget-object v1, v6, La/zvn0;->j:Landroid/widget/TextView;

    .line 443
    .line 444
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    .line 446
    .line 447
    iget-object v0, v6, La/zvn0;->j:Landroid/widget/TextView;

    .line 448
    .line 449
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_3

    .line 453
    .line 454
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    if-eqz v5, :cond_4

    .line 468
    .line 469
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    check-cast v5, Ljava/util/Collection;

    .line 477
    .line 478
    check-cast v5, Ljava/lang/Iterable;

    .line 479
    .line 480
    invoke-static {v0, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 481
    .line 482
    .line 483
    goto :goto_1

    .line 484
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-eqz v1, :cond_b

    .line 493
    .line 494
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    check-cast v1, La/fwn0;

    .line 499
    .line 500
    if-eqz v1, :cond_a

    .line 501
    .line 502
    instance-of v5, v1, La/awn0;

    .line 503
    .line 504
    if-eqz v5, :cond_5

    .line 505
    .line 506
    move-object v5, v4

    .line 507
    check-cast v5, La/zvn0;

    .line 508
    .line 509
    iget-object v5, v5, La/zvn0;->f:Landroid/widget/TextView;

    .line 510
    .line 511
    check-cast v1, La/awn0;

    .line 512
    .line 513
    iget-object v1, v1, La/awn0;->a:Ljava/lang/String;

    .line 514
    .line 515
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    .line 517
    .line 518
    goto :goto_2

    .line 519
    :cond_5
    instance-of v5, v1, La/cwn0;

    .line 520
    .line 521
    if-eqz v5, :cond_6

    .line 522
    .line 523
    move-object v5, v4

    .line 524
    check-cast v5, La/zvn0;

    .line 525
    .line 526
    iget-object v5, v5, La/zvn0;->n:Landroid/widget/TextView;

    .line 527
    .line 528
    check-cast v1, La/cwn0;

    .line 529
    .line 530
    iget-object v1, v1, La/cwn0;->a:Ljava/lang/String;

    .line 531
    .line 532
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 533
    .line 534
    .line 535
    goto :goto_2

    .line 536
    :cond_6
    instance-of v5, v1, La/ewn0;

    .line 537
    .line 538
    if-eqz v5, :cond_7

    .line 539
    .line 540
    check-cast v1, La/ewn0;

    .line 541
    .line 542
    invoke-static {v2, v1}, La/xnm0;->g(La/cp;La/ewn0;)V

    .line 543
    .line 544
    .line 545
    goto :goto_2

    .line 546
    :cond_7
    instance-of v5, v1, La/dwn0;

    .line 547
    .line 548
    if-eqz v5, :cond_9

    .line 549
    .line 550
    check-cast v1, La/dwn0;

    .line 551
    .line 552
    iget-object v1, v1, La/dwn0;->a:Ljava/lang/String;

    .line 553
    .line 554
    move-object v5, v4

    .line 555
    check-cast v5, La/zvn0;

    .line 556
    .line 557
    iget-object v5, v5, La/zvn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    if-nez v6, :cond_8

    .line 564
    .line 565
    invoke-virtual {v3, v8}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    :cond_8
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 570
    .line 571
    .line 572
    goto :goto_2

    .line 573
    :cond_9
    instance-of v5, v1, La/bwn0;

    .line 574
    .line 575
    if-eqz v5, :cond_a

    .line 576
    .line 577
    move-object v5, v4

    .line 578
    check-cast v5, La/zvn0;

    .line 579
    .line 580
    iget-object v5, v5, La/zvn0;->f:Landroid/widget/TextView;

    .line 581
    .line 582
    sget-object v6, La/fzc;->a:La/kj5;

    .line 583
    .line 584
    check-cast v1, La/bwn0;

    .line 585
    .line 586
    iget-object v1, v1, La/bwn0;->a:La/fzc;

    .line 587
    .line 588
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-static {v1, v3}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 596
    .line 597
    .line 598
    goto :goto_2

    .line 599
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 600
    .line 601
    .line 602
    return-object v9

    .line 603
    :cond_b
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move-object p1, v2

    .line 22
    check-cast p1, La/nwn0;

    .line 23
    .line 24
    iget-object v0, p1, La/nwn0;->e:Landroid/widget/TextView;

    .line 25
    .line 26
    iget-object v1, p1, La/nwn0;->f:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, La/mwn0;

    .line 33
    .line 34
    iget-object v3, v3, La/mwn0;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p1, La/nwn0;->m:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, La/mwn0;

    .line 46
    .line 47
    iget-object v3, v3, La/mwn0;->c:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, La/nwn0;->k:Landroid/widget/ImageView;

    .line 53
    .line 54
    const/16 v3, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p1, La/nwn0;->o:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, La/mwn0;

    .line 66
    .line 67
    iget-object v3, v3, La/mwn0;->d:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p1, La/nwn0;->g:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, La/mwn0;

    .line 79
    .line 80
    iget-object v3, v3, La/mwn0;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/mwn0;

    .line 90
    .line 91
    iget-object v0, v0, La/mwn0;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, La/fzc;->a:La/kj5;

    .line 97
    .line 98
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, La/mwn0;

    .line 103
    .line 104
    iget-object v3, v3, La/mwn0;->m:La/fzc;

    .line 105
    .line 106
    iget-object v5, p0, La/cp;->w:Landroid/content/Context;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {v3, v5}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, La/nwn0;->j:Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/mwn0;

    .line 125
    .line 126
    iget-object v0, v0, La/mwn0;->j:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    move-object p1, v2

    .line 132
    check-cast p1, La/nwn0;

    .line 133
    .line 134
    iget-object v0, p1, La/nwn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 135
    .line 136
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 142
    .line 143
    iget-object p1, p1, La/nwn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 144
    .line 145
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/mwn0;

    .line 150
    .line 151
    iget-object v0, v0, La/mwn0;->k:Ljava/lang/String;

    .line 152
    .line 153
    const/16 v1, 0x3e

    .line 154
    .line 155
    invoke-static {p1, v0, v4, v4, v1}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, La/mwn0;

    .line 163
    .line 164
    iget-object p1, p1, La/mwn0;->l:La/kwn0;

    .line 165
    .line 166
    invoke-static {p0, p1}, La/iom0;->g(La/cp;La/kwn0;)V

    .line 167
    .line 168
    .line 169
    check-cast v2, La/nwn0;

    .line 170
    .line 171
    iget-object p1, v2, La/nwn0;->h:Landroid/widget/TextView;

    .line 172
    .line 173
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, La/mwn0;

    .line 178
    .line 179
    iget-object v0, v0, La/mwn0;->e:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, v2, La/nwn0;->i:Landroid/widget/TextView;

    .line 185
    .line 186
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    check-cast p0, La/mwn0;

    .line 191
    .line 192
    iget-object p0, p0, La/mwn0;->f:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_1

    .line 213
    .line 214
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    check-cast v2, Ljava/util/Collection;

    .line 222
    .line 223
    check-cast v2, Ljava/lang/Iterable;

    .line 224
    .line 225
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 226
    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-eqz p1, :cond_6

    .line 238
    .line 239
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    check-cast p1, La/lwn0;

    .line 244
    .line 245
    if-eqz p1, :cond_5

    .line 246
    .line 247
    instance-of v2, p1, La/hwn0;

    .line 248
    .line 249
    if-eqz v2, :cond_2

    .line 250
    .line 251
    move-object v2, v1

    .line 252
    check-cast v2, La/nwn0;

    .line 253
    .line 254
    iget-object v2, v2, La/nwn0;->f:Landroid/widget/TextView;

    .line 255
    .line 256
    check-cast p1, La/hwn0;

    .line 257
    .line 258
    iget-object p1, p1, La/hwn0;->a:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_2
    instance-of v2, p1, La/jwn0;

    .line 265
    .line 266
    if-eqz v2, :cond_3

    .line 267
    .line 268
    move-object v2, v1

    .line 269
    check-cast v2, La/nwn0;

    .line 270
    .line 271
    iget-object v2, v2, La/nwn0;->j:Landroid/widget/TextView;

    .line 272
    .line 273
    check-cast p1, La/jwn0;

    .line 274
    .line 275
    iget-object p1, p1, La/jwn0;->a:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_3
    instance-of v2, p1, La/kwn0;

    .line 282
    .line 283
    if-eqz v2, :cond_4

    .line 284
    .line 285
    check-cast p1, La/kwn0;

    .line 286
    .line 287
    invoke-static {v0, p1}, La/iom0;->g(La/cp;La/kwn0;)V

    .line 288
    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_4
    instance-of v2, p1, La/iwn0;

    .line 292
    .line 293
    if-eqz v2, :cond_5

    .line 294
    .line 295
    move-object v2, v1

    .line 296
    check-cast v2, La/nwn0;

    .line 297
    .line 298
    iget-object v2, v2, La/nwn0;->f:Landroid/widget/TextView;

    .line 299
    .line 300
    sget-object v3, La/fzc;->a:La/kj5;

    .line 301
    .line 302
    check-cast p1, La/iwn0;

    .line 303
    .line 304
    iget-object p1, p1, La/iwn0;->a:La/fzc;

    .line 305
    .line 306
    iget-object v5, v0, La/cp;->w:Landroid/content/Context;

    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {p1, v5}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 316
    .line 317
    .line 318
    goto :goto_1

    .line 319
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 320
    .line 321
    .line 322
    return-object v4

    .line 323
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, v0, La/pgj0;->c:La/cp;

    .line 8
    .line 9
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v4, v2, La/cp;->u:La/yfu0;

    .line 12
    .line 13
    iget-object v0, v0, La/pgj0;->b:La/cp;

    .line 14
    .line 15
    iget-object v5, v0, La/cp;->w:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v6, v0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    const v8, 0x7f1317d3

    .line 27
    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    if-eqz v7, :cond_3

    .line 31
    .line 32
    move-object v1, v6

    .line 33
    check-cast v1, La/own0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/vwn0;

    .line 40
    .line 41
    iget-boolean v2, v2, La/vwn0;->s:Z

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    iget-object v2, v1, La/own0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 47
    .line 48
    const/4 v4, 0x3

    .line 49
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v1, La/own0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v1, La/own0;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, La/own0;->h:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v1, La/own0;->o:Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-object v2, v1, La/own0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, La/own0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v1, La/own0;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, La/own0;->h:Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v1, La/own0;->o:Landroid/widget/TextView;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 96
    .line 97
    .line 98
    :goto_0
    iget-object v2, v1, La/own0;->e:Landroid/widget/TextView;

    .line 99
    .line 100
    iget-object v4, v1, La/own0;->f:Landroid/widget/TextView;

    .line 101
    .line 102
    iget-object v7, v1, La/own0;->o:Landroid/widget/TextView;

    .line 103
    .line 104
    iget-object v10, v1, La/own0;->h:Landroid/widget/TextView;

    .line 105
    .line 106
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    check-cast v11, La/vwn0;

    .line 111
    .line 112
    iget-object v11, v11, La/vwn0;->b:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    iget-object v2, v1, La/own0;->r:Landroid/widget/TextView;

    .line 118
    .line 119
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    check-cast v11, La/vwn0;

    .line 124
    .line 125
    iget-object v11, v11, La/vwn0;->c:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    iget-object v2, v1, La/own0;->p:Landroid/widget/ImageView;

    .line 131
    .line 132
    const/16 v11, 0x8

    .line 133
    .line 134
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, La/vwn0;

    .line 145
    .line 146
    iget-object v2, v2, La/vwn0;->f:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, La/vwn0;

    .line 159
    .line 160
    iget-object v2, v2, La/vwn0;->g:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 166
    .line 167
    iget-object v12, v1, La/own0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 168
    .line 169
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, La/vwn0;

    .line 174
    .line 175
    iget-object v13, v2, La/vwn0;->d:Ljava/lang/String;

    .line 176
    .line 177
    const/16 v18, 0x0

    .line 178
    .line 179
    const/16 v19, 0x1fc

    .line 180
    .line 181
    const v14, 0x7f080dfe

    .line 182
    .line 183
    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    invoke-static/range {v12 .. v19}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 190
    .line 191
    .line 192
    iget-object v2, v1, La/own0;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 193
    .line 194
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    check-cast v7, La/vwn0;

    .line 199
    .line 200
    iget-object v7, v7, La/vwn0;->e:Ljava/lang/String;

    .line 201
    .line 202
    const/16 v26, 0x0

    .line 203
    .line 204
    const/16 v27, 0x1fc

    .line 205
    .line 206
    const v22, 0x7f080dfe

    .line 207
    .line 208
    .line 209
    const/16 v23, 0x0

    .line 210
    .line 211
    const/16 v24, 0x0

    .line 212
    .line 213
    const/16 v25, 0x0

    .line 214
    .line 215
    move-object/from16 v20, v2

    .line 216
    .line 217
    move-object/from16 v21, v7

    .line 218
    .line 219
    invoke-static/range {v20 .. v27}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 220
    .line 221
    .line 222
    iget-object v2, v1, La/own0;->j:Landroid/widget/TextView;

    .line 223
    .line 224
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    check-cast v7, La/vwn0;

    .line 229
    .line 230
    iget-object v7, v7, La/vwn0;->k:Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, La/vwn0;

    .line 240
    .line 241
    iget-object v2, v2, La/vwn0;->l:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    .line 245
    .line 246
    sget-object v2, La/fzc;->a:La/kj5;

    .line 247
    .line 248
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    check-cast v7, La/vwn0;

    .line 253
    .line 254
    iget-object v7, v7, La/vwn0;->r:La/fzc;

    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {v7, v5}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 264
    .line 265
    .line 266
    iget-object v1, v1, La/own0;->m:Landroid/widget/TextView;

    .line 267
    .line 268
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    check-cast v2, La/vwn0;

    .line 273
    .line 274
    iget-object v2, v2, La/vwn0;->m:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    .line 278
    .line 279
    move-object v1, v6

    .line 280
    check-cast v1, La/own0;

    .line 281
    .line 282
    iget-object v2, v1, La/own0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 283
    .line 284
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 287
    .line 288
    .line 289
    iget-object v2, v1, La/own0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 290
    .line 291
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, La/vwn0;

    .line 296
    .line 297
    iget-object v4, v4, La/vwn0;->q:Ljava/lang/String;

    .line 298
    .line 299
    const/16 v7, 0x3e

    .line 300
    .line 301
    invoke-static {v2, v4, v9, v9, v7}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 302
    .line 303
    .line 304
    iget-object v2, v1, La/own0;->k:Landroid/widget/TextView;

    .line 305
    .line 306
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, La/vwn0;

    .line 311
    .line 312
    iget-object v4, v4, La/vwn0;->h:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    .line 316
    .line 317
    iget-object v1, v1, La/own0;->l:Landroid/widget/TextView;

    .line 318
    .line 319
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    check-cast v2, La/vwn0;

    .line 324
    .line 325
    iget-object v2, v2, La/vwn0;->i:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    check-cast v1, La/vwn0;

    .line 335
    .line 336
    iget-object v1, v1, La/vwn0;->n:La/twn0;

    .line 337
    .line 338
    invoke-static {v0, v1}, La/ipm0;->c(La/cp;La/twn0;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    check-cast v1, La/vwn0;

    .line 346
    .line 347
    iget-object v1, v1, La/vwn0;->o:Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-nez v2, :cond_1

    .line 354
    .line 355
    move-object v1, v6

    .line 356
    check-cast v1, La/own0;

    .line 357
    .line 358
    iget-object v1, v1, La/own0;->i:Landroid/widget/TextView;

    .line 359
    .line 360
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 361
    .line 362
    .line 363
    goto :goto_1

    .line 364
    :cond_1
    move-object v2, v6

    .line 365
    check-cast v2, La/own0;

    .line 366
    .line 367
    iget-object v4, v2, La/own0;->i:Landroid/widget/TextView;

    .line 368
    .line 369
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    iget-object v1, v2, La/own0;->i:Landroid/widget/TextView;

    .line 373
    .line 374
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 375
    .line 376
    .line 377
    :goto_1
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    check-cast v0, La/vwn0;

    .line 382
    .line 383
    iget-object v0, v0, La/vwn0;->p:Ljava/lang/String;

    .line 384
    .line 385
    check-cast v6, La/own0;

    .line 386
    .line 387
    iget-object v1, v6, La/own0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-nez v2, :cond_2

    .line 394
    .line 395
    invoke-virtual {v5, v8}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    :cond_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_4

    .line 403
    .line 404
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 407
    .line 408
    .line 409
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-eqz v5, :cond_4

    .line 418
    .line 419
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    check-cast v5, Ljava/util/Collection;

    .line 427
    .line 428
    check-cast v5, Ljava/lang/Iterable;

    .line 429
    .line 430
    invoke-static {v0, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 431
    .line 432
    .line 433
    goto :goto_2

    .line 434
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_b

    .line 443
    .line 444
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, La/uwn0;

    .line 449
    .line 450
    if-eqz v1, :cond_a

    .line 451
    .line 452
    instance-of v5, v1, La/pwn0;

    .line 453
    .line 454
    if-eqz v5, :cond_5

    .line 455
    .line 456
    move-object v5, v4

    .line 457
    check-cast v5, La/own0;

    .line 458
    .line 459
    iget-object v5, v5, La/own0;->f:Landroid/widget/TextView;

    .line 460
    .line 461
    check-cast v1, La/pwn0;

    .line 462
    .line 463
    iget-object v1, v1, La/pwn0;->a:Ljava/lang/String;

    .line 464
    .line 465
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 466
    .line 467
    .line 468
    goto :goto_3

    .line 469
    :cond_5
    instance-of v5, v1, La/rwn0;

    .line 470
    .line 471
    if-eqz v5, :cond_6

    .line 472
    .line 473
    move-object v5, v4

    .line 474
    check-cast v5, La/own0;

    .line 475
    .line 476
    iget-object v5, v5, La/own0;->m:Landroid/widget/TextView;

    .line 477
    .line 478
    check-cast v1, La/rwn0;

    .line 479
    .line 480
    iget-object v1, v1, La/rwn0;->a:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    .line 484
    .line 485
    goto :goto_3

    .line 486
    :cond_6
    instance-of v5, v1, La/twn0;

    .line 487
    .line 488
    if-eqz v5, :cond_7

    .line 489
    .line 490
    check-cast v1, La/twn0;

    .line 491
    .line 492
    invoke-static {v2, v1}, La/ipm0;->c(La/cp;La/twn0;)V

    .line 493
    .line 494
    .line 495
    goto :goto_3

    .line 496
    :cond_7
    instance-of v5, v1, La/swn0;

    .line 497
    .line 498
    if-eqz v5, :cond_9

    .line 499
    .line 500
    check-cast v1, La/swn0;

    .line 501
    .line 502
    iget-object v1, v1, La/swn0;->a:Ljava/lang/String;

    .line 503
    .line 504
    move-object v5, v4

    .line 505
    check-cast v5, La/own0;

    .line 506
    .line 507
    iget-object v5, v5, La/own0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 508
    .line 509
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 510
    .line 511
    .line 512
    move-result v6

    .line 513
    if-nez v6, :cond_8

    .line 514
    .line 515
    invoke-virtual {v3, v8}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    :cond_8
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 520
    .line 521
    .line 522
    goto :goto_3

    .line 523
    :cond_9
    instance-of v5, v1, La/qwn0;

    .line 524
    .line 525
    if-eqz v5, :cond_a

    .line 526
    .line 527
    move-object v5, v4

    .line 528
    check-cast v5, La/own0;

    .line 529
    .line 530
    iget-object v5, v5, La/own0;->f:Landroid/widget/TextView;

    .line 531
    .line 532
    sget-object v6, La/fzc;->a:La/kj5;

    .line 533
    .line 534
    check-cast v1, La/qwn0;

    .line 535
    .line 536
    iget-object v1, v1, La/qwn0;->a:La/fzc;

    .line 537
    .line 538
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-static {v1, v3}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 546
    .line 547
    .line 548
    goto :goto_3

    .line 549
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 550
    .line 551
    .line 552
    return-object v9

    .line 553
    :cond_b
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/lyx;

    .line 18
    .line 19
    iget-object v0, v0, La/lyx;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/bvq0;

    .line 26
    .line 27
    invoke-virtual {v1}, La/bvq0;->getTitle()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, La/lyx;

    .line 35
    .line 36
    iget-object v0, p1, La/lyx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 37
    .line 38
    iget-object p1, p1, La/lyx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 39
    .line 40
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/bvq0;

    .line 45
    .line 46
    invoke-virtual {v1}, La/bvq0;->i()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/bvq0;

    .line 58
    .line 59
    invoke-virtual {v0}, La/bvq0;->c()La/uwx;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, La/uwx;->a:La/uwx;

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    const/4 v3, 0x0

    .line 67
    if-eq v0, v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/bvq0;

    .line 74
    .line 75
    invoke-virtual {v0}, La/bvq0;->c()La/uwx;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, La/uwx;->d:La/uwx;

    .line 80
    .line 81
    if-ne v0, v1, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move v0, v3

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    :goto_0
    move v0, v2

    .line 87
    :goto_1
    invoke-virtual {p1, v0}, La/tw5;->setFirst(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/bvq0;

    .line 95
    .line 96
    invoke-virtual {v0}, La/bvq0;->c()La/uwx;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, La/uwx;->c:La/uwx;

    .line 101
    .line 102
    if-eq v0, v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/bvq0;

    .line 109
    .line 110
    invoke-virtual {p0}, La/bvq0;->c()La/uwx;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    sget-object v0, La/uwx;->d:La/uwx;

    .line 115
    .line 116
    if-ne p0, v0, :cond_2

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    move v2, v3

    .line 120
    :cond_3
    :goto_2
    invoke-virtual {p1, v2}, La/tw5;->setLast(Z)V

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast v1, Ljava/util/Collection;

    .line 147
    .line 148
    check-cast v1, Ljava/lang/Iterable;

    .line 149
    .line 150
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, La/xuq0;

    .line 169
    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    iget-boolean v0, v0, La/xuq0;->a:Z

    .line 173
    .line 174
    iget-object v1, p0, La/pgj0;->c:La/cp;

    .line 175
    .line 176
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 177
    .line 178
    check-cast v1, La/lyx;

    .line 179
    .line 180
    iget-object v1, v1, La/lyx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 187
    .line 188
    .line 189
    const/4 p0, 0x0

    .line 190
    return-object p0

    .line 191
    :cond_7
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 4
    .line 5
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 17
    .line 18
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/cal;

    .line 22
    .line 23
    iget-object v0, v0, La/cal;->b:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/wep0;

    .line 30
    .line 31
    iget-object v1, v1, La/wep0;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->setHeader(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, La/cal;

    .line 37
    .line 38
    iget-object v0, p1, La/cal;->b:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 39
    .line 40
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/wep0;

    .line 45
    .line 46
    iget-object v1, v1, La/wep0;->a:La/xnp0;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->setTeam(La/xnp0;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, La/cal;->b:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 52
    .line 53
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/wep0;

    .line 58
    .line 59
    iget-object p0, p0, La/wep0;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->setPlayersKillsStatistics(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast v1, Ljava/util/Collection;

    .line 88
    .line 89
    check-cast v1, Ljava/lang/Iterable;

    .line 90
    .line 91
    invoke-static {p0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/vep0;

    .line 110
    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    instance-of v1, p1, La/sep0;

    .line 114
    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    move-object v1, v0

    .line 118
    check-cast v1, La/cal;

    .line 119
    .line 120
    iget-object v1, v1, La/cal;->b:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 121
    .line 122
    check-cast p1, La/sep0;

    .line 123
    .line 124
    iget-object p1, p1, La/sep0;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->setPlayersKillsStatistics(Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    instance-of v1, p1, La/tep0;

    .line 131
    .line 132
    if-eqz v1, :cond_3

    .line 133
    .line 134
    move-object v1, v0

    .line 135
    check-cast v1, La/cal;

    .line 136
    .line 137
    iget-object v1, v1, La/cal;->b:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 138
    .line 139
    check-cast p1, La/tep0;

    .line 140
    .line 141
    iget-object p1, p1, La/tep0;->a:La/xnp0;

    .line 142
    .line 143
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->setTeam(La/xnp0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    instance-of v1, p1, La/uep0;

    .line 148
    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    move-object v1, v0

    .line 152
    check-cast v1, La/cal;

    .line 153
    .line 154
    iget-object v1, v1, La/cal;->b:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 155
    .line 156
    check-cast p1, La/uep0;

    .line 157
    .line 158
    iget-object p1, p1, La/uep0;->a:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->setHeader(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 165
    .line 166
    .line 167
    const/4 p0, 0x0

    .line 168
    return-object p0

    .line 169
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 4
    .line 5
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 17
    .line 18
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/eal;

    .line 22
    .line 23
    iget-object v0, v0, La/eal;->b:Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/zlp0;

    .line 30
    .line 31
    iget-object v1, v1, La/zlp0;->b:La/xnp0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setTeam(La/xnp0;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, La/eal;

    .line 37
    .line 38
    iget-object v0, p1, La/eal;->b:Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 39
    .line 40
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/zlp0;

    .line 45
    .line 46
    iget-object v1, v1, La/zlp0;->d:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setPlayerStatistics(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, La/eal;->b:Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 52
    .line 53
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/zlp0;

    .line 58
    .line 59
    iget-object p0, p0, La/zlp0;->c:Ljava/util/List;

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setCellHeaders(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast v1, Ljava/util/Collection;

    .line 88
    .line 89
    check-cast v1, Ljava/lang/Iterable;

    .line 90
    .line 91
    invoke-static {p0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/xlp0;

    .line 110
    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    instance-of v1, p1, La/ulp0;

    .line 114
    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    move-object v1, v0

    .line 118
    check-cast v1, La/eal;

    .line 119
    .line 120
    iget-object v1, v1, La/eal;->b:Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 121
    .line 122
    check-cast p1, La/ulp0;

    .line 123
    .line 124
    iget-object p1, p1, La/ulp0;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setPlayerStatistics(Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    instance-of v1, p1, La/wlp0;

    .line 131
    .line 132
    if-eqz v1, :cond_3

    .line 133
    .line 134
    move-object v1, v0

    .line 135
    check-cast v1, La/eal;

    .line 136
    .line 137
    iget-object v1, v1, La/eal;->b:Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 138
    .line 139
    check-cast p1, La/wlp0;

    .line 140
    .line 141
    iget-object p1, p1, La/wlp0;->a:La/xnp0;

    .line 142
    .line 143
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setTeam(La/xnp0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    instance-of v1, p1, La/vlp0;

    .line 148
    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    move-object v1, v0

    .line 152
    check-cast v1, La/eal;

    .line 153
    .line 154
    iget-object v1, v1, La/eal;->b:Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 155
    .line 156
    check-cast p1, La/vlp0;

    .line 157
    .line 158
    iget-object p1, p1, La/vlp0;->a:Ljava/util/List;

    .line 159
    .line 160
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setCellHeaders(Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 165
    .line 166
    .line 167
    const/4 p0, 0x0

    .line 168
    return-object p0

    .line 169
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    move-object p1, v2

    .line 21
    check-cast p1, La/a3k;

    .line 22
    .line 23
    iget-object v0, p1, La/a3k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/tjp0;

    .line 30
    .line 31
    iget-boolean v1, v1, La/tjp0;->e:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckBoxEnabledWithAlpha(Z)V

    .line 34
    .line 35
    .line 36
    check-cast v2, La/a3k;

    .line 37
    .line 38
    iget-object v0, v2, La/a3k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 39
    .line 40
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/tjp0;

    .line 45
    .line 46
    iget-boolean v1, v1, La/tjp0;->d:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckboxChecked(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p1, La/a3k;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 52
    .line 53
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, La/tjp0;

    .line 58
    .line 59
    iget-object v1, v1, La/tjp0;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 65
    .line 66
    iget-object p1, p1, La/a3k;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 67
    .line 68
    invoke-virtual {p1}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object v0, La/qzw;->b:La/qzw;

    .line 73
    .line 74
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, La/tjp0;

    .line 79
    .line 80
    iget-object v1, v1, La/tjp0;->c:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/tjp0;

    .line 87
    .line 88
    const p0, 0x7f080e00

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0, v1, p0}, La/u0d;->m(Landroid/widget/ImageView;La/qzw;Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast v2, Ljava/util/Collection;

    .line 118
    .line 119
    check-cast v2, Ljava/lang/Iterable;

    .line 120
    .line 121
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, La/sjp0;

    .line 140
    .line 141
    if-eqz p1, :cond_3

    .line 142
    .line 143
    instance-of v2, p1, La/qjp0;

    .line 144
    .line 145
    if-eqz v2, :cond_2

    .line 146
    .line 147
    move-object p1, v1

    .line 148
    check-cast p1, La/a3k;

    .line 149
    .line 150
    iget-object p1, p1, La/a3k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 151
    .line 152
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, La/tjp0;

    .line 157
    .line 158
    iget-boolean v2, v2, La/tjp0;->e:Z

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckBoxEnabledWithAlpha(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    instance-of p1, p1, La/rjp0;

    .line 165
    .line 166
    if-eqz p1, :cond_3

    .line 167
    .line 168
    move-object p1, v1

    .line 169
    check-cast p1, La/a3k;

    .line 170
    .line 171
    iget-object p1, p1, La/a3k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 172
    .line 173
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, La/tjp0;

    .line 178
    .line 179
    iget-boolean v2, v2, La/tjp0;->d:Z

    .line 180
    .line 181
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckboxChecked(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 186
    .line 187
    .line 188
    const/4 p0, 0x0

    .line 189
    return-object p0

    .line 190
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 4
    .line 5
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 17
    .line 18
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/ifx;

    .line 22
    .line 23
    iget-object v0, v0, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/x7q0;

    .line 30
    .line 31
    iget-object v1, v1, La/x7q0;->a:La/vqp;

    .line 32
    .line 33
    sget-object v2, La/c8q0;->a:[I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    aget v1, v2, v1

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-ne v1, v2, :cond_0

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    :cond_0
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setInputType(I)V

    .line 46
    .line 47
    .line 48
    check-cast p1, La/ifx;

    .line 49
    .line 50
    iget-object v0, p1, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 51
    .line 52
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La/x7q0;

    .line 57
    .line 58
    iget-object v1, v1, La/x7q0;->e:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p1, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 64
    .line 65
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/x7q0;

    .line 70
    .line 71
    iget-object v1, v1, La/x7q0;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 77
    .line 78
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/x7q0;

    .line 83
    .line 84
    iget-object p0, p0, La/x7q0;->c:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setLabelText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    check-cast v1, Ljava/util/Collection;

    .line 113
    .line 114
    check-cast v1, Ljava/lang/Iterable;

    .line 115
    .line 116
    invoke-static {p0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_6

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, La/w7q0;

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    instance-of v1, p1, La/u7q0;

    .line 139
    .line 140
    if-eqz v1, :cond_4

    .line 141
    .line 142
    move-object v1, v0

    .line 143
    check-cast v1, La/ifx;

    .line 144
    .line 145
    iget-object v1, v1, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 146
    .line 147
    check-cast p1, La/u7q0;

    .line 148
    .line 149
    iget-object p1, p1, La/u7q0;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v1, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_3

    .line 159
    .line 160
    move-object p1, v0

    .line 161
    check-cast p1, La/ifx;

    .line 162
    .line 163
    iget-object p1, p1, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 164
    .line 165
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    instance-of p1, p1, La/v7q0;

    .line 170
    .line 171
    if-eqz p1, :cond_5

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 175
    .line 176
    .line 177
    const/4 p0, 0x0

    .line 178
    return-object p0

    .line 179
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 17
    .line 18
    check-cast p1, La/ysx;

    .line 19
    .line 20
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, La/ymq0;

    .line 25
    .line 26
    iget-object v1, v1, La/ymq0;->b:La/ank0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p1, La/ysx;->b:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-lez v3, :cond_0

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v3, 0x8

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p1, La/ysx;->b:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p1, La/ysx;->c:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, La/ymq0;

    .line 59
    .line 60
    iget-object v2, v2, La/ymq0;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p1, La/ysx;->d:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, La/ymq0;

    .line 72
    .line 73
    iget-object p0, p0, La/ymq0;->c:La/ank0;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast v1, Ljava/util/Collection;

    .line 107
    .line 108
    check-cast v1, Ljava/lang/Iterable;

    .line 109
    .line 110
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/util/List;

    .line 129
    .line 130
    new-instance v1, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    instance-of v3, v2, La/jqa;

    .line 150
    .line 151
    if-eqz v3, :cond_4

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_3

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, La/jqa;

    .line 172
    .line 173
    iget-object v2, p0, La/pgj0;->c:La/cp;

    .line 174
    .line 175
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 176
    .line 177
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    instance-of v4, v1, La/hqa;

    .line 183
    .line 184
    if-eqz v4, :cond_6

    .line 185
    .line 186
    check-cast v2, La/ysx;

    .line 187
    .line 188
    iget-object v2, v2, La/ysx;->b:Landroid/widget/TextView;

    .line 189
    .line 190
    check-cast v1, La/hqa;

    .line 191
    .line 192
    iget-object v1, v1, La/hqa;->a:La/ank0;

    .line 193
    .line 194
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    instance-of v4, v1, La/iqa;

    .line 203
    .line 204
    if-eqz v4, :cond_7

    .line 205
    .line 206
    check-cast v2, La/ysx;

    .line 207
    .line 208
    iget-object v2, v2, La/ysx;->d:Landroid/widget/TextView;

    .line 209
    .line 210
    check-cast v1, La/iqa;

    .line 211
    .line 212
    iget-object v1, v1, La/iqa;->a:La/ank0;

    .line 213
    .line 214
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 223
    .line 224
    .line 225
    const/4 p0, 0x0

    .line 226
    return-object p0

    .line 227
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object p0
.end method

.method private final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/u4n0;->k(La/cp;)V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast v1, Ljava/util/Collection;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/z7s0;

    .line 63
    .line 64
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 65
    .line 66
    invoke-static {v0}, La/u4n0;->k(La/cp;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/pgj0;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/pgj0;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move-object p1, v2

    .line 23
    check-cast p1, La/is10;

    .line 24
    .line 25
    iget-object p1, p1, La/is10;->g:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/l8s0;

    .line 32
    .line 33
    iget-object v0, v0, La/l8s0;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, La/s7n0;->i(La/cp;)V

    .line 39
    .line 40
    .line 41
    move-object p1, v2

    .line 42
    check-cast p1, La/is10;

    .line 43
    .line 44
    iget-object p1, p1, La/is10;->c:Landroid/widget/ImageView;

    .line 45
    .line 46
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/l8s0;

    .line 51
    .line 52
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    move-object p1, v2

    .line 56
    check-cast p1, La/is10;

    .line 57
    .line 58
    iget-object p1, p1, La/is10;->b:Landroid/widget/ImageView;

    .line 59
    .line 60
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/l8s0;

    .line 65
    .line 66
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    move-object p1, v2

    .line 70
    check-cast p1, La/is10;

    .line 71
    .line 72
    iget-object p1, p1, La/is10;->d:Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/l8s0;

    .line 79
    .line 80
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    check-cast v2, La/is10;

    .line 84
    .line 85
    iget-object p1, v2, La/is10;->f:Landroid/widget/ImageView;

    .line 86
    .line 87
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/l8s0;

    .line 92
    .line 93
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast v2, Ljava/util/Collection;

    .line 121
    .line 122
    check-cast v2, Ljava/lang/Iterable;

    .line 123
    .line 124
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_8

    .line 137
    .line 138
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, La/k8s0;

    .line 143
    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    instance-of v2, p1, La/i8s0;

    .line 147
    .line 148
    if-eqz v2, :cond_2

    .line 149
    .line 150
    move-object p1, v1

    .line 151
    check-cast p1, La/is10;

    .line 152
    .line 153
    iget-object p1, p1, La/is10;->g:Landroid/widget/TextView;

    .line 154
    .line 155
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, La/l8s0;

    .line 160
    .line 161
    iget-object v2, v2, La/l8s0;->b:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    instance-of v2, p1, La/h8s0;

    .line 168
    .line 169
    if-eqz v2, :cond_3

    .line 170
    .line 171
    invoke-static {v0}, La/s7n0;->i(La/cp;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    instance-of v2, p1, La/j8s0;

    .line 176
    .line 177
    if-eqz v2, :cond_4

    .line 178
    .line 179
    move-object p1, v1

    .line 180
    check-cast p1, La/is10;

    .line 181
    .line 182
    iget-object p1, p1, La/is10;->c:Landroid/widget/ImageView;

    .line 183
    .line 184
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, La/l8s0;

    .line 189
    .line 190
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_4
    instance-of v2, p1, La/e8s0;

    .line 195
    .line 196
    if-eqz v2, :cond_5

    .line 197
    .line 198
    move-object p1, v1

    .line 199
    check-cast p1, La/is10;

    .line 200
    .line 201
    iget-object p1, p1, La/is10;->b:Landroid/widget/ImageView;

    .line 202
    .line 203
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, La/l8s0;

    .line 208
    .line 209
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    instance-of v2, p1, La/f8s0;

    .line 214
    .line 215
    if-eqz v2, :cond_6

    .line 216
    .line 217
    move-object p1, v1

    .line 218
    check-cast p1, La/is10;

    .line 219
    .line 220
    iget-object p1, p1, La/is10;->d:Landroid/widget/ImageView;

    .line 221
    .line 222
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, La/l8s0;

    .line 227
    .line 228
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_6
    instance-of p1, p1, La/g8s0;

    .line 233
    .line 234
    if-eqz p1, :cond_7

    .line 235
    .line 236
    move-object p1, v1

    .line 237
    check-cast p1, La/is10;

    .line 238
    .line 239
    iget-object p1, p1, La/is10;->f:Landroid/widget/ImageView;

    .line 240
    .line 241
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    check-cast v2, La/l8s0;

    .line 246
    .line 247
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 252
    .line 253
    .line 254
    const/4 p0, 0x0

    .line 255
    return-object p0

    .line 256
    :cond_8
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pgj0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v5, 0x1

    .line 9
    const/16 v6, 0x8

    .line 10
    .line 11
    const/16 v7, 0x3e

    .line 12
    .line 13
    const v8, 0x7f0706a3

    .line 14
    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v10, v0, La/pgj0;->c:La/cp;

    .line 18
    .line 19
    iget-object v11, v0, La/pgj0;->b:La/cp;

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_7

    .line 37
    .line 38
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/k1v0;

    .line 43
    .line 44
    iget-object v1, v11, La/cp;->u:La/yfu0;

    .line 45
    .line 46
    check-cast v1, La/zsx;

    .line 47
    .line 48
    iget-object v2, v1, La/zsx;->h:Landroid/widget/TextView;

    .line 49
    .line 50
    iget-object v3, v0, La/k1v0;->a:Ljava/lang/String;

    .line 51
    .line 52
    iget-boolean v4, v0, La/k1v0;->j:Z

    .line 53
    .line 54
    iget-boolean v5, v0, La/k1v0;->h:Z

    .line 55
    .line 56
    iget-boolean v7, v0, La/k1v0;->f:Z

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v1, La/zsx;->d:Landroidx/constraintlayout/helper/widget/Flow;

    .line 62
    .line 63
    iget-boolean v3, v0, La/k1v0;->d:Z

    .line 64
    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    move v8, v9

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v8, v6

    .line 70
    :goto_0
    invoke-virtual {v2, v8}, La/yru0;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v1, La/zsx;->f:Landroid/widget/ImageView;

    .line 74
    .line 75
    iget v8, v0, La/k1v0;->b:I

    .line 76
    .line 77
    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 78
    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    iget-object v2, v1, La/zsx;->j:Landroid/widget/TextView;

    .line 83
    .line 84
    iget-object v3, v0, La/k1v0;->c:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    iget-object v2, v1, La/zsx;->e:Landroidx/constraintlayout/helper/widget/Flow;

    .line 90
    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    move v3, v9

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move v3, v6

    .line 96
    :goto_1
    invoke-virtual {v2, v3}, La/yru0;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    if-eqz v7, :cond_3

    .line 100
    .line 101
    iget-object v2, v1, La/zsx;->k:Landroid/widget/TextView;

    .line 102
    .line 103
    iget-object v3, v0, La/k1v0;->e:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object v2, v1, La/zsx;->c:Landroidx/constraintlayout/helper/widget/Flow;

    .line 109
    .line 110
    if-eqz v5, :cond_4

    .line 111
    .line 112
    move v3, v9

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move v3, v6

    .line 115
    :goto_2
    invoke-virtual {v2, v3}, La/yru0;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    iget-object v2, v1, La/zsx;->i:Landroid/widget/TextView;

    .line 121
    .line 122
    iget-object v3, v0, La/k1v0;->g:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    iget-object v2, v1, La/zsx;->b:Landroidx/constraintlayout/helper/widget/Flow;

    .line 128
    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    move v6, v9

    .line 132
    :cond_6
    invoke-virtual {v2, v6}, La/yru0;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    if-eqz v4, :cond_19

    .line 136
    .line 137
    iget-object v1, v1, La/zsx;->g:Landroid/widget/TextView;

    .line 138
    .line 139
    iget-object v0, v0, La/k1v0;->i:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_a

    .line 145
    .line 146
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_8

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    check-cast v2, Ljava/util/Collection;

    .line 169
    .line 170
    check-cast v2, Ljava/lang/Iterable;

    .line 171
    .line 172
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_19

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Ljava/util/List;

    .line 191
    .line 192
    new-instance v2, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :cond_a
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_b

    .line 206
    .line 207
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    instance-of v4, v3, La/tqa;

    .line 212
    .line 213
    if-eqz v4, :cond_a

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_9

    .line 228
    .line 229
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    check-cast v2, La/tqa;

    .line 234
    .line 235
    iget-object v3, v10, La/cp;->u:La/yfu0;

    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    instance-of v4, v2, La/oqa;

    .line 241
    .line 242
    if-eqz v4, :cond_c

    .line 243
    .line 244
    check-cast v3, La/zsx;

    .line 245
    .line 246
    iget-object v3, v3, La/zsx;->j:Landroid/widget/TextView;

    .line 247
    .line 248
    check-cast v2, La/oqa;

    .line 249
    .line 250
    iget-object v2, v2, La/oqa;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_c
    instance-of v4, v2, La/rqa;

    .line 257
    .line 258
    if-eqz v4, :cond_d

    .line 259
    .line 260
    check-cast v3, La/zsx;

    .line 261
    .line 262
    iget-object v3, v3, La/zsx;->k:Landroid/widget/TextView;

    .line 263
    .line 264
    check-cast v2, La/rqa;

    .line 265
    .line 266
    iget-object v2, v2, La/rqa;->a:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_d
    instance-of v4, v2, La/mqa;

    .line 273
    .line 274
    if-eqz v4, :cond_e

    .line 275
    .line 276
    check-cast v3, La/zsx;

    .line 277
    .line 278
    iget-object v3, v3, La/zsx;->i:Landroid/widget/TextView;

    .line 279
    .line 280
    check-cast v2, La/mqa;

    .line 281
    .line 282
    iget-object v2, v2, La/mqa;->a:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_e
    instance-of v4, v2, La/kqa;

    .line 289
    .line 290
    if-eqz v4, :cond_f

    .line 291
    .line 292
    check-cast v3, La/zsx;

    .line 293
    .line 294
    iget-object v3, v3, La/zsx;->g:Landroid/widget/TextView;

    .line 295
    .line 296
    check-cast v2, La/kqa;

    .line 297
    .line 298
    iget-object v2, v2, La/kqa;->a:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_f
    instance-of v4, v2, La/lqa;

    .line 305
    .line 306
    if-eqz v4, :cond_11

    .line 307
    .line 308
    check-cast v3, La/zsx;

    .line 309
    .line 310
    iget-object v3, v3, La/zsx;->b:Landroidx/constraintlayout/helper/widget/Flow;

    .line 311
    .line 312
    check-cast v2, La/lqa;

    .line 313
    .line 314
    iget-boolean v2, v2, La/lqa;->a:Z

    .line 315
    .line 316
    if-eqz v2, :cond_10

    .line 317
    .line 318
    move v2, v9

    .line 319
    goto :goto_6

    .line 320
    :cond_10
    move v2, v6

    .line 321
    :goto_6
    invoke-virtual {v3, v2}, La/yru0;->setVisibility(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_11
    instance-of v4, v2, La/nqa;

    .line 326
    .line 327
    if-eqz v4, :cond_13

    .line 328
    .line 329
    check-cast v3, La/zsx;

    .line 330
    .line 331
    iget-object v3, v3, La/zsx;->c:Landroidx/constraintlayout/helper/widget/Flow;

    .line 332
    .line 333
    check-cast v2, La/nqa;

    .line 334
    .line 335
    iget-boolean v2, v2, La/nqa;->a:Z

    .line 336
    .line 337
    if-eqz v2, :cond_12

    .line 338
    .line 339
    move v2, v9

    .line 340
    goto :goto_7

    .line 341
    :cond_12
    move v2, v6

    .line 342
    :goto_7
    invoke-virtual {v3, v2}, La/yru0;->setVisibility(I)V

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_13
    instance-of v4, v2, La/pqa;

    .line 347
    .line 348
    if-eqz v4, :cond_15

    .line 349
    .line 350
    check-cast v3, La/zsx;

    .line 351
    .line 352
    iget-object v3, v3, La/zsx;->d:Landroidx/constraintlayout/helper/widget/Flow;

    .line 353
    .line 354
    check-cast v2, La/pqa;

    .line 355
    .line 356
    iget-boolean v2, v2, La/pqa;->a:Z

    .line 357
    .line 358
    if-eqz v2, :cond_14

    .line 359
    .line 360
    move v2, v9

    .line 361
    goto :goto_8

    .line 362
    :cond_14
    move v2, v6

    .line 363
    :goto_8
    invoke-virtual {v3, v2}, La/yru0;->setVisibility(I)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_5

    .line 367
    .line 368
    :cond_15
    instance-of v4, v2, La/sqa;

    .line 369
    .line 370
    if-eqz v4, :cond_17

    .line 371
    .line 372
    check-cast v3, La/zsx;

    .line 373
    .line 374
    iget-object v3, v3, La/zsx;->e:Landroidx/constraintlayout/helper/widget/Flow;

    .line 375
    .line 376
    check-cast v2, La/sqa;

    .line 377
    .line 378
    iget-boolean v2, v2, La/sqa;->a:Z

    .line 379
    .line 380
    if-eqz v2, :cond_16

    .line 381
    .line 382
    move v2, v9

    .line 383
    goto :goto_9

    .line 384
    :cond_16
    move v2, v6

    .line 385
    :goto_9
    invoke-virtual {v3, v2}, La/yru0;->setVisibility(I)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_5

    .line 389
    .line 390
    :cond_17
    instance-of v4, v2, La/qqa;

    .line 391
    .line 392
    if-eqz v4, :cond_18

    .line 393
    .line 394
    check-cast v3, La/zsx;

    .line 395
    .line 396
    iget-object v3, v3, La/zsx;->f:Landroid/widget/ImageView;

    .line 397
    .line 398
    check-cast v2, La/qqa;

    .line 399
    .line 400
    iget v2, v2, La/qqa;->a:I

    .line 401
    .line 402
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_5

    .line 406
    .line 407
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 408
    .line 409
    .line 410
    goto :goto_b

    .line 411
    :cond_19
    :goto_a
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    :goto_b
    return-object v12

    .line 414
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/pgj0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    return-object v0

    .line 419
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/pgj0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    return-object v0

    .line 424
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/pgj0;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    return-object v0

    .line 429
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/pgj0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    return-object v0

    .line 434
    :pswitch_4
    move-object/from16 v0, p1

    .line 435
    .line 436
    check-cast v0, Ljava/util/List;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-eqz v1, :cond_1a

    .line 446
    .line 447
    iget-object v0, v11, La/cp;->u:La/yfu0;

    .line 448
    .line 449
    check-cast v0, La/es6;

    .line 450
    .line 451
    iget-object v0, v0, La/es6;->b:Landroid/widget/ImageView;

    .line 452
    .line 453
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    check-cast v1, La/npp0;

    .line 458
    .line 459
    iget v1, v1, La/npp0;->a:F

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Landroid/view/View;->setRotation(F)V

    .line 462
    .line 463
    .line 464
    goto :goto_e

    .line 465
    :cond_1a
    new-instance v1, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_1b

    .line 479
    .line 480
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    check-cast v2, Ljava/util/Collection;

    .line 488
    .line 489
    check-cast v2, Ljava/lang/Iterable;

    .line 490
    .line 491
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 492
    .line 493
    .line 494
    goto :goto_c

    .line 495
    :cond_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-eqz v1, :cond_1d

    .line 504
    .line 505
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    check-cast v1, La/mpp0;

    .line 510
    .line 511
    if-eqz v1, :cond_1c

    .line 512
    .line 513
    iget-object v1, v10, La/cp;->u:La/yfu0;

    .line 514
    .line 515
    check-cast v1, La/es6;

    .line 516
    .line 517
    iget-object v1, v1, La/es6;->b:Landroid/widget/ImageView;

    .line 518
    .line 519
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    check-cast v2, La/npp0;

    .line 524
    .line 525
    iget v2, v2, La/npp0;->a:F

    .line 526
    .line 527
    new-array v3, v5, [F

    .line 528
    .line 529
    aput v2, v3, v9

    .line 530
    .line 531
    const-string v2, "rotation"

    .line 532
    .line 533
    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    const-wide/16 v2, 0x12c

    .line 538
    .line 539
    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 543
    .line 544
    .line 545
    goto :goto_d

    .line 546
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 547
    .line 548
    .line 549
    goto :goto_f

    .line 550
    :cond_1d
    :goto_e
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    :goto_f
    return-object v12

    .line 553
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/pgj0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    return-object v0

    .line 558
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/pgj0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    return-object v0

    .line 563
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/pgj0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    return-object v0

    .line 568
    :pswitch_8
    invoke-direct/range {p0 .. p1}, La/pgj0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    return-object v0

    .line 573
    :pswitch_9
    invoke-direct/range {p0 .. p1}, La/pgj0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    return-object v0

    .line 578
    :pswitch_a
    invoke-direct/range {p0 .. p1}, La/pgj0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    return-object v0

    .line 583
    :pswitch_b
    invoke-direct/range {p0 .. p1}, La/pgj0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    return-object v0

    .line 588
    :pswitch_c
    move-object/from16 v0, p1

    .line 589
    .line 590
    check-cast v0, Ljava/util/List;

    .line 591
    .line 592
    iget-object v1, v10, La/cp;->w:Landroid/content/Context;

    .line 593
    .line 594
    iget-object v2, v10, La/cp;->u:La/yfu0;

    .line 595
    .line 596
    iget-object v6, v11, La/cp;->w:Landroid/content/Context;

    .line 597
    .line 598
    iget-object v13, v11, La/cp;->u:La/yfu0;

    .line 599
    .line 600
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    move-result v14

    .line 607
    if-eqz v14, :cond_20

    .line 608
    .line 609
    move-object v0, v13

    .line 610
    check-cast v0, La/ktn0;

    .line 611
    .line 612
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, La/stn0;

    .line 617
    .line 618
    iget-boolean v1, v1, La/stn0;->u:Z

    .line 619
    .line 620
    if-eqz v1, :cond_1e

    .line 621
    .line 622
    iget-object v1, v0, La/ktn0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 623
    .line 624
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 625
    .line 626
    .line 627
    iget-object v1, v0, La/ktn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 628
    .line 629
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 630
    .line 631
    .line 632
    iget-object v1, v0, La/ktn0;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 633
    .line 634
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 635
    .line 636
    .line 637
    iget-object v1, v0, La/ktn0;->h:Landroid/widget/TextView;

    .line 638
    .line 639
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 640
    .line 641
    .line 642
    iget-object v1, v0, La/ktn0;->o:Landroid/widget/TextView;

    .line 643
    .line 644
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 645
    .line 646
    .line 647
    goto :goto_10

    .line 648
    :cond_1e
    iget-object v1, v0, La/ktn0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 649
    .line 650
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 651
    .line 652
    .line 653
    iget-object v1, v0, La/ktn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 654
    .line 655
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 656
    .line 657
    .line 658
    iget-object v1, v0, La/ktn0;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 659
    .line 660
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 661
    .line 662
    .line 663
    iget-object v1, v0, La/ktn0;->h:Landroid/widget/TextView;

    .line 664
    .line 665
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 666
    .line 667
    .line 668
    iget-object v1, v0, La/ktn0;->o:Landroid/widget/TextView;

    .line 669
    .line 670
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 671
    .line 672
    .line 673
    :goto_10
    iget-object v1, v0, La/ktn0;->e:Landroid/widget/TextView;

    .line 674
    .line 675
    iget-object v2, v0, La/ktn0;->f:Landroid/widget/TextView;

    .line 676
    .line 677
    iget-object v3, v0, La/ktn0;->o:Landroid/widget/TextView;

    .line 678
    .line 679
    iget-object v10, v0, La/ktn0;->h:Landroid/widget/TextView;

    .line 680
    .line 681
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v14

    .line 685
    check-cast v14, La/stn0;

    .line 686
    .line 687
    iget-object v14, v14, La/stn0;->b:Ljava/lang/String;

    .line 688
    .line 689
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 690
    .line 691
    .line 692
    iget-object v1, v0, La/ktn0;->r:Landroid/widget/TextView;

    .line 693
    .line 694
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v14

    .line 698
    check-cast v14, La/stn0;

    .line 699
    .line 700
    iget-object v14, v14, La/stn0;->c:Ljava/lang/String;

    .line 701
    .line 702
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 703
    .line 704
    .line 705
    move-object v1, v13

    .line 706
    check-cast v1, La/ktn0;

    .line 707
    .line 708
    sget-object v14, La/u0d;->a:Ljava/util/List;

    .line 709
    .line 710
    iget-object v15, v11, La/cp;->w:Landroid/content/Context;

    .line 711
    .line 712
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v14

    .line 716
    check-cast v14, La/stn0;

    .line 717
    .line 718
    iget-object v14, v14, La/stn0;->d:Ljava/lang/String;

    .line 719
    .line 720
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 725
    .line 726
    .line 727
    move-result v4

    .line 728
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 729
    .line 730
    .line 731
    move-result-object v17

    .line 732
    new-instance v4, La/ttn0;

    .line 733
    .line 734
    invoke-direct {v4, v1, v9}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 735
    .line 736
    .line 737
    new-instance v8, La/itn0;

    .line 738
    .line 739
    invoke-direct {v8, v1, v11, v5}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 740
    .line 741
    .line 742
    const/16 v22, 0xc

    .line 743
    .line 744
    const/16 v18, 0x0

    .line 745
    .line 746
    const/16 v19, 0x0

    .line 747
    .line 748
    move-object/from16 v20, v4

    .line 749
    .line 750
    move-object/from16 v21, v8

    .line 751
    .line 752
    move-object/from16 v16, v14

    .line 753
    .line 754
    invoke-static/range {v15 .. v22}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    check-cast v4, La/stn0;

    .line 765
    .line 766
    iget-object v4, v4, La/stn0;->h:Ljava/lang/String;

    .line 767
    .line 768
    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v4

    .line 778
    check-cast v4, La/stn0;

    .line 779
    .line 780
    iget-object v4, v4, La/stn0;->i:Ljava/lang/String;

    .line 781
    .line 782
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 783
    .line 784
    .line 785
    iget-object v14, v0, La/ktn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 786
    .line 787
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    check-cast v3, La/stn0;

    .line 792
    .line 793
    iget-object v15, v3, La/stn0;->f:Ljava/lang/String;

    .line 794
    .line 795
    const/16 v20, 0x0

    .line 796
    .line 797
    const/16 v21, 0x1fc

    .line 798
    .line 799
    const v16, 0x7f080dfe

    .line 800
    .line 801
    .line 802
    const/16 v17, 0x0

    .line 803
    .line 804
    invoke-static/range {v14 .. v21}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 805
    .line 806
    .line 807
    iget-object v3, v0, La/ktn0;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 808
    .line 809
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    check-cast v4, La/stn0;

    .line 814
    .line 815
    iget-object v4, v4, La/stn0;->g:Ljava/lang/String;

    .line 816
    .line 817
    const/16 v29, 0x0

    .line 818
    .line 819
    const/16 v30, 0x1fc

    .line 820
    .line 821
    const v25, 0x7f080dfe

    .line 822
    .line 823
    .line 824
    const/16 v26, 0x0

    .line 825
    .line 826
    const/16 v27, 0x0

    .line 827
    .line 828
    const/16 v28, 0x0

    .line 829
    .line 830
    move-object/from16 v23, v3

    .line 831
    .line 832
    move-object/from16 v24, v4

    .line 833
    .line 834
    invoke-static/range {v23 .. v30}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 835
    .line 836
    .line 837
    iget-object v3, v0, La/ktn0;->j:Landroid/widget/TextView;

    .line 838
    .line 839
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    check-cast v4, La/stn0;

    .line 844
    .line 845
    iget-object v4, v4, La/stn0;->l:Ljava/lang/String;

    .line 846
    .line 847
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v3

    .line 854
    check-cast v3, La/stn0;

    .line 855
    .line 856
    iget-object v3, v3, La/stn0;->n:Ljava/lang/String;

    .line 857
    .line 858
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 859
    .line 860
    .line 861
    sget-object v3, La/fzc;->a:La/kj5;

    .line 862
    .line 863
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v4

    .line 867
    check-cast v4, La/stn0;

    .line 868
    .line 869
    iget-object v4, v4, La/stn0;->t:La/fzc;

    .line 870
    .line 871
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    invoke-static {v4, v6}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 875
    .line 876
    .line 877
    move-result v3

    .line 878
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 879
    .line 880
    .line 881
    iget-object v0, v0, La/ktn0;->m:Landroid/widget/TextView;

    .line 882
    .line 883
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    check-cast v2, La/stn0;

    .line 888
    .line 889
    iget-object v2, v2, La/stn0;->o:Ljava/lang/String;

    .line 890
    .line 891
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 892
    .line 893
    .line 894
    iget-object v0, v1, La/ktn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 895
    .line 896
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 897
    .line 898
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 899
    .line 900
    .line 901
    iget-object v0, v1, La/ktn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 902
    .line 903
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    check-cast v2, La/stn0;

    .line 908
    .line 909
    iget-object v2, v2, La/stn0;->s:Ljava/lang/String;

    .line 910
    .line 911
    invoke-static {v0, v2, v12, v12, v7}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 912
    .line 913
    .line 914
    iget-object v0, v1, La/ktn0;->k:Landroid/widget/TextView;

    .line 915
    .line 916
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    check-cast v2, La/stn0;

    .line 921
    .line 922
    iget-object v2, v2, La/stn0;->j:Ljava/lang/String;

    .line 923
    .line 924
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 925
    .line 926
    .line 927
    iget-object v0, v1, La/ktn0;->l:Landroid/widget/TextView;

    .line 928
    .line 929
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    check-cast v1, La/stn0;

    .line 934
    .line 935
    iget-object v1, v1, La/stn0;->k:Ljava/lang/String;

    .line 936
    .line 937
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    check-cast v0, La/stn0;

    .line 945
    .line 946
    iget-object v0, v0, La/stn0;->q:La/qtn0;

    .line 947
    .line 948
    invoke-static {v11, v0}, La/dnm0;->j(La/cp;La/qtn0;)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    check-cast v0, La/stn0;

    .line 956
    .line 957
    iget-object v0, v0, La/stn0;->p:Ljava/lang/String;

    .line 958
    .line 959
    invoke-static {v11, v0}, La/dnm0;->i(La/cp;Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    check-cast v0, La/stn0;

    .line 967
    .line 968
    iget-object v0, v0, La/stn0;->r:Ljava/lang/String;

    .line 969
    .line 970
    check-cast v13, La/ktn0;

    .line 971
    .line 972
    iget-object v1, v13, La/ktn0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 973
    .line 974
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 975
    .line 976
    .line 977
    move-result v2

    .line 978
    if-nez v2, :cond_1f

    .line 979
    .line 980
    const v2, 0x7f1317d3

    .line 981
    .line 982
    .line 983
    invoke-virtual {v6, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    :cond_1f
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 988
    .line 989
    .line 990
    goto/16 :goto_13

    .line 991
    .line 992
    :cond_20
    new-instance v3, Ljava/util/ArrayList;

    .line 993
    .line 994
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 995
    .line 996
    .line 997
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1002
    .line 1003
    .line 1004
    move-result v4

    .line 1005
    if-eqz v4, :cond_21

    .line 1006
    .line 1007
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    check-cast v4, Ljava/util/Collection;

    .line 1015
    .line 1016
    check-cast v4, Ljava/lang/Iterable;

    .line 1017
    .line 1018
    invoke-static {v3, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_11

    .line 1022
    :cond_21
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v3

    .line 1030
    if-eqz v3, :cond_29

    .line 1031
    .line 1032
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v3

    .line 1036
    check-cast v3, La/rtn0;

    .line 1037
    .line 1038
    if-eqz v3, :cond_28

    .line 1039
    .line 1040
    instance-of v4, v3, La/ltn0;

    .line 1041
    .line 1042
    if-eqz v4, :cond_22

    .line 1043
    .line 1044
    move-object v4, v2

    .line 1045
    check-cast v4, La/ktn0;

    .line 1046
    .line 1047
    iget-object v4, v4, La/ktn0;->f:Landroid/widget/TextView;

    .line 1048
    .line 1049
    check-cast v3, La/ltn0;

    .line 1050
    .line 1051
    iget-object v3, v3, La/ltn0;->a:Ljava/lang/String;

    .line 1052
    .line 1053
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1054
    .line 1055
    .line 1056
    goto :goto_12

    .line 1057
    :cond_22
    instance-of v4, v3, La/otn0;

    .line 1058
    .line 1059
    if-eqz v4, :cond_23

    .line 1060
    .line 1061
    move-object v4, v2

    .line 1062
    check-cast v4, La/ktn0;

    .line 1063
    .line 1064
    iget-object v4, v4, La/ktn0;->m:Landroid/widget/TextView;

    .line 1065
    .line 1066
    check-cast v3, La/otn0;

    .line 1067
    .line 1068
    iget-object v3, v3, La/otn0;->a:Ljava/lang/String;

    .line 1069
    .line 1070
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1071
    .line 1072
    .line 1073
    goto :goto_12

    .line 1074
    :cond_23
    instance-of v4, v3, La/ntn0;

    .line 1075
    .line 1076
    if-eqz v4, :cond_24

    .line 1077
    .line 1078
    check-cast v3, La/ntn0;

    .line 1079
    .line 1080
    iget-object v3, v3, La/ntn0;->a:Ljava/lang/String;

    .line 1081
    .line 1082
    invoke-static {v10, v3}, La/dnm0;->i(La/cp;Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_12

    .line 1086
    :cond_24
    instance-of v4, v3, La/qtn0;

    .line 1087
    .line 1088
    if-eqz v4, :cond_25

    .line 1089
    .line 1090
    check-cast v3, La/qtn0;

    .line 1091
    .line 1092
    invoke-static {v10, v3}, La/dnm0;->j(La/cp;La/qtn0;)V

    .line 1093
    .line 1094
    .line 1095
    goto :goto_12

    .line 1096
    :cond_25
    instance-of v4, v3, La/ptn0;

    .line 1097
    .line 1098
    if-eqz v4, :cond_27

    .line 1099
    .line 1100
    check-cast v3, La/ptn0;

    .line 1101
    .line 1102
    iget-object v3, v3, La/ptn0;->a:Ljava/lang/String;

    .line 1103
    .line 1104
    move-object v4, v2

    .line 1105
    check-cast v4, La/ktn0;

    .line 1106
    .line 1107
    iget-object v4, v4, La/ktn0;->t:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 1108
    .line 1109
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1110
    .line 1111
    .line 1112
    move-result v5

    .line 1113
    if-nez v5, :cond_26

    .line 1114
    .line 1115
    const v5, 0x7f1317d3

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v3

    .line 1122
    :cond_26
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_12

    .line 1126
    :cond_27
    instance-of v4, v3, La/mtn0;

    .line 1127
    .line 1128
    if-eqz v4, :cond_28

    .line 1129
    .line 1130
    move-object v4, v2

    .line 1131
    check-cast v4, La/ktn0;

    .line 1132
    .line 1133
    iget-object v4, v4, La/ktn0;->f:Landroid/widget/TextView;

    .line 1134
    .line 1135
    sget-object v5, La/fzc;->a:La/kj5;

    .line 1136
    .line 1137
    check-cast v3, La/mtn0;

    .line 1138
    .line 1139
    iget-object v3, v3, La/mtn0;->a:La/fzc;

    .line 1140
    .line 1141
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v3, v1}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 1145
    .line 1146
    .line 1147
    move-result v3

    .line 1148
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1149
    .line 1150
    .line 1151
    goto :goto_12

    .line 1152
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 1153
    .line 1154
    .line 1155
    goto :goto_14

    .line 1156
    :cond_29
    :goto_13
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1157
    .line 1158
    :goto_14
    return-object v12

    .line 1159
    :pswitch_d
    move-object/from16 v0, p1

    .line 1160
    .line 1161
    check-cast v0, Ljava/util/List;

    .line 1162
    .line 1163
    iget-object v1, v10, La/cp;->u:La/yfu0;

    .line 1164
    .line 1165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1169
    .line 1170
    .line 1171
    move-result v3

    .line 1172
    if-eqz v3, :cond_2a

    .line 1173
    .line 1174
    iget-object v0, v11, La/cp;->u:La/yfu0;

    .line 1175
    .line 1176
    iget-object v1, v11, La/cp;->w:Landroid/content/Context;

    .line 1177
    .line 1178
    move-object v3, v0

    .line 1179
    check-cast v3, La/jtn0;

    .line 1180
    .line 1181
    iget-object v4, v3, La/jtn0;->e:Landroid/widget/TextView;

    .line 1182
    .line 1183
    iget-object v5, v3, La/jtn0;->f:Landroid/widget/TextView;

    .line 1184
    .line 1185
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v6

    .line 1189
    check-cast v6, La/htn0;

    .line 1190
    .line 1191
    iget-object v6, v6, La/htn0;->b:Ljava/lang/String;

    .line 1192
    .line 1193
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1194
    .line 1195
    .line 1196
    iget-object v4, v3, La/jtn0;->m:Landroid/widget/TextView;

    .line 1197
    .line 1198
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v6

    .line 1202
    check-cast v6, La/htn0;

    .line 1203
    .line 1204
    iget-object v6, v6, La/htn0;->c:Ljava/lang/String;

    .line 1205
    .line 1206
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1207
    .line 1208
    .line 1209
    check-cast v0, La/jtn0;

    .line 1210
    .line 1211
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 1212
    .line 1213
    iget-object v13, v11, La/cp;->w:Landroid/content/Context;

    .line 1214
    .line 1215
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v4

    .line 1219
    check-cast v4, La/htn0;

    .line 1220
    .line 1221
    iget-object v14, v4, La/htn0;->d:Ljava/lang/String;

    .line 1222
    .line 1223
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v4

    .line 1227
    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1228
    .line 1229
    .line 1230
    move-result v4

    .line 1231
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v15

    .line 1235
    new-instance v4, La/j1l0;

    .line 1236
    .line 1237
    invoke-direct {v4, v0, v2}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 1238
    .line 1239
    .line 1240
    new-instance v2, La/itn0;

    .line 1241
    .line 1242
    invoke-direct {v2, v0, v11, v9}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1243
    .line 1244
    .line 1245
    const/16 v20, 0xc

    .line 1246
    .line 1247
    const/16 v16, 0x0

    .line 1248
    .line 1249
    const/16 v17, 0x0

    .line 1250
    .line 1251
    move-object/from16 v19, v2

    .line 1252
    .line 1253
    move-object/from16 v18, v4

    .line 1254
    .line 1255
    invoke-static/range {v13 .. v20}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1256
    .line 1257
    .line 1258
    iget-object v2, v3, La/jtn0;->o:Landroid/widget/TextView;

    .line 1259
    .line 1260
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v4

    .line 1264
    check-cast v4, La/htn0;

    .line 1265
    .line 1266
    iget-object v4, v4, La/htn0;->f:Ljava/lang/String;

    .line 1267
    .line 1268
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1269
    .line 1270
    .line 1271
    iget-object v2, v3, La/jtn0;->g:Landroid/widget/TextView;

    .line 1272
    .line 1273
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v4

    .line 1277
    check-cast v4, La/htn0;

    .line 1278
    .line 1279
    iget-object v4, v4, La/htn0;->i:Ljava/lang/String;

    .line 1280
    .line 1281
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    check-cast v2, La/htn0;

    .line 1289
    .line 1290
    iget-object v2, v2, La/htn0;->k:Ljava/lang/String;

    .line 1291
    .line 1292
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1293
    .line 1294
    .line 1295
    sget-object v2, La/fzc;->a:La/kj5;

    .line 1296
    .line 1297
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v4

    .line 1301
    check-cast v4, La/htn0;

    .line 1302
    .line 1303
    iget-object v4, v4, La/htn0;->o:La/fzc;

    .line 1304
    .line 1305
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1306
    .line 1307
    .line 1308
    invoke-static {v4, v1}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 1309
    .line 1310
    .line 1311
    move-result v1

    .line 1312
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1313
    .line 1314
    .line 1315
    iget-object v1, v3, La/jtn0;->j:Landroid/widget/TextView;

    .line 1316
    .line 1317
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    check-cast v2, La/htn0;

    .line 1322
    .line 1323
    iget-object v2, v2, La/htn0;->l:Ljava/lang/String;

    .line 1324
    .line 1325
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1326
    .line 1327
    .line 1328
    iget-object v1, v0, La/jtn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1329
    .line 1330
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1331
    .line 1332
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1333
    .line 1334
    .line 1335
    iget-object v1, v0, La/jtn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1336
    .line 1337
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    check-cast v2, La/htn0;

    .line 1342
    .line 1343
    iget-object v2, v2, La/htn0;->m:Ljava/lang/String;

    .line 1344
    .line 1345
    invoke-static {v1, v2, v12, v12, v7}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    check-cast v1, La/htn0;

    .line 1353
    .line 1354
    iget-object v1, v1, La/htn0;->n:La/ftn0;

    .line 1355
    .line 1356
    invoke-static {v11, v1}, La/qim0;->j(La/cp;La/ftn0;)V

    .line 1357
    .line 1358
    .line 1359
    iget-object v1, v0, La/jtn0;->h:Landroid/widget/TextView;

    .line 1360
    .line 1361
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v2

    .line 1365
    check-cast v2, La/htn0;

    .line 1366
    .line 1367
    iget-object v2, v2, La/htn0;->g:Ljava/lang/String;

    .line 1368
    .line 1369
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1370
    .line 1371
    .line 1372
    iget-object v0, v0, La/jtn0;->i:Landroid/widget/TextView;

    .line 1373
    .line 1374
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v1

    .line 1378
    check-cast v1, La/htn0;

    .line 1379
    .line 1380
    iget-object v1, v1, La/htn0;->h:Ljava/lang/String;

    .line 1381
    .line 1382
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1383
    .line 1384
    .line 1385
    goto/16 :goto_17

    .line 1386
    .line 1387
    :cond_2a
    new-instance v2, Ljava/util/ArrayList;

    .line 1388
    .line 1389
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1390
    .line 1391
    .line 1392
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1397
    .line 1398
    .line 1399
    move-result v3

    .line 1400
    if-eqz v3, :cond_2b

    .line 1401
    .line 1402
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v3

    .line 1406
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1407
    .line 1408
    .line 1409
    check-cast v3, Ljava/util/Collection;

    .line 1410
    .line 1411
    check-cast v3, Ljava/lang/Iterable;

    .line 1412
    .line 1413
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1414
    .line 1415
    .line 1416
    goto :goto_15

    .line 1417
    :cond_2b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v2

    .line 1425
    if-eqz v2, :cond_30

    .line 1426
    .line 1427
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v2

    .line 1431
    check-cast v2, La/gtn0;

    .line 1432
    .line 1433
    if-eqz v2, :cond_2f

    .line 1434
    .line 1435
    instance-of v3, v2, La/ctn0;

    .line 1436
    .line 1437
    if-eqz v3, :cond_2c

    .line 1438
    .line 1439
    move-object v3, v1

    .line 1440
    check-cast v3, La/jtn0;

    .line 1441
    .line 1442
    iget-object v3, v3, La/jtn0;->f:Landroid/widget/TextView;

    .line 1443
    .line 1444
    check-cast v2, La/ctn0;

    .line 1445
    .line 1446
    iget-object v2, v2, La/ctn0;->a:Ljava/lang/String;

    .line 1447
    .line 1448
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1449
    .line 1450
    .line 1451
    goto :goto_16

    .line 1452
    :cond_2c
    instance-of v3, v2, La/etn0;

    .line 1453
    .line 1454
    if-eqz v3, :cond_2d

    .line 1455
    .line 1456
    move-object v3, v1

    .line 1457
    check-cast v3, La/jtn0;

    .line 1458
    .line 1459
    iget-object v3, v3, La/jtn0;->j:Landroid/widget/TextView;

    .line 1460
    .line 1461
    check-cast v2, La/etn0;

    .line 1462
    .line 1463
    iget-object v2, v2, La/etn0;->a:Ljava/lang/String;

    .line 1464
    .line 1465
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1466
    .line 1467
    .line 1468
    goto :goto_16

    .line 1469
    :cond_2d
    instance-of v3, v2, La/ftn0;

    .line 1470
    .line 1471
    if-eqz v3, :cond_2e

    .line 1472
    .line 1473
    check-cast v2, La/ftn0;

    .line 1474
    .line 1475
    invoke-static {v10, v2}, La/qim0;->j(La/cp;La/ftn0;)V

    .line 1476
    .line 1477
    .line 1478
    goto :goto_16

    .line 1479
    :cond_2e
    instance-of v3, v2, La/dtn0;

    .line 1480
    .line 1481
    if-eqz v3, :cond_2f

    .line 1482
    .line 1483
    move-object v3, v1

    .line 1484
    check-cast v3, La/jtn0;

    .line 1485
    .line 1486
    iget-object v3, v3, La/jtn0;->f:Landroid/widget/TextView;

    .line 1487
    .line 1488
    sget-object v4, La/fzc;->a:La/kj5;

    .line 1489
    .line 1490
    check-cast v2, La/dtn0;

    .line 1491
    .line 1492
    iget-object v2, v2, La/dtn0;->a:La/fzc;

    .line 1493
    .line 1494
    iget-object v5, v10, La/cp;->w:Landroid/content/Context;

    .line 1495
    .line 1496
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1497
    .line 1498
    .line 1499
    invoke-static {v2, v5}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 1500
    .line 1501
    .line 1502
    move-result v2

    .line 1503
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1504
    .line 1505
    .line 1506
    goto :goto_16

    .line 1507
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 1508
    .line 1509
    .line 1510
    goto :goto_18

    .line 1511
    :cond_30
    :goto_17
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1512
    .line 1513
    :goto_18
    return-object v12

    .line 1514
    :pswitch_e
    move-object/from16 v0, p1

    .line 1515
    .line 1516
    check-cast v0, Ljava/util/List;

    .line 1517
    .line 1518
    iget-object v1, v10, La/cp;->w:Landroid/content/Context;

    .line 1519
    .line 1520
    iget-object v4, v10, La/cp;->u:La/yfu0;

    .line 1521
    .line 1522
    iget-object v5, v11, La/cp;->w:Landroid/content/Context;

    .line 1523
    .line 1524
    iget-object v6, v11, La/cp;->u:La/yfu0;

    .line 1525
    .line 1526
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1527
    .line 1528
    .line 1529
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1530
    .line 1531
    .line 1532
    move-result v13

    .line 1533
    if-eqz v13, :cond_33

    .line 1534
    .line 1535
    move-object v0, v6

    .line 1536
    check-cast v0, La/tsn0;

    .line 1537
    .line 1538
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v1

    .line 1542
    check-cast v1, La/btn0;

    .line 1543
    .line 1544
    iget-boolean v1, v1, La/btn0;->w:Z

    .line 1545
    .line 1546
    if-eqz v1, :cond_31

    .line 1547
    .line 1548
    iget-object v1, v0, La/tsn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 1549
    .line 1550
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1551
    .line 1552
    .line 1553
    iget-object v1, v0, La/tsn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1554
    .line 1555
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1556
    .line 1557
    .line 1558
    iget-object v1, v0, La/tsn0;->i:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1559
    .line 1560
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1561
    .line 1562
    .line 1563
    iget-object v1, v0, La/tsn0;->o:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1564
    .line 1565
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1566
    .line 1567
    .line 1568
    iget-object v1, v0, La/tsn0;->q:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1569
    .line 1570
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1571
    .line 1572
    .line 1573
    iget-object v1, v0, La/tsn0;->h:Landroid/widget/TextView;

    .line 1574
    .line 1575
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1576
    .line 1577
    .line 1578
    iget-object v1, v0, La/tsn0;->p:Landroid/widget/TextView;

    .line 1579
    .line 1580
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1581
    .line 1582
    .line 1583
    goto :goto_19

    .line 1584
    :cond_31
    iget-object v1, v0, La/tsn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 1585
    .line 1586
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1587
    .line 1588
    .line 1589
    iget-object v1, v0, La/tsn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1590
    .line 1591
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1592
    .line 1593
    .line 1594
    iget-object v1, v0, La/tsn0;->i:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1595
    .line 1596
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1597
    .line 1598
    .line 1599
    iget-object v1, v0, La/tsn0;->o:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1600
    .line 1601
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1602
    .line 1603
    .line 1604
    iget-object v1, v0, La/tsn0;->q:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1605
    .line 1606
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1607
    .line 1608
    .line 1609
    iget-object v1, v0, La/tsn0;->h:Landroid/widget/TextView;

    .line 1610
    .line 1611
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1612
    .line 1613
    .line 1614
    iget-object v1, v0, La/tsn0;->p:Landroid/widget/TextView;

    .line 1615
    .line 1616
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1617
    .line 1618
    .line 1619
    :goto_19
    iget-object v1, v0, La/tsn0;->e:Landroid/widget/TextView;

    .line 1620
    .line 1621
    iget-object v3, v0, La/tsn0;->f:Landroid/widget/TextView;

    .line 1622
    .line 1623
    iget-object v4, v0, La/tsn0;->p:Landroid/widget/TextView;

    .line 1624
    .line 1625
    iget-object v10, v0, La/tsn0;->h:Landroid/widget/TextView;

    .line 1626
    .line 1627
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v13

    .line 1631
    check-cast v13, La/btn0;

    .line 1632
    .line 1633
    iget-object v13, v13, La/btn0;->b:Ljava/lang/String;

    .line 1634
    .line 1635
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1636
    .line 1637
    .line 1638
    iget-object v1, v0, La/tsn0;->t:Landroid/widget/TextView;

    .line 1639
    .line 1640
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v13

    .line 1644
    check-cast v13, La/btn0;

    .line 1645
    .line 1646
    iget-object v13, v13, La/btn0;->c:Ljava/lang/String;

    .line 1647
    .line 1648
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1649
    .line 1650
    .line 1651
    move-object v1, v6

    .line 1652
    check-cast v1, La/tsn0;

    .line 1653
    .line 1654
    sget-object v13, La/u0d;->a:Ljava/util/List;

    .line 1655
    .line 1656
    iget-object v14, v11, La/cp;->w:Landroid/content/Context;

    .line 1657
    .line 1658
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v13

    .line 1662
    check-cast v13, La/btn0;

    .line 1663
    .line 1664
    iget-object v15, v13, La/btn0;->d:Ljava/lang/String;

    .line 1665
    .line 1666
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v13

    .line 1670
    invoke-virtual {v13, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1671
    .line 1672
    .line 1673
    move-result v8

    .line 1674
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v16

    .line 1678
    new-instance v8, La/j1l0;

    .line 1679
    .line 1680
    const/16 v13, 0x1c

    .line 1681
    .line 1682
    invoke-direct {v8, v1, v13}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 1683
    .line 1684
    .line 1685
    new-instance v13, La/u5l0;

    .line 1686
    .line 1687
    invoke-direct {v13, v1, v11, v2}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1688
    .line 1689
    .line 1690
    const/16 v21, 0xc

    .line 1691
    .line 1692
    const/16 v17, 0x0

    .line 1693
    .line 1694
    const/16 v18, 0x0

    .line 1695
    .line 1696
    move-object/from16 v19, v8

    .line 1697
    .line 1698
    move-object/from16 v20, v13

    .line 1699
    .line 1700
    invoke-static/range {v14 .. v21}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v2

    .line 1710
    check-cast v2, La/btn0;

    .line 1711
    .line 1712
    iget-object v2, v2, La/btn0;->j:Ljava/lang/String;

    .line 1713
    .line 1714
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 1718
    .line 1719
    .line 1720
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v2

    .line 1724
    check-cast v2, La/btn0;

    .line 1725
    .line 1726
    iget-object v2, v2, La/btn0;->k:Ljava/lang/String;

    .line 1727
    .line 1728
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1729
    .line 1730
    .line 1731
    iget-object v13, v0, La/tsn0;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1732
    .line 1733
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v2

    .line 1737
    check-cast v2, La/btn0;

    .line 1738
    .line 1739
    iget-object v14, v2, La/btn0;->f:Ljava/lang/String;

    .line 1740
    .line 1741
    const/16 v19, 0x0

    .line 1742
    .line 1743
    const/16 v20, 0x1fc

    .line 1744
    .line 1745
    const v15, 0x7f080dfe

    .line 1746
    .line 1747
    .line 1748
    const/16 v16, 0x0

    .line 1749
    .line 1750
    invoke-static/range {v13 .. v20}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1751
    .line 1752
    .line 1753
    iget-object v2, v0, La/tsn0;->o:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1754
    .line 1755
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v4

    .line 1759
    check-cast v4, La/btn0;

    .line 1760
    .line 1761
    iget-object v4, v4, La/btn0;->h:Ljava/lang/String;

    .line 1762
    .line 1763
    const/16 v29, 0x0

    .line 1764
    .line 1765
    const/16 v30, 0x1fc

    .line 1766
    .line 1767
    const v25, 0x7f080dfe

    .line 1768
    .line 1769
    .line 1770
    const/16 v26, 0x0

    .line 1771
    .line 1772
    const/16 v27, 0x0

    .line 1773
    .line 1774
    const/16 v28, 0x0

    .line 1775
    .line 1776
    move-object/from16 v23, v2

    .line 1777
    .line 1778
    move-object/from16 v24, v4

    .line 1779
    .line 1780
    invoke-static/range {v23 .. v30}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1781
    .line 1782
    .line 1783
    iget-object v13, v0, La/tsn0;->i:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1784
    .line 1785
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v2

    .line 1789
    check-cast v2, La/btn0;

    .line 1790
    .line 1791
    iget-object v14, v2, La/btn0;->g:Ljava/lang/String;

    .line 1792
    .line 1793
    invoke-static/range {v13 .. v20}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1794
    .line 1795
    .line 1796
    iget-object v2, v0, La/tsn0;->q:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1797
    .line 1798
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v4

    .line 1802
    check-cast v4, La/btn0;

    .line 1803
    .line 1804
    iget-object v4, v4, La/btn0;->i:Ljava/lang/String;

    .line 1805
    .line 1806
    move-object/from16 v23, v2

    .line 1807
    .line 1808
    move-object/from16 v24, v4

    .line 1809
    .line 1810
    invoke-static/range {v23 .. v30}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1811
    .line 1812
    .line 1813
    iget-object v2, v0, La/tsn0;->k:Landroid/widget/TextView;

    .line 1814
    .line 1815
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v4

    .line 1819
    check-cast v4, La/btn0;

    .line 1820
    .line 1821
    iget-object v4, v4, La/btn0;->n:Ljava/lang/String;

    .line 1822
    .line 1823
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v2

    .line 1830
    check-cast v2, La/btn0;

    .line 1831
    .line 1832
    iget-object v2, v2, La/btn0;->p:Ljava/lang/String;

    .line 1833
    .line 1834
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1835
    .line 1836
    .line 1837
    iget-object v0, v0, La/tsn0;->n:Landroid/widget/TextView;

    .line 1838
    .line 1839
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v2

    .line 1843
    check-cast v2, La/btn0;

    .line 1844
    .line 1845
    iget-object v2, v2, La/btn0;->q:Ljava/lang/String;

    .line 1846
    .line 1847
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1848
    .line 1849
    .line 1850
    sget-object v0, La/fzc;->a:La/kj5;

    .line 1851
    .line 1852
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v2

    .line 1856
    check-cast v2, La/btn0;

    .line 1857
    .line 1858
    iget-object v2, v2, La/btn0;->v:La/fzc;

    .line 1859
    .line 1860
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    invoke-static {v2, v5}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 1864
    .line 1865
    .line 1866
    move-result v0

    .line 1867
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1868
    .line 1869
    .line 1870
    iget-object v0, v1, La/tsn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1871
    .line 1872
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1873
    .line 1874
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1875
    .line 1876
    .line 1877
    iget-object v0, v1, La/tsn0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1878
    .line 1879
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v2

    .line 1883
    check-cast v2, La/btn0;

    .line 1884
    .line 1885
    iget-object v2, v2, La/btn0;->r:Ljava/lang/String;

    .line 1886
    .line 1887
    invoke-static {v0, v2, v12, v12, v7}, La/u0d;->d(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 1888
    .line 1889
    .line 1890
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v0

    .line 1894
    check-cast v0, La/btn0;

    .line 1895
    .line 1896
    iget-object v0, v0, La/btn0;->u:Ljava/lang/String;

    .line 1897
    .line 1898
    check-cast v6, La/tsn0;

    .line 1899
    .line 1900
    iget-object v2, v6, La/tsn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 1901
    .line 1902
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1903
    .line 1904
    .line 1905
    move-result v3

    .line 1906
    if-nez v3, :cond_32

    .line 1907
    .line 1908
    const v3, 0x7f1317d3

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v5, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v0

    .line 1915
    :cond_32
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1916
    .line 1917
    .line 1918
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v0

    .line 1922
    check-cast v0, La/btn0;

    .line 1923
    .line 1924
    iget-object v0, v0, La/btn0;->t:La/zsn0;

    .line 1925
    .line 1926
    invoke-static {v11, v0}, La/ohm0;->i(La/cp;La/zsn0;)V

    .line 1927
    .line 1928
    .line 1929
    iget-object v0, v1, La/tsn0;->l:Landroid/widget/TextView;

    .line 1930
    .line 1931
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v2

    .line 1935
    check-cast v2, La/btn0;

    .line 1936
    .line 1937
    iget-object v2, v2, La/btn0;->l:Ljava/lang/String;

    .line 1938
    .line 1939
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1940
    .line 1941
    .line 1942
    iget-object v0, v1, La/tsn0;->m:Landroid/widget/TextView;

    .line 1943
    .line 1944
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v1

    .line 1948
    check-cast v1, La/btn0;

    .line 1949
    .line 1950
    iget-object v1, v1, La/btn0;->m:Ljava/lang/String;

    .line 1951
    .line 1952
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1953
    .line 1954
    .line 1955
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v0

    .line 1959
    check-cast v0, La/btn0;

    .line 1960
    .line 1961
    iget-object v0, v0, La/btn0;->s:Ljava/lang/String;

    .line 1962
    .line 1963
    invoke-static {v11, v0}, La/ohm0;->h(La/cp;Ljava/lang/String;)V

    .line 1964
    .line 1965
    .line 1966
    goto/16 :goto_1e

    .line 1967
    .line 1968
    :cond_33
    new-instance v2, Ljava/util/ArrayList;

    .line 1969
    .line 1970
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1971
    .line 1972
    .line 1973
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v0

    .line 1977
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1978
    .line 1979
    .line 1980
    move-result v3

    .line 1981
    if-eqz v3, :cond_34

    .line 1982
    .line 1983
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v3

    .line 1987
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1988
    .line 1989
    .line 1990
    check-cast v3, Ljava/util/Collection;

    .line 1991
    .line 1992
    check-cast v3, Ljava/lang/Iterable;

    .line 1993
    .line 1994
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1995
    .line 1996
    .line 1997
    goto :goto_1a

    .line 1998
    :cond_34
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2003
    .line 2004
    .line 2005
    move-result v2

    .line 2006
    if-eqz v2, :cond_3c

    .line 2007
    .line 2008
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v2

    .line 2012
    check-cast v2, La/atn0;

    .line 2013
    .line 2014
    if-eqz v2, :cond_3b

    .line 2015
    .line 2016
    instance-of v3, v2, La/usn0;

    .line 2017
    .line 2018
    if-eqz v3, :cond_35

    .line 2019
    .line 2020
    move-object v3, v4

    .line 2021
    check-cast v3, La/tsn0;

    .line 2022
    .line 2023
    iget-object v3, v3, La/tsn0;->f:Landroid/widget/TextView;

    .line 2024
    .line 2025
    check-cast v2, La/usn0;

    .line 2026
    .line 2027
    iget-object v2, v2, La/usn0;->a:Ljava/lang/String;

    .line 2028
    .line 2029
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2030
    .line 2031
    .line 2032
    :goto_1c
    const v5, 0x7f1317d3

    .line 2033
    .line 2034
    .line 2035
    goto :goto_1b

    .line 2036
    :cond_35
    instance-of v3, v2, La/xsn0;

    .line 2037
    .line 2038
    if-eqz v3, :cond_36

    .line 2039
    .line 2040
    move-object v3, v4

    .line 2041
    check-cast v3, La/tsn0;

    .line 2042
    .line 2043
    iget-object v3, v3, La/tsn0;->n:Landroid/widget/TextView;

    .line 2044
    .line 2045
    check-cast v2, La/xsn0;

    .line 2046
    .line 2047
    iget-object v2, v2, La/xsn0;->a:Ljava/lang/String;

    .line 2048
    .line 2049
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2050
    .line 2051
    .line 2052
    goto :goto_1c

    .line 2053
    :cond_36
    instance-of v3, v2, La/wsn0;

    .line 2054
    .line 2055
    if-eqz v3, :cond_37

    .line 2056
    .line 2057
    check-cast v2, La/wsn0;

    .line 2058
    .line 2059
    iget-object v2, v2, La/wsn0;->a:Ljava/lang/String;

    .line 2060
    .line 2061
    invoke-static {v10, v2}, La/ohm0;->h(La/cp;Ljava/lang/String;)V

    .line 2062
    .line 2063
    .line 2064
    goto :goto_1c

    .line 2065
    :cond_37
    instance-of v3, v2, La/zsn0;

    .line 2066
    .line 2067
    if-eqz v3, :cond_38

    .line 2068
    .line 2069
    check-cast v2, La/zsn0;

    .line 2070
    .line 2071
    invoke-static {v10, v2}, La/ohm0;->i(La/cp;La/zsn0;)V

    .line 2072
    .line 2073
    .line 2074
    goto :goto_1c

    .line 2075
    :cond_38
    instance-of v3, v2, La/ysn0;

    .line 2076
    .line 2077
    if-eqz v3, :cond_3a

    .line 2078
    .line 2079
    check-cast v2, La/ysn0;

    .line 2080
    .line 2081
    iget-object v2, v2, La/ysn0;->a:Ljava/lang/String;

    .line 2082
    .line 2083
    move-object v3, v4

    .line 2084
    check-cast v3, La/tsn0;

    .line 2085
    .line 2086
    iget-object v3, v3, La/tsn0;->v:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 2087
    .line 2088
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2089
    .line 2090
    .line 2091
    move-result v5

    .line 2092
    if-nez v5, :cond_39

    .line 2093
    .line 2094
    const v5, 0x7f1317d3

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v2

    .line 2101
    goto :goto_1d

    .line 2102
    :cond_39
    const v5, 0x7f1317d3

    .line 2103
    .line 2104
    .line 2105
    :goto_1d
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2106
    .line 2107
    .line 2108
    goto :goto_1b

    .line 2109
    :cond_3a
    const v5, 0x7f1317d3

    .line 2110
    .line 2111
    .line 2112
    instance-of v3, v2, La/vsn0;

    .line 2113
    .line 2114
    if-eqz v3, :cond_3b

    .line 2115
    .line 2116
    move-object v3, v4

    .line 2117
    check-cast v3, La/tsn0;

    .line 2118
    .line 2119
    iget-object v3, v3, La/tsn0;->f:Landroid/widget/TextView;

    .line 2120
    .line 2121
    sget-object v6, La/fzc;->a:La/kj5;

    .line 2122
    .line 2123
    check-cast v2, La/vsn0;

    .line 2124
    .line 2125
    iget-object v2, v2, La/vsn0;->a:La/fzc;

    .line 2126
    .line 2127
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2128
    .line 2129
    .line 2130
    invoke-static {v2, v1}, La/kj5;->k(La/fzc;Landroid/content/Context;)I

    .line 2131
    .line 2132
    .line 2133
    move-result v2

    .line 2134
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2135
    .line 2136
    .line 2137
    goto/16 :goto_1b

    .line 2138
    .line 2139
    :cond_3b
    invoke-static {}, La/t9f;->b()V

    .line 2140
    .line 2141
    .line 2142
    goto :goto_1f

    .line 2143
    :cond_3c
    :goto_1e
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2144
    .line 2145
    :goto_1f
    return-object v12

    .line 2146
    :pswitch_f
    move-object/from16 v0, p1

    .line 2147
    .line 2148
    check-cast v0, Ljava/util/List;

    .line 2149
    .line 2150
    iget-object v1, v10, La/cp;->u:La/yfu0;

    .line 2151
    .line 2152
    iget-object v2, v11, La/cp;->u:La/yfu0;

    .line 2153
    .line 2154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2155
    .line 2156
    .line 2157
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2158
    .line 2159
    .line 2160
    move-result v3

    .line 2161
    if-eqz v3, :cond_3d

    .line 2162
    .line 2163
    move-object v0, v2

    .line 2164
    check-cast v0, La/jyx;

    .line 2165
    .line 2166
    iget-object v0, v0, La/jyx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2167
    .line 2168
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v1

    .line 2172
    check-cast v1, La/yjn0;

    .line 2173
    .line 2174
    iget v1, v1, La/yjn0;->b:I

    .line 2175
    .line 2176
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2177
    .line 2178
    .line 2179
    move-object v0, v2

    .line 2180
    check-cast v0, La/jyx;

    .line 2181
    .line 2182
    iget-object v0, v0, La/jyx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2183
    .line 2184
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v1

    .line 2188
    check-cast v1, La/yjn0;

    .line 2189
    .line 2190
    iget v1, v1, La/yjn0;->d:I

    .line 2191
    .line 2192
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2193
    .line 2194
    .line 2195
    move-object v0, v2

    .line 2196
    check-cast v0, La/jyx;

    .line 2197
    .line 2198
    iget-object v0, v0, La/jyx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 2199
    .line 2200
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v1

    .line 2204
    check-cast v1, La/yjn0;

    .line 2205
    .line 2206
    iget v1, v1, La/yjn0;->e:I

    .line 2207
    .line 2208
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v1

    .line 2212
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCount(Ljava/lang/Integer;)V

    .line 2213
    .line 2214
    .line 2215
    check-cast v2, La/jyx;

    .line 2216
    .line 2217
    iget-object v0, v2, La/jyx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2218
    .line 2219
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v1

    .line 2223
    check-cast v1, La/yjn0;

    .line 2224
    .line 2225
    iget v1, v1, La/yjn0;->c:I

    .line 2226
    .line 2227
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(I)V

    .line 2228
    .line 2229
    .line 2230
    goto/16 :goto_22

    .line 2231
    .line 2232
    :cond_3d
    new-instance v2, Ljava/util/ArrayList;

    .line 2233
    .line 2234
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2235
    .line 2236
    .line 2237
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v0

    .line 2241
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2242
    .line 2243
    .line 2244
    move-result v3

    .line 2245
    if-eqz v3, :cond_3e

    .line 2246
    .line 2247
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v3

    .line 2251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2252
    .line 2253
    .line 2254
    check-cast v3, Ljava/util/Collection;

    .line 2255
    .line 2256
    check-cast v3, Ljava/lang/Iterable;

    .line 2257
    .line 2258
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2259
    .line 2260
    .line 2261
    goto :goto_20

    .line 2262
    :cond_3e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v0

    .line 2266
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2267
    .line 2268
    .line 2269
    move-result v2

    .line 2270
    if-eqz v2, :cond_43

    .line 2271
    .line 2272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v2

    .line 2276
    check-cast v2, La/xjn0;

    .line 2277
    .line 2278
    if-eqz v2, :cond_42

    .line 2279
    .line 2280
    instance-of v3, v2, La/wjn0;

    .line 2281
    .line 2282
    if-eqz v3, :cond_3f

    .line 2283
    .line 2284
    move-object v2, v1

    .line 2285
    check-cast v2, La/jyx;

    .line 2286
    .line 2287
    iget-object v2, v2, La/jyx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2288
    .line 2289
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v3

    .line 2293
    check-cast v3, La/yjn0;

    .line 2294
    .line 2295
    iget v3, v3, La/yjn0;->b:I

    .line 2296
    .line 2297
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2298
    .line 2299
    .line 2300
    goto :goto_21

    .line 2301
    :cond_3f
    instance-of v3, v2, La/tjn0;

    .line 2302
    .line 2303
    if-eqz v3, :cond_40

    .line 2304
    .line 2305
    move-object v2, v1

    .line 2306
    check-cast v2, La/jyx;

    .line 2307
    .line 2308
    iget-object v2, v2, La/jyx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2309
    .line 2310
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v3

    .line 2314
    check-cast v3, La/yjn0;

    .line 2315
    .line 2316
    iget v3, v3, La/yjn0;->d:I

    .line 2317
    .line 2318
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2319
    .line 2320
    .line 2321
    goto :goto_21

    .line 2322
    :cond_40
    instance-of v3, v2, La/ujn0;

    .line 2323
    .line 2324
    if-eqz v3, :cond_41

    .line 2325
    .line 2326
    move-object v2, v1

    .line 2327
    check-cast v2, La/jyx;

    .line 2328
    .line 2329
    iget-object v2, v2, La/jyx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 2330
    .line 2331
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v3

    .line 2335
    check-cast v3, La/yjn0;

    .line 2336
    .line 2337
    iget v3, v3, La/yjn0;->e:I

    .line 2338
    .line 2339
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v3

    .line 2343
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCount(Ljava/lang/Integer;)V

    .line 2344
    .line 2345
    .line 2346
    goto :goto_21

    .line 2347
    :cond_41
    instance-of v2, v2, La/vjn0;

    .line 2348
    .line 2349
    if-eqz v2, :cond_42

    .line 2350
    .line 2351
    move-object v2, v1

    .line 2352
    check-cast v2, La/jyx;

    .line 2353
    .line 2354
    iget-object v2, v2, La/jyx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2355
    .line 2356
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v3

    .line 2360
    check-cast v3, La/yjn0;

    .line 2361
    .line 2362
    iget v3, v3, La/yjn0;->c:I

    .line 2363
    .line 2364
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(I)V

    .line 2365
    .line 2366
    .line 2367
    goto :goto_21

    .line 2368
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 2369
    .line 2370
    .line 2371
    goto :goto_23

    .line 2372
    :cond_43
    :goto_22
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2373
    .line 2374
    :goto_23
    return-object v12

    .line 2375
    :pswitch_10
    move-object/from16 v0, p1

    .line 2376
    .line 2377
    check-cast v0, Ljava/util/List;

    .line 2378
    .line 2379
    iget-object v1, v10, La/cp;->u:La/yfu0;

    .line 2380
    .line 2381
    iget-object v2, v11, La/cp;->u:La/yfu0;

    .line 2382
    .line 2383
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2384
    .line 2385
    .line 2386
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2387
    .line 2388
    .line 2389
    move-result v3

    .line 2390
    if-eqz v3, :cond_44

    .line 2391
    .line 2392
    move-object v0, v2

    .line 2393
    check-cast v0, La/kyx;

    .line 2394
    .line 2395
    iget-object v0, v0, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2396
    .line 2397
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v1

    .line 2401
    check-cast v1, La/yjn0;

    .line 2402
    .line 2403
    iget v1, v1, La/yjn0;->b:I

    .line 2404
    .line 2405
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(I)V

    .line 2406
    .line 2407
    .line 2408
    move-object v0, v2

    .line 2409
    check-cast v0, La/kyx;

    .line 2410
    .line 2411
    iget-object v0, v0, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2412
    .line 2413
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v1

    .line 2417
    check-cast v1, La/yjn0;

    .line 2418
    .line 2419
    iget v1, v1, La/yjn0;->d:I

    .line 2420
    .line 2421
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 2422
    .line 2423
    .line 2424
    move-object v0, v2

    .line 2425
    check-cast v0, La/kyx;

    .line 2426
    .line 2427
    iget-object v0, v0, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2428
    .line 2429
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2430
    .line 2431
    .line 2432
    move-result-object v1

    .line 2433
    check-cast v1, La/yjn0;

    .line 2434
    .line 2435
    iget v1, v1, La/yjn0;->c:I

    .line 2436
    .line 2437
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(I)V

    .line 2438
    .line 2439
    .line 2440
    check-cast v2, La/kyx;

    .line 2441
    .line 2442
    iget-object v0, v2, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2443
    .line 2444
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v1

    .line 2448
    check-cast v1, La/yjn0;

    .line 2449
    .line 2450
    iget v1, v1, La/yjn0;->e:I

    .line 2451
    .line 2452
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v1

    .line 2456
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setCounter(Ljava/lang/Integer;)V

    .line 2457
    .line 2458
    .line 2459
    goto/16 :goto_26

    .line 2460
    .line 2461
    :cond_44
    new-instance v2, Ljava/util/ArrayList;

    .line 2462
    .line 2463
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2464
    .line 2465
    .line 2466
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v0

    .line 2470
    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2471
    .line 2472
    .line 2473
    move-result v3

    .line 2474
    if-eqz v3, :cond_45

    .line 2475
    .line 2476
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v3

    .line 2480
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2481
    .line 2482
    .line 2483
    check-cast v3, Ljava/util/Collection;

    .line 2484
    .line 2485
    check-cast v3, Ljava/lang/Iterable;

    .line 2486
    .line 2487
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2488
    .line 2489
    .line 2490
    goto :goto_24

    .line 2491
    :cond_45
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v0

    .line 2495
    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2496
    .line 2497
    .line 2498
    move-result v2

    .line 2499
    if-eqz v2, :cond_4a

    .line 2500
    .line 2501
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v2

    .line 2505
    check-cast v2, La/xjn0;

    .line 2506
    .line 2507
    if-eqz v2, :cond_49

    .line 2508
    .line 2509
    instance-of v3, v2, La/wjn0;

    .line 2510
    .line 2511
    if-eqz v3, :cond_46

    .line 2512
    .line 2513
    move-object v2, v1

    .line 2514
    check-cast v2, La/kyx;

    .line 2515
    .line 2516
    iget-object v2, v2, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2517
    .line 2518
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v3

    .line 2522
    check-cast v3, La/yjn0;

    .line 2523
    .line 2524
    iget v3, v3, La/yjn0;->b:I

    .line 2525
    .line 2526
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(I)V

    .line 2527
    .line 2528
    .line 2529
    goto :goto_25

    .line 2530
    :cond_46
    instance-of v3, v2, La/tjn0;

    .line 2531
    .line 2532
    if-eqz v3, :cond_47

    .line 2533
    .line 2534
    move-object v2, v1

    .line 2535
    check-cast v2, La/kyx;

    .line 2536
    .line 2537
    iget-object v2, v2, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2538
    .line 2539
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2540
    .line 2541
    .line 2542
    move-result-object v3

    .line 2543
    check-cast v3, La/yjn0;

    .line 2544
    .line 2545
    iget v3, v3, La/yjn0;->d:I

    .line 2546
    .line 2547
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 2548
    .line 2549
    .line 2550
    goto :goto_25

    .line 2551
    :cond_47
    instance-of v3, v2, La/ujn0;

    .line 2552
    .line 2553
    if-eqz v3, :cond_48

    .line 2554
    .line 2555
    move-object v2, v1

    .line 2556
    check-cast v2, La/kyx;

    .line 2557
    .line 2558
    iget-object v2, v2, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2559
    .line 2560
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2561
    .line 2562
    .line 2563
    move-result-object v3

    .line 2564
    check-cast v3, La/yjn0;

    .line 2565
    .line 2566
    iget v3, v3, La/yjn0;->e:I

    .line 2567
    .line 2568
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2569
    .line 2570
    .line 2571
    move-result-object v3

    .line 2572
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setCounter(Ljava/lang/Integer;)V

    .line 2573
    .line 2574
    .line 2575
    goto :goto_25

    .line 2576
    :cond_48
    instance-of v2, v2, La/vjn0;

    .line 2577
    .line 2578
    if-eqz v2, :cond_49

    .line 2579
    .line 2580
    move-object v2, v1

    .line 2581
    check-cast v2, La/kyx;

    .line 2582
    .line 2583
    iget-object v2, v2, La/kyx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2584
    .line 2585
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2586
    .line 2587
    .line 2588
    move-result-object v3

    .line 2589
    check-cast v3, La/yjn0;

    .line 2590
    .line 2591
    iget v3, v3, La/yjn0;->c:I

    .line 2592
    .line 2593
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(I)V

    .line 2594
    .line 2595
    .line 2596
    goto :goto_25

    .line 2597
    :cond_49
    invoke-static {}, La/t9f;->b()V

    .line 2598
    .line 2599
    .line 2600
    goto :goto_27

    .line 2601
    :cond_4a
    :goto_26
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2602
    .line 2603
    :goto_27
    return-object v12

    .line 2604
    :pswitch_11
    move-object/from16 v0, p1

    .line 2605
    .line 2606
    check-cast v0, Ljava/util/List;

    .line 2607
    .line 2608
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2609
    .line 2610
    .line 2611
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2612
    .line 2613
    .line 2614
    move-result v1

    .line 2615
    if-eqz v1, :cond_4b

    .line 2616
    .line 2617
    iget-object v0, v11, La/cp;->u:La/yfu0;

    .line 2618
    .line 2619
    move-object v1, v0

    .line 2620
    check-cast v1, La/t850;

    .line 2621
    .line 2622
    iget-object v1, v1, La/t850;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 2623
    .line 2624
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2625
    .line 2626
    .line 2627
    move-result-object v2

    .line 2628
    check-cast v2, La/fdl0;

    .line 2629
    .line 2630
    iget-boolean v2, v2, La/fdl0;->d:Z

    .line 2631
    .line 2632
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckboxChecked(Z)V

    .line 2633
    .line 2634
    .line 2635
    check-cast v0, La/t850;

    .line 2636
    .line 2637
    iget-object v1, v0, La/t850;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 2638
    .line 2639
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v2

    .line 2643
    check-cast v2, La/fdl0;

    .line 2644
    .line 2645
    iget-object v2, v2, La/fdl0;->b:Ljava/lang/String;

    .line 2646
    .line 2647
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 2648
    .line 2649
    .line 2650
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 2651
    .line 2652
    iget-object v0, v0, La/t850;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 2653
    .line 2654
    invoke-virtual {v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v0

    .line 2658
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2659
    .line 2660
    .line 2661
    move-result-object v1

    .line 2662
    check-cast v1, La/fdl0;

    .line 2663
    .line 2664
    iget-object v1, v1, La/fdl0;->c:Ljava/lang/String;

    .line 2665
    .line 2666
    iget-object v2, v11, La/cp;->w:Landroid/content/Context;

    .line 2667
    .line 2668
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2669
    .line 2670
    .line 2671
    move-result-object v3

    .line 2672
    check-cast v3, La/fdl0;

    .line 2673
    .line 2674
    const v3, 0x7f080f06

    .line 2675
    .line 2676
    .line 2677
    invoke-static {v3, v2}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2678
    .line 2679
    .line 2680
    move-result-object v2

    .line 2681
    invoke-static {v0, v1, v2}, La/u0d;->p(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 2682
    .line 2683
    .line 2684
    goto :goto_2a

    .line 2685
    :cond_4b
    new-instance v1, Ljava/util/ArrayList;

    .line 2686
    .line 2687
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2688
    .line 2689
    .line 2690
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v0

    .line 2694
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2695
    .line 2696
    .line 2697
    move-result v2

    .line 2698
    if-eqz v2, :cond_4c

    .line 2699
    .line 2700
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2701
    .line 2702
    .line 2703
    move-result-object v2

    .line 2704
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2705
    .line 2706
    .line 2707
    check-cast v2, Ljava/util/Collection;

    .line 2708
    .line 2709
    check-cast v2, Ljava/lang/Iterable;

    .line 2710
    .line 2711
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2712
    .line 2713
    .line 2714
    goto :goto_28

    .line 2715
    :cond_4c
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v0

    .line 2719
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2720
    .line 2721
    .line 2722
    move-result v1

    .line 2723
    if-eqz v1, :cond_4e

    .line 2724
    .line 2725
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v1

    .line 2729
    check-cast v1, La/edl0;

    .line 2730
    .line 2731
    if-eqz v1, :cond_4d

    .line 2732
    .line 2733
    iget-object v1, v10, La/cp;->u:La/yfu0;

    .line 2734
    .line 2735
    check-cast v1, La/t850;

    .line 2736
    .line 2737
    iget-object v1, v1, La/t850;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 2738
    .line 2739
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v2

    .line 2743
    check-cast v2, La/fdl0;

    .line 2744
    .line 2745
    iget-boolean v2, v2, La/fdl0;->d:Z

    .line 2746
    .line 2747
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckboxChecked(Z)V

    .line 2748
    .line 2749
    .line 2750
    goto :goto_29

    .line 2751
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 2752
    .line 2753
    .line 2754
    goto :goto_2b

    .line 2755
    :cond_4e
    :goto_2a
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2756
    .line 2757
    :goto_2b
    return-object v12

    .line 2758
    :pswitch_12
    move-object/from16 v0, p1

    .line 2759
    .line 2760
    check-cast v0, Ljava/util/List;

    .line 2761
    .line 2762
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2763
    .line 2764
    .line 2765
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2766
    .line 2767
    .line 2768
    move-result v1

    .line 2769
    const v2, 0x7f040b65

    .line 2770
    .line 2771
    .line 2772
    const v3, 0x7f040afc

    .line 2773
    .line 2774
    .line 2775
    if-eqz v1, :cond_57

    .line 2776
    .line 2777
    iget-object v0, v11, La/cp;->u:La/yfu0;

    .line 2778
    .line 2779
    iget-object v1, v11, La/cp;->w:Landroid/content/Context;

    .line 2780
    .line 2781
    check-cast v0, La/rxx;

    .line 2782
    .line 2783
    iget-object v4, v0, La/rxx;->b:Landroid/widget/TextView;

    .line 2784
    .line 2785
    iget-object v5, v0, La/rxx;->e:Landroid/view/View;

    .line 2786
    .line 2787
    iget-object v7, v0, La/rxx;->f:Landroid/view/View;

    .line 2788
    .line 2789
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2790
    .line 2791
    .line 2792
    move-result-object v8

    .line 2793
    check-cast v8, La/prj0;

    .line 2794
    .line 2795
    iget-object v8, v8, La/prj0;->a:Ljava/lang/String;

    .line 2796
    .line 2797
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2798
    .line 2799
    .line 2800
    iget-object v4, v0, La/rxx;->c:Landroid/widget/TextView;

    .line 2801
    .line 2802
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2803
    .line 2804
    .line 2805
    move-result-object v8

    .line 2806
    check-cast v8, La/prj0;

    .line 2807
    .line 2808
    iget-object v8, v8, La/prj0;->b:Ljava/lang/String;

    .line 2809
    .line 2810
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2811
    .line 2812
    .line 2813
    iget-object v0, v0, La/rxx;->d:Landroid/widget/TextView;

    .line 2814
    .line 2815
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2816
    .line 2817
    .line 2818
    move-result-object v4

    .line 2819
    check-cast v4, La/prj0;

    .line 2820
    .line 2821
    iget-object v4, v4, La/prj0;->c:Ljava/lang/String;

    .line 2822
    .line 2823
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2824
    .line 2825
    .line 2826
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2827
    .line 2828
    .line 2829
    move-result-object v0

    .line 2830
    check-cast v0, La/prj0;

    .line 2831
    .line 2832
    iget-boolean v0, v0, La/prj0;->d:Z

    .line 2833
    .line 2834
    if-eqz v0, :cond_4f

    .line 2835
    .line 2836
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2837
    .line 2838
    .line 2839
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2840
    .line 2841
    .line 2842
    goto :goto_2c

    .line 2843
    :cond_4f
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v0

    .line 2847
    check-cast v0, La/prj0;

    .line 2848
    .line 2849
    iget-boolean v0, v0, La/prj0;->e:Z

    .line 2850
    .line 2851
    if-eqz v0, :cond_50

    .line 2852
    .line 2853
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2854
    .line 2855
    .line 2856
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2857
    .line 2858
    .line 2859
    goto :goto_2c

    .line 2860
    :cond_50
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2861
    .line 2862
    .line 2863
    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2864
    .line 2865
    .line 2866
    :goto_2c
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v0

    .line 2870
    instance-of v4, v0, La/a3e;

    .line 2871
    .line 2872
    if-eqz v4, :cond_51

    .line 2873
    .line 2874
    check-cast v0, La/a3e;

    .line 2875
    .line 2876
    goto :goto_2d

    .line 2877
    :cond_51
    move-object v0, v12

    .line 2878
    :goto_2d
    if-eqz v0, :cond_52

    .line 2879
    .line 2880
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2881
    .line 2882
    .line 2883
    move-result-object v4

    .line 2884
    check-cast v4, La/prj0;

    .line 2885
    .line 2886
    iget v4, v4, La/prj0;->f:F

    .line 2887
    .line 2888
    iput v4, v0, La/a3e;->H:F

    .line 2889
    .line 2890
    :cond_52
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2891
    .line 2892
    .line 2893
    move-result-object v0

    .line 2894
    instance-of v4, v0, La/a3e;

    .line 2895
    .line 2896
    if-eqz v4, :cond_53

    .line 2897
    .line 2898
    check-cast v0, La/a3e;

    .line 2899
    .line 2900
    goto :goto_2e

    .line 2901
    :cond_53
    move-object v0, v12

    .line 2902
    :goto_2e
    if-eqz v0, :cond_54

    .line 2903
    .line 2904
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v4

    .line 2908
    check-cast v4, La/prj0;

    .line 2909
    .line 2910
    iget v4, v4, La/prj0;->g:F

    .line 2911
    .line 2912
    iput v4, v0, La/a3e;->H:F

    .line 2913
    .line 2914
    :cond_54
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v0

    .line 2918
    check-cast v0, La/prj0;

    .line 2919
    .line 2920
    iget v0, v0, La/prj0;->h:I

    .line 2921
    .line 2922
    invoke-static {v0, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2923
    .line 2924
    .line 2925
    move-result-object v0

    .line 2926
    if-eqz v0, :cond_55

    .line 2927
    .line 2928
    invoke-static {v0, v1, v3}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 2929
    .line 2930
    .line 2931
    goto :goto_2f

    .line 2932
    :cond_55
    move-object v0, v12

    .line 2933
    :goto_2f
    invoke-virtual {v5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2934
    .line 2935
    .line 2936
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v0

    .line 2940
    check-cast v0, La/prj0;

    .line 2941
    .line 2942
    iget v0, v0, La/prj0;->i:I

    .line 2943
    .line 2944
    invoke-virtual {v1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v0

    .line 2948
    if-eqz v0, :cond_56

    .line 2949
    .line 2950
    invoke-static {v0, v1, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 2951
    .line 2952
    .line 2953
    move-object v12, v0

    .line 2954
    :cond_56
    invoke-virtual {v7, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2955
    .line 2956
    .line 2957
    goto/16 :goto_35

    .line 2958
    .line 2959
    :cond_57
    new-instance v1, Ljava/util/ArrayList;

    .line 2960
    .line 2961
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2962
    .line 2963
    .line 2964
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2965
    .line 2966
    .line 2967
    move-result-object v0

    .line 2968
    :goto_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2969
    .line 2970
    .line 2971
    move-result v4

    .line 2972
    if-eqz v4, :cond_58

    .line 2973
    .line 2974
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2975
    .line 2976
    .line 2977
    move-result-object v4

    .line 2978
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2979
    .line 2980
    .line 2981
    check-cast v4, Ljava/util/Collection;

    .line 2982
    .line 2983
    check-cast v4, Ljava/lang/Iterable;

    .line 2984
    .line 2985
    invoke-static {v1, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2986
    .line 2987
    .line 2988
    goto :goto_30

    .line 2989
    :cond_58
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2990
    .line 2991
    .line 2992
    move-result-object v0

    .line 2993
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2994
    .line 2995
    .line 2996
    move-result v1

    .line 2997
    if-eqz v1, :cond_5e

    .line 2998
    .line 2999
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3000
    .line 3001
    .line 3002
    move-result-object v1

    .line 3003
    check-cast v1, La/orj0;

    .line 3004
    .line 3005
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3006
    .line 3007
    .line 3008
    instance-of v4, v1, La/orj0;

    .line 3009
    .line 3010
    if-eqz v4, :cond_5d

    .line 3011
    .line 3012
    iget-object v1, v1, La/orj0;->a:La/prj0;

    .line 3013
    .line 3014
    iget-object v4, v10, La/cp;->u:La/yfu0;

    .line 3015
    .line 3016
    iget-object v5, v10, La/cp;->w:Landroid/content/Context;

    .line 3017
    .line 3018
    check-cast v4, La/rxx;

    .line 3019
    .line 3020
    iget-object v7, v4, La/rxx;->c:Landroid/widget/TextView;

    .line 3021
    .line 3022
    iget-object v8, v1, La/prj0;->b:Ljava/lang/String;

    .line 3023
    .line 3024
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3025
    .line 3026
    .line 3027
    iget-object v7, v4, La/rxx;->d:Landroid/widget/TextView;

    .line 3028
    .line 3029
    iget-object v8, v4, La/rxx;->e:Landroid/view/View;

    .line 3030
    .line 3031
    iget-object v4, v4, La/rxx;->f:Landroid/view/View;

    .line 3032
    .line 3033
    iget-object v11, v1, La/prj0;->c:Ljava/lang/String;

    .line 3034
    .line 3035
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3036
    .line 3037
    .line 3038
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v7

    .line 3042
    check-cast v7, La/prj0;

    .line 3043
    .line 3044
    iget-boolean v7, v7, La/prj0;->d:Z

    .line 3045
    .line 3046
    if-eqz v7, :cond_59

    .line 3047
    .line 3048
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 3049
    .line 3050
    .line 3051
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3052
    .line 3053
    .line 3054
    goto :goto_32

    .line 3055
    :cond_59
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 3056
    .line 3057
    .line 3058
    move-result-object v7

    .line 3059
    check-cast v7, La/prj0;

    .line 3060
    .line 3061
    iget-boolean v7, v7, La/prj0;->e:Z

    .line 3062
    .line 3063
    if-eqz v7, :cond_5a

    .line 3064
    .line 3065
    invoke-virtual {v8, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3066
    .line 3067
    .line 3068
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 3069
    .line 3070
    .line 3071
    goto :goto_32

    .line 3072
    :cond_5a
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 3073
    .line 3074
    .line 3075
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 3076
    .line 3077
    .line 3078
    :goto_32
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3079
    .line 3080
    .line 3081
    move-result-object v7

    .line 3082
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3083
    .line 3084
    .line 3085
    check-cast v7, La/a3e;

    .line 3086
    .line 3087
    iget v11, v1, La/prj0;->f:F

    .line 3088
    .line 3089
    iput v11, v7, La/a3e;->H:F

    .line 3090
    .line 3091
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3092
    .line 3093
    .line 3094
    move-result-object v7

    .line 3095
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3096
    .line 3097
    .line 3098
    check-cast v7, La/a3e;

    .line 3099
    .line 3100
    iget v11, v1, La/prj0;->g:F

    .line 3101
    .line 3102
    iput v11, v7, La/a3e;->H:F

    .line 3103
    .line 3104
    iget v7, v1, La/prj0;->h:I

    .line 3105
    .line 3106
    invoke-static {v7, v5}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 3107
    .line 3108
    .line 3109
    move-result-object v7

    .line 3110
    if-eqz v7, :cond_5b

    .line 3111
    .line 3112
    invoke-static {v7, v5, v3}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 3113
    .line 3114
    .line 3115
    goto :goto_33

    .line 3116
    :cond_5b
    move-object v7, v12

    .line 3117
    :goto_33
    invoke-virtual {v8, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3118
    .line 3119
    .line 3120
    iget v1, v1, La/prj0;->i:I

    .line 3121
    .line 3122
    invoke-virtual {v5, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 3123
    .line 3124
    .line 3125
    move-result-object v1

    .line 3126
    if-eqz v1, :cond_5c

    .line 3127
    .line 3128
    invoke-static {v1, v5, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 3129
    .line 3130
    .line 3131
    goto :goto_34

    .line 3132
    :cond_5c
    move-object v1, v12

    .line 3133
    :goto_34
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 3134
    .line 3135
    .line 3136
    goto/16 :goto_31

    .line 3137
    .line 3138
    :cond_5d
    invoke-static {}, La/t9f;->b()V

    .line 3139
    .line 3140
    .line 3141
    goto :goto_36

    .line 3142
    :cond_5e
    :goto_35
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3143
    .line 3144
    :goto_36
    return-object v12

    .line 3145
    :pswitch_13
    move-object/from16 v0, p1

    .line 3146
    .line 3147
    check-cast v0, Ljava/util/List;

    .line 3148
    .line 3149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3150
    .line 3151
    .line 3152
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3153
    .line 3154
    .line 3155
    move-result v1

    .line 3156
    if-eqz v1, :cond_5f

    .line 3157
    .line 3158
    invoke-static {v11}, La/ufx;->s(La/cp;)V

    .line 3159
    .line 3160
    .line 3161
    iget-object v0, v11, La/cp;->u:La/yfu0;

    .line 3162
    .line 3163
    check-cast v0, La/kxx;

    .line 3164
    .line 3165
    iget-object v1, v0, La/kxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 3166
    .line 3167
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 3168
    .line 3169
    .line 3170
    move-result-object v2

    .line 3171
    check-cast v2, La/fij0;

    .line 3172
    .line 3173
    invoke-interface {v2}, La/fij0;->b()I

    .line 3174
    .line 3175
    .line 3176
    move-result v2

    .line 3177
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 3178
    .line 3179
    .line 3180
    iget-object v0, v0, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 3181
    .line 3182
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v1

    .line 3186
    check-cast v1, La/fij0;

    .line 3187
    .line 3188
    invoke-interface {v1}, La/fij0;->getTitle()Ljava/lang/String;

    .line 3189
    .line 3190
    .line 3191
    move-result-object v1

    .line 3192
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 3193
    .line 3194
    .line 3195
    invoke-static {v11}, La/ufx;->u(La/cp;)V

    .line 3196
    .line 3197
    .line 3198
    invoke-static {v11}, La/ufx;->t(La/cp;)V

    .line 3199
    .line 3200
    .line 3201
    goto :goto_39

    .line 3202
    :cond_5f
    new-instance v1, Ljava/util/ArrayList;

    .line 3203
    .line 3204
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3205
    .line 3206
    .line 3207
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3208
    .line 3209
    .line 3210
    move-result-object v0

    .line 3211
    :goto_37
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3212
    .line 3213
    .line 3214
    move-result v2

    .line 3215
    if-eqz v2, :cond_60

    .line 3216
    .line 3217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3218
    .line 3219
    .line 3220
    move-result-object v2

    .line 3221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3222
    .line 3223
    .line 3224
    check-cast v2, Ljava/util/Collection;

    .line 3225
    .line 3226
    check-cast v2, Ljava/lang/Iterable;

    .line 3227
    .line 3228
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3229
    .line 3230
    .line 3231
    goto :goto_37

    .line 3232
    :cond_60
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3233
    .line 3234
    .line 3235
    move-result-object v0

    .line 3236
    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3237
    .line 3238
    .line 3239
    move-result v1

    .line 3240
    if-eqz v1, :cond_64

    .line 3241
    .line 3242
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3243
    .line 3244
    .line 3245
    move-result-object v1

    .line 3246
    check-cast v1, La/dij0;

    .line 3247
    .line 3248
    if-eqz v1, :cond_63

    .line 3249
    .line 3250
    instance-of v2, v1, La/bij0;

    .line 3251
    .line 3252
    if-eqz v2, :cond_61

    .line 3253
    .line 3254
    invoke-static {v10}, La/ufx;->t(La/cp;)V

    .line 3255
    .line 3256
    .line 3257
    goto :goto_38

    .line 3258
    :cond_61
    instance-of v2, v1, La/cij0;

    .line 3259
    .line 3260
    if-eqz v2, :cond_62

    .line 3261
    .line 3262
    invoke-static {v10}, La/ufx;->u(La/cp;)V

    .line 3263
    .line 3264
    .line 3265
    goto :goto_38

    .line 3266
    :cond_62
    instance-of v1, v1, La/aij0;

    .line 3267
    .line 3268
    if-eqz v1, :cond_63

    .line 3269
    .line 3270
    invoke-static {v10}, La/ufx;->s(La/cp;)V

    .line 3271
    .line 3272
    .line 3273
    goto :goto_38

    .line 3274
    :cond_63
    invoke-static {}, La/t9f;->b()V

    .line 3275
    .line 3276
    .line 3277
    goto :goto_3a

    .line 3278
    :cond_64
    :goto_39
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3279
    .line 3280
    :goto_3a
    return-object v12

    .line 3281
    :pswitch_14
    move-object/from16 v0, p1

    .line 3282
    .line 3283
    check-cast v0, Ljava/util/List;

    .line 3284
    .line 3285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3286
    .line 3287
    .line 3288
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3289
    .line 3290
    .line 3291
    move-result v1

    .line 3292
    if-eqz v1, :cond_65

    .line 3293
    .line 3294
    invoke-static {v11}, La/ydx;->x(La/cp;)V

    .line 3295
    .line 3296
    .line 3297
    iget-object v0, v11, La/cp;->u:La/yfu0;

    .line 3298
    .line 3299
    check-cast v0, La/kxx;

    .line 3300
    .line 3301
    iget-object v1, v0, La/kxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 3302
    .line 3303
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 3304
    .line 3305
    .line 3306
    move-result-object v2

    .line 3307
    check-cast v2, La/rhj0;

    .line 3308
    .line 3309
    invoke-interface {v2}, La/rhj0;->b()I

    .line 3310
    .line 3311
    .line 3312
    move-result v2

    .line 3313
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 3314
    .line 3315
    .line 3316
    iget-object v0, v0, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 3317
    .line 3318
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 3319
    .line 3320
    .line 3321
    move-result-object v1

    .line 3322
    check-cast v1, La/rhj0;

    .line 3323
    .line 3324
    invoke-interface {v1}, La/rhj0;->getTitle()Ljava/lang/String;

    .line 3325
    .line 3326
    .line 3327
    move-result-object v1

    .line 3328
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 3329
    .line 3330
    .line 3331
    invoke-static {v11}, La/ydx;->B(La/cp;)V

    .line 3332
    .line 3333
    .line 3334
    invoke-static {v11}, La/ydx;->A(La/cp;)V

    .line 3335
    .line 3336
    .line 3337
    invoke-static {v11}, La/ydx;->y(La/cp;)V

    .line 3338
    .line 3339
    .line 3340
    goto :goto_3d

    .line 3341
    :cond_65
    new-instance v1, Ljava/util/ArrayList;

    .line 3342
    .line 3343
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3344
    .line 3345
    .line 3346
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3347
    .line 3348
    .line 3349
    move-result-object v0

    .line 3350
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3351
    .line 3352
    .line 3353
    move-result v2

    .line 3354
    if-eqz v2, :cond_66

    .line 3355
    .line 3356
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3357
    .line 3358
    .line 3359
    move-result-object v2

    .line 3360
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3361
    .line 3362
    .line 3363
    check-cast v2, Ljava/util/Collection;

    .line 3364
    .line 3365
    check-cast v2, Ljava/lang/Iterable;

    .line 3366
    .line 3367
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3368
    .line 3369
    .line 3370
    goto :goto_3b

    .line 3371
    :cond_66
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3372
    .line 3373
    .line 3374
    move-result-object v0

    .line 3375
    :goto_3c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3376
    .line 3377
    .line 3378
    move-result v1

    .line 3379
    if-eqz v1, :cond_6b

    .line 3380
    .line 3381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v1

    .line 3385
    check-cast v1, La/ohj0;

    .line 3386
    .line 3387
    if-eqz v1, :cond_6a

    .line 3388
    .line 3389
    instance-of v2, v1, La/lhj0;

    .line 3390
    .line 3391
    if-eqz v2, :cond_67

    .line 3392
    .line 3393
    invoke-static {v10}, La/ydx;->y(La/cp;)V

    .line 3394
    .line 3395
    .line 3396
    goto :goto_3c

    .line 3397
    :cond_67
    instance-of v2, v1, La/mhj0;

    .line 3398
    .line 3399
    if-eqz v2, :cond_68

    .line 3400
    .line 3401
    invoke-static {v10}, La/ydx;->A(La/cp;)V

    .line 3402
    .line 3403
    .line 3404
    goto :goto_3c

    .line 3405
    :cond_68
    instance-of v2, v1, La/nhj0;

    .line 3406
    .line 3407
    if-eqz v2, :cond_69

    .line 3408
    .line 3409
    invoke-static {v10}, La/ydx;->B(La/cp;)V

    .line 3410
    .line 3411
    .line 3412
    goto :goto_3c

    .line 3413
    :cond_69
    instance-of v1, v1, La/khj0;

    .line 3414
    .line 3415
    if-eqz v1, :cond_6a

    .line 3416
    .line 3417
    invoke-static {v10}, La/ydx;->x(La/cp;)V

    .line 3418
    .line 3419
    .line 3420
    goto :goto_3c

    .line 3421
    :cond_6a
    invoke-static {}, La/t9f;->b()V

    .line 3422
    .line 3423
    .line 3424
    goto :goto_3e

    .line 3425
    :cond_6b
    :goto_3d
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3426
    .line 3427
    :goto_3e
    return-object v12

    .line 3428
    nop

    .line 3429
    :pswitch_data_0
    .packed-switch 0x0
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
