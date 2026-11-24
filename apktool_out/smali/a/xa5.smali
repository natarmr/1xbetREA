.class public abstract La/xa5;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/wa5;

.field public final d:La/ywq0;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;

.field public final g:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(La/xju0;La/ywq0;La/wa5;)V
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, La/xa5;->d:La/ywq0;

    .line 7
    .line 8
    iput-object p3, p0, La/xa5;->c:La/wa5;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/xa5;->f:Landroid/graphics/Paint;

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/xa5;->e:Landroid/graphics/Paint;

    .line 26
    .line 27
    const p3, -0x777778

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    const/high16 p3, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x5a

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, La/xa5;->g:Landroid/graphics/Paint;

    .line 54
    .line 55
    const/high16 p0, -0x1000000

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-direct {p0, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    return-void
.end method


# virtual methods
.method public n1(FF)V
    .locals 6

    .line 1
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xju0;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/high16 v3, 0x41200000    # 10.0f

    .line 14
    .line 15
    cmpl-float v2, v2, v3

    .line 16
    .line 17
    if-lez v2, :cond_1

    .line 18
    .line 19
    iget v0, v0, La/xju0;->h:F

    .line 20
    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    cmpl-float v0, v0, v2

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget p1, v1, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    iget p2, v1, Landroid/graphics/RectF;->top:F

    .line 31
    .line 32
    iget-object v0, p0, La/xa5;->d:La/ywq0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v2, La/bp10;->d:La/z960;

    .line 38
    .line 39
    invoke-virtual {v2}, La/z960;->b()La/y960;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, La/bp10;

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    iput-wide v4, v3, La/bp10;->b:D

    .line 48
    .line 49
    iput-wide v4, v3, La/bp10;->c:D

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2, v3}, La/ywq0;->n(FFLa/bp10;)V

    .line 52
    .line 53
    .line 54
    iget p1, v1, Landroid/graphics/RectF;->left:F

    .line 55
    .line 56
    iget p2, v1, Landroid/graphics/RectF;->bottom:F

    .line 57
    .line 58
    invoke-virtual {v2}, La/z960;->b()La/y960;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, La/bp10;

    .line 63
    .line 64
    iput-wide v4, v1, La/bp10;->b:D

    .line 65
    .line 66
    iput-wide v4, v1, La/bp10;->c:D

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2, v1}, La/ywq0;->n(FFLa/bp10;)V

    .line 69
    .line 70
    .line 71
    iget-wide p1, v1, La/bp10;->c:D

    .line 72
    .line 73
    double-to-float p1, p1

    .line 74
    iget-wide v4, v3, La/bp10;->c:D

    .line 75
    .line 76
    double-to-float p2, v4

    .line 77
    invoke-virtual {v2, v3}, La/z960;->c(La/y960;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, La/z960;->c(La/y960;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, La/xa5;->o1(FF)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public o1(FF)V
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, La/xa5;->c:La/wa5;

    .line 8
    .line 9
    iget v3, v1, La/wa5;->l:I

    .line 10
    .line 11
    sub-float v4, v2, v0

    .line 12
    .line 13
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    float-to-double v4, v4

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v3, :cond_e

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    cmpg-double v9, v4, v7

    .line 24
    .line 25
    if-lez v9, :cond_e

    .line 26
    .line 27
    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    if-eqz v9, :cond_0

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    int-to-double v9, v3

    .line 36
    div-double v9, v4, v9

    .line 37
    .line 38
    invoke-static {v9, v10}, La/dut0;->d(D)F

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    float-to-double v9, v9

    .line 43
    invoke-static {v9, v10}, Ljava/lang/Math;->log10(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v11

    .line 47
    double-to-int v11, v11

    .line 48
    int-to-double v11, v11

    .line 49
    const-wide/high16 v13, 0x4024000000000000L    # 10.0

    .line 50
    .line 51
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v11

    .line 55
    invoke-static {v11, v12}, La/dut0;->d(D)F

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    float-to-double v11, v11

    .line 60
    move-wide v15, v7

    .line 61
    div-double v7, v9, v11

    .line 62
    .line 63
    double-to-int v7, v7

    .line 64
    const/4 v8, 0x5

    .line 65
    if-le v7, v8, :cond_1

    .line 66
    .line 67
    mul-double/2addr v11, v13

    .line 68
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    :cond_1
    iget-boolean v7, v1, La/wa5;->m:Z

    .line 73
    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    double-to-float v2, v4

    .line 77
    add-int/lit8 v4, v3, -0x1

    .line 78
    .line 79
    int-to-float v4, v4

    .line 80
    div-float/2addr v2, v4

    .line 81
    float-to-double v9, v2

    .line 82
    iput v3, v1, La/wa5;->j:I

    .line 83
    .line 84
    iget-object v2, v1, La/wa5;->i:[F

    .line 85
    .line 86
    array-length v2, v2

    .line 87
    if-ge v2, v3, :cond_2

    .line 88
    .line 89
    new-array v2, v3, [F

    .line 90
    .line 91
    iput-object v2, v1, La/wa5;->i:[F

    .line 92
    .line 93
    :cond_2
    move v2, v6

    .line 94
    :goto_0
    if-ge v2, v3, :cond_c

    .line 95
    .line 96
    iget-object v4, v1, La/wa5;->i:[F

    .line 97
    .line 98
    aput v0, v4, v2

    .line 99
    .line 100
    float-to-double v4, v0

    .line 101
    add-double/2addr v4, v9

    .line 102
    double-to-float v0, v4

    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    cmpl-double v3, v9, v15

    .line 107
    .line 108
    if-nez v3, :cond_4

    .line 109
    .line 110
    move-wide v4, v15

    .line 111
    goto :goto_1

    .line 112
    :cond_4
    float-to-double v4, v0

    .line 113
    div-double/2addr v4, v9

    .line 114
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    mul-double/2addr v4, v9

    .line 119
    :goto_1
    if-nez v3, :cond_5

    .line 120
    .line 121
    move-wide v7, v15

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    float-to-double v7, v2

    .line 124
    div-double/2addr v7, v9

    .line 125
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    mul-double/2addr v7, v9

    .line 130
    const-wide/high16 v11, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 131
    .line 132
    cmpl-double v0, v7, v11

    .line 133
    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    add-double/2addr v7, v15

    .line 138
    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 139
    .line 140
    .line 141
    move-result-wide v11

    .line 142
    cmpl-double v0, v7, v15

    .line 143
    .line 144
    if-ltz v0, :cond_7

    .line 145
    .line 146
    const-wide/16 v7, 0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_7
    const-wide/16 v7, -0x1

    .line 150
    .line 151
    :goto_2
    add-long/2addr v11, v7

    .line 152
    invoke-static {v11, v12}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 153
    .line 154
    .line 155
    move-result-wide v7

    .line 156
    :goto_3
    if-eqz v3, :cond_8

    .line 157
    .line 158
    move-wide v2, v4

    .line 159
    move v0, v6

    .line 160
    :goto_4
    cmpg-double v11, v2, v7

    .line 161
    .line 162
    if-gtz v11, :cond_9

    .line 163
    .line 164
    add-int/lit8 v0, v0, 0x1

    .line 165
    .line 166
    add-double/2addr v2, v9

    .line 167
    goto :goto_4

    .line 168
    :cond_8
    move v0, v6

    .line 169
    :cond_9
    iput v0, v1, La/wa5;->j:I

    .line 170
    .line 171
    iget-object v2, v1, La/wa5;->i:[F

    .line 172
    .line 173
    array-length v2, v2

    .line 174
    if-ge v2, v0, :cond_a

    .line 175
    .line 176
    new-array v2, v0, [F

    .line 177
    .line 178
    iput-object v2, v1, La/wa5;->i:[F

    .line 179
    .line 180
    :cond_a
    move v2, v6

    .line 181
    :goto_5
    if-ge v2, v0, :cond_c

    .line 182
    .line 183
    cmpl-double v3, v4, v15

    .line 184
    .line 185
    if-nez v3, :cond_b

    .line 186
    .line 187
    move-wide v4, v15

    .line 188
    :cond_b
    iget-object v3, v1, La/wa5;->i:[F

    .line 189
    .line 190
    double-to-float v7, v4

    .line 191
    aput v7, v3, v2

    .line 192
    .line 193
    add-double/2addr v4, v9

    .line 194
    add-int/lit8 v2, v2, 0x1

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_c
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 198
    .line 199
    cmpg-double v0, v9, v2

    .line 200
    .line 201
    if-gez v0, :cond_d

    .line 202
    .line 203
    invoke-static {v9, v10}, Ljava/lang/Math;->log10(D)D

    .line 204
    .line 205
    .line 206
    move-result-wide v2

    .line 207
    neg-double v2, v2

    .line 208
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    double-to-int v0, v2

    .line 213
    iput v0, v1, La/wa5;->k:I

    .line 214
    .line 215
    return-void

    .line 216
    :cond_d
    iput v6, v1, La/wa5;->k:I

    .line 217
    .line 218
    return-void

    .line 219
    :cond_e
    :goto_6
    new-array v0, v6, [F

    .line 220
    .line 221
    iput-object v0, v1, La/wa5;->i:[F

    .line 222
    .line 223
    iput v6, v1, La/wa5;->j:I

    .line 224
    .line 225
    return-void
.end method
