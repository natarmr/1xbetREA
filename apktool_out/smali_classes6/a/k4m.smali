.class public abstract La/k4m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/16 v0, 0x4b

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    move-object v4, v2

    .line 19
    move-object v5, v2

    .line 20
    move-object v6, v2

    .line 21
    move-object v7, v3

    .line 22
    move-object v8, v2

    .line 23
    move-object v9, v1

    .line 24
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, La/k4m;->a:Ljava/util/List;

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    filled-new-array {v2, v0, v1, v3}, [Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, La/k4m;->b:Ljava/util/List;

    .line 59
    .line 60
    sget-object v0, La/qmk;->a:La/zcl;

    .line 61
    .line 62
    const/high16 v0, 0x42100000    # 36.0f

    .line 63
    .line 64
    sput v0, La/k4m;->c:F

    .line 65
    .line 66
    const/high16 v0, 0x42000000    # 32.0f

    .line 67
    .line 68
    sput v0, La/k4m;->d:F

    .line 69
    .line 70
    return-void
.end method

.method public static final a(La/w6k;La/g9q0;Ljava/lang/String;)La/a9q0;
    .locals 65

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-wide v4, La/qmk;->p:J

    .line 4
    .line 5
    sget-wide v16, La/qmk;->o:J

    .line 6
    .line 7
    sget-wide v18, La/qmk;->n:J

    .line 8
    .line 9
    sget v1, La/k4m;->c:F

    .line 10
    .line 11
    invoke-interface {v0, v1}, La/w6k;->w0(F)F

    .line 12
    .line 13
    .line 14
    move-result v20

    .line 15
    invoke-static {v4, v5}, La/daq0;->c(J)F

    .line 16
    .line 17
    .line 18
    move-result v21

    .line 19
    sget-object v7, La/j1t0;->c:La/qrq;

    .line 20
    .line 21
    sget-wide v13, La/qmk;->C:J

    .line 22
    .line 23
    new-instance v24, La/y9q0;

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    const v15, 0xfdffdd

    .line 27
    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const-wide/16 v8, 0x0

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    move/from16 v31, v1

    .line 37
    .line 38
    move-object/from16 v1, v24

    .line 39
    .line 40
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 41
    .line 42
    .line 43
    const/16 v29, 0x0

    .line 44
    .line 45
    const/16 v30, 0x3ec

    .line 46
    .line 47
    const/16 v25, 0x0

    .line 48
    .line 49
    const/16 v26, 0x1

    .line 50
    .line 51
    const-wide/16 v27, 0x0

    .line 52
    .line 53
    move-object/from16 v22, p1

    .line 54
    .line 55
    move-object/from16 v23, p2

    .line 56
    .line 57
    invoke-static/range {v22 .. v30}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move/from16 v2, v21

    .line 62
    .line 63
    :goto_0
    iget-wide v3, v1, La/a9q0;->c:J

    .line 64
    .line 65
    const/16 v5, 0x20

    .line 66
    .line 67
    shr-long/2addr v3, v5

    .line 68
    long-to-int v3, v3

    .line 69
    int-to-float v3, v3

    .line 70
    cmpl-float v4, v3, v20

    .line 71
    .line 72
    const-wide v5, 0x100000000L

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    if-lez v4, :cond_0

    .line 78
    .line 79
    invoke-static/range {v16 .. v17}, La/daq0;->c(J)F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    cmpl-float v4, v2, v4

    .line 84
    .line 85
    if-lez v4, :cond_0

    .line 86
    .line 87
    invoke-static/range {v18 .. v19}, La/daq0;->c(J)F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    sub-float v1, v2, v1

    .line 92
    .line 93
    sget-object v38, La/j1t0;->c:La/qrq;

    .line 94
    .line 95
    sget-wide v35, La/qmk;->p:J

    .line 96
    .line 97
    sget-wide v44, La/qmk;->C:J

    .line 98
    .line 99
    new-instance v46, La/y9q0;

    .line 100
    .line 101
    const/16 v43, 0x0

    .line 102
    .line 103
    move-object/from16 v32, v46

    .line 104
    .line 105
    const v46, 0xfdffdd

    .line 106
    .line 107
    .line 108
    const-wide/16 v33, 0x0

    .line 109
    .line 110
    const/16 v37, 0x0

    .line 111
    .line 112
    const-wide/16 v39, 0x0

    .line 113
    .line 114
    const/16 v41, 0x0

    .line 115
    .line 116
    const/16 v42, 0x0

    .line 117
    .line 118
    invoke-direct/range {v32 .. v46}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v5, v6}, La/idm0;->v(FJ)J

    .line 122
    .line 123
    .line 124
    move-result-wide v49

    .line 125
    const/16 v63, 0x0

    .line 126
    .line 127
    const v64, 0xfffffd

    .line 128
    .line 129
    .line 130
    const-wide/16 v47, 0x0

    .line 131
    .line 132
    const/16 v51, 0x0

    .line 133
    .line 134
    const/16 v52, 0x0

    .line 135
    .line 136
    const/16 v53, 0x0

    .line 137
    .line 138
    const-wide/16 v54, 0x0

    .line 139
    .line 140
    const/16 v56, 0x0

    .line 141
    .line 142
    const/16 v57, 0x0

    .line 143
    .line 144
    const/16 v58, 0x0

    .line 145
    .line 146
    const/16 v59, 0x0

    .line 147
    .line 148
    const-wide/16 v60, 0x0

    .line 149
    .line 150
    const/16 v62, 0x0

    .line 151
    .line 152
    move-object/from16 v46, v32

    .line 153
    .line 154
    invoke-static/range {v46 .. v64}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    const/4 v9, 0x0

    .line 159
    const/16 v10, 0x3ec

    .line 160
    .line 161
    const/4 v5, 0x0

    .line 162
    const/4 v6, 0x1

    .line 163
    const-wide/16 v7, 0x0

    .line 164
    .line 165
    move-object/from16 v2, p1

    .line 166
    .line 167
    move-object/from16 v3, p2

    .line 168
    .line 169
    invoke-static/range {v2 .. v10}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    move v2, v1

    .line 174
    move-object v1, v4

    .line 175
    goto :goto_0

    .line 176
    :cond_0
    cmpg-float v3, v3, v20

    .line 177
    .line 178
    if-gtz v3, :cond_1

    .line 179
    .line 180
    return-object v1

    .line 181
    :cond_1
    sget-object v13, La/j1t0;->c:La/qrq;

    .line 182
    .line 183
    sget-wide v10, La/qmk;->p:J

    .line 184
    .line 185
    sget-wide v19, La/qmk;->C:J

    .line 186
    .line 187
    new-instance v32, La/y9q0;

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const v21, 0xfdffdd

    .line 192
    .line 193
    .line 194
    const-wide/16 v8, 0x0

    .line 195
    .line 196
    const/4 v12, 0x0

    .line 197
    const-wide/16 v14, 0x0

    .line 198
    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    move-object/from16 v7, v32

    .line 204
    .line 205
    invoke-direct/range {v7 .. v21}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 206
    .line 207
    .line 208
    invoke-static {v2, v5, v6}, La/idm0;->v(FJ)J

    .line 209
    .line 210
    .line 211
    move-result-wide v35

    .line 212
    const/16 v49, 0x0

    .line 213
    .line 214
    const v50, 0xfffffd

    .line 215
    .line 216
    .line 217
    const-wide/16 v33, 0x0

    .line 218
    .line 219
    const/16 v37, 0x0

    .line 220
    .line 221
    const/16 v38, 0x0

    .line 222
    .line 223
    const/16 v39, 0x0

    .line 224
    .line 225
    const-wide/16 v40, 0x0

    .line 226
    .line 227
    const/16 v42, 0x0

    .line 228
    .line 229
    const/16 v43, 0x0

    .line 230
    .line 231
    const/16 v44, 0x0

    .line 232
    .line 233
    const/16 v45, 0x0

    .line 234
    .line 235
    const-wide/16 v46, 0x0

    .line 236
    .line 237
    const/16 v48, 0x0

    .line 238
    .line 239
    invoke-static/range {v32 .. v50}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    const/high16 v1, 0x41400000    # 12.0f

    .line 244
    .line 245
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    move/from16 v3, v31

    .line 250
    .line 251
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    const/4 v1, 0x0

    .line 260
    invoke-static {v1, v3, v2, v0}, La/lgb;->O(IIII)J

    .line 261
    .line 262
    .line 263
    move-result-wide v7

    .line 264
    const/4 v9, 0x0

    .line 265
    const/16 v10, 0x3c8

    .line 266
    .line 267
    const/4 v5, 0x2

    .line 268
    const/4 v6, 0x1

    .line 269
    move-object/from16 v2, p1

    .line 270
    .line 271
    move-object/from16 v3, p2

    .line 272
    .line 273
    invoke-static/range {v2 .. v10}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0
