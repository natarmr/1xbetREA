.class public final La/lau;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/f4u;

.field public final c:La/pru;

.field public final d:La/lbu;

.field public final e:La/epc;

.field public final f:La/iqi;

.field public final g:La/r9u;


# direct methods
.method public constructor <init>(La/f4u;La/pru;La/lbu;La/epc;La/iqi;La/r9u;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/lau;->a:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/lau;->b:La/f4u;

    .line 17
    .line 18
    iput-object p2, p0, La/lau;->c:La/pru;

    .line 19
    .line 20
    iput-object p3, p0, La/lau;->d:La/lbu;

    .line 21
    .line 22
    iput-object p4, p0, La/lau;->e:La/epc;

    .line 23
    .line 24
    iput-object p5, p0, La/lau;->f:La/iqi;

    .line 25
    .line 26
    iput-object p6, p0, La/lau;->g:La/r9u;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(La/f4u;La/pru;La/lbu;La/iqi;La/epc;La/r9u;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/lau;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, La/lau;->b:La/f4u;

    .line 31
    iput-object p2, p0, La/lau;->c:La/pru;

    .line 32
    iput-object p3, p0, La/lau;->d:La/lbu;

    .line 33
    iput-object p4, p0, La/lau;->f:La/iqi;

    .line 34
    iput-object p5, p0, La/lau;->e:La/epc;

    .line 35
    iput-object p6, p0, La/lau;->g:La/r9u;

    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/lau;->a:B

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    iget-object v4, v0, La/lau;->f:La/iqi;

    .line 9
    .line 10
    iget-object v5, v0, La/lau;->e:La/epc;

    .line 11
    .line 12
    iget-object v6, v0, La/lau;->b:La/f4u;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v8, v0, La/lau;->c:La/pru;

    .line 16
    .line 17
    iget-object v9, v0, La/lau;->d:La/lbu;

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const-string v11, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    const/high16 v12, -0x80000000

    .line 23
    .line 24
    iget-object v13, v0, La/lau;->g:La/r9u;

    .line 25
    .line 26
    const/4 v14, 0x1

    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    instance-of v2, v1, La/qau;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    check-cast v2, La/qau;

    .line 36
    .line 37
    iget v15, v2, La/qau;->n:I

    .line 38
    .line 39
    and-int v16, v15, v12

    .line 40
    .line 41
    if-eqz v16, :cond_0

    .line 42
    .line 43
    sub-int/2addr v15, v12

    .line 44
    iput v15, v2, La/qau;->n:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v2, La/qau;

    .line 48
    .line 49
    invoke-direct {v2, v0, v1}, La/qau;-><init>(La/lau;La/zje;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v0, v2, La/qau;->l:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v1, La/wne;->a:La/wne;

    .line 55
    .line 56
    iget v12, v2, La/qau;->n:I

    .line 57
    .line 58
    if-eqz v12, :cond_2

    .line 59
    .line 60
    if-ne v12, v14, :cond_1

    .line 61
    .line 62
    iget-boolean v1, v2, La/qau;->i:Z

    .line 63
    .line 64
    iget-object v4, v2, La/qau;->k:La/c5q;

    .line 65
    .line 66
    iget-object v2, v2, La/qau;->j:La/sff0;

    .line 67
    .line 68
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_1
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, La/lbu;->j()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    move-object v15, v6

    .line 86
    invoke-virtual {v8}, La/pru;->a()La/sff0;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    iget-boolean v0, v6, La/sff0;->B0:Z

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    sget-object v0, La/ygp;->u:La/ygp;

    .line 95
    .line 96
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v8, v13, La/r9u;->a:La/j1q0;

    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v8, v8, La/j1q0;->a:La/m1q0;

    .line 105
    .line 106
    invoke-virtual {v8, v0}, La/m1q0;->d(La/ygp;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    move v11, v14

    .line 113
    goto :goto_1

    .line 114
    :cond_3
    move v11, v7

    .line 115
    :goto_1
    invoke-virtual {v15}, La/f4u;->b()La/xv10;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, La/xv10;->c:Ljava/util/List;

    .line 120
    .line 121
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    new-instance v7, La/jno;

    .line 126
    .line 127
    invoke-direct {v7, v14, v9}, La/jno;-><init>(BZ)V

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v7}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget-object v7, La/ygp;->E1:La/ygp;

    .line 135
    .line 136
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v8, v13, La/r9u;->a:La/j1q0;

    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v8, v8, La/j1q0;->a:La/m1q0;

    .line 145
    .line 146
    invoke-virtual {v8, v7}, La/m1q0;->d(La/ygp;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v5}, La/epc;->a()La/hr4;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iget-boolean v7, v5, La/hr4;->a:Z

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    const/16 v12, 0x10

    .line 158
    .line 159
    move-object v5, v0

    .line 160
    invoke-static/range {v5 .. v12}, La/qbc;->N(Lkotlin/sequences/Sequence;La/sff0;ZZZZZI)La/c5q;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v6, v2, La/qau;->j:La/sff0;

    .line 165
    .line 166
    iput-object v0, v2, La/qau;->k:La/c5q;

    .line 167
    .line 168
    iput-boolean v9, v2, La/qau;->i:Z

    .line 169
    .line 170
    iput v14, v2, La/qau;->n:I

    .line 171
    .line 172
    invoke-virtual {v4, v2}, La/iqi;->g(La/zje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    if-ne v2, v1, :cond_4

    .line 177
    .line 178
    move-object v10, v1

    .line 179
    goto :goto_3

    .line 180
    :cond_4
    move-object v4, v0

    .line 181
    move-object v0, v2

    .line 182
    move-object v2, v6

    .line 183
    move v1, v9

    .line 184
    :goto_2
    check-cast v0, La/vh0;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v5, La/lrc0;

    .line 196
    .line 197
    invoke-direct {v5, v0, v2, v1, v3}, La/lrc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 198
    .line 199
    .line 200
    invoke-static {v4, v5}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    :goto_3
    return-object v10

    .line 209
    :pswitch_0
    move-object v15, v6

    .line 210
    instance-of v2, v1, La/kau;

    .line 211
    .line 212
    if-eqz v2, :cond_5

    .line 213
    .line 214
    move-object v2, v1

    .line 215
    check-cast v2, La/kau;

    .line 216
    .line 217
    iget v6, v2, La/kau;->n:I

    .line 218
    .line 219
    and-int v16, v6, v12

    .line 220
    .line 221
    if-eqz v16, :cond_5

    .line 222
    .line 223
    sub-int/2addr v6, v12

    .line 224
    iput v6, v2, La/kau;->n:I

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_5
    new-instance v2, La/kau;

    .line 228
    .line 229
    invoke-direct {v2, v0, v1}, La/kau;-><init>(La/lau;La/zje;)V

    .line 230
    .line 231
    .line 232
    :goto_4
    iget-object v0, v2, La/kau;->l:Ljava/lang/Object;

    .line 233
    .line 234
    sget-object v1, La/wne;->a:La/wne;

    .line 235
    .line 236
    iget v6, v2, La/kau;->n:I

    .line 237
    .line 238
    if-eqz v6, :cond_7

    .line 239
    .line 240
    if-ne v6, v14, :cond_6

    .line 241
    .line 242
    iget-boolean v1, v2, La/kau;->i:Z

    .line 243
    .line 244
    iget-object v4, v2, La/kau;->k:La/c5q;

    .line 245
    .line 246
    iget-object v2, v2, La/kau;->j:La/sff0;

    .line 247
    .line 248
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_6

    .line 252
    .line 253
    :cond_6
    invoke-static {v11}, La/jf4;->n(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_7

    .line 257
    .line 258
    :cond_7
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9}, La/lbu;->j()Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    invoke-virtual {v8}, La/pru;->a()La/sff0;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    iget-boolean v0, v6, La/sff0;->B0:Z

    .line 270
    .line 271
    if-eqz v0, :cond_8

    .line 272
    .line 273
    sget-object v0, La/ygp;->u:La/ygp;

    .line 274
    .line 275
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v8, v13, La/r9u;->a:La/j1q0;

    .line 279
    .line 280
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v8, v8, La/j1q0;->a:La/m1q0;

    .line 284
    .line 285
    invoke-virtual {v8, v0}, La/m1q0;->d(La/ygp;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_8

    .line 290
    .line 291
    move v11, v14

    .line 292
    goto :goto_5

    .line 293
    :cond_8
    move v11, v7

    .line 294
    :goto_5
    invoke-virtual {v15}, La/f4u;->b()La/xv10;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, La/xv10;->d:Ljava/util/List;

    .line 299
    .line 300
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    new-instance v7, La/jno;

    .line 305
    .line 306
    invoke-direct {v7, v14, v9}, La/jno;-><init>(BZ)V

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v7}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    sget-object v7, La/ygp;->E1:La/ygp;

    .line 314
    .line 315
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-object v8, v13, La/r9u;->a:La/j1q0;

    .line 319
    .line 320
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v8, v8, La/j1q0;->a:La/m1q0;

    .line 324
    .line 325
    invoke-virtual {v8, v7}, La/m1q0;->d(La/ygp;)Z

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    invoke-virtual {v5}, La/epc;->a()La/hr4;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    iget-boolean v7, v5, La/hr4;->a:Z

    .line 334
    .line 335
    const/4 v10, 0x0

    .line 336
    const/16 v12, 0x10

    .line 337
    .line 338
    move-object v5, v0

    .line 339
    invoke-static/range {v5 .. v12}, La/qbc;->N(Lkotlin/sequences/Sequence;La/sff0;ZZZZZI)La/c5q;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iput-object v6, v2, La/kau;->j:La/sff0;

    .line 344
    .line 345
    iput-object v0, v2, La/kau;->k:La/c5q;

    .line 346
    .line 347
    iput-boolean v9, v2, La/kau;->i:Z

    .line 348
    .line 349
    iput v14, v2, La/kau;->n:I

    .line 350
    .line 351
    invoke-virtual {v4, v2}, La/iqi;->g(La/zje;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-ne v2, v1, :cond_9

    .line 356
    .line 357
    move-object v10, v1

    .line 358
    goto :goto_7

    .line 359
    :cond_9
    move-object v4, v0

    .line 360
    move-object v0, v2

    .line 361
    move-object v2, v6

    .line 362
    move v1, v9

    .line 363
    :goto_6
    check-cast v0, La/vh0;

    .line 364
    .line 365
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    new-instance v5, La/lrc0;

    .line 375
    .line 376
    invoke-direct {v5, v0, v2, v1, v3}, La/lrc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 377
    .line 378
    .line 379
    invoke-static {v4, v5}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v0}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    :goto_7
    return-object v10

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
