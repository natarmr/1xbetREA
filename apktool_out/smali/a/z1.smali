.class public abstract La/z1;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;
.implements La/v6z;
.implements La/qai0;


# instance fields
.field public o:La/u12;

.field public p:La/qge;

.field public q:F

.field public r:La/a4d;

.field public s:Z

.field public t:Ljava/lang/String;

.field public u:La/t4e;


# direct methods
.method public constructor <init>(La/u12;La/qge;FLa/a4d;ZLjava/lang/String;La/t4e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z1;->o:La/u12;

    .line 5
    .line 6
    iput-object p2, p0, La/z1;->p:La/qge;

    .line 7
    .line 8
    iput p3, p0, La/z1;->q:F

    .line 9
    .line 10
    iput-object p4, p0, La/z1;->r:La/a4d;

    .line 11
    .line 12
    iput-boolean p5, p0, La/z1;->s:Z

    .line 13
    .line 14
    iput-object p6, p0, La/z1;->t:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, La/z1;->u:La/t4e;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final O0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final U(La/c810;La/pj30;I)I
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x7

    .line 3
    invoke-static {p1, p1, p1, p3, v0}, La/r4e;->b(IIIII)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, La/z1;->u:La/t4e;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, La/t4e;->h(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, La/pm80;->i()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p1, v2, v4

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, La/z1;->b1(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    invoke-interface {p2, p3}, La/pj30;->P(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, p1}, La/p4e;->k(J)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    invoke-interface {p2, p3}, La/pj30;->P(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public final Z0(J)J
    .locals 10

    .line 1
    invoke-static {p1, p2}, La/h7k0;->f(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, La/pm80;->i()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v2, v0, v2

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    const/16 v2, 0x20

    .line 29
    .line 30
    shr-long v3, v0, v2

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 42
    .line 43
    .line 44
    cmpg-float v4, v4, v5

    .line 45
    .line 46
    if-gtz v4, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    shr-long v3, p1, v2

    .line 50
    .line 51
    long-to-int v3, v3

    .line 52
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    :goto_0
    const-wide v6, 0xffffffffL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    and-long/2addr v0, v6

    .line 62
    long-to-int v0, v0

    .line 63
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    cmpg-float v1, v1, v5

    .line 72
    .line 73
    if-gtz v1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    and-long v0, p1, v6

    .line 77
    .line 78
    long-to-int v0, v0

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    :goto_1
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    int-to-long v3, v1

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    int-to-long v0, v0

    .line 93
    shl-long/2addr v3, v2

    .line 94
    and-long/2addr v0, v6

    .line 95
    or-long/2addr v0, v3

    .line 96
    iget-object p0, p0, La/z1;->p:La/qge;

    .line 97
    .line 98
    invoke-interface {p0, v0, v1, p1, p2}, La/qge;->a(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    shr-long v8, v3, v2

    .line 103
    .line 104
    long-to-int p0, v8

    .line 105
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    cmpg-float p0, p0, v5

    .line 114
    .line 115
    if-gtz p0, :cond_4

    .line 116
    .line 117
    and-long/2addr v6, v3

    .line 118
    long-to-int p0, v6

    .line 119
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    cmpg-float p0, p0, v5

    .line 128
    .line 129
    if-gtz p0, :cond_4

    .line 130
    .line 131
    invoke-static {v0, v1, v3, v4}, La/q8x;->I(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide p0

    .line 135
    return-wide p0

    .line 136
    :cond_4
    :goto_2
    return-wide p1
.end method

.method public abstract a1()La/pm80;
.end method

.method public final b1(J)J
    .locals 9

    .line 1
    invoke-static {p1, p2}, La/p4e;->g(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, La/p4e;->f(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {p1, p2}, La/p4e;->e(J)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-static {p1, p2}, La/p4e;->d(J)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v3, 0x0

    .line 33
    :goto_0
    invoke-virtual {v2}, La/pm80;->i()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v6, v4, v6

    .line 43
    .line 44
    if-nez v6, :cond_4

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    instance-of p0, v2, La/mz3;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    check-cast v2, La/mz3;

    .line 53
    .line 54
    iget-object p0, v2, La/mz3;->u:La/xae0;

    .line 55
    .line 56
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 57
    .line 58
    invoke-interface {p0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/lz3;

    .line 63
    .line 64
    invoke-interface {p0}, La/lz3;->a()La/pm80;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-nez p0, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {p1, p2}, La/p4e;->i(J)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-static {p1, p2}, La/p4e;->h(J)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    const/4 v5, 0x0

    .line 80
    const/16 v6, 0xa

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    move-wide v0, p1

    .line 84
    invoke-static/range {v0 .. v6}, La/p4e;->b(JIIIII)J

    .line 85
    .line 86
    .line 87
    move-result-wide p0

    .line 88
    return-wide p0

    .line 89
    :cond_3
    :goto_1
    return-wide p1

    .line 90
    :cond_4
    const-wide v6, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    const/16 v2, 0x20

    .line 96
    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    :cond_5
    invoke-static {p1, p2}, La/p4e;->i(J)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    int-to-float v0, v0

    .line 108
    invoke-static {p1, p2}, La/p4e;->h(J)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    :goto_2
    int-to-float v1, v1

    .line 113
    goto :goto_6

    .line 114
    :cond_6
    shr-long v0, v4, v2

    .line 115
    .line 116
    long-to-int v0, v0

    .line 117
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    and-long v3, v4, v6

    .line 122
    .line 123
    long-to-int v1, v3

    .line 124
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 133
    .line 134
    .line 135
    cmpg-float v3, v3, v4

    .line 136
    .line 137
    if-gtz v3, :cond_9

    .line 138
    .line 139
    sget v3, La/iut0;->b:I

    .line 140
    .line 141
    invoke-static {p1, p2}, La/p4e;->k(J)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    int-to-float v3, v3

    .line 146
    invoke-static {p1, p2}, La/p4e;->i(J)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    int-to-float v5, v5

    .line 151
    cmpg-float v8, v0, v3

    .line 152
    .line 153
    if-gez v8, :cond_7

    .line 154
    .line 155
    move v0, v3

    .line 156
    :cond_7
    cmpl-float v3, v0, v5

    .line 157
    .line 158
    if-lez v3, :cond_8

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_8
    move v5, v0

    .line 162
    :goto_3
    move v0, v5

    .line 163
    goto :goto_4

    .line 164
    :cond_9
    invoke-static {p1, p2}, La/p4e;->k(J)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    int-to-float v0, v0

    .line 169
    :goto_4
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    cmpg-float v3, v3, v4

    .line 174
    .line 175
    if-gtz v3, :cond_c

    .line 176
    .line 177
    sget v3, La/iut0;->b:I

    .line 178
    .line 179
    invoke-static {p1, p2}, La/p4e;->j(J)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    int-to-float v3, v3

    .line 184
    invoke-static {p1, p2}, La/p4e;->h(J)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    int-to-float v4, v4

    .line 189
    cmpg-float v5, v1, v3

    .line 190
    .line 191
    if-gez v5, :cond_a

    .line 192
    .line 193
    move v1, v3

    .line 194
    :cond_a
    cmpl-float v3, v1, v4

    .line 195
    .line 196
    if-lez v3, :cond_b

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_b
    move v4, v1

    .line 200
    :goto_5
    move v1, v4

    .line 201
    goto :goto_6

    .line 202
    :cond_c
    invoke-static {p1, p2}, La/p4e;->j(J)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    goto :goto_2

    .line 207
    :goto_6
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    int-to-long v3, v0

    .line 212
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    int-to-long v0, v0

    .line 217
    shl-long/2addr v3, v2

    .line 218
    and-long/2addr v0, v6

    .line 219
    or-long/2addr v0, v3

    .line 220
    invoke-virtual {p0, v0, v1}, La/z1;->Z0(J)J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    shr-long v2, v0, v2

    .line 225
    .line 226
    long-to-int p0, v2

    .line 227
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    and-long/2addr v0, v6

    .line 232
    long-to-int v0, v0

    .line 233
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-static {p0}, La/si30;->b(F)I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    invoke-static {p0, p1, p2}, La/r4e;->g(IJ)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-static {v0}, La/si30;->b(F)I

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    invoke-static {p0, p1, p2}, La/r4e;->f(IJ)I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    const/4 v5, 0x0

    .line 254
    const/16 v6, 0xa

    .line 255
    .line 256
    const/4 v3, 0x0

    .line 257
    move-wide v0, p1

    .line 258
    invoke-static/range {v0 .. v6}, La/p4e;->b(JIIIII)J

    .line 259
    .line 260
    .line 261
    move-result-wide p0

    .line 262
    return-wide p0
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 1

    .line 1
    iget-object v0, p0, La/z1;->u:La/t4e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p3, p4}, La/t4e;->h(J)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p3, p4}, La/z1;->b1(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p3

    .line 12
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget p2, p0, La/pu90;->a:I

    .line 17
    .line 18
    iget p3, p0, La/pu90;->b:I

    .line 19
    .line 20
    new-instance p4, La/y1;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p4, p0, v0}, La/y1;-><init>(La/pu90;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2, p3, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final e0(La/c810;La/pj30;I)I
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x7

    .line 3
    invoke-static {p1, p1, p1, p3, v0}, La/r4e;->b(IIIII)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, La/z1;->u:La/t4e;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, La/t4e;->h(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, La/pm80;->i()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p1, v2, v4

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, La/z1;->b1(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    invoke-interface {p2, p3}, La/pj30;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, p1}, La/p4e;->k(J)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    invoke-interface {p2, p3}, La/pj30;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
.end method

.method public final u0(La/g7z;)V
    .locals 13

    .line 1
    iget-object v0, p1, La/g7z;->a:La/a6a;

    .line 2
    .line 3
    invoke-interface {v0}, La/fhl;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {p0, v1, v2}, La/z1;->Z0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    iget-object v7, p0, La/z1;->o:La/u12;

    .line 12
    .line 13
    invoke-static {v5, v6}, La/iut0;->e(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v8

    .line 17
    invoke-interface {v0}, La/fhl;->d()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {v1, v2}, La/iut0;->e(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v10

    .line 25
    invoke-virtual {p1}, La/g7z;->getLayoutDirection()La/k6z;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    invoke-interface/range {v7 .. v12}, La/u12;->a(JJLa/k6z;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    shr-long v3, v1, v3

    .line 36
    .line 37
    long-to-int v3, v3

    .line 38
    const-wide v7, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v1, v7

    .line 44
    long-to-int v1, v1

    .line 45
    iget-object v2, v0, La/a6a;->b:La/nr;

    .line 46
    .line 47
    invoke-virtual {v2}, La/nr;->p()J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, La/x5a;->l()V

    .line 56
    .line 57
    .line 58
    :try_start_0
    iget-object v0, v2, La/nr;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, La/fvt0;

    .line 61
    .line 62
    iget-boolean v4, p0, La/z1;->s:Z

    .line 63
    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    const/16 v4, 0x1f

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    invoke-static {v0, v7, v7, v4}, La/fvt0;->m(La/fvt0;FFI)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    :goto_0
    int-to-float v3, v3

    .line 77
    int-to-float v1, v1

    .line 78
    invoke-virtual {v0, v3, v1}, La/fvt0;->A(FF)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget v7, p0, La/z1;->q:F

    .line 86
    .line 87
    iget-object v8, p0, La/z1;->r:La/a4d;

    .line 88
    .line 89
    move-object v4, p1

    .line 90
    invoke-virtual/range {v3 .. v8}, La/pm80;->e(La/fhl;JFLa/a4d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-interface {p0}, La/x5a;->i()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v9, v10}, La/nr;->H(J)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, La/g7z;->a()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :goto_1
    invoke-static {v2, v9, v10}, Lc;->g(La/nr;J)V

    .line 108
    .line 109
    .line 110
    throw p0
.end method

.method public final v(La/c810;La/pj30;I)I
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const/16 v0, 0xd

    .line 3
    .line 4
    invoke-static {p1, p3, p1, p1, v0}, La/r4e;->b(IIIII)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-object p1, p0, La/z1;->u:La/t4e;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, La/t4e;->h(J)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, La/pm80;->i()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long p1, v2, v4

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, La/z1;->b1(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    invoke-interface {p2, p3}, La/pj30;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-static {p0, p1}, La/p4e;->j(J)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_1
    invoke-interface {p2, p3}, La/pj30;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public final w(La/c810;La/pj30;I)I
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const/16 v0, 0xd

    .line 3
    .line 4
    invoke-static {p1, p3, p1, p1, v0}, La/r4e;->b(IIIII)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-object p1, p0, La/z1;->u:La/t4e;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, La/t4e;->h(J)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/z1;->a1()La/pm80;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, La/pm80;->i()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long p1, v2, v4

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, La/z1;->b1(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    invoke-interface {p2, p3}, La/pj30;->D(I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-static {p0, p1}, La/p4e;->j(J)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_1
    invoke-interface {p2, p3}, La/pj30;->D(I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public final x0(La/abi0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z1;->t:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p0}, La/yai0;->b(La/abi0;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x5

    .line 9
    invoke-static {p1, p0}, La/yai0;->e(La/abi0;I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
