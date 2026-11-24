.class public final La/ttd0;
.super La/ijj0;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/List;

.field public final d:J

.field public final e:F


# direct methods
.method public constructor <init>(Ljava/util/List;JF)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/ijj0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ttd0;->c:Ljava/util/List;

    .line 5
    .line 6
    iput-wide p2, p0, La/ttd0;->d:J

    .line 7
    .line 8
    iput p4, p0, La/ttd0;->e:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(J)Landroid/graphics/Shader;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    iget-wide v3, v0, La/ttd0;->d:J

    .line 9
    .line 10
    and-long/2addr v1, v3

    .line 11
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v1, v1, v5

    .line 17
    .line 18
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 19
    .line 20
    const-wide v5, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const/16 v7, 0x20

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p2}, La/p7x;->u(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    shr-long v8, v3, v7

    .line 34
    .line 35
    long-to-int v1, v8

    .line 36
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    and-long/2addr v3, v5

    .line 41
    long-to-int v3, v3

    .line 42
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    shr-long v8, v3, v7

    .line 48
    .line 49
    long-to-int v1, v8

    .line 50
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    cmpg-float v8, v8, v2

    .line 55
    .line 56
    if-nez v8, :cond_1

    .line 57
    .line 58
    shr-long v8, p1, v7

    .line 59
    .line 60
    long-to-int v1, v8

    .line 61
    :cond_1
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    and-long/2addr v3, v5

    .line 66
    long-to-int v3, v3

    .line 67
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    cmpg-float v4, v4, v2

    .line 72
    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    and-long v3, p1, v5

    .line 76
    .line 77
    long-to-int v3, v3

    .line 78
    :cond_2
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    int-to-long v8, v1

    .line 87
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    int-to-long v3, v1

    .line 92
    shl-long/2addr v8, v7

    .line 93
    and-long/2addr v3, v5

    .line 94
    or-long v11, v8, v3

    .line 95
    .line 96
    iget v1, v0, La/ttd0;->e:F

    .line 97
    .line 98
    cmpg-float v2, v1, v2

    .line 99
    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    invoke-static/range {p1 .. p2}, La/h7k0;->d(J)F

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/high16 v2, 0x40000000    # 2.0f

    .line 107
    .line 108
    div-float/2addr v1, v2

    .line 109
    :cond_3
    move v13, v1

    .line 110
    iget-object v0, v0, La/ttd0;->c:Ljava/util/List;

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    invoke-static {v0, v1}, La/ntr;->x0(Ljava/util/List;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    const/16 v3, 0x1d

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    if-lt v2, v3, :cond_4

    .line 123
    .line 124
    invoke-static {v0}, La/ntr;->v0(Ljava/util/List;)[J

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    const/4 v15, 0x0

    .line 129
    sget-object v10, La/vbv;->a:La/vbv;

    .line 130
    .line 131
    invoke-virtual/range {v10 .. v16}, La/vbv;->b(JF[J[FI)Landroid/graphics/RadialGradient;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    :cond_4
    invoke-static {v0}, La/ntr;->Z(Ljava/util/List;)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    move/from16 v3, v16

    .line 141
    .line 142
    move/from16 v16, v13

    .line 143
    .line 144
    new-instance v13, Landroid/graphics/RadialGradient;

    .line 145
    .line 146
    shr-long v7, v11, v7

    .line 147
    .line 148
    long-to-int v4, v7

    .line 149
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    and-long v4, v11, v5

    .line 154
    .line 155
    long-to-int v4, v4

    .line 156
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    invoke-static {v2, v0}, La/ntr;->h0(ILjava/util/List;)[I

    .line 161
    .line 162
    .line 163
    move-result-object v17

    .line 164
    invoke-static {v2, v1, v0}, La/ntr;->i0(ILjava/util/List;Ljava/util/List;)[F

    .line 165
    .line 166
    .line 167
    move-result-object v18

    .line 168
    invoke-static {v3}, La/knx;->R(I)Landroid/graphics/Shader$TileMode;

    .line 169
    .line 170
    .line 171
    move-result-object v19

    .line 172
    invoke-direct/range {v13 .. v19}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 173
    .line 174
    .line 175
    return-object v13
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ttd0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/ttd0;

    .line 11
    .line 12
    iget-object v1, p1, La/ttd0;->c:Ljava/util/List;

    .line 13
    .line 14
    iget-object v2, p0, La/ttd0;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-wide v1, p0, La/ttd0;->d:J

    .line 24
    .line 25
    iget-wide v3, p1, La/ttd0;->d:J

    .line 26
    .line 27
    invoke-static {v1, v2, v3, v4}, La/ne60;->c(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget p0, p0, La/ttd0;->e:F

    .line 35
    .line 36
    iget p1, p1, La/ttd0;->e:F

    .line 37
    .line 38
    cmpg-float p0, p0, p1

    .line 39
    .line 40
    if-nez p0, :cond_4

    .line 41
    .line 42
    return v0

    .line 43
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ttd0;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    iget-wide v1, p0, La/ttd0;->d:J

    .line 10
    .line 11
    const/16 v3, 0x1f

    .line 12
    .line 13
    invoke-static {v0, v3, v1, v2}, La/rw2;->b(IIJ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget p0, p0, La/ttd0;->e:F

    .line 18
    .line 19
    invoke-static {v0, p0, v3}, Lc;->a(IFI)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, p0

    .line 29
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    const-wide v0, 0x7fffffff7fffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iget-wide v2, p0, La/ttd0;->d:J

    .line 7
    .line 8
    and-long/2addr v0, v2

    .line 9
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v0, v4

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    const-string v4, ", "

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v2, v3}, La/ne60;->h(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "center="

    .line 27
    .line 28
    invoke-static {v2, v0, v4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v1

    .line 34
    :goto_0
    iget v2, p0, La/ttd0;->e:F

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const v5, 0x7fffffff

    .line 41
    .line 42
    .line 43
    and-int/2addr v3, v5

    .line 44
    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 45
    .line 46
    if-ge v3, v5, :cond_1

    .line 47
    .line 48
    const-string v1, "radius="

    .line 49
    .line 50
    invoke-static {v2, v1, v4}, La/rw2;->j(FLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_1
    const/4 v2, 0x0

    .line 55
    invoke-static {v2}, La/knm0;->u(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const-string v3, "RadialGradient(colors="

    .line 60
    .line 61
    const-string v4, ", stops=null, "

    .line 62
    .line 63
    iget-object p0, p0, La/ttd0;->c:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v3, v4, v0, p0, v1}, La/ua80;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v0, "tileMode="

    .line 70
    .line 71
    const-string v1, ")"

    .line 72
    .line 73
    invoke-static {p0, v0, v2, v1}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method
