.class public final synthetic La/a7g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a7g0;->a:B

    iput-object p1, p0, La/a7g0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/a7g0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "viewModelFactory"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/a7g0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/wgi0;

    .line 13
    .line 14
    iget-object v0, p0, La/wgi0;->k:[La/ugi0;

    .line 15
    .line 16
    invoke-static {p0, v0}, La/n2x;->D(La/ugi0;[La/ugi0;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p0, La/ldi0;

    .line 26
    .line 27
    iget-object v0, p0, La/ldi0;->H:La/p7m0;

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, La/uci0;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    const/16 v9, 0x7ff

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    invoke-static/range {v1 .. v9}, La/uci0;->a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    check-cast p0, La/cai0;

    .line 59
    .line 60
    iget-object v0, p0, La/cai0;->g:La/p7m0;

    .line 61
    .line 62
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object v1, p0

    .line 67
    check-cast v1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_2
    check-cast p0, La/f2i0;

    .line 84
    .line 85
    sget-object v0, La/f2i0;->q2:La/eke0;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_3
    check-cast p0, La/nxh0;

    .line 101
    .line 102
    sget-object v0, La/n0i0;->R1:La/gne0;

    .line 103
    .line 104
    sget-object v0, La/a0i0;->a:La/a0i0;

    .line 105
    .line 106
    invoke-virtual {p0, v0}, La/nxh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_4
    check-cast p0, La/nxh0;

    .line 113
    .line 114
    sget-object v0, La/n0i0;->R1:La/gne0;

    .line 115
    .line 116
    sget-object v0, La/j0i0;->a:La/j0i0;

    .line 117
    .line 118
    invoke-virtual {p0, v0}, La/nxh0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_5
    check-cast p0, La/n0i0;

    .line 125
    .line 126
    sget-object v0, La/n0i0;->R1:La/gne0;

    .line 127
    .line 128
    iget-object p0, p0, La/n0i0;->L1:La/fiu0;

    .line 129
    .line 130
    if-eqz p0, :cond_2

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v3

    .line 137
    :pswitch_6
    check-cast p0, La/pvh0;

    .line 138
    .line 139
    iget-object v0, p0, La/pvh0;->f:La/oms0;

    .line 140
    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    iget-object v0, v0, La/oms0;->m:La/zbk;

    .line 144
    .line 145
    invoke-virtual {v0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide v0

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    const-wide/16 v0, 0x0

    .line 157
    .line 158
    :goto_0
    iput-wide v0, p0, La/pvh0;->g:J

    .line 159
    .line 160
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_7
    check-cast p0, La/irh0;

    .line 164
    .line 165
    invoke-virtual {p0}, La/irh0;->x()V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_8
    check-cast p0, La/akh0;

    .line 172
    .line 173
    iget-object v0, p0, La/akh0;->a:La/us00;

    .line 174
    .line 175
    iget-object p0, p0, La/akh0;->b:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v0, p0}, La/n2x;->w(La/us00;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :pswitch_9
    check-cast p0, La/kjh0;

    .line 183
    .line 184
    sget-object v0, La/kjh0;->o2:La/gle0;

    .line 185
    .line 186
    iget-object p0, p0, La/kjh0;->k2:La/fiu0;

    .line 187
    .line 188
    if-eqz p0, :cond_4

    .line 189
    .line 190
    return-object p0

    .line 191
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v3

    .line 195
    :pswitch_a
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seabattle/view/SeaBattleView;

    .line 196
    .line 197
    new-instance v0, La/ddh0;

    .line 198
    .line 199
    iget v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seabattle/view/SeaBattleView;->a:I

    .line 200
    .line 201
    iget p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/seabattle/view/SeaBattleView;->b:I

    .line 202
    .line 203
    invoke-direct {v0, v1, p0}, La/ddh0;-><init>(II)V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_b
    check-cast p0, La/vah0;

    .line 208
    .line 209
    sget-object v0, La/xf80;->a:La/lqd;

    .line 210
    .line 211
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, La/bz2;

    .line 216
    .line 217
    iput-object v0, p0, La/vah0;->B:La/bz2;

    .line 218
    .line 219
    if-eqz v0, :cond_5

    .line 220
    .line 221
    new-instance v4, La/az2;

    .line 222
    .line 223
    iget-object v5, v0, La/bz2;->a:Landroid/content/Context;

    .line 224
    .line 225
    iget-object v6, v0, La/bz2;->b:La/w6k;

    .line 226
    .line 227
    iget-wide v7, v0, La/bz2;->c:J

    .line 228
    .line 229
    iget-object v9, v0, La/bz2;->d:La/lh80;

    .line 230
    .line 231
    invoke-direct/range {v4 .. v9}, La/az2;-><init>(Landroid/content/Context;La/w6k;JLa/lh80;)V

    .line 232
    .line 233
    .line 234
    move-object v3, v4

    .line 235
    :cond_5
    iput-object v3, p0, La/vah0;->Y:La/az2;

    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_c
    check-cast p0, La/ebh;

    .line 241
    .line 242
    sget-object v0, La/wfj;->a:La/wfj;

    .line 243
    .line 244
    invoke-virtual {p0, v0}, La/ebh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_d
    check-cast p0, La/ebh;

    .line 251
    .line 252
    sget-object v0, La/ufj;->a:La/ufj;

    .line 253
    .line 254
    invoke-virtual {p0, v0}, La/ebh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_e
    check-cast p0, La/d7h0;

    .line 261
    .line 262
    iget-object p0, p0, La/d7h0;->a:La/gii0;

    .line 263
    .line 264
    const-class v0, La/i6h0;

    .line 265
    .line 266
    sget-object v1, La/sre0;->a:La/tre0;

    .line 267
    .line 268
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    check-cast p0, La/i6h0;

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_f
    check-cast p0, La/f3h0;

    .line 280
    .line 281
    new-instance v0, La/od5;

    .line 282
    .line 283
    invoke-direct {v0, p0}, La/od5;-><init>(Landroid/view/View;)V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_10
    check-cast p0, La/i0h0;

    .line 288
    .line 289
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    new-instance v2, La/ige0;

    .line 294
    .line 295
    invoke-direct {v2, p0, v1}, La/ige0;-><init>(Ljava/lang/Object;B)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v2}, La/glz;->a(La/blz;)V

    .line 299
    .line 300
    .line 301
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_11
    check-cast p0, La/riu0;

    .line 305
    .line 306
    invoke-static {p0}, La/zzg0;->c(La/riu0;)La/b0h0;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :pswitch_12
    check-cast p0, La/izg0;

    .line 312
    .line 313
    iget-object p0, p0, La/izg0;->c:La/nw20;

    .line 314
    .line 315
    if-eqz p0, :cond_7

    .line 316
    .line 317
    sget-object v0, La/lun;->a:La/lun;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    new-array v0, v1, [Lkotlin/Pair;

    .line 323
    .line 324
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, [Lkotlin/Pair;

    .line 329
    .line 330
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {p0, v0}, La/nw20;->q(Landroid/os/Bundle;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result p0

    .line 341
    if-eqz p0, :cond_6

    .line 342
    .line 343
    goto :goto_1

    .line 344
    :cond_6
    move-object v3, v0

    .line 345
    :cond_7
    :goto_1
    return-object v3

    .line 346
    :pswitch_13
    check-cast p0, La/azg0;

    .line 347
    .line 348
    iget-object v0, p0, La/azg0;->a:La/u0h0;

    .line 349
    .line 350
    iget-object v1, p0, La/azg0;->d:Ljava/lang/Object;

    .line 351
    .line 352
    if-eqz v1, :cond_8

    .line 353
    .line 354
    invoke-interface {v0, p0, v1}, La/u0h0;->a(La/azg0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    goto :goto_2

    .line 359
    :cond_8
    const-string p0, "Value should be initialized"

    .line 360
    .line 361
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :goto_2
    return-object v3

    .line 365
    :pswitch_14
    check-cast p0, La/mug0;

    .line 366
    .line 367
    iget-object p0, p0, La/mug0;->k2:La/fiu0;

    .line 368
    .line 369
    if-eqz p0, :cond_9

    .line 370
    .line 371
    return-object p0

    .line 372
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v3

    .line 376
    :pswitch_15
    check-cast p0, La/iw20;

    .line 377
    .line 378
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p0, Ljava/lang/ClassLoader;

    .line 381
    .line 382
    const-string v0, "androidx.window.extensions.WindowExtensionsProvider"

    .line 383
    .line 384
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    const-string v2, "getWindowExtensions"

    .line 392
    .line 393
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    const-string v2, "androidx.window.extensions.WindowExtensions"

    .line 398
    .line 399
    invoke-virtual {p0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result p0

    .line 417
    if-eqz p0, :cond_a

    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 420
    .line 421
    .line 422
    move-result p0

    .line 423
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 424
    .line 425
    .line 426
    move-result p0

    .line 427
    if-eqz p0, :cond_a

    .line 428
    .line 429
    const/4 v1, 0x1

    .line 430
    :cond_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    return-object p0

    .line 435
    :pswitch_16
    check-cast p0, La/htg0;

    .line 436
    .line 437
    sget-object v0, La/gtg0;->b:La/gtg0;

    .line 438
    .line 439
    iput-object v0, p0, La/htg0;->b:La/gtg0;

    .line 440
    .line 441
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object p0

    .line 444
    :pswitch_17
    check-cast p0, La/ckg0;

    .line 445
    .line 446
    iget-object p0, p0, La/ckg0;->c:La/t6n;

    .line 447
    .line 448
    return-object p0

    .line 449
    :pswitch_18
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 450
    .line 451
    sget v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->g:I

    .line 452
    .line 453
    new-instance v0, Landroid/graphics/RectF;

    .line 454
    .line 455
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    int-to-float v1, v1

    .line 460
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 461
    .line 462
    .line 463
    move-result p0

    .line 464
    int-to-float p0, p0

    .line 465
    const/4 v2, 0x0

    .line 466
    invoke-direct {v0, v2, v2, v1, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 467
    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_19
    check-cast p0, La/dq00;

    .line 471
    .line 472
    iget-object p0, p0, La/dq00;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast p0, La/gii0;

    .line 475
    .line 476
    const-class v0, La/o0g0;

    .line 477
    .line 478
    sget-object v1, La/sre0;->a:La/tre0;

    .line 479
    .line 480
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    check-cast p0, La/o0g0;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_1a
    check-cast p0, La/kd30;

    .line 492
    .line 493
    iget-object p0, p0, La/kd30;->a:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast p0, La/gii0;

    .line 496
    .line 497
    const-class v0, La/i6g0;

    .line 498
    .line 499
    sget-object v1, La/sre0;->a:La/tre0;

    .line 500
    .line 501
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    check-cast p0, La/i6g0;

    .line 510
    .line 511
    return-object p0

    .line 512
    :pswitch_1b
    check-cast p0, La/n7g0;

    .line 513
    .line 514
    sget-object v0, La/n7g0;->p2:La/cge0;

    .line 515
    .line 516
    iget-object p0, p0, La/n7g0;->k2:La/fiu0;

    .line 517
    .line 518
    if-eqz p0, :cond_b

    .line 519
    .line 520
    return-object p0

    .line 521
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    throw v3

    .line 525
    :pswitch_1c
    check-cast p0, La/c7g0;

    .line 526
    .line 527
    sget-object v0, La/c7g0;->P1:La/gne0;

    .line 528
    .line 529
    iget-object p0, p0, La/c7g0;->L1:La/fiu0;

    .line 530
    .line 531
    if-eqz p0, :cond_c

    .line 532
    .line 533
    return-object p0

    .line 534
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw v3

    .line 538
    nop

    .line 539
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
