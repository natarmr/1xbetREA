.class public final synthetic La/jw5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jw5;->a:B

    iput-object p1, p0, La/jw5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-byte p1, p0, La/jw5;->a:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/jw5;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 13
    .line 14
    sget p1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->q:I

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->f:F

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->h:F

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->g:F

    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->h:F

    .line 52
    .line 53
    iget p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->g:F

    .line 54
    .line 55
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->f:F

    .line 56
    .line 57
    sub-float/2addr p1, p2

    .line 58
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    iget p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->g:F

    .line 62
    .line 63
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->f:F

    .line 64
    .line 65
    iget p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->h:F

    .line 66
    .line 67
    const/4 p2, 0x0

    .line 68
    sub-float p1, p2, p1

    .line 69
    .line 70
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 71
    .line 72
    .line 73
    iput p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->h:F

    .line 74
    .line 75
    :cond_1
    :goto_0
    return v2

    .line 76
    :pswitch_0
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_2

    .line 83
    .line 84
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 85
    .line 86
    invoke-static {p0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    const/16 p2, 0x8

    .line 93
    .line 94
    iget-object p1, p1, La/xiv0;->a:La/uiv0;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, La/uiv0;->u(I)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ne p1, v3, :cond_2

    .line 101
    .line 102
    invoke-static {p0}, La/j120;->X(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return v2

    .line 106
    :pswitch_1
    check-cast p0, La/zo90;

    .line 107
    .line 108
    sget-object p1, La/zo90;->p2:La/fl70;

    .line 109
    .line 110
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0}, La/zo90;->W0()La/es90;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    iget-object p1, p0, La/es90;->e:Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 121
    .line 122
    instance-of p1, p1, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 123
    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    iget-object p0, p0, La/es90;->j:La/cyu;

    .line 127
    .line 128
    invoke-virtual {p0}, La/cyu;->z()V

    .line 129
    .line 130
    .line 131
    :cond_3
    return v2

    .line 132
    :pswitch_2
    check-cast p0, La/cp;

    .line 133
    .line 134
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-ne p1, v3, :cond_4

    .line 139
    .line 140
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 141
    .line 142
    check-cast p0, La/fz60;

    .line 143
    .line 144
    iget-object p0, p0, La/fz60;->b:Landroid/widget/CheckBox;

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 147
    .line 148
    .line 149
    :cond_4
    return v3

    .line 150
    :pswitch_3
    check-cast p0, La/s730;

    .line 151
    .line 152
    sget-object p1, La/s730;->Q1:La/atz;

    .line 153
    .line 154
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    if-eq p1, v3, :cond_6

    .line 161
    .line 162
    if-eq p1, v1, :cond_5

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_5
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    iget-object p0, p0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 170
    .line 171
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->b(FF)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 188
    .line 189
    invoke-virtual {p0}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->c()V

    .line 190
    .line 191
    .line 192
    iput-boolean v2, p0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->v:Z

    .line 193
    .line 194
    iget-object p1, p0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->B:Lkotlin/jvm/functions/Function0;

    .line 195
    .line 196
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    const/high16 p1, -0x40800000    # -1.0f

    .line 200
    .line 201
    iput p1, p0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->x:F

    .line 202
    .line 203
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_7
    invoke-virtual {p0}, La/s730;->G0()La/z1r;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    iget-object p0, p0, La/z1r;->b:Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 212
    .line 213
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->b(FF)V

    .line 222
    .line 223
    .line 224
    :goto_1
    return v3

    .line 225
    :pswitch_4
    check-cast p0, La/wik;

    .line 226
    .line 227
    sget-object p1, La/a3x;->a2:La/bst;

    .line 228
    .line 229
    :try_start_0
    iget-object p0, p0, La/wik;->d:Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 230
    .line 231
    invoke-virtual {p0, p2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :catch_0
    move-exception p0

    .line 236
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 237
    .line 238
    .line 239
    :goto_2
    return v3

    .line 240
    :pswitch_5
    check-cast p0, La/c0x;

    .line 241
    .line 242
    :try_start_1
    iget-object p0, p0, La/c0x;->d:La/uk5;

    .line 243
    .line 244
    iget-object p0, p0, La/uk5;->f:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 247
    .line 248
    invoke-virtual {p0, p2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 249
    .line 250
    .line 251
    :catch_1
    return v3

    .line 252
    :pswitch_6
    check-cast p0, La/b8t;

    .line 253
    .line 254
    sget-object p1, La/b8t;->Q1:[La/iiy;

    .line 255
    .line 256
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_b

    .line 261
    .line 262
    if-eq p1, v3, :cond_8

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    invoke-virtual {p0}, La/b8t;->H0()La/c8t;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iget-object p0, p0, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 270
    .line 271
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    iget-boolean v0, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->i1:Z

    .line 280
    .line 281
    if-nez v0, :cond_c

    .line 282
    .line 283
    iget-object v0, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->u1:La/m9t;

    .line 284
    .line 285
    sget-object v1, La/m9t;->e:La/m9t;

    .line 286
    .line 287
    if-ne v0, v1, :cond_9

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_9
    iget-object v0, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->h1:Ljava/util/List;

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_c

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, La/l4i0;

    .line 307
    .line 308
    iget v2, v1, La/l4i0;->b:I

    .line 309
    .line 310
    invoke-virtual {p0, v2}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j(I)I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    iget v4, v1, La/l4i0;->a:I

    .line 315
    .line 316
    invoke-virtual {p0, v4}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->k(I)I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    iget v5, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j:I

    .line 321
    .line 322
    add-int v6, v2, v5

    .line 323
    .line 324
    float-to-int v7, p1

    .line 325
    if-gt v2, v7, :cond_a

    .line 326
    .line 327
    if-gt v7, v6, :cond_a

    .line 328
    .line 329
    add-int/2addr v5, v4

    .line 330
    float-to-int v2, p2

    .line 331
    if-gt v4, v2, :cond_a

    .line 332
    .line 333
    if-gt v2, v5, :cond_a

    .line 334
    .line 335
    iget-boolean v2, v1, La/l4i0;->f:Z

    .line 336
    .line 337
    if-eqz v2, :cond_a

    .line 338
    .line 339
    iget-object v2, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->h1:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    iput v2, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j1:I

    .line 346
    .line 347
    iget v1, v1, La/l4i0;->d:I

    .line 348
    .line 349
    iput v1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->r1:I

    .line 350
    .line 351
    sget-object v1, La/m9t;->e:La/m9t;

    .line 352
    .line 353
    iput-object v1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->u1:La/m9t;

    .line 354
    .line 355
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 356
    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_b
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    invoke-virtual {p0}, La/a9t;->y()V

    .line 364
    .line 365
    .line 366
    :cond_c
    :goto_4
    return v3

    .line 367
    :pswitch_7
    check-cast p0, Landroid/view/GestureDetector;

    .line 368
    .line 369
    invoke-virtual {p0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 370
    .line 371
    .line 372
    return v3

    .line 373
    :pswitch_8
    check-cast p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;

    .line 374
    .line 375
    sget p1, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->c:I

    .line 376
    .line 377
    invoke-virtual {p0}, Landroid/view/View;->getTouchDelegate()Landroid/view/TouchDelegate;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    if-eqz p0, :cond_d

    .line 382
    .line 383
    invoke-virtual {p0, p2}, Landroid/view/TouchDelegate;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    :cond_d
    return v2

    .line 388
    :pswitch_9
    check-cast p0, La/stl;

    .line 389
    .line 390
    sget-object p1, La/stl;->f2:[La/iiy;

    .line 391
    .line 392
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_12

    .line 397
    .line 398
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    if-eqz p1, :cond_12

    .line 403
    .line 404
    iget-boolean p1, p0, La/stl;->d2:Z

    .line 405
    .line 406
    if-eqz p1, :cond_e

    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_e
    iget-object p1, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 410
    .line 411
    if-eqz p1, :cond_11

    .line 412
    .line 413
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-eq v1, v0, :cond_10

    .line 418
    .line 419
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 420
    .line 421
    .line 422
    move-result p2

    .line 423
    if-ne p2, v3, :cond_f

    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_f
    move p2, v2

    .line 427
    goto :goto_6

    .line 428
    :cond_10
    :goto_5
    move p2, v3

    .line 429
    :goto_6
    iput-boolean p2, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 430
    .line 431
    :cond_11
    iget-boolean p1, p0, La/stl;->a2:Z

    .line 432
    .line 433
    if-eqz p1, :cond_12

    .line 434
    .line 435
    iget-boolean p1, p0, La/sik;->N1:Z

    .line 436
    .line 437
    if-eqz p1, :cond_12

    .line 438
    .line 439
    iget-object p1, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 440
    .line 441
    if-eqz p1, :cond_12

    .line 442
    .line 443
    iget-boolean p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 444
    .line 445
    if-ne p1, v3, :cond_12

    .line 446
    .line 447
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    if-nez p1, :cond_12

    .line 452
    .line 453
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 454
    .line 455
    if-eqz p0, :cond_12

    .line 456
    .line 457
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    .line 458
    .line 459
    .line 460
    :cond_12
    :goto_7
    return v2

    .line 461
    :pswitch_a
    check-cast p0, La/til;

    .line 462
    .line 463
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 464
    .line 465
    .line 466
    move-result p1

    .line 467
    if-ne p1, v3, :cond_15

    .line 468
    .line 469
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 470
    .line 471
    .line 472
    move-result-wide p1

    .line 473
    iget-wide v0, p0, La/til;->o:J

    .line 474
    .line 475
    sub-long/2addr p1, v0

    .line 476
    const-wide/16 v0, 0x0

    .line 477
    .line 478
    cmp-long v0, p1, v0

    .line 479
    .line 480
    if-ltz v0, :cond_13

    .line 481
    .line 482
    const-wide/16 v0, 0x12c

    .line 483
    .line 484
    cmp-long p1, p1, v0

    .line 485
    .line 486
    if-lez p1, :cond_14

    .line 487
    .line 488
    :cond_13
    iput-boolean v2, p0, La/til;->m:Z

    .line 489
    .line 490
    :cond_14
    invoke-virtual {p0}, La/til;->t()V

    .line 491
    .line 492
    .line 493
    iput-boolean v3, p0, La/til;->m:Z

    .line 494
    .line 495
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 496
    .line 497
    .line 498
    move-result-wide p1

    .line 499
    iput-wide p1, p0, La/til;->o:J

    .line 500
    .line 501
    :cond_15
    return v2

    .line 502
    :pswitch_b
    check-cast p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 503
    .line 504
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;->o2:Landroid/view/GestureDetector;

    .line 505
    .line 506
    invoke-virtual {p0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 507
    .line 508
    .line 509
    return v2

    .line 510
    :pswitch_c
    check-cast p0, La/axe;

    .line 511
    .line 512
    sget-object p1, La/axe;->e2:La/kud;

    .line 513
    .line 514
    invoke-virtual {p0}, La/axe;->G0()Z

    .line 515
    .line 516
    .line 517
    move-result p0

    .line 518
    return p0

    .line 519
    :pswitch_d
    check-cast p0, La/nw5;

    .line 520
    .line 521
    sget-object p1, La/nw5;->d2:[La/iiy;

    .line 522
    .line 523
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 524
    .line 525
    .line 526
    move-result p1

    .line 527
    if-eqz p1, :cond_1a

    .line 528
    .line 529
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    if-eqz p1, :cond_1a

    .line 534
    .line 535
    iget-boolean p1, p0, La/nw5;->Z1:Z

    .line 536
    .line 537
    if-eqz p1, :cond_16

    .line 538
    .line 539
    goto :goto_a

    .line 540
    :cond_16
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    if-eqz p1, :cond_19

    .line 545
    .line 546
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    if-eq v1, v0, :cond_18

    .line 551
    .line 552
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 553
    .line 554
    .line 555
    move-result p2

    .line 556
    if-ne p2, v3, :cond_17

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_17
    move p2, v2

    .line 560
    goto :goto_9

    .line 561
    :cond_18
    :goto_8
    move p2, v3

    .line 562
    :goto_9
    iput-boolean p2, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 563
    .line 564
    :cond_19
    iget-boolean p1, p0, La/nw5;->a2:Z

    .line 565
    .line 566
    if-eqz p1, :cond_1a

    .line 567
    .line 568
    iget-boolean p1, p0, La/sik;->N1:Z

    .line 569
    .line 570
    if-eqz p1, :cond_1a

    .line 571
    .line 572
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    if-eqz p1, :cond_1a

    .line 577
    .line 578
    iget-boolean p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 579
    .line 580
    if-ne p1, v3, :cond_1a

    .line 581
    .line 582
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 583
    .line 584
    .line 585
    move-result p1

    .line 586
    if-nez p1, :cond_1a

    .line 587
    .line 588
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 589
    .line 590
    if-eqz p0, :cond_1a

    .line 591
    .line 592
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    .line 593
    .line 594
    .line 595
    :cond_1a
    :goto_a
    return v2

    .line 596
    nop

    .line 597
    :pswitch_data_0
    .packed-switch 0x0
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
