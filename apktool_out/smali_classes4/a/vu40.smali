.class public final La/vu40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/uu40;

.field public b:La/uu40;

.field public c:La/uu40;

.field public d:La/uu40;

.field public e:I

.field public f:I

.field public g:I

.field public h:La/qb8;

.field public i:La/qb8;

.field public j:La/qb8;

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    sget-object v0, La/uu40;->d:La/uu40;

    .line 2
    .line 3
    iput-object v0, p0, La/vu40;->a:La/uu40;

    .line 4
    .line 5
    sget-object v0, La/uu40;->a:La/uu40;

    .line 6
    .line 7
    iput-object v0, p0, La/vu40;->b:La/uu40;

    .line 8
    .line 9
    iput-object v0, p0, La/vu40;->c:La/uu40;

    .line 10
    .line 11
    iput-object v0, p0, La/vu40;->d:La/uu40;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, La/vu40;->h:La/qb8;

    .line 15
    .line 16
    iput-object v0, p0, La/vu40;->i:La/qb8;

    .line 17
    .line 18
    iput-object v0, p0, La/vu40;->j:La/qb8;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, La/vu40;->k:I

    .line 22
    .line 23
    iput v0, p0, La/vu40;->l:I

    .line 24
    .line 25
    iput v0, p0, La/vu40;->m:I

    .line 26
    .line 27
    iput v0, p0, La/vu40;->n:I

    .line 28
    .line 29
    iput v0, p0, La/vu40;->o:I

    .line 30
    .line 31
    iput v0, p0, La/vu40;->p:I

    .line 32
    .line 33
    iput v0, p0, La/vu40;->q:I

    .line 34
    .line 35
    iput v0, p0, La/vu40;->r:I

    .line 36
    .line 37
    iput v0, p0, La/vu40;->s:I

    .line 38
    .line 39
    iput v0, p0, La/vu40;->t:I

    .line 40
    .line 41
    const/4 v0, -0x1

    .line 42
    iput v0, p0, La/vu40;->u:I

    .line 43
    .line 44
    iput v0, p0, La/vu40;->v:I

    .line 45
    .line 46
    return-void
.end method

.method public final b()La/qb8;
    .locals 1

    .line 1
    iget-object v0, p0, La/vu40;->i:La/qb8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/vu40;->j:La/qb8;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    return-object v0
.end method

.method public final c()La/qb8;
    .locals 1

    .line 1
    iget-object v0, p0, La/vu40;->h:La/qb8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/vu40;->j:La/qb8;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    return-object v0
.end method

