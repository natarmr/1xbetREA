.class public final La/tii0;
.super La/sii0;
.source "SourceFile"


# direct methods
.method public static d(La/fpt0;Landroid/util/Size;)La/tii0;
    .locals 11

    .line 1
    sget-object v0, La/fpt0;->E0:La/u15;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, La/r3a;

    .line 9
    .line 10
    if-eqz v0, :cond_11

    .line 11
    .line 12
    new-instance v0, La/tii0;

    .line 13
    .line 14
    invoke-direct {v0}, La/sii0;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v2, La/fpt0;->C0:La/u15;

    .line 21
    .line 22
    invoke-interface {p0, v2, v1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, La/xii0;

    .line 27
    .line 28
    sget-object v3, La/b780;->c:La/b780;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, La/xii0;->a()La/xii0;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v4, v4, La/xii0;->g:La/t7a;

    .line 38
    .line 39
    iget v4, v4, La/t7a;->c:I

    .line 40
    .line 41
    iget-object v5, v0, La/sii0;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v6, v0, La/sii0;->c:Ljava/util/ArrayList;

    .line 44
    .line 45
    iget-object v7, v0, La/sii0;->b:La/ucs0;

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-object v3, v2, La/xii0;->g:La/t7a;

    .line 50
    .line 51
    iget v4, v3, La/t7a;->c:I

    .line 52
    .line 53
    iget-object v8, v2, La/xii0;->c:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 70
    .line 71
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v2, v2, La/xii0;->d:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 99
    .line 100
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-eqz v9, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iget-object v2, v3, La/t7a;->d:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {v7, v2}, La/ucs0;->e(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    iget-object v3, v3, La/t7a;->b:La/b780;

    .line 117
    .line 118
    :cond_4
    invoke-static {v3}, La/wy40;->p(La/drd;)La/wy40;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iput-object v2, v7, La/ucs0;->d:Ljava/lang/Object;

    .line 123
    .line 124
    instance-of v2, p0, La/pub0;

    .line 125
    .line 126
    const/16 v3, 0x14

    .line 127
    .line 128
    if-eqz v2, :cond_7

    .line 129
    .line 130
    sget-object v2, La/rub0;->a:Landroid/util/Rational;

    .line 131
    .line 132
    const-class v2, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 133
    .line 134
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v8, v2}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Landroidx/camera/camera2/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 143
    .line 144
    if-nez v2, :cond_5

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    sget-object v2, La/rub0;->a:Landroid/util/Rational;

    .line 148
    .line 149
    new-instance v8, Landroid/util/Rational;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-direct {v8, v9, p1}, Landroid/util/Rational;-><init>(II)V

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_6

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_6
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    const/4 v8, 0x2

    .line 179
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-static {v2}, La/s5x0;->C(Landroid/hardware/camera2/CaptureRequest$Key;)La/u15;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {p1, v2, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, La/hx9;

    .line 191
    .line 192
    invoke-static {p1}, La/b780;->j(La/drd;)La/b780;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-direct {v2, p1, v3}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7, v2}, La/ucs0;->g(La/drd;)V

    .line 200
    .line 201
    .line 202
    :cond_7
    :goto_2
    new-instance p1, La/hx9;

    .line 203
    .line 204
    sget-object p1, La/hx9;->d:La/u15;

    .line 205
    .line 206
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-interface {p0, p1, v2}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    check-cast p1, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    iput p1, v7, La/ucs0;->b:I

    .line 224
    .line 225
    sget-object p1, La/hx9;->e:La/u15;

    .line 226
    .line 227
    invoke-interface {p0, p1, v1}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 232
    .line 233
    if-eqz p1, :cond_9

    .line 234
    .line 235
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_8

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_8
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :cond_9
    :goto_3
    sget-object p1, La/hx9;->f:La/u15;

    .line 246
    .line 247
    invoke-interface {p0, p1, v1}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 252
    .line 253
    if-eqz p1, :cond_b

    .line 254
    .line 255
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_a

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_a
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :cond_b
    :goto_4
    sget-object p1, La/hx9;->g:La/u15;

    .line 266
    .line 267
    invoke-interface {p0, p1, v1}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 272
    .line 273
    if-eqz p1, :cond_c

    .line 274
    .line 275
    new-instance v2, La/o3a;

    .line 276
    .line 277
    invoke-direct {v2, p1}, La/o3a;-><init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v2}, La/ucs0;->f(La/vx9;)V

    .line 281
    .line 282
    .line 283
    iget-object p1, v0, La/sii0;->e:Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-nez v4, :cond_c

    .line 290
    .line 291
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    :cond_c
    invoke-interface {p0}, La/fpt0;->q()I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-eqz p1, :cond_d

    .line 299
    .line 300
    if-eqz p1, :cond_d

    .line 301
    .line 302
    sget-object v2, La/fpt0;->O0:La/u15;

    .line 303
    .line 304
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    iget-object v4, v7, La/ucs0;->d:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v4, La/wy40;

    .line 311
    .line 312
    invoke-virtual {v4, v2, p1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_d
    invoke-interface {p0}, La/fpt0;->n()I

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    if-eqz p1, :cond_e

    .line 320
    .line 321
    if-eqz p1, :cond_e

    .line 322
    .line 323
    sget-object v2, La/fpt0;->P0:La/u15;

    .line 324
    .line 325
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    iget-object v4, v7, La/ucs0;->d:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v4, La/wy40;

    .line 332
    .line 333
    invoke-virtual {v4, v2, p1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    :cond_e
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    sget-object v2, La/hx9;->j:La/u15;

    .line 341
    .line 342
    invoke-interface {p0, v2, v1}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    check-cast v4, Ljava/lang/String;

    .line 347
    .line 348
    if-eqz v4, :cond_f

    .line 349
    .line 350
    invoke-virtual {p1, v2, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    :cond_f
    sget-object v2, La/hx9;->h:La/u15;

    .line 354
    .line 355
    invoke-interface {p0, v2, v1}, La/drd;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    check-cast v1, Ljava/lang/Long;

    .line 360
    .line 361
    if-eqz v1, :cond_10

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 364
    .line 365
    .line 366
    move-result-wide v4

    .line 367
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-virtual {p1, v2, v1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    :cond_10
    invoke-virtual {v7, p1}, La/ucs0;->g(La/drd;)V

    .line 375
    .line 376
    .line 377
    new-instance p1, La/peg0;

    .line 378
    .line 379
    const/16 v1, 0x13

    .line 380
    .line 381
    invoke-direct {p1, v1}, La/peg0;-><init>(B)V

    .line 382
    .line 383
    .line 384
    new-instance v1, La/uq;

    .line 385
    .line 386
    const/4 v2, 0x3

    .line 387
    invoke-direct {v1, p1, p0, v2}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 388
    .line 389
    .line 390
    invoke-interface {p0, v1}, La/drd;->i(La/uq;)V

    .line 391
    .line 392
    .line 393
    new-instance p0, La/h03;

    .line 394
    .line 395
    iget-object p1, p1, La/peg0;->b:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast p1, La/wy40;

    .line 398
    .line 399
    invoke-static {p1}, La/b780;->j(La/drd;)La/b780;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    invoke-direct {p0, p1, v3}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v7, p0}, La/ucs0;->g(La/drd;)V

    .line 407
    .line 408
    .line 409
    return-object v0

    .line 410
    :cond_11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    sget-object v0, La/xto0;->z0:La/u15;

    .line 415
    .line 416
    invoke-interface {p0, v0, p1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    check-cast p0, Ljava/lang/String;

    .line 421
    .line 422
    const-string p1, "Implementation is missing option unpacker for "

    .line 423
    .line 424
    invoke-static {p0, p1}, La/hny;->w(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    return-object v1
.end method


# virtual methods
.method public final a(La/drd;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/sii0;->b:La/ucs0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ucs0;->g(La/drd;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(La/hzj;La/agn;I)V
    .locals 1

    .line 1
    invoke-static {p1}, La/a55;->a(La/hzj;)La/gr00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iput-object p2, v0, La/gr00;->e:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, v0, La/gr00;->c:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v0}, La/gr00;->g()La/a55;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object p3, p0, La/sii0;->a:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/sii0;->b:La/ucs0;

    .line 25
    .line 26
    iget-object p0, p0, La/ucs0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p0, "Null dynamicRange"

    .line 35
    .line 36
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final c()La/xii0;
    .locals 10

    .line 1
    new-instance v0, La/xii0;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, La/sii0;->a:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v3, p0, La/sii0;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v4, p0, La/sii0;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v5, p0, La/sii0;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, La/sii0;->b:La/ucs0;

    .line 32
    .line 33
    invoke-virtual {v5}, La/ucs0;->j()La/t7a;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, p0, La/sii0;->f:La/uii0;

    .line 38
    .line 39
    iget-object v7, p0, La/sii0;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 40
    .line 41
    iget v8, p0, La/sii0;->h:I

    .line 42
    .line 43
    iget-object v9, p0, La/sii0;->i:La/a55;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v9}, La/xii0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;La/t7a;La/vii0;Landroid/hardware/camera2/params/InputConfiguration;ILa/a55;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method
