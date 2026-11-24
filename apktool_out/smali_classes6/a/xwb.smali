.class public final La/xwb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:La/e900;

.field public final c:J

.field public final d:J

.field public final e:La/y9q0;

.field public final f:J

.field public final g:J

.field public final h:La/x03;

.field public final i:J

.field public final j:La/y9q0;

.field public final k:J

.field public final l:J


# direct methods
.method public constructor <init>(JLa/e900;JJLa/y9q0;JJLa/x03;JLa/y9q0;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/xwb;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/xwb;->b:La/e900;

    .line 7
    .line 8
    iput-wide p4, p0, La/xwb;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, La/xwb;->d:J

    .line 11
    .line 12
    iput-object p8, p0, La/xwb;->e:La/y9q0;

    .line 13
    .line 14
    iput-wide p9, p0, La/xwb;->f:J

    .line 15
    .line 16
    iput-wide p11, p0, La/xwb;->g:J

    .line 17
    .line 18
    iput-object p13, p0, La/xwb;->h:La/x03;

    .line 19
    .line 20
    iput-wide p14, p0, La/xwb;->i:J

    .line 21
    .line 22
    move-object/from16 p1, p16

    .line 23
    .line 24
    iput-object p1, p0, La/xwb;->j:La/y9q0;

    .line 25
    .line 26
    move-wide/from16 p1, p17

    .line 27
    .line 28
    iput-wide p1, p0, La/xwb;->k:J

    .line 29
    .line 30
    move-wide/from16 p1, p19

    .line 31
    .line 32
    iput-wide p1, p0, La/xwb;->l:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/xwb;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, La/xwb;

    .line 13
    .line 14
    iget-wide v3, p1, La/xwb;->a:J

    .line 15
    .line 16
    sget v1, La/y3d;->h:I

    .line 17
    .line 18
    iget-wide v5, p0, La/xwb;->a:J

    .line 19
    .line 20
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_2
    const/high16 v1, 0x40000000    # 2.0f

    .line 29
    .line 30
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_3
    iget-object v1, p0, La/xwb;->b:La/e900;

    .line 39
    .line 40
    iget-object v3, p1, La/xwb;->b:La/e900;

    .line 41
    .line 42
    invoke-virtual {v1, v3}, La/e900;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_4
    iget-wide v3, p0, La/xwb;->c:J

    .line 51
    .line 52
    iget-wide v5, p1, La/xwb;->c:J

    .line 53
    .line 54
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_5

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :cond_5
    iget-wide v3, p0, La/xwb;->d:J

    .line 63
    .line 64
    iget-wide v5, p1, La/xwb;->d:J

    .line 65
    .line 66
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_6

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_6
    const/4 v1, 0x0

    .line 75
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_7

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_7
    const/high16 v1, 0x40c00000    # 6.0f

    .line 84
    .line 85
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_8

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_8
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_9

    .line 98
    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :cond_9
    iget-object v1, p0, La/xwb;->e:La/y9q0;

    .line 102
    .line 103
    iget-object v3, p1, La/xwb;->e:La/y9q0;

    .line 104
    .line 105
    invoke-virtual {v1, v3}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_a
    iget-wide v3, p0, La/xwb;->f:J

    .line 114
    .line 115
    iget-wide v5, p1, La/xwb;->f:J

    .line 116
    .line 117
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_b

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_b
    iget-wide v3, p0, La/xwb;->g:J

    .line 125
    .line 126
    iget-wide v5, p1, La/xwb;->g:J

    .line 127
    .line 128
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_c

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_c
    iget-object v1, p0, La/xwb;->h:La/x03;

    .line 136
    .line 137
    iget-object v3, p1, La/xwb;->h:La/x03;

    .line 138
    .line 139
    if-eq v1, v3, :cond_d

    .line 140
    .line 141
    return v2

    .line 142
    :cond_d
    const/high16 v1, 0x42500000    # 52.0f

    .line 143
    .line 144
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_e

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_e
    const/high16 v1, 0x42100000    # 36.0f

    .line 152
    .line 153
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_f

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_f
    const/high16 v1, 0x42780000    # 62.0f

    .line 161
    .line 162
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_10

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_10
    const/high16 v1, 0x42200000    # 40.0f

    .line 170
    .line 171
    invoke-static {v1, v1}, La/ycl;->b(FF)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_11

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_11
    iget-wide v3, p0, La/xwb;->i:J

    .line 179
    .line 180
    iget-wide v5, p1, La/xwb;->i:J

    .line 181
    .line 182
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_12

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_12
    iget-object v1, p0, La/xwb;->j:La/y9q0;

    .line 190
    .line 191
    iget-object v3, p1, La/xwb;->j:La/y9q0;

    .line 192
    .line 193
    invoke-virtual {v1, v3}, La/y9q0;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_13

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_13
    iget-wide v3, p0, La/xwb;->k:J

    .line 201
    .line 202
    iget-wide v5, p1, La/xwb;->k:J

    .line 203
    .line 204
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_14

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_14
    iget-wide v3, p0, La/xwb;->l:J

    .line 212
    .line 213
    iget-wide p0, p1, La/xwb;->l:J

    .line 214
    .line 215
    invoke-static {v3, v4, p0, p1}, La/h2t0;->a(JJ)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-nez p0, :cond_15

    .line 220
    .line 221
    :goto_0
    return v2

    .line 222
    :cond_15
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    sget v0, La/y3d;->h:I

    .line 2
    .line 3
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 4
    .line 5
    iget-wide v0, p0, La/xwb;->a:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/xwb;->b:La/e900;

    .line 21
    .line 22
    invoke-virtual {v2}, La/e900;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    mul-int/2addr v2, v1

    .line 28
    iget-wide v3, p0, La/xwb;->c:J

    .line 29
    .line 30
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/xwb;->d:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/high16 v2, 0x40c00000    # 6.0f

    .line 46
    .line 47
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v2, p0, La/xwb;->e:La/y9q0;

    .line 56
    .line 57
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-wide v2, p0, La/xwb;->f:J

    .line 62
    .line 63
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-wide v2, p0, La/xwb;->g:J

    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-object v2, p0, La/xwb;->h:La/x03;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v2, v0

    .line 80
    mul-int/2addr v2, v1

    .line 81
    const/high16 v0, 0x42500000    # 52.0f

    .line 82
    .line 83
    invoke-static {v2, v0, v1}, Lc;->a(IFI)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/high16 v2, 0x42100000    # 36.0f

    .line 88
    .line 89
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/high16 v2, 0x42780000    # 62.0f

    .line 94
    .line 95
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/high16 v2, 0x42200000    # 40.0f

    .line 100
    .line 101
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-wide v2, p0, La/xwb;->i:J

    .line 106
    .line 107
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    iget-object v2, p0, La/xwb;->j:La/y9q0;

    .line 112
    .line 113
    invoke-static {v2, v0, v1}, La/brm0;->g(La/y9q0;II)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-wide v2, p0, La/xwb;->k:J

    .line 118
    .line 119
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iget-wide v2, p0, La/xwb;->l:J

    .line 124
    .line 125
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    add-int/2addr v0, p0

    .line 135
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, La/xwb;->a:J

    .line 4
    .line 5
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/high16 v2, 0x40000000    # 2.0f

    .line 10
    .line 11
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-wide v3, v0, La/xwb;->c:J

    .line 16
    .line 17
    invoke-static {v3, v4}, La/y3d;->i(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-wide v4, v0, La/xwb;->d:J

    .line 22
    .line 23
    invoke-static {v4, v5}, La/y3d;->i(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const/high16 v6, 0x40c00000    # 6.0f

    .line 33
    .line 34
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-static {v6}, La/ycl;->c(F)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-wide v8, v0, La/xwb;->f:J

    .line 43
    .line 44
    invoke-static {v8, v9}, La/y3d;->i(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    iget-wide v9, v0, La/xwb;->g:J

    .line 49
    .line 50
    invoke-static {v9, v10}, La/y3d;->i(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    const/high16 v10, 0x42500000    # 52.0f

    .line 55
    .line 56
    invoke-static {v10}, La/ycl;->c(F)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    const/high16 v11, 0x42100000    # 36.0f

    .line 61
    .line 62
    invoke-static {v11}, La/ycl;->c(F)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    const/high16 v12, 0x42780000    # 62.0f

    .line 67
    .line 68
    invoke-static {v12}, La/ycl;->c(F)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    const/high16 v13, 0x42200000    # 40.0f

    .line 73
    .line 74
    invoke-static {v13}, La/ycl;->c(F)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    iget-wide v14, v0, La/xwb;->i:J

    .line 79
    .line 80
    invoke-static {v14, v15}, La/y3d;->i(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    move-object/from16 v16, v14

    .line 85
    .line 86
    iget-wide v14, v0, La/xwb;->k:J

    .line 87
    .line 88
    invoke-static {v14, v15}, La/y3d;->i(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    move-object/from16 v17, v14

    .line 93
    .line 94
    iget-wide v14, v0, La/xwb;->l:J

    .line 95
    .line 96
    invoke-static {v14, v15}, La/y3d;->i(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    const-string v15, ", lineWidth="

    .line 101
    .line 102
    move-object/from16 v18, v14

    .line 103
    .line 104
    const-string v14, ", areaGradient="

    .line 105
    .line 106
    move-object/from16 v19, v12

    .line 107
    .line 108
    const-string v12, "ChartStyle(lineColor="

    .line 109
    .line 110
    invoke-static {v12, v1, v15, v2, v14}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v2, v0, La/xwb;->b:La/e900;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v2, ", markerColor="

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v2, ", markerBorderColor="

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v2, ", markerBorderWidth="

    .line 133
    .line 134
    const-string v3, ", markerRadius="

    .line 135
    .line 136
    invoke-static {v1, v4, v2, v5, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v2, ", selectedMarkerRadius="

    .line 140
    .line 141
    const-string v3, ", labelTextStyle="

    .line 142
    .line 143
    invoke-static {v1, v7, v2, v6, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v2, v0, La/xwb;->e:La/y9q0;

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v2, ", labelTextColor="

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v2, ", gridColor="

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v2, ", guidelineStyle="

    .line 168
    .line 169
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    iget-object v2, v0, La/xwb;->h:La/x03;

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v2, ", horizontalPointSpacing="

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v2, ", yAxisWidth="

    .line 183
    .line 184
    const-string v3, ", xAxisHeight="

    .line 185
    .line 186
    invoke-static {v1, v10, v2, v11, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const-string v2, ", chartPaddingTop="

    .line 190
    .line 191
    const-string v3, ", tooltipColor="

    .line 192
    .line 193
    move-object/from16 v4, v19

    .line 194
    .line 195
    invoke-static {v1, v4, v2, v13, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    move-object/from16 v2, v16

    .line 199
    .line 200
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v2, ", tooltipTextStyle="

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    iget-object v0, v0, La/xwb;->j:La/y9q0;

    .line 209
    .line 210
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v0, ", tooltipTextColor="

    .line 214
    .line 215
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v0, ", backgroundColor="

    .line 219
    .line 220
    const-string v2, ", isZoomEnabled=false)"

    .line 221
    .line 222
    move-object/from16 v3, v17

    .line 223
    .line 224
    move-object/from16 v4, v18

    .line 225
    .line 226
    invoke-static {v1, v3, v0, v4, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    return-object v0
.end method
