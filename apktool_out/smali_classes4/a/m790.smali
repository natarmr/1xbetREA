.class public final synthetic La/m790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r790;


# direct methods
.method public synthetic constructor <init>(La/r790;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m790;->a:B

    iput-object p1, p0, La/m790;->b:La/r790;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m790;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "android.permission.CAMERA"

    .line 7
    .line 8
    sget-object v4, La/j490;->a:La/j490;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v0, v0, La/m790;->b:La/r790;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 17
    .line 18
    new-array v1, v2, [Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v3, v1}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, La/khf0;->d()La/qog0;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    :cond_0
    return-object v5

    .line 31
    :pswitch_0
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 32
    .line 33
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-array v2, v2, [Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0, v1, v2}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, La/khf0;->d()La/qog0;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    :cond_1
    return-object v5

    .line 50
    :pswitch_1
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 51
    .line 52
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    filled-new-array {v1}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v0, v3, v1}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, La/khf0;->d()La/qog0;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :cond_2
    return-object v5

    .line 71
    :pswitch_2
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 72
    .line 73
    invoke-virtual {v0}, La/r790;->G0()La/mni;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v1, v1, La/mni;->E:La/n5d0;

    .line 78
    .line 79
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/lni;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v0, v0, La/agd;->i:La/yfd;

    .line 90
    .line 91
    new-instance v2, La/qm90;

    .line 92
    .line 93
    iget-object v1, v1, La/lni;->a:La/omi;

    .line 94
    .line 95
    iget-object v1, v1, La/omi;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, La/mni;

    .line 98
    .line 99
    iget-object v1, v1, La/mni;->r:La/zri;

    .line 100
    .line 101
    invoke-direct {v2, v0, v1}, La/qm90;-><init>(La/yfd;La/zri;)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :pswitch_3
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 106
    .line 107
    new-instance v1, La/q0h0;

    .line 108
    .line 109
    invoke-virtual {v0}, La/r790;->G0()La/mni;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v0, v0, La/mni;->D:La/n5d0;

    .line 114
    .line 115
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, La/kni;

    .line 120
    .line 121
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_4
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    instance-of v2, v1, La/af3;

    .line 139
    .line 140
    if-eqz v2, :cond_3

    .line 141
    .line 142
    check-cast v1, La/af3;

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    move-object v1, v5

    .line 146
    :goto_0
    const-class v2, La/s790;

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, La/o5d0;

    .line 159
    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/ze3;

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    move-object v1, v5

    .line 170
    :goto_1
    instance-of v3, v1, La/s790;

    .line 171
    .line 172
    if-nez v3, :cond_5

    .line 173
    .line 174
    move-object v1, v5

    .line 175
    :cond_5
    check-cast v1, La/s790;

    .line 176
    .line 177
    if-eqz v1, :cond_6

    .line 178
    .line 179
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    new-instance v15, La/k790;

    .line 184
    .line 185
    iget-object v2, v0, La/r790;->X1:La/cgx0;

    .line 186
    .line 187
    sget-object v3, La/r790;->a2:[La/iiy;

    .line 188
    .line 189
    const/4 v4, 0x3

    .line 190
    aget-object v4, v3, v4

    .line 191
    .line 192
    invoke-virtual {v2, v0, v4}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    iget-object v4, v0, La/r790;->V1:La/r34;

    .line 201
    .line 202
    const/4 v5, 0x1

    .line 203
    aget-object v5, v3, v5

    .line 204
    .line 205
    invoke-virtual {v4, v0, v5}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 210
    .line 211
    .line 212
    move-result-wide v4

    .line 213
    iget-object v6, v0, La/r790;->W1:La/phf0;

    .line 214
    .line 215
    const/4 v7, 0x2

    .line 216
    aget-object v3, v3, v7

    .line 217
    .line 218
    invoke-virtual {v6, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-direct {v15, v0, v4, v5, v2}, La/k790;-><init>(Ljava/lang/String;JZ)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v7, v1, La/s790;->h:La/zas0;

    .line 229
    .line 230
    iget-object v10, v1, La/s790;->i:La/d1p;

    .line 231
    .line 232
    iget-object v8, v1, La/s790;->n:La/zx10;

    .line 233
    .line 234
    iget-object v0, v1, La/s790;->a:La/hse0;

    .line 235
    .line 236
    iget-object v9, v1, La/s790;->e:La/pv00;

    .line 237
    .line 238
    iget-object v2, v1, La/s790;->b:La/rou;

    .line 239
    .line 240
    iget-object v3, v1, La/s790;->c:La/buo0;

    .line 241
    .line 242
    iget-object v12, v1, La/s790;->d:La/lp4;

    .line 243
    .line 244
    iget-object v11, v1, La/s790;->o:La/wsf0;

    .line 245
    .line 246
    iget-object v4, v1, La/s790;->f:La/vd1;

    .line 247
    .line 248
    iget-object v5, v1, La/s790;->g:La/duj;

    .line 249
    .line 250
    iget-object v6, v1, La/s790;->j:La/mne;

    .line 251
    .line 252
    iget-object v13, v1, La/s790;->p:La/ii;

    .line 253
    .line 254
    move-object/from16 v16, v0

    .line 255
    .line 256
    iget-object v0, v1, La/s790;->k:La/ctf0;

    .line 257
    .line 258
    move-object/from16 v22, v0

    .line 259
    .line 260
    iget-object v0, v1, La/s790;->l:La/pru;

    .line 261
    .line 262
    move-object/from16 v23, v0

    .line 263
    .line 264
    iget-object v0, v1, La/s790;->m:La/zri;

    .line 265
    .line 266
    move-object/from16 v24, v0

    .line 267
    .line 268
    iget-object v0, v1, La/s790;->q:La/ntu;

    .line 269
    .line 270
    move-object/from16 v25, v0

    .line 271
    .line 272
    iget-object v0, v1, La/s790;->r:La/grj;

    .line 273
    .line 274
    move-object/from16 v26, v0

    .line 275
    .line 276
    iget-object v0, v1, La/s790;->s:La/wdk0;

    .line 277
    .line 278
    move-object/from16 v27, v0

    .line 279
    .line 280
    iget-object v0, v1, La/s790;->t:La/i7u0;

    .line 281
    .line 282
    move-object/from16 v28, v0

    .line 283
    .line 284
    iget-object v0, v1, La/s790;->u:La/gst0;

    .line 285
    .line 286
    move-object/from16 v29, v0

    .line 287
    .line 288
    iget-object v0, v1, La/s790;->v:La/ocl;

    .line 289
    .line 290
    move-object/from16 v30, v0

    .line 291
    .line 292
    iget-object v0, v1, La/s790;->w:La/vby;

    .line 293
    .line 294
    iget-object v1, v1, La/s790;->x:La/ony;

    .line 295
    .line 296
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-object/from16 v21, v6

    .line 324
    .line 325
    new-instance v6, La/mni;

    .line 326
    .line 327
    move-object/from16 v31, v0

    .line 328
    .line 329
    move-object/from16 v32, v1

    .line 330
    .line 331
    move-object/from16 v17, v2

    .line 332
    .line 333
    move-object/from16 v18, v3

    .line 334
    .line 335
    move-object/from16 v19, v4

    .line 336
    .line 337
    move-object/from16 v20, v5

    .line 338
    .line 339
    invoke-direct/range {v6 .. v32}, La/mni;-><init>(La/zas0;La/zx10;La/pv00;La/d1p;La/wsf0;La/lp4;La/ii;La/i1w0;La/k790;La/hse0;La/rou;La/buo0;La/vd1;La/duj;La/mne;La/ctf0;La/pru;La/zri;La/ntu;La/grj;La/wdk0;La/i7u0;La/gst0;La/ocl;La/vby;La/ony;)V

    .line 340
    .line 341
    .line 342
    move-object v5, v6

    .line 343
    goto :goto_2

    .line 344
    :cond_6
    const-string v0, "Cannot create dependency "

    .line 345
    .line 346
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :goto_2
    return-object v5

    .line 354
    :pswitch_5
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 355
    .line 356
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 361
    .line 362
    invoke-static {v1}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    const-string v2, "package"

    .line 367
    .line 368
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-static {v2, v3, v5}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 377
    .line 378
    .line 379
    const/16 v2, 0x22b

    .line 380
    .line 381
    invoke-virtual {v0, v1, v2}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 382
    .line 383
    .line 384
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object v0

    .line 387
    :pswitch_6
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 388
    .line 389
    invoke-virtual {v0}, La/r790;->I0()La/k3t0;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_7
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 400
    .line 401
    invoke-virtual {v0}, La/r790;->I0()La/k3t0;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v0, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_8
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 412
    .line 413
    invoke-virtual {v0}, La/r790;->I0()La/k3t0;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    sget-object v1, La/k490;->a:La/k490;

    .line 418
    .line 419
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_9
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 426
    .line 427
    invoke-virtual {v0}, La/r790;->I0()La/k3t0;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v0, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_a
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 438
    .line 439
    invoke-virtual {v0}, La/r790;->I0()La/k3t0;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    sget-object v1, La/n490;->a:La/n490;

    .line 444
    .line 445
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
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
