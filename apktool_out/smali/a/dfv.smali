.class public final La/dfv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final C:La/c6z;


# instance fields
.field public A:Z

.field public B:Landroid/graphics/RectF;

.field public final a:La/ffv;

.field public b:La/w6k;

.field public c:La/k6z;

.field public d:Lkotlin/jvm/functions/Function1;

.field public final e:La/s43;

.field public f:Landroid/graphics/Outline;

.field public g:Z

.field public h:J

.field public i:J

.field public j:F

.field public k:La/x1x;

.field public l:La/w03;

.field public m:La/w03;

.field public n:Z

.field public o:La/a6a;

.field public p:La/ucs0;

.field public q:I

.field public final r:La/td9;

.field public s:Z

.field public t:J

.field public u:J

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "robolectric"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, La/jtv;->n:La/jtv;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v1, 0x1c

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    sget-object v0, La/gqw0;->q1:La/gqw0;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v0, La/rv00;->r:La/rv00;

    .line 24
    .line 25
    :goto_0
    sput-object v0, La/dfv;->C:La/c6z;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(La/ffv;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dfv;->a:La/ffv;

    .line 5
    .line 6
    sget-object v0, La/dj8;->h:La/z6k;

    .line 7
    .line 8
    iput-object v0, p0, La/dfv;->b:La/w6k;

    .line 9
    .line 10
    sget-object v0, La/k6z;->a:La/k6z;

    .line 11
    .line 12
    iput-object v0, p0, La/dfv;->c:La/k6z;

    .line 13
    .line 14
    sget-object v0, La/fvr;->w:La/fvr;

    .line 15
    .line 16
    iput-object v0, p0, La/dfv;->d:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    new-instance v0, La/s43;

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    invoke-direct {v0, p0, v1}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/dfv;->e:La/s43;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, La/dfv;->g:Z

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    iput-wide v0, p0, La/dfv;->h:J

    .line 32
    .line 33
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v2, p0, La/dfv;->i:J

    .line 39
    .line 40
    new-instance v4, La/td9;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v4, p0, La/dfv;->r:La/td9;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-interface {p1, v4}, La/ffv;->x(Z)V

    .line 49
    .line 50
    .line 51
    iput-wide v0, p0, La/dfv;->t:J

    .line 52
    .line 53
    iput-wide v0, p0, La/dfv;->u:J

    .line 54
    .line 55
    iput-wide v2, p0, La/dfv;->z:J

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, La/dfv;->g:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_10

    .line 7
    .line 8
    iget-boolean v1, v0, La/dfv;->A:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, v0, La/dfv;->a:La/ffv;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v4}, La/ffv;->T()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v5, 0x0

    .line 20
    cmpl-float v1, v1, v5

    .line 21
    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v4, v2}, La/ffv;->x(Z)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-interface {v4, v3, v5, v6}, La/ffv;->I(Landroid/graphics/Outline;J)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object v1, v0, La/dfv;->l:La/w03;

    .line 36
    .line 37
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/16 v7, 0x20

    .line 43
    .line 44
    if-eqz v1, :cond_d

    .line 45
    .line 46
    iget-object v8, v0, La/dfv;->B:Landroid/graphics/RectF;

    .line 47
    .line 48
    if-nez v8, :cond_2

    .line 49
    .line 50
    new-instance v8, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v8, v0, La/dfv;->B:Landroid/graphics/RectF;

    .line 56
    .line 57
    :cond_2
    instance-of v9, v1, La/w03;

    .line 58
    .line 59
    const-string v10, "Unable to obtain android.graphics.Path"

    .line 60
    .line 61
    if-eqz v9, :cond_c

    .line 62
    .line 63
    iget-object v11, v1, La/w03;->a:Landroid/graphics/Path;

    .line 64
    .line 65
    invoke-virtual {v11, v8, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 66
    .line 67
    .line 68
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v13, 0x1c

    .line 71
    .line 72
    const/4 v14, 0x1

    .line 73
    if-gt v12, v13, :cond_5

    .line 74
    .line 75
    invoke-virtual {v11}, Landroid/graphics/Path;->isConvex()Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-eqz v13, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-object v9, v0, La/dfv;->f:Landroid/graphics/Outline;

    .line 83
    .line 84
    if-eqz v9, :cond_4

    .line 85
    .line 86
    invoke-virtual {v9}, Landroid/graphics/Outline;->setEmpty()V

    .line 87
    .line 88
    .line 89
    :cond_4
    iput-boolean v14, v0, La/dfv;->n:Z

    .line 90
    .line 91
    move-object v13, v3

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    :goto_1
    iget-object v13, v0, La/dfv;->f:Landroid/graphics/Outline;

    .line 94
    .line 95
    if-nez v13, :cond_6

    .line 96
    .line 97
    new-instance v13, Landroid/graphics/Outline;

    .line 98
    .line 99
    invoke-direct {v13}, Landroid/graphics/Outline;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v13, v0, La/dfv;->f:Landroid/graphics/Outline;

    .line 103
    .line 104
    :cond_6
    const/16 v15, 0x1e

    .line 105
    .line 106
    if-lt v12, v15, :cond_8

    .line 107
    .line 108
    if-eqz v9, :cond_7

    .line 109
    .line 110
    invoke-static {v13, v11}, La/a7;->A(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    invoke-static {v10}, La/v4i0;->p(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_8
    if-eqz v9, :cond_b

    .line 119
    .line 120
    invoke-virtual {v13, v11}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    iget v9, v0, La/dfv;->v:I

    .line 124
    .line 125
    iget v10, v0, La/dfv;->w:I

    .line 126
    .line 127
    invoke-virtual {v13, v9, v10}, Landroid/graphics/Outline;->offset(II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v13}, Landroid/graphics/Outline;->canClip()Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    xor-int/2addr v9, v14

    .line 135
    iput-boolean v9, v0, La/dfv;->n:Z

    .line 136
    .line 137
    :goto_3
    iput-object v1, v0, La/dfv;->l:La/w03;

    .line 138
    .line 139
    if-eqz v13, :cond_9

    .line 140
    .line 141
    invoke-interface {v4}, La/ffv;->g()F

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-virtual {v13, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 146
    .line 147
    .line 148
    move-object v3, v13

    .line 149
    :cond_9
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    int-to-long v9, v1

    .line 166
    shl-long/2addr v9, v7

    .line 167
    int-to-long v7, v8

    .line 168
    and-long/2addr v5, v7

    .line 169
    or-long/2addr v5, v9

    .line 170
    invoke-interface {v4, v3, v5, v6}, La/ffv;->I(Landroid/graphics/Outline;J)V

    .line 171
    .line 172
    .line 173
    iget-boolean v1, v0, La/dfv;->n:Z

    .line 174
    .line 175
    if-eqz v1, :cond_a

    .line 176
    .line 177
    iget-boolean v1, v0, La/dfv;->A:Z

    .line 178
    .line 179
    if-eqz v1, :cond_a

    .line 180
    .line 181
    invoke-interface {v4, v2}, La/ffv;->x(Z)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v4}, La/ffv;->k()V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_5

    .line 188
    .line 189
    :cond_a
    iget-boolean v1, v0, La/dfv;->A:Z

    .line 190
    .line 191
    invoke-interface {v4, v1}, La/ffv;->x(Z)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_5

    .line 195
    .line 196
    :cond_b
    invoke-static {v10}, La/v4i0;->p(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_c
    invoke-static {v10}, La/v4i0;->p(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_d
    iget-boolean v1, v0, La/dfv;->A:Z

    .line 205
    .line 206
    invoke-interface {v4, v1}, La/ffv;->x(Z)V

    .line 207
    .line 208
    .line 209
    iget-object v1, v0, La/dfv;->f:Landroid/graphics/Outline;

    .line 210
    .line 211
    if-nez v1, :cond_e

    .line 212
    .line 213
    new-instance v1, Landroid/graphics/Outline;

    .line 214
    .line 215
    invoke-direct {v1}, Landroid/graphics/Outline;-><init>()V

    .line 216
    .line 217
    .line 218
    iput-object v1, v0, La/dfv;->f:Landroid/graphics/Outline;

    .line 219
    .line 220
    :cond_e
    move-object v8, v1

    .line 221
    iget-wide v9, v0, La/dfv;->u:J

    .line 222
    .line 223
    invoke-static {v9, v10}, La/n2x;->Q(J)J

    .line 224
    .line 225
    .line 226
    move-result-wide v9

    .line 227
    iget-wide v11, v0, La/dfv;->h:J

    .line 228
    .line 229
    iget-wide v13, v0, La/dfv;->i:J

    .line 230
    .line 231
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    cmp-long v1, v13, v15

    .line 237
    .line 238
    if-nez v1, :cond_f

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_f
    move-wide v9, v13

    .line 242
    :goto_4
    shr-long v13, v11, v7

    .line 243
    .line 244
    long-to-int v1, v13

    .line 245
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    and-long/2addr v11, v5

    .line 254
    long-to-int v11, v11

    .line 255
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 260
    .line 261
    .line 262
    move-result v12

    .line 263
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    shr-long v13, v9, v7

    .line 268
    .line 269
    long-to-int v14, v13

    .line 270
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    add-float/2addr v13, v1

    .line 275
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result v11

    .line 283
    and-long/2addr v9, v5

    .line 284
    long-to-int v15, v9

    .line 285
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    add-float/2addr v9, v11

    .line 290
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    iget v13, v0, La/dfv;->j:F

    .line 295
    .line 296
    move v11, v1

    .line 297
    move v10, v12

    .line 298
    move v12, v9

    .line 299
    move v9, v3

    .line 300
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v4}, La/ffv;->g()F

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-virtual {v8, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 308
    .line 309
    .line 310
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    int-to-long v9, v1

    .line 327
    shl-long/2addr v9, v7

    .line 328
    int-to-long v11, v3

    .line 329
    and-long/2addr v5, v11

    .line 330
    or-long/2addr v5, v9

    .line 331
    invoke-interface {v4, v8, v5, v6}, La/ffv;->I(Landroid/graphics/Outline;J)V

    .line 332
    .line 333
    .line 334
    :cond_10
    :goto_5
    iput-boolean v2, v0, La/dfv;->g:Z

    .line 335
    .line 336
    return-void
.end method

.method public final b()V
    .locals 15

    .line 1
    iget-boolean v0, p0, La/dfv;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget v0, p0, La/dfv;->q:I

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, La/dfv;->r:La/td9;

    .line 10
    .line 11
    iget-object v1, v0, La/td9;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/dfv;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, v1, La/dfv;->q:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    iput v2, v1, La/dfv;->q:I

    .line 22
    .line 23
    invoke-virtual {v1}, La/dfv;->b()V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, v0, La/td9;->b:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    iget-object v0, v0, La/td9;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/iz40;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    iget-object v1, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v0, La/iz40;->a:[J

    .line 38
    .line 39
    array-length v3, v2

    .line 40
    add-int/lit8 v3, v3, -0x2

    .line 41
    .line 42
    if-ltz v3, :cond_4

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    move v5, v4

    .line 46
    :goto_0
    aget-wide v6, v2, v5

    .line 47
    .line 48
    not-long v8, v6

    .line 49
    const/4 v10, 0x7

    .line 50
    shl-long/2addr v8, v10

    .line 51
    and-long/2addr v8, v6

    .line 52
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v8, v10

    .line 58
    cmp-long v8, v8, v10

    .line 59
    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    sub-int v8, v5, v3

    .line 63
    .line 64
    not-int v8, v8

    .line 65
    ushr-int/lit8 v8, v8, 0x1f

    .line 66
    .line 67
    const/16 v9, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v8, v8, 0x8

    .line 70
    .line 71
    move v10, v4

    .line 72
    :goto_1
    if-ge v10, v8, :cond_2

    .line 73
    .line 74
    const-wide/16 v11, 0xff

    .line 75
    .line 76
    and-long/2addr v11, v6

    .line 77
    const-wide/16 v13, 0x80

    .line 78
    .line 79
    cmp-long v11, v11, v13

    .line 80
    .line 81
    if-gez v11, :cond_1

    .line 82
    .line 83
    shl-int/lit8 v11, v5, 0x3

    .line 84
    .line 85
    add-int/2addr v11, v10

    .line 86
    aget-object v11, v1, v11

    .line 87
    .line 88
    check-cast v11, La/dfv;

    .line 89
    .line 90
    iget v12, v11, La/dfv;->q:I

    .line 91
    .line 92
    add-int/lit8 v12, v12, -0x1

    .line 93
    .line 94
    iput v12, v11, La/dfv;->q:I

    .line 95
    .line 96
    invoke-virtual {v11}, La/dfv;->b()V

    .line 97
    .line 98
    .line 99
    :cond_1
    shr-long/2addr v6, v9

    .line 100
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    if-ne v8, v9, :cond_4

    .line 104
    .line 105
    :cond_3
    if-eq v5, v3, :cond_4

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {v0}, La/iz40;->b()V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object p0, p0, La/dfv;->a:La/ffv;

    .line 114
    .line 115
    invoke-interface {p0}, La/ffv;->k()V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-void
.end method

.method public final c(La/x5a;La/dfv;)V
    .locals 22

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
    iget-boolean v3, v0, La/dfv;->s:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-wide v3, v0, La/dfv;->h:J

    .line 13
    .line 14
    invoke-static {v1}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {v5}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    iget-object v13, v0, La/dfv;->a:La/ffv;

    .line 23
    .line 24
    if-nez v11, :cond_4

    .line 25
    .line 26
    iget-wide v6, v0, La/dfv;->t:J

    .line 27
    .line 28
    const/16 v14, 0x20

    .line 29
    .line 30
    shr-long v8, v6, v14

    .line 31
    .line 32
    long-to-int v8, v8

    .line 33
    int-to-float v8, v8

    .line 34
    iget v9, v0, La/dfv;->v:I

    .line 35
    .line 36
    int-to-float v9, v9

    .line 37
    sub-float v9, v8, v9

    .line 38
    .line 39
    const-wide v15, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v6, v15

    .line 45
    long-to-int v6, v6

    .line 46
    int-to-float v6, v6

    .line 47
    iget v7, v0, La/dfv;->w:I

    .line 48
    .line 49
    int-to-float v7, v7

    .line 50
    sub-float v7, v6, v7

    .line 51
    .line 52
    move/from16 v17, v14

    .line 53
    .line 54
    move-wide/from16 v18, v15

    .line 55
    .line 56
    iget-wide v14, v0, La/dfv;->u:J

    .line 57
    .line 58
    move-object/from16 v20, v13

    .line 59
    .line 60
    shr-long v12, v14, v17

    .line 61
    .line 62
    long-to-int v10, v12

    .line 63
    int-to-float v10, v10

    .line 64
    add-float/2addr v8, v10

    .line 65
    iget v10, v0, La/dfv;->x:I

    .line 66
    .line 67
    int-to-float v10, v10

    .line 68
    add-float/2addr v8, v10

    .line 69
    and-long v12, v14, v18

    .line 70
    .line 71
    long-to-int v10, v12

    .line 72
    int-to-float v10, v10

    .line 73
    add-float/2addr v6, v10

    .line 74
    iget v10, v0, La/dfv;->y:I

    .line 75
    .line 76
    int-to-float v10, v10

    .line 77
    add-float/2addr v6, v10

    .line 78
    invoke-interface/range {v20 .. v20}, La/ffv;->g()F

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    invoke-interface/range {v20 .. v20}, La/ffv;->m()La/a4d;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-interface/range {v20 .. v20}, La/ffv;->D()I

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    const/high16 v14, 0x3f800000    # 1.0f

    .line 91
    .line 92
    cmpg-float v14, v10, v14

    .line 93
    .line 94
    if-ltz v14, :cond_2

    .line 95
    .line 96
    const/4 v14, 0x3

    .line 97
    if-ne v13, v14, :cond_2

    .line 98
    .line 99
    if-nez v12, :cond_2

    .line 100
    .line 101
    invoke-interface/range {v20 .. v20}, La/ffv;->l()I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    const/4 v15, 0x1

    .line 106
    if-ne v14, v15, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v5}, Landroid/graphics/Canvas;->save()I

    .line 110
    .line 111
    .line 112
    move v6, v9

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    :goto_0
    iget-object v14, v0, La/dfv;->p:La/ucs0;

    .line 115
    .line 116
    if-nez v14, :cond_3

    .line 117
    .line 118
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    iput-object v14, v0, La/dfv;->p:La/ucs0;

    .line 123
    .line 124
    :cond_3
    invoke-virtual {v14, v10}, La/ucs0;->q(F)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v14, v13}, La/ucs0;->r(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v14, v12}, La/ucs0;->t(La/a4d;)V

    .line 131
    .line 132
    .line 133
    iget-object v10, v14, La/ucs0;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v10, Landroid/graphics/Paint;

    .line 136
    .line 137
    move/from16 v21, v9

    .line 138
    .line 139
    move v9, v6

    .line 140
    move/from16 v6, v21

    .line 141
    .line 142
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 143
    .line 144
    .line 145
    :goto_1
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 146
    .line 147
    .line 148
    invoke-interface/range {v20 .. v20}, La/ffv;->z()Landroid/graphics/Matrix;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget v7, v0, La/dfv;->v:I

    .line 153
    .line 154
    int-to-float v7, v7

    .line 155
    iget v8, v0, La/dfv;->w:I

    .line 156
    .line 157
    int-to-float v8, v8

    .line 158
    invoke-virtual {v6, v7, v8}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 162
    .line 163
    .line 164
    iget-wide v6, v0, La/dfv;->h:J

    .line 165
    .line 166
    iget v8, v0, La/dfv;->v:I

    .line 167
    .line 168
    int-to-float v8, v8

    .line 169
    iget v9, v0, La/dfv;->w:I

    .line 170
    .line 171
    int-to-float v9, v9

    .line 172
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    int-to-long v12, v8

    .line 177
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    int-to-long v8, v8

    .line 182
    shl-long v12, v12, v17

    .line 183
    .line 184
    and-long v8, v8, v18

    .line 185
    .line 186
    or-long/2addr v8, v12

    .line 187
    invoke-static {v6, v7, v8, v9}, La/ne60;->e(JJ)J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    iput-wide v6, v0, La/dfv;->h:J

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_4
    move-object/from16 v20, v13

    .line 195
    .line 196
    :goto_2
    invoke-virtual {v0}, La/dfv;->a()V

    .line 197
    .line 198
    .line 199
    invoke-interface/range {v20 .. v20}, La/ffv;->p()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-nez v6, :cond_5

    .line 204
    .line 205
    :try_start_0
    iget-object v6, v0, La/dfv;->b:La/w6k;

    .line 206
    .line 207
    iget-object v7, v0, La/dfv;->c:La/k6z;

    .line 208
    .line 209
    iget-object v8, v0, La/dfv;->e:La/s43;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    move-object/from16 v9, v20

    .line 212
    .line 213
    :try_start_1
    invoke-interface {v9, v6, v7, v0, v8}, La/ffv;->K(La/w6k;La/k6z;La/dfv;La/s43;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :catchall_0
    :cond_5
    move-object/from16 v9, v20

    .line 218
    .line 219
    :catchall_1
    :goto_3
    invoke-interface {v9}, La/ffv;->T()F

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    const/4 v7, 0x0

    .line 224
    cmpl-float v6, v6, v7

    .line 225
    .line 226
    const/4 v15, 0x0

    .line 227
    if-lez v6, :cond_6

    .line 228
    .line 229
    const/4 v6, 0x1

    .line 230
    goto :goto_4

    .line 231
    :cond_6
    move v6, v15

    .line 232
    :goto_4
    if-eqz v6, :cond_7

    .line 233
    .line 234
    invoke-interface {v1}, La/x5a;->j()V

    .line 235
    .line 236
    .line 237
    :cond_7
    if-nez v11, :cond_8

    .line 238
    .line 239
    iget-boolean v7, v0, La/dfv;->A:Z

    .line 240
    .line 241
    if-eqz v7, :cond_8

    .line 242
    .line 243
    const/4 v7, 0x1

    .line 244
    goto :goto_5

    .line 245
    :cond_8
    move v7, v15

    .line 246
    :goto_5
    if-eqz v7, :cond_d

    .line 247
    .line 248
    invoke-interface {v1}, La/x5a;->l()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, La/dfv;->e()La/x1x;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    instance-of v10, v8, La/oe80;

    .line 256
    .line 257
    if-eqz v10, :cond_9

    .line 258
    .line 259
    check-cast v8, La/oe80;

    .line 260
    .line 261
    iget-object v8, v8, La/oe80;->a:La/jge0;

    .line 262
    .line 263
    invoke-static {v1, v8}, La/x5a;->h(La/x5a;La/jge0;)V

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_9
    instance-of v10, v8, La/pe80;

    .line 268
    .line 269
    if-eqz v10, :cond_b

    .line 270
    .line 271
    iget-object v10, v0, La/dfv;->m:La/w03;

    .line 272
    .line 273
    if-eqz v10, :cond_a

    .line 274
    .line 275
    invoke-virtual {v10}, La/w03;->i()V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_a
    invoke-static {}, La/z03;->a()La/w03;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    iput-object v10, v0, La/dfv;->m:La/w03;

    .line 284
    .line 285
    :goto_6
    check-cast v8, La/pe80;

    .line 286
    .line 287
    iget-object v8, v8, La/pe80;->a:La/wfg0;

    .line 288
    .line 289
    invoke-static {v10, v8}, La/w03;->b(La/w03;La/wfg0;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v1, v10}, La/x5a;->c(La/w03;)V

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_b
    instance-of v10, v8, La/ne80;

    .line 297
    .line 298
    if-eqz v10, :cond_c

    .line 299
    .line 300
    check-cast v8, La/ne80;

    .line 301
    .line 302
    iget-object v8, v8, La/ne80;->a:La/w03;

    .line 303
    .line 304
    invoke-interface {v1, v8}, La/x5a;->c(La/w03;)V

    .line 305
    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_d
    :goto_7
    if-eqz v2, :cond_13

    .line 313
    .line 314
    iget-object v2, v2, La/dfv;->r:La/td9;

    .line 315
    .line 316
    iget-boolean v8, v2, La/td9;->a:Z

    .line 317
    .line 318
    if-nez v8, :cond_e

    .line 319
    .line 320
    const-string v8, "Only add dependencies during a tracking"

    .line 321
    .line 322
    invoke-static {v8}, La/wcx;->a(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    :cond_e
    iget-object v8, v2, La/td9;->d:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v8, La/iz40;

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    if-eqz v8, :cond_f

    .line 331
    .line 332
    invoke-virtual {v8, v0}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_f
    iget-object v8, v2, La/td9;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v8, La/dfv;

    .line 339
    .line 340
    if-eqz v8, :cond_10

    .line 341
    .line 342
    sget-object v8, La/v1h0;->a:La/iz40;

    .line 343
    .line 344
    new-instance v8, La/iz40;

    .line 345
    .line 346
    invoke-direct {v8}, La/iz40;-><init>()V

    .line 347
    .line 348
    .line 349
    iget-object v12, v2, La/td9;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v12, La/dfv;

    .line 352
    .line 353
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v8, v12}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    invoke-virtual {v8, v0}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    iput-object v8, v2, La/td9;->d:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v10, v2, La/td9;->b:Ljava/lang/Object;

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_10
    iput-object v0, v2, La/td9;->b:Ljava/lang/Object;

    .line 368
    .line 369
    :goto_8
    iget-object v8, v2, La/td9;->e:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v8, La/iz40;

    .line 372
    .line 373
    if-eqz v8, :cond_11

    .line 374
    .line 375
    invoke-virtual {v8, v0}, La/iz40;->l(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    const/16 v16, 0x1

    .line 380
    .line 381
    xor-int/lit8 v15, v2, 0x1

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_11
    const/16 v16, 0x1

    .line 385
    .line 386
    iget-object v8, v2, La/td9;->c:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v8, La/dfv;

    .line 389
    .line 390
    if-eq v8, v0, :cond_12

    .line 391
    .line 392
    move/from16 v15, v16

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_12
    iput-object v10, v2, La/td9;->c:Ljava/lang/Object;

    .line 396
    .line 397
    :goto_9
    if-eqz v15, :cond_13

    .line 398
    .line 399
    iget v2, v0, La/dfv;->q:I

    .line 400
    .line 401
    add-int/lit8 v2, v2, 0x1

    .line 402
    .line 403
    iput v2, v0, La/dfv;->q:I

    .line 404
    .line 405
    :cond_13
    move-object v2, v1

    .line 406
    check-cast v2, La/uw2;

    .line 407
    .line 408
    iget-object v2, v2, La/uw2;->a:Landroid/graphics/Canvas;

    .line 409
    .line 410
    invoke-virtual {v2}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-nez v2, :cond_15

    .line 415
    .line 416
    iget-object v2, v0, La/dfv;->o:La/a6a;

    .line 417
    .line 418
    if-nez v2, :cond_14

    .line 419
    .line 420
    new-instance v2, La/a6a;

    .line 421
    .line 422
    invoke-direct {v2}, La/a6a;-><init>()V

    .line 423
    .line 424
    .line 425
    iput-object v2, v0, La/dfv;->o:La/a6a;

    .line 426
    .line 427
    :cond_14
    iget-object v8, v2, La/a6a;->b:La/nr;

    .line 428
    .line 429
    iget-object v9, v0, La/dfv;->b:La/w6k;

    .line 430
    .line 431
    iget-object v10, v0, La/dfv;->c:La/k6z;

    .line 432
    .line 433
    iget-wide v12, v0, La/dfv;->u:J

    .line 434
    .line 435
    invoke-static {v12, v13}, La/n2x;->Q(J)J

    .line 436
    .line 437
    .line 438
    move-result-wide v12

    .line 439
    invoke-virtual {v8}, La/nr;->j()La/w6k;

    .line 440
    .line 441
    .line 442
    move-result-object v14

    .line 443
    invoke-virtual {v8}, La/nr;->o()La/k6z;

    .line 444
    .line 445
    .line 446
    move-result-object v15

    .line 447
    move-object/from16 v16, v5

    .line 448
    .line 449
    invoke-virtual {v8}, La/nr;->i()La/x5a;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    move/from16 v17, v6

    .line 454
    .line 455
    move/from16 v18, v7

    .line 456
    .line 457
    invoke-virtual {v8}, La/nr;->p()J

    .line 458
    .line 459
    .line 460
    move-result-wide v6

    .line 461
    move/from16 v19, v11

    .line 462
    .line 463
    iget-object v11, v8, La/nr;->c:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v11, La/dfv;

    .line 466
    .line 467
    invoke-virtual {v8, v9}, La/nr;->F(La/w6k;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v8, v10}, La/nr;->G(La/k6z;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v8, v1}, La/nr;->E(La/x5a;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v8, v12, v13}, La/nr;->H(J)V

    .line 477
    .line 478
    .line 479
    iput-object v0, v8, La/nr;->c:Ljava/lang/Object;

    .line 480
    .line 481
    invoke-interface {v1}, La/x5a;->l()V

    .line 482
    .line 483
    .line 484
    :try_start_2
    invoke-virtual {v0, v2}, La/dfv;->d(La/fhl;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 485
    .line 486
    .line 487
    invoke-interface {v1}, La/x5a;->i()V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v8, v14}, La/nr;->F(La/w6k;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v8, v15}, La/nr;->G(La/k6z;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8, v5}, La/nr;->E(La/x5a;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v8, v6, v7}, La/nr;->H(J)V

    .line 500
    .line 501
    .line 502
    iput-object v11, v8, La/nr;->c:Ljava/lang/Object;

    .line 503
    .line 504
    goto :goto_a

    .line 505
    :catchall_2
    move-exception v0

    .line 506
    invoke-interface {v1}, La/x5a;->i()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v8, v14}, La/nr;->F(La/w6k;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v8, v15}, La/nr;->G(La/k6z;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v8, v5}, La/nr;->E(La/x5a;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v8, v6, v7}, La/nr;->H(J)V

    .line 519
    .line 520
    .line 521
    iput-object v11, v8, La/nr;->c:Ljava/lang/Object;

    .line 522
    .line 523
    throw v0

    .line 524
    :cond_15
    move-object/from16 v16, v5

    .line 525
    .line 526
    move/from16 v17, v6

    .line 527
    .line 528
    move/from16 v18, v7

    .line 529
    .line 530
    move/from16 v19, v11

    .line 531
    .line 532
    invoke-interface {v9, v1}, La/ffv;->L(La/x5a;)V

    .line 533
    .line 534
    .line 535
    :goto_a
    if-eqz v18, :cond_16

    .line 536
    .line 537
    invoke-interface {v1}, La/x5a;->i()V

    .line 538
    .line 539
    .line 540
    :cond_16
    if-eqz v17, :cond_17

    .line 541
    .line 542
    invoke-interface {v1}, La/x5a;->n()V

    .line 543
    .line 544
    .line 545
    :cond_17
    if-nez v19, :cond_18

    .line 546
    .line 547
    invoke-virtual/range {v16 .. v16}, Landroid/graphics/Canvas;->restore()V

    .line 548
    .line 549
    .line 550
    :cond_18
    iput-wide v3, v0, La/dfv;->h:J

    .line 551
    .line 552
    return-void
.end method

.method public final d(La/fhl;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/dfv;->r:La/td9;

    .line 2
    .line 3
    iget-object v1, v0, La/td9;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/dfv;

    .line 6
    .line 7
    iput-object v1, v0, La/td9;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, v0, La/td9;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/iz40;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, La/iz40;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, La/td9;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/iz40;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    sget-object v2, La/v1h0;->a:La/iz40;

    .line 28
    .line 29
    new-instance v2, La/iz40;

    .line 30
    .line 31
    invoke-direct {v2}, La/iz40;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, La/td9;->e:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v2, v1}, La/iz40;->j(La/iz40;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, La/iz40;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, v0, La/td9;->a:Z

    .line 44
    .line 45
    iget-object p0, p0, La/dfv;->d:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput-boolean p0, v0, La/td9;->a:Z

    .line 52
    .line 53
    iget-object p1, v0, La/td9;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, La/dfv;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget v1, p1, La/dfv;->q:I

    .line 60
    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    iput v1, p1, La/dfv;->q:I

    .line 64
    .line 65
    invoke-virtual {p1}, La/dfv;->b()V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object p1, v0, La/td9;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, La/iz40;

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    invoke-virtual {p1}, La/iz40;->h()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    iget-object v0, p1, La/iz40;->b:[Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v1, p1, La/iz40;->a:[J

    .line 83
    .line 84
    array-length v2, v1

    .line 85
    add-int/lit8 v2, v2, -0x2

    .line 86
    .line 87
    if-ltz v2, :cond_6

    .line 88
    .line 89
    move v3, p0

    .line 90
    :goto_0
    aget-wide v4, v1, v3

    .line 91
    .line 92
    not-long v6, v4

    .line 93
    const/4 v8, 0x7

    .line 94
    shl-long/2addr v6, v8

    .line 95
    and-long/2addr v6, v4

    .line 96
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr v6, v8

    .line 102
    cmp-long v6, v6, v8

    .line 103
    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    sub-int v6, v3, v2

    .line 107
    .line 108
    not-int v6, v6

    .line 109
    ushr-int/lit8 v6, v6, 0x1f

    .line 110
    .line 111
    const/16 v7, 0x8

    .line 112
    .line 113
    rsub-int/lit8 v6, v6, 0x8

    .line 114
    .line 115
    move v8, p0

    .line 116
    :goto_1
    if-ge v8, v6, :cond_4

    .line 117
    .line 118
    const-wide/16 v9, 0xff

    .line 119
    .line 120
    and-long/2addr v9, v4

    .line 121
    const-wide/16 v11, 0x80

    .line 122
    .line 123
    cmp-long v9, v9, v11

    .line 124
    .line 125
    if-gez v9, :cond_3

    .line 126
    .line 127
    shl-int/lit8 v9, v3, 0x3

    .line 128
    .line 129
    add-int/2addr v9, v8

    .line 130
    aget-object v9, v0, v9

    .line 131
    .line 132
    check-cast v9, La/dfv;

    .line 133
    .line 134
    iget v10, v9, La/dfv;->q:I

    .line 135
    .line 136
    add-int/lit8 v10, v10, -0x1

    .line 137
    .line 138
    iput v10, v9, La/dfv;->q:I

    .line 139
    .line 140
    invoke-virtual {v9}, La/dfv;->b()V

    .line 141
    .line 142
    .line 143
    :cond_3
    shr-long/2addr v4, v7

    .line 144
    add-int/lit8 v8, v8, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    if-ne v6, v7, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v3, v2, :cond_6

    .line 150
    .line 151
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_6
    invoke-virtual {p1}, La/iz40;->b()V

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void
.end method

.method public final e()La/x1x;
    .locals 14

    .line 1
    iget-object v0, p0, La/dfv;->k:La/x1x;

    .line 2
    .line 3
    iget-object v1, p0, La/dfv;->l:La/w03;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    new-instance v0, La/ne80;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/ne80;-><init>(La/w03;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/dfv;->k:La/x1x;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-wide v0, p0, La/dfv;->u:J

    .line 19
    .line 20
    invoke-static {v0, v1}, La/n2x;->Q(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v2, p0, La/dfv;->h:J

    .line 25
    .line 26
    iget-wide v4, p0, La/dfv;->i:J

    .line 27
    .line 28
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v6, v4, v6

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-wide v0, v4

    .line 39
    :goto_0
    const/16 v4, 0x20

    .line 40
    .line 41
    shr-long v5, v2, v4

    .line 42
    .line 43
    long-to-int v5, v5

    .line 44
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    const-wide v7, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v2, v7

    .line 54
    long-to-int v2, v2

    .line 55
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    shr-long v9, v0, v4

    .line 60
    .line 61
    long-to-int v3, v9

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-float/2addr v3, v6

    .line 67
    and-long/2addr v0, v7

    .line 68
    long-to-int v0, v0

    .line 69
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-float v9, v0, v2

    .line 74
    .line 75
    iget v0, p0, La/dfv;->j:F

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    cmpl-float v1, v0, v1

    .line 79
    .line 80
    if-lez v1, :cond_3

    .line 81
    .line 82
    new-instance v1, La/pe80;

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    int-to-long v10, v5

    .line 89
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v12, v0

    .line 94
    shl-long v4, v10, v4

    .line 95
    .line 96
    and-long/2addr v7, v12

    .line 97
    or-long v10, v4, v7

    .line 98
    .line 99
    move v7, v2

    .line 100
    move v8, v3

    .line 101
    invoke-static/range {v6 .. v11}, La/r8x;->v(FFFFJ)La/wfg0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v1, v0}, La/pe80;-><init>(La/wfg0;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move v7, v2

    .line 110
    move v8, v3

    .line 111
    new-instance v1, La/oe80;

    .line 112
    .line 113
    new-instance v0, La/jge0;

    .line 114
    .line 115
    invoke-direct {v0, v6, v7, v8, v9}, La/jge0;-><init>(FFFF)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v0}, La/oe80;-><init>(La/jge0;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    iput-object v1, p0, La/dfv;->k:La/x1x;

    .line 122
    .line 123
    return-object v1
.end method

.method public final f(La/w6k;La/k6z;JLkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    iget-wide v0, p0, La/dfv;->u:J

    .line 2
    .line 3
    invoke-static {v0, v1, p3, p4}, La/qkx;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, La/dfv;->a:La/ffv;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iput-wide p3, p0, La/dfv;->u:J

    .line 12
    .line 13
    iget-wide v2, p0, La/dfv;->t:J

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    shr-long v4, v2, v0

    .line 18
    .line 19
    long-to-int v0, v4

    .line 20
    const-wide v4, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    long-to-int v2, v2

    .line 27
    invoke-interface {v1, v0, v2, p3, p4}, La/ffv;->n(IIJ)V

    .line 28
    .line 29
    .line 30
    iget-wide p3, p0, La/dfv;->i:J

    .line 31
    .line 32
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long p3, p3, v2

    .line 38
    .line 39
    if-nez p3, :cond_0

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    iput-boolean p3, p0, La/dfv;->g:Z

    .line 43
    .line 44
    invoke-virtual {p0}, La/dfv;->a()V

    .line 45
    .line 46
    .line 47
    :cond_0
    iput-object p1, p0, La/dfv;->b:La/w6k;

    .line 48
    .line 49
    iput-object p2, p0, La/dfv;->c:La/k6z;

    .line 50
    .line 51
    iput-object p5, p0, La/dfv;->d:Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    iget-object p3, p0, La/dfv;->e:La/s43;

    .line 54
    .line 55
    invoke-interface {v1, p1, p2, p0, p3}, La/ffv;->K(La/w6k;La/k6z;La/dfv;La/s43;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final g(F)V
    .locals 1

    .line 1
    iget-object p0, p0, La/dfv;->a:La/ffv;

    .line 2
    .line 3
    invoke-interface {p0}, La/ffv;->g()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    cmpg-float v0, v0, p1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p0, p1}, La/ffv;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final h(FJJ)V
    .locals 6

    .line 1
    iget v0, p0, La/dfv;->v:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p0, La/dfv;->w:I

    .line 5
    .line 6
    int-to-float v1, v1

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-long v2, v0

    .line 12
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-long v0, v0

    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    shl-long/2addr v2, v4

    .line 20
    const-wide v4, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v4

    .line 26
    or-long/2addr v0, v2

    .line 27
    invoke-static {p2, p3, v0, v1}, La/ne60;->f(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p2

    .line 31
    iget-wide v0, p0, La/dfv;->h:J

    .line 32
    .line 33
    invoke-static {v0, v1, p2, p3}, La/ne60;->c(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-wide v0, p0, La/dfv;->i:J

    .line 40
    .line 41
    invoke-static {v0, v1, p4, p5}, La/h7k0;->b(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget v0, p0, La/dfv;->j:F

    .line 48
    .line 49
    cmpg-float v0, v0, p1

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, La/dfv;->l:La/w03;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void

    .line 59
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, La/dfv;->k:La/x1x;

    .line 61
    .line 62
    iput-object v0, p0, La/dfv;->l:La/w03;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, La/dfv;->g:Z

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, La/dfv;->n:Z

    .line 69
    .line 70
    iput-wide p2, p0, La/dfv;->h:J

    .line 71
    .line 72
    iput-wide p4, p0, La/dfv;->i:J

    .line 73
    .line 74
    iput p1, p0, La/dfv;->j:F

    .line 75
    .line 76
    invoke-virtual {p0}, La/dfv;->a()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final i(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/cfv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/cfv;

    .line 7
    .line 8
    iget v1, v0, La/cfv;->k:I

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
    iput v1, v0, La/cfv;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cfv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/cfv;-><init>(La/dfv;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/cfv;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cfv;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/cfv;->k:I

    .line 51
    .line 52
    sget-object p1, La/dfv;->C:La/c6z;

    .line 53
    .line 54
    invoke-interface {p1, p0, v0}, La/c6z;->b(La/dfv;La/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 62
    .line 63
    new-instance p0, La/vz2;

    .line 64
    .line 65
    invoke-direct {p0, p1}, La/vz2;-><init>(Landroid/graphics/Bitmap;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method
