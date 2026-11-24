.class public abstract La/hel;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/gpa0;
.implements La/h7x;
.implements La/vld;
.implements La/tel;


# instance fields
.field public A:La/amt;

.field public B:La/amt;

.field public Y:La/mdl;

.field public Z:La/ldl;

.field public f1:La/kdl;

.field public g1:La/qcc;

.field public h1:La/j6u0;

.field public i1:La/hac;

.field public j1:La/f7x;

.field public q:La/ma80;

.field public r:Lkotlin/jvm/functions/Function1;

.field public s:Z

.field public t:La/gy40;

.field public u:La/q99;

.field public v:La/nel;

.field public w:Z

.field public x:Z

.field public y:La/jdl;

.field public z:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/hel;->q:La/ma80;

    .line 5
    .line 6
    iput-object p1, p0, La/hel;->r:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-boolean p2, p0, La/hel;->s:Z

    .line 9
    .line 10
    iput-object p3, p0, La/hel;->t:La/gy40;

    .line 11
    .line 12
    const-wide/16 p1, 0x0

    .line 13
    .line 14
    iput-wide p1, p0, La/hel;->z:J

    .line 15
    .line 16
    return-void
.end method

.method public static g1(La/hel;La/dpa0;JJI)V
    .locals 3

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, La/hel;->Z:La/ldl;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p6, :cond_1

    .line 11
    .line 12
    new-instance p6, La/ldl;

    .line 13
    .line 14
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p6, La/ldl;->a:La/dpa0;

    .line 19
    .line 20
    const-wide v1, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p6, La/ldl;->b:J

    .line 26
    .line 27
    iput-boolean v0, p6, La/ldl;->c:Z

    .line 28
    .line 29
    iput-object p6, p0, La/hel;->Z:La/ldl;

    .line 30
    .line 31
    :cond_1
    iput-object p1, p6, La/ldl;->a:La/dpa0;

    .line 32
    .line 33
    iput-wide p2, p6, La/ldl;->b:J

    .line 34
    .line 35
    iget-object p1, p0, La/hel;->i1:La/hac;

    .line 36
    .line 37
    iget-object p2, p0, La/hel;->q:La/ma80;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, La/hac;

    .line 42
    .line 43
    invoke-direct {p1, p2}, La/hac;-><init>(La/ma80;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/hel;->i1:La/hac;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object p2, p1, La/hac;->c:Ljava/lang/Object;

    .line 50
    .line 51
    iput-wide p4, p1, La/hac;->b:J

    .line 52
    .line 53
    :goto_0
    iput-boolean v0, p6, La/ldl;->c:Z

    .line 54
    .line 55
    iput-object p6, p0, La/hel;->g1:La/qcc;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final F()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/hel;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, La/hel;->g1:La/qcc;

    .line 6
    .line 7
    instance-of v0, p0, La/jdl;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, La/jdl;

    .line 12
    .line 13
    iget-boolean p0, p0, La/jdl;->c:Z

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p0, La/ldl;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    instance-of v0, p0, La/kdl;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    :goto_0
    const-string p0, "waiting"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    instance-of p0, p0, La/mdl;

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    const-string p0, "recognized"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-string p0, "idle"

    .line 38
    .line 39
    return-object p0
.end method

.method public final J()La/ma80;
    .locals 0

    .line 1
    iget-object p0, p0, La/hel;->q:La/ma80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final S0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La/hel;->w:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/hel;->c1()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/hel;->B:La/amt;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, La/f3k;->a1(La/yzj;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, La/hel;->A:La/amt;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/f3k;->a1(La/yzj;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, La/hel;->B:La/amt;

    .line 23
    .line 24
    iput-object v0, p0, La/hel;->A:La/amt;

    .line 25
    .line 26
    return-void
.end method

.method public final Y(La/zz2;La/xoa0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, La/zz2;->a:I

    .line 8
    .line 9
    iget-object v1, v1, La/zz2;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-boolean v4, v0, La/hel;->s:Z

    .line 14
    .line 15
    if-eqz v4, :cond_42

    .line 16
    .line 17
    iget-object v4, v0, La/hel;->j1:La/f7x;

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    new-instance v4, La/f7x;

    .line 22
    .line 23
    invoke-direct {v4, v0}, La/f7x;-><init>(La/hel;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, v0, La/hel;->j1:La/f7x;

    .line 27
    .line 28
    :cond_0
    iget-object v5, v0, La/hel;->B:La/amt;

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    new-instance v5, La/amt;

    .line 33
    .line 34
    invoke-direct {v5, v4}, La/amt;-><init>(La/zlt;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v5}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 38
    .line 39
    .line 40
    iput-object v5, v0, La/hel;->B:La/amt;

    .line 41
    .line 42
    :cond_1
    iget-object v6, v0, La/hel;->j1:La/f7x;

    .line 43
    .line 44
    if-eqz v6, :cond_42

    .line 45
    .line 46
    iget-object v0, v6, La/f7x;->a:La/hel;

    .line 47
    .line 48
    iget-object v4, v6, La/f7x;->f:La/d7x;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    iget-object v4, v6, La/f7x;->b:La/z6x;

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    new-instance v4, La/z6x;

    .line 58
    .line 59
    sget-object v7, La/y6x;->c:La/y6x;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v7, v4, La/z6x;->a:La/y6x;

    .line 65
    .line 66
    iput-boolean v5, v4, La/z6x;->b:Z

    .line 67
    .line 68
    iput-boolean v5, v4, La/z6x;->c:Z

    .line 69
    .line 70
    iput-object v4, v6, La/f7x;->b:La/z6x;

    .line 71
    .line 72
    :cond_2
    iput-object v4, v6, La/f7x;->f:La/d7x;

    .line 73
    .line 74
    :cond_3
    instance-of v7, v4, La/z6x;

    .line 75
    .line 76
    const-wide v12, 0x7fffffffffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide/16 v14, 0x0

    .line 82
    .line 83
    const/4 v8, 0x1

    .line 84
    if-eqz v7, :cond_d

    .line 85
    .line 86
    check-cast v4, La/z6x;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_4

    .line 93
    .line 94
    goto/16 :goto_17

    .line 95
    .line 96
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    :goto_0
    if-ge v5, v7, :cond_6

    .line 101
    .line 102
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, La/x6x;

    .line 107
    .line 108
    invoke-static {v9}, La/g7x;->v(La/x6x;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-nez v9, :cond_5

    .line 113
    .line 114
    goto/16 :goto_17

    .line 115
    .line 116
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v7, v1

    .line 124
    check-cast v7, La/x6x;

    .line 125
    .line 126
    iget-object v1, v4, La/z6x;->a:La/y6x;

    .line 127
    .line 128
    sget-object v5, La/e7x;->a:[I

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    aget v1, v5, v1

    .line 135
    .line 136
    if-ne v1, v8, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0}, La/hel;->r1()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_7

    .line 143
    .line 144
    sget-object v0, La/y6x;->a:La/y6x;

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    sget-object v0, La/y6x;->b:La/y6x;

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    iget-object v0, v4, La/z6x;->a:La/y6x;

    .line 151
    .line 152
    :goto_1
    iput-object v0, v4, La/z6x;->a:La/y6x;

    .line 153
    .line 154
    sget-object v1, La/xoa0;->a:La/xoa0;

    .line 155
    .line 156
    if-ne v2, v1, :cond_a

    .line 157
    .line 158
    sget-object v1, La/y6x;->b:La/y6x;

    .line 159
    .line 160
    if-ne v0, v1, :cond_9

    .line 161
    .line 162
    iput-boolean v8, v7, La/x6x;->i:Z

    .line 163
    .line 164
    iput-boolean v8, v4, La/z6x;->b:Z

    .line 165
    .line 166
    :cond_9
    iput-boolean v8, v4, La/z6x;->c:Z

    .line 167
    .line 168
    :cond_a
    sget-object v1, La/xoa0;->b:La/xoa0;

    .line 169
    .line 170
    if-ne v2, v1, :cond_42

    .line 171
    .line 172
    sget-object v1, La/y6x;->a:La/y6x;

    .line 173
    .line 174
    if-ne v0, v1, :cond_b

    .line 175
    .line 176
    iget-wide v8, v7, La/x6x;->a:J

    .line 177
    .line 178
    const-wide/16 v10, 0x0

    .line 179
    .line 180
    const/16 v12, 0xc

    .line 181
    .line 182
    invoke-static/range {v6 .. v12}, La/f7x;->c(La/f7x;La/x6x;JJI)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_b
    iget-boolean v0, v4, La/z6x;->b:Z

    .line 187
    .line 188
    if-eqz v0, :cond_42

    .line 189
    .line 190
    new-instance v9, La/v6x;

    .line 191
    .line 192
    invoke-direct {v9, v3}, La/v6x;-><init>(I)V

    .line 193
    .line 194
    .line 195
    const-wide/16 v10, 0x0

    .line 196
    .line 197
    move-object v8, v7

    .line 198
    invoke-virtual/range {v6 .. v11}, La/f7x;->f(La/x6x;La/x6x;La/v6x;J)V

    .line 199
    .line 200
    .line 201
    new-instance v0, La/v6x;

    .line 202
    .line 203
    invoke-direct {v0, v3}, La/v6x;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6, v7, v0, v14, v15}, La/f7x;->e(La/x6x;La/v6x;J)V

    .line 207
    .line 208
    .line 209
    iget-wide v0, v7, La/x6x;->a:J

    .line 210
    .line 211
    iget-object v2, v6, La/f7x;->c:La/c7x;

    .line 212
    .line 213
    if-nez v2, :cond_c

    .line 214
    .line 215
    new-instance v2, La/c7x;

    .line 216
    .line 217
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 218
    .line 219
    .line 220
    iput-wide v12, v2, La/c7x;->a:J

    .line 221
    .line 222
    iput-object v2, v6, La/f7x;->c:La/c7x;

    .line 223
    .line 224
    :cond_c
    iput-wide v0, v2, La/c7x;->a:J

    .line 225
    .line 226
    iput-object v2, v6, La/f7x;->f:La/d7x;

    .line 227
    .line 228
    return-void

    .line 229
    :cond_d
    instance-of v7, v4, La/b7x;

    .line 230
    .line 231
    if-eqz v7, :cond_23

    .line 232
    .line 233
    check-cast v4, La/b7x;

    .line 234
    .line 235
    sget-object v7, La/xoa0;->a:La/xoa0;

    .line 236
    .line 237
    if-ne v2, v7, :cond_e

    .line 238
    .line 239
    goto/16 :goto_17

    .line 240
    .line 241
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    move v10, v5

    .line 246
    :goto_2
    if-ge v10, v7, :cond_10

    .line 247
    .line 248
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    move-object v14, v11

    .line 253
    check-cast v14, La/x6x;

    .line 254
    .line 255
    iget-wide v14, v14, La/x6x;->a:J

    .line 256
    .line 257
    move/from16 p1, v10

    .line 258
    .line 259
    iget-wide v9, v4, La/b7x;->b:J

    .line 260
    .line 261
    invoke-static {v14, v15, v9, v10}, La/b5x;->I(JJ)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-eqz v9, :cond_f

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_f
    add-int/lit8 v10, p1, 0x1

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_10
    const/4 v11, 0x0

    .line 272
    :goto_3
    check-cast v11, La/x6x;

    .line 273
    .line 274
    if-nez v11, :cond_14

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    move v9, v5

    .line 281
    :goto_4
    if-ge v9, v7, :cond_12

    .line 282
    .line 283
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    move-object v11, v10

    .line 288
    check-cast v11, La/x6x;

    .line 289
    .line 290
    iget-boolean v11, v11, La/x6x;->d:Z

    .line 291
    .line 292
    if-eqz v11, :cond_11

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_12
    const/4 v10, 0x0

    .line 299
    :goto_5
    move-object v11, v10

    .line 300
    check-cast v11, La/x6x;

    .line 301
    .line 302
    if-nez v11, :cond_13

    .line 303
    .line 304
    invoke-virtual {v6}, La/f7x;->a()V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_13
    iget-wide v9, v11, La/x6x;->a:J

    .line 309
    .line 310
    iput-wide v9, v4, La/b7x;->b:J

    .line 311
    .line 312
    :cond_14
    sget-object v7, La/xoa0;->b:La/xoa0;

    .line 313
    .line 314
    const-string v14, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 315
    .line 316
    const-string v15, "AwaitTouchSlop.initialDown was not initialized"

    .line 317
    .line 318
    if-ne v2, v7, :cond_1f

    .line 319
    .line 320
    iget-boolean v7, v11, La/x6x;->i:Z

    .line 321
    .line 322
    if-nez v7, :cond_1c

    .line 323
    .line 324
    invoke-static {v11}, La/g7x;->w(La/x6x;)Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    if-eqz v7, :cond_18

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    move v3, v5

    .line 335
    :goto_6
    if-ge v3, v0, :cond_16

    .line 336
    .line 337
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    move-object v8, v7

    .line 342
    check-cast v8, La/x6x;

    .line 343
    .line 344
    iget-boolean v8, v8, La/x6x;->d:Z

    .line 345
    .line 346
    if-eqz v8, :cond_15

    .line 347
    .line 348
    move-object v9, v7

    .line 349
    goto :goto_7

    .line 350
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_16
    const/4 v9, 0x0

    .line 354
    :goto_7
    check-cast v9, La/x6x;

    .line 355
    .line 356
    if-nez v9, :cond_17

    .line 357
    .line 358
    invoke-virtual {v6}, La/f7x;->a()V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_8

    .line 362
    .line 363
    :cond_17
    iget-wide v0, v9, La/x6x;->a:J

    .line 364
    .line 365
    iput-wide v0, v4, La/b7x;->b:J

    .line 366
    .line 367
    goto/16 :goto_8

    .line 368
    .line 369
    :cond_18
    sget-object v1, La/bmd;->t:La/zfn;

    .line 370
    .line 371
    invoke-static {v0, v1}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, La/wgu0;

    .line 376
    .line 377
    sget v7, La/bel;->a:F

    .line 378
    .line 379
    invoke-interface {v1}, La/wgu0;->h()F

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    iget-object v7, v6, La/f7x;->h:La/hac;

    .line 384
    .line 385
    if-eqz v7, :cond_1b

    .line 386
    .line 387
    iget-object v0, v0, La/hel;->q:La/ma80;

    .line 388
    .line 389
    new-instance v9, La/v6x;

    .line 390
    .line 391
    invoke-direct {v9, v3}, La/v6x;-><init>(I)V

    .line 392
    .line 393
    .line 394
    invoke-static {v11, v0, v9, v8}, La/g7x;->U(La/x6x;La/ma80;La/v6x;Z)J

    .line 395
    .line 396
    .line 397
    move-result-wide v9

    .line 398
    invoke-static {v7, v9, v10, v1}, La/hac;->u(La/hac;JF)J

    .line 399
    .line 400
    .line 401
    move-result-wide v0

    .line 402
    const-wide v9, 0x7fffffff7fffffffL

    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    and-long/2addr v9, v0

    .line 408
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    cmp-long v7, v9, v16

    .line 414
    .line 415
    if-eqz v7, :cond_1a

    .line 416
    .line 417
    iput-boolean v8, v11, La/x6x;->i:Z

    .line 418
    .line 419
    iget-object v7, v4, La/b7x;->a:La/x6x;

    .line 420
    .line 421
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    new-instance v9, La/v6x;

    .line 425
    .line 426
    invoke-direct {v9, v3}, La/v6x;-><init>(I)V

    .line 427
    .line 428
    .line 429
    move-object v8, v11

    .line 430
    move-wide v10, v0

    .line 431
    invoke-virtual/range {v6 .. v11}, La/f7x;->f(La/x6x;La/x6x;La/v6x;J)V

    .line 432
    .line 433
    .line 434
    move-object v11, v8

    .line 435
    new-instance v7, La/v6x;

    .line 436
    .line 437
    invoke-direct {v7, v3}, La/v6x;-><init>(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v6, v11, v7, v0, v1}, La/f7x;->e(La/x6x;La/v6x;J)V

    .line 441
    .line 442
    .line 443
    iget-wide v0, v11, La/x6x;->a:J

    .line 444
    .line 445
    iget-object v3, v6, La/f7x;->c:La/c7x;

    .line 446
    .line 447
    if-nez v3, :cond_19

    .line 448
    .line 449
    new-instance v3, La/c7x;

    .line 450
    .line 451
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 452
    .line 453
    .line 454
    iput-wide v12, v3, La/c7x;->a:J

    .line 455
    .line 456
    iput-object v3, v6, La/f7x;->c:La/c7x;

    .line 457
    .line 458
    :cond_19
    iput-wide v0, v3, La/c7x;->a:J

    .line 459
    .line 460
    iput-object v3, v6, La/f7x;->f:La/d7x;

    .line 461
    .line 462
    goto :goto_8

    .line 463
    :cond_1a
    iput-boolean v8, v4, La/b7x;->c:Z

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_1b
    const-string v0, "Touch slop detector not initialized."

    .line 467
    .line 468
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :cond_1c
    iget-object v0, v4, La/b7x;->a:La/x6x;

    .line 473
    .line 474
    if-eqz v0, :cond_1e

    .line 475
    .line 476
    iget-wide v7, v4, La/b7x;->b:J

    .line 477
    .line 478
    iget-object v1, v6, La/f7x;->h:La/hac;

    .line 479
    .line 480
    if-eqz v1, :cond_1d

    .line 481
    .line 482
    invoke-virtual {v6, v0, v7, v8, v1}, La/f7x;->b(La/x6x;JLa/hac;)V

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_1d
    invoke-static {v14}, La/jf4;->o(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    return-void

    .line 490
    :cond_1e
    invoke-static {v15}, La/jf4;->o(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    :cond_1f
    :goto_8
    sget-object v0, La/xoa0;->c:La/xoa0;

    .line 495
    .line 496
    if-ne v2, v0, :cond_42

    .line 497
    .line 498
    iget-boolean v0, v4, La/b7x;->c:Z

    .line 499
    .line 500
    if-eqz v0, :cond_42

    .line 501
    .line 502
    iget-boolean v0, v11, La/x6x;->i:Z

    .line 503
    .line 504
    if-eqz v0, :cond_22

    .line 505
    .line 506
    iget-object v0, v4, La/b7x;->a:La/x6x;

    .line 507
    .line 508
    if-eqz v0, :cond_21

    .line 509
    .line 510
    iget-wide v1, v4, La/b7x;->b:J

    .line 511
    .line 512
    iget-object v3, v6, La/f7x;->h:La/hac;

    .line 513
    .line 514
    if-eqz v3, :cond_20

    .line 515
    .line 516
    invoke-virtual {v6, v0, v1, v2, v3}, La/f7x;->b(La/x6x;JLa/hac;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :cond_20
    invoke-static {v14}, La/jf4;->o(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    return-void

    .line 524
    :cond_21
    invoke-static {v15}, La/jf4;->o(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_22
    iput-boolean v5, v4, La/b7x;->c:Z

    .line 529
    .line 530
    return-void

    .line 531
    :cond_23
    instance-of v7, v4, La/a7x;

    .line 532
    .line 533
    if-eqz v7, :cond_2b

    .line 534
    .line 535
    check-cast v4, La/a7x;

    .line 536
    .line 537
    sget-object v7, La/xoa0;->c:La/xoa0;

    .line 538
    .line 539
    if-eq v2, v7, :cond_24

    .line 540
    .line 541
    goto/16 :goto_17

    .line 542
    .line 543
    :cond_24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    move v7, v5

    .line 548
    :goto_9
    if-ge v7, v2, :cond_26

    .line 549
    .line 550
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v9

    .line 554
    check-cast v9, La/x6x;

    .line 555
    .line 556
    iget-boolean v9, v9, La/x6x;->i:Z

    .line 557
    .line 558
    if-eqz v9, :cond_25

    .line 559
    .line 560
    move v8, v5

    .line 561
    goto :goto_a

    .line 562
    :cond_25
    add-int/lit8 v7, v7, 0x1

    .line 563
    .line 564
    goto :goto_9

    .line 565
    :cond_26
    :goto_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    :goto_b
    if-ge v5, v2, :cond_2a

    .line 570
    .line 571
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    check-cast v7, La/x6x;

    .line 576
    .line 577
    iget-boolean v7, v7, La/x6x;->d:Z

    .line 578
    .line 579
    if-eqz v7, :cond_29

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    if-eqz v2, :cond_27

    .line 586
    .line 587
    goto :goto_c

    .line 588
    :cond_27
    if-eqz v8, :cond_42

    .line 589
    .line 590
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, La/x6x;

    .line 595
    .line 596
    iget-object v2, v0, La/hel;->q:La/ma80;

    .line 597
    .line 598
    new-instance v5, La/v6x;

    .line 599
    .line 600
    invoke-direct {v5, v3}, La/v6x;-><init>(I)V

    .line 601
    .line 602
    .line 603
    invoke-static {v1, v2, v5}, La/g7x;->V(La/x6x;La/ma80;La/v6x;)J

    .line 604
    .line 605
    .line 606
    move-result-wide v1

    .line 607
    iget-object v5, v4, La/a7x;->a:La/x6x;

    .line 608
    .line 609
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    iget-object v0, v0, La/hel;->q:La/ma80;

    .line 613
    .line 614
    new-instance v7, La/v6x;

    .line 615
    .line 616
    invoke-direct {v7, v3}, La/v6x;-><init>(I)V

    .line 617
    .line 618
    .line 619
    invoke-static {v5, v0, v7}, La/g7x;->V(La/x6x;La/ma80;La/v6x;)J

    .line 620
    .line 621
    .line 622
    move-result-wide v7

    .line 623
    invoke-static {v1, v2, v7, v8}, La/ne60;->e(JJ)J

    .line 624
    .line 625
    .line 626
    move-result-wide v10

    .line 627
    iget-object v7, v4, La/a7x;->a:La/x6x;

    .line 628
    .line 629
    if-eqz v7, :cond_28

    .line 630
    .line 631
    iget-wide v8, v4, La/a7x;->b:J

    .line 632
    .line 633
    const/16 v12, 0x8

    .line 634
    .line 635
    invoke-static/range {v6 .. v12}, La/f7x;->c(La/f7x;La/x6x;JJI)V

    .line 636
    .line 637
    .line 638
    return-void

    .line 639
    :cond_28
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 640
    .line 641
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :cond_29
    add-int/lit8 v5, v5, 0x1

    .line 646
    .line 647
    goto :goto_b

    .line 648
    :cond_2a
    :goto_c
    invoke-virtual {v6}, La/f7x;->a()V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    :cond_2b
    instance-of v7, v4, La/c7x;

    .line 653
    .line 654
    if-eqz v7, :cond_41

    .line 655
    .line 656
    check-cast v4, La/c7x;

    .line 657
    .line 658
    sget-object v7, La/xoa0;->b:La/xoa0;

    .line 659
    .line 660
    if-eq v2, v7, :cond_2c

    .line 661
    .line 662
    goto/16 :goto_17

    .line 663
    .line 664
    :cond_2c
    iget-wide v9, v4, La/c7x;->a:J

    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    move v7, v5

    .line 671
    :goto_d
    if-ge v7, v2, :cond_2e

    .line 672
    .line 673
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v11

    .line 677
    move-object v12, v11

    .line 678
    check-cast v12, La/x6x;

    .line 679
    .line 680
    iget-wide v12, v12, La/x6x;->a:J

    .line 681
    .line 682
    invoke-static {v12, v13, v9, v10}, La/b5x;->I(JJ)Z

    .line 683
    .line 684
    .line 685
    move-result v12

    .line 686
    if-eqz v12, :cond_2d

    .line 687
    .line 688
    goto :goto_e

    .line 689
    :cond_2d
    add-int/lit8 v7, v7, 0x1

    .line 690
    .line 691
    goto :goto_d

    .line 692
    :cond_2e
    const/4 v11, 0x0

    .line 693
    :goto_e
    check-cast v11, La/x6x;

    .line 694
    .line 695
    if-nez v11, :cond_2f

    .line 696
    .line 697
    goto/16 :goto_17

    .line 698
    .line 699
    :cond_2f
    iget-wide v9, v11, La/x6x;->c:J

    .line 700
    .line 701
    invoke-static {v11}, La/g7x;->w(La/x6x;)Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    sget-object v7, La/ndl;->a:La/ndl;

    .line 706
    .line 707
    if-eqz v2, :cond_3e

    .line 708
    .line 709
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    move v13, v5

    .line 714
    :goto_f
    if-ge v13, v2, :cond_31

    .line 715
    .line 716
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v16

    .line 720
    const/16 p1, 0x0

    .line 721
    .line 722
    move-object/from16 v12, v16

    .line 723
    .line 724
    check-cast v12, La/x6x;

    .line 725
    .line 726
    iget-boolean v12, v12, La/x6x;->d:Z

    .line 727
    .line 728
    if-eqz v12, :cond_30

    .line 729
    .line 730
    goto :goto_10

    .line 731
    :cond_30
    add-int/lit8 v13, v13, 0x1

    .line 732
    .line 733
    goto :goto_f

    .line 734
    :cond_31
    const/16 p1, 0x0

    .line 735
    .line 736
    const/16 v16, 0x0

    .line 737
    .line 738
    :goto_10
    move-object/from16 v1, v16

    .line 739
    .line 740
    check-cast v1, La/x6x;

    .line 741
    .line 742
    if-nez v1, :cond_3d

    .line 743
    .line 744
    iget-boolean v1, v11, La/x6x;->i:Z

    .line 745
    .line 746
    if-nez v1, :cond_3c

    .line 747
    .line 748
    invoke-static {v11}, La/g7x;->w(La/x6x;)Z

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    if-eqz v1, :cond_3c

    .line 753
    .line 754
    invoke-virtual {v6}, La/f7x;->d()La/j6u0;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    iget-object v2, v0, La/hel;->q:La/ma80;

    .line 759
    .line 760
    iget-object v4, v6, La/f7x;->i:La/y78;

    .line 761
    .line 762
    iget-object v7, v4, La/y78;->c:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v7, La/vy40;

    .line 765
    .line 766
    const/16 p2, 0x20

    .line 767
    .line 768
    shr-long v12, v9, p2

    .line 769
    .line 770
    long-to-int v12, v12

    .line 771
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 772
    .line 773
    .line 774
    move-result v12

    .line 775
    const-wide v16, 0xffffffffL

    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    and-long v9, v9, v16

    .line 781
    .line 782
    long-to-int v9, v9

    .line 783
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 784
    .line 785
    .line 786
    move-result v9

    .line 787
    invoke-static {v11}, La/g7x;->v(La/x6x;)Z

    .line 788
    .line 789
    .line 790
    move-result v10

    .line 791
    if-eqz v10, :cond_32

    .line 792
    .line 793
    iput v5, v4, La/y78;->b:I

    .line 794
    .line 795
    invoke-virtual {v7}, La/vy40;->d()V

    .line 796
    .line 797
    .line 798
    :cond_32
    invoke-static {v11}, La/g7x;->w(La/x6x;)Z

    .line 799
    .line 800
    .line 801
    move-result v10

    .line 802
    if-nez v10, :cond_37

    .line 803
    .line 804
    invoke-static {v11}, La/g7x;->v(La/x6x;)Z

    .line 805
    .line 806
    .line 807
    move-result v10

    .line 808
    if-nez v10, :cond_37

    .line 809
    .line 810
    iget v9, v7, La/vy40;->b:I

    .line 811
    .line 812
    const/4 v10, 0x3

    .line 813
    if-ne v9, v10, :cond_33

    .line 814
    .line 815
    iget v9, v4, La/y78;->b:I

    .line 816
    .line 817
    add-int/lit8 v12, v9, 0x1

    .line 818
    .line 819
    iput v12, v4, La/y78;->b:I

    .line 820
    .line 821
    invoke-virtual {v7, v9, v11}, La/vy40;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    goto :goto_11

    .line 825
    :cond_33
    invoke-virtual {v7, v11}, La/vy40;->a(Ljava/lang/Object;)V

    .line 826
    .line 827
    .line 828
    :goto_11
    iget v9, v4, La/y78;->b:I

    .line 829
    .line 830
    if-ne v9, v10, :cond_34

    .line 831
    .line 832
    iput v5, v4, La/y78;->b:I

    .line 833
    .line 834
    :cond_34
    iget-object v4, v7, La/vy40;->a:[Ljava/lang/Object;

    .line 835
    .line 836
    iget v9, v7, La/vy40;->b:I

    .line 837
    .line 838
    move/from16 v12, p1

    .line 839
    .line 840
    move v10, v5

    .line 841
    :goto_12
    if-ge v10, v9, :cond_35

    .line 842
    .line 843
    aget-object v13, v4, v10

    .line 844
    .line 845
    check-cast v13, La/x6x;

    .line 846
    .line 847
    iget-wide v14, v13, La/x6x;->c:J

    .line 848
    .line 849
    shr-long v13, v14, p2

    .line 850
    .line 851
    long-to-int v13, v13

    .line 852
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 853
    .line 854
    .line 855
    move-result v13

    .line 856
    add-float/2addr v12, v13

    .line 857
    add-int/lit8 v10, v10, 0x1

    .line 858
    .line 859
    const-wide/16 v14, 0x0

    .line 860
    .line 861
    goto :goto_12

    .line 862
    :cond_35
    iget v4, v7, La/vy40;->b:I

    .line 863
    .line 864
    int-to-float v9, v4

    .line 865
    div-float/2addr v12, v9

    .line 866
    iget-object v9, v7, La/vy40;->a:[Ljava/lang/Object;

    .line 867
    .line 868
    move/from16 v13, p1

    .line 869
    .line 870
    move v10, v5

    .line 871
    :goto_13
    if-ge v10, v4, :cond_36

    .line 872
    .line 873
    aget-object v14, v9, v10

    .line 874
    .line 875
    check-cast v14, La/x6x;

    .line 876
    .line 877
    iget-wide v14, v14, La/x6x;->c:J

    .line 878
    .line 879
    and-long v14, v14, v16

    .line 880
    .line 881
    long-to-int v14, v14

    .line 882
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 883
    .line 884
    .line 885
    move-result v14

    .line 886
    add-float/2addr v13, v14

    .line 887
    add-int/lit8 v10, v10, 0x1

    .line 888
    .line 889
    goto :goto_13

    .line 890
    :cond_36
    iget v4, v7, La/vy40;->b:I

    .line 891
    .line 892
    int-to-float v4, v4

    .line 893
    div-float v9, v13, v4

    .line 894
    .line 895
    :cond_37
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    int-to-long v12, v4

    .line 900
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    int-to-long v9, v4

    .line 905
    shl-long v12, v12, p2

    .line 906
    .line 907
    and-long v9, v9, v16

    .line 908
    .line 909
    or-long/2addr v9, v12

    .line 910
    if-nez v2, :cond_38

    .line 911
    .line 912
    goto :goto_15

    .line 913
    :cond_38
    if-ne v3, v8, :cond_39

    .line 914
    .line 915
    shr-long v3, v9, p2

    .line 916
    .line 917
    long-to-int v3, v3

    .line 918
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 919
    .line 920
    .line 921
    move-result v3

    .line 922
    goto :goto_14

    .line 923
    :cond_39
    const/4 v4, 0x2

    .line 924
    if-ne v3, v4, :cond_3b

    .line 925
    .line 926
    and-long v3, v9, v16

    .line 927
    .line 928
    long-to-int v3, v3

    .line 929
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    :goto_14
    sget-object v4, La/ma80;->b:La/ma80;

    .line 934
    .line 935
    if-ne v2, v4, :cond_3a

    .line 936
    .line 937
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    int-to-long v2, v2

    .line 942
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    int-to-long v9, v4

    .line 947
    shl-long v2, v2, p2

    .line 948
    .line 949
    and-long v9, v9, v16

    .line 950
    .line 951
    or-long/2addr v9, v2

    .line 952
    goto :goto_15

    .line 953
    :cond_3a
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    int-to-long v9, v2

    .line 958
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    int-to-long v2, v2

    .line 963
    shl-long v9, v9, p2

    .line 964
    .line 965
    and-long v2, v2, v16

    .line 966
    .line 967
    or-long/2addr v9, v2

    .line 968
    :cond_3b
    :goto_15
    iget-wide v2, v11, La/x6x;->b:J

    .line 969
    .line 970
    iget-object v1, v1, La/j6u0;->a:La/r34;

    .line 971
    .line 972
    invoke-virtual {v1, v2, v3, v9, v10}, La/r34;->b(JJ)V

    .line 973
    .line 974
    .line 975
    sget-object v1, La/bmd;->t:La/zfn;

    .line 976
    .line 977
    invoke-static {v0, v1}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v1

    .line 981
    check-cast v1, La/wgu0;

    .line 982
    .line 983
    invoke-interface {v1}, La/wgu0;->g()F

    .line 984
    .line 985
    .line 986
    move-result v1

    .line 987
    invoke-virtual {v6}, La/f7x;->d()La/j6u0;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    invoke-static {v1, v1}, La/wpm0;->g(FF)J

    .line 992
    .line 993
    .line 994
    move-result-wide v3

    .line 995
    invoke-virtual {v2, v3, v4}, La/j6u0;->a(J)J

    .line 996
    .line 997
    .line 998
    move-result-wide v1

    .line 999
    invoke-virtual {v6}, La/f7x;->d()La/j6u0;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    iget-object v3, v3, La/j6u0;->a:La/r34;

    .line 1004
    .line 1005
    iget-object v4, v3, La/r34;->b:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v4, La/i6u0;

    .line 1008
    .line 1009
    iget-object v7, v4, La/i6u0;->d:[La/zaj;

    .line 1010
    .line 1011
    const/4 v9, 0x0

    .line 1012
    invoke-static {v9, v7}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1013
    .line 1014
    .line 1015
    iput v5, v4, La/i6u0;->e:I

    .line 1016
    .line 1017
    iget-object v4, v3, La/r34;->c:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v4, La/i6u0;

    .line 1020
    .line 1021
    iget-object v7, v4, La/i6u0;->d:[La/zaj;

    .line 1022
    .line 1023
    invoke-static {v9, v7}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1024
    .line 1025
    .line 1026
    iput v5, v4, La/i6u0;->e:I

    .line 1027
    .line 1028
    const-wide/16 v4, 0x0

    .line 1029
    .line 1030
    iput-wide v4, v3, La/r34;->a:J

    .line 1031
    .line 1032
    new-instance v3, La/qdl;

    .line 1033
    .line 1034
    invoke-static {v1, v2}, La/uel;->c(J)J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v1

    .line 1038
    invoke-direct {v3, v8, v1, v2}, La/qdl;-><init>(ZJ)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v0, v3}, La/hel;->h1(La/rdl;)V

    .line 1042
    .line 1043
    .line 1044
    goto :goto_16

    .line 1045
    :cond_3c
    invoke-virtual {v0, v7}, La/hel;->h1(La/rdl;)V

    .line 1046
    .line 1047
    .line 1048
    :goto_16
    invoke-virtual {v6}, La/f7x;->a()V

    .line 1049
    .line 1050
    .line 1051
    return-void

    .line 1052
    :cond_3d
    iget-wide v0, v1, La/x6x;->a:J

    .line 1053
    .line 1054
    iput-wide v0, v4, La/c7x;->a:J

    .line 1055
    .line 1056
    return-void

    .line 1057
    :cond_3e
    const/16 p1, 0x0

    .line 1058
    .line 1059
    iget-boolean v1, v11, La/x6x;->i:Z

    .line 1060
    .line 1061
    if-eqz v1, :cond_3f

    .line 1062
    .line 1063
    invoke-virtual {v0, v7}, La/hel;->h1(La/rdl;)V

    .line 1064
    .line 1065
    .line 1066
    return-void

    .line 1067
    :cond_3f
    iget-object v1, v0, La/hel;->q:La/ma80;

    .line 1068
    .line 1069
    new-instance v2, La/v6x;

    .line 1070
    .line 1071
    invoke-direct {v2, v3}, La/v6x;-><init>(I)V

    .line 1072
    .line 1073
    .line 1074
    invoke-static {v11, v1, v2, v8}, La/g7x;->U(La/x6x;La/ma80;La/v6x;Z)J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v1

    .line 1078
    invoke-static {v1, v2}, La/ne60;->d(J)F

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    cmpg-float v1, v1, p1

    .line 1083
    .line 1084
    if-nez v1, :cond_40

    .line 1085
    .line 1086
    goto :goto_17

    .line 1087
    :cond_40
    iget-object v0, v0, La/hel;->q:La/ma80;

    .line 1088
    .line 1089
    new-instance v1, La/v6x;

    .line 1090
    .line 1091
    invoke-direct {v1, v3}, La/v6x;-><init>(I)V

    .line 1092
    .line 1093
    .line 1094
    invoke-static {v11, v0, v1, v5}, La/g7x;->U(La/x6x;La/ma80;La/v6x;Z)J

    .line 1095
    .line 1096
    .line 1097
    move-result-wide v0

    .line 1098
    new-instance v2, La/v6x;

    .line 1099
    .line 1100
    invoke-direct {v2, v3}, La/v6x;-><init>(I)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v6, v11, v2, v0, v1}, La/f7x;->e(La/x6x;La/v6x;J)V

    .line 1104
    .line 1105
    .line 1106
    iput-boolean v8, v11, La/x6x;->i:Z

    .line 1107
    .line 1108
    return-void

    .line 1109
    :cond_41
    invoke-static {}, La/t9f;->b()V

    .line 1110
    .line 1111
    .line 1112
    :cond_42
    :goto_17
    return-void
.end method

.method public final c1()V
    .locals 3

    .line 1
    iget-object v0, p0, La/hel;->v:La/nel;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, La/hel;->t:La/gy40;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, La/mel;

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/mel;-><init>(La/nel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, La/gy40;->b(La/nlx;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, La/hel;->v:La/nel;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public abstract d1(La/ic1;La/xb2;)Ljava/lang/Object;
.end method

.method public final e1()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, La/hel;->z:J

    .line 4
    .line 5
    iget-object v0, p0, La/hel;->y:La/jdl;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, La/jdl;

    .line 11
    .line 12
    sget-object v2, La/idl;->c:La/idl;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, v0, La/jdl;->a:La/idl;

    .line 18
    .line 19
    iput-boolean v1, v0, La/jdl;->b:Z

    .line 20
    .line 21
    iput-boolean v1, v0, La/jdl;->c:Z

    .line 22
    .line 23
    iput-object v0, p0, La/hel;->y:La/jdl;

    .line 24
    .line 25
    :cond_0
    sget-object v2, La/idl;->c:La/idl;

    .line 26
    .line 27
    iput-object v2, v0, La/jdl;->a:La/idl;

    .line 28
    .line 29
    iput-boolean v1, v0, La/jdl;->b:Z

    .line 30
    .line 31
    iput-boolean v1, v0, La/jdl;->c:Z

    .line 32
    .line 33
    iput-object v0, p0, La/hel;->g1:La/qcc;

    .line 34
    .line 35
    return-void
.end method

.method public final f1(La/dpa0;JLa/hac;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/hel;->f1:La/kdl;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/kdl;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, La/kdl;->a:La/dpa0;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, La/kdl;->b:J

    .line 19
    .line 20
    iput-object v0, p0, La/hel;->f1:La/kdl;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, La/kdl;->a:La/dpa0;

    .line 23
    .line 24
    iput-wide p2, v0, La/kdl;->b:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, La/hac;->b:J

    .line 29
    .line 30
    iput-object v0, p0, La/hel;->g1:La/qcc;

    .line 31
    .line 32
    return-void
.end method

.method public h(La/woa0;La/xoa0;J)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iput-boolean v3, v0, La/hel;->x:Z

    .line 9
    .line 10
    iget-boolean v4, v0, La/hel;->s:Z

    .line 11
    .line 12
    if-eqz v4, :cond_3a

    .line 13
    .line 14
    iget-object v4, v0, La/hel;->A:La/amt;

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    new-instance v4, La/amt;

    .line 19
    .line 20
    invoke-direct {v4, v0}, La/amt;-><init>(La/zlt;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v4}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 24
    .line 25
    .line 26
    iput-object v4, v0, La/hel;->A:La/amt;

    .line 27
    .line 28
    :cond_0
    iget-object v4, v0, La/hel;->g1:La/qcc;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    iget-object v4, v0, La/hel;->y:La/jdl;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    new-instance v4, La/jdl;

    .line 38
    .line 39
    sget-object v6, La/idl;->c:La/idl;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v6, v4, La/jdl;->a:La/idl;

    .line 45
    .line 46
    iput-boolean v5, v4, La/jdl;->b:Z

    .line 47
    .line 48
    iput-boolean v5, v4, La/jdl;->c:Z

    .line 49
    .line 50
    iput-object v4, v0, La/hel;->y:La/jdl;

    .line 51
    .line 52
    :cond_1
    iput-object v4, v0, La/hel;->g1:La/qcc;

    .line 53
    .line 54
    :cond_2
    instance-of v6, v4, La/jdl;

    .line 55
    .line 56
    const-wide v7, 0x7fffffffffffffffL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const-wide/16 v9, 0x0

    .line 62
    .line 63
    if-eqz v6, :cond_b

    .line 64
    .line 65
    check-cast v4, La/jdl;

    .line 66
    .line 67
    iget-object v6, v1, La/woa0;->a:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    goto/16 :goto_14

    .line 76
    .line 77
    :cond_3
    invoke-static {v1, v5}, La/tto0;->e(La/woa0;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_4

    .line 82
    .line 83
    goto/16 :goto_14

    .line 84
    .line 85
    :cond_4
    iget-object v1, v1, La/woa0;->a:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/dpa0;

    .line 92
    .line 93
    iget-object v5, v4, La/jdl;->a:La/idl;

    .line 94
    .line 95
    sget-object v6, La/del;->a:[I

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    aget v5, v6, v5

    .line 102
    .line 103
    if-ne v5, v3, :cond_6

    .line 104
    .line 105
    invoke-virtual {v0}, La/hel;->r1()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_5

    .line 110
    .line 111
    sget-object v5, La/idl;->a:La/idl;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    sget-object v5, La/idl;->b:La/idl;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_6
    iget-object v5, v4, La/jdl;->a:La/idl;

    .line 118
    .line 119
    :goto_0
    iput-object v5, v4, La/jdl;->a:La/idl;

    .line 120
    .line 121
    sget-object v6, La/xoa0;->a:La/xoa0;

    .line 122
    .line 123
    if-ne v2, v6, :cond_8

    .line 124
    .line 125
    sget-object v6, La/idl;->b:La/idl;

    .line 126
    .line 127
    if-ne v5, v6, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1}, La/dpa0;->a()V

    .line 130
    .line 131
    .line 132
    iput-boolean v3, v4, La/jdl;->b:Z

    .line 133
    .line 134
    :cond_7
    iput-boolean v3, v4, La/jdl;->c:Z

    .line 135
    .line 136
    :cond_8
    sget-object v3, La/xoa0;->b:La/xoa0;

    .line 137
    .line 138
    if-ne v2, v3, :cond_3a

    .line 139
    .line 140
    sget-object v2, La/idl;->a:La/idl;

    .line 141
    .line 142
    if-ne v5, v2, :cond_9

    .line 143
    .line 144
    iget-wide v2, v1, La/dpa0;->a:J

    .line 145
    .line 146
    const-wide/16 v4, 0x0

    .line 147
    .line 148
    const/16 v6, 0xc

    .line 149
    .line 150
    invoke-static/range {v0 .. v6}, La/hel;->g1(La/hel;La/dpa0;JJI)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_9
    iget-boolean v2, v4, La/jdl;->b:Z

    .line 155
    .line 156
    if-eqz v2, :cond_3a

    .line 157
    .line 158
    invoke-virtual {v0, v1, v1, v9, v10}, La/hel;->q1(La/dpa0;La/dpa0;J)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v9, v10, v1}, La/hel;->p1(JLa/dpa0;)V

    .line 162
    .line 163
    .line 164
    iget-wide v1, v1, La/dpa0;->a:J

    .line 165
    .line 166
    iget-object v3, v0, La/hel;->Y:La/mdl;

    .line 167
    .line 168
    if-nez v3, :cond_a

    .line 169
    .line 170
    new-instance v3, La/mdl;

    .line 171
    .line 172
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-wide v7, v3, La/mdl;->a:J

    .line 176
    .line 177
    iput-object v3, v0, La/hel;->Y:La/mdl;

    .line 178
    .line 179
    :cond_a
    iput-wide v1, v3, La/mdl;->a:J

    .line 180
    .line 181
    iput-object v3, v0, La/hel;->g1:La/qcc;

    .line 182
    .line 183
    return-void

    .line 184
    :cond_b
    instance-of v6, v4, La/ldl;

    .line 185
    .line 186
    const/4 v11, 0x0

    .line 187
    if-eqz v6, :cond_25

    .line 188
    .line 189
    check-cast v4, La/ldl;

    .line 190
    .line 191
    sget-object v6, La/xoa0;->a:La/xoa0;

    .line 192
    .line 193
    if-ne v2, v6, :cond_c

    .line 194
    .line 195
    goto/16 :goto_14

    .line 196
    .line 197
    :cond_c
    iget-object v1, v1, La/woa0;->a:Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    move v9, v5

    .line 204
    :goto_1
    if-ge v9, v6, :cond_e

    .line 205
    .line 206
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    move-object v12, v10

    .line 211
    check-cast v12, La/dpa0;

    .line 212
    .line 213
    iget-wide v12, v12, La/dpa0;->a:J

    .line 214
    .line 215
    iget-wide v14, v4, La/ldl;->b:J

    .line 216
    .line 217
    invoke-static {v12, v13, v14, v15}, La/b5x;->I(JJ)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-eqz v12, :cond_d

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_e
    move-object v10, v11

    .line 228
    :goto_2
    check-cast v10, La/dpa0;

    .line 229
    .line 230
    if-nez v10, :cond_12

    .line 231
    .line 232
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    move v9, v5

    .line 237
    :goto_3
    if-ge v9, v6, :cond_10

    .line 238
    .line 239
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    move-object v12, v10

    .line 244
    check-cast v12, La/dpa0;

    .line 245
    .line 246
    iget-boolean v12, v12, La/dpa0;->d:Z

    .line 247
    .line 248
    if-eqz v12, :cond_f

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_f
    add-int/lit8 v9, v9, 0x1

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_10
    move-object v10, v11

    .line 255
    :goto_4
    check-cast v10, La/dpa0;

    .line 256
    .line 257
    if-nez v10, :cond_11

    .line 258
    .line 259
    invoke-virtual {v0}, La/hel;->e1()V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_11
    iget-wide v12, v10, La/dpa0;->a:J

    .line 264
    .line 265
    iput-wide v12, v4, La/ldl;->b:J

    .line 266
    .line 267
    :cond_12
    sget-object v6, La/xoa0;->b:La/xoa0;

    .line 268
    .line 269
    const-string v9, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 270
    .line 271
    const-string v12, "AwaitTouchSlop.initialDown was not initialized"

    .line 272
    .line 273
    if-ne v2, v6, :cond_15

    .line 274
    .line 275
    invoke-virtual {v10}, La/dpa0;->c()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-nez v6, :cond_1f

    .line 280
    .line 281
    invoke-static {v10}, La/x2x;->L(La/dpa0;)Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-eqz v6, :cond_17

    .line 286
    .line 287
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    move v6, v5

    .line 292
    :goto_5
    if-ge v6, v3, :cond_14

    .line 293
    .line 294
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    move-object v8, v7

    .line 299
    check-cast v8, La/dpa0;

    .line 300
    .line 301
    iget-boolean v8, v8, La/dpa0;->d:Z

    .line 302
    .line 303
    if-eqz v8, :cond_13

    .line 304
    .line 305
    move-object v11, v7

    .line 306
    goto :goto_6

    .line 307
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_14
    :goto_6
    check-cast v11, La/dpa0;

    .line 311
    .line 312
    if-nez v11, :cond_16

    .line 313
    .line 314
    invoke-virtual {v0}, La/hel;->e1()V

    .line 315
    .line 316
    .line 317
    :cond_15
    :goto_7
    move-object v6, v4

    .line 318
    goto/16 :goto_a

    .line 319
    .line 320
    :cond_16
    iget-wide v6, v11, La/dpa0;->a:J

    .line 321
    .line 322
    iput-wide v6, v4, La/ldl;->b:J

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_17
    sget-object v1, La/bmd;->t:La/zfn;

    .line 326
    .line 327
    invoke-static {v0, v1}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    check-cast v1, La/wgu0;

    .line 332
    .line 333
    iget v6, v10, La/dpa0;->i:I

    .line 334
    .line 335
    invoke-static {v1, v6}, La/bel;->i(La/wgu0;I)F

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    iget-object v6, v0, La/hel;->i1:La/hac;

    .line 340
    .line 341
    if-eqz v6, :cond_1e

    .line 342
    .line 343
    invoke-static {v10, v3}, La/x2x;->j0(La/dpa0;Z)J

    .line 344
    .line 345
    .line 346
    move-result-wide v13

    .line 347
    invoke-static {v6, v13, v14, v1}, La/hac;->u(La/hac;JF)J

    .line 348
    .line 349
    .line 350
    move-result-wide v13

    .line 351
    const-wide v15, 0x7fffffff7fffffffL

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    and-long/2addr v15, v13

    .line 357
    const-wide v17, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    cmp-long v1, v15, v17

    .line 363
    .line 364
    if-eqz v1, :cond_1d

    .line 365
    .line 366
    invoke-static {v10, v5}, La/x2x;->j0(La/dpa0;Z)J

    .line 367
    .line 368
    .line 369
    move-result-wide v7

    .line 370
    move-object v6, v4

    .line 371
    iget-wide v3, v0, La/hel;->z:J

    .line 372
    .line 373
    invoke-static {v3, v4, v7, v8}, La/ne60;->f(JJ)J

    .line 374
    .line 375
    .line 376
    move-result-wide v3

    .line 377
    iput-wide v3, v0, La/hel;->z:J

    .line 378
    .line 379
    const/16 v1, 0x20

    .line 380
    .line 381
    shr-long/2addr v3, v1

    .line 382
    long-to-int v1, v3

    .line 383
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    iget-wide v3, v0, La/hel;->z:J

    .line 392
    .line 393
    const-wide v7, 0xffffffffL

    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    and-long/2addr v3, v7

    .line 399
    long-to-int v3, v3

    .line 400
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    float-to-double v3, v3

    .line 409
    float-to-double v7, v1

    .line 410
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 411
    .line 412
    .line 413
    move-result-wide v3

    .line 414
    double-to-float v1, v3

    .line 415
    const v3, 0x42652ee1

    .line 416
    .line 417
    .line 418
    mul-float/2addr v1, v3

    .line 419
    iget-object v3, v0, La/hel;->q:La/ma80;

    .line 420
    .line 421
    if-nez v3, :cond_18

    .line 422
    .line 423
    :goto_8
    const/4 v3, 0x1

    .line 424
    goto :goto_9

    .line 425
    :cond_18
    sget-object v4, La/uel;->a:La/bk9;

    .line 426
    .line 427
    sget-object v4, La/ma80;->b:La/ma80;

    .line 428
    .line 429
    const/high16 v7, 0x41f00000    # 30.0f

    .line 430
    .line 431
    if-ne v3, v4, :cond_1a

    .line 432
    .line 433
    cmpg-float v3, v1, v7

    .line 434
    .line 435
    if-gtz v3, :cond_19

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_19
    move v3, v5

    .line 439
    goto :goto_9

    .line 440
    :cond_1a
    cmpl-float v3, v1, v7

    .line 441
    .line 442
    if-lez v3, :cond_19

    .line 443
    .line 444
    const/high16 v3, 0x42b40000    # 90.0f

    .line 445
    .line 446
    cmpg-float v3, v1, v3

    .line 447
    .line 448
    if-gtz v3, :cond_19

    .line 449
    .line 450
    goto :goto_8

    .line 451
    :goto_9
    new-instance v4, La/hie0;

    .line 452
    .line 453
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 454
    .line 455
    .line 456
    new-instance v7, La/cel;

    .line 457
    .line 458
    invoke-direct {v7, v1, v4, v5}, La/cel;-><init>(FLjava/lang/Object;B)V

    .line 459
    .line 460
    .line 461
    sget-object v1, La/uel;->a:La/bk9;

    .line 462
    .line 463
    new-instance v1, La/edl;

    .line 464
    .line 465
    const/4 v8, 0x2

    .line 466
    invoke-direct {v1, v7, v8}, La/edl;-><init>(Ljava/lang/Object;B)V

    .line 467
    .line 468
    .line 469
    new-instance v7, La/dht;

    .line 470
    .line 471
    const/4 v8, 0x6

    .line 472
    invoke-direct {v7, v1, v8}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 473
    .line 474
    .line 475
    sget-object v1, La/amt;->p:La/ddk;

    .line 476
    .line 477
    invoke-static {v0, v1, v7}, La/etm0;->t(La/yzj;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 478
    .line 479
    .line 480
    if-nez v3, :cond_1b

    .line 481
    .line 482
    iget-boolean v1, v4, La/hie0;->a:Z

    .line 483
    .line 484
    if-eqz v1, :cond_1b

    .line 485
    .line 486
    const/4 v15, 0x1

    .line 487
    iput-boolean v15, v6, La/ldl;->c:Z

    .line 488
    .line 489
    goto :goto_a

    .line 490
    :cond_1b
    invoke-virtual {v10}, La/dpa0;->a()V

    .line 491
    .line 492
    .line 493
    iget-object v1, v6, La/ldl;->a:La/dpa0;

    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v1, v10, v13, v14}, La/hel;->q1(La/dpa0;La/dpa0;J)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0, v13, v14, v10}, La/hel;->p1(JLa/dpa0;)V

    .line 502
    .line 503
    .line 504
    iget-wide v3, v10, La/dpa0;->a:J

    .line 505
    .line 506
    iget-object v1, v0, La/hel;->Y:La/mdl;

    .line 507
    .line 508
    if-nez v1, :cond_1c

    .line 509
    .line 510
    new-instance v1, La/mdl;

    .line 511
    .line 512
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 513
    .line 514
    .line 515
    const-wide v7, 0x7fffffffffffffffL

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    iput-wide v7, v1, La/mdl;->a:J

    .line 521
    .line 522
    iput-object v1, v0, La/hel;->Y:La/mdl;

    .line 523
    .line 524
    :cond_1c
    iput-wide v3, v1, La/mdl;->a:J

    .line 525
    .line 526
    iput-object v1, v0, La/hel;->g1:La/qcc;

    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_1d
    move v15, v3

    .line 530
    move-object v6, v4

    .line 531
    iput-boolean v15, v6, La/ldl;->c:Z

    .line 532
    .line 533
    iget-wide v3, v0, La/hel;->z:J

    .line 534
    .line 535
    invoke-static {v10, v15}, La/x2x;->j0(La/dpa0;Z)J

    .line 536
    .line 537
    .line 538
    move-result-wide v7

    .line 539
    invoke-static {v3, v4, v7, v8}, La/ne60;->f(JJ)J

    .line 540
    .line 541
    .line 542
    move-result-wide v3

    .line 543
    iput-wide v3, v0, La/hel;->z:J

    .line 544
    .line 545
    goto :goto_a

    .line 546
    :cond_1e
    const-string v0, "Touch slop detector not initialized."

    .line 547
    .line 548
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    return-void

    .line 552
    :cond_1f
    move-object v6, v4

    .line 553
    iget-object v1, v6, La/ldl;->a:La/dpa0;

    .line 554
    .line 555
    if-eqz v1, :cond_21

    .line 556
    .line 557
    iget-wide v3, v6, La/ldl;->b:J

    .line 558
    .line 559
    iget-object v7, v0, La/hel;->i1:La/hac;

    .line 560
    .line 561
    if-eqz v7, :cond_20

    .line 562
    .line 563
    invoke-virtual {v0, v1, v3, v4, v7}, La/hel;->f1(La/dpa0;JLa/hac;)V

    .line 564
    .line 565
    .line 566
    goto :goto_a

    .line 567
    :cond_20
    invoke-static {v9}, La/jf4;->o(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :cond_21
    invoke-static {v12}, La/jf4;->o(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :goto_a
    sget-object v1, La/xoa0;->c:La/xoa0;

    .line 576
    .line 577
    if-ne v2, v1, :cond_3a

    .line 578
    .line 579
    iget-boolean v1, v6, La/ldl;->c:Z

    .line 580
    .line 581
    if-eqz v1, :cond_3a

    .line 582
    .line 583
    invoke-virtual {v10}, La/dpa0;->c()Z

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    if-eqz v1, :cond_24

    .line 588
    .line 589
    iget-object v1, v6, La/ldl;->a:La/dpa0;

    .line 590
    .line 591
    if-eqz v1, :cond_23

    .line 592
    .line 593
    iget-wide v2, v6, La/ldl;->b:J

    .line 594
    .line 595
    iget-object v4, v0, La/hel;->i1:La/hac;

    .line 596
    .line 597
    if-eqz v4, :cond_22

    .line 598
    .line 599
    invoke-virtual {v0, v1, v2, v3, v4}, La/hel;->f1(La/dpa0;JLa/hac;)V

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :cond_22
    invoke-static {v9}, La/jf4;->o(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :cond_23
    invoke-static {v12}, La/jf4;->o(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    return-void

    .line 611
    :cond_24
    iput-boolean v5, v6, La/ldl;->c:Z

    .line 612
    .line 613
    return-void

    .line 614
    :cond_25
    instance-of v3, v4, La/kdl;

    .line 615
    .line 616
    if-eqz v3, :cond_2d

    .line 617
    .line 618
    check-cast v4, La/kdl;

    .line 619
    .line 620
    sget-object v3, La/xoa0;->c:La/xoa0;

    .line 621
    .line 622
    if-eq v2, v3, :cond_26

    .line 623
    .line 624
    goto/16 :goto_14

    .line 625
    .line 626
    :cond_26
    iget-object v1, v1, La/woa0;->a:Ljava/util/List;

    .line 627
    .line 628
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    move v3, v5

    .line 633
    :goto_b
    if-ge v3, v2, :cond_28

    .line 634
    .line 635
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v6

    .line 639
    check-cast v6, La/dpa0;

    .line 640
    .line 641
    invoke-virtual {v6}, La/dpa0;->c()Z

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    if-eqz v6, :cond_27

    .line 646
    .line 647
    move v3, v5

    .line 648
    goto :goto_c

    .line 649
    :cond_27
    add-int/lit8 v3, v3, 0x1

    .line 650
    .line 651
    goto :goto_b

    .line 652
    :cond_28
    const/4 v3, 0x1

    .line 653
    :goto_c
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    :goto_d
    if-ge v5, v2, :cond_2c

    .line 658
    .line 659
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    check-cast v6, La/dpa0;

    .line 664
    .line 665
    iget-boolean v6, v6, La/dpa0;->d:Z

    .line 666
    .line 667
    if-eqz v6, :cond_2b

    .line 668
    .line 669
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    if-eqz v2, :cond_29

    .line 674
    .line 675
    goto :goto_e

    .line 676
    :cond_29
    if-eqz v3, :cond_3a

    .line 677
    .line 678
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    check-cast v1, La/dpa0;

    .line 683
    .line 684
    iget-wide v1, v1, La/dpa0;->c:J

    .line 685
    .line 686
    iget-object v3, v4, La/kdl;->a:La/dpa0;

    .line 687
    .line 688
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    iget-wide v5, v3, La/dpa0;->c:J

    .line 692
    .line 693
    invoke-static {v1, v2, v5, v6}, La/ne60;->e(JJ)J

    .line 694
    .line 695
    .line 696
    move-result-wide v1

    .line 697
    move-wide v2, v1

    .line 698
    iget-object v1, v4, La/kdl;->a:La/dpa0;

    .line 699
    .line 700
    if-eqz v1, :cond_2a

    .line 701
    .line 702
    move-wide v5, v2

    .line 703
    iget-wide v2, v4, La/kdl;->b:J

    .line 704
    .line 705
    move-wide v4, v5

    .line 706
    const/16 v6, 0x8

    .line 707
    .line 708
    invoke-static/range {v0 .. v6}, La/hel;->g1(La/hel;La/dpa0;JJI)V

    .line 709
    .line 710
    .line 711
    return-void

    .line 712
    :cond_2a
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 713
    .line 714
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    return-void

    .line 718
    :cond_2b
    add-int/lit8 v5, v5, 0x1

    .line 719
    .line 720
    goto :goto_d

    .line 721
    :cond_2c
    :goto_e
    invoke-virtual {v0}, La/hel;->e1()V

    .line 722
    .line 723
    .line 724
    return-void

    .line 725
    :cond_2d
    instance-of v3, v4, La/mdl;

    .line 726
    .line 727
    if-eqz v3, :cond_39

    .line 728
    .line 729
    check-cast v4, La/mdl;

    .line 730
    .line 731
    sget-object v3, La/xoa0;->b:La/xoa0;

    .line 732
    .line 733
    if-eq v2, v3, :cond_2e

    .line 734
    .line 735
    goto/16 :goto_14

    .line 736
    .line 737
    :cond_2e
    iget-wide v2, v4, La/mdl;->a:J

    .line 738
    .line 739
    iget-object v6, v1, La/woa0;->a:Ljava/util/List;

    .line 740
    .line 741
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 742
    .line 743
    .line 744
    move-result v7

    .line 745
    move v8, v5

    .line 746
    :goto_f
    if-ge v8, v7, :cond_30

    .line 747
    .line 748
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v12

    .line 752
    move-object v13, v12

    .line 753
    check-cast v13, La/dpa0;

    .line 754
    .line 755
    iget-wide v13, v13, La/dpa0;->a:J

    .line 756
    .line 757
    invoke-static {v13, v14, v2, v3}, La/b5x;->I(JJ)Z

    .line 758
    .line 759
    .line 760
    move-result v13

    .line 761
    if-eqz v13, :cond_2f

    .line 762
    .line 763
    goto :goto_10

    .line 764
    :cond_2f
    add-int/lit8 v8, v8, 0x1

    .line 765
    .line 766
    goto :goto_f

    .line 767
    :cond_30
    move-object v12, v11

    .line 768
    :goto_10
    check-cast v12, La/dpa0;

    .line 769
    .line 770
    if-nez v12, :cond_31

    .line 771
    .line 772
    goto/16 :goto_14

    .line 773
    .line 774
    :cond_31
    invoke-static {v12}, La/x2x;->L(La/dpa0;)Z

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    sget-object v3, La/ndl;->a:La/ndl;

    .line 779
    .line 780
    if-eqz v2, :cond_36

    .line 781
    .line 782
    iget-object v1, v1, La/woa0;->a:Ljava/util/List;

    .line 783
    .line 784
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    move v6, v5

    .line 789
    :goto_11
    if-ge v6, v2, :cond_33

    .line 790
    .line 791
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    move-object v8, v7

    .line 796
    check-cast v8, La/dpa0;

    .line 797
    .line 798
    iget-boolean v8, v8, La/dpa0;->d:Z

    .line 799
    .line 800
    if-eqz v8, :cond_32

    .line 801
    .line 802
    goto :goto_12

    .line 803
    :cond_32
    add-int/lit8 v6, v6, 0x1

    .line 804
    .line 805
    goto :goto_11

    .line 806
    :cond_33
    move-object v7, v11

    .line 807
    :goto_12
    check-cast v7, La/dpa0;

    .line 808
    .line 809
    if-nez v7, :cond_35

    .line 810
    .line 811
    invoke-virtual {v12}, La/dpa0;->c()Z

    .line 812
    .line 813
    .line 814
    move-result v1

    .line 815
    if-nez v1, :cond_34

    .line 816
    .line 817
    invoke-static {v12}, La/x2x;->L(La/dpa0;)Z

    .line 818
    .line 819
    .line 820
    move-result v1

    .line 821
    if-eqz v1, :cond_34

    .line 822
    .line 823
    sget-object v1, La/bmd;->t:La/zfn;

    .line 824
    .line 825
    invoke-static {v0, v1}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    check-cast v1, La/wgu0;

    .line 830
    .line 831
    invoke-interface {v1}, La/wgu0;->g()F

    .line 832
    .line 833
    .line 834
    move-result v1

    .line 835
    invoke-virtual {v0}, La/hel;->o1()La/j6u0;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-static {v2, v12}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0}, La/hel;->o1()La/j6u0;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    invoke-static {v1, v1}, La/wpm0;->g(FF)J

    .line 847
    .line 848
    .line 849
    move-result-wide v3

    .line 850
    invoke-virtual {v2, v3, v4}, La/j6u0;->a(J)J

    .line 851
    .line 852
    .line 853
    move-result-wide v1

    .line 854
    invoke-virtual {v0}, La/hel;->o1()La/j6u0;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    iget-object v3, v3, La/j6u0;->a:La/r34;

    .line 859
    .line 860
    iget-object v4, v3, La/r34;->b:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v4, La/i6u0;

    .line 863
    .line 864
    iget-object v6, v4, La/i6u0;->d:[La/zaj;

    .line 865
    .line 866
    invoke-static {v11, v6}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    iput v5, v4, La/i6u0;->e:I

    .line 870
    .line 871
    iget-object v4, v3, La/r34;->c:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v4, La/i6u0;

    .line 874
    .line 875
    iget-object v6, v4, La/i6u0;->d:[La/zaj;

    .line 876
    .line 877
    invoke-static {v11, v6}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    iput v5, v4, La/i6u0;->e:I

    .line 881
    .line 882
    iput-wide v9, v3, La/r34;->a:J

    .line 883
    .line 884
    invoke-virtual {v0}, La/hel;->n1()La/htb;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    new-instance v4, La/qdl;

    .line 889
    .line 890
    invoke-static {v1, v2}, La/uel;->c(J)J

    .line 891
    .line 892
    .line 893
    move-result-wide v1

    .line 894
    invoke-direct {v4, v5, v1, v2}, La/qdl;-><init>(ZJ)V

    .line 895
    .line 896
    .line 897
    invoke-interface {v3, v4}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    iput-boolean v5, v0, La/hel;->x:Z

    .line 901
    .line 902
    goto :goto_13

    .line 903
    :cond_34
    invoke-virtual {v0}, La/hel;->n1()La/htb;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-interface {v1, v3}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    :goto_13
    invoke-virtual {v0}, La/hel;->e1()V

    .line 911
    .line 912
    .line 913
    return-void

    .line 914
    :cond_35
    iget-wide v0, v7, La/dpa0;->a:J

    .line 915
    .line 916
    iput-wide v0, v4, La/mdl;->a:J

    .line 917
    .line 918
    return-void

    .line 919
    :cond_36
    invoke-virtual {v12}, La/dpa0;->c()Z

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    if-eqz v1, :cond_37

    .line 924
    .line 925
    invoke-virtual {v0}, La/hel;->n1()La/htb;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-interface {v0, v3}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    return-void

    .line 933
    :cond_37
    const/4 v15, 0x1

    .line 934
    invoke-static {v12, v15}, La/x2x;->j0(La/dpa0;Z)J

    .line 935
    .line 936
    .line 937
    move-result-wide v1

    .line 938
    invoke-static {v1, v2}, La/ne60;->d(J)F

    .line 939
    .line 940
    .line 941
    move-result v1

    .line 942
    const/4 v2, 0x0

    .line 943
    cmpg-float v1, v1, v2

    .line 944
    .line 945
    if-nez v1, :cond_38

    .line 946
    .line 947
    goto :goto_14

    .line 948
    :cond_38
    invoke-static {v12, v5}, La/x2x;->j0(La/dpa0;Z)J

    .line 949
    .line 950
    .line 951
    move-result-wide v1

    .line 952
    invoke-virtual {v0, v1, v2, v12}, La/hel;->p1(JLa/dpa0;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12}, La/dpa0;->a()V

    .line 956
    .line 957
    .line 958
    return-void

    .line 959
    :cond_39
    invoke-static {}, La/t9f;->b()V

    .line 960
    .line 961
    .line 962
    :cond_3a
    :goto_14
    return-void
.end method

.method public final h1(La/rdl;)V
    .locals 1

    .line 1
    instance-of v0, p1, La/pdl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/hel;->w:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, La/hel;->w:Z

    .line 11
    .line 12
    invoke-virtual {p0}, La/hel;->s1()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/hel;->n1()La/htb;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public i1(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public j1(La/qdl;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/oa;

    .line 11
    .line 12
    const/16 v2, 0xe

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, p1, v3, v2}, La/oa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x3

    .line 19
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final k1(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/eel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/eel;

    .line 7
    .line 8
    iget v1, v0, La/eel;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/eel;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/eel;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/eel;-><init>(La/hel;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/eel;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/eel;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/hel;->v:La/nel;

    .line 51
    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object v2, p0, La/hel;->t:La/gy40;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    new-instance v5, La/mel;

    .line 59
    .line 60
    invoke-direct {v5, p1}, La/mel;-><init>(La/nel;)V

    .line 61
    .line 62
    .line 63
    iput v4, v0, La/eel;->k:I

    .line 64
    .line 65
    invoke-virtual {v2, v5, v0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    iput-object v3, p0, La/hel;->v:La/nel;

    .line 73
    .line 74
    :cond_4
    new-instance p1, La/qdl;

    .line 75
    .line 76
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {p1, v2, v0, v1}, La/qdl;-><init>(ZJ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, La/hel;->j1(La/qdl;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0
.end method

.method public final l1(La/pdl;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/fel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/fel;

    .line 7
    .line 8
    iget v1, v0, La/fel;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fel;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fel;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/fel;-><init>(La/hel;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/fel;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fel;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, La/fel;->j:La/nel;

    .line 40
    .line 41
    iget-object v0, v0, La/fel;->i:La/pdl;

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, La/fel;->i:La/pdl;

    .line 55
    .line 56
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, La/hel;->v:La/nel;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, La/hel;->t:La/gy40;

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    new-instance v5, La/mel;

    .line 72
    .line 73
    invoke-direct {v5, p2}, La/mel;-><init>(La/nel;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, La/fel;->i:La/pdl;

    .line 77
    .line 78
    iput v4, v0, La/fel;->m:I

    .line 79
    .line 80
    invoke-virtual {v2, v5, v0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v1, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_1
    new-instance p2, La/nel;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v2, p0, La/hel;->t:La/gy40;

    .line 93
    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    iput-object p1, v0, La/fel;->i:La/pdl;

    .line 97
    .line 98
    iput-object p2, v0, La/fel;->j:La/nel;

    .line 99
    .line 100
    iput v3, v0, La/fel;->m:I

    .line 101
    .line 102
    invoke-virtual {v2, p2, v0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    move-object v0, p1

    .line 110
    move-object p1, p2

    .line 111
    :goto_3
    move-object p2, p1

    .line 112
    move-object p1, v0

    .line 113
    :cond_6
    iput-object p2, p0, La/hel;->v:La/nel;

    .line 114
    .line 115
    iget-wide p1, p1, La/pdl;->a:J

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, La/hel;->i1(J)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method

.method public final m1(La/qdl;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/gel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/gel;

    .line 7
    .line 8
    iget v1, v0, La/gel;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/gel;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gel;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/gel;-><init>(La/hel;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/gel;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gel;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/gel;->i:La/qdl;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/hel;->v:La/nel;

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    iget-object v2, p0, La/hel;->t:La/gy40;

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    new-instance v5, La/oel;

    .line 61
    .line 62
    invoke-direct {v5, p2}, La/oel;-><init>(La/nel;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v0, La/gel;->i:La/qdl;

    .line 66
    .line 67
    iput v4, v0, La/gel;->l:I

    .line 68
    .line 69
    invoke-virtual {v2, v5, v0}, La/gy40;->a(La/nlx;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    iput-object v3, p0, La/hel;->v:La/nel;

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0, p1}, La/hel;->j1(La/qdl;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0
.end method

.method public final n0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/hel;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/hel;->e1()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/hel;->w:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/hel;->n1()La/htb;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/ndl;->a:La/ndl;

    .line 17
    .line 18
    invoke-interface {v0, v1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, La/hel;->h1:La/j6u0;

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, La/hel;->x:Z

    .line 26
    .line 27
    return-void
.end method

.method public final n1()La/htb;
    .locals 0

    .line 1
    iget-object p0, p0, La/hel;->u:La/q99;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Events channel not initialized."

    .line 7
    .line 8
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final o1()La/j6u0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hel;->h1:La/j6u0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final p1(JLa/dpa0;)V
    .locals 2

    .line 1
    iget-wide v0, p0, La/hel;->z:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, La/ne60;->f(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, La/hel;->z:J

    .line 8
    .line 9
    invoke-virtual {p0}, La/hel;->o1()La/j6u0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p3}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/hel;->n1()La/htb;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p3, La/odl;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p3, v0, p1, p2}, La/odl;-><init>(ZJ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, p3}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final q1(La/dpa0;La/dpa0;J)V
    .locals 2

    .line 1
    iget-object v0, p0, La/hel;->h1:La/j6u0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/j6u0;

    .line 6
    .line 7
    invoke-direct {v0}, La/j6u0;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/hel;->h1:La/j6u0;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, La/hel;->o1()La/j6u0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 17
    .line 18
    .line 19
    iget-wide v0, p2, La/dpa0;->c:J

    .line 20
    .line 21
    invoke-static {v0, v1, p3, p4}, La/ne60;->e(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    iget-object p4, p0, La/hel;->r:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    iget p1, p1, La/dpa0;->i:I

    .line 28
    .line 29
    new-instance v0, La/lpa0;

    .line 30
    .line 31
    invoke-direct {v0, p1}, La/lpa0;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    iget-boolean p1, p0, La/hel;->w:Z

    .line 47
    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, La/hel;->u:La/q99;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    const p1, 0x7fffffff

    .line 55
    .line 56
    .line 57
    const/4 p4, 0x6

    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {p1, v0, v0, p4}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, La/hel;->u:La/q99;

    .line 64
    .line 65
    :cond_1
    invoke-virtual {p0}, La/hel;->s1()V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p0}, La/hel;->n1()La/htb;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance p1, La/pdl;

    .line 73
    .line 74
    invoke-direct {p1, p2, p3}, La/pdl;-><init>(J)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public r1()Z
    .locals 1

    .line 1
    check-cast p0, La/lbh0;

    .line 2
    .line 3
    iget-object p0, p0, La/lbh0;->s1:La/sch0;

    .line 4
    .line 5
    iget-object v0, p0, La/sch0;->a:La/bch0;

    .line 6
    .line 7
    invoke-interface {v0}, La/bch0;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, La/sch0;->b:La/vf80;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, La/vf80;->b()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p0, v0

    .line 24
    :goto_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return v0

    .line 28
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public final s1()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/hel;->w:Z

    .line 3
    .line 4
    iget-object v0, p0, La/hel;->u:La/q99;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-static {v0, v1, v1, v2}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/hel;->u:La/q99;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, La/xb2;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, La/xb2;-><init>(La/hel;La/yje;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v1, v1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final t1(Lkotlin/jvm/functions/Function1;ZLa/gy40;La/ma80;Z)V
    .locals 2

    .line 1
    iput-object p1, p0, La/hel;->r:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-boolean p1, p0, La/hel;->s:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p1, p2, :cond_3

    .line 8
    .line 9
    iput-boolean p2, p0, La/hel;->s:Z

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    iget-object p1, p0, La/hel;->B:La/amt;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/f3k;->a1(La/yzj;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, La/hel;->A:La/amt;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/f3k;->a1(La/yzj;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v0, p0, La/hel;->B:La/amt;

    .line 28
    .line 29
    iput-object v0, p0, La/hel;->A:La/amt;

    .line 30
    .line 31
    invoke-virtual {p0}, La/hel;->c1()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/hel;->j1:La/f7x;

    .line 35
    .line 36
    :cond_2
    move p5, v1

    .line 37
    :cond_3
    iget-object p1, p0, La/hel;->t:La/gy40;

    .line 38
    .line 39
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, La/hel;->c1()V

    .line 46
    .line 47
    .line 48
    iput-object p3, p0, La/hel;->t:La/gy40;

    .line 49
    .line 50
    :cond_4
    iget-object p1, p0, La/hel;->q:La/ma80;

    .line 51
    .line 52
    if-eq p1, p4, :cond_5

    .line 53
    .line 54
    iput-object p4, p0, La/hel;->q:La/ma80;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    move v1, p5

    .line 58
    :goto_0
    if-eqz v1, :cond_9

    .line 59
    .line 60
    iget-boolean p1, p0, La/hel;->x:Z

    .line 61
    .line 62
    sget-object p2, La/ndl;->a:La/ndl;

    .line 63
    .line 64
    if-eqz p1, :cond_7

    .line 65
    .line 66
    invoke-virtual {p0}, La/hel;->e1()V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, p0, La/hel;->w:Z

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0}, La/hel;->n1()La/htb;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p1, p2}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_6
    iput-object v0, p0, La/hel;->h1:La/j6u0;

    .line 81
    .line 82
    :cond_7
    iget-object p0, p0, La/hel;->j1:La/f7x;

    .line 83
    .line 84
    if-eqz p0, :cond_9

    .line 85
    .line 86
    invoke-virtual {p0}, La/f7x;->a()V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, La/f7x;->a:La/hel;

    .line 90
    .line 91
    iget-boolean p3, p1, La/hel;->w:Z

    .line 92
    .line 93
    if-eqz p3, :cond_8

    .line 94
    .line 95
    invoke-virtual {p1, p2}, La/hel;->h1(La/rdl;)V

    .line 96
    .line 97
    .line 98
    :cond_8
    iput-object v0, p0, La/f7x;->g:La/j6u0;

    .line 99
    .line 100
    iget-object p0, p0, La/f7x;->j:La/y78;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    iput p1, p0, La/y78;->b:I

    .line 104
    .line 105
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, La/iy40;

    .line 108
    .line 109
    iput p1, p0, La/iy40;->b:I

    .line 110
    .line 111
    :cond_9
    return-void
.end method

.method public final z0()V
    .locals 2

    .line 1
    iget-object p0, p0, La/hel;->j1:La/f7x;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/f7x;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/f7x;->a:La/hel;

    .line 9
    .line 10
    iget-boolean v1, v0, La/hel;->w:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, La/ndl;->a:La/ndl;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/hel;->h1(La/rdl;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, La/f7x;->g:La/j6u0;

    .line 21
    .line 22
    iget-object p0, p0, La/f7x;->j:La/y78;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, La/y78;->b:I

    .line 26
    .line 27
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/iy40;

    .line 30
    .line 31
    iput v0, p0, La/iy40;->b:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method
