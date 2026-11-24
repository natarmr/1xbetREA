.class public final La/ahg0;
.super La/lls0;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(FFFF)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/ahg0;->a:F

    .line 5
    .line 6
    iput p2, p0, La/ahg0;->b:F

    .line 7
    .line 8
    iput p3, p0, La/ahg0;->c:F

    .line 9
    .line 10
    iput p4, p0, La/ahg0;->d:F

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    cmpl-float v1, p1, v0

    .line 14
    .line 15
    if-ltz v1, :cond_0

    .line 16
    .line 17
    cmpl-float v1, p2, v0

    .line 18
    .line 19
    if-ltz v1, :cond_0

    .line 20
    .line 21
    cmpl-float v1, p3, v0

    .line 22
    .line 23
    if-ltz v1, :cond_0

    .line 24
    .line 25
    cmpl-float v0, p4, v0

    .line 26
    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    const-class v0, La/ahg0;

    .line 30
    .line 31
    sget-object v1, La/sre0;->a:La/tre0;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, La/sgy;->v()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, "-"

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ","

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, La/ahg0;->e:Ljava/lang/String;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_0
    const-string p0, "All radii must be >= 0."

    .line 85
    .line 86
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ahg0;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Landroid/graphics/Bitmap;La/f7k0;)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    sget-object v5, La/f7k0;->c:La/f7k0;

    .line 2
    .line 3
    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p2, v0}, La/z1x;->B(II)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v0, p2, La/f7k0;->a:La/umk;

    .line 23
    .line 24
    iget-object v1, p2, La/f7k0;->b:La/umk;

    .line 25
    .line 26
    instance-of v2, v0, La/rmk;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    instance-of v2, v1, La/rmk;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    check-cast v0, La/rmk;

    .line 35
    .line 36
    iget p2, v0, La/rmk;->a:I

    .line 37
    .line 38
    check-cast v1, La/rmk;

    .line 39
    .line 40
    iget v0, v1, La/rmk;->a:I

    .line 41
    .line 42
    invoke-static {p2, v0}, La/z1x;->B(II)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    move-object v2, v1

    .line 52
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget-object p2, p2, La/f7k0;->a:La/umk;

    .line 57
    .line 58
    instance-of v3, p2, La/rmk;

    .line 59
    .line 60
    const/high16 v4, -0x80000000

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    check-cast p2, La/rmk;

    .line 65
    .line 66
    iget p2, p2, La/rmk;->a:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move p2, v4

    .line 70
    :goto_0
    instance-of v3, v2, La/rmk;

    .line 71
    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    check-cast v2, La/rmk;

    .line 75
    .line 76
    iget v4, v2, La/rmk;->a:I

    .line 77
    .line 78
    :cond_3
    move v3, v4

    .line 79
    sget-object v4, La/j1h0;->a:La/j1h0;

    .line 80
    .line 81
    move v2, p2

    .line 82
    invoke-static/range {v0 .. v5}, La/u1c;->A(IIIILa/j1h0;La/f7k0;)D

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    int-to-double v2, p2

    .line 91
    mul-double/2addr v2, v0

    .line 92
    invoke-static {v2, v3}, La/si30;->a(D)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    int-to-double v2, v2

    .line 101
    mul-double/2addr v0, v2

    .line 102
    invoke-static {v0, v1}, La/si30;->a(D)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {p2, v0}, La/z1x;->B(II)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    :goto_1
    const/16 p2, 0x20

    .line 111
    .line 112
    shr-long v2, v0, p2

    .line 113
    .line 114
    long-to-int p2, v2

    .line 115
    const-wide v2, 0xffffffffL

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    and-long/2addr v0, v2

    .line 121
    long-to-int v0, v0

    .line 122
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez v1, :cond_4

    .line 127
    .line 128
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 129
    .line 130
    :cond_4
    invoke-static {p2, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-instance v2, Landroid/graphics/Canvas;

    .line 135
    .line 136
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2, v0}, La/qsm0;->w(Landroid/graphics/Bitmap;II)Landroid/graphics/Paint;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    iget v7, p0, La/ahg0;->a:F

    .line 144
    .line 145
    iget p1, p0, La/ahg0;->b:F

    .line 146
    .line 147
    cmpg-float v3, v7, p1

    .line 148
    .line 149
    iget v4, p0, La/ahg0;->d:F

    .line 150
    .line 151
    iget p0, p0, La/ahg0;->c:F

    .line 152
    .line 153
    if-nez v3, :cond_5

    .line 154
    .line 155
    cmpg-float v3, p1, p0

    .line 156
    .line 157
    if-nez v3, :cond_5

    .line 158
    .line 159
    cmpg-float v3, p0, v4

    .line 160
    .line 161
    if-nez v3, :cond_5

    .line 162
    .line 163
    int-to-float v5, p2

    .line 164
    int-to-float v6, v0

    .line 165
    const/4 v3, 0x0

    .line 166
    const/4 v4, 0x0

    .line 167
    move v8, v7

    .line 168
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    return-object v1

    .line 172
    :cond_5
    const/16 v3, 0x8

    .line 173
    .line 174
    new-array v3, v3, [F

    .line 175
    .line 176
    const/4 v5, 0x0

    .line 177
    aput v7, v3, v5

    .line 178
    .line 179
    const/4 v5, 0x1

    .line 180
    aput v7, v3, v5

    .line 181
    .line 182
    const/4 v5, 0x2

    .line 183
    aput p1, v3, v5

    .line 184
    .line 185
    const/4 v5, 0x3

    .line 186
    aput p1, v3, v5

    .line 187
    .line 188
    const/4 p1, 0x4

    .line 189
    aput v4, v3, p1

    .line 190
    .line 191
    const/4 p1, 0x5

    .line 192
    aput v4, v3, p1

    .line 193
    .line 194
    const/4 p1, 0x6

    .line 195
    aput p0, v3, p1

    .line 196
    .line 197
    const/4 p1, 0x7

    .line 198
    aput p0, v3, p1

    .line 199
    .line 200
    new-instance p0, Landroid/graphics/RectF;

    .line 201
    .line 202
    int-to-float p1, p2

    .line 203
    int-to-float p2, v0

    .line 204
    const/4 v0, 0x0

    .line 205
    invoke-direct {p0, v0, v0, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 206
    .line 207
    .line 208
    new-instance p1, Landroid/graphics/Path;

    .line 209
    .line 210
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 211
    .line 212
    .line 213
    sget-object p2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 214
    .line 215
    invoke-virtual {p1, p0, v3, p2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, p1, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 219
    .line 220
    .line 221
    return-object v1
.end method
