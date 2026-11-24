.class public final La/els0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

.field public final p:La/hzg;

.field public final q:La/lbu;

.field public final r:La/ctf0;

.field public final s:La/j3c;

.field public final t:La/ih5;

.field public final u:La/zr1;

.field public v:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;La/mne;La/hzg;La/lbu;La/ctf0;La/g2v;La/j3c;La/ih5;La/zr1;)V
    .locals 3

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, La/yip0;

    .line 11
    .line 12
    const/16 v1, 0x19

    .line 13
    .line 14
    invoke-direct {v0, p1, p5, v1}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/cls0;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p6, p5, v2}, La/cls0;-><init>(La/g2v;La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    const/4 p6, 0x0

    .line 24
    invoke-direct {p0, v0, p2, v1, p6}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/els0;->o:Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 28
    .line 29
    iput-object p3, p0, La/els0;->p:La/hzg;

    .line 30
    .line 31
    iput-object p4, p0, La/els0;->q:La/lbu;

    .line 32
    .line 33
    iput-object p5, p0, La/els0;->r:La/ctf0;

    .line 34
    .line 35
    iput-object p7, p0, La/els0;->s:La/j3c;

    .line 36
    .line 37
    iput-object p8, p0, La/els0;->t:La/ih5;

    .line 38
    .line 39
    iput-object p9, p0, La/els0;->u:La/zr1;

    .line 40
    .line 41
    new-instance p1, La/aiz;

    .line 42
    .line 43
    const/4 p2, 0x1

    .line 44
    invoke-direct {p1, p0, p6, p2}, La/aiz;-><init>(La/i3t0;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x3

    .line 48
    invoke-static {p0, p6, p6, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final M(ZJ)V
    .locals 7

    .line 1
    iget-object v0, p0, La/els0;->v:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v1, La/dls0;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v2, p0

    .line 12
    move v5, p1

    .line 13
    move-wide v3, p2

    .line 14
    invoke-direct/range {v1 .. v6}, La/dls0;-><init>(La/els0;JZLa/yje;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {v2, p1, p1, v1, p0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, v2, La/els0;->v:La/bby;

    .line 24
    .line 25
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/qis0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v0, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    instance-of v2, v1, La/pis0;

    .line 14
    .line 15
    if-eqz v2, :cond_14

    .line 16
    .line 17
    check-cast v1, La/pis0;

    .line 18
    .line 19
    sget-object v2, La/eis0;->a:La/eis0;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 26
    .line 27
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 28
    .line 29
    sget-object v5, La/kks0;->a:La/kks0;

    .line 30
    .line 31
    iget-object v6, v0, La/els0;->p:La/hzg;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/pks0;

    .line 40
    .line 41
    iget-boolean v1, v1, La/pks0;->g:Z

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 46
    .line 47
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-object v6, v2

    .line 55
    check-cast v6, La/pks0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0xebf

    .line 62
    .line 63
    const-wide/16 v7, 0x0

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    const-string v13, ""

    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    invoke-static/range {v6 .. v16}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0, v5}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    check-cast v6, La/uzg;

    .line 87
    .line 88
    invoke-virtual {v6}, La/uzg;->a()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    sget-object v2, La/jis0;->a:La/jis0;

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, La/pks0;

    .line 105
    .line 106
    iget-wide v1, v1, La/pks0;->b:J

    .line 107
    .line 108
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, La/pks0;

    .line 113
    .line 114
    iget-boolean v3, v3, La/pks0;->h:Z

    .line 115
    .line 116
    invoke-virtual {v0, v3, v1, v2}, La/els0;->M(ZJ)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    sget-object v2, La/his0;->a:La/his0;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0, v5}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    sget-object v2, La/lis0;->a:La/lis0;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_6

    .line 139
    .line 140
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 141
    .line 142
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-object v4, v0

    .line 150
    check-cast v4, La/pks0;

    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const/16 v14, 0xfbf

    .line 157
    .line 158
    const-wide/16 v5, 0x0

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    const/4 v8, 0x0

    .line 162
    const/4 v9, 0x1

    .line 163
    const/4 v10, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    const/4 v12, 0x0

    .line 166
    invoke-static/range {v4 .. v14}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_5

    .line 175
    .line 176
    return-void

    .line 177
    :cond_6
    instance-of v2, v1, La/mis0;

    .line 178
    .line 179
    if-eqz v2, :cond_8

    .line 180
    .line 181
    move-object v2, v1

    .line 182
    check-cast v2, La/mis0;

    .line 183
    .line 184
    iget-object v5, v4, La/ocj;->a:La/p7m0;

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-object v6, v0

    .line 194
    check-cast v6, La/pks0;

    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v13, v2, La/mis0;->a:Ljava/lang/String;

    .line 200
    .line 201
    const/4 v15, 0x0

    .line 202
    const/16 v16, 0xeff

    .line 203
    .line 204
    const-wide/16 v7, 0x0

    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    const/4 v10, 0x0

    .line 208
    const/4 v11, 0x0

    .line 209
    const/4 v12, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    invoke-static/range {v6 .. v16}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v5, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_7

    .line 220
    .line 221
    return-void

    .line 222
    :cond_8
    instance-of v2, v1, La/fis0;

    .line 223
    .line 224
    if-eqz v2, :cond_a

    .line 225
    .line 226
    check-cast v1, La/fis0;

    .line 227
    .line 228
    iget-wide v1, v1, La/fis0;->a:J

    .line 229
    .line 230
    const-wide/16 v3, 0x1

    .line 231
    .line 232
    cmp-long v3, v1, v3

    .line 233
    .line 234
    if-nez v3, :cond_9

    .line 235
    .line 236
    new-instance v1, La/lks0;

    .line 237
    .line 238
    new-instance v2, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;

    .line 239
    .line 240
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, La/pks0;

    .line 245
    .line 246
    iget-wide v3, v3, La/pks0;->b:J

    .line 247
    .line 248
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    check-cast v5, La/pks0;

    .line 253
    .line 254
    iget-object v5, v5, La/pks0;->l:Ljava/util/List;

    .line 255
    .line 256
    invoke-direct {v2, v3, v4, v5}, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;-><init>(JLjava/util/List;)V

    .line 257
    .line 258
    .line 259
    invoke-direct {v1, v2}, La/lks0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_9
    const-wide/16 v3, 0x2

    .line 267
    .line 268
    cmp-long v1, v1, v3

    .line 269
    .line 270
    if-nez v1, :cond_17

    .line 271
    .line 272
    new-instance v1, La/nks0;

    .line 273
    .line 274
    new-instance v2, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 275
    .line 276
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, La/pks0;

    .line 281
    .line 282
    iget-object v3, v3, La/pks0;->k:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 283
    .line 284
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    check-cast v4, La/pks0;

    .line 289
    .line 290
    iget-object v4, v4, La/pks0;->j:Ljava/util/List;

    .line 291
    .line 292
    invoke-direct {v2, v3, v4}, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v1, v2}, La/nks0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_a
    instance-of v2, v1, La/gis0;

    .line 303
    .line 304
    const/4 v5, 0x1

    .line 305
    if-eqz v2, :cond_b

    .line 306
    .line 307
    check-cast v1, La/gis0;

    .line 308
    .line 309
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, La/pks0;

    .line 314
    .line 315
    iget-wide v2, v2, La/pks0;->b:J

    .line 316
    .line 317
    iget-wide v6, v1, La/gis0;->a:J

    .line 318
    .line 319
    cmp-long v1, v2, v6

    .line 320
    .line 321
    if-eqz v1, :cond_17

    .line 322
    .line 323
    invoke-virtual {v0, v5, v6, v7}, La/els0;->M(ZJ)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_b
    instance-of v2, v1, La/ois0;

    .line 328
    .line 329
    if-eqz v2, :cond_d

    .line 330
    .line 331
    check-cast v1, La/ois0;

    .line 332
    .line 333
    iget-object v13, v1, La/ois0;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 334
    .line 335
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, La/pks0;

    .line 340
    .line 341
    iget-object v0, v0, La/pks0;->k:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 342
    .line 343
    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-nez v0, :cond_17

    .line 348
    .line 349
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 350
    .line 351
    :cond_c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-object v5, v1

    .line 359
    check-cast v5, La/pks0;

    .line 360
    .line 361
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    const/16 v15, 0xb7f

    .line 366
    .line 367
    const-wide/16 v6, 0x0

    .line 368
    .line 369
    const/4 v8, 0x0

    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v10, 0x0

    .line 372
    const/4 v11, 0x1

    .line 373
    const/4 v12, 0x0

    .line 374
    invoke-static/range {v5 .. v15}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_c

    .line 383
    .line 384
    return-void

    .line 385
    :cond_d
    instance-of v2, v1, La/iis0;

    .line 386
    .line 387
    if-eqz v2, :cond_e

    .line 388
    .line 389
    check-cast v1, La/iis0;

    .line 390
    .line 391
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, La/pks0;

    .line 396
    .line 397
    iget-wide v9, v0, La/pks0;->b:J

    .line 398
    .line 399
    iget-object v11, v1, La/iis0;->a:Ljava/lang/String;

    .line 400
    .line 401
    move-object v8, v6

    .line 402
    check-cast v8, La/uzg;

    .line 403
    .line 404
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    iget-object v0, v8, La/uzg;->a:La/oeg0;

    .line 408
    .line 409
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    new-instance v7, La/mz0;

    .line 414
    .line 415
    const/16 v12, 0xc

    .line 416
    .line 417
    invoke-direct/range {v7 .. v12}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v7}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_e
    instance-of v2, v1, La/nis0;

    .line 425
    .line 426
    if-eqz v2, :cond_11

    .line 427
    .line 428
    check-cast v1, La/nis0;

    .line 429
    .line 430
    const/4 v2, 0x5

    .line 431
    new-array v2, v2, [La/yxg;

    .line 432
    .line 433
    sget-object v3, La/ttg;->d:La/ttg;

    .line 434
    .line 435
    const/4 v4, 0x0

    .line 436
    aput-object v3, v2, v4

    .line 437
    .line 438
    sget-object v3, La/trg;->d:La/trg;

    .line 439
    .line 440
    aput-object v3, v2, v5

    .line 441
    .line 442
    sget-object v3, La/oxg;->d:La/oxg;

    .line 443
    .line 444
    const/4 v5, 0x2

    .line 445
    aput-object v3, v2, v5

    .line 446
    .line 447
    sget-object v3, La/pug;->d:La/pug;

    .line 448
    .line 449
    const/4 v5, 0x3

    .line 450
    aput-object v3, v2, v5

    .line 451
    .line 452
    sget-object v3, La/yvg;->d:La/yvg;

    .line 453
    .line 454
    const/4 v5, 0x4

    .line 455
    aput-object v3, v2, v5

    .line 456
    .line 457
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    new-instance v3, Ljava/util/ArrayList;

    .line 462
    .line 463
    const/16 v5, 0xa

    .line 464
    .line 465
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v5

    .line 480
    if-eqz v5, :cond_f

    .line 481
    .line 482
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    check-cast v5, La/yxg;

    .line 487
    .line 488
    iget-wide v7, v5, La/yxg;->a:J

    .line 489
    .line 490
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_0

    .line 498
    :cond_f
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    check-cast v2, La/pks0;

    .line 503
    .line 504
    iget-wide v7, v2, La/pks0;->b:J

    .line 505
    .line 506
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-eqz v2, :cond_10

    .line 515
    .line 516
    iget-wide v2, v1, La/nis0;->a:J

    .line 517
    .line 518
    const-wide/16 v7, -0x1

    .line 519
    .line 520
    cmp-long v5, v2, v7

    .line 521
    .line 522
    if-eqz v5, :cond_10

    .line 523
    .line 524
    const-wide/16 v7, 0x0

    .line 525
    .line 526
    cmp-long v2, v2, v7

    .line 527
    .line 528
    if-eqz v2, :cond_10

    .line 529
    .line 530
    sget-object v2, La/r1g;->v:La/r1g;

    .line 531
    .line 532
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    check-cast v3, La/pks0;

    .line 537
    .line 538
    iget-wide v3, v3, La/pks0;->b:J

    .line 539
    .line 540
    iget-object v5, v0, La/els0;->t:La/ih5;

    .line 541
    .line 542
    invoke-virtual {v5, v2, v3, v4}, La/ih5;->p(La/r1g;J)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    check-cast v2, La/pks0;

    .line 550
    .line 551
    iget-wide v2, v2, La/pks0;->b:J

    .line 552
    .line 553
    iget-object v4, v0, La/els0;->u:La/zr1;

    .line 554
    .line 555
    const-string v5, "cyber_transfers"

    .line 556
    .line 557
    invoke-virtual {v4, v2, v3, v5}, La/zr1;->z(JLjava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    check-cast v0, La/pks0;

    .line 565
    .line 566
    iget-wide v8, v0, La/pks0;->b:J

    .line 567
    .line 568
    iget-wide v10, v1, La/nis0;->a:J

    .line 569
    .line 570
    iget-object v12, v1, La/nis0;->b:Ljava/lang/String;

    .line 571
    .line 572
    sget-object v13, La/k1g;->h:La/k1g;

    .line 573
    .line 574
    move-object v7, v6

    .line 575
    check-cast v7, La/uzg;

    .line 576
    .line 577
    invoke-virtual/range {v7 .. v13}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :cond_10
    new-array v1, v4, [Ljava/lang/Object;

    .line 582
    .line 583
    iget-object v2, v0, La/els0;->r:La/ctf0;

    .line 584
    .line 585
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 586
    .line 587
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    const v3, 0x7f131302

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    new-instance v2, La/mks0;

    .line 599
    .line 600
    invoke-direct {v2, v1}, La/mks0;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :cond_11
    sget-object v0, La/kis0;->a:La/kis0;

    .line 608
    .line 609
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_13

    .line 614
    .line 615
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 616
    .line 617
    :cond_12
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-object v4, v1

    .line 625
    check-cast v4, La/pks0;

    .line 626
    .line 627
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    const/16 v14, 0xf7f

    .line 632
    .line 633
    const-wide/16 v5, 0x0

    .line 634
    .line 635
    const/4 v7, 0x0

    .line 636
    const/4 v8, 0x0

    .line 637
    const/4 v9, 0x0

    .line 638
    const/4 v10, 0x0

    .line 639
    const/4 v11, 0x0

    .line 640
    const/4 v12, 0x0

    .line 641
    invoke-static/range {v4 .. v14}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-eqz v1, :cond_12

    .line 650
    .line 651
    return-void

    .line 652
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 653
    .line 654
    .line 655
    return-void

    .line 656
    :cond_14
    instance-of v2, v1, La/dis0;

    .line 657
    .line 658
    if-eqz v2, :cond_19

    .line 659
    .line 660
    check-cast v1, La/dis0;

    .line 661
    .line 662
    sget-object v2, La/ais0;->a:La/ais0;

    .line 663
    .line 664
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    if-eqz v2, :cond_15

    .line 669
    .line 670
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 671
    .line 672
    .line 673
    return-void

    .line 674
    :cond_15
    sget-object v2, La/bis0;->a:La/bis0;

    .line 675
    .line 676
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v2

    .line 680
    if-eqz v2, :cond_16

    .line 681
    .line 682
    iget-object v0, v0, La/els0;->v:La/bby;

    .line 683
    .line 684
    if-eqz v0, :cond_17

    .line 685
    .line 686
    const/4 v1, 0x0

    .line 687
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 688
    .line 689
    .line 690
    return-void

    .line 691
    :cond_16
    sget-object v2, La/cis0;->a:La/cis0;

    .line 692
    .line 693
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    if-eqz v1, :cond_18

    .line 698
    .line 699
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    check-cast v1, La/pks0;

    .line 704
    .line 705
    iget-object v1, v1, La/pks0;->e:La/j0g0;

    .line 706
    .line 707
    if-nez v1, :cond_17

    .line 708
    .line 709
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    check-cast v1, La/pks0;

    .line 714
    .line 715
    iget-wide v1, v1, La/pks0;->b:J

    .line 716
    .line 717
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    check-cast v3, La/pks0;

    .line 722
    .line 723
    iget-boolean v3, v3, La/pks0;->h:Z

    .line 724
    .line 725
    invoke-virtual {v0, v3, v1, v2}, La/els0;->M(ZJ)V

    .line 726
    .line 727
    .line 728
    :cond_17
    return-void

    .line 729
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 734
    .line 735
    .line 736
    return-void
.end method
