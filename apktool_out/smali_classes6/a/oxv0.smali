.class public final La/oxv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/duv0;

.field public final b:La/h0q0;

.field public final c:La/fht0;

.field public final d:La/glt0;

.field public final e:La/ruv0;

.field public final f:La/mkt0;

.field public final g:La/vkr0;

.field public h:F

.field public i:F

.field public final j:La/hcp0;


# direct methods
.method public constructor <init>(La/duv0;La/h0q0;La/fht0;La/glt0;La/ruv0;La/mkt0;La/vkr0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/oxv0;->a:La/duv0;

    .line 5
    .line 6
    iput-object p2, p0, La/oxv0;->b:La/h0q0;

    .line 7
    .line 8
    iput-object p3, p0, La/oxv0;->c:La/fht0;

    .line 9
    .line 10
    iput-object p4, p0, La/oxv0;->d:La/glt0;

    .line 11
    .line 12
    iput-object p5, p0, La/oxv0;->e:La/ruv0;

    .line 13
    .line 14
    iput-object p6, p0, La/oxv0;->f:La/mkt0;

    .line 15
    .line 16
    iput-object p7, p0, La/oxv0;->g:La/vkr0;

    .line 17
    .line 18
    new-instance p1, La/hcp0;

    .line 19
    .line 20
    new-instance p2, La/jmv0;

    .line 21
    .line 22
    const/16 p3, 0xb

    .line 23
    .line 24
    invoke-direct {p2, p0, p3}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2}, La/hcp0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/oxv0;->j:La/hcp0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/oxv0;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/pxv0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/pxv0;-><init>(F)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/oxv0;->j:La/hcp0;

    .line 10
    .line 11
    iget-object p0, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/q99;

    .line 14
    .line 15
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, La/oxv0;->f:La/mkt0;

    .line 2
    .line 3
    iget-object v0, v0, La/mkt0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/pz40;

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/hgk0;

    .line 9
    .line 10
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    check-cast v0, La/hgk0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/oxv0;->d:La/glt0;

    .line 31
    .line 32
    iget-object v0, v0, La/glt0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/t33;

    .line 35
    .line 36
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, La/oxv0;->i:F

    .line 47
    .line 48
    iget-object p0, p0, La/oxv0;->e:La/ruv0;

    .line 49
    .line 50
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget v1, p0, La/ruv0;->n:F

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-static {v0, v3, v4, v1, v2}, La/yuv0;->a(La/yuv0;La/lxv0;FFI)La/yuv0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, La/ruv0;->g:La/pz40;

    .line 67
    .line 68
    check-cast v1, La/hgk0;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    const/4 v0, 0x0

    .line 74
    iput-boolean v0, p0, La/ruv0;->m:Z

    .line 75
    .line 76
    return-void
.end method

