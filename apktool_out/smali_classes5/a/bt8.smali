.class public final synthetic La/bt8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/jie0;La/et8;FZZ)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    iput-byte p3, p0, La/bt8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bt8;->d:Ljava/lang/Object;

    iput-object p2, p0, La/bt8;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/bt8;->b:Z

    iput-boolean p5, p0, La/bt8;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;ZZLa/mlr;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/bt8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bt8;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/bt8;->b:Z

    iput-boolean p3, p0, La/bt8;->c:Z

    iput-object p4, p0, La/bt8;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLa/pn10;La/jo10;Z)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/bt8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/bt8;->b:Z

    iput-object p2, p0, La/bt8;->d:Ljava/lang/Object;

    iput-object p3, p0, La/bt8;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/bt8;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLa/hqh0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 4
    iput-byte p5, p0, La/bt8;->a:B

    iput-boolean p1, p0, La/bt8;->b:Z

    iput-boolean p2, p0, La/bt8;->c:Z

    iput-object p3, p0, La/bt8;->d:Ljava/lang/Object;

    iput-object p4, p0, La/bt8;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bt8;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const v4, 0x7f0606d0

    .line 9
    .line 10
    .line 11
    const v5, 0x7f0606c1

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x0

    .line 16
    iget-object v8, v0, La/bt8;->e:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v9, v0, La/bt8;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iget-boolean v10, v0, La/bt8;->c:Z

    .line 21
    .line 22
    iget-boolean v0, v0, La/bt8;->b:Z

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v9, La/gqh0;

    .line 28
    .line 29
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, La/sku0;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, La/sku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, La/tw5;->setFirst(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v10}, La/tw5;->setLast(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, La/sku0;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 50
    .line 51
    .line 52
    iget-boolean v2, v9, La/gqh0;->b:Z

    .line 53
    .line 54
    iget-boolean v11, v9, La/gqh0;->c:Z

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 57
    .line 58
    .line 59
    new-instance v2, La/kqh0;

    .line 60
    .line 61
    invoke-direct {v2, v8, v9, v7}, La/kqh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v2}, La/wwb;->D(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v1, La/sku0;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 68
    .line 69
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 70
    .line 71
    .line 72
    iget-object v8, v9, La/gqh0;->d:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v2, v8}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object v8, v9, La/gqh0;->f:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v2, v8}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    sget-object v8, La/j5d;->a:Landroid/util/TypedValue;

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-boolean v9, v9, La/gqh0;->b:Z

    .line 92
    .line 93
    if-eqz v9, :cond_0

    .line 94
    .line 95
    move v4, v5

    .line 96
    :cond_0
    invoke-virtual {v8, v4}, Landroid/content/Context;->getColor(I)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleTextColor(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v11}, Landroid/view/View;->setEnabled(Z)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v1, La/sku0;->d:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 107
    .line 108
    if-nez v10, :cond_1

    .line 109
    .line 110
    move v3, v7

    .line 111
    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v11}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 118
    .line 119
    .line 120
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_0
    check-cast v9, La/fqh0;

    .line 124
    .line 125
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 126
    .line 127
    move-object/from16 v1, p1

    .line 128
    .line 129
    check-cast v1, La/rku0;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v2, v1, La/rku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v11, La/dff0;

    .line 140
    .line 141
    const/16 v12, 0x1b

    .line 142
    .line 143
    invoke-direct {v11, v8, v9, v12}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    invoke-static {v2, v11}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, La/tw5;->setFirst(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v10}, La/tw5;->setLast(Z)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v1, La/rku0;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 156
    .line 157
    iget-object v2, v9, La/fqh0;->c:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    iget-object v2, v9, La/fqh0;->d:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-boolean v8, v9, La/fqh0;->b:Z

    .line 177
    .line 178
    if-eqz v8, :cond_2

    .line 179
    .line 180
    move v4, v5

    .line 181
    :cond_2
    invoke-virtual {v2, v4}, Landroid/content/Context;->getColor(I)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleTextColor(I)V

    .line 186
    .line 187
    .line 188
    iget-object v2, v1, La/rku0;->d:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 189
    .line 190
    if-nez v10, :cond_3

    .line 191
    .line 192
    move v4, v7

    .line 193
    goto :goto_0

    .line 194
    :cond_3
    move v4, v3

    .line 195
    :goto_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    iget-object v1, v1, La/rku0;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 199
    .line 200
    iget-boolean v2, v9, La/fqh0;->e:Z

    .line 201
    .line 202
    if-eqz v2, :cond_4

    .line 203
    .line 204
    move v3, v7

    .line 205
    :cond_4
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 209
    .line 210
    .line 211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_1
    check-cast v9, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 215
    .line 216
    check-cast v8, La/mlr;

    .line 217
    .line 218
    move-object/from16 v1, p1

    .line 219
    .line 220
    check-cast v1, La/k0w0;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v9}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget-object v1, v1, La/ikt0;->a:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, La/c8d;

    .line 232
    .line 233
    sget-object v3, La/cfx0;->o:La/bjk;

    .line 234
    .line 235
    if-eqz v0, :cond_6

    .line 236
    .line 237
    :cond_5
    move v2, v7

    .line 238
    goto :goto_1

    .line 239
    :cond_6
    if-eqz v10, :cond_7

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_7
    iget-boolean v0, v8, La/mlr;->n:Z

    .line 243
    .line 244
    if-nez v0, :cond_5

    .line 245
    .line 246
    :goto_1
    new-instance v0, La/v7d;

    .line 247
    .line 248
    invoke-direct {v0, v2, v3, v3}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 249
    .line 250
    .line 251
    iput-object v0, v1, La/c8d;->a:La/w7d;

    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_2
    check-cast v9, La/pn10;

    .line 257
    .line 258
    move-object/from16 v19, v8

    .line 259
    .line 260
    check-cast v19, La/jo10;

    .line 261
    .line 262
    move-object/from16 v1, p1

    .line 263
    .line 264
    check-cast v1, Ljava/lang/Throwable;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    if-eqz v0, :cond_a

    .line 270
    .line 271
    iget-object v0, v9, La/pn10;->U:La/x9v0;

    .line 272
    .line 273
    if-nez v0, :cond_9

    .line 274
    .line 275
    iget-object v0, v9, La/i3t0;->i:La/ocj;

    .line 276
    .line 277
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 278
    .line 279
    :goto_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iget-object v3, v9, La/i3t0;->f:La/oyg0;

    .line 287
    .line 288
    move-object v11, v2

    .line 289
    check-cast v11, La/tm10;

    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    const/16 v33, 0x0

    .line 295
    .line 296
    const v34, 0x33ff7f

    .line 297
    .line 298
    .line 299
    const/4 v12, 0x0

    .line 300
    const/4 v13, 0x0

    .line 301
    const/4 v14, 0x0

    .line 302
    const/4 v15, 0x0

    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    const/16 v18, 0x0

    .line 308
    .line 309
    const/16 v20, 0x0

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    const/16 v22, 0x0

    .line 314
    .line 315
    const/16 v23, 0x0

    .line 316
    .line 317
    const-wide/16 v24, 0x0

    .line 318
    .line 319
    const/16 v26, 0x0

    .line 320
    .line 321
    const/16 v27, 0x0

    .line 322
    .line 323
    const/16 v28, 0x0

    .line 324
    .line 325
    const/16 v29, 0x0

    .line 326
    .line 327
    const/16 v30, 0x0

    .line 328
    .line 329
    const/16 v31, 0x0

    .line 330
    .line 331
    const/16 v32, 0x0

    .line 332
    .line 333
    invoke-static/range {v11 .. v34}, La/tm10;->a(La/tm10;La/io10;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/esr;La/esr;ZLa/jo10;Ljava/lang/String;ZLjava/lang/String;ZJZLa/ho10;Ljava/util/List;ZZZLa/csr;La/ko10;I)La/tm10;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    move-object/from16 v8, v19

    .line 338
    .line 339
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_8

    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_8
    move-object/from16 v19, v8

    .line 347
    .line 348
    goto :goto_2

    .line 349
    :cond_9
    move-object/from16 v8, v19

    .line 350
    .line 351
    iget-boolean v0, v9, La/pn10;->c0:Z

    .line 352
    .line 353
    invoke-virtual {v9, v8, v0}, La/pn10;->T(La/jo10;Z)V

    .line 354
    .line 355
    .line 356
    :cond_a
    :goto_3
    instance-of v0, v1, Ljava/net/UnknownHostException;

    .line 357
    .line 358
    if-nez v0, :cond_b

    .line 359
    .line 360
    if-nez v10, :cond_b

    .line 361
    .line 362
    invoke-virtual {v9, v1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_3
    check-cast v9, La/jie0;

    .line 369
    .line 370
    check-cast v8, La/et8;

    .line 371
    .line 372
    move-object/from16 v1, p1

    .line 373
    .line 374
    check-cast v1, La/t33;

    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    check-cast v3, Ljava/lang/Number;

    .line 384
    .line 385
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    iget v4, v9, La/jie0;->a:F

    .line 390
    .line 391
    sub-float/2addr v3, v4

    .line 392
    float-to-int v3, v3

    .line 393
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    check-cast v4, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    iput v4, v9, La/jie0;->a:F

    .line 404
    .line 405
    if-nez v3, :cond_c

    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_c
    iget-object v4, v8, La/et8;->b:La/zr8;

    .line 409
    .line 410
    if-eqz v4, :cond_d

    .line 411
    .line 412
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    check-cast v1, Ljava/lang/Number;

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 419
    .line 420
    .line 421
    xor-int/2addr v0, v2

    .line 422
    invoke-virtual {v4, v3, v7, v0, v10}, La/zr8;->a(IIZZ)V

    .line 423
    .line 424
    .line 425
    :cond_d
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object v0

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
