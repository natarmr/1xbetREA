.class public final La/qy40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[Ljava/lang/Object;

.field public c:[F

.field public d:I

.field public e:I

.field public f:I


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
    iput-object v0, p0, La/qy40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, La/qy40;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    sget-object v0, La/llq;->a:[F

    .line 13
    .line 14
    iput-object v0, p0, La/qy40;->c:[F

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, La/qy40;->d(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "Capacity must be a positive value."

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method


# virtual methods
.method public final a(I)I
    .locals 9

    .line 1
    iget v0, p0, La/qy40;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/qy40;->a:[J

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

.method public final b(Ljava/lang/Object;)I
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    ushr-int/lit8 v2, v1, 0x10

    .line 11
    .line 12
    xor-int/2addr v1, v2

    .line 13
    const v2, -0x3361d2af    # -8.293031E7f

    .line 14
    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    ushr-int/lit8 v2, v1, 0x10

    .line 18
    .line 19
    xor-int/2addr v1, v2

    .line 20
    and-int/lit8 v2, v1, 0x7f

    .line 21
    .line 22
    iget v3, p0, La/qy40;->d:I

    .line 23
    .line 24
    ushr-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    :goto_1
    and-int/2addr v1, v3

    .line 27
    iget-object v4, p0, La/qy40;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v5, v1, 0x3

    .line 30
    .line 31
    and-int/lit8 v6, v1, 0x7

    .line 32
    .line 33
    shl-int/lit8 v6, v6, 0x3

    .line 34
    .line 35
    aget-wide v7, v4, v5

    .line 36
    .line 37
    ushr-long/2addr v7, v6

    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    aget-wide v9, v4, v5

    .line 41
    .line 42
    rsub-int/lit8 v4, v6, 0x40

    .line 43
    .line 44
    shl-long v4, v9, v4

    .line 45
    .line 46
    int-to-long v9, v6

    .line 47
    neg-long v9, v9

    .line 48
    const/16 v6, 0x3f

    .line 49
    .line 50
    shr-long/2addr v9, v6

    .line 51
    and-long/2addr v4, v9

    .line 52
    or-long/2addr v4, v7

    .line 53
    int-to-long v6, v2

    .line 54
    const-wide v8, 0x101010101010101L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-long/2addr v6, v8

    .line 60
    xor-long/2addr v6, v4

    .line 61
    sub-long v8, v6, v8

    .line 62
    .line 63
    not-long v6, v6

    .line 64
    and-long/2addr v6, v8

    .line 65
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v6, v8

    .line 71
    :goto_2
    const-wide/16 v10, 0x0

    .line 72
    .line 73
    cmp-long v12, v6, v10

    .line 74
    .line 75
    if-eqz v12, :cond_2

    .line 76
    .line 77
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    shr-int/lit8 v10, v10, 0x3

    .line 82
    .line 83
    add-int/2addr v10, v1

    .line 84
    and-int/2addr v10, v3

    .line 85
    iget-object v11, p0, La/qy40;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v11, v11, v10

    .line 88
    .line 89
    invoke-static {v11, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-eqz v11, :cond_1

    .line 94
    .line 95
    return v10

    .line 96
    :cond_1
    const-wide/16 v10, 0x1

    .line 97
    .line 98
    sub-long v10, v6, v10

    .line 99
    .line 100
    and-long/2addr v6, v10

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    not-long v6, v4

    .line 103
    const/4 v12, 0x6

    .line 104
    shl-long/2addr v6, v12

    .line 105
    and-long/2addr v4, v6

    .line 106
    and-long/2addr v4, v8

    .line 107
    cmp-long v4, v4, v10

    .line 108
    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    const/4 p0, -0x1

    .line 112
    return p0

    .line 113
    :cond_3
    add-int/lit8 v0, v0, 0x8

    .line 114
    .line 115
    add-int/2addr v1, v0

    .line 116
    goto :goto_1
.end method

.method public final c(Ljava/lang/Object;)F
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/qy40;->b(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/qy40;->c:[F

    .line 8
    .line 9
    aget p0, p0, v0

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const-string p0, "There is no key "

    .line 13
    .line 14
    const-string v0, " in the map"

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, La/f140;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final d(I)V
    .locals 9

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
    iput p1, p0, La/qy40;->d:I

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    sget-object v0, La/u1h0;->a:[J

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
    move-object v0, v2

    .line 39
    :goto_1
    iput-object v0, p0, La/qy40;->a:[J

    .line 40
    .line 41
    shr-int/lit8 v1, p1, 0x3

    .line 42
    .line 43
    and-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    shl-int/lit8 v2, v2, 0x3

    .line 46
    .line 47
    aget-wide v3, v0, v1

    .line 48
    .line 49
    const-wide/16 v5, 0xff

    .line 50
    .line 51
    shl-long/2addr v5, v2

    .line 52
    not-long v7, v5

    .line 53
    and-long v2, v3, v7

    .line 54
    .line 55
    or-long/2addr v2, v5

    .line 56
    aput-wide v2, v0, v1

    .line 57
    .line 58
    iget v0, p0, La/qy40;->d:I

    .line 59
    .line 60
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, La/qy40;->e:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    iput v0, p0, La/qy40;->f:I

    .line 68
    .line 69
    new-array v0, p1, [Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v0, p0, La/qy40;->b:[Ljava/lang/Object;

    .line 72
    .line 73
    new-array p1, p1, [F

    .line 74
    .line 75
    iput-object p1, p0, La/qy40;->c:[F

    .line 76
    .line 77
    return-void
.end method

.method public final e(La/h63;F)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, La/h63;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    ushr-int/lit8 v3, v2, 0x10

    .line 10
    .line 11
    xor-int/2addr v2, v3

    .line 12
    const v3, -0x3361d2af    # -8.293031E7f

    .line 13
    .line 14
    .line 15
    mul-int/2addr v2, v3

    .line 16
    ushr-int/lit8 v4, v2, 0x10

    .line 17
    .line 18
    xor-int/2addr v2, v4

    .line 19
    ushr-int/lit8 v4, v2, 0x7

    .line 20
    .line 21
    and-int/lit8 v2, v2, 0x7f

    .line 22
    .line 23
    iget v5, v0, La/qy40;->d:I

    .line 24
    .line 25
    and-int v6, v4, v5

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    :goto_0
    iget-object v9, v0, La/qy40;->a:[J

    .line 29
    .line 30
    shr-int/lit8 v10, v6, 0x3

    .line 31
    .line 32
    and-int/lit8 v11, v6, 0x7

    .line 33
    .line 34
    shl-int/lit8 v11, v11, 0x3

    .line 35
    .line 36
    aget-wide v12, v9, v10

    .line 37
    .line 38
    ushr-long/2addr v12, v11

    .line 39
    const/4 v14, 0x1

    .line 40
    add-int/2addr v10, v14

    .line 41
    aget-wide v15, v9, v10

    .line 42
    .line 43
    rsub-int/lit8 v9, v11, 0x40

    .line 44
    .line 45
    shl-long v9, v15, v9

    .line 46
    .line 47
    move/from16 v16, v8

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    int-to-long v7, v11

    .line 51
    neg-long v7, v7

    .line 52
    const/16 v11, 0x3f

    .line 53
    .line 54
    shr-long/2addr v7, v11

    .line 55
    and-long/2addr v7, v9

    .line 56
    or-long/2addr v7, v12

    .line 57
    int-to-long v9, v2

    .line 58
    const-wide v11, 0x101010101010101L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    mul-long v17, v9, v11

    .line 64
    .line 65
    move-wide/from16 v19, v11

    .line 66
    .line 67
    xor-long v11, v7, v17

    .line 68
    .line 69
    sub-long v17, v11, v19

    .line 70
    .line 71
    not-long v11, v11

    .line 72
    and-long v11, v17, v11

    .line 73
    .line 74
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long v11, v11, v17

    .line 80
    .line 81
    :goto_1
    const-wide/16 v19, 0x0

    .line 82
    .line 83
    cmp-long v13, v11, v19

    .line 84
    .line 85
    if-eqz v13, :cond_1

    .line 86
    .line 87
    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    shr-int/lit8 v13, v13, 0x3

    .line 92
    .line 93
    add-int/2addr v13, v6

    .line 94
    and-int/2addr v13, v5

    .line 95
    move/from16 v21, v3

    .line 96
    .line 97
    iget-object v3, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 98
    .line 99
    aget-object v3, v3, v13

    .line 100
    .line 101
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_0

    .line 106
    .line 107
    goto/16 :goto_e

    .line 108
    .line 109
    :cond_0
    const-wide/16 v19, 0x1

    .line 110
    .line 111
    sub-long v19, v11, v19

    .line 112
    .line 113
    and-long v11, v11, v19

    .line 114
    .line 115
    move/from16 v3, v21

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    move/from16 v21, v3

    .line 119
    .line 120
    not-long v11, v7

    .line 121
    const/4 v3, 0x6

    .line 122
    shl-long/2addr v11, v3

    .line 123
    and-long/2addr v7, v11

    .line 124
    and-long v7, v7, v17

    .line 125
    .line 126
    cmp-long v3, v7, v19

    .line 127
    .line 128
    const/16 v7, 0x8

    .line 129
    .line 130
    if-eqz v3, :cond_12

    .line 131
    .line 132
    invoke-virtual {v0, v4}, La/qy40;->a(I)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    iget v3, v0, La/qy40;->f:I

    .line 137
    .line 138
    const-wide/16 v11, 0xff

    .line 139
    .line 140
    if-nez v3, :cond_2

    .line 141
    .line 142
    iget-object v3, v0, La/qy40;->a:[J

    .line 143
    .line 144
    shr-int/lit8 v13, v2, 0x3

    .line 145
    .line 146
    aget-wide v19, v3, v13

    .line 147
    .line 148
    and-int/lit8 v3, v2, 0x7

    .line 149
    .line 150
    shl-int/lit8 v3, v3, 0x3

    .line 151
    .line 152
    shr-long v19, v19, v3

    .line 153
    .line 154
    and-long v19, v19, v11

    .line 155
    .line 156
    const-wide/16 v22, 0xfe

    .line 157
    .line 158
    cmp-long v3, v19, v22

    .line 159
    .line 160
    if-nez v3, :cond_3

    .line 161
    .line 162
    :cond_2
    move-wide/from16 v29, v9

    .line 163
    .line 164
    move-wide/from16 v27, v11

    .line 165
    .line 166
    move/from16 v18, v14

    .line 167
    .line 168
    move/from16 v32, v15

    .line 169
    .line 170
    const-wide/16 v19, 0x80

    .line 171
    .line 172
    const/16 v31, 0x7

    .line 173
    .line 174
    goto/16 :goto_d

    .line 175
    .line 176
    :cond_3
    iget v2, v0, La/qy40;->d:I

    .line 177
    .line 178
    if-le v2, v7, :cond_c

    .line 179
    .line 180
    iget v3, v0, La/qy40;->e:I

    .line 181
    .line 182
    const-wide/16 v19, 0x80

    .line 183
    .line 184
    int-to-long v5, v3

    .line 185
    sget-object v3, La/h2t0;->b:La/g2t0;

    .line 186
    .line 187
    const-wide/16 v24, 0x20

    .line 188
    .line 189
    mul-long v5, v5, v24

    .line 190
    .line 191
    int-to-long v2, v2

    .line 192
    const-wide/16 v24, 0x19

    .line 193
    .line 194
    mul-long v2, v2, v24

    .line 195
    .line 196
    const-wide/high16 v24, -0x8000000000000000L

    .line 197
    .line 198
    xor-long v5, v5, v24

    .line 199
    .line 200
    xor-long v2, v2, v24

    .line 201
    .line 202
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-gtz v2, :cond_b

    .line 207
    .line 208
    iget-object v2, v0, La/qy40;->a:[J

    .line 209
    .line 210
    iget v3, v0, La/qy40;->d:I

    .line 211
    .line 212
    iget-object v5, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 213
    .line 214
    iget-object v6, v0, La/qy40;->c:[F

    .line 215
    .line 216
    add-int/lit8 v13, v3, 0x7

    .line 217
    .line 218
    shr-int/lit8 v13, v13, 0x3

    .line 219
    .line 220
    move/from16 v26, v7

    .line 221
    .line 222
    move v7, v15

    .line 223
    :goto_2
    if-ge v7, v13, :cond_4

    .line 224
    .line 225
    aget-wide v27, v2, v7

    .line 226
    .line 227
    move-wide/from16 v29, v9

    .line 228
    .line 229
    const/4 v10, 0x7

    .line 230
    and-long v8, v27, v17

    .line 231
    .line 232
    move-wide/from16 v27, v11

    .line 233
    .line 234
    move v12, v10

    .line 235
    not-long v10, v8

    .line 236
    ushr-long/2addr v8, v12

    .line 237
    add-long/2addr v10, v8

    .line 238
    const-wide v8, -0x101010101010102L

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    and-long/2addr v8, v10

    .line 244
    aput-wide v8, v2, v7

    .line 245
    .line 246
    add-int/lit8 v7, v7, 0x1

    .line 247
    .line 248
    move-wide/from16 v11, v27

    .line 249
    .line 250
    move-wide/from16 v9, v29

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_4
    move-wide/from16 v29, v9

    .line 254
    .line 255
    move-wide/from16 v27, v11

    .line 256
    .line 257
    const/4 v12, 0x7

    .line 258
    invoke-static {v2}, La/tx3;->D([J)I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    add-int/lit8 v8, v7, -0x1

    .line 263
    .line 264
    aget-wide v9, v2, v8

    .line 265
    .line 266
    const-wide v16, 0xffffffffffffffL

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    and-long v9, v9, v16

    .line 272
    .line 273
    const-wide/high16 v31, -0x100000000000000L

    .line 274
    .line 275
    or-long v9, v9, v31

    .line 276
    .line 277
    aput-wide v9, v2, v8

    .line 278
    .line 279
    aget-wide v8, v2, v15

    .line 280
    .line 281
    aput-wide v8, v2, v7

    .line 282
    .line 283
    move v7, v15

    .line 284
    :goto_3
    if-eq v7, v3, :cond_a

    .line 285
    .line 286
    shr-int/lit8 v8, v7, 0x3

    .line 287
    .line 288
    aget-wide v9, v2, v8

    .line 289
    .line 290
    and-int/lit8 v11, v7, 0x7

    .line 291
    .line 292
    shl-int/lit8 v11, v11, 0x3

    .line 293
    .line 294
    shr-long/2addr v9, v11

    .line 295
    and-long v9, v9, v27

    .line 296
    .line 297
    cmp-long v13, v9, v19

    .line 298
    .line 299
    if-nez v13, :cond_5

    .line 300
    .line 301
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_5
    cmp-long v9, v9, v22

    .line 305
    .line 306
    if-eqz v9, :cond_6

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_6
    aget-object v9, v5, v7

    .line 310
    .line 311
    if-eqz v9, :cond_7

    .line 312
    .line 313
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    goto :goto_5

    .line 318
    :cond_7
    move v9, v15

    .line 319
    :goto_5
    ushr-int/lit8 v10, v9, 0x10

    .line 320
    .line 321
    xor-int/2addr v9, v10

    .line 322
    mul-int v9, v9, v21

    .line 323
    .line 324
    ushr-int/lit8 v10, v9, 0x10

    .line 325
    .line 326
    xor-int/2addr v9, v10

    .line 327
    ushr-int/lit8 v10, v9, 0x7

    .line 328
    .line 329
    invoke-virtual {v0, v10}, La/qy40;->a(I)I

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    and-int/2addr v10, v3

    .line 334
    sub-int v18, v13, v10

    .line 335
    .line 336
    and-int v18, v18, v3

    .line 337
    .line 338
    move/from16 v31, v12

    .line 339
    .line 340
    div-int/lit8 v12, v18, 0x8

    .line 341
    .line 342
    sub-int v10, v7, v10

    .line 343
    .line 344
    and-int/2addr v10, v3

    .line 345
    div-int/lit8 v10, v10, 0x8

    .line 346
    .line 347
    if-ne v12, v10, :cond_8

    .line 348
    .line 349
    and-int/lit8 v9, v9, 0x7f

    .line 350
    .line 351
    int-to-long v9, v9

    .line 352
    aget-wide v12, v2, v8

    .line 353
    .line 354
    move/from16 v18, v14

    .line 355
    .line 356
    move/from16 v32, v15

    .line 357
    .line 358
    shl-long v14, v27, v11

    .line 359
    .line 360
    not-long v14, v14

    .line 361
    and-long/2addr v12, v14

    .line 362
    shl-long/2addr v9, v11

    .line 363
    or-long/2addr v9, v12

    .line 364
    aput-wide v9, v2, v8

    .line 365
    .line 366
    array-length v8, v2

    .line 367
    add-int/lit8 v8, v8, -0x1

    .line 368
    .line 369
    aget-wide v9, v2, v32

    .line 370
    .line 371
    and-long v9, v9, v16

    .line 372
    .line 373
    or-long v9, v9, v24

    .line 374
    .line 375
    aput-wide v9, v2, v8

    .line 376
    .line 377
    add-int/lit8 v7, v7, 0x1

    .line 378
    .line 379
    move/from16 v14, v18

    .line 380
    .line 381
    move/from16 v12, v31

    .line 382
    .line 383
    move/from16 v15, v32

    .line 384
    .line 385
    goto :goto_3

    .line 386
    :cond_8
    move/from16 v18, v14

    .line 387
    .line 388
    move/from16 v32, v15

    .line 389
    .line 390
    shr-int/lit8 v10, v13, 0x3

    .line 391
    .line 392
    aget-wide v14, v2, v10

    .line 393
    .line 394
    and-int/lit8 v12, v13, 0x7

    .line 395
    .line 396
    shl-int/lit8 v12, v12, 0x3

    .line 397
    .line 398
    shr-long v33, v14, v12

    .line 399
    .line 400
    and-long v33, v33, v27

    .line 401
    .line 402
    cmp-long v33, v33, v19

    .line 403
    .line 404
    if-nez v33, :cond_9

    .line 405
    .line 406
    and-int/lit8 v9, v9, 0x7f

    .line 407
    .line 408
    move-object/from16 v33, v5

    .line 409
    .line 410
    move-object/from16 v34, v6

    .line 411
    .line 412
    int-to-long v5, v9

    .line 413
    move-wide/from16 v35, v5

    .line 414
    .line 415
    shl-long v5, v27, v12

    .line 416
    .line 417
    not-long v5, v5

    .line 418
    and-long/2addr v5, v14

    .line 419
    shl-long v14, v35, v12

    .line 420
    .line 421
    or-long/2addr v5, v14

    .line 422
    aput-wide v5, v2, v10

    .line 423
    .line 424
    aget-wide v5, v2, v8

    .line 425
    .line 426
    shl-long v9, v27, v11

    .line 427
    .line 428
    not-long v9, v9

    .line 429
    and-long/2addr v5, v9

    .line 430
    shl-long v9, v19, v11

    .line 431
    .line 432
    or-long/2addr v5, v9

    .line 433
    aput-wide v5, v2, v8

    .line 434
    .line 435
    aget-object v5, v33, v7

    .line 436
    .line 437
    aput-object v5, v33, v13

    .line 438
    .line 439
    const/4 v5, 0x0

    .line 440
    aput-object v5, v33, v7

    .line 441
    .line 442
    aget v5, v34, v7

    .line 443
    .line 444
    aput v5, v34, v13

    .line 445
    .line 446
    const/4 v5, 0x0

    .line 447
    aput v5, v34, v7

    .line 448
    .line 449
    goto :goto_6

    .line 450
    :cond_9
    move-object/from16 v33, v5

    .line 451
    .line 452
    move-object/from16 v34, v6

    .line 453
    .line 454
    and-int/lit8 v5, v9, 0x7f

    .line 455
    .line 456
    int-to-long v5, v5

    .line 457
    shl-long v8, v27, v12

    .line 458
    .line 459
    not-long v8, v8

    .line 460
    and-long/2addr v8, v14

    .line 461
    shl-long/2addr v5, v12

    .line 462
    or-long/2addr v5, v8

    .line 463
    aput-wide v5, v2, v10

    .line 464
    .line 465
    aget-object v5, v33, v13

    .line 466
    .line 467
    aget-object v6, v33, v7

    .line 468
    .line 469
    aput-object v6, v33, v13

    .line 470
    .line 471
    aput-object v5, v33, v7

    .line 472
    .line 473
    aget v5, v34, v13

    .line 474
    .line 475
    aget v6, v34, v7

    .line 476
    .line 477
    aput v6, v34, v13

    .line 478
    .line 479
    aput v5, v34, v7

    .line 480
    .line 481
    add-int/lit8 v7, v7, -0x1

    .line 482
    .line 483
    :goto_6
    array-length v5, v2

    .line 484
    add-int/lit8 v5, v5, -0x1

    .line 485
    .line 486
    aget-wide v8, v2, v32

    .line 487
    .line 488
    and-long v8, v8, v16

    .line 489
    .line 490
    or-long v8, v8, v24

    .line 491
    .line 492
    aput-wide v8, v2, v5

    .line 493
    .line 494
    add-int/lit8 v7, v7, 0x1

    .line 495
    .line 496
    move/from16 v14, v18

    .line 497
    .line 498
    move/from16 v12, v31

    .line 499
    .line 500
    move/from16 v15, v32

    .line 501
    .line 502
    move-object/from16 v5, v33

    .line 503
    .line 504
    move-object/from16 v6, v34

    .line 505
    .line 506
    goto/16 :goto_3

    .line 507
    .line 508
    :cond_a
    move/from16 v31, v12

    .line 509
    .line 510
    move/from16 v18, v14

    .line 511
    .line 512
    move/from16 v32, v15

    .line 513
    .line 514
    iget v2, v0, La/qy40;->d:I

    .line 515
    .line 516
    invoke-static {v2}, La/u1h0;->a(I)I

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    iget v3, v0, La/qy40;->e:I

    .line 521
    .line 522
    sub-int/2addr v2, v3

    .line 523
    iput v2, v0, La/qy40;->f:I

    .line 524
    .line 525
    goto/16 :goto_c

    .line 526
    .line 527
    :cond_b
    :goto_7
    move-wide/from16 v29, v9

    .line 528
    .line 529
    move-wide/from16 v27, v11

    .line 530
    .line 531
    move/from16 v18, v14

    .line 532
    .line 533
    move/from16 v32, v15

    .line 534
    .line 535
    const/16 v31, 0x7

    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_c
    const-wide/16 v19, 0x80

    .line 539
    .line 540
    goto :goto_7

    .line 541
    :goto_8
    iget v2, v0, La/qy40;->d:I

    .line 542
    .line 543
    invoke-static {v2}, La/u1h0;->b(I)I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    iget-object v3, v0, La/qy40;->a:[J

    .line 548
    .line 549
    iget-object v5, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 550
    .line 551
    iget-object v6, v0, La/qy40;->c:[F

    .line 552
    .line 553
    iget v7, v0, La/qy40;->d:I

    .line 554
    .line 555
    invoke-virtual {v0, v2}, La/qy40;->d(I)V

    .line 556
    .line 557
    .line 558
    iget-object v2, v0, La/qy40;->a:[J

    .line 559
    .line 560
    iget-object v8, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 561
    .line 562
    iget-object v9, v0, La/qy40;->c:[F

    .line 563
    .line 564
    iget v10, v0, La/qy40;->d:I

    .line 565
    .line 566
    move/from16 v11, v32

    .line 567
    .line 568
    :goto_9
    if-ge v11, v7, :cond_f

    .line 569
    .line 570
    shr-int/lit8 v12, v11, 0x3

    .line 571
    .line 572
    aget-wide v12, v3, v12

    .line 573
    .line 574
    and-int/lit8 v14, v11, 0x7

    .line 575
    .line 576
    shl-int/lit8 v14, v14, 0x3

    .line 577
    .line 578
    shr-long/2addr v12, v14

    .line 579
    and-long v12, v12, v27

    .line 580
    .line 581
    cmp-long v12, v12, v19

    .line 582
    .line 583
    if-gez v12, :cond_e

    .line 584
    .line 585
    aget-object v12, v5, v11

    .line 586
    .line 587
    if-eqz v12, :cond_d

    .line 588
    .line 589
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 590
    .line 591
    .line 592
    move-result v13

    .line 593
    goto :goto_a

    .line 594
    :cond_d
    move/from16 v13, v32

    .line 595
    .line 596
    :goto_a
    ushr-int/lit8 v14, v13, 0x10

    .line 597
    .line 598
    xor-int/2addr v13, v14

    .line 599
    mul-int v13, v13, v21

    .line 600
    .line 601
    ushr-int/lit8 v14, v13, 0x10

    .line 602
    .line 603
    xor-int/2addr v13, v14

    .line 604
    ushr-int/lit8 v14, v13, 0x7

    .line 605
    .line 606
    invoke-virtual {v0, v14}, La/qy40;->a(I)I

    .line 607
    .line 608
    .line 609
    move-result v14

    .line 610
    and-int/lit8 v13, v13, 0x7f

    .line 611
    .line 612
    move-object v15, v2

    .line 613
    int-to-long v1, v13

    .line 614
    shr-int/lit8 v13, v14, 0x3

    .line 615
    .line 616
    and-int/lit8 v16, v14, 0x7

    .line 617
    .line 618
    shl-int/lit8 v16, v16, 0x3

    .line 619
    .line 620
    aget-wide v22, v15, v13

    .line 621
    .line 622
    move-wide/from16 v24, v1

    .line 623
    .line 624
    shl-long v1, v27, v16

    .line 625
    .line 626
    not-long v1, v1

    .line 627
    and-long v1, v22, v1

    .line 628
    .line 629
    shl-long v16, v24, v16

    .line 630
    .line 631
    or-long v1, v1, v16

    .line 632
    .line 633
    aput-wide v1, v15, v13

    .line 634
    .line 635
    add-int/lit8 v13, v14, -0x7

    .line 636
    .line 637
    and-int/2addr v13, v10

    .line 638
    and-int/lit8 v16, v10, 0x7

    .line 639
    .line 640
    add-int v13, v13, v16

    .line 641
    .line 642
    shr-int/lit8 v13, v13, 0x3

    .line 643
    .line 644
    aput-wide v1, v15, v13

    .line 645
    .line 646
    aput-object v12, v8, v14

    .line 647
    .line 648
    aget v1, v6, v11

    .line 649
    .line 650
    aput v1, v9, v14

    .line 651
    .line 652
    goto :goto_b

    .line 653
    :cond_e
    move-object v15, v2

    .line 654
    :goto_b
    add-int/lit8 v11, v11, 0x1

    .line 655
    .line 656
    move-object/from16 v1, p1

    .line 657
    .line 658
    move-object v2, v15

    .line 659
    goto :goto_9

    .line 660
    :cond_f
    :goto_c
    invoke-virtual {v0, v4}, La/qy40;->a(I)I

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    :goto_d
    iget v1, v0, La/qy40;->e:I

    .line 665
    .line 666
    add-int/lit8 v1, v1, 0x1

    .line 667
    .line 668
    iput v1, v0, La/qy40;->e:I

    .line 669
    .line 670
    iget v1, v0, La/qy40;->f:I

    .line 671
    .line 672
    iget-object v3, v0, La/qy40;->a:[J

    .line 673
    .line 674
    shr-int/lit8 v4, v2, 0x3

    .line 675
    .line 676
    aget-wide v5, v3, v4

    .line 677
    .line 678
    and-int/lit8 v7, v2, 0x7

    .line 679
    .line 680
    shl-int/lit8 v7, v7, 0x3

    .line 681
    .line 682
    shr-long v8, v5, v7

    .line 683
    .line 684
    and-long v8, v8, v27

    .line 685
    .line 686
    cmp-long v8, v8, v19

    .line 687
    .line 688
    if-nez v8, :cond_10

    .line 689
    .line 690
    move/from16 v32, v18

    .line 691
    .line 692
    :cond_10
    sub-int v1, v1, v32

    .line 693
    .line 694
    iput v1, v0, La/qy40;->f:I

    .line 695
    .line 696
    iget v1, v0, La/qy40;->d:I

    .line 697
    .line 698
    shl-long v8, v27, v7

    .line 699
    .line 700
    not-long v8, v8

    .line 701
    and-long/2addr v5, v8

    .line 702
    shl-long v7, v29, v7

    .line 703
    .line 704
    or-long/2addr v5, v7

    .line 705
    aput-wide v5, v3, v4

    .line 706
    .line 707
    add-int/lit8 v4, v2, -0x7

    .line 708
    .line 709
    and-int/2addr v4, v1

    .line 710
    and-int/lit8 v1, v1, 0x7

    .line 711
    .line 712
    add-int/2addr v4, v1

    .line 713
    shr-int/lit8 v1, v4, 0x3

    .line 714
    .line 715
    aput-wide v5, v3, v1

    .line 716
    .line 717
    not-int v13, v2

    .line 718
    :goto_e
    if-gez v13, :cond_11

    .line 719
    .line 720
    not-int v13, v13

    .line 721
    :cond_11
    iget-object v1, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 722
    .line 723
    aput-object p1, v1, v13

    .line 724
    .line 725
    iget-object v0, v0, La/qy40;->c:[F

    .line 726
    .line 727
    aput p2, v0, v13

    .line 728
    .line 729
    return-void

    .line 730
    :cond_12
    move/from16 v26, v7

    .line 731
    .line 732
    move/from16 v32, v15

    .line 733
    .line 734
    add-int/lit8 v8, v16, 0x8

    .line 735
    .line 736
    add-int/2addr v6, v8

    .line 737
    and-int/2addr v6, v5

    .line 738
    move-object/from16 v1, p1

    .line 739
    .line 740
    move/from16 v3, v21

    .line 741
    .line 742
    goto/16 :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, La/qy40;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, La/qy40;

    .line 16
    .line 17
    iget v3, v1, La/qy40;->e:I

    .line 18
    .line 19
    iget v5, v0, La/qy40;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v5, v0, La/qy40;->c:[F

    .line 27
    .line 28
    iget-object v0, v0, La/qy40;->a:[J

    .line 29
    .line 30
    array-length v6, v0

    .line 31
    add-int/lit8 v6, v6, -0x2

    .line 32
    .line 33
    if-ltz v6, :cond_7

    .line 34
    .line 35
    move v7, v4

    .line 36
    :goto_0
    aget-wide v8, v0, v7

    .line 37
    .line 38
    not-long v10, v8

    .line 39
    const/4 v12, 0x7

    .line 40
    shl-long/2addr v10, v12

    .line 41
    and-long/2addr v10, v8

    .line 42
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v10, v12

    .line 48
    cmp-long v10, v10, v12

    .line 49
    .line 50
    if-eqz v10, :cond_6

    .line 51
    .line 52
    sub-int v10, v7, v6

    .line 53
    .line 54
    not-int v10, v10

    .line 55
    ushr-int/lit8 v10, v10, 0x1f

    .line 56
    .line 57
    const/16 v11, 0x8

    .line 58
    .line 59
    rsub-int/lit8 v10, v10, 0x8

    .line 60
    .line 61
    move v12, v4

    .line 62
    :goto_1
    if-ge v12, v10, :cond_5

    .line 63
    .line 64
    const-wide/16 v13, 0xff

    .line 65
    .line 66
    and-long/2addr v13, v8

    .line 67
    const-wide/16 v15, 0x80

    .line 68
    .line 69
    cmp-long v13, v13, v15

    .line 70
    .line 71
    if-gez v13, :cond_4

    .line 72
    .line 73
    shl-int/lit8 v13, v7, 0x3

    .line 74
    .line 75
    add-int/2addr v13, v12

    .line 76
    aget-object v14, v3, v13

    .line 77
    .line 78
    aget v13, v5, v13

    .line 79
    .line 80
    invoke-virtual {v1, v14}, La/qy40;->b(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    if-ltz v14, :cond_3

    .line 85
    .line 86
    iget-object v15, v1, La/qy40;->c:[F

    .line 87
    .line 88
    aget v14, v15, v14

    .line 89
    .line 90
    cmpg-float v13, v13, v14

    .line 91
    .line 92
    if-nez v13, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    return v4

    .line 96
    :cond_4
    :goto_2
    shr-long/2addr v8, v11

    .line 97
    add-int/lit8 v12, v12, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    if-ne v10, v11, :cond_7

    .line 101
    .line 102
    :cond_6
    if-eq v7, v6, :cond_7

    .line 103
    .line 104
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_7
    return v2
.end method

.method public final hashCode()I
    .locals 15

    .line 1
    iget-object v0, p0, La/qy40;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, La/qy40;->c:[F

    .line 4
    .line 5
    iget-object p0, p0, La/qy40;->a:[J

    .line 6
    .line 7
    array-length v2, p0

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-ltz v2, :cond_6

    .line 12
    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    :goto_0
    aget-wide v6, p0, v4

    .line 16
    .line 17
    not-long v8, v6

    .line 18
    const/4 v10, 0x7

    .line 19
    shl-long/2addr v8, v10

    .line 20
    and-long/2addr v8, v6

    .line 21
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v8, v10

    .line 27
    cmp-long v8, v8, v10

    .line 28
    .line 29
    if-eqz v8, :cond_4

    .line 30
    .line 31
    sub-int v8, v4, v2

    .line 32
    .line 33
    not-int v8, v8

    .line 34
    ushr-int/lit8 v8, v8, 0x1f

    .line 35
    .line 36
    const/16 v9, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v8, v8, 0x8

    .line 39
    .line 40
    move v10, v3

    .line 41
    :goto_1
    if-ge v10, v8, :cond_2

    .line 42
    .line 43
    const-wide/16 v11, 0xff

    .line 44
    .line 45
    and-long/2addr v11, v6

    .line 46
    const-wide/16 v13, 0x80

    .line 47
    .line 48
    cmp-long v11, v11, v13

    .line 49
    .line 50
    if-gez v11, :cond_1

    .line 51
    .line 52
    shl-int/lit8 v11, v4, 0x3

    .line 53
    .line 54
    add-int/2addr v11, v10

    .line 55
    aget-object v12, v0, v11

    .line 56
    .line 57
    aget v11, v1, v11

    .line 58
    .line 59
    if-eqz v12, :cond_0

    .line 60
    .line 61
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    move v12, v3

    .line 67
    :goto_2
    invoke-static {v11}, Ljava/lang/Float;->hashCode(F)I

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    xor-int/2addr v11, v12

    .line 72
    add-int/2addr v5, v11

    .line 73
    :cond_1
    shr-long/2addr v6, v9

    .line 74
    add-int/lit8 v10, v10, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    if-ne v8, v9, :cond_3

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    return v5

    .line 81
    :cond_4
    :goto_3
    if-eq v4, v2, :cond_5

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    return v5

    .line 87
    :cond_6
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La/qy40;->e:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v0, "{}"

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, La/qy40;->b:[Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v3, v0, La/qy40;->c:[F

    .line 20
    .line 21
    iget-object v4, v0, La/qy40;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_5

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move v7, v6

    .line 30
    move v8, v7

    .line 31
    :goto_0
    aget-wide v9, v4, v7

    .line 32
    .line 33
    not-long v11, v9

    .line 34
    const/4 v13, 0x7

    .line 35
    shl-long/2addr v11, v13

    .line 36
    and-long/2addr v11, v9

    .line 37
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v11, v13

    .line 43
    cmp-long v11, v11, v13

    .line 44
    .line 45
    if-eqz v11, :cond_4

    .line 46
    .line 47
    sub-int v11, v7, v5

    .line 48
    .line 49
    not-int v11, v11

    .line 50
    ushr-int/lit8 v11, v11, 0x1f

    .line 51
    .line 52
    const/16 v12, 0x8

    .line 53
    .line 54
    rsub-int/lit8 v11, v11, 0x8

    .line 55
    .line 56
    move v13, v6

    .line 57
    :goto_1
    if-ge v13, v11, :cond_3

    .line 58
    .line 59
    const-wide/16 v14, 0xff

    .line 60
    .line 61
    and-long/2addr v14, v9

    .line 62
    const-wide/16 v16, 0x80

    .line 63
    .line 64
    cmp-long v14, v14, v16

    .line 65
    .line 66
    if-gez v14, :cond_2

    .line 67
    .line 68
    shl-int/lit8 v14, v7, 0x3

    .line 69
    .line 70
    add-int/2addr v14, v13

    .line 71
    aget-object v15, v2, v14

    .line 72
    .line 73
    aget v14, v3, v14

    .line 74
    .line 75
    if-ne v15, v0, :cond_1

    .line 76
    .line 77
    const-string v15, "(this)"

    .line 78
    .line 79
    :cond_1
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v15, "="

    .line 83
    .line 84
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    iget v14, v0, La/qy40;->e:I

    .line 93
    .line 94
    if-ge v8, v14, :cond_2

    .line 95
    .line 96
    const-string v14, ", "

    .line 97
    .line 98
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_2
    shr-long/2addr v9, v12

    .line 102
    add-int/lit8 v13, v13, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    if-ne v11, v12, :cond_5

    .line 106
    .line 107
    :cond_4
    if-eq v7, v5, :cond_5

    .line 108
    .line 109
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    const/16 v0, 0x7d

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0
.end method
