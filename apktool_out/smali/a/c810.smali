.class public abstract La/c810;
.super La/pu90;
.source "SourceFile"

# interfaces
.implements La/tt40;
.implements La/dg80;
.implements La/vj30;


# static fields
.field public static final s:La/p610;

.field public static final t:La/p610;


# instance fields
.field public f:La/a810;

.field public g:Lkotlin/jvm/functions/Function1;

.field public h:Lkotlin/jvm/functions/Function2;

.field public i:Lkotlin/jvm/functions/Function1;

.field public j:La/ru90;

.field public k:La/hz40;

.field public l:Z

.field public m:La/hz40;

.field public n:Z

.field public o:Z

.field public final p:La/d810;

.field public q:La/fp;

.field public r:La/hz40;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/p610;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, La/p610;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/c810;->s:La/p610;

    .line 8
    .line 9
    new-instance v0, La/p610;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, v1}, La/p610;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/c810;->t:La/p610;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/pu90;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/d810;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/d810;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/c810;->p:La/d810;

    .line 11
    .line 12
    return-void
.end method

.method public static R0(La/s460;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/s460;->v:La/s460;

    .line 2
    .line 3
    iget-object p0, p0, La/s460;->u:La/e7z;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, La/s460;->u:La/e7z;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 18
    .line 19
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 20
    .line 21
    iget-object p0, p0, La/sj30;->y:La/f7z;

    .line 22
    .line 23
    invoke-virtual {p0}, La/f7z;->f()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 28
    .line 29
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 30
    .line 31
    invoke-virtual {p0}, La/sj30;->c()La/b22;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    check-cast p0, La/sj30;

    .line 38
    .line 39
    iget-object p0, p0, La/sj30;->y:La/f7z;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, La/f7z;->f()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method


# virtual methods
.method public final D0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/uj30;
    .locals 8

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    and-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Size("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " x "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    new-instance v1, La/b810;

    .line 42
    .line 43
    move-object v7, p0

    .line 44
    move v2, p1

    .line 45
    move v3, p2

    .line 46
    move-object v4, p3

    .line 47
    move-object v5, p4

    .line 48
    move-object v6, p5

    .line 49
    invoke-direct/range {v1 .. v7}, La/b810;-><init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/c810;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public final F0(La/uj30;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-boolean v1, v0, La/c810;->o:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_f

    .line 10
    .line 11
    :cond_0
    invoke-interface {v6}, La/uj30;->e()Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v6}, La/uj30;->d()Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v6}, La/uj30;->c()Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    if-eqz v2, :cond_14

    .line 26
    .line 27
    iget-object v1, v0, La/c810;->h:Lkotlin/jvm/functions/Function2;

    .line 28
    .line 29
    if-ne v2, v1, :cond_13

    .line 30
    .line 31
    iget-object v1, v0, La/c810;->i:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    if-eq v3, v1, :cond_1

    .line 34
    .line 35
    goto/16 :goto_c

    .line 36
    .line 37
    :cond_1
    iget-object v1, v0, La/c810;->m:La/hz40;

    .line 38
    .line 39
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v14, 0x8

    .line 45
    .line 46
    if-eqz v1, :cond_8

    .line 47
    .line 48
    iget-object v15, v1, La/hz40;->c:[Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v1, v1, La/hz40;->a:[J

    .line 51
    .line 52
    const-wide/16 v16, 0x80

    .line 53
    .line 54
    array-length v2, v1

    .line 55
    add-int/lit8 v2, v2, -0x2

    .line 56
    .line 57
    if-ltz v2, :cond_6

    .line 58
    .line 59
    const/16 p1, 0x7

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    :goto_0
    aget-wide v6, v1, v3

    .line 65
    .line 66
    const-wide/16 v19, 0xff

    .line 67
    .line 68
    not-long v10, v6

    .line 69
    shl-long v10, v10, p1

    .line 70
    .line 71
    and-long/2addr v10, v6

    .line 72
    and-long/2addr v10, v12

    .line 73
    cmp-long v10, v10, v12

    .line 74
    .line 75
    if-eqz v10, :cond_5

    .line 76
    .line 77
    sub-int v10, v3, v2

    .line 78
    .line 79
    not-int v10, v10

    .line 80
    ushr-int/lit8 v10, v10, 0x1f

    .line 81
    .line 82
    rsub-int/lit8 v10, v10, 0x8

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    :goto_1
    if-ge v11, v10, :cond_4

    .line 86
    .line 87
    and-long v21, v6, v19

    .line 88
    .line 89
    cmp-long v21, v21, v16

    .line 90
    .line 91
    if-gez v21, :cond_2

    .line 92
    .line 93
    shl-int/lit8 v21, v3, 0x3

    .line 94
    .line 95
    add-int v21, v21, v11

    .line 96
    .line 97
    aget-object v21, v15, v21

    .line 98
    .line 99
    move-wide/from16 v22, v12

    .line 100
    .line 101
    move-object/from16 v12, v21

    .line 102
    .line 103
    check-cast v12, La/a810;

    .line 104
    .line 105
    iget-boolean v13, v12, La/a810;->a:Z

    .line 106
    .line 107
    if-eqz v13, :cond_3

    .line 108
    .line 109
    move-object/from16 v18, v12

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    move-wide/from16 v22, v12

    .line 113
    .line 114
    :cond_3
    :goto_2
    shr-long/2addr v6, v14

    .line 115
    add-int/lit8 v11, v11, 0x1

    .line 116
    .line 117
    move-wide/from16 v12, v22

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    move-wide/from16 v22, v12

    .line 121
    .line 122
    if-ne v10, v14, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    move-wide/from16 v22, v12

    .line 126
    .line 127
    :goto_3
    if-eq v3, v2, :cond_7

    .line 128
    .line 129
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    move-wide/from16 v12, v22

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_6
    move-wide/from16 v22, v12

    .line 135
    .line 136
    const/16 p1, 0x7

    .line 137
    .line 138
    const-wide/16 v19, 0xff

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    :cond_7
    move-object/from16 v1, v18

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    move-wide/from16 v22, v12

    .line 146
    .line 147
    const/16 p1, 0x7

    .line 148
    .line 149
    const-wide/16 v16, 0x80

    .line 150
    .line 151
    const-wide/16 v19, 0xff

    .line 152
    .line 153
    const/4 v1, 0x0

    .line 154
    :goto_4
    if-eqz v1, :cond_1c

    .line 155
    .line 156
    invoke-virtual {v0}, La/c810;->I0()La/j6z;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-interface {v2, v4, v5}, La/j6z;->R(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    invoke-static {v3, v4}, La/x1x;->J(J)J

    .line 165
    .line 166
    .line 167
    move-result-wide v3

    .line 168
    invoke-interface {v2}, La/j6z;->g()J

    .line 169
    .line 170
    .line 171
    move-result-wide v5

    .line 172
    iget-wide v10, v1, La/a810;->b:J

    .line 173
    .line 174
    invoke-static {v3, v4, v10, v11}, La/ikx;->b(JJ)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_9

    .line 179
    .line 180
    iget-wide v1, v1, La/a810;->c:J

    .line 181
    .line 182
    invoke-static {v5, v6, v1, v2}, La/qkx;->a(JJ)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_1c

    .line 187
    .line 188
    :cond_9
    iget-object v1, v0, La/c810;->m:La/hz40;

    .line 189
    .line 190
    if-eqz v1, :cond_1c

    .line 191
    .line 192
    iget-object v2, v1, La/hz40;->b:[Ljava/lang/Object;

    .line 193
    .line 194
    iget-object v7, v1, La/hz40;->c:[Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v1, v1, La/hz40;->a:[J

    .line 197
    .line 198
    array-length v10, v1

    .line 199
    add-int/lit8 v10, v10, -0x2

    .line 200
    .line 201
    if-ltz v10, :cond_1c

    .line 202
    .line 203
    const/4 v11, 0x0

    .line 204
    :goto_5
    aget-wide v12, v1, v11

    .line 205
    .line 206
    move/from16 v18, v10

    .line 207
    .line 208
    not-long v9, v12

    .line 209
    shl-long v9, v9, p1

    .line 210
    .line 211
    and-long/2addr v9, v12

    .line 212
    and-long v9, v9, v22

    .line 213
    .line 214
    cmp-long v9, v9, v22

    .line 215
    .line 216
    if-eqz v9, :cond_12

    .line 217
    .line 218
    sub-int v9, v11, v18

    .line 219
    .line 220
    not-int v9, v9

    .line 221
    ushr-int/lit8 v9, v9, 0x1f

    .line 222
    .line 223
    rsub-int/lit8 v9, v9, 0x8

    .line 224
    .line 225
    const/4 v10, 0x0

    .line 226
    :goto_6
    if-ge v10, v9, :cond_11

    .line 227
    .line 228
    and-long v24, v12, v19

    .line 229
    .line 230
    cmp-long v21, v24, v16

    .line 231
    .line 232
    if-gez v21, :cond_f

    .line 233
    .line 234
    shl-int/lit8 v21, v11, 0x3

    .line 235
    .line 236
    add-int v21, v21, v10

    .line 237
    .line 238
    aget-object v24, v2, v21

    .line 239
    .line 240
    aget-object v21, v7, v21

    .line 241
    .line 242
    move-object/from16 v15, v21

    .line 243
    .line 244
    check-cast v15, La/a810;

    .line 245
    .line 246
    move/from16 v21, v14

    .line 247
    .line 248
    move-object/from16 v14, v24

    .line 249
    .line 250
    check-cast v14, La/xlw;

    .line 251
    .line 252
    iget-boolean v8, v15, La/a810;->a:Z

    .line 253
    .line 254
    move-object/from16 v26, v1

    .line 255
    .line 256
    if-eqz v8, :cond_b

    .line 257
    .line 258
    move-object v8, v2

    .line 259
    iget-wide v1, v15, La/a810;->c:J

    .line 260
    .line 261
    invoke-static {v1, v2, v5, v6}, La/qkx;->a(JJ)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_a

    .line 266
    .line 267
    iget-wide v1, v15, La/a810;->b:J

    .line 268
    .line 269
    invoke-static {v1, v2, v3, v4}, La/ikx;->b(JJ)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-nez v1, :cond_c

    .line 274
    .line 275
    :cond_a
    const/4 v1, 0x1

    .line 276
    goto :goto_7

    .line 277
    :cond_b
    move-object v8, v2

    .line 278
    :cond_c
    const/4 v1, 0x0

    .line 279
    :goto_7
    iput-wide v5, v15, La/a810;->c:J

    .line 280
    .line 281
    iput-wide v3, v15, La/a810;->b:J

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    iput-boolean v2, v15, La/a810;->a:Z

    .line 285
    .line 286
    if-eqz v1, :cond_10

    .line 287
    .line 288
    iget-object v1, v0, La/c810;->q:La/fp;

    .line 289
    .line 290
    if-eqz v1, :cond_d

    .line 291
    .line 292
    invoke-virtual {v1, v14}, La/fp;->L(La/xlw;)V

    .line 293
    .line 294
    .line 295
    :cond_d
    iget-object v1, v0, La/c810;->r:La/hz40;

    .line 296
    .line 297
    if-eqz v1, :cond_e

    .line 298
    .line 299
    invoke-virtual {v1, v14}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    move-object v15, v1

    .line 304
    check-cast v15, La/iz40;

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_e
    const/4 v15, 0x0

    .line 308
    :goto_8
    if-eqz v15, :cond_10

    .line 309
    .line 310
    invoke-virtual {v0, v15}, La/c810;->S0(La/iz40;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v15}, La/iz40;->b()V

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_f
    move-object/from16 v26, v1

    .line 318
    .line 319
    move-object v8, v2

    .line 320
    move/from16 v21, v14

    .line 321
    .line 322
    :cond_10
    :goto_9
    shr-long v12, v12, v21

    .line 323
    .line 324
    add-int/lit8 v10, v10, 0x1

    .line 325
    .line 326
    move-object v2, v8

    .line 327
    move/from16 v14, v21

    .line 328
    .line 329
    move-object/from16 v1, v26

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_11
    move-object/from16 v26, v1

    .line 333
    .line 334
    move-object v8, v2

    .line 335
    move v1, v14

    .line 336
    if-ne v9, v1, :cond_1c

    .line 337
    .line 338
    :goto_a
    move/from16 v10, v18

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_12
    move-object/from16 v26, v1

    .line 342
    .line 343
    move-object v8, v2

    .line 344
    move v1, v14

    .line 345
    goto :goto_a

    .line 346
    :goto_b
    if-eq v11, v10, :cond_1c

    .line 347
    .line 348
    add-int/lit8 v11, v11, 0x1

    .line 349
    .line 350
    move v14, v1

    .line 351
    move-object v2, v8

    .line 352
    move-object/from16 v1, v26

    .line 353
    .line 354
    goto/16 :goto_5

    .line 355
    .line 356
    :cond_13
    :goto_c
    iput-object v2, v0, La/c810;->h:Lkotlin/jvm/functions/Function2;

    .line 357
    .line 358
    iput-object v3, v0, La/c810;->i:Lkotlin/jvm/functions/Function1;

    .line 359
    .line 360
    invoke-virtual {v0}, La/c810;->U0()V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :cond_14
    const-wide v2, 0x7fffffff7fffffffL

    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    if-nez v1, :cond_16

    .line 370
    .line 371
    invoke-virtual {v0}, La/c810;->U0()V

    .line 372
    .line 373
    .line 374
    const/4 v15, 0x0

    .line 375
    iput-object v15, v0, La/c810;->g:Lkotlin/jvm/functions/Function1;

    .line 376
    .line 377
    iput-object v15, v0, La/c810;->h:Lkotlin/jvm/functions/Function2;

    .line 378
    .line 379
    iput-object v15, v0, La/c810;->i:Lkotlin/jvm/functions/Function1;

    .line 380
    .line 381
    iget-object v0, v0, La/c810;->f:La/a810;

    .line 382
    .line 383
    if-eqz v0, :cond_15

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    iput-boolean v7, v0, La/a810;->a:Z

    .line 387
    .line 388
    :cond_15
    if-eqz v0, :cond_1c

    .line 389
    .line 390
    iput-wide v2, v0, La/a810;->b:J

    .line 391
    .line 392
    return-void

    .line 393
    :cond_16
    const/4 v7, 0x0

    .line 394
    const/4 v15, 0x0

    .line 395
    iput-object v15, v0, La/c810;->h:Lkotlin/jvm/functions/Function2;

    .line 396
    .line 397
    iput-object v15, v0, La/c810;->i:Lkotlin/jvm/functions/Function1;

    .line 398
    .line 399
    iget-object v8, v0, La/c810;->g:Lkotlin/jvm/functions/Function1;

    .line 400
    .line 401
    if-eq v8, v1, :cond_17

    .line 402
    .line 403
    const/4 v1, 0x1

    .line 404
    goto :goto_d

    .line 405
    :cond_17
    move v1, v7

    .line 406
    :goto_d
    if-nez v1, :cond_1a

    .line 407
    .line 408
    invoke-virtual {v0}, La/c810;->Q0()La/a810;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    iget-boolean v8, v8, La/a810;->a:Z

    .line 413
    .line 414
    if-eqz v8, :cond_1a

    .line 415
    .line 416
    invoke-virtual {v0}, La/c810;->I0()La/j6z;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-interface {v1, v4, v5}, La/j6z;->R(J)J

    .line 421
    .line 422
    .line 423
    move-result-wide v2

    .line 424
    invoke-static {v2, v3}, La/x1x;->J(J)J

    .line 425
    .line 426
    .line 427
    move-result-wide v2

    .line 428
    invoke-interface {v1}, La/j6z;->g()J

    .line 429
    .line 430
    .line 431
    move-result-wide v4

    .line 432
    invoke-virtual {v0}, La/c810;->Q0()La/a810;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    iget-wide v8, v1, La/a810;->b:J

    .line 437
    .line 438
    invoke-static {v2, v3, v8, v9}, La/ikx;->b(JJ)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_18

    .line 443
    .line 444
    invoke-virtual {v0}, La/c810;->Q0()La/a810;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iget-wide v8, v1, La/a810;->c:J

    .line 449
    .line 450
    invoke-static {v4, v5, v8, v9}, La/qkx;->a(JJ)Z

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    if-nez v1, :cond_19

    .line 455
    .line 456
    :cond_18
    const/4 v7, 0x1

    .line 457
    :cond_19
    move v1, v7

    .line 458
    :cond_1a
    if-eqz v1, :cond_1c

    .line 459
    .line 460
    iget-object v1, v0, La/c810;->j:La/ru90;

    .line 461
    .line 462
    if-eqz v1, :cond_1b

    .line 463
    .line 464
    iput-object v6, v1, La/ru90;->a:La/uj30;

    .line 465
    .line 466
    goto :goto_e

    .line 467
    :cond_1b
    new-instance v1, La/ru90;

    .line 468
    .line 469
    const/4 v15, 0x0

    .line 470
    invoke-direct {v1, v6, v0, v15}, La/ru90;-><init>(La/uj30;La/c810;La/xlw;)V

    .line 471
    .line 472
    .line 473
    iput-object v1, v0, La/c810;->j:La/ru90;

    .line 474
    .line 475
    :goto_e
    invoke-virtual/range {v0 .. v5}, La/c810;->z0(La/ru90;JJ)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v6}, La/uj30;->e()Lkotlin/jvm/functions/Function1;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    iput-object v1, v0, La/c810;->g:Lkotlin/jvm/functions/Function1;

    .line 483
    .line 484
    :cond_1c
    :goto_f
    return-void
.end method

.method public abstract H0()La/c810;
.end method

.method public abstract I0()La/j6z;
.end method

.method public abstract J0()Z
.end method

.method public abstract L0()La/e7z;
.end method

.method public M()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract N0()La/uj30;
.end method

.method public abstract O0()La/c810;
.end method

.method public abstract P0()J
.end method

.method public final Q0()La/a810;
    .locals 1

    .line 1
    iget-object v0, p0, La/c810;->f:La/a810;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/a810;

    .line 6
    .line 7
    invoke-direct {v0, p0}, La/a810;-><init>(La/c810;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/c810;->f:La/a810;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final S0(La/iz40;)V
    .locals 13

    .line 1
    iget-object v0, p1, La/iz40;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p1, p1, La/iz40;->a:[J

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    if-ltz v1, :cond_4

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    aget-wide v4, p1, v3

    .line 13
    .line 14
    not-long v6, v4

    .line 15
    const/4 v8, 0x7

    .line 16
    shl-long/2addr v6, v8

    .line 17
    and-long/2addr v6, v4

    .line 18
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v6, v8

    .line 24
    cmp-long v6, v6, v8

    .line 25
    .line 26
    if-eqz v6, :cond_3

    .line 27
    .line 28
    sub-int v6, v3, v1

    .line 29
    .line 30
    not-int v6, v6

    .line 31
    ushr-int/lit8 v6, v6, 0x1f

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    rsub-int/lit8 v6, v6, 0x8

    .line 36
    .line 37
    move v8, v2

    .line 38
    :goto_1
    if-ge v8, v6, :cond_2

    .line 39
    .line 40
    const-wide/16 v9, 0xff

    .line 41
    .line 42
    and-long/2addr v9, v4

    .line 43
    const-wide/16 v11, 0x80

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-gez v9, :cond_1

    .line 48
    .line 49
    shl-int/lit8 v9, v3, 0x3

    .line 50
    .line 51
    add-int/2addr v9, v8

    .line 52
    aget-object v9, v0, v9

    .line 53
    .line 54
    check-cast v9, La/g1v0;

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, La/e7z;

    .line 61
    .line 62
    if-eqz v9, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, La/c810;->M()Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-eqz v10, :cond_0

    .line 69
    .line 70
    invoke-virtual {v9, v2}, La/e7z;->T(Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_0
    invoke-virtual {v9, v2}, La/e7z;->V(Z)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_2
    shr-long/2addr v4, v7

    .line 78
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    if-ne v6, v7, :cond_4

    .line 82
    .line 83
    :cond_3
    if-eq v3, v1, :cond_4

    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-void
.end method

.method public abstract T0()V
.end method

.method public final U0()V
    .locals 15

    .line 1
    iget-object v0, p0, La/c810;->q:La/fp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v2, v0, La/fp;->b:I

    .line 7
    .line 8
    move v3, v1

    .line 9
    :goto_0
    if-ge v3, v2, :cond_0

    .line 10
    .line 11
    iget-object v4, v0, La/fp;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, [La/xlw;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    aput-object v5, v4, v3

    .line 17
    .line 18
    iget-object v4, v0, La/fp;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, [F

    .line 21
    .line 22
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 23
    .line 24
    aput v5, v4, v3

    .line 25
    .line 26
    iget-object v4, v0, La/fp;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, [B

    .line 29
    .line 30
    aput-byte v1, v4, v3

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v1, v0, La/fp;->b:I

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, La/c810;->r:La/hz40;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object v2, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v3, v0, La/hz40;->a:[J

    .line 45
    .line 46
    array-length v4, v3

    .line 47
    add-int/lit8 v4, v4, -0x2

    .line 48
    .line 49
    if-ltz v4, :cond_6

    .line 50
    .line 51
    move v5, v1

    .line 52
    :goto_1
    aget-wide v6, v3, v5

    .line 53
    .line 54
    not-long v8, v6

    .line 55
    const/4 v10, 0x7

    .line 56
    shl-long/2addr v8, v10

    .line 57
    and-long/2addr v8, v6

    .line 58
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v8, v10

    .line 64
    cmp-long v8, v8, v10

    .line 65
    .line 66
    if-eqz v8, :cond_5

    .line 67
    .line 68
    sub-int v8, v5, v4

    .line 69
    .line 70
    not-int v8, v8

    .line 71
    ushr-int/lit8 v8, v8, 0x1f

    .line 72
    .line 73
    const/16 v9, 0x8

    .line 74
    .line 75
    rsub-int/lit8 v8, v8, 0x8

    .line 76
    .line 77
    move v10, v1

    .line 78
    :goto_2
    if-ge v10, v8, :cond_4

    .line 79
    .line 80
    const-wide/16 v11, 0xff

    .line 81
    .line 82
    and-long/2addr v11, v6

    .line 83
    const-wide/16 v13, 0x80

    .line 84
    .line 85
    cmp-long v11, v11, v13

    .line 86
    .line 87
    if-gez v11, :cond_3

    .line 88
    .line 89
    shl-int/lit8 v11, v5, 0x3

    .line 90
    .line 91
    add-int/2addr v11, v10

    .line 92
    aget-object v11, v2, v11

    .line 93
    .line 94
    check-cast v11, La/iz40;

    .line 95
    .line 96
    invoke-virtual {p0, v11}, La/c810;->S0(La/iz40;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    shr-long/2addr v6, v9

    .line 100
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    if-ne v8, v9, :cond_6

    .line 104
    .line 105
    :cond_5
    if-eq v5, v4, :cond_6

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    invoke-virtual {v0}, La/hz40;->a()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final c0(La/w12;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, La/c810;->J0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, La/c810;->y0(La/w12;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return v1

    .line 17
    :cond_1
    instance-of p1, p1, La/gcu0;

    .line 18
    .line 19
    iget-wide v1, p0, La/pu90;->e:J

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/16 p0, 0x20

    .line 24
    .line 25
    shr-long p0, v1, p0

    .line 26
    .line 27
    :goto_1
    long-to-int p0, p0

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const-wide p0, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr p0, v1

    .line 35
    goto :goto_1

    .line 36
    :goto_2
    add-int/2addr v0, p0

    .line 37
    return v0
.end method

.method public h0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/c810;->L0()La/e7z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/e7z;->I()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final v(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/c810;->O0()La/c810;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, La/c810;->L0()La/e7z;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, La/c810;->L0()La/e7z;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iput-boolean p1, p0, La/c810;->l:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/e7z;->i1:La/i7z;

    .line 30
    .line 31
    iget-object v2, v2, La/i7z;->d:La/a7z;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v2, v1

    .line 35
    :goto_1
    sget-object v3, La/a7z;->c:La/a7z;

    .line 36
    .line 37
    if-eq v2, v3, :cond_5

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, v0, La/e7z;->i1:La/i7z;

    .line 42
    .line 43
    iget-object v1, v0, La/i7z;->d:La/a7z;

    .line 44
    .line 45
    :cond_3
    sget-object v0, La/a7z;->d:La/a7z;

    .line 46
    .line 47
    if-ne v1, v0, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    return-void

    .line 51
    :cond_5
    :goto_2
    iput-boolean p1, p0, La/c810;->l:Z

    .line 52
    .line 53
    return-void
.end method

.method public final x0(La/e7z;La/xlw;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/c810;->r:La/hz40;

    .line 6
    .line 7
    const/4 v7, 0x7

    .line 8
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v10, 0x8

    .line 14
    .line 15
    if-eqz v2, :cond_a

    .line 16
    .line 17
    iget-object v12, v2, La/hz40;->c:[Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v2, v2, La/hz40;->a:[J

    .line 20
    .line 21
    array-length v13, v2

    .line 22
    add-int/lit8 v13, v13, -0x2

    .line 23
    .line 24
    if-ltz v13, :cond_a

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    const-wide/16 v15, 0x80

    .line 28
    .line 29
    :goto_0
    aget-wide v3, v2, v14

    .line 30
    .line 31
    const-wide/16 v17, 0xff

    .line 32
    .line 33
    not-long v5, v3

    .line 34
    shl-long/2addr v5, v7

    .line 35
    and-long/2addr v5, v3

    .line 36
    and-long/2addr v5, v8

    .line 37
    cmp-long v5, v5, v8

    .line 38
    .line 39
    if-eqz v5, :cond_9

    .line 40
    .line 41
    sub-int v5, v14, v13

    .line 42
    .line 43
    not-int v5, v5

    .line 44
    ushr-int/lit8 v5, v5, 0x1f

    .line 45
    .line 46
    rsub-int/lit8 v5, v5, 0x8

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    :goto_1
    if-ge v6, v5, :cond_8

    .line 50
    .line 51
    and-long v19, v3, v17

    .line 52
    .line 53
    cmp-long v19, v19, v15

    .line 54
    .line 55
    if-gez v19, :cond_7

    .line 56
    .line 57
    shl-int/lit8 v19, v14, 0x3

    .line 58
    .line 59
    add-int v19, v19, v6

    .line 60
    .line 61
    aget-object v19, v12, v19

    .line 62
    .line 63
    move/from16 v20, v7

    .line 64
    .line 65
    move-object/from16 v7, v19

    .line 66
    .line 67
    check-cast v7, La/iz40;

    .line 68
    .line 69
    move-wide/from16 v21, v8

    .line 70
    .line 71
    iget-object v8, v7, La/iz40;->b:[Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v9, v7, La/iz40;->a:[J

    .line 74
    .line 75
    array-length v11, v9

    .line 76
    add-int/lit8 v11, v11, -0x2

    .line 77
    .line 78
    if-ltz v11, :cond_5

    .line 79
    .line 80
    move-wide/from16 v23, v15

    .line 81
    .line 82
    const/4 v15, 0x0

    .line 83
    move/from16 v16, v10

    .line 84
    .line 85
    :goto_2
    move/from16 v25, v11

    .line 86
    .line 87
    aget-wide v10, v9, v15

    .line 88
    .line 89
    move-object/from16 v26, v2

    .line 90
    .line 91
    move-wide/from16 v27, v3

    .line 92
    .line 93
    not-long v2, v10

    .line 94
    shl-long v2, v2, v20

    .line 95
    .line 96
    and-long/2addr v2, v10

    .line 97
    and-long v2, v2, v21

    .line 98
    .line 99
    cmp-long v2, v2, v21

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    sub-int v2, v15, v25

    .line 104
    .line 105
    not-int v2, v2

    .line 106
    ushr-int/lit8 v2, v2, 0x1f

    .line 107
    .line 108
    rsub-int/lit8 v2, v2, 0x8

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    :goto_3
    if-ge v3, v2, :cond_3

    .line 112
    .line 113
    and-long v29, v10, v17

    .line 114
    .line 115
    cmp-long v4, v29, v23

    .line 116
    .line 117
    if-gez v4, :cond_2

    .line 118
    .line 119
    shl-int/lit8 v4, v15, 0x3

    .line 120
    .line 121
    add-int/2addr v4, v3

    .line 122
    aget-object v29, v8, v4

    .line 123
    .line 124
    check-cast v29, La/g1v0;

    .line 125
    .line 126
    invoke-virtual/range {v29 .. v29}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v29

    .line 130
    check-cast v29, La/e7z;

    .line 131
    .line 132
    move/from16 v30, v3

    .line 133
    .line 134
    if-eqz v29, :cond_0

    .line 135
    .line 136
    invoke-virtual/range {v29 .. v29}, La/e7z;->I()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    move/from16 v29, v6

    .line 141
    .line 142
    const/4 v6, 0x1

    .line 143
    if-ne v3, v6, :cond_1

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_0
    move/from16 v29, v6

    .line 147
    .line 148
    :cond_1
    invoke-virtual {v7, v4}, La/iz40;->m(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_2
    move/from16 v30, v3

    .line 153
    .line 154
    move/from16 v29, v6

    .line 155
    .line 156
    :goto_4
    shr-long v10, v10, v16

    .line 157
    .line 158
    add-int/lit8 v3, v30, 0x1

    .line 159
    .line 160
    move/from16 v6, v29

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_3
    move/from16 v29, v6

    .line 164
    .line 165
    move/from16 v3, v16

    .line 166
    .line 167
    if-ne v2, v3, :cond_6

    .line 168
    .line 169
    :goto_5
    move/from16 v11, v25

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_4
    move/from16 v29, v6

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :goto_6
    if-eq v15, v11, :cond_6

    .line 176
    .line 177
    add-int/lit8 v15, v15, 0x1

    .line 178
    .line 179
    move-object/from16 v2, v26

    .line 180
    .line 181
    move-wide/from16 v3, v27

    .line 182
    .line 183
    move/from16 v6, v29

    .line 184
    .line 185
    const/16 v16, 0x8

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    move-object/from16 v26, v2

    .line 189
    .line 190
    move-wide/from16 v27, v3

    .line 191
    .line 192
    move/from16 v29, v6

    .line 193
    .line 194
    move-wide/from16 v23, v15

    .line 195
    .line 196
    :cond_6
    const/16 v3, 0x8

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    move-object/from16 v26, v2

    .line 200
    .line 201
    move-wide/from16 v27, v3

    .line 202
    .line 203
    move/from16 v29, v6

    .line 204
    .line 205
    move/from16 v20, v7

    .line 206
    .line 207
    move-wide/from16 v21, v8

    .line 208
    .line 209
    move-wide/from16 v23, v15

    .line 210
    .line 211
    move v3, v10

    .line 212
    :goto_7
    shr-long v6, v27, v3

    .line 213
    .line 214
    add-int/lit8 v2, v29, 0x1

    .line 215
    .line 216
    move v10, v3

    .line 217
    move-wide v3, v6

    .line 218
    move/from16 v7, v20

    .line 219
    .line 220
    move-wide/from16 v8, v21

    .line 221
    .line 222
    move-wide/from16 v15, v23

    .line 223
    .line 224
    move v6, v2

    .line 225
    move-object/from16 v2, v26

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_8
    move-object/from16 v26, v2

    .line 230
    .line 231
    move/from16 v20, v7

    .line 232
    .line 233
    move-wide/from16 v21, v8

    .line 234
    .line 235
    move v3, v10

    .line 236
    move-wide/from16 v23, v15

    .line 237
    .line 238
    if-ne v5, v3, :cond_b

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_9
    move-object/from16 v26, v2

    .line 242
    .line 243
    move/from16 v20, v7

    .line 244
    .line 245
    move-wide/from16 v21, v8

    .line 246
    .line 247
    move-wide/from16 v23, v15

    .line 248
    .line 249
    :goto_8
    if-eq v14, v13, :cond_b

    .line 250
    .line 251
    add-int/lit8 v14, v14, 0x1

    .line 252
    .line 253
    move/from16 v7, v20

    .line 254
    .line 255
    move-wide/from16 v8, v21

    .line 256
    .line 257
    move-wide/from16 v15, v23

    .line 258
    .line 259
    move-object/from16 v2, v26

    .line 260
    .line 261
    const/16 v10, 0x8

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_a
    move/from16 v20, v7

    .line 266
    .line 267
    move-wide/from16 v21, v8

    .line 268
    .line 269
    const-wide/16 v17, 0xff

    .line 270
    .line 271
    const-wide/16 v23, 0x80

    .line 272
    .line 273
    :cond_b
    iget-object v2, v0, La/c810;->r:La/hz40;

    .line 274
    .line 275
    if-eqz v2, :cond_f

    .line 276
    .line 277
    iget-object v3, v2, La/hz40;->a:[J

    .line 278
    .line 279
    array-length v4, v3

    .line 280
    add-int/lit8 v4, v4, -0x2

    .line 281
    .line 282
    if-ltz v4, :cond_f

    .line 283
    .line 284
    const/4 v5, 0x0

    .line 285
    :goto_9
    aget-wide v6, v3, v5

    .line 286
    .line 287
    not-long v8, v6

    .line 288
    shl-long v8, v8, v20

    .line 289
    .line 290
    and-long/2addr v8, v6

    .line 291
    and-long v8, v8, v21

    .line 292
    .line 293
    cmp-long v8, v8, v21

    .line 294
    .line 295
    if-eqz v8, :cond_e

    .line 296
    .line 297
    sub-int v8, v5, v4

    .line 298
    .line 299
    not-int v8, v8

    .line 300
    ushr-int/lit8 v8, v8, 0x1f

    .line 301
    .line 302
    const/16 v16, 0x8

    .line 303
    .line 304
    rsub-int/lit8 v10, v8, 0x8

    .line 305
    .line 306
    const/4 v8, 0x0

    .line 307
    :goto_a
    if-ge v8, v10, :cond_d

    .line 308
    .line 309
    and-long v11, v6, v17

    .line 310
    .line 311
    cmp-long v9, v11, v23

    .line 312
    .line 313
    if-gez v9, :cond_c

    .line 314
    .line 315
    shl-int/lit8 v9, v5, 0x3

    .line 316
    .line 317
    add-int/2addr v9, v8

    .line 318
    iget-object v11, v2, La/hz40;->b:[Ljava/lang/Object;

    .line 319
    .line 320
    aget-object v11, v11, v9

    .line 321
    .line 322
    iget-object v12, v2, La/hz40;->c:[Ljava/lang/Object;

    .line 323
    .line 324
    aget-object v12, v12, v9

    .line 325
    .line 326
    check-cast v12, La/iz40;

    .line 327
    .line 328
    check-cast v11, La/xlw;

    .line 329
    .line 330
    invoke-virtual {v12}, La/iz40;->g()Z

    .line 331
    .line 332
    .line 333
    move-result v11

    .line 334
    if-eqz v11, :cond_c

    .line 335
    .line 336
    invoke-virtual {v2, v9}, La/hz40;->m(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :cond_c
    const/16 v9, 0x8

    .line 340
    .line 341
    shr-long/2addr v6, v9

    .line 342
    add-int/lit8 v8, v8, 0x1

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_d
    const/16 v9, 0x8

    .line 346
    .line 347
    if-ne v10, v9, :cond_f

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_e
    const/16 v9, 0x8

    .line 351
    .line 352
    :goto_b
    if-eq v5, v4, :cond_f

    .line 353
    .line 354
    add-int/lit8 v5, v5, 0x1

    .line 355
    .line 356
    goto :goto_9

    .line 357
    :cond_f
    iget-object v2, v0, La/c810;->r:La/hz40;

    .line 358
    .line 359
    if-nez v2, :cond_10

    .line 360
    .line 361
    new-instance v2, La/hz40;

    .line 362
    .line 363
    invoke-direct {v2}, La/hz40;-><init>()V

    .line 364
    .line 365
    .line 366
    iput-object v2, v0, La/c810;->r:La/hz40;

    .line 367
    .line 368
    :cond_10
    invoke-virtual {v2, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    if-nez v0, :cond_11

    .line 373
    .line 374
    new-instance v0, La/iz40;

    .line 375
    .line 376
    invoke-direct {v0}, La/iz40;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v1, v0}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    :cond_11
    check-cast v0, La/iz40;

    .line 383
    .line 384
    new-instance v1, La/g1v0;

    .line 385
    .line 386
    move-object/from16 v2, p1

    .line 387
    .line 388
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v1}, La/iz40;->k(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-void
.end method

.method public abstract y0(La/w12;)I
.end method

.method public final z0(La/ru90;JJ)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v8, v1, La/c810;->r:La/hz40;

    .line 4
    .line 5
    iget-object v0, v1, La/c810;->q:La/fp;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, La/fp;

    .line 10
    .line 11
    invoke-direct {v0}, La/fp;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, v1, La/c810;->q:La/fp;

    .line 15
    .line 16
    :cond_0
    move-object v9, v0

    .line 17
    invoke-virtual {v1}, La/c810;->L0()La/e7z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/e7z;->o:La/cg80;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, La/cg80;->getSnapshotObserver()La/eg80;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    new-instance v0, La/rr;

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    move-object/from16 v6, p1

    .line 35
    .line 36
    move-wide/from16 v2, p2

    .line 37
    .line 38
    move-wide/from16 v4, p4

    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, La/rr;-><init>(Ljava/lang/Object;JJLjava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v10, La/eg80;->a:La/pgk0;

    .line 44
    .line 45
    sget-object v2, La/c810;->s:La/p610;

    .line 46
    .line 47
    invoke-virtual {v1, v6, v2, v0}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual/range {p0 .. p0}, La/c810;->M()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, v9, La/fp;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, La/iz40;

    .line 57
    .line 58
    iget-object v2, v9, La/fp;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, La/iz40;

    .line 61
    .line 62
    iget v3, v9, La/fp;->b:I

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    :goto_0
    if-ge v5, v3, :cond_4

    .line 66
    .line 67
    iget-object v6, v9, La/fp;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, [B

    .line 70
    .line 71
    aget-byte v6, v6, v5

    .line 72
    .line 73
    const/4 v7, 0x3

    .line 74
    if-ne v6, v7, :cond_2

    .line 75
    .line 76
    iget-object v6, v9, La/fp;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, [La/xlw;

    .line 79
    .line 80
    aget-object v6, v6, v5

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6}, La/iz40;->k(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    if-eqz v6, :cond_3

    .line 90
    .line 91
    if-eqz v8, :cond_3

    .line 92
    .line 93
    iget-object v6, v9, La/fp;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v6, [La/xlw;

    .line 96
    .line 97
    aget-object v6, v6, v5

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v6}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, La/iz40;

    .line 107
    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1, v6}, La/iz40;->j(La/iz40;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    iget v3, v9, La/fp;->b:I

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    :goto_2
    const/4 v7, 0x2

    .line 121
    if-ge v5, v3, :cond_7

    .line 122
    .line 123
    iget-object v8, v9, La/fp;->e:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v8, [B

    .line 126
    .line 127
    aget-byte v10, v8, v5

    .line 128
    .line 129
    if-ne v10, v7, :cond_5

    .line 130
    .line 131
    add-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    if-lez v6, :cond_6

    .line 135
    .line 136
    sub-int v10, v5, v6

    .line 137
    .line 138
    iget-object v11, v9, La/fp;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v11, [La/xlw;

    .line 141
    .line 142
    aget-object v12, v11, v5

    .line 143
    .line 144
    aput-object v12, v11, v10

    .line 145
    .line 146
    :cond_6
    :goto_3
    aput-byte v7, v8, v5

    .line 147
    .line 148
    add-int/lit8 v5, v5, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    iget v3, v9, La/fp;->b:I

    .line 152
    .line 153
    sub-int v5, v3, v6

    .line 154
    .line 155
    :goto_4
    const/4 v8, 0x0

    .line 156
    if-ge v5, v3, :cond_8

    .line 157
    .line 158
    iget-object v10, v9, La/fp;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v10, [La/xlw;

    .line 161
    .line 162
    aput-object v8, v10, v5

    .line 163
    .line 164
    add-int/lit8 v5, v5, 0x1

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    iget v3, v9, La/fp;->b:I

    .line 168
    .line 169
    sub-int/2addr v3, v6

    .line 170
    iput v3, v9, La/fp;->b:I

    .line 171
    .line 172
    invoke-virtual/range {p0 .. p0}, La/c810;->O0()La/c810;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    iget-object v5, v2, La/iz40;->b:[Ljava/lang/Object;

    .line 177
    .line 178
    iget-object v6, v2, La/iz40;->a:[J

    .line 179
    .line 180
    array-length v9, v6

    .line 181
    sub-int/2addr v9, v7

    .line 182
    const/4 v14, 0x7

    .line 183
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    move/from16 p1, v7

    .line 189
    .line 190
    const/16 v7, 0x8

    .line 191
    .line 192
    if-ltz v9, :cond_12

    .line 193
    .line 194
    const-wide/16 p3, 0x80

    .line 195
    .line 196
    const/4 v8, 0x0

    .line 197
    :goto_5
    aget-wide v10, v6, v8

    .line 198
    .line 199
    const-wide/16 v17, 0xff

    .line 200
    .line 201
    not-long v12, v10

    .line 202
    shl-long/2addr v12, v14

    .line 203
    and-long/2addr v12, v10

    .line 204
    and-long/2addr v12, v15

    .line 205
    cmp-long v12, v12, v15

    .line 206
    .line 207
    if-eqz v12, :cond_11

    .line 208
    .line 209
    sub-int v12, v8, v9

    .line 210
    .line 211
    not-int v12, v12

    .line 212
    ushr-int/lit8 v12, v12, 0x1f

    .line 213
    .line 214
    rsub-int/lit8 v12, v12, 0x8

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    :goto_6
    if-ge v13, v12, :cond_10

    .line 218
    .line 219
    and-long v19, v10, v17

    .line 220
    .line 221
    cmp-long v19, v19, p3

    .line 222
    .line 223
    if-gez v19, :cond_e

    .line 224
    .line 225
    shl-int/lit8 v19, v8, 0x3

    .line 226
    .line 227
    add-int v19, v19, v13

    .line 228
    .line 229
    aget-object v19, v5, v19

    .line 230
    .line 231
    move/from16 p5, v14

    .line 232
    .line 233
    move-object/from16 v14, v19

    .line 234
    .line 235
    check-cast v14, La/xlw;

    .line 236
    .line 237
    move-wide/from16 v19, v15

    .line 238
    .line 239
    if-nez v3, :cond_9

    .line 240
    .line 241
    move-object/from16 v15, p0

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_9
    move-object v15, v3

    .line 245
    :goto_7
    move/from16 v21, v7

    .line 246
    .line 247
    move-object v4, v15

    .line 248
    :goto_8
    iget-object v7, v4, La/c810;->q:La/fp;

    .line 249
    .line 250
    if-eqz v7, :cond_a

    .line 251
    .line 252
    iget-object v7, v7, La/fp;->c:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v7, [La/xlw;

    .line 255
    .line 256
    invoke-static {v14, v7}, La/tx3;->u(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    move/from16 v22, v0

    .line 261
    .line 262
    const/4 v0, 0x1

    .line 263
    if-ne v7, v0, :cond_b

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_a
    move/from16 v22, v0

    .line 267
    .line 268
    :cond_b
    invoke-virtual {v4}, La/c810;->O0()La/c810;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-nez v0, :cond_d

    .line 273
    .line 274
    :goto_9
    iget-object v0, v4, La/c810;->r:La/hz40;

    .line 275
    .line 276
    if-eqz v0, :cond_c

    .line 277
    .line 278
    invoke-virtual {v0, v14}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, La/iz40;

    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_c
    const/4 v0, 0x0

    .line 286
    :goto_a
    if-eqz v0, :cond_f

    .line 287
    .line 288
    invoke-virtual {v15, v0}, La/c810;->S0(La/iz40;)V

    .line 289
    .line 290
    .line 291
    goto :goto_b

    .line 292
    :cond_d
    move-object v4, v0

    .line 293
    move/from16 v0, v22

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_e
    move/from16 v22, v0

    .line 297
    .line 298
    move/from16 v21, v7

    .line 299
    .line 300
    move/from16 p5, v14

    .line 301
    .line 302
    move-wide/from16 v19, v15

    .line 303
    .line 304
    :cond_f
    :goto_b
    shr-long v10, v10, v21

    .line 305
    .line 306
    add-int/lit8 v13, v13, 0x1

    .line 307
    .line 308
    move/from16 v14, p5

    .line 309
    .line 310
    move-wide/from16 v15, v19

    .line 311
    .line 312
    move/from16 v7, v21

    .line 313
    .line 314
    move/from16 v0, v22

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_10
    move/from16 v22, v0

    .line 318
    .line 319
    move v0, v7

    .line 320
    move/from16 p5, v14

    .line 321
    .line 322
    move-wide/from16 v19, v15

    .line 323
    .line 324
    if-ne v12, v0, :cond_13

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_11
    move/from16 v22, v0

    .line 328
    .line 329
    move/from16 p5, v14

    .line 330
    .line 331
    move-wide/from16 v19, v15

    .line 332
    .line 333
    :goto_c
    if-eq v8, v9, :cond_13

    .line 334
    .line 335
    add-int/lit8 v8, v8, 0x1

    .line 336
    .line 337
    move/from16 v14, p5

    .line 338
    .line 339
    move-wide/from16 v15, v19

    .line 340
    .line 341
    move/from16 v0, v22

    .line 342
    .line 343
    const/16 v7, 0x8

    .line 344
    .line 345
    goto/16 :goto_5

    .line 346
    .line 347
    :cond_12
    move/from16 v22, v0

    .line 348
    .line 349
    move/from16 p5, v14

    .line 350
    .line 351
    move-wide/from16 v19, v15

    .line 352
    .line 353
    const-wide/16 p3, 0x80

    .line 354
    .line 355
    const-wide/16 v17, 0xff

    .line 356
    .line 357
    :cond_13
    invoke-virtual {v2}, La/iz40;->b()V

    .line 358
    .line 359
    .line 360
    iget-object v0, v1, La/iz40;->b:[Ljava/lang/Object;

    .line 361
    .line 362
    iget-object v2, v1, La/iz40;->a:[J

    .line 363
    .line 364
    array-length v3, v2

    .line 365
    add-int/lit8 v3, v3, -0x2

    .line 366
    .line 367
    if-ltz v3, :cond_18

    .line 368
    .line 369
    const/4 v4, 0x0

    .line 370
    :goto_d
    aget-wide v5, v2, v4

    .line 371
    .line 372
    not-long v7, v5

    .line 373
    shl-long v7, v7, p5

    .line 374
    .line 375
    and-long/2addr v7, v5

    .line 376
    and-long v7, v7, v19

    .line 377
    .line 378
    cmp-long v7, v7, v19

    .line 379
    .line 380
    if-eqz v7, :cond_17

    .line 381
    .line 382
    sub-int v7, v4, v3

    .line 383
    .line 384
    not-int v7, v7

    .line 385
    ushr-int/lit8 v7, v7, 0x1f

    .line 386
    .line 387
    const/16 v21, 0x8

    .line 388
    .line 389
    rsub-int/lit8 v7, v7, 0x8

    .line 390
    .line 391
    const/4 v8, 0x0

    .line 392
    :goto_e
    if-ge v8, v7, :cond_16

    .line 393
    .line 394
    and-long v9, v5, v17

    .line 395
    .line 396
    cmp-long v9, v9, p3

    .line 397
    .line 398
    if-gez v9, :cond_15

    .line 399
    .line 400
    shl-int/lit8 v9, v4, 0x3

    .line 401
    .line 402
    add-int/2addr v9, v8

    .line 403
    aget-object v9, v0, v9

    .line 404
    .line 405
    check-cast v9, La/g1v0;

    .line 406
    .line 407
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    check-cast v9, La/e7z;

    .line 412
    .line 413
    if-eqz v9, :cond_15

    .line 414
    .line 415
    if-eqz v22, :cond_14

    .line 416
    .line 417
    const/4 v10, 0x0

    .line 418
    invoke-virtual {v9, v10}, La/e7z;->T(Z)V

    .line 419
    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_14
    const/4 v10, 0x0

    .line 423
    invoke-virtual {v9, v10}, La/e7z;->V(Z)V

    .line 424
    .line 425
    .line 426
    :goto_f
    const/16 v9, 0x8

    .line 427
    .line 428
    goto :goto_10

    .line 429
    :cond_15
    const/4 v10, 0x0

    .line 430
    goto :goto_f

    .line 431
    :goto_10
    shr-long/2addr v5, v9

    .line 432
    add-int/lit8 v8, v8, 0x1

    .line 433
    .line 434
    goto :goto_e

    .line 435
    :cond_16
    const/16 v9, 0x8

    .line 436
    .line 437
    const/4 v10, 0x0

    .line 438
    if-ne v7, v9, :cond_18

    .line 439
    .line 440
    goto :goto_11

    .line 441
    :cond_17
    const/16 v9, 0x8

    .line 442
    .line 443
    const/4 v10, 0x0

    .line 444
    :goto_11
    if-eq v4, v3, :cond_18

    .line 445
    .line 446
    add-int/lit8 v4, v4, 0x1

    .line 447
    .line 448
    goto :goto_d

    .line 449
    :cond_18
    invoke-virtual {v1}, La/iz40;->b()V

    .line 450
    .line 451
    .line 452
    return-void
.end method
