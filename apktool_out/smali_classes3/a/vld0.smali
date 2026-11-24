.class public abstract La/vld0;
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
    const/16 v1, 0x18

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
    sput-object v1, La/vld0;->a:La/zfn;

    .line 15
    .line 16
    sget-object v0, La/pul;->p:La/pul;

    .line 17
    .line 18
    new-instance v1, La/zfn;

    .line 19
    .line 20
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/vld0;->b:La/zfn;

    .line 24
    .line 25
    return-void
.end method

.method public static final a(ILa/ugd;La/fet;Z)V
    .locals 23

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
    const v4, -0x43f315e6

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
    const/4 v7, 0x0

    .line 52
    if-eq v5, v6, :cond_4

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    goto :goto_3

    .line 56
    :cond_4
    move v5, v7

    .line 57
    :goto_3
    and-int/lit8 v6, v4, 0x1

    .line 58
    .line 59
    invoke-virtual {v2, v6, v5}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_7

    .line 64
    .line 65
    if-eqz v3, :cond_5

    .line 66
    .line 67
    const v5, -0x5d1f66c5

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v5}, La/fet;->e0(I)V

    .line 71
    .line 72
    .line 73
    sget-object v14, La/j1t0;->b:La/qrq;

    .line 74
    .line 75
    sget-wide v11, La/qmk;->r:J

    .line 76
    .line 77
    sget-wide v20, La/qmk;->F:J

    .line 78
    .line 79
    new-instance v8, La/y9q0;

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    const v22, 0xfdffdd

    .line 84
    .line 85
    .line 86
    const-wide/16 v9, 0x0

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const-wide/16 v15, 0x0

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/16 v18, 0x0

    .line 94
    .line 95
    invoke-direct/range {v8 .. v22}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 96
    .line 97
    .line 98
    invoke-static {v8, v2}, La/ibm0;->l(La/y9q0;La/fet;)La/y9q0;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v2, v7}, La/fet;->r(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    const v5, -0x5d1ea0a9

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v5}, La/fet;->e0(I)V

    .line 110
    .line 111
    .line 112
    sget-object v14, La/j1t0;->b:La/qrq;

    .line 113
    .line 114
    sget-wide v11, La/qmk;->r:J

    .line 115
    .line 116
    sget-wide v20, La/qmk;->F:J

    .line 117
    .line 118
    new-instance v8, La/y9q0;

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const v22, 0xfdffdd

    .line 123
    .line 124
    .line 125
    const-wide/16 v9, 0x0

    .line 126
    .line 127
    const/4 v13, 0x0

    .line 128
    const-wide/16 v15, 0x0

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const/16 v18, 0x0

    .line 133
    .line 134
    invoke-direct/range {v8 .. v22}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 135
    .line 136
    .line 137
    invoke-static {v8, v2}, La/ibm0;->o(La/y9q0;La/fet;)La/y9q0;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v2, v7}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    :goto_4
    if-eqz v3, :cond_6

    .line 145
    .line 146
    const v6, -0x5d1d478b

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v6}, La/fet;->e0(I)V

    .line 150
    .line 151
    .line 152
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 153
    .line 154
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 159
    .line 160
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 161
    .line 162
    .line 163
    move-result-wide v8

    .line 164
    invoke-virtual {v2, v7}, La/fet;->r(Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_6
    const v6, -0x5d1c6b65

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v6}, La/fet;->e0(I)V

    .line 172
    .line 173
    .line 174
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 175
    .line 176
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 181
    .line 182
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary10-0d7_KjU()J

    .line 183
    .line 184
    .line 185
    move-result-wide v8

    .line 186
    invoke-virtual {v2, v7}, La/fet;->r(Z)V

    .line 187
    .line 188
    .line 189
    :goto_5
    sget-object v6, La/vld0;->a:La/zfn;

    .line 190
    .line 191
    invoke-virtual {v6, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    new-instance v6, La/y3d;

    .line 196
    .line 197
    invoke-direct {v6, v8, v9}, La/y3d;-><init>(J)V

    .line 198
    .line 199
    .line 200
    sget-object v8, La/vld0;->b:La/zfn;

    .line 201
    .line 202
    invoke-virtual {v8, v6}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    filled-new-array {v5, v6}, [La/l5d0;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    and-int/lit8 v4, v4, 0x70

    .line 211
    .line 212
    invoke-static {v5, v1, v2, v4}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 217
    .line 218
    .line 219
    :goto_6
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-eqz v2, :cond_8

    .line 224
    .line 225
    new-instance v4, La/tld0;

    .line 226
    .line 227
    invoke-direct {v4, v3, v1, v0, v7}, La/tld0;-><init>(ZLa/ugd;IB)V

    .line 228
    .line 229
    .line 230
    iput-object v4, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 231
    .line 232
    :cond_8
    return-void
.end method
