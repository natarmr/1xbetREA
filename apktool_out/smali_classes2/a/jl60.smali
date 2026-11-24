.class public abstract La/jl60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rae0;


# direct methods
.method public static d([I[IF)F
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    move v4, v3

    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    aget v5, p0, v2

    .line 9
    .line 10
    add-int/2addr v3, v5

    .line 11
    aget v5, p1, v2

    .line 12
    .line 13
    add-int/2addr v4, v5

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-ge v3, v4, :cond_1

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_1
    int-to-float v2, v3

    .line 21
    int-to-float v3, v4

    .line 22
    div-float v3, v2, v3

    .line 23
    .line 24
    mul-float/2addr p2, v3

    .line 25
    const/4 v4, 0x0

    .line 26
    :goto_1
    if-ge v1, v0, :cond_4

    .line 27
    .line 28
    aget v5, p0, v1

    .line 29
    .line 30
    aget v6, p1, v1

    .line 31
    .line 32
    int-to-float v6, v6

    .line 33
    mul-float/2addr v6, v3

    .line 34
    int-to-float v5, v5

    .line 35
    cmpl-float v7, v5, v6

    .line 36
    .line 37
    if-lez v7, :cond_2

    .line 38
    .line 39
    sub-float/2addr v5, v6

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    sub-float v5, v6, v5

    .line 42
    .line 43
    :goto_2
    cmpl-float v6, v5, p2

    .line 44
    .line 45
    if-lez v6, :cond_3

    .line 46
    .line 47
    :goto_3
    const/high16 p0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 48
    .line 49
    return p0

    .line 50
    :cond_3
    add-float/2addr v4, v5

    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    div-float/2addr v4, v2

    .line 55
    return v4
.end method

.method public static e(ILa/p68;[I)V
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p2, v1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 4
    .line 5
    .line 6
    iget v2, p1, La/p68;->b:I

    .line 7
    .line 8
    if-ge p0, v2, :cond_5

    .line 9
    .line 10
    invoke-virtual {p1, p0}, La/p68;->d(I)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x1

    .line 15
    xor-int/2addr v3, v4

    .line 16
    :goto_0
    if-ge p0, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1, p0}, La/p68;->d(I)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eq v5, v3, :cond_0

    .line 23
    .line 24
    aget v5, p2, v1

    .line 25
    .line 26
    add-int/2addr v5, v4

    .line 27
    aput v5, p2, v1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    if-ne v1, v0, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    aput v4, p2, v1

    .line 36
    .line 37
    xor-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_2
    if-eq v1, v0, :cond_4

    .line 43
    .line 44
    sub-int/2addr v0, v4

    .line 45
    if-ne v1, v0, :cond_3

    .line 46
    .line 47
    if-ne p0, v2, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    invoke-static {}, La/o660;->a()La/o660;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    throw p0

    .line 55
    :cond_4
    :goto_3
    return-void

    .line 56
    :cond_5
    invoke-static {}, La/o660;->a()La/o660;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    throw p0
.end method

.method public static f(ILa/p68;[I)V
    .locals 3

    .line 1
    array-length v0, p2

    .line 2
    invoke-virtual {p1, p0}, La/p68;->d(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    :cond_0
    :goto_0
    if-lez p0, :cond_1

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/p68;->d(I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eq v2, v1, :cond_0

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    xor-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-gez v0, :cond_2

    .line 24
    .line 25
    add-int/lit8 p0, p0, 0x1

    .line 26
    .line 27
    invoke-static {p0, p1, p2}, La/jl60;->e(ILa/p68;[I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    invoke-static {}, La/o660;->a()La/o660;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    throw p0
.end method


# virtual methods
.method public a(La/chf0;Ljava/util/Map;)La/i0g0;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, La/jl60;->c(La/chf0;Ljava/util/Map;)La/i0g0;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch La/o660; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    sget-object v1, La/gkj;->d:La/gkj;

    .line 10
    .line 11
    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p1, La/chf0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/nhf0;

    .line 20
    .line 21
    iget-object v1, v1, La/nhf0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/mjq;

    .line 24
    .line 25
    invoke-virtual {v1}, La/mjq;->i()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object p1, p1, La/chf0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, La/nhf0;

    .line 34
    .line 35
    iget-object p1, p1, La/nhf0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/mjq;

    .line 38
    .line 39
    invoke-virtual {p1}, La/mjq;->j()La/mjq;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, La/chf0;

    .line 44
    .line 45
    new-instance v1, La/nhf0;

    .line 46
    .line 47
    invoke-direct {v1, p1}, La/nhf0;-><init>(La/mjq;)V

    .line 48
    .line 49
    .line 50
    const/16 v2, 0xc

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, p2}, La/jl60;->c(La/chf0;Ljava/util/Map;)La/i0g0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p2, p0, La/i0g0;->e:Ljava/util/Map;

    .line 60
    .line 61
    sget-object v0, La/a3g0;->a:La/a3g0;

    .line 62
    .line 63
    const/16 v1, 0x10e

    .line 64
    .line 65
    if-eqz p2, :cond_0

    .line 66
    .line 67
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    add-int/2addr p2, v1

    .line 84
    rem-int/lit16 v1, p2, 0x168

    .line 85
    .line 86
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p0, v0, p2}, La/i0g0;->b(La/a3g0;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, La/i0g0;->c:[La/d3g0;

    .line 94
    .line 95
    if-eqz p2, :cond_1

    .line 96
    .line 97
    iget p1, p1, La/mjq;->c:I

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    :goto_0
    array-length v1, p2

    .line 101
    if-ge v0, v1, :cond_1

    .line 102
    .line 103
    new-instance v1, La/d3g0;

    .line 104
    .line 105
    int-to-float v2, p1

    .line 106
    aget-object v3, p2, v0

    .line 107
    .line 108
    iget v4, v3, La/d3g0;->b:F

    .line 109
    .line 110
    sub-float/2addr v2, v4

    .line 111
    const/high16 v4, 0x3f800000    # 1.0f

    .line 112
    .line 113
    sub-float/2addr v2, v4

    .line 114
    iget v3, v3, La/d3g0;->a:F

    .line 115
    .line 116
    invoke-direct {v1, v2, v3}, La/d3g0;-><init>(FF)V

    .line 117
    .line 118
    .line 119
    aput-object v1, p2, v0

    .line 120
    .line 121
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    return-object p0

    .line 125
    :cond_2
    throw v0
.end method

.method public b(ILa/p68;Ljava/util/Map;)La/i0g0;
    .locals 29

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v4, La/gkj;->h:La/gkj;

    .line 10
    .line 11
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v3

    .line 20
    :goto_0
    iget v4, v0, La/p68;->b:I

    .line 21
    .line 22
    invoke-virtual {v0, v3}, La/p68;->e(I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x6

    .line 27
    new-array v7, v6, [I

    .line 28
    .line 29
    move v9, v3

    .line 30
    move v10, v9

    .line 31
    move v8, v5

    .line 32
    :goto_1
    if-ge v5, v4, :cond_30

    .line 33
    .line 34
    invoke-virtual {v0, v5}, La/p68;->d(I)Z

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    if-eq v11, v9, :cond_1

    .line 39
    .line 40
    aget v11, v7, v10

    .line 41
    .line 42
    add-int/2addr v11, v2

    .line 43
    aput v11, v7, v10

    .line 44
    .line 45
    move/from16 v6, p1

    .line 46
    .line 47
    move/from16 v27, v2

    .line 48
    .line 49
    move v11, v3

    .line 50
    goto/16 :goto_1a

    .line 51
    .line 52
    :cond_1
    const/4 v11, 0x5

    .line 53
    if-ne v10, v11, :cond_2f

    .line 54
    .line 55
    const/16 p0, 0x67

    .line 56
    .line 57
    const/16 v14, 0x67

    .line 58
    .line 59
    const/4 v15, -0x1

    .line 60
    const/high16 v16, 0x3e800000    # 0.25f

    .line 61
    .line 62
    :goto_2
    const/16 v11, 0x69

    .line 63
    .line 64
    const v12, 0x3f333333    # 0.7f

    .line 65
    .line 66
    .line 67
    sget-object v17, La/sxc;->a:[[I

    .line 68
    .line 69
    if-gt v14, v11, :cond_3

    .line 70
    .line 71
    aget-object v11, v17, v14

    .line 72
    .line 73
    invoke-static {v7, v11, v12}, La/jl60;->d([I[IF)F

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    cmpg-float v12, v11, v16

    .line 78
    .line 79
    if-gez v12, :cond_2

    .line 80
    .line 81
    move/from16 v16, v11

    .line 82
    .line 83
    move v15, v14

    .line 84
    :cond_2
    add-int/lit8 v14, v14, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    const/4 v11, 0x2

    .line 88
    if-ltz v15, :cond_2e

    .line 89
    .line 90
    sub-int v14, v5, v8

    .line 91
    .line 92
    div-int/2addr v14, v11

    .line 93
    sub-int v14, v8, v14

    .line 94
    .line 95
    invoke-static {v3, v14}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    invoke-virtual {v0, v14, v8}, La/p68;->h(II)Z

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    if-eqz v14, :cond_2e

    .line 104
    .line 105
    filled-new-array {v8, v5, v15}, [I

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    aget v5, v4, v11

    .line 110
    .line 111
    new-instance v7, Ljava/util/ArrayList;

    .line 112
    .line 113
    const/16 v8, 0x14

    .line 114
    .line 115
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    int-to-byte v9, v5

    .line 119
    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    packed-switch v5, :pswitch_data_0

    .line 127
    .line 128
    .line 129
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    throw v0

    .line 134
    :pswitch_0
    const/16 v15, 0x63

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :pswitch_1
    const/16 v15, 0x64

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :pswitch_2
    const/16 v15, 0x65

    .line 141
    .line 142
    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v13, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 145
    .line 146
    .line 147
    aget v8, v4, v3

    .line 148
    .line 149
    aget v18, v4, v2

    .line 150
    .line 151
    move/from16 v19, v3

    .line 152
    .line 153
    new-array v3, v6, [I

    .line 154
    .line 155
    move v9, v15

    .line 156
    move v15, v8

    .line 157
    move/from16 v8, v18

    .line 158
    .line 159
    move/from16 v18, v11

    .line 160
    .line 161
    move v11, v9

    .line 162
    move/from16 v24, v2

    .line 163
    .line 164
    move/from16 v9, v19

    .line 165
    .line 166
    move v10, v9

    .line 167
    move v14, v10

    .line 168
    move/from16 v20, v14

    .line 169
    .line 170
    move/from16 v21, v20

    .line 171
    .line 172
    move/from16 v22, v21

    .line 173
    .line 174
    move/from16 v23, v22

    .line 175
    .line 176
    move/from16 v25, v23

    .line 177
    .line 178
    :goto_4
    if-nez v20, :cond_27

    .line 179
    .line 180
    invoke-static {v8, v0, v3}, La/jl60;->e(ILa/p68;[I)V

    .line 181
    .line 182
    .line 183
    move/from16 v9, v19

    .line 184
    .line 185
    const/4 v15, -0x1

    .line 186
    const/high16 v26, 0x3e800000    # 0.25f

    .line 187
    .line 188
    :goto_5
    const/16 v2, 0x6b

    .line 189
    .line 190
    if-ge v9, v2, :cond_5

    .line 191
    .line 192
    aget-object v2, v17, v9

    .line 193
    .line 194
    invoke-static {v3, v2, v12}, La/jl60;->d([I[IF)F

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    cmpg-float v28, v2, v26

    .line 199
    .line 200
    if-gez v28, :cond_4

    .line 201
    .line 202
    move/from16 v26, v2

    .line 203
    .line 204
    move v15, v9

    .line 205
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_5
    if-ltz v15, :cond_26

    .line 209
    .line 210
    int-to-byte v2, v15

    .line 211
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    const/16 v2, 0x6a

    .line 219
    .line 220
    if-eq v15, v2, :cond_6

    .line 221
    .line 222
    const/16 v24, 0x1

    .line 223
    .line 224
    :cond_6
    if-eq v15, v2, :cond_7

    .line 225
    .line 226
    add-int/lit8 v23, v23, 0x1

    .line 227
    .line 228
    mul-int v9, v23, v15

    .line 229
    .line 230
    add-int/2addr v9, v5

    .line 231
    move v5, v9

    .line 232
    :cond_7
    move/from16 v26, v8

    .line 233
    .line 234
    move/from16 v9, v19

    .line 235
    .line 236
    :goto_6
    if-ge v9, v6, :cond_8

    .line 237
    .line 238
    aget v28, v3, v9

    .line 239
    .line 240
    add-int v26, v26, v28

    .line 241
    .line 242
    add-int/lit8 v9, v9, 0x1

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_8
    packed-switch v15, :pswitch_data_1

    .line 246
    .line 247
    .line 248
    const/16 v6, 0x60

    .line 249
    .line 250
    const-string v12, "]C1"

    .line 251
    .line 252
    packed-switch v11, :pswitch_data_2

    .line 253
    .line 254
    .line 255
    const/16 v6, 0x64

    .line 256
    .line 257
    goto/16 :goto_11

    .line 258
    .line 259
    :pswitch_3
    const/16 v9, 0x40

    .line 260
    .line 261
    if-ge v15, v9, :cond_a

    .line 262
    .line 263
    if-ne v10, v14, :cond_9

    .line 264
    .line 265
    add-int/lit8 v2, v15, 0x20

    .line 266
    .line 267
    int-to-char v2, v2

    .line 268
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_9
    add-int/lit16 v2, v15, 0xa0

    .line 273
    .line 274
    int-to-char v2, v2

    .line 275
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    :goto_7
    move/from16 v2, v19

    .line 279
    .line 280
    move v10, v2

    .line 281
    :goto_8
    const/16 v6, 0x64

    .line 282
    .line 283
    goto/16 :goto_13

    .line 284
    .line 285
    :cond_a
    if-ge v15, v6, :cond_c

    .line 286
    .line 287
    if-ne v10, v14, :cond_b

    .line 288
    .line 289
    add-int/lit8 v2, v15, -0x40

    .line 290
    .line 291
    int-to-char v2, v2

    .line 292
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_b
    add-int/lit8 v2, v15, 0x40

    .line 297
    .line 298
    int-to-char v2, v2

    .line 299
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_c
    if-eq v15, v2, :cond_d

    .line 304
    .line 305
    move/from16 v24, v19

    .line 306
    .line 307
    :cond_d
    if-eq v15, v2, :cond_14

    .line 308
    .line 309
    packed-switch v15, :pswitch_data_3

    .line 310
    .line 311
    .line 312
    :cond_e
    :goto_9
    move/from16 v2, v19

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :pswitch_4
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-nez v2, :cond_f

    .line 320
    .line 321
    const/16 v25, 0x1

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_f
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    const/4 v6, 0x1

    .line 329
    if-ne v2, v6, :cond_10

    .line 330
    .line 331
    move/from16 v25, v18

    .line 332
    .line 333
    :cond_10
    :goto_a
    if-eqz v1, :cond_e

    .line 334
    .line 335
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-nez v2, :cond_11

    .line 340
    .line 341
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_11
    const/16 v2, 0x1d

    .line 346
    .line 347
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    goto :goto_9

    .line 351
    :pswitch_5
    if-nez v14, :cond_12

    .line 352
    .line 353
    if-eqz v10, :cond_12

    .line 354
    .line 355
    :goto_b
    move/from16 v2, v19

    .line 356
    .line 357
    move v10, v2

    .line 358
    const/4 v14, 0x1

    .line 359
    goto :goto_8

    .line 360
    :cond_12
    if-eqz v14, :cond_13

    .line 361
    .line 362
    if-eqz v10, :cond_13

    .line 363
    .line 364
    :goto_c
    move/from16 v2, v19

    .line 365
    .line 366
    move v10, v2

    .line 367
    move v14, v10

    .line 368
    goto :goto_8

    .line 369
    :cond_13
    move/from16 v2, v19

    .line 370
    .line 371
    const/4 v10, 0x1

    .line 372
    goto :goto_8

    .line 373
    :pswitch_6
    move/from16 v2, v19

    .line 374
    .line 375
    :goto_d
    const/16 v11, 0x64

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :pswitch_7
    move/from16 v2, v19

    .line 379
    .line 380
    const/16 v11, 0x63

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :pswitch_8
    const/4 v2, 0x1

    .line 384
    goto :goto_d

    .line 385
    :pswitch_9
    move/from16 v2, v19

    .line 386
    .line 387
    const/16 v25, 0x4

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_14
    move/from16 v2, v19

    .line 391
    .line 392
    const/16 v20, 0x1

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :pswitch_a
    if-ge v15, v6, :cond_16

    .line 396
    .line 397
    if-ne v10, v14, :cond_15

    .line 398
    .line 399
    add-int/lit8 v2, v15, 0x20

    .line 400
    .line 401
    int-to-char v2, v2

    .line 402
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_15
    add-int/lit16 v2, v15, 0xa0

    .line 407
    .line 408
    int-to-char v2, v2

    .line 409
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    goto/16 :goto_7

    .line 413
    .line 414
    :cond_16
    if-eq v15, v2, :cond_17

    .line 415
    .line 416
    move/from16 v24, v19

    .line 417
    .line 418
    :cond_17
    if-eq v15, v2, :cond_14

    .line 419
    .line 420
    packed-switch v15, :pswitch_data_4

    .line 421
    .line 422
    .line 423
    :goto_e
    goto :goto_9

    .line 424
    :pswitch_b
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-nez v2, :cond_18

    .line 429
    .line 430
    const/16 v25, 0x1

    .line 431
    .line 432
    goto :goto_f

    .line 433
    :cond_18
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const/4 v6, 0x1

    .line 438
    if-ne v2, v6, :cond_19

    .line 439
    .line 440
    move/from16 v25, v18

    .line 441
    .line 442
    :cond_19
    :goto_f
    if-eqz v1, :cond_e

    .line 443
    .line 444
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-nez v2, :cond_1a

    .line 449
    .line 450
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    goto :goto_e

    .line 454
    :cond_1a
    const/16 v2, 0x1d

    .line 455
    .line 456
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    goto :goto_e

    .line 460
    :pswitch_c
    move/from16 v2, v19

    .line 461
    .line 462
    :goto_10
    const/16 v11, 0x65

    .line 463
    .line 464
    goto/16 :goto_8

    .line 465
    .line 466
    :pswitch_d
    if-nez v14, :cond_1b

    .line 467
    .line 468
    if-eqz v10, :cond_1b

    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_1b
    if-eqz v14, :cond_13

    .line 472
    .line 473
    if-eqz v10, :cond_13

    .line 474
    .line 475
    goto :goto_c

    .line 476
    :pswitch_e
    const/4 v2, 0x1

    .line 477
    goto :goto_10

    .line 478
    :pswitch_f
    const/16 v6, 0x64

    .line 479
    .line 480
    if-ge v15, v6, :cond_1e

    .line 481
    .line 482
    const/16 v2, 0xa

    .line 483
    .line 484
    if-ge v15, v2, :cond_1c

    .line 485
    .line 486
    const/16 v2, 0x30

    .line 487
    .line 488
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    :cond_1c
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    :cond_1d
    :goto_11
    move/from16 v2, v19

    .line 495
    .line 496
    goto :goto_13

    .line 497
    :cond_1e
    if-eq v15, v2, :cond_1f

    .line 498
    .line 499
    move/from16 v24, v19

    .line 500
    .line 501
    :cond_1f
    if-eq v15, v2, :cond_23

    .line 502
    .line 503
    packed-switch v15, :pswitch_data_5

    .line 504
    .line 505
    .line 506
    goto :goto_11

    .line 507
    :pswitch_10
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    if-nez v2, :cond_20

    .line 512
    .line 513
    const/16 v25, 0x1

    .line 514
    .line 515
    goto :goto_12

    .line 516
    :cond_20
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    const/4 v9, 0x1

    .line 521
    if-ne v2, v9, :cond_21

    .line 522
    .line 523
    move/from16 v25, v18

    .line 524
    .line 525
    :cond_21
    :goto_12
    if-eqz v1, :cond_1d

    .line 526
    .line 527
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    if-nez v2, :cond_22

    .line 532
    .line 533
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    goto :goto_11

    .line 537
    :cond_22
    const/16 v2, 0x1d

    .line 538
    .line 539
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    goto :goto_11

    .line 543
    :pswitch_11
    move/from16 v2, v19

    .line 544
    .line 545
    const/16 v11, 0x65

    .line 546
    .line 547
    goto :goto_13

    .line 548
    :pswitch_12
    move v11, v6

    .line 549
    goto :goto_11

    .line 550
    :cond_23
    move/from16 v2, v19

    .line 551
    .line 552
    const/16 v20, 0x1

    .line 553
    .line 554
    :goto_13
    const/16 v9, 0x65

    .line 555
    .line 556
    if-eqz v21, :cond_25

    .line 557
    .line 558
    if-ne v11, v9, :cond_24

    .line 559
    .line 560
    move v11, v6

    .line 561
    goto :goto_14

    .line 562
    :cond_24
    move v11, v9

    .line 563
    :cond_25
    :goto_14
    move/from16 v21, v2

    .line 564
    .line 565
    move/from16 v9, v22

    .line 566
    .line 567
    const/4 v2, 0x1

    .line 568
    const/4 v6, 0x6

    .line 569
    const v12, 0x3f333333    # 0.7f

    .line 570
    .line 571
    .line 572
    move/from16 v22, v15

    .line 573
    .line 574
    move v15, v8

    .line 575
    move/from16 v8, v26

    .line 576
    .line 577
    goto/16 :goto_4

    .line 578
    .line 579
    :pswitch_13
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    throw v0

    .line 584
    :cond_26
    invoke-static {}, La/o660;->a()La/o660;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    throw v0

    .line 589
    :cond_27
    sub-int v1, v8, v15

    .line 590
    .line 591
    invoke-virtual {v0, v8}, La/p68;->f(I)I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    iget v3, v0, La/p68;->b:I

    .line 596
    .line 597
    sub-int v6, v2, v15

    .line 598
    .line 599
    div-int/lit8 v6, v6, 0x2

    .line 600
    .line 601
    add-int/2addr v6, v2

    .line 602
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    invoke-virtual {v0, v2, v3}, La/p68;->h(II)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_2d

    .line 611
    .line 612
    mul-int v23, v23, v9

    .line 613
    .line 614
    sub-int v5, v5, v23

    .line 615
    .line 616
    rem-int/lit8 v5, v5, 0x67

    .line 617
    .line 618
    if-ne v5, v9, :cond_2c

    .line 619
    .line 620
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    if-eqz v0, :cond_2b

    .line 625
    .line 626
    if-lez v0, :cond_28

    .line 627
    .line 628
    if-eqz v24, :cond_28

    .line 629
    .line 630
    const/16 v2, 0x63

    .line 631
    .line 632
    if-ne v11, v2, :cond_29

    .line 633
    .line 634
    add-int/lit8 v2, v0, -0x2

    .line 635
    .line 636
    invoke-virtual {v13, v2, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    :cond_28
    :goto_15
    const/16 v27, 0x1

    .line 640
    .line 641
    goto :goto_16

    .line 642
    :cond_29
    add-int/lit8 v2, v0, -0x1

    .line 643
    .line 644
    invoke-virtual {v13, v2, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    goto :goto_15

    .line 648
    :goto_16
    aget v0, v4, v27

    .line 649
    .line 650
    aget v2, v4, v19

    .line 651
    .line 652
    add-int/2addr v0, v2

    .line 653
    int-to-float v0, v0

    .line 654
    const/high16 v2, 0x40000000    # 2.0f

    .line 655
    .line 656
    div-float/2addr v0, v2

    .line 657
    int-to-float v3, v15

    .line 658
    int-to-float v1, v1

    .line 659
    div-float/2addr v1, v2

    .line 660
    add-float/2addr v1, v3

    .line 661
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    new-array v3, v2, [B

    .line 666
    .line 667
    move/from16 v4, v19

    .line 668
    .line 669
    :goto_17
    if-ge v4, v2, :cond_2a

    .line 670
    .line 671
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    check-cast v5, Ljava/lang/Byte;

    .line 676
    .line 677
    invoke-virtual {v5}, Ljava/lang/Byte;->byteValue()B

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    aput-byte v5, v3, v4

    .line 682
    .line 683
    add-int/lit8 v4, v4, 0x1

    .line 684
    .line 685
    goto :goto_17

    .line 686
    :cond_2a
    new-instance v2, La/i0g0;

    .line 687
    .line 688
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    new-instance v5, La/d3g0;

    .line 693
    .line 694
    move/from16 v6, p1

    .line 695
    .line 696
    int-to-float v6, v6

    .line 697
    invoke-direct {v5, v0, v6}, La/d3g0;-><init>(FF)V

    .line 698
    .line 699
    .line 700
    new-instance v0, La/d3g0;

    .line 701
    .line 702
    invoke-direct {v0, v1, v6}, La/d3g0;-><init>(FF)V

    .line 703
    .line 704
    .line 705
    filled-new-array {v5, v0}, [La/d3g0;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    sget-object v1, La/ju5;->e:La/ju5;

    .line 710
    .line 711
    invoke-direct {v2, v4, v3, v0, v1}, La/i0g0;-><init>(Ljava/lang/String;[B[La/d3g0;La/ju5;)V

    .line 712
    .line 713
    .line 714
    new-instance v0, Ljava/lang/StringBuilder;

    .line 715
    .line 716
    const-string v1, "]C"

    .line 717
    .line 718
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    move/from16 v1, v25

    .line 722
    .line 723
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    sget-object v1, La/a3g0;->m:La/a3g0;

    .line 731
    .line 732
    invoke-virtual {v2, v1, v0}, La/i0g0;->b(La/a3g0;Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    return-object v2

    .line 736
    :cond_2b
    invoke-static {}, La/o660;->a()La/o660;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    throw v0

    .line 741
    :cond_2c
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    throw v0

    .line 746
    :cond_2d
    invoke-static {}, La/o660;->a()La/o660;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    throw v0

    .line 751
    :cond_2e
    move/from16 v6, p1

    .line 752
    .line 753
    move/from16 v19, v3

    .line 754
    .line 755
    move/from16 v18, v11

    .line 756
    .line 757
    aget v2, v7, v19

    .line 758
    .line 759
    const/16 v27, 0x1

    .line 760
    .line 761
    aget v3, v7, v27

    .line 762
    .line 763
    add-int/2addr v2, v3

    .line 764
    add-int/2addr v8, v2

    .line 765
    add-int/lit8 v2, v10, -0x1

    .line 766
    .line 767
    move/from16 v3, v18

    .line 768
    .line 769
    move/from16 v11, v19

    .line 770
    .line 771
    invoke-static {v7, v3, v7, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 772
    .line 773
    .line 774
    aput v11, v7, v2

    .line 775
    .line 776
    aput v11, v7, v10

    .line 777
    .line 778
    add-int/lit8 v10, v10, -0x1

    .line 779
    .line 780
    :goto_18
    const/16 v27, 0x1

    .line 781
    .line 782
    goto :goto_19

    .line 783
    :cond_2f
    move/from16 v6, p1

    .line 784
    .line 785
    move v11, v3

    .line 786
    add-int/lit8 v10, v10, 0x1

    .line 787
    .line 788
    goto :goto_18

    .line 789
    :goto_19
    aput v27, v7, v10

    .line 790
    .line 791
    xor-int/lit8 v9, v9, 0x1

    .line 792
    .line 793
    :goto_1a
    add-int/lit8 v5, v5, 0x1

    .line 794
    .line 795
    move v3, v11

    .line 796
    move/from16 v2, v27

    .line 797
    .line 798
    const/4 v6, 0x6

    .line 799
    goto/16 :goto_1

    .line 800
    .line 801
    :cond_30
    invoke-static {}, La/o660;->a()La/o660;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    throw v0

    .line 806
    nop

    .line 807
    :pswitch_data_0
    .packed-switch 0x67
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    :pswitch_data_1
    .packed-switch 0x67
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    :pswitch_data_2
    .packed-switch 0x63
        :pswitch_f
        :pswitch_a
        :pswitch_3
    .end packed-switch

    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    :pswitch_data_3
    .packed-switch 0x61
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    :pswitch_data_4
    .packed-switch 0x61
        :pswitch_9
        :pswitch_e
        :pswitch_7
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    :pswitch_data_5
    .packed-switch 0x64
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final c(La/chf0;Ljava/util/Map;)La/i0g0;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/chf0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/nhf0;

    .line 8
    .line 9
    iget-object v2, v2, La/nhf0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/mjq;

    .line 12
    .line 13
    iget v3, v2, La/mjq;->b:I

    .line 14
    .line 15
    iget v2, v2, La/mjq;->c:I

    .line 16
    .line 17
    new-instance v4, La/p68;

    .line 18
    .line 19
    invoke-direct {v4, v3}, La/p68;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget-object v7, La/gkj;->d:La/gkj;

    .line 26
    .line 27
    invoke-interface {v1, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    move v7, v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v7, 0x0

    .line 36
    :goto_0
    if-eqz v7, :cond_1

    .line 37
    .line 38
    const/16 v8, 0x8

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v8, 0x5

    .line 42
    :goto_1
    shr-int v8, v2, v8

    .line 43
    .line 44
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    move v7, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v7, 0xf

    .line 53
    .line 54
    :goto_2
    div-int/lit8 v9, v2, 0x2

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    :goto_3
    if-ge v10, v7, :cond_7

    .line 58
    .line 59
    add-int/lit8 v11, v10, 0x1

    .line 60
    .line 61
    div-int/lit8 v12, v11, 0x2

    .line 62
    .line 63
    and-int/lit8 v10, v10, 0x1

    .line 64
    .line 65
    if-nez v10, :cond_3

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_3
    neg-int v12, v12

    .line 69
    :goto_4
    mul-int/2addr v12, v8

    .line 70
    add-int/2addr v12, v9

    .line 71
    if-ltz v12, :cond_7

    .line 72
    .line 73
    if-ge v12, v2, :cond_7

    .line 74
    .line 75
    :try_start_0
    invoke-virtual {v0, v4, v12}, La/chf0;->y(La/p68;I)La/p68;

    .line 76
    .line 77
    .line 78
    move-result-object v4
    :try_end_0
    .catch La/o660; {:try_start_0 .. :try_end_0} :catch_4

    .line 79
    const/4 v10, 0x0

    .line 80
    :goto_5
    const/4 v13, 0x2

    .line 81
    if-ge v10, v13, :cond_6

    .line 82
    .line 83
    if-ne v10, v6, :cond_4

    .line 84
    .line 85
    invoke-virtual {v4}, La/p68;->i()V

    .line 86
    .line 87
    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    sget-object v13, La/gkj;->j:La/gkj;

    .line 91
    .line 92
    invoke-interface {v1, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    if-eqz v14, :cond_4

    .line 97
    .line 98
    new-instance v14, Ljava/util/EnumMap;

    .line 99
    .line 100
    const-class v15, La/gkj;

    .line 101
    .line 102
    invoke-direct {v14, v15}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v14, v13}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-object v1, v14

    .line 112
    :cond_4
    move-object/from16 v13, p0

    .line 113
    .line 114
    :try_start_1
    invoke-virtual {v13, v12, v4, v1}, La/jl60;->b(ILa/p68;Ljava/util/Map;)La/i0g0;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    if-ne v10, v6, :cond_5

    .line 119
    .line 120
    sget-object v15, La/a3g0;->a:La/a3g0;
    :try_end_1
    .catch La/sae0; {:try_start_1 .. :try_end_1} :catch_2

    .line 121
    .line 122
    const/16 v16, 0xb4

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    :try_start_2
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v14, v15, v5}, La/i0g0;->b(La/a3g0;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v5, v14, La/i0g0;->c:[La/d3g0;

    .line 134
    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    new-instance v15, La/d3g0;
    :try_end_2
    .catch La/sae0; {:try_start_2 .. :try_end_2} :catch_1

    .line 138
    .line 139
    move/from16 v16, v6

    .line 140
    .line 141
    int-to-float v6, v3

    .line 142
    :try_start_3
    aget-object v0, v5, v17
    :try_end_3
    .catch La/sae0; {:try_start_3 .. :try_end_3} :catch_0

    .line 143
    .line 144
    move-object/from16 p2, v1

    .line 145
    .line 146
    :try_start_4
    iget v1, v0, La/d3g0;->a:F

    .line 147
    .line 148
    sub-float v1, v6, v1

    .line 149
    .line 150
    const/high16 v18, 0x3f800000    # 1.0f

    .line 151
    .line 152
    sub-float v1, v1, v18

    .line 153
    .line 154
    iget v0, v0, La/d3g0;->b:F

    .line 155
    .line 156
    invoke-direct {v15, v1, v0}, La/d3g0;-><init>(FF)V

    .line 157
    .line 158
    .line 159
    aput-object v15, v5, v17

    .line 160
    .line 161
    new-instance v0, La/d3g0;

    .line 162
    .line 163
    aget-object v1, v5, v16

    .line 164
    .line 165
    iget v15, v1, La/d3g0;->a:F

    .line 166
    .line 167
    sub-float/2addr v6, v15

    .line 168
    sub-float v6, v6, v18

    .line 169
    .line 170
    iget v1, v1, La/d3g0;->b:F

    .line 171
    .line 172
    invoke-direct {v0, v6, v1}, La/d3g0;-><init>(FF)V

    .line 173
    .line 174
    .line 175
    aput-object v0, v5, v16
    :try_end_4
    .catch La/sae0; {:try_start_4 .. :try_end_4} :catch_3

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :catch_0
    move-object/from16 p2, v1

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :catch_1
    move-object/from16 p2, v1

    .line 182
    .line 183
    move/from16 v16, v6

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :catch_2
    move-object/from16 p2, v1

    .line 187
    .line 188
    move/from16 v16, v6

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_5
    :goto_6
    return-object v14

    .line 194
    :catch_3
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 195
    .line 196
    move-object/from16 v0, p1

    .line 197
    .line 198
    move-object/from16 v1, p2

    .line 199
    .line 200
    move/from16 v6, v16

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :catch_4
    :cond_6
    move-object/from16 v13, p0

    .line 204
    .line 205
    move/from16 v16, v6

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    move-object/from16 v0, p1

    .line 210
    .line 211
    move v10, v11

    .line 212
    move/from16 v6, v16

    .line 213
    .line 214
    goto/16 :goto_3

    .line 215
    .line 216
    :cond_7
    invoke-static {}, La/o660;->a()La/o660;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    throw v0
.end method

.method public reset()V
    .locals 0

    .line 1
    return-void
.end method
