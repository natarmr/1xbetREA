.class public final La/z6d;
.super La/s1;
.source "SourceFile"


# instance fields
.field public A1:Z

.field public B1:J

.field public C1:Z

.field public l1:Lkotlin/jvm/functions/Function0;

.field public m1:Z

.field public final n1:La/jy40;

.field public final o1:La/jy40;

.field public p1:La/dpa0;

.field public q1:La/c4m0;

.field public r1:La/c4m0;

.field public s1:Z

.field public t1:Z

.field public u1:J

.field public v1:Z

.field public w1:La/x6x;

.field public x1:La/c4m0;

.field public y1:La/c4m0;

.field public z1:Z


# direct methods
.method public constructor <init>(La/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V
    .locals 8

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v7, p2

    .line 8
    move v4, p4

    .line 9
    invoke-direct/range {v0 .. v7}, La/s1;-><init>(La/gy40;La/d6x;ZZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    iput-object p3, v0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    iput-boolean p0, v0, La/z6d;->m1:Z

    .line 16
    .line 17
    sget p0, La/f710;->a:I

    .line 18
    .line 19
    new-instance p0, La/jy40;

    .line 20
    .line 21
    const/4 p1, 0x6

    .line 22
    invoke-direct {p0, p1}, La/jy40;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p0, v0, La/z6d;->n1:La/jy40;

    .line 26
    .line 27
    new-instance p0, La/jy40;

    .line 28
    .line 29
    invoke-direct {p0, p1}, La/jy40;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p0, v0, La/z6d;->o1:La/jy40;

    .line 33
    .line 34
    const-wide/16 p0, -0x1

    .line 35
    .line 36
    iput-wide p0, v0, La/z6d;->u1:J

    .line 37
    .line 38
    iput-wide p0, v0, La/z6d;->B1:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final T0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/z6d;->t1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y(La/zz2;La/xoa0;)V
    .locals 9

    .line 1
    iget-object p1, p1, La/zz2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, La/s1;->k1()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/s1;->v:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La/s1;->z:La/amt;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, La/amt;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/amt;-><init>(La/zlt;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/s1;->z:La/amt;

    .line 25
    .line 26
    :cond_0
    sget-object v0, La/xoa0;->b:La/xoa0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    const/4 v2, 0x0

    .line 30
    if-ne p2, v0, :cond_e

    .line 31
    .line 32
    iget-object p2, p0, La/z6d;->w1:La/x6x;

    .line 33
    .line 34
    if-nez p2, :cond_5

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    move v0, v2

    .line 41
    :goto_0
    if-ge v0, p2, :cond_10

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, La/x6x;

    .line 48
    .line 49
    invoke-static {v3}, La/g7x;->v(La/x6x;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, La/x6x;

    .line 60
    .line 61
    iput-boolean v1, p1, La/x6x;->i:Z

    .line 62
    .line 63
    iput-object p1, p0, La/z6d;->w1:La/x6x;

    .line 64
    .line 65
    iget-boolean p2, p0, La/s1;->v:Z

    .line 66
    .line 67
    if-eqz p2, :cond_10

    .line 68
    .line 69
    iget-object p2, p0, La/z6d;->y1:La/c4m0;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    invoke-virtual {p2}, La/pby;->isActive()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-ne p2, v1, :cond_3

    .line 79
    .line 80
    sget-object p2, La/bmd;->t:La/zfn;

    .line 81
    .line 82
    invoke-static {p0, p2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, La/wgu0;

    .line 87
    .line 88
    invoke-interface {p2}, La/wgu0;->b()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    iget-wide v5, p1, La/x6x;->b:J

    .line 93
    .line 94
    iget-wide v7, p0, La/z6d;->B1:J

    .line 95
    .line 96
    sub-long/2addr v5, v7

    .line 97
    cmp-long p2, v5, v3

    .line 98
    .line 99
    if-gez p2, :cond_1

    .line 100
    .line 101
    iput-boolean v1, p0, La/z6d;->C1:Z

    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    iput-boolean v1, p0, La/z6d;->z1:Z

    .line 105
    .line 106
    iget-object p2, p0, La/z6d;->y1:La/c4m0;

    .line 107
    .line 108
    if-eqz p2, :cond_2

    .line 109
    .line 110
    invoke-virtual {p2, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    iput-object v0, p0, La/z6d;->y1:La/c4m0;

    .line 114
    .line 115
    :cond_3
    iput-boolean v2, p0, La/z6d;->A1:Z

    .line 116
    .line 117
    invoke-virtual {p0, p1}, La/s1;->i1(La/x6x;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 121
    .line 122
    if-eqz p1, :cond_10

    .line 123
    .line 124
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance p2, La/y6d;

    .line 129
    .line 130
    invoke-direct {p2, p0, v0, v1}, La/y6d;-><init>(La/z6d;La/yje;B)V

    .line 131
    .line 132
    .line 133
    const/4 v1, 0x3

    .line 134
    invoke-static {p1, v0, v0, p2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, La/z6d;->x1:La/c4m0;

    .line 139
    .line 140
    return-void

    .line 141
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    iget-boolean p2, p0, La/z6d;->A1:Z

    .line 145
    .line 146
    if-eqz p2, :cond_8

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    move v0, v2

    .line 153
    :goto_1
    if-ge v0, p2, :cond_7

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, La/x6x;

    .line 160
    .line 161
    iget-boolean v4, v3, La/x6x;->h:Z

    .line 162
    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    iget-boolean v3, v3, La/x6x;->d:Z

    .line 166
    .line 167
    if-nez v3, :cond_6

    .line 168
    .line 169
    add-int/lit8 v0, v0, 0x1

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    :goto_2
    if-ge v2, p0, :cond_10

    .line 177
    .line 178
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    check-cast p2, La/x6x;

    .line 183
    .line 184
    iput-boolean v1, p2, La/x6x;->i:Z

    .line 185
    .line 186
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, La/x6x;

    .line 194
    .line 195
    iput-boolean v1, p1, La/x6x;->i:Z

    .line 196
    .line 197
    iget-wide p1, p1, La/x6x;->b:J

    .line 198
    .line 199
    iget-object v0, p0, La/z6d;->w1:La/x6x;

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, p1, p2, v0}, La/z6d;->r1(JLa/x6x;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    move v0, v2

    .line 213
    :goto_3
    if-ge v0, p2, :cond_d

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    check-cast v3, La/x6x;

    .line 220
    .line 221
    iget-boolean v4, v3, La/x6x;->i:Z

    .line 222
    .line 223
    if-nez v4, :cond_9

    .line 224
    .line 225
    iget-boolean v4, v3, La/x6x;->h:Z

    .line 226
    .line 227
    if-eqz v4, :cond_9

    .line 228
    .line 229
    iget-boolean v3, v3, La/x6x;->d:Z

    .line 230
    .line 231
    if-nez v3, :cond_9

    .line 232
    .line 233
    add-int/lit8 v0, v0, 0x1

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_9
    sget-object p2, La/bmd;->t:La/zfn;

    .line 237
    .line 238
    invoke-static {p0, p2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    check-cast p2, La/wgu0;

    .line 243
    .line 244
    invoke-interface {p2}, La/wgu0;->h()F

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    move v3, v2

    .line 253
    :goto_4
    if-ge v3, v0, :cond_10

    .line 254
    .line 255
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    check-cast v4, La/x6x;

    .line 260
    .line 261
    iget-wide v5, v4, La/x6x;->c:J

    .line 262
    .line 263
    iget-object v7, p0, La/z6d;->w1:La/x6x;

    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-wide v7, v7, La/x6x;->c:J

    .line 269
    .line 270
    invoke-static {v5, v6, v7, v8}, La/ne60;->e(JJ)J

    .line 271
    .line 272
    .line 273
    move-result-wide v5

    .line 274
    invoke-static {v5, v6}, La/ne60;->d(J)F

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    cmpl-float v5, v5, p2

    .line 283
    .line 284
    if-lez v5, :cond_a

    .line 285
    .line 286
    move v5, v1

    .line 287
    goto :goto_5

    .line 288
    :cond_a
    move v5, v2

    .line 289
    :goto_5
    iget-boolean v4, v4, La/x6x;->i:Z

    .line 290
    .line 291
    if-nez v4, :cond_c

    .line 292
    .line 293
    if-eqz v5, :cond_b

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_c
    :goto_6
    invoke-virtual {p0, v1}, La/z6d;->q1(Z)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :cond_d
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    check-cast p1, La/x6x;

    .line 308
    .line 309
    iput-boolean v1, p1, La/x6x;->i:Z

    .line 310
    .line 311
    iget-wide p1, p1, La/x6x;->b:J

    .line 312
    .line 313
    iget-object v0, p0, La/z6d;->w1:La/x6x;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0, p1, p2, v0}, La/z6d;->r1(JLa/x6x;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_e
    sget-object v0, La/xoa0;->c:La/xoa0;

    .line 323
    .line 324
    if-ne p2, v0, :cond_10

    .line 325
    .line 326
    iget-object p2, p0, La/z6d;->w1:La/x6x;

    .line 327
    .line 328
    if-eqz p2, :cond_10

    .line 329
    .line 330
    iget-boolean p2, p0, La/z6d;->A1:Z

    .line 331
    .line 332
    if-nez p2, :cond_10

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    :goto_7
    if-ge v2, p2, :cond_10

    .line 339
    .line 340
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, La/x6x;

    .line 345
    .line 346
    iget-boolean v3, v0, La/x6x;->i:Z

    .line 347
    .line 348
    if-eqz v3, :cond_f

    .line 349
    .line 350
    iget-object v3, p0, La/z6d;->w1:La/x6x;

    .line 351
    .line 352
    if-eq v0, v3, :cond_f

    .line 353
    .line 354
    invoke-virtual {p0, v1}, La/z6d;->q1(Z)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :cond_f
    add-int/lit8 v2, v2, 0x1

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_10
    return-void
.end method

.method public final c1(La/abi0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/h8a;

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/h8a;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sget-object p0, La/yai0;->a:[La/iiy;

    .line 13
    .line 14
    sget-object p0, La/mai0;->c:La/zai0;

    .line 15
    .line 16
    new-instance v1, La/m6;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, v2, v0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, p0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final h(La/woa0;La/xoa0;J)V
    .locals 7

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, La/s1;->h(La/woa0;La/xoa0;J)V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/xoa0;->b:La/xoa0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p2, v0, :cond_10

    .line 8
    .line 9
    iget-object p2, p0, La/z6d;->p1:La/dpa0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez p2, :cond_3

    .line 14
    .line 15
    invoke-static {p1, v2}, La/tto0;->e(La/woa0;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_12

    .line 20
    .line 21
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, La/dpa0;

    .line 28
    .line 29
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/z6d;->p1:La/dpa0;

    .line 33
    .line 34
    iget-boolean p2, p0, La/s1;->v:Z

    .line 35
    .line 36
    if-eqz p2, :cond_12

    .line 37
    .line 38
    iget-object p2, p0, La/z6d;->r1:La/c4m0;

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p2}, La/pby;->isActive()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-ne p2, v2, :cond_2

    .line 47
    .line 48
    sget-object p2, La/bmd;->t:La/zfn;

    .line 49
    .line 50
    invoke-static {p0, p2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, La/wgu0;

    .line 55
    .line 56
    invoke-interface {p2}, La/wgu0;->b()J

    .line 57
    .line 58
    .line 59
    move-result-wide p2

    .line 60
    iget-wide v3, p1, La/dpa0;->b:J

    .line 61
    .line 62
    iget-wide v5, p0, La/z6d;->u1:J

    .line 63
    .line 64
    sub-long/2addr v3, v5

    .line 65
    cmp-long p2, v3, p2

    .line 66
    .line 67
    if-gez p2, :cond_0

    .line 68
    .line 69
    iput-boolean v2, p0, La/z6d;->v1:Z

    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    iput-boolean v2, p0, La/z6d;->s1:Z

    .line 73
    .line 74
    iget-object p2, p0, La/z6d;->r1:La/c4m0;

    .line 75
    .line 76
    if-eqz p2, :cond_1

    .line 77
    .line 78
    invoke-virtual {p2, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iput-object v0, p0, La/z6d;->r1:La/c4m0;

    .line 82
    .line 83
    :cond_2
    iput-boolean v1, p0, La/z6d;->t1:Z

    .line 84
    .line 85
    invoke-virtual {p0, p1}, La/s1;->j1(La/dpa0;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    if-eqz p1, :cond_12

    .line 91
    .line 92
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, La/y6d;

    .line 97
    .line 98
    invoke-direct {p2, p0, v0, v1}, La/y6d;-><init>(La/z6d;La/yje;B)V

    .line 99
    .line 100
    .line 101
    const/4 p3, 0x3

    .line 102
    invoke-static {p1, v0, v0, p2, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, p0, La/z6d;->q1:La/c4m0;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    iget p2, p1, La/woa0;->c:I

    .line 110
    .line 111
    const/4 v3, 0x2

    .line 112
    if-ne p2, v3, :cond_4

    .line 113
    .line 114
    move p2, v2

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    move p2, v1

    .line 117
    :goto_0
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 118
    .line 119
    if-eqz p2, :cond_8

    .line 120
    .line 121
    iget-boolean p2, p0, La/z6d;->t1:Z

    .line 122
    .line 123
    if-nez p2, :cond_8

    .line 124
    .line 125
    iget-boolean p2, p0, La/s1;->v:Z

    .line 126
    .line 127
    if-eqz p2, :cond_8

    .line 128
    .line 129
    iget-object p2, p0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 130
    .line 131
    if-eqz p2, :cond_8

    .line 132
    .line 133
    iget-object p2, p0, La/z6d;->q1:La/c4m0;

    .line 134
    .line 135
    if-eqz p2, :cond_5

    .line 136
    .line 137
    invoke-virtual {p2, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    iput-object v0, p0, La/z6d;->q1:La/c4m0;

    .line 141
    .line 142
    iget-object p2, p0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 143
    .line 144
    if-eqz p2, :cond_6

    .line 145
    .line 146
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-boolean p2, p0, La/z6d;->m1:Z

    .line 150
    .line 151
    if-eqz p2, :cond_7

    .line 152
    .line 153
    sget-object p2, La/bmd;->l:La/zfn;

    .line 154
    .line 155
    invoke-static {p0, p2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    check-cast p2, La/omv;

    .line 160
    .line 161
    check-cast p2, La/tv90;

    .line 162
    .line 163
    invoke-virtual {p2, v1}, La/tv90;->a(I)V

    .line 164
    .line 165
    .line 166
    :cond_7
    iput-boolean v2, p0, La/z6d;->t1:Z

    .line 167
    .line 168
    :cond_8
    iget-boolean p2, p0, La/z6d;->t1:Z

    .line 169
    .line 170
    if-eqz p2, :cond_b

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    move p3, v1

    .line 177
    :goto_1
    if-ge p3, p2, :cond_a

    .line 178
    .line 179
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p4

    .line 183
    check-cast p4, La/dpa0;

    .line 184
    .line 185
    invoke-static {p4}, La/x2x;->L(La/dpa0;)Z

    .line 186
    .line 187
    .line 188
    move-result p4

    .line 189
    if-nez p4, :cond_9

    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    :goto_2
    if-ge v1, p0, :cond_12

    .line 196
    .line 197
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    check-cast p2, La/dpa0;

    .line 202
    .line 203
    invoke-virtual {p2}, La/dpa0;->a()V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v1, v1, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_9
    add-int/lit8 p3, p3, 0x1

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_a
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, La/dpa0;

    .line 217
    .line 218
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 219
    .line 220
    .line 221
    iget-wide p1, p1, La/dpa0;->b:J

    .line 222
    .line 223
    iget-object p3, p0, La/z6d;->p1:La/dpa0;

    .line 224
    .line 225
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, p1, p2, p3}, La/z6d;->s1(JLa/dpa0;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_b
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    move v0, v1

    .line 237
    :goto_3
    if-ge v0, p2, :cond_f

    .line 238
    .line 239
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    check-cast v2, La/dpa0;

    .line 244
    .line 245
    invoke-static {v2}, La/x2x;->K(La/dpa0;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-nez v2, :cond_e

    .line 250
    .line 251
    invoke-virtual {p0, p3, p4}, La/s1;->f1(J)J

    .line 252
    .line 253
    .line 254
    move-result-wide v2

    .line 255
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    move v0, v1

    .line 260
    :goto_4
    if-ge v0, p2, :cond_12

    .line 261
    .line 262
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    check-cast v4, La/dpa0;

    .line 267
    .line 268
    invoke-virtual {v4}, La/dpa0;->c()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-nez v5, :cond_d

    .line 273
    .line 274
    invoke-static {v4, p3, p4, v2, v3}, La/x2x;->h0(La/dpa0;JJ)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_c

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_d
    :goto_5
    invoke-virtual {p0, v1}, La/z6d;->q1(Z)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_e
    add-int/lit8 v0, v0, 0x1

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_f
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, La/dpa0;

    .line 296
    .line 297
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 298
    .line 299
    .line 300
    iget-wide p1, p1, La/dpa0;->b:J

    .line 301
    .line 302
    iget-object p3, p0, La/z6d;->p1:La/dpa0;

    .line 303
    .line 304
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, p1, p2, p3}, La/z6d;->s1(JLa/dpa0;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :cond_10
    sget-object p3, La/xoa0;->c:La/xoa0;

    .line 312
    .line 313
    if-ne p2, p3, :cond_12

    .line 314
    .line 315
    iget-object p2, p0, La/z6d;->p1:La/dpa0;

    .line 316
    .line 317
    if-eqz p2, :cond_12

    .line 318
    .line 319
    iget-boolean p2, p0, La/z6d;->t1:Z

    .line 320
    .line 321
    if-nez p2, :cond_12

    .line 322
    .line 323
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 324
    .line 325
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 326
    .line 327
    .line 328
    move-result p2

    .line 329
    move p3, v1

    .line 330
    :goto_6
    if-ge p3, p2, :cond_12

    .line 331
    .line 332
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p4

    .line 336
    check-cast p4, La/dpa0;

    .line 337
    .line 338
    invoke-virtual {p4}, La/dpa0;->c()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_11

    .line 343
    .line 344
    iget-object v0, p0, La/z6d;->p1:La/dpa0;

    .line 345
    .line 346
    if-eq p4, v0, :cond_11

    .line 347
    .line 348
    invoke-virtual {p0, v1}, La/z6d;->q1(Z)V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :cond_11
    add-int/lit8 p3, p3, 0x1

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_12
    return-void
.end method

.method public final l1()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/z6d;->t1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m1(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    invoke-static {p1}, La/n7x;->C(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p1, p0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, La/z6d;->n1:La/jy40;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, La/jy40;->d(J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    new-instance v4, La/y6d;

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    invoke-direct {v4, p0, v2, v5}, La/y6d;-><init>(La/z6d;La/yje;B)V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x3

    .line 29
    invoke-static {v3, v2, v2, v4, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p1, v2, v0, v1}, La/jy40;->g(Ljava/lang/Object;J)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    iget-object p0, p0, La/z6d;->o1:La/jy40;

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, La/jy40;->d(J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/x6d;

    .line 46
    .line 47
    return p1
.end method

.method public final n0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/s1;->q:La/gy40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, La/s1;->Z:La/rsw;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, La/ssw;

    .line 10
    .line 11
    invoke-direct {v2, v1}, La/ssw;-><init>(La/rsw;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, La/gy40;->b(La/nlx;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, La/s1;->Z:La/rsw;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, La/z6d;->q1(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final n1(Landroid/view/KeyEvent;)V
    .locals 5

    .line 1
    invoke-static {p1}, La/n7x;->C(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p1, p0, La/z6d;->n1:La/jy40;

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, La/jy40;->d(J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, La/jy40;->d(J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/bby;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-interface {v2, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v3, 0x1

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {p1, v0, v1}, La/jy40;->f(J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_2
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, La/s1;->o1()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method

.method public final q1(Z)V
    .locals 5

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iput-object v3, p0, La/z6d;->w1:La/x6x;

    .line 8
    .line 9
    iget-object v4, p0, La/z6d;->x1:La/c4m0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v4, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object v3, p0, La/z6d;->x1:La/c4m0;

    .line 17
    .line 18
    iget-object v4, p0, La/z6d;->y1:La/c4m0;

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v4, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iput-object v3, p0, La/z6d;->y1:La/c4m0;

    .line 26
    .line 27
    iput-boolean v2, p0, La/z6d;->z1:Z

    .line 28
    .line 29
    iput-boolean v2, p0, La/z6d;->A1:Z

    .line 30
    .line 31
    iput-wide v0, p0, La/z6d;->B1:J

    .line 32
    .line 33
    iput-boolean v2, p0, La/z6d;->C1:Z

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    iput-object v3, p0, La/z6d;->p1:La/dpa0;

    .line 37
    .line 38
    iget-object v4, p0, La/z6d;->q1:La/c4m0;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {v4, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    iput-object v3, p0, La/z6d;->q1:La/c4m0;

    .line 46
    .line 47
    iget-object v4, p0, La/z6d;->r1:La/c4m0;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    invoke-virtual {v4, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iput-object v3, p0, La/z6d;->r1:La/c4m0;

    .line 55
    .line 56
    iput-boolean v2, p0, La/z6d;->s1:Z

    .line 57
    .line 58
    iput-boolean v2, p0, La/z6d;->t1:Z

    .line 59
    .line 60
    iput-wide v0, p0, La/z6d;->u1:J

    .line 61
    .line 62
    iput-boolean v2, p0, La/z6d;->v1:Z

    .line 63
    .line 64
    :goto_0
    invoke-virtual {p0, p1}, La/s1;->g1(Z)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final r1(JLa/x6x;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/s1;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, La/z6d;->C1:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p3, La/x6x;->c:J

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    invoke-virtual {p0, p3, v0, v1}, La/s1;->h1(ZJ)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, La/z6d;->B1:J

    .line 16
    .line 17
    iget-boolean p1, p0, La/z6d;->A1:Z

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, p0, La/z6d;->z1:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, La/s1;->o1()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, La/z6d;->w1:La/x6x;

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    iput-boolean p2, p0, La/z6d;->C1:Z

    .line 34
    .line 35
    iput-boolean p2, p0, La/z6d;->z1:Z

    .line 36
    .line 37
    iget-object p3, p0, La/z6d;->x1:La/c4m0;

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-virtual {p3, p1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iput-object p1, p0, La/z6d;->x1:La/c4m0;

    .line 45
    .line 46
    iput-boolean p2, p0, La/z6d;->A1:Z

    .line 47
    .line 48
    return-void
.end method

.method public final s1(JLa/dpa0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/s1;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, La/z6d;->v1:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v2, p3, La/dpa0;->c:J

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2, v3}, La/s1;->h1(ZJ)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, La/z6d;->u1:J

    .line 16
    .line 17
    iget-boolean p1, p0, La/z6d;->t1:Z

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, p0, La/z6d;->s1:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, La/s1;->o1()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, La/z6d;->p1:La/dpa0;

    .line 31
    .line 32
    iput-boolean v1, p0, La/z6d;->v1:Z

    .line 33
    .line 34
    iput-boolean v1, p0, La/z6d;->s1:Z

    .line 35
    .line 36
    iget-object p2, p0, La/z6d;->q1:La/c4m0;

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p2, p1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput-object p1, p0, La/z6d;->q1:La/c4m0;

    .line 44
    .line 45
    iput-boolean v1, p0, La/z6d;->t1:Z

    .line 46
    .line 47
    return-void
.end method

.method public final t1()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/z6d;->n1:La/jy40;

    .line 4
    .line 5
    iget-object v2, v1, La/jy40;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v1, La/jy40;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v10, 0x7

    .line 14
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const/16 v13, 0x8

    .line 20
    .line 21
    const/4 v14, 0x0

    .line 22
    if-ltz v4, :cond_3

    .line 23
    .line 24
    move v15, v14

    .line 25
    const-wide/16 v16, 0x80

    .line 26
    .line 27
    :goto_0
    aget-wide v6, v3, v15

    .line 28
    .line 29
    const-wide/16 v18, 0xff

    .line 30
    .line 31
    not-long v8, v6

    .line 32
    shl-long/2addr v8, v10

    .line 33
    and-long/2addr v8, v6

    .line 34
    and-long/2addr v8, v11

    .line 35
    cmp-long v8, v8, v11

    .line 36
    .line 37
    if-eqz v8, :cond_2

    .line 38
    .line 39
    sub-int v8, v15, v4

    .line 40
    .line 41
    not-int v8, v8

    .line 42
    ushr-int/lit8 v8, v8, 0x1f

    .line 43
    .line 44
    rsub-int/lit8 v8, v8, 0x8

    .line 45
    .line 46
    move v9, v14

    .line 47
    :goto_1
    if-ge v9, v8, :cond_1

    .line 48
    .line 49
    and-long v20, v6, v18

    .line 50
    .line 51
    cmp-long v20, v20, v16

    .line 52
    .line 53
    if-gez v20, :cond_0

    .line 54
    .line 55
    shl-int/lit8 v20, v15, 0x3

    .line 56
    .line 57
    add-int v20, v20, v9

    .line 58
    .line 59
    aget-object v20, v2, v20

    .line 60
    .line 61
    move/from16 v21, v10

    .line 62
    .line 63
    move-object/from16 v10, v20

    .line 64
    .line 65
    check-cast v10, La/bby;

    .line 66
    .line 67
    invoke-interface {v10, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    move/from16 v21, v10

    .line 72
    .line 73
    :goto_2
    shr-long/2addr v6, v13

    .line 74
    add-int/lit8 v9, v9, 0x1

    .line 75
    .line 76
    move/from16 v10, v21

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move/from16 v21, v10

    .line 80
    .line 81
    if-ne v8, v13, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    move/from16 v21, v10

    .line 85
    .line 86
    :goto_3
    if-eq v15, v4, :cond_4

    .line 87
    .line 88
    add-int/lit8 v15, v15, 0x1

    .line 89
    .line 90
    move/from16 v10, v21

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    move/from16 v21, v10

    .line 94
    .line 95
    const-wide/16 v16, 0x80

    .line 96
    .line 97
    const-wide/16 v18, 0xff

    .line 98
    .line 99
    :cond_4
    invoke-virtual {v1}, La/jy40;->a()V

    .line 100
    .line 101
    .line 102
    iget-object v0, v0, La/z6d;->o1:La/jy40;

    .line 103
    .line 104
    iget-object v1, v0, La/jy40;->c:[Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v2, v0, La/jy40;->a:[J

    .line 107
    .line 108
    array-length v3, v2

    .line 109
    add-int/lit8 v3, v3, -0x2

    .line 110
    .line 111
    if-ltz v3, :cond_8

    .line 112
    .line 113
    move v4, v14

    .line 114
    :goto_4
    aget-wide v6, v2, v4

    .line 115
    .line 116
    not-long v8, v6

    .line 117
    shl-long v8, v8, v21

    .line 118
    .line 119
    and-long/2addr v8, v6

    .line 120
    and-long/2addr v8, v11

    .line 121
    cmp-long v8, v8, v11

    .line 122
    .line 123
    if-eqz v8, :cond_7

    .line 124
    .line 125
    sub-int v8, v4, v3

    .line 126
    .line 127
    not-int v8, v8

    .line 128
    ushr-int/lit8 v8, v8, 0x1f

    .line 129
    .line 130
    rsub-int/lit8 v8, v8, 0x8

    .line 131
    .line 132
    move v9, v14

    .line 133
    :goto_5
    if-ge v9, v8, :cond_6

    .line 134
    .line 135
    and-long v22, v6, v18

    .line 136
    .line 137
    cmp-long v10, v22, v16

    .line 138
    .line 139
    if-ltz v10, :cond_5

    .line 140
    .line 141
    shr-long/2addr v6, v13

    .line 142
    add-int/lit8 v9, v9, 0x1

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    shl-int/lit8 v0, v4, 0x3

    .line 146
    .line 147
    add-int/2addr v0, v9

    .line 148
    aget-object v0, v1, v0

    .line 149
    .line 150
    check-cast v0, La/x6d;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    throw v5

    .line 156
    :cond_6
    if-ne v8, v13, :cond_8

    .line 157
    .line 158
    :cond_7
    if-eq v4, v3, :cond_8

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_8
    invoke-virtual {v0}, La/jy40;->a()V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final z0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, La/z6d;->q1(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
