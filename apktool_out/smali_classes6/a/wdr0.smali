.class public abstract La/wdr0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/joq0;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/joq0;-><init>(B)V

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
    sput-object v1, La/wdr0;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/mm40;La/a4x;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v7, p4

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const v0, -0x376b16c9

    .line 12
    .line 13
    .line 14
    invoke-virtual {v7, v0}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p0

    .line 18
    .line 19
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v3, 0x2

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v3

    .line 29
    :goto_0
    or-int v0, p5, v0

    .line 30
    .line 31
    move-object/from16 v4, p1

    .line 32
    .line 33
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    const/16 v5, 0x20

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v5, 0x10

    .line 43
    .line 44
    :goto_1
    or-int/2addr v0, v5

    .line 45
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    move v5, v6

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v5, 0x80

    .line 56
    .line 57
    :goto_2
    or-int/2addr v0, v5

    .line 58
    move-object/from16 v5, p3

    .line 59
    .line 60
    invoke-virtual {v7, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_3

    .line 65
    .line 66
    const/16 v8, 0x800

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/16 v8, 0x400

    .line 70
    .line 71
    :goto_3
    or-int/2addr v0, v8

    .line 72
    and-int/lit16 v8, v0, 0x493

    .line 73
    .line 74
    const/16 v9, 0x492

    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    if-eq v8, v9, :cond_4

    .line 78
    .line 79
    const/4 v8, 0x1

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    move v8, v10

    .line 82
    :goto_4
    and-int/lit8 v9, v0, 0x1

    .line 83
    .line 84
    invoke-virtual {v7, v9, v8}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_10

    .line 89
    .line 90
    invoke-virtual {v7}, La/fet;->Z()V

    .line 91
    .line 92
    .line 93
    and-int/lit8 v8, p5, 0x1

    .line 94
    .line 95
    if-eqz v8, :cond_6

    .line 96
    .line 97
    invoke-virtual {v7}, La/fet;->B()Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_5

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    invoke-virtual {v7}, La/fet;->X()V

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_5
    invoke-virtual {v7}, La/fet;->s()V

    .line 108
    .line 109
    .line 110
    invoke-static {v7}, La/f7k;->b0(La/fet;)F

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-static {v7}, La/xfn;->a(La/fet;)La/wfn;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    iget v9, v9, La/wfn;->c:F

    .line 119
    .line 120
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    sget-object v13, La/ukd;->a:La/cl5;

    .line 125
    .line 126
    if-ne v12, v13, :cond_7

    .line 127
    .line 128
    const/4 v12, 0x0

    .line 129
    invoke-static {v9, v12, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-virtual {v7, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    check-cast v12, La/hh80;

    .line 137
    .line 138
    new-array v9, v10, [Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    if-ne v14, v13, :cond_8

    .line 145
    .line 146
    new-instance v14, La/rj50;

    .line 147
    .line 148
    invoke-direct {v14, v10}, La/rj50;-><init>(B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_8
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 155
    .line 156
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    if-ne v15, v13, :cond_9

    .line 161
    .line 162
    new-instance v15, La/mb50;

    .line 163
    .line 164
    const/4 v11, 0x5

    .line 165
    invoke-direct {v15, v11}, La/mb50;-><init>(B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_9
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 172
    .line 173
    invoke-static {v15, v14}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    if-ne v14, v13, :cond_a

    .line 182
    .line 183
    new-instance v14, La/th50;

    .line 184
    .line 185
    invoke-direct {v14, v3}, La/th50;-><init>(B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 192
    .line 193
    const/16 v3, 0x180

    .line 194
    .line 195
    invoke-static {v9, v11, v14, v7, v3}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    check-cast v9, La/qj50;

    .line 200
    .line 201
    and-int/lit16 v11, v0, 0x380

    .line 202
    .line 203
    xor-int/2addr v11, v3

    .line 204
    if-le v11, v6, :cond_b

    .line 205
    .line 206
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    if-nez v11, :cond_c

    .line 211
    .line 212
    :cond_b
    and-int/2addr v0, v3

    .line 213
    if-ne v0, v6, :cond_d

    .line 214
    .line 215
    :cond_c
    const/4 v11, 0x1

    .line 216
    goto :goto_6

    .line 217
    :cond_d
    move v11, v10

    .line 218
    :goto_6
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-nez v11, :cond_e

    .line 223
    .line 224
    if-ne v0, v13, :cond_f

    .line 225
    .line 226
    :cond_e
    new-instance v0, La/meq0;

    .line 227
    .line 228
    const/16 v3, 0xc

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    invoke-direct {v0, v2, v6, v3}, La/meq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v7, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_f
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 238
    .line 239
    invoke-static {v0, v7, v10}, La/pvm0;->e(Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 240
    .line 241
    .line 242
    new-instance v0, La/ycl;

    .line 243
    .line 244
    invoke-direct {v0, v8}, La/ycl;-><init>(F)V

    .line 245
    .line 246
    .line 247
    sget-object v3, La/wdr0;->a:La/zfn;

    .line 248
    .line 249
    invoke-virtual {v3, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    new-instance v0, La/vdl0;

    .line 254
    .line 255
    move-object v3, v4

    .line 256
    move-object v4, v5

    .line 257
    move-object v5, v9

    .line 258
    move-object v6, v12

    .line 259
    invoke-direct/range {v0 .. v6}, La/vdl0;-><init>(La/mm40;La/xcz;La/a4x;Lkotlin/jvm/functions/Function1;La/qj50;La/hh80;)V

    .line 260
    .line 261
    .line 262
    const v1, -0x47b4b389

    .line 263
    .line 264
    .line 265
    invoke-static {v1, v0, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const/16 v1, 0x38

    .line 270
    .line 271
    invoke-static {v8, v0, v7, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_10
    invoke-virtual {v7}, La/fet;->X()V

    .line 276
    .line 277
    .line 278
    :goto_7
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    if-eqz v7, :cond_11

    .line 283
    .line 284
    new-instance v0, La/stl0;

    .line 285
    .line 286
    const/16 v1, 0x13

    .line 287
    .line 288
    move-object/from16 v3, p0

    .line 289
    .line 290
    move-object/from16 v4, p1

    .line 291
    .line 292
    move-object/from16 v5, p2

    .line 293
    .line 294
    move-object/from16 v6, p3

    .line 295
    .line 296
    move/from16 v2, p5

    .line 297
    .line 298
    invoke-direct/range {v0 .. v6}, La/stl0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 302
    .line 303
    :cond_11
    return-void
.end method
