.class public final La/sc5;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;
.implements La/fe60;
.implements La/qai0;


# instance fields
.field public o:J

.field public p:La/t89;

.field public q:F

.field public r:La/yjj0;

.field public s:J

.field public t:La/k6z;

.field public u:La/x1x;

.field public v:La/yjj0;

.field public w:La/x1x;


# virtual methods
.method public final R()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, La/sc5;->s:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/sc5;->t:La/k6z;

    .line 10
    .line 11
    iput-object v0, p0, La/sc5;->u:La/x1x;

    .line 12
    .line 13
    iput-object v0, p0, La/sc5;->v:La/yjj0;

    .line 14
    .line 15
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final u0(La/g7z;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/g7z;->a:La/a6a;

    .line 6
    .line 7
    iget-object v3, v0, La/sc5;->r:La/yjj0;

    .line 8
    .line 9
    sget-object v4, La/jd8;->n:La/ljc;

    .line 10
    .line 11
    if-ne v3, v4, :cond_2

    .line 12
    .line 13
    iget-wide v2, v0, La/sc5;->o:J

    .line 14
    .line 15
    sget-wide v4, La/y3d;->g:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, La/h2t0;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, v0, La/sc5;->o:J

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/16 v12, 0x7e

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v1, v0, La/sc5;->p:La/t89;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget v6, v0, La/sc5;->q:F

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    const/16 v10, 0x76

    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    move-object/from16 v0, p1

    .line 54
    .line 55
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 56
    .line 57
    .line 58
    move-object v1, v0

    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_1
    move-object/from16 v1, p1

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_2
    invoke-interface {v2}, La/fhl;->d()J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    iget-wide v5, v0, La/sc5;->s:J

    .line 70
    .line 71
    invoke-static {v3, v4, v5, v6}, La/h7k0;->b(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-virtual {v1}, La/g7z;->getLayoutDirection()La/k6z;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iget-object v4, v0, La/sc5;->t:La/k6z;

    .line 82
    .line 83
    if-ne v3, v4, :cond_3

    .line 84
    .line 85
    iget-object v3, v0, La/sc5;->v:La/yjj0;

    .line 86
    .line 87
    iget-object v4, v0, La/sc5;->r:La/yjj0;

    .line 88
    .line 89
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    iget-object v3, v0, La/sc5;->u:La/x1x;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    new-instance v3, La/gj4;

    .line 102
    .line 103
    const/16 v4, 0x8

    .line 104
    .line 105
    invoke-direct {v3, v0, v1, v4}, La/gj4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v3}, La/c9x;->B(La/lm40;Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    iget-object v3, v0, La/sc5;->w:La/x1x;

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    iput-object v4, v0, La/sc5;->w:La/x1x;

    .line 115
    .line 116
    :goto_0
    iput-object v3, v0, La/sc5;->u:La/x1x;

    .line 117
    .line 118
    invoke-interface {v2}, La/fhl;->d()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    iput-wide v4, v0, La/sc5;->s:J

    .line 123
    .line 124
    invoke-virtual {v1}, La/g7z;->getLayoutDirection()La/k6z;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iput-object v2, v0, La/sc5;->t:La/k6z;

    .line 129
    .line 130
    iget-object v2, v0, La/sc5;->r:La/yjj0;

    .line 131
    .line 132
    iput-object v2, v0, La/sc5;->v:La/yjj0;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-wide v4, v0, La/sc5;->o:J

    .line 138
    .line 139
    sget-wide v6, La/y3d;->g:J

    .line 140
    .line 141
    invoke-static {v4, v5, v6, v7}, La/h2t0;->a(JJ)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-nez v2, :cond_4

    .line 146
    .line 147
    iget-wide v4, v0, La/sc5;->o:J

    .line 148
    .line 149
    invoke-static {v1, v3, v4, v5}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 150
    .line 151
    .line 152
    :cond_4
    iget-object v2, v0, La/sc5;->p:La/t89;

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    iget v6, v0, La/sc5;->q:F

    .line 157
    .line 158
    instance-of v0, v3, La/oe80;

    .line 159
    .line 160
    const-wide v7, 0xffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    const/16 v9, 0x20

    .line 166
    .line 167
    sget-object v4, La/l0q;->a:La/l0q;

    .line 168
    .line 169
    const/4 v5, 0x3

    .line 170
    if-eqz v0, :cond_5

    .line 171
    .line 172
    check-cast v3, La/oe80;

    .line 173
    .line 174
    iget-object v0, v3, La/oe80;->a:La/jge0;

    .line 175
    .line 176
    iget v3, v0, La/jge0;->a:F

    .line 177
    .line 178
    iget v10, v0, La/jge0;->b:F

    .line 179
    .line 180
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    int-to-long v11, v3

    .line 185
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    int-to-long v13, v3

    .line 190
    shl-long v9, v11, v9

    .line 191
    .line 192
    and-long/2addr v7, v13

    .line 193
    or-long/2addr v7, v9

    .line 194
    invoke-static {v0}, La/z1x;->O(La/jge0;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v9

    .line 198
    move-object v1, v2

    .line 199
    move-wide v2, v7

    .line 200
    const/4 v8, 0x0

    .line 201
    move-object/from16 v0, p1

    .line 202
    .line 203
    move-object v7, v4

    .line 204
    move-wide/from16 v16, v9

    .line 205
    .line 206
    move v9, v5

    .line 207
    move-wide/from16 v4, v16

    .line 208
    .line 209
    invoke-virtual/range {v0 .. v9}, La/g7z;->f0(La/t89;JJFLa/agc;La/a4d;I)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_2

    .line 213
    .line 214
    :cond_5
    move-object v1, v2

    .line 215
    instance-of v0, v3, La/pe80;

    .line 216
    .line 217
    if-eqz v0, :cond_7

    .line 218
    .line 219
    move-object v10, v3

    .line 220
    check-cast v10, La/pe80;

    .line 221
    .line 222
    move-object v2, v1

    .line 223
    iget-object v1, v10, La/pe80;->b:La/w03;

    .line 224
    .line 225
    if-eqz v1, :cond_6

    .line 226
    .line 227
    move-object/from16 v0, p1

    .line 228
    .line 229
    move v3, v6

    .line 230
    :goto_1
    invoke-virtual/range {v0 .. v5}, La/g7z;->M0(La/w03;La/t89;FLa/agc;I)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_6
    move-object v1, v2

    .line 235
    move v3, v6

    .line 236
    iget-object v0, v10, La/pe80;->a:La/wfg0;

    .line 237
    .line 238
    iget-wide v5, v0, La/wfg0;->h:J

    .line 239
    .line 240
    shr-long/2addr v5, v9

    .line 241
    long-to-int v2, v5

    .line 242
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    iget v5, v0, La/wfg0;->a:F

    .line 247
    .line 248
    iget v6, v0, La/wfg0;->b:F

    .line 249
    .line 250
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    int-to-long v10, v5

    .line 255
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    int-to-long v5, v5

    .line 260
    shl-long/2addr v10, v9

    .line 261
    and-long/2addr v5, v7

    .line 262
    or-long/2addr v5, v10

    .line 263
    invoke-virtual {v0}, La/wfg0;->b()F

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-virtual {v0}, La/wfg0;->a()F

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    int-to-long v10, v10

    .line 276
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    int-to-long v12, v0

    .line 281
    shl-long/2addr v10, v9

    .line 282
    and-long/2addr v12, v7

    .line 283
    or-long/2addr v10, v12

    .line 284
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    int-to-long v12, v0

    .line 289
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    int-to-long v14, v0

    .line 294
    shl-long/2addr v12, v9

    .line 295
    and-long/2addr v7, v14

    .line 296
    or-long/2addr v7, v12

    .line 297
    move-wide/from16 v16, v7

    .line 298
    .line 299
    move v8, v3

    .line 300
    move-wide v2, v5

    .line 301
    move-wide/from16 v6, v16

    .line 302
    .line 303
    move-object/from16 v0, p1

    .line 304
    .line 305
    move-object v9, v4

    .line 306
    move-wide v4, v10

    .line 307
    invoke-virtual/range {v0 .. v9}, La/g7z;->k0(La/t89;JJJFLa/agc;)V

    .line 308
    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_7
    instance-of v0, v3, La/ne80;

    .line 312
    .line 313
    if-eqz v0, :cond_8

    .line 314
    .line 315
    check-cast v3, La/ne80;

    .line 316
    .line 317
    iget-object v0, v3, La/ne80;->a:La/w03;

    .line 318
    .line 319
    move-object v2, v1

    .line 320
    move v3, v6

    .line 321
    move-object v1, v0

    .line 322
    move-object/from16 v0, p1

    .line 323
    .line 324
    goto :goto_1

    .line 325
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_9
    :goto_2
    invoke-virtual/range {p1 .. p1}, La/g7z;->a()V

    .line 330
    .line 331
    .line 332
    return-void
.end method

.method public final x0(La/abi0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/sc5;->r:La/yjj0;

    .line 2
    .line 3
    invoke-static {p1, p0}, La/yai0;->g(La/abi0;La/yjj0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
