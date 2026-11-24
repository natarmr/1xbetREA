.class public abstract La/isw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/kdw;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kdw;-><init>(B)V

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
    sput-object v1, La/isw;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/ksw;La/fet;I)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v4, 0x2ddcc03a

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v4}, La/fet;->g0(I)La/fet;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x2

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v5

    .line 28
    :goto_0
    or-int/2addr v4, v3

    .line 29
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    const/16 v6, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v6, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v4, v6

    .line 41
    and-int/lit8 v6, v4, 0x13

    .line 42
    .line 43
    const/16 v7, 0x12

    .line 44
    .line 45
    const/4 v8, 0x1

    .line 46
    if-eq v6, v7, :cond_2

    .line 47
    .line 48
    move v6, v8

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v6, 0x0

    .line 51
    :goto_2
    and-int/2addr v4, v8

    .line 52
    invoke-virtual {v2, v4, v6}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_6

    .line 57
    .line 58
    sget-object v4, La/isw;->a:La/zfn;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, La/k6z;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    if-ne v4, v8, :cond_3

    .line 73
    .line 74
    move/from16 v22, v5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    move/from16 v22, v8

    .line 82
    .line 83
    :goto_3
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 84
    .line 85
    sget-object v5, La/uc9;->a:La/lw3;

    .line 86
    .line 87
    const/16 v6, 0x30

    .line 88
    .line 89
    invoke-static {v5, v4, v2, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-wide v5, v2, La/fet;->T:J

    .line 94
    .line 95
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v2, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, La/fet;->i0()V

    .line 113
    .line 114
    .line 115
    iget-boolean v10, v2, La/fet;->S:Z

    .line 116
    .line 117
    if-eqz v10, :cond_5

    .line 118
    .line 119
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 120
    .line 121
    invoke-virtual {v2, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    invoke-virtual {v2}, La/fet;->r0()V

    .line 126
    .line 127
    .line 128
    :goto_4
    sget-object v10, La/gqw0;->x:La/shd;

    .line 129
    .line 130
    invoke-static {v2, v4, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    sget-object v4, La/gqw0;->w:La/shd;

    .line 134
    .line 135
    invoke-static {v2, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    sget-object v5, La/gqw0;->y:La/shd;

    .line 143
    .line 144
    invoke-static {v2, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 148
    .line 149
    .line 150
    sget-object v4, La/gqw0;->v:La/shd;

    .line 151
    .line 152
    invoke-static {v2, v9, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    sget-object v4, La/dgp0;->d:La/zfn;

    .line 156
    .line 157
    sget-object v29, La/j1t0;->c:La/qrq;

    .line 158
    .line 159
    sget-wide v26, La/qmk;->q:J

    .line 160
    .line 161
    sget-wide v35, La/qmk;->D:J

    .line 162
    .line 163
    new-instance v23, La/y9q0;

    .line 164
    .line 165
    const/16 v34, 0x0

    .line 166
    .line 167
    const v37, 0xfdffdd

    .line 168
    .line 169
    .line 170
    const-wide/16 v24, 0x0

    .line 171
    .line 172
    const/16 v28, 0x0

    .line 173
    .line 174
    const-wide/16 v30, 0x0

    .line 175
    .line 176
    const/16 v32, 0x0

    .line 177
    .line 178
    const/16 v33, 0x0

    .line 179
    .line 180
    invoke-direct/range {v23 .. v37}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 181
    .line 182
    .line 183
    const/16 v26, 0x0

    .line 184
    .line 185
    const v27, 0xfeffff

    .line 186
    .line 187
    .line 188
    const-wide/16 v10, 0x0

    .line 189
    .line 190
    const-wide/16 v12, 0x0

    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v15, 0x0

    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    const-wide/16 v17, 0x0

    .line 197
    .line 198
    const/16 v19, 0x0

    .line 199
    .line 200
    const/16 v20, 0x0

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    move-object/from16 v9, v23

    .line 205
    .line 206
    const-wide/16 v23, 0x0

    .line 207
    .line 208
    const/16 v25, 0x0

    .line 209
    .line 210
    invoke-static/range {v9 .. v27}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    move/from16 v6, v22

    .line 215
    .line 216
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    new-instance v5, La/o6o;

    .line 221
    .line 222
    invoke-direct {v5, v1, v6, v7}, La/o6o;-><init>(Ljava/lang/Object;IB)V

    .line 223
    .line 224
    .line 225
    const v6, 0x4c23bd5e    # 4.2923384E7f

    .line 226
    .line 227
    .line 228
    invoke-static {v6, v5, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    const/16 v6, 0x38

    .line 233
    .line 234
    invoke-static {v4, v5, v2, v6}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_6
    invoke-virtual {v2}, La/fet;->X()V

    .line 242
    .line 243
    .line 244
    :goto_5
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    if-eqz v2, :cond_7

    .line 249
    .line 250
    new-instance v4, La/sjs;

    .line 251
    .line 252
    const/16 v5, 0x14

    .line 253
    .line 254
    invoke-direct {v4, v0, v1, v3, v5}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 255
    .line 256
    .line 257
    iput-object v4, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 258
    .line 259
    :cond_7
    return-void
.end method
