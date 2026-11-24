.class public abstract La/hsw;
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
    const/16 v1, 0x10

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
    sput-object v1, La/hsw;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/jsw;La/fet;I)V
    .locals 36

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v3, -0x10ec0a2e

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v3}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    or-int/lit8 v3, v2, 0x6

    .line 17
    .line 18
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v4, 0x10

    .line 28
    .line 29
    :goto_0
    or-int/2addr v3, v4

    .line 30
    and-int/lit8 v4, v3, 0x13

    .line 31
    .line 32
    const/16 v5, 0x12

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    if-eq v4, v5, :cond_1

    .line 36
    .line 37
    move v4, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v4, 0x0

    .line 40
    :goto_1
    and-int/2addr v3, v6

    .line 41
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_5

    .line 46
    .line 47
    sget-object v3, La/hsw;->a:La/zfn;

    .line 48
    .line 49
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, La/k6z;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/4 v4, 0x2

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    if-ne v3, v6, :cond_2

    .line 63
    .line 64
    move/from16 v20, v4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    move/from16 v20, v6

    .line 72
    .line 73
    :goto_2
    sget-object v3, La/qmk;->a:La/zcl;

    .line 74
    .line 75
    const/high16 v3, 0x42080000    # 34.0f

    .line 76
    .line 77
    sget-object v5, La/jm40;->b:La/jm40;

    .line 78
    .line 79
    invoke-static {v5, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const/high16 v7, 0x41000000    # 8.0f

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    invoke-static {v3, v7, v8, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 91
    .line 92
    new-instance v7, La/qw3;

    .line 93
    .line 94
    new-instance v8, La/jf4;

    .line 95
    .line 96
    const/16 v9, 0xe

    .line 97
    .line 98
    invoke-direct {v8, v9}, La/jf4;-><init>(B)V

    .line 99
    .line 100
    .line 101
    const/high16 v9, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-direct {v7, v9, v6, v8}, La/qw3;-><init>(FZLa/rw3;)V

    .line 104
    .line 105
    .line 106
    const/16 v8, 0x30

    .line 107
    .line 108
    invoke-static {v7, v4, v1, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iget-wide v7, v1, La/fet;->T:J

    .line 113
    .line 114
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 127
    .line 128
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, La/fet;->i0()V

    .line 132
    .line 133
    .line 134
    iget-boolean v9, v1, La/fet;->S:Z

    .line 135
    .line 136
    if-eqz v9, :cond_4

    .line 137
    .line 138
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 139
    .line 140
    invoke-virtual {v1, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_4
    invoke-virtual {v1}, La/fet;->r0()V

    .line 145
    .line 146
    .line 147
    :goto_3
    sget-object v9, La/gqw0;->x:La/shd;

    .line 148
    .line 149
    invoke-static {v1, v4, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    sget-object v4, La/gqw0;->w:La/shd;

    .line 153
    .line 154
    invoke-static {v1, v8, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    sget-object v7, La/gqw0;->y:La/shd;

    .line 162
    .line 163
    invoke-static {v1, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 167
    .line 168
    .line 169
    sget-object v4, La/gqw0;->v:La/shd;

    .line 170
    .line 171
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    sget-object v3, La/egp0;->c:La/zfn;

    .line 175
    .line 176
    sget-object v27, La/j1t0;->c:La/qrq;

    .line 177
    .line 178
    sget-wide v24, La/qmk;->q:J

    .line 179
    .line 180
    sget-wide v33, La/qmk;->D:J

    .line 181
    .line 182
    new-instance v21, La/y9q0;

    .line 183
    .line 184
    const/16 v32, 0x0

    .line 185
    .line 186
    const v35, 0xfdffdd

    .line 187
    .line 188
    .line 189
    const-wide/16 v22, 0x0

    .line 190
    .line 191
    const/16 v26, 0x0

    .line 192
    .line 193
    const-wide/16 v28, 0x0

    .line 194
    .line 195
    const/16 v30, 0x0

    .line 196
    .line 197
    const/16 v31, 0x0

    .line 198
    .line 199
    invoke-direct/range {v21 .. v35}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 200
    .line 201
    .line 202
    const/16 v24, 0x0

    .line 203
    .line 204
    const v25, 0xfeffff

    .line 205
    .line 206
    .line 207
    const-wide/16 v8, 0x0

    .line 208
    .line 209
    const-wide/16 v10, 0x0

    .line 210
    .line 211
    const/4 v12, 0x0

    .line 212
    const/4 v13, 0x0

    .line 213
    const/4 v14, 0x0

    .line 214
    const-wide/16 v15, 0x0

    .line 215
    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    const/16 v19, 0x0

    .line 221
    .line 222
    move-object/from16 v7, v21

    .line 223
    .line 224
    const-wide/16 v21, 0x0

    .line 225
    .line 226
    const/16 v23, 0x0

    .line 227
    .line 228
    invoke-static/range {v7 .. v25}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    move/from16 v7, v20

    .line 233
    .line 234
    invoke-virtual {v3, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    new-instance v4, La/o6o;

    .line 239
    .line 240
    const/16 v8, 0x11

    .line 241
    .line 242
    invoke-direct {v4, v0, v7, v8}, La/o6o;-><init>(Ljava/lang/Object;IB)V

    .line 243
    .line 244
    .line 245
    const v7, 0x5326c42e

    .line 246
    .line 247
    .line 248
    invoke-static {v7, v4, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    const/16 v7, 0x38

    .line 253
    .line 254
    invoke-static {v3, v4, v1, v7}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_5
    invoke-virtual {v1}, La/fet;->X()V

    .line 262
    .line 263
    .line 264
    move-object/from16 v5, p0

    .line 265
    .line 266
    :goto_4
    invoke-virtual {v1}, La/fet;->u()La/yfe0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-eqz v1, :cond_6

    .line 271
    .line 272
    new-instance v3, La/sjs;

    .line 273
    .line 274
    const/16 v4, 0x13

    .line 275
    .line 276
    invoke-direct {v3, v5, v0, v2, v4}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 277
    .line 278
    .line 279
    iput-object v3, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 280
    .line 281
    :cond_6
    return-void
.end method
