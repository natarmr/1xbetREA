.class public final La/nj30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cd40;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[B

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[BII)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, -0x1

    .line 15
    sparse-switch v0, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_0
    const-string v0, "auxiliary.tracks.map"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v1

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v0, "auxiliary.tracks.offset"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v4, 0x3

    .line 40
    goto :goto_0

    .line 41
    :sswitch_2
    const-string v0, "auxiliary.tracks.length"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v4, 0x2

    .line 51
    goto :goto_0

    .line 52
    :sswitch_3
    const-string v0, "auxiliary.tracks.interleaved"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move v4, v3

    .line 62
    goto :goto_0

    .line 63
    :sswitch_4
    const-string v0, "com.android.capture.fps"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    move v4, v2

    .line 73
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_0
    if-nez p4, :cond_5

    .line 78
    .line 79
    move v2, v3

    .line 80
    :cond_5
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_1
    const/16 v0, 0x4e

    .line 85
    .line 86
    if-ne p4, v0, :cond_6

    .line 87
    .line 88
    array-length v0, p2

    .line 89
    const/16 v1, 0x8

    .line 90
    .line 91
    if-ne v0, v1, :cond_6

    .line 92
    .line 93
    move v2, v3

    .line 94
    :cond_6
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_2
    const/16 v0, 0x4b

    .line 99
    .line 100
    if-ne p4, v0, :cond_8

    .line 101
    .line 102
    array-length v0, p2

    .line 103
    if-ne v0, v3, :cond_8

    .line 104
    .line 105
    aget-byte v0, p2, v2

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    if-ne v0, v3, :cond_8

    .line 110
    .line 111
    :cond_7
    move v2, v3

    .line 112
    :cond_8
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_3
    const/16 v0, 0x17

    .line 117
    .line 118
    if-ne p4, v0, :cond_9

    .line 119
    .line 120
    array-length v0, p2

    .line 121
    if-ne v0, v1, :cond_9

    .line 122
    .line 123
    move v2, v3

    .line 124
    :cond_9
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 125
    .line 126
    .line 127
    :goto_1
    iput-object p1, p0, La/nj30;->a:Ljava/lang/String;

    .line 128
    .line 129
    iput-object p2, p0, La/nj30;->b:[B

    .line 130
    .line 131
    iput p3, p0, La/nj30;->c:I

    .line 132
    .line 133
    iput p4, p0, La/nj30;->d:I

    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :sswitch_data_0
    .sparse-switch
        -0x7438daab -> :sswitch_4
        -0x100eb5d5 -> :sswitch_3
        0x3c4d37e4 -> :sswitch_2
        0x41766191 -> :sswitch_1
        0x7755f91e -> :sswitch_0
    .end sparse-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final d()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, La/nj30;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "auxiliary.tracks.map"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "Metadata is not an auxiliary tracks map"

    .line 10
    .line 11
    invoke-static {v1, v0}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/nj30;->b:[B

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    aget-byte v1, p0, v0

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-ge v3, v1, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, 0x2

    .line 28
    .line 29
    aget-byte v4, p0, v4

    .line 30
    .line 31
    and-int/lit16 v4, v4, 0xff

    .line 32
    .line 33
    invoke-static {v4, v3, v0, v2}, La/w6x;->c(IIILjava/util/ArrayList;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    const-class v0, La/nj30;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, La/nj30;

    .line 16
    .line 17
    iget-object v0, p0, La/nj30;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p1, La/nj30;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, La/nj30;->b:[B

    .line 28
    .line 29
    iget-object v1, p1, La/nj30;->b:[B

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget v0, p0, La/nj30;->c:I

    .line 38
    .line 39
    iget v1, p1, La/nj30;->c:I

    .line 40
    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    iget p0, p0, La/nj30;->d:I

    .line 44
    .line 45
    iget p1, p1, La/nj30;->d:I

    .line 46
    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    :goto_0
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/16 v0, 0x20f

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    iget-object v2, p0, La/nj30;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v2, p0, La/nj30;->b:[B

    .line 12
    .line 13
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v2, v0

    .line 18
    mul-int/2addr v2, v1

    .line 19
    iget v0, p0, La/nj30;->c:I

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/2addr v2, v1

    .line 23
    iget p0, p0, La/nj30;->d:I

    .line 24
    .line 25
    add-int/2addr v2, p0

    .line 26
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    .line 1
    iget v0, p0, La/nj30;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    if-eq v0, v2, :cond_6

    .line 8
    .line 9
    const/16 v3, 0x17

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    const-string v6, "array too small: %s < %s"

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    if-eq v0, v3, :cond_4

    .line 17
    .line 18
    const/16 v3, 0x43

    .line 19
    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    const/16 v3, 0x4b

    .line 23
    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    const/16 v3, 0x4e

    .line 27
    .line 28
    if-eq v0, v3, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    new-instance v0, La/fq80;

    .line 33
    .line 34
    iget-object v1, p0, La/nj30;->b:[B

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/fq80;-><init>([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, La/fq80;->F()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto/16 :goto_d

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, La/nj30;->b:[B

    .line 50
    .line 51
    aget-byte v0, v0, v1

    .line 52
    .line 53
    and-int/lit16 v0, v0, 0xff

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto/16 :goto_d

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, La/nj30;->b:[B

    .line 62
    .line 63
    array-length v3, v0

    .line 64
    if-lt v3, v7, :cond_3

    .line 65
    .line 66
    move v3, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    move v3, v1

    .line 69
    :goto_0
    array-length v8, v0

    .line 70
    invoke-static {v8, v7, v6, v3}, La/x0x;->v(IILjava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    aget-byte v1, v0, v1

    .line 74
    .line 75
    aget-byte v2, v0, v2

    .line 76
    .line 77
    aget-byte v3, v0, v5

    .line 78
    .line 79
    aget-byte v0, v0, v4

    .line 80
    .line 81
    invoke-static {v1, v2, v3, v0}, La/n6x;->A(BBBB)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto/16 :goto_d

    .line 90
    .line 91
    :cond_4
    iget-object v0, p0, La/nj30;->b:[B

    .line 92
    .line 93
    array-length v3, v0

    .line 94
    if-lt v3, v7, :cond_5

    .line 95
    .line 96
    move v3, v2

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move v3, v1

    .line 99
    :goto_1
    array-length v8, v0

    .line 100
    invoke-static {v8, v7, v6, v3}, La/x0x;->v(IILjava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    aget-byte v1, v0, v1

    .line 104
    .line 105
    aget-byte v2, v0, v2

    .line 106
    .line 107
    aget-byte v3, v0, v5

    .line 108
    .line 109
    aget-byte v0, v0, v4

    .line 110
    .line 111
    invoke-static {v1, v2, v3, v0}, La/n6x;->A(BBBB)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto/16 :goto_d

    .line 124
    .line 125
    :cond_6
    iget-object v0, p0, La/nj30;->b:[B

    .line 126
    .line 127
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 128
    .line 129
    new-instance v1, Ljava/lang/String;

    .line 130
    .line 131
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 132
    .line 133
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 134
    .line 135
    .line 136
    move-object v0, v1

    .line 137
    goto/16 :goto_d

    .line 138
    .line 139
    :cond_7
    iget-object v0, p0, La/nj30;->a:Ljava/lang/String;

    .line 140
    .line 141
    const-string v3, "auxiliary.tracks.map"

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    invoke-virtual {p0}, La/nj30;->d()Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "track types = "

    .line 154
    .line 155
    invoke-static {v1}, La/brm0;->r(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    new-instance v2, La/pfw;

    .line 160
    .line 161
    const/16 v3, 0x2c

    .line 162
    .line 163
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-direct {v2, v3}, La/pfw;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v2, v1, v0}, La/pfw;->a(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto/16 :goto_d

    .line 182
    .line 183
    :cond_8
    :goto_2
    iget-object v0, p0, La/nj30;->b:[B

    .line 184
    .line 185
    sget-object v3, La/vtt0;->a:Ljava/lang/String;

    .line 186
    .line 187
    array-length v3, v0

    .line 188
    sget-object v4, La/vx5;->e:La/tx5;

    .line 189
    .line 190
    iget-object v5, v4, La/vx5;->c:La/vx5;

    .line 191
    .line 192
    if-nez v5, :cond_16

    .line 193
    .line 194
    iget-object v5, v4, La/vx5;->a:La/sx5;

    .line 195
    .line 196
    iget-object v6, v5, La/sx5;->b:[C

    .line 197
    .line 198
    array-length v7, v6

    .line 199
    move v8, v1

    .line 200
    :goto_3
    if-ge v8, v7, :cond_14

    .line 201
    .line 202
    aget-char v9, v6, v8

    .line 203
    .line 204
    invoke-static {v9}, La/j47;->A0(C)Z

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-eqz v9, :cond_13

    .line 209
    .line 210
    array-length v7, v6

    .line 211
    move v8, v1

    .line 212
    :goto_4
    if-ge v8, v7, :cond_a

    .line 213
    .line 214
    aget-char v9, v6, v8

    .line 215
    .line 216
    const/16 v10, 0x61

    .line 217
    .line 218
    if-lt v9, v10, :cond_9

    .line 219
    .line 220
    const/16 v10, 0x7a

    .line 221
    .line 222
    if-gt v9, v10, :cond_9

    .line 223
    .line 224
    move v7, v2

    .line 225
    goto :goto_5

    .line 226
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    move v7, v1

    .line 230
    :goto_5
    xor-int/2addr v7, v2

    .line 231
    const-string v8, "Cannot call lowerCase() on a mixed-case alphabet"

    .line 232
    .line 233
    invoke-static {v8, v7}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    array-length v7, v6

    .line 237
    new-array v7, v7, [C

    .line 238
    .line 239
    move v8, v1

    .line 240
    :goto_6
    array-length v9, v6

    .line 241
    if-ge v8, v9, :cond_c

    .line 242
    .line 243
    aget-char v9, v6, v8

    .line 244
    .line 245
    invoke-static {v9}, La/j47;->A0(C)Z

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    if-eqz v10, :cond_b

    .line 250
    .line 251
    xor-int/lit8 v9, v9, 0x20

    .line 252
    .line 253
    int-to-char v9, v9

    .line 254
    :cond_b
    aput-char v9, v7, v8

    .line 255
    .line 256
    add-int/lit8 v8, v8, 0x1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_c
    new-instance v6, La/sx5;

    .line 260
    .line 261
    new-instance v8, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    iget-object v9, v5, La/sx5;->a:Ljava/lang/String;

    .line 267
    .line 268
    const-string v10, ".lowerCase()"

    .line 269
    .line 270
    invoke-static {v8, v9, v10}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-direct {v6, v8, v7}, La/sx5;-><init>(Ljava/lang/String;[C)V

    .line 275
    .line 276
    .line 277
    iget-boolean v5, v5, La/sx5;->h:Z

    .line 278
    .line 279
    if-eqz v5, :cond_12

    .line 280
    .line 281
    iget-object v5, v6, La/sx5;->g:[B

    .line 282
    .line 283
    iget-boolean v7, v6, La/sx5;->h:Z

    .line 284
    .line 285
    if-eqz v7, :cond_d

    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_d
    array-length v7, v5

    .line 289
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    const/16 v8, 0x41

    .line 294
    .line 295
    :goto_7
    const/16 v9, 0x5a

    .line 296
    .line 297
    if-gt v8, v9, :cond_11

    .line 298
    .line 299
    or-int/lit8 v9, v8, 0x20

    .line 300
    .line 301
    aget-byte v10, v5, v8

    .line 302
    .line 303
    aget-byte v11, v5, v9

    .line 304
    .line 305
    const/4 v12, -0x1

    .line 306
    if-ne v10, v12, :cond_e

    .line 307
    .line 308
    aput-byte v11, v7, v8

    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_e
    if-ne v11, v12, :cond_f

    .line 312
    .line 313
    move v11, v2

    .line 314
    goto :goto_8

    .line 315
    :cond_f
    move v11, v1

    .line 316
    :goto_8
    int-to-char v12, v8

    .line 317
    int-to-char v13, v9

    .line 318
    if-eqz v11, :cond_10

    .line 319
    .line 320
    aput-byte v10, v7, v9

    .line 321
    .line 322
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_10
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-static {v13}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    const-string v0, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values"

    .line 338
    .line 339
    invoke-static {v0, p0}, La/jtm0;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const/4 p0, 0x0

    .line 347
    return-object p0

    .line 348
    :cond_11
    new-instance v5, La/sx5;

    .line 349
    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    iget-object v8, v6, La/sx5;->a:Ljava/lang/String;

    .line 356
    .line 357
    const-string v9, ".ignoreCase()"

    .line 358
    .line 359
    invoke-static {v1, v8, v9}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    iget-object v6, v6, La/sx5;->b:[C

    .line 364
    .line 365
    invoke-direct {v5, v1, v6, v7, v2}, La/sx5;-><init>(Ljava/lang/String;[C[BZ)V

    .line 366
    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_12
    :goto_a
    move-object v5, v6

    .line 370
    goto :goto_b

    .line 371
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 372
    .line 373
    goto/16 :goto_3

    .line 374
    .line 375
    :cond_14
    :goto_b
    iget-object v1, v4, La/vx5;->a:La/sx5;

    .line 376
    .line 377
    if-ne v5, v1, :cond_15

    .line 378
    .line 379
    move-object v5, v4

    .line 380
    goto :goto_c

    .line 381
    :cond_15
    new-instance v1, La/tx5;

    .line 382
    .line 383
    invoke-direct {v1, v5}, La/tx5;-><init>(La/sx5;)V

    .line 384
    .line 385
    .line 386
    move-object v5, v1

    .line 387
    :goto_c
    iput-object v5, v4, La/vx5;->c:La/vx5;

    .line 388
    .line 389
    :cond_16
    invoke-virtual {v5, v0, v3}, La/vx5;->a([BI)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    :goto_d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    const-string v2, "mdta: key="

    .line 396
    .line 397
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    iget-object p0, p0, La/nj30;->a:Ljava/lang/String;

    .line 401
    .line 402
    const-string v2, ", value="

    .line 403
    .line 404
    invoke-static {v1, p0, v2, v0}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    return-object p0
.end method