.end method

.method public static final b(La/w4m;)I
    .locals 4

    .line 1
    sget-object v0, La/u4m;->a:La/n0o0;

    .line 2
    .line 3
    iget-object p0, p0, La/w4m;->a:La/a4x;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_c

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/v4m;

    .line 20
    .line 21
    iget v0, v0, La/v4m;->b:I

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/v4m;

    .line 38
    .line 39
    iget v1, v1, La/v4m;->b:I

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ge v0, v1, :cond_0

    .line 46
    .line 47
    move v0, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/16 p0, 0x64

    .line 50
    .line 51
    const/16 v1, 0x3e8

    .line 52
    .line 53
    if-gt v0, v1, :cond_2

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const/16 v2, 0x2710

    .line 58
    .line 59
    if-gt v0, v2, :cond_3

    .line 60
    .line 61
    const/16 v1, 0xa

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    const v3, 0x186a0

    .line 65
    .line 66
    .line 67
    if-gt v0, v3, :cond_4

    .line 68
    .line 69
    move v1, p0

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    const v3, 0xf4240

    .line 72
    .line 73
    .line 74
    if-gt v0, v3, :cond_5

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    move v1, v2

    .line 78
    :goto_1
    mul-int/lit8 v2, v1, 0x64

    .line 79
    .line 80
    if-gt v0, v2, :cond_6

    .line 81
    .line 82
    const/16 p0, 0x19

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    mul-int/lit16 v2, v1, 0xc8

    .line 86
    .line 87
    if-gt v0, v2, :cond_7

    .line 88
    .line 89
    const/16 p0, 0x32

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_7
    mul-int/lit16 v2, v1, 0x190

    .line 93
    .line 94
    if-gt v0, v2, :cond_8

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_8
    mul-int/lit16 p0, v1, 0x258

    .line 98
    .line 99
    if-gt v0, p0, :cond_9

    .line 100
    .line 101
    const/16 p0, 0x96

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_9
    mul-int/lit16 p0, v1, 0x320

    .line 105
    .line 106
    if-gt v0, p0, :cond_a

    .line 107
    .line 108
    const/16 p0, 0xc8

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_a
    mul-int/lit16 p0, v1, 0x3e8

    .line 112
    .line 113
    if-gt v0, p0, :cond_b

    .line 114
    .line 115
    const/16 p0, 0xfa

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_b
    const/16 p0, 0x1f4

    .line 119
    .line 120
    :goto_2
    mul-int/2addr p0, v1

    .line 121
    return p0

    .line 122
    :cond_c
    invoke-static {}, La/itt0;->a()V

    .line 123
    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    return p0
.end method
