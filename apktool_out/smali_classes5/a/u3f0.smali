.class public final synthetic La/u3f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z3f0;


# direct methods
.method public synthetic constructor <init>(La/z3f0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u3f0;->a:B

    iput-object p1, p0, La/u3f0;->b:La/z3f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u3f0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/u3f0;->b:La/z3f0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/z3f0;->H0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/p3f0;->a:La/p3f0;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 26
    .line 27
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La/z3f0;->H0()La/k3t0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, La/q2f0;->a:La/q2f0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_1
    new-instance v1, La/q0h0;

    .line 43
    .line 44
    iget-object v0, v0, La/z3f0;->L1:La/jri;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_0
    const-string v0, "viewModelFactory"

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :pswitch_2
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 59
    .line 60
    invoke-virtual {v0}, La/z3f0;->H0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, La/t2f0;->a:La/t2f0;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_3
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    instance-of v3, v1, La/af3;

    .line 86
    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    check-cast v1, La/af3;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move-object v1, v2

    .line 93
    :goto_0
    const-class v3, La/a4f0;

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/o5d0;

    .line 106
    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, La/ze3;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    move-object v1, v2

    .line 117
    :goto_1
    instance-of v4, v1, La/a4f0;

    .line 118
    .line 119
    if-nez v4, :cond_3

    .line 120
    .line 121
    move-object v1, v2

    .line 122
    :cond_3
    check-cast v1, La/a4f0;

    .line 123
    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 127
    .line 128
    .line 129
    move-result-object v41

    .line 130
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v10, v1, La/a4f0;->p:La/cyh;

    .line 134
    .line 135
    iget-object v0, v1, La/a4f0;->e:La/bzs0;

    .line 136
    .line 137
    iget-object v2, v1, La/a4f0;->d:La/yox;

    .line 138
    .line 139
    iget-object v3, v1, La/a4f0;->r:La/z4w0;

    .line 140
    .line 141
    iget-object v8, v1, La/a4f0;->b:La/cad;

    .line 142
    .line 143
    iget-object v4, v1, La/a4f0;->c:La/vue0;

    .line 144
    .line 145
    iget-object v5, v1, La/a4f0;->q:La/ii;

    .line 146
    .line 147
    iget-object v6, v1, La/a4f0;->s:La/lbu;

    .line 148
    .line 149
    iget-object v7, v1, La/a4f0;->t:La/lhf0;

    .line 150
    .line 151
    iget-object v9, v1, La/a4f0;->l:La/ane0;

    .line 152
    .line 153
    iget-object v11, v1, La/a4f0;->m:La/pru;

    .line 154
    .line 155
    iget-object v12, v1, La/a4f0;->o:La/b8u;

    .line 156
    .line 157
    iget-object v13, v1, La/a4f0;->n:La/ntu;

    .line 158
    .line 159
    iget-object v14, v1, La/a4f0;->u:La/ctf0;

    .line 160
    .line 161
    move-object/from16 v21, v11

    .line 162
    .line 163
    iget-object v11, v1, La/a4f0;->v:La/duj;

    .line 164
    .line 165
    iget-object v15, v1, La/a4f0;->i:La/pp90;

    .line 166
    .line 167
    move-object/from16 v40, v0

    .line 168
    .line 169
    iget-object v0, v1, La/a4f0;->j:La/lef0;

    .line 170
    .line 171
    move-object/from16 v34, v0

    .line 172
    .line 173
    iget-object v0, v1, La/a4f0;->k:La/wsf0;

    .line 174
    .line 175
    move-object/from16 v36, v0

    .line 176
    .line 177
    iget-object v0, v1, La/a4f0;->f:La/rl70;

    .line 178
    .line 179
    move-object/from16 v28, v0

    .line 180
    .line 181
    iget-object v0, v1, La/a4f0;->g:La/eke0;

    .line 182
    .line 183
    move-object/from16 v30, v0

    .line 184
    .line 185
    iget-object v0, v1, La/a4f0;->h:La/pek0;

    .line 186
    .line 187
    move-object/from16 v39, v0

    .line 188
    .line 189
    iget-object v0, v1, La/a4f0;->w:La/n4u;

    .line 190
    .line 191
    move-object/from16 v16, v0

    .line 192
    .line 193
    iget-object v0, v1, La/a4f0;->a:La/daf;

    .line 194
    .line 195
    invoke-virtual {v0}, La/daf;->h()La/xte0;

    .line 196
    .line 197
    .line 198
    move-result-object v32

    .line 199
    iget-object v0, v1, La/a4f0;->x:La/kt2;

    .line 200
    .line 201
    move-object/from16 v37, v14

    .line 202
    .line 203
    iget-object v14, v1, La/a4f0;->y:La/aqt;

    .line 204
    .line 205
    move-object/from16 v17, v0

    .line 206
    .line 207
    iget-object v0, v1, La/a4f0;->z:La/knf0;

    .line 208
    .line 209
    move-object/from16 v18, v0

    .line 210
    .line 211
    iget-object v0, v1, La/a4f0;->A:La/lme0;

    .line 212
    .line 213
    move-object/from16 v19, v18

    .line 214
    .line 215
    move-object/from16 v18, v6

    .line 216
    .line 217
    iget-object v6, v1, La/a4f0;->B:La/s64;

    .line 218
    .line 219
    move-object/from16 v31, v0

    .line 220
    .line 221
    iget-object v0, v1, La/a4f0;->D:La/sv3;

    .line 222
    .line 223
    move-object/from16 v35, v7

    .line 224
    .line 225
    iget-object v7, v1, La/a4f0;->E:La/gqc;

    .line 226
    .line 227
    move-object/from16 v20, v0

    .line 228
    .line 229
    iget-object v0, v1, La/a4f0;->F:La/q7d0;

    .line 230
    .line 231
    move-object/from16 v22, v0

    .line 232
    .line 233
    iget-object v0, v1, La/a4f0;->G:La/wdk0;

    .line 234
    .line 235
    move-object/from16 v23, v9

    .line 236
    .line 237
    iget-object v9, v1, La/a4f0;->H:La/m1e;

    .line 238
    .line 239
    move-object/from16 v38, v0

    .line 240
    .line 241
    iget-object v0, v1, La/a4f0;->I:La/ieu;

    .line 242
    .line 243
    move-object/from16 v24, v0

    .line 244
    .line 245
    iget-object v0, v1, La/a4f0;->J:La/kd30;

    .line 246
    .line 247
    move-object/from16 v25, v22

    .line 248
    .line 249
    move-object/from16 v22, v13

    .line 250
    .line 251
    iget-object v13, v1, La/a4f0;->K:La/rpt;

    .line 252
    .line 253
    move-object/from16 v29, v15

    .line 254
    .line 255
    iget-object v15, v1, La/a4f0;->C:La/tqt;

    .line 256
    .line 257
    move-object/from16 v26, v0

    .line 258
    .line 259
    iget-object v0, v1, La/a4f0;->L:La/yox;

    .line 260
    .line 261
    move-object/from16 v27, v17

    .line 262
    .line 263
    move-object/from16 v17, v12

    .line 264
    .line 265
    iget-object v12, v1, La/a4f0;->M:La/sek;

    .line 266
    .line 267
    move-object/from16 v33, v0

    .line 268
    .line 269
    iget-object v0, v1, La/a4f0;->N:La/mi70;

    .line 270
    .line 271
    move-object/from16 v42, v0

    .line 272
    .line 273
    iget-object v0, v1, La/a4f0;->O:La/hru;

    .line 274
    .line 275
    move-object/from16 p0, v0

    .line 276
    .line 277
    iget-object v0, v1, La/a4f0;->P:La/nh70;

    .line 278
    .line 279
    iget-object v1, v1, La/a4f0;->Q:La/ba50;

    .line 280
    .line 281
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-object/from16 v23, v33

    .line 321
    .line 322
    move-object/from16 v33, v4

    .line 323
    .line 324
    new-instance v4, La/kri;

    .line 325
    .line 326
    move-object/from16 v20, p0

    .line 327
    .line 328
    move-object/from16 v19, v24

    .line 329
    .line 330
    move-object/from16 v25, v26

    .line 331
    .line 332
    move-object/from16 v27, v42

    .line 333
    .line 334
    move-object/from16 v26, v0

    .line 335
    .line 336
    move-object/from16 v24, v2

    .line 337
    .line 338
    move-object/from16 v42, v3

    .line 339
    .line 340
    invoke-direct/range {v4 .. v42}, La/kri;-><init>(La/ii;La/s64;La/gqc;La/cad;La/m1e;La/cyh;La/duj;La/sek;La/rpt;La/aqt;La/tqt;La/n4u;La/b8u;La/lbu;La/ieu;La/hru;La/pru;La/ntu;La/yox;La/yox;La/kd30;La/nh70;La/mi70;La/rl70;La/pp90;La/eke0;La/lme0;La/xte0;La/vue0;La/lef0;La/lhf0;La/wsf0;La/ctf0;La/wdk0;La/pek0;La/bzs0;La/i1w0;La/z4w0;)V

    .line 341
    .line 342
    .line 343
    move-object v2, v4

    .line 344
    goto :goto_2

    .line 345
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 346
    .line 347
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :goto_2
    return-object v2

    .line 355
    :pswitch_4
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 356
    .line 357
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, La/z3f0;->H0()La/k3t0;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    sget-object v1, La/c3f0;->a:La/c3f0;

    .line 365
    .line 366
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_5
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 373
    .line 374
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, La/z3f0;->H0()La/k3t0;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    sget-object v2, La/b3f0;->a:La/b3f0;

    .line 382
    .line 383
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, La/z3f0;->H0()La/k3t0;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    sget-object v1, La/w2f0;->a:La/w2f0;

    .line 391
    .line 392
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
