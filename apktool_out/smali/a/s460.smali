.class public abstract La/s460;
.super La/c810;
.source "SourceFile"

# interfaces
.implements La/pj30;
.implements La/j6z;


# static fields
.field public static final A1:[F

.field public static final B1:La/q460;

.field public static final C1:La/wsz;

.field public static final w1:La/mb50;

.field public static final x1:La/mb50;

.field public static final y1:La/uag0;

.field public static final z1:La/b6z;


# instance fields
.field public A:La/w6k;

.field public B:La/k6z;

.field public Y:F

.field public Z:La/uj30;

.field public f1:La/ry40;

.field public g1:J

.field public h1:F

.field public i1:La/gz40;

.field public j1:La/b6z;

.field public k1:La/yjj0;

.field public l1:La/jge0;

.field public m1:La/jge0;

.field public n1:Z

.field public o1:Z

.field public p1:La/dfv;

.field public q1:La/x5a;

.field public r1:La/jt50;

.field public final s1:La/p460;

.field public t1:Z

.field public final u:La/e7z;

.field public u1:La/bg80;

.field public v:La/s460;

.field public v1:La/dfv;

.field public w:La/s460;

.field public x:Z

.field public y:Z

.field public z:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/mb50;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/mb50;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/s460;->w1:La/mb50;

    .line 9
    .line 10
    new-instance v0, La/mb50;

    .line 11
    .line 12
    const/16 v1, 0x17

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/mb50;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/s460;->x1:La/mb50;

    .line 18
    .line 19
    new-instance v0, La/uag0;

    .line 20
    .line 21
    invoke-direct {v0}, La/uag0;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, La/s460;->y1:La/uag0;

    .line 25
    .line 26
    new-instance v0, La/b6z;

    .line 27
    .line 28
    invoke-direct {v0}, La/b6z;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, La/s460;->z1:La/b6z;

    .line 32
    .line 33
    invoke-static {}, La/ui30;->a()[F

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, La/s460;->A1:[F

    .line 38
    .line 39
    new-instance v0, La/q460;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/s460;->B1:La/q460;

    .line 45
    .line 46
    new-instance v0, La/wsz;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/s460;->C1:La/wsz;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(La/e7z;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/c810;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/s460;->u:La/e7z;

    .line 5
    .line 6
    iget-object v0, p1, La/e7z;->z:La/w6k;

    .line 7
    .line 8
    iput-object v0, p0, La/s460;->A:La/w6k;

    .line 9
    .line 10
    iget-object p1, p1, La/e7z;->A:La/k6z;

    .line 11
    .line 12
    iput-object p1, p0, La/s460;->B:La/k6z;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, La/s460;->Y:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, La/s460;->g1:J

    .line 22
    .line 23
    sget-object p1, La/jd8;->n:La/ljc;

    .line 24
    .line 25
    iput-object p1, p0, La/s460;->k1:La/yjj0;

    .line 26
    .line 27
    sget-object p1, La/jge0;->e:La/jge0;

    .line 28
    .line 29
    iput-object p1, p0, La/s460;->l1:La/jge0;

    .line 30
    .line 31
    iput-object p1, p0, La/s460;->m1:La/jge0;

    .line 32
    .line 33
    new-instance p1, La/p460;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-direct {p1, p0, v0}, La/p460;-><init>(La/s460;B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/s460;->s1:La/p460;

    .line 40
    .line 41
    return-void
.end method

.method public static C1(La/j6z;)La/s460;
    .locals 1

    .line 1
    instance-of v0, p0, La/f810;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, La/f810;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, La/f810;->a:La/e810;

    .line 13
    .line 14
    iget-object v0, v0, La/e810;->u:La/s460;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, La/s460;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final A1(La/uj30;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/s460;->Z:La/uj30;

    .line 6
    .line 7
    if-eq v1, v2, :cond_19

    .line 8
    .line 9
    iput-object v1, v0, La/s460;->Z:La/uj30;

    .line 10
    .line 11
    iget-object v3, v0, La/s460;->u:La/e7z;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, La/uj30;->j()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, La/uj30;->j()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, La/uj30;->f()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, La/uj30;->f()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_10

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, La/uj30;->j()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, La/uj30;->f()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, La/s460;->u1:La/bg80;

    .line 45
    .line 46
    const-wide v7, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    int-to-long v10, v2

    .line 56
    shl-long/2addr v10, v9

    .line 57
    int-to-long v12, v5

    .line 58
    and-long/2addr v12, v7

    .line 59
    or-long/2addr v10, v12

    .line 60
    check-cast v6, La/gfv;

    .line 61
    .line 62
    invoke-virtual {v6, v10, v11}, La/gfv;->e(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3}, La/e7z;->J()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v6, v0, La/s460;->w:La/s460;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, La/s460;->o1()V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    int-to-long v10, v2

    .line 80
    shl-long v9, v10, v9

    .line 81
    .line 82
    int-to-long v5, v5

    .line 83
    and-long/2addr v5, v7

    .line 84
    or-long/2addr v5, v9

    .line 85
    invoke-virtual {v0, v5, v6}, La/pu90;->p0(J)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, La/s460;->z:Lkotlin/jvm/functions/Function1;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v4}, La/s460;->H1(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v2, 0x4

    .line 96
    invoke-static {v2}, La/t460;->g(I)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v0}, La/s460;->g1()La/lm40;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    iget-object v6, v6, La/lm40;->e:La/lm40;

    .line 108
    .line 109
    if-nez v6, :cond_5

    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, La/s460;->j1(Z)La/lm40;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_2
    if-eqz v5, :cond_e

    .line 118
    .line 119
    iget v7, v5, La/lm40;->d:I

    .line 120
    .line 121
    and-int/2addr v7, v2

    .line 122
    if-eqz v7, :cond_e

    .line 123
    .line 124
    iget v7, v5, La/lm40;->c:I

    .line 125
    .line 126
    and-int/2addr v7, v2

    .line 127
    if-eqz v7, :cond_d

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    move-object v8, v5

    .line 131
    move-object v9, v7

    .line 132
    :goto_3
    if-eqz v8, :cond_d

    .line 133
    .line 134
    instance-of v10, v8, La/ehl;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v8, La/ehl;

    .line 139
    .line 140
    invoke-interface {v8}, La/ehl;->p0()V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v10, v8, La/lm40;->c:I

    .line 145
    .line 146
    and-int/2addr v10, v2

    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    instance-of v10, v8, La/f3k;

    .line 150
    .line 151
    if-eqz v10, :cond_c

    .line 152
    .line 153
    move-object v10, v8

    .line 154
    check-cast v10, La/f3k;

    .line 155
    .line 156
    iget-object v10, v10, La/f3k;->p:La/lm40;

    .line 157
    .line 158
    move v11, v4

    .line 159
    :goto_4
    const/4 v12, 0x1

    .line 160
    if-eqz v10, :cond_b

    .line 161
    .line 162
    iget v13, v10, La/lm40;->c:I

    .line 163
    .line 164
    and-int/2addr v13, v2

    .line 165
    if-eqz v13, :cond_a

    .line 166
    .line 167
    add-int/lit8 v11, v11, 0x1

    .line 168
    .line 169
    if-ne v11, v12, :cond_7

    .line 170
    .line 171
    move-object v8, v10

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    if-nez v9, :cond_8

    .line 174
    .line 175
    new-instance v9, La/xz40;

    .line 176
    .line 177
    const/16 v12, 0x10

    .line 178
    .line 179
    new-array v12, v12, [La/lm40;

    .line 180
    .line 181
    invoke-direct {v9, v12}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    if-eqz v8, :cond_9

    .line 185
    .line 186
    invoke-virtual {v9, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    :cond_9
    invoke-virtual {v9, v10}, La/xz40;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_5
    iget-object v10, v10, La/lm40;->f:La/lm40;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_b
    if-ne v11, v12, :cond_c

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_c
    :goto_6
    invoke-static {v9}, La/vcc;->V(La/xz40;)La/lm40;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_3

    .line 204
    :cond_d
    if-eq v5, v6, :cond_e

    .line 205
    .line 206
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_e
    :goto_7
    iget-object v2, v3, La/e7z;->o:La/cg80;

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->w(La/e7z;)V

    .line 216
    .line 217
    .line 218
    :cond_f
    invoke-virtual {v3, v0}, La/e7z;->O(La/s460;)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object v2, v0, La/s460;->f1:La/ry40;

    .line 222
    .line 223
    if-eqz v2, :cond_11

    .line 224
    .line 225
    iget v2, v2, La/ry40;->e:I

    .line 226
    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_11
    invoke-interface {v1}, La/uj30;->a()Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-nez v2, :cond_19

    .line 239
    .line 240
    :goto_8
    iget-object v2, v0, La/s460;->f1:La/ry40;

    .line 241
    .line 242
    invoke-interface {v1}, La/uj30;->a()Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-nez v2, :cond_12

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_12
    iget v6, v2, La/ry40;->e:I

    .line 250
    .line 251
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eq v6, v7, :cond_13

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_13
    iget-object v6, v2, La/ry40;->b:[Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v7, v2, La/ry40;->c:[I

    .line 261
    .line 262
    iget-object v2, v2, La/ry40;->a:[J

    .line 263
    .line 264
    array-length v8, v2

    .line 265
    add-int/lit8 v8, v8, -0x2

    .line 266
    .line 267
    if-ltz v8, :cond_19

    .line 268
    .line 269
    move v9, v4

    .line 270
    :goto_9
    aget-wide v10, v2, v9

    .line 271
    .line 272
    not-long v12, v10

    .line 273
    const/4 v14, 0x7

    .line 274
    shl-long/2addr v12, v14

    .line 275
    and-long/2addr v12, v10

    .line 276
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    and-long/2addr v12, v14

    .line 282
    cmp-long v12, v12, v14

    .line 283
    .line 284
    if-eqz v12, :cond_18

    .line 285
    .line 286
    sub-int v12, v9, v8

    .line 287
    .line 288
    not-int v12, v12

    .line 289
    ushr-int/lit8 v12, v12, 0x1f

    .line 290
    .line 291
    const/16 v13, 0x8

    .line 292
    .line 293
    rsub-int/lit8 v12, v12, 0x8

    .line 294
    .line 295
    move v14, v4

    .line 296
    :goto_a
    if-ge v14, v12, :cond_17

    .line 297
    .line 298
    const-wide/16 v15, 0xff

    .line 299
    .line 300
    and-long/2addr v15, v10

    .line 301
    const-wide/16 v17, 0x80

    .line 302
    .line 303
    cmp-long v15, v15, v17

    .line 304
    .line 305
    if-gez v15, :cond_16

    .line 306
    .line 307
    shl-int/lit8 v15, v9, 0x3

    .line 308
    .line 309
    add-int/2addr v15, v14

    .line 310
    aget-object v16, v6, v15

    .line 311
    .line 312
    aget v15, v7, v15

    .line 313
    .line 314
    move-object/from16 v4, v16

    .line 315
    .line 316
    check-cast v4, La/w12;

    .line 317
    .line 318
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    check-cast v4, Ljava/lang/Integer;

    .line 323
    .line 324
    if-nez v4, :cond_14

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eq v4, v15, :cond_16

    .line 332
    .line 333
    :goto_b
    iget-object v2, v3, La/e7z;->i1:La/i7z;

    .line 334
    .line 335
    iget-object v2, v2, La/i7z;->p:La/sj30;

    .line 336
    .line 337
    iget-object v2, v2, La/sj30;->y:La/f7z;

    .line 338
    .line 339
    invoke-virtual {v2}, La/f7z;->f()V

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, La/s460;->f1:La/ry40;

    .line 343
    .line 344
    if-nez v2, :cond_15

    .line 345
    .line 346
    sget-object v2, La/v960;->a:La/ry40;

    .line 347
    .line 348
    new-instance v2, La/ry40;

    .line 349
    .line 350
    invoke-direct {v2}, La/ry40;-><init>()V

    .line 351
    .line 352
    .line 353
    iput-object v2, v0, La/s460;->f1:La/ry40;

    .line 354
    .line 355
    :cond_15
    invoke-virtual {v2}, La/ry40;->a()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, La/uj30;->a()Ljava/util/Map;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_19

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Ljava/util/Map$Entry;

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    check-cast v1, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-virtual {v2, v1, v3}, La/ry40;->g(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_16
    shr-long/2addr v10, v13

    .line 401
    add-int/lit8 v14, v14, 0x1

    .line 402
    .line 403
    const/4 v4, 0x0

    .line 404
    goto :goto_a

    .line 405
    :cond_17
    if-ne v12, v13, :cond_19

    .line 406
    .line 407
    :cond_18
    if-eq v9, v8, :cond_19

    .line 408
    .line 409
    add-int/lit8 v9, v9, 0x1

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_19
    return-void
.end method

.method public final B1(La/lm40;La/r460;JLa/raw;IZF)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v5, p5

    .line 4
    .line 5
    iget-object v10, v5, La/raw;->a:La/vy40;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    move-wide/from16 v3, p3

    .line 14
    .line 15
    move/from16 v6, p6

    .line 16
    .line 17
    move/from16 v7, p7

    .line 18
    .line 19
    invoke-virtual/range {v1 .. v7}, La/s460;->n1(La/r460;JLa/raw;IZ)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    move-object/from16 v2, p2

    .line 24
    .line 25
    invoke-interface {v2, v0}, La/r460;->e(La/lm40;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v2}, La/r460;->b()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object/from16 v0, p0

    .line 40
    .line 41
    move-wide/from16 v3, p3

    .line 42
    .line 43
    move-object/from16 v5, p5

    .line 44
    .line 45
    move/from16 v6, p6

    .line 46
    .line 47
    move/from16 v7, p7

    .line 48
    .line 49
    move/from16 v8, p8

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v8}, La/s460;->B1(La/lm40;La/r460;JLa/raw;IZF)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object/from16 v5, p5

    .line 56
    .line 57
    move/from16 v7, p7

    .line 58
    .line 59
    move/from16 v8, p8

    .line 60
    .line 61
    invoke-interface {v2, v0}, La/r460;->h(La/lm40;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_9

    .line 66
    .line 67
    iget-object v11, v5, La/raw;->b:La/iy40;

    .line 68
    .line 69
    iget v12, v5, La/raw;->c:I

    .line 70
    .line 71
    iget v1, v10, La/vy40;->b:I

    .line 72
    .line 73
    add-int/lit8 v3, v1, -0x1

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-ne v12, v3, :cond_6

    .line 77
    .line 78
    add-int/lit8 v13, v12, 0x1

    .line 79
    .line 80
    invoke-virtual {v5, v13, v1}, La/raw;->c(II)V

    .line 81
    .line 82
    .line 83
    iget v1, v5, La/raw;->c:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    iput v1, v5, La/raw;->c:I

    .line 88
    .line 89
    invoke-virtual {v10, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v7, v4}, La/vtb;->l(FZZ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    invoke-virtual {v11, v3, v4}, La/iy40;->a(J)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2}, La/r460;->b()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const/4 v9, 0x0

    .line 108
    move-object/from16 v0, p0

    .line 109
    .line 110
    move-wide/from16 v3, p3

    .line 111
    .line 112
    move/from16 v6, p6

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 115
    .line 116
    .line 117
    iput v12, v5, La/raw;->c:I

    .line 118
    .line 119
    iget v0, v10, La/vy40;->b:I

    .line 120
    .line 121
    add-int/lit8 v0, v0, -0x1

    .line 122
    .line 123
    if-eq v13, v0, :cond_3

    .line 124
    .line 125
    invoke-virtual {v5}, La/raw;->b()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-static {v0, v1}, La/acb;->T(J)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    return-void

    .line 137
    :cond_3
    :goto_0
    iget v0, v5, La/raw;->c:I

    .line 138
    .line 139
    add-int/lit8 v1, v0, 0x1

    .line 140
    .line 141
    invoke-virtual {v10, v1}, La/vy40;->l(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    if-ltz v1, :cond_5

    .line 145
    .line 146
    iget v2, v11, La/iy40;->b:I

    .line 147
    .line 148
    if-ge v1, v2, :cond_5

    .line 149
    .line 150
    iget-object v3, v11, La/iy40;->a:[J

    .line 151
    .line 152
    aget-wide v4, v3, v1

    .line 153
    .line 154
    add-int/lit8 v4, v2, -0x1

    .line 155
    .line 156
    if-eq v1, v4, :cond_4

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x2

    .line 159
    .line 160
    invoke-static {v3, v3, v1, v0, v2}, La/qx3;->g([J[JIII)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget v0, v11, La/iy40;->b:I

    .line 164
    .line 165
    add-int/lit8 v0, v0, -0x1

    .line 166
    .line 167
    iput v0, v11, La/iy40;->b:I

    .line 168
    .line 169
    return-void

    .line 170
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 171
    .line 172
    invoke-static {v0}, La/v4i0;->m(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_6
    invoke-virtual {v5}, La/raw;->b()J

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    iget v14, v5, La/raw;->c:I

    .line 181
    .line 182
    iget v1, v10, La/vy40;->b:I

    .line 183
    .line 184
    add-int/lit8 v15, v1, -0x1

    .line 185
    .line 186
    iput v15, v5, La/raw;->c:I

    .line 187
    .line 188
    iget v2, v10, La/vy40;->b:I

    .line 189
    .line 190
    invoke-virtual {v5, v1, v2}, La/raw;->c(II)V

    .line 191
    .line 192
    .line 193
    iget v1, v5, La/raw;->c:I

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    iput v1, v5, La/raw;->c:I

    .line 198
    .line 199
    invoke-virtual {v10, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v8, v7, v4}, La/vtb;->l(FZZ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v1

    .line 206
    invoke-virtual {v11, v1, v2}, La/iy40;->a(J)V

    .line 207
    .line 208
    .line 209
    invoke-interface/range {p2 .. p2}, La/r460;->b()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v9, 0x0

    .line 218
    move-object/from16 v0, p0

    .line 219
    .line 220
    move-object/from16 v2, p2

    .line 221
    .line 222
    move-wide/from16 v3, p3

    .line 223
    .line 224
    move/from16 v6, p6

    .line 225
    .line 226
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 227
    .line 228
    .line 229
    iput v15, v5, La/raw;->c:I

    .line 230
    .line 231
    invoke-virtual {v5}, La/raw;->b()J

    .line 232
    .line 233
    .line 234
    move-result-wide v0

    .line 235
    iget v2, v5, La/raw;->c:I

    .line 236
    .line 237
    add-int/lit8 v2, v2, 0x1

    .line 238
    .line 239
    iget v3, v10, La/vy40;->b:I

    .line 240
    .line 241
    add-int/lit8 v3, v3, -0x1

    .line 242
    .line 243
    if-ge v2, v3, :cond_8

    .line 244
    .line 245
    invoke-static {v12, v13, v0, v1}, La/acb;->N(JJ)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-lez v2, :cond_8

    .line 250
    .line 251
    add-int/lit8 v2, v14, 0x1

    .line 252
    .line 253
    invoke-static {v0, v1}, La/acb;->T(J)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    iget v1, v5, La/raw;->c:I

    .line 258
    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x2

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    :goto_1
    invoke-virtual {v5, v2, v1}, La/raw;->c(II)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_8
    iget v0, v5, La/raw;->c:I

    .line 271
    .line 272
    add-int/lit8 v0, v0, 0x1

    .line 273
    .line 274
    iget v1, v10, La/vy40;->b:I

    .line 275
    .line 276
    invoke-virtual {v5, v0, v1}, La/raw;->c(II)V

    .line 277
    .line 278
    .line 279
    :goto_2
    iput v14, v5, La/raw;->c:I

    .line 280
    .line 281
    return-void

    .line 282
    :cond_9
    invoke-interface/range {p2 .. p2}, La/r460;->b()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const/4 v9, 0x0

    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    move-wide/from16 v3, p3

    .line 296
    .line 297
    move/from16 v6, p6

    .line 298
    .line 299
    move/from16 v7, p7

    .line 300
    .line 301
    move/from16 v8, p8

    .line 302
    .line 303
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 304
    .line 305
    .line 306
    return-void
.end method

.method public final C(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 15
    .line 16
    invoke-static {v0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->H(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0, p1, p2}, La/s460;->F(La/j6z;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0
.end method

.method public final D1()La/jge0;
    .locals 11

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/s460;->i1:La/gz40;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    new-instance v1, La/gz40;

    .line 20
    .line 21
    invoke-direct {v1}, La/gz40;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, La/s460;->i1:La/gz40;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, La/s460;->f1()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-virtual {p0, v2, v3}, La/s460;->X0(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-virtual {p0}, La/s460;->h1()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    iget-object v4, p0, La/s460;->l1:La/jge0;

    .line 42
    .line 43
    iget v4, v4, La/jge0;->a:F

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v4, v5

    .line 47
    :goto_0
    invoke-virtual {p0}, La/s460;->h1()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    iget-object v5, p0, La/s460;->l1:La/jge0;

    .line 54
    .line 55
    iget v5, v5, La/jge0;->b:F

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, La/s460;->h1()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    iget-object v6, p0, La/s460;->l1:La/jge0;

    .line 64
    .line 65
    iget v6, v6, La/jge0;->c:F

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    int-to-float v6, v6

    .line 73
    :goto_1
    invoke-virtual {p0}, La/s460;->h1()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_5

    .line 78
    .line 79
    iget-object v7, p0, La/s460;->l1:La/jge0;

    .line 80
    .line 81
    iget v7, v7, La/jge0;->d:F

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-virtual {p0}, La/pu90;->d0()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    int-to-float v7, v7

    .line 89
    :goto_2
    const/16 v8, 0x20

    .line 90
    .line 91
    shr-long v8, v2, v8

    .line 92
    .line 93
    long-to-int v8, v8

    .line 94
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    sub-float/2addr v4, v9

    .line 99
    iput v4, v1, La/gz40;->b:F

    .line 100
    .line 101
    const-wide v9, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v2, v9

    .line 107
    long-to-int v2, v2

    .line 108
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    sub-float/2addr v5, v3

    .line 113
    iput v5, v1, La/gz40;->c:F

    .line 114
    .line 115
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    add-float/2addr v3, v6

    .line 120
    iput v3, v1, La/gz40;->d:F

    .line 121
    .line 122
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    add-float/2addr v2, v7

    .line 127
    iput v2, v1, La/gz40;->e:F

    .line 128
    .line 129
    :goto_3
    if-eq p0, v0, :cond_7

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    const/4 v3, 0x1

    .line 133
    invoke-virtual {p0, v1, v2, v3}, La/s460;->y1(La/gz40;ZZ)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, La/gz40;->b()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    :goto_4
    sget-object p0, La/jge0;->e:La/jge0;

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_6
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    new-instance p0, La/jge0;

    .line 152
    .line 153
    iget v0, v1, La/gz40;->b:F

    .line 154
    .line 155
    iget v2, v1, La/gz40;->c:F

    .line 156
    .line 157
    iget v3, v1, La/gz40;->d:F

    .line 158
    .line 159
    iget v1, v1, La/gz40;->e:F

    .line 160
    .line 161
    invoke-direct {p0, v0, v2, v3, v1}, La/jge0;-><init>(FFFF)V

    .line 162
    .line 163
    .line 164
    return-object p0
.end method

.method public final E1(La/s460;[F)V
    .locals 5

    .line 1
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, La/s460;->w:La/s460;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, La/s460;->E1(La/s460;[F)V

    .line 13
    .line 14
    .line 15
    iget-wide v0, p0, La/s460;->g1:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, La/ikx;->b(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    sget-object p1, La/s460;->A1:[F

    .line 26
    .line 27
    invoke-static {p1}, La/ui30;->d([F)V

    .line 28
    .line 29
    .line 30
    iget-wide v0, p0, La/s460;->g1:J

    .line 31
    .line 32
    const/16 v2, 0x20

    .line 33
    .line 34
    shr-long v2, v0, v2

    .line 35
    .line 36
    long-to-int v2, v2

    .line 37
    int-to-float v2, v2

    .line 38
    neg-float v2, v2

    .line 39
    const-wide v3, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v0, v3

    .line 45
    long-to-int v0, v0

    .line 46
    int-to-float v0, v0

    .line 47
    neg-float v0, v0

    .line 48
    invoke-static {p1, v2, v0}, La/ui30;->g([FFF)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, La/ui30;->f([F[F)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object p0, p0, La/s460;->u1:La/bg80;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    check-cast p0, La/gfv;

    .line 59
    .line 60
    invoke-virtual {p0}, La/gfv;->a()[F

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-static {p2, p0}, La/ui30;->f([F[F)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public final F(La/j6z;J)J
    .locals 3

    .line 1
    instance-of v0, p1, La/f810;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/f810;

    .line 6
    .line 7
    iget-object v0, p1, La/f810;->a:La/e810;

    .line 8
    .line 9
    iget-object v0, v0, La/e810;->u:La/s460;

    .line 10
    .line 11
    invoke-virtual {v0}, La/s460;->q1()V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr p2, v0

    .line 20
    invoke-virtual {p1, p0, p2, p3}, La/f810;->F(La/j6z;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    xor-long/2addr p0, v0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    invoke-static {p1}, La/s460;->C1(La/j6z;)La/s460;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, La/s460;->q1()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/s460;->c1(La/s460;)La/s460;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    if-eq p1, v0, :cond_3

    .line 38
    .line 39
    iget-object v1, p1, La/s460;->u1:La/bg80;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    check-cast v1, La/gfv;

    .line 44
    .line 45
    invoke-virtual {v1}, La/gfv;->b()[F

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-boolean v1, v1, La/gfv;->s:Z

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {p2, p3, v2}, La/ui30;->b(J[F)J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    :cond_2
    :goto_1
    iget-wide v1, p1, La/s460;->g1:J

    .line 59
    .line 60
    invoke-static {p2, p3, v1, v2}, La/x1x;->H(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide p2

    .line 64
    iget-object p1, p1, La/s460;->w:La/s460;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {p0, v0, p2, p3}, La/s460;->W0(La/s460;J)J

    .line 71
    .line 72
    .line 73
    move-result-wide p0

    .line 74
    return-wide p0
.end method

.method public final F1(La/s460;[F)V
    .locals 6

    .line 1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, La/gfv;

    .line 12
    .line 13
    invoke-virtual {v0}, La/gfv;->b()[F

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p2, v0}, La/ui30;->f([F[F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-wide v0, p0, La/s460;->g1:J

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/ikx;->b(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    sget-object v2, La/s460;->A1:[F

    .line 31
    .line 32
    invoke-static {v2}, La/ui30;->d([F)V

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    shr-long v3, v0, v3

    .line 38
    .line 39
    long-to-int v3, v3

    .line 40
    int-to-float v3, v3

    .line 41
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v4

    .line 47
    long-to-int v0, v0

    .line 48
    int-to-float v0, v0

    .line 49
    invoke-static {v2, v3, v0}, La/ui30;->g([FFF)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2, v2}, La/ui30;->f([F[F)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public final G(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/s460;->Y(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 6
    .line 7
    invoke-static {p0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 17
    .line 18
    invoke-static {p1, p2, p0}, La/ui30;->b(J[F)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
.end method

.method public final G1(Lkotlin/jvm/functions/Function1;Z)V
    .locals 8

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, La/s460;->v1:La/dfv;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "layerBlock can\'t be provided when explicitLayer is provided"

    .line 9
    .line 10
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v2, p0, La/s460;->u:La/e7z;

    .line 16
    .line 17
    if-nez p2, :cond_3

    .line 18
    .line 19
    iget-object p2, p0, La/s460;->z:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    if-ne p2, p1, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, La/s460;->A:La/w6k;

    .line 24
    .line 25
    iget-object v3, v2, La/e7z;->z:La/w6k;

    .line 26
    .line 27
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_3

    .line 32
    .line 33
    iget-object p2, p0, La/s460;->B:La/k6z;

    .line 34
    .line 35
    iget-object v3, v2, La/e7z;->A:La/k6z;

    .line 36
    .line 37
    if-eq p2, v3, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move p2, v0

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    :goto_1
    move p2, v1

    .line 43
    :goto_2
    iget-object v3, v2, La/e7z;->z:La/w6k;

    .line 44
    .line 45
    iput-object v3, p0, La/s460;->A:La/w6k;

    .line 46
    .line 47
    iget-object v3, v2, La/e7z;->A:La/k6z;

    .line 48
    .line 49
    iput-object v3, p0, La/s460;->B:La/k6z;

    .line 50
    .line 51
    invoke-virtual {v2}, La/e7z;->I()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v4, p0, La/s460;->s1:La/p460;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-eqz v3, :cond_7

    .line 59
    .line 60
    if-eqz p1, :cond_7

    .line 61
    .line 62
    iput-object p1, p0, La/s460;->z:Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    iget-object p1, p0, La/s460;->u1:La/bg80;

    .line 65
    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    invoke-static {v2}, La/h7z;->a(La/e7z;)La/cg80;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p2, p0, La/s460;->r1:La/jt50;

    .line 73
    .line 74
    if-nez p2, :cond_4

    .line 75
    .line 76
    new-instance p2, La/p460;

    .line 77
    .line 78
    invoke-direct {p2, p0, v0}, La/p460;-><init>(La/s460;B)V

    .line 79
    .line 80
    .line 81
    new-instance v0, La/jt50;

    .line 82
    .line 83
    const/4 v3, 0x5

    .line 84
    invoke-direct {v0, p0, p2, v3}, La/jt50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/s460;->r1:La/jt50;

    .line 88
    .line 89
    move-object p2, v0

    .line 90
    :cond_4
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 91
    .line 92
    invoke-virtual {p1, p2, v4, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->f(Lkotlin/jvm/functions/Function2;La/p460;La/dfv;)La/bg80;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-wide v5, p0, La/pu90;->c:J

    .line 97
    .line 98
    move-object p2, p1

    .line 99
    check-cast p2, La/gfv;

    .line 100
    .line 101
    invoke-virtual {p2, v5, v6}, La/gfv;->e(J)V

    .line 102
    .line 103
    .line 104
    iget-wide v5, p0, La/s460;->g1:J

    .line 105
    .line 106
    invoke-virtual {p2, v5, v6}, La/gfv;->d(J)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, La/s460;->u1:La/bg80;

    .line 110
    .line 111
    invoke-virtual {p0, v1}, La/s460;->H1(Z)V

    .line 112
    .line 113
    .line 114
    iput-boolean v1, v2, La/e7z;->l1:Z

    .line 115
    .line 116
    invoke-virtual {v4}, La/p460;->invoke()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_5
    if-eqz p2, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0, v1}, La/s460;->H1(Z)V

    .line 123
    .line 124
    .line 125
    :cond_6
    return-void

    .line 126
    :cond_7
    iput-object v5, p0, La/s460;->z:Lkotlin/jvm/functions/Function1;

    .line 127
    .line 128
    iget-object p1, p0, La/s460;->u1:La/bg80;

    .line 129
    .line 130
    if-eqz p1, :cond_c

    .line 131
    .line 132
    check-cast p1, La/gfv;

    .line 133
    .line 134
    invoke-virtual {p1}, La/gfv;->b()[F

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-static {p2}, La/a8k0;->z([F)Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-nez p2, :cond_8

    .line 143
    .line 144
    invoke-virtual {v2, p0}, La/e7z;->O(La/s460;)V

    .line 145
    .line 146
    .line 147
    :cond_8
    iput-object v5, p1, La/gfv;->d:Lkotlin/jvm/functions/Function2;

    .line 148
    .line 149
    iput-object v5, p1, La/gfv;->e:Lkotlin/jvm/functions/Function0;

    .line 150
    .line 151
    iput-boolean v1, p1, La/gfv;->g:Z

    .line 152
    .line 153
    invoke-virtual {p1, v0}, La/gfv;->f(Z)V

    .line 154
    .line 155
    .line 156
    iget-object p2, p1, La/gfv;->b:La/afv;

    .line 157
    .line 158
    if-eqz p2, :cond_b

    .line 159
    .line 160
    iget-object v3, p1, La/gfv;->a:La/dfv;

    .line 161
    .line 162
    invoke-interface {p2, v3}, La/afv;->c(La/dfv;)V

    .line 163
    .line 164
    .line 165
    iget-object p2, p1, La/gfv;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 166
    .line 167
    iget-object v3, p2, Landroidx/compose/ui/platform/AndroidComposeView;->P1:La/fck0;

    .line 168
    .line 169
    :cond_9
    iget-object v6, v3, La/fck0;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v6, Ljava/lang/ref/ReferenceQueue;

    .line 172
    .line 173
    iget-object v7, v3, La/fck0;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v7, La/xz40;

    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    if-eqz v6, :cond_a

    .line 182
    .line 183
    invoke-virtual {v7, v6}, La/xz40;->j(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    if-nez v6, :cond_9

    .line 187
    .line 188
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 189
    .line 190
    iget-object v3, v3, La/fck0;->c:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v3, Ljava/lang/ref/ReferenceQueue;

    .line 193
    .line 194
    invoke-direct {v6, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget-object p2, p2, Landroidx/compose/ui/platform/AndroidComposeView;->A:La/vy40;

    .line 201
    .line 202
    invoke-virtual {p2, p1}, La/vy40;->k(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_b
    iput-object v5, p0, La/s460;->u1:La/bg80;

    .line 206
    .line 207
    iput-boolean v1, v2, La/e7z;->l1:Z

    .line 208
    .line 209
    invoke-virtual {v4}, La/p460;->invoke()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iget-boolean p1, p1, La/lm40;->n:Z

    .line 217
    .line 218
    if-eqz p1, :cond_c

    .line 219
    .line 220
    invoke-virtual {v2}, La/e7z;->J()Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_c

    .line 225
    .line 226
    iget-object p1, v2, La/e7z;->o:La/cg80;

    .line 227
    .line 228
    if-eqz p1, :cond_c

    .line 229
    .line 230
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 231
    .line 232
    invoke-virtual {p1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->w(La/e7z;)V

    .line 233
    .line 234
    .line 235
    :cond_c
    iput-boolean v0, p0, La/s460;->t1:Z

    .line 236
    .line 237
    return-void
.end method

.method public final H0()La/c810;
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->v:La/s460;

    .line 2
    .line 3
    return-object p0
.end method

.method public final H1(Z)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/s460;->v1:La/dfv;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_15

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, La/s460;->u1:La/bg80;

    .line 10
    .line 11
    iget-object v2, v0, La/s460;->z:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    if-eqz v1, :cond_39

    .line 14
    .line 15
    if-eqz v2, :cond_38

    .line 16
    .line 17
    sget-object v3, La/s460;->y1:La/uag0;

    .line 18
    .line 19
    invoke-virtual {v3}, La/uag0;->a()V

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, La/s460;->u:La/e7z;

    .line 23
    .line 24
    iget-object v5, v4, La/e7z;->z:La/w6k;

    .line 25
    .line 26
    iput-object v5, v3, La/uag0;->t:La/w6k;

    .line 27
    .line 28
    iget-object v5, v4, La/e7z;->A:La/k6z;

    .line 29
    .line 30
    iput-object v5, v3, La/uag0;->u:La/k6z;

    .line 31
    .line 32
    iget-wide v5, v0, La/pu90;->c:J

    .line 33
    .line 34
    invoke-static {v5, v6}, La/n2x;->Q(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    iput-wide v5, v3, La/uag0;->r:J

    .line 39
    .line 40
    new-instance v5, La/hie0;

    .line 41
    .line 42
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v4}, La/h7z;->a(La/e7z;)La/cg80;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-interface {v6}, La/cg80;->getSnapshotObserver()La/eg80;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    new-instance v7, La/g8l;

    .line 54
    .line 55
    const/16 v8, 0x1d

    .line 56
    .line 57
    invoke-direct {v7, v2, v0, v5, v8}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v6, La/eg80;->a:La/pgk0;

    .line 61
    .line 62
    sget-object v6, La/s460;->w1:La/mb50;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v6, v7}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, La/s460;->j1:La/b6z;

    .line 68
    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    new-instance v2, La/b6z;

    .line 72
    .line 73
    invoke-direct {v2}, La/b6z;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v2, v0, La/s460;->j1:La/b6z;

    .line 77
    .line 78
    :cond_1
    sget-object v6, La/s460;->z1:La/b6z;

    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget v7, v2, La/b6z;->a:F

    .line 84
    .line 85
    iput v7, v6, La/b6z;->a:F

    .line 86
    .line 87
    iget v7, v2, La/b6z;->b:F

    .line 88
    .line 89
    iput v7, v6, La/b6z;->b:F

    .line 90
    .line 91
    iget v7, v2, La/b6z;->c:F

    .line 92
    .line 93
    iput v7, v6, La/b6z;->c:F

    .line 94
    .line 95
    iget v7, v2, La/b6z;->d:F

    .line 96
    .line 97
    iput v7, v6, La/b6z;->d:F

    .line 98
    .line 99
    iget v7, v2, La/b6z;->e:F

    .line 100
    .line 101
    iput v7, v6, La/b6z;->e:F

    .line 102
    .line 103
    iget v7, v2, La/b6z;->f:F

    .line 104
    .line 105
    iput v7, v6, La/b6z;->f:F

    .line 106
    .line 107
    iget v7, v2, La/b6z;->g:F

    .line 108
    .line 109
    iput v7, v6, La/b6z;->g:F

    .line 110
    .line 111
    iget v7, v2, La/b6z;->h:F

    .line 112
    .line 113
    iput v7, v6, La/b6z;->h:F

    .line 114
    .line 115
    iget-wide v7, v2, La/b6z;->i:J

    .line 116
    .line 117
    iput-wide v7, v6, La/b6z;->i:J

    .line 118
    .line 119
    iget v7, v3, La/uag0;->b:F

    .line 120
    .line 121
    iput v7, v2, La/b6z;->a:F

    .line 122
    .line 123
    iget v7, v3, La/uag0;->c:F

    .line 124
    .line 125
    iput v7, v2, La/b6z;->b:F

    .line 126
    .line 127
    iget v7, v3, La/uag0;->e:F

    .line 128
    .line 129
    iput v7, v2, La/b6z;->c:F

    .line 130
    .line 131
    iget v7, v3, La/uag0;->f:F

    .line 132
    .line 133
    iput v7, v2, La/b6z;->d:F

    .line 134
    .line 135
    iget v7, v3, La/uag0;->j:F

    .line 136
    .line 137
    iput v7, v2, La/b6z;->e:F

    .line 138
    .line 139
    iget v7, v3, La/uag0;->k:F

    .line 140
    .line 141
    iput v7, v2, La/b6z;->f:F

    .line 142
    .line 143
    iget v7, v3, La/uag0;->l:F

    .line 144
    .line 145
    iput v7, v2, La/b6z;->g:F

    .line 146
    .line 147
    iget v7, v3, La/uag0;->m:F

    .line 148
    .line 149
    iput v7, v2, La/b6z;->h:F

    .line 150
    .line 151
    iget-wide v7, v3, La/uag0;->n:J

    .line 152
    .line 153
    iput-wide v7, v2, La/b6z;->i:J

    .line 154
    .line 155
    check-cast v1, La/gfv;

    .line 156
    .line 157
    iget-object v7, v1, La/gfv;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 158
    .line 159
    iget v8, v3, La/uag0;->a:I

    .line 160
    .line 161
    iget v9, v1, La/gfv;->n:I

    .line 162
    .line 163
    or-int/2addr v8, v9

    .line 164
    iget-object v9, v3, La/uag0;->u:La/k6z;

    .line 165
    .line 166
    iput-object v9, v1, La/gfv;->l:La/k6z;

    .line 167
    .line 168
    iget-object v9, v3, La/uag0;->t:La/w6k;

    .line 169
    .line 170
    iput-object v9, v1, La/gfv;->k:La/w6k;

    .line 171
    .line 172
    const/high16 v10, 0x100000

    .line 173
    .line 174
    and-int/2addr v10, v8

    .line 175
    const/4 v11, 0x0

    .line 176
    if-eqz v10, :cond_2

    .line 177
    .line 178
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 179
    .line 180
    iget-object v12, v3, La/uag0;->s:La/z5z;

    .line 181
    .line 182
    iget v12, v12, La/z5z;->a:F

    .line 183
    .line 184
    invoke-interface {v9, v12}, La/w6k;->T(F)I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    iget-object v13, v3, La/uag0;->s:La/z5z;

    .line 189
    .line 190
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-interface {v9, v11}, La/w6k;->T(F)I

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    iget-object v14, v3, La/uag0;->s:La/z5z;

    .line 198
    .line 199
    iget v14, v14, La/z5z;->b:F

    .line 200
    .line 201
    invoke-interface {v9, v14}, La/w6k;->T(F)I

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    iget-object v15, v3, La/uag0;->s:La/z5z;

    .line 206
    .line 207
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-interface {v9, v11}, La/w6k;->T(F)I

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    iput v12, v10, La/dfv;->v:I

    .line 215
    .line 216
    iput v13, v10, La/dfv;->w:I

    .line 217
    .line 218
    iput v14, v10, La/dfv;->x:I

    .line 219
    .line 220
    iput v9, v10, La/dfv;->y:I

    .line 221
    .line 222
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 223
    .line 224
    invoke-interface {v10, v12, v13, v14, v9}, La/ffv;->s(IIII)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, La/gfv;->c()V

    .line 228
    .line 229
    .line 230
    :cond_2
    and-int/lit16 v9, v8, 0x1000

    .line 231
    .line 232
    if-eqz v9, :cond_3

    .line 233
    .line 234
    iget-wide v12, v3, La/uag0;->n:J

    .line 235
    .line 236
    iput-wide v12, v1, La/gfv;->o:J

    .line 237
    .line 238
    :cond_3
    and-int/lit8 v10, v8, 0x1

    .line 239
    .line 240
    if-eqz v10, :cond_5

    .line 241
    .line 242
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 243
    .line 244
    iget v12, v3, La/uag0;->b:F

    .line 245
    .line 246
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 247
    .line 248
    invoke-interface {v10}, La/ffv;->F()F

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    cmpg-float v13, v13, v12

    .line 253
    .line 254
    if-nez v13, :cond_4

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_4
    invoke-interface {v10, v12}, La/ffv;->v(F)V

    .line 258
    .line 259
    .line 260
    :cond_5
    :goto_0
    and-int/lit8 v10, v8, 0x2

    .line 261
    .line 262
    if-eqz v10, :cond_7

    .line 263
    .line 264
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 265
    .line 266
    iget v12, v3, La/uag0;->c:F

    .line 267
    .line 268
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 269
    .line 270
    invoke-interface {v10}, La/ffv;->U()F

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    cmpg-float v13, v13, v12

    .line 275
    .line 276
    if-nez v13, :cond_6

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_6
    invoke-interface {v10, v12}, La/ffv;->J(F)V

    .line 280
    .line 281
    .line 282
    :cond_7
    :goto_1
    and-int/lit8 v10, v8, 0x4

    .line 283
    .line 284
    if-eqz v10, :cond_8

    .line 285
    .line 286
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 287
    .line 288
    iget v12, v3, La/uag0;->d:F

    .line 289
    .line 290
    invoke-virtual {v10, v12}, La/dfv;->g(F)V

    .line 291
    .line 292
    .line 293
    :cond_8
    and-int/lit8 v10, v8, 0x8

    .line 294
    .line 295
    if-eqz v10, :cond_a

    .line 296
    .line 297
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 298
    .line 299
    iget v12, v3, La/uag0;->e:F

    .line 300
    .line 301
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 302
    .line 303
    invoke-interface {v10}, La/ffv;->O()F

    .line 304
    .line 305
    .line 306
    move-result v13

    .line 307
    cmpg-float v13, v13, v12

    .line 308
    .line 309
    if-nez v13, :cond_9

    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_9
    invoke-interface {v10, v12}, La/ffv;->R(F)V

    .line 313
    .line 314
    .line 315
    :cond_a
    :goto_2
    and-int/lit8 v10, v8, 0x10

    .line 316
    .line 317
    if-eqz v10, :cond_c

    .line 318
    .line 319
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 320
    .line 321
    iget v12, v3, La/uag0;->f:F

    .line 322
    .line 323
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 324
    .line 325
    invoke-interface {v10}, La/ffv;->N()F

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    cmpg-float v13, v13, v12

    .line 330
    .line 331
    if-nez v13, :cond_b

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_b
    invoke-interface {v10, v12}, La/ffv;->i(F)V

    .line 335
    .line 336
    .line 337
    :cond_c
    :goto_3
    and-int/lit8 v10, v8, 0x20

    .line 338
    .line 339
    const/4 v12, 0x1

    .line 340
    if-eqz v10, :cond_e

    .line 341
    .line 342
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 343
    .line 344
    iget v13, v3, La/uag0;->g:F

    .line 345
    .line 346
    iget-object v14, v10, La/dfv;->a:La/ffv;

    .line 347
    .line 348
    invoke-interface {v14}, La/ffv;->T()F

    .line 349
    .line 350
    .line 351
    move-result v15

    .line 352
    cmpg-float v15, v15, v13

    .line 353
    .line 354
    if-nez v15, :cond_d

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_d
    invoke-interface {v14, v13}, La/ffv;->G(F)V

    .line 358
    .line 359
    .line 360
    iput-boolean v12, v10, La/dfv;->g:Z

    .line 361
    .line 362
    invoke-virtual {v10}, La/dfv;->a()V

    .line 363
    .line 364
    .line 365
    :goto_4
    iget v10, v3, La/uag0;->g:F

    .line 366
    .line 367
    cmpl-float v10, v10, v11

    .line 368
    .line 369
    if-lez v10, :cond_e

    .line 370
    .line 371
    iget-boolean v10, v1, La/gfv;->t:Z

    .line 372
    .line 373
    if-nez v10, :cond_e

    .line 374
    .line 375
    iget-object v10, v1, La/gfv;->e:Lkotlin/jvm/functions/Function0;

    .line 376
    .line 377
    if-eqz v10, :cond_e

    .line 378
    .line 379
    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    :cond_e
    and-int/lit8 v10, v8, 0x40

    .line 383
    .line 384
    if-eqz v10, :cond_f

    .line 385
    .line 386
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 387
    .line 388
    iget-wide v13, v3, La/uag0;->h:J

    .line 389
    .line 390
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 391
    .line 392
    invoke-interface {v10}, La/ffv;->r()J

    .line 393
    .line 394
    .line 395
    move-result-wide v11

    .line 396
    sget v16, La/y3d;->h:I

    .line 397
    .line 398
    invoke-static {v13, v14, v11, v12}, La/h2t0;->a(JJ)Z

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    if-nez v11, :cond_f

    .line 403
    .line 404
    invoke-interface {v10, v13, v14}, La/ffv;->u(J)V

    .line 405
    .line 406
    .line 407
    :cond_f
    and-int/lit16 v10, v8, 0x80

    .line 408
    .line 409
    if-eqz v10, :cond_10

    .line 410
    .line 411
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 412
    .line 413
    iget-wide v11, v3, La/uag0;->i:J

    .line 414
    .line 415
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 416
    .line 417
    invoke-interface {v10}, La/ffv;->t()J

    .line 418
    .line 419
    .line 420
    move-result-wide v13

    .line 421
    sget v16, La/y3d;->h:I

    .line 422
    .line 423
    invoke-static {v11, v12, v13, v14}, La/h2t0;->a(JJ)Z

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    if-nez v13, :cond_10

    .line 428
    .line 429
    invoke-interface {v10, v11, v12}, La/ffv;->y(J)V

    .line 430
    .line 431
    .line 432
    :cond_10
    and-int/lit16 v10, v8, 0x400

    .line 433
    .line 434
    if-eqz v10, :cond_12

    .line 435
    .line 436
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 437
    .line 438
    iget v11, v3, La/uag0;->l:F

    .line 439
    .line 440
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 441
    .line 442
    invoke-interface {v10}, La/ffv;->q()F

    .line 443
    .line 444
    .line 445
    move-result v12

    .line 446
    cmpg-float v12, v12, v11

    .line 447
    .line 448
    if-nez v12, :cond_11

    .line 449
    .line 450
    goto :goto_5

    .line 451
    :cond_11
    invoke-interface {v10, v11}, La/ffv;->H(F)V

    .line 452
    .line 453
    .line 454
    :cond_12
    :goto_5
    and-int/lit16 v10, v8, 0x100

    .line 455
    .line 456
    if-eqz v10, :cond_14

    .line 457
    .line 458
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 459
    .line 460
    iget v11, v3, La/uag0;->j:F

    .line 461
    .line 462
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 463
    .line 464
    invoke-interface {v10}, La/ffv;->P()F

    .line 465
    .line 466
    .line 467
    move-result v12

    .line 468
    cmpg-float v12, v12, v11

    .line 469
    .line 470
    if-nez v12, :cond_13

    .line 471
    .line 472
    goto :goto_6

    .line 473
    :cond_13
    invoke-interface {v10, v11}, La/ffv;->C(F)V

    .line 474
    .line 475
    .line 476
    :cond_14
    :goto_6
    and-int/lit16 v10, v8, 0x200

    .line 477
    .line 478
    if-eqz v10, :cond_16

    .line 479
    .line 480
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 481
    .line 482
    iget v11, v3, La/uag0;->k:F

    .line 483
    .line 484
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 485
    .line 486
    invoke-interface {v10}, La/ffv;->o()F

    .line 487
    .line 488
    .line 489
    move-result v12

    .line 490
    cmpg-float v12, v12, v11

    .line 491
    .line 492
    if-nez v12, :cond_15

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_15
    invoke-interface {v10, v11}, La/ffv;->E(F)V

    .line 496
    .line 497
    .line 498
    :cond_16
    :goto_7
    and-int/lit16 v10, v8, 0x800

    .line 499
    .line 500
    if-eqz v10, :cond_18

    .line 501
    .line 502
    iget-object v10, v1, La/gfv;->a:La/dfv;

    .line 503
    .line 504
    iget v11, v3, La/uag0;->m:F

    .line 505
    .line 506
    iget-object v10, v10, La/dfv;->a:La/ffv;

    .line 507
    .line 508
    invoke-interface {v10}, La/ffv;->w()F

    .line 509
    .line 510
    .line 511
    move-result v12

    .line 512
    cmpg-float v12, v12, v11

    .line 513
    .line 514
    if-nez v12, :cond_17

    .line 515
    .line 516
    goto :goto_8

    .line 517
    :cond_17
    invoke-interface {v10, v11}, La/ffv;->B(F)V

    .line 518
    .line 519
    .line 520
    :cond_18
    :goto_8
    if-eqz v9, :cond_1a

    .line 521
    .line 522
    const/16 v9, 0x20

    .line 523
    .line 524
    const-wide v16, 0xffffffffL

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    iget-wide v10, v1, La/gfv;->o:J

    .line 530
    .line 531
    sget-wide v13, La/ils0;->b:J

    .line 532
    .line 533
    invoke-static {v10, v11, v13, v14}, La/ils0;->a(JJ)Z

    .line 534
    .line 535
    .line 536
    move-result v10

    .line 537
    iget-object v11, v1, La/gfv;->a:La/dfv;

    .line 538
    .line 539
    if-eqz v10, :cond_19

    .line 540
    .line 541
    iget-wide v12, v11, La/dfv;->z:J

    .line 542
    .line 543
    move v14, v9

    .line 544
    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    invoke-static {v12, v13, v9, v10}, La/ne60;->c(JJ)Z

    .line 550
    .line 551
    .line 552
    move-result v12

    .line 553
    if-nez v12, :cond_1b

    .line 554
    .line 555
    iput-wide v9, v11, La/dfv;->z:J

    .line 556
    .line 557
    iget-object v11, v11, La/dfv;->a:La/ffv;

    .line 558
    .line 559
    invoke-interface {v11, v9, v10}, La/ffv;->M(J)V

    .line 560
    .line 561
    .line 562
    goto :goto_9

    .line 563
    :cond_19
    move v14, v9

    .line 564
    iget-wide v9, v1, La/gfv;->o:J

    .line 565
    .line 566
    shr-long/2addr v9, v14

    .line 567
    long-to-int v9, v9

    .line 568
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    iget-wide v12, v1, La/gfv;->f:J

    .line 573
    .line 574
    shr-long/2addr v12, v14

    .line 575
    long-to-int v10, v12

    .line 576
    int-to-float v10, v10

    .line 577
    mul-float/2addr v9, v10

    .line 578
    iget-wide v12, v1, La/gfv;->o:J

    .line 579
    .line 580
    and-long v12, v12, v16

    .line 581
    .line 582
    long-to-int v10, v12

    .line 583
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 584
    .line 585
    .line 586
    move-result v10

    .line 587
    iget-wide v12, v1, La/gfv;->f:J

    .line 588
    .line 589
    and-long v12, v12, v16

    .line 590
    .line 591
    long-to-int v12, v12

    .line 592
    int-to-float v12, v12

    .line 593
    mul-float/2addr v10, v12

    .line 594
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 595
    .line 596
    .line 597
    move-result v9

    .line 598
    int-to-long v12, v9

    .line 599
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 600
    .line 601
    .line 602
    move-result v9

    .line 603
    int-to-long v9, v9

    .line 604
    shl-long/2addr v12, v14

    .line 605
    and-long v9, v9, v16

    .line 606
    .line 607
    or-long/2addr v9, v12

    .line 608
    iget-wide v12, v11, La/dfv;->z:J

    .line 609
    .line 610
    invoke-static {v12, v13, v9, v10}, La/ne60;->c(JJ)Z

    .line 611
    .line 612
    .line 613
    move-result v12

    .line 614
    if-nez v12, :cond_1b

    .line 615
    .line 616
    iput-wide v9, v11, La/dfv;->z:J

    .line 617
    .line 618
    iget-object v11, v11, La/dfv;->a:La/ffv;

    .line 619
    .line 620
    invoke-interface {v11, v9, v10}, La/ffv;->M(J)V

    .line 621
    .line 622
    .line 623
    goto :goto_9

    .line 624
    :cond_1a
    const/16 v14, 0x20

    .line 625
    .line 626
    const-wide v16, 0xffffffffL

    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    :cond_1b
    :goto_9
    and-int/lit16 v9, v8, 0x4000

    .line 632
    .line 633
    if-eqz v9, :cond_1c

    .line 634
    .line 635
    iget-object v9, v1, La/gfv;->a:La/dfv;

    .line 636
    .line 637
    iget-boolean v10, v3, La/uag0;->p:Z

    .line 638
    .line 639
    iget-boolean v11, v9, La/dfv;->A:Z

    .line 640
    .line 641
    if-eq v11, v10, :cond_1c

    .line 642
    .line 643
    iput-boolean v10, v9, La/dfv;->A:Z

    .line 644
    .line 645
    const/4 v10, 0x1

    .line 646
    iput-boolean v10, v9, La/dfv;->g:Z

    .line 647
    .line 648
    invoke-virtual {v9}, La/dfv;->a()V

    .line 649
    .line 650
    .line 651
    :cond_1c
    const/high16 v9, 0x20000

    .line 652
    .line 653
    and-int/2addr v9, v8

    .line 654
    if-eqz v9, :cond_1d

    .line 655
    .line 656
    iget-object v9, v1, La/gfv;->a:La/dfv;

    .line 657
    .line 658
    iget-object v10, v3, La/uag0;->v:La/p4;

    .line 659
    .line 660
    iget-object v9, v9, La/dfv;->a:La/ffv;

    .line 661
    .line 662
    invoke-interface {v9}, La/ffv;->h()La/p4;

    .line 663
    .line 664
    .line 665
    move-result-object v11

    .line 666
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v11

    .line 670
    if-nez v11, :cond_1d

    .line 671
    .line 672
    invoke-interface {v9, v10}, La/ffv;->S(La/p4;)V

    .line 673
    .line 674
    .line 675
    :cond_1d
    const/high16 v9, 0x40000

    .line 676
    .line 677
    and-int/2addr v9, v8

    .line 678
    if-eqz v9, :cond_1e

    .line 679
    .line 680
    iget-object v9, v1, La/gfv;->a:La/dfv;

    .line 681
    .line 682
    iget-object v10, v3, La/uag0;->w:La/a4d;

    .line 683
    .line 684
    iget-object v9, v9, La/dfv;->a:La/ffv;

    .line 685
    .line 686
    invoke-interface {v9}, La/ffv;->m()La/a4d;

    .line 687
    .line 688
    .line 689
    move-result-object v11

    .line 690
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v11

    .line 694
    if-nez v11, :cond_1e

    .line 695
    .line 696
    invoke-interface {v9, v10}, La/ffv;->A(La/a4d;)V

    .line 697
    .line 698
    .line 699
    :cond_1e
    const/high16 v9, 0x80000

    .line 700
    .line 701
    and-int/2addr v9, v8

    .line 702
    if-eqz v9, :cond_20

    .line 703
    .line 704
    iget-object v9, v1, La/gfv;->a:La/dfv;

    .line 705
    .line 706
    iget v10, v3, La/uag0;->x:I

    .line 707
    .line 708
    iget-object v9, v9, La/dfv;->a:La/ffv;

    .line 709
    .line 710
    invoke-interface {v9}, La/ffv;->D()I

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    if-ne v11, v10, :cond_1f

    .line 715
    .line 716
    goto :goto_a

    .line 717
    :cond_1f
    invoke-interface {v9, v10}, La/ffv;->j(I)V

    .line 718
    .line 719
    .line 720
    :cond_20
    :goto_a
    const v9, 0x8000

    .line 721
    .line 722
    .line 723
    and-int/2addr v9, v8

    .line 724
    if-eqz v9, :cond_25

    .line 725
    .line 726
    iget-object v9, v1, La/gfv;->a:La/dfv;

    .line 727
    .line 728
    iget v11, v3, La/uag0;->q:I

    .line 729
    .line 730
    if-nez v11, :cond_21

    .line 731
    .line 732
    const/4 v12, 0x0

    .line 733
    goto :goto_b

    .line 734
    :cond_21
    const/4 v12, 0x1

    .line 735
    if-ne v11, v12, :cond_22

    .line 736
    .line 737
    const/4 v12, 0x1

    .line 738
    goto :goto_b

    .line 739
    :cond_22
    const/4 v12, 0x2

    .line 740
    if-ne v11, v12, :cond_24

    .line 741
    .line 742
    :goto_b
    iget-object v9, v9, La/dfv;->a:La/ffv;

    .line 743
    .line 744
    invoke-interface {v9}, La/ffv;->l()I

    .line 745
    .line 746
    .line 747
    move-result v11

    .line 748
    if-ne v11, v12, :cond_23

    .line 749
    .line 750
    goto :goto_c

    .line 751
    :cond_23
    invoke-interface {v9, v12}, La/ffv;->Q(I)V

    .line 752
    .line 753
    .line 754
    goto :goto_c

    .line 755
    :cond_24
    const-string v0, "Not supported composition strategy"

    .line 756
    .line 757
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    return-void

    .line 761
    :cond_25
    :goto_c
    and-int/lit16 v9, v8, 0x1f1b

    .line 762
    .line 763
    if-eqz v9, :cond_26

    .line 764
    .line 765
    const/4 v12, 0x1

    .line 766
    iput-boolean v12, v1, La/gfv;->q:Z

    .line 767
    .line 768
    iput-boolean v12, v1, La/gfv;->r:Z

    .line 769
    .line 770
    :cond_26
    iget-object v9, v1, La/gfv;->p:La/x1x;

    .line 771
    .line 772
    iget-object v11, v3, La/uag0;->y:La/x1x;

    .line 773
    .line 774
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v9

    .line 778
    if-nez v9, :cond_2e

    .line 779
    .line 780
    iget-object v9, v3, La/uag0;->y:La/x1x;

    .line 781
    .line 782
    iput-object v9, v1, La/gfv;->p:La/x1x;

    .line 783
    .line 784
    if-nez v9, :cond_27

    .line 785
    .line 786
    move-object/from16 v26, v4

    .line 787
    .line 788
    move-object/from16 v27, v5

    .line 789
    .line 790
    goto/16 :goto_f

    .line 791
    .line 792
    :cond_27
    iget-object v12, v1, La/gfv;->a:La/dfv;

    .line 793
    .line 794
    instance-of v13, v9, La/oe80;

    .line 795
    .line 796
    if-eqz v13, :cond_28

    .line 797
    .line 798
    move-object v13, v9

    .line 799
    check-cast v13, La/oe80;

    .line 800
    .line 801
    iget-object v13, v13, La/oe80;->a:La/jge0;

    .line 802
    .line 803
    move/from16 v20, v14

    .line 804
    .line 805
    iget v14, v13, La/jge0;->a:F

    .line 806
    .line 807
    iget v15, v13, La/jge0;->b:F

    .line 808
    .line 809
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 810
    .line 811
    .line 812
    move-result v10

    .line 813
    move-object/from16 v21, v12

    .line 814
    .line 815
    int-to-long v11, v10

    .line 816
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 817
    .line 818
    .line 819
    move-result v10

    .line 820
    move-wide/from16 v18, v11

    .line 821
    .line 822
    int-to-long v10, v10

    .line 823
    shl-long v18, v18, v20

    .line 824
    .line 825
    and-long v10, v10, v16

    .line 826
    .line 827
    or-long v22, v18, v10

    .line 828
    .line 829
    iget v10, v13, La/jge0;->c:F

    .line 830
    .line 831
    sub-float/2addr v10, v14

    .line 832
    iget v11, v13, La/jge0;->d:F

    .line 833
    .line 834
    sub-float/2addr v11, v15

    .line 835
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 836
    .line 837
    .line 838
    move-result v10

    .line 839
    int-to-long v12, v10

    .line 840
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 841
    .line 842
    .line 843
    move-result v10

    .line 844
    int-to-long v10, v10

    .line 845
    shl-long v12, v12, v20

    .line 846
    .line 847
    and-long v10, v10, v16

    .line 848
    .line 849
    or-long v24, v12, v10

    .line 850
    .line 851
    move-object/from16 v20, v21

    .line 852
    .line 853
    const/16 v21, 0x0

    .line 854
    .line 855
    invoke-virtual/range {v20 .. v25}, La/dfv;->h(FJJ)V

    .line 856
    .line 857
    .line 858
    :goto_d
    move-object/from16 v26, v4

    .line 859
    .line 860
    move-object/from16 v27, v5

    .line 861
    .line 862
    goto/16 :goto_e

    .line 863
    .line 864
    :cond_28
    move-object v10, v12

    .line 865
    move/from16 v20, v14

    .line 866
    .line 867
    instance-of v11, v9, La/ne80;

    .line 868
    .line 869
    const-wide/16 v12, 0x0

    .line 870
    .line 871
    if-eqz v11, :cond_29

    .line 872
    .line 873
    move-object v11, v9

    .line 874
    check-cast v11, La/ne80;

    .line 875
    .line 876
    iget-object v11, v11, La/ne80;->a:La/w03;

    .line 877
    .line 878
    const/4 v14, 0x0

    .line 879
    iput-object v14, v10, La/dfv;->k:La/x1x;

    .line 880
    .line 881
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    iput-wide v14, v10, La/dfv;->i:J

    .line 887
    .line 888
    iput-wide v12, v10, La/dfv;->h:J

    .line 889
    .line 890
    const/4 v15, 0x0

    .line 891
    iput v15, v10, La/dfv;->j:F

    .line 892
    .line 893
    const/4 v12, 0x1

    .line 894
    iput-boolean v12, v10, La/dfv;->g:Z

    .line 895
    .line 896
    const/4 v12, 0x0

    .line 897
    iput-boolean v12, v10, La/dfv;->n:Z

    .line 898
    .line 899
    iput-object v11, v10, La/dfv;->l:La/w03;

    .line 900
    .line 901
    invoke-virtual {v10}, La/dfv;->a()V

    .line 902
    .line 903
    .line 904
    goto :goto_d

    .line 905
    :cond_29
    instance-of v11, v9, La/pe80;

    .line 906
    .line 907
    if-eqz v11, :cond_2d

    .line 908
    .line 909
    move-object v11, v9

    .line 910
    check-cast v11, La/pe80;

    .line 911
    .line 912
    iget-object v14, v11, La/pe80;->b:La/w03;

    .line 913
    .line 914
    if-eqz v14, :cond_2a

    .line 915
    .line 916
    const/4 v15, 0x0

    .line 917
    iput-object v15, v10, La/dfv;->k:La/x1x;

    .line 918
    .line 919
    move-object/from16 v26, v4

    .line 920
    .line 921
    move-object/from16 v27, v5

    .line 922
    .line 923
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    iput-wide v4, v10, La/dfv;->i:J

    .line 929
    .line 930
    iput-wide v12, v10, La/dfv;->h:J

    .line 931
    .line 932
    const/4 v15, 0x0

    .line 933
    iput v15, v10, La/dfv;->j:F

    .line 934
    .line 935
    const/4 v12, 0x1

    .line 936
    iput-boolean v12, v10, La/dfv;->g:Z

    .line 937
    .line 938
    const/4 v12, 0x0

    .line 939
    iput-boolean v12, v10, La/dfv;->n:Z

    .line 940
    .line 941
    iput-object v14, v10, La/dfv;->l:La/w03;

    .line 942
    .line 943
    invoke-virtual {v10}, La/dfv;->a()V

    .line 944
    .line 945
    .line 946
    goto :goto_e

    .line 947
    :cond_2a
    move-object/from16 v26, v4

    .line 948
    .line 949
    move-object/from16 v27, v5

    .line 950
    .line 951
    const/4 v12, 0x0

    .line 952
    iget-object v4, v11, La/pe80;->a:La/wfg0;

    .line 953
    .line 954
    iget v5, v4, La/wfg0;->a:F

    .line 955
    .line 956
    iget v11, v4, La/wfg0;->b:F

    .line 957
    .line 958
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 959
    .line 960
    .line 961
    move-result v5

    .line 962
    int-to-long v13, v5

    .line 963
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 964
    .line 965
    .line 966
    move-result v5

    .line 967
    move-wide/from16 v18, v13

    .line 968
    .line 969
    int-to-long v12, v5

    .line 970
    shl-long v18, v18, v20

    .line 971
    .line 972
    and-long v11, v12, v16

    .line 973
    .line 974
    or-long v22, v18, v11

    .line 975
    .line 976
    invoke-virtual {v4}, La/wfg0;->b()F

    .line 977
    .line 978
    .line 979
    move-result v5

    .line 980
    invoke-virtual {v4}, La/wfg0;->a()F

    .line 981
    .line 982
    .line 983
    move-result v11

    .line 984
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 985
    .line 986
    .line 987
    move-result v5

    .line 988
    int-to-long v12, v5

    .line 989
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 990
    .line 991
    .line 992
    move-result v5

    .line 993
    move-object/from16 v21, v10

    .line 994
    .line 995
    int-to-long v10, v5

    .line 996
    shl-long v12, v12, v20

    .line 997
    .line 998
    and-long v10, v10, v16

    .line 999
    .line 1000
    or-long v24, v12, v10

    .line 1001
    .line 1002
    iget-wide v4, v4, La/wfg0;->h:J

    .line 1003
    .line 1004
    shr-long v4, v4, v20

    .line 1005
    .line 1006
    long-to-int v4, v4

    .line 1007
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1008
    .line 1009
    .line 1010
    move-result v4

    .line 1011
    move-object/from16 v20, v21

    .line 1012
    .line 1013
    move/from16 v21, v4

    .line 1014
    .line 1015
    invoke-virtual/range {v20 .. v25}, La/dfv;->h(FJJ)V

    .line 1016
    .line 1017
    .line 1018
    :goto_e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1019
    .line 1020
    const/16 v5, 0x21

    .line 1021
    .line 1022
    if-ge v4, v5, :cond_2c

    .line 1023
    .line 1024
    instance-of v4, v9, La/ne80;

    .line 1025
    .line 1026
    if-nez v4, :cond_2b

    .line 1027
    .line 1028
    instance-of v4, v9, La/pe80;

    .line 1029
    .line 1030
    if-eqz v4, :cond_2c

    .line 1031
    .line 1032
    check-cast v9, La/pe80;

    .line 1033
    .line 1034
    iget-object v4, v9, La/pe80;->a:La/wfg0;

    .line 1035
    .line 1036
    invoke-static {v4}, La/r8x;->S(La/wfg0;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v4

    .line 1040
    if-nez v4, :cond_2c

    .line 1041
    .line 1042
    :cond_2b
    iget-object v4, v1, La/gfv;->e:Lkotlin/jvm/functions/Function0;

    .line 1043
    .line 1044
    if-eqz v4, :cond_2c

    .line 1045
    .line 1046
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    :cond_2c
    :goto_f
    const/4 v10, 0x1

    .line 1050
    goto :goto_10

    .line 1051
    :cond_2d
    invoke-static {}, La/t9f;->b()V

    .line 1052
    .line 1053
    .line 1054
    return-void

    .line 1055
    :cond_2e
    move-object/from16 v26, v4

    .line 1056
    .line 1057
    move-object/from16 v27, v5

    .line 1058
    .line 1059
    const/4 v10, 0x0

    .line 1060
    :goto_10
    iget v4, v3, La/uag0;->a:I

    .line 1061
    .line 1062
    iput v4, v1, La/gfv;->n:I

    .line 1063
    .line 1064
    if-nez v8, :cond_2f

    .line 1065
    .line 1066
    if-eqz v10, :cond_32

    .line 1067
    .line 1068
    :cond_2f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1069
    .line 1070
    const/16 v4, 0x1a

    .line 1071
    .line 1072
    if-lt v1, v4, :cond_30

    .line 1073
    .line 1074
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    if-eqz v1, :cond_31

    .line 1079
    .line 1080
    invoke-static {v1, v7, v7}, La/jw90;->x(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_11

    .line 1084
    :cond_30
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    .line 1085
    .line 1086
    .line 1087
    :cond_31
    :goto_11
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->m()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v1

    .line 1091
    if-eqz v1, :cond_32

    .line 1092
    .line 1093
    const/4 v15, 0x0

    .line 1094
    invoke-virtual {v7, v15}, Landroidx/compose/ui/platform/AndroidComposeView;->N(F)V

    .line 1095
    .line 1096
    .line 1097
    :cond_32
    iget-boolean v1, v0, La/s460;->y:Z

    .line 1098
    .line 1099
    iget-boolean v4, v3, La/uag0;->p:Z

    .line 1100
    .line 1101
    iput-boolean v4, v0, La/s460;->y:Z

    .line 1102
    .line 1103
    iget v3, v3, La/uag0;->d:F

    .line 1104
    .line 1105
    iput v3, v0, La/s460;->Y:F

    .line 1106
    .line 1107
    iget v3, v6, La/b6z;->a:F

    .line 1108
    .line 1109
    iget v4, v2, La/b6z;->a:F

    .line 1110
    .line 1111
    cmpg-float v3, v3, v4

    .line 1112
    .line 1113
    if-nez v3, :cond_33

    .line 1114
    .line 1115
    iget v3, v6, La/b6z;->b:F

    .line 1116
    .line 1117
    iget v4, v2, La/b6z;->b:F

    .line 1118
    .line 1119
    cmpg-float v3, v3, v4

    .line 1120
    .line 1121
    if-nez v3, :cond_33

    .line 1122
    .line 1123
    iget v3, v6, La/b6z;->c:F

    .line 1124
    .line 1125
    iget v4, v2, La/b6z;->c:F

    .line 1126
    .line 1127
    cmpg-float v3, v3, v4

    .line 1128
    .line 1129
    if-nez v3, :cond_33

    .line 1130
    .line 1131
    iget v3, v6, La/b6z;->d:F

    .line 1132
    .line 1133
    iget v4, v2, La/b6z;->d:F

    .line 1134
    .line 1135
    cmpg-float v3, v3, v4

    .line 1136
    .line 1137
    if-nez v3, :cond_33

    .line 1138
    .line 1139
    iget v3, v6, La/b6z;->e:F

    .line 1140
    .line 1141
    iget v4, v2, La/b6z;->e:F

    .line 1142
    .line 1143
    cmpg-float v3, v3, v4

    .line 1144
    .line 1145
    if-nez v3, :cond_33

    .line 1146
    .line 1147
    iget v3, v6, La/b6z;->f:F

    .line 1148
    .line 1149
    iget v4, v2, La/b6z;->f:F

    .line 1150
    .line 1151
    cmpg-float v3, v3, v4

    .line 1152
    .line 1153
    if-nez v3, :cond_33

    .line 1154
    .line 1155
    iget v3, v6, La/b6z;->g:F

    .line 1156
    .line 1157
    iget v4, v2, La/b6z;->g:F

    .line 1158
    .line 1159
    cmpg-float v3, v3, v4

    .line 1160
    .line 1161
    if-nez v3, :cond_33

    .line 1162
    .line 1163
    iget v3, v6, La/b6z;->h:F

    .line 1164
    .line 1165
    iget v4, v2, La/b6z;->h:F

    .line 1166
    .line 1167
    cmpg-float v3, v3, v4

    .line 1168
    .line 1169
    if-nez v3, :cond_33

    .line 1170
    .line 1171
    iget-wide v3, v6, La/b6z;->i:J

    .line 1172
    .line 1173
    iget-wide v5, v2, La/b6z;->i:J

    .line 1174
    .line 1175
    invoke-static {v3, v4, v5, v6}, La/ils0;->a(JJ)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v2

    .line 1179
    if-eqz v2, :cond_33

    .line 1180
    .line 1181
    const/4 v10, 0x1

    .line 1182
    goto :goto_12

    .line 1183
    :cond_33
    const/4 v10, 0x0

    .line 1184
    :goto_12
    if-eqz p1, :cond_35

    .line 1185
    .line 1186
    if-eqz v10, :cond_34

    .line 1187
    .line 1188
    iget-boolean v2, v0, La/s460;->y:Z

    .line 1189
    .line 1190
    if-ne v1, v2, :cond_34

    .line 1191
    .line 1192
    move-object/from16 v1, v27

    .line 1193
    .line 1194
    iget-boolean v1, v1, La/hie0;->a:Z

    .line 1195
    .line 1196
    if-eqz v1, :cond_35

    .line 1197
    .line 1198
    :cond_34
    move-object/from16 v1, v26

    .line 1199
    .line 1200
    goto :goto_13

    .line 1201
    :cond_35
    move-object/from16 v1, v26

    .line 1202
    .line 1203
    goto :goto_14

    .line 1204
    :goto_13
    iget-object v2, v1, La/e7z;->o:La/cg80;

    .line 1205
    .line 1206
    if-eqz v2, :cond_36

    .line 1207
    .line 1208
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1209
    .line 1210
    invoke-virtual {v2, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->w(La/e7z;)V

    .line 1211
    .line 1212
    .line 1213
    :cond_36
    :goto_14
    if-nez v10, :cond_3a

    .line 1214
    .line 1215
    invoke-virtual {v1, v0}, La/e7z;->O(La/s460;)V

    .line 1216
    .line 1217
    .line 1218
    iget v0, v1, La/e7z;->r1:I

    .line 1219
    .line 1220
    if-lez v0, :cond_3a

    .line 1221
    .line 1222
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1227
    .line 1228
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 1229
    .line 1230
    iget-object v2, v2, La/h7k;->f:Ljava/lang/Object;

    .line 1231
    .line 1232
    check-cast v2, La/kd30;

    .line 1233
    .line 1234
    iget v3, v1, La/e7z;->r1:I

    .line 1235
    .line 1236
    if-lez v3, :cond_37

    .line 1237
    .line 1238
    iget-object v2, v2, La/kd30;->a:Ljava/lang/Object;

    .line 1239
    .line 1240
    check-cast v2, La/xz40;

    .line 1241
    .line 1242
    invoke-virtual {v2, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    const/4 v12, 0x1

    .line 1246
    iput-boolean v12, v1, La/e7z;->q1:Z

    .line 1247
    .line 1248
    :cond_37
    const/4 v14, 0x0

    .line 1249
    invoke-virtual {v0, v14}, Landroidx/compose/ui/platform/AndroidComposeView;->G(La/e7z;)V

    .line 1250
    .line 1251
    .line 1252
    return-void

    .line 1253
    :cond_38
    const-string v0, "updateLayerParameters requires a non-null layerBlock"

    .line 1254
    .line 1255
    invoke-static {v0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    throw v0

    .line 1260
    :cond_39
    if-nez v2, :cond_3b

    .line 1261
    .line 1262
    :cond_3a
    :goto_15
    return-void

    .line 1263
    :cond_3b
    const-string v0, "null layer with a non-null layerBlock"

    .line 1264
    .line 1265
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    return-void
.end method

.method public final I(La/j6z;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, La/s460;->F(La/j6z;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final I0()La/j6z;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final I1(J)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long v3, p1, v1

    .line 9
    .line 10
    xor-long/2addr v1, v3

    .line 11
    const-wide v3, 0x100000001L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    sub-long/2addr v1, v3

    .line 17
    const-wide v3, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v1, v3

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_d

    .line 28
    .line 29
    iget-object v1, v0, La/s460;->u1:La/bg80;

    .line 30
    .line 31
    if-eqz v1, :cond_c

    .line 32
    .line 33
    iget-boolean v0, v0, La/s460;->y:Z

    .line 34
    .line 35
    if-eqz v0, :cond_c

    .line 36
    .line 37
    check-cast v1, La/gfv;

    .line 38
    .line 39
    const/16 v0, 0x20

    .line 40
    .line 41
    shr-long v4, p1, v0

    .line 42
    .line 43
    long-to-int v4, v4

    .line 44
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const-wide v6, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long v8, p1, v6

    .line 54
    .line 55
    long-to-int v4, v8

    .line 56
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v1, v1, La/gfv;->a:La/dfv;

    .line 61
    .line 62
    iget-boolean v8, v1, La/dfv;->A:Z

    .line 63
    .line 64
    if-eqz v8, :cond_b

    .line 65
    .line 66
    invoke-virtual {v1}, La/dfv;->e()La/x1x;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v8, v1, La/oe80;

    .line 71
    .line 72
    if-eqz v8, :cond_1

    .line 73
    .line 74
    check-cast v1, La/oe80;

    .line 75
    .line 76
    iget-object v0, v1, La/oe80;->a:La/jge0;

    .line 77
    .line 78
    iget v1, v0, La/jge0;->a:F

    .line 79
    .line 80
    cmpg-float v1, v1, v5

    .line 81
    .line 82
    if-gtz v1, :cond_0

    .line 83
    .line 84
    iget v1, v0, La/jge0;->c:F

    .line 85
    .line 86
    cmpg-float v1, v5, v1

    .line 87
    .line 88
    if-gez v1, :cond_0

    .line 89
    .line 90
    iget v1, v0, La/jge0;->b:F

    .line 91
    .line 92
    cmpg-float v1, v1, v4

    .line 93
    .line 94
    if-gtz v1, :cond_0

    .line 95
    .line 96
    iget v0, v0, La/jge0;->d:F

    .line 97
    .line 98
    cmpg-float v0, v4, v0

    .line 99
    .line 100
    if-gez v0, :cond_0

    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_0
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x1

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_1
    instance-of v8, v1, La/pe80;

    .line 111
    .line 112
    if-eqz v8, :cond_9

    .line 113
    .line 114
    check-cast v1, La/pe80;

    .line 115
    .line 116
    iget-object v1, v1, La/pe80;->a:La/wfg0;

    .line 117
    .line 118
    iget v8, v1, La/wfg0;->a:F

    .line 119
    .line 120
    iget-wide v9, v1, La/wfg0;->f:J

    .line 121
    .line 122
    iget-wide v11, v1, La/wfg0;->h:J

    .line 123
    .line 124
    iget-wide v13, v1, La/wfg0;->g:J

    .line 125
    .line 126
    iget v15, v1, La/wfg0;->d:F

    .line 127
    .line 128
    move/from16 p0, v0

    .line 129
    .line 130
    iget v0, v1, La/wfg0;->b:F

    .line 131
    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    iget v2, v1, La/wfg0;->c:F

    .line 135
    .line 136
    move/from16 p1, v4

    .line 137
    .line 138
    const/16 v17, 0x1

    .line 139
    .line 140
    iget-wide v3, v1, La/wfg0;->e:J

    .line 141
    .line 142
    cmpg-float v18, v5, v8

    .line 143
    .line 144
    if-ltz v18, :cond_8

    .line 145
    .line 146
    cmpl-float v18, v5, v2

    .line 147
    .line 148
    if-gez v18, :cond_8

    .line 149
    .line 150
    cmpg-float v18, p1, v0

    .line 151
    .line 152
    if-ltz v18, :cond_8

    .line 153
    .line 154
    cmpl-float v18, p1, v15

    .line 155
    .line 156
    if-ltz v18, :cond_2

    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    :cond_2
    move-wide/from16 v18, v6

    .line 161
    .line 162
    shr-long v6, v3, p0

    .line 163
    .line 164
    long-to-int v6, v6

    .line 165
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    move/from16 p2, v2

    .line 170
    .line 171
    move-wide/from16 v20, v3

    .line 172
    .line 173
    shr-long v2, v9, p0

    .line 174
    .line 175
    long-to-int v2, v2

    .line 176
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    add-float/2addr v3, v7

    .line 181
    invoke-virtual {v1}, La/wfg0;->b()F

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    cmpg-float v3, v3, v4

    .line 186
    .line 187
    if-gtz v3, :cond_7

    .line 188
    .line 189
    shr-long v3, v11, p0

    .line 190
    .line 191
    long-to-int v3, v3

    .line 192
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    move v7, v2

    .line 197
    move/from16 v22, v3

    .line 198
    .line 199
    shr-long v2, v13, p0

    .line 200
    .line 201
    long-to-int v2, v2

    .line 202
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    add-float/2addr v3, v4

    .line 207
    invoke-virtual {v1}, La/wfg0;->b()F

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    cmpg-float v3, v3, v4

    .line 212
    .line 213
    if-gtz v3, :cond_7

    .line 214
    .line 215
    and-long v3, v20, v18

    .line 216
    .line 217
    long-to-int v3, v3

    .line 218
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    and-long v11, v11, v18

    .line 223
    .line 224
    long-to-int v11, v11

    .line 225
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    add-float/2addr v12, v4

    .line 230
    invoke-virtual {v1}, La/wfg0;->a()F

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    cmpg-float v4, v12, v4

    .line 235
    .line 236
    if-gtz v4, :cond_7

    .line 237
    .line 238
    and-long v9, v9, v18

    .line 239
    .line 240
    long-to-int v4, v9

    .line 241
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    and-long v12, v13, v18

    .line 246
    .line 247
    long-to-int v10, v12

    .line 248
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 249
    .line 250
    .line 251
    move-result v12

    .line 252
    add-float/2addr v12, v9

    .line 253
    invoke-virtual {v1}, La/wfg0;->a()F

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    cmpg-float v9, v12, v9

    .line 258
    .line 259
    if-gtz v9, :cond_7

    .line 260
    .line 261
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    add-float/2addr v6, v8

    .line 266
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    add-float/2addr v3, v0

    .line 271
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    sub-float v7, p2, v7

    .line 276
    .line 277
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    add-float/2addr v4, v0

    .line 282
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    sub-float v2, p2, v0

    .line 287
    .line 288
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    sub-float v0, v15, v0

    .line 293
    .line 294
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    sub-float/2addr v15, v9

    .line 299
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    add-float/2addr v9, v8

    .line 304
    cmpg-float v8, v5, v6

    .line 305
    .line 306
    if-gez v8, :cond_3

    .line 307
    .line 308
    cmpg-float v8, p1, v3

    .line 309
    .line 310
    if-gez v8, :cond_3

    .line 311
    .line 312
    iget-wide v9, v1, La/wfg0;->e:J

    .line 313
    .line 314
    move v8, v3

    .line 315
    move v7, v6

    .line 316
    move/from16 v6, p1

    .line 317
    .line 318
    invoke-static/range {v5 .. v10}, La/cww;->y(FFFFJ)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_3
    move/from16 v6, p1

    .line 325
    .line 326
    cmpg-float v3, v5, v9

    .line 327
    .line 328
    if-gez v3, :cond_4

    .line 329
    .line 330
    cmpl-float v3, v6, v15

    .line 331
    .line 332
    if-lez v3, :cond_4

    .line 333
    .line 334
    move v7, v9

    .line 335
    iget-wide v9, v1, La/wfg0;->h:J

    .line 336
    .line 337
    move v8, v15

    .line 338
    invoke-static/range {v5 .. v10}, La/cww;->y(FFFFJ)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    goto :goto_3

    .line 343
    :cond_4
    move v3, v7

    .line 344
    cmpl-float v7, v5, v3

    .line 345
    .line 346
    if-lez v7, :cond_5

    .line 347
    .line 348
    cmpg-float v7, v6, v4

    .line 349
    .line 350
    if-gez v7, :cond_5

    .line 351
    .line 352
    iget-wide v9, v1, La/wfg0;->f:J

    .line 353
    .line 354
    move v7, v3

    .line 355
    move v8, v4

    .line 356
    invoke-static/range {v5 .. v10}, La/cww;->y(FFFFJ)Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    goto :goto_3

    .line 361
    :cond_5
    cmpl-float v3, v5, v2

    .line 362
    .line 363
    if-lez v3, :cond_6

    .line 364
    .line 365
    cmpl-float v3, v6, v0

    .line 366
    .line 367
    if-lez v3, :cond_6

    .line 368
    .line 369
    iget-wide v9, v1, La/wfg0;->g:J

    .line 370
    .line 371
    move v8, v0

    .line 372
    move v7, v2

    .line 373
    invoke-static/range {v5 .. v10}, La/cww;->y(FFFFJ)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    goto :goto_3

    .line 378
    :cond_6
    :goto_0
    move/from16 v0, v17

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_7
    move/from16 v6, p1

    .line 382
    .line 383
    invoke-static {}, La/z03;->a()La/w03;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v0, v1}, La/w03;->b(La/w03;La/wfg0;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v5, v6, v0}, La/cww;->x(FFLa/w03;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    goto :goto_3

    .line 395
    :cond_8
    :goto_1
    move/from16 v0, v16

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_9
    move v6, v4

    .line 399
    const/16 v16, 0x0

    .line 400
    .line 401
    const/16 v17, 0x1

    .line 402
    .line 403
    instance-of v0, v1, La/ne80;

    .line 404
    .line 405
    if-eqz v0, :cond_a

    .line 406
    .line 407
    check-cast v1, La/ne80;

    .line 408
    .line 409
    iget-object v0, v1, La/ne80;->a:La/w03;

    .line 410
    .line 411
    invoke-static {v5, v6, v0}, La/cww;->x(FFLa/w03;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    goto :goto_3

    .line 416
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 417
    .line 418
    .line 419
    return v16

    .line 420
    :cond_b
    :goto_2
    const/16 v16, 0x0

    .line 421
    .line 422
    const/16 v17, 0x1

    .line 423
    .line 424
    goto :goto_0

    .line 425
    :goto_3
    if-eqz v0, :cond_e

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_c
    const/16 v17, 0x1

    .line 429
    .line 430
    :goto_4
    return v17

    .line 431
    :cond_d
    const/16 v16, 0x0

    .line 432
    .line 433
    :cond_e
    return v16
.end method

.method public final J([F)V
    .locals 6

    .line 1
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    invoke-static {v0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, La/s460;->C1(La/j6z;)La/s460;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1, p1}, La/s460;->F1(La/s460;[F)V

    .line 16
    .line 17
    .line 18
    instance-of p0, v0, La/vi30;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    check-cast v0, La/vi30;

    .line 23
    .line 24
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->q([F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    invoke-virtual {v1, v2, v3}, La/s460;->R(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide v2, 0x7fffffff7fffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v2, v0

    .line 42
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long p0, v2, v4

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    const/16 p0, 0x20

    .line 52
    .line 53
    shr-long v2, v0, p0

    .line 54
    .line 55
    long-to-int p0, v2

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const-wide v2, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr v0, v2

    .line 66
    long-to-int v0, v0

    .line 67
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {p1, p0, v0}, La/ui30;->g([FFF)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method public final J0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->Z:La/uj30;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final L0()La/e7z;
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    return-object p0
.end method

.method public final N0()La/uj30;
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->Z:La/uj30;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Asking for measurement result of unmeasured layout modifier"

    .line 7
    .line 8
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final O0()La/c810;
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 2
    .line 3
    return-object p0
.end method

.method public final P0()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/s460;->g1:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final R(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, La/s460;->Y(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 19
    .line 20
    invoke-static {p0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->r(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0
.end method

.method public final T0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/s460;->v1:La/dfv;

    .line 2
    .line 3
    iget-wide v1, p0, La/s460;->g1:J

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v3, p0, La/s460;->h1:F

    .line 8
    .line 9
    invoke-virtual {p0, v1, v2, v3, v0}, La/s460;->l0(JFLa/dfv;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget v0, p0, La/s460;->h1:F

    .line 14
    .line 15
    iget-object v3, p0, La/s460;->z:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-virtual {p0, v1, v2, v0, v3}, La/pu90;->n0(JFLkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final U()La/j6z;
    .locals 4

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    iget-object v1, p0, La/s460;->u:La/e7z;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v3, "\n|"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, " isAttached="

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, La/e7z;->I()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " modifier="

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, v2, La/e7z;->m1:La/mm40;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, " tail="

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, La/s460;->q1()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v1, La/e7z;->h1:La/tzi;

    .line 79
    .line 80
    iget-object p0, p0, La/tzi;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, La/s460;

    .line 83
    .line 84
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 85
    .line 86
    return-object p0
.end method

.method public final V0(La/s460;La/gz40;Z)V
    .locals 5

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, La/s460;->w:La/s460;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, La/s460;->V0(La/s460;La/gz40;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, La/s460;->g1:J

    .line 12
    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget v3, p2, La/gz40;->b:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, La/gz40;->b:F

    .line 23
    .line 24
    iget v3, p2, La/gz40;->d:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, La/gz40;->d:F

    .line 28
    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    iget v1, p2, La/gz40;->c:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, La/gz40;->c:F

    .line 41
    .line 42
    iget v1, p2, La/gz40;->e:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, La/gz40;->e:F

    .line 46
    .line 47
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast v0, La/gfv;

    .line 52
    .line 53
    invoke-virtual {v0}, La/gfv;->a()[F

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v0, v0, La/gfv;->s:Z

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    iput v4, p2, La/gz40;->b:F

    .line 65
    .line 66
    iput v4, p2, La/gz40;->c:F

    .line 67
    .line 68
    iput v4, p2, La/gz40;->d:F

    .line 69
    .line 70
    iput v4, p2, La/gz40;->e:F

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static {v1, p2}, La/ui30;->c([FLa/gz40;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean v0, p0, La/s460;->y:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    iget-wide v0, p0, La/pu90;->c:J

    .line 83
    .line 84
    shr-long p0, v0, p1

    .line 85
    .line 86
    long-to-int p0, p0

    .line 87
    int-to-float p0, p0

    .line 88
    and-long/2addr v0, v2

    .line 89
    long-to-int p1, v0

    .line 90
    int-to-float p1, p1

    .line 91
    invoke-virtual {p2, v4, v4, p0, p1}, La/gz40;->a(FFFF)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public final W0(La/s460;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, La/s460;->w:La/s460;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, La/s460;->W0(La/s460;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, La/s460;->d1(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, La/s460;->d1(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final X0(J)J
    .locals 5

    .line 1
    invoke-virtual {p0}, La/s460;->h1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/s460;->l1:La/jge0;

    .line 8
    .line 9
    iget v1, v0, La/jge0;->c:F

    .line 10
    .line 11
    iget v0, v0, La/jge0;->a:F

    .line 12
    .line 13
    sub-float/2addr v1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v1, v0

    .line 20
    :goto_0
    invoke-virtual {p0}, La/s460;->h1()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, La/s460;->l1:La/jge0;

    .line 27
    .line 28
    iget v0, p0, La/jge0;->d:F

    .line 29
    .line 30
    iget p0, p0, La/jge0;->b:F

    .line 31
    .line 32
    sub-float/2addr v0, p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, La/pu90;->d0()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-float v0, p0

    .line 39
    :goto_1
    const/16 p0, 0x20

    .line 40
    .line 41
    shr-long v2, p1, p0

    .line 42
    .line 43
    long-to-int v2, v2

    .line 44
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    sub-float/2addr v2, v1

    .line 49
    const-wide v3, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr p1, v3

    .line 55
    long-to-int p1, p1

    .line 56
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    sub-float/2addr p1, v0

    .line 61
    const/high16 p2, 0x40000000    # 2.0f

    .line 62
    .line 63
    div-float/2addr v2, p2

    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    div-float/2addr p1, p2

    .line 70
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    int-to-long v0, p2

    .line 79
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    int-to-long p1, p1

    .line 84
    shl-long/2addr v0, p0

    .line 85
    and-long p0, p1, v3

    .line 86
    .line 87
    or-long/2addr p0, v0

    .line 88
    return-wide p0
.end method

.method public final Y(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, La/s460;->q1()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 20
    .line 21
    iget-object v1, v0, La/e7z;->h1:La/tzi;

    .line 22
    .line 23
    iget-object v1, v1, La/tzi;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/s460;

    .line 26
    .line 27
    if-ne p0, v1, :cond_1

    .line 28
    .line 29
    iget-boolean v1, v0, La/e7z;->c:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, La/cg80;->getRectManager()La/oge0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, v0}, La/oge0;->b(La/e7z;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    const-wide v2, 0x7fffffff7fffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, La/ikx;->b(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    invoke-static {p1, p2, v0, v1}, La/x1x;->H(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide p0

    .line 60
    return-wide p0

    .line 61
    :cond_1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast v0, La/gfv;

    .line 66
    .line 67
    invoke-virtual {v0}, La/gfv;->b()[F

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-boolean v0, v0, La/gfv;->s:Z

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-static {p1, p2, v1}, La/ui30;->b(J[F)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    :cond_3
    :goto_1
    iget-wide v0, p0, La/s460;->g1:J

    .line 81
    .line 82
    invoke-static {p1, p2, v0, v1}, La/x1x;->H(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide p1

    .line 86
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    return-wide p1
.end method

.method public final Y0(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, La/pu90;->d0()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, La/s460;->X0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    shr-long v5, p1, v1

    .line 61
    .line 62
    long-to-int p4, v5

    .line 63
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpg-float v6, p4, v5

    .line 69
    .line 70
    if-gez v6, :cond_1

    .line 71
    .line 72
    neg-float p4, p4

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p4, v6

    .line 80
    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    and-long/2addr p1, v3

    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p2, p1, v5

    .line 91
    .line 92
    if-gez p2, :cond_2

    .line 93
    .line 94
    neg-float p0, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, La/pu90;->d0()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-float p0, p0

    .line 101
    sub-float p0, p1, p0

    .line 102
    .line 103
    :goto_1
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    int-to-long p1, p1

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long v6, p0

    .line 117
    shl-long p0, p1, v1

    .line 118
    .line 119
    and-long/2addr v6, v3

    .line 120
    or-long/2addr p0, v6

    .line 121
    cmpl-float p2, v0, v5

    .line 122
    .line 123
    if-gtz p2, :cond_3

    .line 124
    .line 125
    cmpl-float p2, p3, v5

    .line 126
    .line 127
    if-lez p2, :cond_4

    .line 128
    .line 129
    :cond_3
    shr-long v5, p0, v1

    .line 130
    .line 131
    long-to-int p2, v5

    .line 132
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    cmpg-float p4, p4, v0

    .line 137
    .line 138
    if-gtz p4, :cond_4

    .line 139
    .line 140
    and-long/2addr p0, v3

    .line 141
    long-to-int p0, p0

    .line 142
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    cmpg-float p1, p1, p3

    .line 147
    .line 148
    if-gtz p1, :cond_4

    .line 149
    .line 150
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    mul-float/2addr p1, p1

    .line 159
    mul-float/2addr p0, p0

    .line 160
    add-float/2addr p0, p1

    .line 161
    return p0

    .line 162
    :cond_4
    return v2
.end method

.method public final Z0(La/x5a;La/dfv;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast v0, La/gfv;

    .line 6
    .line 7
    iget-object p0, v0, La/gfv;->m:La/a6a;

    .line 8
    .line 9
    invoke-virtual {v0}, La/gfv;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/gfv;->a:La/dfv;

    .line 13
    .line 14
    iget-object v1, v1, La/dfv;->a:La/ffv;

    .line 15
    .line 16
    invoke-interface {v1}, La/ffv;->T()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    cmpl-float v1, v1, v2

    .line 22
    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    iput-boolean v1, v0, La/gfv;->t:Z

    .line 29
    .line 30
    iget-object v1, p0, La/a6a;->b:La/nr;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, La/nr;->E(La/x5a;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, v1, La/nr;->c:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object p1, v0, La/gfv;->a:La/dfv;

    .line 38
    .line 39
    invoke-static {p0, p1}, La/agc;->I(La/fhl;La/dfv;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-wide v0, p0, La/s460;->g1:J

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    .line 47
    shr-long v2, v0, v2

    .line 48
    .line 49
    long-to-int v2, v2

    .line 50
    int-to-float v2, v2

    .line 51
    const-wide v3, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v0, v3

    .line 57
    long-to-int v0, v0

    .line 58
    int-to-float v0, v0

    .line 59
    invoke-interface {p1, v2, v0}, La/x5a;->g(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, La/s460;->a1(La/x5a;La/dfv;)V

    .line 63
    .line 64
    .line 65
    neg-float p0, v2

    .line 66
    neg-float p2, v0

    .line 67
    invoke-interface {p1, p0, p2}, La/x5a;->g(FF)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final a1(La/x5a;La/dfv;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, La/s460;->i1(I)La/lm40;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/s460;->w1(La/x5a;La/dfv;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, La/s460;->u:La/e7z;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, La/h7z;->a(La/e7z;)La/cg80;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, La/cg80;->getSharedDrawScope()La/g7z;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, La/pu90;->c:J

    .line 26
    .line 27
    invoke-static {v4, v5}, La/n2x;->Q(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v10, v2

    .line 36
    :goto_0
    if-eqz v1, :cond_8

    .line 37
    .line 38
    instance-of v4, v1, La/ehl;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    move-object v8, v1

    .line 43
    check-cast v8, La/ehl;

    .line 44
    .line 45
    move-object v7, p0

    .line 46
    move-object v4, p1

    .line 47
    move-object v9, p2

    .line 48
    invoke-virtual/range {v3 .. v9}, La/g7z;->b(La/x5a;JLa/s460;La/ehl;La/dfv;)V

    .line 49
    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_1
    move-object v7, p0

    .line 53
    move-object v4, p1

    .line 54
    move-object v9, p2

    .line 55
    iget p0, v1, La/lm40;->c:I

    .line 56
    .line 57
    and-int/2addr p0, v0

    .line 58
    if-eqz p0, :cond_7

    .line 59
    .line 60
    instance-of p0, v1, La/f3k;

    .line 61
    .line 62
    if-eqz p0, :cond_7

    .line 63
    .line 64
    move-object p0, v1

    .line 65
    check-cast p0, La/f3k;

    .line 66
    .line 67
    iget-object p0, p0, La/f3k;->p:La/lm40;

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    :goto_1
    const/4 p2, 0x1

    .line 71
    if-eqz p0, :cond_6

    .line 72
    .line 73
    iget v8, p0, La/lm40;->c:I

    .line 74
    .line 75
    and-int/2addr v8, v0

    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    if-ne p1, p2, :cond_2

    .line 81
    .line 82
    move-object v1, p0

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    if-nez v10, :cond_3

    .line 85
    .line 86
    new-instance v10, La/xz40;

    .line 87
    .line 88
    const/16 p2, 0x10

    .line 89
    .line 90
    new-array p2, p2, [La/lm40;

    .line 91
    .line 92
    invoke-direct {v10, p2}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    if-eqz v1, :cond_4

    .line 96
    .line 97
    invoke-virtual {v10, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v1, v2

    .line 101
    :cond_4
    invoke-virtual {v10, p0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_2
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    if-ne p1, p2, :cond_7

    .line 108
    .line 109
    :goto_3
    move-object p1, v4

    .line 110
    move-object p0, v7

    .line 111
    move-object p2, v9

    .line 112
    goto :goto_0

    .line 113
    :cond_7
    :goto_4
    invoke-static {v10}, La/vcc;->V(La/xz40;)La/lm40;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_3

    .line 118
    :cond_8
    return-void
.end method

.method public abstract b1()V
.end method

.method public final c1(La/s460;)La/s460;
    .locals 5

    .line 1
    iget-object v0, p1, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object v1, p0, La/s460;->u:La/e7z;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, La/s460;->g1()La/lm40;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, La/lm40;->a:La/lm40;

    .line 16
    .line 17
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, La/xcx;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, La/lm40;->a:La/lm40;

    .line 27
    .line 28
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, La/lm40;->c:I

    .line 33
    .line 34
    and-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-ne v1, v0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, La/e7z;->q:I

    .line 45
    .line 46
    iget v3, v1, La/e7z;->q:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    :goto_2
    iget v3, v2, La/e7z;->q:I

    .line 60
    .line 61
    iget v4, v0, La/e7z;->q:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const-string p0, "layouts are not part of the same hierarchy"

    .line 89
    .line 90
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_6
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    return-object p0

    .line 98
    :cond_8
    iget-object p0, p1, La/s460;->u:La/e7z;

    .line 99
    .line 100
    if-ne v0, p0, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p0, v0, La/e7z;->h1:La/tzi;

    .line 104
    .line 105
    iget-object p0, p0, La/tzi;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, La/rdx;

    .line 108
    .line 109
    return-object p0
.end method

.method public final d1(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, La/s460;->g1:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long v3, p1, v2

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    shr-long v4, v0, v2

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    int-to-float v4, v4

    .line 16
    sub-float/2addr v3, v4

    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v4

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p1, p2

    .line 32
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    int-to-long v0, p2

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    shl-long/2addr v0, v2

    .line 43
    and-long/2addr p1, v4

    .line 44
    or-long/2addr p1, v0

    .line 45
    iget-object p0, p0, La/s460;->u1:La/bg80;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p0, La/gfv;

    .line 50
    .line 51
    invoke-virtual {p0}, La/gfv;->a()[F

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-wide p0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    return-wide p0

    .line 63
    :cond_0
    iget-boolean p0, p0, La/gfv;->s:Z

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1, p2, v0}, La/ui30;->b(J[F)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    return-wide p0

    .line 73
    :cond_2
    :goto_0
    return-wide p1
.end method

.method public abstract e1()La/e810;
.end method

.method public final f1()J
    .locals 3

    .line 1
    iget-object v0, p0, La/s460;->A:La/w6k;

    .line 2
    .line 3
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 4
    .line 5
    iget-object p0, p0, La/e7z;->B:La/wgu0;

    .line 6
    .line 7
    invoke-interface {p0}, La/wgu0;->f()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, La/w6k;->G0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/pu90;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract g1()La/lm40;
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object p0, p0, La/e7z;->z:La/w6k;

    .line 4
    .line 5
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final getLayoutDirection()La/k6z;
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object p0, p0, La/e7z;->A:La/k6z;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 6
    .line 7
    return p0
.end method

.method public final h0()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/s460;->x:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 10
    .line 11
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final h1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La/s460;->n1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/s460;->l1:La/jge0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/jge0;->j()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final i1(I)La/lm40;
    .locals 2

    .line 1
    invoke-static {p1}, La/t460;->g(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, La/s460;->j1(Z)La/lm40;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    iget v0, p0, La/lm40;->d:I

    .line 24
    .line 25
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v0, p0, La/lm40;->c:I

    .line 29
    .line 30
    and-int/2addr v0, p1

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public final j(La/j6z;[F)V
    .locals 1

    .line 1
    invoke-static {p1}, La/s460;->C1(La/j6z;)La/s460;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/s460;->q1()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/s460;->c1(La/s460;)La/s460;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2}, La/ui30;->d([F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, La/s460;->F1(La/s460;[F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p2}, La/s460;->E1(La/s460;[F)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final j1(Z)La/lm40;
    .locals 2

    .line 1
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object v0, v0, La/e7z;->h1:La/tzi;

    .line 4
    .line 5
    iget-object v1, v0, La/tzi;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/s460;

    .line 8
    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, La/tzi;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/lm40;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public final k1(La/lm40;La/r460;JLa/raw;IZ)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, La/s460;->n1(La/r460;JLa/raw;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p2, p1}, La/r460;->e(La/lm40;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, La/r460;->b()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1, v0}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual/range {p0 .. p7}, La/s460;->k1(La/lm40;La/r460;JLa/raw;IZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget v0, p5, La/raw;->c:I

    .line 32
    .line 33
    iget-object v1, p5, La/raw;->a:La/vy40;

    .line 34
    .line 35
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    iget v3, v1, La/vy40;->b:I

    .line 38
    .line 39
    invoke-virtual {p5, v2, v3}, La/raw;->c(II)V

    .line 40
    .line 41
    .line 42
    iget v2, p5, La/raw;->c:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    iput v2, p5, La/raw;->c:I

    .line 47
    .line 48
    invoke-virtual {v1, p1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p5, La/raw;->b:La/iy40;

    .line 52
    .line 53
    const/high16 v2, -0x40800000    # -1.0f

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v2, p7, v3}, La/vtb;->l(FZZ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, La/iy40;->a(J)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, La/r460;->b()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {p1, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual/range {p0 .. p7}, La/s460;->k1(La/lm40;La/r460;JLa/raw;IZ)V

    .line 72
    .line 73
    .line 74
    iput v0, p5, La/raw;->c:I

    .line 75
    .line 76
    return-void
.end method

.method public l0(JFLa/dfv;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v5, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, La/s460;->x1(JFLkotlin/jvm/functions/Function1;La/dfv;)V

    .line 7
    .line 8
    .line 9
    iget-boolean p0, v0, La/c810;->n:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, v0, La/s460;->u:La/e7z;

    .line 15
    .line 16
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 17
    .line 18
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 19
    .line 20
    invoke-virtual {p0}, La/sj30;->H0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final l1(La/lm40;La/r460;JLa/raw;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, La/s460;->n1(La/r460;JLa/raw;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p2, p1}, La/r460;->e(La/lm40;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, La/r460;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v0, p0

    .line 31
    move-object v2, p2

    .line 32
    move-wide v3, p3

    .line 33
    move-object/from16 v5, p5

    .line 34
    .line 35
    move/from16 v6, p6

    .line 36
    .line 37
    move/from16 v7, p7

    .line 38
    .line 39
    move/from16 v8, p8

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v8}, La/s460;->l1(La/lm40;La/r460;JLa/raw;IZF)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v5, p5

    .line 46
    .line 47
    iget v10, v5, La/raw;->c:I

    .line 48
    .line 49
    iget-object v0, v5, La/raw;->a:La/vy40;

    .line 50
    .line 51
    add-int/lit8 v1, v10, 0x1

    .line 52
    .line 53
    iget v2, v0, La/vy40;->b:I

    .line 54
    .line 55
    invoke-virtual {v5, v1, v2}, La/raw;->c(II)V

    .line 56
    .line 57
    .line 58
    iget v1, v5, La/raw;->c:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    iput v1, v5, La/raw;->c:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, La/raw;->b:La/iy40;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    move/from16 v7, p7

    .line 71
    .line 72
    move/from16 v8, p8

    .line 73
    .line 74
    invoke-static {v8, v7, v1}, La/vtb;->l(FZZ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-virtual {v0, v1, v2}, La/iy40;->a(J)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, La/r460;->b()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {p1, v0}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v9, 0x1

    .line 90
    move-object v0, p0

    .line 91
    move-object v2, p2

    .line 92
    move-wide v3, p3

    .line 93
    move/from16 v6, p6

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 96
    .line 97
    .line 98
    iput v10, v5, La/raw;->c:I

    .line 99
    .line 100
    return-void
.end method

.method public final m(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, La/s460;->u:La/e7z;

    .line 19
    .line 20
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->B()V

    .line 27
    .line 28
    .line 29
    iget-object v1, v1, Landroidx/compose/ui/platform/AndroidComposeView;->z1:[F

    .line 30
    .line 31
    invoke-static {p1, p2, v1}, La/ui30;->b(J[F)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    invoke-interface {v0, v1, v2}, La/j6z;->Y(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {p1, p2, v1, v2}, La/ne60;->e(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    invoke-virtual {p0, v0, p1, p2}, La/s460;->F(La/j6z;J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    return-wide p0
.end method

.method public final m1(La/r460;JLa/raw;IZ)V
    .locals 15

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    iget-object v8, v5, La/raw;->a:La/vy40;

    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, La/r460;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, La/s460;->i1(I)La/lm40;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v3, v4}, La/s460;->I1(J)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/high16 v10, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 23
    .line 24
    const v11, 0x7fffffff

    .line 25
    .line 26
    .line 27
    const/4 v12, 0x1

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    if-ne v6, v12, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, La/s460;->f1()J

    .line 33
    .line 34
    .line 35
    move-result-wide v13

    .line 36
    invoke-virtual {p0, v3, v4, v13, v14}, La/s460;->Y0(JJ)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    and-int/2addr v2, v11

    .line 45
    if-ge v2, v10, :cond_1

    .line 46
    .line 47
    iget v2, v5, La/raw;->c:I

    .line 48
    .line 49
    iget v7, v8, La/vy40;->b:I

    .line 50
    .line 51
    sub-int/2addr v7, v12

    .line 52
    if-ne v2, v7, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v9, v9}, La/vtb;->l(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, La/raw;->b()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, La/acb;->N(JJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_1

    .line 68
    .line 69
    :goto_0
    const/4 v7, 0x0

    .line 70
    move-object/from16 v2, p1

    .line 71
    .line 72
    move v8, v0

    .line 73
    move-object v0, p0

    .line 74
    invoke-virtual/range {v0 .. v8}, La/s460;->l1(La/lm40;La/r460;JLa/raw;IZF)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void

    .line 78
    :cond_2
    if-nez v1, :cond_3

    .line 79
    .line 80
    invoke-virtual/range {p0 .. p6}, La/s460;->n1(La/r460;JLa/raw;IZ)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    const/16 v0, 0x20

    .line 85
    .line 86
    shr-long v2, p2, v0

    .line 87
    .line 88
    long-to-int v0, v2

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const-wide v2, 0xffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long v2, p2, v2

    .line 99
    .line 100
    long-to-int v2, v2

    .line 101
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    const/4 v3, 0x0

    .line 106
    cmpl-float v4, v0, v3

    .line 107
    .line 108
    if-ltz v4, :cond_4

    .line 109
    .line 110
    cmpl-float v3, v2, v3

    .line 111
    .line 112
    if-ltz v3, :cond_4

    .line 113
    .line 114
    invoke-virtual {p0}, La/pu90;->e0()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    int-to-float v3, v3

    .line 119
    cmpg-float v0, v0, v3

    .line 120
    .line 121
    if-gez v0, :cond_4

    .line 122
    .line 123
    invoke-virtual {p0}, La/pu90;->d0()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    int-to-float v0, v0

    .line 128
    cmpg-float v0, v2, v0

    .line 129
    .line 130
    if-gez v0, :cond_4

    .line 131
    .line 132
    move-object v0, p0

    .line 133
    move-object/from16 v2, p1

    .line 134
    .line 135
    move-wide/from16 v3, p2

    .line 136
    .line 137
    move-object/from16 v5, p4

    .line 138
    .line 139
    move/from16 v6, p5

    .line 140
    .line 141
    move/from16 v7, p6

    .line 142
    .line 143
    invoke-virtual/range {v0 .. v7}, La/s460;->k1(La/lm40;La/r460;JLa/raw;IZ)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_4
    move-wide/from16 v3, p2

    .line 148
    .line 149
    move-object/from16 v5, p4

    .line 150
    .line 151
    move/from16 v6, p5

    .line 152
    .line 153
    if-ne v6, v12, :cond_5

    .line 154
    .line 155
    invoke-virtual {p0}, La/s460;->f1()J

    .line 156
    .line 157
    .line 158
    move-result-wide v13

    .line 159
    invoke-virtual {p0, v3, v4, v13, v14}, La/s460;->Y0(JJ)F

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    goto :goto_1

    .line 164
    :cond_5
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 165
    .line 166
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    and-int/2addr v7, v11

    .line 171
    if-ge v7, v10, :cond_8

    .line 172
    .line 173
    iget v7, v5, La/raw;->c:I

    .line 174
    .line 175
    iget v8, v8, La/vy40;->b:I

    .line 176
    .line 177
    sub-int/2addr v8, v12

    .line 178
    if-ne v7, v8, :cond_6

    .line 179
    .line 180
    move/from16 v7, p6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move/from16 v7, p6

    .line 184
    .line 185
    invoke-static {v2, v7, v9}, La/vtb;->l(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v10

    .line 189
    invoke-virtual {v5}, La/raw;->b()J

    .line 190
    .line 191
    .line 192
    move-result-wide v13

    .line 193
    invoke-static {v13, v14, v10, v11}, La/acb;->N(JJ)I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-lez v8, :cond_7

    .line 198
    .line 199
    :goto_2
    move v9, v12

    .line 200
    :cond_7
    :goto_3
    move-object v0, p0

    .line 201
    move v8, v2

    .line 202
    move-object/from16 v2, p1

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_8
    move/from16 v7, p6

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :goto_4
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public final n()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object v1, v0, La/e7z;->h1:La/tzi;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, La/tzi;->j(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 15
    .line 16
    .line 17
    new-instance p0, La/mie0;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, La/e7z;->h1:La/tzi;

    .line 23
    .line 24
    iget-object v1, v1, La/tzi;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/wso0;

    .line 27
    .line 28
    :goto_0
    if-eqz v1, :cond_8

    .line 29
    .line 30
    iget v4, v1, La/lm40;->c:I

    .line 31
    .line 32
    and-int/2addr v4, v2

    .line 33
    if-eqz v4, :cond_7

    .line 34
    .line 35
    move-object v4, v1

    .line 36
    move-object v5, v3

    .line 37
    :goto_1
    if-eqz v4, :cond_7

    .line 38
    .line 39
    instance-of v6, v4, La/fp80;

    .line 40
    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    check-cast v4, La/fp80;

    .line 44
    .line 45
    iget-object v6, v0, La/e7z;->z:La/w6k;

    .line 46
    .line 47
    iget-object v7, p0, La/mie0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {v4, v6, v7}, La/fp80;->m(La/w6k;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iput-object v4, p0, La/mie0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_0
    iget v6, v4, La/lm40;->c:I

    .line 57
    .line 58
    and-int/2addr v6, v2

    .line 59
    if-eqz v6, :cond_6

    .line 60
    .line 61
    instance-of v6, v4, La/f3k;

    .line 62
    .line 63
    if-eqz v6, :cond_6

    .line 64
    .line 65
    move-object v6, v4

    .line 66
    check-cast v6, La/f3k;

    .line 67
    .line 68
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    :goto_2
    const/4 v8, 0x1

    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    iget v9, v6, La/lm40;->c:I

    .line 75
    .line 76
    and-int/2addr v9, v2

    .line 77
    if-eqz v9, :cond_4

    .line 78
    .line 79
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    if-ne v7, v8, :cond_1

    .line 82
    .line 83
    move-object v4, v6

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    if-nez v5, :cond_2

    .line 86
    .line 87
    new-instance v5, La/xz40;

    .line 88
    .line 89
    const/16 v8, 0x10

    .line 90
    .line 91
    new-array v8, v8, [La/lm40;

    .line 92
    .line 93
    invoke-direct {v5, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    if-eqz v4, :cond_3

    .line 97
    .line 98
    invoke-virtual {v5, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object v4, v3

    .line 102
    :cond_3
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    :goto_3
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    if-ne v7, v8, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    :goto_4
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    goto :goto_1

    .line 116
    :cond_7
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_9
    return-object v3
.end method

.method public n1(La/r460;JLa/raw;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->v:La/s460;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, La/s460;->d1(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-virtual/range {p0 .. p6}, La/s460;->m1(La/r460;JLa/raw;IZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final o1()V
    .locals 1

    .line 1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, La/gfv;

    .line 6
    .line 7
    invoke-virtual {v0}, La/gfv;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, La/s460;->o1()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final p1()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, La/s460;->Y:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, La/s460;->p1()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final q1()V
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 4
    .line 5
    invoke-virtual {p0}, La/i7z;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r1()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, La/t460;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, La/s460;->j1(Z)La/lm40;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, La/lm40;->a:La/lm40;

    .line 14
    .line 15
    iget v2, v2, La/lm40;->d:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v4, v3

    .line 33
    :goto_0
    invoke-static {v2}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, La/lm40;->e:La/lm40;

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, La/s460;->j1(Z)La/lm40;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, La/lm40;->d:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, La/lm40;->c:I

    .line 69
    .line 70
    and-int/2addr v7, v0

    .line 71
    if-eqz v7, :cond_a

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    move-object v8, v3

    .line 75
    :goto_3
    if-eqz v7, :cond_a

    .line 76
    .line 77
    instance-of v9, v7, La/xj30;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, La/xj30;

    .line 82
    .line 83
    iget-wide v9, p0, La/pu90;->c:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, La/xj30;->a(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, La/lm40;->c:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, La/f3k;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, La/f3k;

    .line 100
    .line 101
    iget-object v9, v9, La/f3k;->p:La/lm40;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_4
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_8

    .line 106
    .line 107
    iget v12, v9, La/lm40;->c:I

    .line 108
    .line 109
    and-int/2addr v12, v0

    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    add-int/lit8 v10, v10, 0x1

    .line 113
    .line 114
    if-ne v10, v11, :cond_4

    .line 115
    .line 116
    move-object v7, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    if-nez v8, :cond_5

    .line 119
    .line 120
    new-instance v8, La/xz40;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [La/lm40;

    .line 125
    .line 126
    invoke-direct {v8, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, La/xz40;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, La/lm40;->f:La/lm40;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    if-ne v10, v11, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    :goto_6
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v1, v6, :cond_b

    .line 150
    .line 151
    iget-object v1, v1, La/lm40;->f:La/lm40;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_c
    return-void
.end method

.method public final s1()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, La/t460;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, La/s460;->j1(Z)La/lm40;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, La/lm40;->d:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, La/lm40;->c:I

    .line 32
    .line 33
    and-int/2addr v3, v0

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v4, v1

    .line 38
    move-object v5, v3

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    instance-of v6, v4, La/g6z;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, La/g6z;

    .line 46
    .line 47
    invoke-interface {v4, p0}, La/g6z;->N(La/j6z;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, La/lm40;->c:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, La/f3k;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, La/f3k;

    .line 62
    .line 63
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    iget v9, v6, La/lm40;->c:I

    .line 70
    .line 71
    and-int/2addr v9, v0

    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v8, :cond_3

    .line 77
    .line 78
    move-object v4, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    new-instance v5, La/xz40;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [La/lm40;

    .line 87
    .line 88
    invoke-direct {v5, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    if-ne v7, v8, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    :goto_5
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_2

    .line 111
    :cond_9
    if-eq v1, v2, :cond_a

    .line 112
    .line 113
    iget-object v1, v1, La/lm40;->f:La/lm40;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final t1()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/s460;->x:Z

    .line 3
    .line 4
    iget-object v0, p0, La/s460;->s1:La/p460;

    .line 5
    .line 6
    invoke-virtual {v0}, La/p460;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/s460;->z1()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, La/s460;->g1:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/ikx;->b(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/e7z;->O(La/s460;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final u1()V
    .locals 9

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, La/t460;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, La/s460;->j1(Z)La/lm40;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_a

    .line 12
    .line 13
    iget-object v2, v2, La/lm40;->a:La/lm40;

    .line 14
    .line 15
    iget v2, v2, La/lm40;->d:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_a

    .line 19
    .line 20
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, La/s460;->j1(Z)La/lm40;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_1
    if-eqz p0, :cond_a

    .line 38
    .line 39
    iget v1, p0, La/lm40;->d:I

    .line 40
    .line 41
    and-int/2addr v1, v0

    .line 42
    if-eqz v1, :cond_a

    .line 43
    .line 44
    iget v1, p0, La/lm40;->c:I

    .line 45
    .line 46
    and-int/2addr v1, v0

    .line 47
    if-eqz v1, :cond_9

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    move-object v3, p0

    .line 51
    move-object v4, v1

    .line 52
    :goto_2
    if-eqz v3, :cond_9

    .line 53
    .line 54
    instance-of v5, v3, La/nqq;

    .line 55
    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    check-cast v3, La/nqq;

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_2
    iget v5, v3, La/lm40;->c:I

    .line 62
    .line 63
    and-int/2addr v5, v0

    .line 64
    if-eqz v5, :cond_8

    .line 65
    .line 66
    instance-of v5, v3, La/f3k;

    .line 67
    .line 68
    if-eqz v5, :cond_8

    .line 69
    .line 70
    move-object v5, v3

    .line 71
    check-cast v5, La/f3k;

    .line 72
    .line 73
    iget-object v5, v5, La/f3k;->p:La/lm40;

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    :goto_3
    const/4 v7, 0x1

    .line 77
    if-eqz v5, :cond_7

    .line 78
    .line 79
    iget v8, v5, La/lm40;->c:I

    .line 80
    .line 81
    and-int/2addr v8, v0

    .line 82
    if-eqz v8, :cond_6

    .line 83
    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    if-ne v6, v7, :cond_3

    .line 87
    .line 88
    move-object v3, v5

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    if-nez v4, :cond_4

    .line 91
    .line 92
    new-instance v4, La/xz40;

    .line 93
    .line 94
    const/16 v7, 0x10

    .line 95
    .line 96
    new-array v7, v7, [La/lm40;

    .line 97
    .line 98
    invoke-direct {v4, v7}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    if-eqz v3, :cond_5

    .line 102
    .line 103
    invoke-virtual {v4, v3}, La/xz40;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v3, v1

    .line 107
    :cond_5
    invoke-virtual {v4, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_6
    :goto_4
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    if-ne v6, v7, :cond_8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    :goto_5
    invoke-static {v4}, La/vcc;->V(La/xz40;)La/lm40;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_2

    .line 121
    :cond_9
    if-eq p0, v2, :cond_a

    .line 122
    .line 123
    iget-object p0, p0, La/lm40;->f:La/lm40;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_a
    :goto_6
    return-void
.end method

.method public final v0()F
    .locals 0

    .line 1
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    iget-object p0, p0, La/e7z;->z:La/w6k;

    .line 4
    .line 5
    invoke-interface {p0}, La/w6k;->v0()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final v1(La/lm40;La/r460;JLa/raw;IZFZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v5, p5

    .line 4
    .line 5
    iget-object v8, v5, La/raw;->a:La/vy40;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    move-wide/from16 v3, p3

    .line 14
    .line 15
    move/from16 v6, p6

    .line 16
    .line 17
    move/from16 v7, p7

    .line 18
    .line 19
    invoke-virtual/range {v1 .. v7}, La/s460;->n1(La/r460;JLa/raw;IZ)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    move-object/from16 v2, p2

    .line 24
    .line 25
    invoke-interface {v2, v0}, La/r460;->e(La/lm40;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v2}, La/r460;->b()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object/from16 v0, p0

    .line 40
    .line 41
    move-wide/from16 v3, p3

    .line 42
    .line 43
    move-object/from16 v5, p5

    .line 44
    .line 45
    move/from16 v6, p6

    .line 46
    .line 47
    move/from16 v7, p7

    .line 48
    .line 49
    move/from16 v8, p8

    .line 50
    .line 51
    move/from16 v9, p9

    .line 52
    .line 53
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    move-object/from16 v5, p5

    .line 58
    .line 59
    move/from16 v6, p6

    .line 60
    .line 61
    move/from16 v7, p7

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    if-ne v6, v1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 v1, 0x4

    .line 68
    if-ne v6, v1, :cond_12

    .line 69
    .line 70
    :goto_0
    const/4 v1, 0x0

    .line 71
    move-object v2, v0

    .line 72
    move-object v3, v1

    .line 73
    :goto_1
    if-eqz v2, :cond_12

    .line 74
    .line 75
    instance-of v4, v2, La/gpa0;

    .line 76
    .line 77
    const/4 v10, 0x1

    .line 78
    if-eqz v4, :cond_b

    .line 79
    .line 80
    check-cast v2, La/gpa0;

    .line 81
    .line 82
    invoke-interface {v2}, La/gpa0;->d0()J

    .line 83
    .line 84
    .line 85
    move-result-wide v1

    .line 86
    const/16 v3, 0x20

    .line 87
    .line 88
    shr-long v3, p3, v3

    .line 89
    .line 90
    long-to-int v3, v3

    .line 91
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    move-object/from16 v9, p0

    .line 96
    .line 97
    iget-object v11, v9, La/s460;->u:La/e7z;

    .line 98
    .line 99
    iget-object v12, v11, La/e7z;->A:La/k6z;

    .line 100
    .line 101
    sget v13, La/dwr0;->b:I

    .line 102
    .line 103
    const-wide/high16 v13, -0x8000000000000000L

    .line 104
    .line 105
    and-long/2addr v13, v1

    .line 106
    const-wide/16 v15, 0x0

    .line 107
    .line 108
    cmp-long v13, v13, v15

    .line 109
    .line 110
    if-eqz v13, :cond_3

    .line 111
    .line 112
    sget-object v15, La/k6z;->a:La/k6z;

    .line 113
    .line 114
    if-ne v12, v15, :cond_4

    .line 115
    .line 116
    :cond_3
    const/16 v12, 0x1e

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    const/16 v12, 0x1e

    .line 120
    .line 121
    shr-long v14, v1, v12

    .line 122
    .line 123
    long-to-int v14, v14

    .line 124
    :goto_2
    and-int/lit16 v14, v14, 0x7fff

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :goto_3
    long-to-int v14, v1

    .line 128
    goto :goto_2

    .line 129
    :goto_4
    neg-int v14, v14

    .line 130
    int-to-float v14, v14

    .line 131
    cmpl-float v4, v4, v14

    .line 132
    .line 133
    if-ltz v4, :cond_12

    .line 134
    .line 135
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-virtual {v9}, La/pu90;->e0()I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    iget-object v11, v11, La/e7z;->A:La/k6z;

    .line 144
    .line 145
    if-eqz v13, :cond_6

    .line 146
    .line 147
    sget-object v13, La/k6z;->a:La/k6z;

    .line 148
    .line 149
    if-ne v11, v13, :cond_5

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_5
    long-to-int v11, v1

    .line 153
    :goto_5
    and-int/lit16 v11, v11, 0x7fff

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_6
    :goto_6
    shr-long v11, v1, v12

    .line 157
    .line 158
    long-to-int v11, v11

    .line 159
    goto :goto_5

    .line 160
    :goto_7
    add-int/2addr v4, v11

    .line 161
    int-to-float v4, v4

    .line 162
    cmpg-float v3, v3, v4

    .line 163
    .line 164
    if-gez v3, :cond_12

    .line 165
    .line 166
    const-wide v3, 0xffffffffL

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    and-long v3, p3, v3

    .line 172
    .line 173
    long-to-int v3, v3

    .line 174
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    const/16 v11, 0xf

    .line 179
    .line 180
    shr-long v11, v1, v11

    .line 181
    .line 182
    long-to-int v11, v11

    .line 183
    and-int/lit16 v11, v11, 0x7fff

    .line 184
    .line 185
    neg-int v11, v11

    .line 186
    int-to-float v11, v11

    .line 187
    cmpl-float v4, v4, v11

    .line 188
    .line 189
    if-ltz v4, :cond_12

    .line 190
    .line 191
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    invoke-virtual {v9}, La/pu90;->d0()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    const/16 v11, 0x2d

    .line 200
    .line 201
    shr-long/2addr v1, v11

    .line 202
    long-to-int v1, v1

    .line 203
    and-int/lit16 v1, v1, 0x7fff

    .line 204
    .line 205
    add-int/2addr v1, v4

    .line 206
    int-to-float v1, v1

    .line 207
    cmpg-float v1, v3, v1

    .line 208
    .line 209
    if-gez v1, :cond_12

    .line 210
    .line 211
    iget-object v1, v5, La/raw;->b:La/iy40;

    .line 212
    .line 213
    iget v11, v5, La/raw;->c:I

    .line 214
    .line 215
    iget v2, v8, La/vy40;->b:I

    .line 216
    .line 217
    add-int/lit8 v3, v2, -0x1

    .line 218
    .line 219
    const/4 v12, 0x0

    .line 220
    if-ne v11, v3, :cond_7

    .line 221
    .line 222
    add-int/lit8 v3, v11, 0x1

    .line 223
    .line 224
    invoke-virtual {v5, v3, v2}, La/raw;->c(II)V

    .line 225
    .line 226
    .line 227
    iget v2, v5, La/raw;->c:I

    .line 228
    .line 229
    add-int/2addr v2, v10

    .line 230
    iput v2, v5, La/raw;->c:I

    .line 231
    .line 232
    invoke-virtual {v8, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v12, v7, v10}, La/vtb;->l(FZZ)J

    .line 236
    .line 237
    .line 238
    move-result-wide v2

    .line 239
    invoke-virtual {v1, v2, v3}, La/iy40;->a(J)V

    .line 240
    .line 241
    .line 242
    invoke-interface/range {p2 .. p2}, La/r460;->b()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    move-object/from16 v2, p2

    .line 251
    .line 252
    move-wide/from16 v3, p3

    .line 253
    .line 254
    move/from16 v8, p8

    .line 255
    .line 256
    move-object v0, v9

    .line 257
    move/from16 v9, p9

    .line 258
    .line 259
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 260
    .line 261
    .line 262
    iput v11, v5, La/raw;->c:I

    .line 263
    .line 264
    return-void

    .line 265
    :cond_7
    invoke-virtual {v5}, La/raw;->b()J

    .line 266
    .line 267
    .line 268
    move-result-wide v2

    .line 269
    iget v11, v5, La/raw;->c:I

    .line 270
    .line 271
    invoke-static {v2, v3}, La/acb;->T(J)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_9

    .line 276
    .line 277
    iget v2, v8, La/vy40;->b:I

    .line 278
    .line 279
    add-int/lit8 v13, v2, -0x1

    .line 280
    .line 281
    iput v13, v5, La/raw;->c:I

    .line 282
    .line 283
    iget v3, v8, La/vy40;->b:I

    .line 284
    .line 285
    invoke-virtual {v5, v2, v3}, La/raw;->c(II)V

    .line 286
    .line 287
    .line 288
    iget v2, v5, La/raw;->c:I

    .line 289
    .line 290
    add-int/2addr v2, v10

    .line 291
    iput v2, v5, La/raw;->c:I

    .line 292
    .line 293
    invoke-virtual {v8, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v12, v7, v10}, La/vtb;->l(FZZ)J

    .line 297
    .line 298
    .line 299
    move-result-wide v2

    .line 300
    invoke-virtual {v1, v2, v3}, La/iy40;->a(J)V

    .line 301
    .line 302
    .line 303
    invoke-interface/range {p2 .. p2}, La/r460;->b()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    move-object/from16 v0, p0

    .line 312
    .line 313
    move-object/from16 v2, p2

    .line 314
    .line 315
    move-wide/from16 v3, p3

    .line 316
    .line 317
    move/from16 v6, p6

    .line 318
    .line 319
    move/from16 v8, p8

    .line 320
    .line 321
    move/from16 v9, p9

    .line 322
    .line 323
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 324
    .line 325
    .line 326
    iput v13, v5, La/raw;->c:I

    .line 327
    .line 328
    invoke-virtual {v5}, La/raw;->b()J

    .line 329
    .line 330
    .line 331
    move-result-wide v0

    .line 332
    invoke-static {v0, v1}, La/acb;->R(J)F

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    cmpg-float v0, v0, v12

    .line 337
    .line 338
    if-gez v0, :cond_8

    .line 339
    .line 340
    add-int/lit8 v0, v11, 0x1

    .line 341
    .line 342
    iget v1, v5, La/raw;->c:I

    .line 343
    .line 344
    add-int/2addr v1, v10

    .line 345
    invoke-virtual {v5, v0, v1}, La/raw;->c(II)V

    .line 346
    .line 347
    .line 348
    :cond_8
    iput v11, v5, La/raw;->c:I

    .line 349
    .line 350
    return-void

    .line 351
    :cond_9
    invoke-static {v2, v3}, La/acb;->R(J)F

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    cmpl-float v2, v2, v12

    .line 356
    .line 357
    if-lez v2, :cond_a

    .line 358
    .line 359
    iget v11, v5, La/raw;->c:I

    .line 360
    .line 361
    add-int/lit8 v2, v11, 0x1

    .line 362
    .line 363
    iget v3, v8, La/vy40;->b:I

    .line 364
    .line 365
    invoke-virtual {v5, v2, v3}, La/raw;->c(II)V

    .line 366
    .line 367
    .line 368
    iget v2, v5, La/raw;->c:I

    .line 369
    .line 370
    add-int/2addr v2, v10

    .line 371
    iput v2, v5, La/raw;->c:I

    .line 372
    .line 373
    invoke-virtual {v8, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v12, v7, v10}, La/vtb;->l(FZZ)J

    .line 377
    .line 378
    .line 379
    move-result-wide v2

    .line 380
    invoke-virtual {v1, v2, v3}, La/iy40;->a(J)V

    .line 381
    .line 382
    .line 383
    invoke-interface/range {p2 .. p2}, La/r460;->b()I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-static {v0, v1}, La/a8k0;->D(La/yzj;I)La/lm40;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    move-object/from16 v0, p0

    .line 392
    .line 393
    move-object/from16 v2, p2

    .line 394
    .line 395
    move-wide/from16 v3, p3

    .line 396
    .line 397
    move/from16 v6, p6

    .line 398
    .line 399
    move/from16 v8, p8

    .line 400
    .line 401
    move/from16 v9, p9

    .line 402
    .line 403
    invoke-virtual/range {v0 .. v9}, La/s460;->v1(La/lm40;La/r460;JLa/raw;IZFZ)V

    .line 404
    .line 405
    .line 406
    iput v11, v5, La/raw;->c:I

    .line 407
    .line 408
    :cond_a
    return-void

    .line 409
    :cond_b
    iget v4, v2, La/lm40;->c:I

    .line 410
    .line 411
    const/16 v6, 0x10

    .line 412
    .line 413
    and-int/2addr v4, v6

    .line 414
    if-eqz v4, :cond_11

    .line 415
    .line 416
    instance-of v4, v2, La/f3k;

    .line 417
    .line 418
    if-eqz v4, :cond_11

    .line 419
    .line 420
    move-object v4, v2

    .line 421
    check-cast v4, La/f3k;

    .line 422
    .line 423
    iget-object v4, v4, La/f3k;->p:La/lm40;

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    :goto_8
    if-eqz v4, :cond_10

    .line 427
    .line 428
    iget v9, v4, La/lm40;->c:I

    .line 429
    .line 430
    and-int/2addr v9, v6

    .line 431
    if-eqz v9, :cond_f

    .line 432
    .line 433
    add-int/lit8 v7, v7, 0x1

    .line 434
    .line 435
    if-ne v7, v10, :cond_c

    .line 436
    .line 437
    move-object v2, v4

    .line 438
    goto :goto_9

    .line 439
    :cond_c
    if-nez v3, :cond_d

    .line 440
    .line 441
    new-instance v3, La/xz40;

    .line 442
    .line 443
    new-array v9, v6, [La/lm40;

    .line 444
    .line 445
    invoke-direct {v3, v9}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    :cond_d
    if-eqz v2, :cond_e

    .line 449
    .line 450
    invoke-virtual {v3, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    move-object v2, v1

    .line 454
    :cond_e
    invoke-virtual {v3, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :cond_f
    :goto_9
    iget-object v4, v4, La/lm40;->f:La/lm40;

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_10
    if-ne v7, v10, :cond_11

    .line 461
    .line 462
    :goto_a
    move/from16 v6, p6

    .line 463
    .line 464
    move/from16 v7, p7

    .line 465
    .line 466
    goto/16 :goto_1

    .line 467
    .line 468
    :cond_11
    invoke-static {v3}, La/vcc;->V(La/xz40;)La/lm40;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    goto :goto_a

    .line 473
    :cond_12
    if-eqz p9, :cond_13

    .line 474
    .line 475
    invoke-virtual/range {p0 .. p8}, La/s460;->l1(La/lm40;La/r460;JLa/raw;IZF)V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :cond_13
    invoke-virtual/range {p0 .. p8}, La/s460;->B1(La/lm40;La/r460;JLa/raw;IZF)V

    .line 480
    .line 481
    .line 482
    return-void
.end method

.method public final w(La/j6z;Z)La/jge0;
    .locals 7

    .line 1
    invoke-virtual {p0}, La/s460;->g1()La/lm40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, La/j6z;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "LayoutCoordinates "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " is not attached!"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-static {p1}, La/s460;->C1(La/j6z;)La/s460;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, La/s460;->q1()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/s460;->c1(La/s460;)La/s460;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, La/s460;->i1:La/gz40;

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    new-instance v2, La/gz40;

    .line 58
    .line 59
    invoke-direct {v2}, La/gz40;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, La/s460;->i1:La/gz40;

    .line 63
    .line 64
    :cond_2
    const/4 v3, 0x0

    .line 65
    iput v3, v2, La/gz40;->b:F

    .line 66
    .line 67
    iput v3, v2, La/gz40;->c:F

    .line 68
    .line 69
    invoke-interface {p1}, La/j6z;->g()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    const/16 v5, 0x20

    .line 74
    .line 75
    shr-long/2addr v3, v5

    .line 76
    long-to-int v3, v3

    .line 77
    int-to-float v3, v3

    .line 78
    iput v3, v2, La/gz40;->d:F

    .line 79
    .line 80
    invoke-interface {p1}, La/j6z;->g()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    const-wide v5, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v3, v5

    .line 90
    long-to-int p1, v3

    .line 91
    int-to-float p1, p1

    .line 92
    iput p1, v2, La/gz40;->e:F

    .line 93
    .line 94
    :goto_0
    if-eq v0, v1, :cond_4

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-virtual {v0, v2, p2, p1}, La/s460;->y1(La/gz40;ZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, La/gz40;->b()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    sget-object p0, La/jge0;->e:La/jge0;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_3
    iget-object v0, v0, La/s460;->w:La/s460;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {p0, v1, v2, p2}, La/s460;->V0(La/s460;La/gz40;Z)V

    .line 116
    .line 117
    .line 118
    new-instance p0, La/jge0;

    .line 119
    .line 120
    iget p1, v2, La/gz40;->b:F

    .line 121
    .line 122
    iget p2, v2, La/gz40;->c:F

    .line 123
    .line 124
    iget v0, v2, La/gz40;->d:F

    .line 125
    .line 126
    iget v1, v2, La/gz40;->e:F

    .line 127
    .line 128
    invoke-direct {p0, p1, p2, v0, v1}, La/jge0;-><init>(FFFF)V

    .line 129
    .line 130
    .line 131
    return-object p0
.end method

.method public w1(La/x5a;La/dfv;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/s460;->u:La/e7z;

    .line 2
    .line 3
    invoke-static {v0}, La/h7z;->a(La/e7z;)La/cg80;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, La/e7z;->z()La/xz40;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v0, v0, La/xz40;->c:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v0, :cond_1

    .line 17
    .line 18
    aget-object v4, v2, v3

    .line 19
    .line 20
    check-cast v4, La/e7z;

    .line 21
    .line 22
    invoke-virtual {v4}, La/e7z;->J()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4, p1, p2}, La/e7z;->j(La/x5a;La/dfv;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-interface {v1}, La/cg80;->getShowLayoutBounds()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    sget-object v5, La/rdx;->F1:La/ucs0;

    .line 41
    .line 42
    iget-wide v0, p0, La/pu90;->c:J

    .line 43
    .line 44
    const/16 p0, 0x20

    .line 45
    .line 46
    shr-long v2, v0, p0

    .line 47
    .line 48
    long-to-int p0, v2

    .line 49
    int-to-float p0, p0

    .line 50
    const/high16 p2, 0x3f000000    # 0.5f

    .line 51
    .line 52
    sub-float v3, p0, p2

    .line 53
    .line 54
    const-wide v6, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v0, v6

    .line 60
    long-to-int p0, v0

    .line 61
    int-to-float p0, p0

    .line 62
    sub-float v4, p0, p2

    .line 63
    .line 64
    const/high16 v1, 0x3f000000    # 0.5f

    .line 65
    .line 66
    const/high16 v2, 0x3f000000    # 0.5f

    .line 67
    .line 68
    move-object v0, p1

    .line 69
    invoke-interface/range {v0 .. v5}, La/x5a;->m(FFFFLa/ucs0;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method public final x1(JFLkotlin/jvm/functions/Function1;La/dfv;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/s460;->u:La/e7z;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz p5, :cond_3

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p4, "both ways to create layers shouldn\'t be used together"

    .line 11
    .line 12
    invoke-static {p4}, La/xcx;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object p4, p0, La/s460;->v1:La/dfv;

    .line 16
    .line 17
    if-eq p4, p5, :cond_1

    .line 18
    .line 19
    iput-object v2, p0, La/s460;->v1:La/dfv;

    .line 20
    .line 21
    invoke-virtual {p0, v2, v0}, La/s460;->G1(Lkotlin/jvm/functions/Function1;Z)V

    .line 22
    .line 23
    .line 24
    iput-object p5, p0, La/s460;->v1:La/dfv;

    .line 25
    .line 26
    :cond_1
    iget-object p4, p0, La/s460;->u1:La/bg80;

    .line 27
    .line 28
    if-nez p4, :cond_5

    .line 29
    .line 30
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    iget-object v2, p0, La/s460;->r1:La/jt50;

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    new-instance v2, La/p460;

    .line 39
    .line 40
    invoke-direct {v2, p0, v0}, La/p460;-><init>(La/s460;B)V

    .line 41
    .line 42
    .line 43
    new-instance v0, La/jt50;

    .line 44
    .line 45
    const/4 v3, 0x5

    .line 46
    invoke-direct {v0, p0, v2, v3}, La/jt50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/s460;->r1:La/jt50;

    .line 50
    .line 51
    move-object v2, v0

    .line 52
    :cond_2
    check-cast p4, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 53
    .line 54
    iget-object v0, p0, La/s460;->s1:La/p460;

    .line 55
    .line 56
    invoke-virtual {p4, v2, v0, p5}, Landroidx/compose/ui/platform/AndroidComposeView;->f(Lkotlin/jvm/functions/Function2;La/p460;La/dfv;)La/bg80;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    iget-wide v2, p0, La/pu90;->c:J

    .line 61
    .line 62
    move-object p5, p4

    .line 63
    check-cast p5, La/gfv;

    .line 64
    .line 65
    invoke-virtual {p5, v2, v3}, La/gfv;->e(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p5, p1, p2}, La/gfv;->d(J)V

    .line 69
    .line 70
    .line 71
    iput-object p4, p0, La/s460;->u1:La/bg80;

    .line 72
    .line 73
    const/4 p4, 0x1

    .line 74
    iput-boolean p4, v1, La/e7z;->l1:Z

    .line 75
    .line 76
    invoke-virtual {v0}, La/p460;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-object p5, p0, La/s460;->v1:La/dfv;

    .line 81
    .line 82
    if-eqz p5, :cond_4

    .line 83
    .line 84
    iput-object v2, p0, La/s460;->v1:La/dfv;

    .line 85
    .line 86
    invoke-virtual {p0, v2, v0}, La/s460;->G1(Lkotlin/jvm/functions/Function1;Z)V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-virtual {p0, p4, v0}, La/s460;->G1(Lkotlin/jvm/functions/Function1;Z)V

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_1
    iget-wide p4, p0, La/s460;->g1:J

    .line 93
    .line 94
    invoke-static {p4, p5, p1, p2}, La/ikx;->b(JJ)Z

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    if-nez p4, :cond_8

    .line 99
    .line 100
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    const/high16 p5, -0x3f800000    # -4.0f

    .line 105
    .line 106
    check-cast p4, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 107
    .line 108
    invoke-virtual {p4, p5}, Landroidx/compose/ui/platform/AndroidComposeView;->N(F)V

    .line 109
    .line 110
    .line 111
    iput-wide p1, p0, La/s460;->g1:J

    .line 112
    .line 113
    iget-object p4, p0, La/s460;->u1:La/bg80;

    .line 114
    .line 115
    if-eqz p4, :cond_6

    .line 116
    .line 117
    check-cast p4, La/gfv;

    .line 118
    .line 119
    invoke-virtual {p4, p1, p2}, La/gfv;->d(J)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    iget-object p1, p0, La/s460;->w:La/s460;

    .line 124
    .line 125
    if-eqz p1, :cond_7

    .line 126
    .line 127
    invoke-virtual {p1}, La/s460;->o1()V

    .line 128
    .line 129
    .line 130
    :cond_7
    :goto_2
    invoke-virtual {v1, p0}, La/e7z;->O(La/s460;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, La/c810;->R0(La/s460;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, v1, La/e7z;->o:La/cg80;

    .line 137
    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 141
    .line 142
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->w(La/e7z;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    iput p3, p0, La/s460;->h1:F

    .line 146
    .line 147
    iget-object p1, v1, La/e7z;->h1:La/tzi;

    .line 148
    .line 149
    iget-object p1, p1, La/tzi;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p1, La/s460;

    .line 152
    .line 153
    if-ne p0, p1, :cond_9

    .line 154
    .line 155
    iget-boolean p1, p0, La/c810;->o:Z

    .line 156
    .line 157
    if-nez p1, :cond_9

    .line 158
    .line 159
    invoke-static {v1}, La/h7z;->a(La/e7z;)La/cg80;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-interface {p1}, La/cg80;->getRectManager()La/oge0;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1, v1}, La/oge0;->g(La/e7z;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    iget-boolean p1, p0, La/c810;->o:Z

    .line 171
    .line 172
    if-nez p1, :cond_a

    .line 173
    .line 174
    invoke-virtual {p0}, La/s460;->N0()La/uj30;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p0, p1}, La/c810;->F0(La/uj30;)V

    .line 179
    .line 180
    .line 181
    :cond_a
    return-void
.end method

.method public final y1(La/gz40;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_a

    .line 11
    .line 12
    iget-boolean v4, p0, La/s460;->y:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_8

    .line 16
    .line 17
    if-eqz p3, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, La/s460;->f1()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    iget v4, p1, La/gz40;->b:F

    .line 24
    .line 25
    iget v6, p1, La/gz40;->c:F

    .line 26
    .line 27
    iget v7, p1, La/gz40;->d:F

    .line 28
    .line 29
    cmpg-float v7, v7, v5

    .line 30
    .line 31
    if-ltz v7, :cond_5

    .line 32
    .line 33
    iget-wide v7, p0, La/pu90;->c:J

    .line 34
    .line 35
    shr-long v9, v7, v1

    .line 36
    .line 37
    long-to-int v9, v9

    .line 38
    int-to-float v9, v9

    .line 39
    cmpl-float v9, v4, v9

    .line 40
    .line 41
    if-gtz v9, :cond_5

    .line 42
    .line 43
    iget v9, p1, La/gz40;->e:F

    .line 44
    .line 45
    cmpg-float v9, v9, v5

    .line 46
    .line 47
    if-ltz v9, :cond_5

    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    long-to-int v7, v7

    .line 51
    int-to-float v7, v7

    .line 52
    cmpl-float v7, v6, v7

    .line 53
    .line 54
    if-lez v7, :cond_0

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    shr-long v7, p2, v1

    .line 58
    .line 59
    long-to-int v7, v7

    .line 60
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    and-long v8, p2, v2

    .line 65
    .line 66
    long-to-int v8, v8

    .line 67
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    iget v9, p1, La/gz40;->d:F

    .line 72
    .line 73
    iget v10, p1, La/gz40;->b:F

    .line 74
    .line 75
    sub-float/2addr v9, v10

    .line 76
    sub-float v9, v7, v9

    .line 77
    .line 78
    const/high16 v10, 0x40000000    # 2.0f

    .line 79
    .line 80
    div-float/2addr v9, v10

    .line 81
    cmpl-float v11, v9, v5

    .line 82
    .line 83
    if-lez v11, :cond_1

    .line 84
    .line 85
    sub-float/2addr v4, v9

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    neg-float v7, v7

    .line 88
    div-float/2addr v7, v10

    .line 89
    cmpg-float v9, v4, v7

    .line 90
    .line 91
    if-gez v9, :cond_2

    .line 92
    .line 93
    move v4, v7

    .line 94
    :cond_2
    :goto_0
    iget v7, p1, La/gz40;->e:F

    .line 95
    .line 96
    iget v9, p1, La/gz40;->c:F

    .line 97
    .line 98
    sub-float/2addr v7, v9

    .line 99
    sub-float v7, v8, v7

    .line 100
    .line 101
    div-float/2addr v7, v10

    .line 102
    cmpl-float v9, v7, v5

    .line 103
    .line 104
    if-lez v9, :cond_3

    .line 105
    .line 106
    sub-float/2addr v6, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    neg-float v7, v8

    .line 109
    div-float/2addr v7, v10

    .line 110
    cmpg-float v8, v6, v7

    .line 111
    .line 112
    if-gez v8, :cond_4

    .line 113
    .line 114
    move v6, v7

    .line 115
    :cond_4
    :goto_1
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-long v7, v4

    .line 120
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-long v9, v4

    .line 125
    shl-long v6, v7, v1

    .line 126
    .line 127
    and-long v8, v9, v2

    .line 128
    .line 129
    or-long/2addr v6, v8

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    :goto_2
    const-wide/16 v6, 0x0

    .line 132
    .line 133
    :goto_3
    shr-long v8, v6, v1

    .line 134
    .line 135
    long-to-int v4, v8

    .line 136
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    and-long/2addr v6, v2

    .line 141
    long-to-int v6, v6

    .line 142
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iget-wide v7, p0, La/pu90;->c:J

    .line 147
    .line 148
    shr-long v9, v7, v1

    .line 149
    .line 150
    long-to-int v9, v9

    .line 151
    and-long/2addr v7, v2

    .line 152
    long-to-int v7, v7

    .line 153
    int-to-float v8, v9

    .line 154
    shr-long v9, p2, v1

    .line 155
    .line 156
    long-to-int v9, v9

    .line 157
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    add-float/2addr v10, v8

    .line 162
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    add-float/2addr v9, v4

    .line 167
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-static {v10, v8}, Ljava/lang/Math;->min(FF)F

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    int-to-float v7, v7

    .line 176
    and-long/2addr p2, v2

    .line 177
    long-to-int p2, p2

    .line 178
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    add-float/2addr p3, v7

    .line 183
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    add-float/2addr p2, v6

    .line 188
    invoke-static {v7, p2}, Ljava/lang/Math;->max(FF)F

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-virtual {p1, v4, v6, v8, p2}, La/gz40;->a(FFFF)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    if-eqz p2, :cond_7

    .line 201
    .line 202
    iget-wide p2, p0, La/pu90;->c:J

    .line 203
    .line 204
    shr-long v6, p2, v1

    .line 205
    .line 206
    long-to-int v4, v6

    .line 207
    int-to-float v4, v4

    .line 208
    and-long/2addr p2, v2

    .line 209
    long-to-int p2, p2

    .line 210
    int-to-float p2, p2

    .line 211
    invoke-virtual {p1, v5, v5, v4, p2}, La/gz40;->a(FFFF)V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_4
    invoke-virtual {p1}, La/gz40;->b()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_8

    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    check-cast v0, La/gfv;

    .line 222
    .line 223
    invoke-virtual {v0}, La/gfv;->b()[F

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iget-boolean p3, v0, La/gfv;->s:Z

    .line 228
    .line 229
    if-nez p3, :cond_a

    .line 230
    .line 231
    if-nez p2, :cond_9

    .line 232
    .line 233
    iput v5, p1, La/gz40;->b:F

    .line 234
    .line 235
    iput v5, p1, La/gz40;->c:F

    .line 236
    .line 237
    iput v5, p1, La/gz40;->d:F

    .line 238
    .line 239
    iput v5, p1, La/gz40;->e:F

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-static {p2, p1}, La/ui30;->c([FLa/gz40;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    :goto_5
    iget-wide p2, p0, La/s460;->g1:J

    .line 246
    .line 247
    shr-long v0, p2, v1

    .line 248
    .line 249
    long-to-int p0, v0

    .line 250
    iget v0, p1, La/gz40;->b:F

    .line 251
    .line 252
    int-to-float p0, p0

    .line 253
    add-float/2addr v0, p0

    .line 254
    iput v0, p1, La/gz40;->b:F

    .line 255
    .line 256
    iget v0, p1, La/gz40;->d:F

    .line 257
    .line 258
    add-float/2addr v0, p0

    .line 259
    iput v0, p1, La/gz40;->d:F

    .line 260
    .line 261
    and-long/2addr p2, v2

    .line 262
    long-to-int p0, p2

    .line 263
    iget p2, p1, La/gz40;->c:F

    .line 264
    .line 265
    int-to-float p0, p0

    .line 266
    add-float/2addr p2, p0

    .line 267
    iput p2, p1, La/gz40;->c:F

    .line 268
    .line 269
    iget p2, p1, La/gz40;->e:F

    .line 270
    .line 271
    add-float/2addr p2, p0

    .line 272
    iput p2, p1, La/gz40;->e:F

    .line 273
    .line 274
    return-void
.end method

.method public final z1()V
    .locals 2

    .line 1
    iget-object v0, p0, La/s460;->u1:La/bg80;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/s460;->v1:La/dfv;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object v1, p0, La/s460;->v1:La/dfv;

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v1, v0}, La/s460;->G1(Lkotlin/jvm/functions/Function1;Z)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/e7z;->V(Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method
