.class public final La/ndo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sv40;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:La/odo0;

.field public final synthetic d:I

.field public final synthetic e:La/cch0;


# direct methods
.method public constructor <init>(FFLa/odo0;ILa/cch0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/ndo0;->a:F

    .line 5
    .line 6
    iput p2, p0, La/ndo0;->b:F

    .line 7
    .line 8
    iput-object p3, p0, La/ndo0;->c:La/odo0;

    .line 9
    .line 10
    iput p4, p0, La/ndo0;->d:I

    .line 11
    .line 12
    iput-object p5, p0, La/ndo0;->e:La/cch0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/util/List;

    .line 15
    .line 16
    const/4 v12, 0x1

    .line 17
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    iget v4, v0, La/ndo0;->a:F

    .line 24
    .line 25
    invoke-interface {v6, v4}, La/w6k;->T(F)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v13

    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    move v9, v2

    .line 42
    :goto_0
    const v14, 0x7fffffff

    .line 43
    .line 44
    .line 45
    if-ge v9, v8, :cond_0

    .line 46
    .line 47
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    check-cast v10, La/pj30;

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-interface {v10, v14}, La/pj30;->b(I)I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v19

    .line 76
    mul-int/lit8 v22, v5, 0x2

    .line 77
    .line 78
    iget v7, v0, La/ndo0;->b:F

    .line 79
    .line 80
    invoke-interface {v6, v7}, La/w6k;->T(F)I

    .line 81
    .line 82
    .line 83
    move-result v17

    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    const/16 v21, 0x2

    .line 87
    .line 88
    move/from16 v20, v19

    .line 89
    .line 90
    move-wide/from16 v15, p3

    .line 91
    .line 92
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 93
    .line 94
    .line 95
    move-result-wide v8

    .line 96
    move/from16 v15, v19

    .line 97
    .line 98
    new-instance v10, La/jie0;

    .line 99
    .line 100
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    iput v4, v10, La/jie0;->a:F

    .line 104
    .line 105
    move-object v4, v10

    .line 106
    new-instance v10, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    move v12, v2

    .line 120
    :goto_1
    if-ge v12, v11, :cond_1

    .line 121
    .line 122
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v16

    .line 126
    check-cast v16, La/pj30;

    .line 127
    .line 128
    move v2, v7

    .line 129
    move-object/from16 v7, v16

    .line 130
    .line 131
    move/from16 v16, v11

    .line 132
    .line 133
    move v11, v12

    .line 134
    const/4 v12, 0x1

    .line 135
    invoke-static/range {v7 .. v12}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    move v12, v7

    .line 140
    move/from16 v11, v16

    .line 141
    .line 142
    move v7, v2

    .line 143
    const/4 v2, 0x0

    .line 144
    goto :goto_1

    .line 145
    :cond_1
    move v2, v7

    .line 146
    const/4 v12, 0x1

    .line 147
    new-instance v7, Landroidx/collection/MutableIntList;

    .line 148
    .line 149
    invoke-direct {v7}, Landroidx/collection/MutableIntList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    const/4 v9, 0x0

    .line 157
    :goto_2
    if-ge v9, v8, :cond_2

    .line 158
    .line 159
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    check-cast v11, La/pj30;

    .line 164
    .line 165
    invoke-interface {v11, v14}, La/pj30;->P(I)I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    invoke-virtual {v7, v11}, Landroidx/collection/MutableIntList;->a(I)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v9, v9, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 178
    .line 179
    .line 180
    move/from16 v14, v22

    .line 181
    .line 182
    const/4 v8, 0x0

    .line 183
    :goto_3
    if-ge v8, v13, :cond_3

    .line 184
    .line 185
    new-instance v9, La/ycl;

    .line 186
    .line 187
    invoke-direct {v9, v2}, La/ycl;-><init>(F)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    check-cast v11, La/pu90;

    .line 195
    .line 196
    iget v11, v11, La/pu90;->a:I

    .line 197
    .line 198
    invoke-interface {v6, v11}, La/w6k;->r0(I)F

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    new-instance v12, La/ycl;

    .line 203
    .line 204
    invoke-direct {v12, v11}, La/ycl;-><init>(F)V

    .line 205
    .line 206
    .line 207
    invoke-static {v9, v12}, La/idd;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    check-cast v9, La/ycl;

    .line 212
    .line 213
    iget v9, v9, La/ycl;->a:F

    .line 214
    .line 215
    invoke-interface {v6, v9}, La/w6k;->T(F)I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    add-int/2addr v14, v11

    .line 220
    invoke-virtual {v7, v8}, Landroidx/collection/MutableIntList;->c(I)I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    invoke-interface {v6, v11}, La/w6k;->r0(I)F

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    sget v12, La/nbo0;->a:F

    .line 229
    .line 230
    const/high16 v16, 0x40000000    # 2.0f

    .line 231
    .line 232
    mul-float v12, v12, v16

    .line 233
    .line 234
    sub-float/2addr v11, v12

    .line 235
    new-instance v12, La/ycl;

    .line 236
    .line 237
    invoke-direct {v12, v11}, La/ycl;-><init>(F)V

    .line 238
    .line 239
    .line 240
    new-instance v11, La/ycl;

    .line 241
    .line 242
    move/from16 v16, v2

    .line 243
    .line 244
    const/high16 v2, 0x41c00000    # 24.0f

    .line 245
    .line 246
    invoke-direct {v11, v2}, La/ycl;-><init>(F)V

    .line 247
    .line 248
    .line 249
    invoke-static {v12, v11}, La/idd;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    check-cast v2, La/ycl;

    .line 254
    .line 255
    iget v2, v2, La/ycl;->a:F

    .line 256
    .line 257
    new-instance v11, La/ado0;

    .line 258
    .line 259
    iget v12, v4, La/jie0;->a:F

    .line 260
    .line 261
    invoke-direct {v11, v12, v9, v2}, La/ado0;-><init>(FFF)V

    .line 262
    .line 263
    .line 264
    add-float/2addr v12, v9

    .line 265
    iput v12, v4, La/jie0;->a:F

    .line 266
    .line 267
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    add-int/lit8 v8, v8, 0x1

    .line 271
    .line 272
    move/from16 v2, v16

    .line 273
    .line 274
    const/4 v12, 0x1

    .line 275
    goto :goto_3

    .line 276
    :cond_3
    iget-object v2, v0, La/ndo0;->c:La/odo0;

    .line 277
    .line 278
    iget-object v2, v2, La/odo0;->a:La/pz40;

    .line 279
    .line 280
    check-cast v2, La/hgk0;

    .line 281
    .line 282
    invoke-virtual {v2, v3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    move-object v2, v10

    .line 286
    new-instance v10, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    const/4 v11, 0x0

    .line 300
    :goto_4
    if-ge v11, v13, :cond_4

    .line 301
    .line 302
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    check-cast v7, La/pj30;

    .line 307
    .line 308
    iget v8, v0, La/ndo0;->d:I

    .line 309
    .line 310
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    check-cast v8, La/ado0;

    .line 315
    .line 316
    iget v8, v8, La/ado0;->c:F

    .line 317
    .line 318
    invoke-interface {v6, v8}, La/w6k;->T(F)I

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    const/4 v9, 0x0

    .line 323
    invoke-static {v9, v8, v9, v15}, La/p4e;->a(IIII)J

    .line 324
    .line 325
    .line 326
    move-result-wide v16

    .line 327
    move-wide/from16 v23, v16

    .line 328
    .line 329
    move/from16 v16, v9

    .line 330
    .line 331
    move-wide/from16 v8, v23

    .line 332
    .line 333
    const/4 v12, 0x1

    .line 334
    invoke-static/range {v7 .. v12}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    goto :goto_4

    .line 339
    :cond_4
    new-instance v1, La/mdo0;

    .line 340
    .line 341
    move-object v8, v3

    .line 342
    move-object v3, v2

    .line 343
    iget v2, v0, La/ndo0;->a:F

    .line 344
    .line 345
    move v7, v5

    .line 346
    iget-object v5, v0, La/ndo0;->e:La/cch0;

    .line 347
    .line 348
    iget v9, v0, La/ndo0;->d:I

    .line 349
    .line 350
    move-object v0, v1

    .line 351
    move-object v1, v4

    .line 352
    move-object v4, v10

    .line 353
    move v10, v15

    .line 354
    invoke-direct/range {v0 .. v10}, La/mdo0;-><init>(La/jie0;FLjava/util/ArrayList;Ljava/util/ArrayList;La/cch0;La/vj30;ILjava/util/ArrayList;II)V

    .line 355
    .line 356
    .line 357
    invoke-static {v6, v14, v15, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0
.end method
