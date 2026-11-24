.class public final La/zr40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/l0t0;


# instance fields
.field public A:F

.field public B:La/nr00;

.field public Y:La/zr40;

.field public a:La/ywu;

.field public b:I

.field public c:La/qt40;

.field public d:La/qt40;

.field public e:La/bs40;

.field public f:La/bs40;

.field public g:[La/kpb;

.field public h:La/aw3;

.field public i:F

.field public j:F

.field public k:F

.field public l:[I

.field public m:[D

.field public n:[D

.field public o:[Ljava/lang/String;

.field public p:[I

.field public q:[F

.field public r:Ljava/util/ArrayList;

.field public s:[F

.field public t:Ljava/util/ArrayList;

.field public u:Ljava/util/HashMap;

.field public v:Ljava/util/HashMap;

.field public w:Ljava/util/HashMap;

.field public x:I

.field public y:I

.field public z:I


# virtual methods
.method public final a(F[F)F
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    aput v2, p2, v1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v3, p0, La/zr40;->k:F

    .line 11
    .line 12
    float-to-double v4, v3

    .line 13
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    cmpl-double v4, v4, v6

    .line 16
    .line 17
    if-eqz v4, :cond_2

    .line 18
    .line 19
    iget v4, p0, La/zr40;->j:F

    .line 20
    .line 21
    cmpg-float v5, p1, v4

    .line 22
    .line 23
    if-gez v5, :cond_1

    .line 24
    .line 25
    move p1, v0

    .line 26
    :cond_1
    cmpl-float v5, p1, v4

    .line 27
    .line 28
    if-lez v5, :cond_2

    .line 29
    .line 30
    float-to-double v8, p1

    .line 31
    cmpg-double v5, v8, v6

    .line 32
    .line 33
    if-gez v5, :cond_2

    .line 34
    .line 35
    sub-float/2addr p1, v4

    .line 36
    mul-float/2addr p1, v3

    .line 37
    invoke-static {p1, v2}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    :cond_2
    :goto_0
    iget-object v3, p0, La/zr40;->c:La/qt40;

    .line 42
    .line 43
    iget-object v3, v3, La/qt40;->a:La/fhn;

    .line 44
    .line 45
    iget-object p0, p0, La/zr40;->r:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 52
    .line 53
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_5

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, La/qt40;

    .line 64
    .line 65
    iget-object v6, v5, La/qt40;->a:La/fhn;

    .line 66
    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    iget v7, v5, La/qt40;->b:F

    .line 70
    .line 71
    cmpg-float v8, v7, p1

    .line 72
    .line 73
    if-gez v8, :cond_4

    .line 74
    .line 75
    move-object v3, v6

    .line 76
    move v0, v7

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_3

    .line 83
    .line 84
    iget v4, v5, La/qt40;->b:F

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    if-eqz v3, :cond_8

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    move v2, v4

    .line 97
    :goto_2
    sub-float/2addr p1, v0

    .line 98
    sub-float/2addr v2, v0

    .line 99
    div-float/2addr p1, v2

    .line 100
    float-to-double p0, p1

    .line 101
    invoke-virtual {v3, p0, p1}, La/fhn;->d(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    double-to-float v4, v4

    .line 106
    mul-float/2addr v4, v2

    .line 107
    add-float/2addr v4, v0

    .line 108
    if-eqz p2, :cond_7

    .line 109
    .line 110
    invoke-virtual {v3, p0, p1}, La/fhn;->e(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide p0

    .line 114
    double-to-float p0, p0

    .line 115
    aput p0, p2, v1

    .line 116
    .line 117
    :cond_7
    return v4

    .line 118
    :cond_8
    return p1
.end method

.method public final b(D[F[F)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    new-array v5, v4, [D

    .line 9
    .line 10
    new-array v6, v4, [D

    .line 11
    .line 12
    iget-object v7, v0, La/zr40;->g:[La/kpb;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    aget-object v7, v7, v8

    .line 16
    .line 17
    invoke-virtual {v7, v1, v2, v5}, La/kpb;->P(D[D)V

    .line 18
    .line 19
    .line 20
    iget-object v7, v0, La/zr40;->g:[La/kpb;

    .line 21
    .line 22
    aget-object v7, v7, v8

    .line 23
    .line 24
    invoke-virtual {v7, v1, v2, v6}, La/kpb;->W(D[D)V

    .line 25
    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-static {v3, v7}, Ljava/util/Arrays;->fill([FF)V

    .line 29
    .line 30
    .line 31
    iget-object v9, v0, La/zr40;->c:La/qt40;

    .line 32
    .line 33
    iget-object v0, v0, La/zr40;->l:[I

    .line 34
    .line 35
    iget v10, v9, La/qt40;->d:F

    .line 36
    .line 37
    iget v11, v9, La/qt40;->e:F

    .line 38
    .line 39
    iget v12, v9, La/qt40;->f:F

    .line 40
    .line 41
    iget v13, v9, La/qt40;->g:F

    .line 42
    .line 43
    move v15, v7

    .line 44
    move/from16 v16, v15

    .line 45
    .line 46
    move/from16 v17, v16

    .line 47
    .line 48
    move/from16 v18, v17

    .line 49
    .line 50
    move v14, v8

    .line 51
    move/from16 v19, v14

    .line 52
    .line 53
    :goto_0
    array-length v8, v0

    .line 54
    if-ge v14, v8, :cond_4

    .line 55
    .line 56
    move-object v8, v5

    .line 57
    aget-wide v4, v8, v14

    .line 58
    .line 59
    double-to-float v4, v4

    .line 60
    move v5, v4

    .line 61
    aget-wide v3, v6, v14

    .line 62
    .line 63
    double-to-float v3, v3

    .line 64
    aget v4, v0, v14

    .line 65
    .line 66
    move-object/from16 v21, v0

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    if-eq v4, v0, :cond_3

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    if-eq v4, v0, :cond_2

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    if-eq v4, v0, :cond_1

    .line 76
    .line 77
    const/4 v0, 0x4

    .line 78
    if-eq v4, v0, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    move/from16 v18, v3

    .line 82
    .line 83
    move v13, v5

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/4 v0, 0x4

    .line 86
    move/from16 v16, v3

    .line 87
    .line 88
    move v12, v5

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const/4 v0, 0x4

    .line 91
    move v7, v3

    .line 92
    move v11, v5

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 v0, 0x4

    .line 95
    move v15, v3

    .line 96
    move v10, v5

    .line 97
    :goto_1
    add-int/lit8 v14, v14, 0x1

    .line 98
    .line 99
    move-object/from16 v3, p4

    .line 100
    .line 101
    move v4, v0

    .line 102
    move-object v5, v8

    .line 103
    move-object/from16 v0, v21

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    const/high16 v0, 0x40000000    # 2.0f

    .line 107
    .line 108
    div-float v16, v16, v0

    .line 109
    .line 110
    add-float v16, v16, v15

    .line 111
    .line 112
    div-float v18, v18, v0

    .line 113
    .line 114
    add-float v18, v18, v7

    .line 115
    .line 116
    iget-object v3, v9, La/qt40;->l:La/zr40;

    .line 117
    .line 118
    if-eqz v3, :cond_5

    .line 119
    .line 120
    const/4 v4, 0x2

    .line 121
    new-array v5, v4, [F

    .line 122
    .line 123
    new-array v4, v4, [F

    .line 124
    .line 125
    invoke-virtual {v3, v1, v2, v5, v4}, La/zr40;->b(D[F[F)V

    .line 126
    .line 127
    .line 128
    aget v1, v5, v19

    .line 129
    .line 130
    const/16 v20, 0x1

    .line 131
    .line 132
    aget v2, v5, v20

    .line 133
    .line 134
    aget v3, v4, v19

    .line 135
    .line 136
    aget v4, v4, v20

    .line 137
    .line 138
    float-to-double v5, v1

    .line 139
    float-to-double v8, v10

    .line 140
    float-to-double v10, v11

    .line 141
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 142
    .line 143
    .line 144
    move-result-wide v21

    .line 145
    mul-double v21, v21, v8

    .line 146
    .line 147
    add-double v21, v21, v5

    .line 148
    .line 149
    div-float v1, v12, v0

    .line 150
    .line 151
    float-to-double v5, v1

    .line 152
    sub-double v5, v21, v5

    .line 153
    .line 154
    double-to-float v1, v5

    .line 155
    float-to-double v5, v2

    .line 156
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 157
    .line 158
    .line 159
    move-result-wide v21

    .line 160
    mul-double v21, v21, v8

    .line 161
    .line 162
    sub-double v5, v5, v21

    .line 163
    .line 164
    div-float v2, v13, v0

    .line 165
    .line 166
    float-to-double v8, v2

    .line 167
    sub-double/2addr v5, v8

    .line 168
    double-to-float v2, v5

    .line 169
    float-to-double v5, v3

    .line 170
    float-to-double v8, v15

    .line 171
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 172
    .line 173
    .line 174
    move-result-wide v14

    .line 175
    mul-double/2addr v14, v8

    .line 176
    add-double/2addr v14, v5

    .line 177
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    move/from16 p0, v0

    .line 182
    .line 183
    move v3, v1

    .line 184
    float-to-double v0, v7

    .line 185
    mul-double/2addr v5, v0

    .line 186
    add-double/2addr v5, v14

    .line 187
    double-to-float v5, v5

    .line 188
    float-to-double v6, v4

    .line 189
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 190
    .line 191
    .line 192
    move-result-wide v14

    .line 193
    mul-double/2addr v14, v8

    .line 194
    sub-double/2addr v6, v14

    .line 195
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 196
    .line 197
    .line 198
    move-result-wide v8

    .line 199
    mul-double/2addr v8, v0

    .line 200
    add-double/2addr v8, v6

    .line 201
    double-to-float v0, v8

    .line 202
    move/from16 v18, v0

    .line 203
    .line 204
    move v11, v2

    .line 205
    move v10, v3

    .line 206
    move/from16 v16, v5

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    move/from16 p0, v0

    .line 210
    .line 211
    :goto_2
    div-float v12, v12, p0

    .line 212
    .line 213
    add-float/2addr v12, v10

    .line 214
    add-float v12, v12, v17

    .line 215
    .line 216
    aput v12, p3, v19

    .line 217
    .line 218
    div-float v13, v13, p0

    .line 219
    .line 220
    add-float/2addr v13, v11

    .line 221
    add-float v13, v13, v17

    .line 222
    .line 223
    const/16 v20, 0x1

    .line 224
    .line 225
    aput v13, p3, v20

    .line 226
    .line 227
    aput v16, p4, v19

    .line 228
    .line 229
    aput v18, p4, v20

    .line 230
    .line 231
    return-void
.end method

.method public final c(II)Z
    .locals 2

    .line 1
    const/16 v0, 0x1fd

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/16 v0, 0x262

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/16 p0, 0x2c0

    .line 11
    .line 12
    if-eq p1, p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_0
    return v1

    .line 17
    :cond_1
    iput p2, p0, La/zr40;->z:I

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iput p2, p0, La/zr40;->x:I

    .line 21
    .line 22
    return v1
.end method

.method public final d(FI)Z
    .locals 2

    .line 1
    const/16 v0, 0x25a

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput p1, p0, La/zr40;->A:F

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x258

    .line 10
    .line 11
    if-ne v0, p2, :cond_1

    .line 12
    .line 13
    iput p1, p0, La/zr40;->i:F

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final e(ILjava/lang/String;)Z
    .locals 2

    .line 1
    const/16 v0, 0x2c1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, p1, :cond_2

    .line 5
    .line 6
    const/16 v0, 0x263

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 v0, 0x25d

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, La/zr40;->c:La/qt40;

    .line 16
    .line 17
    iput-object p2, p0, La/qt40;->j:Ljava/lang/String;

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_2
    :goto_0
    invoke-static {p2}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, La/nr00;

    .line 27
    .line 28
    invoke-direct {p2, p1}, La/nr00;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, La/zr40;->B:La/nr00;

    .line 32
    .line 33
    return v1
.end method

.method public final f(FFF[F)V
    .locals 10

    .line 1
    iget-object v0, p0, La/zr40;->c:La/qt40;

    .line 2
    .line 3
    iget-object v1, p0, La/zr40;->s:[F

    .line 4
    .line 5
    invoke-virtual {p0, p1, v1}, La/zr40;->a(F[F)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v2, p0, La/zr40;->g:[La/kpb;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    aget-object v2, v2, v3

    .line 15
    .line 16
    float-to-double v4, p1

    .line 17
    iget-object p1, p0, La/zr40;->n:[D

    .line 18
    .line 19
    invoke-virtual {v2, v4, v5, p1}, La/kpb;->W(D[D)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La/zr40;->g:[La/kpb;

    .line 23
    .line 24
    aget-object p1, p1, v3

    .line 25
    .line 26
    iget-object v2, p0, La/zr40;->m:[D

    .line 27
    .line 28
    invoke-virtual {p1, v4, v5, v2}, La/kpb;->P(D[D)V

    .line 29
    .line 30
    .line 31
    aget p1, v1, v3

    .line 32
    .line 33
    :goto_0
    iget-object v1, p0, La/zr40;->n:[D

    .line 34
    .line 35
    array-length v2, v1

    .line 36
    if-ge v3, v2, :cond_0

    .line 37
    .line 38
    aget-wide v6, v1, v3

    .line 39
    .line 40
    float-to-double v8, p1

    .line 41
    mul-double/2addr v6, v8

    .line 42
    aput-wide v6, v1, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, La/zr40;->h:La/aw3;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v1, p0, La/zr40;->m:[D

    .line 52
    .line 53
    array-length v2, v1

    .line 54
    if-lez v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1, v4, v5, v1}, La/aw3;->P(D[D)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, La/zr40;->h:La/aw3;

    .line 60
    .line 61
    iget-object v1, p0, La/zr40;->n:[D

    .line 62
    .line 63
    invoke-virtual {p1, v4, v5, v1}, La/aw3;->W(D[D)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, La/zr40;->l:[I

    .line 67
    .line 68
    iget-object p0, p0, La/zr40;->n:[D

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p2, p3, p4, p1, p0}, La/qt40;->d(FF[F[I[D)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    iget-object p0, p0, La/zr40;->l:[I

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {p2, p3, p4, p0, v1}, La/qt40;->d(FF[F[I[D)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    iget-object p0, p0, La/zr40;->d:La/qt40;

    .line 87
    .line 88
    iget p1, p0, La/qt40;->d:F

    .line 89
    .line 90
    iget v1, v0, La/qt40;->d:F

    .line 91
    .line 92
    sub-float/2addr p1, v1

    .line 93
    iget v1, p0, La/qt40;->e:F

    .line 94
    .line 95
    iget v2, v0, La/qt40;->e:F

    .line 96
    .line 97
    sub-float/2addr v1, v2

    .line 98
    iget v2, p0, La/qt40;->f:F

    .line 99
    .line 100
    iget v4, v0, La/qt40;->f:F

    .line 101
    .line 102
    sub-float/2addr v2, v4

    .line 103
    iget p0, p0, La/qt40;->g:F

    .line 104
    .line 105
    iget v0, v0, La/qt40;->g:F

    .line 106
    .line 107
    sub-float/2addr p0, v0

    .line 108
    add-float/2addr v2, p1

    .line 109
    add-float/2addr p0, v1

    .line 110
    const/high16 v0, 0x3f800000    # 1.0f

    .line 111
    .line 112
    sub-float v4, v0, p2

    .line 113
    .line 114
    mul-float/2addr v4, p1

    .line 115
    mul-float/2addr v2, p2

    .line 116
    add-float/2addr v2, v4

    .line 117
    aput v2, p4, v3

    .line 118
    .line 119
    sub-float/2addr v0, p3

    .line 120
    mul-float/2addr v0, v1

    .line 121
    mul-float/2addr p0, p3

    .line 122
    add-float/2addr p0, v0

    .line 123
    const/4 p1, 0x1

    .line 124
    aput p0, p4, p1

    .line 125
    .line 126
    return-void
.end method

.method public final g()F
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v7, v1, [F

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    move-wide v10, v2

    .line 9
    move-wide v12, v10

    .line 10
    const/4 v14, 0x0

    .line 11
    const/4 v15, 0x0

    .line 12
    :goto_0
    const/16 v2, 0x64

    .line 13
    .line 14
    if-ge v14, v2, :cond_6

    .line 15
    .line 16
    int-to-float v2, v14

    .line 17
    const v3, 0x3c257eb5

    .line 18
    .line 19
    .line 20
    mul-float/2addr v2, v3

    .line 21
    float-to-double v3, v2

    .line 22
    iget-object v5, v0, La/zr40;->c:La/qt40;

    .line 23
    .line 24
    iget-object v5, v5, La/qt40;->a:La/fhn;

    .line 25
    .line 26
    iget-object v6, v0, La/zr40;->r:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 33
    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v17

    .line 40
    if-eqz v17, :cond_2

    .line 41
    .line 42
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v17

    .line 46
    move-object/from16 v1, v17

    .line 47
    .line 48
    check-cast v1, La/qt40;

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    iget-object v9, v1, La/qt40;->a:La/fhn;

    .line 53
    .line 54
    move/from16 v18, v2

    .line 55
    .line 56
    if-eqz v9, :cond_1

    .line 57
    .line 58
    iget v2, v1, La/qt40;->b:F

    .line 59
    .line 60
    cmpg-float v19, v2, v18

    .line 61
    .line 62
    if-gez v19, :cond_0

    .line 63
    .line 64
    move/from16 v16, v2

    .line 65
    .line 66
    move-object v5, v9

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_1

    .line 73
    .line 74
    iget v1, v1, La/qt40;->b:F

    .line 75
    .line 76
    move v8, v1

    .line 77
    :cond_1
    :goto_2
    move/from16 v2, v18

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move/from16 v18, v2

    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    const/high16 v8, 0x3f800000    # 1.0f

    .line 93
    .line 94
    :cond_3
    sub-float v2, v18, v16

    .line 95
    .line 96
    sub-float v8, v8, v16

    .line 97
    .line 98
    div-float/2addr v2, v8

    .line 99
    float-to-double v1, v2

    .line 100
    invoke-virtual {v5, v1, v2}, La/fhn;->d(D)D

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    double-to-float v1, v1

    .line 105
    mul-float/2addr v1, v8

    .line 106
    add-float v1, v1, v16

    .line 107
    .line 108
    float-to-double v3, v1

    .line 109
    :cond_4
    iget-object v1, v0, La/zr40;->g:[La/kpb;

    .line 110
    .line 111
    aget-object v1, v1, v17

    .line 112
    .line 113
    iget-object v2, v0, La/zr40;->m:[D

    .line 114
    .line 115
    invoke-virtual {v1, v3, v4, v2}, La/kpb;->P(D[D)V

    .line 116
    .line 117
    .line 118
    iget-object v2, v0, La/zr40;->c:La/qt40;

    .line 119
    .line 120
    iget-object v5, v0, La/zr40;->l:[I

    .line 121
    .line 122
    iget-object v6, v0, La/zr40;->m:[D

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-virtual/range {v2 .. v8}, La/qt40;->c(D[I[D[FI)V

    .line 126
    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    if-lez v14, :cond_5

    .line 130
    .line 131
    aget v2, v7, v1

    .line 132
    .line 133
    float-to-double v2, v2

    .line 134
    sub-double/2addr v12, v2

    .line 135
    aget v2, v7, v17

    .line 136
    .line 137
    float-to-double v2, v2

    .line 138
    sub-double/2addr v10, v2

    .line 139
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    .line 140
    .line 141
    .line 142
    move-result-wide v2

    .line 143
    double-to-float v2, v2

    .line 144
    add-float/2addr v15, v2

    .line 145
    :cond_5
    aget v2, v7, v17

    .line 146
    .line 147
    float-to-double v10, v2

    .line 148
    aget v1, v7, v1

    .line 149
    .line 150
    float-to-double v12, v1

    .line 151
    add-int/lit8 v14, v14, 0x1

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_6
    return v15
.end method

.method public final h(La/ywu;F)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/zr40;->q:[F

    .line 6
    .line 7
    iget-object v3, v0, La/zr40;->e:La/bs40;

    .line 8
    .line 9
    iget-object v4, v0, La/zr40;->c:La/qt40;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move/from16 v6, p2

    .line 13
    .line 14
    invoke-virtual {v0, v6, v5}, La/zr40;->a(F[F)F

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    iget v7, v0, La/zr40;->z:I

    .line 19
    .line 20
    const/high16 v9, 0x3f800000    # 1.0f

    .line 21
    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v7, v10, :cond_3

    .line 24
    .line 25
    int-to-float v7, v7

    .line 26
    div-float v7, v9, v7

    .line 27
    .line 28
    div-float v11, v6, v7

    .line 29
    .line 30
    float-to-double v11, v11

    .line 31
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide v11

    .line 35
    double-to-float v11, v11

    .line 36
    mul-float/2addr v11, v7

    .line 37
    rem-float/2addr v6, v7

    .line 38
    div-float/2addr v6, v7

    .line 39
    iget v12, v0, La/zr40;->A:F

    .line 40
    .line 41
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    if-nez v12, :cond_0

    .line 46
    .line 47
    iget v12, v0, La/zr40;->A:F

    .line 48
    .line 49
    add-float/2addr v6, v12

    .line 50
    rem-float/2addr v6, v9

    .line 51
    :cond_0
    iget-object v12, v0, La/zr40;->B:La/nr00;

    .line 52
    .line 53
    if-eqz v12, :cond_1

    .line 54
    .line 55
    iget-object v12, v12, La/nr00;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v12, La/fhn;

    .line 58
    .line 59
    float-to-double v13, v6

    .line 60
    invoke-virtual {v12, v13, v14}, La/fhn;->d(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v12

    .line 64
    double-to-float v6, v12

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    float-to-double v12, v6

    .line 67
    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    .line 68
    .line 69
    cmpl-double v6, v12, v14

    .line 70
    .line 71
    if-lez v6, :cond_2

    .line 72
    .line 73
    move v6, v9

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v6, 0x0

    .line 76
    :goto_0
    mul-float/2addr v6, v7

    .line 77
    add-float/2addr v6, v11

    .line 78
    :cond_3
    iget-object v7, v0, La/zr40;->v:Ljava/util/HashMap;

    .line 79
    .line 80
    if-eqz v7, :cond_4

    .line 81
    .line 82
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_4

    .line 95
    .line 96
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    check-cast v11, La/zzk0;

    .line 101
    .line 102
    invoke-virtual {v11, v1, v6}, La/zzk0;->c(La/ywu;F)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    iget-object v7, v0, La/zr40;->g:[La/kpb;

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    if-eqz v7, :cond_1a

    .line 110
    .line 111
    aget-object v7, v7, v13

    .line 112
    .line 113
    float-to-double v14, v6

    .line 114
    move-object/from16 v16, v5

    .line 115
    .line 116
    iget-object v5, v0, La/zr40;->m:[D

    .line 117
    .line 118
    invoke-virtual {v7, v14, v15, v5}, La/kpb;->P(D[D)V

    .line 119
    .line 120
    .line 121
    iget-object v5, v0, La/zr40;->g:[La/kpb;

    .line 122
    .line 123
    aget-object v5, v5, v13

    .line 124
    .line 125
    iget-object v7, v0, La/zr40;->n:[D

    .line 126
    .line 127
    invoke-virtual {v5, v14, v15, v7}, La/kpb;->W(D[D)V

    .line 128
    .line 129
    .line 130
    iget-object v5, v0, La/zr40;->h:La/aw3;

    .line 131
    .line 132
    if-eqz v5, :cond_5

    .line 133
    .line 134
    iget-object v7, v0, La/zr40;->m:[D

    .line 135
    .line 136
    const/16 p2, 0x0

    .line 137
    .line 138
    array-length v8, v7

    .line 139
    if-lez v8, :cond_6

    .line 140
    .line 141
    invoke-virtual {v5, v14, v15, v7}, La/aw3;->P(D[D)V

    .line 142
    .line 143
    .line 144
    iget-object v5, v0, La/zr40;->h:La/aw3;

    .line 145
    .line 146
    iget-object v7, v0, La/zr40;->n:[D

    .line 147
    .line 148
    invoke-virtual {v5, v14, v15, v7}, La/aw3;->W(D[D)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    const/16 p2, 0x0

    .line 153
    .line 154
    :cond_6
    :goto_2
    iget-object v5, v0, La/zr40;->l:[I

    .line 155
    .line 156
    iget-object v7, v0, La/zr40;->m:[D

    .line 157
    .line 158
    iget-object v8, v0, La/zr40;->n:[D

    .line 159
    .line 160
    move/from16 v17, v9

    .line 161
    .line 162
    iget v9, v4, La/qt40;->d:F

    .line 163
    .line 164
    const/high16 v18, 0x3f000000    # 0.5f

    .line 165
    .line 166
    iget v11, v4, La/qt40;->e:F

    .line 167
    .line 168
    move/from16 v19, v13

    .line 169
    .line 170
    iget v13, v4, La/qt40;->f:F

    .line 171
    .line 172
    iget v10, v4, La/qt40;->g:F

    .line 173
    .line 174
    const/16 v20, 0x1

    .line 175
    .line 176
    array-length v12, v5

    .line 177
    if-eqz v12, :cond_7

    .line 178
    .line 179
    iget-object v12, v4, La/qt40;->o:[D

    .line 180
    .line 181
    array-length v12, v12

    .line 182
    move-object/from16 v21, v7

    .line 183
    .line 184
    array-length v7, v5

    .line 185
    add-int/lit8 v7, v7, -0x1

    .line 186
    .line 187
    aget v7, v5, v7

    .line 188
    .line 189
    if-gt v12, v7, :cond_8

    .line 190
    .line 191
    array-length v7, v5

    .line 192
    add-int/lit8 v7, v7, -0x1

    .line 193
    .line 194
    aget v7, v5, v7

    .line 195
    .line 196
    add-int/lit8 v7, v7, 0x1

    .line 197
    .line 198
    new-array v12, v7, [D

    .line 199
    .line 200
    iput-object v12, v4, La/qt40;->o:[D

    .line 201
    .line 202
    new-array v7, v7, [D

    .line 203
    .line 204
    iput-object v7, v4, La/qt40;->p:[D

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_7
    move-object/from16 v21, v7

    .line 208
    .line 209
    :cond_8
    :goto_3
    iget-object v7, v4, La/qt40;->o:[D

    .line 210
    .line 211
    move v12, v9

    .line 212
    move/from16 v22, v10

    .line 213
    .line 214
    const-wide/high16 v9, 0x7ff8000000000000L    # Double.NaN

    .line 215
    .line 216
    invoke-static {v7, v9, v10}, Ljava/util/Arrays;->fill([DD)V

    .line 217
    .line 218
    .line 219
    move/from16 v7, v19

    .line 220
    .line 221
    :goto_4
    array-length v9, v5

    .line 222
    if-ge v7, v9, :cond_9

    .line 223
    .line 224
    iget-object v9, v4, La/qt40;->o:[D

    .line 225
    .line 226
    aget v10, v5, v7

    .line 227
    .line 228
    aget-wide v23, v21, v7

    .line 229
    .line 230
    aput-wide v23, v9, v10

    .line 231
    .line 232
    iget-object v9, v4, La/qt40;->p:[D

    .line 233
    .line 234
    aget-wide v23, v8, v7

    .line 235
    .line 236
    aput-wide v23, v9, v10

    .line 237
    .line 238
    add-int/lit8 v7, v7, 0x1

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_9
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 242
    .line 243
    move/from16 v10, p2

    .line 244
    .line 245
    move/from16 v23, v10

    .line 246
    .line 247
    move v9, v12

    .line 248
    move/from16 v24, v13

    .line 249
    .line 250
    move/from16 v7, v19

    .line 251
    .line 252
    move/from16 v21, v22

    .line 253
    .line 254
    move/from16 v12, v23

    .line 255
    .line 256
    move/from16 v22, v12

    .line 257
    .line 258
    :goto_5
    iget-object v13, v4, La/qt40;->o:[D

    .line 259
    .line 260
    move/from16 v25, v6

    .line 261
    .line 262
    array-length v6, v13

    .line 263
    move-object/from16 v26, v13

    .line 264
    .line 265
    if-ge v7, v6, :cond_11

    .line 266
    .line 267
    aget-wide v27, v26, v7

    .line 268
    .line 269
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->isNaN(D)Z

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    if-eqz v6, :cond_a

    .line 274
    .line 275
    move-wide/from16 v29, v14

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_a
    iget-object v6, v4, La/qt40;->o:[D

    .line 279
    .line 280
    aget-wide v27, v6, v7

    .line 281
    .line 282
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->isNaN(D)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    const-wide/16 v27, 0x0

    .line 287
    .line 288
    if-eqz v6, :cond_b

    .line 289
    .line 290
    :goto_6
    move-wide/from16 v29, v14

    .line 291
    .line 292
    move-wide/from16 v13, v27

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_b
    iget-object v6, v4, La/qt40;->o:[D

    .line 296
    .line 297
    aget-wide v29, v6, v7

    .line 298
    .line 299
    add-double v27, v29, v27

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :goto_7
    double-to-float v13, v13

    .line 303
    iget-object v14, v4, La/qt40;->p:[D

    .line 304
    .line 305
    move v15, v13

    .line 306
    aget-wide v13, v14, v7

    .line 307
    .line 308
    double-to-float v13, v13

    .line 309
    move/from16 v14, v20

    .line 310
    .line 311
    if-eq v7, v14, :cond_10

    .line 312
    .line 313
    const/4 v6, 0x2

    .line 314
    if-eq v7, v6, :cond_f

    .line 315
    .line 316
    const/4 v6, 0x3

    .line 317
    if-eq v7, v6, :cond_e

    .line 318
    .line 319
    const/4 v6, 0x4

    .line 320
    if-eq v7, v6, :cond_d

    .line 321
    .line 322
    const/4 v6, 0x5

    .line 323
    if-eq v7, v6, :cond_c

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_c
    move v5, v15

    .line 327
    goto :goto_8

    .line 328
    :cond_d
    move/from16 v23, v13

    .line 329
    .line 330
    move/from16 v21, v15

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_e
    move/from16 v22, v13

    .line 334
    .line 335
    move/from16 v24, v15

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_f
    move v10, v13

    .line 339
    move v11, v15

    .line 340
    goto :goto_8

    .line 341
    :cond_10
    move v12, v13

    .line 342
    move v9, v15

    .line 343
    :goto_8
    add-int/lit8 v7, v7, 0x1

    .line 344
    .line 345
    move/from16 v6, v25

    .line 346
    .line 347
    move-wide/from16 v14, v29

    .line 348
    .line 349
    const/16 v20, 0x1

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_11
    move-wide/from16 v29, v14

    .line 353
    .line 354
    iget-object v7, v4, La/qt40;->l:La/zr40;

    .line 355
    .line 356
    if-eqz v7, :cond_13

    .line 357
    .line 358
    const/4 v6, 0x2

    .line 359
    new-array v14, v6, [F

    .line 360
    .line 361
    new-array v15, v6, [F

    .line 362
    .line 363
    move-object/from16 v26, v3

    .line 364
    .line 365
    move-object/from16 v27, v4

    .line 366
    .line 367
    move-wide/from16 v3, v29

    .line 368
    .line 369
    invoke-virtual {v7, v3, v4, v14, v15}, La/zr40;->b(D[F[F)V

    .line 370
    .line 371
    .line 372
    aget v7, v14, v19

    .line 373
    .line 374
    const/16 v20, 0x1

    .line 375
    .line 376
    aget v14, v14, v20

    .line 377
    .line 378
    aget v6, v15, v19

    .line 379
    .line 380
    aget v15, v15, v20

    .line 381
    .line 382
    move/from16 v23, v14

    .line 383
    .line 384
    const/high16 v28, 0x40000000    # 2.0f

    .line 385
    .line 386
    float-to-double v13, v7

    .line 387
    move-wide/from16 v29, v13

    .line 388
    .line 389
    float-to-double v13, v9

    .line 390
    move-wide/from16 v31, v13

    .line 391
    .line 392
    float-to-double v13, v11

    .line 393
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 394
    .line 395
    .line 396
    move-result-wide v33

    .line 397
    mul-double v33, v33, v31

    .line 398
    .line 399
    add-double v33, v33, v29

    .line 400
    .line 401
    div-float v7, v24, v28

    .line 402
    .line 403
    move-wide/from16 v29, v13

    .line 404
    .line 405
    float-to-double v13, v7

    .line 406
    sub-double v13, v33, v13

    .line 407
    .line 408
    double-to-float v9, v13

    .line 409
    move/from16 v7, v23

    .line 410
    .line 411
    float-to-double v13, v7

    .line 412
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->cos(D)D

    .line 413
    .line 414
    .line 415
    move-result-wide v33

    .line 416
    mul-double v33, v33, v31

    .line 417
    .line 418
    sub-double v13, v13, v33

    .line 419
    .line 420
    div-float v7, v21, v28

    .line 421
    .line 422
    move-wide/from16 v33, v13

    .line 423
    .line 424
    float-to-double v13, v7

    .line 425
    sub-double v13, v33, v13

    .line 426
    .line 427
    double-to-float v11, v13

    .line 428
    float-to-double v6, v6

    .line 429
    float-to-double v12, v12

    .line 430
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->sin(D)D

    .line 431
    .line 432
    .line 433
    move-result-wide v33

    .line 434
    mul-double v33, v33, v12

    .line 435
    .line 436
    add-double v33, v33, v6

    .line 437
    .line 438
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->cos(D)D

    .line 439
    .line 440
    .line 441
    move-result-wide v6

    .line 442
    mul-double v6, v6, v31

    .line 443
    .line 444
    move-wide/from16 v35, v6

    .line 445
    .line 446
    float-to-double v6, v10

    .line 447
    mul-double v35, v35, v6

    .line 448
    .line 449
    move-wide/from16 v37, v6

    .line 450
    .line 451
    add-double v6, v35, v33

    .line 452
    .line 453
    double-to-float v6, v6

    .line 454
    float-to-double v14, v15

    .line 455
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->cos(D)D

    .line 456
    .line 457
    .line 458
    move-result-wide v33

    .line 459
    mul-double v33, v33, v12

    .line 460
    .line 461
    sub-double v14, v14, v33

    .line 462
    .line 463
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->sin(D)D

    .line 464
    .line 465
    .line 466
    move-result-wide v12

    .line 467
    mul-double v12, v12, v31

    .line 468
    .line 469
    mul-double v12, v12, v37

    .line 470
    .line 471
    add-double/2addr v12, v14

    .line 472
    double-to-float v7, v12

    .line 473
    array-length v10, v8

    .line 474
    const/4 v12, 0x2

    .line 475
    if-lt v10, v12, :cond_12

    .line 476
    .line 477
    float-to-double v12, v6

    .line 478
    aput-wide v12, v8, v19

    .line 479
    .line 480
    float-to-double v12, v7

    .line 481
    const/16 v20, 0x1

    .line 482
    .line 483
    aput-wide v12, v8, v20

    .line 484
    .line 485
    :cond_12
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    if-nez v8, :cond_14

    .line 490
    .line 491
    float-to-double v12, v5

    .line 492
    float-to-double v7, v7

    .line 493
    float-to-double v5, v6

    .line 494
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 495
    .line 496
    .line 497
    move-result-wide v5

    .line 498
    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    .line 499
    .line 500
    .line 501
    move-result-wide v5

    .line 502
    add-double/2addr v5, v12

    .line 503
    double-to-float v5, v5

    .line 504
    iget-object v6, v1, La/ywu;->b:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v6, La/vdv0;

    .line 507
    .line 508
    iput v5, v6, La/vdv0;->j:F

    .line 509
    .line 510
    goto :goto_9

    .line 511
    :cond_13
    move-object/from16 v26, v3

    .line 512
    .line 513
    move-object/from16 v27, v4

    .line 514
    .line 515
    move-wide/from16 v3, v29

    .line 516
    .line 517
    const/high16 v28, 0x40000000    # 2.0f

    .line 518
    .line 519
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 520
    .line 521
    .line 522
    move-result v6

    .line 523
    if-nez v6, :cond_14

    .line 524
    .line 525
    div-float v22, v22, v28

    .line 526
    .line 527
    add-float v6, v22, v12

    .line 528
    .line 529
    div-float v23, v23, v28

    .line 530
    .line 531
    add-float v7, v23, v10

    .line 532
    .line 533
    float-to-double v12, v5

    .line 534
    float-to-double v7, v7

    .line 535
    float-to-double v5, v6

    .line 536
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 537
    .line 538
    .line 539
    move-result-wide v5

    .line 540
    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    .line 541
    .line 542
    .line 543
    move-result-wide v5

    .line 544
    add-double/2addr v5, v12

    .line 545
    double-to-float v5, v5

    .line 546
    add-float v5, v5, p2

    .line 547
    .line 548
    iget-object v6, v1, La/ywu;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v6, La/vdv0;

    .line 551
    .line 552
    iput v5, v6, La/vdv0;->j:F

    .line 553
    .line 554
    :cond_14
    :goto_9
    add-float v9, v9, v18

    .line 555
    .line 556
    float-to-int v5, v9

    .line 557
    add-float v11, v11, v18

    .line 558
    .line 559
    float-to-int v6, v11

    .line 560
    add-float v9, v9, v24

    .line 561
    .line 562
    float-to-int v7, v9

    .line 563
    add-float v11, v11, v21

    .line 564
    .line 565
    float-to-int v8, v11

    .line 566
    iget-object v9, v1, La/ywu;->b:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v9, La/vdv0;

    .line 569
    .line 570
    iget-object v10, v1, La/ywu;->d:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v10, La/wv00;

    .line 573
    .line 574
    iput v6, v9, La/vdv0;->c:I

    .line 575
    .line 576
    iput v5, v9, La/vdv0;->b:I

    .line 577
    .line 578
    iput v7, v9, La/vdv0;->d:I

    .line 579
    .line 580
    iput v8, v9, La/vdv0;->e:I

    .line 581
    .line 582
    iget v5, v0, La/zr40;->y:I

    .line 583
    .line 584
    const/4 v6, -0x1

    .line 585
    if-eq v5, v6, :cond_15

    .line 586
    .line 587
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    :cond_15
    const/4 v14, 0x1

    .line 591
    :goto_a
    iget-object v5, v0, La/zr40;->g:[La/kpb;

    .line 592
    .line 593
    array-length v6, v5

    .line 594
    if-ge v14, v6, :cond_16

    .line 595
    .line 596
    aget-object v5, v5, v14

    .line 597
    .line 598
    invoke-virtual {v5, v3, v4, v2}, La/kpb;->Q(D[F)V

    .line 599
    .line 600
    .line 601
    move-object/from16 v5, v27

    .line 602
    .line 603
    iget-object v6, v5, La/qt40;->m:Ljava/util/HashMap;

    .line 604
    .line 605
    iget-object v7, v0, La/zr40;->o:[Ljava/lang/String;

    .line 606
    .line 607
    add-int/lit8 v8, v14, -0x1

    .line 608
    .line 609
    aget-object v7, v7, v8

    .line 610
    .line 611
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v6

    .line 615
    check-cast v6, La/iyf;

    .line 616
    .line 617
    invoke-virtual {v6, v1, v2}, La/iyf;->e(La/ywu;[F)V

    .line 618
    .line 619
    .line 620
    add-int/lit8 v14, v14, 0x1

    .line 621
    .line 622
    goto :goto_a

    .line 623
    :cond_16
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    cmpg-float v2, v25, p2

    .line 627
    .line 628
    if-gtz v2, :cond_17

    .line 629
    .line 630
    move-object/from16 v2, v26

    .line 631
    .line 632
    iget-byte v2, v2, La/bs40;->b:B

    .line 633
    .line 634
    iput-byte v2, v10, La/wv00;->a:B

    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_17
    move-object/from16 v2, v26

    .line 638
    .line 639
    cmpl-float v3, v25, v17

    .line 640
    .line 641
    iget-object v4, v0, La/zr40;->f:La/bs40;

    .line 642
    .line 643
    if-ltz v3, :cond_18

    .line 644
    .line 645
    iget-byte v2, v4, La/bs40;->b:B

    .line 646
    .line 647
    iput-byte v2, v10, La/wv00;->a:B

    .line 648
    .line 649
    goto :goto_b

    .line 650
    :cond_18
    iget-byte v3, v4, La/bs40;->b:B

    .line 651
    .line 652
    iget-byte v2, v2, La/bs40;->b:B

    .line 653
    .line 654
    if-eq v3, v2, :cond_19

    .line 655
    .line 656
    const/4 v6, 0x4

    .line 657
    iput-byte v6, v10, La/wv00;->a:B

    .line 658
    .line 659
    :cond_19
    :goto_b
    move/from16 v6, v25

    .line 660
    .line 661
    goto :goto_c

    .line 662
    :cond_1a
    move-object v5, v4

    .line 663
    move/from16 v25, v6

    .line 664
    .line 665
    move/from16 v19, v13

    .line 666
    .line 667
    const/high16 v18, 0x3f000000    # 0.5f

    .line 668
    .line 669
    iget v2, v5, La/qt40;->d:F

    .line 670
    .line 671
    iget-object v3, v0, La/zr40;->d:La/qt40;

    .line 672
    .line 673
    iget v4, v3, La/qt40;->d:F

    .line 674
    .line 675
    invoke-static {v4, v2, v6, v2}, La/rw2;->a(FFFF)F

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    iget v4, v5, La/qt40;->e:F

    .line 680
    .line 681
    iget v7, v3, La/qt40;->e:F

    .line 682
    .line 683
    invoke-static {v7, v4, v6, v4}, La/rw2;->a(FFFF)F

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    iget v7, v5, La/qt40;->f:F

    .line 688
    .line 689
    iget v8, v3, La/qt40;->f:F

    .line 690
    .line 691
    invoke-static {v8, v7, v6, v7}, La/rw2;->a(FFFF)F

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    iget v5, v5, La/qt40;->g:F

    .line 696
    .line 697
    iget v3, v3, La/qt40;->g:F

    .line 698
    .line 699
    invoke-static {v3, v5, v6, v5}, La/rw2;->a(FFFF)F

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    add-float v2, v2, v18

    .line 704
    .line 705
    float-to-int v5, v2

    .line 706
    add-float v4, v4, v18

    .line 707
    .line 708
    float-to-int v8, v4

    .line 709
    add-float/2addr v2, v7

    .line 710
    float-to-int v2, v2

    .line 711
    add-float/2addr v4, v3

    .line 712
    float-to-int v3, v4

    .line 713
    iget-object v4, v1, La/ywu;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v4, La/vdv0;

    .line 716
    .line 717
    iput v8, v4, La/vdv0;->c:I

    .line 718
    .line 719
    iput v5, v4, La/vdv0;->b:I

    .line 720
    .line 721
    iput v2, v4, La/vdv0;->d:I

    .line 722
    .line 723
    iput v3, v4, La/vdv0;->e:I

    .line 724
    .line 725
    :goto_c
    iget-object v2, v0, La/zr40;->w:Ljava/util/HashMap;

    .line 726
    .line 727
    if-eqz v2, :cond_1c

    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    if-eqz v3, :cond_1c

    .line 742
    .line 743
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    check-cast v3, La/cky;

    .line 748
    .line 749
    instance-of v4, v3, La/aky;

    .line 750
    .line 751
    if-eqz v4, :cond_1b

    .line 752
    .line 753
    check-cast v3, La/aky;

    .line 754
    .line 755
    iget-object v4, v0, La/zr40;->n:[D

    .line 756
    .line 757
    aget-wide v7, v4, v19

    .line 758
    .line 759
    const/16 v20, 0x1

    .line 760
    .line 761
    aget-wide v9, v4, v20

    .line 762
    .line 763
    invoke-virtual {v3, v6}, La/cky;->a(F)F

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 768
    .line 769
    .line 770
    move-result-wide v4

    .line 771
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 772
    .line 773
    .line 774
    move-result-wide v4

    .line 775
    double-to-float v4, v4

    .line 776
    add-float/2addr v3, v4

    .line 777
    iget-object v4, v1, La/ywu;->b:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v4, La/vdv0;

    .line 780
    .line 781
    iput v3, v4, La/vdv0;->j:F

    .line 782
    .line 783
    goto :goto_d

    .line 784
    :cond_1b
    const/16 v20, 0x1

    .line 785
    .line 786
    invoke-virtual {v3, v1, v6}, La/cky;->c(La/ywu;F)V

    .line 787
    .line 788
    .line 789
    goto :goto_d

    .line 790
    :cond_1c
    return-void
.end method

.method public final i(La/ywu;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/zr40;->d:La/qt40;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v1, v0, La/qt40;->b:F

    .line 6
    .line 7
    iput v1, v0, La/qt40;->c:F

    .line 8
    .line 9
    iget-object v1, p0, La/zr40;->a:La/ywu;

    .line 10
    .line 11
    iget-object v1, v1, La/ywu;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/vdv0;

    .line 14
    .line 15
    iget v2, v1, La/vdv0;->b:I

    .line 16
    .line 17
    int-to-float v3, v2

    .line 18
    iget v4, v1, La/vdv0;->c:I

    .line 19
    .line 20
    int-to-float v5, v4

    .line 21
    iget v6, v1, La/vdv0;->d:I

    .line 22
    .line 23
    sub-int/2addr v6, v2

    .line 24
    int-to-float v2, v6

    .line 25
    iget v1, v1, La/vdv0;->e:I

    .line 26
    .line 27
    sub-int/2addr v1, v4

    .line 28
    int-to-float v1, v1

    .line 29
    iput v3, v0, La/qt40;->d:F

    .line 30
    .line 31
    iput v5, v0, La/qt40;->e:F

    .line 32
    .line 33
    iput v2, v0, La/qt40;->f:F

    .line 34
    .line 35
    iput v1, v0, La/qt40;->g:F

    .line 36
    .line 37
    iget-object v1, p1, La/ywu;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, La/vdv0;

    .line 40
    .line 41
    iget v2, v1, La/vdv0;->b:I

    .line 42
    .line 43
    int-to-float v3, v2

    .line 44
    iget v4, v1, La/vdv0;->c:I

    .line 45
    .line 46
    int-to-float v5, v4

    .line 47
    iget v6, v1, La/vdv0;->d:I

    .line 48
    .line 49
    sub-int/2addr v6, v2

    .line 50
    int-to-float v2, v6

    .line 51
    iget v1, v1, La/vdv0;->e:I

    .line 52
    .line 53
    sub-int/2addr v1, v4

    .line 54
    int-to-float v1, v1

    .line 55
    iput v3, v0, La/qt40;->d:F

    .line 56
    .line 57
    iput v5, v0, La/qt40;->e:F

    .line 58
    .line 59
    iput v2, v0, La/qt40;->f:F

    .line 60
    .line 61
    iput v1, v0, La/qt40;->g:F

    .line 62
    .line 63
    invoke-virtual {v0, p1}, La/qt40;->a(La/ywu;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, La/zr40;->f:La/bs40;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/bs40;->c(La/ywu;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final j(La/ywu;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/zr40;->c:La/qt40;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, La/qt40;->b:F

    .line 5
    .line 6
    iput v1, v0, La/qt40;->c:F

    .line 7
    .line 8
    iget-object v1, p1, La/ywu;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/vdv0;

    .line 11
    .line 12
    iget v2, v1, La/vdv0;->b:I

    .line 13
    .line 14
    int-to-float v3, v2

    .line 15
    iget v4, v1, La/vdv0;->c:I

    .line 16
    .line 17
    int-to-float v5, v4

    .line 18
    iget v6, v1, La/vdv0;->d:I

    .line 19
    .line 20
    sub-int/2addr v6, v2

    .line 21
    int-to-float v2, v6

    .line 22
    iget v1, v1, La/vdv0;->e:I

    .line 23
    .line 24
    sub-int/2addr v1, v4

    .line 25
    int-to-float v1, v1

    .line 26
    iput v3, v0, La/qt40;->d:F

    .line 27
    .line 28
    iput v5, v0, La/qt40;->e:F

    .line 29
    .line 30
    iput v2, v0, La/qt40;->f:F

    .line 31
    .line 32
    iput v1, v0, La/qt40;->g:F

    .line 33
    .line 34
    invoke-virtual {v0, p1}, La/qt40;->a(La/ywu;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/zr40;->e:La/bs40;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, La/bs40;->c(La/ywu;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, La/ywu;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/vdv0;

    .line 45
    .line 46
    iget-object p1, p1, La/vdv0;->s:La/i0t0;

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    invoke-virtual {p1, p0}, La/i0t0;->d(La/l0t0;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " start: x: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/zr40;->c:La/qt40;

    .line 9
    .line 10
    iget v2, v1, La/qt40;->d:F

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, " y: "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, v1, La/qt40;->e:F

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " end: x: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/zr40;->d:La/qt40;

    .line 31
    .line 32
    iget v1, p0, La/qt40;->d:F

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget p0, p0, La/qt40;->e:F

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
