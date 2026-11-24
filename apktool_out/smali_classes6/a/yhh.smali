.class public abstract La/yhh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sget-object v1, La/bfn;->e:La/bfn;

    .line 5
    .line 6
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, La/yhh;->a:J

    .line 11
    .line 12
    return-void
.end method

.method public static final a(JZJLjava/lang/Long;La/ugd;La/fet;II)V
    .locals 15

    .line 1
    move/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v8, p7

    .line 4
    .line 5
    move/from16 v0, p8

    .line 6
    .line 7
    const v1, 0x1e49871

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v1}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v0, 0x6

    .line 14
    .line 15
    move-wide v4, p0

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v8, v4, v5}, La/fet;->f(J)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x2

    .line 27
    :goto_0
    or-int/2addr v1, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v0

    .line 30
    :goto_1
    and-int/lit8 v2, v0, 0x30

    .line 31
    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    invoke-virtual {v8, v3}, La/fet;->h(Z)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v2, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v1, v2

    .line 46
    :cond_3
    and-int/lit8 v2, p9, 0x4

    .line 47
    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    or-int/lit16 v1, v1, 0x180

    .line 51
    .line 52
    :cond_4
    move-wide/from16 v6, p3

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_5
    and-int/lit16 v6, v0, 0x180

    .line 56
    .line 57
    if-nez v6, :cond_4

    .line 58
    .line 59
    move-wide/from16 v6, p3

    .line 60
    .line 61
    invoke-virtual {v8, v6, v7}, La/fet;->f(J)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_6

    .line 66
    .line 67
    const/16 v9, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    const/16 v9, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v1, v9

    .line 73
    :goto_4
    and-int/lit8 v9, p9, 0x8

    .line 74
    .line 75
    if-eqz v9, :cond_8

    .line 76
    .line 77
    or-int/lit16 v1, v1, 0xc00

    .line 78
    .line 79
    :cond_7
    move-object/from16 v10, p5

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_8
    and-int/lit16 v10, v0, 0xc00

    .line 83
    .line 84
    if-nez v10, :cond_7

    .line 85
    .line 86
    move-object/from16 v10, p5

    .line 87
    .line 88
    invoke-virtual {v8, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-eqz v11, :cond_9

    .line 93
    .line 94
    const/16 v11, 0x800

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_9
    const/16 v11, 0x400

    .line 98
    .line 99
    :goto_5
    or-int/2addr v1, v11

    .line 100
    :goto_6
    and-int/lit16 v11, v0, 0x6000

    .line 101
    .line 102
    if-nez v11, :cond_b

    .line 103
    .line 104
    move-object/from16 v11, p6

    .line 105
    .line 106
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-eqz v12, :cond_a

    .line 111
    .line 112
    const/16 v12, 0x4000

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_a
    const/16 v12, 0x2000

    .line 116
    .line 117
    :goto_7
    or-int/2addr v1, v12

    .line 118
    goto :goto_8

    .line 119
    :cond_b
    move-object/from16 v11, p6

    .line 120
    .line 121
    :goto_8
    and-int/lit16 v12, v1, 0x2493

    .line 122
    .line 123
    const/16 v13, 0x2492

    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    if-eq v12, v13, :cond_c

    .line 127
    .line 128
    const/4 v12, 0x1

    .line 129
    goto :goto_9

    .line 130
    :cond_c
    move v12, v14

    .line 131
    :goto_9
    and-int/lit8 v13, v1, 0x1

    .line 132
    .line 133
    invoke-virtual {v8, v13, v12}, La/fet;->U(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_10

    .line 138
    .line 139
    if-eqz v2, :cond_d

    .line 140
    .line 141
    sget-wide v6, La/yhh;->a:J

    .line 142
    .line 143
    :cond_d
    if-eqz v9, :cond_e

    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    goto :goto_a

    .line 147
    :cond_e
    move-object v2, v10

    .line 148
    :goto_a
    if-eqz v3, :cond_f

    .line 149
    .line 150
    const v9, 0x48eb5dc5

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v9}, La/fet;->e0(I)V

    .line 154
    .line 155
    .line 156
    and-int/lit8 v9, v1, 0xe

    .line 157
    .line 158
    shr-int/lit8 v10, v1, 0x3

    .line 159
    .line 160
    and-int/lit8 v10, v10, 0x70

    .line 161
    .line 162
    or-int/2addr v9, v10

    .line 163
    shr-int/lit8 v1, v1, 0x6

    .line 164
    .line 165
    and-int/lit16 v1, v1, 0x380

    .line 166
    .line 167
    or-int v10, v9, v1

    .line 168
    .line 169
    move-object v9, v8

    .line 170
    move-object v8, v11

    .line 171
    invoke-static/range {v4 .. v10}, La/yhh;->c(JJLa/ugd;La/fet;I)V

    .line 172
    .line 173
    .line 174
    move-wide v10, v6

    .line 175
    move-object v8, v9

    .line 176
    invoke-virtual {v8, v14}, La/fet;->r(Z)V

    .line 177
    .line 178
    .line 179
    move-object v6, v2

    .line 180
    goto :goto_b

    .line 181
    :cond_f
    move-wide v10, v6

    .line 182
    const v4, 0x48ee0fc3

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v4}, La/fet;->e0(I)V

    .line 186
    .line 187
    .line 188
    and-int/lit8 v4, v1, 0xe

    .line 189
    .line 190
    shr-int/lit8 v1, v1, 0x6

    .line 191
    .line 192
    and-int/lit8 v5, v1, 0x70

    .line 193
    .line 194
    or-int/2addr v4, v5

    .line 195
    and-int/lit16 v1, v1, 0x380

    .line 196
    .line 197
    or-int v9, v4, v1

    .line 198
    .line 199
    move-wide v4, p0

    .line 200
    move-object/from16 v7, p6

    .line 201
    .line 202
    move-object v6, v2

    .line 203
    invoke-static/range {v4 .. v9}, La/yhh;->b(JLjava/lang/Long;La/ugd;La/fet;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v14}, La/fet;->r(Z)V

    .line 207
    .line 208
    .line 209
    :goto_b
    move-wide v4, v10

    .line 210
    goto :goto_c

    .line 211
    :cond_10
    invoke-virtual {v8}, La/fet;->X()V

    .line 212
    .line 213
    .line 214
    move-wide v4, v6

    .line 215
    move-object v6, v10

    .line 216
    :goto_c
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    if-eqz v10, :cond_11

    .line 221
    .line 222
    new-instance v0, La/uhh;

    .line 223
    .line 224
    move-wide v1, p0

    .line 225
    move-object/from16 v7, p6

    .line 226
    .line 227
    move/from16 v8, p8

    .line 228
    .line 229
    move/from16 v9, p9

    .line 230
    .line 231
    invoke-direct/range {v0 .. v9}, La/uhh;-><init>(JZJLjava/lang/Long;La/ugd;II)V

    .line 232
    .line 233
    .line 234
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 235
    .line 236
    :cond_11
    return-void
