.class public abstract La/cky;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/rrd;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La/cky;->c:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, La/cky;->d:Ljava/lang/String;

    .line 9
    .line 10
    iput v0, p0, La/cky;->e:I

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/cky;->f:Ljava/util/ArrayList;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La/cky;->a:La/rrd;

    .line 6
    .line 7
    iget-object v2, v0, La/rrd;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/kpb;

    .line 10
    .line 11
    iget-object v3, v0, La/rrd;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, [D

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    float-to-double v7, v1

    .line 21
    invoke-virtual {v2, v7, v8, v3}, La/kpb;->P(D[D)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, La/rrd;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, [F

    .line 28
    .line 29
    aget v2, v2, v6

    .line 30
    .line 31
    float-to-double v7, v2

    .line 32
    aput-wide v7, v3, v6

    .line 33
    .line 34
    iget-object v2, v0, La/rrd;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, [F

    .line 37
    .line 38
    aget v2, v2, v6

    .line 39
    .line 40
    float-to-double v7, v2

    .line 41
    aput-wide v7, v3, v5

    .line 42
    .line 43
    iget-object v2, v0, La/rrd;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, [F

    .line 46
    .line 47
    aget v2, v2, v6

    .line 48
    .line 49
    float-to-double v7, v2

    .line 50
    aput-wide v7, v3, v4

    .line 51
    .line 52
    :goto_0
    iget-object v2, v0, La/rrd;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, [D

    .line 55
    .line 56
    aget-wide v6, v2, v6

    .line 57
    .line 58
    aget-wide v8, v2, v5

    .line 59
    .line 60
    iget-object v2, v0, La/rrd;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, La/ucs0;

    .line 63
    .line 64
    float-to-double v10, v1

    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-wide/16 v12, 0x0

    .line 69
    .line 70
    cmpg-double v1, v10, v12

    .line 71
    .line 72
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 73
    .line 74
    if-gtz v1, :cond_1

    .line 75
    .line 76
    move/from16 p0, v4

    .line 77
    .line 78
    :goto_1
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_1
    cmpl-double v1, v10, v16

    .line 82
    .line 83
    if-ltz v1, :cond_2

    .line 84
    .line 85
    move/from16 p0, v4

    .line 86
    .line 87
    move-wide/from16 v12, v16

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    iget-object v1, v2, La/ucs0;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, [D

    .line 93
    .line 94
    invoke-static {v1, v10, v11}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-gez v1, :cond_3

    .line 99
    .line 100
    neg-int v1, v1

    .line 101
    sub-int/2addr v1, v5

    .line 102
    :cond_3
    iget-object v3, v2, La/ucs0;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, [F

    .line 105
    .line 106
    aget v5, v3, v1

    .line 107
    .line 108
    add-int/lit8 v12, v1, -0x1

    .line 109
    .line 110
    aget v3, v3, v12

    .line 111
    .line 112
    sub-float/2addr v5, v3

    .line 113
    move/from16 p0, v4

    .line 114
    .line 115
    float-to-double v4, v5

    .line 116
    iget-object v13, v2, La/ucs0;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v13, [D

    .line 119
    .line 120
    aget-wide v18, v13, v1

    .line 121
    .line 122
    aget-wide v20, v13, v12

    .line 123
    .line 124
    sub-double v18, v18, v20

    .line 125
    .line 126
    div-double v4, v4, v18

    .line 127
    .line 128
    iget-object v1, v2, La/ucs0;->e:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, [D

    .line 131
    .line 132
    aget-wide v12, v1, v12

    .line 133
    .line 134
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 135
    .line 136
    float-to-double v14, v3

    .line 137
    mul-double v22, v4, v20

    .line 138
    .line 139
    sub-double v14, v14, v22

    .line 140
    .line 141
    sub-double v22, v10, v20

    .line 142
    .line 143
    mul-double v22, v22, v14

    .line 144
    .line 145
    add-double v22, v22, v12

    .line 146
    .line 147
    mul-double/2addr v10, v10

    .line 148
    mul-double v20, v20, v20

    .line 149
    .line 150
    sub-double v10, v10, v20

    .line 151
    .line 152
    mul-double/2addr v10, v4

    .line 153
    div-double v10, v10, v18

    .line 154
    .line 155
    add-double v12, v10, v22

    .line 156
    .line 157
    :goto_2
    add-double/2addr v12, v8

    .line 158
    iget v1, v2, La/ucs0;->b:I

    .line 159
    .line 160
    const-wide v3, 0x401921fb54442d18L    # 6.283185307179586

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    const-wide/high16 v10, 0x4010000000000000L    # 4.0

    .line 166
    .line 167
    packed-switch v1, :pswitch_data_0

    .line 168
    .line 169
    .line 170
    mul-double/2addr v3, v12

    .line 171
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    goto :goto_4

    .line 176
    :pswitch_0
    iget-object v1, v2, La/ucs0;->f:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, La/pq40;

    .line 179
    .line 180
    rem-double v12, v12, v16

    .line 181
    .line 182
    invoke-virtual {v1, v12, v13}, La/pq40;->O(D)D

    .line 183
    .line 184
    .line 185
    move-result-wide v1

    .line 186
    goto :goto_4

    .line 187
    :pswitch_1
    mul-double/2addr v12, v10

    .line 188
    rem-double/2addr v12, v10

    .line 189
    sub-double v12, v12, v18

    .line 190
    .line 191
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    sub-double v1, v16, v1

    .line 196
    .line 197
    mul-double/2addr v1, v1

    .line 198
    :goto_3
    sub-double v1, v16, v1

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :pswitch_2
    add-double/2addr v8, v12

    .line 202
    mul-double/2addr v8, v3

    .line 203
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 204
    .line 205
    .line 206
    move-result-wide v1

    .line 207
    goto :goto_4

    .line 208
    :pswitch_3
    mul-double v12, v12, v18

    .line 209
    .line 210
    add-double v12, v12, v16

    .line 211
    .line 212
    rem-double v12, v12, v18

    .line 213
    .line 214
    sub-double v1, v16, v12

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :pswitch_4
    mul-double v12, v12, v18

    .line 218
    .line 219
    add-double v12, v12, v16

    .line 220
    .line 221
    rem-double v12, v12, v18

    .line 222
    .line 223
    sub-double v1, v12, v16

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :pswitch_5
    mul-double/2addr v12, v10

    .line 227
    add-double v12, v12, v16

    .line 228
    .line 229
    rem-double/2addr v12, v10

    .line 230
    sub-double v12, v12, v18

    .line 231
    .line 232
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 233
    .line 234
    .line 235
    move-result-wide v1

    .line 236
    goto :goto_3

    .line 237
    :pswitch_6
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    .line 238
    .line 239
    rem-double v12, v12, v16

    .line 240
    .line 241
    sub-double/2addr v1, v12

    .line 242
    invoke-static {v1, v2}, Ljava/lang/Math;->signum(D)D

    .line 243
    .line 244
    .line 245
    move-result-wide v1

    .line 246
    :goto_4
    iget-object v0, v0, La/rrd;->i:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, [D

    .line 249
    .line 250
    aget-wide v3, v0, p0

    .line 251
    .line 252
    mul-double/2addr v1, v3

    .line 253
    add-double/2addr v1, v6

    .line 254
    double-to-float v0, v1

    .line 255
    return v0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(La/ywu;F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/cky;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v3, La/wpv;

    .line 13
    .line 14
    const/4 v4, 0x6

    .line 15
    invoke-direct {v3, v4}, La/wpv;-><init>(B)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    new-array v3, v2, [D

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    new-array v6, v5, [I

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x3

    .line 28
    aput v8, v6, v7

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    aput v2, v6, v9

    .line 32
    .line 33
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v10, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, [[D

    .line 40
    .line 41
    new-instance v11, La/rrd;

    .line 42
    .line 43
    iget v12, v0, La/cky;->c:I

    .line 44
    .line 45
    iget-object v13, v0, La/cky;->d:Ljava/lang/String;

    .line 46
    .line 47
    const/16 v14, 0x15

    .line 48
    .line 49
    invoke-direct {v11, v14}, La/rrd;-><init>(B)V

    .line 50
    .line 51
    .line 52
    new-instance v14, La/ucs0;

    .line 53
    .line 54
    invoke-direct {v14, v4}, La/ucs0;-><init>(B)V

    .line 55
    .line 56
    .line 57
    new-array v4, v9, [F

    .line 58
    .line 59
    iput-object v4, v14, La/ucs0;->c:Ljava/lang/Object;

    .line 60
    .line 61
    new-array v4, v9, [D

    .line 62
    .line 63
    iput-object v4, v14, La/ucs0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v14, v11, La/rrd;->b:Ljava/lang/Object;

    .line 66
    .line 67
    iput v12, v14, La/ucs0;->b:I

    .line 68
    .line 69
    move v4, v8

    .line 70
    move v12, v9

    .line 71
    if-eqz v13, :cond_4

    .line 72
    .line 73
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    div-int/2addr v15, v5

    .line 78
    new-array v15, v15, [D

    .line 79
    .line 80
    move/from16 v16, v4

    .line 81
    .line 82
    const/16 v4, 0x28

    .line 83
    .line 84
    invoke-virtual {v13, v4}, Ljava/lang/String;->indexOf(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    add-int/2addr v4, v7

    .line 89
    move/from16 v17, v12

    .line 90
    .line 91
    const/16 v12, 0x2c

    .line 92
    .line 93
    invoke-virtual {v13, v12, v4}, Ljava/lang/String;->indexOf(II)I

    .line 94
    .line 95
    .line 96
    move-result v18

    .line 97
    move/from16 v19, v18

    .line 98
    .line 99
    move/from16 v18, v7

    .line 100
    .line 101
    move/from16 v7, v19

    .line 102
    .line 103
    move/from16 v19, v17

    .line 104
    .line 105
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 106
    .line 107
    :goto_0
    const/4 v8, -0x1

    .line 108
    if-eq v7, v8, :cond_1

    .line 109
    .line 110
    invoke-virtual {v13, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    add-int/lit8 v8, v19, 0x1

    .line 119
    .line 120
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 121
    .line 122
    .line 123
    move-result-wide v22

    .line 124
    aput-wide v22, v15, v19

    .line 125
    .line 126
    add-int/lit8 v4, v7, 0x1

    .line 127
    .line 128
    invoke-virtual {v13, v12, v4}, Ljava/lang/String;->indexOf(II)I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    move/from16 v19, v8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    const/16 v7, 0x29

    .line 136
    .line 137
    invoke-virtual {v13, v7, v4}, Ljava/lang/String;->indexOf(II)I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    invoke-virtual {v13, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    add-int/lit8 v7, v19, 0x1

    .line 150
    .line 151
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    aput-wide v8, v15, v19

    .line 156
    .line 157
    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([DI)[D

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    array-length v7, v4

    .line 162
    mul-int/lit8 v7, v7, 0x3

    .line 163
    .line 164
    sub-int/2addr v7, v5

    .line 165
    array-length v8, v4

    .line 166
    add-int/lit8 v8, v8, -0x1

    .line 167
    .line 168
    int-to-double v12, v8

    .line 169
    div-double v12, v20, v12

    .line 170
    .line 171
    new-array v9, v5, [I

    .line 172
    .line 173
    aput v18, v9, v18

    .line 174
    .line 175
    aput v7, v9, v17

    .line 176
    .line 177
    invoke-static {v10, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    check-cast v9, [[D

    .line 182
    .line 183
    new-array v7, v7, [D

    .line 184
    .line 185
    move/from16 v19, v5

    .line 186
    .line 187
    move/from16 v15, v17

    .line 188
    .line 189
    :goto_1
    array-length v5, v4

    .line 190
    if-ge v15, v5, :cond_3

    .line 191
    .line 192
    aget-wide v22, v4, v15

    .line 193
    .line 194
    add-int v5, v15, v8

    .line 195
    .line 196
    aget-object v24, v9, v5

    .line 197
    .line 198
    aput-wide v22, v24, v17

    .line 199
    .line 200
    move-object/from16 v24, v4

    .line 201
    .line 202
    move/from16 v25, v5

    .line 203
    .line 204
    int-to-double v4, v15

    .line 205
    mul-double/2addr v4, v12

    .line 206
    aput-wide v4, v7, v25

    .line 207
    .line 208
    if-lez v15, :cond_2

    .line 209
    .line 210
    mul-int/lit8 v25, v8, 0x2

    .line 211
    .line 212
    add-int v25, v25, v15

    .line 213
    .line 214
    aget-object v26, v9, v25

    .line 215
    .line 216
    add-double v27, v22, v20

    .line 217
    .line 218
    aput-wide v27, v26, v17

    .line 219
    .line 220
    add-double v26, v4, v20

    .line 221
    .line 222
    aput-wide v26, v7, v25

    .line 223
    .line 224
    add-int/lit8 v25, v15, -0x1

    .line 225
    .line 226
    aget-object v26, v9, v25

    .line 227
    .line 228
    sub-double v22, v22, v20

    .line 229
    .line 230
    sub-double v22, v22, v12

    .line 231
    .line 232
    aput-wide v22, v26, v17

    .line 233
    .line 234
    const-wide/high16 v22, -0x4010000000000000L    # -1.0

    .line 235
    .line 236
    add-double v4, v4, v22

    .line 237
    .line 238
    sub-double/2addr v4, v12

    .line 239
    aput-wide v4, v7, v25

    .line 240
    .line 241
    :cond_2
    add-int/lit8 v15, v15, 0x1

    .line 242
    .line 243
    move-object/from16 v4, v24

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_3
    new-instance v4, La/pq40;

    .line 247
    .line 248
    invoke-direct {v4, v7, v9}, La/pq40;-><init>([D[[D)V

    .line 249
    .line 250
    .line 251
    iput-object v4, v14, La/ucs0;->f:Ljava/lang/Object;

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_4
    move/from16 v16, v4

    .line 255
    .line 256
    move/from16 v19, v5

    .line 257
    .line 258
    move/from16 v18, v7

    .line 259
    .line 260
    move/from16 v17, v12

    .line 261
    .line 262
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 263
    .line 264
    :goto_2
    new-array v4, v2, [F

    .line 265
    .line 266
    iput-object v4, v11, La/rrd;->c:Ljava/lang/Object;

    .line 267
    .line 268
    new-array v4, v2, [D

    .line 269
    .line 270
    iput-object v4, v11, La/rrd;->d:Ljava/lang/Object;

    .line 271
    .line 272
    new-array v4, v2, [F

    .line 273
    .line 274
    iput-object v4, v11, La/rrd;->e:Ljava/lang/Object;

    .line 275
    .line 276
    new-array v4, v2, [F

    .line 277
    .line 278
    iput-object v4, v11, La/rrd;->f:Ljava/lang/Object;

    .line 279
    .line 280
    new-array v4, v2, [F

    .line 281
    .line 282
    iput-object v4, v11, La/rrd;->g:Ljava/lang/Object;

    .line 283
    .line 284
    new-array v2, v2, [F

    .line 285
    .line 286
    iput-object v11, v0, La/cky;->a:La/rrd;

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    move/from16 v2, v17

    .line 293
    .line 294
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-eqz v4, :cond_5

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    check-cast v4, La/bky;

    .line 305
    .line 306
    iget v5, v4, La/bky;->d:F

    .line 307
    .line 308
    float-to-double v7, v5

    .line 309
    const-wide v11, 0x3f847ae147ae147bL    # 0.01

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    mul-double/2addr v7, v11

    .line 315
    aput-wide v7, v3, v2

    .line 316
    .line 317
    aget-object v7, v6, v2

    .line 318
    .line 319
    iget v8, v4, La/bky;->b:F

    .line 320
    .line 321
    float-to-double v11, v8

    .line 322
    aput-wide v11, v7, v17

    .line 323
    .line 324
    iget v9, v4, La/bky;->c:F

    .line 325
    .line 326
    float-to-double v11, v9

    .line 327
    aput-wide v11, v7, v18

    .line 328
    .line 329
    iget v11, v4, La/bky;->e:F

    .line 330
    .line 331
    float-to-double v12, v11

    .line 332
    aput-wide v12, v7, v19

    .line 333
    .line 334
    iget-object v7, v0, La/cky;->a:La/rrd;

    .line 335
    .line 336
    iget v4, v4, La/bky;->a:I

    .line 337
    .line 338
    iget-object v12, v7, La/rrd;->d:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v12, [D

    .line 341
    .line 342
    int-to-double v13, v4

    .line 343
    const-wide/high16 v22, 0x4059000000000000L    # 100.0

    .line 344
    .line 345
    div-double v13, v13, v22

    .line 346
    .line 347
    aput-wide v13, v12, v2

    .line 348
    .line 349
    iget-object v4, v7, La/rrd;->e:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v4, [F

    .line 352
    .line 353
    aput v5, v4, v2

    .line 354
    .line 355
    iget-object v4, v7, La/rrd;->f:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v4, [F

    .line 358
    .line 359
    aput v9, v4, v2

    .line 360
    .line 361
    iget-object v4, v7, La/rrd;->g:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v4, [F

    .line 364
    .line 365
    aput v11, v4, v2

    .line 366
    .line 367
    iget-object v4, v7, La/rrd;->c:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v4, [F

    .line 370
    .line 371
    aput v8, v4, v2

    .line 372
    .line 373
    add-int/lit8 v2, v2, 0x1

    .line 374
    .line 375
    goto :goto_3

    .line 376
    :cond_5
    iget-object v0, v0, La/cky;->a:La/rrd;

    .line 377
    .line 378
    iget-object v1, v0, La/rrd;->e:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v1, [F

    .line 381
    .line 382
    iget-object v2, v0, La/rrd;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, La/ucs0;

    .line 385
    .line 386
    iget-object v4, v0, La/rrd;->d:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v4, [D

    .line 389
    .line 390
    array-length v5, v4

    .line 391
    move/from16 v7, v19

    .line 392
    .line 393
    new-array v8, v7, [I

    .line 394
    .line 395
    aput v16, v8, v18

    .line 396
    .line 397
    aput v5, v8, v17

    .line 398
    .line 399
    invoke-static {v10, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    check-cast v5, [[D

    .line 404
    .line 405
    iget-object v8, v0, La/rrd;->c:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v8, [F

    .line 408
    .line 409
    array-length v9, v8

    .line 410
    add-int/2addr v9, v7

    .line 411
    new-array v9, v9, [D

    .line 412
    .line 413
    iput-object v9, v0, La/rrd;->i:Ljava/lang/Object;

    .line 414
    .line 415
    array-length v9, v8

    .line 416
    add-int/2addr v9, v7

    .line 417
    new-array v7, v9, [D

    .line 418
    .line 419
    aget-wide v9, v4, v17

    .line 420
    .line 421
    const-wide/16 v11, 0x0

    .line 422
    .line 423
    cmpl-double v7, v9, v11

    .line 424
    .line 425
    if-lez v7, :cond_6

    .line 426
    .line 427
    aget v7, v1, v17

    .line 428
    .line 429
    invoke-virtual {v2, v11, v12, v7}, La/ucs0;->h(DF)V

    .line 430
    .line 431
    .line 432
    :cond_6
    array-length v7, v4

    .line 433
    add-int/lit8 v7, v7, -0x1

    .line 434
    .line 435
    aget-wide v9, v4, v7

    .line 436
    .line 437
    cmpg-double v9, v9, v20

    .line 438
    .line 439
    if-gez v9, :cond_7

    .line 440
    .line 441
    aget v7, v1, v7

    .line 442
    .line 443
    move-wide/from16 v9, v20

    .line 444
    .line 445
    invoke-virtual {v2, v9, v10, v7}, La/ucs0;->h(DF)V

    .line 446
    .line 447
    .line 448
    :cond_7
    move/from16 v7, v17

    .line 449
    .line 450
    :goto_4
    array-length v9, v5

    .line 451
    if-ge v7, v9, :cond_8

    .line 452
    .line 453
    aget-object v9, v5, v7

    .line 454
    .line 455
    iget-object v10, v0, La/rrd;->f:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v10, [F

    .line 458
    .line 459
    aget v10, v10, v7

    .line 460
    .line 461
    float-to-double v13, v10

    .line 462
    aput-wide v13, v9, v17

    .line 463
    .line 464
    iget-object v10, v0, La/rrd;->g:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v10, [F

    .line 467
    .line 468
    aget v10, v10, v7

    .line 469
    .line 470
    float-to-double v13, v10

    .line 471
    aput-wide v13, v9, v18

    .line 472
    .line 473
    aget v10, v8, v7

    .line 474
    .line 475
    float-to-double v13, v10

    .line 476
    const/16 v19, 0x2

    .line 477
    .line 478
    aput-wide v13, v9, v19

    .line 479
    .line 480
    aget-wide v9, v4, v7

    .line 481
    .line 482
    aget v13, v1, v7

    .line 483
    .line 484
    invoke-virtual {v2, v9, v10, v13}, La/ucs0;->h(DF)V

    .line 485
    .line 486
    .line 487
    add-int/lit8 v7, v7, 0x1

    .line 488
    .line 489
    goto :goto_4

    .line 490
    :cond_8
    move-wide v7, v11

    .line 491
    move/from16 v1, v17

    .line 492
    .line 493
    :goto_5
    iget-object v9, v2, La/ucs0;->c:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v9, [F

    .line 496
    .line 497
    array-length v10, v9

    .line 498
    if-ge v1, v10, :cond_9

    .line 499
    .line 500
    aget v9, v9, v1

    .line 501
    .line 502
    float-to-double v9, v9

    .line 503
    add-double/2addr v7, v9

    .line 504
    add-int/lit8 v1, v1, 0x1

    .line 505
    .line 506
    goto :goto_5

    .line 507
    :cond_9
    move-wide v9, v11

    .line 508
    move/from16 v1, v18

    .line 509
    .line 510
    :goto_6
    iget-object v13, v2, La/ucs0;->c:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v13, [F

    .line 513
    .line 514
    array-length v14, v13

    .line 515
    const/high16 v15, 0x40000000    # 2.0f

    .line 516
    .line 517
    if-ge v1, v14, :cond_a

    .line 518
    .line 519
    add-int/lit8 v14, v1, -0x1

    .line 520
    .line 521
    aget v16, v13, v14

    .line 522
    .line 523
    aget v13, v13, v1

    .line 524
    .line 525
    add-float v16, v16, v13

    .line 526
    .line 527
    div-float v13, v16, v15

    .line 528
    .line 529
    iget-object v15, v2, La/ucs0;->d:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v15, [D

    .line 532
    .line 533
    aget-wide v19, v15, v1

    .line 534
    .line 535
    aget-wide v14, v15, v14

    .line 536
    .line 537
    sub-double v19, v19, v14

    .line 538
    .line 539
    float-to-double v13, v13

    .line 540
    mul-double v19, v19, v13

    .line 541
    .line 542
    add-double v9, v19, v9

    .line 543
    .line 544
    add-int/lit8 v1, v1, 0x1

    .line 545
    .line 546
    goto :goto_6

    .line 547
    :cond_a
    move/from16 v1, v17

    .line 548
    .line 549
    :goto_7
    iget-object v13, v2, La/ucs0;->c:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v13, [F

    .line 552
    .line 553
    array-length v14, v13

    .line 554
    if-ge v1, v14, :cond_b

    .line 555
    .line 556
    aget v14, v13, v1

    .line 557
    .line 558
    move-wide/from16 v19, v11

    .line 559
    .line 560
    div-double v11, v7, v9

    .line 561
    .line 562
    double-to-float v11, v11

    .line 563
    mul-float/2addr v14, v11

    .line 564
    aput v14, v13, v1

    .line 565
    .line 566
    add-int/lit8 v1, v1, 0x1

    .line 567
    .line 568
    move-wide/from16 v11, v19

    .line 569
    .line 570
    goto :goto_7

    .line 571
    :cond_b
    move-wide/from16 v19, v11

    .line 572
    .line 573
    iget-object v1, v2, La/ucs0;->e:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v1, [D

    .line 576
    .line 577
    aput-wide v19, v1, v17

    .line 578
    .line 579
    move/from16 v1, v18

    .line 580
    .line 581
    :goto_8
    iget-object v7, v2, La/ucs0;->c:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v7, [F

    .line 584
    .line 585
    array-length v8, v7

    .line 586
    if-ge v1, v8, :cond_c

    .line 587
    .line 588
    add-int/lit8 v8, v1, -0x1

    .line 589
    .line 590
    aget v9, v7, v8

    .line 591
    .line 592
    aget v7, v7, v1

    .line 593
    .line 594
    add-float/2addr v9, v7

    .line 595
    div-float/2addr v9, v15

    .line 596
    iget-object v7, v2, La/ucs0;->d:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v7, [D

    .line 599
    .line 600
    aget-wide v10, v7, v1

    .line 601
    .line 602
    aget-wide v12, v7, v8

    .line 603
    .line 604
    sub-double/2addr v10, v12

    .line 605
    iget-object v7, v2, La/ucs0;->e:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v7, [D

    .line 608
    .line 609
    aget-wide v12, v7, v8

    .line 610
    .line 611
    float-to-double v8, v9

    .line 612
    mul-double/2addr v10, v8

    .line 613
    add-double/2addr v10, v12

    .line 614
    aput-wide v10, v7, v1

    .line 615
    .line 616
    add-int/lit8 v1, v1, 0x1

    .line 617
    .line 618
    goto :goto_8

    .line 619
    :cond_c
    array-length v1, v4

    .line 620
    move/from16 v2, v18

    .line 621
    .line 622
    if-le v1, v2, :cond_d

    .line 623
    .line 624
    move/from16 v12, v17

    .line 625
    .line 626
    invoke-static {v12, v4, v5}, La/kpb;->y(I[D[[D)La/kpb;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    iput-object v1, v0, La/rrd;->h:Ljava/lang/Object;

    .line 631
    .line 632
    goto :goto_9

    .line 633
    :cond_d
    move/from16 v12, v17

    .line 634
    .line 635
    const/4 v1, 0x0

    .line 636
    iput-object v1, v0, La/rrd;->h:Ljava/lang/Object;

    .line 637
    .line 638
    :goto_9
    invoke-static {v12, v3, v6}, La/kpb;->y(I[D[[D)La/kpb;

    .line 639
    .line 640
    .line 641
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, La/cky;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/text/DecimalFormat;

    .line 4
    .line 5
    const-string v2, "##.##"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/cky;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, La/bky;

    .line 27
    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, "["

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v0, v2, La/bky;->a:I

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, " , "

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v0, v2, La/bky;->b:F

    .line 52
    .line 53
    float-to-double v4, v0

    .line 54
    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "] "

    .line 62
    .line 63
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    return-object v0
.end method
