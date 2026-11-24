.class public final La/y9q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/y9q0;


# instance fields
.field public final a:La/smk0;

.field public final b:La/eo80;

.field public final c:La/rw90;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, La/y9q0;

    .line 2
    .line 3
    const-wide/16 v12, 0x0

    .line 4
    .line 5
    const v14, 0xffffff

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    invoke-direct/range {v0 .. v14}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/y9q0;->d:La/y9q0;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V
    .locals 26

    .line 1
    move/from16 v0, p14

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-wide v1, La/y3d;->g:J

    .line 8
    .line 9
    move-wide v4, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide/from16 v4, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-wide v1, La/daq0;->c:J

    .line 18
    .line 19
    move-wide v6, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide/from16 v6, p3

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    move-object v8, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v8, p5

    .line 31
    .line 32
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    move-object v11, v2

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move-object/from16 v11, p6

    .line 39
    .line 40
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    move-object v12, v2

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    const-string v1, "kern off"

    .line 47
    .line 48
    move-object v12, v1

    .line 49
    :goto_4
    and-int/lit16 v1, v0, 0x80

    .line 50
    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    sget-wide v9, La/daq0;->c:J

    .line 54
    .line 55
    move-wide v13, v9

    .line 56
    goto :goto_5

    .line 57
    :cond_5
    move-wide/from16 v13, p7

    .line 58
    .line 59
    :goto_5
    sget-wide v18, La/y3d;->g:J

    .line 60
    .line 61
    and-int/lit16 v1, v0, 0x2000

    .line 62
    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    move-object/from16 v21, v2

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    move-object/from16 v21, p9

    .line 69
    .line 70
    :goto_6
    const v1, 0x8000

    .line 71
    .line 72
    .line 73
    and-int/2addr v1, v0

    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v1, :cond_7

    .line 76
    .line 77
    move v1, v3

    .line 78
    goto :goto_7

    .line 79
    :cond_7
    move/from16 v1, p10

    .line 80
    .line 81
    :goto_7
    const/high16 v9, 0x10000

    .line 82
    .line 83
    and-int/2addr v9, v0

    .line 84
    if-eqz v9, :cond_8

    .line 85
    .line 86
    move/from16 v23, v3

    .line 87
    .line 88
    goto :goto_8

    .line 89
    :cond_8
    move/from16 v23, p11

    .line 90
    .line 91
    :goto_8
    const/high16 v3, 0x20000

    .line 92
    .line 93
    and-int/2addr v0, v3

    .line 94
    if-eqz v0, :cond_9

    .line 95
    .line 96
    sget-wide v9, La/daq0;->c:J

    .line 97
    .line 98
    move-wide/from16 v24, v9

    .line 99
    .line 100
    goto :goto_9

    .line 101
    :cond_9
    move-wide/from16 v24, p12

    .line 102
    .line 103
    :goto_9
    new-instance v3, La/smk0;

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v20, 0x0

    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    invoke-direct/range {v3 .. v22}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, La/eo80;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    const/4 v5, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    const/4 v7, 0x0

    .line 125
    const/4 v8, 0x0

    .line 126
    move-object/from16 p1, v0

    .line 127
    .line 128
    move/from16 p2, v1

    .line 129
    .line 130
    move-object/from16 p7, v2

    .line 131
    .line 132
    move-object/from16 p6, v4

    .line 133
    .line 134
    move-object/from16 p8, v5

    .line 135
    .line 136
    move/from16 p9, v6

    .line 137
    .line 138
    move/from16 p10, v7

    .line 139
    .line 140
    move-object/from16 p11, v8

    .line 141
    .line 142
    move/from16 p3, v23

    .line 143
    .line 144
    move-wide/from16 p4, v24

    .line 145
    .line 146
    invoke-direct/range {p1 .. p11}, La/eo80;-><init>(IIJLa/g8q0;La/ew90;La/m600;IILa/i9q0;)V

    .line 147
    .line 148
    .line 149
    const/4 v1, 0x0

    .line 150
    move-object/from16 v2, p0

    .line 151
    .line 152
    invoke-direct {v2, v3, v0, v1}, La/y9q0;-><init>(La/smk0;La/eo80;La/rw90;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public constructor <init>(La/smk0;La/eo80;)V
    .locals 2

    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    iget-object v0, p2, La/eo80;->e:La/ew90;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 158
    :cond_0
    new-instance v1, La/rw90;

    invoke-direct {v1, v0}, La/rw90;-><init>(La/ew90;)V

    move-object v0, v1

    .line 159
    :goto_0
    invoke-direct {p0, p1, p2, v0}, La/y9q0;-><init>(La/smk0;La/eo80;La/rw90;)V

    return-void
.end method

.method public constructor <init>(La/smk0;La/eo80;La/rw90;)V
    .locals 0

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p1, p0, La/y9q0;->a:La/smk0;

    .line 162
    iput-object p2, p0, La/y9q0;->b:La/eo80;

    .line 163
    iput-object p3, p0, La/y9q0;->c:La/rw90;

    return-void
.end method

.method public static a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p18

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/y9q0;->a:La/smk0;

    .line 10
    .line 11
    iget-object v2, v2, La/smk0;->a:La/e8q0;

    .line 12
    .line 13
    invoke-interface {v2}, La/e8q0;->h()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-wide/from16 v2, p1

    .line 19
    .line 20
    :goto_0
    and-int/lit8 v4, v1, 0x2

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-object v4, v0, La/y9q0;->a:La/smk0;

    .line 25
    .line 26
    iget-wide v4, v4, La/smk0;->b:J

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-wide/from16 v4, p3

    .line 30
    .line 31
    :goto_1
    and-int/lit8 v6, v1, 0x4

    .line 32
    .line 33
    if-eqz v6, :cond_2

    .line 34
    .line 35
    iget-object v6, v0, La/y9q0;->a:La/smk0;

    .line 36
    .line 37
    iget-object v6, v6, La/smk0;->c:La/psq;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object/from16 v6, p5

    .line 41
    .line 42
    :goto_2
    and-int/lit8 v7, v1, 0x8

    .line 43
    .line 44
    if-eqz v7, :cond_3

    .line 45
    .line 46
    iget-object v7, v0, La/y9q0;->a:La/smk0;

    .line 47
    .line 48
    iget-object v7, v7, La/smk0;->d:La/lsq;

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object/from16 v7, p6

    .line 52
    .line 53
    :goto_3
    iget-object v8, v0, La/y9q0;->a:La/smk0;

    .line 54
    .line 55
    iget-object v9, v8, La/smk0;->e:La/msq;

    .line 56
    .line 57
    and-int/lit8 v10, v1, 0x20

    .line 58
    .line 59
    if-eqz v10, :cond_4

    .line 60
    .line 61
    iget-object v10, v8, La/smk0;->f:La/nrq;

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_4
    move-object/from16 v10, p7

    .line 65
    .line 66
    :goto_4
    iget-object v11, v8, La/smk0;->g:Ljava/lang/String;

    .line 67
    .line 68
    and-int/lit16 v12, v1, 0x80

    .line 69
    .line 70
    if-eqz v12, :cond_5

    .line 71
    .line 72
    iget-wide v12, v8, La/smk0;->h:J

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move-wide/from16 v12, p8

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v14, v1, 0x100

    .line 78
    .line 79
    if-eqz v14, :cond_6

    .line 80
    .line 81
    iget-object v14, v8, La/smk0;->i:La/j56;

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    move-object/from16 v14, p10

    .line 85
    .line 86
    :goto_6
    iget-object v15, v8, La/smk0;->j:La/f8q0;

    .line 87
    .line 88
    move-wide/from16 p2, v4

    .line 89
    .line 90
    iget-object v4, v8, La/smk0;->k:La/rs00;

    .line 91
    .line 92
    move-object/from16 p1, v4

    .line 93
    .line 94
    iget-wide v4, v8, La/smk0;->l:J

    .line 95
    .line 96
    move-wide/from16 p4, v4

    .line 97
    .line 98
    and-int/lit16 v4, v1, 0x1000

    .line 99
    .line 100
    if-eqz v4, :cond_7

    .line 101
    .line 102
    iget-object v4, v8, La/smk0;->m:La/k5q0;

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_7
    move-object/from16 v4, p11

    .line 106
    .line 107
    :goto_7
    iget-object v5, v8, La/smk0;->n:La/ljj0;

    .line 108
    .line 109
    iget-object v1, v8, La/smk0;->o:La/agc;

    .line 110
    .line 111
    const v16, 0x8000

    .line 112
    .line 113
    .line 114
    and-int v16, p18, v16

    .line 115
    .line 116
    if-eqz v16, :cond_8

    .line 117
    .line 118
    move-object/from16 v16, v1

    .line 119
    .line 120
    iget-object v1, v0, La/y9q0;->b:La/eo80;

    .line 121
    .line 122
    iget v1, v1, La/eo80;->a:I

    .line 123
    .line 124
    goto :goto_8

    .line 125
    :cond_8
    move-object/from16 v16, v1

    .line 126
    .line 127
    move/from16 v1, p12

    .line 128
    .line 129
    :goto_8
    const/high16 v17, 0x10000

    .line 130
    .line 131
    and-int v17, p18, v17

    .line 132
    .line 133
    if-eqz v17, :cond_9

    .line 134
    .line 135
    move/from16 v17, v1

    .line 136
    .line 137
    iget-object v1, v0, La/y9q0;->b:La/eo80;

    .line 138
    .line 139
    iget v1, v1, La/eo80;->b:I

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_9
    move/from16 v17, v1

    .line 143
    .line 144
    move/from16 v1, p13

    .line 145
    .line 146
    :goto_9
    const/high16 v18, 0x20000

    .line 147
    .line 148
    and-int v18, p18, v18

    .line 149
    .line 150
    if-eqz v18, :cond_a

    .line 151
    .line 152
    move/from16 v18, v1

    .line 153
    .line 154
    iget-object v1, v0, La/y9q0;->b:La/eo80;

    .line 155
    .line 156
    move-object/from16 p6, v4

    .line 157
    .line 158
    move-object/from16 p7, v5

    .line 159
    .line 160
    iget-wide v4, v1, La/eo80;->c:J

    .line 161
    .line 162
    goto :goto_a

    .line 163
    :cond_a
    move/from16 v18, v1

    .line 164
    .line 165
    move-object/from16 p6, v4

    .line 166
    .line 167
    move-object/from16 p7, v5

    .line 168
    .line 169
    move-wide/from16 v4, p14

    .line 170
    .line 171
    :goto_a
    iget-object v1, v0, La/y9q0;->b:La/eo80;

    .line 172
    .line 173
    move-wide/from16 v19, v4

    .line 174
    .line 175
    iget-object v4, v1, La/eo80;->d:La/g8q0;

    .line 176
    .line 177
    const/high16 v5, 0x80000

    .line 178
    .line 179
    and-int v5, p18, v5

    .line 180
    .line 181
    if-eqz v5, :cond_b

    .line 182
    .line 183
    iget-object v0, v0, La/y9q0;->c:La/rw90;

    .line 184
    .line 185
    goto :goto_b

    .line 186
    :cond_b
    move-object/from16 v0, p16

    .line 187
    .line 188
    :goto_b
    const/high16 v5, 0x100000

    .line 189
    .line 190
    and-int v5, p18, v5

    .line 191
    .line 192
    if-eqz v5, :cond_c

    .line 193
    .line 194
    iget-object v5, v1, La/eo80;->f:La/m600;

    .line 195
    .line 196
    :goto_c
    move-object/from16 v21, v4

    .line 197
    .line 198
    goto :goto_d

    .line 199
    :cond_c
    move-object/from16 v5, p17

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :goto_d
    iget v4, v1, La/eo80;->g:I

    .line 203
    .line 204
    move/from16 v22, v4

    .line 205
    .line 206
    iget v4, v1, La/eo80;->h:I

    .line 207
    .line 208
    iget-object v1, v1, La/eo80;->i:La/i9q0;

    .line 209
    .line 210
    move-object/from16 v23, v1

    .line 211
    .line 212
    new-instance v1, La/y9q0;

    .line 213
    .line 214
    new-instance v24, La/smk0;

    .line 215
    .line 216
    move/from16 v25, v4

    .line 217
    .line 218
    iget-object v4, v8, La/smk0;->a:La/e8q0;

    .line 219
    .line 220
    move-object/from16 v26, v5

    .line 221
    .line 222
    invoke-interface {v4}, La/e8q0;->h()J

    .line 223
    .line 224
    .line 225
    move-result-wide v4

    .line 226
    sget v27, La/y3d;->h:I

    .line 227
    .line 228
    invoke-static {v2, v3, v4, v5}, La/h2t0;->a(JJ)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_d

    .line 233
    .line 234
    iget-object v2, v8, La/smk0;->a:La/e8q0;

    .line 235
    .line 236
    :goto_e
    move-object/from16 p13, p1

    .line 237
    .line 238
    move-wide/from16 p14, p4

    .line 239
    .line 240
    move-object/from16 p16, p6

    .line 241
    .line 242
    move-object/from16 p17, p7

    .line 243
    .line 244
    move-object/from16 p1, v2

    .line 245
    .line 246
    move-object/from16 p4, v6

    .line 247
    .line 248
    move-object/from16 p5, v7

    .line 249
    .line 250
    move-object/from16 p6, v9

    .line 251
    .line 252
    move-object/from16 p7, v10

    .line 253
    .line 254
    move-object/from16 p8, v11

    .line 255
    .line 256
    move-wide/from16 p9, v12

    .line 257
    .line 258
    move-object/from16 p11, v14

    .line 259
    .line 260
    move-object/from16 p12, v15

    .line 261
    .line 262
    move-object/from16 p18, v16

    .line 263
    .line 264
    move-object/from16 p0, v24

    .line 265
    .line 266
    goto :goto_f

    .line 267
    :cond_d
    const-wide/16 v4, 0x10

    .line 268
    .line 269
    cmp-long v4, v2, v4

    .line 270
    .line 271
    if-eqz v4, :cond_e

    .line 272
    .line 273
    new-instance v4, La/g5d;

    .line 274
    .line 275
    invoke-direct {v4, v2, v3}, La/g5d;-><init>(J)V

    .line 276
    .line 277
    .line 278
    move-object v2, v4

    .line 279
    goto :goto_e

    .line 280
    :cond_e
    sget-object v2, La/pek0;->d:La/pek0;

    .line 281
    .line 282
    goto :goto_e

    .line 283
    :goto_f
    invoke-direct/range {p0 .. p18}, La/smk0;-><init>(La/e8q0;JLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v2, p0

    .line 287
    .line 288
    new-instance v3, La/eo80;

    .line 289
    .line 290
    if-eqz v0, :cond_f

    .line 291
    .line 292
    iget-object v4, v0, La/rw90;->a:La/ew90;

    .line 293
    .line 294
    :goto_10
    move-object/from16 p6, v3

    .line 295
    .line 296
    move-object/from16 p12, v4

    .line 297
    .line 298
    move/from16 p7, v17

    .line 299
    .line 300
    move/from16 p8, v18

    .line 301
    .line 302
    move-wide/from16 p9, v19

    .line 303
    .line 304
    move-object/from16 p11, v21

    .line 305
    .line 306
    move/from16 p14, v22

    .line 307
    .line 308
    move-object/from16 p16, v23

    .line 309
    .line 310
    move/from16 p15, v25

    .line 311
    .line 312
    move-object/from16 p13, v26

    .line 313
    .line 314
    goto :goto_11

    .line 315
    :cond_f
    const/4 v4, 0x0

    .line 316
    goto :goto_10

    .line 317
    :goto_11
    invoke-direct/range {p6 .. p16}, La/eo80;-><init>(IIJLa/g8q0;La/ew90;La/m600;IILa/i9q0;)V

    .line 318
    .line 319
    .line 320
    move-object/from16 v3, p6

    .line 321
    .line 322
    invoke-direct {v1, v2, v3, v0}, La/y9q0;-><init>(La/smk0;La/eo80;La/rw90;)V

    .line 323
    .line 324
    .line 325
    return-object v1
.end method

.method public static e(La/y9q0;JJLa/psq;La/lsq;La/nrq;JIJI)La/y9q0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p13

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v2, La/y3d;->g:J

    .line 10
    .line 11
    move-wide v5, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v5, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    sget-wide v2, La/daq0;->c:J

    .line 20
    .line 21
    move-wide v9, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-wide/from16 v9, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    move-object v11, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v11, p5

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v2, v1, 0x8

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    move-object v12, v3

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move-object/from16 v12, p6

    .line 41
    .line 42
    :goto_3
    and-int/lit8 v2, v1, 0x20

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    move-object v14, v3

    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-object/from16 v14, p7

    .line 49
    .line 50
    :goto_4
    and-int/lit16 v2, v1, 0x80

    .line 51
    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    sget-wide v7, La/daq0;->c:J

    .line 55
    .line 56
    move-wide/from16 v16, v7

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move-wide/from16 v16, p8

    .line 60
    .line 61
    :goto_5
    sget-wide v21, La/y3d;->g:J

    .line 62
    .line 63
    const v2, 0x8000

    .line 64
    .line 65
    .line 66
    and-int/2addr v2, v1

    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    goto :goto_6

    .line 71
    :cond_6
    move/from16 v2, p10

    .line 72
    .line 73
    :goto_6
    const/high16 v4, 0x20000

    .line 74
    .line 75
    and-int/2addr v1, v4

    .line 76
    if-eqz v1, :cond_7

    .line 77
    .line 78
    sget-wide v7, La/daq0;->c:J

    .line 79
    .line 80
    move-wide/from16 v26, v7

    .line 81
    .line 82
    goto :goto_7

    .line 83
    :cond_7
    move-wide/from16 v26, p11

    .line 84
    .line 85
    :goto_7
    iget-object v4, v0, La/y9q0;->a:La/smk0;

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v23, 0x0

    .line 99
    .line 100
    const/16 v24, 0x0

    .line 101
    .line 102
    const/16 v25, 0x0

    .line 103
    .line 104
    invoke-static/range {v4 .. v25}, La/tmk0;->a(La/smk0;JLa/t89;FJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;)La/smk0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v4, v0, La/y9q0;->b:La/eo80;

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    move/from16 p2, v2

    .line 116
    .line 117
    move-object/from16 p7, v3

    .line 118
    .line 119
    move-object/from16 p1, v4

    .line 120
    .line 121
    move/from16 p3, v5

    .line 122
    .line 123
    move-object/from16 p6, v6

    .line 124
    .line 125
    move-object/from16 p8, v7

    .line 126
    .line 127
    move/from16 p9, v8

    .line 128
    .line 129
    move/from16 p10, v9

    .line 130
    .line 131
    move-object/from16 p11, v10

    .line 132
    .line 133
    move-wide/from16 p4, v26

    .line 134
    .line 135
    invoke-static/range {p1 .. p11}, La/fo80;->a(La/eo80;IIJLa/g8q0;La/ew90;La/m600;IILa/i9q0;)La/eo80;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    iget-object v3, v0, La/y9q0;->a:La/smk0;

    .line 140
    .line 141
    if-ne v3, v1, :cond_8

    .line 142
    .line 143
    iget-object v3, v0, La/y9q0;->b:La/eo80;

    .line 144
    .line 145
    if-ne v3, v2, :cond_8

    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_8
    new-instance v0, La/y9q0;

    .line 149
    .line 150
    invoke-direct {v0, v1, v2}, La/y9q0;-><init>(La/smk0;La/eo80;)V

    .line 151
    .line 152
    .line 153
    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-object p0, p0, La/y9q0;->a:La/smk0;

    .line 2
    .line 3
    iget-object p0, p0, La/smk0;->a:La/e8q0;

    .line 4
    .line 5
    invoke-interface {p0}, La/e8q0;->h()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final c(La/y9q0;)Z
    .locals 2

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, La/y9q0;->b:La/eo80;

    .line 4
    .line 5
    iget-object v1, p1, La/y9q0;->b:La/eo80;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/y9q0;->a:La/smk0;

    .line 14
    .line 15
    iget-object p1, p1, La/y9q0;->a:La/smk0;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/smk0;->b(La/smk0;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final d(La/y9q0;)La/y9q0;
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    sget-object v0, La/y9q0;->d:La/y9q0;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, La/y9q0;

    .line 13
    .line 14
    iget-object v1, p0, La/y9q0;->a:La/smk0;

    .line 15
    .line 16
    iget-object v2, p1, La/y9q0;->a:La/smk0;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, La/smk0;->d(La/smk0;)La/smk0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object p0, p0, La/y9q0;->b:La/eo80;

    .line 23
    .line 24
    iget-object p1, p1, La/y9q0;->b:La/eo80;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/eo80;->a(La/eo80;)La/eo80;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, v1, p0}, La/y9q0;-><init>(La/smk0;La/eo80;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    :goto_0
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/y9q0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/y9q0;

    .line 12
    .line 13
    iget-object v1, p1, La/y9q0;->a:La/smk0;

    .line 14
    .line 15
    iget-object v3, p0, La/y9q0;->a:La/smk0;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/y9q0;->b:La/eo80;

    .line 25
    .line 26
    iget-object v3, p1, La/y9q0;->b:La/eo80;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, La/y9q0;->c:La/rw90;

    .line 36
    .line 37
    iget-object p1, p1, La/y9q0;->c:La/rw90;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/y9q0;->a:La/smk0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/smk0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/y9q0;->b:La/eo80;

    .line 10
    .line 11
    invoke-virtual {v1}, La/eo80;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, La/y9q0;->c:La/rw90;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, La/rw90;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, p0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/y9q0;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, v0, La/y9q0;->a:La/smk0;

    .line 12
    .line 13
    iget-object v3, v2, La/smk0;->a:La/e8q0;

    .line 14
    .line 15
    invoke-interface {v3}, La/e8q0;->l()La/t89;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v2, La/smk0;->a:La/e8q0;

    .line 20
    .line 21
    invoke-interface {v4}, La/e8q0;->g()F

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget-wide v5, v2, La/smk0;->b:J

    .line 26
    .line 27
    invoke-static {v5, v6}, La/daq0;->f(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object v6, v2, La/smk0;->c:La/psq;

    .line 32
    .line 33
    iget-object v7, v2, La/smk0;->d:La/lsq;

    .line 34
    .line 35
    iget-object v8, v2, La/smk0;->e:La/msq;

    .line 36
    .line 37
    iget-object v9, v2, La/smk0;->f:La/nrq;

    .line 38
    .line 39
    iget-object v10, v2, La/smk0;->g:Ljava/lang/String;

    .line 40
    .line 41
    iget-wide v11, v2, La/smk0;->h:J

    .line 42
    .line 43
    invoke-static {v11, v12}, La/daq0;->f(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    iget-object v12, v2, La/smk0;->i:La/j56;

    .line 48
    .line 49
    iget-object v13, v2, La/smk0;->j:La/f8q0;

    .line 50
    .line 51
    iget-object v14, v2, La/smk0;->k:La/rs00;

    .line 52
    .line 53
    move-object/from16 v16, v14

    .line 54
    .line 55
    iget-wide v14, v2, La/smk0;->l:J

    .line 56
    .line 57
    invoke-static {v14, v15}, La/y3d;->i(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    iget-object v15, v2, La/smk0;->m:La/k5q0;

    .line 62
    .line 63
    move-object/from16 v17, v15

    .line 64
    .line 65
    iget-object v15, v2, La/smk0;->n:La/ljj0;

    .line 66
    .line 67
    iget-object v2, v2, La/smk0;->o:La/agc;

    .line 68
    .line 69
    move-object/from16 v18, v2

    .line 70
    .line 71
    iget-object v2, v0, La/y9q0;->b:La/eo80;

    .line 72
    .line 73
    iget v0, v2, La/eo80;->a:I

    .line 74
    .line 75
    invoke-static {v0}, La/f2q0;->a(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object/from16 v19, v0

    .line 80
    .line 81
    iget v0, v2, La/eo80;->b:I

    .line 82
    .line 83
    invoke-static {v0}, La/n5q0;->a(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object/from16 v20, v14

    .line 88
    .line 89
    move-object/from16 v21, v15

    .line 90
    .line 91
    iget-wide v14, v2, La/eo80;->c:J

    .line 92
    .line 93
    invoke-static {v14, v15}, La/daq0;->f(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    iget-object v15, v2, La/eo80;->d:La/g8q0;

    .line 98
    .line 99
    move-object/from16 v22, v15

    .line 100
    .line 101
    iget-object v15, v2, La/eo80;->f:La/m600;

    .line 102
    .line 103
    move-object/from16 v23, v15

    .line 104
    .line 105
    iget v15, v2, La/eo80;->g:I

    .line 106
    .line 107
    invoke-static {v15}, La/p500;->a(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v15

    .line 111
    move-object/from16 v24, v15

    .line 112
    .line 113
    iget v15, v2, La/eo80;->h:I

    .line 114
    .line 115
    invoke-static {v15}, La/fuw;->a(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v15

    .line 119
    iget-object v2, v2, La/eo80;->i:La/i9q0;

    .line 120
    .line 121
    move-object/from16 v25, v2

    .line 122
    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    move-object/from16 v26, v15

    .line 126
    .line 127
    const-string v15, "TextStyle(color="

    .line 128
    .line 129
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, ", brush="

    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", alpha="

    .line 144
    .line 145
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v1, ", fontSize="

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v1, ", fontWeight="

    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, ", fontStyle="

    .line 168
    .line 169
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v1, ", fontSynthesis="

    .line 176
    .line 177
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, ", fontFamily="

    .line 184
    .line 185
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v1, ", fontFeatureSettings="

    .line 192
    .line 193
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v1, ", letterSpacing="

    .line 197
    .line 198
    const-string v3, ", baselineShift="

    .line 199
    .line 200
    invoke-static {v2, v10, v1, v11, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v1, ", textGeometricTransform="

    .line 207
    .line 208
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v1, ", localeList="

    .line 215
    .line 216
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    move-object/from16 v1, v16

    .line 220
    .line 221
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v1, ", background="

    .line 225
    .line 226
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    move-object/from16 v1, v20

    .line 230
    .line 231
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v1, ", textDecoration="

    .line 235
    .line 236
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    move-object/from16 v1, v17

    .line 240
    .line 241
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v1, ", shadow="

    .line 245
    .line 246
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    move-object/from16 v1, v21

    .line 250
    .line 251
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v1, ", drawStyle="

    .line 255
    .line 256
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    move-object/from16 v1, v18

    .line 260
    .line 261
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v1, ", textAlign="

    .line 265
    .line 266
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    move-object/from16 v1, v19

    .line 270
    .line 271
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v1, ", textDirection="

    .line 275
    .line 276
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v1, ", lineHeight="

    .line 280
    .line 281
    const-string v3, ", textIndent="

    .line 282
    .line 283
    invoke-static {v2, v0, v1, v14, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v0, v22

    .line 287
    .line 288
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v0, ", platformStyle="

    .line 292
    .line 293
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    move-object/from16 v0, p0

    .line 297
    .line 298
    iget-object v0, v0, La/y9q0;->c:La/rw90;

    .line 299
    .line 300
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string v0, ", lineHeightStyle="

    .line 304
    .line 305
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    move-object/from16 v0, v23

    .line 309
    .line 310
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v0, ", lineBreak="

    .line 314
    .line 315
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    move-object/from16 v0, v24

    .line 319
    .line 320
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v0, ", hyphens="

    .line 324
    .line 325
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    move-object/from16 v0, v26

    .line 329
    .line 330
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v0, ", textMotion="

    .line 334
    .line 335
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    move-object/from16 v0, v25

    .line 339
    .line 340
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v0, ")"

    .line 344
    .line 345
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0
.end method
