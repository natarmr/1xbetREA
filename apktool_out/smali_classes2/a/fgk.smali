.class public final La/fgk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:[I


# instance fields
.field public final a:La/r68;

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x83b

    .line 2
    .line 3
    const/16 v1, 0x707

    .line 4
    .line 5
    const/16 v2, 0xee0

    .line 6
    .line 7
    const/16 v3, 0x1dc

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/fgk;->g:[I

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/r68;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fgk;->a:La/r68;

    .line 5
    .line 6
    return-void
.end method

.method public static b([La/d3g0;II)[La/d3g0;
    .locals 7

    .line 1
    int-to-float p2, p2

    .line 2
    int-to-float p1, p1

    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr p1, v0

    .line 6
    div-float/2addr p2, p1

    .line 7
    const/4 p1, 0x0

    .line 8
    aget-object p1, p0, p1

    .line 9
    .line 10
    iget v1, p1, La/d3g0;->a:F

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    aget-object v2, p0, v2

    .line 14
    .line 15
    iget v3, v2, La/d3g0;->a:F

    .line 16
    .line 17
    sub-float v4, v1, v3

    .line 18
    .line 19
    iget p1, p1, La/d3g0;->b:F

    .line 20
    .line 21
    iget v2, v2, La/d3g0;->b:F

    .line 22
    .line 23
    sub-float v5, p1, v2

    .line 24
    .line 25
    add-float/2addr v1, v3

    .line 26
    div-float/2addr v1, v0

    .line 27
    add-float/2addr p1, v2

    .line 28
    div-float/2addr p1, v0

    .line 29
    new-instance v2, La/d3g0;

    .line 30
    .line 31
    mul-float/2addr v4, p2

    .line 32
    add-float v3, v1, v4

    .line 33
    .line 34
    mul-float/2addr v5, p2

    .line 35
    add-float v6, p1, v5

    .line 36
    .line 37
    invoke-direct {v2, v3, v6}, La/d3g0;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    new-instance v3, La/d3g0;

    .line 41
    .line 42
    sub-float/2addr v1, v4

    .line 43
    sub-float/2addr p1, v5

    .line 44
    invoke-direct {v3, v1, p1}, La/d3g0;-><init>(FF)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    aget-object p1, p0, p1

    .line 49
    .line 50
    iget v1, p1, La/d3g0;->a:F

    .line 51
    .line 52
    const/4 v4, 0x3

    .line 53
    aget-object p0, p0, v4

    .line 54
    .line 55
    iget v4, p0, La/d3g0;->a:F

    .line 56
    .line 57
    sub-float v5, v1, v4

    .line 58
    .line 59
    iget p1, p1, La/d3g0;->b:F

    .line 60
    .line 61
    iget p0, p0, La/d3g0;->b:F

    .line 62
    .line 63
    sub-float v6, p1, p0

    .line 64
    .line 65
    add-float/2addr v1, v4

    .line 66
    div-float/2addr v1, v0

    .line 67
    add-float/2addr p1, p0

    .line 68
    div-float/2addr p1, v0

    .line 69
    new-instance p0, La/d3g0;

    .line 70
    .line 71
    mul-float/2addr v5, p2

    .line 72
    add-float v0, v1, v5

    .line 73
    .line 74
    mul-float/2addr p2, v6

    .line 75
    add-float v4, p1, p2

    .line 76
    .line 77
    invoke-direct {p0, v0, v4}, La/d3g0;-><init>(FF)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La/d3g0;

    .line 81
    .line 82
    sub-float/2addr v1, v5

    .line 83
    sub-float/2addr p1, p2

    .line 84
    invoke-direct {v0, v1, p1}, La/d3g0;-><init>(FF)V

    .line 85
    .line 86
    .line 87
    filled-new-array {v2, p0, v3, v0}, [La/d3g0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method


# virtual methods
.method public final a(Z)La/db5;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/fgk;->a:La/r68;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x7

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    new-instance v8, La/mv40;

    .line 12
    .line 13
    invoke-direct {v8, v1}, La/mv40;-><init>(La/r68;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v8}, La/mv40;->b()[La/d3g0;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    aget-object v9, v8, v7

    .line 21
    .line 22
    aget-object v10, v8, v6

    .line 23
    .line 24
    aget-object v11, v8, v3

    .line 25
    .line 26
    aget-object v8, v8, v2
    :try_end_0
    .catch La/o660; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    iget v8, v1, La/r68;->a:I

    .line 30
    .line 31
    div-int/2addr v8, v3

    .line 32
    iget v9, v1, La/r68;->b:I

    .line 33
    .line 34
    div-int/2addr v9, v3

    .line 35
    new-instance v10, La/eld0;

    .line 36
    .line 37
    add-int/lit8 v11, v8, 0x7

    .line 38
    .line 39
    add-int/lit8 v12, v9, -0x7

    .line 40
    .line 41
    invoke-direct {v10, v11, v12, v2}, La/eld0;-><init>(IIB)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v10, v7, v6, v4}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v10}, La/eld0;->c()La/d3g0;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    new-instance v13, La/eld0;

    .line 53
    .line 54
    add-int/2addr v9, v5

    .line 55
    invoke-direct {v13, v11, v9, v2}, La/eld0;-><init>(IIB)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v13, v7, v6, v6}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    invoke-virtual {v11}, La/eld0;->c()La/d3g0;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    new-instance v13, La/eld0;

    .line 67
    .line 68
    sub-int/2addr v8, v5

    .line 69
    invoke-direct {v13, v8, v9, v2}, La/eld0;-><init>(IIB)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v13, v7, v4, v6}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v9}, La/eld0;->c()La/d3g0;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    new-instance v13, La/eld0;

    .line 81
    .line 82
    invoke-direct {v13, v8, v12, v2}, La/eld0;-><init>(IIB)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v13, v7, v4, v4}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8}, La/eld0;->c()La/d3g0;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    move-object/from16 v46, v11

    .line 94
    .line 95
    move-object v11, v9

    .line 96
    move-object v9, v10

    .line 97
    move-object/from16 v10, v46

    .line 98
    .line 99
    :goto_0
    iget v12, v9, La/d3g0;->a:F

    .line 100
    .line 101
    iget v13, v8, La/d3g0;->a:F

    .line 102
    .line 103
    add-float/2addr v12, v13

    .line 104
    iget v13, v10, La/d3g0;->a:F

    .line 105
    .line 106
    add-float/2addr v12, v13

    .line 107
    iget v13, v11, La/d3g0;->a:F

    .line 108
    .line 109
    add-float/2addr v12, v13

    .line 110
    const/high16 v13, 0x40800000    # 4.0f

    .line 111
    .line 112
    div-float/2addr v12, v13

    .line 113
    invoke-static {v12}, La/q7x;->E(F)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    iget v9, v9, La/d3g0;->b:F

    .line 118
    .line 119
    iget v8, v8, La/d3g0;->b:F

    .line 120
    .line 121
    add-float/2addr v9, v8

    .line 122
    iget v8, v10, La/d3g0;->b:F

    .line 123
    .line 124
    add-float/2addr v9, v8

    .line 125
    iget v8, v11, La/d3g0;->b:F

    .line 126
    .line 127
    add-float/2addr v9, v8

    .line 128
    div-float/2addr v9, v13

    .line 129
    invoke-static {v9}, La/q7x;->E(F)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    const/16 v9, 0xf

    .line 134
    .line 135
    :try_start_1
    new-instance v10, La/mv40;

    .line 136
    .line 137
    invoke-direct {v10, v1, v9, v12, v8}, La/mv40;-><init>(La/r68;III)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10}, La/mv40;->b()[La/d3g0;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    aget-object v11, v10, v7

    .line 145
    .line 146
    aget-object v14, v10, v6

    .line 147
    .line 148
    aget-object v15, v10, v3

    .line 149
    .line 150
    aget-object v8, v10, v2
    :try_end_1
    .catch La/o660; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :catch_1
    new-instance v10, La/eld0;

    .line 154
    .line 155
    add-int/lit8 v11, v12, 0x7

    .line 156
    .line 157
    add-int/lit8 v14, v8, -0x7

    .line 158
    .line 159
    invoke-direct {v10, v11, v14, v2}, La/eld0;-><init>(IIB)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v10, v7, v6, v4}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-virtual {v10}, La/eld0;->c()La/d3g0;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    new-instance v15, La/eld0;

    .line 171
    .line 172
    add-int/2addr v8, v5

    .line 173
    invoke-direct {v15, v11, v8, v2}, La/eld0;-><init>(IIB)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v15, v7, v6, v6}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-virtual {v11}, La/eld0;->c()La/d3g0;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    new-instance v15, La/eld0;

    .line 185
    .line 186
    sub-int/2addr v12, v5

    .line 187
    invoke-direct {v15, v12, v8, v2}, La/eld0;-><init>(IIB)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v15, v7, v4, v6}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-virtual {v8}, La/eld0;->c()La/d3g0;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    new-instance v8, La/eld0;

    .line 199
    .line 200
    invoke-direct {v8, v12, v14, v2}, La/eld0;-><init>(IIB)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v8, v7, v4, v4}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-virtual {v8}, La/eld0;->c()La/d3g0;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    move-object v14, v11

    .line 212
    move-object v11, v10

    .line 213
    :goto_1
    iget v10, v11, La/d3g0;->a:F

    .line 214
    .line 215
    iget v12, v8, La/d3g0;->a:F

    .line 216
    .line 217
    add-float/2addr v10, v12

    .line 218
    iget v12, v14, La/d3g0;->a:F

    .line 219
    .line 220
    add-float/2addr v10, v12

    .line 221
    iget v12, v15, La/d3g0;->a:F

    .line 222
    .line 223
    add-float/2addr v10, v12

    .line 224
    div-float/2addr v10, v13

    .line 225
    invoke-static {v10}, La/q7x;->E(F)I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    iget v11, v11, La/d3g0;->b:F

    .line 230
    .line 231
    iget v8, v8, La/d3g0;->b:F

    .line 232
    .line 233
    add-float/2addr v11, v8

    .line 234
    iget v8, v14, La/d3g0;->b:F

    .line 235
    .line 236
    add-float/2addr v11, v8

    .line 237
    iget v8, v15, La/d3g0;->b:F

    .line 238
    .line 239
    add-float/2addr v11, v8

    .line 240
    div-float/2addr v11, v13

    .line 241
    invoke-static {v11}, La/q7x;->E(F)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    new-instance v11, La/eld0;

    .line 246
    .line 247
    invoke-direct {v11, v10, v8, v2}, La/eld0;-><init>(IIB)V

    .line 248
    .line 249
    .line 250
    iput v6, v0, La/fgk;->e:I

    .line 251
    .line 252
    move v13, v6

    .line 253
    move-object v8, v11

    .line 254
    move-object v10, v8

    .line 255
    move-object v12, v10

    .line 256
    :goto_2
    iget v14, v12, La/eld0;->c:I

    .line 257
    .line 258
    iget v15, v12, La/eld0;->b:I

    .line 259
    .line 260
    move/from16 v16, v9

    .line 261
    .line 262
    iget v9, v11, La/eld0;->c:I

    .line 263
    .line 264
    iget v5, v11, La/eld0;->b:I

    .line 265
    .line 266
    iget v2, v0, La/fgk;->e:I

    .line 267
    .line 268
    const/16 v7, 0x9

    .line 269
    .line 270
    if-ge v2, v7, :cond_4

    .line 271
    .line 272
    invoke-virtual {v0, v11, v13, v6, v4}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    iget v2, v11, La/eld0;->c:I

    .line 277
    .line 278
    iget v7, v11, La/eld0;->b:I

    .line 279
    .line 280
    invoke-virtual {v0, v8, v13, v6, v6}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    move-object/from16 v21, v11

    .line 285
    .line 286
    invoke-virtual {v0, v10, v13, v4, v6}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-virtual {v0, v12, v13, v4, v4}, La/fgk;->e(La/eld0;ZII)La/eld0;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    iget v4, v12, La/eld0;->c:I

    .line 295
    .line 296
    move/from16 v22, v6

    .line 297
    .line 298
    iget v6, v12, La/eld0;->b:I

    .line 299
    .line 300
    move-object/from16 v23, v12

    .line 301
    .line 302
    iget v12, v0, La/fgk;->e:I

    .line 303
    .line 304
    move/from16 v24, v13

    .line 305
    .line 306
    const/4 v13, 0x2

    .line 307
    if-le v12, v13, :cond_3

    .line 308
    .line 309
    invoke-static {v6, v4, v7, v2}, La/q7x;->w(IIII)F

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    move/from16 v20, v13

    .line 314
    .line 315
    iget v13, v0, La/fgk;->e:I

    .line 316
    .line 317
    int-to-float v13, v13

    .line 318
    mul-float/2addr v12, v13

    .line 319
    invoke-static {v15, v14, v5, v9}, La/q7x;->w(IIII)F

    .line 320
    .line 321
    .line 322
    move-result v13

    .line 323
    move/from16 v25, v2

    .line 324
    .line 325
    iget v2, v0, La/fgk;->e:I

    .line 326
    .line 327
    add-int/lit8 v2, v2, 0x2

    .line 328
    .line 329
    int-to-float v2, v2

    .line 330
    mul-float/2addr v13, v2

    .line 331
    div-float/2addr v12, v13

    .line 332
    float-to-double v12, v12

    .line 333
    const-wide/high16 v26, 0x3fe8000000000000L    # 0.75

    .line 334
    .line 335
    cmpg-double v2, v12, v26

    .line 336
    .line 337
    if-ltz v2, :cond_5

    .line 338
    .line 339
    const-wide/high16 v26, 0x3ff4000000000000L    # 1.25

    .line 340
    .line 341
    cmpl-double v2, v12, v26

    .line 342
    .line 343
    if-gtz v2, :cond_5

    .line 344
    .line 345
    new-instance v2, La/eld0;

    .line 346
    .line 347
    add-int/lit8 v7, v7, -0x3

    .line 348
    .line 349
    const/4 v12, 0x0

    .line 350
    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    iget v13, v1, La/r68;->b:I

    .line 355
    .line 356
    add-int/lit8 v13, v13, -0x1

    .line 357
    .line 358
    add-int/lit8 v12, v25, 0x3

    .line 359
    .line 360
    invoke-static {v13, v12}, Ljava/lang/Math;->min(II)I

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    const/4 v13, 0x3

    .line 365
    invoke-direct {v2, v7, v12, v13}, La/eld0;-><init>(IIB)V

    .line 366
    .line 367
    .line 368
    new-instance v7, La/eld0;

    .line 369
    .line 370
    iget v12, v3, La/eld0;->b:I

    .line 371
    .line 372
    sub-int/2addr v12, v13

    .line 373
    move/from16 v18, v13

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    .line 377
    .line 378
    .line 379
    move-result v12

    .line 380
    move/from16 v25, v4

    .line 381
    .line 382
    iget v4, v3, La/eld0;->c:I

    .line 383
    .line 384
    add-int/lit8 v4, v4, -0x3

    .line 385
    .line 386
    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    move/from16 v13, v18

    .line 391
    .line 392
    invoke-direct {v7, v12, v4, v13}, La/eld0;-><init>(IIB)V

    .line 393
    .line 394
    .line 395
    new-instance v4, La/eld0;

    .line 396
    .line 397
    iget v12, v1, La/r68;->a:I

    .line 398
    .line 399
    add-int/lit8 v12, v12, -0x1

    .line 400
    .line 401
    iget v13, v11, La/eld0;->b:I

    .line 402
    .line 403
    add-int/lit8 v13, v13, 0x3

    .line 404
    .line 405
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 406
    .line 407
    .line 408
    move-result v12

    .line 409
    iget v13, v1, La/r68;->b:I

    .line 410
    .line 411
    add-int/lit8 v13, v13, -0x1

    .line 412
    .line 413
    move-object/from16 v26, v3

    .line 414
    .line 415
    iget v3, v11, La/eld0;->c:I

    .line 416
    .line 417
    add-int/lit8 v3, v3, -0x3

    .line 418
    .line 419
    invoke-static {v13, v3}, Ljava/lang/Math;->min(II)I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    const/4 v13, 0x0

    .line 424
    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    move/from16 v13, v18

    .line 429
    .line 430
    invoke-direct {v4, v12, v3, v13}, La/eld0;-><init>(IIB)V

    .line 431
    .line 432
    .line 433
    new-instance v3, La/eld0;

    .line 434
    .line 435
    iget v12, v1, La/r68;->a:I

    .line 436
    .line 437
    add-int/lit8 v12, v12, -0x1

    .line 438
    .line 439
    add-int/lit8 v6, v6, 0x3

    .line 440
    .line 441
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 442
    .line 443
    .line 444
    move-result v6

    .line 445
    iget v12, v1, La/r68;->b:I

    .line 446
    .line 447
    add-int/lit8 v12, v12, -0x1

    .line 448
    .line 449
    add-int/lit8 v13, v25, 0x3

    .line 450
    .line 451
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 452
    .line 453
    .line 454
    move-result v12

    .line 455
    const/4 v13, 0x3

    .line 456
    invoke-direct {v3, v6, v12, v13}, La/eld0;-><init>(IIB)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v3, v2}, La/fgk;->c(La/eld0;La/eld0;)I

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    if-nez v6, :cond_0

    .line 464
    .line 465
    goto :goto_4

    .line 466
    :cond_0
    invoke-virtual {v0, v2, v7}, La/fgk;->c(La/eld0;La/eld0;)I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    if-eq v2, v6, :cond_1

    .line 471
    .line 472
    goto :goto_4

    .line 473
    :cond_1
    invoke-virtual {v0, v7, v4}, La/fgk;->c(La/eld0;La/eld0;)I

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eq v2, v6, :cond_2

    .line 478
    .line 479
    goto :goto_4

    .line 480
    :cond_2
    invoke-virtual {v0, v4, v3}, La/fgk;->c(La/eld0;La/eld0;)I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-ne v2, v6, :cond_5

    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_3
    move-object/from16 v26, v3

    .line 488
    .line 489
    :goto_3
    xor-int/lit8 v13, v24, 0x1

    .line 490
    .line 491
    iget v2, v0, La/fgk;->e:I

    .line 492
    .line 493
    add-int/lit8 v2, v2, 0x1

    .line 494
    .line 495
    iput v2, v0, La/fgk;->e:I

    .line 496
    .line 497
    move-object v10, v11

    .line 498
    move/from16 v9, v16

    .line 499
    .line 500
    move-object/from16 v11, v21

    .line 501
    .line 502
    move/from16 v6, v22

    .line 503
    .line 504
    move-object/from16 v12, v23

    .line 505
    .line 506
    move-object/from16 v8, v26

    .line 507
    .line 508
    const/4 v2, 0x3

    .line 509
    const/4 v3, 0x2

    .line 510
    const/4 v4, -0x1

    .line 511
    const/4 v5, 0x7

    .line 512
    const/4 v7, 0x0

    .line 513
    goto/16 :goto_2

    .line 514
    .line 515
    :cond_4
    move/from16 v22, v6

    .line 516
    .line 517
    :cond_5
    :goto_4
    iget v2, v0, La/fgk;->e:I

    .line 518
    .line 519
    const/4 v3, 0x5

    .line 520
    if-eq v2, v3, :cond_7

    .line 521
    .line 522
    const/4 v4, 0x7

    .line 523
    if-ne v2, v4, :cond_6

    .line 524
    .line 525
    goto :goto_5

    .line 526
    :cond_6
    invoke-static {}, La/o660;->a()La/o660;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    throw v0

    .line 531
    :cond_7
    :goto_5
    if-ne v2, v3, :cond_8

    .line 532
    .line 533
    move/from16 v3, v22

    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_8
    const/4 v3, 0x0

    .line 537
    :goto_6
    iput-boolean v3, v0, La/fgk;->b:Z

    .line 538
    .line 539
    new-instance v3, La/d3g0;

    .line 540
    .line 541
    int-to-float v4, v5

    .line 542
    const/high16 v5, 0x3f000000    # 0.5f

    .line 543
    .line 544
    add-float/2addr v4, v5

    .line 545
    int-to-float v6, v9

    .line 546
    sub-float/2addr v6, v5

    .line 547
    invoke-direct {v3, v4, v6}, La/d3g0;-><init>(FF)V

    .line 548
    .line 549
    .line 550
    new-instance v4, La/d3g0;

    .line 551
    .line 552
    iget v6, v8, La/eld0;->b:I

    .line 553
    .line 554
    int-to-float v6, v6

    .line 555
    add-float/2addr v6, v5

    .line 556
    iget v7, v8, La/eld0;->c:I

    .line 557
    .line 558
    int-to-float v7, v7

    .line 559
    add-float/2addr v7, v5

    .line 560
    invoke-direct {v4, v6, v7}, La/d3g0;-><init>(FF)V

    .line 561
    .line 562
    .line 563
    new-instance v6, La/d3g0;

    .line 564
    .line 565
    iget v7, v10, La/eld0;->b:I

    .line 566
    .line 567
    int-to-float v7, v7

    .line 568
    sub-float/2addr v7, v5

    .line 569
    iget v8, v10, La/eld0;->c:I

    .line 570
    .line 571
    int-to-float v8, v8

    .line 572
    add-float/2addr v8, v5

    .line 573
    invoke-direct {v6, v7, v8}, La/d3g0;-><init>(FF)V

    .line 574
    .line 575
    .line 576
    new-instance v7, La/d3g0;

    .line 577
    .line 578
    int-to-float v8, v15

    .line 579
    sub-float/2addr v8, v5

    .line 580
    int-to-float v9, v14

    .line 581
    sub-float/2addr v9, v5

    .line 582
    invoke-direct {v7, v8, v9}, La/d3g0;-><init>(FF)V

    .line 583
    .line 584
    .line 585
    filled-new-array {v3, v4, v6, v7}, [La/d3g0;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    const/16 v20, 0x2

    .line 590
    .line 591
    mul-int/lit8 v2, v2, 0x2

    .line 592
    .line 593
    add-int/lit8 v4, v2, -0x3

    .line 594
    .line 595
    invoke-static {v3, v4, v2}, La/fgk;->b([La/d3g0;II)[La/d3g0;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/16 v19, 0x0

    .line 600
    .line 601
    if-eqz p1, :cond_9

    .line 602
    .line 603
    aget-object v3, v2, v19

    .line 604
    .line 605
    aget-object v4, v2, v20

    .line 606
    .line 607
    aput-object v4, v2, v19

    .line 608
    .line 609
    aput-object v3, v2, v20

    .line 610
    .line 611
    :cond_9
    aget-object v3, v2, v19

    .line 612
    .line 613
    invoke-virtual {v0, v3}, La/fgk;->g(La/d3g0;)Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-eqz v3, :cond_13

    .line 618
    .line 619
    aget-object v3, v2, v22

    .line 620
    .line 621
    invoke-virtual {v0, v3}, La/fgk;->g(La/d3g0;)Z

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    if-eqz v3, :cond_13

    .line 626
    .line 627
    aget-object v3, v2, v20

    .line 628
    .line 629
    invoke-virtual {v0, v3}, La/fgk;->g(La/d3g0;)Z

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    if-eqz v3, :cond_13

    .line 634
    .line 635
    const/16 v18, 0x3

    .line 636
    .line 637
    aget-object v3, v2, v18

    .line 638
    .line 639
    invoke-virtual {v0, v3}, La/fgk;->g(La/d3g0;)Z

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    if-eqz v3, :cond_13

    .line 644
    .line 645
    iget v3, v0, La/fgk;->e:I

    .line 646
    .line 647
    mul-int/lit8 v3, v3, 0x2

    .line 648
    .line 649
    const/16 v19, 0x0

    .line 650
    .line 651
    aget-object v4, v2, v19

    .line 652
    .line 653
    aget-object v5, v2, v22

    .line 654
    .line 655
    invoke-virtual {v0, v4, v5, v3}, La/fgk;->h(La/d3g0;La/d3g0;I)I

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    aget-object v5, v2, v22

    .line 660
    .line 661
    aget-object v6, v2, v20

    .line 662
    .line 663
    invoke-virtual {v0, v5, v6, v3}, La/fgk;->h(La/d3g0;La/d3g0;I)I

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    aget-object v6, v2, v20

    .line 668
    .line 669
    const/16 v18, 0x3

    .line 670
    .line 671
    aget-object v7, v2, v18

    .line 672
    .line 673
    invoke-virtual {v0, v6, v7, v3}, La/fgk;->h(La/d3g0;La/d3g0;I)I

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    aget-object v7, v2, v18

    .line 678
    .line 679
    aget-object v8, v2, v19

    .line 680
    .line 681
    invoke-virtual {v0, v7, v8, v3}, La/fgk;->h(La/d3g0;La/d3g0;I)I

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    filled-new-array {v4, v5, v6, v7}, [I

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    move/from16 v5, v19

    .line 690
    .line 691
    move v12, v5

    .line 692
    :goto_7
    const/4 v13, 0x4

    .line 693
    if-ge v12, v13, :cond_a

    .line 694
    .line 695
    aget v6, v4, v12

    .line 696
    .line 697
    add-int/lit8 v7, v3, -0x2

    .line 698
    .line 699
    shr-int v7, v6, v7

    .line 700
    .line 701
    shl-int/lit8 v7, v7, 0x1

    .line 702
    .line 703
    and-int/lit8 v6, v6, 0x1

    .line 704
    .line 705
    add-int/2addr v7, v6

    .line 706
    shl-int/lit8 v5, v5, 0x3

    .line 707
    .line 708
    add-int/2addr v5, v7

    .line 709
    add-int/lit8 v12, v12, 0x1

    .line 710
    .line 711
    const/16 v20, 0x2

    .line 712
    .line 713
    goto :goto_7

    .line 714
    :cond_a
    and-int/lit8 v3, v5, 0x1

    .line 715
    .line 716
    shl-int/lit8 v3, v3, 0xb

    .line 717
    .line 718
    shr-int/lit8 v5, v5, 0x1

    .line 719
    .line 720
    add-int/2addr v3, v5

    .line 721
    move/from16 v12, v19

    .line 722
    .line 723
    :goto_8
    if-ge v12, v13, :cond_12

    .line 724
    .line 725
    sget-object v5, La/fgk;->g:[I

    .line 726
    .line 727
    aget v5, v5, v12

    .line 728
    .line 729
    xor-int/2addr v5, v3

    .line 730
    invoke-static {v5}, Ljava/lang/Integer;->bitCount(I)I

    .line 731
    .line 732
    .line 733
    move-result v5

    .line 734
    const/4 v6, 0x2

    .line 735
    if-gt v5, v6, :cond_11

    .line 736
    .line 737
    iput v12, v0, La/fgk;->f:I

    .line 738
    .line 739
    const-wide/16 v5, 0x0

    .line 740
    .line 741
    move/from16 v12, v19

    .line 742
    .line 743
    :goto_9
    const/16 v3, 0xa

    .line 744
    .line 745
    if-ge v12, v13, :cond_c

    .line 746
    .line 747
    iget v7, v0, La/fgk;->f:I

    .line 748
    .line 749
    add-int/2addr v7, v12

    .line 750
    rem-int/2addr v7, v13

    .line 751
    aget v7, v4, v7

    .line 752
    .line 753
    iget-boolean v8, v0, La/fgk;->b:Z

    .line 754
    .line 755
    if-eqz v8, :cond_b

    .line 756
    .line 757
    const/16 v17, 0x7

    .line 758
    .line 759
    shl-long v5, v5, v17

    .line 760
    .line 761
    shr-int/lit8 v3, v7, 0x1

    .line 762
    .line 763
    and-int/lit8 v3, v3, 0x7f

    .line 764
    .line 765
    :goto_a
    int-to-long v7, v3

    .line 766
    add-long/2addr v5, v7

    .line 767
    goto :goto_b

    .line 768
    :cond_b
    const/16 v17, 0x7

    .line 769
    .line 770
    shl-long/2addr v5, v3

    .line 771
    shr-int/lit8 v3, v7, 0x2

    .line 772
    .line 773
    and-int/lit16 v3, v3, 0x3e0

    .line 774
    .line 775
    shr-int/lit8 v7, v7, 0x1

    .line 776
    .line 777
    and-int/lit8 v7, v7, 0x1f

    .line 778
    .line 779
    add-int/2addr v3, v7

    .line 780
    goto :goto_a

    .line 781
    :goto_b
    add-int/lit8 v12, v12, 0x1

    .line 782
    .line 783
    goto :goto_9

    .line 784
    :cond_c
    const/16 v17, 0x7

    .line 785
    .line 786
    iget-boolean v4, v0, La/fgk;->b:Z

    .line 787
    .line 788
    if-eqz v4, :cond_d

    .line 789
    .line 790
    move/from16 v3, v17

    .line 791
    .line 792
    const/4 v4, 0x2

    .line 793
    goto :goto_c

    .line 794
    :cond_d
    move v4, v13

    .line 795
    :goto_c
    sub-int v7, v3, v4

    .line 796
    .line 797
    new-array v8, v3, [I

    .line 798
    .line 799
    add-int/lit8 v3, v3, -0x1

    .line 800
    .line 801
    :goto_d
    if-ltz v3, :cond_e

    .line 802
    .line 803
    long-to-int v9, v5

    .line 804
    and-int/lit8 v9, v9, 0xf

    .line 805
    .line 806
    aput v9, v8, v3

    .line 807
    .line 808
    shr-long/2addr v5, v13

    .line 809
    add-int/lit8 v3, v3, -0x1

    .line 810
    .line 811
    goto :goto_d

    .line 812
    :cond_e
    :try_start_2
    new-instance v3, La/yox;

    .line 813
    .line 814
    sget-object v5, La/wjt;->k:La/wjt;

    .line 815
    .line 816
    invoke-direct {v3, v5}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v3, v8, v7}, La/yox;->f([II)I

    .line 820
    .line 821
    .line 822
    move-result v29
    :try_end_2
    .catch La/eie0; {:try_start_2 .. :try_end_2} :catch_2

    .line 823
    move/from16 v3, v19

    .line 824
    .line 825
    move v7, v3

    .line 826
    :goto_e
    if-ge v7, v4, :cond_f

    .line 827
    .line 828
    shl-int/lit8 v3, v3, 0x4

    .line 829
    .line 830
    aget v5, v8, v7

    .line 831
    .line 832
    add-int/2addr v3, v5

    .line 833
    add-int/lit8 v7, v7, 0x1

    .line 834
    .line 835
    goto :goto_e

    .line 836
    :cond_f
    iget-boolean v4, v0, La/fgk;->b:Z

    .line 837
    .line 838
    if-eqz v4, :cond_10

    .line 839
    .line 840
    shr-int/lit8 v4, v3, 0x6

    .line 841
    .line 842
    add-int/lit8 v4, v4, 0x1

    .line 843
    .line 844
    iput v4, v0, La/fgk;->c:I

    .line 845
    .line 846
    and-int/lit8 v3, v3, 0x3f

    .line 847
    .line 848
    add-int/lit8 v3, v3, 0x1

    .line 849
    .line 850
    iput v3, v0, La/fgk;->d:I

    .line 851
    .line 852
    goto :goto_f

    .line 853
    :cond_10
    shr-int/lit8 v4, v3, 0xb

    .line 854
    .line 855
    add-int/lit8 v4, v4, 0x1

    .line 856
    .line 857
    iput v4, v0, La/fgk;->c:I

    .line 858
    .line 859
    and-int/lit16 v3, v3, 0x7ff

    .line 860
    .line 861
    add-int/lit8 v3, v3, 0x1

    .line 862
    .line 863
    iput v3, v0, La/fgk;->d:I

    .line 864
    .line 865
    :goto_f
    iget v3, v0, La/fgk;->f:I

    .line 866
    .line 867
    rem-int/lit8 v4, v3, 0x4

    .line 868
    .line 869
    aget-object v4, v2, v4

    .line 870
    .line 871
    add-int/lit8 v5, v3, 0x1

    .line 872
    .line 873
    rem-int/2addr v5, v13

    .line 874
    aget-object v5, v2, v5

    .line 875
    .line 876
    add-int/lit8 v6, v3, 0x2

    .line 877
    .line 878
    rem-int/2addr v6, v13

    .line 879
    aget-object v6, v2, v6

    .line 880
    .line 881
    const/16 v18, 0x3

    .line 882
    .line 883
    add-int/lit8 v3, v3, 0x3

    .line 884
    .line 885
    rem-int/2addr v3, v13

    .line 886
    aget-object v3, v2, v3

    .line 887
    .line 888
    invoke-virtual {v0}, La/fgk;->d()I

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    int-to-float v8, v7

    .line 893
    const/high16 v9, 0x40000000    # 2.0f

    .line 894
    .line 895
    div-float/2addr v8, v9

    .line 896
    iget v9, v0, La/fgk;->e:I

    .line 897
    .line 898
    int-to-float v9, v9

    .line 899
    sub-float v30, v8, v9

    .line 900
    .line 901
    add-float v32, v8, v9

    .line 902
    .line 903
    iget v8, v4, La/d3g0;->a:F

    .line 904
    .line 905
    iget v4, v4, La/d3g0;->b:F

    .line 906
    .line 907
    iget v9, v5, La/d3g0;->a:F

    .line 908
    .line 909
    iget v5, v5, La/d3g0;->b:F

    .line 910
    .line 911
    iget v10, v6, La/d3g0;->a:F

    .line 912
    .line 913
    iget v6, v6, La/d3g0;->b:F

    .line 914
    .line 915
    iget v11, v3, La/d3g0;->a:F

    .line 916
    .line 917
    iget v3, v3, La/d3g0;->b:F

    .line 918
    .line 919
    move/from16 v31, v30

    .line 920
    .line 921
    move/from16 v33, v30

    .line 922
    .line 923
    move/from16 v34, v32

    .line 924
    .line 925
    move/from16 v35, v32

    .line 926
    .line 927
    move/from16 v36, v30

    .line 928
    .line 929
    move/from16 v37, v32

    .line 930
    .line 931
    move/from16 v45, v3

    .line 932
    .line 933
    move/from16 v39, v4

    .line 934
    .line 935
    move/from16 v41, v5

    .line 936
    .line 937
    move/from16 v43, v6

    .line 938
    .line 939
    move/from16 v38, v8

    .line 940
    .line 941
    move/from16 v40, v9

    .line 942
    .line 943
    move/from16 v42, v10

    .line 944
    .line 945
    move/from16 v44, v11

    .line 946
    .line 947
    invoke-static/range {v30 .. v45}, La/zk90;->a(FFFFFFFFFFFFFFFF)La/zk90;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    invoke-static {v1, v7, v7, v3}, La/ebc;->j0(La/r68;IILa/zk90;)La/r68;

    .line 952
    .line 953
    .line 954
    move-result-object v24

    .line 955
    iget v1, v0, La/fgk;->e:I

    .line 956
    .line 957
    const/16 v20, 0x2

    .line 958
    .line 959
    mul-int/lit8 v1, v1, 0x2

    .line 960
    .line 961
    invoke-virtual {v0}, La/fgk;->d()I

    .line 962
    .line 963
    .line 964
    move-result v3

    .line 965
    invoke-static {v2, v1, v3}, La/fgk;->b([La/d3g0;II)[La/d3g0;

    .line 966
    .line 967
    .line 968
    move-result-object v25

    .line 969
    new-instance v23, La/db5;

    .line 970
    .line 971
    iget-boolean v1, v0, La/fgk;->b:Z

    .line 972
    .line 973
    iget v2, v0, La/fgk;->d:I

    .line 974
    .line 975
    iget v0, v0, La/fgk;->c:I

    .line 976
    .line 977
    move/from16 v28, v0

    .line 978
    .line 979
    move/from16 v26, v1

    .line 980
    .line 981
    move/from16 v27, v2

    .line 982
    .line 983
    invoke-direct/range {v23 .. v29}, La/db5;-><init>(La/r68;[La/d3g0;ZIII)V

    .line 984
    .line 985
    .line 986
    return-object v23

    .line 987
    :catch_2
    invoke-static {}, La/o660;->a()La/o660;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    throw v0

    .line 992
    :cond_11
    move/from16 v20, v6

    .line 993
    .line 994
    const/16 v17, 0x7

    .line 995
    .line 996
    const/16 v18, 0x3

    .line 997
    .line 998
    add-int/lit8 v12, v12, 0x1

    .line 999
    .line 1000
    goto/16 :goto_8

    .line 1001
    .line 1002
    :cond_12
    invoke-static {}, La/o660;->a()La/o660;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    throw v0

    .line 1007
    :cond_13
    invoke-static {}, La/o660;->a()La/o660;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    throw v0
.end method

.method public final c(La/eld0;La/eld0;)I
    .locals 10

    .line 1
    iget v0, p1, La/eld0;->b:I

    .line 2
    .line 3
    iget p1, p1, La/eld0;->c:I

    .line 4
    .line 5
    iget v1, p2, La/eld0;->b:I

    .line 6
    .line 7
    iget p2, p2, La/eld0;->c:I

    .line 8
    .line 9
    invoke-static {v0, p1, v1, p2}, La/q7x;->w(IIII)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    cmpl-float v3, v2, v3

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    sub-int/2addr v1, v0

    .line 21
    int-to-float v1, v1

    .line 22
    div-float/2addr v1, v2

    .line 23
    sub-int/2addr p2, p1

    .line 24
    int-to-float p2, p2

    .line 25
    div-float/2addr p2, v2

    .line 26
    int-to-float v3, v0

    .line 27
    int-to-float v5, p1

    .line 28
    iget-object p0, p0, La/fgk;->a:La/r68;

    .line 29
    .line 30
    invoke-virtual {p0, v0, p1}, La/r68;->b(II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    float-to-double v6, v2

    .line 35
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    double-to-int v0, v6

    .line 40
    move v6, v4

    .line 41
    move v7, v6

    .line 42
    :goto_0
    if-ge v6, v0, :cond_2

    .line 43
    .line 44
    invoke-static {v3}, La/q7x;->E(F)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    invoke-static {v5}, La/q7x;->E(F)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {p0, v8, v9}, La/r68;->b(II)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eq v8, p1, :cond_1

    .line 57
    .line 58
    add-int/lit8 v7, v7, 0x1

    .line 59
    .line 60
    :cond_1
    add-float/2addr v3, v1

    .line 61
    add-float/2addr v5, p2

    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    int-to-float p0, v7

    .line 66
    div-float/2addr p0, v2

    .line 67
    const p2, 0x3dcccccd    # 0.1f

    .line 68
    .line 69
    .line 70
    cmpl-float v0, p0, p2

    .line 71
    .line 72
    if-lez v0, :cond_3

    .line 73
    .line 74
    const v0, 0x3f666666    # 0.9f

    .line 75
    .line 76
    .line 77
    cmpg-float v0, p0, v0

    .line 78
    .line 79
    if-gez v0, :cond_3

    .line 80
    .line 81
    :goto_1
    return v4

    .line 82
    :cond_3
    cmpg-float p0, p0, p2

    .line 83
    .line 84
    const/4 p2, 0x1

    .line 85
    if-gtz p0, :cond_4

    .line 86
    .line 87
    move v4, p2

    .line 88
    :cond_4
    if-ne v4, p1, :cond_5

    .line 89
    .line 90
    return p2

    .line 91
    :cond_5
    const/4 p0, -0x1

    .line 92
    return p0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-boolean v0, p0, La/fgk;->b:Z

    .line 2
    .line 3
    iget p0, p0, La/fgk;->c:I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    mul-int/lit8 p0, p0, 0x4

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0xb

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    mul-int/lit8 v0, p0, 0x4

    .line 13
    .line 14
    mul-int/lit8 p0, p0, 0x2

    .line 15
    .line 16
    add-int/lit8 p0, p0, 0x6

    .line 17
    .line 18
    div-int/lit8 p0, p0, 0xf

    .line 19
    .line 20
    mul-int/lit8 p0, p0, 0x2

    .line 21
    .line 22
    add-int/2addr p0, v0

    .line 23
    add-int/lit8 p0, p0, 0xf

    .line 24
    .line 25
    return p0
.end method

.method public final e(La/eld0;ZII)La/eld0;
    .locals 3

    .line 1
    iget v0, p1, La/eld0;->b:I

    .line 2
    .line 3
    add-int/2addr v0, p3

    .line 4
    iget p1, p1, La/eld0;->c:I

    .line 5
    .line 6
    :goto_0
    add-int/2addr p1, p4

    .line 7
    invoke-virtual {p0, v0, p1}, La/fgk;->f(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, La/fgk;->a:La/r68;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v0, p1}, La/r68;->b(II)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, p2, :cond_0

    .line 20
    .line 21
    add-int/2addr v0, p3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sub-int/2addr v0, p3

    .line 24
    sub-int/2addr p1, p4

    .line 25
    :goto_1
    invoke-virtual {p0, v0, p1}, La/fgk;->f(II)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, v0, p1}, La/r68;->b(II)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v1, p2, :cond_1

    .line 36
    .line 37
    add-int/2addr v0, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sub-int/2addr v0, p3

    .line 40
    :goto_2
    invoke-virtual {p0, v0, p1}, La/fgk;->f(II)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v0, p1}, La/r68;->b(II)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-ne p3, p2, :cond_2

    .line 51
    .line 52
    add-int/2addr p1, p4

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    sub-int/2addr p1, p4

    .line 55
    new-instance p0, La/eld0;

    .line 56
    .line 57
    const/4 p2, 0x3

    .line 58
    invoke-direct {p0, v0, p1, p2}, La/eld0;-><init>(IIB)V

    .line 59
    .line 60
    .line 61
    return-object p0
.end method

.method public final f(II)Z
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, La/fgk;->a:La/r68;

    .line 4
    .line 5
    iget v0, p0, La/r68;->a:I

    .line 6
    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    if-ltz p2, :cond_0

    .line 10
    .line 11
    iget p0, p0, La/r68;->b:I

    .line 12
    .line 13
    if-ge p2, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final g(La/d3g0;)Z
    .locals 1

    .line 1
    iget v0, p1, La/d3g0;->a:F

    .line 2
    .line 3
    invoke-static {v0}, La/q7x;->E(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p1, p1, La/d3g0;->b:F

    .line 8
    .line 9
    invoke-static {p1}, La/q7x;->E(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, v0, p1}, La/fgk;->f(II)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final h(La/d3g0;La/d3g0;I)I
    .locals 7

    .line 1
    iget v0, p1, La/d3g0;->a:F

    .line 2
    .line 3
    iget v1, p1, La/d3g0;->b:F

    .line 4
    .line 5
    iget v2, p2, La/d3g0;->a:F

    .line 6
    .line 7
    iget v3, p2, La/d3g0;->b:F

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, La/q7x;->v(FFFF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v2, p3

    .line 14
    div-float v2, v0, v2

    .line 15
    .line 16
    iget p1, p1, La/d3g0;->a:F

    .line 17
    .line 18
    iget p2, p2, La/d3g0;->a:F

    .line 19
    .line 20
    sub-float/2addr p2, p1

    .line 21
    mul-float/2addr p2, v2

    .line 22
    div-float/2addr p2, v0

    .line 23
    sub-float/2addr v3, v1

    .line 24
    mul-float/2addr v3, v2

    .line 25
    div-float/2addr v3, v0

    .line 26
    const/4 v0, 0x0

    .line 27
    move v2, v0

    .line 28
    :goto_0
    if-ge v0, p3, :cond_1

    .line 29
    .line 30
    int-to-float v4, v0

    .line 31
    mul-float v5, v4, p2

    .line 32
    .line 33
    add-float/2addr v5, p1

    .line 34
    invoke-static {v5}, La/q7x;->E(F)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    mul-float/2addr v4, v3

    .line 39
    add-float/2addr v4, v1

    .line 40
    invoke-static {v4}, La/q7x;->E(F)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object v6, p0, La/fgk;->a:La/r68;

    .line 45
    .line 46
    invoke-virtual {v6, v5, v4}, La/r68;->b(II)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    sub-int v4, p3, v0

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    sub-int/2addr v4, v5

    .line 56
    shl-int v4, v5, v4

    .line 57
    .line 58
    or-int/2addr v2, v4

    .line 59
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return v2
.end method
