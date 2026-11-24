.class public final La/aig;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:La/hzg;

.field public final p:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

.field public final q:La/gr00;

.field public final r:La/soi0;

.field public final s:La/soi0;

.field public final t:La/nsu;

.field public final u:La/bqc;

.field public v:La/bby;

.field public w:Z


# direct methods
.method public constructor <init>(La/hzg;La/mne;La/ctf0;Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/gr00;La/soi0;La/soi0;La/nsu;La/bqc;La/vzg0;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/hfg;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, p4, v1}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p2, La/mne;->c:La/vs10;

    .line 11
    .line 12
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 13
    .line 14
    invoke-static {v1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-instance v1, La/ep4;

    .line 19
    .line 20
    const/16 v2, 0x17

    .line 21
    .line 22
    invoke-direct {v1, p3, v2}, La/ep4;-><init>(La/ctf0;B)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p10, v0, p2, v1}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/aig;->o:La/hzg;

    .line 29
    .line 30
    iput-object p4, p0, La/aig;->p:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 31
    .line 32
    iput-object p5, p0, La/aig;->q:La/gr00;

    .line 33
    .line 34
    iput-object p6, p0, La/aig;->r:La/soi0;

    .line 35
    .line 36
    iput-object p7, p0, La/aig;->s:La/soi0;

    .line 37
    .line 38
    iput-object p8, p0, La/aig;->t:La/nsu;

    .line 39
    .line 40
    iput-object p9, p0, La/aig;->u:La/bqc;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final M(La/shg;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, La/rhg;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    check-cast p1, La/rhg;

    .line 15
    .line 16
    sget-object v0, La/ihg;->a:La/ihg;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 23
    .line 24
    iget-object v5, p0, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/whg;

    .line 33
    .line 34
    iget-boolean p1, p1, La/whg;->h:Z

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, La/aig;->N()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance v6, La/hhq0;

    .line 43
    .line 44
    sget-object v7, La/ygq0;->c:La/ygq0;

    .line 45
    .line 46
    const-wide/16 v8, -0x1

    .line 47
    .line 48
    const-wide/16 v10, -0x1

    .line 49
    .line 50
    invoke-direct/range {v6 .. v11}, La/hhq0;-><init>(La/ygq0;JJ)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-object v9, v6

    .line 63
    move-object v6, p1

    .line 64
    check-cast v6, La/whg;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    const/16 v11, 0xdf

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-static/range {v6 .. v11}, La/whg;->a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v6, v9

    .line 79
    invoke-virtual {v0, p1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    new-instance p1, La/zhg;

    .line 86
    .line 87
    invoke-direct {p1, p0, v6, v3, v1}, La/zhg;-><init>(La/aig;La/hhq0;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, La/aig;->o:La/hzg;

    .line 94
    .line 95
    check-cast p0, La/uzg;

    .line 96
    .line 97
    invoke-virtual {p0}, La/uzg;->a()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    sget-object v0, La/mhg;->a:La/mhg;

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    invoke-virtual {p0}, La/aig;->N()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    instance-of v0, p1, La/lhg;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    check-cast p1, La/lhg;

    .line 118
    .line 119
    iget-object p1, p1, La/lhg;->a:Ljava/lang/String;

    .line 120
    .line 121
    new-instance v0, La/ffd;

    .line 122
    .line 123
    invoke-direct {v0, p0, p1, v3, v2}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {p0, v3, v3, v0, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_4
    sget-object v0, La/jhg;->a:La/jhg;

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_5

    .line 137
    .line 138
    sget-object p1, La/thg;->a:La/thg;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_5
    sget-object v0, La/ohg;->a:La/ohg;

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    const/4 v1, 0x1

    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 154
    .line 155
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object v5, p1

    .line 163
    check-cast v5, La/whg;

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-boolean v6, v5, La/whg;->d:Z

    .line 169
    .line 170
    xor-int/lit8 v7, v6, 0x1

    .line 171
    .line 172
    const/4 v9, 0x0

    .line 173
    const/16 v10, 0xf7

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v8, 0x0

    .line 177
    invoke-static/range {v5 .. v10}, La/whg;->a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v0, p1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_6

    .line 186
    .line 187
    new-instance p1, La/yhg;

    .line 188
    .line 189
    invoke-direct {p1, p0, v3, v2}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 190
    .line 191
    .line 192
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_7
    sget-object v0, La/phg;->a:La/phg;

    .line 197
    .line 198
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_8

    .line 203
    .line 204
    new-instance p1, La/uhg;

    .line 205
    .line 206
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, La/whg;

    .line 211
    .line 212
    iget-object v0, v0, La/whg;->f:La/hhq0;

    .line 213
    .line 214
    invoke-direct {p1, v0}, La/uhg;-><init>(La/hhq0;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    instance-of v0, p1, La/qhg;

    .line 222
    .line 223
    if-eqz v0, :cond_a

    .line 224
    .line 225
    check-cast p1, La/qhg;

    .line 226
    .line 227
    iget-object v9, p1, La/qhg;->a:La/hhq0;

    .line 228
    .line 229
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 230
    .line 231
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-object v6, p1

    .line 239
    check-cast v6, La/whg;

    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    const/4 v10, 0x0

    .line 245
    const/16 v11, 0xdf

    .line 246
    .line 247
    const/4 v7, 0x0

    .line 248
    const/4 v8, 0x0

    .line 249
    invoke-static/range {v6 .. v11}, La/whg;->a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {v0, p1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-eqz p1, :cond_9

    .line 258
    .line 259
    new-instance p1, La/zhg;

    .line 260
    .line 261
    invoke-direct {p1, p0, v9, v3, v1}, La/zhg;-><init>(La/aig;La/hhq0;La/yje;B)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_a
    sget-object v0, La/khg;->a:La/khg;

    .line 269
    .line 270
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_b

    .line 275
    .line 276
    new-instance p1, La/yhg;

    .line 277
    .line 278
    invoke-direct {p1, p0, v3, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 279
    .line 280
    .line 281
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_b
    instance-of v0, p1, La/nhg;

    .line 286
    .line 287
    if-eqz v0, :cond_d

    .line 288
    .line 289
    check-cast p1, La/nhg;

    .line 290
    .line 291
    iget-object v7, p1, La/nhg;->a:La/cnb;

    .line 292
    .line 293
    iput-boolean v1, p0, La/aig;->w:Z

    .line 294
    .line 295
    iget-object p0, v5, La/ocj;->a:La/p7m0;

    .line 296
    .line 297
    :cond_c
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-object v6, p1

    .line 305
    check-cast v6, La/whg;

    .line 306
    .line 307
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    const/4 v10, 0x0

    .line 311
    const/16 v11, 0xfd

    .line 312
    .line 313
    const/4 v8, 0x0

    .line 314
    const/4 v9, 0x0

    .line 315
    invoke-static/range {v6 .. v11}, La/whg;->a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result p1

    .line 323
    if-eqz p1, :cond_c

    .line 324
    .line 325
    return-void

    .line 326
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_e
    instance-of v0, p1, La/hhg;

    .line 331
    .line 332
    if-eqz v0, :cond_14

    .line 333
    .line 334
    check-cast p1, La/hhg;

    .line 335
    .line 336
    sget-object v0, La/ghg;->a:La/ghg;

    .line 337
    .line 338
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_10

    .line 343
    .line 344
    iget-object p1, p0, La/aig;->v:La/bby;

    .line 345
    .line 346
    if-eqz p1, :cond_f

    .line 347
    .line 348
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 349
    .line 350
    .line 351
    :cond_f
    new-instance p1, La/yhg;

    .line 352
    .line 353
    invoke-direct {p1, p0, v3, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 354
    .line 355
    .line 356
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    iput-object p1, p0, La/aig;->v:La/bby;

    .line 361
    .line 362
    return-void

    .line 363
    :cond_10
    sget-object v0, La/fhg;->a:La/fhg;

    .line 364
    .line 365
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_12

    .line 370
    .line 371
    iget-object p0, p0, La/aig;->v:La/bby;

    .line 372
    .line 373
    if-eqz p0, :cond_11

    .line 374
    .line 375
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 376
    .line 377
    .line 378
    :cond_11
    return-void

    .line 379
    :cond_12
    sget-object v0, La/ehg;->a:La/ehg;

    .line 380
    .line 381
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    if-eqz p1, :cond_13

    .line 386
    .line 387
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final N()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/whg;

    .line 6
    .line 7
    iget-boolean v0, v0, La/whg;->h:Z

    .line 8
    .line 9
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 10
    .line 11
    iget-object v2, p0, La/i3t0;->i:La/ocj;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, La/whg;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/16 v8, 0x7b

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-static/range {v3 .. v8}, La/whg;->a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    new-instance v0, La/yhg;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v0, p0, v2, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x3

    .line 54
    invoke-static {p0, v2, v2, v0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v2, v0

    .line 68
    check-cast v2, La/whg;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    const/16 v7, 0x7f

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-static/range {v2 .. v7}, La/whg;->a(La/whg;La/cnb;ZLa/hhq0;ZI)La/whg;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p0, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    return-void
.end method

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/shg;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/aig;->M(La/shg;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
