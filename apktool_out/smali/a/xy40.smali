.class public final La/xy40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[Ljava/lang/Object;

.field public c:[J

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u1h0;->a:[J

    .line 5
    .line 6
    iput-object v0, p0, La/xy40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    sget-object v0, La/dwi0;->n:[J

    .line 13
    .line 14
    iput-object v0, p0, La/xy40;->c:[J

    .line 15
    .line 16
    const v0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v0, p0, La/xy40;->d:I

    .line 20
    .line 21
    iput v0, p0, La/xy40;->e:I

    .line 22
    .line 23
    if-ltz p1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, La/xy40;->f(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string p0, "Capacity must be a positive value."

    .line 39
    .line 40
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 11

    .line 1
    iget v0, p0, La/xy40;->g:I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xy40;->d(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    aput-object p1, v2, v1

    .line 10
    .line 11
    iget-object p1, p0, La/xy40;->c:[J

    .line 12
    .line 13
    iget v2, p0, La/xy40;->d:I

    .line 14
    .line 15
    int-to-long v3, v2

    .line 16
    const-wide/32 v5, 0x7fffffff

    .line 17
    .line 18
    .line 19
    and-long/2addr v3, v5

    .line 20
    const-wide v7, 0x3fffffff80000000L    # 1.9999995231628418

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    or-long/2addr v3, v7

    .line 26
    aput-wide v3, p1, v1

    .line 27
    .line 28
    const v3, 0x7fffffff

    .line 29
    .line 30
    .line 31
    if-eq v2, v3, :cond_0

    .line 32
    .line 33
    aget-wide v7, p1, v2

    .line 34
    .line 35
    const-wide v9, -0x3fffffff80000001L    # -2.000000953674316

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v7, v9

    .line 41
    int-to-long v9, v1

    .line 42
    and-long v4, v9, v5

    .line 43
    .line 44
    const/16 v6, 0x1f

    .line 45
    .line 46
    shl-long/2addr v4, v6

    .line 47
    or-long/2addr v4, v7

    .line 48
    aput-wide v4, p1, v2

    .line 49
    .line 50
    :cond_0
    iput v1, p0, La/xy40;->d:I

    .line 51
    .line 52
    iget p1, p0, La/xy40;->e:I

    .line 53
    .line 54
    if-ne p1, v3, :cond_1

    .line 55
    .line 56
    iput v1, p0, La/xy40;->e:I

    .line 57
    .line 58
    :cond_1
    iget p0, p0, La/xy40;->g:I

    .line 59
    .line 60
    if-eq p0, v0, :cond_2

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_2
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public final b()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/xy40;->g:I

    .line 3
    .line 4
    iget-object v1, p0, La/xy40;->a:[J

    .line 5
    .line 6
    sget-object v2, La/u1h0;->a:[J

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2, v3}, La/qx3;->p([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/xy40;->a:[J

    .line 19
    .line 20
    iget v2, p0, La/xy40;->f:I

    .line 21
    .line 22
    shr-int/lit8 v3, v2, 0x3

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x7

    .line 25
    .line 26
    shl-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    aget-wide v4, v1, v3

    .line 29
    .line 30
    const-wide/16 v6, 0xff

    .line 31
    .line 32
    shl-long/2addr v6, v2

    .line 33
    not-long v8, v6

    .line 34
    and-long/2addr v4, v8

    .line 35
    or-long/2addr v4, v6

    .line 36
    aput-wide v4, v1, v3

    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget v3, p0, La/xy40;->f:I

    .line 42
    .line 43
    invoke-static {v0, v3, v2, v1}, La/qx3;->l(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, La/xy40;->c:[J

    .line 47
    .line 48
    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, v2}, La/qx3;->p([JJ)V

    .line 54
    .line 55
    .line 56
    const v0, 0x7fffffff

    .line 57
    .line 58
    .line 59
    iput v0, p0, La/xy40;->d:I

    .line 60
    .line 61
    iput v0, p0, La/xy40;->e:I

    .line 62
    .line 63
    iget v0, p0, La/xy40;->f:I

    .line 64
    .line 65
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget v1, p0, La/xy40;->g:I

    .line 70
    .line 71
    sub-int/2addr v0, v1

    .line 72
    iput v0, p0, La/xy40;->h:I

    .line 73
    .line 74
    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v4, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v4

    .line 24
    and-int/lit8 v4, v3, 0x7f

    .line 25
    .line 26
    iget v5, v0, La/xy40;->f:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v3, 0x7

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    move v6, v2

    .line 32
    :goto_1
    iget-object v7, v0, La/xy40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v8, v3, 0x3

    .line 35
    .line 36
    and-int/lit8 v9, v3, 0x7

    .line 37
    .line 38
    shl-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    aget-wide v10, v7, v8

    .line 41
    .line 42
    ushr-long/2addr v10, v9

    .line 43
    const/4 v12, 0x1

    .line 44
    add-int/2addr v8, v12

    .line 45
    aget-wide v13, v7, v8

    .line 46
    .line 47
    rsub-int/lit8 v7, v9, 0x40

    .line 48
    .line 49
    shl-long v7, v13, v7

    .line 50
    .line 51
    int-to-long v13, v9

    .line 52
    neg-long v13, v13

    .line 53
    const/16 v9, 0x3f

    .line 54
    .line 55
    shr-long/2addr v13, v9

    .line 56
    and-long/2addr v7, v13

    .line 57
    or-long/2addr v7, v10

    .line 58
    int-to-long v9, v4

    .line 59
    const-wide v13, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v9, v13

    .line 65
    xor-long/2addr v9, v7

    .line 66
    sub-long v13, v9, v13

    .line 67
    .line 68
    not-long v9, v9

    .line 69
    and-long/2addr v9, v13

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v9, v13

    .line 76
    :goto_2
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v11, v9, v15

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    shr-int/lit8 v11, v11, 0x3

    .line 87
    .line 88
    add-int/2addr v11, v3

    .line 89
    and-int/2addr v11, v5

    .line 90
    iget-object v15, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 91
    .line 92
    aget-object v15, v15, v11

    .line 93
    .line 94
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    sub-long v15, v9, v15

    .line 104
    .line 105
    and-long/2addr v9, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    not-long v9, v7

    .line 108
    const/4 v11, 0x6

    .line 109
    shl-long/2addr v9, v11

    .line 110
    and-long/2addr v7, v9

    .line 111
    and-long/2addr v7, v13

    .line 112
    cmp-long v7, v7, v15

    .line 113
    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    const/4 v11, -0x1

    .line 117
    :goto_3
    if-ltz v11, :cond_3

    .line 118
    .line 119
    return v12

    .line 120
    :cond_3
    return v2

    .line 121
    :cond_4
    add-int/lit8 v6, v6, 0x8

    .line 122
    .line 123
    add-int/2addr v3, v6

    .line 124
    and-int/2addr v3, v5

    .line 125
    goto :goto_1
.end method

.method public final d(Ljava/lang/Object;)I
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v5, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v5

    .line 24
    ushr-int/lit8 v5, v3, 0x7

    .line 25
    .line 26
    and-int/lit8 v3, v3, 0x7f

    .line 27
    .line 28
    iget v6, v0, La/xy40;->f:I

    .line 29
    .line 30
    and-int v7, v5, v6

    .line 31
    .line 32
    move v8, v2

    .line 33
    :goto_1
    iget-object v9, v0, La/xy40;->a:[J

    .line 34
    .line 35
    shr-int/lit8 v10, v7, 0x3

    .line 36
    .line 37
    and-int/lit8 v11, v7, 0x7

    .line 38
    .line 39
    shl-int/lit8 v11, v11, 0x3

    .line 40
    .line 41
    aget-wide v12, v9, v10

    .line 42
    .line 43
    ushr-long/2addr v12, v11

    .line 44
    const/4 v14, 0x1

    .line 45
    add-int/2addr v10, v14

    .line 46
    aget-wide v15, v9, v10

    .line 47
    .line 48
    rsub-int/lit8 v9, v11, 0x40

    .line 49
    .line 50
    shl-long v9, v15, v9

    .line 51
    .line 52
    move/from16 v16, v14

    .line 53
    .line 54
    int-to-long v14, v11

    .line 55
    neg-long v14, v14

    .line 56
    const/16 v11, 0x3f

    .line 57
    .line 58
    shr-long/2addr v14, v11

    .line 59
    and-long/2addr v9, v14

    .line 60
    or-long/2addr v9, v12

    .line 61
    int-to-long v11, v3

    .line 62
    const-wide v13, 0x101010101010101L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    mul-long v17, v11, v13

    .line 68
    .line 69
    move-wide/from16 v19, v13

    .line 70
    .line 71
    xor-long v13, v9, v17

    .line 72
    .line 73
    sub-long v17, v13, v19

    .line 74
    .line 75
    not-long v13, v13

    .line 76
    and-long v13, v17, v13

    .line 77
    .line 78
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long v13, v13, v17

    .line 84
    .line 85
    :goto_2
    const-wide/16 v19, 0x0

    .line 86
    .line 87
    cmp-long v15, v13, v19

    .line 88
    .line 89
    if-eqz v15, :cond_2

    .line 90
    .line 91
    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    shr-int/lit8 v15, v15, 0x3

    .line 96
    .line 97
    add-int/2addr v15, v7

    .line 98
    and-int/2addr v15, v6

    .line 99
    move/from16 v21, v4

    .line 100
    .line 101
    iget-object v4, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 102
    .line 103
    aget-object v4, v4, v15

    .line 104
    .line 105
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_1

    .line 110
    .line 111
    return v15

    .line 112
    :cond_1
    const-wide/16 v19, 0x1

    .line 113
    .line 114
    sub-long v19, v13, v19

    .line 115
    .line 116
    and-long v13, v13, v19

    .line 117
    .line 118
    move/from16 v4, v21

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move/from16 v21, v4

    .line 122
    .line 123
    not-long v13, v9

    .line 124
    const/4 v4, 0x6

    .line 125
    shl-long/2addr v13, v4

    .line 126
    and-long/2addr v9, v13

    .line 127
    and-long v9, v9, v17

    .line 128
    .line 129
    cmp-long v4, v9, v19

    .line 130
    .line 131
    const/16 v9, 0x8

    .line 132
    .line 133
    if-eqz v4, :cond_1f

    .line 134
    .line 135
    invoke-virtual {v0, v5}, La/xy40;->e(I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iget v3, v0, La/xy40;->h:I

    .line 140
    .line 141
    const-wide/16 v13, 0xff

    .line 142
    .line 143
    if-nez v3, :cond_3

    .line 144
    .line 145
    iget-object v3, v0, La/xy40;->a:[J

    .line 146
    .line 147
    shr-int/lit8 v8, v1, 0x3

    .line 148
    .line 149
    aget-wide v19, v3, v8

    .line 150
    .line 151
    and-int/lit8 v3, v1, 0x7

    .line 152
    .line 153
    shl-int/lit8 v3, v3, 0x3

    .line 154
    .line 155
    shr-long v19, v19, v3

    .line 156
    .line 157
    and-long v19, v19, v13

    .line 158
    .line 159
    const-wide/16 v22, 0xfe

    .line 160
    .line 161
    cmp-long v3, v19, v22

    .line 162
    .line 163
    if-nez v3, :cond_4

    .line 164
    .line 165
    :cond_3
    move/from16 v30, v2

    .line 166
    .line 167
    move-wide/from16 v45, v11

    .line 168
    .line 169
    move-wide/from16 v35, v13

    .line 170
    .line 171
    const/16 p1, 0x7

    .line 172
    .line 173
    const-wide/16 v26, 0x80

    .line 174
    .line 175
    goto/16 :goto_16

    .line 176
    .line 177
    :cond_4
    iget v1, v0, La/xy40;->f:I

    .line 178
    .line 179
    const-wide/high16 v19, -0x4000000000000000L    # -2.0

    .line 180
    .line 181
    const-wide/32 v24, 0x7fffffff

    .line 182
    .line 183
    .line 184
    if-le v1, v9, :cond_15

    .line 185
    .line 186
    iget v10, v0, La/xy40;->g:I

    .line 187
    .line 188
    const/16 p1, 0x7

    .line 189
    .line 190
    const/16 v15, 0x1f

    .line 191
    .line 192
    int-to-long v3, v10

    .line 193
    sget-object v10, La/h2t0;->b:La/g2t0;

    .line 194
    .line 195
    const-wide/16 v26, 0x20

    .line 196
    .line 197
    mul-long v3, v3, v26

    .line 198
    .line 199
    const-wide/16 v26, 0x80

    .line 200
    .line 201
    int-to-long v6, v1

    .line 202
    const-wide/16 v28, 0x19

    .line 203
    .line 204
    mul-long v6, v6, v28

    .line 205
    .line 206
    const-wide/high16 v28, -0x8000000000000000L

    .line 207
    .line 208
    xor-long v3, v3, v28

    .line 209
    .line 210
    xor-long v6, v6, v28

    .line 211
    .line 212
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Long;->compare(JJ)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-gtz v1, :cond_14

    .line 217
    .line 218
    iget-object v1, v0, La/xy40;->a:[J

    .line 219
    .line 220
    if-nez v1, :cond_5

    .line 221
    .line 222
    move/from16 v30, v2

    .line 223
    .line 224
    move-wide/from16 v45, v11

    .line 225
    .line 226
    move-wide/from16 v35, v13

    .line 227
    .line 228
    goto/16 :goto_15

    .line 229
    .line 230
    :cond_5
    iget v3, v0, La/xy40;->f:I

    .line 231
    .line 232
    iget-object v4, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 233
    .line 234
    iget-object v6, v0, La/xy40;->c:[J

    .line 235
    .line 236
    new-array v7, v3, [J

    .line 237
    .line 238
    move/from16 v28, v9

    .line 239
    .line 240
    const-wide v9, 0x7fffffff7fffffffL

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    invoke-static {v7, v2, v3, v9, v10}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 246
    .line 247
    .line 248
    add-int/lit8 v29, v3, 0x7

    .line 249
    .line 250
    move/from16 v30, v2

    .line 251
    .line 252
    shr-int/lit8 v2, v29, 0x3

    .line 253
    .line 254
    move-wide/from16 v31, v9

    .line 255
    .line 256
    move/from16 v9, v30

    .line 257
    .line 258
    :goto_3
    if-ge v9, v2, :cond_6

    .line 259
    .line 260
    aget-wide v33, v1, v9

    .line 261
    .line 262
    move-wide/from16 v35, v13

    .line 263
    .line 264
    and-long v13, v33, v17

    .line 265
    .line 266
    move/from16 v29, v9

    .line 267
    .line 268
    not-long v8, v13

    .line 269
    ushr-long v13, v13, p1

    .line 270
    .line 271
    add-long/2addr v8, v13

    .line 272
    const-wide v13, -0x101010101010102L

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    and-long/2addr v8, v13

    .line 278
    aput-wide v8, v1, v29

    .line 279
    .line 280
    add-int/lit8 v9, v29, 0x1

    .line 281
    .line 282
    move-wide/from16 v13, v35

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_6
    move-wide/from16 v35, v13

    .line 286
    .line 287
    array-length v2, v1

    .line 288
    add-int/lit8 v8, v2, -0x1

    .line 289
    .line 290
    add-int/lit8 v2, v2, -0x2

    .line 291
    .line 292
    aget-wide v13, v1, v2

    .line 293
    .line 294
    const-wide v17, 0xffffffffffffffL

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    and-long v13, v13, v17

    .line 300
    .line 301
    const-wide/high16 v17, -0x100000000000000L

    .line 302
    .line 303
    or-long v13, v13, v17

    .line 304
    .line 305
    aput-wide v13, v1, v2

    .line 306
    .line 307
    aget-wide v13, v1, v30

    .line 308
    .line 309
    aput-wide v13, v1, v8

    .line 310
    .line 311
    move/from16 v2, v30

    .line 312
    .line 313
    :goto_4
    if-eq v2, v3, :cond_f

    .line 314
    .line 315
    shr-int/lit8 v13, v2, 0x3

    .line 316
    .line 317
    aget-wide v17, v1, v13

    .line 318
    .line 319
    and-int/lit8 v14, v2, 0x7

    .line 320
    .line 321
    shl-int/lit8 v14, v14, 0x3

    .line 322
    .line 323
    shr-long v17, v17, v14

    .line 324
    .line 325
    and-long v17, v17, v35

    .line 326
    .line 327
    cmp-long v29, v17, v26

    .line 328
    .line 329
    if-nez v29, :cond_7

    .line 330
    .line 331
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_7
    cmp-long v17, v17, v22

    .line 335
    .line 336
    if-eqz v17, :cond_8

    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_8
    aget-object v17, v4, v2

    .line 340
    .line 341
    if-eqz v17, :cond_9

    .line 342
    .line 343
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->hashCode()I

    .line 344
    .line 345
    .line 346
    move-result v17

    .line 347
    goto :goto_6

    .line 348
    :cond_9
    move/from16 v17, v30

    .line 349
    .line 350
    :goto_6
    ushr-int/lit8 v18, v17, 0x10

    .line 351
    .line 352
    xor-int v17, v17, v18

    .line 353
    .line 354
    mul-int v17, v17, v21

    .line 355
    .line 356
    ushr-int/lit8 v18, v17, 0x10

    .line 357
    .line 358
    xor-int v17, v17, v18

    .line 359
    .line 360
    const-wide v33, 0xffffffffL

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    ushr-int/lit8 v8, v17, 0x7

    .line 366
    .line 367
    invoke-virtual {v0, v8}, La/xy40;->e(I)I

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    and-int/2addr v8, v3

    .line 372
    sub-int v18, v9, v8

    .line 373
    .line 374
    and-int v18, v18, v3

    .line 375
    .line 376
    div-int/lit8 v10, v18, 0x8

    .line 377
    .line 378
    sub-int v8, v2, v8

    .line 379
    .line 380
    and-int/2addr v8, v3

    .line 381
    div-int/lit8 v8, v8, 0x8

    .line 382
    .line 383
    const/16 v18, 0x20

    .line 384
    .line 385
    if-ne v10, v8, :cond_b

    .line 386
    .line 387
    and-int/lit8 v8, v17, 0x7f

    .line 388
    .line 389
    int-to-long v8, v8

    .line 390
    aget-wide v33, v1, v13

    .line 391
    .line 392
    move/from16 v37, v3

    .line 393
    .line 394
    move-object/from16 v38, v4

    .line 395
    .line 396
    shl-long v3, v35, v14

    .line 397
    .line 398
    not-long v3, v3

    .line 399
    and-long v3, v33, v3

    .line 400
    .line 401
    shl-long/2addr v8, v14

    .line 402
    or-long/2addr v3, v8

    .line 403
    aput-wide v3, v1, v13

    .line 404
    .line 405
    aget-wide v3, v7, v2

    .line 406
    .line 407
    cmp-long v3, v3, v31

    .line 408
    .line 409
    if-nez v3, :cond_a

    .line 410
    .line 411
    int-to-long v3, v2

    .line 412
    shl-long v8, v3, v18

    .line 413
    .line 414
    or-long/2addr v3, v8

    .line 415
    aput-wide v3, v7, v2

    .line 416
    .line 417
    :cond_a
    array-length v3, v1

    .line 418
    add-int/lit8 v3, v3, -0x1

    .line 419
    .line 420
    aget-wide v8, v1, v30

    .line 421
    .line 422
    aput-wide v8, v1, v3

    .line 423
    .line 424
    add-int/lit8 v2, v2, 0x1

    .line 425
    .line 426
    move/from16 v3, v37

    .line 427
    .line 428
    move-object/from16 v4, v38

    .line 429
    .line 430
    goto :goto_4

    .line 431
    :cond_b
    move/from16 v37, v3

    .line 432
    .line 433
    move-object/from16 v38, v4

    .line 434
    .line 435
    shr-int/lit8 v3, v9, 0x3

    .line 436
    .line 437
    aget-wide v39, v1, v3

    .line 438
    .line 439
    and-int/lit8 v4, v9, 0x7

    .line 440
    .line 441
    shl-int/lit8 v4, v4, 0x3

    .line 442
    .line 443
    shr-long v41, v39, v4

    .line 444
    .line 445
    and-long v41, v41, v35

    .line 446
    .line 447
    cmp-long v8, v41, v26

    .line 448
    .line 449
    const-wide v41, -0x100000000L

    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    if-nez v8, :cond_d

    .line 455
    .line 456
    and-int/lit8 v8, v17, 0x7f

    .line 457
    .line 458
    move/from16 v43, v3

    .line 459
    .line 460
    move/from16 v44, v4

    .line 461
    .line 462
    int-to-long v3, v8

    .line 463
    move-wide/from16 v45, v3

    .line 464
    .line 465
    shl-long v3, v35, v44

    .line 466
    .line 467
    not-long v3, v3

    .line 468
    and-long v3, v39, v3

    .line 469
    .line 470
    shl-long v39, v45, v44

    .line 471
    .line 472
    or-long v3, v3, v39

    .line 473
    .line 474
    aput-wide v3, v1, v43

    .line 475
    .line 476
    aget-wide v3, v1, v13

    .line 477
    .line 478
    move-wide/from16 v39, v3

    .line 479
    .line 480
    shl-long v3, v35, v14

    .line 481
    .line 482
    not-long v3, v3

    .line 483
    and-long v3, v39, v3

    .line 484
    .line 485
    shl-long v39, v26, v14

    .line 486
    .line 487
    or-long v3, v3, v39

    .line 488
    .line 489
    aput-wide v3, v1, v13

    .line 490
    .line 491
    aget-object v3, v38, v2

    .line 492
    .line 493
    aput-object v3, v38, v9

    .line 494
    .line 495
    const/4 v3, 0x0

    .line 496
    aput-object v3, v38, v2

    .line 497
    .line 498
    aget-wide v3, v6, v2

    .line 499
    .line 500
    aput-wide v3, v6, v9

    .line 501
    .line 502
    const-wide v3, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    aput-wide v3, v6, v2

    .line 508
    .line 509
    aget-wide v3, v7, v2

    .line 510
    .line 511
    shr-long v3, v3, v18

    .line 512
    .line 513
    and-long v3, v3, v33

    .line 514
    .line 515
    long-to-int v3, v3

    .line 516
    const v10, 0x7fffffff

    .line 517
    .line 518
    .line 519
    if-eq v3, v10, :cond_c

    .line 520
    .line 521
    aget-wide v13, v7, v3

    .line 522
    .line 523
    and-long v13, v13, v41

    .line 524
    .line 525
    move-wide/from16 v45, v11

    .line 526
    .line 527
    int-to-long v10, v9

    .line 528
    or-long/2addr v10, v13

    .line 529
    aput-wide v10, v7, v3

    .line 530
    .line 531
    aget-wide v3, v7, v2

    .line 532
    .line 533
    and-long v3, v3, v33

    .line 534
    .line 535
    or-long v3, v3, v41

    .line 536
    .line 537
    aput-wide v3, v7, v2

    .line 538
    .line 539
    goto :goto_7

    .line 540
    :cond_c
    move-wide/from16 v45, v11

    .line 541
    .line 542
    const-wide v3, 0x7fffffff00000000L

    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    int-to-long v10, v9

    .line 548
    or-long/2addr v3, v10

    .line 549
    aput-wide v3, v7, v2

    .line 550
    .line 551
    :goto_7
    int-to-long v3, v2

    .line 552
    shl-long v3, v3, v18

    .line 553
    .line 554
    or-long v3, v3, v24

    .line 555
    .line 556
    aput-wide v3, v7, v9

    .line 557
    .line 558
    goto :goto_9

    .line 559
    :cond_d
    move/from16 v43, v3

    .line 560
    .line 561
    move/from16 v44, v4

    .line 562
    .line 563
    move-wide/from16 v45, v11

    .line 564
    .line 565
    and-int/lit8 v3, v17, 0x7f

    .line 566
    .line 567
    int-to-long v3, v3

    .line 568
    shl-long v10, v35, v44

    .line 569
    .line 570
    not-long v10, v10

    .line 571
    and-long v10, v39, v10

    .line 572
    .line 573
    shl-long v3, v3, v44

    .line 574
    .line 575
    or-long/2addr v3, v10

    .line 576
    aput-wide v3, v1, v43

    .line 577
    .line 578
    aget-object v3, v38, v9

    .line 579
    .line 580
    aget-object v4, v38, v2

    .line 581
    .line 582
    aput-object v4, v38, v9

    .line 583
    .line 584
    aput-object v3, v38, v2

    .line 585
    .line 586
    aget-wide v3, v6, v9

    .line 587
    .line 588
    aget-wide v10, v6, v2

    .line 589
    .line 590
    aput-wide v10, v6, v9

    .line 591
    .line 592
    aput-wide v3, v6, v2

    .line 593
    .line 594
    aget-wide v3, v7, v2

    .line 595
    .line 596
    shr-long v3, v3, v18

    .line 597
    .line 598
    and-long v3, v3, v33

    .line 599
    .line 600
    long-to-int v3, v3

    .line 601
    const v10, 0x7fffffff

    .line 602
    .line 603
    .line 604
    if-eq v3, v10, :cond_e

    .line 605
    .line 606
    aget-wide v11, v7, v3

    .line 607
    .line 608
    and-long v11, v11, v41

    .line 609
    .line 610
    int-to-long v13, v9

    .line 611
    or-long/2addr v11, v13

    .line 612
    aput-wide v11, v7, v3

    .line 613
    .line 614
    aget-wide v11, v7, v2

    .line 615
    .line 616
    shl-long v13, v13, v18

    .line 617
    .line 618
    and-long v11, v11, v33

    .line 619
    .line 620
    or-long/2addr v11, v13

    .line 621
    aput-wide v11, v7, v2

    .line 622
    .line 623
    goto :goto_8

    .line 624
    :cond_e
    int-to-long v3, v9

    .line 625
    shl-long v11, v3, v18

    .line 626
    .line 627
    or-long/2addr v3, v11

    .line 628
    aput-wide v3, v7, v2

    .line 629
    .line 630
    move v3, v2

    .line 631
    :goto_8
    int-to-long v3, v3

    .line 632
    shl-long v3, v3, v18

    .line 633
    .line 634
    int-to-long v11, v2

    .line 635
    or-long/2addr v3, v11

    .line 636
    aput-wide v3, v7, v9

    .line 637
    .line 638
    add-int/lit8 v2, v2, -0x1

    .line 639
    .line 640
    :goto_9
    array-length v3, v1

    .line 641
    add-int/lit8 v3, v3, -0x1

    .line 642
    .line 643
    aget-wide v8, v1, v30

    .line 644
    .line 645
    aput-wide v8, v1, v3

    .line 646
    .line 647
    add-int/lit8 v2, v2, 0x1

    .line 648
    .line 649
    move/from16 v3, v37

    .line 650
    .line 651
    move-object/from16 v4, v38

    .line 652
    .line 653
    move-wide/from16 v11, v45

    .line 654
    .line 655
    goto/16 :goto_4

    .line 656
    .line 657
    :cond_f
    move-wide/from16 v45, v11

    .line 658
    .line 659
    const-wide v33, 0xffffffffL

    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    iget v1, v0, La/xy40;->f:I

    .line 665
    .line 666
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    iget v2, v0, La/xy40;->g:I

    .line 671
    .line 672
    sub-int/2addr v1, v2

    .line 673
    iput v1, v0, La/xy40;->h:I

    .line 674
    .line 675
    iget-object v1, v0, La/xy40;->c:[J

    .line 676
    .line 677
    array-length v2, v1

    .line 678
    move/from16 v3, v30

    .line 679
    .line 680
    :goto_a
    if-ge v3, v2, :cond_12

    .line 681
    .line 682
    aget-wide v8, v1, v3

    .line 683
    .line 684
    shr-long v11, v8, v15

    .line 685
    .line 686
    and-long v11, v11, v24

    .line 687
    .line 688
    long-to-int v4, v11

    .line 689
    and-long v11, v8, v24

    .line 690
    .line 691
    long-to-int v6, v11

    .line 692
    and-long v8, v8, v19

    .line 693
    .line 694
    const v10, 0x7fffffff

    .line 695
    .line 696
    .line 697
    if-ne v4, v10, :cond_10

    .line 698
    .line 699
    move v4, v10

    .line 700
    goto :goto_b

    .line 701
    :cond_10
    aget-wide v11, v7, v4

    .line 702
    .line 703
    and-long v11, v11, v33

    .line 704
    .line 705
    long-to-int v4, v11

    .line 706
    :goto_b
    int-to-long v11, v4

    .line 707
    or-long/2addr v8, v11

    .line 708
    shl-long/2addr v8, v15

    .line 709
    if-ne v6, v10, :cond_11

    .line 710
    .line 711
    const v4, 0x7fffffff

    .line 712
    .line 713
    .line 714
    goto :goto_c

    .line 715
    :cond_11
    aget-wide v11, v7, v6

    .line 716
    .line 717
    and-long v11, v11, v33

    .line 718
    .line 719
    long-to-int v4, v11

    .line 720
    :goto_c
    int-to-long v11, v4

    .line 721
    or-long/2addr v8, v11

    .line 722
    aput-wide v8, v1, v3

    .line 723
    .line 724
    add-int/lit8 v3, v3, 0x1

    .line 725
    .line 726
    goto :goto_a

    .line 727
    :cond_12
    iget v1, v0, La/xy40;->d:I

    .line 728
    .line 729
    const v10, 0x7fffffff

    .line 730
    .line 731
    .line 732
    if-eq v1, v10, :cond_13

    .line 733
    .line 734
    aget-wide v1, v7, v1

    .line 735
    .line 736
    and-long v1, v1, v33

    .line 737
    .line 738
    long-to-int v1, v1

    .line 739
    iput v1, v0, La/xy40;->d:I

    .line 740
    .line 741
    :cond_13
    iget v1, v0, La/xy40;->e:I

    .line 742
    .line 743
    if-eq v1, v10, :cond_1d

    .line 744
    .line 745
    aget-wide v1, v7, v1

    .line 746
    .line 747
    and-long v1, v1, v33

    .line 748
    .line 749
    long-to-int v1, v1

    .line 750
    iput v1, v0, La/xy40;->e:I

    .line 751
    .line 752
    goto/16 :goto_15

    .line 753
    .line 754
    :cond_14
    :goto_d
    move/from16 v30, v2

    .line 755
    .line 756
    move-wide/from16 v45, v11

    .line 757
    .line 758
    move-wide/from16 v35, v13

    .line 759
    .line 760
    goto :goto_e

    .line 761
    :cond_15
    const/16 p1, 0x7

    .line 762
    .line 763
    const/16 v15, 0x1f

    .line 764
    .line 765
    const-wide/16 v26, 0x80

    .line 766
    .line 767
    goto :goto_d

    .line 768
    :goto_e
    iget v1, v0, La/xy40;->f:I

    .line 769
    .line 770
    invoke-static {v1}, La/u1h0;->b(I)I

    .line 771
    .line 772
    .line 773
    move-result v1

    .line 774
    iget-object v2, v0, La/xy40;->a:[J

    .line 775
    .line 776
    iget-object v3, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 777
    .line 778
    iget-object v4, v0, La/xy40;->c:[J

    .line 779
    .line 780
    iget v6, v0, La/xy40;->f:I

    .line 781
    .line 782
    new-array v7, v6, [I

    .line 783
    .line 784
    invoke-virtual {v0, v1}, La/xy40;->f(I)V

    .line 785
    .line 786
    .line 787
    iget-object v1, v0, La/xy40;->a:[J

    .line 788
    .line 789
    iget-object v8, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 790
    .line 791
    iget-object v9, v0, La/xy40;->c:[J

    .line 792
    .line 793
    iget v11, v0, La/xy40;->f:I

    .line 794
    .line 795
    move/from16 v12, v30

    .line 796
    .line 797
    :goto_f
    if-ge v12, v6, :cond_18

    .line 798
    .line 799
    shr-int/lit8 v13, v12, 0x3

    .line 800
    .line 801
    aget-wide v13, v2, v13

    .line 802
    .line 803
    and-int/lit8 v17, v12, 0x7

    .line 804
    .line 805
    shl-int/lit8 v17, v17, 0x3

    .line 806
    .line 807
    shr-long v13, v13, v17

    .line 808
    .line 809
    and-long v13, v13, v35

    .line 810
    .line 811
    cmp-long v13, v13, v26

    .line 812
    .line 813
    if-gez v13, :cond_17

    .line 814
    .line 815
    aget-object v13, v3, v12

    .line 816
    .line 817
    if-eqz v13, :cond_16

    .line 818
    .line 819
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 820
    .line 821
    .line 822
    move-result v14

    .line 823
    goto :goto_10

    .line 824
    :cond_16
    move/from16 v14, v30

    .line 825
    .line 826
    :goto_10
    ushr-int/lit8 v17, v14, 0x10

    .line 827
    .line 828
    xor-int v14, v14, v17

    .line 829
    .line 830
    mul-int v14, v14, v21

    .line 831
    .line 832
    ushr-int/lit8 v17, v14, 0x10

    .line 833
    .line 834
    xor-int v14, v14, v17

    .line 835
    .line 836
    ushr-int/lit8 v10, v14, 0x7

    .line 837
    .line 838
    invoke-virtual {v0, v10}, La/xy40;->e(I)I

    .line 839
    .line 840
    .line 841
    move-result v10

    .line 842
    and-int/lit8 v14, v14, 0x7f

    .line 843
    .line 844
    move-object/from16 v18, v1

    .line 845
    .line 846
    move-object/from16 v17, v2

    .line 847
    .line 848
    int-to-long v1, v14

    .line 849
    shr-int/lit8 v14, v10, 0x3

    .line 850
    .line 851
    and-int/lit8 v22, v10, 0x7

    .line 852
    .line 853
    shl-int/lit8 v22, v22, 0x3

    .line 854
    .line 855
    aget-wide v31, v18, v14

    .line 856
    .line 857
    move-wide/from16 v33, v1

    .line 858
    .line 859
    shl-long v1, v35, v22

    .line 860
    .line 861
    not-long v1, v1

    .line 862
    and-long v1, v31, v1

    .line 863
    .line 864
    shl-long v22, v33, v22

    .line 865
    .line 866
    or-long v1, v1, v22

    .line 867
    .line 868
    aput-wide v1, v18, v14

    .line 869
    .line 870
    add-int/lit8 v14, v10, -0x7

    .line 871
    .line 872
    and-int/2addr v14, v11

    .line 873
    and-int/lit8 v22, v11, 0x7

    .line 874
    .line 875
    add-int v14, v14, v22

    .line 876
    .line 877
    shr-int/lit8 v14, v14, 0x3

    .line 878
    .line 879
    aput-wide v1, v18, v14

    .line 880
    .line 881
    aput-object v13, v8, v10

    .line 882
    .line 883
    aget-wide v1, v4, v12

    .line 884
    .line 885
    aput-wide v1, v9, v10

    .line 886
    .line 887
    aput v10, v7, v12

    .line 888
    .line 889
    goto :goto_11

    .line 890
    :cond_17
    move-object/from16 v18, v1

    .line 891
    .line 892
    move-object/from16 v17, v2

    .line 893
    .line 894
    :goto_11
    add-int/lit8 v12, v12, 0x1

    .line 895
    .line 896
    move-object/from16 v2, v17

    .line 897
    .line 898
    move-object/from16 v1, v18

    .line 899
    .line 900
    goto :goto_f

    .line 901
    :cond_18
    iget-object v1, v0, La/xy40;->c:[J

    .line 902
    .line 903
    array-length v2, v1

    .line 904
    move/from16 v3, v30

    .line 905
    .line 906
    :goto_12
    if-ge v3, v2, :cond_1b

    .line 907
    .line 908
    aget-wide v8, v1, v3

    .line 909
    .line 910
    shr-long v10, v8, v15

    .line 911
    .line 912
    and-long v10, v10, v24

    .line 913
    .line 914
    long-to-int v4, v10

    .line 915
    and-long v10, v8, v24

    .line 916
    .line 917
    long-to-int v6, v10

    .line 918
    and-long v8, v8, v19

    .line 919
    .line 920
    const v10, 0x7fffffff

    .line 921
    .line 922
    .line 923
    if-ne v4, v10, :cond_19

    .line 924
    .line 925
    move v4, v10

    .line 926
    goto :goto_13

    .line 927
    :cond_19
    aget v29, v7, v4

    .line 928
    .line 929
    move/from16 v4, v29

    .line 930
    .line 931
    :goto_13
    int-to-long v11, v4

    .line 932
    or-long/2addr v8, v11

    .line 933
    shl-long/2addr v8, v15

    .line 934
    if-ne v6, v10, :cond_1a

    .line 935
    .line 936
    move v4, v10

    .line 937
    goto :goto_14

    .line 938
    :cond_1a
    aget v29, v7, v6

    .line 939
    .line 940
    move/from16 v4, v29

    .line 941
    .line 942
    :goto_14
    int-to-long v11, v4

    .line 943
    or-long/2addr v8, v11

    .line 944
    aput-wide v8, v1, v3

    .line 945
    .line 946
    add-int/lit8 v3, v3, 0x1

    .line 947
    .line 948
    goto :goto_12

    .line 949
    :cond_1b
    const v10, 0x7fffffff

    .line 950
    .line 951
    .line 952
    iget v1, v0, La/xy40;->d:I

    .line 953
    .line 954
    if-eq v1, v10, :cond_1c

    .line 955
    .line 956
    aget v1, v7, v1

    .line 957
    .line 958
    iput v1, v0, La/xy40;->d:I

    .line 959
    .line 960
    :cond_1c
    iget v1, v0, La/xy40;->e:I

    .line 961
    .line 962
    if-eq v1, v10, :cond_1d

    .line 963
    .line 964
    aget v1, v7, v1

    .line 965
    .line 966
    iput v1, v0, La/xy40;->e:I

    .line 967
    .line 968
    :cond_1d
    :goto_15
    invoke-virtual {v0, v5}, La/xy40;->e(I)I

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    :goto_16
    iget v2, v0, La/xy40;->g:I

    .line 973
    .line 974
    add-int/lit8 v2, v2, 0x1

    .line 975
    .line 976
    iput v2, v0, La/xy40;->g:I

    .line 977
    .line 978
    iget v2, v0, La/xy40;->h:I

    .line 979
    .line 980
    iget-object v3, v0, La/xy40;->a:[J

    .line 981
    .line 982
    shr-int/lit8 v4, v1, 0x3

    .line 983
    .line 984
    aget-wide v5, v3, v4

    .line 985
    .line 986
    and-int/lit8 v7, v1, 0x7

    .line 987
    .line 988
    shl-int/lit8 v7, v7, 0x3

    .line 989
    .line 990
    shr-long v8, v5, v7

    .line 991
    .line 992
    and-long v8, v8, v35

    .line 993
    .line 994
    cmp-long v8, v8, v26

    .line 995
    .line 996
    if-nez v8, :cond_1e

    .line 997
    .line 998
    move/from16 v30, v16

    .line 999
    .line 1000
    :cond_1e
    sub-int v2, v2, v30

    .line 1001
    .line 1002
    iput v2, v0, La/xy40;->h:I

    .line 1003
    .line 1004
    iget v0, v0, La/xy40;->f:I

    .line 1005
    .line 1006
    shl-long v8, v35, v7

    .line 1007
    .line 1008
    not-long v8, v8

    .line 1009
    and-long/2addr v5, v8

    .line 1010
    shl-long v7, v45, v7

    .line 1011
    .line 1012
    or-long/2addr v5, v7

    .line 1013
    aput-wide v5, v3, v4

    .line 1014
    .line 1015
    add-int/lit8 v2, v1, -0x7

    .line 1016
    .line 1017
    and-int/2addr v2, v0

    .line 1018
    and-int/lit8 v0, v0, 0x7

    .line 1019
    .line 1020
    add-int/2addr v2, v0

    .line 1021
    shr-int/lit8 v0, v2, 0x3

    .line 1022
    .line 1023
    aput-wide v5, v3, v0

    .line 1024
    .line 1025
    return v1

    .line 1026
    :cond_1f
    move/from16 v30, v2

    .line 1027
    .line 1028
    move/from16 v28, v9

    .line 1029
    .line 1030
    add-int/lit8 v8, v8, 0x8

    .line 1031
    .line 1032
    add-int/2addr v7, v8

    .line 1033
    and-int/2addr v7, v6

    .line 1034
    move/from16 v4, v21

    .line 1035
    .line 1036
    goto/16 :goto_1
.end method

.method public final e(I)I
    .locals 9

    .line 1
    iget v0, p0, La/xy40;->f:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/xy40;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    shr-int/lit8 p0, p0, 0x3

    .line 52
    .line 53
    add-int/2addr p1, p0

    .line 54
    and-int p0, p1, v0

    .line 55
    .line 56
    return p0

    .line 57
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 58
    .line 59
    add-int/2addr p1, v1

    .line 60
    and-int/2addr p1, v0

    .line 61
    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/xy40;

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
    check-cast p1, La/xy40;

    .line 12
    .line 13
    iget v1, p1, La/xy40;->g:I

    .line 14
    .line 15
    iget v3, p0, La/xy40;->g:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, La/xy40;->a:[J

    .line 23
    .line 24
    array-length v3, p0

    .line 25
    add-int/lit8 v3, v3, -0x2

    .line 26
    .line 27
    if-ltz v3, :cond_6

    .line 28
    .line 29
    move v4, v2

    .line 30
    :goto_0
    aget-wide v5, p0, v4

    .line 31
    .line 32
    not-long v7, v5

    .line 33
    const/4 v9, 0x7

    .line 34
    shl-long/2addr v7, v9

    .line 35
    and-long/2addr v7, v5

    .line 36
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v7, v9

    .line 42
    cmp-long v7, v7, v9

    .line 43
    .line 44
    if-eqz v7, :cond_5

    .line 45
    .line 46
    sub-int v7, v4, v3

    .line 47
    .line 48
    not-int v7, v7

    .line 49
    ushr-int/lit8 v7, v7, 0x1f

    .line 50
    .line 51
    const/16 v8, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v7, v7, 0x8

    .line 54
    .line 55
    move v9, v2

    .line 56
    :goto_1
    if-ge v9, v7, :cond_4

    .line 57
    .line 58
    const-wide/16 v10, 0xff

    .line 59
    .line 60
    and-long/2addr v10, v5

    .line 61
    const-wide/16 v12, 0x80

    .line 62
    .line 63
    cmp-long v10, v10, v12

    .line 64
    .line 65
    if-gez v10, :cond_3

    .line 66
    .line 67
    shl-int/lit8 v10, v4, 0x3

    .line 68
    .line 69
    add-int/2addr v10, v9

    .line 70
    aget-object v10, v1, v10

    .line 71
    .line 72
    invoke-virtual {p1, v10}, La/xy40;->c(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_3

    .line 77
    .line 78
    return v2

    .line 79
    :cond_3
    shr-long/2addr v5, v8

    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    if-ne v7, v8, :cond_6

    .line 84
    .line 85
    :cond_5
    if-eq v4, v3, :cond_6

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    return v0
.end method

.method public final f(I)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, La/u1h0;->c(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v1, 0x7

    .line 9
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v0

    .line 15
    :goto_0
    iput p1, p0, La/xy40;->f:I

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    sget-object v1, La/u1h0;->a:[J

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v1, p1, 0xf

    .line 23
    .line 24
    and-int/lit8 v1, v1, -0x8

    .line 25
    .line 26
    shr-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    new-array v2, v1, [J

    .line 29
    .line 30
    const-wide v3, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v0, v1, v3, v4}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 36
    .line 37
    .line 38
    move-object v1, v2

    .line 39
    :goto_1
    iput-object v1, p0, La/xy40;->a:[J

    .line 40
    .line 41
    shr-int/lit8 v2, p1, 0x3

    .line 42
    .line 43
    and-int/lit8 v3, p1, 0x7

    .line 44
    .line 45
    shl-int/lit8 v3, v3, 0x3

    .line 46
    .line 47
    aget-wide v4, v1, v2

    .line 48
    .line 49
    const-wide/16 v6, 0xff

    .line 50
    .line 51
    shl-long/2addr v6, v3

    .line 52
    not-long v8, v6

    .line 53
    and-long v3, v4, v8

    .line 54
    .line 55
    or-long/2addr v3, v6

    .line 56
    aput-wide v3, v1, v2

    .line 57
    .line 58
    iget v1, p0, La/xy40;->f:I

    .line 59
    .line 60
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iget v2, p0, La/xy40;->g:I

    .line 65
    .line 66
    sub-int/2addr v1, v2

    .line 67
    iput v1, p0, La/xy40;->h:I

    .line 68
    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    sget-object v1, La/jd8;->j:[Ljava/lang/Object;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    new-array v1, p1, [Ljava/lang/Object;

    .line 75
    .line 76
    :goto_2
    iput-object v1, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    sget-object p1, La/dwi0;->n:[J

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    new-array v1, p1, [J

    .line 84
    .line 85
    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v1, v0, p1, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 91
    .line 92
    .line 93
    move-object p1, v1

    .line 94
    :goto_3
    iput-object p1, p0, La/xy40;->c:[J

    .line 95
    .line 96
    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 10

    .line 1
    invoke-virtual {p0, p1}, La/xy40;->d(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aput-object p1, v1, v0

    .line 8
    .line 9
    iget-object p1, p0, La/xy40;->c:[J

    .line 10
    .line 11
    iget v1, p0, La/xy40;->d:I

    .line 12
    .line 13
    int-to-long v2, v1

    .line 14
    const-wide/32 v4, 0x7fffffff

    .line 15
    .line 16
    .line 17
    and-long/2addr v2, v4

    .line 18
    const-wide v6, 0x3fffffff80000000L    # 1.9999995231628418

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    or-long/2addr v2, v6

    .line 24
    aput-wide v2, p1, v0

    .line 25
    .line 26
    const v2, 0x7fffffff

    .line 27
    .line 28
    .line 29
    if-eq v1, v2, :cond_0

    .line 30
    .line 31
    aget-wide v6, p1, v1

    .line 32
    .line 33
    const-wide v8, -0x3fffffff80000001L    # -2.000000953674316

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v6, v8

    .line 39
    int-to-long v8, v0

    .line 40
    and-long v3, v8, v4

    .line 41
    .line 42
    const/16 v5, 0x1f

    .line 43
    .line 44
    shl-long/2addr v3, v5

    .line 45
    or-long/2addr v3, v6

    .line 46
    aput-wide v3, p1, v1

    .line 47
    .line 48
    :cond_0
    iput v0, p0, La/xy40;->d:I

    .line 49
    .line 50
    iget p1, p0, La/xy40;->e:I

    .line 51
    .line 52
    if-ne p1, v2, :cond_1

    .line 53
    .line 54
    iput v0, p0, La/xy40;->e:I

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v4, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v4

    .line 24
    and-int/lit8 v4, v3, 0x7f

    .line 25
    .line 26
    iget v5, v0, La/xy40;->f:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v3, 0x7

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    move v6, v2

    .line 32
    :goto_1
    iget-object v7, v0, La/xy40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v8, v3, 0x3

    .line 35
    .line 36
    and-int/lit8 v9, v3, 0x7

    .line 37
    .line 38
    shl-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    aget-wide v10, v7, v8

    .line 41
    .line 42
    ushr-long/2addr v10, v9

    .line 43
    const/4 v12, 0x1

    .line 44
    add-int/2addr v8, v12

    .line 45
    aget-wide v13, v7, v8

    .line 46
    .line 47
    rsub-int/lit8 v7, v9, 0x40

    .line 48
    .line 49
    shl-long v7, v13, v7

    .line 50
    .line 51
    int-to-long v13, v9

    .line 52
    neg-long v13, v13

    .line 53
    const/16 v9, 0x3f

    .line 54
    .line 55
    shr-long/2addr v13, v9

    .line 56
    and-long/2addr v7, v13

    .line 57
    or-long/2addr v7, v10

    .line 58
    int-to-long v9, v4

    .line 59
    const-wide v13, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v9, v13

    .line 65
    xor-long/2addr v9, v7

    .line 66
    sub-long v13, v9, v13

    .line 67
    .line 68
    not-long v9, v9

    .line 69
    and-long/2addr v9, v13

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v9, v13

    .line 76
    :goto_2
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v11, v9, v15

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    shr-int/lit8 v11, v11, 0x3

    .line 87
    .line 88
    add-int/2addr v11, v3

    .line 89
    and-int/2addr v11, v5

    .line 90
    iget-object v15, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 91
    .line 92
    aget-object v15, v15, v11

    .line 93
    .line 94
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    sub-long v15, v9, v15

    .line 104
    .line 105
    and-long/2addr v9, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    not-long v9, v7

    .line 108
    const/4 v11, 0x6

    .line 109
    shl-long/2addr v9, v11

    .line 110
    and-long/2addr v7, v9

    .line 111
    and-long/2addr v7, v13

    .line 112
    cmp-long v7, v7, v15

    .line 113
    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    const/4 v11, -0x1

    .line 117
    :goto_3
    if-ltz v11, :cond_3

    .line 118
    .line 119
    move v2, v12

    .line 120
    :cond_3
    if-eqz v2, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v11}, La/xy40;->i(I)V

    .line 123
    .line 124
    .line 125
    :cond_4
    return v2

    .line 126
    :cond_5
    add-int/lit8 v6, v6, 0x8

    .line 127
    .line 128
    add-int/2addr v3, v6

    .line 129
    and-int/2addr v3, v5

    .line 130
    goto :goto_1
.end method

.method public final hashCode()I
    .locals 15

    .line 1
    iget v0, p0, La/xy40;->f:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, La/xy40;->g:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    iget-object v1, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, La/xy40;->a:[J

    .line 11
    .line 12
    array-length v3, v2

    .line 13
    add-int/lit8 v3, v3, -0x2

    .line 14
    .line 15
    if-ltz v3, :cond_5

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    aget-wide v6, v2, v5

    .line 20
    .line 21
    not-long v8, v6

    .line 22
    const/4 v10, 0x7

    .line 23
    shl-long/2addr v8, v10

    .line 24
    and-long/2addr v8, v6

    .line 25
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v8, v10

    .line 31
    cmp-long v8, v8, v10

    .line 32
    .line 33
    if-eqz v8, :cond_4

    .line 34
    .line 35
    sub-int v8, v5, v3

    .line 36
    .line 37
    not-int v8, v8

    .line 38
    ushr-int/lit8 v8, v8, 0x1f

    .line 39
    .line 40
    const/16 v9, 0x8

    .line 41
    .line 42
    rsub-int/lit8 v8, v8, 0x8

    .line 43
    .line 44
    move v10, v4

    .line 45
    :goto_1
    if-ge v10, v8, :cond_2

    .line 46
    .line 47
    const-wide/16 v11, 0xff

    .line 48
    .line 49
    and-long/2addr v11, v6

    .line 50
    const-wide/16 v13, 0x80

    .line 51
    .line 52
    cmp-long v11, v11, v13

    .line 53
    .line 54
    if-gez v11, :cond_1

    .line 55
    .line 56
    shl-int/lit8 v11, v5, 0x3

    .line 57
    .line 58
    add-int/2addr v11, v10

    .line 59
    aget-object v11, v1, v11

    .line 60
    .line 61
    invoke-static {v11, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    if-nez v12, :cond_1

    .line 66
    .line 67
    if-eqz v11, :cond_0

    .line 68
    .line 69
    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    goto :goto_2

    .line 74
    :cond_0
    move v11, v4

    .line 75
    :goto_2
    add-int/2addr v0, v11

    .line 76
    :cond_1
    shr-long/2addr v6, v9

    .line 77
    add-int/lit8 v10, v10, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    if-ne v8, v9, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    return v0

    .line 84
    :cond_4
    :goto_3
    if-eq v5, v3, :cond_5

    .line 85
    .line 86
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    return v0
.end method

.method public final i(I)V
    .locals 12

    .line 1
    iget v0, p0, La/xy40;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, La/xy40;->g:I

    .line 6
    .line 7
    iget-object v0, p0, La/xy40;->a:[J

    .line 8
    .line 9
    iget v1, p0, La/xy40;->f:I

    .line 10
    .line 11
    shr-int/lit8 v2, p1, 0x3

    .line 12
    .line 13
    and-int/lit8 v3, p1, 0x7

    .line 14
    .line 15
    shl-int/lit8 v3, v3, 0x3

    .line 16
    .line 17
    aget-wide v4, v0, v2

    .line 18
    .line 19
    const-wide/16 v6, 0xff

    .line 20
    .line 21
    shl-long/2addr v6, v3

    .line 22
    not-long v6, v6

    .line 23
    and-long/2addr v4, v6

    .line 24
    const-wide/16 v6, 0xfe

    .line 25
    .line 26
    shl-long/2addr v6, v3

    .line 27
    or-long v3, v4, v6

    .line 28
    .line 29
    aput-wide v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 v2, p1, -0x7

    .line 32
    .line 33
    and-int/2addr v2, v1

    .line 34
    and-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    add-int/2addr v2, v1

    .line 37
    shr-int/lit8 v1, v2, 0x3

    .line 38
    .line 39
    aput-wide v3, v0, v1

    .line 40
    .line 41
    iget-object v0, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    aput-object v1, v0, p1

    .line 45
    .line 46
    iget-object v0, p0, La/xy40;->c:[J

    .line 47
    .line 48
    aget-wide v1, v0, p1

    .line 49
    .line 50
    const/16 v3, 0x1f

    .line 51
    .line 52
    shr-long v4, v1, v3

    .line 53
    .line 54
    const-wide/32 v6, 0x7fffffff

    .line 55
    .line 56
    .line 57
    and-long/2addr v4, v6

    .line 58
    long-to-int v4, v4

    .line 59
    and-long/2addr v1, v6

    .line 60
    long-to-int v1, v1

    .line 61
    const v2, 0x7fffffff

    .line 62
    .line 63
    .line 64
    if-eq v4, v2, :cond_0

    .line 65
    .line 66
    aget-wide v8, v0, v4

    .line 67
    .line 68
    const-wide/32 v10, -0x80000000

    .line 69
    .line 70
    .line 71
    and-long/2addr v8, v10

    .line 72
    int-to-long v10, v1

    .line 73
    and-long/2addr v10, v6

    .line 74
    or-long/2addr v8, v10

    .line 75
    aput-wide v8, v0, v4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iput v1, p0, La/xy40;->d:I

    .line 79
    .line 80
    :goto_0
    if-eq v1, v2, :cond_1

    .line 81
    .line 82
    aget-wide v8, v0, v1

    .line 83
    .line 84
    const-wide v10, -0x3fffffff80000001L    # -2.000000953674316

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v8, v10

    .line 90
    int-to-long v4, v4

    .line 91
    and-long/2addr v4, v6

    .line 92
    shl-long v2, v4, v3

    .line 93
    .line 94
    or-long/2addr v2, v8

    .line 95
    aput-wide v2, v0, v1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    iput v4, p0, La/xy40;->e:I

    .line 99
    .line 100
    :goto_1
    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    aput-wide v1, v0, p1

    .line 106
    .line 107
    return-void
.end method

.method public final j(Ljava/util/Collection;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, La/xy40;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iget v2, v0, La/xy40;->g:I

    .line 9
    .line 10
    iget-object v3, v0, La/xy40;->a:[J

    .line 11
    .line 12
    array-length v4, v3

    .line 13
    add-int/lit8 v4, v4, -0x2

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-ltz v4, :cond_3

    .line 17
    .line 18
    move v6, v5

    .line 19
    :goto_0
    aget-wide v7, v3, v6

    .line 20
    .line 21
    not-long v9, v7

    .line 22
    const/4 v11, 0x7

    .line 23
    shl-long/2addr v9, v11

    .line 24
    and-long/2addr v9, v7

    .line 25
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v9, v11

    .line 31
    cmp-long v9, v9, v11

    .line 32
    .line 33
    if-eqz v9, :cond_2

    .line 34
    .line 35
    sub-int v9, v6, v4

    .line 36
    .line 37
    not-int v9, v9

    .line 38
    ushr-int/lit8 v9, v9, 0x1f

    .line 39
    .line 40
    const/16 v10, 0x8

    .line 41
    .line 42
    rsub-int/lit8 v9, v9, 0x8

    .line 43
    .line 44
    move v11, v5

    .line 45
    :goto_1
    if-ge v11, v9, :cond_1

    .line 46
    .line 47
    const-wide/16 v12, 0xff

    .line 48
    .line 49
    and-long/2addr v12, v7

    .line 50
    const-wide/16 v14, 0x80

    .line 51
    .line 52
    cmp-long v12, v12, v14

    .line 53
    .line 54
    if-gez v12, :cond_0

    .line 55
    .line 56
    shl-int/lit8 v12, v6, 0x3

    .line 57
    .line 58
    add-int/2addr v12, v11

    .line 59
    move-object/from16 v13, p1

    .line 60
    .line 61
    check-cast v13, Ljava/lang/Iterable;

    .line 62
    .line 63
    aget-object v14, v1, v12

    .line 64
    .line 65
    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-nez v13, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0, v12}, La/xy40;->i(I)V

    .line 72
    .line 73
    .line 74
    :cond_0
    shr-long/2addr v7, v10

    .line 75
    add-int/lit8 v11, v11, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    if-ne v9, v10, :cond_3

    .line 79
    .line 80
    :cond_2
    if-eq v6, v4, :cond_3

    .line 81
    .line 82
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget v0, v0, La/xy40;->g:I

    .line 86
    .line 87
    if-eq v2, v0, :cond_4

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    return v0

    .line 91
    :cond_4
    return v5
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/xy40;->b:[Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, La/xy40;->c:[J

    .line 11
    .line 12
    iget v3, p0, La/xy40;->e:I

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    :goto_0
    const v5, 0x7fffffff

    .line 16
    .line 17
    .line 18
    if-eq v3, v5, :cond_3

    .line 19
    .line 20
    aget-wide v5, v2, v3

    .line 21
    .line 22
    const/16 v7, 0x1f

    .line 23
    .line 24
    shr-long/2addr v5, v7

    .line 25
    const-wide/32 v7, 0x7fffffff

    .line 26
    .line 27
    .line 28
    and-long/2addr v5, v7

    .line 29
    long-to-int v5, v5

    .line 30
    aget-object v3, v1, v3

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const-string v6, ", "

    .line 35
    .line 36
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_0
    const/4 v6, -0x1

    .line 40
    if-ne v4, v6, :cond_1

    .line 41
    .line 42
    const-string p0, "..."

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    if-ne v3, p0, :cond_2

    .line 49
    .line 50
    const-string v3, "(this)"

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    :goto_2
    const-string p0, "]"

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