.end method

.method public static final b(JLjava/lang/Long;La/ugd;La/fet;I)V
    .locals 16

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    move/from16 v10, p5

    .line 10
    .line 11
    const v4, 0x129a1e03

    .line 12
    .line 13
    .line 14
    invoke-virtual {v9, v4}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v10, 0x6

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v9, v1, v2}, La/fet;->f(J)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move v4, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v4, 0x2

    .line 31
    :goto_0
    or-int/2addr v4, v10

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v10

    .line 34
    :goto_1
    and-int/lit8 v6, v10, 0x30

    .line 35
    .line 36
    const/16 v7, 0x20

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    move v6, v7

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v6

    .line 51
    :cond_3
    and-int/lit16 v6, v10, 0x180

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    const/16 v6, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v6, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v4, v6

    .line 67
    :cond_5
    move v11, v4

    .line 68
    and-int/lit16 v4, v11, 0x93

    .line 69
    .line 70
    const/16 v6, 0x92

    .line 71
    .line 72
    const/4 v8, 0x1

    .line 73
    const/4 v12, 0x0

    .line 74
    if-eq v4, v6, :cond_6

    .line 75
    .line 76
    move v4, v8

    .line 77
    goto :goto_4

    .line 78
    :cond_6
    move v4, v12

    .line 79
    :goto_4
    and-int/lit8 v6, v11, 0x1

    .line 80
    .line 81
    invoke-virtual {v9, v6, v4}, La/fet;->U(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_10

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    and-int/lit8 v6, v11, 0xe

    .line 96
    .line 97
    if-ne v6, v5, :cond_7

    .line 98
    .line 99
    move v5, v8

    .line 100
    goto :goto_5

    .line 101
    :cond_7
    move v5, v12

    .line 102
    :goto_5
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    sget-object v13, La/ukd;->a:La/cl5;

    .line 107
    .line 108
    if-nez v5, :cond_8

    .line 109
    .line 110
    if-ne v6, v13, :cond_9

    .line 111
    .line 112
    :cond_8
    new-instance v6, La/whh;

    .line 113
    .line 114
    invoke-direct {v6, v12, v1, v2}, La/whh;-><init>(BJ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 121
    .line 122
    invoke-static {v4, v6, v9, v12}, La/e9x;->Q([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    move-object v6, v4

    .line 127
    check-cast v6, La/egk0;

    .line 128
    .line 129
    if-eqz v3, :cond_a

    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v4

    .line 135
    goto :goto_6

    .line 136
    :cond_a
    invoke-virtual {v6}, La/egk0;->l()J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    :goto_6
    invoke-virtual {v9, v4, v5}, La/fet;->f(J)Z

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    if-nez v14, :cond_b

    .line 149
    .line 150
    if-ne v15, v13, :cond_c

    .line 151
    .line 152
    :cond_b
    invoke-virtual {v6}, La/egk0;->l()J

    .line 153
    .line 154
    .line 155
    move-result-wide v14

    .line 156
    invoke-static {v3, v14, v15}, La/yhh;->d(Ljava/lang/Long;J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v14

    .line 160
    invoke-static {v14, v15}, Landroidx/compose/runtime/e;->c(J)La/egk0;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_c
    check-cast v15, La/egk0;

    .line 168
    .line 169
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    invoke-virtual {v9, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    and-int/lit8 v5, v11, 0x70

    .line 178
    .line 179
    if-ne v5, v7, :cond_d

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_d
    move v8, v12

    .line 183
    :goto_7
    or-int/2addr v4, v8

    .line 184
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    or-int/2addr v4, v5

    .line 189
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    if-nez v4, :cond_f

    .line 194
    .line 195
    if-ne v5, v13, :cond_e

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_e
    move-object v3, v5

    .line 199
    move-object v5, v15

    .line 200
    goto :goto_9

    .line 201
    :cond_f
    :goto_8
    new-instance v3, La/g8g;

    .line 202
    .line 203
    const/16 v8, 0x11

    .line 204
    .line 205
    const/4 v7, 0x0

    .line 206
    move-object/from16 v4, p2

    .line 207
    .line 208
    move-object v5, v15

    .line 209
    invoke-direct/range {v3 .. v8}, La/g8g;-><init>(Ljava/lang/Object;La/pz40;La/pz40;La/yje;B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_9
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 216
    .line 217
    invoke-static {v9, v14, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, La/egk0;->l()J

    .line 221
    .line 222
    .line 223
    move-result-wide v3

    .line 224
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    shr-int/lit8 v4, v11, 0x3

    .line 229
    .line 230
    and-int/lit8 v4, v4, 0x70

    .line 231
    .line 232
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v0, v3, v9, v4}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto :goto_a

    .line 240
    :cond_10
    invoke-virtual {v9}, La/fet;->X()V

    .line 241
    .line 242
    .line 243
    :goto_a
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    if-eqz v7, :cond_11

    .line 248
    .line 249
    new-instance v0, La/xhh;

    .line 250
    .line 251
    const/4 v6, 0x0

    .line 252
    move-object/from16 v3, p2

    .line 253
    .line 254
    move-object/from16 v4, p3

    .line 255
    .line 256
    move v5, v10

    .line 257
    invoke-direct/range {v0 .. v6}, La/xhh;-><init>(JLjava/lang/Object;La/wdr;IB)V

    .line 258
    .line 259
    .line 260
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 261
    .line 262
    :cond_11
    return-void
.end method

.method public static final c(JJLa/ugd;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    const v1, 0x2d1f0cf7

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v6, 0x6

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    move-wide/from16 v9, p0

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v9, v10}, La/fet;->f(J)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move v1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    :goto_0
    or-int/2addr v1, v6

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v6

    .line 32
    :goto_1
    and-int/lit8 v3, v6, 0x30

    .line 33
    .line 34
    const/16 v4, 0x20

    .line 35
    .line 36
    move-wide/from16 v11, p2

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v11, v12}, La/fet;->f(J)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    move v3, v4

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v3, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v1, v3

    .line 51
    :cond_3
    and-int/lit16 v3, v6, 0x180

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    invoke-virtual {v0, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    const/16 v3, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v3, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v1, v3

    .line 67
    :cond_5
    and-int/lit16 v3, v1, 0x93

    .line 68
    .line 69
    const/16 v7, 0x92

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v14, 0x1

    .line 73
    if-eq v3, v7, :cond_6

    .line 74
    .line 75
    move v3, v14

    .line 76
    goto :goto_4

    .line 77
    :cond_6
    move v3, v13

    .line 78
    :goto_4
    and-int/lit8 v7, v1, 0x1

    .line 79
    .line 80
    invoke-virtual {v0, v7, v3}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_10

    .line 85
    .line 86
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    and-int/lit8 v7, v1, 0xe

    .line 95
    .line 96
    if-ne v7, v2, :cond_7

    .line 97
    .line 98
    move v2, v14

    .line 99
    goto :goto_5

    .line 100
    :cond_7
    move v2, v13

    .line 101
    :goto_5
    and-int/lit8 v15, v1, 0x70

    .line 102
    .line 103
    if-ne v15, v4, :cond_8

    .line 104
    .line 105
    move v7, v14

    .line 106
    goto :goto_6

    .line 107
    :cond_8
    move v7, v13

    .line 108
    :goto_6
    or-int/2addr v2, v7

    .line 109
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    sget-object v8, La/ukd;->a:La/cl5;

    .line 114
    .line 115
    if-nez v2, :cond_a

    .line 116
    .line 117
    if-ne v7, v8, :cond_9

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_9
    move-object v2, v8

    .line 121
    goto :goto_8

    .line 122
    :cond_a
    :goto_7
    new-instance v7, La/al9;

    .line 123
    .line 124
    move-object v2, v8

    .line 125
    const/4 v8, 0x2

    .line 126
    invoke-direct/range {v7 .. v12}, La/al9;-><init>(BJJ)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :goto_8
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 133
    .line 134
    invoke-static {v3, v7, v0, v13}, La/e9x;->Q([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    move-object v10, v3

    .line 139
    check-cast v10, La/egk0;

    .line 140
    .line 141
    invoke-virtual {v10}, La/egk0;->l()J

    .line 142
    .line 143
    .line 144
    move-result-wide v7

    .line 145
    invoke-virtual {v0, v7, v8}, La/fet;->f(J)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    if-nez v3, :cond_b

    .line 154
    .line 155
    if-ne v7, v2, :cond_c

    .line 156
    .line 157
    :cond_b
    invoke-static/range {p0 .. p1}, Landroidx/compose/runtime/e;->c(J)La/egk0;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_c
    move-object v11, v7

    .line 165
    check-cast v11, La/egk0;

    .line 166
    .line 167
    invoke-static/range {p0 .. p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    invoke-virtual {v0, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    or-int/2addr v7, v8

    .line 180
    if-ne v15, v4, :cond_d

    .line 181
    .line 182
    move v13, v14

    .line 183
    :cond_d
    or-int v4, v7, v13

    .line 184
    .line 185
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    if-nez v4, :cond_e

    .line 190
    .line 191
    if-ne v7, v2, :cond_f

    .line 192
    .line 193
    :cond_e
    new-instance v7, La/ir;

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    move-wide/from16 v8, p2

    .line 197
    .line 198
    invoke-direct/range {v7 .. v12}, La/ir;-><init>(JLa/egk0;La/egk0;La/yje;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_f
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 205
    .line 206
    invoke-static {v0, v3, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11}, La/egk0;->l()J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    shr-int/lit8 v1, v1, 0x3

    .line 218
    .line 219
    and-int/lit8 v1, v1, 0x70

    .line 220
    .line 221
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v5, v2, v0, v1}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_10
    invoke-virtual {v0}, La/fet;->X()V

    .line 230
    .line 231
    .line 232
    :goto_9
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    if-eqz v7, :cond_11

    .line 237
    .line 238
    new-instance v0, La/vhh;

    .line 239
    .line 240
    move-wide/from16 v1, p0

    .line 241
    .line 242
    move-wide/from16 v3, p2

    .line 243
    .line 244
    invoke-direct/range {v0 .. v6}, La/vhh;-><init>(JJLa/ugd;I)V

    .line 245
    .line 246
    .line 247
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 248
    .line 249
    :cond_11
    return-void
.end method

.method public static final d(Ljava/lang/Long;J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    sub-long/2addr p0, v2

    .line 14
    const-wide/16 v2, 0x3e8

    .line 15
    .line 16
    div-long/2addr p0, v2

    .line 17
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    return-wide p0

    .line 22
    :cond_0
    sget-object p0, La/wen;->b:La/uen;

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    sget-object p0, La/bfn;->d:La/bfn;

    .line 29
    .line 30
    invoke-static {v2, v3, p0}, La/ibc;->w0(JLa/bfn;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    sget-object p0, La/bfn;->e:La/bfn;

    .line 35
    .line 36
    invoke-static {v2, v3, p0}, La/wen;->l(JLa/bfn;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    sub-long/2addr p1, v2

    .line 41
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p0

    .line 45
    return-wide p0
.end method