.method public final c(FLa/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/oxv0;->d:La/glt0;

    .line 8
    .line 9
    iget-object v4, v3, La/glt0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, La/t33;

    .line 12
    .line 13
    instance-of v5, v2, La/nxv0;

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, La/nxv0;

    .line 19
    .line 20
    iget v6, v5, La/nxv0;->l:I

    .line 21
    .line 22
    const/high16 v7, -0x80000000

    .line 23
    .line 24
    and-int v8, v6, v7

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    sub-int/2addr v6, v7

    .line 29
    iput v6, v5, La/nxv0;->l:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v5, La/nxv0;

    .line 33
    .line 34
    invoke-direct {v5, v0, v2}, La/nxv0;-><init>(La/oxv0;La/zje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v2, v5, La/nxv0;->j:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v6, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v7, v5, La/nxv0;->l:I

    .line 42
    .line 43
    const/4 v8, 0x4

    .line 44
    const/4 v9, 0x3

    .line 45
    const/4 v10, 0x2

    .line 46
    const/4 v12, 0x1

    .line 47
    iget-object v13, v0, La/oxv0;->e:La/ruv0;

    .line 48
    .line 49
    const/4 v14, 0x0

    .line 50
    if-eqz v7, :cond_7

    .line 51
    .line 52
    if-eq v7, v12, :cond_6

    .line 53
    .line 54
    if-eq v7, v10, :cond_5

    .line 55
    .line 56
    if-eq v7, v9, :cond_3

    .line 57
    .line 58
    if-ne v7, v8, :cond_2

    .line 59
    .line 60
    :try_start_0
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :cond_1
    const/4 v1, 0x0

    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :catchall_0
    move-exception v0

    .line 67
    const/4 v1, 0x0

    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v14

    .line 76
    :cond_3
    :try_start_1
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    :cond_4
    const/4 v1, 0x0

    .line 80
    goto/16 :goto_a

    .line 81
    .line 82
    :catchall_1
    move-exception v0

    .line 83
    const/4 v1, 0x0

    .line 84
    goto/16 :goto_b

    .line 85
    .line 86
    :cond_5
    iget-object v0, v5, La/nxv0;->i:La/lxv0;

    .line 87
    .line 88
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_10

    .line 92
    .line 93
    :cond_6
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_e

    .line 97
    .line 98
    :cond_7
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, La/oxv0;->f:La/mkt0;

    .line 102
    .line 103
    iget-object v2, v2, La/mkt0;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, La/pz40;

    .line 106
    .line 107
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 108
    .line 109
    check-cast v2, La/hgk0;

    .line 110
    .line 111
    invoke-virtual {v2, v7}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    iput v2, v0, La/oxv0;->h:F

    .line 116
    .line 117
    iget-object v7, v0, La/oxv0;->c:La/fht0;

    .line 118
    .line 119
    iget-object v15, v7, La/fht0;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v15, La/hu5;

    .line 122
    .line 123
    if-nez v15, :cond_8

    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_8
    move/from16 p2, v2

    .line 129
    .line 130
    invoke-virtual {v7}, La/fht0;->f()La/cvv0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-nez v2, :cond_9

    .line 135
    .line 136
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_9
    move-object/from16 v16, v14

    .line 140
    .line 141
    iget-object v14, v0, La/oxv0;->b:La/h0q0;

    .line 142
    .line 143
    invoke-virtual {v14}, La/h0q0;->p()La/bxv0;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    iget-object v11, v11, La/bxv0;->f:La/stv0;

    .line 148
    .line 149
    sget-object v8, La/stv0;->a:La/stv0;

    .line 150
    .line 151
    if-ne v11, v8, :cond_a

    .line 152
    .line 153
    move v11, v12

    .line 154
    goto :goto_1

    .line 155
    :cond_a
    const/4 v11, 0x0

    .line 156
    :goto_1
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v17

    .line 160
    check-cast v17, Ljava/lang/Number;

    .line 161
    .line 162
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->floatValue()F

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    invoke-virtual {v14}, La/h0q0;->m()La/msv0;

    .line 167
    .line 168
    .line 169
    move-result-object v17

    .line 170
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v15, v9, v1, v11}, La/hu5;->Z(FFZ)La/lxv0;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    invoke-virtual {v13}, La/ruv0;->g()Z

    .line 178
    .line 179
    .line 180
    move-result v17

    .line 181
    const/high16 v18, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v19, 0x3f000000    # 0.5f

    .line 184
    .line 185
    if-nez v17, :cond_b

    .line 186
    .line 187
    :goto_2
    move-object/from16 v7, v16

    .line 188
    .line 189
    goto/16 :goto_6

    .line 190
    .line 191
    :cond_b
    invoke-virtual {v14}, La/h0q0;->p()La/bxv0;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    iget-object v10, v10, La/bxv0;->f:La/stv0;

    .line 196
    .line 197
    if-ne v10, v8, :cond_15

    .line 198
    .line 199
    invoke-virtual {v7}, La/fht0;->f()La/cvv0;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    if-nez v7, :cond_c

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_c
    iget v8, v0, La/oxv0;->i:F

    .line 207
    .line 208
    invoke-static {v7}, La/ktt0;->r(La/cvv0;)I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    int-to-float v7, v7

    .line 213
    sub-float/2addr v8, v7

    .line 214
    cmpg-float v7, v8, p2

    .line 215
    .line 216
    if-gez v7, :cond_d

    .line 217
    .line 218
    move/from16 v8, p2

    .line 219
    .line 220
    :cond_d
    iget v7, v0, La/oxv0;->i:F

    .line 221
    .line 222
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    check-cast v10, Ljava/lang/Number;

    .line 227
    .line 228
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    sub-float/2addr v7, v10

    .line 233
    cmpg-float v10, v7, p2

    .line 234
    .line 235
    if-gez v10, :cond_e

    .line 236
    .line 237
    move/from16 v7, p2

    .line 238
    .line 239
    :cond_e
    cmpl-float v10, v8, p2

    .line 240
    .line 241
    if-lez v10, :cond_f

    .line 242
    .line 243
    mul-float v8, v8, v19

    .line 244
    .line 245
    cmpl-float v7, v7, v8

    .line 246
    .line 247
    if-ltz v7, :cond_f

    .line 248
    .line 249
    move v7, v12

    .line 250
    goto :goto_3

    .line 251
    :cond_f
    const/4 v7, 0x0

    .line 252
    :goto_3
    invoke-virtual {v14}, La/h0q0;->m()La/msv0;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    const/high16 v8, 0x43c80000    # 400.0f

    .line 260
    .line 261
    cmpl-float v8, v1, v8

    .line 262
    .line 263
    if-ltz v8, :cond_10

    .line 264
    .line 265
    move v8, v12

    .line 266
    goto :goto_4

    .line 267
    :cond_10
    const/4 v8, 0x0

    .line 268
    :goto_4
    invoke-virtual {v13}, La/ruv0;->e()F

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    iget v14, v0, La/oxv0;->i:F

    .line 273
    .line 274
    cmpl-float v14, v14, v10

    .line 275
    .line 276
    if-lez v14, :cond_11

    .line 277
    .line 278
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v14

    .line 282
    check-cast v14, Ljava/lang/Number;

    .line 283
    .line 284
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    add-float v10, v10, v18

    .line 289
    .line 290
    cmpg-float v10, v14, v10

    .line 291
    .line 292
    if-gtz v10, :cond_11

    .line 293
    .line 294
    move v10, v12

    .line 295
    goto :goto_5

    .line 296
    :cond_11
    const/4 v10, 0x0

    .line 297
    :goto_5
    if-eqz v8, :cond_12

    .line 298
    .line 299
    sget-object v7, La/zuv0;->a:La/zuv0;

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_12
    if-eqz v10, :cond_13

    .line 303
    .line 304
    sget-object v7, La/zuv0;->a:La/zuv0;

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_13
    if-eqz v7, :cond_14

    .line 308
    .line 309
    sget-object v7, La/zuv0;->b:La/zuv0;

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_14
    sget-object v7, La/zuv0;->c:La/zuv0;

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_15
    sget-object v7, La/zuv0;->c:La/zuv0;

    .line 316
    .line 317
    :goto_6
    const/4 v8, -0x1

    .line 318
    if-nez v7, :cond_16

    .line 319
    .line 320
    move v7, v8

    .line 321
    goto :goto_7

    .line 322
    :cond_16
    sget-object v10, La/mxv0;->a:[I

    .line 323
    .line 324
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    aget v7, v10, v7

    .line 329
    .line 330
    :goto_7
    iget-object v10, v0, La/oxv0;->g:La/vkr0;

    .line 331
    .line 332
    if-eq v7, v8, :cond_1b

    .line 333
    .line 334
    if-eq v7, v12, :cond_1a

    .line 335
    .line 336
    const/4 v0, 0x2

    .line 337
    if-eq v7, v0, :cond_18

    .line 338
    .line 339
    const/4 v0, 0x3

    .line 340
    if-ne v7, v0, :cond_17

    .line 341
    .line 342
    iput-boolean v12, v13, La/ruv0;->i:Z

    .line 343
    .line 344
    :try_start_2
    invoke-virtual {v13, v2}, La/ruv0;->h(La/cvv0;)F

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    const/4 v1, 0x4

    .line 349
    iput v1, v5, La/nxv0;->l:I

    .line 350
    .line 351
    sget-object v1, La/vwv0;->a:La/nul0;

    .line 352
    .line 353
    invoke-virtual {v3, v0, v1, v5}, La/glt0;->a(FLa/j73;La/zje;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 357
    if-ne v0, v6, :cond_1

    .line 358
    .line 359
    goto/16 :goto_f

    .line 360
    .line 361
    :goto_8
    iput-boolean v1, v13, La/ruv0;->i:Z

    .line 362
    .line 363
    goto/16 :goto_11

    .line 364
    .line 365
    :goto_9
    iput-boolean v1, v13, La/ruv0;->i:Z

    .line 366
    .line 367
    throw v0

    .line 368
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 369
    .line 370
    .line 371
    return-object v16

    .line 372
    :cond_18
    sget-object v0, La/kxv0;->a:La/kxv0;

    .line 373
    .line 374
    invoke-virtual {v13, v0}, La/ruv0;->n(La/lxv0;)V

    .line 375
    .line 376
    .line 377
    iput-boolean v12, v13, La/ruv0;->j:Z

    .line 378
    .line 379
    iput-boolean v12, v13, La/ruv0;->k:Z

    .line 380
    .line 381
    iput-boolean v12, v13, La/ruv0;->l:Z

    .line 382
    .line 383
    invoke-virtual {v13}, La/ruv0;->b()V

    .line 384
    .line 385
    .line 386
    iget-object v1, v13, La/ruv0;->h:La/jmv0;

    .line 387
    .line 388
    if-eqz v1, :cond_19

    .line 389
    .line 390
    invoke-virtual {v1}, La/jmv0;->invoke()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    :cond_19
    const/4 v1, 0x3

    .line 394
    :try_start_3
    iput v1, v5, La/nxv0;->l:I

    .line 395
    .line 396
    invoke-virtual {v3, v0, v5}, La/glt0;->b(La/lxv0;La/zje;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 400
    if-ne v0, v6, :cond_4

    .line 401
    .line 402
    goto/16 :goto_f

    .line 403
    .line 404
    :goto_a
    iput-boolean v1, v13, La/ruv0;->k:Z

    .line 405
    .line 406
    goto/16 :goto_11

    .line 407
    .line 408
    :goto_b
    iput-boolean v1, v13, La/ruv0;->k:Z

    .line 409
    .line 410
    throw v0

    .line 411
    :cond_1a
    invoke-virtual {v13}, La/ruv0;->c()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v10}, La/vkr0;->x()V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_11

    .line 418
    .line 419
    :cond_1b
    iget v7, v15, La/hu5;->c:I

    .line 420
    .line 421
    int-to-float v7, v7

    .line 422
    sget-object v8, La/jxv0;->a:La/jxv0;

    .line 423
    .line 424
    if-eqz v11, :cond_1d

    .line 425
    .line 426
    iget v11, v15, La/hu5;->d:I

    .line 427
    .line 428
    if-ne v11, v12, :cond_1d

    .line 429
    .line 430
    invoke-static {v2}, La/ktt0;->k(La/cvv0;)I

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    int-to-float v11, v11

    .line 435
    sub-float v11, v11, v19

    .line 436
    .line 437
    cmpl-float v11, v7, v11

    .line 438
    .line 439
    if-ltz v11, :cond_1d

    .line 440
    .line 441
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v11

    .line 445
    check-cast v11, Ljava/lang/Number;

    .line 446
    .line 447
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    sub-float v7, v7, v19

    .line 452
    .line 453
    cmpg-float v7, v11, v7

    .line 454
    .line 455
    if-gez v7, :cond_1d

    .line 456
    .line 457
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    check-cast v4, Ljava/lang/Number;

    .line 462
    .line 463
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    iget v0, v0, La/oxv0;->i:F

    .line 468
    .line 469
    cmpg-float v0, v4, v0

    .line 470
    .line 471
    if-ltz v0, :cond_1c

    .line 472
    .line 473
    cmpl-float v0, v1, p2

    .line 474
    .line 475
    if-lez v0, :cond_1d

    .line 476
    .line 477
    :cond_1c
    move-object v9, v8

    .line 478
    :cond_1d
    invoke-virtual {v13}, La/ruv0;->f()La/yuv0;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    if-eqz v0, :cond_1e

    .line 483
    .line 484
    iget-object v0, v0, La/yuv0;->a:La/lxv0;

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_1e
    move-object/from16 v0, v16

    .line 488
    .line 489
    :goto_c
    invoke-virtual {v13}, La/ruv0;->g()Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_1f

    .line 494
    .line 495
    if-eqz v9, :cond_1f

    .line 496
    .line 497
    if-eqz v0, :cond_1f

    .line 498
    .line 499
    invoke-static {v2, v9}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    int-to-float v1, v1

    .line 504
    invoke-static {v2, v0}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    int-to-float v2, v2

    .line 509
    add-float v2, v2, v18

    .line 510
    .line 511
    cmpl-float v1, v1, v2

    .line 512
    .line 513
    if-lez v1, :cond_1f

    .line 514
    .line 515
    goto :goto_d

    .line 516
    :cond_1f
    move-object v0, v9

    .line 517
    :goto_d
    if-nez v0, :cond_21

    .line 518
    .line 519
    invoke-virtual {v3}, La/glt0;->d()La/lxv0;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    move-object/from16 v1, v16

    .line 524
    .line 525
    iput-object v1, v5, La/nxv0;->i:La/lxv0;

    .line 526
    .line 527
    iput v12, v5, La/nxv0;->l:I

    .line 528
    .line 529
    invoke-virtual {v3, v0, v5}, La/glt0;->b(La/lxv0;La/zje;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    if-ne v0, v6, :cond_20

    .line 534
    .line 535
    goto :goto_f

    .line 536
    :cond_20
    :goto_e
    invoke-virtual {v3}, La/glt0;->d()La/lxv0;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v13, v0}, La/ruv0;->n(La/lxv0;)V

    .line 541
    .line 542
    .line 543
    goto :goto_11

    .line 544
    :cond_21
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    if-eqz v1, :cond_22

    .line 549
    .line 550
    invoke-virtual {v13}, La/ruv0;->c()V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v10}, La/vkr0;->x()V

    .line 554
    .line 555
    .line 556
    goto :goto_11

    .line 557
    :cond_22
    iput-object v0, v5, La/nxv0;->i:La/lxv0;

    .line 558
    .line 559
    const/4 v1, 0x2

    .line 560
    iput v1, v5, La/nxv0;->l:I

    .line 561
    .line 562
    invoke-virtual {v3, v0, v5}, La/glt0;->b(La/lxv0;La/zje;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    if-ne v1, v6, :cond_23

    .line 567
    .line 568
    :goto_f
    return-object v6

    .line 569
    :cond_23
    :goto_10
    invoke-virtual {v13, v0}, La/ruv0;->n(La/lxv0;)V

    .line 570
    .line 571
    .line 572
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 573
    .line 574
    return-object v0
.end method