.method public final d(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, La/vu40;->v:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget v0, p0, La/vu40;->u:I

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, p3, p4}, La/vu40;->f(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 17
    .line 18
    .line 19
    iget p1, p2, La/qb8;->p:I

    .line 20
    .line 21
    iput p1, p0, La/vu40;->u:I

    .line 22
    .line 23
    iget p1, p2, La/qb8;->q:I

    .line 24
    .line 25
    iput p1, p0, La/vu40;->v:I

    .line 26
    .line 27
    iput-object p2, p0, La/vu40;->j:La/qb8;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-boolean v0, p2, La/qb8;->c:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2, p3, p4}, La/vu40;->e(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 35
    .line 36
    .line 37
    iget p1, p2, La/qb8;->p:I

    .line 38
    .line 39
    iget p3, p0, La/vu40;->u:I

    .line 40
    .line 41
    if-ne p1, p3, :cond_1

    .line 42
    .line 43
    iget p1, p2, La/qb8;->q:I

    .line 44
    .line 45
    :cond_1
    iput p1, p0, La/vu40;->u:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, La/vu40;->f(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 49
    .line 50
    .line 51
    iget p1, p2, La/qb8;->p:I

    .line 52
    .line 53
    iget p3, p0, La/vu40;->v:I

    .line 54
    .line 55
    if-ne p1, p3, :cond_3

    .line 56
    .line 57
    iget p1, p2, La/qb8;->q:I

    .line 58
    .line 59
    :cond_3
    iput p1, p0, La/vu40;->v:I

    .line 60
    .line 61
    return-void
.end method

.method public final e(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V
    .locals 16

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, La/vu40;->i:La/qb8;

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    iget-object v5, v0, La/vu40;->h:La/qb8;

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    iget v5, v0, La/vu40;->g:I

    .line 20
    .line 21
    neg-int v5, v5

    .line 22
    iput v5, v0, La/vu40;->o:I

    .line 23
    .line 24
    iget-object v6, v0, La/vu40;->a:La/uu40;

    .line 25
    .line 26
    sget-object v7, La/uu40;->b:La/uu40;

    .line 27
    .line 28
    if-ne v6, v7, :cond_0

    .line 29
    .line 30
    shr-int/lit8 v6, v5, 0x1

    .line 31
    .line 32
    iput v6, v0, La/vu40;->o:I

    .line 33
    .line 34
    iput v5, v0, La/vu40;->p:I

    .line 35
    .line 36
    :cond_0
    iget v5, v2, La/qb8;->p:I

    .line 37
    .line 38
    iget v6, v0, La/vu40;->u:I

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x1

    .line 42
    if-ne v5, v6, :cond_1

    .line 43
    .line 44
    move v5, v8

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v5, v7

    .line 47
    :goto_0
    iget-object v6, v0, La/vu40;->a:La/uu40;

    .line 48
    .line 49
    sget-object v9, La/uu40;->d:La/uu40;

    .line 50
    .line 51
    const/16 v11, 0x5a

    .line 52
    .line 53
    const/4 v12, 0x5

    .line 54
    const/4 v13, 0x0

    .line 55
    if-ne v6, v9, :cond_9

    .line 56
    .line 57
    iput-object v9, v0, La/vu40;->b:La/uu40;

    .line 58
    .line 59
    iget v6, v0, La/vu40;->o:I

    .line 60
    .line 61
    iget v14, v0, La/vu40;->g:I

    .line 62
    .line 63
    sub-int/2addr v6, v14

    .line 64
    iget v14, v0, La/vu40;->e:I

    .line 65
    .line 66
    neg-int v14, v14

    .line 67
    iget v15, v0, La/vu40;->m:I

    .line 68
    .line 69
    add-int/2addr v14, v15

    .line 70
    if-ge v6, v14, :cond_4

    .line 71
    .line 72
    sget-object v5, La/uu40;->b:La/uu40;

    .line 73
    .line 74
    iput-object v5, v0, La/vu40;->a:La/uu40;

    .line 75
    .line 76
    iget v5, v0, La/vu40;->p:I

    .line 77
    .line 78
    invoke-virtual {v0}, La/vu40;->b()La/qb8;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 85
    .line 86
    if-ne v6, v8, :cond_2

    .line 87
    .line 88
    iget v6, v0, La/vu40;->g:I

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget v6, v0, La/vu40;->g:I

    .line 92
    .line 93
    iget v7, v0, La/vu40;->f:I

    .line 94
    .line 95
    sub-int/2addr v6, v7

    .line 96
    shr-int/2addr v6, v8

    .line 97
    add-int/2addr v6, v7

    .line 98
    :goto_1
    sub-int/2addr v5, v6

    .line 99
    iput v5, v0, La/vu40;->p:I

    .line 100
    .line 101
    iget v5, v0, La/vu40;->o:I

    .line 102
    .line 103
    invoke-virtual {v0}, La/vu40;->b()La/qb8;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 110
    .line 111
    if-ne v6, v8, :cond_3

    .line 112
    .line 113
    iget v6, v0, La/vu40;->f:I

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    iget v6, v0, La/vu40;->g:I

    .line 117
    .line 118
    shr-int/2addr v6, v8

    .line 119
    :goto_2
    add-int/2addr v5, v6

    .line 120
    iput v5, v0, La/vu40;->o:I

    .line 121
    .line 122
    invoke-virtual/range {p0 .. p4}, La/vu40;->e(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_4
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 127
    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    invoke-virtual {v2, v1, v13, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 131
    .line 132
    .line 133
    iget v6, v0, La/vu40;->o:I

    .line 134
    .line 135
    iget v14, v0, La/vu40;->p:I

    .line 136
    .line 137
    iget v15, v0, La/vu40;->f:I

    .line 138
    .line 139
    add-int/2addr v15, v6

    .line 140
    iget v10, v0, La/vu40;->g:I

    .line 141
    .line 142
    add-int/2addr v10, v14

    .line 143
    invoke-virtual {v3, v6, v14, v15, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 144
    .line 145
    .line 146
    iget v6, v0, La/vu40;->o:I

    .line 147
    .line 148
    neg-int v10, v6

    .line 149
    iget v14, v0, La/vu40;->f:I

    .line 150
    .line 151
    sub-int/2addr v10, v14

    .line 152
    iget v15, v0, La/vu40;->k:I

    .line 153
    .line 154
    if-le v10, v15, :cond_5

    .line 155
    .line 156
    iput v10, v0, La/vu40;->k:I

    .line 157
    .line 158
    :cond_5
    sub-int/2addr v6, v14

    .line 159
    iput v6, v0, La/vu40;->o:I

    .line 160
    .line 161
    iput-byte v12, v2, La/qb8;->o:B

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_6
    if-eqz v5, :cond_7

    .line 165
    .line 166
    move v6, v11

    .line 167
    goto :goto_3

    .line 168
    :cond_7
    const/16 v6, 0x10e

    .line 169
    .line 170
    :goto_3
    int-to-float v6, v6

    .line 171
    invoke-virtual {v2, v1, v6, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 172
    .line 173
    .line 174
    iget v6, v0, La/vu40;->o:I

    .line 175
    .line 176
    iget v10, v0, La/vu40;->p:I

    .line 177
    .line 178
    iget v14, v0, La/vu40;->f:I

    .line 179
    .line 180
    add-int/2addr v14, v6

    .line 181
    iget v15, v0, La/vu40;->g:I

    .line 182
    .line 183
    add-int/2addr v15, v10

    .line 184
    invoke-virtual {v3, v6, v10, v14, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 185
    .line 186
    .line 187
    iget v6, v0, La/vu40;->o:I

    .line 188
    .line 189
    neg-int v10, v6

    .line 190
    iget v14, v0, La/vu40;->k:I

    .line 191
    .line 192
    if-le v10, v14, :cond_8

    .line 193
    .line 194
    iput v10, v0, La/vu40;->k:I

    .line 195
    .line 196
    :cond_8
    iget v10, v0, La/vu40;->g:I

    .line 197
    .line 198
    sub-int/2addr v6, v10

    .line 199
    iput v6, v0, La/vu40;->o:I

    .line 200
    .line 201
    :cond_9
    :goto_4
    iget-object v6, v0, La/vu40;->a:La/uu40;

    .line 202
    .line 203
    sget-object v10, La/uu40;->b:La/uu40;

    .line 204
    .line 205
    const/4 v14, 0x3

    .line 206
    if-ne v6, v10, :cond_13

    .line 207
    .line 208
    iget v6, v0, La/vu40;->t:I

    .line 209
    .line 210
    add-int/2addr v6, v8

    .line 211
    iput v6, v0, La/vu40;->t:I

    .line 212
    .line 213
    const/4 v15, 0x2

    .line 214
    if-le v6, v15, :cond_c

    .line 215
    .line 216
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 217
    .line 218
    if-nez v6, :cond_c

    .line 219
    .line 220
    iget-object v5, v0, La/vu40;->b:La/uu40;

    .line 221
    .line 222
    sget-object v6, La/uu40;->a:La/uu40;

    .line 223
    .line 224
    if-ne v5, v6, :cond_a

    .line 225
    .line 226
    move-object v6, v9

    .line 227
    :cond_a
    iput-object v6, v0, La/vu40;->a:La/uu40;

    .line 228
    .line 229
    iput v7, v0, La/vu40;->t:I

    .line 230
    .line 231
    iget v5, v0, La/vu40;->o:I

    .line 232
    .line 233
    if-ne v6, v9, :cond_b

    .line 234
    .line 235
    iget v6, v0, La/vu40;->f:I

    .line 236
    .line 237
    sub-int/2addr v5, v6

    .line 238
    iput v5, v0, La/vu40;->o:I

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_b
    iget v6, v0, La/vu40;->g:I

    .line 242
    .line 243
    iget v7, v0, La/vu40;->f:I

    .line 244
    .line 245
    sub-int/2addr v6, v7

    .line 246
    add-int/2addr v6, v5

    .line 247
    iput v6, v0, La/vu40;->o:I

    .line 248
    .line 249
    move v6, v7

    .line 250
    :goto_5
    iget v5, v0, La/vu40;->p:I

    .line 251
    .line 252
    iget v7, v0, La/vu40;->g:I

    .line 253
    .line 254
    sub-int/2addr v7, v6

    .line 255
    shr-int/2addr v7, v8

    .line 256
    sub-int/2addr v6, v7

    .line 257
    add-int/2addr v6, v5

    .line 258
    iput v6, v0, La/vu40;->p:I

    .line 259
    .line 260
    invoke-virtual/range {p0 .. p4}, La/vu40;->e(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_c
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 265
    .line 266
    if-eqz v6, :cond_f

    .line 267
    .line 268
    const/high16 v6, 0x42b40000    # 90.0f

    .line 269
    .line 270
    invoke-virtual {v2, v1, v6, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 271
    .line 272
    .line 273
    iget v6, v0, La/vu40;->o:I

    .line 274
    .line 275
    iget v7, v0, La/vu40;->p:I

    .line 276
    .line 277
    iget v9, v0, La/vu40;->f:I

    .line 278
    .line 279
    add-int/2addr v9, v6

    .line 280
    iget v12, v0, La/vu40;->g:I

    .line 281
    .line 282
    add-int/2addr v12, v7

    .line 283
    invoke-virtual {v3, v6, v7, v9, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 284
    .line 285
    .line 286
    iget-object v6, v0, La/vu40;->b:La/uu40;

    .line 287
    .line 288
    sget-object v7, La/uu40;->a:La/uu40;

    .line 289
    .line 290
    if-ne v6, v7, :cond_d

    .line 291
    .line 292
    const/16 v6, 0x53

    .line 293
    .line 294
    iput-byte v6, v2, La/qb8;->o:B

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_d
    const/16 v6, 0x55

    .line 298
    .line 299
    iput-byte v6, v2, La/qb8;->o:B

    .line 300
    .line 301
    :goto_6
    iget v6, v0, La/vu40;->p:I

    .line 302
    .line 303
    neg-int v7, v6

    .line 304
    iget v9, v0, La/vu40;->l:I

    .line 305
    .line 306
    if-le v7, v9, :cond_e

    .line 307
    .line 308
    iput v7, v0, La/vu40;->l:I

    .line 309
    .line 310
    :cond_e
    iget v7, v0, La/vu40;->f:I

    .line 311
    .line 312
    sub-int/2addr v6, v7

    .line 313
    iput v6, v0, La/vu40;->p:I

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_f
    if-eqz v5, :cond_10

    .line 317
    .line 318
    const/16 v7, 0xb4

    .line 319
    .line 320
    :cond_10
    int-to-float v6, v7

    .line 321
    invoke-virtual {v2, v1, v6, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 322
    .line 323
    .line 324
    iget v6, v0, La/vu40;->o:I

    .line 325
    .line 326
    iget v7, v0, La/vu40;->p:I

    .line 327
    .line 328
    iget v9, v0, La/vu40;->f:I

    .line 329
    .line 330
    add-int/2addr v9, v6

    .line 331
    iget v15, v0, La/vu40;->g:I

    .line 332
    .line 333
    add-int/2addr v15, v7

    .line 334
    invoke-virtual {v3, v6, v7, v9, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 335
    .line 336
    .line 337
    iget v6, v0, La/vu40;->p:I

    .line 338
    .line 339
    neg-int v7, v6

    .line 340
    iget v9, v0, La/vu40;->l:I

    .line 341
    .line 342
    if-le v7, v9, :cond_11

    .line 343
    .line 344
    iput v7, v0, La/vu40;->l:I

    .line 345
    .line 346
    :cond_11
    iget v7, v0, La/vu40;->g:I

    .line 347
    .line 348
    sub-int/2addr v6, v7

    .line 349
    iput v6, v0, La/vu40;->p:I

    .line 350
    .line 351
    iget-object v6, v0, La/vu40;->b:La/uu40;

    .line 352
    .line 353
    sget-object v7, La/uu40;->a:La/uu40;

    .line 354
    .line 355
    if-ne v6, v7, :cond_12

    .line 356
    .line 357
    iput-byte v14, v2, La/qb8;->o:B

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_12
    iput-byte v12, v2, La/qb8;->o:B

    .line 361
    .line 362
    :cond_13
    :goto_7
    iget-object v6, v0, La/vu40;->a:La/uu40;

    .line 363
    .line 364
    sget-object v7, La/uu40;->a:La/uu40;

    .line 365
    .line 366
    if-ne v6, v7, :cond_19

    .line 367
    .line 368
    iput-object v7, v0, La/vu40;->b:La/uu40;

    .line 369
    .line 370
    iget v6, v0, La/vu40;->o:I

    .line 371
    .line 372
    iget v7, v0, La/vu40;->g:I

    .line 373
    .line 374
    add-int/2addr v6, v7

    .line 375
    iget v7, v0, La/vu40;->f:I

    .line 376
    .line 377
    add-int/2addr v6, v7

    .line 378
    iget v7, v0, La/vu40;->e:I

    .line 379
    .line 380
    iget v9, v0, La/vu40;->k:I

    .line 381
    .line 382
    sub-int/2addr v7, v9

    .line 383
    if-le v6, v7, :cond_16

    .line 384
    .line 385
    iput-object v10, v0, La/vu40;->a:La/uu40;

    .line 386
    .line 387
    iget v5, v0, La/vu40;->p:I

    .line 388
    .line 389
    invoke-virtual {v0}, La/vu40;->b()La/qb8;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    if-eqz v6, :cond_14

    .line 394
    .line 395
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 396
    .line 397
    if-ne v6, v8, :cond_14

    .line 398
    .line 399
    iget v6, v0, La/vu40;->g:I

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_14
    iget v6, v0, La/vu40;->g:I

    .line 403
    .line 404
    iget v7, v0, La/vu40;->f:I

    .line 405
    .line 406
    sub-int/2addr v6, v7

    .line 407
    shr-int/2addr v6, v8

    .line 408
    add-int/2addr v6, v7

    .line 409
    :goto_8
    sub-int/2addr v5, v6

    .line 410
    iput v5, v0, La/vu40;->p:I

    .line 411
    .line 412
    iget v5, v0, La/vu40;->o:I

    .line 413
    .line 414
    invoke-virtual {v0}, La/vu40;->b()La/qb8;

    .line 415
    .line 416
    .line 417
    move-result-object v6

    .line 418
    if-eqz v6, :cond_15

    .line 419
    .line 420
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 421
    .line 422
    if-ne v6, v8, :cond_15

    .line 423
    .line 424
    iget v6, v0, La/vu40;->f:I

    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_15
    iget v6, v0, La/vu40;->g:I

    .line 428
    .line 429
    shr-int/2addr v6, v8

    .line 430
    :goto_9
    sub-int/2addr v5, v6

    .line 431
    iput v5, v0, La/vu40;->o:I

    .line 432
    .line 433
    invoke-virtual/range {p0 .. p4}, La/vu40;->e(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_16
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 438
    .line 439
    if-eqz v6, :cond_17

    .line 440
    .line 441
    invoke-virtual {v2, v1, v13, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 442
    .line 443
    .line 444
    iget v1, v0, La/vu40;->o:I

    .line 445
    .line 446
    iget v4, v0, La/vu40;->p:I

    .line 447
    .line 448
    iget v5, v0, La/vu40;->f:I

    .line 449
    .line 450
    add-int/2addr v5, v1

    .line 451
    iget v6, v0, La/vu40;->g:I

    .line 452
    .line 453
    add-int/2addr v6, v4

    .line 454
    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 455
    .line 456
    .line 457
    iget v1, v0, La/vu40;->o:I

    .line 458
    .line 459
    iget v3, v0, La/vu40;->f:I

    .line 460
    .line 461
    add-int/2addr v1, v3

    .line 462
    iput v1, v0, La/vu40;->o:I

    .line 463
    .line 464
    iput-byte v14, v2, La/qb8;->o:B

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :cond_17
    if-eqz v5, :cond_18

    .line 468
    .line 469
    const/16 v10, 0x10e

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_18
    move v10, v11

    .line 473
    :goto_a
    int-to-float v5, v10

    .line 474
    invoke-virtual {v2, v1, v5, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 475
    .line 476
    .line 477
    iget v1, v0, La/vu40;->o:I

    .line 478
    .line 479
    iget v4, v0, La/vu40;->p:I

    .line 480
    .line 481
    iget v5, v0, La/vu40;->f:I

    .line 482
    .line 483
    add-int/2addr v5, v1

    .line 484
    iget v6, v0, La/vu40;->g:I

    .line 485
    .line 486
    add-int/2addr v6, v4

    .line 487
    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 488
    .line 489
    .line 490
    iget v1, v0, La/vu40;->o:I

    .line 491
    .line 492
    iget v3, v0, La/vu40;->g:I

    .line 493
    .line 494
    add-int/2addr v1, v3

    .line 495
    iput v1, v0, La/vu40;->o:I

    .line 496
    .line 497
    :cond_19
    :goto_b
    iput-object v2, v0, La/vu40;->i:La/qb8;

    .line 498
    .line 499
    return-void
.end method

.method public final f(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V
    .locals 16

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v5, v0, La/vu40;->i:La/qb8;

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    iget-object v5, v0, La/vu40;->h:La/qb8;

    .line 22
    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    iget v5, v0, La/vu40;->g:I

    .line 26
    .line 27
    iput v5, v0, La/vu40;->q:I

    .line 28
    .line 29
    :cond_0
    iget v5, v2, La/qb8;->q:I

    .line 30
    .line 31
    iget v6, v0, La/vu40;->v:I

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x1

    .line 35
    if-ne v5, v6, :cond_1

    .line 36
    .line 37
    move v5, v8

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v5, v7

    .line 40
    :goto_0
    iget-object v6, v0, La/vu40;->c:La/uu40;

    .line 41
    .line 42
    sget-object v9, La/uu40;->a:La/uu40;

    .line 43
    .line 44
    const/4 v12, 0x3

    .line 45
    const/4 v13, 0x0

    .line 46
    if-ne v6, v9, :cond_9

    .line 47
    .line 48
    iput-object v9, v0, La/vu40;->d:La/uu40;

    .line 49
    .line 50
    iget v6, v0, La/vu40;->q:I

    .line 51
    .line 52
    iget v14, v0, La/vu40;->g:I

    .line 53
    .line 54
    add-int/2addr v6, v14

    .line 55
    iget v14, v0, La/vu40;->e:I

    .line 56
    .line 57
    iget v15, v0, La/vu40;->k:I

    .line 58
    .line 59
    sub-int/2addr v14, v15

    .line 60
    if-le v6, v14, :cond_4

    .line 61
    .line 62
    sget-object v5, La/uu40;->c:La/uu40;

    .line 63
    .line 64
    iput-object v5, v0, La/vu40;->c:La/uu40;

    .line 65
    .line 66
    iget v5, v0, La/vu40;->r:I

    .line 67
    .line 68
    invoke-virtual {v0}, La/vu40;->c()La/qb8;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 75
    .line 76
    if-ne v6, v8, :cond_2

    .line 77
    .line 78
    iget v6, v0, La/vu40;->g:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iget v6, v0, La/vu40;->g:I

    .line 82
    .line 83
    iget v7, v0, La/vu40;->f:I

    .line 84
    .line 85
    sub-int/2addr v6, v7

    .line 86
    shr-int/2addr v6, v8

    .line 87
    add-int/2addr v6, v7

    .line 88
    :goto_1
    add-int/2addr v5, v6

    .line 89
    iput v5, v0, La/vu40;->r:I

    .line 90
    .line 91
    iget v5, v0, La/vu40;->q:I

    .line 92
    .line 93
    invoke-virtual {v0}, La/vu40;->c()La/qb8;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 100
    .line 101
    if-ne v6, v8, :cond_3

    .line 102
    .line 103
    iget v6, v0, La/vu40;->f:I

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    iget v6, v0, La/vu40;->g:I

    .line 107
    .line 108
    shr-int/2addr v6, v8

    .line 109
    :goto_2
    sub-int/2addr v5, v6

    .line 110
    iput v5, v0, La/vu40;->q:I

    .line 111
    .line 112
    invoke-virtual/range {p0 .. p4}, La/vu40;->f(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_4
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 117
    .line 118
    if-eqz v6, :cond_6

    .line 119
    .line 120
    invoke-virtual {v2, v1, v13, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 121
    .line 122
    .line 123
    iget v6, v0, La/vu40;->q:I

    .line 124
    .line 125
    iget v14, v0, La/vu40;->r:I

    .line 126
    .line 127
    iget v15, v0, La/vu40;->f:I

    .line 128
    .line 129
    add-int/2addr v15, v6

    .line 130
    iget v10, v0, La/vu40;->g:I

    .line 131
    .line 132
    add-int/2addr v10, v14

    .line 133
    invoke-virtual {v3, v6, v14, v15, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 134
    .line 135
    .line 136
    iget v6, v0, La/vu40;->q:I

    .line 137
    .line 138
    iget v10, v0, La/vu40;->f:I

    .line 139
    .line 140
    add-int/2addr v6, v10

    .line 141
    iget v10, v0, La/vu40;->m:I

    .line 142
    .line 143
    if-le v6, v10, :cond_5

    .line 144
    .line 145
    iput v6, v0, La/vu40;->m:I

    .line 146
    .line 147
    :cond_5
    iput v6, v0, La/vu40;->q:I

    .line 148
    .line 149
    iput-byte v12, v2, La/qb8;->o:B

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_6
    if-eqz v5, :cond_7

    .line 153
    .line 154
    const/16 v6, 0x5a

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    const/16 v6, 0x10e

    .line 158
    .line 159
    :goto_3
    int-to-float v6, v6

    .line 160
    invoke-virtual {v2, v1, v6, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 161
    .line 162
    .line 163
    iget v6, v0, La/vu40;->q:I

    .line 164
    .line 165
    iget v10, v0, La/vu40;->r:I

    .line 166
    .line 167
    iget v14, v0, La/vu40;->f:I

    .line 168
    .line 169
    add-int/2addr v14, v6

    .line 170
    iget v15, v0, La/vu40;->g:I

    .line 171
    .line 172
    add-int/2addr v15, v10

    .line 173
    invoke-virtual {v3, v6, v10, v14, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 174
    .line 175
    .line 176
    iget v6, v0, La/vu40;->q:I

    .line 177
    .line 178
    iget v10, v0, La/vu40;->g:I

    .line 179
    .line 180
    add-int/2addr v6, v10

    .line 181
    iget v10, v0, La/vu40;->m:I

    .line 182
    .line 183
    if-le v6, v10, :cond_8

    .line 184
    .line 185
    iput v6, v0, La/vu40;->m:I

    .line 186
    .line 187
    :cond_8
    iput v6, v0, La/vu40;->q:I

    .line 188
    .line 189
    :cond_9
    :goto_4
    iget-object v6, v0, La/vu40;->c:La/uu40;

    .line 190
    .line 191
    sget-object v10, La/uu40;->c:La/uu40;

    .line 192
    .line 193
    const/4 v14, 0x5

    .line 194
    if-ne v6, v10, :cond_13

    .line 195
    .line 196
    iget v6, v0, La/vu40;->s:I

    .line 197
    .line 198
    add-int/2addr v6, v8

    .line 199
    iput v6, v0, La/vu40;->s:I

    .line 200
    .line 201
    const/4 v15, 0x2

    .line 202
    if-le v6, v15, :cond_c

    .line 203
    .line 204
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 205
    .line 206
    if-nez v6, :cond_c

    .line 207
    .line 208
    iget-object v5, v0, La/vu40;->d:La/uu40;

    .line 209
    .line 210
    if-ne v5, v9, :cond_a

    .line 211
    .line 212
    sget-object v9, La/uu40;->d:La/uu40;

    .line 213
    .line 214
    :cond_a
    iput-object v9, v0, La/vu40;->c:La/uu40;

    .line 215
    .line 216
    iput v7, v0, La/vu40;->s:I

    .line 217
    .line 218
    sget-object v5, La/uu40;->d:La/uu40;

    .line 219
    .line 220
    iget v6, v0, La/vu40;->q:I

    .line 221
    .line 222
    if-ne v9, v5, :cond_b

    .line 223
    .line 224
    iget v5, v0, La/vu40;->f:I

    .line 225
    .line 226
    sub-int/2addr v6, v5

    .line 227
    iput v6, v0, La/vu40;->q:I

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_b
    iget v5, v0, La/vu40;->g:I

    .line 231
    .line 232
    iget v7, v0, La/vu40;->f:I

    .line 233
    .line 234
    sub-int/2addr v5, v7

    .line 235
    add-int/2addr v5, v6

    .line 236
    iput v5, v0, La/vu40;->q:I

    .line 237
    .line 238
    move v5, v7

    .line 239
    :goto_5
    iget v6, v0, La/vu40;->r:I

    .line 240
    .line 241
    iget v7, v0, La/vu40;->g:I

    .line 242
    .line 243
    sub-int/2addr v7, v5

    .line 244
    shr-int/lit8 v5, v7, 0x1

    .line 245
    .line 246
    sub-int/2addr v6, v5

    .line 247
    iput v6, v0, La/vu40;->r:I

    .line 248
    .line 249
    invoke-virtual/range {p0 .. p4}, La/vu40;->f(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_c
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 254
    .line 255
    if-eqz v6, :cond_f

    .line 256
    .line 257
    const/high16 v6, 0x42b40000    # 90.0f

    .line 258
    .line 259
    invoke-virtual {v2, v1, v6, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 260
    .line 261
    .line 262
    iget v6, v0, La/vu40;->q:I

    .line 263
    .line 264
    iget v7, v0, La/vu40;->r:I

    .line 265
    .line 266
    iget v12, v0, La/vu40;->f:I

    .line 267
    .line 268
    add-int/2addr v12, v6

    .line 269
    iget v15, v0, La/vu40;->g:I

    .line 270
    .line 271
    add-int/2addr v15, v7

    .line 272
    invoke-virtual {v3, v6, v7, v12, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 273
    .line 274
    .line 275
    iget-object v6, v0, La/vu40;->d:La/uu40;

    .line 276
    .line 277
    if-ne v6, v9, :cond_d

    .line 278
    .line 279
    const/16 v6, 0x33

    .line 280
    .line 281
    iput-byte v6, v2, La/qb8;->o:B

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_d
    const/16 v6, 0x35

    .line 285
    .line 286
    iput-byte v6, v2, La/qb8;->o:B

    .line 287
    .line 288
    :goto_6
    iget v6, v0, La/vu40;->r:I

    .line 289
    .line 290
    iget v7, v0, La/vu40;->f:I

    .line 291
    .line 292
    add-int/2addr v6, v7

    .line 293
    iget v7, v0, La/vu40;->n:I

    .line 294
    .line 295
    if-le v6, v7, :cond_e

    .line 296
    .line 297
    iput v6, v0, La/vu40;->n:I

    .line 298
    .line 299
    :cond_e
    iput v6, v0, La/vu40;->r:I

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_f
    if-eqz v5, :cond_10

    .line 303
    .line 304
    const/16 v7, 0xb4

    .line 305
    .line 306
    :cond_10
    int-to-float v6, v7

    .line 307
    invoke-virtual {v2, v1, v6, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 308
    .line 309
    .line 310
    iget v6, v0, La/vu40;->q:I

    .line 311
    .line 312
    iget v7, v0, La/vu40;->r:I

    .line 313
    .line 314
    iget v15, v0, La/vu40;->f:I

    .line 315
    .line 316
    add-int/2addr v15, v6

    .line 317
    iget v11, v0, La/vu40;->g:I

    .line 318
    .line 319
    add-int/2addr v11, v7

    .line 320
    invoke-virtual {v3, v6, v7, v15, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 321
    .line 322
    .line 323
    iget v6, v0, La/vu40;->r:I

    .line 324
    .line 325
    iget v7, v0, La/vu40;->g:I

    .line 326
    .line 327
    add-int/2addr v6, v7

    .line 328
    iget v7, v0, La/vu40;->n:I

    .line 329
    .line 330
    if-le v6, v7, :cond_11

    .line 331
    .line 332
    iput v6, v0, La/vu40;->n:I

    .line 333
    .line 334
    :cond_11
    iput v6, v0, La/vu40;->r:I

    .line 335
    .line 336
    iget-object v6, v0, La/vu40;->d:La/uu40;

    .line 337
    .line 338
    if-ne v6, v9, :cond_12

    .line 339
    .line 340
    iput-byte v12, v2, La/qb8;->o:B

    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_12
    iput-byte v14, v2, La/qb8;->o:B

    .line 344
    .line 345
    :cond_13
    :goto_7
    iget-object v6, v0, La/vu40;->c:La/uu40;

    .line 346
    .line 347
    sget-object v7, La/uu40;->d:La/uu40;

    .line 348
    .line 349
    if-ne v6, v7, :cond_19

    .line 350
    .line 351
    iput-object v7, v0, La/vu40;->d:La/uu40;

    .line 352
    .line 353
    iget v6, v0, La/vu40;->q:I

    .line 354
    .line 355
    iget v7, v0, La/vu40;->k:I

    .line 356
    .line 357
    neg-int v7, v7

    .line 358
    if-ge v6, v7, :cond_16

    .line 359
    .line 360
    iput-object v10, v0, La/vu40;->c:La/uu40;

    .line 361
    .line 362
    iget v5, v0, La/vu40;->r:I

    .line 363
    .line 364
    invoke-virtual {v0}, La/vu40;->c()La/qb8;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    if-eqz v6, :cond_14

    .line 369
    .line 370
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 371
    .line 372
    if-ne v6, v8, :cond_14

    .line 373
    .line 374
    iget v6, v0, La/vu40;->g:I

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_14
    iget v6, v0, La/vu40;->g:I

    .line 378
    .line 379
    iget v7, v0, La/vu40;->f:I

    .line 380
    .line 381
    sub-int/2addr v6, v7

    .line 382
    shr-int/2addr v6, v8

    .line 383
    add-int/2addr v6, v7

    .line 384
    :goto_8
    add-int/2addr v5, v6

    .line 385
    iput v5, v0, La/vu40;->r:I

    .line 386
    .line 387
    iget v5, v0, La/vu40;->q:I

    .line 388
    .line 389
    invoke-virtual {v0}, La/vu40;->c()La/qb8;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    if-eqz v6, :cond_15

    .line 394
    .line 395
    iget-boolean v6, v6, La/qb8;->d:Z

    .line 396
    .line 397
    if-ne v6, v8, :cond_15

    .line 398
    .line 399
    iget v6, v0, La/vu40;->f:I

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_15
    iget v6, v0, La/vu40;->g:I

    .line 403
    .line 404
    shr-int/2addr v6, v8

    .line 405
    :goto_9
    add-int/2addr v5, v6

    .line 406
    iput v5, v0, La/vu40;->q:I

    .line 407
    .line 408
    invoke-virtual/range {p0 .. p4}, La/vu40;->f(Landroid/view/View;La/qb8;Landroid/graphics/Rect;Z)V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_16
    iget-boolean v6, v2, La/qb8;->d:Z

    .line 413
    .line 414
    if-eqz v6, :cond_17

    .line 415
    .line 416
    invoke-virtual {v2, v1, v13, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 417
    .line 418
    .line 419
    iget v1, v0, La/vu40;->q:I

    .line 420
    .line 421
    iget v4, v0, La/vu40;->r:I

    .line 422
    .line 423
    iget v5, v0, La/vu40;->f:I

    .line 424
    .line 425
    add-int/2addr v5, v1

    .line 426
    iget v6, v0, La/vu40;->g:I

    .line 427
    .line 428
    add-int/2addr v6, v4

    .line 429
    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 430
    .line 431
    .line 432
    iget v1, v0, La/vu40;->q:I

    .line 433
    .line 434
    iget v3, v0, La/vu40;->f:I

    .line 435
    .line 436
    sub-int/2addr v1, v3

    .line 437
    iput v1, v0, La/vu40;->q:I

    .line 438
    .line 439
    iput-byte v14, v2, La/qb8;->o:B

    .line 440
    .line 441
    goto :goto_b

    .line 442
    :cond_17
    if-eqz v5, :cond_18

    .line 443
    .line 444
    const/16 v10, 0x10e

    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_18
    const/16 v10, 0x5a

    .line 448
    .line 449
    :goto_a
    int-to-float v5, v10

    .line 450
    invoke-virtual {v2, v1, v5, v4}, La/qb8;->f(Landroid/view/View;FZ)V

    .line 451
    .line 452
    .line 453
    iget v1, v0, La/vu40;->q:I

    .line 454
    .line 455
    iget v4, v0, La/vu40;->r:I

    .line 456
    .line 457
    iget v5, v0, La/vu40;->f:I

    .line 458
    .line 459
    add-int/2addr v5, v1

    .line 460
    iget v6, v0, La/vu40;->g:I

    .line 461
    .line 462
    add-int/2addr v6, v4

    .line 463
    invoke-virtual {v3, v1, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 464
    .line 465
    .line 466
    iget v1, v0, La/vu40;->q:I

    .line 467
    .line 468
    iget v3, v0, La/vu40;->g:I

    .line 469
    .line 470
    sub-int/2addr v1, v3

    .line 471
    iput v1, v0, La/vu40;->q:I

    .line 472
    .line 473
    :cond_19
    :goto_b
    iput-object v2, v0, La/vu40;->h:La/qb8;

    .line 474
    .line 475
    return-void
.end method
