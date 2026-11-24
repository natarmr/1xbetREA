.class public abstract La/uld0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/cbc0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/cbc0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/uld0;->a:La/zfn;

    .line 15
    .line 16
    sget-object v0, La/pul;->o:La/pul;

    .line 17
    .line 18
    new-instance v1, La/zfn;

    .line 19
    .line 20
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/uld0;->b:La/zfn;

    .line 24
    .line 25
    return-void
.end method

.method public static final a(ILa/ugd;La/fet;Z)V
    .locals 42

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const v4, 0x684a30be

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v4}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v4, v0, 0x6

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    invoke-virtual/range {p2 .. p3}, La/fet;->h(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v4, 0x2

    .line 28
    :goto_0
    or-int/2addr v4, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v4, v0

    .line 31
    :goto_1
    and-int/lit8 v5, v0, 0x30

    .line 32
    .line 33
    if-nez v5, :cond_3

    .line 34
    .line 35
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    const/16 v5, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v5, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v4, v5

    .line 47
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 48
    .line 49
    const/16 v6, 0x12

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    const/4 v8, 0x0

    .line 53
    if-eq v5, v6, :cond_4

    .line 54
    .line 55
    move v5, v7

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move v5, v8

    .line 58
    :goto_3
    and-int/lit8 v6, v4, 0x1

    .line 59
    .line 60
    invoke-virtual {v2, v6, v5}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_7

    .line 65
    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    const v5, 0x51a022c1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v5}, La/fet;->e0(I)V

    .line 72
    .line 73
    .line 74
    sget-object v15, La/j1t0;->b:La/qrq;

    .line 75
    .line 76
    sget-wide v12, La/qmk;->s:J

    .line 77
    .line 78
    sget-wide v21, La/qmk;->G:J

    .line 79
    .line 80
    new-instance v23, La/y9q0;

    .line 81
    .line 82
    const/16 v20, 0x0

    .line 83
    .line 84
    move-object/from16 v9, v23

    .line 85
    .line 86
    const v23, 0xfdffdd

    .line 87
    .line 88
    .line 89
    const-wide/16 v10, 0x0

    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    const-wide/16 v16, 0x0

    .line 93
    .line 94
    const/16 v18, 0x0

    .line 95
    .line 96
    const/16 v19, 0x0

    .line 97
    .line 98
    invoke-direct/range {v9 .. v23}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 99
    .line 100
    .line 101
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 102
    .line 103
    invoke-virtual {v2, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 108
    .line 109
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondaryButtonForeground-0d7_KjU()J

    .line 110
    .line 111
    .line 112
    move-result-wide v24

    .line 113
    const/16 v40, 0x0

    .line 114
    .line 115
    const v41, 0xfffffe

    .line 116
    .line 117
    .line 118
    const-wide/16 v26, 0x0

    .line 119
    .line 120
    const/16 v28, 0x0

    .line 121
    .line 122
    const/16 v29, 0x0

    .line 123
    .line 124
    const/16 v30, 0x0

    .line 125
    .line 126
    const-wide/16 v31, 0x0

    .line 127
    .line 128
    const/16 v33, 0x0

    .line 129
    .line 130
    const/16 v34, 0x0

    .line 131
    .line 132
    const/16 v35, 0x0

    .line 133
    .line 134
    const/16 v36, 0x0

    .line 135
    .line 136
    const-wide/16 v37, 0x0

    .line 137
    .line 138
    const/16 v39, 0x0

    .line 139
    .line 140
    move-object/from16 v23, v9

    .line 141
    .line 142
    invoke-static/range {v23 .. v41}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    const v5, 0x51a13b73

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v5}, La/fet;->e0(I)V

    .line 154
    .line 155
    .line 156
    sget-object v15, La/j1t0;->b:La/qrq;

    .line 157
    .line 158
    sget-wide v12, La/qmk;->r:J

    .line 159
    .line 160
    sget-wide v21, La/qmk;->F:J

    .line 161
    .line 162
    new-instance v9, La/y9q0;

    .line 163
    .line 164
    const/16 v20, 0x0

    .line 165
    .line 166
    const v23, 0xfdffdd

    .line 167
    .line 168
    .line 169
    const-wide/16 v10, 0x0

    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const-wide/16 v16, 0x0

    .line 173
    .line 174
    const/16 v18, 0x0

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    invoke-direct/range {v9 .. v23}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 179
    .line 180
    .line 181
    invoke-static {v9, v2}, La/ibm0;->o(La/y9q0;La/fet;)La/y9q0;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 186
    .line 187
    .line 188
    :goto_4
    if-eqz v3, :cond_6

    .line 189
    .line 190
    const v6, 0x51a29589

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6}, La/fet;->e0(I)V

    .line 194
    .line 195
    .line 196
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 197
    .line 198
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 203
    .line 204
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondaryButtonBackground-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v9

    .line 208
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_6
    const v6, 0x51a38fb7

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v6}, La/fet;->e0(I)V

    .line 216
    .line 217
    .line 218
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 219
    .line 220
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 225
    .line 226
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary10-0d7_KjU()J

    .line 227
    .line 228
    .line 229
    move-result-wide v9

    .line 230
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 231
    .line 232
    .line 233
    :goto_5
    sget-object v6, La/uld0;->a:La/zfn;

    .line 234
    .line 235
    invoke-virtual {v6, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    new-instance v6, La/y3d;

    .line 240
    .line 241
    invoke-direct {v6, v9, v10}, La/y3d;-><init>(J)V

    .line 242
    .line 243
    .line 244
    sget-object v8, La/uld0;->b:La/zfn;

    .line 245
    .line 246
    invoke-virtual {v8, v6}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    filled-new-array {v5, v6}, [La/l5d0;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    and-int/lit8 v4, v4, 0x70

    .line 255
    .line 256
    invoke-static {v5, v1, v2, v4}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 261
    .line 262
    .line 263
    :goto_6
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    if-eqz v2, :cond_8

    .line 268
    .line 269
    new-instance v4, La/tld0;

    .line 270
    .line 271
    invoke-direct {v4, v3, v1, v0, v7}, La/tld0;-><init>(ZLa/ugd;IB)V

    .line 272
    .line 273
    .line 274
    iput-object v4, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 275
    .line 276
    :cond_8
    return-void
.end method
