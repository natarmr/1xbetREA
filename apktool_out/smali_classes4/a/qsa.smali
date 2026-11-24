.class public final La/qsa;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/sff0;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/util/List;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:B

.field public final synthetic u:La/wsa;


# direct methods
.method public constructor <init>(La/wsa;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qsa;->u:La/wsa;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/qsa;

    .line 2
    .line 3
    iget-object p0, p0, La/qsa;->u:La/wsa;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/qsa;-><init>(La/wsa;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/qsa;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qsa;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qsa;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/qsa;->u:La/wsa;

    .line 4
    .line 5
    iget-object v2, v1, La/wsa;->K:La/r9u;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v4, v0, La/qsa;->t:B

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz v4, :cond_2

    .line 15
    .line 16
    if-eq v4, v6, :cond_1

    .line 17
    .line 18
    if-ne v4, v5, :cond_0

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v7

    .line 31
    :cond_1
    iget-boolean v4, v0, La/qsa;->s:Z

    .line 32
    .line 33
    iget-boolean v8, v0, La/qsa;->r:Z

    .line 34
    .line 35
    iget-boolean v9, v0, La/qsa;->q:Z

    .line 36
    .line 37
    iget-boolean v10, v0, La/qsa;->p:Z

    .line 38
    .line 39
    iget-boolean v11, v0, La/qsa;->o:Z

    .line 40
    .line 41
    iget-boolean v12, v0, La/qsa;->n:Z

    .line 42
    .line 43
    iget-boolean v13, v0, La/qsa;->m:Z

    .line 44
    .line 45
    iget-object v14, v0, La/qsa;->l:Ljava/util/List;

    .line 46
    .line 47
    iget-object v15, v0, La/qsa;->k:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v5, v0, La/qsa;->j:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v7, v0, La/qsa;->i:La/sff0;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move/from16 v24, v4

    .line 57
    .line 58
    move v4, v6

    .line 59
    move-object/from16 v6, p1

    .line 60
    .line 61
    :goto_0
    move-object/from16 v22, v5

    .line 62
    .line 63
    move/from16 v23, v8

    .line 64
    .line 65
    move/from16 v21, v9

    .line 66
    .line 67
    move/from16 v20, v10

    .line 68
    .line 69
    move/from16 v18, v11

    .line 70
    .line 71
    move/from16 v17, v12

    .line 72
    .line 73
    move/from16 v25, v13

    .line 74
    .line 75
    move-object/from16 v29, v14

    .line 76
    .line 77
    move-object/from16 v19, v15

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, v1, La/wsa;->r:La/pru;

    .line 84
    .line 85
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iget-object v4, v1, La/wsa;->t:La/lbu;

    .line 90
    .line 91
    invoke-virtual {v4}, La/lbu;->j()Z

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    iget-object v4, v7, La/sff0;->L:La/rib0;

    .line 96
    .line 97
    iget-boolean v12, v4, La/rib0;->a:Z

    .line 98
    .line 99
    iget-object v4, v7, La/sff0;->g:La/mum0;

    .line 100
    .line 101
    iget-object v4, v4, La/mum0;->i:La/he;

    .line 102
    .line 103
    iget-object v5, v4, La/he;->a:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v4, v7, La/sff0;->d:La/q1w0;

    .line 106
    .line 107
    iget-boolean v11, v4, La/q1w0;->b:Z

    .line 108
    .line 109
    iget-object v8, v7, La/sff0;->b:La/hl1;

    .line 110
    .line 111
    iget-boolean v10, v8, La/hl1;->b:Z

    .line 112
    .line 113
    iget-boolean v9, v8, La/hl1;->C:Z

    .line 114
    .line 115
    iget-boolean v8, v7, La/sff0;->J:Z

    .line 116
    .line 117
    iget-object v4, v4, La/q1w0;->a:La/dyv0;

    .line 118
    .line 119
    iget-object v15, v4, La/dyv0;->b:Ljava/lang/String;

    .line 120
    .line 121
    iget-boolean v4, v7, La/sff0;->J1:Z

    .line 122
    .line 123
    iget-object v14, v1, La/wsa;->C:La/luu;

    .line 124
    .line 125
    iget-object v14, v14, La/luu;->a:La/nok0;

    .line 126
    .line 127
    invoke-virtual {v14}, La/nok0;->a()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    iget-object v6, v1, La/wsa;->x:La/j3c;

    .line 132
    .line 133
    iput-object v7, v0, La/qsa;->i:La/sff0;

    .line 134
    .line 135
    iput-object v5, v0, La/qsa;->j:Ljava/lang/String;

    .line 136
    .line 137
    iput-object v15, v0, La/qsa;->k:Ljava/lang/String;

    .line 138
    .line 139
    iput-object v14, v0, La/qsa;->l:Ljava/util/List;

    .line 140
    .line 141
    iput-boolean v13, v0, La/qsa;->m:Z

    .line 142
    .line 143
    iput-boolean v12, v0, La/qsa;->n:Z

    .line 144
    .line 145
    iput-boolean v11, v0, La/qsa;->o:Z

    .line 146
    .line 147
    iput-boolean v10, v0, La/qsa;->p:Z

    .line 148
    .line 149
    iput-boolean v9, v0, La/qsa;->q:Z

    .line 150
    .line 151
    iput-boolean v8, v0, La/qsa;->r:Z

    .line 152
    .line 153
    iput-boolean v4, v0, La/qsa;->s:Z

    .line 154
    .line 155
    move/from16 p1, v4

    .line 156
    .line 157
    const/4 v4, 0x1

    .line 158
    iput-byte v4, v0, La/qsa;->t:B

    .line 159
    .line 160
    invoke-virtual {v6, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-ne v6, v3, :cond_3

    .line 165
    .line 166
    move-object v6, v3

    .line 167
    goto/16 :goto_4

    .line 168
    .line 169
    :cond_3
    move/from16 v24, p1

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :goto_1
    move-object/from16 v28, v6

    .line 173
    .line 174
    check-cast v28, La/wcb;

    .line 175
    .line 176
    sget-object v5, La/ygp;->t:La/ygp;

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v6, v2, La/r9u;->a:La/j1q0;

    .line 182
    .line 183
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v6, v6, La/j1q0;->a:La/m1q0;

    .line 187
    .line 188
    invoke-virtual {v6, v5}, La/m1q0;->d(La/ygp;)Z

    .line 189
    .line 190
    .line 191
    move-result v30

    .line 192
    iget-boolean v5, v7, La/sff0;->B0:Z

    .line 193
    .line 194
    if-eqz v5, :cond_4

    .line 195
    .line 196
    sget-object v5, La/ygp;->u:La/ygp;

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 207
    .line 208
    invoke-virtual {v2, v5}, La/m1q0;->d(La/ygp;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_4

    .line 213
    .line 214
    move/from16 v26, v4

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_4
    const/4 v6, 0x0

    .line 218
    move/from16 v26, v6

    .line 219
    .line 220
    :goto_2
    iget-object v2, v1, La/wsa;->G:La/y78;

    .line 221
    .line 222
    new-instance v16, La/rra;

    .line 223
    .line 224
    move-object/from16 v27, v2

    .line 225
    .line 226
    invoke-direct/range {v16 .. v30}, La/rra;-><init>(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZLa/y78;La/wcb;Ljava/util/List;Z)V

    .line 227
    .line 228
    .line 229
    move/from16 v2, v17

    .line 230
    .line 231
    iget-object v4, v1, La/i3t0;->i:La/ocj;

    .line 232
    .line 233
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 234
    .line 235
    :goto_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-object v6, v4

    .line 243
    move-object v4, v5

    .line 244
    check-cast v4, La/gsa;

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const/16 v15, 0xffe

    .line 248
    .line 249
    move-object v7, v6

    .line 250
    const/4 v6, 0x0

    .line 251
    move-object v8, v7

    .line 252
    const/4 v7, 0x0

    .line 253
    move-object v9, v8

    .line 254
    const/4 v8, 0x0

    .line 255
    move-object v10, v9

    .line 256
    const/4 v9, 0x0

    .line 257
    move-object v11, v10

    .line 258
    const/4 v10, 0x0

    .line 259
    move-object v12, v11

    .line 260
    const/4 v11, 0x0

    .line 261
    move-object v13, v12

    .line 262
    const/4 v12, 0x0

    .line 263
    move-object/from16 v17, v13

    .line 264
    .line 265
    const/4 v13, 0x0

    .line 266
    move-object/from16 v19, v17

    .line 267
    .line 268
    move/from16 v17, v2

    .line 269
    .line 270
    move-object/from16 v2, v19

    .line 271
    .line 272
    move-object/from16 v19, v3

    .line 273
    .line 274
    move-object v3, v5

    .line 275
    move-object/from16 v5, v16

    .line 276
    .line 277
    move/from16 v31, v20

    .line 278
    .line 279
    move/from16 v32, v21

    .line 280
    .line 281
    move/from16 v33, v23

    .line 282
    .line 283
    move/from16 v34, v24

    .line 284
    .line 285
    invoke-static/range {v4 .. v15}, La/gsa;->a(La/gsa;La/rra;La/om5;ZLjava/util/List;IILa/dta;ZZLjava/lang/String;I)La/gsa;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-eqz v3, :cond_6

    .line 294
    .line 295
    iget-object v1, v1, La/wsa;->u:La/hjd;

    .line 296
    .line 297
    new-instance v2, La/cid;

    .line 298
    .line 299
    sget-object v3, La/y1p;->b:La/y1p;

    .line 300
    .line 301
    new-instance v3, La/xq2;

    .line 302
    .line 303
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    const-string v4, "bet_favor_events"

    .line 307
    .line 308
    invoke-direct {v2, v4, v3}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 309
    .line 310
    .line 311
    const/4 v3, 0x0

    .line 312
    iput-object v3, v0, La/qsa;->i:La/sff0;

    .line 313
    .line 314
    iput-object v3, v0, La/qsa;->j:Ljava/lang/String;

    .line 315
    .line 316
    iput-object v3, v0, La/qsa;->k:Ljava/lang/String;

    .line 317
    .line 318
    iput-object v3, v0, La/qsa;->l:Ljava/util/List;

    .line 319
    .line 320
    move/from16 v13, v25

    .line 321
    .line 322
    iput-boolean v13, v0, La/qsa;->m:Z

    .line 323
    .line 324
    move/from16 v12, v17

    .line 325
    .line 326
    iput-boolean v12, v0, La/qsa;->n:Z

    .line 327
    .line 328
    move/from16 v11, v18

    .line 329
    .line 330
    iput-boolean v11, v0, La/qsa;->o:Z

    .line 331
    .line 332
    move/from16 v10, v31

    .line 333
    .line 334
    iput-boolean v10, v0, La/qsa;->p:Z

    .line 335
    .line 336
    move/from16 v9, v32

    .line 337
    .line 338
    iput-boolean v9, v0, La/qsa;->q:Z

    .line 339
    .line 340
    move/from16 v8, v33

    .line 341
    .line 342
    iput-boolean v8, v0, La/qsa;->r:Z

    .line 343
    .line 344
    move/from16 v4, v34

    .line 345
    .line 346
    iput-boolean v4, v0, La/qsa;->s:Z

    .line 347
    .line 348
    const/4 v5, 0x2

    .line 349
    iput-byte v5, v0, La/qsa;->t:B

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v2, v0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    move-object/from16 v6, v19

    .line 359
    .line 360
    if-ne v0, v6, :cond_5

    .line 361
    .line 362
    :goto_4
    return-object v6

    .line 363
    :cond_5
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :cond_6
    move-object v4, v2

    .line 367
    move/from16 v2, v17

    .line 368
    .line 369
    move-object/from16 v3, v19

    .line 370
    .line 371
    move/from16 v20, v31

    .line 372
    .line 373
    move/from16 v21, v32

    .line 374
    .line 375
    move/from16 v23, v33

    .line 376
    .line 377
    move/from16 v24, v34

    .line 378
    .line 379
    goto/16 :goto_3
.end method
