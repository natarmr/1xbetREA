.class public final La/tww0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ljava/io/ByteArrayInputStream;

.field public b:La/qbu0;

.field public final c:[B

.field public final d:La/owp0;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, La/tww0;->c:[B

    .line 9
    .line 10
    new-instance v0, La/owp0;

    .line 11
    .line 12
    const/16 v1, 0x18

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/owp0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/tww0;->d:La/owp0;

    .line 18
    .line 19
    iput-object p1, p0, La/tww0;->a:Ljava/io/ByteArrayInputStream;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    const/16 v0, -0x80

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/tww0;->q(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/tww0;->n()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/tww0;->l()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-ltz v4, :cond_1

    .line 18
    .line 19
    if-lez v4, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, La/tww0;->d:La/owp0;

    .line 22
    .line 23
    iget-object p0, p0, La/owp0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-wide v0

    .line 35
    :cond_1
    const-string p0, "the maximum supported array length is 9223372036854775807"

    .line 36
    .line 37
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-wide v2
.end method

.method public final c()J
    .locals 5

    .line 1
    invoke-virtual {p0}, La/tww0;->e()La/qbu0;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/tww0;->b:La/qbu0;

    .line 5
    .line 6
    iget-byte v0, v0, La/qbu0;->a:B

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v1, 0x20

    .line 13
    .line 14
    if-ne v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, La/tww0;->l()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long p0, v1, v3

    .line 24
    .line 25
    if-ltz p0, :cond_2

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-wide v1

    .line 30
    :cond_1
    not-long v0, v1

    .line 31
    return-wide v0

    .line 32
    :cond_2
    const-string p0, "the maximum supported unsigned/negative integer is 9223372036854775807"

    .line 33
    .line 34
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    const-wide/16 v0, 0x0

    .line 38
    .line 39
    return-wide v0

    .line 40
    :cond_3
    shr-int/lit8 p0, v0, 0x5

    .line 41
    .line 42
    and-int/lit8 p0, p0, 0x7

    .line 43
    .line 44
    const-string v0, "expected major type 0 or 1 but found "

    .line 45
    .line 46
    invoke-static {p0, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, La/tww0;->a:Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/tww0;->d:La/owp0;

    .line 7
    .line 8
    invoke-virtual {p0}, La/owp0;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d()J
    .locals 7

    .line 1
    const/16 v0, -0x60

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/tww0;->q(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/tww0;->n()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/tww0;->l()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-ltz v4, :cond_1

    .line 18
    .line 19
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v5, v0, v5

    .line 25
    .line 26
    if-gtz v5, :cond_1

    .line 27
    .line 28
    if-lez v4, :cond_0

    .line 29
    .line 30
    add-long v2, v0, v0

    .line 31
    .line 32
    iget-object p0, p0, La/tww0;->d:La/owp0;

    .line 33
    .line 34
    iget-object p0, p0, La/owp0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljava/util/ArrayDeque;

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-wide v0

    .line 46
    :cond_1
    const-string p0, "the maximum supported map length is 4611686018427387903L"

    .line 47
    .line 48
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-wide v2
.end method

.method public final e()La/qbu0;
    .locals 12

    .line 1
    iget-object v0, p0, La/tww0;->d:La/owp0;

    .line 2
    .line 3
    iget-object v1, v0, La/owp0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayDeque;

    .line 6
    .line 7
    iget-object v2, p0, La/tww0;->b:La/qbu0;

    .line 8
    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    iget-object v2, p0, La/tww0;->a:Ljava/io/ByteArrayInputStream;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, La/owp0;->l()V

    .line 22
    .line 23
    .line 24
    return-object v4

    .line 25
    :cond_0
    new-instance v3, La/qbu0;

    .line 26
    .line 27
    invoke-direct {v3, v2}, La/qbu0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v3, p0, La/tww0;->b:La/qbu0;

    .line 31
    .line 32
    const/16 v2, -0x80

    .line 33
    .line 34
    const-wide/16 v5, -0x5

    .line 35
    .line 36
    const-wide/16 v7, -0x2

    .line 37
    .line 38
    const-wide/16 v9, -0x1

    .line 39
    .line 40
    iget-byte v11, v3, La/qbu0;->a:B

    .line 41
    .line 42
    if-eq v11, v2, :cond_6

    .line 43
    .line 44
    const/16 v2, -0x60

    .line 45
    .line 46
    if-eq v11, v2, :cond_6

    .line 47
    .line 48
    const/16 v2, -0x40

    .line 49
    .line 50
    if-eq v11, v2, :cond_6

    .line 51
    .line 52
    const/16 v2, -0x20

    .line 53
    .line 54
    if-eq v11, v2, :cond_3

    .line 55
    .line 56
    if-eqz v11, :cond_6

    .line 57
    .line 58
    const/16 v2, 0x20

    .line 59
    .line 60
    if-eq v11, v2, :cond_6

    .line 61
    .line 62
    const/16 v2, 0x40

    .line 63
    .line 64
    if-eq v11, v2, :cond_2

    .line 65
    .line 66
    const/16 v2, 0x60

    .line 67
    .line 68
    if-ne v11, v2, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0, v7, v8}, La/owp0;->m(J)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    shr-int/lit8 p0, v11, 0x5

    .line 75
    .line 76
    and-int/lit8 p0, p0, 0x7

    .line 77
    .line 78
    const-string v0, "invalid major type: "

    .line 79
    .line 80
    invoke-static {p0, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v4

    .line 88
    :cond_2
    invoke-virtual {v0, v9, v10}, La/owp0;->m(J)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    iget-byte v2, v3, La/qbu0;->b:B

    .line 93
    .line 94
    const/16 v3, 0x1f

    .line 95
    .line 96
    if-ne v2, v3, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, La/owp0;->n()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    const-wide/16 v7, 0x0

    .line 103
    .line 104
    cmp-long v0, v2, v7

    .line 105
    .line 106
    if-gez v0, :cond_5

    .line 107
    .line 108
    cmp-long v0, v2, v5

    .line 109
    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    const-string p0, "expected a value for dangling key in indefinite-length map"

    .line 117
    .line 118
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v4

    .line 122
    :cond_5
    const-string p0, "expected indefinite length scope but found "

    .line 123
    .line 124
    invoke-static {v2, v3, p0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v4

    .line 132
    :cond_6
    invoke-virtual {v0}, La/owp0;->n()J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    cmp-long v11, v2, v9

    .line 137
    .line 138
    if-eqz v11, :cond_a

    .line 139
    .line 140
    cmp-long v2, v2, v7

    .line 141
    .line 142
    if-eqz v2, :cond_b

    .line 143
    .line 144
    :goto_0
    invoke-virtual {v0}, La/owp0;->n()J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    const-wide/16 v7, 0x1

    .line 149
    .line 150
    cmp-long v0, v2, v7

    .line 151
    .line 152
    if-nez v0, :cond_7

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_7
    if-lez v0, :cond_8

    .line 159
    .line 160
    add-long/2addr v2, v9

    .line 161
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_8
    const-wide/16 v7, -0x4

    .line 173
    .line 174
    cmp-long v0, v2, v7

    .line 175
    .line 176
    if-nez v0, :cond_9

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_9
    cmp-long v0, v2, v5

    .line 190
    .line 191
    if-nez v0, :cond_c

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_a
    move-wide v7, v2

    .line 205
    :cond_b
    const-string p0, "expected non-string scope but found "

    .line 206
    .line 207
    invoke-static {v7, v8, p0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v4

    .line 215
    :cond_c
    :goto_1
    iget-object p0, p0, La/tww0;->b:La/qbu0;

    .line 216
    .line 217
    return-object p0
.end method

.method public final k()Z
    .locals 2

    .line 1
    const/16 v0, -0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/tww0;->q(B)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/tww0;->b:La/qbu0;

    .line 7
    .line 8
    iget-byte v0, v0, La/qbu0;->b:B

    .line 9
    .line 10
    const/16 v1, 0x18

    .line 11
    .line 12
    if-gt v0, v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, La/tww0;->l()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int p0, v0

    .line 19
    const/16 v0, 0x14

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_0
    const/16 v0, 0x15

    .line 26
    .line 27
    if-ne p0, v0, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const-string p0, "expected FALSE or TRUE"

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_2
    const-string p0, "expected simple value"

    .line 39
    .line 40
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0
.end method

.method public final l()J
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/tww0;->b:La/qbu0;

    .line 4
    .line 5
    iget-byte v2, v1, La/qbu0;->b:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x18

    .line 9
    .line 10
    if-ge v2, v4, :cond_0

    .line 11
    .line 12
    int-to-long v1, v2

    .line 13
    iput-object v3, v0, La/tww0;->b:La/qbu0;

    .line 14
    .line 15
    return-wide v1

    .line 16
    :cond_0
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    const-wide/16 v7, 0xff

    .line 19
    .line 20
    if-ne v2, v4, :cond_2

    .line 21
    .line 22
    iget-object v1, v0, La/tww0;->a:Ljava/io/ByteArrayInputStream;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, -0x1

    .line 29
    if-eq v1, v2, :cond_1

    .line 30
    .line 31
    iput-object v3, v0, La/tww0;->b:La/qbu0;

    .line 32
    .line 33
    int-to-long v0, v1

    .line 34
    and-long/2addr v0, v7

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-static {}, La/c99;->f()V

    .line 37
    .line 38
    .line 39
    return-wide v5

    .line 40
    :cond_2
    const/16 v3, 0x19

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x2

    .line 45
    const/16 v12, 0x8

    .line 46
    .line 47
    iget-object v13, v0, La/tww0;->c:[B

    .line 48
    .line 49
    if-ne v2, v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, v13, v11}, La/tww0;->r([BI)V

    .line 52
    .line 53
    .line 54
    aget-byte v0, v13, v10

    .line 55
    .line 56
    int-to-long v0, v0

    .line 57
    aget-byte v2, v13, v9

    .line 58
    .line 59
    int-to-long v2, v2

    .line 60
    and-long/2addr v0, v7

    .line 61
    shl-long/2addr v0, v12

    .line 62
    and-long/2addr v2, v7

    .line 63
    or-long/2addr v0, v2

    .line 64
    return-wide v0

    .line 65
    :cond_3
    const/16 v3, 0x1a

    .line 66
    .line 67
    const/16 v14, 0x10

    .line 68
    .line 69
    const/4 v15, 0x3

    .line 70
    move/from16 v16, v4

    .line 71
    .line 72
    const/4 v4, 0x4

    .line 73
    if-ne v2, v3, :cond_4

    .line 74
    .line 75
    invoke-virtual {v0, v13, v4}, La/tww0;->r([BI)V

    .line 76
    .line 77
    .line 78
    aget-byte v0, v13, v10

    .line 79
    .line 80
    int-to-long v0, v0

    .line 81
    aget-byte v2, v13, v9

    .line 82
    .line 83
    int-to-long v2, v2

    .line 84
    aget-byte v4, v13, v11

    .line 85
    .line 86
    int-to-long v4, v4

    .line 87
    aget-byte v6, v13, v15

    .line 88
    .line 89
    int-to-long v9, v6

    .line 90
    and-long/2addr v0, v7

    .line 91
    shl-long v0, v0, v16

    .line 92
    .line 93
    and-long/2addr v2, v7

    .line 94
    and-long/2addr v4, v7

    .line 95
    shl-long/2addr v2, v14

    .line 96
    or-long/2addr v0, v2

    .line 97
    shl-long v2, v4, v12

    .line 98
    .line 99
    or-long/2addr v0, v2

    .line 100
    and-long v2, v9, v7

    .line 101
    .line 102
    or-long/2addr v0, v2

    .line 103
    return-wide v0

    .line 104
    :cond_4
    const/16 v3, 0x1b

    .line 105
    .line 106
    const/16 v17, 0x7

    .line 107
    .line 108
    const/16 v18, 0x5

    .line 109
    .line 110
    if-ne v2, v3, :cond_5

    .line 111
    .line 112
    invoke-virtual {v0, v13, v12}, La/tww0;->r([BI)V

    .line 113
    .line 114
    .line 115
    aget-byte v0, v13, v10

    .line 116
    .line 117
    int-to-long v0, v0

    .line 118
    aget-byte v2, v13, v9

    .line 119
    .line 120
    int-to-long v2, v2

    .line 121
    aget-byte v5, v13, v11

    .line 122
    .line 123
    int-to-long v5, v5

    .line 124
    aget-byte v9, v13, v15

    .line 125
    .line 126
    int-to-long v9, v9

    .line 127
    aget-byte v4, v13, v4

    .line 128
    .line 129
    move-wide/from16 v19, v7

    .line 130
    .line 131
    int-to-long v7, v4

    .line 132
    aget-byte v4, v13, v18

    .line 133
    .line 134
    move v15, v12

    .line 135
    move-object v11, v13

    .line 136
    int-to-long v12, v4

    .line 137
    const/4 v4, 0x6

    .line 138
    aget-byte v4, v11, v4

    .line 139
    .line 140
    move/from16 v21, v14

    .line 141
    .line 142
    move/from16 p0, v15

    .line 143
    .line 144
    int-to-long v14, v4

    .line 145
    aget-byte v4, v11, v17

    .line 146
    .line 147
    move-wide/from16 v22, v0

    .line 148
    .line 149
    int-to-long v0, v4

    .line 150
    and-long v7, v7, v19

    .line 151
    .line 152
    shl-long v7, v7, v16

    .line 153
    .line 154
    and-long v16, v22, v19

    .line 155
    .line 156
    and-long v2, v2, v19

    .line 157
    .line 158
    and-long v4, v5, v19

    .line 159
    .line 160
    and-long v9, v9, v19

    .line 161
    .line 162
    and-long v11, v12, v19

    .line 163
    .line 164
    and-long v13, v14, v19

    .line 165
    .line 166
    const/16 v6, 0x38

    .line 167
    .line 168
    shl-long v15, v16, v6

    .line 169
    .line 170
    const/16 v6, 0x30

    .line 171
    .line 172
    shl-long/2addr v2, v6

    .line 173
    or-long/2addr v2, v15

    .line 174
    const/16 v6, 0x28

    .line 175
    .line 176
    shl-long/2addr v4, v6

    .line 177
    or-long/2addr v2, v4

    .line 178
    const/16 v4, 0x20

    .line 179
    .line 180
    shl-long v4, v9, v4

    .line 181
    .line 182
    or-long/2addr v2, v4

    .line 183
    or-long/2addr v2, v7

    .line 184
    shl-long v4, v11, v21

    .line 185
    .line 186
    or-long/2addr v2, v4

    .line 187
    shl-long v4, v13, p0

    .line 188
    .line 189
    or-long/2addr v2, v4

    .line 190
    and-long v0, v0, v19

    .line 191
    .line 192
    or-long/2addr v0, v2

    .line 193
    return-wide v0

    .line 194
    :cond_5
    iget-byte v0, v1, La/qbu0;->a:B

    .line 195
    .line 196
    shr-int/lit8 v0, v0, 0x5

    .line 197
    .line 198
    and-int/lit8 v0, v0, 0x7

    .line 199
    .line 200
    const-string v1, "invalid additional information "

    .line 201
    .line 202
    const-string v3, " for major type "

    .line 203
    .line 204
    invoke-static {v2, v1, v0, v3}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, La/ohq;->l(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-wide v5
.end method

.method public final n()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/tww0;->e()La/qbu0;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/tww0;->b:La/qbu0;

    .line 5
    .line 6
    iget-byte p0, p0, La/qbu0;->b:B

    .line 7
    .line 8
    const/16 v0, 0x1f

    .line 9
    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "expected definite length but found "

    .line 14
    .line 15
    invoke-static {p0, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final q(B)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/tww0;->e()La/qbu0;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/tww0;->b:La/qbu0;

    .line 5
    .line 6
    iget-byte p0, p0, La/qbu0;->a:B

    .line 7
    .line 8
    if-ne p0, p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    shr-int/lit8 p1, p1, 0x5

    .line 12
    .line 13
    and-int/lit8 p1, p1, 0x7

    .line 14
    .line 15
    shr-int/lit8 p0, p0, 0x5

    .line 16
    .line 17
    and-int/lit8 p0, p0, 0x7

    .line 18
    .line 19
    const-string v0, "expected major type "

    .line 20
    .line 21
    const-string v1, " but found "

    .line 22
    .line 23
    invoke-static {p1, v0, p0, v1}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final r([BI)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eq v0, p2, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, La/tww0;->a:Ljava/io/ByteArrayInputStream;

    .line 5
    .line 6
    sub-int v2, p2, v0

    .line 7
    .line 8
    invoke-virtual {v1, p1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, La/c99;->f()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, La/tww0;->b:La/qbu0;

    .line 23
    .line 24
    return-void
.end method

.method public final v()[B
    .locals 6

    .line 1
    invoke-virtual {p0}, La/tww0;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/tww0;->l()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ltz v2, :cond_1

    .line 14
    .line 15
    const-wide/32 v4, 0x7fffffff

    .line 16
    .line 17
    .line 18
    cmp-long v2, v0, v4

    .line 19
    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, La/tww0;->a:Ljava/io/ByteArrayInputStream;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-long v4, v2

    .line 29
    cmp-long v2, v4, v0

    .line 30
    .line 31
    if-ltz v2, :cond_0

    .line 32
    .line 33
    long-to-int v0, v0

    .line 34
    new-array v1, v0, [B

    .line 35
    .line 36
    invoke-virtual {p0, v1, v0}, La/tww0;->r([BI)V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_0
    invoke-static {}, La/c99;->f()V

    .line 41
    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_1
    const-string p0, "the maximum supported byte/text string length is 2147483647 bytes"

    .line 45
    .line 46
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3
.end method
