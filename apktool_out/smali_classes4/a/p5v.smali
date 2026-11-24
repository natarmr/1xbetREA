.class public final La/p5v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic A:Ljava/lang/String;

.field public final synthetic B:Z

.field public i:La/mie0;

.field public j:La/mie0;

.field public k:Ljava/util/List;

.field public l:Ljava/util/List;

.field public m:La/kzj;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public p:I

.field public q:I

.field public r:B

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/dgu;

.field public final synthetic u:Ljava/util/ArrayList;

.field public final synthetic v:Ljava/util/ArrayList;

.field public final synthetic w:Z

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public constructor <init>(La/dgu;Ljava/util/ArrayList;Ljava/util/ArrayList;ZIJJLjava/lang/String;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p5v;->t:La/dgu;

    .line 2
    .line 3
    iput-object p2, p0, La/p5v;->u:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p3, p0, La/p5v;->v:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-boolean p4, p0, La/p5v;->w:Z

    .line 8
    .line 9
    iput p5, p0, La/p5v;->x:I

    .line 10
    .line 11
    iput-wide p6, p0, La/p5v;->y:J

    .line 12
    .line 13
    iput-wide p8, p0, La/p5v;->z:J

    .line 14
    .line 15
    iput-object p10, p0, La/p5v;->A:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p11, p0, La/p5v;->B:Z

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/p5v;

    .line 2
    .line 3
    iget-object v10, p0, La/p5v;->A:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v11, p0, La/p5v;->B:Z

    .line 6
    .line 7
    iget-object v1, p0, La/p5v;->t:La/dgu;

    .line 8
    .line 9
    iget-object v2, p0, La/p5v;->u:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v3, p0, La/p5v;->v:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-boolean v4, p0, La/p5v;->w:Z

    .line 14
    .line 15
    iget v5, p0, La/p5v;->x:I

    .line 16
    .line 17
    iget-wide v6, p0, La/p5v;->y:J

    .line 18
    .line 19
    iget-wide v8, p0, La/p5v;->z:J

    .line 20
    .line 21
    move-object v12, p2

    .line 22
    invoke-direct/range {v0 .. v12}, La/p5v;-><init>(La/dgu;Ljava/util/ArrayList;Ljava/util/ArrayList;ZIJJLjava/lang/String;ZLa/yje;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/p5v;->s:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/p5v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/p5v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/p5v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v3, v0, La/p5v;->t:La/dgu;

    .line 4
    .line 5
    iget-object v1, v3, La/dgu;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/ocl;

    .line 8
    .line 9
    iget-object v2, v0, La/p5v;->s:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v12, v2

    .line 12
    check-cast v12, La/vne;

    .line 13
    .line 14
    sget-object v13, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-byte v2, v0, La/p5v;->r:B

    .line 17
    .line 18
    const/4 v15, 0x4

    .line 19
    const/4 v4, 0x3

    .line 20
    const/4 v5, 0x2

    .line 21
    const/4 v6, 0x1

    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    if-eq v2, v6, :cond_3

    .line 26
    .line 27
    if-eq v2, v5, :cond_2

    .line 28
    .line 29
    if-eq v2, v4, :cond_1

    .line 30
    .line 31
    if-ne v2, v15, :cond_0

    .line 32
    .line 33
    iget-object v1, v0, La/p5v;->o:Ljava/util/List;

    .line 34
    .line 35
    iget-object v0, v0, La/p5v;->n:Ljava/util/List;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_d

    .line 41
    .line 42
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v7

    .line 48
    :cond_1
    iget v1, v0, La/p5v;->q:I

    .line 49
    .line 50
    iget v2, v0, La/p5v;->p:I

    .line 51
    .line 52
    iget-object v4, v0, La/p5v;->o:Ljava/util/List;

    .line 53
    .line 54
    iget-object v5, v0, La/p5v;->n:Ljava/util/List;

    .line 55
    .line 56
    iget-object v6, v0, La/p5v;->k:Ljava/util/List;

    .line 57
    .line 58
    iget-object v8, v0, La/p5v;->j:La/mie0;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v9, v8

    .line 64
    move-object v8, v6

    .line 65
    move-object v6, v5

    .line 66
    move-object v5, v4

    .line 67
    move-object v4, v13

    .line 68
    goto/16 :goto_a

    .line 69
    .line 70
    :cond_2
    iget-object v1, v0, La/p5v;->n:Ljava/util/List;

    .line 71
    .line 72
    iget-object v2, v0, La/p5v;->l:Ljava/util/List;

    .line 73
    .line 74
    iget-object v5, v0, La/p5v;->k:Ljava/util/List;

    .line 75
    .line 76
    iget-object v8, v0, La/p5v;->j:La/mie0;

    .line 77
    .line 78
    iget-object v9, v0, La/p5v;->i:La/mie0;

    .line 79
    .line 80
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move v15, v4

    .line 84
    move-object v14, v9

    .line 85
    move-object v4, v13

    .line 86
    move-object v13, v7

    .line 87
    move-object v9, v8

    .line 88
    move-object v8, v5

    .line 89
    move-object/from16 v5, p1

    .line 90
    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_3
    iget-object v1, v0, La/p5v;->m:La/kzj;

    .line 94
    .line 95
    iget-object v2, v0, La/p5v;->l:Ljava/util/List;

    .line 96
    .line 97
    iget-object v8, v0, La/p5v;->k:Ljava/util/List;

    .line 98
    .line 99
    iget-object v9, v0, La/p5v;->j:La/mie0;

    .line 100
    .line 101
    iget-object v10, v0, La/p5v;->i:La/mie0;

    .line 102
    .line 103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v11, v1

    .line 107
    move v15, v4

    .line 108
    move-object v14, v10

    .line 109
    move-object v4, v13

    .line 110
    move-object/from16 v1, p1

    .line 111
    .line 112
    move-object v13, v7

    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :cond_4
    invoke-static/range {p1 .. p1}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    new-instance v9, La/mie0;

    .line 120
    .line 121
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    sget-object v8, La/txy;->a:La/txy;

    .line 125
    .line 126
    iget-object v10, v1, La/ocl;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v10, La/rmu0;

    .line 129
    .line 130
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v10, v10, La/rmu0;->a:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 134
    .line 135
    invoke-virtual {v10, v8}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_5

    .line 140
    .line 141
    sget-object v8, La/iun;->a:La/iun;

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    iget-object v8, v0, La/p5v;->u:Ljava/util/ArrayList;

    .line 145
    .line 146
    :goto_0
    sget-object v10, La/txy;->b:La/txy;

    .line 147
    .line 148
    iget-object v1, v1, La/ocl;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, La/rmu0;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v1, v1, La/rmu0;->a:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 156
    .line 157
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    sget-object v1, La/iun;->a:La/iun;

    .line 164
    .line 165
    :goto_1
    move-object/from16 v16, v1

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    iget-object v1, v0, La/p5v;->v:Ljava/util/ArrayList;

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_7

    .line 176
    .line 177
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_7

    .line 182
    .line 183
    sget-object v0, La/iun;->a:La/iun;

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_7
    new-instance v1, La/u7n;

    .line 187
    .line 188
    const/4 v11, 0x0

    .line 189
    move/from16 v17, v4

    .line 190
    .line 191
    iget-boolean v4, v0, La/p5v;->w:Z

    .line 192
    .line 193
    move/from16 v18, v5

    .line 194
    .line 195
    iget v5, v0, La/p5v;->x:I

    .line 196
    .line 197
    move/from16 v19, v6

    .line 198
    .line 199
    move-object/from16 v20, v7

    .line 200
    .line 201
    iget-wide v6, v0, La/p5v;->y:J

    .line 202
    .line 203
    move-object/from16 v22, v2

    .line 204
    .line 205
    move-object v2, v8

    .line 206
    move-object/from16 v21, v9

    .line 207
    .line 208
    iget-wide v8, v0, La/p5v;->z:J

    .line 209
    .line 210
    move-object/from16 v23, v10

    .line 211
    .line 212
    iget-object v10, v0, La/p5v;->A:Ljava/lang/String;

    .line 213
    .line 214
    move-object/from16 v18, v13

    .line 215
    .line 216
    move/from16 v15, v17

    .line 217
    .line 218
    move-object/from16 v13, v20

    .line 219
    .line 220
    move-object/from16 v24, v21

    .line 221
    .line 222
    move-object/from16 v14, v22

    .line 223
    .line 224
    move-object/from16 v25, v23

    .line 225
    .line 226
    invoke-direct/range {v1 .. v11}, La/u7n;-><init>(Ljava/util/List;La/dgu;ZIJJLjava/lang/String;La/yje;)V

    .line 227
    .line 228
    .line 229
    move-object v10, v2

    .line 230
    invoke-static {v12, v13, v1, v15}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    new-instance v1, La/n5v;

    .line 235
    .line 236
    const/4 v9, 0x0

    .line 237
    iget-boolean v4, v0, La/p5v;->B:Z

    .line 238
    .line 239
    iget v5, v0, La/p5v;->x:I

    .line 240
    .line 241
    iget-wide v6, v0, La/p5v;->y:J

    .line 242
    .line 243
    iget-object v8, v0, La/p5v;->A:Ljava/lang/String;

    .line 244
    .line 245
    move-object/from16 v2, v16

    .line 246
    .line 247
    invoke-direct/range {v1 .. v9}, La/n5v;-><init>(Ljava/util/List;La/dgu;ZIJLjava/lang/String;La/yje;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v12, v13, v1, v15}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    new-instance v4, La/cx2;

    .line 255
    .line 256
    const/4 v5, 0x4

    .line 257
    invoke-direct {v4, v14, v5}, La/cx2;-><init>(La/mie0;B)V

    .line 258
    .line 259
    .line 260
    iput-object v13, v0, La/p5v;->s:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v14, v0, La/p5v;->i:La/mie0;

    .line 263
    .line 264
    move-object/from16 v5, v24

    .line 265
    .line 266
    iput-object v5, v0, La/p5v;->j:La/mie0;

    .line 267
    .line 268
    iput-object v10, v0, La/p5v;->k:Ljava/util/List;

    .line 269
    .line 270
    iput-object v2, v0, La/p5v;->l:Ljava/util/List;

    .line 271
    .line 272
    iput-object v11, v0, La/p5v;->m:La/kzj;

    .line 273
    .line 274
    const/4 v6, 0x1

    .line 275
    iput-byte v6, v0, La/p5v;->r:B

    .line 276
    .line 277
    move-object/from16 v7, v25

    .line 278
    .line 279
    invoke-virtual {v3, v1, v7, v4, v0}, La/dgu;->a(La/jzj;La/txy;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    move-object/from16 v4, v18

    .line 284
    .line 285
    if-ne v1, v4, :cond_8

    .line 286
    .line 287
    goto/16 :goto_c

    .line 288
    .line 289
    :cond_8
    move-object v9, v5

    .line 290
    move-object v8, v10

    .line 291
    :goto_3
    check-cast v1, Ljava/util/List;

    .line 292
    .line 293
    sget-object v5, La/txy;->a:La/txy;

    .line 294
    .line 295
    new-instance v7, La/cx2;

    .line 296
    .line 297
    const/4 v10, 0x5

    .line 298
    invoke-direct {v7, v9, v10}, La/cx2;-><init>(La/mie0;B)V

    .line 299
    .line 300
    .line 301
    iput-object v13, v0, La/p5v;->s:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v14, v0, La/p5v;->i:La/mie0;

    .line 304
    .line 305
    iput-object v9, v0, La/p5v;->j:La/mie0;

    .line 306
    .line 307
    iput-object v8, v0, La/p5v;->k:Ljava/util/List;

    .line 308
    .line 309
    iput-object v2, v0, La/p5v;->l:Ljava/util/List;

    .line 310
    .line 311
    iput-object v13, v0, La/p5v;->m:La/kzj;

    .line 312
    .line 313
    iput-object v1, v0, La/p5v;->n:Ljava/util/List;

    .line 314
    .line 315
    const/4 v10, 0x2

    .line 316
    iput-byte v10, v0, La/p5v;->r:B

    .line 317
    .line 318
    invoke-virtual {v3, v11, v5, v7, v0}, La/dgu;->a(La/jzj;La/txy;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    if-ne v5, v4, :cond_9

    .line 323
    .line 324
    goto/16 :goto_c

    .line 325
    .line 326
    :cond_9
    :goto_4
    check-cast v5, Ljava/util/List;

    .line 327
    .line 328
    iget-object v7, v9, La/mie0;->a:Ljava/lang/Object;

    .line 329
    .line 330
    const/4 v10, 0x0

    .line 331
    if-nez v7, :cond_b

    .line 332
    .line 333
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-eqz v7, :cond_a

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_a
    move v7, v10

    .line 341
    goto :goto_6

    .line 342
    :cond_b
    :goto_5
    move v7, v6

    .line 343
    :goto_6
    iget-object v11, v14, La/mie0;->a:Ljava/lang/Object;

    .line 344
    .line 345
    if-nez v11, :cond_d

    .line 346
    .line 347
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    if-eqz v11, :cond_c

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_c
    move v6, v10

    .line 355
    :cond_d
    :goto_7
    if-eqz v7, :cond_10

    .line 356
    .line 357
    if-eqz v6, :cond_10

    .line 358
    .line 359
    iget-object v10, v14, La/mie0;->a:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v10, Ljava/lang/Exception;

    .line 362
    .line 363
    if-nez v10, :cond_e

    .line 364
    .line 365
    iget-object v10, v9, La/mie0;->a:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v10, Ljava/lang/Exception;

    .line 368
    .line 369
    :cond_e
    if-nez v10, :cond_f

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_f
    throw v10

    .line 373
    :cond_10
    :goto_8
    iget-object v10, v14, La/mie0;->a:Ljava/lang/Object;

    .line 374
    .line 375
    if-nez v10, :cond_13

    .line 376
    .line 377
    new-instance v10, Ljava/util/ArrayList;

    .line 378
    .line 379
    const/16 v11, 0xa

    .line 380
    .line 381
    invoke-static {v1, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v12

    .line 396
    if-eqz v12, :cond_11

    .line 397
    .line 398
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    check-cast v12, La/nas;

    .line 403
    .line 404
    iget-wide v13, v12, La/nas;->a:J

    .line 405
    .line 406
    invoke-static {v13, v14, v10}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 407
    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    goto :goto_9

    .line 411
    :cond_11
    iput-object v13, v0, La/p5v;->s:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v13, v0, La/p5v;->i:La/mie0;

    .line 414
    .line 415
    iput-object v9, v0, La/p5v;->j:La/mie0;

    .line 416
    .line 417
    iput-object v8, v0, La/p5v;->k:Ljava/util/List;

    .line 418
    .line 419
    iput-object v13, v0, La/p5v;->l:Ljava/util/List;

    .line 420
    .line 421
    iput-object v13, v0, La/p5v;->m:La/kzj;

    .line 422
    .line 423
    iput-object v1, v0, La/p5v;->n:Ljava/util/List;

    .line 424
    .line 425
    iput-object v5, v0, La/p5v;->o:Ljava/util/List;

    .line 426
    .line 427
    iput v7, v0, La/p5v;->p:I

    .line 428
    .line 429
    iput v6, v0, La/p5v;->q:I

    .line 430
    .line 431
    iput-byte v15, v0, La/p5v;->r:B

    .line 432
    .line 433
    invoke-virtual {v3, v10, v2, v0}, La/dgu;->c(Ljava/util/ArrayList;Ljava/util/List;La/p5v;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    if-ne v2, v4, :cond_12

    .line 438
    .line 439
    goto :goto_c

    .line 440
    :cond_12
    move v2, v6

    .line 441
    move-object v6, v1

    .line 442
    move v1, v2

    .line 443
    move v2, v7

    .line 444
    :goto_a
    move-object v7, v6

    .line 445
    move v6, v1

    .line 446
    move-object v1, v7

    .line 447
    move v7, v2

    .line 448
    :cond_13
    iget-object v2, v9, La/mie0;->a:Ljava/lang/Object;

    .line 449
    .line 450
    if-nez v2, :cond_16

    .line 451
    .line 452
    new-instance v2, Ljava/util/ArrayList;

    .line 453
    .line 454
    const/16 v11, 0xa

    .line 455
    .line 456
    invoke-static {v5, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 457
    .line 458
    .line 459
    move-result v9

    .line 460
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 468
    .line 469
    .line 470
    move-result v10

    .line 471
    if-eqz v10, :cond_14

    .line 472
    .line 473
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    check-cast v10, La/nas;

    .line 478
    .line 479
    iget-wide v10, v10, La/nas;->a:J

    .line 480
    .line 481
    invoke-static {v10, v11, v2}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 482
    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_14
    const/4 v13, 0x0

    .line 486
    iput-object v13, v0, La/p5v;->s:Ljava/lang/Object;

    .line 487
    .line 488
    iput-object v13, v0, La/p5v;->i:La/mie0;

    .line 489
    .line 490
    iput-object v13, v0, La/p5v;->j:La/mie0;

    .line 491
    .line 492
    iput-object v13, v0, La/p5v;->k:Ljava/util/List;

    .line 493
    .line 494
    iput-object v13, v0, La/p5v;->l:Ljava/util/List;

    .line 495
    .line 496
    iput-object v13, v0, La/p5v;->m:La/kzj;

    .line 497
    .line 498
    iput-object v1, v0, La/p5v;->n:Ljava/util/List;

    .line 499
    .line 500
    iput-object v5, v0, La/p5v;->o:Ljava/util/List;

    .line 501
    .line 502
    iput v7, v0, La/p5v;->p:I

    .line 503
    .line 504
    iput v6, v0, La/p5v;->q:I

    .line 505
    .line 506
    const/4 v6, 0x4

    .line 507
    iput-byte v6, v0, La/p5v;->r:B

    .line 508
    .line 509
    invoke-virtual {v3, v2, v8, v0}, La/dgu;->c(Ljava/util/ArrayList;Ljava/util/List;La/p5v;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    if-ne v0, v4, :cond_15

    .line 514
    .line 515
    :goto_c
    return-object v4

    .line 516
    :cond_15
    move-object v0, v1

    .line 517
    move-object v1, v5

    .line 518
    :goto_d
    move-object v5, v1

    .line 519
    move-object v1, v0

    .line 520
    :cond_16
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    return-object v0
.end method
