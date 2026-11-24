.class public final La/upm0;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final a:La/d6e;

.field public final b:La/jru;

.field public final c:La/ieu;

.field public final d:La/f7u;

.field public final e:Landroid/util/SparseArray;

.field public final f:Landroid/util/SparseArray;

.field public final g:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(La/d6e;)V
    .locals 5

    .line 1
    new-instance v0, La/htz;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/sek;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/jru;

    .line 12
    .line 13
    invoke-direct {v2, v0}, La/jru;-><init>(La/htz;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, La/ieu;

    .line 17
    .line 18
    invoke-direct {v3, p1, v0}, La/ieu;-><init>(La/d6e;La/htz;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, La/f7u;

    .line 22
    .line 23
    invoke-direct {v4, p1, v3, v0, v1}, La/f7u;-><init>(La/d6e;La/ieu;La/htz;La/sek;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/upm0;->a:La/d6e;

    .line 30
    .line 31
    iput-object v2, p0, La/upm0;->b:La/jru;

    .line 32
    .line 33
    iput-object v3, p0, La/upm0;->c:La/ieu;

    .line 34
    .line 35
    iput-object v4, p0, La/upm0;->d:La/f7u;

    .line 36
    .line 37
    new-instance p1, Landroid/util/SparseArray;

    .line 38
    .line 39
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/upm0;->e:Landroid/util/SparseArray;

    .line 43
    .line 44
    new-instance p1, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, La/upm0;->f:Landroid/util/SparseArray;

    .line 50
    .line 51
    new-instance p1, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/upm0;->g:Landroid/graphics/Rect;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3, p4}, La/fhe0;->f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 p4, -0x1

    .line 18
    if-ne p2, p4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p4, p0, La/upm0;->d:La/f7u;

    .line 22
    .line 23
    invoke-static {p3}, La/htz;->e(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p4, p2, v0}, La/f7u;->m(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    if-eqz p4, :cond_2

    .line 32
    .line 33
    iget-object p4, p0, La/upm0;->c:La/ieu;

    .line 34
    .line 35
    invoke-virtual {p4, p3, p2}, La/ieu;->c(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p3}, La/htz;->d(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    iget-object p0, p0, La/upm0;->g:Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-static {p0, p2}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    const/4 p4, 0x1

    .line 49
    if-ne p3, p4, :cond_1

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iget p3, p0, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    add-int/2addr p2, p3

    .line 58
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 59
    .line 60
    add-int/2addr p2, p0

    .line 61
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    iget p3, p0, Landroid/graphics/Rect;->left:I

    .line 69
    .line 70
    add-int/2addr p2, p3

    .line 71
    iget p0, p0, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    add-int/2addr p2, p0

    .line 74
    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 75
    .line 76
    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 18

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
    iget-object v3, v0, La/upm0;->d:La/f7u;

    .line 8
    .line 9
    iget-object v4, v3, La/f7u;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-lez v5, :cond_11

    .line 24
    .line 25
    iget-object v6, v0, La/upm0;->a:La/d6e;

    .line 26
    .line 27
    invoke-virtual {v6}, La/zz3;->d()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-gtz v6, :cond_0

    .line 32
    .line 33
    goto/16 :goto_b

    .line 34
    .line 35
    :cond_0
    const/4 v7, 0x0

    .line 36
    :goto_0
    if-ge v7, v5, :cond_11

    .line 37
    .line 38
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    const/4 v10, -0x1

    .line 47
    if-ne v9, v10, :cond_2

    .line 48
    .line 49
    :cond_1
    move/from16 v17, v5

    .line 50
    .line 51
    goto/16 :goto_a

    .line 52
    .line 53
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, La/htz;->d(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    invoke-static {v4, v8}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    const/4 v12, 0x1

    .line 64
    if-ne v11, v12, :cond_3

    .line 65
    .line 66
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    iget v13, v4, Landroid/graphics/Rect;->top:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    iget v13, v4, Landroid/graphics/Rect;->left:I

    .line 78
    .line 79
    :goto_1
    if-gt v11, v13, :cond_4

    .line 80
    .line 81
    iget-object v11, v3, La/f7u;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v11, La/d6e;

    .line 84
    .line 85
    invoke-virtual {v11, v9}, La/d6e;->C(I)J

    .line 86
    .line 87
    .line 88
    move-result-wide v13

    .line 89
    const-wide/16 v15, 0x0

    .line 90
    .line 91
    cmp-long v11, v13, v15

    .line 92
    .line 93
    if-ltz v11, :cond_4

    .line 94
    .line 95
    move v11, v12

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const/4 v11, 0x0

    .line 98
    :goto_2
    if-nez v11, :cond_5

    .line 99
    .line 100
    invoke-static {v2}, La/htz;->e(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    invoke-virtual {v3, v9, v13}, La/f7u;->m(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_1

    .line 109
    .line 110
    :cond_5
    iget-object v13, v0, La/upm0;->c:La/ieu;

    .line 111
    .line 112
    invoke-virtual {v13, v2, v9}, La/ieu;->c(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    if-eqz v11, :cond_6

    .line 117
    .line 118
    iget-object v14, v0, La/upm0;->f:Landroid/util/SparseArray;

    .line 119
    .line 120
    invoke-virtual {v14, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    check-cast v15, Landroid/graphics/Rect;

    .line 125
    .line 126
    if-nez v15, :cond_7

    .line 127
    .line 128
    new-instance v15, Landroid/graphics/Rect;

    .line 129
    .line 130
    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v14, v9, v15}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    iget-object v14, v0, La/upm0;->e:Landroid/util/SparseArray;

    .line 138
    .line 139
    invoke-virtual {v14, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    check-cast v15, Landroid/graphics/Rect;

    .line 144
    .line 145
    if-nez v15, :cond_7

    .line 146
    .line 147
    new-instance v15, Landroid/graphics/Rect;

    .line 148
    .line 149
    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v14, v9, v15}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    :goto_3
    iget-object v9, v3, La/f7u;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v9, La/ieu;

    .line 158
    .line 159
    iget-object v14, v3, La/f7u;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v14, Landroid/graphics/Rect;

    .line 162
    .line 163
    invoke-static {v2}, La/htz;->d(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    invoke-static {v4, v13}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    instance-of v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 175
    .line 176
    if-eqz v12, :cond_8

    .line 177
    .line 178
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 179
    .line 180
    iget v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 181
    .line 182
    iget v10, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 183
    .line 184
    :goto_4
    move/from16 v17, v5

    .line 185
    .line 186
    const/4 v5, 0x1

    .line 187
    goto :goto_5

    .line 188
    :cond_8
    const/4 v10, 0x0

    .line 189
    const/4 v12, 0x0

    .line 190
    goto :goto_4

    .line 191
    :goto_5
    if-ne v6, v5, :cond_9

    .line 192
    .line 193
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    sub-int/2addr v5, v12

    .line 198
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 199
    .line 200
    add-int/2addr v5, v6

    .line 201
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    sub-int/2addr v6, v10

    .line 206
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    sub-int/2addr v6, v8

    .line 211
    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    .line 212
    .line 213
    sub-int/2addr v6, v8

    .line 214
    invoke-static {v2}, La/f7u;->h(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    iget v10, v4, Landroid/graphics/Rect;->top:I

    .line 219
    .line 220
    add-int/2addr v8, v10

    .line 221
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    goto :goto_6

    .line 226
    :cond_9
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    sub-int/2addr v5, v10

    .line 231
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 232
    .line 233
    add-int/2addr v6, v5

    .line 234
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    sub-int/2addr v5, v12

    .line 239
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    sub-int/2addr v5, v8

    .line 244
    iget v8, v4, Landroid/graphics/Rect;->right:I

    .line 245
    .line 246
    sub-int/2addr v5, v8

    .line 247
    invoke-static {v2}, La/f7u;->g(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    iget v10, v4, Landroid/graphics/Rect;->left:I

    .line 252
    .line 253
    add-int/2addr v8, v10

    .line 254
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    :goto_6
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    add-int/2addr v8, v5

    .line 263
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    add-int/2addr v10, v6

    .line 268
    invoke-virtual {v15, v5, v6, v8, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 269
    .line 270
    .line 271
    if-eqz v11, :cond_e

    .line 272
    .line 273
    invoke-virtual {v3, v2, v13}, La/f7u;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    if-nez v5, :cond_a

    .line 278
    .line 279
    goto/16 :goto_8

    .line 280
    .line 281
    :cond_a
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    const/4 v8, -0x1

    .line 286
    if-ne v6, v8, :cond_b

    .line 287
    .line 288
    goto/16 :goto_8

    .line 289
    .line 290
    :cond_b
    invoke-static {v2}, La/htz;->e(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-lez v6, :cond_e

    .line 295
    .line 296
    invoke-virtual {v3, v6, v8}, La/f7u;->m(IZ)Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_e

    .line 301
    .line 302
    invoke-virtual {v9, v2, v6}, La/ieu;->c(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-static {v4, v6}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v14, v13}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v2}, La/htz;->d(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    const/4 v10, 0x1

    .line 317
    if-ne v8, v10, :cond_c

    .line 318
    .line 319
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    .line 324
    .line 325
    sub-int/2addr v5, v8

    .line 326
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    sub-int/2addr v5, v6

    .line 331
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 332
    .line 333
    sub-int/2addr v5, v6

    .line 334
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    invoke-virtual {v13}, Landroid/view/View;->getBottom()I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    add-int/2addr v8, v6

    .line 343
    iget v6, v14, Landroid/graphics/Rect;->top:I

    .line 344
    .line 345
    add-int/2addr v8, v6

    .line 346
    iget v6, v14, Landroid/graphics/Rect;->bottom:I

    .line 347
    .line 348
    add-int/2addr v8, v6

    .line 349
    if-ge v5, v8, :cond_e

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_c
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    iget v8, v4, Landroid/graphics/Rect;->right:I

    .line 357
    .line 358
    sub-int/2addr v5, v8

    .line 359
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    sub-int/2addr v5, v6

    .line 364
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 365
    .line 366
    sub-int/2addr v5, v6

    .line 367
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    invoke-virtual {v13}, Landroid/view/View;->getRight()I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    add-int/2addr v8, v6

    .line 376
    iget v6, v14, Landroid/graphics/Rect;->left:I

    .line 377
    .line 378
    add-int/2addr v8, v6

    .line 379
    iget v6, v14, Landroid/graphics/Rect;->right:I

    .line 380
    .line 381
    add-int/2addr v8, v6

    .line 382
    if-ge v5, v8, :cond_e

    .line 383
    .line 384
    :goto_7
    invoke-virtual {v3, v2, v13}, La/f7u;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Landroid/view/View;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    if-eqz v5, :cond_e

    .line 389
    .line 390
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    invoke-virtual {v9, v2, v6}, La/ieu;->c(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    invoke-static {v2}, La/htz;->d(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    invoke-static {v4, v6}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v14, v13}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 406
    .line 407
    .line 408
    const/4 v10, 0x1

    .line 409
    if-ne v8, v10, :cond_d

    .line 410
    .line 411
    invoke-static {v2}, La/f7u;->h(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    iget v9, v14, Landroid/graphics/Rect;->top:I

    .line 416
    .line 417
    add-int/2addr v8, v9

    .line 418
    iget v9, v14, Landroid/graphics/Rect;->bottom:I

    .line 419
    .line 420
    add-int/2addr v8, v9

    .line 421
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    sub-int/2addr v5, v6

    .line 430
    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    .line 431
    .line 432
    sub-int/2addr v5, v6

    .line 433
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 434
    .line 435
    sub-int/2addr v5, v6

    .line 436
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    sub-int/2addr v5, v6

    .line 441
    sub-int/2addr v5, v8

    .line 442
    if-ge v5, v8, :cond_e

    .line 443
    .line 444
    iget v6, v15, Landroid/graphics/Rect;->top:I

    .line 445
    .line 446
    add-int/2addr v6, v5

    .line 447
    iput v6, v15, Landroid/graphics/Rect;->top:I

    .line 448
    .line 449
    goto :goto_8

    .line 450
    :cond_d
    invoke-static {v2}, La/f7u;->g(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    iget v9, v14, Landroid/graphics/Rect;->left:I

    .line 455
    .line 456
    add-int/2addr v8, v9

    .line 457
    iget v9, v14, Landroid/graphics/Rect;->right:I

    .line 458
    .line 459
    add-int/2addr v8, v9

    .line 460
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    sub-int/2addr v5, v6

    .line 469
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 470
    .line 471
    sub-int/2addr v5, v6

    .line 472
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 473
    .line 474
    sub-int/2addr v5, v6

    .line 475
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    sub-int/2addr v5, v6

    .line 480
    sub-int/2addr v5, v8

    .line 481
    if-ge v5, v8, :cond_e

    .line 482
    .line 483
    iget v6, v15, Landroid/graphics/Rect;->left:I

    .line 484
    .line 485
    add-int/2addr v6, v5

    .line 486
    iput v6, v15, Landroid/graphics/Rect;->left:I

    .line 487
    .line 488
    :cond_e
    :goto_8
    iget-object v5, v0, La/upm0;->b:La/jru;

    .line 489
    .line 490
    iget-object v5, v5, La/jru;->b:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v5, Landroid/graphics/Rect;

    .line 493
    .line 494
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    if-eqz v6, :cond_10

    .line 502
    .line 503
    iget-object v6, v6, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 504
    .line 505
    if-eqz v6, :cond_10

    .line 506
    .line 507
    iget-boolean v6, v6, Landroidx/recyclerview/widget/RecyclerView;->h:Z

    .line 508
    .line 509
    if-eqz v6, :cond_10

    .line 510
    .line 511
    invoke-static {v5, v13}, La/sek;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 512
    .line 513
    .line 514
    invoke-static {v2}, La/htz;->d(Landroidx/recyclerview/widget/RecyclerView;)I

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    const/4 v10, 0x1

    .line 519
    if-ne v6, v10, :cond_f

    .line 520
    .line 521
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 530
    .line 531
    .line 532
    move-result v9

    .line 533
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 534
    .line 535
    .line 536
    move-result v10

    .line 537
    sub-int/2addr v9, v10

    .line 538
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 539
    .line 540
    sub-int/2addr v9, v10

    .line 541
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    sub-int/2addr v10, v11

    .line 550
    invoke-virtual {v5, v6, v8, v9, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 551
    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_f
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 555
    .line 556
    .line 557
    move-result v6

    .line 558
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 563
    .line 564
    .line 565
    move-result v9

    .line 566
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    sub-int/2addr v9, v10

    .line 571
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 572
    .line 573
    .line 574
    move-result v10

    .line 575
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    sub-int/2addr v10, v11

    .line 580
    iget v11, v5, Landroid/graphics/Rect;->bottom:I

    .line 581
    .line 582
    sub-int/2addr v10, v11

    .line 583
    invoke-virtual {v5, v6, v8, v9, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 584
    .line 585
    .line 586
    :goto_9
    invoke-virtual {v1, v5}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 587
    .line 588
    .line 589
    :cond_10
    iget v5, v15, Landroid/graphics/Rect;->left:I

    .line 590
    .line 591
    int-to-float v5, v5

    .line 592
    iget v6, v15, Landroid/graphics/Rect;->top:I

    .line 593
    .line 594
    int-to-float v6, v6

    .line 595
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v13, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 602
    .line 603
    .line 604
    :goto_a
    add-int/lit8 v7, v7, 0x1

    .line 605
    .line 606
    move/from16 v5, v17

    .line 607
    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :cond_11
    :goto_b
    return-void
.end method
