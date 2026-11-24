.class public final La/rjv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/trn;


# instance fields
.field public final a:La/y3v;

.field public b:Ljava/lang/String;

.field public c:La/ncs0;

.field public d:La/qjv;

.field public e:Z

.field public final f:[Z

.field public final g:La/y850;

.field public final h:La/y850;

.field public final i:La/y850;

.field public final j:La/y850;

.field public final k:La/y850;

.field public l:J

.field public m:J

.field public final n:La/fq80;


# direct methods
.method public constructor <init>(La/y3v;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rjv;->a:La/y3v;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, La/rjv;->f:[Z

    .line 10
    .line 11
    new-instance p1, La/y850;

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    invoke-direct {p1, v0}, La/y850;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/rjv;->g:La/y850;

    .line 19
    .line 20
    new-instance p1, La/y850;

    .line 21
    .line 22
    const/16 v0, 0x21

    .line 23
    .line 24
    invoke-direct {p1, v0}, La/y850;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/rjv;->h:La/y850;

    .line 28
    .line 29
    new-instance p1, La/y850;

    .line 30
    .line 31
    const/16 v0, 0x22

    .line 32
    .line 33
    invoke-direct {p1, v0}, La/y850;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/rjv;->i:La/y850;

    .line 37
    .line 38
    new-instance p1, La/y850;

    .line 39
    .line 40
    const/16 v0, 0x27

    .line 41
    .line 42
    invoke-direct {p1, v0}, La/y850;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, La/rjv;->j:La/y850;

    .line 46
    .line 47
    new-instance p1, La/y850;

    .line 48
    .line 49
    const/16 v0, 0x28

    .line 50
    .line 51
    invoke-direct {p1, v0}, La/y850;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/rjv;->k:La/y850;

    .line 55
    .line 56
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    iput-wide v0, p0, La/rjv;->m:J

    .line 62
    .line 63
    new-instance p1, La/fq80;

    .line 64
    .line 65
    invoke-direct {p1}, La/fq80;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, La/rjv;->n:La/fq80;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(La/fq80;)V
    .locals 12

    .line 1
    iget-object v1, p0, La/rjv;->c:La/ncs0;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, La/fq80;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_5

    .line 13
    .line 14
    iget v1, p1, La/fq80;->b:I

    .line 15
    .line 16
    iget v7, p1, La/fq80;->c:I

    .line 17
    .line 18
    iget-object v8, p1, La/fq80;->a:[B

    .line 19
    .line 20
    iget-wide v2, p0, La/rjv;->l:J

    .line 21
    .line 22
    invoke-virtual {p1}, La/fq80;->a()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    int-to-long v4, v4

    .line 27
    add-long/2addr v2, v4

    .line 28
    iput-wide v2, p0, La/rjv;->l:J

    .line 29
    .line 30
    iget-object v2, p0, La/rjv;->c:La/ncs0;

    .line 31
    .line 32
    invoke-virtual {p1}, La/fq80;->a()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-interface {v2, v3, p1}, La/ncs0;->a(ILa/fq80;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    if-ge v1, v7, :cond_0

    .line 40
    .line 41
    iget-object v2, p0, La/rjv;->f:[Z

    .line 42
    .line 43
    invoke-static {v8, v1, v7, v2}, La/ntr;->a0([BII[Z)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-ne v2, v7, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, v8, v1, v7}, La/rjv;->h([BII)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    add-int/lit8 v3, v2, 0x3

    .line 54
    .line 55
    aget-byte v3, v8, v3

    .line 56
    .line 57
    and-int/lit8 v3, v3, 0x7e

    .line 58
    .line 59
    shr-int/lit8 v9, v3, 0x1

    .line 60
    .line 61
    if-lez v2, :cond_2

    .line 62
    .line 63
    add-int/lit8 v3, v2, -0x1

    .line 64
    .line 65
    aget-byte v3, v8, v3

    .line 66
    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    add-int/lit8 v2, v2, -0x1

    .line 70
    .line 71
    const/4 v3, 0x4

    .line 72
    :goto_1
    move v10, v2

    .line 73
    move v11, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/4 v3, 0x3

    .line 76
    goto :goto_1

    .line 77
    :goto_2
    sub-int v2, v10, v1

    .line 78
    .line 79
    if-lez v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, v8, v1, v10}, La/rjv;->h([BII)V

    .line 82
    .line 83
    .line 84
    :cond_3
    sub-int v1, v7, v10

    .line 85
    .line 86
    iget-wide v3, p0, La/rjv;->l:J

    .line 87
    .line 88
    int-to-long v5, v1

    .line 89
    sub-long/2addr v3, v5

    .line 90
    if-gez v2, :cond_4

    .line 91
    .line 92
    neg-int v2, v2

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    const/4 v2, 0x0

    .line 95
    :goto_3
    iget-wide v5, p0, La/rjv;->m:J

    .line 96
    .line 97
    move-object v0, p0

    .line 98
    invoke-virtual/range {v0 .. v6}, La/rjv;->b(IIJJ)V

    .line 99
    .line 100
    .line 101
    iget-wide v5, p0, La/rjv;->m:J

    .line 102
    .line 103
    move v2, v9

    .line 104
    invoke-virtual/range {v0 .. v6}, La/rjv;->i(IIJJ)V

    .line 105
    .line 106
    .line 107
    add-int v1, v10, v11

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    return-void
.end method

.method public final b(IIJJ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-wide/from16 v2, p5

    .line 6
    .line 7
    iget-object v4, v0, La/rjv;->a:La/y3v;

    .line 8
    .line 9
    iget-object v4, v4, La/y3v;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, La/fp;

    .line 12
    .line 13
    iget-object v5, v0, La/rjv;->d:La/qjv;

    .line 14
    .line 15
    iget-boolean v6, v0, La/rjv;->e:Z

    .line 16
    .line 17
    iget-boolean v7, v5, La/qjv;->j:Z

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    iget-boolean v7, v5, La/qjv;->g:Z

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    iget-boolean v6, v5, La/qjv;->c:Z

    .line 28
    .line 29
    iput-boolean v6, v5, La/qjv;->m:Z

    .line 30
    .line 31
    iput-boolean v8, v5, La/qjv;->j:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-boolean v7, v5, La/qjv;->h:Z

    .line 35
    .line 36
    if-nez v7, :cond_1

    .line 37
    .line 38
    iget-boolean v7, v5, La/qjv;->g:Z

    .line 39
    .line 40
    if-eqz v7, :cond_3

    .line 41
    .line 42
    :cond_1
    if-eqz v6, :cond_2

    .line 43
    .line 44
    iget-boolean v6, v5, La/qjv;->i:Z

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    iget-wide v6, v5, La/qjv;->b:J

    .line 49
    .line 50
    sub-long v6, p3, v6

    .line 51
    .line 52
    long-to-int v6, v6

    .line 53
    add-int v6, p1, v6

    .line 54
    .line 55
    invoke-virtual {v5, v6}, La/qjv;->a(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-wide v6, v5, La/qjv;->b:J

    .line 59
    .line 60
    iput-wide v6, v5, La/qjv;->k:J

    .line 61
    .line 62
    iget-wide v6, v5, La/qjv;->e:J

    .line 63
    .line 64
    iput-wide v6, v5, La/qjv;->l:J

    .line 65
    .line 66
    iget-boolean v6, v5, La/qjv;->c:Z

    .line 67
    .line 68
    iput-boolean v6, v5, La/qjv;->m:Z

    .line 69
    .line 70
    iput-boolean v9, v5, La/qjv;->i:Z

    .line 71
    .line 72
    :cond_3
    :goto_0
    iget-boolean v5, v0, La/rjv;->e:Z

    .line 73
    .line 74
    if-nez v5, :cond_6

    .line 75
    .line 76
    iget-object v5, v0, La/rjv;->g:La/y850;

    .line 77
    .line 78
    invoke-virtual {v5, v1}, La/y850;->b(I)Z

    .line 79
    .line 80
    .line 81
    iget-object v6, v0, La/rjv;->h:La/y850;

    .line 82
    .line 83
    invoke-virtual {v6, v1}, La/y850;->b(I)Z

    .line 84
    .line 85
    .line 86
    iget-object v7, v0, La/rjv;->i:La/y850;

    .line 87
    .line 88
    invoke-virtual {v7, v1}, La/y850;->b(I)Z

    .line 89
    .line 90
    .line 91
    iget-boolean v10, v5, La/y850;->c:Z

    .line 92
    .line 93
    if-eqz v10, :cond_6

    .line 94
    .line 95
    iget-boolean v10, v6, La/y850;->c:Z

    .line 96
    .line 97
    if-eqz v10, :cond_6

    .line 98
    .line 99
    iget-boolean v10, v7, La/y850;->c:Z

    .line 100
    .line 101
    if-eqz v10, :cond_6

    .line 102
    .line 103
    iget-object v10, v0, La/rjv;->b:Ljava/lang/String;

    .line 104
    .line 105
    iget v11, v5, La/y850;->e:I

    .line 106
    .line 107
    iget v12, v6, La/y850;->e:I

    .line 108
    .line 109
    add-int/2addr v12, v11

    .line 110
    iget v13, v7, La/y850;->e:I

    .line 111
    .line 112
    add-int/2addr v12, v13

    .line 113
    new-array v12, v12, [B

    .line 114
    .line 115
    iget-object v13, v5, La/y850;->d:[B

    .line 116
    .line 117
    invoke-static {v13, v8, v12, v8, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 118
    .line 119
    .line 120
    iget-object v11, v6, La/y850;->d:[B

    .line 121
    .line 122
    iget v13, v5, La/y850;->e:I

    .line 123
    .line 124
    iget v14, v6, La/y850;->e:I

    .line 125
    .line 126
    invoke-static {v11, v8, v12, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 127
    .line 128
    .line 129
    iget-object v11, v7, La/y850;->d:[B

    .line 130
    .line 131
    iget v5, v5, La/y850;->e:I

    .line 132
    .line 133
    iget v13, v6, La/y850;->e:I

    .line 134
    .line 135
    add-int/2addr v5, v13

    .line 136
    iget v7, v7, La/y850;->e:I

    .line 137
    .line 138
    invoke-static {v11, v8, v12, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    .line 140
    .line 141
    iget-object v5, v6, La/y850;->d:[B

    .line 142
    .line 143
    iget v6, v6, La/y850;->e:I

    .line 144
    .line 145
    const/4 v7, 0x3

    .line 146
    const/4 v11, 0x0

    .line 147
    invoke-static {v5, v7, v6, v11}, La/ntr;->n0([BIILa/dgu;)La/c950;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    iget-object v6, v5, La/c950;->b:La/a950;

    .line 152
    .line 153
    if-eqz v6, :cond_4

    .line 154
    .line 155
    iget v13, v6, La/a950;->a:I

    .line 156
    .line 157
    iget-boolean v14, v6, La/a950;->b:Z

    .line 158
    .line 159
    iget v15, v6, La/a950;->c:I

    .line 160
    .line 161
    iget v7, v6, La/a950;->d:I

    .line 162
    .line 163
    iget-object v11, v6, La/a950;->e:[I

    .line 164
    .line 165
    iget v6, v6, La/a950;->f:I

    .line 166
    .line 167
    move/from16 v18, v6

    .line 168
    .line 169
    move/from16 v16, v7

    .line 170
    .line 171
    move-object/from16 v17, v11

    .line 172
    .line 173
    invoke-static/range {v13 .. v18}, La/jyc;->a(IZII[II)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    :cond_4
    new-instance v6, La/awq;

    .line 178
    .line 179
    invoke-direct {v6}, La/awq;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object v10, v6, La/awq;->a:Ljava/lang/String;

    .line 183
    .line 184
    const-string v7, "video/mp2t"

    .line 185
    .line 186
    invoke-static {v7}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    iput-object v7, v6, La/awq;->n:Ljava/lang/String;

    .line 191
    .line 192
    const-string v7, "video/hevc"

    .line 193
    .line 194
    invoke-static {v7}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    iput-object v7, v6, La/awq;->o:Ljava/lang/String;

    .line 199
    .line 200
    iput-object v11, v6, La/awq;->k:Ljava/lang/String;

    .line 201
    .line 202
    iget v7, v5, La/c950;->e:I

    .line 203
    .line 204
    iput v7, v6, La/awq;->v:I

    .line 205
    .line 206
    iget v7, v5, La/c950;->f:I

    .line 207
    .line 208
    iput v7, v6, La/awq;->w:I

    .line 209
    .line 210
    iget v7, v5, La/c950;->g:I

    .line 211
    .line 212
    iput v7, v6, La/awq;->y:I

    .line 213
    .line 214
    iget v7, v5, La/c950;->h:I

    .line 215
    .line 216
    iput v7, v6, La/awq;->z:I

    .line 217
    .line 218
    iget v14, v5, La/c950;->k:I

    .line 219
    .line 220
    iget v15, v5, La/c950;->l:I

    .line 221
    .line 222
    iget v7, v5, La/c950;->m:I

    .line 223
    .line 224
    iget v10, v5, La/c950;->c:I

    .line 225
    .line 226
    add-int/lit8 v18, v10, 0x8

    .line 227
    .line 228
    iget v10, v5, La/c950;->d:I

    .line 229
    .line 230
    add-int/lit8 v19, v10, 0x8

    .line 231
    .line 232
    new-instance v13, La/c4d;

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    move/from16 v16, v7

    .line 237
    .line 238
    invoke-direct/range {v13 .. v19}, La/c4d;-><init>(III[BII)V

    .line 239
    .line 240
    .line 241
    iput-object v13, v6, La/awq;->G:La/c4d;

    .line 242
    .line 243
    iget v7, v5, La/c950;->i:F

    .line 244
    .line 245
    iput v7, v6, La/awq;->D:F

    .line 246
    .line 247
    iget v7, v5, La/c950;->j:I

    .line 248
    .line 249
    iput v7, v6, La/awq;->q:I

    .line 250
    .line 251
    iget v5, v5, La/c950;->a:I

    .line 252
    .line 253
    add-int/2addr v5, v9

    .line 254
    iput v5, v6, La/awq;->H:I

    .line 255
    .line 256
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    iput-object v5, v6, La/awq;->r:Ljava/util/List;

    .line 261
    .line 262
    new-instance v5, Landroidx/media3/common/b;

    .line 263
    .line 264
    invoke-direct {v5, v6}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 265
    .line 266
    .line 267
    iget-object v6, v0, La/rjv;->c:La/ncs0;

    .line 268
    .line 269
    invoke-interface {v6, v5}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 270
    .line 271
    .line 272
    const/4 v6, -0x1

    .line 273
    iget v5, v5, Landroidx/media3/common/b;->r:I

    .line 274
    .line 275
    if-eq v5, v6, :cond_5

    .line 276
    .line 277
    move v8, v9

    .line 278
    :cond_5
    invoke-static {v8}, La/x0x;->K(Z)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v5}, La/fp;->O(I)V

    .line 282
    .line 283
    .line 284
    iput-boolean v9, v0, La/rjv;->e:Z

    .line 285
    .line 286
    :cond_6
    iget-object v5, v0, La/rjv;->j:La/y850;

    .line 287
    .line 288
    invoke-virtual {v5, v1}, La/y850;->b(I)Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    const/4 v7, 0x5

    .line 293
    iget-object v8, v0, La/rjv;->n:La/fq80;

    .line 294
    .line 295
    if-eqz v6, :cond_7

    .line 296
    .line 297
    iget-object v6, v5, La/y850;->d:[B

    .line 298
    .line 299
    iget v9, v5, La/y850;->e:I

    .line 300
    .line 301
    invoke-static {v6, v9}, La/ntr;->w0([BI)I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    iget-object v5, v5, La/y850;->d:[B

    .line 306
    .line 307
    invoke-virtual {v8, v5, v6}, La/fq80;->K([BI)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v8, v7}, La/fq80;->N(I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4, v2, v3, v8}, La/fp;->a(JLa/fq80;)V

    .line 314
    .line 315
    .line 316
    :cond_7
    iget-object v0, v0, La/rjv;->k:La/y850;

    .line 317
    .line 318
    invoke-virtual {v0, v1}, La/y850;->b(I)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_8

    .line 323
    .line 324
    iget-object v1, v0, La/y850;->d:[B

    .line 325
    .line 326
    iget v5, v0, La/y850;->e:I

    .line 327
    .line 328
    invoke-static {v1, v5}, La/ntr;->w0([BI)I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    iget-object v0, v0, La/y850;->d:[B

    .line 333
    .line 334
    invoke-virtual {v8, v0, v1}, La/fq80;->K([BI)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v8, v7}, La/fq80;->N(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, v2, v3, v8}, La/fp;->a(JLa/fq80;)V

    .line 341
    .line 342
    .line 343
    :cond_8
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, La/rjv;->l:J

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iput-wide v0, p0, La/rjv;->m:J

    .line 11
    .line 12
    iget-object v0, p0, La/rjv;->f:[Z

    .line 13
    .line 14
    invoke-static {v0}, La/ntr;->Y([Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/rjv;->g:La/y850;

    .line 18
    .line 19
    invoke-virtual {v0}, La/y850;->c()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La/rjv;->h:La/y850;

    .line 23
    .line 24
    invoke-virtual {v0}, La/y850;->c()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, La/rjv;->i:La/y850;

    .line 28
    .line 29
    invoke-virtual {v0}, La/y850;->c()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/rjv;->j:La/y850;

    .line 33
    .line 34
    invoke-virtual {v0}, La/y850;->c()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/rjv;->k:La/y850;

    .line 38
    .line 39
    invoke-virtual {v0}, La/y850;->c()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, La/rjv;->a:La/y3v;

    .line 43
    .line 44
    iget-object v0, v0, La/y3v;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/fp;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, La/fp;->v(I)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/rjv;->d:La/qjv;

    .line 53
    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    iput-boolean v1, p0, La/qjv;->f:Z

    .line 57
    .line 58
    iput-boolean v1, p0, La/qjv;->g:Z

    .line 59
    .line 60
    iput-boolean v1, p0, La/qjv;->h:Z

    .line 61
    .line 62
    iput-boolean v1, p0, La/qjv;->i:Z

    .line 63
    .line 64
    iput-boolean v1, p0, La/qjv;->j:Z

    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v1, p0, La/rjv;->c:La/ncs0;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, La/rjv;->a:La/y3v;

    .line 9
    .line 10
    iget-object v1, v1, La/y3v;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/fp;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2}, La/fp;->v(I)V

    .line 16
    .line 17
    .line 18
    iget-wide v3, p0, La/rjv;->l:J

    .line 19
    .line 20
    iget-wide v5, p0, La/rjv;->m:J

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    move-object v0, p0

    .line 24
    invoke-virtual/range {v0 .. v6}, La/rjv;->b(IIJJ)V

    .line 25
    .line 26
    .line 27
    iget-wide v3, p0, La/rjv;->l:J

    .line 28
    .line 29
    const/16 v2, 0x30

    .line 30
    .line 31
    iget-wide v5, p0, La/rjv;->m:J

    .line 32
    .line 33
    invoke-virtual/range {v0 .. v6}, La/rjv;->i(IIJJ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final e(La/huo;La/zrs0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, La/zrs0;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, La/zrs0;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, La/zrs0;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, La/rjv;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, La/zrs0;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, La/zrs0;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, La/huo;->q(II)La/ncs0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/rjv;->c:La/ncs0;

    .line 22
    .line 23
    new-instance v1, La/qjv;

    .line 24
    .line 25
    invoke-direct {v1, v0}, La/qjv;-><init>(La/ncs0;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, La/rjv;->d:La/qjv;

    .line 29
    .line 30
    iget-object p0, p0, La/rjv;->a:La/y3v;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, La/y3v;->b(La/huo;La/zrs0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final g(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, La/rjv;->m:J

    .line 2
    .line 3
    return-void
.end method

.method public final h([BII)V
    .locals 3

    .line 1
    iget-object v0, p0, La/rjv;->d:La/qjv;

    .line 2
    .line 3
    iget-boolean v1, v0, La/qjv;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    add-int/lit8 v1, p2, 0x2

    .line 8
    .line 9
    iget v2, v0, La/qjv;->d:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    if-ge v1, p3, :cond_1

    .line 13
    .line 14
    aget-byte v1, p1, v1

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0x80

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    iput-boolean v1, v0, La/qjv;->g:Z

    .line 25
    .line 26
    iput-boolean v2, v0, La/qjv;->f:Z

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sub-int v1, p3, p2

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, v0, La/qjv;->d:I

    .line 33
    .line 34
    :cond_2
    :goto_1
    iget-boolean v0, p0, La/rjv;->e:Z

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, La/rjv;->g:La/y850;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, p3}, La/y850;->a([BII)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, La/rjv;->h:La/y850;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2, p3}, La/y850;->a([BII)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/rjv;->i:La/y850;

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2, p3}, La/y850;->a([BII)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v0, p0, La/rjv;->j:La/y850;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, La/y850;->a([BII)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/rjv;->k:La/y850;

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2, p3}, La/y850;->a([BII)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final i(IIJJ)V
    .locals 3

    .line 1
    iget-object v0, p0, La/rjv;->d:La/qjv;

    .line 2
    .line 3
    iget-boolean v1, p0, La/rjv;->e:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-boolean v2, v0, La/qjv;->g:Z

    .line 7
    .line 8
    iput-boolean v2, v0, La/qjv;->h:Z

    .line 9
    .line 10
    iput-wide p5, v0, La/qjv;->e:J

    .line 11
    .line 12
    iput v2, v0, La/qjv;->d:I

    .line 13
    .line 14
    iput-wide p3, v0, La/qjv;->b:J

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    const/16 p4, 0x20

    .line 18
    .line 19
    if-lt p2, p4, :cond_5

    .line 20
    .line 21
    const/16 p5, 0x28

    .line 22
    .line 23
    if-ne p2, p5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-boolean p5, v0, La/qjv;->i:Z

    .line 27
    .line 28
    if-eqz p5, :cond_2

    .line 29
    .line 30
    iget-boolean p5, v0, La/qjv;->j:Z

    .line 31
    .line 32
    if-nez p5, :cond_2

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, p1}, La/qjv;->a(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-boolean v2, v0, La/qjv;->i:Z

    .line 40
    .line 41
    :cond_2
    if-gt p4, p2, :cond_3

    .line 42
    .line 43
    const/16 p1, 0x23

    .line 44
    .line 45
    if-le p2, p1, :cond_4

    .line 46
    .line 47
    :cond_3
    const/16 p1, 0x27

    .line 48
    .line 49
    if-ne p2, p1, :cond_5

    .line 50
    .line 51
    :cond_4
    iget-boolean p1, v0, La/qjv;->j:Z

    .line 52
    .line 53
    xor-int/2addr p1, p3

    .line 54
    iput-boolean p1, v0, La/qjv;->h:Z

    .line 55
    .line 56
    iput-boolean p3, v0, La/qjv;->j:Z

    .line 57
    .line 58
    :cond_5
    :goto_0
    const/16 p1, 0x10

    .line 59
    .line 60
    if-lt p2, p1, :cond_6

    .line 61
    .line 62
    const/16 p1, 0x15

    .line 63
    .line 64
    if-gt p2, p1, :cond_6

    .line 65
    .line 66
    move p1, p3

    .line 67
    goto :goto_1

    .line 68
    :cond_6
    move p1, v2

    .line 69
    :goto_1
    iput-boolean p1, v0, La/qjv;->c:Z

    .line 70
    .line 71
    if-nez p1, :cond_7

    .line 72
    .line 73
    const/16 p1, 0x9

    .line 74
    .line 75
    if-gt p2, p1, :cond_8

    .line 76
    .line 77
    :cond_7
    move v2, p3

    .line 78
    :cond_8
    iput-boolean v2, v0, La/qjv;->f:Z

    .line 79
    .line 80
    iget-boolean p1, p0, La/rjv;->e:Z

    .line 81
    .line 82
    if-nez p1, :cond_9

    .line 83
    .line 84
    iget-object p1, p0, La/rjv;->g:La/y850;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, La/y850;->d(I)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, La/rjv;->h:La/y850;

    .line 90
    .line 91
    invoke-virtual {p1, p2}, La/y850;->d(I)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, La/rjv;->i:La/y850;

    .line 95
    .line 96
    invoke-virtual {p1, p2}, La/y850;->d(I)V

    .line 97
    .line 98
    .line 99
    :cond_9
    iget-object p1, p0, La/rjv;->j:La/y850;

    .line 100
    .line 101
    invoke-virtual {p1, p2}, La/y850;->d(I)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, La/rjv;->k:La/y850;

    .line 105
    .line 106
    invoke-virtual {p0, p2}, La/y850;->d(I)V

    .line 107
    .line 108
    .line 109
    return-void
.end method
