.class public final La/ozn;
.super La/fnx;
.source "SourceFile"

# interfaces
.implements La/g6z;


# instance fields
.field public final A:La/nzn;

.field public final B:La/nzn;

.field public p:La/oms0;

.field public q:La/vls0;

.field public r:La/vls0;

.field public s:La/vls0;

.field public t:La/pzn;

.field public u:La/alo;

.field public v:La/toj0;

.field public w:Lkotlin/jvm/functions/Function0;

.field public x:La/czn;

.field public y:J

.field public z:La/u12;


# direct methods
.method public constructor <init>(La/oms0;La/vls0;La/vls0;La/vls0;La/pzn;La/alo;La/toj0;Lkotlin/jvm/functions/Function0;La/czn;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, La/fnx;-><init>(B)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, La/ozn;->p:La/oms0;

    .line 6
    .line 7
    iput-object p2, p0, La/ozn;->q:La/vls0;

    .line 8
    .line 9
    iput-object p3, p0, La/ozn;->r:La/vls0;

    .line 10
    .line 11
    iput-object p4, p0, La/ozn;->s:La/vls0;

    .line 12
    .line 13
    iput-object p5, p0, La/ozn;->t:La/pzn;

    .line 14
    .line 15
    iput-object p6, p0, La/ozn;->u:La/alo;

    .line 16
    .line 17
    iput-object p7, p0, La/ozn;->v:La/toj0;

    .line 18
    .line 19
    iput-object p8, p0, La/ozn;->w:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    iput-object p9, p0, La/ozn;->x:La/czn;

    .line 22
    .line 23
    const-wide p1, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    iput-wide p1, p0, La/ozn;->y:J

    .line 29
    .line 30
    const/16 p1, 0xf

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-static {p2, p2, p2, p2, p1}, La/r4e;->b(IIIII)J

    .line 34
    .line 35
    .line 36
    new-instance p1, La/nzn;

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, La/nzn;-><init>(La/ozn;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/ozn;->A:La/nzn;

    .line 42
    .line 43
    new-instance p1, La/nzn;

    .line 44
    .line 45
    invoke-direct {p1, p0, v0}, La/nzn;-><init>(La/ozn;B)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/ozn;->B:La/nzn;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final N(La/j6z;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final R0()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, La/ozn;->y:J

    .line 7
    .line 8
    return-void
.end method

.method public final b1()La/u12;
    .locals 3

    .line 1
    iget-object v0, p0, La/ozn;->p:La/oms0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/oms0;->f()La/ams0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La/azn;->a:La/azn;

    .line 8
    .line 9
    sget-object v2, La/azn;->b:La/azn;

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, La/ozn;->t:La/pzn;

    .line 18
    .line 19
    iget-object v0, v0, La/pzn;->a:La/jms0;

    .line 20
    .line 21
    iget-object v0, v0, La/jms0;->c:La/isb;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, v0, La/isb;->a:La/u12;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object v0

    .line 31
    :cond_1
    :goto_0
    iget-object p0, p0, La/ozn;->u:La/alo;

    .line 32
    .line 33
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 34
    .line 35
    iget-object p0, p0, La/jms0;->c:La/isb;

    .line 36
    .line 37
    if-eqz p0, :cond_5

    .line 38
    .line 39
    iget-object p0, p0, La/isb;->a:La/u12;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    iget-object v0, p0, La/ozn;->u:La/alo;

    .line 43
    .line 44
    iget-object v0, v0, La/alo;->a:La/jms0;

    .line 45
    .line 46
    iget-object v0, v0, La/jms0;->c:La/isb;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v0, v0, La/isb;->a:La/u12;

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-object v0

    .line 56
    :cond_4
    :goto_1
    iget-object p0, p0, La/ozn;->t:La/pzn;

    .line 57
    .line 58
    iget-object p0, p0, La/pzn;->a:La/jms0;

    .line 59
    .line 60
    iget-object p0, p0, La/jms0;->c:La/isb;

    .line 61
    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    iget-object p0, p0, La/isb;->a:La/u12;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    iget-object v0, v1, La/ozn;->p:La/oms0;

    .line 6
    .line 7
    iget-object v0, v0, La/oms0;->a:La/p4;

    .line 8
    .line 9
    invoke-virtual {v0}, La/p4;->y0()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v2, v1, La/ozn;->p:La/oms0;

    .line 14
    .line 15
    iget-object v2, v2, La/oms0;->d:La/pz40;

    .line 16
    .line 17
    check-cast v2, La/hgk0;

    .line 18
    .line 19
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    iput-object v3, v1, La/ozn;->z:La/u12;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, v1, La/ozn;->z:La/u12;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, La/ozn;->b1()La/u12;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, La/gqw0;->a:La/zx7;

    .line 40
    .line 41
    :cond_1
    iput-object v0, v1, La/ozn;->z:La/u12;

    .line 42
    .line 43
    :cond_2
    :goto_0
    invoke-interface {v13}, La/cnx;->M()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v2, 0x1

    .line 48
    const-wide v4, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const/16 v6, 0x20

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-interface/range {p2 .. p4}, La/pj30;->S(J)La/pu90;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v3, v0, La/pu90;->a:I

    .line 62
    .line 63
    iget v7, v0, La/pu90;->b:I

    .line 64
    .line 65
    int-to-long v8, v3

    .line 66
    shl-long/2addr v8, v6

    .line 67
    int-to-long v10, v7

    .line 68
    and-long/2addr v10, v4

    .line 69
    or-long v7, v8, v10

    .line 70
    .line 71
    iput-wide v7, v1, La/ozn;->y:J

    .line 72
    .line 73
    shr-long v9, v7, v6

    .line 74
    .line 75
    long-to-int v1, v9

    .line 76
    and-long v3, v7, v4

    .line 77
    .line 78
    long-to-int v3, v3

    .line 79
    new-instance v4, La/r63;

    .line 80
    .line 81
    invoke-direct {v4, v0, v2}, La/r63;-><init>(La/pu90;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {v13, v1, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_3
    iget-object v0, v1, La/ozn;->w:Lkotlin/jvm/functions/Function0;

    .line 90
    .line 91
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_1c

    .line 102
    .line 103
    iget-object v0, v1, La/ozn;->x:La/czn;

    .line 104
    .line 105
    iget-object v8, v0, La/czn;->a:La/vls0;

    .line 106
    .line 107
    iget-object v15, v0, La/czn;->b:La/toj0;

    .line 108
    .line 109
    iget-object v9, v0, La/czn;->c:La/vls0;

    .line 110
    .line 111
    iget-object v10, v0, La/czn;->d:La/oms0;

    .line 112
    .line 113
    iget-object v11, v0, La/czn;->e:La/pzn;

    .line 114
    .line 115
    iget-object v12, v11, La/pzn;->a:La/jms0;

    .line 116
    .line 117
    iget-object v14, v0, La/czn;->f:La/alo;

    .line 118
    .line 119
    iget-object v0, v0, La/czn;->g:La/vls0;

    .line 120
    .line 121
    move-wide/from16 v20, v4

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    if-eqz v8, :cond_5

    .line 125
    .line 126
    new-instance v5, La/ezn;

    .line 127
    .line 128
    invoke-direct {v5, v11, v14, v4}, La/ezn;-><init>(La/pzn;La/alo;B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v15}, La/toj0;->a()Z

    .line 132
    .line 133
    .line 134
    move-result v16

    .line 135
    move/from16 v22, v6

    .line 136
    .line 137
    if-eqz v16, :cond_4

    .line 138
    .line 139
    iget v6, v15, La/toj0;->f:F

    .line 140
    .line 141
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    goto :goto_1

    .line 146
    :cond_4
    move-object v6, v3

    .line 147
    :goto_1
    new-instance v7, La/fzn;

    .line 148
    .line 149
    invoke-direct {v7, v11, v14, v15, v4}, La/fzn;-><init>(La/pzn;La/alo;La/toj0;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v5, v6, v3, v7}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    goto :goto_2

    .line 157
    :cond_5
    move/from16 v22, v6

    .line 158
    .line 159
    move-object v5, v3

    .line 160
    :goto_2
    if-eqz v9, :cond_a

    .line 161
    .line 162
    new-instance v7, La/ezn;

    .line 163
    .line 164
    invoke-direct {v7, v11, v14, v2}, La/ezn;-><init>(La/pzn;La/alo;B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v15}, La/toj0;->a()Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_6

    .line 172
    .line 173
    iget v8, v15, La/toj0;->g:F

    .line 174
    .line 175
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    goto :goto_3

    .line 180
    :cond_6
    move-object v8, v3

    .line 181
    :goto_3
    invoke-virtual {v15}, La/toj0;->a()Z

    .line 182
    .line 183
    .line 184
    move-result v16

    .line 185
    if-eqz v16, :cond_9

    .line 186
    .line 187
    iget-object v6, v15, La/toj0;->j:La/i6u0;

    .line 188
    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    invoke-virtual {v6}, La/i6u0;->b()F

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 196
    .line 197
    .line 198
    move-result-object v16

    .line 199
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-nez v6, :cond_7

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_7
    move-object/from16 v16, v3

    .line 207
    .line 208
    :goto_4
    if-eqz v16, :cond_8

    .line 209
    .line 210
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    goto :goto_5

    .line 215
    :cond_8
    const/4 v6, 0x0

    .line 216
    :goto_5
    new-instance v4, La/p73;

    .line 217
    .line 218
    invoke-direct {v4, v6}, La/p73;-><init>(F)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_9
    move-object v4, v3

    .line 223
    :goto_6
    new-instance v6, La/fzn;

    .line 224
    .line 225
    invoke-direct {v6, v11, v14, v15, v2}, La/fzn;-><init>(La/pzn;La/alo;La/toj0;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9, v7, v8, v4, v6}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    goto :goto_7

    .line 233
    :cond_a
    move-object v4, v3

    .line 234
    :goto_7
    iget-object v6, v10, La/oms0;->a:La/p4;

    .line 235
    .line 236
    invoke-virtual {v6}, La/p4;->y0()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    sget-object v7, La/azn;->a:La/azn;

    .line 241
    .line 242
    if-ne v6, v7, :cond_d

    .line 243
    .line 244
    iget-object v6, v12, La/jms0;->d:La/k1h0;

    .line 245
    .line 246
    if-eqz v6, :cond_b

    .line 247
    .line 248
    iget-wide v6, v6, La/k1h0;->b:J

    .line 249
    .line 250
    new-instance v8, La/ils0;

    .line 251
    .line 252
    invoke-direct {v8, v6, v7}, La/ils0;-><init>(J)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_b
    iget-object v6, v14, La/alo;->a:La/jms0;

    .line 257
    .line 258
    iget-object v6, v6, La/jms0;->d:La/k1h0;

    .line 259
    .line 260
    if-eqz v6, :cond_c

    .line 261
    .line 262
    iget-wide v6, v6, La/k1h0;->b:J

    .line 263
    .line 264
    new-instance v8, La/ils0;

    .line 265
    .line 266
    invoke-direct {v8, v6, v7}, La/ils0;-><init>(J)V

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_c
    move-object v8, v3

    .line 271
    goto :goto_8

    .line 272
    :cond_d
    iget-object v6, v14, La/alo;->a:La/jms0;

    .line 273
    .line 274
    iget-object v6, v6, La/jms0;->d:La/k1h0;

    .line 275
    .line 276
    if-eqz v6, :cond_e

    .line 277
    .line 278
    iget-wide v6, v6, La/k1h0;->b:J

    .line 279
    .line 280
    new-instance v8, La/ils0;

    .line 281
    .line 282
    invoke-direct {v8, v6, v7}, La/ils0;-><init>(J)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_e
    iget-object v6, v12, La/jms0;->d:La/k1h0;

    .line 287
    .line 288
    if-eqz v6, :cond_c

    .line 289
    .line 290
    iget-wide v6, v6, La/k1h0;->b:J

    .line 291
    .line 292
    new-instance v8, La/ils0;

    .line 293
    .line 294
    invoke-direct {v8, v6, v7}, La/ils0;-><init>(J)V

    .line 295
    .line 296
    .line 297
    :goto_8
    if-eqz v0, :cond_10

    .line 298
    .line 299
    sget-object v6, La/gzn;->b:La/gzn;

    .line 300
    .line 301
    invoke-virtual {v15}, La/toj0;->a()Z

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-eqz v7, :cond_f

    .line 306
    .line 307
    iget-wide v9, v15, La/toj0;->h:J

    .line 308
    .line 309
    new-instance v7, La/ils0;

    .line 310
    .line 311
    invoke-direct {v7, v9, v10}, La/ils0;-><init>(J)V

    .line 312
    .line 313
    .line 314
    :goto_9
    move-object/from16 v17, v14

    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_f
    move-object v7, v3

    .line 318
    goto :goto_9

    .line 319
    :goto_a
    new-instance v14, La/u9d;

    .line 320
    .line 321
    const/16 v19, 0x2

    .line 322
    .line 323
    move-object/from16 v16, v11

    .line 324
    .line 325
    move-object/from16 v18, v15

    .line 326
    .line 327
    move-object v15, v8

    .line 328
    invoke-direct/range {v14 .. v19}, La/u9d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 329
    .line 330
    .line 331
    move-object/from16 v15, v18

    .line 332
    .line 333
    invoke-virtual {v0, v6, v7, v3, v14}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    move-object/from16 v18, v0

    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_10
    move-object/from16 v18, v3

    .line 341
    .line 342
    :goto_b
    new-instance v12, La/u9d;

    .line 343
    .line 344
    const/16 v19, 0x1

    .line 345
    .line 346
    move-object/from16 v17, v4

    .line 347
    .line 348
    move-object/from16 v16, v5

    .line 349
    .line 350
    move-object v14, v12

    .line 351
    invoke-direct/range {v14 .. v19}, La/u9d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 352
    .line 353
    .line 354
    invoke-interface/range {p2 .. p4}, La/pj30;->S(J)La/pu90;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    iget v0, v9, La/pu90;->a:I

    .line 359
    .line 360
    iget v4, v9, La/pu90;->b:I

    .line 361
    .line 362
    int-to-long v5, v0

    .line 363
    shl-long v5, v5, v22

    .line 364
    .line 365
    int-to-long v7, v4

    .line 366
    and-long v7, v7, v20

    .line 367
    .line 368
    or-long v4, v5, v7

    .line 369
    .line 370
    iget-wide v6, v1, La/ozn;->y:J

    .line 371
    .line 372
    const-wide v10, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    invoke-static {v6, v7, v10, v11}, La/qkx;->a(JJ)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-nez v0, :cond_11

    .line 382
    .line 383
    iget-wide v6, v1, La/ozn;->y:J

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_11
    move-wide v6, v4

    .line 387
    :goto_c
    iget-object v0, v1, La/ozn;->q:La/vls0;

    .line 388
    .line 389
    if-eqz v0, :cond_12

    .line 390
    .line 391
    new-instance v8, La/mzn;

    .line 392
    .line 393
    const/4 v10, 0x0

    .line 394
    invoke-direct {v8, v1, v6, v7, v10}, La/mzn;-><init>(La/ozn;JB)V

    .line 395
    .line 396
    .line 397
    iget-object v10, v1, La/ozn;->A:La/nzn;

    .line 398
    .line 399
    invoke-virtual {v0, v10, v3, v3, v8}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    goto :goto_d

    .line 404
    :cond_12
    move-object v0, v3

    .line 405
    :goto_d
    if-eqz v0, :cond_13

    .line 406
    .line 407
    invoke-virtual {v0}, La/uls0;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    check-cast v0, La/qkx;

    .line 412
    .line 413
    iget-wide v10, v0, La/qkx;->a:J

    .line 414
    .line 415
    :goto_e
    move-wide/from16 v14, p3

    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_13
    move-wide v10, v4

    .line 419
    goto :goto_e

    .line 420
    :goto_f
    invoke-static {v14, v15, v10, v11}, La/r4e;->d(JJ)J

    .line 421
    .line 422
    .line 423
    move-result-wide v10

    .line 424
    iget-object v0, v1, La/ozn;->r:La/vls0;

    .line 425
    .line 426
    if-eqz v0, :cond_14

    .line 427
    .line 428
    sget-object v8, La/gzn;->i:La/gzn;

    .line 429
    .line 430
    const-wide/16 p2, 0x0

    .line 431
    .line 432
    new-instance v14, La/mzn;

    .line 433
    .line 434
    const/4 v15, 0x2

    .line 435
    invoke-direct {v14, v1, v6, v7, v15}, La/mzn;-><init>(La/ozn;JB)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v8, v3, v3, v14}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, La/uls0;->getValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    check-cast v0, La/ikx;

    .line 447
    .line 448
    iget-wide v14, v0, La/ikx;->a:J

    .line 449
    .line 450
    goto :goto_10

    .line 451
    :cond_14
    const-wide/16 p2, 0x0

    .line 452
    .line 453
    move-wide/from16 v14, p2

    .line 454
    .line 455
    :goto_10
    iget-object v0, v1, La/ozn;->s:La/vls0;

    .line 456
    .line 457
    if-eqz v0, :cond_1b

    .line 458
    .line 459
    iget-object v8, v1, La/ozn;->v:La/toj0;

    .line 460
    .line 461
    invoke-virtual {v8}, La/toj0;->a()Z

    .line 462
    .line 463
    .line 464
    move-result v16

    .line 465
    move-wide/from16 v17, v4

    .line 466
    .line 467
    if-eqz v16, :cond_15

    .line 468
    .line 469
    iget-wide v3, v8, La/toj0;->i:J

    .line 470
    .line 471
    new-instance v5, La/ikx;

    .line 472
    .line 473
    invoke-direct {v5, v3, v4}, La/ikx;-><init>(J)V

    .line 474
    .line 475
    .line 476
    goto :goto_11

    .line 477
    :cond_15
    const/4 v5, 0x0

    .line 478
    :goto_11
    iget-object v3, v1, La/ozn;->v:La/toj0;

    .line 479
    .line 480
    invoke-virtual {v3}, La/toj0;->a()Z

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    if-eqz v3, :cond_1a

    .line 485
    .line 486
    invoke-static/range {p2 .. p3}, La/g6u0;->b(J)F

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    if-nez v3, :cond_16

    .line 499
    .line 500
    goto :goto_12

    .line 501
    :cond_16
    const/4 v4, 0x0

    .line 502
    :goto_12
    if-eqz v4, :cond_17

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    goto :goto_13

    .line 509
    :cond_17
    const/4 v3, 0x0

    .line 510
    :goto_13
    invoke-static/range {p2 .. p3}, La/g6u0;->c(J)F

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    if-nez v4, :cond_18

    .line 523
    .line 524
    move-object/from16 v16, v8

    .line 525
    .line 526
    goto :goto_14

    .line 527
    :cond_18
    const/16 v16, 0x0

    .line 528
    .line 529
    :goto_14
    if-eqz v16, :cond_19

    .line 530
    .line 531
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Float;->floatValue()F

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    goto :goto_15

    .line 536
    :cond_19
    const/4 v4, 0x0

    .line 537
    :goto_15
    new-instance v8, La/q73;

    .line 538
    .line 539
    invoke-direct {v8, v3, v4}, La/q73;-><init>(FF)V

    .line 540
    .line 541
    .line 542
    move-object v3, v8

    .line 543
    goto :goto_16

    .line 544
    :cond_1a
    const/4 v3, 0x0

    .line 545
    :goto_16
    new-instance v4, La/mzn;

    .line 546
    .line 547
    invoke-direct {v4, v1, v6, v7, v2}, La/mzn;-><init>(La/ozn;JB)V

    .line 548
    .line 549
    .line 550
    iget-object v2, v1, La/ozn;->B:La/nzn;

    .line 551
    .line 552
    invoke-virtual {v0, v2, v5, v3, v4}, La/vls0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;La/t73;Lkotlin/jvm/functions/Function1;)La/uls0;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    move-object v2, v3

    .line 557
    goto :goto_17

    .line 558
    :cond_1b
    move-wide/from16 v17, v4

    .line 559
    .line 560
    const/4 v2, 0x0

    .line 561
    :goto_17
    shr-long v3, v10, v22

    .line 562
    .line 563
    long-to-int v0, v3

    .line 564
    and-long v3, v10, v20

    .line 565
    .line 566
    long-to-int v3, v3

    .line 567
    move v4, v0

    .line 568
    new-instance v0, La/lzn;

    .line 569
    .line 570
    move-wide v5, v6

    .line 571
    move-wide v7, v10

    .line 572
    move-wide v10, v14

    .line 573
    move v15, v3

    .line 574
    move v14, v4

    .line 575
    move-wide/from16 v3, v17

    .line 576
    .line 577
    invoke-direct/range {v0 .. v12}, La/lzn;-><init>(La/ozn;La/uls0;JJJLa/pu90;JLa/u9d;)V

    .line 578
    .line 579
    .line 580
    invoke-static {v13, v14, v15, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    return-object v0

    .line 585
    :cond_1c
    move-wide/from16 v14, p3

    .line 586
    .line 587
    invoke-interface/range {p2 .. p4}, La/pj30;->S(J)La/pu90;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    iget v1, v0, La/pu90;->a:I

    .line 592
    .line 593
    iget v2, v0, La/pu90;->b:I

    .line 594
    .line 595
    new-instance v3, La/r63;

    .line 596
    .line 597
    const/4 v15, 0x2

    .line 598
    invoke-direct {v3, v0, v15}, La/r63;-><init>(La/pu90;B)V

    .line 599
    .line 600
    .line 601
    invoke-static {v13, v1, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    return-object v0
.end method
