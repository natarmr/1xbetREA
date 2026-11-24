.class public final La/pr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pz40;Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p3, p0, La/pr0;->a:B

    iput-object p1, p0, La/pr0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/pr0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/ExoPlayer;La/jeu0;La/lwk;)V
    .locals 0

    .line 1
    const/16 p3, 0x1a

    .line 2
    .line 3
    iput-byte p3, p0, La/pr0;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/pr0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, La/pr0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/pr0;->a:B

    iput-object p1, p0, La/pr0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/pr0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .line 1
    iget-byte v0, p0, La/pr0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/pr0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, La/pr0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast v2, La/wly;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast p0, La/djv0;

    .line 24
    .line 25
    check-cast v2, Landroid/view/View;

    .line 26
    .line 27
    iget v0, p0, La/djv0;->u:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    iput v0, p0, La/djv0;->u:I

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-static {v2, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v1}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/djv0;->v:La/yfx;

    .line 44
    .line 45
    invoke-virtual {v2, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void

    .line 49
    :pswitch_1
    check-cast p0, Landroid/app/Activity;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    check-cast v2, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/16 v0, 0x30

    .line 69
    .line 70
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void

    .line 74
    :pswitch_2
    check-cast p0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 75
    .line 76
    check-cast v2, La/jeu0;

    .line 77
    .line 78
    move-object v0, p0

    .line 79
    check-cast v0, La/ulo;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, La/ulo;->G(La/ky90;)V

    .line 82
    .line 83
    .line 84
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 85
    .line 86
    check-cast p0, La/ulo;

    .line 87
    .line 88
    invoke-virtual {p0}, La/ulo;->F()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 93
    .line 94
    :goto_1
    return-void

    .line 95
    :pswitch_3
    check-cast p0, La/oms0;

    .line 96
    .line 97
    check-cast v2, La/cms0;

    .line 98
    .line 99
    iget-object p0, p0, La/oms0;->j:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 100
    .line 101
    invoke-virtual {p0, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_4
    check-cast p0, La/oms0;

    .line 106
    .line 107
    check-cast v2, La/vls0;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v0, v2, La/vls0;->b:La/pz40;

    .line 113
    .line 114
    check-cast v0, La/hgk0;

    .line 115
    .line 116
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/uls0;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    iget-object v0, v0, La/uls0;->a:La/cms0;

    .line 125
    .line 126
    iget-object p0, p0, La/oms0;->j:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_3
    return-void

    .line 132
    :pswitch_5
    check-cast p0, La/oms0;

    .line 133
    .line 134
    check-cast v2, La/oms0;

    .line 135
    .line 136
    iget-object p0, p0, La/oms0;->k:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 137
    .line 138
    invoke-virtual {p0, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_6
    check-cast p0, La/e9q0;

    .line 143
    .line 144
    iget-object p0, p0, La/e9q0;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 145
    .line 146
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 147
    .line 148
    invoke-virtual {p0, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_7
    check-cast v2, La/pz40;

    .line 153
    .line 154
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/jub0;

    .line 159
    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    new-instance v3, La/iub0;

    .line 163
    .line 164
    invoke-direct {v3, v0}, La/iub0;-><init>(La/jub0;)V

    .line 165
    .line 166
    .line 167
    check-cast p0, La/gy40;

    .line 168
    .line 169
    if-eqz p0, :cond_4

    .line 170
    .line 171
    invoke-virtual {p0, v3}, La/gy40;->b(La/nlx;)V

    .line 172
    .line 173
    .line 174
    :cond_4
    invoke-interface {v2, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_5
    return-void

    .line 178
    :pswitch_8
    check-cast p0, La/ekf0;

    .line 179
    .line 180
    iget-object p0, p0, La/ekf0;->p:Ljava/util/HashSet;

    .line 181
    .line 182
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_9
    check-cast p0, La/clz;

    .line 187
    .line 188
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    check-cast v2, La/co;

    .line 193
    .line 194
    invoke-virtual {p0, v2}, La/glz;->f(La/blz;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_a
    check-cast p0, La/rb5;

    .line 199
    .line 200
    check-cast v2, La/ckd;

    .line 201
    .line 202
    invoke-virtual {p0, v2}, La/rb5;->b(La/c2;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_b
    check-cast p0, La/rba0;

    .line 207
    .line 208
    if-eqz p0, :cond_6

    .line 209
    .line 210
    check-cast v2, La/my90;

    .line 211
    .line 212
    if-eqz v2, :cond_6

    .line 213
    .line 214
    check-cast v2, La/ulo;

    .line 215
    .line 216
    invoke-virtual {v2, p0}, La/ulo;->G(La/ky90;)V

    .line 217
    .line 218
    .line 219
    :cond_6
    return-void

    .line 220
    :pswitch_c
    check-cast p0, La/d9z;

    .line 221
    .line 222
    invoke-virtual {p0}, La/d9z;->h()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-virtual {p0}, La/d9z;->i()I

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    check-cast v2, La/pz40;

    .line 231
    .line 232
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    new-instance v2, La/dp60;

    .line 239
    .line 240
    invoke-direct {v2, v0, p0}, La/dp60;-><init>(II)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :pswitch_d
    check-cast p0, La/yjd;

    .line 248
    .line 249
    invoke-virtual {p0}, La/af50;->h()V

    .line 250
    .line 251
    .line 252
    check-cast v2, La/gf50;

    .line 253
    .line 254
    iput-object v1, v2, La/gf50;->e:La/yjd;

    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_e
    check-cast p0, La/clz;

    .line 258
    .line 259
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast v2, La/sfd;

    .line 264
    .line 265
    invoke-virtual {p0, v2}, La/glz;->f(La/blz;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_f
    check-cast p0, La/ldz;

    .line 270
    .line 271
    iget-object p0, p0, La/ldz;->c:La/iz40;

    .line 272
    .line 273
    invoke-virtual {p0, v2}, La/iz40;->k(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_10
    check-cast p0, Landroid/view/ViewTreeObserver;

    .line 278
    .line 279
    invoke-virtual {p0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_7

    .line 284
    .line 285
    check-cast v2, La/thq;

    .line 286
    .line 287
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 288
    .line 289
    .line 290
    :cond_7
    return-void

    .line 291
    :pswitch_11
    check-cast p0, La/z7x;

    .line 292
    .line 293
    check-cast v2, La/x7x;

    .line 294
    .line 295
    iget-object p0, p0, La/z7x;->a:La/xz40;

    .line 296
    .line 297
    invoke-virtual {p0, v2}, La/xz40;->j(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :pswitch_12
    check-cast p0, La/i3m;

    .line 302
    .line 303
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    iget-object p0, p0, La/i3m;->a:La/ngk0;

    .line 307
    .line 308
    invoke-virtual {p0, v2}, La/ngk0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_13
    check-cast v2, La/pz40;

    .line 313
    .line 314
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_8

    .line 325
    .line 326
    check-cast p0, La/pz40;

    .line 327
    .line 328
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_8
    return-void

    .line 334
    :pswitch_14
    check-cast p0, La/z6h;

    .line 335
    .line 336
    new-instance v3, La/y6h;

    .line 337
    .line 338
    move-object v5, v2

    .line 339
    check-cast v5, La/i3t0;

    .line 340
    .line 341
    const/4 v9, 0x0

    .line 342
    const/4 v10, 0x1

    .line 343
    const/4 v4, 0x1

    .line 344
    const-class v6, La/k3t0;

    .line 345
    .line 346
    const-string v7, "onAction"

    .line 347
    .line 348
    const-string v8, "onAction(Ljava/lang/Object;)V"

    .line 349
    .line 350
    invoke-direct/range {v3 .. v10}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0, v3}, La/z6h;->a(Lkotlin/jvm/functions/Function1;)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :pswitch_15
    check-cast p0, Landroid/view/View;

    .line 358
    .line 359
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    check-cast v2, La/mr3;

    .line 364
    .line 365
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :pswitch_16
    check-cast p0, La/elf;

    .line 370
    .line 371
    check-cast v2, La/ilf;

    .line 372
    .line 373
    invoke-virtual {p0, v2}, La/yge0;->y(La/ahe0;)V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :pswitch_17
    check-cast p0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 378
    .line 379
    check-cast v2, La/m69;

    .line 380
    .line 381
    check-cast p0, La/ulo;

    .line 382
    .line 383
    invoke-virtual {p0, v2}, La/ulo;->G(La/ky90;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_18
    check-cast p0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 388
    .line 389
    check-cast v2, La/l69;

    .line 390
    .line 391
    check-cast p0, La/ulo;

    .line 392
    .line 393
    invoke-virtual {p0, v2}, La/ulo;->G(La/ky90;)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :pswitch_19
    check-cast p0, Landroid/view/View;

    .line 398
    .line 399
    check-cast v2, La/vv5;

    .line 400
    .line 401
    invoke-virtual {p0, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_1a
    check-cast p0, La/rb5;

    .line 406
    .line 407
    check-cast v2, La/uhd;

    .line 408
    .line 409
    invoke-virtual {p0, v2}, La/rb5;->b(La/c2;)V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :pswitch_1b
    check-cast p0, La/clz;

    .line 414
    .line 415
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast v2, La/g02;

    .line 420
    .line 421
    invoke-virtual {p0, v2}, La/glz;->f(La/blz;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :pswitch_1c
    check-cast p0, Landroid/app/Activity;

    .line 426
    .line 427
    if-eqz p0, :cond_9

    .line 428
    .line 429
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 430
    .line 431
    .line 432
    move-result p0

    .line 433
    const/4 v0, 0x1

    .line 434
    if-ne p0, v0, :cond_9

    .line 435
    .line 436
    check-cast v2, La/pz40;

    .line 437
    .line 438
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 439
    .line 440
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_9
    return-void

    .line 444
    nop

    .line 445
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
