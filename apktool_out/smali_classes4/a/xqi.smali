.class public final La/xqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/gji;


# direct methods
.method public constructor <init>(La/gji;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xqi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 39

    .line 1
    new-instance v0, La/d1e0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/xqi;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/yqi;

    .line 10
    .line 11
    iget-object v2, v1, La/yqi;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v1, La/yqi;->b:La/cad;

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
    iget-object v4, v1, La/yqi;->c:Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;

    .line 27
    .line 28
    iget-object v5, v1, La/yqi;->d:La/xhi;

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
    new-instance v7, La/kki;

    .line 36
    .line 37
    iget-object v14, v1, La/yqi;->e:La/clc;

    .line 38
    .line 39
    iget-object v8, v14, La/clc;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v8, La/v7i;

    .line 42
    .line 43
    move-object v9, v8

    .line 44
    invoke-virtual {v9}, La/v7i;->i()La/reu;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    move-object v10, v9

    .line 49
    invoke-virtual {v6}, La/xhi;->i()La/iw20;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    move-object v11, v10

    .line 54
    invoke-virtual {v6}, La/xhi;->e()La/b8u;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    move-object v12, v11

    .line 59
    new-instance v11, La/n4u;

    .line 60
    .line 61
    iget-object v13, v1, La/yqi;->B:La/n5d0;

    .line 62
    .line 63
    invoke-interface {v13}, La/o5d0;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    check-cast v13, La/xvd0;

    .line 68
    .line 69
    invoke-direct {v11, v13}, La/n4u;-><init>(La/xvd0;)V

    .line 70
    .line 71
    .line 72
    move-object v13, v12

    .line 73
    new-instance v12, La/uyn;

    .line 74
    .line 75
    invoke-virtual {v13}, La/v7i;->g()La/qah;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v12, v13}, La/uyn;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 v13, 0x14

    .line 86
    .line 87
    invoke-direct/range {v7 .. v13}, La/kki;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    iget-object v8, v14, La/clc;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, La/v7i;

    .line 93
    .line 94
    invoke-virtual {v8}, La/v7i;->h()La/a7q;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    iget-object v9, v14, La/clc;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v9, La/v7i;

    .line 101
    .line 102
    invoke-virtual {v9}, La/v7i;->e()La/rus;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    move-object v10, v6

    .line 107
    move-object v6, v7

    .line 108
    move-object v7, v8

    .line 109
    move-object v8, v9

    .line 110
    invoke-virtual {v10}, La/xhi;->g()La/g3j;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    move-object v11, v10

    .line 115
    invoke-virtual {v11}, La/xhi;->a()La/z0s;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    move-object v12, v11

    .line 120
    invoke-virtual {v12}, La/xhi;->j()La/sbu;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    move-object v13, v12

    .line 125
    invoke-virtual {v13}, La/xhi;->k()La/drm0;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    iget-object v15, v1, La/yqi;->g:La/rmd0;

    .line 130
    .line 131
    invoke-interface {v15}, La/rmd0;->a()La/vpu;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v16, v0

    .line 139
    .line 140
    iget-object v0, v1, La/yqi;->h:La/lbu;

    .line 141
    .line 142
    move-object/from16 v17, v13

    .line 143
    .line 144
    move-object v13, v15

    .line 145
    iget-object v15, v1, La/yqi;->i:La/dwu;

    .line 146
    .line 147
    move-object/from16 v18, v0

    .line 148
    .line 149
    iget-object v0, v1, La/yqi;->j:La/a1d;

    .line 150
    .line 151
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, La/qv2;

    .line 154
    .line 155
    invoke-virtual {v0}, La/qv2;->i()La/hqc;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object/from16 p0, v0

    .line 160
    .line 161
    iget-object v0, v1, La/yqi;->k:La/iip;

    .line 162
    .line 163
    invoke-interface {v0}, La/iip;->V()La/j3c;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v19, v0

    .line 171
    .line 172
    iget-object v0, v1, La/yqi;->l:La/pru;

    .line 173
    .line 174
    move-object/from16 v20, v0

    .line 175
    .line 176
    iget-object v0, v1, La/yqi;->m:La/ugf0;

    .line 177
    .line 178
    iget-object v0, v0, La/ugf0;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/daf;

    .line 181
    .line 182
    invoke-virtual {v0}, La/daf;->w()La/luu;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v21, v0

    .line 190
    .line 191
    new-instance v0, La/e1u;

    .line 192
    .line 193
    move-object/from16 v22, v2

    .line 194
    .line 195
    iget-object v2, v14, La/clc;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, La/v7i;

    .line 198
    .line 199
    invoke-virtual {v2}, La/v7i;->d()La/wrh;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v23, v3

    .line 207
    .line 208
    const/4 v3, 0x1

    .line 209
    invoke-direct {v0, v2, v3}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 210
    .line 211
    .line 212
    iget-object v2, v1, La/yqi;->n:La/ivn;

    .line 213
    .line 214
    iget-object v3, v2, La/ivn;->a:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, La/v5i;

    .line 217
    .line 218
    invoke-virtual {v3}, La/v5i;->e()La/zsr;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    move-object/from16 v24, v0

    .line 223
    .line 224
    iget-object v0, v2, La/ivn;->a:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, La/v5i;

    .line 227
    .line 228
    invoke-virtual {v0}, La/v5i;->d()La/rpt;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    move-object/from16 v25, v0

    .line 233
    .line 234
    iget-object v0, v2, La/ivn;->a:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, La/v5i;

    .line 237
    .line 238
    invoke-virtual {v0}, La/v5i;->b()La/kut;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget-object v14, v14, La/clc;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v14, La/v7i;

    .line 245
    .line 246
    iget-object v14, v14, La/v7i;->e:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v14, La/h3c;

    .line 249
    .line 250
    move-object/from16 v26, v22

    .line 251
    .line 252
    move-object/from16 v22, v25

    .line 253
    .line 254
    invoke-virtual/range {v17 .. v17}, La/xhi;->h()La/iw20;

    .line 255
    .line 256
    .line 257
    move-result-object v25

    .line 258
    iget-object v2, v2, La/ivn;->a:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v2, La/v5i;

    .line 261
    .line 262
    invoke-virtual {v2}, La/v5i;->f()La/lbu;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    move-object/from16 v27, v0

    .line 267
    .line 268
    iget-object v0, v1, La/yqi;->o:La/poq0;

    .line 269
    .line 270
    iget-object v0, v0, La/poq0;->a:La/jxi;

    .line 271
    .line 272
    invoke-virtual {v0}, La/jxi;->d()La/r8i;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    move-object/from16 v28, v0

    .line 277
    .line 278
    iget-object v0, v1, La/yqi;->p:La/roi0;

    .line 279
    .line 280
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, La/daf;

    .line 283
    .line 284
    invoke-virtual {v0}, La/daf;->B()La/nvu;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    move-object/from16 v29, v0

    .line 289
    .line 290
    iget-object v0, v1, La/yqi;->q:La/m1e;

    .line 291
    .line 292
    move-object/from16 v30, v0

    .line 293
    .line 294
    iget-object v0, v1, La/yqi;->r:La/qgh;

    .line 295
    .line 296
    move-object/from16 v31, v0

    .line 297
    .line 298
    iget-object v0, v1, La/yqi;->s:La/pyg;

    .line 299
    .line 300
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    move-object/from16 v32, v0

    .line 308
    .line 309
    iget-object v0, v1, La/yqi;->t:La/oeg0;

    .line 310
    .line 311
    move-object/from16 v33, v0

    .line 312
    .line 313
    iget-object v0, v1, La/yqi;->u:La/ctf0;

    .line 314
    .line 315
    move-object/from16 v34, v0

    .line 316
    .line 317
    iget-object v0, v1, La/yqi;->v:La/g2v;

    .line 318
    .line 319
    invoke-virtual/range {v17 .. v17}, La/xhi;->c()La/xpr;

    .line 320
    .line 321
    .line 322
    move-result-object v35

    .line 323
    move-object/from16 v17, v0

    .line 324
    .line 325
    iget-object v0, v1, La/yqi;->w:La/r9u;

    .line 326
    .line 327
    move-object/from16 v36, v0

    .line 328
    .line 329
    iget-object v0, v1, La/yqi;->x:La/h3c;

    .line 330
    .line 331
    iget-object v1, v1, La/yqi;->y:La/qv2;

    .line 332
    .line 333
    move-object/from16 v37, v26

    .line 334
    .line 335
    move-object/from16 v26, v2

    .line 336
    .line 337
    move-object/from16 v2, v37

    .line 338
    .line 339
    move-object/from16 v37, v21

    .line 340
    .line 341
    move-object/from16 v21, v3

    .line 342
    .line 343
    move-object/from16 v3, v23

    .line 344
    .line 345
    move-object/from16 v23, v27

    .line 346
    .line 347
    move-object/from16 v27, v28

    .line 348
    .line 349
    move-object/from16 v28, v29

    .line 350
    .line 351
    move-object/from16 v29, v30

    .line 352
    .line 353
    move-object/from16 v30, v31

    .line 354
    .line 355
    move-object/from16 v31, v32

    .line 356
    .line 357
    move-object/from16 v32, v33

    .line 358
    .line 359
    move-object/from16 v33, v34

    .line 360
    .line 361
    move-object/from16 v34, v17

    .line 362
    .line 363
    move-object/from16 v17, v19

    .line 364
    .line 365
    move-object/from16 v19, v37

    .line 366
    .line 367
    move-object/from16 v37, v24

    .line 368
    .line 369
    move-object/from16 v24, v14

    .line 370
    .line 371
    move-object/from16 v14, v18

    .line 372
    .line 373
    move-object/from16 v18, v20

    .line 374
    .line 375
    move-object/from16 v20, v37

    .line 376
    .line 377
    move-object/from16 v37, v0

    .line 378
    .line 379
    move-object/from16 v38, v1

    .line 380
    .line 381
    move-object/from16 v0, v16

    .line 382
    .line 383
    move-object/from16 v16, p0

    .line 384
    .line 385
    move-object/from16 v1, p1

    .line 386
    .line 387
    invoke-direct/range {v0 .. v38}, La/d1e0;-><init>(La/vzg0;Ljava/lang/String;La/mne;Lorg/xplatform/cyber/game/rainbow/api/RainbowGameScreenParams;La/tzi;La/kki;La/a7q;La/rus;La/g3j;La/z0s;La/sbu;La/drm0;La/vpu;La/lbu;La/dwu;La/hqc;La/j3c;La/pru;La/luu;La/e1u;La/zsr;La/rpt;La/kut;La/h3c;La/iw20;La/lbu;La/r8i;La/nvu;La/m1e;La/qgh;La/hzg;La/oeg0;La/ctf0;La/g2v;La/xpr;La/r9u;La/h3c;La/qv2;)V

    .line 388
    .line 389
    .line 390
    return-object v0
.end method
