.class public final La/sfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/yei;


# direct methods
.method public constructor <init>(La/yei;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sfi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 43

    .line 1
    new-instance v0, La/ebl;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/sfi;->a:La/yei;

    .line 6
    .line 7
    iget-object v1, v1, La/yei;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/tfi;

    .line 10
    .line 11
    iget-object v2, v1, La/tfi;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v1, La/tfi;->b:La/cad;

    .line 14
    .line 15
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/psc;

    .line 18
    .line 19
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v1, La/tfi;->c:Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 27
    .line 28
    iget-object v5, v1, La/tfi;->d:La/xhi;

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    invoke-virtual {v6}, La/xhi;->b()La/tzi;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    move-object v7, v6

    .line 36
    new-instance v6, La/ali;

    .line 37
    .line 38
    new-instance v8, La/ivn;

    .line 39
    .line 40
    iget-object v9, v1, La/tfi;->e:La/clc;

    .line 41
    .line 42
    iget-object v10, v9, La/clc;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v10, La/v7i;

    .line 45
    .line 46
    invoke-virtual {v10}, La/v7i;->g()La/qah;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v8, v11}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v10}, La/v7i;->i()La/reu;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-virtual {v7}, La/xhi;->e()La/b8u;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v7}, La/xhi;->i()La/iw20;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-direct {v6, v8, v10, v11, v12}, La/ali;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v8, v9, La/clc;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, La/v7i;

    .line 74
    .line 75
    invoke-virtual {v8}, La/v7i;->h()La/a7q;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iget-object v10, v9, La/clc;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, La/v7i;

    .line 82
    .line 83
    invoke-virtual {v10}, La/v7i;->e()La/rus;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-virtual {v7}, La/xhi;->g()La/g3j;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    move-object v12, v7

    .line 92
    move-object v7, v8

    .line 93
    move-object v8, v10

    .line 94
    invoke-virtual {v12}, La/xhi;->a()La/z0s;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    move-object v13, v11

    .line 99
    invoke-virtual {v12}, La/xhi;->j()La/sbu;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    move-object v14, v12

    .line 104
    invoke-virtual {v14}, La/xhi;->k()La/drm0;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    iget-object v15, v1, La/tfi;->f:La/rmd0;

    .line 109
    .line 110
    invoke-interface {v15}, La/rmd0;->a()La/vpu;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v16, v14

    .line 118
    .line 119
    iget-object v14, v1, La/tfi;->g:La/lbu;

    .line 120
    .line 121
    move-object/from16 v17, v13

    .line 122
    .line 123
    move-object v13, v15

    .line 124
    iget-object v15, v1, La/tfi;->h:La/dwu;

    .line 125
    .line 126
    move-object/from16 v18, v0

    .line 127
    .line 128
    iget-object v0, v1, La/tfi;->i:La/a1d;

    .line 129
    .line 130
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, La/qv2;

    .line 133
    .line 134
    invoke-virtual {v0}, La/qv2;->i()La/hqc;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object/from16 p0, v0

    .line 139
    .line 140
    iget-object v0, v1, La/tfi;->j:La/iip;

    .line 141
    .line 142
    invoke-interface {v0}, La/iip;->V()La/j3c;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    move-object/from16 v19, v0

    .line 150
    .line 151
    iget-object v0, v1, La/tfi;->k:La/pru;

    .line 152
    .line 153
    move-object/from16 v20, v0

    .line 154
    .line 155
    iget-object v0, v1, La/tfi;->l:La/ugf0;

    .line 156
    .line 157
    iget-object v0, v0, La/ugf0;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/daf;

    .line 160
    .line 161
    invoke-virtual {v0}, La/daf;->w()La/luu;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    move-object/from16 v21, v0

    .line 169
    .line 170
    new-instance v0, La/e1u;

    .line 171
    .line 172
    move-object/from16 v22, v2

    .line 173
    .line 174
    iget-object v2, v9, La/clc;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, La/v7i;

    .line 177
    .line 178
    invoke-virtual {v2}, La/v7i;->d()La/wrh;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v23, v3

    .line 186
    .line 187
    const/4 v3, 0x1

    .line 188
    invoke-direct {v0, v2, v3}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 189
    .line 190
    .line 191
    iget-object v2, v1, La/tfi;->m:La/ivn;

    .line 192
    .line 193
    iget-object v3, v2, La/ivn;->a:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, La/v5i;

    .line 196
    .line 197
    invoke-virtual {v3}, La/v5i;->e()La/zsr;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    move-object/from16 v24, v0

    .line 202
    .line 203
    iget-object v0, v2, La/ivn;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, La/v5i;

    .line 206
    .line 207
    invoke-virtual {v0}, La/v5i;->d()La/rpt;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    move-object/from16 v25, v0

    .line 212
    .line 213
    iget-object v0, v2, La/ivn;->a:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, La/v5i;

    .line 216
    .line 217
    invoke-virtual {v0}, La/v5i;->b()La/kut;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v9, v9, La/clc;->b:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v9, La/v7i;

    .line 224
    .line 225
    iget-object v9, v9, La/v7i;->e:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v9, La/h3c;

    .line 228
    .line 229
    move-object/from16 v26, v22

    .line 230
    .line 231
    move-object/from16 v22, v25

    .line 232
    .line 233
    invoke-virtual/range {v16 .. v16}, La/xhi;->h()La/iw20;

    .line 234
    .line 235
    .line 236
    move-result-object v25

    .line 237
    iget-object v2, v2, La/ivn;->a:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v2, La/v5i;

    .line 240
    .line 241
    invoke-virtual {v2}, La/v5i;->f()La/lbu;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move-object/from16 v27, v0

    .line 246
    .line 247
    iget-object v0, v1, La/tfi;->n:La/poq0;

    .line 248
    .line 249
    iget-object v0, v0, La/poq0;->a:La/jxi;

    .line 250
    .line 251
    invoke-virtual {v0}, La/jxi;->d()La/r8i;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    move-object/from16 v28, v0

    .line 256
    .line 257
    iget-object v0, v1, La/tfi;->o:La/roi0;

    .line 258
    .line 259
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, La/daf;

    .line 262
    .line 263
    invoke-virtual {v0}, La/daf;->B()La/nvu;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    move-object/from16 v29, v0

    .line 268
    .line 269
    iget-object v0, v1, La/tfi;->p:La/m1e;

    .line 270
    .line 271
    move-object/from16 v30, v0

    .line 272
    .line 273
    iget-object v0, v1, La/tfi;->q:La/qgh;

    .line 274
    .line 275
    move-object/from16 v31, v0

    .line 276
    .line 277
    iget-object v0, v1, La/tfi;->r:La/pyg;

    .line 278
    .line 279
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v32, v0

    .line 287
    .line 288
    iget-object v0, v1, La/tfi;->s:La/oeg0;

    .line 289
    .line 290
    move-object/from16 v33, v0

    .line 291
    .line 292
    iget-object v0, v1, La/tfi;->t:La/ctf0;

    .line 293
    .line 294
    move-object/from16 v34, v0

    .line 295
    .line 296
    iget-object v0, v1, La/tfi;->u:La/g2v;

    .line 297
    .line 298
    invoke-virtual/range {v16 .. v16}, La/xhi;->c()La/xpr;

    .line 299
    .line 300
    .line 301
    move-result-object v35

    .line 302
    move-object/from16 v16, v0

    .line 303
    .line 304
    iget-object v0, v1, La/tfi;->v:La/r9u;

    .line 305
    .line 306
    move-object/from16 v36, v0

    .line 307
    .line 308
    iget-object v0, v1, La/tfi;->w:La/h3c;

    .line 309
    .line 310
    move-object/from16 v37, v0

    .line 311
    .line 312
    iget-object v0, v1, La/tfi;->x:La/rrc;

    .line 313
    .line 314
    move-object/from16 v38, v2

    .line 315
    .line 316
    iget-object v2, v0, La/rrc;->b:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v2, La/gr00;

    .line 319
    .line 320
    move-object/from16 v39, v3

    .line 321
    .line 322
    new-instance v3, La/bwl;

    .line 323
    .line 324
    move-object/from16 v40, v4

    .line 325
    .line 326
    new-instance v4, La/prc;

    .line 327
    .line 328
    move-object/from16 v41, v5

    .line 329
    .line 330
    new-instance v5, La/chf0;

    .line 331
    .line 332
    iget-object v2, v2, La/gr00;->e:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v2, La/gii0;

    .line 335
    .line 336
    move-object/from16 v42, v6

    .line 337
    .line 338
    const/16 v6, 0x1a

    .line 339
    .line 340
    invoke-direct {v5, v2, v6}, La/chf0;-><init>(La/gii0;B)V

    .line 341
    .line 342
    .line 343
    const/16 v2, 0xc

    .line 344
    .line 345
    invoke-direct {v4, v5, v2}, La/prc;-><init>(Ljava/lang/Object;B)V

    .line 346
    .line 347
    .line 348
    invoke-direct {v3, v4}, La/bwl;-><init>(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    iget-object v1, v1, La/tfi;->y:La/qv2;

    .line 352
    .line 353
    iget-object v0, v0, La/rrc;->b:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, La/gr00;

    .line 356
    .line 357
    invoke-virtual {v0}, La/gr00;->s()La/gr00;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    move-object/from16 v2, v26

    .line 362
    .line 363
    move-object/from16 v26, v38

    .line 364
    .line 365
    move-object/from16 v4, v40

    .line 366
    .line 367
    move-object/from16 v5, v41

    .line 368
    .line 369
    move-object/from16 v6, v42

    .line 370
    .line 371
    move-object/from16 v40, v0

    .line 372
    .line 373
    move-object/from16 v38, v3

    .line 374
    .line 375
    move-object/from16 v0, v18

    .line 376
    .line 377
    move-object/from16 v18, v20

    .line 378
    .line 379
    move-object/from16 v3, v23

    .line 380
    .line 381
    move-object/from16 v20, v24

    .line 382
    .line 383
    move-object/from16 v23, v27

    .line 384
    .line 385
    move-object/from16 v27, v28

    .line 386
    .line 387
    move-object/from16 v28, v29

    .line 388
    .line 389
    move-object/from16 v29, v30

    .line 390
    .line 391
    move-object/from16 v30, v31

    .line 392
    .line 393
    move-object/from16 v31, v32

    .line 394
    .line 395
    move-object/from16 v32, v33

    .line 396
    .line 397
    move-object/from16 v33, v34

    .line 398
    .line 399
    move-object/from16 v24, v9

    .line 400
    .line 401
    move-object/from16 v34, v16

    .line 402
    .line 403
    move-object/from16 v9, v17

    .line 404
    .line 405
    move-object/from16 v17, v19

    .line 406
    .line 407
    move-object/from16 v19, v21

    .line 408
    .line 409
    move-object/from16 v21, v39

    .line 410
    .line 411
    move-object/from16 v16, p0

    .line 412
    .line 413
    move-object/from16 v39, v1

    .line 414
    .line 415
    move-object/from16 v1, p1

    .line 416
    .line 417
    invoke-direct/range {v0 .. v40}, La/ebl;-><init>(La/vzg0;Ljava/lang/String;La/mne;Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;La/tzi;La/ali;La/a7q;La/rus;La/g3j;La/z0s;La/sbu;La/drm0;La/vpu;La/lbu;La/dwu;La/hqc;La/j3c;La/pru;La/luu;La/e1u;La/zsr;La/rpt;La/kut;La/h3c;La/iw20;La/lbu;La/r8i;La/nvu;La/m1e;La/qgh;La/hzg;La/oeg0;La/ctf0;La/g2v;La/xpr;La/r9u;La/h3c;La/bwl;La/qv2;La/gr00;)V

    .line 418
    .line 419
    .line 420
    return-object v0
.end method
