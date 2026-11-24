.class public final synthetic La/z060;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b160;


# direct methods
.method public synthetic constructor <init>(La/b160;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z060;->a:B

    iput-object p1, p0, La/z060;->b:La/b160;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z060;->a:B

    .line 4
    .line 5
    sget-object v2, La/ry50;->a:La/ry50;

    .line 6
    .line 7
    iget-object v0, v0, La/z060;->b:La/b160;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/b160;->O1:La/evz;

    .line 13
    .line 14
    invoke-virtual {v0}, La/b160;->H0()La/k3t0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/b160;->O1:La/evz;

    .line 25
    .line 26
    invoke-virtual {v0}, La/b160;->H0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    sget-object v1, La/b160;->O1:La/evz;

    .line 37
    .line 38
    new-instance v1, La/q0h0;

    .line 39
    .line 40
    invoke-virtual {v0}, La/b160;->G0()La/emi;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La/emi;->f0:La/n5d0;

    .line 45
    .line 46
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/dmi;

    .line 51
    .line 52
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :pswitch_2
    sget-object v1, La/b160;->O1:La/evz;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    instance-of v2, v1, La/af3;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    check-cast v1, La/af3;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move-object v1, v3

    .line 78
    :goto_0
    const-class v2, La/c160;

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/o5d0;

    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, La/ze3;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move-object v1, v3

    .line 102
    :goto_1
    instance-of v4, v1, La/c160;

    .line 103
    .line 104
    if-nez v4, :cond_2

    .line 105
    .line 106
    move-object v1, v3

    .line 107
    :cond_2
    check-cast v1, La/c160;

    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 112
    .line 113
    .line 114
    move-result-object v26

    .line 115
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v0, v1, La/c160;->c:La/sue;

    .line 119
    .line 120
    iget-object v2, v1, La/c160;->e:La/lsn;

    .line 121
    .line 122
    iget-object v5, v1, La/c160;->G:La/bw60;

    .line 123
    .line 124
    iget-object v3, v1, La/c160;->f:La/roi0;

    .line 125
    .line 126
    iget-object v4, v1, La/c160;->e0:La/y3v;

    .line 127
    .line 128
    iget-object v7, v1, La/c160;->d:La/bwl;

    .line 129
    .line 130
    iget-object v8, v1, La/c160;->g:La/a1d;

    .line 131
    .line 132
    iget-object v9, v1, La/c160;->a:La/ugf0;

    .line 133
    .line 134
    iget-object v11, v1, La/c160;->b:La/nr00;

    .line 135
    .line 136
    iget-object v12, v1, La/c160;->h:La/itr;

    .line 137
    .line 138
    iget-object v14, v1, La/c160;->j:La/iip;

    .line 139
    .line 140
    iget-object v6, v1, La/c160;->k:La/fvt0;

    .line 141
    .line 142
    iget-object v13, v1, La/c160;->l:La/iw20;

    .line 143
    .line 144
    iget-object v15, v1, La/c160;->m:La/pyg;

    .line 145
    .line 146
    iget-object v10, v1, La/c160;->n:La/dn0;

    .line 147
    .line 148
    move-object/from16 v19, v0

    .line 149
    .line 150
    iget-object v0, v1, La/c160;->o:La/btt0;

    .line 151
    .line 152
    move-object/from16 v16, v0

    .line 153
    .line 154
    iget-object v0, v1, La/c160;->p:La/g2v;

    .line 155
    .line 156
    move-object/from16 v34, v0

    .line 157
    .line 158
    iget-object v0, v1, La/c160;->q:La/mne;

    .line 159
    .line 160
    move-object/from16 v32, v0

    .line 161
    .line 162
    iget-object v0, v1, La/c160;->r:La/duj;

    .line 163
    .line 164
    move-object/from16 v35, v0

    .line 165
    .line 166
    iget-object v0, v1, La/c160;->u:La/j1q0;

    .line 167
    .line 168
    move-object/from16 v29, v10

    .line 169
    .line 170
    iget-object v10, v1, La/c160;->i:La/fvt0;

    .line 171
    .line 172
    move-object/from16 v38, v0

    .line 173
    .line 174
    iget-object v0, v1, La/c160;->v:La/r9u;

    .line 175
    .line 176
    move-object/from16 v39, v0

    .line 177
    .line 178
    iget-object v0, v1, La/c160;->w:La/wsf0;

    .line 179
    .line 180
    move-object/from16 v17, v0

    .line 181
    .line 182
    iget-object v0, v1, La/c160;->s:La/gii0;

    .line 183
    .line 184
    move-object/from16 v18, v0

    .line 185
    .line 186
    iget-object v0, v1, La/c160;->t:La/ort;

    .line 187
    .line 188
    move-object/from16 v37, v0

    .line 189
    .line 190
    iget-object v0, v1, La/c160;->K:La/eot;

    .line 191
    .line 192
    move-object/from16 v55, v0

    .line 193
    .line 194
    iget-object v0, v1, La/c160;->T:La/h3c;

    .line 195
    .line 196
    move-object/from16 v33, v0

    .line 197
    .line 198
    iget-object v0, v1, La/c160;->x:La/y78;

    .line 199
    .line 200
    move-object/from16 v40, v0

    .line 201
    .line 202
    iget-object v0, v1, La/c160;->y:La/s31;

    .line 203
    .line 204
    move-object/from16 v41, v0

    .line 205
    .line 206
    iget-object v0, v1, La/c160;->z:La/m1e;

    .line 207
    .line 208
    move-object/from16 v42, v0

    .line 209
    .line 210
    iget-object v0, v1, La/c160;->C:La/sjl0;

    .line 211
    .line 212
    move-object/from16 v20, v0

    .line 213
    .line 214
    iget-object v0, v1, La/c160;->B:La/v88;

    .line 215
    .line 216
    move-object/from16 v27, v0

    .line 217
    .line 218
    iget-object v0, v1, La/c160;->U:La/clc;

    .line 219
    .line 220
    move-object/from16 v21, v0

    .line 221
    .line 222
    iget-object v0, v1, La/c160;->D:La/ctf0;

    .line 223
    .line 224
    move-object/from16 v43, v0

    .line 225
    .line 226
    iget-object v0, v1, La/c160;->E:La/ii;

    .line 227
    .line 228
    move-object/from16 v44, v0

    .line 229
    .line 230
    iget-object v0, v1, La/c160;->I:La/ali;

    .line 231
    .line 232
    move-object/from16 v45, v0

    .line 233
    .line 234
    iget-object v0, v1, La/c160;->J:La/oct;

    .line 235
    .line 236
    move-object/from16 v46, v0

    .line 237
    .line 238
    iget-object v0, v1, La/c160;->c0:La/xep;

    .line 239
    .line 240
    move-object/from16 v57, v0

    .line 241
    .line 242
    iget-object v0, v1, La/c160;->H:La/jdk0;

    .line 243
    .line 244
    move-object/from16 v47, v0

    .line 245
    .line 246
    iget-object v0, v1, La/c160;->N:La/gst0;

    .line 247
    .line 248
    move-object/from16 v48, v0

    .line 249
    .line 250
    iget-object v0, v1, La/c160;->O:La/ntu;

    .line 251
    .line 252
    move-object/from16 v49, v0

    .line 253
    .line 254
    iget-object v0, v1, La/c160;->S:La/knf0;

    .line 255
    .line 256
    move-object/from16 v50, v0

    .line 257
    .line 258
    iget-object v0, v1, La/c160;->V:La/d1p;

    .line 259
    .line 260
    move-object/from16 v22, v0

    .line 261
    .line 262
    iget-object v0, v1, La/c160;->W:La/xri;

    .line 263
    .line 264
    move-object/from16 v23, v0

    .line 265
    .line 266
    iget-object v0, v1, La/c160;->X:La/wdk0;

    .line 267
    .line 268
    move-object/from16 v51, v0

    .line 269
    .line 270
    iget-object v0, v1, La/c160;->A:La/peg0;

    .line 271
    .line 272
    move-object/from16 v30, v0

    .line 273
    .line 274
    iget-object v0, v1, La/c160;->R:La/edo;

    .line 275
    .line 276
    move-object/from16 v24, v0

    .line 277
    .line 278
    iget-object v0, v1, La/c160;->F:La/qv2;

    .line 279
    .line 280
    move-object/from16 v53, v0

    .line 281
    .line 282
    iget-object v0, v1, La/c160;->Q:La/e720;

    .line 283
    .line 284
    move-object/from16 v36, v0

    .line 285
    .line 286
    iget-object v0, v1, La/c160;->L:La/abp;

    .line 287
    .line 288
    move-object/from16 v25, v0

    .line 289
    .line 290
    iget-object v0, v1, La/c160;->M:La/t6p;

    .line 291
    .line 292
    move-object/from16 v28, v0

    .line 293
    .line 294
    iget-object v0, v1, La/c160;->Y:La/u58;

    .line 295
    .line 296
    move-object/from16 v52, v0

    .line 297
    .line 298
    iget-object v0, v1, La/c160;->P:La/kt2;

    .line 299
    .line 300
    move-object/from16 v31, v0

    .line 301
    .line 302
    iget-object v0, v1, La/c160;->Z:La/uzc;

    .line 303
    .line 304
    move-object/from16 v54, v0

    .line 305
    .line 306
    iget-object v0, v1, La/c160;->a0:La/n4u;

    .line 307
    .line 308
    move-object/from16 v56, v0

    .line 309
    .line 310
    iget-object v0, v1, La/c160;->b0:La/o3c;

    .line 311
    .line 312
    move-object/from16 v58, v0

    .line 313
    .line 314
    iget-object v0, v1, La/c160;->d0:La/wsf0;

    .line 315
    .line 316
    move-object/from16 v59, v0

    .line 317
    .line 318
    iget-object v0, v1, La/c160;->f0:La/viu;

    .line 319
    .line 320
    move-object/from16 v60, v0

    .line 321
    .line 322
    iget-object v0, v1, La/c160;->g0:La/hsj;

    .line 323
    .line 324
    move-object/from16 v61, v0

    .line 325
    .line 326
    iget-object v0, v1, La/c160;->h0:La/rmu0;

    .line 327
    .line 328
    move-object/from16 p0, v0

    .line 329
    .line 330
    iget-object v0, v1, La/c160;->i0:La/poq0;

    .line 331
    .line 332
    iget-object v1, v1, La/c160;->j0:La/kys0;

    .line 333
    .line 334
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v54 .. v54}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v57 .. v57}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    move-object/from16 v25, v4

    .line 410
    .line 411
    new-instance v4, La/emi;

    .line 412
    .line 413
    move-object/from16 v24, v0

    .line 414
    .line 415
    move-object/from16 v18, v21

    .line 416
    .line 417
    move-object/from16 v16, v22

    .line 418
    .line 419
    move-object/from16 v20, v23

    .line 420
    .line 421
    move-object/from16 v28, v31

    .line 422
    .line 423
    move-object/from16 v31, v54

    .line 424
    .line 425
    move-object/from16 v54, v56

    .line 426
    .line 427
    move-object/from16 v56, v58

    .line 428
    .line 429
    move-object/from16 v23, v59

    .line 430
    .line 431
    move-object/from16 v58, v60

    .line 432
    .line 433
    move-object/from16 v59, v61

    .line 434
    .line 435
    move-object/from16 v60, p0

    .line 436
    .line 437
    move-object/from16 v61, v1

    .line 438
    .line 439
    move-object/from16 v21, v2

    .line 440
    .line 441
    move-object/from16 v22, v3

    .line 442
    .line 443
    invoke-direct/range {v4 .. v61}, La/emi;-><init>(La/bw60;La/fvt0;La/bwl;La/a1d;La/ugf0;La/fvt0;La/nr00;La/itr;La/iw20;La/iip;La/pyg;La/d1p;La/wsf0;La/clc;La/sue;La/xri;La/lsn;La/roi0;La/wsf0;La/poq0;La/y3v;La/i1w0;La/v88;La/kt2;La/dn0;La/peg0;La/uzc;La/mne;La/h3c;La/g2v;La/duj;La/e720;La/ort;La/j1q0;La/r9u;La/y78;La/s31;La/m1e;La/ctf0;La/ii;La/ali;La/oct;La/jdk0;La/gst0;La/ntu;La/knf0;La/wdk0;La/u58;La/qv2;La/n4u;La/eot;La/o3c;La/xep;La/viu;La/hsj;La/rmu0;La/kys0;)V

    .line 444
    .line 445
    .line 446
    move-object v3, v4

    .line 447
    goto :goto_2

    .line 448
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 449
    .line 450
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    :goto_2
    return-object v3

    .line 458
    nop

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
