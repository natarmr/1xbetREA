.class public final synthetic La/qvn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vvn0;


# direct methods
.method public synthetic constructor <init>(La/vvn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qvn0;->a:B

    iput-object p1, p0, La/qvn0;->b:La/vvn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qvn0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/qvn0;->b:La/vvn0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 11
    .line 12
    invoke-virtual {v0}, La/vvn0;->K0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/prn0;->a:La/prn0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 25
    .line 26
    new-instance v1, La/q0h0;

    .line 27
    .line 28
    iget-object v0, v0, La/vvn0;->Q1:La/a8z;

    .line 29
    .line 30
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/yvi;

    .line 35
    .line 36
    iget-object v0, v0, La/yvi;->I:La/n5d0;

    .line 37
    .line 38
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/wvi;

    .line 43
    .line 44
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_1
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    instance-of v2, v1, La/af3;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    check-cast v1, La/af3;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v1, v3

    .line 70
    :goto_0
    const-class v2, La/xvn0;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, La/o5d0;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/ze3;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-object v1, v3

    .line 94
    :goto_1
    instance-of v4, v1, La/xvn0;

    .line 95
    .line 96
    if-nez v4, :cond_2

    .line 97
    .line 98
    move-object v1, v3

    .line 99
    :cond_2
    check-cast v1, La/xvn0;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 104
    .line 105
    .line 106
    move-result-object v18

    .line 107
    invoke-virtual {v0}, La/vvn0;->I0()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v5, v1, La/xvn0;->a:La/roi0;

    .line 115
    .line 116
    iget-object v2, v1, La/xvn0;->b:La/gst0;

    .line 117
    .line 118
    iget-object v3, v1, La/xvn0;->c:La/knf0;

    .line 119
    .line 120
    iget-object v4, v1, La/xvn0;->d:La/gii0;

    .line 121
    .line 122
    iget-object v6, v1, La/xvn0;->e:La/sjl0;

    .line 123
    .line 124
    iget-object v7, v1, La/xvn0;->f:La/yvn0;

    .line 125
    .line 126
    iget-object v8, v1, La/xvn0;->g:La/q7d0;

    .line 127
    .line 128
    iget-object v9, v1, La/xvn0;->h:La/vby;

    .line 129
    .line 130
    iget-object v10, v1, La/xvn0;->i:La/zfo;

    .line 131
    .line 132
    iget-object v11, v1, La/xvn0;->j:La/edo;

    .line 133
    .line 134
    iget-object v12, v1, La/xvn0;->k:La/wyu;

    .line 135
    .line 136
    iget-object v13, v1, La/xvn0;->m:La/mne;

    .line 137
    .line 138
    iget-object v14, v1, La/xvn0;->n:La/v88;

    .line 139
    .line 140
    iget-object v15, v1, La/xvn0;->o:La/m1e;

    .line 141
    .line 142
    move/from16 p0, v0

    .line 143
    .line 144
    iget-object v0, v1, La/xvn0;->p:La/sa10;

    .line 145
    .line 146
    move-object/from16 v26, v13

    .line 147
    .line 148
    iget-object v13, v1, La/xvn0;->l:La/ii;

    .line 149
    .line 150
    move-object/from16 v28, v15

    .line 151
    .line 152
    iget-object v15, v1, La/xvn0;->q:La/ctf0;

    .line 153
    .line 154
    move-object/from16 v27, v14

    .line 155
    .line 156
    iget-object v14, v1, La/xvn0;->r:La/s31;

    .line 157
    .line 158
    move-object/from16 v17, v12

    .line 159
    .line 160
    iget-object v12, v1, La/xvn0;->s:La/e41;

    .line 161
    .line 162
    move-object/from16 v23, v7

    .line 163
    .line 164
    iget-object v7, v1, La/xvn0;->t:La/wsf0;

    .line 165
    .line 166
    move-object/from16 v29, v0

    .line 167
    .line 168
    iget-object v0, v1, La/xvn0;->u:La/wdk0;

    .line 169
    .line 170
    move-object/from16 v30, v0

    .line 171
    .line 172
    iget-object v0, v1, La/xvn0;->x:La/vwb0;

    .line 173
    .line 174
    move-object/from16 v22, v6

    .line 175
    .line 176
    iget-object v6, v1, La/xvn0;->v:La/iip;

    .line 177
    .line 178
    move-object/from16 v16, v8

    .line 179
    .line 180
    iget-object v8, v1, La/xvn0;->w:La/vqc;

    .line 181
    .line 182
    move-object/from16 v32, v0

    .line 183
    .line 184
    iget-object v0, v1, La/xvn0;->y:La/rou;

    .line 185
    .line 186
    move-object/from16 v33, v0

    .line 187
    .line 188
    iget-object v0, v1, La/xvn0;->z:La/pru;

    .line 189
    .line 190
    move-object/from16 v34, v0

    .line 191
    .line 192
    iget-object v0, v1, La/xvn0;->A:La/duj;

    .line 193
    .line 194
    move-object/from16 v19, v9

    .line 195
    .line 196
    iget-object v9, v1, La/xvn0;->B:La/bzu;

    .line 197
    .line 198
    move-object/from16 v24, v10

    .line 199
    .line 200
    iget-object v10, v1, La/xvn0;->C:La/o2j0;

    .line 201
    .line 202
    move-object/from16 v31, v0

    .line 203
    .line 204
    iget-object v0, v1, La/xvn0;->D:La/j1q0;

    .line 205
    .line 206
    move-object/from16 v35, v0

    .line 207
    .line 208
    iget-object v0, v1, La/xvn0;->E:La/r9u;

    .line 209
    .line 210
    move-object/from16 v36, v0

    .line 211
    .line 212
    iget-object v0, v1, La/xvn0;->F:La/b3c0;

    .line 213
    .line 214
    move-object/from16 v37, v0

    .line 215
    .line 216
    iget-object v0, v1, La/xvn0;->G:La/cmt;

    .line 217
    .line 218
    iget-object v1, v1, La/xvn0;->H:La/fvt0;

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-object/from16 v21, v4

    .line 281
    .line 282
    new-instance v4, La/yvi;

    .line 283
    .line 284
    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 285
    .line 286
    .line 287
    move-result-object v16

    .line 288
    move-object/from16 v38, v0

    .line 289
    .line 290
    move-object/from16 v19, v2

    .line 291
    .line 292
    move-object/from16 v20, v3

    .line 293
    .line 294
    move-object/from16 v25, v11

    .line 295
    .line 296
    move-object v11, v1

    .line 297
    invoke-direct/range {v4 .. v38}, La/yvi;-><init>(La/roi0;La/iip;La/wsf0;La/vqc;La/bzu;La/o2j0;La/fvt0;La/e41;La/ii;La/s31;La/ctf0;Ljava/lang/Boolean;La/wyu;La/i1w0;La/gst0;La/knf0;La/gii0;La/sjl0;La/yvn0;La/zfo;La/edo;La/mne;La/v88;La/m1e;La/sa10;La/wdk0;La/duj;La/vwb0;La/rou;La/pru;La/j1q0;La/r9u;La/b3c0;La/cmt;)V

    .line 298
    .line 299
    .line 300
    move-object v3, v4

    .line 301
    goto :goto_2

    .line 302
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 303
    .line 304
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :goto_2
    return-object v3

    .line 312
    :pswitch_2
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 327
    .line 328
    invoke-static {v0}, La/sj3;->d0(I)I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    const/16 v1, 0x2c6

    .line 333
    .line 334
    if-ge v0, v1, :cond_4

    .line 335
    .line 336
    const/4 v0, 0x1

    .line 337
    goto :goto_3

    .line 338
    :cond_4
    const/4 v0, 0x0

    .line 339
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    :pswitch_3
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 345
    .line 346
    invoke-virtual {v0}, La/vvn0;->K0()La/k3t0;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    sget-object v1, La/yrn0;->a:La/yrn0;

    .line 351
    .line 352
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_4
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 359
    .line 360
    invoke-virtual {v0}, La/vvn0;->K0()La/k3t0;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    sget-object v2, La/xrn0;->a:La/xrn0;

    .line 365
    .line 366
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, La/vvn0;->K0()La/k3t0;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    sget-object v1, La/zrn0;->a:La/zrn0;

    .line 374
    .line 375
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_5
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 382
    .line 383
    invoke-virtual {v0}, La/vvn0;->K0()La/k3t0;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    sget-object v1, La/csn0;->a:La/csn0;

    .line 388
    .line 389
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_6
    sget-object v1, La/vvn0;->W1:La/j6m0;

    .line 396
    .line 397
    invoke-virtual {v0}, La/vvn0;->K0()La/k3t0;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    sget-object v1, La/bsn0;->a:La/bsn0;

    .line 402
    .line 403
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
